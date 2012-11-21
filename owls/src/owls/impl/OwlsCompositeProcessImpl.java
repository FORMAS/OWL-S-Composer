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

import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsCompositeProcessImpl#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsCompositeProcessImpl extends OwlsProcessImpl implements OwlsCompositeProcess {
	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected OwlsControlConstruct composedOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsCompositeProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_COMPOSITE_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsControlConstruct getComposedOf() {
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposedOf(OwlsControlConstruct newComposedOf, NotificationChain msgs) {
		OwlsControlConstruct oldComposedOf = composedOf;
		composedOf = newComposedOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF, oldComposedOf, newComposedOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposedOf(OwlsControlConstruct newComposedOf) {
		if (newComposedOf != composedOf) {
			NotificationChain msgs = null;
			if (composedOf != null)
				msgs = ((InternalEObject)composedOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF, null, msgs);
			if (newComposedOf != null)
				msgs = ((InternalEObject)newComposedOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF, null, msgs);
			msgs = basicSetComposedOf(newComposedOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF, newComposedOf, newComposedOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF:
				return basicSetComposedOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF:
				return getComposedOf();
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
			case OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF:
				setComposedOf((OwlsControlConstruct)newValue);
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
			case OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF:
				setComposedOf((OwlsControlConstruct)null);
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
			case OwlsPackage.OWLS_COMPOSITE_PROCESS__COMPOSED_OF:
				return composedOf != null;
		}
		return super.eIsSet(featureID);
	}

} //OwlsCompositeProcessImpl
