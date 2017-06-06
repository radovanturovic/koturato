import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.StmtIterator;
import rvg.sv.*;
import virtuoso.jena.driver.VirtModel;

import java.io.*;

/**
 * Created by charmingc0d3r on 21.10.16..
 */
public class TestVirtuosoDrajvera {

    static final String PREFIX = "http://test.sots.sv.gvr/";

    public static void main(String args[]) {
        Model model = ModelFactory.createDefaultModel();
        VirtModel vmodel = VirtModel.openDatabaseModel(PREFIX,"localhost:1111","dba","dba");
        vmodel.add(model);
// factories get or create resources as needed
        LOM lom = lom_DOT_owlFactory.createLOM(PREFIX + "lom01", vmodel);
        GIdentifier gi = lom_DOT_owlFactory.createGIdentifier(PREFIX + "gide01", vmodel);
        General g = lom_DOT_owlFactory.createGeneral(PREFIX+"general01", vmodel);
        g.addGeneralIdentifier(gi);
        lom.addLomGeneral(g);

// setters add or replace statements approperately
        gi.addGen_DOT_ide_DOT_catalog("lorem");
        gi.addGen_DOT_ide_DOT_entry("ipsum");
// getters to read statements from the model
        //System.out.println("These skis have " + pocketRockets.getCoreConstruction() + " core construction.");
        System.out.println("gi.getGen_DOT_ide_DOT_catalog() = " + gi.getGen_DOT_ide_DOT_catalog());
        System.out.println("gi.getGen_DOT_ide_DOT_entry() = " + gi.getGen_DOT_ide_DOT_entry());

// conviently registers listener
//        pocketRockets.registerListener(new SkiListener() {
//            public void manufacturerChanged(Ski source) {
//                System.out.println("Pocket Rocket Manufacturer changed to: " + source.getManufacturer());
//            }
//	...
//        });

// switch between Jastor Classes and Jena
        StmtIterator iter = gi.resource().listProperties();
        System.out.println("Lets look at all statements about these skis, even ones that are not part of our ontology: ");
        while(iter.hasNext()) {
            System.out.println("\t" + iter.nextStatement());
        }
    }

}