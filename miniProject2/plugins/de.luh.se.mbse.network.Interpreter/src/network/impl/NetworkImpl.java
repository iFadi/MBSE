/**
 */
package network.impl;

import java.util.Collection;

import network.Channel;
import network.Network;
import network.NetworkPackage;
import network.Statemachine;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link network.impl.NetworkImpl#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link network.impl.NetworkImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends AbstractElementImpl implements Network {
	/**
	 * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachine()
	 * @generated
	 * @ordered
	 */
	protected EList<Statemachine> statemachine;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statemachine> getStatemachine() {
		if (statemachine == null) {
			statemachine = new EObjectContainmentEList<Statemachine>(Statemachine.class, this, NetworkPackage.NETWORK__STATEMACHINE);
		}
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannel() {
		if (channel == null) {
			channel = new EObjectContainmentEList<Channel>(Channel.class, this, NetworkPackage.NETWORK__CHANNEL);
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.NETWORK__STATEMACHINE:
				return ((InternalEList<?>)getStatemachine()).basicRemove(otherEnd, msgs);
			case NetworkPackage.NETWORK__CHANNEL:
				return ((InternalEList<?>)getChannel()).basicRemove(otherEnd, msgs);
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
			case NetworkPackage.NETWORK__STATEMACHINE:
				return getStatemachine();
			case NetworkPackage.NETWORK__CHANNEL:
				return getChannel();
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
			case NetworkPackage.NETWORK__STATEMACHINE:
				getStatemachine().clear();
				getStatemachine().addAll((Collection<? extends Statemachine>)newValue);
				return;
			case NetworkPackage.NETWORK__CHANNEL:
				getChannel().clear();
				getChannel().addAll((Collection<? extends Channel>)newValue);
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
			case NetworkPackage.NETWORK__STATEMACHINE:
				getStatemachine().clear();
				return;
			case NetworkPackage.NETWORK__CHANNEL:
				getChannel().clear();
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
			case NetworkPackage.NETWORK__STATEMACHINE:
				return statemachine != null && !statemachine.isEmpty();
			case NetworkPackage.NETWORK__CHANNEL:
				return channel != null && !channel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkImpl
