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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute <em>Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getConstructedAttribute <em>Constructed Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute()
 * @model extendedMetaData="name='tSubDataAttribute' kind='empty'"
 * @generated
 */
public interface SubDataAttribute extends DocumentedClass {
    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #isSetDefaultValue()
     * @see #unsetDefaultValue()
     * @see #setDefaultValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_DefaultValue()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='defaultValue'"
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #isSetDefaultValue()
     * @see #unsetDefaultValue()
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDefaultValue()
     * @see #getDefaultValue()
     * @see #setDefaultValue(String)
     * @generated
     */
    void unsetDefaultValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue <em>Default Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Default Value</em>' attribute is set.
     * @see #unsetDefaultValue()
     * @see #getDefaultValue()
     * @see #setDefaultValue(String)
     * @generated
     */
    boolean isSetDefaultValue();

    /**
     * Returns the value of the '<em><b>Is Array</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Array</em>' attribute.
     * @see #isSetIsArray()
     * @see #unsetIsArray()
     * @see #setIsArray(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_IsArray()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isArray'"
     * @generated
     */
    boolean isIsArray();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#isIsArray <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Array</em>' attribute.
     * @see #isSetIsArray()
     * @see #unsetIsArray()
     * @see #isIsArray()
     * @generated
     */
    void setIsArray( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#isIsArray <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsArray()
     * @see #isIsArray()
     * @see #setIsArray(boolean)
     * @generated
     */
    void unsetIsArray();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#isIsArray <em>Is Array</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Array</em>' attribute is set.
     * @see #unsetIsArray()
     * @see #isIsArray()
     * @see #setIsArray(boolean)
     * @generated
     */
    boolean isSetIsArray();

    /**
     * Returns the value of the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Index Attribute</em>' attribute.
     * @see #isSetMaxIndexAttribute()
     * @see #unsetMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MaxIndexAttribute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='maxIndexAttribute'"
     * @generated
     */
    String getMaxIndexAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Index Attribute</em>' attribute.
     * @see #isSetMaxIndexAttribute()
     * @see #unsetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @generated
     */
    void setMaxIndexAttribute( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @generated
     */
    void unsetMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Index Attribute</em>' attribute is set.
     * @see #unsetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @generated
     */
    boolean isSetMaxIndexAttribute();

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #setMaxValue(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MaxValue()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='maxValue'"
     * @generated
     */
    BigDecimal getMaxValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(BigDecimal)
     * @generated
     */
    void unsetMaxValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue <em>Max Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Value</em>' attribute is set.
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(BigDecimal)
     * @generated
     */
    boolean isSetMaxValue();

    /**
     * Returns the value of the '<em><b>Min Index</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Index</em>' attribute.
     * @see #isSetMinIndex()
     * @see #unsetMinIndex()
     * @see #setMinIndex(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MinIndex()
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='minIndex'"
     * @generated
     */
    long getMinIndex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinIndex <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Index</em>' attribute.
     * @see #isSetMinIndex()
     * @see #unsetMinIndex()
     * @see #getMinIndex()
     * @generated
     */
    void setMinIndex( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinIndex <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinIndex()
     * @see #getMinIndex()
     * @see #setMinIndex(long)
     * @generated
     */
    void unsetMinIndex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinIndex <em>Min Index</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Index</em>' attribute is set.
     * @see #unsetMinIndex()
     * @see #getMinIndex()
     * @see #setMinIndex(long)
     * @generated
     */
    boolean isSetMinIndex();

    /**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #setMinValue(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MinValue()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='minValue'"
     * @generated
     */
    BigDecimal getMinValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @generated
     */
    void setMinValue( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(BigDecimal)
     * @generated
     */
    void unsetMinValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue <em>Min Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Value</em>' attribute is set.
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(BigDecimal)
     * @generated
     */
    boolean isSetMinValue();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pres Cond</b></em>' attribute.
     * The default value is <code>"M"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pres Cond</em>' attribute.
     * @see #isSetPresCond()
     * @see #unsetPresCond()
     * @see #setPresCond(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_PresCond()
     * @model default="M" unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCond'"
     * @generated
     */
    String getPresCond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCond <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond</em>' attribute.
     * @see #isSetPresCond()
     * @see #unsetPresCond()
     * @see #getPresCond()
     * @generated
     */
    void setPresCond( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCond <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCond()
     * @see #getPresCond()
     * @see #setPresCond(String)
     * @generated
     */
    void unsetPresCond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCond <em>Pres Cond</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pres Cond</em>' attribute is set.
     * @see #unsetPresCond()
     * @see #getPresCond()
     * @see #setPresCond(String)
     * @generated
     */
    boolean isSetPresCond();

    /**
     * Returns the value of the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pres Cond Args</em>' attribute.
     * @see #isSetPresCondArgs()
     * @see #unsetPresCondArgs()
     * @see #setPresCondArgs(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_PresCondArgs()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCondArgs'"
     * @generated
     */
    String getPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond Args</em>' attribute.
     * @see #isSetPresCondArgs()
     * @see #unsetPresCondArgs()
     * @see #getPresCondArgs()
     * @generated
     */
    void setPresCondArgs( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCondArgs()
     * @see #getPresCondArgs()
     * @see #setPresCondArgs(String)
     * @generated
     */
    void unsetPresCondArgs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pres Cond Args</em>' attribute is set.
     * @see #unsetPresCondArgs()
     * @see #getPresCondArgs()
     * @see #setPresCondArgs(String)
     * @generated
     */
    boolean isSetPresCondArgs();

    /**
     * Returns the value of the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pres Cond Args ID</em>' attribute.
     * @see #isSetPresCondArgsID()
     * @see #unsetPresCondArgsID()
     * @see #setPresCondArgsID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_PresCondArgsID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCondArgsID'"
     * @generated
     */
    String getPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond Args ID</em>' attribute.
     * @see #isSetPresCondArgsID()
     * @see #unsetPresCondArgsID()
     * @see #getPresCondArgsID()
     * @generated
     */
    void setPresCondArgsID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCondArgsID()
     * @see #getPresCondArgsID()
     * @see #setPresCondArgsID(String)
     * @generated
     */
    void unsetPresCondArgsID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pres Cond Args ID</em>' attribute is set.
     * @see #unsetPresCondArgsID()
     * @see #getPresCondArgsID()
     * @see #setPresCondArgsID(String)
     * @generated
     */
    boolean isSetPresCondArgsID();

    /**
     * Returns the value of the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Attribute</em>' attribute.
     * @see #isSetSizeAttribute()
     * @see #unsetSizeAttribute()
     * @see #setSizeAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_SizeAttribute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='sizeAttribute'"
     * @generated
     */
    String getSizeAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Attribute</em>' attribute.
     * @see #isSetSizeAttribute()
     * @see #unsetSizeAttribute()
     * @see #getSizeAttribute()
     * @generated
     */
    void setSizeAttribute( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSizeAttribute()
     * @see #getSizeAttribute()
     * @see #setSizeAttribute(String)
     * @generated
     */
    void unsetSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute <em>Size Attribute</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Size Attribute</em>' attribute is set.
     * @see #unsetSizeAttribute()
     * @see #getSizeAttribute()
     * @see #setSizeAttribute(String)
     * @generated
     */
    boolean isSetSizeAttribute();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Type Kind</b></em>' attribute.
     * The default value is <code>"BASIC"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Kind</em>' attribute.
     * @see #isSetTypeKind()
     * @see #unsetTypeKind()
     * @see #setTypeKind(Enumerator)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_TypeKind()
     * @model default="BASIC" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.AttributeTypeKind"
     *        extendedMetaData="kind='attribute' name='typeKind'"
     * @generated
     */
    Enumerator getTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getTypeKind <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Kind</em>' attribute.
     * @see #isSetTypeKind()
     * @see #unsetTypeKind()
     * @see #getTypeKind()
     * @generated
     */
    void setTypeKind( Enumerator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getTypeKind <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeKind()
     * @see #getTypeKind()
     * @see #setTypeKind(Enumerator)
     * @generated
     */
    void unsetTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getTypeKind <em>Type Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type Kind</em>' attribute is set.
     * @see #unsetTypeKind()
     * @see #getTypeKind()
     * @see #setTypeKind(Enumerator)
     * @generated
     */
    boolean isSetTypeKind();

    /**
     * Returns the value of the '<em><b>Constructed Attribute</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constructed Attribute</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constructed Attribute</em>' container reference.
     * @see #setConstructedAttribute(ConstructedAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_ConstructedAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute
     * @model opposite="subDataAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConstructedAttribute getConstructedAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getConstructedAttribute <em>Constructed Attribute</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constructed Attribute</em>' container reference.
     * @see #getConstructedAttribute()
     * @generated
     */
    void setConstructedAttribute( ConstructedAttribute value );

} // SubDataAttribute
