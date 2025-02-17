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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.License;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

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
            if( result == null ) {
                result = caseNsdObject( appliesToType );
            }
            if( result == null ) {
                result = caseAgNSIdentification( appliesToType );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DEPENDS_ON: {
            DependsOn dependsOn = ( DependsOn ) theEObject;
            T result = caseDependsOn( dependsOn );
            if( result == null ) {
                result = caseNsdObject( dependsOn );
            }
            if( result == null ) {
                result = caseAgNSIdentification( dependsOn );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DOCUMENT_ROOT: {
            DocumentRoot documentRoot = ( DocumentRoot ) theEObject;
            T result = caseDocumentRoot( documentRoot );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_TYPE: {
            ServiceType serviceType = ( ServiceType ) theEObject;
            T result = caseServiceType( serviceType );
            if( result == null ) {
                result = caseNsdObject( serviceType );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.ABBREVIATION: {
            Abbreviation abbreviation = ( Abbreviation ) theEObject;
            T result = caseAbbreviation( abbreviation );
            if( result == null ) {
                result = caseNsdObject( abbreviation );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.ABBREVIATIONS: {
            Abbreviations abbreviations = ( Abbreviations ) theEObject;
            T result = caseAbbreviations( abbreviations );
            if( result == null ) {
                result = caseNsdObject( abbreviations );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.ABSTRACT_LN_CLASS: {
            AbstractLNClass abstractLNClass = ( AbstractLNClass ) theEObject;
            T result = caseAbstractLNClass( abstractLNClass );
            if( result == null ) {
                result = caseAnyLNClass( abstractLNClass );
            }
            if( result == null ) {
                result = caseTitledClass( abstractLNClass );
            }
            if( result == null ) {
                result = caseDocumentedClass( abstractLNClass );
            }
            if( result == null ) {
                result = caseNsdObject( abstractLNClass );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.ANY_LN_CLASS: {
            AnyLNClass anyLNClass = ( AnyLNClass ) theEObject;
            T result = caseAnyLNClass( anyLNClass );
            if( result == null ) {
                result = caseTitledClass( anyLNClass );
            }
            if( result == null ) {
                result = caseDocumentedClass( anyLNClass );
            }
            if( result == null ) {
                result = caseNsdObject( anyLNClass );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.APPLICABLE_SERVICE_NS: {
            ApplicableServiceNS applicableServiceNS = ( ApplicableServiceNS ) theEObject;
            T result = caseApplicableServiceNS( applicableServiceNS );
            if( result == null ) {
                result = caseCopyrighted( applicableServiceNS );
            }
            if( result == null ) {
                result = caseAgNSDIdentification( applicableServiceNS );
            }
            if( result == null ) {
                result = caseNsdObject( applicableServiceNS );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.APPLICABLE_SERVICES: {
            ApplicableServices applicableServices = ( ApplicableServices ) theEObject;
            T result = caseApplicableServices( applicableServices );
            if( result == null ) {
                result = caseNsdObject( applicableServices );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.BASIC_TYPE: {
            BasicType basicType = ( BasicType ) theEObject;
            T result = caseBasicType( basicType );
            if( result == null ) {
                result = caseNsdObject( basicType );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.BASIC_TYPES: {
            BasicTypes basicTypes = ( BasicTypes ) theEObject;
            T result = caseBasicTypes( basicTypes );
            if( result == null ) {
                result = caseNsdObject( basicTypes );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.CDC: {
            CDC cdc = ( CDC ) theEObject;
            T result = caseCDC( cdc );
            if( result == null ) {
                result = caseTitledClass( cdc );
            }
            if( result == null ) {
                result = caseDocumentedClass( cdc );
            }
            if( result == null ) {
                result = caseNsdObject( cdc );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.CD_CS: {
            CDCs cdCs = ( CDCs ) theEObject;
            T result = caseCDCs( cdCs );
            if( result == null ) {
                result = caseNsdObject( cdCs );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.CHANGES: {
            Changes changes = ( Changes ) theEObject;
            T result = caseChanges( changes );
            if( result == null ) {
                result = caseNsdObject( changes );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.CONSTRUCTED_ATTRIBUTE: {
            ConstructedAttribute constructedAttribute = ( ConstructedAttribute ) theEObject;
            T result = caseConstructedAttribute( constructedAttribute );
            if( result == null ) {
                result = caseTitledClass( constructedAttribute );
            }
            if( result == null ) {
                result = caseDocumentedClass( constructedAttribute );
            }
            if( result == null ) {
                result = caseNsdObject( constructedAttribute );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.CONSTRUCTED_ATTRIBUTES: {
            ConstructedAttributes constructedAttributes = ( ConstructedAttributes ) theEObject;
            T result = caseConstructedAttributes( constructedAttributes );
            if( result == null ) {
                result = caseNsdObject( constructedAttributes );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.COPYRIGHTED: {
            Copyrighted copyrighted = ( Copyrighted ) theEObject;
            T result = caseCopyrighted( copyrighted );
            if( result == null ) {
                result = caseNsdObject( copyrighted );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.COPYRIGHT_NOTICE: {
            CopyrightNotice copyrightNotice = ( CopyrightNotice ) theEObject;
            T result = caseCopyrightNotice( copyrightNotice );
            if( result == null ) {
                result = caseNsdObject( copyrightNotice );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DATA_ATTRIBUTE: {
            DataAttribute dataAttribute = ( DataAttribute ) theEObject;
            T result = caseDataAttribute( dataAttribute );
            if( result == null ) {
                result = caseDocumentedClass( dataAttribute );
            }
            if( result == null ) {
                result = caseAgPresenceCondition( dataAttribute );
            }
            if( result == null ) {
                result = caseAgArray( dataAttribute );
            }
            if( result == null ) {
                result = caseAgTrgOp( dataAttribute );
            }
            if( result == null ) {
                result = caseAgAttributeTypeAndValues( dataAttribute );
            }
            if( result == null ) {
                result = caseNsdObject( dataAttribute );
            }
            if( result == null ) {
                result = caseAgAttributeType( dataAttribute );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DATA_OBJECT: {
            DataObject dataObject = ( DataObject ) theEObject;
            T result = caseDataObject( dataObject );
            if( result == null ) {
                result = caseDocumentedClass( dataObject );
            }
            if( result == null ) {
                result = caseAgPresenceCondition( dataObject );
            }
            if( result == null ) {
                result = caseAgPresenceConditionDerivedStatistics( dataObject );
            }
            if( result == null ) {
                result = caseAgUnderlyingType( dataObject );
            }
            if( result == null ) {
                result = caseNsdObject( dataObject );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DATA_SET_MEMBER_OF: {
            DataSetMemberOf dataSetMemberOf = ( DataSetMemberOf ) theEObject;
            T result = caseDataSetMemberOf( dataSetMemberOf );
            if( result == null ) {
                result = caseNsdObject( dataSetMemberOf );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DOC: {
            Doc doc = ( Doc ) theEObject;
            T result = caseDoc( doc );
            if( result == null ) {
                result = caseNsdObject( doc );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.DOCUMENTED_CLASS: {
            DocumentedClass documentedClass = ( DocumentedClass ) theEObject;
            T result = caseDocumentedClass( documentedClass );
            if( result == null ) {
                result = caseNsdObject( documentedClass );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.ENUMERATION: {
            Enumeration enumeration = ( Enumeration ) theEObject;
            T result = caseEnumeration( enumeration );
            if( result == null ) {
                result = caseTitledClass( enumeration );
            }
            if( result == null ) {
                result = caseDocumentedClass( enumeration );
            }
            if( result == null ) {
                result = caseNsdObject( enumeration );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.ENUMERATIONS: {
            Enumerations enumerations = ( Enumerations ) theEObject;
            T result = caseEnumerations( enumerations );
            if( result == null ) {
                result = caseNsdObject( enumerations );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.FUNCTIONAL_CONSTRAINT: {
            FunctionalConstraint functionalConstraint = ( FunctionalConstraint ) theEObject;
            T result = caseFunctionalConstraint( functionalConstraint );
            if( result == null ) {
                result = caseNsdObject( functionalConstraint );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.FUNCTIONAL_CONSTRAINTS: {
            FunctionalConstraints functionalConstraints = ( FunctionalConstraints ) theEObject;
            T result = caseFunctionalConstraints( functionalConstraints );
            if( result == null ) {
                result = caseNsdObject( functionalConstraints );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.LICENSE: {
            License license = ( License ) theEObject;
            T result = caseLicense( license );
            if( result == null ) {
                result = caseNsdObject( license );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.LITERAL: {
            Literal literal = ( Literal ) theEObject;
            T result = caseLiteral( literal );
            if( result == null ) {
                result = caseDocumentedClass( literal );
            }
            if( result == null ) {
                result = caseNsdObject( literal );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.LN_CLASS: {
            LNClass lnClass = ( LNClass ) theEObject;
            T result = caseLNClass( lnClass );
            if( result == null ) {
                result = caseAnyLNClass( lnClass );
            }
            if( result == null ) {
                result = caseTitledClass( lnClass );
            }
            if( result == null ) {
                result = caseDocumentedClass( lnClass );
            }
            if( result == null ) {
                result = caseNsdObject( lnClass );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.LN_CLASSES: {
            LNClasses lnClasses = ( LNClasses ) theEObject;
            T result = caseLNClasses( lnClasses );
            if( result == null ) {
                result = caseNsdObject( lnClasses );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.NOTICE: {
            Notice notice = ( Notice ) theEObject;
            T result = caseNotice( notice );
            if( result == null ) {
                result = caseNsdObject( notice );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.NS: {
            NS ns = ( NS ) theEObject;
            T result = caseNS( ns );
            if( result == null ) {
                result = caseCopyrighted( ns );
            }
            if( result == null ) {
                result = caseAgNSIdentification( ns );
            }
            if( result == null ) {
                result = caseAgNSDIdentification( ns );
            }
            if( result == null ) {
                result = caseAgUML( ns );
            }
            if( result == null ) {
                result = caseAgNSdesc( ns );
            }
            if( result == null ) {
                result = caseNsdObject( ns );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.NS_DOC: {
            NSDoc nsDoc = ( NSDoc ) theEObject;
            T result = caseNSDoc( nsDoc );
            if( result == null ) {
                result = caseCopyrighted( nsDoc );
            }
            if( result == null ) {
                result = caseAgNSIdentification( nsDoc );
            }
            if( result == null ) {
                result = caseAgNSDIdentification( nsDoc );
            }
            if( result == null ) {
                result = caseAgUML( nsDoc );
            }
            if( result == null ) {
                result = caseNsdObject( nsDoc );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.PRESENCE_CONDITION: {
            PresenceCondition presenceCondition = ( PresenceCondition ) theEObject;
            T result = casePresenceCondition( presenceCondition );
            if( result == null ) {
                result = caseNsdObject( presenceCondition );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.PRESENCE_CONDITIONS: {
            PresenceConditions presenceConditions = ( PresenceConditions ) theEObject;
            T result = casePresenceConditions( presenceConditions );
            if( result == null ) {
                result = caseNsdObject( presenceConditions );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_CDC: {
            ServiceCDC serviceCDC = ( ServiceCDC ) theEObject;
            T result = caseServiceCDC( serviceCDC );
            if( result == null ) {
                result = caseNsdObject( serviceCDC );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_CD_CS: {
            ServiceCDCs serviceCDCs = ( ServiceCDCs ) theEObject;
            T result = caseServiceCDCs( serviceCDCs );
            if( result == null ) {
                result = caseNsdObject( serviceCDCs );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE: {
            ServiceConstructedAttribute serviceConstructedAttribute = ( ServiceConstructedAttribute ) theEObject;
            T result = caseServiceConstructedAttribute( serviceConstructedAttribute );
            if( result == null ) {
                result = caseConstructedAttribute( serviceConstructedAttribute );
            }
            if( result == null ) {
                result = caseTitledClass( serviceConstructedAttribute );
            }
            if( result == null ) {
                result = caseDocumentedClass( serviceConstructedAttribute );
            }
            if( result == null ) {
                result = caseNsdObject( serviceConstructedAttribute );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES: {
            ServiceConstructedAttributes serviceConstructedAttributes = ( ServiceConstructedAttributes ) theEObject;
            T result = caseServiceConstructedAttributes( serviceConstructedAttributes );
            if( result == null ) {
                result = caseNsdObject( serviceConstructedAttributes );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_DATA_ATTRIBUTE: {
            ServiceDataAttribute serviceDataAttribute = ( ServiceDataAttribute ) theEObject;
            T result = caseServiceDataAttribute( serviceDataAttribute );
            if( result == null ) {
                result = caseDocumentedClass( serviceDataAttribute );
            }
            if( result == null ) {
                result = caseAgPresenceCondition( serviceDataAttribute );
            }
            if( result == null ) {
                result = caseAgAttributeType( serviceDataAttribute );
            }
            if( result == null ) {
                result = caseAgUnderlyingType( serviceDataAttribute );
            }
            if( result == null ) {
                result = caseNsdObject( serviceDataAttribute );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_NS: {
            ServiceNS serviceNS = ( ServiceNS ) theEObject;
            T result = caseServiceNS( serviceNS );
            if( result == null ) {
                result = caseCopyrighted( serviceNS );
            }
            if( result == null ) {
                result = caseAgNSIdentification( serviceNS );
            }
            if( result == null ) {
                result = caseAgNSDIdentification( serviceNS );
            }
            if( result == null ) {
                result = caseAgUML( serviceNS );
            }
            if( result == null ) {
                result = caseAgNSdesc( serviceNS );
            }
            if( result == null ) {
                result = caseNsdObject( serviceNS );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_NS_USAGE: {
            ServiceNsUsage serviceNsUsage = ( ServiceNsUsage ) theEObject;
            T result = caseServiceNsUsage( serviceNsUsage );
            if( result == null ) {
                result = caseNsdObject( serviceNsUsage );
            }
            if( result == null ) {
                result = caseAgNSIdentification( serviceNsUsage );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_PARAMETER: {
            ServiceParameter serviceParameter = ( ServiceParameter ) theEObject;
            T result = caseServiceParameter( serviceParameter );
            if( result == null ) {
                result = caseDocumentedClass( serviceParameter );
            }
            if( result == null ) {
                result = caseAgAttributeTypeAndValues( serviceParameter );
            }
            if( result == null ) {
                result = caseNsdObject( serviceParameter );
            }
            if( result == null ) {
                result = caseAgAttributeType( serviceParameter );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SERVICE_TYPE_REALIZATIONS: {
            ServiceTypeRealizations serviceTypeRealizations = ( ServiceTypeRealizations ) theEObject;
            T result = caseServiceTypeRealizations( serviceTypeRealizations );
            if( result == null ) {
                result = caseNsdObject( serviceTypeRealizations );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SUB_DATA_ATTRIBUTE: {
            SubDataAttribute subDataAttribute = ( SubDataAttribute ) theEObject;
            T result = caseSubDataAttribute( subDataAttribute );
            if( result == null ) {
                result = caseDocumentedClass( subDataAttribute );
            }
            if( result == null ) {
                result = caseAgPresenceCondition( subDataAttribute );
            }
            if( result == null ) {
                result = caseAgArray( subDataAttribute );
            }
            if( result == null ) {
                result = caseAgAttributeTypeAndValues( subDataAttribute );
            }
            if( result == null ) {
                result = caseNsdObject( subDataAttribute );
            }
            if( result == null ) {
                result = caseAgAttributeType( subDataAttribute );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.SUB_DATA_OBJECT: {
            SubDataObject subDataObject = ( SubDataObject ) theEObject;
            T result = caseSubDataObject( subDataObject );
            if( result == null ) {
                result = caseDocumentedClass( subDataObject );
            }
            if( result == null ) {
                result = caseAgPresenceCondition( subDataObject );
            }
            if( result == null ) {
                result = caseAgArray( subDataObject );
            }
            if( result == null ) {
                result = caseAgUnderlyingType( subDataObject );
            }
            if( result == null ) {
                result = caseNsdObject( subDataObject );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.TITLED_CLASS: {
            TitledClass titledClass = ( TitledClass ) theEObject;
            T result = caseTitledClass( titledClass );
            if( result == null ) {
                result = caseDocumentedClass( titledClass );
            }
            if( result == null ) {
                result = caseNsdObject( titledClass );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.NSD_OBJECT: {
            NsdObject nsdObject = ( NsdObject ) theEObject;
            T result = caseNsdObject( nsdObject );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_NS_IDENTIFICATION: {
            AgNSIdentification agNSIdentification = ( AgNSIdentification ) theEObject;
            T result = caseAgNSIdentification( agNSIdentification );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_PRESENCE_CONDITION: {
            AgPresenceCondition agPresenceCondition = ( AgPresenceCondition ) theEObject;
            T result = caseAgPresenceCondition( agPresenceCondition );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS: {
            AgPresenceConditionDerivedStatistics agPresenceConditionDerivedStatistics = ( AgPresenceConditionDerivedStatistics ) theEObject;
            T result = caseAgPresenceConditionDerivedStatistics( agPresenceConditionDerivedStatistics );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_ARRAY: {
            AgArray agArray = ( AgArray ) theEObject;
            T result = caseAgArray( agArray );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_TRG_OP: {
            AgTrgOp agTrgOp = ( AgTrgOp ) theEObject;
            T result = caseAgTrgOp( agTrgOp );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_ATTRIBUTE_TYPE: {
            AgAttributeType agAttributeType = ( AgAttributeType ) theEObject;
            T result = caseAgAttributeType( agAttributeType );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES: {
            AgAttributeTypeAndValues agAttributeTypeAndValues = ( AgAttributeTypeAndValues ) theEObject;
            T result = caseAgAttributeTypeAndValues( agAttributeTypeAndValues );
            if( result == null ) {
                result = caseAgAttributeType( agAttributeTypeAndValues );
            }
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_UNDERLYING_TYPE: {
            AgUnderlyingType agUnderlyingType = ( AgUnderlyingType ) theEObject;
            T result = caseAgUnderlyingType( agUnderlyingType );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_UML: {
            AgUML agUML = ( AgUML ) theEObject;
            T result = caseAgUML( agUML );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_NSDESC: {
            AgNSdesc agNSdesc = ( AgNSdesc ) theEObject;
            T result = caseAgNSdesc( agNSdesc );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.AG_NSD_IDENTIFICATION: {
            AgNSDIdentification agNSDIdentification = ( AgNSDIdentification ) theEObject;
            T result = caseAgNSDIdentification( agNSDIdentification );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
            return result;
        }
        case NsdPackage.IRISE_CLIPSE_CONSOLE: {
            IRiseClipseConsole iRiseClipseConsole = ( IRiseClipseConsole ) theEObject;
            T result = caseIRiseClipseConsole( iRiseClipseConsole );
            if( result == null ) {
                result = defaultCase( theEObject );
            }
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
     * Returns the result of interpreting the object as an instance of '<em>Depends On</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Depends On</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDependsOn( DependsOn object ) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abbreviation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbbreviation( Abbreviation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abbreviations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abbreviations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbbreviations( Abbreviations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract LN Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract LN Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractLNClass( AbstractLNClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Any LN Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Any LN Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnyLNClass( AnyLNClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Applicable Service NS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Applicable Service NS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplicableServiceNS( ApplicableServiceNS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Applicable Services</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplicableServices( ApplicableServices object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicType( BasicType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Types</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Types</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicTypes( BasicTypes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CDC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CDC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCDC( CDC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CD Cs</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CD Cs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCDCs( CDCs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Changes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Changes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChanges( Changes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constructed Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstructedAttribute( ConstructedAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constructed Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstructedAttributes( ConstructedAttributes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Copyrighted</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Copyrighted</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCopyrighted( Copyrighted object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Copyright Notice</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Copyright Notice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCopyrightNotice( CopyrightNotice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataAttribute( DataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataObject( DataObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set Member Of</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set Member Of</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSetMemberOf( DataSetMemberOf object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Doc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Doc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoc( Doc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Documented Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documented Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentedClass( DocumentedClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumeration( Enumeration object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumerations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumerations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerations( Enumerations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalConstraint( FunctionalConstraint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Functional Constraints</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Functional Constraints</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionalConstraints( FunctionalConstraints object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>License</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>License</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLicense( License object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteral( Literal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LN Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LN Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNClass( LNClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LN Classes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNClasses( LNClasses object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Notice</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Notice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNotice( Notice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>NS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>NS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNS( NS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>NS Doc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>NS Doc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNSDoc( NSDoc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Presence Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Presence Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePresenceCondition( PresenceCondition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Presence Conditions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Presence Conditions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePresenceConditions( PresenceConditions object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service CDC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service CDC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceCDC( ServiceCDC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service CD Cs</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service CD Cs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceCDCs( ServiceCDCs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Constructed Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceConstructedAttribute( ServiceConstructedAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Constructed Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceConstructedAttributes( ServiceConstructedAttributes object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceDataAttribute( ServiceDataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service NS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service NS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceNS( ServiceNS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Ns Usage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Ns Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceNsUsage( ServiceNsUsage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceParameter( ServiceParameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Type Realizations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Type Realizations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceTypeRealizations( ServiceTypeRealizations object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubDataAttribute( SubDataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Data Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Data Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubDataObject( SubDataObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Titled Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Titled Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTitledClass( TitledClass object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNsdObject( NsdObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag NS Identification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag NS Identification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgNSIdentification( AgNSIdentification object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Presence Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Presence Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgPresenceCondition( AgPresenceCondition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Presence Condition Derived Statistics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Presence Condition Derived Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgPresenceConditionDerivedStatistics( AgPresenceConditionDerivedStatistics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgArray( AgArray object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Trg Op</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Trg Op</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgTrgOp( AgTrgOp object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Attribute Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Attribute Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgAttributeType( AgAttributeType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Attribute Type And Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Attribute Type And Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgAttributeTypeAndValues( AgAttributeTypeAndValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag Underlying Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag Underlying Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgUnderlyingType( AgUnderlyingType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag UML</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag UML</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgUML( AgUML object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag NSdesc</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag NSdesc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgNSdesc( AgNSdesc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ag NSD Identification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ag NSD Identification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgNSDIdentification( AgNSDIdentification object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IRise Clipse Console</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IRise Clipse Console</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIRiseClipseConsole( IRiseClipseConsole object ) {
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
