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
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ComponentType#getPort <em>Port</em>}</li>
 *   <li>{@link aspectualacme.ComponentType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends Element {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getComponentType_Port()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getComponentType_ParentType()
	 * @model keys="name"
	 * @generated
	 */
	EList<ComponentType> getParentType();

} // ComponentType
