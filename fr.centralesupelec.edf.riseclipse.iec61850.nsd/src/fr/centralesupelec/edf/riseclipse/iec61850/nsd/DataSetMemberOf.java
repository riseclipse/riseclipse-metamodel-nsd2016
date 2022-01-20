/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getParentApplicableServices <em>Parent Applicable Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataSetMemberOf()
 * @model extendedMetaData="name='tDataSetMemberOf' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cbAttributeRequired'"
 * @generated
 */
public interface DataSetMemberOf extends NsdObject {
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
     * Returns the value of the '<em><b>Parent Applicable Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Applicable Services</em>' container reference.
     * @see #setParentApplicableServices(ApplicableServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataSetMemberOf_ParentApplicableServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf
     * @model opposite="dataSetMemberOf" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ApplicableServices getParentApplicableServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getParentApplicableServices <em>Parent Applicable Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Applicable Services</em>' container reference.
     * @see #getParentApplicableServices()
     * @generated
     */
    void setParentApplicableServices( ApplicableServices value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The cb attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.cb &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean cbAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // DataSetMemberOf
