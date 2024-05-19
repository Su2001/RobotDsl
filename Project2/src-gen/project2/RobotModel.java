/**
 */
package project2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.RobotModel#getEvents <em>Events</em>}</li>
 *   <li>{@link project2.RobotModel#getActions <em>Actions</em>}</li>
 *   <li>{@link project2.RobotModel#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getRobotModel()
 * @model
 * @generated
 */
public interface RobotModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link project2.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see project2.Project2Package#getRobotModel_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link project2.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see project2.Project2Package#getRobotModel_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link project2.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see project2.Project2Package#getRobotModel_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // RobotModel
