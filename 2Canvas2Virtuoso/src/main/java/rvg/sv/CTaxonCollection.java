

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for CTaxonCollection ontology class<br>
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#CTaxonCollection)</p>
 * <br>
 * <br>
 * <br>
 */
public interface CTaxonCollection extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#CTaxonCollection");
	

	/**
	 * The Jena Property for cTaxonCollectionCTCTaxon 
	 * <p>(URI: http://sots.rvg/lom.owl#cTaxonCollectionCTCTaxon)</p>
	 * <br>  
	 */
	public static Property cTaxonCollectionCTCTaxonProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#cTaxonCollectionCTCTaxon");




	/**
	 * Get an Iterator the 'cTaxonCollectionCTCTaxon' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link CTCTaxon}
	 * @see			#cTaxonCollectionCTCTaxonProperty
	 */
	public java.util.Iterator getCTaxonCollectionCTCTaxon() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'cTaxonCollectionCTCTaxon' property
	 * @param		The {@link CTCTaxon} to add
	 * @see			#cTaxonCollectionCTCTaxonProperty
	 */
	public void addCTaxonCollectionCTCTaxon(CTCTaxon cTaxonCollectionCTCTaxon) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'cTaxonCollectionCTCTaxon' property
	 * @return		The anoymous {@link CTCTaxon} created
	 * @see			#cTaxonCollectionCTCTaxonProperty
	 */
	public CTCTaxon addCTaxonCollectionCTCTaxon() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#CTCTaxon.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#cTaxonCollectionCTCTaxonProperty
	 */
	public CTCTaxon addCTaxonCollectionCTCTaxon(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'cTaxonCollectionCTCTaxon' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link CTCTaxon} to remove
	 * @see			#cTaxonCollectionCTCTaxonProperty
	 */
	public void removeCTaxonCollectionCTCTaxon(CTCTaxon cTaxonCollectionCTCTaxon) throws com.ibm.adtech.jastor.JastorException;
		
}