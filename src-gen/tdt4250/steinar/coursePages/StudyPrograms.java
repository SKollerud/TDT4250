/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Programs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramCode <em>Study Program Code</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramName <em>Study Program Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.StudyPrograms#getBelongsToDepartment <em>Belongs To Department</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.StudyPrograms#getStudent <em>Student</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.StudyPrograms#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudyPrograms()
 * @model
 * @generated
 */
public interface StudyPrograms extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Program Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Program Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program Code</em>' attribute.
	 * @see #setStudyProgramCode(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudyPrograms_StudyProgramCode()
	 * @model
	 * @generated
	 */
	String getStudyProgramCode();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramCode <em>Study Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Program Code</em>' attribute.
	 * @see #getStudyProgramCode()
	 * @generated
	 */
	void setStudyProgramCode(String value);

	/**
	 * Returns the value of the '<em><b>Study Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Program Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program Name</em>' attribute.
	 * @see #setStudyProgramName(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudyPrograms_StudyProgramName()
	 * @model
	 * @generated
	 */
	String getStudyProgramName();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramName <em>Study Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Program Name</em>' attribute.
	 * @see #getStudyProgramName()
	 * @generated
	 */
	void setStudyProgramName(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To Department</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.Department#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Department</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Department</em>' reference.
	 * @see #setBelongsToDepartment(Department)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudyPrograms_BelongsToDepartment()
	 * @see tdt4250.steinar.coursePages.Department#getStudyprograms
	 * @model opposite="studyprograms" required="true"
	 * @generated
	 */
	Department getBelongsToDepartment();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.StudyPrograms#getBelongsToDepartment <em>Belongs To Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Department</em>' reference.
	 * @see #getBelongsToDepartment()
	 * @generated
	 */
	void setBelongsToDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.Student}.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.Student#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudyPrograms_Student()
	 * @see tdt4250.steinar.coursePages.Student#getStudyprograms
	 * @model opposite="studyprograms"
	 * @generated
	 */
	EList<Student> getStudent();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.Course#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getStudyPrograms_Course()
	 * @see tdt4250.steinar.coursePages.Course#getStudyprograms
	 * @model opposite="studyprograms"
	 * @generated
	 */
	EList<Course> getCourse();

} // StudyPrograms
