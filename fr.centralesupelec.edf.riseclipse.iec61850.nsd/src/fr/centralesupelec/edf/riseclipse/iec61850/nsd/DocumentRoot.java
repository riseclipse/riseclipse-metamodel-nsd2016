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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS <em>Applicable Service NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS <em>NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc <em>NS Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap< String, String > getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap< String, String > getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Applicable Service NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Service NS</em>' containment reference.
     * @see #isSetApplicableServiceNS()
     * @see #unsetApplicableServiceNS()
     * @see #setApplicableServiceNS(ApplicableServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_ApplicableServiceNS()
     * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ApplicableServiceNS' namespace='##targetNamespace'"
     * @generated
     */
    ApplicableServiceNS getApplicableServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS <em>Applicable Service NS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applicable Service NS</em>' containment reference.
     * @see #isSetApplicableServiceNS()
     * @see #unsetApplicableServiceNS()
     * @see #getApplicableServiceNS()
     * @generated
     */
    void setApplicableServiceNS( ApplicableServiceNS value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS <em>Applicable Service NS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApplicableServiceNS()
     * @see #getApplicableServiceNS()
     * @see #setApplicableServiceNS(ApplicableServiceNS)
     * @generated
     */
    void unsetApplicableServiceNS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS <em>Applicable Service NS</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Applicable Service NS</em>' containment reference is set.
     * @see #unsetApplicableServiceNS()
     * @see #getApplicableServiceNS()
     * @see #setApplicableServiceNS(ApplicableServiceNS)
     * @generated
     */
    boolean isSetApplicableServiceNS();

    /**
     * Returns the value of the '<em><b>NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>NS</em>' containment reference.
     * @see #isSetNS()
     * @see #unsetNS()
     * @see #setNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_NS()
     * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='NS' namespace='##targetNamespace'"
     * @generated
     */
    NS getNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS <em>NS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NS</em>' containment reference.
     * @see #isSetNS()
     * @see #unsetNS()
     * @see #getNS()
     * @generated
     */
    void setNS( NS value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS <em>NS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNS()
     * @see #getNS()
     * @see #setNS(NS)
     * @generated
     */
    void unsetNS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS <em>NS</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NS</em>' containment reference is set.
     * @see #unsetNS()
     * @see #getNS()
     * @see #setNS(NS)
     * @generated
     */
    boolean isSetNS();

    /**
     * Returns the value of the '<em><b>NS Doc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>NS Doc</em>' containment reference.
     * @see #isSetNSDoc()
     * @see #unsetNSDoc()
     * @see #setNSDoc(NSDoc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_NSDoc()
     * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='NSDoc' namespace='##targetNamespace'"
     * @generated
     */
    NSDoc getNSDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc <em>NS Doc</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NS Doc</em>' containment reference.
     * @see #isSetNSDoc()
     * @see #unsetNSDoc()
     * @see #getNSDoc()
     * @generated
     */
    void setNSDoc( NSDoc value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc <em>NS Doc</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNSDoc()
     * @see #getNSDoc()
     * @see #setNSDoc(NSDoc)
     * @generated
     */
    void unsetNSDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc <em>NS Doc</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NS Doc</em>' containment reference is set.
     * @see #unsetNSDoc()
     * @see #getNSDoc()
     * @see #setNSDoc(NSDoc)
     * @generated
     */
    boolean isSetNSDoc();

    /**
     * Returns the value of the '<em><b>Service NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service NS</em>' containment reference.
     * @see #isSetServiceNS()
     * @see #unsetServiceNS()
     * @see #setServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentRoot_ServiceNS()
     * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ServiceNS' namespace='##targetNamespace'"
     * @generated
     */
    ServiceNS getServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS <em>Service NS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service NS</em>' containment reference.
     * @see #isSetServiceNS()
     * @see #unsetServiceNS()
     * @see #getServiceNS()
     * @generated
     */
    void setServiceNS( ServiceNS value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS <em>Service NS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceNS()
     * @see #getServiceNS()
     * @see #setServiceNS(ServiceNS)
     * @generated
     */
    void unsetServiceNS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS <em>Service NS</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service NS</em>' containment reference is set.
     * @see #unsetServiceNS()
     * @see #getServiceNS()
     * @see #setServiceNS(ServiceNS)
     * @generated
     */
    boolean isSetServiceNS();

} // DocumentRoot
