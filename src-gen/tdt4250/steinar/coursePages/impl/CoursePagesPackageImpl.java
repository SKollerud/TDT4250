/**
 */
package tdt4250.steinar.coursePages.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdt4250.steinar.coursePages.Course;
import tdt4250.steinar.coursePages.CourseInstance;
import tdt4250.steinar.coursePages.CoursePagesFactory;
import tdt4250.steinar.coursePages.CoursePagesPackage;
import tdt4250.steinar.coursePages.CourseWork;
import tdt4250.steinar.coursePages.CourseWorkObject;
import tdt4250.steinar.coursePages.CourseWorkType;
import tdt4250.steinar.coursePages.CourseWorker;
import tdt4250.steinar.coursePages.Department;
import tdt4250.steinar.coursePages.Employee;
import tdt4250.steinar.coursePages.EvaluationObject;
import tdt4250.steinar.coursePages.EvaluationType;
import tdt4250.steinar.coursePages.Evaluations;
import tdt4250.steinar.coursePages.Person;
import tdt4250.steinar.coursePages.PrecondistionType;
import tdt4250.steinar.coursePages.Precondition;
import tdt4250.steinar.coursePages.Reduction;
import tdt4250.steinar.coursePages.Student;
import tdt4250.steinar.coursePages.StudyPrograms;
import tdt4250.steinar.coursePages.TermType;
import tdt4250.steinar.coursePages.personRoleType;
import tdt4250.steinar.coursePages.util.CoursePagesValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoursePagesPackageImpl extends EPackageImpl implements CoursePagesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyProgramsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseWorkObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseWorkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum termTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseWorkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum precondistionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdt4250.steinar.coursePages.CoursePagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoursePagesPackageImpl() {
		super(eNS_URI, CoursePagesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CoursePagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoursePagesPackage init() {
		if (isInited)
			return (CoursePagesPackage) EPackage.Registry.INSTANCE.getEPackage(CoursePagesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCoursePagesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CoursePagesPackageImpl theCoursePagesPackage = registeredCoursePagesPackage instanceof CoursePagesPackageImpl
				? (CoursePagesPackageImpl) registeredCoursePagesPackage
				: new CoursePagesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCoursePagesPackage.createPackageContents();

		// Initialize created meta-data
		theCoursePagesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCoursePagesPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CoursePagesValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCoursePagesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoursePagesPackage.eNS_URI, theCoursePagesPackage);
		return theCoursePagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_SurName() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PhoneNummber() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Email() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_StudentID() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Studyprograms() {
		return (EReference) studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Course() {
		return (EReference) studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Position() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_Department() {
		return (EReference) employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_DepartmentName() {
		return (EAttribute) departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_PhoneNummber() {
		return (EAttribute) departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_Email() {
		return (EAttribute) departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Employee() {
		return (EReference) departmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Studyprograms() {
		return (EReference) departmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Course() {
		return (EReference) departmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyPrograms() {
		return studyProgramsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyPrograms_StudyProgramCode() {
		return (EAttribute) studyProgramsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyPrograms_StudyProgramName() {
		return (EAttribute) studyProgramsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyPrograms_BelongsToDepartment() {
		return (EReference) studyProgramsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyPrograms_Student() {
		return (EReference) studyProgramsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyPrograms_Course() {
		return (EReference) studyProgramsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationObject() {
		return evaluationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationObject_EvaluationsForm() {
		return (EAttribute) evaluationObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationObject_Term() {
		return (EAttribute) evaluationObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationObject_Credits() {
		return (EAttribute) evaluationObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationObject_Date() {
		return (EAttribute) evaluationObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluations() {
		return evaluationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluations_Evaluationobject() {
		return (EReference) evaluationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseWorkObject() {
		return courseWorkObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWorkObject_CourseWorkType() {
		return (EAttribute) courseWorkObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWorkObject_Room() {
		return (EAttribute) courseWorkObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWorkObject_Day() {
		return (EAttribute) courseWorkObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWorkObject_Start() {
		return (EAttribute) courseWorkObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWorkObject_End() {
		return (EAttribute) courseWorkObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseWork() {
		return courseWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseWork_Courseworkobject() {
		return (EReference) courseWorkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_CourseCode() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_CourseName() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_CourseCredits() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_CourseContent() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Courseinstance() {
		return (EReference) courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Studyprograms() {
		return (EReference) courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Courseworker() {
		return (EReference) courseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Precondition() {
		return (EReference) courseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Reduction() {
		return (EReference) courseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseInstance() {
		return courseInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_Coursework() {
		return (EReference) courseInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_Evaluations() {
		return (EReference) courseInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseInstance_CourseYear() {
		return (EAttribute) courseInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseInstance_Term() {
		return (EAttribute) courseInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseWorker() {
		return courseWorkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWorker_CourseRole() {
		return (EAttribute) courseWorkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseWorker_Employee() {
		return (EReference) courseWorkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecondition() {
		return preconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecondition_PreconditionStatus() {
		return (EAttribute) preconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecondition_Course() {
		return (EReference) preconditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduction() {
		return reductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduction_CreditReduction() {
		return (EAttribute) reductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduction_Course() {
		return (EReference) reductionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTermType() {
		return termTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseWorkType() {
		return courseWorkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaluationType() {
		return evaluationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpersonRoleType() {
		return personRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrecondistionType() {
		return precondistionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePagesFactory getCoursePagesFactory() {
		return (CoursePagesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__SUR_NAME);
		createEAttribute(personEClass, PERSON__PHONE_NUMMBER);
		createEAttribute(personEClass, PERSON__EMAIL);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__STUDENT_ID);
		createEReference(studentEClass, STUDENT__STUDYPROGRAMS);
		createEReference(studentEClass, STUDENT__COURSE);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__POSITION);
		createEReference(employeeEClass, EMPLOYEE__DEPARTMENT);

		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__DEPARTMENT_NAME);
		createEAttribute(departmentEClass, DEPARTMENT__PHONE_NUMMBER);
		createEAttribute(departmentEClass, DEPARTMENT__EMAIL);
		createEReference(departmentEClass, DEPARTMENT__EMPLOYEE);
		createEReference(departmentEClass, DEPARTMENT__STUDYPROGRAMS);
		createEReference(departmentEClass, DEPARTMENT__COURSE);

		studyProgramsEClass = createEClass(STUDY_PROGRAMS);
		createEAttribute(studyProgramsEClass, STUDY_PROGRAMS__STUDY_PROGRAM_CODE);
		createEAttribute(studyProgramsEClass, STUDY_PROGRAMS__STUDY_PROGRAM_NAME);
		createEReference(studyProgramsEClass, STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT);
		createEReference(studyProgramsEClass, STUDY_PROGRAMS__STUDENT);
		createEReference(studyProgramsEClass, STUDY_PROGRAMS__COURSE);

		evaluationObjectEClass = createEClass(EVALUATION_OBJECT);
		createEAttribute(evaluationObjectEClass, EVALUATION_OBJECT__EVALUATIONS_FORM);
		createEAttribute(evaluationObjectEClass, EVALUATION_OBJECT__TERM);
		createEAttribute(evaluationObjectEClass, EVALUATION_OBJECT__CREDITS);
		createEAttribute(evaluationObjectEClass, EVALUATION_OBJECT__DATE);

		evaluationsEClass = createEClass(EVALUATIONS);
		createEReference(evaluationsEClass, EVALUATIONS__EVALUATIONOBJECT);

		courseWorkObjectEClass = createEClass(COURSE_WORK_OBJECT);
		createEAttribute(courseWorkObjectEClass, COURSE_WORK_OBJECT__COURSE_WORK_TYPE);
		createEAttribute(courseWorkObjectEClass, COURSE_WORK_OBJECT__ROOM);
		createEAttribute(courseWorkObjectEClass, COURSE_WORK_OBJECT__DAY);
		createEAttribute(courseWorkObjectEClass, COURSE_WORK_OBJECT__START);
		createEAttribute(courseWorkObjectEClass, COURSE_WORK_OBJECT__END);

		courseWorkEClass = createEClass(COURSE_WORK);
		createEReference(courseWorkEClass, COURSE_WORK__COURSEWORKOBJECT);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__COURSE_CODE);
		createEAttribute(courseEClass, COURSE__COURSE_NAME);
		createEAttribute(courseEClass, COURSE__COURSE_CREDITS);
		createEAttribute(courseEClass, COURSE__COURSE_CONTENT);
		createEReference(courseEClass, COURSE__COURSEINSTANCE);
		createEReference(courseEClass, COURSE__STUDYPROGRAMS);
		createEReference(courseEClass, COURSE__COURSEWORKER);
		createEReference(courseEClass, COURSE__PRECONDITION);
		createEReference(courseEClass, COURSE__REDUCTION);

		courseInstanceEClass = createEClass(COURSE_INSTANCE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__COURSEWORK);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__EVALUATIONS);
		createEAttribute(courseInstanceEClass, COURSE_INSTANCE__COURSE_YEAR);
		createEAttribute(courseInstanceEClass, COURSE_INSTANCE__TERM);

		courseWorkerEClass = createEClass(COURSE_WORKER);
		createEAttribute(courseWorkerEClass, COURSE_WORKER__COURSE_ROLE);
		createEReference(courseWorkerEClass, COURSE_WORKER__EMPLOYEE);

		preconditionEClass = createEClass(PRECONDITION);
		createEAttribute(preconditionEClass, PRECONDITION__PRECONDITION_STATUS);
		createEReference(preconditionEClass, PRECONDITION__COURSE);

		reductionEClass = createEClass(REDUCTION);
		createEAttribute(reductionEClass, REDUCTION__CREDIT_REDUCTION);
		createEReference(reductionEClass, REDUCTION__COURSE);

		// Create enums
		termTypeEEnum = createEEnum(TERM_TYPE);
		courseWorkTypeEEnum = createEEnum(COURSE_WORK_TYPE);
		evaluationTypeEEnum = createEEnum(EVALUATION_TYPE);
		personRoleTypeEEnum = createEEnum(PERSON_ROLE_TYPE);
		precondistionTypeEEnum = createEEnum(PRECONDISTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		studentEClass.getESuperTypes().add(this.getPerson());
		employeeEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_SurName(), ecorePackage.getEString(), "surName", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PhoneNummber(), ecorePackage.getEString(), "phoneNummber", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Email(), ecorePackage.getEString(), "email", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_StudentID(), ecorePackage.getEString(), "studentID", null, 0, 1, Student.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Studyprograms(), this.getStudyPrograms(), this.getStudyPrograms_Student(),
				"studyprograms", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Course(), this.getCourse(), null, "course", null, 0, -1, Student.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_Position(), ecorePackage.getEString(), "position", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployee_Department(), this.getDepartment(), this.getDepartment_Employee(), "department",
				null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_DepartmentName(), ecorePackage.getEString(), "departmentName", null, 0, 1,
				Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_PhoneNummber(), ecorePackage.getEString(), "phoneNummber", null, 0, 1,
				Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Email(), ecorePackage.getEString(), "email", null, 0, 1, Department.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Employee(), this.getEmployee(), this.getEmployee_Department(), "employee", null, 0,
				-1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Studyprograms(), this.getStudyPrograms(),
				this.getStudyPrograms_BelongsToDepartment(), "studyprograms", null, 0, -1, Department.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Course(), this.getCourse(), null, "course", null, 0, -1, Department.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyProgramsEClass, StudyPrograms.class, "StudyPrograms", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudyPrograms_StudyProgramCode(), ecorePackage.getEString(), "studyProgramCode", null, 0, 1,
				StudyPrograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyPrograms_StudyProgramName(), ecorePackage.getEString(), "studyProgramName", null, 0, 1,
				StudyPrograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPrograms_BelongsToDepartment(), this.getDepartment(), this.getDepartment_Studyprograms(),
				"belongsToDepartment", null, 1, 1, StudyPrograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPrograms_Student(), this.getStudent(), this.getStudent_Studyprograms(), "student", null,
				0, -1, StudyPrograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyPrograms_Course(), this.getCourse(), this.getCourse_Studyprograms(), "course", null, 0,
				-1, StudyPrograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationObjectEClass, EvaluationObject.class, "EvaluationObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationObject_EvaluationsForm(), this.getEvaluationType(), "evaluationsForm", null, 0, 1,
				EvaluationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationObject_Term(), this.getTermType(), "term", null, 0, 1, EvaluationObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationObject_Credits(), ecorePackage.getEInt(), "credits", null, 0, 1,
				EvaluationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationObject_Date(), ecorePackage.getEDate(), "date", null, 0, 1, EvaluationObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationsEClass, Evaluations.class, "Evaluations", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluations_Evaluationobject(), this.getEvaluationObject(), null, "evaluationobject", null, 1,
				-1, Evaluations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseWorkObjectEClass, CourseWorkObject.class, "CourseWorkObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseWorkObject_CourseWorkType(), this.getCourseWorkType(), "courseWorkType", null, 0, 1,
				CourseWorkObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWorkObject_Room(), ecorePackage.getEString(), "room", null, 0, 1,
				CourseWorkObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWorkObject_Day(), ecorePackage.getEString(), "day", null, 0, 1, CourseWorkObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWorkObject_Start(), ecorePackage.getEDate(), "start", null, 0, 1,
				CourseWorkObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWorkObject_End(), ecorePackage.getEDate(), "end", null, 0, 1, CourseWorkObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseWorkEClass, CourseWork.class, "CourseWork", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseWork_Courseworkobject(), this.getCourseWorkObject(), null, "courseworkobject", null, 1,
				-1, CourseWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_CourseCode(), ecorePackage.getEString(), "courseCode", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseName(), ecorePackage.getEString(), "courseName", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseCredits(), ecorePackage.getEFloat(), "courseCredits", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseContent(), ecorePackage.getEString(), "courseContent", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Courseinstance(), this.getCourseInstance(), null, "courseinstance", null, 0, -1,
				Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Studyprograms(), this.getStudyPrograms(), this.getStudyPrograms_Course(),
				"studyprograms", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Courseworker(), this.getCourseWorker(), null, "courseworker", null, 0, -1,
				Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Precondition(), this.getPrecondition(), null, "precondition", null, 0, -1,
				Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Reduction(), this.getReduction(), null, "reduction", null, 0, -1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseInstanceEClass, CourseInstance.class, "CourseInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseInstance_Coursework(), this.getCourseWork(), null, "coursework", null, 1, 1,
				CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_Evaluations(), this.getEvaluations(), null, "evaluations", null, 1, 1,
				CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseInstance_CourseYear(), ecorePackage.getEString(), "courseYear", null, 0, 1,
				CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseInstance_Term(), this.getTermType(), "term", null, 0, 1, CourseInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseWorkerEClass, CourseWorker.class, "CourseWorker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseWorker_CourseRole(), this.getpersonRoleType(), "courseRole", null, 0, 1,
				CourseWorker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCourseWorker_Employee(), this.getEmployee(), null, "employee", null, 0, 1, CourseWorker.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecondition_PreconditionStatus(), this.getPrecondistionType(), "preconditionStatus", null, 0,
				1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPrecondition_Course(), this.getCourse(), null, "course", null, 1, 1, Precondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reductionEClass, Reduction.class, "Reduction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReduction_CreditReduction(), ecorePackage.getEFloat(), "creditReduction", null, 0, 1,
				Reduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getReduction_Course(), this.getCourse(), null, "course", null, 1, 1, Reduction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(termTypeEEnum, TermType.class, "TermType");
		addEEnumLiteral(termTypeEEnum, TermType.SPRING);
		addEEnumLiteral(termTypeEEnum, TermType.SUMMER);
		addEEnumLiteral(termTypeEEnum, TermType.FALL);

		initEEnum(courseWorkTypeEEnum, CourseWorkType.class, "CourseWorkType");
		addEEnumLiteral(courseWorkTypeEEnum, CourseWorkType.LECTURE);
		addEEnumLiteral(courseWorkTypeEEnum, CourseWorkType.LAB);
		addEEnumLiteral(courseWorkTypeEEnum, CourseWorkType.EXERCISE);

		initEEnum(evaluationTypeEEnum, EvaluationType.class, "EvaluationType");
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.WRITTEN_EXAM);
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.ORAL_EXAM);
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.ASSIGNMENTS);
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.PRACTICAL_EXAM);
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.PARTICIPATED);

		initEEnum(personRoleTypeEEnum, personRoleType.class, "personRoleType");
		addEEnumLiteral(personRoleTypeEEnum, personRoleType.LECTURE);
		addEEnumLiteral(personRoleTypeEEnum, personRoleType.COURSE_CORDINATOR);

		initEEnum(precondistionTypeEEnum, PrecondistionType.class, "PrecondistionType");
		addEEnumLiteral(precondistionTypeEEnum, PrecondistionType.REQUIRED);
		addEEnumLiteral(precondistionTypeEEnum, PrecondistionType.RECOMMENDED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(evaluationsEClass, source, new String[] { "constraints", "SumUpCredit100" });
	}

} //CoursePagesPackageImpl
