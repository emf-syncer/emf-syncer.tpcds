/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Customer;
import tpcds.tpcdsModel.DateDim;
import tpcds.tpcdsModel.Store;
import tpcds.tpcdsModel.StoreReturns;
import tpcds.tpcdsModel.StoreReturnsId;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Returns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnTimeSk <em>Sr Return Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrId <em>Sr Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrItemSk <em>Sr Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrTicketNumber <em>Sr Ticket Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrCustomerSk <em>Sr Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrCdemoSk <em>Sr Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrHdemoSk <em>Sr Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrAddrSk <em>Sr Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrStoreSk <em>Sr Store Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReasonSk <em>Sr Reason Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnQuantity <em>Sr Return Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnAmt <em>Sr Return Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnTax <em>Sr Return Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnAmtIncTax <em>Sr Return Amt Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrFee <em>Sr Fee</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReturnShipCost <em>Sr Return Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrRefundedCash <em>Sr Refunded Cash</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrReversedCharge <em>Sr Reversed Charge</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrStoreCredit <em>Sr Store Credit</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreReturnsImpl#getSrNetLoss <em>Sr Net Loss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreReturnsImpl extends MinimalEObjectImpl.Container implements StoreReturns {
	/**
	 * The cached value of the '{@link #getSrReturnedDateSk() <em>Sr Returned Date Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnedDateSk()
	 * @generated
	 * @ordered
	 */
	protected DateDim srReturnedDateSk;

	/**
	 * The default value of the '{@link #getSrReturnTimeSk() <em>Sr Return Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_RETURN_TIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrReturnTimeSk() <em>Sr Return Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long srReturnTimeSk = SR_RETURN_TIME_SK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrId() <em>Sr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrId()
	 * @generated
	 * @ordered
	 */
	protected StoreReturnsId srId;

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
	 * The cached value of the '{@link #getSrCustomerSk() <em>Sr Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Customer srCustomerSk;

	/**
	 * The default value of the '{@link #getSrCdemoSk() <em>Sr Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrCdemoSk() <em>Sr Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long srCdemoSk = SR_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrHdemoSk() <em>Sr Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrHdemoSk() <em>Sr Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long srHdemoSk = SR_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrAddrSk() <em>Sr Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrAddrSk() <em>Sr Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long srAddrSk = SR_ADDR_SK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrStoreSk() <em>Sr Store Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrStoreSk()
	 * @generated
	 * @ordered
	 */
	protected Store srStoreSk;

	/**
	 * The default value of the '{@link #getSrReasonSk() <em>Sr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReasonSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_REASON_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrReasonSk() <em>Sr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReasonSk()
	 * @generated
	 * @ordered
	 */
	protected Long srReasonSk = SR_REASON_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrReturnQuantity() <em>Sr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long SR_RETURN_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrReturnQuantity() <em>Sr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long srReturnQuantity = SR_RETURN_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrReturnAmt() <em>Sr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnAmt()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_RETURN_AMT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrReturnAmt() <em>Sr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnAmt()
	 * @generated
	 * @ordered
	 */
	protected double srReturnAmt = SR_RETURN_AMT_EDEFAULT;

	/**
	 * This is true if the Sr Return Amt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srReturnAmtESet;

	/**
	 * The default value of the '{@link #getSrReturnTax() <em>Sr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnTax()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_RETURN_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrReturnTax() <em>Sr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnTax()
	 * @generated
	 * @ordered
	 */
	protected double srReturnTax = SR_RETURN_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrReturnAmtIncTax() <em>Sr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnAmtIncTax()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_RETURN_AMT_INC_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrReturnAmtIncTax() <em>Sr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnAmtIncTax()
	 * @generated
	 * @ordered
	 */
	protected double srReturnAmtIncTax = SR_RETURN_AMT_INC_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrFee() <em>Sr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrFee()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_FEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrFee() <em>Sr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrFee()
	 * @generated
	 * @ordered
	 */
	protected double srFee = SR_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrReturnShipCost() <em>Sr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnShipCost()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_RETURN_SHIP_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrReturnShipCost() <em>Sr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReturnShipCost()
	 * @generated
	 * @ordered
	 */
	protected double srReturnShipCost = SR_RETURN_SHIP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrRefundedCash() <em>Sr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRefundedCash()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_REFUNDED_CASH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrRefundedCash() <em>Sr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrRefundedCash()
	 * @generated
	 * @ordered
	 */
	protected double srRefundedCash = SR_REFUNDED_CASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrReversedCharge() <em>Sr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReversedCharge()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_REVERSED_CHARGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrReversedCharge() <em>Sr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrReversedCharge()
	 * @generated
	 * @ordered
	 */
	protected double srReversedCharge = SR_REVERSED_CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrStoreCredit() <em>Sr Store Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrStoreCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_STORE_CREDIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrStoreCredit() <em>Sr Store Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrStoreCredit()
	 * @generated
	 * @ordered
	 */
	protected double srStoreCredit = SR_STORE_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrNetLoss() <em>Sr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrNetLoss()
	 * @generated
	 * @ordered
	 */
	protected static final double SR_NET_LOSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrNetLoss() <em>Sr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrNetLoss()
	 * @generated
	 * @ordered
	 */
	protected double srNetLoss = SR_NET_LOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreReturnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.STORE_RETURNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateDim getSrReturnedDateSk() {
		if (srReturnedDateSk != null && srReturnedDateSk.eIsProxy()) {
			InternalEObject oldSrReturnedDateSk = (InternalEObject)srReturnedDateSk;
			srReturnedDateSk = (DateDim)eResolveProxy(oldSrReturnedDateSk);
			if (srReturnedDateSk != oldSrReturnedDateSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_RETURNS__SR_RETURNED_DATE_SK, oldSrReturnedDateSk, srReturnedDateSk));
			}
		}
		return srReturnedDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDim basicGetSrReturnedDateSk() {
		return srReturnedDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnedDateSk(DateDim newSrReturnedDateSk) {
		DateDim oldSrReturnedDateSk = srReturnedDateSk;
		srReturnedDateSk = newSrReturnedDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURNED_DATE_SK, oldSrReturnedDateSk, srReturnedDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrReturnTimeSk() {
		return srReturnTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnTimeSk(Long newSrReturnTimeSk) {
		Long oldSrReturnTimeSk = srReturnTimeSk;
		srReturnTimeSk = newSrReturnTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TIME_SK, oldSrReturnTimeSk, srReturnTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreReturnsId getSrId() {
		if (srId != null && srId.eIsProxy()) {
			InternalEObject oldSrId = (InternalEObject)srId;
			srId = (StoreReturnsId)eResolveProxy(oldSrId);
			if (srId != oldSrId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_RETURNS__SR_ID, oldSrId, srId));
			}
		}
		return srId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreReturnsId basicGetSrId() {
		return srId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrId(StoreReturnsId newSrId) {
		StoreReturnsId oldSrId = srId;
		srId = newSrId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_ID, oldSrId, srId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_ITEM_SK, oldSrItemSk, srItemSk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_TICKET_NUMBER, oldSrTicketNumber, srTicketNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getSrCustomerSk() {
		if (srCustomerSk != null && srCustomerSk.eIsProxy()) {
			InternalEObject oldSrCustomerSk = (InternalEObject)srCustomerSk;
			srCustomerSk = (Customer)eResolveProxy(oldSrCustomerSk);
			if (srCustomerSk != oldSrCustomerSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK, oldSrCustomerSk, srCustomerSk));
			}
		}
		return srCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetSrCustomerSk() {
		return srCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrCustomerSk(Customer newSrCustomerSk, NotificationChain msgs) {
		Customer oldSrCustomerSk = srCustomerSk;
		srCustomerSk = newSrCustomerSk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK, oldSrCustomerSk, newSrCustomerSk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrCustomerSk(Customer newSrCustomerSk) {
		if (newSrCustomerSk != srCustomerSk) {
			NotificationChain msgs = null;
			if (srCustomerSk != null)
				msgs = ((InternalEObject)srCustomerSk).eInverseRemove(this, TpcdsModelPackage.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
			if (newSrCustomerSk != null)
				msgs = ((InternalEObject)newSrCustomerSk).eInverseAdd(this, TpcdsModelPackage.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
			msgs = basicSetSrCustomerSk(newSrCustomerSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK, newSrCustomerSk, newSrCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrCdemoSk() {
		return srCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrCdemoSk(Long newSrCdemoSk) {
		Long oldSrCdemoSk = srCdemoSk;
		srCdemoSk = newSrCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_CDEMO_SK, oldSrCdemoSk, srCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrHdemoSk() {
		return srHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrHdemoSk(Long newSrHdemoSk) {
		Long oldSrHdemoSk = srHdemoSk;
		srHdemoSk = newSrHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_HDEMO_SK, oldSrHdemoSk, srHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrAddrSk() {
		return srAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrAddrSk(Long newSrAddrSk) {
		Long oldSrAddrSk = srAddrSk;
		srAddrSk = newSrAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_ADDR_SK, oldSrAddrSk, srAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store getSrStoreSk() {
		if (srStoreSk != null && srStoreSk.eIsProxy()) {
			InternalEObject oldSrStoreSk = (InternalEObject)srStoreSk;
			srStoreSk = (Store)eResolveProxy(oldSrStoreSk);
			if (srStoreSk != oldSrStoreSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK, oldSrStoreSk, srStoreSk));
			}
		}
		return srStoreSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store basicGetSrStoreSk() {
		return srStoreSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrStoreSk(Store newSrStoreSk, NotificationChain msgs) {
		Store oldSrStoreSk = srStoreSk;
		srStoreSk = newSrStoreSk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK, oldSrStoreSk, newSrStoreSk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrStoreSk(Store newSrStoreSk) {
		if (newSrStoreSk != srStoreSk) {
			NotificationChain msgs = null;
			if (srStoreSk != null)
				msgs = ((InternalEObject)srStoreSk).eInverseRemove(this, TpcdsModelPackage.STORE__STORE_RETURNS, Store.class, msgs);
			if (newSrStoreSk != null)
				msgs = ((InternalEObject)newSrStoreSk).eInverseAdd(this, TpcdsModelPackage.STORE__STORE_RETURNS, Store.class, msgs);
			msgs = basicSetSrStoreSk(newSrStoreSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK, newSrStoreSk, newSrStoreSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrReasonSk() {
		return srReasonSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReasonSk(Long newSrReasonSk) {
		Long oldSrReasonSk = srReasonSk;
		srReasonSk = newSrReasonSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_REASON_SK, oldSrReasonSk, srReasonSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSrReturnQuantity() {
		return srReturnQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnQuantity(Long newSrReturnQuantity) {
		Long oldSrReturnQuantity = srReturnQuantity;
		srReturnQuantity = newSrReturnQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_QUANTITY, oldSrReturnQuantity, srReturnQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrReturnAmt() {
		return srReturnAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnAmt(double newSrReturnAmt) {
		double oldSrReturnAmt = srReturnAmt;
		srReturnAmt = newSrReturnAmt;
		boolean oldSrReturnAmtESet = srReturnAmtESet;
		srReturnAmtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT, oldSrReturnAmt, srReturnAmt, !oldSrReturnAmtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSrReturnAmt() {
		double oldSrReturnAmt = srReturnAmt;
		boolean oldSrReturnAmtESet = srReturnAmtESet;
		srReturnAmt = SR_RETURN_AMT_EDEFAULT;
		srReturnAmtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT, oldSrReturnAmt, SR_RETURN_AMT_EDEFAULT, oldSrReturnAmtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSrReturnAmt() {
		return srReturnAmtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrReturnTax() {
		return srReturnTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnTax(double newSrReturnTax) {
		double oldSrReturnTax = srReturnTax;
		srReturnTax = newSrReturnTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TAX, oldSrReturnTax, srReturnTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrReturnAmtIncTax() {
		return srReturnAmtIncTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnAmtIncTax(double newSrReturnAmtIncTax) {
		double oldSrReturnAmtIncTax = srReturnAmtIncTax;
		srReturnAmtIncTax = newSrReturnAmtIncTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT_INC_TAX, oldSrReturnAmtIncTax, srReturnAmtIncTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrFee() {
		return srFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrFee(double newSrFee) {
		double oldSrFee = srFee;
		srFee = newSrFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_FEE, oldSrFee, srFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrReturnShipCost() {
		return srReturnShipCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReturnShipCost(double newSrReturnShipCost) {
		double oldSrReturnShipCost = srReturnShipCost;
		srReturnShipCost = newSrReturnShipCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_RETURN_SHIP_COST, oldSrReturnShipCost, srReturnShipCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrRefundedCash() {
		return srRefundedCash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrRefundedCash(double newSrRefundedCash) {
		double oldSrRefundedCash = srRefundedCash;
		srRefundedCash = newSrRefundedCash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_REFUNDED_CASH, oldSrRefundedCash, srRefundedCash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrReversedCharge() {
		return srReversedCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrReversedCharge(double newSrReversedCharge) {
		double oldSrReversedCharge = srReversedCharge;
		srReversedCharge = newSrReversedCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_REVERSED_CHARGE, oldSrReversedCharge, srReversedCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrStoreCredit() {
		return srStoreCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrStoreCredit(double newSrStoreCredit) {
		double oldSrStoreCredit = srStoreCredit;
		srStoreCredit = newSrStoreCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_STORE_CREDIT, oldSrStoreCredit, srStoreCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrNetLoss() {
		return srNetLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrNetLoss(double newSrNetLoss) {
		double oldSrNetLoss = srNetLoss;
		srNetLoss = newSrNetLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_RETURNS__SR_NET_LOSS, oldSrNetLoss, srNetLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK:
				if (srCustomerSk != null)
					msgs = ((InternalEObject)srCustomerSk).eInverseRemove(this, TpcdsModelPackage.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
				return basicSetSrCustomerSk((Customer)otherEnd, msgs);
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK:
				if (srStoreSk != null)
					msgs = ((InternalEObject)srStoreSk).eInverseRemove(this, TpcdsModelPackage.STORE__STORE_RETURNS, Store.class, msgs);
				return basicSetSrStoreSk((Store)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK:
				return basicSetSrCustomerSk(null, msgs);
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK:
				return basicSetSrStoreSk(null, msgs);
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
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURNED_DATE_SK:
				if (resolve) return getSrReturnedDateSk();
				return basicGetSrReturnedDateSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TIME_SK:
				return getSrReturnTimeSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_ID:
				if (resolve) return getSrId();
				return basicGetSrId();
			case TpcdsModelPackage.STORE_RETURNS__SR_ITEM_SK:
				return getSrItemSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_TICKET_NUMBER:
				return getSrTicketNumber();
			case TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK:
				if (resolve) return getSrCustomerSk();
				return basicGetSrCustomerSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_CDEMO_SK:
				return getSrCdemoSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_HDEMO_SK:
				return getSrHdemoSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_ADDR_SK:
				return getSrAddrSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK:
				if (resolve) return getSrStoreSk();
				return basicGetSrStoreSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_REASON_SK:
				return getSrReasonSk();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_QUANTITY:
				return getSrReturnQuantity();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT:
				return getSrReturnAmt();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TAX:
				return getSrReturnTax();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT_INC_TAX:
				return getSrReturnAmtIncTax();
			case TpcdsModelPackage.STORE_RETURNS__SR_FEE:
				return getSrFee();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_SHIP_COST:
				return getSrReturnShipCost();
			case TpcdsModelPackage.STORE_RETURNS__SR_REFUNDED_CASH:
				return getSrRefundedCash();
			case TpcdsModelPackage.STORE_RETURNS__SR_REVERSED_CHARGE:
				return getSrReversedCharge();
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_CREDIT:
				return getSrStoreCredit();
			case TpcdsModelPackage.STORE_RETURNS__SR_NET_LOSS:
				return getSrNetLoss();
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
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURNED_DATE_SK:
				setSrReturnedDateSk((DateDim)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TIME_SK:
				setSrReturnTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_ID:
				setSrId((StoreReturnsId)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_ITEM_SK:
				setSrItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_TICKET_NUMBER:
				setSrTicketNumber((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK:
				setSrCustomerSk((Customer)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_CDEMO_SK:
				setSrCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_HDEMO_SK:
				setSrHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_ADDR_SK:
				setSrAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK:
				setSrStoreSk((Store)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_REASON_SK:
				setSrReasonSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_QUANTITY:
				setSrReturnQuantity((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT:
				setSrReturnAmt((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TAX:
				setSrReturnTax((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT_INC_TAX:
				setSrReturnAmtIncTax((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_FEE:
				setSrFee((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_SHIP_COST:
				setSrReturnShipCost((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_REFUNDED_CASH:
				setSrRefundedCash((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_REVERSED_CHARGE:
				setSrReversedCharge((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_CREDIT:
				setSrStoreCredit((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_NET_LOSS:
				setSrNetLoss((Double)newValue);
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
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURNED_DATE_SK:
				setSrReturnedDateSk((DateDim)null);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TIME_SK:
				setSrReturnTimeSk(SR_RETURN_TIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_ID:
				setSrId((StoreReturnsId)null);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_ITEM_SK:
				setSrItemSk(SR_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_TICKET_NUMBER:
				setSrTicketNumber(SR_TICKET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK:
				setSrCustomerSk((Customer)null);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_CDEMO_SK:
				setSrCdemoSk(SR_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_HDEMO_SK:
				setSrHdemoSk(SR_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_ADDR_SK:
				setSrAddrSk(SR_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK:
				setSrStoreSk((Store)null);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_REASON_SK:
				setSrReasonSk(SR_REASON_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_QUANTITY:
				setSrReturnQuantity(SR_RETURN_QUANTITY_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT:
				unsetSrReturnAmt();
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TAX:
				setSrReturnTax(SR_RETURN_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT_INC_TAX:
				setSrReturnAmtIncTax(SR_RETURN_AMT_INC_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_FEE:
				setSrFee(SR_FEE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_SHIP_COST:
				setSrReturnShipCost(SR_RETURN_SHIP_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_REFUNDED_CASH:
				setSrRefundedCash(SR_REFUNDED_CASH_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_REVERSED_CHARGE:
				setSrReversedCharge(SR_REVERSED_CHARGE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_CREDIT:
				setSrStoreCredit(SR_STORE_CREDIT_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_RETURNS__SR_NET_LOSS:
				setSrNetLoss(SR_NET_LOSS_EDEFAULT);
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
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURNED_DATE_SK:
				return srReturnedDateSk != null;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TIME_SK:
				return SR_RETURN_TIME_SK_EDEFAULT == null ? srReturnTimeSk != null : !SR_RETURN_TIME_SK_EDEFAULT.equals(srReturnTimeSk);
			case TpcdsModelPackage.STORE_RETURNS__SR_ID:
				return srId != null;
			case TpcdsModelPackage.STORE_RETURNS__SR_ITEM_SK:
				return SR_ITEM_SK_EDEFAULT == null ? srItemSk != null : !SR_ITEM_SK_EDEFAULT.equals(srItemSk);
			case TpcdsModelPackage.STORE_RETURNS__SR_TICKET_NUMBER:
				return SR_TICKET_NUMBER_EDEFAULT == null ? srTicketNumber != null : !SR_TICKET_NUMBER_EDEFAULT.equals(srTicketNumber);
			case TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK:
				return srCustomerSk != null;
			case TpcdsModelPackage.STORE_RETURNS__SR_CDEMO_SK:
				return SR_CDEMO_SK_EDEFAULT == null ? srCdemoSk != null : !SR_CDEMO_SK_EDEFAULT.equals(srCdemoSk);
			case TpcdsModelPackage.STORE_RETURNS__SR_HDEMO_SK:
				return SR_HDEMO_SK_EDEFAULT == null ? srHdemoSk != null : !SR_HDEMO_SK_EDEFAULT.equals(srHdemoSk);
			case TpcdsModelPackage.STORE_RETURNS__SR_ADDR_SK:
				return SR_ADDR_SK_EDEFAULT == null ? srAddrSk != null : !SR_ADDR_SK_EDEFAULT.equals(srAddrSk);
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK:
				return srStoreSk != null;
			case TpcdsModelPackage.STORE_RETURNS__SR_REASON_SK:
				return SR_REASON_SK_EDEFAULT == null ? srReasonSk != null : !SR_REASON_SK_EDEFAULT.equals(srReasonSk);
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_QUANTITY:
				return SR_RETURN_QUANTITY_EDEFAULT == null ? srReturnQuantity != null : !SR_RETURN_QUANTITY_EDEFAULT.equals(srReturnQuantity);
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT:
				return isSetSrReturnAmt();
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_TAX:
				return srReturnTax != SR_RETURN_TAX_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_AMT_INC_TAX:
				return srReturnAmtIncTax != SR_RETURN_AMT_INC_TAX_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_FEE:
				return srFee != SR_FEE_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_RETURN_SHIP_COST:
				return srReturnShipCost != SR_RETURN_SHIP_COST_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_REFUNDED_CASH:
				return srRefundedCash != SR_REFUNDED_CASH_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_REVERSED_CHARGE:
				return srReversedCharge != SR_REVERSED_CHARGE_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_STORE_CREDIT:
				return srStoreCredit != SR_STORE_CREDIT_EDEFAULT;
			case TpcdsModelPackage.STORE_RETURNS__SR_NET_LOSS:
				return srNetLoss != SR_NET_LOSS_EDEFAULT;
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
		result.append(" (srReturnTimeSk: ");
		result.append(srReturnTimeSk);
		result.append(", srItemSk: ");
		result.append(srItemSk);
		result.append(", srTicketNumber: ");
		result.append(srTicketNumber);
		result.append(", srCdemoSk: ");
		result.append(srCdemoSk);
		result.append(", srHdemoSk: ");
		result.append(srHdemoSk);
		result.append(", srAddrSk: ");
		result.append(srAddrSk);
		result.append(", srReasonSk: ");
		result.append(srReasonSk);
		result.append(", srReturnQuantity: ");
		result.append(srReturnQuantity);
		result.append(", srReturnAmt: ");
		if (srReturnAmtESet) result.append(srReturnAmt); else result.append("<unset>");
		result.append(", srReturnTax: ");
		result.append(srReturnTax);
		result.append(", srReturnAmtIncTax: ");
		result.append(srReturnAmtIncTax);
		result.append(", srFee: ");
		result.append(srFee);
		result.append(", srReturnShipCost: ");
		result.append(srReturnShipCost);
		result.append(", srRefundedCash: ");
		result.append(srRefundedCash);
		result.append(", srReversedCharge: ");
		result.append(srReversedCharge);
		result.append(", srStoreCredit: ");
		result.append(srStoreCredit);
		result.append(", srNetLoss: ");
		result.append(srNetLoss);
		result.append(')');
		return result.toString();
	}

} //StoreReturnsImpl
