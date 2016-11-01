

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
 * Implementation of {@link LangString}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#LangString)</p>
 * <br>
 */
public class LangStringImpl extends ThingImpl implements LangString {
	

	private static Property dat_DOT_las_DOT_languageProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.las.language");
	private java.util.ArrayList dat_DOT_las_DOT_language;
	private static Property dat_DOT_las_DOT_stringProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.las.string");
	private java.util.ArrayList dat_DOT_las_DOT_string;
 

	LangStringImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static LangStringImpl getLangString(Resource resource, Model model) throws JastorException {
		return new LangStringImpl(resource, model);
	}
	    
	static LangStringImpl createLangString(Resource resource, Model model) throws JastorException { 
		LangStringImpl impl = new LangStringImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, LangString.TYPE)))
			impl._model.add(impl._resource, RDF.type, LangString.TYPE);
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
		it = _model.listStatements(_resource,dat_DOT_las_DOT_languageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dat_DOT_las_DOT_stringProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, LangString.TYPE);
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
		dat_DOT_las_DOT_language = null;
		dat_DOT_las_DOT_string = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initDat_DOT_las_DOT_language() throws JastorException {
		dat_DOT_las_DOT_language = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dat_DOT_las_DOT_languageProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dat.las.language properties in LangString model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dat_DOT_las_DOT_language.add(obj);
		}
	}

	public java.util.Iterator getDat_DOT_las_DOT_language() throws JastorException {
		if (dat_DOT_las_DOT_language == null)
			initDat_DOT_las_DOT_language();
		return new CachedPropertyIterator(dat_DOT_las_DOT_language,_resource,dat_DOT_las_DOT_languageProperty,false);
	}

	public void addDat_DOT_las_DOT_language(String dat_DOT_las_DOT_language) throws JastorException {
		if (this.dat_DOT_las_DOT_language == null)
			initDat_DOT_las_DOT_language();
		if (this.dat_DOT_las_DOT_language.contains(dat_DOT_las_DOT_language))
			return;
		if (_model.contains(_resource, dat_DOT_las_DOT_languageProperty, createLiteral(dat_DOT_las_DOT_language)))
			return;
		this.dat_DOT_las_DOT_language.add(dat_DOT_las_DOT_language);
		_model.add(_resource, dat_DOT_las_DOT_languageProperty, createLiteral(dat_DOT_las_DOT_language));
	}
	
	public void removeDat_DOT_las_DOT_language(String dat_DOT_las_DOT_language) throws JastorException {
		if (this.dat_DOT_las_DOT_language == null)
			initDat_DOT_las_DOT_language();
		if (!this.dat_DOT_las_DOT_language.contains(dat_DOT_las_DOT_language))
			return;
		if (!_model.contains(_resource, dat_DOT_las_DOT_languageProperty, createLiteral(dat_DOT_las_DOT_language)))
			return;
		this.dat_DOT_las_DOT_language.remove(dat_DOT_las_DOT_language);
		_model.removeAll(_resource, dat_DOT_las_DOT_languageProperty, createLiteral(dat_DOT_las_DOT_language));
	}


	private void initDat_DOT_las_DOT_string() throws JastorException {
		dat_DOT_las_DOT_string = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dat_DOT_las_DOT_stringProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dat.las.string properties in LangString model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dat_DOT_las_DOT_string.add(obj);
		}
	}

	public java.util.Iterator getDat_DOT_las_DOT_string() throws JastorException {
		if (dat_DOT_las_DOT_string == null)
			initDat_DOT_las_DOT_string();
		return new CachedPropertyIterator(dat_DOT_las_DOT_string,_resource,dat_DOT_las_DOT_stringProperty,false);
	}

	public void addDat_DOT_las_DOT_string(String dat_DOT_las_DOT_string) throws JastorException {
		if (this.dat_DOT_las_DOT_string == null)
			initDat_DOT_las_DOT_string();
		if (this.dat_DOT_las_DOT_string.contains(dat_DOT_las_DOT_string))
			return;
		if (_model.contains(_resource, dat_DOT_las_DOT_stringProperty, createLiteral(dat_DOT_las_DOT_string)))
			return;
		this.dat_DOT_las_DOT_string.add(dat_DOT_las_DOT_string);
		_model.add(_resource, dat_DOT_las_DOT_stringProperty, createLiteral(dat_DOT_las_DOT_string));
	}
	
	public void removeDat_DOT_las_DOT_string(String dat_DOT_las_DOT_string) throws JastorException {
		if (this.dat_DOT_las_DOT_string == null)
			initDat_DOT_las_DOT_string();
		if (!this.dat_DOT_las_DOT_string.contains(dat_DOT_las_DOT_string))
			return;
		if (!_model.contains(_resource, dat_DOT_las_DOT_stringProperty, createLiteral(dat_DOT_las_DOT_string)))
			return;
		this.dat_DOT_las_DOT_string.remove(dat_DOT_las_DOT_string);
		_model.removeAll(_resource, dat_DOT_las_DOT_stringProperty, createLiteral(dat_DOT_las_DOT_string));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof LangStringListener))
			throw new IllegalArgumentException("ThingListener must be instance of LangStringListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((LangStringListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof LangStringListener))
			throw new IllegalArgumentException("ThingListener must be instance of LangStringListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(dat_DOT_las_DOT_languageProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_las_DOT_language == null) {
					try {
						initDat_DOT_las_DOT_language();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dat_DOT_las_DOT_language.contains(obj))
					dat_DOT_las_DOT_language.add(obj);
				java.util.ArrayList consumersForDat_DOT_las_DOT_language;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDat_DOT_las_DOT_language = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDat_DOT_las_DOT_language.iterator();iter.hasNext();){
						LangStringListener listener=(LangStringListener)iter.next();
						listener.dat_DOT_las_DOT_languageAdded(LangStringImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dat_DOT_las_DOT_stringProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_las_DOT_string == null) {
					try {
						initDat_DOT_las_DOT_string();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dat_DOT_las_DOT_string.contains(obj))
					dat_DOT_las_DOT_string.add(obj);
				java.util.ArrayList consumersForDat_DOT_las_DOT_string;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDat_DOT_las_DOT_string = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDat_DOT_las_DOT_string.iterator();iter.hasNext();){
						LangStringListener listener=(LangStringListener)iter.next();
						listener.dat_DOT_las_DOT_stringAdded(LangStringImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(dat_DOT_las_DOT_languageProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_las_DOT_language != null) {
					if (dat_DOT_las_DOT_language.contains(obj))
						dat_DOT_las_DOT_language.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						LangStringListener listener=(LangStringListener)iter.next();
						listener.dat_DOT_las_DOT_languageRemoved(LangStringImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dat_DOT_las_DOT_stringProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_las_DOT_string != null) {
					if (dat_DOT_las_DOT_string.contains(obj))
						dat_DOT_las_DOT_string.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						LangStringListener listener=(LangStringListener)iter.next();
						listener.dat_DOT_las_DOT_stringRemoved(LangStringImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}