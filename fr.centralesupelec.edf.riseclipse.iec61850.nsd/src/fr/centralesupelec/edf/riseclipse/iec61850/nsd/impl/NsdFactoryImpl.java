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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.*;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
        case NsdPackage.DEPENDS_ON_TYPE:
            return createDependsOnType();
        case NsdPackage.DOCUMENT_ROOT:
            return createDocumentRoot();
        case NsdPackage.SERVICE_TYPE:
            return createServiceType();
        case NsdPackage.TABBREVIATION:
            return createTAbbreviation();
        case NsdPackage.TABBREVIATIONS:
            return createTAbbreviations();
        case NsdPackage.TABSTRACT_LN_CLASS:
            return createTAbstractLNClass();
        case NsdPackage.TAPPLICABLE_SERVICE_NS:
            return createTApplicableServiceNS();
        case NsdPackage.TAPPLICABLE_SERVICES:
            return createTApplicableServices();
        case NsdPackage.TBASIC_TYPE:
            return createTBasicType();
        case NsdPackage.TBASIC_TYPES:
            return createTBasicTypes();
        case NsdPackage.TCDC:
            return createTCDC();
        case NsdPackage.TCD_CS:
            return createTCDCs();
        case NsdPackage.TCHANGES:
            return createTChanges();
        case NsdPackage.TCONSTRUCTED_ATTRIBUTE:
            return createTConstructedAttribute();
        case NsdPackage.TCONSTRUCTED_ATTRIBUTES:
            return createTConstructedAttributes();
        case NsdPackage.TCOPYRIGHTED:
            return createTCopyrighted();
        case NsdPackage.TCOPYRIGHT_NOTICE:
            return createTCopyrightNotice();
        case NsdPackage.TDATA_ATTRIBUTE:
            return createTDataAttribute();
        case NsdPackage.TDATA_OBJECT:
            return createTDataObject();
        case NsdPackage.TDATA_SET_MEMBER_OF:
            return createTDataSetMemberOf();
        case NsdPackage.TDOC:
            return createTDoc();
        case NsdPackage.TDOCUMENTED_CLASS:
            return createTDocumentedClass();
        case NsdPackage.TENUMERATION:
            return createTEnumeration();
        case NsdPackage.TENUMERATIONS:
            return createTEnumerations();
        case NsdPackage.TFUNCTIONAL_CONSTRAINT:
            return createTFunctionalConstraint();
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS:
            return createTFunctionalConstraints();
        case NsdPackage.TLICENSE:
            return createTLicense();
        case NsdPackage.TLITERAL:
            return createTLiteral();
        case NsdPackage.TLN_CLASS:
            return createTLNClass();
        case NsdPackage.TLN_CLASSES:
            return createTLNClasses();
        case NsdPackage.TNOTICE:
            return createTNotice();
        case NsdPackage.TNS:
            return createTNS();
        case NsdPackage.TNS_DOC:
            return createTNSDoc();
        case NsdPackage.TPRESENCE_CONDITION:
            return createTPresenceCondition();
        case NsdPackage.TPRESENCE_CONDITIONS:
            return createTPresenceConditions();
        case NsdPackage.TSERVICE_CDC:
            return createTServiceCDC();
        case NsdPackage.TSERVICE_CD_CS:
            return createTServiceCDCs();
        case NsdPackage.TSERVICE_CONSTRUCTED_ATTRIBUTE:
            return createTServiceConstructedAttribute();
        case NsdPackage.TSERVICE_CONSTRUCTED_ATTRIBUTES:
            return createTServiceConstructedAttributes();
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE:
            return createTServiceDataAttribute();
        case NsdPackage.TSERVICE_NS:
            return createTServiceNS();
        case NsdPackage.TSERVICE_NS_USAGE:
            return createTServiceNsUsage();
        case NsdPackage.TSERVICE_PARAMETER:
            return createTServiceParameter();
        case NsdPackage.TSERVICE_TYPE_REALIZATION:
            return createTServiceTypeRealization();
        case NsdPackage.TSERVICE_TYPE_REALIZATIONS:
            return createTServiceTypeRealizations();
        case NsdPackage.TSUB_DATA_ATTRIBUTE:
            return createTSubDataAttribute();
        case NsdPackage.TSUB_DATA_OBJECT:
            return createTSubDataObject();
        case NsdPackage.TTITLED_CLASS:
            return createTTitledClass();
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
        case NsdPackage.TACSI_SERVICES_KIND:
            return createTACSIServicesKindFromString( eDataType, initialValue );
        case NsdPackage.TCB_KIND:
            return createTCBKindFromString( eDataType, initialValue );
        case NsdPackage.TDEFINED_ATTRIBUTE_TYPE_KIND:
            return createTDefinedAttributeTypeKindFromString( eDataType, initialValue );
        case NsdPackage.TLICENSE_KIND:
            return createTLicenseKindFromString( eDataType, initialValue );
        case NsdPackage.TPUB_STAGE:
            return createTPubStageFromString( eDataType, initialValue );
        case NsdPackage.TUNDEFINED_ATTRIBUTE_TYPE_KIND:
            return createTUndefinedAttributeTypeKindFromString( eDataType, initialValue );
        case NsdPackage.TABBREVIATION_NAME:
            return createTAbbreviationNameFromString( eDataType, initialValue );
        case NsdPackage.TABSTRACT_LN_CLASS_NAME:
            return createTAbstractLNClassNameFromString( eDataType, initialValue );
        case NsdPackage.TACSI_SERVICES_KIND_OBJECT:
            return createTACSIServicesKindObjectFromString( eDataType, initialValue );
        case NsdPackage.TATTRIBUTE_NAME:
            return createTAttributeNameFromString( eDataType, initialValue );
        case NsdPackage.TATTRIBUTE_TYPE_KIND:
            return createTAttributeTypeKindFromString( eDataType, initialValue );
        case NsdPackage.TBASIC_TYPE_NAME:
            return createTBasicTypeNameFromString( eDataType, initialValue );
        case NsdPackage.TCB_KIND_OBJECT:
            return createTCBKindObjectFromString( eDataType, initialValue );
        case NsdPackage.TCDC_NAME:
            return createTCDCNameFromString( eDataType, initialValue );
        case NsdPackage.TDATA_OBJECT_NAME:
            return createTDataObjectNameFromString( eDataType, initialValue );
        case NsdPackage.TDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return createTDefinedAttributeTypeKindObjectFromString( eDataType, initialValue );
        case NsdPackage.TDOC_ID:
            return createTDocIDFromString( eDataType, initialValue );
        case NsdPackage.TEMPTY_STRING:
            return createTEmptyStringFromString( eDataType, initialValue );
        case NsdPackage.TFC_ABBREVIATION:
            return createTFCAbbreviationFromString( eDataType, initialValue );
        case NsdPackage.TIEC61850_NAME:
            return createTIec61850NameFromString( eDataType, initialValue );
        case NsdPackage.TIEC61850_NAME_STRING:
            return createTIec61850NameStringFromString( eDataType, initialValue );
        case NsdPackage.TISSUES_TYPE:
            return createTissuesTypeFromString( eDataType, initialValue );
        case NsdPackage.TLICENSE_KIND_OBJECT:
            return createTLicenseKindObjectFromString( eDataType, initialValue );
        case NsdPackage.TLITERAL_NAME:
            return createTLiteralNameFromString( eDataType, initialValue );
        case NsdPackage.TLN_CLASS_NAME:
            return createTLNClassNameFromString( eDataType, initialValue );
        case NsdPackage.TNS_IDENTIFIER:
            return createTNSIdentifierFromString( eDataType, initialValue );
        case NsdPackage.TNS_RELEASE:
            return createTNSReleaseFromString( eDataType, initialValue );
        case NsdPackage.TNS_RELEASE_OBJECT:
            return createTNSReleaseObjectFromString( eDataType, initialValue );
        case NsdPackage.TNS_REVISION:
            return createTNSRevisionFromString( eDataType, initialValue );
        case NsdPackage.TNS_VERSION:
            return createTNSVersionFromString( eDataType, initialValue );
        case NsdPackage.TNS_VERSION_OBJECT:
            return createTNSVersionObjectFromString( eDataType, initialValue );
        case NsdPackage.TPRESENCE_CONDITION_ARGUMENT:
            return createTPresenceConditionArgumentFromString( eDataType, initialValue );
        case NsdPackage.TPRESENCE_CONDITION_NAME:
            return createTPresenceConditionNameFromString( eDataType, initialValue );
        case NsdPackage.TPUB_STAGE_OBJECT:
            return createTPubStageObjectFromString( eDataType, initialValue );
        case NsdPackage.TSUB_DATA_OBJECT_NAME:
            return createTSubDataObjectNameFromString( eDataType, initialValue );
        case NsdPackage.TUML_VERSION:
            return createTUMLVersionFromString( eDataType, initialValue );
        case NsdPackage.TUNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return createTUndefinedAttributeTypeKindObjectFromString( eDataType, initialValue );
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
        case NsdPackage.TACSI_SERVICES_KIND:
            return convertTACSIServicesKindToString( eDataType, instanceValue );
        case NsdPackage.TCB_KIND:
            return convertTCBKindToString( eDataType, instanceValue );
        case NsdPackage.TDEFINED_ATTRIBUTE_TYPE_KIND:
            return convertTDefinedAttributeTypeKindToString( eDataType, instanceValue );
        case NsdPackage.TLICENSE_KIND:
            return convertTLicenseKindToString( eDataType, instanceValue );
        case NsdPackage.TPUB_STAGE:
            return convertTPubStageToString( eDataType, instanceValue );
        case NsdPackage.TUNDEFINED_ATTRIBUTE_TYPE_KIND:
            return convertTUndefinedAttributeTypeKindToString( eDataType, instanceValue );
        case NsdPackage.TABBREVIATION_NAME:
            return convertTAbbreviationNameToString( eDataType, instanceValue );
        case NsdPackage.TABSTRACT_LN_CLASS_NAME:
            return convertTAbstractLNClassNameToString( eDataType, instanceValue );
        case NsdPackage.TACSI_SERVICES_KIND_OBJECT:
            return convertTACSIServicesKindObjectToString( eDataType, instanceValue );
        case NsdPackage.TATTRIBUTE_NAME:
            return convertTAttributeNameToString( eDataType, instanceValue );
        case NsdPackage.TATTRIBUTE_TYPE_KIND:
            return convertTAttributeTypeKindToString( eDataType, instanceValue );
        case NsdPackage.TBASIC_TYPE_NAME:
            return convertTBasicTypeNameToString( eDataType, instanceValue );
        case NsdPackage.TCB_KIND_OBJECT:
            return convertTCBKindObjectToString( eDataType, instanceValue );
        case NsdPackage.TCDC_NAME:
            return convertTCDCNameToString( eDataType, instanceValue );
        case NsdPackage.TDATA_OBJECT_NAME:
            return convertTDataObjectNameToString( eDataType, instanceValue );
        case NsdPackage.TDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return convertTDefinedAttributeTypeKindObjectToString( eDataType, instanceValue );
        case NsdPackage.TDOC_ID:
            return convertTDocIDToString( eDataType, instanceValue );
        case NsdPackage.TEMPTY_STRING:
            return convertTEmptyStringToString( eDataType, instanceValue );
        case NsdPackage.TFC_ABBREVIATION:
            return convertTFCAbbreviationToString( eDataType, instanceValue );
        case NsdPackage.TIEC61850_NAME:
            return convertTIec61850NameToString( eDataType, instanceValue );
        case NsdPackage.TIEC61850_NAME_STRING:
            return convertTIec61850NameStringToString( eDataType, instanceValue );
        case NsdPackage.TISSUES_TYPE:
            return convertTissuesTypeToString( eDataType, instanceValue );
        case NsdPackage.TLICENSE_KIND_OBJECT:
            return convertTLicenseKindObjectToString( eDataType, instanceValue );
        case NsdPackage.TLITERAL_NAME:
            return convertTLiteralNameToString( eDataType, instanceValue );
        case NsdPackage.TLN_CLASS_NAME:
            return convertTLNClassNameToString( eDataType, instanceValue );
        case NsdPackage.TNS_IDENTIFIER:
            return convertTNSIdentifierToString( eDataType, instanceValue );
        case NsdPackage.TNS_RELEASE:
            return convertTNSReleaseToString( eDataType, instanceValue );
        case NsdPackage.TNS_RELEASE_OBJECT:
            return convertTNSReleaseObjectToString( eDataType, instanceValue );
        case NsdPackage.TNS_REVISION:
            return convertTNSRevisionToString( eDataType, instanceValue );
        case NsdPackage.TNS_VERSION:
            return convertTNSVersionToString( eDataType, instanceValue );
        case NsdPackage.TNS_VERSION_OBJECT:
            return convertTNSVersionObjectToString( eDataType, instanceValue );
        case NsdPackage.TPRESENCE_CONDITION_ARGUMENT:
            return convertTPresenceConditionArgumentToString( eDataType, instanceValue );
        case NsdPackage.TPRESENCE_CONDITION_NAME:
            return convertTPresenceConditionNameToString( eDataType, instanceValue );
        case NsdPackage.TPUB_STAGE_OBJECT:
            return convertTPubStageObjectToString( eDataType, instanceValue );
        case NsdPackage.TSUB_DATA_OBJECT_NAME:
            return convertTSubDataObjectNameToString( eDataType, instanceValue );
        case NsdPackage.TUML_VERSION:
            return convertTUMLVersionToString( eDataType, instanceValue );
        case NsdPackage.TUNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return convertTUndefinedAttributeTypeKindObjectToString( eDataType, instanceValue );
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
    public DependsOnType createDependsOnType() {
        DependsOnTypeImpl dependsOnType = new DependsOnTypeImpl();
        return dependsOnType;
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
    public TAbbreviation createTAbbreviation() {
        TAbbreviationImpl tAbbreviation = new TAbbreviationImpl();
        return tAbbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TAbbreviations createTAbbreviations() {
        TAbbreviationsImpl tAbbreviations = new TAbbreviationsImpl();
        return tAbbreviations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TAbstractLNClass createTAbstractLNClass() {
        TAbstractLNClassImpl tAbstractLNClass = new TAbstractLNClassImpl();
        return tAbstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TApplicableServiceNS createTApplicableServiceNS() {
        TApplicableServiceNSImpl tApplicableServiceNS = new TApplicableServiceNSImpl();
        return tApplicableServiceNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TApplicableServices createTApplicableServices() {
        TApplicableServicesImpl tApplicableServices = new TApplicableServicesImpl();
        return tApplicableServices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TBasicType createTBasicType() {
        TBasicTypeImpl tBasicType = new TBasicTypeImpl();
        return tBasicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TBasicTypes createTBasicTypes() {
        TBasicTypesImpl tBasicTypes = new TBasicTypesImpl();
        return tBasicTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TCDC createTCDC() {
        TCDCImpl tcdc = new TCDCImpl();
        return tcdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TCDCs createTCDCs() {
        TCDCsImpl tcdCs = new TCDCsImpl();
        return tcdCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TChanges createTChanges() {
        TChangesImpl tChanges = new TChangesImpl();
        return tChanges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TConstructedAttribute createTConstructedAttribute() {
        TConstructedAttributeImpl tConstructedAttribute = new TConstructedAttributeImpl();
        return tConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TConstructedAttributes createTConstructedAttributes() {
        TConstructedAttributesImpl tConstructedAttributes = new TConstructedAttributesImpl();
        return tConstructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TCopyrighted createTCopyrighted() {
        TCopyrightedImpl tCopyrighted = new TCopyrightedImpl();
        return tCopyrighted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TCopyrightNotice createTCopyrightNotice() {
        TCopyrightNoticeImpl tCopyrightNotice = new TCopyrightNoticeImpl();
        return tCopyrightNotice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TDataAttribute createTDataAttribute() {
        TDataAttributeImpl tDataAttribute = new TDataAttributeImpl();
        return tDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TDataObject createTDataObject() {
        TDataObjectImpl tDataObject = new TDataObjectImpl();
        return tDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TDataSetMemberOf createTDataSetMemberOf() {
        TDataSetMemberOfImpl tDataSetMemberOf = new TDataSetMemberOfImpl();
        return tDataSetMemberOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TDoc createTDoc() {
        TDocImpl tDoc = new TDocImpl();
        return tDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TDocumentedClass createTDocumentedClass() {
        TDocumentedClassImpl tDocumentedClass = new TDocumentedClassImpl();
        return tDocumentedClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TEnumeration createTEnumeration() {
        TEnumerationImpl tEnumeration = new TEnumerationImpl();
        return tEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TEnumerations createTEnumerations() {
        TEnumerationsImpl tEnumerations = new TEnumerationsImpl();
        return tEnumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TFunctionalConstraint createTFunctionalConstraint() {
        TFunctionalConstraintImpl tFunctionalConstraint = new TFunctionalConstraintImpl();
        return tFunctionalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TFunctionalConstraints createTFunctionalConstraints() {
        TFunctionalConstraintsImpl tFunctionalConstraints = new TFunctionalConstraintsImpl();
        return tFunctionalConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TLicense createTLicense() {
        TLicenseImpl tLicense = new TLicenseImpl();
        return tLicense;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TLiteral createTLiteral() {
        TLiteralImpl tLiteral = new TLiteralImpl();
        return tLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TLNClass createTLNClass() {
        TLNClassImpl tlnClass = new TLNClassImpl();
        return tlnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TLNClasses createTLNClasses() {
        TLNClassesImpl tlnClasses = new TLNClassesImpl();
        return tlnClasses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TNotice createTNotice() {
        TNoticeImpl tNotice = new TNoticeImpl();
        return tNotice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TNS createTNS() {
        TNSImpl tns = new TNSImpl();
        return tns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TNSDoc createTNSDoc() {
        TNSDocImpl tnsDoc = new TNSDocImpl();
        return tnsDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TPresenceCondition createTPresenceCondition() {
        TPresenceConditionImpl tPresenceCondition = new TPresenceConditionImpl();
        return tPresenceCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TPresenceConditions createTPresenceConditions() {
        TPresenceConditionsImpl tPresenceConditions = new TPresenceConditionsImpl();
        return tPresenceConditions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceCDC createTServiceCDC() {
        TServiceCDCImpl tServiceCDC = new TServiceCDCImpl();
        return tServiceCDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceCDCs createTServiceCDCs() {
        TServiceCDCsImpl tServiceCDCs = new TServiceCDCsImpl();
        return tServiceCDCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceConstructedAttribute createTServiceConstructedAttribute() {
        TServiceConstructedAttributeImpl tServiceConstructedAttribute = new TServiceConstructedAttributeImpl();
        return tServiceConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceConstructedAttributes createTServiceConstructedAttributes() {
        TServiceConstructedAttributesImpl tServiceConstructedAttributes = new TServiceConstructedAttributesImpl();
        return tServiceConstructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceDataAttribute createTServiceDataAttribute() {
        TServiceDataAttributeImpl tServiceDataAttribute = new TServiceDataAttributeImpl();
        return tServiceDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceNS createTServiceNS() {
        TServiceNSImpl tServiceNS = new TServiceNSImpl();
        return tServiceNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceNsUsage createTServiceNsUsage() {
        TServiceNsUsageImpl tServiceNsUsage = new TServiceNsUsageImpl();
        return tServiceNsUsage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceParameter createTServiceParameter() {
        TServiceParameterImpl tServiceParameter = new TServiceParameterImpl();
        return tServiceParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceTypeRealization createTServiceTypeRealization() {
        TServiceTypeRealizationImpl tServiceTypeRealization = new TServiceTypeRealizationImpl();
        return tServiceTypeRealization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TServiceTypeRealizations createTServiceTypeRealizations() {
        TServiceTypeRealizationsImpl tServiceTypeRealizations = new TServiceTypeRealizationsImpl();
        return tServiceTypeRealizations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TSubDataAttribute createTSubDataAttribute() {
        TSubDataAttributeImpl tSubDataAttribute = new TSubDataAttributeImpl();
        return tSubDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TSubDataObject createTSubDataObject() {
        TSubDataObjectImpl tSubDataObject = new TSubDataObjectImpl();
        return tSubDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TTitledClass createTTitledClass() {
        TTitledClassImpl tTitledClass = new TTitledClassImpl();
        return tTitledClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TACSIServicesKind createTACSIServicesKindFromString( EDataType eDataType, String initialValue ) {
        TACSIServicesKind result = TACSIServicesKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTACSIServicesKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCBKind createTCBKindFromString( EDataType eDataType, String initialValue ) {
        TCBKind result = TCBKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTCBKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDefinedAttributeTypeKind createTDefinedAttributeTypeKindFromString( EDataType eDataType,
            String initialValue ) {
        TDefinedAttributeTypeKind result = TDefinedAttributeTypeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTDefinedAttributeTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TLicenseKind createTLicenseKindFromString( EDataType eDataType, String initialValue ) {
        TLicenseKind result = TLicenseKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTLicenseKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPubStage createTPubStageFromString( EDataType eDataType, String initialValue ) {
        TPubStage result = TPubStage.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTPubStageToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TUndefinedAttributeTypeKind createTUndefinedAttributeTypeKindFromString( EDataType eDataType,
            String initialValue ) {
        TUndefinedAttributeTypeKind result = TUndefinedAttributeTypeKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTUndefinedAttributeTypeKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTAbbreviationNameFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTAbbreviationNameToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTAbstractLNClassNameFromString( EDataType eDataType, String initialValue ) {
        return createTIec61850NameFromString( NsdPackage.Literals.TIEC61850_NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTAbstractLNClassNameToString( EDataType eDataType, Object instanceValue ) {
        return convertTIec61850NameToString( NsdPackage.Literals.TIEC61850_NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TACSIServicesKind createTACSIServicesKindObjectFromString( EDataType eDataType, String initialValue ) {
        return createTACSIServicesKindFromString( NsdPackage.Literals.TACSI_SERVICES_KIND, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTACSIServicesKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTACSIServicesKindToString( NsdPackage.Literals.TACSI_SERVICES_KIND, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTAttributeNameFromString( EDataType eDataType, String initialValue ) {
        return createTIec61850NameFromString( NsdPackage.Literals.TIEC61850_NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTAttributeNameToString( EDataType eDataType, Object instanceValue ) {
        return convertTIec61850NameToString( NsdPackage.Literals.TIEC61850_NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumerator createTAttributeTypeKindFromString( EDataType eDataType, String initialValue ) {
        if( initialValue == null ) return null;
        Enumerator result = null;
        RuntimeException exception = null;
        try {
            result = createTDefinedAttributeTypeKindFromString(
                    NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND, initialValue );
            if( result != null && Diagnostician.INSTANCE.validate( eDataType, result, null, null ) ) {
                return result;
            }
        }
        catch( RuntimeException e ) {
            exception = e;
        }
        try {
            result = createTUndefinedAttributeTypeKindFromString(
                    NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND, initialValue );
            if( result != null && Diagnostician.INSTANCE.validate( eDataType, result, null, null ) ) {
                return result;
            }
        }
        catch( RuntimeException e ) {
            exception = e;
        }
        if( result != null || exception == null ) return result;

        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTAttributeTypeKindToString( EDataType eDataType, Object instanceValue ) {
        if( instanceValue == null ) return null;
        if( NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( instanceValue ) ) {
            try {
                String value = convertTDefinedAttributeTypeKindToString(
                        NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND, instanceValue );
                if( value != null ) return value;
            }
            catch( Exception e ) {
                // Keep trying other member types until all have failed.
            }
        }
        if( NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( instanceValue ) ) {
            try {
                String value = convertTUndefinedAttributeTypeKindToString(
                        NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND, instanceValue );
                if( value != null ) return value;
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
    public String createTBasicTypeNameFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.TOKEN, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTBasicTypeNameToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.TOKEN, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCBKind createTCBKindObjectFromString( EDataType eDataType, String initialValue ) {
        return createTCBKindFromString( NsdPackage.Literals.TCB_KIND, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTCBKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTCBKindToString( NsdPackage.Literals.TCB_KIND, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTCDCNameFromString( EDataType eDataType, String initialValue ) {
        return createTIec61850NameFromString( NsdPackage.Literals.TIEC61850_NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTCDCNameToString( EDataType eDataType, Object instanceValue ) {
        return convertTIec61850NameToString( NsdPackage.Literals.TIEC61850_NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTDataObjectNameFromString( EDataType eDataType, String initialValue ) {
        return createTIec61850NameFromString( NsdPackage.Literals.TIEC61850_NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTDataObjectNameToString( EDataType eDataType, Object instanceValue ) {
        return convertTIec61850NameToString( NsdPackage.Literals.TIEC61850_NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDefinedAttributeTypeKind createTDefinedAttributeTypeKindObjectFromString( EDataType eDataType,
            String initialValue ) {
        return createTDefinedAttributeTypeKindFromString( NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTDefinedAttributeTypeKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTDefinedAttributeTypeKindToString( NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND,
                instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTDocIDFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTDocIDToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTEmptyStringFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTEmptyStringToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTFCAbbreviationFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.TOKEN, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTFCAbbreviationToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.TOKEN, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTIec61850NameFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTIec61850NameToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTIec61850NameStringFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTIec61850NameStringToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTissuesTypeFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTissuesTypeToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TLicenseKind createTLicenseKindObjectFromString( EDataType eDataType, String initialValue ) {
        return createTLicenseKindFromString( NsdPackage.Literals.TLICENSE_KIND, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTLicenseKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTLicenseKindToString( NsdPackage.Literals.TLICENSE_KIND, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTLiteralNameFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTLiteralNameToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTLNClassNameFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTLNClassNameToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTNSIdentifierFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTNSIdentifierToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Short createTNSReleaseFromString( EDataType eDataType, String initialValue ) {
        return ( Short ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.UNSIGNED_BYTE,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTNSReleaseToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.UNSIGNED_BYTE, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Short createTNSReleaseObjectFromString( EDataType eDataType, String initialValue ) {
        return createTNSReleaseFromString( NsdPackage.Literals.TNS_RELEASE, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTNSReleaseObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTNSReleaseToString( NsdPackage.Literals.TNS_RELEASE, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTNSRevisionFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.TOKEN, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTNSRevisionToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.TOKEN, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer createTNSVersionFromString( EDataType eDataType, String initialValue ) {
        return ( Integer ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.UNSIGNED_SHORT,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTNSVersionToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.UNSIGNED_SHORT, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer createTNSVersionObjectFromString( EDataType eDataType, String initialValue ) {
        return createTNSVersionFromString( NsdPackage.Literals.TNS_VERSION, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTNSVersionObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTNSVersionToString( NsdPackage.Literals.TNS_VERSION, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTPresenceConditionArgumentFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTPresenceConditionArgumentToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTPresenceConditionNameFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NORMALIZED_STRING,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTPresenceConditionNameToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPubStage createTPubStageObjectFromString( EDataType eDataType, String initialValue ) {
        return createTPubStageFromString( NsdPackage.Literals.TPUB_STAGE, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTPubStageObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTPubStageToString( NsdPackage.Literals.TPUB_STAGE, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTSubDataObjectNameFromString( EDataType eDataType, String initialValue ) {
        return createTIec61850NameFromString( NsdPackage.Literals.TIEC61850_NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTSubDataObjectNameToString( EDataType eDataType, Object instanceValue ) {
        return convertTIec61850NameToString( NsdPackage.Literals.TIEC61850_NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createTUMLVersionFromString( EDataType eDataType, String initialValue ) {
        return ( String ) XMLTypeFactory.eINSTANCE.createFromString( XMLTypePackage.Literals.NAME, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTUMLVersionToString( EDataType eDataType, Object instanceValue ) {
        return XMLTypeFactory.eINSTANCE.convertToString( XMLTypePackage.Literals.NAME, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TUndefinedAttributeTypeKind createTUndefinedAttributeTypeKindObjectFromString( EDataType eDataType,
            String initialValue ) {
        return createTUndefinedAttributeTypeKindFromString( NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND,
                initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTUndefinedAttributeTypeKindObjectToString( EDataType eDataType, Object instanceValue ) {
        return convertTUndefinedAttributeTypeKindToString( NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND,
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
