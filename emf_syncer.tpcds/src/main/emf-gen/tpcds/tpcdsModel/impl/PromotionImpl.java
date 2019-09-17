/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Promotion;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Promotion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPPromoSk <em>PPromo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPPromoId <em>PPromo Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPStartDateSk <em>PStart Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPEndDateSk <em>PEnd Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPItemSk <em>PItem Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPCost <em>PCost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPResponseTarget <em>PResponse Target</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPPromoName <em>PPromo Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelDmail <em>PChannel Dmail</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelEmail <em>PChannel Email</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelCatalog <em>PChannel Catalog</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelTv <em>PChannel Tv</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelRadio <em>PChannel Radio</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelPress <em>PChannel Press</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelEvent <em>PChannel Event</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelDemo <em>PChannel Demo</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPChannelDetails <em>PChannel Details</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPPurpose <em>PPurpose</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.PromotionImpl#getPDiscountActive <em>PDiscount Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PromotionImpl extends MinimalEObjectImpl.Container implements Promotion {
	/**
	 * The default value of the '{@link #getPPromoSk() <em>PPromo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPromoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long PPROMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPromoSk() <em>PPromo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPromoSk()
	 * @generated
	 * @ordered
	 */
	protected Long pPromoSk = PPROMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPromoId() <em>PPromo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PPROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPromoId() <em>PPromo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPromoId()
	 * @generated
	 * @ordered
	 */
	protected String pPromoId = PPROMO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPStartDateSk() <em>PStart Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStartDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long PSTART_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPStartDateSk() <em>PStart Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPStartDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long pStartDateSk = PSTART_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPEndDateSk() <em>PEnd Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEndDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long PEND_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPEndDateSk() <em>PEnd Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEndDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long pEndDateSk = PEND_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPItemSk() <em>PItem Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long PITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPItemSk() <em>PItem Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long pItemSk = PITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCost() <em>PCost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCost()
	 * @generated
	 * @ordered
	 */
	protected static final double PCOST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPCost() <em>PCost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCost()
	 * @generated
	 * @ordered
	 */
	protected double pCost = PCOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPResponseTarget() <em>PResponse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPResponseTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRESPONSE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPResponseTarget() <em>PResponse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPResponseTarget()
	 * @generated
	 * @ordered
	 */
	protected Long pResponseTarget = PRESPONSE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPromoName() <em>PPromo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPromoName()
	 * @generated
	 * @ordered
	 */
	protected static final String PPROMO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPromoName() <em>PPromo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPromoName()
	 * @generated
	 * @ordered
	 */
	protected String pPromoName = PPROMO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelDmail() <em>PChannel Dmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelDmail()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_DMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelDmail() <em>PChannel Dmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelDmail()
	 * @generated
	 * @ordered
	 */
	protected String pChannelDmail = PCHANNEL_DMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelEmail() <em>PChannel Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelEmail() <em>PChannel Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelEmail()
	 * @generated
	 * @ordered
	 */
	protected String pChannelEmail = PCHANNEL_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelCatalog() <em>PChannel Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelCatalog() <em>PChannel Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelCatalog()
	 * @generated
	 * @ordered
	 */
	protected String pChannelCatalog = PCHANNEL_CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelTv() <em>PChannel Tv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelTv()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_TV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelTv() <em>PChannel Tv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelTv()
	 * @generated
	 * @ordered
	 */
	protected String pChannelTv = PCHANNEL_TV_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelRadio() <em>PChannel Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelRadio()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_RADIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelRadio() <em>PChannel Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelRadio()
	 * @generated
	 * @ordered
	 */
	protected String pChannelRadio = PCHANNEL_RADIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelPress() <em>PChannel Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelPress()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_PRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelPress() <em>PChannel Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelPress()
	 * @generated
	 * @ordered
	 */
	protected String pChannelPress = PCHANNEL_PRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelEvent() <em>PChannel Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelEvent() <em>PChannel Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelEvent()
	 * @generated
	 * @ordered
	 */
	protected String pChannelEvent = PCHANNEL_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelDemo() <em>PChannel Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelDemo()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_DEMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelDemo() <em>PChannel Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelDemo()
	 * @generated
	 * @ordered
	 */
	protected String pChannelDemo = PCHANNEL_DEMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPChannelDetails() <em>PChannel Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String PCHANNEL_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPChannelDetails() <em>PChannel Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPChannelDetails()
	 * @generated
	 * @ordered
	 */
	protected String pChannelDetails = PCHANNEL_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPurpose() <em>PPurpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PPURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPurpose() <em>PPurpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPurpose()
	 * @generated
	 * @ordered
	 */
	protected String pPurpose = PPURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPDiscountActive() <em>PDiscount Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDiscountActive()
	 * @generated
	 * @ordered
	 */
	protected static final String PDISCOUNT_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDiscountActive() <em>PDiscount Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDiscountActive()
	 * @generated
	 * @ordered
	 */
	protected String pDiscountActive = PDISCOUNT_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.PROMOTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPPromoSk() {
		return pPromoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPromoSk(Long newPPromoSk) {
		Long oldPPromoSk = pPromoSk;
		pPromoSk = newPPromoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PPROMO_SK, oldPPromoSk, pPromoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPromoId() {
		return pPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPromoId(String newPPromoId) {
		String oldPPromoId = pPromoId;
		pPromoId = newPPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PPROMO_ID, oldPPromoId, pPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPStartDateSk() {
		return pStartDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPStartDateSk(Long newPStartDateSk) {
		Long oldPStartDateSk = pStartDateSk;
		pStartDateSk = newPStartDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PSTART_DATE_SK, oldPStartDateSk, pStartDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPEndDateSk() {
		return pEndDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPEndDateSk(Long newPEndDateSk) {
		Long oldPEndDateSk = pEndDateSk;
		pEndDateSk = newPEndDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PEND_DATE_SK, oldPEndDateSk, pEndDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPItemSk() {
		return pItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPItemSk(Long newPItemSk) {
		Long oldPItemSk = pItemSk;
		pItemSk = newPItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PITEM_SK, oldPItemSk, pItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPCost() {
		return pCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCost(double newPCost) {
		double oldPCost = pCost;
		pCost = newPCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCOST, oldPCost, pCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPResponseTarget() {
		return pResponseTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPResponseTarget(Long newPResponseTarget) {
		Long oldPResponseTarget = pResponseTarget;
		pResponseTarget = newPResponseTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PRESPONSE_TARGET, oldPResponseTarget, pResponseTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPromoName() {
		return pPromoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPromoName(String newPPromoName) {
		String oldPPromoName = pPromoName;
		pPromoName = newPPromoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PPROMO_NAME, oldPPromoName, pPromoName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelDmail() {
		return pChannelDmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelDmail(String newPChannelDmail) {
		String oldPChannelDmail = pChannelDmail;
		pChannelDmail = newPChannelDmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_DMAIL, oldPChannelDmail, pChannelDmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelEmail() {
		return pChannelEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelEmail(String newPChannelEmail) {
		String oldPChannelEmail = pChannelEmail;
		pChannelEmail = newPChannelEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_EMAIL, oldPChannelEmail, pChannelEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelCatalog() {
		return pChannelCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelCatalog(String newPChannelCatalog) {
		String oldPChannelCatalog = pChannelCatalog;
		pChannelCatalog = newPChannelCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_CATALOG, oldPChannelCatalog, pChannelCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelTv() {
		return pChannelTv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelTv(String newPChannelTv) {
		String oldPChannelTv = pChannelTv;
		pChannelTv = newPChannelTv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_TV, oldPChannelTv, pChannelTv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelRadio() {
		return pChannelRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelRadio(String newPChannelRadio) {
		String oldPChannelRadio = pChannelRadio;
		pChannelRadio = newPChannelRadio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_RADIO, oldPChannelRadio, pChannelRadio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelPress() {
		return pChannelPress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelPress(String newPChannelPress) {
		String oldPChannelPress = pChannelPress;
		pChannelPress = newPChannelPress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_PRESS, oldPChannelPress, pChannelPress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelEvent() {
		return pChannelEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelEvent(String newPChannelEvent) {
		String oldPChannelEvent = pChannelEvent;
		pChannelEvent = newPChannelEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_EVENT, oldPChannelEvent, pChannelEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelDemo() {
		return pChannelDemo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelDemo(String newPChannelDemo) {
		String oldPChannelDemo = pChannelDemo;
		pChannelDemo = newPChannelDemo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_DEMO, oldPChannelDemo, pChannelDemo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPChannelDetails() {
		return pChannelDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPChannelDetails(String newPChannelDetails) {
		String oldPChannelDetails = pChannelDetails;
		pChannelDetails = newPChannelDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PCHANNEL_DETAILS, oldPChannelDetails, pChannelDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPPurpose() {
		return pPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPPurpose(String newPPurpose) {
		String oldPPurpose = pPurpose;
		pPurpose = newPPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PPURPOSE, oldPPurpose, pPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPDiscountActive() {
		return pDiscountActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPDiscountActive(String newPDiscountActive) {
		String oldPDiscountActive = pDiscountActive;
		pDiscountActive = newPDiscountActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.PROMOTION__PDISCOUNT_ACTIVE, oldPDiscountActive, pDiscountActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.PROMOTION__PPROMO_SK:
				return getPPromoSk();
			case TpcdsModelPackage.PROMOTION__PPROMO_ID:
				return getPPromoId();
			case TpcdsModelPackage.PROMOTION__PSTART_DATE_SK:
				return getPStartDateSk();
			case TpcdsModelPackage.PROMOTION__PEND_DATE_SK:
				return getPEndDateSk();
			case TpcdsModelPackage.PROMOTION__PITEM_SK:
				return getPItemSk();
			case TpcdsModelPackage.PROMOTION__PCOST:
				return getPCost();
			case TpcdsModelPackage.PROMOTION__PRESPONSE_TARGET:
				return getPResponseTarget();
			case TpcdsModelPackage.PROMOTION__PPROMO_NAME:
				return getPPromoName();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DMAIL:
				return getPChannelDmail();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EMAIL:
				return getPChannelEmail();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_CATALOG:
				return getPChannelCatalog();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_TV:
				return getPChannelTv();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_RADIO:
				return getPChannelRadio();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_PRESS:
				return getPChannelPress();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EVENT:
				return getPChannelEvent();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DEMO:
				return getPChannelDemo();
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DETAILS:
				return getPChannelDetails();
			case TpcdsModelPackage.PROMOTION__PPURPOSE:
				return getPPurpose();
			case TpcdsModelPackage.PROMOTION__PDISCOUNT_ACTIVE:
				return getPDiscountActive();
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
			case TpcdsModelPackage.PROMOTION__PPROMO_SK:
				setPPromoSk((Long)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PPROMO_ID:
				setPPromoId((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PSTART_DATE_SK:
				setPStartDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PEND_DATE_SK:
				setPEndDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PITEM_SK:
				setPItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCOST:
				setPCost((Double)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PRESPONSE_TARGET:
				setPResponseTarget((Long)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PPROMO_NAME:
				setPPromoName((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DMAIL:
				setPChannelDmail((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EMAIL:
				setPChannelEmail((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_CATALOG:
				setPChannelCatalog((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_TV:
				setPChannelTv((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_RADIO:
				setPChannelRadio((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_PRESS:
				setPChannelPress((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EVENT:
				setPChannelEvent((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DEMO:
				setPChannelDemo((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DETAILS:
				setPChannelDetails((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PPURPOSE:
				setPPurpose((String)newValue);
				return;
			case TpcdsModelPackage.PROMOTION__PDISCOUNT_ACTIVE:
				setPDiscountActive((String)newValue);
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
			case TpcdsModelPackage.PROMOTION__PPROMO_SK:
				setPPromoSk(PPROMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PPROMO_ID:
				setPPromoId(PPROMO_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PSTART_DATE_SK:
				setPStartDateSk(PSTART_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PEND_DATE_SK:
				setPEndDateSk(PEND_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PITEM_SK:
				setPItemSk(PITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCOST:
				setPCost(PCOST_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PRESPONSE_TARGET:
				setPResponseTarget(PRESPONSE_TARGET_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PPROMO_NAME:
				setPPromoName(PPROMO_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DMAIL:
				setPChannelDmail(PCHANNEL_DMAIL_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EMAIL:
				setPChannelEmail(PCHANNEL_EMAIL_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_CATALOG:
				setPChannelCatalog(PCHANNEL_CATALOG_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_TV:
				setPChannelTv(PCHANNEL_TV_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_RADIO:
				setPChannelRadio(PCHANNEL_RADIO_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_PRESS:
				setPChannelPress(PCHANNEL_PRESS_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EVENT:
				setPChannelEvent(PCHANNEL_EVENT_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DEMO:
				setPChannelDemo(PCHANNEL_DEMO_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DETAILS:
				setPChannelDetails(PCHANNEL_DETAILS_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PPURPOSE:
				setPPurpose(PPURPOSE_EDEFAULT);
				return;
			case TpcdsModelPackage.PROMOTION__PDISCOUNT_ACTIVE:
				setPDiscountActive(PDISCOUNT_ACTIVE_EDEFAULT);
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
			case TpcdsModelPackage.PROMOTION__PPROMO_SK:
				return PPROMO_SK_EDEFAULT == null ? pPromoSk != null : !PPROMO_SK_EDEFAULT.equals(pPromoSk);
			case TpcdsModelPackage.PROMOTION__PPROMO_ID:
				return PPROMO_ID_EDEFAULT == null ? pPromoId != null : !PPROMO_ID_EDEFAULT.equals(pPromoId);
			case TpcdsModelPackage.PROMOTION__PSTART_DATE_SK:
				return PSTART_DATE_SK_EDEFAULT == null ? pStartDateSk != null : !PSTART_DATE_SK_EDEFAULT.equals(pStartDateSk);
			case TpcdsModelPackage.PROMOTION__PEND_DATE_SK:
				return PEND_DATE_SK_EDEFAULT == null ? pEndDateSk != null : !PEND_DATE_SK_EDEFAULT.equals(pEndDateSk);
			case TpcdsModelPackage.PROMOTION__PITEM_SK:
				return PITEM_SK_EDEFAULT == null ? pItemSk != null : !PITEM_SK_EDEFAULT.equals(pItemSk);
			case TpcdsModelPackage.PROMOTION__PCOST:
				return pCost != PCOST_EDEFAULT;
			case TpcdsModelPackage.PROMOTION__PRESPONSE_TARGET:
				return PRESPONSE_TARGET_EDEFAULT == null ? pResponseTarget != null : !PRESPONSE_TARGET_EDEFAULT.equals(pResponseTarget);
			case TpcdsModelPackage.PROMOTION__PPROMO_NAME:
				return PPROMO_NAME_EDEFAULT == null ? pPromoName != null : !PPROMO_NAME_EDEFAULT.equals(pPromoName);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DMAIL:
				return PCHANNEL_DMAIL_EDEFAULT == null ? pChannelDmail != null : !PCHANNEL_DMAIL_EDEFAULT.equals(pChannelDmail);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EMAIL:
				return PCHANNEL_EMAIL_EDEFAULT == null ? pChannelEmail != null : !PCHANNEL_EMAIL_EDEFAULT.equals(pChannelEmail);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_CATALOG:
				return PCHANNEL_CATALOG_EDEFAULT == null ? pChannelCatalog != null : !PCHANNEL_CATALOG_EDEFAULT.equals(pChannelCatalog);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_TV:
				return PCHANNEL_TV_EDEFAULT == null ? pChannelTv != null : !PCHANNEL_TV_EDEFAULT.equals(pChannelTv);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_RADIO:
				return PCHANNEL_RADIO_EDEFAULT == null ? pChannelRadio != null : !PCHANNEL_RADIO_EDEFAULT.equals(pChannelRadio);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_PRESS:
				return PCHANNEL_PRESS_EDEFAULT == null ? pChannelPress != null : !PCHANNEL_PRESS_EDEFAULT.equals(pChannelPress);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_EVENT:
				return PCHANNEL_EVENT_EDEFAULT == null ? pChannelEvent != null : !PCHANNEL_EVENT_EDEFAULT.equals(pChannelEvent);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DEMO:
				return PCHANNEL_DEMO_EDEFAULT == null ? pChannelDemo != null : !PCHANNEL_DEMO_EDEFAULT.equals(pChannelDemo);
			case TpcdsModelPackage.PROMOTION__PCHANNEL_DETAILS:
				return PCHANNEL_DETAILS_EDEFAULT == null ? pChannelDetails != null : !PCHANNEL_DETAILS_EDEFAULT.equals(pChannelDetails);
			case TpcdsModelPackage.PROMOTION__PPURPOSE:
				return PPURPOSE_EDEFAULT == null ? pPurpose != null : !PPURPOSE_EDEFAULT.equals(pPurpose);
			case TpcdsModelPackage.PROMOTION__PDISCOUNT_ACTIVE:
				return PDISCOUNT_ACTIVE_EDEFAULT == null ? pDiscountActive != null : !PDISCOUNT_ACTIVE_EDEFAULT.equals(pDiscountActive);
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
		result.append(" (pPromoSk: ");
		result.append(pPromoSk);
		result.append(", pPromoId: ");
		result.append(pPromoId);
		result.append(", pStartDateSk: ");
		result.append(pStartDateSk);
		result.append(", pEndDateSk: ");
		result.append(pEndDateSk);
		result.append(", pItemSk: ");
		result.append(pItemSk);
		result.append(", pCost: ");
		result.append(pCost);
		result.append(", pResponseTarget: ");
		result.append(pResponseTarget);
		result.append(", pPromoName: ");
		result.append(pPromoName);
		result.append(", pChannelDmail: ");
		result.append(pChannelDmail);
		result.append(", pChannelEmail: ");
		result.append(pChannelEmail);
		result.append(", pChannelCatalog: ");
		result.append(pChannelCatalog);
		result.append(", pChannelTv: ");
		result.append(pChannelTv);
		result.append(", pChannelRadio: ");
		result.append(pChannelRadio);
		result.append(", pChannelPress: ");
		result.append(pChannelPress);
		result.append(", pChannelEvent: ");
		result.append(pChannelEvent);
		result.append(", pChannelDemo: ");
		result.append(pChannelDemo);
		result.append(", pChannelDetails: ");
		result.append(pChannelDetails);
		result.append(", pPurpose: ");
		result.append(pPurpose);
		result.append(", pDiscountActive: ");
		result.append(pDiscountActive);
		result.append(')');
		return result.toString();
	}

} //PromotionImpl
