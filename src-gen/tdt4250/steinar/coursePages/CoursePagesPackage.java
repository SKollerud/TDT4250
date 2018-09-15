/**
 */
package tdt4250.steinar.coursePages;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.steinar.coursePages.CoursePagesFactory
 * @model kind="package"
 * @generated
 */
public interface CoursePagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coursePages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/coursePages";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "coursePages";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoursePagesPackage eINSTANCE = tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.PersonImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Phone Nummber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE_NUMMBER = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.StudentImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SUR_NAME = PERSON__SUR_NAME;

	/**
	 * The feature id for the '<em><b>Phone Nummber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PHONE_NUMMBER = PERSON__PHONE_NUMMBER;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Studyprograms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDYPROGRAMS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COURSE = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.EmployeeImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SUR_NAME = PERSON__SUR_NAME;

	/**
	 * The feature id for the '<em><b>Phone Nummber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PHONE_NUMMBER = PERSON__PHONE_NUMMBER;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL = PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__POSITION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DEPARTMENT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.DepartmentImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Department Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DEPARTMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Phone Nummber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PHONE_NUMMBER = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Studyprograms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDYPROGRAMS = 4;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSE = 5;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl <em>Study Programs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.StudyProgramsImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getStudyPrograms()
	 * @generated
	 */
	int STUDY_PROGRAMS = 4;

	/**
	 * The feature id for the '<em><b>Study Program Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS__STUDY_PROGRAM_CODE = 0;

	/**
	 * The feature id for the '<em><b>Study Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS__STUDY_PROGRAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Belongs To Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS__STUDENT = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS__COURSE = 4;

	/**
	 * The number of structural features of the '<em>Study Programs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Study Programs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.EvaluationObjectImpl <em>Evaluation Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.EvaluationObjectImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEvaluationObject()
	 * @generated
	 */
	int EVALUATION_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Evaluations Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OBJECT__EVALUATIONS_FORM = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OBJECT__TERM = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OBJECT__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OBJECT__DATE = 3;

	/**
	 * The number of structural features of the '<em>Evaluation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Evaluation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.EvaluationsImpl <em>Evaluations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.EvaluationsImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEvaluations()
	 * @generated
	 */
	int EVALUATIONS = 6;

	/**
	 * The feature id for the '<em><b>Evaluationobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIONS__EVALUATIONOBJECT = 0;

	/**
	 * The number of structural features of the '<em>Evaluations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evaluations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl <em>Course Work Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWorkObject()
	 * @generated
	 */
	int COURSE_WORK_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Course Work Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT__COURSE_WORK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT__DAY = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT__START = 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT__END = 4;

	/**
	 * The number of structural features of the '<em>Course Work Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course Work Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.CourseWorkImpl <em>Course Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.CourseWorkImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWork()
	 * @generated
	 */
	int COURSE_WORK = 8;

	/**
	 * The feature id for the '<em><b>Courseworkobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__COURSEWORKOBJECT = 0;

	/**
	 * The number of structural features of the '<em>Course Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Course Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.CourseImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 9;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Course Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Course Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Courseinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSEINSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Studyprograms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDYPROGRAMS = 5;

	/**
	 * The feature id for the '<em><b>Courseworker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSEWORKER = 6;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PRECONDITION = 7;

	/**
	 * The feature id for the '<em><b>Reduction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__REDUCTION = 8;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.CourseInstanceImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Coursework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSEWORK = 0;

	/**
	 * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__EVALUATIONS = 1;

	/**
	 * The feature id for the '<em><b>Course Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__TERM = 3;

	/**
	 * The number of structural features of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.CourseWorkerImpl <em>Course Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.CourseWorkerImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWorker()
	 * @generated
	 */
	int COURSE_WORKER = 11;

	/**
	 * The feature id for the '<em><b>Course Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORKER__COURSE_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORKER__EMPLOYEE = 1;

	/**
	 * The number of structural features of the '<em>Course Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORKER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.PreconditionImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 12;

	/**
	 * The feature id for the '<em><b>Precondition Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__PRECONDITION_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__COURSE = 1;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.impl.ReductionImpl <em>Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.impl.ReductionImpl
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getReduction()
	 * @generated
	 */
	int REDUCTION = 13;

	/**
	 * The feature id for the '<em><b>Credit Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__CREDIT_REDUCTION = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__COURSE = 1;

	/**
	 * The number of structural features of the '<em>Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.TermType <em>Term Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.TermType
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getTermType()
	 * @generated
	 */
	int TERM_TYPE = 14;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.CourseWorkType <em>Course Work Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.CourseWorkType
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWorkType()
	 * @generated
	 */
	int COURSE_WORK_TYPE = 15;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.EvaluationType <em>Evaluation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.EvaluationType
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEvaluationType()
	 * @generated
	 */
	int EVALUATION_TYPE = 16;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.personRoleType <em>person Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.personRoleType
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getpersonRoleType()
	 * @generated
	 */
	int PERSON_ROLE_TYPE = 17;

	/**
	 * The meta object id for the '{@link tdt4250.steinar.coursePages.PrecondistionType <em>Precondistion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.steinar.coursePages.PrecondistionType
	 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getPrecondistionType()
	 * @generated
	 */
	int PRECONDISTION_TYPE = 18;

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see tdt4250.steinar.coursePages.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see tdt4250.steinar.coursePages.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Person#getSurName <em>Sur Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sur Name</em>'.
	 * @see tdt4250.steinar.coursePages.Person#getSurName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SurName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Person#getPhoneNummber <em>Phone Nummber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Nummber</em>'.
	 * @see tdt4250.steinar.coursePages.Person#getPhoneNummber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PhoneNummber();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see tdt4250.steinar.coursePages.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see tdt4250.steinar.coursePages.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Student#getStudentID <em>Student ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student ID</em>'.
	 * @see tdt4250.steinar.coursePages.Student#getStudentID()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_StudentID();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.steinar.coursePages.Student#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Studyprograms</em>'.
	 * @see tdt4250.steinar.coursePages.Student#getStudyprograms()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Studyprograms();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.Student#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see tdt4250.steinar.coursePages.Student#getCourse()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Course();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see tdt4250.steinar.coursePages.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Employee#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see tdt4250.steinar.coursePages.Employee#getPosition()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Position();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.steinar.coursePages.Employee#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department</em>'.
	 * @see tdt4250.steinar.coursePages.Employee#getDepartment()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Department();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see tdt4250.steinar.coursePages.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Department#getDepartmentName <em>Department Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department Name</em>'.
	 * @see tdt4250.steinar.coursePages.Department#getDepartmentName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_DepartmentName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Department#getPhoneNummber <em>Phone Nummber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Nummber</em>'.
	 * @see tdt4250.steinar.coursePages.Department#getPhoneNummber()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_PhoneNummber();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Department#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see tdt4250.steinar.coursePages.Department#getEmail()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Email();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employee</em>'.
	 * @see tdt4250.steinar.coursePages.Department#getEmployee()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employee();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.Department#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprograms</em>'.
	 * @see tdt4250.steinar.coursePages.Department#getStudyprograms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Studyprograms();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.Department#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see tdt4250.steinar.coursePages.Department#getCourse()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Course();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.StudyPrograms <em>Study Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Programs</em>'.
	 * @see tdt4250.steinar.coursePages.StudyPrograms
	 * @generated
	 */
	EClass getStudyPrograms();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramCode <em>Study Program Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Program Code</em>'.
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramCode()
	 * @see #getStudyPrograms()
	 * @generated
	 */
	EAttribute getStudyPrograms_StudyProgramCode();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramName <em>Study Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Program Name</em>'.
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getStudyProgramName()
	 * @see #getStudyPrograms()
	 * @generated
	 */
	EAttribute getStudyPrograms_StudyProgramName();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.steinar.coursePages.StudyPrograms#getBelongsToDepartment <em>Belongs To Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Department</em>'.
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getBelongsToDepartment()
	 * @see #getStudyPrograms()
	 * @generated
	 */
	EReference getStudyPrograms_BelongsToDepartment();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.StudyPrograms#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Student</em>'.
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getStudent()
	 * @see #getStudyPrograms()
	 * @generated
	 */
	EReference getStudyPrograms_Student();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.StudyPrograms#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see tdt4250.steinar.coursePages.StudyPrograms#getCourse()
	 * @see #getStudyPrograms()
	 * @generated
	 */
	EReference getStudyPrograms_Course();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.EvaluationObject <em>Evaluation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Object</em>'.
	 * @see tdt4250.steinar.coursePages.EvaluationObject
	 * @generated
	 */
	EClass getEvaluationObject();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.EvaluationObject#getEvaluationsForm <em>Evaluations Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluations Form</em>'.
	 * @see tdt4250.steinar.coursePages.EvaluationObject#getEvaluationsForm()
	 * @see #getEvaluationObject()
	 * @generated
	 */
	EAttribute getEvaluationObject_EvaluationsForm();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.EvaluationObject#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see tdt4250.steinar.coursePages.EvaluationObject#getTerm()
	 * @see #getEvaluationObject()
	 * @generated
	 */
	EAttribute getEvaluationObject_Term();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.EvaluationObject#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tdt4250.steinar.coursePages.EvaluationObject#getCredits()
	 * @see #getEvaluationObject()
	 * @generated
	 */
	EAttribute getEvaluationObject_Credits();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.EvaluationObject#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tdt4250.steinar.coursePages.EvaluationObject#getDate()
	 * @see #getEvaluationObject()
	 * @generated
	 */
	EAttribute getEvaluationObject_Date();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Evaluations <em>Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluations</em>'.
	 * @see tdt4250.steinar.coursePages.Evaluations
	 * @generated
	 */
	EClass getEvaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.steinar.coursePages.Evaluations#getEvaluationobject <em>Evaluationobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluationobject</em>'.
	 * @see tdt4250.steinar.coursePages.Evaluations#getEvaluationobject()
	 * @see #getEvaluations()
	 * @generated
	 */
	EReference getEvaluations_Evaluationobject();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.CourseWorkObject <em>Course Work Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Work Object</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkObject
	 * @generated
	 */
	EClass getCourseWorkObject();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseWorkObject#getCourseWorkType <em>Course Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Work Type</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkObject#getCourseWorkType()
	 * @see #getCourseWorkObject()
	 * @generated
	 */
	EAttribute getCourseWorkObject_CourseWorkType();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseWorkObject#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkObject#getRoom()
	 * @see #getCourseWorkObject()
	 * @generated
	 */
	EAttribute getCourseWorkObject_Room();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseWorkObject#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkObject#getDay()
	 * @see #getCourseWorkObject()
	 * @generated
	 */
	EAttribute getCourseWorkObject_Day();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseWorkObject#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkObject#getStart()
	 * @see #getCourseWorkObject()
	 * @generated
	 */
	EAttribute getCourseWorkObject_Start();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseWorkObject#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkObject#getEnd()
	 * @see #getCourseWorkObject()
	 * @generated
	 */
	EAttribute getCourseWorkObject_End();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.CourseWork <em>Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Work</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWork
	 * @generated
	 */
	EClass getCourseWork();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.steinar.coursePages.CourseWork#getCourseworkobject <em>Courseworkobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseworkobject</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWork#getCourseworkobject()
	 * @see #getCourseWork()
	 * @generated
	 */
	EReference getCourseWork_Courseworkobject();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.steinar.coursePages.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Course#getCourseCredits <em>Course Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Credits</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getCourseCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCredits();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Course#getCourseContent <em>Course Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Content</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getCourseContent()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseContent();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.steinar.coursePages.Course#getCourseinstance <em>Courseinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseinstance</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getCourseinstance()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Courseinstance();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.steinar.coursePages.Course#getStudyprograms <em>Studyprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprograms</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getStudyprograms()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Studyprograms();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.steinar.coursePages.Course#getCourseworker <em>Courseworker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseworker</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getCourseworker()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Courseworker();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.steinar.coursePages.Course#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getPrecondition()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.steinar.coursePages.Course#getReduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction</em>'.
	 * @see tdt4250.steinar.coursePages.Course#getReduction()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Reduction();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instance</em>'.
	 * @see tdt4250.steinar.coursePages.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.steinar.coursePages.CourseInstance#getCoursework <em>Coursework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coursework</em>'.
	 * @see tdt4250.steinar.coursePages.CourseInstance#getCoursework()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Coursework();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.steinar.coursePages.CourseInstance#getEvaluations <em>Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluations</em>'.
	 * @see tdt4250.steinar.coursePages.CourseInstance#getEvaluations()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Evaluations();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseInstance#getCourseYear <em>Course Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Year</em>'.
	 * @see tdt4250.steinar.coursePages.CourseInstance#getCourseYear()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_CourseYear();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseInstance#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see tdt4250.steinar.coursePages.CourseInstance#getTerm()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Term();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.CourseWorker <em>Course Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Worker</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorker
	 * @generated
	 */
	EClass getCourseWorker();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.CourseWorker#getCourseRole <em>Course Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Role</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorker#getCourseRole()
	 * @see #getCourseWorker()
	 * @generated
	 */
	EAttribute getCourseWorker_CourseRole();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.steinar.coursePages.CourseWorker#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorker#getEmployee()
	 * @see #getCourseWorker()
	 * @generated
	 */
	EReference getCourseWorker_Employee();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see tdt4250.steinar.coursePages.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Precondition#getPreconditionStatus <em>Precondition Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Status</em>'.
	 * @see tdt4250.steinar.coursePages.Precondition#getPreconditionStatus()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_PreconditionStatus();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.steinar.coursePages.Precondition#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see tdt4250.steinar.coursePages.Precondition#getCourse()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Course();

	/**
	 * Returns the meta object for class '{@link tdt4250.steinar.coursePages.Reduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction</em>'.
	 * @see tdt4250.steinar.coursePages.Reduction
	 * @generated
	 */
	EClass getReduction();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.steinar.coursePages.Reduction#getCreditReduction <em>Credit Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Reduction</em>'.
	 * @see tdt4250.steinar.coursePages.Reduction#getCreditReduction()
	 * @see #getReduction()
	 * @generated
	 */
	EAttribute getReduction_CreditReduction();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.steinar.coursePages.Reduction#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see tdt4250.steinar.coursePages.Reduction#getCourse()
	 * @see #getReduction()
	 * @generated
	 */
	EReference getReduction_Course();

	/**
	 * Returns the meta object for enum '{@link tdt4250.steinar.coursePages.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Term Type</em>'.
	 * @see tdt4250.steinar.coursePages.TermType
	 * @generated
	 */
	EEnum getTermType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.steinar.coursePages.CourseWorkType <em>Course Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Work Type</em>'.
	 * @see tdt4250.steinar.coursePages.CourseWorkType
	 * @generated
	 */
	EEnum getCourseWorkType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.steinar.coursePages.EvaluationType <em>Evaluation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Type</em>'.
	 * @see tdt4250.steinar.coursePages.EvaluationType
	 * @generated
	 */
	EEnum getEvaluationType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.steinar.coursePages.personRoleType <em>person Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>person Role Type</em>'.
	 * @see tdt4250.steinar.coursePages.personRoleType
	 * @generated
	 */
	EEnum getpersonRoleType();

	/**
	 * Returns the meta object for enum '{@link tdt4250.steinar.coursePages.PrecondistionType <em>Precondistion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Precondistion Type</em>'.
	 * @see tdt4250.steinar.coursePages.PrecondistionType
	 * @generated
	 */
	EEnum getPrecondistionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoursePagesFactory getCoursePagesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.PersonImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Sur Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUR_NAME = eINSTANCE.getPerson_SurName();

		/**
		 * The meta object literal for the '<em><b>Phone Nummber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PHONE_NUMMBER = eINSTANCE.getPerson_PhoneNummber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.StudentImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Student ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_ID = eINSTANCE.getStudent_StudentID();

		/**
		 * The meta object literal for the '<em><b>Studyprograms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__STUDYPROGRAMS = eINSTANCE.getStudent_Studyprograms();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__COURSE = eINSTANCE.getStudent_Course();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.EmployeeImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__POSITION = eINSTANCE.getEmployee_Position();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__DEPARTMENT = eINSTANCE.getEmployee_Department();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.DepartmentImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Department Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DEPARTMENT_NAME = eINSTANCE.getDepartment_DepartmentName();

		/**
		 * The meta object literal for the '<em><b>Phone Nummber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__PHONE_NUMMBER = eINSTANCE.getDepartment_PhoneNummber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__EMAIL = eINSTANCE.getDepartment_Email();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEE = eINSTANCE.getDepartment_Employee();

		/**
		 * The meta object literal for the '<em><b>Studyprograms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDYPROGRAMS = eINSTANCE.getDepartment_Studyprograms();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSE = eINSTANCE.getDepartment_Course();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.StudyProgramsImpl <em>Study Programs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.StudyProgramsImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getStudyPrograms()
		 * @generated
		 */
		EClass STUDY_PROGRAMS = eINSTANCE.getStudyPrograms();

		/**
		 * The meta object literal for the '<em><b>Study Program Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAMS__STUDY_PROGRAM_CODE = eINSTANCE.getStudyPrograms_StudyProgramCode();

		/**
		 * The meta object literal for the '<em><b>Study Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAMS__STUDY_PROGRAM_NAME = eINSTANCE.getStudyPrograms_StudyProgramName();

		/**
		 * The meta object literal for the '<em><b>Belongs To Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAMS__BELONGS_TO_DEPARTMENT = eINSTANCE.getStudyPrograms_BelongsToDepartment();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAMS__STUDENT = eINSTANCE.getStudyPrograms_Student();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAMS__COURSE = eINSTANCE.getStudyPrograms_Course();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.EvaluationObjectImpl <em>Evaluation Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.EvaluationObjectImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEvaluationObject()
		 * @generated
		 */
		EClass EVALUATION_OBJECT = eINSTANCE.getEvaluationObject();

		/**
		 * The meta object literal for the '<em><b>Evaluations Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_OBJECT__EVALUATIONS_FORM = eINSTANCE.getEvaluationObject_EvaluationsForm();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_OBJECT__TERM = eINSTANCE.getEvaluationObject_Term();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_OBJECT__CREDITS = eINSTANCE.getEvaluationObject_Credits();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_OBJECT__DATE = eINSTANCE.getEvaluationObject_Date();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.EvaluationsImpl <em>Evaluations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.EvaluationsImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEvaluations()
		 * @generated
		 */
		EClass EVALUATIONS = eINSTANCE.getEvaluations();

		/**
		 * The meta object literal for the '<em><b>Evaluationobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATIONS__EVALUATIONOBJECT = eINSTANCE.getEvaluations_Evaluationobject();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl <em>Course Work Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.CourseWorkObjectImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWorkObject()
		 * @generated
		 */
		EClass COURSE_WORK_OBJECT = eINSTANCE.getCourseWorkObject();

		/**
		 * The meta object literal for the '<em><b>Course Work Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK_OBJECT__COURSE_WORK_TYPE = eINSTANCE.getCourseWorkObject_CourseWorkType();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK_OBJECT__ROOM = eINSTANCE.getCourseWorkObject_Room();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK_OBJECT__DAY = eINSTANCE.getCourseWorkObject_Day();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK_OBJECT__START = eINSTANCE.getCourseWorkObject_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK_OBJECT__END = eINSTANCE.getCourseWorkObject_End();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.CourseWorkImpl <em>Course Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.CourseWorkImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWork()
		 * @generated
		 */
		EClass COURSE_WORK = eINSTANCE.getCourseWork();

		/**
		 * The meta object literal for the '<em><b>Courseworkobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_WORK__COURSEWORKOBJECT = eINSTANCE.getCourseWork_Courseworkobject();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.CourseImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Course Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CREDITS = eINSTANCE.getCourse_CourseCredits();

		/**
		 * The meta object literal for the '<em><b>Course Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CONTENT = eINSTANCE.getCourse_CourseContent();

		/**
		 * The meta object literal for the '<em><b>Courseinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSEINSTANCE = eINSTANCE.getCourse_Courseinstance();

		/**
		 * The meta object literal for the '<em><b>Studyprograms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STUDYPROGRAMS = eINSTANCE.getCourse_Studyprograms();

		/**
		 * The meta object literal for the '<em><b>Courseworker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSEWORKER = eINSTANCE.getCourse_Courseworker();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__PRECONDITION = eINSTANCE.getCourse_Precondition();

		/**
		 * The meta object literal for the '<em><b>Reduction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__REDUCTION = eINSTANCE.getCourse_Reduction();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.CourseInstanceImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Coursework</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSEWORK = eINSTANCE.getCourseInstance_Coursework();

		/**
		 * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__EVALUATIONS = eINSTANCE.getCourseInstance_Evaluations();

		/**
		 * The meta object literal for the '<em><b>Course Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__COURSE_YEAR = eINSTANCE.getCourseInstance_CourseYear();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__TERM = eINSTANCE.getCourseInstance_Term();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.CourseWorkerImpl <em>Course Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.CourseWorkerImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWorker()
		 * @generated
		 */
		EClass COURSE_WORKER = eINSTANCE.getCourseWorker();

		/**
		 * The meta object literal for the '<em><b>Course Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORKER__COURSE_ROLE = eINSTANCE.getCourseWorker_CourseRole();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_WORKER__EMPLOYEE = eINSTANCE.getCourseWorker_Employee();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.PreconditionImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Precondition Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__PRECONDITION_STATUS = eINSTANCE.getPrecondition_PreconditionStatus();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__COURSE = eINSTANCE.getPrecondition_Course();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.impl.ReductionImpl <em>Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.impl.ReductionImpl
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getReduction()
		 * @generated
		 */
		EClass REDUCTION = eINSTANCE.getReduction();

		/**
		 * The meta object literal for the '<em><b>Credit Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION__CREDIT_REDUCTION = eINSTANCE.getReduction_CreditReduction();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION__COURSE = eINSTANCE.getReduction_Course();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.TermType <em>Term Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.TermType
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getTermType()
		 * @generated
		 */
		EEnum TERM_TYPE = eINSTANCE.getTermType();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.CourseWorkType <em>Course Work Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.CourseWorkType
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getCourseWorkType()
		 * @generated
		 */
		EEnum COURSE_WORK_TYPE = eINSTANCE.getCourseWorkType();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.EvaluationType <em>Evaluation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.EvaluationType
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getEvaluationType()
		 * @generated
		 */
		EEnum EVALUATION_TYPE = eINSTANCE.getEvaluationType();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.personRoleType <em>person Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.personRoleType
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getpersonRoleType()
		 * @generated
		 */
		EEnum PERSON_ROLE_TYPE = eINSTANCE.getpersonRoleType();

		/**
		 * The meta object literal for the '{@link tdt4250.steinar.coursePages.PrecondistionType <em>Precondistion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.steinar.coursePages.PrecondistionType
		 * @see tdt4250.steinar.coursePages.impl.CoursePagesPackageImpl#getPrecondistionType()
		 * @generated
		 */
		EEnum PRECONDISTION_TYPE = eINSTANCE.getPrecondistionType();

	}

} //CoursePagesPackage
