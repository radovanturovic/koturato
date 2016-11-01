

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
 * Implementation of {@link LOM}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#LOM)</p>
 * <br>
 */
public class LOMImpl extends ThingImpl implements LOM {
	

	private static Property lomEducationalProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomEducational");
	private java.util.ArrayList lomEducational;
	private static Property lomLifeCycleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomLifeCycle");
	private java.util.ArrayList lomLifeCycle;
	private static Property lomClassificationProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomClassification");
	private java.util.ArrayList lomClassification;
	private static Property lomGeneralProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomGeneral");
	private java.util.ArrayList lomGeneral;
	private static Property lomMetaMetadataProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomMetaMetadata");
	private java.util.ArrayList lomMetaMetadata;
	private static Property lomTechnicalProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#lomTechnical");
	private java.util.ArrayList lomTechnical;
 

	LOMImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static LOMImpl getLOM(Resource resource, Model model) throws JastorException {
		return new LOMImpl(resource, model);
	}
	    
	static LOMImpl createLOM(Resource resource, Model model) throws JastorException { 
		LOMImpl impl = new LOMImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, LOM.TYPE)))
			impl._model.add(impl._resource, RDF.type, LOM.TYPE);
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
		it = _model.listStatements(_resource,lomEducationalProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lomLifeCycleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lomClassificationProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lomGeneralProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lomMetaMetadataProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,lomTechnicalProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, LOM.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		lomEducational = null;
		lomLifeCycle = null;
		lomClassification = null;
		lomGeneral = null;
		lomMetaMetadata = null;
		lomTechnical = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initLomEducational() throws JastorException {
		this.lomEducational = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lomEducationalProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lomEducational properties in LOM model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				rvg.sv.Educational lomEducational = rvg.sv.lom_DOT_owlFactory.getEducational(resource,_model);
				this.lomEducational.add(lomEducational);
			}
		}
	}

	public java.util.Iterator getLomEducational() throws JastorException {
		if (lomEducational == null)
			initLomEducational();
		return new CachedPropertyIterator(lomEducational,_resource,lomEducationalProperty,true);
	}

	public void addLomEducational(rvg.sv.Educational lomEducational) throws JastorException {
		if (this.lomEducational == null)
			initLomEducational();
		if (this.lomEducational.contains(lomEducational)) {
			this.lomEducational.remove(lomEducational);
			this.lomEducational.add(lomEducational);
			return;
		}
		this.lomEducational.add(lomEducational);
		_model.add(_model.createStatement(_resource,lomEducationalProperty,lomEducational.resource()));
	}
	
	public rvg.sv.Educational addLomEducational() throws JastorException {
		rvg.sv.Educational lomEducational = rvg.sv.lom_DOT_owlFactory.createEducational(_model.createResource(),_model);
		if (this.lomEducational == null)
			initLomEducational();
		this.lomEducational.add(lomEducational);
		_model.add(_model.createStatement(_resource,lomEducationalProperty,lomEducational.resource()));
		return lomEducational;
	}
	
	public rvg.sv.Educational addLomEducational(Resource resource) throws JastorException {
		rvg.sv.Educational lomEducational = rvg.sv.lom_DOT_owlFactory.getEducational(resource,_model);
		if (this.lomEducational == null)
			initLomEducational();
		if (this.lomEducational.contains(lomEducational))
			return lomEducational;
		this.lomEducational.add(lomEducational);
		_model.add(_model.createStatement(_resource,lomEducationalProperty,lomEducational.resource()));
		return lomEducational;
	}
	
	public void removeLomEducational(rvg.sv.Educational lomEducational) throws JastorException {
		if (this.lomEducational == null)
			initLomEducational();
		if (!this.lomEducational.contains(lomEducational))
			return;
		if (!_model.contains(_resource, lomEducationalProperty, lomEducational.resource()))
			return;
		this.lomEducational.remove(lomEducational);
		_model.removeAll(_resource, lomEducationalProperty, lomEducational.resource());
	}
		 

	private void initLomLifeCycle() throws JastorException {
		this.lomLifeCycle = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lomLifeCycleProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lomLifeCycle properties in LOM model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				rvg.sv.LifeCycle lomLifeCycle = rvg.sv.lom_DOT_owlFactory.getLifeCycle(resource,_model);
				this.lomLifeCycle.add(lomLifeCycle);
			}
		}
	}

	public java.util.Iterator getLomLifeCycle() throws JastorException {
		if (lomLifeCycle == null)
			initLomLifeCycle();
		return new CachedPropertyIterator(lomLifeCycle,_resource,lomLifeCycleProperty,true);
	}

	public void addLomLifeCycle(rvg.sv.LifeCycle lomLifeCycle) throws JastorException {
		if (this.lomLifeCycle == null)
			initLomLifeCycle();
		if (this.lomLifeCycle.contains(lomLifeCycle)) {
			this.lomLifeCycle.remove(lomLifeCycle);
			this.lomLifeCycle.add(lomLifeCycle);
			return;
		}
		this.lomLifeCycle.add(lomLifeCycle);
		_model.add(_model.createStatement(_resource,lomLifeCycleProperty,lomLifeCycle.resource()));
	}
	
	public rvg.sv.LifeCycle addLomLifeCycle() throws JastorException {
		rvg.sv.LifeCycle lomLifeCycle = rvg.sv.lom_DOT_owlFactory.createLifeCycle(_model.createResource(),_model);
		if (this.lomLifeCycle == null)
			initLomLifeCycle();
		this.lomLifeCycle.add(lomLifeCycle);
		_model.add(_model.createStatement(_resource,lomLifeCycleProperty,lomLifeCycle.resource()));
		return lomLifeCycle;
	}
	
	public rvg.sv.LifeCycle addLomLifeCycle(Resource resource) throws JastorException {
		rvg.sv.LifeCycle lomLifeCycle = rvg.sv.lom_DOT_owlFactory.getLifeCycle(resource,_model);
		if (this.lomLifeCycle == null)
			initLomLifeCycle();
		if (this.lomLifeCycle.contains(lomLifeCycle))
			return lomLifeCycle;
		this.lomLifeCycle.add(lomLifeCycle);
		_model.add(_model.createStatement(_resource,lomLifeCycleProperty,lomLifeCycle.resource()));
		return lomLifeCycle;
	}
	
	public void removeLomLifeCycle(rvg.sv.LifeCycle lomLifeCycle) throws JastorException {
		if (this.lomLifeCycle == null)
			initLomLifeCycle();
		if (!this.lomLifeCycle.contains(lomLifeCycle))
			return;
		if (!_model.contains(_resource, lomLifeCycleProperty, lomLifeCycle.resource()))
			return;
		this.lomLifeCycle.remove(lomLifeCycle);
		_model.removeAll(_resource, lomLifeCycleProperty, lomLifeCycle.resource());
	}
		 

	private void initLomClassification() throws JastorException {
		this.lomClassification = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lomClassificationProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lomClassification properties in LOM model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				rvg.sv.Classification lomClassification = rvg.sv.lom_DOT_owlFactory.getClassification(resource,_model);
				this.lomClassification.add(lomClassification);
			}
		}
	}

	public java.util.Iterator getLomClassification() throws JastorException {
		if (lomClassification == null)
			initLomClassification();
		return new CachedPropertyIterator(lomClassification,_resource,lomClassificationProperty,true);
	}

	public void addLomClassification(rvg.sv.Classification lomClassification) throws JastorException {
		if (this.lomClassification == null)
			initLomClassification();
		if (this.lomClassification.contains(lomClassification)) {
			this.lomClassification.remove(lomClassification);
			this.lomClassification.add(lomClassification);
			return;
		}
		this.lomClassification.add(lomClassification);
		_model.add(_model.createStatement(_resource,lomClassificationProperty,lomClassification.resource()));
	}
	
	public rvg.sv.Classification addLomClassification() throws JastorException {
		rvg.sv.Classification lomClassification = rvg.sv.lom_DOT_owlFactory.createClassification(_model.createResource(),_model);
		if (this.lomClassification == null)
			initLomClassification();
		this.lomClassification.add(lomClassification);
		_model.add(_model.createStatement(_resource,lomClassificationProperty,lomClassification.resource()));
		return lomClassification;
	}
	
	public rvg.sv.Classification addLomClassification(Resource resource) throws JastorException {
		rvg.sv.Classification lomClassification = rvg.sv.lom_DOT_owlFactory.getClassification(resource,_model);
		if (this.lomClassification == null)
			initLomClassification();
		if (this.lomClassification.contains(lomClassification))
			return lomClassification;
		this.lomClassification.add(lomClassification);
		_model.add(_model.createStatement(_resource,lomClassificationProperty,lomClassification.resource()));
		return lomClassification;
	}
	
	public void removeLomClassification(rvg.sv.Classification lomClassification) throws JastorException {
		if (this.lomClassification == null)
			initLomClassification();
		if (!this.lomClassification.contains(lomClassification))
			return;
		if (!_model.contains(_resource, lomClassificationProperty, lomClassification.resource()))
			return;
		this.lomClassification.remove(lomClassification);
		_model.removeAll(_resource, lomClassificationProperty, lomClassification.resource());
	}
		 

	private void initLomGeneral() throws JastorException {
		this.lomGeneral = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lomGeneralProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lomGeneral properties in LOM model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				General lomGeneral = rvg.sv.lom_DOT_owlFactory.getGeneral(resource,_model);
				this.lomGeneral.add(lomGeneral);
			}
		}
	}

	public java.util.Iterator getLomGeneral() throws JastorException {
		if (lomGeneral == null)
			initLomGeneral();
		return new CachedPropertyIterator(lomGeneral,_resource,lomGeneralProperty,true);
	}

	public void addLomGeneral(General lomGeneral) throws JastorException {
		if (this.lomGeneral == null)
			initLomGeneral();
		if (this.lomGeneral.contains(lomGeneral)) {
			this.lomGeneral.remove(lomGeneral);
			this.lomGeneral.add(lomGeneral);
			return;
		}
		this.lomGeneral.add(lomGeneral);
		_model.add(_model.createStatement(_resource,lomGeneralProperty,lomGeneral.resource()));
	}
	
	public General addLomGeneral() throws JastorException {
		General lomGeneral = rvg.sv.lom_DOT_owlFactory.createGeneral(_model.createResource(),_model);
		if (this.lomGeneral == null)
			initLomGeneral();
		this.lomGeneral.add(lomGeneral);
		_model.add(_model.createStatement(_resource,lomGeneralProperty,lomGeneral.resource()));
		return lomGeneral;
	}
	
	public General addLomGeneral(Resource resource) throws JastorException {
		General lomGeneral = rvg.sv.lom_DOT_owlFactory.getGeneral(resource,_model);
		if (this.lomGeneral == null)
			initLomGeneral();
		if (this.lomGeneral.contains(lomGeneral))
			return lomGeneral;
		this.lomGeneral.add(lomGeneral);
		_model.add(_model.createStatement(_resource,lomGeneralProperty,lomGeneral.resource()));
		return lomGeneral;
	}
	
	public void removeLomGeneral(General lomGeneral) throws JastorException {
		if (this.lomGeneral == null)
			initLomGeneral();
		if (!this.lomGeneral.contains(lomGeneral))
			return;
		if (!_model.contains(_resource, lomGeneralProperty, lomGeneral.resource()))
			return;
		this.lomGeneral.remove(lomGeneral);
		_model.removeAll(_resource, lomGeneralProperty, lomGeneral.resource());
	}
		 

	private void initLomMetaMetadata() throws JastorException {
		this.lomMetaMetadata = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lomMetaMetadataProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lomMetaMetadata properties in LOM model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				Thing lomMetaMetadata = ThingFactory.getThing(resource,_model);
				this.lomMetaMetadata.add(lomMetaMetadata);
			}
		}
	}

	public java.util.Iterator getLomMetaMetadata() throws JastorException {
		if (lomMetaMetadata == null)
			initLomMetaMetadata();
		return new CachedPropertyIterator(lomMetaMetadata,_resource,lomMetaMetadataProperty,true);
	}

	public void addLomMetaMetadata(Thing lomMetaMetadata) throws JastorException {
		if (this.lomMetaMetadata == null)
			initLomMetaMetadata();
		if (this.lomMetaMetadata.contains(lomMetaMetadata)) {
			this.lomMetaMetadata.remove(lomMetaMetadata);
			this.lomMetaMetadata.add(lomMetaMetadata);
			return;
		}
		this.lomMetaMetadata.add(lomMetaMetadata);
		_model.add(_model.createStatement(_resource,lomMetaMetadataProperty,lomMetaMetadata.resource()));
	}
	
	public Thing addLomMetaMetadata() throws JastorException {
		Thing lomMetaMetadata = ThingFactory.createThing(_model.createResource(),_model);
		if (this.lomMetaMetadata == null)
			initLomMetaMetadata();
		this.lomMetaMetadata.add(lomMetaMetadata);
		_model.add(_model.createStatement(_resource,lomMetaMetadataProperty,lomMetaMetadata.resource()));
		return lomMetaMetadata;
	}
	
	public Thing addLomMetaMetadata(Resource resource) throws JastorException {
		Thing lomMetaMetadata = ThingFactory.getThing(resource,_model);
		if (this.lomMetaMetadata == null)
			initLomMetaMetadata();
		if (this.lomMetaMetadata.contains(lomMetaMetadata))
			return lomMetaMetadata;
		this.lomMetaMetadata.add(lomMetaMetadata);
		_model.add(_model.createStatement(_resource,lomMetaMetadataProperty,lomMetaMetadata.resource()));
		return lomMetaMetadata;
	}
	
	public void removeLomMetaMetadata(Thing lomMetaMetadata) throws JastorException {
		if (this.lomMetaMetadata == null)
			initLomMetaMetadata();
		if (!this.lomMetaMetadata.contains(lomMetaMetadata))
			return;
		if (!_model.contains(_resource, lomMetaMetadataProperty, lomMetaMetadata.resource()))
			return;
		this.lomMetaMetadata.remove(lomMetaMetadata);
		_model.removeAll(_resource, lomMetaMetadataProperty, lomMetaMetadata.resource());
	}
		 

	private void initLomTechnical() throws JastorException {
		this.lomTechnical = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, lomTechnicalProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#lomTechnical properties in LOM model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				rvg.sv.Technical lomTechnical = rvg.sv.lom_DOT_owlFactory.getTechnical(resource,_model);
				this.lomTechnical.add(lomTechnical);
			}
		}
	}

	public java.util.Iterator getLomTechnical() throws JastorException {
		if (lomTechnical == null)
			initLomTechnical();
		return new CachedPropertyIterator(lomTechnical,_resource,lomTechnicalProperty,true);
	}

	public void addLomTechnical(rvg.sv.Technical lomTechnical) throws JastorException {
		if (this.lomTechnical == null)
			initLomTechnical();
		if (this.lomTechnical.contains(lomTechnical)) {
			this.lomTechnical.remove(lomTechnical);
			this.lomTechnical.add(lomTechnical);
			return;
		}
		this.lomTechnical.add(lomTechnical);
		_model.add(_model.createStatement(_resource,lomTechnicalProperty,lomTechnical.resource()));
	}
	
	public rvg.sv.Technical addLomTechnical() throws JastorException {
		rvg.sv.Technical lomTechnical = rvg.sv.lom_DOT_owlFactory.createTechnical(_model.createResource(),_model);
		if (this.lomTechnical == null)
			initLomTechnical();
		this.lomTechnical.add(lomTechnical);
		_model.add(_model.createStatement(_resource,lomTechnicalProperty,lomTechnical.resource()));
		return lomTechnical;
	}
	
	public rvg.sv.Technical addLomTechnical(Resource resource) throws JastorException {
		rvg.sv.Technical lomTechnical = rvg.sv.lom_DOT_owlFactory.getTechnical(resource,_model);
		if (this.lomTechnical == null)
			initLomTechnical();
		if (this.lomTechnical.contains(lomTechnical))
			return lomTechnical;
		this.lomTechnical.add(lomTechnical);
		_model.add(_model.createStatement(_resource,lomTechnicalProperty,lomTechnical.resource()));
		return lomTechnical;
	}
	
	public void removeLomTechnical(rvg.sv.Technical lomTechnical) throws JastorException {
		if (this.lomTechnical == null)
			initLomTechnical();
		if (!this.lomTechnical.contains(lomTechnical))
			return;
		if (!_model.contains(_resource, lomTechnicalProperty, lomTechnical.resource()))
			return;
		this.lomTechnical.remove(lomTechnical);
		_model.removeAll(_resource, lomTechnicalProperty, lomTechnical.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof LOMListener))
			throw new IllegalArgumentException("ThingListener must be instance of LOMListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((LOMListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof LOMListener))
			throw new IllegalArgumentException("ThingListener must be instance of LOMListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(lomEducationalProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.Educational _lomEducational = null;
					try {
						_lomEducational = rvg.sv.lom_DOT_owlFactory.getEducational(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lomEducational == null) {
						try {
							initLomEducational();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lomEducational.contains(_lomEducational))
						lomEducational.add(_lomEducational);
					if (listeners != null) {
						java.util.ArrayList consumersForLomEducational;
						synchronized (listeners) {
							consumersForLomEducational = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomEducational.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomEducationalAdded(LOMImpl.this,_lomEducational);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomLifeCycleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.LifeCycle _lomLifeCycle = null;
					try {
						_lomLifeCycle = rvg.sv.lom_DOT_owlFactory.getLifeCycle(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lomLifeCycle == null) {
						try {
							initLomLifeCycle();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lomLifeCycle.contains(_lomLifeCycle))
						lomLifeCycle.add(_lomLifeCycle);
					if (listeners != null) {
						java.util.ArrayList consumersForLomLifeCycle;
						synchronized (listeners) {
							consumersForLomLifeCycle = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomLifeCycle.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomLifeCycleAdded(LOMImpl.this,_lomLifeCycle);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomClassificationProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.Classification _lomClassification = null;
					try {
						_lomClassification = rvg.sv.lom_DOT_owlFactory.getClassification(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lomClassification == null) {
						try {
							initLomClassification();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lomClassification.contains(_lomClassification))
						lomClassification.add(_lomClassification);
					if (listeners != null) {
						java.util.ArrayList consumersForLomClassification;
						synchronized (listeners) {
							consumersForLomClassification = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomClassification.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomClassificationAdded(LOMImpl.this,_lomClassification);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomGeneralProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					General _lomGeneral = null;
					try {
						_lomGeneral = rvg.sv.lom_DOT_owlFactory.getGeneral(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lomGeneral == null) {
						try {
							initLomGeneral();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lomGeneral.contains(_lomGeneral))
						lomGeneral.add(_lomGeneral);
					if (listeners != null) {
						java.util.ArrayList consumersForLomGeneral;
						synchronized (listeners) {
							consumersForLomGeneral = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomGeneral.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomGeneralAdded(LOMImpl.this,_lomGeneral);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomMetaMetadataProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Thing _lomMetaMetadata = null;
					try {
						_lomMetaMetadata = ThingFactory.getThing(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lomMetaMetadata == null) {
						try {
							initLomMetaMetadata();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lomMetaMetadata.contains(_lomMetaMetadata))
						lomMetaMetadata.add(_lomMetaMetadata);
					if (listeners != null) {
						java.util.ArrayList consumersForLomMetaMetadata;
						synchronized (listeners) {
							consumersForLomMetaMetadata = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomMetaMetadata.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomMetaMetadataAdded(LOMImpl.this,_lomMetaMetadata);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomTechnicalProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.Technical _lomTechnical = null;
					try {
						_lomTechnical = rvg.sv.lom_DOT_owlFactory.getTechnical(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (lomTechnical == null) {
						try {
							initLomTechnical();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!lomTechnical.contains(_lomTechnical))
						lomTechnical.add(_lomTechnical);
					if (listeners != null) {
						java.util.ArrayList consumersForLomTechnical;
						synchronized (listeners) {
							consumersForLomTechnical = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomTechnical.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomTechnicalAdded(LOMImpl.this,_lomTechnical);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(lomEducationalProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.Educational _lomEducational = null;
					if (lomEducational != null) {
						boolean found = false;
						for (int i=0;i<lomEducational.size();i++) {
							rvg.sv.Educational __item = (rvg.sv.Educational) lomEducational.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lomEducational = __item;
								break;
							}
						}
						if (found)
							lomEducational.remove(_lomEducational);
						else {
							try {
								_lomEducational = rvg.sv.lom_DOT_owlFactory.getEducational(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lomEducational = rvg.sv.lom_DOT_owlFactory.getEducational(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLomEducational;
						synchronized (listeners) {
							consumersForLomEducational = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomEducational.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomEducationalRemoved(LOMImpl.this,_lomEducational);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomLifeCycleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.LifeCycle _lomLifeCycle = null;
					if (lomLifeCycle != null) {
						boolean found = false;
						for (int i=0;i<lomLifeCycle.size();i++) {
							rvg.sv.LifeCycle __item = (rvg.sv.LifeCycle) lomLifeCycle.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lomLifeCycle = __item;
								break;
							}
						}
						if (found)
							lomLifeCycle.remove(_lomLifeCycle);
						else {
							try {
								_lomLifeCycle = rvg.sv.lom_DOT_owlFactory.getLifeCycle(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lomLifeCycle = rvg.sv.lom_DOT_owlFactory.getLifeCycle(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLomLifeCycle;
						synchronized (listeners) {
							consumersForLomLifeCycle = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomLifeCycle.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomLifeCycleRemoved(LOMImpl.this,_lomLifeCycle);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomClassificationProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.Classification _lomClassification = null;
					if (lomClassification != null) {
						boolean found = false;
						for (int i=0;i<lomClassification.size();i++) {
							rvg.sv.Classification __item = (rvg.sv.Classification) lomClassification.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lomClassification = __item;
								break;
							}
						}
						if (found)
							lomClassification.remove(_lomClassification);
						else {
							try {
								_lomClassification = rvg.sv.lom_DOT_owlFactory.getClassification(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lomClassification = rvg.sv.lom_DOT_owlFactory.getClassification(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLomClassification;
						synchronized (listeners) {
							consumersForLomClassification = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomClassification.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomClassificationRemoved(LOMImpl.this,_lomClassification);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomGeneralProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					General _lomGeneral = null;
					if (lomGeneral != null) {
						boolean found = false;
						for (int i=0;i<lomGeneral.size();i++) {
							General __item = (General) lomGeneral.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lomGeneral = __item;
								break;
							}
						}
						if (found)
							lomGeneral.remove(_lomGeneral);
						else {
							try {
								_lomGeneral = rvg.sv.lom_DOT_owlFactory.getGeneral(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lomGeneral = rvg.sv.lom_DOT_owlFactory.getGeneral(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLomGeneral;
						synchronized (listeners) {
							consumersForLomGeneral = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomGeneral.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomGeneralRemoved(LOMImpl.this,_lomGeneral);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomMetaMetadataProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Thing _lomMetaMetadata = null;
					if (lomMetaMetadata != null) {
						boolean found = false;
						for (int i=0;i<lomMetaMetadata.size();i++) {
							Thing __item = (Thing) lomMetaMetadata.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lomMetaMetadata = __item;
								break;
							}
						}
						if (found)
							lomMetaMetadata.remove(_lomMetaMetadata);
						else {
							try {
								_lomMetaMetadata = ThingFactory.getThing(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lomMetaMetadata = ThingFactory.getThing(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLomMetaMetadata;
						synchronized (listeners) {
							consumersForLomMetaMetadata = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomMetaMetadata.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomMetaMetadataRemoved(LOMImpl.this,_lomMetaMetadata);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(lomTechnicalProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					rvg.sv.Technical _lomTechnical = null;
					if (lomTechnical != null) {
						boolean found = false;
						for (int i=0;i<lomTechnical.size();i++) {
							rvg.sv.Technical __item = (rvg.sv.Technical) lomTechnical.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_lomTechnical = __item;
								break;
							}
						}
						if (found)
							lomTechnical.remove(_lomTechnical);
						else {
							try {
								_lomTechnical = rvg.sv.lom_DOT_owlFactory.getTechnical(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_lomTechnical = rvg.sv.lom_DOT_owlFactory.getTechnical(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForLomTechnical;
						synchronized (listeners) {
							consumersForLomTechnical = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForLomTechnical.iterator();iter.hasNext();){
							LOMListener listener=(LOMListener)iter.next();
							listener.lomTechnicalRemoved(LOMImpl.this,_lomTechnical);
						}
					}
				}
				return;
			}
		}

	//}
	


}