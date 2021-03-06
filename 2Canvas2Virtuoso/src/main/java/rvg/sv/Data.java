

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Data ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Data)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Data extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Data");
	



}