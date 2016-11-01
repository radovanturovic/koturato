

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
 * Implementations of this listener may be registered with instances of rvg.sots.LangString to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface LangStringListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of dat_DOT_las_DOT_language has been added
	 * @param source the affected instance of rvg.sots.LangString
	 * @param newValue the object representing the new value
	 */	
	public void dat_DOT_las_DOT_languageAdded(LangString source, String newValue);

	/**
	 * Called when a value of dat_DOT_las_DOT_language has been removed
	 * @param source the affected instance of rvg.sots.LangString
	 * @param oldValue the object representing the removed value
	 */	
	public void dat_DOT_las_DOT_languageRemoved(LangString source, String oldValue);

	/**
	 * Called when a value of dat_DOT_las_DOT_string has been added
	 * @param source the affected instance of rvg.sots.LangString
	 * @param newValue the object representing the new value
	 */	
	public void dat_DOT_las_DOT_stringAdded(LangString source, String newValue);

	/**
	 * Called when a value of dat_DOT_las_DOT_string has been removed
	 * @param source the affected instance of rvg.sots.LangString
	 * @param oldValue the object representing the removed value
	 */	
	public void dat_DOT_las_DOT_stringRemoved(LangString source, String oldValue);

}