/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owls.OwlsInput;
import owls.OwlsInputClientMessage;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Client Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsInputClientMessageImpl#getClientInputs <em>Client Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsInputClientMessageImpl extends OwlsClientMessageImpl implements OwlsInputClientMessage {
	/**
	 * The cached value of the '{@link #getClientInputs() <em>Client Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsInput> clientInputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsInputClientMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_INPUT_CLIENT_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsInput> getClientInputs() {
		if (clientInputs == null) {
			clientInputs = new EObjectResolvingEList<OwlsInput>(OwlsInput.class, this, OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS);
		}
		return clientInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS:
				return getClientInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS:
				getClientInputs().clear();
				getClientInputs().addAll((Collection<? extends OwlsInput>)newValue);
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
			case OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS:
				getClientInputs().clear();
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
			case OwlsPackage.OWLS_INPUT_CLIENT_MESSAGE__CLIENT_INPUTS:
				return clientInputs != null && !clientInputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OwlsInputClientMessageImpl
