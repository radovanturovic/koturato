

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
 * Implementation of {@link LCContribute}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#LCContribute)</p>
 * <br>
 */
public class LCContributeImpl extends ThingImpl implements LCContribute {
	

	private static Property lcContributeRoleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lcContributeRole");
	private java.util.ArrayList lcContributeRole;
	private static Property lcContributeDateProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lcContributeDate");
	private java.util.ArrayList lcContributeDate;
	private static Property lif_DOT_con_DOT_entityProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lif.con.entity");
	private java.util.ArrayList lif_DOT_con_DOT_entity;
 

	LCContributeImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static LCContributeImpl getLCContribute(Resource resource, Model model) throws JastorException {
		return new LCContributeImpl(resource, model);
	}
	    
	static LCContributeImpl createLCContribute(Resource resource, Model model) throws JastorException { 
		LCContributeImpl impl = new LCContributeImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, LCContribute.TYPE)))
			impl._model.add(impl._resource, RDF.type, LCContribute.TYPE);
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
		it = _model.listStatements(_resource,lcContributeRoleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lcContributeDateProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lif_DOT_con_DOT_entityProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, LCContribute.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		lcContributeRole = null;
		lcContributeDate = null;
		lif_DOT_con_DOT_entity = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLcContributeRole() throws JastorException {
		this.lcContributeRole = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lcContributeRoleProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lcContributeRole properties in LCContribute model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				Vocabulary lcContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
				this.lcContributeRole.add(lcContributeRole);
			}
		}
	}

	public java.util.Iterator getLcContributeRole() throws JastorException {
		if (lcContributeRole == null)
			initLcContributeRole();
		return new CachedPropertyIterator(lcContributeRole,_resource,lcContributeRoleProperty,true);
	}

	public void addLcContributeRole(Vocabulary lcContributeRole) throws JastorException {
		if (this.lcContributeRole == null)
			initLcContributeRole();
		if (this.lcContributeRole.contains(lcContributeRole)) {
			this.lcContributeRole.remove(lcContributeRole);
			this.lcContributeRole.add(lcContributeRole);
			return;
		}
		this.lcContributeRole.add(lcContributeRole);
		_model.add(_model.createStatement(_resource,lcContributeRoleProperty,lcContributeRole.resource()));
	}
	
	public Vocabulary addLcContributeRole() throws JastorException {
		Vocabulary lcContributeRole = rvg.sv.lom_DOT_owlFactory.createVocabulary(_model.createResource(),_model);
		if (this.lcContributeRole == null)
			initLcContributeRole();
		this.lcContributeRole.add(lcContributeRole);
		_model.add(_model.createStatement(_resource,lcContributeRoleProperty,lcContributeRole.resource()));
		return lcContributeRole;
	}
	
	public Vocabulary addLcContributeRole(Resource resource) throws JastorException {
		Vocabulary lcContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
		if (this.lcContributeRole == null)
			initLcContributeRole();
		if (this.lcContributeRole.contains(lcContributeRole))
			return lcContributeRole;
		this.lcContributeRole.add(lcContributeRole);
		_model.add(_model.createStatement(_resource,lcContributeRoleProperty,lcContributeRole.resource()));
		return lcContributeRole;
	}
	
	public void removeLcContributeRole(Vocabulary lcContributeRole) throws JastorException {
		if (this.lcContributeRole == null)
			initLcContributeRole();
		if (!this.lcContributeRole.contains(lcContributeRole))
			return;
		if (!_model.contains(_resource, lcContributeRoleProperty, lcContributeRole.resource()))
			return;
		this.lcContributeRole.remove(lcContributeRole);
		_model.removeAll(_resource, lcContributeRoleProperty, lcContributeRole.resource());
	}
		 

	private void initLcContributeDate() throws JastorException {
		this.lcContributeDate = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lcContributeDateProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lcContributeDate properties in LCContribute model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				DateTime lcContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
				this.lcContributeDate.add(lcContributeDate);
			}
		}
	}

	public java.util.Iterator getLcContributeDate() throws JastorException {
		if (lcContributeDate == null)
			initLcContributeDate();
		return new CachedPropertyIterator(lcContributeDate,_resource,lcContributeDateProperty,true);
	}

	public void addLcContributeDate(DateTime lcContributeDate) throws JastorException {
		if (this.lcContributeDate == null)
			initLcContributeDate();
		if (this.lcContributeDate.contains(lcContributeDate)) {
			this.lcContributeDate.remove(lcContributeDate);
			this.lcContributeDate.add(lcContributeDate);
			return;
		}
		this.lcContributeDate.add(lcContributeDate);
		_model.add(_model.createStatement(_resource,lcContributeDateProperty,lcContributeDate.resource()));
	}
	
	public DateTime addLcContributeDate() throws JastorException {
		DateTime lcContributeDate = rvg.sv.lom_DOT_owlFactory.createDateTime(_model.createResource(),_model);
		if (this.lcContributeDate == null)
			initLcContributeDate();
		this.lcContributeDate.add(lcContributeDate);
		_model.add(_model.createStatement(_resource,lcContributeDateProperty,lcContributeDate.resource()));
		return lcContributeDate;
	}
	
	public DateTime addLcContributeDate(Resource resource) throws JastorException {
		DateTime lcContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
		if (this.lcContributeDate == null)
			initLcContributeDate();
		if (this.lcContributeDate.contains(lcContributeDate))
			return lcContributeDate;
		this.lcContributeDate.add(lcContributeDate);
		_model.add(_model.createStatement(_resource,lcContributeDateProperty,lcContributeDate.resource()));
		return lcContributeDate;
	}
	
	public void removeLcContributeDate(DateTime lcContributeDate) throws JastorException {
		if (this.lcContributeDate == null)
			initLcContributeDate();
		if (!this.lcContributeDate.contains(lcContributeDate))
			return;
		if (!_model.contains(_resource, lcContributeDateProperty, lcContributeDate.resource()))
			return;
		this.lcContributeDate.remove(lcContributeDate);
		_model.removeAll(_resource, lcContributeDateProperty, lcContributeDate.resource());
	}
		 

	private void initLif_DOT_con_DOT_entity() throws JastorException {
		lif_DOT_con_DOT_entity = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, lif_DOT_con_DOT_entityProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lif.con.entity properties in LCContribute model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				lif_DOT_con_DOT_entity.add(obj);
		}
	}

	public java.util.Iterator getLif_DOT_con_DOT_entity() throws JastorException {
		if (lif_DOT_con_DOT_entity == null)
			initLif_DOT_con_DOT_entity();
		return new CachedPropertyIterator(lif_DOT_con_DOT_entity,_resource,lif_DOT_con_DOT_entityProperty,false);
	}

	public void addLif_DOT_con_DOT_entity(String lif_DOT_con_DOT_entity) throws JastorException {
		if (this.lif_DOT_con_DOT_entity == null)
			initLif_DOT_con_DOT_entity();
		if (this.lif_DOT_con_DOT_entity.contains(lif_DOT_con_DOT_entity))
			return;
		if (_model.contains(_resource, lif_DOT_con_DOT_entityProperty, createLiteral(lif_DOT_con_DOT_entity)))
			return;
		this.lif_DOT_con_DOT_entity.add(lif_DOT_con_DOT_entity);
		_model.add(_resource, lif_DOT_con_DOT_entityProperty, createLiteral(lif_DOT_con_DOT_entity));
	}
	
	public void removeLif_DOT_con_DOT_entity(String lif_DOT_con_DOT_entity) throws JastorException {
		if (this.lif_DOT_con_DOT_entity == null)
			initLif_DOT_con_DOT_entity();
		if (!this.lif_DOT_con_DOT_entity.contains(lif_DOT_con_DOT_entity))
			return;
		if (!_model.contains(_resource, lif_DOT_con_DOT_entityProperty, createLiteral(lif_DOT_con_DOT_entity)))
			return;
		this.lif_DOT_con_DOT_entity.remove(lif_DOT_con_DOT_entity);
		_model.removeAll(_resource, lif_DOT_con_DOT_entityProperty, createLiteral(lif_DOT_con_DOT_entity));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof LCContributeListener))
			throw new IllegalArgumentException("ThingListener must be instance of LCContributeListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((LCContributeListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof LCContributeListener))
			throw new IllegalArgumentException("ThingListener must be instance of LCContributeListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(lcContributeRoleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _lcContributeRole = null;
					try {
						_lcContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lcContributeRole == null) {
						try {
							initLcContributeRole();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lcContributeRole.contains(_lcContributeRole))
						lcContributeRole.add(_lcContributeRole);
					if (listeners != null) {
						java.util.ArrayList consumersForLcContributeRole;
						synchronized (listeners) {
							consumersForLcContributeRole = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLcContributeRole.iterator();iter.hasNext();){
							LCContributeListener listener=(LCContributeListener)iter.next();
							listener.lcContributeRoleAdded(LCContributeImpl.this,_lcContributeRole);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lcContributeDateProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					DateTime _lcContributeDate = null;
					try {
						_lcContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lcContributeDate == null) {
						try {
							initLcContributeDate();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lcContributeDate.contains(_lcContributeDate))
						lcContributeDate.add(_lcContributeDate);
					if (listeners != null) {
						java.util.ArrayList consumersForLcContributeDate;
						synchronized (listeners) {
							consumersForLcContributeDate = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLcContributeDate.iterator();iter.hasNext();){
							LCContributeListener listener=(LCContributeListener)iter.next();
							listener.lcContributeDateAdded(LCContributeImpl.this,_lcContributeDate);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lif_DOT_con_DOT_entityProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (lif_DOT_con_DOT_entity == null) {
					try {
						initLif_DOT_con_DOT_entity();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !lif_DOT_con_DOT_entity.contains(obj))
					lif_DOT_con_DOT_entity.add(obj);
				java.util.ArrayList consumersForLif_DOT_con_DOT_entity;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForLif_DOT_con_DOT_entity = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForLif_DOT_con_DOT_entity.iterator();iter.hasNext();){
						LCContributeListener listener=(LCContributeListener)iter.next();
						listener.lif_DOT_con_DOT_entityAdded(LCContributeImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(lcContributeRoleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _lcContributeRole = null;
					if (lcContributeRole != null) {
						boolean found = false;
						for (int i=0;i<lcContributeRole.size();i++) {
							Vocabulary __item = (Vocabulary) lcContributeRole.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lcContributeRole = __item;
								break;
							}
						}
						if (found)
							lcContributeRole.remove(_lcContributeRole);
						else {
							try {
								_lcContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lcContributeRole = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLcContributeRole;
						synchronized (listeners) {
							consumersForLcContributeRole = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLcContributeRole.iterator();iter.hasNext();){
							LCContributeListener listener=(LCContributeListener)iter.next();
							listener.lcContributeRoleRemoved(LCContributeImpl.this,_lcContributeRole);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lcContributeDateProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					DateTime _lcContributeDate = null;
					if (lcContributeDate != null) {
						boolean found = false;
						for (int i=0;i<lcContributeDate.size();i++) {
							DateTime __item = (DateTime) lcContributeDate.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lcContributeDate = __item;
								break;
							}
						}
						if (found)
							lcContributeDate.remove(_lcContributeDate);
						else {
							try {
								_lcContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lcContributeDate = rvg.sv.lom_DOT_owlFactory.getDateTime(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLcContributeDate;
						synchronized (listeners) {
							consumersForLcContributeDate = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLcContributeDate.iterator();iter.hasNext();){
							LCContributeListener listener=(LCContributeListener)iter.next();
							listener.lcContributeDateRemoved(LCContributeImpl.this,_lcContributeDate);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lif_DOT_con_DOT_entityProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (lif_DOT_con_DOT_entity != null) {
					if (lif_DOT_con_DOT_entity.contains(obj))
						lif_DOT_con_DOT_entity.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						LCContributeListener listener=(LCContributeListener)iter.next();
						listener.lif_DOT_con_DOT_entityRemoved(LCContributeImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}