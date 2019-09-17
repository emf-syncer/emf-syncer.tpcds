/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Reason;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.ReasonImpl#getRReasonSk <em>RReason Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ReasonImpl#getRReasonId <em>RReason Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ReasonImpl#getRReasonDesc <em>RReason Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReasonImpl extends MinimalEObjectImpl.Container implements Reason {
	/**
	 * The default value of the '{@link #getRReasonSk() <em>RReason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRReasonSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long RREASON_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRReasonSk() <em>RReason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRReasonSk()
	 * @generated
	 * @ordered
	 */
	protected Long rReasonSk = RREASON_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRReasonId() <em>RReason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRReasonId()
	 * @generated
	 * @ordered
	 */
	protected static final String RREASON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRReasonId() <em>RReason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRReasonId()
	 * @generated
	 * @ordered
	 */
	protected String rReasonId = RREASON_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRReasonDesc() <em>RReason Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRReasonDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String RREASON_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRReasonDesc() <em>RReason Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRReasonDesc()
	 * @generated
	 * @ordered
	 */
	protected String rReasonDesc = RREASON_DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.REASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRReasonSk() {
		return rReasonSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRReasonSk(Long newRReasonSk) {
		Long oldRReasonSk = rReasonSk;
		rReasonSk = newRReasonSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.REASON__RREASON_SK, oldRReasonSk, rReasonSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRReasonId() {
		return rReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRReasonId(String newRReasonId) {
		String oldRReasonId = rReasonId;
		rReasonId = newRReasonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.REASON__RREASON_ID, oldRReasonId, rReasonId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRReasonDesc() {
		return rReasonDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRReasonDesc(String newRReasonDesc) {
		String oldRReasonDesc = rReasonDesc;
		rReasonDesc = newRReasonDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.REASON__RREASON_DESC, oldRReasonDesc, rReasonDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.REASON__RREASON_SK:
				return getRReasonSk();
			case TpcdsModelPackage.REASON__RREASON_ID:
				return getRReasonId();
			case TpcdsModelPackage.REASON__RREASON_DESC:
				return getRReasonDesc();
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
			case TpcdsModelPackage.REASON__RREASON_SK:
				setRReasonSk((Long)newValue);
				return;
			case TpcdsModelPackage.REASON__RREASON_ID:
				setRReasonId((String)newValue);
				return;
			case TpcdsModelPackage.REASON__RREASON_DESC:
				setRReasonDesc((String)newValue);
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
			case TpcdsModelPackage.REASON__RREASON_SK:
				setRReasonSk(RREASON_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.REASON__RREASON_ID:
				setRReasonId(RREASON_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.REASON__RREASON_DESC:
				setRReasonDesc(RREASON_DESC_EDEFAULT);
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
			case TpcdsModelPackage.REASON__RREASON_SK:
				return RREASON_SK_EDEFAULT == null ? rReasonSk != null : !RREASON_SK_EDEFAULT.equals(rReasonSk);
			case TpcdsModelPackage.REASON__RREASON_ID:
				return RREASON_ID_EDEFAULT == null ? rReasonId != null : !RREASON_ID_EDEFAULT.equals(rReasonId);
			case TpcdsModelPackage.REASON__RREASON_DESC:
				return RREASON_DESC_EDEFAULT == null ? rReasonDesc != null : !RREASON_DESC_EDEFAULT.equals(rReasonDesc);
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
		result.append(" (rReasonSk: ");
		result.append(rReasonSk);
		result.append(", rReasonId: ");
		result.append(rReasonId);
		result.append(", rReasonDesc: ");
		result.append(rReasonDesc);
		result.append(')');
		return result.toString();
	}

} //ReasonImpl
