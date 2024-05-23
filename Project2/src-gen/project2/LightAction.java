/**
 */
package project2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.LightAction#getRed <em>Red</em>}</li>
 *   <li>{@link project2.LightAction#getGreen <em>Green</em>}</li>
 *   <li>{@link project2.LightAction#getBlue <em>Blue</em>}</li>
 *   <li>{@link project2.LightAction#getPos <em>Pos</em>}</li>
 *   <li>{@link project2.LightAction#getRedEx <em>Red Ex</em>}</li>
 *   <li>{@link project2.LightAction#getBlueEx <em>Blue Ex</em>}</li>
 *   <li>{@link project2.LightAction#getGreenEx <em>Green Ex</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getLightAction()
 * @model
 * @generated
 */
public interface LightAction extends Action {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see project2.Project2Package#getLightAction_Red()
	 * @model
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link project2.LightAction#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see project2.Project2Package#getLightAction_Green()
	 * @model
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link project2.LightAction#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see project2.Project2Package#getLightAction_Blue()
	 * @model
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link project2.LightAction#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * The literals are from the enumeration {@link project2.LightPos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see project2.LightPos
	 * @see #setPos(LightPos)
	 * @see project2.Project2Package#getLightAction_Pos()
	 * @model
	 * @generated
	 */
	LightPos getPos();

	/**
	 * Sets the value of the '{@link project2.LightAction#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see project2.LightPos
	 * @see #getPos()
	 * @generated
	 */
	void setPos(LightPos value);

	/**
	 * Returns the value of the '<em><b>Red Ex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Ex</em>' containment reference.
	 * @see #setRedEx(Expression)
	 * @see project2.Project2Package#getLightAction_RedEx()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRedEx();

	/**
	 * Sets the value of the '{@link project2.LightAction#getRedEx <em>Red Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Ex</em>' containment reference.
	 * @see #getRedEx()
	 * @generated
	 */
	void setRedEx(Expression value);

	/**
	 * Returns the value of the '<em><b>Blue Ex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue Ex</em>' containment reference.
	 * @see #setBlueEx(Expression)
	 * @see project2.Project2Package#getLightAction_BlueEx()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBlueEx();

	/**
	 * Sets the value of the '{@link project2.LightAction#getBlueEx <em>Blue Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue Ex</em>' containment reference.
	 * @see #getBlueEx()
	 * @generated
	 */
	void setBlueEx(Expression value);

	/**
	 * Returns the value of the '<em><b>Green Ex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green Ex</em>' containment reference.
	 * @see #setGreenEx(Expression)
	 * @see project2.Project2Package#getLightAction_GreenEx()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGreenEx();

	/**
	 * Sets the value of the '{@link project2.LightAction#getGreenEx <em>Green Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green Ex</em>' containment reference.
	 * @see #getGreenEx()
	 * @generated
	 */
	void setGreenEx(Expression value);

} // LightAction
