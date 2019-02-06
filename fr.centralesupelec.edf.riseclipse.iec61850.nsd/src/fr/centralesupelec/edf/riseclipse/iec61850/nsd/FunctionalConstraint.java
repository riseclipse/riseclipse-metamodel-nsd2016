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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint()
 * @model extendedMetaData="name='tFunctionalConstraint' kind='elementOnly'"
 * @generated
 */
public interface FunctionalConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Applicable Services</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getFunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicable Services</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicable Services</em>' containment reference.
     * @see #isSetApplicableServices()
     * @see #unsetApplicableServices()
     * @see #setApplicableServices(ApplicableServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_ApplicableServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getFunctionalConstraint
     * @model opposite="functionalConstraint" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ApplicableServices' namespace='##targetNamespace'"
     * @generated
     */
    ApplicableServices getApplicableServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applicable Services</em>' containment reference.
     * @see #isSetApplicableServices()
     * @see #unsetApplicableServices()
     * @see #getApplicableServices()
     * @generated
     */
    void setApplicableServices( ApplicableServices value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApplicableServices()
     * @see #getApplicableServices()
     * @see #setApplicableServices(ApplicableServices)
     * @generated
     */
    void unsetApplicableServices();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Applicable Services</em>' containment reference is set.
     * @see #unsetApplicableServices()
     * @see #getApplicableServices()
     * @see #setApplicableServices(ApplicableServices)
     * @generated
     */
    boolean isSetApplicableServices();

    /**
     * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbreviation</em>' attribute.
     * @see #isSetAbbreviation()
     * @see #unsetAbbreviation()
     * @see #setAbbreviation(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_Abbreviation()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='abbreviation'"
     * @generated
     */
    String getAbbreviation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviation</em>' attribute.
     * @see #isSetAbbreviation()
     * @see #unsetAbbreviation()
     * @see #getAbbreviation()
     * @generated
     */
    void setAbbreviation( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbbreviation()
     * @see #getAbbreviation()
     * @see #setAbbreviation(String)
     * @generated
     */
    void unsetAbbreviation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abbreviation</em>' attribute is set.
     * @see #unsetAbbreviation()
     * @see #getAbbreviation()
     * @see #setAbbreviation(String)
     * @generated
     */
    boolean isSetAbbreviation();

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #getDescID()
     * @generated
     */
    void setDescID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Desc ID</em>' attribute is set.
     * @see #unsetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    boolean isSetDescID();

    /**
     * Returns the value of the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title ID</em>' attribute.
     * @see #isSetTitleID()
     * @see #unsetTitleID()
     * @see #setTitleID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_TitleID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='titleID'"
     * @generated
     */
    String getTitleID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title ID</em>' attribute.
     * @see #isSetTitleID()
     * @see #unsetTitleID()
     * @see #getTitleID()
     * @generated
     */
    void setTitleID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTitleID()
     * @see #getTitleID()
     * @see #setTitleID(String)
     * @generated
     */
    void unsetTitleID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Title ID</em>' attribute is set.
     * @see #unsetTitleID()
     * @see #getTitleID()
     * @see #setTitleID(String)
     * @generated
     */
    boolean isSetTitleID();

    /**
     * Returns the value of the '<em><b>Functional Constraints</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Functional Constraints</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functional Constraints</em>' container reference.
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraint_FunctionalConstraints()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint
     * @model opposite="functionalConstraint" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    FunctionalConstraints getFunctionalConstraints();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getFunctionalConstraints <em>Functional Constraints</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Functional Constraints</em>' container reference.
     * @see #getFunctionalConstraints()
     * @generated
     */
    void setFunctionalConstraints( FunctionalConstraints value );

} // FunctionalConstraint
