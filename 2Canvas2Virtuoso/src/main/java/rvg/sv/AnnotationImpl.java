

package rvg.sv;

/*
import org.apache.jena.datatypes.xsd.*;
import org.apache.jena.datatypes.xsd.impl.*;
*/
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;


/**
 * Implementation of {@link Annotation}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Annotation)</p>
 * <br>
 */
public class AnnotationImpl extends ThingImpl implements Annotation {
	

 

	AnnotationImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static AnnotationImpl getAnnotation(Resource resource, Model model) throws JastorException {
		return new AnnotationImpl(resource, model);
	}
	    
	static AnnotationImpl createAnnotation(Resource resource, Model model) throws JastorException { 
		AnnotationImpl impl = new AnnotationImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Annotation.TYPE)))
			impl._model.add(impl._resource, RDF.type, Annotation.TYPE);
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
    	rvg.sv.lom_DOT_owlFactory.registerThing(this);
    }

	public java.util.List listStatements() {
		java.util.List list = new java.util.ArrayList();
		StmtIterator it = null;
		it = _model.listStatements(_resource,RDF.type, Annotation.TYPE);
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
		if (!(listener instanceof AnnotationListener))
			throw new IllegalArgumentException("ThingListener must be instance of AnnotationListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((AnnotationListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof AnnotationListener))
			throw new IllegalArgumentException("ThingListener must be instance of AnnotationListener"); 
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