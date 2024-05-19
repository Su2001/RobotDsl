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

} // LightAction
