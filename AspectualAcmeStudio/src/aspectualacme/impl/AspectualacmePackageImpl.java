/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.Armani;
import aspectualacme.ArmaniAdditiveExpression;
import aspectualacme.ArmaniBooleanExpression;
import aspectualacme.ArmaniConstant;
import aspectualacme.ArmaniDesignRuleExpression;
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
import aspectualacme.BasicElement;
import aspectualacme.BindableElement;
import aspectualacme.Binding;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Element;
import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Glue;
import aspectualacme.GlueType;
import aspectualacme.Import;
import aspectualacme.Port;
import aspectualacme.PortType;
import aspectualacme.Product;
import aspectualacme.ProductLine;
import aspectualacme.Property;
import aspectualacme.PropertyType;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.RoleType;
import aspectualacme.Root;
import aspectualacme.TypeDefinition;
import aspectualacme.WildCard;
import aspectualacme.attachableElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectualacmePackageImpl extends EPackageImpl implements AspectualacmePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniSetExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniPrimitiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniMultiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniAdditiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniEqualityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniIffExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniImpliesExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniQuantifiedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniDesignRuleExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crosscuttingRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armaniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum armaniSetTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum armaniTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum armaniQuantifierEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aspectualacme.AspectualacmePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AspectualacmePackageImpl() {
		super(eNS_URI, AspectualacmeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AspectualacmePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AspectualacmePackage init() {
		if (isInited) return (AspectualacmePackage)EPackage.Registry.INSTANCE.getEPackage(AspectualacmePackage.eNS_URI);

		// Obtain or create and register package
		AspectualacmePackageImpl theAspectualacmePackage = (AspectualacmePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AspectualacmePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AspectualacmePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAspectualacmePackage.createPackageContents();

		// Initialize created meta-data
		theAspectualacmePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAspectualacmePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AspectualacmePackage.eNS_URI, theAspectualacmePackage);
		return theAspectualacmePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Imports() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Elements() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_FileName() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Property() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Representations() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniExpression() {
		return armaniExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniFunctionCall() {
		return armaniFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniFunctionCall_FunctionId() {
		return (EAttribute)armaniFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniFunctionCall_Parameters() {
		return (EReference)armaniFunctionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniSetExpression() {
		return armaniSetExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniSetExpression_Reference() {
		return (EAttribute)armaniSetExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniSetExpression_ReferenceType() {
		return (EAttribute)armaniSetExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniSetExpression_SetValues() {
		return (EReference)armaniSetExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniConstant() {
		return armaniConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniPrimitiveExpression() {
		return armaniPrimitiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniPrimitiveExpression_DesignRule() {
		return (EReference)armaniPrimitiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniUnaryExpression() {
		return armaniUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniUnaryExpression_UnaryExpression() {
		return (EReference)armaniUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniUnaryExpression_Operator() {
		return (EAttribute)armaniUnaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniMultiplicativeExpression() {
		return armaniMultiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniMultiplicativeExpression_Expressions() {
		return (EReference)armaniMultiplicativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniMultiplicativeExpression_Operators() {
		return (EAttribute)armaniMultiplicativeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniAdditiveExpression() {
		return armaniAdditiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniAdditiveExpression_Expressions() {
		return (EReference)armaniAdditiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniAdditiveExpression_Operators() {
		return (EAttribute)armaniAdditiveExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniRelationalExpression() {
		return armaniRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniRelationalExpression_Expressions() {
		return (EReference)armaniRelationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniRelationalExpression_Operators() {
		return (EAttribute)armaniRelationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniEqualityExpression() {
		return armaniEqualityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniEqualityExpression_Expressions() {
		return (EReference)armaniEqualityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniEqualityExpression_Operators() {
		return (EAttribute)armaniEqualityExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniIffExpression() {
		return armaniIffExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniIffExpression_Expressions() {
		return (EReference)armaniIffExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniImpliesExpression() {
		return armaniImpliesExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniImpliesExpression_Expressions() {
		return (EReference)armaniImpliesExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniOrExpression() {
		return armaniOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniOrExpression_Expressions() {
		return (EReference)armaniOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniOrExpression_Operators() {
		return (EAttribute)armaniOrExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniVariable() {
		return armaniVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniVariable_Id() {
		return (EAttribute)armaniVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniVariable_UserType() {
		return (EReference)armaniVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniVariable_BasicType() {
		return (EAttribute)armaniVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniBooleanExpression() {
		return armaniBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniBooleanExpression_Expressions() {
		return (EReference)armaniBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniQuantifiedExpression() {
		return armaniQuantifiedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniQuantifiedExpression_Variable() {
		return (EReference)armaniQuantifiedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniQuantifiedExpression_SetExpression() {
		return (EReference)armaniQuantifiedExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmaniQuantifiedExpression_DesignRule() {
		return (EReference)armaniQuantifiedExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmaniQuantifiedExpression_Quantifier() {
		return (EAttribute)armaniQuantifiedExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmaniDesignRuleExpression() {
		return armaniDesignRuleExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachableElement() {
		return attachableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicElement() {
		return basicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicElement_Armani() {
		return (EReference)basicElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicElement_ParentFamily() {
		return (EReference)basicElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Connectors() {
		return (EReference)familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Components() {
		return (EReference)familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Attachments() {
		return (EReference)familyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Wildcard() {
		return (EReference)familyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Ctypes() {
		return (EReference)familyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Ptypes() {
		return (EReference)familyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Cntypes() {
		return (EReference)familyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Rtypes() {
		return (EReference)familyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Prtypes() {
		return (EReference)familyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Properties() {
		return (EReference)familyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Port() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_ParentType() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_ParentFamily() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleType_ParentType() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleType_ParentFamily() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortType_ParentType() {
		return (EReference)portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortType_ParentFamily() {
		return (EReference)portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ParentType() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_Role() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_Glue() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ParentFamily() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Type() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Values() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_ParentFamily() {
		return (EReference)propertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Connectors() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Attachments() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_WildCard() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Properties() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Components() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ParentRepresentation() {
		return (EReference)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Effective_type() {
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Port() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Type() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ParentSystem() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ParentFamily() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Effective_type() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Role() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Glue() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Type() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ParentSystem() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ParentFamily() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Effective_type() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Connector() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ConnectorT() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleType() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Effective_type() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseRole() {
		return baseRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseRole_Type() {
		return (EReference)baseRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrosscuttingRole() {
		return crosscuttingRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrosscuttingRole_Type() {
		return (EReference)crosscuttingRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Component() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_ComponentT() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Effective_type() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_PortType() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ParentSystem() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ParentFamily() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_BaseAttach() {
		return (EReference)glueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_CrosscuttingAttach() {
		return (EReference)glueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlue_GlueType() {
		return (EAttribute)glueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_Connector() {
		return (EReference)glueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_FirstElement() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SecondElement() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_ParentSystem() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_ParentFamily() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Property() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_FirstPort() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_SecondPort() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Representation() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_Name() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_System() {
		return (EReference)representationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Bindings() {
		return (EReference)representationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Element() {
		return (EReference)representationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWildCard() {
		return wildCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWildCard_Expression() {
		return (EAttribute)wildCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmani() {
		return armaniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArmani_Modifiers() {
		return (EAttribute)armaniEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArmani_DesignRule() {
		return (EReference)armaniEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindableElement() {
		return bindableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlueType() {
		return glueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArmaniSetTypes() {
		return armaniSetTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArmaniTypes() {
		return armaniTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArmaniQuantifier() {
		return armaniQuantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualacmeFactory getAspectualacmeFactory() {
		return (AspectualacmeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__IMPORTS);
		createEReference(rootEClass, ROOT__ELEMENTS);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__FILE_NAME);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__PROPERTY);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__REPRESENTATIONS);

		attachableElementEClass = createEClass(ATTACHABLE_ELEMENT);

		basicElementEClass = createEClass(BASIC_ELEMENT);
		createEReference(basicElementEClass, BASIC_ELEMENT__ARMANI);
		createEReference(basicElementEClass, BASIC_ELEMENT__PARENT_FAMILY);

		familyEClass = createEClass(FAMILY);
		createEReference(familyEClass, FAMILY__CONNECTORS);
		createEReference(familyEClass, FAMILY__COMPONENTS);
		createEReference(familyEClass, FAMILY__ATTACHMENTS);
		createEReference(familyEClass, FAMILY__WILDCARD);
		createEReference(familyEClass, FAMILY__CTYPES);
		createEReference(familyEClass, FAMILY__PTYPES);
		createEReference(familyEClass, FAMILY__CNTYPES);
		createEReference(familyEClass, FAMILY__RTYPES);
		createEReference(familyEClass, FAMILY__PRTYPES);
		createEReference(familyEClass, FAMILY__PROPERTIES);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PORT);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PARENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PARENT_FAMILY);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEReference(roleTypeEClass, ROLE_TYPE__PARENT_TYPE);
		createEReference(roleTypeEClass, ROLE_TYPE__PARENT_FAMILY);

		portTypeEClass = createEClass(PORT_TYPE);
		createEReference(portTypeEClass, PORT_TYPE__PARENT_TYPE);
		createEReference(portTypeEClass, PORT_TYPE__PARENT_FAMILY);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__PARENT_TYPE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__ROLE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__GLUE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__PARENT_FAMILY);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUES);
		createEReference(propertyTypeEClass, PROPERTY_TYPE__PARENT_FAMILY);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONNECTORS);
		createEReference(systemEClass, SYSTEM__PROPERTIES);
		createEReference(systemEClass, SYSTEM__ATTACHMENTS);
		createEReference(systemEClass, SYSTEM__WILD_CARD);
		createEReference(systemEClass, SYSTEM__COMPONENTS);
		createEReference(systemEClass, SYSTEM__PARENT_REPRESENTATION);
		createEReference(systemEClass, SYSTEM__EFFECTIVE_TYPE);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PORT);
		createEReference(componentEClass, COMPONENT__TYPE);
		createEReference(componentEClass, COMPONENT__PARENT_SYSTEM);
		createEReference(componentEClass, COMPONENT__PARENT_FAMILY);
		createEReference(componentEClass, COMPONENT__EFFECTIVE_TYPE);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__ROLE);
		createEReference(connectorEClass, CONNECTOR__GLUE);
		createEReference(connectorEClass, CONNECTOR__TYPE);
		createEReference(connectorEClass, CONNECTOR__PARENT_SYSTEM);
		createEReference(connectorEClass, CONNECTOR__PARENT_FAMILY);
		createEReference(connectorEClass, CONNECTOR__EFFECTIVE_TYPE);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__CONNECTOR);
		createEReference(roleEClass, ROLE__CONNECTOR_T);
		createEReference(roleEClass, ROLE__ROLE_TYPE);
		createEReference(roleEClass, ROLE__EFFECTIVE_TYPE);

		baseRoleEClass = createEClass(BASE_ROLE);
		createEReference(baseRoleEClass, BASE_ROLE__TYPE);

		crosscuttingRoleEClass = createEClass(CROSSCUTTING_ROLE);
		createEReference(crosscuttingRoleEClass, CROSSCUTTING_ROLE__TYPE);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__PORT_TYPE);
		createEReference(portEClass, PORT__COMPONENT);
		createEReference(portEClass, PORT__COMPONENT_T);
		createEReference(portEClass, PORT__EFFECTIVE_TYPE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEReference(propertyEClass, PROPERTY__TYPE);
		createEReference(propertyEClass, PROPERTY__PARENT_SYSTEM);
		createEReference(propertyEClass, PROPERTY__PARENT_FAMILY);

		glueEClass = createEClass(GLUE);
		createEReference(glueEClass, GLUE__BASE_ATTACH);
		createEReference(glueEClass, GLUE__CROSSCUTTING_ATTACH);
		createEAttribute(glueEClass, GLUE__GLUE_TYPE);
		createEReference(glueEClass, GLUE__CONNECTOR);

		attachmentEClass = createEClass(ATTACHMENT);
		createEReference(attachmentEClass, ATTACHMENT__FIRST_ELEMENT);
		createEReference(attachmentEClass, ATTACHMENT__SECOND_ELEMENT);
		createEReference(attachmentEClass, ATTACHMENT__PARENT_SYSTEM);
		createEReference(attachmentEClass, ATTACHMENT__PARENT_FAMILY);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__PROPERTY);
		createEReference(bindingEClass, BINDING__FIRST_PORT);
		createEReference(bindingEClass, BINDING__SECOND_PORT);
		createEReference(bindingEClass, BINDING__REPRESENTATION);

		representationEClass = createEClass(REPRESENTATION);
		createEAttribute(representationEClass, REPRESENTATION__NAME);
		createEReference(representationEClass, REPRESENTATION__SYSTEM);
		createEReference(representationEClass, REPRESENTATION__BINDINGS);
		createEReference(representationEClass, REPRESENTATION__ELEMENT);

		wildCardEClass = createEClass(WILD_CARD);
		createEAttribute(wildCardEClass, WILD_CARD__EXPRESSION);

		bindableElementEClass = createEClass(BINDABLE_ELEMENT);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);

		armaniEClass = createEClass(ARMANI);
		createEAttribute(armaniEClass, ARMANI__MODIFIERS);
		createEReference(armaniEClass, ARMANI__DESIGN_RULE);

		armaniExpressionEClass = createEClass(ARMANI_EXPRESSION);

		armaniFunctionCallEClass = createEClass(ARMANI_FUNCTION_CALL);
		createEAttribute(armaniFunctionCallEClass, ARMANI_FUNCTION_CALL__FUNCTION_ID);
		createEReference(armaniFunctionCallEClass, ARMANI_FUNCTION_CALL__PARAMETERS);

		armaniSetExpressionEClass = createEClass(ARMANI_SET_EXPRESSION);
		createEAttribute(armaniSetExpressionEClass, ARMANI_SET_EXPRESSION__REFERENCE);
		createEAttribute(armaniSetExpressionEClass, ARMANI_SET_EXPRESSION__REFERENCE_TYPE);
		createEReference(armaniSetExpressionEClass, ARMANI_SET_EXPRESSION__SET_VALUES);

		armaniConstantEClass = createEClass(ARMANI_CONSTANT);

		armaniPrimitiveExpressionEClass = createEClass(ARMANI_PRIMITIVE_EXPRESSION);
		createEReference(armaniPrimitiveExpressionEClass, ARMANI_PRIMITIVE_EXPRESSION__DESIGN_RULE);

		armaniUnaryExpressionEClass = createEClass(ARMANI_UNARY_EXPRESSION);
		createEReference(armaniUnaryExpressionEClass, ARMANI_UNARY_EXPRESSION__UNARY_EXPRESSION);
		createEAttribute(armaniUnaryExpressionEClass, ARMANI_UNARY_EXPRESSION__OPERATOR);

		armaniMultiplicativeExpressionEClass = createEClass(ARMANI_MULTIPLICATIVE_EXPRESSION);
		createEReference(armaniMultiplicativeExpressionEClass, ARMANI_MULTIPLICATIVE_EXPRESSION__EXPRESSIONS);
		createEAttribute(armaniMultiplicativeExpressionEClass, ARMANI_MULTIPLICATIVE_EXPRESSION__OPERATORS);

		armaniAdditiveExpressionEClass = createEClass(ARMANI_ADDITIVE_EXPRESSION);
		createEReference(armaniAdditiveExpressionEClass, ARMANI_ADDITIVE_EXPRESSION__EXPRESSIONS);
		createEAttribute(armaniAdditiveExpressionEClass, ARMANI_ADDITIVE_EXPRESSION__OPERATORS);

		armaniRelationalExpressionEClass = createEClass(ARMANI_RELATIONAL_EXPRESSION);
		createEReference(armaniRelationalExpressionEClass, ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS);
		createEAttribute(armaniRelationalExpressionEClass, ARMANI_RELATIONAL_EXPRESSION__OPERATORS);

		armaniEqualityExpressionEClass = createEClass(ARMANI_EQUALITY_EXPRESSION);
		createEReference(armaniEqualityExpressionEClass, ARMANI_EQUALITY_EXPRESSION__EXPRESSIONS);
		createEAttribute(armaniEqualityExpressionEClass, ARMANI_EQUALITY_EXPRESSION__OPERATORS);

		armaniIffExpressionEClass = createEClass(ARMANI_IFF_EXPRESSION);
		createEReference(armaniIffExpressionEClass, ARMANI_IFF_EXPRESSION__EXPRESSIONS);

		armaniImpliesExpressionEClass = createEClass(ARMANI_IMPLIES_EXPRESSION);
		createEReference(armaniImpliesExpressionEClass, ARMANI_IMPLIES_EXPRESSION__EXPRESSIONS);

		armaniOrExpressionEClass = createEClass(ARMANI_OR_EXPRESSION);
		createEReference(armaniOrExpressionEClass, ARMANI_OR_EXPRESSION__EXPRESSIONS);
		createEAttribute(armaniOrExpressionEClass, ARMANI_OR_EXPRESSION__OPERATORS);

		armaniVariableEClass = createEClass(ARMANI_VARIABLE);
		createEAttribute(armaniVariableEClass, ARMANI_VARIABLE__ID);
		createEReference(armaniVariableEClass, ARMANI_VARIABLE__USER_TYPE);
		createEAttribute(armaniVariableEClass, ARMANI_VARIABLE__BASIC_TYPE);

		armaniBooleanExpressionEClass = createEClass(ARMANI_BOOLEAN_EXPRESSION);
		createEReference(armaniBooleanExpressionEClass, ARMANI_BOOLEAN_EXPRESSION__EXPRESSIONS);

		armaniQuantifiedExpressionEClass = createEClass(ARMANI_QUANTIFIED_EXPRESSION);
		createEReference(armaniQuantifiedExpressionEClass, ARMANI_QUANTIFIED_EXPRESSION__VARIABLE);
		createEReference(armaniQuantifiedExpressionEClass, ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION);
		createEReference(armaniQuantifiedExpressionEClass, ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE);
		createEAttribute(armaniQuantifiedExpressionEClass, ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER);

		armaniDesignRuleExpressionEClass = createEClass(ARMANI_DESIGN_RULE_EXPRESSION);

		// Create enums
		glueTypeEEnum = createEEnum(GLUE_TYPE);
		armaniSetTypesEEnum = createEEnum(ARMANI_SET_TYPES);
		armaniTypesEEnum = createEEnum(ARMANI_TYPES);
		armaniQuantifierEEnum = createEEnum(ARMANI_QUANTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attachableElementEClass.getESuperTypes().add(this.getElement());
		basicElementEClass.getESuperTypes().add(this.getElement());
		familyEClass.getESuperTypes().add(this.getBasicElement());
		componentTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		roleTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		portTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		connectorTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		propertyTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		systemEClass.getESuperTypes().add(this.getBasicElement());
		componentEClass.getESuperTypes().add(this.getElement());
		connectorEClass.getESuperTypes().add(this.getElement());
		roleEClass.getESuperTypes().add(this.getattachableElement());
		roleEClass.getESuperTypes().add(this.getBindableElement());
		baseRoleEClass.getESuperTypes().add(this.getRole());
		crosscuttingRoleEClass.getESuperTypes().add(this.getRole());
		portEClass.getESuperTypes().add(this.getattachableElement());
		portEClass.getESuperTypes().add(this.getBindableElement());
		wildCardEClass.getESuperTypes().add(this.getattachableElement());
		bindableElementEClass.getESuperTypes().add(this.getElement());
		typeDefinitionEClass.getESuperTypes().add(this.getElement());
		armaniFunctionCallEClass.getESuperTypes().add(this.getArmaniPrimitiveExpression());
		armaniSetExpressionEClass.getESuperTypes().add(this.getArmaniPrimitiveExpression());
		armaniConstantEClass.getESuperTypes().add(this.getArmaniPrimitiveExpression());
		armaniPrimitiveExpressionEClass.getESuperTypes().add(this.getArmaniUnaryExpression());
		armaniUnaryExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniMultiplicativeExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniAdditiveExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniRelationalExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniEqualityExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniIffExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniImpliesExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniOrExpressionEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniVariableEClass.getESuperTypes().add(this.getArmaniExpression());
		armaniBooleanExpressionEClass.getESuperTypes().add(this.getArmaniDesignRuleExpression());
		armaniQuantifiedExpressionEClass.getESuperTypes().add(this.getArmaniDesignRuleExpression());
		armaniDesignRuleExpressionEClass.getESuperTypes().add(this.getArmaniExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Imports(), this.getImport(), null, "imports", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Elements(), this.getBasicElement(), null, "elements", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Property(), this.getProperty(), null, "property", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", "name", 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Representations(), this.getRepresentation(), this.getRepresentation_Element(), "representations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getElement_Representations().getEKeys().add(this.getRepresentation_Name());

		initEClass(attachableElementEClass, attachableElement.class, "attachableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicElementEClass, BasicElement.class, "BasicElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicElement_Armani(), this.getArmani(), null, "armani", null, 0, -1, BasicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicElement_ParentFamily(), this.getFamily(), null, "parentFamily", null, 0, -1, BasicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamily_Connectors(), this.getConnector(), this.getConnector_ParentFamily(), "connectors", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Connectors().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Components(), this.getComponent(), this.getComponent_ParentFamily(), "components", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Components().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Attachments(), this.getAttachment(), this.getAttachment_ParentFamily(), "attachments", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Wildcard(), this.getWildCard(), null, "wildcard", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Wildcard().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Ctypes(), this.getComponentType(), this.getComponentType_ParentFamily(), "ctypes", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Ctypes().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Ptypes(), this.getPortType(), this.getPortType_ParentFamily(), "ptypes", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Ptypes().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Cntypes(), this.getConnectorType(), this.getConnectorType_ParentFamily(), "cntypes", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Cntypes().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Rtypes(), this.getRoleType(), this.getRoleType_ParentFamily(), "rtypes", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Rtypes().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Prtypes(), this.getPropertyType(), this.getPropertyType_ParentFamily(), "prtypes", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Prtypes().getEKeys().add(this.getElement_Name());
		initEReference(getFamily_Properties(), this.getProperty(), this.getProperty_ParentFamily(), "properties", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFamily_Properties().getEKeys().add(this.getProperty_Name());

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_Port(), this.getPort(), this.getPort_ComponentT(), "port", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentType_Port().getEKeys().add(this.getElement_Name());
		initEReference(getComponentType_ParentType(), this.getComponentType(), null, "parentType", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponentType_ParentType().getEKeys().add(this.getElement_Name());
		initEReference(getComponentType_ParentFamily(), this.getFamily(), this.getFamily_Ctypes(), "parentFamily", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleType_ParentType(), this.getRoleType(), null, "parentType", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoleType_ParentType().getEKeys().add(this.getElement_Name());
		initEReference(getRoleType_ParentFamily(), this.getFamily(), this.getFamily_Rtypes(), "parentFamily", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortType_ParentType(), this.getPortType(), null, "parentType", null, 0, -1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPortType_ParentType().getEKeys().add(this.getElement_Name());
		initEReference(getPortType_ParentFamily(), this.getFamily(), this.getFamily_Ptypes(), "parentFamily", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorType_ParentType(), this.getConnectorType(), null, "parentType", null, 0, -1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnectorType_ParentType().getEKeys().add(this.getElement_Name());
		initEReference(getConnectorType_Role(), this.getRole(), this.getRole_ConnectorT(), "role", null, 0, -1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnectorType_Role().getEKeys().add(this.getElement_Name());
		initEReference(getConnectorType_Glue(), this.getGlue(), null, "glue", null, 0, -1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_ParentFamily(), this.getFamily(), this.getFamily_Cntypes(), "parentFamily", null, 0, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Type(), ecorePackage.getEString(), "type", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Values(), ecorePackage.getEString(), "values", null, 0, -1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyType_ParentFamily(), this.getFamily(), this.getFamily_Prtypes(), "parentFamily", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPropertyType_ParentFamily().getEKeys().add(this.getElement_Name());

		initEClass(systemEClass, aspectualacme.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Connectors(), this.getConnector(), this.getConnector_ParentSystem(), "connectors", null, 0, -1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSystem_Connectors().getEKeys().add(this.getElement_Name());
		initEReference(getSystem_Properties(), this.getProperty(), this.getProperty_ParentSystem(), "properties", null, 0, -1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSystem_Properties().getEKeys().add(this.getProperty_Name());
		initEReference(getSystem_Attachments(), this.getAttachment(), this.getAttachment_ParentSystem(), "attachments", null, 0, -1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_WildCard(), this.getWildCard(), null, "wildCard", null, 0, -1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSystem_WildCard().getEKeys().add(this.getElement_Name());
		initEReference(getSystem_Components(), this.getComponent(), this.getComponent_ParentSystem(), "components", null, 0, -1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSystem_Components().getEKeys().add(this.getElement_Name());
		initEReference(getSystem_ParentRepresentation(), this.getRepresentation(), this.getRepresentation_System(), "parentRepresentation", null, 0, 1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Effective_type(), this.getFamily(), null, "effective_type", null, 0, -1, aspectualacme.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSystem_Effective_type().getEKeys().add(this.getElement_Name());

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Port(), this.getPort(), this.getPort_Component(), "port", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponent_Port().getEKeys().add(this.getElement_Name());
		initEReference(getComponent_Type(), this.getComponentType(), null, "type", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponent_Type().getEKeys().add(this.getElement_Name());
		initEReference(getComponent_ParentSystem(), this.getSystem(), this.getSystem_Components(), "parentSystem", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ParentFamily(), this.getFamily(), this.getFamily_Components(), "parentFamily", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Effective_type(), this.getComponentType(), null, "effective_type", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComponent_Effective_type().getEKeys().add(this.getElement_Name());

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Role(), this.getRole(), this.getRole_Connector(), "role", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnector_Role().getEKeys().add(this.getElement_Name());
		initEReference(getConnector_Glue(), this.getGlue(), this.getGlue_Connector(), "glue", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Type(), this.getConnectorType(), null, "type", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnector_Type().getEKeys().add(this.getElement_Name());
		initEReference(getConnector_ParentSystem(), this.getSystem(), this.getSystem_Connectors(), "parentSystem", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_ParentFamily(), this.getFamily(), this.getFamily_Connectors(), "parentFamily", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Effective_type(), this.getConnectorType(), null, "effective_type", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConnector_Effective_type().getEKeys().add(this.getElement_Name());

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Connector(), this.getConnector(), this.getConnector_Role(), "Connector", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ConnectorT(), this.getConnectorType(), this.getConnectorType_Role(), "ConnectorT", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleType(), this.getRoleType(), null, "roleType", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Effective_type(), this.getRoleType(), null, "effective_type", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRole_Effective_type().getEKeys().add(this.getElement_Name());

		initEClass(baseRoleEClass, BaseRole.class, "BaseRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseRole_Type(), this.getRoleType(), null, "type", null, 0, -1, BaseRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBaseRole_Type().getEKeys().add(this.getElement_Name());

		initEClass(crosscuttingRoleEClass, CrosscuttingRole.class, "CrosscuttingRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrosscuttingRole_Type(), this.getRoleType(), null, "type", null, 0, -1, CrosscuttingRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCrosscuttingRole_Type().getEKeys().add(this.getElement_Name());

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_PortType(), this.getPortType(), null, "portType", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPort_PortType().getEKeys().add(this.getElement_Name());
		initEReference(getPort_Component(), this.getComponent(), this.getComponent_Port(), "Component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_ComponentT(), this.getComponentType(), this.getComponentType_Port(), "ComponentT", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Effective_type(), this.getPortType(), null, "effective_type", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPort_Effective_type().getEKeys().add(this.getElement_Name());

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", "", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Type(), this.getPropertyType(), null, "type", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProperty_Type().getEKeys().add(this.getElement_Name());
		initEReference(getProperty_ParentSystem(), this.getSystem(), this.getSystem_Properties(), "parentSystem", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProperty_ParentSystem().getEKeys().add(this.getElement_Name());
		initEReference(getProperty_ParentFamily(), this.getFamily(), this.getFamily_Properties(), "parentFamily", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProperty_ParentFamily().getEKeys().add(this.getElement_Name());

		initEClass(glueEClass, Glue.class, "Glue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlue_BaseAttach(), this.getBaseRole(), null, "baseAttach", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGlue_CrosscuttingAttach(), this.getCrosscuttingRole(), null, "crosscuttingAttach", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlue_GlueType(), this.getGlueType(), "glueType", "", 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlue_Connector(), this.getConnector(), this.getConnector_Glue(), "connector", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_FirstElement(), this.getattachableElement(), null, "firstElement", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAttachment_FirstElement().getEKeys().add(this.getElement_Name());
		initEReference(getAttachment_SecondElement(), this.getattachableElement(), null, "secondElement", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAttachment_SecondElement().getEKeys().add(this.getElement_Name());
		initEReference(getAttachment_ParentSystem(), this.getSystem(), this.getSystem_Attachments(), "parentSystem", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_ParentFamily(), this.getFamily(), this.getFamily_Attachments(), "parentFamily", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Property(), this.getProperty(), null, "property", null, 0, -1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_FirstPort(), this.getBindableElement(), null, "firstPort", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBinding_FirstPort().getEKeys().add(this.getElement_Name());
		initEReference(getBinding_SecondPort(), this.getBindableElement(), null, "secondPort", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBinding_SecondPort().getEKeys().add(this.getElement_Name());
		initEReference(getBinding_Representation(), this.getRepresentation(), this.getRepresentation_Bindings(), "representation", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_System(), this.getSystem(), this.getSystem_ParentRepresentation(), "system", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_Bindings(), this.getBinding(), this.getBinding_Representation(), "bindings", null, 0, -1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentation_Element(), this.getElement(), this.getElement_Representations(), "element", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRepresentation_Element().getEKeys().add(this.getElement_Name());

		initEClass(wildCardEClass, WildCard.class, "WildCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWildCard_Expression(), ecorePackage.getEString(), "expression", "", 1, 1, WildCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindableElementEClass, BindableElement.class, "BindableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(armaniEClass, Armani.class, "Armani", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArmani_Modifiers(), ecorePackage.getEString(), "modifiers", null, 1, 2, Armani.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArmani_DesignRule(), this.getArmaniDesignRuleExpression(), null, "designRule", null, 1, 1, Armani.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniExpressionEClass, ArmaniExpression.class, "ArmaniExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(armaniFunctionCallEClass, ArmaniFunctionCall.class, "ArmaniFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArmaniFunctionCall_FunctionId(), ecorePackage.getEString(), "functionId", null, 1, 1, ArmaniFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArmaniFunctionCall_Parameters(), this.getArmaniPrimitiveExpression(), null, "parameters", null, 0, -1, ArmaniFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniSetExpressionEClass, ArmaniSetExpression.class, "ArmaniSetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArmaniSetExpression_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ArmaniSetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniSetExpression_ReferenceType(), this.getArmaniSetTypes(), "referenceType", null, 0, 1, ArmaniSetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArmaniSetExpression_SetValues(), this.getArmaniConstant(), null, "setValues", null, 0, -1, ArmaniSetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniConstantEClass, ArmaniConstant.class, "ArmaniConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(armaniPrimitiveExpressionEClass, ArmaniPrimitiveExpression.class, "ArmaniPrimitiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniPrimitiveExpression_DesignRule(), this.getArmaniDesignRuleExpression(), null, "designRule", null, 0, 1, ArmaniPrimitiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniUnaryExpressionEClass, ArmaniUnaryExpression.class, "ArmaniUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniUnaryExpression_UnaryExpression(), this.getArmaniUnaryExpression(), null, "unaryExpression", null, 0, 1, ArmaniUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniUnaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ArmaniUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniMultiplicativeExpressionEClass, ArmaniMultiplicativeExpression.class, "ArmaniMultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniMultiplicativeExpression_Expressions(), this.getArmaniUnaryExpression(), null, "expressions", null, 1, -1, ArmaniMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniMultiplicativeExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, ArmaniMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniAdditiveExpressionEClass, ArmaniAdditiveExpression.class, "ArmaniAdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniAdditiveExpression_Expressions(), this.getArmaniMultiplicativeExpression(), null, "expressions", null, 1, -1, ArmaniAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniAdditiveExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, ArmaniAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniRelationalExpressionEClass, ArmaniRelationalExpression.class, "ArmaniRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniRelationalExpression_Expressions(), this.getArmaniAdditiveExpression(), null, "expressions", null, 1, -1, ArmaniRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniRelationalExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, ArmaniRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniEqualityExpressionEClass, ArmaniEqualityExpression.class, "ArmaniEqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniEqualityExpression_Expressions(), this.getArmaniRelationalExpression(), null, "expressions", null, 1, -1, ArmaniEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniEqualityExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, ArmaniEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniIffExpressionEClass, ArmaniIffExpression.class, "ArmaniIffExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniIffExpression_Expressions(), this.getArmaniEqualityExpression(), null, "expressions", null, 1, -1, ArmaniIffExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniImpliesExpressionEClass, ArmaniImpliesExpression.class, "ArmaniImpliesExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniImpliesExpression_Expressions(), this.getArmaniIffExpression(), null, "expressions", null, 1, -1, ArmaniImpliesExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniOrExpressionEClass, ArmaniOrExpression.class, "ArmaniOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniOrExpression_Expressions(), this.getArmaniImpliesExpression(), null, "expressions", null, 1, -1, ArmaniOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniOrExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, ArmaniOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniVariableEClass, ArmaniVariable.class, "ArmaniVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArmaniVariable_Id(), ecorePackage.getEString(), "id", null, 1, 1, ArmaniVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArmaniVariable_UserType(), this.getTypeDefinition(), null, "userType", null, 0, 1, ArmaniVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getArmaniVariable_UserType().getEKeys().add(this.getElement_Name());
		initEAttribute(getArmaniVariable_BasicType(), this.getArmaniTypes(), "basicType", null, 0, 1, ArmaniVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniBooleanExpressionEClass, ArmaniBooleanExpression.class, "ArmaniBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniBooleanExpression_Expressions(), this.getArmaniOrExpression(), null, "expressions", null, 1, -1, ArmaniBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniQuantifiedExpressionEClass, ArmaniQuantifiedExpression.class, "ArmaniQuantifiedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArmaniQuantifiedExpression_Variable(), this.getArmaniVariable(), null, "variable", null, 1, 1, ArmaniQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArmaniQuantifiedExpression_SetExpression(), this.getArmaniSetExpression(), null, "setExpression", null, 1, 1, ArmaniQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArmaniQuantifiedExpression_DesignRule(), this.getArmaniDesignRuleExpression(), null, "designRule", null, 1, 1, ArmaniQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArmaniQuantifiedExpression_Quantifier(), this.getArmaniQuantifier(), "quantifier", null, 1, 1, ArmaniQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armaniDesignRuleExpressionEClass, ArmaniDesignRuleExpression.class, "ArmaniDesignRuleExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(glueTypeEEnum, GlueType.class, "GlueType");
		addEEnumLiteral(glueTypeEEnum, GlueType.BEFORE);
		addEEnumLiteral(glueTypeEEnum, GlueType.AROUND);
		addEEnumLiteral(glueTypeEEnum, GlueType.AFTER);

		initEEnum(armaniSetTypesEEnum, ArmaniSetTypes.class, "ArmaniSetTypes");
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.COMPONENTS);
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.CONNECTORS);
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.ROLES);
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.PORTS);
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.REPRESENTATIONS);
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.PROPERTIES);
		addEEnumLiteral(armaniSetTypesEEnum, ArmaniSetTypes.ELEMENTS);

		initEEnum(armaniTypesEEnum, ArmaniTypes.class, "ArmaniTypes");
		addEEnumLiteral(armaniTypesEEnum, ArmaniTypes.COMPONENT);
		addEEnumLiteral(armaniTypesEEnum, ArmaniTypes.CONNECTOR);
		addEEnumLiteral(armaniTypesEEnum, ArmaniTypes.ROLE);
		addEEnumLiteral(armaniTypesEEnum, ArmaniTypes.PORT);
		addEEnumLiteral(armaniTypesEEnum, ArmaniTypes.REPRESENTATION);
		addEEnumLiteral(armaniTypesEEnum, ArmaniTypes.PROPERTY);

		initEEnum(armaniQuantifierEEnum, ArmaniQuantifier.class, "ArmaniQuantifier");
		addEEnumLiteral(armaniQuantifierEEnum, ArmaniQuantifier.FORALL);
		addEEnumLiteral(armaniQuantifierEEnum, ArmaniQuantifier.EXISTS);

		// Create resource
		createResource(eNS_URI);
	}

} //AspectualacmePackageImpl
