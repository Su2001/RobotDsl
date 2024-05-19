/**
 */
package project2.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import project2.MusicSetting;
import project2.Project2Package;
import project2.SoundAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sound Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project2.impl.SoundActionImpl#getMusicsettings <em>Musicsettings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoundActionImpl extends ActionImpl implements SoundAction {
	/**
	 * The cached value of the '{@link #getMusicsettings() <em>Musicsettings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusicsettings()
	 * @generated
	 * @ordered
	 */
	protected EList<MusicSetting> musicsettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoundActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project2Package.Literals.SOUND_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MusicSetting> getMusicsettings() {
		if (musicsettings == null) {
			musicsettings = new EObjectContainmentEList<MusicSetting>(MusicSetting.class, this,
					Project2Package.SOUND_ACTION__MUSICSETTINGS);
		}
		return musicsettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project2Package.SOUND_ACTION__MUSICSETTINGS:
			return ((InternalEList<?>) getMusicsettings()).basicRemove(otherEnd, msgs);
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
		case Project2Package.SOUND_ACTION__MUSICSETTINGS:
			return getMusicsettings();
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
		case Project2Package.SOUND_ACTION__MUSICSETTINGS:
			getMusicsettings().clear();
			getMusicsettings().addAll((Collection<? extends MusicSetting>) newValue);
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
		case Project2Package.SOUND_ACTION__MUSICSETTINGS:
			getMusicsettings().clear();
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
		case Project2Package.SOUND_ACTION__MUSICSETTINGS:
			return musicsettings != null && !musicsettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoundActionImpl
