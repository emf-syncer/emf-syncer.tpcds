/**
 */
package tpcds.gen.q1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.gen.q1.Q1Package;
import tpcds.gen.q1.StoreReturnsId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Returns Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsIdImpl#getSrItemSk <em>Sr Item Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsIdImpl#getSrTicketNumber <em>Sr Ticket Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreReturnsIdImpl extends MinimalEObjectImpl.Container implements StoreReturnsId {
	/**
	 * The default value of the '{@link #getSrItemSk() <em>Sr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrItemSk() <em>Sr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long srItemSk = SR_ITEM_SK_EDEFAULT;

	/**
	 * This is true if the Sr Item Sk attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srItemSkESet;

	/**
	 * The default value of the '{@link #getSrTicketNumber() <em>Sr Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrTicketNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_TICKET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrTicketNumber() <em>Sr Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrTicketNumber()
	 * @generated
	 * @ordered
	 */
	protected Long srTicketNumber = SR_TICKET_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sr Ticket Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srTicketNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreReturnsIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Q1Package.Literals.STORE_RETURNS_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSrItemSk() {
		return srItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrItemSk(Long newSrItemSk) {
		Long oldSrItemSk = srItemSk;
		srItemSk = newSrItemSk;
		boolean oldSrItemSkESet = srItemSkESet;
		srItemSkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS_ID__SR_ITEM_SK, oldSrItemSk, srItemSk, !oldSrItemSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrItemSk() {
		Long oldSrItemSk = srItemSk;
		boolean oldSrItemSkESet = srItemSkESet;
		srItemSk = SR_ITEM_SK_EDEFAULT;
		srItemSkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS_ID__SR_ITEM_SK, oldSrItemSk, SR_ITEM_SK_EDEFAULT, oldSrItemSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrItemSk() {
		return srItemSkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSrTicketNumber() {
		return srTicketNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrTicketNumber(Long newSrTicketNumber) {
		Long oldSrTicketNumber = srTicketNumber;
		srTicketNumber = newSrTicketNumber;
		boolean oldSrTicketNumberESet = srTicketNumberESet;
		srTicketNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS_ID__SR_TICKET_NUMBER, oldSrTicketNumber, srTicketNumber, !oldSrTicketNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrTicketNumber() {
		Long oldSrTicketNumber = srTicketNumber;
		boolean oldSrTicketNumberESet = srTicketNumberESet;
		srTicketNumber = SR_TICKET_NUMBER_EDEFAULT;
		srTicketNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS_ID__SR_TICKET_NUMBER, oldSrTicketNumber, SR_TICKET_NUMBER_EDEFAULT, oldSrTicketNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrTicketNumber() {
		return srTicketNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Q1Package.STORE_RETURNS_ID__SR_ITEM_SK:
				return getSrItemSk();
			case Q1Package.STORE_RETURNS_ID__SR_TICKET_NUMBER:
				return getSrTicketNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Q1Package.STORE_RETURNS_ID__SR_ITEM_SK:
				setSrItemSk((Long)newValue);
				return;
			case Q1Package.STORE_RETURNS_ID__SR_TICKET_NUMBER:
				setSrTicketNumber((Long)newValue);
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
			case Q1Package.STORE_RETURNS_ID__SR_ITEM_SK:
				unsetSrItemSk();
				return;
			case Q1Package.STORE_RETURNS_ID__SR_TICKET_NUMBER:
				unsetSrTicketNumber();
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
			case Q1Package.STORE_RETURNS_ID__SR_ITEM_SK:
				return isSetSrItemSk();
			case Q1Package.STORE_RETURNS_ID__SR_TICKET_NUMBER:
				return isSetSrTicketNumber();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (srItemSk: ");
		if (srItemSkESet) result.append(srItemSk); else result.append("<unset>");
		result.append(", srTicketNumber: ");
		if (srTicketNumberESet) result.append(srTicketNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StoreReturnsIdImpl
