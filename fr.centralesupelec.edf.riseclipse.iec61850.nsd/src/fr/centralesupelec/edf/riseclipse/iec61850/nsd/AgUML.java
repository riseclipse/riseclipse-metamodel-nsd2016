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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag UML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlVersion <em>Uml Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUML()
 * @model abstract="true"
 * @generated
 */
public interface AgUML extends EObject {
    /**
     * Returns the value of the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uml Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Date</em>' attribute.
     * @see #isSetUmlDate()
     * @see #unsetUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUML_UmlDate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Date</em>' attribute.
     * @see #isSetUmlDate()
     * @see #unsetUmlDate()
     * @see #getUmlDate()
     * @generated
     */
    void setUmlDate( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetUmlDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlDate <em>Uml Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Date</em>' attribute is set.
     * @see #unsetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetUmlDate();

    /**
     * Returns the value of the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uml Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Version</em>' attribute.
     * @see #isSetUmlVersion()
     * @see #unsetUmlVersion()
     * @see #setUmlVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAgUML_UmlVersion()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Version</em>' attribute.
     * @see #isSetUmlVersion()
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @generated
     */
    void setUmlVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    void unsetUmlVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlVersion <em>Uml Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Version</em>' attribute is set.
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    boolean isSetUmlVersion();

} // AgUML
