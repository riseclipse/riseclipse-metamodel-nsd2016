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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any LN Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a logical node (abstract or not) and its contents.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass()
 * @model abstract="true"
 *        extendedMetaData="name='tAnyLNClass' kind='elementOnly'"
 * @generated
 */
public interface AnyLNClass extends TitledClass {
    /**
     * Returns the value of the '<em><b>Data Object</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Child Data Object of the logical node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Object</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass_DataObject()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DataObject' namespace='##targetNamespace'"
     * @generated
     */
    EList< DataObject > getDataObject();

    /**
     * Returns the value of the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the abstract LN class this one extends (directly).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base</em>' attribute.
     * @see #setBase(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass_Base()
     * @model extendedMetaData="kind='attribute' name='base'"
     * @generated
     */
    String getBase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' attribute.
     * @see #getBase()
     * @generated
     */
    void setBase( String value );

} // AnyLNClass
