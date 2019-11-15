/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.AttachmentDeclaration#getAttachedBaseElement <em>Attached Base Element</em>}</li>
 *   <li>{@link aspectualacme.AttachmentDeclaration#getAttachedToElement <em>Attached To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getAttachmentDeclaration()
 * @model
 * @generated
 */
public interface AttachmentDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Attached Base Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached Base Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Base Element</em>' attribute.
	 * @see #setAttachedBaseElement(String)
	 * @see aspectualacme.AspectualacmePackage#getAttachmentDeclaration_AttachedBaseElement()
	 * @model
	 * @generated
	 */
	String getAttachedBaseElement();

	/**
	 * Sets the value of the '{@link aspectualacme.AttachmentDeclaration#getAttachedBaseElement <em>Attached Base Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Base Element</em>' attribute.
	 * @see #getAttachedBaseElement()
	 * @generated
	 */
	void setAttachedBaseElement(String value);

	/**
	 * Returns the value of the '<em><b>Attached To Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached To Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To Element</em>' attribute.
	 * @see #setAttachedToElement(String)
	 * @see aspectualacme.AspectualacmePackage#getAttachmentDeclaration_AttachedToElement()
	 * @model
	 * @generated
	 */
	String getAttachedToElement();

	/**
	 * Sets the value of the '{@link aspectualacme.AttachmentDeclaration#getAttachedToElement <em>Attached To Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached To Element</em>' attribute.
	 * @see #getAttachedToElement()
	 * @generated
	 */
	void setAttachedToElement(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model baseElementRequired="true" toElementRequired="true"
	 * @generated
	 */
	Attachment attach(Element baseElement, Element toElement);

} // AttachmentDeclaration
