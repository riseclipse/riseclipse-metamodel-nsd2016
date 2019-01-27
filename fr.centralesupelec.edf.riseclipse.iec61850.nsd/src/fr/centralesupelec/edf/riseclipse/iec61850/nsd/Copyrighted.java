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
 * A representation of the model object '<em><b>Copyrighted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Add description for a copyrighted XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrighted()
 * @model extendedMetaData="name='tCopyrighted' kind='elementOnly'"
 * @generated
 */
public interface Copyrighted extends EObject {
    /**
     * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The copyright notice attached to the XML
     * <!-- end-model-doc -->
     * @return the value of the '<em>Copyright</em>' containment reference.
     * @see #setCopyright(CopyrightNotice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrighted_Copyright()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Copyright' namespace='##targetNamespace'"
     * @generated
     */
    CopyrightNotice getCopyright();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copyright</em>' containment reference.
     * @see #getCopyright()
     * @generated
     */
    void setCopyright( CopyrightNotice value );

} // Copyrighted
