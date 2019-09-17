/**
 */
package tpcds.gen.q1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see tpcds.gen.q1.Q1Factory
 * @model kind="package"
 * @generated
 */
public interface Q1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "q1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tpcds/emf/q1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tpcds.emf.q1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Q1Package eINSTANCE = tpcds.gen.q1.impl.Q1PackageImpl.init();

	/**
	 * The meta object id for the '{@link tpcds.gen.q1.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.gen.q1.impl.CustomerImpl
	 * @see tpcds.gen.q1.impl.Q1PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

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
	 * The feature id for the '<em><b>CPreferred Cust Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CPREFERRED_CUST_FLAG = 2;

	/**
	 * The feature id for the '<em><b>Store Returns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STORE_RETURNS = 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.gen.q1.impl.DateDimImpl <em>Date Dim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.gen.q1.impl.DateDimImpl
	 * @see tpcds.gen.q1.impl.Q1PackageImpl#getDateDim()
	 * @generated
	 */
	int DATE_DIM = 1;

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
	 * The feature id for the '<em><b>DYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM__DYEAR = 2;

	/**
	 * The number of structural features of the '<em>Date Dim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Date Dim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_DIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.gen.q1.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.gen.q1.impl.StoreImpl
	 * @see tpcds.gen.q1.impl.Q1PackageImpl#getStore()
	 * @generated
	 */
	int STORE = 2;

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
	 * The feature id for the '<em><b>SState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SSTATE = 2;

	/**
	 * The feature id for the '<em><b>Store Returns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STORE_RETURNS = 3;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.gen.q1.impl.StoreReturnsImpl <em>Store Returns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.gen.q1.impl.StoreReturnsImpl
	 * @see tpcds.gen.q1.impl.Q1PackageImpl#getStoreReturns()
	 * @generated
	 */
	int STORE_RETURNS = 3;

	/**
	 * The feature id for the '<em><b>Sr Returned Date Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURNED_DATE_SK = 0;

	/**
	 * The feature id for the '<em><b>Sr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_ID = 1;

	/**
	 * The feature id for the '<em><b>Sr Customer Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_CUSTOMER_SK = 2;

	/**
	 * The feature id for the '<em><b>Sr Store Sk</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_STORE_SK = 3;

	/**
	 * The feature id for the '<em><b>Sr Return Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS__SR_RETURN_AMT = 4;

	/**
	 * The number of structural features of the '<em>Store Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Store Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_RETURNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpcds.gen.q1.impl.StoreReturnsIdImpl <em>Store Returns Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpcds.gen.q1.impl.StoreReturnsIdImpl
	 * @see tpcds.gen.q1.impl.Q1PackageImpl#getStoreReturnsId()
	 * @generated
	 */
	int STORE_RETURNS_ID = 4;

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
	 * Returns the meta object for class '{@link tpcds.gen.q1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see tpcds.gen.q1.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.Customer#getCCustomerSk <em>CCustomer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCustomer Sk</em>'.
	 * @see tpcds.gen.q1.Customer#getCCustomerSk()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCustomerSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.Customer#getCCustomerId <em>CCustomer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCustomer Id</em>'.
	 * @see tpcds.gen.q1.Customer#getCCustomerId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CCustomerId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.Customer#getCPreferredCustFlag <em>CPreferred Cust Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPreferred Cust Flag</em>'.
	 * @see tpcds.gen.q1.Customer#getCPreferredCustFlag()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CPreferredCustFlag();

	/**
	 * Returns the meta object for the reference list '{@link tpcds.gen.q1.Customer#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store Returns</em>'.
	 * @see tpcds.gen.q1.Customer#getStoreReturns()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_StoreReturns();

	/**
	 * Returns the meta object for class '{@link tpcds.gen.q1.DateDim <em>Date Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Dim</em>'.
	 * @see tpcds.gen.q1.DateDim
	 * @generated
	 */
	EClass getDateDim();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.DateDim#getDDateSk <em>DDate Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDate Sk</em>'.
	 * @see tpcds.gen.q1.DateDim#getDDateSk()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDateSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.DateDim#getDDateId <em>DDate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDate Id</em>'.
	 * @see tpcds.gen.q1.DateDim#getDDateId()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DDateId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.DateDim#getDYear <em>DYear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DYear</em>'.
	 * @see tpcds.gen.q1.DateDim#getDYear()
	 * @see #getDateDim()
	 * @generated
	 */
	EAttribute getDateDim_DYear();

	/**
	 * Returns the meta object for class '{@link tpcds.gen.q1.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see tpcds.gen.q1.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.Store#getSStoreSk <em>SStore Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStore Sk</em>'.
	 * @see tpcds.gen.q1.Store#getSStoreSk()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStoreSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.Store#getSStoreId <em>SStore Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SStore Id</em>'.
	 * @see tpcds.gen.q1.Store#getSStoreId()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SStoreId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.Store#getSState <em>SState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SState</em>'.
	 * @see tpcds.gen.q1.Store#getSState()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_SState();

	/**
	 * Returns the meta object for the containment reference list '{@link tpcds.gen.q1.Store#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Store Returns</em>'.
	 * @see tpcds.gen.q1.Store#getStoreReturns()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_StoreReturns();

	/**
	 * Returns the meta object for class '{@link tpcds.gen.q1.StoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Returns</em>'.
	 * @see tpcds.gen.q1.StoreReturns
	 * @generated
	 */
	EClass getStoreReturns();

	/**
	 * Returns the meta object for the reference '{@link tpcds.gen.q1.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Returned Date Sk</em>'.
	 * @see tpcds.gen.q1.StoreReturns#getSrReturnedDateSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrReturnedDateSk();

	/**
	 * Returns the meta object for the reference '{@link tpcds.gen.q1.StoreReturns#getSrId <em>Sr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Id</em>'.
	 * @see tpcds.gen.q1.StoreReturns#getSrId()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrId();

	/**
	 * Returns the meta object for the reference '{@link tpcds.gen.q1.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sr Customer Sk</em>'.
	 * @see tpcds.gen.q1.StoreReturns#getSrCustomerSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrCustomerSk();

	/**
	 * Returns the meta object for the container reference '{@link tpcds.gen.q1.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sr Store Sk</em>'.
	 * @see tpcds.gen.q1.StoreReturns#getSrStoreSk()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EReference getStoreReturns_SrStoreSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Return Amt</em>'.
	 * @see tpcds.gen.q1.StoreReturns#getSrReturnAmt()
	 * @see #getStoreReturns()
	 * @generated
	 */
	EAttribute getStoreReturns_SrReturnAmt();

	/**
	 * Returns the meta object for class '{@link tpcds.gen.q1.StoreReturnsId <em>Store Returns Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Returns Id</em>'.
	 * @see tpcds.gen.q1.StoreReturnsId
	 * @generated
	 */
	EClass getStoreReturnsId();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.StoreReturnsId#getSrItemSk <em>Sr Item Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Item Sk</em>'.
	 * @see tpcds.gen.q1.StoreReturnsId#getSrItemSk()
	 * @see #getStoreReturnsId()
	 * @generated
	 */
	EAttribute getStoreReturnsId_SrItemSk();

	/**
	 * Returns the meta object for the attribute '{@link tpcds.gen.q1.StoreReturnsId#getSrTicketNumber <em>Sr Ticket Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sr Ticket Number</em>'.
	 * @see tpcds.gen.q1.StoreReturnsId#getSrTicketNumber()
	 * @see #getStoreReturnsId()
	 * @generated
	 */
	EAttribute getStoreReturnsId_SrTicketNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Q1Factory getQ1Factory();

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
		 * The meta object literal for the '{@link tpcds.gen.q1.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.gen.q1.impl.CustomerImpl
		 * @see tpcds.gen.q1.impl.Q1PackageImpl#getCustomer()
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
		 * The meta object literal for the '<em><b>CPreferred Cust Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CPREFERRED_CUST_FLAG = eINSTANCE.getCustomer_CPreferredCustFlag();

		/**
		 * The meta object literal for the '<em><b>Store Returns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__STORE_RETURNS = eINSTANCE.getCustomer_StoreReturns();

		/**
		 * The meta object literal for the '{@link tpcds.gen.q1.impl.DateDimImpl <em>Date Dim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.gen.q1.impl.DateDimImpl
		 * @see tpcds.gen.q1.impl.Q1PackageImpl#getDateDim()
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
		 * The meta object literal for the '<em><b>DYear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_DIM__DYEAR = eINSTANCE.getDateDim_DYear();

		/**
		 * The meta object literal for the '{@link tpcds.gen.q1.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.gen.q1.impl.StoreImpl
		 * @see tpcds.gen.q1.impl.Q1PackageImpl#getStore()
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
		 * The meta object literal for the '<em><b>SState</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__SSTATE = eINSTANCE.getStore_SState();

		/**
		 * The meta object literal for the '<em><b>Store Returns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__STORE_RETURNS = eINSTANCE.getStore_StoreReturns();

		/**
		 * The meta object literal for the '{@link tpcds.gen.q1.impl.StoreReturnsImpl <em>Store Returns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.gen.q1.impl.StoreReturnsImpl
		 * @see tpcds.gen.q1.impl.Q1PackageImpl#getStoreReturns()
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
		 * The meta object literal for the '<em><b>Sr Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_ID = eINSTANCE.getStoreReturns_SrId();

		/**
		 * The meta object literal for the '<em><b>Sr Customer Sk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_CUSTOMER_SK = eINSTANCE.getStoreReturns_SrCustomerSk();

		/**
		 * The meta object literal for the '<em><b>Sr Store Sk</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_RETURNS__SR_STORE_SK = eINSTANCE.getStoreReturns_SrStoreSk();

		/**
		 * The meta object literal for the '<em><b>Sr Return Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_RETURNS__SR_RETURN_AMT = eINSTANCE.getStoreReturns_SrReturnAmt();

		/**
		 * The meta object literal for the '{@link tpcds.gen.q1.impl.StoreReturnsIdImpl <em>Store Returns Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpcds.gen.q1.impl.StoreReturnsIdImpl
		 * @see tpcds.gen.q1.impl.Q1PackageImpl#getStoreReturnsId()
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

	}

} //Q1Package
