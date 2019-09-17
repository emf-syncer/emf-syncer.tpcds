/**
 */
package tpcds.tpcdsModel.impl;

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

import tpcds.tpcdsModel.Customer;
import tpcds.tpcdsModel.StoreReturns;
import tpcds.tpcdsModel.StoreSales;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCCustomerSk <em>CCustomer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCCustomerId <em>CCustomer Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCCurrentCdemoSk <em>CCurrent Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCCurrentHdemoSk <em>CCurrent Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCCurrentAddrSk <em>CCurrent Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCFirstShiptoDateSk <em>CFirst Shipto Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCFirstSalesDateSk <em>CFirst Sales Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCSalutation <em>CSalutation</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCFirstName <em>CFirst Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCLastName <em>CLast Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCPreferredCustFlag <em>CPreferred Cust Flag</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCBirthDay <em>CBirth Day</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCBirthMonth <em>CBirth Month</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCBirthYear <em>CBirth Year</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCBirthCountry <em>CBirth Country</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCLogin <em>CLogin</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCEmailAddress <em>CEmail Address</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getCLastReviewDate <em>CLast Review Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getStoreReturns <em>Store Returns</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerImpl#getStoreSales <em>Store Sales</em>}</li>
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
	 * The default value of the '{@link #getCCurrentCdemoSk() <em>CCurrent Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCurrentCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CCURRENT_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCurrentCdemoSk() <em>CCurrent Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCurrentCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long cCurrentCdemoSk = CCURRENT_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCCurrentHdemoSk() <em>CCurrent Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCurrentHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CCURRENT_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCurrentHdemoSk() <em>CCurrent Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCurrentHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long cCurrentHdemoSk = CCURRENT_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCCurrentAddrSk() <em>CCurrent Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCurrentAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CCURRENT_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCurrentAddrSk() <em>CCurrent Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCurrentAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long cCurrentAddrSk = CCURRENT_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCFirstShiptoDateSk() <em>CFirst Shipto Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFirstShiptoDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CFIRST_SHIPTO_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCFirstShiptoDateSk() <em>CFirst Shipto Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFirstShiptoDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long cFirstShiptoDateSk = CFIRST_SHIPTO_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCFirstSalesDateSk() <em>CFirst Sales Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFirstSalesDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CFIRST_SALES_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCFirstSalesDateSk() <em>CFirst Sales Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFirstSalesDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long cFirstSalesDateSk = CFIRST_SALES_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSalutation() <em>CSalutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSalutation()
	 * @generated
	 * @ordered
	 */
	protected static final String CSALUTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSalutation() <em>CSalutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSalutation()
	 * @generated
	 * @ordered
	 */
	protected String cSalutation = CSALUTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCFirstName() <em>CFirst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String CFIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCFirstName() <em>CFirst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFirstName()
	 * @generated
	 * @ordered
	 */
	protected String cFirstName = CFIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCLastName() <em>CLast Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCLastName() <em>CLast Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLastName()
	 * @generated
	 * @ordered
	 */
	protected String cLastName = CLAST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCBirthDay() <em>CBirth Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthDay()
	 * @generated
	 * @ordered
	 */
	protected static final Long CBIRTH_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBirthDay() <em>CBirth Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthDay()
	 * @generated
	 * @ordered
	 */
	protected Long cBirthDay = CBIRTH_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCBirthMonth() <em>CBirth Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Long CBIRTH_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBirthMonth() <em>CBirth Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthMonth()
	 * @generated
	 * @ordered
	 */
	protected Long cBirthMonth = CBIRTH_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCBirthYear() <em>CBirth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthYear()
	 * @generated
	 * @ordered
	 */
	protected static final Long CBIRTH_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBirthYear() <em>CBirth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthYear()
	 * @generated
	 * @ordered
	 */
	protected Long cBirthYear = CBIRTH_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCBirthCountry() <em>CBirth Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String CBIRTH_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBirthCountry() <em>CBirth Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBirthCountry()
	 * @generated
	 * @ordered
	 */
	protected String cBirthCountry = CBIRTH_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCLogin() <em>CLogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCLogin() <em>CLogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLogin()
	 * @generated
	 * @ordered
	 */
	protected String cLogin = CLOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCEmailAddress() <em>CEmail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CEMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCEmailAddress() <em>CEmail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String cEmailAddress = CEMAIL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCLastReviewDate() <em>CLast Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAST_REVIEW_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCLastReviewDate() <em>CLast Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected String cLastReviewDate = CLAST_REVIEW_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getStoreSales() <em>Store Sales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreSales()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreSales> storeSales;

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
		return TpcdsModelPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCCustomerSk() {
		return cCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCustomerSk(Long newCCustomerSk) {
		Long oldCCustomerSk = cCustomerSk;
		cCustomerSk = newCCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CCUSTOMER_SK, oldCCustomerSk, cCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCCustomerId() {
		return cCustomerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCustomerId(String newCCustomerId) {
		String oldCCustomerId = cCustomerId;
		cCustomerId = newCCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CCUSTOMER_ID, oldCCustomerId, cCustomerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCCurrentCdemoSk() {
		return cCurrentCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCurrentCdemoSk(Long newCCurrentCdemoSk) {
		Long oldCCurrentCdemoSk = cCurrentCdemoSk;
		cCurrentCdemoSk = newCCurrentCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CCURRENT_CDEMO_SK, oldCCurrentCdemoSk, cCurrentCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCCurrentHdemoSk() {
		return cCurrentHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCurrentHdemoSk(Long newCCurrentHdemoSk) {
		Long oldCCurrentHdemoSk = cCurrentHdemoSk;
		cCurrentHdemoSk = newCCurrentHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CCURRENT_HDEMO_SK, oldCCurrentHdemoSk, cCurrentHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCCurrentAddrSk() {
		return cCurrentAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCurrentAddrSk(Long newCCurrentAddrSk) {
		Long oldCCurrentAddrSk = cCurrentAddrSk;
		cCurrentAddrSk = newCCurrentAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CCURRENT_ADDR_SK, oldCCurrentAddrSk, cCurrentAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCFirstShiptoDateSk() {
		return cFirstShiptoDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCFirstShiptoDateSk(Long newCFirstShiptoDateSk) {
		Long oldCFirstShiptoDateSk = cFirstShiptoDateSk;
		cFirstShiptoDateSk = newCFirstShiptoDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CFIRST_SHIPTO_DATE_SK, oldCFirstShiptoDateSk, cFirstShiptoDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCFirstSalesDateSk() {
		return cFirstSalesDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCFirstSalesDateSk(Long newCFirstSalesDateSk) {
		Long oldCFirstSalesDateSk = cFirstSalesDateSk;
		cFirstSalesDateSk = newCFirstSalesDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CFIRST_SALES_DATE_SK, oldCFirstSalesDateSk, cFirstSalesDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSalutation() {
		return cSalutation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSalutation(String newCSalutation) {
		String oldCSalutation = cSalutation;
		cSalutation = newCSalutation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CSALUTATION, oldCSalutation, cSalutation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCFirstName() {
		return cFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCFirstName(String newCFirstName) {
		String oldCFirstName = cFirstName;
		cFirstName = newCFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CFIRST_NAME, oldCFirstName, cFirstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCLastName() {
		return cLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCLastName(String newCLastName) {
		String oldCLastName = cLastName;
		cLastName = newCLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CLAST_NAME, oldCLastName, cLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCPreferredCustFlag() {
		return cPreferredCustFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCPreferredCustFlag(String newCPreferredCustFlag) {
		String oldCPreferredCustFlag = cPreferredCustFlag;
		cPreferredCustFlag = newCPreferredCustFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CPREFERRED_CUST_FLAG, oldCPreferredCustFlag, cPreferredCustFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCBirthDay() {
		return cBirthDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCBirthDay(Long newCBirthDay) {
		Long oldCBirthDay = cBirthDay;
		cBirthDay = newCBirthDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CBIRTH_DAY, oldCBirthDay, cBirthDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCBirthMonth() {
		return cBirthMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCBirthMonth(Long newCBirthMonth) {
		Long oldCBirthMonth = cBirthMonth;
		cBirthMonth = newCBirthMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CBIRTH_MONTH, oldCBirthMonth, cBirthMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCBirthYear() {
		return cBirthYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCBirthYear(Long newCBirthYear) {
		Long oldCBirthYear = cBirthYear;
		cBirthYear = newCBirthYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CBIRTH_YEAR, oldCBirthYear, cBirthYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCBirthCountry() {
		return cBirthCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCBirthCountry(String newCBirthCountry) {
		String oldCBirthCountry = cBirthCountry;
		cBirthCountry = newCBirthCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CBIRTH_COUNTRY, oldCBirthCountry, cBirthCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCLogin() {
		return cLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCLogin(String newCLogin) {
		String oldCLogin = cLogin;
		cLogin = newCLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CLOGIN, oldCLogin, cLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCEmailAddress() {
		return cEmailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCEmailAddress(String newCEmailAddress) {
		String oldCEmailAddress = cEmailAddress;
		cEmailAddress = newCEmailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CEMAIL_ADDRESS, oldCEmailAddress, cEmailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCLastReviewDate() {
		return cLastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCLastReviewDate(String newCLastReviewDate) {
		String oldCLastReviewDate = cLastReviewDate;
		cLastReviewDate = newCLastReviewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER__CLAST_REVIEW_DATE, oldCLastReviewDate, cLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoreReturns> getStoreReturns() {
		if (storeReturns == null) {
			storeReturns = new EObjectWithInverseResolvingEList<StoreReturns>(StoreReturns.class, this, TpcdsModelPackage.CUSTOMER__STORE_RETURNS, TpcdsModelPackage.STORE_RETURNS__SR_CUSTOMER_SK);
		}
		return storeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoreSales> getStoreSales() {
		if (storeSales == null) {
			storeSales = new EObjectWithInverseResolvingEList<StoreSales>(StoreSales.class, this, TpcdsModelPackage.CUSTOMER__STORE_SALES, TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK);
		}
		return storeSales;
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
			case TpcdsModelPackage.CUSTOMER__STORE_RETURNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoreReturns()).basicAdd(otherEnd, msgs);
			case TpcdsModelPackage.CUSTOMER__STORE_SALES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoreSales()).basicAdd(otherEnd, msgs);
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
			case TpcdsModelPackage.CUSTOMER__STORE_RETURNS:
				return ((InternalEList<?>)getStoreReturns()).basicRemove(otherEnd, msgs);
			case TpcdsModelPackage.CUSTOMER__STORE_SALES:
				return ((InternalEList<?>)getStoreSales()).basicRemove(otherEnd, msgs);
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
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_SK:
				return getCCustomerSk();
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_ID:
				return getCCustomerId();
			case TpcdsModelPackage.CUSTOMER__CCURRENT_CDEMO_SK:
				return getCCurrentCdemoSk();
			case TpcdsModelPackage.CUSTOMER__CCURRENT_HDEMO_SK:
				return getCCurrentHdemoSk();
			case TpcdsModelPackage.CUSTOMER__CCURRENT_ADDR_SK:
				return getCCurrentAddrSk();
			case TpcdsModelPackage.CUSTOMER__CFIRST_SHIPTO_DATE_SK:
				return getCFirstShiptoDateSk();
			case TpcdsModelPackage.CUSTOMER__CFIRST_SALES_DATE_SK:
				return getCFirstSalesDateSk();
			case TpcdsModelPackage.CUSTOMER__CSALUTATION:
				return getCSalutation();
			case TpcdsModelPackage.CUSTOMER__CFIRST_NAME:
				return getCFirstName();
			case TpcdsModelPackage.CUSTOMER__CLAST_NAME:
				return getCLastName();
			case TpcdsModelPackage.CUSTOMER__CPREFERRED_CUST_FLAG:
				return getCPreferredCustFlag();
			case TpcdsModelPackage.CUSTOMER__CBIRTH_DAY:
				return getCBirthDay();
			case TpcdsModelPackage.CUSTOMER__CBIRTH_MONTH:
				return getCBirthMonth();
			case TpcdsModelPackage.CUSTOMER__CBIRTH_YEAR:
				return getCBirthYear();
			case TpcdsModelPackage.CUSTOMER__CBIRTH_COUNTRY:
				return getCBirthCountry();
			case TpcdsModelPackage.CUSTOMER__CLOGIN:
				return getCLogin();
			case TpcdsModelPackage.CUSTOMER__CEMAIL_ADDRESS:
				return getCEmailAddress();
			case TpcdsModelPackage.CUSTOMER__CLAST_REVIEW_DATE:
				return getCLastReviewDate();
			case TpcdsModelPackage.CUSTOMER__STORE_RETURNS:
				return getStoreReturns();
			case TpcdsModelPackage.CUSTOMER__STORE_SALES:
				return getStoreSales();
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
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_SK:
				setCCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_ID:
				setCCustomerId((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CCURRENT_CDEMO_SK:
				setCCurrentCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CCURRENT_HDEMO_SK:
				setCCurrentHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CCURRENT_ADDR_SK:
				setCCurrentAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CFIRST_SHIPTO_DATE_SK:
				setCFirstShiptoDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CFIRST_SALES_DATE_SK:
				setCFirstSalesDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CSALUTATION:
				setCSalutation((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CFIRST_NAME:
				setCFirstName((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CLAST_NAME:
				setCLastName((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CPREFERRED_CUST_FLAG:
				setCPreferredCustFlag((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_DAY:
				setCBirthDay((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_MONTH:
				setCBirthMonth((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_YEAR:
				setCBirthYear((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_COUNTRY:
				setCBirthCountry((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CLOGIN:
				setCLogin((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CEMAIL_ADDRESS:
				setCEmailAddress((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__CLAST_REVIEW_DATE:
				setCLastReviewDate((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__STORE_RETURNS:
				getStoreReturns().clear();
				getStoreReturns().addAll((Collection<? extends StoreReturns>)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER__STORE_SALES:
				getStoreSales().clear();
				getStoreSales().addAll((Collection<? extends StoreSales>)newValue);
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
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_SK:
				setCCustomerSk(CCUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_ID:
				setCCustomerId(CCUSTOMER_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CCURRENT_CDEMO_SK:
				setCCurrentCdemoSk(CCURRENT_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CCURRENT_HDEMO_SK:
				setCCurrentHdemoSk(CCURRENT_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CCURRENT_ADDR_SK:
				setCCurrentAddrSk(CCURRENT_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CFIRST_SHIPTO_DATE_SK:
				setCFirstShiptoDateSk(CFIRST_SHIPTO_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CFIRST_SALES_DATE_SK:
				setCFirstSalesDateSk(CFIRST_SALES_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CSALUTATION:
				setCSalutation(CSALUTATION_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CFIRST_NAME:
				setCFirstName(CFIRST_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CLAST_NAME:
				setCLastName(CLAST_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CPREFERRED_CUST_FLAG:
				setCPreferredCustFlag(CPREFERRED_CUST_FLAG_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_DAY:
				setCBirthDay(CBIRTH_DAY_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_MONTH:
				setCBirthMonth(CBIRTH_MONTH_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_YEAR:
				setCBirthYear(CBIRTH_YEAR_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CBIRTH_COUNTRY:
				setCBirthCountry(CBIRTH_COUNTRY_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CLOGIN:
				setCLogin(CLOGIN_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CEMAIL_ADDRESS:
				setCEmailAddress(CEMAIL_ADDRESS_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__CLAST_REVIEW_DATE:
				setCLastReviewDate(CLAST_REVIEW_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER__STORE_RETURNS:
				getStoreReturns().clear();
				return;
			case TpcdsModelPackage.CUSTOMER__STORE_SALES:
				getStoreSales().clear();
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
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_SK:
				return CCUSTOMER_SK_EDEFAULT == null ? cCustomerSk != null : !CCUSTOMER_SK_EDEFAULT.equals(cCustomerSk);
			case TpcdsModelPackage.CUSTOMER__CCUSTOMER_ID:
				return CCUSTOMER_ID_EDEFAULT == null ? cCustomerId != null : !CCUSTOMER_ID_EDEFAULT.equals(cCustomerId);
			case TpcdsModelPackage.CUSTOMER__CCURRENT_CDEMO_SK:
				return CCURRENT_CDEMO_SK_EDEFAULT == null ? cCurrentCdemoSk != null : !CCURRENT_CDEMO_SK_EDEFAULT.equals(cCurrentCdemoSk);
			case TpcdsModelPackage.CUSTOMER__CCURRENT_HDEMO_SK:
				return CCURRENT_HDEMO_SK_EDEFAULT == null ? cCurrentHdemoSk != null : !CCURRENT_HDEMO_SK_EDEFAULT.equals(cCurrentHdemoSk);
			case TpcdsModelPackage.CUSTOMER__CCURRENT_ADDR_SK:
				return CCURRENT_ADDR_SK_EDEFAULT == null ? cCurrentAddrSk != null : !CCURRENT_ADDR_SK_EDEFAULT.equals(cCurrentAddrSk);
			case TpcdsModelPackage.CUSTOMER__CFIRST_SHIPTO_DATE_SK:
				return CFIRST_SHIPTO_DATE_SK_EDEFAULT == null ? cFirstShiptoDateSk != null : !CFIRST_SHIPTO_DATE_SK_EDEFAULT.equals(cFirstShiptoDateSk);
			case TpcdsModelPackage.CUSTOMER__CFIRST_SALES_DATE_SK:
				return CFIRST_SALES_DATE_SK_EDEFAULT == null ? cFirstSalesDateSk != null : !CFIRST_SALES_DATE_SK_EDEFAULT.equals(cFirstSalesDateSk);
			case TpcdsModelPackage.CUSTOMER__CSALUTATION:
				return CSALUTATION_EDEFAULT == null ? cSalutation != null : !CSALUTATION_EDEFAULT.equals(cSalutation);
			case TpcdsModelPackage.CUSTOMER__CFIRST_NAME:
				return CFIRST_NAME_EDEFAULT == null ? cFirstName != null : !CFIRST_NAME_EDEFAULT.equals(cFirstName);
			case TpcdsModelPackage.CUSTOMER__CLAST_NAME:
				return CLAST_NAME_EDEFAULT == null ? cLastName != null : !CLAST_NAME_EDEFAULT.equals(cLastName);
			case TpcdsModelPackage.CUSTOMER__CPREFERRED_CUST_FLAG:
				return CPREFERRED_CUST_FLAG_EDEFAULT == null ? cPreferredCustFlag != null : !CPREFERRED_CUST_FLAG_EDEFAULT.equals(cPreferredCustFlag);
			case TpcdsModelPackage.CUSTOMER__CBIRTH_DAY:
				return CBIRTH_DAY_EDEFAULT == null ? cBirthDay != null : !CBIRTH_DAY_EDEFAULT.equals(cBirthDay);
			case TpcdsModelPackage.CUSTOMER__CBIRTH_MONTH:
				return CBIRTH_MONTH_EDEFAULT == null ? cBirthMonth != null : !CBIRTH_MONTH_EDEFAULT.equals(cBirthMonth);
			case TpcdsModelPackage.CUSTOMER__CBIRTH_YEAR:
				return CBIRTH_YEAR_EDEFAULT == null ? cBirthYear != null : !CBIRTH_YEAR_EDEFAULT.equals(cBirthYear);
			case TpcdsModelPackage.CUSTOMER__CBIRTH_COUNTRY:
				return CBIRTH_COUNTRY_EDEFAULT == null ? cBirthCountry != null : !CBIRTH_COUNTRY_EDEFAULT.equals(cBirthCountry);
			case TpcdsModelPackage.CUSTOMER__CLOGIN:
				return CLOGIN_EDEFAULT == null ? cLogin != null : !CLOGIN_EDEFAULT.equals(cLogin);
			case TpcdsModelPackage.CUSTOMER__CEMAIL_ADDRESS:
				return CEMAIL_ADDRESS_EDEFAULT == null ? cEmailAddress != null : !CEMAIL_ADDRESS_EDEFAULT.equals(cEmailAddress);
			case TpcdsModelPackage.CUSTOMER__CLAST_REVIEW_DATE:
				return CLAST_REVIEW_DATE_EDEFAULT == null ? cLastReviewDate != null : !CLAST_REVIEW_DATE_EDEFAULT.equals(cLastReviewDate);
			case TpcdsModelPackage.CUSTOMER__STORE_RETURNS:
				return storeReturns != null && !storeReturns.isEmpty();
			case TpcdsModelPackage.CUSTOMER__STORE_SALES:
				return storeSales != null && !storeSales.isEmpty();
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
		result.append(cCustomerSk);
		result.append(", cCustomerId: ");
		result.append(cCustomerId);
		result.append(", cCurrentCdemoSk: ");
		result.append(cCurrentCdemoSk);
		result.append(", cCurrentHdemoSk: ");
		result.append(cCurrentHdemoSk);
		result.append(", cCurrentAddrSk: ");
		result.append(cCurrentAddrSk);
		result.append(", cFirstShiptoDateSk: ");
		result.append(cFirstShiptoDateSk);
		result.append(", cFirstSalesDateSk: ");
		result.append(cFirstSalesDateSk);
		result.append(", cSalutation: ");
		result.append(cSalutation);
		result.append(", cFirstName: ");
		result.append(cFirstName);
		result.append(", cLastName: ");
		result.append(cLastName);
		result.append(", cPreferredCustFlag: ");
		result.append(cPreferredCustFlag);
		result.append(", cBirthDay: ");
		result.append(cBirthDay);
		result.append(", cBirthMonth: ");
		result.append(cBirthMonth);
		result.append(", cBirthYear: ");
		result.append(cBirthYear);
		result.append(", cBirthCountry: ");
		result.append(cBirthCountry);
		result.append(", cLogin: ");
		result.append(cLogin);
		result.append(", cEmailAddress: ");
		result.append(cEmailAddress);
		result.append(", cLastReviewDate: ");
		result.append(cLastReviewDate);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
