/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsAssign#getTarget <em>Target</em>}</li>
 *   <li>{@link owls.OwlsAssign#getSource <em>Source</em>}</li>
 *   <li>{@link owls.OwlsAssign#getInputTarget <em>Input Target</em>}</li>
 *   <li>{@link owls.OwlsAssign#getOutputSource <em>Output Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsAssign()
 * @model
 * @generated
 */
public interface OwlsAssign extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsProcess#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(OwlsProcess)
	 * @see owls.OwlsPackage#getOwlsAssign_Target()
	 * @see owls.OwlsProcess#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	OwlsProcess getTarget();

	/**
	 * Sets the value of the '{@link owls.OwlsAssign#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OwlsProcess value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OwlsProcess)
	 * @see owls.OwlsPackage#getOwlsAssign_Source()
	 * @model
	 * @generated
	 */
	OwlsProcess getSource();

	/**
	 * Sets the value of the '{@link owls.OwlsAssign#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OwlsProcess value);

	/**
	 * Returns the value of the '<em><b>Input Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Target</em>' reference.
	 * @see #setInputTarget(OwlsInput)
	 * @see owls.OwlsPackage#getOwlsAssign_InputTarget()
	 * @model required="true"
	 * @generated
	 */
	OwlsInput getInputTarget();

	/**
	 * Sets the value of the '{@link owls.OwlsAssign#getInputTarget <em>Input Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Target</em>' reference.
	 * @see #getInputTarget()
	 * @generated
	 */
	void setInputTarget(OwlsInput value);

	/**
	 * Returns the value of the '<em><b>Output Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Source</em>' reference.
	 * @see #setOutputSource(OwlsOutput)
	 * @see owls.OwlsPackage#getOwlsAssign_OutputSource()
	 * @model required="true"
	 * @generated
	 */
	OwlsOutput getOutputSource();

	/**
	 * Sets the value of the '{@link owls.OwlsAssign#getOutputSource <em>Output Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Source</em>' reference.
	 * @see #getOutputSource()
	 * @generated
	 */
	void setOutputSource(OwlsOutput value);

} // OwlsAssign
