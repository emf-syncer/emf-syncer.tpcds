/**
 */
package tpcds.gen.q1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.gen.q1.DateDim;
import tpcds.gen.q1.Q1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Dim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.impl.DateDimImpl#getDDateSk <em>DDate Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.DateDimImpl#getDDateId <em>DDate Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.impl.DateDimImpl#getDYear <em>DYear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateDimImpl extends MinimalEObjectImpl.Container implements DateDim {
	/**
	 * The default value of the '{@link #getDDateSk() <em>DDate Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long DDATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDateSk() <em>DDate Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long dDateSk = DDATE_SK_EDEFAULT;

	/**
	 * This is true if the DDate Sk attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dDateSkESet;

	/**
	 * The default value of the '{@link #getDDateId() <em>DDate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDateId()
	 * @generated
	 * @ordered
	 */
	protected static final String DDATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDateId() <em>DDate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDateId()
	 * @generated
	 * @ordered
	 */
	protected String dDateId = DDATE_ID_EDEFAULT;

	/**
	 * This is true if the DDate Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dDateIdESet;

	/**
	 * The default value of the '{@link #getDYear() <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDYear()
	 * @generated
	 * @ordered
	 */
	protected static final Long DYEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDYear() <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDYear()
	 * @generated
	 * @ordered
	 */
	protected Long dYear = DYEAR_EDEFAULT;

	/**
	 * This is true if the DYear attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dYearESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateDimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Q1Package.Literals.DATE_DIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDDateSk() {
		return dDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDateSk(Long newDDateSk) {
		Long oldDDateSk = dDateSk;
		dDateSk = newDDateSk;
		boolean oldDDateSkESet = dDateSkESet;
		dDateSkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.DATE_DIM__DDATE_SK, oldDDateSk, dDateSk, !oldDDateSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDDateSk() {
		Long oldDDateSk = dDateSk;
		boolean oldDDateSkESet = dDateSkESet;
		dDateSk = DDATE_SK_EDEFAULT;
		dDateSkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.DATE_DIM__DDATE_SK, oldDDateSk, DDATE_SK_EDEFAULT, oldDDateSkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDDateSk() {
		return dDateSkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDDateId() {
		return dDateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDateId(String newDDateId) {
		String oldDDateId = dDateId;
		dDateId = newDDateId;
		boolean oldDDateIdESet = dDateIdESet;
		dDateIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.DATE_DIM__DDATE_ID, oldDDateId, dDateId, !oldDDateIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDDateId() {
		String oldDDateId = dDateId;
		boolean oldDDateIdESet = dDateIdESet;
		dDateId = DDATE_ID_EDEFAULT;
		dDateIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.DATE_DIM__DDATE_ID, oldDDateId, DDATE_ID_EDEFAULT, oldDDateIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDDateId() {
		return dDateIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDYear() {
		return dYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDYear(Long newDYear) {
		Long oldDYear = dYear;
		dYear = newDYear;
		boolean oldDYearESet = dYearESet;
		dYearESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q1Package.DATE_DIM__DYEAR, oldDYear, dYear, !oldDYearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDYear() {
		Long oldDYear = dYear;
		boolean oldDYearESet = dYearESet;
		dYear = DYEAR_EDEFAULT;
		dYearESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Q1Package.DATE_DIM__DYEAR, oldDYear, DYEAR_EDEFAULT, oldDYearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDYear() {
		return dYearESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Q1Package.DATE_DIM__DDATE_SK:
				return getDDateSk();
			case Q1Package.DATE_DIM__DDATE_ID:
				return getDDateId();
			case Q1Package.DATE_DIM__DYEAR:
				return getDYear();
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
			case Q1Package.DATE_DIM__DDATE_SK:
				setDDateSk((Long)newValue);
				return;
			case Q1Package.DATE_DIM__DDATE_ID:
				setDDateId((String)newValue);
				return;
			case Q1Package.DATE_DIM__DYEAR:
				setDYear((Long)newValue);
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
			case Q1Package.DATE_DIM__DDATE_SK:
				unsetDDateSk();
				return;
			case Q1Package.DATE_DIM__DDATE_ID:
				unsetDDateId();
				return;
			case Q1Package.DATE_DIM__DYEAR:
				unsetDYear();
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
			case Q1Package.DATE_DIM__DDATE_SK:
				return isSetDDateSk();
			case Q1Package.DATE_DIM__DDATE_ID:
				return isSetDDateId();
			case Q1Package.DATE_DIM__DYEAR:
				return isSetDYear();
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
		result.append(" (dDateSk: ");
		if (dDateSkESet) result.append(dDateSk); else result.append("<unset>");
		result.append(", dDateId: ");
		if (dDateIdESet) result.append(dDateId); else result.append("<unset>");
		result.append(", dYear: ");
		if (dYearESet) result.append(dYear); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateDimImpl
