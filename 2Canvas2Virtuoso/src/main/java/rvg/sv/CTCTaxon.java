

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for CTCTaxon ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#CTCTaxon)</p>
 * <br>
 * <br>
 * <br>
 */
public interface CTCTaxon extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#CTCTaxon");
	

	/**
	 * The Jena Property for ctcTaxonEntry 
	 * <p>(URI: http://sots.rvg/lom.owl#ctcTaxonEntry)</p>
	 * <br>  
	 */
	public static Property ctcTaxonEntryProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#ctcTaxonEntry");


	/**
	 * The Jena Property for cla_DOT_ctc_DOT_tax_DOT_id 
	 * <p>(URI: http://sots.rvg/lom.owl#cla.ctc.tax.id)</p>
	 * <br>  
	 */
	public static Property cla_DOT_ctc_DOT_tax_DOT_idProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#cla.ctc.tax.id");




	/**
	 * Get an Iterator the 'ctcTaxonEntry' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#ctcTaxonEntryProperty
	 */
	public java.util.Iterator getCtcTaxonEntry() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'ctcTaxonEntry' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#ctcTaxonEntryProperty
	 */
	public void addCtcTaxonEntry(rvg.sv.LangString ctcTaxonEntry) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'ctcTaxonEntry' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#ctcTaxonEntryProperty
	 */
	public rvg.sv.LangString addCtcTaxonEntry() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#ctcTaxonEntryProperty
	 */
	public rvg.sv.LangString addCtcTaxonEntry(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'ctcTaxonEntry' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#ctcTaxonEntryProperty
	 */
	public void removeCtcTaxonEntry(rvg.sv.LangString ctcTaxonEntry) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'cla_DOT_ctc_DOT_tax_DOT_id' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#cla_DOT_ctc_DOT_tax_DOT_idProperty
	 */
	public java.util.Iterator getCla_DOT_ctc_DOT_tax_DOT_id() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'cla_DOT_ctc_DOT_tax_DOT_id' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#cla_DOT_ctc_DOT_tax_DOT_idProperty
	 */
	public void addCla_DOT_ctc_DOT_tax_DOT_id(String cla_DOT_ctc_DOT_tax_DOT_id) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'cla_DOT_ctc_DOT_tax_DOT_id' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#cla_DOT_ctc_DOT_tax_DOT_idProperty
	 */
	public void removeCla_DOT_ctc_DOT_tax_DOT_id(String cla_DOT_ctc_DOT_tax_DOT_id) throws com.ibm.adtech.jastor.JastorException;

}