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
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getGroup <em>Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getParentNSDoc <em>Parent NS Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgNSDesc <em>Referred By Ag NS Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceCondition <em>Referred By Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceCondition <em>Referred By Ag Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAbbreviation <em>Referred By Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType <em>Referred By Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass <em>Referred By Documented Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByFunctionalConstraint <em>Referred By Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics <em>Referred By Ag Presence Condition Derived Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass <em>Referred By Titled Class</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc()
 * @model extendedMetaData="name='tDoc' kind='mixed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idAttributeRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot idAttributeRequired='Tuple {\n\tmessage : String = \'The id attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.id &lt;&gt; null\n}.status'"
 * @generated
 */
public interface Doc extends NsdObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='group:1'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':2' processing='lax' group='#group:1'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_Id()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #getId()
     * @generated
     */
    void setId( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId <em>Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Id</em>' attribute is set.
     * @see #unsetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    boolean isSetId();

    /**
     * Returns the value of the '<em><b>Parent NS Doc</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent NS Doc</em>' container reference.
     * @see #setParentNSDoc(NSDoc)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ParentNSDoc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc
     * @model opposite="doc" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    NSDoc getParentNSDoc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getParentNSDoc <em>Parent NS Doc</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent NS Doc</em>' container reference.
     * @see #getParentNSDoc()
     * @generated
     */
    void setParentNSDoc( NSDoc value );

    /**
     * Returns the value of the '<em><b>Referred By Ag NS Desc</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Ag NS Desc</em>' reference list.
     * @see #isSetReferredByAgNSDesc()
     * @see #unsetReferredByAgNSDesc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByAgNSDesc()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc#getRefersToDoc
     * @model opposite="refersToDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgNSdesc > getReferredByAgNSDesc();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgNSDesc <em>Referred By Ag NS Desc</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAgNSDesc()
     * @see #getReferredByAgNSDesc()
     * @generated
     */
    void unsetReferredByAgNSDesc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgNSDesc <em>Referred By Ag NS Desc</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Ag NS Desc</em>' reference list is set.
     * @see #unsetReferredByAgNSDesc()
     * @see #getReferredByAgNSDesc()
     * @generated
     */
    boolean isSetReferredByAgNSDesc();

    /**
     * Returns the value of the '<em><b>Referred By Presence Condition</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Presence Condition</em>' reference list.
     * @see #isSetReferredByPresenceCondition()
     * @see #unsetReferredByPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDoc
     * @model opposite="refersToDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< PresenceCondition > getReferredByPresenceCondition();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceCondition <em>Referred By Presence Condition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByPresenceCondition()
     * @see #getReferredByPresenceCondition()
     * @generated
     */
    void unsetReferredByPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceCondition <em>Referred By Presence Condition</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Presence Condition</em>' reference list is set.
     * @see #unsetReferredByPresenceCondition()
     * @see #getReferredByPresenceCondition()
     * @generated
     */
    boolean isSetReferredByPresenceCondition();

    /**
     * Returns the value of the '<em><b>Referred By Ag Presence Condition</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Ag Presence Condition</em>' reference list.
     * @see #isSetReferredByAgPresenceCondition()
     * @see #unsetReferredByAgPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByAgPresenceCondition()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getRefersToPresCondArgsDoc
     * @model opposite="refersToPresCondArgsDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgPresenceCondition > getReferredByAgPresenceCondition();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceCondition <em>Referred By Ag Presence Condition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAgPresenceCondition()
     * @see #getReferredByAgPresenceCondition()
     * @generated
     */
    void unsetReferredByAgPresenceCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceCondition <em>Referred By Ag Presence Condition</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Ag Presence Condition</em>' reference list is set.
     * @see #unsetReferredByAgPresenceCondition()
     * @see #getReferredByAgPresenceCondition()
     * @generated
     */
    boolean isSetReferredByAgPresenceCondition();

    /**
     * Returns the value of the '<em><b>Referred By Abbreviation</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Abbreviation</em>' reference list.
     * @see #isSetReferredByAbbreviation()
     * @see #unsetReferredByAbbreviation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByAbbreviation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getRefersToDoc
     * @model opposite="refersToDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< Abbreviation > getReferredByAbbreviation();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAbbreviation <em>Referred By Abbreviation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAbbreviation()
     * @see #getReferredByAbbreviation()
     * @generated
     */
    void unsetReferredByAbbreviation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAbbreviation <em>Referred By Abbreviation</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Abbreviation</em>' reference list is set.
     * @see #unsetReferredByAbbreviation()
     * @see #getReferredByAbbreviation()
     * @generated
     */
    boolean isSetReferredByAbbreviation();

    /**
     * Returns the value of the '<em><b>Referred By Basic Type</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Basic Type</em>' reference list.
     * @see #isSetReferredByBasicType()
     * @see #unsetReferredByBasicType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByBasicType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc
     * @model opposite="refersToDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< BasicType > getReferredByBasicType();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType <em>Referred By Basic Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByBasicType()
     * @see #getReferredByBasicType()
     * @generated
     */
    void unsetReferredByBasicType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType <em>Referred By Basic Type</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Basic Type</em>' reference list is set.
     * @see #unsetReferredByBasicType()
     * @see #getReferredByBasicType()
     * @generated
     */
    boolean isSetReferredByBasicType();

    /**
     * Returns the value of the '<em><b>Referred By Documented Class</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDescDoc <em>Refers To Desc Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Documented Class</em>' reference list.
     * @see #isSetReferredByDocumentedClass()
     * @see #unsetReferredByDocumentedClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByDocumentedClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDescDoc
     * @model opposite="refersToDescDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DocumentedClass > getReferredByDocumentedClass();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass <em>Referred By Documented Class</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDocumentedClass()
     * @see #getReferredByDocumentedClass()
     * @generated
     */
    void unsetReferredByDocumentedClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass <em>Referred By Documented Class</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Documented Class</em>' reference list is set.
     * @see #unsetReferredByDocumentedClass()
     * @see #getReferredByDocumentedClass()
     * @generated
     */
    boolean isSetReferredByDocumentedClass();

    /**
     * Returns the value of the '<em><b>Referred By Functional Constraint</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Functional Constraint</em>' reference list.
     * @see #isSetReferredByFunctionalConstraint()
     * @see #unsetReferredByFunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByFunctionalConstraint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getRefersToDoc
     * @model opposite="refersToDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< FunctionalConstraint > getReferredByFunctionalConstraint();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByFunctionalConstraint <em>Referred By Functional Constraint</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByFunctionalConstraint()
     * @see #getReferredByFunctionalConstraint()
     * @generated
     */
    void unsetReferredByFunctionalConstraint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByFunctionalConstraint <em>Referred By Functional Constraint</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Functional Constraint</em>' reference list is set.
     * @see #unsetReferredByFunctionalConstraint()
     * @see #getReferredByFunctionalConstraint()
     * @generated
     */
    boolean isSetReferredByFunctionalConstraint();

    /**
     * Returns the value of the '<em><b>Referred By Ag Presence Condition Derived Statistics</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Ag Presence Condition Derived Statistics</em>' reference list.
     * @see #isSetReferredByAgPresenceConditionDerivedStatistics()
     * @see #unsetReferredByAgPresenceConditionDerivedStatistics()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByAgPresenceConditionDerivedStatistics()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc
     * @model opposite="refersToDsPresCondArgsDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AgPresenceConditionDerivedStatistics > getReferredByAgPresenceConditionDerivedStatistics();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics <em>Referred By Ag Presence Condition Derived Statistics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAgPresenceConditionDerivedStatistics()
     * @see #getReferredByAgPresenceConditionDerivedStatistics()
     * @generated
     */
    void unsetReferredByAgPresenceConditionDerivedStatistics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics <em>Referred By Ag Presence Condition Derived Statistics</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Ag Presence Condition Derived Statistics</em>' reference list is set.
     * @see #unsetReferredByAgPresenceConditionDerivedStatistics()
     * @see #getReferredByAgPresenceConditionDerivedStatistics()
     * @generated
     */
    boolean isSetReferredByAgPresenceConditionDerivedStatistics();

    /**
     * Returns the value of the '<em><b>Referred By Titled Class</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc <em>Refers To Title Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Titled Class</em>' reference list.
     * @see #isSetReferredByTitledClass()
     * @see #unsetReferredByTitledClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getDoc_ReferredByTitledClass()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc
     * @model opposite="refersToTitleDoc" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< TitledClass > getReferredByTitledClass();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass <em>Referred By Titled Class</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByTitledClass()
     * @see #getReferredByTitledClass()
     * @generated
     */
    void unsetReferredByTitledClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass <em>Referred By Titled Class</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Titled Class</em>' reference list is set.
     * @see #unsetReferredByTitledClass()
     * @see #getReferredByTitledClass()
     * @generated
     */
    boolean isSetReferredByTitledClass();

} // Doc
