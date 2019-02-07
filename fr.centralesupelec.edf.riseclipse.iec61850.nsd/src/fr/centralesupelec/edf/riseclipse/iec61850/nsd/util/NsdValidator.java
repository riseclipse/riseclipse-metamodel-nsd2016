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

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NsdValidator() {
        super();
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
        case NsdPackage.DEPENDS_ON:
            return validateDependsOn( ( DependsOn ) value, diagnostics, context );
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS:
            return validateServiceTypeRealizations( ( ServiceTypeRealizations ) value, diagnostics, context );
        case NsdPackage.SUB_DATA_ATTRIBUTE:
            return validateSubDataAttribute( ( SubDataAttribute ) value, diagnostics, context );
        case NsdPackage.SUB_DATA_OBJECT:
            return validateSubDataObject( ( SubDataObject ) value, diagnostics, context );
        case NsdPackage.TITLED_CLASS:
            return validateTitledClass( ( TitledClass ) value, diagnostics, context );
        case NsdPackage.NSD_OBJECT:
            return validateNsdObject( ( NsdObject ) value, diagnostics, context );
        case NsdPackage.AG_NS_IDENTIFICATION:
            return validateAgNSIdentification( ( AgNSIdentification ) value, diagnostics, context );
        case NsdPackage.AG_PRESENCE_CONDITION:
            return validateAgPresenceCondition( ( AgPresenceCondition ) value, diagnostics, context );
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return validateAgPresenceConditionDerivedStatistics( ( AgPresenceConditionDerivedStatistics ) value,
                    diagnostics, context );
        case NsdPackage.AG_ARRAY:
            return validateAgArray( ( AgArray ) value, diagnostics, context );
        case NsdPackage.AG_TRG_OP:
            return validateAgTrgOp( ( AgTrgOp ) value, diagnostics, context );
        case NsdPackage.AG_ATTRIBUTE_TYPE:
            return validateAgAttributeType( ( AgAttributeType ) value, diagnostics, context );
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES:
            return validateAgAttributeTypeAndValues( ( AgAttributeTypeAndValues ) value, diagnostics, context );
        case NsdPackage.AG_UNDERLYING_TYPE:
            return validateAgUnderlyingType( ( AgUnderlyingType ) value, diagnostics, context );
        case NsdPackage.AG_UML:
            return validateAgUML( ( AgUML ) value, diagnostics, context );
        case NsdPackage.AG_NSDESC:
            return validateAgNSdesc( ( AgNSdesc ) value, diagnostics, context );
        case NsdPackage.IRISE_CLIPSE_CONSOLE:
            return validateIRiseClipseConsole( ( IRiseClipseConsole ) value, diagnostics, context );
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
    public boolean validateDependsOn( DependsOn dependsOn, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( dependsOn, diagnostics, context );
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
    public boolean validateNsdObject( NsdObject nsdObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( nsdObject, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgNSIdentification( AgNSIdentification agNSIdentification, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agNSIdentification, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgPresenceCondition( AgPresenceCondition agPresenceCondition, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agPresenceCondition, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgPresenceConditionDerivedStatistics(
            AgPresenceConditionDerivedStatistics agPresenceConditionDerivedStatistics, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agPresenceConditionDerivedStatistics, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgArray( AgArray agArray, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agArray, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgTrgOp( AgTrgOp agTrgOp, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agTrgOp, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgAttributeType( AgAttributeType agAttributeType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agAttributeType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgAttributeTypeAndValues( AgAttributeTypeAndValues agAttributeTypeAndValues,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agAttributeTypeAndValues, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgUnderlyingType( AgUnderlyingType agUnderlyingType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agUnderlyingType, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgUML( AgUML agUML, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agUML, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgNSdesc( AgNSdesc agNSdesc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agNSdesc, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIRiseClipseConsole( IRiseClipseConsole iRiseClipseConsole, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( ( EObject ) iRiseClipseConsole, diagnostics, context );
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
