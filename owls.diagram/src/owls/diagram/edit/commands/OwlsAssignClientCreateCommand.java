package owls.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import owls.OwlsAssignInputClient;
import owls.OwlsFactory;
import owls.OwlsInputClientMessage;
import owls.OwlsPackage;
import owls.OwlsProcess;
import owls.diagram.edit.policies.OwlsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OwlsAssignClientCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private OwlsProcess container;

	/**
	 * @generated
	 */
	public OwlsAssignClientCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(OwlsPackage.eINSTANCE
					.getOwlsProcess_MessagesBindings());
		}

		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof OwlsProcess) {
				container = (OwlsProcess) element;
				super.setElementToEdit(container);
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && !(source instanceof OwlsInputClientMessage)) {
			return false;
		}
		if (target != null && !(target instanceof OwlsProcess)) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return OwlsBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateOwlsAssignInputClient_3002(getContainer(),
						getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		// owls.OwlsAssignInputClient newElement = (owls.OwlsAssignInputClient) super.doDefaultElementCreation();
		OwlsAssignInputClient newElement = OwlsFactory.eINSTANCE
				.createOwlsAssignInputClient();
		getContainer().getMessagesBindings().add(newElement);
		newElement.setClientReference(getSource());
		newElement.setProcessReference(getTarget());
		return newElement;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return OwlsPackage.eINSTANCE.getOwlsProcess();
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected OwlsInputClientMessage getSource() {
		return (OwlsInputClientMessage) source;
	}

	/**
	 * @generated
	 */
	protected OwlsProcess getTarget() {
		return (OwlsProcess) target;
	}

	/**
	 * @generated
	 */
	public OwlsProcess getContainer() {
		return container;
	}
}
