/**
 */
package project2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import project2.Distance;
import project2.Expression;
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
 *   <li>{@link project2.impl.SensorImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link project2.impl.SensorImpl#getPosEx <em>Pos Ex</em>}</li>
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
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Distance DISTANCE_EDEFAULT = Distance.CLOSE;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosEx() <em>Pos Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosEx()
	 * @generated
	 * @ordered
	 */
	protected Expression posEx;

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
	public Distance getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(Distance newDistance) {
		Distance oldDistance = distance;
		distance = newDistance == null ? DISTANCE_EDEFAULT : newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.SENSOR__DISTANCE, oldDistance,
					distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPosEx() {
		return posEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosEx(Expression newPosEx, NotificationChain msgs) {
		Expression oldPosEx = posEx;
		posEx = newPosEx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.SENSOR__POS_EX, oldPosEx, newPosEx);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosEx(Expression newPosEx) {
		if (newPosEx != posEx) {
			NotificationChain msgs = null;
			if (posEx != null)
				msgs = ((InternalEObject) posEx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.SENSOR__POS_EX, null, msgs);
			if (newPosEx != null)
				msgs = ((InternalEObject) newPosEx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.SENSOR__POS_EX, null, msgs);
			msgs = basicSetPosEx(newPosEx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.SENSOR__POS_EX, newPosEx, newPosEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project2Package.SENSOR__POS_EX:
			return basicSetPosEx(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case Project2Package.SENSOR__DISTANCE:
			return getDistance();
		case Project2Package.SENSOR__POS_EX:
			return getPosEx();
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
		case Project2Package.SENSOR__DISTANCE:
			setDistance((Distance) newValue);
			return;
		case Project2Package.SENSOR__POS_EX:
			setPosEx((Expression) newValue);
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
		case Project2Package.SENSOR__DISTANCE:
			setDistance(DISTANCE_EDEFAULT);
			return;
		case Project2Package.SENSOR__POS_EX:
			setPosEx((Expression) null);
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
		case Project2Package.SENSOR__DISTANCE:
			return distance != DISTANCE_EDEFAULT;
		case Project2Package.SENSOR__POS_EX:
			return posEx != null;
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
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
