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
import tdt4250.steinar.coursePages.EvaluationObject;
import tdt4250.steinar.coursePages.Evaluations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.EvaluationsImpl#getEvaluationobject <em>Evaluationobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationsImpl extends MinimalEObjectImpl.Container implements Evaluations {
	/**
	 * The cached value of the '{@link #getEvaluationobject() <em>Evaluationobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationobject()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationObject> evaluationobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.EVALUATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationObject> getEvaluationobject() {
		if (evaluationobject == null) {
			evaluationobject = new EObjectContainmentEList<EvaluationObject>(EvaluationObject.class, this,
					CoursePagesPackage.EVALUATIONS__EVALUATIONOBJECT);
		}
		return evaluationobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoursePagesPackage.EVALUATIONS__EVALUATIONOBJECT:
			return ((InternalEList<?>) getEvaluationobject()).basicRemove(otherEnd, msgs);
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
		case CoursePagesPackage.EVALUATIONS__EVALUATIONOBJECT:
			return getEvaluationobject();
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
		case CoursePagesPackage.EVALUATIONS__EVALUATIONOBJECT:
			getEvaluationobject().clear();
			getEvaluationobject().addAll((Collection<? extends EvaluationObject>) newValue);
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
		case CoursePagesPackage.EVALUATIONS__EVALUATIONOBJECT:
			getEvaluationobject().clear();
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
		case CoursePagesPackage.EVALUATIONS__EVALUATIONOBJECT:
			return evaluationobject != null && !evaluationobject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluationsImpl
