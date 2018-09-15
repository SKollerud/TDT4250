/**
 */
package tdt4250.steinar.coursePages.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.CourseWorker;
import tdt4250.steinar.coursePages.Employee;
import tdt4250.steinar.coursePages.personRoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkerImpl#getCourseRole <em>Course Role</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkerImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseWorkerImpl extends MinimalEObjectImpl.Container implements CourseWorker {
	/**
	 * The default value of the '{@link #getCourseRole() <em>Course Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseRole()
	 * @generated
	 * @ordered
	 */
	protected static final personRoleType COURSE_ROLE_EDEFAULT = personRoleType.LECTURE;

	/**
	 * The cached value of the '{@link #getCourseRole() <em>Course Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseRole()
	 * @generated
	 * @ordered
	 */
	protected personRoleType courseRole = COURSE_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected Employee employee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseWorkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.COURSE_WORKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public personRoleType getCourseRole() {
		return courseRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseRole(personRoleType newCourseRole) {
		personRoleType oldCourseRole = courseRole;
		courseRole = newCourseRole == null ? COURSE_ROLE_EDEFAULT : newCourseRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_WORKER__COURSE_ROLE,
					oldCourseRole, courseRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getEmployee() {
		if (employee != null && employee.eIsProxy()) {
			InternalEObject oldEmployee = (InternalEObject) employee;
			employee = (Employee) eResolveProxy(oldEmployee);
			if (employee != oldEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoursePagesPackage.COURSE_WORKER__EMPLOYEE, oldEmployee, employee));
			}
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetEmployee() {
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployee(Employee newEmployee) {
		Employee oldEmployee = employee;
		employee = newEmployee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_WORKER__EMPLOYEE,
					oldEmployee, employee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_WORKER__COURSE_ROLE:
			return getCourseRole();
		case CoursePagesPackage.COURSE_WORKER__EMPLOYEE:
			if (resolve)
				return getEmployee();
			return basicGetEmployee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_WORKER__COURSE_ROLE:
			setCourseRole((personRoleType) newValue);
			return;
		case CoursePagesPackage.COURSE_WORKER__EMPLOYEE:
			setEmployee((Employee) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_WORKER__COURSE_ROLE:
			setCourseRole(COURSE_ROLE_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE_WORKER__EMPLOYEE:
			setEmployee((Employee) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_WORKER__COURSE_ROLE:
			return courseRole != COURSE_ROLE_EDEFAULT;
		case CoursePagesPackage.COURSE_WORKER__EMPLOYEE:
			return employee != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (courseRole: ");
		result.append(courseRole);
		result.append(')');
		return result.toString();
	}

} //CourseWorkerImpl
