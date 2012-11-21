package owls.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import owls.OwlsPackage;

/**
 * @generated
 */
public class OwlsDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == OwlsPackage.eINSTANCE.getOwls()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsOntology()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsService()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsProfile()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsWsdlGrounding()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsWsdlAtomicProcessGrounding()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsProcess()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsAtomicProcess()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsCompositeProcess()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsControlConstruct()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsSequence()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsSplit()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsAnyOrder()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsPeform()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsParameter()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsInput()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsOutput()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsAssign()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsClientMessage()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsInputClientMessage()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsAssignClient()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsAssignInputClient()) {
			return true;
		}
		if (eClass == OwlsPackage.eINSTANCE.getOwlsAssignOutputClient()) {
			return true;
		}
		return false;
	}

}
