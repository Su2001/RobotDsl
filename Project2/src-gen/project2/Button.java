/**
 */
package project2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.Button#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getButton()
 * @model
 * @generated
 */
public interface Button extends Condition {
	/**
	 * Returns the value of the '<em><b>Button</b></em>' attribute.
	 * The literals are from the enumeration {@link project2.ButtonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' attribute.
	 * @see project2.ButtonType
	 * @see #setButton(ButtonType)
	 * @see project2.Project2Package#getButton_Button()
	 * @model required="true"
	 * @generated
	 */
	ButtonType getButton();

	/**
	 * Sets the value of the '{@link project2.Button#getButton <em>Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' attribute.
	 * @see project2.ButtonType
	 * @see #getButton()
	 * @generated
	 */
	void setButton(ButtonType value);

} // Button
