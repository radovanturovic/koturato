

package rvg.sv;

import com.ibm.adtech.jastor.*;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.RDF;

/**
 * Factory for instantiating objects for ontology classes in the lom.owl ontology.  The
 * get methods leave the model unchanged and return a Java view of the object in the model.  The create methods
 * may add certain baseline properties to the model such as rdf:type and any properties with hasValue restrictions.
 * <p>(URI: http://sots.rvg/lom.owl)</p>
 * <br>
 * <br>
 * <br>
 */
public class lom_DOT_owlFactory extends ThingFactory {



	/**
	 * Create a new instance of GIdentifier.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the GIdentifier
	 * @param model the Jena Model.
	 */
	public static GIdentifier createGIdentifier(Resource resource, Model model) throws JastorException {
		return GIdentifierImpl.createGIdentifier(resource,model);
	}
	
	/**
	 * Create a new instance of GIdentifier.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the GIdentifier
	 * @param model the Jena Model.
	 */
	public static GIdentifier createGIdentifier(String uri, Model model) throws JastorException {
		GIdentifier obj = GIdentifierImpl.createGIdentifier(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of GIdentifier.  Leaves the model unchanged.
	 * @param uri The uri of the GIdentifier
	 * @param model the Jena Model.
	 */
	public static GIdentifier getGIdentifier(String uri, Model model) throws JastorException {
		return getGIdentifier(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of GIdentifier.  Leaves the model unchanged.
	 * @param resource The resource of the GIdentifier
	 * @param model the Jena Model.
	 */
	public static GIdentifier getGIdentifier(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + GIdentifier.class.hashCode()) + resource.toString();
		GIdentifierImpl obj = (GIdentifierImpl)objects.get(code);
		if (obj == null) {
			obj = GIdentifierImpl.getGIdentifier(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of GIdentifier for every resource in the model with rdf:Type http://sots.rvg/lom.owl#GIdentifier
	 * @param model the Jena Model
	 * @return a List of GIdentifier
	 */
	public static java.util.List getAllGIdentifier(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,GIdentifier.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGIdentifier(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Technical.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Technical
	 * @param model the Jena Model.
	 */
	public static Technical createTechnical(Resource resource, Model model) throws JastorException {
		return TechnicalImpl.createTechnical(resource,model);
	}
	
	/**
	 * Create a new instance of Technical.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Technical
	 * @param model the Jena Model.
	 */
	public static Technical createTechnical(String uri, Model model) throws JastorException {
		Technical obj = TechnicalImpl.createTechnical(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Technical.  Leaves the model unchanged.
	 * @param uri The uri of the Technical
	 * @param model the Jena Model.
	 */
	public static Technical getTechnical(String uri, Model model) throws JastorException {
		return getTechnical(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Technical.  Leaves the model unchanged.
	 * @param resource The resource of the Technical
	 * @param model the Jena Model.
	 */
	public static Technical getTechnical(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Technical.class.hashCode()) + resource.toString();
		TechnicalImpl obj = (TechnicalImpl)objects.get(code);
		if (obj == null) {
			obj = TechnicalImpl.getTechnical(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Technical for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Technical
	 * @param model the Jena Model
	 * @return a List of Technical
	 */
	public static java.util.List getAllTechnical(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Technical.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getTechnical(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of LifeCycle.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the LifeCycle
	 * @param model the Jena Model.
	 */
	public static LifeCycle createLifeCycle(Resource resource, Model model) throws JastorException {
		return LifeCycleImpl.createLifeCycle(resource,model);
	}
	
	/**
	 * Create a new instance of LifeCycle.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the LifeCycle
	 * @param model the Jena Model.
	 */
	public static LifeCycle createLifeCycle(String uri, Model model) throws JastorException {
		LifeCycle obj = LifeCycleImpl.createLifeCycle(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of LifeCycle.  Leaves the model unchanged.
	 * @param uri The uri of the LifeCycle
	 * @param model the Jena Model.
	 */
	public static LifeCycle getLifeCycle(String uri, Model model) throws JastorException {
		return getLifeCycle(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of LifeCycle.  Leaves the model unchanged.
	 * @param resource The resource of the LifeCycle
	 * @param model the Jena Model.
	 */
	public static LifeCycle getLifeCycle(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + LifeCycle.class.hashCode()) + resource.toString();
		LifeCycleImpl obj = (LifeCycleImpl)objects.get(code);
		if (obj == null) {
			obj = LifeCycleImpl.getLifeCycle(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of LifeCycle for every resource in the model with rdf:Type http://sots.rvg/lom.owl#LifeCycle
	 * @param model the Jena Model
	 * @return a List of LifeCycle
	 */
	public static java.util.List getAllLifeCycle(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,LifeCycle.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getLifeCycle(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Educational.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Educational
	 * @param model the Jena Model.
	 */
	public static Educational createEducational(Resource resource, Model model) throws JastorException {
		return EducationalImpl.createEducational(resource,model);
	}
	
	/**
	 * Create a new instance of Educational.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Educational
	 * @param model the Jena Model.
	 */
	public static Educational createEducational(String uri, Model model) throws JastorException {
		Educational obj = EducationalImpl.createEducational(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Educational.  Leaves the model unchanged.
	 * @param uri The uri of the Educational
	 * @param model the Jena Model.
	 */
	public static Educational getEducational(String uri, Model model) throws JastorException {
		return getEducational(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Educational.  Leaves the model unchanged.
	 * @param resource The resource of the Educational
	 * @param model the Jena Model.
	 */
	public static Educational getEducational(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Educational.class.hashCode()) + resource.toString();
		EducationalImpl obj = (EducationalImpl)objects.get(code);
		if (obj == null) {
			obj = EducationalImpl.getEducational(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Educational for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Educational
	 * @param model the Jena Model
	 * @return a List of Educational
	 */
	public static java.util.List getAllEducational(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Educational.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getEducational(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CTCTaxon.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CTCTaxon
	 * @param model the Jena Model.
	 */
	public static CTCTaxon createCTCTaxon(Resource resource, Model model) throws JastorException {
		return CTCTaxonImpl.createCTCTaxon(resource,model);
	}
	
	/**
	 * Create a new instance of CTCTaxon.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CTCTaxon
	 * @param model the Jena Model.
	 */
	public static CTCTaxon createCTCTaxon(String uri, Model model) throws JastorException {
		CTCTaxon obj = CTCTaxonImpl.createCTCTaxon(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CTCTaxon.  Leaves the model unchanged.
	 * @param uri The uri of the CTCTaxon
	 * @param model the Jena Model.
	 */
	public static CTCTaxon getCTCTaxon(String uri, Model model) throws JastorException {
		return getCTCTaxon(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CTCTaxon.  Leaves the model unchanged.
	 * @param resource The resource of the CTCTaxon
	 * @param model the Jena Model.
	 */
	public static CTCTaxon getCTCTaxon(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + CTCTaxon.class.hashCode()) + resource.toString();
		CTCTaxonImpl obj = (CTCTaxonImpl)objects.get(code);
		if (obj == null) {
			obj = CTCTaxonImpl.getCTCTaxon(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CTCTaxon for every resource in the model with rdf:Type http://sots.rvg/lom.owl#CTCTaxon
	 * @param model the Jena Model
	 * @return a List of CTCTaxon
	 */
	public static java.util.List getAllCTCTaxon(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CTCTaxon.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCTCTaxon(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of LOM.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the LOM
	 * @param model the Jena Model.
	 */
	public static LOM createLOM(Resource resource, Model model) throws JastorException {
		return LOMImpl.createLOM(resource,model);
	}
	
	/**
	 * Create a new instance of LOM.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the LOM
	 * @param model the Jena Model.
	 */
	public static LOM createLOM(String uri, Model model) throws JastorException {
		LOM obj = LOMImpl.createLOM(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of LOM.  Leaves the model unchanged.
	 * @param uri The uri of the LOM
	 * @param model the Jena Model.
	 */
	public static LOM getLOM(String uri, Model model) throws JastorException {
		return getLOM(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of LOM.  Leaves the model unchanged.
	 * @param resource The resource of the LOM
	 * @param model the Jena Model.
	 */
	public static LOM getLOM(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + LOM.class.hashCode()) + resource.toString();
		LOMImpl obj = (LOMImpl)objects.get(code);
		if (obj == null) {
			obj = LOMImpl.getLOM(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of LOM for every resource in the model with rdf:Type http://sots.rvg/lom.owl#LOM
	 * @param model the Jena Model
	 * @return a List of LOM
	 */
	public static java.util.List getAllLOM(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,LOM.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getLOM(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of CTaxonCollection.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the CTaxonCollection
	 * @param model the Jena Model.
	 */
	public static CTaxonCollection createCTaxonCollection(Resource resource, Model model) throws JastorException {
		return rvg.sv.CTaxonCollectionImpl.createCTaxonCollection(resource,model);
	}
	
	/**
	 * Create a new instance of CTaxonCollection.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the CTaxonCollection
	 * @param model the Jena Model.
	 */
	public static CTaxonCollection createCTaxonCollection(String uri, Model model) throws JastorException {
		CTaxonCollection obj = rvg.sv.CTaxonCollectionImpl.createCTaxonCollection(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of CTaxonCollection.  Leaves the model unchanged.
	 * @param uri The uri of the CTaxonCollection
	 * @param model the Jena Model.
	 */
	public static CTaxonCollection getCTaxonCollection(String uri, Model model) throws JastorException {
		return getCTaxonCollection(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of CTaxonCollection.  Leaves the model unchanged.
	 * @param resource The resource of the CTaxonCollection
	 * @param model the Jena Model.
	 */
	public static CTaxonCollection getCTaxonCollection(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + CTaxonCollection.class.hashCode()) + resource.toString();
		rvg.sv.CTaxonCollectionImpl obj = (rvg.sv.CTaxonCollectionImpl)objects.get(code);
		if (obj == null) {
			obj = rvg.sv.CTaxonCollectionImpl.getCTaxonCollection(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of CTaxonCollection for every resource in the model with rdf:Type http://sots.rvg/lom.owl#CTaxonCollection
	 * @param model the Jena Model
	 * @return a List of CTaxonCollection
	 */
	public static java.util.List getAllCTaxonCollection(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,CTaxonCollection.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCTaxonCollection(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Vocabulary.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Vocabulary
	 * @param model the Jena Model.
	 */
	public static Vocabulary createVocabulary(Resource resource, Model model) throws JastorException {
		return VocabularyImpl.createVocabulary(resource,model);
	}
	
	/**
	 * Create a new instance of Vocabulary.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Vocabulary
	 * @param model the Jena Model.
	 */
	public static Vocabulary createVocabulary(String uri, Model model) throws JastorException {
		Vocabulary obj = VocabularyImpl.createVocabulary(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Vocabulary.  Leaves the model unchanged.
	 * @param uri The uri of the Vocabulary
	 * @param model the Jena Model.
	 */
	public static Vocabulary getVocabulary(String uri, Model model) throws JastorException {
		return getVocabulary(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Vocabulary.  Leaves the model unchanged.
	 * @param resource The resource of the Vocabulary
	 * @param model the Jena Model.
	 */
	public static Vocabulary getVocabulary(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Vocabulary.class.hashCode()) + resource.toString();
		VocabularyImpl obj = (VocabularyImpl)objects.get(code);
		if (obj == null) {
			obj = VocabularyImpl.getVocabulary(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Vocabulary for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Vocabulary
	 * @param model the Jena Model
	 * @return a List of Vocabulary
	 */
	public static java.util.List getAllVocabulary(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Vocabulary.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getVocabulary(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of General.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the General
	 * @param model the Jena Model.
	 */
	public static General createGeneral(Resource resource, Model model) throws JastorException {
		return GeneralImpl.createGeneral(resource,model);
	}
	
	/**
	 * Create a new instance of General.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the General
	 * @param model the Jena Model.
	 */
	public static General createGeneral(String uri, Model model) throws JastorException {
		General obj = GeneralImpl.createGeneral(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of General.  Leaves the model unchanged.
	 * @param uri The uri of the General
	 * @param model the Jena Model.
	 */
	public static General getGeneral(String uri, Model model) throws JastorException {
		return getGeneral(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of General.  Leaves the model unchanged.
	 * @param resource The resource of the General
	 * @param model the Jena Model.
	 */
	public static General getGeneral(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + General.class.hashCode()) + resource.toString();
		GeneralImpl obj = (GeneralImpl)objects.get(code);
		if (obj == null) {
			obj = GeneralImpl.getGeneral(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of General for every resource in the model with rdf:Type http://sots.rvg/lom.owl#General
	 * @param model the Jena Model
	 * @return a List of General
	 */
	public static java.util.List getAllGeneral(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,General.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getGeneral(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Meta_DASH_Metadata.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Meta_DASH_Metadata
	 * @param model the Jena Model.
	 */
	public static Meta_DASH_Metadata createMeta_DASH_Metadata(Resource resource, Model model) throws JastorException {
		return rvg.sv.Meta_DASH_MetadataImpl.createMeta_DASH_Metadata(resource,model);
	}
	
	/**
	 * Create a new instance of Meta_DASH_Metadata.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Meta_DASH_Metadata
	 * @param model the Jena Model.
	 */
	public static Meta_DASH_Metadata createMeta_DASH_Metadata(String uri, Model model) throws JastorException {
		Meta_DASH_Metadata obj = rvg.sv.Meta_DASH_MetadataImpl.createMeta_DASH_Metadata(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Meta_DASH_Metadata.  Leaves the model unchanged.
	 * @param uri The uri of the Meta_DASH_Metadata
	 * @param model the Jena Model.
	 */
	public static Meta_DASH_Metadata getMeta_DASH_Metadata(String uri, Model model) throws JastorException {
		return getMeta_DASH_Metadata(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Meta_DASH_Metadata.  Leaves the model unchanged.
	 * @param resource The resource of the Meta_DASH_Metadata
	 * @param model the Jena Model.
	 */
	public static Meta_DASH_Metadata getMeta_DASH_Metadata(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Meta_DASH_Metadata.class.hashCode()) + resource.toString();
		rvg.sv.Meta_DASH_MetadataImpl obj = (rvg.sv.Meta_DASH_MetadataImpl)objects.get(code);
		if (obj == null) {
			obj = rvg.sv.Meta_DASH_MetadataImpl.getMeta_DASH_Metadata(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Meta_DASH_Metadata for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Meta-Metadata
	 * @param model the Jena Model
	 * @return a List of Meta_DASH_Metadata
	 */
	public static java.util.List getAllMeta_DASH_Metadata(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Meta_DASH_Metadata.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMeta_DASH_Metadata(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Data.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Data
	 * @param model the Jena Model.
	 */
	public static Data createData(Resource resource, Model model) throws JastorException {
		return DataImpl.createData(resource,model);
	}
	
	/**
	 * Create a new instance of Data.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Data
	 * @param model the Jena Model.
	 */
	public static Data createData(String uri, Model model) throws JastorException {
		Data obj = DataImpl.createData(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Data.  Leaves the model unchanged.
	 * @param uri The uri of the Data
	 * @param model the Jena Model.
	 */
	public static Data getData(String uri, Model model) throws JastorException {
		return getData(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Data.  Leaves the model unchanged.
	 * @param resource The resource of the Data
	 * @param model the Jena Model.
	 */
	public static Data getData(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Data.class.hashCode()) + resource.toString();
		DataImpl obj = (DataImpl)objects.get(code);
		if (obj == null) {
			obj = DataImpl.getData(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Data for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Data
	 * @param model the Jena Model
	 * @return a List of Data
	 */
	public static java.util.List getAllData(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Data.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getData(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Duration.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Duration
	 * @param model the Jena Model.
	 */
	public static Duration createDuration(Resource resource, Model model) throws JastorException {
		return DurationImpl.createDuration(resource,model);
	}
	
	/**
	 * Create a new instance of Duration.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Duration
	 * @param model the Jena Model.
	 */
	public static Duration createDuration(String uri, Model model) throws JastorException {
		Duration obj = DurationImpl.createDuration(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Duration.  Leaves the model unchanged.
	 * @param uri The uri of the Duration
	 * @param model the Jena Model.
	 */
	public static Duration getDuration(String uri, Model model) throws JastorException {
		return getDuration(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Duration.  Leaves the model unchanged.
	 * @param resource The resource of the Duration
	 * @param model the Jena Model.
	 */
	public static Duration getDuration(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Duration.class.hashCode()) + resource.toString();
		DurationImpl obj = (DurationImpl)objects.get(code);
		if (obj == null) {
			obj = DurationImpl.getDuration(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Duration for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Duration
	 * @param model the Jena Model
	 * @return a List of Duration
	 */
	public static java.util.List getAllDuration(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Duration.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDuration(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of LCContribute.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the LCContribute
	 * @param model the Jena Model.
	 */
	public static LCContribute createLCContribute(Resource resource, Model model) throws JastorException {
		return LCContributeImpl.createLCContribute(resource,model);
	}
	
	/**
	 * Create a new instance of LCContribute.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the LCContribute
	 * @param model the Jena Model.
	 */
	public static LCContribute createLCContribute(String uri, Model model) throws JastorException {
		LCContribute obj = LCContributeImpl.createLCContribute(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of LCContribute.  Leaves the model unchanged.
	 * @param uri The uri of the LCContribute
	 * @param model the Jena Model.
	 */
	public static LCContribute getLCContribute(String uri, Model model) throws JastorException {
		return getLCContribute(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of LCContribute.  Leaves the model unchanged.
	 * @param resource The resource of the LCContribute
	 * @param model the Jena Model.
	 */
	public static LCContribute getLCContribute(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + LCContribute.class.hashCode()) + resource.toString();
		LCContributeImpl obj = (LCContributeImpl)objects.get(code);
		if (obj == null) {
			obj = LCContributeImpl.getLCContribute(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of LCContribute for every resource in the model with rdf:Type http://sots.rvg/lom.owl#LCContribute
	 * @param model the Jena Model
	 * @return a List of LCContribute
	 */
	public static java.util.List getAllLCContribute(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,LCContribute.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getLCContribute(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Classification.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Classification
	 * @param model the Jena Model.
	 */
	public static Classification createClassification(Resource resource, Model model) throws JastorException {
		return ClassificationImpl.createClassification(resource,model);
	}
	
	/**
	 * Create a new instance of Classification.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Classification
	 * @param model the Jena Model.
	 */
	public static Classification createClassification(String uri, Model model) throws JastorException {
		Classification obj = ClassificationImpl.createClassification(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Classification.  Leaves the model unchanged.
	 * @param uri The uri of the Classification
	 * @param model the Jena Model.
	 */
	public static Classification getClassification(String uri, Model model) throws JastorException {
		return getClassification(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Classification.  Leaves the model unchanged.
	 * @param resource The resource of the Classification
	 * @param model the Jena Model.
	 */
	public static Classification getClassification(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Classification.class.hashCode()) + resource.toString();
		ClassificationImpl obj = (ClassificationImpl)objects.get(code);
		if (obj == null) {
			obj = ClassificationImpl.getClassification(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Classification for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Classification
	 * @param model the Jena Model
	 * @return a List of Classification
	 */
	public static java.util.List getAllClassification(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Classification.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getClassification(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of LangString.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the LangString
	 * @param model the Jena Model.
	 */
	public static LangString createLangString(Resource resource, Model model) throws JastorException {
		return LangStringImpl.createLangString(resource,model);
	}
	
	/**
	 * Create a new instance of LangString.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the LangString
	 * @param model the Jena Model.
	 */
	public static LangString createLangString(String uri, Model model) throws JastorException {
		LangString obj = LangStringImpl.createLangString(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of LangString.  Leaves the model unchanged.
	 * @param uri The uri of the LangString
	 * @param model the Jena Model.
	 */
	public static LangString getLangString(String uri, Model model) throws JastorException {
		return getLangString(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of LangString.  Leaves the model unchanged.
	 * @param resource The resource of the LangString
	 * @param model the Jena Model.
	 */
	public static LangString getLangString(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + LangString.class.hashCode()) + resource.toString();
		LangStringImpl obj = (LangStringImpl)objects.get(code);
		if (obj == null) {
			obj = LangStringImpl.getLangString(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of LangString for every resource in the model with rdf:Type http://sots.rvg/lom.owl#LangString
	 * @param model the Jena Model
	 * @return a List of LangString
	 */
	public static java.util.List getAllLangString(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,LangString.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getLangString(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Course.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Course
	 * @param model the Jena Model.
	 */
	public static Course createCourse(Resource resource, Model model) throws JastorException {
		return CourseImpl.createCourse(resource,model);
	}
	
	/**
	 * Create a new instance of Course.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Course
	 * @param model the Jena Model.
	 */
	public static Course createCourse(String uri, Model model) throws JastorException {
		Course obj = CourseImpl.createCourse(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Course.  Leaves the model unchanged.
	 * @param uri The uri of the Course
	 * @param model the Jena Model.
	 */
	public static Course getCourse(String uri, Model model) throws JastorException {
		return getCourse(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Course.  Leaves the model unchanged.
	 * @param resource The resource of the Course
	 * @param model the Jena Model.
	 */
	public static Course getCourse(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Course.class.hashCode()) + resource.toString();
		CourseImpl obj = (CourseImpl)objects.get(code);
		if (obj == null) {
			obj = CourseImpl.getCourse(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Course for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Course
	 * @param model the Jena Model
	 * @return a List of Course
	 */
	public static java.util.List getAllCourse(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Course.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getCourse(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of DateTime.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the DateTime
	 * @param model the Jena Model.
	 */
	public static DateTime createDateTime(Resource resource, Model model) throws JastorException {
		return DateTimeImpl.createDateTime(resource,model);
	}
	
	/**
	 * Create a new instance of DateTime.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the DateTime
	 * @param model the Jena Model.
	 */
	public static DateTime createDateTime(String uri, Model model) throws JastorException {
		DateTime obj = DateTimeImpl.createDateTime(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of DateTime.  Leaves the model unchanged.
	 * @param uri The uri of the DateTime
	 * @param model the Jena Model.
	 */
	public static DateTime getDateTime(String uri, Model model) throws JastorException {
		return getDateTime(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of DateTime.  Leaves the model unchanged.
	 * @param resource The resource of the DateTime
	 * @param model the Jena Model.
	 */
	public static DateTime getDateTime(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + DateTime.class.hashCode()) + resource.toString();
		DateTimeImpl obj = (DateTimeImpl)objects.get(code);
		if (obj == null) {
			obj = DateTimeImpl.getDateTime(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of DateTime for every resource in the model with rdf:Type http://sots.rvg/lom.owl#DateTime
	 * @param model the Jena Model
	 * @return a List of DateTime
	 */
	public static java.util.List getAllDateTime(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,DateTime.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getDateTime(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of MContribute.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the MContribute
	 * @param model the Jena Model.
	 */
	public static MContribute createMContribute(Resource resource, Model model) throws JastorException {
		return MContributeImpl.createMContribute(resource,model);
	}
	
	/**
	 * Create a new instance of MContribute.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the MContribute
	 * @param model the Jena Model.
	 */
	public static MContribute createMContribute(String uri, Model model) throws JastorException {
		MContribute obj = MContributeImpl.createMContribute(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of MContribute.  Leaves the model unchanged.
	 * @param uri The uri of the MContribute
	 * @param model the Jena Model.
	 */
	public static MContribute getMContribute(String uri, Model model) throws JastorException {
		return getMContribute(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of MContribute.  Leaves the model unchanged.
	 * @param resource The resource of the MContribute
	 * @param model the Jena Model.
	 */
	public static MContribute getMContribute(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + MContribute.class.hashCode()) + resource.toString();
		MContributeImpl obj = (MContributeImpl)objects.get(code);
		if (obj == null) {
			obj = MContributeImpl.getMContribute(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of MContribute for every resource in the model with rdf:Type http://sots.rvg/lom.owl#MContribute
	 * @param model the Jena Model
	 * @return a List of MContribute
	 */
	public static java.util.List getAllMContribute(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,MContribute.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getMContribute(stmt.getSubject(),model));
		}
		return list;
	}
	

	/**
	 * Create a new instance of Annotation.  Adds the rdf:type property for the given resource to the model.
	 * @param resource The resource of the Annotation
	 * @param model the Jena Model.
	 */
	public static Annotation createAnnotation(Resource resource, Model model) throws JastorException {
		return AnnotationImpl.createAnnotation(resource,model);
	}
	
	/**
	 * Create a new instance of Annotation.  Adds the rdf:type property for the given resource to the model.
	 * @param uri The uri of the Annotation
	 * @param model the Jena Model.
	 */
	public static Annotation createAnnotation(String uri, Model model) throws JastorException {
		Annotation obj = AnnotationImpl.createAnnotation(model.createResource(uri), model);
		return obj;
	}
	
	/**
	 * Create a new instance of Annotation.  Leaves the model unchanged.
	 * @param uri The uri of the Annotation
	 * @param model the Jena Model.
	 */
	public static Annotation getAnnotation(String uri, Model model) throws JastorException {
		return getAnnotation(model.createResource(uri),model);
	}
	
	/**
	 * Create a new instance of Annotation.  Leaves the model unchanged.
	 * @param resource The resource of the Annotation
	 * @param model the Jena Model.
	 */
	public static Annotation getAnnotation(Resource resource, Model model) throws JastorException {
		String code = (model.hashCode()*17 + Annotation.class.hashCode()) + resource.toString();
		AnnotationImpl obj = (AnnotationImpl)objects.get(code);
		if (obj == null) {
			obj = AnnotationImpl.getAnnotation(resource, model);
			if (obj == null)
				return null;
			objects.put(code, obj);
		}
		return obj;
	}
	
	/**
	 * Return an instance of Annotation for every resource in the model with rdf:Type http://sots.rvg/lom.owl#Annotation
	 * @param model the Jena Model
	 * @return a List of Annotation
	 */
	public static java.util.List getAllAnnotation(Model model) throws JastorException {
		StmtIterator it = model.listStatements(null,RDF.type,Annotation.TYPE);
		java.util.List list = new java.util.ArrayList();
		while (it.hasNext()) {
			Statement stmt = it.nextStatement();
			list.add(getAnnotation(stmt.getSubject(),model));
		}
		return list;
	}
	
	
	/**
	 * Returns an instance of an interface for the given Resource.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(Resource res, Model model) throws JastorException {
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Annotation"))) {
			return getAnnotation(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#MContribute"))) {
			return getMContribute(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#DateTime"))) {
			return getDateTime(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Course"))) {
			return getCourse(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#LangString"))) {
			return getLangString(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Classification"))) {
			return getClassification(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#LCContribute"))) {
			return getLCContribute(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Duration"))) {
			return getDuration(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Meta-Metadata"))) {
			return getMeta_DASH_Metadata(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#General"))) {
			return getGeneral(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Vocabulary"))) {
			return getVocabulary(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Data"))) {
			return getData(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#CTaxonCollection"))) {
			return getCTaxonCollection(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#LOM"))) {
			return getLOM(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#CTCTaxon"))) {
			return getCTCTaxon(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Educational"))) {
			return getEducational(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#LifeCycle"))) {
			return getLifeCycle(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#Technical"))) {
			return getTechnical(res,model);
		}
		if (res.hasProperty(RDF.type,model.getResource("http://sots.rvg/lom.owl#GIdentifier"))) {
			return getGIdentifier(res,model);
		}
		return new ThingImpl(res,model);
	}
	
	/**
	 * Returns an instance of an interface for the given Resource URI.  The return instance is guaranteed to 
	 * implement the most specific interface in *some* hierarchy in which the Resource participates.  The behavior
	 * is unspecified for resources with RDF types from different hierarchies.
	 * @return an instance of Thing
	 */
	public static Thing getThing(String uri, Model model) throws JastorException {
		return getThing(model.getResource(uri),model);
	}

	/**
	 * Return a list of compatible interfaces for the given type.  Searches through all ontology classes
	 * in the lom.owl ontology.  The list is sorted according to the topological sort
	 * of the class hierarchy
	 * @return a List of type java.lang.Class
	 */
	public static java.util.List listCompatibleInterfaces (Resource type) {
		java.util.List types = new java.util.ArrayList();
		if (type.equals(Annotation.TYPE)) {
			types.add(Annotation.class);
		}
		if (type.equals(MContribute.TYPE)) {
			types.add(MContribute.class);
		}
		if (type.equals(DateTime.TYPE)) {
			types.add(DateTime.class);
		}
		if (type.equals(Course.TYPE)) {
			types.add(Course.class);
		}
		if (type.equals(LangString.TYPE)) {
			types.add(LangString.class);
		}
		if (type.equals(Classification.TYPE)) {
			types.add(Classification.class);
		}
		if (type.equals(LCContribute.TYPE)) {
			types.add(LCContribute.class);
		}
		if (type.equals(Duration.TYPE)) {
			types.add(Duration.class);
		}
		if (type.equals(Meta_DASH_Metadata.TYPE)) {
			types.add(Meta_DASH_Metadata.class);
		}
		if (type.equals(General.TYPE)) {
			types.add(General.class);
		}
		if (type.equals(Vocabulary.TYPE)) {
			types.add(Vocabulary.class);
		}
		if (type.equals(Data.TYPE)) {
			types.add(Data.class);
		}
		if (type.equals(CTaxonCollection.TYPE)) {
			types.add(CTaxonCollection.class);
		}
		if (type.equals(LOM.TYPE)) {
			types.add(LOM.class);
		}
		if (type.equals(CTCTaxon.TYPE)) {
			types.add(CTCTaxon.class);
		}
		if (type.equals(Educational.TYPE)) {
			types.add(Educational.class);
		}
		if (type.equals(LifeCycle.TYPE)) {
			types.add(LifeCycle.class);
		}
		if (type.equals(Technical.TYPE)) {
			types.add(Technical.class);
		}
		if (type.equals(GIdentifier.TYPE)) {
			types.add(GIdentifier.class);
		}
		return types;
	}
}