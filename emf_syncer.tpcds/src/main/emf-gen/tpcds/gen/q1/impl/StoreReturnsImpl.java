/**
 */
package tpcds.gen.q1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import tpcds.gen.q1.Customer;
import tpcds.gen.q1.DateDim;
import tpcds.gen.q1.Q1Package;
import tpcds.gen.q1.Store;
import tpcds.gen.q1.StoreReturns;
import tpcds.gen.q1.StoreReturnsId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Returns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsImpl#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsImpl#getSrId <em>Sr Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsImpl#getSrCustomerSk <em>Sr Customer Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsImpl#getSrStoreSk <em>Sr Store Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreReturnsImpl#getSrReturnAmt <em>Sr Return Amt</em>}</li>
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
	 * This is true if the Sr Returned Date Sk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srReturnedDateSkESet;

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
	 * This is true if the Sr Id reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srIdESet;

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
	 * This is true if the Sr Customer Sk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srCustomerSkESet;

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
		return Q1Package.Literals.STORE_RETURNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDim getSrReturnedDateSk() {
		if (srReturnedDateSk != null && srReturnedDateSk.eIsProxy()) {
			InternalEObject oldSrReturnedDateSk = (InternalEObject)srReturnedDateSk;
			srReturnedDateSk = (DateDim)eResolveProxy(oldSrReturnedDateSk);
			if (srReturnedDateSk != oldSrReturnedDateSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK, oldSrReturnedDateSk, srReturnedDateSk));
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
	public void setSrReturnedDateSk(DateDim newSrReturnedDateSk) {
		DateDim oldSrReturnedDateSk = srReturnedDateSk;
		srReturnedDateSk = newSrReturnedDateSk;
		boolean oldSrReturnedDateSkESet = srReturnedDateSkESet;
		srReturnedDateSkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK, oldSrReturnedDateSk, srReturnedDateSk, !oldSrReturnedDateSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrReturnedDateSk() {
		DateDim oldSrReturnedDateSk = srReturnedDateSk;
		boolean oldSrReturnedDateSkESet = srReturnedDateSkESet;
		srReturnedDateSk = null;
		srReturnedDateSkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK, oldSrReturnedDateSk, null, oldSrReturnedDateSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrReturnedDateSk() {
		return srReturnedDateSkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreReturnsId getSrId() {
		if (srId != null && srId.eIsProxy()) {
			InternalEObject oldSrId = (InternalEObject)srId;
			srId = (StoreReturnsId)eResolveProxy(oldSrId);
			if (srId != oldSrId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Q1Package.STORE_RETURNS__SR_ID, oldSrId, srId));
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
	public void setSrId(StoreReturnsId newSrId) {
		StoreReturnsId oldSrId = srId;
		srId = newSrId;
		boolean oldSrIdESet = srIdESet;
		srIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS__SR_ID, oldSrId, srId, !oldSrIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrId() {
		StoreReturnsId oldSrId = srId;
		boolean oldSrIdESet = srIdESet;
		srId = null;
		srIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS__SR_ID, oldSrId, null, oldSrIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrId() {
		return srIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getSrCustomerSk() {
		if (srCustomerSk != null && srCustomerSk.eIsProxy()) {
			InternalEObject oldSrCustomerSk = (InternalEObject)srCustomerSk;
			srCustomerSk = (Customer)eResolveProxy(oldSrCustomerSk);
			if (srCustomerSk != oldSrCustomerSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Q1Package.STORE_RETURNS__SR_CUSTOMER_SK, oldSrCustomerSk, srCustomerSk));
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
		boolean oldSrCustomerSkESet = srCustomerSkESet;
		srCustomerSkESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS__SR_CUSTOMER_SK, oldSrCustomerSk, newSrCustomerSk, !oldSrCustomerSkESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrCustomerSk(Customer newSrCustomerSk) {
		if (newSrCustomerSk != srCustomerSk) {
			NotificationChain msgs = null;
			if (srCustomerSk != null)
				msgs = ((InternalEObject)srCustomerSk).eInverseRemove(this, Q1Package.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
			if (newSrCustomerSk != null)
				msgs = ((InternalEObject)newSrCustomerSk).eInverseAdd(this, Q1Package.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
			msgs = basicSetSrCustomerSk(newSrCustomerSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSrCustomerSkESet = srCustomerSkESet;
			srCustomerSkESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS__SR_CUSTOMER_SK, newSrCustomerSk, newSrCustomerSk, !oldSrCustomerSkESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSrCustomerSk(NotificationChain msgs) {
		Customer oldSrCustomerSk = srCustomerSk;
		srCustomerSk = null;
		boolean oldSrCustomerSkESet = srCustomerSkESet;
		srCustomerSkESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS__SR_CUSTOMER_SK, oldSrCustomerSk, null, oldSrCustomerSkESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrCustomerSk() {
		if (srCustomerSk != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)srCustomerSk).eInverseRemove(this, Q1Package.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
			msgs = basicUnsetSrCustomerSk(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSrCustomerSkESet = srCustomerSkESet;
			srCustomerSkESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS__SR_CUSTOMER_SK, null, null, oldSrCustomerSkESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrCustomerSk() {
		return srCustomerSkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store getSrStoreSk() {
		if (eContainerFeatureID() != Q1Package.STORE_RETURNS__SR_STORE_SK) return null;
		return (Store)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrStoreSk(Store newSrStoreSk, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSrStoreSk, Q1Package.STORE_RETURNS__SR_STORE_SK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrStoreSk(Store newSrStoreSk) {
		if (newSrStoreSk != eInternalContainer() || (eContainerFeatureID() != Q1Package.STORE_RETURNS__SR_STORE_SK && newSrStoreSk != null)) {
			if (EcoreUtil.isAncestor(this, newSrStoreSk))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSrStoreSk != null)
				msgs = ((InternalEObject)newSrStoreSk).eInverseAdd(this, Q1Package.STORE__STORE_RETURNS, Store.class, msgs);
			msgs = basicSetSrStoreSk(newSrStoreSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS__SR_STORE_SK, newSrStoreSk, newSrStoreSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSrReturnAmt() {
		return srReturnAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrReturnAmt(double newSrReturnAmt) {
		double oldSrReturnAmt = srReturnAmt;
		srReturnAmt = newSrReturnAmt;
		boolean oldSrReturnAmtESet = srReturnAmtESet;
		srReturnAmtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE_RETURNS__SR_RETURN_AMT, oldSrReturnAmt, srReturnAmt, !oldSrReturnAmtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrReturnAmt() {
		double oldSrReturnAmt = srReturnAmt;
		boolean oldSrReturnAmtESet = srReturnAmtESet;
		srReturnAmt = SR_RETURN_AMT_EDEFAULT;
		srReturnAmtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE_RETURNS__SR_RETURN_AMT, oldSrReturnAmt, SR_RETURN_AMT_EDEFAULT, oldSrReturnAmtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrReturnAmt() {
		return srReturnAmtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Q1Package.STORE_RETURNS__SR_CUSTOMER_SK:
				if (srCustomerSk != null)
					msgs = ((InternalEObject)srCustomerSk).eInverseRemove(this, Q1Package.CUSTOMER__STORE_RETURNS, Customer.class, msgs);
				return basicSetSrCustomerSk((Customer)otherEnd, msgs);
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case Q1Package.STORE_RETURNS__SR_CUSTOMER_SK:
				return basicUnsetSrCustomerSk(msgs);
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
				return eInternalContainer().eInverseRemove(this, Q1Package.STORE__STORE_RETURNS, Store.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK:
				if (resolve) return getSrReturnedDateSk();
				return basicGetSrReturnedDateSk();
			case Q1Package.STORE_RETURNS__SR_ID:
				if (resolve) return getSrId();
				return basicGetSrId();
			case Q1Package.STORE_RETURNS__SR_CUSTOMER_SK:
				if (resolve) return getSrCustomerSk();
				return basicGetSrCustomerSk();
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
				return getSrStoreSk();
			case Q1Package.STORE_RETURNS__SR_RETURN_AMT:
				return getSrReturnAmt();
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
			case Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK:
				setSrReturnedDateSk((DateDim)newValue);
				return;
			case Q1Package.STORE_RETURNS__SR_ID:
				setSrId((StoreReturnsId)newValue);
				return;
			case Q1Package.STORE_RETURNS__SR_CUSTOMER_SK:
				setSrCustomerSk((Customer)newValue);
				return;
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
				setSrStoreSk((Store)newValue);
				return;
			case Q1Package.STORE_RETURNS__SR_RETURN_AMT:
				setSrReturnAmt((Double)newValue);
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
			case Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK:
				unsetSrReturnedDateSk();
				return;
			case Q1Package.STORE_RETURNS__SR_ID:
				unsetSrId();
				return;
			case Q1Package.STORE_RETURNS__SR_CUSTOMER_SK:
				unsetSrCustomerSk();
				return;
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
				setSrStoreSk((Store)null);
				return;
			case Q1Package.STORE_RETURNS__SR_RETURN_AMT:
				unsetSrReturnAmt();
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
			case Q1Package.STORE_RETURNS__SR_RETURNED_DATE_SK:
				return isSetSrReturnedDateSk();
			case Q1Package.STORE_RETURNS__SR_ID:
				return isSetSrId();
			case Q1Package.STORE_RETURNS__SR_CUSTOMER_SK:
				return isSetSrCustomerSk();
			case Q1Package.STORE_RETURNS__SR_STORE_SK:
				return getSrStoreSk() != null;
			case Q1Package.STORE_RETURNS__SR_RETURN_AMT:
				return isSetSrReturnAmt();
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
		result.append(" (srReturnAmt: ");
		if (srReturnAmtESet) result.append(srReturnAmt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StoreReturnsImpl
