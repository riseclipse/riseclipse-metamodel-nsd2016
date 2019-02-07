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
 * A representation of the model object '<em><b>LN Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass <em>Abstract LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass <em>LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getNS <em>NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses()
 * @model extendedMetaData="name='tLNClasses' kind='elementOnly'"
 * @generated
 */
public interface LNClasses extends NsdObject {
    /**
     * Returns the value of the '<em><b>Abstract LN Class</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract LN Class</em>' containment reference list.
     * @see #isSetAbstractLNClass()
     * @see #unsetAbstractLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses_AbstractLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getLNClasses
     * @model opposite="lNClasses" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AbstractLNClass' namespace='##targetNamespace'"
     * @generated
     */
    EList< AbstractLNClass > getAbstractLNClass();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass <em>Abstract LN Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbstractLNClass()
     * @see #getAbstractLNClass()
     * @generated
     */
    void unsetAbstractLNClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass <em>Abstract LN Class</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abstract LN Class</em>' containment reference list is set.
     * @see #unsetAbstractLNClass()
     * @see #getAbstractLNClass()
     * @generated
     */
    boolean isSetAbstractLNClass();

    /**
     * Returns the value of the '<em><b>LN Class</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN Class</em>' containment reference list.
     * @see #isSetLNClass()
     * @see #unsetLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses_LNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getLNClasses
     * @model opposite="lNClasses" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='LNClass' namespace='##targetNamespace'"
     * @generated
     */
    EList< LNClass > getLNClass();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass <em>LN Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNClass()
     * @see #getLNClass()
     * @generated
     */
    void unsetLNClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass <em>LN Class</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LN Class</em>' containment reference list is set.
     * @see #unsetLNClass()
     * @see #getLNClass()
     * @generated
     */
    boolean isSetLNClass();

    /**
     * Returns the value of the '<em><b>NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NS</em>' container reference.
     * @see #setNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses_NS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses
     * @model opposite="lNClasses" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getNS <em>NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NS</em>' container reference.
     * @see #getNS()
     * @generated
     */
    void setNS( NS value );

} // LNClasses
