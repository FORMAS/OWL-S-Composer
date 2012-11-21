package owls.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import owls.OwlsAssign;
import owls.OwlsProcess;
import owls.diagram.edit.policies.OwlsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OwlsAssignReorientCommand extends EditElementCommand {

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
	public OwlsAssignReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof OwlsAssign)) {
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
		OwlsProcess target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess container = (OwlsProcess) getLink().eContainer();
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOwlsAssign_3001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OwlsProcess && newEnd instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess source = getLink().getSource();
		if (!(getLink().eContainer() instanceof OwlsProcess)) {
			return false;
		}
		OwlsProcess container = (OwlsProcess) getLink().eContainer();
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOwlsAssign_3001(container, source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OwlsAssign getLink() {
		return (OwlsAssign) getElementToEdit();
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
