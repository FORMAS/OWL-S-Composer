/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsCompositeProcess#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsCompositeProcess()
 * @model
 * @generated
 */
public interface OwlsCompositeProcess extends OwlsProcess {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference.
	 * @see #setComposedOf(OwlsControlConstruct)
	 * @see owls.OwlsPackage#getOwlsCompositeProcess_ComposedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OwlsControlConstruct getComposedOf();

	/**
	 * Sets the value of the '{@link owls.OwlsCompositeProcess#getComposedOf <em>Composed Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Of</em>' containment reference.
	 * @see #getComposedOf()
	 * @generated
	 */
	void setComposedOf(OwlsControlConstruct value);

} // OwlsCompositeProcess
