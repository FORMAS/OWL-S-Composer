/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import owls.OwlsAssign;
import owls.OwlsInput;
import owls.OwlsOutput;
import owls.OwlsPackage;
import owls.OwlsProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsAssignImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignImpl#getSource <em>Source</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignImpl#getInputTarget <em>Input Target</em>}</li>
 *   <li>{@link owls.impl.OwlsAssignImpl#getOutputSource <em>Output Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsAssignImpl extends EObjectImpl implements OwlsAssign {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OwlsProcess source;

	/**
	 * The cached value of the '{@link #getInputTarget() <em>Input Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTarget()
	 * @generated
	 * @ordered
	 */
	protected OwlsInput inputTarget;

	/**
	 * The cached value of the '{@link #getOutputSource() <em>Output Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSource()
	 * @generated
	 * @ordered
	 */
	protected OwlsOutput outputSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess getTarget() {
		if (eContainerFeatureID != OwlsPackage.OWLS_ASSIGN__TARGET) return null;
		return (OwlsProcess)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(OwlsProcess newTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTarget, OwlsPackage.OWLS_ASSIGN__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OwlsProcess newTarget) {
		if (newTarget != eInternalContainer() || (eContainerFeatureID != OwlsPackage.OWLS_ASSIGN__TARGET && newTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OwlsPackage.OWLS_PROCESS__BINDINGS, OwlsProcess.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OwlsProcess)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OwlsProcess newSource) {
		OwlsProcess oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput getInputTarget() {
		if (inputTarget != null && inputTarget.eIsProxy()) {
			InternalEObject oldInputTarget = (InternalEObject)inputTarget;
			inputTarget = (OwlsInput)eResolveProxy(oldInputTarget);
			if (inputTarget != oldInputTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN__INPUT_TARGET, oldInputTarget, inputTarget));
			}
		}
		return inputTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsInput basicGetInputTarget() {
		return inputTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTarget(OwlsInput newInputTarget) {
		OwlsInput oldInputTarget = inputTarget;
		inputTarget = newInputTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN__INPUT_TARGET, oldInputTarget, inputTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput getOutputSource() {
		if (outputSource != null && outputSource.eIsProxy()) {
			InternalEObject oldOutputSource = (InternalEObject)outputSource;
			outputSource = (OwlsOutput)eResolveProxy(oldOutputSource);
			if (outputSource != oldOutputSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_ASSIGN__OUTPUT_SOURCE, oldOutputSource, outputSource));
			}
		}
		return outputSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOutput basicGetOutputSource() {
		return outputSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSource(OwlsOutput newOutputSource) {
		OwlsOutput oldOutputSource = outputSource;
		outputSource = newOutputSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN__OUTPUT_SOURCE, oldOutputSource, outputSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget((OwlsProcess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				return eInternalContainer().eInverseRemove(this, OwlsPackage.OWLS_PROCESS__BINDINGS, OwlsProcess.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				return getTarget();
			case OwlsPackage.OWLS_ASSIGN__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OwlsPackage.OWLS_ASSIGN__INPUT_TARGET:
				if (resolve) return getInputTarget();
				return basicGetInputTarget();
			case OwlsPackage.OWLS_ASSIGN__OUTPUT_SOURCE:
				if (resolve) return getOutputSource();
				return basicGetOutputSource();
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
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				setTarget((OwlsProcess)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN__SOURCE:
				setSource((OwlsProcess)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN__INPUT_TARGET:
				setInputTarget((OwlsInput)newValue);
				return;
			case OwlsPackage.OWLS_ASSIGN__OUTPUT_SOURCE:
				setOutputSource((OwlsOutput)newValue);
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
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				setTarget((OwlsProcess)null);
				return;
			case OwlsPackage.OWLS_ASSIGN__SOURCE:
				setSource((OwlsProcess)null);
				return;
			case OwlsPackage.OWLS_ASSIGN__INPUT_TARGET:
				setInputTarget((OwlsInput)null);
				return;
			case OwlsPackage.OWLS_ASSIGN__OUTPUT_SOURCE:
				setOutputSource((OwlsOutput)null);
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
			case OwlsPackage.OWLS_ASSIGN__TARGET:
				return getTarget() != null;
			case OwlsPackage.OWLS_ASSIGN__SOURCE:
				return source != null;
			case OwlsPackage.OWLS_ASSIGN__INPUT_TARGET:
				return inputTarget != null;
			case OwlsPackage.OWLS_ASSIGN__OUTPUT_SOURCE:
				return outputSource != null;
		}
		return super.eIsSet(featureID);
	}

} //OwlsAssignImpl
