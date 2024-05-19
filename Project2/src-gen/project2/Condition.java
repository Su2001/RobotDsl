/**
 */
package project2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.Condition#getConditionname <em>Conditionname</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionname</em>' attribute.
	 * @see #setConditionname(String)
	 * @see project2.Project2Package#getCondition_Conditionname()
	 * @model
	 * @generated
	 */
	String getConditionname();

	/**
	 * Sets the value of the '{@link project2.Condition#getConditionname <em>Conditionname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionname</em>' attribute.
	 * @see #getConditionname()
	 * @generated
	 */
	void setConditionname(String value);

} // Condition
