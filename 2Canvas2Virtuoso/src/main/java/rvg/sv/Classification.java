

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Classification ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Classification)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Classification extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Classification");
	

	/**
	 * The Jena Property for classificationCTaxonPath 
	 * <p>(URI: http://sots.rvg/lom.owl#classificationCTaxonPath)</p>
	 * <br>  
	 */
	public static Property classificationCTaxonPathProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#classificationCTaxonPath");


	/**
	 * The Jena Property for classificationPurpose 
	 * <p>(URI: http://sots.rvg/lom.owl#classificationPurpose)</p>
	 * <br>  
	 */
	public static Property classificationPurposeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#classificationPurpose");




	/**
	 * Get an Iterator the 'classificationCTaxonPath' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.CTaxonCollection}
	 * @see			#classificationCTaxonPathProperty
	 */
	public java.util.Iterator getClassificationCTaxonPath() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'classificationCTaxonPath' property
	 * @param		The {@link rvg.sv.CTaxonCollection} to add
	 * @see			#classificationCTaxonPathProperty
	 */
	public void addClassificationCTaxonPath(rvg.sv.CTaxonCollection classificationCTaxonPath) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'classificationCTaxonPath' property
	 * @return		The anoymous {@link rvg.sv.CTaxonCollection} created
	 * @see			#classificationCTaxonPathProperty
	 */
	public rvg.sv.CTaxonCollection addClassificationCTaxonPath() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#CTaxonCollection.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#classificationCTaxonPathProperty
	 */
	public rvg.sv.CTaxonCollection addClassificationCTaxonPath(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'classificationCTaxonPath' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.CTaxonCollection} to remove
	 * @see			#classificationCTaxonPathProperty
	 */
	public void removeClassificationCTaxonPath(rvg.sv.CTaxonCollection classificationCTaxonPath) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'classificationPurpose' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link Vocabulary}
	 * @see			#classificationPurposeProperty
	 */
	public java.util.Iterator getClassificationPurpose() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'classificationPurpose' property
	 * @param		The {@link Vocabulary} to add
	 * @see			#classificationPurposeProperty
	 */
	public void addClassificationPurpose(Vocabulary classificationPurpose) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'classificationPurpose' property
	 * @return		The anoymous {@link Vocabulary} created
	 * @see			#classificationPurposeProperty
	 */
	public Vocabulary addClassificationPurpose() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Vocabulary.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#classificationPurposeProperty
	 */
	public Vocabulary addClassificationPurpose(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'classificationPurpose' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link Vocabulary} to remove
	 * @see			#classificationPurposeProperty
	 */
	public void removeClassificationPurpose(Vocabulary classificationPurpose) throws com.ibm.adtech.jastor.JastorException;
		
}