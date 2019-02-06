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

import javax.xml.datatype.XMLGregorianCalendar;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion <em>Uml Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS()
 * @model extendedMetaData="name='tNS' kind='elementOnly'"
 * @generated
 */
public interface NS extends Copyrighted, NSDObjectWithVersionAndRelease {
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
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID <em>Desc ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID <em>Desc ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Id()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId <em>Id</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId <em>Id</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Publication Stage</b></em>' attribute.
     * The default value is <code>"IS"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    PubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @generated
     */
    void setPublicationStage( PubStage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPublicationStage <em>Publication Stage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Publication Stage</em>' attribute is set.
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    boolean isSetPublicationStage();

    /**
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * The default value is <code>"A"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Revision()
     * @model default="A" unsettable="true"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #getRevision()
     * @generated
     */
    void setRevision( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRevision <em>Revision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Revision</em>' attribute is set.
     * @see #unsetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    boolean isSetRevision();

    /**
     * Returns the value of the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Date</em>' attribute.
     * @see #isSetUmlDate()
     * @see #unsetUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_UmlDate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Date</em>' attribute.
     * @see #isSetUmlDate()
     * @see #unsetUmlDate()
     * @see #getUmlDate()
     * @generated
     */
    void setUmlDate( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetUmlDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate <em>Uml Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Date</em>' attribute is set.
     * @see #unsetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetUmlDate();

    /**
     * Returns the value of the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Version</em>' attribute.
     * @see #isSetUmlVersion()
     * @see #unsetUmlVersion()
     * @see #setUmlVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_UmlVersion()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Version</em>' attribute.
     * @see #isSetUmlVersion()
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @generated
     */
    void setUmlVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    void unsetUmlVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion <em>Uml Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Version</em>' attribute is set.
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    boolean isSetUmlVersion();

} // NS
