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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250.steinar.coursePages.Course;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.Student;
import tdt4250.steinar.coursePages.StudyPrograms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudentImpl#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudentImpl#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.StudentImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The default value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected String studentID = STUDENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyprograms() <em>Studyprograms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprograms()
	 * @generated
	 * @ordered
	 */
	protected StudyPrograms studyprograms;

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
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentID(String newStudentID) {
		String oldStudentID = studentID;
		studentID = newStudentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.STUDENT__STUDENT_ID, oldStudentID,
					studentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPrograms getStudyprograms() {
		if (studyprograms != null && studyprograms.eIsProxy()) {
			InternalEObject oldStudyprograms = (InternalEObject) studyprograms;
			studyprograms = (StudyPrograms) eResolveProxy(oldStudyprograms);
			if (studyprograms != oldStudyprograms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePagesPackage.STUDENT__STUDYPROGRAMS,
							oldStudyprograms, studyprograms));
			}
		}
		return studyprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPrograms basicGetStudyprograms() {
		return studyprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyprograms(StudyPrograms newStudyprograms, NotificationChain msgs) {
		StudyPrograms oldStudyprograms = studyprograms;
		studyprograms = newStudyprograms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.STUDENT__STUDYPROGRAMS, oldStudyprograms, newStudyprograms);
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
	public void setStudyprograms(StudyPrograms newStudyprograms) {
		if (newStudyprograms != studyprograms) {
			NotificationChain msgs = null;
			if (studyprograms != null)
				msgs = ((InternalEObject) studyprograms).eInverseRemove(this,
						CoursePagesPackage.STUDY_PROGRAMS__STUDENT, StudyPrograms.class, msgs);
			if (newStudyprograms != null)
				msgs = ((InternalEObject) newStudyprograms).eInverseAdd(this,
						CoursePagesPackage.STUDY_PROGRAMS__STUDENT, StudyPrograms.class, msgs);
			msgs = basicSetStudyprograms(newStudyprograms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.STUDENT__STUDYPROGRAMS,
					newStudyprograms, newStudyprograms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectResolvingEList<Course>(Course.class, this, CoursePagesPackage.STUDENT__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoursePagesPackage.STUDENT__STUDYPROGRAMS:
			if (studyprograms != null)
				msgs = ((InternalEObject) studyprograms).eInverseRemove(this,
						CoursePagesPackage.STUDY_PROGRAMS__STUDENT, StudyPrograms.class, msgs);
			return basicSetStudyprograms((StudyPrograms) otherEnd, msgs);
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
		case CoursePagesPackage.STUDENT__STUDYPROGRAMS:
			return basicSetStudyprograms(null, msgs);
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
		case CoursePagesPackage.STUDENT__STUDENT_ID:
			return getStudentID();
		case CoursePagesPackage.STUDENT__STUDYPROGRAMS:
			if (resolve)
				return getStudyprograms();
			return basicGetStudyprograms();
		case CoursePagesPackage.STUDENT__COURSE:
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
		case CoursePagesPackage.STUDENT__STUDENT_ID:
			setStudentID((String) newValue);
			return;
		case CoursePagesPackage.STUDENT__STUDYPROGRAMS:
			setStudyprograms((StudyPrograms) newValue);
			return;
		case CoursePagesPackage.STUDENT__COURSE:
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
		case CoursePagesPackage.STUDENT__STUDENT_ID:
			setStudentID(STUDENT_ID_EDEFAULT);
			return;
		case CoursePagesPackage.STUDENT__STUDYPROGRAMS:
			setStudyprograms((StudyPrograms) null);
			return;
		case CoursePagesPackage.STUDENT__COURSE:
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
		case CoursePagesPackage.STUDENT__STUDENT_ID:
			return STUDENT_ID_EDEFAULT == null ? studentID != null : !STUDENT_ID_EDEFAULT.equals(studentID);
		case CoursePagesPackage.STUDENT__STUDYPROGRAMS:
			return studyprograms != null;
		case CoursePagesPackage.STUDENT__COURSE:
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
		result.append(" (studentID: ");
		result.append(studentID);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
