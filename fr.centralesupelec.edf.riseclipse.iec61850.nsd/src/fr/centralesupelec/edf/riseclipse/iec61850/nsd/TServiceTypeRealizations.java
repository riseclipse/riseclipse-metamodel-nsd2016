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
 * A representation of the model object '<em><b>TService Type Realizations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of Service Type Realizations introduced by a namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceTypeRealizations()
 * @model extendedMetaData="name='tServiceTypeRealizations' kind='elementOnly'"
 * @generated
 */
public interface TServiceTypeRealizations extends EObject {
    /**
     * Returns the value of the '<em><b>Service Type Realization</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Realization of an abstract type as constructed attribute in the service namespace.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service Type Realization</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceTypeRealizations_ServiceTypeRealization()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ServiceTypeRealization' namespace='##targetNamespace'"
     * @generated
     */
    EList< TConstructedAttribute > getServiceTypeRealization();

} // TServiceTypeRealizations
