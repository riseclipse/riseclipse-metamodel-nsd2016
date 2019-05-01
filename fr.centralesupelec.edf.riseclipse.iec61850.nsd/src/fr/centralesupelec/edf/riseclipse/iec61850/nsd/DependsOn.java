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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS <em>Refers To NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDependsOn()
 * @model extendedMetaData="name='DependsOn_._type' kind='empty'"
 * @generated
 */
public interface DependsOn extends NsdObject, AgNSIdentification {
    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDependsOn_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn
     * @model opposite="dependsOn" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

    /**
     * Returns the value of the '<em><b>Refers To NS</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn <em>Referred By Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To NS</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To NS</em>' reference.
     * @see #isSetRefersToNS()
     * @see #unsetRefersToNS()
     * @see #setRefersToNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDependsOn_RefersToNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn
     * @model opposite="referredByDependsOn" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    NS getRefersToNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS <em>Refers To NS</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To NS</em>' reference.
     * @see #isSetRefersToNS()
     * @see #unsetRefersToNS()
     * @see #getRefersToNS()
     * @generated
     */
    void setRefersToNS( NS value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS <em>Refers To NS</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToNS()
     * @see #getRefersToNS()
     * @see #setRefersToNS(NS)
     * @generated
     */
    void unsetRefersToNS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS <em>Refers To NS</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To NS</em>' reference is set.
     * @see #unsetRefersToNS()
     * @see #getRefersToNS()
     * @see #setRefersToNS(NS)
     * @generated
     */
    boolean isSetRefersToNS();

} // DependsOn
