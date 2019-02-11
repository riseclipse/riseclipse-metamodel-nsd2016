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
 * A representation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getCDC <em>CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToFunctionalConstraint <em>Refers To Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute <em>Referred By Data Attribute As Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute <em>Referred By Data Attribute As Max Index Attribute</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute()
 * @model extendedMetaData="name='tDataAttribute' kind='empty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameAttributeRequired fcAttributeRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameAttributeRequired='Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name &lt;&gt; null\n}.status' fcAttributeRequired='Tuple {\n\tmessage : String = \'The fc attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.fc &lt;&gt; null\n}.status'"
 * @generated
 */
public interface DataAttribute
        extends DocumentedClass, AgPresenceCondition, AgArray, AgTrgOp, AgAttributeTypeAndValues {
    /**
     * Returns the value of the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fc</em>' attribute.
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #setFc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_Fc()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='fc'"
     * @generated
     */
    String getFc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFc()
     * @see #getFc()
     * @see #setFc(String)
     * @generated
     */
    void unsetFc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_Name()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>CDC</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CDC</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CDC</em>' container reference.
     * @see #setCDC(CDC)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_CDC()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute
     * @model opposite="dataAttribute" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    CDC getCDC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getCDC <em>CDC</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CDC</em>' container reference.
     * @see #getCDC()
     * @generated
     */
    void setCDC( CDC value );

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Object As Size Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Object As Size Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Object As Size Attribute</em>' reference list.
     * @see #isSetReferredBySubDataObjectAsSizeAttribute()
     * @see #unsetReferredBySubDataObjectAsSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_ReferredBySubDataObjectAsSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute
     * @model opposite="refersToSizeAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataObject > getReferredBySubDataObjectAsSizeAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataObjectAsSizeAttribute()
     * @see #getReferredBySubDataObjectAsSizeAttribute()
     * @generated
     */
    void unsetReferredBySubDataObjectAsSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Object As Size Attribute</em>' reference list is set.
     * @see #unsetReferredBySubDataObjectAsSizeAttribute()
     * @see #getReferredBySubDataObjectAsSizeAttribute()
     * @generated
     */
    boolean isSetReferredBySubDataObjectAsSizeAttribute();

    /**
     * Returns the value of the '<em><b>Referred By Sub Data Object As Max Index Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Sub Data Object As Max Index Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Sub Data Object As Max Index Attribute</em>' reference list.
     * @see #isSetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #unsetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute
     * @model opposite="refersToMaxIndexAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubDataObject > getReferredBySubDataObjectAsMaxIndexAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #getReferredBySubDataObjectAsMaxIndexAttribute()
     * @generated
     */
    void unsetReferredBySubDataObjectAsMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Sub Data Object As Max Index Attribute</em>' reference list is set.
     * @see #unsetReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #getReferredBySubDataObjectAsMaxIndexAttribute()
     * @generated
     */
    boolean isSetReferredBySubDataObjectAsMaxIndexAttribute();

    /**
     * Returns the value of the '<em><b>Refers To Functional Constraint</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getReferredByDataAttribute <em>Referred By Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Functional Constraint</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Functional Constraint</em>' reference.
     * @see #isSetRefersToFunctionalConstraint()
     * @see #unsetRefersToFunctionalConstraint()
     * @see #setRefersToFunctionalConstraint(FunctionalConstraint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_RefersToFunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getReferredByDataAttribute
     * @model opposite="referredByDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    FunctionalConstraint getRefersToFunctionalConstraint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToFunctionalConstraint <em>Refers To Functional Constraint</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Functional Constraint</em>' reference.
     * @see #isSetRefersToFunctionalConstraint()
     * @see #unsetRefersToFunctionalConstraint()
     * @see #getRefersToFunctionalConstraint()
     * @generated
     */
    void setRefersToFunctionalConstraint( FunctionalConstraint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToFunctionalConstraint <em>Refers To Functional Constraint</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToFunctionalConstraint()
     * @see #getRefersToFunctionalConstraint()
     * @see #setRefersToFunctionalConstraint(FunctionalConstraint)
     * @generated
     */
    void unsetRefersToFunctionalConstraint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToFunctionalConstraint <em>Refers To Functional Constraint</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Functional Constraint</em>' reference is set.
     * @see #unsetRefersToFunctionalConstraint()
     * @see #getRefersToFunctionalConstraint()
     * @see #setRefersToFunctionalConstraint(FunctionalConstraint)
     * @generated
     */
    boolean isSetRefersToFunctionalConstraint();

    /**
     * Returns the value of the '<em><b>Refers To Presence Condition</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute <em>Referred By Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Presence Condition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Presence Condition</em>' reference.
     * @see #isSetRefersToPresenceCondition()
     * @see #unsetRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_RefersToPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute
     * @model opposite="referredByDataAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    PresenceCondition getRefersToPresenceCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Presence Condition</em>' reference.
     * @see #isSetRefersToPresenceCondition()
     * @see #unsetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @generated
     */
    void setRefersToPresenceCondition( PresenceCondition value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    void unsetRefersToPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Presence Condition</em>' reference is set.
     * @see #unsetRefersToPresenceCondition()
     * @see #getRefersToPresenceCondition()
     * @see #setRefersToPresenceCondition(PresenceCondition)
     * @generated
     */
    boolean isSetRefersToPresenceCondition();

    /**
     * Returns the value of the '<em><b>Refers To Size Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute <em>Referred By Data Attribute As Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Size Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Size Attribute</em>' reference.
     * @see #isSetRefersToSizeAttribute()
     * @see #unsetRefersToSizeAttribute()
     * @see #setRefersToSizeAttribute(DataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_RefersToSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute
     * @model opposite="referredByDataAttributeAsSizeAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataAttribute getRefersToSizeAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Size Attribute</em>' reference.
     * @see #isSetRefersToSizeAttribute()
     * @see #unsetRefersToSizeAttribute()
     * @see #getRefersToSizeAttribute()
     * @generated
     */
    void setRefersToSizeAttribute( DataAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToSizeAttribute()
     * @see #getRefersToSizeAttribute()
     * @see #setRefersToSizeAttribute(DataAttribute)
     * @generated
     */
    void unsetRefersToSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Size Attribute</em>' reference is set.
     * @see #unsetRefersToSizeAttribute()
     * @see #getRefersToSizeAttribute()
     * @see #setRefersToSizeAttribute(DataAttribute)
     * @generated
     */
    boolean isSetRefersToSizeAttribute();

    /**
     * Returns the value of the '<em><b>Refers To Max Index Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute <em>Referred By Data Attribute As Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Max Index Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Max Index Attribute</em>' reference.
     * @see #isSetRefersToMaxIndexAttribute()
     * @see #unsetRefersToMaxIndexAttribute()
     * @see #setRefersToMaxIndexAttribute(DataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_RefersToMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute
     * @model opposite="referredByDataAttributeAsMaxIndexAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DataAttribute getRefersToMaxIndexAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Max Index Attribute</em>' reference.
     * @see #isSetRefersToMaxIndexAttribute()
     * @see #unsetRefersToMaxIndexAttribute()
     * @see #getRefersToMaxIndexAttribute()
     * @generated
     */
    void setRefersToMaxIndexAttribute( DataAttribute value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToMaxIndexAttribute()
     * @see #getRefersToMaxIndexAttribute()
     * @see #setRefersToMaxIndexAttribute(DataAttribute)
     * @generated
     */
    void unsetRefersToMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Max Index Attribute</em>' reference is set.
     * @see #unsetRefersToMaxIndexAttribute()
     * @see #getRefersToMaxIndexAttribute()
     * @see #setRefersToMaxIndexAttribute(DataAttribute)
     * @generated
     */
    boolean isSetRefersToMaxIndexAttribute();

    /**
     * Returns the value of the '<em><b>Referred By Data Attribute As Size Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Data Attribute As Size Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Data Attribute As Size Attribute</em>' reference list.
     * @see #isSetReferredByDataAttributeAsSizeAttribute()
     * @see #unsetReferredByDataAttributeAsSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_ReferredByDataAttributeAsSizeAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute
     * @model opposite="refersToSizeAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DataAttribute > getReferredByDataAttributeAsSizeAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute <em>Referred By Data Attribute As Size Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDataAttributeAsSizeAttribute()
     * @see #getReferredByDataAttributeAsSizeAttribute()
     * @generated
     */
    void unsetReferredByDataAttributeAsSizeAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute <em>Referred By Data Attribute As Size Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Data Attribute As Size Attribute</em>' reference list is set.
     * @see #unsetReferredByDataAttributeAsSizeAttribute()
     * @see #getReferredByDataAttributeAsSizeAttribute()
     * @generated
     */
    boolean isSetReferredByDataAttributeAsSizeAttribute();

    /**
     * Returns the value of the '<em><b>Referred By Data Attribute As Max Index Attribute</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Data Attribute As Max Index Attribute</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Data Attribute As Max Index Attribute</em>' reference list.
     * @see #isSetReferredByDataAttributeAsMaxIndexAttribute()
     * @see #unsetReferredByDataAttributeAsMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDataAttribute_ReferredByDataAttributeAsMaxIndexAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute
     * @model opposite="refersToMaxIndexAttribute" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DataAttribute > getReferredByDataAttributeAsMaxIndexAttribute();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute <em>Referred By Data Attribute As Max Index Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDataAttributeAsMaxIndexAttribute()
     * @see #getReferredByDataAttributeAsMaxIndexAttribute()
     * @generated
     */
    void unsetReferredByDataAttributeAsMaxIndexAttribute();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute <em>Referred By Data Attribute As Max Index Attribute</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Data Attribute As Max Index Attribute</em>' reference list is set.
     * @see #unsetReferredByDataAttributeAsMaxIndexAttribute()
     * @see #getReferredByDataAttributeAsMaxIndexAttribute()
     * @generated
     */
    boolean isSetReferredByDataAttributeAsMaxIndexAttribute();

} // DataAttribute
