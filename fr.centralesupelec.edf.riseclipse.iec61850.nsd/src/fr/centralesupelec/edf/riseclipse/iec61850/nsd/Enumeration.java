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
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration()
 * @model extendedMetaData="name='tEnumeration' kind='elementOnly'"
 * @generated
 */
public interface Enumeration extends TitledClass {
    /**
     * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Literal</em>' containment reference list.
     * @see #isSetLiteral()
     * @see #unsetLiteral()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_Literal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getEnumeration
     * @model opposite="enumeration" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Literal' namespace='##targetNamespace'"
     * @generated
     */
    EList< Literal > getLiteral();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLiteral()
     * @see #getLiteral()
     * @generated
     */
    void unsetLiteral();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Literal</em>' containment reference list is set.
     * @see #unsetLiteral()
     * @see #getLiteral()
     * @generated
     */
    boolean isSetLiteral();

    /**
     * Returns the value of the '<em><b>Inherited From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inherited From</em>' attribute.
     * @see #isSetInheritedFrom()
     * @see #unsetInheritedFrom()
     * @see #setInheritedFrom(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_InheritedFrom()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='inheritedFrom'"
     * @generated
     */
    String getInheritedFrom();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inherited From</em>' attribute.
     * @see #isSetInheritedFrom()
     * @see #unsetInheritedFrom()
     * @see #getInheritedFrom()
     * @generated
     */
    void setInheritedFrom( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInheritedFrom()
     * @see #getInheritedFrom()
     * @see #setInheritedFrom(String)
     * @generated
     */
    void unsetInheritedFrom();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inherited From</em>' attribute is set.
     * @see #unsetInheritedFrom()
     * @see #getInheritedFrom()
     * @see #setInheritedFrom(String)
     * @generated
     */
    boolean isSetInheritedFrom();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Enumerations</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumerations</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumerations</em>' container reference.
     * @see #setEnumerations(Enumerations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getEnumeration_Enumerations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration
     * @model opposite="enumeration" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Enumerations getEnumerations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getEnumerations <em>Enumerations</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumerations</em>' container reference.
     * @see #getEnumerations()
     * @generated
     */
    void setEnumerations( Enumerations value );

} // Enumeration
