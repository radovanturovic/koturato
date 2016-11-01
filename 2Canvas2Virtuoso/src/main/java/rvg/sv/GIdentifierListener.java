

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
 * Implementations of this listener may be registered with instances of rvg.sots.GIdentifier to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface GIdentifierListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of gen_DOT_ide_DOT_catalog has been added
	 * @param source the affected instance of rvg.sots.GIdentifier
	 * @param newValue the object representing the new value
	 */	
	public void gen_DOT_ide_DOT_catalogAdded(GIdentifier source, String newValue);

	/**
	 * Called when a value of gen_DOT_ide_DOT_catalog has been removed
	 * @param source the affected instance of rvg.sots.GIdentifier
	 * @param oldValue the object representing the removed value
	 */	
	public void gen_DOT_ide_DOT_catalogRemoved(GIdentifier source, String oldValue);

	/**
	 * Called when a value of gen_DOT_ide_DOT_entry has been added
	 * @param source the affected instance of rvg.sots.GIdentifier
	 * @param newValue the object representing the new value
	 */	
	public void gen_DOT_ide_DOT_entryAdded(GIdentifier source, String newValue);

	/**
	 * Called when a value of gen_DOT_ide_DOT_entry has been removed
	 * @param source the affected instance of rvg.sots.GIdentifier
	 * @param oldValue the object representing the removed value
	 */	
	public void gen_DOT_ide_DOT_entryRemoved(GIdentifier source, String oldValue);

}