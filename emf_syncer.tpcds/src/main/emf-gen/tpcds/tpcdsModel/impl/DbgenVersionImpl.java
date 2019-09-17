/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;
import java.sql.Time;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.DbgenVersion;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dbgen Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.DbgenVersionImpl#getDvVersion <em>Dv Version</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DbgenVersionImpl#getDvCreateDate <em>Dv Create Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DbgenVersionImpl#getDvCreateTime <em>Dv Create Time</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DbgenVersionImpl#getDvCmdlineArgs <em>Dv Cmdline Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbgenVersionImpl extends MinimalEObjectImpl.Container implements DbgenVersion {
	/**
	 * The default value of the '{@link #getDvVersion() <em>Dv Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DV_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDvVersion() <em>Dv Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvVersion()
	 * @generated
	 * @ordered
	 */
	protected String dvVersion = DV_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDvCreateDate() <em>Dv Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvCreateDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DV_CREATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDvCreateDate() <em>Dv Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvCreateDate()
	 * @generated
	 * @ordered
	 */
	protected Date dvCreateDate = DV_CREATE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDvCreateTime() <em>Dv Create Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvCreateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Time DV_CREATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDvCreateTime() <em>Dv Create Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvCreateTime()
	 * @generated
	 * @ordered
	 */
	protected Time dvCreateTime = DV_CREATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDvCmdlineArgs() <em>Dv Cmdline Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvCmdlineArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String DV_CMDLINE_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDvCmdlineArgs() <em>Dv Cmdline Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDvCmdlineArgs()
	 * @generated
	 * @ordered
	 */
	protected String dvCmdlineArgs = DV_CMDLINE_ARGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbgenVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.DBGEN_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDvVersion() {
		return dvVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDvVersion(String newDvVersion) {
		String oldDvVersion = dvVersion;
		dvVersion = newDvVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DBGEN_VERSION__DV_VERSION, oldDvVersion, dvVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDvCreateDate() {
		return dvCreateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDvCreateDate(Date newDvCreateDate) {
		Date oldDvCreateDate = dvCreateDate;
		dvCreateDate = newDvCreateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_DATE, oldDvCreateDate, dvCreateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getDvCreateTime() {
		return dvCreateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDvCreateTime(Time newDvCreateTime) {
		Time oldDvCreateTime = dvCreateTime;
		dvCreateTime = newDvCreateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_TIME, oldDvCreateTime, dvCreateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDvCmdlineArgs() {
		return dvCmdlineArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDvCmdlineArgs(String newDvCmdlineArgs) {
		String oldDvCmdlineArgs = dvCmdlineArgs;
		dvCmdlineArgs = newDvCmdlineArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DBGEN_VERSION__DV_CMDLINE_ARGS, oldDvCmdlineArgs, dvCmdlineArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.DBGEN_VERSION__DV_VERSION:
				return getDvVersion();
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_DATE:
				return getDvCreateDate();
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_TIME:
				return getDvCreateTime();
			case TpcdsModelPackage.DBGEN_VERSION__DV_CMDLINE_ARGS:
				return getDvCmdlineArgs();
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
			case TpcdsModelPackage.DBGEN_VERSION__DV_VERSION:
				setDvVersion((String)newValue);
				return;
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_DATE:
				setDvCreateDate((Date)newValue);
				return;
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_TIME:
				setDvCreateTime((Time)newValue);
				return;
			case TpcdsModelPackage.DBGEN_VERSION__DV_CMDLINE_ARGS:
				setDvCmdlineArgs((String)newValue);
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
			case TpcdsModelPackage.DBGEN_VERSION__DV_VERSION:
				setDvVersion(DV_VERSION_EDEFAULT);
				return;
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_DATE:
				setDvCreateDate(DV_CREATE_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_TIME:
				setDvCreateTime(DV_CREATE_TIME_EDEFAULT);
				return;
			case TpcdsModelPackage.DBGEN_VERSION__DV_CMDLINE_ARGS:
				setDvCmdlineArgs(DV_CMDLINE_ARGS_EDEFAULT);
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
			case TpcdsModelPackage.DBGEN_VERSION__DV_VERSION:
				return DV_VERSION_EDEFAULT == null ? dvVersion != null : !DV_VERSION_EDEFAULT.equals(dvVersion);
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_DATE:
				return DV_CREATE_DATE_EDEFAULT == null ? dvCreateDate != null : !DV_CREATE_DATE_EDEFAULT.equals(dvCreateDate);
			case TpcdsModelPackage.DBGEN_VERSION__DV_CREATE_TIME:
				return DV_CREATE_TIME_EDEFAULT == null ? dvCreateTime != null : !DV_CREATE_TIME_EDEFAULT.equals(dvCreateTime);
			case TpcdsModelPackage.DBGEN_VERSION__DV_CMDLINE_ARGS:
				return DV_CMDLINE_ARGS_EDEFAULT == null ? dvCmdlineArgs != null : !DV_CMDLINE_ARGS_EDEFAULT.equals(dvCmdlineArgs);
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
		result.append(" (dvVersion: ");
		result.append(dvVersion);
		result.append(", dvCreateDate: ");
		result.append(dvCreateDate);
		result.append(", dvCreateTime: ");
		result.append(dvCreateTime);
		result.append(", dvCmdlineArgs: ");
		result.append(dvCmdlineArgs);
		result.append(')');
		return result.toString();
	}

} //DbgenVersionImpl
