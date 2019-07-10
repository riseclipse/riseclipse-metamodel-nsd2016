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
 * A representation of the model object '<em><b>Ag Presence Condition Derived Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCond <em>Ds Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgs <em>Ds Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgPresenceConditionDerivedStatistics()
 * @model abstract="true"
 * @generated
 */
public interface AgPresenceConditionDerivedStatistics extends EObject {
    /**
     * Returns the value of the '<em><b>Ds Pres Cond</b></em>' attribute.
     * The default value is <code>"M"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ds Pres Cond</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ds Pres Cond</em>' attribute.
     * @see #isSetDsPresCond()
     * @see #unsetDsPresCond()
     * @see #setDsPresCond(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgPresenceConditionDerivedStatistics_DsPresCond()
     * @model default="M" unsettable="true"
     *        extendedMetaData="kind='attribute' name='dsPresCond'"
     * @generated
     */
    String getDsPresCond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCond <em>Ds Pres Cond</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCond <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDsPresCond()
     * @see #getDsPresCond()
     * @see #setDsPresCond(String)
     * @generated
     */
    void unsetDsPresCond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCond <em>Ds Pres Cond</em>}' attribute is set.
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
     * <p>
     * If the meaning of the '<em>Ds Pres Cond Args</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ds Pres Cond Args</em>' attribute.
     * @see #isSetDsPresCondArgs()
     * @see #unsetDsPresCondArgs()
     * @see #setDsPresCondArgs(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgPresenceConditionDerivedStatistics_DsPresCondArgs()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='dsPresCondArgs'"
     * @generated
     */
    String getDsPresCondArgs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDsPresCondArgs()
     * @see #getDsPresCondArgs()
     * @see #setDsPresCondArgs(String)
     * @generated
     */
    void unsetDsPresCondArgs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgs <em>Ds Pres Cond Args</em>}' attribute is set.
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
     * <p>
     * If the meaning of the '<em>Ds Pres Cond Args ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ds Pres Cond Args ID</em>' attribute.
     * @see #isSetDsPresCondArgsID()
     * @see #unsetDsPresCondArgsID()
     * @see #setDsPresCondArgsID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgPresenceConditionDerivedStatistics_DsPresCondArgsID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='dsPresCondArgsID'"
     * @generated
     */
    String getDsPresCondArgsID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDsPresCondArgsID()
     * @see #getDsPresCondArgsID()
     * @see #setDsPresCondArgsID(String)
     * @generated
     */
    void unsetDsPresCondArgsID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Refers To Ds Pres Cond Args Doc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics <em>Referred By Ag Presence Condition Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Ds Pres Cond Args Doc</em>' reference.
     * @see #isSetRefersToDsPresCondArgsDoc()
     * @see #unsetRefersToDsPresCondArgsDoc()
     * @see #setRefersToDsPresCondArgsDoc(Doc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgPresenceConditionDerivedStatistics_RefersToDsPresCondArgsDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics
     * @model opposite="referredByAgPresenceConditionDerivedStatistics" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Doc getRefersToDsPresCondArgsDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Ds Pres Cond Args Doc</em>' reference.
     * @see #isSetRefersToDsPresCondArgsDoc()
     * @see #unsetRefersToDsPresCondArgsDoc()
     * @see #getRefersToDsPresCondArgsDoc()
     * @generated
     */
    void setRefersToDsPresCondArgsDoc( Doc value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDsPresCondArgsDoc()
     * @see #getRefersToDsPresCondArgsDoc()
     * @see #setRefersToDsPresCondArgsDoc(Doc)
     * @generated
     */
    void unsetRefersToDsPresCondArgsDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Ds Pres Cond Args Doc</em>' reference is set.
     * @see #unsetRefersToDsPresCondArgsDoc()
     * @see #getRefersToDsPresCondArgsDoc()
     * @see #setRefersToDsPresCondArgsDoc(Doc)
     * @generated
     */
    boolean isSetRefersToDsPresCondArgsDoc();

} // AgPresenceConditionDerivedStatistics
