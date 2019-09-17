/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.StoreReturnsId;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Returns Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsIdImpl#getSrItemSk <em>Sr Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsIdImpl#getSrTicketNumber <em>Sr Ticket Number</em>}</li>
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
		return TpcdsModelPackage.Literals.STORE_RETURNS_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrItemSk() {
		return srItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrItemSk(Long newSrItemSk) {
		Long oldSrItemSk = srItemSk;
		srItemSk = newSrItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS_ID__SR_ITEM_SK, oldSrItemSk, srItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrTicketNumber() {
		return srTicketNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrTicketNumber(Long newSrTicketNumber) {
		Long oldSrTicketNumber = srTicketNumber;
		srTicketNumber = newSrTicketNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS_ID__SR_TICKET_NUMBER, oldSrTicketNumber, srTicketNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_ITEM_SK:
				return getSrItemSk();
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_TICKET_NUMBER:
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
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_ITEM_SK:
				setSrItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_TICKET_NUMBER:
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
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_ITEM_SK:
				setSrItemSk(SR_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_TICKET_NUMBER:
				setSrTicketNumber(SR_TICKET_NUMBER_EDEFAULT);
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
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_ITEM_SK:
				return SR_ITEM_SK_EDEFAULT == null ? srItemSk != null : !SR_ITEM_SK_EDEFAULT.equals(srItemSk);
			case TpcdsModelPackage.STORE_RETURNS_ID__SR_TICKET_NUMBER:
				return SR_TICKET_NUMBER_EDEFAULT == null ? srTicketNumber != null : !SR_TICKET_NUMBER_EDEFAULT.equals(srTicketNumber);
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
		result.append(srItemSk);
		result.append(", srTicketNumber: ");
		result.append(srTicketNumber);
		result.append(')');
		return result.toString();
	}

} //StoreReturnsIdImpl
