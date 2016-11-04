

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
 * Implementation of {@link Classification}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Classification)</p>
 * <br>
 */
public class ClassificationImpl extends ThingImpl implements Classification {
	

	private static Property classificationCTaxonPathProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#classificationCTaxonPath");
	private java.util.ArrayList classificationCTaxonPath;
	private static Property classificationPurposeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#classificationPurpose");
	private java.util.ArrayList classificationPurpose;
 

	ClassificationImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static ClassificationImpl getClassification(Resource resource, Model model) throws JastorException {
		return new ClassificationImpl(resource, model);
	}
	    
	static ClassificationImpl createClassification(Resource resource, Model model) throws JastorException { 
		ClassificationImpl impl = new ClassificationImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Classification.TYPE)))
			impl._model.add(impl._resource, RDF.type, Classification.TYPE);
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
		it = _model.listStatements(_resource,classificationCTaxonPathProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,classificationPurposeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Classification.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		classificationCTaxonPath = null;
		classificationPurpose = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initClassificationCTaxonPath() throws JastorException {
		this.classificationCTaxonPath = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, classificationCTaxonPathProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#classificationCTaxonPath properties in Classification model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				CTaxonCollection classificationCTaxonPath = rvg.sv.lom_DOT_owlFactory.getCTaxonCollection(resource,_model);
				this.classificationCTaxonPath.add(classificationCTaxonPath);
			}
		}
	}

	public java.util.Iterator getClassificationCTaxonPath() throws JastorException {
		if (classificationCTaxonPath == null)
			initClassificationCTaxonPath();
		return new CachedPropertyIterator(classificationCTaxonPath,_resource,classificationCTaxonPathProperty,true);
	}

	public void addClassificationCTaxonPath(CTaxonCollection classificationCTaxonPath) throws JastorException {
		if (this.classificationCTaxonPath == null)
			initClassificationCTaxonPath();
		if (this.classificationCTaxonPath.contains(classificationCTaxonPath)) {
			this.classificationCTaxonPath.remove(classificationCTaxonPath);
			this.classificationCTaxonPath.add(classificationCTaxonPath);
			return;
		}
		this.classificationCTaxonPath.add(classificationCTaxonPath);
		_model.add(_model.createStatement(_resource,classificationCTaxonPathProperty,classificationCTaxonPath.resource()));
	}
	
	public CTaxonCollection addClassificationCTaxonPath() throws JastorException {
		CTaxonCollection classificationCTaxonPath = rvg.sv.lom_DOT_owlFactory.createCTaxonCollection(_model.createResource(),_model);
		if (this.classificationCTaxonPath == null)
			initClassificationCTaxonPath();
		this.classificationCTaxonPath.add(classificationCTaxonPath);
		_model.add(_model.createStatement(_resource,classificationCTaxonPathProperty,classificationCTaxonPath.resource()));
		return classificationCTaxonPath;
	}
	
	public CTaxonCollection addClassificationCTaxonPath(Resource resource) throws JastorException {
		CTaxonCollection classificationCTaxonPath = rvg.sv.lom_DOT_owlFactory.getCTaxonCollection(resource,_model);
		if (this.classificationCTaxonPath == null)
			initClassificationCTaxonPath();
		if (this.classificationCTaxonPath.contains(classificationCTaxonPath))
			return classificationCTaxonPath;
		this.classificationCTaxonPath.add(classificationCTaxonPath);
		_model.add(_model.createStatement(_resource,classificationCTaxonPathProperty,classificationCTaxonPath.resource()));
		return classificationCTaxonPath;
	}
	
	public void removeClassificationCTaxonPath(CTaxonCollection classificationCTaxonPath) throws JastorException {
		if (this.classificationCTaxonPath == null)
			initClassificationCTaxonPath();
		if (!this.classificationCTaxonPath.contains(classificationCTaxonPath))
			return;
		if (!_model.contains(_resource, classificationCTaxonPathProperty, classificationCTaxonPath.resource()))
			return;
		this.classificationCTaxonPath.remove(classificationCTaxonPath);
		_model.removeAll(_resource, classificationCTaxonPathProperty, classificationCTaxonPath.resource());
	}
		 

	private void initClassificationPurpose() throws JastorException {
		this.classificationPurpose = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, classificationPurposeProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#classificationPurpose properties in Classification model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				Vocabulary classificationPurpose = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
				this.classificationPurpose.add(classificationPurpose);
			}
		}
	}

	public java.util.Iterator getClassificationPurpose() throws JastorException {
		if (classificationPurpose == null)
			initClassificationPurpose();
		return new CachedPropertyIterator(classificationPurpose,_resource,classificationPurposeProperty,true);
	}

	public void addClassificationPurpose(Vocabulary classificationPurpose) throws JastorException {
		if (this.classificationPurpose == null)
			initClassificationPurpose();
		if (this.classificationPurpose.contains(classificationPurpose)) {
			this.classificationPurpose.remove(classificationPurpose);
			this.classificationPurpose.add(classificationPurpose);
			return;
		}
		this.classificationPurpose.add(classificationPurpose);
		_model.add(_model.createStatement(_resource,classificationPurposeProperty,classificationPurpose.resource()));
	}
	
	public Vocabulary addClassificationPurpose() throws JastorException {
		Vocabulary classificationPurpose = rvg.sv.lom_DOT_owlFactory.createVocabulary(_model.createResource(),_model);
		if (this.classificationPurpose == null)
			initClassificationPurpose();
		this.classificationPurpose.add(classificationPurpose);
		_model.add(_model.createStatement(_resource,classificationPurposeProperty,classificationPurpose.resource()));
		return classificationPurpose;
	}
	
	public Vocabulary addClassificationPurpose(Resource resource) throws JastorException {
		Vocabulary classificationPurpose = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
		if (this.classificationPurpose == null)
			initClassificationPurpose();
		if (this.classificationPurpose.contains(classificationPurpose))
			return classificationPurpose;
		this.classificationPurpose.add(classificationPurpose);
		_model.add(_model.createStatement(_resource,classificationPurposeProperty,classificationPurpose.resource()));
		return classificationPurpose;
	}
	
	public void removeClassificationPurpose(Vocabulary classificationPurpose) throws JastorException {
		if (this.classificationPurpose == null)
			initClassificationPurpose();
		if (!this.classificationPurpose.contains(classificationPurpose))
			return;
		if (!_model.contains(_resource, classificationPurposeProperty, classificationPurpose.resource()))
			return;
		this.classificationPurpose.remove(classificationPurpose);
		_model.removeAll(_resource, classificationPurposeProperty, classificationPurpose.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof ClassificationListener))
			throw new IllegalArgumentException("ThingListener must be instance of ClassificationListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((ClassificationListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof ClassificationListener))
			throw new IllegalArgumentException("ThingListener must be instance of ClassificationListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(classificationCTaxonPathProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					CTaxonCollection _classificationCTaxonPath = null;
					try {
						_classificationCTaxonPath = rvg.sv.lom_DOT_owlFactory.getCTaxonCollection(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (classificationCTaxonPath == null) {
						try {
							initClassificationCTaxonPath();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!classificationCTaxonPath.contains(_classificationCTaxonPath))
						classificationCTaxonPath.add(_classificationCTaxonPath);
					if (listeners != null) {
						java.util.ArrayList consumersForClassificationCTaxonPath;
						synchronized (listeners) {
							consumersForClassificationCTaxonPath = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForClassificationCTaxonPath.iterator();iter.hasNext();){
							ClassificationListener listener=(ClassificationListener)iter.next();
							listener.classificationCTaxonPathAdded(ClassificationImpl.this,_classificationCTaxonPath);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(classificationPurposeProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _classificationPurpose = null;
					try {
						_classificationPurpose = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (classificationPurpose == null) {
						try {
							initClassificationPurpose();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!classificationPurpose.contains(_classificationPurpose))
						classificationPurpose.add(_classificationPurpose);
					if (listeners != null) {
						java.util.ArrayList consumersForClassificationPurpose;
						synchronized (listeners) {
							consumersForClassificationPurpose = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForClassificationPurpose.iterator();iter.hasNext();){
							ClassificationListener listener=(ClassificationListener)iter.next();
							listener.classificationPurposeAdded(ClassificationImpl.this,_classificationPurpose);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(classificationCTaxonPathProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					CTaxonCollection _classificationCTaxonPath = null;
					if (classificationCTaxonPath != null) {
						boolean found = false;
						for (int i=0;i<classificationCTaxonPath.size();i++) {
							CTaxonCollection __item = (CTaxonCollection) classificationCTaxonPath.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_classificationCTaxonPath = __item;
								break;
							}
						}
						if (found)
							classificationCTaxonPath.remove(_classificationCTaxonPath);
						else {
							try {
								_classificationCTaxonPath = rvg.sv.lom_DOT_owlFactory.getCTaxonCollection(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_classificationCTaxonPath = rvg.sv.lom_DOT_owlFactory.getCTaxonCollection(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForClassificationCTaxonPath;
						synchronized (listeners) {
							consumersForClassificationCTaxonPath = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForClassificationCTaxonPath.iterator();iter.hasNext();){
							ClassificationListener listener=(ClassificationListener)iter.next();
							listener.classificationCTaxonPathRemoved(ClassificationImpl.this,_classificationCTaxonPath);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(classificationPurposeProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _classificationPurpose = null;
					if (classificationPurpose != null) {
						boolean found = false;
						for (int i=0;i<classificationPurpose.size();i++) {
							Vocabulary __item = (Vocabulary) classificationPurpose.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_classificationPurpose = __item;
								break;
							}
						}
						if (found)
							classificationPurpose.remove(_classificationPurpose);
						else {
							try {
								_classificationPurpose = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_classificationPurpose = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForClassificationPurpose;
						synchronized (listeners) {
							consumersForClassificationPurpose = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForClassificationPurpose.iterator();iter.hasNext();){
							ClassificationListener listener=(ClassificationListener)iter.next();
							listener.classificationPurposeRemoved(ClassificationImpl.this,_classificationPurpose);
						}
					}
				}
				return;
			}
		}

	//}
	


}