/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.ConnectorType;

import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Glue;
import aspectualacme.Property;
import aspectualacme.Representation;
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
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link aspectualacme.impl.ConnectorTypeImpl#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeImpl extends TypeDefinitionImpl implements ConnectorType {
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
			role = new EObjectContainmentWithInverseEList<Role>(Role.class, this, AspectualacmePackage.CONNECTOR_TYPE__ROLE, AspectualacmePackage.ROLE__CONNECTOR_T);
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
	public Family getParentFamily() {
		if (eContainerFeatureID() != AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY) return null;
		return (Family)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFamily(Family newParentFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFamily, AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFamily(Family newParentFamily) {
		if (newParentFamily != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY && newParentFamily != null)) {
			if (EcoreUtil.isAncestor(this, newParentFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFamily != null)
				msgs = ((InternalEObject)newParentFamily).eInverseAdd(this, AspectualacmePackage.FAMILY__CNTYPES, Family.class, msgs);
			msgs = basicSetParentFamily(newParentFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY, newParentFamily, newParentFamily));
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
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				return ((InternalEList<?>)getGlue()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.FAMILY__CNTYPES, Family.class, msgs);
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
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_TYPE:
				return getParentType();
			case AspectualacmePackage.CONNECTOR_TYPE__ROLE:
				return getRole();
			case AspectualacmePackage.CONNECTOR_TYPE__GLUE:
				return getGlue();
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
				return getParentFamily();
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
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
				setParentFamily((Family)newValue);
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
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
				setParentFamily((Family)null);
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
			case AspectualacmePackage.CONNECTOR_TYPE__PARENT_FAMILY:
				return getParentFamily() != null;
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
		for (ConnectorType ctype : this.parentType) {
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
					newp.setConnectorT(this);
					newp.setName(p.getName());
					roles.add(newp); 
				}
				
				/*System.out.println(p + " " + p.getComponent()+ " ");
				System.out.println(newp + " " + newp.getComponent());*/
			}
		}
		return roles;
	}
} //ConnectorTypeImpl
