/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Binding#getExternalElement <em>External Element</em>}</li>
 *   <li>{@link aspectualacme.Binding#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link aspectualacme.Binding#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>External Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Element</em>' reference.
	 * @see #setExternalElement(Element)
	 * @see aspectualacme.AspectualacmePackage#getBinding_ExternalElement()
	 * @model required="true"
	 * @generated
	 */
	Element getExternalElement();

	/**
	 * Sets the value of the '{@link aspectualacme.Binding#getExternalElement <em>External Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Element</em>' reference.
	 * @see #getExternalElement()
	 * @generated
	 */
	void setExternalElement(Element value);

	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Element</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getBinding_InternalElement()
	 * @model
	 * @generated
	 */
	EList<Element> getInternalElement();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getBinding_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

} // Binding
