/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getCourseCredits <em>Course Credits</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getCourseContent <em>Course Content</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getCourseinstance <em>Courseinstance</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getCourseworker <em>Courseworker</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Course#getReduction <em>Reduction</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Course Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Credits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Credits</em>' attribute.
	 * @see #setCourseCredits(float)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_CourseCredits()
	 * @model
	 * @generated
	 */
	float getCourseCredits();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Course#getCourseCredits <em>Course Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Credits</em>' attribute.
	 * @see #getCourseCredits()
	 * @generated
	 */
	void setCourseCredits(float value);

	/**
	 * Returns the value of the '<em><b>Course Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Content</em>' attribute.
	 * @see #setCourseContent(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_CourseContent()
	 * @model
	 * @generated
	 */
	String getCourseContent();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Course#getCourseContent <em>Course Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Content</em>' attribute.
	 * @see #getCourseContent()
	 * @generated
	 */
	void setCourseContent(String value);

	/**
	 * Returns the value of the '<em><b>Courseinstance</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.CourseInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseinstance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseinstance</em>' containment reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_Courseinstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseInstance> getCourseinstance();

	/**
	 * Returns the value of the '<em><b>Studyprograms</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.StudyPrograms}.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.StudyPrograms#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studyprograms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprograms</em>' reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_Studyprograms()
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<StudyPrograms> getStudyprograms();

	/**
	 * Returns the value of the '<em><b>Courseworker</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.CourseWorker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseworker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseworker</em>' containment reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_Courseworker()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseWorker> getCourseworker();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.Precondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Reduction</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.Reduction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction</em>' containment reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourse_Reduction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reduction> getReduction();

} // Course
