/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.AttachmentDeclaration;
import aspectualacme.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.AttachmentDeclarationImpl#getAttachedBaseElement <em>Attached Base Element</em>}</li>
 *   <li>{@link aspectualacme.impl.AttachmentDeclarationImpl#getAttachedToElement <em>Attached To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachmentDeclarationImpl extends EObjectImpl implements AttachmentDeclaration {
	/**
	 * The default value of the '{@link #getAttachedBaseElement() <em>Attached Base Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedBaseElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHED_BASE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachedBaseElement() <em>Attached Base Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedBaseElement()
	 * @generated
	 * @ordered
	 */
	protected String attachedBaseElement = ATTACHED_BASE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachedToElement() <em>Attached To Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedToElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHED_TO_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachedToElement() <em>Attached To Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedToElement()
	 * @generated
	 * @ordered
	 */
	protected String attachedToElement = ATTACHED_TO_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ATTACHMENT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachedBaseElement() {
		return attachedBaseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedBaseElement(String newAttachedBaseElement) {
		String oldAttachedBaseElement = attachedBaseElement;
		attachedBaseElement = newAttachedBaseElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT, oldAttachedBaseElement, attachedBaseElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachedToElement() {
		return attachedToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedToElement(String newAttachedToElement) {
		String oldAttachedToElement = attachedToElement;
		attachedToElement = newAttachedToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT, oldAttachedToElement, attachedToElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment attach(Element baseElement, Element toElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT:
				return getAttachedBaseElement();
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT:
				return getAttachedToElement();
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
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT:
				setAttachedBaseElement((String)newValue);
				return;
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT:
				setAttachedToElement((String)newValue);
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
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT:
				setAttachedBaseElement(ATTACHED_BASE_ELEMENT_EDEFAULT);
				return;
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT:
				setAttachedToElement(ATTACHED_TO_ELEMENT_EDEFAULT);
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
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_BASE_ELEMENT:
				return ATTACHED_BASE_ELEMENT_EDEFAULT == null ? attachedBaseElement != null : !ATTACHED_BASE_ELEMENT_EDEFAULT.equals(attachedBaseElement);
			case AspectualacmePackage.ATTACHMENT_DECLARATION__ATTACHED_TO_ELEMENT:
				return ATTACHED_TO_ELEMENT_EDEFAULT == null ? attachedToElement != null : !ATTACHED_TO_ELEMENT_EDEFAULT.equals(attachedToElement);
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
		result.append(" (attachedBaseElement: ");
		result.append(attachedBaseElement);
		result.append(", attachedToElement: ");
		result.append(attachedToElement);
		result.append(')');
		return result.toString();
	}

} //AttachmentDeclarationImpl
