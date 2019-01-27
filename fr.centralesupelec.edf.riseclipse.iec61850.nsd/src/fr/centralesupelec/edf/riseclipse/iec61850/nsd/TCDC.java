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
 * A representation of the model object '<em><b>TCDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a Common Data Class (CDC). It is always non-abstract.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getSubDataObject <em>Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getDataAttribute <em>Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getServiceParameter <em>Service Parameter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isEnumParameterized <em>Enum Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isStatistics <em>Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC()
 * @model extendedMetaData="name='tCDC' kind='elementOnly'"
 * @generated
 */
public interface TCDC extends TTitledClass {
    /**
     * Returns the value of the '<em><b>Sub Data Object</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Data Object</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Data Object</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_SubDataObject()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SubDataObject' namespace='##targetNamespace'"
     * @generated
     */
    EList< TSubDataObject > getSubDataObject();

    /**
     * Returns the value of the '<em><b>Data Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Attribute</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_DataAttribute()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='DataAttribute' namespace='##targetNamespace'"
     * @generated
     */
    EList< TDataAttribute > getDataAttribute();

    /**
     * Returns the value of the '<em><b>Service Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Parameter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Parameter</em>' containment reference.
     * @see #setServiceParameter(TServiceParameter)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_ServiceParameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ServiceParameter' namespace='##targetNamespace'"
     * @generated
     */
    TServiceParameter getServiceParameter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getServiceParameter <em>Service Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Parameter</em>' containment reference.
     * @see #getServiceParameter()
     * @generated
     */
    void setServiceParameter( TServiceParameter value );

    /**
     * Returns the value of the '<em><b>Enum Parameterized</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flag indicating whether this CDC has at least one child data attribute of typeKind ENUMERATION but its exact enumeration type is left open.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enum Parameterized</em>' attribute.
     * @see #isSetEnumParameterized()
     * @see #unsetEnumParameterized()
     * @see #setEnumParameterized(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_EnumParameterized()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='enumParameterized'"
     * @generated
     */
    boolean isEnumParameterized();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isEnumParameterized <em>Enum Parameterized</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isEnumParameterized <em>Enum Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnumParameterized()
     * @see #isEnumParameterized()
     * @see #setEnumParameterized(boolean)
     * @generated
     */
    void unsetEnumParameterized();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isEnumParameterized <em>Enum Parameterized</em>}' attribute is set.
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
     * <!-- begin-model-doc -->
     * Name of the common data class.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_Name()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Statistics</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flag indicating whether DataObject of this CDC can be used for statistics.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Statistics</em>' attribute.
     * @see #isSetStatistics()
     * @see #unsetStatistics()
     * @see #setStatistics(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_Statistics()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='statistics'"
     * @generated
     */
    boolean isStatistics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isStatistics <em>Statistics</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isStatistics <em>Statistics</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatistics()
     * @see #isStatistics()
     * @see #setStatistics(boolean)
     * @generated
     */
    void unsetStatistics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isStatistics <em>Statistics</em>}' attribute is set.
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
     * <!-- begin-model-doc -->
     * Flag indicating whether this CDC has at least one child data attribute with typeKind "undefined".
     * Cannot be set to true at the same time as sibling attribute enumParameterized.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type Kind Parameterized</em>' attribute.
     * @see #isSetTypeKindParameterized()
     * @see #unsetTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_TypeKindParameterized()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='typeKindParameterized'"
     * @generated
     */
    boolean isTypeKindParameterized();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @generated
     */
    void unsetTypeKindParameterized();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute is set.
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
     * <!-- begin-model-doc -->
     * Identification of the variant of the CDC (e.g., SPG_SP).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variant</em>' attribute.
     * @see #setVariant(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCDC_Variant()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
     *        extendedMetaData="kind='attribute' name='variant'"
     * @generated
     */
    String getVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getVariant <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variant</em>' attribute.
     * @see #getVariant()
     * @generated
     */
    void setVariant( String value );

} // TCDC
