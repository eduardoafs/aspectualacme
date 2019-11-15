/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.util;

import aspectualacme.Armani;
import aspectualacme.ArmaniExpression;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BaseRole;
import aspectualacme.BasicElement;
import aspectualacme.Binding;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Element;
import aspectualacme.Family;
import aspectualacme.Glue;
import aspectualacme.Import;
import aspectualacme.Port;
import aspectualacme.PortType;
import aspectualacme.Property;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.RoleType;
import aspectualacme.Root;
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
			public Adapter caseArmaniExpression(ArmaniExpression object) {
				return createArmaniExpressionAdapter();
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
			public Adapter caseArmani(Armani object) {
				return createArmaniAdapter();
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
