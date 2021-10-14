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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID <em>Changes ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate <em>Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues <em>Tissues</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentServiceNS <em>Parent Service NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges()
 * @model extendedMetaData="name='tChanges' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='versionAttributeRequired'"
 * @generated
 */
public interface Changes extends NsdObject {
    /**
     * Returns the value of the '<em><b>Changes ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changes ID</em>' attribute.
     * @see #isSetChangesID()
     * @see #unsetChangesID()
     * @see #setChangesID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_ChangesID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='changesID'"
     * @generated
     */
    String getChangesID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID <em>Changes ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changes ID</em>' attribute.
     * @see #isSetChangesID()
     * @see #unsetChangesID()
     * @see #getChangesID()
     * @generated
     */
    void setChangesID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID <em>Changes ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangesID()
     * @see #getChangesID()
     * @see #setChangesID(String)
     * @generated
     */
    void unsetChangesID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID <em>Changes ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changes ID</em>' attribute is set.
     * @see #unsetChangesID()
     * @see #getChangesID()
     * @see #setChangesID(String)
     * @generated
     */
    boolean isSetChangesID();

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #isSetDate()
     * @see #unsetDate()
     * @see #setDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_Date()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Date"
     *        extendedMetaData="kind='attribute' name='date'"
     * @generated
     */
    XMLGregorianCalendar getDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate <em>Date</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDate()
     * @see #getDate()
     * @see #setDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate <em>Date</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * The default value is <code>"A"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_Revision()
     * @model default="A" unsettable="true"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #getRevision()
     * @generated
     */
    void setRevision( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision <em>Revision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Revision</em>' attribute is set.
     * @see #unsetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    boolean isSetRevision();

    /**
     * Returns the value of the '<em><b>Tissues</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tissues</em>' attribute.
     * @see #isSetTissues()
     * @see #unsetTissues()
     * @see #setTissues(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_Tissues()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='tissues'"
     * @generated
     */
    String getTissues();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues <em>Tissues</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tissues</em>' attribute.
     * @see #isSetTissues()
     * @see #unsetTissues()
     * @see #getTissues()
     * @generated
     */
    void setTissues( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues <em>Tissues</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTissues()
     * @see #getTissues()
     * @see #setTissues(String)
     * @generated
     */
    void unsetTissues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues <em>Tissues</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tissues</em>' attribute is set.
     * @see #unsetTissues()
     * @see #getTissues()
     * @see #setTissues(String)
     * @generated
     */
    boolean isSetTissues();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges
     * @model opposite="changes" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

    /**
     * Returns the value of the '<em><b>Parent Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service NS</em>' container reference.
     * @see #setParentServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_ParentServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges
     * @model opposite="changes" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getParentServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentServiceNS <em>Parent Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service NS</em>' container reference.
     * @see #getParentServiceNS()
     * @generated
     */
    void setParentServiceNS( ServiceNS value );

    /**
     * Returns the value of the '<em><b>Release</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Release</em>' attribute.
     * @see #isSetRelease()
     * @see #unsetRelease()
     * @see #setRelease(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_Release()
     * @model default="1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='release'"
     * @generated
     */
    Integer getRelease();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Release</em>' attribute.
     * @see #isSetRelease()
     * @see #unsetRelease()
     * @see #getRelease()
     * @generated
     */
    void setRelease( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelease()
     * @see #getRelease()
     * @see #setRelease(Integer)
     * @generated
     */
    void unsetRelease();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease <em>Release</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Release</em>' attribute is set.
     * @see #unsetRelease()
     * @see #getRelease()
     * @see #setRelease(Integer)
     * @generated
     */
    boolean isSetRelease();

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getChanges_Version()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    Integer getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #getVersion()
     * @generated
     */
    void setVersion( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(Integer)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(Integer)
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

} // Changes
