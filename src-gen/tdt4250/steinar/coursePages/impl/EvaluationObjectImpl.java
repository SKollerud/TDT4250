/**
 */
package tdt4250.steinar.coursePages.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.EvaluationObject;
import tdt4250.steinar.coursePages.EvaluationType;
import tdt4250.steinar.coursePages.TermType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.EvaluationObjectImpl#getEvaluationsForm <em>Evaluations Form</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.EvaluationObjectImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.EvaluationObjectImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.EvaluationObjectImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationObjectImpl extends MinimalEObjectImpl.Container implements EvaluationObject {
	/**
	 * The default value of the '{@link #getEvaluationsForm() <em>Evaluations Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationsForm()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationType EVALUATIONS_FORM_EDEFAULT = EvaluationType.WRITTEN_EXAM;

	/**
	 * The cached value of the '{@link #getEvaluationsForm() <em>Evaluations Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationsForm()
	 * @generated
	 * @ordered
	 */
	protected EvaluationType evaluationsForm = EVALUATIONS_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final TermType TERM_EDEFAULT = TermType.SPRING;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected TermType term = TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected int credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.EVALUATION_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationType getEvaluationsForm() {
		return evaluationsForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationsForm(EvaluationType newEvaluationsForm) {
		EvaluationType oldEvaluationsForm = evaluationsForm;
		evaluationsForm = newEvaluationsForm == null ? EVALUATIONS_FORM_EDEFAULT : newEvaluationsForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.EVALUATION_OBJECT__EVALUATIONS_FORM, oldEvaluationsForm, evaluationsForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(TermType newTerm) {
		TermType oldTerm = term;
		term = newTerm == null ? TERM_EDEFAULT : newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.EVALUATION_OBJECT__TERM, oldTerm,
					term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(int newCredits) {
		int oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.EVALUATION_OBJECT__CREDITS,
					oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.EVALUATION_OBJECT__DATE, oldDate,
					date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoursePagesPackage.EVALUATION_OBJECT__EVALUATIONS_FORM:
			return getEvaluationsForm();
		case CoursePagesPackage.EVALUATION_OBJECT__TERM:
			return getTerm();
		case CoursePagesPackage.EVALUATION_OBJECT__CREDITS:
			return getCredits();
		case CoursePagesPackage.EVALUATION_OBJECT__DATE:
			return getDate();
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
		case CoursePagesPackage.EVALUATION_OBJECT__EVALUATIONS_FORM:
			setEvaluationsForm((EvaluationType) newValue);
			return;
		case CoursePagesPackage.EVALUATION_OBJECT__TERM:
			setTerm((TermType) newValue);
			return;
		case CoursePagesPackage.EVALUATION_OBJECT__CREDITS:
			setCredits((Integer) newValue);
			return;
		case CoursePagesPackage.EVALUATION_OBJECT__DATE:
			setDate((Date) newValue);
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
		case CoursePagesPackage.EVALUATION_OBJECT__EVALUATIONS_FORM:
			setEvaluationsForm(EVALUATIONS_FORM_EDEFAULT);
			return;
		case CoursePagesPackage.EVALUATION_OBJECT__TERM:
			setTerm(TERM_EDEFAULT);
			return;
		case CoursePagesPackage.EVALUATION_OBJECT__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case CoursePagesPackage.EVALUATION_OBJECT__DATE:
			setDate(DATE_EDEFAULT);
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
		case CoursePagesPackage.EVALUATION_OBJECT__EVALUATIONS_FORM:
			return evaluationsForm != EVALUATIONS_FORM_EDEFAULT;
		case CoursePagesPackage.EVALUATION_OBJECT__TERM:
			return term != TERM_EDEFAULT;
		case CoursePagesPackage.EVALUATION_OBJECT__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case CoursePagesPackage.EVALUATION_OBJECT__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(" (evaluationsForm: ");
		result.append(evaluationsForm);
		result.append(", term: ");
		result.append(term);
		result.append(", credits: ");
		result.append(credits);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //EvaluationObjectImpl
