/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import owls.*;
import owls.Owls;
import owls.OwlsAnyOrder;
import owls.OwlsAssign;
import owls.OwlsAssignClient;
import owls.OwlsAssignInputClient;
import owls.OwlsAssignOutputClient;
import owls.OwlsAtomicProcess;
import owls.OwlsClientMessage;
import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsInput;
import owls.OwlsInputClientMessage;
import owls.OwlsOntology;
import owls.OwlsOutput;
import owls.OwlsOutputClientMessage;
import owls.OwlsPackage;
import owls.OwlsParameter;
import owls.OwlsPeform;
import owls.OwlsProcess;
import owls.OwlsProfile;
import owls.OwlsSequence;
import owls.OwlsService;
import owls.OwlsSplit;
import owls.OwlsWsdlAtomicProcessGrounding;
import owls.OwlsWsdlGrounding;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see owls.OwlsPackage
 * @generated
 */
public class OwlsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsSwitch() {
		if (modelPackage == null) {
			modelPackage = OwlsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OwlsPackage.OWLS: {
				Owls owls = (Owls)theEObject;
				T result = caseOwls(owls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ONTOLOGY: {
				OwlsOntology owlsOntology = (OwlsOntology)theEObject;
				T result = caseOwlsOntology(owlsOntology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_SERVICE: {
				OwlsService owlsService = (OwlsService)theEObject;
				T result = caseOwlsService(owlsService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_PROFILE: {
				OwlsProfile owlsProfile = (OwlsProfile)theEObject;
				T result = caseOwlsProfile(owlsProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_WSDL_GROUNDING: {
				OwlsWsdlGrounding owlsWsdlGrounding = (OwlsWsdlGrounding)theEObject;
				T result = caseOwlsWsdlGrounding(owlsWsdlGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_WSDL_ATOMIC_PROCESS_GROUNDING: {
				OwlsWsdlAtomicProcessGrounding owlsWsdlAtomicProcessGrounding = (OwlsWsdlAtomicProcessGrounding)theEObject;
				T result = caseOwlsWsdlAtomicProcessGrounding(owlsWsdlAtomicProcessGrounding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_PROCESS: {
				OwlsProcess owlsProcess = (OwlsProcess)theEObject;
				T result = caseOwlsProcess(owlsProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ATOMIC_PROCESS: {
				OwlsAtomicProcess owlsAtomicProcess = (OwlsAtomicProcess)theEObject;
				T result = caseOwlsAtomicProcess(owlsAtomicProcess);
				if (result == null) result = caseOwlsProcess(owlsAtomicProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_COMPOSITE_PROCESS: {
				OwlsCompositeProcess owlsCompositeProcess = (OwlsCompositeProcess)theEObject;
				T result = caseOwlsCompositeProcess(owlsCompositeProcess);
				if (result == null) result = caseOwlsProcess(owlsCompositeProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT: {
				OwlsControlConstruct owlsControlConstruct = (OwlsControlConstruct)theEObject;
				T result = caseOwlsControlConstruct(owlsControlConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_SEQUENCE: {
				OwlsSequence owlsSequence = (OwlsSequence)theEObject;
				T result = caseOwlsSequence(owlsSequence);
				if (result == null) result = caseOwlsControlConstruct(owlsSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_SPLIT: {
				OwlsSplit owlsSplit = (OwlsSplit)theEObject;
				T result = caseOwlsSplit(owlsSplit);
				if (result == null) result = caseOwlsControlConstruct(owlsSplit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ANY_ORDER: {
				OwlsAnyOrder owlsAnyOrder = (OwlsAnyOrder)theEObject;
				T result = caseOwlsAnyOrder(owlsAnyOrder);
				if (result == null) result = caseOwlsControlConstruct(owlsAnyOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_PEFORM: {
				OwlsPeform owlsPeform = (OwlsPeform)theEObject;
				T result = caseOwlsPeform(owlsPeform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_PARAMETER: {
				OwlsParameter owlsParameter = (OwlsParameter)theEObject;
				T result = caseOwlsParameter(owlsParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_INPUT: {
				OwlsInput owlsInput = (OwlsInput)theEObject;
				T result = caseOwlsInput(owlsInput);
				if (result == null) result = caseOwlsParameter(owlsInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_OUTPUT: {
				OwlsOutput owlsOutput = (OwlsOutput)theEObject;
				T result = caseOwlsOutput(owlsOutput);
				if (result == null) result = caseOwlsParameter(owlsOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ASSIGN: {
				OwlsAssign owlsAssign = (OwlsAssign)theEObject;
				T result = caseOwlsAssign(owlsAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_CLIENT_MESSAGE: {
				OwlsClientMessage owlsClientMessage = (OwlsClientMessage)theEObject;
				T result = caseOwlsClientMessage(owlsClientMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE: {
				OwlsInputClientMessage owlsInputClientMessage = (OwlsInputClientMessage)theEObject;
				T result = caseOwlsInputClientMessage(owlsInputClientMessage);
				if (result == null) result = caseOwlsClientMessage(owlsInputClientMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE: {
				OwlsOutputClientMessage owlsOutputClientMessage = (OwlsOutputClientMessage)theEObject;
				T result = caseOwlsOutputClientMessage(owlsOutputClientMessage);
				if (result == null) result = caseOwlsClientMessage(owlsOutputClientMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ASSIGN_CLIENT: {
				OwlsAssignClient owlsAssignClient = (OwlsAssignClient)theEObject;
				T result = caseOwlsAssignClient(owlsAssignClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT: {
				OwlsAssignInputClient owlsAssignInputClient = (OwlsAssignInputClient)theEObject;
				T result = caseOwlsAssignInputClient(owlsAssignInputClient);
				if (result == null) result = caseOwlsAssignClient(owlsAssignInputClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT: {
				OwlsAssignOutputClient owlsAssignOutputClient = (OwlsAssignOutputClient)theEObject;
				T result = caseOwlsAssignOutputClient(owlsAssignOutputClient);
				if (result == null) result = caseOwlsAssignClient(owlsAssignOutputClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwls(Owls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsOntology(OwlsOntology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsService(OwlsService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsProfile(OwlsProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsWsdlGrounding(OwlsWsdlGrounding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsAtomicProcess(OwlsAtomicProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsCompositeProcess(OwlsCompositeProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsControlConstruct(OwlsControlConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsInput(OwlsInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsOutput(OwlsOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsdl Atomic Process Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsdl Atomic Process Grounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsWsdlAtomicProcessGrounding(OwlsWsdlAtomicProcessGrounding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsProcess(OwlsProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsAssign(OwlsAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsClientMessage(OwlsClientMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Client Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Client Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsInputClientMessage(OwlsInputClientMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Client Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Client Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsOutputClientMessage(OwlsOutputClientMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsAssignClient(OwlsAssignClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Input Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Input Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsAssignInputClient(OwlsAssignInputClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Output Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Output Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsAssignOutputClient(OwlsAssignOutputClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsPeform(OwlsPeform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsParameter(OwlsParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsSequence(OwlsSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsSplit(OwlsSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwlsAnyOrder(OwlsAnyOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OwlsSwitch
