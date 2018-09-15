/**
 */
package tdt4250.steinar.coursePages;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.steinar.coursePages.CoursePagesPackage#getEvaluationType()
 * @model
 * @generated
 */
public enum EvaluationType implements Enumerator {
	/**
	 * The '<em><b>Written Exam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_EXAM_VALUE
	 * @generated
	 * @ordered
	 */
	WRITTEN_EXAM(2, "WrittenExam", "Assignment"),

	/**
	 * The '<em><b>Oral Exam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORAL_EXAM_VALUE
	 * @generated
	 * @ordered
	 */
	ORAL_EXAM(1, "OralExam", "Work"),

	/**
	 * The '<em><b>Assignments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENTS(2, "Assignments", "Portfolio assessment"),

	/**
	 * The '<em><b>Practical Exam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTICAL_EXAM_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTICAL_EXAM(0, "PracticalExam", "Written examination"),

	/**
	 * The '<em><b>Participated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTICIPATED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTICIPATED(4, "Participated", "Oral examination");

	/**
	 * The '<em><b>Written Exam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Written Exam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_EXAM
	 * @model name="WrittenExam" literal="Assignment"
	 * @generated
	 * @ordered
	 */
	public static final int WRITTEN_EXAM_VALUE = 2;

	/**
	 * The '<em><b>Oral Exam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oral Exam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORAL_EXAM
	 * @model name="OralExam" literal="Work"
	 * @generated
	 * @ordered
	 */
	public static final int ORAL_EXAM_VALUE = 1;

	/**
	 * The '<em><b>Assignments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assignments</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENTS
	 * @model name="Assignments" literal="Portfolio assessment"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENTS_VALUE = 2;

	/**
	 * The '<em><b>Practical Exam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Practical Exam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRACTICAL_EXAM
	 * @model name="PracticalExam" literal="Written examination"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTICAL_EXAM_VALUE = 0;

	/**
	 * The '<em><b>Participated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Participated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTICIPATED
	 * @model name="Participated" literal="Oral examination"
	 * @generated
	 * @ordered
	 */
	public static final int PARTICIPATED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Evaluation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluationType[] VALUES_ARRAY = new EvaluationType[] { WRITTEN_EXAM, ORAL_EXAM, ASSIGNMENTS,
			PRACTICAL_EXAM, PARTICIPATED, };

	/**
	 * A public read-only list of all the '<em><b>Evaluation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationType get(int value) {
		switch (value) {
		case WRITTEN_EXAM_VALUE:
			return WRITTEN_EXAM;
		case ORAL_EXAM_VALUE:
			return ORAL_EXAM;
		case PRACTICAL_EXAM_VALUE:
			return PRACTICAL_EXAM;
		case PARTICIPATED_VALUE:
			return PARTICIPATED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvaluationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EvaluationType
