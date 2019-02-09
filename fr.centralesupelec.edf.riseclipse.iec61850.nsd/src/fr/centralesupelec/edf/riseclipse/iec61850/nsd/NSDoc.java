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
 * A representation of the model object '<em><b>NS Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc()
 * @model extendedMetaData="name='tNSDoc' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='langAttributeRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot langAttributeRequired='Tuple {\n\tmessage : String = \'The lang attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.lang &lt;&gt; null\n}.status'"
 * @generated
 */
public interface NSDoc extends Copyrighted, AgNSIdentification, AgUML {
    /**
     * Returns the value of the '<em><b>Doc</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getNSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Doc</em>' containment reference list.
     * @see #isSetDoc()
     * @see #unsetDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_Doc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getNSDoc
     * @model opposite="nSDoc" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Doc' namespace='##targetNamespace'"
     * @generated
     */
    EList< Doc > getDoc();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDoc()
     * @see #getDoc()
     * @generated
     */
    void unsetDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Doc</em>' containment reference list is set.
     * @see #unsetDoc()
     * @see #getDoc()
     * @generated
     */
    boolean isSetDoc();

    /**
     * Returns the value of the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lang</em>' attribute.
     * @see #isSetLang()
     * @see #unsetLang()
     * @see #setLang(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNSDoc_Lang()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Language"
     *        extendedMetaData="kind='attribute' name='lang'"
     * @generated
     */
    String getLang();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lang</em>' attribute.
     * @see #isSetLang()
     * @see #unsetLang()
     * @see #getLang()
     * @generated
     */
    void setLang( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLang()
     * @see #getLang()
     * @see #setLang(String)
     * @generated
     */
    void unsetLang();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lang</em>' attribute is set.
     * @see #unsetLang()
     * @see #getLang()
     * @see #setLang(String)
     * @generated
     */
    boolean isSetLang();

} // NSDoc
