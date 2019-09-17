/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.Item#getIItemSk <em>IItem Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIItemId <em>IItem Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIRecStartDate <em>IRec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIRecEndDate <em>IRec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIItemDesc <em>IItem Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getICurrentPrice <em>ICurrent Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIWholesaleCost <em>IWholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIBrandId <em>IBrand Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIBrand <em>IBrand</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIClassId <em>IClass Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIClass <em>IClass</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getICategoryId <em>ICategory Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getICategory <em>ICategory</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIManufactId <em>IManufact Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIManufact <em>IManufact</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getISize <em>ISize</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIFormulation <em>IFormulation</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIColor <em>IColor</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIUnits <em>IUnits</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIContainer <em>IContainer</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIManagerId <em>IManager Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Item#getIProductName <em>IProduct Name</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>IItem Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IItem Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IItem Sk</em>' attribute.
	 * @see #setIItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IItemSk()
	 * @model
	 * @generated
	 */
	Long getIItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIItemSk <em>IItem Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IItem Sk</em>' attribute.
	 * @see #getIItemSk()
	 * @generated
	 */
	void setIItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>IItem Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IItem Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IItem Id</em>' attribute.
	 * @see #setIItemId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IItemId()
	 * @model
	 * @generated
	 */
	String getIItemId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIItemId <em>IItem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IItem Id</em>' attribute.
	 * @see #getIItemId()
	 * @generated
	 */
	void setIItemId(String value);

	/**
	 * Returns the value of the '<em><b>IRec Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRec Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRec Start Date</em>' attribute.
	 * @see #setIRecStartDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IRecStartDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getIRecStartDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIRecStartDate <em>IRec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRec Start Date</em>' attribute.
	 * @see #getIRecStartDate()
	 * @generated
	 */
	void setIRecStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>IRec End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRec End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRec End Date</em>' attribute.
	 * @see #setIRecEndDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IRecEndDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getIRecEndDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIRecEndDate <em>IRec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRec End Date</em>' attribute.
	 * @see #getIRecEndDate()
	 * @generated
	 */
	void setIRecEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>IItem Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IItem Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IItem Desc</em>' attribute.
	 * @see #setIItemDesc(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IItemDesc()
	 * @model
	 * @generated
	 */
	String getIItemDesc();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIItemDesc <em>IItem Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IItem Desc</em>' attribute.
	 * @see #getIItemDesc()
	 * @generated
	 */
	void setIItemDesc(String value);

	/**
	 * Returns the value of the '<em><b>ICurrent Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICurrent Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICurrent Price</em>' attribute.
	 * @see #setICurrentPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_ICurrentPrice()
	 * @model
	 * @generated
	 */
	double getICurrentPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getICurrentPrice <em>ICurrent Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICurrent Price</em>' attribute.
	 * @see #getICurrentPrice()
	 * @generated
	 */
	void setICurrentPrice(double value);

	/**
	 * Returns the value of the '<em><b>IWholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IWholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IWholesale Cost</em>' attribute.
	 * @see #setIWholesaleCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IWholesaleCost()
	 * @model
	 * @generated
	 */
	double getIWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIWholesaleCost <em>IWholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IWholesale Cost</em>' attribute.
	 * @see #getIWholesaleCost()
	 * @generated
	 */
	void setIWholesaleCost(double value);

	/**
	 * Returns the value of the '<em><b>IBrand Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBrand Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBrand Id</em>' attribute.
	 * @see #setIBrandId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IBrandId()
	 * @model
	 * @generated
	 */
	Long getIBrandId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIBrandId <em>IBrand Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBrand Id</em>' attribute.
	 * @see #getIBrandId()
	 * @generated
	 */
	void setIBrandId(Long value);

	/**
	 * Returns the value of the '<em><b>IBrand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBrand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBrand</em>' attribute.
	 * @see #setIBrand(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IBrand()
	 * @model
	 * @generated
	 */
	String getIBrand();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIBrand <em>IBrand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBrand</em>' attribute.
	 * @see #getIBrand()
	 * @generated
	 */
	void setIBrand(String value);

	/**
	 * Returns the value of the '<em><b>IClass Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IClass Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IClass Id</em>' attribute.
	 * @see #setIClassId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IClassId()
	 * @model
	 * @generated
	 */
	Long getIClassId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIClassId <em>IClass Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IClass Id</em>' attribute.
	 * @see #getIClassId()
	 * @generated
	 */
	void setIClassId(Long value);

	/**
	 * Returns the value of the '<em><b>IClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IClass</em>' attribute.
	 * @see #setIClass(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IClass()
	 * @model
	 * @generated
	 */
	String getIClass();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIClass <em>IClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IClass</em>' attribute.
	 * @see #getIClass()
	 * @generated
	 */
	void setIClass(String value);

	/**
	 * Returns the value of the '<em><b>ICategory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICategory Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICategory Id</em>' attribute.
	 * @see #setICategoryId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_ICategoryId()
	 * @model
	 * @generated
	 */
	Long getICategoryId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getICategoryId <em>ICategory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICategory Id</em>' attribute.
	 * @see #getICategoryId()
	 * @generated
	 */
	void setICategoryId(Long value);

	/**
	 * Returns the value of the '<em><b>ICategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICategory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICategory</em>' attribute.
	 * @see #setICategory(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_ICategory()
	 * @model
	 * @generated
	 */
	String getICategory();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getICategory <em>ICategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICategory</em>' attribute.
	 * @see #getICategory()
	 * @generated
	 */
	void setICategory(String value);

	/**
	 * Returns the value of the '<em><b>IManufact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IManufact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IManufact Id</em>' attribute.
	 * @see #setIManufactId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IManufactId()
	 * @model
	 * @generated
	 */
	Long getIManufactId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIManufactId <em>IManufact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IManufact Id</em>' attribute.
	 * @see #getIManufactId()
	 * @generated
	 */
	void setIManufactId(Long value);

	/**
	 * Returns the value of the '<em><b>IManufact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IManufact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IManufact</em>' attribute.
	 * @see #setIManufact(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IManufact()
	 * @model
	 * @generated
	 */
	String getIManufact();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIManufact <em>IManufact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IManufact</em>' attribute.
	 * @see #getIManufact()
	 * @generated
	 */
	void setIManufact(String value);

	/**
	 * Returns the value of the '<em><b>ISize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISize</em>' attribute.
	 * @see #setISize(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_ISize()
	 * @model
	 * @generated
	 */
	String getISize();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getISize <em>ISize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISize</em>' attribute.
	 * @see #getISize()
	 * @generated
	 */
	void setISize(String value);

	/**
	 * Returns the value of the '<em><b>IFormulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IFormulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IFormulation</em>' attribute.
	 * @see #setIFormulation(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IFormulation()
	 * @model
	 * @generated
	 */
	String getIFormulation();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIFormulation <em>IFormulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IFormulation</em>' attribute.
	 * @see #getIFormulation()
	 * @generated
	 */
	void setIFormulation(String value);

	/**
	 * Returns the value of the '<em><b>IColor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IColor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IColor</em>' attribute.
	 * @see #setIColor(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IColor()
	 * @model
	 * @generated
	 */
	String getIColor();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIColor <em>IColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IColor</em>' attribute.
	 * @see #getIColor()
	 * @generated
	 */
	void setIColor(String value);

	/**
	 * Returns the value of the '<em><b>IUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IUnits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IUnits</em>' attribute.
	 * @see #setIUnits(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IUnits()
	 * @model
	 * @generated
	 */
	String getIUnits();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIUnits <em>IUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IUnits</em>' attribute.
	 * @see #getIUnits()
	 * @generated
	 */
	void setIUnits(String value);

	/**
	 * Returns the value of the '<em><b>IContainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IContainer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IContainer</em>' attribute.
	 * @see #setIContainer(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IContainer()
	 * @model
	 * @generated
	 */
	String getIContainer();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIContainer <em>IContainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IContainer</em>' attribute.
	 * @see #getIContainer()
	 * @generated
	 */
	void setIContainer(String value);

	/**
	 * Returns the value of the '<em><b>IManager Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IManager Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IManager Id</em>' attribute.
	 * @see #setIManagerId(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IManagerId()
	 * @model
	 * @generated
	 */
	Long getIManagerId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIManagerId <em>IManager Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IManager Id</em>' attribute.
	 * @see #getIManagerId()
	 * @generated
	 */
	void setIManagerId(Long value);

	/**
	 * Returns the value of the '<em><b>IProduct Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IProduct Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IProduct Name</em>' attribute.
	 * @see #setIProductName(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getItem_IProductName()
	 * @model
	 * @generated
	 */
	String getIProductName();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Item#getIProductName <em>IProduct Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IProduct Name</em>' attribute.
	 * @see #getIProductName()
	 * @generated
	 */
	void setIProductName(String value);

} // Item
