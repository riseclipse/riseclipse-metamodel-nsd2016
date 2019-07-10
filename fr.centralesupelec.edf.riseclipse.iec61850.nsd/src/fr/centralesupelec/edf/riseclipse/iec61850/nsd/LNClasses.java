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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses()
 * @model extendedMetaData="name='tLNClasses' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueAbstractLNClass uniqueLNClass'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueAbstractLNClass='Tuple {\n\tmessage : String = \'Within an NS, there shall not be two AbstractLNClass sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.abstractLNClass-&gt;isUnique( c : AbstractLNClass | c.name )\n}.status' uniqueLNClass='Tuple {\n\tmessage : String = \'Within an NS, there shall not be two LNClass sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.lNClass-&gt;isUnique( c : LNClass | c.name )\n}.status'"
 * @generated
 */
public interface LNClasses extends NsdObject {
    /**
     * Returns the value of the '<em><b>Abstract LN Class</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getParentLNClasses <em>Parent LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract LN Class</em>' containment reference list.
     * @see #isSetAbstractLNClass()
     * @see #unsetAbstractLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses_AbstractLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getParentLNClasses
     * @model opposite="parentLNClasses" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getParentLNClasses <em>Parent LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN Class</em>' containment reference list.
     * @see #isSetLNClass()
     * @see #unsetLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses_LNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getParentLNClasses
     * @model opposite="parentLNClasses" containment="true" unsettable="true" ordered="false"
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
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getLNClasses_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses
     * @model opposite="lNClasses" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

} // LNClasses
