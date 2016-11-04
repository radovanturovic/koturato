

package rvg.sv;

/*
import org.apache.jena.datatypes.xsd.*;
import org.apache.jena.datatypes.xsd.impl.*;
import org.apache.jena.rdf.model.*;
import com.ibm.adtech.jastor.*;
import java.util.*;
import java.math.*;
*/


/**
 * Implementations of this listener may be registered with instances of rvg.sv.CTCTaxon to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface CTCTaxonListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of ctcTaxonEntry has been added
	 * @param source the affected instance of rvg.sv.CTCTaxon
	 * @param newValue the object representing the new value
	 */	
	public void ctcTaxonEntryAdded(CTCTaxon source, LangString newValue);

	/**
	 * Called when a value of ctcTaxonEntry has been removed
	 * @param source the affected instance of rvg.sv.CTCTaxon
	 * @param oldValue the object representing the removed value
	 */
	public void ctcTaxonEntryRemoved(CTCTaxon source, LangString oldValue);
		
	/**
	 * Called when a value of cla_DOT_ctc_DOT_tax_DOT_id has been added
	 * @param source the affected instance of rvg.sv.CTCTaxon
	 * @param newValue the object representing the new value
	 */	
	public void cla_DOT_ctc_DOT_tax_DOT_idAdded(CTCTaxon source, String newValue);

	/**
	 * Called when a value of cla_DOT_ctc_DOT_tax_DOT_id has been removed
	 * @param source the affected instance of rvg.sv.CTCTaxon
	 * @param oldValue the object representing the removed value
	 */	
	public void cla_DOT_ctc_DOT_tax_DOT_idRemoved(CTCTaxon source, String oldValue);

}