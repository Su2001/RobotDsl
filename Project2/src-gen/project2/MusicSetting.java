/**
 */
package project2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.MusicSetting#getNote <em>Note</em>}</li>
 *   <li>{@link project2.MusicSetting#getDuration <em>Duration</em>}</li>
 *   <li>{@link project2.MusicSetting#getPos <em>Pos</em>}</li>
 *   <li>{@link project2.MusicSetting#getNoteEx <em>Note Ex</em>}</li>
 *   <li>{@link project2.MusicSetting#getPosEx <em>Pos Ex</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getMusicSetting()
 * @model
 * @generated
 */
public interface MusicSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(int)
	 * @see project2.Project2Package#getMusicSetting_Note()
	 * @model
	 * @generated
	 */
	int getNote();

	/**
	 * Sets the value of the '{@link project2.MusicSetting#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The literals are from the enumeration {@link project2.Duration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see project2.Duration
	 * @see #setDuration(Duration)
	 * @see project2.Project2Package#getMusicSetting_Duration()
	 * @model
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link project2.MusicSetting#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see project2.Duration
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(int)
	 * @see project2.Project2Package#getMusicSetting_Pos()
	 * @model
	 * @generated
	 */
	int getPos();

	/**
	 * Sets the value of the '{@link project2.MusicSetting#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(int value);

	/**
	 * Returns the value of the '<em><b>Note Ex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Ex</em>' containment reference.
	 * @see #setNoteEx(Expression)
	 * @see project2.Project2Package#getMusicSetting_NoteEx()
	 * @model containment="true"
	 * @generated
	 */
	Expression getNoteEx();

	/**
	 * Sets the value of the '{@link project2.MusicSetting#getNoteEx <em>Note Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Ex</em>' containment reference.
	 * @see #getNoteEx()
	 * @generated
	 */
	void setNoteEx(Expression value);

	/**
	 * Returns the value of the '<em><b>Pos Ex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Ex</em>' containment reference.
	 * @see #setPosEx(Expression)
	 * @see project2.Project2Package#getMusicSetting_PosEx()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPosEx();

	/**
	 * Sets the value of the '{@link project2.MusicSetting#getPosEx <em>Pos Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Ex</em>' containment reference.
	 * @see #getPosEx()
	 * @generated
	 */
	void setPosEx(Expression value);

} // MusicSetting
