

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
 * Implementation of {@link LifeCycle}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#LifeCycle)</p>
 * <br>
 */
public class LifeCycleImpl extends ThingImpl implements LifeCycle {
	

	private static Property lifeCycleContributeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lifeCycleContribute");
	private java.util.ArrayList lifeCycleContribute;
	private static Property lifeCycleVersionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lifeCycleVersion");
	private java.util.ArrayList lifeCycleVersion;
	private static Property lifeCycleStatusProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lifeCycleStatus");
	private java.util.ArrayList lifeCycleStatus;
 

	LifeCycleImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static LifeCycleImpl getLifeCycle(Resource resource, Model model) throws JastorException {
		return new LifeCycleImpl(resource, model);
	}
	    
	static LifeCycleImpl createLifeCycle(Resource resource, Model model) throws JastorException { 
		LifeCycleImpl impl = new LifeCycleImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, LifeCycle.TYPE)))
			impl._model.add(impl._resource, RDF.type, LifeCycle.TYPE);
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
		it = _model.listStatements(_resource,lifeCycleContributeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lifeCycleVersionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lifeCycleStatusProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, LifeCycle.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		lifeCycleContribute = null;
		lifeCycleVersion = null;
		lifeCycleStatus = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLifeCycleContribute() throws JastorException {
		this.lifeCycleContribute = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lifeCycleContributeProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lifeCycleContribute properties in LifeCycle model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LCContribute lifeCycleContribute = rvg.sv.lom_DOT_owlFactory.getLCContribute(resource,_model);
				this.lifeCycleContribute.add(lifeCycleContribute);
			}
		}
	}

	public java.util.Iterator getLifeCycleContribute() throws JastorException {
		if (lifeCycleContribute == null)
			initLifeCycleContribute();
		return new CachedPropertyIterator(lifeCycleContribute,_resource,lifeCycleContributeProperty,true);
	}

	public void addLifeCycleContribute(LCContribute lifeCycleContribute) throws JastorException {
		if (this.lifeCycleContribute == null)
			initLifeCycleContribute();
		if (this.lifeCycleContribute.contains(lifeCycleContribute)) {
			this.lifeCycleContribute.remove(lifeCycleContribute);
			this.lifeCycleContribute.add(lifeCycleContribute);
			return;
		}
		this.lifeCycleContribute.add(lifeCycleContribute);
		_model.add(_model.createStatement(_resource,lifeCycleContributeProperty,lifeCycleContribute.resource()));
	}
	
	public LCContribute addLifeCycleContribute() throws JastorException {
		LCContribute lifeCycleContribute = rvg.sv.lom_DOT_owlFactory.createLCContribute(_model.createResource(),_model);
		if (this.lifeCycleContribute == null)
			initLifeCycleContribute();
		this.lifeCycleContribute.add(lifeCycleContribute);
		_model.add(_model.createStatement(_resource,lifeCycleContributeProperty,lifeCycleContribute.resource()));
		return lifeCycleContribute;
	}
	
	public LCContribute addLifeCycleContribute(Resource resource) throws JastorException {
		LCContribute lifeCycleContribute = rvg.sv.lom_DOT_owlFactory.getLCContribute(resource,_model);
		if (this.lifeCycleContribute == null)
			initLifeCycleContribute();
		if (this.lifeCycleContribute.contains(lifeCycleContribute))
			return lifeCycleContribute;
		this.lifeCycleContribute.add(lifeCycleContribute);
		_model.add(_model.createStatement(_resource,lifeCycleContributeProperty,lifeCycleContribute.resource()));
		return lifeCycleContribute;
	}
	
	public void removeLifeCycleContribute(LCContribute lifeCycleContribute) throws JastorException {
		if (this.lifeCycleContribute == null)
			initLifeCycleContribute();
		if (!this.lifeCycleContribute.contains(lifeCycleContribute))
			return;
		if (!_model.contains(_resource, lifeCycleContributeProperty, lifeCycleContribute.resource()))
			return;
		this.lifeCycleContribute.remove(lifeCycleContribute);
		_model.removeAll(_resource, lifeCycleContributeProperty, lifeCycleContribute.resource());
	}
		 

	private void initLifeCycleVersion() throws JastorException {
		this.lifeCycleVersion = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lifeCycleVersionProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lifeCycleVersion properties in LifeCycle model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString lifeCycleVersion = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.lifeCycleVersion.add(lifeCycleVersion);
			}
		}
	}

	public java.util.Iterator getLifeCycleVersion() throws JastorException {
		if (lifeCycleVersion == null)
			initLifeCycleVersion();
		return new CachedPropertyIterator(lifeCycleVersion,_resource,lifeCycleVersionProperty,true);
	}

	public void addLifeCycleVersion(LangString lifeCycleVersion) throws JastorException {
		if (this.lifeCycleVersion == null)
			initLifeCycleVersion();
		if (this.lifeCycleVersion.contains(lifeCycleVersion)) {
			this.lifeCycleVersion.remove(lifeCycleVersion);
			this.lifeCycleVersion.add(lifeCycleVersion);
			return;
		}
		this.lifeCycleVersion.add(lifeCycleVersion);
		_model.add(_model.createStatement(_resource,lifeCycleVersionProperty,lifeCycleVersion.resource()));
	}
	
	public LangString addLifeCycleVersion() throws JastorException {
		LangString lifeCycleVersion = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.lifeCycleVersion == null)
			initLifeCycleVersion();
		this.lifeCycleVersion.add(lifeCycleVersion);
		_model.add(_model.createStatement(_resource,lifeCycleVersionProperty,lifeCycleVersion.resource()));
		return lifeCycleVersion;
	}
	
	public LangString addLifeCycleVersion(Resource resource) throws JastorException {
		LangString lifeCycleVersion = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.lifeCycleVersion == null)
			initLifeCycleVersion();
		if (this.lifeCycleVersion.contains(lifeCycleVersion))
			return lifeCycleVersion;
		this.lifeCycleVersion.add(lifeCycleVersion);
		_model.add(_model.createStatement(_resource,lifeCycleVersionProperty,lifeCycleVersion.resource()));
		return lifeCycleVersion;
	}
	
	public void removeLifeCycleVersion(LangString lifeCycleVersion) throws JastorException {
		if (this.lifeCycleVersion == null)
			initLifeCycleVersion();
		if (!this.lifeCycleVersion.contains(lifeCycleVersion))
			return;
		if (!_model.contains(_resource, lifeCycleVersionProperty, lifeCycleVersion.resource()))
			return;
		this.lifeCycleVersion.remove(lifeCycleVersion);
		_model.removeAll(_resource, lifeCycleVersionProperty, lifeCycleVersion.resource());
	}
		 

	private void initLifeCycleStatus() throws JastorException {
		this.lifeCycleStatus = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lifeCycleStatusProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lifeCycleStatus properties in LifeCycle model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString lifeCycleStatus = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.lifeCycleStatus.add(lifeCycleStatus);
			}
		}
	}

	public java.util.Iterator getLifeCycleStatus() throws JastorException {
		if (lifeCycleStatus == null)
			initLifeCycleStatus();
		return new CachedPropertyIterator(lifeCycleStatus,_resource,lifeCycleStatusProperty,true);
	}

	public void addLifeCycleStatus(LangString lifeCycleStatus) throws JastorException {
		if (this.lifeCycleStatus == null)
			initLifeCycleStatus();
		if (this.lifeCycleStatus.contains(lifeCycleStatus)) {
			this.lifeCycleStatus.remove(lifeCycleStatus);
			this.lifeCycleStatus.add(lifeCycleStatus);
			return;
		}
		this.lifeCycleStatus.add(lifeCycleStatus);
		_model.add(_model.createStatement(_resource,lifeCycleStatusProperty,lifeCycleStatus.resource()));
	}
	
	public LangString addLifeCycleStatus() throws JastorException {
		LangString lifeCycleStatus = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.lifeCycleStatus == null)
			initLifeCycleStatus();
		this.lifeCycleStatus.add(lifeCycleStatus);
		_model.add(_model.createStatement(_resource,lifeCycleStatusProperty,lifeCycleStatus.resource()));
		return lifeCycleStatus;
	}
	
	public LangString addLifeCycleStatus(Resource resource) throws JastorException {
		LangString lifeCycleStatus = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.lifeCycleStatus == null)
			initLifeCycleStatus();
		if (this.lifeCycleStatus.contains(lifeCycleStatus))
			return lifeCycleStatus;
		this.lifeCycleStatus.add(lifeCycleStatus);
		_model.add(_model.createStatement(_resource,lifeCycleStatusProperty,lifeCycleStatus.resource()));
		return lifeCycleStatus;
	}
	
	public void removeLifeCycleStatus(LangString lifeCycleStatus) throws JastorException {
		if (this.lifeCycleStatus == null)
			initLifeCycleStatus();
		if (!this.lifeCycleStatus.contains(lifeCycleStatus))
			return;
		if (!_model.contains(_resource, lifeCycleStatusProperty, lifeCycleStatus.resource()))
			return;
		this.lifeCycleStatus.remove(lifeCycleStatus);
		_model.removeAll(_resource, lifeCycleStatusProperty, lifeCycleStatus.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof LifeCycleListener))
			throw new IllegalArgumentException("ThingListener must be instance of LifeCycleListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((LifeCycleListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof LifeCycleListener))
			throw new IllegalArgumentException("ThingListener must be instance of LifeCycleListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(lifeCycleContributeProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LCContribute _lifeCycleContribute = null;
					try {
						_lifeCycleContribute = rvg.sv.lom_DOT_owlFactory.getLCContribute(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lifeCycleContribute == null) {
						try {
							initLifeCycleContribute();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lifeCycleContribute.contains(_lifeCycleContribute))
						lifeCycleContribute.add(_lifeCycleContribute);
					if (listeners != null) {
						java.util.ArrayList consumersForLifeCycleContribute;
						synchronized (listeners) {
							consumersForLifeCycleContribute = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLifeCycleContribute.iterator();iter.hasNext();){
							LifeCycleListener listener=(LifeCycleListener)iter.next();
							listener.lifeCycleContributeAdded(LifeCycleImpl.this,_lifeCycleContribute);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lifeCycleVersionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _lifeCycleVersion = null;
					try {
						_lifeCycleVersion = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lifeCycleVersion == null) {
						try {
							initLifeCycleVersion();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lifeCycleVersion.contains(_lifeCycleVersion))
						lifeCycleVersion.add(_lifeCycleVersion);
					if (listeners != null) {
						java.util.ArrayList consumersForLifeCycleVersion;
						synchronized (listeners) {
							consumersForLifeCycleVersion = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLifeCycleVersion.iterator();iter.hasNext();){
							LifeCycleListener listener=(LifeCycleListener)iter.next();
							listener.lifeCycleVersionAdded(LifeCycleImpl.this,_lifeCycleVersion);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lifeCycleStatusProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _lifeCycleStatus = null;
					try {
						_lifeCycleStatus = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lifeCycleStatus == null) {
						try {
							initLifeCycleStatus();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lifeCycleStatus.contains(_lifeCycleStatus))
						lifeCycleStatus.add(_lifeCycleStatus);
					if (listeners != null) {
						java.util.ArrayList consumersForLifeCycleStatus;
						synchronized (listeners) {
							consumersForLifeCycleStatus = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLifeCycleStatus.iterator();iter.hasNext();){
							LifeCycleListener listener=(LifeCycleListener)iter.next();
							listener.lifeCycleStatusAdded(LifeCycleImpl.this,_lifeCycleStatus);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(lifeCycleContributeProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LCContribute _lifeCycleContribute = null;
					if (lifeCycleContribute != null) {
						boolean found = false;
						for (int i=0;i<lifeCycleContribute.size();i++) {
							LCContribute __item = (LCContribute) lifeCycleContribute.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lifeCycleContribute = __item;
								break;
							}
						}
						if (found)
							lifeCycleContribute.remove(_lifeCycleContribute);
						else {
							try {
								_lifeCycleContribute = rvg.sv.lom_DOT_owlFactory.getLCContribute(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lifeCycleContribute = rvg.sv.lom_DOT_owlFactory.getLCContribute(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLifeCycleContribute;
						synchronized (listeners) {
							consumersForLifeCycleContribute = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLifeCycleContribute.iterator();iter.hasNext();){
							LifeCycleListener listener=(LifeCycleListener)iter.next();
							listener.lifeCycleContributeRemoved(LifeCycleImpl.this,_lifeCycleContribute);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lifeCycleVersionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _lifeCycleVersion = null;
					if (lifeCycleVersion != null) {
						boolean found = false;
						for (int i=0;i<lifeCycleVersion.size();i++) {
							LangString __item = (LangString) lifeCycleVersion.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lifeCycleVersion = __item;
								break;
							}
						}
						if (found)
							lifeCycleVersion.remove(_lifeCycleVersion);
						else {
							try {
								_lifeCycleVersion = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lifeCycleVersion = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLifeCycleVersion;
						synchronized (listeners) {
							consumersForLifeCycleVersion = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLifeCycleVersion.iterator();iter.hasNext();){
							LifeCycleListener listener=(LifeCycleListener)iter.next();
							listener.lifeCycleVersionRemoved(LifeCycleImpl.this,_lifeCycleVersion);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lifeCycleStatusProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _lifeCycleStatus = null;
					if (lifeCycleStatus != null) {
						boolean found = false;
						for (int i=0;i<lifeCycleStatus.size();i++) {
							LangString __item = (LangString) lifeCycleStatus.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lifeCycleStatus = __item;
								break;
							}
						}
						if (found)
							lifeCycleStatus.remove(_lifeCycleStatus);
						else {
							try {
								_lifeCycleStatus = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lifeCycleStatus = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLifeCycleStatus;
						synchronized (listeners) {
							consumersForLifeCycleStatus = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLifeCycleStatus.iterator();iter.hasNext();){
							LifeCycleListener listener=(LifeCycleListener)iter.next();
							listener.lifeCycleStatusRemoved(LifeCycleImpl.this,_lifeCycleStatus);
						}
					}
				}
				return;
			}
		}

	//}
	


}