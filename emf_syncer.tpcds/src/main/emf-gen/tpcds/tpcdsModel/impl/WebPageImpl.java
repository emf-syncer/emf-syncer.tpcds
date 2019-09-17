/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.TpcdsModelPackage;
import tpcds.tpcdsModel.WebPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpWebPageSk <em>Wp Web Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpWebPageId <em>Wp Web Page Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpRecStartDate <em>Wp Rec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpRecEndDate <em>Wp Rec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpCreationDateSk <em>Wp Creation Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpAccessDateSk <em>Wp Access Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpAutogenFlag <em>Wp Autogen Flag</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpCustomerSk <em>Wp Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpUrl <em>Wp Url</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpType <em>Wp Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpCharCount <em>Wp Char Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpLinkCount <em>Wp Link Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpImageCount <em>Wp Image Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebPageImpl#getWpMaxAdCount <em>Wp Max Ad Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebPageImpl extends MinimalEObjectImpl.Container implements WebPage {
	/**
	 * The default value of the '{@link #getWpWebPageSk() <em>Wp Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpWebPageSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_WEB_PAGE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpWebPageSk() <em>Wp Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpWebPageSk()
	 * @generated
	 * @ordered
	 */
	protected Long wpWebPageSk = WP_WEB_PAGE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpWebPageId() <em>Wp Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpWebPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String WP_WEB_PAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpWebPageId() <em>Wp Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpWebPageId()
	 * @generated
	 * @ordered
	 */
	protected String wpWebPageId = WP_WEB_PAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpRecStartDate() <em>Wp Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date WP_REC_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpRecStartDate() <em>Wp Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date wpRecStartDate = WP_REC_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpRecEndDate() <em>Wp Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date WP_REC_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpRecEndDate() <em>Wp Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date wpRecEndDate = WP_REC_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpCreationDateSk() <em>Wp Creation Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpCreationDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_CREATION_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpCreationDateSk() <em>Wp Creation Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpCreationDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long wpCreationDateSk = WP_CREATION_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpAccessDateSk() <em>Wp Access Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpAccessDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_ACCESS_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpAccessDateSk() <em>Wp Access Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpAccessDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long wpAccessDateSk = WP_ACCESS_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpAutogenFlag() <em>Wp Autogen Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpAutogenFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String WP_AUTOGEN_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpAutogenFlag() <em>Wp Autogen Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpAutogenFlag()
	 * @generated
	 * @ordered
	 */
	protected String wpAutogenFlag = WP_AUTOGEN_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpCustomerSk() <em>Wp Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpCustomerSk() <em>Wp Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long wpCustomerSk = WP_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpUrl() <em>Wp Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WP_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpUrl() <em>Wp Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpUrl()
	 * @generated
	 * @ordered
	 */
	protected String wpUrl = WP_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpType() <em>Wp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpType()
	 * @generated
	 * @ordered
	 */
	protected static final String WP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpType() <em>Wp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpType()
	 * @generated
	 * @ordered
	 */
	protected String wpType = WP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpCharCount() <em>Wp Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpCharCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_CHAR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpCharCount() <em>Wp Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpCharCount()
	 * @generated
	 * @ordered
	 */
	protected Long wpCharCount = WP_CHAR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpLinkCount() <em>Wp Link Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpLinkCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_LINK_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpLinkCount() <em>Wp Link Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpLinkCount()
	 * @generated
	 * @ordered
	 */
	protected Long wpLinkCount = WP_LINK_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpImageCount() <em>Wp Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpImageCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_IMAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpImageCount() <em>Wp Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpImageCount()
	 * @generated
	 * @ordered
	 */
	protected Long wpImageCount = WP_IMAGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWpMaxAdCount() <em>Wp Max Ad Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpMaxAdCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long WP_MAX_AD_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWpMaxAdCount() <em>Wp Max Ad Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpMaxAdCount()
	 * @generated
	 * @ordered
	 */
	protected Long wpMaxAdCount = WP_MAX_AD_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.WEB_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpWebPageSk() {
		return wpWebPageSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpWebPageSk(Long newWpWebPageSk) {
		Long oldWpWebPageSk = wpWebPageSk;
		wpWebPageSk = newWpWebPageSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_SK, oldWpWebPageSk, wpWebPageSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWpWebPageId() {
		return wpWebPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpWebPageId(String newWpWebPageId) {
		String oldWpWebPageId = wpWebPageId;
		wpWebPageId = newWpWebPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_ID, oldWpWebPageId, wpWebPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getWpRecStartDate() {
		return wpRecStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpRecStartDate(Date newWpRecStartDate) {
		Date oldWpRecStartDate = wpRecStartDate;
		wpRecStartDate = newWpRecStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_REC_START_DATE, oldWpRecStartDate, wpRecStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getWpRecEndDate() {
		return wpRecEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpRecEndDate(Date newWpRecEndDate) {
		Date oldWpRecEndDate = wpRecEndDate;
		wpRecEndDate = newWpRecEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_REC_END_DATE, oldWpRecEndDate, wpRecEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpCreationDateSk() {
		return wpCreationDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpCreationDateSk(Long newWpCreationDateSk) {
		Long oldWpCreationDateSk = wpCreationDateSk;
		wpCreationDateSk = newWpCreationDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_CREATION_DATE_SK, oldWpCreationDateSk, wpCreationDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpAccessDateSk() {
		return wpAccessDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpAccessDateSk(Long newWpAccessDateSk) {
		Long oldWpAccessDateSk = wpAccessDateSk;
		wpAccessDateSk = newWpAccessDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_ACCESS_DATE_SK, oldWpAccessDateSk, wpAccessDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWpAutogenFlag() {
		return wpAutogenFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpAutogenFlag(String newWpAutogenFlag) {
		String oldWpAutogenFlag = wpAutogenFlag;
		wpAutogenFlag = newWpAutogenFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_AUTOGEN_FLAG, oldWpAutogenFlag, wpAutogenFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpCustomerSk() {
		return wpCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpCustomerSk(Long newWpCustomerSk) {
		Long oldWpCustomerSk = wpCustomerSk;
		wpCustomerSk = newWpCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_CUSTOMER_SK, oldWpCustomerSk, wpCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWpUrl() {
		return wpUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpUrl(String newWpUrl) {
		String oldWpUrl = wpUrl;
		wpUrl = newWpUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_URL, oldWpUrl, wpUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWpType() {
		return wpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpType(String newWpType) {
		String oldWpType = wpType;
		wpType = newWpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_TYPE, oldWpType, wpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpCharCount() {
		return wpCharCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpCharCount(Long newWpCharCount) {
		Long oldWpCharCount = wpCharCount;
		wpCharCount = newWpCharCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_CHAR_COUNT, oldWpCharCount, wpCharCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpLinkCount() {
		return wpLinkCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpLinkCount(Long newWpLinkCount) {
		Long oldWpLinkCount = wpLinkCount;
		wpLinkCount = newWpLinkCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_LINK_COUNT, oldWpLinkCount, wpLinkCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpImageCount() {
		return wpImageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpImageCount(Long newWpImageCount) {
		Long oldWpImageCount = wpImageCount;
		wpImageCount = newWpImageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_IMAGE_COUNT, oldWpImageCount, wpImageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWpMaxAdCount() {
		return wpMaxAdCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWpMaxAdCount(Long newWpMaxAdCount) {
		Long oldWpMaxAdCount = wpMaxAdCount;
		wpMaxAdCount = newWpMaxAdCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_PAGE__WP_MAX_AD_COUNT, oldWpMaxAdCount, wpMaxAdCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_SK:
				return getWpWebPageSk();
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_ID:
				return getWpWebPageId();
			case TpcdsModelPackage.WEB_PAGE__WP_REC_START_DATE:
				return getWpRecStartDate();
			case TpcdsModelPackage.WEB_PAGE__WP_REC_END_DATE:
				return getWpRecEndDate();
			case TpcdsModelPackage.WEB_PAGE__WP_CREATION_DATE_SK:
				return getWpCreationDateSk();
			case TpcdsModelPackage.WEB_PAGE__WP_ACCESS_DATE_SK:
				return getWpAccessDateSk();
			case TpcdsModelPackage.WEB_PAGE__WP_AUTOGEN_FLAG:
				return getWpAutogenFlag();
			case TpcdsModelPackage.WEB_PAGE__WP_CUSTOMER_SK:
				return getWpCustomerSk();
			case TpcdsModelPackage.WEB_PAGE__WP_URL:
				return getWpUrl();
			case TpcdsModelPackage.WEB_PAGE__WP_TYPE:
				return getWpType();
			case TpcdsModelPackage.WEB_PAGE__WP_CHAR_COUNT:
				return getWpCharCount();
			case TpcdsModelPackage.WEB_PAGE__WP_LINK_COUNT:
				return getWpLinkCount();
			case TpcdsModelPackage.WEB_PAGE__WP_IMAGE_COUNT:
				return getWpImageCount();
			case TpcdsModelPackage.WEB_PAGE__WP_MAX_AD_COUNT:
				return getWpMaxAdCount();
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
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_SK:
				setWpWebPageSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_ID:
				setWpWebPageId((String)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_REC_START_DATE:
				setWpRecStartDate((Date)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_REC_END_DATE:
				setWpRecEndDate((Date)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_CREATION_DATE_SK:
				setWpCreationDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_ACCESS_DATE_SK:
				setWpAccessDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_AUTOGEN_FLAG:
				setWpAutogenFlag((String)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_CUSTOMER_SK:
				setWpCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_URL:
				setWpUrl((String)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_TYPE:
				setWpType((String)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_CHAR_COUNT:
				setWpCharCount((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_LINK_COUNT:
				setWpLinkCount((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_IMAGE_COUNT:
				setWpImageCount((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_MAX_AD_COUNT:
				setWpMaxAdCount((Long)newValue);
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
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_SK:
				setWpWebPageSk(WP_WEB_PAGE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_ID:
				setWpWebPageId(WP_WEB_PAGE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_REC_START_DATE:
				setWpRecStartDate(WP_REC_START_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_REC_END_DATE:
				setWpRecEndDate(WP_REC_END_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_CREATION_DATE_SK:
				setWpCreationDateSk(WP_CREATION_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_ACCESS_DATE_SK:
				setWpAccessDateSk(WP_ACCESS_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_AUTOGEN_FLAG:
				setWpAutogenFlag(WP_AUTOGEN_FLAG_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_CUSTOMER_SK:
				setWpCustomerSk(WP_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_URL:
				setWpUrl(WP_URL_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_TYPE:
				setWpType(WP_TYPE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_CHAR_COUNT:
				setWpCharCount(WP_CHAR_COUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_LINK_COUNT:
				setWpLinkCount(WP_LINK_COUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_IMAGE_COUNT:
				setWpImageCount(WP_IMAGE_COUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_PAGE__WP_MAX_AD_COUNT:
				setWpMaxAdCount(WP_MAX_AD_COUNT_EDEFAULT);
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
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_SK:
				return WP_WEB_PAGE_SK_EDEFAULT == null ? wpWebPageSk != null : !WP_WEB_PAGE_SK_EDEFAULT.equals(wpWebPageSk);
			case TpcdsModelPackage.WEB_PAGE__WP_WEB_PAGE_ID:
				return WP_WEB_PAGE_ID_EDEFAULT == null ? wpWebPageId != null : !WP_WEB_PAGE_ID_EDEFAULT.equals(wpWebPageId);
			case TpcdsModelPackage.WEB_PAGE__WP_REC_START_DATE:
				return WP_REC_START_DATE_EDEFAULT == null ? wpRecStartDate != null : !WP_REC_START_DATE_EDEFAULT.equals(wpRecStartDate);
			case TpcdsModelPackage.WEB_PAGE__WP_REC_END_DATE:
				return WP_REC_END_DATE_EDEFAULT == null ? wpRecEndDate != null : !WP_REC_END_DATE_EDEFAULT.equals(wpRecEndDate);
			case TpcdsModelPackage.WEB_PAGE__WP_CREATION_DATE_SK:
				return WP_CREATION_DATE_SK_EDEFAULT == null ? wpCreationDateSk != null : !WP_CREATION_DATE_SK_EDEFAULT.equals(wpCreationDateSk);
			case TpcdsModelPackage.WEB_PAGE__WP_ACCESS_DATE_SK:
				return WP_ACCESS_DATE_SK_EDEFAULT == null ? wpAccessDateSk != null : !WP_ACCESS_DATE_SK_EDEFAULT.equals(wpAccessDateSk);
			case TpcdsModelPackage.WEB_PAGE__WP_AUTOGEN_FLAG:
				return WP_AUTOGEN_FLAG_EDEFAULT == null ? wpAutogenFlag != null : !WP_AUTOGEN_FLAG_EDEFAULT.equals(wpAutogenFlag);
			case TpcdsModelPackage.WEB_PAGE__WP_CUSTOMER_SK:
				return WP_CUSTOMER_SK_EDEFAULT == null ? wpCustomerSk != null : !WP_CUSTOMER_SK_EDEFAULT.equals(wpCustomerSk);
			case TpcdsModelPackage.WEB_PAGE__WP_URL:
				return WP_URL_EDEFAULT == null ? wpUrl != null : !WP_URL_EDEFAULT.equals(wpUrl);
			case TpcdsModelPackage.WEB_PAGE__WP_TYPE:
				return WP_TYPE_EDEFAULT == null ? wpType != null : !WP_TYPE_EDEFAULT.equals(wpType);
			case TpcdsModelPackage.WEB_PAGE__WP_CHAR_COUNT:
				return WP_CHAR_COUNT_EDEFAULT == null ? wpCharCount != null : !WP_CHAR_COUNT_EDEFAULT.equals(wpCharCount);
			case TpcdsModelPackage.WEB_PAGE__WP_LINK_COUNT:
				return WP_LINK_COUNT_EDEFAULT == null ? wpLinkCount != null : !WP_LINK_COUNT_EDEFAULT.equals(wpLinkCount);
			case TpcdsModelPackage.WEB_PAGE__WP_IMAGE_COUNT:
				return WP_IMAGE_COUNT_EDEFAULT == null ? wpImageCount != null : !WP_IMAGE_COUNT_EDEFAULT.equals(wpImageCount);
			case TpcdsModelPackage.WEB_PAGE__WP_MAX_AD_COUNT:
				return WP_MAX_AD_COUNT_EDEFAULT == null ? wpMaxAdCount != null : !WP_MAX_AD_COUNT_EDEFAULT.equals(wpMaxAdCount);
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
		result.append(" (wpWebPageSk: ");
		result.append(wpWebPageSk);
		result.append(", wpWebPageId: ");
		result.append(wpWebPageId);
		result.append(", wpRecStartDate: ");
		result.append(wpRecStartDate);
		result.append(", wpRecEndDate: ");
		result.append(wpRecEndDate);
		result.append(", wpCreationDateSk: ");
		result.append(wpCreationDateSk);
		result.append(", wpAccessDateSk: ");
		result.append(wpAccessDateSk);
		result.append(", wpAutogenFlag: ");
		result.append(wpAutogenFlag);
		result.append(", wpCustomerSk: ");
		result.append(wpCustomerSk);
		result.append(", wpUrl: ");
		result.append(wpUrl);
		result.append(", wpType: ");
		result.append(wpType);
		result.append(", wpCharCount: ");
		result.append(wpCharCount);
		result.append(", wpLinkCount: ");
		result.append(wpLinkCount);
		result.append(", wpImageCount: ");
		result.append(wpImageCount);
		result.append(", wpMaxAdCount: ");
		result.append(wpMaxAdCount);
		result.append(')');
		return result.toString();
	}

} //WebPageImpl
