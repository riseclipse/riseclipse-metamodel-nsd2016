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
     * Returns a new object of class '<em>Depends On Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Depends On Type</em>'.
     * @generated
     */
    DependsOnType createDependsOnType();

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
     * Returns a new object of class '<em>TAbbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TAbbreviation</em>'.
     * @generated
     */
    TAbbreviation createTAbbreviation();

    /**
     * Returns a new object of class '<em>TAbbreviations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TAbbreviations</em>'.
     * @generated
     */
    TAbbreviations createTAbbreviations();

    /**
     * Returns a new object of class '<em>TAbstract LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TAbstract LN Class</em>'.
     * @generated
     */
    TAbstractLNClass createTAbstractLNClass();

    /**
     * Returns a new object of class '<em>TApplicable Service NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TApplicable Service NS</em>'.
     * @generated
     */
    TApplicableServiceNS createTApplicableServiceNS();

    /**
     * Returns a new object of class '<em>TApplicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TApplicable Services</em>'.
     * @generated
     */
    TApplicableServices createTApplicableServices();

    /**
     * Returns a new object of class '<em>TBasic Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TBasic Type</em>'.
     * @generated
     */
    TBasicType createTBasicType();

    /**
     * Returns a new object of class '<em>TBasic Types</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TBasic Types</em>'.
     * @generated
     */
    TBasicTypes createTBasicTypes();

    /**
     * Returns a new object of class '<em>TCDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TCDC</em>'.
     * @generated
     */
    TCDC createTCDC();

    /**
     * Returns a new object of class '<em>TCD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TCD Cs</em>'.
     * @generated
     */
    TCDCs createTCDCs();

    /**
     * Returns a new object of class '<em>TChanges</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TChanges</em>'.
     * @generated
     */
    TChanges createTChanges();

    /**
     * Returns a new object of class '<em>TConstructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TConstructed Attribute</em>'.
     * @generated
     */
    TConstructedAttribute createTConstructedAttribute();

    /**
     * Returns a new object of class '<em>TConstructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TConstructed Attributes</em>'.
     * @generated
     */
    TConstructedAttributes createTConstructedAttributes();

    /**
     * Returns a new object of class '<em>TCopyrighted</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TCopyrighted</em>'.
     * @generated
     */
    TCopyrighted createTCopyrighted();

    /**
     * Returns a new object of class '<em>TCopyright Notice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TCopyright Notice</em>'.
     * @generated
     */
    TCopyrightNotice createTCopyrightNotice();

    /**
     * Returns a new object of class '<em>TData Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TData Attribute</em>'.
     * @generated
     */
    TDataAttribute createTDataAttribute();

    /**
     * Returns a new object of class '<em>TData Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TData Object</em>'.
     * @generated
     */
    TDataObject createTDataObject();

    /**
     * Returns a new object of class '<em>TData Set Member Of</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TData Set Member Of</em>'.
     * @generated
     */
    TDataSetMemberOf createTDataSetMemberOf();

    /**
     * Returns a new object of class '<em>TDoc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDoc</em>'.
     * @generated
     */
    TDoc createTDoc();

    /**
     * Returns a new object of class '<em>TDocumented Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDocumented Class</em>'.
     * @generated
     */
    TDocumentedClass createTDocumentedClass();

    /**
     * Returns a new object of class '<em>TEnumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TEnumeration</em>'.
     * @generated
     */
    TEnumeration createTEnumeration();

    /**
     * Returns a new object of class '<em>TEnumerations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TEnumerations</em>'.
     * @generated
     */
    TEnumerations createTEnumerations();

    /**
     * Returns a new object of class '<em>TFunctional Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TFunctional Constraint</em>'.
     * @generated
     */
    TFunctionalConstraint createTFunctionalConstraint();

    /**
     * Returns a new object of class '<em>TFunctional Constraints</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TFunctional Constraints</em>'.
     * @generated
     */
    TFunctionalConstraints createTFunctionalConstraints();

    /**
     * Returns a new object of class '<em>TLicense</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TLicense</em>'.
     * @generated
     */
    TLicense createTLicense();

    /**
     * Returns a new object of class '<em>TLiteral</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TLiteral</em>'.
     * @generated
     */
    TLiteral createTLiteral();

    /**
     * Returns a new object of class '<em>TLN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TLN Class</em>'.
     * @generated
     */
    TLNClass createTLNClass();

    /**
     * Returns a new object of class '<em>TLN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TLN Classes</em>'.
     * @generated
     */
    TLNClasses createTLNClasses();

    /**
     * Returns a new object of class '<em>TNotice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TNotice</em>'.
     * @generated
     */
    TNotice createTNotice();

    /**
     * Returns a new object of class '<em>TNS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TNS</em>'.
     * @generated
     */
    TNS createTNS();

    /**
     * Returns a new object of class '<em>TNS Doc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TNS Doc</em>'.
     * @generated
     */
    TNSDoc createTNSDoc();

    /**
     * Returns a new object of class '<em>TPresence Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TPresence Condition</em>'.
     * @generated
     */
    TPresenceCondition createTPresenceCondition();

    /**
     * Returns a new object of class '<em>TPresence Conditions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TPresence Conditions</em>'.
     * @generated
     */
    TPresenceConditions createTPresenceConditions();

    /**
     * Returns a new object of class '<em>TService CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService CDC</em>'.
     * @generated
     */
    TServiceCDC createTServiceCDC();

    /**
     * Returns a new object of class '<em>TService CD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService CD Cs</em>'.
     * @generated
     */
    TServiceCDCs createTServiceCDCs();

    /**
     * Returns a new object of class '<em>TService Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Constructed Attribute</em>'.
     * @generated
     */
    TServiceConstructedAttribute createTServiceConstructedAttribute();

    /**
     * Returns a new object of class '<em>TService Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Constructed Attributes</em>'.
     * @generated
     */
    TServiceConstructedAttributes createTServiceConstructedAttributes();

    /**
     * Returns a new object of class '<em>TService Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Data Attribute</em>'.
     * @generated
     */
    TServiceDataAttribute createTServiceDataAttribute();

    /**
     * Returns a new object of class '<em>TService NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService NS</em>'.
     * @generated
     */
    TServiceNS createTServiceNS();

    /**
     * Returns a new object of class '<em>TService Ns Usage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Ns Usage</em>'.
     * @generated
     */
    TServiceNsUsage createTServiceNsUsage();

    /**
     * Returns a new object of class '<em>TService Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Parameter</em>'.
     * @generated
     */
    TServiceParameter createTServiceParameter();

    /**
     * Returns a new object of class '<em>TService Type Realization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Type Realization</em>'.
     * @generated
     */
    TServiceTypeRealization createTServiceTypeRealization();

    /**
     * Returns a new object of class '<em>TService Type Realizations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TService Type Realizations</em>'.
     * @generated
     */
    TServiceTypeRealizations createTServiceTypeRealizations();

    /**
     * Returns a new object of class '<em>TSub Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TSub Data Attribute</em>'.
     * @generated
     */
    TSubDataAttribute createTSubDataAttribute();

    /**
     * Returns a new object of class '<em>TSub Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TSub Data Object</em>'.
     * @generated
     */
    TSubDataObject createTSubDataObject();

    /**
     * Returns a new object of class '<em>TTitled Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TTitled Class</em>'.
     * @generated
     */
    TTitledClass createTTitledClass();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    NsdPackage getNsdPackage();

} //NsdFactory
