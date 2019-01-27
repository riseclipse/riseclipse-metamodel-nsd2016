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
 * A representation of the model object '<em><b>TApplicable Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Applicable services for a given functional constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTApplicableServices()
 * @model extendedMetaData="name='tApplicableServices' kind='elementOnly'"
 * @generated
 */
public interface TApplicableServices extends EObject {
    /**
     * Returns the value of the '<em><b>Service</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If present, indicates that the service with given name applies to attributes with the specified FC (otherwise it may not be used).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTApplicableServices_Service()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
     * @generated
     */
    EList< ServiceType > getService();

    /**
     * Returns the value of the '<em><b>Data Set Member Of</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An attribute of this FC can be member of a dataset for a control block type indicated by attribute cb if and only if this element is present.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Set Member Of</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTApplicableServices_DataSetMemberOf()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DataSetMemberOf' namespace='##targetNamespace'"
     * @generated
     */
    EList< TDataSetMemberOf > getDataSetMemberOf();

} // TApplicableServices
