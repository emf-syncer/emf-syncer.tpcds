/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.CustomerDemographics;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Demographics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdDemoSk <em>Cd Demo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdGender <em>Cd Gender</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdMaritalStatus <em>Cd Marital Status</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdEducationStatus <em>Cd Education Status</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdPurchaseEstimate <em>Cd Purchase Estimate</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdCreditRating <em>Cd Credit Rating</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdDepCount <em>Cd Dep Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdDepEmployedCount <em>Cd Dep Employed Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerDemographicsImpl#getCdDepCollegeCount <em>Cd Dep College Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerDemographicsImpl extends MinimalEObjectImpl.Container implements CustomerDemographics {
	/**
	 * The default value of the '{@link #getCdDemoSk() <em>Cd Demo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CD_DEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdDemoSk() <em>Cd Demo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long cdDemoSk = CD_DEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdGender() <em>Cd Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdGender()
	 * @generated
	 * @ordered
	 */
	protected static final String CD_GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdGender() <em>Cd Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdGender()
	 * @generated
	 * @ordered
	 */
	protected String cdGender = CD_GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdMaritalStatus() <em>Cd Marital Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String CD_MARITAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdMaritalStatus() <em>Cd Marital Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected String cdMaritalStatus = CD_MARITAL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdEducationStatus() <em>Cd Education Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdEducationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String CD_EDUCATION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdEducationStatus() <em>Cd Education Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdEducationStatus()
	 * @generated
	 * @ordered
	 */
	protected String cdEducationStatus = CD_EDUCATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdPurchaseEstimate() <em>Cd Purchase Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdPurchaseEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final Long CD_PURCHASE_ESTIMATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdPurchaseEstimate() <em>Cd Purchase Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdPurchaseEstimate()
	 * @generated
	 * @ordered
	 */
	protected Long cdPurchaseEstimate = CD_PURCHASE_ESTIMATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdCreditRating() <em>Cd Credit Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdCreditRating()
	 * @generated
	 * @ordered
	 */
	protected static final String CD_CREDIT_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdCreditRating() <em>Cd Credit Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdCreditRating()
	 * @generated
	 * @ordered
	 */
	protected String cdCreditRating = CD_CREDIT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdDepCount() <em>Cd Dep Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDepCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CD_DEP_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdDepCount() <em>Cd Dep Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDepCount()
	 * @generated
	 * @ordered
	 */
	protected Long cdDepCount = CD_DEP_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdDepEmployedCount() <em>Cd Dep Employed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDepEmployedCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CD_DEP_EMPLOYED_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdDepEmployedCount() <em>Cd Dep Employed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDepEmployedCount()
	 * @generated
	 * @ordered
	 */
	protected Long cdDepEmployedCount = CD_DEP_EMPLOYED_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdDepCollegeCount() <em>Cd Dep College Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDepCollegeCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CD_DEP_COLLEGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdDepCollegeCount() <em>Cd Dep College Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDepCollegeCount()
	 * @generated
	 * @ordered
	 */
	protected Long cdDepCollegeCount = CD_DEP_COLLEGE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerDemographicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.CUSTOMER_DEMOGRAPHICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCdDemoSk() {
		return cdDemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdDemoSk(Long newCdDemoSk) {
		Long oldCdDemoSk = cdDemoSk;
		cdDemoSk = newCdDemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK, oldCdDemoSk, cdDemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCdGender() {
		return cdGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdGender(String newCdGender) {
		String oldCdGender = cdGender;
		cdGender = newCdGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_GENDER, oldCdGender, cdGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCdMaritalStatus() {
		return cdMaritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdMaritalStatus(String newCdMaritalStatus) {
		String oldCdMaritalStatus = cdMaritalStatus;
		cdMaritalStatus = newCdMaritalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS, oldCdMaritalStatus, cdMaritalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCdEducationStatus() {
		return cdEducationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdEducationStatus(String newCdEducationStatus) {
		String oldCdEducationStatus = cdEducationStatus;
		cdEducationStatus = newCdEducationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS, oldCdEducationStatus, cdEducationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCdPurchaseEstimate() {
		return cdPurchaseEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdPurchaseEstimate(Long newCdPurchaseEstimate) {
		Long oldCdPurchaseEstimate = cdPurchaseEstimate;
		cdPurchaseEstimate = newCdPurchaseEstimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE, oldCdPurchaseEstimate, cdPurchaseEstimate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCdCreditRating() {
		return cdCreditRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdCreditRating(String newCdCreditRating) {
		String oldCdCreditRating = cdCreditRating;
		cdCreditRating = newCdCreditRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING, oldCdCreditRating, cdCreditRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCdDepCount() {
		return cdDepCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdDepCount(Long newCdDepCount) {
		Long oldCdDepCount = cdDepCount;
		cdDepCount = newCdDepCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT, oldCdDepCount, cdDepCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCdDepEmployedCount() {
		return cdDepEmployedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdDepEmployedCount(Long newCdDepEmployedCount) {
		Long oldCdDepEmployedCount = cdDepEmployedCount;
		cdDepEmployedCount = newCdDepEmployedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT, oldCdDepEmployedCount, cdDepEmployedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCdDepCollegeCount() {
		return cdDepCollegeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCdDepCollegeCount(Long newCdDepCollegeCount) {
		Long oldCdDepCollegeCount = cdDepCollegeCount;
		cdDepCollegeCount = newCdDepCollegeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT, oldCdDepCollegeCount, cdDepCollegeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK:
				return getCdDemoSk();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_GENDER:
				return getCdGender();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS:
				return getCdMaritalStatus();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS:
				return getCdEducationStatus();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE:
				return getCdPurchaseEstimate();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING:
				return getCdCreditRating();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT:
				return getCdDepCount();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT:
				return getCdDepEmployedCount();
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT:
				return getCdDepCollegeCount();
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
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK:
				setCdDemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_GENDER:
				setCdGender((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS:
				setCdMaritalStatus((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS:
				setCdEducationStatus((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE:
				setCdPurchaseEstimate((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING:
				setCdCreditRating((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT:
				setCdDepCount((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT:
				setCdDepEmployedCount((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT:
				setCdDepCollegeCount((Long)newValue);
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
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK:
				setCdDemoSk(CD_DEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_GENDER:
				setCdGender(CD_GENDER_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS:
				setCdMaritalStatus(CD_MARITAL_STATUS_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS:
				setCdEducationStatus(CD_EDUCATION_STATUS_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE:
				setCdPurchaseEstimate(CD_PURCHASE_ESTIMATE_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING:
				setCdCreditRating(CD_CREDIT_RATING_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT:
				setCdDepCount(CD_DEP_COUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT:
				setCdDepEmployedCount(CD_DEP_EMPLOYED_COUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT:
				setCdDepCollegeCount(CD_DEP_COLLEGE_COUNT_EDEFAULT);
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
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEMO_SK:
				return CD_DEMO_SK_EDEFAULT == null ? cdDemoSk != null : !CD_DEMO_SK_EDEFAULT.equals(cdDemoSk);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_GENDER:
				return CD_GENDER_EDEFAULT == null ? cdGender != null : !CD_GENDER_EDEFAULT.equals(cdGender);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_MARITAL_STATUS:
				return CD_MARITAL_STATUS_EDEFAULT == null ? cdMaritalStatus != null : !CD_MARITAL_STATUS_EDEFAULT.equals(cdMaritalStatus);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_EDUCATION_STATUS:
				return CD_EDUCATION_STATUS_EDEFAULT == null ? cdEducationStatus != null : !CD_EDUCATION_STATUS_EDEFAULT.equals(cdEducationStatus);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_PURCHASE_ESTIMATE:
				return CD_PURCHASE_ESTIMATE_EDEFAULT == null ? cdPurchaseEstimate != null : !CD_PURCHASE_ESTIMATE_EDEFAULT.equals(cdPurchaseEstimate);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_CREDIT_RATING:
				return CD_CREDIT_RATING_EDEFAULT == null ? cdCreditRating != null : !CD_CREDIT_RATING_EDEFAULT.equals(cdCreditRating);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COUNT:
				return CD_DEP_COUNT_EDEFAULT == null ? cdDepCount != null : !CD_DEP_COUNT_EDEFAULT.equals(cdDepCount);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_EMPLOYED_COUNT:
				return CD_DEP_EMPLOYED_COUNT_EDEFAULT == null ? cdDepEmployedCount != null : !CD_DEP_EMPLOYED_COUNT_EDEFAULT.equals(cdDepEmployedCount);
			case TpcdsModelPackage.CUSTOMER_DEMOGRAPHICS__CD_DEP_COLLEGE_COUNT:
				return CD_DEP_COLLEGE_COUNT_EDEFAULT == null ? cdDepCollegeCount != null : !CD_DEP_COLLEGE_COUNT_EDEFAULT.equals(cdDepCollegeCount);
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
		result.append(" (cdDemoSk: ");
		result.append(cdDemoSk);
		result.append(", cdGender: ");
		result.append(cdGender);
		result.append(", cdMaritalStatus: ");
		result.append(cdMaritalStatus);
		result.append(", cdEducationStatus: ");
		result.append(cdEducationStatus);
		result.append(", cdPurchaseEstimate: ");
		result.append(cdPurchaseEstimate);
		result.append(", cdCreditRating: ");
		result.append(cdCreditRating);
		result.append(", cdDepCount: ");
		result.append(cdDepCount);
		result.append(", cdDepEmployedCount: ");
		result.append(cdDepEmployedCount);
		result.append(", cdDepCollegeCount: ");
		result.append(cdDepCollegeCount);
		result.append(')');
		return result.toString();
	}

} //CustomerDemographicsImpl
