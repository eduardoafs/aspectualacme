/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.Family;
import aspectualacme.Property;
import aspectualacme.Representation;
import aspectualacme.WildCard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.SystemImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link aspectualacme.impl.SystemImpl#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link aspectualacme.impl.SystemImpl#getWildCard <em>Wild Card</em>}</li>
 *   <li>{@link aspectualacme.impl.SystemImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link aspectualacme.impl.SystemImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link aspectualacme.impl.SystemImpl#getParentRepresentation <em>Parent Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends BasicElementImpl implements aspectualacme.System {
	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;
	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachments;
	/**
	 * The cached value of the '{@link #getWildCard() <em>Wild Card</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWildCard()
	 * @generated
	 * @ordered
	 */
	protected EList<WildCard> wildCard;
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, AspectualacmePackage.SYSTEM__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachments() {
		if (attachments == null) {
			attachments = new EObjectContainmentEList<Attachment>(Attachment.class, this, AspectualacmePackage.SYSTEM__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WildCard> getWildCard() {
		if (wildCard == null) {
			wildCard = new EObjectContainmentEList<WildCard>(WildCard.class, this, AspectualacmePackage.SYSTEM__WILD_CARD);
		}
		return wildCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, AspectualacmePackage.SYSTEM__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList<Component>(Component.class, this, AspectualacmePackage.SYSTEM__COMPONENTS, AspectualacmePackage.COMPONENT__PARENT_SYSTEM);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getParentRepresentation() {
		if (eContainerFeatureID() != AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION) return null;
		return (Representation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRepresentation(Representation newParentRepresentation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRepresentation, AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRepresentation(Representation newParentRepresentation) {
		if (newParentRepresentation != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION && newParentRepresentation != null)) {
			if (EcoreUtil.isAncestor(this, newParentRepresentation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRepresentation != null)
				msgs = ((InternalEObject)newParentRepresentation).eInverseAdd(this, AspectualacmePackage.REPRESENTATION__SYSTEM, Representation.class, msgs);
			msgs = basicSetParentRepresentation(newParentRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION, newParentRepresentation, newParentRepresentation));
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
			case AspectualacmePackage.SYSTEM__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRepresentation((Representation)otherEnd, msgs);
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
			case AspectualacmePackage.SYSTEM__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.SYSTEM__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.SYSTEM__WILD_CARD:
				return ((InternalEList<?>)getWildCard()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.SYSTEM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.SYSTEM__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				return basicSetParentRepresentation(null, msgs);
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
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.REPRESENTATION__SYSTEM, Representation.class, msgs);
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
			case AspectualacmePackage.SYSTEM__CONNECTORS:
				return getConnectors();
			case AspectualacmePackage.SYSTEM__ATTACHMENTS:
				return getAttachments();
			case AspectualacmePackage.SYSTEM__WILD_CARD:
				return getWildCard();
			case AspectualacmePackage.SYSTEM__PROPERTIES:
				return getProperties();
			case AspectualacmePackage.SYSTEM__COMPONENTS:
				return getComponents();
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				return getParentRepresentation();
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
			case AspectualacmePackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case AspectualacmePackage.SYSTEM__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case AspectualacmePackage.SYSTEM__WILD_CARD:
				getWildCard().clear();
				getWildCard().addAll((Collection<? extends WildCard>)newValue);
				return;
			case AspectualacmePackage.SYSTEM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case AspectualacmePackage.SYSTEM__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				setParentRepresentation((Representation)newValue);
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
			case AspectualacmePackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				return;
			case AspectualacmePackage.SYSTEM__ATTACHMENTS:
				getAttachments().clear();
				return;
			case AspectualacmePackage.SYSTEM__WILD_CARD:
				getWildCard().clear();
				return;
			case AspectualacmePackage.SYSTEM__PROPERTIES:
				getProperties().clear();
				return;
			case AspectualacmePackage.SYSTEM__COMPONENTS:
				getComponents().clear();
				return;
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				setParentRepresentation((Representation)null);
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
			case AspectualacmePackage.SYSTEM__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case AspectualacmePackage.SYSTEM__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case AspectualacmePackage.SYSTEM__WILD_CARD:
				return wildCard != null && !wildCard.isEmpty();
			case AspectualacmePackage.SYSTEM__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case AspectualacmePackage.SYSTEM__COMPONENTS:
				return components != null && !components.isEmpty();
			case AspectualacmePackage.SYSTEM__PARENT_REPRESENTATION:
				return getParentRepresentation() != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
