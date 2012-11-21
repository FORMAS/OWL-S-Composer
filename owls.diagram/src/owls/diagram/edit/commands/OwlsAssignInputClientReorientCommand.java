package owls.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import owls.OwlsAssignInputClient;
import owls.OwlsInputClientMessage;
import owls.OwlsProcess;
import owls.diagram.edit.policies.OwlsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OwlsAssignInputClientReorientCommand extends EditElementCommand {

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
	public OwlsAssignInputClientReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof OwlsAssignInputClient)) {
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
		if (!(oldEnd instanceof OwlsInputClientMessage && newEnd instanceof OwlsInputClientMessage)) {
			return false;
		}
		OwlsProcess target = getLink().getProcessReference();
		if (!(getLink().eContainer() instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess container = (OwlsProcess) getLink().eContainer();
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOwlsAssignInputClient_3002(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OwlsProcess && newEnd instanceof OwlsProcess)) {
			return false;
		}
		OwlsInputClientMessage source = getLink().getClientReference();
		if (!(getLink().eContainer() instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess container = (OwlsProcess) getLink().eContainer();
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOwlsAssignInputClient_3002(container, source,
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
		getLink().setClientReference(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setProcessReference(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OwlsAssignInputClient getLink() {
		return (OwlsAssignInputClient) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OwlsInputClientMessage getOldSource() {
		return (OwlsInputClientMessage) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OwlsInputClientMessage getNewSource() {
		return (OwlsInputClientMessage) newEnd;
	}

	/**
	 * @generated
	 */
	protected OwlsProcess getOldTarget() {
		return (OwlsProcess) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OwlsProcess getNewTarget() {
		return (OwlsProcess) newEnd;
	}
}
