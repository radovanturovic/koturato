

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Vocabulary ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Vocabulary)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Vocabulary extends Data, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Vocabulary");
	

	/**
	 * The Jena Property for dat_DOT_voc_DOT_source 
	 * <p>(URI: http://sots.rvg/lom.owl#dat.voc.source)</p>
	 * <br>  
	 */
	public static Property dat_DOT_voc_DOT_sourceProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.voc.source");


	/**
	 * The Jena Property for dat_DOT_voc_DOT_value 
	 * <p>(URI: http://sots.rvg/lom.owl#dat.voc.value)</p>
	 * <br>  
	 */
	public static Property dat_DOT_voc_DOT_valueProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.voc.value");




	/**
	 * Iterates through the 'dat_DOT_voc_DOT_source' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#dat_DOT_voc_DOT_sourceProperty
	 */
	public java.util.Iterator getDat_DOT_voc_DOT_source() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dat_DOT_voc_DOT_source' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dat_DOT_voc_DOT_sourceProperty
	 */
	public void addDat_DOT_voc_DOT_source(String dat_DOT_voc_DOT_source) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dat_DOT_voc_DOT_source' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dat_DOT_voc_DOT_sourceProperty
	 */
	public void removeDat_DOT_voc_DOT_source(String dat_DOT_voc_DOT_source) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'dat_DOT_voc_DOT_value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#dat_DOT_voc_DOT_valueProperty
	 */
	public java.util.Iterator getDat_DOT_voc_DOT_value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dat_DOT_voc_DOT_value' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dat_DOT_voc_DOT_valueProperty
	 */
	public void addDat_DOT_voc_DOT_value(String dat_DOT_voc_DOT_value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dat_DOT_voc_DOT_value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dat_DOT_voc_DOT_valueProperty
	 */
	public void removeDat_DOT_voc_DOT_value(String dat_DOT_voc_DOT_value) throws com.ibm.adtech.jastor.JastorException;

}