/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType <em>Refers To Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration <em>Refers To Enumeration</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgAttributeType()
 * @model abstract="true"
 * @generated
 */
public interface AgAttributeType extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgAttributeType_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getType <em>Type</em>}' attribute is set.
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
     * <p>
     * If the meaning of the '<em>Type Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Kind</em>' attribute.
     * @see #isSetTypeKind()
     * @see #unsetTypeKind()
     * @see #setTypeKind(Enumerator)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgAttributeType_TypeKind()
     * @model default="BASIC" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.AttributeTypeKind"
     *        extendedMetaData="kind='attribute' name='typeKind'"
     * @generated
     */
    Enumerator getTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getTypeKind <em>Type Kind</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getTypeKind <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeKind()
     * @see #getTypeKind()
     * @see #setTypeKind(Enumerator)
     * @generated
     */
    void unsetTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getTypeKind <em>Type Kind</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Refers To Basic Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType <em>Referred By Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Basic Type</em>' reference.
     * @see #isSetRefersToBasicType()
     * @see #unsetRefersToBasicType()
     * @see #setRefersToBasicType(BasicType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgAttributeType_RefersToBasicType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType
     * @model opposite="referredByAttributeType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    BasicType getRefersToBasicType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType <em>Refers To Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Basic Type</em>' reference.
     * @see #isSetRefersToBasicType()
     * @see #unsetRefersToBasicType()
     * @see #getRefersToBasicType()
     * @generated
     */
    void setRefersToBasicType( BasicType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType <em>Refers To Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToBasicType()
     * @see #getRefersToBasicType()
     * @see #setRefersToBasicType(BasicType)
     * @generated
     */
    void unsetRefersToBasicType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType <em>Refers To Basic Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Basic Type</em>' reference is set.
     * @see #unsetRefersToBasicType()
     * @see #getRefersToBasicType()
     * @see #setRefersToBasicType(BasicType)
     * @generated
     */
    boolean isSetRefersToBasicType();

    /**
     * Returns the value of the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType <em>Referred By Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Constructed Attribute</em>' reference.
     * @see #isSetRefersToConstructedAttribute()
     * @see #unsetRefersToConstructedAttribute()
     * @see #setRefersToConstructedAttribute(ConstructedAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgAttributeType_RefersToConstructedAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType
     * @model opposite="referredByAttributeType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ConstructedAttribute getRefersToConstructedAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Constructed Attribute</em>' reference.
     * @see #isSetRefersToConstructedAttribute()
     * @see #unsetRefersToConstructedAttribute()
     * @see #getRefersToConstructedAttribute()
     * @generated
     */
    void setRefersToConstructedAttribute( ConstructedAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToConstructedAttribute()
     * @see #getRefersToConstructedAttribute()
     * @see #setRefersToConstructedAttribute(ConstructedAttribute)
     * @generated
     */
    void unsetRefersToConstructedAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Constructed Attribute</em>' reference is set.
     * @see #unsetRefersToConstructedAttribute()
     * @see #getRefersToConstructedAttribute()
     * @see #setRefersToConstructedAttribute(ConstructedAttribute)
     * @generated
     */
    boolean isSetRefersToConstructedAttribute();

    /**
     * Returns the value of the '<em><b>Refers To Enumeration</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType <em>Referred By Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Enumeration</em>' reference.
     * @see #isSetRefersToEnumeration()
     * @see #unsetRefersToEnumeration()
     * @see #setRefersToEnumeration(Enumeration)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgAttributeType_RefersToEnumeration()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType
     * @model opposite="referredByAttributeType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Enumeration getRefersToEnumeration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration <em>Refers To Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Enumeration</em>' reference.
     * @see #isSetRefersToEnumeration()
     * @see #unsetRefersToEnumeration()
     * @see #getRefersToEnumeration()
     * @generated
     */
    void setRefersToEnumeration( Enumeration value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration <em>Refers To Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToEnumeration()
     * @see #getRefersToEnumeration()
     * @see #setRefersToEnumeration(Enumeration)
     * @generated
     */
    void unsetRefersToEnumeration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration <em>Refers To Enumeration</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Enumeration</em>' reference is set.
     * @see #unsetRefersToEnumeration()
     * @see #getRefersToEnumeration()
     * @see #setRefersToEnumeration(Enumeration)
     * @generated
     */
    boolean isSetRefersToEnumeration();

} // AgAttributeType
