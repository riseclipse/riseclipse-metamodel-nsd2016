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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Trg Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isQchg <em>Qchg</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgTrgOp()
 * @model abstract="true"
 * @generated
 */
public interface AgTrgOp extends EObject {
    /**
     * Returns the value of the '<em><b>Dchg</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dchg</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dchg</em>' attribute.
     * @see #isSetDchg()
     * @see #unsetDchg()
     * @see #setDchg(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgTrgOp_Dchg()
     * @model default="false" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='dchg'"
     * @generated
     */
    boolean isDchg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDchg <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dchg</em>' attribute.
     * @see #isSetDchg()
     * @see #unsetDchg()
     * @see #isDchg()
     * @generated
     */
    void setDchg( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDchg <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDchg()
     * @see #isDchg()
     * @see #setDchg(boolean)
     * @generated
     */
    void unsetDchg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDchg <em>Dchg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dchg</em>' attribute is set.
     * @see #unsetDchg()
     * @see #isDchg()
     * @see #setDchg(boolean)
     * @generated
     */
    boolean isSetDchg();

    /**
     * Returns the value of the '<em><b>Dupd</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dupd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dupd</em>' attribute.
     * @see #isSetDupd()
     * @see #unsetDupd()
     * @see #setDupd(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgTrgOp_Dupd()
     * @model default="false" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='dupd'"
     * @generated
     */
    boolean isDupd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDupd <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dupd</em>' attribute.
     * @see #isSetDupd()
     * @see #unsetDupd()
     * @see #isDupd()
     * @generated
     */
    void setDupd( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDupd <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDupd()
     * @see #isDupd()
     * @see #setDupd(boolean)
     * @generated
     */
    void unsetDupd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDupd <em>Dupd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dupd</em>' attribute is set.
     * @see #unsetDupd()
     * @see #isDupd()
     * @see #setDupd(boolean)
     * @generated
     */
    boolean isSetDupd();

    /**
     * Returns the value of the '<em><b>Qchg</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qchg</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qchg</em>' attribute.
     * @see #isSetQchg()
     * @see #unsetQchg()
     * @see #setQchg(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgTrgOp_Qchg()
     * @model default="false" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='qchg'"
     * @generated
     */
    boolean isQchg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isQchg <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qchg</em>' attribute.
     * @see #isSetQchg()
     * @see #unsetQchg()
     * @see #isQchg()
     * @generated
     */
    void setQchg( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isQchg <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQchg()
     * @see #isQchg()
     * @see #setQchg(boolean)
     * @generated
     */
    void unsetQchg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isQchg <em>Qchg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qchg</em>' attribute is set.
     * @see #unsetQchg()
     * @see #isQchg()
     * @see #setQchg(boolean)
     * @generated
     */
    boolean isSetQchg();

} // AgTrgOp
