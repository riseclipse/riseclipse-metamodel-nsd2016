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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getNS <em>NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions()
 * @model extendedMetaData="name='tPresenceConditions' kind='elementOnly'"
 * @generated
 */
public interface PresenceConditions extends NsdObject {
    /**
     * Returns the value of the '<em><b>Presence Condition</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presence Condition</em>' containment reference list.
     * @see #isSetPresenceCondition()
     * @see #unsetPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions_PresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getPresenceConditions
     * @model opposite="presenceConditions" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='PresenceCondition' namespace='##targetNamespace'"
     * @generated
     */
    EList< PresenceCondition > getPresenceCondition();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresenceCondition()
     * @see #getPresenceCondition()
     * @generated
     */
    void unsetPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Presence Condition</em>' containment reference list is set.
     * @see #unsetPresenceCondition()
     * @see #getPresenceCondition()
     * @generated
     */
    boolean isSetPresenceCondition();

    /**
     * Returns the value of the '<em><b>NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NS</em>' container reference.
     * @see #setNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions_NS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions
     * @model opposite="presenceConditions" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getNS <em>NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NS</em>' container reference.
     * @see #getNS()
     * @generated
     */
    void setNS( NS value );

    /**
     * Returns the value of the '<em><b>Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service NS</em>' container reference.
     * @see #setServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions_ServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions
     * @model opposite="presenceConditions" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getServiceNS <em>Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service NS</em>' container reference.
     * @see #getServiceNS()
     * @generated
     */
    void setServiceNS( ServiceNS value );

} // PresenceConditions
