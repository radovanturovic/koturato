

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
 * Implementations of this listener may be registered with instances of rvg.sv.Course to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface CourseListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of courseLom has been added
	 * @param source the affected instance of rvg.sv.Course
	 * @param newValue the object representing the new value
	 */	
	public void courseLomAdded(Course source, LOM newValue);

	/**
	 * Called when a value of courseLom has been removed
	 * @param source the affected instance of rvg.sv.Course
	 * @param oldValue the object representing the removed value
	 */
	public void courseLomRemoved(Course source, LOM oldValue);
		
	/**
	 * Called when a value of crs_DOT_name has been added
	 * @param source the affected instance of rvg.sv.Course
	 * @param newValue the object representing the new value
	 */	
	public void crs_DOT_nameAdded(Course source, String newValue);

	/**
	 * Called when a value of crs_DOT_name has been removed
	 * @param source the affected instance of rvg.sv.Course
	 * @param oldValue the object representing the removed value
	 */	
	public void crs_DOT_nameRemoved(Course source, String oldValue);

}