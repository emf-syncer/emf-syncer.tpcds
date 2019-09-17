/**
 */
package tpcds.gen.q1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tpcds.gen.q1.Customer;
import tpcds.gen.q1.DateDim;
import tpcds.gen.q1.Q1Factory;
import tpcds.gen.q1.Q1Package;
import tpcds.gen.q1.Store;
import tpcds.gen.q1.StoreReturns;
import tpcds.gen.q1.StoreReturnsId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Q1PackageImpl extends EPackageImpl implements Q1Package {
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
	private EClass dateDimEClass = null;

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
	 * @see tpcds.gen.q1.Q1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Q1PackageImpl() {
		super(eNS_URI, Q1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Q1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Q1Package init() {
		if (isInited) return (Q1Package)EPackage.Registry.INSTANCE.getEPackage(Q1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredQ1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Q1PackageImpl theQ1Package = registeredQ1Package instanceof Q1PackageImpl ? (Q1PackageImpl)registeredQ1Package : new Q1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQ1Package.createPackageContents();

		// Initialize created meta-data
		theQ1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQ1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Q1Package.eNS_URI, theQ1Package);
		return theQ1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CCustomerSk() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CCustomerId() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CPreferredCustFlag() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_StoreReturns() {
		return (EReference)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateDim() {
		return dateDimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateDim_DDateSk() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateDim_DDateId() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateDim_DYear() {
		return (EAttribute)dateDimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_SStoreSk() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_SStoreId() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_SState() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_StoreReturns() {
		return (EReference)storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreReturns() {
		return storeReturnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreReturns_SrReturnedDateSk() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreReturns_SrId() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreReturns_SrCustomerSk() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreReturns_SrStoreSk() {
		return (EReference)storeReturnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoreReturns_SrReturnAmt() {
		return (EAttribute)storeReturnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreReturnsId() {
		return storeReturnsIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoreReturnsId_SrItemSk() {
		return (EAttribute)storeReturnsIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoreReturnsId_SrTicketNumber() {
		return (EAttribute)storeReturnsIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q1Factory getQ1Factory() {
		return (Q1Factory)getEFactoryInstance();
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
		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__CCUSTOMER_SK);
		createEAttribute(customerEClass, CUSTOMER__CCUSTOMER_ID);
		createEAttribute(customerEClass, CUSTOMER__CPREFERRED_CUST_FLAG);
		createEReference(customerEClass, CUSTOMER__STORE_RETURNS);

		dateDimEClass = createEClass(DATE_DIM);
		createEAttribute(dateDimEClass, DATE_DIM__DDATE_SK);
		createEAttribute(dateDimEClass, DATE_DIM__DDATE_ID);
		createEAttribute(dateDimEClass, DATE_DIM__DYEAR);

		storeEClass = createEClass(STORE);
		createEAttribute(storeEClass, STORE__SSTORE_SK);
		createEAttribute(storeEClass, STORE__SSTORE_ID);
		createEAttribute(storeEClass, STORE__SSTATE);
		createEReference(storeEClass, STORE__STORE_RETURNS);

		storeReturnsEClass = createEClass(STORE_RETURNS);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_RETURNED_DATE_SK);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_ID);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_CUSTOMER_SK);
		createEReference(storeReturnsEClass, STORE_RETURNS__SR_STORE_SK);
		createEAttribute(storeReturnsEClass, STORE_RETURNS__SR_RETURN_AMT);

		storeReturnsIdEClass = createEClass(STORE_RETURNS_ID);
		createEAttribute(storeReturnsIdEClass, STORE_RETURNS_ID__SR_ITEM_SK);
		createEAttribute(storeReturnsIdEClass, STORE_RETURNS_ID__SR_TICKET_NUMBER);
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
		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_CCustomerSk(), ecorePackage.getELongObject(), "cCustomerSk", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CCustomerId(), ecorePackage.getEString(), "cCustomerId", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_CPreferredCustFlag(), ecorePackage.getEString(), "cPreferredCustFlag", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_StoreReturns(), this.getStoreReturns(), this.getStoreReturns_SrCustomerSk(), "storeReturns", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateDimEClass, DateDim.class, "DateDim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateDim_DDateSk(), ecorePackage.getELongObject(), "dDateSk", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DDateId(), ecorePackage.getEString(), "dDateId", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateDim_DYear(), ecorePackage.getELongObject(), "dYear", null, 0, 1, DateDim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStore_SStoreSk(), ecorePackage.getELongObject(), "sStoreSk", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SStoreId(), ecorePackage.getEString(), "sStoreId", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_SState(), ecorePackage.getEString(), "sState", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_StoreReturns(), this.getStoreReturns(), this.getStoreReturns_SrStoreSk(), "storeReturns", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeReturnsEClass, StoreReturns.class, "StoreReturns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreReturns_SrReturnedDateSk(), this.getDateDim(), null, "srReturnedDateSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreReturns_SrId(), this.getStoreReturnsId(), null, "srId", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreReturns_SrCustomerSk(), this.getCustomer(), this.getCustomer_StoreReturns(), "srCustomerSk", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreReturns_SrStoreSk(), this.getStore(), this.getStore_StoreReturns(), "srStoreSk", null, 0, 1, StoreReturns.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturns_SrReturnAmt(), ecorePackage.getEDouble(), "srReturnAmt", null, 0, 1, StoreReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeReturnsIdEClass, StoreReturnsId.class, "StoreReturnsId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoreReturnsId_SrItemSk(), ecorePackage.getELongObject(), "srItemSk", null, 0, 1, StoreReturnsId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoreReturnsId_SrTicketNumber(), ecorePackage.getELongObject(), "srTicketNumber", null, 0, 1, StoreReturnsId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Q1PackageImpl
