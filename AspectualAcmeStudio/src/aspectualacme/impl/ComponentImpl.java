/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.BasicElement;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Port;

import aspectualacme.Property;
import aspectualacme.Representation;
import java.util.Collection;

import javax.annotation.Generated;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link aspectualacme.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link aspectualacme.impl.ComponentImpl#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link aspectualacme.impl.ComponentImpl#getParentFamily <em>Parent Family</em>}</li>
 *   <li>{@link aspectualacme.impl.ComponentImpl#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends ElementImpl implements Component {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> type;

	/**
	 * The cached value of the '{@link #getEffective_type() <em>Effective type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffective_type()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> effective_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentWithInverseEList<Port>(Port.class, this, AspectualacmePackage.COMPONENT__PORT, AspectualacmePackage.PORT__COMPONENT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<ComponentType>(ComponentType.class, this, AspectualacmePackage.COMPONENT__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aspectualacme.System getParentSystem() {
		if (eContainerFeatureID() != AspectualacmePackage.COMPONENT__PARENT_SYSTEM) return null;
		return (aspectualacme.System)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSystem(aspectualacme.System newParentSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSystem, AspectualacmePackage.COMPONENT__PARENT_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSystem(aspectualacme.System newParentSystem) {
		if (newParentSystem != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.COMPONENT__PARENT_SYSTEM && newParentSystem != null)) {
			if (EcoreUtil.isAncestor(this, newParentSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSystem != null)
				msgs = ((InternalEObject)newParentSystem).eInverseAdd(this, AspectualacmePackage.SYSTEM__COMPONENTS, aspectualacme.System.class, msgs);
			msgs = basicSetParentSystem(newParentSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.COMPONENT__PARENT_SYSTEM, newParentSystem, newParentSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getParentFamily() {
		if (eContainerFeatureID() != AspectualacmePackage.COMPONENT__PARENT_FAMILY) return null;
		return (Family)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFamily(Family newParentFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFamily, AspectualacmePackage.COMPONENT__PARENT_FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFamily(Family newParentFamily) {
		if (newParentFamily != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.COMPONENT__PARENT_FAMILY && newParentFamily != null)) {
			if (EcoreUtil.isAncestor(this, newParentFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFamily != null)
				msgs = ((InternalEObject)newParentFamily).eInverseAdd(this, AspectualacmePackage.FAMILY__COMPONENTS, Family.class, msgs);
			msgs = basicSetParentFamily(newParentFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.COMPONENT__PARENT_FAMILY, newParentFamily, newParentFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getEffective_type() {
		if (effective_type == null) {
			effective_type = new EObjectResolvingEList<ComponentType>(ComponentType.class, this, AspectualacmePackage.COMPONENT__EFFECTIVE_TYPE);
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
			case AspectualacmePackage.COMPONENT__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSystem((aspectualacme.System)otherEnd, msgs);
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				return basicSetParentSystem(null, msgs);
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
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
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.SYSTEM__COMPONENTS, aspectualacme.System.class, msgs);
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.FAMILY__COMPONENTS, Family.class, msgs);
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
			case AspectualacmePackage.COMPONENT__PORT:
				return getPort();
			case AspectualacmePackage.COMPONENT__TYPE:
				return getType();
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				return getParentSystem();
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
				return getParentFamily();
			case AspectualacmePackage.COMPONENT__EFFECTIVE_TYPE:
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
			case AspectualacmePackage.COMPONENT__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case AspectualacmePackage.COMPONENT__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				setParentSystem((aspectualacme.System)newValue);
				return;
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
				setParentFamily((Family)newValue);
				return;
			case AspectualacmePackage.COMPONENT__EFFECTIVE_TYPE:
				getEffective_type().clear();
				getEffective_type().addAll((Collection<? extends ComponentType>)newValue);
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
			case AspectualacmePackage.COMPONENT__PORT:
				getPort().clear();
				return;
			case AspectualacmePackage.COMPONENT__TYPE:
				getType().clear();
				return;
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				setParentSystem((aspectualacme.System)null);
				return;
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
				setParentFamily((Family)null);
				return;
			case AspectualacmePackage.COMPONENT__EFFECTIVE_TYPE:
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
			case AspectualacmePackage.COMPONENT__PORT:
				return port != null && !port.isEmpty();
			case AspectualacmePackage.COMPONENT__TYPE:
				return type != null && !type.isEmpty();
			case AspectualacmePackage.COMPONENT__PARENT_SYSTEM:
				return getParentSystem() != null;
			case AspectualacmePackage.COMPONENT__PARENT_FAMILY:
				return getParentFamily() != null;
			case AspectualacmePackage.COMPONENT__EFFECTIVE_TYPE:
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
	public EList<Port> allPorts() {
		EList<Port> ports = new BasicEList<aspectualacme.Port>();

		ports.addAll(this.getPort());
		for (ComponentType ctype : this.type) {
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
					newp.setComponent(this);
					newp.setName(p.getName());
					ports.add(newp); 
				}
				
				/*System.out.println(p + " " + p.getComponent()+ " ");
				System.out.println(newp + " " + newp.getComponent());*/
			}
		}
		return ports;
	}

} //ComponentImpl
