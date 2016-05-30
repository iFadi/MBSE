/**
 */
package amf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link amf.Channel#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see amf.AmfPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Synchronous"</code>.
	 * The literals are from the enumeration {@link amf.TypeOfChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see amf.TypeOfChannel
	 * @see #setType(TypeOfChannel)
	 * @see amf.AmfPackage#getChannel_Type()
	 * @model default="Synchronous"
	 * @generated
	 */
	TypeOfChannel getType();

	/**
	 * Sets the value of the '{@link amf.Channel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see amf.TypeOfChannel
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfChannel value);

} // Channel
