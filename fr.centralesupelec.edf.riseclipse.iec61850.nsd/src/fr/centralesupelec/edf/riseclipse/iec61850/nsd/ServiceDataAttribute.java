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
 * A representation of the model object '<em><b>Service Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getParentServiceCDC <em>Parent Service CDC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute()
 * @model extendedMetaData="name='tServiceDataAttribute' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired fcAttributeRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameAttributeRequired='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status' fcAttributeRequired='Tuple {\n\tmessage : String = \'The fc attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.fc &lt;&gt; null\n}.status'"
 * @generated
 */
public interface ServiceDataAttribute extends DocumentedClass, AgPresenceCondition, AgAttributeType, AgUnderlyingType {
    /**
     * Returns the value of the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fc</em>' attribute.
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #setFc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_Fc()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='fc'"
     * @generated
     */
    String getFc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fc</em>' attribute.
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #getFc()
     * @generated
     */
    void setFc( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFc()
     * @see #getFc()
     * @see #setFc(String)
     * @generated
     */
    void unsetFc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fc</em>' attribute is set.
     * @see #unsetFc()
     * @see #getFc()
     * @see #setFc(String)
     * @generated
     */
    boolean isSetFc();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Parent Service CDC</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service CDC</em>' container reference.
     * @see #setParentServiceCDC(ServiceCDC)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceDataAttribute_ParentServiceCDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute
     * @model opposite="serviceDataAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ServiceCDC getParentServiceCDC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getParentServiceCDC <em>Parent Service CDC</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service CDC</em>' container reference.
     * @see #getParentServiceCDC()
     * @generated
     */
    void setParentServiceCDC( ServiceCDC value );

} // ServiceDataAttribute
