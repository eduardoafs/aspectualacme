/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aspectualacme.AspectualacmeFactory
 * @model kind="package"
 * @generated
 */
public interface AspectualacmePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aspectualacme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "aspectualacmev0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aspectualacme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectualacmePackage eINSTANCE = aspectualacme.impl.AspectualacmePackageImpl.init();

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ElementImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REPRESENTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.SystemImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTORS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTACHMENTS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.RoleImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTOR = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.PortImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ComponentImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ConnectorImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROLE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.AttachmentDeclarationImpl <em>Attachment Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.AttachmentDeclarationImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getAttachmentDeclaration()
	 * @generated
	 */
	int ATTACHMENT_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Attached Base Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attached To Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Attachment Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.AttachmentImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 5;

	/**
	 * The feature id for the '<em><b>Attached Base Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ATTACHED_BASE_ELEMENT = ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Attached To Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ATTACHED_TO_ELEMENT = ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = ATTACHMENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.PropertyImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.AspectualConnectorImpl <em>Aspectual Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.AspectualConnectorImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getAspectualConnector()
	 * @generated
	 */
	int ASPECTUAL_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__PROPERTY = CONNECTOR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__REPRESENTATIONS = CONNECTOR__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__ROLE = CONNECTOR__ROLE;

	/**
	 * The feature id for the '<em><b>Base Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__BASE_ROLE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crosscutting Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Glues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR__GLUES = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aspectual Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECTUAL_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.CrosscuttingRoleImpl <em>Crosscutting Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.CrosscuttingRoleImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getCrosscuttingRole()
	 * @generated
	 */
	int CROSSCUTTING_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__PROPERTY = ROLE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__REPRESENTATIONS = ROLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__CONNECTOR = ROLE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Aspectual Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__ASPECTUAL_CONNECTOR = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crosscutting Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.BaseRoleImpl <em>Base Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.BaseRoleImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getBaseRole()
	 * @generated
	 */
	int BASE_ROLE = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__PROPERTY = ROLE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__REPRESENTATIONS = ROLE__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__CONNECTOR = ROLE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Aspectual Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__ASPECTUAL_CONNECTOR = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.GlueImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 11;

	/**
	 * The feature id for the '<em><b>Prefix Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__PREFIX_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Suffix Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__SUFFIX_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Glue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__GLUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Aspectual Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__ASPECTUAL_CONNECTOR = 3;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.RepresentationImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__BINDINGS = 2;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.BindingImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 14;

	/**
	 * The feature id for the '<em><b>External Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EXTERNAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__INTERNAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aspectualacme.GlueType <em>Glue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.GlueType
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlueType()
	 * @generated
	 */
	int GLUE_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link aspectualacme.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see aspectualacme.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.System#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see aspectualacme.System#getComponents()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.System#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see aspectualacme.System#getConnectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.System#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see aspectualacme.System#getAttachments()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Attachments();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see aspectualacme.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Role#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see aspectualacme.Role#getConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Connector();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see aspectualacme.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see aspectualacme.Port#getComponent()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Component();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see aspectualacme.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Component#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see aspectualacme.Component#getPort()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Port();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see aspectualacme.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Connector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see aspectualacme.Connector#getRole()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Role();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see aspectualacme.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see aspectualacme.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Element#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see aspectualacme.Element#getProperty()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Property();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aspectualacme.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Element#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representations</em>'.
	 * @see aspectualacme.Element#getRepresentations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Representations();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see aspectualacme.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aspectualacme.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see aspectualacme.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link aspectualacme.AspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspectual Connector</em>'.
	 * @see aspectualacme.AspectualConnector
	 * @generated
	 */
	EClass getAspectualConnector();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.AspectualConnector#getBaseRole <em>Base Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Role</em>'.
	 * @see aspectualacme.AspectualConnector#getBaseRole()
	 * @see #getAspectualConnector()
	 * @generated
	 */
	EReference getAspectualConnector_BaseRole();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.AspectualConnector#getCrosscuttingRole <em>Crosscutting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crosscutting Role</em>'.
	 * @see aspectualacme.AspectualConnector#getCrosscuttingRole()
	 * @see #getAspectualConnector()
	 * @generated
	 */
	EReference getAspectualConnector_CrosscuttingRole();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.AspectualConnector#getGlues <em>Glues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glues</em>'.
	 * @see aspectualacme.AspectualConnector#getGlues()
	 * @see #getAspectualConnector()
	 * @generated
	 */
	EReference getAspectualConnector_Glues();

	/**
	 * Returns the meta object for class '{@link aspectualacme.CrosscuttingRole <em>Crosscutting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosscutting Role</em>'.
	 * @see aspectualacme.CrosscuttingRole
	 * @generated
	 */
	EClass getCrosscuttingRole();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.CrosscuttingRole#getAspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aspectual Connector</em>'.
	 * @see aspectualacme.CrosscuttingRole#getAspectualConnector()
	 * @see #getCrosscuttingRole()
	 * @generated
	 */
	EReference getCrosscuttingRole_AspectualConnector();

	/**
	 * Returns the meta object for class '{@link aspectualacme.BaseRole <em>Base Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Role</em>'.
	 * @see aspectualacme.BaseRole
	 * @generated
	 */
	EClass getBaseRole();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.BaseRole#getAspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aspectual Connector</em>'.
	 * @see aspectualacme.BaseRole#getAspectualConnector()
	 * @see #getBaseRole()
	 * @generated
	 */
	EReference getBaseRole_AspectualConnector();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see aspectualacme.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Glue#getPrefixRole <em>Prefix Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix Role</em>'.
	 * @see aspectualacme.Glue#getPrefixRole()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_PrefixRole();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Glue#getSuffixRole <em>Suffix Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suffix Role</em>'.
	 * @see aspectualacme.Glue#getSuffixRole()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_SuffixRole();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.Glue#getGlueType <em>Glue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue Type</em>'.
	 * @see aspectualacme.Glue#getGlueType()
	 * @see #getGlue()
	 * @generated
	 */
	EAttribute getGlue_GlueType();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Glue#getAspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aspectual Connector</em>'.
	 * @see aspectualacme.Glue#getAspectualConnector()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_AspectualConnector();

	/**
	 * Returns the meta object for class '{@link aspectualacme.AttachmentDeclaration <em>Attachment Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Declaration</em>'.
	 * @see aspectualacme.AttachmentDeclaration
	 * @generated
	 */
	EClass getAttachmentDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.AttachmentDeclaration#getAttachedBaseElement <em>Attached Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached Base Element</em>'.
	 * @see aspectualacme.AttachmentDeclaration#getAttachedBaseElement()
	 * @see #getAttachmentDeclaration()
	 * @generated
	 */
	EAttribute getAttachmentDeclaration_AttachedBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.AttachmentDeclaration#getAttachedToElement <em>Attached To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached To Element</em>'.
	 * @see aspectualacme.AttachmentDeclaration#getAttachedToElement()
	 * @see #getAttachmentDeclaration()
	 * @generated
	 */
	EAttribute getAttachmentDeclaration_AttachedToElement();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see aspectualacme.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.Representation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aspectualacme.Representation#getName()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.Representation#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see aspectualacme.Representation#getSystem()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_System();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Representation#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bindings</em>'.
	 * @see aspectualacme.Representation#getBindings()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Bindings();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see aspectualacme.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Binding#getExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Element</em>'.
	 * @see aspectualacme.Binding#getExternalElement()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ExternalElement();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Binding#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Element</em>'.
	 * @see aspectualacme.Binding#getInternalElement()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_InternalElement();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Binding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see aspectualacme.Binding#getProperty()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Property();

	/**
	 * Returns the meta object for enum '{@link aspectualacme.GlueType <em>Glue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Glue Type</em>'.
	 * @see aspectualacme.GlueType
	 * @generated
	 */
	EEnum getGlueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AspectualacmeFactory getAspectualacmeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aspectualacme.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.SystemImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONNECTORS = eINSTANCE.getSystem_Connectors();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ATTACHMENTS = eINSTANCE.getSystem_Attachments();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.RoleImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONNECTOR = eINSTANCE.getRole_Connector();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.PortImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMPONENT = eINSTANCE.getPort_Component();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ComponentImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ConnectorImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ROLE = eINSTANCE.getConnector_Role();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.AttachmentImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ElementImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PROPERTY = eINSTANCE.getElement_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__REPRESENTATIONS = eINSTANCE.getElement_Representations();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.PropertyImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.AspectualConnectorImpl <em>Aspectual Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.AspectualConnectorImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getAspectualConnector()
		 * @generated
		 */
		EClass ASPECTUAL_CONNECTOR = eINSTANCE.getAspectualConnector();

		/**
		 * The meta object literal for the '<em><b>Base Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECTUAL_CONNECTOR__BASE_ROLE = eINSTANCE.getAspectualConnector_BaseRole();

		/**
		 * The meta object literal for the '<em><b>Crosscutting Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE = eINSTANCE.getAspectualConnector_CrosscuttingRole();

		/**
		 * The meta object literal for the '<em><b>Glues</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECTUAL_CONNECTOR__GLUES = eINSTANCE.getAspectualConnector_Glues();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.CrosscuttingRoleImpl <em>Crosscutting Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.CrosscuttingRoleImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getCrosscuttingRole()
		 * @generated
		 */
		EClass CROSSCUTTING_ROLE = eINSTANCE.getCrosscuttingRole();

		/**
		 * The meta object literal for the '<em><b>Aspectual Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING_ROLE__ASPECTUAL_CONNECTOR = eINSTANCE.getCrosscuttingRole_AspectualConnector();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.BaseRoleImpl <em>Base Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.BaseRoleImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getBaseRole()
		 * @generated
		 */
		EClass BASE_ROLE = eINSTANCE.getBaseRole();

		/**
		 * The meta object literal for the '<em><b>Aspectual Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ROLE__ASPECTUAL_CONNECTOR = eINSTANCE.getBaseRole_AspectualConnector();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.GlueImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>Prefix Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__PREFIX_ROLE = eINSTANCE.getGlue_PrefixRole();

		/**
		 * The meta object literal for the '<em><b>Suffix Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__SUFFIX_ROLE = eINSTANCE.getGlue_SuffixRole();

		/**
		 * The meta object literal for the '<em><b>Glue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUE__GLUE_TYPE = eINSTANCE.getGlue_GlueType();

		/**
		 * The meta object literal for the '<em><b>Aspectual Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__ASPECTUAL_CONNECTOR = eINSTANCE.getGlue_AspectualConnector();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.AttachmentDeclarationImpl <em>Attachment Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.AttachmentDeclarationImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getAttachmentDeclaration()
		 * @generated
		 */
		EClass ATTACHMENT_DECLARATION = eINSTANCE.getAttachmentDeclaration();

		/**
		 * The meta object literal for the '<em><b>Attached Base Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT = eINSTANCE.getAttachmentDeclaration_AttachedBaseElement();

		/**
		 * The meta object literal for the '<em><b>Attached To Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT = eINSTANCE.getAttachmentDeclaration_AttachedToElement();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.RepresentationImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__NAME = eINSTANCE.getRepresentation_Name();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__SYSTEM = eINSTANCE.getRepresentation_System();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__BINDINGS = eINSTANCE.getRepresentation_Bindings();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.BindingImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>External Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__EXTERNAL_ELEMENT = eINSTANCE.getBinding_ExternalElement();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__INTERNAL_ELEMENT = eINSTANCE.getBinding_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PROPERTY = eINSTANCE.getBinding_Property();

		/**
		 * The meta object literal for the '{@link aspectualacme.GlueType <em>Glue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.GlueType
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlueType()
		 * @generated
		 */
		EEnum GLUE_TYPE = eINSTANCE.getGlueType();

	}

} //AspectualacmePackage
