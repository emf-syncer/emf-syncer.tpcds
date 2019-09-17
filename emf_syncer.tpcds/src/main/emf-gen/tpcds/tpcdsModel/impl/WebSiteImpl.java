/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.TpcdsModelPackage;
import tpcds.tpcdsModel.WebSite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebSiteSk <em>Web Site Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebRecStartDate <em>Web Rec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebRecEndDate <em>Web Rec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebName <em>Web Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebOpenDateSk <em>Web Open Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebCloseDateSk <em>Web Close Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebClass <em>Web Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebManager <em>Web Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebMktId <em>Web Mkt Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebMktClass <em>Web Mkt Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebMktDesc <em>Web Mkt Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebMarketManager <em>Web Market Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebCompanyId <em>Web Company Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebCompanyName <em>Web Company Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebStreetNumber <em>Web Street Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebStreetName <em>Web Street Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebStreetType <em>Web Street Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebSuiteNumber <em>Web Suite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebCity <em>Web City</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebCounty <em>Web County</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebState <em>Web State</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebZip <em>Web Zip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebCountry <em>Web Country</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebGmtOffset <em>Web Gmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSiteImpl#getWebTaxPercentage <em>Web Tax Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteImpl extends MinimalEObjectImpl.Container implements WebSite {
	/**
	 * The default value of the '{@link #getWebSiteSk() <em>Web Site Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEB_SITE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSiteSk() <em>Web Site Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteSk()
	 * @generated
	 * @ordered
	 */
	protected Long webSiteSk = WEB_SITE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected String webSiteId = WEB_SITE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebRecStartDate() <em>Web Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date WEB_REC_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebRecStartDate() <em>Web Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date webRecStartDate = WEB_REC_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebRecEndDate() <em>Web Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date WEB_REC_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebRecEndDate() <em>Web Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date webRecEndDate = WEB_REC_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebName() <em>Web Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebName() <em>Web Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebName()
	 * @generated
	 * @ordered
	 */
	protected String webName = WEB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebOpenDateSk() <em>Web Open Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebOpenDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEB_OPEN_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebOpenDateSk() <em>Web Open Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebOpenDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long webOpenDateSk = WEB_OPEN_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebCloseDateSk() <em>Web Close Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCloseDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEB_CLOSE_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebCloseDateSk() <em>Web Close Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCloseDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long webCloseDateSk = WEB_CLOSE_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebClass() <em>Web Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebClass()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebClass() <em>Web Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebClass()
	 * @generated
	 * @ordered
	 */
	protected String webClass = WEB_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebManager() <em>Web Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebManager()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebManager() <em>Web Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebManager()
	 * @generated
	 * @ordered
	 */
	protected String webManager = WEB_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebMktId() <em>Web Mkt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMktId()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEB_MKT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebMktId() <em>Web Mkt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMktId()
	 * @generated
	 * @ordered
	 */
	protected Long webMktId = WEB_MKT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebMktClass() <em>Web Mkt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMktClass()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_MKT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebMktClass() <em>Web Mkt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMktClass()
	 * @generated
	 * @ordered
	 */
	protected String webMktClass = WEB_MKT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebMktDesc() <em>Web Mkt Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMktDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_MKT_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebMktDesc() <em>Web Mkt Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMktDesc()
	 * @generated
	 * @ordered
	 */
	protected String webMktDesc = WEB_MKT_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebMarketManager() <em>Web Market Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMarketManager()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_MARKET_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebMarketManager() <em>Web Market Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebMarketManager()
	 * @generated
	 * @ordered
	 */
	protected String webMarketManager = WEB_MARKET_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebCompanyId() <em>Web Company Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCompanyId()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEB_COMPANY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebCompanyId() <em>Web Company Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCompanyId()
	 * @generated
	 * @ordered
	 */
	protected Long webCompanyId = WEB_COMPANY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebCompanyName() <em>Web Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebCompanyName() <em>Web Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String webCompanyName = WEB_COMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebStreetNumber() <em>Web Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_STREET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebStreetNumber() <em>Web Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebStreetNumber()
	 * @generated
	 * @ordered
	 */
	protected String webStreetNumber = WEB_STREET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebStreetName() <em>Web Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_STREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebStreetName() <em>Web Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebStreetName()
	 * @generated
	 * @ordered
	 */
	protected String webStreetName = WEB_STREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebStreetType() <em>Web Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebStreetType()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_STREET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebStreetType() <em>Web Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebStreetType()
	 * @generated
	 * @ordered
	 */
	protected String webStreetType = WEB_STREET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebSuiteNumber() <em>Web Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_SUITE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSuiteNumber() <em>Web Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSuiteNumber()
	 * @generated
	 * @ordered
	 */
	protected String webSuiteNumber = WEB_SUITE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebCity() <em>Web City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCity()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebCity() <em>Web City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCity()
	 * @generated
	 * @ordered
	 */
	protected String webCity = WEB_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebCounty() <em>Web County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_COUNTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebCounty() <em>Web County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCounty()
	 * @generated
	 * @ordered
	 */
	protected String webCounty = WEB_COUNTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebState() <em>Web State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebState()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebState() <em>Web State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebState()
	 * @generated
	 * @ordered
	 */
	protected String webState = WEB_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebZip() <em>Web Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebZip()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebZip() <em>Web Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebZip()
	 * @generated
	 * @ordered
	 */
	protected String webZip = WEB_ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebCountry() <em>Web Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebCountry() <em>Web Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebCountry()
	 * @generated
	 * @ordered
	 */
	protected String webCountry = WEB_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebGmtOffset() <em>Web Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double WEB_GMT_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWebGmtOffset() <em>Web Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebGmtOffset()
	 * @generated
	 * @ordered
	 */
	protected double webGmtOffset = WEB_GMT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebTaxPercentage() <em>Web Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double WEB_TAX_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWebTaxPercentage() <em>Web Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected double webTaxPercentage = WEB_TAX_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.WEB_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWebSiteSk() {
		return webSiteSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteSk(Long newWebSiteSk) {
		Long oldWebSiteSk = webSiteSk;
		webSiteSk = newWebSiteSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_SITE_SK, oldWebSiteSk, webSiteSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebSiteId() {
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(String newWebSiteId) {
		String oldWebSiteId = webSiteId;
		webSiteId = newWebSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_SITE_ID, oldWebSiteId, webSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getWebRecStartDate() {
		return webRecStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebRecStartDate(Date newWebRecStartDate) {
		Date oldWebRecStartDate = webRecStartDate;
		webRecStartDate = newWebRecStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_REC_START_DATE, oldWebRecStartDate, webRecStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getWebRecEndDate() {
		return webRecEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebRecEndDate(Date newWebRecEndDate) {
		Date oldWebRecEndDate = webRecEndDate;
		webRecEndDate = newWebRecEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_REC_END_DATE, oldWebRecEndDate, webRecEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebName() {
		return webName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebName(String newWebName) {
		String oldWebName = webName;
		webName = newWebName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_NAME, oldWebName, webName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWebOpenDateSk() {
		return webOpenDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebOpenDateSk(Long newWebOpenDateSk) {
		Long oldWebOpenDateSk = webOpenDateSk;
		webOpenDateSk = newWebOpenDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_OPEN_DATE_SK, oldWebOpenDateSk, webOpenDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWebCloseDateSk() {
		return webCloseDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebCloseDateSk(Long newWebCloseDateSk) {
		Long oldWebCloseDateSk = webCloseDateSk;
		webCloseDateSk = newWebCloseDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_CLOSE_DATE_SK, oldWebCloseDateSk, webCloseDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebClass() {
		return webClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebClass(String newWebClass) {
		String oldWebClass = webClass;
		webClass = newWebClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_CLASS, oldWebClass, webClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebManager() {
		return webManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebManager(String newWebManager) {
		String oldWebManager = webManager;
		webManager = newWebManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_MANAGER, oldWebManager, webManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWebMktId() {
		return webMktId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebMktId(Long newWebMktId) {
		Long oldWebMktId = webMktId;
		webMktId = newWebMktId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_MKT_ID, oldWebMktId, webMktId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebMktClass() {
		return webMktClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebMktClass(String newWebMktClass) {
		String oldWebMktClass = webMktClass;
		webMktClass = newWebMktClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_MKT_CLASS, oldWebMktClass, webMktClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebMktDesc() {
		return webMktDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebMktDesc(String newWebMktDesc) {
		String oldWebMktDesc = webMktDesc;
		webMktDesc = newWebMktDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_MKT_DESC, oldWebMktDesc, webMktDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebMarketManager() {
		return webMarketManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebMarketManager(String newWebMarketManager) {
		String oldWebMarketManager = webMarketManager;
		webMarketManager = newWebMarketManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_MARKET_MANAGER, oldWebMarketManager, webMarketManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWebCompanyId() {
		return webCompanyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebCompanyId(Long newWebCompanyId) {
		Long oldWebCompanyId = webCompanyId;
		webCompanyId = newWebCompanyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_COMPANY_ID, oldWebCompanyId, webCompanyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebCompanyName() {
		return webCompanyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebCompanyName(String newWebCompanyName) {
		String oldWebCompanyName = webCompanyName;
		webCompanyName = newWebCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_COMPANY_NAME, oldWebCompanyName, webCompanyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebStreetNumber() {
		return webStreetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebStreetNumber(String newWebStreetNumber) {
		String oldWebStreetNumber = webStreetNumber;
		webStreetNumber = newWebStreetNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_STREET_NUMBER, oldWebStreetNumber, webStreetNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebStreetName() {
		return webStreetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebStreetName(String newWebStreetName) {
		String oldWebStreetName = webStreetName;
		webStreetName = newWebStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_STREET_NAME, oldWebStreetName, webStreetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebStreetType() {
		return webStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebStreetType(String newWebStreetType) {
		String oldWebStreetType = webStreetType;
		webStreetType = newWebStreetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_STREET_TYPE, oldWebStreetType, webStreetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebSuiteNumber() {
		return webSuiteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSuiteNumber(String newWebSuiteNumber) {
		String oldWebSuiteNumber = webSuiteNumber;
		webSuiteNumber = newWebSuiteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_SUITE_NUMBER, oldWebSuiteNumber, webSuiteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebCity() {
		return webCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebCity(String newWebCity) {
		String oldWebCity = webCity;
		webCity = newWebCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_CITY, oldWebCity, webCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebCounty() {
		return webCounty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebCounty(String newWebCounty) {
		String oldWebCounty = webCounty;
		webCounty = newWebCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_COUNTY, oldWebCounty, webCounty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebState() {
		return webState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebState(String newWebState) {
		String oldWebState = webState;
		webState = newWebState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_STATE, oldWebState, webState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebZip() {
		return webZip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebZip(String newWebZip) {
		String oldWebZip = webZip;
		webZip = newWebZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_ZIP, oldWebZip, webZip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebCountry() {
		return webCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebCountry(String newWebCountry) {
		String oldWebCountry = webCountry;
		webCountry = newWebCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_COUNTRY, oldWebCountry, webCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWebGmtOffset() {
		return webGmtOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebGmtOffset(double newWebGmtOffset) {
		double oldWebGmtOffset = webGmtOffset;
		webGmtOffset = newWebGmtOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_GMT_OFFSET, oldWebGmtOffset, webGmtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWebTaxPercentage() {
		return webTaxPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebTaxPercentage(double newWebTaxPercentage) {
		double oldWebTaxPercentage = webTaxPercentage;
		webTaxPercentage = newWebTaxPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SITE__WEB_TAX_PERCENTAGE, oldWebTaxPercentage, webTaxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_SK:
				return getWebSiteSk();
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_ID:
				return getWebSiteId();
			case TpcdsModelPackage.WEB_SITE__WEB_REC_START_DATE:
				return getWebRecStartDate();
			case TpcdsModelPackage.WEB_SITE__WEB_REC_END_DATE:
				return getWebRecEndDate();
			case TpcdsModelPackage.WEB_SITE__WEB_NAME:
				return getWebName();
			case TpcdsModelPackage.WEB_SITE__WEB_OPEN_DATE_SK:
				return getWebOpenDateSk();
			case TpcdsModelPackage.WEB_SITE__WEB_CLOSE_DATE_SK:
				return getWebCloseDateSk();
			case TpcdsModelPackage.WEB_SITE__WEB_CLASS:
				return getWebClass();
			case TpcdsModelPackage.WEB_SITE__WEB_MANAGER:
				return getWebManager();
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_ID:
				return getWebMktId();
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_CLASS:
				return getWebMktClass();
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_DESC:
				return getWebMktDesc();
			case TpcdsModelPackage.WEB_SITE__WEB_MARKET_MANAGER:
				return getWebMarketManager();
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_ID:
				return getWebCompanyId();
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_NAME:
				return getWebCompanyName();
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NUMBER:
				return getWebStreetNumber();
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NAME:
				return getWebStreetName();
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_TYPE:
				return getWebStreetType();
			case TpcdsModelPackage.WEB_SITE__WEB_SUITE_NUMBER:
				return getWebSuiteNumber();
			case TpcdsModelPackage.WEB_SITE__WEB_CITY:
				return getWebCity();
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTY:
				return getWebCounty();
			case TpcdsModelPackage.WEB_SITE__WEB_STATE:
				return getWebState();
			case TpcdsModelPackage.WEB_SITE__WEB_ZIP:
				return getWebZip();
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTRY:
				return getWebCountry();
			case TpcdsModelPackage.WEB_SITE__WEB_GMT_OFFSET:
				return getWebGmtOffset();
			case TpcdsModelPackage.WEB_SITE__WEB_TAX_PERCENTAGE:
				return getWebTaxPercentage();
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
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_SK:
				setWebSiteSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_ID:
				setWebSiteId((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_REC_START_DATE:
				setWebRecStartDate((Date)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_REC_END_DATE:
				setWebRecEndDate((Date)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_NAME:
				setWebName((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_OPEN_DATE_SK:
				setWebOpenDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_CLOSE_DATE_SK:
				setWebCloseDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_CLASS:
				setWebClass((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MANAGER:
				setWebManager((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_ID:
				setWebMktId((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_CLASS:
				setWebMktClass((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_DESC:
				setWebMktDesc((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MARKET_MANAGER:
				setWebMarketManager((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_ID:
				setWebCompanyId((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_NAME:
				setWebCompanyName((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NUMBER:
				setWebStreetNumber((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NAME:
				setWebStreetName((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_TYPE:
				setWebStreetType((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_SUITE_NUMBER:
				setWebSuiteNumber((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_CITY:
				setWebCity((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTY:
				setWebCounty((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STATE:
				setWebState((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_ZIP:
				setWebZip((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTRY:
				setWebCountry((String)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_GMT_OFFSET:
				setWebGmtOffset((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_TAX_PERCENTAGE:
				setWebTaxPercentage((Double)newValue);
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
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_SK:
				setWebSiteSk(WEB_SITE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_ID:
				setWebSiteId(WEB_SITE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_REC_START_DATE:
				setWebRecStartDate(WEB_REC_START_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_REC_END_DATE:
				setWebRecEndDate(WEB_REC_END_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_NAME:
				setWebName(WEB_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_OPEN_DATE_SK:
				setWebOpenDateSk(WEB_OPEN_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_CLOSE_DATE_SK:
				setWebCloseDateSk(WEB_CLOSE_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_CLASS:
				setWebClass(WEB_CLASS_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MANAGER:
				setWebManager(WEB_MANAGER_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_ID:
				setWebMktId(WEB_MKT_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_CLASS:
				setWebMktClass(WEB_MKT_CLASS_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_DESC:
				setWebMktDesc(WEB_MKT_DESC_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_MARKET_MANAGER:
				setWebMarketManager(WEB_MARKET_MANAGER_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_ID:
				setWebCompanyId(WEB_COMPANY_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_NAME:
				setWebCompanyName(WEB_COMPANY_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NUMBER:
				setWebStreetNumber(WEB_STREET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NAME:
				setWebStreetName(WEB_STREET_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_TYPE:
				setWebStreetType(WEB_STREET_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_SUITE_NUMBER:
				setWebSuiteNumber(WEB_SUITE_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_CITY:
				setWebCity(WEB_CITY_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTY:
				setWebCounty(WEB_COUNTY_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_STATE:
				setWebState(WEB_STATE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_ZIP:
				setWebZip(WEB_ZIP_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTRY:
				setWebCountry(WEB_COUNTRY_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_GMT_OFFSET:
				setWebGmtOffset(WEB_GMT_OFFSET_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SITE__WEB_TAX_PERCENTAGE:
				setWebTaxPercentage(WEB_TAX_PERCENTAGE_EDEFAULT);
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
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_SK:
				return WEB_SITE_SK_EDEFAULT == null ? webSiteSk != null : !WEB_SITE_SK_EDEFAULT.equals(webSiteSk);
			case TpcdsModelPackage.WEB_SITE__WEB_SITE_ID:
				return WEB_SITE_ID_EDEFAULT == null ? webSiteId != null : !WEB_SITE_ID_EDEFAULT.equals(webSiteId);
			case TpcdsModelPackage.WEB_SITE__WEB_REC_START_DATE:
				return WEB_REC_START_DATE_EDEFAULT == null ? webRecStartDate != null : !WEB_REC_START_DATE_EDEFAULT.equals(webRecStartDate);
			case TpcdsModelPackage.WEB_SITE__WEB_REC_END_DATE:
				return WEB_REC_END_DATE_EDEFAULT == null ? webRecEndDate != null : !WEB_REC_END_DATE_EDEFAULT.equals(webRecEndDate);
			case TpcdsModelPackage.WEB_SITE__WEB_NAME:
				return WEB_NAME_EDEFAULT == null ? webName != null : !WEB_NAME_EDEFAULT.equals(webName);
			case TpcdsModelPackage.WEB_SITE__WEB_OPEN_DATE_SK:
				return WEB_OPEN_DATE_SK_EDEFAULT == null ? webOpenDateSk != null : !WEB_OPEN_DATE_SK_EDEFAULT.equals(webOpenDateSk);
			case TpcdsModelPackage.WEB_SITE__WEB_CLOSE_DATE_SK:
				return WEB_CLOSE_DATE_SK_EDEFAULT == null ? webCloseDateSk != null : !WEB_CLOSE_DATE_SK_EDEFAULT.equals(webCloseDateSk);
			case TpcdsModelPackage.WEB_SITE__WEB_CLASS:
				return WEB_CLASS_EDEFAULT == null ? webClass != null : !WEB_CLASS_EDEFAULT.equals(webClass);
			case TpcdsModelPackage.WEB_SITE__WEB_MANAGER:
				return WEB_MANAGER_EDEFAULT == null ? webManager != null : !WEB_MANAGER_EDEFAULT.equals(webManager);
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_ID:
				return WEB_MKT_ID_EDEFAULT == null ? webMktId != null : !WEB_MKT_ID_EDEFAULT.equals(webMktId);
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_CLASS:
				return WEB_MKT_CLASS_EDEFAULT == null ? webMktClass != null : !WEB_MKT_CLASS_EDEFAULT.equals(webMktClass);
			case TpcdsModelPackage.WEB_SITE__WEB_MKT_DESC:
				return WEB_MKT_DESC_EDEFAULT == null ? webMktDesc != null : !WEB_MKT_DESC_EDEFAULT.equals(webMktDesc);
			case TpcdsModelPackage.WEB_SITE__WEB_MARKET_MANAGER:
				return WEB_MARKET_MANAGER_EDEFAULT == null ? webMarketManager != null : !WEB_MARKET_MANAGER_EDEFAULT.equals(webMarketManager);
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_ID:
				return WEB_COMPANY_ID_EDEFAULT == null ? webCompanyId != null : !WEB_COMPANY_ID_EDEFAULT.equals(webCompanyId);
			case TpcdsModelPackage.WEB_SITE__WEB_COMPANY_NAME:
				return WEB_COMPANY_NAME_EDEFAULT == null ? webCompanyName != null : !WEB_COMPANY_NAME_EDEFAULT.equals(webCompanyName);
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NUMBER:
				return WEB_STREET_NUMBER_EDEFAULT == null ? webStreetNumber != null : !WEB_STREET_NUMBER_EDEFAULT.equals(webStreetNumber);
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_NAME:
				return WEB_STREET_NAME_EDEFAULT == null ? webStreetName != null : !WEB_STREET_NAME_EDEFAULT.equals(webStreetName);
			case TpcdsModelPackage.WEB_SITE__WEB_STREET_TYPE:
				return WEB_STREET_TYPE_EDEFAULT == null ? webStreetType != null : !WEB_STREET_TYPE_EDEFAULT.equals(webStreetType);
			case TpcdsModelPackage.WEB_SITE__WEB_SUITE_NUMBER:
				return WEB_SUITE_NUMBER_EDEFAULT == null ? webSuiteNumber != null : !WEB_SUITE_NUMBER_EDEFAULT.equals(webSuiteNumber);
			case TpcdsModelPackage.WEB_SITE__WEB_CITY:
				return WEB_CITY_EDEFAULT == null ? webCity != null : !WEB_CITY_EDEFAULT.equals(webCity);
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTY:
				return WEB_COUNTY_EDEFAULT == null ? webCounty != null : !WEB_COUNTY_EDEFAULT.equals(webCounty);
			case TpcdsModelPackage.WEB_SITE__WEB_STATE:
				return WEB_STATE_EDEFAULT == null ? webState != null : !WEB_STATE_EDEFAULT.equals(webState);
			case TpcdsModelPackage.WEB_SITE__WEB_ZIP:
				return WEB_ZIP_EDEFAULT == null ? webZip != null : !WEB_ZIP_EDEFAULT.equals(webZip);
			case TpcdsModelPackage.WEB_SITE__WEB_COUNTRY:
				return WEB_COUNTRY_EDEFAULT == null ? webCountry != null : !WEB_COUNTRY_EDEFAULT.equals(webCountry);
			case TpcdsModelPackage.WEB_SITE__WEB_GMT_OFFSET:
				return webGmtOffset != WEB_GMT_OFFSET_EDEFAULT;
			case TpcdsModelPackage.WEB_SITE__WEB_TAX_PERCENTAGE:
				return webTaxPercentage != WEB_TAX_PERCENTAGE_EDEFAULT;
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
		result.append(" (webSiteSk: ");
		result.append(webSiteSk);
		result.append(", webSiteId: ");
		result.append(webSiteId);
		result.append(", webRecStartDate: ");
		result.append(webRecStartDate);
		result.append(", webRecEndDate: ");
		result.append(webRecEndDate);
		result.append(", webName: ");
		result.append(webName);
		result.append(", webOpenDateSk: ");
		result.append(webOpenDateSk);
		result.append(", webCloseDateSk: ");
		result.append(webCloseDateSk);
		result.append(", webClass: ");
		result.append(webClass);
		result.append(", webManager: ");
		result.append(webManager);
		result.append(", webMktId: ");
		result.append(webMktId);
		result.append(", webMktClass: ");
		result.append(webMktClass);
		result.append(", webMktDesc: ");
		result.append(webMktDesc);
		result.append(", webMarketManager: ");
		result.append(webMarketManager);
		result.append(", webCompanyId: ");
		result.append(webCompanyId);
		result.append(", webCompanyName: ");
		result.append(webCompanyName);
		result.append(", webStreetNumber: ");
		result.append(webStreetNumber);
		result.append(", webStreetName: ");
		result.append(webStreetName);
		result.append(", webStreetType: ");
		result.append(webStreetType);
		result.append(", webSuiteNumber: ");
		result.append(webSuiteNumber);
		result.append(", webCity: ");
		result.append(webCity);
		result.append(", webCounty: ");
		result.append(webCounty);
		result.append(", webState: ");
		result.append(webState);
		result.append(", webZip: ");
		result.append(webZip);
		result.append(", webCountry: ");
		result.append(webCountry);
		result.append(", webGmtOffset: ");
		result.append(webGmtOffset);
		result.append(", webTaxPercentage: ");
		result.append(webTaxPercentage);
		result.append(')');
		return result.toString();
	}

} //WebSiteImpl
