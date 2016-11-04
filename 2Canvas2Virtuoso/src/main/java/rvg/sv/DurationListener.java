

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
 * Implementations of this listener may be registered with instances of rvg.sv.Duration to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface DurationListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of dat_DOT_dur_DOT_duration has been added
	 * @param source the affected instance of rvg.sv.Duration
	 * @param newValue the object representing the new value
	 */	
	public void dat_DOT_dur_DOT_durationAdded(Duration source, String newValue);

	/**
	 * Called when a value of dat_DOT_dur_DOT_duration has been removed
	 * @param source the affected instance of rvg.sv.Duration
	 * @param oldValue the object representing the removed value
	 */	
	public void dat_DOT_dur_DOT_durationRemoved(Duration source, String oldValue);

	/**
	 * Called when a value of durationDescription has been added
	 * @param source the affected instance of rvg.sv.Duration
	 * @param newValue the object representing the new value
	 */	
	public void durationDescriptionAdded(Duration source, LangString newValue);

	/**
	 * Called when a value of durationDescription has been removed
	 * @param source the affected instance of rvg.sv.Duration
	 * @param oldValue the object representing the removed value
	 */
	public void durationDescriptionRemoved(Duration source, LangString oldValue);
		
}