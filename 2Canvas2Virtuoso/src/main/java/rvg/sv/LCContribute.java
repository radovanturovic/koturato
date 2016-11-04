

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for LCContribute ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#LCContribute)</p>
 * <br>
 * <br>
 * <br>
 */
public interface LCContribute extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#LCContribute");
	

	/**
	 * The Jena Property for lcContributeRole 
	 * <p>(URI: http://sots.rvg/lom.owl#lcContributeRole)</p>
	 * <br>  
	 */
	public static Property lcContributeRoleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lcContributeRole");


	/**
	 * The Jena Property for lcContributeDate 
	 * <p>(URI: http://sots.rvg/lom.owl#lcContributeDate)</p>
	 * <br>  
	 */
	public static Property lcContributeDateProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lcContributeDate");


	/**
	 * The Jena Property for lif_DOT_con_DOT_entity 
	 * <p>(URI: http://sots.rvg/lom.owl#lif.con.entity)</p>
	 * <br>  
	 */
	public static Property lif_DOT_con_DOT_entityProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lif.con.entity");




	/**
	 * Get an Iterator the 'lcContributeRole' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link Vocabulary}
	 * @see			#lcContributeRoleProperty
	 */
	public java.util.Iterator getLcContributeRole() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lcContributeRole' property
	 * @param		The {@link Vocabulary} to add
	 * @see			#lcContributeRoleProperty
	 */
	public void addLcContributeRole(Vocabulary lcContributeRole) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lcContributeRole' property
	 * @return		The anoymous {@link Vocabulary} created
	 * @see			#lcContributeRoleProperty
	 */
	public Vocabulary addLcContributeRole() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#Vocabulary.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lcContributeRoleProperty
	 */
	public Vocabulary addLcContributeRole(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lcContributeRole' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link Vocabulary} to remove
	 * @see			#lcContributeRoleProperty
	 */
	public void removeLcContributeRole(Vocabulary lcContributeRole) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lcContributeDate' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link DateTime}
	 * @see			#lcContributeDateProperty
	 */
	public java.util.Iterator getLcContributeDate() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lcContributeDate' property
	 * @param		The {@link DateTime} to add
	 * @see			#lcContributeDateProperty
	 */
	public void addLcContributeDate(DateTime lcContributeDate) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lcContributeDate' property
	 * @return		The anoymous {@link DateTime} created
	 * @see			#lcContributeDateProperty
	 */
	public DateTime addLcContributeDate() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#DateTime.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lcContributeDateProperty
	 */
	public DateTime addLcContributeDate(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lcContributeDate' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link DateTime} to remove
	 * @see			#lcContributeDateProperty
	 */
	public void removeLcContributeDate(DateTime lcContributeDate) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'lif_DOT_con_DOT_entity' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#lif_DOT_con_DOT_entityProperty
	 */
	public java.util.Iterator getLif_DOT_con_DOT_entity() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'lif_DOT_con_DOT_entity' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#lif_DOT_con_DOT_entityProperty
	 */
	public void addLif_DOT_con_DOT_entity(String lif_DOT_con_DOT_entity) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'lif_DOT_con_DOT_entity' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#lif_DOT_con_DOT_entityProperty
	 */
	public void removeLif_DOT_con_DOT_entity(String lif_DOT_con_DOT_entity) throws com.ibm.adtech.jastor.JastorException;

}