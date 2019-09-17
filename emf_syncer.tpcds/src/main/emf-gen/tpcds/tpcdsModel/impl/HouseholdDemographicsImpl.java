/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.HouseholdDemographics;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Household Demographics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl#getHdDemoSk <em>Hd Demo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl#getHdIncomeBandSk <em>Hd Income Band Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl#getHdBuyPotential <em>Hd Buy Potential</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl#getHdDepCount <em>Hd Dep Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.HouseholdDemographicsImpl#getHdVehicleCount <em>Hd Vehicle Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseholdDemographicsImpl extends MinimalEObjectImpl.Container implements HouseholdDemographics {
	/**
	 * The default value of the '{@link #getHdDemoSk() <em>Hd Demo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdDemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long HD_DEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdDemoSk() <em>Hd Demo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdDemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long hdDemoSk = HD_DEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdIncomeBandSk() <em>Hd Income Band Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdIncomeBandSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long HD_INCOME_BAND_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdIncomeBandSk() <em>Hd Income Band Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdIncomeBandSk()
	 * @generated
	 * @ordered
	 */
	protected Long hdIncomeBandSk = HD_INCOME_BAND_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdBuyPotential() <em>Hd Buy Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdBuyPotential()
	 * @generated
	 * @ordered
	 */
	protected static final String HD_BUY_POTENTIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdBuyPotential() <em>Hd Buy Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdBuyPotential()
	 * @generated
	 * @ordered
	 */
	protected String hdBuyPotential = HD_BUY_POTENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdDepCount() <em>Hd Dep Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdDepCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long HD_DEP_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdDepCount() <em>Hd Dep Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdDepCount()
	 * @generated
	 * @ordered
	 */
	protected Long hdDepCount = HD_DEP_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdVehicleCount() <em>Hd Vehicle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdVehicleCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long HD_VEHICLE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdVehicleCount() <em>Hd Vehicle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdVehicleCount()
	 * @generated
	 * @ordered
	 */
	protected Long hdVehicleCount = HD_VEHICLE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseholdDemographicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.HOUSEHOLD_DEMOGRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHdDemoSk() {
		return hdDemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdDemoSk(Long newHdDemoSk) {
		Long oldHdDemoSk = hdDemoSk;
		hdDemoSk = newHdDemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK, oldHdDemoSk, hdDemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHdIncomeBandSk() {
		return hdIncomeBandSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdIncomeBandSk(Long newHdIncomeBandSk) {
		Long oldHdIncomeBandSk = hdIncomeBandSk;
		hdIncomeBandSk = newHdIncomeBandSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK, oldHdIncomeBandSk, hdIncomeBandSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHdBuyPotential() {
		return hdBuyPotential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdBuyPotential(String newHdBuyPotential) {
		String oldHdBuyPotential = hdBuyPotential;
		hdBuyPotential = newHdBuyPotential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL, oldHdBuyPotential, hdBuyPotential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHdDepCount() {
		return hdDepCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdDepCount(Long newHdDepCount) {
		Long oldHdDepCount = hdDepCount;
		hdDepCount = newHdDepCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT, oldHdDepCount, hdDepCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHdVehicleCount() {
		return hdVehicleCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHdVehicleCount(Long newHdVehicleCount) {
		Long oldHdVehicleCount = hdVehicleCount;
		hdVehicleCount = newHdVehicleCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT, oldHdVehicleCount, hdVehicleCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK:
				return getHdDemoSk();
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK:
				return getHdIncomeBandSk();
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL:
				return getHdBuyPotential();
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT:
				return getHdDepCount();
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT:
				return getHdVehicleCount();
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
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK:
				setHdDemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK:
				setHdIncomeBandSk((Long)newValue);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL:
				setHdBuyPotential((String)newValue);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT:
				setHdDepCount((Long)newValue);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT:
				setHdVehicleCount((Long)newValue);
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
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK:
				setHdDemoSk(HD_DEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK:
				setHdIncomeBandSk(HD_INCOME_BAND_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL:
				setHdBuyPotential(HD_BUY_POTENTIAL_EDEFAULT);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT:
				setHdDepCount(HD_DEP_COUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT:
				setHdVehicleCount(HD_VEHICLE_COUNT_EDEFAULT);
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
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEMO_SK:
				return HD_DEMO_SK_EDEFAULT == null ? hdDemoSk != null : !HD_DEMO_SK_EDEFAULT.equals(hdDemoSk);
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_INCOME_BAND_SK:
				return HD_INCOME_BAND_SK_EDEFAULT == null ? hdIncomeBandSk != null : !HD_INCOME_BAND_SK_EDEFAULT.equals(hdIncomeBandSk);
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_BUY_POTENTIAL:
				return HD_BUY_POTENTIAL_EDEFAULT == null ? hdBuyPotential != null : !HD_BUY_POTENTIAL_EDEFAULT.equals(hdBuyPotential);
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_DEP_COUNT:
				return HD_DEP_COUNT_EDEFAULT == null ? hdDepCount != null : !HD_DEP_COUNT_EDEFAULT.equals(hdDepCount);
			case TpcdsModelPackage.HOUSEHOLD_DEMOGRAPHICS__HD_VEHICLE_COUNT:
				return HD_VEHICLE_COUNT_EDEFAULT == null ? hdVehicleCount != null : !HD_VEHICLE_COUNT_EDEFAULT.equals(hdVehicleCount);
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
		result.append(" (hdDemoSk: ");
		result.append(hdDemoSk);
		result.append(", hdIncomeBandSk: ");
		result.append(hdIncomeBandSk);
		result.append(", hdBuyPotential: ");
		result.append(hdBuyPotential);
		result.append(", hdDepCount: ");
		result.append(hdDepCount);
		result.append(", hdVehicleCount: ");
		result.append(hdVehicleCount);
		result.append(')');
		return result.toString();
	}

} //HouseholdDemographicsImpl
