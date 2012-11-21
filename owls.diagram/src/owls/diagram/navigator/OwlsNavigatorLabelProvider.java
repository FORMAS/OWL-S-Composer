package owls.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import owls.OwlsAtomicProcess;
import owls.OwlsCompositeProcess;
import owls.diagram.edit.parts.OwlsAnyOrder2EditPart;
import owls.diagram.edit.parts.OwlsAnyOrderEditPart;
import owls.diagram.edit.parts.OwlsAssignEditPart;
import owls.diagram.edit.parts.OwlsAssignInputClientEditPart;
import owls.diagram.edit.parts.OwlsAssignOutputClientEditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessEditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessIDEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcess2EditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessIDEditPart;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsSequence2EditPart;
import owls.diagram.edit.parts.OwlsSequenceEditPart;
import owls.diagram.edit.parts.OwlsSplit2EditPart;
import owls.diagram.edit.parts.OwlsSplitEditPart;
import owls.diagram.edit.parts.WrapLabel2EditPart;
import owls.diagram.edit.parts.WrapLabel3EditPart;
import owls.diagram.edit.parts.WrapLabel4EditPart;
import owls.diagram.edit.parts.WrapLabelEditPart;
import owls.diagram.part.OwlsDiagramEditorPlugin;
import owls.diagram.part.OwlsVisualIDRegistry;
import owls.diagram.providers.OwlsElementTypes;
import owls.diagram.providers.OwlsParserProvider;

/**
 * @generated
 */
public class OwlsNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OwlsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OwlsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof OwlsNavigatorItem
				&& !isOwnView(((OwlsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof OwlsNavigatorGroup) {
			OwlsNavigatorGroup group = (OwlsNavigatorGroup) element;
			return OwlsDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof OwlsNavigatorItem) {
			OwlsNavigatorItem navigatorItem = (OwlsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (OwlsVisualIDRegistry.getVisualID(view)) {
		case OwlsCompositeProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?platform:/resource/owls/model/owls.ecore?OwlsCompositeProcess", OwlsElementTypes.OwlsCompositeProcess_79); //$NON-NLS-1$
		case OwlsSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/owls/model/owls.ecore?OwlsSequence", OwlsElementTypes.OwlsSequence_1001); //$NON-NLS-1$
		case OwlsSplitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/owls/model/owls.ecore?OwlsSplit", OwlsElementTypes.OwlsSplit_1002); //$NON-NLS-1$
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/owls/model/owls.ecore?OwlsAnyOrder", OwlsElementTypes.OwlsAnyOrder_1003); //$NON-NLS-1$
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsAtomicProcess", OwlsElementTypes.OwlsAtomicProcess_2001); //$NON-NLS-1$
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsCompositeProcess", OwlsElementTypes.OwlsCompositeProcess_2002); //$NON-NLS-1$
		case OwlsSplit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsSplit", OwlsElementTypes.OwlsSplit_2003); //$NON-NLS-1$
		case OwlsSequence2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsSequence", OwlsElementTypes.OwlsSequence_2004); //$NON-NLS-1$
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsAnyOrder", OwlsElementTypes.OwlsAnyOrder_2005); //$NON-NLS-1$
		case OwlsInputClientMessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsInputClientMessage", OwlsElementTypes.OwlsInputClientMessage_2006); //$NON-NLS-1$
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?platform:/resource/owls/model/owls.ecore?OwlsOutputClientMessage", OwlsElementTypes.OwlsOutputClientMessage_2007); //$NON-NLS-1$
		case OwlsAssignEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/owls/model/owls.ecore?OwlsAssign", OwlsElementTypes.OwlsAssign_3001); //$NON-NLS-1$
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/owls/model/owls.ecore?OwlsAssignInputClient", OwlsElementTypes.OwlsAssignInputClient_3002); //$NON-NLS-1$
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/owls/model/owls.ecore?OwlsAssignOutputClient", OwlsElementTypes.OwlsAssignOutputClient_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OwlsDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& OwlsElementTypes.isKnownElementType(elementType)) {
			image = OwlsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof OwlsNavigatorGroup) {
			OwlsNavigatorGroup group = (OwlsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof OwlsNavigatorItem) {
			OwlsNavigatorItem navigatorItem = (OwlsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (OwlsVisualIDRegistry.getVisualID(view)) {
		case OwlsCompositeProcessEditPart.VISUAL_ID:
			return getOwlsCompositeProcess_79Text(view);
		case OwlsSequenceEditPart.VISUAL_ID:
			return getOwlsSequence_1001Text(view);
		case OwlsSplitEditPart.VISUAL_ID:
			return getOwlsSplit_1002Text(view);
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return getOwlsAnyOrder_1003Text(view);
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			return getOwlsAtomicProcess_2001Text(view);
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			return getOwlsCompositeProcess_2002Text(view);
		case OwlsSplit2EditPart.VISUAL_ID:
			return getOwlsSplit_2003Text(view);
		case OwlsSequence2EditPart.VISUAL_ID:
			return getOwlsSequence_2004Text(view);
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return getOwlsAnyOrder_2005Text(view);
		case OwlsInputClientMessageEditPart.VISUAL_ID:
			return getOwlsInputClientMessage_2006Text(view);
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return getOwlsOutputClientMessage_2007Text(view);
		case OwlsAssignEditPart.VISUAL_ID:
			return getOwlsAssign_3001Text(view);
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return getOwlsAssignInputClient_3002Text(view);
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return getOwlsAssignOutputClient_3003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOwlsCompositeProcess_79Text(View view) {
		OwlsCompositeProcess domainModelElement = (OwlsCompositeProcess) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getID();
		} else {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOwlsSequence_1001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsSplit_1002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsAnyOrder_1003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsAtomicProcess_2001Text(View view) {
		IAdaptable hintAdapter = new OwlsParserProvider.HintAdapter(
				OwlsElementTypes.OwlsAtomicProcess_2001,
				(view.getElement() != null ? view.getElement() : view),
				OwlsVisualIDRegistry
						.getType(OwlsAtomicProcessIDEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOwlsCompositeProcess_2002Text(View view) {
		IAdaptable hintAdapter = new OwlsParserProvider.HintAdapter(
				OwlsElementTypes.OwlsCompositeProcess_2002,
				(view.getElement() != null ? view.getElement() : view),
				OwlsVisualIDRegistry
						.getType(OwlsCompositeProcessIDEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			OwlsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOwlsSplit_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsSequence_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsAnyOrder_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsInputClientMessage_2006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsOutputClientMessage_2007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsAssign_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsAssignInputClient_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOwlsAssignOutputClient_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return OwlsCompositeProcessEditPart.MODEL_ID
				.equals(OwlsVisualIDRegistry.getModelID(view));
	}

}
