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
 *   <li>{@link project2.Event#getConditions <em>Conditions</em>}</li>
 *   <li>{@link project2.Event#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference list.
	 * The list contents are of type {@link project2.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference list.
	 * @see project2.Project2Package#getEvent_Conditions()
	 * @model
	 * @generated
	 */
	EList<Condition> getConditions();

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
