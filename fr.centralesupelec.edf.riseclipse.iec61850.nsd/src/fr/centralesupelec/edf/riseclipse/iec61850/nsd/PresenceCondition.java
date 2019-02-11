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
 * A representation of the model object '<em><b>Presence Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getPresenceConditions <em>Presence Conditions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition()
 * @model extendedMetaData="name='tPresenceCondition' kind='empty'"
 * @generated
 */
public interface PresenceCondition extends EObject {
    /**
     * Returns the value of the '<em><b>Argument</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Argument</em>' attribute.
     * @see #isSetArgument()
     * @see #unsetArgument()
     * @see #setArgument(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_Argument()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='argument'"
     * @generated
     */
    String getArgument();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Argument</em>' attribute.
     * @see #isSetArgument()
     * @see #unsetArgument()
     * @see #getArgument()
     * @generated
     */
    void setArgument( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArgument()
     * @see #getArgument()
     * @see #setArgument(String)
     * @generated
     */
    void unsetArgument();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Argument</em>' attribute is set.
     * @see #unsetArgument()
     * @see #getArgument()
     * @see #setArgument(String)
     * @generated
     */
    boolean isSetArgument();

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title ID</em>' attribute.
     * @see #isSetTitleID()
     * @see #unsetTitleID()
     * @see #setTitleID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_TitleID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='titleID'"
     * @generated
     */
    String getTitleID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTitleID()
     * @see #getTitleID()
     * @see #setTitleID(String)
     * @generated
     */
    void unsetTitleID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Presence Conditions</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Presence Conditions</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presence Conditions</em>' container reference.
     * @see #setPresenceConditions(PresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceCondition_PresenceConditions()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition
     * @model opposite="presenceCondition" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    PresenceConditions getPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getPresenceConditions <em>Presence Conditions</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Presence Conditions</em>' container reference.
     * @see #getPresenceConditions()
     * @generated
     */
    void setPresenceConditions( PresenceConditions value );

} // PresenceCondition
