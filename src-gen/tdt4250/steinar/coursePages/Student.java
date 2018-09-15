/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Student#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Student#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Student#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student ID</em>' attribute.
	 * @see #setStudentID(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudent_StudentID()
	 * @model
	 * @generated
	 */
	String getStudentID();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Student#getStudentID <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student ID</em>' attribute.
	 * @see #getStudentID()
	 * @generated
	 */
	void setStudentID(String value);

	/**
	 * Returns the value of the '<em><b>Studyprograms</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.StudyPrograms#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studyprograms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprograms</em>' reference.
	 * @see #setStudyprograms(StudyPrograms)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudent_Studyprograms()
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getStudent
	 * @model opposite="student" required="true"
	 * @generated
	 */
	StudyPrograms getStudyprograms();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Student#getStudyprograms <em>Studyprograms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studyprograms</em>' reference.
	 * @see #getStudyprograms()
	 * @generated
	 */
	void setStudyprograms(StudyPrograms value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudent_Course()
	 * @model
	 * @generated
	 */
	EList<Course> getCourse();

} // Student
