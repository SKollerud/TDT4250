/**
 */
package tdt4250.steinar.coursePages.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.CourseWork;
import tdt4250.steinar.coursePages.CourseWorkObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkImpl#getCourseworkobject <em>Courseworkobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseWorkImpl extends MinimalEObjectImpl.Container implements CourseWork {
	/**
	 * The cached value of the '{@link #getCourseworkobject() <em>Courseworkobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseworkobject()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseWorkObject> courseworkobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseWorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.COURSE_WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseWorkObject> getCourseworkobject() {
		if (courseworkobject == null) {
			courseworkobject = new EObjectContainmentEList<CourseWorkObject>(CourseWorkObject.class, this,
					CoursePagesPackage.COURSE_WORK__COURSEWORKOBJECT);
		}
		return courseworkobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_WORK__COURSEWORKOBJECT:
			return ((InternalEList<?>) getCourseworkobject()).basicRemove(otherEnd, msgs);
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
		case CoursePagesPackage.COURSE_WORK__COURSEWORKOBJECT:
			return getCourseworkobject();
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
		case CoursePagesPackage.COURSE_WORK__COURSEWORKOBJECT:
			getCourseworkobject().clear();
			getCourseworkobject().addAll((Collection<? extends CourseWorkObject>) newValue);
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
		case CoursePagesPackage.COURSE_WORK__COURSEWORKOBJECT:
			getCourseworkobject().clear();
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
		case CoursePagesPackage.COURSE_WORK__COURSEWORKOBJECT:
			return courseworkobject != null && !courseworkobject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CourseWorkImpl
