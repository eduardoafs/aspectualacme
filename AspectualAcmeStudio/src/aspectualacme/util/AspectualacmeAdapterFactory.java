/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.util;

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
import aspectualacme.ArmaniRelationalExpression;
import aspectualacme.ArmaniSetExpression;
import aspectualacme.ArmaniUnaryExpression;
import aspectualacme.ArmaniVariable;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aspectualacme.AspectualacmePackage
 * @generated
 */
public class AspectualacmeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AspectualacmePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualacmeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AspectualacmePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectualacmeSwitch<Adapter> modelSwitch =
		new AspectualacmeSwitch<Adapter>() {
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseattachableElement(attachableElement object) {
				return createattachableElementAdapter();
			}
			@Override
			public Adapter caseBasicElement(BasicElement object) {
				return createBasicElementAdapter();
			}
			@Override
			public Adapter caseFamily(Family object) {
				return createFamilyAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSystem(aspectualacme.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseBaseRole(BaseRole object) {
				return createBaseRoleAdapter();
			}
			@Override
			public Adapter caseCrosscuttingRole(CrosscuttingRole object) {
				return createCrosscuttingRoleAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseWildCard(WildCard object) {
				return createWildCardAdapter();
			}
			@Override
			public Adapter caseBindableElement(BindableElement object) {
				return createBindableElementAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseArmani(Armani object) {
				return createArmaniAdapter();
			}
			@Override
			public Adapter caseArmaniExpression(ArmaniExpression object) {
				return createArmaniExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniFunctionCall(ArmaniFunctionCall object) {
				return createArmaniFunctionCallAdapter();
			}
			@Override
			public Adapter caseArmaniSetExpression(ArmaniSetExpression object) {
				return createArmaniSetExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniConstant(ArmaniConstant object) {
				return createArmaniConstantAdapter();
			}
			@Override
			public Adapter caseArmaniPrimitiveExpression(ArmaniPrimitiveExpression object) {
				return createArmaniPrimitiveExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniUnaryExpression(ArmaniUnaryExpression object) {
				return createArmaniUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniMultiplicativeExpression(ArmaniMultiplicativeExpression object) {
				return createArmaniMultiplicativeExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniAdditiveExpression(ArmaniAdditiveExpression object) {
				return createArmaniAdditiveExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniRelationalExpression(ArmaniRelationalExpression object) {
				return createArmaniRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniEqualityExpression(ArmaniEqualityExpression object) {
				return createArmaniEqualityExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniIffExpression(ArmaniIffExpression object) {
				return createArmaniIffExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniImpliesExpression(ArmaniImpliesExpression object) {
				return createArmaniImpliesExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniOrExpression(ArmaniOrExpression object) {
				return createArmaniOrExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniVariable(ArmaniVariable object) {
				return createArmaniVariableAdapter();
			}
			@Override
			public Adapter caseArmaniBooleanExpression(ArmaniBooleanExpression object) {
				return createArmaniBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniQuantifiedExpression(ArmaniQuantifiedExpression object) {
				return createArmaniQuantifiedExpressionAdapter();
			}
			@Override
			public Adapter caseArmaniDesignRuleExpression(ArmaniDesignRuleExpression object) {
				return createArmaniDesignRuleExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniExpression <em>Armani Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniExpression
	 * @generated
	 */
	public Adapter createArmaniExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniFunctionCall <em>Armani Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniFunctionCall
	 * @generated
	 */
	public Adapter createArmaniFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniSetExpression <em>Armani Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniSetExpression
	 * @generated
	 */
	public Adapter createArmaniSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniConstant <em>Armani Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniConstant
	 * @generated
	 */
	public Adapter createArmaniConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniPrimitiveExpression <em>Armani Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniPrimitiveExpression
	 * @generated
	 */
	public Adapter createArmaniPrimitiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniUnaryExpression <em>Armani Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniUnaryExpression
	 * @generated
	 */
	public Adapter createArmaniUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniMultiplicativeExpression <em>Armani Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniMultiplicativeExpression
	 * @generated
	 */
	public Adapter createArmaniMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniAdditiveExpression <em>Armani Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniAdditiveExpression
	 * @generated
	 */
	public Adapter createArmaniAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniRelationalExpression <em>Armani Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniRelationalExpression
	 * @generated
	 */
	public Adapter createArmaniRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniEqualityExpression <em>Armani Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniEqualityExpression
	 * @generated
	 */
	public Adapter createArmaniEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniIffExpression <em>Armani Iff Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniIffExpression
	 * @generated
	 */
	public Adapter createArmaniIffExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniImpliesExpression <em>Armani Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniImpliesExpression
	 * @generated
	 */
	public Adapter createArmaniImpliesExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniOrExpression <em>Armani Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniOrExpression
	 * @generated
	 */
	public Adapter createArmaniOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniVariable <em>Armani Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniVariable
	 * @generated
	 */
	public Adapter createArmaniVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniBooleanExpression <em>Armani Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniBooleanExpression
	 * @generated
	 */
	public Adapter createArmaniBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniQuantifiedExpression <em>Armani Quantified Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniQuantifiedExpression
	 * @generated
	 */
	public Adapter createArmaniQuantifiedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ArmaniDesignRuleExpression <em>Armani Design Rule Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ArmaniDesignRuleExpression
	 * @generated
	 */
	public Adapter createArmaniDesignRuleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.attachableElement <em>attachable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.attachableElement
	 * @generated
	 */
	public Adapter createattachableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.BasicElement <em>Basic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.BasicElement
	 * @generated
	 */
	public Adapter createBasicElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Family
	 * @generated
	 */
	public Adapter createFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.BaseRole <em>Base Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.BaseRole
	 * @generated
	 */
	public Adapter createBaseRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.CrosscuttingRole <em>Crosscutting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.CrosscuttingRole
	 * @generated
	 */
	public Adapter createCrosscuttingRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.WildCard <em>Wild Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.WildCard
	 * @generated
	 */
	public Adapter createWildCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.Armani <em>Armani</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.Armani
	 * @generated
	 */
	public Adapter createArmaniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.BindableElement <em>Bindable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.BindableElement
	 * @generated
	 */
	public Adapter createBindableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aspectualacme.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aspectualacme.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AspectualacmeAdapterFactory
