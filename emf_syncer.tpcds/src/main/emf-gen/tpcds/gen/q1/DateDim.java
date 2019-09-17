/**
 */
package tpcds.gen.q1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Dim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.gen.q1.DateDim#getDDateSk <em>DDate Sk</em>}</li>
 *   <li>{@link tpcds.gen.q1.DateDim#getDDateId <em>DDate Id</em>}</li>
 *   <li>{@link tpcds.gen.q1.DateDim#getDYear <em>DYear</em>}</li>
 * </ul>
 *
 * @see tpcds.gen.q1.Q1Package#getDateDim()
 * @model
 * @generated
 */
public interface DateDim extends EObject {
	/**
	 * Returns the value of the '<em><b>DDate Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDate Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDate Sk</em>' attribute.
	 * @see #isSetDDateSk()
	 * @see #unsetDDateSk()
	 * @see #setDDateSk(Long)
	 * @see tpcds.gen.q1.Q1Package#getDateDim_DDateSk()
	 * @model unsettable="true"
	 * @generated
	 */
	Long getDDateSk();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.DateDim#getDDateSk <em>DDate Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDate Sk</em>' attribute.
	 * @see #isSetDDateSk()
	 * @see #unsetDDateSk()
	 * @see #getDDateSk()
	 * @generated
	 */
	void setDDateSk(Long value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.DateDim#getDDateSk <em>DDate Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDDateSk()
	 * @see #getDDateSk()
	 * @see #setDDateSk(Long)
	 * @generated
	 */
	void unsetDDateSk();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.DateDim#getDDateSk <em>DDate Sk</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DDate Sk</em>' attribute is set.
	 * @see #unsetDDateSk()
	 * @see #getDDateSk()
	 * @see #setDDateSk(Long)
	 * @generated
	 */
	boolean isSetDDateSk();

	/**
	 * Returns the value of the '<em><b>DDate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDate Id</em>' attribute.
	 * @see #isSetDDateId()
	 * @see #unsetDDateId()
	 * @see #setDDateId(String)
	 * @see tpcds.gen.q1.Q1Package#getDateDim_DDateId()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDDateId();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.DateDim#getDDateId <em>DDate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDate Id</em>' attribute.
	 * @see #isSetDDateId()
	 * @see #unsetDDateId()
	 * @see #getDDateId()
	 * @generated
	 */
	void setDDateId(String value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.DateDim#getDDateId <em>DDate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDDateId()
	 * @see #getDDateId()
	 * @see #setDDateId(String)
	 * @generated
	 */
	void unsetDDateId();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.DateDim#getDDateId <em>DDate Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DDate Id</em>' attribute is set.
	 * @see #unsetDDateId()
	 * @see #getDDateId()
	 * @see #setDDateId(String)
	 * @generated
	 */
	boolean isSetDDateId();

	/**
	 * Returns the value of the '<em><b>DYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DYear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DYear</em>' attribute.
	 * @see #isSetDYear()
	 * @see #unsetDYear()
	 * @see #setDYear(Long)
	 * @see tpcds.gen.q1.Q1Package#getDateDim_DYear()
	 * @model unsettable="true"
	 * @generated
	 */
	Long getDYear();

	/**
	 * Sets the value of the '{@link tpcds.gen.q1.DateDim#getDYear <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DYear</em>' attribute.
	 * @see #isSetDYear()
	 * @see #unsetDYear()
	 * @see #getDYear()
	 * @generated
	 */
	void setDYear(Long value);

	/**
	 * Unsets the value of the '{@link tpcds.gen.q1.DateDim#getDYear <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDYear()
	 * @see #getDYear()
	 * @see #setDYear(Long)
	 * @generated
	 */
	void unsetDYear();

	/**
	 * Returns whether the value of the '{@link tpcds.gen.q1.DateDim#getDYear <em>DYear</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DYear</em>' attribute is set.
	 * @see #unsetDYear()
	 * @see #getDYear()
	 * @see #setDYear(Long)
	 * @generated
	 */
	boolean isSetDYear();

} // DateDim
