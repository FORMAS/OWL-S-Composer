package owls.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsAnyOrder;
import owls.OwlsAssign;
import owls.OwlsAssignInputClient;
import owls.OwlsAssignOutputClient;
import owls.OwlsAtomicProcess;
import owls.OwlsClientMessage;
import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsInputClientMessage;
import owls.OwlsOutputClientMessage;
import owls.OwlsPackage;
import owls.OwlsProcess;
import owls.OwlsSequence;
import owls.OwlsSplit;
import owls.diagram.edit.parts.OwlsAnyOrder2EditPart;
import owls.diagram.edit.parts.OwlsAnyOrderEditPart;
import owls.diagram.edit.parts.OwlsAssignEditPart;
import owls.diagram.edit.parts.OwlsAssignInputClientEditPart;
import owls.diagram.edit.parts.OwlsAssignOutputClientEditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcess2EditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessEditPart;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsSequence2EditPart;
import owls.diagram.edit.parts.OwlsSequenceEditPart;
import owls.diagram.edit.parts.OwlsSplit2EditPart;
import owls.diagram.edit.parts.OwlsSplitEditPart;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (OwlsVisualIDRegistry.getVisualID(view)) {
		case OwlsSequenceEditPart.VISUAL_ID:
			return getOwlsSequence_1001SemanticChildren(view);
		case OwlsSplitEditPart.VISUAL_ID:
			return getOwlsSplit_1002SemanticChildren(view);
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return getOwlsAnyOrder_1003SemanticChildren(view);
		case OwlsSplit2EditPart.VISUAL_ID:
			return getOwlsSplit_2003SemanticChildren(view);
		case OwlsSequence2EditPart.VISUAL_ID:
			return getOwlsSequence_2004SemanticChildren(view);
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return getOwlsAnyOrder_2005SemanticChildren(view);
		case OwlsCompositeProcessEditPart.VISUAL_ID:
			return getOwlsCompositeProcess_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_1001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsSequence modelElement = (OwlsSequence) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getProcesses().iterator(); it.hasNext();) {
			OwlsProcess childElement = (OwlsProcess) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsAtomicProcessEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsCompositeProcess2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConstructs().iterator(); it
				.hasNext();) {
			OwlsControlConstruct childElement = (OwlsControlConstruct) it
					.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSplit2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsAnyOrder2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OwlsClientMessage childElement = (OwlsClientMessage) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsInputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsOutputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_1002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsSplit modelElement = (OwlsSplit) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getProcesses().iterator(); it.hasNext();) {
			OwlsProcess childElement = (OwlsProcess) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsAtomicProcessEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsCompositeProcess2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConstructs().iterator(); it
				.hasNext();) {
			OwlsControlConstruct childElement = (OwlsControlConstruct) it
					.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSequence2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsAnyOrder2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OwlsClientMessage childElement = (OwlsClientMessage) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsInputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsOutputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_1003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsAnyOrder modelElement = (OwlsAnyOrder) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getProcesses().iterator(); it.hasNext();) {
			OwlsProcess childElement = (OwlsProcess) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsAtomicProcessEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsCompositeProcess2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConstructs().iterator(); it
				.hasNext();) {
			OwlsControlConstruct childElement = (OwlsControlConstruct) it
					.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSplit2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsSequence2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OwlsClientMessage childElement = (OwlsClientMessage) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsInputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsOutputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsSplit modelElement = (OwlsSplit) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getProcesses().iterator(); it.hasNext();) {
			OwlsProcess childElement = (OwlsProcess) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsAtomicProcessEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsCompositeProcess2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConstructs().iterator(); it
				.hasNext();) {
			OwlsControlConstruct childElement = (OwlsControlConstruct) it
					.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSequence2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsAnyOrder2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OwlsClientMessage childElement = (OwlsClientMessage) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsInputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsOutputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_2004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsSequence modelElement = (OwlsSequence) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getProcesses().iterator(); it.hasNext();) {
			OwlsProcess childElement = (OwlsProcess) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsAtomicProcessEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsCompositeProcess2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConstructs().iterator(); it
				.hasNext();) {
			OwlsControlConstruct childElement = (OwlsControlConstruct) it
					.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSplit2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsAnyOrder2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OwlsClientMessage childElement = (OwlsClientMessage) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsInputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsOutputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_2005SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsAnyOrder modelElement = (OwlsAnyOrder) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getProcesses().iterator(); it.hasNext();) {
			OwlsProcess childElement = (OwlsProcess) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsAtomicProcessEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsCompositeProcess2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConstructs().iterator(); it
				.hasNext();) {
			OwlsControlConstruct childElement = (OwlsControlConstruct) it
					.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSplit2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsSequence2EditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMessages().iterator(); it.hasNext();) {
			OwlsClientMessage childElement = (OwlsClientMessage) it.next();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsInputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OwlsOutputClientMessageEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsCompositeProcess_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OwlsCompositeProcess modelElement = (OwlsCompositeProcess) view
				.getElement();
		List result = new LinkedList();
		{
			OwlsControlConstruct childElement = modelElement.getComposedOf();
			int visualID = OwlsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OwlsSequenceEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
			}
			if (visualID == OwlsSplitEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
			}
			if (visualID == OwlsAnyOrderEditPart.VISUAL_ID) {
				result.add(new OwlsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (OwlsVisualIDRegistry.getVisualID(view)) {
		case OwlsCompositeProcessEditPart.VISUAL_ID:
			return getOwlsCompositeProcess_79ContainedLinks(view);
		case OwlsSequenceEditPart.VISUAL_ID:
			return getOwlsSequence_1001ContainedLinks(view);
		case OwlsSplitEditPart.VISUAL_ID:
			return getOwlsSplit_1002ContainedLinks(view);
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return getOwlsAnyOrder_1003ContainedLinks(view);
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			return getOwlsAtomicProcess_2001ContainedLinks(view);
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			return getOwlsCompositeProcess_2002ContainedLinks(view);
		case OwlsSplit2EditPart.VISUAL_ID:
			return getOwlsSplit_2003ContainedLinks(view);
		case OwlsSequence2EditPart.VISUAL_ID:
			return getOwlsSequence_2004ContainedLinks(view);
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return getOwlsAnyOrder_2005ContainedLinks(view);
		case OwlsInputClientMessageEditPart.VISUAL_ID:
			return getOwlsInputClientMessage_2006ContainedLinks(view);
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return getOwlsOutputClientMessage_2007ContainedLinks(view);
		case OwlsAssignEditPart.VISUAL_ID:
			return getOwlsAssign_3001ContainedLinks(view);
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return getOwlsAssignInputClient_3002ContainedLinks(view);
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return getOwlsAssignOutputClient_3003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (OwlsVisualIDRegistry.getVisualID(view)) {
		case OwlsSequenceEditPart.VISUAL_ID:
			return getOwlsSequence_1001IncomingLinks(view);
		case OwlsSplitEditPart.VISUAL_ID:
			return getOwlsSplit_1002IncomingLinks(view);
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return getOwlsAnyOrder_1003IncomingLinks(view);
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			return getOwlsAtomicProcess_2001IncomingLinks(view);
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			return getOwlsCompositeProcess_2002IncomingLinks(view);
		case OwlsSplit2EditPart.VISUAL_ID:
			return getOwlsSplit_2003IncomingLinks(view);
		case OwlsSequence2EditPart.VISUAL_ID:
			return getOwlsSequence_2004IncomingLinks(view);
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return getOwlsAnyOrder_2005IncomingLinks(view);
		case OwlsInputClientMessageEditPart.VISUAL_ID:
			return getOwlsInputClientMessage_2006IncomingLinks(view);
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return getOwlsOutputClientMessage_2007IncomingLinks(view);
		case OwlsAssignEditPart.VISUAL_ID:
			return getOwlsAssign_3001IncomingLinks(view);
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return getOwlsAssignInputClient_3002IncomingLinks(view);
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return getOwlsAssignOutputClient_3003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (OwlsVisualIDRegistry.getVisualID(view)) {
		case OwlsSequenceEditPart.VISUAL_ID:
			return getOwlsSequence_1001OutgoingLinks(view);
		case OwlsSplitEditPart.VISUAL_ID:
			return getOwlsSplit_1002OutgoingLinks(view);
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return getOwlsAnyOrder_1003OutgoingLinks(view);
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			return getOwlsAtomicProcess_2001OutgoingLinks(view);
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			return getOwlsCompositeProcess_2002OutgoingLinks(view);
		case OwlsSplit2EditPart.VISUAL_ID:
			return getOwlsSplit_2003OutgoingLinks(view);
		case OwlsSequence2EditPart.VISUAL_ID:
			return getOwlsSequence_2004OutgoingLinks(view);
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return getOwlsAnyOrder_2005OutgoingLinks(view);
		case OwlsInputClientMessageEditPart.VISUAL_ID:
			return getOwlsInputClientMessage_2006OutgoingLinks(view);
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return getOwlsOutputClientMessage_2007OutgoingLinks(view);
		case OwlsAssignEditPart.VISUAL_ID:
			return getOwlsAssign_3001OutgoingLinks(view);
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return getOwlsAssignInputClient_3002OutgoingLinks(view);
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return getOwlsAssignOutputClient_3003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsCompositeProcess_79ContainedLinks(View view) {
		OwlsCompositeProcess modelElement = (OwlsCompositeProcess) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssign_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssignInputClient_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssignOutputClient_3003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_1002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_1003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAtomicProcess_2001ContainedLinks(View view) {
		OwlsAtomicProcess modelElement = (OwlsAtomicProcess) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssign_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssignInputClient_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssignOutputClient_3003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsCompositeProcess_2002ContainedLinks(View view) {
		OwlsCompositeProcess modelElement = (OwlsCompositeProcess) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssign_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssignInputClient_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OwlsAssignOutputClient_3003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsInputClientMessage_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsOutputClientMessage_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssign_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssignInputClient_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssignOutputClient_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_1001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_1002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_1003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAtomicProcess_2001IncomingLinks(View view) {
		OwlsAtomicProcess modelElement = (OwlsAtomicProcess) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_OwlsAssign_3001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_OwlsAssignInputClient_3002(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsCompositeProcess_2002IncomingLinks(View view) {
		OwlsCompositeProcess modelElement = (OwlsCompositeProcess) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_OwlsAssign_3001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_OwlsAssignInputClient_3002(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_2005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsInputClientMessage_2006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsOutputClientMessage_2007IncomingLinks(View view) {
		OwlsOutputClientMessage modelElement = (OwlsOutputClientMessage) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_OwlsAssignOutputClient_3003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssign_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssignInputClient_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssignOutputClient_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_1001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_1002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_1003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAtomicProcess_2001OutgoingLinks(View view) {
		OwlsAtomicProcess modelElement = (OwlsAtomicProcess) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_OwlsAssign_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OwlsAssignOutputClient_3003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsCompositeProcess_2002OutgoingLinks(View view) {
		OwlsCompositeProcess modelElement = (OwlsCompositeProcess) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_OwlsAssign_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OwlsAssignOutputClient_3003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSplit_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsSequence_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAnyOrder_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsInputClientMessage_2006OutgoingLinks(View view) {
		OwlsInputClientMessage modelElement = (OwlsInputClientMessage) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_OwlsAssignInputClient_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwlsOutputClientMessage_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssign_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssignInputClient_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwlsAssignOutputClient_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OwlsAssign_3001(
			OwlsProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OwlsAssign) {
				continue;
			}
			OwlsAssign link = (OwlsAssign) linkObject;
			if (OwlsAssignEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsProcess dst = link.getTarget();
			OwlsProcess src = link.getSource();
			result.add(new OwlsLinkDescriptor(src, dst, link,
					OwlsElementTypes.OwlsAssign_3001,
					OwlsAssignEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OwlsAssignInputClient_3002(
			OwlsProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMessagesBindings().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OwlsAssignInputClient) {
				continue;
			}
			OwlsAssignInputClient link = (OwlsAssignInputClient) linkObject;
			if (OwlsAssignInputClientEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsProcess dst = link.getProcessReference();
			OwlsInputClientMessage src = link.getClientReference();
			result.add(new OwlsLinkDescriptor(src, dst, link,
					OwlsElementTypes.OwlsAssignInputClient_3002,
					OwlsAssignInputClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OwlsAssignOutputClient_3003(
			OwlsProcess container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMessagesBindings().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OwlsAssignOutputClient) {
				continue;
			}
			OwlsAssignOutputClient link = (OwlsAssignOutputClient) linkObject;
			if (OwlsAssignOutputClientEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsOutputClientMessage dst = link.getClientReference();
			OwlsProcess src = link.getProcessReference();
			result.add(new OwlsLinkDescriptor(src, dst, link,
					OwlsElementTypes.OwlsAssignOutputClient_3003,
					OwlsAssignOutputClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OwlsAssign_3001(
			OwlsProcess target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OwlsPackage.eINSTANCE
					.getOwlsAssign_Target()
					|| false == setting.getEObject() instanceof OwlsAssign) {
				continue;
			}
			OwlsAssign link = (OwlsAssign) setting.getEObject();
			if (OwlsAssignEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsProcess src = link.getSource();
			result.add(new OwlsLinkDescriptor(src, target, link,
					OwlsElementTypes.OwlsAssign_3001,
					OwlsAssignEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OwlsAssignInputClient_3002(
			OwlsProcess target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OwlsPackage.eINSTANCE
					.getOwlsAssignClient_ProcessReference()
					|| false == setting.getEObject() instanceof OwlsAssignInputClient) {
				continue;
			}
			OwlsAssignInputClient link = (OwlsAssignInputClient) setting
					.getEObject();
			if (OwlsAssignInputClientEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsInputClientMessage src = link.getClientReference();
			result.add(new OwlsLinkDescriptor(src, target, link,
					OwlsElementTypes.OwlsAssignInputClient_3002,
					OwlsAssignInputClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OwlsAssignOutputClient_3003(
			OwlsOutputClientMessage target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != OwlsPackage.eINSTANCE
					.getOwlsAssignOutputClient_ClientReference()
					|| false == setting.getEObject() instanceof OwlsAssignOutputClient) {
				continue;
			}
			OwlsAssignOutputClient link = (OwlsAssignOutputClient) setting
					.getEObject();
			if (OwlsAssignOutputClientEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsProcess src = link.getProcessReference();
			result.add(new OwlsLinkDescriptor(src, target, link,
					OwlsElementTypes.OwlsAssignOutputClient_3003,
					OwlsAssignOutputClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OwlsAssign_3001(
			OwlsProcess source) {
		OwlsProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OwlsProcess) {
				container = (OwlsProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getBindings().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OwlsAssign) {
				continue;
			}
			OwlsAssign link = (OwlsAssign) linkObject;
			if (OwlsAssignEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsProcess dst = link.getTarget();
			OwlsProcess src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new OwlsLinkDescriptor(src, dst, link,
					OwlsElementTypes.OwlsAssign_3001,
					OwlsAssignEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OwlsAssignInputClient_3002(
			OwlsInputClientMessage source) {
		OwlsProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OwlsProcess) {
				container = (OwlsProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMessagesBindings().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OwlsAssignInputClient) {
				continue;
			}
			OwlsAssignInputClient link = (OwlsAssignInputClient) linkObject;
			if (OwlsAssignInputClientEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsProcess dst = link.getProcessReference();
			OwlsInputClientMessage src = link.getClientReference();
			if (src != source) {
				continue;
			}
			result.add(new OwlsLinkDescriptor(src, dst, link,
					OwlsElementTypes.OwlsAssignInputClient_3002,
					OwlsAssignInputClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OwlsAssignOutputClient_3003(
			OwlsProcess source) {
		OwlsProcess container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof OwlsProcess) {
				container = (OwlsProcess) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMessagesBindings().iterator(); links
				.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof OwlsAssignOutputClient) {
				continue;
			}
			OwlsAssignOutputClient link = (OwlsAssignOutputClient) linkObject;
			if (OwlsAssignOutputClientEditPart.VISUAL_ID != OwlsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OwlsOutputClientMessage dst = link.getClientReference();
			OwlsProcess src = link.getProcessReference();
			if (src != source) {
				continue;
			}
			result.add(new OwlsLinkDescriptor(src, dst, link,
					OwlsElementTypes.OwlsAssignOutputClient_3003,
					OwlsAssignOutputClientEditPart.VISUAL_ID));
		}
		return result;
	}

}
