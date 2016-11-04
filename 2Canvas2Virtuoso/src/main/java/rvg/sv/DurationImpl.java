

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
 * Implementation of {@link Duration}
 * Use the rvg.sv.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#Duration)</p>
 * <br>
 */
public class DurationImpl extends ThingImpl implements Duration {
	

	private static Property dat_DOT_dur_DOT_durationProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#dat.dur.duration");
	private java.util.ArrayList dat_DOT_dur_DOT_duration;
	private static Property durationDescriptionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#durationDescription");
	private java.util.ArrayList durationDescription;
 

	DurationImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static DurationImpl getDuration(Resource resource, Model model) throws JastorException {
		return new DurationImpl(resource, model);
	}
	    
	static DurationImpl createDuration(Resource resource, Model model) throws JastorException { 
		DurationImpl impl = new DurationImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, Duration.TYPE)))
			impl._model.add(impl._resource, RDF.type, Duration.TYPE);
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
		it = _model.listStatements(_resource,dat_DOT_dur_DOT_durationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,durationDescriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, Duration.TYPE);
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
		dat_DOT_dur_DOT_duration = null;
		durationDescription = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initDat_DOT_dur_DOT_duration() throws JastorException {
		dat_DOT_dur_DOT_duration = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, dat_DOT_dur_DOT_durationProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#dat.dur.duration properties in Duration model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				dat_DOT_dur_DOT_duration.add(obj);
		}
	}

	public java.util.Iterator getDat_DOT_dur_DOT_duration() throws JastorException {
		if (dat_DOT_dur_DOT_duration == null)
			initDat_DOT_dur_DOT_duration();
		return new CachedPropertyIterator(dat_DOT_dur_DOT_duration,_resource,dat_DOT_dur_DOT_durationProperty,false);
	}

	public void addDat_DOT_dur_DOT_duration(String dat_DOT_dur_DOT_duration) throws JastorException {
		if (this.dat_DOT_dur_DOT_duration == null)
			initDat_DOT_dur_DOT_duration();
		if (this.dat_DOT_dur_DOT_duration.contains(dat_DOT_dur_DOT_duration))
			return;
		if (_model.contains(_resource, dat_DOT_dur_DOT_durationProperty, createLiteral(dat_DOT_dur_DOT_duration)))
			return;
		this.dat_DOT_dur_DOT_duration.add(dat_DOT_dur_DOT_duration);
		_model.add(_resource, dat_DOT_dur_DOT_durationProperty, createLiteral(dat_DOT_dur_DOT_duration));
	}
	
	public void removeDat_DOT_dur_DOT_duration(String dat_DOT_dur_DOT_duration) throws JastorException {
		if (this.dat_DOT_dur_DOT_duration == null)
			initDat_DOT_dur_DOT_duration();
		if (!this.dat_DOT_dur_DOT_duration.contains(dat_DOT_dur_DOT_duration))
			return;
		if (!_model.contains(_resource, dat_DOT_dur_DOT_durationProperty, createLiteral(dat_DOT_dur_DOT_duration)))
			return;
		this.dat_DOT_dur_DOT_duration.remove(dat_DOT_dur_DOT_duration);
		_model.removeAll(_resource, dat_DOT_dur_DOT_durationProperty, createLiteral(dat_DOT_dur_DOT_duration));
	}


	private void initDurationDescription() throws JastorException {
		this.durationDescription = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, durationDescriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#durationDescription properties in Duration model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString durationDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.durationDescription.add(durationDescription);
			}
		}
	}

	public java.util.Iterator getDurationDescription() throws JastorException {
		if (durationDescription == null)
			initDurationDescription();
		return new CachedPropertyIterator(durationDescription,_resource,durationDescriptionProperty,true);
	}

	public void addDurationDescription(LangString durationDescription) throws JastorException {
		if (this.durationDescription == null)
			initDurationDescription();
		if (this.durationDescription.contains(durationDescription)) {
			this.durationDescription.remove(durationDescription);
			this.durationDescription.add(durationDescription);
			return;
		}
		this.durationDescription.add(durationDescription);
		_model.add(_model.createStatement(_resource,durationDescriptionProperty,durationDescription.resource()));
	}
	
	public LangString addDurationDescription() throws JastorException {
		LangString durationDescription = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.durationDescription == null)
			initDurationDescription();
		this.durationDescription.add(durationDescription);
		_model.add(_model.createStatement(_resource,durationDescriptionProperty,durationDescription.resource()));
		return durationDescription;
	}
	
	public LangString addDurationDescription(Resource resource) throws JastorException {
		LangString durationDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.durationDescription == null)
			initDurationDescription();
		if (this.durationDescription.contains(durationDescription))
			return durationDescription;
		this.durationDescription.add(durationDescription);
		_model.add(_model.createStatement(_resource,durationDescriptionProperty,durationDescription.resource()));
		return durationDescription;
	}
	
	public void removeDurationDescription(LangString durationDescription) throws JastorException {
		if (this.durationDescription == null)
			initDurationDescription();
		if (!this.durationDescription.contains(durationDescription))
			return;
		if (!_model.contains(_resource, durationDescriptionProperty, durationDescription.resource()))
			return;
		this.durationDescription.remove(durationDescription);
		_model.removeAll(_resource, durationDescriptionProperty, durationDescription.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof DurationListener))
			throw new IllegalArgumentException("ThingListener must be instance of DurationListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((DurationListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof DurationListener))
			throw new IllegalArgumentException("ThingListener must be instance of DurationListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(dat_DOT_dur_DOT_durationProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_dur_DOT_duration == null) {
					try {
						initDat_DOT_dur_DOT_duration();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !dat_DOT_dur_DOT_duration.contains(obj))
					dat_DOT_dur_DOT_duration.add(obj);
				java.util.ArrayList consumersForDat_DOT_dur_DOT_duration;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForDat_DOT_dur_DOT_duration = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForDat_DOT_dur_DOT_duration.iterator();iter.hasNext();){
						DurationListener listener=(DurationListener)iter.next();
						listener.dat_DOT_dur_DOT_durationAdded(DurationImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(durationDescriptionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _durationDescription = null;
					try {
						_durationDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (durationDescription == null) {
						try {
							initDurationDescription();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!durationDescription.contains(_durationDescription))
						durationDescription.add(_durationDescription);
					if (listeners != null) {
						java.util.ArrayList consumersForDurationDescription;
						synchronized (listeners) {
							consumersForDurationDescription = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDurationDescription.iterator();iter.hasNext();){
							DurationListener listener=(DurationListener)iter.next();
							listener.durationDescriptionAdded(DurationImpl.this,_durationDescription);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(dat_DOT_dur_DOT_durationProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (dat_DOT_dur_DOT_duration != null) {
					if (dat_DOT_dur_DOT_duration.contains(obj))
						dat_DOT_dur_DOT_duration.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						DurationListener listener=(DurationListener)iter.next();
						listener.dat_DOT_dur_DOT_durationRemoved(DurationImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(durationDescriptionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _durationDescription = null;
					if (durationDescription != null) {
						boolean found = false;
						for (int i=0;i<durationDescription.size();i++) {
							LangString __item = (LangString) durationDescription.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_durationDescription = __item;
								break;
							}
						}
						if (found)
							durationDescription.remove(_durationDescription);
						else {
							try {
								_durationDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_durationDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForDurationDescription;
						synchronized (listeners) {
							consumersForDurationDescription = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForDurationDescription.iterator();iter.hasNext();){
							DurationListener listener=(DurationListener)iter.next();
							listener.durationDescriptionRemoved(DurationImpl.this,_durationDescription);
						}
					}
				}
				return;
			}
		}

	//}
	


}