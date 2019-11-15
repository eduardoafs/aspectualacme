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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Component#getPort <em>Port</em>}</li>
 *   <li>{@link aspectualacme.Component#getType <em>Type</em>}</li>
 *   <li>{@link aspectualacme.Component#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link aspectualacme.Component#getParentFamily <em>Parent Family</em>}</li>
 *   <li>{@link aspectualacme.Component#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Element {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Port}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getComponent_Port()
	 * @see aspectualacme.Port#getComponent
	 * @model opposite="Component" containment="true" keys="name"
	 * @generated
	 */
	EList<Port> getPort();
	EList<Port> allPorts();
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getComponent_Type()
	 * @model keys="name"
	 * @generated
	 */
	EList<ComponentType> getType();

	/**
	 * Returns the value of the '<em><b>Parent System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.System#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent System</em>' container reference.
	 * @see #setParentSystem(aspectualacme.System)
	 * @see aspectualacme.AspectualacmePackage#getComponent_ParentSystem()
	 * @see aspectualacme.System#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	aspectualacme.System getParentSystem();

	/**
	 * Sets the value of the '{@link aspectualacme.Component#getParentSystem <em>Parent System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent System</em>' container reference.
	 * @see #getParentSystem()
	 * @generated
	 */
	void setParentSystem(aspectualacme.System value);

	/**
	 * Returns the value of the '<em><b>Parent Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Family#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Family</em>' container reference.
	 * @see #setParentFamily(Family)
	 * @see aspectualacme.AspectualacmePackage#getComponent_ParentFamily()
	 * @see aspectualacme.Family#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	Family getParentFamily();

	/**
	 * Sets the value of the '{@link aspectualacme.Component#getParentFamily <em>Parent Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Family</em>' container reference.
	 * @see #getParentFamily()
	 * @generated
	 */
	void setParentFamily(Family value);
	/**
	 * Returns the value of the '<em><b>Effective type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getComponent_Effective_type()
	 * @model keys="name"
	 * @generated
	 */
	EList<ComponentType> getEffective_type();

} // Component
