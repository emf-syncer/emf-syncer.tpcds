/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tpcds.tpcdsModel.TpcdsModelPackage
 * @generated
 */
public interface TpcdsModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TpcdsModelFactory eINSTANCE = tpcds.tpcdsModel.impl.TpcdsModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Call Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Center</em>'.
	 * @generated
	 */
	CallCenter createCallCenter();

	/**
	 * Returns a new object of class '<em>Catalog Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Page</em>'.
	 * @generated
	 */
	CatalogPage createCatalogPage();

	/**
	 * Returns a new object of class '<em>Catalog Returns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Returns</em>'.
	 * @generated
	 */
	CatalogReturns createCatalogReturns();

	/**
	 * Returns a new object of class '<em>Catalog Sales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Sales</em>'.
	 * @generated
	 */
	CatalogSales createCatalogSales();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Customer Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Address</em>'.
	 * @generated
	 */
	CustomerAddress createCustomerAddress();

	/**
	 * Returns a new object of class '<em>Customer Demographics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Demographics</em>'.
	 * @generated
	 */
	CustomerDemographics createCustomerDemographics();

	/**
	 * Returns a new object of class '<em>Date Dim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Dim</em>'.
	 * @generated
	 */
	DateDim createDateDim();

	/**
	 * Returns a new object of class '<em>Dbgen Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dbgen Version</em>'.
	 * @generated
	 */
	DbgenVersion createDbgenVersion();

	/**
	 * Returns a new object of class '<em>Household Demographics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Household Demographics</em>'.
	 * @generated
	 */
	HouseholdDemographics createHouseholdDemographics();

	/**
	 * Returns a new object of class '<em>Income Band</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Income Band</em>'.
	 * @generated
	 */
	IncomeBand createIncomeBand();

	/**
	 * Returns a new object of class '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory</em>'.
	 * @generated
	 */
	Inventory createInventory();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Promotion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Promotion</em>'.
	 * @generated
	 */
	Promotion createPromotion();

	/**
	 * Returns a new object of class '<em>Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason</em>'.
	 * @generated
	 */
	Reason createReason();

	/**
	 * Returns a new object of class '<em>Ship Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ship Mode</em>'.
	 * @generated
	 */
	ShipMode createShipMode();

	/**
	 * Returns a new object of class '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store</em>'.
	 * @generated
	 */
	Store createStore();

	/**
	 * Returns a new object of class '<em>Store Returns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Returns</em>'.
	 * @generated
	 */
	StoreReturns createStoreReturns();

	/**
	 * Returns a new object of class '<em>Store Returns Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Returns Id</em>'.
	 * @generated
	 */
	StoreReturnsId createStoreReturnsId();

	/**
	 * Returns a new object of class '<em>Store Sales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Sales</em>'.
	 * @generated
	 */
	StoreSales createStoreSales();

	/**
	 * Returns a new object of class '<em>Store Sales Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Sales Id</em>'.
	 * @generated
	 */
	StoreSalesId createStoreSalesId();

	/**
	 * Returns a new object of class '<em>Time Dim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Dim</em>'.
	 * @generated
	 */
	TimeDim createTimeDim();

	/**
	 * Returns a new object of class '<em>Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warehouse</em>'.
	 * @generated
	 */
	Warehouse createWarehouse();

	/**
	 * Returns a new object of class '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Page</em>'.
	 * @generated
	 */
	WebPage createWebPage();

	/**
	 * Returns a new object of class '<em>Web Returns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Returns</em>'.
	 * @generated
	 */
	WebReturns createWebReturns();

	/**
	 * Returns a new object of class '<em>Web Sales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Sales</em>'.
	 * @generated
	 */
	WebSales createWebSales();

	/**
	 * Returns a new object of class '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site</em>'.
	 * @generated
	 */
	WebSite createWebSite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TpcdsModelPackage getTpcdsModelPackage();

} //TpcdsModelFactory
