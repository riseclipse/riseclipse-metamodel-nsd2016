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
 * A representation of the model object '<em><b>Copyright Notice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice <em>Notice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense <em>License</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getCopyrighted <em>Copyrighted</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrightNotice()
 * @model extendedMetaData="name='tCopyrightNotice' kind='elementOnly'"
 * @generated
 */
public interface CopyrightNotice extends EObject {
    /**
     * Returns the value of the '<em><b>Notice</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getCopyrightNotice <em>Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notice</em>' containment reference.
     * @see #isSetNotice()
     * @see #unsetNotice()
     * @see #setNotice(Notice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrightNotice_Notice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getCopyrightNotice
     * @model opposite="copyrightNotice" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Notice' namespace='##targetNamespace'"
     * @generated
     */
    Notice getNotice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice <em>Notice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notice</em>' containment reference.
     * @see #isSetNotice()
     * @see #unsetNotice()
     * @see #getNotice()
     * @generated
     */
    void setNotice( Notice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice <em>Notice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNotice()
     * @see #getNotice()
     * @see #setNotice(Notice)
     * @generated
     */
    void unsetNotice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice <em>Notice</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Notice</em>' containment reference is set.
     * @see #unsetNotice()
     * @see #getNotice()
     * @see #setNotice(Notice)
     * @generated
     */
    boolean isSetNotice();

    /**
     * Returns the value of the '<em><b>License</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getCopyrightNotice <em>Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>License</em>' containment reference.
     * @see #isSetLicense()
     * @see #unsetLicense()
     * @see #setLicense(License)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrightNotice_License()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getCopyrightNotice
     * @model opposite="copyrightNotice" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='License' namespace='##targetNamespace'"
     * @generated
     */
    License getLicense();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense <em>License</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>License</em>' containment reference.
     * @see #isSetLicense()
     * @see #unsetLicense()
     * @see #getLicense()
     * @generated
     */
    void setLicense( License value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense <em>License</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLicense()
     * @see #getLicense()
     * @see #setLicense(License)
     * @generated
     */
    void unsetLicense();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense <em>License</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>License</em>' containment reference is set.
     * @see #unsetLicense()
     * @see #getLicense()
     * @see #setLicense(License)
     * @generated
     */
    boolean isSetLicense();

    /**
     * Returns the value of the '<em><b>Copyrighted</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Copyrighted</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Copyrighted</em>' container reference.
     * @see #setCopyrighted(Copyrighted)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCopyrightNotice_Copyrighted()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright
     * @model opposite="copyright" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Copyrighted getCopyrighted();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getCopyrighted <em>Copyrighted</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Copyrighted</em>' container reference.
     * @see #getCopyrighted()
     * @generated
     */
    void setCopyrighted( Copyrighted value );

} // CopyrightNotice
