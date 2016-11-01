

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
 * Implementations of this listener may be registered with instances of rvg.sots.LOM to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface LOMListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of lomEducational has been added
	 * @param source the affected instance of rvg.sots.LOM
	 * @param newValue the object representing the new value
	 */	
	public void lomEducationalAdded(LOM source, Educational newValue);

	/**
	 * Called when a value of lomEducational has been removed
	 * @param source the affected instance of rvg.sots.LOM
	 * @param oldValue the object representing the removed value
	 */
	public void lomEducationalRemoved(LOM source, Educational oldValue);
		
	/**
	 * Called when a value of lomLifeCycle has been added
	 * @param source the affected instance of rvg.sots.LOM
	 * @param newValue the object representing the new value
	 */	
	public void lomLifeCycleAdded(LOM source, LifeCycle newValue);

	/**
	 * Called when a value of lomLifeCycle has been removed
	 * @param source the affected instance of rvg.sots.LOM
	 * @param oldValue the object representing the removed value
	 */
	public void lomLifeCycleRemoved(LOM source, LifeCycle oldValue);
		
	/**
	 * Called when a value of lomClassification has been added
	 * @param source the affected instance of rvg.sots.LOM
	 * @param newValue the object representing the new value
	 */	
	public void lomClassificationAdded(LOM source, rvg.sv.Classification newValue);

	/**
	 * Called when a value of lomClassification has been removed
	 * @param source the affected instance of rvg.sots.LOM
	 * @param oldValue the object representing the removed value
	 */
	public void lomClassificationRemoved(LOM source, rvg.sv.Classification oldValue);
		
	/**
	 * Called when a value of lomGeneral has been added
	 * @param source the affected instance of rvg.sots.LOM
	 * @param newValue the object representing the new value
	 */	
	public void lomGeneralAdded(LOM source, General newValue);

	/**
	 * Called when a value of lomGeneral has been removed
	 * @param source the affected instance of rvg.sots.LOM
	 * @param oldValue the object representing the removed value
	 */
	public void lomGeneralRemoved(LOM source, General oldValue);
		
	/**
	 * Called when a value of lomMetaMetadata has been added
	 * @param source the affected instance of rvg.sots.LOM
	 * @param newValue the object representing the new value
	 */	
	public void lomMetaMetadataAdded(LOM source, com.ibm.adtech.jastor.Thing newValue);

	/**
	 * Called when a value of lomMetaMetadata has been removed
	 * @param source the affected instance of rvg.sots.LOM
	 * @param oldValue the object representing the removed value
	 */
	public void lomMetaMetadataRemoved(LOM source, com.ibm.adtech.jastor.Thing oldValue);
		
	/**
	 * Called when a value of lomTechnical has been added
	 * @param source the affected instance of rvg.sots.LOM
	 * @param newValue the object representing the new value
	 */	
	public void lomTechnicalAdded(LOM source, Technical newValue);

	/**
	 * Called when a value of lomTechnical has been removed
	 * @param source the affected instance of rvg.sots.LOM
	 * @param oldValue the object representing the removed value
	 */
	public void lomTechnicalRemoved(LOM source, Technical oldValue);
		
}