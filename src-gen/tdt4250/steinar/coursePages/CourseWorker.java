/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorker#getCourseRole <em>Course Role</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorker#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorker()
 * @model
 * @generated
 */
public interface CourseWorker extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Role</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.steinar.coursePages.personRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Role</em>' attribute.
	 * @see tdt4250.steinar.coursePages.personRoleType
	 * @see #setCourseRole(personRoleType)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorker_CourseRole()
	 * @model
	 * @generated
	 */
	personRoleType getCourseRole();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorker#getCourseRole <em>Course Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Role</em>' attribute.
	 * @see tdt4250.steinar.coursePages.personRoleType
	 * @see #getCourseRole()
	 * @generated
	 */
	void setCourseRole(personRoleType value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Employee)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorker_Employee()
	 * @model
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorker#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

} // CourseWorker
