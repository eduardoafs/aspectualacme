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
 *   <li>{@link aspectualacme.Glue#getBaseAttach <em>Base Attach</em>}</li>
 *   <li>{@link aspectualacme.Glue#getCrosscuttingAttach <em>Crosscutting Attach</em>}</li>
 *   <li>{@link aspectualacme.Glue#getGlueType <em>Glue Type</em>}</li>
 *   <li>{@link aspectualacme.Glue#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getGlue()
 * @model
 * @generated
 */
public interface Glue extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Attach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Attach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Attach</em>' reference.
	 * @see #setBaseAttach(BaseRole)
	 * @see aspectualacme.AspectualacmePackage#getGlue_BaseAttach()
	 * @model derived="true"
	 * @generated
	 */
	BaseRole getBaseAttach();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getBaseAttach <em>Base Attach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Attach</em>' reference.
	 * @see #getBaseAttach()
	 * @generated
	 */
	void setBaseAttach(BaseRole value);

	/**
	 * Returns the value of the '<em><b>Crosscutting Attach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crosscutting Attach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crosscutting Attach</em>' reference.
	 * @see #setCrosscuttingAttach(CrosscuttingRole)
	 * @see aspectualacme.AspectualacmePackage#getGlue_CrosscuttingAttach()
	 * @model derived="true"
	 * @generated
	 */
	CrosscuttingRole getCrosscuttingAttach();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getCrosscuttingAttach <em>Crosscutting Attach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crosscutting Attach</em>' reference.
	 * @see #getCrosscuttingAttach()
	 * @generated
	 */
	void setCrosscuttingAttach(CrosscuttingRole value);

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
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(Connector)
	 * @see aspectualacme.AspectualacmePackage#getGlue_Connector()
	 * @see aspectualacme.Connector#getGlue
	 * @model opposite="glue" transient="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link aspectualacme.Glue#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // Glue
