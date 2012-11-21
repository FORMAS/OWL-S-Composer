/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owls.OwlsAssign;
import owls.OwlsAssignClient;
import owls.OwlsInput;
import owls.OwlsOutput;
import owls.OwlsPackage;
import owls.OwlsPeform;
import owls.OwlsProcess;
import owls.OwlsService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsProcessImpl#getID <em>ID</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getProcessURI <em>Process URI</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getDescribes <em>Describes</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getPeformedBy <em>Peformed By</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getHasInputs <em>Has Inputs</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getHasOutputs <em>Has Outputs</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link owls.impl.OwlsProcessImpl#getMessagesBindings <em>Messages Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsProcessImpl extends EObjectImpl implements OwlsProcess {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessURI() <em>Process URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessURI() <em>Process URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessURI()
	 * @generated
	 * @ordered
	 */
	protected String processURI = PROCESS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescribes() <em>Describes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribes()
	 * @generated
	 * @ordered
	 */
	protected OwlsService describes;

	/**
	 * The cached value of the '{@link #getPeformedBy() <em>Peformed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeformedBy()
	 * @generated
	 * @ordered
	 */
	protected OwlsPeform peformedBy;

	/**
	 * The cached value of the '{@link #getHasInputs() <em>Has Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsInput> hasInputs;

	/**
	 * The cached value of the '{@link #getHasOutputs() <em>Has Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsOutput> hasOutputs;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsAssign> bindings;

	/**
	 * The cached value of the '{@link #getMessagesBindings() <em>Messages Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagesBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsAssignClient> messagesBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessURI() {
		return processURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessURI(String newProcessURI) {
		String oldProcessURI = processURI;
		processURI = newProcessURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__PROCESS_URI, oldProcessURI, processURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsService getDescribes() {
		return describes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribes(OwlsService newDescribes, NotificationChain msgs) {
		OwlsService oldDescribes = describes;
		describes = newDescribes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__DESCRIBES, oldDescribes, newDescribes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribes(OwlsService newDescribes) {
		if (newDescribes != describes) {
			NotificationChain msgs = null;
			if (describes != null)
				msgs = ((InternalEObject)describes).eInverseRemove(this, OwlsPackage.OWLS_SERVICE__DESCRIBED_BY, OwlsService.class, msgs);
			if (newDescribes != null)
				msgs = ((InternalEObject)newDescribes).eInverseAdd(this, OwlsPackage.OWLS_SERVICE__DESCRIBED_BY, OwlsService.class, msgs);
			msgs = basicSetDescribes(newDescribes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__DESCRIBES, newDescribes, newDescribes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsPeform getPeformedBy() {
		return peformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeformedBy(OwlsPeform newPeformedBy, NotificationChain msgs) {
		OwlsPeform oldPeformedBy = peformedBy;
		peformedBy = newPeformedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__PEFORMED_BY, oldPeformedBy, newPeformedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeformedBy(OwlsPeform newPeformedBy) {
		if (newPeformedBy != peformedBy) {
			NotificationChain msgs = null;
			if (peformedBy != null)
				msgs = ((InternalEObject)peformedBy).eInverseRemove(this, OwlsPackage.OWLS_PEFORM__PROCESS, OwlsPeform.class, msgs);
			if (newPeformedBy != null)
				msgs = ((InternalEObject)newPeformedBy).eInverseAdd(this, OwlsPackage.OWLS_PEFORM__PROCESS, OwlsPeform.class, msgs);
			msgs = basicSetPeformedBy(newPeformedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROCESS__PEFORMED_BY, newPeformedBy, newPeformedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsInput> getHasInputs() {
		if (hasInputs == null) {
			hasInputs = new EObjectContainmentEList<OwlsInput>(OwlsInput.class, this, OwlsPackage.OWLS_PROCESS__HAS_INPUTS);
		}
		return hasInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsOutput> getHasOutputs() {
		if (hasOutputs == null) {
			hasOutputs = new EObjectContainmentEList<OwlsOutput>(OwlsOutput.class, this, OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS);
		}
		return hasOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsAssign> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<OwlsAssign>(OwlsAssign.class, this, OwlsPackage.OWLS_PROCESS__BINDINGS, OwlsPackage.OWLS_ASSIGN__TARGET);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsAssignClient> getMessagesBindings() {
		if (messagesBindings == null) {
			messagesBindings = new EObjectContainmentWithInverseEList<OwlsAssignClient>(OwlsAssignClient.class, this, OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS, OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE);
		}
		return messagesBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
				if (describes != null)
					msgs = ((InternalEObject)describes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_PROCESS__DESCRIBES, null, msgs);
				return basicSetDescribes((OwlsService)otherEnd, msgs);
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
				if (peformedBy != null)
					msgs = ((InternalEObject)peformedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_PROCESS__PEFORMED_BY, null, msgs);
				return basicSetPeformedBy((OwlsPeform)otherEnd, msgs);
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessagesBindings()).basicAdd(otherEnd, msgs);
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
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
				return basicSetDescribes(null, msgs);
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
				return basicSetPeformedBy(null, msgs);
			case OwlsPackage.OWLS_PROCESS__HAS_INPUTS:
				return ((InternalEList<?>)getHasInputs()).basicRemove(otherEnd, msgs);
			case OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS:
				return ((InternalEList<?>)getHasOutputs()).basicRemove(otherEnd, msgs);
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
				return ((InternalEList<?>)getMessagesBindings()).basicRemove(otherEnd, msgs);
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
			case OwlsPackage.OWLS_PROCESS__ID:
				return getID();
			case OwlsPackage.OWLS_PROCESS__LABEL:
				return getLabel();
			case OwlsPackage.OWLS_PROCESS__PROCESS_URI:
				return getProcessURI();
			case OwlsPackage.OWLS_PROCESS__REFERENCE_NAME:
				return getReferenceName();
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
				return getDescribes();
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
				return getPeformedBy();
			case OwlsPackage.OWLS_PROCESS__HAS_INPUTS:
				return getHasInputs();
			case OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS:
				return getHasOutputs();
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
				return getBindings();
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
				return getMessagesBindings();
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
			case OwlsPackage.OWLS_PROCESS__ID:
				setID((String)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__LABEL:
				setLabel((String)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__PROCESS_URI:
				setProcessURI((String)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
				setDescribes((OwlsService)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
				setPeformedBy((OwlsPeform)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__HAS_INPUTS:
				getHasInputs().clear();
				getHasInputs().addAll((Collection<? extends OwlsInput>)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS:
				getHasOutputs().clear();
				getHasOutputs().addAll((Collection<? extends OwlsOutput>)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends OwlsAssign>)newValue);
				return;
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
				getMessagesBindings().clear();
				getMessagesBindings().addAll((Collection<? extends OwlsAssignClient>)newValue);
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
			case OwlsPackage.OWLS_PROCESS__ID:
				setID(ID_EDEFAULT);
				return;
			case OwlsPackage.OWLS_PROCESS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case OwlsPackage.OWLS_PROCESS__PROCESS_URI:
				setProcessURI(PROCESS_URI_EDEFAULT);
				return;
			case OwlsPackage.OWLS_PROCESS__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
				setDescribes((OwlsService)null);
				return;
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
				setPeformedBy((OwlsPeform)null);
				return;
			case OwlsPackage.OWLS_PROCESS__HAS_INPUTS:
				getHasInputs().clear();
				return;
			case OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS:
				getHasOutputs().clear();
				return;
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
				getBindings().clear();
				return;
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
				getMessagesBindings().clear();
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
			case OwlsPackage.OWLS_PROCESS__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OwlsPackage.OWLS_PROCESS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case OwlsPackage.OWLS_PROCESS__PROCESS_URI:
				return PROCESS_URI_EDEFAULT == null ? processURI != null : !PROCESS_URI_EDEFAULT.equals(processURI);
			case OwlsPackage.OWLS_PROCESS__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case OwlsPackage.OWLS_PROCESS__DESCRIBES:
				return describes != null;
			case OwlsPackage.OWLS_PROCESS__PEFORMED_BY:
				return peformedBy != null;
			case OwlsPackage.OWLS_PROCESS__HAS_INPUTS:
				return hasInputs != null && !hasInputs.isEmpty();
			case OwlsPackage.OWLS_PROCESS__HAS_OUTPUTS:
				return hasOutputs != null && !hasOutputs.isEmpty();
			case OwlsPackage.OWLS_PROCESS__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS:
				return messagesBindings != null && !messagesBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iD: ");
		result.append(iD);
		result.append(", label: ");
		result.append(label);
		result.append(", processURI: ");
		result.append(processURI);
		result.append(", referenceName: ");
		result.append(referenceName);
		result.append(')');
		return result.toString();
	}

} //OwlsProcessImpl
