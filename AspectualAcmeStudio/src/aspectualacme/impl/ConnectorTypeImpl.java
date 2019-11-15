/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.ConnectorType;

import aspectualacme.Glue;
import aspectualacme.Role;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getGlue <em>Glue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeImpl extends ElementImpl implements ConnectorType {
	/**
	 * The cached value of the '{@link #getParentType() <em>Parent Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentType()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> parentType;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected EList<Glue> glue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getParentType() {
		if (parentType == null) {
			parentType = new EObjectResolvingEList<ConnectorType>(ConnectorType.class, this, AspectualacmePackage.CONNECTOR_TYPE__PARENT_TYPE);
		}
		return parentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, AspectualacmePackage.CONNECTOR_TYPE__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Glue> getGlue() {
		if (glue == null) {
			glue = new EObjectContainmentEList<Glue>(Glue.class, this, AspectualacmePackage.CONNECTOR_TYPE__GLUE);
		}
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				return ((InternalEList<?>)getGlue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_TYPE:
				return getParentType();
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				return getRole();
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				return getGlue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_TYPE:
				getParentType().clear();
				getParentType().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				getGlue().clear();
				getGlue().addAll((Collection<? extends Glue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_TYPE:
				getParentType().clear();
				return;
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				getRole().clear();
				return;
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				getGlue().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_TYPE:
				return parentType != null && !parentType.isEmpty();
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				return role != null && !role.isEmpty();
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				return glue != null && !glue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorTypeImpl
