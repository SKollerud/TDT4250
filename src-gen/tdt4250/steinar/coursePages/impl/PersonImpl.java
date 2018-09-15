/**
 */
package tdt4250.steinar.coursePages.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.steinar.coursePages.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.PersonImpl#getSurName <em>Sur Name</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.PersonImpl#getPhoneNummber <em>Phone Nummber</em>}</li>
 *   <li>{@link tdt4250.steinar.coursePages.impl.PersonImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurName() <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurName() <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurName()
	 * @generated
	 * @ordered
	 */
	protected String surName = SUR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNummber() <em>Phone Nummber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNummber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNummber() <em>Phone Nummber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNummber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNummber = PHONE_NUMMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePagesPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.PERSON__FIRST_NAME, oldFirstName,
					firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurName(String newSurName) {
		String oldSurName = surName;
		surName = newSurName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.PERSON__SUR_NAME, oldSurName,
					surName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNummber() {
		return phoneNummber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNummber(String newPhoneNummber) {
		String oldPhoneNummber = phoneNummber;
		phoneNummber = newPhoneNummber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.PERSON__PHONE_NUMMBER,
					oldPhoneNummber, phoneNummber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePagesPackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoursePagesPackage.PERSON__FIRST_NAME:
			return getFirstName();
		case CoursePagesPackage.PERSON__SUR_NAME:
			return getSurName();
		case CoursePagesPackage.PERSON__PHONE_NUMMBER:
			return getPhoneNummber();
		case CoursePagesPackage.PERSON__EMAIL:
			return getEmail();
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
		case CoursePagesPackage.PERSON__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case CoursePagesPackage.PERSON__SUR_NAME:
			setSurName((String) newValue);
			return;
		case CoursePagesPackage.PERSON__PHONE_NUMMBER:
			setPhoneNummber((String) newValue);
			return;
		case CoursePagesPackage.PERSON__EMAIL:
			setEmail((String) newValue);
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
		case CoursePagesPackage.PERSON__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case CoursePagesPackage.PERSON__SUR_NAME:
			setSurName(SUR_NAME_EDEFAULT);
			return;
		case CoursePagesPackage.PERSON__PHONE_NUMMBER:
			setPhoneNummber(PHONE_NUMMBER_EDEFAULT);
			return;
		case CoursePagesPackage.PERSON__EMAIL:
			setEmail(EMAIL_EDEFAULT);
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
		case CoursePagesPackage.PERSON__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
		case CoursePagesPackage.PERSON__SUR_NAME:
			return SUR_NAME_EDEFAULT == null ? surName != null : !SUR_NAME_EDEFAULT.equals(surName);
		case CoursePagesPackage.PERSON__PHONE_NUMMBER:
			return PHONE_NUMMBER_EDEFAULT == null ? phoneNummber != null : !PHONE_NUMMBER_EDEFAULT.equals(phoneNummber);
		case CoursePagesPackage.PERSON__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", surName: ");
		result.append(surName);
		result.append(", phoneNummber: ");
		result.append(phoneNummber);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
