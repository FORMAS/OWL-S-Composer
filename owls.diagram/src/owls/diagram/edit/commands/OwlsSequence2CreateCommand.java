package owls.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsPackage;
import owls.OwlsSequence;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsSequence2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OwlsSequence2CreateCommand(CreateElementRequest req) {
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
		OwlsSequence newElement = (OwlsSequence) super
				.doDefaultElementCreation();
		if (newElement != null) {
			OwlsElementTypes.Initializers.OwlsSequence_2004.init(newElement);
		}
		return newElement;
	}

}
