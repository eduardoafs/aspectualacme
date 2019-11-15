/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.Armani;
import aspectualacme.ArmaniExpression;
import aspectualacme.AspectualacmeFactory;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BaseRole;
import aspectualacme.Binding;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Element;
import aspectualacme.Family;
import aspectualacme.Glue;
import aspectualacme.GlueType;
import aspectualacme.Import;
import aspectualacme.Port;
import aspectualacme.PortType;
import aspectualacme.Property;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.RoleType;
import aspectualacme.Root;
import aspectualacme.WildCard;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectualacmeFactoryImpl extends EFactoryImpl implements AspectualacmeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectualacmeFactory init() {
		try {
			AspectualacmeFactory theAspectualacmeFactory = (AspectualacmeFactory)EPackage.Registry.INSTANCE.getEFactory("aspectualacmev0.2"); 
			if (theAspectualacmeFactory != null) {
				return theAspectualacmeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AspectualacmeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualacmeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AspectualacmePackage.ROOT: return createRoot();
			case AspectualacmePackage.IMPORT: return createImport();
			case AspectualacmePackage.ELEMENT: return createElement();
			case AspectualacmePackage.ARMANI_EXPRESSION: return createArmaniExpression();
			case AspectualacmePackage.FAMILY: return createFamily();
			case AspectualacmePackage.COMPONENT_TYPE: return createComponentType();
			case AspectualacmePackage.ROLE_TYPE: return createRoleType();
			case AspectualacmePackage.PORT_TYPE: return createPortType();
			case AspectualacmePackage.CONNECTOR_TYPE: return createConnectorType();
			case AspectualacmePackage.SYSTEM: return createSystem();
			case AspectualacmePackage.COMPONENT: return createComponent();
			case AspectualacmePackage.CONNECTOR: return createConnector();
			case AspectualacmePackage.ROLE: return createRole();
			case AspectualacmePackage.BASE_ROLE: return createBaseRole();
			case AspectualacmePackage.CROSSCUTTING_ROLE: return createCrosscuttingRole();
			case AspectualacmePackage.PORT: return createPort();
			case AspectualacmePackage.PROPERTY: return createProperty();
			case AspectualacmePackage.GLUE: return createGlue();
			case AspectualacmePackage.ATTACHMENT: return createAttachment();
			case AspectualacmePackage.BINDING: return createBinding();
			case AspectualacmePackage.REPRESENTATION: return createRepresentation();
			case AspectualacmePackage.WILD_CARD: return createWildCard();
			case AspectualacmePackage.ARMANI: return createArmani();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AspectualacmePackage.GLUE_TYPE:
				return createGlueTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AspectualacmePackage.GLUE_TYPE:
				return convertGlueTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniExpression createArmaniExpression() {
		ArmaniExpressionImpl armaniExpression = new ArmaniExpressionImpl();
		return armaniExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aspectualacme.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRole createBaseRole() {
		BaseRoleImpl baseRole = new BaseRoleImpl();
		return baseRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRole createCrosscuttingRole() {
		CrosscuttingRoleImpl crosscuttingRole = new CrosscuttingRoleImpl();
		return crosscuttingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildCard createWildCard() {
		WildCardImpl wildCard = new WildCardImpl();
		return wildCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Armani createArmani() {
		ArmaniImpl armani = new ArmaniImpl();
		return armani;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueType createGlueTypeFromString(EDataType eDataType, String initialValue) {
		GlueType result = GlueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualacmePackage getAspectualacmePackage() {
		return (AspectualacmePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AspectualacmePackage getPackage() {
		return AspectualacmePackage.eINSTANCE;
	}

} //AspectualacmeFactoryImpl
