/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.Family;
import aspectualacme.attachableElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.AttachmentImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link aspectualacme.impl.AttachmentImpl#getSecondElement <em>Second Element</em>}</li>
 *   <li>{@link aspectualacme.impl.AttachmentImpl#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link aspectualacme.impl.AttachmentImpl#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachmentImpl extends EObjectImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstElement()
	 * @generated
	 * @ordered
	 */
	protected attachableElement firstElement;

	/**
	 * The cached value of the '{@link #getSecondElement() <em>Second Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondElement()
	 * @generated
	 * @ordered
	 */
	protected attachableElement secondElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachableElement getFirstElement() {
		if (firstElement != null && firstElement.eIsProxy()) {
			InternalEObject oldFirstElement = (InternalEObject)firstElement;
			firstElement = (attachableElement)eResolveProxy(oldFirstElement);
			if (firstElement != oldFirstElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT, oldFirstElement, firstElement));
			}
		}
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachableElement basicGetFirstElement() {
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstElement(attachableElement newFirstElement) {
		attachableElement oldFirstElement = firstElement;
		firstElement = newFirstElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT, oldFirstElement, firstElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachableElement getSecondElement() {
		if (secondElement != null && secondElement.eIsProxy()) {
			InternalEObject oldSecondElement = (InternalEObject)secondElement;
			secondElement = (attachableElement)eResolveProxy(oldSecondElement);
			if (secondElement != oldSecondElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT, oldSecondElement, secondElement));
			}
		}
		return secondElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachableElement basicGetSecondElement() {
		return secondElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondElement(attachableElement newSecondElement) {
		attachableElement oldSecondElement = secondElement;
		secondElement = newSecondElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT, oldSecondElement, secondElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public aspectualacme.System getParentSystem() {
		if (eContainerFeatureID() != AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM) return null;
		return (aspectualacme.System)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSystem(aspectualacme.System newParentSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSystem, AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSystem(aspectualacme.System newParentSystem) {
		if (newParentSystem != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM && newParentSystem != null)) {
			if (EcoreUtil.isAncestor(this, newParentSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSystem != null)
				msgs = ((InternalEObject)newParentSystem).eInverseAdd(this, AspectualacmePackage.SYSTEM__ATTACHMENTS, aspectualacme.System.class, msgs);
			msgs = basicSetParentSystem(newParentSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM, newParentSystem, newParentSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getParentFamily() {
		if (eContainerFeatureID() != AspectualacmePackage.ATTACHMENT__PARENT_FAMILY) return null;
		return (Family)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFamily(Family newParentFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFamily, AspectualacmePackage.ATTACHMENT__PARENT_FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFamily(Family newParentFamily) {
		if (newParentFamily != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.ATTACHMENT__PARENT_FAMILY && newParentFamily != null)) {
			if (EcoreUtil.isAncestor(this, newParentFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFamily != null)
				msgs = ((InternalEObject)newParentFamily).eInverseAdd(this, AspectualacmePackage.FAMILY__ATTACHMENTS, Family.class, msgs);
			msgs = basicSetParentFamily(newParentFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ATTACHMENT__PARENT_FAMILY, newParentFamily, newParentFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSystem((aspectualacme.System)otherEnd, msgs);
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
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
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				return basicSetParentSystem(null, msgs);
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
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
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.SYSTEM__ATTACHMENTS, aspectualacme.System.class, msgs);
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.FAMILY__ATTACHMENTS, Family.class, msgs);
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
			case AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT:
				if (resolve) return getFirstElement();
				return basicGetFirstElement();
			case AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT:
				if (resolve) return getSecondElement();
				return basicGetSecondElement();
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				return getParentSystem();
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
				return getParentFamily();
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
			case AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT:
				setFirstElement((attachableElement)newValue);
				return;
			case AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT:
				setSecondElement((attachableElement)newValue);
				return;
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				setParentSystem((aspectualacme.System)newValue);
				return;
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
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
			case AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT:
				setFirstElement((attachableElement)null);
				return;
			case AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT:
				setSecondElement((attachableElement)null);
				return;
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				setParentSystem((aspectualacme.System)null);
				return;
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
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
			case AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT:
				return firstElement != null;
			case AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT:
				return secondElement != null;
			case AspectualacmePackage.ATTACHMENT__PARENT_SYSTEM:
				return getParentSystem() != null;
			case AspectualacmePackage.ATTACHMENT__PARENT_FAMILY:
				return getParentFamily() != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
