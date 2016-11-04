

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
 * Implementation of {@link CTaxonCollection}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#CTaxonCollection)</p>
 * <br>
 */
public class CTaxonCollectionImpl extends ThingImpl implements CTaxonCollection {
	

	private static Property cTaxonCollectionCTCTaxonProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#cTaxonCollectionCTCTaxon");
	private java.util.ArrayList cTaxonCollectionCTCTaxon;
 

	CTaxonCollectionImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static CTaxonCollectionImpl getCTaxonCollection(Resource resource, Model model) throws JastorException {
		return new CTaxonCollectionImpl(resource, model);
	}
	    
	static CTaxonCollectionImpl createCTaxonCollection(Resource resource, Model model) throws JastorException { 
		CTaxonCollectionImpl impl = new CTaxonCollectionImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, CTaxonCollection.TYPE)))
			impl._model.add(impl._resource, RDF.type, CTaxonCollection.TYPE);
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
		it = _model.listStatements(_resource,cTaxonCollectionCTCTaxonProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, CTaxonCollection.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		cTaxonCollectionCTCTaxon = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initCTaxonCollectionCTCTaxon() throws JastorException {
		this.cTaxonCollectionCTCTaxon = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, cTaxonCollectionCTCTaxonProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#cTaxonCollectionCTCTaxon properties in CTaxonCollection model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				CTCTaxon cTaxonCollectionCTCTaxon = lom_DOT_owlFactory.getCTCTaxon(resource,_model);
				this.cTaxonCollectionCTCTaxon.add(cTaxonCollectionCTCTaxon);
			}
		}
	}

	public java.util.Iterator getCTaxonCollectionCTCTaxon() throws JastorException {
		if (cTaxonCollectionCTCTaxon == null)
			initCTaxonCollectionCTCTaxon();
		return new CachedPropertyIterator(cTaxonCollectionCTCTaxon,_resource,cTaxonCollectionCTCTaxonProperty,true);
	}

	public void addCTaxonCollectionCTCTaxon(CTCTaxon cTaxonCollectionCTCTaxon) throws JastorException {
		if (this.cTaxonCollectionCTCTaxon == null)
			initCTaxonCollectionCTCTaxon();
		if (this.cTaxonCollectionCTCTaxon.contains(cTaxonCollectionCTCTaxon)) {
			this.cTaxonCollectionCTCTaxon.remove(cTaxonCollectionCTCTaxon);
			this.cTaxonCollectionCTCTaxon.add(cTaxonCollectionCTCTaxon);
			return;
		}
		this.cTaxonCollectionCTCTaxon.add(cTaxonCollectionCTCTaxon);
		_model.add(_model.createStatement(_resource,cTaxonCollectionCTCTaxonProperty,cTaxonCollectionCTCTaxon.resource()));
	}
	
	public CTCTaxon addCTaxonCollectionCTCTaxon() throws JastorException {
		CTCTaxon cTaxonCollectionCTCTaxon = lom_DOT_owlFactory.createCTCTaxon(_model.createResource(),_model);
		if (this.cTaxonCollectionCTCTaxon == null)
			initCTaxonCollectionCTCTaxon();
		this.cTaxonCollectionCTCTaxon.add(cTaxonCollectionCTCTaxon);
		_model.add(_model.createStatement(_resource,cTaxonCollectionCTCTaxonProperty,cTaxonCollectionCTCTaxon.resource()));
		return cTaxonCollectionCTCTaxon;
	}
	
	public CTCTaxon addCTaxonCollectionCTCTaxon(Resource resource) throws JastorException {
		CTCTaxon cTaxonCollectionCTCTaxon = lom_DOT_owlFactory.getCTCTaxon(resource,_model);
		if (this.cTaxonCollectionCTCTaxon == null)
			initCTaxonCollectionCTCTaxon();
		if (this.cTaxonCollectionCTCTaxon.contains(cTaxonCollectionCTCTaxon))
			return cTaxonCollectionCTCTaxon;
		this.cTaxonCollectionCTCTaxon.add(cTaxonCollectionCTCTaxon);
		_model.add(_model.createStatement(_resource,cTaxonCollectionCTCTaxonProperty,cTaxonCollectionCTCTaxon.resource()));
		return cTaxonCollectionCTCTaxon;
	}
	
	public void removeCTaxonCollectionCTCTaxon(CTCTaxon cTaxonCollectionCTCTaxon) throws JastorException {
		if (this.cTaxonCollectionCTCTaxon == null)
			initCTaxonCollectionCTCTaxon();
		if (!this.cTaxonCollectionCTCTaxon.contains(cTaxonCollectionCTCTaxon))
			return;
		if (!_model.contains(_resource, cTaxonCollectionCTCTaxonProperty, cTaxonCollectionCTCTaxon.resource()))
			return;
		this.cTaxonCollectionCTCTaxon.remove(cTaxonCollectionCTCTaxon);
		_model.removeAll(_resource, cTaxonCollectionCTCTaxonProperty, cTaxonCollectionCTCTaxon.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof CTaxonCollectionListener))
			throw new IllegalArgumentException("ThingListener must be instance of CTaxonCollectionListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((CTaxonCollectionListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof CTaxonCollectionListener))
			throw new IllegalArgumentException("ThingListener must be instance of CTaxonCollectionListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(cTaxonCollectionCTCTaxonProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					CTCTaxon _cTaxonCollectionCTCTaxon = null;
					try {
						_cTaxonCollectionCTCTaxon = lom_DOT_owlFactory.getCTCTaxon(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (cTaxonCollectionCTCTaxon == null) {
						try {
							initCTaxonCollectionCTCTaxon();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!cTaxonCollectionCTCTaxon.contains(_cTaxonCollectionCTCTaxon))
						cTaxonCollectionCTCTaxon.add(_cTaxonCollectionCTCTaxon);
					if (listeners != null) {
						java.util.ArrayList consumersForCTaxonCollectionCTCTaxon;
						synchronized (listeners) {
							consumersForCTaxonCollectionCTCTaxon = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCTaxonCollectionCTCTaxon.iterator();iter.hasNext();){
							CTaxonCollectionListener listener=(CTaxonCollectionListener)iter.next();
							listener.cTaxonCollectionCTCTaxonAdded(CTaxonCollectionImpl.this,_cTaxonCollectionCTCTaxon);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(cTaxonCollectionCTCTaxonProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					CTCTaxon _cTaxonCollectionCTCTaxon = null;
					if (cTaxonCollectionCTCTaxon != null) {
						boolean found = false;
						for (int i=0;i<cTaxonCollectionCTCTaxon.size();i++) {
							CTCTaxon __item = (CTCTaxon) cTaxonCollectionCTCTaxon.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_cTaxonCollectionCTCTaxon = __item;
								break;
							}
						}
						if (found)
							cTaxonCollectionCTCTaxon.remove(_cTaxonCollectionCTCTaxon);
						else {
							try {
								_cTaxonCollectionCTCTaxon = lom_DOT_owlFactory.getCTCTaxon(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_cTaxonCollectionCTCTaxon = lom_DOT_owlFactory.getCTCTaxon(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForCTaxonCollectionCTCTaxon;
						synchronized (listeners) {
							consumersForCTaxonCollectionCTCTaxon = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCTaxonCollectionCTCTaxon.iterator();iter.hasNext();){
							CTaxonCollectionListener listener=(CTaxonCollectionListener)iter.next();
							listener.cTaxonCollectionCTCTaxonRemoved(CTaxonCollectionImpl.this,_cTaxonCollectionCTCTaxon);
						}
					}
				}
				return;
			}
		}

	//}
	


}