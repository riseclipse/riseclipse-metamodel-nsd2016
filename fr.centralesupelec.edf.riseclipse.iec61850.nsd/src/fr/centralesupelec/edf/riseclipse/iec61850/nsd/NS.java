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
 * A representation of the model object '<em><b>NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn <em>Referred By Depends On</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS()
 * @model extendedMetaData="name='tNS' kind='elementOnly'"
 * @generated
 */
public interface NS extends Copyrighted, AgNSIdentification, AgUML, AgNSdesc {
    /**
     * Returns the value of the '<em><b>Changes</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changes</em>' containment reference.
     * @see #isSetChanges()
     * @see #unsetChanges()
     * @see #setChanges(Changes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Changes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Changes' namespace='##targetNamespace'"
     * @generated
     */
    Changes getChanges();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changes</em>' containment reference.
     * @see #isSetChanges()
     * @see #unsetChanges()
     * @see #getChanges()
     * @generated
     */
    void setChanges( Changes value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChanges()
     * @see #getChanges()
     * @see #setChanges(Changes)
     * @generated
     */
    void unsetChanges();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changes</em>' containment reference is set.
     * @see #unsetChanges()
     * @see #getChanges()
     * @see #setChanges(Changes)
     * @generated
     */
    boolean isSetChanges();

    /**
     * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Depends On</em>' containment reference.
     * @see #isSetDependsOn()
     * @see #unsetDependsOn()
     * @see #setDependsOn(DependsOn)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_DependsOn()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='DependsOn' namespace='##targetNamespace'"
     * @generated
     */
    DependsOn getDependsOn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Depends On</em>' containment reference.
     * @see #isSetDependsOn()
     * @see #unsetDependsOn()
     * @see #getDependsOn()
     * @generated
     */
    void setDependsOn( DependsOn value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDependsOn()
     * @see #getDependsOn()
     * @see #setDependsOn(DependsOn)
     * @generated
     */
    void unsetDependsOn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Depends On</em>' containment reference is set.
     * @see #unsetDependsOn()
     * @see #getDependsOn()
     * @see #setDependsOn(DependsOn)
     * @generated
     */
    boolean isSetDependsOn();

    /**
     * Returns the value of the '<em><b>Basic Types</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Types</em>' containment reference.
     * @see #isSetBasicTypes()
     * @see #unsetBasicTypes()
     * @see #setBasicTypes(BasicTypes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_BasicTypes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BasicTypes' namespace='##targetNamespace'"
     * @generated
     */
    BasicTypes getBasicTypes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Types</em>' containment reference.
     * @see #isSetBasicTypes()
     * @see #unsetBasicTypes()
     * @see #getBasicTypes()
     * @generated
     */
    void setBasicTypes( BasicTypes value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBasicTypes()
     * @see #getBasicTypes()
     * @see #setBasicTypes(BasicTypes)
     * @generated
     */
    void unsetBasicTypes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Basic Types</em>' containment reference is set.
     * @see #unsetBasicTypes()
     * @see #getBasicTypes()
     * @see #setBasicTypes(BasicTypes)
     * @generated
     */
    boolean isSetBasicTypes();

    /**
     * Returns the value of the '<em><b>Functional Constraints</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functional Constraints</em>' containment reference.
     * @see #isSetFunctionalConstraints()
     * @see #unsetFunctionalConstraints()
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_FunctionalConstraints()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalConstraints' namespace='##targetNamespace'"
     * @generated
     */
    FunctionalConstraints getFunctionalConstraints();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Functional Constraints</em>' containment reference.
     * @see #isSetFunctionalConstraints()
     * @see #unsetFunctionalConstraints()
     * @see #getFunctionalConstraints()
     * @generated
     */
    void setFunctionalConstraints( FunctionalConstraints value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalConstraints()
     * @see #getFunctionalConstraints()
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @generated
     */
    void unsetFunctionalConstraints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Functional Constraints</em>' containment reference is set.
     * @see #unsetFunctionalConstraints()
     * @see #getFunctionalConstraints()
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @generated
     */
    boolean isSetFunctionalConstraints();

    /**
     * Returns the value of the '<em><b>Presence Conditions</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presence Conditions</em>' containment reference.
     * @see #isSetPresenceConditions()
     * @see #unsetPresenceConditions()
     * @see #setPresenceConditions(PresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_PresenceConditions()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='PresenceConditions' namespace='##targetNamespace'"
     * @generated
     */
    PresenceConditions getPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Presence Conditions</em>' containment reference.
     * @see #isSetPresenceConditions()
     * @see #unsetPresenceConditions()
     * @see #getPresenceConditions()
     * @generated
     */
    void setPresenceConditions( PresenceConditions value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresenceConditions()
     * @see #getPresenceConditions()
     * @see #setPresenceConditions(PresenceConditions)
     * @generated
     */
    void unsetPresenceConditions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Presence Conditions</em>' containment reference is set.
     * @see #unsetPresenceConditions()
     * @see #getPresenceConditions()
     * @see #setPresenceConditions(PresenceConditions)
     * @generated
     */
    boolean isSetPresenceConditions();

    /**
     * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbreviations</em>' containment reference.
     * @see #isSetAbbreviations()
     * @see #unsetAbbreviations()
     * @see #setAbbreviations(Abbreviations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Abbreviations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Abbreviations' namespace='##targetNamespace'"
     * @generated
     */
    Abbreviations getAbbreviations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviations</em>' containment reference.
     * @see #isSetAbbreviations()
     * @see #unsetAbbreviations()
     * @see #getAbbreviations()
     * @generated
     */
    void setAbbreviations( Abbreviations value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbbreviations()
     * @see #getAbbreviations()
     * @see #setAbbreviations(Abbreviations)
     * @generated
     */
    void unsetAbbreviations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abbreviations</em>' containment reference is set.
     * @see #unsetAbbreviations()
     * @see #getAbbreviations()
     * @see #setAbbreviations(Abbreviations)
     * @generated
     */
    boolean isSetAbbreviations();

    /**
     * Returns the value of the '<em><b>Enumerations</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumerations</em>' containment reference.
     * @see #isSetEnumerations()
     * @see #unsetEnumerations()
     * @see #setEnumerations(Enumerations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Enumerations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Enumerations' namespace='##targetNamespace'"
     * @generated
     */
    Enumerations getEnumerations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumerations</em>' containment reference.
     * @see #isSetEnumerations()
     * @see #unsetEnumerations()
     * @see #getEnumerations()
     * @generated
     */
    void setEnumerations( Enumerations value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnumerations()
     * @see #getEnumerations()
     * @see #setEnumerations(Enumerations)
     * @generated
     */
    void unsetEnumerations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enumerations</em>' containment reference is set.
     * @see #unsetEnumerations()
     * @see #getEnumerations()
     * @see #setEnumerations(Enumerations)
     * @generated
     */
    boolean isSetEnumerations();

    /**
     * Returns the value of the '<em><b>Constructed Attributes</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constructed Attributes</em>' containment reference.
     * @see #isSetConstructedAttributes()
     * @see #unsetConstructedAttributes()
     * @see #setConstructedAttributes(ConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_ConstructedAttributes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ConstructedAttributes' namespace='##targetNamespace'"
     * @generated
     */
    ConstructedAttributes getConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constructed Attributes</em>' containment reference.
     * @see #isSetConstructedAttributes()
     * @see #unsetConstructedAttributes()
     * @see #getConstructedAttributes()
     * @generated
     */
    void setConstructedAttributes( ConstructedAttributes value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConstructedAttributes()
     * @see #getConstructedAttributes()
     * @see #setConstructedAttributes(ConstructedAttributes)
     * @generated
     */
    void unsetConstructedAttributes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Constructed Attributes</em>' containment reference is set.
     * @see #unsetConstructedAttributes()
     * @see #getConstructedAttributes()
     * @see #setConstructedAttributes(ConstructedAttributes)
     * @generated
     */
    boolean isSetConstructedAttributes();

    /**
     * Returns the value of the '<em><b>CD Cs</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>CD Cs</em>' containment reference.
     * @see #isSetCDCs()
     * @see #unsetCDCs()
     * @see #setCDCs(CDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_CDCs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='CDCs' namespace='##targetNamespace'"
     * @generated
     */
    CDCs getCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CD Cs</em>' containment reference.
     * @see #isSetCDCs()
     * @see #unsetCDCs()
     * @see #getCDCs()
     * @generated
     */
    void setCDCs( CDCs value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCDCs()
     * @see #getCDCs()
     * @see #setCDCs(CDCs)
     * @generated
     */
    void unsetCDCs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CD Cs</em>' containment reference is set.
     * @see #unsetCDCs()
     * @see #getCDCs()
     * @see #setCDCs(CDCs)
     * @generated
     */
    boolean isSetCDCs();

    /**
     * Returns the value of the '<em><b>LN Classes</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>LN Classes</em>' containment reference.
     * @see #isSetLNClasses()
     * @see #unsetLNClasses()
     * @see #setLNClasses(LNClasses)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_LNClasses()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getNS
     * @model opposite="nS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='LNClasses' namespace='##targetNamespace'"
     * @generated
     */
    LNClasses getLNClasses();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LN Classes</em>' containment reference.
     * @see #isSetLNClasses()
     * @see #unsetLNClasses()
     * @see #getLNClasses()
     * @generated
     */
    void setLNClasses( LNClasses value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNClasses()
     * @see #getLNClasses()
     * @see #setLNClasses(LNClasses)
     * @generated
     */
    void unsetLNClasses();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LN Classes</em>' containment reference is set.
     * @see #unsetLNClasses()
     * @see #getLNClasses()
     * @see #setLNClasses(LNClasses)
     * @generated
     */
    boolean isSetLNClasses();

    /**
     * Returns the value of the '<em><b>Referred By Depends On</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS <em>Refers To NS</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Depends On</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Depends On</em>' reference list.
     * @see #isSetReferredByDependsOn()
     * @see #unsetReferredByDependsOn()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_ReferredByDependsOn()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS
     * @model opposite="refersToNS" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DependsOn > getReferredByDependsOn();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn <em>Referred By Depends On</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDependsOn()
     * @see #getReferredByDependsOn()
     * @generated
     */
    void unsetReferredByDependsOn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn <em>Referred By Depends On</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Depends On</em>' reference list is set.
     * @see #unsetReferredByDependsOn()
     * @see #getReferredByDependsOn()
     * @generated
     */
    boolean isSetReferredByDependsOn();

} // NS
