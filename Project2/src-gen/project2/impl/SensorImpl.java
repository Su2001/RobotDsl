/**
 */
package project2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import project2.Project2Package;
import project2.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project2.impl.SensorImpl#getSensorPos <em>Sensor Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ConditionImpl implements Sensor {
	/**
	 * The default value of the '{@link #getSensorPos() <em>Sensor Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorPos()
	 * @generated
	 * @ordered
	 */
	protected static final int SENSOR_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSensorPos() <em>Sensor Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorPos()
	 * @generated
	 * @ordered
	 */
	protected int sensorPos = SENSOR_POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project2Package.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSensorPos() {
		return sensorPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorPos(int newSensorPos) {
		int oldSensorPos = sensorPos;
		sensorPos = newSensorPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.SENSOR__SENSOR_POS, oldSensorPos,
					sensorPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Project2Package.SENSOR__SENSOR_POS:
			return getSensorPos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Project2Package.SENSOR__SENSOR_POS:
			setSensorPos((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Project2Package.SENSOR__SENSOR_POS:
			setSensorPos(SENSOR_POS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Project2Package.SENSOR__SENSOR_POS:
			return sensorPos != SENSOR_POS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sensorPos: ");
		result.append(sensorPos);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
