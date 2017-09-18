package rvg.sots;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import rvg.Interchange;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by charmingc0d3r on 23.11.16..
 */
@XmlRootElement
public class AttachmentsFrontEntity{
    private AttachmentsEntity core;
    private ArrayList<String> competencies = new ArrayList<String>();
    private String attachmentType;

    public AttachmentsEntity getCore() {
        return core;
    }

    public void setCore(AttachmentsEntity core) {
        this.core = core;
    }

    public ArrayList<String> getCompetencies() {
        return competencies;
    }

    public void setCompetencies(ArrayList<String> competencies) {
        this.competencies = competencies;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public void addCompetency(String competency) {
        competencies.add(competency);
    }

    @Override
    public String toString() {
        return "AttachmentsFrontEntity{" +
                "core=" + core +
                ", competencies=" + competencies +
                ", attachmentType='" + attachmentType + '\'' +
                '}';
    }

    public static AttachmentsFrontEntity getById(Long id) {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        AttachmentsFrontEntity result = new AttachmentsFrontEntity();
        Query query = session.createQuery("from AttachmentsEntity");
        java.util.List<AttachmentsEntity> list = query.list();

        for (AttachmentsEntity o: list
                ) {
            if (o.getId()==id) {
                result.setCore(o);
                break;
            }
        }
        session.close();
        factory.close();
        result = Interchange.LearningObjectVirtuosoToPostgresFront(
                Interchange.LearningObjectPostgresToVirtuoso(result)
        );
        return result;
    }


    public static void loadById(AttachmentsFrontEntity entity, Long id) {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();
        AttachmentsEntity ae = new AttachmentsEntity();
        // creating session object
        Session session = factory.openSession();
        session.load(ae,id);
        entity.setCore(ae);
        session.close();
        factory.close();
    }

    public static ArrayList<AttachmentsFrontEntity> getAll() {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        ArrayList<AttachmentsFrontEntity> result = new ArrayList<AttachmentsFrontEntity>();
        Query query = session.createQuery("from AttachmentsEntity");
        java.util.List<AttachmentsEntity> list = query.list();
        session.close();
        factory.close();
        for (AttachmentsEntity o: list) {
            result.add(Interchange.LearningObjectVirtuosoToPostgresFront(
                    Interchange.LearningObjectPostgresToVirtuoso(o)
            ));
        }
        return result;
    }

    public static ArrayList<String> getAllCompetencies() {
        throw new NotImplementedException();
    }
}
