

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
 * Implementation of {@link CTCTaxon}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#CTCTaxon)</p>
 * <br>
 */
public class CTCTaxonImpl extends ThingImpl implements CTCTaxon {
	

	private static Property ctcTaxonEntryProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#ctcTaxonEntry");
	private java.util.ArrayList ctcTaxonEntry;
	private static Property cla_DOT_ctc_DOT_tax_DOT_idProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#cla.ctc.tax.id");
	private java.util.ArrayList cla_DOT_ctc_DOT_tax_DOT_id;
 

	CTCTaxonImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static CTCTaxonImpl getCTCTaxon(Resource resource, Model model) throws JastorException {
		return new CTCTaxonImpl(resource, model);
	}
	    
	static CTCTaxonImpl createCTCTaxon(Resource resource, Model model) throws JastorException { 
		CTCTaxonImpl impl = new CTCTaxonImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, CTCTaxon.TYPE)))
			impl._model.add(impl._resource, RDF.type, CTCTaxon.TYPE);
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
		it = _model.listStatements(_resource,ctcTaxonEntryProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,cla_DOT_ctc_DOT_tax_DOT_idProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, CTCTaxon.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		ctcTaxonEntry = null;
		cla_DOT_ctc_DOT_tax_DOT_id = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initCtcTaxonEntry() throws JastorException {
		this.ctcTaxonEntry = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, ctcTaxonEntryProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#ctcTaxonEntry properties in CTCTaxon model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString ctcTaxonEntry = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.ctcTaxonEntry.add(ctcTaxonEntry);
			}
		}
	}

	public java.util.Iterator getCtcTaxonEntry() throws JastorException {
		if (ctcTaxonEntry == null)
			initCtcTaxonEntry();
		return new CachedPropertyIterator(ctcTaxonEntry,_resource,ctcTaxonEntryProperty,true);
	}

	public void addCtcTaxonEntry(LangString ctcTaxonEntry) throws JastorException {
		if (this.ctcTaxonEntry == null)
			initCtcTaxonEntry();
		if (this.ctcTaxonEntry.contains(ctcTaxonEntry)) {
			this.ctcTaxonEntry.remove(ctcTaxonEntry);
			this.ctcTaxonEntry.add(ctcTaxonEntry);
			return;
		}
		this.ctcTaxonEntry.add(ctcTaxonEntry);
		_model.add(_model.createStatement(_resource,ctcTaxonEntryProperty,ctcTaxonEntry.resource()));
	}
	
	public LangString addCtcTaxonEntry() throws JastorException {
		LangString ctcTaxonEntry = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.ctcTaxonEntry == null)
			initCtcTaxonEntry();
		this.ctcTaxonEntry.add(ctcTaxonEntry);
		_model.add(_model.createStatement(_resource,ctcTaxonEntryProperty,ctcTaxonEntry.resource()));
		return ctcTaxonEntry;
	}
	
	public LangString addCtcTaxonEntry(Resource resource) throws JastorException {
		LangString ctcTaxonEntry = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.ctcTaxonEntry == null)
			initCtcTaxonEntry();
		if (this.ctcTaxonEntry.contains(ctcTaxonEntry))
			return ctcTaxonEntry;
		this.ctcTaxonEntry.add(ctcTaxonEntry);
		_model.add(_model.createStatement(_resource,ctcTaxonEntryProperty,ctcTaxonEntry.resource()));
		return ctcTaxonEntry;
	}
	
	public void removeCtcTaxonEntry(LangString ctcTaxonEntry) throws JastorException {
		if (this.ctcTaxonEntry == null)
			initCtcTaxonEntry();
		if (!this.ctcTaxonEntry.contains(ctcTaxonEntry))
			return;
		if (!_model.contains(_resource, ctcTaxonEntryProperty, ctcTaxonEntry.resource()))
			return;
		this.ctcTaxonEntry.remove(ctcTaxonEntry);
		_model.removeAll(_resource, ctcTaxonEntryProperty, ctcTaxonEntry.resource());
	}
		 

	private void initCla_DOT_ctc_DOT_tax_DOT_id() throws JastorException {
		cla_DOT_ctc_DOT_tax_DOT_id = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, cla_DOT_ctc_DOT_tax_DOT_idProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#cla.ctc.tax.id properties in CTCTaxon model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				cla_DOT_ctc_DOT_tax_DOT_id.add(obj);
		}
	}

	public java.util.Iterator getCla_DOT_ctc_DOT_tax_DOT_id() throws JastorException {
		if (cla_DOT_ctc_DOT_tax_DOT_id == null)
			initCla_DOT_ctc_DOT_tax_DOT_id();
		return new CachedPropertyIterator(cla_DOT_ctc_DOT_tax_DOT_id,_resource,cla_DOT_ctc_DOT_tax_DOT_idProperty,false);
	}

	public void addCla_DOT_ctc_DOT_tax_DOT_id(String cla_DOT_ctc_DOT_tax_DOT_id) throws JastorException {
		if (this.cla_DOT_ctc_DOT_tax_DOT_id == null)
			initCla_DOT_ctc_DOT_tax_DOT_id();
		if (this.cla_DOT_ctc_DOT_tax_DOT_id.contains(cla_DOT_ctc_DOT_tax_DOT_id))
			return;
		if (_model.contains(_resource, cla_DOT_ctc_DOT_tax_DOT_idProperty, createLiteral(cla_DOT_ctc_DOT_tax_DOT_id)))
			return;
		this.cla_DOT_ctc_DOT_tax_DOT_id.add(cla_DOT_ctc_DOT_tax_DOT_id);
		_model.add(_resource, cla_DOT_ctc_DOT_tax_DOT_idProperty, createLiteral(cla_DOT_ctc_DOT_tax_DOT_id));
	}
	
	public void removeCla_DOT_ctc_DOT_tax_DOT_id(String cla_DOT_ctc_DOT_tax_DOT_id) throws JastorException {
		if (this.cla_DOT_ctc_DOT_tax_DOT_id == null)
			initCla_DOT_ctc_DOT_tax_DOT_id();
		if (!this.cla_DOT_ctc_DOT_tax_DOT_id.contains(cla_DOT_ctc_DOT_tax_DOT_id))
			return;
		if (!_model.contains(_resource, cla_DOT_ctc_DOT_tax_DOT_idProperty, createLiteral(cla_DOT_ctc_DOT_tax_DOT_id)))
			return;
		this.cla_DOT_ctc_DOT_tax_DOT_id.remove(cla_DOT_ctc_DOT_tax_DOT_id);
		_model.removeAll(_resource, cla_DOT_ctc_DOT_tax_DOT_idProperty, createLiteral(cla_DOT_ctc_DOT_tax_DOT_id));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof CTCTaxonListener))
			throw new IllegalArgumentException("ThingListener must be instance of CTCTaxonListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((CTCTaxonListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof CTCTaxonListener))
			throw new IllegalArgumentException("ThingListener must be instance of CTCTaxonListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(ctcTaxonEntryProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _ctcTaxonEntry = null;
					try {
						_ctcTaxonEntry = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (ctcTaxonEntry == null) {
						try {
							initCtcTaxonEntry();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!ctcTaxonEntry.contains(_ctcTaxonEntry))
						ctcTaxonEntry.add(_ctcTaxonEntry);
					if (listeners != null) {
						java.util.ArrayList consumersForCtcTaxonEntry;
						synchronized (listeners) {
							consumersForCtcTaxonEntry = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCtcTaxonEntry.iterator();iter.hasNext();){
							CTCTaxonListener listener=(CTCTaxonListener)iter.next();
							listener.ctcTaxonEntryAdded(CTCTaxonImpl.this,_ctcTaxonEntry);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(cla_DOT_ctc_DOT_tax_DOT_idProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (cla_DOT_ctc_DOT_tax_DOT_id == null) {
					try {
						initCla_DOT_ctc_DOT_tax_DOT_id();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !cla_DOT_ctc_DOT_tax_DOT_id.contains(obj))
					cla_DOT_ctc_DOT_tax_DOT_id.add(obj);
				java.util.ArrayList consumersForCla_DOT_ctc_DOT_tax_DOT_id;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCla_DOT_ctc_DOT_tax_DOT_id = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCla_DOT_ctc_DOT_tax_DOT_id.iterator();iter.hasNext();){
						CTCTaxonListener listener=(CTCTaxonListener)iter.next();
						listener.cla_DOT_ctc_DOT_tax_DOT_idAdded(CTCTaxonImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(ctcTaxonEntryProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _ctcTaxonEntry = null;
					if (ctcTaxonEntry != null) {
						boolean found = false;
						for (int i=0;i<ctcTaxonEntry.size();i++) {
							LangString __item = (LangString) ctcTaxonEntry.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_ctcTaxonEntry = __item;
								break;
							}
						}
						if (found)
							ctcTaxonEntry.remove(_ctcTaxonEntry);
						else {
							try {
								_ctcTaxonEntry = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_ctcTaxonEntry = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForCtcTaxonEntry;
						synchronized (listeners) {
							consumersForCtcTaxonEntry = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCtcTaxonEntry.iterator();iter.hasNext();){
							CTCTaxonListener listener=(CTCTaxonListener)iter.next();
							listener.ctcTaxonEntryRemoved(CTCTaxonImpl.this,_ctcTaxonEntry);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(cla_DOT_ctc_DOT_tax_DOT_idProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (cla_DOT_ctc_DOT_tax_DOT_id != null) {
					if (cla_DOT_ctc_DOT_tax_DOT_id.contains(obj))
						cla_DOT_ctc_DOT_tax_DOT_id.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CTCTaxonListener listener=(CTCTaxonListener)iter.next();
						listener.cla_DOT_ctc_DOT_tax_DOT_idRemoved(CTCTaxonImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}