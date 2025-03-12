/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getParentConstructedAttribute <em>Parent Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute()
 * @model extendedMetaData="name='tSubDataAttribute' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface SubDataAttribute extends DocumentedClass, AgPresenceCondition, AgArray, AgAttributeTypeAndValues {
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
     * Returns the value of the '<em><b>Parent Constructed Attribute</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Constructed Attribute</em>' container reference.
     * @see #setParentConstructedAttribute(ConstructedAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_ParentConstructedAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute
     * @model opposite="subDataAttribute" resolveProxies="false" unsettable="true"
     * @generated
     */
    ConstructedAttribute getParentConstructedAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getParentConstructedAttribute <em>Parent Constructed Attribute</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Constructed Attribute</em>' container reference.
     * @see #getParentConstructedAttribute()
     * @generated
     */
    void setParentConstructedAttribute( ConstructedAttribute value );

    /**
     * Returns the value of the '<em><b>Refers To Presence Condition</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute <em>Referred By Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Presence Condition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Presence Condition</em>' reference.
     * @see #isSetRefersToPresenceCondition()
     * @see #unsetRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getSubDataAttribute_RefersToPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute
     * @model opposite="referredBySubDataAttribute" resolveProxies="false" unsettable="true" transient="true"
     * @generated
     */
    PresenceCondition getRefersToPresenceCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Presence Condition</em>' reference.
     * @see #isSetRefersToPresenceCondition()
     * @see #unsetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @generated
     */
    void setRefersToPresenceCondition( PresenceCondition value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    void unsetRefersToPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Presence Condition</em>' reference is set.
     * @see #unsetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    boolean isSetRefersToPresenceCondition();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // SubDataAttribute
