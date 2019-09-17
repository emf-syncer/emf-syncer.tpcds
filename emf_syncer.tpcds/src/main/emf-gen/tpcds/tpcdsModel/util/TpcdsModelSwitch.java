/**
 */
package tpcds.tpcdsModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tpcds.tpcdsModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tpcds.tpcdsModel.TpcdsModelPackage
 * @generated
 */
public class TpcdsModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TpcdsModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpcdsModelSwitch() {
		if (modelPackage == null) {
			modelPackage = TpcdsModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TpcdsModelPackage.CALL_CENTER: {
				CallCenter callCenter = (CallCenter)theEObject;
				T result = caseCallCenter(callCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.CATALOG_PAGE: {
				CatalogPage catalogPage = (CatalogPage)theEObject;
				T result = caseCatalogPage(catalogPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.CATALOG_RETURNS: {
				CatalogReturns catalogReturns = (CatalogReturns)theEObject;
				T result = caseCatalogReturns(catalogReturns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.CATALOG_SALES: {
				CatalogSales catalogSales = (CatalogSales)theEObject;
				T result = caseCatalogSales(catalogSales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.CUSTOMER_ADDRESS: {
				CustomerAddress customerAddress = (CustomerAddress)theEObject;
				T result = caseCustomerAddress(customerAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS: {
				CustomerDemographics customerDemographics = (CustomerDemographics)theEObject;
				T result = caseCustomerDemographics(customerDemographics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.DATE_DIM: {
				DateDim dateDim = (DateDim)theEObject;
				T result = caseDateDim(dateDim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.DBGEN_VERSION: {
				DbgenVersion dbgenVersion = (DbgenVersion)theEObject;
				T result = caseDbgenVersion(dbgenVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS: {
				HouseholdDemographics householdDemographics = (HouseholdDemographics)theEObject;
				T result = caseHouseholdDemographics(householdDemographics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.INCOME_BAND: {
				IncomeBand incomeBand = (IncomeBand)theEObject;
				T result = caseIncomeBand(incomeBand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.INVENTORY: {
				Inventory inventory = (Inventory)theEObject;
				T result = caseInventory(inventory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.PROMOTION: {
				Promotion promotion = (Promotion)theEObject;
				T result = casePromotion(promotion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.REASON: {
				Reason reason = (Reason)theEObject;
				T result = caseReason(reason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.SHIP_MODE: {
				ShipMode shipMode = (ShipMode)theEObject;
				T result = caseShipMode(shipMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.STORE_RETURNS: {
				StoreReturns storeReturns = (StoreReturns)theEObject;
				T result = caseStoreReturns(storeReturns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.STORE_RETURNS_ID: {
				StoreReturnsId storeReturnsId = (StoreReturnsId)theEObject;
				T result = caseStoreReturnsId(storeReturnsId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.STORE_SALES: {
				StoreSales storeSales = (StoreSales)theEObject;
				T result = caseStoreSales(storeSales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.STORE_SALES_ID: {
				StoreSalesId storeSalesId = (StoreSalesId)theEObject;
				T result = caseStoreSalesId(storeSalesId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.TIME_DIM: {
				TimeDim timeDim = (TimeDim)theEObject;
				T result = caseTimeDim(timeDim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.WAREHOUSE: {
				Warehouse warehouse = (Warehouse)theEObject;
				T result = caseWarehouse(warehouse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.WEB_PAGE: {
				WebPage webPage = (WebPage)theEObject;
				T result = caseWebPage(webPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.WEB_RETURNS: {
				WebReturns webReturns = (WebReturns)theEObject;
				T result = caseWebReturns(webReturns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.WEB_SALES: {
				WebSales webSales = (WebSales)theEObject;
				T result = caseWebSales(webSales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TpcdsModelPackage.WEB_SITE: {
				WebSite webSite = (WebSite)theEObject;
				T result = caseWebSite(webSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallCenter(CallCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogPage(CatalogPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Returns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Returns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogReturns(CatalogReturns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Sales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Sales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogSales(CatalogSales object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerAddress(CustomerAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Demographics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Demographics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerDemographics(CustomerDemographics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Dim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Dim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateDim(DateDim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dbgen Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dbgen Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbgenVersion(DbgenVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Household Demographics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Household Demographics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouseholdDemographics(HouseholdDemographics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Income Band</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Income Band</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomeBand(IncomeBand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventory(Inventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Promotion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Promotion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromotion(Promotion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReason(Reason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ship Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ship Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipMode(ShipMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Returns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Returns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreReturns(StoreReturns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Returns Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Returns Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreReturnsId(StoreReturnsId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Sales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Sales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreSales(StoreSales object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Sales Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Sales Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreSalesId(StoreSalesId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Dim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Dim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDim(TimeDim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warehouse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarehouse(Warehouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebPage(WebPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Returns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Returns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebReturns(WebReturns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Sales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Sales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebSales(WebSales object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebSite(WebSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TpcdsModelSwitch
