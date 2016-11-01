

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Educational ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Educational)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Educational extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Educational");
	

	/**
	 * The Jena Property for educationalLearningResourceType 
	 * <p>(URI: http://sots.rvg/lom.owl#educationalLearningResourceType)</p>
	 * <br>  
	 */
	public static Property educationalLearningResourceTypeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#educationalLearningResourceType");




	/**
	 * Get an Iterator the 'educationalLearningResourceType' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link LangString}
	 * @see			#educationalLearningResourceTypeProperty
	 */
	public java.util.Iterator getEducationalLearningResourceType() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'educationalLearningResourceType' property
	 * @param		The {@link LangString} to add
	 * @see			#educationalLearningResourceTypeProperty
	 */
	public void addEducationalLearningResourceType(LangString educationalLearningResourceType) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'educationalLearningResourceType' property
	 * @return		The anoymous {@link LangString} created
	 * @see			#educationalLearningResourceTypeProperty
	 */
	public LangString addEducationalLearningResourceType() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#educationalLearningResourceTypeProperty
	 */
	public LangString addEducationalLearningResourceType(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'educationalLearningResourceType' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link LangString} to remove
	 * @see			#educationalLearningResourceTypeProperty
	 */
	public void removeEducationalLearningResourceType(LangString educationalLearningResourceType) throws com.ibm.adtech.jastor.JastorException;
		
}