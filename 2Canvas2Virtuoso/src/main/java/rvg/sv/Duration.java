

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for Duration ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#Duration)</p>
 * <br>
 * <br>
 * <br>
 */
public interface Duration extends Data, com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#Duration");
	

	/**
	 * The Jena Property for dat_DOT_dur_DOT_duration 
	 * <p>(URI: http://sots.rvg/lom.owl#dat.dur.duration)</p>
	 * <br>  
	 */
	public static Property dat_DOT_dur_DOT_durationProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.dur.duration");


	/**
	 * The Jena Property for durationDescription 
	 * <p>(URI: http://sots.rvg/lom.owl#durationDescription)</p>
	 * <br>  
	 */
	public static Property durationDescriptionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#durationDescription");




	/**
	 * Iterates through the 'dat_DOT_dur_DOT_duration' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#dat_DOT_dur_DOT_durationProperty
	 */
	public java.util.Iterator getDat_DOT_dur_DOT_duration() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'dat_DOT_dur_DOT_duration' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#dat_DOT_dur_DOT_durationProperty
	 */
	public void addDat_DOT_dur_DOT_duration(String dat_DOT_dur_DOT_duration) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'dat_DOT_dur_DOT_duration' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#dat_DOT_dur_DOT_durationProperty
	 */
	public void removeDat_DOT_dur_DOT_duration(String dat_DOT_dur_DOT_duration) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'durationDescription' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#durationDescriptionProperty
	 */
	public java.util.Iterator getDurationDescription() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'durationDescription' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#durationDescriptionProperty
	 */
	public void addDurationDescription(rvg.sv.LangString durationDescription) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'durationDescription' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#durationDescriptionProperty
	 */
	public rvg.sv.LangString addDurationDescription() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#durationDescriptionProperty
	 */
	public rvg.sv.LangString addDurationDescription(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'durationDescription' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#durationDescriptionProperty
	 */
	public void removeDurationDescription(rvg.sv.LangString durationDescription) throws com.ibm.adtech.jastor.JastorException;
		
}