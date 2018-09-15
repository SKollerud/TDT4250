/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Evaluations#getEvaluationobject <em>Evaluationobject</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SumUpCredit100'"
 * @generated
 */
public interface Evaluations extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluationobject</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.EvaluationObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluationobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluationobject</em>' containment reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluations_Evaluationobject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EvaluationObject> getEvaluationobject();

} // Evaluations
