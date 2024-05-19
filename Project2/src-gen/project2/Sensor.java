/**
 */
package project2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.Sensor#getSensorPos <em>Sensor Pos</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Condition {
	/**
	 * Returns the value of the '<em><b>Sensor Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Pos</em>' attribute.
	 * @see #setSensorPos(int)
	 * @see project2.Project2Package#getSensor_SensorPos()
	 * @model required="true"
	 * @generated
	 */
	int getSensorPos();

	/**
	 * Sets the value of the '{@link project2.Sensor#getSensorPos <em>Sensor Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Pos</em>' attribute.
	 * @see #getSensorPos()
	 * @generated
	 */
	void setSensorPos(int value);

} // Sensor
