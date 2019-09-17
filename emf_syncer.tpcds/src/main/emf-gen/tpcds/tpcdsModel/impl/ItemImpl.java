/**
 */
package tpcds.tpcdsModel.impl;

import java.sql.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Item;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIItemSk <em>IItem Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIItemId <em>IItem Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIRecStartDate <em>IRec Start Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIRecEndDate <em>IRec End Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIItemDesc <em>IItem Desc</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getICurrentPrice <em>ICurrent Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIWholesaleCost <em>IWholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIBrandId <em>IBrand Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIBrand <em>IBrand</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIClassId <em>IClass Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIClass <em>IClass</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getICategoryId <em>ICategory Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getICategory <em>ICategory</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIManufactId <em>IManufact Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIManufact <em>IManufact</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getISize <em>ISize</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIFormulation <em>IFormulation</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIColor <em>IColor</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIUnits <em>IUnits</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIContainer <em>IContainer</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIManagerId <em>IManager Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.ItemImpl#getIProductName <em>IProduct Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #getIItemSk() <em>IItem Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long IITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIItemSk() <em>IItem Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long iItemSk = IITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIItemId() <em>IItem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String IITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIItemId() <em>IItem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIItemId()
	 * @generated
	 * @ordered
	 */
	protected String iItemId = IITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIRecStartDate() <em>IRec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date IREC_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIRecStartDate() <em>IRec Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRecStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date iRecStartDate = IREC_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIRecEndDate() <em>IRec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date IREC_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIRecEndDate() <em>IRec End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRecEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date iRecEndDate = IREC_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIItemDesc() <em>IItem Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIItemDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String IITEM_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIItemDesc() <em>IItem Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIItemDesc()
	 * @generated
	 * @ordered
	 */
	protected String iItemDesc = IITEM_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getICurrentPrice() <em>ICurrent Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double ICURRENT_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getICurrentPrice() <em>ICurrent Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected double iCurrentPrice = ICURRENT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIWholesaleCost() <em>IWholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final double IWHOLESALE_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIWholesaleCost() <em>IWholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected double iWholesaleCost = IWHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIBrandId() <em>IBrand Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBrandId()
	 * @generated
	 * @ordered
	 */
	protected static final Long IBRAND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIBrandId() <em>IBrand Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBrandId()
	 * @generated
	 * @ordered
	 */
	protected Long iBrandId = IBRAND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIBrand() <em>IBrand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String IBRAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIBrand() <em>IBrand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBrand()
	 * @generated
	 * @ordered
	 */
	protected String iBrand = IBRAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIClassId() <em>IClass Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIClassId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ICLASS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIClassId() <em>IClass Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIClassId()
	 * @generated
	 * @ordered
	 */
	protected Long iClassId = ICLASS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIClass() <em>IClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ICLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIClass() <em>IClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIClass()
	 * @generated
	 * @ordered
	 */
	protected String iClass = ICLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getICategoryId() <em>ICategory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ICATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getICategoryId() <em>ICategory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICategoryId()
	 * @generated
	 * @ordered
	 */
	protected Long iCategoryId = ICATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getICategory() <em>ICategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICategory()
	 * @generated
	 * @ordered
	 */
	protected static final String ICATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getICategory() <em>ICategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICategory()
	 * @generated
	 * @ordered
	 */
	protected String iCategory = ICATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIManufactId() <em>IManufact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManufactId()
	 * @generated
	 * @ordered
	 */
	protected static final Long IMANUFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIManufactId() <em>IManufact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManufactId()
	 * @generated
	 * @ordered
	 */
	protected Long iManufactId = IMANUFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIManufact() <em>IManufact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManufact()
	 * @generated
	 * @ordered
	 */
	protected static final String IMANUFACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIManufact() <em>IManufact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManufact()
	 * @generated
	 * @ordered
	 */
	protected String iManufact = IMANUFACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getISize() <em>ISize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISize()
	 * @generated
	 * @ordered
	 */
	protected static final String ISIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getISize() <em>ISize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISize()
	 * @generated
	 * @ordered
	 */
	protected String iSize = ISIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIFormulation() <em>IFormulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIFormulation()
	 * @generated
	 * @ordered
	 */
	protected static final String IFORMULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIFormulation() <em>IFormulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIFormulation()
	 * @generated
	 * @ordered
	 */
	protected String iFormulation = IFORMULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIColor() <em>IColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIColor()
	 * @generated
	 * @ordered
	 */
	protected static final String ICOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIColor() <em>IColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIColor()
	 * @generated
	 * @ordered
	 */
	protected String iColor = ICOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIUnits() <em>IUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String IUNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIUnits() <em>IUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIUnits()
	 * @generated
	 * @ordered
	 */
	protected String iUnits = IUNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIContainer() <em>IContainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String ICONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIContainer() <em>IContainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIContainer()
	 * @generated
	 * @ordered
	 */
	protected String iContainer = ICONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIManagerId() <em>IManager Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManagerId()
	 * @generated
	 * @ordered
	 */
	protected static final Long IMANAGER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIManagerId() <em>IManager Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManagerId()
	 * @generated
	 * @ordered
	 */
	protected Long iManagerId = IMANAGER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIProductName() <em>IProduct Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String IPRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIProductName() <em>IProduct Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIProductName()
	 * @generated
	 * @ordered
	 */
	protected String iProductName = IPRODUCT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIItemSk() {
		return iItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIItemSk(Long newIItemSk) {
		Long oldIItemSk = iItemSk;
		iItemSk = newIItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IITEM_SK, oldIItemSk, iItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIItemId() {
		return iItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIItemId(String newIItemId) {
		String oldIItemId = iItemId;
		iItemId = newIItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IITEM_ID, oldIItemId, iItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIRecStartDate() {
		return iRecStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIRecStartDate(Date newIRecStartDate) {
		Date oldIRecStartDate = iRecStartDate;
		iRecStartDate = newIRecStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IREC_START_DATE, oldIRecStartDate, iRecStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIRecEndDate() {
		return iRecEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIRecEndDate(Date newIRecEndDate) {
		Date oldIRecEndDate = iRecEndDate;
		iRecEndDate = newIRecEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IREC_END_DATE, oldIRecEndDate, iRecEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIItemDesc() {
		return iItemDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIItemDesc(String newIItemDesc) {
		String oldIItemDesc = iItemDesc;
		iItemDesc = newIItemDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IITEM_DESC, oldIItemDesc, iItemDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getICurrentPrice() {
		return iCurrentPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setICurrentPrice(double newICurrentPrice) {
		double oldICurrentPrice = iCurrentPrice;
		iCurrentPrice = newICurrentPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICURRENT_PRICE, oldICurrentPrice, iCurrentPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIWholesaleCost() {
		return iWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIWholesaleCost(double newIWholesaleCost) {
		double oldIWholesaleCost = iWholesaleCost;
		iWholesaleCost = newIWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IWHOLESALE_COST, oldIWholesaleCost, iWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIBrandId() {
		return iBrandId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIBrandId(Long newIBrandId) {
		Long oldIBrandId = iBrandId;
		iBrandId = newIBrandId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IBRAND_ID, oldIBrandId, iBrandId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIBrand() {
		return iBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIBrand(String newIBrand) {
		String oldIBrand = iBrand;
		iBrand = newIBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IBRAND, oldIBrand, iBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIClassId() {
		return iClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIClassId(Long newIClassId) {
		Long oldIClassId = iClassId;
		iClassId = newIClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICLASS_ID, oldIClassId, iClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIClass() {
		return iClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIClass(String newIClass) {
		String oldIClass = iClass;
		iClass = newIClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICLASS, oldIClass, iClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getICategoryId() {
		return iCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setICategoryId(Long newICategoryId) {
		Long oldICategoryId = iCategoryId;
		iCategoryId = newICategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICATEGORY_ID, oldICategoryId, iCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getICategory() {
		return iCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setICategory(String newICategory) {
		String oldICategory = iCategory;
		iCategory = newICategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICATEGORY, oldICategory, iCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIManufactId() {
		return iManufactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIManufactId(Long newIManufactId) {
		Long oldIManufactId = iManufactId;
		iManufactId = newIManufactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IMANUFACT_ID, oldIManufactId, iManufactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIManufact() {
		return iManufact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIManufact(String newIManufact) {
		String oldIManufact = iManufact;
		iManufact = newIManufact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IMANUFACT, oldIManufact, iManufact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getISize() {
		return iSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setISize(String newISize) {
		String oldISize = iSize;
		iSize = newISize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ISIZE, oldISize, iSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIFormulation() {
		return iFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIFormulation(String newIFormulation) {
		String oldIFormulation = iFormulation;
		iFormulation = newIFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IFORMULATION, oldIFormulation, iFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIColor() {
		return iColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIColor(String newIColor) {
		String oldIColor = iColor;
		iColor = newIColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICOLOR, oldIColor, iColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIUnits() {
		return iUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIUnits(String newIUnits) {
		String oldIUnits = iUnits;
		iUnits = newIUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IUNITS, oldIUnits, iUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIContainer() {
		return iContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIContainer(String newIContainer) {
		String oldIContainer = iContainer;
		iContainer = newIContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__ICONTAINER, oldIContainer, iContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIManagerId() {
		return iManagerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIManagerId(Long newIManagerId) {
		Long oldIManagerId = iManagerId;
		iManagerId = newIManagerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IMANAGER_ID, oldIManagerId, iManagerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIProductName() {
		return iProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIProductName(String newIProductName) {
		String oldIProductName = iProductName;
		iProductName = newIProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.ITEM__IPRODUCT_NAME, oldIProductName, iProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.ITEM__IITEM_SK:
				return getIItemSk();
			case TpcdsModelPackage.ITEM__IITEM_ID:
				return getIItemId();
			case TpcdsModelPackage.ITEM__IREC_START_DATE:
				return getIRecStartDate();
			case TpcdsModelPackage.ITEM__IREC_END_DATE:
				return getIRecEndDate();
			case TpcdsModelPackage.ITEM__IITEM_DESC:
				return getIItemDesc();
			case TpcdsModelPackage.ITEM__ICURRENT_PRICE:
				return getICurrentPrice();
			case TpcdsModelPackage.ITEM__IWHOLESALE_COST:
				return getIWholesaleCost();
			case TpcdsModelPackage.ITEM__IBRAND_ID:
				return getIBrandId();
			case TpcdsModelPackage.ITEM__IBRAND:
				return getIBrand();
			case TpcdsModelPackage.ITEM__ICLASS_ID:
				return getIClassId();
			case TpcdsModelPackage.ITEM__ICLASS:
				return getIClass();
			case TpcdsModelPackage.ITEM__ICATEGORY_ID:
				return getICategoryId();
			case TpcdsModelPackage.ITEM__ICATEGORY:
				return getICategory();
			case TpcdsModelPackage.ITEM__IMANUFACT_ID:
				return getIManufactId();
			case TpcdsModelPackage.ITEM__IMANUFACT:
				return getIManufact();
			case TpcdsModelPackage.ITEM__ISIZE:
				return getISize();
			case TpcdsModelPackage.ITEM__IFORMULATION:
				return getIFormulation();
			case TpcdsModelPackage.ITEM__ICOLOR:
				return getIColor();
			case TpcdsModelPackage.ITEM__IUNITS:
				return getIUnits();
			case TpcdsModelPackage.ITEM__ICONTAINER:
				return getIContainer();
			case TpcdsModelPackage.ITEM__IMANAGER_ID:
				return getIManagerId();
			case TpcdsModelPackage.ITEM__IPRODUCT_NAME:
				return getIProductName();
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
			case TpcdsModelPackage.ITEM__IITEM_SK:
				setIItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.ITEM__IITEM_ID:
				setIItemId((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__IREC_START_DATE:
				setIRecStartDate((Date)newValue);
				return;
			case TpcdsModelPackage.ITEM__IREC_END_DATE:
				setIRecEndDate((Date)newValue);
				return;
			case TpcdsModelPackage.ITEM__IITEM_DESC:
				setIItemDesc((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICURRENT_PRICE:
				setICurrentPrice((Double)newValue);
				return;
			case TpcdsModelPackage.ITEM__IWHOLESALE_COST:
				setIWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.ITEM__IBRAND_ID:
				setIBrandId((Long)newValue);
				return;
			case TpcdsModelPackage.ITEM__IBRAND:
				setIBrand((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICLASS_ID:
				setIClassId((Long)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICLASS:
				setIClass((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICATEGORY_ID:
				setICategoryId((Long)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICATEGORY:
				setICategory((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__IMANUFACT_ID:
				setIManufactId((Long)newValue);
				return;
			case TpcdsModelPackage.ITEM__IMANUFACT:
				setIManufact((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__ISIZE:
				setISize((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__IFORMULATION:
				setIFormulation((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICOLOR:
				setIColor((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__IUNITS:
				setIUnits((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__ICONTAINER:
				setIContainer((String)newValue);
				return;
			case TpcdsModelPackage.ITEM__IMANAGER_ID:
				setIManagerId((Long)newValue);
				return;
			case TpcdsModelPackage.ITEM__IPRODUCT_NAME:
				setIProductName((String)newValue);
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
			case TpcdsModelPackage.ITEM__IITEM_SK:
				setIItemSk(IITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IITEM_ID:
				setIItemId(IITEM_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IREC_START_DATE:
				setIRecStartDate(IREC_START_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IREC_END_DATE:
				setIRecEndDate(IREC_END_DATE_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IITEM_DESC:
				setIItemDesc(IITEM_DESC_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICURRENT_PRICE:
				setICurrentPrice(ICURRENT_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IWHOLESALE_COST:
				setIWholesaleCost(IWHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IBRAND_ID:
				setIBrandId(IBRAND_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IBRAND:
				setIBrand(IBRAND_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICLASS_ID:
				setIClassId(ICLASS_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICLASS:
				setIClass(ICLASS_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICATEGORY_ID:
				setICategoryId(ICATEGORY_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICATEGORY:
				setICategory(ICATEGORY_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IMANUFACT_ID:
				setIManufactId(IMANUFACT_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IMANUFACT:
				setIManufact(IMANUFACT_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ISIZE:
				setISize(ISIZE_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IFORMULATION:
				setIFormulation(IFORMULATION_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICOLOR:
				setIColor(ICOLOR_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IUNITS:
				setIUnits(IUNITS_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__ICONTAINER:
				setIContainer(ICONTAINER_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IMANAGER_ID:
				setIManagerId(IMANAGER_ID_EDEFAULT);
				return;
			case TpcdsModelPackage.ITEM__IPRODUCT_NAME:
				setIProductName(IPRODUCT_NAME_EDEFAULT);
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
			case TpcdsModelPackage.ITEM__IITEM_SK:
				return IITEM_SK_EDEFAULT == null ? iItemSk != null : !IITEM_SK_EDEFAULT.equals(iItemSk);
			case TpcdsModelPackage.ITEM__IITEM_ID:
				return IITEM_ID_EDEFAULT == null ? iItemId != null : !IITEM_ID_EDEFAULT.equals(iItemId);
			case TpcdsModelPackage.ITEM__IREC_START_DATE:
				return IREC_START_DATE_EDEFAULT == null ? iRecStartDate != null : !IREC_START_DATE_EDEFAULT.equals(iRecStartDate);
			case TpcdsModelPackage.ITEM__IREC_END_DATE:
				return IREC_END_DATE_EDEFAULT == null ? iRecEndDate != null : !IREC_END_DATE_EDEFAULT.equals(iRecEndDate);
			case TpcdsModelPackage.ITEM__IITEM_DESC:
				return IITEM_DESC_EDEFAULT == null ? iItemDesc != null : !IITEM_DESC_EDEFAULT.equals(iItemDesc);
			case TpcdsModelPackage.ITEM__ICURRENT_PRICE:
				return iCurrentPrice != ICURRENT_PRICE_EDEFAULT;
			case TpcdsModelPackage.ITEM__IWHOLESALE_COST:
				return iWholesaleCost != IWHOLESALE_COST_EDEFAULT;
			case TpcdsModelPackage.ITEM__IBRAND_ID:
				return IBRAND_ID_EDEFAULT == null ? iBrandId != null : !IBRAND_ID_EDEFAULT.equals(iBrandId);
			case TpcdsModelPackage.ITEM__IBRAND:
				return IBRAND_EDEFAULT == null ? iBrand != null : !IBRAND_EDEFAULT.equals(iBrand);
			case TpcdsModelPackage.ITEM__ICLASS_ID:
				return ICLASS_ID_EDEFAULT == null ? iClassId != null : !ICLASS_ID_EDEFAULT.equals(iClassId);
			case TpcdsModelPackage.ITEM__ICLASS:
				return ICLASS_EDEFAULT == null ? iClass != null : !ICLASS_EDEFAULT.equals(iClass);
			case TpcdsModelPackage.ITEM__ICATEGORY_ID:
				return ICATEGORY_ID_EDEFAULT == null ? iCategoryId != null : !ICATEGORY_ID_EDEFAULT.equals(iCategoryId);
			case TpcdsModelPackage.ITEM__ICATEGORY:
				return ICATEGORY_EDEFAULT == null ? iCategory != null : !ICATEGORY_EDEFAULT.equals(iCategory);
			case TpcdsModelPackage.ITEM__IMANUFACT_ID:
				return IMANUFACT_ID_EDEFAULT == null ? iManufactId != null : !IMANUFACT_ID_EDEFAULT.equals(iManufactId);
			case TpcdsModelPackage.ITEM__IMANUFACT:
				return IMANUFACT_EDEFAULT == null ? iManufact != null : !IMANUFACT_EDEFAULT.equals(iManufact);
			case TpcdsModelPackage.ITEM__ISIZE:
				return ISIZE_EDEFAULT == null ? iSize != null : !ISIZE_EDEFAULT.equals(iSize);
			case TpcdsModelPackage.ITEM__IFORMULATION:
				return IFORMULATION_EDEFAULT == null ? iFormulation != null : !IFORMULATION_EDEFAULT.equals(iFormulation);
			case TpcdsModelPackage.ITEM__ICOLOR:
				return ICOLOR_EDEFAULT == null ? iColor != null : !ICOLOR_EDEFAULT.equals(iColor);
			case TpcdsModelPackage.ITEM__IUNITS:
				return IUNITS_EDEFAULT == null ? iUnits != null : !IUNITS_EDEFAULT.equals(iUnits);
			case TpcdsModelPackage.ITEM__ICONTAINER:
				return ICONTAINER_EDEFAULT == null ? iContainer != null : !ICONTAINER_EDEFAULT.equals(iContainer);
			case TpcdsModelPackage.ITEM__IMANAGER_ID:
				return IMANAGER_ID_EDEFAULT == null ? iManagerId != null : !IMANAGER_ID_EDEFAULT.equals(iManagerId);
			case TpcdsModelPackage.ITEM__IPRODUCT_NAME:
				return IPRODUCT_NAME_EDEFAULT == null ? iProductName != null : !IPRODUCT_NAME_EDEFAULT.equals(iProductName);
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
		result.append(" (iItemSk: ");
		result.append(iItemSk);
		result.append(", iItemId: ");
		result.append(iItemId);
		result.append(", iRecStartDate: ");
		result.append(iRecStartDate);
		result.append(", iRecEndDate: ");
		result.append(iRecEndDate);
		result.append(", iItemDesc: ");
		result.append(iItemDesc);
		result.append(", iCurrentPrice: ");
		result.append(iCurrentPrice);
		result.append(", iWholesaleCost: ");
		result.append(iWholesaleCost);
		result.append(", iBrandId: ");
		result.append(iBrandId);
		result.append(", iBrand: ");
		result.append(iBrand);
		result.append(", iClassId: ");
		result.append(iClassId);
		result.append(", iClass: ");
		result.append(iClass);
		result.append(", iCategoryId: ");
		result.append(iCategoryId);
		result.append(", iCategory: ");
		result.append(iCategory);
		result.append(", iManufactId: ");
		result.append(iManufactId);
		result.append(", iManufact: ");
		result.append(iManufact);
		result.append(", iSize: ");
		result.append(iSize);
		result.append(", iFormulation: ");
		result.append(iFormulation);
		result.append(", iColor: ");
		result.append(iColor);
		result.append(", iUnits: ");
		result.append(iUnits);
		result.append(", iContainer: ");
		result.append(iContainer);
		result.append(", iManagerId: ");
		result.append(iManagerId);
		result.append(", iProductName: ");
		result.append(iProductName);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
