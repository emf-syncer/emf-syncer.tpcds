/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Inventory;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.InventoryImpl#getInvDateSk <em>Inv Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.InventoryImpl#getInvItemSk <em>Inv Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.InventoryImpl#getInvWarehouseSk <em>Inv Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.InventoryImpl#getInvQuantityOnHand <em>Inv Quantity On Hand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
	/**
	 * The default value of the '{@link #getInvDateSk() <em>Inv Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long INV_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvDateSk() <em>Inv Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long invDateSk = INV_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvItemSk() <em>Inv Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long INV_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvItemSk() <em>Inv Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long invItemSk = INV_ITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvWarehouseSk() <em>Inv Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long INV_WAREHOUSE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvWarehouseSk() <em>Inv Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected Long invWarehouseSk = INV_WAREHOUSE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvQuantityOnHand() <em>Inv Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvQuantityOnHand()
	 * @generated
	 * @ordered
	 */
	protected static final Long INV_QUANTITY_ON_HAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvQuantityOnHand() <em>Inv Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvQuantityOnHand()
	 * @generated
	 * @ordered
	 */
	protected Long invQuantityOnHand = INV_QUANTITY_ON_HAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInvDateSk() {
		return invDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvDateSk(Long newInvDateSk) {
		Long oldInvDateSk = invDateSk;
		invDateSk = newInvDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INVENTORY__INV_DATE_SK, oldInvDateSk, invDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInvItemSk() {
		return invItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvItemSk(Long newInvItemSk) {
		Long oldInvItemSk = invItemSk;
		invItemSk = newInvItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INVENTORY__INV_ITEM_SK, oldInvItemSk, invItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInvWarehouseSk() {
		return invWarehouseSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvWarehouseSk(Long newInvWarehouseSk) {
		Long oldInvWarehouseSk = invWarehouseSk;
		invWarehouseSk = newInvWarehouseSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INVENTORY__INV_WAREHOUSE_SK, oldInvWarehouseSk, invWarehouseSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInvQuantityOnHand() {
		return invQuantityOnHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvQuantityOnHand(Long newInvQuantityOnHand) {
		Long oldInvQuantityOnHand = invQuantityOnHand;
		invQuantityOnHand = newInvQuantityOnHand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INVENTORY__INV_QUANTITY_ON_HAND, oldInvQuantityOnHand, invQuantityOnHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.INVENTORY__INV_DATE_SK:
				return getInvDateSk();
			case TpcdsModelPackage.INVENTORY__INV_ITEM_SK:
				return getInvItemSk();
			case TpcdsModelPackage.INVENTORY__INV_WAREHOUSE_SK:
				return getInvWarehouseSk();
			case TpcdsModelPackage.INVENTORY__INV_QUANTITY_ON_HAND:
				return getInvQuantityOnHand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TpcdsModelPackage.INVENTORY__INV_DATE_SK:
				setInvDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.INVENTORY__INV_ITEM_SK:
				setInvItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.INVENTORY__INV_WAREHOUSE_SK:
				setInvWarehouseSk((Long)newValue);
				return;
			case TpcdsModelPackage.INVENTORY__INV_QUANTITY_ON_HAND:
				setInvQuantityOnHand((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TpcdsModelPackage.INVENTORY__INV_DATE_SK:
				setInvDateSk(INV_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.INVENTORY__INV_ITEM_SK:
				setInvItemSk(INV_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.INVENTORY__INV_WAREHOUSE_SK:
				setInvWarehouseSk(INV_WAREHOUSE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.INVENTORY__INV_QUANTITY_ON_HAND:
				setInvQuantityOnHand(INV_QUANTITY_ON_HAND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TpcdsModelPackage.INVENTORY__INV_DATE_SK:
				return INV_DATE_SK_EDEFAULT == null ? invDateSk != null : !INV_DATE_SK_EDEFAULT.equals(invDateSk);
			case TpcdsModelPackage.INVENTORY__INV_ITEM_SK:
				return INV_ITEM_SK_EDEFAULT == null ? invItemSk != null : !INV_ITEM_SK_EDEFAULT.equals(invItemSk);
			case TpcdsModelPackage.INVENTORY__INV_WAREHOUSE_SK:
				return INV_WAREHOUSE_SK_EDEFAULT == null ? invWarehouseSk != null : !INV_WAREHOUSE_SK_EDEFAULT.equals(invWarehouseSk);
			case TpcdsModelPackage.INVENTORY__INV_QUANTITY_ON_HAND:
				return INV_QUANTITY_ON_HAND_EDEFAULT == null ? invQuantityOnHand != null : !INV_QUANTITY_ON_HAND_EDEFAULT.equals(invQuantityOnHand);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (invDateSk: ");
		result.append(invDateSk);
		result.append(", invItemSk: ");
		result.append(invItemSk);
		result.append(", invWarehouseSk: ");
		result.append(invWarehouseSk);
		result.append(", invQuantityOnHand: ");
		result.append(invQuantityOnHand);
		result.append(')');
		return result.toString();
	}

} //InventoryImpl
