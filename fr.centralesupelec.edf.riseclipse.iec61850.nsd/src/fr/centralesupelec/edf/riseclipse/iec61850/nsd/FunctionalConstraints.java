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
 * A representation of the model object '<em><b>Functional Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints()
 * @model extendedMetaData="name='tFunctionalConstraints' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueFunctionalConstraint'"
 * @generated
 */
public interface FunctionalConstraints extends NsdObject {
    /**
     * Returns the value of the '<em><b>Functional Constraint</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getParentFunctionalConstraints <em>Parent Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functional Constraint</em>' containment reference list.
     * @see #isSetFunctionalConstraint()
     * @see #unsetFunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints_FunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getParentFunctionalConstraints
     * @model opposite="parentFunctionalConstraints" containment="true" unsettable="true" ordered="false"
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
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints
     * @model opposite="functionalConstraints" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

    /**
     * Returns the value of the '<em><b>Parent Service NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service NS</em>' container reference.
     * @see #setParentServiceNS(ServiceNS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getFunctionalConstraints_ParentServiceNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints
     * @model opposite="functionalConstraints" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceNS getParentServiceNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentServiceNS <em>Parent Service NS</em>}' container reference.
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
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'There shall not be two FunctionalConstraint elements with same abbreviation.\',\n\tstatus : Boolean = \n\t\t\tself.functionalConstraint-&gt;isUnique( f : FunctionalConstraint | f.abbreviation )\n}.status'"
     * @generated
     */
    boolean uniqueFunctionalConstraint( DiagnosticChain diagnostics, Map< Object, Object > context );

} // FunctionalConstraints
