/**
 */
package tdt4250.steinar.coursePages.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.steinar.coursePages.Course;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.Department;
import tdt4250.steinar.coursePages.Employee;
import tdt4250.steinar.coursePages.StudyPrograms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.DepartmentImpl#getDepartmentName <em>Department Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.DepartmentImpl#getPhoneNummber <em>Phone Nummber</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.DepartmentImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.DepartmentImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.DepartmentImpl#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.DepartmentImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The default value of the '{@link #getDepartmentName() <em>Department Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartmentName() <em>Department Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartmentName()
	 * @generated
	 * @ordered
	 */
	protected String departmentName = DEPARTMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNummber() <em>Phone Nummber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNummber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNummber() <em>Phone Nummber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNummber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNummber = PHONE_NUMMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employee;

	/**
	 * The cached value of the '{@link #getStudyprograms() <em>Studyprograms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprograms()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPrograms> studyprograms;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartmentName(String newDepartmentName) {
		String oldDepartmentName = departmentName;
		departmentName = newDepartmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.DEPARTMENT__DEPARTMENT_NAME,
					oldDepartmentName, departmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNummber() {
		return phoneNummber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNummber(String newPhoneNummber) {
		String oldPhoneNummber = phoneNummber;
		phoneNummber = newPhoneNummber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.DEPARTMENT__PHONE_NUMMBER,
					oldPhoneNummber, phoneNummber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.DEPARTMENT__EMAIL, oldEmail,
					email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployee() {
		if (employee == null) {
			employee = new EObjectWithInverseResolvingEList<Employee>(Employee.class, this,
					CoursePagesPackage.DEPARTMENT__EMPLOYEE, CoursePagesPackage.EMPLOYEE__DEPARTMENT);
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyPrograms> getStudyprograms() {
		if (studyprograms == null) {
			studyprograms = new EObjectWithInverseResolvingEList<StudyPrograms>(StudyPrograms.class, this,
					CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS,
					CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT);
		}
		return studyprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectResolvingEList<Course>(Course.class, this, CoursePagesPackage.DEPARTMENT__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoursePagesPackage.DEPARTMENT__EMPLOYEE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEmployee()).basicAdd(otherEnd, msgs);
		case CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudyprograms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoursePagesPackage.DEPARTMENT__EMPLOYEE:
			return ((InternalEList<?>) getEmployee()).basicRemove(otherEnd, msgs);
		case CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS:
			return ((InternalEList<?>) getStudyprograms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoursePagesPackage.DEPARTMENT__DEPARTMENT_NAME:
			return getDepartmentName();
		case CoursePagesPackage.DEPARTMENT__PHONE_NUMMBER:
			return getPhoneNummber();
		case CoursePagesPackage.DEPARTMENT__EMAIL:
			return getEmail();
		case CoursePagesPackage.DEPARTMENT__EMPLOYEE:
			return getEmployee();
		case CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS:
			return getStudyprograms();
		case CoursePagesPackage.DEPARTMENT__COURSE:
			return getCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CoursePagesPackage.DEPARTMENT__DEPARTMENT_NAME:
			setDepartmentName((String) newValue);
			return;
		case CoursePagesPackage.DEPARTMENT__PHONE_NUMMBER:
			setPhoneNummber((String) newValue);
			return;
		case CoursePagesPackage.DEPARTMENT__EMAIL:
			setEmail((String) newValue);
			return;
		case CoursePagesPackage.DEPARTMENT__EMPLOYEE:
			getEmployee().clear();
			getEmployee().addAll((Collection<? extends Employee>) newValue);
			return;
		case CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS:
			getStudyprograms().clear();
			getStudyprograms().addAll((Collection<? extends StudyPrograms>) newValue);
			return;
		case CoursePagesPackage.DEPARTMENT__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
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
		case CoursePagesPackage.DEPARTMENT__DEPARTMENT_NAME:
			setDepartmentName(DEPARTMENT_NAME_EDEFAULT);
			return;
		case CoursePagesPackage.DEPARTMENT__PHONE_NUMMBER:
			setPhoneNummber(PHONE_NUMMBER_EDEFAULT);
			return;
		case CoursePagesPackage.DEPARTMENT__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case CoursePagesPackage.DEPARTMENT__EMPLOYEE:
			getEmployee().clear();
			return;
		case CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS:
			getStudyprograms().clear();
			return;
		case CoursePagesPackage.DEPARTMENT__COURSE:
			getCourse().clear();
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
		case CoursePagesPackage.DEPARTMENT__DEPARTMENT_NAME:
			return DEPARTMENT_NAME_EDEFAULT == null ? departmentName != null
					: !DEPARTMENT_NAME_EDEFAULT.equals(departmentName);
		case CoursePagesPackage.DEPARTMENT__PHONE_NUMMBER:
			return PHONE_NUMMBER_EDEFAULT == null ? phoneNummber != null : !PHONE_NUMMBER_EDEFAULT.equals(phoneNummber);
		case CoursePagesPackage.DEPARTMENT__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case CoursePagesPackage.DEPARTMENT__EMPLOYEE:
			return employee != null && !employee.isEmpty();
		case CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS:
			return studyprograms != null && !studyprograms.isEmpty();
		case CoursePagesPackage.DEPARTMENT__COURSE:
			return course != null && !course.isEmpty();
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
		result.append(" (departmentName: ");
		result.append(departmentName);
		result.append(", phoneNummber: ");
		result.append(phoneNummber);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
