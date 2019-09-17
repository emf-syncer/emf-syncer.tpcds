/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Customer;
import tpcds.tpcdsModel.StoreSalesId;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Sales Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesIdImpl#getSsCustomerSk <em>Ss Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesIdImpl#getSsTicketNumber <em>Ss Ticket Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreSalesIdImpl extends MinimalEObjectImpl.Container implements StoreSalesId {
	/**
	 * The cached value of the '{@link #getSsCustomerSk() <em>Ss Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Customer ssCustomerSk;

	/**
	 * The default value of the '{@link #getSsTicketNumber() <em>Ss Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsTicketNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_TICKET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsTicketNumber() <em>Ss Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsTicketNumber()
	 * @generated
	 * @ordered
	 */
	protected Long ssTicketNumber = SS_TICKET_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreSalesIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.STORE_SALES_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getSsCustomerSk() {
		if (ssCustomerSk != null && ssCustomerSk.eIsProxy()) {
			InternalEObject oldSsCustomerSk = (InternalEObject)ssCustomerSk;
			ssCustomerSk = (Customer)eResolveProxy(oldSsCustomerSk);
			if (ssCustomerSk != oldSsCustomerSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_SALES_ID__SS_CUSTOMER_SK, oldSsCustomerSk, ssCustomerSk));
			}
		}
		return ssCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetSsCustomerSk() {
		return ssCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsCustomerSk(Customer newSsCustomerSk) {
		Customer oldSsCustomerSk = ssCustomerSk;
		ssCustomerSk = newSsCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES_ID__SS_CUSTOMER_SK, oldSsCustomerSk, ssCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsTicketNumber() {
		return ssTicketNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsTicketNumber(Long newSsTicketNumber) {
		Long oldSsTicketNumber = ssTicketNumber;
		ssTicketNumber = newSsTicketNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES_ID__SS_TICKET_NUMBER, oldSsTicketNumber, ssTicketNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.STORE_SALES_ID__SS_CUSTOMER_SK:
				if (resolve) return getSsCustomerSk();
				return basicGetSsCustomerSk();
			case TpcdsModelPackage.STORE_SALES_ID__SS_TICKET_NUMBER:
				return getSsTicketNumber();
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
			case TpcdsModelPackage.STORE_SALES_ID__SS_CUSTOMER_SK:
				setSsCustomerSk((Customer)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES_ID__SS_TICKET_NUMBER:
				setSsTicketNumber((Long)newValue);
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
			case TpcdsModelPackage.STORE_SALES_ID__SS_CUSTOMER_SK:
				setSsCustomerSk((Customer)null);
				return;
			case TpcdsModelPackage.STORE_SALES_ID__SS_TICKET_NUMBER:
				setSsTicketNumber(SS_TICKET_NUMBER_EDEFAULT);
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
			case TpcdsModelPackage.STORE_SALES_ID__SS_CUSTOMER_SK:
				return ssCustomerSk != null;
			case TpcdsModelPackage.STORE_SALES_ID__SS_TICKET_NUMBER:
				return SS_TICKET_NUMBER_EDEFAULT == null ? ssTicketNumber != null : !SS_TICKET_NUMBER_EDEFAULT.equals(ssTicketNumber);
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
		result.append(" (ssTicketNumber: ");
		result.append(ssTicketNumber);
		result.append(')');
		return result.toString();
	}

} //StoreSalesIdImpl
