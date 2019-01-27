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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage
 * @generated
 */
public class NsdValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final NsdValidator INSTANCE = new NsdValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "fr.centralesupelec.edf.riseclipse.iec61850.nsd";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTypeValidator xmlTypeValidator;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NsdValidator() {
        super();
        xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return NsdPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate( int classifierID, Object value, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        switch( classifierID ) {
        case NsdPackage.APPLIES_TO_TYPE:
            return validateAppliesToType( ( AppliesToType ) value, diagnostics, context );
        case NsdPackage.DEPENDS_ON_TYPE:
            return validateDependsOnType( ( DependsOnType ) value, diagnostics, context );
        case NsdPackage.DOCUMENT_ROOT:
            return validateDocumentRoot( ( DocumentRoot ) value, diagnostics, context );
        case NsdPackage.SERVICE_TYPE:
            return validateServiceType( ( ServiceType ) value, diagnostics, context );
        case NsdPackage.TABBREVIATION:
            return validateTAbbreviation( ( TAbbreviation ) value, diagnostics, context );
        case NsdPackage.TABBREVIATIONS:
            return validateTAbbreviations( ( TAbbreviations ) value, diagnostics, context );
        case NsdPackage.TABSTRACT_LN_CLASS:
            return validateTAbstractLNClass( ( TAbstractLNClass ) value, diagnostics, context );
        case NsdPackage.TANY_LN_CLASS:
            return validateTAnyLNClass( ( TAnyLNClass ) value, diagnostics, context );
        case NsdPackage.TAPPLICABLE_SERVICE_NS:
            return validateTApplicableServiceNS( ( TApplicableServiceNS ) value, diagnostics, context );
        case NsdPackage.TAPPLICABLE_SERVICES:
            return validateTApplicableServices( ( TApplicableServices ) value, diagnostics, context );
        case NsdPackage.TBASIC_TYPE:
            return validateTBasicType( ( TBasicType ) value, diagnostics, context );
        case NsdPackage.TBASIC_TYPES:
            return validateTBasicTypes( ( TBasicTypes ) value, diagnostics, context );
        case NsdPackage.TCDC:
            return validateTCDC( ( TCDC ) value, diagnostics, context );
        case NsdPackage.TCD_CS:
            return validateTCDCs( ( TCDCs ) value, diagnostics, context );
        case NsdPackage.TCHANGES:
            return validateTChanges( ( TChanges ) value, diagnostics, context );
        case NsdPackage.TCONSTRUCTED_ATTRIBUTE:
            return validateTConstructedAttribute( ( TConstructedAttribute ) value, diagnostics, context );
        case NsdPackage.TCONSTRUCTED_ATTRIBUTES:
            return validateTConstructedAttributes( ( TConstructedAttributes ) value, diagnostics, context );
        case NsdPackage.TCOPYRIGHTED:
            return validateTCopyrighted( ( TCopyrighted ) value, diagnostics, context );
        case NsdPackage.TCOPYRIGHT_NOTICE:
            return validateTCopyrightNotice( ( TCopyrightNotice ) value, diagnostics, context );
        case NsdPackage.TDATA_ATTRIBUTE:
            return validateTDataAttribute( ( TDataAttribute ) value, diagnostics, context );
        case NsdPackage.TDATA_OBJECT:
            return validateTDataObject( ( TDataObject ) value, diagnostics, context );
        case NsdPackage.TDATA_SET_MEMBER_OF:
            return validateTDataSetMemberOf( ( TDataSetMemberOf ) value, diagnostics, context );
        case NsdPackage.TDOC:
            return validateTDoc( ( TDoc ) value, diagnostics, context );
        case NsdPackage.TDOCUMENTED_CLASS:
            return validateTDocumentedClass( ( TDocumentedClass ) value, diagnostics, context );
        case NsdPackage.TENUMERATION:
            return validateTEnumeration( ( TEnumeration ) value, diagnostics, context );
        case NsdPackage.TENUMERATIONS:
            return validateTEnumerations( ( TEnumerations ) value, diagnostics, context );
        case NsdPackage.TFUNCTIONAL_CONSTRAINT:
            return validateTFunctionalConstraint( ( TFunctionalConstraint ) value, diagnostics, context );
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS:
            return validateTFunctionalConstraints( ( TFunctionalConstraints ) value, diagnostics, context );
        case NsdPackage.TLICENSE:
            return validateTLicense( ( TLicense ) value, diagnostics, context );
        case NsdPackage.TLITERAL:
            return validateTLiteral( ( TLiteral ) value, diagnostics, context );
        case NsdPackage.TLN_CLASS:
            return validateTLNClass( ( TLNClass ) value, diagnostics, context );
        case NsdPackage.TLN_CLASSES:
            return validateTLNClasses( ( TLNClasses ) value, diagnostics, context );
        case NsdPackage.TNOTICE:
            return validateTNotice( ( TNotice ) value, diagnostics, context );
        case NsdPackage.TNS:
            return validateTNS( ( TNS ) value, diagnostics, context );
        case NsdPackage.TNS_DOC:
            return validateTNSDoc( ( TNSDoc ) value, diagnostics, context );
        case NsdPackage.TPRESENCE_CONDITION:
            return validateTPresenceCondition( ( TPresenceCondition ) value, diagnostics, context );
        case NsdPackage.TPRESENCE_CONDITIONS:
            return validateTPresenceConditions( ( TPresenceConditions ) value, diagnostics, context );
        case NsdPackage.TSERVICE_CDC:
            return validateTServiceCDC( ( TServiceCDC ) value, diagnostics, context );
        case NsdPackage.TSERVICE_CD_CS:
            return validateTServiceCDCs( ( TServiceCDCs ) value, diagnostics, context );
        case NsdPackage.TSERVICE_CONSTRUCTED_ATTRIBUTE:
            return validateTServiceConstructedAttribute( ( TServiceConstructedAttribute ) value, diagnostics, context );
        case NsdPackage.TSERVICE_CONSTRUCTED_ATTRIBUTES:
            return validateTServiceConstructedAttributes( ( TServiceConstructedAttributes ) value, diagnostics,
                    context );
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE:
            return validateTServiceDataAttribute( ( TServiceDataAttribute ) value, diagnostics, context );
        case NsdPackage.TSERVICE_NS:
            return validateTServiceNS( ( TServiceNS ) value, diagnostics, context );
        case NsdPackage.TSERVICE_NS_USAGE:
            return validateTServiceNsUsage( ( TServiceNsUsage ) value, diagnostics, context );
        case NsdPackage.TSERVICE_PARAMETER:
            return validateTServiceParameter( ( TServiceParameter ) value, diagnostics, context );
        case NsdPackage.TSERVICE_TYPE_REALIZATION:
            return validateTServiceTypeRealization( ( TServiceTypeRealization ) value, diagnostics, context );
        case NsdPackage.TSERVICE_TYPE_REALIZATIONS:
            return validateTServiceTypeRealizations( ( TServiceTypeRealizations ) value, diagnostics, context );
        case NsdPackage.TSUB_DATA_ATTRIBUTE:
            return validateTSubDataAttribute( ( TSubDataAttribute ) value, diagnostics, context );
        case NsdPackage.TSUB_DATA_OBJECT:
            return validateTSubDataObject( ( TSubDataObject ) value, diagnostics, context );
        case NsdPackage.TTITLED_CLASS:
            return validateTTitledClass( ( TTitledClass ) value, diagnostics, context );
        case NsdPackage.TACSI_SERVICES_KIND:
            return validateTACSIServicesKind( ( TACSIServicesKind ) value, diagnostics, context );
        case NsdPackage.TCB_KIND:
            return validateTCBKind( ( TCBKind ) value, diagnostics, context );
        case NsdPackage.TDEFINED_ATTRIBUTE_TYPE_KIND:
            return validateTDefinedAttributeTypeKind( ( TDefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.TLICENSE_KIND:
            return validateTLicenseKind( ( TLicenseKind ) value, diagnostics, context );
        case NsdPackage.TPUB_STAGE:
            return validateTPubStage( ( TPubStage ) value, diagnostics, context );
        case NsdPackage.TUNDEFINED_ATTRIBUTE_TYPE_KIND:
            return validateTUndefinedAttributeTypeKind( ( TUndefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.TABBREVIATION_NAME:
            return validateTAbbreviationName( ( String ) value, diagnostics, context );
        case NsdPackage.TABSTRACT_LN_CLASS_NAME:
            return validateTAbstractLNClassName( ( String ) value, diagnostics, context );
        case NsdPackage.TACSI_SERVICES_KIND_OBJECT:
            return validateTACSIServicesKindObject( ( TACSIServicesKind ) value, diagnostics, context );
        case NsdPackage.TATTRIBUTE_NAME:
            return validateTAttributeName( ( String ) value, diagnostics, context );
        case NsdPackage.TATTRIBUTE_TYPE_KIND:
            return validateTAttributeTypeKind( ( Enumerator ) value, diagnostics, context );
        case NsdPackage.TBASIC_TYPE_NAME:
            return validateTBasicTypeName( ( String ) value, diagnostics, context );
        case NsdPackage.TCB_KIND_OBJECT:
            return validateTCBKindObject( ( TCBKind ) value, diagnostics, context );
        case NsdPackage.TCDC_NAME:
            return validateTCDCName( ( String ) value, diagnostics, context );
        case NsdPackage.TDATA_OBJECT_NAME:
            return validateTDataObjectName( ( String ) value, diagnostics, context );
        case NsdPackage.TDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return validateTDefinedAttributeTypeKindObject( ( TDefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.TDOC_ID:
            return validateTDocID( ( String ) value, diagnostics, context );
        case NsdPackage.TEMPTY_STRING:
            return validateTEmptyString( ( String ) value, diagnostics, context );
        case NsdPackage.TFC_ABBREVIATION:
            return validateTFCAbbreviation( ( String ) value, diagnostics, context );
        case NsdPackage.TIEC61850_NAME:
            return validateTIec61850Name( ( String ) value, diagnostics, context );
        case NsdPackage.TIEC61850_NAME_STRING:
            return validateTIec61850NameString( ( String ) value, diagnostics, context );
        case NsdPackage.TISSUES_TYPE:
            return validateTissuesType( ( String ) value, diagnostics, context );
        case NsdPackage.TLICENSE_KIND_OBJECT:
            return validateTLicenseKindObject( ( TLicenseKind ) value, diagnostics, context );
        case NsdPackage.TLITERAL_NAME:
            return validateTLiteralName( ( String ) value, diagnostics, context );
        case NsdPackage.TLN_CLASS_NAME:
            return validateTLNClassName( ( String ) value, diagnostics, context );
        case NsdPackage.TNS_IDENTIFIER:
            return validateTNSIdentifier( ( String ) value, diagnostics, context );
        case NsdPackage.TNS_RELEASE:
            return validateTNSRelease( ( Short ) value, diagnostics, context );
        case NsdPackage.TNS_RELEASE_OBJECT:
            return validateTNSReleaseObject( ( Short ) value, diagnostics, context );
        case NsdPackage.TNS_REVISION:
            return validateTNSRevision( ( String ) value, diagnostics, context );
        case NsdPackage.TNS_VERSION:
            return validateTNSVersion( ( Integer ) value, diagnostics, context );
        case NsdPackage.TNS_VERSION_OBJECT:
            return validateTNSVersionObject( ( Integer ) value, diagnostics, context );
        case NsdPackage.TPRESENCE_CONDITION_ARGUMENT:
            return validateTPresenceConditionArgument( ( String ) value, diagnostics, context );
        case NsdPackage.TPRESENCE_CONDITION_NAME:
            return validateTPresenceConditionName( ( String ) value, diagnostics, context );
        case NsdPackage.TPUB_STAGE_OBJECT:
            return validateTPubStageObject( ( TPubStage ) value, diagnostics, context );
        case NsdPackage.TSUB_DATA_OBJECT_NAME:
            return validateTSubDataObjectName( ( String ) value, diagnostics, context );
        case NsdPackage.TUML_VERSION:
            return validateTUMLVersion( ( String ) value, diagnostics, context );
        case NsdPackage.TUNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return validateTUndefinedAttributeTypeKindObject( ( TUndefinedAttributeTypeKind ) value, diagnostics,
                    context );
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAppliesToType( AppliesToType appliesToType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( appliesToType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDependsOnType( DependsOnType dependsOnType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( dependsOnType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentRoot( DocumentRoot documentRoot, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( documentRoot, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceType( ServiceType serviceType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAbbreviation( TAbbreviation tAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tAbbreviation, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAbbreviations( TAbbreviations tAbbreviations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tAbbreviations, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAbstractLNClass( TAbstractLNClass tAbstractLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tAbstractLNClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAnyLNClass( TAnyLNClass tAnyLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tAnyLNClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTApplicableServiceNS( TApplicableServiceNS tApplicableServiceNS, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tApplicableServiceNS, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTApplicableServices( TApplicableServices tApplicableServices, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tApplicableServices, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTBasicType( TBasicType tBasicType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tBasicType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTBasicTypes( TBasicTypes tBasicTypes, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tBasicTypes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCDC( TCDC tcdc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tcdc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCDCs( TCDCs tcdCs, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tcdCs, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTChanges( TChanges tChanges, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tChanges, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTConstructedAttribute( TConstructedAttribute tConstructedAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tConstructedAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTConstructedAttributes( TConstructedAttributes tConstructedAttributes,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tConstructedAttributes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCopyrighted( TCopyrighted tCopyrighted, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tCopyrighted, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCopyrightNotice( TCopyrightNotice tCopyrightNotice, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tCopyrightNotice, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDataAttribute( TDataAttribute tDataAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tDataAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDataObject( TDataObject tDataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tDataObject, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDataSetMemberOf( TDataSetMemberOf tDataSetMemberOf, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tDataSetMemberOf, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDoc( TDoc tDoc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tDoc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDocumentedClass( TDocumentedClass tDocumentedClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tDocumentedClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTEnumeration( TEnumeration tEnumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tEnumeration, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTEnumerations( TEnumerations tEnumerations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tEnumerations, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTFunctionalConstraint( TFunctionalConstraint tFunctionalConstraint,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tFunctionalConstraint, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTFunctionalConstraints( TFunctionalConstraints tFunctionalConstraints,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tFunctionalConstraints, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLicense( TLicense tLicense, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tLicense, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLiteral( TLiteral tLiteral, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tLiteral, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLNClass( TLNClass tlnClass, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tlnClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLNClasses( TLNClasses tlnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tlnClasses, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNotice( TNotice tNotice, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tNotice, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNS( TNS tns, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tns, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSDoc( TNSDoc tnsDoc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tnsDoc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTPresenceCondition( TPresenceCondition tPresenceCondition, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tPresenceCondition, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTPresenceConditions( TPresenceConditions tPresenceConditions, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tPresenceConditions, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceCDC( TServiceCDC tServiceCDC, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceCDC, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceCDCs( TServiceCDCs tServiceCDCs, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceCDCs, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceConstructedAttribute( TServiceConstructedAttribute tServiceConstructedAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceConstructedAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceConstructedAttributes( TServiceConstructedAttributes tServiceConstructedAttributes,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceConstructedAttributes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceDataAttribute( TServiceDataAttribute tServiceDataAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceDataAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceNS( TServiceNS tServiceNS, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceNS, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceNsUsage( TServiceNsUsage tServiceNsUsage, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceNsUsage, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceParameter( TServiceParameter tServiceParameter, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceParameter, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceTypeRealization( TServiceTypeRealization tServiceTypeRealization,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceTypeRealization, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTServiceTypeRealizations( TServiceTypeRealizations tServiceTypeRealizations,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tServiceTypeRealizations, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTSubDataAttribute( TSubDataAttribute tSubDataAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tSubDataAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTSubDataObject( TSubDataObject tSubDataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tSubDataObject, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTTitledClass( TTitledClass tTitledClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( tTitledClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTACSIServicesKind( TACSIServicesKind tacsiServicesKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCBKind( TCBKind tcbKind, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDefinedAttributeTypeKind( TDefinedAttributeTypeKind tDefinedAttributeTypeKind,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLicenseKind( TLicenseKind tLicenseKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTPubStage( TPubStage tPubStage, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTUndefinedAttributeTypeKind( TUndefinedAttributeTypeKind tUndefinedAttributeTypeKind,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAbbreviationName( String tAbbreviationName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAbstractLNClassName( String tAbstractLNClassName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTIec61850Name_Pattern( tAbstractLNClassName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTIec61850Name_MinLength( tAbstractLNClassName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTACSIServicesKindObject( TACSIServicesKind tacsiServicesKindObject,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAttributeName( String tAttributeName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTIec61850Name_Pattern( tAttributeName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTIec61850Name_MinLength( tAttributeName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAttributeTypeKind( Enumerator tAttributeTypeKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTAttributeTypeKind_MemberTypes( tAttributeTypeKind, diagnostics, context );
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>TAttribute Type Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTAttributeTypeKind_MemberTypes( Enumerator tAttributeTypeKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( diagnostics != null ) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if( NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( tAttributeTypeKind ) ) {
                if( validateTDefinedAttributeTypeKind( ( TDefinedAttributeTypeKind ) tAttributeTypeKind,
                        tempDiagnostics, context ) )
                    return true;
            }
            if( NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( tAttributeTypeKind ) ) {
                if( validateTUndefinedAttributeTypeKind( ( TUndefinedAttributeTypeKind ) tAttributeTypeKind,
                        tempDiagnostics, context ) )
                    return true;
            }
            for( Diagnostic diagnostic : tempDiagnostics.getChildren() ) {
                diagnostics.add( diagnostic );
            }
        }
        else {
            if( NsdPackage.Literals.TDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( tAttributeTypeKind ) ) {
                if( validateTDefinedAttributeTypeKind( ( TDefinedAttributeTypeKind ) tAttributeTypeKind, null,
                        context ) )
                    return true;
            }
            if( NsdPackage.Literals.TUNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( tAttributeTypeKind ) ) {
                if( validateTUndefinedAttributeTypeKind( ( TUndefinedAttributeTypeKind ) tAttributeTypeKind, null,
                        context ) )
                    return true;
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTBasicTypeName( String tBasicTypeName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTBasicTypeName_MinLength( tBasicTypeName, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>TBasic Type Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTBasicTypeName_MinLength( String tBasicTypeName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tBasicTypeName.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null ) reportMinLengthViolation( NsdPackage.Literals.TBASIC_TYPE_NAME,
                tBasicTypeName, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCBKindObject( TCBKind tcbKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCDCName( String tcdcName, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateTIec61850Name_Pattern( tcdcName, diagnostics, context );
        if( result || diagnostics != null ) result &= validateTCDCName_MinLength( tcdcName, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>TCDC Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTCDCName_MinLength( String tcdcName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tcdcName.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.TCDC_NAME, tcdcName, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDataObjectName( String tDataObjectName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTIec61850Name_Pattern( tDataObjectName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTIec61850Name_MinLength( tDataObjectName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTDataObjectName_MaxLength( tDataObjectName, diagnostics, context );
        return result;
    }

    /**
     * Validates the MaxLength constraint of '<em>TData Object Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDataObjectName_MaxLength( String tDataObjectName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tDataObjectName.length();
        boolean result = length <= 12;
        if( !result && diagnostics != null ) reportMaxLengthViolation( NsdPackage.Literals.TDATA_OBJECT_NAME,
                tDataObjectName, length, 12, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDefinedAttributeTypeKindObject( TDefinedAttributeTypeKind tDefinedAttributeTypeKindObject,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDocID( String tDocID, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateTDocID_MinLength( tDocID, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>TDoc ID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTDocID_MinLength( String tDocID, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tDocID.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.TDOC_ID, tDocID, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTEmptyString( String tEmptyString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTEmptyString_MaxLength( tEmptyString, diagnostics, context );
        return result;
    }

    /**
     * Validates the MaxLength constraint of '<em>TEmpty String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTEmptyString_MaxLength( String tEmptyString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tEmptyString.length();
        boolean result = length <= 0;
        if( !result && diagnostics != null ) reportMaxLengthViolation( NsdPackage.Literals.TEMPTY_STRING, tEmptyString,
                length, 0, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTFCAbbreviation( String tfcAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTFCAbbreviation_Pattern( tfcAbbreviation, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTFCAbbreviation_MinLength( tfcAbbreviation, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTFCAbbreviation_Pattern
     */
    public static final PatternMatcher[][] TFC_ABBREVIATION__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}]+" ) } };

    /**
     * Validates the Pattern constraint of '<em>TFC Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTFCAbbreviation_Pattern( String tfcAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TFC_ABBREVIATION, tfcAbbreviation,
                TFC_ABBREVIATION__PATTERN__VALUES, diagnostics, context );
    }

    /**
     * Validates the MinLength constraint of '<em>TFC Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTFCAbbreviation_MinLength( String tfcAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tfcAbbreviation.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null ) reportMinLengthViolation( NsdPackage.Literals.TFC_ABBREVIATION,
                tfcAbbreviation, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTIec61850Name( String tIec61850Name, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTIec61850Name_Pattern( tIec61850Name, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTIec61850Name_MinLength( tIec61850Name, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTIec61850Name_Pattern
     */
    public static final PatternMatcher[][] TIEC61850_NAME__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" ) },
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "\\i\\c*" ) } };

    /**
     * Validates the Pattern constraint of '<em>TIec61850 Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTIec61850Name_Pattern( String tIec61850Name, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TIEC61850_NAME, tIec61850Name, TIEC61850_NAME__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * Validates the MinLength constraint of '<em>TIec61850 Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTIec61850Name_MinLength( String tIec61850Name, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tIec61850Name.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null ) reportMinLengthViolation( NsdPackage.Literals.TIEC61850_NAME,
                tIec61850Name, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTIec61850NameString( String tIec61850NameString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTIec61850NameString_Pattern( tIec61850NameString, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTIec61850NameString_Pattern
     */
    public static final PatternMatcher[][] TIEC61850_NAME_STRING__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] {
                    XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" ) } };

    /**
     * Validates the Pattern constraint of '<em>TIec61850 Name String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTIec61850NameString_Pattern( String tIec61850NameString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TIEC61850_NAME_STRING, tIec61850NameString,
                TIEC61850_NAME_STRING__PATTERN__VALUES, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTissuesType( String tissuesType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTissuesType_MinLength( tissuesType, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>Tissues Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTissuesType_MinLength( String tissuesType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tissuesType.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.TISSUES_TYPE, tissuesType, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLicenseKindObject( TLicenseKind tLicenseKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLiteralName( String tLiteralName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTLiteralName_Pattern( tLiteralName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTLiteralName_MaxLength( tLiteralName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTLiteralName_Pattern
     */
    public static final PatternMatcher[][] TLITERAL_NAME__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] {
                    XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]*" ) } };

    /**
     * Validates the Pattern constraint of '<em>TLiteral Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLiteralName_Pattern( String tLiteralName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TLITERAL_NAME, tLiteralName, TLITERAL_NAME__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * Validates the MaxLength constraint of '<em>TLiteral Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLiteralName_MaxLength( String tLiteralName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tLiteralName.length();
        boolean result = length <= 127;
        if( !result && diagnostics != null ) reportMaxLengthViolation( NsdPackage.Literals.TLITERAL_NAME, tLiteralName,
                length, 127, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLNClassName( String tlnClassName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTLNClassName_Pattern( tlnClassName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTLNClassName_Pattern
     */
    public static final PatternMatcher[][] TLN_CLASS_NAME__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "LLN0" ),
                    XMLTypeUtil.createPatternMatcher( "[A-Z]{4}" ) },
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "\\i\\c*" ) } };

    /**
     * Validates the Pattern constraint of '<em>TLN Class Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTLNClassName_Pattern( String tlnClassName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TLN_CLASS_NAME, tlnClassName, TLN_CLASS_NAME__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSIdentifier( String tnsIdentifier, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTNSIdentifier_Pattern( tnsIdentifier, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTNSIdentifier_Pattern
     */
    public static final PatternMatcher[][] TNS_IDENTIFIER__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "\\p{IsBasicLatin}+" ) } };

    /**
     * Validates the Pattern constraint of '<em>TNS Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSIdentifier_Pattern( String tnsIdentifier, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TNS_IDENTIFIER, tnsIdentifier, TNS_IDENTIFIER__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSRelease( short tnsRelease, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateTNSRelease_Min( tnsRelease, diagnostics, context );
        if( result || diagnostics != null )
            result &= xmlTypeValidator.validateUnsignedByte_Max( tnsRelease, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTNSRelease_Min
     */
    public static final short TNS_RELEASE__MIN__VALUE = 0;

    /**
     * Validates the Min constraint of '<em>TNS Release</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSRelease_Min( short tnsRelease, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = tnsRelease > TNS_RELEASE__MIN__VALUE;
        if( !result && diagnostics != null ) reportMinViolation( NsdPackage.Literals.TNS_RELEASE, tnsRelease,
                TNS_RELEASE__MIN__VALUE, false, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSReleaseObject( Short tnsReleaseObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTNSRelease_Min( tnsReleaseObject, diagnostics, context );
        if( result || diagnostics != null )
            result &= xmlTypeValidator.validateUnsignedByte_Max( tnsReleaseObject, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSRevision( String tnsRevision, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTNSRevision_Pattern( tnsRevision, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTNSRevision_Pattern
     */
    public static final PatternMatcher[][] TNS_REVISION__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "[A-Z]" ) } };

    /**
     * Validates the Pattern constraint of '<em>TNS Revision</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSRevision_Pattern( String tnsRevision, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.TNS_REVISION, tnsRevision, TNS_REVISION__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSVersion( int tnsVersion, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateTNSVersion_Min( tnsVersion, diagnostics, context );
        if( result || diagnostics != null ) result &= validateTNSVersion_Max( tnsVersion, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTNSVersion_Min
     */
    public static final int TNS_VERSION__MIN__VALUE = 2002;

    /**
     * Validates the Min constraint of '<em>TNS Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSVersion_Min( int tnsVersion, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = tnsVersion >= TNS_VERSION__MIN__VALUE;
        if( !result && diagnostics != null ) reportMinViolation( NsdPackage.Literals.TNS_VERSION, tnsVersion,
                TNS_VERSION__MIN__VALUE, true, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateTNSVersion_Max
     */
    public static final int TNS_VERSION__MAX__VALUE = 2099;

    /**
     * Validates the Max constraint of '<em>TNS Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSVersion_Max( int tnsVersion, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = tnsVersion <= TNS_VERSION__MAX__VALUE;
        if( !result && diagnostics != null ) reportMaxViolation( NsdPackage.Literals.TNS_VERSION, tnsVersion,
                TNS_VERSION__MAX__VALUE, true, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTNSVersionObject( Integer tnsVersionObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTNSVersion_Min( tnsVersionObject, diagnostics, context );
        if( result || diagnostics != null ) result &= validateTNSVersion_Max( tnsVersionObject, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTPresenceConditionArgument( String tPresenceConditionArgument, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTPresenceConditionName( String tPresenceConditionName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTPubStageObject( TPubStage tPubStageObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTSubDataObjectName( String tSubDataObjectName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateTIec61850Name_Pattern( tSubDataObjectName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTIec61850Name_MinLength( tSubDataObjectName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTUMLVersion( String tumlVersion, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = xmlTypeValidator.validateName_Pattern( tumlVersion, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateTUMLVersion_MinLength( tumlVersion, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>TUML Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTUMLVersion_MinLength( String tumlVersion, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = tumlVersion.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.TUML_VERSION, tumlVersion, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTUndefinedAttributeTypeKindObject(
            TUndefinedAttributeTypeKind tUndefinedAttributeTypeKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //NsdValidator
