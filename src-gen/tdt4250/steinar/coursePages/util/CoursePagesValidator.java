/**
 */
package tdt4250.steinar.coursePages.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.steinar.coursePages.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.steinar.coursePages.CoursePagesPackage
 * @generated
 */
public class CoursePagesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoursePagesValidator INSTANCE = new CoursePagesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.steinar.coursePages";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePagesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CoursePagesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CoursePagesPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case CoursePagesPackage.STUDENT:
			return validateStudent((Student) value, diagnostics, context);
		case CoursePagesPackage.EMPLOYEE:
			return validateEmployee((Employee) value, diagnostics, context);
		case CoursePagesPackage.DEPARTMENT:
			return validateDepartment((Department) value, diagnostics, context);
		case CoursePagesPackage.STUDY_PROGRAMS:
			return validateStudyPrograms((StudyPrograms) value, diagnostics, context);
		case CoursePagesPackage.EVALUATION_OBJECT:
			return validateEvaluationObject((EvaluationObject) value, diagnostics, context);
		case CoursePagesPackage.EVALUATIONS:
			return validateEvaluations((Evaluations) value, diagnostics, context);
		case CoursePagesPackage.COURSE_WORK_OBJECT:
			return validateCourseWorkObject((CourseWorkObject) value, diagnostics, context);
		case CoursePagesPackage.COURSE_WORK:
			return validateCourseWork((CourseWork) value, diagnostics, context);
		case CoursePagesPackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case CoursePagesPackage.COURSE_INSTANCE:
			return validateCourseInstance((CourseInstance) value, diagnostics, context);
		case CoursePagesPackage.COURSE_WORKER:
			return validateCourseWorker((CourseWorker) value, diagnostics, context);
		case CoursePagesPackage.PRECONDITION:
			return validatePrecondition((Precondition) value, diagnostics, context);
		case CoursePagesPackage.REDUCTION:
			return validateReduction((Reduction) value, diagnostics, context);
		case CoursePagesPackage.TERM_TYPE:
			return validateTermType((TermType) value, diagnostics, context);
		case CoursePagesPackage.COURSE_WORK_TYPE:
			return validateCourseWorkType((CourseWorkType) value, diagnostics, context);
		case CoursePagesPackage.EVALUATION_TYPE:
			return validateEvaluationType((EvaluationType) value, diagnostics, context);
		case CoursePagesPackage.PERSON_ROLE_TYPE:
			return validatepersonRoleType((personRoleType) value, diagnostics, context);
		case CoursePagesPackage.PRECONDISTION_TYPE:
			return validatePrecondistionType((PrecondistionType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPrograms(StudyPrograms studyPrograms, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPrograms, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationObject(EvaluationObject evaluationObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluations(Evaluations evaluations, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(evaluations, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(evaluations, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvaluations_SumUpCredit100(evaluations, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SumUpCredit100 constraint of '<em>Evaluations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluations_SumUpCredit100(Evaluations evaluations, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		int totalWeight = 0;
		for(EvaluationObject element : evaluations.getEvaluationobject())
		{
			totalWeight += element.getCredits();
		}
		
		if (totalWeight != 100){
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "SumUpCredit100", getObjectLabel(evaluations, context) },
								new Object[] { evaluations }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseWorkObject(CourseWorkObject courseWorkObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseWorkObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseWork(CourseWork courseWork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseWork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance(CourseInstance courseInstance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseWorker(CourseWorker courseWorker, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseWorker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecondition(Precondition precondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(precondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduction(Reduction reduction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reduction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermType(TermType termType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseWorkType(CourseWorkType courseWorkType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationType(EvaluationType evaluationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatepersonRoleType(personRoleType personRoleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecondistionType(PrecondistionType precondistionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CoursePagesValidator
