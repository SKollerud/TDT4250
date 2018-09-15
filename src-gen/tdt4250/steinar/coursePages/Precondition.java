/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Precondition#getPreconditionStatus <em>Precondition Status</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Precondition#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Precondition Status</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.steinar.coursePages.PrecondistionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition Status</em>' attribute.
	 * @see tdt4250.steinar.coursePages.PrecondistionType
	 * @see #setPreconditionStatus(PrecondistionType)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPrecondition_PreconditionStatus()
	 * @model
	 * @generated
	 */
	PrecondistionType getPreconditionStatus();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Precondition#getPreconditionStatus <em>Precondition Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition Status</em>' attribute.
	 * @see tdt4250.steinar.coursePages.PrecondistionType
	 * @see #getPreconditionStatus()
	 * @generated
	 */
	void setPreconditionStatus(PrecondistionType value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPrecondition_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Precondition#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // Precondition
