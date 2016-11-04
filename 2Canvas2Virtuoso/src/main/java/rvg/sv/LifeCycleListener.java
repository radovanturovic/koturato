

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
 * Implementations of this listener may be registered with instances of rvg.sv.LifeCycle to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface LifeCycleListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of lifeCycleContribute has been added
	 * @param source the affected instance of rvg.sv.LifeCycle
	 * @param newValue the object representing the new value
	 */	
	public void lifeCycleContributeAdded(LifeCycle source, LCContribute newValue);

	/**
	 * Called when a value of lifeCycleContribute has been removed
	 * @param source the affected instance of rvg.sv.LifeCycle
	 * @param oldValue the object representing the removed value
	 */
	public void lifeCycleContributeRemoved(LifeCycle source, LCContribute oldValue);
		
	/**
	 * Called when a value of lifeCycleVersion has been added
	 * @param source the affected instance of rvg.sv.LifeCycle
	 * @param newValue the object representing the new value
	 */	
	public void lifeCycleVersionAdded(LifeCycle source, LangString newValue);

	/**
	 * Called when a value of lifeCycleVersion has been removed
	 * @param source the affected instance of rvg.sv.LifeCycle
	 * @param oldValue the object representing the removed value
	 */
	public void lifeCycleVersionRemoved(LifeCycle source, LangString oldValue);
		
	/**
	 * Called when a value of lifeCycleStatus has been added
	 * @param source the affected instance of rvg.sv.LifeCycle
	 * @param newValue the object representing the new value
	 */	
	public void lifeCycleStatusAdded(LifeCycle source, LangString newValue);

	/**
	 * Called when a value of lifeCycleStatus has been removed
	 * @param source the affected instance of rvg.sv.LifeCycle
	 * @param oldValue the object representing the removed value
	 */
	public void lifeCycleStatusRemoved(LifeCycle source, LangString oldValue);
		
}