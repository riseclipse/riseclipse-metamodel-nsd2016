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
 * A representation of the model object '<em><b>TService CDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a CDC extension for control services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceCDC()
 * @model extendedMetaData="name='tServiceCDC' kind='elementOnly'"
 * @generated
 */
public interface TServiceCDC extends EObject {
    /**
     * Returns the value of the '<em><b>Service Data Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Data attribute to be used as service parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service Data Attribute</em>' containment reference list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceCDC_ServiceDataAttribute()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='ServiceDataAttribute' namespace='##targetNamespace'"
     * @generated
     */
    EList< TServiceDataAttribute > getServiceDataAttribute();

    /**
     * Returns the value of the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the common data class the service extension is for.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cdc</em>' attribute.
     * @see #setCdc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceCDC_Cdc()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCName" required="true"
     *        extendedMetaData="kind='attribute' name='cdc'"
     * @generated
     */
    String getCdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getCdc <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cdc</em>' attribute.
     * @see #getCdc()
     * @generated
     */
    void setCdc( String value );

    /**
     * Returns the value of the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identification of the variant of the CDC (e.g., SPG_SP).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variant</em>' attribute.
     * @see #setVariant(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceCDC_Variant()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
     *        extendedMetaData="kind='attribute' name='variant'"
     * @generated
     */
    String getVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getVariant <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variant</em>' attribute.
     * @see #getVariant()
     * @generated
     */
    void setVariant( String value );

} // TServiceCDC
