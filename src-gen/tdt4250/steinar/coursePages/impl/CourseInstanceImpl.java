/**
 */
package tdt4250.steinar.coursePages.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.steinar.coursePages.CourseInstance;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.CourseWork;
import tdt4250.steinar.coursePages.Evaluations;
import tdt4250.steinar.coursePages.TermType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseInstanceImpl#getCoursework <em>Coursework</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseInstanceImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseInstanceImpl#getCourseYear <em>Course Year</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseInstanceImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstanceImpl extends MinimalEObjectImpl.Container implements CourseInstance {
	/**
	 * The cached value of the '{@link #getCoursework() <em>Coursework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursework()
	 * @generated
	 * @ordered
	 */
	protected CourseWork coursework;

	/**
	 * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluations()
	 * @generated
	 * @ordered
	 */
	protected Evaluations evaluations;

	/**
	 * The default value of the '{@link #getCourseYear() <em>Course Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseYear()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseYear() <em>Course Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseYear()
	 * @generated
	 * @ordered
	 */
	protected String courseYear = COURSE_YEAR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.COURSE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWork getCoursework() {
		return coursework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoursework(CourseWork newCoursework, NotificationChain msgs) {
		CourseWork oldCoursework = coursework;
		coursework = newCoursework;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.COURSE_INSTANCE__COURSEWORK, oldCoursework, newCoursework);
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
	public void setCoursework(CourseWork newCoursework) {
		if (newCoursework != coursework) {
			NotificationChain msgs = null;
			if (coursework != null)
				msgs = ((InternalEObject) coursework).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CoursePagesPackage.COURSE_INSTANCE__COURSEWORK, null, msgs);
			if (newCoursework != null)
				msgs = ((InternalEObject) newCoursework).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CoursePagesPackage.COURSE_INSTANCE__COURSEWORK, null, msgs);
			msgs = basicSetCoursework(newCoursework, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_INSTANCE__COURSEWORK,
					newCoursework, newCoursework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluations getEvaluations() {
		return evaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluations(Evaluations newEvaluations, NotificationChain msgs) {
		Evaluations oldEvaluations = evaluations;
		evaluations = newEvaluations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS, oldEvaluations, newEvaluations);
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
	public void setEvaluations(Evaluations newEvaluations) {
		if (newEvaluations != evaluations) {
			NotificationChain msgs = null;
			if (evaluations != null)
				msgs = ((InternalEObject) evaluations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS, null, msgs);
			if (newEvaluations != null)
				msgs = ((InternalEObject) newEvaluations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS, null, msgs);
			msgs = basicSetEvaluations(newEvaluations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS,
					newEvaluations, newEvaluations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseYear() {
		return courseYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseYear(String newCourseYear) {
		String oldCourseYear = courseYear;
		courseYear = newCourseYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_INSTANCE__COURSE_YEAR,
					oldCourseYear, courseYear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_INSTANCE__TERM, oldTerm,
					term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_INSTANCE__COURSEWORK:
			return basicSetCoursework(null, msgs);
		case CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS:
			return basicSetEvaluations(null, msgs);
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
		case CoursePagesPackage.COURSE_INSTANCE__COURSEWORK:
			return getCoursework();
		case CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS:
			return getEvaluations();
		case CoursePagesPackage.COURSE_INSTANCE__COURSE_YEAR:
			return getCourseYear();
		case CoursePagesPackage.COURSE_INSTANCE__TERM:
			return getTerm();
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
		case CoursePagesPackage.COURSE_INSTANCE__COURSEWORK:
			setCoursework((CourseWork) newValue);
			return;
		case CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS:
			setEvaluations((Evaluations) newValue);
			return;
		case CoursePagesPackage.COURSE_INSTANCE__COURSE_YEAR:
			setCourseYear((String) newValue);
			return;
		case CoursePagesPackage.COURSE_INSTANCE__TERM:
			setTerm((TermType) newValue);
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
		case CoursePagesPackage.COURSE_INSTANCE__COURSEWORK:
			setCoursework((CourseWork) null);
			return;
		case CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS:
			setEvaluations((Evaluations) null);
			return;
		case CoursePagesPackage.COURSE_INSTANCE__COURSE_YEAR:
			setCourseYear(COURSE_YEAR_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE_INSTANCE__TERM:
			setTerm(TERM_EDEFAULT);
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
		case CoursePagesPackage.COURSE_INSTANCE__COURSEWORK:
			return coursework != null;
		case CoursePagesPackage.COURSE_INSTANCE__EVALUATIONS:
			return evaluations != null;
		case CoursePagesPackage.COURSE_INSTANCE__COURSE_YEAR:
			return COURSE_YEAR_EDEFAULT == null ? courseYear != null : !COURSE_YEAR_EDEFAULT.equals(courseYear);
		case CoursePagesPackage.COURSE_INSTANCE__TERM:
			return term != TERM_EDEFAULT;
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
		result.append(" (courseYear: ");
		result.append(courseYear);
		result.append(", term: ");
		result.append(term);
		result.append(')');
		return result.toString();
	}

} //CourseInstanceImpl
