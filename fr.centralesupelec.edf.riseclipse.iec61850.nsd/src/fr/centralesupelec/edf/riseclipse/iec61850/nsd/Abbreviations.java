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
 * A representation of the model object '<em><b>Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAbbreviations()
 * @model extendedMetaData="name='tAbbreviations' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueAbbreviation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueAbbreviation='Tuple {\n\tmessage : String = \'There shall not be two Abbreviations elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.abbreviation-&gt;isUnique( a : Abbreviation | a.name )\n}.status'"
 * @generated
 */
public interface Abbreviations extends NsdObject {
    /**
     * Returns the value of the '<em><b>Abbreviation</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getParentAbbreviations <em>Parent Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbreviation</em>' containment reference list.
     * @see #isSetAbbreviation()
     * @see #unsetAbbreviation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAbbreviations_Abbreviation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getParentAbbreviations
     * @model opposite="parentAbbreviations" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Abbreviation' namespace='##targetNamespace'"
     * @generated
     */
    EList< Abbreviation > getAbbreviation();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation <em>Abbreviation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbbreviation()
     * @see #getAbbreviation()
     * @generated
     */
    void unsetAbbreviation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation <em>Abbreviation</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abbreviation</em>' containment reference list is set.
     * @see #unsetAbbreviation()
     * @see #getAbbreviation()
     * @generated
     */
    boolean isSetAbbreviation();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAbbreviations_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations
     * @model opposite="abbreviations" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

    /**
     * Returns the value of the '<em><b>Parent Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service NS</em>' container reference.
     * @see #setParentServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAbbreviations_ParentServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations
     * @model opposite="abbreviations" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getParentServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentServiceNS <em>Parent Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service NS</em>' container reference.
     * @see #getParentServiceNS()
     * @generated
     */
    void setParentServiceNS( ServiceNS value );

} // Abbreviations
