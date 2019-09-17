/**
 */
package tpcds.gen.q1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tpcds.gen.q1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Q1FactoryImpl extends EFactoryImpl implements Q1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Q1Factory init() {
		try {
			Q1Factory theQ1Factory = (Q1Factory)EPackage.Registry.INSTANCE.getEFactory(Q1Package.eNS_URI);
			if (theQ1Factory != null) {
				return theQ1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Q1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q1FactoryImpl() {
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
			case Q1Package.CUSTOMER: return createCustomer();
			case Q1Package.DATE_DIM: return createDateDim();
			case Q1Package.STORE: return createStore();
			case Q1Package.STORE_RETURNS: return createStoreReturns();
			case Q1Package.STORE_RETURNS_ID: return createStoreReturnsId();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDim createDateDim() {
		DateDimImpl dateDim = new DateDimImpl();
		return dateDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreReturns createStoreReturns() {
		StoreReturnsImpl storeReturns = new StoreReturnsImpl();
		return storeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreReturnsId createStoreReturnsId() {
		StoreReturnsIdImpl storeReturnsId = new StoreReturnsIdImpl();
		return storeReturnsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q1Package getQ1Package() {
		return (Q1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Q1Package getPackage() {
		return Q1Package.eINSTANCE;
	}

} //Q1FactoryImpl
