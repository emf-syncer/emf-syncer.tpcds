/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.TimeDim;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Dim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTTimeSk <em>TTime Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTTimeId <em>TTime Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTTime <em>TTime</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTHour <em>THour</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTMinute <em>TMinute</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTSecond <em>TSecond</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTAmPm <em>TAm Pm</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTShift <em>TShift</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTSubShift <em>TSub Shift</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.TimeDimImpl#getTMealTime <em>TMeal Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeDimImpl extends MinimalEObjectImpl.Container implements TimeDim {
	/**
	 * The default value of the '{@link #getTTimeSk() <em>TTime Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long TTIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTTimeSk() <em>TTime Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long tTimeSk = TTIME_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTTimeId() <em>TTime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTimeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TTIME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTTimeId() <em>TTime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTimeId()
	 * @generated
	 * @ordered
	 */
	protected String tTimeId = TTIME_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTTime() <em>TTime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long TTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTTime() <em>TTime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTime()
	 * @generated
	 * @ordered
	 */
	protected Long tTime = TTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTHour() <em>THour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHour()
	 * @generated
	 * @ordered
	 */
	protected static final Long THOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTHour() <em>THour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHour()
	 * @generated
	 * @ordered
	 */
	protected Long tHour = THOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTMinute() <em>TMinute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMinute()
	 * @generated
	 * @ordered
	 */
	protected static final Long TMINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTMinute() <em>TMinute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMinute()
	 * @generated
	 * @ordered
	 */
	protected Long tMinute = TMINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTSecond() <em>TSecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Long TSECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTSecond() <em>TSecond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSecond()
	 * @generated
	 * @ordered
	 */
	protected Long tSecond = TSECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTAmPm() <em>TAm Pm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAmPm()
	 * @generated
	 * @ordered
	 */
	protected static final String TAM_PM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTAmPm() <em>TAm Pm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTAmPm()
	 * @generated
	 * @ordered
	 */
	protected String tAmPm = TAM_PM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTShift() <em>TShift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTShift()
	 * @generated
	 * @ordered
	 */
	protected static final String TSHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTShift() <em>TShift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTShift()
	 * @generated
	 * @ordered
	 */
	protected String tShift = TSHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTSubShift() <em>TSub Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSubShift()
	 * @generated
	 * @ordered
	 */
	protected static final String TSUB_SHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTSubShift() <em>TSub Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSubShift()
	 * @generated
	 * @ordered
	 */
	protected String tSubShift = TSUB_SHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTMealTime() <em>TMeal Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMealTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TMEAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTMealTime() <em>TMeal Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMealTime()
	 * @generated
	 * @ordered
	 */
	protected String tMealTime = TMEAL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.TIME_DIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTTimeSk() {
		return tTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTTimeSk(Long newTTimeSk) {
		Long oldTTimeSk = tTimeSk;
		tTimeSk = newTTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TTIME_SK, oldTTimeSk, tTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTTimeId() {
		return tTimeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTTimeId(String newTTimeId) {
		String oldTTimeId = tTimeId;
		tTimeId = newTTimeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TTIME_ID, oldTTimeId, tTimeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTTime() {
		return tTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTTime(Long newTTime) {
		Long oldTTime = tTime;
		tTime = newTTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TTIME, oldTTime, tTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTHour() {
		return tHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTHour(Long newTHour) {
		Long oldTHour = tHour;
		tHour = newTHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__THOUR, oldTHour, tHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTMinute() {
		return tMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTMinute(Long newTMinute) {
		Long oldTMinute = tMinute;
		tMinute = newTMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TMINUTE, oldTMinute, tMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTSecond() {
		return tSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTSecond(Long newTSecond) {
		Long oldTSecond = tSecond;
		tSecond = newTSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TSECOND, oldTSecond, tSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTAmPm() {
		return tAmPm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTAmPm(String newTAmPm) {
		String oldTAmPm = tAmPm;
		tAmPm = newTAmPm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TAM_PM, oldTAmPm, tAmPm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTShift() {
		return tShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTShift(String newTShift) {
		String oldTShift = tShift;
		tShift = newTShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TSHIFT, oldTShift, tShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTSubShift() {
		return tSubShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTSubShift(String newTSubShift) {
		String oldTSubShift = tSubShift;
		tSubShift = newTSubShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TSUB_SHIFT, oldTSubShift, tSubShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTMealTime() {
		return tMealTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTMealTime(String newTMealTime) {
		String oldTMealTime = tMealTime;
		tMealTime = newTMealTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.TIME_DIM__TMEAL_TIME, oldTMealTime, tMealTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.TIME_DIM__TTIME_SK:
				return getTTimeSk();
			case TpcdsModelPackage.TIME_DIM__TTIME_ID:
				return getTTimeId();
			case TpcdsModelPackage.TIME_DIM__TTIME:
				return getTTime();
			case TpcdsModelPackage.TIME_DIM__THOUR:
				return getTHour();
			case TpcdsModelPackage.TIME_DIM__TMINUTE:
				return getTMinute();
			case TpcdsModelPackage.TIME_DIM__TSECOND:
				return getTSecond();
			case TpcdsModelPackage.TIME_DIM__TAM_PM:
				return getTAmPm();
			case TpcdsModelPackage.TIME_DIM__TSHIFT:
				return getTShift();
			case TpcdsModelPackage.TIME_DIM__TSUB_SHIFT:
				return getTSubShift();
			case TpcdsModelPackage.TIME_DIM__TMEAL_TIME:
				return getTMealTime();
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
			case TpcdsModelPackage.TIME_DIM__TTIME_SK:
				setTTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TTIME_ID:
				setTTimeId((String)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TTIME:
				setTTime((Long)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__THOUR:
				setTHour((Long)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TMINUTE:
				setTMinute((Long)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TSECOND:
				setTSecond((Long)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TAM_PM:
				setTAmPm((String)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TSHIFT:
				setTShift((String)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TSUB_SHIFT:
				setTSubShift((String)newValue);
				return;
			case TpcdsModelPackage.TIME_DIM__TMEAL_TIME:
				setTMealTime((String)newValue);
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
			case TpcdsModelPackage.TIME_DIM__TTIME_SK:
				setTTimeSk(TTIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TTIME_ID:
				setTTimeId(TTIME_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TTIME:
				setTTime(TTIME_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__THOUR:
				setTHour(THOUR_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TMINUTE:
				setTMinute(TMINUTE_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TSECOND:
				setTSecond(TSECOND_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TAM_PM:
				setTAmPm(TAM_PM_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TSHIFT:
				setTShift(TSHIFT_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TSUB_SHIFT:
				setTSubShift(TSUB_SHIFT_EDEFAULT);
				return;
			case TpcdsModelPackage.TIME_DIM__TMEAL_TIME:
				setTMealTime(TMEAL_TIME_EDEFAULT);
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
			case TpcdsModelPackage.TIME_DIM__TTIME_SK:
				return TTIME_SK_EDEFAULT == null ? tTimeSk != null : !TTIME_SK_EDEFAULT.equals(tTimeSk);
			case TpcdsModelPackage.TIME_DIM__TTIME_ID:
				return TTIME_ID_EDEFAULT == null ? tTimeId != null : !TTIME_ID_EDEFAULT.equals(tTimeId);
			case TpcdsModelPackage.TIME_DIM__TTIME:
				return TTIME_EDEFAULT == null ? tTime != null : !TTIME_EDEFAULT.equals(tTime);
			case TpcdsModelPackage.TIME_DIM__THOUR:
				return THOUR_EDEFAULT == null ? tHour != null : !THOUR_EDEFAULT.equals(tHour);
			case TpcdsModelPackage.TIME_DIM__TMINUTE:
				return TMINUTE_EDEFAULT == null ? tMinute != null : !TMINUTE_EDEFAULT.equals(tMinute);
			case TpcdsModelPackage.TIME_DIM__TSECOND:
				return TSECOND_EDEFAULT == null ? tSecond != null : !TSECOND_EDEFAULT.equals(tSecond);
			case TpcdsModelPackage.TIME_DIM__TAM_PM:
				return TAM_PM_EDEFAULT == null ? tAmPm != null : !TAM_PM_EDEFAULT.equals(tAmPm);
			case TpcdsModelPackage.TIME_DIM__TSHIFT:
				return TSHIFT_EDEFAULT == null ? tShift != null : !TSHIFT_EDEFAULT.equals(tShift);
			case TpcdsModelPackage.TIME_DIM__TSUB_SHIFT:
				return TSUB_SHIFT_EDEFAULT == null ? tSubShift != null : !TSUB_SHIFT_EDEFAULT.equals(tSubShift);
			case TpcdsModelPackage.TIME_DIM__TMEAL_TIME:
				return TMEAL_TIME_EDEFAULT == null ? tMealTime != null : !TMEAL_TIME_EDEFAULT.equals(tMealTime);
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
		result.append(" (tTimeSk: ");
		result.append(tTimeSk);
		result.append(", tTimeId: ");
		result.append(tTimeId);
		result.append(", tTime: ");
		result.append(tTime);
		result.append(", tHour: ");
		result.append(tHour);
		result.append(", tMinute: ");
		result.append(tMinute);
		result.append(", tSecond: ");
		result.append(tSecond);
		result.append(", tAmPm: ");
		result.append(tAmPm);
		result.append(", tShift: ");
		result.append(tShift);
		result.append(", tSubShift: ");
		result.append(tSubShift);
		result.append(", tMealTime: ");
		result.append(tMealTime);
		result.append(')');
		return result.toString();
	}

} //TimeDimImpl
