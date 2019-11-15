/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.BaseRole;
import aspectualacme.Connector;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Glue;
import aspectualacme.GlueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.GlueImpl#getBaseAttach <em>Base Attach</em>}</li>
 *   <li>{@link aspectualacme.impl.GlueImpl#getCrosscuttingAttach <em>Crosscutting Attach</em>}</li>
 *   <li>{@link aspectualacme.impl.GlueImpl#getGlueType <em>Glue Type</em>}</li>
 *   <li>{@link aspectualacme.impl.GlueImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlueImpl extends EObjectImpl implements Glue {
	/**
	 * The cached value of the '{@link #getBaseAttach() <em>Base Attach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAttach()
	 * @generated
	 * @ordered
	 */
	protected BaseRole baseAttach;

	/**
	 * The cached value of the '{@link #getCrosscuttingAttach() <em>Crosscutting Attach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrosscuttingAttach()
	 * @generated
	 * @ordered
	 */
	protected CrosscuttingRole crosscuttingAttach;

	/**
	 * The default value of the '{@link #getGlueType() <em>Glue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueType()
	 * @generated
	 * @ordered
	 */
	protected static final GlueType GLUE_TYPE_EDEFAULT = GlueType.BEFORE;

	/**
	 * The cached value of the '{@link #getGlueType() <em>Glue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueType()
	 * @generated
	 * @ordered
	 */
	protected GlueType glueType = GLUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRole getBaseAttach() {
		if (baseAttach != null && baseAttach.eIsProxy()) {
			InternalEObject oldBaseAttach = (InternalEObject)baseAttach;
			baseAttach = (BaseRole)eResolveProxy(oldBaseAttach);
			if (baseAttach != oldBaseAttach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.GLUE__BASE_ATTACH, oldBaseAttach, baseAttach));
			}
		}
		return baseAttach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRole basicGetBaseAttach() {
		return baseAttach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAttach(BaseRole newBaseAttach) {
		BaseRole oldBaseAttach = baseAttach;
		baseAttach = newBaseAttach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__BASE_ATTACH, oldBaseAttach, baseAttach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRole getCrosscuttingAttach() {
		if (crosscuttingAttach != null && crosscuttingAttach.eIsProxy()) {
			InternalEObject oldCrosscuttingAttach = (InternalEObject)crosscuttingAttach;
			crosscuttingAttach = (CrosscuttingRole)eResolveProxy(oldCrosscuttingAttach);
			if (crosscuttingAttach != oldCrosscuttingAttach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.GLUE__CROSSCUTTING_ATTACH, oldCrosscuttingAttach, crosscuttingAttach));
			}
		}
		return crosscuttingAttach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRole basicGetCrosscuttingAttach() {
		return crosscuttingAttach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrosscuttingAttach(CrosscuttingRole newCrosscuttingAttach) {
		CrosscuttingRole oldCrosscuttingAttach = crosscuttingAttach;
		crosscuttingAttach = newCrosscuttingAttach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__CROSSCUTTING_ATTACH, oldCrosscuttingAttach, crosscuttingAttach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueType getGlueType() {
		return glueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueType(GlueType newGlueType) {
		GlueType oldGlueType = glueType;
		glueType = newGlueType == null ? GLUE_TYPE_EDEFAULT : newGlueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__GLUE_TYPE, oldGlueType, glueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (eContainerFeatureID() != AspectualacmePackage.GLUE__CONNECTOR) return null;
		return (Connector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnector, AspectualacmePackage.GLUE__CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.GLUE__CONNECTOR && newConnector != null)) {
			if (EcoreUtil.isAncestor(this, newConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, AspectualacmePackage.CONNECTOR__GLUE, Connector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.GLUE__CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnector((Connector)otherEnd, msgs);
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
			case AspectualacmePackage.GLUE__CONNECTOR:
				return basicSetConnector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AspectualacmePackage.GLUE__CONNECTOR:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.CONNECTOR__GLUE, Connector.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.GLUE__BASE_ATTACH:
				if (resolve) return getBaseAttach();
				return basicGetBaseAttach();
			case AspectualacmePackage.GLUE__CROSSCUTTING_ATTACH:
				if (resolve) return getCrosscuttingAttach();
				return basicGetCrosscuttingAttach();
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				return getGlueType();
			case AspectualacmePackage.GLUE__CONNECTOR:
				return getConnector();
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
			case AspectualacmePackage.GLUE__BASE_ATTACH:
				setBaseAttach((BaseRole)newValue);
				return;
			case AspectualacmePackage.GLUE__CROSSCUTTING_ATTACH:
				setCrosscuttingAttach((CrosscuttingRole)newValue);
				return;
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				setGlueType((GlueType)newValue);
				return;
			case AspectualacmePackage.GLUE__CONNECTOR:
				setConnector((Connector)newValue);
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
			case AspectualacmePackage.GLUE__BASE_ATTACH:
				setBaseAttach((BaseRole)null);
				return;
			case AspectualacmePackage.GLUE__CROSSCUTTING_ATTACH:
				setCrosscuttingAttach((CrosscuttingRole)null);
				return;
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				setGlueType(GLUE_TYPE_EDEFAULT);
				return;
			case AspectualacmePackage.GLUE__CONNECTOR:
				setConnector((Connector)null);
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
			case AspectualacmePackage.GLUE__BASE_ATTACH:
				return baseAttach != null;
			case AspectualacmePackage.GLUE__CROSSCUTTING_ATTACH:
				return crosscuttingAttach != null;
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				return glueType != GLUE_TYPE_EDEFAULT;
			case AspectualacmePackage.GLUE__CONNECTOR:
				return getConnector() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (glueType: ");
		result.append(glueType);
		result.append(')');
		return result.toString();
	}

} //GlueImpl
