/**
 */
package tdt4250.steinar.coursePages;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Work Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorkObject#getCourseWorkType <em>Course Work Type</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorkObject#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorkObject#getDay <em>Day</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorkObject#getStart <em>Start</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWorkObject#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorkObject()
 * @model
 * @generated
 */
public interface CourseWorkObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Work Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.steinar.coursePages.CourseWorkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Work Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Work Type</em>' attribute.
	 * @see tdt4250.steinar.coursePages.CourseWorkType
	 * @see #setCourseWorkType(CourseWorkType)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorkObject_CourseWorkType()
	 * @model
	 * @generated
	 */
	CourseWorkType getCourseWorkType();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorkObject#getCourseWorkType <em>Course Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Work Type</em>' attribute.
	 * @see tdt4250.steinar.coursePages.CourseWorkType
	 * @see #getCourseWorkType()
	 * @generated
	 */
	void setCourseWorkType(CourseWorkType value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorkObject_Room()
	 * @model
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorkObject#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorkObject_Day()
	 * @model
	 * @generated
	 */
	String getDay();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorkObject#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorkObject_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorkObject#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWorkObject_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.CourseWorkObject#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

} // CourseWorkObject
