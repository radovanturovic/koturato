

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for LangString ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#LangString)</p>
 * <br>
 * <br>
 * <br>
 */
public interface LangString extends Data, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#LangString");
	

	/**
	 * The Jena Property for dat_DOT_las_DOT_language 
	 * <p>(URI: http://sots.rvg/lom.owl#dat.las.language)</p>
	 * <br>  
	 */
	public static Property dat_DOT_las_DOT_languageProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.las.language");


	/**
	 * The Jena Property for dat_DOT_las_DOT_string 
	 * <p>(URI: http://sots.rvg/lom.owl#dat.las.string)</p>
	 * <br>  
	 */
	public static Property dat_DOT_las_DOT_stringProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.las.string");




	/**
	 * Iterates through the 'dat_DOT_las_DOT_language' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#dat_DOT_las_DOT_languageProperty
	 */
	public java.util.Iterator getDat_DOT_las_DOT_language() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dat_DOT_las_DOT_language' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dat_DOT_las_DOT_languageProperty
	 */
	public void addDat_DOT_las_DOT_language(String dat_DOT_las_DOT_language) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dat_DOT_las_DOT_language' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dat_DOT_las_DOT_languageProperty
	 */
	public void removeDat_DOT_las_DOT_language(String dat_DOT_las_DOT_language) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'dat_DOT_las_DOT_string' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#dat_DOT_las_DOT_stringProperty
	 */
	public java.util.Iterator getDat_DOT_las_DOT_string() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dat_DOT_las_DOT_string' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dat_DOT_las_DOT_stringProperty
	 */
	public void addDat_DOT_las_DOT_string(String dat_DOT_las_DOT_string) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dat_DOT_las_DOT_string' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dat_DOT_las_DOT_stringProperty
	 */
	public void removeDat_DOT_las_DOT_string(String dat_DOT_las_DOT_string) throws com.ibm.adtech.jastor.JastorException;

}