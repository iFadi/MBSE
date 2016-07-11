/**
 */
package network;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link network.Network#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link network.Network#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @see network.NetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' containment reference list.
	 * The list contents are of type {@link network.Statemachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statemachine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' containment reference list.
	 * @see network.NetworkPackage#getNetwork_Statemachine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statemachine> getStatemachine();

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link network.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see network.NetworkPackage#getNetwork_Channel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Channel> getChannel();

} // Network
