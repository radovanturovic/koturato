

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
 * Implementations of this listener may be registered with instances of rvg.sv.MContribute to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface MContributeListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of mContributeDate has been added
	 * @param source the affected instance of rvg.sv.MContribute
	 * @param newValue the object representing the new value
	 */	
	public void mContributeDateAdded(MContribute source, DateTime newValue);

	/**
	 * Called when a value of mContributeDate has been removed
	 * @param source the affected instance of rvg.sv.MContribute
	 * @param oldValue the object representing the removed value
	 */
	public void mContributeDateRemoved(MContribute source, DateTime oldValue);
		
	/**
	 * Called when a value of mContributeRole has been added
	 * @param source the affected instance of rvg.sv.MContribute
	 * @param newValue the object representing the new value
	 */	
	public void mContributeRoleAdded(MContribute source, Vocabulary newValue);

	/**
	 * Called when a value of mContributeRole has been removed
	 * @param source the affected instance of rvg.sv.MContribute
	 * @param oldValue the object representing the removed value
	 */
	public void mContributeRoleRemoved(MContribute source, Vocabulary oldValue);
		
	/**
	 * Called when a value of mme_DOT_con_DOT_entity has been added
	 * @param source the affected instance of rvg.sv.MContribute
	 * @param newValue the object representing the new value
	 */	
	public void mme_DOT_con_DOT_entityAdded(MContribute source, String newValue);

	/**
	 * Called when a value of mme_DOT_con_DOT_entity has been removed
	 * @param source the affected instance of rvg.sv.MContribute
	 * @param oldValue the object representing the removed value
	 */	
	public void mme_DOT_con_DOT_entityRemoved(MContribute source, String oldValue);

}