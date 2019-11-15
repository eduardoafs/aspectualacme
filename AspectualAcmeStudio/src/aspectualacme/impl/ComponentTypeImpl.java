/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.ComponentType;

import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Port;
import aspectualacme.Property;
import aspectualacme.Representation;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ComponentTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link aspectualacme.impl.ComponentTypeImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link aspectualacme.impl.ComponentTypeImpl#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends TypeDefinitionImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;
	/**
	 * The cached value of the '{@link #getParentType() <em>Parent Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentType()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> parentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentWithInverseEList<Port>(Port.class, this, AspectualacmePackage.COMPONENT_TYPE__PORT, AspectualacmePackage.PORT__COMPONENT_T);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getParentType() {
		if (parentType == null) {
			parentType = new EObjectResolvingEList<ComponentType>(ComponentType.class, this, AspectualacmePackage.COMPONENT_TYPE__PARENT_TYPE);
		}
		return parentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getParentFamily() {
		if (eContainerFeatureID() != AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY) return null;
		return (Family)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFamily(Family newParentFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFamily, AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFamily(Family newParentFamily) {
		if (newParentFamily != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY && newParentFamily != null)) {
			if (EcoreUtil.isAncestor(this, newParentFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFamily != null)
				msgs = ((InternalEObject)newParentFamily).eInverseAdd(this, AspectualacmePackage.FAMILY__CTYPES, Family.class, msgs);
			msgs = basicSetParentFamily(newParentFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY, newParentFamily, newParentFamily));
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
			case AspectualacmePackage.COMPONENT_TYPE__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.FAMILY__CTYPES, Family.class, msgs);
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
			case AspectualacmePackage.COMPONENT_TYPE__PORT:
				return getPort();
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_TYPE:
				return getParentType();
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_TYPE:
				getParentType().clear();
				getParentType().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT_TYPE__PORT:
				getPort().clear();
				return;
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_TYPE:
				getParentType().clear();
				return;
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT_TYPE__PORT:
				return port != null && !port.isEmpty();
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_TYPE:
				return parentType != null && !parentType.isEmpty();
			case AspectualacmePackage.COMPONENT_TYPE__PARENT_FAMILY:
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
	public EList<Port> allPorts() {
		EList<Port> ports = new BasicEList<aspectualacme.Port>();

		ports.addAll(this.getPort());
		for (ComponentType ctype : this.parentType) {
			for (Port p : ctype.getPort()) {
				boolean control = false;
				for (aspectualacme.Port pzin : ports) {
					if (pzin.getName().compareTo(p.getName())==0) {
						control = true;
						break;
					}
				}
				if (!control) { 
					Port newp = new PortImpl();
					newp.setComponentT(this);
					newp.setName(p.getName());
					ports.add(newp); 
				}
				
				/*System.out.println(p + " " + p.getComponent()+ " ");
				System.out.println(newp + " " + newp.getComponent());*/
			}
		}
		return ports;
	}
} //ComponentTypeImpl
