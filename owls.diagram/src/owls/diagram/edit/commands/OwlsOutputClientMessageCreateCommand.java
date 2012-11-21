package owls.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsControlConstruct;
import owls.OwlsOutputClientMessage;
import owls.OwlsPackage;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsOutputClientMessageCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OwlsOutputClientMessageCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		OwlsControlConstruct container = (OwlsControlConstruct) getElementToEdit();
		if (container.getMessages().size() >= 2) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return OwlsPackage.eINSTANCE.getOwlsControlConstruct();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OwlsOutputClientMessage newElement = (OwlsOutputClientMessage) super
				.doDefaultElementCreation();
		if (newElement != null) {
			OwlsElementTypes.Initializers.OwlsOutputClientMessage_2007
					.init(newElement);
		}
		return newElement;
	}

}
