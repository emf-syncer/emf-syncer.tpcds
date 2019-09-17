/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tpcds.tpcdsModel.Store;
import tpcds.tpcdsModel.StoreReturns;
import tpcds.tpcdsModel.StoreSales;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSStoreSk <em>SStore Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSStoreId <em>SStore Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSRecStartDate <em>SRec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSRecEndDate <em>SRec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSClosedDateSk <em>SClosed Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSStoreName <em>SStore Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSNumberEmployees <em>SNumber Employees</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSFloorSpace <em>SFloor Space</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSHours <em>SHours</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSManager <em>SManager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSMarketId <em>SMarket Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSGeographyClass <em>SGeography Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSMarketDesc <em>SMarket Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSMarketManager <em>SMarket Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSDivisionId <em>SDivision Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSDivisionName <em>SDivision Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSCompanyId <em>SCompany Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSCompanyName <em>SCompany Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSStreetNumber <em>SStreet Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSStreetName <em>SStreet Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSStreetType <em>SStreet Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSSuiteNumber <em>SSuite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSCity <em>SCity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSCounty <em>SCounty</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSState <em>SState</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSZip <em>SZip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSCountry <em>SCountry</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSGmtOffset <em>SGmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getSTaxPrecentage <em>STax Precentage</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getStoreSales <em>Store Sales</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreImpl#getStoreReturns <em>Store Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store {
	/**
	 * The default value of the '{@link #getSStoreSk() <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SSTORE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStoreSk() <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreSk()
	 * @generated
	 * @ordered
	 */
	protected Long sStoreSk = SSTORE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSStoreId() <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStoreId() <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreId()
	 * @generated
	 * @ordered
	 */
	protected String sStoreId = SSTORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSRecStartDate() <em>SRec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SREC_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSRecStartDate() <em>SRec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date sRecStartDate = SREC_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSRecEndDate() <em>SRec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SREC_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSRecEndDate() <em>SRec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date sRecEndDate = SREC_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSClosedDateSk() <em>SClosed Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSClosedDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCLOSED_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSClosedDateSk() <em>SClosed Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSClosedDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long sClosedDateSk = SCLOSED_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSStoreName() <em>SStore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStoreName() <em>SStore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreName()
	 * @generated
	 * @ordered
	 */
	protected String sStoreName = SSTORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSNumberEmployees() <em>SNumber Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNumberEmployees()
	 * @generated
	 * @ordered
	 */
	protected static final Long SNUMBER_EMPLOYEES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSNumberEmployees() <em>SNumber Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNumberEmployees()
	 * @generated
	 * @ordered
	 */
	protected Long sNumberEmployees = SNUMBER_EMPLOYEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSFloorSpace() <em>SFloor Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFloorSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long SFLOOR_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSFloorSpace() <em>SFloor Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFloorSpace()
	 * @generated
	 * @ordered
	 */
	protected Long sFloorSpace = SFLOOR_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSHours() <em>SHours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHours()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHours() <em>SHours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHours()
	 * @generated
	 * @ordered
	 */
	protected String sHours = SHOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSManager() <em>SManager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSManager()
	 * @generated
	 * @ordered
	 */
	protected static final String SMANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSManager() <em>SManager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSManager()
	 * @generated
	 * @ordered
	 */
	protected String sManager = SMANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSMarketId() <em>SMarket Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMarketId()
	 * @generated
	 * @ordered
	 */
	protected static final Long SMARKET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSMarketId() <em>SMarket Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMarketId()
	 * @generated
	 * @ordered
	 */
	protected Long sMarketId = SMARKET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSGeographyClass() <em>SGeography Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGeographyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SGEOGRAPHY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSGeographyClass() <em>SGeography Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGeographyClass()
	 * @generated
	 * @ordered
	 */
	protected String sGeographyClass = SGEOGRAPHY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSMarketDesc() <em>SMarket Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMarketDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String SMARKET_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSMarketDesc() <em>SMarket Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMarketDesc()
	 * @generated
	 * @ordered
	 */
	protected String sMarketDesc = SMARKET_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSMarketManager() <em>SMarket Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMarketManager()
	 * @generated
	 * @ordered
	 */
	protected static final String SMARKET_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSMarketManager() <em>SMarket Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMarketManager()
	 * @generated
	 * @ordered
	 */
	protected String sMarketManager = SMARKET_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDivisionId() <em>SDivision Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDivisionId()
	 * @generated
	 * @ordered
	 */
	protected static final Long SDIVISION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDivisionId() <em>SDivision Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDivisionId()
	 * @generated
	 * @ordered
	 */
	protected Long sDivisionId = SDIVISION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDivisionName() <em>SDivision Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDivisionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SDIVISION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSDivisionName() <em>SDivision Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDivisionName()
	 * @generated
	 * @ordered
	 */
	protected String sDivisionName = SDIVISION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCompanyId() <em>SCompany Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCompanyId()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCOMPANY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCompanyId() <em>SCompany Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCompanyId()
	 * @generated
	 * @ordered
	 */
	protected Long sCompanyId = SCOMPANY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCompanyName() <em>SCompany Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCompanyName() <em>SCompany Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String sCompanyName = SCOMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSStreetNumber() <em>SStreet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStreetNumber() <em>SStreet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String sStreetNumber = SSTREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSStreetName() <em>SStreet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStreetName() <em>SStreet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStreetName()
	 * @generated
	 * @ordered
	 */
	protected String sStreetName = SSTREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSStreetType() <em>SStreet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStreetType()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTREET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStreetType() <em>SStreet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStreetType()
	 * @generated
	 * @ordered
	 */
	protected String sStreetType = SSTREET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSuiteNumber() <em>SSuite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SSUITE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSuiteNumber() <em>SSuite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected String sSuiteNumber = SSUITE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCity() <em>SCity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCity()
	 * @generated
	 * @ordered
	 */
	protected static final String SCITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCity() <em>SCity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCity()
	 * @generated
	 * @ordered
	 */
	protected String sCity = SCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCounty() <em>SCounty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOUNTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCounty() <em>SCounty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCounty()
	 * @generated
	 * @ordered
	 */
	protected String sCounty = SCOUNTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSState() <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSState()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSState() <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSState()
	 * @generated
	 * @ordered
	 */
	protected String sState = SSTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSZip() <em>SZip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSZip()
	 * @generated
	 * @ordered
	 */
	protected static final String SZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSZip() <em>SZip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSZip()
	 * @generated
	 * @ordered
	 */
	protected String sZip = SZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCountry() <em>SCountry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCountry() <em>SCountry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCountry()
	 * @generated
	 * @ordered
	 */
	protected String sCountry = SCOUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSGmtOffset() <em>SGmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double SGMT_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSGmtOffset() <em>SGmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected double sGmtOffset = SGMT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSTaxPrecentage() <em>STax Precentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTaxPrecentage()
	 * @generated
	 * @ordered
	 */
	protected static final double STAX_PRECENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSTaxPrecentage() <em>STax Precentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTaxPrecentage()
	 * @generated
	 * @ordered
	 */
	protected double sTaxPrecentage = STAX_PRECENTAGE_EDEFAULT;

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
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSStoreSk() {
		return sStoreSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSStoreSk(Long newSStoreSk) {
		Long oldSStoreSk = sStoreSk;
		sStoreSk = newSStoreSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTORE_SK, oldSStoreSk, sStoreSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSStoreId() {
		return sStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSStoreId(String newSStoreId) {
		String oldSStoreId = sStoreId;
		sStoreId = newSStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTORE_ID, oldSStoreId, sStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSRecStartDate() {
		return sRecStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSRecStartDate(Date newSRecStartDate) {
		Date oldSRecStartDate = sRecStartDate;
		sRecStartDate = newSRecStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SREC_START_DATE, oldSRecStartDate, sRecStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSRecEndDate() {
		return sRecEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSRecEndDate(Date newSRecEndDate) {
		Date oldSRecEndDate = sRecEndDate;
		sRecEndDate = newSRecEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SREC_END_DATE, oldSRecEndDate, sRecEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSClosedDateSk() {
		return sClosedDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSClosedDateSk(Long newSClosedDateSk) {
		Long oldSClosedDateSk = sClosedDateSk;
		sClosedDateSk = newSClosedDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SCLOSED_DATE_SK, oldSClosedDateSk, sClosedDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSStoreName() {
		return sStoreName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSStoreName(String newSStoreName) {
		String oldSStoreName = sStoreName;
		sStoreName = newSStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTORE_NAME, oldSStoreName, sStoreName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSNumberEmployees() {
		return sNumberEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSNumberEmployees(Long newSNumberEmployees) {
		Long oldSNumberEmployees = sNumberEmployees;
		sNumberEmployees = newSNumberEmployees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SNUMBER_EMPLOYEES, oldSNumberEmployees, sNumberEmployees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSFloorSpace() {
		return sFloorSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSFloorSpace(Long newSFloorSpace) {
		Long oldSFloorSpace = sFloorSpace;
		sFloorSpace = newSFloorSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SFLOOR_SPACE, oldSFloorSpace, sFloorSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSHours() {
		return sHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSHours(String newSHours) {
		String oldSHours = sHours;
		sHours = newSHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SHOURS, oldSHours, sHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSManager() {
		return sManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSManager(String newSManager) {
		String oldSManager = sManager;
		sManager = newSManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SMANAGER, oldSManager, sManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSMarketId() {
		return sMarketId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSMarketId(Long newSMarketId) {
		Long oldSMarketId = sMarketId;
		sMarketId = newSMarketId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SMARKET_ID, oldSMarketId, sMarketId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSGeographyClass() {
		return sGeographyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGeographyClass(String newSGeographyClass) {
		String oldSGeographyClass = sGeographyClass;
		sGeographyClass = newSGeographyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SGEOGRAPHY_CLASS, oldSGeographyClass, sGeographyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSMarketDesc() {
		return sMarketDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSMarketDesc(String newSMarketDesc) {
		String oldSMarketDesc = sMarketDesc;
		sMarketDesc = newSMarketDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SMARKET_DESC, oldSMarketDesc, sMarketDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSMarketManager() {
		return sMarketManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSMarketManager(String newSMarketManager) {
		String oldSMarketManager = sMarketManager;
		sMarketManager = newSMarketManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SMARKET_MANAGER, oldSMarketManager, sMarketManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSDivisionId() {
		return sDivisionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDivisionId(Long newSDivisionId) {
		Long oldSDivisionId = sDivisionId;
		sDivisionId = newSDivisionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SDIVISION_ID, oldSDivisionId, sDivisionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSDivisionName() {
		return sDivisionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSDivisionName(String newSDivisionName) {
		String oldSDivisionName = sDivisionName;
		sDivisionName = newSDivisionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SDIVISION_NAME, oldSDivisionName, sDivisionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSCompanyId() {
		return sCompanyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCompanyId(Long newSCompanyId) {
		Long oldSCompanyId = sCompanyId;
		sCompanyId = newSCompanyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SCOMPANY_ID, oldSCompanyId, sCompanyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCompanyName() {
		return sCompanyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCompanyName(String newSCompanyName) {
		String oldSCompanyName = sCompanyName;
		sCompanyName = newSCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SCOMPANY_NAME, oldSCompanyName, sCompanyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSStreetNumber() {
		return sStreetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSStreetNumber(String newSStreetNumber) {
		String oldSStreetNumber = sStreetNumber;
		sStreetNumber = newSStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTREET_NUMBER, oldSStreetNumber, sStreetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSStreetName() {
		return sStreetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSStreetName(String newSStreetName) {
		String oldSStreetName = sStreetName;
		sStreetName = newSStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTREET_NAME, oldSStreetName, sStreetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSStreetType() {
		return sStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSStreetType(String newSStreetType) {
		String oldSStreetType = sStreetType;
		sStreetType = newSStreetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTREET_TYPE, oldSStreetType, sStreetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSuiteNumber() {
		return sSuiteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSuiteNumber(String newSSuiteNumber) {
		String oldSSuiteNumber = sSuiteNumber;
		sSuiteNumber = newSSuiteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSUITE_NUMBER, oldSSuiteNumber, sSuiteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCity() {
		return sCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCity(String newSCity) {
		String oldSCity = sCity;
		sCity = newSCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SCITY, oldSCity, sCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCounty() {
		return sCounty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCounty(String newSCounty) {
		String oldSCounty = sCounty;
		sCounty = newSCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SCOUNTY, oldSCounty, sCounty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSState() {
		return sState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSState(String newSState) {
		String oldSState = sState;
		sState = newSState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SSTATE, oldSState, sState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSZip() {
		return sZip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSZip(String newSZip) {
		String oldSZip = sZip;
		sZip = newSZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SZIP, oldSZip, sZip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCountry() {
		return sCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCountry(String newSCountry) {
		String oldSCountry = sCountry;
		sCountry = newSCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SCOUNTRY, oldSCountry, sCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSGmtOffset() {
		return sGmtOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSGmtOffset(double newSGmtOffset) {
		double oldSGmtOffset = sGmtOffset;
		sGmtOffset = newSGmtOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__SGMT_OFFSET, oldSGmtOffset, sGmtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSTaxPrecentage() {
		return sTaxPrecentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSTaxPrecentage(double newSTaxPrecentage) {
		double oldSTaxPrecentage = sTaxPrecentage;
		sTaxPrecentage = newSTaxPrecentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE__STAX_PRECENTAGE, oldSTaxPrecentage, sTaxPrecentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoreSales> getStoreSales() {
		if (storeSales == null) {
			storeSales = new EObjectResolvingEList<StoreSales>(StoreSales.class, this, TpcdsModelPackage.STORE__STORE_SALES);
		}
		return storeSales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoreReturns> getStoreReturns() {
		if (storeReturns == null) {
			storeReturns = new EObjectWithInverseResolvingEList<StoreReturns>(StoreReturns.class, this, TpcdsModelPackage.STORE__STORE_RETURNS, TpcdsModelPackage.STORE_RETURNS__SR_STORE_SK);
		}
		return storeReturns;
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
			case TpcdsModelPackage.STORE__STORE_RETURNS:
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
			case TpcdsModelPackage.STORE__STORE_RETURNS:
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
			case TpcdsModelPackage.STORE__SSTORE_SK:
				return getSStoreSk();
			case TpcdsModelPackage.STORE__SSTORE_ID:
				return getSStoreId();
			case TpcdsModelPackage.STORE__SREC_START_DATE:
				return getSRecStartDate();
			case TpcdsModelPackage.STORE__SREC_END_DATE:
				return getSRecEndDate();
			case TpcdsModelPackage.STORE__SCLOSED_DATE_SK:
				return getSClosedDateSk();
			case TpcdsModelPackage.STORE__SSTORE_NAME:
				return getSStoreName();
			case TpcdsModelPackage.STORE__SNUMBER_EMPLOYEES:
				return getSNumberEmployees();
			case TpcdsModelPackage.STORE__SFLOOR_SPACE:
				return getSFloorSpace();
			case TpcdsModelPackage.STORE__SHOURS:
				return getSHours();
			case TpcdsModelPackage.STORE__SMANAGER:
				return getSManager();
			case TpcdsModelPackage.STORE__SMARKET_ID:
				return getSMarketId();
			case TpcdsModelPackage.STORE__SGEOGRAPHY_CLASS:
				return getSGeographyClass();
			case TpcdsModelPackage.STORE__SMARKET_DESC:
				return getSMarketDesc();
			case TpcdsModelPackage.STORE__SMARKET_MANAGER:
				return getSMarketManager();
			case TpcdsModelPackage.STORE__SDIVISION_ID:
				return getSDivisionId();
			case TpcdsModelPackage.STORE__SDIVISION_NAME:
				return getSDivisionName();
			case TpcdsModelPackage.STORE__SCOMPANY_ID:
				return getSCompanyId();
			case TpcdsModelPackage.STORE__SCOMPANY_NAME:
				return getSCompanyName();
			case TpcdsModelPackage.STORE__SSTREET_NUMBER:
				return getSStreetNumber();
			case TpcdsModelPackage.STORE__SSTREET_NAME:
				return getSStreetName();
			case TpcdsModelPackage.STORE__SSTREET_TYPE:
				return getSStreetType();
			case TpcdsModelPackage.STORE__SSUITE_NUMBER:
				return getSSuiteNumber();
			case TpcdsModelPackage.STORE__SCITY:
				return getSCity();
			case TpcdsModelPackage.STORE__SCOUNTY:
				return getSCounty();
			case TpcdsModelPackage.STORE__SSTATE:
				return getSState();
			case TpcdsModelPackage.STORE__SZIP:
				return getSZip();
			case TpcdsModelPackage.STORE__SCOUNTRY:
				return getSCountry();
			case TpcdsModelPackage.STORE__SGMT_OFFSET:
				return getSGmtOffset();
			case TpcdsModelPackage.STORE__STAX_PRECENTAGE:
				return getSTaxPrecentage();
			case TpcdsModelPackage.STORE__STORE_SALES:
				return getStoreSales();
			case TpcdsModelPackage.STORE__STORE_RETURNS:
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
			case TpcdsModelPackage.STORE__SSTORE_SK:
				setSStoreSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SSTORE_ID:
				setSStoreId((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SREC_START_DATE:
				setSRecStartDate((Date)newValue);
				return;
			case TpcdsModelPackage.STORE__SREC_END_DATE:
				setSRecEndDate((Date)newValue);
				return;
			case TpcdsModelPackage.STORE__SCLOSED_DATE_SK:
				setSClosedDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SSTORE_NAME:
				setSStoreName((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SNUMBER_EMPLOYEES:
				setSNumberEmployees((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SFLOOR_SPACE:
				setSFloorSpace((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SHOURS:
				setSHours((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SMANAGER:
				setSManager((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SMARKET_ID:
				setSMarketId((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SGEOGRAPHY_CLASS:
				setSGeographyClass((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SMARKET_DESC:
				setSMarketDesc((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SMARKET_MANAGER:
				setSMarketManager((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SDIVISION_ID:
				setSDivisionId((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SDIVISION_NAME:
				setSDivisionName((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SCOMPANY_ID:
				setSCompanyId((Long)newValue);
				return;
			case TpcdsModelPackage.STORE__SCOMPANY_NAME:
				setSCompanyName((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SSTREET_NUMBER:
				setSStreetNumber((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SSTREET_NAME:
				setSStreetName((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SSTREET_TYPE:
				setSStreetType((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SSUITE_NUMBER:
				setSSuiteNumber((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SCITY:
				setSCity((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SCOUNTY:
				setSCounty((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SSTATE:
				setSState((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SZIP:
				setSZip((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SCOUNTRY:
				setSCountry((String)newValue);
				return;
			case TpcdsModelPackage.STORE__SGMT_OFFSET:
				setSGmtOffset((Double)newValue);
				return;
			case TpcdsModelPackage.STORE__STAX_PRECENTAGE:
				setSTaxPrecentage((Double)newValue);
				return;
			case TpcdsModelPackage.STORE__STORE_SALES:
				getStoreSales().clear();
				getStoreSales().addAll((Collection<? extends StoreSales>)newValue);
				return;
			case TpcdsModelPackage.STORE__STORE_RETURNS:
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
			case TpcdsModelPackage.STORE__SSTORE_SK:
				setSStoreSk(SSTORE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSTORE_ID:
				setSStoreId(SSTORE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SREC_START_DATE:
				setSRecStartDate(SREC_START_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SREC_END_DATE:
				setSRecEndDate(SREC_END_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SCLOSED_DATE_SK:
				setSClosedDateSk(SCLOSED_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSTORE_NAME:
				setSStoreName(SSTORE_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SNUMBER_EMPLOYEES:
				setSNumberEmployees(SNUMBER_EMPLOYEES_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SFLOOR_SPACE:
				setSFloorSpace(SFLOOR_SPACE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SHOURS:
				setSHours(SHOURS_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SMANAGER:
				setSManager(SMANAGER_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SMARKET_ID:
				setSMarketId(SMARKET_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SGEOGRAPHY_CLASS:
				setSGeographyClass(SGEOGRAPHY_CLASS_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SMARKET_DESC:
				setSMarketDesc(SMARKET_DESC_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SMARKET_MANAGER:
				setSMarketManager(SMARKET_MANAGER_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SDIVISION_ID:
				setSDivisionId(SDIVISION_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SDIVISION_NAME:
				setSDivisionName(SDIVISION_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SCOMPANY_ID:
				setSCompanyId(SCOMPANY_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SCOMPANY_NAME:
				setSCompanyName(SCOMPANY_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSTREET_NUMBER:
				setSStreetNumber(SSTREET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSTREET_NAME:
				setSStreetName(SSTREET_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSTREET_TYPE:
				setSStreetType(SSTREET_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSUITE_NUMBER:
				setSSuiteNumber(SSUITE_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SCITY:
				setSCity(SCITY_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SCOUNTY:
				setSCounty(SCOUNTY_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SSTATE:
				setSState(SSTATE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SZIP:
				setSZip(SZIP_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SCOUNTRY:
				setSCountry(SCOUNTRY_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__SGMT_OFFSET:
				setSGmtOffset(SGMT_OFFSET_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__STAX_PRECENTAGE:
				setSTaxPrecentage(STAX_PRECENTAGE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE__STORE_SALES:
				getStoreSales().clear();
				return;
			case TpcdsModelPackage.STORE__STORE_RETURNS:
				getStoreReturns().clear();
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
			case TpcdsModelPackage.STORE__SSTORE_SK:
				return SSTORE_SK_EDEFAULT == null ? sStoreSk != null : !SSTORE_SK_EDEFAULT.equals(sStoreSk);
			case TpcdsModelPackage.STORE__SSTORE_ID:
				return SSTORE_ID_EDEFAULT == null ? sStoreId != null : !SSTORE_ID_EDEFAULT.equals(sStoreId);
			case TpcdsModelPackage.STORE__SREC_START_DATE:
				return SREC_START_DATE_EDEFAULT == null ? sRecStartDate != null : !SREC_START_DATE_EDEFAULT.equals(sRecStartDate);
			case TpcdsModelPackage.STORE__SREC_END_DATE:
				return SREC_END_DATE_EDEFAULT == null ? sRecEndDate != null : !SREC_END_DATE_EDEFAULT.equals(sRecEndDate);
			case TpcdsModelPackage.STORE__SCLOSED_DATE_SK:
				return SCLOSED_DATE_SK_EDEFAULT == null ? sClosedDateSk != null : !SCLOSED_DATE_SK_EDEFAULT.equals(sClosedDateSk);
			case TpcdsModelPackage.STORE__SSTORE_NAME:
				return SSTORE_NAME_EDEFAULT == null ? sStoreName != null : !SSTORE_NAME_EDEFAULT.equals(sStoreName);
			case TpcdsModelPackage.STORE__SNUMBER_EMPLOYEES:
				return SNUMBER_EMPLOYEES_EDEFAULT == null ? sNumberEmployees != null : !SNUMBER_EMPLOYEES_EDEFAULT.equals(sNumberEmployees);
			case TpcdsModelPackage.STORE__SFLOOR_SPACE:
				return SFLOOR_SPACE_EDEFAULT == null ? sFloorSpace != null : !SFLOOR_SPACE_EDEFAULT.equals(sFloorSpace);
			case TpcdsModelPackage.STORE__SHOURS:
				return SHOURS_EDEFAULT == null ? sHours != null : !SHOURS_EDEFAULT.equals(sHours);
			case TpcdsModelPackage.STORE__SMANAGER:
				return SMANAGER_EDEFAULT == null ? sManager != null : !SMANAGER_EDEFAULT.equals(sManager);
			case TpcdsModelPackage.STORE__SMARKET_ID:
				return SMARKET_ID_EDEFAULT == null ? sMarketId != null : !SMARKET_ID_EDEFAULT.equals(sMarketId);
			case TpcdsModelPackage.STORE__SGEOGRAPHY_CLASS:
				return SGEOGRAPHY_CLASS_EDEFAULT == null ? sGeographyClass != null : !SGEOGRAPHY_CLASS_EDEFAULT.equals(sGeographyClass);
			case TpcdsModelPackage.STORE__SMARKET_DESC:
				return SMARKET_DESC_EDEFAULT == null ? sMarketDesc != null : !SMARKET_DESC_EDEFAULT.equals(sMarketDesc);
			case TpcdsModelPackage.STORE__SMARKET_MANAGER:
				return SMARKET_MANAGER_EDEFAULT == null ? sMarketManager != null : !SMARKET_MANAGER_EDEFAULT.equals(sMarketManager);
			case TpcdsModelPackage.STORE__SDIVISION_ID:
				return SDIVISION_ID_EDEFAULT == null ? sDivisionId != null : !SDIVISION_ID_EDEFAULT.equals(sDivisionId);
			case TpcdsModelPackage.STORE__SDIVISION_NAME:
				return SDIVISION_NAME_EDEFAULT == null ? sDivisionName != null : !SDIVISION_NAME_EDEFAULT.equals(sDivisionName);
			case TpcdsModelPackage.STORE__SCOMPANY_ID:
				return SCOMPANY_ID_EDEFAULT == null ? sCompanyId != null : !SCOMPANY_ID_EDEFAULT.equals(sCompanyId);
			case TpcdsModelPackage.STORE__SCOMPANY_NAME:
				return SCOMPANY_NAME_EDEFAULT == null ? sCompanyName != null : !SCOMPANY_NAME_EDEFAULT.equals(sCompanyName);
			case TpcdsModelPackage.STORE__SSTREET_NUMBER:
				return SSTREET_NUMBER_EDEFAULT == null ? sStreetNumber != null : !SSTREET_NUMBER_EDEFAULT.equals(sStreetNumber);
			case TpcdsModelPackage.STORE__SSTREET_NAME:
				return SSTREET_NAME_EDEFAULT == null ? sStreetName != null : !SSTREET_NAME_EDEFAULT.equals(sStreetName);
			case TpcdsModelPackage.STORE__SSTREET_TYPE:
				return SSTREET_TYPE_EDEFAULT == null ? sStreetType != null : !SSTREET_TYPE_EDEFAULT.equals(sStreetType);
			case TpcdsModelPackage.STORE__SSUITE_NUMBER:
				return SSUITE_NUMBER_EDEFAULT == null ? sSuiteNumber != null : !SSUITE_NUMBER_EDEFAULT.equals(sSuiteNumber);
			case TpcdsModelPackage.STORE__SCITY:
				return SCITY_EDEFAULT == null ? sCity != null : !SCITY_EDEFAULT.equals(sCity);
			case TpcdsModelPackage.STORE__SCOUNTY:
				return SCOUNTY_EDEFAULT == null ? sCounty != null : !SCOUNTY_EDEFAULT.equals(sCounty);
			case TpcdsModelPackage.STORE__SSTATE:
				return SSTATE_EDEFAULT == null ? sState != null : !SSTATE_EDEFAULT.equals(sState);
			case TpcdsModelPackage.STORE__SZIP:
				return SZIP_EDEFAULT == null ? sZip != null : !SZIP_EDEFAULT.equals(sZip);
			case TpcdsModelPackage.STORE__SCOUNTRY:
				return SCOUNTRY_EDEFAULT == null ? sCountry != null : !SCOUNTRY_EDEFAULT.equals(sCountry);
			case TpcdsModelPackage.STORE__SGMT_OFFSET:
				return sGmtOffset != SGMT_OFFSET_EDEFAULT;
			case TpcdsModelPackage.STORE__STAX_PRECENTAGE:
				return sTaxPrecentage != STAX_PRECENTAGE_EDEFAULT;
			case TpcdsModelPackage.STORE__STORE_SALES:
				return storeSales != null && !storeSales.isEmpty();
			case TpcdsModelPackage.STORE__STORE_RETURNS:
				return storeReturns != null && !storeReturns.isEmpty();
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
		result.append(" (sStoreSk: ");
		result.append(sStoreSk);
		result.append(", sStoreId: ");
		result.append(sStoreId);
		result.append(", sRecStartDate: ");
		result.append(sRecStartDate);
		result.append(", sRecEndDate: ");
		result.append(sRecEndDate);
		result.append(", sClosedDateSk: ");
		result.append(sClosedDateSk);
		result.append(", sStoreName: ");
		result.append(sStoreName);
		result.append(", sNumberEmployees: ");
		result.append(sNumberEmployees);
		result.append(", sFloorSpace: ");
		result.append(sFloorSpace);
		result.append(", sHours: ");
		result.append(sHours);
		result.append(", sManager: ");
		result.append(sManager);
		result.append(", sMarketId: ");
		result.append(sMarketId);
		result.append(", sGeographyClass: ");
		result.append(sGeographyClass);
		result.append(", sMarketDesc: ");
		result.append(sMarketDesc);
		result.append(", sMarketManager: ");
		result.append(sMarketManager);
		result.append(", sDivisionId: ");
		result.append(sDivisionId);
		result.append(", sDivisionName: ");
		result.append(sDivisionName);
		result.append(", sCompanyId: ");
		result.append(sCompanyId);
		result.append(", sCompanyName: ");
		result.append(sCompanyName);
		result.append(", sStreetNumber: ");
		result.append(sStreetNumber);
		result.append(", sStreetName: ");
		result.append(sStreetName);
		result.append(", sStreetType: ");
		result.append(sStreetType);
		result.append(", sSuiteNumber: ");
		result.append(sSuiteNumber);
		result.append(", sCity: ");
		result.append(sCity);
		result.append(", sCounty: ");
		result.append(sCounty);
		result.append(", sState: ");
		result.append(sState);
		result.append(", sZip: ");
		result.append(sZip);
		result.append(", sCountry: ");
		result.append(sCountry);
		result.append(", sGmtOffset: ");
		result.append(sGmtOffset);
		result.append(", sTaxPrecentage: ");
		result.append(sTaxPrecentage);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
