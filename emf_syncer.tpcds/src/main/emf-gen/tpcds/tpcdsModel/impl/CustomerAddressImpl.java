/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.CustomerAddress;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaAddressSk <em>Ca Address Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaAddressId <em>Ca Address Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaStreetNumber <em>Ca Street Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaStreetName <em>Ca Street Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaStreetType <em>Ca Street Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaSuiteNumber <em>Ca Suite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaCity <em>Ca City</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaCounty <em>Ca County</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaState <em>Ca State</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaZip <em>Ca Zip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaCountry <em>Ca Country</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaGmtOffset <em>Ca Gmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CustomerAddressImpl#getCaLocationType <em>Ca Location Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerAddressImpl extends MinimalEObjectImpl.Container implements CustomerAddress {
	/**
	 * The default value of the '{@link #getCaAddressSk() <em>Ca Address Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaAddressSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CA_ADDRESS_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaAddressSk() <em>Ca Address Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaAddressSk()
	 * @generated
	 * @ordered
	 */
	protected Long caAddressSk = CA_ADDRESS_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaAddressId() <em>Ca Address Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaAddressId()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_ADDRESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaAddressId() <em>Ca Address Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaAddressId()
	 * @generated
	 * @ordered
	 */
	protected String caAddressId = CA_ADDRESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaStreetNumber() <em>Ca Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_STREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaStreetNumber() <em>Ca Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String caStreetNumber = CA_STREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaStreetName() <em>Ca Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_STREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaStreetName() <em>Ca Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaStreetName()
	 * @generated
	 * @ordered
	 */
	protected String caStreetName = CA_STREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaStreetType() <em>Ca Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaStreetType()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_STREET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaStreetType() <em>Ca Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaStreetType()
	 * @generated
	 * @ordered
	 */
	protected String caStreetType = CA_STREET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaSuiteNumber() <em>Ca Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_SUITE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaSuiteNumber() <em>Ca Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected String caSuiteNumber = CA_SUITE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaCity() <em>Ca City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaCity() <em>Ca City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCity()
	 * @generated
	 * @ordered
	 */
	protected String caCity = CA_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaCounty() <em>Ca County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_COUNTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaCounty() <em>Ca County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCounty()
	 * @generated
	 * @ordered
	 */
	protected String caCounty = CA_COUNTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaState() <em>Ca State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaState()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaState() <em>Ca State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaState()
	 * @generated
	 * @ordered
	 */
	protected String caState = CA_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaZip() <em>Ca Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaZip()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaZip() <em>Ca Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaZip()
	 * @generated
	 * @ordered
	 */
	protected String caZip = CA_ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaCountry() <em>Ca Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaCountry() <em>Ca Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaCountry()
	 * @generated
	 * @ordered
	 */
	protected String caCountry = CA_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaGmtOffset() <em>Ca Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double CA_GMT_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCaGmtOffset() <em>Ca Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected double caGmtOffset = CA_GMT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaLocationType() <em>Ca Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaLocationType()
	 * @generated
	 * @ordered
	 */
	protected static final String CA_LOCATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaLocationType() <em>Ca Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaLocationType()
	 * @generated
	 * @ordered
	 */
	protected String caLocationType = CA_LOCATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.CUSTOMER_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCaAddressSk() {
		return caAddressSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaAddressSk(Long newCaAddressSk) {
		Long oldCaAddressSk = caAddressSk;
		caAddressSk = newCaAddressSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_SK, oldCaAddressSk, caAddressSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaAddressId() {
		return caAddressId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaAddressId(String newCaAddressId) {
		String oldCaAddressId = caAddressId;
		caAddressId = newCaAddressId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_ID, oldCaAddressId, caAddressId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaStreetNumber() {
		return caStreetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaStreetNumber(String newCaStreetNumber) {
		String oldCaStreetNumber = caStreetNumber;
		caStreetNumber = newCaStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NUMBER, oldCaStreetNumber, caStreetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaStreetName() {
		return caStreetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaStreetName(String newCaStreetName) {
		String oldCaStreetName = caStreetName;
		caStreetName = newCaStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NAME, oldCaStreetName, caStreetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaStreetType() {
		return caStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaStreetType(String newCaStreetType) {
		String oldCaStreetType = caStreetType;
		caStreetType = newCaStreetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_TYPE, oldCaStreetType, caStreetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaSuiteNumber() {
		return caSuiteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaSuiteNumber(String newCaSuiteNumber) {
		String oldCaSuiteNumber = caSuiteNumber;
		caSuiteNumber = newCaSuiteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_SUITE_NUMBER, oldCaSuiteNumber, caSuiteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaCity() {
		return caCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaCity(String newCaCity) {
		String oldCaCity = caCity;
		caCity = newCaCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_CITY, oldCaCity, caCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaCounty() {
		return caCounty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaCounty(String newCaCounty) {
		String oldCaCounty = caCounty;
		caCounty = newCaCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTY, oldCaCounty, caCounty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaState() {
		return caState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaState(String newCaState) {
		String oldCaState = caState;
		caState = newCaState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STATE, oldCaState, caState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaZip() {
		return caZip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaZip(String newCaZip) {
		String oldCaZip = caZip;
		caZip = newCaZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ZIP, oldCaZip, caZip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaCountry() {
		return caCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaCountry(String newCaCountry) {
		String oldCaCountry = caCountry;
		caCountry = newCaCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTRY, oldCaCountry, caCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCaGmtOffset() {
		return caGmtOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaGmtOffset(double newCaGmtOffset) {
		double oldCaGmtOffset = caGmtOffset;
		caGmtOffset = newCaGmtOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_GMT_OFFSET, oldCaGmtOffset, caGmtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaLocationType() {
		return caLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaLocationType(String newCaLocationType) {
		String oldCaLocationType = caLocationType;
		caLocationType = newCaLocationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CUSTOMER_ADDRESS__CA_LOCATION_TYPE, oldCaLocationType, caLocationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_SK:
				return getCaAddressSk();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_ID:
				return getCaAddressId();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NUMBER:
				return getCaStreetNumber();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NAME:
				return getCaStreetName();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_TYPE:
				return getCaStreetType();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_SUITE_NUMBER:
				return getCaSuiteNumber();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_CITY:
				return getCaCity();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTY:
				return getCaCounty();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STATE:
				return getCaState();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ZIP:
				return getCaZip();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTRY:
				return getCaCountry();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_GMT_OFFSET:
				return getCaGmtOffset();
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_LOCATION_TYPE:
				return getCaLocationType();
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
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_SK:
				setCaAddressSk((Long)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_ID:
				setCaAddressId((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NUMBER:
				setCaStreetNumber((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NAME:
				setCaStreetName((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_TYPE:
				setCaStreetType((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_SUITE_NUMBER:
				setCaSuiteNumber((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_CITY:
				setCaCity((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTY:
				setCaCounty((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STATE:
				setCaState((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ZIP:
				setCaZip((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTRY:
				setCaCountry((String)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_GMT_OFFSET:
				setCaGmtOffset((Double)newValue);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_LOCATION_TYPE:
				setCaLocationType((String)newValue);
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
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_SK:
				setCaAddressSk(CA_ADDRESS_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_ID:
				setCaAddressId(CA_ADDRESS_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NUMBER:
				setCaStreetNumber(CA_STREET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NAME:
				setCaStreetName(CA_STREET_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_TYPE:
				setCaStreetType(CA_STREET_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_SUITE_NUMBER:
				setCaSuiteNumber(CA_SUITE_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_CITY:
				setCaCity(CA_CITY_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTY:
				setCaCounty(CA_COUNTY_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STATE:
				setCaState(CA_STATE_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ZIP:
				setCaZip(CA_ZIP_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTRY:
				setCaCountry(CA_COUNTRY_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_GMT_OFFSET:
				setCaGmtOffset(CA_GMT_OFFSET_EDEFAULT);
				return;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_LOCATION_TYPE:
				setCaLocationType(CA_LOCATION_TYPE_EDEFAULT);
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
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_SK:
				return CA_ADDRESS_SK_EDEFAULT == null ? caAddressSk != null : !CA_ADDRESS_SK_EDEFAULT.equals(caAddressSk);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ADDRESS_ID:
				return CA_ADDRESS_ID_EDEFAULT == null ? caAddressId != null : !CA_ADDRESS_ID_EDEFAULT.equals(caAddressId);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NUMBER:
				return CA_STREET_NUMBER_EDEFAULT == null ? caStreetNumber != null : !CA_STREET_NUMBER_EDEFAULT.equals(caStreetNumber);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_NAME:
				return CA_STREET_NAME_EDEFAULT == null ? caStreetName != null : !CA_STREET_NAME_EDEFAULT.equals(caStreetName);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STREET_TYPE:
				return CA_STREET_TYPE_EDEFAULT == null ? caStreetType != null : !CA_STREET_TYPE_EDEFAULT.equals(caStreetType);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_SUITE_NUMBER:
				return CA_SUITE_NUMBER_EDEFAULT == null ? caSuiteNumber != null : !CA_SUITE_NUMBER_EDEFAULT.equals(caSuiteNumber);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_CITY:
				return CA_CITY_EDEFAULT == null ? caCity != null : !CA_CITY_EDEFAULT.equals(caCity);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTY:
				return CA_COUNTY_EDEFAULT == null ? caCounty != null : !CA_COUNTY_EDEFAULT.equals(caCounty);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_STATE:
				return CA_STATE_EDEFAULT == null ? caState != null : !CA_STATE_EDEFAULT.equals(caState);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_ZIP:
				return CA_ZIP_EDEFAULT == null ? caZip != null : !CA_ZIP_EDEFAULT.equals(caZip);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_COUNTRY:
				return CA_COUNTRY_EDEFAULT == null ? caCountry != null : !CA_COUNTRY_EDEFAULT.equals(caCountry);
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_GMT_OFFSET:
				return caGmtOffset != CA_GMT_OFFSET_EDEFAULT;
			case TpcdsModelPackage.CUSTOMER_ADDRESS__CA_LOCATION_TYPE:
				return CA_LOCATION_TYPE_EDEFAULT == null ? caLocationType != null : !CA_LOCATION_TYPE_EDEFAULT.equals(caLocationType);
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
		result.append(" (caAddressSk: ");
		result.append(caAddressSk);
		result.append(", caAddressId: ");
		result.append(caAddressId);
		result.append(", caStreetNumber: ");
		result.append(caStreetNumber);
		result.append(", caStreetName: ");
		result.append(caStreetName);
		result.append(", caStreetType: ");
		result.append(caStreetType);
		result.append(", caSuiteNumber: ");
		result.append(caSuiteNumber);
		result.append(", caCity: ");
		result.append(caCity);
		result.append(", caCounty: ");
		result.append(caCounty);
		result.append(", caState: ");
		result.append(caState);
		result.append(", caZip: ");
		result.append(caZip);
		result.append(", caCountry: ");
		result.append(caCountry);
		result.append(", caGmtOffset: ");
		result.append(caGmtOffset);
		result.append(", caLocationType: ");
		result.append(caLocationType);
		result.append(')');
		return result.toString();
	}

} //CustomerAddressImpl
