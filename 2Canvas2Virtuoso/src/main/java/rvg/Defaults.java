package rvg;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import rvg.sots.AttachmentsEntity;
import rvg.sots.AttachmentsFrontEntity;
import virtuoso.jena.driver.VirtModel;

import java.io.*;
import java.util.Properties;

/**
 * Created by charmingc0d3r on 7.11.16..
 */
public class Defaults {

    static final String PREFIX = "http://test.sots.sv.gvr/";
    static final int PREFIX_LENGTH = PREFIX.length();

    private static VirtModel vm = null;
    public static Properties props22 = null;

    public static Properties getProps22() {
        if (props22==null) {
            props22 = new Properties();
            try {
                props22.load(new FileInputStream("2Canvas2Virtuoso.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return props22;
    }
    public static VirtModel getVirtuosoModel() {
        if (vm!=null)
            return vm;
        Model model = ModelFactory.createDefaultModel();
        VirtModel vmodel = VirtModel.openDatabaseModel(PREFIX,"localhost:1111","dba","dba");
        vmodel.add(model);
        vm = vmodel;
        return vm;
    }
    //public static String getFullId(Long id) { return getFullId(id.toString());}
    public static String getFullId(String id) {
        return PREFIX + id;
    }

    public static String substringID(String uri, String miniPrefix) {
        return uri.substring(PREFIX_LENGTH+miniPrefix.length());
    }
    public static Long parseID(String uri, String miniPrefix) {
        return Long.parseLong(substringID(uri,miniPrefix));
    }
    public static String getFullPath(AttachmentsEntity learningObject) {
        return Defaults.getProps22().getProperty("canvasAttachmentsPath")+"/"+String.format("%04d", learningObject.getId())+"/"+learningObject.getFilename();
    }
    public static String getFullPath(AttachmentsFrontEntity learningObject) {
        return getFullPath(learningObject.getCore());
    }
}
