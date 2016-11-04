

package rvg.sv;

/*
import org.apache.jena.datatypes.xsd.*;
import org.apache.jena.datatypes.xsd.impl.*;
*/
import org.apache.jena.rdf.model.*;
import org.apache.jena.rdf.listeners.StatementListener;
import org.apache.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link Meta_DASH_Metadata}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Meta-Metadata)</p>
 * <br>
 */
public class Meta_DASH_MetadataImpl extends ThingImpl implements Meta_DASH_Metadata {
	

 

	Meta_DASH_MetadataImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static Meta_DASH_MetadataImpl getMeta_DASH_Metadata(Resource resource, Model model) throws JastorException {
		return new Meta_DASH_MetadataImpl(resource, model);
	}
	    
	static Meta_DASH_MetadataImpl createMeta_DASH_Metadata(Resource resource, Model model) throws JastorException { 
		Meta_DASH_MetadataImpl impl = new Meta_DASH_MetadataImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Meta_DASH_Metadata.TYPE)))
			impl._model.add(impl._resource, RDF.type, Meta_DASH_Metadata.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
	}
   
	void addHasValueValues() {
	}
    
    private void setupModelListener() {
    	listeners = new java.util.ArrayList();
    	lom_DOT_owlFactory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,RDF.type, Meta_DASH_Metadata.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof Meta_DASH_MetadataListener))
			throw new IllegalArgumentException("ThingListener must be instance of Meta_DASH_MetadataListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((Meta_DASH_MetadataListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof Meta_DASH_MetadataListener))
			throw new IllegalArgumentException("ThingListener must be instance of Meta_DASH_MetadataListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
		}

	//}
	


}