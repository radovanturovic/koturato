

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
 * Implementations of this listener may be registered with instances of rvg.sv.Technical to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface TechnicalListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of tec_DOT_location has been added
	 * @param source the affected instance of rvg.sv.Technical
	 * @param newValue the object representing the new value
	 */	
	public void tec_DOT_locationAdded(Technical source, String newValue);

	/**
	 * Called when a value of tec_DOT_location has been removed
	 * @param source the affected instance of rvg.sv.Technical
	 * @param oldValue the object representing the removed value
	 */	
	public void tec_DOT_locationRemoved(Technical source, String oldValue);

}