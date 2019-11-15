/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.Glue;
import aspectualacme.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ConnectorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends ElementImpl implements Connector {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentWithInverseEList<Role>(Role.class, this, AspectualacmePackage.CONNECTOR__ROLE, AspectualacmePackage.ROLE__CONNECTOR);
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
			glue = new EObjectContainmentWithInverseEList<Glue>(Glue.class, this, AspectualacmePackage.CONNECTOR__GLUE, AspectualacmePackage.GLUE__CONNECTOR);
		}
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<ConnectorType>(ConnectorType.class, this, AspectualacmePackage.CONNECTOR__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR__GLUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGlue()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.CONNECTOR__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR__GLUE:
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
			case AspectualacmePackage.CONNECTOR__ROLE:
				return getRole();
			case AspectualacmePackage.CONNECTOR__GLUE:
				return getGlue();
			case AspectualacmePackage.CONNECTOR__TYPE:
				return getType();
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
			case AspectualacmePackage.CONNECTOR__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case AspectualacmePackage.CONNECTOR__GLUE:
				getGlue().clear();
				getGlue().addAll((Collection<? extends Glue>)newValue);
				return;
			case AspectualacmePackage.CONNECTOR__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ConnectorType>)newValue);
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
			case AspectualacmePackage.CONNECTOR__ROLE:
				getRole().clear();
				return;
			case AspectualacmePackage.CONNECTOR__GLUE:
				getGlue().clear();
				return;
			case AspectualacmePackage.CONNECTOR__TYPE:
				getType().clear();
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
			case AspectualacmePackage.CONNECTOR__ROLE:
				return role != null && !role.isEmpty();
			case AspectualacmePackage.CONNECTOR__GLUE:
				return glue != null && !glue.isEmpty();
			case AspectualacmePackage.CONNECTOR__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
