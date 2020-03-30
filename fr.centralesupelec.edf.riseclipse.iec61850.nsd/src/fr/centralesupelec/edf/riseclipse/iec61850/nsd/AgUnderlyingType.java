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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Underlying Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUnderlyingType()
 * @model abstract="true"
 * @generated
 */
public interface AgUnderlyingType extends EObject {
    /**
     * Returns the value of the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Underlying Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Underlying Type</em>' attribute.
     * @see #isSetUnderlyingType()
     * @see #unsetUnderlyingType()
     * @see #setUnderlyingType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUnderlyingType_UnderlyingType()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingType'"
     * @generated
     */
    String getUnderlyingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingType <em>Underlying Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingType <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingType()
     * @see #getUnderlyingType()
     * @see #setUnderlyingType(String)
     * @generated
     */
    void unsetUnderlyingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingType <em>Underlying Type</em>}' attribute is set.
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
     * <p>
     * If the meaning of the '<em>Underlying Type Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Underlying Type Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see #isSetUnderlyingTypeKind()
     * @see #unsetUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUnderlyingType_UnderlyingTypeKind()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='underlyingTypeKind'"
     * @generated
     */
    DefinedAttributeTypeKind getUnderlyingTypeKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderlyingTypeKind()
     * @see #getUnderlyingTypeKind()
     * @see #setUnderlyingTypeKind(DefinedAttributeTypeKind)
     * @generated
     */
    void unsetUnderlyingTypeKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingTypeKind <em>Underlying Type Kind</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Refers To Underlying Basic Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Underlying Basic Type</em>' reference.
     * @see #isSetRefersToUnderlyingBasicType()
     * @see #unsetRefersToUnderlyingBasicType()
     * @see #setRefersToUnderlyingBasicType(BasicType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUnderlyingType_RefersToUnderlyingBasicType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByUnderlyingType
     * @model opposite="referredByUnderlyingType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    BasicType getRefersToUnderlyingBasicType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Underlying Basic Type</em>' reference.
     * @see #isSetRefersToUnderlyingBasicType()
     * @see #unsetRefersToUnderlyingBasicType()
     * @see #getRefersToUnderlyingBasicType()
     * @generated
     */
    void setRefersToUnderlyingBasicType( BasicType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToUnderlyingBasicType()
     * @see #getRefersToUnderlyingBasicType()
     * @see #setRefersToUnderlyingBasicType(BasicType)
     * @generated
     */
    void unsetRefersToUnderlyingBasicType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Underlying Basic Type</em>' reference is set.
     * @see #unsetRefersToUnderlyingBasicType()
     * @see #getRefersToUnderlyingBasicType()
     * @see #setRefersToUnderlyingBasicType(BasicType)
     * @generated
     */
    boolean isSetRefersToUnderlyingBasicType();

    /**
     * Returns the value of the '<em><b>Refers To Underlying Constructed Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Underlying Constructed Attribute</em>' reference.
     * @see #isSetRefersToUnderlyingConstructedAttribute()
     * @see #unsetRefersToUnderlyingConstructedAttribute()
     * @see #setRefersToUnderlyingConstructedAttribute(ConstructedAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUnderlyingType_RefersToUnderlyingConstructedAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByUnderlyingType
     * @model opposite="referredByUnderlyingType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ConstructedAttribute getRefersToUnderlyingConstructedAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Underlying Constructed Attribute</em>' reference.
     * @see #isSetRefersToUnderlyingConstructedAttribute()
     * @see #unsetRefersToUnderlyingConstructedAttribute()
     * @see #getRefersToUnderlyingConstructedAttribute()
     * @generated
     */
    void setRefersToUnderlyingConstructedAttribute( ConstructedAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToUnderlyingConstructedAttribute()
     * @see #getRefersToUnderlyingConstructedAttribute()
     * @see #setRefersToUnderlyingConstructedAttribute(ConstructedAttribute)
     * @generated
     */
    void unsetRefersToUnderlyingConstructedAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Underlying Constructed Attribute</em>' reference is set.
     * @see #unsetRefersToUnderlyingConstructedAttribute()
     * @see #getRefersToUnderlyingConstructedAttribute()
     * @see #setRefersToUnderlyingConstructedAttribute(ConstructedAttribute)
     * @generated
     */
    boolean isSetRefersToUnderlyingConstructedAttribute();

    /**
     * Returns the value of the '<em><b>Refers To Underlying Enumeration</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Underlying Enumeration</em>' reference.
     * @see #isSetRefersToUnderlyingEnumeration()
     * @see #unsetRefersToUnderlyingEnumeration()
     * @see #setRefersToUnderlyingEnumeration(Enumeration)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUnderlyingType_RefersToUnderlyingEnumeration()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByUnderlyingType
     * @model opposite="referredByUnderlyingType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Enumeration getRefersToUnderlyingEnumeration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Underlying Enumeration</em>' reference.
     * @see #isSetRefersToUnderlyingEnumeration()
     * @see #unsetRefersToUnderlyingEnumeration()
     * @see #getRefersToUnderlyingEnumeration()
     * @generated
     */
    void setRefersToUnderlyingEnumeration( Enumeration value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToUnderlyingEnumeration()
     * @see #getRefersToUnderlyingEnumeration()
     * @see #setRefersToUnderlyingEnumeration(Enumeration)
     * @generated
     */
    void unsetRefersToUnderlyingEnumeration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Underlying Enumeration</em>' reference is set.
     * @see #unsetRefersToUnderlyingEnumeration()
     * @see #getRefersToUnderlyingEnumeration()
     * @see #setRefersToUnderlyingEnumeration(Enumeration)
     * @generated
     */
    boolean isSetRefersToUnderlyingEnumeration();

} // AgUnderlyingType
