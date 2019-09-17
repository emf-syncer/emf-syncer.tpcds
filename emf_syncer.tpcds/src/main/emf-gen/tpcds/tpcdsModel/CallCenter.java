/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCallCenterSk <em>Cc Call Center Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCallCenterId <em>Cc Call Center Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcRecStartDate <em>Cc Rec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcRecEndDate <em>Cc Rec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcClosedDateSk <em>Cc Closed Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcOpenDateSk <em>Cc Open Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcName <em>Cc Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcClass <em>Cc Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcEmployees <em>Cc Employees</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcSqFt <em>Cc Sq Ft</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcHours <em>Cc Hours</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcManager <em>Cc Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcMktId <em>Cc Mkt Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcMktClass <em>Cc Mkt Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcMktDesc <em>Cc Mkt Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcMarketManager <em>Cc Market Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcDivision <em>Cc Division</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcDivisionName <em>Cc Division Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCompany <em>Cc Company</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCompanyName <em>Cc Company Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcStreetNumber <em>Cc Street Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcStreetName <em>Cc Street Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcStreetType <em>Cc Street Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcSuiteNumber <em>Cc Suite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCity <em>Cc City</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCounty <em>Cc County</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcState <em>Cc State</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcZip <em>Cc Zip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcCountry <em>Cc Country</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcGmtOffset <em>Cc Gmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CallCenter#getCcTaxPercentage <em>Cc Tax Percentage</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter()
 * @model
 * @generated
 */
public interface CallCenter extends EObject {
	/**
	 * Returns the value of the '<em><b>Cc Call Center Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Call Center Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Call Center Sk</em>' attribute.
	 * @see #setCcCallCenterSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCallCenterSk()
	 * @model
	 * @generated
	 */
	Long getCcCallCenterSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCallCenterSk <em>Cc Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Call Center Sk</em>' attribute.
	 * @see #getCcCallCenterSk()
	 * @generated
	 */
	void setCcCallCenterSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Call Center Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Call Center Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Call Center Id</em>' attribute.
	 * @see #setCcCallCenterId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCallCenterId()
	 * @model
	 * @generated
	 */
	String getCcCallCenterId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCallCenterId <em>Cc Call Center Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Call Center Id</em>' attribute.
	 * @see #getCcCallCenterId()
	 * @generated
	 */
	void setCcCallCenterId(String value);

	/**
	 * Returns the value of the '<em><b>Cc Rec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Rec Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Rec Start Date</em>' attribute.
	 * @see #setCcRecStartDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcRecStartDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getCcRecStartDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcRecStartDate <em>Cc Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Rec Start Date</em>' attribute.
	 * @see #getCcRecStartDate()
	 * @generated
	 */
	void setCcRecStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cc Rec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Rec End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Rec End Date</em>' attribute.
	 * @see #setCcRecEndDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcRecEndDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getCcRecEndDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcRecEndDate <em>Cc Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Rec End Date</em>' attribute.
	 * @see #getCcRecEndDate()
	 * @generated
	 */
	void setCcRecEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cc Closed Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Closed Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Closed Date Sk</em>' attribute.
	 * @see #setCcClosedDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcClosedDateSk()
	 * @model
	 * @generated
	 */
	Long getCcClosedDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcClosedDateSk <em>Cc Closed Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Closed Date Sk</em>' attribute.
	 * @see #getCcClosedDateSk()
	 * @generated
	 */
	void setCcClosedDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Open Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Open Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Open Date Sk</em>' attribute.
	 * @see #setCcOpenDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcOpenDateSk()
	 * @model
	 * @generated
	 */
	Long getCcOpenDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcOpenDateSk <em>Cc Open Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Open Date Sk</em>' attribute.
	 * @see #getCcOpenDateSk()
	 * @generated
	 */
	void setCcOpenDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Name</em>' attribute.
	 * @see #setCcName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcName()
	 * @model
	 * @generated
	 */
	String getCcName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcName <em>Cc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Name</em>' attribute.
	 * @see #getCcName()
	 * @generated
	 */
	void setCcName(String value);

	/**
	 * Returns the value of the '<em><b>Cc Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Class</em>' attribute.
	 * @see #setCcClass(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcClass()
	 * @model
	 * @generated
	 */
	String getCcClass();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcClass <em>Cc Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Class</em>' attribute.
	 * @see #getCcClass()
	 * @generated
	 */
	void setCcClass(String value);

	/**
	 * Returns the value of the '<em><b>Cc Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Employees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Employees</em>' attribute.
	 * @see #setCcEmployees(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcEmployees()
	 * @model
	 * @generated
	 */
	Long getCcEmployees();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcEmployees <em>Cc Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Employees</em>' attribute.
	 * @see #getCcEmployees()
	 * @generated
	 */
	void setCcEmployees(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Sq Ft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Sq Ft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Sq Ft</em>' attribute.
	 * @see #setCcSqFt(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcSqFt()
	 * @model
	 * @generated
	 */
	Long getCcSqFt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcSqFt <em>Cc Sq Ft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Sq Ft</em>' attribute.
	 * @see #getCcSqFt()
	 * @generated
	 */
	void setCcSqFt(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Hours</em>' attribute.
	 * @see #setCcHours(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcHours()
	 * @model
	 * @generated
	 */
	String getCcHours();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcHours <em>Cc Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Hours</em>' attribute.
	 * @see #getCcHours()
	 * @generated
	 */
	void setCcHours(String value);

	/**
	 * Returns the value of the '<em><b>Cc Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Manager</em>' attribute.
	 * @see #setCcManager(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcManager()
	 * @model
	 * @generated
	 */
	String getCcManager();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcManager <em>Cc Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Manager</em>' attribute.
	 * @see #getCcManager()
	 * @generated
	 */
	void setCcManager(String value);

	/**
	 * Returns the value of the '<em><b>Cc Mkt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Mkt Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Mkt Id</em>' attribute.
	 * @see #setCcMktId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcMktId()
	 * @model
	 * @generated
	 */
	Long getCcMktId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcMktId <em>Cc Mkt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Mkt Id</em>' attribute.
	 * @see #getCcMktId()
	 * @generated
	 */
	void setCcMktId(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Mkt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Mkt Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Mkt Class</em>' attribute.
	 * @see #setCcMktClass(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcMktClass()
	 * @model
	 * @generated
	 */
	String getCcMktClass();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcMktClass <em>Cc Mkt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Mkt Class</em>' attribute.
	 * @see #getCcMktClass()
	 * @generated
	 */
	void setCcMktClass(String value);

	/**
	 * Returns the value of the '<em><b>Cc Mkt Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Mkt Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Mkt Desc</em>' attribute.
	 * @see #setCcMktDesc(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcMktDesc()
	 * @model
	 * @generated
	 */
	String getCcMktDesc();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcMktDesc <em>Cc Mkt Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Mkt Desc</em>' attribute.
	 * @see #getCcMktDesc()
	 * @generated
	 */
	void setCcMktDesc(String value);

	/**
	 * Returns the value of the '<em><b>Cc Market Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Market Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Market Manager</em>' attribute.
	 * @see #setCcMarketManager(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcMarketManager()
	 * @model
	 * @generated
	 */
	String getCcMarketManager();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcMarketManager <em>Cc Market Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Market Manager</em>' attribute.
	 * @see #getCcMarketManager()
	 * @generated
	 */
	void setCcMarketManager(String value);

	/**
	 * Returns the value of the '<em><b>Cc Division</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Division</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Division</em>' attribute.
	 * @see #setCcDivision(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcDivision()
	 * @model
	 * @generated
	 */
	Long getCcDivision();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcDivision <em>Cc Division</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Division</em>' attribute.
	 * @see #getCcDivision()
	 * @generated
	 */
	void setCcDivision(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Division Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Division Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Division Name</em>' attribute.
	 * @see #setCcDivisionName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcDivisionName()
	 * @model
	 * @generated
	 */
	String getCcDivisionName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcDivisionName <em>Cc Division Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Division Name</em>' attribute.
	 * @see #getCcDivisionName()
	 * @generated
	 */
	void setCcDivisionName(String value);

	/**
	 * Returns the value of the '<em><b>Cc Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Company</em>' attribute.
	 * @see #setCcCompany(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCompany()
	 * @model
	 * @generated
	 */
	Long getCcCompany();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCompany <em>Cc Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Company</em>' attribute.
	 * @see #getCcCompany()
	 * @generated
	 */
	void setCcCompany(Long value);

	/**
	 * Returns the value of the '<em><b>Cc Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Company Name</em>' attribute.
	 * @see #setCcCompanyName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCompanyName()
	 * @model
	 * @generated
	 */
	String getCcCompanyName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCompanyName <em>Cc Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Company Name</em>' attribute.
	 * @see #getCcCompanyName()
	 * @generated
	 */
	void setCcCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Cc Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Street Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Street Number</em>' attribute.
	 * @see #setCcStreetNumber(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcStreetNumber()
	 * @model
	 * @generated
	 */
	String getCcStreetNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcStreetNumber <em>Cc Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Street Number</em>' attribute.
	 * @see #getCcStreetNumber()
	 * @generated
	 */
	void setCcStreetNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cc Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Street Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Street Name</em>' attribute.
	 * @see #setCcStreetName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcStreetName()
	 * @model
	 * @generated
	 */
	String getCcStreetName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcStreetName <em>Cc Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Street Name</em>' attribute.
	 * @see #getCcStreetName()
	 * @generated
	 */
	void setCcStreetName(String value);

	/**
	 * Returns the value of the '<em><b>Cc Street Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Street Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Street Type</em>' attribute.
	 * @see #setCcStreetType(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcStreetType()
	 * @model
	 * @generated
	 */
	String getCcStreetType();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcStreetType <em>Cc Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Street Type</em>' attribute.
	 * @see #getCcStreetType()
	 * @generated
	 */
	void setCcStreetType(String value);

	/**
	 * Returns the value of the '<em><b>Cc Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Suite Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Suite Number</em>' attribute.
	 * @see #setCcSuiteNumber(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcSuiteNumber()
	 * @model
	 * @generated
	 */
	String getCcSuiteNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcSuiteNumber <em>Cc Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Suite Number</em>' attribute.
	 * @see #getCcSuiteNumber()
	 * @generated
	 */
	void setCcSuiteNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cc City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc City</em>' attribute.
	 * @see #setCcCity(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCity()
	 * @model
	 * @generated
	 */
	String getCcCity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCity <em>Cc City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc City</em>' attribute.
	 * @see #getCcCity()
	 * @generated
	 */
	void setCcCity(String value);

	/**
	 * Returns the value of the '<em><b>Cc County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc County</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc County</em>' attribute.
	 * @see #setCcCounty(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCounty()
	 * @model
	 * @generated
	 */
	String getCcCounty();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCounty <em>Cc County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc County</em>' attribute.
	 * @see #getCcCounty()
	 * @generated
	 */
	void setCcCounty(String value);

	/**
	 * Returns the value of the '<em><b>Cc State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc State</em>' attribute.
	 * @see #setCcState(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcState()
	 * @model
	 * @generated
	 */
	String getCcState();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcState <em>Cc State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc State</em>' attribute.
	 * @see #getCcState()
	 * @generated
	 */
	void setCcState(String value);

	/**
	 * Returns the value of the '<em><b>Cc Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Zip</em>' attribute.
	 * @see #setCcZip(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcZip()
	 * @model
	 * @generated
	 */
	String getCcZip();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcZip <em>Cc Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Zip</em>' attribute.
	 * @see #getCcZip()
	 * @generated
	 */
	void setCcZip(String value);

	/**
	 * Returns the value of the '<em><b>Cc Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Country</em>' attribute.
	 * @see #setCcCountry(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcCountry()
	 * @model
	 * @generated
	 */
	String getCcCountry();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcCountry <em>Cc Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Country</em>' attribute.
	 * @see #getCcCountry()
	 * @generated
	 */
	void setCcCountry(String value);

	/**
	 * Returns the value of the '<em><b>Cc Gmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Gmt Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Gmt Offset</em>' attribute.
	 * @see #setCcGmtOffset(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcGmtOffset()
	 * @model
	 * @generated
	 */
	double getCcGmtOffset();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcGmtOffset <em>Cc Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Gmt Offset</em>' attribute.
	 * @see #getCcGmtOffset()
	 * @generated
	 */
	void setCcGmtOffset(double value);

	/**
	 * Returns the value of the '<em><b>Cc Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Tax Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Tax Percentage</em>' attribute.
	 * @see #setCcTaxPercentage(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCallCenter_CcTaxPercentage()
	 * @model
	 * @generated
	 */
	double getCcTaxPercentage();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CallCenter#getCcTaxPercentage <em>Cc Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Tax Percentage</em>' attribute.
	 * @see #getCcTaxPercentage()
	 * @generated
	 */
	void setCcTaxPercentage(double value);

} // CallCenter
