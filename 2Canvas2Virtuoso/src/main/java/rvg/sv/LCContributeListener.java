

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
 * Implementations of this listener may be registered with instances of rvg.sv.LCContribute to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface LCContributeListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of lcContributeRole has been added
	 * @param source the affected instance of rvg.sv.LCContribute
	 * @param newValue the object representing the new value
	 */	
	public void lcContributeRoleAdded(LCContribute source, Vocabulary newValue);

	/**
	 * Called when a value of lcContributeRole has been removed
	 * @param source the affected instance of rvg.sv.LCContribute
	 * @param oldValue the object representing the removed value
	 */
	public void lcContributeRoleRemoved(LCContribute source, Vocabulary oldValue);
		
	/**
	 * Called when a value of lcContributeDate has been added
	 * @param source the affected instance of rvg.sv.LCContribute
	 * @param newValue the object representing the new value
	 */	
	public void lcContributeDateAdded(LCContribute source, DateTime newValue);

	/**
	 * Called when a value of lcContributeDate has been removed
	 * @param source the affected instance of rvg.sv.LCContribute
	 * @param oldValue the object representing the removed value
	 */
	public void lcContributeDateRemoved(LCContribute source, DateTime oldValue);
		
	/**
	 * Called when a value of lif_DOT_con_DOT_entity has been added
	 * @param source the affected instance of rvg.sv.LCContribute
	 * @param newValue the object representing the new value
	 */	
	public void lif_DOT_con_DOT_entityAdded(LCContribute source, String newValue);

	/**
	 * Called when a value of lif_DOT_con_DOT_entity has been removed
	 * @param source the affected instance of rvg.sv.LCContribute
	 * @param oldValue the object representing the removed value
	 */	
	public void lif_DOT_con_DOT_entityRemoved(LCContribute source, String oldValue);

}