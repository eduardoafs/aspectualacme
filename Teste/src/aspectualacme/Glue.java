/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Glue#getPrefixRole <em>Prefix Role</em>}</li>
 *   <li>{@link aspectualacme.Glue#getSuffixRole <em>Suffix Role</em>}</li>
 *   <li>{@link aspectualacme.Glue#getGlueType <em>Glue Type</em>}</li>
 *   <li>{@link aspectualacme.Glue#getAspectualConnector <em>Aspectual Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getGlue()
 * @model
 * @generated
 */
public interface Glue extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Role</em>' reference.
	 * @see #setPrefixRole(CrosscuttingRole)
	 * @see aspectualacme.AspectualacmePackage#getGlue_PrefixRole()
	 * @model derived="true"
	 * @generated
	 */
	CrosscuttingRole getPrefixRole();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getPrefixRole <em>Prefix Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Role</em>' reference.
	 * @see #getPrefixRole()
	 * @generated
	 */
	void setPrefixRole(CrosscuttingRole value);

	/**
	 * Returns the value of the '<em><b>Suffix Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix Role</em>' reference.
	 * @see #setSuffixRole(BaseRole)
	 * @see aspectualacme.AspectualacmePackage#getGlue_SuffixRole()
	 * @model derived="true"
	 * @generated
	 */
	BaseRole getSuffixRole();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getSuffixRole <em>Suffix Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix Role</em>' reference.
	 * @see #getSuffixRole()
	 * @generated
	 */
	void setSuffixRole(BaseRole value);

	/**
	 * Returns the value of the '<em><b>Glue Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link aspectualacme.GlueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Type</em>' attribute.
	 * @see aspectualacme.GlueType
	 * @see #setGlueType(GlueType)
	 * @see aspectualacme.AspectualacmePackage#getGlue_GlueType()
	 * @model default=""
	 * @generated
	 */
	GlueType getGlueType();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getGlueType <em>Glue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Type</em>' attribute.
	 * @see aspectualacme.GlueType
	 * @see #getGlueType()
	 * @generated
	 */
	void setGlueType(GlueType value);

	/**
	 * Returns the value of the '<em><b>Aspectual Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.AspectualConnector#getGlues <em>Glues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspectual Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspectual Connector</em>' container reference.
	 * @see #setAspectualConnector(AspectualConnector)
	 * @see aspectualacme.AspectualacmePackage#getGlue_AspectualConnector()
	 * @see aspectualacme.AspectualConnector#getGlues
	 * @model opposite="glues" transient="false"
	 * @generated
	 */
	AspectualConnector getAspectualConnector();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getAspectualConnector <em>Aspectual Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspectual Connector</em>' container reference.
	 * @see #getAspectualConnector()
	 * @generated
	 */
	void setAspectualConnector(AspectualConnector value);

} // Glue
