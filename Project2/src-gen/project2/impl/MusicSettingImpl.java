/**
 */
package project2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import project2.Duration;
import project2.Expression;
import project2.MusicSetting;
import project2.Project2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project2.impl.MusicSettingImpl#getNote <em>Note</em>}</li>
 *   <li>{@link project2.impl.MusicSettingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link project2.impl.MusicSettingImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link project2.impl.MusicSettingImpl#getNoteEx <em>Note Ex</em>}</li>
 *   <li>{@link project2.impl.MusicSettingImpl#getPosEx <em>Pos Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusicSettingImpl extends MinimalEObjectImpl.Container implements MusicSetting {
	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final int NOTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected int note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = Duration.NONE;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected int pos = POS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoteEx() <em>Note Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteEx()
	 * @generated
	 * @ordered
	 */
	protected Expression noteEx;

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
	protected MusicSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project2Package.Literals.MUSIC_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(int newNote) {
		int oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MUSIC_SETTING__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration == null ? DURATION_EDEFAULT : newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MUSIC_SETTING__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPos(int newPos) {
		int oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MUSIC_SETTING__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getNoteEx() {
		return noteEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteEx(Expression newNoteEx, NotificationChain msgs) {
		Expression oldNoteEx = noteEx;
		noteEx = newNoteEx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project2Package.MUSIC_SETTING__NOTE_EX, oldNoteEx, newNoteEx);
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
	public void setNoteEx(Expression newNoteEx) {
		if (newNoteEx != noteEx) {
			NotificationChain msgs = null;
			if (noteEx != null)
				msgs = ((InternalEObject) noteEx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MUSIC_SETTING__NOTE_EX, null, msgs);
			if (newNoteEx != null)
				msgs = ((InternalEObject) newNoteEx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MUSIC_SETTING__NOTE_EX, null, msgs);
			msgs = basicSetNoteEx(newNoteEx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MUSIC_SETTING__NOTE_EX, newNoteEx,
					newNoteEx));
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
					Project2Package.MUSIC_SETTING__POS_EX, oldPosEx, newPosEx);
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
						EOPPOSITE_FEATURE_BASE - Project2Package.MUSIC_SETTING__POS_EX, null, msgs);
			if (newPosEx != null)
				msgs = ((InternalEObject) newPosEx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Project2Package.MUSIC_SETTING__POS_EX, null, msgs);
			msgs = basicSetPosEx(newPosEx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project2Package.MUSIC_SETTING__POS_EX, newPosEx,
					newPosEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project2Package.MUSIC_SETTING__NOTE_EX:
			return basicSetNoteEx(null, msgs);
		case Project2Package.MUSIC_SETTING__POS_EX:
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
		case Project2Package.MUSIC_SETTING__NOTE:
			return getNote();
		case Project2Package.MUSIC_SETTING__DURATION:
			return getDuration();
		case Project2Package.MUSIC_SETTING__POS:
			return getPos();
		case Project2Package.MUSIC_SETTING__NOTE_EX:
			return getNoteEx();
		case Project2Package.MUSIC_SETTING__POS_EX:
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
		case Project2Package.MUSIC_SETTING__NOTE:
			setNote((Integer) newValue);
			return;
		case Project2Package.MUSIC_SETTING__DURATION:
			setDuration((Duration) newValue);
			return;
		case Project2Package.MUSIC_SETTING__POS:
			setPos((Integer) newValue);
			return;
		case Project2Package.MUSIC_SETTING__NOTE_EX:
			setNoteEx((Expression) newValue);
			return;
		case Project2Package.MUSIC_SETTING__POS_EX:
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
		case Project2Package.MUSIC_SETTING__NOTE:
			setNote(NOTE_EDEFAULT);
			return;
		case Project2Package.MUSIC_SETTING__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case Project2Package.MUSIC_SETTING__POS:
			setPos(POS_EDEFAULT);
			return;
		case Project2Package.MUSIC_SETTING__NOTE_EX:
			setNoteEx((Expression) null);
			return;
		case Project2Package.MUSIC_SETTING__POS_EX:
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
		case Project2Package.MUSIC_SETTING__NOTE:
			return note != NOTE_EDEFAULT;
		case Project2Package.MUSIC_SETTING__DURATION:
			return duration != DURATION_EDEFAULT;
		case Project2Package.MUSIC_SETTING__POS:
			return pos != POS_EDEFAULT;
		case Project2Package.MUSIC_SETTING__NOTE_EX:
			return noteEx != null;
		case Project2Package.MUSIC_SETTING__POS_EX:
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
		result.append(" (note: ");
		result.append(note);
		result.append(", duration: ");
		result.append(duration);
		result.append(", pos: ");
		result.append(pos);
		result.append(')');
		return result.toString();
	}

} //MusicSettingImpl
