

package rvg.sv;

import org.apache.jena.rdf.model.*;

/**
 * Interface for LifeCycle ontology class<br>
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this interface.
 * <p>(URI: http://sots.rvg/lom.owl#LifeCycle)</p>
 * <br>
 * <br>
 * <br>
 */
public interface LifeCycle extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://sots.rvg/lom.owl#LifeCycle");
	

	/**
	 * The Jena Property for lifeCycleContribute 
	 * <p>(URI: http://sots.rvg/lom.owl#lifeCycleContribute)</p>
	 * <br>  
	 */
	public static Property lifeCycleContributeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lifeCycleContribute");


	/**
	 * The Jena Property for lifeCycleVersion 
	 * <p>(URI: http://sots.rvg/lom.owl#lifeCycleVersion)</p>
	 * <br>  
	 */
	public static Property lifeCycleVersionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lifeCycleVersion");


	/**
	 * The Jena Property for lifeCycleStatus 
	 * <p>(URI: http://sots.rvg/lom.owl#lifeCycleStatus)</p>
	 * <br>  
	 */
	public static Property lifeCycleStatusProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lifeCycleStatus");




	/**
	 * Get an Iterator the 'lifeCycleContribute' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LCContribute}
	 * @see			#lifeCycleContributeProperty
	 */
	public java.util.Iterator getLifeCycleContribute() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lifeCycleContribute' property
	 * @param		The {@link rvg.sv.LCContribute} to add
	 * @see			#lifeCycleContributeProperty
	 */
	public void addLifeCycleContribute(rvg.sv.LCContribute lifeCycleContribute) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lifeCycleContribute' property
	 * @return		The anoymous {@link rvg.sv.LCContribute} created
	 * @see			#lifeCycleContributeProperty
	 */
	public rvg.sv.LCContribute addLifeCycleContribute() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LCContribute.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lifeCycleContributeProperty
	 */
	public rvg.sv.LCContribute addLifeCycleContribute(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lifeCycleContribute' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LCContribute} to remove
	 * @see			#lifeCycleContributeProperty
	 */
	public void removeLifeCycleContribute(rvg.sv.LCContribute lifeCycleContribute) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lifeCycleVersion' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#lifeCycleVersionProperty
	 */
	public java.util.Iterator getLifeCycleVersion() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lifeCycleVersion' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#lifeCycleVersionProperty
	 */
	public void addLifeCycleVersion(rvg.sv.LangString lifeCycleVersion) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lifeCycleVersion' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#lifeCycleVersionProperty
	 */
	public rvg.sv.LangString addLifeCycleVersion() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lifeCycleVersionProperty
	 */
	public rvg.sv.LangString addLifeCycleVersion(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lifeCycleVersion' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#lifeCycleVersionProperty
	 */
	public void removeLifeCycleVersion(rvg.sv.LangString lifeCycleVersion) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'lifeCycleStatus' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link rvg.sv.LangString}
	 * @see			#lifeCycleStatusProperty
	 */
	public java.util.Iterator getLifeCycleStatus() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'lifeCycleStatus' property
	 * @param		The {@link rvg.sv.LangString} to add
	 * @see			#lifeCycleStatusProperty
	 */
	public void addLifeCycleStatus(rvg.sv.LangString lifeCycleStatus) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'lifeCycleStatus' property
	 * @return		The anoymous {@link rvg.sv.LangString} created
	 * @see			#lifeCycleStatusProperty
	 */
	public rvg.sv.LangString addLifeCycleStatus() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://sots.rvg/lom.owl#LangString.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#lifeCycleStatusProperty
	 */
	public rvg.sv.LangString addLifeCycleStatus(Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'lifeCycleStatus' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link rvg.sv.LangString} to remove
	 * @see			#lifeCycleStatusProperty
	 */
	public void removeLifeCycleStatus(rvg.sv.LangString lifeCycleStatus) throws com.ibm.adtech.jastor.JastorException;
		
}