package owls.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsAnyOrder;
import owls.OwlsCompositeProcess;
import owls.OwlsPackage;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsAnyOrderCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OwlsAnyOrderCreateCommand(CreateElementRequest req) {
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
		OwlsCompositeProcess container = (OwlsCompositeProcess) getElementToEdit();
		if (container.getComposedOf() != null) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return OwlsPackage.eINSTANCE.getOwlsCompositeProcess();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OwlsAnyOrder newElement = (OwlsAnyOrder) super
				.doDefaultElementCreation();
		if (newElement != null) {
			OwlsElementTypes.Initializers.OwlsAnyOrder_1003.init(newElement);
		}
		return newElement;
	}

}
