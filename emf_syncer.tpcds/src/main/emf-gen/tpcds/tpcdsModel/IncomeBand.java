/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income Band</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.IncomeBand#getIbIncomeBandSk <em>Ib Income Band Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.IncomeBand#getIbLowerBound <em>Ib Lower Bound</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.IncomeBand#getIbUpperBound <em>Ib Upper Bound</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getIncomeBand()
 * @model
 * @generated
 */
public interface IncomeBand extends EObject {
	/**
	 * Returns the value of the '<em><b>Ib Income Band Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ib Income Band Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ib Income Band Sk</em>' attribute.
	 * @see #setIbIncomeBandSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getIncomeBand_IbIncomeBandSk()
	 * @model
	 * @generated
	 */
	Long getIbIncomeBandSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.IncomeBand#getIbIncomeBandSk <em>Ib Income Band Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ib Income Band Sk</em>' attribute.
	 * @see #getIbIncomeBandSk()
	 * @generated
	 */
	void setIbIncomeBandSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ib Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ib Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ib Lower Bound</em>' attribute.
	 * @see #setIbLowerBound(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getIncomeBand_IbLowerBound()
	 * @model
	 * @generated
	 */
	Long getIbLowerBound();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.IncomeBand#getIbLowerBound <em>Ib Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ib Lower Bound</em>' attribute.
	 * @see #getIbLowerBound()
	 * @generated
	 */
	void setIbLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Ib Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ib Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ib Upper Bound</em>' attribute.
	 * @see #setIbUpperBound(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getIncomeBand_IbUpperBound()
	 * @model
	 * @generated
	 */
	Long getIbUpperBound();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.IncomeBand#getIbUpperBound <em>Ib Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ib Upper Bound</em>' attribute.
	 * @see #getIbUpperBound()
	 * @generated
	 */
	void setIbUpperBound(Long value);

} // IncomeBand
