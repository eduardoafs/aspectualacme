/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.provider;


import aspectualacme.AspectualacmeFactory;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Family;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aspectualacme.Family} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FamilyItemProvider
	extends BasicElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__CONNECTORS);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__COMPONENTS);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__ATTACHMENTS);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__WILDCARD);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__CTYPES);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__PTYPES);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__CNTYPES);
			childrenFeatures.add(AspectualacmePackage.Literals.FAMILY__RTYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Family.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Family"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Family)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Family_type") :
			getString("_UI_Family_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Family.class)) {
			case AspectualacmePackage.FAMILY__CONNECTORS:
			case AspectualacmePackage.FAMILY__COMPONENTS:
			case AspectualacmePackage.FAMILY__ATTACHMENTS:
			case AspectualacmePackage.FAMILY__WILDCARD:
			case AspectualacmePackage.FAMILY__CTYPES:
			case AspectualacmePackage.FAMILY__PTYPES:
			case AspectualacmePackage.FAMILY__CNTYPES:
			case AspectualacmePackage.FAMILY__RTYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__CONNECTORS,
				 AspectualacmeFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__COMPONENTS,
				 AspectualacmeFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__ATTACHMENTS,
				 AspectualacmeFactory.eINSTANCE.createAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__WILDCARD,
				 AspectualacmeFactory.eINSTANCE.createWildCard()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__CTYPES,
				 AspectualacmeFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__PTYPES,
				 AspectualacmeFactory.eINSTANCE.createPortType()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__CNTYPES,
				 AspectualacmeFactory.eINSTANCE.createConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(AspectualacmePackage.Literals.FAMILY__RTYPES,
				 AspectualacmeFactory.eINSTANCE.createRoleType()));
	}

}
