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
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Connector#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Element {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Role}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Role#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnector_Role()
	 * @see aspectualacme.Role#getConnector
	 * @model opposite="connector" containment="true"
	 * @generated
	 */
	EList<Role> getRole();

} // Connector
