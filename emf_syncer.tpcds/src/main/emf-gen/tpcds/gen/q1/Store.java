/**
 */
package tpcds.gen.q1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.Store#getSStoreSk <em>SStore Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.Store#getSStoreId <em>SStore Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.Store#getSState <em>SState</em>}</li>
 *   <li>{@link tpcds.gen.q1.Store#getStoreReturns <em>Store Returns</em>}</li>
 * </ul>
 *
 * @see tpcds.gen.q1.Q1Package#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
	/**
	 * Returns the value of the '<em><b>SStore Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStore Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStore Sk</em>' attribute.
	 * @see #isSetSStoreSk()
	 * @see #unsetSStoreSk()
	 * @see #setSStoreSk(Long)
	 * @see tpcds.gen.q1.Q1Package#getStore_SStoreSk()
	 * @model unsettable="true"
	 * @generated
	 */
	Long getSStoreSk();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.Store#getSStoreSk <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStore Sk</em>' attribute.
	 * @see #isSetSStoreSk()
	 * @see #unsetSStoreSk()
	 * @see #getSStoreSk()
	 * @generated
	 */
	void setSStoreSk(Long value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Store#getSStoreSk <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSStoreSk()
	 * @see #getSStoreSk()
	 * @see #setSStoreSk(Long)
	 * @generated
	 */
	void unsetSStoreSk();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Store#getSStoreSk <em>SStore Sk</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SStore Sk</em>' attribute is set.
	 * @see #unsetSStoreSk()
	 * @see #getSStoreSk()
	 * @see #setSStoreSk(Long)
	 * @generated
	 */
	boolean isSetSStoreSk();

	/**
	 * Returns the value of the '<em><b>SStore Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStore Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStore Id</em>' attribute.
	 * @see #isSetSStoreId()
	 * @see #unsetSStoreId()
	 * @see #setSStoreId(String)
	 * @see tpcds.gen.q1.Q1Package#getStore_SStoreId()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSStoreId();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.Store#getSStoreId <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStore Id</em>' attribute.
	 * @see #isSetSStoreId()
	 * @see #unsetSStoreId()
	 * @see #getSStoreId()
	 * @generated
	 */
	void setSStoreId(String value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Store#getSStoreId <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSStoreId()
	 * @see #getSStoreId()
	 * @see #setSStoreId(String)
	 * @generated
	 */
	void unsetSStoreId();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Store#getSStoreId <em>SStore Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SStore Id</em>' attribute is set.
	 * @see #unsetSStoreId()
	 * @see #getSStoreId()
	 * @see #setSStoreId(String)
	 * @generated
	 */
	boolean isSetSStoreId();

	/**
	 * Returns the value of the '<em><b>SState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SState</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SState</em>' attribute.
	 * @see #isSetSState()
	 * @see #unsetSState()
	 * @see #setSState(String)
	 * @see tpcds.gen.q1.Q1Package#getStore_SState()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSState();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.Store#getSState <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SState</em>' attribute.
	 * @see #isSetSState()
	 * @see #unsetSState()
	 * @see #getSState()
	 * @generated
	 */
	void setSState(String value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Store#getSState <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSState()
	 * @see #getSState()
	 * @see #setSState(String)
	 * @generated
	 */
	void unsetSState();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Store#getSState <em>SState</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SState</em>' attribute is set.
	 * @see #unsetSState()
	 * @see #getSState()
	 * @see #setSState(String)
	 * @generated
	 */
	boolean isSetSState();

	/**
	 * Returns the value of the '<em><b>Store Returns</b></em>' containment reference list.
	 * The list contents are of type {@link tpcds.gen.q1.StoreReturns}.
	 * It is bidirectional and its opposite is '{@link tpcds.gen.q1.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Returns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Returns</em>' containment reference list.
	 * @see #isSetStoreReturns()
	 * @see #unsetStoreReturns()
	 * @see tpcds.gen.q1.Q1Package#getStore_StoreReturns()
	 * @see tpcds.gen.q1.StoreReturns#getSrStoreSk
	 * @model opposite="srStoreSk" containment="true" unsettable="true"
	 * @generated
	 */
	EList<StoreReturns> getStoreReturns();

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.Store#getStoreReturns <em>Store Returns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStoreReturns()
	 * @see #getStoreReturns()
	 * @generated
	 */
	void unsetStoreReturns();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.Store#getStoreReturns <em>Store Returns</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Store Returns</em>' containment reference list is set.
	 * @see #unsetStoreReturns()
	 * @see #getStoreReturns()
	 * @generated
	 */
	boolean isSetStoreReturns();

} // Store
