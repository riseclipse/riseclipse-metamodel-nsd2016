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
 * A representation of the model object '<em><b>TNS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getBasicTypes <em>Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getConstructedAttributes <em>Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getCDCs <em>CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getLNClasses <em>LN Classes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS()
 * @model extendedMetaData="name='tNS' kind='elementOnly'"
 * @generated
 */
public interface TNS extends TCopyrighted {
    /**
     * Returns the value of the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The version/revision/release this namespace is based on, including the TISSUEs implemented in this release.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Changes</em>' containment reference.
     * @see #setChanges(TChanges)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Changes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Changes' namespace='##targetNamespace'"
     * @generated
     */
    TChanges getChanges();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getChanges <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changes</em>' containment reference.
     * @see #getChanges()
     * @generated
     */
    void setChanges( TChanges value );

    /**
     * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The namespace identification this namespace depends on (and whose definitions are imported into this one).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Depends On</em>' containment reference.
     * @see #setDependsOn(DependsOnType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_DependsOn()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DependsOn' namespace='##targetNamespace'"
     * @generated
     */
    DependsOnType getDependsOn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDependsOn <em>Depends On</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Depends On</em>' containment reference.
     * @see #getDependsOn()
     * @generated
     */
    void setDependsOn( DependsOnType value );

    /**
     * Returns the value of the '<em><b>Basic Types</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of basic types added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones). Note: shall only be used in practice by the 7-2 namespace.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Basic Types</em>' containment reference.
     * @see #setBasicTypes(TBasicTypes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_BasicTypes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='BasicTypes' namespace='##targetNamespace'"
     * @generated
     */
    TBasicTypes getBasicTypes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getBasicTypes <em>Basic Types</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Types</em>' containment reference.
     * @see #getBasicTypes()
     * @generated
     */
    void setBasicTypes( TBasicTypes value );

    /**
     * Returns the value of the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Functional Constraints added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Constraints</em>' containment reference.
     * @see #setFunctionalConstraints(TFunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_FunctionalConstraints()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FunctionalConstraints' namespace='##targetNamespace'"
     * @generated
     */
    TFunctionalConstraints getFunctionalConstraints();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Functional Constraints</em>' containment reference.
     * @see #getFunctionalConstraints()
     * @generated
     */
    void setFunctionalConstraints( TFunctionalConstraints value );

    /**
     * Returns the value of the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of presence conditions added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Presence Conditions</em>' containment reference.
     * @see #setPresenceConditions(TPresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_PresenceConditions()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='PresenceConditions' namespace='##targetNamespace'"
     * @generated
     */
    TPresenceConditions getPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Presence Conditions</em>' containment reference.
     * @see #getPresenceConditions()
     * @generated
     */
    void setPresenceConditions( TPresenceConditions value );

    /**
     * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of abbreviations added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Abbreviations</em>' containment reference.
     * @see #setAbbreviations(TAbbreviations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Abbreviations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Abbreviations' namespace='##targetNamespace'"
     * @generated
     */
    TAbbreviations getAbbreviations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getAbbreviations <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviations</em>' containment reference.
     * @see #getAbbreviations()
     * @generated
     */
    void setAbbreviations( TAbbreviations value );

    /**
     * Returns the value of the '<em><b>Enumerations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Enumerations added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enumerations</em>' containment reference.
     * @see #setEnumerations(TEnumerations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Enumerations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Enumerations' namespace='##targetNamespace'"
     * @generated
     */
    TEnumerations getEnumerations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getEnumerations <em>Enumerations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumerations</em>' containment reference.
     * @see #getEnumerations()
     * @generated
     */
    void setEnumerations( TEnumerations value );

    /**
     * Returns the value of the '<em><b>Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Constructed Attributes added by this namespace. Constructed Attributes are not allowed to be extended by another namespace. Note: shall only be used in practice by the 7-3
     * <!-- end-model-doc -->
     * @return the value of the '<em>Constructed Attributes</em>' containment reference.
     * @see #setConstructedAttributes(TConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_ConstructedAttributes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ConstructedAttributes' namespace='##targetNamespace'"
     * @generated
     */
    TConstructedAttributes getConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getConstructedAttributes <em>Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constructed Attributes</em>' containment reference.
     * @see #getConstructedAttributes()
     * @generated
     */
    void setConstructedAttributes( TConstructedAttributes value );

    /**
     * Returns the value of the '<em><b>CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of CDCs added by this namespace. CDCs are not allowed to be extended by another namespace. Note: shall only be used in practice by the 7-3
     * <!-- end-model-doc -->
     * @return the value of the '<em>CD Cs</em>' containment reference.
     * @see #setCDCs(TCDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_CDCs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CDCs' namespace='##targetNamespace'"
     * @generated
     */
    TCDCs getCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getCDCs <em>CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CD Cs</em>' containment reference.
     * @see #getCDCs()
     * @generated
     */
    void setCDCs( TCDCs value );

    /**
     * Returns the value of the '<em><b>LN Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of LNClasses added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones).
     * <!-- end-model-doc -->
     * @return the value of the '<em>LN Classes</em>' containment reference.
     * @see #setLNClasses(TLNClasses)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_LNClasses()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='LNClasses' namespace='##targetNamespace'"
     * @generated
     */
    TLNClasses getLNClasses();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getLNClasses <em>LN Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LN Classes</em>' containment reference.
     * @see #getLNClasses()
     * @generated
     */
    void setLNClasses( TLNClasses value );

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to a full description of this NS.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_DescID()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocID"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc ID</em>' attribute.
     * @see #getDescID()
     * @generated
     */
    void setDescID( String value );

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier of the namespace, e.g., "IEC 61850-7-4", "(Tr)IEC 61850-90-4".
     * <!-- end-model-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Id()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSIdentifier" required="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId( String value );

    /**
     * Returns the value of the '<em><b>Publication Stage</b></em>' attribute.
     * The default value is <code>"IS"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The publication stage of the namespace, by default IS.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #setPublicationStage(TPubStage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    TPubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publication Stage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
     * @see #isSetPublicationStage()
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @generated
     */
    void setPublicationStage( TPubStage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(TPubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPublicationStage <em>Publication Stage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Publication Stage</em>' attribute is set.
     * @see #unsetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(TPubStage)
     * @generated
     */
    boolean isSetPublicationStage();

    /**
     * Returns the value of the '<em><b>Release</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Release of the namespace version and revision, by default 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Release</em>' attribute.
     * @see #isSetRelease()
     * @see #unsetRelease()
     * @see #setRelease(short)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Release()
     * @model default="1" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSRelease"
     *        extendedMetaData="kind='attribute' name='release'"
     * @generated
     */
    short getRelease();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Release</em>' attribute.
     * @see #isSetRelease()
     * @see #unsetRelease()
     * @see #getRelease()
     * @generated
     */
    void setRelease( short value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelease()
     * @see #getRelease()
     * @see #setRelease(short)
     * @generated
     */
    void unsetRelease();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRelease <em>Release</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Release</em>' attribute is set.
     * @see #unsetRelease()
     * @see #getRelease()
     * @see #setRelease(short)
     * @generated
     */
    boolean isSetRelease();

    /**
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * The default value is <code>"A"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Revision of the namespace version, by default 'A'.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Revision()
     * @model default="A" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSRevision"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRevision <em>Revision</em>}' attribute is set.
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
     * <!-- begin-model-doc -->
     * UTC Date and time of the UML version from which this namespace definition file was generated. Shall be provided if umlVersion is present. Format: YYYY-MM-DDThh:mm:ssZ, where: YYYY indicates the year, MM indicates the month, DD indicates the day, T indicates the start of the required time section, hh indicates the hour, mm indicates the minute, ss indicates the second, and Z the UTC time stamp indication.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uml Date</em>' attribute.
     * @see #setUmlDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_UmlDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Date</em>' attribute.
     * @see #getUmlDate()
     * @generated
     */
    void setUmlDate( XMLGregorianCalendar value );

    /**
     * Returns the value of the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Version of UML from which this namespace definition file was generated from.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uml Version</em>' attribute.
     * @see #setUmlVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_UmlVersion()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUMLVersion"
     *        extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Version</em>' attribute.
     * @see #getUmlVersion()
     * @generated
     */
    void setUmlVersion( String value );

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Version (year) of the namespace.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTNS_Version()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSVersion" required="true"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    int getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #getVersion()
     * @generated
     */
    void setVersion( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(int)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(int)
     * @generated
     */
    boolean isSetVersion();

} // TNS
