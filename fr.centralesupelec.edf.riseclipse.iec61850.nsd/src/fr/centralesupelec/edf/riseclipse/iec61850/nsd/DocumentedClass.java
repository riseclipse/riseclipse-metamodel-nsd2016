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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDoc <em>Refers To Doc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass()
 * @model extendedMetaData="name='tDocumentedClass' kind='empty'"
 * @generated
 */
public interface DocumentedClass extends NsdObject {
    /**
     * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Informative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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

    /**
     * Returns the value of the '<em><b>Refers To Doc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass <em>Referred By Documented Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Doc</em>' reference.
     * @see #isSetRefersToDoc()
     * @see #unsetRefersToDoc()
     * @see #setRefersToDoc(Doc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDocumentedClass_RefersToDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass
     * @model opposite="referredByDocumentedClass" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Doc getRefersToDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDoc <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Doc</em>' reference.
     * @see #isSetRefersToDoc()
     * @see #unsetRefersToDoc()
     * @see #getRefersToDoc()
     * @generated
     */
    void setRefersToDoc( Doc value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDoc <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDoc()
     * @see #getRefersToDoc()
     * @see #setRefersToDoc(Doc)
     * @generated
     */
    void unsetRefersToDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDoc <em>Refers To Doc</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Doc</em>' reference is set.
     * @see #unsetRefersToDoc()
     * @see #getRefersToDoc()
     * @see #setRefersToDoc(Doc)
     * @generated
     */
    boolean isSetRefersToDoc();

} // DocumentedClass