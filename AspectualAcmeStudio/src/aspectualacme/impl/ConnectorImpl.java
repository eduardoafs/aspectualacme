/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Glue;
import aspectualacme.Property;
import aspectualacme.Representation;
import aspectualacme.Port;
import aspectualacme.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link aspectualacme.impl.ConnectorImpl#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorImpl#getParentFamily <em>Parent Family</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorImpl#getEffective_type <em>Effective type</em>}</li>
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
	 * The cached value of the '{@link #getEffective_type() <em>Effective type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffective_type()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> effective_type;

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
	public aspectualacme.System getParentSystem() {
		if (eContainerFeatureID() != AspectualacmePackage.CONNECTOR__PARENT_SYSTEM) return null;
		return (aspectualacme.System)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSystem(aspectualacme.System newParentSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSystem, AspectualacmePackage.CONNECTOR__PARENT_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSystem(aspectualacme.System newParentSystem) {
		if (newParentSystem != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.CONNECTOR__PARENT_SYSTEM && newParentSystem != null)) {
			if (EcoreUtil.isAncestor(this, newParentSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSystem != null)
				msgs = ((InternalEObject)newParentSystem).eInverseAdd(this, AspectualacmePackage.SYSTEM__CONNECTORS, aspectualacme.System.class, msgs);
			msgs = basicSetParentSystem(newParentSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.CONNECTOR__PARENT_SYSTEM, newParentSystem, newParentSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getParentFamily() {
		if (eContainerFeatureID() != AspectualacmePackage.CONNECTOR__PARENT_FAMILY) return null;
		return (Family)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFamily(Family newParentFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFamily, AspectualacmePackage.CONNECTOR__PARENT_FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFamily(Family newParentFamily) {
		if (newParentFamily != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.CONNECTOR__PARENT_FAMILY && newParentFamily != null)) {
			if (EcoreUtil.isAncestor(this, newParentFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFamily != null)
				msgs = ((InternalEObject)newParentFamily).eInverseAdd(this, AspectualacmePackage.FAMILY__CONNECTORS, Family.class, msgs);
			msgs = basicSetParentFamily(newParentFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.CONNECTOR__PARENT_FAMILY, newParentFamily, newParentFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getEffective_type() {
		if (effective_type == null) {
			effective_type = new EObjectResolvingEList<ConnectorType>(ConnectorType.class, this, AspectualacmePackage.CONNECTOR__EFFECTIVE_TYPE);
		}
		return effective_type;
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
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSystem((aspectualacme.System)otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFamily((Family)otherEnd, msgs);
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
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				return basicSetParentSystem(null, msgs);
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				return basicSetParentFamily(null, msgs);
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
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.SYSTEM__CONNECTORS, aspectualacme.System.class, msgs);
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.FAMILY__CONNECTORS, Family.class, msgs);
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
			case AspectualacmePackage.CONNECTOR__ROLE:
				return getRole();
			case AspectualacmePackage.CONNECTOR__GLUE:
				return getGlue();
			case AspectualacmePackage.CONNECTOR__TYPE:
				return getType();
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				return getParentSystem();
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				return getParentFamily();
			case AspectualacmePackage.CONNECTOR__EFFECTIVE_TYPE:
				return getEffective_type();
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
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				setParentSystem((aspectualacme.System)newValue);
				return;
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				setParentFamily((Family)newValue);
				return;
			case AspectualacmePackage.CONNECTOR__EFFECTIVE_TYPE:
				getEffective_type().clear();
				getEffective_type().addAll((Collection<? extends ConnectorType>)newValue);
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
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				setParentSystem((aspectualacme.System)null);
				return;
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				setParentFamily((Family)null);
				return;
			case AspectualacmePackage.CONNECTOR__EFFECTIVE_TYPE:
				getEffective_type().clear();
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
			case AspectualacmePackage.CONNECTOR__PARENT_SYSTEM:
				return getParentSystem() != null;
			case AspectualacmePackage.CONNECTOR__PARENT_FAMILY:
				return getParentFamily() != null;
			case AspectualacmePackage.CONNECTOR__EFFECTIVE_TYPE:
				return effective_type != null && !effective_type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Role> allRoles() {
		EList<Role> roles = new BasicEList<aspectualacme.Role>();

		roles.addAll(this.getRole());
		for (ConnectorType ctype : this.type) {
			for (Role p : ctype.getRole()) {
				boolean control = false;
				for (aspectualacme.Role pzin : roles) {
					if (pzin.getName().compareTo(p.getName())==0) {
						control = true;
						break;
					}
				}
				if (!control) { 
					Role newp = new RoleImpl();
					newp.setConnector(this);
					newp.setName(p.getName());
					roles.add(newp); 
				}
				
				/*System.out.println(p + " " + p.getComponent()+ " ");
				System.out.println(newp + " " + newp.getComponent());*/
			}
		}
		return roles;
	}

} //ConnectorImpl
