/**
 */
package tpcds.gen.q1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tpcds.gen.q1.Customer;
import tpcds.gen.q1.Q1Package;
import tpcds.gen.q1.StoreReturns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.impl.CustomerImpl#getCCustomerSk <em>CCustomer Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.CustomerImpl#getCCustomerId <em>CCustomer Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.CustomerImpl#getCPreferredCustFlag <em>CPreferred Cust Flag</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.CustomerImpl#getStoreReturns <em>Store Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getCCustomerSk() <em>CCustomer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CCUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCustomerSk() <em>CCustomer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long cCustomerSk = CCUSTOMER_SK_EDEFAULT;

	/**
	 * This is true if the CCustomer Sk attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cCustomerSkESet;

	/**
	 * The default value of the '{@link #getCCustomerId() <em>CCustomer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CCUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCustomerId() <em>CCustomer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String cCustomerId = CCUSTOMER_ID_EDEFAULT;

	/**
	 * This is true if the CCustomer Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cCustomerIdESet;

	/**
	 * The default value of the '{@link #getCPreferredCustFlag() <em>CPreferred Cust Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPreferredCustFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String CPREFERRED_CUST_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPreferredCustFlag() <em>CPreferred Cust Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPreferredCustFlag()
	 * @generated
	 * @ordered
	 */
	protected String cPreferredCustFlag = CPREFERRED_CUST_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStoreReturns() <em>Store Returns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreReturns()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreReturns> storeReturns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Q1Package.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCCustomerSk() {
		return cCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCustomerSk(Long newCCustomerSk) {
		Long oldCCustomerSk = cCustomerSk;
		cCustomerSk = newCCustomerSk;
		boolean oldCCustomerSkESet = cCustomerSkESet;
		cCustomerSkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.CUSTOMER__CCUSTOMER_SK, oldCCustomerSk, cCustomerSk, !oldCCustomerSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCCustomerSk() {
		Long oldCCustomerSk = cCustomerSk;
		boolean oldCCustomerSkESet = cCustomerSkESet;
		cCustomerSk = CCUSTOMER_SK_EDEFAULT;
		cCustomerSkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.CUSTOMER__CCUSTOMER_SK, oldCCustomerSk, CCUSTOMER_SK_EDEFAULT, oldCCustomerSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCCustomerSk() {
		return cCustomerSkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCCustomerId() {
		return cCustomerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCustomerId(String newCCustomerId) {
		String oldCCustomerId = cCustomerId;
		cCustomerId = newCCustomerId;
		boolean oldCCustomerIdESet = cCustomerIdESet;
		cCustomerIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.CUSTOMER__CCUSTOMER_ID, oldCCustomerId, cCustomerId, !oldCCustomerIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCCustomerId() {
		String oldCCustomerId = cCustomerId;
		boolean oldCCustomerIdESet = cCustomerIdESet;
		cCustomerId = CCUSTOMER_ID_EDEFAULT;
		cCustomerIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.CUSTOMER__CCUSTOMER_ID, oldCCustomerId, CCUSTOMER_ID_EDEFAULT, oldCCustomerIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCCustomerId() {
		return cCustomerIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPreferredCustFlag() {
		return cPreferredCustFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPreferredCustFlag(String newCPreferredCustFlag) {
		String oldCPreferredCustFlag = cPreferredCustFlag;
		cPreferredCustFlag = newCPreferredCustFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.CUSTOMER__CPREFERRED_CUST_FLAG, oldCPreferredCustFlag, cPreferredCustFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoreReturns> getStoreReturns() {
		if (storeReturns == null) {
			storeReturns = new EObjectWithInverseResolvingEList.Unsettable<StoreReturns>(StoreReturns.class, this, Q1Package.CUSTOMER__STORE_RETURNS, Q1Package.STORE_RETURNS__SR_CUSTOMER_SK);
		}
		return storeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStoreReturns() {
		if (storeReturns != null) ((InternalEList.Unsettable<?>)storeReturns).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStoreReturns() {
		return storeReturns != null && ((InternalEList.Unsettable<?>)storeReturns).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Q1Package.CUSTOMER__STORE_RETURNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoreReturns()).basicAdd(otherEnd, msgs);
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
			case Q1Package.CUSTOMER__STORE_RETURNS:
				return ((InternalEList<?>)getStoreReturns()).basicRemove(otherEnd, msgs);
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
			case Q1Package.CUSTOMER__CCUSTOMER_SK:
				return getCCustomerSk();
			case Q1Package.CUSTOMER__CCUSTOMER_ID:
				return getCCustomerId();
			case Q1Package.CUSTOMER__CPREFERRED_CUST_FLAG:
				return getCPreferredCustFlag();
			case Q1Package.CUSTOMER__STORE_RETURNS:
				return getStoreReturns();
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
			case Q1Package.CUSTOMER__CCUSTOMER_SK:
				setCCustomerSk((Long)newValue);
				return;
			case Q1Package.CUSTOMER__CCUSTOMER_ID:
				setCCustomerId((String)newValue);
				return;
			case Q1Package.CUSTOMER__CPREFERRED_CUST_FLAG:
				setCPreferredCustFlag((String)newValue);
				return;
			case Q1Package.CUSTOMER__STORE_RETURNS:
				getStoreReturns().clear();
				getStoreReturns().addAll((Collection<? extends StoreReturns>)newValue);
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
			case Q1Package.CUSTOMER__CCUSTOMER_SK:
				unsetCCustomerSk();
				return;
			case Q1Package.CUSTOMER__CCUSTOMER_ID:
				unsetCCustomerId();
				return;
			case Q1Package.CUSTOMER__CPREFERRED_CUST_FLAG:
				setCPreferredCustFlag(CPREFERRED_CUST_FLAG_EDEFAULT);
				return;
			case Q1Package.CUSTOMER__STORE_RETURNS:
				unsetStoreReturns();
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
			case Q1Package.CUSTOMER__CCUSTOMER_SK:
				return isSetCCustomerSk();
			case Q1Package.CUSTOMER__CCUSTOMER_ID:
				return isSetCCustomerId();
			case Q1Package.CUSTOMER__CPREFERRED_CUST_FLAG:
				return CPREFERRED_CUST_FLAG_EDEFAULT == null ? cPreferredCustFlag != null : !CPREFERRED_CUST_FLAG_EDEFAULT.equals(cPreferredCustFlag);
			case Q1Package.CUSTOMER__STORE_RETURNS:
				return isSetStoreReturns();
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
		result.append(" (cCustomerSk: ");
		if (cCustomerSkESet) result.append(cCustomerSk); else result.append("<unset>");
		result.append(", cCustomerId: ");
		if (cCustomerIdESet) result.append(cCustomerId); else result.append("<unset>");
		result.append(", cPreferredCustFlag: ");
		result.append(cPreferredCustFlag);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
