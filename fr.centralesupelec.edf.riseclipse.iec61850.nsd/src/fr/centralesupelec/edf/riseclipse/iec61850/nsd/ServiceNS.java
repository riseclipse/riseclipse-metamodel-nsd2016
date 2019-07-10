/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

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
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS()
 * @model extendedMetaData="name='tServiceNS' kind='elementOnly'"
 * @generated
 */
public interface ServiceNS extends Copyrighted, AgNSIdentification, AgUML, AgNSdesc {
    /**
     * Returns the value of the '<em><b>Changes</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changes</em>' containment reference.
     * @see #isSetChanges()
     * @see #unsetChanges()
     * @see #setChanges(Changes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_Changes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functional Constraints</em>' containment reference.
     * @see #isSetFunctionalConstraints()
     * @see #unsetFunctionalConstraints()
     * @see #setFunctionalConstraints(FunctionalConstraints)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_FunctionalConstraints()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presence Conditions</em>' containment reference.
     * @see #isSetPresenceConditions()
     * @see #unsetPresenceConditions()
     * @see #setPresenceConditions(PresenceConditions)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_PresenceConditions()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbreviations</em>' containment reference.
     * @see #isSetAbbreviations()
     * @see #unsetAbbreviations()
     * @see #setAbbreviations(Abbreviations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_Abbreviations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Type Realizations</em>' containment reference.
     * @see #isSetServiceTypeRealizations()
     * @see #unsetServiceTypeRealizations()
     * @see #setServiceTypeRealizations(ServiceTypeRealizations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_ServiceTypeRealizations()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Constructed Attributes</em>' containment reference.
     * @see #isSetServiceConstructedAttributes()
     * @see #unsetServiceConstructedAttributes()
     * @see #setServiceConstructedAttributes(ServiceConstructedAttributes)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_ServiceConstructedAttributes()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service CD Cs</em>' containment reference.
     * @see #isSetServiceCDCs()
     * @see #unsetServiceCDCs()
     * @see #setServiceCDCs(ServiceCDCs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getServiceNS_ServiceCDCs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getParentServiceNS
     * @model opposite="parentServiceNS" containment="true" unsettable="true" ordered="false"
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

} // ServiceNS
