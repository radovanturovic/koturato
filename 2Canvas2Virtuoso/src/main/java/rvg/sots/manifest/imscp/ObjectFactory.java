
package rvg.sots.manifest.imscp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rvg.sots.manifest.imscp package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Resources_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "resources");
    private final static QName _Organizations_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "organizations");
    private final static QName _Schemaversion_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "schemaversion");
    private final static QName _Title_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "title");
    private final static QName _File_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "file");
    private final static QName _Item_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "item");
    private final static QName _Metadata_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "metadata");
    private final static QName _Schema_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "schema");
    private final static QName _Organization_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "organization");
    private final static QName _Manifest_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "manifest");
    private final static QName _Dependency_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "dependency");
    private final static QName _Resource_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "resource");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rvg.sots.manifest.imscp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link MetadataType }
     * 
     */
    public MetadataType createMetadataType() {
        return new MetadataType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link DependencyType }
     * 
     */
    public DependencyType createDependencyType() {
        return new DependencyType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link OrganizationsType }
     * 
     */
    public OrganizationsType createOrganizationsType() {
        return new OrganizationsType();
    }

    /**
     * Create an instance of {@link ResourcesType }
     * 
     */
    public ResourcesType createResourcesType() {
        return new ResourcesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourcesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "resources")
    public JAXBElement<ResourcesType> createResources(ResourcesType value) {
        return new JAXBElement<ResourcesType>(_Resources_QNAME, ResourcesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "organizations")
    public JAXBElement<OrganizationsType> createOrganizations(OrganizationsType value) {
        return new JAXBElement<OrganizationsType>(_Organizations_QNAME, OrganizationsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "schemaversion")
    public JAXBElement<String> createSchemaversion(String value) {
        return new JAXBElement<String>(_Schemaversion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "file")
    public JAXBElement<FileType> createFile(FileType value) {
        return new JAXBElement<FileType>(_File_QNAME, FileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "metadata")
    public JAXBElement<MetadataType> createMetadata(MetadataType value) {
        return new JAXBElement<MetadataType>(_Metadata_QNAME, MetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "schema")
    public JAXBElement<String> createSchema(String value) {
        return new JAXBElement<String>(_Schema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DependencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "dependency")
    public JAXBElement<DependencyType> createDependency(DependencyType value) {
        return new JAXBElement<DependencyType>(_Dependency_QNAME, DependencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "resource")
    public JAXBElement<ResourceType> createResource(ResourceType value) {
        return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
    }

}
