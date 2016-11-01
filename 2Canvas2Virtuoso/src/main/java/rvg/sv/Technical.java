

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Technical ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Technical)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Technical extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Technical");
	

	/**
	 * The Jena Property for tec_DOT_location 
	 * <p>(URI: http://sots.rvg/lom.owl#tec.location)</p>
	 * <br>  
	 */
	public static Property tec_DOT_locationProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#tec.location");




	/**
	 * Iterates through the 'tec_DOT_location' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#tec_DOT_locationProperty
	 */
	public java.util.Iterator getTec_DOT_location() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'tec_DOT_location' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#tec_DOT_locationProperty
	 */
	public void addTec_DOT_location(String tec_DOT_location) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'tec_DOT_location' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#tec_DOT_locationProperty
	 */
	public void removeTec_DOT_location(String tec_DOT_location) throws com.ibm.adtech.jastor.JastorException;

}