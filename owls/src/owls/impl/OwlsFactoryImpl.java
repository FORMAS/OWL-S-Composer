/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import owls.OwlsFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsFactoryImpl extends EFactoryImpl implements OwlsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwlsFactory init() {
		try {
			OwlsFactory theOwlsFactory = (OwlsFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/owls/model/owls.ecore"); 
			if (theOwlsFactory != null) {
				return theOwlsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OwlsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OwlsPackage.OWLS: return createOwls();
			case OwlsPackage.OWLS_ONTOLOGY: return createOwlsOntology();
			case OwlsPackage.OWLS_SERVICE: return createOwlsService();
			case OwlsPackage.OWLS_PROFILE: return createOwlsProfile();
			case OwlsPackage.OWLS_WSDL_GROUNDING: return createOwlsWsdlGrounding();
			case OwlsPackage.OWLS_WSDL_ATOMIC_PROCESS_GROUNDING: return createOwlsWsdlAtomicProcessGrounding();
			case OwlsPackage.OWLS_PROCESS: return createOwlsProcess();
			case OwlsPackage.OWLS_ATOMIC_PROCESS: return createOwlsAtomicProcess();
			case OwlsPackage.OWLS_COMPOSITE_PROCESS: return createOwlsCompositeProcess();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT: return createOwlsControlConstruct();
			case OwlsPackage.OWLS_SEQUENCE: return createOwlsSequence();
			case OwlsPackage.OWLS_SPLIT: return createOwlsSplit();
			case OwlsPackage.OWLS_ANY_ORDER: return createOwlsAnyOrder();
			case OwlsPackage.OWLS_PEFORM: return createOwlsPeform();
			case OwlsPackage.OWLS_PARAMETER: return createOwlsParameter();
			case OwlsPackage.OWLS_INPUT: return createOwlsInput();
			case OwlsPackage.OWLS_OUTPUT: return createOwlsOutput();
			case OwlsPackage.OWLS_ASSIGN: return createOwlsAssign();
			case OwlsPackage.OWLS_CLIENT_MESSAGE: return createOwlsClientMessage();
			case OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE: return createOwlsInputClientMessage();
			case OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE: return createOwlsOutputClientMessage();
			case OwlsPackage.OWLS_ASSIGN_CLIENT: return createOwlsAssignClient();
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT: return createOwlsAssignInputClient();
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT: return createOwlsAssignOutputClient();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owls createOwls() {
		OwlsImpl owls = new OwlsImpl();
		return owls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOntology createOwlsOntology() {
		OwlsOntologyImpl owlsOntology = new OwlsOntologyImpl();
		return owlsOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsService createOwlsService() {
		OwlsServiceImpl owlsService = new OwlsServiceImpl();
		return owlsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProfile createOwlsProfile() {
		OwlsProfileImpl owlsProfile = new OwlsProfileImpl();
		return owlsProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsWsdlGrounding createOwlsWsdlGrounding() {
		OwlsWsdlGroundingImpl owlsWsdlGrounding = new OwlsWsdlGroundingImpl();
		return owlsWsdlGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAtomicProcess createOwlsAtomicProcess() {
		OwlsAtomicProcessImpl owlsAtomicProcess = new OwlsAtomicProcessImpl();
		return owlsAtomicProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsCompositeProcess createOwlsCompositeProcess() {
		OwlsCompositeProcessImpl owlsCompositeProcess = new OwlsCompositeProcessImpl();
		return owlsCompositeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsControlConstruct createOwlsControlConstruct() {
		OwlsControlConstructImpl owlsControlConstruct = new OwlsControlConstructImpl();
		return owlsControlConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput createOwlsInput() {
		OwlsInputImpl owlsInput = new OwlsInputImpl();
		return owlsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput createOwlsOutput() {
		OwlsOutputImpl owlsOutput = new OwlsOutputImpl();
		return owlsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsWsdlAtomicProcessGrounding createOwlsWsdlAtomicProcessGrounding() {
		OwlsWsdlAtomicProcessGroundingImpl owlsWsdlAtomicProcessGrounding = new OwlsWsdlAtomicProcessGroundingImpl();
		return owlsWsdlAtomicProcessGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess createOwlsProcess() {
		OwlsProcessImpl owlsProcess = new OwlsProcessImpl();
		return owlsProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAssign createOwlsAssign() {
		OwlsAssignImpl owlsAssign = new OwlsAssignImpl();
		return owlsAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsClientMessage createOwlsClientMessage() {
		OwlsClientMessageImpl owlsClientMessage = new OwlsClientMessageImpl();
		return owlsClientMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInputClientMessage createOwlsInputClientMessage() {
		OwlsInputClientMessageImpl owlsInputClientMessage = new OwlsInputClientMessageImpl();
		return owlsInputClientMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutputClientMessage createOwlsOutputClientMessage() {
		OwlsOutputClientMessageImpl owlsOutputClientMessage = new OwlsOutputClientMessageImpl();
		return owlsOutputClientMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAssignClient createOwlsAssignClient() {
		OwlsAssignClientImpl owlsAssignClient = new OwlsAssignClientImpl();
		return owlsAssignClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAssignInputClient createOwlsAssignInputClient() {
		OwlsAssignInputClientImpl owlsAssignInputClient = new OwlsAssignInputClientImpl();
		return owlsAssignInputClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAssignOutputClient createOwlsAssignOutputClient() {
		OwlsAssignOutputClientImpl owlsAssignOutputClient = new OwlsAssignOutputClientImpl();
		return owlsAssignOutputClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsPeform createOwlsPeform() {
		OwlsPeformImpl owlsPeform = new OwlsPeformImpl();
		return owlsPeform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsParameter createOwlsParameter() {
		OwlsParameterImpl owlsParameter = new OwlsParameterImpl();
		return owlsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsSequence createOwlsSequence() {
		OwlsSequenceImpl owlsSequence = new OwlsSequenceImpl();
		return owlsSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsSplit createOwlsSplit() {
		OwlsSplitImpl owlsSplit = new OwlsSplitImpl();
		return owlsSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAnyOrder createOwlsAnyOrder() {
		OwlsAnyOrderImpl owlsAnyOrder = new OwlsAnyOrderImpl();
		return owlsAnyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsPackage getOwlsPackage() {
		return (OwlsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OwlsPackage getPackage() {
		return OwlsPackage.eINSTANCE;
	}

} //OwlsFactoryImpl
