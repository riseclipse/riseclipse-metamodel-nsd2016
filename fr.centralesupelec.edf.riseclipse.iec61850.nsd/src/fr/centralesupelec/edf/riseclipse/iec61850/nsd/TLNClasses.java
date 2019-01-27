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
 * A representation of the model object '<em><b>TLN Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of LNClasses introduced by a namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses#getAbstractLNClass <em>Abstract LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses#getLNClass <em>LN Class</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTLNClasses()
 * @model extendedMetaData="name='tLNClasses' kind='elementOnly'"
 * @generated
 */
public interface TLNClasses extends EObject {
    /**
     * Returns the value of the '<em><b>Abstract LN Class</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Definition of an abstract logical node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Abstract LN Class</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTLNClasses_AbstractLNClass()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='AbstractLNClass' namespace='##targetNamespace'"
     * @generated
     */
    EList< TAbstractLNClass > getAbstractLNClass();

    /**
     * Returns the value of the '<em><b>LN Class</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Definition of a (non-abstract) logical node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>LN Class</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTLNClasses_LNClass()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='LNClass' namespace='##targetNamespace'"
     * @generated
     */
    EList< TLNClass > getLNClass();

} // TLNClasses
