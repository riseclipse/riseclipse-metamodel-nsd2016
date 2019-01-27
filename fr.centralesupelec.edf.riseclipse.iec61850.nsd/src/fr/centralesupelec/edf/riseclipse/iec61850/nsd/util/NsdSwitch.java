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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage
 * @generated
 */
public class NsdSwitch< T > extends Switch< T > {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static NsdPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NsdSwitch() {
        if( modelPackage == null ) {
            modelPackage = NsdPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch( classifierID ) {
        case NsdPackage.APPLIES_TO_TYPE: {
            AppliesToType appliesToType = ( AppliesToType ) theEObject;
            T result = caseAppliesToType( appliesToType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.DEPENDS_ON_TYPE: {
            DependsOnType dependsOnType = ( DependsOnType ) theEObject;
            T result = caseDependsOnType( dependsOnType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.DOCUMENT_ROOT: {
            DocumentRoot documentRoot = ( DocumentRoot ) theEObject;
            T result = caseDocumentRoot( documentRoot );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.SERVICE_TYPE: {
            ServiceType serviceType = ( ServiceType ) theEObject;
            T result = caseServiceType( serviceType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TABBREVIATION: {
            TAbbreviation tAbbreviation = ( TAbbreviation ) theEObject;
            T result = caseTAbbreviation( tAbbreviation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TABBREVIATIONS: {
            TAbbreviations tAbbreviations = ( TAbbreviations ) theEObject;
            T result = caseTAbbreviations( tAbbreviations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TABSTRACT_LN_CLASS: {
            TAbstractLNClass tAbstractLNClass = ( TAbstractLNClass ) theEObject;
            T result = caseTAbstractLNClass( tAbstractLNClass );
            if( result == null ) result = caseTAnyLNClass( tAbstractLNClass );
            if( result == null ) result = caseTTitledClass( tAbstractLNClass );
            if( result == null ) result = caseTDocumentedClass( tAbstractLNClass );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TANY_LN_CLASS: {
            TAnyLNClass tAnyLNClass = ( TAnyLNClass ) theEObject;
            T result = caseTAnyLNClass( tAnyLNClass );
            if( result == null ) result = caseTTitledClass( tAnyLNClass );
            if( result == null ) result = caseTDocumentedClass( tAnyLNClass );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TAPPLICABLE_SERVICE_NS: {
            TApplicableServiceNS tApplicableServiceNS = ( TApplicableServiceNS ) theEObject;
            T result = caseTApplicableServiceNS( tApplicableServiceNS );
            if( result == null ) result = caseTCopyrighted( tApplicableServiceNS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TAPPLICABLE_SERVICES: {
            TApplicableServices tApplicableServices = ( TApplicableServices ) theEObject;
            T result = caseTApplicableServices( tApplicableServices );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TBASIC_TYPE: {
            TBasicType tBasicType = ( TBasicType ) theEObject;
            T result = caseTBasicType( tBasicType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TBASIC_TYPES: {
            TBasicTypes tBasicTypes = ( TBasicTypes ) theEObject;
            T result = caseTBasicTypes( tBasicTypes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCDC: {
            TCDC tcdc = ( TCDC ) theEObject;
            T result = caseTCDC( tcdc );
            if( result == null ) result = caseTTitledClass( tcdc );
            if( result == null ) result = caseTDocumentedClass( tcdc );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCD_CS: {
            TCDCs tcdCs = ( TCDCs ) theEObject;
            T result = caseTCDCs( tcdCs );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCHANGES: {
            TChanges tChanges = ( TChanges ) theEObject;
            T result = caseTChanges( tChanges );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCONSTRUCTED_ATTRIBUTE: {
            TConstructedAttribute tConstructedAttribute = ( TConstructedAttribute ) theEObject;
            T result = caseTConstructedAttribute( tConstructedAttribute );
            if( result == null ) result = caseTTitledClass( tConstructedAttribute );
            if( result == null ) result = caseTDocumentedClass( tConstructedAttribute );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCONSTRUCTED_ATTRIBUTES: {
            TConstructedAttributes tConstructedAttributes = ( TConstructedAttributes ) theEObject;
            T result = caseTConstructedAttributes( tConstructedAttributes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCOPYRIGHTED: {
            TCopyrighted tCopyrighted = ( TCopyrighted ) theEObject;
            T result = caseTCopyrighted( tCopyrighted );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TCOPYRIGHT_NOTICE: {
            TCopyrightNotice tCopyrightNotice = ( TCopyrightNotice ) theEObject;
            T result = caseTCopyrightNotice( tCopyrightNotice );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TDATA_ATTRIBUTE: {
            TDataAttribute tDataAttribute = ( TDataAttribute ) theEObject;
            T result = caseTDataAttribute( tDataAttribute );
            if( result == null ) result = caseTDocumentedClass( tDataAttribute );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TDATA_OBJECT: {
            TDataObject tDataObject = ( TDataObject ) theEObject;
            T result = caseTDataObject( tDataObject );
            if( result == null ) result = caseTDocumentedClass( tDataObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TDATA_SET_MEMBER_OF: {
            TDataSetMemberOf tDataSetMemberOf = ( TDataSetMemberOf ) theEObject;
            T result = caseTDataSetMemberOf( tDataSetMemberOf );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TDOC: {
            TDoc tDoc = ( TDoc ) theEObject;
            T result = caseTDoc( tDoc );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TDOCUMENTED_CLASS: {
            TDocumentedClass tDocumentedClass = ( TDocumentedClass ) theEObject;
            T result = caseTDocumentedClass( tDocumentedClass );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TENUMERATION: {
            TEnumeration tEnumeration = ( TEnumeration ) theEObject;
            T result = caseTEnumeration( tEnumeration );
            if( result == null ) result = caseTTitledClass( tEnumeration );
            if( result == null ) result = caseTDocumentedClass( tEnumeration );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TENUMERATIONS: {
            TEnumerations tEnumerations = ( TEnumerations ) theEObject;
            T result = caseTEnumerations( tEnumerations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TFUNCTIONAL_CONSTRAINT: {
            TFunctionalConstraint tFunctionalConstraint = ( TFunctionalConstraint ) theEObject;
            T result = caseTFunctionalConstraint( tFunctionalConstraint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS: {
            TFunctionalConstraints tFunctionalConstraints = ( TFunctionalConstraints ) theEObject;
            T result = caseTFunctionalConstraints( tFunctionalConstraints );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TLICENSE: {
            TLicense tLicense = ( TLicense ) theEObject;
            T result = caseTLicense( tLicense );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TLITERAL: {
            TLiteral tLiteral = ( TLiteral ) theEObject;
            T result = caseTLiteral( tLiteral );
            if( result == null ) result = caseTDocumentedClass( tLiteral );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TLN_CLASS: {
            TLNClass tlnClass = ( TLNClass ) theEObject;
            T result = caseTLNClass( tlnClass );
            if( result == null ) result = caseTAnyLNClass( tlnClass );
            if( result == null ) result = caseTTitledClass( tlnClass );
            if( result == null ) result = caseTDocumentedClass( tlnClass );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TLN_CLASSES: {
            TLNClasses tlnClasses = ( TLNClasses ) theEObject;
            T result = caseTLNClasses( tlnClasses );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TNOTICE: {
            TNotice tNotice = ( TNotice ) theEObject;
            T result = caseTNotice( tNotice );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TNS: {
            TNS tns = ( TNS ) theEObject;
            T result = caseTNS( tns );
            if( result == null ) result = caseTCopyrighted( tns );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TNS_DOC: {
            TNSDoc tnsDoc = ( TNSDoc ) theEObject;
            T result = caseTNSDoc( tnsDoc );
            if( result == null ) result = caseTCopyrighted( tnsDoc );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TPRESENCE_CONDITION: {
            TPresenceCondition tPresenceCondition = ( TPresenceCondition ) theEObject;
            T result = caseTPresenceCondition( tPresenceCondition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TPRESENCE_CONDITIONS: {
            TPresenceConditions tPresenceConditions = ( TPresenceConditions ) theEObject;
            T result = caseTPresenceConditions( tPresenceConditions );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_CDC: {
            TServiceCDC tServiceCDC = ( TServiceCDC ) theEObject;
            T result = caseTServiceCDC( tServiceCDC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_CD_CS: {
            TServiceCDCs tServiceCDCs = ( TServiceCDCs ) theEObject;
            T result = caseTServiceCDCs( tServiceCDCs );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_CONSTRUCTED_ATTRIBUTE: {
            TServiceConstructedAttribute tServiceConstructedAttribute = ( TServiceConstructedAttribute ) theEObject;
            T result = caseTServiceConstructedAttribute( tServiceConstructedAttribute );
            if( result == null ) result = caseTConstructedAttribute( tServiceConstructedAttribute );
            if( result == null ) result = caseTTitledClass( tServiceConstructedAttribute );
            if( result == null ) result = caseTDocumentedClass( tServiceConstructedAttribute );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_CONSTRUCTED_ATTRIBUTES: {
            TServiceConstructedAttributes tServiceConstructedAttributes = ( TServiceConstructedAttributes ) theEObject;
            T result = caseTServiceConstructedAttributes( tServiceConstructedAttributes );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_DATA_ATTRIBUTE: {
            TServiceDataAttribute tServiceDataAttribute = ( TServiceDataAttribute ) theEObject;
            T result = caseTServiceDataAttribute( tServiceDataAttribute );
            if( result == null ) result = caseTDocumentedClass( tServiceDataAttribute );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_NS: {
            TServiceNS tServiceNS = ( TServiceNS ) theEObject;
            T result = caseTServiceNS( tServiceNS );
            if( result == null ) result = caseTCopyrighted( tServiceNS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_NS_USAGE: {
            TServiceNsUsage tServiceNsUsage = ( TServiceNsUsage ) theEObject;
            T result = caseTServiceNsUsage( tServiceNsUsage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_PARAMETER: {
            TServiceParameter tServiceParameter = ( TServiceParameter ) theEObject;
            T result = caseTServiceParameter( tServiceParameter );
            if( result == null ) result = caseTDocumentedClass( tServiceParameter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_TYPE_REALIZATION: {
            TServiceTypeRealization tServiceTypeRealization = ( TServiceTypeRealization ) theEObject;
            T result = caseTServiceTypeRealization( tServiceTypeRealization );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSERVICE_TYPE_REALIZATIONS: {
            TServiceTypeRealizations tServiceTypeRealizations = ( TServiceTypeRealizations ) theEObject;
            T result = caseTServiceTypeRealizations( tServiceTypeRealizations );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSUB_DATA_ATTRIBUTE: {
            TSubDataAttribute tSubDataAttribute = ( TSubDataAttribute ) theEObject;
            T result = caseTSubDataAttribute( tSubDataAttribute );
            if( result == null ) result = caseTDocumentedClass( tSubDataAttribute );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TSUB_DATA_OBJECT: {
            TSubDataObject tSubDataObject = ( TSubDataObject ) theEObject;
            T result = caseTSubDataObject( tSubDataObject );
            if( result == null ) result = caseTDocumentedClass( tSubDataObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case NsdPackage.TTITLED_CLASS: {
            TTitledClass tTitledClass = ( TTitledClass ) theEObject;
            T result = caseTTitledClass( tTitledClass );
            if( result == null ) result = caseTDocumentedClass( tTitledClass );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Applies To Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Applies To Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAppliesToType( AppliesToType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Depends On Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Depends On Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDependsOnType( DependsOnType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot( DocumentRoot object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceType( ServiceType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAbbreviation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAbbreviation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAbbreviation( TAbbreviation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAbbreviations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAbbreviations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAbbreviations( TAbbreviations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAbstract LN Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAbstract LN Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAbstractLNClass( TAbstractLNClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAny LN Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAny LN Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAnyLNClass( TAnyLNClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TApplicable Service NS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TApplicable Service NS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTApplicableServiceNS( TApplicableServiceNS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TApplicable Services</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TApplicable Services</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTApplicableServices( TApplicableServices object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TBasic Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TBasic Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTBasicType( TBasicType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TBasic Types</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TBasic Types</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTBasicTypes( TBasicTypes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCDC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCDC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCDC( TCDC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCD Cs</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCD Cs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCDCs( TCDCs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TChanges</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TChanges</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTChanges( TChanges object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TConstructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TConstructed Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTConstructedAttribute( TConstructedAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TConstructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TConstructed Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTConstructedAttributes( TConstructedAttributes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCopyrighted</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCopyrighted</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCopyrighted( TCopyrighted object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCopyright Notice</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCopyright Notice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCopyrightNotice( TCopyrightNotice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TData Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TData Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDataAttribute( TDataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TData Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TData Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDataObject( TDataObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TData Set Member Of</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TData Set Member Of</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDataSetMemberOf( TDataSetMemberOf object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDoc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDoc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDoc( TDoc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDocumented Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDocumented Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDocumentedClass( TDocumentedClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEnumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEnumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTEnumeration( TEnumeration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEnumerations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEnumerations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTEnumerations( TEnumerations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TFunctional Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TFunctional Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTFunctionalConstraint( TFunctionalConstraint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TFunctional Constraints</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TFunctional Constraints</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTFunctionalConstraints( TFunctionalConstraints object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TLicense</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TLicense</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTLicense( TLicense object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TLiteral</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TLiteral</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTLiteral( TLiteral object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TLN Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TLN Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTLNClass( TLNClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TLN Classes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TLN Classes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTLNClasses( TLNClasses object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TNotice</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TNotice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTNotice( TNotice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TNS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TNS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTNS( TNS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TNS Doc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TNS Doc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTNSDoc( TNSDoc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPresence Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPresence Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPresenceCondition( TPresenceCondition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPresence Conditions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPresence Conditions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPresenceConditions( TPresenceConditions object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService CDC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService CDC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceCDC( TServiceCDC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService CD Cs</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService CD Cs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceCDCs( TServiceCDCs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Constructed Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceConstructedAttribute( TServiceConstructedAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Constructed Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceConstructedAttributes( TServiceConstructedAttributes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceDataAttribute( TServiceDataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService NS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService NS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceNS( TServiceNS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Ns Usage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Ns Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceNsUsage( TServiceNsUsage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceParameter( TServiceParameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Type Realization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Type Realization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceTypeRealization( TServiceTypeRealization object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TService Type Realizations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TService Type Realizations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTServiceTypeRealizations( TServiceTypeRealizations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TSub Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TSub Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTSubDataAttribute( TSubDataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TSub Data Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TSub Data Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTSubDataObject( TSubDataObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TTitled Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TTitled Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTTitledClass( TTitledClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} //NsdSwitch
