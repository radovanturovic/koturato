

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for General ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#General)</p>
 * <br>
 * <br>
 * <br>
 */
public interface General extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#General");
	

	/**
	 * The Jena Property for generalDescription 
	 * <p>(URI: http://sots.rvg/lom.owl#generalDescription)</p>
	 * <br>  
	 */
	public static Property generalDescriptionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalDescription");


	/**
	 * The Jena Property for generalTitle 
	 * <p>(URI: http://sots.rvg/lom.owl#generalTitle)</p>
	 * <br>  
	 */
	public static Property generalTitleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalTitle");


	/**
	 * The Jena Property for gen_DOT_language 
	 * <p>(URI: http://sots.rvg/lom.owl#gen.language)</p>
	 * <br>  
	 */
	public static Property gen_DOT_languageProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#gen.language");


	/**
	 * The Jena Property for generalKeyword 
	 * <p>(URI: http://sots.rvg/lom.owl#generalKeyword)</p>
	 * <br>  
	 */
	public static Property generalKeywordProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalKeyword");


	/**
	 * The Jena Property for generalAggregationLevel 
	 * <p>(URI: http://sots.rvg/lom.owl#generalAggregationLevel)</p>
	 * <br>  
	 */
	public static Property generalAggregationLevelProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalAggregationLevel");


	/**
	 * The Jena Property for generalIdentifier 
	 * <p>(URI: http://sots.rvg/lom.owl#generalIdentifier)</p>
	 * <br>  
	 */
	public static Property generalIdentifierProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalIdentifier");


	/**
	 * The Jena Property for generalCoverage 
	 * <p>(URI: http://sots.rvg/lom.owl#generalCoverage)</p>
	 * <br>  
	 */
	public static Property generalCoverageProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalCoverage");


	/**
	 * The Jena Property for generalStructure 
	 * <p>(URI: http://sots.rvg/lom.owl#generalStructure)</p>
	 * <br>  
	 */
	public static Property generalStructureProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalStructure");




	/**
	 * Get an Iterator the 'generalDescription' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#generalDescriptionProperty
	 */
	public java.util.Iterator getGeneralDescription() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalDescription' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#generalDescriptionProperty
	 */
	public void addGeneralDescription(rvg.sv.LangString generalDescription) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalDescription' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#generalDescriptionProperty
	 */
	public rvg.sv.LangString addGeneralDescription() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalDescriptionProperty
	 */
	public rvg.sv.LangString addGeneralDescription(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalDescription' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#generalDescriptionProperty
	 */
	public void removeGeneralDescription(rvg.sv.LangString generalDescription) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'generalTitle' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#generalTitleProperty
	 */
	public java.util.Iterator getGeneralTitle() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalTitle' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#generalTitleProperty
	 */
	public void addGeneralTitle(rvg.sv.LangString generalTitle) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalTitle' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#generalTitleProperty
	 */
	public rvg.sv.LangString addGeneralTitle() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalTitleProperty
	 */
	public rvg.sv.LangString addGeneralTitle(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalTitle' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#generalTitleProperty
	 */
	public void removeGeneralTitle(rvg.sv.LangString generalTitle) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'gen_DOT_language' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#gen_DOT_languageProperty
	 */
	public java.util.Iterator getGen_DOT_language() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'gen_DOT_language' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#gen_DOT_languageProperty
	 */
	public void addGen_DOT_language(String gen_DOT_language) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'gen_DOT_language' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#gen_DOT_languageProperty
	 */
	public void removeGen_DOT_language(String gen_DOT_language) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'generalKeyword' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#generalKeywordProperty
	 */
	public java.util.Iterator getGeneralKeyword() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalKeyword' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#generalKeywordProperty
	 */
	public void addGeneralKeyword(rvg.sv.LangString generalKeyword) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalKeyword' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#generalKeywordProperty
	 */
	public rvg.sv.LangString addGeneralKeyword() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalKeywordProperty
	 */
	public rvg.sv.LangString addGeneralKeyword(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalKeyword' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#generalKeywordProperty
	 */
	public void removeGeneralKeyword(rvg.sv.LangString generalKeyword) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'generalAggregationLevel' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.Vocabulary}
	 * @see			#generalAggregationLevelProperty
	 */
	public java.util.Iterator getGeneralAggregationLevel() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalAggregationLevel' property
	 * @param		The {@link rvg.sv.Vocabulary} to add
	 * @see			#generalAggregationLevelProperty
	 */
	public void addGeneralAggregationLevel(rvg.sv.Vocabulary generalAggregationLevel) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalAggregationLevel' property
	 * @return		The anoymous {@link rvg.sv.Vocabulary} created
	 * @see			#generalAggregationLevelProperty
	 */
	public rvg.sv.Vocabulary addGeneralAggregationLevel() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Vocabulary.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalAggregationLevelProperty
	 */
	public rvg.sv.Vocabulary addGeneralAggregationLevel(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalAggregationLevel' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.Vocabulary} to remove
	 * @see			#generalAggregationLevelProperty
	 */
	public void removeGeneralAggregationLevel(rvg.sv.Vocabulary generalAggregationLevel) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'generalIdentifier' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.GIdentifier}
	 * @see			#generalIdentifierProperty
	 */
	public java.util.Iterator getGeneralIdentifier() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalIdentifier' property
	 * @param		The {@link rvg.sv.GIdentifier} to add
	 * @see			#generalIdentifierProperty
	 */
	public void addGeneralIdentifier(rvg.sv.GIdentifier generalIdentifier) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalIdentifier' property
	 * @return		The anoymous {@link rvg.sv.GIdentifier} created
	 * @see			#generalIdentifierProperty
	 */
	public rvg.sv.GIdentifier addGeneralIdentifier() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#GIdentifier.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalIdentifierProperty
	 */
	public rvg.sv.GIdentifier addGeneralIdentifier(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalIdentifier' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.GIdentifier} to remove
	 * @see			#generalIdentifierProperty
	 */
	public void removeGeneralIdentifier(rvg.sv.GIdentifier generalIdentifier) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'generalCoverage' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#generalCoverageProperty
	 */
	public java.util.Iterator getGeneralCoverage() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalCoverage' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#generalCoverageProperty
	 */
	public void addGeneralCoverage(rvg.sv.LangString generalCoverage) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalCoverage' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#generalCoverageProperty
	 */
	public rvg.sv.LangString addGeneralCoverage() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalCoverageProperty
	 */
	public rvg.sv.LangString addGeneralCoverage(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalCoverage' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#generalCoverageProperty
	 */
	public void removeGeneralCoverage(rvg.sv.LangString generalCoverage) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'generalStructure' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.Vocabulary}
	 * @see			#generalStructureProperty
	 */
	public java.util.Iterator getGeneralStructure() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'generalStructure' property
	 * @param		The {@link rvg.sv.Vocabulary} to add
	 * @see			#generalStructureProperty
	 */
	public void addGeneralStructure(rvg.sv.Vocabulary generalStructure) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'generalStructure' property
	 * @return		The anoymous {@link rvg.sv.Vocabulary} created
	 * @see			#generalStructureProperty
	 */
	public rvg.sv.Vocabulary addGeneralStructure() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Vocabulary.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#generalStructureProperty
	 */
	public rvg.sv.Vocabulary addGeneralStructure(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'generalStructure' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.Vocabulary} to remove
	 * @see			#generalStructureProperty
	 */
	public void removeGeneralStructure(rvg.sv.Vocabulary generalStructure) throws com.ibm.adtech.jastor.JastorException;
		
}