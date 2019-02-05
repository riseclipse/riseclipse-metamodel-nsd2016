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

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a service parameter as Data Attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute()
 * @model extendedMetaData="name='tServiceDataAttribute' kind='empty'"
 * @generated
 */
public interface ServiceDataAttribute extends DocumentedClass {
    /**
     * Returns the value of the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Functional constraint of the data attribute.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fc</em>' attribute.
     * @see #setFc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_Fc()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='fc'"
     * @generated
     */
    String getFc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fc</em>' attribute.
     * @see #getFc()
     * @generated
     */
    void setFc( String value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the data attribute.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_Name()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_PresCond()
     * @model default="M" unsettable="true"
     *        extendedMetaData="kind='attribute' name='presCond'"
     * @generated
     */
    String getPresCond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCond <em>Pres Cond</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCond <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresCond()
     * @see #getPresCond()
     * @see #setPresCond(String)
     * @generated
     */
    void unsetPresCond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCond <em>Pres Cond</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_PresCondArgs()
     * @model extendedMetaData="kind='attribute' name='presCondArgs'"
     * @generated
     */
    String getPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_PresCondArgsID()
     * @model extendedMetaData="kind='attribute' name='presCondArgsID'"
     * @generated
     */
    String getPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pres Cond Args ID</em>' attribute.
     * @see #getPresCondArgsID()
     * @generated
     */
    void setPresCondArgsID( String value );

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the data attribute, e.g., the name of a basic type like INT32, the name of an enumeration of a constructed data attribute - depending on the sibling typeKind. If not provided, shall be defined by the "parent" element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_Type()
     * @model extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getType <em>Type</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_TypeKind()
     * @model default="BASIC" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.AttributeTypeKind"
     *        extendedMetaData="kind='attribute' name='typeKind'"
     * @generated
     */
    Enumerator getTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getTypeKind <em>Type Kind</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getTypeKind <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeKind()
     * @see #getTypeKind()
     * @see #setTypeKind(Enumerator)
     * @generated
     */
    void unsetTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getTypeKind <em>Type Kind</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type to be used for type-open CDCs, e.g., enumeration to be used for enumeration-based CDCs (e.g., ENS, ENC, ENG).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Underlying Type</em>' attribute.
     * @see #setUnderlyingType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_UnderlyingType()
     * @model extendedMetaData="kind='attribute' name='underlyingType'"
     * @generated
     */
    String getUnderlyingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingType <em>Underlying Type</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_UnderlyingTypeKind()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingTypeKind'"
     * @generated
     */
    DefinedAttributeTypeKind getUnderlyingTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @generated
     */
    void unsetUnderlyingTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Underlying Type Kind</em>' attribute is set.
     * @see #unsetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @generated
     */
    boolean isSetUnderlyingTypeKind();

} // ServiceDataAttribute
