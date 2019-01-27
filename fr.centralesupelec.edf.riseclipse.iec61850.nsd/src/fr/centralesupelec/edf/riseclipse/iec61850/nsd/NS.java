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
 * <!-- begin-model-doc -->
 * Definition of a namespace.
 * <!-- end-model-doc -->
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The version/revision/release this namespace is based on, including the TISSUEs implemented in this release.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Changes</em>' containment reference.
     * @see #setChanges(Changes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Changes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Changes' namespace='##targetNamespace'"
     * @generated
     */
    Changes getChanges();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changes</em>' containment reference.
     * @see #getChanges()
     * @generated
     */
    void setChanges( Changes value );

    /**
     * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The namespace identification this namespace depends on (and whose definitions are imported into this one).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Depends On</em>' containment reference.
     * @see #setDependsOn(DependsOnType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_DependsOn()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DependsOn' namespace='##targetNamespace'"
     * @generated
     */
    DependsOnType getDependsOn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}' containment reference.
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
     * @see #setBasicTypes(BasicTypes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_BasicTypes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='BasicTypes' namespace='##targetNamespace'"
     * @generated
     */
    BasicTypes getBasicTypes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Types</em>' containment reference.
     * @see #getBasicTypes()
     * @generated
     */
    void setBasicTypes( BasicTypes value );

    /**
     * Returns the value of the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Functional Constraints added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Constraints</em>' containment reference.
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_FunctionalConstraints()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FunctionalConstraints' namespace='##targetNamespace'"
     * @generated
     */
    FunctionalConstraints getFunctionalConstraints();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Functional Constraints</em>' containment reference.
     * @see #getFunctionalConstraints()
     * @generated
     */
    void setFunctionalConstraints( FunctionalConstraints value );

    /**
     * Returns the value of the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of presence conditions added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Presence Conditions</em>' containment reference.
     * @see #setPresenceConditions(PresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_PresenceConditions()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='PresenceConditions' namespace='##targetNamespace'"
     * @generated
     */
    PresenceConditions getPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Presence Conditions</em>' containment reference.
     * @see #getPresenceConditions()
     * @generated
     */
    void setPresenceConditions( PresenceConditions value );

    /**
     * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of abbreviations added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Abbreviations</em>' containment reference.
     * @see #setAbbreviations(Abbreviations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Abbreviations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Abbreviations' namespace='##targetNamespace'"
     * @generated
     */
    Abbreviations getAbbreviations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviations</em>' containment reference.
     * @see #getAbbreviations()
     * @generated
     */
    void setAbbreviations( Abbreviations value );

    /**
     * Returns the value of the '<em><b>Enumerations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Enumerations added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enumerations</em>' containment reference.
     * @see #setEnumerations(Enumerations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Enumerations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Enumerations' namespace='##targetNamespace'"
     * @generated
     */
    Enumerations getEnumerations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumerations</em>' containment reference.
     * @see #getEnumerations()
     * @generated
     */
    void setEnumerations( Enumerations value );

    /**
     * Returns the value of the '<em><b>Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Constructed Attributes added by this namespace. Constructed Attributes are not allowed to be extended by another namespace. Note: shall only be used in practice by the 7-3
     * <!-- end-model-doc -->
     * @return the value of the '<em>Constructed Attributes</em>' containment reference.
     * @see #setConstructedAttributes(ConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_ConstructedAttributes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ConstructedAttributes' namespace='##targetNamespace'"
     * @generated
     */
    ConstructedAttributes getConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constructed Attributes</em>' containment reference.
     * @see #getConstructedAttributes()
     * @generated
     */
    void setConstructedAttributes( ConstructedAttributes value );

    /**
     * Returns the value of the '<em><b>CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of CDCs added by this namespace. CDCs are not allowed to be extended by another namespace. Note: shall only be used in practice by the 7-3
     * <!-- end-model-doc -->
     * @return the value of the '<em>CD Cs</em>' containment reference.
     * @see #setCDCs(CDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_CDCs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CDCs' namespace='##targetNamespace'"
     * @generated
     */
    CDCs getCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CD Cs</em>' containment reference.
     * @see #getCDCs()
     * @generated
     */
    void setCDCs( CDCs value );

    /**
     * Returns the value of the '<em><b>LN Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of LNClasses added by this namespace. Is cumulative to those defined in namespaces this one DependsOn (may not redefine "included" ones).
     * <!-- end-model-doc -->
     * @return the value of the '<em>LN Classes</em>' containment reference.
     * @see #setLNClasses(LNClasses)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_LNClasses()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='LNClasses' namespace='##targetNamespace'"
     * @generated
     */
    LNClasses getLNClasses();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LN Classes</em>' containment reference.
     * @see #getLNClasses()
     * @generated
     */
    void setLNClasses( LNClasses value );

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to a full description of this NS.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_DescID()
     * @model extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID <em>Desc ID</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_Id()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId <em>Id</em>}' attribute.
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
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The publication stage of the namespace, by default IS.
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * Revision of the namespace version, by default 'A'.
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * UTC Date and time of the UML version from which this namespace definition file was generated. Shall be provided if umlVersion is present. Format: YYYY-MM-DDThh:mm:ssZ, where: YYYY indicates the year, MM indicates the month, DD indicates the day, T indicates the start of the required time section, hh indicates the hour, mm indicates the minute, ss indicates the second, and Z the UTC time stamp indication.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uml Date</em>' attribute.
     * @see #setUmlDate(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_UmlDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate <em>Uml Date</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getNS_UmlVersion()
     * @model extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Version</em>' attribute.
     * @see #getUmlVersion()
     * @generated
     */
    void setUmlVersion( String value );

} // NS
