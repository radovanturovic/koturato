package rvg;

import rvg.sots.AttachmentsEntity;
import rvg.sots.AttachmentsFrontEntity;
import rvg.sots.CoursesEntity;
import rvg.sv.*;
import virtuoso.jena.driver.VirtModel;

import java.util.Iterator;

/**
 * Created by charmingc0d3r on 6.11.16..
 */
public class Interchange {
    public static CoursesEntity CourseVirtuosoToPostgres(Course course) {
        CoursesEntity result = CoursesEntity.getById(Defaults.parseID(course.resource().getURI(),"cs"));
        return result;
    }
    public static Course CoursePostgresToVirtuoso(CoursesEntity course) {
        Course result = lom_DOT_owlFactory.createCourse(Defaults.getFullId("cs"+course.getId()),Defaults.getVirtuosoModel());
        result.addCrs_DOT_name(course.getName());
        return result;
    }
    public static AttachmentsEntity LearningObjectVirtuosoToPostgres(LOM learningObject) {
        AttachmentsEntity result = AttachmentsEntity.getById(Defaults.parseID(learningObject.resource().getURI(),"lom"));
        return result;
    }
    public static AttachmentsFrontEntity LearningObjectVirtuosoToPostgresFront(LOM learningObject) {
        AttachmentsFrontEntity result = new AttachmentsFrontEntity();

        /*
        * Popunjavanje podataka koji se nalaze u PG bazi.
        */
        AttachmentsEntity resultae = new AttachmentsEntity();
        AttachmentsEntity.loadById(resultae,Defaults.parseID(learningObject.resource().getURI(),"lom"));
        result.setCore(resultae);

        /*
        * Dodela tipa resursa.
        */
        if (learningObject.getLomEducational().hasNext()) {
            Educational tEdu = (Educational) (learningObject.getLomEducational().next());
            if (tEdu.getEducationalLearningResourceType().hasNext()) {
                LangString tls = (LangString) (tEdu.getEducationalLearningResourceType().next());
                result.setAttachmentType(tls.getDat_DOT_las_DOT_string().next().toString());
            }
        }

        /*
        * Dodela kompetencija.
        */
        if (learningObject.getLomClassification().hasNext()) {
            Classification tclassification = (Classification) (learningObject.getLomClassification().next());
            if (tclassification.getClassificationCTaxonPath().hasNext()) {
                CTaxonCollection tcTaxonCollection = (CTaxonCollection) (tclassification.getClassificationCTaxonPath().next());
                if (tcTaxonCollection.getCTaxonCollectionCTCTaxon().hasNext()) {
                    CTCTaxon tctcTaxon = (CTCTaxon) (tcTaxonCollection.getCTaxonCollectionCTCTaxon().next());
                    Iterator<LangString> iter = tctcTaxon.getCtcTaxonEntry();
                    LangString tls;
                    while (iter.hasNext()) {
                        tls = iter.next();
                        result.addCompetency(tls.getDat_DOT_las_DOT_string().next().toString());
                    }
                }
            }
        }

        return result;
    }
    public static LOM LearningObjectPostgresToVirtuoso(AttachmentsEntity learningObject) {
        Long id = learningObject.getId();
        VirtModel demode = Defaults.getVirtuosoModel();
        /*
        * Pravljenje korenskog cvora.
        */
        LOM result = lom_DOT_owlFactory.createLOM(Defaults.getFullId("lom"+id),demode);

        /*
        * Opsti podaci o resursu.
        * Jezik, naslov.
        */
        General general = lom_DOT_owlFactory.createGeneral(Defaults.getFullId("g"+id),demode);
        general.addGen_DOT_language("sr");
        LangString generalTitle = lom_DOT_owlFactory.createLangString(Defaults.getFullId("genTIT"+id),demode);
        generalTitle.addDat_DOT_las_DOT_language("sr");
        generalTitle.addDat_DOT_las_DOT_string(learningObject.getDisplayName());
        general.addGeneralTitle(generalTitle);
        //LangString generalDescription = lom_DOT_owlFactory.createLangString(Defaults.getFullId("genDES"+id),demode);
        //generalDescription.addDat_DOT_las_DOT_language("sr");
        //generalDescription.addDat_DOT_las_DOT_string(learningObject.get???());
        //general.addGeneralDescription(generalDescription);
        result.addLomGeneral(general);

        /*
        * Puna putanja do resursa.
        */
        Technical technical = lom_DOT_owlFactory.createTechnical(Defaults.getFullId("d"+id),demode);
        /* FIXME: 25.11.16. Ono sto se moze preuzeti iz osobina jeste putanja do svih resursa. Potrebno je dopuniti ovaj
        * deo koda da pogodi doslovnu punu putanju do resursa. Druga opcija je da se svaki put ova putanja izracuna po
        * potrebi da se ne bi puna putanja do datoteke cuvala u bazi podataka. */
        technical.addTec_DOT_location(Defaults.getProps22().getProperty("canvasAttachmentsPath")+"/"+String.format("%04d", id)+"/"+learningObject.getFilename());
        result.addLomTechnical(technical);

        return result;
    }
    public static LOM LearningObjectPostgresToVirtuoso(AttachmentsFrontEntity learningObject) {
        LOM result = LearningObjectPostgresToVirtuoso(learningObject.getCore());
        Long id = learningObject.getCore().getId();
        VirtModel demode = Defaults.getVirtuosoModel();

        /*
        * Odredjivanje tipa resursa. (prezentacija, tekst, slika, video, itd.)
        */
        Educational educational = lom_DOT_owlFactory.createEducational(Defaults.getFullId("e"+id),demode);
        LangString educationalResourceType = lom_DOT_owlFactory.createLangString(Defaults.getFullId("eduRET"+id),demode);
        educationalResourceType.addDat_DOT_las_DOT_language("sr");
        educationalResourceType.addDat_DOT_las_DOT_string(learningObject.getAttachmentType());
        educational.addEducationalLearningResourceType(educationalResourceType);
        result.addLomEducational(educational);

        /*
        * Dodela kompetencija resursu.
        */
        Classification classification = lom_DOT_owlFactory.createClassification(Defaults.getFullId("c"+id),demode);
        CTaxonCollection cTaxonCollection = lom_DOT_owlFactory.createCTaxonCollection(Defaults.getFullId("CTXC"+id),demode);
        CTCTaxon ctcTaxon = lom_DOT_owlFactory.createCTCTaxon(Defaults.getFullId("CTCTX"+id),demode);
        ctcTaxon.addCla_DOT_ctc_DOT_tax_DOT_id("kompetencije");
        for (String kompetencija :
                learningObject.getCompetencies()) {
            LangString lsk = lom_DOT_owlFactory.createLangString(Defaults.getFullId("sr."+kompetencija),demode);
            lsk.addDat_DOT_las_DOT_language("sr");
            lsk.addDat_DOT_las_DOT_string(kompetencija);
            ctcTaxon.addCtcTaxonEntry(lsk);
        }
        cTaxonCollection.addCTaxonCollectionCTCTaxon(ctcTaxon);
        classification.addClassificationCTaxonPath(cTaxonCollection);
        result.addLomClassification(classification);

        return result;
    }
}
