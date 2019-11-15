/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Role#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Element {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Connector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(Connector)
	 * @see aspectualacme.AspectualacmePackage#getRole_Connector()
	 * @see aspectualacme.Connector#getRole
	 * @model opposite="role" transient="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link aspectualacme.Role#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // Role
