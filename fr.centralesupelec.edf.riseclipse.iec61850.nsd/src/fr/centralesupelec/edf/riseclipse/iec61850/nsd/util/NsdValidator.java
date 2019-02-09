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
        if( !validate_NoCircularContainment( abbreviations, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( abbreviations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( abbreviations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( abbreviations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( abbreviations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( abbreviations, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( abbreviations, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( abbreviations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( abbreviations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateAbbreviations_uniqueAbbreviation( abbreviations, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueAbbreviation constraint of '<em>Abbreviations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ABBREVIATIONS__UNIQUE_ABBREVIATION__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'There shall not be two Abbreviations elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.abbreviation->isUnique( a : Abbreviation | a.name )\n"
            + "}.status";

    /**
     * Validates the uniqueAbbreviation constraint of '<em>Abbreviations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviations_uniqueAbbreviation( Abbreviations abbreviations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.ABBREVIATIONS, abbreviations, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueAbbreviation",
                ABBREVIATIONS__UNIQUE_ABBREVIATION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbstractLNClass( AbstractLNClass abstractLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( abstractLNClass, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateAnyLNClass_uniqueDataObject( abstractLNClass, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAnyLNClass( AnyLNClass anyLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( anyLNClass, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( anyLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( anyLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( anyLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( anyLNClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( anyLNClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( anyLNClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( anyLNClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryMapEntryUnique( anyLNClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateAnyLNClass_uniqueDataObject( anyLNClass, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueDataObject constraint of '<em>Any LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ANY_LN_CLASS__UNIQUE_DATA_OBJECT__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For an AnyLNClass, there shall not be two DataObject sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\t-- TODO: base AbstractLNClass should be taken into account\n"
            + "\t\t\t-- For this, explicit links have to be created first\n"
            + "\t\t\tself.dataObject->isUnique( d : DataObject | d.name )\n" + "}.status";

    /**
     * Validates the uniqueDataObject constraint of '<em>Any LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAnyLNClass_uniqueDataObject( AnyLNClass anyLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.ANY_LN_CLASS, anyLNClass, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueDataObject",
                ANY_LN_CLASS__UNIQUE_DATA_OBJECT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
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
        if( !validate_NoCircularContainment( applicableServices, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( applicableServices, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryKeyUnique( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateApplicableServices_uniqueDataSetMemberOf( applicableServices, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateApplicableServices_uniqueService( applicableServices, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueDataSetMemberOf constraint of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String APPLICABLE_SERVICES__UNIQUE_DATA_SET_MEMBER_OF__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For an ApplicableServices, there shall not be two DataSetMemberOf sub-elements with same cb.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.dataSetMemberOf->isUnique( d : DataSetMemberOf | d.cb )\n"
            + "}.status";

    /**
     * Validates the uniqueDataSetMemberOf constraint of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServices_uniqueDataSetMemberOf( ApplicableServices applicableServices,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.APPLICABLE_SERVICES, applicableServices, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueDataSetMemberOf",
                APPLICABLE_SERVICES__UNIQUE_DATA_SET_MEMBER_OF__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * The cached validation expression for the uniqueService constraint of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String APPLICABLE_SERVICES__UNIQUE_SERVICE__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For an ApplicableServices, there shall not be two ServiceType sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.service->isUnique( s : ServiceType | s.name )\n" + "}.status";

    /**
     * Validates the uniqueService constraint of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServices_uniqueService( ApplicableServices applicableServices,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.APPLICABLE_SERVICES, applicableServices, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueService",
                APPLICABLE_SERVICES__UNIQUE_SERVICE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
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
        if( !validate_NoCircularContainment( cdc, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryDataValueConforms( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryReferenceIsContained( cdc, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryMapEntryUnique( cdc, diagnostics, context );
        if( result || diagnostics != null ) result &= validateCDC_uniqueCDCChild( cdc, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueCDCChild constraint of '<em>CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String CDC__UNIQUE_CDC_CHILD__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.',\n"
            + "\tstatus : Boolean = \n"
            + "\t\t\tlet names : Bag(String) = self.subDataObject.name->union(self.dataAttribute.name) in names->size() = names->asSet()->size()\n"
            + "}.status";

    /**
     * Validates the uniqueCDCChild constraint of '<em>CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDC_uniqueCDCChild( CDC cdc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.CDC, cdc, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueCDCChild", CDC__UNIQUE_CDC_CHILD__EEXPRESSION,
                Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCs( CDCs cdCs, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( cdCs, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryDataValueConforms( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryReferenceIsContained( cdCs, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryMapEntryUnique( cdCs, diagnostics, context );
        if( result || diagnostics != null ) result &= validateCDCs_uniqueCDC( cdCs, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueCDC constraint of '<em>CD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String CD_CS__UNIQUE_CDC__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\t-- TODO: DependsOn NS should be taken into account ?\n"
            + "\t\t\t-- For this, explicit links have to be created first\n"
            + "\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n"
            + "\t\t\tself.cDC->select( c : CDC | c.variant = null )->isUnique( c : CDC | c.name )\n"
            + "\t     or self.cDC->select( c : CDC | c.variant <> null )->forAll( c1, c2 : CDC | c1 <> c2 implies c1.name <> c2.name or c1.variant <> c2.variant )\n"
            + "}.status";

    /**
     * Validates the uniqueCDC constraint of '<em>CD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCs_uniqueCDC( CDCs cdCs, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.CD_CS, cdCs, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueCDC", CD_CS__UNIQUE_CDC__EEXPRESSION,
                Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
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
        if( !validate_NoCircularContainment( constructedAttribute, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryKeyUnique( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateConstructedAttribute_uniqueSubDataAttribute( constructedAttribute, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueSubDataAttribute constraint of '<em>Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String CONSTRUCTED_ATTRIBUTE__UNIQUE_SUB_DATA_ATTRIBUTE__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.subDataAttribute->isUnique( s : SubDataAttribute | s.name )\n"
            + "}.status";

    /**
     * Validates the uniqueSubDataAttribute constraint of '<em>Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttribute_uniqueSubDataAttribute( ConstructedAttribute constructedAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE, constructedAttribute, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueSubDataAttribute",
                CONSTRUCTED_ATTRIBUTE__UNIQUE_SUB_DATA_ATTRIBUTE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttributes( ConstructedAttributes constructedAttributes,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( constructedAttributes, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryKeyUnique( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateConstructedAttributes_uniqueConstructedAttribute( constructedAttributes, diagnostics,
                    context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueConstructedAttribute constraint of '<em>Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String CONSTRUCTED_ATTRIBUTES__UNIQUE_CONSTRUCTED_ATTRIBUTE__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'Within an NS, there shall not be two ConstructedAttribute sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\t-- TODO: DependsOn NS should be taken into account ?\n"
            + "\t\t\t-- For this, explicit links have to be created first\n"
            + "\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n"
            + "\t\t\tself.constructedAttribute->isUnique( c : ConstructedAttribute | c.name )\n" + "}.status";

    /**
     * Validates the uniqueConstructedAttribute constraint of '<em>Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttributes_uniqueConstructedAttribute(
            ConstructedAttributes constructedAttributes, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.CONSTRUCTED_ATTRIBUTES, constructedAttributes, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueConstructedAttribute",
                CONSTRUCTED_ATTRIBUTES__UNIQUE_CONSTRUCTED_ATTRIBUTE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
                0 );
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
        if( !validate_NoCircularContainment( enumeration, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( enumeration, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( enumeration, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( enumeration, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( enumeration, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( enumeration, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( enumeration, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( enumeration, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryMapEntryUnique( enumeration, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateEnumeration_uniqueLiteralName( enumeration, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateEnumeration_uniqueLiteralVal( enumeration, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueLiteralName constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ENUMERATION__UNIQUE_LITERAL_NAME__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For an Enumeration, there shall not be two Literal sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\t-- TODO: inherited literals should be taken into account\n"
            + "\t\t\t-- For this, explicit links have to be created first\n"
            + "\t\t\tself.literal->isUnique( l : Literal | l.name )\n" + "}.status";

    /**
     * Validates the uniqueLiteralName constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumeration_uniqueLiteralName( Enumeration enumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.ENUMERATION, enumeration, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueLiteralName",
                ENUMERATION__UNIQUE_LITERAL_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * The cached validation expression for the uniqueLiteralVal constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ENUMERATION__UNIQUE_LITERAL_VAL__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'For an Enumeration, there shall not be two Literal sub-elements with same literalVal.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.literal->isUnique( l : Literal | l.literalVal )\n" + "}.status";

    /**
     * Validates the uniqueLiteralVal constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumeration_uniqueLiteralVal( Enumeration enumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.ENUMERATION, enumeration, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueLiteralVal",
                ENUMERATION__UNIQUE_LITERAL_VAL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumerations( Enumerations enumerations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( enumerations, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( enumerations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( enumerations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( enumerations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( enumerations, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( enumerations, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( enumerations, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( enumerations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( enumerations, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateEnumerations_uniqueEnumeration( enumerations, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueEnumeration constraint of '<em>Enumerations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String ENUMERATIONS__UNIQUE_ENUMERATION__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'Within an NS, there shall not be two Enumeration sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\t-- TODO: DependsOn NS should be taken into account ?\n"
            + "\t\t\t-- For this, explicit links have to be created first\n"
            + "\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n"
            + "\t\t\tself.enumeration->isUnique( e : Enumeration | e.name )\n" + "}.status";

    /**
     * Validates the uniqueEnumeration constraint of '<em>Enumerations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumerations_uniqueEnumeration( Enumerations enumerations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.ENUMERATIONS, enumerations, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueEnumeration",
                ENUMERATIONS__UNIQUE_ENUMERATION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
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
        if( !validate_NoCircularContainment( functionalConstraints, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryKeyUnique( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateFunctionalConstraints_uniqueFunctionalConstraint( functionalConstraints, diagnostics,
                    context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueFunctionalConstraint constraint of '<em>Functional Constraints</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String FUNCTIONAL_CONSTRAINTS__UNIQUE_FUNCTIONAL_CONSTRAINT__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'There shall not be two FunctionalConstraint elements with same abbreviation.',\n"
            + "\tstatus : Boolean = \n"
            + "\t\t\tself.functionalConstraint->isUnique( f : FunctionalConstraint | f.abbreviation )\n" + "}.status";

    /**
     * Validates the uniqueFunctionalConstraint constraint of '<em>Functional Constraints</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraints_uniqueFunctionalConstraint(
            FunctionalConstraints functionalConstraints, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.FUNCTIONAL_CONSTRAINTS, functionalConstraints, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueFunctionalConstraint",
                FUNCTIONAL_CONSTRAINTS__UNIQUE_FUNCTIONAL_CONSTRAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
                0 );
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
        if( !validate_NoCircularContainment( lnClass, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( lnClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryDataValueConforms( lnClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( lnClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( lnClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( lnClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( lnClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( lnClass, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryMapEntryUnique( lnClass, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateAnyLNClass_uniqueDataObject( lnClass, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( lnClasses, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( lnClasses, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( lnClasses, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( lnClasses, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( lnClasses, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryProxyResolves( lnClasses, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( lnClasses, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryKeyUnique( lnClasses, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_EveryMapEntryUnique( lnClasses, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateLNClasses_uniqueAbstractLNClass( lnClasses, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateLNClasses_uniqueLNClass( lnClasses, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniqueAbstractLNClass constraint of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String LN_CLASSES__UNIQUE_ABSTRACT_LN_CLASS__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'Within an NS, there shall not be two AbstractLNClass sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.abstractLNClass->isUnique( c : AbstractLNClass | c.name )\n"
            + "}.status";

    /**
     * Validates the uniqueAbstractLNClass constraint of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses_uniqueAbstractLNClass( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.LN_CLASSES, lnClasses, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueAbstractLNClass",
                LN_CLASSES__UNIQUE_ABSTRACT_LN_CLASS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
    }

    /**
     * The cached validation expression for the uniqueLNClass constraint of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String LN_CLASSES__UNIQUE_LN_CLASS__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'Within an NS, there shall not be two LNClass sub-elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.lNClass->isUnique( c : LNClass | c.name )\n" + "}.status";

    /**
     * Validates the uniqueLNClass constraint of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses_uniqueLNClass( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.LN_CLASSES, lnClasses, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueLNClass",
                LN_CLASSES__UNIQUE_LN_CLASS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
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
        if( !validate_NoCircularContainment( presenceConditions, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( presenceConditions, diagnostics, context );
        if( result || diagnostics != null ) result &= validate_UniqueID( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryKeyUnique( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( presenceConditions, diagnostics, context );
        if( result || diagnostics != null )
            result &= validatePresenceConditions_uniquePresenceCondition( presenceConditions, diagnostics, context );
        return result;
    }

    /**
     * The cached validation expression for the uniquePresenceCondition constraint of '<em>Presence Conditions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String PRESENCE_CONDITIONS__UNIQUE_PRESENCE_CONDITION__EEXPRESSION = "Tuple {\n"
            + "\tmessage : String = 'There shall not be two PresenceCondition elements with same name.',\n"
            + "\tstatus : Boolean = \n" + "\t\t\tself.presenceCondition->isUnique( p : PresenceCondition | p.name )\n"
            + "}.status";

    /**
     * Validates the uniquePresenceCondition constraint of '<em>Presence Conditions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceConditions_uniquePresenceCondition( PresenceConditions presenceConditions,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return validate( NsdPackage.Literals.PRESENCE_CONDITIONS, presenceConditions, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniquePresenceCondition",
                PRESENCE_CONDITIONS__UNIQUE_PRESENCE_CONDITION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0 );
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
        if( !validate_NoCircularContainment( serviceConstructedAttribute, diagnostics, context ) ) return false;
        boolean result = validate_EveryMultiplicityConforms( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryDataValueConforms( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryReferenceIsContained( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryProxyResolves( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_UniqueID( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryKeyUnique( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validate_EveryMapEntryUnique( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null )
            result &= validateConstructedAttribute_uniqueSubDataAttribute( serviceConstructedAttribute, diagnostics,
                    context );
        return result;
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
