

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
 * Implementations of this listener may be registered with instances of rvg.sv.DateTime to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface DateTimeListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of dateTimeDescription has been added
	 * @param source the affected instance of rvg.sv.DateTime
	 * @param newValue the object representing the new value
	 */	
	public void dateTimeDescriptionAdded(DateTime source, LangString newValue);

	/**
	 * Called when a value of dateTimeDescription has been removed
	 * @param source the affected instance of rvg.sv.DateTime
	 * @param oldValue the object representing the removed value
	 */
	public void dateTimeDescriptionRemoved(DateTime source, LangString oldValue);
		
	/**
	 * Called when a value of dat_DOT_dat_DOT_dateTime has been added
	 * @param source the affected instance of rvg.sv.DateTime
	 * @param newValue the object representing the new value
	 */	
	public void dat_DOT_dat_DOT_dateTimeAdded(DateTime source, String newValue);

	/**
	 * Called when a value of dat_DOT_dat_DOT_dateTime has been removed
	 * @param source the affected instance of rvg.sv.DateTime
	 * @param oldValue the object representing the removed value
	 */	
	public void dat_DOT_dat_DOT_dateTimeRemoved(DateTime source, String oldValue);

}