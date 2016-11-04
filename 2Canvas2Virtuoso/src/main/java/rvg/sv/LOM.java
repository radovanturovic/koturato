

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for LOM ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#LOM)</p>
 * <br>
 * <br>
 * <br>
 */
public interface LOM extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#LOM");
	

	/**
	 * The Jena Property for lomEducational 
	 * <p>(URI: http://sots.rvg/lom.owl#lomEducational)</p>
	 * <br>  
	 */
	public static Property lomEducationalProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomEducational");


	/**
	 * The Jena Property for lomLifeCycle 
	 * <p>(URI: http://sots.rvg/lom.owl#lomLifeCycle)</p>
	 * <br>  
	 */
	public static Property lomLifeCycleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomLifeCycle");


	/**
	 * The Jena Property for lomClassification 
	 * <p>(URI: http://sots.rvg/lom.owl#lomClassification)</p>
	 * <br>  
	 */
	public static Property lomClassificationProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomClassification");


	/**
	 * The Jena Property for lomGeneral 
	 * <p>(URI: http://sots.rvg/lom.owl#lomGeneral)</p>
	 * <br>  
	 */
	public static Property lomGeneralProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomGeneral");


	/**
	 * The Jena Property for lomMetaMetadata 
	 * <p>(URI: http://sots.rvg/lom.owl#lomMetaMetadata)</p>
	 * <br>  
	 */
	public static Property lomMetaMetadataProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomMetaMetadata");


	/**
	 * The Jena Property for lomTechnical 
	 * <p>(URI: http://sots.rvg/lom.owl#lomTechnical)</p>
	 * <br>  
	 */
	public static Property lomTechnicalProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomTechnical");




	/**
	 * Get an Iterator the 'lomEducational' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.Educational}
	 * @see			#lomEducationalProperty
	 */
	public java.util.Iterator getLomEducational() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lomEducational' property
	 * @param		The {@link rvg.sv.Educational} to add
	 * @see			#lomEducationalProperty
	 */
	public void addLomEducational(rvg.sv.Educational lomEducational) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lomEducational' property
	 * @return		The anoymous {@link rvg.sv.Educational} created
	 * @see			#lomEducationalProperty
	 */
	public rvg.sv.Educational addLomEducational() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Educational.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lomEducationalProperty
	 */
	public rvg.sv.Educational addLomEducational(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lomEducational' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.Educational} to remove
	 * @see			#lomEducationalProperty
	 */
	public void removeLomEducational(rvg.sv.Educational lomEducational) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lomLifeCycle' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LifeCycle}
	 * @see			#lomLifeCycleProperty
	 */
	public java.util.Iterator getLomLifeCycle() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lomLifeCycle' property
	 * @param		The {@link rvg.sv.LifeCycle} to add
	 * @see			#lomLifeCycleProperty
	 */
	public void addLomLifeCycle(rvg.sv.LifeCycle lomLifeCycle) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lomLifeCycle' property
	 * @return		The anoymous {@link rvg.sv.LifeCycle} created
	 * @see			#lomLifeCycleProperty
	 */
	public rvg.sv.LifeCycle addLomLifeCycle() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LifeCycle.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lomLifeCycleProperty
	 */
	public rvg.sv.LifeCycle addLomLifeCycle(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lomLifeCycle' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LifeCycle} to remove
	 * @see			#lomLifeCycleProperty
	 */
	public void removeLomLifeCycle(rvg.sv.LifeCycle lomLifeCycle) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lomClassification' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.Classification}
	 * @see			#lomClassificationProperty
	 */
	public java.util.Iterator getLomClassification() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lomClassification' property
	 * @param		The {@link rvg.sv.Classification} to add
	 * @see			#lomClassificationProperty
	 */
	public void addLomClassification(rvg.sv.Classification lomClassification) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lomClassification' property
	 * @return		The anoymous {@link rvg.sv.Classification} created
	 * @see			#lomClassificationProperty
	 */
	public rvg.sv.Classification addLomClassification() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Classification.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lomClassificationProperty
	 */
	public rvg.sv.Classification addLomClassification(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lomClassification' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.Classification} to remove
	 * @see			#lomClassificationProperty
	 */
	public void removeLomClassification(rvg.sv.Classification lomClassification) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lomGeneral' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.General}
	 * @see			#lomGeneralProperty
	 */
	public java.util.Iterator getLomGeneral() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lomGeneral' property
	 * @param		The {@link rvg.sv.General} to add
	 * @see			#lomGeneralProperty
	 */
	public void addLomGeneral(rvg.sv.General lomGeneral) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lomGeneral' property
	 * @return		The anoymous {@link rvg.sv.General} created
	 * @see			#lomGeneralProperty
	 */
	public rvg.sv.General addLomGeneral() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#General.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lomGeneralProperty
	 */
	public rvg.sv.General addLomGeneral(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lomGeneral' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.General} to remove
	 * @see			#lomGeneralProperty
	 */
	public void removeLomGeneral(rvg.sv.General lomGeneral) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lomMetaMetadata' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.Meta_DASH_Metadata}
	 * @see			#lomMetaMetadataProperty
	 */
	public java.util.Iterator getLomMetaMetadata() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lomMetaMetadata' property
	 * @param		The {@link rvg.sv.Meta_DASH_Metadata} to add
	 * @see			#lomMetaMetadataProperty
	 */
	public void addLomMetaMetadata(rvg.sv.Meta_DASH_Metadata lomMetaMetadata) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lomMetaMetadata' property
	 * @return		The anoymous {@link rvg.sv.Meta_DASH_Metadata} created
	 * @see			#lomMetaMetadataProperty
	 */
	public rvg.sv.Meta_DASH_Metadata addLomMetaMetadata() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Meta-Metadata.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lomMetaMetadataProperty
	 */
	public rvg.sv.Meta_DASH_Metadata addLomMetaMetadata(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lomMetaMetadata' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.Meta_DASH_Metadata} to remove
	 * @see			#lomMetaMetadataProperty
	 */
	public void removeLomMetaMetadata(rvg.sv.Meta_DASH_Metadata lomMetaMetadata) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lomTechnical' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.Technical}
	 * @see			#lomTechnicalProperty
	 */
	public java.util.Iterator getLomTechnical() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lomTechnical' property
	 * @param		The {@link rvg.sv.Technical} to add
	 * @see			#lomTechnicalProperty
	 */
	public void addLomTechnical(rvg.sv.Technical lomTechnical) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lomTechnical' property
	 * @return		The anoymous {@link rvg.sv.Technical} created
	 * @see			#lomTechnicalProperty
	 */
	public rvg.sv.Technical addLomTechnical() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Technical.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lomTechnicalProperty
	 */
	public rvg.sv.Technical addLomTechnical(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lomTechnical' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.Technical} to remove
	 * @see			#lomTechnicalProperty
	 */
	public void removeLomTechnical(rvg.sv.Technical lomTechnical) throws com.ibm.adtech.jastor.JastorException;
		
}