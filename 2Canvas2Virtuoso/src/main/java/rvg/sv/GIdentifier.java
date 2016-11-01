

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for GIdentifier ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#GIdentifier)</p>
 * <br>
 * <br>
 * <br>
 */
public interface GIdentifier extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#GIdentifier");
	

	/**
	 * The Jena Property for gen_DOT_ide_DOT_catalog 
	 * <p>(URI: http://sots.rvg/lom.owl#gen.ide.catalog)</p>
	 * <br>  
	 */
	public static Property gen_DOT_ide_DOT_catalogProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#gen.ide.catalog");


	/**
	 * The Jena Property for gen_DOT_ide_DOT_entry 
	 * <p>(URI: http://sots.rvg/lom.owl#gen.ide.entry)</p>
	 * <br>  
	 */
	public static Property gen_DOT_ide_DOT_entryProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#gen.ide.entry");




	/**
	 * Iterates through the 'gen_DOT_ide_DOT_catalog' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#gen_DOT_ide_DOT_catalogProperty
	 */
	public java.util.Iterator getGen_DOT_ide_DOT_catalog() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'gen_DOT_ide_DOT_catalog' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#gen_DOT_ide_DOT_catalogProperty
	 */
	public void addGen_DOT_ide_DOT_catalog(String gen_DOT_ide_DOT_catalog) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'gen_DOT_ide_DOT_catalog' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#gen_DOT_ide_DOT_catalogProperty
	 */
	public void removeGen_DOT_ide_DOT_catalog(String gen_DOT_ide_DOT_catalog) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'gen_DOT_ide_DOT_entry' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link String}
	 * @see			#gen_DOT_ide_DOT_entryProperty
	 */
	public java.util.Iterator getGen_DOT_ide_DOT_entry() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'gen_DOT_ide_DOT_entry' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#gen_DOT_ide_DOT_entryProperty
	 */
	public void addGen_DOT_ide_DOT_entry(String gen_DOT_ide_DOT_entry) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'gen_DOT_ide_DOT_entry' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#gen_DOT_ide_DOT_entryProperty
	 */
	public void removeGen_DOT_ide_DOT_entry(String gen_DOT_ide_DOT_entry) throws com.ibm.adtech.jastor.JastorException;

}