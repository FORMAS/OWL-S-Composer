/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import owls.OwlsAssign;
import owls.OwlsPackage;
import owls.impl.OwlsAssignImpl;

/**
 * This is the item provider adapter for a {@link owls.OwlsAssign} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsAssignItemProvider
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
	public OwlsAssignItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
			addInputTargetPropertyDescriptor(object);
			addOutputSourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwlsAssign_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsAssign_target_feature", "_UI_OwlsAssign_type"),
				 OwlsPackage.Literals.OWLS_ASSIGN__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addInputTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwlsAssign_inputTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsAssign_inputTarget_feature", "_UI_OwlsAssign_type"),
				 OwlsPackage.Literals.OWLS_ASSIGN__INPUT_TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
				 {
		         	@Override
			        public Collection<?> getChoiceOfValues(Object object)
			         {
		        	 	   OwlsAssign assign = (OwlsAssignImpl)object;
		        	 	
				           // Filter out classes that aren't permitted.
				           //
				           Collection<?> inputs = super.getChoiceOfValues(assign);
				           Collection filter = new ArrayList();
				           Collection<?> results = new UniqueEList<Object>();
				           for (Object input : inputs) {
				        	   if((assign.getTarget().getHasInputs().contains(input))){
				        		   filter.add(input);
				        	   }
				           }
				           results.addAll(filter);
				           return results;
			         }
			      });
	}

	/**
	 * This adds a property descriptor for the Output Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOutputSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwlsAssign_outputSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsAssign_outputSource_feature", "_UI_OwlsAssign_type"),
				 OwlsPackage.Literals.OWLS_ASSIGN__OUTPUT_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
				 {
		         	@Override
			        public Collection<?> getChoiceOfValues(Object object)
			         {
		        	 	   OwlsAssign assign = (OwlsAssignImpl)object;
			          
						   // Filter out classes that aren't permitted.
						   //
						   Collection<?> outputs = super.getChoiceOfValues(assign);
						   Collection filter = new ArrayList();
						   Collection<?> results = new UniqueEList<Object>();
						   for (Object output : outputs) {
							   if(assign.getSource().getHasOutputs().contains(output)){
								   filter.add(output);
							   }
						   }
						   results.addAll(filter);
						   return results;
			         }
			      });
	}

	/**
	 * This returns OwlsAssign.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OwlsAssign"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_OwlsAssign_type");
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
