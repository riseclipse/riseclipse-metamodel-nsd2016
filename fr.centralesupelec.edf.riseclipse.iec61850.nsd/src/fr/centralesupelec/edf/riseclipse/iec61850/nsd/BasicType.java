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
 * A representation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getParentBasicTypes <em>Parent Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType <em>Referred By Attribute Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc <em>Refers To Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType()
 * @model extendedMetaData="name='tBasicType' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface BasicType extends NsdObject {
    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID <em>Desc ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID <em>Desc ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Parent Basic Types</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Basic Types</em>' container reference.
     * @see #setParentBasicTypes(BasicTypes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType_ParentBasicTypes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType
     * @model opposite="basicType" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    BasicTypes getParentBasicTypes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getParentBasicTypes <em>Parent Basic Types</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Basic Types</em>' container reference.
     * @see #getParentBasicTypes()
     * @generated
     */
    void setParentBasicTypes( BasicTypes value );

    /**
     * Returns the value of the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType <em>Refers To Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Attribute Type</em>' reference list.
     * @see #isSetReferredByAttributeType()
     * @see #unsetReferredByAttributeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType_ReferredByAttributeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType
     * @model opposite="refersToBasicType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgAttributeType > getReferredByAttributeType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType <em>Referred By Attribute Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAttributeType()
     * @see #getReferredByAttributeType()
     * @generated
     */
    void unsetReferredByAttributeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType <em>Referred By Attribute Type</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Attribute Type</em>' reference list is set.
     * @see #unsetReferredByAttributeType()
     * @see #getReferredByAttributeType()
     * @generated
     */
    boolean isSetReferredByAttributeType();

    /**
     * Returns the value of the '<em><b>Refers To Doc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType <em>Referred By Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Doc</em>' reference.
     * @see #isSetRefersToDoc()
     * @see #unsetRefersToDoc()
     * @see #setRefersToDoc(Doc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType_RefersToDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType
     * @model opposite="referredByBasicType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Doc getRefersToDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc <em>Refers To Doc</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDoc()
     * @see #getRefersToDoc()
     * @see #setRefersToDoc(Doc)
     * @generated
     */
    void unsetRefersToDoc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc <em>Refers To Doc</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Doc</em>' reference is set.
     * @see #unsetRefersToDoc()
     * @see #getRefersToDoc()
     * @see #setRefersToDoc(Doc)
     * @generated
     */
    boolean isSetRefersToDoc();

    /**
     * Returns the value of the '<em><b>Referred By Underlying Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Underlying Type</em>' reference list.
     * @see #isSetReferredByUnderlyingType()
     * @see #unsetReferredByUnderlyingType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getBasicType_ReferredByUnderlyingType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingBasicType
     * @model opposite="refersToUnderlyingBasicType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgUnderlyingType > getReferredByUnderlyingType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByUnderlyingType()
     * @see #getReferredByUnderlyingType()
     * @generated
     */
    void unsetReferredByUnderlyingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Underlying Type</em>' reference list is set.
     * @see #unsetReferredByUnderlyingType()
     * @see #getReferredByUnderlyingType()
     * @generated
     */
    boolean isSetReferredByUnderlyingType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // BasicType
