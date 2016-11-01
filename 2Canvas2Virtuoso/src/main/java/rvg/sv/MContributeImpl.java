

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
 * Implementation of {@link MContribute}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#MContribute)</p>
 * <br>
 */
public class MContributeImpl extends ThingImpl implements MContribute {
	

	private static Property mContributeDateProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#mContributeDate");
	private java.util.ArrayList mContributeDate;
	private static Property mContributeRoleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#mContributeRole");
	private java.util.ArrayList mContributeRole;
	private static Property mme_DOT_con_DOT_entityProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#mme.con.entity");
	private java.util.ArrayList mme_DOT_con_DOT_entity;
 

	MContributeImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static MContributeImpl getMContribute(Resource resource, Model model) throws JastorException {
		return new MContributeImpl(resource, model);
	}
	    
	static MContributeImpl createMContribute(Resource resource, Model model) throws JastorException { 
		MContributeImpl impl = new MContributeImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, MContribute.TYPE)))
			impl._model.add(impl._resource, RDF.type, MContribute.TYPE);
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
		it = _model.listStatements(_resource,mContributeDateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,mContributeRoleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,mme_DOT_con_DOT_entityProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, MContribute.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		mContributeDate = null;
		mContributeRole = null;
		mme_DOT_con_DOT_entity = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initMContributeDate() throws JastorException {
		this.mContributeDate = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, mContributeDateProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#mContributeDate properties in MContribute model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				DateTime mContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
				this.mContributeDate.add(mContributeDate);
			}
		}
	}

	public java.util.Iterator getMContributeDate() throws JastorException {
		if (mContributeDate == null)
			initMContributeDate();
		return new CachedPropertyIterator(mContributeDate,_resource,mContributeDateProperty,true);
	}

	public void addMContributeDate(DateTime mContributeDate) throws JastorException {
		if (this.mContributeDate == null)
			initMContributeDate();
		if (this.mContributeDate.contains(mContributeDate)) {
			this.mContributeDate.remove(mContributeDate);
			this.mContributeDate.add(mContributeDate);
			return;
		}
		this.mContributeDate.add(mContributeDate);
		_model.add(_model.createStatement(_resource,mContributeDateProperty,mContributeDate.resource()));
	}
	
	public DateTime addMContributeDate() throws JastorException {
		DateTime mContributeDate = rvg.sv.lom_DOT_owlFactory.createDateTime(_model.createResource(),_model);
		if (this.mContributeDate == null)
			initMContributeDate();
		this.mContributeDate.add(mContributeDate);
		_model.add(_model.createStatement(_resource,mContributeDateProperty,mContributeDate.resource()));
		return mContributeDate;
	}
	
	public DateTime addMContributeDate(Resource resource) throws JastorException {
		DateTime mContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
		if (this.mContributeDate == null)
			initMContributeDate();
		if (this.mContributeDate.contains(mContributeDate))
			return mContributeDate;
		this.mContributeDate.add(mContributeDate);
		_model.add(_model.createStatement(_resource,mContributeDateProperty,mContributeDate.resource()));
		return mContributeDate;
	}
	
	public void removeMContributeDate(DateTime mContributeDate) throws JastorException {
		if (this.mContributeDate == null)
			initMContributeDate();
		if (!this.mContributeDate.contains(mContributeDate))
			return;
		if (!_model.contains(_resource, mContributeDateProperty, mContributeDate.resource()))
			return;
		this.mContributeDate.remove(mContributeDate);
		_model.removeAll(_resource, mContributeDateProperty, mContributeDate.resource());
	}
		 

	private void initMContributeRole() throws JastorException {
		this.mContributeRole = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, mContributeRoleProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#mContributeRole properties in MContribute model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				Vocabulary mContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
				this.mContributeRole.add(mContributeRole);
			}
		}
	}

	public java.util.Iterator getMContributeRole() throws JastorException {
		if (mContributeRole == null)
			initMContributeRole();
		return new CachedPropertyIterator(mContributeRole,_resource,mContributeRoleProperty,true);
	}

	public void addMContributeRole(Vocabulary mContributeRole) throws JastorException {
		if (this.mContributeRole == null)
			initMContributeRole();
		if (this.mContributeRole.contains(mContributeRole)) {
			this.mContributeRole.remove(mContributeRole);
			this.mContributeRole.add(mContributeRole);
			return;
		}
		this.mContributeRole.add(mContributeRole);
		_model.add(_model.createStatement(_resource,mContributeRoleProperty,mContributeRole.resource()));
	}
	
	public Vocabulary addMContributeRole() throws JastorException {
		Vocabulary mContributeRole = rvg.sv.lom_DOT_owlFactory.createVocabulary(_model.createResource(),_model);
		if (this.mContributeRole == null)
			initMContributeRole();
		this.mContributeRole.add(mContributeRole);
		_model.add(_model.createStatement(_resource,mContributeRoleProperty,mContributeRole.resource()));
		return mContributeRole;
	}
	
	public Vocabulary addMContributeRole(Resource resource) throws JastorException {
		Vocabulary mContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
		if (this.mContributeRole == null)
			initMContributeRole();
		if (this.mContributeRole.contains(mContributeRole))
			return mContributeRole;
		this.mContributeRole.add(mContributeRole);
		_model.add(_model.createStatement(_resource,mContributeRoleProperty,mContributeRole.resource()));
		return mContributeRole;
	}
	
	public void removeMContributeRole(Vocabulary mContributeRole) throws JastorException {
		if (this.mContributeRole == null)
			initMContributeRole();
		if (!this.mContributeRole.contains(mContributeRole))
			return;
		if (!_model.contains(_resource, mContributeRoleProperty, mContributeRole.resource()))
			return;
		this.mContributeRole.remove(mContributeRole);
		_model.removeAll(_resource, mContributeRoleProperty, mContributeRole.resource());
	}
		 

	private void initMme_DOT_con_DOT_entity() throws JastorException {
		mme_DOT_con_DOT_entity = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, mme_DOT_con_DOT_entityProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#mme.con.entity properties in MContribute model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				mme_DOT_con_DOT_entity.add(obj);
		}
	}

	public java.util.Iterator getMme_DOT_con_DOT_entity() throws JastorException {
		if (mme_DOT_con_DOT_entity == null)
			initMme_DOT_con_DOT_entity();
		return new CachedPropertyIterator(mme_DOT_con_DOT_entity,_resource,mme_DOT_con_DOT_entityProperty,false);
	}

	public void addMme_DOT_con_DOT_entity(String mme_DOT_con_DOT_entity) throws JastorException {
		if (this.mme_DOT_con_DOT_entity == null)
			initMme_DOT_con_DOT_entity();
		if (this.mme_DOT_con_DOT_entity.contains(mme_DOT_con_DOT_entity))
			return;
		if (_model.contains(_resource, mme_DOT_con_DOT_entityProperty, createLiteral(mme_DOT_con_DOT_entity)))
			return;
		this.mme_DOT_con_DOT_entity.add(mme_DOT_con_DOT_entity);
		_model.add(_resource, mme_DOT_con_DOT_entityProperty, createLiteral(mme_DOT_con_DOT_entity));
	}
	
	public void removeMme_DOT_con_DOT_entity(String mme_DOT_con_DOT_entity) throws JastorException {
		if (this.mme_DOT_con_DOT_entity == null)
			initMme_DOT_con_DOT_entity();
		if (!this.mme_DOT_con_DOT_entity.contains(mme_DOT_con_DOT_entity))
			return;
		if (!_model.contains(_resource, mme_DOT_con_DOT_entityProperty, createLiteral(mme_DOT_con_DOT_entity)))
			return;
		this.mme_DOT_con_DOT_entity.remove(mme_DOT_con_DOT_entity);
		_model.removeAll(_resource, mme_DOT_con_DOT_entityProperty, createLiteral(mme_DOT_con_DOT_entity));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof MContributeListener))
			throw new IllegalArgumentException("ThingListener must be instance of MContributeListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((MContributeListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof MContributeListener))
			throw new IllegalArgumentException("ThingListener must be instance of MContributeListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(mContributeDateProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					DateTime _mContributeDate = null;
					try {
						_mContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (mContributeDate == null) {
						try {
							initMContributeDate();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!mContributeDate.contains(_mContributeDate))
						mContributeDate.add(_mContributeDate);
					if (listeners != null) {
						java.util.ArrayList consumersForMContributeDate;
						synchronized (listeners) {
							consumersForMContributeDate = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMContributeDate.iterator();iter.hasNext();){
							MContributeListener listener=(MContributeListener)iter.next();
							listener.mContributeDateAdded(MContributeImpl.this,_mContributeDate);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mContributeRoleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _mContributeRole = null;
					try {
						_mContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (mContributeRole == null) {
						try {
							initMContributeRole();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!mContributeRole.contains(_mContributeRole))
						mContributeRole.add(_mContributeRole);
					if (listeners != null) {
						java.util.ArrayList consumersForMContributeRole;
						synchronized (listeners) {
							consumersForMContributeRole = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMContributeRole.iterator();iter.hasNext();){
							MContributeListener listener=(MContributeListener)iter.next();
							listener.mContributeRoleAdded(MContributeImpl.this,_mContributeRole);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mme_DOT_con_DOT_entityProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (mme_DOT_con_DOT_entity == null) {
					try {
						initMme_DOT_con_DOT_entity();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !mme_DOT_con_DOT_entity.contains(obj))
					mme_DOT_con_DOT_entity.add(obj);
				java.util.ArrayList consumersForMme_DOT_con_DOT_entity;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForMme_DOT_con_DOT_entity = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForMme_DOT_con_DOT_entity.iterator();iter.hasNext();){
						MContributeListener listener=(MContributeListener)iter.next();
						listener.mme_DOT_con_DOT_entityAdded(MContributeImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(mContributeDateProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					DateTime _mContributeDate = null;
					if (mContributeDate != null) {
						boolean found = false;
						for (int i=0;i<mContributeDate.size();i++) {
							DateTime __item = (DateTime) mContributeDate.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_mContributeDate = __item;
								break;
							}
						}
						if (found)
							mContributeDate.remove(_mContributeDate);
						else {
							try {
								_mContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_mContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMContributeDate;
						synchronized (listeners) {
							consumersForMContributeDate = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMContributeDate.iterator();iter.hasNext();){
							MContributeListener listener=(MContributeListener)iter.next();
							listener.mContributeDateRemoved(MContributeImpl.this,_mContributeDate);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mContributeRoleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _mContributeRole = null;
					if (mContributeRole != null) {
						boolean found = false;
						for (int i=0;i<mContributeRole.size();i++) {
							Vocabulary __item = (Vocabulary) mContributeRole.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_mContributeRole = __item;
								break;
							}
						}
						if (found)
							mContributeRole.remove(_mContributeRole);
						else {
							try {
								_mContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_mContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForMContributeRole;
						synchronized (listeners) {
							consumersForMContributeRole = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForMContributeRole.iterator();iter.hasNext();){
							MContributeListener listener=(MContributeListener)iter.next();
							listener.mContributeRoleRemoved(MContributeImpl.this,_mContributeRole);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(mme_DOT_con_DOT_entityProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (mme_DOT_con_DOT_entity != null) {
					if (mme_DOT_con_DOT_entity.contains(obj))
						mme_DOT_con_DOT_entity.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						MContributeListener listener=(MContributeListener)iter.next();
						listener.mme_DOT_con_DOT_entityRemoved(MContributeImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}