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
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Representation#getName <em>Name</em>}</li>
 *   <li>{@link aspectualacme.Representation#getSystem <em>System</em>}</li>
 *   <li>{@link aspectualacme.Representation#getBindings <em>Bindings</em>}</li>
 *   <li>{@link aspectualacme.Representation#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getRepresentation()
 * @model
 * @generated
 */
public interface Representation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aspectualacme.AspectualacmePackage#getRepresentation_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aspectualacme.Representation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.System#getParentRepresentation <em>Parent Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(aspectualacme.System)
	 * @see aspectualacme.AspectualacmePackage#getRepresentation_System()
	 * @see aspectualacme.System#getParentRepresentation
	 * @model opposite="parentRepresentation" containment="true" required="true"
	 * @generated
	 */
	aspectualacme.System getSystem();

	/**
	 * Sets the value of the '{@link aspectualacme.Representation#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(aspectualacme.System value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getRepresentation_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Element#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(Element)
	 * @see aspectualacme.AspectualacmePackage#getRepresentation_Element()
	 * @see aspectualacme.Element#getRepresentations
	 * @model opposite="representations" keys="name" required="true" transient="false"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link aspectualacme.Representation#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

} // Representation
