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

import owls.OwlsAssignOutputClient;
import owls.OwlsOutput;
import owls.OwlsOutputClientMessage;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Output Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsAssignOutputClientImpl#getClientReference <em>Client Reference</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignOutputClientImpl#getInputReferences <em>Input References</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignOutputClientImpl#getOutputsReferences <em>Outputs References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsAssignOutputClientImpl extends OwlsAssignClientImpl implements OwlsAssignOutputClient {
	/**
	 * The cached value of the '{@link #getClientReference() <em>Client Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientReference()
	 * @generated
	 * @ordered
	 */
	protected OwlsOutputClientMessage clientReference;

	/**
	 * The cached value of the '{@link #getInputReferences() <em>Input References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputReferences()
	 * @generated
	 * @ordered
	 */
	protected OwlsOutput inputReferences;
	/**
	 * The cached value of the '{@link #getOutputsReferences() <em>Outputs References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputsReferences()
	 * @generated
	 * @ordered
	 */
	protected OwlsOutput outputsReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignOutputClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_ASSIGN_OUTPUT_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutputClientMessage getClientReference() {
		if (clientReference != null && clientReference.eIsProxy()) {
			InternalEObject oldClientReference = (InternalEObject)clientReference;
			clientReference = (OwlsOutputClientMessage)eResolveProxy(oldClientReference);
			if (clientReference != oldClientReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE, oldClientReference, clientReference));
			}
		}
		return clientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutputClientMessage basicGetClientReference() {
		return clientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientReference(OwlsOutputClientMessage newClientReference) {
		OwlsOutputClientMessage oldClientReference = clientReference;
		clientReference = newClientReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE, oldClientReference, clientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput getInputReferences() {
		if (inputReferences != null && inputReferences.eIsProxy()) {
			InternalEObject oldInputReferences = (InternalEObject)inputReferences;
			inputReferences = (OwlsOutput)eResolveProxy(oldInputReferences);
			if (inputReferences != oldInputReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES, oldInputReferences, inputReferences));
			}
		}
		return inputReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput basicGetInputReferences() {
		return inputReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputReferences(OwlsOutput newInputReferences) {
		OwlsOutput oldInputReferences = inputReferences;
		inputReferences = newInputReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES, oldInputReferences, inputReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput getOutputsReferences() {
		if (outputsReferences != null && outputsReferences.eIsProxy()) {
			InternalEObject oldOutputsReferences = (InternalEObject)outputsReferences;
			outputsReferences = (OwlsOutput)eResolveProxy(oldOutputsReferences);
			if (outputsReferences != oldOutputsReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES, oldOutputsReferences, outputsReferences));
			}
		}
		return outputsReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput basicGetOutputsReferences() {
		return outputsReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputsReferences(OwlsOutput newOutputsReferences) {
		OwlsOutput oldOutputsReferences = outputsReferences;
		outputsReferences = newOutputsReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES, oldOutputsReferences, outputsReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE:
				if (resolve) return getClientReference();
				return basicGetClientReference();
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES:
				if (resolve) return getInputReferences();
				return basicGetInputReferences();
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES:
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
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE:
				setClientReference((OwlsOutputClientMessage)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES:
				setInputReferences((OwlsOutput)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES:
				setOutputsReferences((OwlsOutput)newValue);
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
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE:
				setClientReference((OwlsOutputClientMessage)null);
				return;
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES:
				setInputReferences((OwlsOutput)null);
				return;
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES:
				setOutputsReferences((OwlsOutput)null);
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
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__CLIENT_REFERENCE:
				return clientReference != null;
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__INPUT_REFERENCES:
				return inputReferences != null;
			case OwlsPackage.OWLS_ASSIGN_OUTPUT_CLIENT__OUTPUTS_REFERENCES:
				return outputsReferences != null;
		}
		return super.eIsSet(featureID);
	}

} //OwlsAssignOutputClientImpl
