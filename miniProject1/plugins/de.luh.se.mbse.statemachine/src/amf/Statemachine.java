/**
 */
package amf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link amf.Statemachine#getState <em>State</em>}</li>
 *   <li>{@link amf.Statemachine#getInitState <em>Init State</em>}</li>
 *   <li>{@link amf.Statemachine#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see amf.AmfPackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link amf.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see amf.AmfPackage#getStatemachine_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Init State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init State</em>' reference.
	 * @see #setInitState(State)
	 * @see amf.AmfPackage#getStatemachine_InitState()
	 * @model required="true"
	 * @generated
	 */
	State getInitState();

	/**
	 * Sets the value of the '{@link amf.Statemachine#getInitState <em>Init State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init State</em>' reference.
	 * @see #getInitState()
	 * @generated
	 */
	void setInitState(State value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link amf.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see amf.AmfPackage#getStatemachine_Transition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Statemachine
