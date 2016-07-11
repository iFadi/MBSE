/**
 */
package network;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link network.Channel#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see network.NetworkPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link network.TypeOfChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see network.TypeOfChannel
	 * @see #setType(TypeOfChannel)
	 * @see network.NetworkPackage#getChannel_Type()
	 * @model
	 * @generated
	 */
	TypeOfChannel getType();

	/**
	 * Sets the value of the '{@link network.Channel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see network.TypeOfChannel
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfChannel value);

} // Channel
