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
        case NsdPackage.ABBREVIATION:
            return validateAbbreviation( ( Abbreviation ) value, diagnostics, context );
        case NsdPackage.ABBREVIATIONS:
            return validateAbbreviations( ( Abbreviations ) value, diagnostics, context );
        case NsdPackage.ABSTRACT_LN_CLASS:
            return validateAbstractLNClass( ( AbstractLNClass ) value, diagnostics, context );
        case NsdPackage.ANY_LN_CLASS:
            return validateAnyLNClass( ( AnyLNClass ) value, diagnostics, context );
        case NsdPackage.APPLICABLE_SERVICE_NS:
            return validateApplicableServiceNS( ( ApplicableServiceNS ) value, diagnostics, context );
        case NsdPackage.APPLICABLE_SERVICES:
            return validateApplicableServices( ( ApplicableServices ) value, diagnostics, context );
        case NsdPackage.BASIC_TYPE:
            return validateBasicType( ( BasicType ) value, diagnostics, context );
        case NsdPackage.BASIC_TYPES:
            return validateBasicTypes( ( BasicTypes ) value, diagnostics, context );
        case NsdPackage.CDC:
            return validateCDC( ( CDC ) value, diagnostics, context );
        case NsdPackage.CD_CS:
            return validateCDCs( ( CDCs ) value, diagnostics, context );
        case NsdPackage.CHANGES:
            return validateChanges( ( Changes ) value, diagnostics, context );
        case NsdPackage.CONSTRUCTED_ATTRIBUTE:
            return validateConstructedAttribute( ( ConstructedAttribute ) value, diagnostics, context );
        case NsdPackage.CONSTRUCTED_ATTRIBUTES:
            return validateConstructedAttributes( ( ConstructedAttributes ) value, diagnostics, context );
        case NsdPackage.COPYRIGHTED:
            return validateCopyrighted( ( Copyrighted ) value, diagnostics, context );
        case NsdPackage.COPYRIGHT_NOTICE:
            return validateCopyrightNotice( ( CopyrightNotice ) value, diagnostics, context );
        case NsdPackage.DATA_ATTRIBUTE:
            return validateDataAttribute( ( DataAttribute ) value, diagnostics, context );
        case NsdPackage.DATA_OBJECT:
            return validateDataObject( ( DataObject ) value, diagnostics, context );
        case NsdPackage.DATA_SET_MEMBER_OF:
            return validateDataSetMemberOf( ( DataSetMemberOf ) value, diagnostics, context );
        case NsdPackage.DOC:
            return validateDoc( ( Doc ) value, diagnostics, context );
        case NsdPackage.DOCUMENTED_CLASS:
            return validateDocumentedClass( ( DocumentedClass ) value, diagnostics, context );
        case NsdPackage.ENUMERATION:
            return validateEnumeration( ( Enumeration ) value, diagnostics, context );
        case NsdPackage.ENUMERATIONS:
            return validateEnumerations( ( Enumerations ) value, diagnostics, context );
        case NsdPackage.FUNCTIONAL_CONSTRAINT:
            return validateFunctionalConstraint( ( FunctionalConstraint ) value, diagnostics, context );
        case NsdPackage.FUNCTIONAL_CONSTRAINTS:
            return validateFunctionalConstraints( ( FunctionalConstraints ) value, diagnostics, context );
        case NsdPackage.LICENSE:
            return validateLicense( ( License ) value, diagnostics, context );
        case NsdPackage.LITERAL:
            return validateLiteral( ( Literal ) value, diagnostics, context );
        case NsdPackage.LN_CLASS:
            return validateLNClass( ( LNClass ) value, diagnostics, context );
        case NsdPackage.LN_CLASSES:
            return validateLNClasses( ( LNClasses ) value, diagnostics, context );
        case NsdPackage.NOTICE:
            return validateNotice( ( Notice ) value, diagnostics, context );
        case NsdPackage.NS:
            return validateNS( ( NS ) value, diagnostics, context );
        case NsdPackage.NS_DOC:
            return validateNSDoc( ( NSDoc ) value, diagnostics, context );
        case NsdPackage.PRESENCE_CONDITION:
            return validatePresenceCondition( ( PresenceCondition ) value, diagnostics, context );
        case NsdPackage.PRESENCE_CONDITIONS:
            return validatePresenceConditions( ( PresenceConditions ) value, diagnostics, context );
        case NsdPackage.SERVICE_CDC:
            return validateServiceCDC( ( ServiceCDC ) value, diagnostics, context );
        case NsdPackage.SERVICE_CD_CS:
            return validateServiceCDCs( ( ServiceCDCs ) value, diagnostics, context );
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE:
            return validateServiceConstructedAttribute( ( ServiceConstructedAttribute ) value, diagnostics, context );
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES:
            return validateServiceConstructedAttributes( ( ServiceConstructedAttributes ) value, diagnostics, context );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE:
            return validateServiceDataAttribute( ( ServiceDataAttribute ) value, diagnostics, context );
        case NsdPackage.SERVICE_NS:
            return validateServiceNS( ( ServiceNS ) value, diagnostics, context );
        case NsdPackage.SERVICE_NS_USAGE:
            return validateServiceNsUsage( ( ServiceNsUsage ) value, diagnostics, context );
        case NsdPackage.SERVICE_PARAMETER:
            return validateServiceParameter( ( ServiceParameter ) value, diagnostics, context );
        case NsdPackage.SERVICE_TYPE_REALIZATION:
            return validateServiceTypeRealization( ( ServiceTypeRealization ) value, diagnostics, context );
        case NsdPackage.SERVICE_TYPE_REALIZATIONS:
            return validateServiceTypeRealizations( ( ServiceTypeRealizations ) value, diagnostics, context );
        case NsdPackage.SUB_DATA_ATTRIBUTE:
            return validateSubDataAttribute( ( SubDataAttribute ) value, diagnostics, context );
        case NsdPackage.SUB_DATA_OBJECT:
            return validateSubDataObject( ( SubDataObject ) value, diagnostics, context );
        case NsdPackage.TITLED_CLASS:
            return validateTitledClass( ( TitledClass ) value, diagnostics, context );
        case NsdPackage.ACSI_SERVICES_KIND:
            return validateACSIServicesKind( ( ACSIServicesKind ) value, diagnostics, context );
        case NsdPackage.CB_KIND:
            return validateCBKind( ( CBKind ) value, diagnostics, context );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND:
            return validateDefinedAttributeTypeKind( ( DefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.LICENSE_KIND:
            return validateLicenseKind( ( LicenseKind ) value, diagnostics, context );
        case NsdPackage.PUB_STAGE:
            return validatePubStage( ( PubStage ) value, diagnostics, context );
        case NsdPackage.UNDEFINED_ATTRIBUTE_TYPE_KIND:
            return validateUndefinedAttributeTypeKind( ( UndefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.ABBREVIATION_NAME:
            return validateAbbreviationName( ( String ) value, diagnostics, context );
        case NsdPackage.ABSTRACT_LN_CLASS_NAME:
            return validateAbstractLNClassName( ( String ) value, diagnostics, context );
        case NsdPackage.ACSI_SERVICES_KIND_OBJECT:
            return validateACSIServicesKindObject( ( ACSIServicesKind ) value, diagnostics, context );
        case NsdPackage.ATTRIBUTE_NAME:
            return validateAttributeName( ( String ) value, diagnostics, context );
        case NsdPackage.ATTRIBUTE_TYPE_KIND:
            return validateAttributeTypeKind( ( Enumerator ) value, diagnostics, context );
        case NsdPackage.BASIC_TYPE_NAME:
            return validateBasicTypeName( ( String ) value, diagnostics, context );
        case NsdPackage.CB_KIND_OBJECT:
            return validateCBKindObject( ( CBKind ) value, diagnostics, context );
        case NsdPackage.CDC_NAME:
            return validateCDCName( ( String ) value, diagnostics, context );
        case NsdPackage.DATA_OBJECT_NAME:
            return validateDataObjectName( ( String ) value, diagnostics, context );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return validateDefinedAttributeTypeKindObject( ( DefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.DOC_ID:
            return validateDocID( ( String ) value, diagnostics, context );
        case NsdPackage.EMPTY_STRING:
            return validateEmptyString( ( String ) value, diagnostics, context );
        case NsdPackage.FC_ABBREVIATION:
            return validateFCAbbreviation( ( String ) value, diagnostics, context );
        case NsdPackage.IEC61850_NAME:
            return validateIec61850Name( ( String ) value, diagnostics, context );
        case NsdPackage.IEC61850_NAME_STRING:
            return validateIec61850NameString( ( String ) value, diagnostics, context );
        case NsdPackage.ISSUES_TYPE:
            return validateissuesType( ( String ) value, diagnostics, context );
        case NsdPackage.LICENSE_KIND_OBJECT:
            return validateLicenseKindObject( ( LicenseKind ) value, diagnostics, context );
        case NsdPackage.LITERAL_NAME:
            return validateLiteralName( ( String ) value, diagnostics, context );
        case NsdPackage.LN_CLASS_NAME:
            return validateLNClassName( ( String ) value, diagnostics, context );
        case NsdPackage.NS_IDENTIFIER:
            return validateNSIdentifier( ( String ) value, diagnostics, context );
        case NsdPackage.NS_RELEASE:
            return validateNSRelease( ( Short ) value, diagnostics, context );
        case NsdPackage.NS_RELEASE_OBJECT:
            return validateNSReleaseObject( ( Short ) value, diagnostics, context );
        case NsdPackage.NS_REVISION:
            return validateNSRevision( ( String ) value, diagnostics, context );
        case NsdPackage.NS_VERSION:
            return validateNSVersion( ( Integer ) value, diagnostics, context );
        case NsdPackage.NS_VERSION_OBJECT:
            return validateNSVersionObject( ( Integer ) value, diagnostics, context );
        case NsdPackage.PRESENCE_CONDITION_ARGUMENT:
            return validatePresenceConditionArgument( ( String ) value, diagnostics, context );
        case NsdPackage.PRESENCE_CONDITION_NAME:
            return validatePresenceConditionName( ( String ) value, diagnostics, context );
        case NsdPackage.PUB_STAGE_OBJECT:
            return validatePubStageObject( ( PubStage ) value, diagnostics, context );
        case NsdPackage.SUB_DATA_OBJECT_NAME:
            return validateSubDataObjectName( ( String ) value, diagnostics, context );
        case NsdPackage.UML_VERSION:
            return validateUMLVersion( ( String ) value, diagnostics, context );
        case NsdPackage.UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return validateUndefinedAttributeTypeKindObject( ( UndefinedAttributeTypeKind ) value, diagnostics,
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
    public boolean validateAbbreviation( Abbreviation abbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( abbreviation, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviations( Abbreviations abbreviations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( abbreviations, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbstractLNClass( AbstractLNClass abstractLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( abstractLNClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAnyLNClass( AnyLNClass anyLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( anyLNClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServiceNS( ApplicableServiceNS applicableServiceNS, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( applicableServiceNS, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServices( ApplicableServices applicableServices, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( applicableServices, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicType( BasicType basicType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( basicType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicTypes( BasicTypes basicTypes, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( basicTypes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDC( CDC cdc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( cdc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCs( CDCs cdCs, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( cdCs, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateChanges( Changes changes, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( changes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttribute( ConstructedAttribute constructedAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( constructedAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttributes( ConstructedAttributes constructedAttributes,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( constructedAttributes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCopyrighted( Copyrighted copyrighted, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( copyrighted, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCopyrightNotice( CopyrightNotice copyrightNotice, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( copyrightNotice, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataAttribute( DataAttribute dataAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( dataAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataObject( DataObject dataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( dataObject, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataSetMemberOf( DataSetMemberOf dataSetMemberOf, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( dataSetMemberOf, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDoc( Doc doc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( doc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentedClass( DocumentedClass documentedClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( documentedClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumeration( Enumeration enumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( enumeration, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumerations( Enumerations enumerations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( enumerations, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraint( FunctionalConstraint functionalConstraint, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( functionalConstraint, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraints( FunctionalConstraints functionalConstraints,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( functionalConstraints, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLicense( License license, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( license, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteral( Literal literal, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( literal, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClass( LNClass lnClass, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( lnClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( lnClasses, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNotice( Notice notice, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( notice, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNS( NS ns, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( ns, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSDoc( NSDoc nsDoc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( nsDoc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceCondition( PresenceCondition presenceCondition, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( presenceCondition, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceConditions( PresenceConditions presenceConditions, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( presenceConditions, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceCDC( ServiceCDC serviceCDC, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceCDC, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceCDCs( ServiceCDCs serviceCDCs, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceCDCs, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceConstructedAttribute( ServiceConstructedAttribute serviceConstructedAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceConstructedAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceConstructedAttributes( ServiceConstructedAttributes serviceConstructedAttributes,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceConstructedAttributes, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceDataAttribute( ServiceDataAttribute serviceDataAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceDataAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceNS( ServiceNS serviceNS, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceNS, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceNsUsage( ServiceNsUsage serviceNsUsage, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceNsUsage, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceParameter( ServiceParameter serviceParameter, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceParameter, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceTypeRealization( ServiceTypeRealization serviceTypeRealization,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceTypeRealization, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceTypeRealizations( ServiceTypeRealizations serviceTypeRealizations,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( serviceTypeRealizations, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataAttribute( SubDataAttribute subDataAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( subDataAttribute, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataObject( SubDataObject subDataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( subDataObject, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTitledClass( TitledClass titledClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( titledClass, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateACSIServicesKind( ACSIServicesKind acsiServicesKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCBKind( CBKind cbKind, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDefinedAttributeTypeKind( DefinedAttributeTypeKind definedAttributeTypeKind,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLicenseKind( LicenseKind licenseKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePubStage( PubStage pubStage, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUndefinedAttributeTypeKind( UndefinedAttributeTypeKind undefinedAttributeTypeKind,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviationName( String abbreviationName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbstractLNClassName( String abstractLNClassName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateIec61850Name_Pattern( abstractLNClassName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateIec61850Name_MinLength( abstractLNClassName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateACSIServicesKindObject( ACSIServicesKind acsiServicesKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAttributeName( String attributeName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateIec61850Name_Pattern( attributeName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateIec61850Name_MinLength( attributeName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAttributeTypeKind( Enumerator attributeTypeKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateAttributeTypeKind_MemberTypes( attributeTypeKind, diagnostics, context );
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Attribute Type Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAttributeTypeKind_MemberTypes( Enumerator attributeTypeKind, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( diagnostics != null ) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateDefinedAttributeTypeKind( ( DefinedAttributeTypeKind ) attributeTypeKind, tempDiagnostics,
                        context ) )
                    return true;
            }
            if( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateUndefinedAttributeTypeKind( ( UndefinedAttributeTypeKind ) attributeTypeKind,
                        tempDiagnostics, context ) )
                    return true;
            }
            for( Diagnostic diagnostic : tempDiagnostics.getChildren() ) {
                diagnostics.add( diagnostic );
            }
        }
        else {
            if( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateDefinedAttributeTypeKind( ( DefinedAttributeTypeKind ) attributeTypeKind, null, context ) )
                    return true;
            }
            if( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateUndefinedAttributeTypeKind( ( UndefinedAttributeTypeKind ) attributeTypeKind, null,
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
    public boolean validateBasicTypeName( String basicTypeName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateBasicTypeName_MinLength( basicTypeName, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>Basic Type Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicTypeName_MinLength( String basicTypeName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = basicTypeName.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null ) reportMinLengthViolation( NsdPackage.Literals.BASIC_TYPE_NAME,
                basicTypeName, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCBKindObject( CBKind cbKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCName( String cdcName, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateIec61850Name_Pattern( cdcName, diagnostics, context );
        if( result || diagnostics != null ) result &= validateCDCName_MinLength( cdcName, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>CDC Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCName_MinLength( String cdcName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = cdcName.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.CDC_NAME, cdcName, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataObjectName( String dataObjectName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateIec61850Name_Pattern( dataObjectName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateIec61850Name_MinLength( dataObjectName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateDataObjectName_MaxLength( dataObjectName, diagnostics, context );
        return result;
    }

    /**
     * Validates the MaxLength constraint of '<em>Data Object Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataObjectName_MaxLength( String dataObjectName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = dataObjectName.length();
        boolean result = length <= 12;
        if( !result && diagnostics != null ) reportMaxLengthViolation( NsdPackage.Literals.DATA_OBJECT_NAME,
                dataObjectName, length, 12, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDefinedAttributeTypeKindObject( DefinedAttributeTypeKind definedAttributeTypeKindObject,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocID( String docID, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateDocID_MinLength( docID, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>Doc ID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocID_MinLength( String docID, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        int length = docID.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.DOC_ID, docID, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEmptyString( String emptyString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateEmptyString_MaxLength( emptyString, diagnostics, context );
        return result;
    }

    /**
     * Validates the MaxLength constraint of '<em>Empty String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEmptyString_MaxLength( String emptyString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = emptyString.length();
        boolean result = length <= 0;
        if( !result && diagnostics != null )
            reportMaxLengthViolation( NsdPackage.Literals.EMPTY_STRING, emptyString, length, 0, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFCAbbreviation( String fcAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateFCAbbreviation_Pattern( fcAbbreviation, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateFCAbbreviation_MinLength( fcAbbreviation, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateFCAbbreviation_Pattern
     */
    public static final PatternMatcher[][] FC_ABBREVIATION__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}]+" ) } };

    /**
     * Validates the Pattern constraint of '<em>FC Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFCAbbreviation_Pattern( String fcAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.FC_ABBREVIATION, fcAbbreviation, FC_ABBREVIATION__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * Validates the MinLength constraint of '<em>FC Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFCAbbreviation_MinLength( String fcAbbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = fcAbbreviation.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null ) reportMinLengthViolation( NsdPackage.Literals.FC_ABBREVIATION,
                fcAbbreviation, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIec61850Name( String iec61850Name, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateIec61850Name_Pattern( iec61850Name, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateIec61850Name_MinLength( iec61850Name, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateIec61850Name_Pattern
     */
    public static final PatternMatcher[][] IEC61850_NAME__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" ) },
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "\\i\\c*" ) } };

    /**
     * Validates the Pattern constraint of '<em>Iec61850 Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIec61850Name_Pattern( String iec61850Name, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.IEC61850_NAME, iec61850Name, IEC61850_NAME__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * Validates the MinLength constraint of '<em>Iec61850 Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIec61850Name_MinLength( String iec61850Name, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = iec61850Name.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null ) reportMinLengthViolation( NsdPackage.Literals.IEC61850_NAME, iec61850Name,
                length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIec61850NameString( String iec61850NameString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateIec61850NameString_Pattern( iec61850NameString, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateIec61850NameString_Pattern
     */
    public static final PatternMatcher[][] IEC61850_NAME_STRING__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] {
                    XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" ) } };

    /**
     * Validates the Pattern constraint of '<em>Iec61850 Name String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIec61850NameString_Pattern( String iec61850NameString, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.IEC61850_NAME_STRING, iec61850NameString,
                IEC61850_NAME_STRING__PATTERN__VALUES, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateissuesType( String issuesType, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateissuesType_MinLength( issuesType, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>issues Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateissuesType_MinLength( String issuesType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = issuesType.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.ISSUES_TYPE, issuesType, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLicenseKindObject( LicenseKind licenseKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteralName( String literalName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateLiteralName_Pattern( literalName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateLiteralName_MaxLength( literalName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateLiteralName_Pattern
     */
    public static final PatternMatcher[][] LITERAL_NAME__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] {
                    XMLTypeUtil.createPatternMatcher( "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]*" ) } };

    /**
     * Validates the Pattern constraint of '<em>Literal Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteralName_Pattern( String literalName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.LITERAL_NAME, literalName, LITERAL_NAME__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * Validates the MaxLength constraint of '<em>Literal Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteralName_MaxLength( String literalName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = literalName.length();
        boolean result = length <= 127;
        if( !result && diagnostics != null ) reportMaxLengthViolation( NsdPackage.Literals.LITERAL_NAME, literalName,
                length, 127, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClassName( String lnClassName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateLNClassName_Pattern( lnClassName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateLNClassName_Pattern
     */
    public static final PatternMatcher[][] LN_CLASS_NAME__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "LLN0" ),
                    XMLTypeUtil.createPatternMatcher( "[A-Z]{4}" ) },
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "\\i\\c*" ) } };

    /**
     * Validates the Pattern constraint of '<em>LN Class Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClassName_Pattern( String lnClassName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.LN_CLASS_NAME, lnClassName, LN_CLASS_NAME__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSIdentifier( String nsIdentifier, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateNSIdentifier_Pattern( nsIdentifier, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateNSIdentifier_Pattern
     */
    public static final PatternMatcher[][] NS_IDENTIFIER__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "\\p{IsBasicLatin}+" ) } };

    /**
     * Validates the Pattern constraint of '<em>NS Identifier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSIdentifier_Pattern( String nsIdentifier, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.NS_IDENTIFIER, nsIdentifier, NS_IDENTIFIER__PATTERN__VALUES,
                diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSRelease( short nsRelease, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateNSRelease_Min( nsRelease, diagnostics, context );
        if( result || diagnostics != null )
            result &= xmlTypeValidator.validateUnsignedByte_Max( nsRelease, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateNSRelease_Min
     */
    public static final short NS_RELEASE__MIN__VALUE = 0;

    /**
     * Validates the Min constraint of '<em>NS Release</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSRelease_Min( short nsRelease, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = nsRelease > NS_RELEASE__MIN__VALUE;
        if( !result && diagnostics != null ) reportMinViolation( NsdPackage.Literals.NS_RELEASE, nsRelease,
                NS_RELEASE__MIN__VALUE, false, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSReleaseObject( Short nsReleaseObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateNSRelease_Min( nsReleaseObject, diagnostics, context );
        if( result || diagnostics != null )
            result &= xmlTypeValidator.validateUnsignedByte_Max( nsReleaseObject, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSRevision( String nsRevision, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateNSRevision_Pattern( nsRevision, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateNSRevision_Pattern
     */
    public static final PatternMatcher[][] NS_REVISION__PATTERN__VALUES = new PatternMatcher[][] {
            new PatternMatcher[] { XMLTypeUtil.createPatternMatcher( "[A-Z]" ) } };

    /**
     * Validates the Pattern constraint of '<em>NS Revision</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSRevision_Pattern( String nsRevision, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validatePattern( NsdPackage.Literals.NS_REVISION, nsRevision, NS_REVISION__PATTERN__VALUES, diagnostics,
                context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSVersion( int nsVersion, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = validateNSVersion_Min( nsVersion, diagnostics, context );
        if( result || diagnostics != null ) result &= validateNSVersion_Max( nsVersion, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateNSVersion_Min
     */
    public static final int NS_VERSION__MIN__VALUE = 2002;

    /**
     * Validates the Min constraint of '<em>NS Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSVersion_Min( int nsVersion, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = nsVersion >= NS_VERSION__MIN__VALUE;
        if( !result && diagnostics != null ) reportMinViolation( NsdPackage.Literals.NS_VERSION, nsVersion,
                NS_VERSION__MIN__VALUE, true, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateNSVersion_Max
     */
    public static final int NS_VERSION__MAX__VALUE = 2099;

    /**
     * Validates the Max constraint of '<em>NS Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSVersion_Max( int nsVersion, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = nsVersion <= NS_VERSION__MAX__VALUE;
        if( !result && diagnostics != null ) reportMaxViolation( NsdPackage.Literals.NS_VERSION, nsVersion,
                NS_VERSION__MAX__VALUE, true, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSVersionObject( Integer nsVersionObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateNSVersion_Min( nsVersionObject, diagnostics, context );
        if( result || diagnostics != null ) result &= validateNSVersion_Max( nsVersionObject, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceConditionArgument( String presenceConditionArgument, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceConditionName( String presenceConditionName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePubStageObject( PubStage pubStageObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataObjectName( String subDataObjectName, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        boolean result = validateIec61850Name_Pattern( subDataObjectName, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateIec61850Name_MinLength( subDataObjectName, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUMLVersion( String umlVersion, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        boolean result = xmlTypeValidator.validateName_Pattern( umlVersion, diagnostics, context );
        if( result || diagnostics != null ) result &= validateUMLVersion_MinLength( umlVersion, diagnostics, context );
        return result;
    }

    /**
     * Validates the MinLength constraint of '<em>UML Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUMLVersion_MinLength( String umlVersion, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        int length = umlVersion.length();
        boolean result = length >= 1;
        if( !result && diagnostics != null )
            reportMinLengthViolation( NsdPackage.Literals.UML_VERSION, umlVersion, length, 1, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUndefinedAttributeTypeKindObject(
            UndefinedAttributeTypeKind undefinedAttributeTypeKindObject, DiagnosticChain diagnostics,
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
