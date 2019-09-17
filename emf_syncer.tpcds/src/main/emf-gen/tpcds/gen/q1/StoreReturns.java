/**
 */
package tpcds.gen.q1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Returns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.StoreReturns#getSrId <em>Sr Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}</li>
 * </ul>
 *
 * @see tpcds.gen.q1.Q1Package#getStoreReturns()
 * @model
 * @generated
 */
public interface StoreReturns extends EObject {
	/**
	 * Returns the value of the '<em><b>Sr Returned Date Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Returned Date Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Returned Date Sk</em>' reference.
	 * @see #isSetSrReturnedDateSk()
	 * @see #unsetSrReturnedDateSk()
	 * @see #setSrReturnedDateSk(DateDim)
	 * @see tpcds.gen.q1.Q1Package#getStoreReturns_SrReturnedDateSk()
	 * @model unsettable="true"
	 * @generated
	 */
	DateDim getSrReturnedDateSk();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Returned Date Sk</em>' reference.
	 * @see #isSetSrReturnedDateSk()
	 * @see #unsetSrReturnedDateSk()
	 * @see #getSrReturnedDateSk()
	 * @generated
	 */
	void setSrReturnedDateSk(DateDim value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSrReturnedDateSk()
	 * @see #getSrReturnedDateSk()
	 * @see #setSrReturnedDateSk(DateDim)
	 * @generated
	 */
	void unsetSrReturnedDateSk();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sr Returned Date Sk</em>' reference is set.
	 * @see #unsetSrReturnedDateSk()
	 * @see #getSrReturnedDateSk()
	 * @see #setSrReturnedDateSk(DateDim)
	 * @generated
	 */
	boolean isSetSrReturnedDateSk();

	/**
	 * Returns the value of the '<em><b>Sr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Id</em>' reference.
	 * @see #isSetSrId()
	 * @see #unsetSrId()
	 * @see #setSrId(StoreReturnsId)
	 * @see tpcds.gen.q1.Q1Package#getStoreReturns_SrId()
	 * @model unsettable="true"
	 * @generated
	 */
	StoreReturnsId getSrId();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrId <em>Sr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Id</em>' reference.
	 * @see #isSetSrId()
	 * @see #unsetSrId()
	 * @see #getSrId()
	 * @generated
	 */
	void setSrId(StoreReturnsId value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrId <em>Sr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSrId()
	 * @see #getSrId()
	 * @see #setSrId(StoreReturnsId)
	 * @generated
	 */
	void unsetSrId();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.StoreReturns#getSrId <em>Sr Id</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sr Id</em>' reference is set.
	 * @see #unsetSrId()
	 * @see #getSrId()
	 * @see #setSrId(StoreReturnsId)
	 * @generated
	 */
	boolean isSetSrId();

	/**
	 * Returns the value of the '<em><b>Sr Customer Sk</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tpcds.gen.q1.Customer#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Customer Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Customer Sk</em>' reference.
	 * @see #isSetSrCustomerSk()
	 * @see #unsetSrCustomerSk()
	 * @see #setSrCustomerSk(Customer)
	 * @see tpcds.gen.q1.Q1Package#getStoreReturns_SrCustomerSk()
	 * @see tpcds.gen.q1.Customer#getStoreReturns
	 * @model opposite="storeReturns" unsettable="true"
	 * @generated
	 */
	Customer getSrCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Customer Sk</em>' reference.
	 * @see #isSetSrCustomerSk()
	 * @see #unsetSrCustomerSk()
	 * @see #getSrCustomerSk()
	 * @generated
	 */
	void setSrCustomerSk(Customer value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSrCustomerSk()
	 * @see #getSrCustomerSk()
	 * @see #setSrCustomerSk(Customer)
	 * @generated
	 */
	void unsetSrCustomerSk();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sr Customer Sk</em>' reference is set.
	 * @see #unsetSrCustomerSk()
	 * @see #getSrCustomerSk()
	 * @see #setSrCustomerSk(Customer)
	 * @generated
	 */
	boolean isSetSrCustomerSk();

	/**
	 * Returns the value of the '<em><b>Sr Store Sk</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tpcds.gen.q1.Store#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Store Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Store Sk</em>' container reference.
	 * @see #setSrStoreSk(Store)
	 * @see tpcds.gen.q1.Q1Package#getStoreReturns_SrStoreSk()
	 * @see tpcds.gen.q1.Store#getStoreReturns
	 * @model opposite="storeReturns" unsettable="true"
	 * @generated
	 */
	Store getSrStoreSk();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Store Sk</em>' container reference.
	 * @see #getSrStoreSk()
	 * @generated
	 */
	void setSrStoreSk(Store value);

	/**
	 * Returns the value of the '<em><b>Sr Return Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Amt</em>' attribute.
	 * @see #isSetSrReturnAmt()
	 * @see #unsetSrReturnAmt()
	 * @see #setSrReturnAmt(double)
	 * @see tpcds.gen.q1.Q1Package#getStoreReturns_SrReturnAmt()
	 * @model unsettable="true"
	 * @generated
	 */
	double getSrReturnAmt();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Amt</em>' attribute.
	 * @see #isSetSrReturnAmt()
	 * @see #unsetSrReturnAmt()
	 * @see #getSrReturnAmt()
	 * @generated
	 */
	void setSrReturnAmt(double value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSrReturnAmt()
	 * @see #getSrReturnAmt()
	 * @see #setSrReturnAmt(double)
	 * @generated
	 */
	void unsetSrReturnAmt();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sr Return Amt</em>' attribute is set.
	 * @see #unsetSrReturnAmt()
	 * @see #getSrReturnAmt()
	 * @see #setSrReturnAmt(double)
	 * @generated
	 */
	boolean isSetSrReturnAmt();

} // StoreReturns
