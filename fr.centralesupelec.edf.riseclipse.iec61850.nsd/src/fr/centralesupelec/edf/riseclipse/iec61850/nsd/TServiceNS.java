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
 * A representation of the model object '<em><b>TService NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a service namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceCDCs <em>Service CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS()
 * @model extendedMetaData="name='tServiceNS' kind='elementOnly'"
 * @generated
 */
public interface TServiceNS extends TCopyrighted {
    /**
     * Returns the value of the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The version/revision/release this namespace is based on, including the TISSUEs implemented in this release.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Changes</em>' containment reference.
     * @see #setChanges(TChanges)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_Changes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Changes' namespace='##targetNamespace'"
     * @generated
     */
    TChanges getChanges();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getChanges <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changes</em>' containment reference.
     * @see #getChanges()
     * @generated
     */
    void setChanges( TChanges value );

    /**
     * Returns the value of the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of Functional Constraints added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Constraints</em>' containment reference.
     * @see #setFunctionalConstraints(TFunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_FunctionalConstraints()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FunctionalConstraints' namespace='##targetNamespace'"
     * @generated
     */
    TFunctionalConstraints getFunctionalConstraints();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
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
     * List of presence conditions added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Presence Conditions</em>' containment reference.
     * @see #setPresenceConditions(TPresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_PresenceConditions()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='PresenceConditions' namespace='##targetNamespace'"
     * @generated
     */
    TPresenceConditions getPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_Abbreviations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Abbreviations' namespace='##targetNamespace'"
     * @generated
     */
    TAbbreviations getAbbreviations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getAbbreviations <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviations</em>' containment reference.
     * @see #getAbbreviations()
     * @generated
     */
    void setAbbreviations( TAbbreviations value );

    /**
     * Returns the value of the '<em><b>Service Type Realizations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of service type realization added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service Type Realizations</em>' containment reference.
     * @see #setServiceTypeRealizations(TServiceTypeRealizations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_ServiceTypeRealizations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ServiceTypeRealizations' namespace='##targetNamespace'"
     * @generated
     */
    TServiceTypeRealizations getServiceTypeRealizations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Type Realizations</em>' containment reference.
     * @see #getServiceTypeRealizations()
     * @generated
     */
    void setServiceTypeRealizations( TServiceTypeRealizations value );

    /**
     * Returns the value of the '<em><b>Service Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of service constructed attributes added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service Constructed Attributes</em>' containment reference.
     * @see #setServiceConstructedAttributes(TServiceConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_ServiceConstructedAttributes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ServiceConstructedAttributes' namespace='##targetNamespace'"
     * @generated
     */
    TServiceConstructedAttributes getServiceConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Constructed Attributes</em>' containment reference.
     * @see #getServiceConstructedAttributes()
     * @generated
     */
    void setServiceConstructedAttributes( TServiceConstructedAttributes value );

    /**
     * Returns the value of the '<em><b>Service CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of service CDCs added by this namespace. Is cumulative to those defined in namespaces this one needs (may not redefine "included" ones.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service CD Cs</em>' containment reference.
     * @see #setServiceCDCs(TServiceCDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_ServiceCDCs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ServiceCDCs' namespace='##targetNamespace'"
     * @generated
     */
    TServiceCDCs getServiceCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceCDCs <em>Service CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service CD Cs</em>' containment reference.
     * @see #getServiceCDCs()
     * @generated
     */
    void setServiceCDCs( TServiceCDCs value );

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Documentation identifier referring to a full description of this NS.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_DescID()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocID"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getDescID <em>Desc ID</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_Id()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSIdentifier" required="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getId <em>Id</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    TPubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPublicationStage <em>Publication Stage</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(TPubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPublicationStage <em>Publication Stage</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_Release()
     * @model default="1" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSRelease"
     *        extendedMetaData="kind='attribute' name='release'"
     * @generated
     */
    short getRelease();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRelease <em>Release</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRelease <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelease()
     * @see #getRelease()
     * @see #setRelease(short)
     * @generated
     */
    void unsetRelease();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRelease <em>Release</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_Revision()
     * @model default="A" unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSRevision"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRevision <em>Revision</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_UmlDate()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlDate <em>Uml Date</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_UmlVersion()
     * @model dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUMLVersion"
     *        extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlVersion <em>Uml Version</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getTServiceNS_Version()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSVersion" required="true"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    int getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getVersion <em>Version</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(int)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(int)
     * @generated
     */
    boolean isSetVersion();

} // TServiceNS
