/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Department#getDepartmentName <em>Department Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Department#getPhoneNummber <em>Phone Nummber</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Department#getEmail <em>Email</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Department#getEmployee <em>Employee</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Department#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Department#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Department Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department Name</em>' attribute.
	 * @see #setDepartmentName(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment_DepartmentName()
	 * @model
	 * @generated
	 */
	String getDepartmentName();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Department#getDepartmentName <em>Department Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department Name</em>' attribute.
	 * @see #getDepartmentName()
	 * @generated
	 */
	void setDepartmentName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Nummber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Nummber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Nummber</em>' attribute.
	 * @see #setPhoneNummber(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment_PhoneNummber()
	 * @model
	 * @generated
	 */
	String getPhoneNummber();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Department#getPhoneNummber <em>Phone Nummber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Nummber</em>' attribute.
	 * @see #getPhoneNummber()
	 * @generated
	 */
	void setPhoneNummber(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Department#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.Employee}.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.Employee#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment_Employee()
	 * @see tdt4250.steinar.coursePages.Employee#getDepartment
	 * @model opposite="department"
	 * @generated
	 */
	EList<Employee> getEmployee();

	/**
	 * Returns the value of the '<em><b>Studyprograms</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.StudyPrograms}.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.StudyPrograms#getBelongsToDepartment <em>Belongs To Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studyprograms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprograms</em>' reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment_Studyprograms()
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getBelongsToDepartment
	 * @model opposite="belongsToDepartment"
	 * @generated
	 */
	EList<StudyPrograms> getStudyprograms();

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
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getDepartment_Course()
	 * @model
	 * @generated
	 */
	EList<Course> getCourse();

} // Department
