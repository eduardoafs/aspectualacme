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

} // Attachment
