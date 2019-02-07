/**
 *  Copyright (c) 2019 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getCDC <em>CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute()
 * @model extendedMetaData="name='tDataAttribute' kind='empty'"
 * @generated
 */
public interface DataAttribute
        extends DocumentedClass, AgPresenceCondition, AgArray, AgTrgOp, AgAttributeTypeAndValues {
    /**
     * Returns the value of the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fc</em>' attribute.
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #setFc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_Fc()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='fc'"
     * @generated
     */
    String getFc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fc</em>' attribute.
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #getFc()
     * @generated
     */
    void setFc( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFc()
     * @see #getFc()
     * @see #setFc(String)
     * @generated
     */
    void unsetFc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fc</em>' attribute is set.
     * @see #unsetFc()
     * @see #getFc()
     * @see #setFc(String)
     * @generated
     */
    boolean isSetFc();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>CDC</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CDC</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CDC</em>' container reference.
     * @see #setCDC(CDC)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_CDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute
     * @model opposite="dataAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    CDC getCDC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getCDC <em>CDC</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CDC</em>' container reference.
     * @see #getCDC()
     * @generated
     */
    void setCDC( CDC value );

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Object As Size Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Object As Size Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Object As Size Attribute</em>' reference list.
     * @see #isSetReferredBySubDataObjectAsSizeAttribute()
     * @see #unsetReferredBySubDataObjectAsSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_ReferredBySubDataObjectAsSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute
     * @model opposite="refersToSizeAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataObject > getReferredBySubDataObjectAsSizeAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataObjectAsSizeAttribute()
     * @see #getReferredBySubDataObjectAsSizeAttribute()
     * @generated
     */
    void unsetReferredBySubDataObjectAsSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Object As Size Attribute</em>' reference list is set.
     * @see #unsetReferredBySubDataObjectAsSizeAttribute()
     * @see #getReferredBySubDataObjectAsSizeAttribute()
     * @generated
     */
    boolean isSetReferredBySubDataObjectAsSizeAttribute();

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Object As Max Index Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Object As Max Index Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Object As Max Index Attribute</em>' reference list.
     * @see #isSetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #unsetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute
     * @model opposite="refersToMaxIndexAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataObject > getReferredBySubDataObjectAsMaxIndexAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #getReferredBySubDataObjectAsMaxIndexAttribute()
     * @generated
     */
    void unsetReferredBySubDataObjectAsMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Object As Max Index Attribute</em>' reference list is set.
     * @see #unsetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #getReferredBySubDataObjectAsMaxIndexAttribute()
     * @generated
     */
    boolean isSetReferredBySubDataObjectAsMaxIndexAttribute();

} // DataAttribute
