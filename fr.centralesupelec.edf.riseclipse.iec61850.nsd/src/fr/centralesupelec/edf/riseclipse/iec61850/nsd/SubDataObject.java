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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getSizeAttribute <em>Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getCDC <em>CDC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject()
 * @model extendedMetaData="name='tSubDataObject' kind='empty'"
 * @generated
 */
public interface SubDataObject extends DocumentedClass {
    /**
     * Returns the value of the '<em><b>Is Array</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Array</em>' attribute.
     * @see #isSetIsArray()
     * @see #unsetIsArray()
     * @see #setIsArray(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_IsArray()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isArray'"
     * @generated
     */
    boolean isIsArray();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#isIsArray <em>Is Array</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#isIsArray <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsArray()
     * @see #isIsArray()
     * @see #setIsArray(boolean)
     * @generated
     */
    void unsetIsArray();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#isIsArray <em>Is Array</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_MaxIndexAttribute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='maxIndexAttribute'"
     * @generated
     */
    String getMaxIndexAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxIndexAttribute()
     * @see #getMaxIndexAttribute()
     * @see #setMaxIndexAttribute(String)
     * @generated
     */
    void unsetMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMaxIndexAttribute <em>Max Index Attribute</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Min Index</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Index</em>' attribute.
     * @see #isSetMinIndex()
     * @see #unsetMinIndex()
     * @see #setMinIndex(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_MinIndex()
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='minIndex'"
     * @generated
     */
    long getMinIndex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMinIndex <em>Min Index</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMinIndex <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinIndex()
     * @see #getMinIndex()
     * @see #setMinIndex(long)
     * @generated
     */
    void unsetMinIndex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMinIndex <em>Min Index</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pres Cond</b></em>' attribute.
     * The default value is <code>"M"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pres Cond</em>' attribute.
     * @see #isSetPresCond()
     * @see #unsetPresCond()
     * @see #setPresCond(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_PresCond()
     * @model default="M" unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCond'"
     * @generated
     */
    String getPresCond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCond <em>Pres Cond</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCond <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCond()
     * @see #getPresCond()
     * @see #setPresCond(String)
     * @generated
     */
    void unsetPresCond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCond <em>Pres Cond</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_PresCondArgs()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCondArgs'"
     * @generated
     */
    String getPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCondArgs()
     * @see #getPresCondArgs()
     * @see #setPresCondArgs(String)
     * @generated
     */
    void unsetPresCondArgs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_PresCondArgsID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCondArgsID'"
     * @generated
     */
    String getPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCondArgsID()
     * @see #getPresCondArgsID()
     * @see #setPresCondArgsID(String)
     * @generated
     */
    void unsetPresCondArgsID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_SizeAttribute()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='sizeAttribute'"
     * @generated
     */
    String getSizeAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getSizeAttribute <em>Size Attribute</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getSizeAttribute <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSizeAttribute()
     * @see #getSizeAttribute()
     * @see #setSizeAttribute(String)
     * @generated
     */
    void unsetSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getSizeAttribute <em>Size Attribute</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Underlying Type</em>' attribute.
     * @see #isSetUnderlyingType()
     * @see #unsetUnderlyingType()
     * @see #setUnderlyingType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_UnderlyingType()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingType'"
     * @generated
     */
    String getUnderlyingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingType <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underlying Type</em>' attribute.
     * @see #isSetUnderlyingType()
     * @see #unsetUnderlyingType()
     * @see #getUnderlyingType()
     * @generated
     */
    void setUnderlyingType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingType <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingType()
     * @see #getUnderlyingType()
     * @see #setUnderlyingType(String)
     * @generated
     */
    void unsetUnderlyingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingType <em>Underlying Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Underlying Type</em>' attribute is set.
     * @see #unsetUnderlyingType()
     * @see #getUnderlyingType()
     * @see #setUnderlyingType(String)
     * @generated
     */
    boolean isSetUnderlyingType();

    /**
     * Returns the value of the '<em><b>Underlying Type Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Underlying Type Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see #isSetUnderlyingTypeKind()
     * @see #unsetUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataObject_UnderlyingTypeKind()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingTypeKind'"
     * @generated
     */
    DefinedAttributeTypeKind getUnderlyingTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underlying Type Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see #isSetUnderlyingTypeKind()
     * @see #unsetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @generated
     */
    void setUnderlyingTypeKind( DefinedAttributeTypeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @generated
     */
    void unsetUnderlyingTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Underlying Type Kind</em>' attribute is set.
     * @see #unsetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @generated
     */
    boolean isSetUnderlyingTypeKind();

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

} // SubDataObject
