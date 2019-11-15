/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.ArmaniExpression;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BasicElement;

import aspectualacme.Component;
import aspectualacme.Connector;
import aspectualacme.Family;
import aspectualacme.WildCard;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.BasicElementImpl#getArmani <em>Armani</em>}</li>
 *   <li>{@link aspectualacme.impl.BasicElementImpl#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BasicElementImpl extends ElementImpl implements BasicElement {
	/**
	 * The cached value of the '{@link #getArmani() <em>Armani</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmani()
	 * @generated
	 * @ordered
	 */
	protected EList<ArmaniExpression> armani;

	/**
	 * The cached value of the '{@link #getParentFamily() <em>Parent Family</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFamily()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> parentFamily;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.BASIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArmaniExpression> getArmani() {
		if (armani == null) {
			armani = new EObjectContainmentEList<ArmaniExpression>(ArmaniExpression.class, this, AspectualacmePackage.BASIC_ELEMENT__ARMANI);
		}
		return armani;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getParentFamily() {
		if (parentFamily == null) {
			parentFamily = new EObjectResolvingEList<Family>(Family.class, this, AspectualacmePackage.BASIC_ELEMENT__PARENT_FAMILY);
		}
		return parentFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.BASIC_ELEMENT__ARMANI:
				return ((InternalEList<?>)getArmani()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.BASIC_ELEMENT__ARMANI:
				return getArmani();
			case AspectualacmePackage.BASIC_ELEMENT__PARENT_FAMILY:
				return getParentFamily();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectualacmePackage.BASIC_ELEMENT__ARMANI:
				getArmani().clear();
				getArmani().addAll((Collection<? extends ArmaniExpression>)newValue);
				return;
			case AspectualacmePackage.BASIC_ELEMENT__PARENT_FAMILY:
				getParentFamily().clear();
				getParentFamily().addAll((Collection<? extends Family>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AspectualacmePackage.BASIC_ELEMENT__ARMANI:
				getArmani().clear();
				return;
			case AspectualacmePackage.BASIC_ELEMENT__PARENT_FAMILY:
				getParentFamily().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AspectualacmePackage.BASIC_ELEMENT__ARMANI:
				return armani != null && !armani.isEmpty();
			case AspectualacmePackage.BASIC_ELEMENT__PARENT_FAMILY:
				return parentFamily != null && !parentFamily.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicElementImpl
