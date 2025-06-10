/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getParentPresenceConditions <em>Parent Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject <em>Referred By Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics <em>Referred By Data Object For Derived Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute <em>Referred By Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute <em>Referred By Sub Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDescDoc <em>Refers To Desc Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToTitleDoc <em>Refers To Title Doc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition()
 * @model extendedMetaData="name='tPresenceCondition' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface PresenceCondition extends NsdObject {
    /**
     * Returns the value of the '<em><b>Argument</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Argument</em>' attribute.
     * @see #isSetArgument()
     * @see #unsetArgument()
     * @see #setArgument(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_Argument()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='argument'"
     * @generated
     */
    String getArgument();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Argument</em>' attribute.
     * @see #isSetArgument()
     * @see #unsetArgument()
     * @see #getArgument()
     * @generated
     */
    void setArgument( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArgument()
     * @see #getArgument()
     * @see #setArgument(String)
     * @generated
     */
    void unsetArgument();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Argument</em>' attribute is set.
     * @see #unsetArgument()
     * @see #getArgument()
     * @see #setArgument(String)
     * @generated
     */
    boolean isSetArgument();

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #getDescID()
     * @generated
     */
    void setDescID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Desc ID</em>' attribute is set.
     * @see #unsetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    boolean isSetDescID();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title ID</em>' attribute.
     * @see #isSetTitleID()
     * @see #unsetTitleID()
     * @see #setTitleID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_TitleID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='titleID'"
     * @generated
     */
    String getTitleID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title ID</em>' attribute.
     * @see #isSetTitleID()
     * @see #unsetTitleID()
     * @see #getTitleID()
     * @generated
     */
    void setTitleID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTitleID()
     * @see #getTitleID()
     * @see #setTitleID(String)
     * @generated
     */
    void unsetTitleID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Title ID</em>' attribute is set.
     * @see #unsetTitleID()
     * @see #getTitleID()
     * @see #setTitleID(String)
     * @generated
     */
    boolean isSetTitleID();

    /**
     * Returns the value of the '<em><b>Parent Presence Conditions</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Presence Conditions</em>' container reference.
     * @see #setParentPresenceConditions(PresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_ParentPresenceConditions()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition
     * @model opposite="presenceCondition" resolveProxies="false" unsettable="true"
     * @generated
     */
    PresenceConditions getParentPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getParentPresenceConditions <em>Parent Presence Conditions</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Presence Conditions</em>' container reference.
     * @see #getParentPresenceConditions()
     * @generated
     */
    void setParentPresenceConditions( PresenceConditions value );

    /**
     * Returns the value of the '<em><b>Referred By Data Object</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Data Object</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Data Object</em>' reference list.
     * @see #isSetReferredByDataObject()
     * @see #unsetReferredByDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_ReferredByDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition
     * @model opposite="refersToPresenceCondition" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DataObject > getReferredByDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject <em>Referred By Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDataObject()
     * @see #getReferredByDataObject()
     * @generated
     */
    void unsetReferredByDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject <em>Referred By Data Object</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Data Object</em>' reference list is set.
     * @see #unsetReferredByDataObject()
     * @see #getReferredByDataObject()
     * @generated
     */
    boolean isSetReferredByDataObject();

    /**
     * Returns the value of the '<em><b>Referred By Data Object For Derived Statistics</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Data Object For Derived Statistics</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Data Object For Derived Statistics</em>' reference list.
     * @see #isSetReferredByDataObjectForDerivedStatistics()
     * @see #unsetReferredByDataObjectForDerivedStatistics()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_ReferredByDataObjectForDerivedStatistics()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics
     * @model opposite="refersToPresenceConditionDerivedStatistics" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DataObject > getReferredByDataObjectForDerivedStatistics();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics <em>Referred By Data Object For Derived Statistics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDataObjectForDerivedStatistics()
     * @see #getReferredByDataObjectForDerivedStatistics()
     * @generated
     */
    void unsetReferredByDataObjectForDerivedStatistics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics <em>Referred By Data Object For Derived Statistics</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Data Object For Derived Statistics</em>' reference list is set.
     * @see #unsetReferredByDataObjectForDerivedStatistics()
     * @see #getReferredByDataObjectForDerivedStatistics()
     * @generated
     */
    boolean isSetReferredByDataObjectForDerivedStatistics();

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Object</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Object</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Object</em>' reference list.
     * @see #isSetReferredBySubDataObject()
     * @see #unsetReferredBySubDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_ReferredBySubDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition
     * @model opposite="refersToPresenceCondition" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataObject > getReferredBySubDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataObject()
     * @see #getReferredBySubDataObject()
     * @generated
     */
    void unsetReferredBySubDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Object</em>' reference list is set.
     * @see #unsetReferredBySubDataObject()
     * @see #getReferredBySubDataObject()
     * @generated
     */
    boolean isSetReferredBySubDataObject();

    /**
     * Returns the value of the '<em><b>Referred By Data Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Data Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Data Attribute</em>' reference list.
     * @see #isSetReferredByDataAttribute()
     * @see #unsetReferredByDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_ReferredByDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition
     * @model opposite="refersToPresenceCondition" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DataAttribute > getReferredByDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute <em>Referred By Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDataAttribute()
     * @see #getReferredByDataAttribute()
     * @generated
     */
    void unsetReferredByDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute <em>Referred By Data Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Data Attribute</em>' reference list is set.
     * @see #unsetReferredByDataAttribute()
     * @see #getReferredByDataAttribute()
     * @generated
     */
    boolean isSetReferredByDataAttribute();

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Attribute</em>' reference list.
     * @see #isSetReferredBySubDataAttribute()
     * @see #unsetReferredBySubDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_ReferredBySubDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition
     * @model opposite="refersToPresenceCondition" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataAttribute > getReferredBySubDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute <em>Referred By Sub Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataAttribute()
     * @see #getReferredBySubDataAttribute()
     * @generated
     */
    void unsetReferredBySubDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute <em>Referred By Sub Data Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Attribute</em>' reference list is set.
     * @see #unsetReferredBySubDataAttribute()
     * @see #getReferredBySubDataAttribute()
     * @generated
     */
    boolean isSetReferredBySubDataAttribute();

    /**
     * Returns the value of the '<em><b>Refers To Desc Doc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceConditionAsDesc <em>Referred By Presence Condition As Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Desc Doc</em>' reference.
     * @see #isSetRefersToDescDoc()
     * @see #unsetRefersToDescDoc()
     * @see #setRefersToDescDoc(Doc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_RefersToDescDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceConditionAsDesc
     * @model opposite="referredByPresenceConditionAsDesc" resolveProxies="false" unsettable="true" transient="true"
     * @generated
     */
    Doc getRefersToDescDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDescDoc <em>Refers To Desc Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Desc Doc</em>' reference.
     * @see #isSetRefersToDescDoc()
     * @see #unsetRefersToDescDoc()
     * @see #getRefersToDescDoc()
     * @generated
     */
    void setRefersToDescDoc( Doc value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDescDoc <em>Refers To Desc Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDescDoc()
     * @see #getRefersToDescDoc()
     * @see #setRefersToDescDoc(Doc)
     * @generated
     */
    void unsetRefersToDescDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDescDoc <em>Refers To Desc Doc</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Desc Doc</em>' reference is set.
     * @see #unsetRefersToDescDoc()
     * @see #getRefersToDescDoc()
     * @see #setRefersToDescDoc(Doc)
     * @generated
     */
    boolean isSetRefersToDescDoc();

    /**
     * Returns the value of the '<em><b>Refers To Title Doc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceConditionAsTitle <em>Referred By Presence Condition As Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Title Doc</em>' reference.
     * @see #isSetRefersToTitleDoc()
     * @see #unsetRefersToTitleDoc()
     * @see #setRefersToTitleDoc(Doc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_RefersToTitleDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceConditionAsTitle
     * @model opposite="referredByPresenceConditionAsTitle" resolveProxies="false" unsettable="true" transient="true"
     * @generated
     */
    Doc getRefersToTitleDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToTitleDoc <em>Refers To Title Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Title Doc</em>' reference.
     * @see #isSetRefersToTitleDoc()
     * @see #unsetRefersToTitleDoc()
     * @see #getRefersToTitleDoc()
     * @generated
     */
    void setRefersToTitleDoc( Doc value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToTitleDoc <em>Refers To Title Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToTitleDoc()
     * @see #getRefersToTitleDoc()
     * @see #setRefersToTitleDoc(Doc)
     * @generated
     */
    void unsetRefersToTitleDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToTitleDoc <em>Refers To Title Doc</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Title Doc</em>' reference is set.
     * @see #unsetRefersToTitleDoc()
     * @see #getRefersToTitleDoc()
     * @see #setRefersToTitleDoc(Doc)
     * @generated
     */
    boolean isSetRefersToTitleDoc();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // PresenceCondition
