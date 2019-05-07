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
 * A representation of the model object '<em><b>Enumerations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumerations()
 * @model extendedMetaData="name='tEnumerations' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueEnumeration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueEnumeration='Tuple {\n\tmessage : String = \'Within an NS, there shall not be two Enumeration sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: DependsOn NS should be taken into account ?\n\t\t\t-- For this, explicit links have to be created first\n\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n\t\t\tself.enumeration-&gt;isUnique( e : Enumeration | e.name )\n}.status'"
 * @generated
 */
public interface Enumerations extends NsdObject {
    /**
     * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getParentEnumerations <em>Parent Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration</em>' containment reference list.
     * @see #isSetEnumeration()
     * @see #unsetEnumeration()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumerations_Enumeration()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getParentEnumerations
     * @model opposite="parentEnumerations" containment="true" unsettable="true"
     *        extendedMetaData="kind='element' name='Enumeration' namespace='##targetNamespace'"
     * @generated
     */
    EList< Enumeration > getEnumeration();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnumeration()
     * @see #getEnumeration()
     * @generated
     */
    void unsetEnumeration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enumeration</em>' containment reference list is set.
     * @see #unsetEnumeration()
     * @see #getEnumeration()
     * @generated
     */
    boolean isSetEnumeration();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumerations_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations
     * @model opposite="enumerations" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

} // Enumerations