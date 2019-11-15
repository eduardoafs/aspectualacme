/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.attachableElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.AttachmentImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link aspectualacme.impl.AttachmentImpl#getSecondElement <em>Second Element</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.ATTACHMENT__FIRST_ELEMENT:
				if (resolve) return getFirstElement();
				return basicGetFirstElement();
			case AspectualacmePackage.ATTACHMENT__SECOND_ELEMENT:
				if (resolve) return getSecondElement();
				return basicGetSecondElement();
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
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
