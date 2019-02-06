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
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCond <em>Ds Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getAnyLNClass <em>Any LN Class</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject()
 * @model extendedMetaData="name='tDataObject' kind='empty'"
 * @generated
 */
public interface DataObject extends DocumentedClass {
    /**
     * Returns the value of the '<em><b>Ds Pres Cond</b></em>' attribute.
     * The default value is <code>"M"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ds Pres Cond</em>' attribute.
     * @see #isSetDsPresCond()
     * @see #unsetDsPresCond()
     * @see #setDsPresCond(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_DsPresCond()
     * @model default="M" unsettable="true"
     *        extendedMetaData="kind='attribute' name='dsPresCond'"
     * @generated
     */
    String getDsPresCond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCond <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ds Pres Cond</em>' attribute.
     * @see #isSetDsPresCond()
     * @see #unsetDsPresCond()
     * @see #getDsPresCond()
     * @generated
     */
    void setDsPresCond( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCond <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDsPresCond()
     * @see #getDsPresCond()
     * @see #setDsPresCond(String)
     * @generated
     */
    void unsetDsPresCond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCond <em>Ds Pres Cond</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ds Pres Cond</em>' attribute is set.
     * @see #unsetDsPresCond()
     * @see #getDsPresCond()
     * @see #setDsPresCond(String)
     * @generated
     */
    boolean isSetDsPresCond();

    /**
     * Returns the value of the '<em><b>Ds Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ds Pres Cond Args</em>' attribute.
     * @see #isSetDsPresCondArgs()
     * @see #unsetDsPresCondArgs()
     * @see #setDsPresCondArgs(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_DsPresCondArgs()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='dsPresCondArgs'"
     * @generated
     */
    String getDsPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ds Pres Cond Args</em>' attribute.
     * @see #isSetDsPresCondArgs()
     * @see #unsetDsPresCondArgs()
     * @see #getDsPresCondArgs()
     * @generated
     */
    void setDsPresCondArgs( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDsPresCondArgs()
     * @see #getDsPresCondArgs()
     * @see #setDsPresCondArgs(String)
     * @generated
     */
    void unsetDsPresCondArgs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ds Pres Cond Args</em>' attribute is set.
     * @see #unsetDsPresCondArgs()
     * @see #getDsPresCondArgs()
     * @see #setDsPresCondArgs(String)
     * @generated
     */
    boolean isSetDsPresCondArgs();

    /**
     * Returns the value of the '<em><b>Ds Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ds Pres Cond Args ID</em>' attribute.
     * @see #isSetDsPresCondArgsID()
     * @see #unsetDsPresCondArgsID()
     * @see #setDsPresCondArgsID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_DsPresCondArgsID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='dsPresCondArgsID'"
     * @generated
     */
    String getDsPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ds Pres Cond Args ID</em>' attribute.
     * @see #isSetDsPresCondArgsID()
     * @see #unsetDsPresCondArgsID()
     * @see #getDsPresCondArgsID()
     * @generated
     */
    void setDsPresCondArgsID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDsPresCondArgsID()
     * @see #getDsPresCondArgsID()
     * @see #setDsPresCondArgsID(String)
     * @generated
     */
    void unsetDsPresCondArgsID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ds Pres Cond Args ID</em>' attribute is set.
     * @see #unsetDsPresCondArgsID()
     * @see #getDsPresCondArgsID()
     * @see #setDsPresCondArgsID(String)
     * @generated
     */
    boolean isSetDsPresCondArgsID();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_PresCond()
     * @model default="M" unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCond'"
     * @generated
     */
    String getPresCond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCond <em>Pres Cond</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCond <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCond()
     * @see #getPresCond()
     * @see #setPresCond(String)
     * @generated
     */
    void unsetPresCond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCond <em>Pres Cond</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_PresCondArgs()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCondArgs'"
     * @generated
     */
    String getPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCondArgs()
     * @see #getPresCondArgs()
     * @see #setPresCondArgs(String)
     * @generated
     */
    void unsetPresCondArgs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_PresCondArgsID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCondArgsID'"
     * @generated
     */
    String getPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCondArgsID()
     * @see #getPresCondArgsID()
     * @see #setPresCondArgsID(String)
     * @generated
     */
    void unsetPresCondArgsID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Transient</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transient</em>' attribute.
     * @see #isSetTransient()
     * @see #unsetTransient()
     * @see #setTransient(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_Transient()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='transient'"
     * @generated
     */
    boolean isTransient();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transient</em>' attribute.
     * @see #isSetTransient()
     * @see #unsetTransient()
     * @see #isTransient()
     * @generated
     */
    void setTransient( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransient()
     * @see #isTransient()
     * @see #setTransient(boolean)
     * @generated
     */
    void unsetTransient();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transient</em>' attribute is set.
     * @see #unsetTransient()
     * @see #isTransient()
     * @see #setTransient(boolean)
     * @generated
     */
    boolean isSetTransient();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_UnderlyingType()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingType'"
     * @generated
     */
    String getUnderlyingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType <em>Underlying Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingType()
     * @see #getUnderlyingType()
     * @see #setUnderlyingType(String)
     * @generated
     */
    void unsetUnderlyingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType <em>Underlying Type</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_UnderlyingTypeKind()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingTypeKind'"
     * @generated
     */
    DefinedAttributeTypeKind getUnderlyingTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @generated
     */
    void unsetUnderlyingTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Any LN Class</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any LN Class</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any LN Class</em>' container reference.
     * @see #setAnyLNClass(AnyLNClass)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_AnyLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject
     * @model opposite="dataObject" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AnyLNClass getAnyLNClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getAnyLNClass <em>Any LN Class</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Any LN Class</em>' container reference.
     * @see #getAnyLNClass()
     * @generated
     */
    void setAnyLNClass( AnyLNClass value );

} // DataObject
