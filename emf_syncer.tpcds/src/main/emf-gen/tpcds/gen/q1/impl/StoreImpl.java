/**
 */
package tpcds.gen.q1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tpcds.gen.q1.Q1Package;
import tpcds.gen.q1.Store;
import tpcds.gen.q1.StoreReturns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.impl.StoreImpl#getSStoreSk <em>SStore Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreImpl#getSStoreId <em>SStore Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreImpl#getSState <em>SState</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.StoreImpl#getStoreReturns <em>Store Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store {
	/**
	 * The default value of the '{@link #getSStoreSk() <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SSTORE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStoreSk() <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreSk()
	 * @generated
	 * @ordered
	 */
	protected Long sStoreSk = SSTORE_SK_EDEFAULT;

	/**
	 * This is true if the SStore Sk attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sStoreSkESet;

	/**
	 * The default value of the '{@link #getSStoreId() <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSStoreId() <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSStoreId()
	 * @generated
	 * @ordered
	 */
	protected String sStoreId = SSTORE_ID_EDEFAULT;

	/**
	 * This is true if the SStore Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sStoreIdESet;

	/**
	 * The default value of the '{@link #getSState() <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSState()
	 * @generated
	 * @ordered
	 */
	protected static final String SSTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSState() <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSState()
	 * @generated
	 * @ordered
	 */
	protected String sState = SSTATE_EDEFAULT;

	/**
	 * This is true if the SState attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sStateESet;

	/**
	 * The cached value of the '{@link #getStoreReturns() <em>Store Returns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreReturns()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreReturns> storeReturns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Q1Package.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSStoreSk() {
		return sStoreSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSStoreSk(Long newSStoreSk) {
		Long oldSStoreSk = sStoreSk;
		sStoreSk = newSStoreSk;
		boolean oldSStoreSkESet = sStoreSkESet;
		sStoreSkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE__SSTORE_SK, oldSStoreSk, sStoreSk, !oldSStoreSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSStoreSk() {
		Long oldSStoreSk = sStoreSk;
		boolean oldSStoreSkESet = sStoreSkESet;
		sStoreSk = SSTORE_SK_EDEFAULT;
		sStoreSkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE__SSTORE_SK, oldSStoreSk, SSTORE_SK_EDEFAULT, oldSStoreSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSStoreSk() {
		return sStoreSkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSStoreId() {
		return sStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSStoreId(String newSStoreId) {
		String oldSStoreId = sStoreId;
		sStoreId = newSStoreId;
		boolean oldSStoreIdESet = sStoreIdESet;
		sStoreIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE__SSTORE_ID, oldSStoreId, sStoreId, !oldSStoreIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSStoreId() {
		String oldSStoreId = sStoreId;
		boolean oldSStoreIdESet = sStoreIdESet;
		sStoreId = SSTORE_ID_EDEFAULT;
		sStoreIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE__SSTORE_ID, oldSStoreId, SSTORE_ID_EDEFAULT, oldSStoreIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSStoreId() {
		return sStoreIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSState() {
		return sState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSState(String newSState) {
		String oldSState = sState;
		sState = newSState;
		boolean oldSStateESet = sStateESet;
		sStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.STORE__SSTATE, oldSState, sState, !oldSStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSState() {
		String oldSState = sState;
		boolean oldSStateESet = sStateESet;
		sState = SSTATE_EDEFAULT;
		sStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.STORE__SSTATE, oldSState, SSTATE_EDEFAULT, oldSStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSState() {
		return sStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoreReturns> getStoreReturns() {
		if (storeReturns == null) {
			storeReturns = new EObjectContainmentWithInverseEList.Unsettable<StoreReturns>(StoreReturns.class, this, Q1Package.STORE__STORE_RETURNS, Q1Package.STORE_RETURNS__SR_STORE_SK);
		}
		return storeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStoreReturns() {
		if (storeReturns != null) ((InternalEList.Unsettable<?>)storeReturns).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStoreReturns() {
		return storeReturns != null && ((InternalEList.Unsettable<?>)storeReturns).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Q1Package.STORE__STORE_RETURNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoreReturns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Q1Package.STORE__STORE_RETURNS:
				return ((InternalEList<?>)getStoreReturns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Q1Package.STORE__SSTORE_SK:
				return getSStoreSk();
			case Q1Package.STORE__SSTORE_ID:
				return getSStoreId();
			case Q1Package.STORE__SSTATE:
				return getSState();
			case Q1Package.STORE__STORE_RETURNS:
				return getStoreReturns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Q1Package.STORE__SSTORE_SK:
				setSStoreSk((Long)newValue);
				return;
			case Q1Package.STORE__SSTORE_ID:
				setSStoreId((String)newValue);
				return;
			case Q1Package.STORE__SSTATE:
				setSState((String)newValue);
				return;
			case Q1Package.STORE__STORE_RETURNS:
				getStoreReturns().clear();
				getStoreReturns().addAll((Collection<? extends StoreReturns>)newValue);
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
			case Q1Package.STORE__SSTORE_SK:
				unsetSStoreSk();
				return;
			case Q1Package.STORE__SSTORE_ID:
				unsetSStoreId();
				return;
			case Q1Package.STORE__SSTATE:
				unsetSState();
				return;
			case Q1Package.STORE__STORE_RETURNS:
				unsetStoreReturns();
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
			case Q1Package.STORE__SSTORE_SK:
				return isSetSStoreSk();
			case Q1Package.STORE__SSTORE_ID:
				return isSetSStoreId();
			case Q1Package.STORE__SSTATE:
				return isSetSState();
			case Q1Package.STORE__STORE_RETURNS:
				return isSetStoreReturns();
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
		result.append(" (sStoreSk: ");
		if (sStoreSkESet) result.append(sStoreSk); else result.append("<unset>");
		result.append(", sStoreId: ");
		if (sStoreIdESet) result.append(sStoreId); else result.append("<unset>");
		result.append(", sState: ");
		if (sStateESet) result.append(sState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StoreImpl
