/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebSiteSk <em>Web Site Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebRecStartDate <em>Web Rec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebRecEndDate <em>Web Rec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebName <em>Web Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebOpenDateSk <em>Web Open Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebCloseDateSk <em>Web Close Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebClass <em>Web Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebManager <em>Web Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebMktId <em>Web Mkt Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebMktClass <em>Web Mkt Class</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebMktDesc <em>Web Mkt Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebMarketManager <em>Web Market Manager</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebCompanyId <em>Web Company Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebCompanyName <em>Web Company Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebStreetNumber <em>Web Street Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebStreetName <em>Web Street Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebStreetType <em>Web Street Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebSuiteNumber <em>Web Suite Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebCity <em>Web City</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebCounty <em>Web County</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebState <em>Web State</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebZip <em>Web Zip</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebCountry <em>Web Country</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebGmtOffset <em>Web Gmt Offset</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSite#getWebTaxPercentage <em>Web Tax Percentage</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite()
 * @model
 * @generated
 */
public interface WebSite extends EObject {
	/**
	 * Returns the value of the '<em><b>Web Site Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Sk</em>' attribute.
	 * @see #setWebSiteSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebSiteSk()
	 * @model
	 * @generated
	 */
	Long getWebSiteSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebSiteSk <em>Web Site Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Sk</em>' attribute.
	 * @see #getWebSiteSk()
	 * @generated
	 */
	void setWebSiteSk(Long value);

	/**
	 * Returns the value of the '<em><b>Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Id</em>' attribute.
	 * @see #setWebSiteId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebSiteId()
	 * @model
	 * @generated
	 */
	String getWebSiteId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebSiteId <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' attribute.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(String value);

	/**
	 * Returns the value of the '<em><b>Web Rec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Rec Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Rec Start Date</em>' attribute.
	 * @see #setWebRecStartDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebRecStartDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getWebRecStartDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebRecStartDate <em>Web Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Rec Start Date</em>' attribute.
	 * @see #getWebRecStartDate()
	 * @generated
	 */
	void setWebRecStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Web Rec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Rec End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Rec End Date</em>' attribute.
	 * @see #setWebRecEndDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebRecEndDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getWebRecEndDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebRecEndDate <em>Web Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Rec End Date</em>' attribute.
	 * @see #getWebRecEndDate()
	 * @generated
	 */
	void setWebRecEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Web Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Name</em>' attribute.
	 * @see #setWebName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebName()
	 * @model
	 * @generated
	 */
	String getWebName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebName <em>Web Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Name</em>' attribute.
	 * @see #getWebName()
	 * @generated
	 */
	void setWebName(String value);

	/**
	 * Returns the value of the '<em><b>Web Open Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Open Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Open Date Sk</em>' attribute.
	 * @see #setWebOpenDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebOpenDateSk()
	 * @model
	 * @generated
	 */
	Long getWebOpenDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebOpenDateSk <em>Web Open Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Open Date Sk</em>' attribute.
	 * @see #getWebOpenDateSk()
	 * @generated
	 */
	void setWebOpenDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Web Close Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Close Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Close Date Sk</em>' attribute.
	 * @see #setWebCloseDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebCloseDateSk()
	 * @model
	 * @generated
	 */
	Long getWebCloseDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebCloseDateSk <em>Web Close Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Close Date Sk</em>' attribute.
	 * @see #getWebCloseDateSk()
	 * @generated
	 */
	void setWebCloseDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Web Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Class</em>' attribute.
	 * @see #setWebClass(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebClass()
	 * @model
	 * @generated
	 */
	String getWebClass();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebClass <em>Web Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Class</em>' attribute.
	 * @see #getWebClass()
	 * @generated
	 */
	void setWebClass(String value);

	/**
	 * Returns the value of the '<em><b>Web Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Manager</em>' attribute.
	 * @see #setWebManager(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebManager()
	 * @model
	 * @generated
	 */
	String getWebManager();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebManager <em>Web Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Manager</em>' attribute.
	 * @see #getWebManager()
	 * @generated
	 */
	void setWebManager(String value);

	/**
	 * Returns the value of the '<em><b>Web Mkt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Mkt Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Mkt Id</em>' attribute.
	 * @see #setWebMktId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebMktId()
	 * @model
	 * @generated
	 */
	Long getWebMktId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebMktId <em>Web Mkt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Mkt Id</em>' attribute.
	 * @see #getWebMktId()
	 * @generated
	 */
	void setWebMktId(Long value);

	/**
	 * Returns the value of the '<em><b>Web Mkt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Mkt Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Mkt Class</em>' attribute.
	 * @see #setWebMktClass(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebMktClass()
	 * @model
	 * @generated
	 */
	String getWebMktClass();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebMktClass <em>Web Mkt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Mkt Class</em>' attribute.
	 * @see #getWebMktClass()
	 * @generated
	 */
	void setWebMktClass(String value);

	/**
	 * Returns the value of the '<em><b>Web Mkt Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Mkt Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Mkt Desc</em>' attribute.
	 * @see #setWebMktDesc(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebMktDesc()
	 * @model
	 * @generated
	 */
	String getWebMktDesc();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebMktDesc <em>Web Mkt Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Mkt Desc</em>' attribute.
	 * @see #getWebMktDesc()
	 * @generated
	 */
	void setWebMktDesc(String value);

	/**
	 * Returns the value of the '<em><b>Web Market Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Market Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Market Manager</em>' attribute.
	 * @see #setWebMarketManager(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebMarketManager()
	 * @model
	 * @generated
	 */
	String getWebMarketManager();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebMarketManager <em>Web Market Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Market Manager</em>' attribute.
	 * @see #getWebMarketManager()
	 * @generated
	 */
	void setWebMarketManager(String value);

	/**
	 * Returns the value of the '<em><b>Web Company Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Company Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Company Id</em>' attribute.
	 * @see #setWebCompanyId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebCompanyId()
	 * @model
	 * @generated
	 */
	Long getWebCompanyId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebCompanyId <em>Web Company Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Company Id</em>' attribute.
	 * @see #getWebCompanyId()
	 * @generated
	 */
	void setWebCompanyId(Long value);

	/**
	 * Returns the value of the '<em><b>Web Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Company Name</em>' attribute.
	 * @see #setWebCompanyName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebCompanyName()
	 * @model
	 * @generated
	 */
	String getWebCompanyName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebCompanyName <em>Web Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Company Name</em>' attribute.
	 * @see #getWebCompanyName()
	 * @generated
	 */
	void setWebCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Web Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Street Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Street Number</em>' attribute.
	 * @see #setWebStreetNumber(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebStreetNumber()
	 * @model
	 * @generated
	 */
	String getWebStreetNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebStreetNumber <em>Web Street Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Street Number</em>' attribute.
	 * @see #getWebStreetNumber()
	 * @generated
	 */
	void setWebStreetNumber(String value);

	/**
	 * Returns the value of the '<em><b>Web Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Street Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Street Name</em>' attribute.
	 * @see #setWebStreetName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebStreetName()
	 * @model
	 * @generated
	 */
	String getWebStreetName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebStreetName <em>Web Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Street Name</em>' attribute.
	 * @see #getWebStreetName()
	 * @generated
	 */
	void setWebStreetName(String value);

	/**
	 * Returns the value of the '<em><b>Web Street Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Street Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Street Type</em>' attribute.
	 * @see #setWebStreetType(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebStreetType()
	 * @model
	 * @generated
	 */
	String getWebStreetType();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebStreetType <em>Web Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Street Type</em>' attribute.
	 * @see #getWebStreetType()
	 * @generated
	 */
	void setWebStreetType(String value);

	/**
	 * Returns the value of the '<em><b>Web Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Suite Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Suite Number</em>' attribute.
	 * @see #setWebSuiteNumber(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebSuiteNumber()
	 * @model
	 * @generated
	 */
	String getWebSuiteNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebSuiteNumber <em>Web Suite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Suite Number</em>' attribute.
	 * @see #getWebSuiteNumber()
	 * @generated
	 */
	void setWebSuiteNumber(String value);

	/**
	 * Returns the value of the '<em><b>Web City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web City</em>' attribute.
	 * @see #setWebCity(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebCity()
	 * @model
	 * @generated
	 */
	String getWebCity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebCity <em>Web City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web City</em>' attribute.
	 * @see #getWebCity()
	 * @generated
	 */
	void setWebCity(String value);

	/**
	 * Returns the value of the '<em><b>Web County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web County</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web County</em>' attribute.
	 * @see #setWebCounty(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebCounty()
	 * @model
	 * @generated
	 */
	String getWebCounty();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebCounty <em>Web County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web County</em>' attribute.
	 * @see #getWebCounty()
	 * @generated
	 */
	void setWebCounty(String value);

	/**
	 * Returns the value of the '<em><b>Web State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web State</em>' attribute.
	 * @see #setWebState(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebState()
	 * @model
	 * @generated
	 */
	String getWebState();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebState <em>Web State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web State</em>' attribute.
	 * @see #getWebState()
	 * @generated
	 */
	void setWebState(String value);

	/**
	 * Returns the value of the '<em><b>Web Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Zip</em>' attribute.
	 * @see #setWebZip(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebZip()
	 * @model
	 * @generated
	 */
	String getWebZip();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebZip <em>Web Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Zip</em>' attribute.
	 * @see #getWebZip()
	 * @generated
	 */
	void setWebZip(String value);

	/**
	 * Returns the value of the '<em><b>Web Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Country</em>' attribute.
	 * @see #setWebCountry(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebCountry()
	 * @model
	 * @generated
	 */
	String getWebCountry();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebCountry <em>Web Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Country</em>' attribute.
	 * @see #getWebCountry()
	 * @generated
	 */
	void setWebCountry(String value);

	/**
	 * Returns the value of the '<em><b>Web Gmt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Gmt Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Gmt Offset</em>' attribute.
	 * @see #setWebGmtOffset(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebGmtOffset()
	 * @model
	 * @generated
	 */
	double getWebGmtOffset();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebGmtOffset <em>Web Gmt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Gmt Offset</em>' attribute.
	 * @see #getWebGmtOffset()
	 * @generated
	 */
	void setWebGmtOffset(double value);

	/**
	 * Returns the value of the '<em><b>Web Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Tax Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Tax Percentage</em>' attribute.
	 * @see #setWebTaxPercentage(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSite_WebTaxPercentage()
	 * @model
	 * @generated
	 */
	double getWebTaxPercentage();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSite#getWebTaxPercentage <em>Web Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Tax Percentage</em>' attribute.
	 * @see #getWebTaxPercentage()
	 * @generated
	 */
	void setWebTaxPercentage(double value);

} // WebSite
