/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualConnector;
import aspectualacme.AspectualacmeFactory;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.AttachmentDeclaration;
import aspectualacme.BaseRole;
import aspectualacme.Binding;
import aspectualacme.Component;
import aspectualacme.Connector;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Element;
import aspectualacme.Glue;
import aspectualacme.GlueType;
import aspectualacme.Port;
import aspectualacme.Property;
import aspectualacme.Representation;
import aspectualacme.Role;

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
			case AspectualacmePackage.SYSTEM: return createSystem();
			case AspectualacmePackage.ROLE: return createRole();
			case AspectualacmePackage.PORT: return createPort();
			case AspectualacmePackage.COMPONENT: return createComponent();
			case AspectualacmePackage.CONNECTOR: return createConnector();
			case AspectualacmePackage.ATTACHMENT: return createAttachment();
			case AspectualacmePackage.ELEMENT: return createElement();
			case AspectualacmePackage.PROPERTY: return createProperty();
			case AspectualacmePackage.ASPECTUAL_CONNECTOR: return createAspectualConnector();
			case AspectualacmePackage.CROSSCUTTING_ROLE: return createCrosscuttingRole();
			case AspectualacmePackage.BASE_ROLE: return createBaseRole();
			case AspectualacmePackage.GLUE: return createGlue();
			case AspectualacmePackage.ATTACHMENT_DECLARATION: return createAttachmentDeclaration();
			case AspectualacmePackage.REPRESENTATION: return createRepresentation();
			case AspectualacmePackage.BINDING: return createBinding();
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
	public aspectualacme.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
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
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
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
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualConnector createAspectualConnector() {
		AspectualConnectorImpl aspectualConnector = new AspectualConnectorImpl();
		return aspectualConnector;
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
	public BaseRole createBaseRole() {
		BaseRoleImpl baseRole = new BaseRoleImpl();
		return baseRole;
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
	public AttachmentDeclaration createAttachmentDeclaration() {
		AttachmentDeclarationImpl attachmentDeclaration = new AttachmentDeclarationImpl();
		return attachmentDeclaration;
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
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
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
