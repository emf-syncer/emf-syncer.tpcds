/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.Reason#getRReasonSk <em>RReason Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Reason#getRReasonId <em>RReason Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.Reason#getRReasonDesc <em>RReason Desc</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getReason()
 * @model
 * @generated
 */
public interface Reason extends EObject {
	/**
	 * Returns the value of the '<em><b>RReason Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RReason Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RReason Sk</em>' attribute.
	 * @see #setRReasonSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getReason_RReasonSk()
	 * @model
	 * @generated
	 */
	Long getRReasonSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Reason#getRReasonSk <em>RReason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RReason Sk</em>' attribute.
	 * @see #getRReasonSk()
	 * @generated
	 */
	void setRReasonSk(Long value);

	/**
	 * Returns the value of the '<em><b>RReason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RReason Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RReason Id</em>' attribute.
	 * @see #setRReasonId(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getReason_RReasonId()
	 * @model
	 * @generated
	 */
	String getRReasonId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Reason#getRReasonId <em>RReason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RReason Id</em>' attribute.
	 * @see #getRReasonId()
	 * @generated
	 */
	void setRReasonId(String value);

	/**
	 * Returns the value of the '<em><b>RReason Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RReason Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RReason Desc</em>' attribute.
	 * @see #setRReasonDesc(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getReason_RReasonDesc()
	 * @model
	 * @generated
	 */
	String getRReasonDesc();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.Reason#getRReasonDesc <em>RReason Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RReason Desc</em>' attribute.
	 * @see #getRReasonDesc()
	 * @generated
	 */
	void setRReasonDesc(String value);

} // Reason
