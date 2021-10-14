/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructed Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentConstructedAttributes <em>Parent Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentServiceTypeRealizations <em>Parent Service Type Realizations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType <em>Referred By Attribute Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute()
 * @model extendedMetaData="name='tConstructedAttribute' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired'"
 * @generated
 */
public interface ConstructedAttribute extends TitledClass {
    /**
     * Returns the value of the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getParentConstructedAttribute <em>Parent Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Data Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Data Attribute</em>' containment reference list.
     * @see #isSetSubDataAttribute()
     * @see #unsetSubDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_SubDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getParentConstructedAttribute
     * @model opposite="parentConstructedAttribute" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SubDataAttribute' namespace='##targetNamespace'"
     * @generated
     */
    EList< SubDataAttribute > getSubDataAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubDataAttribute()
     * @see #getSubDataAttribute()
     * @generated
     */
    void unsetSubDataAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Data Attribute</em>' containment reference list is set.
     * @see #unsetSubDataAttribute()
     * @see #getSubDataAttribute()
     * @generated
     */
    boolean isSetSubDataAttribute();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Parent Constructed Attributes</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Constructed Attributes</em>' container reference.
     * @see #setParentConstructedAttributes(ConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_ParentConstructedAttributes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute
     * @model opposite="constructedAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConstructedAttributes getParentConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentConstructedAttributes <em>Parent Constructed Attributes</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Constructed Attributes</em>' container reference.
     * @see #getParentConstructedAttributes()
     * @generated
     */
    void setParentConstructedAttributes( ConstructedAttributes value );

    /**
     * Returns the value of the '<em><b>Parent Service Type Realizations</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Type Realizations</em>' container reference.
     * @see #setParentServiceTypeRealizations(ServiceTypeRealizations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_ParentServiceTypeRealizations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization
     * @model opposite="serviceTypeRealization" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceTypeRealizations getParentServiceTypeRealizations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentServiceTypeRealizations <em>Parent Service Type Realizations</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Type Realizations</em>' container reference.
     * @see #getParentServiceTypeRealizations()
     * @generated
     */
    void setParentServiceTypeRealizations( ServiceTypeRealizations value );

    /**
     * Returns the value of the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Attribute Type</em>' reference list.
     * @see #isSetReferredByAttributeType()
     * @see #unsetReferredByAttributeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_ReferredByAttributeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute
     * @model opposite="refersToConstructedAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgAttributeType > getReferredByAttributeType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType <em>Referred By Attribute Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAttributeType()
     * @see #getReferredByAttributeType()
     * @generated
     */
    void unsetReferredByAttributeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType <em>Referred By Attribute Type</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Attribute Type</em>' reference list is set.
     * @see #unsetReferredByAttributeType()
     * @see #getReferredByAttributeType()
     * @generated
     */
    boolean isSetReferredByAttributeType();

    /**
     * Returns the value of the '<em><b>Referred By Underlying Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Underlying Type</em>' reference list.
     * @see #isSetReferredByUnderlyingType()
     * @see #unsetReferredByUnderlyingType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_ReferredByUnderlyingType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getRefersToUnderlyingConstructedAttribute
     * @model opposite="refersToUnderlyingConstructedAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgUnderlyingType > getReferredByUnderlyingType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByUnderlyingType()
     * @see #getReferredByUnderlyingType()
     * @generated
     */
    void unsetReferredByUnderlyingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}' reference list is set.
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
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.subDataAttribute-&gt;isUnique( s : SubDataAttribute | s.name )\n}.status'"
     * @generated
     */
    boolean uniqueSubDataAttribute( DiagnosticChain diagnostics, Map< Object, Object > context );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status'"
     * @generated
     */
    boolean nameAttributeRequired( DiagnosticChain diagnostics, Map< Object, Object > context );

} // ConstructedAttribute
