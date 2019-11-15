/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aspectualacme.AspectualacmePackage
 * @generated
 */
public interface AspectualacmeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectualacmeFactory eINSTANCE = aspectualacme.impl.AspectualacmeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Armani Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Expression</em>'.
	 * @generated
	 */
	ArmaniExpression createArmaniExpression();

	/**
	 * Returns a new object of class '<em>Armani Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Function Call</em>'.
	 * @generated
	 */
	ArmaniFunctionCall createArmaniFunctionCall();

	/**
	 * Returns a new object of class '<em>Armani Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Set Expression</em>'.
	 * @generated
	 */
	ArmaniSetExpression createArmaniSetExpression();

	/**
	 * Returns a new object of class '<em>Armani Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Constant</em>'.
	 * @generated
	 */
	ArmaniConstant createArmaniConstant();

	/**
	 * Returns a new object of class '<em>Armani Primitive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Primitive Expression</em>'.
	 * @generated
	 */
	ArmaniPrimitiveExpression createArmaniPrimitiveExpression();

	/**
	 * Returns a new object of class '<em>Armani Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Unary Expression</em>'.
	 * @generated
	 */
	ArmaniUnaryExpression createArmaniUnaryExpression();

	/**
	 * Returns a new object of class '<em>Armani Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Multiplicative Expression</em>'.
	 * @generated
	 */
	ArmaniMultiplicativeExpression createArmaniMultiplicativeExpression();

	/**
	 * Returns a new object of class '<em>Armani Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Additive Expression</em>'.
	 * @generated
	 */
	ArmaniAdditiveExpression createArmaniAdditiveExpression();

	/**
	 * Returns a new object of class '<em>Armani Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Relational Expression</em>'.
	 * @generated
	 */
	ArmaniRelationalExpression createArmaniRelationalExpression();

	/**
	 * Returns a new object of class '<em>Armani Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Equality Expression</em>'.
	 * @generated
	 */
	ArmaniEqualityExpression createArmaniEqualityExpression();

	/**
	 * Returns a new object of class '<em>Armani Iff Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Iff Expression</em>'.
	 * @generated
	 */
	ArmaniIffExpression createArmaniIffExpression();

	/**
	 * Returns a new object of class '<em>Armani Implies Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Implies Expression</em>'.
	 * @generated
	 */
	ArmaniImpliesExpression createArmaniImpliesExpression();

	/**
	 * Returns a new object of class '<em>Armani Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Or Expression</em>'.
	 * @generated
	 */
	ArmaniOrExpression createArmaniOrExpression();

	/**
	 * Returns a new object of class '<em>Armani Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Variable</em>'.
	 * @generated
	 */
	ArmaniVariable createArmaniVariable();

	/**
	 * Returns a new object of class '<em>Armani Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Boolean Expression</em>'.
	 * @generated
	 */
	ArmaniBooleanExpression createArmaniBooleanExpression();

	/**
	 * Returns a new object of class '<em>Armani Quantified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani Quantified Expression</em>'.
	 * @generated
	 */
	ArmaniQuantifiedExpression createArmaniQuantifiedExpression();

	/**
	 * Returns a new object of class '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family</em>'.
	 * @generated
	 */
	Family createFamily();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type</em>'.
	 * @generated
	 */
	RoleType createRoleType();

	/**
	 * Returns a new object of class '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type</em>'.
	 * @generated
	 */
	PortType createPortType();

	/**
	 * Returns a new object of class '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Type</em>'.
	 * @generated
	 */
	ConnectorType createConnectorType();

	/**
	 * Returns a new object of class '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Type</em>'.
	 * @generated
	 */
	PropertyType createPropertyType();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Base Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Role</em>'.
	 * @generated
	 */
	BaseRole createBaseRole();

	/**
	 * Returns a new object of class '<em>Crosscutting Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crosscutting Role</em>'.
	 * @generated
	 */
	CrosscuttingRole createCrosscuttingRole();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation</em>'.
	 * @generated
	 */
	Representation createRepresentation();

	/**
	 * Returns a new object of class '<em>Wild Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wild Card</em>'.
	 * @generated
	 */
	WildCard createWildCard();

	/**
	 * Returns a new object of class '<em>Armani</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Armani</em>'.
	 * @generated
	 */
	Armani createArmani();

	/**
	 * Returns a new object of class '<em>Bindable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bindable Element</em>'.
	 * @generated
	 */
	BindableElement createBindableElement();

	/**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
	TypeDefinition createTypeDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AspectualacmePackage getAspectualacmePackage();

} //AspectualacmeFactory
