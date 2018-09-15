/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Person#getSurName <em>Sur Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Person#getPhoneNummber <em>Phone Nummber</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.Person#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sur Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sur Name</em>' attribute.
	 * @see #setSurName(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPerson_SurName()
	 * @model
	 * @generated
	 */
	String getSurName();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Person#getSurName <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sur Name</em>' attribute.
	 * @see #getSurName()
	 * @generated
	 */
	void setSurName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Nummber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Nummber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Nummber</em>' attribute.
	 * @see #setPhoneNummber(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPerson_PhoneNummber()
	 * @model
	 * @generated
	 */
	String getPhoneNummber();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Person#getPhoneNummber <em>Phone Nummber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Nummber</em>' attribute.
	 * @see #getPhoneNummber()
	 * @generated
	 */
	void setPhoneNummber(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link tdt4250.steinar.coursePages.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Person
