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
 * A representation of the model object '<em><b>Data Set Member Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb <em>Cb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getApplicableServices <em>Applicable Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataSetMemberOf()
 * @model extendedMetaData="name='tDataSetMemberOf' kind='empty'"
 * @generated
 */
public interface DataSetMemberOf extends EObject {
    /**
     * Returns the value of the '<em><b>Cb</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cb</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @see #isSetCb()
     * @see #unsetCb()
     * @see #setCb(CBKind)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataSetMemberOf_Cb()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='cb'"
     * @generated
     */
    CBKind getCb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cb</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @see #isSetCb()
     * @see #unsetCb()
     * @see #getCb()
     * @generated
     */
    void setCb( CBKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCb()
     * @see #getCb()
     * @see #setCb(CBKind)
     * @generated
     */
    void unsetCb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb <em>Cb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cb</em>' attribute is set.
     * @see #unsetCb()
     * @see #getCb()
     * @see #setCb(CBKind)
     * @generated
     */
    boolean isSetCb();

    /**
     * Returns the value of the '<em><b>Applicable Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicable Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Services</em>' container reference.
     * @see #setApplicableServices(ApplicableServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataSetMemberOf_ApplicableServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf
     * @model opposite="dataSetMemberOf" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ApplicableServices getApplicableServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getApplicableServices <em>Applicable Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applicable Services</em>' container reference.
     * @see #getApplicableServices()
     * @generated
     */
    void setApplicableServices( ApplicableServices value );

} // DataSetMemberOf
