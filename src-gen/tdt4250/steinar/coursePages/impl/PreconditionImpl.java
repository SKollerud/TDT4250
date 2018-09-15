/**
 */
package tdt4250.steinar.coursePages.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.steinar.coursePages.Course;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.PrecondistionType;
import tdt4250.steinar.coursePages.Precondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.PreconditionImpl#getPreconditionStatus <em>Precondition Status</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.PreconditionImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreconditionImpl extends MinimalEObjectImpl.Container implements Precondition {
	/**
	 * The default value of the '{@link #getPreconditionStatus() <em>Precondition Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PrecondistionType PRECONDITION_STATUS_EDEFAULT = PrecondistionType.REQUIRED;

	/**
	 * The cached value of the '{@link #getPreconditionStatus() <em>Precondition Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionStatus()
	 * @generated
	 * @ordered
	 */
	protected PrecondistionType preconditionStatus = PRECONDITION_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecondistionType getPreconditionStatus() {
		return preconditionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreconditionStatus(PrecondistionType newPreconditionStatus) {
		PrecondistionType oldPreconditionStatus = preconditionStatus;
		preconditionStatus = newPreconditionStatus == null ? PRECONDITION_STATUS_EDEFAULT : newPreconditionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.PRECONDITION__PRECONDITION_STATUS,
					oldPreconditionStatus, preconditionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject) course;
			course = (Course) eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePagesPackage.PRECONDITION__COURSE,
							oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.PRECONDITION__COURSE, oldCourse,
					course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoursePagesPackage.PRECONDITION__PRECONDITION_STATUS:
			return getPreconditionStatus();
		case CoursePagesPackage.PRECONDITION__COURSE:
			if (resolve)
				return getCourse();
			return basicGetCourse();
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
		case CoursePagesPackage.PRECONDITION__PRECONDITION_STATUS:
			setPreconditionStatus((PrecondistionType) newValue);
			return;
		case CoursePagesPackage.PRECONDITION__COURSE:
			setCourse((Course) newValue);
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
		case CoursePagesPackage.PRECONDITION__PRECONDITION_STATUS:
			setPreconditionStatus(PRECONDITION_STATUS_EDEFAULT);
			return;
		case CoursePagesPackage.PRECONDITION__COURSE:
			setCourse((Course) null);
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
		case CoursePagesPackage.PRECONDITION__PRECONDITION_STATUS:
			return preconditionStatus != PRECONDITION_STATUS_EDEFAULT;
		case CoursePagesPackage.PRECONDITION__COURSE:
			return course != null;
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
		result.append(" (preconditionStatus: ");
		result.append(preconditionStatus);
		result.append(')');
		return result.toString();
	}

} //PreconditionImpl
