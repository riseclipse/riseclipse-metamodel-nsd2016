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
 * A representation of the model object '<em><b>Service Ns Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getApplicableServiceNS <em>Applicable Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage()
 * @model extendedMetaData="name='tServiceNsUsage' kind='elementOnly'"
 * @generated
 */
public interface ServiceNsUsage extends NSDObjectWithVersionAndRelease {
    /**
     * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applies To</em>' containment reference list.
     * @see #isSetAppliesTo()
     * @see #unsetAppliesTo()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_AppliesTo()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getServiceNsUsage
     * @model opposite="serviceNsUsage" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
     * @generated
     */
    EList< AppliesToType > getAppliesTo();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppliesTo()
     * @see #getAppliesTo()
     * @generated
     */
    void unsetAppliesTo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Applies To</em>' containment reference list is set.
     * @see #unsetAppliesTo()
     * @see #getAppliesTo()
     * @generated
     */
    boolean isSetAppliesTo();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_Id()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #getId()
     * @generated
     */
    void setId( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getId <em>Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Id</em>' attribute is set.
     * @see #unsetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    boolean isSetId();

    /**
     * Returns the value of the '<em><b>Publication Stage</b></em>' attribute.
     * The default value is <code>"IS"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    PubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @generated
     */
    void setPublicationStage( PubStage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getPublicationStage <em>Publication Stage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Publication Stage</em>' attribute is set.
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    boolean isSetPublicationStage();

    /**
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * The default value is <code>"A"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_Revision()
     * @model default="A" unsettable="true"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRevision <em>Revision</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Applicable Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicable Service NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Service NS</em>' container reference.
     * @see #setApplicableServiceNS(ApplicableServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNsUsage_ApplicableServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage
     * @model opposite="serviceNsUsage" unsettable="true" ordered="false"
     * @generated
     */
    ApplicableServiceNS getApplicableServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getApplicableServiceNS <em>Applicable Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applicable Service NS</em>' container reference.
     * @see #getApplicableServiceNS()
     * @generated
     */
    void setApplicableServiceNS( ApplicableServiceNS value );

} // ServiceNsUsage
