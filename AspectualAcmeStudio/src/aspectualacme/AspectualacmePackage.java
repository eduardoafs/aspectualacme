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
	 * The meta object id for the '{@link aspectualacme.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.RootImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ImportImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ElementImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

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
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
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
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniExpressionImpl <em>Armani Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniExpression()
	 * @generated
	 */
	int ARMANI_EXPRESSION = 27;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniUnaryExpressionImpl <em>Armani Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniUnaryExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniUnaryExpression()
	 * @generated
	 */
	int ARMANI_UNARY_EXPRESSION = 32;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniPrimitiveExpressionImpl <em>Armani Primitive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniPrimitiveExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniPrimitiveExpression()
	 * @generated
	 */
	int ARMANI_PRIMITIVE_EXPRESSION = 31;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniFunctionCallImpl <em>Armani Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniFunctionCallImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniFunctionCall()
	 * @generated
	 */
	int ARMANI_FUNCTION_CALL = 28;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniSetExpressionImpl <em>Armani Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniSetExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniSetExpression()
	 * @generated
	 */
	int ARMANI_SET_EXPRESSION = 29;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniConstantImpl <em>Armani Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniConstantImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniConstant()
	 * @generated
	 */
	int ARMANI_CONSTANT = 30;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniMultiplicativeExpressionImpl <em>Armani Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniMultiplicativeExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniMultiplicativeExpression()
	 * @generated
	 */
	int ARMANI_MULTIPLICATIVE_EXPRESSION = 33;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniAdditiveExpressionImpl <em>Armani Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniAdditiveExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniAdditiveExpression()
	 * @generated
	 */
	int ARMANI_ADDITIVE_EXPRESSION = 34;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniRelationalExpressionImpl <em>Armani Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniRelationalExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniRelationalExpression()
	 * @generated
	 */
	int ARMANI_RELATIONAL_EXPRESSION = 35;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniEqualityExpressionImpl <em>Armani Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniEqualityExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniEqualityExpression()
	 * @generated
	 */
	int ARMANI_EQUALITY_EXPRESSION = 36;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniIffExpressionImpl <em>Armani Iff Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniIffExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniIffExpression()
	 * @generated
	 */
	int ARMANI_IFF_EXPRESSION = 37;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniImpliesExpressionImpl <em>Armani Implies Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniImpliesExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniImpliesExpression()
	 * @generated
	 */
	int ARMANI_IMPLIES_EXPRESSION = 38;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniOrExpressionImpl <em>Armani Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniOrExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniOrExpression()
	 * @generated
	 */
	int ARMANI_OR_EXPRESSION = 39;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniVariableImpl <em>Armani Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniVariableImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniVariable()
	 * @generated
	 */
	int ARMANI_VARIABLE = 40;

	/**
	 * The meta object id for the '{@link aspectualacme.ArmaniDesignRuleExpression <em>Armani Design Rule Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.ArmaniDesignRuleExpression
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniDesignRuleExpression()
	 * @generated
	 */
	int ARMANI_DESIGN_RULE_EXPRESSION = 43;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniBooleanExpressionImpl <em>Armani Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniBooleanExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniBooleanExpression()
	 * @generated
	 */
	int ARMANI_BOOLEAN_EXPRESSION = 41;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniQuantifiedExpressionImpl <em>Armani Quantified Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniQuantifiedExpressionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniQuantifiedExpression()
	 * @generated
	 */
	int ARMANI_QUANTIFIED_EXPRESSION = 42;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.attachableElementImpl <em>attachable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.attachableElementImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getattachableElement()
	 * @generated
	 */
	int ATTACHABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHABLE_ELEMENT__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHABLE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHABLE_ELEMENT__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The number of structural features of the '<em>attachable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.BasicElementImpl <em>Basic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.BasicElementImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getBasicElement()
	 * @generated
	 */
	int BASIC_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Armani</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT__ARMANI = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT__PARENT_FAMILY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.FamilyImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PROPERTY = BASIC_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = BASIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__REPRESENTATIONS = BASIC_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Armani</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ARMANI = BASIC_ELEMENT__ARMANI;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PARENT_FAMILY = BASIC_ELEMENT__PARENT_FAMILY;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__CONNECTORS = BASIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__COMPONENTS = BASIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ATTACHMENTS = BASIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__WILDCARD = BASIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ctypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__CTYPES = BASIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ptypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PTYPES = BASIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cntypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__CNTYPES = BASIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__RTYPES = BASIC_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PRTYPES = BASIC_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PROPERTIES = BASIC_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = BASIC_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.TypeDefinitionImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ComponentTypeImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROPERTY = TYPE_DEFINITION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REPRESENTATIONS = TYPE_DEFINITION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PORT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PARENT_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PARENT_FAMILY = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.RoleTypeImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__PROPERTY = TYPE_DEFINITION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__REPRESENTATIONS = TYPE_DEFINITION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__PARENT_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__PARENT_FAMILY = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.PortTypeImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__PROPERTY = TYPE_DEFINITION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__REPRESENTATIONS = TYPE_DEFINITION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__PARENT_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__PARENT_FAMILY = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ConnectorTypeImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__PROPERTY = TYPE_DEFINITION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__REPRESENTATIONS = TYPE_DEFINITION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__PARENT_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ROLE = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__GLUE = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__PARENT_FAMILY = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.PropertyTypeImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PROPERTY = TYPE_DEFINITION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__REPRESENTATIONS = TYPE_DEFINITION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUES = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PARENT_FAMILY = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.SystemImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTY = BASIC_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = BASIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REPRESENTATIONS = BASIC_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Armani</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ARMANI = BASIC_ELEMENT__ARMANI;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARENT_FAMILY = BASIC_ELEMENT__PARENT_FAMILY;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTORS = BASIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTIES = BASIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTACHMENTS = BASIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wild Card</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__WILD_CARD = BASIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENTS = BASIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Representation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARENT_REPRESENTATION = BASIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EFFECTIVE_TYPE = BASIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = BASIC_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ComponentImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 12;

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
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT_SYSTEM = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT_FAMILY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EFFECTIVE_TYPE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ConnectorImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 13;

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
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GLUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT_SYSTEM = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT_FAMILY = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EFFECTIVE_TYPE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.RoleImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 14;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROPERTY = ATTACHABLE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ATTACHABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REPRESENTATIONS = ATTACHABLE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTOR = ATTACHABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector T</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTOR_T = ATTACHABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_TYPE = ATTACHABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EFFECTIVE_TYPE = ATTACHABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ATTACHABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.BaseRoleImpl <em>Base Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.BaseRoleImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getBaseRole()
	 * @generated
	 */
	int BASE_ROLE = 15;

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
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Connector T</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__CONNECTOR_T = ROLE__CONNECTOR_T;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__ROLE_TYPE = ROLE__ROLE_TYPE;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__EFFECTIVE_TYPE = ROLE__EFFECTIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE__TYPE = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.CrosscuttingRoleImpl <em>Crosscutting Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.CrosscuttingRoleImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getCrosscuttingRole()
	 * @generated
	 */
	int CROSSCUTTING_ROLE = 16;

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
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Connector T</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__CONNECTOR_T = ROLE__CONNECTOR_T;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__ROLE_TYPE = ROLE__ROLE_TYPE;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__EFFECTIVE_TYPE = ROLE__EFFECTIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE__TYPE = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crosscutting Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.PortImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 17;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROPERTY = ATTACHABLE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ATTACHABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REPRESENTATIONS = ATTACHABLE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE = ATTACHABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT = ATTACHABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component T</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT_T = ATTACHABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effective type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EFFECTIVE_TYPE = ATTACHABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ATTACHABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.PropertyImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 18;

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
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parent System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PARENT_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PARENT_FAMILY = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.GlueImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 19;

	/**
	 * The feature id for the '<em><b>Base Attach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__BASE_ATTACH = 0;

	/**
	 * The feature id for the '<em><b>Crosscutting Attach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__CROSSCUTTING_ATTACH = 1;

	/**
	 * The feature id for the '<em><b>Glue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__GLUE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__CONNECTOR = 3;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.AttachmentImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 20;

	/**
	 * The feature id for the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FIRST_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Second Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SECOND_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Parent System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PARENT_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Parent Family</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PARENT_FAMILY = 3;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.BindingImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 21;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>First Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FIRST_PORT = 1;

	/**
	 * The feature id for the '<em><b>Second Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SECOND_PORT = 2;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__REPRESENTATION = 3;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.RepresentationImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 22;

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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.WildCardImpl <em>Wild Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.WildCardImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getWildCard()
	 * @generated
	 */
	int WILD_CARD = 23;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD__PROPERTY = ATTACHABLE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD__NAME = ATTACHABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD__REPRESENTATIONS = ATTACHABLE_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD__EXPRESSION = ATTACHABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wild Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_FEATURE_COUNT = ATTACHABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.ArmaniImpl <em>Armani</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.ArmaniImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmani()
	 * @generated
	 */
	int ARMANI = 26;

	/**
	 * The meta object id for the '{@link aspectualacme.impl.BindableElementImpl <em>Bindable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.impl.BindableElementImpl
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getBindableElement()
	 * @generated
	 */
	int BINDABLE_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDABLE_ELEMENT__PROPERTY = ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDABLE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDABLE_ELEMENT__REPRESENTATIONS = ELEMENT__REPRESENTATIONS;

	/**
	 * The number of structural features of the '<em>Bindable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI__MODIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI__DESIGN_RULE = 1;

	/**
	 * The number of structural features of the '<em>Armani</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Armani Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_UNARY_EXPRESSION__UNARY_EXPRESSION = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_UNARY_EXPRESSION__OPERATOR = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_UNARY_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_PRIMITIVE_EXPRESSION__UNARY_EXPRESSION = ARMANI_UNARY_EXPRESSION__UNARY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_PRIMITIVE_EXPRESSION__OPERATOR = ARMANI_UNARY_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_PRIMITIVE_EXPRESSION__DESIGN_RULE = ARMANI_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Armani Primitive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT = ARMANI_UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FUNCTION_CALL__UNARY_EXPRESSION = ARMANI_PRIMITIVE_EXPRESSION__UNARY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FUNCTION_CALL__OPERATOR = ARMANI_PRIMITIVE_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FUNCTION_CALL__DESIGN_RULE = ARMANI_PRIMITIVE_EXPRESSION__DESIGN_RULE;

	/**
	 * The feature id for the '<em><b>Function Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FUNCTION_CALL__FUNCTION_ID = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FUNCTION_CALL__PARAMETERS = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_FUNCTION_CALL_FEATURE_COUNT = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION__UNARY_EXPRESSION = ARMANI_PRIMITIVE_EXPRESSION__UNARY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION__OPERATOR = ARMANI_PRIMITIVE_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION__DESIGN_RULE = ARMANI_PRIMITIVE_EXPRESSION__DESIGN_RULE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION__REFERENCE = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION__REFERENCE_TYPE = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION__SET_VALUES = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Armani Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_SET_EXPRESSION_FEATURE_COUNT = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_CONSTANT__UNARY_EXPRESSION = ARMANI_PRIMITIVE_EXPRESSION__UNARY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_CONSTANT__OPERATOR = ARMANI_PRIMITIVE_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_CONSTANT__DESIGN_RULE = ARMANI_PRIMITIVE_EXPRESSION__DESIGN_RULE;

	/**
	 * The number of structural features of the '<em>Armani Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_CONSTANT_FEATURE_COUNT = ARMANI_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_MULTIPLICATIVE_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_MULTIPLICATIVE_EXPRESSION__OPERATORS = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_ADDITIVE_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_ADDITIVE_EXPRESSION__OPERATORS = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_ADDITIVE_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_RELATIONAL_EXPRESSION__OPERATORS = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_RELATIONAL_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_EQUALITY_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_EQUALITY_EXPRESSION__OPERATORS = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_EQUALITY_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_IFF_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Armani Iff Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_IFF_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_IMPLIES_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Armani Implies Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_IMPLIES_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_OR_EXPRESSION__EXPRESSIONS = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_OR_EXPRESSION__OPERATORS = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Armani Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_OR_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_VARIABLE__ID = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_VARIABLE__USER_TYPE = ARMANI_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_VARIABLE__BASIC_TYPE = ARMANI_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Armani Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_VARIABLE_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Armani Design Rule Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT = ARMANI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_BOOLEAN_EXPRESSION__EXPRESSIONS = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Armani Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_BOOLEAN_EXPRESSION_FEATURE_COUNT = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_QUANTIFIED_EXPRESSION__VARIABLE = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Armani Quantified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMANI_QUANTIFIED_EXPRESSION_FEATURE_COUNT = ARMANI_DESIGN_RULE_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link aspectualacme.GlueType <em>Glue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.GlueType
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlueType()
	 * @generated
	 */
	int GLUE_TYPE = 44;


	/**
	 * The meta object id for the '{@link aspectualacme.ArmaniSetTypes <em>Armani Set Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.ArmaniSetTypes
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniSetTypes()
	 * @generated
	 */
	int ARMANI_SET_TYPES = 45;

	/**
	 * The meta object id for the '{@link aspectualacme.ArmaniTypes <em>Armani Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.ArmaniTypes
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniTypes()
	 * @generated
	 */
	int ARMANI_TYPES = 46;

	/**
	 * The meta object id for the '{@link aspectualacme.ArmaniQuantifier <em>Armani Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aspectualacme.ArmaniQuantifier
	 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniQuantifier()
	 * @generated
	 */
	int ARMANI_QUANTIFIER = 47;


	/**
	 * Returns the meta object for class '{@link aspectualacme.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see aspectualacme.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Root#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see aspectualacme.Root#getImports()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Root#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see aspectualacme.Root#getElements()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Elements();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see aspectualacme.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.Import#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see aspectualacme.Import#getFileName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_FileName();

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
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Element#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see aspectualacme.Element#getRepresentations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Representations();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniExpression <em>Armani Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Expression</em>'.
	 * @see aspectualacme.ArmaniExpression
	 * @generated
	 */
	EClass getArmaniExpression();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniFunctionCall <em>Armani Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Function Call</em>'.
	 * @see aspectualacme.ArmaniFunctionCall
	 * @generated
	 */
	EClass getArmaniFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniFunctionCall#getFunctionId <em>Function Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Id</em>'.
	 * @see aspectualacme.ArmaniFunctionCall#getFunctionId()
	 * @see #getArmaniFunctionCall()
	 * @generated
	 */
	EAttribute getArmaniFunctionCall_FunctionId();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniFunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see aspectualacme.ArmaniFunctionCall#getParameters()
	 * @see #getArmaniFunctionCall()
	 * @generated
	 */
	EReference getArmaniFunctionCall_Parameters();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniSetExpression <em>Armani Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Set Expression</em>'.
	 * @see aspectualacme.ArmaniSetExpression
	 * @generated
	 */
	EClass getArmaniSetExpression();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniSetExpression#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see aspectualacme.ArmaniSetExpression#getReference()
	 * @see #getArmaniSetExpression()
	 * @generated
	 */
	EAttribute getArmaniSetExpression_Reference();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniSetExpression#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see aspectualacme.ArmaniSetExpression#getReferenceType()
	 * @see #getArmaniSetExpression()
	 * @generated
	 */
	EAttribute getArmaniSetExpression_ReferenceType();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniSetExpression#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Values</em>'.
	 * @see aspectualacme.ArmaniSetExpression#getSetValues()
	 * @see #getArmaniSetExpression()
	 * @generated
	 */
	EReference getArmaniSetExpression_SetValues();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniConstant <em>Armani Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Constant</em>'.
	 * @see aspectualacme.ArmaniConstant
	 * @generated
	 */
	EClass getArmaniConstant();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniPrimitiveExpression <em>Armani Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Primitive Expression</em>'.
	 * @see aspectualacme.ArmaniPrimitiveExpression
	 * @generated
	 */
	EClass getArmaniPrimitiveExpression();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.ArmaniPrimitiveExpression#getDesignRule <em>Design Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design Rule</em>'.
	 * @see aspectualacme.ArmaniPrimitiveExpression#getDesignRule()
	 * @see #getArmaniPrimitiveExpression()
	 * @generated
	 */
	EReference getArmaniPrimitiveExpression_DesignRule();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniUnaryExpression <em>Armani Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Unary Expression</em>'.
	 * @see aspectualacme.ArmaniUnaryExpression
	 * @generated
	 */
	EClass getArmaniUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.ArmaniUnaryExpression#getUnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Expression</em>'.
	 * @see aspectualacme.ArmaniUnaryExpression#getUnaryExpression()
	 * @see #getArmaniUnaryExpression()
	 * @generated
	 */
	EReference getArmaniUnaryExpression_UnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see aspectualacme.ArmaniUnaryExpression#getOperator()
	 * @see #getArmaniUnaryExpression()
	 * @generated
	 */
	EAttribute getArmaniUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniMultiplicativeExpression <em>Armani Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Multiplicative Expression</em>'.
	 * @see aspectualacme.ArmaniMultiplicativeExpression
	 * @generated
	 */
	EClass getArmaniMultiplicativeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniMultiplicativeExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniMultiplicativeExpression#getExpressions()
	 * @see #getArmaniMultiplicativeExpression()
	 * @generated
	 */
	EReference getArmaniMultiplicativeExpression_Expressions();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.ArmaniMultiplicativeExpression#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operators</em>'.
	 * @see aspectualacme.ArmaniMultiplicativeExpression#getOperators()
	 * @see #getArmaniMultiplicativeExpression()
	 * @generated
	 */
	EAttribute getArmaniMultiplicativeExpression_Operators();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniAdditiveExpression <em>Armani Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Additive Expression</em>'.
	 * @see aspectualacme.ArmaniAdditiveExpression
	 * @generated
	 */
	EClass getArmaniAdditiveExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniAdditiveExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniAdditiveExpression#getExpressions()
	 * @see #getArmaniAdditiveExpression()
	 * @generated
	 */
	EReference getArmaniAdditiveExpression_Expressions();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.ArmaniAdditiveExpression#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operators</em>'.
	 * @see aspectualacme.ArmaniAdditiveExpression#getOperators()
	 * @see #getArmaniAdditiveExpression()
	 * @generated
	 */
	EAttribute getArmaniAdditiveExpression_Operators();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniRelationalExpression <em>Armani Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Relational Expression</em>'.
	 * @see aspectualacme.ArmaniRelationalExpression
	 * @generated
	 */
	EClass getArmaniRelationalExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniRelationalExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniRelationalExpression#getExpressions()
	 * @see #getArmaniRelationalExpression()
	 * @generated
	 */
	EReference getArmaniRelationalExpression_Expressions();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.ArmaniRelationalExpression#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operators</em>'.
	 * @see aspectualacme.ArmaniRelationalExpression#getOperators()
	 * @see #getArmaniRelationalExpression()
	 * @generated
	 */
	EAttribute getArmaniRelationalExpression_Operators();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniEqualityExpression <em>Armani Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Equality Expression</em>'.
	 * @see aspectualacme.ArmaniEqualityExpression
	 * @generated
	 */
	EClass getArmaniEqualityExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniEqualityExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniEqualityExpression#getExpressions()
	 * @see #getArmaniEqualityExpression()
	 * @generated
	 */
	EReference getArmaniEqualityExpression_Expressions();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.ArmaniEqualityExpression#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operators</em>'.
	 * @see aspectualacme.ArmaniEqualityExpression#getOperators()
	 * @see #getArmaniEqualityExpression()
	 * @generated
	 */
	EAttribute getArmaniEqualityExpression_Operators();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniIffExpression <em>Armani Iff Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Iff Expression</em>'.
	 * @see aspectualacme.ArmaniIffExpression
	 * @generated
	 */
	EClass getArmaniIffExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniIffExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniIffExpression#getExpressions()
	 * @see #getArmaniIffExpression()
	 * @generated
	 */
	EReference getArmaniIffExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniImpliesExpression <em>Armani Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Implies Expression</em>'.
	 * @see aspectualacme.ArmaniImpliesExpression
	 * @generated
	 */
	EClass getArmaniImpliesExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniImpliesExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniImpliesExpression#getExpressions()
	 * @see #getArmaniImpliesExpression()
	 * @generated
	 */
	EReference getArmaniImpliesExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniOrExpression <em>Armani Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Or Expression</em>'.
	 * @see aspectualacme.ArmaniOrExpression
	 * @generated
	 */
	EClass getArmaniOrExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniOrExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniOrExpression#getExpressions()
	 * @see #getArmaniOrExpression()
	 * @generated
	 */
	EReference getArmaniOrExpression_Expressions();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.ArmaniOrExpression#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operators</em>'.
	 * @see aspectualacme.ArmaniOrExpression#getOperators()
	 * @see #getArmaniOrExpression()
	 * @generated
	 */
	EAttribute getArmaniOrExpression_Operators();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniVariable <em>Armani Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Variable</em>'.
	 * @see aspectualacme.ArmaniVariable
	 * @generated
	 */
	EClass getArmaniVariable();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniVariable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aspectualacme.ArmaniVariable#getId()
	 * @see #getArmaniVariable()
	 * @generated
	 */
	EAttribute getArmaniVariable_Id();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.ArmaniVariable#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Type</em>'.
	 * @see aspectualacme.ArmaniVariable#getUserType()
	 * @see #getArmaniVariable()
	 * @generated
	 */
	EReference getArmaniVariable_UserType();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniVariable#getBasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic Type</em>'.
	 * @see aspectualacme.ArmaniVariable#getBasicType()
	 * @see #getArmaniVariable()
	 * @generated
	 */
	EAttribute getArmaniVariable_BasicType();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniBooleanExpression <em>Armani Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Boolean Expression</em>'.
	 * @see aspectualacme.ArmaniBooleanExpression
	 * @generated
	 */
	EClass getArmaniBooleanExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ArmaniBooleanExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see aspectualacme.ArmaniBooleanExpression#getExpressions()
	 * @see #getArmaniBooleanExpression()
	 * @generated
	 */
	EReference getArmaniBooleanExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniQuantifiedExpression <em>Armani Quantified Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Quantified Expression</em>'.
	 * @see aspectualacme.ArmaniQuantifiedExpression
	 * @generated
	 */
	EClass getArmaniQuantifiedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.ArmaniQuantifiedExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see aspectualacme.ArmaniQuantifiedExpression#getVariable()
	 * @see #getArmaniQuantifiedExpression()
	 * @generated
	 */
	EReference getArmaniQuantifiedExpression_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.ArmaniQuantifiedExpression#getSetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Expression</em>'.
	 * @see aspectualacme.ArmaniQuantifiedExpression#getSetExpression()
	 * @see #getArmaniQuantifiedExpression()
	 * @generated
	 */
	EReference getArmaniQuantifiedExpression_SetExpression();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.ArmaniQuantifiedExpression#getDesignRule <em>Design Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design Rule</em>'.
	 * @see aspectualacme.ArmaniQuantifiedExpression#getDesignRule()
	 * @see #getArmaniQuantifiedExpression()
	 * @generated
	 */
	EReference getArmaniQuantifiedExpression_DesignRule();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.ArmaniQuantifiedExpression#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see aspectualacme.ArmaniQuantifiedExpression#getQuantifier()
	 * @see #getArmaniQuantifiedExpression()
	 * @generated
	 */
	EAttribute getArmaniQuantifiedExpression_Quantifier();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ArmaniDesignRuleExpression <em>Armani Design Rule Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani Design Rule Expression</em>'.
	 * @see aspectualacme.ArmaniDesignRuleExpression
	 * @generated
	 */
	EClass getArmaniDesignRuleExpression();

	/**
	 * Returns the meta object for class '{@link aspectualacme.attachableElement <em>attachable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachable Element</em>'.
	 * @see aspectualacme.attachableElement
	 * @generated
	 */
	EClass getattachableElement();

	/**
	 * Returns the meta object for class '{@link aspectualacme.BasicElement <em>Basic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Element</em>'.
	 * @see aspectualacme.BasicElement
	 * @generated
	 */
	EClass getBasicElement();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.BasicElement#getArmani <em>Armani</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Armani</em>'.
	 * @see aspectualacme.BasicElement#getArmani()
	 * @see #getBasicElement()
	 * @generated
	 */
	EReference getBasicElement_Armani();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.BasicElement#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Family</em>'.
	 * @see aspectualacme.BasicElement#getParentFamily()
	 * @see #getBasicElement()
	 * @generated
	 */
	EReference getBasicElement_ParentFamily();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see aspectualacme.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see aspectualacme.Family#getConnectors()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see aspectualacme.Family#getComponents()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see aspectualacme.Family#getAttachments()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Attachments();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wildcard</em>'.
	 * @see aspectualacme.Family#getWildcard()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Wildcard();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getCtypes <em>Ctypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ctypes</em>'.
	 * @see aspectualacme.Family#getCtypes()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Ctypes();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getPtypes <em>Ptypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ptypes</em>'.
	 * @see aspectualacme.Family#getPtypes()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Ptypes();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getCntypes <em>Cntypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cntypes</em>'.
	 * @see aspectualacme.Family#getCntypes()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Cntypes();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getRtypes <em>Rtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtypes</em>'.
	 * @see aspectualacme.Family#getRtypes()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Rtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getPrtypes <em>Prtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prtypes</em>'.
	 * @see aspectualacme.Family#getPrtypes()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Prtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Family#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see aspectualacme.Family#getProperties()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Properties();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see aspectualacme.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ComponentType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see aspectualacme.ComponentType#getPort()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Port();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.ComponentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Type</em>'.
	 * @see aspectualacme.ComponentType#getParentType()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ParentType();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.ComponentType#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.ComponentType#getParentFamily()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ParentFamily();

	/**
	 * Returns the meta object for class '{@link aspectualacme.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see aspectualacme.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.RoleType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Type</em>'.
	 * @see aspectualacme.RoleType#getParentType()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_ParentType();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.RoleType#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.RoleType#getParentFamily()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_ParentFamily();

	/**
	 * Returns the meta object for class '{@link aspectualacme.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see aspectualacme.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.PortType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Type</em>'.
	 * @see aspectualacme.PortType#getParentType()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_ParentType();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.PortType#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.PortType#getParentFamily()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_ParentFamily();

	/**
	 * Returns the meta object for class '{@link aspectualacme.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see aspectualacme.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.ConnectorType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Type</em>'.
	 * @see aspectualacme.ConnectorType#getParentType()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ParentType();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ConnectorType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see aspectualacme.ConnectorType#getRole()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.ConnectorType#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue</em>'.
	 * @see aspectualacme.ConnectorType#getGlue()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Glue();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.ConnectorType#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.ConnectorType#getParentFamily()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ParentFamily();

	/**
	 * Returns the meta object for class '{@link aspectualacme.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see aspectualacme.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.PropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see aspectualacme.PropertyType#getType()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.PropertyType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see aspectualacme.PropertyType#getValues()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Values();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.PropertyType#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.PropertyType#getParentFamily()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_ParentFamily();

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
	 * Returns the meta object for the containment reference list '{@link aspectualacme.System#getWildCard <em>Wild Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wild Card</em>'.
	 * @see aspectualacme.System#getWildCard()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_WildCard();

	/**
	 * Returns the meta object for the containment reference list '{@link aspectualacme.System#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see aspectualacme.System#getProperties()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Properties();

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
	 * Returns the meta object for the container reference '{@link aspectualacme.System#getParentRepresentation <em>Parent Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Representation</em>'.
	 * @see aspectualacme.System#getParentRepresentation()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ParentRepresentation();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.System#getEffective_type <em>Effective type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective type</em>'.
	 * @see aspectualacme.System#getEffective_type()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Effective_type();

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
	 * Returns the meta object for the reference list '{@link aspectualacme.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see aspectualacme.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Type();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Component#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent System</em>'.
	 * @see aspectualacme.Component#getParentSystem()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ParentSystem();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Component#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.Component#getParentFamily()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ParentFamily();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Component#getEffective_type <em>Effective type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective type</em>'.
	 * @see aspectualacme.Component#getEffective_type()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Effective_type();

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
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue</em>'.
	 * @see aspectualacme.Connector#getGlue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Glue();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see aspectualacme.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Type();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Connector#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent System</em>'.
	 * @see aspectualacme.Connector#getParentSystem()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ParentSystem();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Connector#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.Connector#getParentFamily()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ParentFamily();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Connector#getEffective_type <em>Effective type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective type</em>'.
	 * @see aspectualacme.Connector#getEffective_type()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Effective_type();

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
	 * Returns the meta object for the container reference '{@link aspectualacme.Role#getConnectorT <em>Connector T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector T</em>'.
	 * @see aspectualacme.Role#getConnectorT()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ConnectorT();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Role#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Type</em>'.
	 * @see aspectualacme.Role#getRoleType()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleType();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Role#getEffective_type <em>Effective type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective type</em>'.
	 * @see aspectualacme.Role#getEffective_type()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Effective_type();

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
	 * Returns the meta object for the reference list '{@link aspectualacme.BaseRole#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see aspectualacme.BaseRole#getType()
	 * @see #getBaseRole()
	 * @generated
	 */
	EReference getBaseRole_Type();

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
	 * Returns the meta object for the reference list '{@link aspectualacme.CrosscuttingRole#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see aspectualacme.CrosscuttingRole#getType()
	 * @see #getCrosscuttingRole()
	 * @generated
	 */
	EReference getCrosscuttingRole_Type();

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
	 * Returns the meta object for the container reference '{@link aspectualacme.Port#getComponentT <em>Component T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component T</em>'.
	 * @see aspectualacme.Port#getComponentT()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_ComponentT();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Port#getEffective_type <em>Effective type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective type</em>'.
	 * @see aspectualacme.Port#getEffective_type()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Effective_type();

	/**
	 * Returns the meta object for the reference list '{@link aspectualacme.Port#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Type</em>'.
	 * @see aspectualacme.Port#getPortType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortType();

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
	 * Returns the meta object for the reference list '{@link aspectualacme.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see aspectualacme.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Property#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent System</em>'.
	 * @see aspectualacme.Property#getParentSystem()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ParentSystem();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Property#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.Property#getParentFamily()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ParentFamily();

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
	 * Returns the meta object for the reference '{@link aspectualacme.Glue#getBaseAttach <em>Base Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Attach</em>'.
	 * @see aspectualacme.Glue#getBaseAttach()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_BaseAttach();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Glue#getCrosscuttingAttach <em>Crosscutting Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crosscutting Attach</em>'.
	 * @see aspectualacme.Glue#getCrosscuttingAttach()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_CrosscuttingAttach();

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
	 * Returns the meta object for the container reference '{@link aspectualacme.Glue#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see aspectualacme.Glue#getConnector()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_Connector();

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
	 * Returns the meta object for the reference '{@link aspectualacme.Attachment#getFirstElement <em>First Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Element</em>'.
	 * @see aspectualacme.Attachment#getFirstElement()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_FirstElement();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Attachment#getSecondElement <em>Second Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Element</em>'.
	 * @see aspectualacme.Attachment#getSecondElement()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_SecondElement();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Attachment#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent System</em>'.
	 * @see aspectualacme.Attachment#getParentSystem()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ParentSystem();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Attachment#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Family</em>'.
	 * @see aspectualacme.Attachment#getParentFamily()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ParentFamily();

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
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Binding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see aspectualacme.Binding#getProperty()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Property();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Binding#getFirstPort <em>First Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Port</em>'.
	 * @see aspectualacme.Binding#getFirstPort()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_FirstPort();

	/**
	 * Returns the meta object for the reference '{@link aspectualacme.Binding#getSecondPort <em>Second Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Port</em>'.
	 * @see aspectualacme.Binding#getSecondPort()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_SecondPort();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Binding#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Representation</em>'.
	 * @see aspectualacme.Binding#getRepresentation()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Representation();

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
	 * Returns the meta object for the containment reference list '{@link aspectualacme.Representation#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see aspectualacme.Representation#getBindings()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Bindings();

	/**
	 * Returns the meta object for the container reference '{@link aspectualacme.Representation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see aspectualacme.Representation#getElement()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Element();

	/**
	 * Returns the meta object for class '{@link aspectualacme.WildCard <em>Wild Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wild Card</em>'.
	 * @see aspectualacme.WildCard
	 * @generated
	 */
	EClass getWildCard();

	/**
	 * Returns the meta object for the attribute '{@link aspectualacme.WildCard#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see aspectualacme.WildCard#getExpression()
	 * @see #getWildCard()
	 * @generated
	 */
	EAttribute getWildCard_Expression();

	/**
	 * Returns the meta object for class '{@link aspectualacme.Armani <em>Armani</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armani</em>'.
	 * @see aspectualacme.Armani
	 * @generated
	 */
	EClass getArmani();

	/**
	 * Returns the meta object for the attribute list '{@link aspectualacme.Armani#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see aspectualacme.Armani#getModifiers()
	 * @see #getArmani()
	 * @generated
	 */
	EAttribute getArmani_Modifiers();

	/**
	 * Returns the meta object for the containment reference '{@link aspectualacme.Armani#getDesignRule <em>Design Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design Rule</em>'.
	 * @see aspectualacme.Armani#getDesignRule()
	 * @see #getArmani()
	 * @generated
	 */
	EReference getArmani_DesignRule();

	/**
	 * Returns the meta object for class '{@link aspectualacme.BindableElement <em>Bindable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindable Element</em>'.
	 * @see aspectualacme.BindableElement
	 * @generated
	 */
	EClass getBindableElement();

	/**
	 * Returns the meta object for class '{@link aspectualacme.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see aspectualacme.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

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
	 * Returns the meta object for enum '{@link aspectualacme.ArmaniSetTypes <em>Armani Set Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Armani Set Types</em>'.
	 * @see aspectualacme.ArmaniSetTypes
	 * @generated
	 */
	EEnum getArmaniSetTypes();

	/**
	 * Returns the meta object for enum '{@link aspectualacme.ArmaniTypes <em>Armani Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Armani Types</em>'.
	 * @see aspectualacme.ArmaniTypes
	 * @generated
	 */
	EEnum getArmaniTypes();

	/**
	 * Returns the meta object for enum '{@link aspectualacme.ArmaniQuantifier <em>Armani Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Armani Quantifier</em>'.
	 * @see aspectualacme.ArmaniQuantifier
	 * @generated
	 */
	EEnum getArmaniQuantifier();

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
		 * The meta object literal for the '{@link aspectualacme.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.RootImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__IMPORTS = eINSTANCE.getRoot_Imports();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ELEMENTS = eINSTANCE.getRoot_Elements();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ImportImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__FILE_NAME = eINSTANCE.getImport_FileName();

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
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__REPRESENTATIONS = eINSTANCE.getElement_Representations();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniExpressionImpl <em>Armani Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniExpression()
		 * @generated
		 */
		EClass ARMANI_EXPRESSION = eINSTANCE.getArmaniExpression();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniFunctionCallImpl <em>Armani Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniFunctionCallImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniFunctionCall()
		 * @generated
		 */
		EClass ARMANI_FUNCTION_CALL = eINSTANCE.getArmaniFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_FUNCTION_CALL__FUNCTION_ID = eINSTANCE.getArmaniFunctionCall_FunctionId();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_FUNCTION_CALL__PARAMETERS = eINSTANCE.getArmaniFunctionCall_Parameters();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniSetExpressionImpl <em>Armani Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniSetExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniSetExpression()
		 * @generated
		 */
		EClass ARMANI_SET_EXPRESSION = eINSTANCE.getArmaniSetExpression();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_SET_EXPRESSION__REFERENCE = eINSTANCE.getArmaniSetExpression_Reference();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_SET_EXPRESSION__REFERENCE_TYPE = eINSTANCE.getArmaniSetExpression_ReferenceType();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_SET_EXPRESSION__SET_VALUES = eINSTANCE.getArmaniSetExpression_SetValues();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniConstantImpl <em>Armani Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniConstantImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniConstant()
		 * @generated
		 */
		EClass ARMANI_CONSTANT = eINSTANCE.getArmaniConstant();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniPrimitiveExpressionImpl <em>Armani Primitive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniPrimitiveExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniPrimitiveExpression()
		 * @generated
		 */
		EClass ARMANI_PRIMITIVE_EXPRESSION = eINSTANCE.getArmaniPrimitiveExpression();

		/**
		 * The meta object literal for the '<em><b>Design Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_PRIMITIVE_EXPRESSION__DESIGN_RULE = eINSTANCE.getArmaniPrimitiveExpression_DesignRule();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniUnaryExpressionImpl <em>Armani Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniUnaryExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniUnaryExpression()
		 * @generated
		 */
		EClass ARMANI_UNARY_EXPRESSION = eINSTANCE.getArmaniUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Unary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_UNARY_EXPRESSION__UNARY_EXPRESSION = eINSTANCE.getArmaniUnaryExpression_UnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getArmaniUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniMultiplicativeExpressionImpl <em>Armani Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniMultiplicativeExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniMultiplicativeExpression()
		 * @generated
		 */
		EClass ARMANI_MULTIPLICATIVE_EXPRESSION = eINSTANCE.getArmaniMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_MULTIPLICATIVE_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniMultiplicativeExpression_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_MULTIPLICATIVE_EXPRESSION__OPERATORS = eINSTANCE.getArmaniMultiplicativeExpression_Operators();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniAdditiveExpressionImpl <em>Armani Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniAdditiveExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniAdditiveExpression()
		 * @generated
		 */
		EClass ARMANI_ADDITIVE_EXPRESSION = eINSTANCE.getArmaniAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_ADDITIVE_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniAdditiveExpression_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_ADDITIVE_EXPRESSION__OPERATORS = eINSTANCE.getArmaniAdditiveExpression_Operators();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniRelationalExpressionImpl <em>Armani Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniRelationalExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniRelationalExpression()
		 * @generated
		 */
		EClass ARMANI_RELATIONAL_EXPRESSION = eINSTANCE.getArmaniRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniRelationalExpression_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_RELATIONAL_EXPRESSION__OPERATORS = eINSTANCE.getArmaniRelationalExpression_Operators();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniEqualityExpressionImpl <em>Armani Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniEqualityExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniEqualityExpression()
		 * @generated
		 */
		EClass ARMANI_EQUALITY_EXPRESSION = eINSTANCE.getArmaniEqualityExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_EQUALITY_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniEqualityExpression_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_EQUALITY_EXPRESSION__OPERATORS = eINSTANCE.getArmaniEqualityExpression_Operators();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniIffExpressionImpl <em>Armani Iff Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniIffExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniIffExpression()
		 * @generated
		 */
		EClass ARMANI_IFF_EXPRESSION = eINSTANCE.getArmaniIffExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_IFF_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniIffExpression_Expressions();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniImpliesExpressionImpl <em>Armani Implies Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniImpliesExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniImpliesExpression()
		 * @generated
		 */
		EClass ARMANI_IMPLIES_EXPRESSION = eINSTANCE.getArmaniImpliesExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_IMPLIES_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniImpliesExpression_Expressions();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniOrExpressionImpl <em>Armani Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniOrExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniOrExpression()
		 * @generated
		 */
		EClass ARMANI_OR_EXPRESSION = eINSTANCE.getArmaniOrExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_OR_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniOrExpression_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_OR_EXPRESSION__OPERATORS = eINSTANCE.getArmaniOrExpression_Operators();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniVariableImpl <em>Armani Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniVariableImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniVariable()
		 * @generated
		 */
		EClass ARMANI_VARIABLE = eINSTANCE.getArmaniVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_VARIABLE__ID = eINSTANCE.getArmaniVariable_Id();

		/**
		 * The meta object literal for the '<em><b>User Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_VARIABLE__USER_TYPE = eINSTANCE.getArmaniVariable_UserType();

		/**
		 * The meta object literal for the '<em><b>Basic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_VARIABLE__BASIC_TYPE = eINSTANCE.getArmaniVariable_BasicType();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniBooleanExpressionImpl <em>Armani Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniBooleanExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniBooleanExpression()
		 * @generated
		 */
		EClass ARMANI_BOOLEAN_EXPRESSION = eINSTANCE.getArmaniBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_BOOLEAN_EXPRESSION__EXPRESSIONS = eINSTANCE.getArmaniBooleanExpression_Expressions();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniQuantifiedExpressionImpl <em>Armani Quantified Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniQuantifiedExpressionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniQuantifiedExpression()
		 * @generated
		 */
		EClass ARMANI_QUANTIFIED_EXPRESSION = eINSTANCE.getArmaniQuantifiedExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_QUANTIFIED_EXPRESSION__VARIABLE = eINSTANCE.getArmaniQuantifiedExpression_Variable();

		/**
		 * The meta object literal for the '<em><b>Set Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION = eINSTANCE.getArmaniQuantifiedExpression_SetExpression();

		/**
		 * The meta object literal for the '<em><b>Design Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE = eINSTANCE.getArmaniQuantifiedExpression_DesignRule();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER = eINSTANCE.getArmaniQuantifiedExpression_Quantifier();

		/**
		 * The meta object literal for the '{@link aspectualacme.ArmaniDesignRuleExpression <em>Armani Design Rule Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.ArmaniDesignRuleExpression
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniDesignRuleExpression()
		 * @generated
		 */
		EClass ARMANI_DESIGN_RULE_EXPRESSION = eINSTANCE.getArmaniDesignRuleExpression();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.attachableElementImpl <em>attachable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.attachableElementImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getattachableElement()
		 * @generated
		 */
		EClass ATTACHABLE_ELEMENT = eINSTANCE.getattachableElement();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.BasicElementImpl <em>Basic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.BasicElementImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getBasicElement()
		 * @generated
		 */
		EClass BASIC_ELEMENT = eINSTANCE.getBasicElement();

		/**
		 * The meta object literal for the '<em><b>Armani</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_ELEMENT__ARMANI = eINSTANCE.getBasicElement_Armani();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_ELEMENT__PARENT_FAMILY = eINSTANCE.getBasicElement_ParentFamily();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.FamilyImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__CONNECTORS = eINSTANCE.getFamily_Connectors();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__COMPONENTS = eINSTANCE.getFamily_Components();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__ATTACHMENTS = eINSTANCE.getFamily_Attachments();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__WILDCARD = eINSTANCE.getFamily_Wildcard();

		/**
		 * The meta object literal for the '<em><b>Ctypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__CTYPES = eINSTANCE.getFamily_Ctypes();

		/**
		 * The meta object literal for the '<em><b>Ptypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__PTYPES = eINSTANCE.getFamily_Ptypes();

		/**
		 * The meta object literal for the '<em><b>Cntypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__CNTYPES = eINSTANCE.getFamily_Cntypes();

		/**
		 * The meta object literal for the '<em><b>Rtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__RTYPES = eINSTANCE.getFamily_Rtypes();

		/**
		 * The meta object literal for the '<em><b>Prtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__PRTYPES = eINSTANCE.getFamily_Prtypes();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__PROPERTIES = eINSTANCE.getFamily_Properties();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ComponentTypeImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PORT = eINSTANCE.getComponentType_Port();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PARENT_TYPE = eINSTANCE.getComponentType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PARENT_FAMILY = eINSTANCE.getComponentType_ParentFamily();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.RoleTypeImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__PARENT_TYPE = eINSTANCE.getRoleType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__PARENT_FAMILY = eINSTANCE.getRoleType_ParentFamily();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.PortTypeImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__PARENT_TYPE = eINSTANCE.getPortType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__PARENT_FAMILY = eINSTANCE.getPortType_ParentFamily();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ConnectorTypeImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getConnectorType()
		 * @generated
		 */
		EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__PARENT_TYPE = eINSTANCE.getConnectorType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__ROLE = eINSTANCE.getConnectorType_Role();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__GLUE = eINSTANCE.getConnectorType_Glue();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__PARENT_FAMILY = eINSTANCE.getConnectorType_ParentFamily();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.PropertyTypeImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__TYPE = eINSTANCE.getPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUES = eINSTANCE.getPropertyType_Values();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__PARENT_FAMILY = eINSTANCE.getPropertyType_ParentFamily();

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
		 * The meta object literal for the '<em><b>Wild Card</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__WILD_CARD = eINSTANCE.getSystem_WildCard();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROPERTIES = eINSTANCE.getSystem_Properties();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

		/**
		 * The meta object literal for the '<em><b>Parent Representation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PARENT_REPRESENTATION = eINSTANCE.getSystem_ParentRepresentation();

		/**
		 * The meta object literal for the '<em><b>Effective type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__EFFECTIVE_TYPE = eINSTANCE.getSystem_Effective_type();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Parent System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT_SYSTEM = eINSTANCE.getComponent_ParentSystem();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT_FAMILY = eINSTANCE.getComponent_ParentFamily();

		/**
		 * The meta object literal for the '<em><b>Effective type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__EFFECTIVE_TYPE = eINSTANCE.getComponent_Effective_type();

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
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__GLUE = eINSTANCE.getConnector_Glue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Parent System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT_SYSTEM = eINSTANCE.getConnector_ParentSystem();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT_FAMILY = eINSTANCE.getConnector_ParentFamily();

		/**
		 * The meta object literal for the '<em><b>Effective type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__EFFECTIVE_TYPE = eINSTANCE.getConnector_Effective_type();

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
		 * The meta object literal for the '<em><b>Connector T</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONNECTOR_T = eINSTANCE.getRole_ConnectorT();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_TYPE = eINSTANCE.getRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Effective type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__EFFECTIVE_TYPE = eINSTANCE.getRole_Effective_type();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ROLE__TYPE = eINSTANCE.getBaseRole_Type();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING_ROLE__TYPE = eINSTANCE.getCrosscuttingRole_Type();

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
		 * The meta object literal for the '<em><b>Component T</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMPONENT_T = eINSTANCE.getPort_ComponentT();

		/**
		 * The meta object literal for the '<em><b>Effective type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__EFFECTIVE_TYPE = eINSTANCE.getPort_Effective_type();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_TYPE = eINSTANCE.getPort_PortType();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Parent System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PARENT_SYSTEM = eINSTANCE.getProperty_ParentSystem();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PARENT_FAMILY = eINSTANCE.getProperty_ParentFamily();

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
		 * The meta object literal for the '<em><b>Base Attach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__BASE_ATTACH = eINSTANCE.getGlue_BaseAttach();

		/**
		 * The meta object literal for the '<em><b>Crosscutting Attach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__CROSSCUTTING_ATTACH = eINSTANCE.getGlue_CrosscuttingAttach();

		/**
		 * The meta object literal for the '<em><b>Glue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUE__GLUE_TYPE = eINSTANCE.getGlue_GlueType();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__CONNECTOR = eINSTANCE.getGlue_Connector();

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
		 * The meta object literal for the '<em><b>First Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__FIRST_ELEMENT = eINSTANCE.getAttachment_FirstElement();

		/**
		 * The meta object literal for the '<em><b>Second Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__SECOND_ELEMENT = eINSTANCE.getAttachment_SecondElement();

		/**
		 * The meta object literal for the '<em><b>Parent System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PARENT_SYSTEM = eINSTANCE.getAttachment_ParentSystem();

		/**
		 * The meta object literal for the '<em><b>Parent Family</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PARENT_FAMILY = eINSTANCE.getAttachment_ParentFamily();

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
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PROPERTY = eINSTANCE.getBinding_Property();

		/**
		 * The meta object literal for the '<em><b>First Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__FIRST_PORT = eINSTANCE.getBinding_FirstPort();

		/**
		 * The meta object literal for the '<em><b>Second Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SECOND_PORT = eINSTANCE.getBinding_SecondPort();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__REPRESENTATION = eINSTANCE.getBinding_Representation();

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
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__BINDINGS = eINSTANCE.getRepresentation_Bindings();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__ELEMENT = eINSTANCE.getRepresentation_Element();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.WildCardImpl <em>Wild Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.WildCardImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getWildCard()
		 * @generated
		 */
		EClass WILD_CARD = eINSTANCE.getWildCard();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WILD_CARD__EXPRESSION = eINSTANCE.getWildCard_Expression();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.ArmaniImpl <em>Armani</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.ArmaniImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmani()
		 * @generated
		 */
		EClass ARMANI = eINSTANCE.getArmani();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARMANI__MODIFIERS = eINSTANCE.getArmani_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Design Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARMANI__DESIGN_RULE = eINSTANCE.getArmani_DesignRule();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.BindableElementImpl <em>Bindable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.BindableElementImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getBindableElement()
		 * @generated
		 */
		EClass BINDABLE_ELEMENT = eINSTANCE.getBindableElement();

		/**
		 * The meta object literal for the '{@link aspectualacme.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.impl.TypeDefinitionImpl
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link aspectualacme.GlueType <em>Glue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.GlueType
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getGlueType()
		 * @generated
		 */
		EEnum GLUE_TYPE = eINSTANCE.getGlueType();

		/**
		 * The meta object literal for the '{@link aspectualacme.ArmaniSetTypes <em>Armani Set Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.ArmaniSetTypes
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniSetTypes()
		 * @generated
		 */
		EEnum ARMANI_SET_TYPES = eINSTANCE.getArmaniSetTypes();

		/**
		 * The meta object literal for the '{@link aspectualacme.ArmaniTypes <em>Armani Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.ArmaniTypes
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniTypes()
		 * @generated
		 */
		EEnum ARMANI_TYPES = eINSTANCE.getArmaniTypes();

		/**
		 * The meta object literal for the '{@link aspectualacme.ArmaniQuantifier <em>Armani Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aspectualacme.ArmaniQuantifier
		 * @see aspectualacme.impl.AspectualacmePackageImpl#getArmaniQuantifier()
		 * @generated
		 */
		EEnum ARMANI_QUANTIFIER = eINSTANCE.getArmaniQuantifier();

	}

} //AspectualacmePackage
