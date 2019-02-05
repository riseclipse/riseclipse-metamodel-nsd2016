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
 * A representation of the model object '<em><b>CD Cs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of CDCs introduced by a namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDCs()
 * @model extendedMetaData="name='tCDCs' kind='elementOnly'"
 * @generated
 */
public interface CDCs extends EObject {
    /**
     * Returns the value of the '<em><b>CDC</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Definition of a common data class.
     * <!-- end-model-doc -->
     * @return the value of the '<em>CDC</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDCs_CDC()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CDC' namespace='##targetNamespace'"
     * @generated
     */
    EList< CDC > getCDC();

} // CDCs
