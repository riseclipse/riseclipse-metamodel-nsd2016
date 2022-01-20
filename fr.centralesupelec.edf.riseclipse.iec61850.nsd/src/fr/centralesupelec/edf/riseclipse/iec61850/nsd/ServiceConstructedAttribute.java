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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Constructed Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#getParentServiceConstructedAttributes <em>Parent Service Constructed Attributes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceConstructedAttribute()
 * @model extendedMetaData="name='tServiceConstructedAttribute' kind='elementOnly'"
 * @generated
 */
public interface ServiceConstructedAttribute extends ConstructedAttribute {
    /**
     * Returns the value of the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Kind Parameterized</em>' attribute.
     * @see #isSetTypeKindParameterized()
     * @see #unsetTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceConstructedAttribute_TypeKindParameterized()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='typeKindParameterized'"
     * @generated
     */
    boolean isTypeKindParameterized();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Kind Parameterized</em>' attribute.
     * @see #isSetTypeKindParameterized()
     * @see #unsetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @generated
     */
    void setTypeKindParameterized( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @generated
     */
    void unsetTypeKindParameterized();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type Kind Parameterized</em>' attribute is set.
     * @see #unsetTypeKindParameterized()
     * @see #isTypeKindParameterized()
     * @see #setTypeKindParameterized(boolean)
     * @generated
     */
    boolean isSetTypeKindParameterized();

    /**
     * Returns the value of the '<em><b>Parent Service Constructed Attributes</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Constructed Attributes</em>' container reference.
     * @see #setParentServiceConstructedAttributes(ServiceConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceConstructedAttribute_ParentServiceConstructedAttributes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceConstructedAttribute
     * @model opposite="serviceConstructedAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceConstructedAttributes getParentServiceConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#getParentServiceConstructedAttributes <em>Parent Service Constructed Attributes</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Constructed Attributes</em>' container reference.
     * @see #getParentServiceConstructedAttributes()
     * @generated
     */
    void setParentServiceConstructedAttributes( ServiceConstructedAttributes value );

} // ServiceConstructedAttribute
