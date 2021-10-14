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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc <em>Refers To Title Doc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTitledClass()
 * @model abstract="true"
 *        extendedMetaData="name='tTitledClass' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='titleIDAttributeRequired'"
 * @generated
 */
public interface TitledClass extends DocumentedClass {
    /**
     * Returns the value of the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title ID</em>' attribute.
     * @see #isSetTitleID()
     * @see #unsetTitleID()
     * @see #setTitleID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTitledClass_TitleID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='titleID'"
     * @generated
     */
    String getTitleID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTitleID()
     * @see #getTitleID()
     * @see #setTitleID(String)
     * @generated
     */
    void unsetTitleID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Refers To Title Doc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass <em>Referred By Titled Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Title Doc</em>' reference.
     * @see #isSetRefersToTitleDoc()
     * @see #unsetRefersToTitleDoc()
     * @see #setRefersToTitleDoc(Doc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTitledClass_RefersToTitleDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass
     * @model opposite="referredByTitledClass" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Doc getRefersToTitleDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc <em>Refers To Title Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Title Doc</em>' reference.
     * @see #isSetRefersToTitleDoc()
     * @see #unsetRefersToTitleDoc()
     * @see #getRefersToTitleDoc()
     * @generated
     */
    void setRefersToTitleDoc( Doc value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc <em>Refers To Title Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToTitleDoc()
     * @see #getRefersToTitleDoc()
     * @see #setRefersToTitleDoc(Doc)
     * @generated
     */
    void unsetRefersToTitleDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc <em>Refers To Title Doc</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Title Doc</em>' reference is set.
     * @see #unsetRefersToTitleDoc()
     * @see #getRefersToTitleDoc()
     * @see #setRefersToTitleDoc(Doc)
     * @generated
     */
    boolean isSetRefersToTitleDoc();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The titleID attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.titleID &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean titleIDAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // TitledClass
