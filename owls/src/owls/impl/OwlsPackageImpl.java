/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsPackageImpl extends EPackageImpl implements OwlsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsOntologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsWsdlGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsAtomicProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsCompositeProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsControlConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsWsdlAtomicProcessGroundingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsClientMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsInputClientMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsOutputClientMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsAssignClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsAssignInputClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsAssignOutputClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsPeformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlsAnyOrderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see owls.OwlsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OwlsPackageImpl() {
		super(eNS_URI, OwlsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OwlsPackage init() {
		if (isInited) return (OwlsPackage)EPackage.Registry.INSTANCE.getEPackage(OwlsPackage.eNS_URI);

		// Obtain or create and register package
		OwlsPackageImpl theOwlsPackage = (OwlsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OwlsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OwlsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOwlsPackage.createPackageContents();

		// Initialize created meta-data
		theOwlsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOwlsPackage.freeze();

		return theOwlsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwls() {
		return owlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwls_Namespace() {
		return (EAttribute)owlsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwls_Ontology() {
		return (EReference)owlsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwls_Service() {
		return (EReference)owlsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwls_Profile() {
		return (EReference)owlsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwls_Process() {
		return (EReference)owlsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsOntology() {
		return owlsOntologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsOntology_Imports() {
		return (EAttribute)owlsOntologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsService() {
		return owlsServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsService_ID() {
		return (EAttribute)owlsServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsService_Presents() {
		return (EReference)owlsServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsService_DescribedBy() {
		return (EReference)owlsServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsService_Supports() {
		return (EReference)owlsServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsService_OwnedBy() {
		return (EReference)owlsServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsProfile() {
		return owlsProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsProfile_ID() {
		return (EAttribute)owlsProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProfile_IsPresentedBy() {
		return (EReference)owlsProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProfile_HasProcess() {
		return (EReference)owlsProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsProfile_ServiceName() {
		return (EAttribute)owlsProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsWsdlGrounding() {
		return owlsWsdlGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsWsdlGrounding_ID() {
		return (EAttribute)owlsWsdlGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsWsdlGrounding_SupportedBy() {
		return (EReference)owlsWsdlGroundingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsWsdlGrounding_HasAtomicProcessGrounding() {
		return (EReference)owlsWsdlGroundingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsAtomicProcess() {
		return owlsAtomicProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsCompositeProcess() {
		return owlsCompositeProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsCompositeProcess_ComposedOf() {
		return (EReference)owlsCompositeProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsControlConstruct() {
		return owlsControlConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsControlConstruct_Processes() {
		return (EReference)owlsControlConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsControlConstruct_Constructs() {
		return (EReference)owlsControlConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsControlConstruct_Elements() {
		return (EReference)owlsControlConstructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsControlConstruct_Messages() {
		return (EReference)owlsControlConstructEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsInput() {
		return owlsInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsOutput() {
		return owlsOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsWsdlAtomicProcessGrounding() {
		return owlsWsdlAtomicProcessGroundingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsWsdlAtomicProcessGrounding_ID() {
		return (EAttribute)owlsWsdlAtomicProcessGroundingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsProcess() {
		return owlsProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsProcess_ID() {
		return (EAttribute)owlsProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsProcess_Label() {
		return (EAttribute)owlsProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsProcess_ProcessURI() {
		return (EAttribute)owlsProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsProcess_ReferenceName() {
		return (EAttribute)owlsProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProcess_Describes() {
		return (EReference)owlsProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProcess_PeformedBy() {
		return (EReference)owlsProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProcess_HasInputs() {
		return (EReference)owlsProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProcess_HasOutputs() {
		return (EReference)owlsProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProcess_Bindings() {
		return (EReference)owlsProcessEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsProcess_MessagesBindings() {
		return (EReference)owlsProcessEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsAssign() {
		return owlsAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssign_Target() {
		return (EReference)owlsAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssign_Source() {
		return (EReference)owlsAssignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssign_InputTarget() {
		return (EReference)owlsAssignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssign_OutputSource() {
		return (EReference)owlsAssignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsClientMessage() {
		return owlsClientMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsInputClientMessage() {
		return owlsInputClientMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsInputClientMessage_ClientInputs() {
		return (EReference)owlsInputClientMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsOutputClientMessage() {
		return owlsOutputClientMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsOutputClientMessage_ClientOutputs() {
		return (EReference)owlsOutputClientMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsAssignClient() {
		return owlsAssignClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignClient_ProcessReference() {
		return (EReference)owlsAssignClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsAssignInputClient() {
		return owlsAssignInputClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignInputClient_ClientReference() {
		return (EReference)owlsAssignInputClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignInputClient_InputReferences() {
		return (EReference)owlsAssignInputClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignInputClient_OutputsReferences() {
		return (EReference)owlsAssignInputClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsAssignOutputClient() {
		return owlsAssignOutputClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignOutputClient_ClientReference() {
		return (EReference)owlsAssignOutputClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignOutputClient_InputReferences() {
		return (EReference)owlsAssignOutputClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsAssignOutputClient_OutputsReferences() {
		return (EReference)owlsAssignOutputClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsPeform() {
		return owlsPeformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsPeform_ID() {
		return (EAttribute)owlsPeformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwlsPeform_Process() {
		return (EReference)owlsPeformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsParameter() {
		return owlsParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsParameter_ID() {
		return (EAttribute)owlsParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsParameter_ParameterType() {
		return (EAttribute)owlsParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwlsParameter_Label() {
		return (EAttribute)owlsParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsSequence() {
		return owlsSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsSplit() {
		return owlsSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwlsAnyOrder() {
		return owlsAnyOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsFactory getOwlsFactory() {
		return (OwlsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		owlsEClass = createEClass(OWLS);
		createEAttribute(owlsEClass, OWLS__NAMESPACE);
		createEReference(owlsEClass, OWLS__ONTOLOGY);
		createEReference(owlsEClass, OWLS__SERVICE);
		createEReference(owlsEClass, OWLS__PROFILE);
		createEReference(owlsEClass, OWLS__PROCESS);

		owlsOntologyEClass = createEClass(OWLS_ONTOLOGY);
		createEAttribute(owlsOntologyEClass, OWLS_ONTOLOGY__IMPORTS);

		owlsServiceEClass = createEClass(OWLS_SERVICE);
		createEAttribute(owlsServiceEClass, OWLS_SERVICE__ID);
		createEReference(owlsServiceEClass, OWLS_SERVICE__PRESENTS);
		createEReference(owlsServiceEClass, OWLS_SERVICE__DESCRIBED_BY);
		createEReference(owlsServiceEClass, OWLS_SERVICE__SUPPORTS);
		createEReference(owlsServiceEClass, OWLS_SERVICE__OWNED_BY);

		owlsProfileEClass = createEClass(OWLS_PROFILE);
		createEAttribute(owlsProfileEClass, OWLS_PROFILE__ID);
		createEAttribute(owlsProfileEClass, OWLS_PROFILE__SERVICE_NAME);
		createEReference(owlsProfileEClass, OWLS_PROFILE__IS_PRESENTED_BY);
		createEReference(owlsProfileEClass, OWLS_PROFILE__HAS_PROCESS);

		owlsWsdlGroundingEClass = createEClass(OWLS_WSDL_GROUNDING);
		createEAttribute(owlsWsdlGroundingEClass, OWLS_WSDL_GROUNDING__ID);
		createEReference(owlsWsdlGroundingEClass, OWLS_WSDL_GROUNDING__SUPPORTED_BY);
		createEReference(owlsWsdlGroundingEClass, OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING);

		owlsWsdlAtomicProcessGroundingEClass = createEClass(OWLS_WSDL_ATOMIC_PROCESS_GROUNDING);
		createEAttribute(owlsWsdlAtomicProcessGroundingEClass, OWLS_WSDL_ATOMIC_PROCESS_GROUNDING__ID);

		owlsProcessEClass = createEClass(OWLS_PROCESS);
		createEAttribute(owlsProcessEClass, OWLS_PROCESS__ID);
		createEAttribute(owlsProcessEClass, OWLS_PROCESS__LABEL);
		createEAttribute(owlsProcessEClass, OWLS_PROCESS__PROCESS_URI);
		createEAttribute(owlsProcessEClass, OWLS_PROCESS__REFERENCE_NAME);
		createEReference(owlsProcessEClass, OWLS_PROCESS__DESCRIBES);
		createEReference(owlsProcessEClass, OWLS_PROCESS__PEFORMED_BY);
		createEReference(owlsProcessEClass, OWLS_PROCESS__HAS_INPUTS);
		createEReference(owlsProcessEClass, OWLS_PROCESS__HAS_OUTPUTS);
		createEReference(owlsProcessEClass, OWLS_PROCESS__BINDINGS);
		createEReference(owlsProcessEClass, OWLS_PROCESS__MESSAGES_BINDINGS);

		owlsAtomicProcessEClass = createEClass(OWLS_ATOMIC_PROCESS);

		owlsCompositeProcessEClass = createEClass(OWLS_COMPOSITE_PROCESS);
		createEReference(owlsCompositeProcessEClass, OWLS_COMPOSITE_PROCESS__COMPOSED_OF);

		owlsControlConstructEClass = createEClass(OWLS_CONTROL_CONSTRUCT);
		createEReference(owlsControlConstructEClass, OWLS_CONTROL_CONSTRUCT__PROCESSES);
		createEReference(owlsControlConstructEClass, OWLS_CONTROL_CONSTRUCT__CONSTRUCTS);
		createEReference(owlsControlConstructEClass, OWLS_CONTROL_CONSTRUCT__ELEMENTS);
		createEReference(owlsControlConstructEClass, OWLS_CONTROL_CONSTRUCT__MESSAGES);

		owlsSequenceEClass = createEClass(OWLS_SEQUENCE);

		owlsSplitEClass = createEClass(OWLS_SPLIT);

		owlsAnyOrderEClass = createEClass(OWLS_ANY_ORDER);

		owlsPeformEClass = createEClass(OWLS_PEFORM);
		createEAttribute(owlsPeformEClass, OWLS_PEFORM__ID);
		createEReference(owlsPeformEClass, OWLS_PEFORM__PROCESS);

		owlsParameterEClass = createEClass(OWLS_PARAMETER);
		createEAttribute(owlsParameterEClass, OWLS_PARAMETER__ID);
		createEAttribute(owlsParameterEClass, OWLS_PARAMETER__PARAMETER_TYPE);
		createEAttribute(owlsParameterEClass, OWLS_PARAMETER__LABEL);

		owlsInputEClass = createEClass(OWLS_INPUT);

		owlsOutputEClass = createEClass(OWLS_OUTPUT);

		owlsAssignEClass = createEClass(OWLS_ASSIGN);
		createEReference(owlsAssignEClass, OWLS_ASSIGN__TARGET);
		createEReference(owlsAssignEClass, OWLS_ASSIGN__SOURCE);
		createEReference(owlsAssignEClass, OWLS_ASSIGN__INPUT_TARGET);
		createEReference(owlsAssignEClass, OWLS_ASSIGN__OUTPUT_SOURCE);

		owlsClientMessageEClass = createEClass(OWLS_CLIENT_MESSAGE);

		owlsInputClientMessageEClass = createEClass(OWLS_INPUT_CLIENT_MESSAGE);
		createEReference(owlsInputClientMessageEClass, OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS);

		owlsOutputClientMessageEClass = createEClass(OWLS_OUTPUT_CLIENT_MESSAGE);
		createEReference(owlsOutputClientMessageEClass, OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS);

		owlsAssignClientEClass = createEClass(OWLS_ASSIGN_CLIENT);
		createEReference(owlsAssignClientEClass, OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE);

		owlsAssignInputClientEClass = createEClass(OWLS_ASSIGN_INPUT_CLIENT);
		createEReference(owlsAssignInputClientEClass, OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE);
		createEReference(owlsAssignInputClientEClass, OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES);
		createEReference(owlsAssignInputClientEClass, OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES);

		owlsAssignOutputClientEClass = createEClass(OWLS_ASSIGN_OUTPUT_CLIENT);
		createEReference(owlsAssignOutputClientEClass, OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE);
		createEReference(owlsAssignOutputClientEClass, OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES);
		createEReference(owlsAssignOutputClientEClass, OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		owlsAtomicProcessEClass.getESuperTypes().add(this.getOwlsProcess());
		owlsCompositeProcessEClass.getESuperTypes().add(this.getOwlsProcess());
		owlsSequenceEClass.getESuperTypes().add(this.getOwlsControlConstruct());
		owlsSplitEClass.getESuperTypes().add(this.getOwlsControlConstruct());
		owlsAnyOrderEClass.getESuperTypes().add(this.getOwlsControlConstruct());
		owlsInputEClass.getESuperTypes().add(this.getOwlsParameter());
		owlsOutputEClass.getESuperTypes().add(this.getOwlsParameter());
		owlsInputClientMessageEClass.getESuperTypes().add(this.getOwlsClientMessage());
		owlsOutputClientMessageEClass.getESuperTypes().add(this.getOwlsClientMessage());
		owlsAssignInputClientEClass.getESuperTypes().add(this.getOwlsAssignClient());
		owlsAssignOutputClientEClass.getESuperTypes().add(this.getOwlsAssignClient());

		// Initialize classes and features; add operations and parameters
		initEClass(owlsEClass, Owls.class, "Owls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwls_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Owls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwls_Ontology(), this.getOwlsOntology(), null, "ontology", null, 0, 1, Owls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwls_Service(), this.getOwlsService(), this.getOwlsService_OwnedBy(), "service", null, 0, 1, Owls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwls_Profile(), this.getOwlsProfile(), null, "profile", null, 0, 1, Owls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwls_Process(), this.getOwlsProcess(), null, "process", null, 0, 1, Owls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsOntologyEClass, OwlsOntology.class, "OwlsOntology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsOntology_Imports(), ecorePackage.getEString(), "imports", null, 0, -1, OwlsOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsServiceEClass, OwlsService.class, "OwlsService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsService_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsService_Presents(), this.getOwlsProfile(), this.getOwlsProfile_IsPresentedBy(), "presents", null, 0, 1, OwlsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsService_DescribedBy(), this.getOwlsProcess(), this.getOwlsProcess_Describes(), "describedBy", null, 0, 1, OwlsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsService_Supports(), this.getOwlsWsdlGrounding(), this.getOwlsWsdlGrounding_SupportedBy(), "supports", null, 0, 1, OwlsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsService_OwnedBy(), this.getOwls(), this.getOwls_Service(), "ownedBy", null, 0, 1, OwlsService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsProfileEClass, OwlsProfile.class, "OwlsProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsProfile_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwlsProfile_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, OwlsProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProfile_IsPresentedBy(), this.getOwlsService(), this.getOwlsService_Presents(), "isPresentedBy", null, 0, 1, OwlsProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProfile_HasProcess(), this.getOwlsProcess(), null, "hasProcess", null, 0, 1, OwlsProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsWsdlGroundingEClass, OwlsWsdlGrounding.class, "OwlsWsdlGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsWsdlGrounding_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsWsdlGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsWsdlGrounding_SupportedBy(), this.getOwlsService(), this.getOwlsService_Supports(), "supportedBy", null, 0, 1, OwlsWsdlGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsWsdlGrounding_HasAtomicProcessGrounding(), this.getOwlsWsdlAtomicProcessGrounding(), null, "hasAtomicProcessGrounding", null, 0, -1, OwlsWsdlGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOwlsWsdlGrounding_HasAtomicProcessGrounding().getEKeys().add(this.getOwlsWsdlAtomicProcessGrounding_ID());

		initEClass(owlsWsdlAtomicProcessGroundingEClass, OwlsWsdlAtomicProcessGrounding.class, "OwlsWsdlAtomicProcessGrounding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsWsdlAtomicProcessGrounding_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsWsdlAtomicProcessGrounding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsProcessEClass, OwlsProcess.class, "OwlsProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsProcess_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwlsProcess_Label(), ecorePackage.getEString(), "label", null, 0, 1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwlsProcess_ProcessURI(), ecorePackage.getEString(), "processURI", null, 0, 1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwlsProcess_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 0, 1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProcess_Describes(), this.getOwlsService(), this.getOwlsService_DescribedBy(), "describes", null, 0, 1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProcess_PeformedBy(), this.getOwlsPeform(), this.getOwlsPeform_Process(), "peformedBy", null, 0, 1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProcess_HasInputs(), this.getOwlsInput(), null, "hasInputs", null, 0, -1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProcess_HasOutputs(), this.getOwlsOutput(), null, "hasOutputs", null, 0, -1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProcess_Bindings(), this.getOwlsAssign(), this.getOwlsAssign_Target(), "bindings", null, 0, -1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsProcess_MessagesBindings(), this.getOwlsAssignClient(), this.getOwlsAssignClient_ProcessReference(), "messagesBindings", null, 0, -1, OwlsProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsAtomicProcessEClass, OwlsAtomicProcess.class, "OwlsAtomicProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsCompositeProcessEClass, OwlsCompositeProcess.class, "OwlsCompositeProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsCompositeProcess_ComposedOf(), this.getOwlsControlConstruct(), null, "composedOf", null, 1, 1, OwlsCompositeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsControlConstructEClass, OwlsControlConstruct.class, "OwlsControlConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsControlConstruct_Processes(), this.getOwlsProcess(), null, "processes", null, 0, -1, OwlsControlConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsControlConstruct_Constructs(), this.getOwlsControlConstruct(), null, "constructs", null, 0, -1, OwlsControlConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsControlConstruct_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, OwlsControlConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsControlConstruct_Messages(), this.getOwlsClientMessage(), null, "messages", null, 2, 2, OwlsControlConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsSequenceEClass, OwlsSequence.class, "OwlsSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsSplitEClass, OwlsSplit.class, "OwlsSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsAnyOrderEClass, OwlsAnyOrder.class, "OwlsAnyOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsPeformEClass, OwlsPeform.class, "OwlsPeform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsPeform_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsPeform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsPeform_Process(), this.getOwlsProcess(), this.getOwlsProcess_PeformedBy(), "process", null, 0, 1, OwlsPeform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsParameterEClass, OwlsParameter.class, "OwlsParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwlsParameter_ID(), ecorePackage.getEString(), "iD", null, 0, 1, OwlsParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwlsParameter_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, OwlsParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwlsParameter_Label(), ecorePackage.getEString(), "label", null, 0, 1, OwlsParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsInputEClass, OwlsInput.class, "OwlsInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsOutputEClass, OwlsOutput.class, "OwlsOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsAssignEClass, OwlsAssign.class, "OwlsAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsAssign_Target(), this.getOwlsProcess(), this.getOwlsProcess_Bindings(), "target", null, 0, 1, OwlsAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssign_Source(), this.getOwlsProcess(), null, "source", null, 0, 1, OwlsAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssign_InputTarget(), this.getOwlsInput(), null, "inputTarget", null, 1, 1, OwlsAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssign_OutputSource(), this.getOwlsOutput(), null, "outputSource", null, 1, 1, OwlsAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsClientMessageEClass, OwlsClientMessage.class, "OwlsClientMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlsInputClientMessageEClass, OwlsInputClientMessage.class, "OwlsInputClientMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsInputClientMessage_ClientInputs(), this.getOwlsInput(), null, "clientInputs", null, 0, -1, OwlsInputClientMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsOutputClientMessageEClass, OwlsOutputClientMessage.class, "OwlsOutputClientMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsOutputClientMessage_ClientOutputs(), this.getOwlsOutput(), null, "clientOutputs", null, 0, -1, OwlsOutputClientMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsAssignClientEClass, OwlsAssignClient.class, "OwlsAssignClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsAssignClient_ProcessReference(), this.getOwlsProcess(), this.getOwlsProcess_MessagesBindings(), "processReference", null, 0, 1, OwlsAssignClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsAssignInputClientEClass, OwlsAssignInputClient.class, "OwlsAssignInputClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsAssignInputClient_ClientReference(), this.getOwlsInputClientMessage(), null, "clientReference", null, 0, 1, OwlsAssignInputClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssignInputClient_InputReferences(), this.getOwlsInput(), null, "inputReferences", null, 1, 1, OwlsAssignInputClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssignInputClient_OutputsReferences(), this.getOwlsInput(), null, "outputsReferences", null, 1, 1, OwlsAssignInputClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlsAssignOutputClientEClass, OwlsAssignOutputClient.class, "OwlsAssignOutputClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwlsAssignOutputClient_ClientReference(), this.getOwlsOutputClientMessage(), null, "clientReference", null, 0, 1, OwlsAssignOutputClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssignOutputClient_InputReferences(), this.getOwlsOutput(), null, "inputReferences", null, 1, 1, OwlsAssignOutputClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwlsAssignOutputClient_OutputsReferences(), this.getOwlsOutput(), null, "outputsReferences", null, 1, 1, OwlsAssignOutputClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OwlsPackageImpl
