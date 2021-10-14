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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicTypes()
 * @model extendedMetaData="name='tBasicTypes' kind='elementOnly'"
 * @generated
 */
public interface BasicTypes extends NsdObject {
    /**
     * Returns the value of the '<em><b>Basic Type</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getParentBasicTypes <em>Parent Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Type</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Type</em>' containment reference list.
     * @see #isSetBasicType()
     * @see #unsetBasicType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicTypes_BasicType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getParentBasicTypes
     * @model opposite="parentBasicTypes" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BasicType' namespace='##targetNamespace'"
     * @generated
     */
    EList< BasicType > getBasicType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType <em>Basic Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBasicType()
     * @see #getBasicType()
     * @generated
     */
    void unsetBasicType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType <em>Basic Type</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Basic Type</em>' containment reference list is set.
     * @see #unsetBasicType()
     * @see #getBasicType()
     * @generated
     */
    boolean isSetBasicType();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicTypes_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes
     * @model opposite="basicTypes" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

} // BasicTypes
