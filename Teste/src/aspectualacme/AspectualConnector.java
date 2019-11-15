/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspectual Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.AspectualConnector#getBaseRole <em>Base Role</em>}</li>
 *   <li>{@link aspectualacme.AspectualConnector#getCrosscuttingRole <em>Crosscutting Role</em>}</li>
 *   <li>{@link aspectualacme.AspectualConnector#getGlues <em>Glues</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getAspectualConnector()
 * @model
 * @generated
 */
public interface AspectualConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Base Role</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.BaseRole#getAspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Role</em>' containment reference.
	 * @see #setBaseRole(BaseRole)
	 * @see aspectualacme.AspectualacmePackage#getAspectualConnector_BaseRole()
	 * @see aspectualacme.BaseRole#getAspectualConnector
	 * @model opposite="aspectualConnector" containment="true"
	 * @generated
	 */
	BaseRole getBaseRole();

	/**
	 * Sets the value of the '{@link aspectualacme.AspectualConnector#getBaseRole <em>Base Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Role</em>' containment reference.
	 * @see #getBaseRole()
	 * @generated
	 */
	void setBaseRole(BaseRole value);

	/**
	 * Returns the value of the '<em><b>Crosscutting Role</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.CrosscuttingRole#getAspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crosscutting Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crosscutting Role</em>' containment reference.
	 * @see #setCrosscuttingRole(CrosscuttingRole)
	 * @see aspectualacme.AspectualacmePackage#getAspectualConnector_CrosscuttingRole()
	 * @see aspectualacme.CrosscuttingRole#getAspectualConnector
	 * @model opposite="aspectualConnector" containment="true"
	 * @generated
	 */
	CrosscuttingRole getCrosscuttingRole();

	/**
	 * Sets the value of the '{@link aspectualacme.AspectualConnector#getCrosscuttingRole <em>Crosscutting Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crosscutting Role</em>' containment reference.
	 * @see #getCrosscuttingRole()
	 * @generated
	 */
	void setCrosscuttingRole(CrosscuttingRole value);

	/**
	 * Returns the value of the '<em><b>Glues</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Glue#getAspectualConnector <em>Aspectual Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glues</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glues</em>' containment reference.
	 * @see #setGlues(Glue)
	 * @see aspectualacme.AspectualacmePackage#getAspectualConnector_Glues()
	 * @see aspectualacme.Glue#getAspectualConnector
	 * @model opposite="aspectualConnector" containment="true"
	 * @generated
	 */
	Glue getGlues();

	/**
	 * Sets the value of the '{@link aspectualacme.AspectualConnector#getGlues <em>Glues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glues</em>' containment reference.
	 * @see #getGlues()
	 * @generated
	 */
	void setGlues(Glue value);

} // AspectualConnector
