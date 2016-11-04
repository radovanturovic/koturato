

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
 * Implementations of this listener may be registered with instances of rvg.sv.General to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface GeneralListener extends com.ibm.adtech.jastor.ThingListener {


	/**
	 * Called when a value of generalDescription has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalDescriptionAdded(General source, LangString newValue);

	/**
	 * Called when a value of generalDescription has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalDescriptionRemoved(General source, LangString oldValue);
		
	/**
	 * Called when a value of generalTitle has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalTitleAdded(General source, LangString newValue);

	/**
	 * Called when a value of generalTitle has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalTitleRemoved(General source, LangString oldValue);
		
	/**
	 * Called when a value of gen_DOT_language has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void gen_DOT_languageAdded(General source, String newValue);

	/**
	 * Called when a value of gen_DOT_language has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */	
	public void gen_DOT_languageRemoved(General source, String oldValue);

	/**
	 * Called when a value of generalKeyword has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalKeywordAdded(General source, LangString newValue);

	/**
	 * Called when a value of generalKeyword has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalKeywordRemoved(General source, LangString oldValue);
		
	/**
	 * Called when a value of generalAggregationLevel has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalAggregationLevelAdded(General source, Vocabulary newValue);

	/**
	 * Called when a value of generalAggregationLevel has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalAggregationLevelRemoved(General source, Vocabulary oldValue);
		
	/**
	 * Called when a value of generalIdentifier has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalIdentifierAdded(General source, GIdentifier newValue);

	/**
	 * Called when a value of generalIdentifier has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalIdentifierRemoved(General source, GIdentifier oldValue);
		
	/**
	 * Called when a value of generalCoverage has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalCoverageAdded(General source, LangString newValue);

	/**
	 * Called when a value of generalCoverage has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalCoverageRemoved(General source, LangString oldValue);
		
	/**
	 * Called when a value of generalStructure has been added
	 * @param source the affected instance of rvg.sv.General
	 * @param newValue the object representing the new value
	 */	
	public void generalStructureAdded(General source, Vocabulary newValue);

	/**
	 * Called when a value of generalStructure has been removed
	 * @param source the affected instance of rvg.sv.General
	 * @param oldValue the object representing the removed value
	 */
	public void generalStructureRemoved(General source, Vocabulary oldValue);
		
}