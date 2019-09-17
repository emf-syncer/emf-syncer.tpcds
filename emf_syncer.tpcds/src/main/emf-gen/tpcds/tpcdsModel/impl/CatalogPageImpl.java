/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.CatalogPage;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpCatalogPageSk <em>Cp Catalog Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpCatalogPageId <em>Cp Catalog Page Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpStartDateSk <em>Cp Start Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpEndDateSk <em>Cp End Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpDepartment <em>Cp Department</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpCatalogNumber <em>Cp Catalog Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpCatalogPageNumber <em>Cp Catalog Page Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpDescription <em>Cp Description</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogPageImpl#getCpType <em>Cp Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogPageImpl extends MinimalEObjectImpl.Container implements CatalogPage {
	/**
	 * The default value of the '{@link #getCpCatalogPageSk() <em>Cp Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogPageSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CP_CATALOG_PAGE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpCatalogPageSk() <em>Cp Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogPageSk()
	 * @generated
	 * @ordered
	 */
	protected Long cpCatalogPageSk = CP_CATALOG_PAGE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpCatalogPageId() <em>Cp Catalog Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_CATALOG_PAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpCatalogPageId() <em>Cp Catalog Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogPageId()
	 * @generated
	 * @ordered
	 */
	protected String cpCatalogPageId = CP_CATALOG_PAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpStartDateSk() <em>Cp Start Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpStartDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CP_START_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpStartDateSk() <em>Cp Start Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpStartDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long cpStartDateSk = CP_START_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpEndDateSk() <em>Cp End Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpEndDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CP_END_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpEndDateSk() <em>Cp End Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpEndDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long cpEndDateSk = CP_END_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpDepartment() <em>Cp Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_DEPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpDepartment() <em>Cp Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpDepartment()
	 * @generated
	 * @ordered
	 */
	protected String cpDepartment = CP_DEPARTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpCatalogNumber() <em>Cp Catalog Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long CP_CATALOG_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpCatalogNumber() <em>Cp Catalog Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogNumber()
	 * @generated
	 * @ordered
	 */
	protected Long cpCatalogNumber = CP_CATALOG_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpCatalogPageNumber() <em>Cp Catalog Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long CP_CATALOG_PAGE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpCatalogPageNumber() <em>Cp Catalog Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpCatalogPageNumber()
	 * @generated
	 * @ordered
	 */
	protected Long cpCatalogPageNumber = CP_CATALOG_PAGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpDescription() <em>Cp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpDescription() <em>Cp Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpDescription()
	 * @generated
	 * @ordered
	 */
	protected String cpDescription = CP_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpType() <em>Cp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpType()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpType() <em>Cp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpType()
	 * @generated
	 * @ordered
	 */
	protected String cpType = CP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.CATALOG_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCpCatalogPageSk() {
		return cpCatalogPageSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpCatalogPageSk(Long newCpCatalogPageSk) {
		Long oldCpCatalogPageSk = cpCatalogPageSk;
		cpCatalogPageSk = newCpCatalogPageSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_SK, oldCpCatalogPageSk, cpCatalogPageSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpCatalogPageId() {
		return cpCatalogPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpCatalogPageId(String newCpCatalogPageId) {
		String oldCpCatalogPageId = cpCatalogPageId;
		cpCatalogPageId = newCpCatalogPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_ID, oldCpCatalogPageId, cpCatalogPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCpStartDateSk() {
		return cpStartDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpStartDateSk(Long newCpStartDateSk) {
		Long oldCpStartDateSk = cpStartDateSk;
		cpStartDateSk = newCpStartDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_START_DATE_SK, oldCpStartDateSk, cpStartDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCpEndDateSk() {
		return cpEndDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpEndDateSk(Long newCpEndDateSk) {
		Long oldCpEndDateSk = cpEndDateSk;
		cpEndDateSk = newCpEndDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_END_DATE_SK, oldCpEndDateSk, cpEndDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpDepartment() {
		return cpDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpDepartment(String newCpDepartment) {
		String oldCpDepartment = cpDepartment;
		cpDepartment = newCpDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_DEPARTMENT, oldCpDepartment, cpDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCpCatalogNumber() {
		return cpCatalogNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpCatalogNumber(Long newCpCatalogNumber) {
		Long oldCpCatalogNumber = cpCatalogNumber;
		cpCatalogNumber = newCpCatalogNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_NUMBER, oldCpCatalogNumber, cpCatalogNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCpCatalogPageNumber() {
		return cpCatalogPageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpCatalogPageNumber(Long newCpCatalogPageNumber) {
		Long oldCpCatalogPageNumber = cpCatalogPageNumber;
		cpCatalogPageNumber = newCpCatalogPageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER, oldCpCatalogPageNumber, cpCatalogPageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpDescription() {
		return cpDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpDescription(String newCpDescription) {
		String oldCpDescription = cpDescription;
		cpDescription = newCpDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_DESCRIPTION, oldCpDescription, cpDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpType() {
		return cpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpType(String newCpType) {
		String oldCpType = cpType;
		cpType = newCpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_PAGE__CP_TYPE, oldCpType, cpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_SK:
				return getCpCatalogPageSk();
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_ID:
				return getCpCatalogPageId();
			case TpcdsModelPackage.CATALOG_PAGE__CP_START_DATE_SK:
				return getCpStartDateSk();
			case TpcdsModelPackage.CATALOG_PAGE__CP_END_DATE_SK:
				return getCpEndDateSk();
			case TpcdsModelPackage.CATALOG_PAGE__CP_DEPARTMENT:
				return getCpDepartment();
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_NUMBER:
				return getCpCatalogNumber();
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER:
				return getCpCatalogPageNumber();
			case TpcdsModelPackage.CATALOG_PAGE__CP_DESCRIPTION:
				return getCpDescription();
			case TpcdsModelPackage.CATALOG_PAGE__CP_TYPE:
				return getCpType();
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
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_SK:
				setCpCatalogPageSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_ID:
				setCpCatalogPageId((String)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_START_DATE_SK:
				setCpStartDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_END_DATE_SK:
				setCpEndDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_DEPARTMENT:
				setCpDepartment((String)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_NUMBER:
				setCpCatalogNumber((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER:
				setCpCatalogPageNumber((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_DESCRIPTION:
				setCpDescription((String)newValue);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_TYPE:
				setCpType((String)newValue);
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
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_SK:
				setCpCatalogPageSk(CP_CATALOG_PAGE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_ID:
				setCpCatalogPageId(CP_CATALOG_PAGE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_START_DATE_SK:
				setCpStartDateSk(CP_START_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_END_DATE_SK:
				setCpEndDateSk(CP_END_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_DEPARTMENT:
				setCpDepartment(CP_DEPARTMENT_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_NUMBER:
				setCpCatalogNumber(CP_CATALOG_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER:
				setCpCatalogPageNumber(CP_CATALOG_PAGE_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_DESCRIPTION:
				setCpDescription(CP_DESCRIPTION_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_PAGE__CP_TYPE:
				setCpType(CP_TYPE_EDEFAULT);
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
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_SK:
				return CP_CATALOG_PAGE_SK_EDEFAULT == null ? cpCatalogPageSk != null : !CP_CATALOG_PAGE_SK_EDEFAULT.equals(cpCatalogPageSk);
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_ID:
				return CP_CATALOG_PAGE_ID_EDEFAULT == null ? cpCatalogPageId != null : !CP_CATALOG_PAGE_ID_EDEFAULT.equals(cpCatalogPageId);
			case TpcdsModelPackage.CATALOG_PAGE__CP_START_DATE_SK:
				return CP_START_DATE_SK_EDEFAULT == null ? cpStartDateSk != null : !CP_START_DATE_SK_EDEFAULT.equals(cpStartDateSk);
			case TpcdsModelPackage.CATALOG_PAGE__CP_END_DATE_SK:
				return CP_END_DATE_SK_EDEFAULT == null ? cpEndDateSk != null : !CP_END_DATE_SK_EDEFAULT.equals(cpEndDateSk);
			case TpcdsModelPackage.CATALOG_PAGE__CP_DEPARTMENT:
				return CP_DEPARTMENT_EDEFAULT == null ? cpDepartment != null : !CP_DEPARTMENT_EDEFAULT.equals(cpDepartment);
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_NUMBER:
				return CP_CATALOG_NUMBER_EDEFAULT == null ? cpCatalogNumber != null : !CP_CATALOG_NUMBER_EDEFAULT.equals(cpCatalogNumber);
			case TpcdsModelPackage.CATALOG_PAGE__CP_CATALOG_PAGE_NUMBER:
				return CP_CATALOG_PAGE_NUMBER_EDEFAULT == null ? cpCatalogPageNumber != null : !CP_CATALOG_PAGE_NUMBER_EDEFAULT.equals(cpCatalogPageNumber);
			case TpcdsModelPackage.CATALOG_PAGE__CP_DESCRIPTION:
				return CP_DESCRIPTION_EDEFAULT == null ? cpDescription != null : !CP_DESCRIPTION_EDEFAULT.equals(cpDescription);
			case TpcdsModelPackage.CATALOG_PAGE__CP_TYPE:
				return CP_TYPE_EDEFAULT == null ? cpType != null : !CP_TYPE_EDEFAULT.equals(cpType);
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
		result.append(" (cpCatalogPageSk: ");
		result.append(cpCatalogPageSk);
		result.append(", cpCatalogPageId: ");
		result.append(cpCatalogPageId);
		result.append(", cpStartDateSk: ");
		result.append(cpStartDateSk);
		result.append(", cpEndDateSk: ");
		result.append(cpEndDateSk);
		result.append(", cpDepartment: ");
		result.append(cpDepartment);
		result.append(", cpCatalogNumber: ");
		result.append(cpCatalogNumber);
		result.append(", cpCatalogPageNumber: ");
		result.append(cpCatalogPageNumber);
		result.append(", cpDescription: ");
		result.append(cpDescription);
		result.append(", cpType: ");
		result.append(cpType);
		result.append(')');
		return result.toString();
	}

} //CatalogPageImpl
