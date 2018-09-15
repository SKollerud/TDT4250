/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Reduction#getCreditReduction <em>Credit Reduction</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Reduction#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getReduction()
 * @model
 * @generated
 */
public interface Reduction extends EObject {
	/**
	 * Returns the value of the '<em><b>Credit Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Reduction</em>' attribute.
	 * @see #setCreditReduction(float)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getReduction_CreditReduction()
	 * @model
	 * @generated
	 */
	float getCreditReduction();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Reduction#getCreditReduction <em>Credit Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Reduction</em>' attribute.
	 * @see #getCreditReduction()
	 * @generated
	 */
	void setCreditReduction(float value);

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
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getReduction_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Reduction#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // Reduction
