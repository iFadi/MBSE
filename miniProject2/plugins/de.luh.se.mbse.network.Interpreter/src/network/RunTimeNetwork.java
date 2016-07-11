/**
 */
package network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Time Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link network.RunTimeNetwork#getNetwork <em>Network</em>}</li>
 *   <li>{@link network.RunTimeNetwork#getCurrentstatemapstate <em>Currentstatemapstate</em>}</li>
 *   <li>{@link network.RunTimeNetwork#getChannelbuffer <em>Channelbuffer</em>}</li>
 * </ul>
 *
 * @see network.NetworkPackage#getRunTimeNetwork()
 * @model
 * @generated
 */
public interface RunTimeNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see network.NetworkPackage#getRunTimeNetwork_Network()
	 * @model
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link network.RunTimeNetwork#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Currentstatemapstate</b></em>' containment reference list.
	 * The list contents are of type {@link network.CurrentStateMapState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentstatemapstate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentstatemapstate</em>' containment reference list.
	 * @see network.NetworkPackage#getRunTimeNetwork_Currentstatemapstate()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurrentStateMapState> getCurrentstatemapstate();

	/**
	 * Returns the value of the '<em><b>Channelbuffer</b></em>' containment reference list.
	 * The list contents are of type {@link network.ChannelBuffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channelbuffer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channelbuffer</em>' containment reference list.
	 * @see network.NetworkPackage#getRunTimeNetwork_Channelbuffer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelBuffer> getChannelbuffer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void makeStep();

} // RunTimeNetwork
