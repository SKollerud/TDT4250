/**
 */
package tdt4250.steinar.coursePages.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.CourseWorkObject;
import tdt4250.steinar.coursePages.CourseWorkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Work Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl#getCourseWorkType <em>Course Work Type</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl#getDay <em>Day</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl#getStart <em>Start</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseWorkObjectImpl extends MinimalEObjectImpl.Container implements CourseWorkObject {
	/**
	 * The default value of the '{@link #getCourseWorkType() <em>Course Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseWorkType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseWorkType COURSE_WORK_TYPE_EDEFAULT = CourseWorkType.LECTURE;

	/**
	 * The cached value of the '{@link #getCourseWorkType() <em>Course Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseWorkType()
	 * @generated
	 * @ordered
	 */
	protected CourseWorkType courseWorkType = COURSE_WORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected String room = ROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected String day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseWorkObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.COURSE_WORK_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWorkType getCourseWorkType() {
		return courseWorkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseWorkType(CourseWorkType newCourseWorkType) {
		CourseWorkType oldCourseWorkType = courseWorkType;
		courseWorkType = newCourseWorkType == null ? COURSE_WORK_TYPE_EDEFAULT : newCourseWorkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoursePagesPackage.COURSE_WORK_OBJECT__COURSE_WORK_TYPE, oldCourseWorkType, courseWorkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(String newRoom) {
		String oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_WORK_OBJECT__ROOM, oldRoom,
					room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(String newDay) {
		String oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_WORK_OBJECT__DAY, oldDay,
					day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_WORK_OBJECT__START,
					oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.COURSE_WORK_OBJECT__END, oldEnd,
					end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoursePagesPackage.COURSE_WORK_OBJECT__COURSE_WORK_TYPE:
			return getCourseWorkType();
		case CoursePagesPackage.COURSE_WORK_OBJECT__ROOM:
			return getRoom();
		case CoursePagesPackage.COURSE_WORK_OBJECT__DAY:
			return getDay();
		case CoursePagesPackage.COURSE_WORK_OBJECT__START:
			return getStart();
		case CoursePagesPackage.COURSE_WORK_OBJECT__END:
			return getEnd();
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
		case CoursePagesPackage.COURSE_WORK_OBJECT__COURSE_WORK_TYPE:
			setCourseWorkType((CourseWorkType) newValue);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__ROOM:
			setRoom((String) newValue);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__DAY:
			setDay((String) newValue);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__START:
			setStart((Date) newValue);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__END:
			setEnd((Date) newValue);
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
		case CoursePagesPackage.COURSE_WORK_OBJECT__COURSE_WORK_TYPE:
			setCourseWorkType(COURSE_WORK_TYPE_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__ROOM:
			setRoom(ROOM_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__START:
			setStart(START_EDEFAULT);
			return;
		case CoursePagesPackage.COURSE_WORK_OBJECT__END:
			setEnd(END_EDEFAULT);
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
		case CoursePagesPackage.COURSE_WORK_OBJECT__COURSE_WORK_TYPE:
			return courseWorkType != COURSE_WORK_TYPE_EDEFAULT;
		case CoursePagesPackage.COURSE_WORK_OBJECT__ROOM:
			return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
		case CoursePagesPackage.COURSE_WORK_OBJECT__DAY:
			return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
		case CoursePagesPackage.COURSE_WORK_OBJECT__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case CoursePagesPackage.COURSE_WORK_OBJECT__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
		result.append(" (courseWorkType: ");
		result.append(courseWorkType);
		result.append(", room: ");
		result.append(room);
		result.append(", day: ");
		result.append(day);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //CourseWorkObjectImpl
