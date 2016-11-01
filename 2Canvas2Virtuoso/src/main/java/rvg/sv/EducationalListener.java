

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
 * Implementations of this listener may be registered with instances of rvg.sots.Educational to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface EducationalListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of educationalLearningResourceType has been added
	 * @param source the affected instance of rvg.sots.Educational
	 * @param newValue the object representing the new value
	 */	
	public void educationalLearningResourceTypeAdded(Educational source, LangString newValue);

	/**
	 * Called when a value of educationalLearningResourceType has been removed
	 * @param source the affected instance of rvg.sots.Educational
	 * @param oldValue the object representing the removed value
	 */
	public void educationalLearningResourceTypeRemoved(Educational source, LangString oldValue);
		
}