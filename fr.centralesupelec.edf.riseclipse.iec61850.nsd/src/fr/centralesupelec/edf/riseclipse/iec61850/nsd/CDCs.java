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
 * A representation of the model object '<em><b>CD Cs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDCs()
 * @model extendedMetaData="name='tCDCs' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCDC'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueCDC='Tuple {\n\tmessage : String = \'Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: DependsOn NS should be taken into account ?\n\t\t\t-- For this, explicit links have to be created first\n\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n\t\t\tself.cDC-&gt;select( c : CDC | c.variant = null )-&gt;isUnique( c : CDC | c.name )\n\t     or self.cDC-&gt;select( c : CDC | c.variant &lt;&gt; null )-&gt;forAll( c1, c2 : CDC | c1 &lt;&gt; c2 implies c1.name &lt;&gt; c2.name or c1.variant &lt;&gt; c2.variant )\n}.status'"
 * @generated
 */
public interface CDCs extends NsdObject {
    /**
     * Returns the value of the '<em><b>CDC</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParentCDCs <em>Parent CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>CDC</em>' containment reference list.
     * @see #isSetCDC()
     * @see #unsetCDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDCs_CDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParentCDCs
     * @model opposite="parentCDCs" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='CDC' namespace='##targetNamespace'"
     * @generated
     */
    EList< CDC > getCDC();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCDC()
     * @see #getCDC()
     * @generated
     */
    void unsetCDC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CDC</em>' containment reference list is set.
     * @see #unsetCDC()
     * @see #getCDC()
     * @generated
     */
    boolean isSetCDC();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getCDCs_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs
     * @model opposite="cDCs" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

} // CDCs
