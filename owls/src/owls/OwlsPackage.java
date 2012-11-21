/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see owls.OwlsFactory
 * @model kind="package"
 * @generated
 */
public interface OwlsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "owls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/owls/model/owls.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "owls";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlsPackage eINSTANCE = owls.impl.OwlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link owls.impl.OwlsImpl <em>Owls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsImpl
	 * @see owls.impl.OwlsPackageImpl#getOwls()
	 * @generated
	 */
	int OWLS = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS__ONTOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS__PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS__PROCESS = 4;

	/**
	 * The number of structural features of the '<em>Owls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsOntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsOntologyImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsOntology()
	 * @generated
	 */
	int OWLS_ONTOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ONTOLOGY__IMPORTS = 0;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ONTOLOGY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsServiceImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsService()
	 * @generated
	 */
	int OWLS_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SERVICE__PRESENTS = 1;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SERVICE__DESCRIBED_BY = 2;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SERVICE__SUPPORTS = 3;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SERVICE__OWNED_BY = 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SERVICE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsProfileImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsProfile()
	 * @generated
	 */
	int OWLS_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROFILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROFILE__SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Presented By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROFILE__IS_PRESENTED_BY = 2;

	/**
	 * The feature id for the '<em><b>Has Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROFILE__HAS_PROCESS = 3;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROFILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsWsdlGroundingImpl <em>Wsdl Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsWsdlGroundingImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsWsdlGrounding()
	 * @generated
	 */
	int OWLS_WSDL_GROUNDING = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_WSDL_GROUNDING__ID = 0;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_WSDL_GROUNDING__SUPPORTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Has Atomic Process Grounding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING = 2;

	/**
	 * The number of structural features of the '<em>Wsdl Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_WSDL_GROUNDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsAtomicProcessImpl <em>Atomic Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsAtomicProcessImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsAtomicProcess()
	 * @generated
	 */
	int OWLS_ATOMIC_PROCESS = 7;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsCompositeProcessImpl <em>Composite Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsCompositeProcessImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsCompositeProcess()
	 * @generated
	 */
	int OWLS_COMPOSITE_PROCESS = 8;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsControlConstructImpl <em>Control Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsControlConstructImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsControlConstruct()
	 * @generated
	 */
	int OWLS_CONTROL_CONSTRUCT = 9;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsInputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsInputImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsInput()
	 * @generated
	 */
	int OWLS_INPUT = 15;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsOutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsOutputImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsOutput()
	 * @generated
	 */
	int OWLS_OUTPUT = 16;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsWsdlAtomicProcessGroundingImpl <em>Wsdl Atomic Process Grounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsWsdlAtomicProcessGroundingImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsWsdlAtomicProcessGrounding()
	 * @generated
	 */
	int OWLS_WSDL_ATOMIC_PROCESS_GROUNDING = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_WSDL_ATOMIC_PROCESS_GROUNDING__ID = 0;

	/**
	 * The number of structural features of the '<em>Wsdl Atomic Process Grounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_WSDL_ATOMIC_PROCESS_GROUNDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsProcessImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsProcess()
	 * @generated
	 */
	int OWLS_PROCESS = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Process URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__PROCESS_URI = 2;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__REFERENCE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__DESCRIBES = 4;

	/**
	 * The feature id for the '<em><b>Peformed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__PEFORMED_BY = 5;

	/**
	 * The feature id for the '<em><b>Has Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__HAS_INPUTS = 6;

	/**
	 * The feature id for the '<em><b>Has Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__HAS_OUTPUTS = 7;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__BINDINGS = 8;

	/**
	 * The feature id for the '<em><b>Messages Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS__MESSAGES_BINDINGS = 9;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PROCESS_FEATURE_COUNT = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__ID = OWLS_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__LABEL = OWLS_PROCESS__LABEL;

	/**
	 * The feature id for the '<em><b>Process URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__PROCESS_URI = OWLS_PROCESS__PROCESS_URI;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__REFERENCE_NAME = OWLS_PROCESS__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__DESCRIBES = OWLS_PROCESS__DESCRIBES;

	/**
	 * The feature id for the '<em><b>Peformed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__PEFORMED_BY = OWLS_PROCESS__PEFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__HAS_INPUTS = OWLS_PROCESS__HAS_INPUTS;

	/**
	 * The feature id for the '<em><b>Has Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__HAS_OUTPUTS = OWLS_PROCESS__HAS_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__BINDINGS = OWLS_PROCESS__BINDINGS;

	/**
	 * The feature id for the '<em><b>Messages Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS__MESSAGES_BINDINGS = OWLS_PROCESS__MESSAGES_BINDINGS;

	/**
	 * The number of structural features of the '<em>Atomic Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ATOMIC_PROCESS_FEATURE_COUNT = OWLS_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__ID = OWLS_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__LABEL = OWLS_PROCESS__LABEL;

	/**
	 * The feature id for the '<em><b>Process URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__PROCESS_URI = OWLS_PROCESS__PROCESS_URI;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__REFERENCE_NAME = OWLS_PROCESS__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__DESCRIBES = OWLS_PROCESS__DESCRIBES;

	/**
	 * The feature id for the '<em><b>Peformed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__PEFORMED_BY = OWLS_PROCESS__PEFORMED_BY;

	/**
	 * The feature id for the '<em><b>Has Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__HAS_INPUTS = OWLS_PROCESS__HAS_INPUTS;

	/**
	 * The feature id for the '<em><b>Has Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__HAS_OUTPUTS = OWLS_PROCESS__HAS_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__BINDINGS = OWLS_PROCESS__BINDINGS;

	/**
	 * The feature id for the '<em><b>Messages Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__MESSAGES_BINDINGS = OWLS_PROCESS__MESSAGES_BINDINGS;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS__COMPOSED_OF = OWLS_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_COMPOSITE_PROCESS_FEATURE_COUNT = OWLS_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_CONTROL_CONSTRUCT__PROCESSES = 0;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_CONTROL_CONSTRUCT__CONSTRUCTS = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_CONTROL_CONSTRUCT__ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_CONTROL_CONSTRUCT__MESSAGES = 3;

	/**
	 * The number of structural features of the '<em>Control Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_CONTROL_CONSTRUCT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsPeformImpl <em>Peform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsPeformImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsPeform()
	 * @generated
	 */
	int OWLS_PEFORM = 13;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsParameterImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsParameter()
	 * @generated
	 */
	int OWLS_PARAMETER = 14;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsSequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsSequenceImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsSequence()
	 * @generated
	 */
	int OWLS_SEQUENCE = 10;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SEQUENCE__PROCESSES = OWLS_CONTROL_CONSTRUCT__PROCESSES;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SEQUENCE__CONSTRUCTS = OWLS_CONTROL_CONSTRUCT__CONSTRUCTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SEQUENCE__ELEMENTS = OWLS_CONTROL_CONSTRUCT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SEQUENCE__MESSAGES = OWLS_CONTROL_CONSTRUCT__MESSAGES;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SEQUENCE_FEATURE_COUNT = OWLS_CONTROL_CONSTRUCT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link owls.impl.OwlsSplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsSplitImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsSplit()
	 * @generated
	 */
	int OWLS_SPLIT = 11;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SPLIT__PROCESSES = OWLS_CONTROL_CONSTRUCT__PROCESSES;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SPLIT__CONSTRUCTS = OWLS_CONTROL_CONSTRUCT__CONSTRUCTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SPLIT__ELEMENTS = OWLS_CONTROL_CONSTRUCT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SPLIT__MESSAGES = OWLS_CONTROL_CONSTRUCT__MESSAGES;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_SPLIT_FEATURE_COUNT = OWLS_CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsAnyOrderImpl <em>Any Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsAnyOrderImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsAnyOrder()
	 * @generated
	 */
	int OWLS_ANY_ORDER = 12;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ANY_ORDER__PROCESSES = OWLS_CONTROL_CONSTRUCT__PROCESSES;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ANY_ORDER__CONSTRUCTS = OWLS_CONTROL_CONSTRUCT__CONSTRUCTS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ANY_ORDER__ELEMENTS = OWLS_CONTROL_CONSTRUCT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ANY_ORDER__MESSAGES = OWLS_CONTROL_CONSTRUCT__MESSAGES;

	/**
	 * The number of structural features of the '<em>Any Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ANY_ORDER_FEATURE_COUNT = OWLS_CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PEFORM__ID = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PEFORM__PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Peform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PEFORM_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PARAMETER__ID = 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PARAMETER__PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PARAMETER__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_INPUT__ID = OWLS_PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_INPUT__PARAMETER_TYPE = OWLS_PARAMETER__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_INPUT__LABEL = OWLS_PARAMETER__LABEL;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_INPUT_FEATURE_COUNT = OWLS_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_OUTPUT__ID = OWLS_PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_OUTPUT__PARAMETER_TYPE = OWLS_PARAMETER__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_OUTPUT__LABEL = OWLS_PARAMETER__LABEL;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_OUTPUT_FEATURE_COUNT = OWLS_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsAssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsAssignImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsAssign()
	 * @generated
	 */
	int OWLS_ASSIGN = 17;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Input Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN__INPUT_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Output Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN__OUTPUT_SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsClientMessageImpl <em>Client Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsClientMessageImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsClientMessage()
	 * @generated
	 */
	int OWLS_CLIENT_MESSAGE = 18;

	/**
	 * The number of structural features of the '<em>Client Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_CLIENT_MESSAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsInputClientMessageImpl <em>Input Client Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsInputClientMessageImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsInputClientMessage()
	 * @generated
	 */
	int OWLS_INPUT_CLIENT_MESSAGE = 19;

	/**
	 * The feature id for the '<em><b>Client Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS = OWLS_CLIENT_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Client Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_INPUT_CLIENT_MESSAGE_FEATURE_COUNT = OWLS_CLIENT_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsOutputClientMessageImpl <em>Output Client Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsOutputClientMessageImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsOutputClientMessage()
	 * @generated
	 */
	int OWLS_OUTPUT_CLIENT_MESSAGE = 20;

	/**
	 * The feature id for the '<em><b>Client Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS = OWLS_CLIENT_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Client Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_OUTPUT_CLIENT_MESSAGE_FEATURE_COUNT = OWLS_CLIENT_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsAssignClientImpl <em>Assign Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsAssignClientImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsAssignClient()
	 * @generated
	 */
	int OWLS_ASSIGN_CLIENT = 21;

	/**
	 * The feature id for the '<em><b>Process Reference</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Assign Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_CLIENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsAssignInputClientImpl <em>Assign Input Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsAssignInputClientImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsAssignInputClient()
	 * @generated
	 */
	int OWLS_ASSIGN_INPUT_CLIENT = 22;

	/**
	 * The feature id for the '<em><b>Process Reference</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_INPUT_CLIENT__PROCESS_REFERENCE = OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE;

	/**
	 * The feature id for the '<em><b>Client Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputs References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assign Input Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_INPUT_CLIENT_FEATURE_COUNT = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link owls.impl.OwlsAssignOutputClientImpl <em>Assign Output Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.OwlsAssignOutputClientImpl
	 * @see owls.impl.OwlsPackageImpl#getOwlsAssignOutputClient()
	 * @generated
	 */
	int OWLS_ASSIGN_OUTPUT_CLIENT = 23;

	/**
	 * The feature id for the '<em><b>Process Reference</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_OUTPUT_CLIENT__PROCESS_REFERENCE = OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE;

	/**
	 * The feature id for the '<em><b>Client Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputs References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assign Output Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWLS_ASSIGN_OUTPUT_CLIENT_FEATURE_COUNT = OWLS_ASSIGN_CLIENT_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link owls.Owls <em>Owls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owls</em>'.
	 * @see owls.Owls
	 * @generated
	 */
	EClass getOwls();

	/**
	 * Returns the meta object for the attribute '{@link owls.Owls#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see owls.Owls#getNamespace()
	 * @see #getOwls()
	 * @generated
	 */
	EAttribute getOwls_Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link owls.Owls#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontology</em>'.
	 * @see owls.Owls#getOntology()
	 * @see #getOwls()
	 * @generated
	 */
	EReference getOwls_Ontology();

	/**
	 * Returns the meta object for the container reference '{@link owls.Owls#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see owls.Owls#getService()
	 * @see #getOwls()
	 * @generated
	 */
	EReference getOwls_Service();

	/**
	 * Returns the meta object for the reference '{@link owls.Owls#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see owls.Owls#getProfile()
	 * @see #getOwls()
	 * @generated
	 */
	EReference getOwls_Profile();

	/**
	 * Returns the meta object for the reference '{@link owls.Owls#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see owls.Owls#getProcess()
	 * @see #getOwls()
	 * @generated
	 */
	EReference getOwls_Process();

	/**
	 * Returns the meta object for class '{@link owls.OwlsOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see owls.OwlsOntology
	 * @generated
	 */
	EClass getOwlsOntology();

	/**
	 * Returns the meta object for the attribute list '{@link owls.OwlsOntology#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see owls.OwlsOntology#getImports()
	 * @see #getOwlsOntology()
	 * @generated
	 */
	EAttribute getOwlsOntology_Imports();

	/**
	 * Returns the meta object for class '{@link owls.OwlsService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see owls.OwlsService
	 * @generated
	 */
	EClass getOwlsService();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsService#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsService#getID()
	 * @see #getOwlsService()
	 * @generated
	 */
	EAttribute getOwlsService_ID();

	/**
	 * Returns the meta object for the containment reference '{@link owls.OwlsService#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presents</em>'.
	 * @see owls.OwlsService#getPresents()
	 * @see #getOwlsService()
	 * @generated
	 */
	EReference getOwlsService_Presents();

	/**
	 * Returns the meta object for the container reference '{@link owls.OwlsService#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Described By</em>'.
	 * @see owls.OwlsService#getDescribedBy()
	 * @see #getOwlsService()
	 * @generated
	 */
	EReference getOwlsService_DescribedBy();

	/**
	 * Returns the meta object for the containment reference '{@link owls.OwlsService#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supports</em>'.
	 * @see owls.OwlsService#getSupports()
	 * @see #getOwlsService()
	 * @generated
	 */
	EReference getOwlsService_Supports();

	/**
	 * Returns the meta object for the containment reference '{@link owls.OwlsService#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned By</em>'.
	 * @see owls.OwlsService#getOwnedBy()
	 * @see #getOwlsService()
	 * @generated
	 */
	EReference getOwlsService_OwnedBy();

	/**
	 * Returns the meta object for class '{@link owls.OwlsProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see owls.OwlsProfile
	 * @generated
	 */
	EClass getOwlsProfile();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsProfile#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsProfile#getID()
	 * @see #getOwlsProfile()
	 * @generated
	 */
	EAttribute getOwlsProfile_ID();

	/**
	 * Returns the meta object for the container reference '{@link owls.OwlsProfile#getIsPresentedBy <em>Is Presented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Presented By</em>'.
	 * @see owls.OwlsProfile#getIsPresentedBy()
	 * @see #getOwlsProfile()
	 * @generated
	 */
	EReference getOwlsProfile_IsPresentedBy();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsProfile#getHasProcess <em>Has Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Process</em>'.
	 * @see owls.OwlsProfile#getHasProcess()
	 * @see #getOwlsProfile()
	 * @generated
	 */
	EReference getOwlsProfile_HasProcess();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsProfile#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see owls.OwlsProfile#getServiceName()
	 * @see #getOwlsProfile()
	 * @generated
	 */
	EAttribute getOwlsProfile_ServiceName();

	/**
	 * Returns the meta object for class '{@link owls.OwlsWsdlGrounding <em>Wsdl Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Grounding</em>'.
	 * @see owls.OwlsWsdlGrounding
	 * @generated
	 */
	EClass getOwlsWsdlGrounding();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsWsdlGrounding#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsWsdlGrounding#getID()
	 * @see #getOwlsWsdlGrounding()
	 * @generated
	 */
	EAttribute getOwlsWsdlGrounding_ID();

	/**
	 * Returns the meta object for the container reference '{@link owls.OwlsWsdlGrounding#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supported By</em>'.
	 * @see owls.OwlsWsdlGrounding#getSupportedBy()
	 * @see #getOwlsWsdlGrounding()
	 * @generated
	 */
	EReference getOwlsWsdlGrounding_SupportedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsWsdlGrounding#getHasAtomicProcessGrounding <em>Has Atomic Process Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Atomic Process Grounding</em>'.
	 * @see owls.OwlsWsdlGrounding#getHasAtomicProcessGrounding()
	 * @see #getOwlsWsdlGrounding()
	 * @generated
	 */
	EReference getOwlsWsdlGrounding_HasAtomicProcessGrounding();

	/**
	 * Returns the meta object for class '{@link owls.OwlsAtomicProcess <em>Atomic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Process</em>'.
	 * @see owls.OwlsAtomicProcess
	 * @generated
	 */
	EClass getOwlsAtomicProcess();

	/**
	 * Returns the meta object for class '{@link owls.OwlsCompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Process</em>'.
	 * @see owls.OwlsCompositeProcess
	 * @generated
	 */
	EClass getOwlsCompositeProcess();

	/**
	 * Returns the meta object for the containment reference '{@link owls.OwlsCompositeProcess#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composed Of</em>'.
	 * @see owls.OwlsCompositeProcess#getComposedOf()
	 * @see #getOwlsCompositeProcess()
	 * @generated
	 */
	EReference getOwlsCompositeProcess_ComposedOf();

	/**
	 * Returns the meta object for class '{@link owls.OwlsControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct</em>'.
	 * @see owls.OwlsControlConstruct
	 * @generated
	 */
	EClass getOwlsControlConstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsControlConstruct#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see owls.OwlsControlConstruct#getProcesses()
	 * @see #getOwlsControlConstruct()
	 * @generated
	 */
	EReference getOwlsControlConstruct_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsControlConstruct#getConstructs <em>Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructs</em>'.
	 * @see owls.OwlsControlConstruct#getConstructs()
	 * @see #getOwlsControlConstruct()
	 * @generated
	 */
	EReference getOwlsControlConstruct_Constructs();

	/**
	 * Returns the meta object for the reference list '{@link owls.OwlsControlConstruct#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see owls.OwlsControlConstruct#getElements()
	 * @see #getOwlsControlConstruct()
	 * @generated
	 */
	EReference getOwlsControlConstruct_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsControlConstruct#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see owls.OwlsControlConstruct#getMessages()
	 * @see #getOwlsControlConstruct()
	 * @generated
	 */
	EReference getOwlsControlConstruct_Messages();

	/**
	 * Returns the meta object for class '{@link owls.OwlsInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see owls.OwlsInput
	 * @generated
	 */
	EClass getOwlsInput();

	/**
	 * Returns the meta object for class '{@link owls.OwlsOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see owls.OwlsOutput
	 * @generated
	 */
	EClass getOwlsOutput();

	/**
	 * Returns the meta object for class '{@link owls.OwlsWsdlAtomicProcessGrounding <em>Wsdl Atomic Process Grounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Atomic Process Grounding</em>'.
	 * @see owls.OwlsWsdlAtomicProcessGrounding
	 * @generated
	 */
	EClass getOwlsWsdlAtomicProcessGrounding();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsWsdlAtomicProcessGrounding#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsWsdlAtomicProcessGrounding#getID()
	 * @see #getOwlsWsdlAtomicProcessGrounding()
	 * @generated
	 */
	EAttribute getOwlsWsdlAtomicProcessGrounding_ID();

	/**
	 * Returns the meta object for class '{@link owls.OwlsProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see owls.OwlsProcess
	 * @generated
	 */
	EClass getOwlsProcess();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsProcess#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsProcess#getID()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EAttribute getOwlsProcess_ID();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsProcess#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see owls.OwlsProcess#getLabel()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EAttribute getOwlsProcess_Label();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsProcess#getProcessURI <em>Process URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process URI</em>'.
	 * @see owls.OwlsProcess#getProcessURI()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EAttribute getOwlsProcess_ProcessURI();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsProcess#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see owls.OwlsProcess#getReferenceName()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EAttribute getOwlsProcess_ReferenceName();

	/**
	 * Returns the meta object for the containment reference '{@link owls.OwlsProcess#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Describes</em>'.
	 * @see owls.OwlsProcess#getDescribes()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EReference getOwlsProcess_Describes();

	/**
	 * Returns the meta object for the containment reference '{@link owls.OwlsProcess#getPeformedBy <em>Peformed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Peformed By</em>'.
	 * @see owls.OwlsProcess#getPeformedBy()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EReference getOwlsProcess_PeformedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsProcess#getHasInputs <em>Has Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Inputs</em>'.
	 * @see owls.OwlsProcess#getHasInputs()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EReference getOwlsProcess_HasInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsProcess#getHasOutputs <em>Has Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Outputs</em>'.
	 * @see owls.OwlsProcess#getHasOutputs()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EReference getOwlsProcess_HasOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsProcess#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see owls.OwlsProcess#getBindings()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EReference getOwlsProcess_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.OwlsProcess#getMessagesBindings <em>Messages Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages Bindings</em>'.
	 * @see owls.OwlsProcess#getMessagesBindings()
	 * @see #getOwlsProcess()
	 * @generated
	 */
	EReference getOwlsProcess_MessagesBindings();

	/**
	 * Returns the meta object for class '{@link owls.OwlsAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see owls.OwlsAssign
	 * @generated
	 */
	EClass getOwlsAssign();

	/**
	 * Returns the meta object for the container reference '{@link owls.OwlsAssign#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see owls.OwlsAssign#getTarget()
	 * @see #getOwlsAssign()
	 * @generated
	 */
	EReference getOwlsAssign_Target();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssign#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see owls.OwlsAssign#getSource()
	 * @see #getOwlsAssign()
	 * @generated
	 */
	EReference getOwlsAssign_Source();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssign#getInputTarget <em>Input Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Target</em>'.
	 * @see owls.OwlsAssign#getInputTarget()
	 * @see #getOwlsAssign()
	 * @generated
	 */
	EReference getOwlsAssign_InputTarget();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssign#getOutputSource <em>Output Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Source</em>'.
	 * @see owls.OwlsAssign#getOutputSource()
	 * @see #getOwlsAssign()
	 * @generated
	 */
	EReference getOwlsAssign_OutputSource();

	/**
	 * Returns the meta object for class '{@link owls.OwlsClientMessage <em>Client Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Message</em>'.
	 * @see owls.OwlsClientMessage
	 * @generated
	 */
	EClass getOwlsClientMessage();

	/**
	 * Returns the meta object for class '{@link owls.OwlsInputClientMessage <em>Input Client Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Client Message</em>'.
	 * @see owls.OwlsInputClientMessage
	 * @generated
	 */
	EClass getOwlsInputClientMessage();

	/**
	 * Returns the meta object for the reference list '{@link owls.OwlsInputClientMessage#getClientInputs <em>Client Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client Inputs</em>'.
	 * @see owls.OwlsInputClientMessage#getClientInputs()
	 * @see #getOwlsInputClientMessage()
	 * @generated
	 */
	EReference getOwlsInputClientMessage_ClientInputs();

	/**
	 * Returns the meta object for class '{@link owls.OwlsOutputClientMessage <em>Output Client Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Client Message</em>'.
	 * @see owls.OwlsOutputClientMessage
	 * @generated
	 */
	EClass getOwlsOutputClientMessage();

	/**
	 * Returns the meta object for the reference list '{@link owls.OwlsOutputClientMessage#getClientOutputs <em>Client Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client Outputs</em>'.
	 * @see owls.OwlsOutputClientMessage#getClientOutputs()
	 * @see #getOwlsOutputClientMessage()
	 * @generated
	 */
	EReference getOwlsOutputClientMessage_ClientOutputs();

	/**
	 * Returns the meta object for class '{@link owls.OwlsAssignClient <em>Assign Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Client</em>'.
	 * @see owls.OwlsAssignClient
	 * @generated
	 */
	EClass getOwlsAssignClient();

	/**
	 * Returns the meta object for the container reference '{@link owls.OwlsAssignClient#getProcessReference <em>Process Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process Reference</em>'.
	 * @see owls.OwlsAssignClient#getProcessReference()
	 * @see #getOwlsAssignClient()
	 * @generated
	 */
	EReference getOwlsAssignClient_ProcessReference();

	/**
	 * Returns the meta object for class '{@link owls.OwlsAssignInputClient <em>Assign Input Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Input Client</em>'.
	 * @see owls.OwlsAssignInputClient
	 * @generated
	 */
	EClass getOwlsAssignInputClient();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssignInputClient#getClientReference <em>Client Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Reference</em>'.
	 * @see owls.OwlsAssignInputClient#getClientReference()
	 * @see #getOwlsAssignInputClient()
	 * @generated
	 */
	EReference getOwlsAssignInputClient_ClientReference();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssignInputClient#getInputReferences <em>Input References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input References</em>'.
	 * @see owls.OwlsAssignInputClient#getInputReferences()
	 * @see #getOwlsAssignInputClient()
	 * @generated
	 */
	EReference getOwlsAssignInputClient_InputReferences();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssignInputClient#getOutputsReferences <em>Outputs References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputs References</em>'.
	 * @see owls.OwlsAssignInputClient#getOutputsReferences()
	 * @see #getOwlsAssignInputClient()
	 * @generated
	 */
	EReference getOwlsAssignInputClient_OutputsReferences();

	/**
	 * Returns the meta object for class '{@link owls.OwlsAssignOutputClient <em>Assign Output Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Output Client</em>'.
	 * @see owls.OwlsAssignOutputClient
	 * @generated
	 */
	EClass getOwlsAssignOutputClient();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssignOutputClient#getClientReference <em>Client Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Reference</em>'.
	 * @see owls.OwlsAssignOutputClient#getClientReference()
	 * @see #getOwlsAssignOutputClient()
	 * @generated
	 */
	EReference getOwlsAssignOutputClient_ClientReference();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssignOutputClient#getInputReferences <em>Input References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input References</em>'.
	 * @see owls.OwlsAssignOutputClient#getInputReferences()
	 * @see #getOwlsAssignOutputClient()
	 * @generated
	 */
	EReference getOwlsAssignOutputClient_InputReferences();

	/**
	 * Returns the meta object for the reference '{@link owls.OwlsAssignOutputClient#getOutputsReferences <em>Outputs References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputs References</em>'.
	 * @see owls.OwlsAssignOutputClient#getOutputsReferences()
	 * @see #getOwlsAssignOutputClient()
	 * @generated
	 */
	EReference getOwlsAssignOutputClient_OutputsReferences();

	/**
	 * Returns the meta object for class '{@link owls.OwlsPeform <em>Peform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peform</em>'.
	 * @see owls.OwlsPeform
	 * @generated
	 */
	EClass getOwlsPeform();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsPeform#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsPeform#getID()
	 * @see #getOwlsPeform()
	 * @generated
	 */
	EAttribute getOwlsPeform_ID();

	/**
	 * Returns the meta object for the container reference '{@link owls.OwlsPeform#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see owls.OwlsPeform#getProcess()
	 * @see #getOwlsPeform()
	 * @generated
	 */
	EReference getOwlsPeform_Process();

	/**
	 * Returns the meta object for class '{@link owls.OwlsParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see owls.OwlsParameter
	 * @generated
	 */
	EClass getOwlsParameter();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsParameter#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see owls.OwlsParameter#getID()
	 * @see #getOwlsParameter()
	 * @generated
	 */
	EAttribute getOwlsParameter_ID();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see owls.OwlsParameter#getParameterType()
	 * @see #getOwlsParameter()
	 * @generated
	 */
	EAttribute getOwlsParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link owls.OwlsParameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see owls.OwlsParameter#getLabel()
	 * @see #getOwlsParameter()
	 * @generated
	 */
	EAttribute getOwlsParameter_Label();

	/**
	 * Returns the meta object for class '{@link owls.OwlsSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see owls.OwlsSequence
	 * @generated
	 */
	EClass getOwlsSequence();

	/**
	 * Returns the meta object for class '{@link owls.OwlsSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see owls.OwlsSplit
	 * @generated
	 */
	EClass getOwlsSplit();

	/**
	 * Returns the meta object for class '{@link owls.OwlsAnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Order</em>'.
	 * @see owls.OwlsAnyOrder
	 * @generated
	 */
	EClass getOwlsAnyOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OwlsFactory getOwlsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link owls.impl.OwlsImpl <em>Owls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsImpl
		 * @see owls.impl.OwlsPackageImpl#getOwls()
		 * @generated
		 */
		EClass OWLS = eINSTANCE.getOwls();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS__NAMESPACE = eINSTANCE.getOwls_Namespace();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS__ONTOLOGY = eINSTANCE.getOwls_Ontology();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS__SERVICE = eINSTANCE.getOwls_Service();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS__PROFILE = eINSTANCE.getOwls_Profile();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS__PROCESS = eINSTANCE.getOwls_Process();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsOntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsOntologyImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsOntology()
		 * @generated
		 */
		EClass OWLS_ONTOLOGY = eINSTANCE.getOwlsOntology();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_ONTOLOGY__IMPORTS = eINSTANCE.getOwlsOntology_Imports();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsServiceImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsService()
		 * @generated
		 */
		EClass OWLS_SERVICE = eINSTANCE.getOwlsService();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_SERVICE__ID = eINSTANCE.getOwlsService_ID();

		/**
		 * The meta object literal for the '<em><b>Presents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_SERVICE__PRESENTS = eINSTANCE.getOwlsService_Presents();

		/**
		 * The meta object literal for the '<em><b>Described By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_SERVICE__DESCRIBED_BY = eINSTANCE.getOwlsService_DescribedBy();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_SERVICE__SUPPORTS = eINSTANCE.getOwlsService_Supports();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_SERVICE__OWNED_BY = eINSTANCE.getOwlsService_OwnedBy();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsProfileImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsProfile()
		 * @generated
		 */
		EClass OWLS_PROFILE = eINSTANCE.getOwlsProfile();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PROFILE__ID = eINSTANCE.getOwlsProfile_ID();

		/**
		 * The meta object literal for the '<em><b>Is Presented By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROFILE__IS_PRESENTED_BY = eINSTANCE.getOwlsProfile_IsPresentedBy();

		/**
		 * The meta object literal for the '<em><b>Has Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROFILE__HAS_PROCESS = eINSTANCE.getOwlsProfile_HasProcess();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PROFILE__SERVICE_NAME = eINSTANCE.getOwlsProfile_ServiceName();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsWsdlGroundingImpl <em>Wsdl Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsWsdlGroundingImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsWsdlGrounding()
		 * @generated
		 */
		EClass OWLS_WSDL_GROUNDING = eINSTANCE.getOwlsWsdlGrounding();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_WSDL_GROUNDING__ID = eINSTANCE.getOwlsWsdlGrounding_ID();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_WSDL_GROUNDING__SUPPORTED_BY = eINSTANCE.getOwlsWsdlGrounding_SupportedBy();

		/**
		 * The meta object literal for the '<em><b>Has Atomic Process Grounding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING = eINSTANCE.getOwlsWsdlGrounding_HasAtomicProcessGrounding();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsAtomicProcessImpl <em>Atomic Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsAtomicProcessImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsAtomicProcess()
		 * @generated
		 */
		EClass OWLS_ATOMIC_PROCESS = eINSTANCE.getOwlsAtomicProcess();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsCompositeProcessImpl <em>Composite Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsCompositeProcessImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsCompositeProcess()
		 * @generated
		 */
		EClass OWLS_COMPOSITE_PROCESS = eINSTANCE.getOwlsCompositeProcess();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_COMPOSITE_PROCESS__COMPOSED_OF = eINSTANCE.getOwlsCompositeProcess_ComposedOf();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsControlConstructImpl <em>Control Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsControlConstructImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsControlConstruct()
		 * @generated
		 */
		EClass OWLS_CONTROL_CONSTRUCT = eINSTANCE.getOwlsControlConstruct();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_CONTROL_CONSTRUCT__PROCESSES = eINSTANCE.getOwlsControlConstruct_Processes();

		/**
		 * The meta object literal for the '<em><b>Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_CONTROL_CONSTRUCT__CONSTRUCTS = eINSTANCE.getOwlsControlConstruct_Constructs();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_CONTROL_CONSTRUCT__ELEMENTS = eINSTANCE.getOwlsControlConstruct_Elements();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_CONTROL_CONSTRUCT__MESSAGES = eINSTANCE.getOwlsControlConstruct_Messages();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsInputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsInputImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsInput()
		 * @generated
		 */
		EClass OWLS_INPUT = eINSTANCE.getOwlsInput();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsOutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsOutputImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsOutput()
		 * @generated
		 */
		EClass OWLS_OUTPUT = eINSTANCE.getOwlsOutput();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsWsdlAtomicProcessGroundingImpl <em>Wsdl Atomic Process Grounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsWsdlAtomicProcessGroundingImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsWsdlAtomicProcessGrounding()
		 * @generated
		 */
		EClass OWLS_WSDL_ATOMIC_PROCESS_GROUNDING = eINSTANCE.getOwlsWsdlAtomicProcessGrounding();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_WSDL_ATOMIC_PROCESS_GROUNDING__ID = eINSTANCE.getOwlsWsdlAtomicProcessGrounding_ID();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsProcessImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsProcess()
		 * @generated
		 */
		EClass OWLS_PROCESS = eINSTANCE.getOwlsProcess();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PROCESS__ID = eINSTANCE.getOwlsProcess_ID();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PROCESS__LABEL = eINSTANCE.getOwlsProcess_Label();

		/**
		 * The meta object literal for the '<em><b>Process URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PROCESS__PROCESS_URI = eINSTANCE.getOwlsProcess_ProcessURI();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PROCESS__REFERENCE_NAME = eINSTANCE.getOwlsProcess_ReferenceName();

		/**
		 * The meta object literal for the '<em><b>Describes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROCESS__DESCRIBES = eINSTANCE.getOwlsProcess_Describes();

		/**
		 * The meta object literal for the '<em><b>Peformed By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROCESS__PEFORMED_BY = eINSTANCE.getOwlsProcess_PeformedBy();

		/**
		 * The meta object literal for the '<em><b>Has Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROCESS__HAS_INPUTS = eINSTANCE.getOwlsProcess_HasInputs();

		/**
		 * The meta object literal for the '<em><b>Has Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROCESS__HAS_OUTPUTS = eINSTANCE.getOwlsProcess_HasOutputs();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROCESS__BINDINGS = eINSTANCE.getOwlsProcess_Bindings();

		/**
		 * The meta object literal for the '<em><b>Messages Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PROCESS__MESSAGES_BINDINGS = eINSTANCE.getOwlsProcess_MessagesBindings();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsAssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsAssignImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsAssign()
		 * @generated
		 */
		EClass OWLS_ASSIGN = eINSTANCE.getOwlsAssign();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN__TARGET = eINSTANCE.getOwlsAssign_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN__SOURCE = eINSTANCE.getOwlsAssign_Source();

		/**
		 * The meta object literal for the '<em><b>Input Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN__INPUT_TARGET = eINSTANCE.getOwlsAssign_InputTarget();

		/**
		 * The meta object literal for the '<em><b>Output Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN__OUTPUT_SOURCE = eINSTANCE.getOwlsAssign_OutputSource();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsClientMessageImpl <em>Client Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsClientMessageImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsClientMessage()
		 * @generated
		 */
		EClass OWLS_CLIENT_MESSAGE = eINSTANCE.getOwlsClientMessage();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsInputClientMessageImpl <em>Input Client Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsInputClientMessageImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsInputClientMessage()
		 * @generated
		 */
		EClass OWLS_INPUT_CLIENT_MESSAGE = eINSTANCE.getOwlsInputClientMessage();

		/**
		 * The meta object literal for the '<em><b>Client Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS = eINSTANCE.getOwlsInputClientMessage_ClientInputs();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsOutputClientMessageImpl <em>Output Client Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsOutputClientMessageImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsOutputClientMessage()
		 * @generated
		 */
		EClass OWLS_OUTPUT_CLIENT_MESSAGE = eINSTANCE.getOwlsOutputClientMessage();

		/**
		 * The meta object literal for the '<em><b>Client Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS = eINSTANCE.getOwlsOutputClientMessage_ClientOutputs();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsAssignClientImpl <em>Assign Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsAssignClientImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsAssignClient()
		 * @generated
		 */
		EClass OWLS_ASSIGN_CLIENT = eINSTANCE.getOwlsAssignClient();

		/**
		 * The meta object literal for the '<em><b>Process Reference</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE = eINSTANCE.getOwlsAssignClient_ProcessReference();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsAssignInputClientImpl <em>Assign Input Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsAssignInputClientImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsAssignInputClient()
		 * @generated
		 */
		EClass OWLS_ASSIGN_INPUT_CLIENT = eINSTANCE.getOwlsAssignInputClient();

		/**
		 * The meta object literal for the '<em><b>Client Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE = eINSTANCE.getOwlsAssignInputClient_ClientReference();

		/**
		 * The meta object literal for the '<em><b>Input References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES = eINSTANCE.getOwlsAssignInputClient_InputReferences();

		/**
		 * The meta object literal for the '<em><b>Outputs References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES = eINSTANCE.getOwlsAssignInputClient_OutputsReferences();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsAssignOutputClientImpl <em>Assign Output Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsAssignOutputClientImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsAssignOutputClient()
		 * @generated
		 */
		EClass OWLS_ASSIGN_OUTPUT_CLIENT = eINSTANCE.getOwlsAssignOutputClient();

		/**
		 * The meta object literal for the '<em><b>Client Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE = eINSTANCE.getOwlsAssignOutputClient_ClientReference();

		/**
		 * The meta object literal for the '<em><b>Input References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES = eINSTANCE.getOwlsAssignOutputClient_InputReferences();

		/**
		 * The meta object literal for the '<em><b>Outputs References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES = eINSTANCE.getOwlsAssignOutputClient_OutputsReferences();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsPeformImpl <em>Peform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsPeformImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsPeform()
		 * @generated
		 */
		EClass OWLS_PEFORM = eINSTANCE.getOwlsPeform();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PEFORM__ID = eINSTANCE.getOwlsPeform_ID();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWLS_PEFORM__PROCESS = eINSTANCE.getOwlsPeform_Process();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsParameterImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsParameter()
		 * @generated
		 */
		EClass OWLS_PARAMETER = eINSTANCE.getOwlsParameter();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PARAMETER__ID = eINSTANCE.getOwlsParameter_ID();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PARAMETER__PARAMETER_TYPE = eINSTANCE.getOwlsParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWLS_PARAMETER__LABEL = eINSTANCE.getOwlsParameter_Label();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsSequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsSequenceImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsSequence()
		 * @generated
		 */
		EClass OWLS_SEQUENCE = eINSTANCE.getOwlsSequence();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsSplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsSplitImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsSplit()
		 * @generated
		 */
		EClass OWLS_SPLIT = eINSTANCE.getOwlsSplit();

		/**
		 * The meta object literal for the '{@link owls.impl.OwlsAnyOrderImpl <em>Any Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.OwlsAnyOrderImpl
		 * @see owls.impl.OwlsPackageImpl#getOwlsAnyOrder()
		 * @generated
		 */
		EClass OWLS_ANY_ORDER = eINSTANCE.getOwlsAnyOrder();

	}

} //OwlsPackage
