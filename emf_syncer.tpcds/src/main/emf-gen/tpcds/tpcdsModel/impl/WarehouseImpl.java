/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.TpcdsModelPackage;
import tpcds.tpcdsModel.Warehouse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warehouse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWWarehouseSk <em>WWarehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWWarehouseId <em>WWarehouse Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWWarehouseName <em>WWarehouse Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWWarehouseSqFt <em>WWarehouse Sq Ft</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWStreetNumber <em>WStreet Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWStreetName <em>WStreet Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWStreetType <em>WStreet Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWSuiteNumber <em>WSuite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWCity <em>WCity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWCounty <em>WCounty</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWState <em>WState</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWZip <em>WZip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWCountry <em>WCountry</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WarehouseImpl#getWGmtOffset <em>WGmt Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WarehouseImpl extends MinimalEObjectImpl.Container implements Warehouse {
	/**
	 * The default value of the '{@link #getWWarehouseSk() <em>WWarehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WWAREHOUSE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWWarehouseSk() <em>WWarehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected Long wWarehouseSk = WWAREHOUSE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWWarehouseId() <em>WWarehouse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseId()
	 * @generated
	 * @ordered
	 */
	protected static final String WWAREHOUSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWWarehouseId() <em>WWarehouse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseId()
	 * @generated
	 * @ordered
	 */
	protected String wWarehouseId = WWAREHOUSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWWarehouseName() <em>WWarehouse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseName()
	 * @generated
	 * @ordered
	 */
	protected static final String WWAREHOUSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWWarehouseName() <em>WWarehouse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseName()
	 * @generated
	 * @ordered
	 */
	protected String wWarehouseName = WWAREHOUSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWWarehouseSqFt() <em>WWarehouse Sq Ft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseSqFt()
	 * @generated
	 * @ordered
	 */
	protected static final Long WWAREHOUSE_SQ_FT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWWarehouseSqFt() <em>WWarehouse Sq Ft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWarehouseSqFt()
	 * @generated
	 * @ordered
	 */
	protected Long wWarehouseSqFt = WWAREHOUSE_SQ_FT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWStreetNumber() <em>WStreet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String WSTREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWStreetNumber() <em>WStreet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String wStreetNumber = WSTREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWStreetName() <em>WStreet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String WSTREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWStreetName() <em>WStreet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWStreetName()
	 * @generated
	 * @ordered
	 */
	protected String wStreetName = WSTREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWStreetType() <em>WStreet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWStreetType()
	 * @generated
	 * @ordered
	 */
	protected static final String WSTREET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWStreetType() <em>WStreet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWStreetType()
	 * @generated
	 * @ordered
	 */
	protected String wStreetType = WSTREET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWSuiteNumber() <em>WSuite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String WSUITE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWSuiteNumber() <em>WSuite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected String wSuiteNumber = WSUITE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWCity() <em>WCity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCity()
	 * @generated
	 * @ordered
	 */
	protected static final String WCITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWCity() <em>WCity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCity()
	 * @generated
	 * @ordered
	 */
	protected String wCity = WCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWCounty() <em>WCounty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String WCOUNTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWCounty() <em>WCounty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCounty()
	 * @generated
	 * @ordered
	 */
	protected String wCounty = WCOUNTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWState() <em>WState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWState()
	 * @generated
	 * @ordered
	 */
	protected static final String WSTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWState() <em>WState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWState()
	 * @generated
	 * @ordered
	 */
	protected String wState = WSTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWZip() <em>WZip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWZip()
	 * @generated
	 * @ordered
	 */
	protected static final String WZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWZip() <em>WZip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWZip()
	 * @generated
	 * @ordered
	 */
	protected String wZip = WZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWCountry() <em>WCountry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String WCOUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWCountry() <em>WCountry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCountry()
	 * @generated
	 * @ordered
	 */
	protected String wCountry = WCOUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWGmtOffset() <em>WGmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double WGMT_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWGmtOffset() <em>WGmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected double wGmtOffset = WGMT_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.WAREHOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWWarehouseSk() {
		return wWarehouseSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWWarehouseSk(Long newWWarehouseSk) {
		Long oldWWarehouseSk = wWarehouseSk;
		wWarehouseSk = newWWarehouseSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SK, oldWWarehouseSk, wWarehouseSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWWarehouseId() {
		return wWarehouseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWWarehouseId(String newWWarehouseId) {
		String oldWWarehouseId = wWarehouseId;
		wWarehouseId = newWWarehouseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_ID, oldWWarehouseId, wWarehouseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWWarehouseName() {
		return wWarehouseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWWarehouseName(String newWWarehouseName) {
		String oldWWarehouseName = wWarehouseName;
		wWarehouseName = newWWarehouseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_NAME, oldWWarehouseName, wWarehouseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWWarehouseSqFt() {
		return wWarehouseSqFt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWWarehouseSqFt(Long newWWarehouseSqFt) {
		Long oldWWarehouseSqFt = wWarehouseSqFt;
		wWarehouseSqFt = newWWarehouseSqFt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SQ_FT, oldWWarehouseSqFt, wWarehouseSqFt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWStreetNumber() {
		return wStreetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWStreetNumber(String newWStreetNumber) {
		String oldWStreetNumber = wStreetNumber;
		wStreetNumber = newWStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WSTREET_NUMBER, oldWStreetNumber, wStreetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWStreetName() {
		return wStreetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWStreetName(String newWStreetName) {
		String oldWStreetName = wStreetName;
		wStreetName = newWStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WSTREET_NAME, oldWStreetName, wStreetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWStreetType() {
		return wStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWStreetType(String newWStreetType) {
		String oldWStreetType = wStreetType;
		wStreetType = newWStreetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WSTREET_TYPE, oldWStreetType, wStreetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWSuiteNumber() {
		return wSuiteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWSuiteNumber(String newWSuiteNumber) {
		String oldWSuiteNumber = wSuiteNumber;
		wSuiteNumber = newWSuiteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WSUITE_NUMBER, oldWSuiteNumber, wSuiteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWCity() {
		return wCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWCity(String newWCity) {
		String oldWCity = wCity;
		wCity = newWCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WCITY, oldWCity, wCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWCounty() {
		return wCounty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWCounty(String newWCounty) {
		String oldWCounty = wCounty;
		wCounty = newWCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WCOUNTY, oldWCounty, wCounty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWState() {
		return wState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWState(String newWState) {
		String oldWState = wState;
		wState = newWState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WSTATE, oldWState, wState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWZip() {
		return wZip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWZip(String newWZip) {
		String oldWZip = wZip;
		wZip = newWZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WZIP, oldWZip, wZip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWCountry() {
		return wCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWCountry(String newWCountry) {
		String oldWCountry = wCountry;
		wCountry = newWCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WCOUNTRY, oldWCountry, wCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWGmtOffset() {
		return wGmtOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWGmtOffset(double newWGmtOffset) {
		double oldWGmtOffset = wGmtOffset;
		wGmtOffset = newWGmtOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WAREHOUSE__WGMT_OFFSET, oldWGmtOffset, wGmtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SK:
				return getWWarehouseSk();
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_ID:
				return getWWarehouseId();
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_NAME:
				return getWWarehouseName();
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SQ_FT:
				return getWWarehouseSqFt();
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NUMBER:
				return getWStreetNumber();
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NAME:
				return getWStreetName();
			case TpcdsModelPackage.WAREHOUSE__WSTREET_TYPE:
				return getWStreetType();
			case TpcdsModelPackage.WAREHOUSE__WSUITE_NUMBER:
				return getWSuiteNumber();
			case TpcdsModelPackage.WAREHOUSE__WCITY:
				return getWCity();
			case TpcdsModelPackage.WAREHOUSE__WCOUNTY:
				return getWCounty();
			case TpcdsModelPackage.WAREHOUSE__WSTATE:
				return getWState();
			case TpcdsModelPackage.WAREHOUSE__WZIP:
				return getWZip();
			case TpcdsModelPackage.WAREHOUSE__WCOUNTRY:
				return getWCountry();
			case TpcdsModelPackage.WAREHOUSE__WGMT_OFFSET:
				return getWGmtOffset();
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
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SK:
				setWWarehouseSk((Long)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_ID:
				setWWarehouseId((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_NAME:
				setWWarehouseName((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SQ_FT:
				setWWarehouseSqFt((Long)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NUMBER:
				setWStreetNumber((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NAME:
				setWStreetName((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTREET_TYPE:
				setWStreetType((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSUITE_NUMBER:
				setWSuiteNumber((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WCITY:
				setWCity((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WCOUNTY:
				setWCounty((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTATE:
				setWState((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WZIP:
				setWZip((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WCOUNTRY:
				setWCountry((String)newValue);
				return;
			case TpcdsModelPackage.WAREHOUSE__WGMT_OFFSET:
				setWGmtOffset((Double)newValue);
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
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SK:
				setWWarehouseSk(WWAREHOUSE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_ID:
				setWWarehouseId(WWAREHOUSE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_NAME:
				setWWarehouseName(WWAREHOUSE_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SQ_FT:
				setWWarehouseSqFt(WWAREHOUSE_SQ_FT_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NUMBER:
				setWStreetNumber(WSTREET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NAME:
				setWStreetName(WSTREET_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTREET_TYPE:
				setWStreetType(WSTREET_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSUITE_NUMBER:
				setWSuiteNumber(WSUITE_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WCITY:
				setWCity(WCITY_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WCOUNTY:
				setWCounty(WCOUNTY_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WSTATE:
				setWState(WSTATE_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WZIP:
				setWZip(WZIP_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WCOUNTRY:
				setWCountry(WCOUNTRY_EDEFAULT);
				return;
			case TpcdsModelPackage.WAREHOUSE__WGMT_OFFSET:
				setWGmtOffset(WGMT_OFFSET_EDEFAULT);
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
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SK:
				return WWAREHOUSE_SK_EDEFAULT == null ? wWarehouseSk != null : !WWAREHOUSE_SK_EDEFAULT.equals(wWarehouseSk);
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_ID:
				return WWAREHOUSE_ID_EDEFAULT == null ? wWarehouseId != null : !WWAREHOUSE_ID_EDEFAULT.equals(wWarehouseId);
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_NAME:
				return WWAREHOUSE_NAME_EDEFAULT == null ? wWarehouseName != null : !WWAREHOUSE_NAME_EDEFAULT.equals(wWarehouseName);
			case TpcdsModelPackage.WAREHOUSE__WWAREHOUSE_SQ_FT:
				return WWAREHOUSE_SQ_FT_EDEFAULT == null ? wWarehouseSqFt != null : !WWAREHOUSE_SQ_FT_EDEFAULT.equals(wWarehouseSqFt);
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NUMBER:
				return WSTREET_NUMBER_EDEFAULT == null ? wStreetNumber != null : !WSTREET_NUMBER_EDEFAULT.equals(wStreetNumber);
			case TpcdsModelPackage.WAREHOUSE__WSTREET_NAME:
				return WSTREET_NAME_EDEFAULT == null ? wStreetName != null : !WSTREET_NAME_EDEFAULT.equals(wStreetName);
			case TpcdsModelPackage.WAREHOUSE__WSTREET_TYPE:
				return WSTREET_TYPE_EDEFAULT == null ? wStreetType != null : !WSTREET_TYPE_EDEFAULT.equals(wStreetType);
			case TpcdsModelPackage.WAREHOUSE__WSUITE_NUMBER:
				return WSUITE_NUMBER_EDEFAULT == null ? wSuiteNumber != null : !WSUITE_NUMBER_EDEFAULT.equals(wSuiteNumber);
			case TpcdsModelPackage.WAREHOUSE__WCITY:
				return WCITY_EDEFAULT == null ? wCity != null : !WCITY_EDEFAULT.equals(wCity);
			case TpcdsModelPackage.WAREHOUSE__WCOUNTY:
				return WCOUNTY_EDEFAULT == null ? wCounty != null : !WCOUNTY_EDEFAULT.equals(wCounty);
			case TpcdsModelPackage.WAREHOUSE__WSTATE:
				return WSTATE_EDEFAULT == null ? wState != null : !WSTATE_EDEFAULT.equals(wState);
			case TpcdsModelPackage.WAREHOUSE__WZIP:
				return WZIP_EDEFAULT == null ? wZip != null : !WZIP_EDEFAULT.equals(wZip);
			case TpcdsModelPackage.WAREHOUSE__WCOUNTRY:
				return WCOUNTRY_EDEFAULT == null ? wCountry != null : !WCOUNTRY_EDEFAULT.equals(wCountry);
			case TpcdsModelPackage.WAREHOUSE__WGMT_OFFSET:
				return wGmtOffset != WGMT_OFFSET_EDEFAULT;
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
		result.append(" (wWarehouseSk: ");
		result.append(wWarehouseSk);
		result.append(", wWarehouseId: ");
		result.append(wWarehouseId);
		result.append(", wWarehouseName: ");
		result.append(wWarehouseName);
		result.append(", wWarehouseSqFt: ");
		result.append(wWarehouseSqFt);
		result.append(", wStreetNumber: ");
		result.append(wStreetNumber);
		result.append(", wStreetName: ");
		result.append(wStreetName);
		result.append(", wStreetType: ");
		result.append(wStreetType);
		result.append(", wSuiteNumber: ");
		result.append(wSuiteNumber);
		result.append(", wCity: ");
		result.append(wCity);
		result.append(", wCounty: ");
		result.append(wCounty);
		result.append(", wState: ");
		result.append(wState);
		result.append(", wZip: ");
		result.append(wZip);
		result.append(", wCountry: ");
		result.append(wCountry);
		result.append(", wGmtOffset: ");
		result.append(wGmtOffset);
		result.append(')');
		return result.toString();
	}

} //WarehouseImpl
