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
 * A representation of the model object '<em><b>Any LN Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass()
 * @model abstract="true"
 *        extendedMetaData="name='tAnyLNClass' kind='elementOnly'"
 * @generated
 */
public interface AnyLNClass extends TitledClass {
    /**
     * Returns the value of the '<em><b>Data Object</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getAnyLNClass <em>Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Object</em>' containment reference list.
     * @see #isSetDataObject()
     * @see #unsetDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass_DataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getAnyLNClass
     * @model opposite="anyLNClass" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='DataObject' namespace='##targetNamespace'"
     * @generated
     */
    EList< DataObject > getDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDataObject()
     * @see #getDataObject()
     * @generated
     */
    void unsetDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Object</em>' containment reference list is set.
     * @see #unsetDataObject()
     * @see #getDataObject()
     * @generated
     */
    boolean isSetDataObject();

    /**
     * Returns the value of the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base</em>' attribute.
     * @see #isSetBase()
     * @see #unsetBase()
     * @see #setBase(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass_Base()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='base'"
     * @generated
     */
    String getBase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' attribute.
     * @see #isSetBase()
     * @see #unsetBase()
     * @see #getBase()
     * @generated
     */
    void setBase( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBase()
     * @see #getBase()
     * @see #setBase(String)
     * @generated
     */
    void unsetBase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base</em>' attribute is set.
     * @see #unsetBase()
     * @see #getBase()
     * @see #setBase(String)
     * @generated
     */
    boolean isSetBase();

    /**
     * Returns the value of the '<em><b>Refers To Abstract LN Class</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getReferredByAnyLNClass <em>Referred By Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Abstract LN Class</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Abstract LN Class</em>' reference.
     * @see #isSetRefersToAbstractLNClass()
     * @see #unsetRefersToAbstractLNClass()
     * @see #setRefersToAbstractLNClass(AbstractLNClass)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getAnyLNClass_RefersToAbstractLNClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getReferredByAnyLNClass
     * @model opposite="referredByAnyLNClass" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AbstractLNClass getRefersToAbstractLNClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Abstract LN Class</em>' reference.
     * @see #isSetRefersToAbstractLNClass()
     * @see #unsetRefersToAbstractLNClass()
     * @see #getRefersToAbstractLNClass()
     * @generated
     */
    void setRefersToAbstractLNClass( AbstractLNClass value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAbstractLNClass()
     * @see #getRefersToAbstractLNClass()
     * @see #setRefersToAbstractLNClass(AbstractLNClass)
     * @generated
     */
    void unsetRefersToAbstractLNClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Abstract LN Class</em>' reference is set.
     * @see #unsetRefersToAbstractLNClass()
     * @see #getRefersToAbstractLNClass()
     * @see #setRefersToAbstractLNClass(AbstractLNClass)
     * @generated
     */
    boolean isSetRefersToAbstractLNClass();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getName();

} // AnyLNClass
