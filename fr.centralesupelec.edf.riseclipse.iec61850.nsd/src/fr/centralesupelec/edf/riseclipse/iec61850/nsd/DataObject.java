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
 * <!-- begin-model-doc -->
 * Definition of a Data Object of a logical node.
 * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Presence condition of the element. By default 'M' (mandatory).
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Optional argument to the presence condition. Can be a sibling element or a group number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ds Pres Cond Args</em>' attribute.
     * @see #setDsPresCondArgs(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_DsPresCondArgs()
     * @model extendedMetaData="kind='attribute' name='dsPresCondArgs'"
     * @generated
     */
    String getDsPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ds Pres Cond Args</em>' attribute.
     * @see #getDsPresCondArgs()
     * @generated
     */
    void setDsPresCondArgs( String value );

    /**
     * Returns the value of the '<em><b>Ds Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Optional argument to the presence condition: a documentation identifier referring to some free text.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ds Pres Cond Args ID</em>' attribute.
     * @see #setDsPresCondArgsID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_DsPresCondArgsID()
     * @model extendedMetaData="kind='attribute' name='dsPresCondArgsID'"
     * @generated
     */
    String getDsPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ds Pres Cond Args ID</em>' attribute.
     * @see #getDsPresCondArgsID()
     * @generated
     */
    void setDsPresCondArgsID( String value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the data object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_Name()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}' attribute.
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
     * <!-- begin-model-doc -->
     * Optional argument to the presence condition. Can be a sibling element or a group number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pres Cond Args</em>' attribute.
     * @see #setPresCondArgs(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_PresCondArgs()
     * @model extendedMetaData="kind='attribute' name='presCondArgs'"
     * @generated
     */
    String getPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_PresCondArgsID()
     * @model extendedMetaData="kind='attribute' name='presCondArgsID'"
     * @generated
     */
    String getPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond Args ID</em>' attribute.
     * @see #getPresCondArgsID()
     * @generated
     */
    void setPresCondArgsID( String value );

    /**
     * Returns the value of the '<em><b>Transient</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flag indicating whether this data object is transient. By default, it is not.
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Type of the data object, i.e., the name of the CDC.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_Type()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Returns the value of the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type to be used for type-open CDCs, e.g., enumeration to be used for enumeration-based CDCs (e.g., ENS, ENC, ENG).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Underlying Type</em>' attribute.
     * @see #setUnderlyingType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_UnderlyingType()
     * @model extendedMetaData="kind='attribute' name='underlyingType'"
     * @generated
     */
    String getUnderlyingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underlying Type</em>' attribute.
     * @see #getUnderlyingType()
     * @generated
     */
    void setUnderlyingType( String value );

    /**
     * Returns the value of the '<em><b>Underlying Type Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The typeKind to be used for all "undefined" attributes of the CDC of this DataObject.
     * <!-- end-model-doc -->
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

} // DataObject
