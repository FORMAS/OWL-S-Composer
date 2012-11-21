package owls.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import owls.OwlsAssignOutputClient;
import owls.OwlsOutputClientMessage;
import owls.OwlsProcess;
import owls.diagram.edit.policies.OwlsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OwlsAssignClient2ReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public OwlsAssignClient2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof OwlsAssignOutputClient)) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof OwlsProcess && newEnd instanceof OwlsProcess)) {
			return false;
		}
		OwlsOutputClientMessage target = getLink().getClientReference();
		if (!(getLink().eContainer() instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess container = (OwlsProcess) getLink().eContainer();
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOwlsAssignOutputClient_3003(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OwlsOutputClientMessage && newEnd instanceof OwlsOutputClientMessage)) {
			return false;
		}
		OwlsProcess source = getLink().getProcessReference();
		if (!(getLink().eContainer() instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess container = (OwlsProcess) getLink().eContainer();
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOwlsAssignOutputClient_3003(container, source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setProcessReference(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setClientReference(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OwlsAssignOutputClient getLink() {
		return (OwlsAssignOutputClient) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OwlsProcess getOldSource() {
		return (OwlsProcess) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OwlsProcess getNewSource() {
		return (OwlsProcess) newEnd;
	}

	/**
	 * @generated
	 */
	protected OwlsOutputClientMessage getOldTarget() {
		return (OwlsOutputClientMessage) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OwlsOutputClientMessage getNewTarget() {
		return (OwlsOutputClientMessage) newEnd;
	}
}
