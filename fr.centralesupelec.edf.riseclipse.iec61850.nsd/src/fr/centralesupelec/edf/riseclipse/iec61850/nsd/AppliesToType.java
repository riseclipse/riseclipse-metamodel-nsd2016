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
 * A representation of the model object '<em><b>Applies To Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getServiceNsUsage <em>Service Ns Usage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAppliesToType()
 * @model extendedMetaData="name='AppliesTo_._type' kind='empty'"
 * @generated
 */
public interface AppliesToType extends AgNSIdentification, NsdObject {
    /**
     * Returns the value of the '<em><b>Service Ns Usage</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Ns Usage</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Ns Usage</em>' container reference.
     * @see #setServiceNsUsage(ServiceNsUsage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAppliesToType_ServiceNsUsage()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo
     * @model opposite="appliesTo" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNsUsage getServiceNsUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getServiceNsUsage <em>Service Ns Usage</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Ns Usage</em>' container reference.
     * @see #getServiceNsUsage()
     * @generated
     */
    void setServiceNsUsage( ServiceNsUsage value );

} // AppliesToType
