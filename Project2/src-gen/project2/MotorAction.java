/**
 */
package project2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.MotorAction#getMotorLeft <em>Motor Left</em>}</li>
 *   <li>{@link project2.MotorAction#getMotorRight <em>Motor Right</em>}</li>
 *   <li>{@link project2.MotorAction#getRight <em>Right</em>}</li>
 *   <li>{@link project2.MotorAction#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getMotorAction()
 * @model
 * @generated
 */
public interface MotorAction extends Action {
	/**
	 * Returns the value of the '<em><b>Motor Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor Left</em>' attribute.
	 * @see #setMotorLeft(int)
	 * @see project2.Project2Package#getMotorAction_MotorLeft()
	 * @model
	 * @generated
	 */
	int getMotorLeft();

	/**
	 * Sets the value of the '{@link project2.MotorAction#getMotorLeft <em>Motor Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor Left</em>' attribute.
	 * @see #getMotorLeft()
	 * @generated
	 */
	void setMotorLeft(int value);

	/**
	 * Returns the value of the '<em><b>Motor Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor Right</em>' attribute.
	 * @see #setMotorRight(int)
	 * @see project2.Project2Package#getMotorAction_MotorRight()
	 * @model
	 * @generated
	 */
	int getMotorRight();

	/**
	 * Sets the value of the '{@link project2.MotorAction#getMotorRight <em>Motor Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor Right</em>' attribute.
	 * @see #getMotorRight()
	 * @generated
	 */
	void setMotorRight(int value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see project2.Project2Package#getMotorAction_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link project2.MotorAction#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see project2.Project2Package#getMotorAction_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link project2.MotorAction#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

} // MotorAction
