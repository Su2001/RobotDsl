/**
 */
package project2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import project2.Action;
import project2.Condition;
import project2.Event;
import project2.Expression;
import project2.Project2Package;
import project2.RobotModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project2.impl.RobotModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link project2.impl.RobotModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link project2.impl.RobotModelImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link project2.impl.RobotModelImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link project2.impl.RobotModelImpl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotModelImpl extends MinimalEObjectImpl.Container implements RobotModel {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected int init = INIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project2Package.Literals.ROBOT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, Project2Package.ROBOT_MODEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Project2Package.ROBOT_MODEL__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					Project2Package.ROBOT_MODEL__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this,
					Project2Package.ROBOT_MODEL__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInit(int newInit) {
		int oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.ROBOT_MODEL__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project2Package.ROBOT_MODEL__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case Project2Package.ROBOT_MODEL__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case Project2Package.ROBOT_MODEL__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		case Project2Package.ROBOT_MODEL__EXPRESSIONS:
			return ((InternalEList<?>) getExpressions()).basicRemove(otherEnd, msgs);
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
		case Project2Package.ROBOT_MODEL__EVENTS:
			return getEvents();
		case Project2Package.ROBOT_MODEL__ACTIONS:
			return getActions();
		case Project2Package.ROBOT_MODEL__CONDITIONS:
			return getConditions();
		case Project2Package.ROBOT_MODEL__EXPRESSIONS:
			return getExpressions();
		case Project2Package.ROBOT_MODEL__INIT:
			return getInit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Project2Package.ROBOT_MODEL__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case Project2Package.ROBOT_MODEL__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case Project2Package.ROBOT_MODEL__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case Project2Package.ROBOT_MODEL__EXPRESSIONS:
			getExpressions().clear();
			getExpressions().addAll((Collection<? extends Expression>) newValue);
			return;
		case Project2Package.ROBOT_MODEL__INIT:
			setInit((Integer) newValue);
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
		case Project2Package.ROBOT_MODEL__EVENTS:
			getEvents().clear();
			return;
		case Project2Package.ROBOT_MODEL__ACTIONS:
			getActions().clear();
			return;
		case Project2Package.ROBOT_MODEL__CONDITIONS:
			getConditions().clear();
			return;
		case Project2Package.ROBOT_MODEL__EXPRESSIONS:
			getExpressions().clear();
			return;
		case Project2Package.ROBOT_MODEL__INIT:
			setInit(INIT_EDEFAULT);
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
		case Project2Package.ROBOT_MODEL__EVENTS:
			return events != null && !events.isEmpty();
		case Project2Package.ROBOT_MODEL__ACTIONS:
			return actions != null && !actions.isEmpty();
		case Project2Package.ROBOT_MODEL__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case Project2Package.ROBOT_MODEL__EXPRESSIONS:
			return expressions != null && !expressions.isEmpty();
		case Project2Package.ROBOT_MODEL__INIT:
			return init != INIT_EDEFAULT;
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
		result.append(" (init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //RobotModelImpl
