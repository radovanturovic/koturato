

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
 * Implementation of {@link GIdentifier}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#GIdentifier)</p>
 * <br>
 */
public class GIdentifierImpl extends ThingImpl implements GIdentifier {
	

	private static Property gen_DOT_ide_DOT_catalogProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#gen.ide.catalog");
	private java.util.ArrayList gen_DOT_ide_DOT_catalog;
	private static Property gen_DOT_ide_DOT_entryProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#gen.ide.entry");
	private java.util.ArrayList gen_DOT_ide_DOT_entry;
 

	GIdentifierImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static GIdentifierImpl getGIdentifier(Resource resource, Model model) throws JastorException {
		return new GIdentifierImpl(resource, model);
	}
	    
	static GIdentifierImpl createGIdentifier(Resource resource, Model model) throws JastorException { 
		GIdentifierImpl impl = new GIdentifierImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, GIdentifier.TYPE)))
			impl._model.add(impl._resource, RDF.type, GIdentifier.TYPE);
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
		it = _model.listStatements(_resource,gen_DOT_ide_DOT_catalogProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,gen_DOT_ide_DOT_entryProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, GIdentifier.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		gen_DOT_ide_DOT_catalog = null;
		gen_DOT_ide_DOT_entry = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initGen_DOT_ide_DOT_catalog() throws JastorException {
		gen_DOT_ide_DOT_catalog = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, gen_DOT_ide_DOT_catalogProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#gen.ide.catalog properties in GIdentifier model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				gen_DOT_ide_DOT_catalog.add(obj);
		}
	}

	public java.util.Iterator getGen_DOT_ide_DOT_catalog() throws JastorException {
		if (gen_DOT_ide_DOT_catalog == null)
			initGen_DOT_ide_DOT_catalog();
		return new CachedPropertyIterator(gen_DOT_ide_DOT_catalog,_resource,gen_DOT_ide_DOT_catalogProperty,false);
	}

	public void addGen_DOT_ide_DOT_catalog(String gen_DOT_ide_DOT_catalog) throws JastorException {
		if (this.gen_DOT_ide_DOT_catalog == null)
			initGen_DOT_ide_DOT_catalog();
		if (this.gen_DOT_ide_DOT_catalog.contains(gen_DOT_ide_DOT_catalog))
			return;
		if (_model.contains(_resource, gen_DOT_ide_DOT_catalogProperty, createLiteral(gen_DOT_ide_DOT_catalog)))
			return;
		this.gen_DOT_ide_DOT_catalog.add(gen_DOT_ide_DOT_catalog);
		_model.add(_resource, gen_DOT_ide_DOT_catalogProperty, createLiteral(gen_DOT_ide_DOT_catalog));
	}
	
	public void removeGen_DOT_ide_DOT_catalog(String gen_DOT_ide_DOT_catalog) throws JastorException {
		if (this.gen_DOT_ide_DOT_catalog == null)
			initGen_DOT_ide_DOT_catalog();
		if (!this.gen_DOT_ide_DOT_catalog.contains(gen_DOT_ide_DOT_catalog))
			return;
		if (!_model.contains(_resource, gen_DOT_ide_DOT_catalogProperty, createLiteral(gen_DOT_ide_DOT_catalog)))
			return;
		this.gen_DOT_ide_DOT_catalog.remove(gen_DOT_ide_DOT_catalog);
		_model.removeAll(_resource, gen_DOT_ide_DOT_catalogProperty, createLiteral(gen_DOT_ide_DOT_catalog));
	}


	private void initGen_DOT_ide_DOT_entry() throws JastorException {
		gen_DOT_ide_DOT_entry = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, gen_DOT_ide_DOT_entryProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#gen.ide.entry properties in GIdentifier model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				gen_DOT_ide_DOT_entry.add(obj);
		}
	}

	public java.util.Iterator getGen_DOT_ide_DOT_entry() throws JastorException {
		if (gen_DOT_ide_DOT_entry == null)
			initGen_DOT_ide_DOT_entry();
		return new CachedPropertyIterator(gen_DOT_ide_DOT_entry,_resource,gen_DOT_ide_DOT_entryProperty,false);
	}

	public void addGen_DOT_ide_DOT_entry(String gen_DOT_ide_DOT_entry) throws JastorException {
		if (this.gen_DOT_ide_DOT_entry == null)
			initGen_DOT_ide_DOT_entry();
		if (this.gen_DOT_ide_DOT_entry.contains(gen_DOT_ide_DOT_entry))
			return;
		if (_model.contains(_resource, gen_DOT_ide_DOT_entryProperty, createLiteral(gen_DOT_ide_DOT_entry)))
			return;
		this.gen_DOT_ide_DOT_entry.add(gen_DOT_ide_DOT_entry);
		_model.add(_resource, gen_DOT_ide_DOT_entryProperty, createLiteral(gen_DOT_ide_DOT_entry));
	}
	
	public void removeGen_DOT_ide_DOT_entry(String gen_DOT_ide_DOT_entry) throws JastorException {
		if (this.gen_DOT_ide_DOT_entry == null)
			initGen_DOT_ide_DOT_entry();
		if (!this.gen_DOT_ide_DOT_entry.contains(gen_DOT_ide_DOT_entry))
			return;
		if (!_model.contains(_resource, gen_DOT_ide_DOT_entryProperty, createLiteral(gen_DOT_ide_DOT_entry)))
			return;
		this.gen_DOT_ide_DOT_entry.remove(gen_DOT_ide_DOT_entry);
		_model.removeAll(_resource, gen_DOT_ide_DOT_entryProperty, createLiteral(gen_DOT_ide_DOT_entry));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof GIdentifierListener))
			throw new IllegalArgumentException("ThingListener must be instance of GIdentifierListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((GIdentifierListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof GIdentifierListener))
			throw new IllegalArgumentException("ThingListener must be instance of GIdentifierListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(gen_DOT_ide_DOT_catalogProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gen_DOT_ide_DOT_catalog == null) {
					try {
						initGen_DOT_ide_DOT_catalog();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !gen_DOT_ide_DOT_catalog.contains(obj))
					gen_DOT_ide_DOT_catalog.add(obj);
				java.util.ArrayList consumersForGen_DOT_ide_DOT_catalog;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForGen_DOT_ide_DOT_catalog = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGen_DOT_ide_DOT_catalog.iterator();iter.hasNext();){
						GIdentifierListener listener=(GIdentifierListener)iter.next();
						listener.gen_DOT_ide_DOT_catalogAdded(GIdentifierImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(gen_DOT_ide_DOT_entryProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gen_DOT_ide_DOT_entry == null) {
					try {
						initGen_DOT_ide_DOT_entry();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !gen_DOT_ide_DOT_entry.contains(obj))
					gen_DOT_ide_DOT_entry.add(obj);
				java.util.ArrayList consumersForGen_DOT_ide_DOT_entry;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForGen_DOT_ide_DOT_entry = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGen_DOT_ide_DOT_entry.iterator();iter.hasNext();){
						GIdentifierListener listener=(GIdentifierListener)iter.next();
						listener.gen_DOT_ide_DOT_entryAdded(GIdentifierImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(gen_DOT_ide_DOT_catalogProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gen_DOT_ide_DOT_catalog != null) {
					if (gen_DOT_ide_DOT_catalog.contains(obj))
						gen_DOT_ide_DOT_catalog.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						GIdentifierListener listener=(GIdentifierListener)iter.next();
						listener.gen_DOT_ide_DOT_catalogRemoved(GIdentifierImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(gen_DOT_ide_DOT_entryProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gen_DOT_ide_DOT_entry != null) {
					if (gen_DOT_ide_DOT_entry.contains(obj))
						gen_DOT_ide_DOT_entry.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						GIdentifierListener listener=(GIdentifierListener)iter.next();
						listener.gen_DOT_ide_DOT_entryRemoved(GIdentifierImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}