/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import aspectualacme.Armani;
import aspectualacme.ArmaniAdditiveExpression;
import aspectualacme.ArmaniBooleanExpression;
import aspectualacme.ArmaniConstant;
import aspectualacme.ArmaniEqualityExpression;
import aspectualacme.ArmaniExpression;
import aspectualacme.ArmaniFunctionCall;
import aspectualacme.ArmaniIffExpression;
import aspectualacme.ArmaniImpliesExpression;
import aspectualacme.ArmaniMultiplicativeExpression;
import aspectualacme.ArmaniOrExpression;
import aspectualacme.ArmaniPrimitiveExpression;
import aspectualacme.ArmaniQuantifiedExpression;
import aspectualacme.ArmaniQuantifier;
import aspectualacme.ArmaniRelationalExpression;
import aspectualacme.ArmaniSetExpression;
import aspectualacme.ArmaniSetTypes;
import aspectualacme.ArmaniTypes;
import aspectualacme.ArmaniUnaryExpression;
import aspectualacme.ArmaniVariable;
import aspectualacme.AspectualacmeFactory;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BaseRole;
import aspectualacme.BindableElement;
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
import aspectualacme.PropertyType;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.RoleType;
import aspectualacme.Root;
import aspectualacme.TypeDefinition;
import aspectualacme.WildCard;

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
			case AspectualacmePackage.FAMILY: return createFamily();
			case AspectualacmePackage.COMPONENT_TYPE: return createComponentType();
			case AspectualacmePackage.ROLE_TYPE: return createRoleType();
			case AspectualacmePackage.PORT_TYPE: return createPortType();
			case AspectualacmePackage.CONNECTOR_TYPE: return createConnectorType();
			case AspectualacmePackage.PROPERTY_TYPE: return createPropertyType();
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
			case AspectualacmePackage.BINDABLE_ELEMENT: return createBindableElement();
			case AspectualacmePackage.TYPE_DEFINITION: return createTypeDefinition();
			case AspectualacmePackage.ARMANI: return createArmani();
			case AspectualacmePackage.ARMANI_EXPRESSION: return createArmaniExpression();
			case AspectualacmePackage.ARMANI_FUNCTION_CALL: return createArmaniFunctionCall();
			case AspectualacmePackage.ARMANI_SET_EXPRESSION: return createArmaniSetExpression();
			case AspectualacmePackage.ARMANI_CONSTANT: return createArmaniConstant();
			case AspectualacmePackage.ARMANI_PRIMITIVE_EXPRESSION: return createArmaniPrimitiveExpression();
			case AspectualacmePackage.ARMANI_UNARY_EXPRESSION: return createArmaniUnaryExpression();
			case AspectualacmePackage.ARMANI_MULTIPLICATIVE_EXPRESSION: return createArmaniMultiplicativeExpression();
			case AspectualacmePackage.ARMANI_ADDITIVE_EXPRESSION: return createArmaniAdditiveExpression();
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION: return createArmaniRelationalExpression();
			case AspectualacmePackage.ARMANI_EQUALITY_EXPRESSION: return createArmaniEqualityExpression();
			case AspectualacmePackage.ARMANI_IFF_EXPRESSION: return createArmaniIffExpression();
			case AspectualacmePackage.ARMANI_IMPLIES_EXPRESSION: return createArmaniImpliesExpression();
			case AspectualacmePackage.ARMANI_OR_EXPRESSION: return createArmaniOrExpression();
			case AspectualacmePackage.ARMANI_VARIABLE: return createArmaniVariable();
			case AspectualacmePackage.ARMANI_BOOLEAN_EXPRESSION: return createArmaniBooleanExpression();
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION: return createArmaniQuantifiedExpression();
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
			case AspectualacmePackage.ARMANI_SET_TYPES:
				return createArmaniSetTypesFromString(eDataType, initialValue);
			case AspectualacmePackage.ARMANI_TYPES:
				return createArmaniTypesFromString(eDataType, initialValue);
			case AspectualacmePackage.ARMANI_QUANTIFIER:
				return createArmaniQuantifierFromString(eDataType, initialValue);
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
			case AspectualacmePackage.ARMANI_SET_TYPES:
				return convertArmaniSetTypesToString(eDataType, instanceValue);
			case AspectualacmePackage.ARMANI_TYPES:
				return convertArmaniTypesToString(eDataType, instanceValue);
			case AspectualacmePackage.ARMANI_QUANTIFIER:
				return convertArmaniQuantifierToString(eDataType, instanceValue);
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
	public ArmaniFunctionCall createArmaniFunctionCall() {
		ArmaniFunctionCallImpl armaniFunctionCall = new ArmaniFunctionCallImpl();
		return armaniFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniSetExpression createArmaniSetExpression() {
		ArmaniSetExpressionImpl armaniSetExpression = new ArmaniSetExpressionImpl();
		return armaniSetExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniConstant createArmaniConstant() {
		ArmaniConstantImpl armaniConstant = new ArmaniConstantImpl();
		return armaniConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniPrimitiveExpression createArmaniPrimitiveExpression() {
		ArmaniPrimitiveExpressionImpl armaniPrimitiveExpression = new ArmaniPrimitiveExpressionImpl();
		return armaniPrimitiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniUnaryExpression createArmaniUnaryExpression() {
		ArmaniUnaryExpressionImpl armaniUnaryExpression = new ArmaniUnaryExpressionImpl();
		return armaniUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniMultiplicativeExpression createArmaniMultiplicativeExpression() {
		ArmaniMultiplicativeExpressionImpl armaniMultiplicativeExpression = new ArmaniMultiplicativeExpressionImpl();
		return armaniMultiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniAdditiveExpression createArmaniAdditiveExpression() {
		ArmaniAdditiveExpressionImpl armaniAdditiveExpression = new ArmaniAdditiveExpressionImpl();
		return armaniAdditiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniRelationalExpression createArmaniRelationalExpression() {
		ArmaniRelationalExpressionImpl armaniRelationalExpression = new ArmaniRelationalExpressionImpl();
		return armaniRelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniEqualityExpression createArmaniEqualityExpression() {
		ArmaniEqualityExpressionImpl armaniEqualityExpression = new ArmaniEqualityExpressionImpl();
		return armaniEqualityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniIffExpression createArmaniIffExpression() {
		ArmaniIffExpressionImpl armaniIffExpression = new ArmaniIffExpressionImpl();
		return armaniIffExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniImpliesExpression createArmaniImpliesExpression() {
		ArmaniImpliesExpressionImpl armaniImpliesExpression = new ArmaniImpliesExpressionImpl();
		return armaniImpliesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniOrExpression createArmaniOrExpression() {
		ArmaniOrExpressionImpl armaniOrExpression = new ArmaniOrExpressionImpl();
		return armaniOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniVariable createArmaniVariable() {
		ArmaniVariableImpl armaniVariable = new ArmaniVariableImpl();
		return armaniVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniBooleanExpression createArmaniBooleanExpression() {
		ArmaniBooleanExpressionImpl armaniBooleanExpression = new ArmaniBooleanExpressionImpl();
		return armaniBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniQuantifiedExpression createArmaniQuantifiedExpression() {
		ArmaniQuantifiedExpressionImpl armaniQuantifiedExpression = new ArmaniQuantifiedExpressionImpl();
		return armaniQuantifiedExpression;
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
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
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
	public BindableElement createBindableElement() {
		BindableElementImpl bindableElement = new BindableElementImpl();
		return bindableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
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
	public ArmaniSetTypes createArmaniSetTypesFromString(EDataType eDataType, String initialValue) {
		ArmaniSetTypes result = ArmaniSetTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArmaniSetTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniTypes createArmaniTypesFromString(EDataType eDataType, String initialValue) {
		ArmaniTypes result = ArmaniTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArmaniTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniQuantifier createArmaniQuantifierFromString(EDataType eDataType, String initialValue) {
		ArmaniQuantifier result = ArmaniQuantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArmaniQuantifierToString(EDataType eDataType, Object instanceValue) {
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
