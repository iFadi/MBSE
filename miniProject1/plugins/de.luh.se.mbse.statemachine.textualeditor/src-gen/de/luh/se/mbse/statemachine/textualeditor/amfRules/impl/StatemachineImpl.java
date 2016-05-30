/**
 * generated by Xtext 2.9.2
 */
package de.luh.se.mbse.statemachine.textualeditor.amfRules.impl;

import de.luh.se.mbse.statemachine.textualeditor.amfRules.AmfRulesPackage;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.State;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.Statemachine;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.Transition;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.luh.se.mbse.statemachine.textualeditor.amfRules.impl.StatemachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.luh.se.mbse.statemachine.textualeditor.amfRules.impl.StatemachineImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link de.luh.se.mbse.statemachine.textualeditor.amfRules.impl.StatemachineImpl#getState <em>State</em>}</li>
 *   <li>{@link de.luh.se.mbse.statemachine.textualeditor.amfRules.impl.StatemachineImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialstate()
   * @generated
   * @ordered
   */
  protected State initialstate;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<State> state;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AmfRulesPackage.Literals.STATEMACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmfRulesPackage.STATEMACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitialstate()
  {
    if (initialstate != null && initialstate.eIsProxy())
    {
      InternalEObject oldInitialstate = (InternalEObject)initialstate;
      initialstate = (State)eResolveProxy(oldInitialstate);
      if (initialstate != oldInitialstate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmfRulesPackage.STATEMACHINE__INITIALSTATE, oldInitialstate, initialstate));
      }
    }
    return initialstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitialstate()
  {
    return initialstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialstate(State newInitialstate)
  {
    State oldInitialstate = initialstate;
    initialstate = newInitialstate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmfRulesPackage.STATEMACHINE__INITIALSTATE, oldInitialstate, initialstate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getState()
  {
    if (state == null)
    {
      state = new EObjectContainmentEList<State>(State.class, this, AmfRulesPackage.STATEMACHINE__STATE);
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransition()
  {
    if (transition == null)
    {
      transition = new EObjectContainmentEList<Transition>(Transition.class, this, AmfRulesPackage.STATEMACHINE__TRANSITION);
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AmfRulesPackage.STATEMACHINE__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
      case AmfRulesPackage.STATEMACHINE__TRANSITION:
        return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AmfRulesPackage.STATEMACHINE__NAME:
        return getName();
      case AmfRulesPackage.STATEMACHINE__INITIALSTATE:
        if (resolve) return getInitialstate();
        return basicGetInitialstate();
      case AmfRulesPackage.STATEMACHINE__STATE:
        return getState();
      case AmfRulesPackage.STATEMACHINE__TRANSITION:
        return getTransition();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AmfRulesPackage.STATEMACHINE__NAME:
        setName((String)newValue);
        return;
      case AmfRulesPackage.STATEMACHINE__INITIALSTATE:
        setInitialstate((State)newValue);
        return;
      case AmfRulesPackage.STATEMACHINE__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>)newValue);
        return;
      case AmfRulesPackage.STATEMACHINE__TRANSITION:
        getTransition().clear();
        getTransition().addAll((Collection<? extends Transition>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AmfRulesPackage.STATEMACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AmfRulesPackage.STATEMACHINE__INITIALSTATE:
        setInitialstate((State)null);
        return;
      case AmfRulesPackage.STATEMACHINE__STATE:
        getState().clear();
        return;
      case AmfRulesPackage.STATEMACHINE__TRANSITION:
        getTransition().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AmfRulesPackage.STATEMACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AmfRulesPackage.STATEMACHINE__INITIALSTATE:
        return initialstate != null;
      case AmfRulesPackage.STATEMACHINE__STATE:
        return state != null && !state.isEmpty();
      case AmfRulesPackage.STATEMACHINE__TRANSITION:
        return transition != null && !transition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatemachineImpl
