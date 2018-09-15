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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.steinar.coursePages.Course;
import tdt4250.steinar.coursePages.CourseInstance;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.CourseWorker;
import tdt4250.steinar.coursePages.Precondition;
import tdt4250.steinar.coursePages.Reduction;
import tdt4250.steinar.coursePages.StudyPrograms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getCourseCredits <em>Course Credits</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getCourseContent <em>Course Content</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getCourseinstance <em>Courseinstance</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getStudyprograms <em>Studyprograms</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getCourseworker <em>Courseworker</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseImpl#getReduction <em>Reduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected String courseName = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCredits() <em>Course Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float COURSE_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCourseCredits() <em>Course Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredits()
	 * @generated
	 * @ordered
	 */
	protected float courseCredits = COURSE_CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseContent() <em>Course Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseContent()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseContent() <em>Course Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseContent()
	 * @generated
	 * @ordered
	 */
	protected String courseContent = COURSE_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseinstance() <em>Courseinstance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> courseinstance;

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
	 * The cached value of the '{@link #getCourseworker() <em>Courseworker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseworker()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseWorker> courseworker;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Precondition> precondition;

	/**
	 * The cached value of the '{@link #getReduction() <em>Reduction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduction()
	 * @generated
	 * @ordered
	 */
	protected EList<Reduction> reduction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE__COURSE_CODE, oldCourseCode,
					courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseName(String newCourseName) {
		String oldCourseName = courseName;
		courseName = newCourseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE__COURSE_NAME, oldCourseName,
					courseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCourseCredits() {
		return courseCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCredits(float newCourseCredits) {
		float oldCourseCredits = courseCredits;
		courseCredits = newCourseCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE__COURSE_CREDITS,
					oldCourseCredits, courseCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseContent() {
		return courseContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseContent(String newCourseContent) {
		String oldCourseContent = courseContent;
		courseContent = newCourseContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE__COURSE_CONTENT,
					oldCourseContent, courseContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getCourseinstance() {
		if (courseinstance == null) {
			courseinstance = new EObjectContainmentEList<CourseInstance>(CourseInstance.class, this,
					CoursePagesPackage.COURSE__COURSEINSTANCE);
		}
		return courseinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyPrograms> getStudyprograms() {
		if (studyprograms == null) {
			studyprograms = new EObjectWithInverseResolvingEList.ManyInverse<StudyPrograms>(StudyPrograms.class, this,
					CoursePagesPackage.COURSE__STUDYPROGRAMS, CoursePagesPackage.STUDY_PROGRAMS__COURSE);
		}
		return studyprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseWorker> getCourseworker() {
		if (courseworker == null) {
			courseworker = new EObjectContainmentEList<CourseWorker>(CourseWorker.class, this,
					CoursePagesPackage.COURSE__COURSEWORKER);
		}
		return courseworker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this,
					CoursePagesPackage.COURSE__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reduction> getReduction() {
		if (reduction == null) {
			reduction = new EObjectContainmentEList<Reduction>(Reduction.class, this,
					CoursePagesPackage.COURSE__REDUCTION);
		}
		return reduction;
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
		case CoursePagesPackage.COURSE__STUDYPROGRAMS:
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
		case CoursePagesPackage.COURSE__COURSEINSTANCE:
			return ((InternalEList<?>) getCourseinstance()).basicRemove(otherEnd, msgs);
		case CoursePagesPackage.COURSE__STUDYPROGRAMS:
			return ((InternalEList<?>) getStudyprograms()).basicRemove(otherEnd, msgs);
		case CoursePagesPackage.COURSE__COURSEWORKER:
			return ((InternalEList<?>) getCourseworker()).basicRemove(otherEnd, msgs);
		case CoursePagesPackage.COURSE__PRECONDITION:
			return ((InternalEList<?>) getPrecondition()).basicRemove(otherEnd, msgs);
		case CoursePagesPackage.COURSE__REDUCTION:
			return ((InternalEList<?>) getReduction()).basicRemove(otherEnd, msgs);
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
		case CoursePagesPackage.COURSE__COURSE_CODE:
			return getCourseCode();
		case CoursePagesPackage.COURSE__COURSE_NAME:
			return getCourseName();
		case CoursePagesPackage.COURSE__COURSE_CREDITS:
			return getCourseCredits();
		case CoursePagesPackage.COURSE__COURSE_CONTENT:
			return getCourseContent();
		case CoursePagesPackage.COURSE__COURSEINSTANCE:
			return getCourseinstance();
		case CoursePagesPackage.COURSE__STUDYPROGRAMS:
			return getStudyprograms();
		case CoursePagesPackage.COURSE__COURSEWORKER:
			return getCourseworker();
		case CoursePagesPackage.COURSE__PRECONDITION:
			return getPrecondition();
		case CoursePagesPackage.COURSE__REDUCTION:
			return getReduction();
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
		case CoursePagesPackage.COURSE__COURSE_CODE:
			setCourseCode((String) newValue);
			return;
		case CoursePagesPackage.COURSE__COURSE_NAME:
			setCourseName((String) newValue);
			return;
		case CoursePagesPackage.COURSE__COURSE_CREDITS:
			setCourseCredits((Float) newValue);
			return;
		case CoursePagesPackage.COURSE__COURSE_CONTENT:
			setCourseContent((String) newValue);
			return;
		case CoursePagesPackage.COURSE__COURSEINSTANCE:
			getCourseinstance().clear();
			getCourseinstance().addAll((Collection<? extends CourseInstance>) newValue);
			return;
		case CoursePagesPackage.COURSE__STUDYPROGRAMS:
			getStudyprograms().clear();
			getStudyprograms().addAll((Collection<? extends StudyPrograms>) newValue);
			return;
		case CoursePagesPackage.COURSE__COURSEWORKER:
			getCourseworker().clear();
			getCourseworker().addAll((Collection<? extends CourseWorker>) newValue);
			return;
		case CoursePagesPackage.COURSE__PRECONDITION:
			getPrecondition().clear();
			getPrecondition().addAll((Collection<? extends Precondition>) newValue);
			return;
		case CoursePagesPackage.COURSE__REDUCTION:
			getReduction().clear();
			getReduction().addAll((Collection<? extends Reduction>) newValue);
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
		case CoursePagesPackage.COURSE__COURSE_CODE:
			setCourseCode(COURSE_CODE_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE__COURSE_NAME:
			setCourseName(COURSE_NAME_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE__COURSE_CREDITS:
			setCourseCredits(COURSE_CREDITS_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE__COURSE_CONTENT:
			setCourseContent(COURSE_CONTENT_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE__COURSEINSTANCE:
			getCourseinstance().clear();
			return;
		case CoursePagesPackage.COURSE__STUDYPROGRAMS:
			getStudyprograms().clear();
			return;
		case CoursePagesPackage.COURSE__COURSEWORKER:
			getCourseworker().clear();
			return;
		case CoursePagesPackage.COURSE__PRECONDITION:
			getPrecondition().clear();
			return;
		case CoursePagesPackage.COURSE__REDUCTION:
			getReduction().clear();
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
		case CoursePagesPackage.COURSE__COURSE_CODE:
			return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
		case CoursePagesPackage.COURSE__COURSE_NAME:
			return COURSE_NAME_EDEFAULT == null ? courseName != null : !COURSE_NAME_EDEFAULT.equals(courseName);
		case CoursePagesPackage.COURSE__COURSE_CREDITS:
			return courseCredits != COURSE_CREDITS_EDEFAULT;
		case CoursePagesPackage.COURSE__COURSE_CONTENT:
			return COURSE_CONTENT_EDEFAULT == null ? courseContent != null
					: !COURSE_CONTENT_EDEFAULT.equals(courseContent);
		case CoursePagesPackage.COURSE__COURSEINSTANCE:
			return courseinstance != null && !courseinstance.isEmpty();
		case CoursePagesPackage.COURSE__STUDYPROGRAMS:
			return studyprograms != null && !studyprograms.isEmpty();
		case CoursePagesPackage.COURSE__COURSEWORKER:
			return courseworker != null && !courseworker.isEmpty();
		case CoursePagesPackage.COURSE__PRECONDITION:
			return precondition != null && !precondition.isEmpty();
		case CoursePagesPackage.COURSE__REDUCTION:
			return reduction != null && !reduction.isEmpty();
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
		result.append(" (courseCode: ");
		result.append(courseCode);
		result.append(", courseName: ");
		result.append(courseName);
		result.append(", courseCredits: ");
		result.append(courseCredits);
		result.append(", courseContent: ");
		result.append(courseContent);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
