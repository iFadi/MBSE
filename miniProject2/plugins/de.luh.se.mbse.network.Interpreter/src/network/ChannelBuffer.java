/**
 */
package network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link network.ChannelBuffer#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see network.NetworkPackage#getChannelBuffer()
 * @model
 * @generated
 */
public interface ChannelBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Channel)
	 * @see network.NetworkPackage#getChannelBuffer_Key()
	 * @model
	 * @generated
	 */
	Channel getKey();

	/**
	 * Sets the value of the '{@link network.ChannelBuffer#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Channel value);

} // ChannelBuffer
