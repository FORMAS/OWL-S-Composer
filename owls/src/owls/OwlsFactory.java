/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see owls.OwlsPackage
 * @generated
 */
public interface OwlsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlsFactory eINSTANCE = owls.impl.OwlsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Owls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owls</em>'.
	 * @generated
	 */
	Owls createOwls();

	/**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	OwlsOntology createOwlsOntology();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	OwlsService createOwlsService();

	/**
	 * Returns a new object of class '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile</em>'.
	 * @generated
	 */
	OwlsProfile createOwlsProfile();

	/**
	 * Returns a new object of class '<em>Wsdl Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Grounding</em>'.
	 * @generated
	 */
	OwlsWsdlGrounding createOwlsWsdlGrounding();

	/**
	 * Returns a new object of class '<em>Atomic Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Process</em>'.
	 * @generated
	 */
	OwlsAtomicProcess createOwlsAtomicProcess();

	/**
	 * Returns a new object of class '<em>Composite Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Process</em>'.
	 * @generated
	 */
	OwlsCompositeProcess createOwlsCompositeProcess();

	/**
	 * Returns a new object of class '<em>Control Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Construct</em>'.
	 * @generated
	 */
	OwlsControlConstruct createOwlsControlConstruct();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	OwlsInput createOwlsInput();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	OwlsOutput createOwlsOutput();

	/**
	 * Returns a new object of class '<em>Wsdl Atomic Process Grounding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wsdl Atomic Process Grounding</em>'.
	 * @generated
	 */
	OwlsWsdlAtomicProcessGrounding createOwlsWsdlAtomicProcessGrounding();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	OwlsProcess createOwlsProcess();

	/**
	 * Returns a new object of class '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign</em>'.
	 * @generated
	 */
	OwlsAssign createOwlsAssign();

	/**
	 * Returns a new object of class '<em>Client Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Message</em>'.
	 * @generated
	 */
	OwlsClientMessage createOwlsClientMessage();

	/**
	 * Returns a new object of class '<em>Input Client Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Client Message</em>'.
	 * @generated
	 */
	OwlsInputClientMessage createOwlsInputClientMessage();

	/**
	 * Returns a new object of class '<em>Output Client Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Client Message</em>'.
	 * @generated
	 */
	OwlsOutputClientMessage createOwlsOutputClientMessage();

	/**
	 * Returns a new object of class '<em>Assign Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Client</em>'.
	 * @generated
	 */
	OwlsAssignClient createOwlsAssignClient();

	/**
	 * Returns a new object of class '<em>Assign Input Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Input Client</em>'.
	 * @generated
	 */
	OwlsAssignInputClient createOwlsAssignInputClient();

	/**
	 * Returns a new object of class '<em>Assign Output Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Output Client</em>'.
	 * @generated
	 */
	OwlsAssignOutputClient createOwlsAssignOutputClient();

	/**
	 * Returns a new object of class '<em>Peform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Peform</em>'.
	 * @generated
	 */
	OwlsPeform createOwlsPeform();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	OwlsParameter createOwlsParameter();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	OwlsSequence createOwlsSequence();

	/**
	 * Returns a new object of class '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split</em>'.
	 * @generated
	 */
	OwlsSplit createOwlsSplit();

	/**
	 * Returns a new object of class '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Order</em>'.
	 * @generated
	 */
	OwlsAnyOrder createOwlsAnyOrder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OwlsPackage getOwlsPackage();

} //OwlsFactory
