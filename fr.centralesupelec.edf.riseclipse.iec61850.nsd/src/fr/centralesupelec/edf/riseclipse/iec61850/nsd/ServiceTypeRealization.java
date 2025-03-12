/**
 *  Copyright (c) 2016-2025 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the realization of an abstract type as constructed attribute in the service namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getRealize <em>Realize</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getParentServiceTypeRealizations <em>Parent Service Type Realizations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceTypeRealization()
 * @model extendedMetaData="name='tServiceTypeRealization' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='realizeAttributeRequired'"
 * @generated
 */
public interface ServiceTypeRealization extends ConstructedAttribute {
    /**
     * Returns the value of the '<em><b>Realize</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the ACSI type realized by this ServiceTypeRealization.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Realize</em>' attribute.
     * @see #setRealize(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceTypeRealization_Realize()
     * @model extendedMetaData="kind='attribute' name='realize'"
     * @generated
     */
    String getRealize();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getRealize <em>Realize</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Realize</em>' attribute.
     * @see #getRealize()
     * @generated
     */
    void setRealize( String value );

    /**
     * Returns the value of the '<em><b>Parent Service Type Realizations</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Type Realizations</em>' container reference.
     * @see #setParentServiceTypeRealizations(ServiceTypeRealizations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceTypeRealization_ParentServiceTypeRealizations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization
     * @model opposite="serviceTypeRealization" resolveProxies="false" unsettable="true"
     * @generated
     */
    ServiceTypeRealizations getParentServiceTypeRealizations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getParentServiceTypeRealizations <em>Parent Service Type Realizations</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Type Realizations</em>' container reference.
     * @see #getParentServiceTypeRealizations()
     * @generated
     */
    void setParentServiceTypeRealizations( ServiceTypeRealizations value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The realize attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.realize &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean realizeAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // ServiceTypeRealization
