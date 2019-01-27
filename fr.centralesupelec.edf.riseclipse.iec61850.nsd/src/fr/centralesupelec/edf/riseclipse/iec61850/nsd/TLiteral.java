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
 * A representation of the model object '<em><b>TLiteral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a literal of an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getLiteralVal <em>Literal Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTLiteral()
 * @model extendedMetaData="name='tLiteral' kind='empty'"
 * @generated
 */
public interface TLiteral extends TDocumentedClass {
    /**
     * Returns the value of the '<em><b>Literal Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Enumeration literal integer value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Literal Val</em>' attribute.
     * @see #isSetLiteralVal()
     * @see #unsetLiteralVal()
     * @see #setLiteralVal(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTLiteral_LiteralVal()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='literalVal'"
     * @generated
     */
    int getLiteralVal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getLiteralVal <em>Literal Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Literal Val</em>' attribute.
     * @see #isSetLiteralVal()
     * @see #unsetLiteralVal()
     * @see #getLiteralVal()
     * @generated
     */
    void setLiteralVal( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getLiteralVal <em>Literal Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLiteralVal()
     * @see #getLiteralVal()
     * @see #setLiteralVal(int)
     * @generated
     */
    void unsetLiteralVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getLiteralVal <em>Literal Val</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Literal Val</em>' attribute is set.
     * @see #unsetLiteralVal()
     * @see #getLiteralVal()
     * @see #setLiteralVal(int)
     * @generated
     */
    boolean isSetLiteralVal();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the enumeration's literal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTLiteral_Name()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteralName" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

} // TLiteral
