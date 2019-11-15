/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.BasicElement#getArmani <em>Armani</em>}</li>
 *   <li>{@link aspectualacme.BasicElement#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getBasicElement()
 * @model abstract="true"
 * @generated
 */
public interface BasicElement extends Element {
	/**
	 * Returns the value of the '<em><b>Armani</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Armani}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armani</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armani</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getBasicElement_Armani()
	 * @model containment="true"
	 * @generated
	 */
	EList<Armani> getArmani();

	/**
	 * Returns the value of the '<em><b>Parent Family</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Family</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Family</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getBasicElement_ParentFamily()
	 * @model
	 * @generated
	 */
	EList<Family> getParentFamily();

} // BasicElement
