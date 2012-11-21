/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see owls.OwlsPackage
 * @generated
 */
public class OwlsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OwlsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsSwitch<Adapter> modelSwitch =
		new OwlsSwitch<Adapter>() {
			@Override
			public Adapter caseOwls(Owls object) {
				return createOwlsAdapter();
			}
			@Override
			public Adapter caseOwlsOntology(OwlsOntology object) {
				return createOwlsOntologyAdapter();
			}
			@Override
			public Adapter caseOwlsService(OwlsService object) {
				return createOwlsServiceAdapter();
			}
			@Override
			public Adapter caseOwlsProfile(OwlsProfile object) {
				return createOwlsProfileAdapter();
			}
			@Override
			public Adapter caseOwlsWsdlGrounding(OwlsWsdlGrounding object) {
				return createOwlsWsdlGroundingAdapter();
			}
			@Override
			public Adapter caseOwlsWsdlAtomicProcessGrounding(OwlsWsdlAtomicProcessGrounding object) {
				return createOwlsWsdlAtomicProcessGroundingAdapter();
			}
			@Override
			public Adapter caseOwlsProcess(OwlsProcess object) {
				return createOwlsProcessAdapter();
			}
			@Override
			public Adapter caseOwlsAtomicProcess(OwlsAtomicProcess object) {
				return createOwlsAtomicProcessAdapter();
			}
			@Override
			public Adapter caseOwlsCompositeProcess(OwlsCompositeProcess object) {
				return createOwlsCompositeProcessAdapter();
			}
			@Override
			public Adapter caseOwlsControlConstruct(OwlsControlConstruct object) {
				return createOwlsControlConstructAdapter();
			}
			@Override
			public Adapter caseOwlsSequence(OwlsSequence object) {
				return createOwlsSequenceAdapter();
			}
			@Override
			public Adapter caseOwlsSplit(OwlsSplit object) {
				return createOwlsSplitAdapter();
			}
			@Override
			public Adapter caseOwlsAnyOrder(OwlsAnyOrder object) {
				return createOwlsAnyOrderAdapter();
			}
			@Override
			public Adapter caseOwlsPeform(OwlsPeform object) {
				return createOwlsPeformAdapter();
			}
			@Override
			public Adapter caseOwlsParameter(OwlsParameter object) {
				return createOwlsParameterAdapter();
			}
			@Override
			public Adapter caseOwlsInput(OwlsInput object) {
				return createOwlsInputAdapter();
			}
			@Override
			public Adapter caseOwlsOutput(OwlsOutput object) {
				return createOwlsOutputAdapter();
			}
			@Override
			public Adapter caseOwlsAssign(OwlsAssign object) {
				return createOwlsAssignAdapter();
			}
			@Override
			public Adapter caseOwlsClientMessage(OwlsClientMessage object) {
				return createOwlsClientMessageAdapter();
			}
			@Override
			public Adapter caseOwlsInputClientMessage(OwlsInputClientMessage object) {
				return createOwlsInputClientMessageAdapter();
			}
			@Override
			public Adapter caseOwlsOutputClientMessage(OwlsOutputClientMessage object) {
				return createOwlsOutputClientMessageAdapter();
			}
			@Override
			public Adapter caseOwlsAssignClient(OwlsAssignClient object) {
				return createOwlsAssignClientAdapter();
			}
			@Override
			public Adapter caseOwlsAssignInputClient(OwlsAssignInputClient object) {
				return createOwlsAssignInputClientAdapter();
			}
			@Override
			public Adapter caseOwlsAssignOutputClient(OwlsAssignOutputClient object) {
				return createOwlsAssignOutputClientAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link owls.Owls <em>Owls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Owls
	 * @generated
	 */
	public Adapter createOwlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsOntology
	 * @generated
	 */
	public Adapter createOwlsOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsService
	 * @generated
	 */
	public Adapter createOwlsServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsProfile
	 * @generated
	 */
	public Adapter createOwlsProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsWsdlGrounding <em>Wsdl Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsWsdlGrounding
	 * @generated
	 */
	public Adapter createOwlsWsdlGroundingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsAtomicProcess <em>Atomic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsAtomicProcess
	 * @generated
	 */
	public Adapter createOwlsAtomicProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsCompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsCompositeProcess
	 * @generated
	 */
	public Adapter createOwlsCompositeProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsControlConstruct
	 * @generated
	 */
	public Adapter createOwlsControlConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsInput
	 * @generated
	 */
	public Adapter createOwlsInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsOutput
	 * @generated
	 */
	public Adapter createOwlsOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsWsdlAtomicProcessGrounding <em>Wsdl Atomic Process Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsWsdlAtomicProcessGrounding
	 * @generated
	 */
	public Adapter createOwlsWsdlAtomicProcessGroundingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsProcess
	 * @generated
	 */
	public Adapter createOwlsProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsAssign
	 * @generated
	 */
	public Adapter createOwlsAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsClientMessage <em>Client Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsClientMessage
	 * @generated
	 */
	public Adapter createOwlsClientMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsInputClientMessage <em>Input Client Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsInputClientMessage
	 * @generated
	 */
	public Adapter createOwlsInputClientMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsOutputClientMessage <em>Output Client Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsOutputClientMessage
	 * @generated
	 */
	public Adapter createOwlsOutputClientMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsAssignClient <em>Assign Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsAssignClient
	 * @generated
	 */
	public Adapter createOwlsAssignClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsAssignInputClient <em>Assign Input Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsAssignInputClient
	 * @generated
	 */
	public Adapter createOwlsAssignInputClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsAssignOutputClient <em>Assign Output Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsAssignOutputClient
	 * @generated
	 */
	public Adapter createOwlsAssignOutputClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsPeform <em>Peform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsPeform
	 * @generated
	 */
	public Adapter createOwlsPeformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsParameter
	 * @generated
	 */
	public Adapter createOwlsParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsSequence
	 * @generated
	 */
	public Adapter createOwlsSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsSplit
	 * @generated
	 */
	public Adapter createOwlsSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.OwlsAnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.OwlsAnyOrder
	 * @generated
	 */
	public Adapter createOwlsAnyOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OwlsAdapterFactory
