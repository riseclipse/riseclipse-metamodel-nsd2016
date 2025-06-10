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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getParentFunctionalConstraint <em>Parent Functional Constraint</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServices()
 * @model extendedMetaData="name='tApplicableServices' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueService'"
 * @generated
 */
public interface ApplicableServices extends NsdObject {
    /**
     * Returns the value of the '<em><b>Service</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getParentApplicableServices <em>Parent Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service</em>' containment reference list.
     * @see #isSetService()
     * @see #unsetService()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServices_Service()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getParentApplicableServices
     * @model opposite="parentApplicableServices" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
     * @generated
     */
    EList< ServiceType > getService();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService <em>Service</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetService()
     * @see #getService()
     * @generated
     */
    void unsetService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService <em>Service</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service</em>' containment reference list is set.
     * @see #unsetService()
     * @see #getService()
     * @generated
     */
    boolean isSetService();

    /**
     * Returns the value of the '<em><b>Data Set Member Of</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getParentApplicableServices <em>Parent Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Set Member Of</em>' containment reference list.
     * @see #isSetDataSetMemberOf()
     * @see #unsetDataSetMemberOf()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServices_DataSetMemberOf()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getParentApplicableServices
     * @model opposite="parentApplicableServices" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='DataSetMemberOf' namespace='##targetNamespace'"
     * @generated
     */
    EList< DataSetMemberOf > getDataSetMemberOf();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDataSetMemberOf()
     * @see #getDataSetMemberOf()
     * @generated
     */
    void unsetDataSetMemberOf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Set Member Of</em>' containment reference list is set.
     * @see #unsetDataSetMemberOf()
     * @see #getDataSetMemberOf()
     * @generated
     */
    boolean isSetDataSetMemberOf();

    /**
     * Returns the value of the '<em><b>Parent Functional Constraint</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Functional Constraint</em>' container reference.
     * @see #setParentFunctionalConstraint(FunctionalConstraint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServices_ParentFunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices
     * @model opposite="applicableServices" resolveProxies="false" unsettable="true"
     * @generated
     */
    FunctionalConstraint getParentFunctionalConstraint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getParentFunctionalConstraint <em>Parent Functional Constraint</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Functional Constraint</em>' container reference.
     * @see #getParentFunctionalConstraint()
     * @generated
     */
    void setParentFunctionalConstraint( FunctionalConstraint value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'For an ApplicableServices, there shall not be two DataSetMemberOf sub-elements with same cb.\',\n\tstatus : Boolean = \n\t\t\tself.dataSetMemberOf-&gt;isUnique( d : DataSetMemberOf | d.cb )\n}.status'"
     * @generated
     */
    boolean uniqueDataSetMemberOf( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'For an ApplicableServices, there shall not be two ServiceType sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.service-&gt;isUnique( s : ServiceType | s.name )\n}.status'"
     * @generated
     */
    boolean uniqueService( DiagnosticChain diagnostics, Map< Object, Object > context );

} // ApplicableServices
