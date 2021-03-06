/**
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Terms#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getTerms()
 * @model
 * @generated
 */
public interface Terms extends EObject
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Term}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getTerms_Term()
   * @model containment="true"
   * @generated
   */
  EList<Term> getTerm();

} // Terms
