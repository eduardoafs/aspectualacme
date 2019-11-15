/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.BaseRole#getAspectualConnector <em>Aspectual Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getBaseRole()
 * @model
 * @generated
 */
public interface BaseRole extends Role {
	/**
	 * Returns the value of the '<em><b>Aspectual Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.AspectualConnector#getBaseRole <em>Base Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspectual Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspectual Connector</em>' container reference.
	 * @see #setAspectualConnector(AspectualConnector)
	 * @see aspectualacme.AspectualacmePackage#getBaseRole_AspectualConnector()
	 * @see aspectualacme.AspectualConnector#getBaseRole
	 * @model opposite="baseRole" transient="false"
	 * @generated
	 */
	AspectualConnector getAspectualConnector();

	/**
	 * Sets the value of the '{@link aspectualacme.BaseRole#getAspectualConnector <em>Aspectual Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspectual Connector</em>' container reference.
	 * @see #getAspectualConnector()
	 * @generated
	 */
	void setAspectualConnector(AspectualConnector value);

} // BaseRole
