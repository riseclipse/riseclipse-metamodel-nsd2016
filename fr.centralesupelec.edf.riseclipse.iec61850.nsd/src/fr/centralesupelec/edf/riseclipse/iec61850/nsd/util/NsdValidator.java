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
        case NsdPackage.ACSI_SERVICES_KIND_OBJECT:
            return validateACSIServicesKindObject( ( ACSIServicesKind ) value, diagnostics, context );
        case NsdPackage.ATTRIBUTE_TYPE_KIND:
            return validateAttributeTypeKind( ( Enumerator ) value, diagnostics, context );
        case NsdPackage.CB_KIND_OBJECT:
            return validateCBKindObject( ( CBKind ) value, diagnostics, context );
        case NsdPackage.DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT:
            return validateDefinedAttributeTypeKindObject( ( DefinedAttributeTypeKind ) value, diagnostics, context );
        case NsdPackage.LICENSE_KIND_OBJECT:
            return validateLicenseKindObject( ( LicenseKind ) value, diagnostics, context );
        case NsdPackage.NS_RELEASE:
            return validateNSRelease( ( Short ) value, diagnostics, context );
        case NsdPackage.NS_RELEASE_OBJECT:
            return validateNSReleaseObject( ( Short ) value, diagnostics, context );
        case NsdPackage.NS_VERSION:
            return validateNSVersion( ( Integer ) value, diagnostics, context );
        case NsdPackage.NS_VERSION_OBJECT:
            return validateNSVersionObject( ( Integer ) value, diagnostics, context );
        case NsdPackage.PUB_STAGE_OBJECT:
            return validatePubStageObject( ( PubStage ) value, diagnostics, context );
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
    public boolean validateACSIServicesKindObject( ACSIServicesKind acsiServicesKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
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
    public boolean validateCBKindObject( CBKind cbKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
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
    public boolean validateLicenseKindObject( LicenseKind licenseKindObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
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
    public boolean validatePubStageObject( PubStage pubStageObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return true;
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
