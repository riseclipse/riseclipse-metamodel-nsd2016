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
 * A representation of the model object '<em><b>Constructed Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttributes()
 * @model extendedMetaData="name='tConstructedAttributes' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueConstructedAttribute'"
 * @generated
 */
public interface ConstructedAttributes extends NsdObject {
    /**
     * Returns the value of the '<em><b>Constructed Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentConstructedAttributes <em>Parent Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constructed Attribute</em>' containment reference list.
     * @see #isSetConstructedAttribute()
     * @see #unsetConstructedAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttributes_ConstructedAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentConstructedAttributes
     * @model opposite="parentConstructedAttributes" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ConstructedAttribute' namespace='##targetNamespace'"
     * @generated
     */
    EList< ConstructedAttribute > getConstructedAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConstructedAttribute()
     * @see #getConstructedAttribute()
     * @generated
     */
    void unsetConstructedAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Constructed Attribute</em>' containment reference list is set.
     * @see #unsetConstructedAttribute()
     * @see #getConstructedAttribute()
     * @generated
     */
    boolean isSetConstructedAttribute();

    /**
     * Returns the value of the '<em><b>Parent NS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS</em>' container reference.
     * @see #setParentNS(NS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttributes_ParentNS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes
     * @model opposite="constructedAttributes" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NS getParentNS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getParentNS <em>Parent NS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS</em>' container reference.
     * @see #getParentNS()
     * @generated
     */
    void setParentNS( NS value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Within an NS, there shall not be two ConstructedAttribute sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: DependsOn NS should be taken into account ?\n\t\t\t-- For this, explicit links have to be created first\n\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n\t\t\tself.constructedAttribute-&gt;isUnique( c : ConstructedAttribute | c.name )\n}.status'"
     * @generated
     */
    boolean uniqueConstructedAttribute( DiagnosticChain diagnostics, Map< Object, Object > context );

} // ConstructedAttributes
