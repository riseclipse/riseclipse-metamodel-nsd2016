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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getCDC <em>CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC <em>Refers To CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject()
 * @model extendedMetaData="name='tSubDataObject' kind='empty'"
 * @generated
 */
public interface SubDataObject extends DocumentedClass, AgPresenceCondition, AgArray, AgUnderlyingType {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>CDC</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CDC</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CDC</em>' container reference.
     * @see #setCDC(CDC)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_CDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject
     * @model opposite="subDataObject" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    CDC getCDC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getCDC <em>CDC</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CDC</em>' container reference.
     * @see #getCDC()
     * @generated
     */
    void setCDC( CDC value );

    /**
     * Returns the value of the '<em><b>Refers To CDC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To CDC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To CDC</em>' reference.
     * @see #isSetRefersToCDC()
     * @see #unsetRefersToCDC()
     * @see #setRefersToCDC(CDC)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_RefersToCDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject
     * @model opposite="referredBySubDataObject" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    CDC getRefersToCDC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC <em>Refers To CDC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To CDC</em>' reference.
     * @see #isSetRefersToCDC()
     * @see #unsetRefersToCDC()
     * @see #getRefersToCDC()
     * @generated
     */
    void setRefersToCDC( CDC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC <em>Refers To CDC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToCDC()
     * @see #getRefersToCDC()
     * @see #setRefersToCDC(CDC)
     * @generated
     */
    void unsetRefersToCDC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC <em>Refers To CDC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To CDC</em>' reference is set.
     * @see #unsetRefersToCDC()
     * @see #getRefersToCDC()
     * @see #setRefersToCDC(CDC)
     * @generated
     */
    boolean isSetRefersToCDC();

    /**
     * Returns the value of the '<em><b>Refers To Presence Condition</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Presence Condition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Presence Condition</em>' reference.
     * @see #isSetRefersToPresenceCondition()
     * @see #unsetRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_RefersToPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject
     * @model opposite="referredBySubDataObject" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    PresenceCondition getRefersToPresenceCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Presence Condition</em>' reference.
     * @see #isSetRefersToPresenceCondition()
     * @see #unsetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @generated
     */
    void setRefersToPresenceCondition( PresenceCondition value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    void unsetRefersToPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Presence Condition</em>' reference is set.
     * @see #unsetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    boolean isSetRefersToPresenceCondition();

    /**
     * Returns the value of the '<em><b>Refers To Size Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Size Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Size Attribute</em>' reference.
     * @see #isSetRefersToSizeAttribute()
     * @see #unsetRefersToSizeAttribute()
     * @see #setRefersToSizeAttribute(DataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_RefersToSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute
     * @model opposite="referredBySubDataObjectAsSizeAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataAttribute getRefersToSizeAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Size Attribute</em>' reference.
     * @see #isSetRefersToSizeAttribute()
     * @see #unsetRefersToSizeAttribute()
     * @see #getRefersToSizeAttribute()
     * @generated
     */
    void setRefersToSizeAttribute( DataAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSizeAttribute()
     * @see #getRefersToSizeAttribute()
     * @see #setRefersToSizeAttribute(DataAttribute)
     * @generated
     */
    void unsetRefersToSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Size Attribute</em>' reference is set.
     * @see #unsetRefersToSizeAttribute()
     * @see #getRefersToSizeAttribute()
     * @see #setRefersToSizeAttribute(DataAttribute)
     * @generated
     */
    boolean isSetRefersToSizeAttribute();

    /**
     * Returns the value of the '<em><b>Refers To Max Index Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Max Index Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Max Index Attribute</em>' reference.
     * @see #isSetRefersToMaxIndexAttribute()
     * @see #unsetRefersToMaxIndexAttribute()
     * @see #setRefersToMaxIndexAttribute(DataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_RefersToMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute
     * @model opposite="referredBySubDataObjectAsMaxIndexAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataAttribute getRefersToMaxIndexAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Max Index Attribute</em>' reference.
     * @see #isSetRefersToMaxIndexAttribute()
     * @see #unsetRefersToMaxIndexAttribute()
     * @see #getRefersToMaxIndexAttribute()
     * @generated
     */
    void setRefersToMaxIndexAttribute( DataAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToMaxIndexAttribute()
     * @see #getRefersToMaxIndexAttribute()
     * @see #setRefersToMaxIndexAttribute(DataAttribute)
     * @generated
     */
    void unsetRefersToMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Max Index Attribute</em>' reference is set.
     * @see #unsetRefersToMaxIndexAttribute()
     * @see #getRefersToMaxIndexAttribute()
     * @see #setRefersToMaxIndexAttribute(DataAttribute)
     * @generated
     */
    boolean isSetRefersToMaxIndexAttribute();

} // SubDataObject
