/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Output Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsAssignOutputClient#getClientReference <em>Client Reference</em>}</li>
 *   <li>{@link owls.OwlsAssignOutputClient#getInputReferences <em>Input References</em>}</li>
 *   <li>{@link owls.OwlsAssignOutputClient#getOutputsReferences <em>Outputs References</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsAssignOutputClient()
 * @model
 * @generated
 */
public interface OwlsAssignOutputClient extends OwlsAssignClient {

	/**
	 * Returns the value of the '<em><b>Client Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Reference</em>' reference.
	 * @see #setClientReference(OwlsOutputClientMessage)
	 * @see owls.OwlsPackage#getOwlsAssignOutputClient_ClientReference()
	 * @model
	 * @generated
	 */
	OwlsOutputClientMessage getClientReference();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignOutputClient#getClientReference <em>Client Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Reference</em>' reference.
	 * @see #getClientReference()
	 * @generated
	 */
	void setClientReference(OwlsOutputClientMessage value);

	/**
	 * Returns the value of the '<em><b>Input References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input References</em>' reference.
	 * @see #setInputReferences(OwlsOutput)
	 * @see owls.OwlsPackage#getOwlsAssignOutputClient_InputReferences()
	 * @model required="true"
	 * @generated
	 */
	OwlsOutput getInputReferences();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignOutputClient#getInputReferences <em>Input References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input References</em>' reference.
	 * @see #getInputReferences()
	 * @generated
	 */
	void setInputReferences(OwlsOutput value);

	/**
	 * Returns the value of the '<em><b>Outputs References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs References</em>' reference.
	 * @see #setOutputsReferences(OwlsOutput)
	 * @see owls.OwlsPackage#getOwlsAssignOutputClient_OutputsReferences()
	 * @model required="true"
	 * @generated
	 */
	OwlsOutput getOutputsReferences();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignOutputClient#getOutputsReferences <em>Outputs References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs References</em>' reference.
	 * @see #getOutputsReferences()
	 * @generated
	 */
	void setOutputsReferences(OwlsOutput value);
} // OwlsAssignOutputClient
