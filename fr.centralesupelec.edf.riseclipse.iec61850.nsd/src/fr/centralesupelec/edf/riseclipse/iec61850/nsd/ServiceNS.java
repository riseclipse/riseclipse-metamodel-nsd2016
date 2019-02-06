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
 * A representation of the model object '<em><b>Service NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlVersion <em>Uml Version</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS()
 * @model extendedMetaData="name='tServiceNS' kind='elementOnly'"
 * @generated
 */
public interface ServiceNS extends Copyrighted, NSDObjectWithVersionAndRelease {
    /**
     * Returns the value of the '<em><b>Changes</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changes</em>' containment reference.
     * @see #isSetChanges()
     * @see #unsetChanges()
     * @see #setChanges(Changes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_Changes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Changes' namespace='##targetNamespace'"
     * @generated
     */
    Changes getChanges();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChanges()
     * @see #getChanges()
     * @see #setChanges(Changes)
     * @generated
     */
    void unsetChanges();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}' containment reference is set.
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
     * Returns the value of the '<em><b>Functional Constraints</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functional Constraints</em>' containment reference.
     * @see #isSetFunctionalConstraints()
     * @see #unsetFunctionalConstraints()
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_FunctionalConstraints()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='FunctionalConstraints' namespace='##targetNamespace'"
     * @generated
     */
    FunctionalConstraints getFunctionalConstraints();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunctionalConstraints()
     * @see #getFunctionalConstraints()
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @generated
     */
    void unsetFunctionalConstraints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}' containment reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presence Conditions</em>' containment reference.
     * @see #isSetPresenceConditions()
     * @see #unsetPresenceConditions()
     * @see #setPresenceConditions(PresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_PresenceConditions()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='PresenceConditions' namespace='##targetNamespace'"
     * @generated
     */
    PresenceConditions getPresenceConditions();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPresenceConditions()
     * @see #getPresenceConditions()
     * @see #setPresenceConditions(PresenceConditions)
     * @generated
     */
    void unsetPresenceConditions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}' containment reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbreviations</em>' containment reference.
     * @see #isSetAbbreviations()
     * @see #unsetAbbreviations()
     * @see #setAbbreviations(Abbreviations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_Abbreviations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Abbreviations' namespace='##targetNamespace'"
     * @generated
     */
    Abbreviations getAbbreviations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbbreviations()
     * @see #getAbbreviations()
     * @see #setAbbreviations(Abbreviations)
     * @generated
     */
    void unsetAbbreviations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}' containment reference is set.
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
     * Returns the value of the '<em><b>Service Type Realizations</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type Realizations</em>' containment reference.
     * @see #isSetServiceTypeRealizations()
     * @see #unsetServiceTypeRealizations()
     * @see #setServiceTypeRealizations(ServiceTypeRealizations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_ServiceTypeRealizations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceTypeRealizations' namespace='##targetNamespace'"
     * @generated
     */
    ServiceTypeRealizations getServiceTypeRealizations();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Type Realizations</em>' containment reference.
     * @see #isSetServiceTypeRealizations()
     * @see #unsetServiceTypeRealizations()
     * @see #getServiceTypeRealizations()
     * @generated
     */
    void setServiceTypeRealizations( ServiceTypeRealizations value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceTypeRealizations()
     * @see #getServiceTypeRealizations()
     * @see #setServiceTypeRealizations(ServiceTypeRealizations)
     * @generated
     */
    void unsetServiceTypeRealizations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Type Realizations</em>' containment reference is set.
     * @see #unsetServiceTypeRealizations()
     * @see #getServiceTypeRealizations()
     * @see #setServiceTypeRealizations(ServiceTypeRealizations)
     * @generated
     */
    boolean isSetServiceTypeRealizations();

    /**
     * Returns the value of the '<em><b>Service Constructed Attributes</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Constructed Attributes</em>' containment reference.
     * @see #isSetServiceConstructedAttributes()
     * @see #unsetServiceConstructedAttributes()
     * @see #setServiceConstructedAttributes(ServiceConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_ServiceConstructedAttributes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceConstructedAttributes' namespace='##targetNamespace'"
     * @generated
     */
    ServiceConstructedAttributes getServiceConstructedAttributes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Constructed Attributes</em>' containment reference.
     * @see #isSetServiceConstructedAttributes()
     * @see #unsetServiceConstructedAttributes()
     * @see #getServiceConstructedAttributes()
     * @generated
     */
    void setServiceConstructedAttributes( ServiceConstructedAttributes value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceConstructedAttributes()
     * @see #getServiceConstructedAttributes()
     * @see #setServiceConstructedAttributes(ServiceConstructedAttributes)
     * @generated
     */
    void unsetServiceConstructedAttributes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Constructed Attributes</em>' containment reference is set.
     * @see #unsetServiceConstructedAttributes()
     * @see #getServiceConstructedAttributes()
     * @see #setServiceConstructedAttributes(ServiceConstructedAttributes)
     * @generated
     */
    boolean isSetServiceConstructedAttributes();

    /**
     * Returns the value of the '<em><b>Service CD Cs</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service CD Cs</em>' containment reference.
     * @see #isSetServiceCDCs()
     * @see #unsetServiceCDCs()
     * @see #setServiceCDCs(ServiceCDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_ServiceCDCs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceNS
     * @model opposite="serviceNS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ServiceCDCs' namespace='##targetNamespace'"
     * @generated
     */
    ServiceCDCs getServiceCDCs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service CD Cs</em>' containment reference.
     * @see #isSetServiceCDCs()
     * @see #unsetServiceCDCs()
     * @see #getServiceCDCs()
     * @generated
     */
    void setServiceCDCs( ServiceCDCs value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceCDCs()
     * @see #getServiceCDCs()
     * @see #setServiceCDCs(ServiceCDCs)
     * @generated
     */
    void unsetServiceCDCs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service CD Cs</em>' containment reference is set.
     * @see #unsetServiceCDCs()
     * @see #getServiceCDCs()
     * @see #setServiceCDCs(ServiceCDCs)
     * @generated
     */
    boolean isSetServiceCDCs();

    /**
     * Returns the value of the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc ID</em>' attribute.
     * @see #isSetDescID()
     * @see #unsetDescID()
     * @see #setDescID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_DescID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='descID'"
     * @generated
     */
    String getDescID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getDescID <em>Desc ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getDescID <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescID()
     * @see #getDescID()
     * @see #setDescID(String)
     * @generated
     */
    void unsetDescID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getDescID <em>Desc ID</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_Id()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getId <em>Id</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getId <em>Id</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_PublicationStage()
     * @model default="IS" unsettable="true"
     *        extendedMetaData="kind='attribute' name='publicationStage'"
     * @generated
     */
    PubStage getPublicationStage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPublicationStage <em>Publication Stage</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPublicationStage <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublicationStage()
     * @see #getPublicationStage()
     * @see #setPublicationStage(PubStage)
     * @generated
     */
    void unsetPublicationStage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPublicationStage <em>Publication Stage</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_Revision()
     * @model default="A" unsettable="true"
     *        extendedMetaData="kind='attribute' name='revision'"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRevision <em>Revision</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_UmlDate()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
     *        extendedMetaData="kind='attribute' name='umlDate'"
     * @generated
     */
    XMLGregorianCalendar getUmlDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlDate <em>Uml Date</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlDate <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlDate()
     * @see #getUmlDate()
     * @see #setUmlDate(XMLGregorianCalendar)
     * @generated
     */
    void unsetUmlDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlDate <em>Uml Date</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_UmlVersion()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='umlVersion'"
     * @generated
     */
    String getUmlVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlVersion <em>Uml Version</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlVersion <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    void unsetUmlVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlVersion <em>Uml Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uml Version</em>' attribute is set.
     * @see #unsetUmlVersion()
     * @see #getUmlVersion()
     * @see #setUmlVersion(String)
     * @generated
     */
    boolean isSetUmlVersion();

} // ServiceNS
