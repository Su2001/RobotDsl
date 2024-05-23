/**
 */
package project2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import project2.Expression;
import project2.LightAction;
import project2.LightPos;
import project2.Project2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project2.impl.LightActionImpl#getRed <em>Red</em>}</li>
 *   <li>{@link project2.impl.LightActionImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link project2.impl.LightActionImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link project2.impl.LightActionImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link project2.impl.LightActionImpl#getRedEx <em>Red Ex</em>}</li>
 *   <li>{@link project2.impl.LightActionImpl#getBlueEx <em>Blue Ex</em>}</li>
 *   <li>{@link project2.impl.LightActionImpl#getGreenEx <em>Green Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightActionImpl extends ActionImpl implements LightAction {
	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected int red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final int GREEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected int green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final int BLUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected int blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final LightPos POS_EDEFAULT = LightPos.TOP;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected LightPos pos = POS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedEx() <em>Red Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedEx()
	 * @generated
	 * @ordered
	 */
	protected Expression redEx;

	/**
	 * The cached value of the '{@link #getBlueEx() <em>Blue Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueEx()
	 * @generated
	 * @ordered
	 */
	protected Expression blueEx;

	/**
	 * The cached value of the '{@link #getGreenEx() <em>Green Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenEx()
	 * @generated
	 * @ordered
	 */
	protected Expression greenEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project2Package.Literals.LIGHT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRed(int newRed) {
		int oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreen(int newGreen) {
		int oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__GREEN, oldGreen,
					green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlue(int newBlue) {
		int oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightPos getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPos(LightPos newPos) {
		LightPos oldPos = pos;
		pos = newPos == null ? POS_EDEFAULT : newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRedEx() {
		return redEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedEx(Expression newRedEx, NotificationChain msgs) {
		Expression oldRedEx = redEx;
		redEx = newRedEx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.LIGHT_ACTION__RED_EX, oldRedEx, newRedEx);
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
	public void setRedEx(Expression newRedEx) {
		if (newRedEx != redEx) {
			NotificationChain msgs = null;
			if (redEx != null)
				msgs = ((InternalEObject) redEx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.LIGHT_ACTION__RED_EX, null, msgs);
			if (newRedEx != null)
				msgs = ((InternalEObject) newRedEx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.LIGHT_ACTION__RED_EX, null, msgs);
			msgs = basicSetRedEx(newRedEx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__RED_EX, newRedEx,
					newRedEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getBlueEx() {
		return blueEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlueEx(Expression newBlueEx, NotificationChain msgs) {
		Expression oldBlueEx = blueEx;
		blueEx = newBlueEx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.LIGHT_ACTION__BLUE_EX, oldBlueEx, newBlueEx);
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
	public void setBlueEx(Expression newBlueEx) {
		if (newBlueEx != blueEx) {
			NotificationChain msgs = null;
			if (blueEx != null)
				msgs = ((InternalEObject) blueEx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.LIGHT_ACTION__BLUE_EX, null, msgs);
			if (newBlueEx != null)
				msgs = ((InternalEObject) newBlueEx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.LIGHT_ACTION__BLUE_EX, null, msgs);
			msgs = basicSetBlueEx(newBlueEx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__BLUE_EX, newBlueEx,
					newBlueEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getGreenEx() {
		return greenEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenEx(Expression newGreenEx, NotificationChain msgs) {
		Expression oldGreenEx = greenEx;
		greenEx = newGreenEx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.LIGHT_ACTION__GREEN_EX, oldGreenEx, newGreenEx);
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
	public void setGreenEx(Expression newGreenEx) {
		if (newGreenEx != greenEx) {
			NotificationChain msgs = null;
			if (greenEx != null)
				msgs = ((InternalEObject) greenEx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.LIGHT_ACTION__GREEN_EX, null, msgs);
			if (newGreenEx != null)
				msgs = ((InternalEObject) newGreenEx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.LIGHT_ACTION__GREEN_EX, null, msgs);
			msgs = basicSetGreenEx(newGreenEx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.LIGHT_ACTION__GREEN_EX, newGreenEx,
					newGreenEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project2Package.LIGHT_ACTION__RED_EX:
			return basicSetRedEx(null, msgs);
		case Project2Package.LIGHT_ACTION__BLUE_EX:
			return basicSetBlueEx(null, msgs);
		case Project2Package.LIGHT_ACTION__GREEN_EX:
			return basicSetGreenEx(null, msgs);
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
		case Project2Package.LIGHT_ACTION__RED:
			return getRed();
		case Project2Package.LIGHT_ACTION__GREEN:
			return getGreen();
		case Project2Package.LIGHT_ACTION__BLUE:
			return getBlue();
		case Project2Package.LIGHT_ACTION__POS:
			return getPos();
		case Project2Package.LIGHT_ACTION__RED_EX:
			return getRedEx();
		case Project2Package.LIGHT_ACTION__BLUE_EX:
			return getBlueEx();
		case Project2Package.LIGHT_ACTION__GREEN_EX:
			return getGreenEx();
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
		case Project2Package.LIGHT_ACTION__RED:
			setRed((Integer) newValue);
			return;
		case Project2Package.LIGHT_ACTION__GREEN:
			setGreen((Integer) newValue);
			return;
		case Project2Package.LIGHT_ACTION__BLUE:
			setBlue((Integer) newValue);
			return;
		case Project2Package.LIGHT_ACTION__POS:
			setPos((LightPos) newValue);
			return;
		case Project2Package.LIGHT_ACTION__RED_EX:
			setRedEx((Expression) newValue);
			return;
		case Project2Package.LIGHT_ACTION__BLUE_EX:
			setBlueEx((Expression) newValue);
			return;
		case Project2Package.LIGHT_ACTION__GREEN_EX:
			setGreenEx((Expression) newValue);
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
		case Project2Package.LIGHT_ACTION__RED:
			setRed(RED_EDEFAULT);
			return;
		case Project2Package.LIGHT_ACTION__GREEN:
			setGreen(GREEN_EDEFAULT);
			return;
		case Project2Package.LIGHT_ACTION__BLUE:
			setBlue(BLUE_EDEFAULT);
			return;
		case Project2Package.LIGHT_ACTION__POS:
			setPos(POS_EDEFAULT);
			return;
		case Project2Package.LIGHT_ACTION__RED_EX:
			setRedEx((Expression) null);
			return;
		case Project2Package.LIGHT_ACTION__BLUE_EX:
			setBlueEx((Expression) null);
			return;
		case Project2Package.LIGHT_ACTION__GREEN_EX:
			setGreenEx((Expression) null);
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
		case Project2Package.LIGHT_ACTION__RED:
			return red != RED_EDEFAULT;
		case Project2Package.LIGHT_ACTION__GREEN:
			return green != GREEN_EDEFAULT;
		case Project2Package.LIGHT_ACTION__BLUE:
			return blue != BLUE_EDEFAULT;
		case Project2Package.LIGHT_ACTION__POS:
			return pos != POS_EDEFAULT;
		case Project2Package.LIGHT_ACTION__RED_EX:
			return redEx != null;
		case Project2Package.LIGHT_ACTION__BLUE_EX:
			return blueEx != null;
		case Project2Package.LIGHT_ACTION__GREEN_EX:
			return greenEx != null;
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
		result.append(" (red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(", pos: ");
		result.append(pos);
		result.append(')');
		return result.toString();
	}

} //LightActionImpl
