/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promotion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPPromoSk <em>PPromo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPPromoId <em>PPromo Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPStartDateSk <em>PStart Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPEndDateSk <em>PEnd Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPItemSk <em>PItem Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPCost <em>PCost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPResponseTarget <em>PResponse Target</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPPromoName <em>PPromo Name</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelDmail <em>PChannel Dmail</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelEmail <em>PChannel Email</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelCatalog <em>PChannel Catalog</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelTv <em>PChannel Tv</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelRadio <em>PChannel Radio</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelPress <em>PChannel Press</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelEvent <em>PChannel Event</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelDemo <em>PChannel Demo</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPChannelDetails <em>PChannel Details</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPPurpose <em>PPurpose</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Promotion#getPDiscountActive <em>PDiscount Active</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion()
 * @model
 * @generated
 */
public interface Promotion extends EObject {
	/**
	 * Returns the value of the '<em><b>PPromo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PPromo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PPromo Sk</em>' attribute.
	 * @see #setPPromoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PPromoSk()
	 * @model
	 * @generated
	 */
	Long getPPromoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPPromoSk <em>PPromo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPromo Sk</em>' attribute.
	 * @see #getPPromoSk()
	 * @generated
	 */
	void setPPromoSk(Long value);

	/**
	 * Returns the value of the '<em><b>PPromo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PPromo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PPromo Id</em>' attribute.
	 * @see #setPPromoId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PPromoId()
	 * @model
	 * @generated
	 */
	String getPPromoId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPPromoId <em>PPromo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPromo Id</em>' attribute.
	 * @see #getPPromoId()
	 * @generated
	 */
	void setPPromoId(String value);

	/**
	 * Returns the value of the '<em><b>PStart Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PStart Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PStart Date Sk</em>' attribute.
	 * @see #setPStartDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PStartDateSk()
	 * @model
	 * @generated
	 */
	Long getPStartDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPStartDateSk <em>PStart Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PStart Date Sk</em>' attribute.
	 * @see #getPStartDateSk()
	 * @generated
	 */
	void setPStartDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>PEnd Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEnd Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEnd Date Sk</em>' attribute.
	 * @see #setPEndDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PEndDateSk()
	 * @model
	 * @generated
	 */
	Long getPEndDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPEndDateSk <em>PEnd Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEnd Date Sk</em>' attribute.
	 * @see #getPEndDateSk()
	 * @generated
	 */
	void setPEndDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>PItem Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PItem Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PItem Sk</em>' attribute.
	 * @see #setPItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PItemSk()
	 * @model
	 * @generated
	 */
	Long getPItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPItemSk <em>PItem Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PItem Sk</em>' attribute.
	 * @see #getPItemSk()
	 * @generated
	 */
	void setPItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>PCost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCost</em>' attribute.
	 * @see #setPCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PCost()
	 * @model
	 * @generated
	 */
	double getPCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPCost <em>PCost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCost</em>' attribute.
	 * @see #getPCost()
	 * @generated
	 */
	void setPCost(double value);

	/**
	 * Returns the value of the '<em><b>PResponse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PResponse Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PResponse Target</em>' attribute.
	 * @see #setPResponseTarget(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PResponseTarget()
	 * @model
	 * @generated
	 */
	Long getPResponseTarget();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPResponseTarget <em>PResponse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PResponse Target</em>' attribute.
	 * @see #getPResponseTarget()
	 * @generated
	 */
	void setPResponseTarget(Long value);

	/**
	 * Returns the value of the '<em><b>PPromo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PPromo Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PPromo Name</em>' attribute.
	 * @see #setPPromoName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PPromoName()
	 * @model
	 * @generated
	 */
	String getPPromoName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPPromoName <em>PPromo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPromo Name</em>' attribute.
	 * @see #getPPromoName()
	 * @generated
	 */
	void setPPromoName(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Dmail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Dmail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Dmail</em>' attribute.
	 * @see #setPChannelDmail(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelDmail()
	 * @model
	 * @generated
	 */
	String getPChannelDmail();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelDmail <em>PChannel Dmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Dmail</em>' attribute.
	 * @see #getPChannelDmail()
	 * @generated
	 */
	void setPChannelDmail(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Email</em>' attribute.
	 * @see #setPChannelEmail(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelEmail()
	 * @model
	 * @generated
	 */
	String getPChannelEmail();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelEmail <em>PChannel Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Email</em>' attribute.
	 * @see #getPChannelEmail()
	 * @generated
	 */
	void setPChannelEmail(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Catalog</em>' attribute.
	 * @see #setPChannelCatalog(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelCatalog()
	 * @model
	 * @generated
	 */
	String getPChannelCatalog();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelCatalog <em>PChannel Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Catalog</em>' attribute.
	 * @see #getPChannelCatalog()
	 * @generated
	 */
	void setPChannelCatalog(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Tv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Tv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Tv</em>' attribute.
	 * @see #setPChannelTv(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelTv()
	 * @model
	 * @generated
	 */
	String getPChannelTv();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelTv <em>PChannel Tv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Tv</em>' attribute.
	 * @see #getPChannelTv()
	 * @generated
	 */
	void setPChannelTv(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Radio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Radio</em>' attribute.
	 * @see #setPChannelRadio(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelRadio()
	 * @model
	 * @generated
	 */
	String getPChannelRadio();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelRadio <em>PChannel Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Radio</em>' attribute.
	 * @see #getPChannelRadio()
	 * @generated
	 */
	void setPChannelRadio(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Press</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Press</em>' attribute.
	 * @see #setPChannelPress(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelPress()
	 * @model
	 * @generated
	 */
	String getPChannelPress();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelPress <em>PChannel Press</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Press</em>' attribute.
	 * @see #getPChannelPress()
	 * @generated
	 */
	void setPChannelPress(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Event</em>' attribute.
	 * @see #setPChannelEvent(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelEvent()
	 * @model
	 * @generated
	 */
	String getPChannelEvent();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelEvent <em>PChannel Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Event</em>' attribute.
	 * @see #getPChannelEvent()
	 * @generated
	 */
	void setPChannelEvent(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Demo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Demo</em>' attribute.
	 * @see #setPChannelDemo(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelDemo()
	 * @model
	 * @generated
	 */
	String getPChannelDemo();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelDemo <em>PChannel Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Demo</em>' attribute.
	 * @see #getPChannelDemo()
	 * @generated
	 */
	void setPChannelDemo(String value);

	/**
	 * Returns the value of the '<em><b>PChannel Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PChannel Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PChannel Details</em>' attribute.
	 * @see #setPChannelDetails(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PChannelDetails()
	 * @model
	 * @generated
	 */
	String getPChannelDetails();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPChannelDetails <em>PChannel Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PChannel Details</em>' attribute.
	 * @see #getPChannelDetails()
	 * @generated
	 */
	void setPChannelDetails(String value);

	/**
	 * Returns the value of the '<em><b>PPurpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PPurpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PPurpose</em>' attribute.
	 * @see #setPPurpose(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PPurpose()
	 * @model
	 * @generated
	 */
	String getPPurpose();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPPurpose <em>PPurpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPurpose</em>' attribute.
	 * @see #getPPurpose()
	 * @generated
	 */
	void setPPurpose(String value);

	/**
	 * Returns the value of the '<em><b>PDiscount Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDiscount Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDiscount Active</em>' attribute.
	 * @see #setPDiscountActive(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getPromotion_PDiscountActive()
	 * @model
	 * @generated
	 */
	String getPDiscountActive();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Promotion#getPDiscountActive <em>PDiscount Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDiscount Active</em>' attribute.
	 * @see #getPDiscountActive()
	 * @generated
	 */
	void setPDiscountActive(String value);

} // Promotion
