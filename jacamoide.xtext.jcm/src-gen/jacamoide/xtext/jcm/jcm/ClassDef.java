/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.ClassDef#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.ClassDef#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getClassDef()
 * @model
 * @generated
 */
public interface ClassDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Infrastructure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infrastructure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infrastructure</em>' attribute.
   * @see #setInfrastructure(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getClassDef_Infrastructure()
   * @model
   * @generated
   */
  String getInfrastructure();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.ClassDef#getInfrastructure <em>Infrastructure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infrastructure</em>' attribute.
   * @see #getInfrastructure()
   * @generated
   */
  void setInfrastructure(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getClassDef_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameter();

} // ClassDef
