/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Input Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsAssignInputClient#getClientReference <em>Client Reference</em>}</li>
 *   <li>{@link owls.OwlsAssignInputClient#getInputReferences <em>Input References</em>}</li>
 *   <li>{@link owls.OwlsAssignInputClient#getOutputsReferences <em>Outputs References</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsAssignInputClient()
 * @model
 * @generated
 */
public interface OwlsAssignInputClient extends OwlsAssignClient {

	/**
	 * Returns the value of the '<em><b>Client Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Reference</em>' reference.
	 * @see #setClientReference(OwlsInputClientMessage)
	 * @see owls.OwlsPackage#getOwlsAssignInputClient_ClientReference()
	 * @model
	 * @generated
	 */
	OwlsInputClientMessage getClientReference();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignInputClient#getClientReference <em>Client Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Reference</em>' reference.
	 * @see #getClientReference()
	 * @generated
	 */
	void setClientReference(OwlsInputClientMessage value);

	/**
	 * Returns the value of the '<em><b>Input References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input References</em>' reference.
	 * @see #setInputReferences(OwlsInput)
	 * @see owls.OwlsPackage#getOwlsAssignInputClient_InputReferences()
	 * @model required="true"
	 * @generated
	 */
	OwlsInput getInputReferences();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignInputClient#getInputReferences <em>Input References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input References</em>' reference.
	 * @see #getInputReferences()
	 * @generated
	 */
	void setInputReferences(OwlsInput value);

	/**
	 * Returns the value of the '<em><b>Outputs References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs References</em>' reference.
	 * @see #setOutputsReferences(OwlsInput)
	 * @see owls.OwlsPackage#getOwlsAssignInputClient_OutputsReferences()
	 * @model required="true"
	 * @generated
	 */
	OwlsInput getOutputsReferences();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignInputClient#getOutputsReferences <em>Outputs References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs References</em>' reference.
	 * @see #getOutputsReferences()
	 * @generated
	 */
	void setOutputsReferences(OwlsInput value);
} // OwlsAssignInputClient
