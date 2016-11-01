

package rvg.sv;

/*
import org.apache.jena.datatypes.xsd.*;
import org.apache.jena.datatypes.xsd.impl.*;
*/
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import com.ibm.adtech.jastor.*;
import com.ibm.adtech.jastor.util.*;


/**
 * Implementation of {@link Technical}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Technical)</p>
 * <br>
 */
public class TechnicalImpl extends ThingImpl implements Technical {
	

	private static Property tec_DOT_locationProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#tec.location");
	private java.util.ArrayList tec_DOT_location;
 

	TechnicalImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static TechnicalImpl getTechnical(Resource resource, Model model) throws JastorException {
		return new TechnicalImpl(resource, model);
	}
	    
	static TechnicalImpl createTechnical(Resource resource, Model model) throws JastorException { 
		TechnicalImpl impl = new TechnicalImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Technical.TYPE)))
			impl._model.add(impl._resource, RDF.type, Technical.TYPE);
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
		it = _model.listStatements(_resource,tec_DOT_locationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Technical.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		tec_DOT_location = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initTec_DOT_location() throws JastorException {
		tec_DOT_location = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, tec_DOT_locationProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#tec.location properties in Technical model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				tec_DOT_location.add(obj);
		}
	}

	public java.util.Iterator getTec_DOT_location() throws JastorException {
		if (tec_DOT_location == null)
			initTec_DOT_location();
		return new CachedPropertyIterator(tec_DOT_location,_resource,tec_DOT_locationProperty,false);
	}

	public void addTec_DOT_location(String tec_DOT_location) throws JastorException {
		if (this.tec_DOT_location == null)
			initTec_DOT_location();
		if (this.tec_DOT_location.contains(tec_DOT_location))
			return;
		if (_model.contains(_resource, tec_DOT_locationProperty, createLiteral(tec_DOT_location)))
			return;
		this.tec_DOT_location.add(tec_DOT_location);
		_model.add(_resource, tec_DOT_locationProperty, createLiteral(tec_DOT_location));
	}
	
	public void removeTec_DOT_location(String tec_DOT_location) throws JastorException {
		if (this.tec_DOT_location == null)
			initTec_DOT_location();
		if (!this.tec_DOT_location.contains(tec_DOT_location))
			return;
		if (!_model.contains(_resource, tec_DOT_locationProperty, createLiteral(tec_DOT_location)))
			return;
		this.tec_DOT_location.remove(tec_DOT_location);
		_model.removeAll(_resource, tec_DOT_locationProperty, createLiteral(tec_DOT_location));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof TechnicalListener))
			throw new IllegalArgumentException("ThingListener must be instance of TechnicalListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((TechnicalListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof TechnicalListener))
			throw new IllegalArgumentException("ThingListener must be instance of TechnicalListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(tec_DOT_locationProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (tec_DOT_location == null) {
					try {
						initTec_DOT_location();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !tec_DOT_location.contains(obj))
					tec_DOT_location.add(obj);
				java.util.ArrayList consumersForTec_DOT_location;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForTec_DOT_location = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForTec_DOT_location.iterator();iter.hasNext();){
						TechnicalListener listener=(TechnicalListener)iter.next();
						listener.tec_DOT_locationAdded(TechnicalImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(tec_DOT_locationProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (tec_DOT_location != null) {
					if (tec_DOT_location.contains(obj))
						tec_DOT_location.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						TechnicalListener listener=(TechnicalListener)iter.next();
						listener.tec_DOT_locationRemoved(TechnicalImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}