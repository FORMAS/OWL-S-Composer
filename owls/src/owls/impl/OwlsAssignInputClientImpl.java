/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owls.OwlsAssignInputClient;
import owls.OwlsInput;
import owls.OwlsInputClientMessage;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Input Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsAssignInputClientImpl#getClientReference <em>Client Reference</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignInputClientImpl#getInputReferences <em>Input References</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignInputClientImpl#getOutputsReferences <em>Outputs References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsAssignInputClientImpl extends OwlsAssignClientImpl implements OwlsAssignInputClient {
	/**
	 * The cached value of the '{@link #getClientReference() <em>Client Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientReference()
	 * @generated
	 * @ordered
	 */
	protected OwlsInputClientMessage clientReference;

	/**
	 * The cached value of the '{@link #getInputReferences() <em>Input References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputReferences()
	 * @generated
	 * @ordered
	 */
	protected OwlsInput inputReferences;
	/**
	 * The cached value of the '{@link #getOutputsReferences() <em>Outputs References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputsReferences()
	 * @generated
	 * @ordered
	 */
	protected OwlsInput outputsReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignInputClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_ASSIGN_INPUT_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInputClientMessage getClientReference() {
		if (clientReference != null && clientReference.eIsProxy()) {
			InternalEObject oldClientReference = (InternalEObject)clientReference;
			clientReference = (OwlsInputClientMessage)eResolveProxy(oldClientReference);
			if (clientReference != oldClientReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE, oldClientReference, clientReference));
			}
		}
		return clientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInputClientMessage basicGetClientReference() {
		return clientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientReference(OwlsInputClientMessage newClientReference) {
		OwlsInputClientMessage oldClientReference = clientReference;
		clientReference = newClientReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE, oldClientReference, clientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput getInputReferences() {
		if (inputReferences != null && inputReferences.eIsProxy()) {
			InternalEObject oldInputReferences = (InternalEObject)inputReferences;
			inputReferences = (OwlsInput)eResolveProxy(oldInputReferences);
			if (inputReferences != oldInputReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES, oldInputReferences, inputReferences));
			}
		}
		return inputReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput basicGetInputReferences() {
		return inputReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputReferences(OwlsInput newInputReferences) {
		OwlsInput oldInputReferences = inputReferences;
		inputReferences = newInputReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES, oldInputReferences, inputReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput getOutputsReferences() {
		if (outputsReferences != null && outputsReferences.eIsProxy()) {
			InternalEObject oldOutputsReferences = (InternalEObject)outputsReferences;
			outputsReferences = (OwlsInput)eResolveProxy(oldOutputsReferences);
			if (outputsReferences != oldOutputsReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES, oldOutputsReferences, outputsReferences));
			}
		}
		return outputsReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput basicGetOutputsReferences() {
		return outputsReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputsReferences(OwlsInput newOutputsReferences) {
		OwlsInput oldOutputsReferences = outputsReferences;
		outputsReferences = newOutputsReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES, oldOutputsReferences, outputsReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE:
				if (resolve) return getClientReference();
				return basicGetClientReference();
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES:
				if (resolve) return getInputReferences();
				return basicGetInputReferences();
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES:
				if (resolve) return getOutputsReferences();
				return basicGetOutputsReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE:
				setClientReference((OwlsInputClientMessage)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES:
				setInputReferences((OwlsInput)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES:
				setOutputsReferences((OwlsInput)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE:
				setClientReference((OwlsInputClientMessage)null);
				return;
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES:
				setInputReferences((OwlsInput)null);
				return;
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES:
				setOutputsReferences((OwlsInput)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__CLIENT_REFERENCE:
				return clientReference != null;
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__INPUT_REFERENCES:
				return inputReferences != null;
			case OwlsPackage.OWLS_ASSIGN_INPUT_CLIENT__OUTPUTS_REFERENCES:
				return outputsReferences != null;
		}
		return super.eIsSet(featureID);
	}

} //OwlsAssignInputClientImpl
