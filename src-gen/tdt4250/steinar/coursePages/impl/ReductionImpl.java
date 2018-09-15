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
import tdt4250.steinar.coursePages.Reduction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.ReductionImpl#getCreditReduction <em>Credit Reduction</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.ReductionImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionImpl extends MinimalEObjectImpl.Container implements Reduction {
	/**
	 * The default value of the '{@link #getCreditReduction() <em>Credit Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditReduction()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDIT_REDUCTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCreditReduction() <em>Credit Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditReduction()
	 * @generated
	 * @ordered
	 */
	protected float creditReduction = CREDIT_REDUCTION_EDEFAULT;

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
	protected ReductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.REDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCreditReduction() {
		return creditReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditReduction(float newCreditReduction) {
		float oldCreditReduction = creditReduction;
		creditReduction = newCreditReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.REDUCTION__CREDIT_REDUCTION,
					oldCreditReduction, creditReduction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePagesPackage.REDUCTION__COURSE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.REDUCTION__COURSE, oldCourse,
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
		case CoursePagesPackage.REDUCTION__CREDIT_REDUCTION:
			return getCreditReduction();
		case CoursePagesPackage.REDUCTION__COURSE:
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
		case CoursePagesPackage.REDUCTION__CREDIT_REDUCTION:
			setCreditReduction((Float) newValue);
			return;
		case CoursePagesPackage.REDUCTION__COURSE:
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
		case CoursePagesPackage.REDUCTION__CREDIT_REDUCTION:
			setCreditReduction(CREDIT_REDUCTION_EDEFAULT);
			return;
		case CoursePagesPackage.REDUCTION__COURSE:
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
		case CoursePagesPackage.REDUCTION__CREDIT_REDUCTION:
			return creditReduction != CREDIT_REDUCTION_EDEFAULT;
		case CoursePagesPackage.REDUCTION__COURSE:
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
		result.append(" (creditReduction: ");
		result.append(creditReduction);
		result.append(')');
		return result.toString();
	}

} //ReductionImpl
