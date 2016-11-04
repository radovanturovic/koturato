

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
 * Implementations of this listener may be registered with instances of rvg.sv.Classification to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface ClassificationListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of classificationCTaxonPath has been added
	 * @param source the affected instance of rvg.sv.Classification
	 * @param newValue the object representing the new value
	 */	
	public void classificationCTaxonPathAdded(Classification source, CTaxonCollection newValue);

	/**
	 * Called when a value of classificationCTaxonPath has been removed
	 * @param source the affected instance of rvg.sv.Classification
	 * @param oldValue the object representing the removed value
	 */
	public void classificationCTaxonPathRemoved(Classification source, CTaxonCollection oldValue);
		
	/**
	 * Called when a value of classificationPurpose has been added
	 * @param source the affected instance of rvg.sv.Classification
	 * @param newValue the object representing the new value
	 */	
	public void classificationPurposeAdded(Classification source, Vocabulary newValue);

	/**
	 * Called when a value of classificationPurpose has been removed
	 * @param source the affected instance of rvg.sv.Classification
	 * @param oldValue the object representing the removed value
	 */
	public void classificationPurposeRemoved(Classification source, Vocabulary oldValue);
		
}