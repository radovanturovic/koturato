

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
 * Implementations of this listener may be registered with instances of rvg.sv.CTaxonCollection to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface CTaxonCollectionListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of cTaxonCollectionCTCTaxon has been added
	 * @param source the affected instance of rvg.sv.CTaxonCollection
	 * @param newValue the object representing the new value
	 */	
	public void cTaxonCollectionCTCTaxonAdded(CTaxonCollection source, CTCTaxon newValue);

	/**
	 * Called when a value of cTaxonCollectionCTCTaxon has been removed
	 * @param source the affected instance of rvg.sv.CTaxonCollection
	 * @param oldValue the object representing the removed value
	 */
	public void cTaxonCollectionCTCTaxonRemoved(CTaxonCollection source, CTCTaxon oldValue);
		
}