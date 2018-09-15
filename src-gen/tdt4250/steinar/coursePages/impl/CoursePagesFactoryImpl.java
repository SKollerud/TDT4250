/**
 */
package tdt4250.steinar.coursePages.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.steinar.coursePages.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoursePagesFactoryImpl extends EFactoryImpl implements CoursePagesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoursePagesFactory init() {
		try {
			CoursePagesFactory theCoursePagesFactory = (CoursePagesFactory) EPackage.Registry.INSTANCE
					.getEFactory(CoursePagesPackage.eNS_URI);
			if (theCoursePagesFactory != null) {
				return theCoursePagesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoursePagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePagesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CoursePagesPackage.PERSON:
			return createPerson();
		case CoursePagesPackage.STUDENT:
			return createStudent();
		case CoursePagesPackage.EMPLOYEE:
			return createEmployee();
		case CoursePagesPackage.DEPARTMENT:
			return createDepartment();
		case CoursePagesPackage.STUDY_PROGRAMS:
			return createStudyPrograms();
		case CoursePagesPackage.EVALUATION_OBJECT:
			return createEvaluationObject();
		case CoursePagesPackage.EVALUATIONS:
			return createEvaluations();
		case CoursePagesPackage.COURSE_WORK_OBJECT:
			return createCourseWorkObject();
		case CoursePagesPackage.COURSE_WORK:
			return createCourseWork();
		case CoursePagesPackage.COURSE:
			return createCourse();
		case CoursePagesPackage.COURSE_INSTANCE:
			return createCourseInstance();
		case CoursePagesPackage.COURSE_WORKER:
			return createCourseWorker();
		case CoursePagesPackage.PRECONDITION:
			return createPrecondition();
		case CoursePagesPackage.REDUCTION:
			return createReduction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CoursePagesPackage.TERM_TYPE:
			return createTermTypeFromString(eDataType, initialValue);
		case CoursePagesPackage.COURSE_WORK_TYPE:
			return createCourseWorkTypeFromString(eDataType, initialValue);
		case CoursePagesPackage.EVALUATION_TYPE:
			return createEvaluationTypeFromString(eDataType, initialValue);
		case CoursePagesPackage.PERSON_ROLE_TYPE:
			return createpersonRoleTypeFromString(eDataType, initialValue);
		case CoursePagesPackage.PRECONDISTION_TYPE:
			return createPrecondistionTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CoursePagesPackage.TERM_TYPE:
			return convertTermTypeToString(eDataType, instanceValue);
		case CoursePagesPackage.COURSE_WORK_TYPE:
			return convertCourseWorkTypeToString(eDataType, instanceValue);
		case CoursePagesPackage.EVALUATION_TYPE:
			return convertEvaluationTypeToString(eDataType, instanceValue);
		case CoursePagesPackage.PERSON_ROLE_TYPE:
			return convertpersonRoleTypeToString(eDataType, instanceValue);
		case CoursePagesPackage.PRECONDISTION_TYPE:
			return convertPrecondistionTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPrograms createStudyPrograms() {
		StudyProgramsImpl studyPrograms = new StudyProgramsImpl();
		return studyPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationObject createEvaluationObject() {
		EvaluationObjectImpl evaluationObject = new EvaluationObjectImpl();
		return evaluationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluations createEvaluations() {
		EvaluationsImpl evaluations = new EvaluationsImpl();
		return evaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWorkObject createCourseWorkObject() {
		CourseWorkObjectImpl courseWorkObject = new CourseWorkObjectImpl();
		return courseWorkObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWork createCourseWork() {
		CourseWorkImpl courseWork = new CourseWorkImpl();
		return courseWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance createCourseInstance() {
		CourseInstanceImpl courseInstance = new CourseInstanceImpl();
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWorker createCourseWorker() {
		CourseWorkerImpl courseWorker = new CourseWorkerImpl();
		return courseWorker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reduction createReduction() {
		ReductionImpl reduction = new ReductionImpl();
		return reduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType createTermTypeFromString(EDataType eDataType, String initialValue) {
		TermType result = TermType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWorkType createCourseWorkTypeFromString(EDataType eDataType, String initialValue) {
		CourseWorkType result = CourseWorkType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseWorkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationType createEvaluationTypeFromString(EDataType eDataType, String initialValue) {
		EvaluationType result = EvaluationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public personRoleType createpersonRoleTypeFromString(EDataType eDataType, String initialValue) {
		personRoleType result = personRoleType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpersonRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecondistionType createPrecondistionTypeFromString(EDataType eDataType, String initialValue) {
		PrecondistionType result = PrecondistionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrecondistionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePagesPackage getCoursePagesPackage() {
		return (CoursePagesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoursePagesPackage getPackage() {
		return CoursePagesPackage.eINSTANCE;
	}

} //CoursePagesFactoryImpl
