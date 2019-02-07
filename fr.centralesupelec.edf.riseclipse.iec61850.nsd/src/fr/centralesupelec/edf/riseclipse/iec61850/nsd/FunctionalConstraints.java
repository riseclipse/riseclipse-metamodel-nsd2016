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
 * A representation of the model object '<em><b>Functional Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getNS <em>NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints()
 * @model extendedMetaData="name='tFunctionalConstraints' kind='elementOnly'"
 * @generated
 */
public interface FunctionalConstraints extends NsdObject {
    /**
     * Returns the value of the '<em><b>Functional Constraint</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functional Constraint</em>' containment reference list.
     * @see #isSetFunctionalConstraint()
     * @see #unsetFunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints_FunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getFunctionalConstraints
     * @model opposite="functionalConstraints" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalConstraint' namespace='##targetNamespace'"
     * @generated
     */
    EList< FunctionalConstraint > getFunctionalConstraint();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalConstraint()
     * @see #getFunctionalConstraint()
     * @generated
     */
    void unsetFunctionalConstraint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Functional Constraint</em>' containment reference list is set.
     * @see #unsetFunctionalConstraint()
     * @see #getFunctionalConstraint()
     * @generated
     */
    boolean isSetFunctionalConstraint();

    /**
     * Returns the value of the '<em><b>NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NS</em>' container reference.
     * @see #setNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints_NS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints
     * @model opposite="functionalConstraints" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getNS <em>NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NS</em>' container reference.
     * @see #getNS()
     * @generated
     */
    void setNS( NS value );

    /**
     * Returns the value of the '<em><b>Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service NS</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service NS</em>' container reference.
     * @see #setServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints_ServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints
     * @model opposite="functionalConstraints" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getServiceNS <em>Service NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service NS</em>' container reference.
     * @see #getServiceNS()
     * @generated
     */
    void setServiceNS( ServiceNS value );

} // FunctionalConstraints
