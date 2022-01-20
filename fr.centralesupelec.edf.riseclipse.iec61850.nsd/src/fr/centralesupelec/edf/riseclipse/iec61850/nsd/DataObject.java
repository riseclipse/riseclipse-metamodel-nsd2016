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
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getParentAnyLNClass <em>Parent Any LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC <em>Refers To CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject()
 * @model extendedMetaData="name='tDataObject' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeAttributeRequired'"
 * @generated
 */
public interface DataObject
        extends DocumentedClass, AgPresenceCondition, AgPresenceConditionDerivedStatistics, AgUnderlyingType {
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
     * Returns the value of the '<em><b>Parent Any LN Class</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Any LN Class</em>' container reference.
     * @see #setParentAnyLNClass(AnyLNClass)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_ParentAnyLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject
     * @model opposite="dataObject" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AnyLNClass getParentAnyLNClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getParentAnyLNClass <em>Parent Any LN Class</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Any LN Class</em>' container reference.
     * @see #getParentAnyLNClass()
     * @generated
     */
    void setParentAnyLNClass( AnyLNClass value );

    /**
     * Returns the value of the '<em><b>Refers To CDC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject <em>Referred By Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To CDC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To CDC</em>' reference.
     * @see #isSetRefersToCDC()
     * @see #unsetRefersToCDC()
     * @see #setRefersToCDC(CDC)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_RefersToCDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject
     * @model opposite="referredByDataObject" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    CDC getRefersToCDC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC <em>Refers To CDC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To CDC</em>' reference.
     * @see #isSetRefersToCDC()
     * @see #unsetRefersToCDC()
     * @see #getRefersToCDC()
     * @generated
     */
    void setRefersToCDC( CDC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC <em>Refers To CDC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToCDC()
     * @see #getRefersToCDC()
     * @see #setRefersToCDC(CDC)
     * @generated
     */
    void unsetRefersToCDC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC <em>Refers To CDC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To CDC</em>' reference is set.
     * @see #unsetRefersToCDC()
     * @see #getRefersToCDC()
     * @see #setRefersToCDC(CDC)
     * @generated
     */
    boolean isSetRefersToCDC();

    /**
     * Returns the value of the '<em><b>Refers To Presence Condition</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject <em>Referred By Data Object</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_RefersToPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject
     * @model opposite="referredByDataObject" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    PresenceCondition getRefersToPresenceCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    void unsetRefersToPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference is set.
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
     * Returns the value of the '<em><b>Refers To Presence Condition Derived Statistics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics <em>Referred By Data Object For Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Presence Condition Derived Statistics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Presence Condition Derived Statistics</em>' reference.
     * @see #isSetRefersToPresenceConditionDerivedStatistics()
     * @see #unsetRefersToPresenceConditionDerivedStatistics()
     * @see #setRefersToPresenceConditionDerivedStatistics(PresenceCondition)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataObject_RefersToPresenceConditionDerivedStatistics()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics
     * @model opposite="referredByDataObjectForDerivedStatistics" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    PresenceCondition getRefersToPresenceConditionDerivedStatistics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Presence Condition Derived Statistics</em>' reference.
     * @see #isSetRefersToPresenceConditionDerivedStatistics()
     * @see #unsetRefersToPresenceConditionDerivedStatistics()
     * @see #getRefersToPresenceConditionDerivedStatistics()
     * @generated
     */
    void setRefersToPresenceConditionDerivedStatistics( PresenceCondition value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToPresenceConditionDerivedStatistics()
     * @see #getRefersToPresenceConditionDerivedStatistics()
     * @see #setRefersToPresenceConditionDerivedStatistics(PresenceCondition)
     * @generated
     */
    void unsetRefersToPresenceConditionDerivedStatistics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Presence Condition Derived Statistics</em>' reference is set.
     * @see #unsetRefersToPresenceConditionDerivedStatistics()
     * @see #getRefersToPresenceConditionDerivedStatistics()
     * @see #setRefersToPresenceConditionDerivedStatistics(PresenceCondition)
     * @generated
     */
    boolean isSetRefersToPresenceConditionDerivedStatistics();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The type attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.type &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean typeAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // DataObject
