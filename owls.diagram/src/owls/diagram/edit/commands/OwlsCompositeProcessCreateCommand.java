package owls.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsCompositeProcess;
import owls.OwlsPackage;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsCompositeProcessCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OwlsCompositeProcessCreateCommand(CreateElementRequest req) {
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
	protected EClass getEClassToEdit() {
		return OwlsPackage.eINSTANCE.getOwlsControlConstruct();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OwlsCompositeProcess newElement = (OwlsCompositeProcess) super
				.doDefaultElementCreation();
		if (newElement != null) {
			OwlsElementTypes.Initializers.OwlsCompositeProcess_2002
					.init(newElement);
		}
		return newElement;
	}

}
