/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.CourseInstance#getCoursework <em>Coursework</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseInstance#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseInstance#getCourseYear <em>Course Year</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseInstance#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseInstance()
 * @model
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Coursework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coursework</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursework</em>' containment reference.
	 * @see #setCoursework(CourseWork)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseInstance_Coursework()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CourseWork getCoursework();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseInstance#getCoursework <em>Coursework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coursework</em>' containment reference.
	 * @see #getCoursework()
	 * @generated
	 */
	void setCoursework(CourseWork value);

	/**
	 * Returns the value of the '<em><b>Evaluations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluations</em>' containment reference.
	 * @see #setEvaluations(Evaluations)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseInstance_Evaluations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Evaluations getEvaluations();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseInstance#getEvaluations <em>Evaluations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluations</em>' containment reference.
	 * @see #getEvaluations()
	 * @generated
	 */
	void setEvaluations(Evaluations value);

	/**
	 * Returns the value of the '<em><b>Course Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Year</em>' attribute.
	 * @see #setCourseYear(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseInstance_CourseYear()
	 * @model
	 * @generated
	 */
	String getCourseYear();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseInstance#getCourseYear <em>Course Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Year</em>' attribute.
	 * @see #getCourseYear()
	 * @generated
	 */
	void setCourseYear(String value);

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
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseInstance_Term()
	 * @model
	 * @generated
	 */
	TermType getTerm();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseInstance#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see tdt4250.steinar.coursePages.TermType
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TermType value);

} // CourseInstance
