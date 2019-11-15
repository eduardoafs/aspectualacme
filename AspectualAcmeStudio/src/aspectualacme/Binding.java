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
 *   <li>{@link aspectualacme.Binding#getProperty <em>Property</em>}</li>
 *   <li>{@link aspectualacme.Binding#getFirstPort <em>First Port</em>}</li>
 *   <li>{@link aspectualacme.Binding#getSecondPort <em>Second Port</em>}</li>
 *   <li>{@link aspectualacme.Binding#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getBinding_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>First Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Port</em>' reference.
	 * @see #setFirstPort(BindableElement)
	 * @see aspectualacme.AspectualacmePackage#getBinding_FirstPort()
	 * @model keys="name" required="true"
	 * @generated
	 */
	BindableElement getFirstPort();

	/**
	 * Sets the value of the '{@link aspectualacme.Binding#getFirstPort <em>First Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Port</em>' reference.
	 * @see #getFirstPort()
	 * @generated
	 */
	void setFirstPort(BindableElement value);

	/**
	 * Returns the value of the '<em><b>Second Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Port</em>' reference.
	 * @see #setSecondPort(BindableElement)
	 * @see aspectualacme.AspectualacmePackage#getBinding_SecondPort()
	 * @model keys="name" required="true"
	 * @generated
	 */
	BindableElement getSecondPort();

	/**
	 * Sets the value of the '{@link aspectualacme.Binding#getSecondPort <em>Second Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Port</em>' reference.
	 * @see #getSecondPort()
	 * @generated
	 */
	void setSecondPort(BindableElement value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Representation#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' container reference.
	 * @see #setRepresentation(Representation)
	 * @see aspectualacme.AspectualacmePackage#getBinding_Representation()
	 * @see aspectualacme.Representation#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	Representation getRepresentation();

	/**
	 * Sets the value of the '{@link aspectualacme.Binding#getRepresentation <em>Representation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' container reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(Representation value);

} // Binding
