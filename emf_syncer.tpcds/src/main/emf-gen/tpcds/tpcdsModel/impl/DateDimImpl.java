/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.DateDim;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Dim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDDateSk <em>DDate Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDDateId <em>DDate Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDDate <em>DDate</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDMonthSeq <em>DMonth Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDWeekSeq <em>DWeek Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDQuarterSeq <em>DQuarter Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDYear <em>DYear</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDDow <em>DDow</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDMoy <em>DMoy</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDDom <em>DDom</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDQoy <em>DQoy</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDFyYear <em>DFy Year</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDFyQuarterSeq <em>DFy Quarter Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDFyWeekSeq <em>DFy Week Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDDayName <em>DDay Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDQuarterName <em>DQuarter Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDHoliday <em>DHoliday</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDWeekend <em>DWeekend</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDFollowingHoliday <em>DFollowing Holiday</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDFirstDom <em>DFirst Dom</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDLastDom <em>DLast Dom</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDSameDayLy <em>DSame Day Ly</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDSameDayLq <em>DSame Day Lq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDCurrentDay <em>DCurrent Day</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDCurrentWeek <em>DCurrent Week</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDCurrentMonth <em>DCurrent Month</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDCurrentQuarter <em>DCurrent Quarter</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.DateDimImpl#getDCurrentYear <em>DCurrent Year</em>}</li>
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
	 * The default value of the '{@link #getDDate() <em>DDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDate() <em>DDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDate()
	 * @generated
	 * @ordered
	 */
	protected Date dDate = DDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDMonthSeq() <em>DMonth Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMonthSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Long DMONTH_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDMonthSeq() <em>DMonth Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMonthSeq()
	 * @generated
	 * @ordered
	 */
	protected Long dMonthSeq = DMONTH_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDWeekSeq() <em>DWeek Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWeekSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Long DWEEK_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDWeekSeq() <em>DWeek Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWeekSeq()
	 * @generated
	 * @ordered
	 */
	protected Long dWeekSeq = DWEEK_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDQuarterSeq() <em>DQuarter Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQuarterSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Long DQUARTER_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDQuarterSeq() <em>DQuarter Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQuarterSeq()
	 * @generated
	 * @ordered
	 */
	protected Long dQuarterSeq = DQUARTER_SEQ_EDEFAULT;

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
	 * The default value of the '{@link #getDDow() <em>DDow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDow()
	 * @generated
	 * @ordered
	 */
	protected static final Long DDOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDow() <em>DDow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDow()
	 * @generated
	 * @ordered
	 */
	protected Long dDow = DDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDMoy() <em>DMoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMoy()
	 * @generated
	 * @ordered
	 */
	protected static final Long DMOY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDMoy() <em>DMoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMoy()
	 * @generated
	 * @ordered
	 */
	protected Long dMoy = DMOY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDom() <em>DDom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDom()
	 * @generated
	 * @ordered
	 */
	protected static final Long DDOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDom() <em>DDom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDom()
	 * @generated
	 * @ordered
	 */
	protected Long dDom = DDOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDQoy() <em>DQoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQoy()
	 * @generated
	 * @ordered
	 */
	protected static final Long DQOY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDQoy() <em>DQoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQoy()
	 * @generated
	 * @ordered
	 */
	protected Long dQoy = DQOY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDFyYear() <em>DFy Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFyYear()
	 * @generated
	 * @ordered
	 */
	protected static final Long DFY_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFyYear() <em>DFy Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFyYear()
	 * @generated
	 * @ordered
	 */
	protected Long dFyYear = DFY_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDFyQuarterSeq() <em>DFy Quarter Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFyQuarterSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Long DFY_QUARTER_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFyQuarterSeq() <em>DFy Quarter Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFyQuarterSeq()
	 * @generated
	 * @ordered
	 */
	protected Long dFyQuarterSeq = DFY_QUARTER_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDFyWeekSeq() <em>DFy Week Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFyWeekSeq()
	 * @generated
	 * @ordered
	 */
	protected static final Long DFY_WEEK_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFyWeekSeq() <em>DFy Week Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFyWeekSeq()
	 * @generated
	 * @ordered
	 */
	protected Long dFyWeekSeq = DFY_WEEK_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDDayName() <em>DDay Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DDAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDDayName() <em>DDay Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDayName()
	 * @generated
	 * @ordered
	 */
	protected String dDayName = DDAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDQuarterName() <em>DQuarter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQuarterName()
	 * @generated
	 * @ordered
	 */
	protected static final String DQUARTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDQuarterName() <em>DQuarter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDQuarterName()
	 * @generated
	 * @ordered
	 */
	protected String dQuarterName = DQUARTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDHoliday() <em>DHoliday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDHoliday()
	 * @generated
	 * @ordered
	 */
	protected static final String DHOLIDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDHoliday() <em>DHoliday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDHoliday()
	 * @generated
	 * @ordered
	 */
	protected String dHoliday = DHOLIDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDWeekend() <em>DWeekend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWeekend()
	 * @generated
	 * @ordered
	 */
	protected static final String DWEEKEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDWeekend() <em>DWeekend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWeekend()
	 * @generated
	 * @ordered
	 */
	protected String dWeekend = DWEEKEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDFollowingHoliday() <em>DFollowing Holiday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFollowingHoliday()
	 * @generated
	 * @ordered
	 */
	protected static final String DFOLLOWING_HOLIDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFollowingHoliday() <em>DFollowing Holiday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFollowingHoliday()
	 * @generated
	 * @ordered
	 */
	protected String dFollowingHoliday = DFOLLOWING_HOLIDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDFirstDom() <em>DFirst Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFirstDom()
	 * @generated
	 * @ordered
	 */
	protected static final Long DFIRST_DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDFirstDom() <em>DFirst Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDFirstDom()
	 * @generated
	 * @ordered
	 */
	protected Long dFirstDom = DFIRST_DOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDLastDom() <em>DLast Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLastDom()
	 * @generated
	 * @ordered
	 */
	protected static final Long DLAST_DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDLastDom() <em>DLast Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLastDom()
	 * @generated
	 * @ordered
	 */
	protected Long dLastDom = DLAST_DOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDSameDayLy() <em>DSame Day Ly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSameDayLy()
	 * @generated
	 * @ordered
	 */
	protected static final Long DSAME_DAY_LY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDSameDayLy() <em>DSame Day Ly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSameDayLy()
	 * @generated
	 * @ordered
	 */
	protected Long dSameDayLy = DSAME_DAY_LY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDSameDayLq() <em>DSame Day Lq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSameDayLq()
	 * @generated
	 * @ordered
	 */
	protected static final Long DSAME_DAY_LQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDSameDayLq() <em>DSame Day Lq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSameDayLq()
	 * @generated
	 * @ordered
	 */
	protected Long dSameDayLq = DSAME_DAY_LQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDCurrentDay() <em>DCurrent Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentDay()
	 * @generated
	 * @ordered
	 */
	protected static final String DCURRENT_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDCurrentDay() <em>DCurrent Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentDay()
	 * @generated
	 * @ordered
	 */
	protected String dCurrentDay = DCURRENT_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDCurrentWeek() <em>DCurrent Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentWeek()
	 * @generated
	 * @ordered
	 */
	protected static final String DCURRENT_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDCurrentWeek() <em>DCurrent Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentWeek()
	 * @generated
	 * @ordered
	 */
	protected String dCurrentWeek = DCURRENT_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDCurrentMonth() <em>DCurrent Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String DCURRENT_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDCurrentMonth() <em>DCurrent Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentMonth()
	 * @generated
	 * @ordered
	 */
	protected String dCurrentMonth = DCURRENT_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDCurrentQuarter() <em>DCurrent Quarter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentQuarter()
	 * @generated
	 * @ordered
	 */
	protected static final String DCURRENT_QUARTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDCurrentQuarter() <em>DCurrent Quarter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentQuarter()
	 * @generated
	 * @ordered
	 */
	protected String dCurrentQuarter = DCURRENT_QUARTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDCurrentYear() <em>DCurrent Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentYear()
	 * @generated
	 * @ordered
	 */
	protected static final String DCURRENT_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDCurrentYear() <em>DCurrent Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCurrentYear()
	 * @generated
	 * @ordered
	 */
	protected String dCurrentYear = DCURRENT_YEAR_EDEFAULT;

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
		return TpcdsModelPackage.Literals.DATE_DIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDDateSk() {
		return dDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDateSk(Long newDDateSk) {
		Long oldDDateSk = dDateSk;
		dDateSk = newDDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DDATE_SK, oldDDateSk, dDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDateId() {
		return dDateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDateId(String newDDateId) {
		String oldDDateId = dDateId;
		dDateId = newDDateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DDATE_ID, oldDDateId, dDateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDDate() {
		return dDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDate(Date newDDate) {
		Date oldDDate = dDate;
		dDate = newDDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DDATE, oldDDate, dDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDMonthSeq() {
		return dMonthSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMonthSeq(Long newDMonthSeq) {
		Long oldDMonthSeq = dMonthSeq;
		dMonthSeq = newDMonthSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DMONTH_SEQ, oldDMonthSeq, dMonthSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDWeekSeq() {
		return dWeekSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDWeekSeq(Long newDWeekSeq) {
		Long oldDWeekSeq = dWeekSeq;
		dWeekSeq = newDWeekSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DWEEK_SEQ, oldDWeekSeq, dWeekSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDQuarterSeq() {
		return dQuarterSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQuarterSeq(Long newDQuarterSeq) {
		Long oldDQuarterSeq = dQuarterSeq;
		dQuarterSeq = newDQuarterSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DQUARTER_SEQ, oldDQuarterSeq, dQuarterSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDYear() {
		return dYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDYear(Long newDYear) {
		Long oldDYear = dYear;
		dYear = newDYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DYEAR, oldDYear, dYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDDow() {
		return dDow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDow(Long newDDow) {
		Long oldDDow = dDow;
		dDow = newDDow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DDOW, oldDDow, dDow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDMoy() {
		return dMoy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMoy(Long newDMoy) {
		Long oldDMoy = dMoy;
		dMoy = newDMoy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DMOY, oldDMoy, dMoy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDDom() {
		return dDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDom(Long newDDom) {
		Long oldDDom = dDom;
		dDom = newDDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DDOM, oldDDom, dDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDQoy() {
		return dQoy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQoy(Long newDQoy) {
		Long oldDQoy = dQoy;
		dQoy = newDQoy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DQOY, oldDQoy, dQoy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDFyYear() {
		return dFyYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFyYear(Long newDFyYear) {
		Long oldDFyYear = dFyYear;
		dFyYear = newDFyYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DFY_YEAR, oldDFyYear, dFyYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDFyQuarterSeq() {
		return dFyQuarterSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFyQuarterSeq(Long newDFyQuarterSeq) {
		Long oldDFyQuarterSeq = dFyQuarterSeq;
		dFyQuarterSeq = newDFyQuarterSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DFY_QUARTER_SEQ, oldDFyQuarterSeq, dFyQuarterSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDFyWeekSeq() {
		return dFyWeekSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFyWeekSeq(Long newDFyWeekSeq) {
		Long oldDFyWeekSeq = dFyWeekSeq;
		dFyWeekSeq = newDFyWeekSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DFY_WEEK_SEQ, oldDFyWeekSeq, dFyWeekSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDDayName() {
		return dDayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDDayName(String newDDayName) {
		String oldDDayName = dDayName;
		dDayName = newDDayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DDAY_NAME, oldDDayName, dDayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDQuarterName() {
		return dQuarterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQuarterName(String newDQuarterName) {
		String oldDQuarterName = dQuarterName;
		dQuarterName = newDQuarterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DQUARTER_NAME, oldDQuarterName, dQuarterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDHoliday() {
		return dHoliday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDHoliday(String newDHoliday) {
		String oldDHoliday = dHoliday;
		dHoliday = newDHoliday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DHOLIDAY, oldDHoliday, dHoliday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDWeekend() {
		return dWeekend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDWeekend(String newDWeekend) {
		String oldDWeekend = dWeekend;
		dWeekend = newDWeekend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DWEEKEND, oldDWeekend, dWeekend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDFollowingHoliday() {
		return dFollowingHoliday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFollowingHoliday(String newDFollowingHoliday) {
		String oldDFollowingHoliday = dFollowingHoliday;
		dFollowingHoliday = newDFollowingHoliday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DFOLLOWING_HOLIDAY, oldDFollowingHoliday, dFollowingHoliday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDFirstDom() {
		return dFirstDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDFirstDom(Long newDFirstDom) {
		Long oldDFirstDom = dFirstDom;
		dFirstDom = newDFirstDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DFIRST_DOM, oldDFirstDom, dFirstDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDLastDom() {
		return dLastDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDLastDom(Long newDLastDom) {
		Long oldDLastDom = dLastDom;
		dLastDom = newDLastDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DLAST_DOM, oldDLastDom, dLastDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDSameDayLy() {
		return dSameDayLy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSameDayLy(Long newDSameDayLy) {
		Long oldDSameDayLy = dSameDayLy;
		dSameDayLy = newDSameDayLy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DSAME_DAY_LY, oldDSameDayLy, dSameDayLy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDSameDayLq() {
		return dSameDayLq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSameDayLq(Long newDSameDayLq) {
		Long oldDSameDayLq = dSameDayLq;
		dSameDayLq = newDSameDayLq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DSAME_DAY_LQ, oldDSameDayLq, dSameDayLq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDCurrentDay() {
		return dCurrentDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCurrentDay(String newDCurrentDay) {
		String oldDCurrentDay = dCurrentDay;
		dCurrentDay = newDCurrentDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DCURRENT_DAY, oldDCurrentDay, dCurrentDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDCurrentWeek() {
		return dCurrentWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCurrentWeek(String newDCurrentWeek) {
		String oldDCurrentWeek = dCurrentWeek;
		dCurrentWeek = newDCurrentWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DCURRENT_WEEK, oldDCurrentWeek, dCurrentWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDCurrentMonth() {
		return dCurrentMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCurrentMonth(String newDCurrentMonth) {
		String oldDCurrentMonth = dCurrentMonth;
		dCurrentMonth = newDCurrentMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DCURRENT_MONTH, oldDCurrentMonth, dCurrentMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDCurrentQuarter() {
		return dCurrentQuarter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCurrentQuarter(String newDCurrentQuarter) {
		String oldDCurrentQuarter = dCurrentQuarter;
		dCurrentQuarter = newDCurrentQuarter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DCURRENT_QUARTER, oldDCurrentQuarter, dCurrentQuarter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDCurrentYear() {
		return dCurrentYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCurrentYear(String newDCurrentYear) {
		String oldDCurrentYear = dCurrentYear;
		dCurrentYear = newDCurrentYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.DATE_DIM__DCURRENT_YEAR, oldDCurrentYear, dCurrentYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.DATE_DIM__DDATE_SK:
				return getDDateSk();
			case TpcdsModelPackage.DATE_DIM__DDATE_ID:
				return getDDateId();
			case TpcdsModelPackage.DATE_DIM__DDATE:
				return getDDate();
			case TpcdsModelPackage.DATE_DIM__DMONTH_SEQ:
				return getDMonthSeq();
			case TpcdsModelPackage.DATE_DIM__DWEEK_SEQ:
				return getDWeekSeq();
			case TpcdsModelPackage.DATE_DIM__DQUARTER_SEQ:
				return getDQuarterSeq();
			case TpcdsModelPackage.DATE_DIM__DYEAR:
				return getDYear();
			case TpcdsModelPackage.DATE_DIM__DDOW:
				return getDDow();
			case TpcdsModelPackage.DATE_DIM__DMOY:
				return getDMoy();
			case TpcdsModelPackage.DATE_DIM__DDOM:
				return getDDom();
			case TpcdsModelPackage.DATE_DIM__DQOY:
				return getDQoy();
			case TpcdsModelPackage.DATE_DIM__DFY_YEAR:
				return getDFyYear();
			case TpcdsModelPackage.DATE_DIM__DFY_QUARTER_SEQ:
				return getDFyQuarterSeq();
			case TpcdsModelPackage.DATE_DIM__DFY_WEEK_SEQ:
				return getDFyWeekSeq();
			case TpcdsModelPackage.DATE_DIM__DDAY_NAME:
				return getDDayName();
			case TpcdsModelPackage.DATE_DIM__DQUARTER_NAME:
				return getDQuarterName();
			case TpcdsModelPackage.DATE_DIM__DHOLIDAY:
				return getDHoliday();
			case TpcdsModelPackage.DATE_DIM__DWEEKEND:
				return getDWeekend();
			case TpcdsModelPackage.DATE_DIM__DFOLLOWING_HOLIDAY:
				return getDFollowingHoliday();
			case TpcdsModelPackage.DATE_DIM__DFIRST_DOM:
				return getDFirstDom();
			case TpcdsModelPackage.DATE_DIM__DLAST_DOM:
				return getDLastDom();
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LY:
				return getDSameDayLy();
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LQ:
				return getDSameDayLq();
			case TpcdsModelPackage.DATE_DIM__DCURRENT_DAY:
				return getDCurrentDay();
			case TpcdsModelPackage.DATE_DIM__DCURRENT_WEEK:
				return getDCurrentWeek();
			case TpcdsModelPackage.DATE_DIM__DCURRENT_MONTH:
				return getDCurrentMonth();
			case TpcdsModelPackage.DATE_DIM__DCURRENT_QUARTER:
				return getDCurrentQuarter();
			case TpcdsModelPackage.DATE_DIM__DCURRENT_YEAR:
				return getDCurrentYear();
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
			case TpcdsModelPackage.DATE_DIM__DDATE_SK:
				setDDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DDATE_ID:
				setDDateId((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DDATE:
				setDDate((Date)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DMONTH_SEQ:
				setDMonthSeq((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DWEEK_SEQ:
				setDWeekSeq((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DQUARTER_SEQ:
				setDQuarterSeq((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DYEAR:
				setDYear((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DDOW:
				setDDow((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DMOY:
				setDMoy((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DDOM:
				setDDom((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DQOY:
				setDQoy((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DFY_YEAR:
				setDFyYear((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DFY_QUARTER_SEQ:
				setDFyQuarterSeq((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DFY_WEEK_SEQ:
				setDFyWeekSeq((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DDAY_NAME:
				setDDayName((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DQUARTER_NAME:
				setDQuarterName((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DHOLIDAY:
				setDHoliday((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DWEEKEND:
				setDWeekend((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DFOLLOWING_HOLIDAY:
				setDFollowingHoliday((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DFIRST_DOM:
				setDFirstDom((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DLAST_DOM:
				setDLastDom((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LY:
				setDSameDayLy((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LQ:
				setDSameDayLq((Long)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_DAY:
				setDCurrentDay((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_WEEK:
				setDCurrentWeek((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_MONTH:
				setDCurrentMonth((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_QUARTER:
				setDCurrentQuarter((String)newValue);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_YEAR:
				setDCurrentYear((String)newValue);
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
			case TpcdsModelPackage.DATE_DIM__DDATE_SK:
				setDDateSk(DDATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DDATE_ID:
				setDDateId(DDATE_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DDATE:
				setDDate(DDATE_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DMONTH_SEQ:
				setDMonthSeq(DMONTH_SEQ_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DWEEK_SEQ:
				setDWeekSeq(DWEEK_SEQ_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DQUARTER_SEQ:
				setDQuarterSeq(DQUARTER_SEQ_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DYEAR:
				setDYear(DYEAR_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DDOW:
				setDDow(DDOW_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DMOY:
				setDMoy(DMOY_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DDOM:
				setDDom(DDOM_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DQOY:
				setDQoy(DQOY_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DFY_YEAR:
				setDFyYear(DFY_YEAR_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DFY_QUARTER_SEQ:
				setDFyQuarterSeq(DFY_QUARTER_SEQ_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DFY_WEEK_SEQ:
				setDFyWeekSeq(DFY_WEEK_SEQ_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DDAY_NAME:
				setDDayName(DDAY_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DQUARTER_NAME:
				setDQuarterName(DQUARTER_NAME_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DHOLIDAY:
				setDHoliday(DHOLIDAY_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DWEEKEND:
				setDWeekend(DWEEKEND_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DFOLLOWING_HOLIDAY:
				setDFollowingHoliday(DFOLLOWING_HOLIDAY_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DFIRST_DOM:
				setDFirstDom(DFIRST_DOM_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DLAST_DOM:
				setDLastDom(DLAST_DOM_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LY:
				setDSameDayLy(DSAME_DAY_LY_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LQ:
				setDSameDayLq(DSAME_DAY_LQ_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_DAY:
				setDCurrentDay(DCURRENT_DAY_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_WEEK:
				setDCurrentWeek(DCURRENT_WEEK_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_MONTH:
				setDCurrentMonth(DCURRENT_MONTH_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_QUARTER:
				setDCurrentQuarter(DCURRENT_QUARTER_EDEFAULT);
				return;
			case TpcdsModelPackage.DATE_DIM__DCURRENT_YEAR:
				setDCurrentYear(DCURRENT_YEAR_EDEFAULT);
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
			case TpcdsModelPackage.DATE_DIM__DDATE_SK:
				return DDATE_SK_EDEFAULT == null ? dDateSk != null : !DDATE_SK_EDEFAULT.equals(dDateSk);
			case TpcdsModelPackage.DATE_DIM__DDATE_ID:
				return DDATE_ID_EDEFAULT == null ? dDateId != null : !DDATE_ID_EDEFAULT.equals(dDateId);
			case TpcdsModelPackage.DATE_DIM__DDATE:
				return DDATE_EDEFAULT == null ? dDate != null : !DDATE_EDEFAULT.equals(dDate);
			case TpcdsModelPackage.DATE_DIM__DMONTH_SEQ:
				return DMONTH_SEQ_EDEFAULT == null ? dMonthSeq != null : !DMONTH_SEQ_EDEFAULT.equals(dMonthSeq);
			case TpcdsModelPackage.DATE_DIM__DWEEK_SEQ:
				return DWEEK_SEQ_EDEFAULT == null ? dWeekSeq != null : !DWEEK_SEQ_EDEFAULT.equals(dWeekSeq);
			case TpcdsModelPackage.DATE_DIM__DQUARTER_SEQ:
				return DQUARTER_SEQ_EDEFAULT == null ? dQuarterSeq != null : !DQUARTER_SEQ_EDEFAULT.equals(dQuarterSeq);
			case TpcdsModelPackage.DATE_DIM__DYEAR:
				return DYEAR_EDEFAULT == null ? dYear != null : !DYEAR_EDEFAULT.equals(dYear);
			case TpcdsModelPackage.DATE_DIM__DDOW:
				return DDOW_EDEFAULT == null ? dDow != null : !DDOW_EDEFAULT.equals(dDow);
			case TpcdsModelPackage.DATE_DIM__DMOY:
				return DMOY_EDEFAULT == null ? dMoy != null : !DMOY_EDEFAULT.equals(dMoy);
			case TpcdsModelPackage.DATE_DIM__DDOM:
				return DDOM_EDEFAULT == null ? dDom != null : !DDOM_EDEFAULT.equals(dDom);
			case TpcdsModelPackage.DATE_DIM__DQOY:
				return DQOY_EDEFAULT == null ? dQoy != null : !DQOY_EDEFAULT.equals(dQoy);
			case TpcdsModelPackage.DATE_DIM__DFY_YEAR:
				return DFY_YEAR_EDEFAULT == null ? dFyYear != null : !DFY_YEAR_EDEFAULT.equals(dFyYear);
			case TpcdsModelPackage.DATE_DIM__DFY_QUARTER_SEQ:
				return DFY_QUARTER_SEQ_EDEFAULT == null ? dFyQuarterSeq != null : !DFY_QUARTER_SEQ_EDEFAULT.equals(dFyQuarterSeq);
			case TpcdsModelPackage.DATE_DIM__DFY_WEEK_SEQ:
				return DFY_WEEK_SEQ_EDEFAULT == null ? dFyWeekSeq != null : !DFY_WEEK_SEQ_EDEFAULT.equals(dFyWeekSeq);
			case TpcdsModelPackage.DATE_DIM__DDAY_NAME:
				return DDAY_NAME_EDEFAULT == null ? dDayName != null : !DDAY_NAME_EDEFAULT.equals(dDayName);
			case TpcdsModelPackage.DATE_DIM__DQUARTER_NAME:
				return DQUARTER_NAME_EDEFAULT == null ? dQuarterName != null : !DQUARTER_NAME_EDEFAULT.equals(dQuarterName);
			case TpcdsModelPackage.DATE_DIM__DHOLIDAY:
				return DHOLIDAY_EDEFAULT == null ? dHoliday != null : !DHOLIDAY_EDEFAULT.equals(dHoliday);
			case TpcdsModelPackage.DATE_DIM__DWEEKEND:
				return DWEEKEND_EDEFAULT == null ? dWeekend != null : !DWEEKEND_EDEFAULT.equals(dWeekend);
			case TpcdsModelPackage.DATE_DIM__DFOLLOWING_HOLIDAY:
				return DFOLLOWING_HOLIDAY_EDEFAULT == null ? dFollowingHoliday != null : !DFOLLOWING_HOLIDAY_EDEFAULT.equals(dFollowingHoliday);
			case TpcdsModelPackage.DATE_DIM__DFIRST_DOM:
				return DFIRST_DOM_EDEFAULT == null ? dFirstDom != null : !DFIRST_DOM_EDEFAULT.equals(dFirstDom);
			case TpcdsModelPackage.DATE_DIM__DLAST_DOM:
				return DLAST_DOM_EDEFAULT == null ? dLastDom != null : !DLAST_DOM_EDEFAULT.equals(dLastDom);
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LY:
				return DSAME_DAY_LY_EDEFAULT == null ? dSameDayLy != null : !DSAME_DAY_LY_EDEFAULT.equals(dSameDayLy);
			case TpcdsModelPackage.DATE_DIM__DSAME_DAY_LQ:
				return DSAME_DAY_LQ_EDEFAULT == null ? dSameDayLq != null : !DSAME_DAY_LQ_EDEFAULT.equals(dSameDayLq);
			case TpcdsModelPackage.DATE_DIM__DCURRENT_DAY:
				return DCURRENT_DAY_EDEFAULT == null ? dCurrentDay != null : !DCURRENT_DAY_EDEFAULT.equals(dCurrentDay);
			case TpcdsModelPackage.DATE_DIM__DCURRENT_WEEK:
				return DCURRENT_WEEK_EDEFAULT == null ? dCurrentWeek != null : !DCURRENT_WEEK_EDEFAULT.equals(dCurrentWeek);
			case TpcdsModelPackage.DATE_DIM__DCURRENT_MONTH:
				return DCURRENT_MONTH_EDEFAULT == null ? dCurrentMonth != null : !DCURRENT_MONTH_EDEFAULT.equals(dCurrentMonth);
			case TpcdsModelPackage.DATE_DIM__DCURRENT_QUARTER:
				return DCURRENT_QUARTER_EDEFAULT == null ? dCurrentQuarter != null : !DCURRENT_QUARTER_EDEFAULT.equals(dCurrentQuarter);
			case TpcdsModelPackage.DATE_DIM__DCURRENT_YEAR:
				return DCURRENT_YEAR_EDEFAULT == null ? dCurrentYear != null : !DCURRENT_YEAR_EDEFAULT.equals(dCurrentYear);
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
		result.append(dDateSk);
		result.append(", dDateId: ");
		result.append(dDateId);
		result.append(", dDate: ");
		result.append(dDate);
		result.append(", dMonthSeq: ");
		result.append(dMonthSeq);
		result.append(", dWeekSeq: ");
		result.append(dWeekSeq);
		result.append(", dQuarterSeq: ");
		result.append(dQuarterSeq);
		result.append(", dYear: ");
		result.append(dYear);
		result.append(", dDow: ");
		result.append(dDow);
		result.append(", dMoy: ");
		result.append(dMoy);
		result.append(", dDom: ");
		result.append(dDom);
		result.append(", dQoy: ");
		result.append(dQoy);
		result.append(", dFyYear: ");
		result.append(dFyYear);
		result.append(", dFyQuarterSeq: ");
		result.append(dFyQuarterSeq);
		result.append(", dFyWeekSeq: ");
		result.append(dFyWeekSeq);
		result.append(", dDayName: ");
		result.append(dDayName);
		result.append(", dQuarterName: ");
		result.append(dQuarterName);
		result.append(", dHoliday: ");
		result.append(dHoliday);
		result.append(", dWeekend: ");
		result.append(dWeekend);
		result.append(", dFollowingHoliday: ");
		result.append(dFollowingHoliday);
		result.append(", dFirstDom: ");
		result.append(dFirstDom);
		result.append(", dLastDom: ");
		result.append(dLastDom);
		result.append(", dSameDayLy: ");
		result.append(dSameDayLy);
		result.append(", dSameDayLq: ");
		result.append(dSameDayLq);
		result.append(", dCurrentDay: ");
		result.append(dCurrentDay);
		result.append(", dCurrentWeek: ");
		result.append(dCurrentWeek);
		result.append(", dCurrentMonth: ");
		result.append(dCurrentMonth);
		result.append(", dCurrentQuarter: ");
		result.append(dCurrentQuarter);
		result.append(", dCurrentYear: ");
		result.append(dCurrentYear);
		result.append(')');
		return result.toString();
	}

} //DateDimImpl
