/**
 */
package tpcds.tpcdsModel;

import java.sql.Date;
import java.sql.Time;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dbgen Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.DbgenVersion#getDvVersion <em>Dv Version</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DbgenVersion#getDvCreateDate <em>Dv Create Date</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DbgenVersion#getDvCreateTime <em>Dv Create Time</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.DbgenVersion#getDvCmdlineArgs <em>Dv Cmdline Args</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDbgenVersion()
 * @model
 * @generated
 */
public interface DbgenVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Dv Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dv Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dv Version</em>' attribute.
	 * @see #setDvVersion(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDbgenVersion_DvVersion()
	 * @model
	 * @generated
	 */
	String getDvVersion();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DbgenVersion#getDvVersion <em>Dv Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dv Version</em>' attribute.
	 * @see #getDvVersion()
	 * @generated
	 */
	void setDvVersion(String value);

	/**
	 * Returns the value of the '<em><b>Dv Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dv Create Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dv Create Date</em>' attribute.
	 * @see #setDvCreateDate(Date)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDbgenVersion_DvCreateDate()
	 * @model dataType="tpcds.tpcdsModel.Date"
	 * @generated
	 */
	Date getDvCreateDate();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DbgenVersion#getDvCreateDate <em>Dv Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dv Create Date</em>' attribute.
	 * @see #getDvCreateDate()
	 * @generated
	 */
	void setDvCreateDate(Date value);

	/**
	 * Returns the value of the '<em><b>Dv Create Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dv Create Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dv Create Time</em>' attribute.
	 * @see #setDvCreateTime(Time)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDbgenVersion_DvCreateTime()
	 * @model dataType="tpcds.tpcdsModel.Time"
	 * @generated
	 */
	Time getDvCreateTime();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DbgenVersion#getDvCreateTime <em>Dv Create Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dv Create Time</em>' attribute.
	 * @see #getDvCreateTime()
	 * @generated
	 */
	void setDvCreateTime(Time value);

	/**
	 * Returns the value of the '<em><b>Dv Cmdline Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dv Cmdline Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dv Cmdline Args</em>' attribute.
	 * @see #setDvCmdlineArgs(String)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getDbgenVersion_DvCmdlineArgs()
	 * @model
	 * @generated
	 */
	String getDvCmdlineArgs();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.DbgenVersion#getDvCmdlineArgs <em>Dv Cmdline Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dv Cmdline Args</em>' attribute.
	 * @see #getDvCmdlineArgs()
	 * @generated
	 */
	void setDvCmdlineArgs(String value);

} // DbgenVersion
