/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpWebPageSk <em>Wp Web Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpWebPageId <em>Wp Web Page Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpRecStartDate <em>Wp Rec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpRecEndDate <em>Wp Rec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpCreationDateSk <em>Wp Creation Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpAccessDateSk <em>Wp Access Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpAutogenFlag <em>Wp Autogen Flag</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpCustomerSk <em>Wp Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpUrl <em>Wp Url</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpType <em>Wp Type</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpCharCount <em>Wp Char Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpLinkCount <em>Wp Link Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpImageCount <em>Wp Image Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebPage#getWpMaxAdCount <em>Wp Max Ad Count</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage()
 * @model
 * @generated
 */
public interface WebPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Wp Web Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Web Page Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Web Page Sk</em>' attribute.
	 * @see #setWpWebPageSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpWebPageSk()
	 * @model
	 * @generated
	 */
	Long getWpWebPageSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpWebPageSk <em>Wp Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Web Page Sk</em>' attribute.
	 * @see #getWpWebPageSk()
	 * @generated
	 */
	void setWpWebPageSk(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Web Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Web Page Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Web Page Id</em>' attribute.
	 * @see #setWpWebPageId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpWebPageId()
	 * @model
	 * @generated
	 */
	String getWpWebPageId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpWebPageId <em>Wp Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Web Page Id</em>' attribute.
	 * @see #getWpWebPageId()
	 * @generated
	 */
	void setWpWebPageId(String value);

	/**
	 * Returns the value of the '<em><b>Wp Rec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Rec Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Rec Start Date</em>' attribute.
	 * @see #setWpRecStartDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpRecStartDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getWpRecStartDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpRecStartDate <em>Wp Rec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Rec Start Date</em>' attribute.
	 * @see #getWpRecStartDate()
	 * @generated
	 */
	void setWpRecStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Wp Rec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Rec End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Rec End Date</em>' attribute.
	 * @see #setWpRecEndDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpRecEndDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getWpRecEndDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpRecEndDate <em>Wp Rec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Rec End Date</em>' attribute.
	 * @see #getWpRecEndDate()
	 * @generated
	 */
	void setWpRecEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Wp Creation Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Creation Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Creation Date Sk</em>' attribute.
	 * @see #setWpCreationDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpCreationDateSk()
	 * @model
	 * @generated
	 */
	Long getWpCreationDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpCreationDateSk <em>Wp Creation Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Creation Date Sk</em>' attribute.
	 * @see #getWpCreationDateSk()
	 * @generated
	 */
	void setWpCreationDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Access Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Access Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Access Date Sk</em>' attribute.
	 * @see #setWpAccessDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpAccessDateSk()
	 * @model
	 * @generated
	 */
	Long getWpAccessDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpAccessDateSk <em>Wp Access Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Access Date Sk</em>' attribute.
	 * @see #getWpAccessDateSk()
	 * @generated
	 */
	void setWpAccessDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Autogen Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Autogen Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Autogen Flag</em>' attribute.
	 * @see #setWpAutogenFlag(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpAutogenFlag()
	 * @model
	 * @generated
	 */
	String getWpAutogenFlag();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpAutogenFlag <em>Wp Autogen Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Autogen Flag</em>' attribute.
	 * @see #getWpAutogenFlag()
	 * @generated
	 */
	void setWpAutogenFlag(String value);

	/**
	 * Returns the value of the '<em><b>Wp Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Customer Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Customer Sk</em>' attribute.
	 * @see #setWpCustomerSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpCustomerSk()
	 * @model
	 * @generated
	 */
	Long getWpCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpCustomerSk <em>Wp Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Customer Sk</em>' attribute.
	 * @see #getWpCustomerSk()
	 * @generated
	 */
	void setWpCustomerSk(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Url</em>' attribute.
	 * @see #setWpUrl(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpUrl()
	 * @model
	 * @generated
	 */
	String getWpUrl();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpUrl <em>Wp Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Url</em>' attribute.
	 * @see #getWpUrl()
	 * @generated
	 */
	void setWpUrl(String value);

	/**
	 * Returns the value of the '<em><b>Wp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Type</em>' attribute.
	 * @see #setWpType(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpType()
	 * @model
	 * @generated
	 */
	String getWpType();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpType <em>Wp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Type</em>' attribute.
	 * @see #getWpType()
	 * @generated
	 */
	void setWpType(String value);

	/**
	 * Returns the value of the '<em><b>Wp Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Char Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Char Count</em>' attribute.
	 * @see #setWpCharCount(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpCharCount()
	 * @model
	 * @generated
	 */
	Long getWpCharCount();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpCharCount <em>Wp Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Char Count</em>' attribute.
	 * @see #getWpCharCount()
	 * @generated
	 */
	void setWpCharCount(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Link Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Link Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Link Count</em>' attribute.
	 * @see #setWpLinkCount(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpLinkCount()
	 * @model
	 * @generated
	 */
	Long getWpLinkCount();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpLinkCount <em>Wp Link Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Link Count</em>' attribute.
	 * @see #getWpLinkCount()
	 * @generated
	 */
	void setWpLinkCount(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Image Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Image Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Image Count</em>' attribute.
	 * @see #setWpImageCount(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpImageCount()
	 * @model
	 * @generated
	 */
	Long getWpImageCount();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpImageCount <em>Wp Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Image Count</em>' attribute.
	 * @see #getWpImageCount()
	 * @generated
	 */
	void setWpImageCount(Long value);

	/**
	 * Returns the value of the '<em><b>Wp Max Ad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp Max Ad Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp Max Ad Count</em>' attribute.
	 * @see #setWpMaxAdCount(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebPage_WpMaxAdCount()
	 * @model
	 * @generated
	 */
	Long getWpMaxAdCount();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebPage#getWpMaxAdCount <em>Wp Max Ad Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp Max Ad Count</em>' attribute.
	 * @see #getWpMaxAdCount()
	 * @generated
	 */
	void setWpMaxAdCount(Long value);

} // WebPage
