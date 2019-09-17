/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.ShipMode;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ship Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.ShipModeImpl#getSmShipModeSk <em>Sm Ship Mode Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ShipModeImpl#getSmShipModeId <em>Sm Ship Mode Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ShipModeImpl#getSmType <em>Sm Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ShipModeImpl#getSmCode <em>Sm Code</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ShipModeImpl#getSmCarrier <em>Sm Carrier</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ShipModeImpl#getSmContract <em>Sm Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipModeImpl extends MinimalEObjectImpl.Container implements ShipMode {
	/**
	 * The default value of the '{@link #getSmShipModeSk() <em>Sm Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SM_SHIP_MODE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmShipModeSk() <em>Sm Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected Long smShipModeSk = SM_SHIP_MODE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmShipModeId() <em>Sm Ship Mode Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmShipModeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SM_SHIP_MODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmShipModeId() <em>Sm Ship Mode Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmShipModeId()
	 * @generated
	 * @ordered
	 */
	protected String smShipModeId = SM_SHIP_MODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmType() <em>Sm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmType()
	 * @generated
	 * @ordered
	 */
	protected static final String SM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmType() <em>Sm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmType()
	 * @generated
	 * @ordered
	 */
	protected String smType = SM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmCode() <em>Sm Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmCode() <em>Sm Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmCode()
	 * @generated
	 * @ordered
	 */
	protected String smCode = SM_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmCarrier() <em>Sm Carrier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmCarrier()
	 * @generated
	 * @ordered
	 */
	protected static final String SM_CARRIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmCarrier() <em>Sm Carrier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmCarrier()
	 * @generated
	 * @ordered
	 */
	protected String smCarrier = SM_CARRIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmContract() <em>Sm Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmContract()
	 * @generated
	 * @ordered
	 */
	protected static final String SM_CONTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmContract() <em>Sm Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmContract()
	 * @generated
	 * @ordered
	 */
	protected String smContract = SM_CONTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.SHIP_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSmShipModeSk() {
		return smShipModeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmShipModeSk(Long newSmShipModeSk) {
		Long oldSmShipModeSk = smShipModeSk;
		smShipModeSk = newSmShipModeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_SK, oldSmShipModeSk, smShipModeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmShipModeId() {
		return smShipModeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmShipModeId(String newSmShipModeId) {
		String oldSmShipModeId = smShipModeId;
		smShipModeId = newSmShipModeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_ID, oldSmShipModeId, smShipModeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmType() {
		return smType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmType(String newSmType) {
		String oldSmType = smType;
		smType = newSmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.SHIP_MODE__SM_TYPE, oldSmType, smType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmCode() {
		return smCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmCode(String newSmCode) {
		String oldSmCode = smCode;
		smCode = newSmCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.SHIP_MODE__SM_CODE, oldSmCode, smCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmCarrier() {
		return smCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmCarrier(String newSmCarrier) {
		String oldSmCarrier = smCarrier;
		smCarrier = newSmCarrier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.SHIP_MODE__SM_CARRIER, oldSmCarrier, smCarrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmContract() {
		return smContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmContract(String newSmContract) {
		String oldSmContract = smContract;
		smContract = newSmContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.SHIP_MODE__SM_CONTRACT, oldSmContract, smContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_SK:
				return getSmShipModeSk();
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_ID:
				return getSmShipModeId();
			case TpcdsModelPackage.SHIP_MODE__SM_TYPE:
				return getSmType();
			case TpcdsModelPackage.SHIP_MODE__SM_CODE:
				return getSmCode();
			case TpcdsModelPackage.SHIP_MODE__SM_CARRIER:
				return getSmCarrier();
			case TpcdsModelPackage.SHIP_MODE__SM_CONTRACT:
				return getSmContract();
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
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_SK:
				setSmShipModeSk((Long)newValue);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_ID:
				setSmShipModeId((String)newValue);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_TYPE:
				setSmType((String)newValue);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_CODE:
				setSmCode((String)newValue);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_CARRIER:
				setSmCarrier((String)newValue);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_CONTRACT:
				setSmContract((String)newValue);
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
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_SK:
				setSmShipModeSk(SM_SHIP_MODE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_ID:
				setSmShipModeId(SM_SHIP_MODE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_TYPE:
				setSmType(SM_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_CODE:
				setSmCode(SM_CODE_EDEFAULT);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_CARRIER:
				setSmCarrier(SM_CARRIER_EDEFAULT);
				return;
			case TpcdsModelPackage.SHIP_MODE__SM_CONTRACT:
				setSmContract(SM_CONTRACT_EDEFAULT);
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
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_SK:
				return SM_SHIP_MODE_SK_EDEFAULT == null ? smShipModeSk != null : !SM_SHIP_MODE_SK_EDEFAULT.equals(smShipModeSk);
			case TpcdsModelPackage.SHIP_MODE__SM_SHIP_MODE_ID:
				return SM_SHIP_MODE_ID_EDEFAULT == null ? smShipModeId != null : !SM_SHIP_MODE_ID_EDEFAULT.equals(smShipModeId);
			case TpcdsModelPackage.SHIP_MODE__SM_TYPE:
				return SM_TYPE_EDEFAULT == null ? smType != null : !SM_TYPE_EDEFAULT.equals(smType);
			case TpcdsModelPackage.SHIP_MODE__SM_CODE:
				return SM_CODE_EDEFAULT == null ? smCode != null : !SM_CODE_EDEFAULT.equals(smCode);
			case TpcdsModelPackage.SHIP_MODE__SM_CARRIER:
				return SM_CARRIER_EDEFAULT == null ? smCarrier != null : !SM_CARRIER_EDEFAULT.equals(smCarrier);
			case TpcdsModelPackage.SHIP_MODE__SM_CONTRACT:
				return SM_CONTRACT_EDEFAULT == null ? smContract != null : !SM_CONTRACT_EDEFAULT.equals(smContract);
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
		result.append(" (smShipModeSk: ");
		result.append(smShipModeSk);
		result.append(", smShipModeId: ");
		result.append(smShipModeId);
		result.append(", smType: ");
		result.append(smType);
		result.append(", smCode: ");
		result.append(smCode);
		result.append(", smCarrier: ");
		result.append(smCarrier);
		result.append(", smContract: ");
		result.append(smContract);
		result.append(')');
		return result.toString();
	}

} //ShipModeImpl
