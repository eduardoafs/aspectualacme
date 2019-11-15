/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualConnector;
import aspectualacme.AspectualacmePackage;
import aspectualacme.BaseRole;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Glue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspectual Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.AspectualConnectorImpl#getBaseRole <em>Base Role</em>}</li>
 *   <li>{@link aspectualacme.impl.AspectualConnectorImpl#getCrosscuttingRole <em>Crosscutting Role</em>}</li>
 *   <li>{@link aspectualacme.impl.AspectualConnectorImpl#getGlues <em>Glues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectualConnectorImpl extends ConnectorImpl implements AspectualConnector {
	/**
	 * The cached value of the '{@link #getBaseRole() <em>Base Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseRole()
	 * @generated
	 * @ordered
	 */
	protected BaseRole baseRole;

	/**
	 * The cached value of the '{@link #getCrosscuttingRole() <em>Crosscutting Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrosscuttingRole()
	 * @generated
	 * @ordered
	 */
	protected CrosscuttingRole crosscuttingRole;

	/**
	 * The cached value of the '{@link #getGlues() <em>Glues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlues()
	 * @generated
	 * @ordered
	 */
	protected Glue glues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectualConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ASPECTUAL_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRole getBaseRole() {
		return baseRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseRole(BaseRole newBaseRole, NotificationChain msgs) {
		BaseRole oldBaseRole = baseRole;
		baseRole = newBaseRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE, oldBaseRole, newBaseRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseRole(BaseRole newBaseRole) {
		if (newBaseRole != baseRole) {
			NotificationChain msgs = null;
			if (baseRole != null)
				msgs = ((InternalEObject)baseRole).eInverseRemove(this, AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR, BaseRole.class, msgs);
			if (newBaseRole != null)
				msgs = ((InternalEObject)newBaseRole).eInverseAdd(this, AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR, BaseRole.class, msgs);
			msgs = basicSetBaseRole(newBaseRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE, newBaseRole, newBaseRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRole getCrosscuttingRole() {
		return crosscuttingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrosscuttingRole(CrosscuttingRole newCrosscuttingRole, NotificationChain msgs) {
		CrosscuttingRole oldCrosscuttingRole = crosscuttingRole;
		crosscuttingRole = newCrosscuttingRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE, oldCrosscuttingRole, newCrosscuttingRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrosscuttingRole(CrosscuttingRole newCrosscuttingRole) {
		if (newCrosscuttingRole != crosscuttingRole) {
			NotificationChain msgs = null;
			if (crosscuttingRole != null)
				msgs = ((InternalEObject)crosscuttingRole).eInverseRemove(this, AspectualacmePackage.CROSSCUTTING_ROLE__ASPECTUAL_CONNECTOR, CrosscuttingRole.class, msgs);
			if (newCrosscuttingRole != null)
				msgs = ((InternalEObject)newCrosscuttingRole).eInverseAdd(this, AspectualacmePackage.CROSSCUTTING_ROLE__ASPECTUAL_CONNECTOR, CrosscuttingRole.class, msgs);
			msgs = basicSetCrosscuttingRole(newCrosscuttingRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE, newCrosscuttingRole, newCrosscuttingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlues() {
		return glues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlues(Glue newGlues, NotificationChain msgs) {
		Glue oldGlues = glues;
		glues = newGlues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES, oldGlues, newGlues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlues(Glue newGlues) {
		if (newGlues != glues) {
			NotificationChain msgs = null;
			if (glues != null)
				msgs = ((InternalEObject)glues).eInverseRemove(this, AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR, Glue.class, msgs);
			if (newGlues != null)
				msgs = ((InternalEObject)newGlues).eInverseAdd(this, AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR, Glue.class, msgs);
			msgs = basicSetGlues(newGlues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES, newGlues, newGlues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE:
				if (baseRole != null)
					msgs = ((InternalEObject)baseRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE, null, msgs);
				return basicSetBaseRole((BaseRole)otherEnd, msgs);
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE:
				if (crosscuttingRole != null)
					msgs = ((InternalEObject)crosscuttingRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE, null, msgs);
				return basicSetCrosscuttingRole((CrosscuttingRole)otherEnd, msgs);
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES:
				if (glues != null)
					msgs = ((InternalEObject)glues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES, null, msgs);
				return basicSetGlues((Glue)otherEnd, msgs);
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
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE:
				return basicSetBaseRole(null, msgs);
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE:
				return basicSetCrosscuttingRole(null, msgs);
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES:
				return basicSetGlues(null, msgs);
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
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE:
				return getBaseRole();
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE:
				return getCrosscuttingRole();
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES:
				return getGlues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE:
				setBaseRole((BaseRole)newValue);
				return;
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE:
				setCrosscuttingRole((CrosscuttingRole)newValue);
				return;
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES:
				setGlues((Glue)newValue);
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
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE:
				setBaseRole((BaseRole)null);
				return;
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE:
				setCrosscuttingRole((CrosscuttingRole)null);
				return;
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES:
				setGlues((Glue)null);
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
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE:
				return baseRole != null;
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__CROSSCUTTING_ROLE:
				return crosscuttingRole != null;
			case AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES:
				return glues != null;
		}
		return super.eIsSet(featureID);
	}

} //AspectualConnectorImpl
