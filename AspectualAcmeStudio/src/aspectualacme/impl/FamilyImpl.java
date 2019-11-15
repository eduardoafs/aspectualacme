/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.Family;
import aspectualacme.PortType;
import aspectualacme.RoleType;
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
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getWildcard <em>Wildcard</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getCtypes <em>Ctypes</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getPtypes <em>Ptypes</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getCntypes <em>Cntypes</em>}</li>
 *   <li>{@link aspectualacme.impl.FamilyImpl#getRtypes <em>Rtypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyImpl extends BasicElementImpl implements Family {
	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachments;

	/**
	 * The cached value of the '{@link #getWildcard() <em>Wildcard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWildcard()
	 * @generated
	 * @ordered
	 */
	protected EList<WildCard> wildcard;

	/**
	 * The cached value of the '{@link #getCtypes() <em>Ctypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> ctypes;

	/**
	 * The cached value of the '{@link #getPtypes() <em>Ptypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> ptypes;

	/**
	 * The cached value of the '{@link #getCntypes() <em>Cntypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCntypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> cntypes;

	/**
	 * The cached value of the '{@link #getRtypes() <em>Rtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> rtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, AspectualacmePackage.FAMILY__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList<Component>(Component.class, this, AspectualacmePackage.FAMILY__COMPONENTS, AspectualacmePackage.COMPONENT__PARENT_FAMILY);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachments() {
		if (attachments == null) {
			attachments = new EObjectContainmentEList<Attachment>(Attachment.class, this, AspectualacmePackage.FAMILY__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WildCard> getWildcard() {
		if (wildcard == null) {
			wildcard = new EObjectContainmentEList<WildCard>(WildCard.class, this, AspectualacmePackage.FAMILY__WILDCARD);
		}
		return wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getCtypes() {
		if (ctypes == null) {
			ctypes = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, AspectualacmePackage.FAMILY__CTYPES);
		}
		return ctypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPtypes() {
		if (ptypes == null) {
			ptypes = new EObjectContainmentEList<PortType>(PortType.class, this, AspectualacmePackage.FAMILY__PTYPES);
		}
		return ptypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getCntypes() {
		if (cntypes == null) {
			cntypes = new EObjectContainmentEList<ConnectorType>(ConnectorType.class, this, AspectualacmePackage.FAMILY__CNTYPES);
		}
		return cntypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getRtypes() {
		if (rtypes == null) {
			rtypes = new EObjectContainmentEList<RoleType>(RoleType.class, this, AspectualacmePackage.FAMILY__RTYPES);
		}
		return rtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.FAMILY__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.FAMILY__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__WILDCARD:
				return ((InternalEList<?>)getWildcard()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__CTYPES:
				return ((InternalEList<?>)getCtypes()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__PTYPES:
				return ((InternalEList<?>)getPtypes()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__CNTYPES:
				return ((InternalEList<?>)getCntypes()).basicRemove(otherEnd, msgs);
			case AspectualacmePackage.FAMILY__RTYPES:
				return ((InternalEList<?>)getRtypes()).basicRemove(otherEnd, msgs);
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
			case AspectualacmePackage.FAMILY__CONNECTORS:
				return getConnectors();
			case AspectualacmePackage.FAMILY__COMPONENTS:
				return getComponents();
			case AspectualacmePackage.FAMILY__ATTACHMENTS:
				return getAttachments();
			case AspectualacmePackage.FAMILY__WILDCARD:
				return getWildcard();
			case AspectualacmePackage.FAMILY__CTYPES:
				return getCtypes();
			case AspectualacmePackage.FAMILY__PTYPES:
				return getPtypes();
			case AspectualacmePackage.FAMILY__CNTYPES:
				return getCntypes();
			case AspectualacmePackage.FAMILY__RTYPES:
				return getRtypes();
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
			case AspectualacmePackage.FAMILY__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case AspectualacmePackage.FAMILY__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case AspectualacmePackage.FAMILY__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case AspectualacmePackage.FAMILY__WILDCARD:
				getWildcard().clear();
				getWildcard().addAll((Collection<? extends WildCard>)newValue);
				return;
			case AspectualacmePackage.FAMILY__CTYPES:
				getCtypes().clear();
				getCtypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case AspectualacmePackage.FAMILY__PTYPES:
				getPtypes().clear();
				getPtypes().addAll((Collection<? extends PortType>)newValue);
				return;
			case AspectualacmePackage.FAMILY__CNTYPES:
				getCntypes().clear();
				getCntypes().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case AspectualacmePackage.FAMILY__RTYPES:
				getRtypes().clear();
				getRtypes().addAll((Collection<? extends RoleType>)newValue);
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
			case AspectualacmePackage.FAMILY__CONNECTORS:
				getConnectors().clear();
				return;
			case AspectualacmePackage.FAMILY__COMPONENTS:
				getComponents().clear();
				return;
			case AspectualacmePackage.FAMILY__ATTACHMENTS:
				getAttachments().clear();
				return;
			case AspectualacmePackage.FAMILY__WILDCARD:
				getWildcard().clear();
				return;
			case AspectualacmePackage.FAMILY__CTYPES:
				getCtypes().clear();
				return;
			case AspectualacmePackage.FAMILY__PTYPES:
				getPtypes().clear();
				return;
			case AspectualacmePackage.FAMILY__CNTYPES:
				getCntypes().clear();
				return;
			case AspectualacmePackage.FAMILY__RTYPES:
				getRtypes().clear();
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
			case AspectualacmePackage.FAMILY__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case AspectualacmePackage.FAMILY__COMPONENTS:
				return components != null && !components.isEmpty();
			case AspectualacmePackage.FAMILY__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case AspectualacmePackage.FAMILY__WILDCARD:
				return wildcard != null && !wildcard.isEmpty();
			case AspectualacmePackage.FAMILY__CTYPES:
				return ctypes != null && !ctypes.isEmpty();
			case AspectualacmePackage.FAMILY__PTYPES:
				return ptypes != null && !ptypes.isEmpty();
			case AspectualacmePackage.FAMILY__CNTYPES:
				return cntypes != null && !cntypes.isEmpty();
			case AspectualacmePackage.FAMILY__RTYPES:
				return rtypes != null && !rtypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyImpl
