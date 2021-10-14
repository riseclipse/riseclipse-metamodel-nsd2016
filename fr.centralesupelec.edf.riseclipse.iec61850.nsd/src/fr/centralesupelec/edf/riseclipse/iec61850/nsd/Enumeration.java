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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getParentEnumerations <em>Parent Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType <em>Referred By Attribute Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration()
 * @model extendedMetaData="name='tEnumeration' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface Enumeration extends TitledClass {
    /**
     * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getParentEnumeration <em>Parent Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Literal</em>' containment reference list.
     * @see #isSetLiteral()
     * @see #unsetLiteral()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_Literal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getParentEnumeration
     * @model opposite="parentEnumeration" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Literal' namespace='##targetNamespace'"
     * @generated
     */
    EList< Literal > getLiteral();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLiteral()
     * @see #getLiteral()
     * @generated
     */
    void unsetLiteral();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Literal</em>' containment reference list is set.
     * @see #unsetLiteral()
     * @see #getLiteral()
     * @generated
     */
    boolean isSetLiteral();

    /**
     * Returns the value of the '<em><b>Inherited From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inherited From</em>' attribute.
     * @see #isSetInheritedFrom()
     * @see #unsetInheritedFrom()
     * @see #setInheritedFrom(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_InheritedFrom()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='inheritedFrom'"
     * @generated
     */
    String getInheritedFrom();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inherited From</em>' attribute.
     * @see #isSetInheritedFrom()
     * @see #unsetInheritedFrom()
     * @see #getInheritedFrom()
     * @generated
     */
    void setInheritedFrom( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInheritedFrom()
     * @see #getInheritedFrom()
     * @see #setInheritedFrom(String)
     * @generated
     */
    void unsetInheritedFrom();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inherited From</em>' attribute is set.
     * @see #unsetInheritedFrom()
     * @see #getInheritedFrom()
     * @see #setInheritedFrom(String)
     * @generated
     */
    boolean isSetInheritedFrom();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Parent Enumerations</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Enumerations</em>' container reference.
     * @see #setParentEnumerations(Enumerations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_ParentEnumerations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration
     * @model opposite="enumeration" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Enumerations getParentEnumerations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getParentEnumerations <em>Parent Enumerations</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Enumerations</em>' container reference.
     * @see #getParentEnumerations()
     * @generated
     */
    void setParentEnumerations( Enumerations value );

    /**
     * Returns the value of the '<em><b>Refers To Base Enumeration</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Base Enumeration</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Base Enumeration</em>' reference.
     * @see #isSetRefersToBaseEnumeration()
     * @see #unsetRefersToBaseEnumeration()
     * @see #setRefersToBaseEnumeration(Enumeration)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_RefersToBaseEnumeration()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase
     * @model opposite="referredByEnumerationAsBase" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Enumeration getRefersToBaseEnumeration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Base Enumeration</em>' reference.
     * @see #isSetRefersToBaseEnumeration()
     * @see #unsetRefersToBaseEnumeration()
     * @see #getRefersToBaseEnumeration()
     * @generated
     */
    void setRefersToBaseEnumeration( Enumeration value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToBaseEnumeration()
     * @see #getRefersToBaseEnumeration()
     * @see #setRefersToBaseEnumeration(Enumeration)
     * @generated
     */
    void unsetRefersToBaseEnumeration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Base Enumeration</em>' reference is set.
     * @see #unsetRefersToBaseEnumeration()
     * @see #getRefersToBaseEnumeration()
     * @see #setRefersToBaseEnumeration(Enumeration)
     * @generated
     */
    boolean isSetRefersToBaseEnumeration();

    /**
     * Returns the value of the '<em><b>Referred By Enumeration As Base</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Enumeration As Base</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Enumeration As Base</em>' reference list.
     * @see #isSetReferredByEnumerationAsBase()
     * @see #unsetReferredByEnumerationAsBase()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_ReferredByEnumerationAsBase()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration
     * @model opposite="refersToBaseEnumeration" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< Enumeration > getReferredByEnumerationAsBase();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByEnumerationAsBase()
     * @see #getReferredByEnumerationAsBase()
     * @generated
     */
    void unsetReferredByEnumerationAsBase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Enumeration As Base</em>' reference list is set.
     * @see #unsetReferredByEnumerationAsBase()
     * @see #getReferredByEnumerationAsBase()
     * @generated
     */
    boolean isSetReferredByEnumerationAsBase();

    /**
     * Returns the value of the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration <em>Refers To Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Attribute Type</em>' reference list.
     * @see #isSetReferredByAttributeType()
     * @see #unsetReferredByAttributeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_ReferredByAttributeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration
     * @model opposite="refersToEnumeration" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgAttributeType > getReferredByAttributeType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType <em>Referred By Attribute Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAttributeType()
     * @see #getReferredByAttributeType()
     * @generated
     */
    void unsetReferredByAttributeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType <em>Referred By Attribute Type</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Attribute Type</em>' reference list is set.
     * @see #unsetReferredByAttributeType()
     * @see #getReferredByAttributeType()
     * @generated
     */
    boolean isSetReferredByAttributeType();

    /**
     * Returns the value of the '<em><b>Referred By Underlying Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Underlying Type</em>' reference list.
     * @see #isSetReferredByUnderlyingType()
     * @see #unsetReferredByUnderlyingType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_ReferredByUnderlyingType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingEnumeration
     * @model opposite="refersToUnderlyingEnumeration" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgUnderlyingType > getReferredByUnderlyingType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByUnderlyingType()
     * @see #getReferredByUnderlyingType()
     * @generated
     */
    void unsetReferredByUnderlyingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Underlying Type</em>' reference list is set.
     * @see #unsetReferredByUnderlyingType()
     * @see #getReferredByUnderlyingType()
     * @generated
     */
    boolean isSetReferredByUnderlyingType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'For an Enumeration, there shall not be two Literal sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: inherited literals should be taken into account\n\t\t\t-- For this, explicit links have to be created first\n\t\t\tself.literal-&gt;isUnique( l : Literal | l.name )\n}.status'"
     * @generated
     */
    boolean uniqueLiteralName( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'For an Enumeration, there shall not be two Literal sub-elements with same literalVal.\',\n\tstatus : Boolean = \n\t\t\tself.literal-&gt;isUnique( l : Literal | l.literalVal )\n}.status'"
     * @generated
     */
    boolean uniqueLiteralVal( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // Enumeration
