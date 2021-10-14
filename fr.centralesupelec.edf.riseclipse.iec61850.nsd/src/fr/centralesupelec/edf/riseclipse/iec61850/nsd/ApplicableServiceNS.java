/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Service NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate <em>Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServiceNS()
 * @model extendedMetaData="name='tApplicableServiceNS' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dateAttributeRequired'"
 * @generated
 */
public interface ApplicableServiceNS extends Copyrighted {
    /**
     * Returns the value of the '<em><b>Service Ns Usage</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getParentApplicableServiceNS <em>Parent Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Ns Usage</em>' containment reference list.
     * @see #isSetServiceNsUsage()
     * @see #unsetServiceNsUsage()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServiceNS_ServiceNsUsage()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getParentApplicableServiceNS
     * @model opposite="parentApplicableServiceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceNsUsage' namespace='##targetNamespace'"
     * @generated
     */
    EList< ServiceNsUsage > getServiceNsUsage();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceNsUsage()
     * @see #getServiceNsUsage()
     * @generated
     */
    void unsetServiceNsUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Ns Usage</em>' containment reference list is set.
     * @see #unsetServiceNsUsage()
     * @see #getServiceNsUsage()
     * @generated
     */
    boolean isSetServiceNsUsage();

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #isSetDate()
     * @see #unsetDate()
     * @see #setDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServiceNS_Date()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='date'"
     * @generated
     */
    XMLGregorianCalendar getDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #isSetDate()
     * @see #unsetDate()
     * @see #getDate()
     * @generated
     */
    void setDate( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDate()
     * @see #getDate()
     * @see #setDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate <em>Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Date</em>' attribute is set.
     * @see #unsetDate()
     * @see #getDate()
     * @see #setDate(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetDate();

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getApplicableServiceNS_Version()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    long getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #getVersion()
     * @generated
     */
    void setVersion( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(long)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(long)
     * @generated
     */
    boolean isSetVersion();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The version attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.version &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean versionAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The date attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.date &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean dateAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // ApplicableServiceNS
