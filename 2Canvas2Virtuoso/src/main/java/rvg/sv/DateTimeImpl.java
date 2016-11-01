

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
 * Implementation of {@link DateTime}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#DateTime)</p>
 * <br>
 */
public class DateTimeImpl extends ThingImpl implements DateTime {
	

	private static Property dateTimeDescriptionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dateTimeDescription");
	private java.util.ArrayList dateTimeDescription;
	private static Property dat_DOT_dat_DOT_dateTimeProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.dat.dateTime");
	private java.util.ArrayList dat_DOT_dat_DOT_dateTime;
 

	DateTimeImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static DateTimeImpl getDateTime(Resource resource, Model model) throws JastorException {
		return new DateTimeImpl(resource, model);
	}
	    
	static DateTimeImpl createDateTime(Resource resource, Model model) throws JastorException { 
		DateTimeImpl impl = new DateTimeImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, DateTime.TYPE)))
			impl._model.add(impl._resource, RDF.type, DateTime.TYPE);
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
		it = _model.listStatements(_resource,dateTimeDescriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,dat_DOT_dat_DOT_dateTimeProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, DateTime.TYPE);
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
		dateTimeDescription = null;
		dat_DOT_dat_DOT_dateTime = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initDateTimeDescription() throws JastorException {
		this.dateTimeDescription = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, dateTimeDescriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dateTimeDescription properties in DateTime model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString dateTimeDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.dateTimeDescription.add(dateTimeDescription);
			}
		}
	}

	public java.util.Iterator getDateTimeDescription() throws JastorException {
		if (dateTimeDescription == null)
			initDateTimeDescription();
		return new CachedPropertyIterator(dateTimeDescription,_resource,dateTimeDescriptionProperty,true);
	}

	public void addDateTimeDescription(LangString dateTimeDescription) throws JastorException {
		if (this.dateTimeDescription == null)
			initDateTimeDescription();
		if (this.dateTimeDescription.contains(dateTimeDescription)) {
			this.dateTimeDescription.remove(dateTimeDescription);
			this.dateTimeDescription.add(dateTimeDescription);
			return;
		}
		this.dateTimeDescription.add(dateTimeDescription);
		_model.add(_model.createStatement(_resource,dateTimeDescriptionProperty,dateTimeDescription.resource()));
	}
	
	public LangString addDateTimeDescription() throws JastorException {
		LangString dateTimeDescription = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.dateTimeDescription == null)
			initDateTimeDescription();
		this.dateTimeDescription.add(dateTimeDescription);
		_model.add(_model.createStatement(_resource,dateTimeDescriptionProperty,dateTimeDescription.resource()));
		return dateTimeDescription;
	}
	
	public LangString addDateTimeDescription(Resource resource) throws JastorException {
		LangString dateTimeDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.dateTimeDescription == null)
			initDateTimeDescription();
		if (this.dateTimeDescription.contains(dateTimeDescription))
			return dateTimeDescription;
		this.dateTimeDescription.add(dateTimeDescription);
		_model.add(_model.createStatement(_resource,dateTimeDescriptionProperty,dateTimeDescription.resource()));
		return dateTimeDescription;
	}
	
	public void removeDateTimeDescription(LangString dateTimeDescription) throws JastorException {
		if (this.dateTimeDescription == null)
			initDateTimeDescription();
		if (!this.dateTimeDescription.contains(dateTimeDescription))
			return;
		if (!_model.contains(_resource, dateTimeDescriptionProperty, dateTimeDescription.resource()))
			return;
		this.dateTimeDescription.remove(dateTimeDescription);
		_model.removeAll(_resource, dateTimeDescriptionProperty, dateTimeDescription.resource());
	}
		 

	private void initDat_DOT_dat_DOT_dateTime() throws JastorException {
		dat_DOT_dat_DOT_dateTime = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dat_DOT_dat_DOT_dateTimeProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dat.dat.dateTime properties in DateTime model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dat_DOT_dat_DOT_dateTime.add(obj);
		}
	}

	public java.util.Iterator getDat_DOT_dat_DOT_dateTime() throws JastorException {
		if (dat_DOT_dat_DOT_dateTime == null)
			initDat_DOT_dat_DOT_dateTime();
		return new CachedPropertyIterator(dat_DOT_dat_DOT_dateTime,_resource,dat_DOT_dat_DOT_dateTimeProperty,false);
	}

	public void addDat_DOT_dat_DOT_dateTime(String dat_DOT_dat_DOT_dateTime) throws JastorException {
		if (this.dat_DOT_dat_DOT_dateTime == null)
			initDat_DOT_dat_DOT_dateTime();
		if (this.dat_DOT_dat_DOT_dateTime.contains(dat_DOT_dat_DOT_dateTime))
			return;
		if (_model.contains(_resource, dat_DOT_dat_DOT_dateTimeProperty, createLiteral(dat_DOT_dat_DOT_dateTime)))
			return;
		this.dat_DOT_dat_DOT_dateTime.add(dat_DOT_dat_DOT_dateTime);
		_model.add(_resource, dat_DOT_dat_DOT_dateTimeProperty, createLiteral(dat_DOT_dat_DOT_dateTime));
	}
	
	public void removeDat_DOT_dat_DOT_dateTime(String dat_DOT_dat_DOT_dateTime) throws JastorException {
		if (this.dat_DOT_dat_DOT_dateTime == null)
			initDat_DOT_dat_DOT_dateTime();
		if (!this.dat_DOT_dat_DOT_dateTime.contains(dat_DOT_dat_DOT_dateTime))
			return;
		if (!_model.contains(_resource, dat_DOT_dat_DOT_dateTimeProperty, createLiteral(dat_DOT_dat_DOT_dateTime)))
			return;
		this.dat_DOT_dat_DOT_dateTime.remove(dat_DOT_dat_DOT_dateTime);
		_model.removeAll(_resource, dat_DOT_dat_DOT_dateTimeProperty, createLiteral(dat_DOT_dat_DOT_dateTime));
	}
 


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof DateTimeListener))
			throw new IllegalArgumentException("ThingListener must be instance of DateTimeListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((DateTimeListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof DateTimeListener))
			throw new IllegalArgumentException("ThingListener must be instance of DateTimeListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(dateTimeDescriptionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _dateTimeDescription = null;
					try {
						_dateTimeDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (dateTimeDescription == null) {
						try {
							initDateTimeDescription();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!dateTimeDescription.contains(_dateTimeDescription))
						dateTimeDescription.add(_dateTimeDescription);
					if (listeners != null) {
						java.util.ArrayList consumersForDateTimeDescription;
						synchronized (listeners) {
							consumersForDateTimeDescription = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDateTimeDescription.iterator();iter.hasNext();){
							DateTimeListener listener=(DateTimeListener)iter.next();
							listener.dateTimeDescriptionAdded(DateTimeImpl.this,_dateTimeDescription);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dat_DOT_dat_DOT_dateTimeProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_dat_DOT_dateTime == null) {
					try {
						initDat_DOT_dat_DOT_dateTime();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dat_DOT_dat_DOT_dateTime.contains(obj))
					dat_DOT_dat_DOT_dateTime.add(obj);
				java.util.ArrayList consumersForDat_DOT_dat_DOT_dateTime;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDat_DOT_dat_DOT_dateTime = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDat_DOT_dat_DOT_dateTime.iterator();iter.hasNext();){
						DateTimeListener listener=(DateTimeListener)iter.next();
						listener.dat_DOT_dat_DOT_dateTimeAdded(DateTimeImpl.this,(String)obj);
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(dateTimeDescriptionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _dateTimeDescription = null;
					if (dateTimeDescription != null) {
						boolean found = false;
						for (int i=0;i<dateTimeDescription.size();i++) {
							LangString __item = (LangString) dateTimeDescription.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_dateTimeDescription = __item;
								break;
							}
						}
						if (found)
							dateTimeDescription.remove(_dateTimeDescription);
						else {
							try {
								_dateTimeDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_dateTimeDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForDateTimeDescription;
						synchronized (listeners) {
							consumersForDateTimeDescription = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDateTimeDescription.iterator();iter.hasNext();){
							DateTimeListener listener=(DateTimeListener)iter.next();
							listener.dateTimeDescriptionRemoved(DateTimeImpl.this,_dateTimeDescription);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(dat_DOT_dat_DOT_dateTimeProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_dat_DOT_dateTime != null) {
					if (dat_DOT_dat_DOT_dateTime.contains(obj))
						dat_DOT_dat_DOT_dateTime.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						DateTimeListener listener=(DateTimeListener)iter.next();
						listener.dat_DOT_dat_DOT_dateTimeRemoved(DateTimeImpl.this,(String)obj);
					}
				}
				return;
			}
		}

	//}
	


}