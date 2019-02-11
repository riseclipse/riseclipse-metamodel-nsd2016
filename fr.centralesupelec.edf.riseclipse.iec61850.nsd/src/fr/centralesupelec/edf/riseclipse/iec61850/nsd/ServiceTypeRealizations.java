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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type Realizations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceTypeRealizations()
 * @model extendedMetaData="name='tServiceTypeRealizations' kind='elementOnly'"
 * @generated
 */
public interface ServiceTypeRealizations extends EObject {
    /**
     * Returns the value of the '<em><b>Service Type Realization</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type Realization</em>' containment reference list.
     * @see #isSetServiceTypeRealization()
     * @see #unsetServiceTypeRealization()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceTypeRealizations_ServiceTypeRealization()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getServiceTypeRealizations
     * @model opposite="serviceTypeRealizations" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceTypeRealization' namespace='##targetNamespace'"
     * @generated
     */
    EList< ConstructedAttribute > getServiceTypeRealization();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceTypeRealization()
     * @see #getServiceTypeRealization()
     * @generated
     */
    void unsetServiceTypeRealization();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Type Realization</em>' containment reference list is set.
     * @see #unsetServiceTypeRealization()
     * @see #getServiceTypeRealization()
     * @generated
     */
    boolean isSetServiceTypeRealization();

    /**
     * Returns the value of the '<em><b>Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service NS</em>' container reference.
     * @see #setServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceTypeRealizations_ServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations
     * @model opposite="serviceTypeRealizations" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceNS <em>Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service NS</em>' container reference.
     * @see #getServiceNS()
     * @generated
     */
    void setServiceNS( ServiceNS value );

} // ServiceTypeRealizations
