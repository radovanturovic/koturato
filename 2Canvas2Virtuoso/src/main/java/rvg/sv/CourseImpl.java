

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
 * Implementation of {@link Course}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Course)</p>
 * <br>
 */
public class CourseImpl extends ThingImpl implements Course {
	

	private static Property courseLomProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#courseLom");
	private java.util.ArrayList courseLom;
	private static Property crs_DOT_nameProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#crs.name");
	private java.util.ArrayList crs_DOT_name;
 

	CourseImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static CourseImpl getCourse(Resource resource, Model model) throws JastorException {
		return new CourseImpl(resource, model);
	}
	    
	static CourseImpl createCourse(Resource resource, Model model) throws JastorException { 
		CourseImpl impl = new CourseImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Course.TYPE)))
			impl._model.add(impl._resource, RDF.type, Course.TYPE);
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
		it = _model.listStatements(_resource,courseLomProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,crs_DOT_nameProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Course.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		courseLom = null;
		crs_DOT_name = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initCourseLom() throws JastorException {
		this.courseLom = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, courseLomProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#courseLom properties in Course model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LOM courseLom = rvg.sv.lom_DOT_owlFactory.getLOM(resource,_model);
				this.courseLom.add(courseLom);
			}
		}
	}

	public java.util.Iterator getCourseLom() throws JastorException {
		if (courseLom == null)
			initCourseLom();
		return new CachedPropertyIterator(courseLom,_resource,courseLomProperty,true);
	}

	public void addCourseLom(LOM courseLom) throws JastorException {
		if (this.courseLom == null)
			initCourseLom();
		if (this.courseLom.contains(courseLom)) {
			this.courseLom.remove(courseLom);
			this.courseLom.add(courseLom);
			return;
		}
		this.courseLom.add(courseLom);
		_model.add(_model.createStatement(_resource,courseLomProperty,courseLom.resource()));
	}
	
	public LOM addCourseLom() throws JastorException {
		LOM courseLom = rvg.sv.lom_DOT_owlFactory.createLOM(_model.createResource(),_model);
		if (this.courseLom == null)
			initCourseLom();
		this.courseLom.add(courseLom);
		_model.add(_model.createStatement(_resource,courseLomProperty,courseLom.resource()));
		return courseLom;
	}
	
	public LOM addCourseLom(Resource resource) throws JastorException {
		LOM courseLom = rvg.sv.lom_DOT_owlFactory.getLOM(resource,_model);
		if (this.courseLom == null)
			initCourseLom();
		if (this.courseLom.contains(courseLom))
			return courseLom;
		this.courseLom.add(courseLom);
		_model.add(_model.createStatement(_resource,courseLomProperty,courseLom.resource()));
		return courseLom;
	}
	
	public void removeCourseLom(LOM courseLom) throws JastorException {
		if (this.courseLom == null)
			initCourseLom();
		if (!this.courseLom.contains(courseLom))
			return;
		if (!_model.contains(_resource, courseLomProperty, courseLom.resource()))
			return;
		this.courseLom.remove(courseLom);
		_model.removeAll(_resource, courseLomProperty, courseLom.resource());
	}
		 

	private void initCrs_DOT_name() throws JastorException {
		crs_DOT_name = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, crs_DOT_nameProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#crs.name properties in Course model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				crs_DOT_name.add(obj);
		}
	}

	public java.util.Iterator getCrs_DOT_name() throws JastorException {
		if (crs_DOT_name == null)
			initCrs_DOT_name();
		return new CachedPropertyIterator(crs_DOT_name,_resource,crs_DOT_nameProperty,false);
	}

	public void addCrs_DOT_name(String crs_DOT_name) throws JastorException {
		if (this.crs_DOT_name == null)
			initCrs_DOT_name();
		if (this.crs_DOT_name.contains(crs_DOT_name))
			return;
		if (_model.contains(_resource, crs_DOT_nameProperty, createLiteral(crs_DOT_name)))
			return;
		this.crs_DOT_name.add(crs_DOT_name);
		_model.add(_resource, crs_DOT_nameProperty, createLiteral(crs_DOT_name));
	}
	
	public void removeCrs_DOT_name(String crs_DOT_name) throws JastorException {
		if (this.crs_DOT_name == null)
			initCrs_DOT_name();
		if (!this.crs_DOT_name.contains(crs_DOT_name))
			return;
		if (!_model.contains(_resource, crs_DOT_nameProperty, createLiteral(crs_DOT_name)))
			return;
		this.crs_DOT_name.remove(crs_DOT_name);
		_model.removeAll(_resource, crs_DOT_nameProperty, createLiteral(crs_DOT_name));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof CourseListener))
			throw new IllegalArgumentException("ThingListener must be instance of CourseListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((CourseListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof CourseListener))
			throw new IllegalArgumentException("ThingListener must be instance of CourseListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(courseLomProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LOM _courseLom = null;
					try {
						_courseLom = rvg.sv.lom_DOT_owlFactory.getLOM(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (courseLom == null) {
						try {
							initCourseLom();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!courseLom.contains(_courseLom))
						courseLom.add(_courseLom);
					if (listeners != null) {
						java.util.ArrayList consumersForCourseLom;
						synchronized (listeners) {
							consumersForCourseLom = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCourseLom.iterator();iter.hasNext();){
							CourseListener listener=(CourseListener)iter.next();
							listener.courseLomAdded(CourseImpl.this,_courseLom);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(crs_DOT_nameProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (crs_DOT_name == null) {
					try {
						initCrs_DOT_name();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !crs_DOT_name.contains(obj))
					crs_DOT_name.add(obj);
				java.util.ArrayList consumersForCrs_DOT_name;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForCrs_DOT_name = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForCrs_DOT_name.iterator();iter.hasNext();){
						CourseListener listener=(CourseListener)iter.next();
						listener.crs_DOT_nameAdded(CourseImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(courseLomProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LOM _courseLom = null;
					if (courseLom != null) {
						boolean found = false;
						for (int i=0;i<courseLom.size();i++) {
							LOM __item = (LOM) courseLom.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_courseLom = __item;
								break;
							}
						}
						if (found)
							courseLom.remove(_courseLom);
						else {
							try {
								_courseLom = rvg.sv.lom_DOT_owlFactory.getLOM(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_courseLom = rvg.sv.lom_DOT_owlFactory.getLOM(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForCourseLom;
						synchronized (listeners) {
							consumersForCourseLom = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForCourseLom.iterator();iter.hasNext();){
							CourseListener listener=(CourseListener)iter.next();
							listener.courseLomRemoved(CourseImpl.this,_courseLom);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(crs_DOT_nameProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (crs_DOT_name != null) {
					if (crs_DOT_name.contains(obj))
						crs_DOT_name.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						CourseListener listener=(CourseListener)iter.next();
						listener.crs_DOT_nameRemoved(CourseImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}