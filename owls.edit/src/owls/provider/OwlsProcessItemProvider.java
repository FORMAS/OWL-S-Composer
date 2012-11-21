/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import owls.OwlsFactory;
import owls.OwlsPackage;
import owls.OwlsProcess;

/**
 * This is the item provider adapter for a {@link owls.OwlsProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsProcessItemProvider
	extends ItemProviderAdapter
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
	public OwlsProcessItemProvider(AdapterFactory adapterFactory) {
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

			addIDPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addProcessURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwlsProcess_iD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsProcess_iD_feature", "_UI_OwlsProcess_type"),
				 OwlsPackage.Literals.OWLS_PROCESS__ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwlsProcess_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsProcess_label_feature", "_UI_OwlsProcess_type"),
				 OwlsPackage.Literals.OWLS_PROCESS__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwlsProcess_processURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsProcess_processURI_feature", "_UI_OwlsProcess_type"),
				 OwlsPackage.Literals.OWLS_PROCESS__PROCESS_URI,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(OwlsPackage.Literals.OWLS_PROCESS__DESCRIBES);
			childrenFeatures.add(OwlsPackage.Literals.OWLS_PROCESS__PEFORMED_BY);
			childrenFeatures.add(OwlsPackage.Literals.OWLS_PROCESS__HAS_INPUTS);
			childrenFeatures.add(OwlsPackage.Literals.OWLS_PROCESS__HAS_OUTPUTS);
			childrenFeatures.add(OwlsPackage.Literals.OWLS_PROCESS__BINDINGS);
			childrenFeatures.add(OwlsPackage.Literals.OWLS_PROCESS__MESSAGES_BINDINGS);
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
	 * This returns OwlsProcess.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OwlsProcess"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OwlsProcess)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_OwlsProcess_type") :
			getString("_UI_OwlsProcess_type") + " " + label;
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

		switch (notification.getFeatureID(OwlsProcess.class)) {
			case OwlsPackage.OWLS_PROCESS__ID:
			case OwlsPackage.OWLS_PROCESS__LABEL:
			case OwlsPackage.OWLS_PROCESS__PROCESS_URI:
			case OwlsPackage.OWLS_PROCESS__REFERENCE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
			case OwlsPackage.OWLS_PROCESS__HAS_INPUTS:
			case OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS:
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
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
				(OwlsPackage.Literals.OWLS_PROCESS__DESCRIBES,
				 OwlsFactory.eINSTANCE.createOwlsService()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__PEFORMED_BY,
				 OwlsFactory.eINSTANCE.createOwlsPeform()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__HAS_INPUTS,
				 OwlsFactory.eINSTANCE.createOwlsInput()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__HAS_OUTPUTS,
				 OwlsFactory.eINSTANCE.createOwlsOutput()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__BINDINGS,
				 OwlsFactory.eINSTANCE.createOwlsAssign()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__MESSAGES_BINDINGS,
				 OwlsFactory.eINSTANCE.createOwlsAssignClient()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__MESSAGES_BINDINGS,
				 OwlsFactory.eINSTANCE.createOwlsAssignInputClient()));

		newChildDescriptors.add
			(createChildParameter
				(OwlsPackage.Literals.OWLS_PROCESS__MESSAGES_BINDINGS,
				 OwlsFactory.eINSTANCE.createOwlsAssignOutputClient()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OwlsEditPlugin.INSTANCE;
	}

}
