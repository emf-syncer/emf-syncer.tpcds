/**
 */
package tpcds.gen.q1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.Customer#getCCustomerSk <em>CCustomer Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.Customer#getCCustomerId <em>CCustomer Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.Customer#getCPreferredCustFlag <em>CPreferred Cust Flag</em>}</li>
 *   <li>{@link tpcds.gen.q1.Customer#getStoreReturns <em>Store Returns</em>}</li>
 * </ul>
 *
 * @see tpcds.gen.q1.Q1Package#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>CCustomer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCustomer Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCustomer Sk</em>' attribute.
	 * @see #isSetCCustomerSk()
	 * @see #unsetCCustomerSk()
	 * @see #setCCustomerSk(Long)
	 * @see tpcds.gen.q1.Q1Package#getCustomer_CCustomerSk()
	 * @model unsettable="true"
	 * @generated
	 */
	Long getCCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.Customer#getCCustomerSk <em>CCustomer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCustomer Sk</em>' attribute.
	 * @see #isSetCCustomerSk()
	 * @see #unsetCCustomerSk()
	 * @see #getCCustomerSk()
	 * @generated
	 */
	void setCCustomerSk(Long value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Customer#getCCustomerSk <em>CCustomer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCCustomerSk()
	 * @see #getCCustomerSk()
	 * @see #setCCustomerSk(Long)
	 * @generated
	 */
	void unsetCCustomerSk();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Customer#getCCustomerSk <em>CCustomer Sk</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CCustomer Sk</em>' attribute is set.
	 * @see #unsetCCustomerSk()
	 * @see #getCCustomerSk()
	 * @see #setCCustomerSk(Long)
	 * @generated
	 */
	boolean isSetCCustomerSk();

	/**
	 * Returns the value of the '<em><b>CCustomer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCustomer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCustomer Id</em>' attribute.
	 * @see #isSetCCustomerId()
	 * @see #unsetCCustomerId()
	 * @see #setCCustomerId(String)
	 * @see tpcds.gen.q1.Q1Package#getCustomer_CCustomerId()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCCustomerId();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.Customer#getCCustomerId <em>CCustomer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCustomer Id</em>' attribute.
	 * @see #isSetCCustomerId()
	 * @see #unsetCCustomerId()
	 * @see #getCCustomerId()
	 * @generated
	 */
	void setCCustomerId(String value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Customer#getCCustomerId <em>CCustomer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCCustomerId()
	 * @see #getCCustomerId()
	 * @see #setCCustomerId(String)
	 * @generated
	 */
	void unsetCCustomerId();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Customer#getCCustomerId <em>CCustomer Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CCustomer Id</em>' attribute is set.
	 * @see #unsetCCustomerId()
	 * @see #getCCustomerId()
	 * @see #setCCustomerId(String)
	 * @generated
	 */
	boolean isSetCCustomerId();

	/**
	 * Returns the value of the '<em><b>CPreferred Cust Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPreferred Cust Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPreferred Cust Flag</em>' attribute.
	 * @see #setCPreferredCustFlag(String)
	 * @see tpcds.gen.q1.Q1Package#getCustomer_CPreferredCustFlag()
	 * @model
	 * @generated
	 */
	String getCPreferredCustFlag();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.Customer#getCPreferredCustFlag <em>CPreferred Cust Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPreferred Cust Flag</em>' attribute.
	 * @see #getCPreferredCustFlag()
	 * @generated
	 */
	void setCPreferredCustFlag(String value);

	/**
	 * Returns the value of the '<em><b>Store Returns</b></em>' reference list.
	 * The list contents are of type {@link tpcds.gen.q1.StoreReturns}.
	 * It is bidirectional and its opposite is '{@link tpcds.gen.q1.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Returns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Returns</em>' reference list.
	 * @see #isSetStoreReturns()
	 * @see #unsetStoreReturns()
	 * @see tpcds.gen.q1.Q1Package#getCustomer_StoreReturns()
	 * @see tpcds.gen.q1.StoreReturns#getSrCustomerSk
	 * @model opposite="srCustomerSk" unsettable="true"
	 * @generated
	 */
	EList<StoreReturns> getStoreReturns();

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Customer#getStoreReturns <em>Store Returns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStoreReturns()
	 * @see #getStoreReturns()
	 * @generated
	 */
	void unsetStoreReturns();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Customer#getStoreReturns <em>Store Returns</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Store Returns</em>' reference list is set.
	 * @see #unsetStoreReturns()
	 * @see #getStoreReturns()
	 * @generated
	 */
	boolean isSetStoreReturns();

} // Customer
