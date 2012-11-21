package owls.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import owls.diagram.edit.parts.OwlsAnyOrder2EditPart;
import owls.diagram.edit.parts.OwlsAnyOrderEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessEditPart;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsSequence2EditPart;
import owls.diagram.edit.parts.OwlsSequenceEditPart;
import owls.diagram.edit.parts.OwlsSplit2EditPart;
import owls.diagram.edit.parts.OwlsSplitEditPart;
import owls.diagram.part.Messages;
import owls.diagram.part.OwlsDiagramEditorPlugin;

/**
 * @generated
 */
public class OwlsModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof OwlsSequenceEditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAtomicProcess_2001);
			types.add(OwlsElementTypes.OwlsCompositeProcess_2002);
			types.add(OwlsElementTypes.OwlsSplit_2003);
			types.add(OwlsElementTypes.OwlsAnyOrder_2005);
			types.add(OwlsElementTypes.OwlsInputClientMessage_2006);
			types.add(OwlsElementTypes.OwlsOutputClientMessage_2007);
			return types;
		}
		if (editPart instanceof OwlsSplitEditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAtomicProcess_2001);
			types.add(OwlsElementTypes.OwlsCompositeProcess_2002);
			types.add(OwlsElementTypes.OwlsSequence_2004);
			types.add(OwlsElementTypes.OwlsAnyOrder_2005);
			types.add(OwlsElementTypes.OwlsInputClientMessage_2006);
			types.add(OwlsElementTypes.OwlsOutputClientMessage_2007);
			return types;
		}
		if (editPart instanceof OwlsAnyOrderEditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAtomicProcess_2001);
			types.add(OwlsElementTypes.OwlsCompositeProcess_2002);
			types.add(OwlsElementTypes.OwlsSplit_2003);
			types.add(OwlsElementTypes.OwlsSequence_2004);
			types.add(OwlsElementTypes.OwlsInputClientMessage_2006);
			types.add(OwlsElementTypes.OwlsOutputClientMessage_2007);
			return types;
		}
		if (editPart instanceof OwlsSplit2EditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAtomicProcess_2001);
			types.add(OwlsElementTypes.OwlsCompositeProcess_2002);
			types.add(OwlsElementTypes.OwlsSequence_2004);
			types.add(OwlsElementTypes.OwlsAnyOrder_2005);
			types.add(OwlsElementTypes.OwlsInputClientMessage_2006);
			types.add(OwlsElementTypes.OwlsOutputClientMessage_2007);
			return types;
		}
		if (editPart instanceof OwlsSequence2EditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAtomicProcess_2001);
			types.add(OwlsElementTypes.OwlsCompositeProcess_2002);
			types.add(OwlsElementTypes.OwlsSplit_2003);
			types.add(OwlsElementTypes.OwlsAnyOrder_2005);
			types.add(OwlsElementTypes.OwlsInputClientMessage_2006);
			types.add(OwlsElementTypes.OwlsOutputClientMessage_2007);
			return types;
		}
		if (editPart instanceof OwlsAnyOrder2EditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAtomicProcess_2001);
			types.add(OwlsElementTypes.OwlsCompositeProcess_2002);
			types.add(OwlsElementTypes.OwlsSplit_2003);
			types.add(OwlsElementTypes.OwlsSequence_2004);
			types.add(OwlsElementTypes.OwlsInputClientMessage_2006);
			types.add(OwlsElementTypes.OwlsOutputClientMessage_2007);
			return types;
		}
		if (editPart instanceof OwlsCompositeProcessEditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsSequence_1001);
			types.add(OwlsElementTypes.OwlsSplit_1002);
			types.add(OwlsElementTypes.OwlsAnyOrder_1003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OwlsInputClientMessageEditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAssignInputClient_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof OwlsOutputClientMessageEditPart) {
			List types = new ArrayList();
			types.add(OwlsElementTypes.OwlsAssignOutputClient_3003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OwlsInputClientMessageEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof OwlsOutputClientMessageEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof OwlsInputClientMessageEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				OwlsDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.OwlsModelingAssistantProviderMessage);
		dialog.setTitle(Messages.OwlsModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
