

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
 * Implementation of {@link General}
 * Use the rvg.sots.lom_DOT_owlFactory to create instances of this class.
 * <p>(URI: http://sots.rvg/lom.owl#General)</p>
 * <br>
 */
public class GeneralImpl extends ThingImpl implements General {
	

	private static Property generalDescriptionProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalDescription");
	private java.util.ArrayList generalDescription;
	private static Property generalTitleProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalTitle");
	private java.util.ArrayList generalTitle;
	private static Property gen_DOT_languageProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#gen.language");
	private java.util.ArrayList gen_DOT_language;
	private static Property generalKeywordProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalKeyword");
	private java.util.ArrayList generalKeyword;
	private static Property generalAggregationLevelProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalAggregationLevel");
	private java.util.ArrayList generalAggregationLevel;
	private static Property generalIdentifierProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalIdentifier");
	private java.util.ArrayList generalIdentifier;
	private static Property generalCoverageProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalCoverage");
	private java.util.ArrayList generalCoverage;
	private static Property generalStructureProperty = ResourceFactory.createProperty("http://sots.rvg/lom.owl#generalStructure");
	private java.util.ArrayList generalStructure;
 

	GeneralImpl(Resource resource, Model model) throws JastorException {
		super(resource, model);
		setupModelListener();
	}     
    	
	static GeneralImpl getGeneral(Resource resource, Model model) throws JastorException {
		return new GeneralImpl(resource, model);
	}
	    
	static GeneralImpl createGeneral(Resource resource, Model model) throws JastorException { 
		GeneralImpl impl = new GeneralImpl(resource, model);
		
		if (!impl._model.contains(new org.apache.jena.rdf.model.impl.StatementImpl(impl._resource, RDF.type, General.TYPE)))
			impl._model.add(impl._resource, RDF.type, General.TYPE);
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
		it = _model.listStatements(_resource,generalDescriptionProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,generalTitleProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,gen_DOT_languageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,generalKeywordProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,generalAggregationLevelProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,generalIdentifierProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,generalCoverageProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,generalStructureProperty,(RDFNode)null);
		while (it.hasNext()) {
			list.add(it.next());
		}
		it = _model.listStatements(_resource,RDF.type, General.TYPE);
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	public void clearCache() {
		generalDescription = null;
		generalTitle = null;
		gen_DOT_language = null;
		generalKeyword = null;
		generalAggregationLevel = null;
		generalIdentifier = null;
		generalCoverage = null;
		generalStructure = null;
	}

	private Literal createLiteral(Object obj) {
		return _model.createTypedLiteral(obj);
	}


	private void initGeneralDescription() throws JastorException {
		this.generalDescription = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalDescriptionProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalDescription properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString generalDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.generalDescription.add(generalDescription);
			}
		}
	}

	public java.util.Iterator getGeneralDescription() throws JastorException {
		if (generalDescription == null)
			initGeneralDescription();
		return new CachedPropertyIterator(generalDescription,_resource,generalDescriptionProperty,true);
	}

	public void addGeneralDescription(LangString generalDescription) throws JastorException {
		if (this.generalDescription == null)
			initGeneralDescription();
		if (this.generalDescription.contains(generalDescription)) {
			this.generalDescription.remove(generalDescription);
			this.generalDescription.add(generalDescription);
			return;
		}
		this.generalDescription.add(generalDescription);
		_model.add(_model.createStatement(_resource,generalDescriptionProperty,generalDescription.resource()));
	}
	
	public LangString addGeneralDescription() throws JastorException {
		LangString generalDescription = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.generalDescription == null)
			initGeneralDescription();
		this.generalDescription.add(generalDescription);
		_model.add(_model.createStatement(_resource,generalDescriptionProperty,generalDescription.resource()));
		return generalDescription;
	}
	
	public LangString addGeneralDescription(Resource resource) throws JastorException {
		LangString generalDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.generalDescription == null)
			initGeneralDescription();
		if (this.generalDescription.contains(generalDescription))
			return generalDescription;
		this.generalDescription.add(generalDescription);
		_model.add(_model.createStatement(_resource,generalDescriptionProperty,generalDescription.resource()));
		return generalDescription;
	}
	
	public void removeGeneralDescription(LangString generalDescription) throws JastorException {
		if (this.generalDescription == null)
			initGeneralDescription();
		if (!this.generalDescription.contains(generalDescription))
			return;
		if (!_model.contains(_resource, generalDescriptionProperty, generalDescription.resource()))
			return;
		this.generalDescription.remove(generalDescription);
		_model.removeAll(_resource, generalDescriptionProperty, generalDescription.resource());
	}
		 

	private void initGeneralTitle() throws JastorException {
		this.generalTitle = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalTitleProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalTitle properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString generalTitle = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.generalTitle.add(generalTitle);
			}
		}
	}

	public java.util.Iterator getGeneralTitle() throws JastorException {
		if (generalTitle == null)
			initGeneralTitle();
		return new CachedPropertyIterator(generalTitle,_resource,generalTitleProperty,true);
	}

	public void addGeneralTitle(LangString generalTitle) throws JastorException {
		if (this.generalTitle == null)
			initGeneralTitle();
		if (this.generalTitle.contains(generalTitle)) {
			this.generalTitle.remove(generalTitle);
			this.generalTitle.add(generalTitle);
			return;
		}
		this.generalTitle.add(generalTitle);
		_model.add(_model.createStatement(_resource,generalTitleProperty,generalTitle.resource()));
	}
	
	public LangString addGeneralTitle() throws JastorException {
		LangString generalTitle = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.generalTitle == null)
			initGeneralTitle();
		this.generalTitle.add(generalTitle);
		_model.add(_model.createStatement(_resource,generalTitleProperty,generalTitle.resource()));
		return generalTitle;
	}
	
	public LangString addGeneralTitle(Resource resource) throws JastorException {
		LangString generalTitle = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.generalTitle == null)
			initGeneralTitle();
		if (this.generalTitle.contains(generalTitle))
			return generalTitle;
		this.generalTitle.add(generalTitle);
		_model.add(_model.createStatement(_resource,generalTitleProperty,generalTitle.resource()));
		return generalTitle;
	}
	
	public void removeGeneralTitle(LangString generalTitle) throws JastorException {
		if (this.generalTitle == null)
			initGeneralTitle();
		if (!this.generalTitle.contains(generalTitle))
			return;
		if (!_model.contains(_resource, generalTitleProperty, generalTitle.resource()))
			return;
		this.generalTitle.remove(generalTitle);
		_model.removeAll(_resource, generalTitleProperty, generalTitle.resource());
	}
		 

	private void initGen_DOT_language() throws JastorException {
		gen_DOT_language = new java.util.ArrayList();
		
		StmtIterator it = _model.listStatements(_resource, gen_DOT_languageProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Literal.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#gen.language properties in General model not a Literal", stmt.getObject());
			Literal literal = (Literal) stmt.getObject().as(Literal.class);
			Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
			if (obj != null)
				gen_DOT_language.add(obj);
		}
	}

	public java.util.Iterator getGen_DOT_language() throws JastorException {
		if (gen_DOT_language == null)
			initGen_DOT_language();
		return new CachedPropertyIterator(gen_DOT_language,_resource,gen_DOT_languageProperty,false);
	}

	public void addGen_DOT_language(String gen_DOT_language) throws JastorException {
		if (this.gen_DOT_language == null)
			initGen_DOT_language();
		if (this.gen_DOT_language.contains(gen_DOT_language))
			return;
		if (_model.contains(_resource, gen_DOT_languageProperty, createLiteral(gen_DOT_language)))
			return;
		this.gen_DOT_language.add(gen_DOT_language);
		_model.add(_resource, gen_DOT_languageProperty, createLiteral(gen_DOT_language));
	}
	
	public void removeGen_DOT_language(String gen_DOT_language) throws JastorException {
		if (this.gen_DOT_language == null)
			initGen_DOT_language();
		if (!this.gen_DOT_language.contains(gen_DOT_language))
			return;
		if (!_model.contains(_resource, gen_DOT_languageProperty, createLiteral(gen_DOT_language)))
			return;
		this.gen_DOT_language.remove(gen_DOT_language);
		_model.removeAll(_resource, gen_DOT_languageProperty, createLiteral(gen_DOT_language));
	}


	private void initGeneralKeyword() throws JastorException {
		this.generalKeyword = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalKeywordProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalKeyword properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString generalKeyword = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.generalKeyword.add(generalKeyword);
			}
		}
	}

	public java.util.Iterator getGeneralKeyword() throws JastorException {
		if (generalKeyword == null)
			initGeneralKeyword();
		return new CachedPropertyIterator(generalKeyword,_resource,generalKeywordProperty,true);
	}

	public void addGeneralKeyword(LangString generalKeyword) throws JastorException {
		if (this.generalKeyword == null)
			initGeneralKeyword();
		if (this.generalKeyword.contains(generalKeyword)) {
			this.generalKeyword.remove(generalKeyword);
			this.generalKeyword.add(generalKeyword);
			return;
		}
		this.generalKeyword.add(generalKeyword);
		_model.add(_model.createStatement(_resource,generalKeywordProperty,generalKeyword.resource()));
	}
	
	public LangString addGeneralKeyword() throws JastorException {
		LangString generalKeyword = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.generalKeyword == null)
			initGeneralKeyword();
		this.generalKeyword.add(generalKeyword);
		_model.add(_model.createStatement(_resource,generalKeywordProperty,generalKeyword.resource()));
		return generalKeyword;
	}
	
	public LangString addGeneralKeyword(Resource resource) throws JastorException {
		LangString generalKeyword = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.generalKeyword == null)
			initGeneralKeyword();
		if (this.generalKeyword.contains(generalKeyword))
			return generalKeyword;
		this.generalKeyword.add(generalKeyword);
		_model.add(_model.createStatement(_resource,generalKeywordProperty,generalKeyword.resource()));
		return generalKeyword;
	}
	
	public void removeGeneralKeyword(LangString generalKeyword) throws JastorException {
		if (this.generalKeyword == null)
			initGeneralKeyword();
		if (!this.generalKeyword.contains(generalKeyword))
			return;
		if (!_model.contains(_resource, generalKeywordProperty, generalKeyword.resource()))
			return;
		this.generalKeyword.remove(generalKeyword);
		_model.removeAll(_resource, generalKeywordProperty, generalKeyword.resource());
	}
		 

	private void initGeneralAggregationLevel() throws JastorException {
		this.generalAggregationLevel = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalAggregationLevelProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalAggregationLevel properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				Vocabulary generalAggregationLevel = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
				this.generalAggregationLevel.add(generalAggregationLevel);
			}
		}
	}

	public java.util.Iterator getGeneralAggregationLevel() throws JastorException {
		if (generalAggregationLevel == null)
			initGeneralAggregationLevel();
		return new CachedPropertyIterator(generalAggregationLevel,_resource,generalAggregationLevelProperty,true);
	}

	public void addGeneralAggregationLevel(Vocabulary generalAggregationLevel) throws JastorException {
		if (this.generalAggregationLevel == null)
			initGeneralAggregationLevel();
		if (this.generalAggregationLevel.contains(generalAggregationLevel)) {
			this.generalAggregationLevel.remove(generalAggregationLevel);
			this.generalAggregationLevel.add(generalAggregationLevel);
			return;
		}
		this.generalAggregationLevel.add(generalAggregationLevel);
		_model.add(_model.createStatement(_resource,generalAggregationLevelProperty,generalAggregationLevel.resource()));
	}
	
	public Vocabulary addGeneralAggregationLevel() throws JastorException {
		Vocabulary generalAggregationLevel = rvg.sv.lom_DOT_owlFactory.createVocabulary(_model.createResource(),_model);
		if (this.generalAggregationLevel == null)
			initGeneralAggregationLevel();
		this.generalAggregationLevel.add(generalAggregationLevel);
		_model.add(_model.createStatement(_resource,generalAggregationLevelProperty,generalAggregationLevel.resource()));
		return generalAggregationLevel;
	}
	
	public Vocabulary addGeneralAggregationLevel(Resource resource) throws JastorException {
		Vocabulary generalAggregationLevel = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
		if (this.generalAggregationLevel == null)
			initGeneralAggregationLevel();
		if (this.generalAggregationLevel.contains(generalAggregationLevel))
			return generalAggregationLevel;
		this.generalAggregationLevel.add(generalAggregationLevel);
		_model.add(_model.createStatement(_resource,generalAggregationLevelProperty,generalAggregationLevel.resource()));
		return generalAggregationLevel;
	}
	
	public void removeGeneralAggregationLevel(Vocabulary generalAggregationLevel) throws JastorException {
		if (this.generalAggregationLevel == null)
			initGeneralAggregationLevel();
		if (!this.generalAggregationLevel.contains(generalAggregationLevel))
			return;
		if (!_model.contains(_resource, generalAggregationLevelProperty, generalAggregationLevel.resource()))
			return;
		this.generalAggregationLevel.remove(generalAggregationLevel);
		_model.removeAll(_resource, generalAggregationLevelProperty, generalAggregationLevel.resource());
	}
		 

	private void initGeneralIdentifier() throws JastorException {
		this.generalIdentifier = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalIdentifierProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalIdentifier properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				GIdentifier generalIdentifier = rvg.sv.lom_DOT_owlFactory.getGIdentifier(resource,_model);
				this.generalIdentifier.add(generalIdentifier);
			}
		}
	}

	public java.util.Iterator getGeneralIdentifier() throws JastorException {
		if (generalIdentifier == null)
			initGeneralIdentifier();
		return new CachedPropertyIterator(generalIdentifier,_resource,generalIdentifierProperty,true);
	}

	public void addGeneralIdentifier(GIdentifier generalIdentifier) throws JastorException {
		if (this.generalIdentifier == null)
			initGeneralIdentifier();
		if (this.generalIdentifier.contains(generalIdentifier)) {
			this.generalIdentifier.remove(generalIdentifier);
			this.generalIdentifier.add(generalIdentifier);
			return;
		}
		this.generalIdentifier.add(generalIdentifier);
		_model.add(_model.createStatement(_resource,generalIdentifierProperty,generalIdentifier.resource()));
	}
	
	public GIdentifier addGeneralIdentifier() throws JastorException {
		GIdentifier generalIdentifier = rvg.sv.lom_DOT_owlFactory.createGIdentifier(_model.createResource(),_model);
		if (this.generalIdentifier == null)
			initGeneralIdentifier();
		this.generalIdentifier.add(generalIdentifier);
		_model.add(_model.createStatement(_resource,generalIdentifierProperty,generalIdentifier.resource()));
		return generalIdentifier;
	}
	
	public GIdentifier addGeneralIdentifier(Resource resource) throws JastorException {
		GIdentifier generalIdentifier = rvg.sv.lom_DOT_owlFactory.getGIdentifier(resource,_model);
		if (this.generalIdentifier == null)
			initGeneralIdentifier();
		if (this.generalIdentifier.contains(generalIdentifier))
			return generalIdentifier;
		this.generalIdentifier.add(generalIdentifier);
		_model.add(_model.createStatement(_resource,generalIdentifierProperty,generalIdentifier.resource()));
		return generalIdentifier;
	}
	
	public void removeGeneralIdentifier(GIdentifier generalIdentifier) throws JastorException {
		if (this.generalIdentifier == null)
			initGeneralIdentifier();
		if (!this.generalIdentifier.contains(generalIdentifier))
			return;
		if (!_model.contains(_resource, generalIdentifierProperty, generalIdentifier.resource()))
			return;
		this.generalIdentifier.remove(generalIdentifier);
		_model.removeAll(_resource, generalIdentifierProperty, generalIdentifier.resource());
	}
		 

	private void initGeneralCoverage() throws JastorException {
		this.generalCoverage = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalCoverageProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalCoverage properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				LangString generalCoverage = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
				this.generalCoverage.add(generalCoverage);
			}
		}
	}

	public java.util.Iterator getGeneralCoverage() throws JastorException {
		if (generalCoverage == null)
			initGeneralCoverage();
		return new CachedPropertyIterator(generalCoverage,_resource,generalCoverageProperty,true);
	}

	public void addGeneralCoverage(LangString generalCoverage) throws JastorException {
		if (this.generalCoverage == null)
			initGeneralCoverage();
		if (this.generalCoverage.contains(generalCoverage)) {
			this.generalCoverage.remove(generalCoverage);
			this.generalCoverage.add(generalCoverage);
			return;
		}
		this.generalCoverage.add(generalCoverage);
		_model.add(_model.createStatement(_resource,generalCoverageProperty,generalCoverage.resource()));
	}
	
	public LangString addGeneralCoverage() throws JastorException {
		LangString generalCoverage = rvg.sv.lom_DOT_owlFactory.createLangString(_model.createResource(),_model);
		if (this.generalCoverage == null)
			initGeneralCoverage();
		this.generalCoverage.add(generalCoverage);
		_model.add(_model.createStatement(_resource,generalCoverageProperty,generalCoverage.resource()));
		return generalCoverage;
	}
	
	public LangString addGeneralCoverage(Resource resource) throws JastorException {
		LangString generalCoverage = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
		if (this.generalCoverage == null)
			initGeneralCoverage();
		if (this.generalCoverage.contains(generalCoverage))
			return generalCoverage;
		this.generalCoverage.add(generalCoverage);
		_model.add(_model.createStatement(_resource,generalCoverageProperty,generalCoverage.resource()));
		return generalCoverage;
	}
	
	public void removeGeneralCoverage(LangString generalCoverage) throws JastorException {
		if (this.generalCoverage == null)
			initGeneralCoverage();
		if (!this.generalCoverage.contains(generalCoverage))
			return;
		if (!_model.contains(_resource, generalCoverageProperty, generalCoverage.resource()))
			return;
		this.generalCoverage.remove(generalCoverage);
		_model.removeAll(_resource, generalCoverageProperty, generalCoverage.resource());
	}
		 

	private void initGeneralStructure() throws JastorException {
		this.generalStructure = new java.util.ArrayList();
		StmtIterator it = _model.listStatements(_resource, generalStructureProperty, (RDFNode)null);
		while(it.hasNext()) {
			Statement stmt = (Statement)it.next();
			if (!stmt.getObject().canAs(Resource.class))
				throw new JastorInvalidRDFNodeException (uri() + ": One of the http://sots.rvg/lom.owl#generalStructure properties in General model not a Resource", stmt.getObject());
			Resource resource = (Resource) stmt.getObject().as(Resource.class);
			if (true) { // don't check resource type if the property range is Resource
				Vocabulary generalStructure = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
				this.generalStructure.add(generalStructure);
			}
		}
	}

	public java.util.Iterator getGeneralStructure() throws JastorException {
		if (generalStructure == null)
			initGeneralStructure();
		return new CachedPropertyIterator(generalStructure,_resource,generalStructureProperty,true);
	}

	public void addGeneralStructure(Vocabulary generalStructure) throws JastorException {
		if (this.generalStructure == null)
			initGeneralStructure();
		if (this.generalStructure.contains(generalStructure)) {
			this.generalStructure.remove(generalStructure);
			this.generalStructure.add(generalStructure);
			return;
		}
		this.generalStructure.add(generalStructure);
		_model.add(_model.createStatement(_resource,generalStructureProperty,generalStructure.resource()));
	}
	
	public Vocabulary addGeneralStructure() throws JastorException {
		Vocabulary generalStructure = rvg.sv.lom_DOT_owlFactory.createVocabulary(_model.createResource(),_model);
		if (this.generalStructure == null)
			initGeneralStructure();
		this.generalStructure.add(generalStructure);
		_model.add(_model.createStatement(_resource,generalStructureProperty,generalStructure.resource()));
		return generalStructure;
	}
	
	public Vocabulary addGeneralStructure(Resource resource) throws JastorException {
		Vocabulary generalStructure = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
		if (this.generalStructure == null)
			initGeneralStructure();
		if (this.generalStructure.contains(generalStructure))
			return generalStructure;
		this.generalStructure.add(generalStructure);
		_model.add(_model.createStatement(_resource,generalStructureProperty,generalStructure.resource()));
		return generalStructure;
	}
	
	public void removeGeneralStructure(Vocabulary generalStructure) throws JastorException {
		if (this.generalStructure == null)
			initGeneralStructure();
		if (!this.generalStructure.contains(generalStructure))
			return;
		if (!_model.contains(_resource, generalStructureProperty, generalStructure.resource()))
			return;
		this.generalStructure.remove(generalStructure);
		_model.removeAll(_resource, generalStructureProperty, generalStructure.resource());
	}
		  


	private java.util.ArrayList listeners;
	
	public void registerListener(ThingListener listener) {
		if (!(listener instanceof GeneralListener))
			throw new IllegalArgumentException("ThingListener must be instance of GeneralListener"); 
		if (listeners == null)
			setupModelListener();
		if(!this.listeners.contains(listener)){
			this.listeners.add((GeneralListener)listener);
		}
	}
	
	public void unregisterListener(ThingListener listener) {
		if (!(listener instanceof GeneralListener))
			throw new IllegalArgumentException("ThingListener must be instance of GeneralListener"); 
		if (listeners == null)
			return;
		if (this.listeners.contains(listener)){
			listeners.remove(listener);
		}
	}



	
		public void addedStatement(Statement stmt) {

			if (stmt.getPredicate().equals(generalDescriptionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalDescription = null;
					try {
						_generalDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalDescription == null) {
						try {
							initGeneralDescription();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalDescription.contains(_generalDescription))
						generalDescription.add(_generalDescription);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralDescription;
						synchronized (listeners) {
							consumersForGeneralDescription = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralDescription.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalDescriptionAdded(GeneralImpl.this,_generalDescription);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalTitleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalTitle = null;
					try {
						_generalTitle = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalTitle == null) {
						try {
							initGeneralTitle();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalTitle.contains(_generalTitle))
						generalTitle.add(_generalTitle);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralTitle;
						synchronized (listeners) {
							consumersForGeneralTitle = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralTitle.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalTitleAdded(GeneralImpl.this,_generalTitle);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(gen_DOT_languageProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gen_DOT_language == null) {
					try {
						initGen_DOT_language();
					} catch (JastorException e) {
						e.printStackTrace();
						return;
					}
				}
				if (obj != null && !gen_DOT_language.contains(obj))
					gen_DOT_language.add(obj);
				java.util.ArrayList consumersForGen_DOT_language;
				if (listeners != null) {
					synchronized (listeners) {
						consumersForGen_DOT_language = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumersForGen_DOT_language.iterator();iter.hasNext();){
						GeneralListener listener=(GeneralListener)iter.next();
						listener.gen_DOT_languageAdded(GeneralImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalKeywordProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalKeyword = null;
					try {
						_generalKeyword = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalKeyword == null) {
						try {
							initGeneralKeyword();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalKeyword.contains(_generalKeyword))
						generalKeyword.add(_generalKeyword);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralKeyword;
						synchronized (listeners) {
							consumersForGeneralKeyword = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralKeyword.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalKeywordAdded(GeneralImpl.this,_generalKeyword);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalAggregationLevelProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _generalAggregationLevel = null;
					try {
						_generalAggregationLevel = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalAggregationLevel == null) {
						try {
							initGeneralAggregationLevel();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalAggregationLevel.contains(_generalAggregationLevel))
						generalAggregationLevel.add(_generalAggregationLevel);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralAggregationLevel;
						synchronized (listeners) {
							consumersForGeneralAggregationLevel = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralAggregationLevel.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalAggregationLevelAdded(GeneralImpl.this,_generalAggregationLevel);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalIdentifierProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					GIdentifier _generalIdentifier = null;
					try {
						_generalIdentifier = rvg.sv.lom_DOT_owlFactory.getGIdentifier(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalIdentifier == null) {
						try {
							initGeneralIdentifier();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalIdentifier.contains(_generalIdentifier))
						generalIdentifier.add(_generalIdentifier);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralIdentifier;
						synchronized (listeners) {
							consumersForGeneralIdentifier = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralIdentifier.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalIdentifierAdded(GeneralImpl.this,_generalIdentifier);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalCoverageProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalCoverage = null;
					try {
						_generalCoverage = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalCoverage == null) {
						try {
							initGeneralCoverage();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalCoverage.contains(_generalCoverage))
						generalCoverage.add(_generalCoverage);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralCoverage;
						synchronized (listeners) {
							consumersForGeneralCoverage = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralCoverage.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalCoverageAdded(GeneralImpl.this,_generalCoverage);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalStructureProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _generalStructure = null;
					try {
						_generalStructure = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
					} catch (JastorException e) {
						//e.printStackTrace();
					}
					if (generalStructure == null) {
						try {
							initGeneralStructure();
						} catch (JastorException e) {
							e.printStackTrace();
							return;
						}
					}
					if (!generalStructure.contains(_generalStructure))
						generalStructure.add(_generalStructure);
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralStructure;
						synchronized (listeners) {
							consumersForGeneralStructure = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralStructure.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalStructureAdded(GeneralImpl.this,_generalStructure);
						}
					}
				}
				return;
			}
		}
		
		public void removedStatement(Statement stmt) {
//			if (!stmt.getSubject().equals(_resource))
//				return;
			if (stmt.getPredicate().equals(generalDescriptionProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalDescription = null;
					if (generalDescription != null) {
						boolean found = false;
						for (int i=0;i<generalDescription.size();i++) {
							LangString __item = (LangString) generalDescription.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalDescription = __item;
								break;
							}
						}
						if (found)
							generalDescription.remove(_generalDescription);
						else {
							try {
								_generalDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalDescription = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralDescription;
						synchronized (listeners) {
							consumersForGeneralDescription = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralDescription.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalDescriptionRemoved(GeneralImpl.this,_generalDescription);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalTitleProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalTitle = null;
					if (generalTitle != null) {
						boolean found = false;
						for (int i=0;i<generalTitle.size();i++) {
							LangString __item = (LangString) generalTitle.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalTitle = __item;
								break;
							}
						}
						if (found)
							generalTitle.remove(_generalTitle);
						else {
							try {
								_generalTitle = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalTitle = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralTitle;
						synchronized (listeners) {
							consumersForGeneralTitle = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralTitle.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalTitleRemoved(GeneralImpl.this,_generalTitle);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(gen_DOT_languageProperty)) {
				if (!stmt.getObject().canAs(Literal.class))
					return;
				Literal literal = (Literal) stmt.getObject().as(Literal.class);
				//Object obj = literal.getValue();
				Object obj = Util.fixLiteral(true,literal,"java.lang.String","http://www.w3.org/2001/XMLSchema#string");
				if (gen_DOT_language != null) {
					if (gen_DOT_language.contains(obj))
						gen_DOT_language.remove(obj);
				}
				if (listeners != null) {
					java.util.ArrayList consumers;
					synchronized (listeners) {
						consumers = (java.util.ArrayList) listeners.clone();
					}
					for(java.util.Iterator iter=consumers.iterator();iter.hasNext();){
						GeneralListener listener=(GeneralListener)iter.next();
						listener.gen_DOT_languageRemoved(GeneralImpl.this,(String)obj);
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalKeywordProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalKeyword = null;
					if (generalKeyword != null) {
						boolean found = false;
						for (int i=0;i<generalKeyword.size();i++) {
							LangString __item = (LangString) generalKeyword.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalKeyword = __item;
								break;
							}
						}
						if (found)
							generalKeyword.remove(_generalKeyword);
						else {
							try {
								_generalKeyword = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalKeyword = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralKeyword;
						synchronized (listeners) {
							consumersForGeneralKeyword = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralKeyword.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalKeywordRemoved(GeneralImpl.this,_generalKeyword);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalAggregationLevelProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _generalAggregationLevel = null;
					if (generalAggregationLevel != null) {
						boolean found = false;
						for (int i=0;i<generalAggregationLevel.size();i++) {
							Vocabulary __item = (Vocabulary) generalAggregationLevel.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalAggregationLevel = __item;
								break;
							}
						}
						if (found)
							generalAggregationLevel.remove(_generalAggregationLevel);
						else {
							try {
								_generalAggregationLevel = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalAggregationLevel = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralAggregationLevel;
						synchronized (listeners) {
							consumersForGeneralAggregationLevel = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralAggregationLevel.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalAggregationLevelRemoved(GeneralImpl.this,_generalAggregationLevel);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalIdentifierProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					GIdentifier _generalIdentifier = null;
					if (generalIdentifier != null) {
						boolean found = false;
						for (int i=0;i<generalIdentifier.size();i++) {
							GIdentifier __item = (GIdentifier) generalIdentifier.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalIdentifier = __item;
								break;
							}
						}
						if (found)
							generalIdentifier.remove(_generalIdentifier);
						else {
							try {
								_generalIdentifier = rvg.sv.lom_DOT_owlFactory.getGIdentifier(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalIdentifier = rvg.sv.lom_DOT_owlFactory.getGIdentifier(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralIdentifier;
						synchronized (listeners) {
							consumersForGeneralIdentifier = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralIdentifier.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalIdentifierRemoved(GeneralImpl.this,_generalIdentifier);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalCoverageProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					LangString _generalCoverage = null;
					if (generalCoverage != null) {
						boolean found = false;
						for (int i=0;i<generalCoverage.size();i++) {
							LangString __item = (LangString) generalCoverage.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalCoverage = __item;
								break;
							}
						}
						if (found)
							generalCoverage.remove(_generalCoverage);
						else {
							try {
								_generalCoverage = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalCoverage = rvg.sv.lom_DOT_owlFactory.getLangString(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralCoverage;
						synchronized (listeners) {
							consumersForGeneralCoverage = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralCoverage.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalCoverageRemoved(GeneralImpl.this,_generalCoverage);
						}
					}
				}
				return;
			}
			if (stmt.getPredicate().equals(generalStructureProperty)) {
				if (!stmt.getObject().canAs(Resource.class))
					return;
				Resource resource = (Resource) stmt.getObject().as(Resource.class);
				if (true) { // don't check resource type if the property range is Resource
					Vocabulary _generalStructure = null;
					if (generalStructure != null) {
						boolean found = false;
						for (int i=0;i<generalStructure.size();i++) {
							Vocabulary __item = (Vocabulary) generalStructure.get(i);
							if (__item.resource().equals(resource)) {
								found = true;
								_generalStructure = __item;
								break;
							}
						}
						if (found)
							generalStructure.remove(_generalStructure);
						else {
							try {
								_generalStructure = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
							} catch (JastorException e) {
							}
						}
					} else {
						try {
							_generalStructure = rvg.sv.lom_DOT_owlFactory.getVocabulary(resource,_model);
						} catch (JastorException e) {
						}
					}
					if (listeners != null) {
						java.util.ArrayList consumersForGeneralStructure;
						synchronized (listeners) {
							consumersForGeneralStructure = (java.util.ArrayList) listeners.clone();
						}
						for(java.util.Iterator iter=consumersForGeneralStructure.iterator();iter.hasNext();){
							GeneralListener listener=(GeneralListener)iter.next();
							listener.generalStructureRemoved(GeneralImpl.this,_generalStructure);
						}
					}
				}
				return;
			}
		}

	//}
	


}