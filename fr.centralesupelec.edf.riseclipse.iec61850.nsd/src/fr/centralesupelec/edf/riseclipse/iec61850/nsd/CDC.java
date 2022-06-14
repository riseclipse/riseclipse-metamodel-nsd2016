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
 * A representation of the model object '<em><b>CDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject <em>Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter <em>Service Parameter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized <em>Enum Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics <em>Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant <em>Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParentCDCs <em>Parent CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject <em>Referred By Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParameterizedDataAttribute <em>Parameterized Data Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC()
 * @model extendedMetaData="name='tCDC' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface CDC extends TitledClass {
    /**
     * Returns the value of the '<em><b>Sub Data Object</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getParentCDC <em>Parent CDC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Data Object</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Data Object</em>' containment reference list.
     * @see #isSetSubDataObject()
     * @see #unsetSubDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_SubDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getParentCDC
     * @model opposite="parentCDC" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SubDataObject' namespace='##targetNamespace'"
     * @generated
     */
    EList< SubDataObject > getSubDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject <em>Sub Data Object</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubDataObject()
     * @see #getSubDataObject()
     * @generated
     */
    void unsetSubDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject <em>Sub Data Object</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Data Object</em>' containment reference list is set.
     * @see #unsetSubDataObject()
     * @see #getSubDataObject()
     * @generated
     */
    boolean isSetSubDataObject();

    /**
     * Returns the value of the '<em><b>Data Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getParentCDC <em>Parent CDC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Attribute</em>' containment reference list.
     * @see #isSetDataAttribute()
     * @see #unsetDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_DataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getParentCDC
     * @model opposite="parentCDC" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='DataAttribute' namespace='##targetNamespace'"
     * @generated
     */
    EList< DataAttribute > getDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDataAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    void unsetDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Attribute</em>' containment reference list is set.
     * @see #unsetDataAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    boolean isSetDataAttribute();

    /**
     * Returns the value of the '<em><b>Service Parameter</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getParentCDC <em>Parent CDC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Parameter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Parameter</em>' containment reference.
     * @see #isSetServiceParameter()
     * @see #unsetServiceParameter()
     * @see #setServiceParameter(ServiceParameter)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_ServiceParameter()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getParentCDC
     * @model opposite="parentCDC" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceParameter' namespace='##targetNamespace'"
     * @generated
     */
    ServiceParameter getServiceParameter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter <em>Service Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Parameter</em>' containment reference.
     * @see #isSetServiceParameter()
     * @see #unsetServiceParameter()
     * @see #getServiceParameter()
     * @generated
     */
    void setServiceParameter( ServiceParameter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter <em>Service Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceParameter()
     * @see #getServiceParameter()
     * @see #setServiceParameter(ServiceParameter)
     * @generated
     */
    void unsetServiceParameter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter <em>Service Parameter</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Parameter</em>' containment reference is set.
     * @see #unsetServiceParameter()
     * @see #getServiceParameter()
     * @see #setServiceParameter(ServiceParameter)
     * @generated
     */
    boolean isSetServiceParameter();

    /**
     * Returns the value of the '<em><b>Enum Parameterized</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enum Parameterized</em>' attribute.
     * @see #isSetEnumParameterized()
     * @see #unsetEnumParameterized()
     * @see #setEnumParameterized(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_EnumParameterized()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='enumParameterized'"
     * @generated
     */
    boolean isEnumParameterized();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized <em>Enum Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enum Parameterized</em>' attribute.
     * @see #isSetEnumParameterized()
     * @see #unsetEnumParameterized()
     * @see #isEnumParameterized()
     * @generated
     */
    void setEnumParameterized( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized <em>Enum Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnumParameterized()
     * @see #isEnumParameterized()
     * @see #setEnumParameterized(boolean)
     * @generated
     */
    void unsetEnumParameterized();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized <em>Enum Parameterized</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enum Parameterized</em>' attribute is set.
     * @see #unsetEnumParameterized()
     * @see #isEnumParameterized()
     * @see #setEnumParameterized(boolean)
     * @generated
     */
    boolean isSetEnumParameterized();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Statistics</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statistics</em>' attribute.
     * @see #isSetStatistics()
     * @see #unsetStatistics()
     * @see #setStatistics(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_Statistics()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='statistics'"
     * @generated
     */
    boolean isStatistics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics <em>Statistics</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statistics</em>' attribute.
     * @see #isSetStatistics()
     * @see #unsetStatistics()
     * @see #isStatistics()
     * @generated
     */
    void setStatistics( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics <em>Statistics</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatistics()
     * @see #isStatistics()
     * @see #setStatistics(boolean)
     * @generated
     */
    void unsetStatistics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics <em>Statistics</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Statistics</em>' attribute is set.
     * @see #unsetStatistics()
     * @see #isStatistics()
     * @see #setStatistics(boolean)
     * @generated
     */
    boolean isSetStatistics();

    /**
     * Returns the value of the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Kind Parameterized</em>' attribute.
     * @see #isSetTypeKindParameterized()
     * @see #unsetTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_TypeKindParameterized()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='typeKindParameterized'"
     * @generated
     */
    boolean isTypeKindParameterized();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Kind Parameterized</em>' attribute.
     * @see #isSetTypeKindParameterized()
     * @see #unsetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @generated
     */
    void setTypeKindParameterized( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @generated
     */
    void unsetTypeKindParameterized();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type Kind Parameterized</em>' attribute is set.
     * @see #unsetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @generated
     */
    boolean isSetTypeKindParameterized();

    /**
     * Returns the value of the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variant</em>' attribute.
     * @see #isSetVariant()
     * @see #unsetVariant()
     * @see #setVariant(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_Variant()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Token"
     *        extendedMetaData="kind='attribute' name='variant'"
     * @generated
     */
    String getVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variant</em>' attribute.
     * @see #isSetVariant()
     * @see #unsetVariant()
     * @see #getVariant()
     * @generated
     */
    void setVariant( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariant()
     * @see #getVariant()
     * @see #setVariant(String)
     * @generated
     */
    void unsetVariant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant <em>Variant</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variant</em>' attribute is set.
     * @see #unsetVariant()
     * @see #getVariant()
     * @see #setVariant(String)
     * @generated
     */
    boolean isSetVariant();

    /**
     * Returns the value of the '<em><b>Parent CD Cs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent CD Cs</em>' container reference.
     * @see #setParentCDCs(CDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_ParentCDCs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC
     * @model opposite="cDC" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    CDCs getParentCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParentCDCs <em>Parent CD Cs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent CD Cs</em>' container reference.
     * @see #getParentCDCs()
     * @generated
     */
    void setParentCDCs( CDCs value );

    /**
     * Returns the value of the '<em><b>Referred By Data Object</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC <em>Refers To CDC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Data Object</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Data Object</em>' reference list.
     * @see #isSetReferredByDataObject()
     * @see #unsetReferredByDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_ReferredByDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC
     * @model opposite="refersToCDC" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DataObject > getReferredByDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject <em>Referred By Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDataObject()
     * @see #getReferredByDataObject()
     * @generated
     */
    void unsetReferredByDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject <em>Referred By Data Object</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Data Object</em>' reference list is set.
     * @see #unsetReferredByDataObject()
     * @see #getReferredByDataObject()
     * @generated
     */
    boolean isSetReferredByDataObject();

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Object</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC <em>Refers To CDC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Object</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Object</em>' reference list.
     * @see #isSetReferredBySubDataObject()
     * @see #unsetReferredBySubDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_ReferredBySubDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC
     * @model opposite="refersToCDC" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataObject > getReferredBySubDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataObject()
     * @see #getReferredBySubDataObject()
     * @generated
     */
    void unsetReferredBySubDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Object</em>' reference list is set.
     * @see #unsetReferredBySubDataObject()
     * @see #getReferredBySubDataObject()
     * @generated
     */
    boolean isSetReferredBySubDataObject();

    /**
     * Returns the value of the '<em><b>Parameterized Data Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameterized Data Attribute</em>' reference.
     * @see #isSetParameterizedDataAttribute()
     * @see #unsetParameterizedDataAttribute()
     * @see #setParameterizedDataAttribute(DataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDC_ParameterizedDataAttribute()
     * @model resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataAttribute getParameterizedDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParameterizedDataAttribute <em>Parameterized Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameterized Data Attribute</em>' reference.
     * @see #isSetParameterizedDataAttribute()
     * @see #unsetParameterizedDataAttribute()
     * @see #getParameterizedDataAttribute()
     * @generated
     */
    void setParameterizedDataAttribute( DataAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParameterizedDataAttribute <em>Parameterized Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetParameterizedDataAttribute()
     * @see #getParameterizedDataAttribute()
     * @see #setParameterizedDataAttribute(DataAttribute)
     * @generated
     */
    void unsetParameterizedDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParameterizedDataAttribute <em>Parameterized Data Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Parameterized Data Attribute</em>' reference is set.
     * @see #unsetParameterizedDataAttribute()
     * @see #getParameterizedDataAttribute()
     * @see #setParameterizedDataAttribute(DataAttribute)
     * @generated
     */
    boolean isSetParameterizedDataAttribute();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.\',\n\tstatus : Boolean = \n\t\t\tlet names : Bag(String) = self.subDataObject.name-&gt;union(self.dataAttribute.name) in names-&gt;size() = names-&gt;asSet()-&gt;size()\n}.status'"
     * @generated
     */
    boolean uniqueCDCChild( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // CDC
