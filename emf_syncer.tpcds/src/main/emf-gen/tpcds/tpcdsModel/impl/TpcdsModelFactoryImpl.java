/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;
import java.sql.Time;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tpcds.tpcdsModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TpcdsModelFactoryImpl extends EFactoryImpl implements TpcdsModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TpcdsModelFactory init() {
		try {
			TpcdsModelFactory theTpcdsModelFactory = (TpcdsModelFactory)EPackage.Registry.INSTANCE.getEFactory(TpcdsModelPackage.eNS_URI);
			if (theTpcdsModelFactory != null) {
				return theTpcdsModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TpcdsModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpcdsModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TpcdsModelPackage.CALL_CENTER: return createCallCenter();
			case TpcdsModelPackage.CATALOG_PAGE: return createCatalogPage();
			case TpcdsModelPackage.CATALOG_RETURNS: return createCatalogReturns();
			case TpcdsModelPackage.CATALOG_SALES: return createCatalogSales();
			case TpcdsModelPackage.CUSTOMER: return createCustomer();
			case TpcdsModelPackage.CUSTOMER_ADDRESS: return createCustomerAddress();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS: return createCustomerDemographics();
			case TpcdsModelPackage.DATE_DIM: return createDateDim();
			case TpcdsModelPackage.DBGEN_VERSION: return createDbgenVersion();
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS: return createHouseholdDemographics();
			case TpcdsModelPackage.INCOME_BAND: return createIncomeBand();
			case TpcdsModelPackage.INVENTORY: return createInventory();
			case TpcdsModelPackage.ITEM: return createItem();
			case TpcdsModelPackage.PROMOTION: return createPromotion();
			case TpcdsModelPackage.REASON: return createReason();
			case TpcdsModelPackage.SHIP_MODE: return createShipMode();
			case TpcdsModelPackage.STORE: return createStore();
			case TpcdsModelPackage.STORE_RETURNS: return createStoreReturns();
			case TpcdsModelPackage.STORE_RETURNS_ID: return createStoreReturnsId();
			case TpcdsModelPackage.STORE_SALES: return createStoreSales();
			case TpcdsModelPackage.STORE_SALES_ID: return createStoreSalesId();
			case TpcdsModelPackage.TIME_DIM: return createTimeDim();
			case TpcdsModelPackage.WAREHOUSE: return createWarehouse();
			case TpcdsModelPackage.WEB_PAGE: return createWebPage();
			case TpcdsModelPackage.WEB_RETURNS: return createWebReturns();
			case TpcdsModelPackage.WEB_SALES: return createWebSales();
			case TpcdsModelPackage.WEB_SITE: return createWebSite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TpcdsModelPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case TpcdsModelPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TpcdsModelPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case TpcdsModelPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallCenter createCallCenter() {
		CallCenterImpl callCenter = new CallCenterImpl();
		return callCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogPage createCatalogPage() {
		CatalogPageImpl catalogPage = new CatalogPageImpl();
		return catalogPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogReturns createCatalogReturns() {
		CatalogReturnsImpl catalogReturns = new CatalogReturnsImpl();
		return catalogReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogSales createCatalogSales() {
		CatalogSalesImpl catalogSales = new CatalogSalesImpl();
		return catalogSales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerAddress createCustomerAddress() {
		CustomerAddressImpl customerAddress = new CustomerAddressImpl();
		return customerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerDemographics createCustomerDemographics() {
		CustomerDemographicsImpl customerDemographics = new CustomerDemographicsImpl();
		return customerDemographics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateDim createDateDim() {
		DateDimImpl dateDim = new DateDimImpl();
		return dateDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DbgenVersion createDbgenVersion() {
		DbgenVersionImpl dbgenVersion = new DbgenVersionImpl();
		return dbgenVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HouseholdDemographics createHouseholdDemographics() {
		HouseholdDemographicsImpl householdDemographics = new HouseholdDemographicsImpl();
		return householdDemographics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncomeBand createIncomeBand() {
		IncomeBandImpl incomeBand = new IncomeBandImpl();
		return incomeBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Promotion createPromotion() {
		PromotionImpl promotion = new PromotionImpl();
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reason createReason() {
		ReasonImpl reason = new ReasonImpl();
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipMode createShipMode() {
		ShipModeImpl shipMode = new ShipModeImpl();
		return shipMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreReturns createStoreReturns() {
		StoreReturnsImpl storeReturns = new StoreReturnsImpl();
		return storeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreReturnsId createStoreReturnsId() {
		StoreReturnsIdImpl storeReturnsId = new StoreReturnsIdImpl();
		return storeReturnsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreSales createStoreSales() {
		StoreSalesImpl storeSales = new StoreSalesImpl();
		return storeSales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreSalesId createStoreSalesId() {
		StoreSalesIdImpl storeSalesId = new StoreSalesIdImpl();
		return storeSalesId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeDim createTimeDim() {
		TimeDimImpl timeDim = new TimeDimImpl();
		return timeDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Warehouse createWarehouse() {
		WarehouseImpl warehouse = new WarehouseImpl();
		return warehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebPage createWebPage() {
		WebPageImpl webPage = new WebPageImpl();
		return webPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebReturns createWebReturns() {
		WebReturnsImpl webReturns = new WebReturnsImpl();
		return webReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSales createWebSales() {
		WebSalesImpl webSales = new WebSalesImpl();
		return webSales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSite createWebSite() {
		WebSiteImpl webSite = new WebSiteImpl();
		return webSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTimeFromString(EDataType eDataType, String initialValue) {
		return (Time)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TpcdsModelPackage getTpcdsModelPackage() {
		return (TpcdsModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TpcdsModelPackage getPackage() {
		return TpcdsModelPackage.eINSTANCE;
	}

} //TpcdsModelFactoryImpl
