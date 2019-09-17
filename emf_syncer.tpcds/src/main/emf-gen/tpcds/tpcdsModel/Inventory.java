/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.Inventory#getInvDateSk <em>Inv Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Inventory#getInvItemSk <em>Inv Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Inventory#getInvWarehouseSk <em>Inv Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Inventory#getInvQuantityOnHand <em>Inv Quantity On Hand</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getInventory()
 * @model
 * @generated
 */
public interface Inventory extends EObject {
	/**
	 * Returns the value of the '<em><b>Inv Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Date Sk</em>' attribute.
	 * @see #setInvDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getInventory_InvDateSk()
	 * @model
	 * @generated
	 */
	Long getInvDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Inventory#getInvDateSk <em>Inv Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Date Sk</em>' attribute.
	 * @see #getInvDateSk()
	 * @generated
	 */
	void setInvDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Inv Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Item Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Item Sk</em>' attribute.
	 * @see #setInvItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getInventory_InvItemSk()
	 * @model
	 * @generated
	 */
	Long getInvItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Inventory#getInvItemSk <em>Inv Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Item Sk</em>' attribute.
	 * @see #getInvItemSk()
	 * @generated
	 */
	void setInvItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>Inv Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Warehouse Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Warehouse Sk</em>' attribute.
	 * @see #setInvWarehouseSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getInventory_InvWarehouseSk()
	 * @model
	 * @generated
	 */
	Long getInvWarehouseSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Inventory#getInvWarehouseSk <em>Inv Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Warehouse Sk</em>' attribute.
	 * @see #getInvWarehouseSk()
	 * @generated
	 */
	void setInvWarehouseSk(Long value);

	/**
	 * Returns the value of the '<em><b>Inv Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Quantity On Hand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Quantity On Hand</em>' attribute.
	 * @see #setInvQuantityOnHand(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getInventory_InvQuantityOnHand()
	 * @model
	 * @generated
	 */
	Long getInvQuantityOnHand();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Inventory#getInvQuantityOnHand <em>Inv Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Quantity On Hand</em>' attribute.
	 * @see #getInvQuantityOnHand()
	 * @generated
	 */
	void setInvQuantityOnHand(Long value);

} // Inventory
