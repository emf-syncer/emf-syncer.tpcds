/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Household Demographics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.HouseholdDemographics#getHdDemoSk <em>Hd Demo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.HouseholdDemographics#getHdIncomeBandSk <em>Hd Income Band Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.HouseholdDemographics#getHdBuyPotential <em>Hd Buy Potential</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.HouseholdDemographics#getHdDepCount <em>Hd Dep Count</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.HouseholdDemographics#getHdVehicleCount <em>Hd Vehicle Count</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getHouseholdDemographics()
 * @model
 * @generated
 */
public interface HouseholdDemographics extends EObject {
	/**
	 * Returns the value of the '<em><b>Hd Demo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hd Demo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hd Demo Sk</em>' attribute.
	 * @see #setHdDemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getHouseholdDemographics_HdDemoSk()
	 * @model
	 * @generated
	 */
	Long getHdDemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdDemoSk <em>Hd Demo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hd Demo Sk</em>' attribute.
	 * @see #getHdDemoSk()
	 * @generated
	 */
	void setHdDemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Hd Income Band Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hd Income Band Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hd Income Band Sk</em>' attribute.
	 * @see #setHdIncomeBandSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getHouseholdDemographics_HdIncomeBandSk()
	 * @model
	 * @generated
	 */
	Long getHdIncomeBandSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdIncomeBandSk <em>Hd Income Band Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hd Income Band Sk</em>' attribute.
	 * @see #getHdIncomeBandSk()
	 * @generated
	 */
	void setHdIncomeBandSk(Long value);

	/**
	 * Returns the value of the '<em><b>Hd Buy Potential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hd Buy Potential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hd Buy Potential</em>' attribute.
	 * @see #setHdBuyPotential(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getHouseholdDemographics_HdBuyPotential()
	 * @model
	 * @generated
	 */
	String getHdBuyPotential();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdBuyPotential <em>Hd Buy Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hd Buy Potential</em>' attribute.
	 * @see #getHdBuyPotential()
	 * @generated
	 */
	void setHdBuyPotential(String value);

	/**
	 * Returns the value of the '<em><b>Hd Dep Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hd Dep Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hd Dep Count</em>' attribute.
	 * @see #setHdDepCount(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getHouseholdDemographics_HdDepCount()
	 * @model
	 * @generated
	 */
	Long getHdDepCount();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdDepCount <em>Hd Dep Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hd Dep Count</em>' attribute.
	 * @see #getHdDepCount()
	 * @generated
	 */
	void setHdDepCount(Long value);

	/**
	 * Returns the value of the '<em><b>Hd Vehicle Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hd Vehicle Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hd Vehicle Count</em>' attribute.
	 * @see #setHdVehicleCount(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getHouseholdDemographics_HdVehicleCount()
	 * @model
	 * @generated
	 */
	Long getHdVehicleCount();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.HouseholdDemographics#getHdVehicleCount <em>Hd Vehicle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hd Vehicle Count</em>' attribute.
	 * @see #getHdVehicleCount()
	 * @generated
	 */
	void setHdVehicleCount(Long value);

} // HouseholdDemographics
