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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tDocumentedClass with title.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTitledClass()
 * @model extendedMetaData="name='tTitledClass' kind='empty'"
 * @generated
 */
public interface TitledClass extends DocumentedClass {
    /**
     * Returns the value of the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to the title (alias) of this object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Title ID</em>' attribute.
     * @see #setTitleID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTitledClass_TitleID()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='titleID'"
     * @generated
     */
    String getTitleID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title ID</em>' attribute.
     * @see #getTitleID()
     * @generated
     */
    void setTitleID( String value );

} // TitledClass
