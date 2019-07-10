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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage
 * @generated
 */
public interface NsdFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NsdFactory eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Applies To Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Applies To Type</em>'.
     * @generated
     */
    AppliesToType createAppliesToType();

    /**
     * Returns a new object of class '<em>Depends On</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Depends On</em>'.
     * @generated
     */
    DependsOn createDependsOn();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Service Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Type</em>'.
     * @generated
     */
    ServiceType createServiceType();

    /**
     * Returns a new object of class '<em>Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abbreviation</em>'.
     * @generated
     */
    Abbreviation createAbbreviation();

    /**
     * Returns a new object of class '<em>Abbreviations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abbreviations</em>'.
     * @generated
     */
    Abbreviations createAbbreviations();

    /**
     * Returns a new object of class '<em>Abstract LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstract LN Class</em>'.
     * @generated
     */
    AbstractLNClass createAbstractLNClass();

    /**
     * Returns a new object of class '<em>Applicable Service NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Applicable Service NS</em>'.
     * @generated
     */
    ApplicableServiceNS createApplicableServiceNS();

    /**
     * Returns a new object of class '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Applicable Services</em>'.
     * @generated
     */
    ApplicableServices createApplicableServices();

    /**
     * Returns a new object of class '<em>Basic Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Basic Type</em>'.
     * @generated
     */
    BasicType createBasicType();

    /**
     * Returns a new object of class '<em>Basic Types</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Basic Types</em>'.
     * @generated
     */
    BasicTypes createBasicTypes();

    /**
     * Returns a new object of class '<em>CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CDC</em>'.
     * @generated
     */
    CDC createCDC();

    /**
     * Returns a new object of class '<em>CD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Cs</em>'.
     * @generated
     */
    CDCs createCDCs();

    /**
     * Returns a new object of class '<em>Changes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Changes</em>'.
     * @generated
     */
    Changes createChanges();

    /**
     * Returns a new object of class '<em>Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constructed Attribute</em>'.
     * @generated
     */
    ConstructedAttribute createConstructedAttribute();

    /**
     * Returns a new object of class '<em>Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constructed Attributes</em>'.
     * @generated
     */
    ConstructedAttributes createConstructedAttributes();

    /**
     * Returns a new object of class '<em>Copyrighted</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Copyrighted</em>'.
     * @generated
     */
    Copyrighted createCopyrighted();

    /**
     * Returns a new object of class '<em>Copyright Notice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Copyright Notice</em>'.
     * @generated
     */
    CopyrightNotice createCopyrightNotice();

    /**
     * Returns a new object of class '<em>Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Attribute</em>'.
     * @generated
     */
    DataAttribute createDataAttribute();

    /**
     * Returns a new object of class '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Object</em>'.
     * @generated
     */
    DataObject createDataObject();

    /**
     * Returns a new object of class '<em>Data Set Member Of</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set Member Of</em>'.
     * @generated
     */
    DataSetMemberOf createDataSetMemberOf();

    /**
     * Returns a new object of class '<em>Doc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Doc</em>'.
     * @generated
     */
    Doc createDoc();

    /**
     * Returns a new object of class '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration</em>'.
     * @generated
     */
    Enumeration createEnumeration();

    /**
     * Returns a new object of class '<em>Enumerations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumerations</em>'.
     * @generated
     */
    Enumerations createEnumerations();

    /**
     * Returns a new object of class '<em>Functional Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Constraint</em>'.
     * @generated
     */
    FunctionalConstraint createFunctionalConstraint();

    /**
     * Returns a new object of class '<em>Functional Constraints</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Functional Constraints</em>'.
     * @generated
     */
    FunctionalConstraints createFunctionalConstraints();

    /**
     * Returns a new object of class '<em>License</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>License</em>'.
     * @generated
     */
    License createLicense();

    /**
     * Returns a new object of class '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal</em>'.
     * @generated
     */
    Literal createLiteral();

    /**
     * Returns a new object of class '<em>LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LN Class</em>'.
     * @generated
     */
    LNClass createLNClass();

    /**
     * Returns a new object of class '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LN Classes</em>'.
     * @generated
     */
    LNClasses createLNClasses();

    /**
     * Returns a new object of class '<em>Notice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Notice</em>'.
     * @generated
     */
    Notice createNotice();

    /**
     * Returns a new object of class '<em>NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>NS</em>'.
     * @generated
     */
    NS createNS();

    /**
     * Returns a new object of class '<em>NS Doc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>NS Doc</em>'.
     * @generated
     */
    NSDoc createNSDoc();

    /**
     * Returns a new object of class '<em>Presence Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Presence Condition</em>'.
     * @generated
     */
    PresenceCondition createPresenceCondition();

    /**
     * Returns a new object of class '<em>Presence Conditions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Presence Conditions</em>'.
     * @generated
     */
    PresenceConditions createPresenceConditions();

    /**
     * Returns a new object of class '<em>Service CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service CDC</em>'.
     * @generated
     */
    ServiceCDC createServiceCDC();

    /**
     * Returns a new object of class '<em>Service CD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service CD Cs</em>'.
     * @generated
     */
    ServiceCDCs createServiceCDCs();

    /**
     * Returns a new object of class '<em>Service Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Constructed Attribute</em>'.
     * @generated
     */
    ServiceConstructedAttribute createServiceConstructedAttribute();

    /**
     * Returns a new object of class '<em>Service Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Constructed Attributes</em>'.
     * @generated
     */
    ServiceConstructedAttributes createServiceConstructedAttributes();

    /**
     * Returns a new object of class '<em>Service Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Data Attribute</em>'.
     * @generated
     */
    ServiceDataAttribute createServiceDataAttribute();

    /**
     * Returns a new object of class '<em>Service NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service NS</em>'.
     * @generated
     */
    ServiceNS createServiceNS();

    /**
     * Returns a new object of class '<em>Service Ns Usage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Ns Usage</em>'.
     * @generated
     */
    ServiceNsUsage createServiceNsUsage();

    /**
     * Returns a new object of class '<em>Service Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Parameter</em>'.
     * @generated
     */
    ServiceParameter createServiceParameter();

    /**
     * Returns a new object of class '<em>Service Type Realizations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Type Realizations</em>'.
     * @generated
     */
    ServiceTypeRealizations createServiceTypeRealizations();

    /**
     * Returns a new object of class '<em>Sub Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Data Attribute</em>'.
     * @generated
     */
    SubDataAttribute createSubDataAttribute();

    /**
     * Returns a new object of class '<em>Sub Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Data Object</em>'.
     * @generated
     */
    SubDataObject createSubDataObject();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    NsdPackage getNsdPackage();

} //NsdFactory
