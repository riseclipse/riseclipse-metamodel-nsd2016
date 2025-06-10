/*
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag NSD Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdVersion <em>Nsd Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRevision <em>Nsd Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRelease <em>Nsd Release</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSDIdentification()
 * @model abstract="true"
 * @generated
 */
public interface AgNSDIdentification extends EObject {
    /**
     * Returns the value of the '<em><b>Nsd Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nsd Version</em>' attribute.
     * @see #isSetNsdVersion()
     * @see #unsetNsdVersion()
     * @see #setNsdVersion(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSDIdentification_NsdVersion()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='nsdVersion'"
     * @generated
     */
    Integer getNsdVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdVersion <em>Nsd Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nsd Version</em>' attribute.
     * @see #isSetNsdVersion()
     * @see #unsetNsdVersion()
     * @see #getNsdVersion()
     * @generated
     */
    void setNsdVersion( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdVersion <em>Nsd Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNsdVersion()
     * @see #getNsdVersion()
     * @see #setNsdVersion(Integer)
     * @generated
     */
    void unsetNsdVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdVersion <em>Nsd Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nsd Version</em>' attribute is set.
     * @see #unsetNsdVersion()
     * @see #getNsdVersion()
     * @see #setNsdVersion(Integer)
     * @generated
     */
    boolean isSetNsdVersion();

    /**
     * Returns the value of the '<em><b>Nsd Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nsd Revision</em>' attribute.
     * @see #isSetNsdRevision()
     * @see #unsetNsdRevision()
     * @see #setNsdRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSDIdentification_NsdRevision()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='nsdRevision'"
     * @generated
     */
    String getNsdRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRevision <em>Nsd Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nsd Revision</em>' attribute.
     * @see #isSetNsdRevision()
     * @see #unsetNsdRevision()
     * @see #getNsdRevision()
     * @generated
     */
    void setNsdRevision( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRevision <em>Nsd Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNsdRevision()
     * @see #getNsdRevision()
     * @see #setNsdRevision(String)
     * @generated
     */
    void unsetNsdRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRevision <em>Nsd Revision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nsd Revision</em>' attribute is set.
     * @see #unsetNsdRevision()
     * @see #getNsdRevision()
     * @see #setNsdRevision(String)
     * @generated
     */
    boolean isSetNsdRevision();

    /**
     * Returns the value of the '<em><b>Nsd Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nsd Release</em>' attribute.
     * @see #isSetNsdRelease()
     * @see #unsetNsdRelease()
     * @see #setNsdRelease(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgNSDIdentification_NsdRelease()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='nsdRelease'"
     * @generated
     */
    Integer getNsdRelease();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRelease <em>Nsd Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nsd Release</em>' attribute.
     * @see #isSetNsdRelease()
     * @see #unsetNsdRelease()
     * @see #getNsdRelease()
     * @generated
     */
    void setNsdRelease( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRelease <em>Nsd Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNsdRelease()
     * @see #getNsdRelease()
     * @see #setNsdRelease(Integer)
     * @generated
     */
    void unsetNsdRelease();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification#getNsdRelease <em>Nsd Release</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nsd Release</em>' attribute is set.
     * @see #unsetNsdRelease()
     * @see #getNsdRelease()
     * @see #setNsdRelease(Integer)
     * @generated
     */
    boolean isSetNsdRelease();

} // AgNSDIdentification
