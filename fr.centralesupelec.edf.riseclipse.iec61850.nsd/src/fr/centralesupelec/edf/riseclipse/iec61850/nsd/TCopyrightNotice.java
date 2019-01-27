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
 * A representation of the model object '<em><b>TCopyright Notice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Copyright notice definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getNotice <em>Notice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCopyrightNotice()
 * @model extendedMetaData="name='tCopyrightNotice' kind='elementOnly'"
 * @generated
 */
public interface TCopyrightNotice extends EObject {
    /**
     * Returns the value of the '<em><b>Notice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The textual copyright notice.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Notice</em>' containment reference.
     * @see #setNotice(TNotice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCopyrightNotice_Notice()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='Notice' namespace='##targetNamespace'"
     * @generated
     */
    TNotice getNotice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getNotice <em>Notice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notice</em>' containment reference.
     * @see #getNotice()
     * @generated
     */
    void setNotice( TNotice value );

    /**
     * Returns the value of the '<em><b>License</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The license definition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>License</em>' containment reference.
     * @see #setLicense(TLicense)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTCopyrightNotice_License()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='License' namespace='##targetNamespace'"
     * @generated
     */
    TLicense getLicense();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getLicense <em>License</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>License</em>' containment reference.
     * @see #getLicense()
     * @generated
     */
    void setLicense( TLicense value );

} // TCopyrightNotice
