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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a Functional Constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint()
 * @model extendedMetaData="name='tFunctionalConstraint' kind='elementOnly'"
 * @generated
 */
public interface FunctionalConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Applicable Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicable Services</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Services</em>' containment reference.
     * @see #setApplicableServices(ApplicableServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_ApplicableServices()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ApplicableServices' namespace='##targetNamespace'"
     * @generated
     */
    ApplicableServices getApplicableServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applicable Services</em>' containment reference.
     * @see #getApplicableServices()
     * @generated
     */
    void setApplicableServices( ApplicableServices value );

    /**
     * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Abbreviated name of the FC (e.g., ST, MX, etc.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Abbreviation</em>' attribute.
     * @see #setAbbreviation(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_Abbreviation()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='abbreviation'"
     * @generated
     */
    String getAbbreviation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviation</em>' attribute.
     * @see #getAbbreviation()
     * @generated
     */
    void setAbbreviation( String value );

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to a full description of this object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_DescID()
     * @model extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc ID</em>' attribute.
     * @see #getDescID()
     * @generated
     */
    void setDescID( String value );

    /**
     * Returns the value of the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to the title (alias) of this object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Title ID</em>' attribute.
     * @see #setTitleID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_TitleID()
     * @model extendedMetaData="kind='attribute' name='titleID'"
     * @generated
     */
    String getTitleID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title ID</em>' attribute.
     * @see #getTitleID()
     * @generated
     */
    void setTitleID( String value );

} // FunctionalConstraint
