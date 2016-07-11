/**
 */
package network.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import network.ChannelBuffer;
import network.CurrentStateMapState;
import network.Network;
import network.NetworkPackage;
import network.RunTimeNetwork;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Time Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link network.impl.RunTimeNetworkImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link network.impl.RunTimeNetworkImpl#getCurrentstatemapstate <em>Currentstatemapstate</em>}</li>
 *   <li>{@link network.impl.RunTimeNetworkImpl#getChannelbuffer <em>Channelbuffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunTimeNetworkImpl extends MinimalEObjectImpl.Container implements RunTimeNetwork {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The cached value of the '{@link #getCurrentstatemapstate() <em>Currentstatemapstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentstatemapstate()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrentStateMapState> currentstatemapstate;

	/**
	 * The cached value of the '{@link #getChannelbuffer() <em>Channelbuffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelbuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelBuffer> channelbuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunTimeNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.RUN_TIME_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.RUN_TIME_NETWORK__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.RUN_TIME_NETWORK__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrentStateMapState> getCurrentstatemapstate() {
		if (currentstatemapstate == null) {
			currentstatemapstate = new EObjectContainmentEList<CurrentStateMapState>(CurrentStateMapState.class, this, NetworkPackage.RUN_TIME_NETWORK__CURRENTSTATEMAPSTATE);
		}
		return currentstatemapstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelBuffer> getChannelbuffer() {
		if (channelbuffer == null) {
			channelbuffer = new EObjectContainmentEList<ChannelBuffer>(ChannelBuffer.class, this, NetworkPackage.RUN_TIME_NETWORK__CHANNELBUFFER);
		}
		return channelbuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeStep() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.RUN_TIME_NETWORK__CURRENTSTATEMAPSTATE:
				return ((InternalEList<?>)getCurrentstatemapstate()).basicRemove(otherEnd, msgs);
			case NetworkPackage.RUN_TIME_NETWORK__CHANNELBUFFER:
				return ((InternalEList<?>)getChannelbuffer()).basicRemove(otherEnd, msgs);
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
			case NetworkPackage.RUN_TIME_NETWORK__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case NetworkPackage.RUN_TIME_NETWORK__CURRENTSTATEMAPSTATE:
				return getCurrentstatemapstate();
			case NetworkPackage.RUN_TIME_NETWORK__CHANNELBUFFER:
				return getChannelbuffer();
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
			case NetworkPackage.RUN_TIME_NETWORK__NETWORK:
				setNetwork((Network)newValue);
				return;
			case NetworkPackage.RUN_TIME_NETWORK__CURRENTSTATEMAPSTATE:
				getCurrentstatemapstate().clear();
				getCurrentstatemapstate().addAll((Collection<? extends CurrentStateMapState>)newValue);
				return;
			case NetworkPackage.RUN_TIME_NETWORK__CHANNELBUFFER:
				getChannelbuffer().clear();
				getChannelbuffer().addAll((Collection<? extends ChannelBuffer>)newValue);
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
			case NetworkPackage.RUN_TIME_NETWORK__NETWORK:
				setNetwork((Network)null);
				return;
			case NetworkPackage.RUN_TIME_NETWORK__CURRENTSTATEMAPSTATE:
				getCurrentstatemapstate().clear();
				return;
			case NetworkPackage.RUN_TIME_NETWORK__CHANNELBUFFER:
				getChannelbuffer().clear();
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
			case NetworkPackage.RUN_TIME_NETWORK__NETWORK:
				return network != null;
			case NetworkPackage.RUN_TIME_NETWORK__CURRENTSTATEMAPSTATE:
				return currentstatemapstate != null && !currentstatemapstate.isEmpty();
			case NetworkPackage.RUN_TIME_NETWORK__CHANNELBUFFER:
				return channelbuffer != null && !channelbuffer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NetworkPackage.RUN_TIME_NETWORK___INITIALIZE:
				initialize();
				return null;
			case NetworkPackage.RUN_TIME_NETWORK___MAKE_STEP:
				makeStep();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RunTimeNetworkImpl
