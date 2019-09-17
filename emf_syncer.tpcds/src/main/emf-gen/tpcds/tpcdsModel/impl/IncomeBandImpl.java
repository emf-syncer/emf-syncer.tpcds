/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.IncomeBand;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Income Band</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.IncomeBandImpl#getIbIncomeBandSk <em>Ib Income Band Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.IncomeBandImpl#getIbLowerBound <em>Ib Lower Bound</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.IncomeBandImpl#getIbUpperBound <em>Ib Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomeBandImpl extends MinimalEObjectImpl.Container implements IncomeBand {
	/**
	 * The default value of the '{@link #getIbIncomeBandSk() <em>Ib Income Band Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbIncomeBandSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long IB_INCOME_BAND_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIbIncomeBandSk() <em>Ib Income Band Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbIncomeBandSk()
	 * @generated
	 * @ordered
	 */
	protected Long ibIncomeBandSk = IB_INCOME_BAND_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIbLowerBound() <em>Ib Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long IB_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIbLowerBound() <em>Ib Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Long ibLowerBound = IB_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIbUpperBound() <em>Ib Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long IB_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIbUpperBound() <em>Ib Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIbUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Long ibUpperBound = IB_UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomeBandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.INCOME_BAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIbIncomeBandSk() {
		return ibIncomeBandSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIbIncomeBandSk(Long newIbIncomeBandSk) {
		Long oldIbIncomeBandSk = ibIncomeBandSk;
		ibIncomeBandSk = newIbIncomeBandSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INCOME_BAND__IB_INCOME_BAND_SK, oldIbIncomeBandSk, ibIncomeBandSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIbLowerBound() {
		return ibLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIbLowerBound(Long newIbLowerBound) {
		Long oldIbLowerBound = ibLowerBound;
		ibLowerBound = newIbLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INCOME_BAND__IB_LOWER_BOUND, oldIbLowerBound, ibLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIbUpperBound() {
		return ibUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIbUpperBound(Long newIbUpperBound) {
		Long oldIbUpperBound = ibUpperBound;
		ibUpperBound = newIbUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.INCOME_BAND__IB_UPPER_BOUND, oldIbUpperBound, ibUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.INCOME_BAND__IB_INCOME_BAND_SK:
				return getIbIncomeBandSk();
			case TpcdsModelPackage.INCOME_BAND__IB_LOWER_BOUND:
				return getIbLowerBound();
			case TpcdsModelPackage.INCOME_BAND__IB_UPPER_BOUND:
				return getIbUpperBound();
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
			case TpcdsModelPackage.INCOME_BAND__IB_INCOME_BAND_SK:
				setIbIncomeBandSk((Long)newValue);
				return;
			case TpcdsModelPackage.INCOME_BAND__IB_LOWER_BOUND:
				setIbLowerBound((Long)newValue);
				return;
			case TpcdsModelPackage.INCOME_BAND__IB_UPPER_BOUND:
				setIbUpperBound((Long)newValue);
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
			case TpcdsModelPackage.INCOME_BAND__IB_INCOME_BAND_SK:
				setIbIncomeBandSk(IB_INCOME_BAND_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.INCOME_BAND__IB_LOWER_BOUND:
				setIbLowerBound(IB_LOWER_BOUND_EDEFAULT);
				return;
			case TpcdsModelPackage.INCOME_BAND__IB_UPPER_BOUND:
				setIbUpperBound(IB_UPPER_BOUND_EDEFAULT);
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
			case TpcdsModelPackage.INCOME_BAND__IB_INCOME_BAND_SK:
				return IB_INCOME_BAND_SK_EDEFAULT == null ? ibIncomeBandSk != null : !IB_INCOME_BAND_SK_EDEFAULT.equals(ibIncomeBandSk);
			case TpcdsModelPackage.INCOME_BAND__IB_LOWER_BOUND:
				return IB_LOWER_BOUND_EDEFAULT == null ? ibLowerBound != null : !IB_LOWER_BOUND_EDEFAULT.equals(ibLowerBound);
			case TpcdsModelPackage.INCOME_BAND__IB_UPPER_BOUND:
				return IB_UPPER_BOUND_EDEFAULT == null ? ibUpperBound != null : !IB_UPPER_BOUND_EDEFAULT.equals(ibUpperBound);
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
		result.append(" (ibIncomeBandSk: ");
		result.append(ibIncomeBandSk);
		result.append(", ibLowerBound: ");
		result.append(ibLowerBound);
		result.append(", ibUpperBound: ");
		result.append(ibUpperBound);
		result.append(')');
		return result.toString();
	}

} //IncomeBandImpl
