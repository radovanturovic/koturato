

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
 * Implementation of {@link Vocabulary}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Vocabulary)</p>
 * <br>
 */
public class VocabularyImpl extends ThingImpl implements Vocabulary {
	

	private static Property dat_DOT_voc_DOT_sourceProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.voc.source");
	private java.util.ArrayList dat_DOT_voc_DOT_source;
	private static Property dat_DOT_voc_DOT_valueProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.voc.value");
	private java.util.ArrayList dat_DOT_voc_DOT_value;
 

	VocabularyImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static VocabularyImpl getVocabulary(Resource resource, Model model) throws JastorException {
		return new VocabularyImpl(resource, model);
	}
	    
	static VocabularyImpl createVocabulary(Resource resource, Model model) throws JastorException { 
		VocabularyImpl impl = new VocabularyImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Vocabulary.TYPE)))
			impl._model.add(impl._resource, RDF.type, Vocabulary.TYPE);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
		if (!_model.contains(_resource, RDF.type, Data.TYPE))
			_model.add(new org.apache.jena.rdf.model.impl.StatementImpl(_resource, RDF.type, Data.TYPE));
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
		it = _model.listStatements(_resource,dat_DOT_voc_DOT_sourceProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dat_DOT_voc_DOT_valueProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Vocabulary.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Data.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		dat_DOT_voc_DOT_source = null;
		dat_DOT_voc_DOT_value = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initDat_DOT_voc_DOT_source() throws JastorException {
		dat_DOT_voc_DOT_source = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dat_DOT_voc_DOT_sourceProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dat.voc.source properties in Vocabulary model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dat_DOT_voc_DOT_source.add(obj);
		}
	}

	public java.util.Iterator getDat_DOT_voc_DOT_source() throws JastorException {
		if (dat_DOT_voc_DOT_source == null)
			initDat_DOT_voc_DOT_source();
		return new CachedPropertyIterator(dat_DOT_voc_DOT_source,_resource,dat_DOT_voc_DOT_sourceProperty,false);
	}

	public void addDat_DOT_voc_DOT_source(String dat_DOT_voc_DOT_source) throws JastorException {
		if (this.dat_DOT_voc_DOT_source == null)
			initDat_DOT_voc_DOT_source();
		if (this.dat_DOT_voc_DOT_source.contains(dat_DOT_voc_DOT_source))
			return;
		if (_model.contains(_resource, dat_DOT_voc_DOT_sourceProperty, createLiteral(dat_DOT_voc_DOT_source)))
			return;
		this.dat_DOT_voc_DOT_source.add(dat_DOT_voc_DOT_source);
		_model.add(_resource, dat_DOT_voc_DOT_sourceProperty, createLiteral(dat_DOT_voc_DOT_source));
	}
	
	public void removeDat_DOT_voc_DOT_source(String dat_DOT_voc_DOT_source) throws JastorException {
		if (this.dat_DOT_voc_DOT_source == null)
			initDat_DOT_voc_DOT_source();
		if (!this.dat_DOT_voc_DOT_source.contains(dat_DOT_voc_DOT_source))
			return;
		if (!_model.contains(_resource, dat_DOT_voc_DOT_sourceProperty, createLiteral(dat_DOT_voc_DOT_source)))
			return;
		this.dat_DOT_voc_DOT_source.remove(dat_DOT_voc_DOT_source);
		_model.removeAll(_resource, dat_DOT_voc_DOT_sourceProperty, createLiteral(dat_DOT_voc_DOT_source));
	}


	private void initDat_DOT_voc_DOT_value() throws JastorException {
		dat_DOT_voc_DOT_value = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dat_DOT_voc_DOT_valueProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dat.voc.value properties in Vocabulary model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dat_DOT_voc_DOT_value.add(obj);
		}
	}

	public java.util.Iterator getDat_DOT_voc_DOT_value() throws JastorException {
		if (dat_DOT_voc_DOT_value == null)
			initDat_DOT_voc_DOT_value();
		return new CachedPropertyIterator(dat_DOT_voc_DOT_value,_resource,dat_DOT_voc_DOT_valueProperty,false);
	}

	public void addDat_DOT_voc_DOT_value(String dat_DOT_voc_DOT_value) throws JastorException {
		if (this.dat_DOT_voc_DOT_value == null)
			initDat_DOT_voc_DOT_value();
		if (this.dat_DOT_voc_DOT_value.contains(dat_DOT_voc_DOT_value))
			return;
		if (_model.contains(_resource, dat_DOT_voc_DOT_valueProperty, createLiteral(dat_DOT_voc_DOT_value)))
			return;
		this.dat_DOT_voc_DOT_value.add(dat_DOT_voc_DOT_value);
		_model.add(_resource, dat_DOT_voc_DOT_valueProperty, createLiteral(dat_DOT_voc_DOT_value));
	}
	
	public void removeDat_DOT_voc_DOT_value(String dat_DOT_voc_DOT_value) throws JastorException {
		if (this.dat_DOT_voc_DOT_value == null)
			initDat_DOT_voc_DOT_value();
		if (!this.dat_DOT_voc_DOT_value.contains(dat_DOT_voc_DOT_value))
			return;
		if (!_model.contains(_resource, dat_DOT_voc_DOT_valueProperty, createLiteral(dat_DOT_voc_DOT_value)))
			return;
		this.dat_DOT_voc_DOT_value.remove(dat_DOT_voc_DOT_value);
		_model.removeAll(_resource, dat_DOT_voc_DOT_valueProperty, createLiteral(dat_DOT_voc_DOT_value));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof VocabularyListener))
			throw new IllegalArgumentException("ThingListener must be instance of VocabularyListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((VocabularyListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof VocabularyListener))
			throw new IllegalArgumentException("ThingListener must be instance of VocabularyListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(dat_DOT_voc_DOT_sourceProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_voc_DOT_source == null) {
					try {
						initDat_DOT_voc_DOT_source();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dat_DOT_voc_DOT_source.contains(obj))
					dat_DOT_voc_DOT_source.add(obj);
				java.util.ArrayList consumersForDat_DOT_voc_DOT_source;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDat_DOT_voc_DOT_source = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDat_DOT_voc_DOT_source.iterator();iter.hasNext();){
						VocabularyListener listener=(VocabularyListener)iter.next();
						listener.dat_DOT_voc_DOT_sourceAdded(VocabularyImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dat_DOT_voc_DOT_valueProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_voc_DOT_value == null) {
					try {
						initDat_DOT_voc_DOT_value();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dat_DOT_voc_DOT_value.contains(obj))
					dat_DOT_voc_DOT_value.add(obj);
				java.util.ArrayList consumersForDat_DOT_voc_DOT_value;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDat_DOT_voc_DOT_value = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDat_DOT_voc_DOT_value.iterator();iter.hasNext();){
						VocabularyListener listener=(VocabularyListener)iter.next();
						listener.dat_DOT_voc_DOT_valueAdded(VocabularyImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(dat_DOT_voc_DOT_sourceProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_voc_DOT_source != null) {
					if (dat_DOT_voc_DOT_source.contains(obj))
						dat_DOT_voc_DOT_source.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VocabularyListener listener=(VocabularyListener)iter.next();
						listener.dat_DOT_voc_DOT_sourceRemoved(VocabularyImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dat_DOT_voc_DOT_valueProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_voc_DOT_value != null) {
					if (dat_DOT_voc_DOT_value.contains(obj))
						dat_DOT_voc_DOT_value.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						VocabularyListener listener=(VocabularyListener)iter.next();
						listener.dat_DOT_voc_DOT_valueRemoved(VocabularyImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}