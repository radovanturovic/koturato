

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for MContribute ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#MContribute)</p>
 * <br>
 * <br>
 * <br>
 */
public interface MContribute extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#MContribute");
	

	/**
	 * The Jena Property for mContributeDate 
	 * <p>(URI: http://sots.rvg/lom.owl#mContributeDate)</p>
	 * <br>  
	 */
	public static Property mContributeDateProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#mContributeDate");


	/**
	 * The Jena Property for mContributeRole 
	 * <p>(URI: http://sots.rvg/lom.owl#mContributeRole)</p>
	 * <br>  
	 */
	public static Property mContributeRoleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#mContributeRole");


	/**
	 * The Jena Property for mme_DOT_con_DOT_entity 
	 * <p>(URI: http://sots.rvg/lom.owl#mme.con.entity)</p>
	 * <br>  
	 */
	public static Property mme_DOT_con_DOT_entityProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#mme.con.entity");




	/**
	 * Get an Iterator the 'mContributeDate' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link DateTime}
	 * @see			#mContributeDateProperty
	 */
	public java.util.Iterator getMContributeDate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'mContributeDate' property
	 * @param		The {@link DateTime} to add
	 * @see			#mContributeDateProperty
	 */
	public void addMContributeDate(DateTime mContributeDate) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'mContributeDate' property
	 * @return		The anoymous {@link DateTime} created
	 * @see			#mContributeDateProperty
	 */
	public DateTime addMContributeDate() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#DateTime.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#mContributeDateProperty
	 */
	public DateTime addMContributeDate(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'mContributeDate' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link DateTime} to remove
	 * @see			#mContributeDateProperty
	 */
	public void removeMContributeDate(DateTime mContributeDate) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'mContributeRole' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link Vocabulary}
	 * @see			#mContributeRoleProperty
	 */
	public java.util.Iterator getMContributeRole() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'mContributeRole' property
	 * @param		The {@link Vocabulary} to add
	 * @see			#mContributeRoleProperty
	 */
	public void addMContributeRole(Vocabulary mContributeRole) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'mContributeRole' property
	 * @return		The anoymous {@link Vocabulary} created
	 * @see			#mContributeRoleProperty
	 */
	public Vocabulary addMContributeRole() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Vocabulary.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#mContributeRoleProperty
	 */
	public Vocabulary addMContributeRole(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'mContributeRole' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link Vocabulary} to remove
	 * @see			#mContributeRoleProperty
	 */
	public void removeMContributeRole(Vocabulary mContributeRole) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'mme_DOT_con_DOT_entity' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#mme_DOT_con_DOT_entityProperty
	 */
	public java.util.Iterator getMme_DOT_con_DOT_entity() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'mme_DOT_con_DOT_entity' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#mme_DOT_con_DOT_entityProperty
	 */
	public void addMme_DOT_con_DOT_entity(String mme_DOT_con_DOT_entity) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'mme_DOT_con_DOT_entity' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#mme_DOT_con_DOT_entityProperty
	 */
	public void removeMme_DOT_con_DOT_entity(String mme_DOT_con_DOT_entity) throws com.ibm.adtech.jastor.JastorException;

}