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
 * A representation of the model object '<em><b>Constructed Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getConstructedAttributes <em>Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getServiceTypeRealizations <em>Service Type Realizations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute()
 * @model extendedMetaData="name='tConstructedAttribute' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueSubDataAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueSubDataAttribute='Tuple {\n\tmessage : String = \'For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name\',\n\tstatus : Boolean = \n\t\t\tself.subDataAttribute-&gt;isUnique( s : SubDataAttribute | s.name )\n}.status'"
 * @generated
 */
public interface ConstructedAttribute extends TitledClass {
    /**
     * Returns the value of the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getConstructedAttribute <em>Constructed Attribute</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getConstructedAttribute
     * @model opposite="constructedAttribute" containment="true" unsettable="true" ordered="false"
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
     * Returns the value of the '<em><b>Constructed Attributes</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constructed Attributes</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constructed Attributes</em>' container reference.
     * @see #setConstructedAttributes(ConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_ConstructedAttributes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute
     * @model opposite="constructedAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ConstructedAttributes getConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getConstructedAttributes <em>Constructed Attributes</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constructed Attributes</em>' container reference.
     * @see #getConstructedAttributes()
     * @generated
     */
    void setConstructedAttributes( ConstructedAttributes value );

    /**
     * Returns the value of the '<em><b>Service Type Realizations</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Type Realizations</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type Realizations</em>' container reference.
     * @see #setServiceTypeRealizations(ServiceTypeRealizations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getConstructedAttribute_ServiceTypeRealizations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization
     * @model opposite="serviceTypeRealization" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceTypeRealizations getServiceTypeRealizations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getServiceTypeRealizations <em>Service Type Realizations</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Type Realizations</em>' container reference.
     * @see #getServiceTypeRealizations()
     * @generated
     */
    void setServiceTypeRealizations( ServiceTypeRealizations value );

} // ConstructedAttribute
