/**
 */
package project2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import project2.Expression;
import project2.MotorAction;
import project2.Project2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project2.impl.MotorActionImpl#getMotorLeft <em>Motor Left</em>}</li>
 *   <li>{@link project2.impl.MotorActionImpl#getMotorRight <em>Motor Right</em>}</li>
 *   <li>{@link project2.impl.MotorActionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link project2.impl.MotorActionImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorActionImpl extends ActionImpl implements MotorAction {
	/**
	 * The default value of the '{@link #getMotorLeft() <em>Motor Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int MOTOR_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMotorLeft() <em>Motor Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorLeft()
	 * @generated
	 * @ordered
	 */
	protected int motorLeft = MOTOR_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotorRight() <em>Motor Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorRight()
	 * @generated
	 * @ordered
	 */
	protected static final int MOTOR_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMotorRight() <em>Motor Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorRight()
	 * @generated
	 * @ordered
	 */
	protected int motorRight = MOTOR_RIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project2Package.Literals.MOTOR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMotorLeft() {
		return motorLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotorLeft(int newMotorLeft) {
		int oldMotorLeft = motorLeft;
		motorLeft = newMotorLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MOTOR_ACTION__MOTOR_LEFT,
					oldMotorLeft, motorLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMotorRight() {
		return motorRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotorRight(int newMotorRight) {
		int oldMotorRight = motorRight;
		motorRight = newMotorRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MOTOR_ACTION__MOTOR_RIGHT,
					oldMotorRight, motorRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.MOTOR_ACTION__RIGHT, oldRight, newRight);
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
	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MOTOR_ACTION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MOTOR_ACTION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MOTOR_ACTION__RIGHT, newRight,
					newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.MOTOR_ACTION__LEFT, oldLeft, newLeft);
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
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MOTOR_ACTION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MOTOR_ACTION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MOTOR_ACTION__LEFT, newLeft,
					newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project2Package.MOTOR_ACTION__RIGHT:
			return basicSetRight(null, msgs);
		case Project2Package.MOTOR_ACTION__LEFT:
			return basicSetLeft(null, msgs);
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
		case Project2Package.MOTOR_ACTION__MOTOR_LEFT:
			return getMotorLeft();
		case Project2Package.MOTOR_ACTION__MOTOR_RIGHT:
			return getMotorRight();
		case Project2Package.MOTOR_ACTION__RIGHT:
			return getRight();
		case Project2Package.MOTOR_ACTION__LEFT:
			return getLeft();
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
		case Project2Package.MOTOR_ACTION__MOTOR_LEFT:
			setMotorLeft((Integer) newValue);
			return;
		case Project2Package.MOTOR_ACTION__MOTOR_RIGHT:
			setMotorRight((Integer) newValue);
			return;
		case Project2Package.MOTOR_ACTION__RIGHT:
			setRight((Expression) newValue);
			return;
		case Project2Package.MOTOR_ACTION__LEFT:
			setLeft((Expression) newValue);
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
		case Project2Package.MOTOR_ACTION__MOTOR_LEFT:
			setMotorLeft(MOTOR_LEFT_EDEFAULT);
			return;
		case Project2Package.MOTOR_ACTION__MOTOR_RIGHT:
			setMotorRight(MOTOR_RIGHT_EDEFAULT);
			return;
		case Project2Package.MOTOR_ACTION__RIGHT:
			setRight((Expression) null);
			return;
		case Project2Package.MOTOR_ACTION__LEFT:
			setLeft((Expression) null);
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
		case Project2Package.MOTOR_ACTION__MOTOR_LEFT:
			return motorLeft != MOTOR_LEFT_EDEFAULT;
		case Project2Package.MOTOR_ACTION__MOTOR_RIGHT:
			return motorRight != MOTOR_RIGHT_EDEFAULT;
		case Project2Package.MOTOR_ACTION__RIGHT:
			return right != null;
		case Project2Package.MOTOR_ACTION__LEFT:
			return left != null;
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
		result.append(" (motorLeft: ");
		result.append(motorLeft);
		result.append(", motorRight: ");
		result.append(motorRight);
		result.append(')');
		return result.toString();
	}

} //MotorActionImpl
