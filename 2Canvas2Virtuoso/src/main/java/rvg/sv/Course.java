

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Course ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Course)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Course extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Course");
	

	/**
	 * The Jena Property for courseLom 
	 * <p>(URI: http://sots.rvg/lom.owl#courseLom)</p>
	 * <br>  
	 */
	public static Property courseLomProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#courseLom");


	/**
	 * The Jena Property for crs_DOT_name 
	 * <p>(URI: http://sots.rvg/lom.owl#crs.name)</p>
	 * <br>  
	 */
	public static Property crs_DOT_nameProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#crs.name");




	/**
	 * Get an Iterator the 'courseLom' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link LOM}
	 * @see			#courseLomProperty
	 */
	public java.util.Iterator getCourseLom() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'courseLom' property
	 * @param		The {@link LOM} to add
	 * @see			#courseLomProperty
	 */
	public void addCourseLom(LOM courseLom) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'courseLom' property
	 * @return		The anoymous {@link LOM} created
	 * @see			#courseLomProperty
	 */
	public LOM addCourseLom() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LOM.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#courseLomProperty
	 */
	public LOM addCourseLom(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'courseLom' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link LOM} to remove
	 * @see			#courseLomProperty
	 */
	public void removeCourseLom(LOM courseLom) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'crs_DOT_name' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#crs_DOT_nameProperty
	 */
	public java.util.Iterator getCrs_DOT_name() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'crs_DOT_name' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#crs_DOT_nameProperty
	 */
	public void addCrs_DOT_name(String crs_DOT_name) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'crs_DOT_name' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#crs_DOT_nameProperty
	 */
	public void removeCrs_DOT_name(String crs_DOT_name) throws com.ibm.adtech.jastor.JastorException;

}