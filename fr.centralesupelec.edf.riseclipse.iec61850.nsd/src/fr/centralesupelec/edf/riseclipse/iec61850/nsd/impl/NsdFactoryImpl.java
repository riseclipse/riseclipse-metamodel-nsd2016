/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.License;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDependencyType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NsdFactoryImpl extends EFactoryImpl implements NsdFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NsdFactory init() {
        try {
            NsdFactory theNsdFactory = ( NsdFactory ) EPackage.Registry.INSTANCE.getEFactory( NsdPackage.eNS_URI );
            if( theNsdFactory != null ) {
                return theNsdFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new NsdFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NsdFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case NsdPackage.APPLIES_TO_TYPE:
            return createAppliesToType();
        case NsdPackage.DEPENDS_ON:
            return createDependsOn();
        case NsdPackage.DOCUMENT_ROOT:
            return createDocumentRoot();
        case NsdPackage.SERVICE_TYPE:
            return createServiceType();
        case NsdPackage.ABBREVIATION:
            return createAbbreviation();
        case NsdPackage.ABBREVIATIONS:
            return createAbbreviations();
        case NsdPackage.ABSTRACT_LN_CLASS:
            return createAbstractLNClass();
        case NsdPackage.APPLICABLE_SERVICE_NS:
            return createApplicableServiceNS();
        case NsdPackage.APPLICABLE_SERVICES:
            return createApplicableServices();
        case NsdPackage.BASIC_TYPE:
            return createBasicType();
        case NsdPackage.BASIC_TYPES:
            return createBasicTypes();
        case NsdPackage.CDC:
            return createCDC();
        case NsdPackage.CD_CS:
            return createCDCs();
        case NsdPackage.CHANGES:
            return createChanges();
        case NsdPackage.CONSTRUCTED_ATTRIBUTE:
            return createConstructedAttribute();
        case NsdPackage.CONSTRUCTED_ATTRIBUTES:
            return createConstructedAttributes();
        case NsdPackage.COPYRIGHTED:
            return createCopyrighted();
        case NsdPackage.COPYRIGHT_NOTICE:
            return createCopyrightNotice();
        case NsdPackage.DATA_ATTRIBUTE:
            return createDataAttribute();
        case NsdPackage.DATA_OBJECT:
            return createDataObject();
        case NsdPackage.DATA_SET_MEMBER_OF:
            return createDataSetMemberOf();
        case NsdPackage.DOC:
            return createDoc();
        case NsdPackage.ENUMERATION:
            return createEnumeration();
        case NsdPackage.ENUMERATIONS:
            return createEnumerations();
        case NsdPackage.FUNCTIONAL_CONSTRAINT:
            return createFunctionalConstraint();
        case NsdPackage.FUNCTIONAL_CONSTRAINTS:
            return createFunctionalConstraints();
        case NsdPackage.LICENSE:
            return createLicense();
        case NsdPackage.LITERAL:
            return createLiteral();
        case NsdPackage.LN_CLASS:
            return createLNClass();
        case NsdPackage.LN_CLASSES:
            return createLNClasses();
        case NsdPackage.NOTICE:
            return createNotice();
        case NsdPackage.NS:
            return createNS();
        case NsdPackage.NS_DOC:
            return createNSDoc();
        case NsdPackage.PRESENCE_CONDITION:
            return createPresenceCondition();
        case NsdPackage.PRESENCE_CONDITIONS:
            return createPresenceConditions();
        case NsdPackage.SERVICE_CDC:
            return createServiceCDC();
        case NsdPackage.SERVICE_CD_CS:
            return createServiceCDCs();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE:
            return createServiceConstructedAttribute();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES:
            return createServiceConstructedAttributes();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE:
            return createServiceDataAttribute();
        case NsdPackage.SERVICE_NS:
            return createServiceNS();
        case NsdPackage.SERVICE_NS_USAGE:
            return createServiceNsUsage();
        case NsdPackage.SERVICE_PARAMETER:
            return createServiceParameter();
        case NsdPackage.SERVICE_TYPE_REALIZATIONS:
            return createServiceTypeRealizations();
        case NsdPackage.SUB_DATA_ATTRIBUTE:
            return createSubDataAttribute();
        case NsdPackage.SUB_DATA_OBJECT:
            return createSubDataObject();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch( eDataType.getClassifierID() ) {
        case NsdPackage.ACSI_SERVICES_KIND:
            return createACSIServicesKindFromString( eDataType, initialValue );
        case NsdPackage.CB_KIND:
            return createCBKindFromString( eDataType, initialValue );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND:
            return createDefinedAttributeTypeKindFromString( eDataType, initialValue );
        case NsdPackage.LICENSE_KIND:
            return createLicenseKindFromString( eDataType, initialValue );
        case NsdPackage.PUB_STAGE:
            return createPubStageFromString( eDataType, initialValue );
        case NsdPackage.UNDEFINED_ATTRIBUTE_TYPE_KIND:
            return createUndefinedAttributeTypeKindFromString( eDataType, initialValue );
        case NsdPackage.NS_TYPE:
            return createNSTypeFromString( eDataType, initialValue );
        case NsdPackage.NS_DEPENDENCY_TYPE:
            return createNSDependencyTypeFromString( eDataType, initialValue );
        case NsdPackage.ACSI_SERVICES_KIND_OBJECT:
            return createACSIServicesKindObjectFromString( eDataType, initialValue );
        case NsdPackage.ATTRIBUTE_TYPE_KIND:
            return createAttributeTypeKindFromString( eDataType, initialValue );
        case NsdPackage.CB_KIND_OBJECT:
            return createCBKindObjectFromString( eDataType, initialValue );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return createDefinedAttributeTypeKindObjectFromString( eDataType, initialValue );
        case NsdPackage.LICENSE_KIND_OBJECT:
            return createLicenseKindObjectFromString( eDataType, initialValue );
        case NsdPackage.PUB_STAGE_OBJECT:
            return createPubStageObjectFromString( eDataType, initialValue );
        case NsdPackage.UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return createUndefinedAttributeTypeKindObjectFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch( eDataType.getClassifierID() ) {
        case NsdPackage.ACSI_SERVICES_KIND:
            return convertACSIServicesKindToString( eDataType, instanceValue );
        case NsdPackage.CB_KIND:
            return convertCBKindToString( eDataType, instanceValue );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND:
            return convertDefinedAttributeTypeKindToString( eDataType, instanceValue );
        case NsdPackage.LICENSE_KIND:
            return convertLicenseKindToString( eDataType, instanceValue );
        case NsdPackage.PUB_STAGE:
            return convertPubStageToString( eDataType, instanceValue );
        case NsdPackage.UNDEFINED_ATTRIBUTE_TYPE_KIND:
            return convertUndefinedAttributeTypeKindToString( eDataType, instanceValue );
        case NsdPackage.NS_TYPE:
            return convertNSTypeToString( eDataType, instanceValue );
        case NsdPackage.NS_DEPENDENCY_TYPE:
            return convertNSDependencyTypeToString( eDataType, instanceValue );
        case NsdPackage.ACSI_SERVICES_KIND_OBJECT:
            return convertACSIServicesKindObjectToString( eDataType, instanceValue );
        case NsdPackage.ATTRIBUTE_TYPE_KIND:
            return convertAttributeTypeKindToString( eDataType, instanceValue );
        case NsdPackage.CB_KIND_OBJECT:
            return convertCBKindObjectToString( eDataType, instanceValue );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return convertDefinedAttributeTypeKindObjectToString( eDataType, instanceValue );
        case NsdPackage.LICENSE_KIND_OBJECT:
            return convertLicenseKindObjectToString( eDataType, instanceValue );
        case NsdPackage.PUB_STAGE_OBJECT:
            return convertPubStageObjectToString( eDataType, instanceValue );
        case NsdPackage.UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return convertUndefinedAttributeTypeKindObjectToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AppliesToType createAppliesToType() {
        AppliesToTypeImpl appliesToType = new AppliesToTypeImpl();
        return appliesToType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DependsOn createDependsOn() {
        DependsOnImpl dependsOn = new DependsOnImpl();
        return dependsOn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceType createServiceType() {
        ServiceTypeImpl serviceType = new ServiceTypeImpl();
        return serviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Abbreviation createAbbreviation() {
        AbbreviationImpl abbreviation = new AbbreviationImpl();
        return abbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Abbreviations createAbbreviations() {
        AbbreviationsImpl abbreviations = new AbbreviationsImpl();
        return abbreviations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractLNClass createAbstractLNClass() {
        AbstractLNClassImpl abstractLNClass = new AbstractLNClassImpl();
        return abstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServiceNS createApplicableServiceNS() {
        ApplicableServiceNSImpl applicableServiceNS = new ApplicableServiceNSImpl();
        return applicableServiceNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServices createApplicableServices() {
        ApplicableServicesImpl applicableServices = new ApplicableServicesImpl();
        return applicableServices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicType createBasicType() {
        BasicTypeImpl basicType = new BasicTypeImpl();
        return basicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicTypes createBasicTypes() {
        BasicTypesImpl basicTypes = new BasicTypesImpl();
        return basicTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CDC createCDC() {
        CDCImpl cdc = new CDCImpl();
        return cdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CDCs createCDCs() {
        CDCsImpl cdCs = new CDCsImpl();
        return cdCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Changes createChanges() {
        ChangesImpl changes = new ChangesImpl();
        return changes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttribute createConstructedAttribute() {
        ConstructedAttributeImpl constructedAttribute = new ConstructedAttributeImpl();
        return constructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttributes createConstructedAttributes() {
        ConstructedAttributesImpl constructedAttributes = new ConstructedAttributesImpl();
        return constructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Copyrighted createCopyrighted() {
        CopyrightedImpl copyrighted = new CopyrightedImpl();
        return copyrighted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CopyrightNotice createCopyrightNotice() {
        CopyrightNoticeImpl copyrightNotice = new CopyrightNoticeImpl();
        return copyrightNotice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataAttribute createDataAttribute() {
        DataAttributeImpl dataAttribute = new DataAttributeImpl();
        return dataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataObject createDataObject() {
        DataObjectImpl dataObject = new DataObjectImpl();
        return dataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataSetMemberOf createDataSetMemberOf() {
        DataSetMemberOfImpl dataSetMemberOf = new DataSetMemberOfImpl();
        return dataSetMemberOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc createDoc() {
        DocImpl doc = new DocImpl();
        return doc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumerations createEnumerations() {
        EnumerationsImpl enumerations = new EnumerationsImpl();
        return enumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraint createFunctionalConstraint() {
        FunctionalConstraintImpl functionalConstraint = new FunctionalConstraintImpl();
        return functionalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraints createFunctionalConstraints() {
        FunctionalConstraintsImpl functionalConstraints = new FunctionalConstraintsImpl();
        return functionalConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public License createLicense() {
        LicenseImpl license = new LicenseImpl();
        return license;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Literal createLiteral() {
        LiteralImpl literal = new LiteralImpl();
        return literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNClass createLNClass() {
        LNClassImpl lnClass = new LNClassImpl();
        return lnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNClasses createLNClasses() {
        LNClassesImpl lnClasses = new LNClassesImpl();
        return lnClasses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Notice createNotice() {
        NoticeImpl notice = new NoticeImpl();
        return notice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS createNS() {
        NSImpl ns = new NSImpl();
        return ns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NSDoc createNSDoc() {
        NSDocImpl nsDoc = new NSDocImpl();
        return nsDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PresenceCondition createPresenceCondition() {
        PresenceConditionImpl presenceCondition = new PresenceConditionImpl();
        return presenceCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PresenceConditions createPresenceConditions() {
        PresenceConditionsImpl presenceConditions = new PresenceConditionsImpl();
        return presenceConditions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCDC createServiceCDC() {
        ServiceCDCImpl serviceCDC = new ServiceCDCImpl();
        return serviceCDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCDCs createServiceCDCs() {
        ServiceCDCsImpl serviceCDCs = new ServiceCDCsImpl();
        return serviceCDCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceConstructedAttribute createServiceConstructedAttribute() {
        ServiceConstructedAttributeImpl serviceConstructedAttribute = new ServiceConstructedAttributeImpl();
        return serviceConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceConstructedAttributes createServiceConstructedAttributes() {
        ServiceConstructedAttributesImpl serviceConstructedAttributes = new ServiceConstructedAttributesImpl();
        return serviceConstructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceDataAttribute createServiceDataAttribute() {
        ServiceDataAttributeImpl serviceDataAttribute = new ServiceDataAttributeImpl();
        return serviceDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS createServiceNS() {
        ServiceNSImpl serviceNS = new ServiceNSImpl();
        return serviceNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNsUsage createServiceNsUsage() {
        ServiceNsUsageImpl serviceNsUsage = new ServiceNsUsageImpl();
        return serviceNsUsage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceParameter createServiceParameter() {
        ServiceParameterImpl serviceParameter = new ServiceParameterImpl();
        return serviceParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceTypeRealizations createServiceTypeRealizations() {
        ServiceTypeRealizationsImpl serviceTypeRealizations = new ServiceTypeRealizationsImpl();
        return serviceTypeRealizations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubDataAttribute createSubDataAttribute() {
        SubDataAttributeImpl subDataAttribute = new SubDataAttributeImpl();
        return subDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubDataObject createSubDataObject() {
        SubDataObjectImpl subDataObject = new SubDataObjectImpl();
        return subDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACSIServicesKind createACSIServicesKindFromString( EDataType eDataType, String initialValue ) {
        ACSIServicesKind result = ACSIServicesKind.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertACSIServicesKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CBKind createCBKindFromString( EDataType eDataType, String initialValue ) {
        CBKind result = CBKind.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCBKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinedAttributeTypeKind createDefinedAttributeTypeKindFromString( EDataType eDataType,
            String initialValue ) {
        DefinedAttributeTypeKind result = DefinedAttributeTypeKind.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDefinedAttributeTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LicenseKind createLicenseKindFromString( EDataType eDataType, String initialValue ) {
        LicenseKind result = LicenseKind.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLicenseKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PubStage createPubStageFromString( EDataType eDataType, String initialValue ) {
        PubStage result = PubStage.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPubStageToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UndefinedAttributeTypeKind createUndefinedAttributeTypeKindFromString( EDataType eDataType,
            String initialValue ) {
        UndefinedAttributeTypeKind result = UndefinedAttributeTypeKind.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUndefinedAttributeTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NSType createNSTypeFromString( EDataType eDataType, String initialValue ) {
        NSType result = NSType.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNSTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NSDependencyType createNSDependencyTypeFromString( EDataType eDataType, String initialValue ) {
        NSDependencyType result = NSDependencyType.get( initialValue );
        if( result == null ) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNSDependencyTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACSIServicesKind createACSIServicesKindObjectFromString( EDataType eDataType, String initialValue ) {
        return createACSIServicesKindFromString( NsdPackage.Literals.ACSI_SERVICES_KIND, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertACSIServicesKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertACSIServicesKindToString( NsdPackage.Literals.ACSI_SERVICES_KIND, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumerator createAttributeTypeKindFromString( EDataType eDataType, String initialValue ) {
        if( initialValue == null ) {
            return null;
        }
        Enumerator result = null;
        RuntimeException exception = null;
        try {
            result = createDefinedAttributeTypeKindFromString(
                    NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND, initialValue );
            if( result != null && Diagnostician.INSTANCE.validate( eDataType, result, null, null ) ) {
                return result;
            }
        }
        catch( RuntimeException e ) {
            exception = e;
        }
        try {
            result = createUndefinedAttributeTypeKindFromString(
                    NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND, initialValue );
            if( result != null && Diagnostician.INSTANCE.validate( eDataType, result, null, null ) ) {
                return result;
            }
        }
        catch( RuntimeException e ) {
            exception = e;
        }
        if( result != null || exception == null ) {
            return result;
        }

        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttributeTypeKindToString( EDataType eDataType, Object instanceValue ) {
        if( instanceValue == null ) {
            return null;
        }
        if( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.isInstance( instanceValue ) ) {
            try {
                String value = convertDefinedAttributeTypeKindToString( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND,
                        instanceValue );
                if( value != null ) {
                    return value;
                }
            }
            catch( Exception e ) {
                // Keep trying other member types until all have failed.
            }
        }
        if( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( instanceValue ) ) {
            try {
                String value = convertUndefinedAttributeTypeKindToString(
                        NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND, instanceValue );
                if( value != null ) {
                    return value;
                }
            }
            catch( Exception e ) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException(
                "Invalid value: '" + instanceValue + "' for datatype :" + eDataType.getName() );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CBKind createCBKindObjectFromString( EDataType eDataType, String initialValue ) {
        return createCBKindFromString( NsdPackage.Literals.CB_KIND, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCBKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertCBKindToString( NsdPackage.Literals.CB_KIND, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinedAttributeTypeKind createDefinedAttributeTypeKindObjectFromString( EDataType eDataType,
            String initialValue ) {
        return createDefinedAttributeTypeKindFromString( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDefinedAttributeTypeKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertDefinedAttributeTypeKindToString( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND,
                instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LicenseKind createLicenseKindObjectFromString( EDataType eDataType, String initialValue ) {
        return createLicenseKindFromString( NsdPackage.Literals.LICENSE_KIND, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLicenseKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertLicenseKindToString( NsdPackage.Literals.LICENSE_KIND, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PubStage createPubStageObjectFromString( EDataType eDataType, String initialValue ) {
        return createPubStageFromString( NsdPackage.Literals.PUB_STAGE, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPubStageObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertPubStageToString( NsdPackage.Literals.PUB_STAGE, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UndefinedAttributeTypeKind createUndefinedAttributeTypeKindObjectFromString( EDataType eDataType,
            String initialValue ) {
        return createUndefinedAttributeTypeKindFromString( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUndefinedAttributeTypeKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertUndefinedAttributeTypeKindToString( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND,
                instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NsdPackage getNsdPackage() {
        return ( NsdPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static NsdPackage getPackage() {
        return NsdPackage.eINSTANCE;
    }

} //NsdFactoryImpl
