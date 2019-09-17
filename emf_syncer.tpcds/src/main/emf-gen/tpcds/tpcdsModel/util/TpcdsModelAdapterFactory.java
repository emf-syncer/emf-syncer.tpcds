/**
 */
package tpcds.tpcdsModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tpcds.tpcdsModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tpcds.tpcdsModel.TpcdsModelPackage
 * @generated
 */
public class TpcdsModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TpcdsModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpcdsModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TpcdsModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TpcdsModelSwitch<Adapter> modelSwitch =
		new TpcdsModelSwitch<Adapter>() {
			@Override
			public Adapter caseCallCenter(CallCenter object) {
				return createCallCenterAdapter();
			}
			@Override
			public Adapter caseCatalogPage(CatalogPage object) {
				return createCatalogPageAdapter();
			}
			@Override
			public Adapter caseCatalogReturns(CatalogReturns object) {
				return createCatalogReturnsAdapter();
			}
			@Override
			public Adapter caseCatalogSales(CatalogSales object) {
				return createCatalogSalesAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseCustomerAddress(CustomerAddress object) {
				return createCustomerAddressAdapter();
			}
			@Override
			public Adapter caseCustomerDemographics(CustomerDemographics object) {
				return createCustomerDemographicsAdapter();
			}
			@Override
			public Adapter caseDateDim(DateDim object) {
				return createDateDimAdapter();
			}
			@Override
			public Adapter caseDbgenVersion(DbgenVersion object) {
				return createDbgenVersionAdapter();
			}
			@Override
			public Adapter caseHouseholdDemographics(HouseholdDemographics object) {
				return createHouseholdDemographicsAdapter();
			}
			@Override
			public Adapter caseIncomeBand(IncomeBand object) {
				return createIncomeBandAdapter();
			}
			@Override
			public Adapter caseInventory(Inventory object) {
				return createInventoryAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter casePromotion(Promotion object) {
				return createPromotionAdapter();
			}
			@Override
			public Adapter caseReason(Reason object) {
				return createReasonAdapter();
			}
			@Override
			public Adapter caseShipMode(ShipMode object) {
				return createShipModeAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseStoreReturns(StoreReturns object) {
				return createStoreReturnsAdapter();
			}
			@Override
			public Adapter caseStoreReturnsId(StoreReturnsId object) {
				return createStoreReturnsIdAdapter();
			}
			@Override
			public Adapter caseStoreSales(StoreSales object) {
				return createStoreSalesAdapter();
			}
			@Override
			public Adapter caseStoreSalesId(StoreSalesId object) {
				return createStoreSalesIdAdapter();
			}
			@Override
			public Adapter caseTimeDim(TimeDim object) {
				return createTimeDimAdapter();
			}
			@Override
			public Adapter caseWarehouse(Warehouse object) {
				return createWarehouseAdapter();
			}
			@Override
			public Adapter caseWebPage(WebPage object) {
				return createWebPageAdapter();
			}
			@Override
			public Adapter caseWebReturns(WebReturns object) {
				return createWebReturnsAdapter();
			}
			@Override
			public Adapter caseWebSales(WebSales object) {
				return createWebSalesAdapter();
			}
			@Override
			public Adapter caseWebSite(WebSite object) {
				return createWebSiteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.CallCenter <em>Call Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.CallCenter
	 * @generated
	 */
	public Adapter createCallCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.CatalogPage <em>Catalog Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.CatalogPage
	 * @generated
	 */
	public Adapter createCatalogPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.CatalogReturns <em>Catalog Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.CatalogReturns
	 * @generated
	 */
	public Adapter createCatalogReturnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.CatalogSales <em>Catalog Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.CatalogSales
	 * @generated
	 */
	public Adapter createCatalogSalesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.CustomerAddress <em>Customer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.CustomerAddress
	 * @generated
	 */
	public Adapter createCustomerAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.CustomerDemographics <em>Customer Demographics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.CustomerDemographics
	 * @generated
	 */
	public Adapter createCustomerDemographicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.DateDim <em>Date Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.DateDim
	 * @generated
	 */
	public Adapter createDateDimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.DbgenVersion <em>Dbgen Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.DbgenVersion
	 * @generated
	 */
	public Adapter createDbgenVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.HouseholdDemographics <em>Household Demographics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.HouseholdDemographics
	 * @generated
	 */
	public Adapter createHouseholdDemographicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.IncomeBand <em>Income Band</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.IncomeBand
	 * @generated
	 */
	public Adapter createIncomeBandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Inventory
	 * @generated
	 */
	public Adapter createInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Promotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Promotion
	 * @generated
	 */
	public Adapter createPromotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Reason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Reason
	 * @generated
	 */
	public Adapter createReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.ShipMode <em>Ship Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.ShipMode
	 * @generated
	 */
	public Adapter createShipModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.StoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.StoreReturns
	 * @generated
	 */
	public Adapter createStoreReturnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.StoreReturnsId <em>Store Returns Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.StoreReturnsId
	 * @generated
	 */
	public Adapter createStoreReturnsIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.StoreSales <em>Store Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.StoreSales
	 * @generated
	 */
	public Adapter createStoreSalesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.StoreSalesId <em>Store Sales Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.StoreSalesId
	 * @generated
	 */
	public Adapter createStoreSalesIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.TimeDim <em>Time Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.TimeDim
	 * @generated
	 */
	public Adapter createTimeDimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.Warehouse <em>Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.Warehouse
	 * @generated
	 */
	public Adapter createWarehouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.WebPage
	 * @generated
	 */
	public Adapter createWebPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.WebReturns <em>Web Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.WebReturns
	 * @generated
	 */
	public Adapter createWebReturnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.WebSales <em>Web Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.WebSales
	 * @generated
	 */
	public Adapter createWebSalesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpcds.tpcdsModel.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpcds.tpcdsModel.WebSite
	 * @generated
	 */
	public Adapter createWebSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TpcdsModelAdapterFactory
