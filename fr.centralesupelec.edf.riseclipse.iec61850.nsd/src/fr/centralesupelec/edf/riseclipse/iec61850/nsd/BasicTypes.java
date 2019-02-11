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

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getNS <em>NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicTypes()
 * @model extendedMetaData="name='tBasicTypes' kind='elementOnly'"
 * @generated
 */
public interface BasicTypes extends EObject {
    /**
     * Returns the value of the '<em><b>Basic Type</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getBasicTypes <em>Basic Types</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getBasicTypes
     * @model opposite="basicTypes" containment="true" unsettable="true" ordered="false"
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
     * Returns the value of the '<em><b>NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NS</em>' container reference.
     * @see #setNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicTypes_NS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes
     * @model opposite="basicTypes" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getNS <em>NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NS</em>' container reference.
     * @see #getNS()
     * @generated
     */
    void setNS( NS value );

} // BasicTypes
