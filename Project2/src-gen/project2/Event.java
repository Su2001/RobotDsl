/**
 */
package project2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.Event#getCondition <em>Condition</em>}</li>
 *   <li>{@link project2.Event#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see project2.Project2Package#getEvent_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link project2.Event#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link project2.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see project2.Project2Package#getEvent_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

} // Event
