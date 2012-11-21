/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsOntology#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsOntology()
 * @model
 * @generated
 */
public interface OwlsOntology extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see owls.OwlsPackage#getOwlsOntology_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

} // OwlsOntology
