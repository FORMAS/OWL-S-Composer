package owls.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import owls.OwlsPackage;
import owls.diagram.part.OwlsDiagramEditorPlugin;

/**
 * @generated
 */
public class OwlsElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private OwlsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType OwlsCompositeProcess_79 = getElementType("owls.diagram.OwlsCompositeProcess_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OwlsSequence_1001 = getElementType("owls.diagram.OwlsSequence_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OwlsSplit_1002 = getElementType("owls.diagram.OwlsSplit_1002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsAnyOrder_1003 = getElementType("owls.diagram.OwlsAnyOrder_1003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsAtomicProcess_2001 = getElementType("owls.diagram.OwlsAtomicProcess_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OwlsCompositeProcess_2002 = getElementType("owls.diagram.OwlsCompositeProcess_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsSplit_2003 = getElementType("owls.diagram.OwlsSplit_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsSequence_2004 = getElementType("owls.diagram.OwlsSequence_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsAnyOrder_2005 = getElementType("owls.diagram.OwlsAnyOrder_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsInputClientMessage_2006 = getElementType("owls.diagram.OwlsInputClientMessage_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsOutputClientMessage_2007 = getElementType("owls.diagram.OwlsOutputClientMessage_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsAssign_3001 = getElementType("owls.diagram.OwlsAssign_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsAssignInputClient_3002 = getElementType("owls.diagram.OwlsAssignInputClient_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OwlsAssignOutputClient_3003 = getElementType("owls.diagram.OwlsAssignOutputClient_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return OwlsDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(OwlsCompositeProcess_79, OwlsPackage.eINSTANCE
					.getOwlsCompositeProcess());

			elements.put(OwlsSequence_1001, OwlsPackage.eINSTANCE
					.getOwlsSequence());

			elements.put(OwlsSplit_1002, OwlsPackage.eINSTANCE.getOwlsSplit());

			elements.put(OwlsAnyOrder_1003, OwlsPackage.eINSTANCE
					.getOwlsAnyOrder());

			elements.put(OwlsAtomicProcess_2001, OwlsPackage.eINSTANCE
					.getOwlsAtomicProcess());

			elements.put(OwlsCompositeProcess_2002, OwlsPackage.eINSTANCE
					.getOwlsCompositeProcess());

			elements.put(OwlsSplit_2003, OwlsPackage.eINSTANCE.getOwlsSplit());

			elements.put(OwlsSequence_2004, OwlsPackage.eINSTANCE
					.getOwlsSequence());

			elements.put(OwlsAnyOrder_2005, OwlsPackage.eINSTANCE
					.getOwlsAnyOrder());

			elements.put(OwlsInputClientMessage_2006, OwlsPackage.eINSTANCE
					.getOwlsInputClientMessage());

			elements.put(OwlsOutputClientMessage_2007, OwlsPackage.eINSTANCE
					.getOwlsOutputClientMessage());

			elements
					.put(OwlsAssign_3001, OwlsPackage.eINSTANCE.getOwlsAssign());

			elements.put(OwlsAssignInputClient_3002, OwlsPackage.eINSTANCE
					.getOwlsAssignInputClient());

			elements.put(OwlsAssignOutputClient_3003, OwlsPackage.eINSTANCE
					.getOwlsAssignOutputClient());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(OwlsCompositeProcess_79);
			KNOWN_ELEMENT_TYPES.add(OwlsSequence_1001);
			KNOWN_ELEMENT_TYPES.add(OwlsSplit_1002);
			KNOWN_ELEMENT_TYPES.add(OwlsAnyOrder_1003);
			KNOWN_ELEMENT_TYPES.add(OwlsAtomicProcess_2001);
			KNOWN_ELEMENT_TYPES.add(OwlsCompositeProcess_2002);
			KNOWN_ELEMENT_TYPES.add(OwlsSplit_2003);
			KNOWN_ELEMENT_TYPES.add(OwlsSequence_2004);
			KNOWN_ELEMENT_TYPES.add(OwlsAnyOrder_2005);
			KNOWN_ELEMENT_TYPES.add(OwlsInputClientMessage_2006);
			KNOWN_ELEMENT_TYPES.add(OwlsOutputClientMessage_2007);
			KNOWN_ELEMENT_TYPES.add(OwlsAssign_3001);
			KNOWN_ELEMENT_TYPES.add(OwlsAssignInputClient_3002);
			KNOWN_ELEMENT_TYPES.add(OwlsAssignOutputClient_3003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
