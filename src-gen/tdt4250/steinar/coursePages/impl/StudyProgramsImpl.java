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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.steinar.coursePages.Course;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.Department;
import tdt4250.steinar.coursePages.Student;
import tdt4250.steinar.coursePages.StudyPrograms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Programs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl#getStudyProgramCode <em>Study Program Code</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl#getStudyProgramName <em>Study Program Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl#getBelongsToDepartment <em>Belongs To Department</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgramsImpl extends MinimalEObjectImpl.Container implements StudyPrograms {
	/**
	 * The default value of the '{@link #getStudyProgramCode() <em>Study Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgramCode()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_PROGRAM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudyProgramCode() <em>Study Program Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgramCode()
	 * @generated
	 * @ordered
	 */
	protected String studyProgramCode = STUDY_PROGRAM_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudyProgramName() <em>Study Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgramName()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_PROGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudyProgramName() <em>Study Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgramName()
	 * @generated
	 * @ordered
	 */
	protected String studyProgramName = STUDY_PROGRAM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongsToDepartment() <em>Belongs To Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department belongsToDepartment;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

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
	protected StudyProgramsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.STUDY_PROGRAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudyProgramCode() {
		return studyProgramCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyProgramCode(String newStudyProgramCode) {
		String oldStudyProgramCode = studyProgramCode;
		studyProgramCode = newStudyProgramCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_CODE,
					oldStudyProgramCode, studyProgramCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudyProgramName() {
		return studyProgramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyProgramName(String newStudyProgramName) {
		String oldStudyProgramName = studyProgramName;
		studyProgramName = newStudyProgramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_NAME,
					oldStudyProgramName, studyProgramName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getBelongsToDepartment() {
		if (belongsToDepartment != null && belongsToDepartment.eIsProxy()) {
			InternalEObject oldBelongsToDepartment = (InternalEObject) belongsToDepartment;
			belongsToDepartment = (Department) eResolveProxy(oldBelongsToDepartment);
			if (belongsToDepartment != oldBelongsToDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT, oldBelongsToDepartment,
							belongsToDepartment));
			}
		}
		return belongsToDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetBelongsToDepartment() {
		return belongsToDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsToDepartment(Department newBelongsToDepartment, NotificationChain msgs) {
		Department oldBelongsToDepartment = belongsToDepartment;
		belongsToDepartment = newBelongsToDepartment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT, oldBelongsToDepartment,
					newBelongsToDepartment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToDepartment(Department newBelongsToDepartment) {
		if (newBelongsToDepartment != belongsToDepartment) {
			NotificationChain msgs = null;
			if (belongsToDepartment != null)
				msgs = ((InternalEObject) belongsToDepartment).eInverseRemove(this,
						CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS, Department.class, msgs);
			if (newBelongsToDepartment != null)
				msgs = ((InternalEObject) newBelongsToDepartment).eInverseAdd(this,
						CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS, Department.class, msgs);
			msgs = basicSetBelongsToDepartment(newBelongsToDepartment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT, newBelongsToDepartment,
					newBelongsToDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectWithInverseResolvingEList<Student>(Student.class, this,
					CoursePagesPackage.STUDY_PROGRAMS__STUDENT, CoursePagesPackage.STUDENT__STUDYPROGRAMS);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this,
					CoursePagesPackage.STUDY_PROGRAMS__COURSE, CoursePagesPackage.COURSE__STUDYPROGRAMS);
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
		case CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT:
			if (belongsToDepartment != null)
				msgs = ((InternalEObject) belongsToDepartment).eInverseRemove(this,
						CoursePagesPackage.DEPARTMENT__STUDYPROGRAMS, Department.class, msgs);
			return basicSetBelongsToDepartment((Department) otherEnd, msgs);
		case CoursePagesPackage.STUDY_PROGRAMS__STUDENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudent()).basicAdd(otherEnd, msgs);
		case CoursePagesPackage.STUDY_PROGRAMS__COURSE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCourse()).basicAdd(otherEnd, msgs);
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
		case CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT:
			return basicSetBelongsToDepartment(null, msgs);
		case CoursePagesPackage.STUDY_PROGRAMS__STUDENT:
			return ((InternalEList<?>) getStudent()).basicRemove(otherEnd, msgs);
		case CoursePagesPackage.STUDY_PROGRAMS__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
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
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_CODE:
			return getStudyProgramCode();
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_NAME:
			return getStudyProgramName();
		case CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT:
			if (resolve)
				return getBelongsToDepartment();
			return basicGetBelongsToDepartment();
		case CoursePagesPackage.STUDY_PROGRAMS__STUDENT:
			return getStudent();
		case CoursePagesPackage.STUDY_PROGRAMS__COURSE:
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
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_CODE:
			setStudyProgramCode((String) newValue);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_NAME:
			setStudyProgramName((String) newValue);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT:
			setBelongsToDepartment((Department) newValue);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection<? extends Student>) newValue);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__COURSE:
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
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_CODE:
			setStudyProgramCode(STUDY_PROGRAM_CODE_EDEFAULT);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_NAME:
			setStudyProgramName(STUDY_PROGRAM_NAME_EDEFAULT);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT:
			setBelongsToDepartment((Department) null);
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__STUDENT:
			getStudent().clear();
			return;
		case CoursePagesPackage.STUDY_PROGRAMS__COURSE:
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
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_CODE:
			return STUDY_PROGRAM_CODE_EDEFAULT == null ? studyProgramCode != null
					: !STUDY_PROGRAM_CODE_EDEFAULT.equals(studyProgramCode);
		case CoursePagesPackage.STUDY_PROGRAMS__STUDY_PROGRAM_NAME:
			return STUDY_PROGRAM_NAME_EDEFAULT == null ? studyProgramName != null
					: !STUDY_PROGRAM_NAME_EDEFAULT.equals(studyProgramName);
		case CoursePagesPackage.STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT:
			return belongsToDepartment != null;
		case CoursePagesPackage.STUDY_PROGRAMS__STUDENT:
			return student != null && !student.isEmpty();
		case CoursePagesPackage.STUDY_PROGRAMS__COURSE:
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
		result.append(" (studyProgramCode: ");
		result.append(studyProgramCode);
		result.append(", studyProgramName: ");
		result.append(studyProgramName);
		result.append(')');
		return result.toString();
	}

} //StudyProgramsImpl
