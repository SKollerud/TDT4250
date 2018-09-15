/**
 */
package tdt4250.steinar.coursePages;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.EvaluationObject#getEvaluationsForm <em>Evaluations Form</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.EvaluationObject#getTerm <em>Term</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.EvaluationObject#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.EvaluationObject#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluationObject()
 * @model
 * @generated
 */
public interface EvaluationObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluations Form</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.steinar.coursePages.EvaluationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluations Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluations Form</em>' attribute.
	 * @see tdt4250.steinar.coursePages.EvaluationType
	 * @see #setEvaluationsForm(EvaluationType)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluationObject_EvaluationsForm()
	 * @model
	 * @generated
	 */
	EvaluationType getEvaluationsForm();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.EvaluationObject#getEvaluationsForm <em>Evaluations Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluations Form</em>' attribute.
	 * @see tdt4250.steinar.coursePages.EvaluationType
	 * @see #getEvaluationsForm()
	 * @generated
	 */
	void setEvaluationsForm(EvaluationType value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.steinar.coursePages.TermType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see tdt4250.steinar.coursePages.TermType
	 * @see #setTerm(TermType)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluationObject_Term()
	 * @model
	 * @generated
	 */
	TermType getTerm();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.EvaluationObject#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see tdt4250.steinar.coursePages.TermType
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TermType value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluationObject_Credits()
	 * @model
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.EvaluationObject#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluationObject_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.EvaluationObject#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // EvaluationObject
