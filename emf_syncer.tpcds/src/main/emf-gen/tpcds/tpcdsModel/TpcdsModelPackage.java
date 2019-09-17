/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tpcds.tpcdsModel.TpcdsModelFactory
 * @model kind="package"
 * @generated
 */
public interface TpcdsModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tpcdsModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tpcds/emfAnnotated.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tpcds.tpcdsModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TpcdsModelPackage eINSTANCE = tpcds.tpcdsModel.impl.TpcdsModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CallCenterImpl <em>Call Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CallCenterImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCallCenter()
	 * @generated
	 */
	int CALL_CENTER = 0;

	/**
	 * The feature id for the '<em><b>Cc Call Center Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_CALL_CENTER_SK = 0;

	/**
	 * The feature id for the '<em><b>Cc Call Center Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_CALL_CENTER_ID = 1;

	/**
	 * The feature id for the '<em><b>Cc Rec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_REC_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Cc Rec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_REC_END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Cc Closed Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_CLOSED_DATE_SK = 4;

	/**
	 * The feature id for the '<em><b>Cc Open Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_OPEN_DATE_SK = 5;

	/**
	 * The feature id for the '<em><b>Cc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_NAME = 6;

	/**
	 * The feature id for the '<em><b>Cc Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Cc Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_EMPLOYEES = 8;

	/**
	 * The feature id for the '<em><b>Cc Sq Ft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_SQ_FT = 9;

	/**
	 * The feature id for the '<em><b>Cc Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_HOURS = 10;

	/**
	 * The feature id for the '<em><b>Cc Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_MANAGER = 11;

	/**
	 * The feature id for the '<em><b>Cc Mkt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_MKT_ID = 12;

	/**
	 * The feature id for the '<em><b>Cc Mkt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_MKT_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Cc Mkt Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_MKT_DESC = 14;

	/**
	 * The feature id for the '<em><b>Cc Market Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_MARKET_MANAGER = 15;

	/**
	 * The feature id for the '<em><b>Cc Division</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_DIVISION = 16;

	/**
	 * The feature id for the '<em><b>Cc Division Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_DIVISION_NAME = 17;

	/**
	 * The feature id for the '<em><b>Cc Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_COMPANY = 18;

	/**
	 * The feature id for the '<em><b>Cc Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_COMPANY_NAME = 19;

	/**
	 * The feature id for the '<em><b>Cc Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_STREET_NUMBER = 20;

	/**
	 * The feature id for the '<em><b>Cc Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_STREET_NAME = 21;

	/**
	 * The feature id for the '<em><b>Cc Street Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_STREET_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Cc Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_SUITE_NUMBER = 23;

	/**
	 * The feature id for the '<em><b>Cc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_CITY = 24;

	/**
	 * The feature id for the '<em><b>Cc County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_COUNTY = 25;

	/**
	 * The feature id for the '<em><b>Cc State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_STATE = 26;

	/**
	 * The feature id for the '<em><b>Cc Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_ZIP = 27;

	/**
	 * The feature id for the '<em><b>Cc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_COUNTRY = 28;

	/**
	 * The feature id for the '<em><b>Cc Gmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_GMT_OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Cc Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER__CC_TAX_PERCENTAGE = 30;

	/**
	 * The number of structural features of the '<em>Call Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Call Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CatalogPageImpl <em>Catalog Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CatalogPageImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCatalogPage()
	 * @generated
	 */
	int CATALOG_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Cp Catalog Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_CATALOG_PAGE_SK = 0;

	/**
	 * The feature id for the '<em><b>Cp Catalog Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_CATALOG_PAGE_ID = 1;

	/**
	 * The feature id for the '<em><b>Cp Start Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_START_DATE_SK = 2;

	/**
	 * The feature id for the '<em><b>Cp End Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_END_DATE_SK = 3;

	/**
	 * The feature id for the '<em><b>Cp Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Cp Catalog Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_CATALOG_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Cp Catalog Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Cp Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Cp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE__CP_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Catalog Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Catalog Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl <em>Catalog Returns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CatalogReturnsImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCatalogReturns()
	 * @generated
	 */
	int CATALOG_RETURNS = 2;

	/**
	 * The feature id for the '<em><b>Cr Returned Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURNED_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Cr Returned Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURNED_TIME_SK = 1;

	/**
	 * The feature id for the '<em><b>Cr Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_ITEM_SK = 2;

	/**
	 * The feature id for the '<em><b>Cr Refunded Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK = 3;

	/**
	 * The feature id for the '<em><b>Cr Refunded Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK = 4;

	/**
	 * The feature id for the '<em><b>Cr Refunded Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK = 5;

	/**
	 * The feature id for the '<em><b>Cr Refunded Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REFUNDED_ADDR_SK = 6;

	/**
	 * The feature id for the '<em><b>Cr Returning Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK = 7;

	/**
	 * The feature id for the '<em><b>Cr Returning Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURNING_CDEMO_SK = 8;

	/**
	 * The feature id for the '<em><b>Cr Returning Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURNING_HDEMO_SK = 9;

	/**
	 * The feature id for the '<em><b>Cr Returning Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURNING_ADDR_SK = 10;

	/**
	 * The feature id for the '<em><b>Cr Call Center Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_CALL_CENTER_SK = 11;

	/**
	 * The feature id for the '<em><b>Cr Catalog Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_CATALOG_PAGE_SK = 12;

	/**
	 * The feature id for the '<em><b>Cr Ship Mode Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_SHIP_MODE_SK = 13;

	/**
	 * The feature id for the '<em><b>Cr Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_WAREHOUSE_SK = 14;

	/**
	 * The feature id for the '<em><b>Cr Reason Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REASON_SK = 15;

	/**
	 * The feature id for the '<em><b>Cr Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_ORDER_NUMBER = 16;

	/**
	 * The feature id for the '<em><b>Cr Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURN_QUANTITY = 17;

	/**
	 * The feature id for the '<em><b>Cr Return Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURN_AMOUNT = 18;

	/**
	 * The feature id for the '<em><b>Cr Return Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURN_TAX = 19;

	/**
	 * The feature id for the '<em><b>Cr Return Amt Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX = 20;

	/**
	 * The feature id for the '<em><b>Cr Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_FEE = 21;

	/**
	 * The feature id for the '<em><b>Cr Return Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_RETURN_SHIP_COST = 22;

	/**
	 * The feature id for the '<em><b>Cr Refunded Cash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REFUNDED_CASH = 23;

	/**
	 * The feature id for the '<em><b>Cr Reversed Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_REVERSED_CHARGE = 24;

	/**
	 * The feature id for the '<em><b>Cr Store Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_STORE_CREDIT = 25;

	/**
	 * The feature id for the '<em><b>Cr Net Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS__CR_NET_LOSS = 26;

	/**
	 * The number of structural features of the '<em>Catalog Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS_FEATURE_COUNT = 27;

	/**
	 * The number of operations of the '<em>Catalog Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_RETURNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CatalogSalesImpl <em>Catalog Sales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CatalogSalesImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCatalogSales()
	 * @generated
	 */
	int CATALOG_SALES = 3;

	/**
	 * The feature id for the '<em><b>Cs Sold Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SOLD_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Cs Sold Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SOLD_TIME_SK = 1;

	/**
	 * The feature id for the '<em><b>Cs Ship Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SHIP_DATE_SK = 2;

	/**
	 * The feature id for the '<em><b>Cs Bill Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_BILL_CUSTOMER_SK = 3;

	/**
	 * The feature id for the '<em><b>Cs Bill Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_BILL_CDEMO_SK = 4;

	/**
	 * The feature id for the '<em><b>Cs Bill Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_BILL_HDEMO_SK = 5;

	/**
	 * The feature id for the '<em><b>Cs Bill Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_BILL_ADDR_SK = 6;

	/**
	 * The feature id for the '<em><b>Cs Ship Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SHIP_CUSTOMER_SK = 7;

	/**
	 * The feature id for the '<em><b>Cs Ship Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SHIP_CDEMO_SK = 8;

	/**
	 * The feature id for the '<em><b>Cs Ship Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SHIP_HDEMO_SK = 9;

	/**
	 * The feature id for the '<em><b>Cs Ship Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SHIP_ADDR_SK = 10;

	/**
	 * The feature id for the '<em><b>Cs Call Center Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_CALL_CENTER_SK = 11;

	/**
	 * The feature id for the '<em><b>Cs Catalog Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_CATALOG_PAGE_SK = 12;

	/**
	 * The feature id for the '<em><b>Cs Ship Mode Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SHIP_MODE_SK = 13;

	/**
	 * The feature id for the '<em><b>Cs Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_WAREHOUSE_SK = 14;

	/**
	 * The feature id for the '<em><b>Cs Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_ITEM_SK = 15;

	/**
	 * The feature id for the '<em><b>Cs Promo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_PROMO_SK = 16;

	/**
	 * The feature id for the '<em><b>Cs Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_ORDER_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Cs Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_QUANTITY = 18;

	/**
	 * The feature id for the '<em><b>Cs Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_WHOLESALE_COST = 19;

	/**
	 * The feature id for the '<em><b>Cs List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_LIST_PRICE = 20;

	/**
	 * The feature id for the '<em><b>Cs Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_SALES_PRICE = 21;

	/**
	 * The feature id for the '<em><b>Cs Ext Discount Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_EXT_DISCOUNT_AMT = 22;

	/**
	 * The feature id for the '<em><b>Cs Ext Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_EXT_SALES_PRICE = 23;

	/**
	 * The feature id for the '<em><b>Cs Ext Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_EXT_WHOLESALE_COST = 24;

	/**
	 * The feature id for the '<em><b>Cs Ext List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_EXT_LIST_PRICE = 25;

	/**
	 * The feature id for the '<em><b>Cs Ext Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_EXT_TAX = 26;

	/**
	 * The feature id for the '<em><b>Cs Coupon Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_COUPON_AMT = 27;

	/**
	 * The feature id for the '<em><b>Cs Ext Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_EXT_SHIP_COST = 28;

	/**
	 * The feature id for the '<em><b>Cs Net Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_NET_PAID = 29;

	/**
	 * The feature id for the '<em><b>Cs Net Paid Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_NET_PAID_INC_TAX = 30;

	/**
	 * The feature id for the '<em><b>Cs Net Paid Inc Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_NET_PAID_INC_SHIP = 31;

	/**
	 * The feature id for the '<em><b>Cs Net Paid Inc Ship Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX = 32;

	/**
	 * The feature id for the '<em><b>Cs Net Profit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES__CS_NET_PROFIT = 33;

	/**
	 * The number of structural features of the '<em>Catalog Sales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES_FEATURE_COUNT = 34;

	/**
	 * The number of operations of the '<em>Catalog Sales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SALES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CustomerImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>CCustomer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CCUSTOMER_SK = 0;

	/**
	 * The feature id for the '<em><b>CCustomer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CCUSTOMER_ID = 1;

	/**
	 * The feature id for the '<em><b>CCurrent Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CCURRENT_CDEMO_SK = 2;

	/**
	 * The feature id for the '<em><b>CCurrent Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CCURRENT_HDEMO_SK = 3;

	/**
	 * The feature id for the '<em><b>CCurrent Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CCURRENT_ADDR_SK = 4;

	/**
	 * The feature id for the '<em><b>CFirst Shipto Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CFIRST_SHIPTO_DATE_SK = 5;

	/**
	 * The feature id for the '<em><b>CFirst Sales Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CFIRST_SALES_DATE_SK = 6;

	/**
	 * The feature id for the '<em><b>CSalutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CSALUTATION = 7;

	/**
	 * The feature id for the '<em><b>CFirst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CFIRST_NAME = 8;

	/**
	 * The feature id for the '<em><b>CLast Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CLAST_NAME = 9;

	/**
	 * The feature id for the '<em><b>CPreferred Cust Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CPREFERRED_CUST_FLAG = 10;

	/**
	 * The feature id for the '<em><b>CBirth Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CBIRTH_DAY = 11;

	/**
	 * The feature id for the '<em><b>CBirth Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CBIRTH_MONTH = 12;

	/**
	 * The feature id for the '<em><b>CBirth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CBIRTH_YEAR = 13;

	/**
	 * The feature id for the '<em><b>CBirth Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CBIRTH_COUNTRY = 14;

	/**
	 * The feature id for the '<em><b>CLogin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CLOGIN = 15;

	/**
	 * The feature id for the '<em><b>CEmail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CEMAIL_ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>CLast Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CLAST_REVIEW_DATE = 17;

	/**
	 * The feature id for the '<em><b>Store Returns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STORE_RETURNS = 18;

	/**
	 * The feature id for the '<em><b>Store Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STORE_SALES = 19;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CustomerAddressImpl <em>Customer Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CustomerAddressImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCustomerAddress()
	 * @generated
	 */
	int CUSTOMER_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Ca Address Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_ADDRESS_SK = 0;

	/**
	 * The feature id for the '<em><b>Ca Address Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_ADDRESS_ID = 1;

	/**
	 * The feature id for the '<em><b>Ca Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_STREET_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Ca Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_STREET_NAME = 3;

	/**
	 * The feature id for the '<em><b>Ca Street Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_STREET_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Ca Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_SUITE_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Ca City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_CITY = 6;

	/**
	 * The feature id for the '<em><b>Ca County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_COUNTY = 7;

	/**
	 * The feature id for the '<em><b>Ca State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_STATE = 8;

	/**
	 * The feature id for the '<em><b>Ca Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_ZIP = 9;

	/**
	 * The feature id for the '<em><b>Ca Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_COUNTRY = 10;

	/**
	 * The feature id for the '<em><b>Ca Gmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_GMT_OFFSET = 11;

	/**
	 * The feature id for the '<em><b>Ca Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS__CA_LOCATION_TYPE = 12;

	/**
	 * The number of structural features of the '<em>Customer Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Customer Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl <em>Customer Demographics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.CustomerDemographicsImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCustomerDemographics()
	 * @generated
	 */
	int CUSTOMER_DEMOGRAPHICS = 6;

	/**
	 * The feature id for the '<em><b>Cd Demo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK = 0;

	/**
	 * The feature id for the '<em><b>Cd Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_GENDER = 1;

	/**
	 * The feature id for the '<em><b>Cd Marital Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Cd Education Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Cd Purchase Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE = 4;

	/**
	 * The feature id for the '<em><b>Cd Credit Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING = 5;

	/**
	 * The feature id for the '<em><b>Cd Dep Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Cd Dep Employed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Cd Dep College Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT = 8;

	/**
	 * The number of structural features of the '<em>Customer Demographics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Customer Demographics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DEMOGRAPHICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.DateDimImpl <em>Date Dim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.DateDimImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getDateDim()
	 * @generated
	 */
	int DATE_DIM = 7;

	/**
	 * The feature id for the '<em><b>DDate Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DDATE_SK = 0;

	/**
	 * The feature id for the '<em><b>DDate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DDATE_ID = 1;

	/**
	 * The feature id for the '<em><b>DDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DDATE = 2;

	/**
	 * The feature id for the '<em><b>DMonth Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DMONTH_SEQ = 3;

	/**
	 * The feature id for the '<em><b>DWeek Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DWEEK_SEQ = 4;

	/**
	 * The feature id for the '<em><b>DQuarter Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DQUARTER_SEQ = 5;

	/**
	 * The feature id for the '<em><b>DYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DYEAR = 6;

	/**
	 * The feature id for the '<em><b>DDow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DDOW = 7;

	/**
	 * The feature id for the '<em><b>DMoy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DMOY = 8;

	/**
	 * The feature id for the '<em><b>DDom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DDOM = 9;

	/**
	 * The feature id for the '<em><b>DQoy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DQOY = 10;

	/**
	 * The feature id for the '<em><b>DFy Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DFY_YEAR = 11;

	/**
	 * The feature id for the '<em><b>DFy Quarter Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DFY_QUARTER_SEQ = 12;

	/**
	 * The feature id for the '<em><b>DFy Week Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DFY_WEEK_SEQ = 13;

	/**
	 * The feature id for the '<em><b>DDay Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DDAY_NAME = 14;

	/**
	 * The feature id for the '<em><b>DQuarter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DQUARTER_NAME = 15;

	/**
	 * The feature id for the '<em><b>DHoliday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DHOLIDAY = 16;

	/**
	 * The feature id for the '<em><b>DWeekend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DWEEKEND = 17;

	/**
	 * The feature id for the '<em><b>DFollowing Holiday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DFOLLOWING_HOLIDAY = 18;

	/**
	 * The feature id for the '<em><b>DFirst Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DFIRST_DOM = 19;

	/**
	 * The feature id for the '<em><b>DLast Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DLAST_DOM = 20;

	/**
	 * The feature id for the '<em><b>DSame Day Ly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DSAME_DAY_LY = 21;

	/**
	 * The feature id for the '<em><b>DSame Day Lq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DSAME_DAY_LQ = 22;

	/**
	 * The feature id for the '<em><b>DCurrent Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DCURRENT_DAY = 23;

	/**
	 * The feature id for the '<em><b>DCurrent Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DCURRENT_WEEK = 24;

	/**
	 * The feature id for the '<em><b>DCurrent Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DCURRENT_MONTH = 25;

	/**
	 * The feature id for the '<em><b>DCurrent Quarter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DCURRENT_QUARTER = 26;

	/**
	 * The feature id for the '<em><b>DCurrent Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DCURRENT_YEAR = 27;

	/**
	 * The number of structural features of the '<em>Date Dim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Date Dim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.DbgenVersionImpl <em>Dbgen Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.DbgenVersionImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getDbgenVersion()
	 * @generated
	 */
	int DBGEN_VERSION = 8;

	/**
	 * The feature id for the '<em><b>Dv Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBGEN_VERSION__DV_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Dv Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBGEN_VERSION__DV_CREATE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Dv Create Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBGEN_VERSION__DV_CREATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Dv Cmdline Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBGEN_VERSION__DV_CMDLINE_ARGS = 3;

	/**
	 * The number of structural features of the '<em>Dbgen Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBGEN_VERSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dbgen Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBGEN_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl <em>Household Demographics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.HouseholdDemographicsImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getHouseholdDemographics()
	 * @generated
	 */
	int HOUSEHOLD_DEMOGRAPHICS = 9;

	/**
	 * The feature id for the '<em><b>Hd Demo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK = 0;

	/**
	 * The feature id for the '<em><b>Hd Income Band Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK = 1;

	/**
	 * The feature id for the '<em><b>Hd Buy Potential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL = 2;

	/**
	 * The feature id for the '<em><b>Hd Dep Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Hd Vehicle Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Household Demographics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Household Demographics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_DEMOGRAPHICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.IncomeBandImpl <em>Income Band</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.IncomeBandImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getIncomeBand()
	 * @generated
	 */
	int INCOME_BAND = 10;

	/**
	 * The feature id for the '<em><b>Ib Income Band Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_BAND__IB_INCOME_BAND_SK = 0;

	/**
	 * The feature id for the '<em><b>Ib Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_BAND__IB_LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Ib Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_BAND__IB_UPPER_BOUND = 2;

	/**
	 * The number of structural features of the '<em>Income Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_BAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Income Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_BAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.InventoryImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 11;

	/**
	 * The feature id for the '<em><b>Inv Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__INV_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Inv Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__INV_ITEM_SK = 1;

	/**
	 * The feature id for the '<em><b>Inv Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__INV_WAREHOUSE_SK = 2;

	/**
	 * The feature id for the '<em><b>Inv Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__INV_QUANTITY_ON_HAND = 3;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.ItemImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 12;

	/**
	 * The feature id for the '<em><b>IItem Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IITEM_SK = 0;

	/**
	 * The feature id for the '<em><b>IItem Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IITEM_ID = 1;

	/**
	 * The feature id for the '<em><b>IRec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IREC_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>IRec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IREC_END_DATE = 3;

	/**
	 * The feature id for the '<em><b>IItem Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IITEM_DESC = 4;

	/**
	 * The feature id for the '<em><b>ICurrent Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICURRENT_PRICE = 5;

	/**
	 * The feature id for the '<em><b>IWholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IWHOLESALE_COST = 6;

	/**
	 * The feature id for the '<em><b>IBrand Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IBRAND_ID = 7;

	/**
	 * The feature id for the '<em><b>IBrand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IBRAND = 8;

	/**
	 * The feature id for the '<em><b>IClass Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICLASS_ID = 9;

	/**
	 * The feature id for the '<em><b>IClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICLASS = 10;

	/**
	 * The feature id for the '<em><b>ICategory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICATEGORY_ID = 11;

	/**
	 * The feature id for the '<em><b>ICategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICATEGORY = 12;

	/**
	 * The feature id for the '<em><b>IManufact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IMANUFACT_ID = 13;

	/**
	 * The feature id for the '<em><b>IManufact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IMANUFACT = 14;

	/**
	 * The feature id for the '<em><b>ISize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ISIZE = 15;

	/**
	 * The feature id for the '<em><b>IFormulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IFORMULATION = 16;

	/**
	 * The feature id for the '<em><b>IColor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICOLOR = 17;

	/**
	 * The feature id for the '<em><b>IUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IUNITS = 18;

	/**
	 * The feature id for the '<em><b>IContainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICONTAINER = 19;

	/**
	 * The feature id for the '<em><b>IManager Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IMANAGER_ID = 20;

	/**
	 * The feature id for the '<em><b>IProduct Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IPRODUCT_NAME = 21;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.PromotionImpl <em>Promotion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.PromotionImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getPromotion()
	 * @generated
	 */
	int PROMOTION = 13;

	/**
	 * The feature id for the '<em><b>PPromo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PPROMO_SK = 0;

	/**
	 * The feature id for the '<em><b>PPromo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PPROMO_ID = 1;

	/**
	 * The feature id for the '<em><b>PStart Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PSTART_DATE_SK = 2;

	/**
	 * The feature id for the '<em><b>PEnd Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PEND_DATE_SK = 3;

	/**
	 * The feature id for the '<em><b>PItem Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PITEM_SK = 4;

	/**
	 * The feature id for the '<em><b>PCost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCOST = 5;

	/**
	 * The feature id for the '<em><b>PResponse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PRESPONSE_TARGET = 6;

	/**
	 * The feature id for the '<em><b>PPromo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PPROMO_NAME = 7;

	/**
	 * The feature id for the '<em><b>PChannel Dmail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_DMAIL = 8;

	/**
	 * The feature id for the '<em><b>PChannel Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_EMAIL = 9;

	/**
	 * The feature id for the '<em><b>PChannel Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_CATALOG = 10;

	/**
	 * The feature id for the '<em><b>PChannel Tv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_TV = 11;

	/**
	 * The feature id for the '<em><b>PChannel Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_RADIO = 12;

	/**
	 * The feature id for the '<em><b>PChannel Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_PRESS = 13;

	/**
	 * The feature id for the '<em><b>PChannel Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_EVENT = 14;

	/**
	 * The feature id for the '<em><b>PChannel Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_DEMO = 15;

	/**
	 * The feature id for the '<em><b>PChannel Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PCHANNEL_DETAILS = 16;

	/**
	 * The feature id for the '<em><b>PPurpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PPURPOSE = 17;

	/**
	 * The feature id for the '<em><b>PDiscount Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PDISCOUNT_ACTIVE = 18;

	/**
	 * The number of structural features of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.ReasonImpl <em>Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.ReasonImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getReason()
	 * @generated
	 */
	int REASON = 14;

	/**
	 * The feature id for the '<em><b>RReason Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON__RREASON_SK = 0;

	/**
	 * The feature id for the '<em><b>RReason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON__RREASON_ID = 1;

	/**
	 * The feature id for the '<em><b>RReason Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON__RREASON_DESC = 2;

	/**
	 * The number of structural features of the '<em>Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.ShipModeImpl <em>Ship Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.ShipModeImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getShipMode()
	 * @generated
	 */
	int SHIP_MODE = 15;

	/**
	 * The feature id for the '<em><b>Sm Ship Mode Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE__SM_SHIP_MODE_SK = 0;

	/**
	 * The feature id for the '<em><b>Sm Ship Mode Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE__SM_SHIP_MODE_ID = 1;

	/**
	 * The feature id for the '<em><b>Sm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE__SM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Sm Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE__SM_CODE = 3;

	/**
	 * The feature id for the '<em><b>Sm Carrier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE__SM_CARRIER = 4;

	/**
	 * The feature id for the '<em><b>Sm Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE__SM_CONTRACT = 5;

	/**
	 * The number of structural features of the '<em>Ship Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ship Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.StoreImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 16;

	/**
	 * The feature id for the '<em><b>SStore Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTORE_SK = 0;

	/**
	 * The feature id for the '<em><b>SStore Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTORE_ID = 1;

	/**
	 * The feature id for the '<em><b>SRec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SREC_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>SRec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SREC_END_DATE = 3;

	/**
	 * The feature id for the '<em><b>SClosed Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SCLOSED_DATE_SK = 4;

	/**
	 * The feature id for the '<em><b>SStore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTORE_NAME = 5;

	/**
	 * The feature id for the '<em><b>SNumber Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SNUMBER_EMPLOYEES = 6;

	/**
	 * The feature id for the '<em><b>SFloor Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SFLOOR_SPACE = 7;

	/**
	 * The feature id for the '<em><b>SHours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SHOURS = 8;

	/**
	 * The feature id for the '<em><b>SManager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SMANAGER = 9;

	/**
	 * The feature id for the '<em><b>SMarket Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SMARKET_ID = 10;

	/**
	 * The feature id for the '<em><b>SGeography Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SGEOGRAPHY_CLASS = 11;

	/**
	 * The feature id for the '<em><b>SMarket Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SMARKET_DESC = 12;

	/**
	 * The feature id for the '<em><b>SMarket Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SMARKET_MANAGER = 13;

	/**
	 * The feature id for the '<em><b>SDivision Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SDIVISION_ID = 14;

	/**
	 * The feature id for the '<em><b>SDivision Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SDIVISION_NAME = 15;

	/**
	 * The feature id for the '<em><b>SCompany Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SCOMPANY_ID = 16;

	/**
	 * The feature id for the '<em><b>SCompany Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SCOMPANY_NAME = 17;

	/**
	 * The feature id for the '<em><b>SStreet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTREET_NUMBER = 18;

	/**
	 * The feature id for the '<em><b>SStreet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTREET_NAME = 19;

	/**
	 * The feature id for the '<em><b>SStreet Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTREET_TYPE = 20;

	/**
	 * The feature id for the '<em><b>SSuite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSUITE_NUMBER = 21;

	/**
	 * The feature id for the '<em><b>SCity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SCITY = 22;

	/**
	 * The feature id for the '<em><b>SCounty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SCOUNTY = 23;

	/**
	 * The feature id for the '<em><b>SState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTATE = 24;

	/**
	 * The feature id for the '<em><b>SZip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SZIP = 25;

	/**
	 * The feature id for the '<em><b>SCountry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SCOUNTRY = 26;

	/**
	 * The feature id for the '<em><b>SGmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SGMT_OFFSET = 27;

	/**
	 * The feature id for the '<em><b>STax Precentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STAX_PRECENTAGE = 28;

	/**
	 * The feature id for the '<em><b>Store Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STORE_SALES = 29;

	/**
	 * The feature id for the '<em><b>Store Returns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STORE_RETURNS = 30;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.StoreReturnsImpl <em>Store Returns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.StoreReturnsImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreReturns()
	 * @generated
	 */
	int STORE_RETURNS = 17;

	/**
	 * The feature id for the '<em><b>Sr Returned Date Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURNED_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Sr Return Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_TIME_SK = 1;

	/**
	 * The feature id for the '<em><b>Sr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_ID = 2;

	/**
	 * The feature id for the '<em><b>Sr Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_ITEM_SK = 3;

	/**
	 * The feature id for the '<em><b>Sr Ticket Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_TICKET_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Sr Customer Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_CUSTOMER_SK = 5;

	/**
	 * The feature id for the '<em><b>Sr Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_CDEMO_SK = 6;

	/**
	 * The feature id for the '<em><b>Sr Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_HDEMO_SK = 7;

	/**
	 * The feature id for the '<em><b>Sr Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_ADDR_SK = 8;

	/**
	 * The feature id for the '<em><b>Sr Store Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_STORE_SK = 9;

	/**
	 * The feature id for the '<em><b>Sr Reason Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_REASON_SK = 10;

	/**
	 * The feature id for the '<em><b>Sr Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_QUANTITY = 11;

	/**
	 * The feature id for the '<em><b>Sr Return Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_AMT = 12;

	/**
	 * The feature id for the '<em><b>Sr Return Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_TAX = 13;

	/**
	 * The feature id for the '<em><b>Sr Return Amt Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_AMT_INC_TAX = 14;

	/**
	 * The feature id for the '<em><b>Sr Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_FEE = 15;

	/**
	 * The feature id for the '<em><b>Sr Return Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_SHIP_COST = 16;

	/**
	 * The feature id for the '<em><b>Sr Refunded Cash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_REFUNDED_CASH = 17;

	/**
	 * The feature id for the '<em><b>Sr Reversed Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_REVERSED_CHARGE = 18;

	/**
	 * The feature id for the '<em><b>Sr Store Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_STORE_CREDIT = 19;

	/**
	 * The feature id for the '<em><b>Sr Net Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_NET_LOSS = 20;

	/**
	 * The number of structural features of the '<em>Store Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Store Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.StoreReturnsIdImpl <em>Store Returns Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.StoreReturnsIdImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreReturnsId()
	 * @generated
	 */
	int STORE_RETURNS_ID = 18;

	/**
	 * The feature id for the '<em><b>Sr Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_ID__SR_ITEM_SK = 0;

	/**
	 * The feature id for the '<em><b>Sr Ticket Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_ID__SR_TICKET_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Store Returns Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Store Returns Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.StoreSalesImpl <em>Store Sales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.StoreSalesImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreSales()
	 * @generated
	 */
	int STORE_SALES = 19;

	/**
	 * The feature id for the '<em><b>Ss Sold Date Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_SOLD_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Ss Sold Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_SOLD_TIME_SK = 1;

	/**
	 * The feature id for the '<em><b>Ss Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_ITEM_SK = 2;

	/**
	 * The feature id for the '<em><b>Ss Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_ID = 3;

	/**
	 * The feature id for the '<em><b>Ss Customer Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_CUSTOMER_SK = 4;

	/**
	 * The feature id for the '<em><b>Ss Ticket Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_TICKET_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Ss Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_CDEMO_SK = 6;

	/**
	 * The feature id for the '<em><b>Ss Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_HDEMO_SK = 7;

	/**
	 * The feature id for the '<em><b>Ss Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_ADDR_SK = 8;

	/**
	 * The feature id for the '<em><b>Ss Store Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_STORE_SK = 9;

	/**
	 * The feature id for the '<em><b>Ss Promo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_PROMO_SK = 10;

	/**
	 * The feature id for the '<em><b>Ss Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_QUANTITY = 11;

	/**
	 * The feature id for the '<em><b>Ss Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_WHOLESALE_COST = 12;

	/**
	 * The feature id for the '<em><b>Ss List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_LIST_PRICE = 13;

	/**
	 * The feature id for the '<em><b>Ss Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_SALES_PRICE = 14;

	/**
	 * The feature id for the '<em><b>Ss Ext Discount Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_EXT_DISCOUNT_AMT = 15;

	/**
	 * The feature id for the '<em><b>Ss Ext Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_EXT_SALES_PRICE = 16;

	/**
	 * The feature id for the '<em><b>Ss Ext Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_EXT_WHOLESALE_COST = 17;

	/**
	 * The feature id for the '<em><b>Ss Ext List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_EXT_LIST_PRICE = 18;

	/**
	 * The feature id for the '<em><b>Ss Ext Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_EXT_TAX = 19;

	/**
	 * The feature id for the '<em><b>Ss Coupon Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_COUPON_AMT = 20;

	/**
	 * The feature id for the '<em><b>Ss Net Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_NET_PAID = 21;

	/**
	 * The feature id for the '<em><b>Ss Net Paid Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_NET_PAID_INC_TAX = 22;

	/**
	 * The feature id for the '<em><b>Ss Net Profit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES__SS_NET_PROFIT = 23;

	/**
	 * The number of structural features of the '<em>Store Sales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Store Sales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.StoreSalesIdImpl <em>Store Sales Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.StoreSalesIdImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreSalesId()
	 * @generated
	 */
	int STORE_SALES_ID = 20;

	/**
	 * The feature id for the '<em><b>Ss Customer Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES_ID__SS_CUSTOMER_SK = 0;

	/**
	 * The feature id for the '<em><b>Ss Ticket Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES_ID__SS_TICKET_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Store Sales Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Store Sales Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_SALES_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.TimeDimImpl <em>Time Dim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.TimeDimImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getTimeDim()
	 * @generated
	 */
	int TIME_DIM = 21;

	/**
	 * The feature id for the '<em><b>TTime Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TTIME_SK = 0;

	/**
	 * The feature id for the '<em><b>TTime Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TTIME_ID = 1;

	/**
	 * The feature id for the '<em><b>TTime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TTIME = 2;

	/**
	 * The feature id for the '<em><b>THour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__THOUR = 3;

	/**
	 * The feature id for the '<em><b>TMinute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TMINUTE = 4;

	/**
	 * The feature id for the '<em><b>TSecond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TSECOND = 5;

	/**
	 * The feature id for the '<em><b>TAm Pm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TAM_PM = 6;

	/**
	 * The feature id for the '<em><b>TShift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TSHIFT = 7;

	/**
	 * The feature id for the '<em><b>TSub Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TSUB_SHIFT = 8;

	/**
	 * The feature id for the '<em><b>TMeal Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM__TMEAL_TIME = 9;

	/**
	 * The number of structural features of the '<em>Time Dim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Time Dim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.WarehouseImpl <em>Warehouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.WarehouseImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWarehouse()
	 * @generated
	 */
	int WAREHOUSE = 22;

	/**
	 * The feature id for the '<em><b>WWarehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WWAREHOUSE_SK = 0;

	/**
	 * The feature id for the '<em><b>WWarehouse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WWAREHOUSE_ID = 1;

	/**
	 * The feature id for the '<em><b>WWarehouse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WWAREHOUSE_NAME = 2;

	/**
	 * The feature id for the '<em><b>WWarehouse Sq Ft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WWAREHOUSE_SQ_FT = 3;

	/**
	 * The feature id for the '<em><b>WStreet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WSTREET_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>WStreet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WSTREET_NAME = 5;

	/**
	 * The feature id for the '<em><b>WStreet Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WSTREET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>WSuite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WSUITE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>WCity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WCITY = 8;

	/**
	 * The feature id for the '<em><b>WCounty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WCOUNTY = 9;

	/**
	 * The feature id for the '<em><b>WState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WSTATE = 10;

	/**
	 * The feature id for the '<em><b>WZip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WZIP = 11;

	/**
	 * The feature id for the '<em><b>WCountry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WCOUNTRY = 12;

	/**
	 * The feature id for the '<em><b>WGmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE__WGMT_OFFSET = 13;

	/**
	 * The number of structural features of the '<em>Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.WebPageImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 23;

	/**
	 * The feature id for the '<em><b>Wp Web Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_WEB_PAGE_SK = 0;

	/**
	 * The feature id for the '<em><b>Wp Web Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_WEB_PAGE_ID = 1;

	/**
	 * The feature id for the '<em><b>Wp Rec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_REC_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Wp Rec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_REC_END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Wp Creation Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_CREATION_DATE_SK = 4;

	/**
	 * The feature id for the '<em><b>Wp Access Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_ACCESS_DATE_SK = 5;

	/**
	 * The feature id for the '<em><b>Wp Autogen Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_AUTOGEN_FLAG = 6;

	/**
	 * The feature id for the '<em><b>Wp Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_CUSTOMER_SK = 7;

	/**
	 * The feature id for the '<em><b>Wp Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_URL = 8;

	/**
	 * The feature id for the '<em><b>Wp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Wp Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_CHAR_COUNT = 10;

	/**
	 * The feature id for the '<em><b>Wp Link Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_LINK_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Wp Image Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_IMAGE_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Wp Max Ad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WP_MAX_AD_COUNT = 13;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.WebReturnsImpl <em>Web Returns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.WebReturnsImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebReturns()
	 * @generated
	 */
	int WEB_RETURNS = 24;

	/**
	 * The feature id for the '<em><b>Wr Returned Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURNED_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Wr Returned Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURNED_TIME_SK = 1;

	/**
	 * The feature id for the '<em><b>Wr Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_ITEM_SK = 2;

	/**
	 * The feature id for the '<em><b>Wr Refunded Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK = 3;

	/**
	 * The feature id for the '<em><b>Wr Refunded Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REFUNDED_CDEMO_SK = 4;

	/**
	 * The feature id for the '<em><b>Wr Refunded Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REFUNDED_HDEMO_SK = 5;

	/**
	 * The feature id for the '<em><b>Wr Refunded Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REFUNDED_ADDR_SK = 6;

	/**
	 * The feature id for the '<em><b>Wr Returning Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURNING_CUSTOMER_SK = 7;

	/**
	 * The feature id for the '<em><b>Wr Returning Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURNING_CDEMO_SK = 8;

	/**
	 * The feature id for the '<em><b>Wr Returning Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURNING_HDEMO_SK = 9;

	/**
	 * The feature id for the '<em><b>Wr Returning Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURNING_ADDR_SK = 10;

	/**
	 * The feature id for the '<em><b>Wr Web Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_WEB_PAGE_SK = 11;

	/**
	 * The feature id for the '<em><b>Wr Reason Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REASON_SK = 12;

	/**
	 * The feature id for the '<em><b>Wr Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_ORDER_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Wr Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURN_QUANTITY = 14;

	/**
	 * The feature id for the '<em><b>Wr Return Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURN_AMT = 15;

	/**
	 * The feature id for the '<em><b>Wr Return Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURN_TAX = 16;

	/**
	 * The feature id for the '<em><b>Wr Return Amt Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURN_AMT_INC_TAX = 17;

	/**
	 * The feature id for the '<em><b>Wr Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_FEE = 18;

	/**
	 * The feature id for the '<em><b>Wr Return Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_RETURN_SHIP_COST = 19;

	/**
	 * The feature id for the '<em><b>Wr Refunded Cash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REFUNDED_CASH = 20;

	/**
	 * The feature id for the '<em><b>Wr Reversed Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_REVERSED_CHARGE = 21;

	/**
	 * The feature id for the '<em><b>Wr Account Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_ACCOUNT_CREDIT = 22;

	/**
	 * The feature id for the '<em><b>Wr Net Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS__WR_NET_LOSS = 23;

	/**
	 * The number of structural features of the '<em>Web Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Web Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_RETURNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.WebSalesImpl <em>Web Sales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.WebSalesImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebSales()
	 * @generated
	 */
	int WEB_SALES = 25;

	/**
	 * The feature id for the '<em><b>Ws Sold Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SOLD_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Ws Sold Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SOLD_TIME_SK = 1;

	/**
	 * The feature id for the '<em><b>Ws Ship Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SHIP_DATE_SK = 2;

	/**
	 * The feature id for the '<em><b>Ws Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_ITEM_SK = 3;

	/**
	 * The feature id for the '<em><b>Ws Bill Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_BILL_CUSTOMER_SK = 4;

	/**
	 * The feature id for the '<em><b>Ws Bill Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_BILL_CDEMO_SK = 5;

	/**
	 * The feature id for the '<em><b>Ws Bill Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_BILL_HDEMO_SK = 6;

	/**
	 * The feature id for the '<em><b>Ws Bill Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_BILL_ADDR_SK = 7;

	/**
	 * The feature id for the '<em><b>Ws Ship Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SHIP_CUSTOMER_SK = 8;

	/**
	 * The feature id for the '<em><b>Ws Ship Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SHIP_CDEMO_SK = 9;

	/**
	 * The feature id for the '<em><b>Ws Ship Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SHIP_HDEMO_SK = 10;

	/**
	 * The feature id for the '<em><b>Ws Ship Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SHIP_ADDR_SK = 11;

	/**
	 * The feature id for the '<em><b>Ws Web Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_WEB_PAGE_SK = 12;

	/**
	 * The feature id for the '<em><b>Ws Web Site Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_WEB_SITE_SK = 13;

	/**
	 * The feature id for the '<em><b>Ws Ship Mode Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SHIP_MODE_SK = 14;

	/**
	 * The feature id for the '<em><b>Ws Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_WAREHOUSE_SK = 15;

	/**
	 * The feature id for the '<em><b>Ws Promo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_PROMO_SK = 16;

	/**
	 * The feature id for the '<em><b>Ws Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_ORDER_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Ws Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_QUANTITY = 18;

	/**
	 * The feature id for the '<em><b>Ws Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_WHOLESALE_COST = 19;

	/**
	 * The feature id for the '<em><b>Ws List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_LIST_PRICE = 20;

	/**
	 * The feature id for the '<em><b>Ws Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_SALES_PRICE = 21;

	/**
	 * The feature id for the '<em><b>Ws Ext Discount Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_EXT_DISCOUNT_AMT = 22;

	/**
	 * The feature id for the '<em><b>Ws Ext Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_EXT_SALES_PRICE = 23;

	/**
	 * The feature id for the '<em><b>Ws Ext Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_EXT_WHOLESALE_COST = 24;

	/**
	 * The feature id for the '<em><b>Ws Ext List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_EXT_LIST_PRICE = 25;

	/**
	 * The feature id for the '<em><b>Ws Ext Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_EXT_TAX = 26;

	/**
	 * The feature id for the '<em><b>Ws Coupon Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_COUPON_AMT = 27;

	/**
	 * The feature id for the '<em><b>Ws Ext Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_EXT_SHIP_COST = 28;

	/**
	 * The feature id for the '<em><b>Ws Net Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_NET_PAID = 29;

	/**
	 * The feature id for the '<em><b>Ws Net Paid Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_NET_PAID_INC_TAX = 30;

	/**
	 * The feature id for the '<em><b>Ws Net Paid Inc Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_NET_PAID_INC_SHIP = 31;

	/**
	 * The feature id for the '<em><b>Ws Net Paid Inc Ship Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_NET_PAID_INC_SHIP_TAX = 32;

	/**
	 * The feature id for the '<em><b>Ws Net Profit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES__WS_NET_PROFIT = 33;

	/**
	 * The number of structural features of the '<em>Web Sales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES_FEATURE_COUNT = 34;

	/**
	 * The number of operations of the '<em>Web Sales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SALES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.tpcdsModel.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.tpcdsModel.impl.WebSiteImpl
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 26;

	/**
	 * The feature id for the '<em><b>Web Site Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SITE_SK = 0;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SITE_ID = 1;

	/**
	 * The feature id for the '<em><b>Web Rec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_REC_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Web Rec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_REC_END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Web Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_NAME = 4;

	/**
	 * The feature id for the '<em><b>Web Open Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_OPEN_DATE_SK = 5;

	/**
	 * The feature id for the '<em><b>Web Close Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_CLOSE_DATE_SK = 6;

	/**
	 * The feature id for the '<em><b>Web Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Web Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Web Mkt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_MKT_ID = 9;

	/**
	 * The feature id for the '<em><b>Web Mkt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_MKT_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Web Mkt Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_MKT_DESC = 11;

	/**
	 * The feature id for the '<em><b>Web Market Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_MARKET_MANAGER = 12;

	/**
	 * The feature id for the '<em><b>Web Company Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_COMPANY_ID = 13;

	/**
	 * The feature id for the '<em><b>Web Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_COMPANY_NAME = 14;

	/**
	 * The feature id for the '<em><b>Web Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_STREET_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>Web Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_STREET_NAME = 16;

	/**
	 * The feature id for the '<em><b>Web Street Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_STREET_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Web Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SUITE_NUMBER = 18;

	/**
	 * The feature id for the '<em><b>Web City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_CITY = 19;

	/**
	 * The feature id for the '<em><b>Web County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_COUNTY = 20;

	/**
	 * The feature id for the '<em><b>Web State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_STATE = 21;

	/**
	 * The feature id for the '<em><b>Web Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_ZIP = 22;

	/**
	 * The feature id for the '<em><b>Web Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_COUNTRY = 23;

	/**
	 * The feature id for the '<em><b>Web Gmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_GMT_OFFSET = 24;

	/**
	 * The feature id for the '<em><b>Web Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_TAX_PERCENTAGE = 25;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Date
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 27;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Time
	 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 28;


	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.CallCenter <em>Call Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Center</em>'.
	 * @see tpcds.tpcdsModel.CallCenter
	 * @generated
	 */
	EClass getCallCenter();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCallCenterSk <em>Cc Call Center Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Call Center Sk</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCallCenterSk()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCallCenterSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCallCenterId <em>Cc Call Center Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Call Center Id</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCallCenterId()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCallCenterId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcRecStartDate <em>Cc Rec Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Rec Start Date</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcRecStartDate()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcRecStartDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcRecEndDate <em>Cc Rec End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Rec End Date</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcRecEndDate()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcRecEndDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcClosedDateSk <em>Cc Closed Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Closed Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcClosedDateSk()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcClosedDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcOpenDateSk <em>Cc Open Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Open Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcOpenDateSk()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcOpenDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcName <em>Cc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Name</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcName()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcClass <em>Cc Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Class</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcClass()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcClass();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcEmployees <em>Cc Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Employees</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcEmployees()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcEmployees();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcSqFt <em>Cc Sq Ft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Sq Ft</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcSqFt()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcSqFt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcHours <em>Cc Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Hours</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcHours()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcHours();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcManager <em>Cc Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Manager</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcManager()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcManager();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcMktId <em>Cc Mkt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Mkt Id</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcMktId()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcMktId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcMktClass <em>Cc Mkt Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Mkt Class</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcMktClass()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcMktClass();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcMktDesc <em>Cc Mkt Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Mkt Desc</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcMktDesc()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcMktDesc();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcMarketManager <em>Cc Market Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Market Manager</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcMarketManager()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcMarketManager();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcDivision <em>Cc Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Division</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcDivision()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcDivision();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcDivisionName <em>Cc Division Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Division Name</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcDivisionName()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcDivisionName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCompany <em>Cc Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Company</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCompany()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCompany();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCompanyName <em>Cc Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Company Name</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCompanyName()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCompanyName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcStreetNumber <em>Cc Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Street Number</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcStreetNumber()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcStreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcStreetName <em>Cc Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Street Name</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcStreetName()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcStreetName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcStreetType <em>Cc Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Street Type</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcStreetType()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcStreetType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcSuiteNumber <em>Cc Suite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Suite Number</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcSuiteNumber()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcSuiteNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCity <em>Cc City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc City</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCity()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCounty <em>Cc County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc County</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCounty()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCounty();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcState <em>Cc State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc State</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcState()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcState();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcZip <em>Cc Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Zip</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcZip()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcZip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcCountry <em>Cc Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Country</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcCountry()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcCountry();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcGmtOffset <em>Cc Gmt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Gmt Offset</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcGmtOffset()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcGmtOffset();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CallCenter#getCcTaxPercentage <em>Cc Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Tax Percentage</em>'.
	 * @see tpcds.tpcdsModel.CallCenter#getCcTaxPercentage()
	 * @see #getCallCenter()
	 * @generated
	 */
	EAttribute getCallCenter_CcTaxPercentage();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.CatalogPage <em>Catalog Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Page</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage
	 * @generated
	 */
	EClass getCatalogPage();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpCatalogPageSk <em>Cp Catalog Page Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Catalog Page Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpCatalogPageSk()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpCatalogPageSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpCatalogPageId <em>Cp Catalog Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Catalog Page Id</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpCatalogPageId()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpCatalogPageId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpStartDateSk <em>Cp Start Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Start Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpStartDateSk()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpStartDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpEndDateSk <em>Cp End Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp End Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpEndDateSk()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpEndDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpDepartment <em>Cp Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Department</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpDepartment()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpDepartment();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpCatalogNumber <em>Cp Catalog Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Catalog Number</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpCatalogNumber()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpCatalogNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpCatalogPageNumber <em>Cp Catalog Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Catalog Page Number</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpCatalogPageNumber()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpCatalogPageNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpDescription <em>Cp Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Description</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpDescription()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpDescription();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogPage#getCpType <em>Cp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Type</em>'.
	 * @see tpcds.tpcdsModel.CatalogPage#getCpType()
	 * @see #getCatalogPage()
	 * @generated
	 */
	EAttribute getCatalogPage_CpType();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.CatalogReturns <em>Catalog Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Returns</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns
	 * @generated
	 */
	EClass getCatalogReturns();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnedDateSk <em>Cr Returned Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Returned Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnedDateSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnedDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnedTimeSk <em>Cr Returned Time Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Returned Time Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnedTimeSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnedTimeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrItemSk <em>Cr Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Item Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrItemSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrRefundedCustomerSk <em>Cr Refunded Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Refunded Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrRefundedCustomerSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrRefundedCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrRefundedCdemoSk <em>Cr Refunded Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Refunded Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrRefundedCdemoSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrRefundedCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrRefundedHdemoSk <em>Cr Refunded Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Refunded Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrRefundedHdemoSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrRefundedHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrRefundedAddrSk <em>Cr Refunded Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Refunded Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrRefundedAddrSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrRefundedAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturningCustomerSk <em>Cr Returning Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Returning Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturningCustomerSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturningCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturningCdemoSk <em>Cr Returning Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Returning Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturningCdemoSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturningCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturningHdemoSk <em>Cr Returning Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Returning Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturningHdemoSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturningHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturningAddrSk <em>Cr Returning Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Returning Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturningAddrSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturningAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrCallCenterSk <em>Cr Call Center Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Call Center Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrCallCenterSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrCallCenterSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrCatalogPageSk <em>Cr Catalog Page Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Catalog Page Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrCatalogPageSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrCatalogPageSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrShipModeSk <em>Cr Ship Mode Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Ship Mode Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrShipModeSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrShipModeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrWarehouseSk <em>Cr Warehouse Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Warehouse Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrWarehouseSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrWarehouseSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReasonSk <em>Cr Reason Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Reason Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReasonSk()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReasonSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrOrderNumber <em>Cr Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Order Number</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrOrderNumber()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrOrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnQuantity <em>Cr Return Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Return Quantity</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnQuantity()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnAmount <em>Cr Return Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Return Amount</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnAmount()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnAmount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnTax <em>Cr Return Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Return Tax</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnTax()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnAmtIncTax <em>Cr Return Amt Inc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Return Amt Inc Tax</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnAmtIncTax()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnAmtIncTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrFee <em>Cr Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Fee</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrFee()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrFee();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReturnShipCost <em>Cr Return Ship Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Return Ship Cost</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReturnShipCost()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReturnShipCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrRefundedCash <em>Cr Refunded Cash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Refunded Cash</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrRefundedCash()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrRefundedCash();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrReversedCharge <em>Cr Reversed Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Reversed Charge</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrReversedCharge()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrReversedCharge();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrStoreCredit <em>Cr Store Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Store Credit</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrStoreCredit()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrStoreCredit();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogReturns#getCrNetLoss <em>Cr Net Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr Net Loss</em>'.
	 * @see tpcds.tpcdsModel.CatalogReturns#getCrNetLoss()
	 * @see #getCatalogReturns()
	 * @generated
	 */
	EAttribute getCatalogReturns_CrNetLoss();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.CatalogSales <em>Catalog Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Sales</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales
	 * @generated
	 */
	EClass getCatalogSales();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsSoldDateSk <em>Cs Sold Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Sold Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsSoldDateSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsSoldDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsSoldTimeSk <em>Cs Sold Time Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Sold Time Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsSoldTimeSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsSoldTimeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsShipDateSk <em>Cs Ship Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ship Date Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsShipDateSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsShipDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsBillCustomerSk <em>Cs Bill Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Bill Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsBillCustomerSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsBillCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsBillCdemoSk <em>Cs Bill Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Bill Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsBillCdemoSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsBillCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsBillHdemoSk <em>Cs Bill Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Bill Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsBillHdemoSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsBillHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsBillAddrSk <em>Cs Bill Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Bill Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsBillAddrSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsBillAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsShipCustomerSk <em>Cs Ship Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ship Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsShipCustomerSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsShipCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsShipCdemoSk <em>Cs Ship Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ship Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsShipCdemoSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsShipCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsShipHdemoSk <em>Cs Ship Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ship Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsShipHdemoSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsShipHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsShipAddrSk <em>Cs Ship Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ship Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsShipAddrSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsShipAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsCallCenterSk <em>Cs Call Center Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Call Center Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsCallCenterSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsCallCenterSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsCatalogPageSk <em>Cs Catalog Page Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Catalog Page Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsCatalogPageSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsCatalogPageSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsShipModeSk <em>Cs Ship Mode Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ship Mode Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsShipModeSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsShipModeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsWarehouseSk <em>Cs Warehouse Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Warehouse Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsWarehouseSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsWarehouseSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsItemSk <em>Cs Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Item Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsItemSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsPromoSk <em>Cs Promo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Promo Sk</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsPromoSk()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsPromoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsOrderNumber <em>Cs Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Order Number</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsOrderNumber()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsOrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsQuantity <em>Cs Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Quantity</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsQuantity()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsWholesaleCost <em>Cs Wholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Wholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsWholesaleCost()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsListPrice <em>Cs List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs List Price</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsListPrice()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsListPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsSalesPrice <em>Cs Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Sales Price</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsSalesPrice()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsSalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsExtDiscountAmt <em>Cs Ext Discount Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ext Discount Amt</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsExtDiscountAmt()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsExtDiscountAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsExtSalesPrice <em>Cs Ext Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ext Sales Price</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsExtSalesPrice()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsExtSalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsExtWholesaleCost <em>Cs Ext Wholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ext Wholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsExtWholesaleCost()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsExtWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsExtListPrice <em>Cs Ext List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ext List Price</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsExtListPrice()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsExtListPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsExtTax <em>Cs Ext Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ext Tax</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsExtTax()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsExtTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsCouponAmt <em>Cs Coupon Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Coupon Amt</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsCouponAmt()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsCouponAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsExtShipCost <em>Cs Ext Ship Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Ext Ship Cost</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsExtShipCost()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsExtShipCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaid <em>Cs Net Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Net Paid</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsNetPaid()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsNetPaid();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncTax <em>Cs Net Paid Inc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Net Paid Inc Tax</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncTax()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsNetPaidIncTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShip <em>Cs Net Paid Inc Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Net Paid Inc Ship</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShip()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsNetPaidIncShip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShipTax <em>Cs Net Paid Inc Ship Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Net Paid Inc Ship Tax</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShipTax()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsNetPaidIncShipTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CatalogSales#getCsNetProfit <em>Cs Net Profit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Net Profit</em>'.
	 * @see tpcds.tpcdsModel.CatalogSales#getCsNetProfit()
	 * @see #getCatalogSales()
	 * @generated
	 */
	EAttribute getCatalogSales_CsNetProfit();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see tpcds.tpcdsModel.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCCustomerSk <em>CCustomer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCustomer Sk</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCCustomerSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCCustomerId <em>CCustomer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCustomer Id</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCCustomerId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCustomerId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCCurrentCdemoSk <em>CCurrent Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCurrent Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCCurrentCdemoSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCurrentCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCCurrentHdemoSk <em>CCurrent Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCurrent Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCCurrentHdemoSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCurrentHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCCurrentAddrSk <em>CCurrent Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCurrent Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCCurrentAddrSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCurrentAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCFirstShiptoDateSk <em>CFirst Shipto Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CFirst Shipto Date Sk</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCFirstShiptoDateSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CFirstShiptoDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCFirstSalesDateSk <em>CFirst Sales Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CFirst Sales Date Sk</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCFirstSalesDateSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CFirstSalesDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCSalutation <em>CSalutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CSalutation</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCSalutation()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CSalutation();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCFirstName <em>CFirst Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CFirst Name</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CFirstName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCLastName <em>CLast Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CLast Name</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CLastName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCPreferredCustFlag <em>CPreferred Cust Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPreferred Cust Flag</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCPreferredCustFlag()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CPreferredCustFlag();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCBirthDay <em>CBirth Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBirth Day</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCBirthDay()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CBirthDay();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCBirthMonth <em>CBirth Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBirth Month</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCBirthMonth()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CBirthMonth();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCBirthYear <em>CBirth Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBirth Year</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCBirthYear()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CBirthYear();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCBirthCountry <em>CBirth Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBirth Country</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCBirthCountry()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CBirthCountry();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCLogin <em>CLogin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CLogin</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCLogin()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CLogin();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCEmailAddress <em>CEmail Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEmail Address</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCEmailAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CEmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Customer#getCLastReviewDate <em>CLast Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CLast Review Date</em>'.
	 * @see tpcds.tpcdsModel.Customer#getCLastReviewDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CLastReviewDate();

	/**
	 * Returns the meta object for the reference list '{@link tpcds.tpcdsModel.Customer#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store Returns</em>'.
	 * @see tpcds.tpcdsModel.Customer#getStoreReturns()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_StoreReturns();

	/**
	 * Returns the meta object for the reference list '{@link tpcds.tpcdsModel.Customer#getStoreSales <em>Store Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store Sales</em>'.
	 * @see tpcds.tpcdsModel.Customer#getStoreSales()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_StoreSales();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.CustomerAddress <em>Customer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Address</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress
	 * @generated
	 */
	EClass getCustomerAddress();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaAddressSk <em>Ca Address Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Address Sk</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaAddressSk()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaAddressSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaAddressId <em>Ca Address Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Address Id</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaAddressId()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaAddressId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaStreetNumber <em>Ca Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Street Number</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaStreetNumber()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaStreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaStreetName <em>Ca Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Street Name</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaStreetName()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaStreetName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaStreetType <em>Ca Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Street Type</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaStreetType()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaStreetType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaSuiteNumber <em>Ca Suite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Suite Number</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaSuiteNumber()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaSuiteNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaCity <em>Ca City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca City</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaCity()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaCity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaCounty <em>Ca County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca County</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaCounty()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaCounty();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaState <em>Ca State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca State</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaState()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaState();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaZip <em>Ca Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Zip</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaZip()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaZip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaCountry <em>Ca Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Country</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaCountry()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaCountry();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaGmtOffset <em>Ca Gmt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Gmt Offset</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaGmtOffset()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaGmtOffset();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerAddress#getCaLocationType <em>Ca Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ca Location Type</em>'.
	 * @see tpcds.tpcdsModel.CustomerAddress#getCaLocationType()
	 * @see #getCustomerAddress()
	 * @generated
	 */
	EAttribute getCustomerAddress_CaLocationType();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.CustomerDemographics <em>Customer Demographics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Demographics</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics
	 * @generated
	 */
	EClass getCustomerDemographics();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdDemoSk <em>Cd Demo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Demo Sk</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdDemoSk()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdDemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdGender <em>Cd Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Gender</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdGender()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdGender();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdMaritalStatus <em>Cd Marital Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Marital Status</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdMaritalStatus()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdMaritalStatus();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdEducationStatus <em>Cd Education Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Education Status</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdEducationStatus()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdEducationStatus();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdPurchaseEstimate <em>Cd Purchase Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Purchase Estimate</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdPurchaseEstimate()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdPurchaseEstimate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdCreditRating <em>Cd Credit Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Credit Rating</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdCreditRating()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdCreditRating();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdDepCount <em>Cd Dep Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Dep Count</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdDepCount()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdDepCount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdDepEmployedCount <em>Cd Dep Employed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Dep Employed Count</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdDepEmployedCount()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdDepEmployedCount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.CustomerDemographics#getCdDepCollegeCount <em>Cd Dep College Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd Dep College Count</em>'.
	 * @see tpcds.tpcdsModel.CustomerDemographics#getCdDepCollegeCount()
	 * @see #getCustomerDemographics()
	 * @generated
	 */
	EAttribute getCustomerDemographics_CdDepCollegeCount();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.DateDim <em>Date Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Dim</em>'.
	 * @see tpcds.tpcdsModel.DateDim
	 * @generated
	 */
	EClass getDateDim();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDDateSk <em>DDate Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDate Sk</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDDateSk()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDDateId <em>DDate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDate Id</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDDateId()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDateId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDDate <em>DDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDate</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDDate()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDMonthSeq <em>DMonth Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DMonth Seq</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDMonthSeq()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DMonthSeq();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDWeekSeq <em>DWeek Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DWeek Seq</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDWeekSeq()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DWeekSeq();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDQuarterSeq <em>DQuarter Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DQuarter Seq</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDQuarterSeq()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DQuarterSeq();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDYear <em>DYear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DYear</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDYear()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DYear();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDDow <em>DDow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDow</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDDow()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDow();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDMoy <em>DMoy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DMoy</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDMoy()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DMoy();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDDom <em>DDom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDom</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDDom()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDom();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDQoy <em>DQoy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DQoy</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDQoy()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DQoy();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDFyYear <em>DFy Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DFy Year</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDFyYear()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DFyYear();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDFyQuarterSeq <em>DFy Quarter Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DFy Quarter Seq</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDFyQuarterSeq()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DFyQuarterSeq();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDFyWeekSeq <em>DFy Week Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DFy Week Seq</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDFyWeekSeq()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DFyWeekSeq();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDDayName <em>DDay Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDay Name</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDDayName()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDayName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDQuarterName <em>DQuarter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DQuarter Name</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDQuarterName()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DQuarterName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDHoliday <em>DHoliday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DHoliday</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDHoliday()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DHoliday();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDWeekend <em>DWeekend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DWeekend</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDWeekend()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DWeekend();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDFollowingHoliday <em>DFollowing Holiday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DFollowing Holiday</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDFollowingHoliday()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DFollowingHoliday();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDFirstDom <em>DFirst Dom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DFirst Dom</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDFirstDom()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DFirstDom();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDLastDom <em>DLast Dom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLast Dom</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDLastDom()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DLastDom();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDSameDayLy <em>DSame Day Ly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DSame Day Ly</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDSameDayLy()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DSameDayLy();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDSameDayLq <em>DSame Day Lq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DSame Day Lq</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDSameDayLq()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DSameDayLq();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDCurrentDay <em>DCurrent Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DCurrent Day</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDCurrentDay()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DCurrentDay();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDCurrentWeek <em>DCurrent Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DCurrent Week</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDCurrentWeek()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DCurrentWeek();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDCurrentMonth <em>DCurrent Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DCurrent Month</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDCurrentMonth()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DCurrentMonth();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDCurrentQuarter <em>DCurrent Quarter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DCurrent Quarter</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDCurrentQuarter()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DCurrentQuarter();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DateDim#getDCurrentYear <em>DCurrent Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DCurrent Year</em>'.
	 * @see tpcds.tpcdsModel.DateDim#getDCurrentYear()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DCurrentYear();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.DbgenVersion <em>Dbgen Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dbgen Version</em>'.
	 * @see tpcds.tpcdsModel.DbgenVersion
	 * @generated
	 */
	EClass getDbgenVersion();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DbgenVersion#getDvVersion <em>Dv Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dv Version</em>'.
	 * @see tpcds.tpcdsModel.DbgenVersion#getDvVersion()
	 * @see #getDbgenVersion()
	 * @generated
	 */
	EAttribute getDbgenVersion_DvVersion();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DbgenVersion#getDvCreateDate <em>Dv Create Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dv Create Date</em>'.
	 * @see tpcds.tpcdsModel.DbgenVersion#getDvCreateDate()
	 * @see #getDbgenVersion()
	 * @generated
	 */
	EAttribute getDbgenVersion_DvCreateDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DbgenVersion#getDvCreateTime <em>Dv Create Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dv Create Time</em>'.
	 * @see tpcds.tpcdsModel.DbgenVersion#getDvCreateTime()
	 * @see #getDbgenVersion()
	 * @generated
	 */
	EAttribute getDbgenVersion_DvCreateTime();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.DbgenVersion#getDvCmdlineArgs <em>Dv Cmdline Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dv Cmdline Args</em>'.
	 * @see tpcds.tpcdsModel.DbgenVersion#getDvCmdlineArgs()
	 * @see #getDbgenVersion()
	 * @generated
	 */
	EAttribute getDbgenVersion_DvCmdlineArgs();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.HouseholdDemographics <em>Household Demographics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household Demographics</em>'.
	 * @see tpcds.tpcdsModel.HouseholdDemographics
	 * @generated
	 */
	EClass getHouseholdDemographics();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdDemoSk <em>Hd Demo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hd Demo Sk</em>'.
	 * @see tpcds.tpcdsModel.HouseholdDemographics#getHdDemoSk()
	 * @see #getHouseholdDemographics()
	 * @generated
	 */
	EAttribute getHouseholdDemographics_HdDemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdIncomeBandSk <em>Hd Income Band Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hd Income Band Sk</em>'.
	 * @see tpcds.tpcdsModel.HouseholdDemographics#getHdIncomeBandSk()
	 * @see #getHouseholdDemographics()
	 * @generated
	 */
	EAttribute getHouseholdDemographics_HdIncomeBandSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdBuyPotential <em>Hd Buy Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hd Buy Potential</em>'.
	 * @see tpcds.tpcdsModel.HouseholdDemographics#getHdBuyPotential()
	 * @see #getHouseholdDemographics()
	 * @generated
	 */
	EAttribute getHouseholdDemographics_HdBuyPotential();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdDepCount <em>Hd Dep Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hd Dep Count</em>'.
	 * @see tpcds.tpcdsModel.HouseholdDemographics#getHdDepCount()
	 * @see #getHouseholdDemographics()
	 * @generated
	 */
	EAttribute getHouseholdDemographics_HdDepCount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdVehicleCount <em>Hd Vehicle Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hd Vehicle Count</em>'.
	 * @see tpcds.tpcdsModel.HouseholdDemographics#getHdVehicleCount()
	 * @see #getHouseholdDemographics()
	 * @generated
	 */
	EAttribute getHouseholdDemographics_HdVehicleCount();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.IncomeBand <em>Income Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Band</em>'.
	 * @see tpcds.tpcdsModel.IncomeBand
	 * @generated
	 */
	EClass getIncomeBand();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.IncomeBand#getIbIncomeBandSk <em>Ib Income Band Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ib Income Band Sk</em>'.
	 * @see tpcds.tpcdsModel.IncomeBand#getIbIncomeBandSk()
	 * @see #getIncomeBand()
	 * @generated
	 */
	EAttribute getIncomeBand_IbIncomeBandSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.IncomeBand#getIbLowerBound <em>Ib Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ib Lower Bound</em>'.
	 * @see tpcds.tpcdsModel.IncomeBand#getIbLowerBound()
	 * @see #getIncomeBand()
	 * @generated
	 */
	EAttribute getIncomeBand_IbLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.IncomeBand#getIbUpperBound <em>Ib Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ib Upper Bound</em>'.
	 * @see tpcds.tpcdsModel.IncomeBand#getIbUpperBound()
	 * @see #getIncomeBand()
	 * @generated
	 */
	EAttribute getIncomeBand_IbUpperBound();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see tpcds.tpcdsModel.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Inventory#getInvDateSk <em>Inv Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inv Date Sk</em>'.
	 * @see tpcds.tpcdsModel.Inventory#getInvDateSk()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_InvDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Inventory#getInvItemSk <em>Inv Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inv Item Sk</em>'.
	 * @see tpcds.tpcdsModel.Inventory#getInvItemSk()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_InvItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Inventory#getInvWarehouseSk <em>Inv Warehouse Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inv Warehouse Sk</em>'.
	 * @see tpcds.tpcdsModel.Inventory#getInvWarehouseSk()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_InvWarehouseSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Inventory#getInvQuantityOnHand <em>Inv Quantity On Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inv Quantity On Hand</em>'.
	 * @see tpcds.tpcdsModel.Inventory#getInvQuantityOnHand()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_InvQuantityOnHand();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see tpcds.tpcdsModel.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIItemSk <em>IItem Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IItem Sk</em>'.
	 * @see tpcds.tpcdsModel.Item#getIItemSk()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIItemId <em>IItem Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IItem Id</em>'.
	 * @see tpcds.tpcdsModel.Item#getIItemId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IItemId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIRecStartDate <em>IRec Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IRec Start Date</em>'.
	 * @see tpcds.tpcdsModel.Item#getIRecStartDate()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IRecStartDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIRecEndDate <em>IRec End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IRec End Date</em>'.
	 * @see tpcds.tpcdsModel.Item#getIRecEndDate()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IRecEndDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIItemDesc <em>IItem Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IItem Desc</em>'.
	 * @see tpcds.tpcdsModel.Item#getIItemDesc()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IItemDesc();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getICurrentPrice <em>ICurrent Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ICurrent Price</em>'.
	 * @see tpcds.tpcdsModel.Item#getICurrentPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ICurrentPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIWholesaleCost <em>IWholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IWholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.Item#getIWholesaleCost()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIBrandId <em>IBrand Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IBrand Id</em>'.
	 * @see tpcds.tpcdsModel.Item#getIBrandId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IBrandId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIBrand <em>IBrand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IBrand</em>'.
	 * @see tpcds.tpcdsModel.Item#getIBrand()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IBrand();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIClassId <em>IClass Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IClass Id</em>'.
	 * @see tpcds.tpcdsModel.Item#getIClassId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IClassId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIClass <em>IClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IClass</em>'.
	 * @see tpcds.tpcdsModel.Item#getIClass()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IClass();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getICategoryId <em>ICategory Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ICategory Id</em>'.
	 * @see tpcds.tpcdsModel.Item#getICategoryId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ICategoryId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getICategory <em>ICategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ICategory</em>'.
	 * @see tpcds.tpcdsModel.Item#getICategory()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ICategory();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIManufactId <em>IManufact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IManufact Id</em>'.
	 * @see tpcds.tpcdsModel.Item#getIManufactId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IManufactId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIManufact <em>IManufact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IManufact</em>'.
	 * @see tpcds.tpcdsModel.Item#getIManufact()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IManufact();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getISize <em>ISize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISize</em>'.
	 * @see tpcds.tpcdsModel.Item#getISize()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ISize();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIFormulation <em>IFormulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IFormulation</em>'.
	 * @see tpcds.tpcdsModel.Item#getIFormulation()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IFormulation();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIColor <em>IColor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IColor</em>'.
	 * @see tpcds.tpcdsModel.Item#getIColor()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IColor();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIUnits <em>IUnits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IUnits</em>'.
	 * @see tpcds.tpcdsModel.Item#getIUnits()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IUnits();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IContainer</em>'.
	 * @see tpcds.tpcdsModel.Item#getIContainer()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IContainer();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIManagerId <em>IManager Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IManager Id</em>'.
	 * @see tpcds.tpcdsModel.Item#getIManagerId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IManagerId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Item#getIProductName <em>IProduct Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IProduct Name</em>'.
	 * @see tpcds.tpcdsModel.Item#getIProductName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IProductName();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Promotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promotion</em>'.
	 * @see tpcds.tpcdsModel.Promotion
	 * @generated
	 */
	EClass getPromotion();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPPromoSk <em>PPromo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PPromo Sk</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPPromoSk()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PPromoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPPromoId <em>PPromo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PPromo Id</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPPromoId()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PPromoId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPStartDateSk <em>PStart Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PStart Date Sk</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPStartDateSk()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PStartDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPEndDateSk <em>PEnd Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PEnd Date Sk</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPEndDateSk()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PEndDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPItemSk <em>PItem Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PItem Sk</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPItemSk()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPCost <em>PCost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PCost</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPCost()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPResponseTarget <em>PResponse Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PResponse Target</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPResponseTarget()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PResponseTarget();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPPromoName <em>PPromo Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PPromo Name</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPPromoName()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PPromoName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelDmail <em>PChannel Dmail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Dmail</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelDmail()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelDmail();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelEmail <em>PChannel Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Email</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelEmail()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelEmail();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelCatalog <em>PChannel Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Catalog</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelCatalog()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelCatalog();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelTv <em>PChannel Tv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Tv</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelTv()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelTv();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelRadio <em>PChannel Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Radio</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelRadio()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelRadio();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelPress <em>PChannel Press</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Press</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelPress()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelPress();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelEvent <em>PChannel Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Event</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelEvent()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelEvent();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelDemo <em>PChannel Demo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Demo</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelDemo()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelDemo();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPChannelDetails <em>PChannel Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PChannel Details</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPChannelDetails()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PChannelDetails();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPPurpose <em>PPurpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PPurpose</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPPurpose()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PPurpose();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Promotion#getPDiscountActive <em>PDiscount Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PDiscount Active</em>'.
	 * @see tpcds.tpcdsModel.Promotion#getPDiscountActive()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_PDiscountActive();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Reason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason</em>'.
	 * @see tpcds.tpcdsModel.Reason
	 * @generated
	 */
	EClass getReason();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Reason#getRReasonSk <em>RReason Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RReason Sk</em>'.
	 * @see tpcds.tpcdsModel.Reason#getRReasonSk()
	 * @see #getReason()
	 * @generated
	 */
	EAttribute getReason_RReasonSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Reason#getRReasonId <em>RReason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RReason Id</em>'.
	 * @see tpcds.tpcdsModel.Reason#getRReasonId()
	 * @see #getReason()
	 * @generated
	 */
	EAttribute getReason_RReasonId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Reason#getRReasonDesc <em>RReason Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RReason Desc</em>'.
	 * @see tpcds.tpcdsModel.Reason#getRReasonDesc()
	 * @see #getReason()
	 * @generated
	 */
	EAttribute getReason_RReasonDesc();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.ShipMode <em>Ship Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ship Mode</em>'.
	 * @see tpcds.tpcdsModel.ShipMode
	 * @generated
	 */
	EClass getShipMode();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.ShipMode#getSmShipModeSk <em>Sm Ship Mode Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sm Ship Mode Sk</em>'.
	 * @see tpcds.tpcdsModel.ShipMode#getSmShipModeSk()
	 * @see #getShipMode()
	 * @generated
	 */
	EAttribute getShipMode_SmShipModeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.ShipMode#getSmShipModeId <em>Sm Ship Mode Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sm Ship Mode Id</em>'.
	 * @see tpcds.tpcdsModel.ShipMode#getSmShipModeId()
	 * @see #getShipMode()
	 * @generated
	 */
	EAttribute getShipMode_SmShipModeId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.ShipMode#getSmType <em>Sm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sm Type</em>'.
	 * @see tpcds.tpcdsModel.ShipMode#getSmType()
	 * @see #getShipMode()
	 * @generated
	 */
	EAttribute getShipMode_SmType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.ShipMode#getSmCode <em>Sm Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sm Code</em>'.
	 * @see tpcds.tpcdsModel.ShipMode#getSmCode()
	 * @see #getShipMode()
	 * @generated
	 */
	EAttribute getShipMode_SmCode();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.ShipMode#getSmCarrier <em>Sm Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sm Carrier</em>'.
	 * @see tpcds.tpcdsModel.ShipMode#getSmCarrier()
	 * @see #getShipMode()
	 * @generated
	 */
	EAttribute getShipMode_SmCarrier();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.ShipMode#getSmContract <em>Sm Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sm Contract</em>'.
	 * @see tpcds.tpcdsModel.ShipMode#getSmContract()
	 * @see #getShipMode()
	 * @generated
	 */
	EAttribute getShipMode_SmContract();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see tpcds.tpcdsModel.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSStoreSk <em>SStore Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStore Sk</em>'.
	 * @see tpcds.tpcdsModel.Store#getSStoreSk()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStoreSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSStoreId <em>SStore Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStore Id</em>'.
	 * @see tpcds.tpcdsModel.Store#getSStoreId()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStoreId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSRecStartDate <em>SRec Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRec Start Date</em>'.
	 * @see tpcds.tpcdsModel.Store#getSRecStartDate()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SRecStartDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSRecEndDate <em>SRec End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRec End Date</em>'.
	 * @see tpcds.tpcdsModel.Store#getSRecEndDate()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SRecEndDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSClosedDateSk <em>SClosed Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SClosed Date Sk</em>'.
	 * @see tpcds.tpcdsModel.Store#getSClosedDateSk()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SClosedDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSStoreName <em>SStore Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStore Name</em>'.
	 * @see tpcds.tpcdsModel.Store#getSStoreName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStoreName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSNumberEmployees <em>SNumber Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SNumber Employees</em>'.
	 * @see tpcds.tpcdsModel.Store#getSNumberEmployees()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SNumberEmployees();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSFloorSpace <em>SFloor Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SFloor Space</em>'.
	 * @see tpcds.tpcdsModel.Store#getSFloorSpace()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SFloorSpace();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSHours <em>SHours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SHours</em>'.
	 * @see tpcds.tpcdsModel.Store#getSHours()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SHours();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSManager <em>SManager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SManager</em>'.
	 * @see tpcds.tpcdsModel.Store#getSManager()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SManager();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSMarketId <em>SMarket Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SMarket Id</em>'.
	 * @see tpcds.tpcdsModel.Store#getSMarketId()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SMarketId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSGeographyClass <em>SGeography Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SGeography Class</em>'.
	 * @see tpcds.tpcdsModel.Store#getSGeographyClass()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SGeographyClass();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSMarketDesc <em>SMarket Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SMarket Desc</em>'.
	 * @see tpcds.tpcdsModel.Store#getSMarketDesc()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SMarketDesc();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSMarketManager <em>SMarket Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SMarket Manager</em>'.
	 * @see tpcds.tpcdsModel.Store#getSMarketManager()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SMarketManager();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSDivisionId <em>SDivision Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDivision Id</em>'.
	 * @see tpcds.tpcdsModel.Store#getSDivisionId()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SDivisionId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSDivisionName <em>SDivision Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDivision Name</em>'.
	 * @see tpcds.tpcdsModel.Store#getSDivisionName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SDivisionName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSCompanyId <em>SCompany Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCompany Id</em>'.
	 * @see tpcds.tpcdsModel.Store#getSCompanyId()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SCompanyId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSCompanyName <em>SCompany Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCompany Name</em>'.
	 * @see tpcds.tpcdsModel.Store#getSCompanyName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SCompanyName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSStreetNumber <em>SStreet Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStreet Number</em>'.
	 * @see tpcds.tpcdsModel.Store#getSStreetNumber()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSStreetName <em>SStreet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStreet Name</em>'.
	 * @see tpcds.tpcdsModel.Store#getSStreetName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStreetName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSStreetType <em>SStreet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStreet Type</em>'.
	 * @see tpcds.tpcdsModel.Store#getSStreetType()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStreetType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSSuiteNumber <em>SSuite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSuite Number</em>'.
	 * @see tpcds.tpcdsModel.Store#getSSuiteNumber()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SSuiteNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSCity <em>SCity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCity</em>'.
	 * @see tpcds.tpcdsModel.Store#getSCity()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SCity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSCounty <em>SCounty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCounty</em>'.
	 * @see tpcds.tpcdsModel.Store#getSCounty()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SCounty();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSState <em>SState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SState</em>'.
	 * @see tpcds.tpcdsModel.Store#getSState()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SState();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSZip <em>SZip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SZip</em>'.
	 * @see tpcds.tpcdsModel.Store#getSZip()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SZip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSCountry <em>SCountry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCountry</em>'.
	 * @see tpcds.tpcdsModel.Store#getSCountry()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SCountry();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSGmtOffset <em>SGmt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SGmt Offset</em>'.
	 * @see tpcds.tpcdsModel.Store#getSGmtOffset()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SGmtOffset();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Store#getSTaxPrecentage <em>STax Precentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>STax Precentage</em>'.
	 * @see tpcds.tpcdsModel.Store#getSTaxPrecentage()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_STaxPrecentage();

	/**
	 * Returns the meta object for the reference list '{@link tpcds.tpcdsModel.Store#getStoreSales <em>Store Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store Sales</em>'.
	 * @see tpcds.tpcdsModel.Store#getStoreSales()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_StoreSales();

	/**
	 * Returns the meta object for the reference list '{@link tpcds.tpcdsModel.Store#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store Returns</em>'.
	 * @see tpcds.tpcdsModel.Store#getStoreReturns()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_StoreReturns();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.StoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Returns</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns
	 * @generated
	 */
	EClass getStoreReturns();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Returned Date Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnedDateSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrReturnedDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnTimeSk <em>Sr Return Time Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Time Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnTimeSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnTimeSk();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreReturns#getSrId <em>Sr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Id</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrId()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrItemSk <em>Sr Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Item Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrItemSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrTicketNumber <em>Sr Ticket Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Ticket Number</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrTicketNumber()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrTicketNumber();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrCustomerSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrCdemoSk <em>Sr Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrCdemoSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrHdemoSk <em>Sr Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrHdemoSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrAddrSk <em>Sr Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrAddrSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrAddrSk();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Store Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrStoreSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrStoreSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReasonSk <em>Sr Reason Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Reason Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReasonSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReasonSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnQuantity <em>Sr Return Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Quantity</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnQuantity()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Amt</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnAmt()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnTax <em>Sr Return Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Tax</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnTax()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmtIncTax <em>Sr Return Amt Inc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Amt Inc Tax</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnAmtIncTax()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnAmtIncTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrFee <em>Sr Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Fee</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrFee()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrFee();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnShipCost <em>Sr Return Ship Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Ship Cost</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReturnShipCost()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnShipCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrRefundedCash <em>Sr Refunded Cash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Refunded Cash</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrRefundedCash()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrRefundedCash();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrReversedCharge <em>Sr Reversed Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Reversed Charge</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrReversedCharge()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReversedCharge();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrStoreCredit <em>Sr Store Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Store Credit</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrStoreCredit()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrStoreCredit();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturns#getSrNetLoss <em>Sr Net Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Net Loss</em>'.
	 * @see tpcds.tpcdsModel.StoreReturns#getSrNetLoss()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrNetLoss();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.StoreReturnsId <em>Store Returns Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Returns Id</em>'.
	 * @see tpcds.tpcdsModel.StoreReturnsId
	 * @generated
	 */
	EClass getStoreReturnsId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturnsId#getSrItemSk <em>Sr Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Item Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreReturnsId#getSrItemSk()
	 * @see #getStoreReturnsId()
	 * @generated
	 */
	EAttribute getStoreReturnsId_SrItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreReturnsId#getSrTicketNumber <em>Sr Ticket Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Ticket Number</em>'.
	 * @see tpcds.tpcdsModel.StoreReturnsId#getSrTicketNumber()
	 * @see #getStoreReturnsId()
	 * @generated
	 */
	EAttribute getStoreReturnsId_SrTicketNumber();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.StoreSales <em>Store Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Sales</em>'.
	 * @see tpcds.tpcdsModel.StoreSales
	 * @generated
	 */
	EClass getStoreSales();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreSales#getSsSoldDateSk <em>Ss Sold Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ss Sold Date Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsSoldDateSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EReference getStoreSales_SsSoldDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsSoldTimeSk <em>Ss Sold Time Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Sold Time Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsSoldTimeSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsSoldTimeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsItemSk <em>Ss Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Item Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsItemSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsItemSk();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreSales#getSsId <em>Ss Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ss Id</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsId()
	 * @see #getStoreSales()
	 * @generated
	 */
	EReference getStoreSales_SsId();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreSales#getSsCustomerSk <em>Ss Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ss Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsCustomerSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EReference getStoreSales_SsCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsTicketNumber <em>Ss Ticket Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ticket Number</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsTicketNumber()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsTicketNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsCdemoSk <em>Ss Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsCdemoSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsHdemoSk <em>Ss Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsHdemoSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsAddrSk <em>Ss Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsAddrSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsAddrSk();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreSales#getSsStoreSk <em>Ss Store Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ss Store Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsStoreSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EReference getStoreSales_SsStoreSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsPromoSk <em>Ss Promo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Promo Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsPromoSk()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsPromoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsQuantity <em>Ss Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Quantity</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsQuantity()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsWholesaleCost <em>Ss Wholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Wholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsWholesaleCost()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsListPrice <em>Ss List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss List Price</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsListPrice()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsListPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsSalesPrice <em>Ss Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Sales Price</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsSalesPrice()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsSalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsExtDiscountAmt <em>Ss Ext Discount Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ext Discount Amt</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsExtDiscountAmt()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsExtDiscountAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsExtSalesPrice <em>Ss Ext Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ext Sales Price</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsExtSalesPrice()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsExtSalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsExtWholesaleCost <em>Ss Ext Wholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ext Wholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsExtWholesaleCost()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsExtWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsExtListPrice <em>Ss Ext List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ext List Price</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsExtListPrice()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsExtListPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsExtTax <em>Ss Ext Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ext Tax</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsExtTax()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsExtTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsCouponAmt <em>Ss Coupon Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Coupon Amt</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsCouponAmt()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsCouponAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsNetPaid <em>Ss Net Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Net Paid</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsNetPaid()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsNetPaid();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsNetPaidIncTax <em>Ss Net Paid Inc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Net Paid Inc Tax</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsNetPaidIncTax()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsNetPaidIncTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSales#getSsNetProfit <em>Ss Net Profit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Net Profit</em>'.
	 * @see tpcds.tpcdsModel.StoreSales#getSsNetProfit()
	 * @see #getStoreSales()
	 * @generated
	 */
	EAttribute getStoreSales_SsNetProfit();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.StoreSalesId <em>Store Sales Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Sales Id</em>'.
	 * @see tpcds.tpcdsModel.StoreSalesId
	 * @generated
	 */
	EClass getStoreSalesId();

	/**
	 * Returns the meta object for the reference '{@link tpcds.tpcdsModel.StoreSalesId#getSsCustomerSk <em>Ss Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ss Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.StoreSalesId#getSsCustomerSk()
	 * @see #getStoreSalesId()
	 * @generated
	 */
	EReference getStoreSalesId_SsCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.StoreSalesId#getSsTicketNumber <em>Ss Ticket Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ss Ticket Number</em>'.
	 * @see tpcds.tpcdsModel.StoreSalesId#getSsTicketNumber()
	 * @see #getStoreSalesId()
	 * @generated
	 */
	EAttribute getStoreSalesId_SsTicketNumber();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.TimeDim <em>Time Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Dim</em>'.
	 * @see tpcds.tpcdsModel.TimeDim
	 * @generated
	 */
	EClass getTimeDim();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTTimeSk <em>TTime Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TTime Sk</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTTimeSk()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TTimeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTTimeId <em>TTime Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TTime Id</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTTimeId()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TTimeId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTTime <em>TTime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TTime</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTTime()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TTime();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTHour <em>THour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THour</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTHour()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_THour();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTMinute <em>TMinute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TMinute</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTMinute()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TMinute();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTSecond <em>TSecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TSecond</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTSecond()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TSecond();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTAmPm <em>TAm Pm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TAm Pm</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTAmPm()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TAmPm();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTShift <em>TShift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TShift</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTShift()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TShift();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTSubShift <em>TSub Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TSub Shift</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTSubShift()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TSubShift();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.TimeDim#getTMealTime <em>TMeal Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TMeal Time</em>'.
	 * @see tpcds.tpcdsModel.TimeDim#getTMealTime()
	 * @see #getTimeDim()
	 * @generated
	 */
	EAttribute getTimeDim_TMealTime();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.Warehouse <em>Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse</em>'.
	 * @see tpcds.tpcdsModel.Warehouse
	 * @generated
	 */
	EClass getWarehouse();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWWarehouseSk <em>WWarehouse Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WWarehouse Sk</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWWarehouseSk()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WWarehouseSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWWarehouseId <em>WWarehouse Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WWarehouse Id</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWWarehouseId()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WWarehouseId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWWarehouseName <em>WWarehouse Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WWarehouse Name</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWWarehouseName()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WWarehouseName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWWarehouseSqFt <em>WWarehouse Sq Ft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WWarehouse Sq Ft</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWWarehouseSqFt()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WWarehouseSqFt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWStreetNumber <em>WStreet Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WStreet Number</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWStreetNumber()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WStreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWStreetName <em>WStreet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WStreet Name</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWStreetName()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WStreetName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWStreetType <em>WStreet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WStreet Type</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWStreetType()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WStreetType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWSuiteNumber <em>WSuite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WSuite Number</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWSuiteNumber()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WSuiteNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWCity <em>WCity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCity</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWCity()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WCity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWCounty <em>WCounty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCounty</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWCounty()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WCounty();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWState <em>WState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WState</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWState()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WState();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWZip <em>WZip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WZip</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWZip()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WZip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWCountry <em>WCountry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCountry</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWCountry()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WCountry();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.Warehouse#getWGmtOffset <em>WGmt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WGmt Offset</em>'.
	 * @see tpcds.tpcdsModel.Warehouse#getWGmtOffset()
	 * @see #getWarehouse()
	 * @generated
	 */
	EAttribute getWarehouse_WGmtOffset();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see tpcds.tpcdsModel.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpWebPageSk <em>Wp Web Page Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Web Page Sk</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpWebPageSk()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpWebPageSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpWebPageId <em>Wp Web Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Web Page Id</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpWebPageId()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpWebPageId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpRecStartDate <em>Wp Rec Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Rec Start Date</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpRecStartDate()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpRecStartDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpRecEndDate <em>Wp Rec End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Rec End Date</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpRecEndDate()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpRecEndDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpCreationDateSk <em>Wp Creation Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Creation Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpCreationDateSk()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpCreationDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpAccessDateSk <em>Wp Access Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Access Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpAccessDateSk()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpAccessDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpAutogenFlag <em>Wp Autogen Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Autogen Flag</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpAutogenFlag()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpAutogenFlag();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpCustomerSk <em>Wp Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpCustomerSk()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpUrl <em>Wp Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Url</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpUrl()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpUrl();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpType <em>Wp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Type</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpType()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpCharCount <em>Wp Char Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Char Count</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpCharCount()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpCharCount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpLinkCount <em>Wp Link Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Link Count</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpLinkCount()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpLinkCount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpImageCount <em>Wp Image Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Image Count</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpImageCount()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpImageCount();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebPage#getWpMaxAdCount <em>Wp Max Ad Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp Max Ad Count</em>'.
	 * @see tpcds.tpcdsModel.WebPage#getWpMaxAdCount()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WpMaxAdCount();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.WebReturns <em>Web Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Returns</em>'.
	 * @see tpcds.tpcdsModel.WebReturns
	 * @generated
	 */
	EClass getWebReturns();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnedDateSk <em>Wr Returned Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Returned Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnedDateSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnedDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnedTimeSk <em>Wr Returned Time Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Returned Time Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnedTimeSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnedTimeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrItemSk <em>Wr Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Item Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrItemSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrRefundedCustomerSk <em>Wr Refunded Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Refunded Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrRefundedCustomerSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrRefundedCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrRefundedCdemoSk <em>Wr Refunded Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Refunded Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrRefundedCdemoSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrRefundedCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrRefundedHdemoSk <em>Wr Refunded Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Refunded Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrRefundedHdemoSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrRefundedHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrRefundedAddrSk <em>Wr Refunded Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Refunded Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrRefundedAddrSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrRefundedAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturningCustomerSk <em>Wr Returning Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Returning Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturningCustomerSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturningCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturningCdemoSk <em>Wr Returning Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Returning Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturningCdemoSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturningCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturningHdemoSk <em>Wr Returning Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Returning Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturningHdemoSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturningHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturningAddrSk <em>Wr Returning Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Returning Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturningAddrSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturningAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrWebPageSk <em>Wr Web Page Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Web Page Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrWebPageSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrWebPageSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReasonSk <em>Wr Reason Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Reason Sk</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReasonSk()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReasonSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrOrderNumber <em>Wr Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Order Number</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrOrderNumber()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrOrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnQuantity <em>Wr Return Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Return Quantity</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnQuantity()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnAmt <em>Wr Return Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Return Amt</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnAmt()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnTax <em>Wr Return Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Return Tax</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnTax()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnAmtIncTax <em>Wr Return Amt Inc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Return Amt Inc Tax</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnAmtIncTax()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnAmtIncTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrFee <em>Wr Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Fee</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrFee()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrFee();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReturnShipCost <em>Wr Return Ship Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Return Ship Cost</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReturnShipCost()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReturnShipCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrRefundedCash <em>Wr Refunded Cash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Refunded Cash</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrRefundedCash()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrRefundedCash();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrReversedCharge <em>Wr Reversed Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Reversed Charge</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrReversedCharge()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrReversedCharge();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrAccountCredit <em>Wr Account Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Account Credit</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrAccountCredit()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrAccountCredit();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebReturns#getWrNetLoss <em>Wr Net Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wr Net Loss</em>'.
	 * @see tpcds.tpcdsModel.WebReturns#getWrNetLoss()
	 * @see #getWebReturns()
	 * @generated
	 */
	EAttribute getWebReturns_WrNetLoss();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.WebSales <em>Web Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Sales</em>'.
	 * @see tpcds.tpcdsModel.WebSales
	 * @generated
	 */
	EClass getWebSales();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsSoldDateSk <em>Ws Sold Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Sold Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsSoldDateSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsSoldDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsSoldTimeSk <em>Ws Sold Time Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Sold Time Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsSoldTimeSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsSoldTimeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsShipDateSk <em>Ws Ship Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ship Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsShipDateSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsShipDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsItemSk <em>Ws Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Item Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsItemSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsBillCustomerSk <em>Ws Bill Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Bill Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsBillCustomerSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsBillCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsBillCdemoSk <em>Ws Bill Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Bill Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsBillCdemoSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsBillCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsBillHdemoSk <em>Ws Bill Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Bill Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsBillHdemoSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsBillHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsBillAddrSk <em>Ws Bill Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Bill Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsBillAddrSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsBillAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsShipCustomerSk <em>Ws Ship Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ship Customer Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsShipCustomerSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsShipCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsShipCdemoSk <em>Ws Ship Cdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ship Cdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsShipCdemoSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsShipCdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsShipHdemoSk <em>Ws Ship Hdemo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ship Hdemo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsShipHdemoSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsShipHdemoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsShipAddrSk <em>Ws Ship Addr Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ship Addr Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsShipAddrSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsShipAddrSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsWebPageSk <em>Ws Web Page Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Web Page Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsWebPageSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsWebPageSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsWebSiteSk <em>Ws Web Site Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Web Site Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsWebSiteSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsWebSiteSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsShipModeSk <em>Ws Ship Mode Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ship Mode Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsShipModeSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsShipModeSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsWarehouseSk <em>Ws Warehouse Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Warehouse Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsWarehouseSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsWarehouseSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsPromoSk <em>Ws Promo Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Promo Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsPromoSk()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsPromoSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsOrderNumber <em>Ws Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Order Number</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsOrderNumber()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsOrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsQuantity <em>Ws Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Quantity</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsQuantity()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsQuantity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsWholesaleCost <em>Ws Wholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Wholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsWholesaleCost()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsListPrice <em>Ws List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws List Price</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsListPrice()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsListPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsSalesPrice <em>Ws Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Sales Price</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsSalesPrice()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsSalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsExtDiscountAmt <em>Ws Ext Discount Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ext Discount Amt</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsExtDiscountAmt()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsExtDiscountAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsExtSalesPrice <em>Ws Ext Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ext Sales Price</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsExtSalesPrice()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsExtSalesPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsExtWholesaleCost <em>Ws Ext Wholesale Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ext Wholesale Cost</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsExtWholesaleCost()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsExtWholesaleCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsExtListPrice <em>Ws Ext List Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ext List Price</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsExtListPrice()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsExtListPrice();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsExtTax <em>Ws Ext Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ext Tax</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsExtTax()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsExtTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsCouponAmt <em>Ws Coupon Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Coupon Amt</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsCouponAmt()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsCouponAmt();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsExtShipCost <em>Ws Ext Ship Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Ext Ship Cost</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsExtShipCost()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsExtShipCost();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsNetPaid <em>Ws Net Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Net Paid</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsNetPaid()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsNetPaid();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncTax <em>Ws Net Paid Inc Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Net Paid Inc Tax</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsNetPaidIncTax()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsNetPaidIncTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncShip <em>Ws Net Paid Inc Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Net Paid Inc Ship</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsNetPaidIncShip()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsNetPaidIncShip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncShipTax <em>Ws Net Paid Inc Ship Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Net Paid Inc Ship Tax</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsNetPaidIncShipTax()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsNetPaidIncShipTax();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSales#getWsNetProfit <em>Ws Net Profit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws Net Profit</em>'.
	 * @see tpcds.tpcdsModel.WebSales#getWsNetProfit()
	 * @see #getWebSales()
	 * @generated
	 */
	EAttribute getWebSales_WsNetProfit();

	/**
	 * Returns the meta object for class '{@link tpcds.tpcdsModel.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see tpcds.tpcdsModel.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebSiteSk <em>Web Site Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Site Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebSiteSk()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebSiteSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Site Id</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebSiteId()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebSiteId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebRecStartDate <em>Web Rec Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Rec Start Date</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebRecStartDate()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebRecStartDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebRecEndDate <em>Web Rec End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Rec End Date</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebRecEndDate()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebRecEndDate();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebName <em>Web Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Name</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebOpenDateSk <em>Web Open Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Open Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebOpenDateSk()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebOpenDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebCloseDateSk <em>Web Close Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Close Date Sk</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebCloseDateSk()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebCloseDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebClass <em>Web Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Class</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebClass()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebClass();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebManager <em>Web Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Manager</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebManager()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebManager();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebMktId <em>Web Mkt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Mkt Id</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebMktId()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebMktId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebMktClass <em>Web Mkt Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Mkt Class</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebMktClass()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebMktClass();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebMktDesc <em>Web Mkt Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Mkt Desc</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebMktDesc()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebMktDesc();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebMarketManager <em>Web Market Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Market Manager</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebMarketManager()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebMarketManager();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebCompanyId <em>Web Company Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Company Id</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebCompanyId()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebCompanyId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebCompanyName <em>Web Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Company Name</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebCompanyName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebCompanyName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebStreetNumber <em>Web Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Street Number</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebStreetNumber()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebStreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebStreetName <em>Web Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Street Name</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebStreetName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebStreetName();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebStreetType <em>Web Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Street Type</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebStreetType()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebStreetType();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebSuiteNumber <em>Web Suite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Suite Number</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebSuiteNumber()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebSuiteNumber();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebCity <em>Web City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web City</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebCity()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebCity();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebCounty <em>Web County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web County</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebCounty()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebCounty();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebState <em>Web State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web State</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebState()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebState();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebZip <em>Web Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Zip</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebZip()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebZip();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebCountry <em>Web Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Country</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebCountry()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebCountry();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebGmtOffset <em>Web Gmt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Gmt Offset</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebGmtOffset()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebGmtOffset();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.tpcdsModel.WebSite#getWebTaxPercentage <em>Web Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Tax Percentage</em>'.
	 * @see tpcds.tpcdsModel.WebSite#getWebTaxPercentage()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebTaxPercentage();

	/**
	 * Returns the meta object for data type '{@link java.sql.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.sql.Date
	 * @model instanceClass="java.sql.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.sql.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time</em>'.
	 * @see java.sql.Time
	 * @model instanceClass="java.sql.Time"
	 * @generated
	 */
	EDataType getTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TpcdsModelFactory getTpcdsModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CallCenterImpl <em>Call Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CallCenterImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCallCenter()
		 * @generated
		 */
		EClass CALL_CENTER = eINSTANCE.getCallCenter();

		/**
		 * The meta object literal for the '<em><b>Cc Call Center Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_CALL_CENTER_SK = eINSTANCE.getCallCenter_CcCallCenterSk();

		/**
		 * The meta object literal for the '<em><b>Cc Call Center Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_CALL_CENTER_ID = eINSTANCE.getCallCenter_CcCallCenterId();

		/**
		 * The meta object literal for the '<em><b>Cc Rec Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_REC_START_DATE = eINSTANCE.getCallCenter_CcRecStartDate();

		/**
		 * The meta object literal for the '<em><b>Cc Rec End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_REC_END_DATE = eINSTANCE.getCallCenter_CcRecEndDate();

		/**
		 * The meta object literal for the '<em><b>Cc Closed Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_CLOSED_DATE_SK = eINSTANCE.getCallCenter_CcClosedDateSk();

		/**
		 * The meta object literal for the '<em><b>Cc Open Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_OPEN_DATE_SK = eINSTANCE.getCallCenter_CcOpenDateSk();

		/**
		 * The meta object literal for the '<em><b>Cc Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_NAME = eINSTANCE.getCallCenter_CcName();

		/**
		 * The meta object literal for the '<em><b>Cc Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_CLASS = eINSTANCE.getCallCenter_CcClass();

		/**
		 * The meta object literal for the '<em><b>Cc Employees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_EMPLOYEES = eINSTANCE.getCallCenter_CcEmployees();

		/**
		 * The meta object literal for the '<em><b>Cc Sq Ft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_SQ_FT = eINSTANCE.getCallCenter_CcSqFt();

		/**
		 * The meta object literal for the '<em><b>Cc Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_HOURS = eINSTANCE.getCallCenter_CcHours();

		/**
		 * The meta object literal for the '<em><b>Cc Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_MANAGER = eINSTANCE.getCallCenter_CcManager();

		/**
		 * The meta object literal for the '<em><b>Cc Mkt Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_MKT_ID = eINSTANCE.getCallCenter_CcMktId();

		/**
		 * The meta object literal for the '<em><b>Cc Mkt Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_MKT_CLASS = eINSTANCE.getCallCenter_CcMktClass();

		/**
		 * The meta object literal for the '<em><b>Cc Mkt Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_MKT_DESC = eINSTANCE.getCallCenter_CcMktDesc();

		/**
		 * The meta object literal for the '<em><b>Cc Market Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_MARKET_MANAGER = eINSTANCE.getCallCenter_CcMarketManager();

		/**
		 * The meta object literal for the '<em><b>Cc Division</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_DIVISION = eINSTANCE.getCallCenter_CcDivision();

		/**
		 * The meta object literal for the '<em><b>Cc Division Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_DIVISION_NAME = eINSTANCE.getCallCenter_CcDivisionName();

		/**
		 * The meta object literal for the '<em><b>Cc Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_COMPANY = eINSTANCE.getCallCenter_CcCompany();

		/**
		 * The meta object literal for the '<em><b>Cc Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_COMPANY_NAME = eINSTANCE.getCallCenter_CcCompanyName();

		/**
		 * The meta object literal for the '<em><b>Cc Street Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_STREET_NUMBER = eINSTANCE.getCallCenter_CcStreetNumber();

		/**
		 * The meta object literal for the '<em><b>Cc Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_STREET_NAME = eINSTANCE.getCallCenter_CcStreetName();

		/**
		 * The meta object literal for the '<em><b>Cc Street Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_STREET_TYPE = eINSTANCE.getCallCenter_CcStreetType();

		/**
		 * The meta object literal for the '<em><b>Cc Suite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_SUITE_NUMBER = eINSTANCE.getCallCenter_CcSuiteNumber();

		/**
		 * The meta object literal for the '<em><b>Cc City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_CITY = eINSTANCE.getCallCenter_CcCity();

		/**
		 * The meta object literal for the '<em><b>Cc County</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_COUNTY = eINSTANCE.getCallCenter_CcCounty();

		/**
		 * The meta object literal for the '<em><b>Cc State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_STATE = eINSTANCE.getCallCenter_CcState();

		/**
		 * The meta object literal for the '<em><b>Cc Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_ZIP = eINSTANCE.getCallCenter_CcZip();

		/**
		 * The meta object literal for the '<em><b>Cc Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_COUNTRY = eINSTANCE.getCallCenter_CcCountry();

		/**
		 * The meta object literal for the '<em><b>Cc Gmt Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_GMT_OFFSET = eINSTANCE.getCallCenter_CcGmtOffset();

		/**
		 * The meta object literal for the '<em><b>Cc Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CENTER__CC_TAX_PERCENTAGE = eINSTANCE.getCallCenter_CcTaxPercentage();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CatalogPageImpl <em>Catalog Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CatalogPageImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCatalogPage()
		 * @generated
		 */
		EClass CATALOG_PAGE = eINSTANCE.getCatalogPage();

		/**
		 * The meta object literal for the '<em><b>Cp Catalog Page Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_CATALOG_PAGE_SK = eINSTANCE.getCatalogPage_CpCatalogPageSk();

		/**
		 * The meta object literal for the '<em><b>Cp Catalog Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_CATALOG_PAGE_ID = eINSTANCE.getCatalogPage_CpCatalogPageId();

		/**
		 * The meta object literal for the '<em><b>Cp Start Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_START_DATE_SK = eINSTANCE.getCatalogPage_CpStartDateSk();

		/**
		 * The meta object literal for the '<em><b>Cp End Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_END_DATE_SK = eINSTANCE.getCatalogPage_CpEndDateSk();

		/**
		 * The meta object literal for the '<em><b>Cp Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_DEPARTMENT = eINSTANCE.getCatalogPage_CpDepartment();

		/**
		 * The meta object literal for the '<em><b>Cp Catalog Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_CATALOG_NUMBER = eINSTANCE.getCatalogPage_CpCatalogNumber();

		/**
		 * The meta object literal for the '<em><b>Cp Catalog Page Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER = eINSTANCE.getCatalogPage_CpCatalogPageNumber();

		/**
		 * The meta object literal for the '<em><b>Cp Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_DESCRIPTION = eINSTANCE.getCatalogPage_CpDescription();

		/**
		 * The meta object literal for the '<em><b>Cp Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_PAGE__CP_TYPE = eINSTANCE.getCatalogPage_CpType();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl <em>Catalog Returns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CatalogReturnsImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCatalogReturns()
		 * @generated
		 */
		EClass CATALOG_RETURNS = eINSTANCE.getCatalogReturns();

		/**
		 * The meta object literal for the '<em><b>Cr Returned Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURNED_DATE_SK = eINSTANCE.getCatalogReturns_CrReturnedDateSk();

		/**
		 * The meta object literal for the '<em><b>Cr Returned Time Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURNED_TIME_SK = eINSTANCE.getCatalogReturns_CrReturnedTimeSk();

		/**
		 * The meta object literal for the '<em><b>Cr Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_ITEM_SK = eINSTANCE.getCatalogReturns_CrItemSk();

		/**
		 * The meta object literal for the '<em><b>Cr Refunded Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK = eINSTANCE.getCatalogReturns_CrRefundedCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Cr Refunded Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK = eINSTANCE.getCatalogReturns_CrRefundedCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cr Refunded Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK = eINSTANCE.getCatalogReturns_CrRefundedHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cr Refunded Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REFUNDED_ADDR_SK = eINSTANCE.getCatalogReturns_CrRefundedAddrSk();

		/**
		 * The meta object literal for the '<em><b>Cr Returning Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK = eINSTANCE.getCatalogReturns_CrReturningCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Cr Returning Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURNING_CDEMO_SK = eINSTANCE.getCatalogReturns_CrReturningCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cr Returning Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURNING_HDEMO_SK = eINSTANCE.getCatalogReturns_CrReturningHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cr Returning Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURNING_ADDR_SK = eINSTANCE.getCatalogReturns_CrReturningAddrSk();

		/**
		 * The meta object literal for the '<em><b>Cr Call Center Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_CALL_CENTER_SK = eINSTANCE.getCatalogReturns_CrCallCenterSk();

		/**
		 * The meta object literal for the '<em><b>Cr Catalog Page Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_CATALOG_PAGE_SK = eINSTANCE.getCatalogReturns_CrCatalogPageSk();

		/**
		 * The meta object literal for the '<em><b>Cr Ship Mode Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_SHIP_MODE_SK = eINSTANCE.getCatalogReturns_CrShipModeSk();

		/**
		 * The meta object literal for the '<em><b>Cr Warehouse Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_WAREHOUSE_SK = eINSTANCE.getCatalogReturns_CrWarehouseSk();

		/**
		 * The meta object literal for the '<em><b>Cr Reason Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REASON_SK = eINSTANCE.getCatalogReturns_CrReasonSk();

		/**
		 * The meta object literal for the '<em><b>Cr Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_ORDER_NUMBER = eINSTANCE.getCatalogReturns_CrOrderNumber();

		/**
		 * The meta object literal for the '<em><b>Cr Return Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURN_QUANTITY = eINSTANCE.getCatalogReturns_CrReturnQuantity();

		/**
		 * The meta object literal for the '<em><b>Cr Return Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURN_AMOUNT = eINSTANCE.getCatalogReturns_CrReturnAmount();

		/**
		 * The meta object literal for the '<em><b>Cr Return Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURN_TAX = eINSTANCE.getCatalogReturns_CrReturnTax();

		/**
		 * The meta object literal for the '<em><b>Cr Return Amt Inc Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX = eINSTANCE.getCatalogReturns_CrReturnAmtIncTax();

		/**
		 * The meta object literal for the '<em><b>Cr Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_FEE = eINSTANCE.getCatalogReturns_CrFee();

		/**
		 * The meta object literal for the '<em><b>Cr Return Ship Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_RETURN_SHIP_COST = eINSTANCE.getCatalogReturns_CrReturnShipCost();

		/**
		 * The meta object literal for the '<em><b>Cr Refunded Cash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REFUNDED_CASH = eINSTANCE.getCatalogReturns_CrRefundedCash();

		/**
		 * The meta object literal for the '<em><b>Cr Reversed Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_REVERSED_CHARGE = eINSTANCE.getCatalogReturns_CrReversedCharge();

		/**
		 * The meta object literal for the '<em><b>Cr Store Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_STORE_CREDIT = eINSTANCE.getCatalogReturns_CrStoreCredit();

		/**
		 * The meta object literal for the '<em><b>Cr Net Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_RETURNS__CR_NET_LOSS = eINSTANCE.getCatalogReturns_CrNetLoss();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CatalogSalesImpl <em>Catalog Sales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CatalogSalesImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCatalogSales()
		 * @generated
		 */
		EClass CATALOG_SALES = eINSTANCE.getCatalogSales();

		/**
		 * The meta object literal for the '<em><b>Cs Sold Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SOLD_DATE_SK = eINSTANCE.getCatalogSales_CsSoldDateSk();

		/**
		 * The meta object literal for the '<em><b>Cs Sold Time Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SOLD_TIME_SK = eINSTANCE.getCatalogSales_CsSoldTimeSk();

		/**
		 * The meta object literal for the '<em><b>Cs Ship Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SHIP_DATE_SK = eINSTANCE.getCatalogSales_CsShipDateSk();

		/**
		 * The meta object literal for the '<em><b>Cs Bill Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_BILL_CUSTOMER_SK = eINSTANCE.getCatalogSales_CsBillCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Cs Bill Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_BILL_CDEMO_SK = eINSTANCE.getCatalogSales_CsBillCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cs Bill Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_BILL_HDEMO_SK = eINSTANCE.getCatalogSales_CsBillHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cs Bill Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_BILL_ADDR_SK = eINSTANCE.getCatalogSales_CsBillAddrSk();

		/**
		 * The meta object literal for the '<em><b>Cs Ship Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SHIP_CUSTOMER_SK = eINSTANCE.getCatalogSales_CsShipCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Cs Ship Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SHIP_CDEMO_SK = eINSTANCE.getCatalogSales_CsShipCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cs Ship Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SHIP_HDEMO_SK = eINSTANCE.getCatalogSales_CsShipHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Cs Ship Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SHIP_ADDR_SK = eINSTANCE.getCatalogSales_CsShipAddrSk();

		/**
		 * The meta object literal for the '<em><b>Cs Call Center Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_CALL_CENTER_SK = eINSTANCE.getCatalogSales_CsCallCenterSk();

		/**
		 * The meta object literal for the '<em><b>Cs Catalog Page Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_CATALOG_PAGE_SK = eINSTANCE.getCatalogSales_CsCatalogPageSk();

		/**
		 * The meta object literal for the '<em><b>Cs Ship Mode Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SHIP_MODE_SK = eINSTANCE.getCatalogSales_CsShipModeSk();

		/**
		 * The meta object literal for the '<em><b>Cs Warehouse Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_WAREHOUSE_SK = eINSTANCE.getCatalogSales_CsWarehouseSk();

		/**
		 * The meta object literal for the '<em><b>Cs Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_ITEM_SK = eINSTANCE.getCatalogSales_CsItemSk();

		/**
		 * The meta object literal for the '<em><b>Cs Promo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_PROMO_SK = eINSTANCE.getCatalogSales_CsPromoSk();

		/**
		 * The meta object literal for the '<em><b>Cs Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_ORDER_NUMBER = eINSTANCE.getCatalogSales_CsOrderNumber();

		/**
		 * The meta object literal for the '<em><b>Cs Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_QUANTITY = eINSTANCE.getCatalogSales_CsQuantity();

		/**
		 * The meta object literal for the '<em><b>Cs Wholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_WHOLESALE_COST = eINSTANCE.getCatalogSales_CsWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>Cs List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_LIST_PRICE = eINSTANCE.getCatalogSales_CsListPrice();

		/**
		 * The meta object literal for the '<em><b>Cs Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_SALES_PRICE = eINSTANCE.getCatalogSales_CsSalesPrice();

		/**
		 * The meta object literal for the '<em><b>Cs Ext Discount Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_EXT_DISCOUNT_AMT = eINSTANCE.getCatalogSales_CsExtDiscountAmt();

		/**
		 * The meta object literal for the '<em><b>Cs Ext Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_EXT_SALES_PRICE = eINSTANCE.getCatalogSales_CsExtSalesPrice();

		/**
		 * The meta object literal for the '<em><b>Cs Ext Wholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_EXT_WHOLESALE_COST = eINSTANCE.getCatalogSales_CsExtWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>Cs Ext List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_EXT_LIST_PRICE = eINSTANCE.getCatalogSales_CsExtListPrice();

		/**
		 * The meta object literal for the '<em><b>Cs Ext Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_EXT_TAX = eINSTANCE.getCatalogSales_CsExtTax();

		/**
		 * The meta object literal for the '<em><b>Cs Coupon Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_COUPON_AMT = eINSTANCE.getCatalogSales_CsCouponAmt();

		/**
		 * The meta object literal for the '<em><b>Cs Ext Ship Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_EXT_SHIP_COST = eINSTANCE.getCatalogSales_CsExtShipCost();

		/**
		 * The meta object literal for the '<em><b>Cs Net Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_NET_PAID = eINSTANCE.getCatalogSales_CsNetPaid();

		/**
		 * The meta object literal for the '<em><b>Cs Net Paid Inc Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_NET_PAID_INC_TAX = eINSTANCE.getCatalogSales_CsNetPaidIncTax();

		/**
		 * The meta object literal for the '<em><b>Cs Net Paid Inc Ship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_NET_PAID_INC_SHIP = eINSTANCE.getCatalogSales_CsNetPaidIncShip();

		/**
		 * The meta object literal for the '<em><b>Cs Net Paid Inc Ship Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX = eINSTANCE.getCatalogSales_CsNetPaidIncShipTax();

		/**
		 * The meta object literal for the '<em><b>Cs Net Profit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_SALES__CS_NET_PROFIT = eINSTANCE.getCatalogSales_CsNetProfit();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CustomerImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>CCustomer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CCUSTOMER_SK = eINSTANCE.getCustomer_CCustomerSk();

		/**
		 * The meta object literal for the '<em><b>CCustomer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CCUSTOMER_ID = eINSTANCE.getCustomer_CCustomerId();

		/**
		 * The meta object literal for the '<em><b>CCurrent Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CCURRENT_CDEMO_SK = eINSTANCE.getCustomer_CCurrentCdemoSk();

		/**
		 * The meta object literal for the '<em><b>CCurrent Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CCURRENT_HDEMO_SK = eINSTANCE.getCustomer_CCurrentHdemoSk();

		/**
		 * The meta object literal for the '<em><b>CCurrent Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CCURRENT_ADDR_SK = eINSTANCE.getCustomer_CCurrentAddrSk();

		/**
		 * The meta object literal for the '<em><b>CFirst Shipto Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CFIRST_SHIPTO_DATE_SK = eINSTANCE.getCustomer_CFirstShiptoDateSk();

		/**
		 * The meta object literal for the '<em><b>CFirst Sales Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CFIRST_SALES_DATE_SK = eINSTANCE.getCustomer_CFirstSalesDateSk();

		/**
		 * The meta object literal for the '<em><b>CSalutation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CSALUTATION = eINSTANCE.getCustomer_CSalutation();

		/**
		 * The meta object literal for the '<em><b>CFirst Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CFIRST_NAME = eINSTANCE.getCustomer_CFirstName();

		/**
		 * The meta object literal for the '<em><b>CLast Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CLAST_NAME = eINSTANCE.getCustomer_CLastName();

		/**
		 * The meta object literal for the '<em><b>CPreferred Cust Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CPREFERRED_CUST_FLAG = eINSTANCE.getCustomer_CPreferredCustFlag();

		/**
		 * The meta object literal for the '<em><b>CBirth Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CBIRTH_DAY = eINSTANCE.getCustomer_CBirthDay();

		/**
		 * The meta object literal for the '<em><b>CBirth Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CBIRTH_MONTH = eINSTANCE.getCustomer_CBirthMonth();

		/**
		 * The meta object literal for the '<em><b>CBirth Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CBIRTH_YEAR = eINSTANCE.getCustomer_CBirthYear();

		/**
		 * The meta object literal for the '<em><b>CBirth Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CBIRTH_COUNTRY = eINSTANCE.getCustomer_CBirthCountry();

		/**
		 * The meta object literal for the '<em><b>CLogin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CLOGIN = eINSTANCE.getCustomer_CLogin();

		/**
		 * The meta object literal for the '<em><b>CEmail Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CEMAIL_ADDRESS = eINSTANCE.getCustomer_CEmailAddress();

		/**
		 * The meta object literal for the '<em><b>CLast Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CLAST_REVIEW_DATE = eINSTANCE.getCustomer_CLastReviewDate();

		/**
		 * The meta object literal for the '<em><b>Store Returns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__STORE_RETURNS = eINSTANCE.getCustomer_StoreReturns();

		/**
		 * The meta object literal for the '<em><b>Store Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__STORE_SALES = eINSTANCE.getCustomer_StoreSales();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CustomerAddressImpl <em>Customer Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CustomerAddressImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCustomerAddress()
		 * @generated
		 */
		EClass CUSTOMER_ADDRESS = eINSTANCE.getCustomerAddress();

		/**
		 * The meta object literal for the '<em><b>Ca Address Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_ADDRESS_SK = eINSTANCE.getCustomerAddress_CaAddressSk();

		/**
		 * The meta object literal for the '<em><b>Ca Address Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_ADDRESS_ID = eINSTANCE.getCustomerAddress_CaAddressId();

		/**
		 * The meta object literal for the '<em><b>Ca Street Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_STREET_NUMBER = eINSTANCE.getCustomerAddress_CaStreetNumber();

		/**
		 * The meta object literal for the '<em><b>Ca Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_STREET_NAME = eINSTANCE.getCustomerAddress_CaStreetName();

		/**
		 * The meta object literal for the '<em><b>Ca Street Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_STREET_TYPE = eINSTANCE.getCustomerAddress_CaStreetType();

		/**
		 * The meta object literal for the '<em><b>Ca Suite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_SUITE_NUMBER = eINSTANCE.getCustomerAddress_CaSuiteNumber();

		/**
		 * The meta object literal for the '<em><b>Ca City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_CITY = eINSTANCE.getCustomerAddress_CaCity();

		/**
		 * The meta object literal for the '<em><b>Ca County</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_COUNTY = eINSTANCE.getCustomerAddress_CaCounty();

		/**
		 * The meta object literal for the '<em><b>Ca State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_STATE = eINSTANCE.getCustomerAddress_CaState();

		/**
		 * The meta object literal for the '<em><b>Ca Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_ZIP = eINSTANCE.getCustomerAddress_CaZip();

		/**
		 * The meta object literal for the '<em><b>Ca Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_COUNTRY = eINSTANCE.getCustomerAddress_CaCountry();

		/**
		 * The meta object literal for the '<em><b>Ca Gmt Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_GMT_OFFSET = eINSTANCE.getCustomerAddress_CaGmtOffset();

		/**
		 * The meta object literal for the '<em><b>Ca Location Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_ADDRESS__CA_LOCATION_TYPE = eINSTANCE.getCustomerAddress_CaLocationType();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl <em>Customer Demographics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.CustomerDemographicsImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getCustomerDemographics()
		 * @generated
		 */
		EClass CUSTOMER_DEMOGRAPHICS = eINSTANCE.getCustomerDemographics();

		/**
		 * The meta object literal for the '<em><b>Cd Demo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK = eINSTANCE.getCustomerDemographics_CdDemoSk();

		/**
		 * The meta object literal for the '<em><b>Cd Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_GENDER = eINSTANCE.getCustomerDemographics_CdGender();

		/**
		 * The meta object literal for the '<em><b>Cd Marital Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS = eINSTANCE.getCustomerDemographics_CdMaritalStatus();

		/**
		 * The meta object literal for the '<em><b>Cd Education Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS = eINSTANCE.getCustomerDemographics_CdEducationStatus();

		/**
		 * The meta object literal for the '<em><b>Cd Purchase Estimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE = eINSTANCE.getCustomerDemographics_CdPurchaseEstimate();

		/**
		 * The meta object literal for the '<em><b>Cd Credit Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING = eINSTANCE.getCustomerDemographics_CdCreditRating();

		/**
		 * The meta object literal for the '<em><b>Cd Dep Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT = eINSTANCE.getCustomerDemographics_CdDepCount();

		/**
		 * The meta object literal for the '<em><b>Cd Dep Employed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT = eINSTANCE.getCustomerDemographics_CdDepEmployedCount();

		/**
		 * The meta object literal for the '<em><b>Cd Dep College Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT = eINSTANCE.getCustomerDemographics_CdDepCollegeCount();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.DateDimImpl <em>Date Dim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.DateDimImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getDateDim()
		 * @generated
		 */
		EClass DATE_DIM = eINSTANCE.getDateDim();

		/**
		 * The meta object literal for the '<em><b>DDate Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DDATE_SK = eINSTANCE.getDateDim_DDateSk();

		/**
		 * The meta object literal for the '<em><b>DDate Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DDATE_ID = eINSTANCE.getDateDim_DDateId();

		/**
		 * The meta object literal for the '<em><b>DDate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DDATE = eINSTANCE.getDateDim_DDate();

		/**
		 * The meta object literal for the '<em><b>DMonth Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DMONTH_SEQ = eINSTANCE.getDateDim_DMonthSeq();

		/**
		 * The meta object literal for the '<em><b>DWeek Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DWEEK_SEQ = eINSTANCE.getDateDim_DWeekSeq();

		/**
		 * The meta object literal for the '<em><b>DQuarter Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DQUARTER_SEQ = eINSTANCE.getDateDim_DQuarterSeq();

		/**
		 * The meta object literal for the '<em><b>DYear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DYEAR = eINSTANCE.getDateDim_DYear();

		/**
		 * The meta object literal for the '<em><b>DDow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DDOW = eINSTANCE.getDateDim_DDow();

		/**
		 * The meta object literal for the '<em><b>DMoy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DMOY = eINSTANCE.getDateDim_DMoy();

		/**
		 * The meta object literal for the '<em><b>DDom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DDOM = eINSTANCE.getDateDim_DDom();

		/**
		 * The meta object literal for the '<em><b>DQoy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DQOY = eINSTANCE.getDateDim_DQoy();

		/**
		 * The meta object literal for the '<em><b>DFy Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DFY_YEAR = eINSTANCE.getDateDim_DFyYear();

		/**
		 * The meta object literal for the '<em><b>DFy Quarter Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DFY_QUARTER_SEQ = eINSTANCE.getDateDim_DFyQuarterSeq();

		/**
		 * The meta object literal for the '<em><b>DFy Week Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DFY_WEEK_SEQ = eINSTANCE.getDateDim_DFyWeekSeq();

		/**
		 * The meta object literal for the '<em><b>DDay Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DDAY_NAME = eINSTANCE.getDateDim_DDayName();

		/**
		 * The meta object literal for the '<em><b>DQuarter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DQUARTER_NAME = eINSTANCE.getDateDim_DQuarterName();

		/**
		 * The meta object literal for the '<em><b>DHoliday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DHOLIDAY = eINSTANCE.getDateDim_DHoliday();

		/**
		 * The meta object literal for the '<em><b>DWeekend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DWEEKEND = eINSTANCE.getDateDim_DWeekend();

		/**
		 * The meta object literal for the '<em><b>DFollowing Holiday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DFOLLOWING_HOLIDAY = eINSTANCE.getDateDim_DFollowingHoliday();

		/**
		 * The meta object literal for the '<em><b>DFirst Dom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DFIRST_DOM = eINSTANCE.getDateDim_DFirstDom();

		/**
		 * The meta object literal for the '<em><b>DLast Dom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DLAST_DOM = eINSTANCE.getDateDim_DLastDom();

		/**
		 * The meta object literal for the '<em><b>DSame Day Ly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DSAME_DAY_LY = eINSTANCE.getDateDim_DSameDayLy();

		/**
		 * The meta object literal for the '<em><b>DSame Day Lq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DSAME_DAY_LQ = eINSTANCE.getDateDim_DSameDayLq();

		/**
		 * The meta object literal for the '<em><b>DCurrent Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DCURRENT_DAY = eINSTANCE.getDateDim_DCurrentDay();

		/**
		 * The meta object literal for the '<em><b>DCurrent Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DCURRENT_WEEK = eINSTANCE.getDateDim_DCurrentWeek();

		/**
		 * The meta object literal for the '<em><b>DCurrent Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DCURRENT_MONTH = eINSTANCE.getDateDim_DCurrentMonth();

		/**
		 * The meta object literal for the '<em><b>DCurrent Quarter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DCURRENT_QUARTER = eINSTANCE.getDateDim_DCurrentQuarter();

		/**
		 * The meta object literal for the '<em><b>DCurrent Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DCURRENT_YEAR = eINSTANCE.getDateDim_DCurrentYear();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.DbgenVersionImpl <em>Dbgen Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.DbgenVersionImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getDbgenVersion()
		 * @generated
		 */
		EClass DBGEN_VERSION = eINSTANCE.getDbgenVersion();

		/**
		 * The meta object literal for the '<em><b>Dv Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBGEN_VERSION__DV_VERSION = eINSTANCE.getDbgenVersion_DvVersion();

		/**
		 * The meta object literal for the '<em><b>Dv Create Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBGEN_VERSION__DV_CREATE_DATE = eINSTANCE.getDbgenVersion_DvCreateDate();

		/**
		 * The meta object literal for the '<em><b>Dv Create Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBGEN_VERSION__DV_CREATE_TIME = eINSTANCE.getDbgenVersion_DvCreateTime();

		/**
		 * The meta object literal for the '<em><b>Dv Cmdline Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBGEN_VERSION__DV_CMDLINE_ARGS = eINSTANCE.getDbgenVersion_DvCmdlineArgs();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl <em>Household Demographics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.HouseholdDemographicsImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getHouseholdDemographics()
		 * @generated
		 */
		EClass HOUSEHOLD_DEMOGRAPHICS = eINSTANCE.getHouseholdDemographics();

		/**
		 * The meta object literal for the '<em><b>Hd Demo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK = eINSTANCE.getHouseholdDemographics_HdDemoSk();

		/**
		 * The meta object literal for the '<em><b>Hd Income Band Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK = eINSTANCE.getHouseholdDemographics_HdIncomeBandSk();

		/**
		 * The meta object literal for the '<em><b>Hd Buy Potential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL = eINSTANCE.getHouseholdDemographics_HdBuyPotential();

		/**
		 * The meta object literal for the '<em><b>Hd Dep Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT = eINSTANCE.getHouseholdDemographics_HdDepCount();

		/**
		 * The meta object literal for the '<em><b>Hd Vehicle Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT = eINSTANCE.getHouseholdDemographics_HdVehicleCount();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.IncomeBandImpl <em>Income Band</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.IncomeBandImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getIncomeBand()
		 * @generated
		 */
		EClass INCOME_BAND = eINSTANCE.getIncomeBand();

		/**
		 * The meta object literal for the '<em><b>Ib Income Band Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_BAND__IB_INCOME_BAND_SK = eINSTANCE.getIncomeBand_IbIncomeBandSk();

		/**
		 * The meta object literal for the '<em><b>Ib Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_BAND__IB_LOWER_BOUND = eINSTANCE.getIncomeBand_IbLowerBound();

		/**
		 * The meta object literal for the '<em><b>Ib Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_BAND__IB_UPPER_BOUND = eINSTANCE.getIncomeBand_IbUpperBound();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.InventoryImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Inv Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__INV_DATE_SK = eINSTANCE.getInventory_InvDateSk();

		/**
		 * The meta object literal for the '<em><b>Inv Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__INV_ITEM_SK = eINSTANCE.getInventory_InvItemSk();

		/**
		 * The meta object literal for the '<em><b>Inv Warehouse Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__INV_WAREHOUSE_SK = eINSTANCE.getInventory_InvWarehouseSk();

		/**
		 * The meta object literal for the '<em><b>Inv Quantity On Hand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__INV_QUANTITY_ON_HAND = eINSTANCE.getInventory_InvQuantityOnHand();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.ItemImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>IItem Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IITEM_SK = eINSTANCE.getItem_IItemSk();

		/**
		 * The meta object literal for the '<em><b>IItem Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IITEM_ID = eINSTANCE.getItem_IItemId();

		/**
		 * The meta object literal for the '<em><b>IRec Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IREC_START_DATE = eINSTANCE.getItem_IRecStartDate();

		/**
		 * The meta object literal for the '<em><b>IRec End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IREC_END_DATE = eINSTANCE.getItem_IRecEndDate();

		/**
		 * The meta object literal for the '<em><b>IItem Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IITEM_DESC = eINSTANCE.getItem_IItemDesc();

		/**
		 * The meta object literal for the '<em><b>ICurrent Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICURRENT_PRICE = eINSTANCE.getItem_ICurrentPrice();

		/**
		 * The meta object literal for the '<em><b>IWholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IWHOLESALE_COST = eINSTANCE.getItem_IWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>IBrand Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IBRAND_ID = eINSTANCE.getItem_IBrandId();

		/**
		 * The meta object literal for the '<em><b>IBrand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IBRAND = eINSTANCE.getItem_IBrand();

		/**
		 * The meta object literal for the '<em><b>IClass Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICLASS_ID = eINSTANCE.getItem_IClassId();

		/**
		 * The meta object literal for the '<em><b>IClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICLASS = eINSTANCE.getItem_IClass();

		/**
		 * The meta object literal for the '<em><b>ICategory Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICATEGORY_ID = eINSTANCE.getItem_ICategoryId();

		/**
		 * The meta object literal for the '<em><b>ICategory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICATEGORY = eINSTANCE.getItem_ICategory();

		/**
		 * The meta object literal for the '<em><b>IManufact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IMANUFACT_ID = eINSTANCE.getItem_IManufactId();

		/**
		 * The meta object literal for the '<em><b>IManufact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IMANUFACT = eINSTANCE.getItem_IManufact();

		/**
		 * The meta object literal for the '<em><b>ISize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ISIZE = eINSTANCE.getItem_ISize();

		/**
		 * The meta object literal for the '<em><b>IFormulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IFORMULATION = eINSTANCE.getItem_IFormulation();

		/**
		 * The meta object literal for the '<em><b>IColor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICOLOR = eINSTANCE.getItem_IColor();

		/**
		 * The meta object literal for the '<em><b>IUnits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IUNITS = eINSTANCE.getItem_IUnits();

		/**
		 * The meta object literal for the '<em><b>IContainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICONTAINER = eINSTANCE.getItem_IContainer();

		/**
		 * The meta object literal for the '<em><b>IManager Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IMANAGER_ID = eINSTANCE.getItem_IManagerId();

		/**
		 * The meta object literal for the '<em><b>IProduct Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IPRODUCT_NAME = eINSTANCE.getItem_IProductName();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.PromotionImpl <em>Promotion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.PromotionImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getPromotion()
		 * @generated
		 */
		EClass PROMOTION = eINSTANCE.getPromotion();

		/**
		 * The meta object literal for the '<em><b>PPromo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PPROMO_SK = eINSTANCE.getPromotion_PPromoSk();

		/**
		 * The meta object literal for the '<em><b>PPromo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PPROMO_ID = eINSTANCE.getPromotion_PPromoId();

		/**
		 * The meta object literal for the '<em><b>PStart Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PSTART_DATE_SK = eINSTANCE.getPromotion_PStartDateSk();

		/**
		 * The meta object literal for the '<em><b>PEnd Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PEND_DATE_SK = eINSTANCE.getPromotion_PEndDateSk();

		/**
		 * The meta object literal for the '<em><b>PItem Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PITEM_SK = eINSTANCE.getPromotion_PItemSk();

		/**
		 * The meta object literal for the '<em><b>PCost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCOST = eINSTANCE.getPromotion_PCost();

		/**
		 * The meta object literal for the '<em><b>PResponse Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PRESPONSE_TARGET = eINSTANCE.getPromotion_PResponseTarget();

		/**
		 * The meta object literal for the '<em><b>PPromo Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PPROMO_NAME = eINSTANCE.getPromotion_PPromoName();

		/**
		 * The meta object literal for the '<em><b>PChannel Dmail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_DMAIL = eINSTANCE.getPromotion_PChannelDmail();

		/**
		 * The meta object literal for the '<em><b>PChannel Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_EMAIL = eINSTANCE.getPromotion_PChannelEmail();

		/**
		 * The meta object literal for the '<em><b>PChannel Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_CATALOG = eINSTANCE.getPromotion_PChannelCatalog();

		/**
		 * The meta object literal for the '<em><b>PChannel Tv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_TV = eINSTANCE.getPromotion_PChannelTv();

		/**
		 * The meta object literal for the '<em><b>PChannel Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_RADIO = eINSTANCE.getPromotion_PChannelRadio();

		/**
		 * The meta object literal for the '<em><b>PChannel Press</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_PRESS = eINSTANCE.getPromotion_PChannelPress();

		/**
		 * The meta object literal for the '<em><b>PChannel Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_EVENT = eINSTANCE.getPromotion_PChannelEvent();

		/**
		 * The meta object literal for the '<em><b>PChannel Demo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_DEMO = eINSTANCE.getPromotion_PChannelDemo();

		/**
		 * The meta object literal for the '<em><b>PChannel Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PCHANNEL_DETAILS = eINSTANCE.getPromotion_PChannelDetails();

		/**
		 * The meta object literal for the '<em><b>PPurpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PPURPOSE = eINSTANCE.getPromotion_PPurpose();

		/**
		 * The meta object literal for the '<em><b>PDiscount Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PDISCOUNT_ACTIVE = eINSTANCE.getPromotion_PDiscountActive();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.ReasonImpl <em>Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.ReasonImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getReason()
		 * @generated
		 */
		EClass REASON = eINSTANCE.getReason();

		/**
		 * The meta object literal for the '<em><b>RReason Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REASON__RREASON_SK = eINSTANCE.getReason_RReasonSk();

		/**
		 * The meta object literal for the '<em><b>RReason Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REASON__RREASON_ID = eINSTANCE.getReason_RReasonId();

		/**
		 * The meta object literal for the '<em><b>RReason Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REASON__RREASON_DESC = eINSTANCE.getReason_RReasonDesc();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.ShipModeImpl <em>Ship Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.ShipModeImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getShipMode()
		 * @generated
		 */
		EClass SHIP_MODE = eINSTANCE.getShipMode();

		/**
		 * The meta object literal for the '<em><b>Sm Ship Mode Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP_MODE__SM_SHIP_MODE_SK = eINSTANCE.getShipMode_SmShipModeSk();

		/**
		 * The meta object literal for the '<em><b>Sm Ship Mode Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP_MODE__SM_SHIP_MODE_ID = eINSTANCE.getShipMode_SmShipModeId();

		/**
		 * The meta object literal for the '<em><b>Sm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP_MODE__SM_TYPE = eINSTANCE.getShipMode_SmType();

		/**
		 * The meta object literal for the '<em><b>Sm Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP_MODE__SM_CODE = eINSTANCE.getShipMode_SmCode();

		/**
		 * The meta object literal for the '<em><b>Sm Carrier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP_MODE__SM_CARRIER = eINSTANCE.getShipMode_SmCarrier();

		/**
		 * The meta object literal for the '<em><b>Sm Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP_MODE__SM_CONTRACT = eINSTANCE.getShipMode_SmContract();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.StoreImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>SStore Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTORE_SK = eINSTANCE.getStore_SStoreSk();

		/**
		 * The meta object literal for the '<em><b>SStore Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTORE_ID = eINSTANCE.getStore_SStoreId();

		/**
		 * The meta object literal for the '<em><b>SRec Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SREC_START_DATE = eINSTANCE.getStore_SRecStartDate();

		/**
		 * The meta object literal for the '<em><b>SRec End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SREC_END_DATE = eINSTANCE.getStore_SRecEndDate();

		/**
		 * The meta object literal for the '<em><b>SClosed Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SCLOSED_DATE_SK = eINSTANCE.getStore_SClosedDateSk();

		/**
		 * The meta object literal for the '<em><b>SStore Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTORE_NAME = eINSTANCE.getStore_SStoreName();

		/**
		 * The meta object literal for the '<em><b>SNumber Employees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SNUMBER_EMPLOYEES = eINSTANCE.getStore_SNumberEmployees();

		/**
		 * The meta object literal for the '<em><b>SFloor Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SFLOOR_SPACE = eINSTANCE.getStore_SFloorSpace();

		/**
		 * The meta object literal for the '<em><b>SHours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SHOURS = eINSTANCE.getStore_SHours();

		/**
		 * The meta object literal for the '<em><b>SManager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SMANAGER = eINSTANCE.getStore_SManager();

		/**
		 * The meta object literal for the '<em><b>SMarket Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SMARKET_ID = eINSTANCE.getStore_SMarketId();

		/**
		 * The meta object literal for the '<em><b>SGeography Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SGEOGRAPHY_CLASS = eINSTANCE.getStore_SGeographyClass();

		/**
		 * The meta object literal for the '<em><b>SMarket Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SMARKET_DESC = eINSTANCE.getStore_SMarketDesc();

		/**
		 * The meta object literal for the '<em><b>SMarket Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SMARKET_MANAGER = eINSTANCE.getStore_SMarketManager();

		/**
		 * The meta object literal for the '<em><b>SDivision Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SDIVISION_ID = eINSTANCE.getStore_SDivisionId();

		/**
		 * The meta object literal for the '<em><b>SDivision Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SDIVISION_NAME = eINSTANCE.getStore_SDivisionName();

		/**
		 * The meta object literal for the '<em><b>SCompany Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SCOMPANY_ID = eINSTANCE.getStore_SCompanyId();

		/**
		 * The meta object literal for the '<em><b>SCompany Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SCOMPANY_NAME = eINSTANCE.getStore_SCompanyName();

		/**
		 * The meta object literal for the '<em><b>SStreet Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTREET_NUMBER = eINSTANCE.getStore_SStreetNumber();

		/**
		 * The meta object literal for the '<em><b>SStreet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTREET_NAME = eINSTANCE.getStore_SStreetName();

		/**
		 * The meta object literal for the '<em><b>SStreet Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTREET_TYPE = eINSTANCE.getStore_SStreetType();

		/**
		 * The meta object literal for the '<em><b>SSuite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSUITE_NUMBER = eINSTANCE.getStore_SSuiteNumber();

		/**
		 * The meta object literal for the '<em><b>SCity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SCITY = eINSTANCE.getStore_SCity();

		/**
		 * The meta object literal for the '<em><b>SCounty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SCOUNTY = eINSTANCE.getStore_SCounty();

		/**
		 * The meta object literal for the '<em><b>SState</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTATE = eINSTANCE.getStore_SState();

		/**
		 * The meta object literal for the '<em><b>SZip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SZIP = eINSTANCE.getStore_SZip();

		/**
		 * The meta object literal for the '<em><b>SCountry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SCOUNTRY = eINSTANCE.getStore_SCountry();

		/**
		 * The meta object literal for the '<em><b>SGmt Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SGMT_OFFSET = eINSTANCE.getStore_SGmtOffset();

		/**
		 * The meta object literal for the '<em><b>STax Precentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STAX_PRECENTAGE = eINSTANCE.getStore_STaxPrecentage();

		/**
		 * The meta object literal for the '<em><b>Store Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__STORE_SALES = eINSTANCE.getStore_StoreSales();

		/**
		 * The meta object literal for the '<em><b>Store Returns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__STORE_RETURNS = eINSTANCE.getStore_StoreReturns();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.StoreReturnsImpl <em>Store Returns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.StoreReturnsImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreReturns()
		 * @generated
		 */
		EClass STORE_RETURNS = eINSTANCE.getStoreReturns();

		/**
		 * The meta object literal for the '<em><b>Sr Returned Date Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_RETURNED_DATE_SK = eINSTANCE.getStoreReturns_SrReturnedDateSk();

		/**
		 * The meta object literal for the '<em><b>Sr Return Time Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_TIME_SK = eINSTANCE.getStoreReturns_SrReturnTimeSk();

		/**
		 * The meta object literal for the '<em><b>Sr Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_ID = eINSTANCE.getStoreReturns_SrId();

		/**
		 * The meta object literal for the '<em><b>Sr Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_ITEM_SK = eINSTANCE.getStoreReturns_SrItemSk();

		/**
		 * The meta object literal for the '<em><b>Sr Ticket Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_TICKET_NUMBER = eINSTANCE.getStoreReturns_SrTicketNumber();

		/**
		 * The meta object literal for the '<em><b>Sr Customer Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_CUSTOMER_SK = eINSTANCE.getStoreReturns_SrCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Sr Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_CDEMO_SK = eINSTANCE.getStoreReturns_SrCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Sr Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_HDEMO_SK = eINSTANCE.getStoreReturns_SrHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Sr Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_ADDR_SK = eINSTANCE.getStoreReturns_SrAddrSk();

		/**
		 * The meta object literal for the '<em><b>Sr Store Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_STORE_SK = eINSTANCE.getStoreReturns_SrStoreSk();

		/**
		 * The meta object literal for the '<em><b>Sr Reason Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_REASON_SK = eINSTANCE.getStoreReturns_SrReasonSk();

		/**
		 * The meta object literal for the '<em><b>Sr Return Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_QUANTITY = eINSTANCE.getStoreReturns_SrReturnQuantity();

		/**
		 * The meta object literal for the '<em><b>Sr Return Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_AMT = eINSTANCE.getStoreReturns_SrReturnAmt();

		/**
		 * The meta object literal for the '<em><b>Sr Return Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_TAX = eINSTANCE.getStoreReturns_SrReturnTax();

		/**
		 * The meta object literal for the '<em><b>Sr Return Amt Inc Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_AMT_INC_TAX = eINSTANCE.getStoreReturns_SrReturnAmtIncTax();

		/**
		 * The meta object literal for the '<em><b>Sr Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_FEE = eINSTANCE.getStoreReturns_SrFee();

		/**
		 * The meta object literal for the '<em><b>Sr Return Ship Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_SHIP_COST = eINSTANCE.getStoreReturns_SrReturnShipCost();

		/**
		 * The meta object literal for the '<em><b>Sr Refunded Cash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_REFUNDED_CASH = eINSTANCE.getStoreReturns_SrRefundedCash();

		/**
		 * The meta object literal for the '<em><b>Sr Reversed Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_REVERSED_CHARGE = eINSTANCE.getStoreReturns_SrReversedCharge();

		/**
		 * The meta object literal for the '<em><b>Sr Store Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_STORE_CREDIT = eINSTANCE.getStoreReturns_SrStoreCredit();

		/**
		 * The meta object literal for the '<em><b>Sr Net Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_NET_LOSS = eINSTANCE.getStoreReturns_SrNetLoss();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.StoreReturnsIdImpl <em>Store Returns Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.StoreReturnsIdImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreReturnsId()
		 * @generated
		 */
		EClass STORE_RETURNS_ID = eINSTANCE.getStoreReturnsId();

		/**
		 * The meta object literal for the '<em><b>Sr Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS_ID__SR_ITEM_SK = eINSTANCE.getStoreReturnsId_SrItemSk();

		/**
		 * The meta object literal for the '<em><b>Sr Ticket Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS_ID__SR_TICKET_NUMBER = eINSTANCE.getStoreReturnsId_SrTicketNumber();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.StoreSalesImpl <em>Store Sales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.StoreSalesImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreSales()
		 * @generated
		 */
		EClass STORE_SALES = eINSTANCE.getStoreSales();

		/**
		 * The meta object literal for the '<em><b>Ss Sold Date Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_SALES__SS_SOLD_DATE_SK = eINSTANCE.getStoreSales_SsSoldDateSk();

		/**
		 * The meta object literal for the '<em><b>Ss Sold Time Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_SOLD_TIME_SK = eINSTANCE.getStoreSales_SsSoldTimeSk();

		/**
		 * The meta object literal for the '<em><b>Ss Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_ITEM_SK = eINSTANCE.getStoreSales_SsItemSk();

		/**
		 * The meta object literal for the '<em><b>Ss Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_SALES__SS_ID = eINSTANCE.getStoreSales_SsId();

		/**
		 * The meta object literal for the '<em><b>Ss Customer Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_SALES__SS_CUSTOMER_SK = eINSTANCE.getStoreSales_SsCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Ss Ticket Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_TICKET_NUMBER = eINSTANCE.getStoreSales_SsTicketNumber();

		/**
		 * The meta object literal for the '<em><b>Ss Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_CDEMO_SK = eINSTANCE.getStoreSales_SsCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Ss Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_HDEMO_SK = eINSTANCE.getStoreSales_SsHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Ss Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_ADDR_SK = eINSTANCE.getStoreSales_SsAddrSk();

		/**
		 * The meta object literal for the '<em><b>Ss Store Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_SALES__SS_STORE_SK = eINSTANCE.getStoreSales_SsStoreSk();

		/**
		 * The meta object literal for the '<em><b>Ss Promo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_PROMO_SK = eINSTANCE.getStoreSales_SsPromoSk();

		/**
		 * The meta object literal for the '<em><b>Ss Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_QUANTITY = eINSTANCE.getStoreSales_SsQuantity();

		/**
		 * The meta object literal for the '<em><b>Ss Wholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_WHOLESALE_COST = eINSTANCE.getStoreSales_SsWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>Ss List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_LIST_PRICE = eINSTANCE.getStoreSales_SsListPrice();

		/**
		 * The meta object literal for the '<em><b>Ss Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_SALES_PRICE = eINSTANCE.getStoreSales_SsSalesPrice();

		/**
		 * The meta object literal for the '<em><b>Ss Ext Discount Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_EXT_DISCOUNT_AMT = eINSTANCE.getStoreSales_SsExtDiscountAmt();

		/**
		 * The meta object literal for the '<em><b>Ss Ext Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_EXT_SALES_PRICE = eINSTANCE.getStoreSales_SsExtSalesPrice();

		/**
		 * The meta object literal for the '<em><b>Ss Ext Wholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_EXT_WHOLESALE_COST = eINSTANCE.getStoreSales_SsExtWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>Ss Ext List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_EXT_LIST_PRICE = eINSTANCE.getStoreSales_SsExtListPrice();

		/**
		 * The meta object literal for the '<em><b>Ss Ext Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_EXT_TAX = eINSTANCE.getStoreSales_SsExtTax();

		/**
		 * The meta object literal for the '<em><b>Ss Coupon Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_COUPON_AMT = eINSTANCE.getStoreSales_SsCouponAmt();

		/**
		 * The meta object literal for the '<em><b>Ss Net Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_NET_PAID = eINSTANCE.getStoreSales_SsNetPaid();

		/**
		 * The meta object literal for the '<em><b>Ss Net Paid Inc Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_NET_PAID_INC_TAX = eINSTANCE.getStoreSales_SsNetPaidIncTax();

		/**
		 * The meta object literal for the '<em><b>Ss Net Profit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES__SS_NET_PROFIT = eINSTANCE.getStoreSales_SsNetProfit();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.StoreSalesIdImpl <em>Store Sales Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.StoreSalesIdImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getStoreSalesId()
		 * @generated
		 */
		EClass STORE_SALES_ID = eINSTANCE.getStoreSalesId();

		/**
		 * The meta object literal for the '<em><b>Ss Customer Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_SALES_ID__SS_CUSTOMER_SK = eINSTANCE.getStoreSalesId_SsCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Ss Ticket Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_SALES_ID__SS_TICKET_NUMBER = eINSTANCE.getStoreSalesId_SsTicketNumber();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.TimeDimImpl <em>Time Dim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.TimeDimImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getTimeDim()
		 * @generated
		 */
		EClass TIME_DIM = eINSTANCE.getTimeDim();

		/**
		 * The meta object literal for the '<em><b>TTime Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TTIME_SK = eINSTANCE.getTimeDim_TTimeSk();

		/**
		 * The meta object literal for the '<em><b>TTime Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TTIME_ID = eINSTANCE.getTimeDim_TTimeId();

		/**
		 * The meta object literal for the '<em><b>TTime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TTIME = eINSTANCE.getTimeDim_TTime();

		/**
		 * The meta object literal for the '<em><b>THour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__THOUR = eINSTANCE.getTimeDim_THour();

		/**
		 * The meta object literal for the '<em><b>TMinute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TMINUTE = eINSTANCE.getTimeDim_TMinute();

		/**
		 * The meta object literal for the '<em><b>TSecond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TSECOND = eINSTANCE.getTimeDim_TSecond();

		/**
		 * The meta object literal for the '<em><b>TAm Pm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TAM_PM = eINSTANCE.getTimeDim_TAmPm();

		/**
		 * The meta object literal for the '<em><b>TShift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TSHIFT = eINSTANCE.getTimeDim_TShift();

		/**
		 * The meta object literal for the '<em><b>TSub Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TSUB_SHIFT = eINSTANCE.getTimeDim_TSubShift();

		/**
		 * The meta object literal for the '<em><b>TMeal Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIM__TMEAL_TIME = eINSTANCE.getTimeDim_TMealTime();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.WarehouseImpl <em>Warehouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.WarehouseImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWarehouse()
		 * @generated
		 */
		EClass WAREHOUSE = eINSTANCE.getWarehouse();

		/**
		 * The meta object literal for the '<em><b>WWarehouse Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WWAREHOUSE_SK = eINSTANCE.getWarehouse_WWarehouseSk();

		/**
		 * The meta object literal for the '<em><b>WWarehouse Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WWAREHOUSE_ID = eINSTANCE.getWarehouse_WWarehouseId();

		/**
		 * The meta object literal for the '<em><b>WWarehouse Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WWAREHOUSE_NAME = eINSTANCE.getWarehouse_WWarehouseName();

		/**
		 * The meta object literal for the '<em><b>WWarehouse Sq Ft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WWAREHOUSE_SQ_FT = eINSTANCE.getWarehouse_WWarehouseSqFt();

		/**
		 * The meta object literal for the '<em><b>WStreet Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WSTREET_NUMBER = eINSTANCE.getWarehouse_WStreetNumber();

		/**
		 * The meta object literal for the '<em><b>WStreet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WSTREET_NAME = eINSTANCE.getWarehouse_WStreetName();

		/**
		 * The meta object literal for the '<em><b>WStreet Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WSTREET_TYPE = eINSTANCE.getWarehouse_WStreetType();

		/**
		 * The meta object literal for the '<em><b>WSuite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WSUITE_NUMBER = eINSTANCE.getWarehouse_WSuiteNumber();

		/**
		 * The meta object literal for the '<em><b>WCity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WCITY = eINSTANCE.getWarehouse_WCity();

		/**
		 * The meta object literal for the '<em><b>WCounty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WCOUNTY = eINSTANCE.getWarehouse_WCounty();

		/**
		 * The meta object literal for the '<em><b>WState</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WSTATE = eINSTANCE.getWarehouse_WState();

		/**
		 * The meta object literal for the '<em><b>WZip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WZIP = eINSTANCE.getWarehouse_WZip();

		/**
		 * The meta object literal for the '<em><b>WCountry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WCOUNTRY = eINSTANCE.getWarehouse_WCountry();

		/**
		 * The meta object literal for the '<em><b>WGmt Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE__WGMT_OFFSET = eINSTANCE.getWarehouse_WGmtOffset();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.WebPageImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Wp Web Page Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_WEB_PAGE_SK = eINSTANCE.getWebPage_WpWebPageSk();

		/**
		 * The meta object literal for the '<em><b>Wp Web Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_WEB_PAGE_ID = eINSTANCE.getWebPage_WpWebPageId();

		/**
		 * The meta object literal for the '<em><b>Wp Rec Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_REC_START_DATE = eINSTANCE.getWebPage_WpRecStartDate();

		/**
		 * The meta object literal for the '<em><b>Wp Rec End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_REC_END_DATE = eINSTANCE.getWebPage_WpRecEndDate();

		/**
		 * The meta object literal for the '<em><b>Wp Creation Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_CREATION_DATE_SK = eINSTANCE.getWebPage_WpCreationDateSk();

		/**
		 * The meta object literal for the '<em><b>Wp Access Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_ACCESS_DATE_SK = eINSTANCE.getWebPage_WpAccessDateSk();

		/**
		 * The meta object literal for the '<em><b>Wp Autogen Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_AUTOGEN_FLAG = eINSTANCE.getWebPage_WpAutogenFlag();

		/**
		 * The meta object literal for the '<em><b>Wp Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_CUSTOMER_SK = eINSTANCE.getWebPage_WpCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Wp Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_URL = eINSTANCE.getWebPage_WpUrl();

		/**
		 * The meta object literal for the '<em><b>Wp Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_TYPE = eINSTANCE.getWebPage_WpType();

		/**
		 * The meta object literal for the '<em><b>Wp Char Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_CHAR_COUNT = eINSTANCE.getWebPage_WpCharCount();

		/**
		 * The meta object literal for the '<em><b>Wp Link Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_LINK_COUNT = eINSTANCE.getWebPage_WpLinkCount();

		/**
		 * The meta object literal for the '<em><b>Wp Image Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_IMAGE_COUNT = eINSTANCE.getWebPage_WpImageCount();

		/**
		 * The meta object literal for the '<em><b>Wp Max Ad Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WP_MAX_AD_COUNT = eINSTANCE.getWebPage_WpMaxAdCount();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.WebReturnsImpl <em>Web Returns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.WebReturnsImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebReturns()
		 * @generated
		 */
		EClass WEB_RETURNS = eINSTANCE.getWebReturns();

		/**
		 * The meta object literal for the '<em><b>Wr Returned Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURNED_DATE_SK = eINSTANCE.getWebReturns_WrReturnedDateSk();

		/**
		 * The meta object literal for the '<em><b>Wr Returned Time Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURNED_TIME_SK = eINSTANCE.getWebReturns_WrReturnedTimeSk();

		/**
		 * The meta object literal for the '<em><b>Wr Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_ITEM_SK = eINSTANCE.getWebReturns_WrItemSk();

		/**
		 * The meta object literal for the '<em><b>Wr Refunded Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK = eINSTANCE.getWebReturns_WrRefundedCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Wr Refunded Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REFUNDED_CDEMO_SK = eINSTANCE.getWebReturns_WrRefundedCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Wr Refunded Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REFUNDED_HDEMO_SK = eINSTANCE.getWebReturns_WrRefundedHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Wr Refunded Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REFUNDED_ADDR_SK = eINSTANCE.getWebReturns_WrRefundedAddrSk();

		/**
		 * The meta object literal for the '<em><b>Wr Returning Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURNING_CUSTOMER_SK = eINSTANCE.getWebReturns_WrReturningCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Wr Returning Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURNING_CDEMO_SK = eINSTANCE.getWebReturns_WrReturningCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Wr Returning Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURNING_HDEMO_SK = eINSTANCE.getWebReturns_WrReturningHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Wr Returning Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURNING_ADDR_SK = eINSTANCE.getWebReturns_WrReturningAddrSk();

		/**
		 * The meta object literal for the '<em><b>Wr Web Page Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_WEB_PAGE_SK = eINSTANCE.getWebReturns_WrWebPageSk();

		/**
		 * The meta object literal for the '<em><b>Wr Reason Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REASON_SK = eINSTANCE.getWebReturns_WrReasonSk();

		/**
		 * The meta object literal for the '<em><b>Wr Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_ORDER_NUMBER = eINSTANCE.getWebReturns_WrOrderNumber();

		/**
		 * The meta object literal for the '<em><b>Wr Return Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURN_QUANTITY = eINSTANCE.getWebReturns_WrReturnQuantity();

		/**
		 * The meta object literal for the '<em><b>Wr Return Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURN_AMT = eINSTANCE.getWebReturns_WrReturnAmt();

		/**
		 * The meta object literal for the '<em><b>Wr Return Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURN_TAX = eINSTANCE.getWebReturns_WrReturnTax();

		/**
		 * The meta object literal for the '<em><b>Wr Return Amt Inc Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURN_AMT_INC_TAX = eINSTANCE.getWebReturns_WrReturnAmtIncTax();

		/**
		 * The meta object literal for the '<em><b>Wr Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_FEE = eINSTANCE.getWebReturns_WrFee();

		/**
		 * The meta object literal for the '<em><b>Wr Return Ship Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_RETURN_SHIP_COST = eINSTANCE.getWebReturns_WrReturnShipCost();

		/**
		 * The meta object literal for the '<em><b>Wr Refunded Cash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REFUNDED_CASH = eINSTANCE.getWebReturns_WrRefundedCash();

		/**
		 * The meta object literal for the '<em><b>Wr Reversed Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_REVERSED_CHARGE = eINSTANCE.getWebReturns_WrReversedCharge();

		/**
		 * The meta object literal for the '<em><b>Wr Account Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_ACCOUNT_CREDIT = eINSTANCE.getWebReturns_WrAccountCredit();

		/**
		 * The meta object literal for the '<em><b>Wr Net Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_RETURNS__WR_NET_LOSS = eINSTANCE.getWebReturns_WrNetLoss();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.WebSalesImpl <em>Web Sales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.WebSalesImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebSales()
		 * @generated
		 */
		EClass WEB_SALES = eINSTANCE.getWebSales();

		/**
		 * The meta object literal for the '<em><b>Ws Sold Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SOLD_DATE_SK = eINSTANCE.getWebSales_WsSoldDateSk();

		/**
		 * The meta object literal for the '<em><b>Ws Sold Time Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SOLD_TIME_SK = eINSTANCE.getWebSales_WsSoldTimeSk();

		/**
		 * The meta object literal for the '<em><b>Ws Ship Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SHIP_DATE_SK = eINSTANCE.getWebSales_WsShipDateSk();

		/**
		 * The meta object literal for the '<em><b>Ws Item Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_ITEM_SK = eINSTANCE.getWebSales_WsItemSk();

		/**
		 * The meta object literal for the '<em><b>Ws Bill Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_BILL_CUSTOMER_SK = eINSTANCE.getWebSales_WsBillCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Ws Bill Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_BILL_CDEMO_SK = eINSTANCE.getWebSales_WsBillCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Ws Bill Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_BILL_HDEMO_SK = eINSTANCE.getWebSales_WsBillHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Ws Bill Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_BILL_ADDR_SK = eINSTANCE.getWebSales_WsBillAddrSk();

		/**
		 * The meta object literal for the '<em><b>Ws Ship Customer Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SHIP_CUSTOMER_SK = eINSTANCE.getWebSales_WsShipCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Ws Ship Cdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SHIP_CDEMO_SK = eINSTANCE.getWebSales_WsShipCdemoSk();

		/**
		 * The meta object literal for the '<em><b>Ws Ship Hdemo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SHIP_HDEMO_SK = eINSTANCE.getWebSales_WsShipHdemoSk();

		/**
		 * The meta object literal for the '<em><b>Ws Ship Addr Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SHIP_ADDR_SK = eINSTANCE.getWebSales_WsShipAddrSk();

		/**
		 * The meta object literal for the '<em><b>Ws Web Page Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_WEB_PAGE_SK = eINSTANCE.getWebSales_WsWebPageSk();

		/**
		 * The meta object literal for the '<em><b>Ws Web Site Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_WEB_SITE_SK = eINSTANCE.getWebSales_WsWebSiteSk();

		/**
		 * The meta object literal for the '<em><b>Ws Ship Mode Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SHIP_MODE_SK = eINSTANCE.getWebSales_WsShipModeSk();

		/**
		 * The meta object literal for the '<em><b>Ws Warehouse Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_WAREHOUSE_SK = eINSTANCE.getWebSales_WsWarehouseSk();

		/**
		 * The meta object literal for the '<em><b>Ws Promo Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_PROMO_SK = eINSTANCE.getWebSales_WsPromoSk();

		/**
		 * The meta object literal for the '<em><b>Ws Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_ORDER_NUMBER = eINSTANCE.getWebSales_WsOrderNumber();

		/**
		 * The meta object literal for the '<em><b>Ws Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_QUANTITY = eINSTANCE.getWebSales_WsQuantity();

		/**
		 * The meta object literal for the '<em><b>Ws Wholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_WHOLESALE_COST = eINSTANCE.getWebSales_WsWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>Ws List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_LIST_PRICE = eINSTANCE.getWebSales_WsListPrice();

		/**
		 * The meta object literal for the '<em><b>Ws Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_SALES_PRICE = eINSTANCE.getWebSales_WsSalesPrice();

		/**
		 * The meta object literal for the '<em><b>Ws Ext Discount Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_EXT_DISCOUNT_AMT = eINSTANCE.getWebSales_WsExtDiscountAmt();

		/**
		 * The meta object literal for the '<em><b>Ws Ext Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_EXT_SALES_PRICE = eINSTANCE.getWebSales_WsExtSalesPrice();

		/**
		 * The meta object literal for the '<em><b>Ws Ext Wholesale Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_EXT_WHOLESALE_COST = eINSTANCE.getWebSales_WsExtWholesaleCost();

		/**
		 * The meta object literal for the '<em><b>Ws Ext List Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_EXT_LIST_PRICE = eINSTANCE.getWebSales_WsExtListPrice();

		/**
		 * The meta object literal for the '<em><b>Ws Ext Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_EXT_TAX = eINSTANCE.getWebSales_WsExtTax();

		/**
		 * The meta object literal for the '<em><b>Ws Coupon Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_COUPON_AMT = eINSTANCE.getWebSales_WsCouponAmt();

		/**
		 * The meta object literal for the '<em><b>Ws Ext Ship Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_EXT_SHIP_COST = eINSTANCE.getWebSales_WsExtShipCost();

		/**
		 * The meta object literal for the '<em><b>Ws Net Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_NET_PAID = eINSTANCE.getWebSales_WsNetPaid();

		/**
		 * The meta object literal for the '<em><b>Ws Net Paid Inc Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_NET_PAID_INC_TAX = eINSTANCE.getWebSales_WsNetPaidIncTax();

		/**
		 * The meta object literal for the '<em><b>Ws Net Paid Inc Ship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_NET_PAID_INC_SHIP = eINSTANCE.getWebSales_WsNetPaidIncShip();

		/**
		 * The meta object literal for the '<em><b>Ws Net Paid Inc Ship Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_NET_PAID_INC_SHIP_TAX = eINSTANCE.getWebSales_WsNetPaidIncShipTax();

		/**
		 * The meta object literal for the '<em><b>Ws Net Profit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SALES__WS_NET_PROFIT = eINSTANCE.getWebSales_WsNetProfit();

		/**
		 * The meta object literal for the '{@link tpcds.tpcdsModel.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.tpcdsModel.impl.WebSiteImpl
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Web Site Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_SITE_SK = eINSTANCE.getWebSite_WebSiteSk();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_SITE_ID = eINSTANCE.getWebSite_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Web Rec Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_REC_START_DATE = eINSTANCE.getWebSite_WebRecStartDate();

		/**
		 * The meta object literal for the '<em><b>Web Rec End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_REC_END_DATE = eINSTANCE.getWebSite_WebRecEndDate();

		/**
		 * The meta object literal for the '<em><b>Web Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_NAME = eINSTANCE.getWebSite_WebName();

		/**
		 * The meta object literal for the '<em><b>Web Open Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_OPEN_DATE_SK = eINSTANCE.getWebSite_WebOpenDateSk();

		/**
		 * The meta object literal for the '<em><b>Web Close Date Sk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_CLOSE_DATE_SK = eINSTANCE.getWebSite_WebCloseDateSk();

		/**
		 * The meta object literal for the '<em><b>Web Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_CLASS = eINSTANCE.getWebSite_WebClass();

		/**
		 * The meta object literal for the '<em><b>Web Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_MANAGER = eINSTANCE.getWebSite_WebManager();

		/**
		 * The meta object literal for the '<em><b>Web Mkt Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_MKT_ID = eINSTANCE.getWebSite_WebMktId();

		/**
		 * The meta object literal for the '<em><b>Web Mkt Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_MKT_CLASS = eINSTANCE.getWebSite_WebMktClass();

		/**
		 * The meta object literal for the '<em><b>Web Mkt Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_MKT_DESC = eINSTANCE.getWebSite_WebMktDesc();

		/**
		 * The meta object literal for the '<em><b>Web Market Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_MARKET_MANAGER = eINSTANCE.getWebSite_WebMarketManager();

		/**
		 * The meta object literal for the '<em><b>Web Company Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_COMPANY_ID = eINSTANCE.getWebSite_WebCompanyId();

		/**
		 * The meta object literal for the '<em><b>Web Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_COMPANY_NAME = eINSTANCE.getWebSite_WebCompanyName();

		/**
		 * The meta object literal for the '<em><b>Web Street Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_STREET_NUMBER = eINSTANCE.getWebSite_WebStreetNumber();

		/**
		 * The meta object literal for the '<em><b>Web Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_STREET_NAME = eINSTANCE.getWebSite_WebStreetName();

		/**
		 * The meta object literal for the '<em><b>Web Street Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_STREET_TYPE = eINSTANCE.getWebSite_WebStreetType();

		/**
		 * The meta object literal for the '<em><b>Web Suite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_SUITE_NUMBER = eINSTANCE.getWebSite_WebSuiteNumber();

		/**
		 * The meta object literal for the '<em><b>Web City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_CITY = eINSTANCE.getWebSite_WebCity();

		/**
		 * The meta object literal for the '<em><b>Web County</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_COUNTY = eINSTANCE.getWebSite_WebCounty();

		/**
		 * The meta object literal for the '<em><b>Web State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_STATE = eINSTANCE.getWebSite_WebState();

		/**
		 * The meta object literal for the '<em><b>Web Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_ZIP = eINSTANCE.getWebSite_WebZip();

		/**
		 * The meta object literal for the '<em><b>Web Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_COUNTRY = eINSTANCE.getWebSite_WebCountry();

		/**
		 * The meta object literal for the '<em><b>Web Gmt Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_GMT_OFFSET = eINSTANCE.getWebSite_WebGmtOffset();

		/**
		 * The meta object literal for the '<em><b>Web Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_TAX_PERCENTAGE = eINSTANCE.getWebSite_WebTaxPercentage();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Date
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Time
		 * @see tpcds.tpcdsModel.impl.TpcdsModelPackageImpl#getTime()
		 * @generated
		 */
		EDataType TIME = eINSTANCE.getTime();

	}

} //TpcdsModelPackage
