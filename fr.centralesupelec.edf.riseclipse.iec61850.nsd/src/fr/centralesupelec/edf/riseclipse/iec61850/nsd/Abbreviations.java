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
 * A representation of the model object '<em><b>Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of abbreviationss which are introduced by a namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAbbreviations()
 * @model extendedMetaData="name='tAbbreviations' kind='elementOnly'"
 * @generated
 */
public interface Abbreviations extends EObject {
    /**
     * Returns the value of the '<em><b>Abbreviation</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Definition of an abbreviation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Abbreviation</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAbbreviations_Abbreviation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='Abbreviation' namespace='##targetNamespace'"
     * @generated
     */
    EList< Abbreviation > getAbbreviation();

} // Abbreviations
