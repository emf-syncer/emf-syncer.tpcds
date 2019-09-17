/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.CallCenter;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCallCenterSk <em>Cc Call Center Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCallCenterId <em>Cc Call Center Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcRecStartDate <em>Cc Rec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcRecEndDate <em>Cc Rec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcClosedDateSk <em>Cc Closed Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcOpenDateSk <em>Cc Open Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcName <em>Cc Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcClass <em>Cc Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcEmployees <em>Cc Employees</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcSqFt <em>Cc Sq Ft</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcHours <em>Cc Hours</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcManager <em>Cc Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcMktId <em>Cc Mkt Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcMktClass <em>Cc Mkt Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcMktDesc <em>Cc Mkt Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcMarketManager <em>Cc Market Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcDivision <em>Cc Division</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcDivisionName <em>Cc Division Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCompany <em>Cc Company</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCompanyName <em>Cc Company Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcStreetNumber <em>Cc Street Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcStreetName <em>Cc Street Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcStreetType <em>Cc Street Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcSuiteNumber <em>Cc Suite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCity <em>Cc City</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCounty <em>Cc County</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcState <em>Cc State</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcZip <em>Cc Zip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcCountry <em>Cc Country</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcGmtOffset <em>Cc Gmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CallCenterImpl#getCcTaxPercentage <em>Cc Tax Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallCenterImpl extends MinimalEObjectImpl.Container implements CallCenter {
	/**
	 * The default value of the '{@link #getCcCallCenterSk() <em>Cc Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCallCenterSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_CALL_CENTER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCallCenterSk() <em>Cc Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCallCenterSk()
	 * @generated
	 * @ordered
	 */
	protected Long ccCallCenterSk = CC_CALL_CENTER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcCallCenterId() <em>Cc Call Center Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCallCenterId()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_CALL_CENTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCallCenterId() <em>Cc Call Center Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCallCenterId()
	 * @generated
	 * @ordered
	 */
	protected String ccCallCenterId = CC_CALL_CENTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcRecStartDate() <em>Cc Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CC_REC_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcRecStartDate() <em>Cc Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date ccRecStartDate = CC_REC_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcRecEndDate() <em>Cc Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CC_REC_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcRecEndDate() <em>Cc Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date ccRecEndDate = CC_REC_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcClosedDateSk() <em>Cc Closed Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcClosedDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_CLOSED_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcClosedDateSk() <em>Cc Closed Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcClosedDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long ccClosedDateSk = CC_CLOSED_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcOpenDateSk() <em>Cc Open Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcOpenDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_OPEN_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcOpenDateSk() <em>Cc Open Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcOpenDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long ccOpenDateSk = CC_OPEN_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcName() <em>Cc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcName()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcName() <em>Cc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcName()
	 * @generated
	 * @ordered
	 */
	protected String ccName = CC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcClass() <em>Cc Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcClass() <em>Cc Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcClass()
	 * @generated
	 * @ordered
	 */
	protected String ccClass = CC_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcEmployees() <em>Cc Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcEmployees()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_EMPLOYEES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcEmployees() <em>Cc Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcEmployees()
	 * @generated
	 * @ordered
	 */
	protected Long ccEmployees = CC_EMPLOYEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcSqFt() <em>Cc Sq Ft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcSqFt()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_SQ_FT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcSqFt() <em>Cc Sq Ft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcSqFt()
	 * @generated
	 * @ordered
	 */
	protected Long ccSqFt = CC_SQ_FT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcHours() <em>Cc Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcHours()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcHours() <em>Cc Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcHours()
	 * @generated
	 * @ordered
	 */
	protected String ccHours = CC_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcManager() <em>Cc Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcManager()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcManager() <em>Cc Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcManager()
	 * @generated
	 * @ordered
	 */
	protected String ccManager = CC_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcMktId() <em>Cc Mkt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMktId()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_MKT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcMktId() <em>Cc Mkt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMktId()
	 * @generated
	 * @ordered
	 */
	protected Long ccMktId = CC_MKT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcMktClass() <em>Cc Mkt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMktClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_MKT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcMktClass() <em>Cc Mkt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMktClass()
	 * @generated
	 * @ordered
	 */
	protected String ccMktClass = CC_MKT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcMktDesc() <em>Cc Mkt Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMktDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_MKT_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcMktDesc() <em>Cc Mkt Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMktDesc()
	 * @generated
	 * @ordered
	 */
	protected String ccMktDesc = CC_MKT_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcMarketManager() <em>Cc Market Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMarketManager()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_MARKET_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcMarketManager() <em>Cc Market Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcMarketManager()
	 * @generated
	 * @ordered
	 */
	protected String ccMarketManager = CC_MARKET_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcDivision() <em>Cc Division</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcDivision()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_DIVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcDivision() <em>Cc Division</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcDivision()
	 * @generated
	 * @ordered
	 */
	protected Long ccDivision = CC_DIVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcDivisionName() <em>Cc Division Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcDivisionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_DIVISION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcDivisionName() <em>Cc Division Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcDivisionName()
	 * @generated
	 * @ordered
	 */
	protected String ccDivisionName = CC_DIVISION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcCompany() <em>Cc Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCompany()
	 * @generated
	 * @ordered
	 */
	protected static final Long CC_COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCompany() <em>Cc Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCompany()
	 * @generated
	 * @ordered
	 */
	protected Long ccCompany = CC_COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcCompanyName() <em>Cc Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCompanyName() <em>Cc Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String ccCompanyName = CC_COMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcStreetNumber() <em>Cc Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_STREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcStreetNumber() <em>Cc Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String ccStreetNumber = CC_STREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcStreetName() <em>Cc Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_STREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcStreetName() <em>Cc Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcStreetName()
	 * @generated
	 * @ordered
	 */
	protected String ccStreetName = CC_STREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcStreetType() <em>Cc Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcStreetType()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_STREET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcStreetType() <em>Cc Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcStreetType()
	 * @generated
	 * @ordered
	 */
	protected String ccStreetType = CC_STREET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcSuiteNumber() <em>Cc Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_SUITE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcSuiteNumber() <em>Cc Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected String ccSuiteNumber = CC_SUITE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcCity() <em>Cc City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCity() <em>Cc City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCity()
	 * @generated
	 * @ordered
	 */
	protected String ccCity = CC_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcCounty() <em>Cc County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_COUNTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCounty() <em>Cc County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCounty()
	 * @generated
	 * @ordered
	 */
	protected String ccCounty = CC_COUNTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcState() <em>Cc State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcState()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcState() <em>Cc State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcState()
	 * @generated
	 * @ordered
	 */
	protected String ccState = CC_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcZip() <em>Cc Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcZip()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcZip() <em>Cc Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcZip()
	 * @generated
	 * @ordered
	 */
	protected String ccZip = CC_ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcCountry() <em>Cc Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcCountry() <em>Cc Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcCountry()
	 * @generated
	 * @ordered
	 */
	protected String ccCountry = CC_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcGmtOffset() <em>Cc Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double CC_GMT_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCcGmtOffset() <em>Cc Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected double ccGmtOffset = CC_GMT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcTaxPercentage() <em>Cc Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double CC_TAX_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCcTaxPercentage() <em>Cc Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected double ccTaxPercentage = CC_TAX_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.CALL_CENTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcCallCenterSk() {
		return ccCallCenterSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCallCenterSk(Long newCcCallCenterSk) {
		Long oldCcCallCenterSk = ccCallCenterSk;
		ccCallCenterSk = newCcCallCenterSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_SK, oldCcCallCenterSk, ccCallCenterSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcCallCenterId() {
		return ccCallCenterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCallCenterId(String newCcCallCenterId) {
		String oldCcCallCenterId = ccCallCenterId;
		ccCallCenterId = newCcCallCenterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_ID, oldCcCallCenterId, ccCallCenterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCcRecStartDate() {
		return ccRecStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcRecStartDate(Date newCcRecStartDate) {
		Date oldCcRecStartDate = ccRecStartDate;
		ccRecStartDate = newCcRecStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_REC_START_DATE, oldCcRecStartDate, ccRecStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCcRecEndDate() {
		return ccRecEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcRecEndDate(Date newCcRecEndDate) {
		Date oldCcRecEndDate = ccRecEndDate;
		ccRecEndDate = newCcRecEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_REC_END_DATE, oldCcRecEndDate, ccRecEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcClosedDateSk() {
		return ccClosedDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcClosedDateSk(Long newCcClosedDateSk) {
		Long oldCcClosedDateSk = ccClosedDateSk;
		ccClosedDateSk = newCcClosedDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_CLOSED_DATE_SK, oldCcClosedDateSk, ccClosedDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcOpenDateSk() {
		return ccOpenDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcOpenDateSk(Long newCcOpenDateSk) {
		Long oldCcOpenDateSk = ccOpenDateSk;
		ccOpenDateSk = newCcOpenDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_OPEN_DATE_SK, oldCcOpenDateSk, ccOpenDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcName() {
		return ccName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcName(String newCcName) {
		String oldCcName = ccName;
		ccName = newCcName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_NAME, oldCcName, ccName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcClass() {
		return ccClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcClass(String newCcClass) {
		String oldCcClass = ccClass;
		ccClass = newCcClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_CLASS, oldCcClass, ccClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcEmployees() {
		return ccEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcEmployees(Long newCcEmployees) {
		Long oldCcEmployees = ccEmployees;
		ccEmployees = newCcEmployees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_EMPLOYEES, oldCcEmployees, ccEmployees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcSqFt() {
		return ccSqFt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcSqFt(Long newCcSqFt) {
		Long oldCcSqFt = ccSqFt;
		ccSqFt = newCcSqFt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_SQ_FT, oldCcSqFt, ccSqFt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcHours() {
		return ccHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcHours(String newCcHours) {
		String oldCcHours = ccHours;
		ccHours = newCcHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_HOURS, oldCcHours, ccHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcManager() {
		return ccManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcManager(String newCcManager) {
		String oldCcManager = ccManager;
		ccManager = newCcManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_MANAGER, oldCcManager, ccManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcMktId() {
		return ccMktId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcMktId(Long newCcMktId) {
		Long oldCcMktId = ccMktId;
		ccMktId = newCcMktId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_MKT_ID, oldCcMktId, ccMktId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcMktClass() {
		return ccMktClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcMktClass(String newCcMktClass) {
		String oldCcMktClass = ccMktClass;
		ccMktClass = newCcMktClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_MKT_CLASS, oldCcMktClass, ccMktClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcMktDesc() {
		return ccMktDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcMktDesc(String newCcMktDesc) {
		String oldCcMktDesc = ccMktDesc;
		ccMktDesc = newCcMktDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_MKT_DESC, oldCcMktDesc, ccMktDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcMarketManager() {
		return ccMarketManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcMarketManager(String newCcMarketManager) {
		String oldCcMarketManager = ccMarketManager;
		ccMarketManager = newCcMarketManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_MARKET_MANAGER, oldCcMarketManager, ccMarketManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcDivision() {
		return ccDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcDivision(Long newCcDivision) {
		Long oldCcDivision = ccDivision;
		ccDivision = newCcDivision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_DIVISION, oldCcDivision, ccDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcDivisionName() {
		return ccDivisionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcDivisionName(String newCcDivisionName) {
		String oldCcDivisionName = ccDivisionName;
		ccDivisionName = newCcDivisionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_DIVISION_NAME, oldCcDivisionName, ccDivisionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCcCompany() {
		return ccCompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCompany(Long newCcCompany) {
		Long oldCcCompany = ccCompany;
		ccCompany = newCcCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_COMPANY, oldCcCompany, ccCompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcCompanyName() {
		return ccCompanyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCompanyName(String newCcCompanyName) {
		String oldCcCompanyName = ccCompanyName;
		ccCompanyName = newCcCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_COMPANY_NAME, oldCcCompanyName, ccCompanyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcStreetNumber() {
		return ccStreetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcStreetNumber(String newCcStreetNumber) {
		String oldCcStreetNumber = ccStreetNumber;
		ccStreetNumber = newCcStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_STREET_NUMBER, oldCcStreetNumber, ccStreetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcStreetName() {
		return ccStreetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcStreetName(String newCcStreetName) {
		String oldCcStreetName = ccStreetName;
		ccStreetName = newCcStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_STREET_NAME, oldCcStreetName, ccStreetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcStreetType() {
		return ccStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcStreetType(String newCcStreetType) {
		String oldCcStreetType = ccStreetType;
		ccStreetType = newCcStreetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_STREET_TYPE, oldCcStreetType, ccStreetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcSuiteNumber() {
		return ccSuiteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcSuiteNumber(String newCcSuiteNumber) {
		String oldCcSuiteNumber = ccSuiteNumber;
		ccSuiteNumber = newCcSuiteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_SUITE_NUMBER, oldCcSuiteNumber, ccSuiteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcCity() {
		return ccCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCity(String newCcCity) {
		String oldCcCity = ccCity;
		ccCity = newCcCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_CITY, oldCcCity, ccCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcCounty() {
		return ccCounty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCounty(String newCcCounty) {
		String oldCcCounty = ccCounty;
		ccCounty = newCcCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_COUNTY, oldCcCounty, ccCounty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcState() {
		return ccState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcState(String newCcState) {
		String oldCcState = ccState;
		ccState = newCcState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_STATE, oldCcState, ccState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcZip() {
		return ccZip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcZip(String newCcZip) {
		String oldCcZip = ccZip;
		ccZip = newCcZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_ZIP, oldCcZip, ccZip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcCountry() {
		return ccCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcCountry(String newCcCountry) {
		String oldCcCountry = ccCountry;
		ccCountry = newCcCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_COUNTRY, oldCcCountry, ccCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCcGmtOffset() {
		return ccGmtOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcGmtOffset(double newCcGmtOffset) {
		double oldCcGmtOffset = ccGmtOffset;
		ccGmtOffset = newCcGmtOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_GMT_OFFSET, oldCcGmtOffset, ccGmtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCcTaxPercentage() {
		return ccTaxPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcTaxPercentage(double newCcTaxPercentage) {
		double oldCcTaxPercentage = ccTaxPercentage;
		ccTaxPercentage = newCcTaxPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CALL_CENTER__CC_TAX_PERCENTAGE, oldCcTaxPercentage, ccTaxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_SK:
				return getCcCallCenterSk();
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_ID:
				return getCcCallCenterId();
			case TpcdsModelPackage.CALL_CENTER__CC_REC_START_DATE:
				return getCcRecStartDate();
			case TpcdsModelPackage.CALL_CENTER__CC_REC_END_DATE:
				return getCcRecEndDate();
			case TpcdsModelPackage.CALL_CENTER__CC_CLOSED_DATE_SK:
				return getCcClosedDateSk();
			case TpcdsModelPackage.CALL_CENTER__CC_OPEN_DATE_SK:
				return getCcOpenDateSk();
			case TpcdsModelPackage.CALL_CENTER__CC_NAME:
				return getCcName();
			case TpcdsModelPackage.CALL_CENTER__CC_CLASS:
				return getCcClass();
			case TpcdsModelPackage.CALL_CENTER__CC_EMPLOYEES:
				return getCcEmployees();
			case TpcdsModelPackage.CALL_CENTER__CC_SQ_FT:
				return getCcSqFt();
			case TpcdsModelPackage.CALL_CENTER__CC_HOURS:
				return getCcHours();
			case TpcdsModelPackage.CALL_CENTER__CC_MANAGER:
				return getCcManager();
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_ID:
				return getCcMktId();
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_CLASS:
				return getCcMktClass();
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_DESC:
				return getCcMktDesc();
			case TpcdsModelPackage.CALL_CENTER__CC_MARKET_MANAGER:
				return getCcMarketManager();
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION:
				return getCcDivision();
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION_NAME:
				return getCcDivisionName();
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY:
				return getCcCompany();
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY_NAME:
				return getCcCompanyName();
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NUMBER:
				return getCcStreetNumber();
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NAME:
				return getCcStreetName();
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_TYPE:
				return getCcStreetType();
			case TpcdsModelPackage.CALL_CENTER__CC_SUITE_NUMBER:
				return getCcSuiteNumber();
			case TpcdsModelPackage.CALL_CENTER__CC_CITY:
				return getCcCity();
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTY:
				return getCcCounty();
			case TpcdsModelPackage.CALL_CENTER__CC_STATE:
				return getCcState();
			case TpcdsModelPackage.CALL_CENTER__CC_ZIP:
				return getCcZip();
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTRY:
				return getCcCountry();
			case TpcdsModelPackage.CALL_CENTER__CC_GMT_OFFSET:
				return getCcGmtOffset();
			case TpcdsModelPackage.CALL_CENTER__CC_TAX_PERCENTAGE:
				return getCcTaxPercentage();
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
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_SK:
				setCcCallCenterSk((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_ID:
				setCcCallCenterId((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_REC_START_DATE:
				setCcRecStartDate((Date)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_REC_END_DATE:
				setCcRecEndDate((Date)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CLOSED_DATE_SK:
				setCcClosedDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_OPEN_DATE_SK:
				setCcOpenDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_NAME:
				setCcName((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CLASS:
				setCcClass((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_EMPLOYEES:
				setCcEmployees((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_SQ_FT:
				setCcSqFt((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_HOURS:
				setCcHours((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MANAGER:
				setCcManager((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_ID:
				setCcMktId((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_CLASS:
				setCcMktClass((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_DESC:
				setCcMktDesc((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MARKET_MANAGER:
				setCcMarketManager((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION:
				setCcDivision((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION_NAME:
				setCcDivisionName((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY:
				setCcCompany((Long)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY_NAME:
				setCcCompanyName((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NUMBER:
				setCcStreetNumber((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NAME:
				setCcStreetName((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_TYPE:
				setCcStreetType((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_SUITE_NUMBER:
				setCcSuiteNumber((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CITY:
				setCcCity((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTY:
				setCcCounty((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STATE:
				setCcState((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_ZIP:
				setCcZip((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTRY:
				setCcCountry((String)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_GMT_OFFSET:
				setCcGmtOffset((Double)newValue);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_TAX_PERCENTAGE:
				setCcTaxPercentage((Double)newValue);
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
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_SK:
				setCcCallCenterSk(CC_CALL_CENTER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_ID:
				setCcCallCenterId(CC_CALL_CENTER_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_REC_START_DATE:
				setCcRecStartDate(CC_REC_START_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_REC_END_DATE:
				setCcRecEndDate(CC_REC_END_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CLOSED_DATE_SK:
				setCcClosedDateSk(CC_CLOSED_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_OPEN_DATE_SK:
				setCcOpenDateSk(CC_OPEN_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_NAME:
				setCcName(CC_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CLASS:
				setCcClass(CC_CLASS_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_EMPLOYEES:
				setCcEmployees(CC_EMPLOYEES_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_SQ_FT:
				setCcSqFt(CC_SQ_FT_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_HOURS:
				setCcHours(CC_HOURS_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MANAGER:
				setCcManager(CC_MANAGER_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_ID:
				setCcMktId(CC_MKT_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_CLASS:
				setCcMktClass(CC_MKT_CLASS_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_DESC:
				setCcMktDesc(CC_MKT_DESC_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_MARKET_MANAGER:
				setCcMarketManager(CC_MARKET_MANAGER_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION:
				setCcDivision(CC_DIVISION_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION_NAME:
				setCcDivisionName(CC_DIVISION_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY:
				setCcCompany(CC_COMPANY_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY_NAME:
				setCcCompanyName(CC_COMPANY_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NUMBER:
				setCcStreetNumber(CC_STREET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NAME:
				setCcStreetName(CC_STREET_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_TYPE:
				setCcStreetType(CC_STREET_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_SUITE_NUMBER:
				setCcSuiteNumber(CC_SUITE_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_CITY:
				setCcCity(CC_CITY_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTY:
				setCcCounty(CC_COUNTY_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_STATE:
				setCcState(CC_STATE_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_ZIP:
				setCcZip(CC_ZIP_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTRY:
				setCcCountry(CC_COUNTRY_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_GMT_OFFSET:
				setCcGmtOffset(CC_GMT_OFFSET_EDEFAULT);
				return;
			case TpcdsModelPackage.CALL_CENTER__CC_TAX_PERCENTAGE:
				setCcTaxPercentage(CC_TAX_PERCENTAGE_EDEFAULT);
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
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_SK:
				return CC_CALL_CENTER_SK_EDEFAULT == null ? ccCallCenterSk != null : !CC_CALL_CENTER_SK_EDEFAULT.equals(ccCallCenterSk);
			case TpcdsModelPackage.CALL_CENTER__CC_CALL_CENTER_ID:
				return CC_CALL_CENTER_ID_EDEFAULT == null ? ccCallCenterId != null : !CC_CALL_CENTER_ID_EDEFAULT.equals(ccCallCenterId);
			case TpcdsModelPackage.CALL_CENTER__CC_REC_START_DATE:
				return CC_REC_START_DATE_EDEFAULT == null ? ccRecStartDate != null : !CC_REC_START_DATE_EDEFAULT.equals(ccRecStartDate);
			case TpcdsModelPackage.CALL_CENTER__CC_REC_END_DATE:
				return CC_REC_END_DATE_EDEFAULT == null ? ccRecEndDate != null : !CC_REC_END_DATE_EDEFAULT.equals(ccRecEndDate);
			case TpcdsModelPackage.CALL_CENTER__CC_CLOSED_DATE_SK:
				return CC_CLOSED_DATE_SK_EDEFAULT == null ? ccClosedDateSk != null : !CC_CLOSED_DATE_SK_EDEFAULT.equals(ccClosedDateSk);
			case TpcdsModelPackage.CALL_CENTER__CC_OPEN_DATE_SK:
				return CC_OPEN_DATE_SK_EDEFAULT == null ? ccOpenDateSk != null : !CC_OPEN_DATE_SK_EDEFAULT.equals(ccOpenDateSk);
			case TpcdsModelPackage.CALL_CENTER__CC_NAME:
				return CC_NAME_EDEFAULT == null ? ccName != null : !CC_NAME_EDEFAULT.equals(ccName);
			case TpcdsModelPackage.CALL_CENTER__CC_CLASS:
				return CC_CLASS_EDEFAULT == null ? ccClass != null : !CC_CLASS_EDEFAULT.equals(ccClass);
			case TpcdsModelPackage.CALL_CENTER__CC_EMPLOYEES:
				return CC_EMPLOYEES_EDEFAULT == null ? ccEmployees != null : !CC_EMPLOYEES_EDEFAULT.equals(ccEmployees);
			case TpcdsModelPackage.CALL_CENTER__CC_SQ_FT:
				return CC_SQ_FT_EDEFAULT == null ? ccSqFt != null : !CC_SQ_FT_EDEFAULT.equals(ccSqFt);
			case TpcdsModelPackage.CALL_CENTER__CC_HOURS:
				return CC_HOURS_EDEFAULT == null ? ccHours != null : !CC_HOURS_EDEFAULT.equals(ccHours);
			case TpcdsModelPackage.CALL_CENTER__CC_MANAGER:
				return CC_MANAGER_EDEFAULT == null ? ccManager != null : !CC_MANAGER_EDEFAULT.equals(ccManager);
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_ID:
				return CC_MKT_ID_EDEFAULT == null ? ccMktId != null : !CC_MKT_ID_EDEFAULT.equals(ccMktId);
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_CLASS:
				return CC_MKT_CLASS_EDEFAULT == null ? ccMktClass != null : !CC_MKT_CLASS_EDEFAULT.equals(ccMktClass);
			case TpcdsModelPackage.CALL_CENTER__CC_MKT_DESC:
				return CC_MKT_DESC_EDEFAULT == null ? ccMktDesc != null : !CC_MKT_DESC_EDEFAULT.equals(ccMktDesc);
			case TpcdsModelPackage.CALL_CENTER__CC_MARKET_MANAGER:
				return CC_MARKET_MANAGER_EDEFAULT == null ? ccMarketManager != null : !CC_MARKET_MANAGER_EDEFAULT.equals(ccMarketManager);
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION:
				return CC_DIVISION_EDEFAULT == null ? ccDivision != null : !CC_DIVISION_EDEFAULT.equals(ccDivision);
			case TpcdsModelPackage.CALL_CENTER__CC_DIVISION_NAME:
				return CC_DIVISION_NAME_EDEFAULT == null ? ccDivisionName != null : !CC_DIVISION_NAME_EDEFAULT.equals(ccDivisionName);
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY:
				return CC_COMPANY_EDEFAULT == null ? ccCompany != null : !CC_COMPANY_EDEFAULT.equals(ccCompany);
			case TpcdsModelPackage.CALL_CENTER__CC_COMPANY_NAME:
				return CC_COMPANY_NAME_EDEFAULT == null ? ccCompanyName != null : !CC_COMPANY_NAME_EDEFAULT.equals(ccCompanyName);
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NUMBER:
				return CC_STREET_NUMBER_EDEFAULT == null ? ccStreetNumber != null : !CC_STREET_NUMBER_EDEFAULT.equals(ccStreetNumber);
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_NAME:
				return CC_STREET_NAME_EDEFAULT == null ? ccStreetName != null : !CC_STREET_NAME_EDEFAULT.equals(ccStreetName);
			case TpcdsModelPackage.CALL_CENTER__CC_STREET_TYPE:
				return CC_STREET_TYPE_EDEFAULT == null ? ccStreetType != null : !CC_STREET_TYPE_EDEFAULT.equals(ccStreetType);
			case TpcdsModelPackage.CALL_CENTER__CC_SUITE_NUMBER:
				return CC_SUITE_NUMBER_EDEFAULT == null ? ccSuiteNumber != null : !CC_SUITE_NUMBER_EDEFAULT.equals(ccSuiteNumber);
			case TpcdsModelPackage.CALL_CENTER__CC_CITY:
				return CC_CITY_EDEFAULT == null ? ccCity != null : !CC_CITY_EDEFAULT.equals(ccCity);
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTY:
				return CC_COUNTY_EDEFAULT == null ? ccCounty != null : !CC_COUNTY_EDEFAULT.equals(ccCounty);
			case TpcdsModelPackage.CALL_CENTER__CC_STATE:
				return CC_STATE_EDEFAULT == null ? ccState != null : !CC_STATE_EDEFAULT.equals(ccState);
			case TpcdsModelPackage.CALL_CENTER__CC_ZIP:
				return CC_ZIP_EDEFAULT == null ? ccZip != null : !CC_ZIP_EDEFAULT.equals(ccZip);
			case TpcdsModelPackage.CALL_CENTER__CC_COUNTRY:
				return CC_COUNTRY_EDEFAULT == null ? ccCountry != null : !CC_COUNTRY_EDEFAULT.equals(ccCountry);
			case TpcdsModelPackage.CALL_CENTER__CC_GMT_OFFSET:
				return ccGmtOffset != CC_GMT_OFFSET_EDEFAULT;
			case TpcdsModelPackage.CALL_CENTER__CC_TAX_PERCENTAGE:
				return ccTaxPercentage != CC_TAX_PERCENTAGE_EDEFAULT;
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
		result.append(" (ccCallCenterSk: ");
		result.append(ccCallCenterSk);
		result.append(", ccCallCenterId: ");
		result.append(ccCallCenterId);
		result.append(", ccRecStartDate: ");
		result.append(ccRecStartDate);
		result.append(", ccRecEndDate: ");
		result.append(ccRecEndDate);
		result.append(", ccClosedDateSk: ");
		result.append(ccClosedDateSk);
		result.append(", ccOpenDateSk: ");
		result.append(ccOpenDateSk);
		result.append(", ccName: ");
		result.append(ccName);
		result.append(", ccClass: ");
		result.append(ccClass);
		result.append(", ccEmployees: ");
		result.append(ccEmployees);
		result.append(", ccSqFt: ");
		result.append(ccSqFt);
		result.append(", ccHours: ");
		result.append(ccHours);
		result.append(", ccManager: ");
		result.append(ccManager);
		result.append(", ccMktId: ");
		result.append(ccMktId);
		result.append(", ccMktClass: ");
		result.append(ccMktClass);
		result.append(", ccMktDesc: ");
		result.append(ccMktDesc);
		result.append(", ccMarketManager: ");
		result.append(ccMarketManager);
		result.append(", ccDivision: ");
		result.append(ccDivision);
		result.append(", ccDivisionName: ");
		result.append(ccDivisionName);
		result.append(", ccCompany: ");
		result.append(ccCompany);
		result.append(", ccCompanyName: ");
		result.append(ccCompanyName);
		result.append(", ccStreetNumber: ");
		result.append(ccStreetNumber);
		result.append(", ccStreetName: ");
		result.append(ccStreetName);
		result.append(", ccStreetType: ");
		result.append(ccStreetType);
		result.append(", ccSuiteNumber: ");
		result.append(ccSuiteNumber);
		result.append(", ccCity: ");
		result.append(ccCity);
		result.append(", ccCounty: ");
		result.append(ccCounty);
		result.append(", ccState: ");
		result.append(ccState);
		result.append(", ccZip: ");
		result.append(ccZip);
		result.append(", ccCountry: ");
		result.append(ccCountry);
		result.append(", ccGmtOffset: ");
		result.append(ccGmtOffset);
		result.append(", ccTaxPercentage: ");
		result.append(ccTaxPercentage);
		result.append(')');
		return result.toString();
	}

} //CallCenterImpl
