/**
 */
package project2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project2.Action#getActionname <em>Actionname</em>}</li>
 * </ul>
 *
 * @see project2.Project2Package#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {

	/**
	 * Returns the value of the '<em><b>Actionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionname</em>' attribute.
	 * @see #setActionname(String)
	 * @see project2.Project2Package#getAction_Actionname()
	 * @model
	 * @generated
	 */
	String getActionname();

	/**
	 * Sets the value of the '{@link project2.Action#getActionname <em>Actionname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionname</em>' attribute.
	 * @see #getActionname()
	 * @generated
	 */
	void setActionname(String value);
} // Action
