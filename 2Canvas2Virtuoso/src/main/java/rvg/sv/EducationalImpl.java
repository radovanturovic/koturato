

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
 * Implementation of {@link Educational}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Educational)</p>
 * <br>
 */
public class EducationalImpl extends ThingImpl implements Educational {
	

	private static Property educationalLearningResourceTypeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#educationalLearningResourceType");
	private java.util.ArrayList educationalLearningResourceType;
 

	EducationalImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static EducationalImpl getEducational(Resource resource, Model model) throws JastorException {
		return new EducationalImpl(resource, model);
	}
	    
	static EducationalImpl createEducational(Resource resource, Model model) throws JastorException { 
		EducationalImpl impl = new EducationalImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Educational.TYPE)))
			impl._model.add(impl._resource, RDF.type, Educational.TYPE);
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
		it = _model.listStatements(_resource,educationalLearningResourceTypeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Educational.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		educationalLearningResourceType = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initEducationalLearningResourceType() throws JastorException {
		this.educationalLearningResourceType = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, educationalLearningResourceTypeProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#educationalLearningResourceType properties in Educational model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString educationalLearningResourceType = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.educationalLearningResourceType.add(educationalLearningResourceType);
			}
		}
	}

	public java.util.Iterator getEducationalLearningResourceType() throws JastorException {
		if (educationalLearningResourceType == null)
			initEducationalLearningResourceType();
		return new CachedPropertyIterator(educationalLearningResourceType,_resource,educationalLearningResourceTypeProperty,true);
	}

	public void addEducationalLearningResourceType(LangString educationalLearningResourceType) throws JastorException {
		if (this.educationalLearningResourceType == null)
			initEducationalLearningResourceType();
		if (this.educationalLearningResourceType.contains(educationalLearningResourceType)) {
			this.educationalLearningResourceType.remove(educationalLearningResourceType);
			this.educationalLearningResourceType.add(educationalLearningResourceType);
			return;
		}
		this.educationalLearningResourceType.add(educationalLearningResourceType);
		_model.add(_model.createStatement(_resource,educationalLearningResourceTypeProperty,educationalLearningResourceType.resource()));
	}
	
	public LangString addEducationalLearningResourceType() throws JastorException {
		LangString educationalLearningResourceType = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.educationalLearningResourceType == null)
			initEducationalLearningResourceType();
		this.educationalLearningResourceType.add(educationalLearningResourceType);
		_model.add(_model.createStatement(_resource,educationalLearningResourceTypeProperty,educationalLearningResourceType.resource()));
		return educationalLearningResourceType;
	}
	
	public LangString addEducationalLearningResourceType(Resource resource) throws JastorException {
		LangString educationalLearningResourceType = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.educationalLearningResourceType == null)
			initEducationalLearningResourceType();
		if (this.educationalLearningResourceType.contains(educationalLearningResourceType))
			return educationalLearningResourceType;
		this.educationalLearningResourceType.add(educationalLearningResourceType);
		_model.add(_model.createStatement(_resource,educationalLearningResourceTypeProperty,educationalLearningResourceType.resource()));
		return educationalLearningResourceType;
	}
	
	public void removeEducationalLearningResourceType(LangString educationalLearningResourceType) throws JastorException {
		if (this.educationalLearningResourceType == null)
			initEducationalLearningResourceType();
		if (!this.educationalLearningResourceType.contains(educationalLearningResourceType))
			return;
		if (!_model.contains(_resource, educationalLearningResourceTypeProperty, educationalLearningResourceType.resource()))
			return;
		this.educationalLearningResourceType.remove(educationalLearningResourceType);
		_model.removeAll(_resource, educationalLearningResourceTypeProperty, educationalLearningResourceType.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof EducationalListener))
			throw new IllegalArgumentException("ThingListener must be instance of EducationalListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((EducationalListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof EducationalListener))
			throw new IllegalArgumentException("ThingListener must be instance of EducationalListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(educationalLearningResourceTypeProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _educationalLearningResourceType = null;
					try {
						_educationalLearningResourceType = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (educationalLearningResourceType == null) {
						try {
							initEducationalLearningResourceType();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!educationalLearningResourceType.contains(_educationalLearningResourceType))
						educationalLearningResourceType.add(_educationalLearningResourceType);
					if (listeners != null) {
						java.util.ArrayList consumersForEducationalLearningResourceType;
						synchronized (listeners) {
							consumersForEducationalLearningResourceType = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEducationalLearningResourceType.iterator();iter.hasNext();){
							EducationalListener listener=(EducationalListener)iter.next();
							listener.educationalLearningResourceTypeAdded(EducationalImpl.this,_educationalLearningResourceType);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(educationalLearningResourceTypeProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _educationalLearningResourceType = null;
					if (educationalLearningResourceType != null) {
						boolean found = false;
						for (int i=0;i<educationalLearningResourceType.size();i++) {
							LangString __item = (LangString) educationalLearningResourceType.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_educationalLearningResourceType = __item;
								break;
							}
						}
						if (found)
							educationalLearningResourceType.remove(_educationalLearningResourceType);
						else {
							try {
								_educationalLearningResourceType = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_educationalLearningResourceType = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForEducationalLearningResourceType;
						synchronized (listeners) {
							consumersForEducationalLearningResourceType = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForEducationalLearningResourceType.iterator();iter.hasNext();){
							EducationalListener listener=(EducationalListener)iter.next();
							listener.educationalLearningResourceTypeRemoved(EducationalImpl.this,_educationalLearningResourceType);
						}
					}
				}
				return;
			}
		}

	//}
	


}