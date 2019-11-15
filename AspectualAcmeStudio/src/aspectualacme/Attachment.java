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
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Attachment#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link aspectualacme.Attachment#getSecondElement <em>Second Element</em>}</li>
 *   <li>{@link aspectualacme.Attachment#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link aspectualacme.Attachment#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends EObject {
	/**
	 * Returns the value of the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Element</em>' reference.
	 * @see #setFirstElement(attachableElement)
	 * @see aspectualacme.AspectualacmePackage#getAttachment_FirstElement()
	 * @model keys="name" required="true"
	 * @generated
	 */
	attachableElement getFirstElement();

	/**
	 * Sets the value of the '{@link aspectualacme.Attachment#getFirstElement <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Element</em>' reference.
	 * @see #getFirstElement()
	 * @generated
	 */
	void setFirstElement(attachableElement value);

	/**
	 * Returns the value of the '<em><b>Second Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Element</em>' reference.
	 * @see #setSecondElement(attachableElement)
	 * @see aspectualacme.AspectualacmePackage#getAttachment_SecondElement()
	 * @model keys="name" required="true"
	 * @generated
	 */
	attachableElement getSecondElement();

	/**
	 * Sets the value of the '{@link aspectualacme.Attachment#getSecondElement <em>Second Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Element</em>' reference.
	 * @see #getSecondElement()
	 * @generated
	 */
	void setSecondElement(attachableElement value);

	/**
	 * Returns the value of the '<em><b>Parent System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.System#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent System</em>' container reference.
	 * @see #setParentSystem(aspectualacme.System)
	 * @see aspectualacme.AspectualacmePackage#getAttachment_ParentSystem()
	 * @see aspectualacme.System#getAttachments
	 * @model opposite="attachments" unsettable="true" transient="false"
	 * @generated
	 */
	aspectualacme.System getParentSystem();

	/**
	 * Sets the value of the '{@link aspectualacme.Attachment#getParentSystem <em>Parent System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent System</em>' container reference.
	 * @see #getParentSystem()
	 * @generated
	 */
	void setParentSystem(aspectualacme.System value);

	/**
	 * Returns the value of the '<em><b>Parent Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Family#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Family</em>' container reference.
	 * @see #setParentFamily(Family)
	 * @see aspectualacme.AspectualacmePackage#getAttachment_ParentFamily()
	 * @see aspectualacme.Family#getAttachments
	 * @model opposite="attachments" transient="false"
	 * @generated
	 */
	Family getParentFamily();

	/**
	 * Sets the value of the '{@link aspectualacme.Attachment#getParentFamily <em>Parent Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Family</em>' container reference.
	 * @see #getParentFamily()
	 * @generated
	 */
	void setParentFamily(Family value);

} // Attachment
