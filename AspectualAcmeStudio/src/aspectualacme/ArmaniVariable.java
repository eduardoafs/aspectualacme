/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniVariable#getId <em>Id</em>}</li>
 *   <li>{@link aspectualacme.ArmaniVariable#getUserType <em>User Type</em>}</li>
 *   <li>{@link aspectualacme.ArmaniVariable#getBasicType <em>Basic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniVariable()
 * @model
 * @generated
 */
public interface ArmaniVariable extends ArmaniExpression {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see aspectualacme.AspectualacmePackage#getArmaniVariable_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniVariable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' reference.
	 * @see #setUserType(TypeDefinition)
	 * @see aspectualacme.AspectualacmePackage#getArmaniVariable_UserType()
	 * @model keys="name"
	 * @generated
	 */
	TypeDefinition getUserType();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniVariable#getUserType <em>User Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' reference.
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Basic Type</b></em>' attribute.
	 * The literals are from the enumeration {@link aspectualacme.ArmaniTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Type</em>' attribute.
	 * @see aspectualacme.ArmaniTypes
	 * @see #setBasicType(ArmaniTypes)
	 * @see aspectualacme.AspectualacmePackage#getArmaniVariable_BasicType()
	 * @model
	 * @generated
	 */
	ArmaniTypes getBasicType();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniVariable#getBasicType <em>Basic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Type</em>' attribute.
	 * @see aspectualacme.ArmaniTypes
	 * @see #getBasicType()
	 * @generated
	 */
	void setBasicType(ArmaniTypes value);

} // ArmaniVariable
