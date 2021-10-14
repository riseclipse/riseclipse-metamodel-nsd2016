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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service CD Cs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC <em>Service CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDCs()
 * @model extendedMetaData="name='tServiceCDCs' kind='elementOnly'"
 * @generated
 */
public interface ServiceCDCs extends NsdObject {
    /**
     * Returns the value of the '<em><b>Service CDC</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getParentServiceCDCs <em>Parent Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service CDC</em>' containment reference list.
     * @see #isSetServiceCDC()
     * @see #unsetServiceCDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDCs_ServiceCDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getParentServiceCDCs
     * @model opposite="parentServiceCDCs" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceCDC' namespace='##targetNamespace'"
     * @generated
     */
    EList< ServiceCDC > getServiceCDC();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC <em>Service CDC</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceCDC()
     * @see #getServiceCDC()
     * @generated
     */
    void unsetServiceCDC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC <em>Service CDC</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service CDC</em>' containment reference list is set.
     * @see #unsetServiceCDC()
     * @see #getServiceCDC()
     * @generated
     */
    boolean isSetServiceCDC();

    /**
     * Returns the value of the '<em><b>Parent Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service NS</em>' container reference.
     * @see #setParentServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDCs_ParentServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs
     * @model opposite="serviceCDCs" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getParentServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getParentServiceNS <em>Parent Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service NS</em>' container reference.
     * @see #getParentServiceNS()
     * @generated
     */
    void setParentServiceNS( ServiceNS value );

} // ServiceCDCs
