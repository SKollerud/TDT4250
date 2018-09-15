/**
 */
package tdt4250.steinar.coursePages;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Employee#getPosition <em>Position</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Employee#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEmployee_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Employee#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.steinar.coursePages.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' reference.
	 * @see #setDepartment(Department)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEmployee_Department()
	 * @see tdt4250.steinar.coursePages.Department#getEmployee
	 * @model opposite="employee" required="true"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Employee#getDepartment <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Employee
