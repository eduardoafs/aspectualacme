/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crosscutting Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.CrosscuttingRole#getAspectualConnector <em>Aspectual Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getCrosscuttingRole()
 * @model
 * @generated
 */
public interface CrosscuttingRole extends Role {
	/**
	 * Returns the value of the '<em><b>Aspectual Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.AspectualConnector#getCrosscuttingRole <em>Crosscutting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspectual Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspectual Connector</em>' container reference.
	 * @see #setAspectualConnector(AspectualConnector)
	 * @see aspectualacme.AspectualacmePackage#getCrosscuttingRole_AspectualConnector()
	 * @see aspectualacme.AspectualConnector#getCrosscuttingRole
	 * @model opposite="crosscuttingRole" transient="false"
	 * @generated
	 */
	AspectualConnector getAspectualConnector();

	/**
	 * Sets the value of the '{@link aspectualacme.CrosscuttingRole#getAspectualConnector <em>Aspectual Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspectual Connector</em>' container reference.
	 * @see #getAspectualConnector()
	 * @generated
	 */
	void setAspectualConnector(AspectualConnector value);

} // CrosscuttingRole
