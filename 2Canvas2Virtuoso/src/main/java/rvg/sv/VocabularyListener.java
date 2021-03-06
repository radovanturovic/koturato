

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
 * Implementations of this listener may be registered with instances of rvg.sv.Vocabulary to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface VocabularyListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of dat_DOT_voc_DOT_source has been added
	 * @param source the affected instance of rvg.sv.Vocabulary
	 * @param newValue the object representing the new value
	 */	
	public void dat_DOT_voc_DOT_sourceAdded(Vocabulary source, String newValue);

	/**
	 * Called when a value of dat_DOT_voc_DOT_source has been removed
	 * @param source the affected instance of rvg.sv.Vocabulary
	 * @param oldValue the object representing the removed value
	 */	
	public void dat_DOT_voc_DOT_sourceRemoved(Vocabulary source, String oldValue);

	/**
	 * Called when a value of dat_DOT_voc_DOT_value has been added
	 * @param source the affected instance of rvg.sv.Vocabulary
	 * @param newValue the object representing the new value
	 */	
	public void dat_DOT_voc_DOT_valueAdded(Vocabulary source, String newValue);

	/**
	 * Called when a value of dat_DOT_voc_DOT_value has been removed
	 * @param source the affected instance of rvg.sv.Vocabulary
	 * @param oldValue the object representing the removed value
	 */	
	public void dat_DOT_voc_DOT_valueRemoved(Vocabulary source, String oldValue);

}