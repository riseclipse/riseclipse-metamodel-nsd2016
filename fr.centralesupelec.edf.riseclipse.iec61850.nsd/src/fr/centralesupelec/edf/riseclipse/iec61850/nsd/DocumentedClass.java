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
 * A representation of the model object '<em><b>Documented Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class with description.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass()
 * @model extendedMetaData="name='tDocumentedClass' kind='empty'"
 * @generated
 */
public interface DocumentedClass extends EObject {
    /**
     * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flag indicating whether this object is classified as deprecated or not. By default not deprecated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deprecated</em>' attribute.
     * @see #isSetDeprecated()
     * @see #unsetDeprecated()
     * @see #setDeprecated(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass_Deprecated()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='deprecated'"
     * @generated
     */
    boolean isDeprecated();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deprecated</em>' attribute.
     * @see #isSetDeprecated()
     * @see #unsetDeprecated()
     * @see #isDeprecated()
     * @generated
     */
    void setDeprecated( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeprecated()
     * @see #isDeprecated()
     * @see #setDeprecated(boolean)
     * @generated
     */
    void unsetDeprecated();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Deprecated</em>' attribute is set.
     * @see #unsetDeprecated()
     * @see #isDeprecated()
     * @see #setDeprecated(boolean)
     * @generated
     */
    boolean isSetDeprecated();

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to a full description of this object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass_DescID()
     * @model extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc ID</em>' attribute.
     * @see #getDescID()
     * @generated
     */
    void setDescID( String value );

    /**
     * Returns the value of the '<em><b>Informative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flag indicating whether this object is classified as informative or not. By default not informative.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Informative</em>' attribute.
     * @see #isSetInformative()
     * @see #unsetInformative()
     * @see #setInformative(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass_Informative()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='informative'"
     * @generated
     */
    boolean isInformative();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Informative</em>' attribute.
     * @see #isSetInformative()
     * @see #unsetInformative()
     * @see #isInformative()
     * @generated
     */
    void setInformative( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInformative()
     * @see #isInformative()
     * @see #setInformative(boolean)
     * @generated
     */
    void unsetInformative();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Informative</em>' attribute is set.
     * @see #unsetInformative()
     * @see #isInformative()
     * @see #setInformative(boolean)
     * @generated
     */
    boolean isSetInformative();

} // DocumentedClass
