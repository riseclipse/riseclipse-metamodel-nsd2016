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
 * <!-- begin-model-doc -->
 * Definition of a Sub Data Attribute (within a constructed data attribute).
 * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Default value for the data attribute. May only be defined for data attributes with typeKind="BASIC" or "ENUMERATED".
     * <!-- end-model-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_DefaultValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='defaultValue'"
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue( String value );

    /**
     * Returns the value of the '<em><b>Is Array</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flag indicating whether the element is an array. By default, not an array.
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Name of the Attribute holding the maximal index of the array.
     * Is relevant information if and only if isArray=true. One and only one of sizeAttribute and maxIndexAttribute shall be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Index Attribute</em>' attribute.
     * @see #setMaxIndexAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MaxIndexAttribute()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.AttributeName"
     *        extendedMetaData="kind='attribute' name='maxIndexAttribute'"
     * @generated
     */
    String getMaxIndexAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Index Attribute</em>' attribute.
     * @see #getMaxIndexAttribute()
     * @generated
     */
    void setMaxIndexAttribute( String value );

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Allowed maximal value (inclusive) for the data attribute. If not provided the minimal value according to the type is allowed. May only be defined for data attributes with typeKind="BASIC" and corresponding to a number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #setMaxValue(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MaxValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='maxValue'"
     * @generated
     */
    BigDecimal getMaxValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue( BigDecimal value );

    /**
     * Returns the value of the '<em><b>Min Index</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lowest index of the array.
     * Is relevant information if and only if isArray=true.
     * By default 0.
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Allowed minimal value (inclusive) for the data attribute. If not provided the minimal value according to the type is allowed. May only be defined for data attributes with typeKind="BASIC" and corresponding to a number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #setMinValue(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_MinValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='minValue'"
     * @generated
     */
    BigDecimal getMinValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #getMinValue()
     * @generated
     */
    void setMinValue( BigDecimal value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the data attribute.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_Name()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.AttributeName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Pres Cond</b></em>' attribute.
     * The default value is <code>"M"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Presence condition of the element. By default 'M' (mandatory).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pres Cond</em>' attribute.
     * @see #isSetPresCond()
     * @see #unsetPresCond()
     * @see #setPresCond(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_PresCond()
     * @model default="M" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditionName"
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
     * <!-- begin-model-doc -->
     * Optional argument to the presence condition. Can be a sibling element or a group number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pres Cond Args</em>' attribute.
     * @see #setPresCondArgs(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_PresCondArgs()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditionArgument"
     *        extendedMetaData="kind='attribute' name='presCondArgs'"
     * @generated
     */
    String getPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond Args</em>' attribute.
     * @see #getPresCondArgs()
     * @generated
     */
    void setPresCondArgs( String value );

    /**
     * Returns the value of the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Optional argument to the presence condition: a documentation identifier referring to some free text.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pres Cond Args ID</em>' attribute.
     * @see #setPresCondArgsID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_PresCondArgsID()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocID"
     *        extendedMetaData="kind='attribute' name='presCondArgsID'"
     * @generated
     */
    String getPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond Args ID</em>' attribute.
     * @see #getPresCondArgsID()
     * @generated
     */
    void setPresCondArgsID( String value );

    /**
     * Returns the value of the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sibling data attribute name holding the size of the array.
     * Is relevant information if and only if isArray=true. One and only one of sizeAttribute and maxIndexAttribute shall be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Size Attribute</em>' attribute.
     * @see #setSizeAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_SizeAttribute()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.AttributeName"
     *        extendedMetaData="kind='attribute' name='sizeAttribute'"
     * @generated
     */
    String getSizeAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Attribute</em>' attribute.
     * @see #getSizeAttribute()
     * @generated
     */
    void setSizeAttribute( String value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute, e.g., the name of a basic type like INT32, the name of an enumeration of a constructed data attribute - depending on the sibling typeKind. If not provided, shall be defined by the "parent" element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_Type()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.Iec61850Name"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Returns the value of the '<em><b>Type Kind</b></em>' attribute.
     * The default value is <code>"BASIC"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The kind of the data attribute's type. By  default, "BASIC".
     * <!-- end-model-doc -->
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

} // SubDataAttribute
