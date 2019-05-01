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
 * A representation of the model object '<em><b>Service Ns Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getParentApplicableServiceNS <em>Parent Applicable Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage()
 * @model extendedMetaData="name='tServiceNsUsage' kind='elementOnly'"
 * @generated
 */
public interface ServiceNsUsage extends NsdObject, AgNSIdentification {
    /**
     * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getParentServiceNsUsage <em>Parent Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applies To</em>' containment reference list.
     * @see #isSetAppliesTo()
     * @see #unsetAppliesTo()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_AppliesTo()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getParentServiceNsUsage
     * @model opposite="parentServiceNsUsage" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
     * @generated
     */
    EList< AppliesToType > getAppliesTo();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppliesTo()
     * @see #getAppliesTo()
     * @generated
     */
    void unsetAppliesTo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Applies To</em>' containment reference list is set.
     * @see #unsetAppliesTo()
     * @see #getAppliesTo()
     * @generated
     */
    boolean isSetAppliesTo();

    /**
     * Returns the value of the '<em><b>Parent Applicable Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Applicable Service NS</em>' container reference.
     * @see #setParentApplicableServiceNS(ApplicableServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_ParentApplicableServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage
     * @model opposite="serviceNsUsage" unsettable="true" ordered="false"
     * @generated
     */
    ApplicableServiceNS getParentApplicableServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getParentApplicableServiceNS <em>Parent Applicable Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Applicable Service NS</em>' container reference.
     * @see #getParentApplicableServiceNS()
     * @generated
     */
    void setParentApplicableServiceNS( ApplicableServiceNS value );

} // ServiceNsUsage
