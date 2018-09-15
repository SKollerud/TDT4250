/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.CourseWork#getCourseworkobject <em>Courseworkobject</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWork()
 * @model
 * @generated
 */
public interface CourseWork extends EObject {
	/**
	 * Returns the value of the '<em><b>Courseworkobject</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.steinar.coursePages.CourseWorkObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseworkobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseworkobject</em>' containment reference list.
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getCourseWork_Courseworkobject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CourseWorkObject> getCourseworkobject();

} // CourseWork
