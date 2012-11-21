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

import owls.OwlsOutput;
import owls.OwlsOutputClientMessage;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Client Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsOutputClientMessageImpl#getClientOutputs <em>Client Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsOutputClientMessageImpl extends OwlsClientMessageImpl implements OwlsOutputClientMessage {
	/**
	 * The cached value of the '{@link #getClientOutputs() <em>Client Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsOutput> clientOutputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsOutputClientMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_OUTPUT_CLIENT_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsOutput> getClientOutputs() {
		if (clientOutputs == null) {
			clientOutputs = new EObjectResolvingEList<OwlsOutput>(OwlsOutput.class, this, OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS);
		}
		return clientOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS:
				return getClientOutputs();
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
			case OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS:
				getClientOutputs().clear();
				getClientOutputs().addAll((Collection<? extends OwlsOutput>)newValue);
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
			case OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS:
				getClientOutputs().clear();
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
			case OwlsPackage.OWLS_OUTPUT_CLIENT_MESSAGE__CLIENT_OUTPUTS:
				return clientOutputs != null && !clientOutputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OwlsOutputClientMessageImpl
