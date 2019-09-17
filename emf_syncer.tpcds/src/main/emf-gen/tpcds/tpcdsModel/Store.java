/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.Store#getSStoreSk <em>SStore Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSStoreId <em>SStore Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSRecStartDate <em>SRec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSRecEndDate <em>SRec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSClosedDateSk <em>SClosed Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSStoreName <em>SStore Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSNumberEmployees <em>SNumber Employees</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSFloorSpace <em>SFloor Space</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSHours <em>SHours</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSManager <em>SManager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSMarketId <em>SMarket Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSGeographyClass <em>SGeography Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSMarketDesc <em>SMarket Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSMarketManager <em>SMarket Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSDivisionId <em>SDivision Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSDivisionName <em>SDivision Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSCompanyId <em>SCompany Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSCompanyName <em>SCompany Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSStreetNumber <em>SStreet Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSStreetName <em>SStreet Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSStreetType <em>SStreet Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSSuiteNumber <em>SSuite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSCity <em>SCity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSCounty <em>SCounty</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSState <em>SState</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSZip <em>SZip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSCountry <em>SCountry</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSGmtOffset <em>SGmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getSTaxPrecentage <em>STax Precentage</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getStoreSales <em>Store Sales</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Store#getStoreReturns <em>Store Returns</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
	/**
	 * Returns the value of the '<em><b>SStore Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStore Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStore Sk</em>' attribute.
	 * @see #setSStoreSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SStoreSk()
	 * @model
	 * @generated
	 */
	Long getSStoreSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSStoreSk <em>SStore Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStore Sk</em>' attribute.
	 * @see #getSStoreSk()
	 * @generated
	 */
	void setSStoreSk(Long value);

	/**
	 * Returns the value of the '<em><b>SStore Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStore Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStore Id</em>' attribute.
	 * @see #setSStoreId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SStoreId()
	 * @model
	 * @generated
	 */
	String getSStoreId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSStoreId <em>SStore Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStore Id</em>' attribute.
	 * @see #getSStoreId()
	 * @generated
	 */
	void setSStoreId(String value);

	/**
	 * Returns the value of the '<em><b>SRec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRec Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRec Start Date</em>' attribute.
	 * @see #setSRecStartDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SRecStartDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getSRecStartDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSRecStartDate <em>SRec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRec Start Date</em>' attribute.
	 * @see #getSRecStartDate()
	 * @generated
	 */
	void setSRecStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>SRec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRec End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRec End Date</em>' attribute.
	 * @see #setSRecEndDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SRecEndDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getSRecEndDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSRecEndDate <em>SRec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRec End Date</em>' attribute.
	 * @see #getSRecEndDate()
	 * @generated
	 */
	void setSRecEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>SClosed Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SClosed Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SClosed Date Sk</em>' attribute.
	 * @see #setSClosedDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SClosedDateSk()
	 * @model
	 * @generated
	 */
	Long getSClosedDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSClosedDateSk <em>SClosed Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SClosed Date Sk</em>' attribute.
	 * @see #getSClosedDateSk()
	 * @generated
	 */
	void setSClosedDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>SStore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStore Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStore Name</em>' attribute.
	 * @see #setSStoreName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SStoreName()
	 * @model
	 * @generated
	 */
	String getSStoreName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSStoreName <em>SStore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStore Name</em>' attribute.
	 * @see #getSStoreName()
	 * @generated
	 */
	void setSStoreName(String value);

	/**
	 * Returns the value of the '<em><b>SNumber Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SNumber Employees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SNumber Employees</em>' attribute.
	 * @see #setSNumberEmployees(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SNumberEmployees()
	 * @model
	 * @generated
	 */
	Long getSNumberEmployees();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSNumberEmployees <em>SNumber Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SNumber Employees</em>' attribute.
	 * @see #getSNumberEmployees()
	 * @generated
	 */
	void setSNumberEmployees(Long value);

	/**
	 * Returns the value of the '<em><b>SFloor Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFloor Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFloor Space</em>' attribute.
	 * @see #setSFloorSpace(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SFloorSpace()
	 * @model
	 * @generated
	 */
	Long getSFloorSpace();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSFloorSpace <em>SFloor Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SFloor Space</em>' attribute.
	 * @see #getSFloorSpace()
	 * @generated
	 */
	void setSFloorSpace(Long value);

	/**
	 * Returns the value of the '<em><b>SHours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SHours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SHours</em>' attribute.
	 * @see #setSHours(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SHours()
	 * @model
	 * @generated
	 */
	String getSHours();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSHours <em>SHours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SHours</em>' attribute.
	 * @see #getSHours()
	 * @generated
	 */
	void setSHours(String value);

	/**
	 * Returns the value of the '<em><b>SManager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SManager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SManager</em>' attribute.
	 * @see #setSManager(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SManager()
	 * @model
	 * @generated
	 */
	String getSManager();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSManager <em>SManager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SManager</em>' attribute.
	 * @see #getSManager()
	 * @generated
	 */
	void setSManager(String value);

	/**
	 * Returns the value of the '<em><b>SMarket Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMarket Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SMarket Id</em>' attribute.
	 * @see #setSMarketId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SMarketId()
	 * @model
	 * @generated
	 */
	Long getSMarketId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSMarketId <em>SMarket Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SMarket Id</em>' attribute.
	 * @see #getSMarketId()
	 * @generated
	 */
	void setSMarketId(Long value);

	/**
	 * Returns the value of the '<em><b>SGeography Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SGeography Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGeography Class</em>' attribute.
	 * @see #setSGeographyClass(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SGeographyClass()
	 * @model
	 * @generated
	 */
	String getSGeographyClass();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSGeographyClass <em>SGeography Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGeography Class</em>' attribute.
	 * @see #getSGeographyClass()
	 * @generated
	 */
	void setSGeographyClass(String value);

	/**
	 * Returns the value of the '<em><b>SMarket Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMarket Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SMarket Desc</em>' attribute.
	 * @see #setSMarketDesc(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SMarketDesc()
	 * @model
	 * @generated
	 */
	String getSMarketDesc();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSMarketDesc <em>SMarket Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SMarket Desc</em>' attribute.
	 * @see #getSMarketDesc()
	 * @generated
	 */
	void setSMarketDesc(String value);

	/**
	 * Returns the value of the '<em><b>SMarket Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMarket Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SMarket Manager</em>' attribute.
	 * @see #setSMarketManager(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SMarketManager()
	 * @model
	 * @generated
	 */
	String getSMarketManager();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSMarketManager <em>SMarket Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SMarket Manager</em>' attribute.
	 * @see #getSMarketManager()
	 * @generated
	 */
	void setSMarketManager(String value);

	/**
	 * Returns the value of the '<em><b>SDivision Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDivision Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDivision Id</em>' attribute.
	 * @see #setSDivisionId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SDivisionId()
	 * @model
	 * @generated
	 */
	Long getSDivisionId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSDivisionId <em>SDivision Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDivision Id</em>' attribute.
	 * @see #getSDivisionId()
	 * @generated
	 */
	void setSDivisionId(Long value);

	/**
	 * Returns the value of the '<em><b>SDivision Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDivision Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDivision Name</em>' attribute.
	 * @see #setSDivisionName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SDivisionName()
	 * @model
	 * @generated
	 */
	String getSDivisionName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSDivisionName <em>SDivision Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDivision Name</em>' attribute.
	 * @see #getSDivisionName()
	 * @generated
	 */
	void setSDivisionName(String value);

	/**
	 * Returns the value of the '<em><b>SCompany Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCompany Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCompany Id</em>' attribute.
	 * @see #setSCompanyId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SCompanyId()
	 * @model
	 * @generated
	 */
	Long getSCompanyId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSCompanyId <em>SCompany Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCompany Id</em>' attribute.
	 * @see #getSCompanyId()
	 * @generated
	 */
	void setSCompanyId(Long value);

	/**
	 * Returns the value of the '<em><b>SCompany Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCompany Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCompany Name</em>' attribute.
	 * @see #setSCompanyName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SCompanyName()
	 * @model
	 * @generated
	 */
	String getSCompanyName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSCompanyName <em>SCompany Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCompany Name</em>' attribute.
	 * @see #getSCompanyName()
	 * @generated
	 */
	void setSCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>SStreet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStreet Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStreet Number</em>' attribute.
	 * @see #setSStreetNumber(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SStreetNumber()
	 * @model
	 * @generated
	 */
	String getSStreetNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSStreetNumber <em>SStreet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStreet Number</em>' attribute.
	 * @see #getSStreetNumber()
	 * @generated
	 */
	void setSStreetNumber(String value);

	/**
	 * Returns the value of the '<em><b>SStreet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStreet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStreet Name</em>' attribute.
	 * @see #setSStreetName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SStreetName()
	 * @model
	 * @generated
	 */
	String getSStreetName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSStreetName <em>SStreet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStreet Name</em>' attribute.
	 * @see #getSStreetName()
	 * @generated
	 */
	void setSStreetName(String value);

	/**
	 * Returns the value of the '<em><b>SStreet Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SStreet Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SStreet Type</em>' attribute.
	 * @see #setSStreetType(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SStreetType()
	 * @model
	 * @generated
	 */
	String getSStreetType();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSStreetType <em>SStreet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SStreet Type</em>' attribute.
	 * @see #getSStreetType()
	 * @generated
	 */
	void setSStreetType(String value);

	/**
	 * Returns the value of the '<em><b>SSuite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSuite Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSuite Number</em>' attribute.
	 * @see #setSSuiteNumber(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SSuiteNumber()
	 * @model
	 * @generated
	 */
	String getSSuiteNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSSuiteNumber <em>SSuite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSuite Number</em>' attribute.
	 * @see #getSSuiteNumber()
	 * @generated
	 */
	void setSSuiteNumber(String value);

	/**
	 * Returns the value of the '<em><b>SCity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCity</em>' attribute.
	 * @see #setSCity(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SCity()
	 * @model
	 * @generated
	 */
	String getSCity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSCity <em>SCity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCity</em>' attribute.
	 * @see #getSCity()
	 * @generated
	 */
	void setSCity(String value);

	/**
	 * Returns the value of the '<em><b>SCounty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCounty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCounty</em>' attribute.
	 * @see #setSCounty(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SCounty()
	 * @model
	 * @generated
	 */
	String getSCounty();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSCounty <em>SCounty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCounty</em>' attribute.
	 * @see #getSCounty()
	 * @generated
	 */
	void setSCounty(String value);

	/**
	 * Returns the value of the '<em><b>SState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SState</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SState</em>' attribute.
	 * @see #setSState(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SState()
	 * @model
	 * @generated
	 */
	String getSState();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSState <em>SState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SState</em>' attribute.
	 * @see #getSState()
	 * @generated
	 */
	void setSState(String value);

	/**
	 * Returns the value of the '<em><b>SZip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SZip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SZip</em>' attribute.
	 * @see #setSZip(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SZip()
	 * @model
	 * @generated
	 */
	String getSZip();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSZip <em>SZip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SZip</em>' attribute.
	 * @see #getSZip()
	 * @generated
	 */
	void setSZip(String value);

	/**
	 * Returns the value of the '<em><b>SCountry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCountry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCountry</em>' attribute.
	 * @see #setSCountry(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SCountry()
	 * @model
	 * @generated
	 */
	String getSCountry();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSCountry <em>SCountry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCountry</em>' attribute.
	 * @see #getSCountry()
	 * @generated
	 */
	void setSCountry(String value);

	/**
	 * Returns the value of the '<em><b>SGmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SGmt Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGmt Offset</em>' attribute.
	 * @see #setSGmtOffset(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_SGmtOffset()
	 * @model
	 * @generated
	 */
	double getSGmtOffset();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSGmtOffset <em>SGmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGmt Offset</em>' attribute.
	 * @see #getSGmtOffset()
	 * @generated
	 */
	void setSGmtOffset(double value);

	/**
	 * Returns the value of the '<em><b>STax Precentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STax Precentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STax Precentage</em>' attribute.
	 * @see #setSTaxPrecentage(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_STaxPrecentage()
	 * @model
	 * @generated
	 */
	double getSTaxPrecentage();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Store#getSTaxPrecentage <em>STax Precentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STax Precentage</em>' attribute.
	 * @see #getSTaxPrecentage()
	 * @generated
	 */
	void setSTaxPrecentage(double value);

	/**
	 * Returns the value of the '<em><b>Store Sales</b></em>' reference list.
	 * The list contents are of type {@link tpcds.tpcdsModel.StoreSales}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Sales</em>' reference list.
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_StoreSales()
	 * @model
	 * @generated
	 */
	EList<StoreSales> getStoreSales();

	/**
	 * Returns the value of the '<em><b>Store Returns</b></em>' reference list.
	 * The list contents are of type {@link tpcds.tpcdsModel.StoreReturns}.
	 * It is bidirectional and its opposite is '{@link tpcds.tpcdsModel.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Returns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Returns</em>' reference list.
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStore_StoreReturns()
	 * @see tpcds.tpcdsModel.StoreReturns#getSrStoreSk
	 * @model opposite="srStoreSk"
	 * @generated
	 */
	EList<StoreReturns> getStoreReturns();

} // Store
