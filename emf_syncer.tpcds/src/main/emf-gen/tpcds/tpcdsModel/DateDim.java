/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Dim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDDateSk <em>DDate Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDDateId <em>DDate Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDDate <em>DDate</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDMonthSeq <em>DMonth Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDWeekSeq <em>DWeek Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDQuarterSeq <em>DQuarter Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDYear <em>DYear</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDDow <em>DDow</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDMoy <em>DMoy</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDDom <em>DDom</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDQoy <em>DQoy</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDFyYear <em>DFy Year</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDFyQuarterSeq <em>DFy Quarter Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDFyWeekSeq <em>DFy Week Seq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDDayName <em>DDay Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDQuarterName <em>DQuarter Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDHoliday <em>DHoliday</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDWeekend <em>DWeekend</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDFollowingHoliday <em>DFollowing Holiday</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDFirstDom <em>DFirst Dom</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDLastDom <em>DLast Dom</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDSameDayLy <em>DSame Day Ly</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDSameDayLq <em>DSame Day Lq</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDCurrentDay <em>DCurrent Day</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDCurrentWeek <em>DCurrent Week</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDCurrentMonth <em>DCurrent Month</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDCurrentQuarter <em>DCurrent Quarter</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DateDim#getDCurrentYear <em>DCurrent Year</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim()
 * @model
 * @generated
 */
public interface DateDim extends EObject {
	/**
	 * Returns the value of the '<em><b>DDate Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDate Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDate Sk</em>' attribute.
	 * @see #setDDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DDateSk()
	 * @model
	 * @generated
	 */
	Long getDDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDDateSk <em>DDate Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDate Sk</em>' attribute.
	 * @see #getDDateSk()
	 * @generated
	 */
	void setDDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>DDate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDate Id</em>' attribute.
	 * @see #setDDateId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DDateId()
	 * @model
	 * @generated
	 */
	String getDDateId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDDateId <em>DDate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDate Id</em>' attribute.
	 * @see #getDDateId()
	 * @generated
	 */
	void setDDateId(String value);

	/**
	 * Returns the value of the '<em><b>DDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDate</em>' attribute.
	 * @see #setDDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getDDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDDate <em>DDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDate</em>' attribute.
	 * @see #getDDate()
	 * @generated
	 */
	void setDDate(Date value);

	/**
	 * Returns the value of the '<em><b>DMonth Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DMonth Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMonth Seq</em>' attribute.
	 * @see #setDMonthSeq(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DMonthSeq()
	 * @model
	 * @generated
	 */
	Long getDMonthSeq();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDMonthSeq <em>DMonth Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMonth Seq</em>' attribute.
	 * @see #getDMonthSeq()
	 * @generated
	 */
	void setDMonthSeq(Long value);

	/**
	 * Returns the value of the '<em><b>DWeek Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DWeek Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DWeek Seq</em>' attribute.
	 * @see #setDWeekSeq(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DWeekSeq()
	 * @model
	 * @generated
	 */
	Long getDWeekSeq();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDWeekSeq <em>DWeek Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeek Seq</em>' attribute.
	 * @see #getDWeekSeq()
	 * @generated
	 */
	void setDWeekSeq(Long value);

	/**
	 * Returns the value of the '<em><b>DQuarter Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DQuarter Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQuarter Seq</em>' attribute.
	 * @see #setDQuarterSeq(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DQuarterSeq()
	 * @model
	 * @generated
	 */
	Long getDQuarterSeq();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDQuarterSeq <em>DQuarter Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQuarter Seq</em>' attribute.
	 * @see #getDQuarterSeq()
	 * @generated
	 */
	void setDQuarterSeq(Long value);

	/**
	 * Returns the value of the '<em><b>DYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DYear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DYear</em>' attribute.
	 * @see #setDYear(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DYear()
	 * @model
	 * @generated
	 */
	Long getDYear();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDYear <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DYear</em>' attribute.
	 * @see #getDYear()
	 * @generated
	 */
	void setDYear(Long value);

	/**
	 * Returns the value of the '<em><b>DDow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDow</em>' attribute.
	 * @see #setDDow(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DDow()
	 * @model
	 * @generated
	 */
	Long getDDow();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDDow <em>DDow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDow</em>' attribute.
	 * @see #getDDow()
	 * @generated
	 */
	void setDDow(Long value);

	/**
	 * Returns the value of the '<em><b>DMoy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DMoy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMoy</em>' attribute.
	 * @see #setDMoy(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DMoy()
	 * @model
	 * @generated
	 */
	Long getDMoy();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDMoy <em>DMoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMoy</em>' attribute.
	 * @see #getDMoy()
	 * @generated
	 */
	void setDMoy(Long value);

	/**
	 * Returns the value of the '<em><b>DDom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDom</em>' attribute.
	 * @see #setDDom(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DDom()
	 * @model
	 * @generated
	 */
	Long getDDom();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDDom <em>DDom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDom</em>' attribute.
	 * @see #getDDom()
	 * @generated
	 */
	void setDDom(Long value);

	/**
	 * Returns the value of the '<em><b>DQoy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DQoy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQoy</em>' attribute.
	 * @see #setDQoy(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DQoy()
	 * @model
	 * @generated
	 */
	Long getDQoy();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDQoy <em>DQoy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQoy</em>' attribute.
	 * @see #getDQoy()
	 * @generated
	 */
	void setDQoy(Long value);

	/**
	 * Returns the value of the '<em><b>DFy Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DFy Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DFy Year</em>' attribute.
	 * @see #setDFyYear(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DFyYear()
	 * @model
	 * @generated
	 */
	Long getDFyYear();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDFyYear <em>DFy Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DFy Year</em>' attribute.
	 * @see #getDFyYear()
	 * @generated
	 */
	void setDFyYear(Long value);

	/**
	 * Returns the value of the '<em><b>DFy Quarter Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DFy Quarter Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DFy Quarter Seq</em>' attribute.
	 * @see #setDFyQuarterSeq(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DFyQuarterSeq()
	 * @model
	 * @generated
	 */
	Long getDFyQuarterSeq();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDFyQuarterSeq <em>DFy Quarter Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DFy Quarter Seq</em>' attribute.
	 * @see #getDFyQuarterSeq()
	 * @generated
	 */
	void setDFyQuarterSeq(Long value);

	/**
	 * Returns the value of the '<em><b>DFy Week Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DFy Week Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DFy Week Seq</em>' attribute.
	 * @see #setDFyWeekSeq(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DFyWeekSeq()
	 * @model
	 * @generated
	 */
	Long getDFyWeekSeq();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDFyWeekSeq <em>DFy Week Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DFy Week Seq</em>' attribute.
	 * @see #getDFyWeekSeq()
	 * @generated
	 */
	void setDFyWeekSeq(Long value);

	/**
	 * Returns the value of the '<em><b>DDay Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDay Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDay Name</em>' attribute.
	 * @see #setDDayName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DDayName()
	 * @model
	 * @generated
	 */
	String getDDayName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDDayName <em>DDay Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDay Name</em>' attribute.
	 * @see #getDDayName()
	 * @generated
	 */
	void setDDayName(String value);

	/**
	 * Returns the value of the '<em><b>DQuarter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DQuarter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQuarter Name</em>' attribute.
	 * @see #setDQuarterName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DQuarterName()
	 * @model
	 * @generated
	 */
	String getDQuarterName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDQuarterName <em>DQuarter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQuarter Name</em>' attribute.
	 * @see #getDQuarterName()
	 * @generated
	 */
	void setDQuarterName(String value);

	/**
	 * Returns the value of the '<em><b>DHoliday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DHoliday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DHoliday</em>' attribute.
	 * @see #setDHoliday(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DHoliday()
	 * @model
	 * @generated
	 */
	String getDHoliday();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDHoliday <em>DHoliday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DHoliday</em>' attribute.
	 * @see #getDHoliday()
	 * @generated
	 */
	void setDHoliday(String value);

	/**
	 * Returns the value of the '<em><b>DWeekend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DWeekend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DWeekend</em>' attribute.
	 * @see #setDWeekend(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DWeekend()
	 * @model
	 * @generated
	 */
	String getDWeekend();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDWeekend <em>DWeekend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeekend</em>' attribute.
	 * @see #getDWeekend()
	 * @generated
	 */
	void setDWeekend(String value);

	/**
	 * Returns the value of the '<em><b>DFollowing Holiday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DFollowing Holiday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DFollowing Holiday</em>' attribute.
	 * @see #setDFollowingHoliday(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DFollowingHoliday()
	 * @model
	 * @generated
	 */
	String getDFollowingHoliday();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDFollowingHoliday <em>DFollowing Holiday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DFollowing Holiday</em>' attribute.
	 * @see #getDFollowingHoliday()
	 * @generated
	 */
	void setDFollowingHoliday(String value);

	/**
	 * Returns the value of the '<em><b>DFirst Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DFirst Dom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DFirst Dom</em>' attribute.
	 * @see #setDFirstDom(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DFirstDom()
	 * @model
	 * @generated
	 */
	Long getDFirstDom();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDFirstDom <em>DFirst Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DFirst Dom</em>' attribute.
	 * @see #getDFirstDom()
	 * @generated
	 */
	void setDFirstDom(Long value);

	/**
	 * Returns the value of the '<em><b>DLast Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLast Dom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLast Dom</em>' attribute.
	 * @see #setDLastDom(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DLastDom()
	 * @model
	 * @generated
	 */
	Long getDLastDom();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDLastDom <em>DLast Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLast Dom</em>' attribute.
	 * @see #getDLastDom()
	 * @generated
	 */
	void setDLastDom(Long value);

	/**
	 * Returns the value of the '<em><b>DSame Day Ly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSame Day Ly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSame Day Ly</em>' attribute.
	 * @see #setDSameDayLy(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DSameDayLy()
	 * @model
	 * @generated
	 */
	Long getDSameDayLy();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDSameDayLy <em>DSame Day Ly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSame Day Ly</em>' attribute.
	 * @see #getDSameDayLy()
	 * @generated
	 */
	void setDSameDayLy(Long value);

	/**
	 * Returns the value of the '<em><b>DSame Day Lq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSame Day Lq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSame Day Lq</em>' attribute.
	 * @see #setDSameDayLq(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DSameDayLq()
	 * @model
	 * @generated
	 */
	Long getDSameDayLq();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDSameDayLq <em>DSame Day Lq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSame Day Lq</em>' attribute.
	 * @see #getDSameDayLq()
	 * @generated
	 */
	void setDSameDayLq(Long value);

	/**
	 * Returns the value of the '<em><b>DCurrent Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCurrent Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCurrent Day</em>' attribute.
	 * @see #setDCurrentDay(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DCurrentDay()
	 * @model
	 * @generated
	 */
	String getDCurrentDay();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDCurrentDay <em>DCurrent Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCurrent Day</em>' attribute.
	 * @see #getDCurrentDay()
	 * @generated
	 */
	void setDCurrentDay(String value);

	/**
	 * Returns the value of the '<em><b>DCurrent Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCurrent Week</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCurrent Week</em>' attribute.
	 * @see #setDCurrentWeek(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DCurrentWeek()
	 * @model
	 * @generated
	 */
	String getDCurrentWeek();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDCurrentWeek <em>DCurrent Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCurrent Week</em>' attribute.
	 * @see #getDCurrentWeek()
	 * @generated
	 */
	void setDCurrentWeek(String value);

	/**
	 * Returns the value of the '<em><b>DCurrent Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCurrent Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCurrent Month</em>' attribute.
	 * @see #setDCurrentMonth(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DCurrentMonth()
	 * @model
	 * @generated
	 */
	String getDCurrentMonth();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDCurrentMonth <em>DCurrent Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCurrent Month</em>' attribute.
	 * @see #getDCurrentMonth()
	 * @generated
	 */
	void setDCurrentMonth(String value);

	/**
	 * Returns the value of the '<em><b>DCurrent Quarter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCurrent Quarter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCurrent Quarter</em>' attribute.
	 * @see #setDCurrentQuarter(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DCurrentQuarter()
	 * @model
	 * @generated
	 */
	String getDCurrentQuarter();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDCurrentQuarter <em>DCurrent Quarter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCurrent Quarter</em>' attribute.
	 * @see #getDCurrentQuarter()
	 * @generated
	 */
	void setDCurrentQuarter(String value);

	/**
	 * Returns the value of the '<em><b>DCurrent Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCurrent Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCurrent Year</em>' attribute.
	 * @see #setDCurrentYear(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDateDim_DCurrentYear()
	 * @model
	 * @generated
	 */
	String getDCurrentYear();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DateDim#getDCurrentYear <em>DCurrent Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCurrent Year</em>' attribute.
	 * @see #getDCurrentYear()
	 * @generated
	 */
	void setDCurrentYear(String value);

} // DateDim
