/**
 */
package project2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sound Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.SoundAction#getMusicsettings <em>Musicsettings</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getSoundAction()
 * @model
 * @generated
 */
public interface SoundAction extends Action {

	/**
	 * Returns the value of the '<em><b>Musicsettings</b></em>' containment reference list.
	 * The list contents are of type {@link project2.MusicSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musicsettings</em>' containment reference list.
	 * @see project2.Project2Package#getSoundAction_Musicsettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MusicSetting> getMusicsettings();
} // SoundAction
