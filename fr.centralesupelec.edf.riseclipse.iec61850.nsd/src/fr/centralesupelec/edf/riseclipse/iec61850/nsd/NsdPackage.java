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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface NsdPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "nsd";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.iec.ch/61850/2016/NSD";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "nsd";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NsdPackage eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl.init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSIdentificationImpl <em>Ag NS Identification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSIdentificationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgNSIdentification()
     * @generated
     */
    int AG_NS_IDENTIFICATION = 50;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAppliesToType()
     * @generated
     */
    int APPLIES_TO_TYPE = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl <em>Depends On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDependsOn()
     * @generated
     */
    int DEPENDS_ON = 1;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 2;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl <em>Service Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceType()
     * @generated
     */
    int SERVICE_TYPE = 3;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviation()
     * @generated
     */
    int ABBREVIATION = 4;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl <em>Abbreviations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviations()
     * @generated
     */
    int ABBREVIATIONS = 5;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl <em>Documented Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentedClass()
     * @generated
     */
    int DOCUMENTED_CLASS = 23;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl <em>Titled Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTitledClass()
     * @generated
     */
    int TITLED_CLASS = 48;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl <em>Any LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAnyLNClass()
     * @generated
     */
    int ANY_LN_CLASS = 7;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl <em>Abstract LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbstractLNClass()
     * @generated
     */
    int ABSTRACT_LN_CLASS = 6;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl <em>Copyrighted</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrighted()
     * @generated
     */
    int COPYRIGHTED = 17;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl <em>Applicable Service NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServiceNS()
     * @generated
     */
    int APPLICABLE_SERVICE_NS = 8;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl <em>Applicable Services</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServices()
     * @generated
     */
    int APPLICABLE_SERVICES = 9;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicType()
     * @generated
     */
    int BASIC_TYPE = 10;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl <em>Basic Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicTypes()
     * @generated
     */
    int BASIC_TYPES = 11;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl <em>CDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDC()
     * @generated
     */
    int CDC = 12;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl <em>CD Cs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDCs()
     * @generated
     */
    int CD_CS = 13;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl <em>Changes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getChanges()
     * @generated
     */
    int CHANGES = 14;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl <em>Constructed Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttribute()
     * @generated
     */
    int CONSTRUCTED_ATTRIBUTE = 15;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl <em>Constructed Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttributes()
     * @generated
     */
    int CONSTRUCTED_ATTRIBUTES = 16;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl <em>Copyright Notice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrightNotice()
     * @generated
     */
    int COPYRIGHT_NOTICE = 18;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataAttribute()
     * @generated
     */
    int DATA_ATTRIBUTE = 19;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl <em>Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataObject()
     * @generated
     */
    int DATA_OBJECT = 20;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl <em>Data Set Member Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataSetMemberOf()
     * @generated
     */
    int DATA_SET_MEMBER_OF = 21;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl <em>Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDoc()
     * @generated
     */
    int DOC = 22;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 24;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl <em>Enumerations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumerations()
     * @generated
     */
    int ENUMERATIONS = 25;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl <em>Functional Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraint()
     * @generated
     */
    int FUNCTIONAL_CONSTRAINT = 26;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl <em>Functional Constraints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraints()
     * @generated
     */
    int FUNCTIONAL_CONSTRAINTS = 27;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl <em>License</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicense()
     * @generated
     */
    int LICENSE = 28;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLiteral()
     * @generated
     */
    int LITERAL = 29;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl <em>LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClass()
     * @generated
     */
    int LN_CLASS = 30;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl <em>LN Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClasses()
     * @generated
     */
    int LN_CLASSES = 31;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl <em>Notice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNotice()
     * @generated
     */
    int NOTICE = 32;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl <em>NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNS()
     * @generated
     */
    int NS = 33;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl <em>NS Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNSDoc()
     * @generated
     */
    int NS_DOC = 34;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl <em>Presence Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceCondition()
     * @generated
     */
    int PRESENCE_CONDITION = 35;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl <em>Presence Conditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceConditions()
     * @generated
     */
    int PRESENCE_CONDITIONS = 36;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl <em>Service CDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDC()
     * @generated
     */
    int SERVICE_CDC = 37;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl <em>Service CD Cs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDCs()
     * @generated
     */
    int SERVICE_CD_CS = 38;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl <em>Service Constructed Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttribute()
     * @generated
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE = 39;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl <em>Service Constructed Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttributes()
     * @generated
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES = 40;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl <em>Service Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceDataAttribute()
     * @generated
     */
    int SERVICE_DATA_ATTRIBUTE = 41;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl <em>Service NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNS()
     * @generated
     */
    int SERVICE_NS = 42;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl <em>Service Ns Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNsUsage()
     * @generated
     */
    int SERVICE_NS_USAGE = 43;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceParameter()
     * @generated
     */
    int SERVICE_PARAMETER = 44;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl <em>Service Type Realizations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceTypeRealizations()
     * @generated
     */
    int SERVICE_TYPE_REALIZATIONS = 45;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl <em>Sub Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataAttribute()
     * @generated
     */
    int SUB_DATA_ATTRIBUTE = 46;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl <em>Sub Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataObject()
     * @generated
     */
    int SUB_DATA_OBJECT = 47;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionImpl <em>Ag Presence Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgPresenceCondition()
     * @generated
     */
    int AG_PRESENCE_CONDITION = 51;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl <em>Ag Presence Condition Derived Statistics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgPresenceConditionDerivedStatistics()
     * @generated
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS = 52;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgArrayImpl <em>Ag Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgArrayImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgArray()
     * @generated
     */
    int AG_ARRAY = 53;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl <em>Ag Trg Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgTrgOp()
     * @generated
     */
    int AG_TRG_OP = 54;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl <em>Ag Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgAttributeType()
     * @generated
     */
    int AG_ATTRIBUTE_TYPE = 55;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl <em>Ag Attribute Type And Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgAttributeTypeAndValues()
     * @generated
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES = 56;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl <em>Ag Underlying Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgUnderlyingType()
     * @generated
     */
    int AG_UNDERLYING_TYPE = 57;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUMLImpl <em>Ag UML</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUMLImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgUML()
     * @generated
     */
    int AG_UML = 58;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSdescImpl <em>Ag NSdesc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSdescImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgNSdesc()
     * @generated
     */
    int AG_NSDESC = 59;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNsdObject()
     * @generated
     */
    int NSD_OBJECT = 49;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NSD_OBJECT__LINE_NUMBER = 0;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NSD_OBJECT__EXPLICIT_LINKS_BUILT = 1;

    /**
     * The number of structural features of the '<em>Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NSD_OBJECT_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = 0;

    /**
     * The number of operations of the '<em>Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NSD_OBJECT_OPERATION_COUNT = 1;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__RELEASE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__VERSION = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__ID = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__REVISION = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__PUBLICATION_STAGE = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Service Ns Usage</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__PARENT_SERVICE_NS_USAGE = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Applies To Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Applies To Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__RELEASE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__VERSION = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__ID = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__REVISION = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__PUBLICATION_STAGE = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To NS</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON__REFERS_TO_NS = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Depends On</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Depends On</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Applicable Service NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__APPLICABLE_SERVICE_NS = 3;

    /**
     * The feature id for the '<em><b>NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NS = 4;

    /**
     * The feature id for the '<em><b>NS Doc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NS_DOC = 5;

    /**
     * The feature id for the '<em><b>Service NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SERVICE_NS = 6;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE__NAME = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Applicable Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE__PARENT_APPLICABLE_SERVICES = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__DESC_ID = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__NAME = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Abbreviations</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__PARENT_ABBREVIATIONS = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__REFERS_TO_DOC = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Abbreviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Abbreviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS__ABBREVIATION = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Abbreviations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Abbreviations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__DEPRECATED = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__DESC_ID = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__INFORMATIVE = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__REFERS_TO_DESC_DOC = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Documented Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Documented Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__TITLE_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__REFERS_TO_TITLE_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Titled Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Titled Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__LINE_NUMBER = TITLED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__EXPLICIT_LINKS_BUILT = TITLED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__REFERS_TO_DESC_DOC = TITLED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__REFERS_TO_TITLE_DOC = TITLED_CLASS__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__DATA_OBJECT = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__BASE = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Abstract LN Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Any LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = TITLED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The operation id for the '<em>Get Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS___GET_NAME = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Parent LN Classes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS___GET_PARENT_LN_CLASSES = TITLED_CLASS_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Any LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 2;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__LINE_NUMBER = ANY_LN_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__EXPLICIT_LINKS_BUILT = ANY_LN_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__DEPRECATED = ANY_LN_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__DESC_ID = ANY_LN_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__INFORMATIVE = ANY_LN_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__REFERS_TO_DESC_DOC = ANY_LN_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__TITLE_ID = ANY_LN_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__REFERS_TO_TITLE_DOC = ANY_LN_CLASS__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__DATA_OBJECT = ANY_LN_CLASS__DATA_OBJECT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__BASE = ANY_LN_CLASS__BASE;

    /**
     * The feature id for the '<em><b>Refers To Abstract LN Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS = ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__NAME = ANY_LN_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent LN Classes</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__PARENT_LN_CLASSES = ANY_LN_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Referred By Any LN Class</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS = ANY_LN_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Abstract LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS_FEATURE_COUNT = ANY_LN_CLASS_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ANY_LN_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The operation id for the '<em>Get Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS___GET_NAME = ANY_LN_CLASS___GET_NAME;

    /**
     * The operation id for the '<em>Get Parent LN Classes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS___GET_PARENT_LN_CLASSES = ANY_LN_CLASS___GET_PARENT_LN_CLASSES;

    /**
     * The number of operations of the '<em>Abstract LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS_OPERATION_COUNT = ANY_LN_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED__COPYRIGHT = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Copyrighted</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Copyrighted</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__LINE_NUMBER = COPYRIGHTED__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__EXPLICIT_LINKS_BUILT = COPYRIGHTED__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Service Ns Usage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__DATE = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__VERSION = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Applicable Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COPYRIGHTED___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Applicable Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__SERVICE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Set Member Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__DATA_SET_MEMBER_OF = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Functional Constraint</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Applicable Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Applicable Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__DESC_ID = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__NAME = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Basic Types</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__PARENT_BASIC_TYPES = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__REFERS_TO_DOC = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Basic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Basic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Basic Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES__BASIC_TYPE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Basic Types</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Basic Types</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__LINE_NUMBER = TITLED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__EXPLICIT_LINKS_BUILT = TITLED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__REFERS_TO_DESC_DOC = TITLED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__REFERS_TO_TITLE_DOC = TITLED_CLASS__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Sub Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__SUB_DATA_OBJECT = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__DATA_ATTRIBUTE = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Service Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__SERVICE_PARAMETER = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Enum Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__ENUM_PARAMETERIZED = TITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__NAME = TITLED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Statistics</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__STATISTICS = TITLED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__TYPE_KIND_PARAMETERIZED = TITLED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__VARIANT = TITLED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent CD Cs</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__PARENT_CD_CS = TITLED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By Data Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__REFERRED_BY_DATA_OBJECT = TITLED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Sub Data Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__REFERRED_BY_SUB_DATA_OBJECT = TITLED_CLASS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 11;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = TITLED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>CDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS__CDC = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Changes ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__CHANGES_ID = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__DATE = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__REVISION = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Tissues</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__TISSUES = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__RELEASE = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__VERSION = NSD_OBJECT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Changes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 8;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Changes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__LINE_NUMBER = TITLED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__EXPLICIT_LINKS_BUILT = TITLED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__REFERS_TO_DESC_DOC = TITLED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__REFERS_TO_TITLE_DOC = TITLED_CLASS__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__NAME = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Constructed Attributes</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTES = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Service Type Realizations</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_TYPE_REALIZATIONS = TITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE = TITLED_CLASS_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = TITLED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Constructed Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Notice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__NOTICE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>License</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__LICENSE = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Copyrighted</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__PARENT_COPYRIGHTED = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Copyright Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Copyright Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__IS_ARRAY = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MIN_INDEX = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DCHG = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DUPD = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__QCHG = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Refers To Basic Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Refers To Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_ENUMERATION = DOCUMENTED_CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DEFAULT_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MAX_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MIN_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__FC = DOCUMENTED_CLASS_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Parent CDC</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PARENT_CDC = DOCUMENTED_CLASS_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Referred By Sub Data Object As Size Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Referred By Sub Data Object As Max Index Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Refers To Functional Constraint</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT = DOCUMENTED_CLASS_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Refers To Presence Condition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION = DOCUMENTED_CLASS_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Refers To Size Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 26;

    /**
     * The feature id for the '<em><b>Refers To Max Index Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 27;

    /**
     * The feature id for the '<em><b>Referred By Data Attribute As Size Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 28;

    /**
     * The feature id for the '<em><b>Referred By Data Attribute As Max Index Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 29;

    /**
     * The number of structural features of the '<em>Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 30;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ds Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DS_PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DS_PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DS_PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Refers To Ds Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__UNDERLYING_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__UNDERLYING_TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__TRANSIENT = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Parent Any LN Class</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PARENT_ANY_LN_CLASS = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Refers To CDC</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__REFERS_TO_CDC = DOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Refers To Presence Condition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION = DOCUMENTED_CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Refers To Presence Condition Derived Statistics</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS = DOCUMENTED_CLASS_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 17;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Cb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF__CB = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Applicable Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Set Member Of</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Data Set Member Of</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__MIXED = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__GROUP = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__ANY = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__ID = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent NS Doc</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__PARENT_NS_DOC = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Referred By Ag NS Desc</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_AG_NS_DESC = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Referred By Presence Condition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_PRESENCE_CONDITION = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Referred By Ag Presence Condition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_AG_PRESENCE_CONDITION = NSD_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Referred By Abbreviation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_ABBREVIATION = NSD_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By Basic Type</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_BASIC_TYPE = NSD_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Documented Class</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_DOCUMENTED_CLASS = NSD_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Referred By Functional Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT = NSD_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Referred By Ag Presence Condition Derived Statistics</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS = NSD_OBJECT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referred By Titled Class</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__REFERRED_BY_TITLED_CLASS = NSD_OBJECT_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 14;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__LINE_NUMBER = TITLED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__EXPLICIT_LINKS_BUILT = TITLED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__REFERS_TO_DESC_DOC = TITLED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__REFERS_TO_TITLE_DOC = TITLED_CLASS__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Literal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__LITERAL = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inherited From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__INHERITED_FROM = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__NAME = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Enumerations</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__PARENT_ENUMERATIONS = TITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Refers To Base Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__REFERS_TO_BASE_ENUMERATION = TITLED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Referred By Enumeration As Base</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE = TITLED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE = TITLED_CLASS_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = TITLED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS__ENUMERATION = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enumerations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Enumerations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Applicable Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__ABBREVIATION = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__DESC_ID = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__TITLE_ID = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Functional Constraints</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Referred By Data Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__REFERS_TO_DOC = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Functional Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Functional Constraint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Functional Constraints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Constraints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__MIXED = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__KIND = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__URI = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Copyright Notice</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__PARENT_COPYRIGHT_NOTICE = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>License</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>License</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Literal Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__LITERAL_VAL = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Enumeration</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__PARENT_ENUMERATION = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__LINE_NUMBER = ANY_LN_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__EXPLICIT_LINKS_BUILT = ANY_LN_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__DEPRECATED = ANY_LN_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__DESC_ID = ANY_LN_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__INFORMATIVE = ANY_LN_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__REFERS_TO_DESC_DOC = ANY_LN_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__TITLE_ID = ANY_LN_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__REFERS_TO_TITLE_DOC = ANY_LN_CLASS__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__DATA_OBJECT = ANY_LN_CLASS__DATA_OBJECT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__BASE = ANY_LN_CLASS__BASE;

    /**
     * The feature id for the '<em><b>Refers To Abstract LN Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS = ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS;

    /**
     * The feature id for the '<em><b>Can Have LOG</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__CAN_HAVE_LOG = ANY_LN_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__IS_EXTENSION = ANY_LN_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__NAME = ANY_LN_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent LN Classes</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__PARENT_LN_CLASSES = ANY_LN_CLASS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS_FEATURE_COUNT = ANY_LN_CLASS_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ANY_LN_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The operation id for the '<em>Get Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS___GET_NAME = ANY_LN_CLASS___GET_NAME;

    /**
     * The operation id for the '<em>Get Parent LN Classes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS___GET_PARENT_LN_CLASSES = ANY_LN_CLASS___GET_PARENT_LN_CLASSES;

    /**
     * The number of operations of the '<em>LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS_OPERATION_COUNT = ANY_LN_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Abstract LN Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__ABSTRACT_LN_CLASS = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>LN Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__LN_CLASS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>LN Classes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LN Classes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE__MIXED = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Copyright Notice</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE__PARENT_COPYRIGHT_NOTICE = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__LINE_NUMBER = COPYRIGHTED__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__EXPLICIT_LINKS_BUILT = COPYRIGHTED__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__RELEASE = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__VERSION = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__ID = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__REVISION = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__PUBLICATION_STAGE = COPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__UML_DATE = COPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__UML_VERSION = COPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__DESC_ID = COPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__REFERS_TO_DOC = COPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__CHANGES = COPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Depends On</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__DEPENDS_ON = COPYRIGHTED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Basic Types</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__BASIC_TYPES = COPYRIGHTED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__FUNCTIONAL_CONSTRAINTS = COPYRIGHTED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__PRESENCE_CONDITIONS = COPYRIGHTED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__ABBREVIATIONS = COPYRIGHTED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Enumerations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__ENUMERATIONS = COPYRIGHTED_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__CONSTRUCTED_ATTRIBUTES = COPYRIGHTED_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__CD_CS = COPYRIGHTED_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>LN Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__LN_CLASSES = COPYRIGHTED_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Referred By Depends On</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__REFERRED_BY_DEPENDS_ON = COPYRIGHTED_FEATURE_COUNT + 19;

    /**
     * The number of structural features of the '<em>NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 20;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COPYRIGHTED___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The operation id for the '<em>Find CDC</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___FIND_CDC__STRING_IRISECLIPSECONSOLE = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Find Presence Condition</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___FIND_PRESENCE_CONDITION__STRING_IRISECLIPSECONSOLE = COPYRIGHTED_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Find Functional Constraint</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___FIND_FUNCTIONAL_CONSTRAINT__STRING_IRISECLIPSECONSOLE = COPYRIGHTED_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Find Enumeration</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___FIND_ENUMERATION__STRING_IRISECLIPSECONSOLE = COPYRIGHTED_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Find Basic Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___FIND_BASIC_TYPE__STRING_IRISECLIPSECONSOLE = COPYRIGHTED_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Find Constructed Attribute</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS___FIND_CONSTRUCTED_ATTRIBUTE__STRING_IRISECLIPSECONSOLE = COPYRIGHTED_OPERATION_COUNT + 5;

    /**
     * The number of operations of the '<em>NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 6;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__LINE_NUMBER = COPYRIGHTED__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__EXPLICIT_LINKS_BUILT = COPYRIGHTED__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__RELEASE = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__VERSION = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__ID = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__REVISION = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__PUBLICATION_STAGE = COPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__UML_DATE = COPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__UML_VERSION = COPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Doc</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__DOC = COPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__LANG = COPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>NS Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COPYRIGHTED___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>NS Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Argument</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__ARGUMENT = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__DESC_ID = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__NAME = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__TITLE_ID = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Presence Conditions</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Referred By Data Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Referred By Data Object For Derived Statistics</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Referred By Sub Data Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT = NSD_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Referred By Data Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE = NSD_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By Sub Data Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE = NSD_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__REFERS_TO_DOC = NSD_OBJECT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Presence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 11;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Presence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Presence Condition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS__PRESENCE_CONDITION = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS__PARENT_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Presence Conditions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Presence Conditions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Service Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__SERVICE_DATA_ATTRIBUTE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__CDC = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__VARIANT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Service CD Cs</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__PARENT_SERVICE_CD_CS = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Service CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Service CDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS__SERVICE_CDC = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__LINE_NUMBER = CONSTRUCTED_ATTRIBUTE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__EXPLICIT_LINKS_BUILT = CONSTRUCTED_ATTRIBUTE__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__DEPRECATED = CONSTRUCTED_ATTRIBUTE__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__DESC_ID = CONSTRUCTED_ATTRIBUTE__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__INFORMATIVE = CONSTRUCTED_ATTRIBUTE__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__REFERS_TO_DESC_DOC = CONSTRUCTED_ATTRIBUTE__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__TITLE_ID = CONSTRUCTED_ATTRIBUTE__TITLE_ID;

    /**
     * The feature id for the '<em><b>Refers To Title Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__REFERS_TO_TITLE_DOC = CONSTRUCTED_ATTRIBUTE__REFERS_TO_TITLE_DOC;

    /**
     * The feature id for the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__NAME = CONSTRUCTED_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Parent Constructed Attributes</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTES = CONSTRUCTED_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Parent Service Type Realizations</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_TYPE_REALIZATIONS = CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_TYPE_REALIZATIONS;

    /**
     * The feature id for the '<em><b>Referred By Attribute Type</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE = CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE;

    /**
     * The feature id for the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED = CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Service Constructed Attributes</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES = CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT = CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = CONSTRUCTED_ATTRIBUTE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT = CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Service Constructed Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To Basic Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Refers To Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__FC = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Parent Service CDC</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Service Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__LINE_NUMBER = COPYRIGHTED__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__EXPLICIT_LINKS_BUILT = COPYRIGHTED__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__RELEASE = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__VERSION = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__ID = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__REVISION = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__PUBLICATION_STAGE = COPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__UML_DATE = COPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__UML_VERSION = COPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__DESC_ID = COPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__REFERS_TO_DOC = COPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__CHANGES = COPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__FUNCTIONAL_CONSTRAINTS = COPYRIGHTED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__PRESENCE_CONDITIONS = COPYRIGHTED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__ABBREVIATIONS = COPYRIGHTED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Service Type Realizations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__SERVICE_TYPE_REALIZATIONS = COPYRIGHTED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Service Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES = COPYRIGHTED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Service CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__SERVICE_CD_CS = COPYRIGHTED_FEATURE_COUNT + 15;

    /**
     * The number of structural features of the '<em>Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 16;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COPYRIGHTED___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__RELEASE = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__VERSION = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__ID = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__REVISION = NSD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__PUBLICATION_STAGE = NSD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__APPLIES_TO = NSD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent Applicable Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Service Ns Usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Ns Usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Basic Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__REFERS_TO_BASIC_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__REFERS_TO_CONSTRUCTED_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Refers To Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__REFERS_TO_ENUMERATION = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__DEFAULT_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__MAX_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__MIN_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent CDC</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__PARENT_CDC = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Service Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS__LINE_NUMBER = NSD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS__EXPLICIT_LINKS_BUILT = NSD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Service Type Realization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION = NSD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Service NS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS = NSD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Type Realizations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS_FEATURE_COUNT = NSD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Type Realizations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS_OPERATION_COUNT = NSD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__IS_ARRAY = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MIN_INDEX = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Refers To Basic Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Refers To Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__DEFAULT_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MAX_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MIN_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Parent Constructed Attribute</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Refers To Presence Condition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION = DOCUMENTED_CLASS_FEATURE_COUNT + 18;

    /**
     * The number of structural features of the '<em>Sub Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 19;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Sub Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__LINE_NUMBER = DOCUMENTED_CLASS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__EXPLICIT_LINKS_BUILT = DOCUMENTED_CLASS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Refers To Desc Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__REFERS_TO_DESC_DOC = DOCUMENTED_CLASS__REFERS_TO_DESC_DOC;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__IS_ARRAY = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__MIN_INDEX = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__UNDERLYING_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Parent CDC</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PARENT_CDC = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Refers To CDC</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__REFERS_TO_CDC = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Refers To Presence Condition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION = DOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Refers To Size Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Refers To Max Index Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Sub Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 17;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = DOCUMENTED_CLASS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Sub Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION__RELEASE = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION__VERSION = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION__ID = 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION__REVISION = 3;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION__PUBLICATION_STAGE = 4;

    /**
     * The number of structural features of the '<em>Ag NS Identification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Ag NS Identification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NS_IDENTIFICATION_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION__PRES_COND = 0;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION__PRES_COND_ARGS = 1;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID = 2;

    /**
     * The feature id for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC = 3;

    /**
     * The number of structural features of the '<em>Ag Presence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Ag Presence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Ds Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND = 0;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS = 1;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID = 2;

    /**
     * The feature id for the '<em><b>Refers To Ds Pres Cond Args Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC = 3;

    /**
     * The number of structural features of the '<em>Ag Presence Condition Derived Statistics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Ag Presence Condition Derived Statistics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_PRESENCE_CONDITION_DERIVED_STATISTICS_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ARRAY__IS_ARRAY = 0;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ARRAY__MAX_INDEX_ATTRIBUTE = 1;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ARRAY__MIN_INDEX = 2;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ARRAY__SIZE_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Ag Array</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ARRAY_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Ag Array</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ARRAY_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_TRG_OP__DCHG = 0;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_TRG_OP__DUPD = 1;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_TRG_OP__QCHG = 2;

    /**
     * The number of structural features of the '<em>Ag Trg Op</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_TRG_OP_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Ag Trg Op</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_TRG_OP_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE__TYPE = 0;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE__TYPE_KIND = 1;

    /**
     * The feature id for the '<em><b>Refers To Basic Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE = 2;

    /**
     * The feature id for the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Refers To Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION = 4;

    /**
     * The number of structural features of the '<em>Ag Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Ag Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__TYPE = AG_ATTRIBUTE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__TYPE_KIND = AG_ATTRIBUTE_TYPE__TYPE_KIND;

    /**
     * The feature id for the '<em><b>Refers To Basic Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__REFERS_TO_BASIC_TYPE = AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE;

    /**
     * The feature id for the '<em><b>Refers To Constructed Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__REFERS_TO_CONSTRUCTED_ATTRIBUTE = AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Refers To Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__REFERS_TO_ENUMERATION = AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE = AG_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE = AG_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE = AG_ATTRIBUTE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Ag Attribute Type And Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES_FEATURE_COUNT = AG_ATTRIBUTE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Ag Attribute Type And Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_ATTRIBUTE_TYPE_AND_VALUES_OPERATION_COUNT = AG_ATTRIBUTE_TYPE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UNDERLYING_TYPE__UNDERLYING_TYPE = 0;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND = 1;

    /**
     * The number of structural features of the '<em>Ag Underlying Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UNDERLYING_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Ag Underlying Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UNDERLYING_TYPE_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UML__UML_DATE = 0;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UML__UML_VERSION = 1;

    /**
     * The number of structural features of the '<em>Ag UML</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UML_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Ag UML</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_UML_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NSDESC__DESC_ID = 0;

    /**
     * The feature id for the '<em><b>Refers To Doc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NSDESC__REFERS_TO_DOC = 1;

    /**
     * The number of structural features of the '<em>Ag NSdesc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NSDESC_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Ag NSdesc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_NSDESC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole <em>IRise Clipse Console</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getIRiseClipseConsole()
     * @generated
     */
    int IRISE_CLIPSE_CONSOLE = 60;

    /**
     * The number of structural features of the '<em>IRise Clipse Console</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IRISE_CLIPSE_CONSOLE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IRise Clipse Console</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IRISE_CLIPSE_CONSOLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKind()
     * @generated
     */
    int ACSI_SERVICES_KIND = 61;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKind()
     * @generated
     */
    int CB_KIND = 62;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKind()
     * @generated
     */
    int DEFINED_ATTRIBUTE_TYPE_KIND = 63;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKind()
     * @generated
     */
    int LICENSE_KIND = 64;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStage()
     * @generated
     */
    int PUB_STAGE = 65;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKind()
     * @generated
     */
    int UNDEFINED_ATTRIBUTE_TYPE_KIND = 66;

    /**
     * The meta object id for the '<em>ACSI Services Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKindObject()
     * @generated
     */
    int ACSI_SERVICES_KIND_OBJECT = 67;

    /**
     * The meta object id for the '<em>Attribute Type Kind</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Enumerator
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAttributeTypeKind()
     * @generated
     */
    int ATTRIBUTE_TYPE_KIND = 68;

    /**
     * The meta object id for the '<em>CB Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKindObject()
     * @generated
     */
    int CB_KIND_OBJECT = 69;

    /**
     * The meta object id for the '<em>Defined Attribute Type Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKindObject()
     * @generated
     */
    int DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = 70;

    /**
     * The meta object id for the '<em>License Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKindObject()
     * @generated
     */
    int LICENSE_KIND_OBJECT = 71;

    /**
     * The meta object id for the '<em>Pub Stage Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStageObject()
     * @generated
     */
    int PUB_STAGE_OBJECT = 72;

    /**
     * The meta object id for the '<em>Undefined Attribute Type Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKindObject()
     * @generated
     */
    int UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = 73;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType <em>Applies To Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applies To Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType
     * @generated
     */
    EClass getAppliesToType();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getParentServiceNsUsage <em>Parent Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getParentServiceNsUsage()
     * @see #getAppliesToType()
     * @generated
     */
    EReference getAppliesToType_ParentServiceNsUsage();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn <em>Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Depends On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn
     * @generated
     */
    EClass getDependsOn();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getParentNS()
     * @see #getDependsOn()
     * @generated
     */
    EReference getDependsOn_ParentNS();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS <em>Refers To NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn#getRefersToNS()
     * @see #getDependsOn()
     * @generated
     */
    EReference getDependsOn_RefersToNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS <em>Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applicable Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ApplicableServiceNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>NS Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NSDoc();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType <em>Service Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType
     * @generated
     */
    EClass getServiceType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName()
     * @see #getServiceType()
     * @generated
     */
    EAttribute getServiceType_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getParentApplicableServices <em>Parent Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getParentApplicableServices()
     * @see #getServiceType()
     * @generated
     */
    EReference getServiceType_ParentApplicableServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation
     * @generated
     */
    EClass getAbbreviation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getDescID()
     * @see #getAbbreviation()
     * @generated
     */
    EAttribute getAbbreviation_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getName()
     * @see #getAbbreviation()
     * @generated
     */
    EAttribute getAbbreviation_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getParentAbbreviations <em>Parent Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getParentAbbreviations()
     * @see #getAbbreviation()
     * @generated
     */
    EReference getAbbreviation_ParentAbbreviations();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getRefersToDoc()
     * @see #getAbbreviation()
     * @generated
     */
    EReference getAbbreviation_RefersToDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations
     * @generated
     */
    EClass getAbbreviations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation()
     * @see #getAbbreviations()
     * @generated
     */
    EReference getAbbreviations_Abbreviation();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentNS()
     * @see #getAbbreviations()
     * @generated
     */
    EReference getAbbreviations_ParentNS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getParentServiceNS()
     * @see #getAbbreviations()
     * @generated
     */
    EReference getAbbreviations_ParentServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass <em>Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass
     * @generated
     */
    EClass getAbstractLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getName()
     * @see #getAbstractLNClass()
     * @generated
     */
    EAttribute getAbstractLNClass_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getParentLNClasses <em>Parent LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getParentLNClasses()
     * @see #getAbstractLNClass()
     * @generated
     */
    EReference getAbstractLNClass_ParentLNClasses();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getReferredByAnyLNClass <em>Referred By Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Any LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getReferredByAnyLNClass()
     * @see #getAbstractLNClass()
     * @generated
     */
    EReference getAbstractLNClass_ReferredByAnyLNClass();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass <em>Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass
     * @generated
     */
    EClass getAnyLNClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject()
     * @see #getAnyLNClass()
     * @generated
     */
    EReference getAnyLNClass_DataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase()
     * @see #getAnyLNClass()
     * @generated
     */
    EAttribute getAnyLNClass_Base();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Abstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getRefersToAbstractLNClass()
     * @see #getAnyLNClass()
     * @generated
     */
    EReference getAnyLNClass_RefersToAbstractLNClass();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getName() <em>Get Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Name</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getName()
     * @generated
     */
    EOperation getAnyLNClass__GetName();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getParentLNClasses() <em>Get Parent LN Classes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent LN Classes</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getParentLNClasses()
     * @generated
     */
    EOperation getAnyLNClass__GetParentLNClasses();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS <em>Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applicable Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS
     * @generated
     */
    EClass getApplicableServiceNS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage()
     * @see #getApplicableServiceNS()
     * @generated
     */
    EReference getApplicableServiceNS_ServiceNsUsage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate()
     * @see #getApplicableServiceNS()
     * @generated
     */
    EAttribute getApplicableServiceNS_Date();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion()
     * @see #getApplicableServiceNS()
     * @generated
     */
    EAttribute getApplicableServiceNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices
     * @generated
     */
    EClass getApplicableServices();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService()
     * @see #getApplicableServices()
     * @generated
     */
    EReference getApplicableServices_Service();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Set Member Of</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf()
     * @see #getApplicableServices()
     * @generated
     */
    EReference getApplicableServices_DataSetMemberOf();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getParentFunctionalConstraint <em>Parent Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getParentFunctionalConstraint()
     * @see #getApplicableServices()
     * @generated
     */
    EReference getApplicableServices_ParentFunctionalConstraint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType
     * @generated
     */
    EClass getBasicType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID()
     * @see #getBasicType()
     * @generated
     */
    EAttribute getBasicType_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName()
     * @see #getBasicType()
     * @generated
     */
    EAttribute getBasicType_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getParentBasicTypes <em>Parent Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Basic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getParentBasicTypes()
     * @see #getBasicType()
     * @generated
     */
    EReference getBasicType_ParentBasicTypes();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType <em>Referred By Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Attribute Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getReferredByAttributeType()
     * @see #getBasicType()
     * @generated
     */
    EReference getBasicType_ReferredByAttributeType();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getRefersToDoc()
     * @see #getBasicType()
     * @generated
     */
    EReference getBasicType_RefersToDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes
     * @generated
     */
    EClass getBasicTypes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType()
     * @see #getBasicTypes()
     * @generated
     */
    EReference getBasicTypes_BasicType();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getParentNS()
     * @see #getBasicTypes()
     * @generated
     */
    EReference getBasicTypes_ParentNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC
     * @generated
     */
    EClass getCDC();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_SubDataObject();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_DataAttribute();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter <em>Service Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Parameter</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_ServiceParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized <em>Enum Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enum Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_EnumParameterized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics <em>Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_Statistics();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_TypeKindParameterized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_Variant();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParentCDCs <em>Parent CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getParentCDCs()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_ParentCDCs();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject <em>Referred By Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredByDataObject()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_ReferredByDataObject();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getReferredBySubDataObject()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_ReferredBySubDataObject();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs
     * @generated
     */
    EClass getCDCs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC()
     * @see #getCDCs()
     * @generated
     */
    EReference getCDCs_CDC();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getParentNS()
     * @see #getCDCs()
     * @generated
     */
    EReference getCDCs_ParentNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes
     * @generated
     */
    EClass getChanges();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID <em>Changes ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changes ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_ChangesID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Date();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues <em>Tissues</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tissues</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Tissues();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentNS()
     * @see #getChanges()
     * @generated
     */
    EReference getChanges_ParentNS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getParentServiceNS()
     * @see #getChanges()
     * @generated
     */
    EReference getChanges_ParentServiceNS();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute
     * @generated
     */
    EClass getConstructedAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute()
     * @see #getConstructedAttribute()
     * @generated
     */
    EReference getConstructedAttribute_SubDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName()
     * @see #getConstructedAttribute()
     * @generated
     */
    EAttribute getConstructedAttribute_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentConstructedAttributes <em>Parent Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentConstructedAttributes()
     * @see #getConstructedAttribute()
     * @generated
     */
    EReference getConstructedAttribute_ParentConstructedAttributes();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentServiceTypeRealizations <em>Parent Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getParentServiceTypeRealizations()
     * @see #getConstructedAttribute()
     * @generated
     */
    EReference getConstructedAttribute_ParentServiceTypeRealizations();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType <em>Referred By Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Attribute Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getReferredByAttributeType()
     * @see #getConstructedAttribute()
     * @generated
     */
    EReference getConstructedAttribute_ReferredByAttributeType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes
     * @generated
     */
    EClass getConstructedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute()
     * @see #getConstructedAttributes()
     * @generated
     */
    EReference getConstructedAttributes_ConstructedAttribute();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getParentNS()
     * @see #getConstructedAttributes()
     * @generated
     */
    EReference getConstructedAttributes_ParentNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted <em>Copyrighted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copyrighted</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted
     * @generated
     */
    EClass getCopyrighted();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Copyright</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright()
     * @see #getCopyrighted()
     * @generated
     */
    EReference getCopyrighted_Copyright();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice <em>Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copyright Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice
     * @generated
     */
    EClass getCopyrightNotice();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice <em>Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice()
     * @see #getCopyrightNotice()
     * @generated
     */
    EReference getCopyrightNotice_Notice();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>License</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense()
     * @see #getCopyrightNotice()
     * @generated
     */
    EReference getCopyrightNotice_License();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getParentCopyrighted <em>Parent Copyrighted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Copyrighted</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getParentCopyrighted()
     * @see #getCopyrightNotice()
     * @generated
     */
    EReference getCopyrightNotice_ParentCopyrighted();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute
     * @generated
     */
    EClass getDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getParentCDC <em>Parent CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getParentCDC()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_ParentCDC();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Sub Data Object As Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsSizeAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_ReferredBySubDataObjectAsSizeAttribute();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Sub Data Object As Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredBySubDataObjectAsMaxIndexAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToFunctionalConstraint <em>Refers To Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToFunctionalConstraint()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_RefersToFunctionalConstraint();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToPresenceCondition()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_RefersToPresenceCondition();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToSizeAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_RefersToSizeAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getRefersToMaxIndexAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_RefersToMaxIndexAttribute();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute <em>Referred By Data Attribute As Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Attribute As Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsSizeAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_ReferredByDataAttributeAsSizeAttribute();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute <em>Referred By Data Attribute As Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Attribute As Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getReferredByDataAttributeAsMaxIndexAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EReference getDataAttribute_ReferredByDataAttributeAsMaxIndexAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject
     * @generated
     */
    EClass getDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_Transient();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getParentAnyLNClass <em>Parent Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getParentAnyLNClass()
     * @see #getDataObject()
     * @generated
     */
    EReference getDataObject_ParentAnyLNClass();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC <em>Refers To CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToCDC()
     * @see #getDataObject()
     * @generated
     */
    EReference getDataObject_RefersToCDC();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceCondition()
     * @see #getDataObject()
     * @generated
     */
    EReference getDataObject_RefersToPresenceCondition();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Presence Condition Derived Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getRefersToPresenceConditionDerivedStatistics()
     * @see #getDataObject()
     * @generated
     */
    EReference getDataObject_RefersToPresenceConditionDerivedStatistics();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set Member Of</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf
     * @generated
     */
    EClass getDataSetMemberOf();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb <em>Cb</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cb</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb()
     * @see #getDataSetMemberOf()
     * @generated
     */
    EAttribute getDataSetMemberOf_Cb();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getParentApplicableServices <em>Parent Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getParentApplicableServices()
     * @see #getDataSetMemberOf()
     * @generated
     */
    EReference getDataSetMemberOf_ParentApplicableServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc
     * @generated
     */
    EClass getDoc();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getMixed()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getGroup()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Group();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getAny()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Any();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Id();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getParentNSDoc <em>Parent NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getParentNSDoc()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ParentNSDoc();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgNSDesc <em>Referred By Ag NS Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Ag NS Desc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgNSDesc()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByAgNSDesc();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceCondition <em>Referred By Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByPresenceCondition()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByPresenceCondition();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceCondition <em>Referred By Ag Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Ag Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceCondition()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByAgPresenceCondition();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAbbreviation <em>Referred By Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAbbreviation()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByAbbreviation();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType <em>Referred By Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByBasicType()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByBasicType();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass <em>Referred By Documented Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Documented Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByDocumentedClass()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByDocumentedClass();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByFunctionalConstraint <em>Referred By Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByFunctionalConstraint()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByFunctionalConstraint();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics <em>Referred By Ag Presence Condition Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Ag Presence Condition Derived Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByAgPresenceConditionDerivedStatistics()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByAgPresenceConditionDerivedStatistics();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass <em>Referred By Titled Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Titled Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getReferredByTitledClass()
     * @see #getDoc()
     * @generated
     */
    EReference getDoc_ReferredByTitledClass();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass <em>Documented Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documented Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass
     * @generated
     */
    EClass getDocumentedClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deprecated</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated()
     * @see #getDocumentedClass()
     * @generated
     */
    EAttribute getDocumentedClass_Deprecated();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID()
     * @see #getDocumentedClass()
     * @generated
     */
    EAttribute getDocumentedClass_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Informative</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative()
     * @see #getDocumentedClass()
     * @generated
     */
    EAttribute getDocumentedClass_Informative();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDescDoc <em>Refers To Desc Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Desc Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getRefersToDescDoc()
     * @see #getDocumentedClass()
     * @generated
     */
    EReference getDocumentedClass_RefersToDescDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration
     * @generated
     */
    EClass getEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_Literal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inherited From</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom()
     * @see #getEnumeration()
     * @generated
     */
    EAttribute getEnumeration_InheritedFrom();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName()
     * @see #getEnumeration()
     * @generated
     */
    EAttribute getEnumeration_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getParentEnumerations <em>Parent Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Enumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getParentEnumerations()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_ParentEnumerations();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Base Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getRefersToBaseEnumeration()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_RefersToBaseEnumeration();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Enumeration As Base</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByEnumerationAsBase()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_ReferredByEnumerationAsBase();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType <em>Referred By Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Attribute Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getReferredByAttributeType()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_ReferredByAttributeType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations
     * @generated
     */
    EClass getEnumerations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration()
     * @see #getEnumerations()
     * @generated
     */
    EReference getEnumerations_Enumeration();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getParentNS()
     * @see #getEnumerations()
     * @generated
     */
    EReference getEnumerations_ParentNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint
     * @generated
     */
    EClass getFunctionalConstraint();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EReference getFunctionalConstraint_ApplicableServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EAttribute getFunctionalConstraint_Abbreviation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EAttribute getFunctionalConstraint_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EAttribute getFunctionalConstraint_TitleID();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getParentFunctionalConstraints <em>Parent Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getParentFunctionalConstraints()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EReference getFunctionalConstraint_ParentFunctionalConstraints();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getReferredByDataAttribute <em>Referred By Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getReferredByDataAttribute()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EReference getFunctionalConstraint_ReferredByDataAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getRefersToDoc()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EReference getFunctionalConstraint_RefersToDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints
     * @generated
     */
    EClass getFunctionalConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint()
     * @see #getFunctionalConstraints()
     * @generated
     */
    EReference getFunctionalConstraints_FunctionalConstraint();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentNS()
     * @see #getFunctionalConstraints()
     * @generated
     */
    EReference getFunctionalConstraints_ParentNS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getParentServiceNS()
     * @see #getFunctionalConstraints()
     * @generated
     */
    EReference getFunctionalConstraints_ParentServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>License</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License
     * @generated
     */
    EClass getLicense();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getMixed()
     * @see #getLicense()
     * @generated
     */
    EAttribute getLicense_Mixed();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getKind()
     * @see #getLicense()
     * @generated
     */
    EAttribute getLicense_Kind();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getUri <em>Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getUri()
     * @see #getLicense()
     * @generated
     */
    EAttribute getLicense_Uri();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getParentCopyrightNotice <em>Parent Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Copyright Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getParentCopyrightNotice()
     * @see #getLicense()
     * @generated
     */
    EReference getLicense_ParentCopyrightNotice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal
     * @generated
     */
    EClass getLiteral();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getLiteralVal <em>Literal Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Literal Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getLiteralVal()
     * @see #getLiteral()
     * @generated
     */
    EAttribute getLiteral_LiteralVal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getName()
     * @see #getLiteral()
     * @generated
     */
    EAttribute getLiteral_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getParentEnumeration <em>Parent Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getParentEnumeration()
     * @see #getLiteral()
     * @generated
     */
    EReference getLiteral_ParentEnumeration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass
     * @generated
     */
    EClass getLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG <em>Can Have LOG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Can Have LOG</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG()
     * @see #getLNClass()
     * @generated
     */
    EAttribute getLNClass_CanHaveLOG();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension <em>Is Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Extension</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension()
     * @see #getLNClass()
     * @generated
     */
    EAttribute getLNClass_IsExtension();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName()
     * @see #getLNClass()
     * @generated
     */
    EAttribute getLNClass_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getParentLNClasses <em>Parent LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getParentLNClasses()
     * @see #getLNClass()
     * @generated
     */
    EReference getLNClass_ParentLNClasses();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses
     * @generated
     */
    EClass getLNClasses();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass <em>Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Abstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass()
     * @see #getLNClasses()
     * @generated
     */
    EReference getLNClasses_AbstractLNClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass()
     * @see #getLNClasses()
     * @generated
     */
    EReference getLNClasses_LNClass();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getParentNS()
     * @see #getLNClasses()
     * @generated
     */
    EReference getLNClasses_ParentNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice <em>Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice
     * @generated
     */
    EClass getNotice();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getMixed()
     * @see #getNotice()
     * @generated
     */
    EAttribute getNotice_Mixed();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getParentCopyrightNotice <em>Parent Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Copyright Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getParentCopyrightNotice()
     * @see #getNotice()
     * @generated
     */
    EReference getNotice_ParentCopyrightNotice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS
     * @generated
     */
    EClass getNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges()
     * @see #getNS()
     * @generated
     */
    EReference getNS_Changes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Depends On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn()
     * @see #getNS()
     * @generated
     */
    EReference getNS_DependsOn();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Basic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes()
     * @see #getNS()
     * @generated
     */
    EReference getNS_BasicTypes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints()
     * @see #getNS()
     * @generated
     */
    EReference getNS_FunctionalConstraints();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions()
     * @see #getNS()
     * @generated
     */
    EReference getNS_PresenceConditions();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations()
     * @see #getNS()
     * @generated
     */
    EReference getNS_Abbreviations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Enumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations()
     * @see #getNS()
     * @generated
     */
    EReference getNS_Enumerations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes()
     * @see #getNS()
     * @generated
     */
    EReference getNS_ConstructedAttributes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs()
     * @see #getNS()
     * @generated
     */
    EReference getNS_CDCs();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses()
     * @see #getNS()
     * @generated
     */
    EReference getNS_LNClasses();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn <em>Referred By Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Depends On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getReferredByDependsOn()
     * @see #getNS()
     * @generated
     */
    EReference getNS_ReferredByDependsOn();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findCDC(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole) <em>Find CDC</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Find CDC</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findCDC(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     * @generated
     */
    EOperation getNS__FindCDC__String_IRiseClipseConsole();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findPresenceCondition(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole) <em>Find Presence Condition</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Find Presence Condition</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findPresenceCondition(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     * @generated
     */
    EOperation getNS__FindPresenceCondition__String_IRiseClipseConsole();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findFunctionalConstraint(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole) <em>Find Functional Constraint</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Find Functional Constraint</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findFunctionalConstraint(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     * @generated
     */
    EOperation getNS__FindFunctionalConstraint__String_IRiseClipseConsole();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findEnumeration(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole) <em>Find Enumeration</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Find Enumeration</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findEnumeration(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     * @generated
     */
    EOperation getNS__FindEnumeration__String_IRiseClipseConsole();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findBasicType(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole) <em>Find Basic Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Find Basic Type</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findBasicType(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     * @generated
     */
    EOperation getNS__FindBasicType__String_IRiseClipseConsole();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findConstructedAttribute(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole) <em>Find Constructed Attribute</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Find Constructed Attribute</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#findConstructedAttribute(java.lang.String, fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     * @generated
     */
    EOperation getNS__FindConstructedAttribute__String_IRiseClipseConsole();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>NS Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc
     * @generated
     */
    EClass getNSDoc();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc()
     * @see #getNSDoc()
     * @generated
     */
    EReference getNSDoc_Doc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_Lang();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition
     * @generated
     */
    EClass getPresenceCondition();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Argument</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_Argument();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_TitleID();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getParentPresenceConditions <em>Parent Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getParentPresenceConditions()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_ParentPresenceConditions();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject <em>Referred By Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObject()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_ReferredByDataObject();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics <em>Referred By Data Object For Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Object For Derived Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataObjectForDerivedStatistics()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_ReferredByDataObjectForDerivedStatistics();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataObject()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_ReferredBySubDataObject();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute <em>Referred By Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredByDataAttribute()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_ReferredByDataAttribute();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute <em>Referred By Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Sub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getReferredBySubDataAttribute()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_ReferredBySubDataAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getRefersToDoc()
     * @see #getPresenceCondition()
     * @generated
     */
    EReference getPresenceCondition_RefersToDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions
     * @generated
     */
    EClass getPresenceConditions();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition()
     * @see #getPresenceConditions()
     * @generated
     */
    EReference getPresenceConditions_PresenceCondition();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentNS <em>Parent NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentNS()
     * @see #getPresenceConditions()
     * @generated
     */
    EReference getPresenceConditions_ParentNS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getParentServiceNS()
     * @see #getPresenceConditions()
     * @generated
     */
    EReference getPresenceConditions_ParentServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC
     * @generated
     */
    EClass getServiceCDC();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute()
     * @see #getServiceCDC()
     * @generated
     */
    EReference getServiceCDC_ServiceDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc <em>Cdc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc()
     * @see #getServiceCDC()
     * @generated
     */
    EAttribute getServiceCDC_Cdc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant()
     * @see #getServiceCDC()
     * @generated
     */
    EAttribute getServiceCDC_Variant();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getParentServiceCDCs <em>Parent Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getParentServiceCDCs()
     * @see #getServiceCDC()
     * @generated
     */
    EReference getServiceCDC_ParentServiceCDCs();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs
     * @generated
     */
    EClass getServiceCDCs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC()
     * @see #getServiceCDCs()
     * @generated
     */
    EReference getServiceCDCs_ServiceCDC();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getParentServiceNS()
     * @see #getServiceCDCs()
     * @generated
     */
    EReference getServiceCDCs_ParentServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute
     * @generated
     */
    EClass getServiceConstructedAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized()
     * @see #getServiceConstructedAttribute()
     * @generated
     */
    EAttribute getServiceConstructedAttribute_TypeKindParameterized();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#getParentServiceConstructedAttributes <em>Parent Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#getParentServiceConstructedAttributes()
     * @see #getServiceConstructedAttribute()
     * @generated
     */
    EReference getServiceConstructedAttribute_ParentServiceConstructedAttributes();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes <em>Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes
     * @generated
     */
    EClass getServiceConstructedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceConstructedAttribute()
     * @see #getServiceConstructedAttributes()
     * @generated
     */
    EReference getServiceConstructedAttributes_ServiceConstructedAttribute();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getParentServiceNS()
     * @see #getServiceConstructedAttributes()
     * @generated
     */
    EReference getServiceConstructedAttributes_ParentServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute
     * @generated
     */
    EClass getServiceDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getParentServiceCDC <em>Parent Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getParentServiceCDC()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EReference getServiceDataAttribute_ParentServiceCDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS
     * @generated
     */
    EClass getServiceNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_Changes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_FunctionalConstraints();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_PresenceConditions();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_Abbreviations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_ServiceTypeRealizations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_ServiceConstructedAttributes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_ServiceCDCs();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage
     * @generated
     */
    EClass getServiceNsUsage();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applies To</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo()
     * @see #getServiceNsUsage()
     * @generated
     */
    EReference getServiceNsUsage_AppliesTo();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getParentApplicableServiceNS <em>Parent Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Applicable Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getParentApplicableServiceNS()
     * @see #getServiceNsUsage()
     * @generated
     */
    EReference getServiceNsUsage_ParentApplicableServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter <em>Service Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Parameter</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter
     * @generated
     */
    EClass getServiceParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getName()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getParentCDC <em>Parent CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getParentCDC()
     * @see #getServiceParameter()
     * @generated
     */
    EReference getServiceParameter_ParentCDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations
     * @generated
     */
    EClass getServiceTypeRealizations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Type Realization</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization()
     * @see #getServiceTypeRealizations()
     * @generated
     */
    EReference getServiceTypeRealizations_ServiceTypeRealization();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getParentServiceNS <em>Parent Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getParentServiceNS()
     * @see #getServiceTypeRealizations()
     * @generated
     */
    EReference getServiceTypeRealizations_ParentServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute
     * @generated
     */
    EClass getSubDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getParentConstructedAttribute <em>Parent Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getParentConstructedAttribute()
     * @see #getSubDataAttribute()
     * @generated
     */
    EReference getSubDataAttribute_ParentConstructedAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getRefersToPresenceCondition()
     * @see #getSubDataAttribute()
     * @generated
     */
    EReference getSubDataAttribute_RefersToPresenceCondition();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject
     * @generated
     */
    EClass getSubDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getParentCDC <em>Parent CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getParentCDC()
     * @see #getSubDataObject()
     * @generated
     */
    EReference getSubDataObject_ParentCDC();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC <em>Refers To CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToCDC()
     * @see #getSubDataObject()
     * @generated
     */
    EReference getSubDataObject_RefersToCDC();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToPresenceCondition()
     * @see #getSubDataObject()
     * @generated
     */
    EReference getSubDataObject_RefersToPresenceCondition();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToSizeAttribute()
     * @see #getSubDataObject()
     * @generated
     */
    EReference getSubDataObject_RefersToSizeAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getRefersToMaxIndexAttribute()
     * @see #getSubDataObject()
     * @generated
     */
    EReference getSubDataObject_RefersToMaxIndexAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass <em>Titled Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Titled Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass
     * @generated
     */
    EClass getTitledClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID()
     * @see #getTitledClass()
     * @generated
     */
    EAttribute getTitledClass_TitleID();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc <em>Refers To Title Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Title Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getRefersToTitleDoc()
     * @see #getTitledClass()
     * @generated
     */
    EReference getTitledClass_RefersToTitleDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject
     * @generated
     */
    EClass getNsdObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#getLineNumber <em>Line Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Number</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#getLineNumber()
     * @see #getNsdObject()
     * @generated
     */
    EAttribute getNsdObject_LineNumber();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#isExplicitLinksBuilt <em>Explicit Links Built</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Explicit Links Built</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#isExplicitLinksBuilt()
     * @see #getNsdObject()
     * @generated
     */
    EAttribute getNsdObject_ExplicitLinksBuilt();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#buildExplicitLinks(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole, boolean) <em>Build Explicit Links</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Build Explicit Links</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject#buildExplicitLinks(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole, boolean)
     * @generated
     */
    EOperation getNsdObject__BuildExplicitLinks__IRiseClipseConsole_boolean();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification <em>Ag NS Identification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag NS Identification</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification
     * @generated
     */
    EClass getAgNSIdentification();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRelease()
     * @see #getAgNSIdentification()
     * @generated
     */
    EAttribute getAgNSIdentification_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getVersion()
     * @see #getAgNSIdentification()
     * @generated
     */
    EAttribute getAgNSIdentification_Version();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getId()
     * @see #getAgNSIdentification()
     * @generated
     */
    EAttribute getAgNSIdentification_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getRevision()
     * @see #getAgNSIdentification()
     * @generated
     */
    EAttribute getAgNSIdentification_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification#getPublicationStage()
     * @see #getAgNSIdentification()
     * @generated
     */
    EAttribute getAgNSIdentification_PublicationStage();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition <em>Ag Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition
     * @generated
     */
    EClass getAgPresenceCondition();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getPresCond()
     * @see #getAgPresenceCondition()
     * @generated
     */
    EAttribute getAgPresenceCondition_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getPresCondArgs()
     * @see #getAgPresenceCondition()
     * @generated
     */
    EAttribute getAgPresenceCondition_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getPresCondArgsID()
     * @see #getAgPresenceCondition()
     * @generated
     */
    EAttribute getAgPresenceCondition_PresCondArgsID();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Pres Cond Args Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition#getRefersToPresCondArgsDoc()
     * @see #getAgPresenceCondition()
     * @generated
     */
    EReference getAgPresenceCondition_RefersToPresCondArgsDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics <em>Ag Presence Condition Derived Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Presence Condition Derived Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics
     * @generated
     */
    EClass getAgPresenceConditionDerivedStatistics();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCond <em>Ds Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCond()
     * @see #getAgPresenceConditionDerivedStatistics()
     * @generated
     */
    EAttribute getAgPresenceConditionDerivedStatistics_DsPresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgs <em>Ds Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgs()
     * @see #getAgPresenceConditionDerivedStatistics()
     * @generated
     */
    EAttribute getAgPresenceConditionDerivedStatistics_DsPresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getDsPresCondArgsID()
     * @see #getAgPresenceConditionDerivedStatistics()
     * @generated
     */
    EAttribute getAgPresenceConditionDerivedStatistics_DsPresCondArgsID();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Ds Pres Cond Args Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics#getRefersToDsPresCondArgsDoc()
     * @see #getAgPresenceConditionDerivedStatistics()
     * @generated
     */
    EReference getAgPresenceConditionDerivedStatistics_RefersToDsPresCondArgsDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray <em>Ag Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray
     * @generated
     */
    EClass getAgArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#isIsArray()
     * @see #getAgArray()
     * @generated
     */
    EAttribute getAgArray_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMaxIndexAttribute()
     * @see #getAgArray()
     * @generated
     */
    EAttribute getAgArray_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getMinIndex()
     * @see #getAgArray()
     * @generated
     */
    EAttribute getAgArray_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray#getSizeAttribute()
     * @see #getAgArray()
     * @generated
     */
    EAttribute getAgArray_SizeAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp <em>Ag Trg Op</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Trg Op</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp
     * @generated
     */
    EClass getAgTrgOp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDchg <em>Dchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDchg()
     * @see #getAgTrgOp()
     * @generated
     */
    EAttribute getAgTrgOp_Dchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDupd <em>Dupd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dupd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isDupd()
     * @see #getAgTrgOp()
     * @generated
     */
    EAttribute getAgTrgOp_Dupd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isQchg <em>Qchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp#isQchg()
     * @see #getAgTrgOp()
     * @generated
     */
    EAttribute getAgTrgOp_Qchg();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType <em>Ag Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Attribute Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType
     * @generated
     */
    EClass getAgAttributeType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getType()
     * @see #getAgAttributeType()
     * @generated
     */
    EAttribute getAgAttributeType_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getTypeKind()
     * @see #getAgAttributeType()
     * @generated
     */
    EAttribute getAgAttributeType_TypeKind();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType <em>Refers To Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToBasicType()
     * @see #getAgAttributeType()
     * @generated
     */
    EReference getAgAttributeType_RefersToBasicType();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToConstructedAttribute()
     * @see #getAgAttributeType()
     * @generated
     */
    EReference getAgAttributeType_RefersToConstructedAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration <em>Refers To Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType#getRefersToEnumeration()
     * @see #getAgAttributeType()
     * @generated
     */
    EReference getAgAttributeType_RefersToEnumeration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues <em>Ag Attribute Type And Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Attribute Type And Values</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues
     * @generated
     */
    EClass getAgAttributeTypeAndValues();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues#getDefaultValue()
     * @see #getAgAttributeTypeAndValues()
     * @generated
     */
    EAttribute getAgAttributeTypeAndValues_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues#getMaxValue()
     * @see #getAgAttributeTypeAndValues()
     * @generated
     */
    EAttribute getAgAttributeTypeAndValues_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues#getMinValue()
     * @see #getAgAttributeTypeAndValues()
     * @generated
     */
    EAttribute getAgAttributeTypeAndValues_MinValue();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType <em>Ag Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType
     * @generated
     */
    EClass getAgUnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingType()
     * @see #getAgUnderlyingType()
     * @generated
     */
    EAttribute getAgUnderlyingType_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType#getUnderlyingTypeKind()
     * @see #getAgUnderlyingType()
     * @generated
     */
    EAttribute getAgUnderlyingType_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML <em>Ag UML</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag UML</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML
     * @generated
     */
    EClass getAgUML();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlDate()
     * @see #getAgUML()
     * @generated
     */
    EAttribute getAgUML_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML#getUmlVersion()
     * @see #getAgUML()
     * @generated
     */
    EAttribute getAgUML_UmlVersion();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc <em>Ag NSdesc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag NSdesc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc
     * @generated
     */
    EClass getAgNSdesc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc#getDescID()
     * @see #getAgNSdesc()
     * @generated
     */
    EAttribute getAgNSdesc_DescID();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc#getRefersToDoc <em>Refers To Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc#getRefersToDoc()
     * @see #getAgNSdesc()
     * @generated
     */
    EReference getAgNSdesc_RefersToDoc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole <em>IRise Clipse Console</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IRise Clipse Console</em>'.
     * @see fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole"
     * @generated
     */
    EClass getIRiseClipseConsole();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ACSI Services Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @generated
     */
    EEnum getACSIServicesKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CB Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @generated
     */
    EEnum getCBKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Defined Attribute Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @generated
     */
    EEnum getDefinedAttributeTypeKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>License Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @generated
     */
    EEnum getLicenseKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Pub Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @generated
     */
    EEnum getPubStage();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Undefined Attribute Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @generated
     */
    EEnum getUndefinedAttributeTypeKind();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ACSI Services Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind"
     *        extendedMetaData="name='tACSIServicesKind:Object' baseType='tACSIServicesKind'"
     * @generated
     */
    EDataType getACSIServicesKindObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Attribute Type Kind</em>'.
     * @see org.eclipse.emf.common.util.Enumerator
     * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
     *        extendedMetaData="name='tAttributeTypeKind' memberTypes='tDefinedAttributeTypeKind tUndefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getAttributeTypeKind();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>CB Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind"
     *        extendedMetaData="name='tCBKind:Object' baseType='tCBKind'"
     * @generated
     */
    EDataType getCBKindObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Defined Attribute Type Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind"
     *        extendedMetaData="name='tDefinedAttributeTypeKind:Object' baseType='tDefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getDefinedAttributeTypeKindObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>License Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind"
     *        extendedMetaData="name='tLicenseKind:Object' baseType='tLicenseKind'"
     * @generated
     */
    EDataType getLicenseKindObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pub Stage Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage"
     *        extendedMetaData="name='tPubStage:Object' baseType='tPubStage'"
     * @generated
     */
    EDataType getPubStageObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Undefined Attribute Type Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind"
     *        extendedMetaData="name='tUndefinedAttributeTypeKind:Object' baseType='tUndefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getUndefinedAttributeTypeKindObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NsdFactory getNsdFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAppliesToType()
         * @generated
         */
        EClass APPLIES_TO_TYPE = eINSTANCE.getAppliesToType();

        /**
         * The meta object literal for the '<em><b>Parent Service Ns Usage</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLIES_TO_TYPE__PARENT_SERVICE_NS_USAGE = eINSTANCE.getAppliesToType_ParentServiceNsUsage();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl <em>Depends On</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDependsOn()
         * @generated
         */
        EClass DEPENDS_ON = eINSTANCE.getDependsOn();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPENDS_ON__PARENT_NS = eINSTANCE.getDependsOn_ParentNS();

        /**
         * The meta object literal for the '<em><b>Refers To NS</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPENDS_ON__REFERS_TO_NS = eINSTANCE.getDependsOn_RefersToNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Applicable Service NS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__APPLICABLE_SERVICE_NS = eINSTANCE.getDocumentRoot_ApplicableServiceNS();

        /**
         * The meta object literal for the '<em><b>NS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NS = eINSTANCE.getDocumentRoot_NS();

        /**
         * The meta object literal for the '<em><b>NS Doc</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NS_DOC = eINSTANCE.getDocumentRoot_NSDoc();

        /**
         * The meta object literal for the '<em><b>Service NS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SERVICE_NS = eINSTANCE.getDocumentRoot_ServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl <em>Service Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceType()
         * @generated
         */
        EClass SERVICE_TYPE = eINSTANCE.getServiceType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE__NAME = eINSTANCE.getServiceType_Name();

        /**
         * The meta object literal for the '<em><b>Parent Applicable Services</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TYPE__PARENT_APPLICABLE_SERVICES = eINSTANCE.getServiceType_ParentApplicableServices();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviation()
         * @generated
         */
        EClass ABBREVIATION = eINSTANCE.getAbbreviation();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABBREVIATION__DESC_ID = eINSTANCE.getAbbreviation_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABBREVIATION__NAME = eINSTANCE.getAbbreviation_Name();

        /**
         * The meta object literal for the '<em><b>Parent Abbreviations</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREVIATION__PARENT_ABBREVIATIONS = eINSTANCE.getAbbreviation_ParentAbbreviations();

        /**
         * The meta object literal for the '<em><b>Refers To Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREVIATION__REFERS_TO_DOC = eINSTANCE.getAbbreviation_RefersToDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl <em>Abbreviations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviations()
         * @generated
         */
        EClass ABBREVIATIONS = eINSTANCE.getAbbreviations();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREVIATIONS__ABBREVIATION = eINSTANCE.getAbbreviations_Abbreviation();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREVIATIONS__PARENT_NS = eINSTANCE.getAbbreviations_ParentNS();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREVIATIONS__PARENT_SERVICE_NS = eINSTANCE.getAbbreviations_ParentServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl <em>Abstract LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbstractLNClass()
         * @generated
         */
        EClass ABSTRACT_LN_CLASS = eINSTANCE.getAbstractLNClass();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_LN_CLASS__NAME = eINSTANCE.getAbstractLNClass_Name();

        /**
         * The meta object literal for the '<em><b>Parent LN Classes</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_LN_CLASS__PARENT_LN_CLASSES = eINSTANCE.getAbstractLNClass_ParentLNClasses();

        /**
         * The meta object literal for the '<em><b>Referred By Any LN Class</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS = eINSTANCE.getAbstractLNClass_ReferredByAnyLNClass();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl <em>Any LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAnyLNClass()
         * @generated
         */
        EClass ANY_LN_CLASS = eINSTANCE.getAnyLNClass();

        /**
         * The meta object literal for the '<em><b>Data Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANY_LN_CLASS__DATA_OBJECT = eINSTANCE.getAnyLNClass_DataObject();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_LN_CLASS__BASE = eINSTANCE.getAnyLNClass_Base();

        /**
         * The meta object literal for the '<em><b>Refers To Abstract LN Class</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS = eINSTANCE.getAnyLNClass_RefersToAbstractLNClass();

        /**
         * The meta object literal for the '<em><b>Get Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ANY_LN_CLASS___GET_NAME = eINSTANCE.getAnyLNClass__GetName();

        /**
         * The meta object literal for the '<em><b>Get Parent LN Classes</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ANY_LN_CLASS___GET_PARENT_LN_CLASSES = eINSTANCE.getAnyLNClass__GetParentLNClasses();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl <em>Applicable Service NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServiceNS()
         * @generated
         */
        EClass APPLICABLE_SERVICE_NS = eINSTANCE.getApplicableServiceNS();

        /**
         * The meta object literal for the '<em><b>Service Ns Usage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE = eINSTANCE.getApplicableServiceNS_ServiceNsUsage();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICABLE_SERVICE_NS__DATE = eINSTANCE.getApplicableServiceNS_Date();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICABLE_SERVICE_NS__VERSION = eINSTANCE.getApplicableServiceNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl <em>Applicable Services</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServices()
         * @generated
         */
        EClass APPLICABLE_SERVICES = eINSTANCE.getApplicableServices();

        /**
         * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICES__SERVICE = eINSTANCE.getApplicableServices_Service();

        /**
         * The meta object literal for the '<em><b>Data Set Member Of</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICES__DATA_SET_MEMBER_OF = eINSTANCE.getApplicableServices_DataSetMemberOf();

        /**
         * The meta object literal for the '<em><b>Parent Functional Constraint</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT = eINSTANCE
                .getApplicableServices_ParentFunctionalConstraint();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl <em>Basic Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicType()
         * @generated
         */
        EClass BASIC_TYPE = eINSTANCE.getBasicType();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_TYPE__DESC_ID = eINSTANCE.getBasicType_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_TYPE__NAME = eINSTANCE.getBasicType_Name();

        /**
         * The meta object literal for the '<em><b>Parent Basic Types</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_TYPE__PARENT_BASIC_TYPES = eINSTANCE.getBasicType_ParentBasicTypes();

        /**
         * The meta object literal for the '<em><b>Referred By Attribute Type</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE = eINSTANCE.getBasicType_ReferredByAttributeType();

        /**
         * The meta object literal for the '<em><b>Refers To Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_TYPE__REFERS_TO_DOC = eINSTANCE.getBasicType_RefersToDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl <em>Basic Types</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicTypes()
         * @generated
         */
        EClass BASIC_TYPES = eINSTANCE.getBasicTypes();

        /**
         * The meta object literal for the '<em><b>Basic Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_TYPES__BASIC_TYPE = eINSTANCE.getBasicTypes_BasicType();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_TYPES__PARENT_NS = eINSTANCE.getBasicTypes_ParentNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl <em>CDC</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDC()
         * @generated
         */
        EClass CDC = eINSTANCE.getCDC();

        /**
         * The meta object literal for the '<em><b>Sub Data Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__SUB_DATA_OBJECT = eINSTANCE.getCDC_SubDataObject();

        /**
         * The meta object literal for the '<em><b>Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__DATA_ATTRIBUTE = eINSTANCE.getCDC_DataAttribute();

        /**
         * The meta object literal for the '<em><b>Service Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__SERVICE_PARAMETER = eINSTANCE.getCDC_ServiceParameter();

        /**
         * The meta object literal for the '<em><b>Enum Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__ENUM_PARAMETERIZED = eINSTANCE.getCDC_EnumParameterized();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__NAME = eINSTANCE.getCDC_Name();

        /**
         * The meta object literal for the '<em><b>Statistics</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__STATISTICS = eINSTANCE.getCDC_Statistics();

        /**
         * The meta object literal for the '<em><b>Type Kind Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__TYPE_KIND_PARAMETERIZED = eINSTANCE.getCDC_TypeKindParameterized();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__VARIANT = eINSTANCE.getCDC_Variant();

        /**
         * The meta object literal for the '<em><b>Parent CD Cs</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__PARENT_CD_CS = eINSTANCE.getCDC_ParentCDCs();

        /**
         * The meta object literal for the '<em><b>Referred By Data Object</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__REFERRED_BY_DATA_OBJECT = eINSTANCE.getCDC_ReferredByDataObject();

        /**
         * The meta object literal for the '<em><b>Referred By Sub Data Object</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__REFERRED_BY_SUB_DATA_OBJECT = eINSTANCE.getCDC_ReferredBySubDataObject();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl <em>CD Cs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDCs()
         * @generated
         */
        EClass CD_CS = eINSTANCE.getCDCs();

        /**
         * The meta object literal for the '<em><b>CDC</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CD_CS__CDC = eINSTANCE.getCDCs_CDC();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CD_CS__PARENT_NS = eINSTANCE.getCDCs_ParentNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl <em>Changes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getChanges()
         * @generated
         */
        EClass CHANGES = eINSTANCE.getChanges();

        /**
         * The meta object literal for the '<em><b>Changes ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__CHANGES_ID = eINSTANCE.getChanges_ChangesID();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__DATE = eINSTANCE.getChanges_Date();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__REVISION = eINSTANCE.getChanges_Revision();

        /**
         * The meta object literal for the '<em><b>Tissues</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__TISSUES = eINSTANCE.getChanges_Tissues();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHANGES__PARENT_NS = eINSTANCE.getChanges_ParentNS();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHANGES__PARENT_SERVICE_NS = eINSTANCE.getChanges_ParentServiceNS();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__RELEASE = eINSTANCE.getChanges_Release();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__VERSION = eINSTANCE.getChanges_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl <em>Constructed Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttribute()
         * @generated
         */
        EClass CONSTRUCTED_ATTRIBUTE = eINSTANCE.getConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Sub Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = eINSTANCE.getConstructedAttribute_SubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTRUCTED_ATTRIBUTE__NAME = eINSTANCE.getConstructedAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Parent Constructed Attributes</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTES = eINSTANCE
                .getConstructedAttribute_ParentConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Parent Service Type Realizations</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_TYPE_REALIZATIONS = eINSTANCE
                .getConstructedAttribute_ParentServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Referred By Attribute Type</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE = eINSTANCE
                .getConstructedAttribute_ReferredByAttributeType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl <em>Constructed Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttributes()
         * @generated
         */
        EClass CONSTRUCTED_ATTRIBUTES = eINSTANCE.getConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Constructed Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getConstructedAttributes_ConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTES__PARENT_NS = eINSTANCE.getConstructedAttributes_ParentNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl <em>Copyrighted</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrighted()
         * @generated
         */
        EClass COPYRIGHTED = eINSTANCE.getCopyrighted();

        /**
         * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHTED__COPYRIGHT = eINSTANCE.getCopyrighted_Copyright();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl <em>Copyright Notice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrightNotice()
         * @generated
         */
        EClass COPYRIGHT_NOTICE = eINSTANCE.getCopyrightNotice();

        /**
         * The meta object literal for the '<em><b>Notice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHT_NOTICE__NOTICE = eINSTANCE.getCopyrightNotice_Notice();

        /**
         * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHT_NOTICE__LICENSE = eINSTANCE.getCopyrightNotice_License();

        /**
         * The meta object literal for the '<em><b>Parent Copyrighted</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHT_NOTICE__PARENT_COPYRIGHTED = eINSTANCE.getCopyrightNotice_ParentCopyrighted();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataAttribute()
         * @generated
         */
        EClass DATA_ATTRIBUTE = eINSTANCE.getDataAttribute();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__FC = eINSTANCE.getDataAttribute_Fc();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__NAME = eINSTANCE.getDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Parent CDC</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__PARENT_CDC = eINSTANCE.getDataAttribute_ParentCDC();

        /**
         * The meta object literal for the '<em><b>Referred By Sub Data Object As Size Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE = eINSTANCE
                .getDataAttribute_ReferredBySubDataObjectAsSizeAttribute();

        /**
         * The meta object literal for the '<em><b>Referred By Sub Data Object As Max Index Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE = eINSTANCE
                .getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Functional Constraint</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT = eINSTANCE
                .getDataAttribute_RefersToFunctionalConstraint();

        /**
         * The meta object literal for the '<em><b>Refers To Presence Condition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION = eINSTANCE
                .getDataAttribute_RefersToPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Refers To Size Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE = eINSTANCE.getDataAttribute_RefersToSizeAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Max Index Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE = eINSTANCE
                .getDataAttribute_RefersToMaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Referred By Data Attribute As Size Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE = eINSTANCE
                .getDataAttribute_ReferredByDataAttributeAsSizeAttribute();

        /**
         * The meta object literal for the '<em><b>Referred By Data Attribute As Max Index Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE = eINSTANCE
                .getDataAttribute_ReferredByDataAttributeAsMaxIndexAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl <em>Data Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataObject()
         * @generated
         */
        EClass DATA_OBJECT = eINSTANCE.getDataObject();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__NAME = eINSTANCE.getDataObject_Name();

        /**
         * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__TRANSIENT = eINSTANCE.getDataObject_Transient();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__TYPE = eINSTANCE.getDataObject_Type();

        /**
         * The meta object literal for the '<em><b>Parent Any LN Class</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_OBJECT__PARENT_ANY_LN_CLASS = eINSTANCE.getDataObject_ParentAnyLNClass();

        /**
         * The meta object literal for the '<em><b>Refers To CDC</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_OBJECT__REFERS_TO_CDC = eINSTANCE.getDataObject_RefersToCDC();

        /**
         * The meta object literal for the '<em><b>Refers To Presence Condition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION = eINSTANCE.getDataObject_RefersToPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Refers To Presence Condition Derived Statistics</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS = eINSTANCE
                .getDataObject_RefersToPresenceConditionDerivedStatistics();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl <em>Data Set Member Of</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataSetMemberOf()
         * @generated
         */
        EClass DATA_SET_MEMBER_OF = eINSTANCE.getDataSetMemberOf();

        /**
         * The meta object literal for the '<em><b>Cb</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_MEMBER_OF__CB = eINSTANCE.getDataSetMemberOf_Cb();

        /**
         * The meta object literal for the '<em><b>Parent Applicable Services</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES = eINSTANCE
                .getDataSetMemberOf_ParentApplicableServices();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl <em>Doc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDoc()
         * @generated
         */
        EClass DOC = eINSTANCE.getDoc();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__MIXED = eINSTANCE.getDoc_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__GROUP = eINSTANCE.getDoc_Group();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__ANY = eINSTANCE.getDoc_Any();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__ID = eINSTANCE.getDoc_Id();

        /**
         * The meta object literal for the '<em><b>Parent NS Doc</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__PARENT_NS_DOC = eINSTANCE.getDoc_ParentNSDoc();

        /**
         * The meta object literal for the '<em><b>Referred By Ag NS Desc</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_AG_NS_DESC = eINSTANCE.getDoc_ReferredByAgNSDesc();

        /**
         * The meta object literal for the '<em><b>Referred By Presence Condition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_PRESENCE_CONDITION = eINSTANCE.getDoc_ReferredByPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Referred By Ag Presence Condition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_AG_PRESENCE_CONDITION = eINSTANCE.getDoc_ReferredByAgPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Referred By Abbreviation</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_ABBREVIATION = eINSTANCE.getDoc_ReferredByAbbreviation();

        /**
         * The meta object literal for the '<em><b>Referred By Basic Type</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_BASIC_TYPE = eINSTANCE.getDoc_ReferredByBasicType();

        /**
         * The meta object literal for the '<em><b>Referred By Documented Class</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_DOCUMENTED_CLASS = eINSTANCE.getDoc_ReferredByDocumentedClass();

        /**
         * The meta object literal for the '<em><b>Referred By Functional Constraint</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT = eINSTANCE.getDoc_ReferredByFunctionalConstraint();

        /**
         * The meta object literal for the '<em><b>Referred By Ag Presence Condition Derived Statistics</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS = eINSTANCE
                .getDoc_ReferredByAgPresenceConditionDerivedStatistics();

        /**
         * The meta object literal for the '<em><b>Referred By Titled Class</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOC__REFERRED_BY_TITLED_CLASS = eINSTANCE.getDoc_ReferredByTitledClass();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl <em>Documented Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentedClass()
         * @generated
         */
        EClass DOCUMENTED_CLASS = eINSTANCE.getDocumentedClass();

        /**
         * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTED_CLASS__DEPRECATED = eINSTANCE.getDocumentedClass_Deprecated();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTED_CLASS__DESC_ID = eINSTANCE.getDocumentedClass_DescID();

        /**
         * The meta object literal for the '<em><b>Informative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTED_CLASS__INFORMATIVE = eINSTANCE.getDocumentedClass_Informative();

        /**
         * The meta object literal for the '<em><b>Refers To Desc Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENTED_CLASS__REFERS_TO_DESC_DOC = eINSTANCE.getDocumentedClass_RefersToDescDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl <em>Enumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumeration()
         * @generated
         */
        EClass ENUMERATION = eINSTANCE.getEnumeration();

        /**
         * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

        /**
         * The meta object literal for the '<em><b>Inherited From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION__INHERITED_FROM = eINSTANCE.getEnumeration_InheritedFrom();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

        /**
         * The meta object literal for the '<em><b>Parent Enumerations</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__PARENT_ENUMERATIONS = eINSTANCE.getEnumeration_ParentEnumerations();

        /**
         * The meta object literal for the '<em><b>Refers To Base Enumeration</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__REFERS_TO_BASE_ENUMERATION = eINSTANCE.getEnumeration_RefersToBaseEnumeration();

        /**
         * The meta object literal for the '<em><b>Referred By Enumeration As Base</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE = eINSTANCE
                .getEnumeration_ReferredByEnumerationAsBase();

        /**
         * The meta object literal for the '<em><b>Referred By Attribute Type</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE = eINSTANCE.getEnumeration_ReferredByAttributeType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl <em>Enumerations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumerations()
         * @generated
         */
        EClass ENUMERATIONS = eINSTANCE.getEnumerations();

        /**
         * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATIONS__ENUMERATION = eINSTANCE.getEnumerations_Enumeration();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATIONS__PARENT_NS = eINSTANCE.getEnumerations_ParentNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl <em>Functional Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraint()
         * @generated
         */
        EClass FUNCTIONAL_CONSTRAINT = eINSTANCE.getFunctionalConstraint();

        /**
         * The meta object literal for the '<em><b>Applicable Services</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES = eINSTANCE.getFunctionalConstraint_ApplicableServices();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTIONAL_CONSTRAINT__ABBREVIATION = eINSTANCE.getFunctionalConstraint_Abbreviation();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTIONAL_CONSTRAINT__DESC_ID = eINSTANCE.getFunctionalConstraint_DescID();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTIONAL_CONSTRAINT__TITLE_ID = eINSTANCE.getFunctionalConstraint_TitleID();

        /**
         * The meta object literal for the '<em><b>Parent Functional Constraints</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS = eINSTANCE
                .getFunctionalConstraint_ParentFunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Referred By Data Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE = eINSTANCE
                .getFunctionalConstraint_ReferredByDataAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINT__REFERS_TO_DOC = eINSTANCE.getFunctionalConstraint_RefersToDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl <em>Functional Constraints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraints()
         * @generated
         */
        EClass FUNCTIONAL_CONSTRAINTS = eINSTANCE.getFunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Functional Constraint</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT = eINSTANCE
                .getFunctionalConstraints_FunctionalConstraint();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINTS__PARENT_NS = eINSTANCE.getFunctionalConstraints_ParentNS();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS = eINSTANCE.getFunctionalConstraints_ParentServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl <em>License</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicense()
         * @generated
         */
        EClass LICENSE = eINSTANCE.getLicense();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LICENSE__MIXED = eINSTANCE.getLicense_Mixed();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LICENSE__KIND = eINSTANCE.getLicense_Kind();

        /**
         * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LICENSE__URI = eINSTANCE.getLicense_Uri();

        /**
         * The meta object literal for the '<em><b>Parent Copyright Notice</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LICENSE__PARENT_COPYRIGHT_NOTICE = eINSTANCE.getLicense_ParentCopyrightNotice();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl <em>Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLiteral()
         * @generated
         */
        EClass LITERAL = eINSTANCE.getLiteral();

        /**
         * The meta object literal for the '<em><b>Literal Val</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL__LITERAL_VAL = eINSTANCE.getLiteral_LiteralVal();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

        /**
         * The meta object literal for the '<em><b>Parent Enumeration</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LITERAL__PARENT_ENUMERATION = eINSTANCE.getLiteral_ParentEnumeration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl <em>LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClass()
         * @generated
         */
        EClass LN_CLASS = eINSTANCE.getLNClass();

        /**
         * The meta object literal for the '<em><b>Can Have LOG</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LN_CLASS__CAN_HAVE_LOG = eINSTANCE.getLNClass_CanHaveLOG();

        /**
         * The meta object literal for the '<em><b>Is Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LN_CLASS__IS_EXTENSION = eINSTANCE.getLNClass_IsExtension();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LN_CLASS__NAME = eINSTANCE.getLNClass_Name();

        /**
         * The meta object literal for the '<em><b>Parent LN Classes</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LN_CLASS__PARENT_LN_CLASSES = eINSTANCE.getLNClass_ParentLNClasses();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl <em>LN Classes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClasses()
         * @generated
         */
        EClass LN_CLASSES = eINSTANCE.getLNClasses();

        /**
         * The meta object literal for the '<em><b>Abstract LN Class</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LN_CLASSES__ABSTRACT_LN_CLASS = eINSTANCE.getLNClasses_AbstractLNClass();

        /**
         * The meta object literal for the '<em><b>LN Class</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LN_CLASSES__LN_CLASS = eINSTANCE.getLNClasses_LNClass();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LN_CLASSES__PARENT_NS = eINSTANCE.getLNClasses_ParentNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl <em>Notice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNotice()
         * @generated
         */
        EClass NOTICE = eINSTANCE.getNotice();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTICE__MIXED = eINSTANCE.getNotice_Mixed();

        /**
         * The meta object literal for the '<em><b>Parent Copyright Notice</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NOTICE__PARENT_COPYRIGHT_NOTICE = eINSTANCE.getNotice_ParentCopyrightNotice();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl <em>NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNS()
         * @generated
         */
        EClass NS = eINSTANCE.getNS();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__CHANGES = eINSTANCE.getNS_Changes();

        /**
         * The meta object literal for the '<em><b>Depends On</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__DEPENDS_ON = eINSTANCE.getNS_DependsOn();

        /**
         * The meta object literal for the '<em><b>Basic Types</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__BASIC_TYPES = eINSTANCE.getNS_BasicTypes();

        /**
         * The meta object literal for the '<em><b>Functional Constraints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__FUNCTIONAL_CONSTRAINTS = eINSTANCE.getNS_FunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Presence Conditions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__PRESENCE_CONDITIONS = eINSTANCE.getNS_PresenceConditions();

        /**
         * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__ABBREVIATIONS = eINSTANCE.getNS_Abbreviations();

        /**
         * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__ENUMERATIONS = eINSTANCE.getNS_Enumerations();

        /**
         * The meta object literal for the '<em><b>Constructed Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__CONSTRUCTED_ATTRIBUTES = eINSTANCE.getNS_ConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>CD Cs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__CD_CS = eINSTANCE.getNS_CDCs();

        /**
         * The meta object literal for the '<em><b>LN Classes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__LN_CLASSES = eINSTANCE.getNS_LNClasses();

        /**
         * The meta object literal for the '<em><b>Referred By Depends On</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__REFERRED_BY_DEPENDS_ON = eINSTANCE.getNS_ReferredByDependsOn();

        /**
         * The meta object literal for the '<em><b>Find CDC</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NS___FIND_CDC__STRING_IRISECLIPSECONSOLE = eINSTANCE.getNS__FindCDC__String_IRiseClipseConsole();

        /**
         * The meta object literal for the '<em><b>Find Presence Condition</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NS___FIND_PRESENCE_CONDITION__STRING_IRISECLIPSECONSOLE = eINSTANCE
                .getNS__FindPresenceCondition__String_IRiseClipseConsole();

        /**
         * The meta object literal for the '<em><b>Find Functional Constraint</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NS___FIND_FUNCTIONAL_CONSTRAINT__STRING_IRISECLIPSECONSOLE = eINSTANCE
                .getNS__FindFunctionalConstraint__String_IRiseClipseConsole();

        /**
         * The meta object literal for the '<em><b>Find Enumeration</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NS___FIND_ENUMERATION__STRING_IRISECLIPSECONSOLE = eINSTANCE
                .getNS__FindEnumeration__String_IRiseClipseConsole();

        /**
         * The meta object literal for the '<em><b>Find Basic Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NS___FIND_BASIC_TYPE__STRING_IRISECLIPSECONSOLE = eINSTANCE
                .getNS__FindBasicType__String_IRiseClipseConsole();

        /**
         * The meta object literal for the '<em><b>Find Constructed Attribute</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NS___FIND_CONSTRUCTED_ATTRIBUTE__STRING_IRISECLIPSECONSOLE = eINSTANCE
                .getNS__FindConstructedAttribute__String_IRiseClipseConsole();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl <em>NS Doc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNSDoc()
         * @generated
         */
        EClass NS_DOC = eINSTANCE.getNSDoc();

        /**
         * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS_DOC__DOC = eINSTANCE.getNSDoc_Doc();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__LANG = eINSTANCE.getNSDoc_Lang();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl <em>Presence Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceCondition()
         * @generated
         */
        EClass PRESENCE_CONDITION = eINSTANCE.getPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__ARGUMENT = eINSTANCE.getPresenceCondition_Argument();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__DESC_ID = eINSTANCE.getPresenceCondition_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__NAME = eINSTANCE.getPresenceCondition_Name();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__TITLE_ID = eINSTANCE.getPresenceCondition_TitleID();

        /**
         * The meta object literal for the '<em><b>Parent Presence Conditions</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS = eINSTANCE
                .getPresenceCondition_ParentPresenceConditions();

        /**
         * The meta object literal for the '<em><b>Referred By Data Object</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT = eINSTANCE.getPresenceCondition_ReferredByDataObject();

        /**
         * The meta object literal for the '<em><b>Referred By Data Object For Derived Statistics</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS = eINSTANCE
                .getPresenceCondition_ReferredByDataObjectForDerivedStatistics();

        /**
         * The meta object literal for the '<em><b>Referred By Sub Data Object</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT = eINSTANCE
                .getPresenceCondition_ReferredBySubDataObject();

        /**
         * The meta object literal for the '<em><b>Referred By Data Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE = eINSTANCE
                .getPresenceCondition_ReferredByDataAttribute();

        /**
         * The meta object literal for the '<em><b>Referred By Sub Data Attribute</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE = eINSTANCE
                .getPresenceCondition_ReferredBySubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITION__REFERS_TO_DOC = eINSTANCE.getPresenceCondition_RefersToDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl <em>Presence Conditions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceConditions()
         * @generated
         */
        EClass PRESENCE_CONDITIONS = eINSTANCE.getPresenceConditions();

        /**
         * The meta object literal for the '<em><b>Presence Condition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITIONS__PRESENCE_CONDITION = eINSTANCE.getPresenceConditions_PresenceCondition();

        /**
         * The meta object literal for the '<em><b>Parent NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITIONS__PARENT_NS = eINSTANCE.getPresenceConditions_ParentNS();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITIONS__PARENT_SERVICE_NS = eINSTANCE.getPresenceConditions_ParentServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl <em>Service CDC</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDC()
         * @generated
         */
        EClass SERVICE_CDC = eINSTANCE.getServiceCDC();

        /**
         * The meta object literal for the '<em><b>Service Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CDC__SERVICE_DATA_ATTRIBUTE = eINSTANCE.getServiceCDC_ServiceDataAttribute();

        /**
         * The meta object literal for the '<em><b>Cdc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_CDC__CDC = eINSTANCE.getServiceCDC_Cdc();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_CDC__VARIANT = eINSTANCE.getServiceCDC_Variant();

        /**
         * The meta object literal for the '<em><b>Parent Service CD Cs</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CDC__PARENT_SERVICE_CD_CS = eINSTANCE.getServiceCDC_ParentServiceCDCs();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl <em>Service CD Cs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDCs()
         * @generated
         */
        EClass SERVICE_CD_CS = eINSTANCE.getServiceCDCs();

        /**
         * The meta object literal for the '<em><b>Service CDC</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CD_CS__SERVICE_CDC = eINSTANCE.getServiceCDCs_ServiceCDC();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CD_CS__PARENT_SERVICE_NS = eINSTANCE.getServiceCDCs_ParentServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl <em>Service Constructed Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttribute()
         * @generated
         */
        EClass SERVICE_CONSTRUCTED_ATTRIBUTE = eINSTANCE.getServiceConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Type Kind Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED = eINSTANCE
                .getServiceConstructedAttribute_TypeKindParameterized();

        /**
         * The meta object literal for the '<em><b>Parent Service Constructed Attributes</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE
                .getServiceConstructedAttribute_ParentServiceConstructedAttributes();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl <em>Service Constructed Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttributes()
         * @generated
         */
        EClass SERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE.getServiceConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Service Constructed Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getServiceConstructedAttributes_ServiceConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS = eINSTANCE
                .getServiceConstructedAttributes_ParentServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl <em>Service Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceDataAttribute()
         * @generated
         */
        EClass SERVICE_DATA_ATTRIBUTE = eINSTANCE.getServiceDataAttribute();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__FC = eINSTANCE.getServiceDataAttribute_Fc();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__NAME = eINSTANCE.getServiceDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Parent Service CDC</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC = eINSTANCE.getServiceDataAttribute_ParentServiceCDC();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl <em>Service NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNS()
         * @generated
         */
        EClass SERVICE_NS = eINSTANCE.getServiceNS();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__CHANGES = eINSTANCE.getServiceNS_Changes();

        /**
         * The meta object literal for the '<em><b>Functional Constraints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__FUNCTIONAL_CONSTRAINTS = eINSTANCE.getServiceNS_FunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Presence Conditions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__PRESENCE_CONDITIONS = eINSTANCE.getServiceNS_PresenceConditions();

        /**
         * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__ABBREVIATIONS = eINSTANCE.getServiceNS_Abbreviations();

        /**
         * The meta object literal for the '<em><b>Service Type Realizations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__SERVICE_TYPE_REALIZATIONS = eINSTANCE.getServiceNS_ServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Service Constructed Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE.getServiceNS_ServiceConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Service CD Cs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__SERVICE_CD_CS = eINSTANCE.getServiceNS_ServiceCDCs();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl <em>Service Ns Usage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNsUsage()
         * @generated
         */
        EClass SERVICE_NS_USAGE = eINSTANCE.getServiceNsUsage();

        /**
         * The meta object literal for the '<em><b>Applies To</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS_USAGE__APPLIES_TO = eINSTANCE.getServiceNsUsage_AppliesTo();

        /**
         * The meta object literal for the '<em><b>Parent Applicable Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS = eINSTANCE
                .getServiceNsUsage_ParentApplicableServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceParameter()
         * @generated
         */
        EClass SERVICE_PARAMETER = eINSTANCE.getServiceParameter();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__NAME = eINSTANCE.getServiceParameter_Name();

        /**
         * The meta object literal for the '<em><b>Parent CDC</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_PARAMETER__PARENT_CDC = eINSTANCE.getServiceParameter_ParentCDC();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl <em>Service Type Realizations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceTypeRealizations()
         * @generated
         */
        EClass SERVICE_TYPE_REALIZATIONS = eINSTANCE.getServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Service Type Realization</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION = eINSTANCE
                .getServiceTypeRealizations_ServiceTypeRealization();

        /**
         * The meta object literal for the '<em><b>Parent Service NS</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS = eINSTANCE
                .getServiceTypeRealizations_ParentServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl <em>Sub Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataAttribute()
         * @generated
         */
        EClass SUB_DATA_ATTRIBUTE = eINSTANCE.getSubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__NAME = eINSTANCE.getSubDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Parent Constructed Attribute</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getSubDataAttribute_ParentConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Presence Condition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION = eINSTANCE
                .getSubDataAttribute_RefersToPresenceCondition();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl <em>Sub Data Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataObject()
         * @generated
         */
        EClass SUB_DATA_OBJECT = eINSTANCE.getSubDataObject();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__NAME = eINSTANCE.getSubDataObject_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__TYPE = eINSTANCE.getSubDataObject_Type();

        /**
         * The meta object literal for the '<em><b>Parent CDC</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_OBJECT__PARENT_CDC = eINSTANCE.getSubDataObject_ParentCDC();

        /**
         * The meta object literal for the '<em><b>Refers To CDC</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_OBJECT__REFERS_TO_CDC = eINSTANCE.getSubDataObject_RefersToCDC();

        /**
         * The meta object literal for the '<em><b>Refers To Presence Condition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION = eINSTANCE
                .getSubDataObject_RefersToPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Refers To Size Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE = eINSTANCE.getSubDataObject_RefersToSizeAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Max Index Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE = eINSTANCE
                .getSubDataObject_RefersToMaxIndexAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl <em>Titled Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTitledClass()
         * @generated
         */
        EClass TITLED_CLASS = eINSTANCE.getTitledClass();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TITLED_CLASS__TITLE_ID = eINSTANCE.getTitledClass_TitleID();

        /**
         * The meta object literal for the '<em><b>Refers To Title Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TITLED_CLASS__REFERS_TO_TITLE_DOC = eINSTANCE.getTitledClass_RefersToTitleDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl <em>Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNsdObject()
         * @generated
         */
        EClass NSD_OBJECT = eINSTANCE.getNsdObject();

        /**
         * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NSD_OBJECT__LINE_NUMBER = eINSTANCE.getNsdObject_LineNumber();

        /**
         * The meta object literal for the '<em><b>Explicit Links Built</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NSD_OBJECT__EXPLICIT_LINKS_BUILT = eINSTANCE.getNsdObject_ExplicitLinksBuilt();

        /**
         * The meta object literal for the '<em><b>Build Explicit Links</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = eINSTANCE
                .getNsdObject__BuildExplicitLinks__IRiseClipseConsole_boolean();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSIdentificationImpl <em>Ag NS Identification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSIdentificationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgNSIdentification()
         * @generated
         */
        EClass AG_NS_IDENTIFICATION = eINSTANCE.getAgNSIdentification();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_NS_IDENTIFICATION__RELEASE = eINSTANCE.getAgNSIdentification_Release();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_NS_IDENTIFICATION__VERSION = eINSTANCE.getAgNSIdentification_Version();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_NS_IDENTIFICATION__ID = eINSTANCE.getAgNSIdentification_Id();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_NS_IDENTIFICATION__REVISION = eINSTANCE.getAgNSIdentification_Revision();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_NS_IDENTIFICATION__PUBLICATION_STAGE = eINSTANCE.getAgNSIdentification_PublicationStage();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionImpl <em>Ag Presence Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgPresenceCondition()
         * @generated
         */
        EClass AG_PRESENCE_CONDITION = eINSTANCE.getAgPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_PRESENCE_CONDITION__PRES_COND = eINSTANCE.getAgPresenceCondition_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_PRESENCE_CONDITION__PRES_COND_ARGS = eINSTANCE.getAgPresenceCondition_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID = eINSTANCE.getAgPresenceCondition_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Refers To Pres Cond Args Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC = eINSTANCE
                .getAgPresenceCondition_RefersToPresCondArgsDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl <em>Ag Presence Condition Derived Statistics</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgPresenceConditionDerivedStatistics()
         * @generated
         */
        EClass AG_PRESENCE_CONDITION_DERIVED_STATISTICS = eINSTANCE.getAgPresenceConditionDerivedStatistics();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND = eINSTANCE
                .getAgPresenceConditionDerivedStatistics_DsPresCond();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS = eINSTANCE
                .getAgPresenceConditionDerivedStatistics_DsPresCondArgs();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID = eINSTANCE
                .getAgPresenceConditionDerivedStatistics_DsPresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Refers To Ds Pres Cond Args Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC = eINSTANCE
                .getAgPresenceConditionDerivedStatistics_RefersToDsPresCondArgsDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgArrayImpl <em>Ag Array</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgArrayImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgArray()
         * @generated
         */
        EClass AG_ARRAY = eINSTANCE.getAgArray();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ARRAY__IS_ARRAY = eINSTANCE.getAgArray_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ARRAY__MAX_INDEX_ATTRIBUTE = eINSTANCE.getAgArray_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ARRAY__MIN_INDEX = eINSTANCE.getAgArray_MinIndex();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ARRAY__SIZE_ATTRIBUTE = eINSTANCE.getAgArray_SizeAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl <em>Ag Trg Op</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgTrgOp()
         * @generated
         */
        EClass AG_TRG_OP = eINSTANCE.getAgTrgOp();

        /**
         * The meta object literal for the '<em><b>Dchg</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_TRG_OP__DCHG = eINSTANCE.getAgTrgOp_Dchg();

        /**
         * The meta object literal for the '<em><b>Dupd</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_TRG_OP__DUPD = eINSTANCE.getAgTrgOp_Dupd();

        /**
         * The meta object literal for the '<em><b>Qchg</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_TRG_OP__QCHG = eINSTANCE.getAgTrgOp_Qchg();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl <em>Ag Attribute Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgAttributeType()
         * @generated
         */
        EClass AG_ATTRIBUTE_TYPE = eINSTANCE.getAgAttributeType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ATTRIBUTE_TYPE__TYPE = eINSTANCE.getAgAttributeType_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ATTRIBUTE_TYPE__TYPE_KIND = eINSTANCE.getAgAttributeType_TypeKind();

        /**
         * The meta object literal for the '<em><b>Refers To Basic Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE = eINSTANCE.getAgAttributeType_RefersToBasicType();

        /**
         * The meta object literal for the '<em><b>Refers To Constructed Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getAgAttributeType_RefersToConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Refers To Enumeration</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION = eINSTANCE.getAgAttributeType_RefersToEnumeration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl <em>Ag Attribute Type And Values</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeAndValuesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgAttributeTypeAndValues()
         * @generated
         */
        EClass AG_ATTRIBUTE_TYPE_AND_VALUES = eINSTANCE.getAgAttributeTypeAndValues();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE = eINSTANCE.getAgAttributeTypeAndValues_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE = eINSTANCE.getAgAttributeTypeAndValues_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE = eINSTANCE.getAgAttributeTypeAndValues_MinValue();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl <em>Ag Underlying Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUnderlyingTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgUnderlyingType()
         * @generated
         */
        EClass AG_UNDERLYING_TYPE = eINSTANCE.getAgUnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_UNDERLYING_TYPE__UNDERLYING_TYPE = eINSTANCE.getAgUnderlyingType_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND = eINSTANCE.getAgUnderlyingType_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUMLImpl <em>Ag UML</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgUMLImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgUML()
         * @generated
         */
        EClass AG_UML = eINSTANCE.getAgUML();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_UML__UML_DATE = eINSTANCE.getAgUML_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_UML__UML_VERSION = eINSTANCE.getAgUML_UmlVersion();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSdescImpl <em>Ag NSdesc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSdescImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAgNSdesc()
         * @generated
         */
        EClass AG_NSDESC = eINSTANCE.getAgNSdesc();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AG_NSDESC__DESC_ID = eINSTANCE.getAgNSdesc_DescID();

        /**
         * The meta object literal for the '<em><b>Refers To Doc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AG_NSDESC__REFERS_TO_DOC = eINSTANCE.getAgNSdesc_RefersToDoc();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole <em>IRise Clipse Console</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getIRiseClipseConsole()
         * @generated
         */
        EClass IRISE_CLIPSE_CONSOLE = eINSTANCE.getIRiseClipseConsole();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKind()
         * @generated
         */
        EEnum ACSI_SERVICES_KIND = eINSTANCE.getACSIServicesKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKind()
         * @generated
         */
        EEnum CB_KIND = eINSTANCE.getCBKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKind()
         * @generated
         */
        EEnum DEFINED_ATTRIBUTE_TYPE_KIND = eINSTANCE.getDefinedAttributeTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKind()
         * @generated
         */
        EEnum LICENSE_KIND = eINSTANCE.getLicenseKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStage()
         * @generated
         */
        EEnum PUB_STAGE = eINSTANCE.getPubStage();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKind()
         * @generated
         */
        EEnum UNDEFINED_ATTRIBUTE_TYPE_KIND = eINSTANCE.getUndefinedAttributeTypeKind();

        /**
         * The meta object literal for the '<em>ACSI Services Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKindObject()
         * @generated
         */
        EDataType ACSI_SERVICES_KIND_OBJECT = eINSTANCE.getACSIServicesKindObject();

        /**
         * The meta object literal for the '<em>Attribute Type Kind</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.Enumerator
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAttributeTypeKind()
         * @generated
         */
        EDataType ATTRIBUTE_TYPE_KIND = eINSTANCE.getAttributeTypeKind();

        /**
         * The meta object literal for the '<em>CB Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKindObject()
         * @generated
         */
        EDataType CB_KIND_OBJECT = eINSTANCE.getCBKindObject();

        /**
         * The meta object literal for the '<em>Defined Attribute Type Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKindObject()
         * @generated
         */
        EDataType DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = eINSTANCE.getDefinedAttributeTypeKindObject();

        /**
         * The meta object literal for the '<em>License Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKindObject()
         * @generated
         */
        EDataType LICENSE_KIND_OBJECT = eINSTANCE.getLicenseKindObject();

        /**
         * The meta object literal for the '<em>Pub Stage Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStageObject()
         * @generated
         */
        EDataType PUB_STAGE_OBJECT = eINSTANCE.getPubStageObject();

        /**
         * The meta object literal for the '<em>Undefined Attribute Type Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKindObject()
         * @generated
         */
        EDataType UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = eINSTANCE.getUndefinedAttributeTypeKindObject();

    }

} //NsdPackage
