/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;
import java.sql.Time;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tpcds.tpcdsModel.CallCenter;
import tpcds.tpcdsModel.CatalogPage;
import tpcds.tpcdsModel.CatalogReturns;
import tpcds.tpcdsModel.CatalogSales;
import tpcds.tpcdsModel.Customer;
import tpcds.tpcdsModel.CustomerAddress;
import tpcds.tpcdsModel.CustomerDemographics;
import tpcds.tpcdsModel.DateDim;
import tpcds.tpcdsModel.DbgenVersion;
import tpcds.tpcdsModel.HouseholdDemographics;
import tpcds.tpcdsModel.IncomeBand;
import tpcds.tpcdsModel.Inventory;
import tpcds.tpcdsModel.Item;
import tpcds.tpcdsModel.Promotion;
import tpcds.tpcdsModel.Reason;
import tpcds.tpcdsModel.ShipMode;
import tpcds.tpcdsModel.Store;
import tpcds.tpcdsModel.StoreReturns;
import tpcds.tpcdsModel.StoreReturnsId;
import tpcds.tpcdsModel.StoreSales;
import tpcds.tpcdsModel.StoreSalesId;
import tpcds.tpcdsModel.TimeDim;
import tpcds.tpcdsModel.TpcdsModelFactory;
import tpcds.tpcdsModel.TpcdsModelPackage;
import tpcds.tpcdsModel.Warehouse;
import tpcds.tpcdsModel.WebPage;
import tpcds.tpcdsModel.WebReturns;
import tpcds.tpcdsModel.WebSales;
import tpcds.tpcdsModel.WebSite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TpcdsModelPackageImpl extends EPackageImpl implements TpcdsModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogReturnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogSalesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerDemographicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateDimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbgenVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass householdDemographicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomeBandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeReturnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeReturnsIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeSalesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeSalesIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warehouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webReturnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSalesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TpcdsModelPackageImpl() {
		super(eNS_URI, TpcdsModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TpcdsModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TpcdsModelPackage init() {
		if (isInited) return (TpcdsModelPackage)EPackage.Registry.INSTANCE.getEPackage(TpcdsModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTpcdsModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TpcdsModelPackageImpl theTpcdsModelPackage = registeredTpcdsModelPackage instanceof TpcdsModelPackageImpl ? (TpcdsModelPackageImpl)registeredTpcdsModelPackage : new TpcdsModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTpcdsModelPackage.createPackageContents();

		// Initialize created meta-data
		theTpcdsModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTpcdsModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TpcdsModelPackage.eNS_URI, theTpcdsModelPackage);
		return theTpcdsModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallCenter() {
		return callCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCallCenterSk() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCallCenterId() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcRecStartDate() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcRecEndDate() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcClosedDateSk() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcOpenDateSk() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcName() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcClass() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcEmployees() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcSqFt() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcHours() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcManager() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcMktId() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcMktClass() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcMktDesc() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcMarketManager() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcDivision() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcDivisionName() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCompany() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCompanyName() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcStreetNumber() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcStreetName() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcStreetType() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcSuiteNumber() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCity() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCounty() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcState() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcZip() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcCountry() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcGmtOffset() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallCenter_CcTaxPercentage() {
		return (EAttribute)callCenterEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogPage() {
		return catalogPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpCatalogPageSk() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpCatalogPageId() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpStartDateSk() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpEndDateSk() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpDepartment() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpCatalogNumber() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpCatalogPageNumber() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpDescription() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogPage_CpType() {
		return (EAttribute)catalogPageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogReturns() {
		return catalogReturnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnedDateSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnedTimeSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrItemSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrRefundedCustomerSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrRefundedCdemoSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrRefundedHdemoSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrRefundedAddrSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturningCustomerSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturningCdemoSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturningHdemoSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturningAddrSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrCallCenterSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrCatalogPageSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrShipModeSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrWarehouseSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReasonSk() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrOrderNumber() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnQuantity() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnAmount() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnTax() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnAmtIncTax() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrFee() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReturnShipCost() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrRefundedCash() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrReversedCharge() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrStoreCredit() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogReturns_CrNetLoss() {
		return (EAttribute)catalogReturnsEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogSales() {
		return catalogSalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsSoldDateSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsSoldTimeSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsShipDateSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsBillCustomerSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsBillCdemoSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsBillHdemoSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsBillAddrSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsShipCustomerSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsShipCdemoSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsShipHdemoSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsShipAddrSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsCallCenterSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsCatalogPageSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsShipModeSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsWarehouseSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsItemSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsPromoSk() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsOrderNumber() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsQuantity() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsWholesaleCost() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsListPrice() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsSalesPrice() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsExtDiscountAmt() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsExtSalesPrice() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsExtWholesaleCost() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsExtListPrice() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsExtTax() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsCouponAmt() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsExtShipCost() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsNetPaid() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsNetPaidIncTax() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsNetPaidIncShip() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsNetPaidIncShipTax() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogSales_CsNetProfit() {
		return (EAttribute)catalogSalesEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CCustomerSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CCustomerId() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CCurrentCdemoSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CCurrentHdemoSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CCurrentAddrSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CFirstShiptoDateSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CFirstSalesDateSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CSalutation() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CFirstName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CLastName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CPreferredCustFlag() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CBirthDay() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CBirthMonth() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CBirthYear() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CBirthCountry() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CLogin() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CEmailAddress() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_CLastReviewDate() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomer_StoreReturns() {
		return (EReference)customerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomer_StoreSales() {
		return (EReference)customerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerAddress() {
		return customerAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaAddressSk() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaAddressId() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaStreetNumber() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaStreetName() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaStreetType() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaSuiteNumber() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaCity() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaCounty() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaState() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaZip() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaCountry() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaGmtOffset() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerAddress_CaLocationType() {
		return (EAttribute)customerAddressEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerDemographics() {
		return customerDemographicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdDemoSk() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdGender() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdMaritalStatus() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdEducationStatus() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdPurchaseEstimate() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdCreditRating() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdDepCount() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdDepEmployedCount() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomerDemographics_CdDepCollegeCount() {
		return (EAttribute)customerDemographicsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateDim() {
		return dateDimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DDateSk() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DDateId() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DDate() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DMonthSeq() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DWeekSeq() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DQuarterSeq() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DYear() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DDow() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DMoy() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DDom() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DQoy() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DFyYear() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DFyQuarterSeq() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DFyWeekSeq() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DDayName() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DQuarterName() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DHoliday() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DWeekend() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DFollowingHoliday() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DFirstDom() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DLastDom() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DSameDayLy() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DSameDayLq() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DCurrentDay() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DCurrentWeek() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DCurrentMonth() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DCurrentQuarter() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateDim_DCurrentYear() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDbgenVersion() {
		return dbgenVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDbgenVersion_DvVersion() {
		return (EAttribute)dbgenVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDbgenVersion_DvCreateDate() {
		return (EAttribute)dbgenVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDbgenVersion_DvCreateTime() {
		return (EAttribute)dbgenVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDbgenVersion_DvCmdlineArgs() {
		return (EAttribute)dbgenVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHouseholdDemographics() {
		return householdDemographicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHouseholdDemographics_HdDemoSk() {
		return (EAttribute)householdDemographicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHouseholdDemographics_HdIncomeBandSk() {
		return (EAttribute)householdDemographicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHouseholdDemographics_HdBuyPotential() {
		return (EAttribute)householdDemographicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHouseholdDemographics_HdDepCount() {
		return (EAttribute)householdDemographicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHouseholdDemographics_HdVehicleCount() {
		return (EAttribute)householdDemographicsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncomeBand() {
		return incomeBandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncomeBand_IbIncomeBandSk() {
		return (EAttribute)incomeBandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncomeBand_IbLowerBound() {
		return (EAttribute)incomeBandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncomeBand_IbUpperBound() {
		return (EAttribute)incomeBandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_InvDateSk() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_InvItemSk() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_InvWarehouseSk() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_InvQuantityOnHand() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IItemSk() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IItemId() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IRecStartDate() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IRecEndDate() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IItemDesc() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_ICurrentPrice() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IWholesaleCost() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IBrandId() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IBrand() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IClassId() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IClass() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_ICategoryId() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_ICategory() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IManufactId() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IManufact() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_ISize() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IFormulation() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IColor() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IUnits() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IContainer() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IManagerId() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_IProductName() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromotion() {
		return promotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PPromoSk() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PPromoId() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PStartDateSk() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PEndDateSk() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PItemSk() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PCost() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PResponseTarget() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PPromoName() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelDmail() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelEmail() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelCatalog() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelTv() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelRadio() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelPress() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelEvent() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelDemo() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PChannelDetails() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PPurpose() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_PDiscountActive() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReason() {
		return reasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReason_RReasonSk() {
		return (EAttribute)reasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReason_RReasonId() {
		return (EAttribute)reasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReason_RReasonDesc() {
		return (EAttribute)reasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipMode() {
		return shipModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipMode_SmShipModeSk() {
		return (EAttribute)shipModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipMode_SmShipModeId() {
		return (EAttribute)shipModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipMode_SmType() {
		return (EAttribute)shipModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipMode_SmCode() {
		return (EAttribute)shipModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipMode_SmCarrier() {
		return (EAttribute)shipModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipMode_SmContract() {
		return (EAttribute)shipModeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SStoreSk() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SStoreId() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SRecStartDate() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SRecEndDate() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SClosedDateSk() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SStoreName() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SNumberEmployees() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SFloorSpace() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SHours() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SManager() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SMarketId() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SGeographyClass() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SMarketDesc() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SMarketManager() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SDivisionId() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SDivisionName() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SCompanyId() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SCompanyName() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SStreetNumber() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SStreetName() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SStreetType() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SSuiteNumber() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SCity() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SCounty() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SState() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SZip() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SCountry() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_SGmtOffset() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_STaxPrecentage() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStore_StoreSales() {
		return (EReference)storeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStore_StoreReturns() {
		return (EReference)storeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreReturns() {
		return storeReturnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreReturns_SrReturnedDateSk() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReturnTimeSk() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreReturns_SrId() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrItemSk() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrTicketNumber() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreReturns_SrCustomerSk() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrCdemoSk() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrHdemoSk() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrAddrSk() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreReturns_SrStoreSk() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReasonSk() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReturnQuantity() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReturnAmt() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReturnTax() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReturnAmtIncTax() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrFee() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReturnShipCost() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrRefundedCash() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrReversedCharge() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrStoreCredit() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturns_SrNetLoss() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreReturnsId() {
		return storeReturnsIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturnsId_SrItemSk() {
		return (EAttribute)storeReturnsIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreReturnsId_SrTicketNumber() {
		return (EAttribute)storeReturnsIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreSales() {
		return storeSalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreSales_SsSoldDateSk() {
		return (EReference)storeSalesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsSoldTimeSk() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsItemSk() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreSales_SsId() {
		return (EReference)storeSalesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreSales_SsCustomerSk() {
		return (EReference)storeSalesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsTicketNumber() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsCdemoSk() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsHdemoSk() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsAddrSk() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreSales_SsStoreSk() {
		return (EReference)storeSalesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsPromoSk() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsQuantity() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsWholesaleCost() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsListPrice() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsSalesPrice() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsExtDiscountAmt() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsExtSalesPrice() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsExtWholesaleCost() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsExtListPrice() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsExtTax() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsCouponAmt() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsNetPaid() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsNetPaidIncTax() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSales_SsNetProfit() {
		return (EAttribute)storeSalesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreSalesId() {
		return storeSalesIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreSalesId_SsCustomerSk() {
		return (EReference)storeSalesIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStoreSalesId_SsTicketNumber() {
		return (EAttribute)storeSalesIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeDim() {
		return timeDimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TTimeSk() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TTimeId() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TTime() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_THour() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TMinute() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TSecond() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TAmPm() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TShift() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TSubShift() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeDim_TMealTime() {
		return (EAttribute)timeDimEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWarehouse() {
		return warehouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WWarehouseSk() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WWarehouseId() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WWarehouseName() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WWarehouseSqFt() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WStreetNumber() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WStreetName() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WStreetType() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WSuiteNumber() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WCity() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WCounty() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WState() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WZip() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WCountry() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWarehouse_WGmtOffset() {
		return (EAttribute)warehouseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebPage() {
		return webPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpWebPageSk() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpWebPageId() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpRecStartDate() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpRecEndDate() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpCreationDateSk() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpAccessDateSk() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpAutogenFlag() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpCustomerSk() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpUrl() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpType() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpCharCount() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpLinkCount() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpImageCount() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebPage_WpMaxAdCount() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebReturns() {
		return webReturnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnedDateSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnedTimeSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrItemSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrRefundedCustomerSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrRefundedCdemoSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrRefundedHdemoSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrRefundedAddrSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturningCustomerSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturningCdemoSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturningHdemoSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturningAddrSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrWebPageSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReasonSk() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrOrderNumber() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnQuantity() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnAmt() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnTax() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnAmtIncTax() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrFee() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReturnShipCost() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrRefundedCash() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrReversedCharge() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrAccountCredit() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebReturns_WrNetLoss() {
		return (EAttribute)webReturnsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebSales() {
		return webSalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsSoldDateSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsSoldTimeSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsShipDateSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsItemSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsBillCustomerSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsBillCdemoSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsBillHdemoSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsBillAddrSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsShipCustomerSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsShipCdemoSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsShipHdemoSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsShipAddrSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsWebPageSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsWebSiteSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsShipModeSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsWarehouseSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsPromoSk() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsOrderNumber() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsQuantity() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsWholesaleCost() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsListPrice() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsSalesPrice() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsExtDiscountAmt() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsExtSalesPrice() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsExtWholesaleCost() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsExtListPrice() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsExtTax() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsCouponAmt() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsExtShipCost() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsNetPaid() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsNetPaidIncTax() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsNetPaidIncShip() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsNetPaidIncShipTax() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSales_WsNetProfit() {
		return (EAttribute)webSalesEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebSite() {
		return webSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebSiteSk() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebSiteId() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebRecStartDate() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebRecEndDate() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebName() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebOpenDateSk() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebCloseDateSk() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebClass() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebManager() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebMktId() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebMktClass() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebMktDesc() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebMarketManager() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebCompanyId() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebCompanyName() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebStreetNumber() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebStreetName() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebStreetType() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebSuiteNumber() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebCity() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebCounty() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebState() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebZip() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebCountry() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebGmtOffset() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSite_WebTaxPercentage() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTime() {
		return timeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TpcdsModelFactory getTpcdsModelFactory() {
		return (TpcdsModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callCenterEClass = createEClass(CALL_CENTER);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_CALL_CENTER_SK);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_CALL_CENTER_ID);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_REC_START_DATE);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_REC_END_DATE);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_CLOSED_DATE_SK);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_OPEN_DATE_SK);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_NAME);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_CLASS);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_EMPLOYEES);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_SQ_FT);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_HOURS);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_MANAGER);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_MKT_ID);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_MKT_CLASS);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_MKT_DESC);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_MARKET_MANAGER);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_DIVISION);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_DIVISION_NAME);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_COMPANY);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_COMPANY_NAME);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_STREET_NUMBER);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_STREET_NAME);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_STREET_TYPE);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_SUITE_NUMBER);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_CITY);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_COUNTY);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_STATE);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_ZIP);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_COUNTRY);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_GMT_OFFSET);
		createEAttribute(callCenterEClass, CALL_CENTER__CC_TAX_PERCENTAGE);

		catalogPageEClass = createEClass(CATALOG_PAGE);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_CATALOG_PAGE_SK);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_CATALOG_PAGE_ID);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_START_DATE_SK);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_END_DATE_SK);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_DEPARTMENT);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_CATALOG_NUMBER);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_DESCRIPTION);
		createEAttribute(catalogPageEClass, CATALOG_PAGE__CP_TYPE);

		catalogReturnsEClass = createEClass(CATALOG_RETURNS);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURNED_DATE_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURNED_TIME_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_ITEM_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REFUNDED_ADDR_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURNING_CDEMO_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURNING_HDEMO_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURNING_ADDR_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_CALL_CENTER_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_CATALOG_PAGE_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_SHIP_MODE_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_WAREHOUSE_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REASON_SK);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_ORDER_NUMBER);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURN_QUANTITY);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURN_AMOUNT);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURN_TAX);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_FEE);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_RETURN_SHIP_COST);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REFUNDED_CASH);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_REVERSED_CHARGE);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_STORE_CREDIT);
		createEAttribute(catalogReturnsEClass, CATALOG_RETURNS__CR_NET_LOSS);

		catalogSalesEClass = createEClass(CATALOG_SALES);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SOLD_DATE_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SOLD_TIME_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SHIP_DATE_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_BILL_CUSTOMER_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_BILL_CDEMO_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_BILL_HDEMO_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_BILL_ADDR_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SHIP_CUSTOMER_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SHIP_CDEMO_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SHIP_HDEMO_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SHIP_ADDR_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_CALL_CENTER_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_CATALOG_PAGE_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SHIP_MODE_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_WAREHOUSE_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_ITEM_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_PROMO_SK);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_ORDER_NUMBER);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_QUANTITY);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_WHOLESALE_COST);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_LIST_PRICE);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_SALES_PRICE);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_EXT_DISCOUNT_AMT);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_EXT_SALES_PRICE);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_EXT_WHOLESALE_COST);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_EXT_LIST_PRICE);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_EXT_TAX);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_COUPON_AMT);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_EXT_SHIP_COST);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_NET_PAID);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_NET_PAID_INC_TAX);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_NET_PAID_INC_SHIP);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX);
		createEAttribute(catalogSalesEClass, CATALOG_SALES__CS_NET_PROFIT);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__CCUSTOMER_SK);
		createEAttribute(customerEClass, CUSTOMER__CCUSTOMER_ID);
		createEAttribute(customerEClass, CUSTOMER__CCURRENT_CDEMO_SK);
		createEAttribute(customerEClass, CUSTOMER__CCURRENT_HDEMO_SK);
		createEAttribute(customerEClass, CUSTOMER__CCURRENT_ADDR_SK);
		createEAttribute(customerEClass, CUSTOMER__CFIRST_SHIPTO_DATE_SK);
		createEAttribute(customerEClass, CUSTOMER__CFIRST_SALES_DATE_SK);
		createEAttribute(customerEClass, CUSTOMER__CSALUTATION);
		createEAttribute(customerEClass, CUSTOMER__CFIRST_NAME);
		createEAttribute(customerEClass, CUSTOMER__CLAST_NAME);
		createEAttribute(customerEClass, CUSTOMER__CPREFERRED_CUST_FLAG);
		createEAttribute(customerEClass, CUSTOMER__CBIRTH_DAY);
		createEAttribute(customerEClass, CUSTOMER__CBIRTH_MONTH);
		createEAttribute(customerEClass, CUSTOMER__CBIRTH_YEAR);
		createEAttribute(customerEClass, CUSTOMER__CBIRTH_COUNTRY);
		createEAttribute(customerEClass, CUSTOMER__CLOGIN);
		createEAttribute(customerEClass, CUSTOMER__CEMAIL_ADDRESS);
		createEAttribute(customerEClass, CUSTOMER__CLAST_REVIEW_DATE);
		createEReference(customerEClass, CUSTOMER__STORE_RETURNS);
		createEReference(customerEClass, CUSTOMER__STORE_SALES);

		customerAddressEClass = createEClass(CUSTOMER_ADDRESS);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_ADDRESS_SK);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_ADDRESS_ID);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_STREET_NUMBER);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_STREET_NAME);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_STREET_TYPE);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_SUITE_NUMBER);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_CITY);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_COUNTY);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_STATE);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_ZIP);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_COUNTRY);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_GMT_OFFSET);
		createEAttribute(customerAddressEClass, CUSTOMER_ADDRESS__CA_LOCATION_TYPE);

		customerDemographicsEClass = createEClass(CUSTOMER_DEMOGRAPHICS);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_GENDER);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT);
		createEAttribute(customerDemographicsEClass, CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT);

		dateDimEClass = createEClass(DATE_DIM);
		createEAttribute(dateDimEClass, DATE_DIM__DDATE_SK);
		createEAttribute(dateDimEClass, DATE_DIM__DDATE_ID);
		createEAttribute(dateDimEClass, DATE_DIM__DDATE);
		createEAttribute(dateDimEClass, DATE_DIM__DMONTH_SEQ);
		createEAttribute(dateDimEClass, DATE_DIM__DWEEK_SEQ);
		createEAttribute(dateDimEClass, DATE_DIM__DQUARTER_SEQ);
		createEAttribute(dateDimEClass, DATE_DIM__DYEAR);
		createEAttribute(dateDimEClass, DATE_DIM__DDOW);
		createEAttribute(dateDimEClass, DATE_DIM__DMOY);
		createEAttribute(dateDimEClass, DATE_DIM__DDOM);
		createEAttribute(dateDimEClass, DATE_DIM__DQOY);
		createEAttribute(dateDimEClass, DATE_DIM__DFY_YEAR);
		createEAttribute(dateDimEClass, DATE_DIM__DFY_QUARTER_SEQ);
		createEAttribute(dateDimEClass, DATE_DIM__DFY_WEEK_SEQ);
		createEAttribute(dateDimEClass, DATE_DIM__DDAY_NAME);
		createEAttribute(dateDimEClass, DATE_DIM__DQUARTER_NAME);
		createEAttribute(dateDimEClass, DATE_DIM__DHOLIDAY);
		createEAttribute(dateDimEClass, DATE_DIM__DWEEKEND);
		createEAttribute(dateDimEClass, DATE_DIM__DFOLLOWING_HOLIDAY);
		createEAttribute(dateDimEClass, DATE_DIM__DFIRST_DOM);
		createEAttribute(dateDimEClass, DATE_DIM__DLAST_DOM);
		createEAttribute(dateDimEClass, DATE_DIM__DSAME_DAY_LY);
		createEAttribute(dateDimEClass, DATE_DIM__DSAME_DAY_LQ);
		createEAttribute(dateDimEClass, DATE_DIM__DCURRENT_DAY);
		createEAttribute(dateDimEClass, DATE_DIM__DCURRENT_WEEK);
		createEAttribute(dateDimEClass, DATE_DIM__DCURRENT_MONTH);
		createEAttribute(dateDimEClass, DATE_DIM__DCURRENT_QUARTER);
		createEAttribute(dateDimEClass, DATE_DIM__DCURRENT_YEAR);

		dbgenVersionEClass = createEClass(DBGEN_VERSION);
		createEAttribute(dbgenVersionEClass, DBGEN_VERSION__DV_VERSION);
		createEAttribute(dbgenVersionEClass, DBGEN_VERSION__DV_CREATE_DATE);
		createEAttribute(dbgenVersionEClass, DBGEN_VERSION__DV_CREATE_TIME);
		createEAttribute(dbgenVersionEClass, DBGEN_VERSION__DV_CMDLINE_ARGS);

		householdDemographicsEClass = createEClass(HOUSEHOLD_DEMOGRAPHICS);
		createEAttribute(householdDemographicsEClass, HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK);
		createEAttribute(householdDemographicsEClass, HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK);
		createEAttribute(householdDemographicsEClass, HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL);
		createEAttribute(householdDemographicsEClass, HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT);
		createEAttribute(householdDemographicsEClass, HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT);

		incomeBandEClass = createEClass(INCOME_BAND);
		createEAttribute(incomeBandEClass, INCOME_BAND__IB_INCOME_BAND_SK);
		createEAttribute(incomeBandEClass, INCOME_BAND__IB_LOWER_BOUND);
		createEAttribute(incomeBandEClass, INCOME_BAND__IB_UPPER_BOUND);

		inventoryEClass = createEClass(INVENTORY);
		createEAttribute(inventoryEClass, INVENTORY__INV_DATE_SK);
		createEAttribute(inventoryEClass, INVENTORY__INV_ITEM_SK);
		createEAttribute(inventoryEClass, INVENTORY__INV_WAREHOUSE_SK);
		createEAttribute(inventoryEClass, INVENTORY__INV_QUANTITY_ON_HAND);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__IITEM_SK);
		createEAttribute(itemEClass, ITEM__IITEM_ID);
		createEAttribute(itemEClass, ITEM__IREC_START_DATE);
		createEAttribute(itemEClass, ITEM__IREC_END_DATE);
		createEAttribute(itemEClass, ITEM__IITEM_DESC);
		createEAttribute(itemEClass, ITEM__ICURRENT_PRICE);
		createEAttribute(itemEClass, ITEM__IWHOLESALE_COST);
		createEAttribute(itemEClass, ITEM__IBRAND_ID);
		createEAttribute(itemEClass, ITEM__IBRAND);
		createEAttribute(itemEClass, ITEM__ICLASS_ID);
		createEAttribute(itemEClass, ITEM__ICLASS);
		createEAttribute(itemEClass, ITEM__ICATEGORY_ID);
		createEAttribute(itemEClass, ITEM__ICATEGORY);
		createEAttribute(itemEClass, ITEM__IMANUFACT_ID);
		createEAttribute(itemEClass, ITEM__IMANUFACT);
		createEAttribute(itemEClass, ITEM__ISIZE);
		createEAttribute(itemEClass, ITEM__IFORMULATION);
		createEAttribute(itemEClass, ITEM__ICOLOR);
		createEAttribute(itemEClass, ITEM__IUNITS);
		createEAttribute(itemEClass, ITEM__ICONTAINER);
		createEAttribute(itemEClass, ITEM__IMANAGER_ID);
		createEAttribute(itemEClass, ITEM__IPRODUCT_NAME);

		promotionEClass = createEClass(PROMOTION);
		createEAttribute(promotionEClass, PROMOTION__PPROMO_SK);
		createEAttribute(promotionEClass, PROMOTION__PPROMO_ID);
		createEAttribute(promotionEClass, PROMOTION__PSTART_DATE_SK);
		createEAttribute(promotionEClass, PROMOTION__PEND_DATE_SK);
		createEAttribute(promotionEClass, PROMOTION__PITEM_SK);
		createEAttribute(promotionEClass, PROMOTION__PCOST);
		createEAttribute(promotionEClass, PROMOTION__PRESPONSE_TARGET);
		createEAttribute(promotionEClass, PROMOTION__PPROMO_NAME);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_DMAIL);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_EMAIL);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_CATALOG);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_TV);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_RADIO);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_PRESS);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_EVENT);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_DEMO);
		createEAttribute(promotionEClass, PROMOTION__PCHANNEL_DETAILS);
		createEAttribute(promotionEClass, PROMOTION__PPURPOSE);
		createEAttribute(promotionEClass, PROMOTION__PDISCOUNT_ACTIVE);

		reasonEClass = createEClass(REASON);
		createEAttribute(reasonEClass, REASON__RREASON_SK);
		createEAttribute(reasonEClass, REASON__RREASON_ID);
		createEAttribute(reasonEClass, REASON__RREASON_DESC);

		shipModeEClass = createEClass(SHIP_MODE);
		createEAttribute(shipModeEClass, SHIP_MODE__SM_SHIP_MODE_SK);
		createEAttribute(shipModeEClass, SHIP_MODE__SM_SHIP_MODE_ID);
		createEAttribute(shipModeEClass, SHIP_MODE__SM_TYPE);
		createEAttribute(shipModeEClass, SHIP_MODE__SM_CODE);
		createEAttribute(shipModeEClass, SHIP_MODE__SM_CARRIER);
		createEAttribute(shipModeEClass, SHIP_MODE__SM_CONTRACT);

		storeEClass = createEClass(STORE);
		createEAttribute(storeEClass, STORE__SSTORE_SK);
		createEAttribute(storeEClass, STORE__SSTORE_ID);
		createEAttribute(storeEClass, STORE__SREC_START_DATE);
		createEAttribute(storeEClass, STORE__SREC_END_DATE);
		createEAttribute(storeEClass, STORE__SCLOSED_DATE_SK);
		createEAttribute(storeEClass, STORE__SSTORE_NAME);
		createEAttribute(storeEClass, STORE__SNUMBER_EMPLOYEES);
		createEAttribute(storeEClass, STORE__SFLOOR_SPACE);
		createEAttribute(storeEClass, STORE__SHOURS);
		createEAttribute(storeEClass, STORE__SMANAGER);
		createEAttribute(storeEClass, STORE__SMARKET_ID);
		createEAttribute(storeEClass, STORE__SGEOGRAPHY_CLASS);
		createEAttribute(storeEClass, STORE__SMARKET_DESC);
		createEAttribute(storeEClass, STORE__SMARKET_MANAGER);
		createEAttribute(storeEClass, STORE__SDIVISION_ID);
		createEAttribute(storeEClass, STORE__SDIVISION_NAME);
		createEAttribute(storeEClass, STORE__SCOMPANY_ID);
		createEAttribute(storeEClass, STORE__SCOMPANY_NAME);
		createEAttribute(storeEClass, STORE__SSTREET_NUMBER);
		createEAttribute(storeEClass, STORE__SSTREET_NAME);
		createEAttribute(storeEClass, STORE__SSTREET_TYPE);
		createEAttribute(storeEClass, STORE__SSUITE_NUMBER);
		createEAttribute(storeEClass, STORE__SCITY);
		createEAttribute(storeEClass, STORE__SCOUNTY);
		createEAttribute(storeEClass, STORE__SSTATE);
		createEAttribute(storeEClass, STORE__SZIP);
		createEAttribute(storeEClass, STORE__SCOUNTRY);
		createEAttribute(storeEClass, STORE__SGMT_OFFSET);
		createEAttribute(storeEClass, STORE__STAX_PRECENTAGE);
		createEReference(storeEClass, STORE__STORE_SALES);
		createEReference(storeEClass, STORE__STORE_RETURNS);

		storeReturnsEClass = createEClass(STORE_RETURNS);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_RETURNED_DATE_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_TIME_SK);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_ID);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_ITEM_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_TICKET_NUMBER);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_CUSTOMER_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_CDEMO_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_HDEMO_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_ADDR_SK);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_STORE_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_REASON_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_QUANTITY);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_AMT);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_TAX);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_AMT_INC_TAX);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_FEE);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_SHIP_COST);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_REFUNDED_CASH);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_REVERSED_CHARGE);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_STORE_CREDIT);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_NET_LOSS);

		storeReturnsIdEClass = createEClass(STORE_RETURNS_ID);
		createEAttribute(storeReturnsIdEClass, STORE_RETURNS_ID__SR_ITEM_SK);
		createEAttribute(storeReturnsIdEClass, STORE_RETURNS_ID__SR_TICKET_NUMBER);

		storeSalesEClass = createEClass(STORE_SALES);
		createEReference(storeSalesEClass, STORE_SALES__SS_SOLD_DATE_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_SOLD_TIME_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_ITEM_SK);
		createEReference(storeSalesEClass, STORE_SALES__SS_ID);
		createEReference(storeSalesEClass, STORE_SALES__SS_CUSTOMER_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_TICKET_NUMBER);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_CDEMO_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_HDEMO_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_ADDR_SK);
		createEReference(storeSalesEClass, STORE_SALES__SS_STORE_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_PROMO_SK);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_QUANTITY);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_WHOLESALE_COST);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_LIST_PRICE);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_SALES_PRICE);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_EXT_DISCOUNT_AMT);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_EXT_SALES_PRICE);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_EXT_WHOLESALE_COST);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_EXT_LIST_PRICE);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_EXT_TAX);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_COUPON_AMT);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_NET_PAID);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_NET_PAID_INC_TAX);
		createEAttribute(storeSalesEClass, STORE_SALES__SS_NET_PROFIT);

		storeSalesIdEClass = createEClass(STORE_SALES_ID);
		createEReference(storeSalesIdEClass, STORE_SALES_ID__SS_CUSTOMER_SK);
		createEAttribute(storeSalesIdEClass, STORE_SALES_ID__SS_TICKET_NUMBER);

		timeDimEClass = createEClass(TIME_DIM);
		createEAttribute(timeDimEClass, TIME_DIM__TTIME_SK);
		createEAttribute(timeDimEClass, TIME_DIM__TTIME_ID);
		createEAttribute(timeDimEClass, TIME_DIM__TTIME);
		createEAttribute(timeDimEClass, TIME_DIM__THOUR);
		createEAttribute(timeDimEClass, TIME_DIM__TMINUTE);
		createEAttribute(timeDimEClass, TIME_DIM__TSECOND);
		createEAttribute(timeDimEClass, TIME_DIM__TAM_PM);
		createEAttribute(timeDimEClass, TIME_DIM__TSHIFT);
		createEAttribute(timeDimEClass, TIME_DIM__TSUB_SHIFT);
		createEAttribute(timeDimEClass, TIME_DIM__TMEAL_TIME);

		warehouseEClass = createEClass(WAREHOUSE);
		createEAttribute(warehouseEClass, WAREHOUSE__WWAREHOUSE_SK);
		createEAttribute(warehouseEClass, WAREHOUSE__WWAREHOUSE_ID);
		createEAttribute(warehouseEClass, WAREHOUSE__WWAREHOUSE_NAME);
		createEAttribute(warehouseEClass, WAREHOUSE__WWAREHOUSE_SQ_FT);
		createEAttribute(warehouseEClass, WAREHOUSE__WSTREET_NUMBER);
		createEAttribute(warehouseEClass, WAREHOUSE__WSTREET_NAME);
		createEAttribute(warehouseEClass, WAREHOUSE__WSTREET_TYPE);
		createEAttribute(warehouseEClass, WAREHOUSE__WSUITE_NUMBER);
		createEAttribute(warehouseEClass, WAREHOUSE__WCITY);
		createEAttribute(warehouseEClass, WAREHOUSE__WCOUNTY);
		createEAttribute(warehouseEClass, WAREHOUSE__WSTATE);
		createEAttribute(warehouseEClass, WAREHOUSE__WZIP);
		createEAttribute(warehouseEClass, WAREHOUSE__WCOUNTRY);
		createEAttribute(warehouseEClass, WAREHOUSE__WGMT_OFFSET);

		webPageEClass = createEClass(WEB_PAGE);
		createEAttribute(webPageEClass, WEB_PAGE__WP_WEB_PAGE_SK);
		createEAttribute(webPageEClass, WEB_PAGE__WP_WEB_PAGE_ID);
		createEAttribute(webPageEClass, WEB_PAGE__WP_REC_START_DATE);
		createEAttribute(webPageEClass, WEB_PAGE__WP_REC_END_DATE);
		createEAttribute(webPageEClass, WEB_PAGE__WP_CREATION_DATE_SK);
		createEAttribute(webPageEClass, WEB_PAGE__WP_ACCESS_DATE_SK);
		createEAttribute(webPageEClass, WEB_PAGE__WP_AUTOGEN_FLAG);
		createEAttribute(webPageEClass, WEB_PAGE__WP_CUSTOMER_SK);
		createEAttribute(webPageEClass, WEB_PAGE__WP_URL);
		createEAttribute(webPageEClass, WEB_PAGE__WP_TYPE);
		createEAttribute(webPageEClass, WEB_PAGE__WP_CHAR_COUNT);
		createEAttribute(webPageEClass, WEB_PAGE__WP_LINK_COUNT);
		createEAttribute(webPageEClass, WEB_PAGE__WP_IMAGE_COUNT);
		createEAttribute(webPageEClass, WEB_PAGE__WP_MAX_AD_COUNT);

		webReturnsEClass = createEClass(WEB_RETURNS);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURNED_DATE_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURNED_TIME_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_ITEM_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REFUNDED_CDEMO_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REFUNDED_HDEMO_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REFUNDED_ADDR_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURNING_CUSTOMER_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURNING_CDEMO_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURNING_HDEMO_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURNING_ADDR_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_WEB_PAGE_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REASON_SK);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_ORDER_NUMBER);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURN_QUANTITY);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURN_AMT);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURN_TAX);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURN_AMT_INC_TAX);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_FEE);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_RETURN_SHIP_COST);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REFUNDED_CASH);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_REVERSED_CHARGE);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_ACCOUNT_CREDIT);
		createEAttribute(webReturnsEClass, WEB_RETURNS__WR_NET_LOSS);

		webSalesEClass = createEClass(WEB_SALES);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SOLD_DATE_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SOLD_TIME_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SHIP_DATE_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_ITEM_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_BILL_CUSTOMER_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_BILL_CDEMO_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_BILL_HDEMO_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_BILL_ADDR_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SHIP_CUSTOMER_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SHIP_CDEMO_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SHIP_HDEMO_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SHIP_ADDR_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_WEB_PAGE_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_WEB_SITE_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SHIP_MODE_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_WAREHOUSE_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_PROMO_SK);
		createEAttribute(webSalesEClass, WEB_SALES__WS_ORDER_NUMBER);
		createEAttribute(webSalesEClass, WEB_SALES__WS_QUANTITY);
		createEAttribute(webSalesEClass, WEB_SALES__WS_WHOLESALE_COST);
		createEAttribute(webSalesEClass, WEB_SALES__WS_LIST_PRICE);
		createEAttribute(webSalesEClass, WEB_SALES__WS_SALES_PRICE);
		createEAttribute(webSalesEClass, WEB_SALES__WS_EXT_DISCOUNT_AMT);
		createEAttribute(webSalesEClass, WEB_SALES__WS_EXT_SALES_PRICE);
		createEAttribute(webSalesEClass, WEB_SALES__WS_EXT_WHOLESALE_COST);
		createEAttribute(webSalesEClass, WEB_SALES__WS_EXT_LIST_PRICE);
		createEAttribute(webSalesEClass, WEB_SALES__WS_EXT_TAX);
		createEAttribute(webSalesEClass, WEB_SALES__WS_COUPON_AMT);
		createEAttribute(webSalesEClass, WEB_SALES__WS_EXT_SHIP_COST);
		createEAttribute(webSalesEClass, WEB_SALES__WS_NET_PAID);
		createEAttribute(webSalesEClass, WEB_SALES__WS_NET_PAID_INC_TAX);
		createEAttribute(webSalesEClass, WEB_SALES__WS_NET_PAID_INC_SHIP);
		createEAttribute(webSalesEClass, WEB_SALES__WS_NET_PAID_INC_SHIP_TAX);
		createEAttribute(webSalesEClass, WEB_SALES__WS_NET_PROFIT);

		webSiteEClass = createEClass(WEB_SITE);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_SITE_SK);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_SITE_ID);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_REC_START_DATE);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_REC_END_DATE);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_NAME);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_OPEN_DATE_SK);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_CLOSE_DATE_SK);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_CLASS);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_MANAGER);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_MKT_ID);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_MKT_CLASS);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_MKT_DESC);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_MARKET_MANAGER);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_COMPANY_ID);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_COMPANY_NAME);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_STREET_NUMBER);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_STREET_NAME);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_STREET_TYPE);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_SUITE_NUMBER);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_CITY);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_COUNTY);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_STATE);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_ZIP);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_COUNTRY);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_GMT_OFFSET);
		createEAttribute(webSiteEClass, WEB_SITE__WEB_TAX_PERCENTAGE);

		// Create data types
		dateEDataType = createEDataType(DATE);
		timeEDataType = createEDataType(TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(callCenterEClass, CallCenter.class, "CallCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallCenter_CcCallCenterSk(), ecorePackage.getELongObject(), "ccCallCenterSk", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcCallCenterId(), ecorePackage.getEString(), "ccCallCenterId", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcRecStartDate(), this.getDate(), "ccRecStartDate", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcRecEndDate(), this.getDate(), "ccRecEndDate", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcClosedDateSk(), ecorePackage.getELongObject(), "ccClosedDateSk", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcOpenDateSk(), ecorePackage.getELongObject(), "ccOpenDateSk", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcName(), ecorePackage.getEString(), "ccName", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcClass(), ecorePackage.getEString(), "ccClass", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcEmployees(), ecorePackage.getELongObject(), "ccEmployees", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcSqFt(), ecorePackage.getELongObject(), "ccSqFt", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcHours(), ecorePackage.getEString(), "ccHours", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcManager(), ecorePackage.getEString(), "ccManager", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcMktId(), ecorePackage.getELongObject(), "ccMktId", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcMktClass(), ecorePackage.getEString(), "ccMktClass", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcMktDesc(), ecorePackage.getEString(), "ccMktDesc", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcMarketManager(), ecorePackage.getEString(), "ccMarketManager", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcDivision(), ecorePackage.getELongObject(), "ccDivision", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcDivisionName(), ecorePackage.getEString(), "ccDivisionName", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcCompany(), ecorePackage.getELongObject(), "ccCompany", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcCompanyName(), ecorePackage.getEString(), "ccCompanyName", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcStreetNumber(), ecorePackage.getEString(), "ccStreetNumber", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcStreetName(), ecorePackage.getEString(), "ccStreetName", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcStreetType(), ecorePackage.getEString(), "ccStreetType", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcSuiteNumber(), ecorePackage.getEString(), "ccSuiteNumber", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcCity(), ecorePackage.getEString(), "ccCity", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcCounty(), ecorePackage.getEString(), "ccCounty", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcState(), ecorePackage.getEString(), "ccState", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcZip(), ecorePackage.getEString(), "ccZip", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcCountry(), ecorePackage.getEString(), "ccCountry", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcGmtOffset(), ecorePackage.getEDouble(), "ccGmtOffset", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallCenter_CcTaxPercentage(), ecorePackage.getEDouble(), "ccTaxPercentage", null, 0, 1, CallCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogPageEClass, CatalogPage.class, "CatalogPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogPage_CpCatalogPageSk(), ecorePackage.getELongObject(), "cpCatalogPageSk", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpCatalogPageId(), ecorePackage.getEString(), "cpCatalogPageId", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpStartDateSk(), ecorePackage.getELongObject(), "cpStartDateSk", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpEndDateSk(), ecorePackage.getELongObject(), "cpEndDateSk", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpDepartment(), ecorePackage.getEString(), "cpDepartment", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpCatalogNumber(), ecorePackage.getELongObject(), "cpCatalogNumber", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpCatalogPageNumber(), ecorePackage.getELongObject(), "cpCatalogPageNumber", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpDescription(), ecorePackage.getEString(), "cpDescription", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogPage_CpType(), ecorePackage.getEString(), "cpType", null, 0, 1, CatalogPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogReturnsEClass, CatalogReturns.class, "CatalogReturns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogReturns_CrReturnedDateSk(), ecorePackage.getELongObject(), "crReturnedDateSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturnedTimeSk(), ecorePackage.getELongObject(), "crReturnedTimeSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrItemSk(), ecorePackage.getELongObject(), "crItemSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrRefundedCustomerSk(), ecorePackage.getELongObject(), "crRefundedCustomerSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrRefundedCdemoSk(), ecorePackage.getELongObject(), "crRefundedCdemoSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrRefundedHdemoSk(), ecorePackage.getELongObject(), "crRefundedHdemoSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrRefundedAddrSk(), ecorePackage.getELongObject(), "crRefundedAddrSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturningCustomerSk(), ecorePackage.getELongObject(), "crReturningCustomerSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturningCdemoSk(), ecorePackage.getELongObject(), "crReturningCdemoSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturningHdemoSk(), ecorePackage.getELongObject(), "crReturningHdemoSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturningAddrSk(), ecorePackage.getELongObject(), "crReturningAddrSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrCallCenterSk(), ecorePackage.getELongObject(), "crCallCenterSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrCatalogPageSk(), ecorePackage.getELongObject(), "crCatalogPageSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrShipModeSk(), ecorePackage.getELongObject(), "crShipModeSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrWarehouseSk(), ecorePackage.getELongObject(), "crWarehouseSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReasonSk(), ecorePackage.getELongObject(), "crReasonSk", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrOrderNumber(), ecorePackage.getELongObject(), "crOrderNumber", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturnQuantity(), ecorePackage.getELongObject(), "crReturnQuantity", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturnAmount(), ecorePackage.getEDouble(), "crReturnAmount", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturnTax(), ecorePackage.getEDouble(), "crReturnTax", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturnAmtIncTax(), ecorePackage.getEDouble(), "crReturnAmtIncTax", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrFee(), ecorePackage.getEDouble(), "crFee", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReturnShipCost(), ecorePackage.getEDouble(), "crReturnShipCost", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrRefundedCash(), ecorePackage.getEDouble(), "crRefundedCash", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrReversedCharge(), ecorePackage.getEDouble(), "crReversedCharge", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrStoreCredit(), ecorePackage.getEDouble(), "crStoreCredit", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogReturns_CrNetLoss(), ecorePackage.getEDouble(), "crNetLoss", null, 0, 1, CatalogReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogSalesEClass, CatalogSales.class, "CatalogSales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogSales_CsSoldDateSk(), ecorePackage.getELongObject(), "csSoldDateSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsSoldTimeSk(), ecorePackage.getELongObject(), "csSoldTimeSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsShipDateSk(), ecorePackage.getELongObject(), "csShipDateSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsBillCustomerSk(), ecorePackage.getELongObject(), "csBillCustomerSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsBillCdemoSk(), ecorePackage.getELongObject(), "csBillCdemoSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsBillHdemoSk(), ecorePackage.getELongObject(), "csBillHdemoSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsBillAddrSk(), ecorePackage.getELongObject(), "csBillAddrSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsShipCustomerSk(), ecorePackage.getELongObject(), "csShipCustomerSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsShipCdemoSk(), ecorePackage.getELongObject(), "csShipCdemoSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsShipHdemoSk(), ecorePackage.getELongObject(), "csShipHdemoSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsShipAddrSk(), ecorePackage.getELongObject(), "csShipAddrSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsCallCenterSk(), ecorePackage.getELongObject(), "csCallCenterSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsCatalogPageSk(), ecorePackage.getELongObject(), "csCatalogPageSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsShipModeSk(), ecorePackage.getELongObject(), "csShipModeSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsWarehouseSk(), ecorePackage.getELongObject(), "csWarehouseSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsItemSk(), ecorePackage.getELongObject(), "csItemSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsPromoSk(), ecorePackage.getELongObject(), "csPromoSk", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsOrderNumber(), ecorePackage.getELongObject(), "csOrderNumber", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsQuantity(), ecorePackage.getELongObject(), "csQuantity", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsWholesaleCost(), ecorePackage.getEDouble(), "csWholesaleCost", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsListPrice(), ecorePackage.getEDouble(), "csListPrice", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsSalesPrice(), ecorePackage.getEDouble(), "csSalesPrice", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsExtDiscountAmt(), ecorePackage.getEDouble(), "csExtDiscountAmt", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsExtSalesPrice(), ecorePackage.getEDouble(), "csExtSalesPrice", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsExtWholesaleCost(), ecorePackage.getEDouble(), "csExtWholesaleCost", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsExtListPrice(), ecorePackage.getEDouble(), "csExtListPrice", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsExtTax(), ecorePackage.getEDouble(), "csExtTax", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsCouponAmt(), ecorePackage.getEDouble(), "csCouponAmt", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsExtShipCost(), ecorePackage.getEDouble(), "csExtShipCost", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsNetPaid(), ecorePackage.getEDouble(), "csNetPaid", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsNetPaidIncTax(), ecorePackage.getEDouble(), "csNetPaidIncTax", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsNetPaidIncShip(), ecorePackage.getEDouble(), "csNetPaidIncShip", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsNetPaidIncShipTax(), ecorePackage.getEDouble(), "csNetPaidIncShipTax", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogSales_CsNetProfit(), ecorePackage.getEDouble(), "csNetProfit", null, 0, 1, CatalogSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_CCustomerSk(), ecorePackage.getELongObject(), "cCustomerSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CCustomerId(), ecorePackage.getEString(), "cCustomerId", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CCurrentCdemoSk(), ecorePackage.getELongObject(), "cCurrentCdemoSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CCurrentHdemoSk(), ecorePackage.getELongObject(), "cCurrentHdemoSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CCurrentAddrSk(), ecorePackage.getELongObject(), "cCurrentAddrSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CFirstShiptoDateSk(), ecorePackage.getELongObject(), "cFirstShiptoDateSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CFirstSalesDateSk(), ecorePackage.getELongObject(), "cFirstSalesDateSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CSalutation(), ecorePackage.getEString(), "cSalutation", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CFirstName(), ecorePackage.getEString(), "cFirstName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CLastName(), ecorePackage.getEString(), "cLastName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CPreferredCustFlag(), ecorePackage.getEString(), "cPreferredCustFlag", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CBirthDay(), ecorePackage.getELongObject(), "cBirthDay", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CBirthMonth(), ecorePackage.getELongObject(), "cBirthMonth", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CBirthYear(), ecorePackage.getELongObject(), "cBirthYear", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CBirthCountry(), ecorePackage.getEString(), "cBirthCountry", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CLogin(), ecorePackage.getEString(), "cLogin", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CEmailAddress(), ecorePackage.getEString(), "cEmailAddress", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CLastReviewDate(), ecorePackage.getEString(), "cLastReviewDate", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_StoreReturns(), this.getStoreReturns(), this.getStoreReturns_SrCustomerSk(), "storeReturns", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_StoreSales(), this.getStoreSales(), this.getStoreSales_SsCustomerSk(), "storeSales", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerAddressEClass, CustomerAddress.class, "CustomerAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerAddress_CaAddressSk(), ecorePackage.getELongObject(), "caAddressSk", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaAddressId(), ecorePackage.getEString(), "caAddressId", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaStreetNumber(), ecorePackage.getEString(), "caStreetNumber", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaStreetName(), ecorePackage.getEString(), "caStreetName", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaStreetType(), ecorePackage.getEString(), "caStreetType", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaSuiteNumber(), ecorePackage.getEString(), "caSuiteNumber", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaCity(), ecorePackage.getEString(), "caCity", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaCounty(), ecorePackage.getEString(), "caCounty", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaState(), ecorePackage.getEString(), "caState", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaZip(), ecorePackage.getEString(), "caZip", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaCountry(), ecorePackage.getEString(), "caCountry", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaGmtOffset(), ecorePackage.getEDouble(), "caGmtOffset", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerAddress_CaLocationType(), ecorePackage.getEString(), "caLocationType", null, 0, 1, CustomerAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerDemographicsEClass, CustomerDemographics.class, "CustomerDemographics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerDemographics_CdDemoSk(), ecorePackage.getELongObject(), "cdDemoSk", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdGender(), ecorePackage.getEString(), "cdGender", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdMaritalStatus(), ecorePackage.getEString(), "cdMaritalStatus", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdEducationStatus(), ecorePackage.getEString(), "cdEducationStatus", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdPurchaseEstimate(), ecorePackage.getELongObject(), "cdPurchaseEstimate", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdCreditRating(), ecorePackage.getEString(), "cdCreditRating", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdDepCount(), ecorePackage.getELongObject(), "cdDepCount", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdDepEmployedCount(), ecorePackage.getELongObject(), "cdDepEmployedCount", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerDemographics_CdDepCollegeCount(), ecorePackage.getELongObject(), "cdDepCollegeCount", null, 0, 1, CustomerDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateDimEClass, DateDim.class, "DateDim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateDim_DDateSk(), ecorePackage.getELongObject(), "dDateSk", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DDateId(), ecorePackage.getEString(), "dDateId", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DDate(), this.getDate(), "dDate", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DMonthSeq(), ecorePackage.getELongObject(), "dMonthSeq", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DWeekSeq(), ecorePackage.getELongObject(), "dWeekSeq", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DQuarterSeq(), ecorePackage.getELongObject(), "dQuarterSeq", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DYear(), ecorePackage.getELongObject(), "dYear", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DDow(), ecorePackage.getELongObject(), "dDow", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DMoy(), ecorePackage.getELongObject(), "dMoy", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DDom(), ecorePackage.getELongObject(), "dDom", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DQoy(), ecorePackage.getELongObject(), "dQoy", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DFyYear(), ecorePackage.getELongObject(), "dFyYear", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DFyQuarterSeq(), ecorePackage.getELongObject(), "dFyQuarterSeq", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DFyWeekSeq(), ecorePackage.getELongObject(), "dFyWeekSeq", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DDayName(), ecorePackage.getEString(), "dDayName", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DQuarterName(), ecorePackage.getEString(), "dQuarterName", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DHoliday(), ecorePackage.getEString(), "dHoliday", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DWeekend(), ecorePackage.getEString(), "dWeekend", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DFollowingHoliday(), ecorePackage.getEString(), "dFollowingHoliday", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DFirstDom(), ecorePackage.getELongObject(), "dFirstDom", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DLastDom(), ecorePackage.getELongObject(), "dLastDom", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DSameDayLy(), ecorePackage.getELongObject(), "dSameDayLy", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DSameDayLq(), ecorePackage.getELongObject(), "dSameDayLq", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DCurrentDay(), ecorePackage.getEString(), "dCurrentDay", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DCurrentWeek(), ecorePackage.getEString(), "dCurrentWeek", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DCurrentMonth(), ecorePackage.getEString(), "dCurrentMonth", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DCurrentQuarter(), ecorePackage.getEString(), "dCurrentQuarter", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DCurrentYear(), ecorePackage.getEString(), "dCurrentYear", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbgenVersionEClass, DbgenVersion.class, "DbgenVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDbgenVersion_DvVersion(), ecorePackage.getEString(), "dvVersion", null, 0, 1, DbgenVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbgenVersion_DvCreateDate(), this.getDate(), "dvCreateDate", null, 0, 1, DbgenVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbgenVersion_DvCreateTime(), this.getTime(), "dvCreateTime", null, 0, 1, DbgenVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbgenVersion_DvCmdlineArgs(), ecorePackage.getEString(), "dvCmdlineArgs", null, 0, 1, DbgenVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(householdDemographicsEClass, HouseholdDemographics.class, "HouseholdDemographics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouseholdDemographics_HdDemoSk(), ecorePackage.getELongObject(), "hdDemoSk", null, 0, 1, HouseholdDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouseholdDemographics_HdIncomeBandSk(), ecorePackage.getELongObject(), "hdIncomeBandSk", null, 0, 1, HouseholdDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouseholdDemographics_HdBuyPotential(), ecorePackage.getEString(), "hdBuyPotential", null, 0, 1, HouseholdDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouseholdDemographics_HdDepCount(), ecorePackage.getELongObject(), "hdDepCount", null, 0, 1, HouseholdDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouseholdDemographics_HdVehicleCount(), ecorePackage.getELongObject(), "hdVehicleCount", null, 0, 1, HouseholdDemographics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomeBandEClass, IncomeBand.class, "IncomeBand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncomeBand_IbIncomeBandSk(), ecorePackage.getELongObject(), "ibIncomeBandSk", null, 0, 1, IncomeBand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncomeBand_IbLowerBound(), ecorePackage.getELongObject(), "ibLowerBound", null, 0, 1, IncomeBand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncomeBand_IbUpperBound(), ecorePackage.getELongObject(), "ibUpperBound", null, 0, 1, IncomeBand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventory_InvDateSk(), ecorePackage.getELongObject(), "invDateSk", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_InvItemSk(), ecorePackage.getELongObject(), "invItemSk", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_InvWarehouseSk(), ecorePackage.getELongObject(), "invWarehouseSk", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_InvQuantityOnHand(), ecorePackage.getELongObject(), "invQuantityOnHand", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_IItemSk(), ecorePackage.getELongObject(), "iItemSk", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IItemId(), ecorePackage.getEString(), "iItemId", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IRecStartDate(), this.getDate(), "iRecStartDate", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IRecEndDate(), this.getDate(), "iRecEndDate", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IItemDesc(), ecorePackage.getEString(), "iItemDesc", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_ICurrentPrice(), ecorePackage.getEDouble(), "iCurrentPrice", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IWholesaleCost(), ecorePackage.getEDouble(), "iWholesaleCost", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IBrandId(), ecorePackage.getELongObject(), "iBrandId", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IBrand(), ecorePackage.getEString(), "iBrand", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IClassId(), ecorePackage.getELongObject(), "iClassId", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IClass(), ecorePackage.getEString(), "iClass", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_ICategoryId(), ecorePackage.getELongObject(), "iCategoryId", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_ICategory(), ecorePackage.getEString(), "iCategory", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IManufactId(), ecorePackage.getELongObject(), "iManufactId", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IManufact(), ecorePackage.getEString(), "iManufact", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_ISize(), ecorePackage.getEString(), "iSize", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IFormulation(), ecorePackage.getEString(), "iFormulation", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IColor(), ecorePackage.getEString(), "iColor", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IUnits(), ecorePackage.getEString(), "iUnits", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IContainer(), ecorePackage.getEString(), "iContainer", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IManagerId(), ecorePackage.getELongObject(), "iManagerId", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IProductName(), ecorePackage.getEString(), "iProductName", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promotionEClass, Promotion.class, "Promotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromotion_PPromoSk(), ecorePackage.getELongObject(), "pPromoSk", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PPromoId(), ecorePackage.getEString(), "pPromoId", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PStartDateSk(), ecorePackage.getELongObject(), "pStartDateSk", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PEndDateSk(), ecorePackage.getELongObject(), "pEndDateSk", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PItemSk(), ecorePackage.getELongObject(), "pItemSk", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PCost(), ecorePackage.getEDouble(), "pCost", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PResponseTarget(), ecorePackage.getELongObject(), "pResponseTarget", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PPromoName(), ecorePackage.getEString(), "pPromoName", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelDmail(), ecorePackage.getEString(), "pChannelDmail", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelEmail(), ecorePackage.getEString(), "pChannelEmail", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelCatalog(), ecorePackage.getEString(), "pChannelCatalog", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelTv(), ecorePackage.getEString(), "pChannelTv", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelRadio(), ecorePackage.getEString(), "pChannelRadio", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelPress(), ecorePackage.getEString(), "pChannelPress", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelEvent(), ecorePackage.getEString(), "pChannelEvent", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelDemo(), ecorePackage.getEString(), "pChannelDemo", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PChannelDetails(), ecorePackage.getEString(), "pChannelDetails", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PPurpose(), ecorePackage.getEString(), "pPurpose", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_PDiscountActive(), ecorePackage.getEString(), "pDiscountActive", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reasonEClass, Reason.class, "Reason", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReason_RReasonSk(), ecorePackage.getELongObject(), "rReasonSk", null, 0, 1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReason_RReasonId(), ecorePackage.getEString(), "rReasonId", null, 0, 1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReason_RReasonDesc(), ecorePackage.getEString(), "rReasonDesc", null, 0, 1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipModeEClass, ShipMode.class, "ShipMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipMode_SmShipModeSk(), ecorePackage.getELongObject(), "smShipModeSk", null, 0, 1, ShipMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipMode_SmShipModeId(), ecorePackage.getEString(), "smShipModeId", null, 0, 1, ShipMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipMode_SmType(), ecorePackage.getEString(), "smType", null, 0, 1, ShipMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipMode_SmCode(), ecorePackage.getEString(), "smCode", null, 0, 1, ShipMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipMode_SmCarrier(), ecorePackage.getEString(), "smCarrier", null, 0, 1, ShipMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipMode_SmContract(), ecorePackage.getEString(), "smContract", null, 0, 1, ShipMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStore_SStoreSk(), ecorePackage.getELongObject(), "sStoreSk", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SStoreId(), ecorePackage.getEString(), "sStoreId", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SRecStartDate(), this.getDate(), "sRecStartDate", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SRecEndDate(), this.getDate(), "sRecEndDate", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SClosedDateSk(), ecorePackage.getELongObject(), "sClosedDateSk", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SStoreName(), ecorePackage.getEString(), "sStoreName", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SNumberEmployees(), ecorePackage.getELongObject(), "sNumberEmployees", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SFloorSpace(), ecorePackage.getELongObject(), "sFloorSpace", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SHours(), ecorePackage.getEString(), "sHours", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SManager(), ecorePackage.getEString(), "sManager", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SMarketId(), ecorePackage.getELongObject(), "sMarketId", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SGeographyClass(), ecorePackage.getEString(), "sGeographyClass", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SMarketDesc(), ecorePackage.getEString(), "sMarketDesc", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SMarketManager(), ecorePackage.getEString(), "sMarketManager", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SDivisionId(), ecorePackage.getELongObject(), "sDivisionId", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SDivisionName(), ecorePackage.getEString(), "sDivisionName", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SCompanyId(), ecorePackage.getELongObject(), "sCompanyId", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SCompanyName(), ecorePackage.getEString(), "sCompanyName", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SStreetNumber(), ecorePackage.getEString(), "sStreetNumber", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SStreetName(), ecorePackage.getEString(), "sStreetName", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SStreetType(), ecorePackage.getEString(), "sStreetType", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SSuiteNumber(), ecorePackage.getEString(), "sSuiteNumber", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SCity(), ecorePackage.getEString(), "sCity", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SCounty(), ecorePackage.getEString(), "sCounty", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SState(), ecorePackage.getEString(), "sState", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SZip(), ecorePackage.getEString(), "sZip", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SCountry(), ecorePackage.getEString(), "sCountry", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SGmtOffset(), ecorePackage.getEDouble(), "sGmtOffset", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_STaxPrecentage(), ecorePackage.getEDouble(), "sTaxPrecentage", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_StoreSales(), this.getStoreSales(), null, "storeSales", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_StoreReturns(), this.getStoreReturns(), this.getStoreReturns_SrStoreSk(), "storeReturns", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeReturnsEClass, StoreReturns.class, "StoreReturns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreReturns_SrReturnedDateSk(), this.getDateDim(), null, "srReturnedDateSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnTimeSk(), ecorePackage.getELongObject(), "srReturnTimeSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreReturns_SrId(), this.getStoreReturnsId(), null, "srId", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrItemSk(), ecorePackage.getELongObject(), "srItemSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrTicketNumber(), ecorePackage.getELongObject(), "srTicketNumber", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreReturns_SrCustomerSk(), this.getCustomer(), this.getCustomer_StoreReturns(), "srCustomerSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrCdemoSk(), ecorePackage.getELongObject(), "srCdemoSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrHdemoSk(), ecorePackage.getELongObject(), "srHdemoSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrAddrSk(), ecorePackage.getELongObject(), "srAddrSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreReturns_SrStoreSk(), this.getStore(), this.getStore_StoreReturns(), "srStoreSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReasonSk(), ecorePackage.getELongObject(), "srReasonSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnQuantity(), ecorePackage.getELongObject(), "srReturnQuantity", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnAmt(), ecorePackage.getEDouble(), "srReturnAmt", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnTax(), ecorePackage.getEDouble(), "srReturnTax", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnAmtIncTax(), ecorePackage.getEDouble(), "srReturnAmtIncTax", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrFee(), ecorePackage.getEDouble(), "srFee", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnShipCost(), ecorePackage.getEDouble(), "srReturnShipCost", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrRefundedCash(), ecorePackage.getEDouble(), "srRefundedCash", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReversedCharge(), ecorePackage.getEDouble(), "srReversedCharge", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrStoreCredit(), ecorePackage.getEDouble(), "srStoreCredit", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrNetLoss(), ecorePackage.getEDouble(), "srNetLoss", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeReturnsIdEClass, StoreReturnsId.class, "StoreReturnsId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoreReturnsId_SrItemSk(), ecorePackage.getELongObject(), "srItemSk", null, 0, 1, StoreReturnsId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturnsId_SrTicketNumber(), ecorePackage.getELongObject(), "srTicketNumber", null, 0, 1, StoreReturnsId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeSalesEClass, StoreSales.class, "StoreSales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreSales_SsSoldDateSk(), this.getDateDim(), null, "ssSoldDateSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsSoldTimeSk(), ecorePackage.getELongObject(), "ssSoldTimeSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsItemSk(), ecorePackage.getELongObject(), "ssItemSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreSales_SsId(), this.getStoreSalesId(), null, "ssId", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreSales_SsCustomerSk(), this.getCustomer(), this.getCustomer_StoreSales(), "ssCustomerSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsTicketNumber(), ecorePackage.getELongObject(), "ssTicketNumber", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsCdemoSk(), ecorePackage.getELongObject(), "ssCdemoSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsHdemoSk(), ecorePackage.getELongObject(), "ssHdemoSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsAddrSk(), ecorePackage.getELongObject(), "ssAddrSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreSales_SsStoreSk(), this.getStore(), null, "ssStoreSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsPromoSk(), ecorePackage.getELongObject(), "ssPromoSk", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsQuantity(), ecorePackage.getELongObject(), "ssQuantity", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsWholesaleCost(), ecorePackage.getEDoubleObject(), "ssWholesaleCost", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsListPrice(), ecorePackage.getEDoubleObject(), "ssListPrice", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsSalesPrice(), ecorePackage.getEDoubleObject(), "ssSalesPrice", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsExtDiscountAmt(), ecorePackage.getEDoubleObject(), "ssExtDiscountAmt", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsExtSalesPrice(), ecorePackage.getEDoubleObject(), "ssExtSalesPrice", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsExtWholesaleCost(), ecorePackage.getEDoubleObject(), "ssExtWholesaleCost", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsExtListPrice(), ecorePackage.getEDoubleObject(), "ssExtListPrice", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsExtTax(), ecorePackage.getEDoubleObject(), "ssExtTax", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsCouponAmt(), ecorePackage.getEDoubleObject(), "ssCouponAmt", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsNetPaid(), ecorePackage.getEDoubleObject(), "ssNetPaid", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsNetPaidIncTax(), ecorePackage.getEDoubleObject(), "ssNetPaidIncTax", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSales_SsNetProfit(), ecorePackage.getEDoubleObject(), "ssNetProfit", null, 0, 1, StoreSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeSalesIdEClass, StoreSalesId.class, "StoreSalesId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreSalesId_SsCustomerSk(), this.getCustomer(), null, "ssCustomerSk", null, 0, 1, StoreSalesId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreSalesId_SsTicketNumber(), ecorePackage.getELongObject(), "ssTicketNumber", null, 0, 1, StoreSalesId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeDimEClass, TimeDim.class, "TimeDim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeDim_TTimeSk(), ecorePackage.getELongObject(), "tTimeSk", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TTimeId(), ecorePackage.getEString(), "tTimeId", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TTime(), ecorePackage.getELongObject(), "tTime", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_THour(), ecorePackage.getELongObject(), "tHour", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TMinute(), ecorePackage.getELongObject(), "tMinute", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TSecond(), ecorePackage.getELongObject(), "tSecond", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TAmPm(), ecorePackage.getEString(), "tAmPm", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TShift(), ecorePackage.getEString(), "tShift", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TSubShift(), ecorePackage.getEString(), "tSubShift", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDim_TMealTime(), ecorePackage.getEString(), "tMealTime", null, 0, 1, TimeDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(warehouseEClass, Warehouse.class, "Warehouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWarehouse_WWarehouseSk(), ecorePackage.getELongObject(), "wWarehouseSk", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WWarehouseId(), ecorePackage.getEString(), "wWarehouseId", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WWarehouseName(), ecorePackage.getEString(), "wWarehouseName", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WWarehouseSqFt(), ecorePackage.getELongObject(), "wWarehouseSqFt", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WStreetNumber(), ecorePackage.getEString(), "wStreetNumber", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WStreetName(), ecorePackage.getEString(), "wStreetName", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WStreetType(), ecorePackage.getEString(), "wStreetType", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WSuiteNumber(), ecorePackage.getEString(), "wSuiteNumber", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WCity(), ecorePackage.getEString(), "wCity", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WCounty(), ecorePackage.getEString(), "wCounty", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WState(), ecorePackage.getEString(), "wState", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WZip(), ecorePackage.getEString(), "wZip", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WCountry(), ecorePackage.getEString(), "wCountry", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarehouse_WGmtOffset(), ecorePackage.getEDouble(), "wGmtOffset", null, 0, 1, Warehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webPageEClass, WebPage.class, "WebPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebPage_WpWebPageSk(), ecorePackage.getELongObject(), "wpWebPageSk", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpWebPageId(), ecorePackage.getEString(), "wpWebPageId", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpRecStartDate(), this.getDate(), "wpRecStartDate", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpRecEndDate(), this.getDate(), "wpRecEndDate", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpCreationDateSk(), ecorePackage.getELongObject(), "wpCreationDateSk", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpAccessDateSk(), ecorePackage.getELongObject(), "wpAccessDateSk", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpAutogenFlag(), ecorePackage.getEString(), "wpAutogenFlag", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpCustomerSk(), ecorePackage.getELongObject(), "wpCustomerSk", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpUrl(), ecorePackage.getEString(), "wpUrl", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpType(), ecorePackage.getEString(), "wpType", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpCharCount(), ecorePackage.getELongObject(), "wpCharCount", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpLinkCount(), ecorePackage.getELongObject(), "wpLinkCount", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpImageCount(), ecorePackage.getELongObject(), "wpImageCount", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_WpMaxAdCount(), ecorePackage.getELongObject(), "wpMaxAdCount", null, 0, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webReturnsEClass, WebReturns.class, "WebReturns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebReturns_WrReturnedDateSk(), ecorePackage.getELongObject(), "wrReturnedDateSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturnedTimeSk(), ecorePackage.getELongObject(), "wrReturnedTimeSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrItemSk(), ecorePackage.getELongObject(), "wrItemSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrRefundedCustomerSk(), ecorePackage.getELongObject(), "wrRefundedCustomerSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrRefundedCdemoSk(), ecorePackage.getELongObject(), "wrRefundedCdemoSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrRefundedHdemoSk(), ecorePackage.getELongObject(), "wrRefundedHdemoSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrRefundedAddrSk(), ecorePackage.getELongObject(), "wrRefundedAddrSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturningCustomerSk(), ecorePackage.getELongObject(), "wrReturningCustomerSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturningCdemoSk(), ecorePackage.getELongObject(), "wrReturningCdemoSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturningHdemoSk(), ecorePackage.getELongObject(), "wrReturningHdemoSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturningAddrSk(), ecorePackage.getELongObject(), "wrReturningAddrSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrWebPageSk(), ecorePackage.getELongObject(), "wrWebPageSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReasonSk(), ecorePackage.getELongObject(), "wrReasonSk", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrOrderNumber(), ecorePackage.getELongObject(), "wrOrderNumber", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturnQuantity(), ecorePackage.getELongObject(), "wrReturnQuantity", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturnAmt(), ecorePackage.getEDouble(), "wrReturnAmt", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturnTax(), ecorePackage.getEDouble(), "wrReturnTax", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturnAmtIncTax(), ecorePackage.getEDouble(), "wrReturnAmtIncTax", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrFee(), ecorePackage.getEDouble(), "wrFee", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReturnShipCost(), ecorePackage.getEDouble(), "wrReturnShipCost", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrRefundedCash(), ecorePackage.getEDouble(), "wrRefundedCash", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrReversedCharge(), ecorePackage.getEDouble(), "wrReversedCharge", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrAccountCredit(), ecorePackage.getEDouble(), "wrAccountCredit", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebReturns_WrNetLoss(), ecorePackage.getEDouble(), "wrNetLoss", null, 0, 1, WebReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSalesEClass, WebSales.class, "WebSales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebSales_WsSoldDateSk(), ecorePackage.getELongObject(), "wsSoldDateSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsSoldTimeSk(), ecorePackage.getELongObject(), "wsSoldTimeSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsShipDateSk(), ecorePackage.getELongObject(), "wsShipDateSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsItemSk(), ecorePackage.getELongObject(), "wsItemSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsBillCustomerSk(), ecorePackage.getELongObject(), "wsBillCustomerSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsBillCdemoSk(), ecorePackage.getELongObject(), "wsBillCdemoSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsBillHdemoSk(), ecorePackage.getELongObject(), "wsBillHdemoSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsBillAddrSk(), ecorePackage.getELongObject(), "wsBillAddrSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsShipCustomerSk(), ecorePackage.getELongObject(), "wsShipCustomerSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsShipCdemoSk(), ecorePackage.getELongObject(), "wsShipCdemoSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsShipHdemoSk(), ecorePackage.getELongObject(), "wsShipHdemoSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsShipAddrSk(), ecorePackage.getELongObject(), "wsShipAddrSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsWebPageSk(), ecorePackage.getELongObject(), "wsWebPageSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsWebSiteSk(), ecorePackage.getELongObject(), "wsWebSiteSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsShipModeSk(), ecorePackage.getELongObject(), "wsShipModeSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsWarehouseSk(), ecorePackage.getELongObject(), "wsWarehouseSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsPromoSk(), ecorePackage.getELongObject(), "wsPromoSk", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsOrderNumber(), ecorePackage.getELongObject(), "wsOrderNumber", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsQuantity(), ecorePackage.getELongObject(), "wsQuantity", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsWholesaleCost(), ecorePackage.getEDouble(), "wsWholesaleCost", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsListPrice(), ecorePackage.getEDouble(), "wsListPrice", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsSalesPrice(), ecorePackage.getEDouble(), "wsSalesPrice", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsExtDiscountAmt(), ecorePackage.getEDouble(), "wsExtDiscountAmt", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsExtSalesPrice(), ecorePackage.getEDouble(), "wsExtSalesPrice", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsExtWholesaleCost(), ecorePackage.getEDouble(), "wsExtWholesaleCost", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsExtListPrice(), ecorePackage.getEDouble(), "wsExtListPrice", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsExtTax(), ecorePackage.getEDouble(), "wsExtTax", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsCouponAmt(), ecorePackage.getEDouble(), "wsCouponAmt", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsExtShipCost(), ecorePackage.getEDouble(), "wsExtShipCost", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsNetPaid(), ecorePackage.getEDouble(), "wsNetPaid", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsNetPaidIncTax(), ecorePackage.getEDouble(), "wsNetPaidIncTax", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsNetPaidIncShip(), ecorePackage.getEDouble(), "wsNetPaidIncShip", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsNetPaidIncShipTax(), ecorePackage.getEDouble(), "wsNetPaidIncShipTax", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSales_WsNetProfit(), ecorePackage.getEDouble(), "wsNetProfit", null, 0, 1, WebSales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSiteEClass, WebSite.class, "WebSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebSite_WebSiteSk(), ecorePackage.getELongObject(), "webSiteSk", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebSiteId(), ecorePackage.getEString(), "webSiteId", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebRecStartDate(), this.getDate(), "webRecStartDate", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebRecEndDate(), this.getDate(), "webRecEndDate", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebName(), ecorePackage.getEString(), "webName", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebOpenDateSk(), ecorePackage.getELongObject(), "webOpenDateSk", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebCloseDateSk(), ecorePackage.getELongObject(), "webCloseDateSk", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebClass(), ecorePackage.getEString(), "webClass", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebManager(), ecorePackage.getEString(), "webManager", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebMktId(), ecorePackage.getELongObject(), "webMktId", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebMktClass(), ecorePackage.getEString(), "webMktClass", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebMktDesc(), ecorePackage.getEString(), "webMktDesc", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebMarketManager(), ecorePackage.getEString(), "webMarketManager", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebCompanyId(), ecorePackage.getELongObject(), "webCompanyId", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebCompanyName(), ecorePackage.getEString(), "webCompanyName", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebStreetNumber(), ecorePackage.getEString(), "webStreetNumber", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebStreetName(), ecorePackage.getEString(), "webStreetName", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebStreetType(), ecorePackage.getEString(), "webStreetType", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebSuiteNumber(), ecorePackage.getEString(), "webSuiteNumber", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebCity(), ecorePackage.getEString(), "webCity", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebCounty(), ecorePackage.getEString(), "webCounty", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebState(), ecorePackage.getEString(), "webState", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebZip(), ecorePackage.getEString(), "webZip", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebCountry(), ecorePackage.getEString(), "webCountry", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebGmtOffset(), ecorePackage.getEDouble(), "webGmtOffset", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_WebTaxPercentage(), ecorePackage.getEDouble(), "webTaxPercentage", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeEDataType, Time.class, "Time", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TpcdsModelPackageImpl
