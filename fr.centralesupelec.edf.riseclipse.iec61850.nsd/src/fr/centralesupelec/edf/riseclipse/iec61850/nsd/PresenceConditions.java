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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions()
 * @model extendedMetaData="name='tPresenceConditions' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniquePresenceCondition'"
 * @generated
 */
public interface PresenceConditions extends NsdObject {
    /**
     * Returns the value of the '<em><b>Presence Condition</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getParentPresenceConditions <em>Parent Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presence Condition</em>' containment reference list.
     * @see #isSetPresenceCondition()
     * @see #unsetPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions_PresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getParentPresenceConditions
     * @model opposite="parentPresenceConditions" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='PresenceCondition' namespace='##targetNamespace'"
     * @generated
     */
    EList< PresenceCondition > getPresenceCondition();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresenceCondition()
     * @see #getPresenceCondition()
     * @generated
     */
    void unsetPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Presence Condition</em>' containment reference list is set.
     * @see #unsetPresenceCondition()
     * @see #getPresenceCondition()
     * @generated
     */
    boolean isSetPresenceCondition();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions
     * @model opposite="presenceConditions" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

    /**
     * Returns the value of the '<em><b>Parent Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service NS</em>' container reference.
     * @see #setParentServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getPresenceConditions_ParentServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions
     * @model opposite="presenceConditions" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getParentServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentServiceNS <em>Parent Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service NS</em>' container reference.
     * @see #getParentServiceNS()
     * @generated
     */
    void setParentServiceNS( ServiceNS value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'There shall not be two PresenceCondition elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.presenceCondition-&gt;isUnique( p : PresenceCondition | p.name )\n}.status'"
     * @generated
     */
    boolean uniquePresenceCondition( DiagnosticChain diagnostics, Map< Object, Object > context );

} // PresenceConditions
