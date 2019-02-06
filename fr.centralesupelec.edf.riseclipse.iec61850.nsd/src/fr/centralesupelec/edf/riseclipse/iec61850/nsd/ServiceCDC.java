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
 * A representation of the model object '<em><b>Service CDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant <em>Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceCDCs <em>Service CD Cs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDC()
 * @model extendedMetaData="name='tServiceCDC' kind='elementOnly'"
 * @generated
 */
public interface ServiceCDC extends EObject {
    /**
     * Returns the value of the '<em><b>Service Data Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Data Attribute</em>' containment reference list.
     * @see #isSetServiceDataAttribute()
     * @see #unsetServiceDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDC_ServiceDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getServiceCDC
     * @model opposite="serviceCDC" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceDataAttribute' namespace='##targetNamespace'"
     * @generated
     */
    EList< ServiceDataAttribute > getServiceDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceDataAttribute()
     * @see #getServiceDataAttribute()
     * @generated
     */
    void unsetServiceDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Data Attribute</em>' containment reference list is set.
     * @see #unsetServiceDataAttribute()
     * @see #getServiceDataAttribute()
     * @generated
     */
    boolean isSetServiceDataAttribute();

    /**
     * Returns the value of the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cdc</em>' attribute.
     * @see #isSetCdc()
     * @see #unsetCdc()
     * @see #setCdc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDC_Cdc()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='cdc'"
     * @generated
     */
    String getCdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cdc</em>' attribute.
     * @see #isSetCdc()
     * @see #unsetCdc()
     * @see #getCdc()
     * @generated
     */
    void setCdc( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCdc()
     * @see #getCdc()
     * @see #setCdc(String)
     * @generated
     */
    void unsetCdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc <em>Cdc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cdc</em>' attribute is set.
     * @see #unsetCdc()
     * @see #getCdc()
     * @see #setCdc(String)
     * @generated
     */
    boolean isSetCdc();

    /**
     * Returns the value of the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variant</em>' attribute.
     * @see #isSetVariant()
     * @see #unsetVariant()
     * @see #setVariant(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDC_Variant()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Token"
     *        extendedMetaData="kind='attribute' name='variant'"
     * @generated
     */
    String getVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variant</em>' attribute.
     * @see #isSetVariant()
     * @see #unsetVariant()
     * @see #getVariant()
     * @generated
     */
    void setVariant( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariant()
     * @see #getVariant()
     * @see #setVariant(String)
     * @generated
     */
    void unsetVariant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant <em>Variant</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variant</em>' attribute is set.
     * @see #unsetVariant()
     * @see #getVariant()
     * @see #setVariant(String)
     * @generated
     */
    boolean isSetVariant();

    /**
     * Returns the value of the '<em><b>Service CD Cs</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service CD Cs</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service CD Cs</em>' container reference.
     * @see #setServiceCDCs(ServiceCDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceCDC_ServiceCDCs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC
     * @model opposite="serviceCDC" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceCDCs getServiceCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceCDCs <em>Service CD Cs</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service CD Cs</em>' container reference.
     * @see #getServiceCDCs()
     * @generated
     */
    void setServiceCDCs( ServiceCDCs value );

} // ServiceCDC
