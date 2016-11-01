

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for DateTime ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#DateTime)</p>
 * <br>
 * <br>
 * <br>
 */
public interface DateTime extends Data, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#DateTime");
	

	/**
	 * The Jena Property for dateTimeDescription 
	 * <p>(URI: http://sots.rvg/lom.owl#dateTimeDescription)</p>
	 * <br>  
	 */
	public static Property dateTimeDescriptionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dateTimeDescription");


	/**
	 * The Jena Property for dat_DOT_dat_DOT_dateTime 
	 * <p>(URI: http://sots.rvg/lom.owl#dat.dat.dateTime)</p>
	 * <br>  
	 */
	public static Property dat_DOT_dat_DOT_dateTimeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.dat.dateTime");




	/**
	 * Get an Iterator the 'dateTimeDescription' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#dateTimeDescriptionProperty
	 */
	public java.util.Iterator getDateTimeDescription() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'dateTimeDescription' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#dateTimeDescriptionProperty
	 */
	public void addDateTimeDescription(rvg.sv.LangString dateTimeDescription) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'dateTimeDescription' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#dateTimeDescriptionProperty
	 */
	public rvg.sv.LangString addDateTimeDescription() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#dateTimeDescriptionProperty
	 */
	public rvg.sv.LangString addDateTimeDescription(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'dateTimeDescription' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#dateTimeDescriptionProperty
	 */
	public void removeDateTimeDescription(rvg.sv.LangString dateTimeDescription) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'dat_DOT_dat_DOT_dateTime' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#dat_DOT_dat_DOT_dateTimeProperty
	 */
	public java.util.Iterator getDat_DOT_dat_DOT_dateTime() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dat_DOT_dat_DOT_dateTime' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dat_DOT_dat_DOT_dateTimeProperty
	 */
	public void addDat_DOT_dat_DOT_dateTime(String dat_DOT_dat_DOT_dateTime) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dat_DOT_dat_DOT_dateTime' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dat_DOT_dat_DOT_dateTimeProperty
	 */
	public void removeDat_DOT_dat_DOT_dateTime(String dat_DOT_dat_DOT_dateTime) throws com.ibm.adtech.jastor.JastorException;

}