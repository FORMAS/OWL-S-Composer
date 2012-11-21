package owls.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import owls.OwlsPackage;
import owls.diagram.edit.commands.OwlsAnyOrderCreateCommand;
import owls.diagram.edit.commands.OwlsSequenceCreateCommand;
import owls.diagram.edit.commands.OwlsSplitCreateCommand;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsCompositeProcessItemSemanticEditPolicy extends
		OwlsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OwlsElementTypes.OwlsSequence_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsCompositeProcess_ComposedOf());
			}
			return getGEFWrapper(new OwlsSequenceCreateCommand(req));
		}
		if (OwlsElementTypes.OwlsSplit_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsCompositeProcess_ComposedOf());
			}
			return getGEFWrapper(new OwlsSplitCreateCommand(req));
		}
		if (OwlsElementTypes.OwlsAnyOrder_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsCompositeProcess_ComposedOf());
			}
			return getGEFWrapper(new OwlsAnyOrderCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
