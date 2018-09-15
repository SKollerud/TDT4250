/**
 */
package tdt4250.steinar.coursePages.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tdt4250.steinar.coursePages.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tdt4250.steinar.coursePages.CoursePagesPackage
 * @generated
 */
public class CoursePagesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoursePagesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePagesSwitch() {
		if (modelPackage == null) {
			modelPackage = CoursePagesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CoursePagesPackage.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.STUDENT: {
			Student student = (Student) theEObject;
			T result = caseStudent(student);
			if (result == null)
				result = casePerson(student);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.EMPLOYEE: {
			Employee employee = (Employee) theEObject;
			T result = caseEmployee(employee);
			if (result == null)
				result = casePerson(employee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.DEPARTMENT: {
			Department department = (Department) theEObject;
			T result = caseDepartment(department);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.STUDY_PROGRAMS: {
			StudyPrograms studyPrograms = (StudyPrograms) theEObject;
			T result = caseStudyPrograms(studyPrograms);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.EVALUATION_OBJECT: {
			EvaluationObject evaluationObject = (EvaluationObject) theEObject;
			T result = caseEvaluationObject(evaluationObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.EVALUATIONS: {
			Evaluations evaluations = (Evaluations) theEObject;
			T result = caseEvaluations(evaluations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.COURSE_WORK_OBJECT: {
			CourseWorkObject courseWorkObject = (CourseWorkObject) theEObject;
			T result = caseCourseWorkObject(courseWorkObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.COURSE_WORK: {
			CourseWork courseWork = (CourseWork) theEObject;
			T result = caseCourseWork(courseWork);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.COURSE: {
			Course course = (Course) theEObject;
			T result = caseCourse(course);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.COURSE_INSTANCE: {
			CourseInstance courseInstance = (CourseInstance) theEObject;
			T result = caseCourseInstance(courseInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.COURSE_WORKER: {
			CourseWorker courseWorker = (CourseWorker) theEObject;
			T result = caseCourseWorker(courseWorker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.PRECONDITION: {
			Precondition precondition = (Precondition) theEObject;
			T result = casePrecondition(precondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoursePagesPackage.REDUCTION: {
			Reduction reduction = (Reduction) theEObject;
			T result = caseReduction(reduction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartment(Department object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Programs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Programs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyPrograms(StudyPrograms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationObject(EvaluationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluations(Evaluations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Work Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Work Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseWorkObject(CourseWorkObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseWork(CourseWork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseInstance(CourseInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Worker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Worker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseWorker(CourseWorker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduction(Reduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoursePagesSwitch
