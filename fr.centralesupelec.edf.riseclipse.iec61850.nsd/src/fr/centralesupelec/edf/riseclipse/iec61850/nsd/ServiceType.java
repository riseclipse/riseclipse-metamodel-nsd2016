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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getApplicableServices <em>Applicable Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceType()
 * @model extendedMetaData="name='Service_._type' kind='empty'"
 * @generated
 */
public interface ServiceType extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(ACSIServicesKind)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceType_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    ACSIServicesKind getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( ACSIServicesKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(ACSIServicesKind)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(ACSIServicesKind)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Applicable Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicable Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Services</em>' container reference.
     * @see #setApplicableServices(ApplicableServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceType_ApplicableServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService
     * @model opposite="service" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ApplicableServices getApplicableServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getApplicableServices <em>Applicable Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applicable Services</em>' container reference.
     * @see #getApplicableServices()
     * @generated
     */
    void setApplicableServices( ApplicableServices value );

} // ServiceType
