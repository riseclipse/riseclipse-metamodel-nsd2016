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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage
 * @generated
 */
public class NsdAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static NsdPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NsdAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = NsdPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ( ( EObject ) object ).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NsdSwitch< Adapter > modelSwitch = new NsdSwitch< Adapter >() {
        @Override
        public Adapter caseAppliesToType( AppliesToType object ) {
            return createAppliesToTypeAdapter();
        }

        @Override
        public Adapter caseDependsOnType( DependsOnType object ) {
            return createDependsOnTypeAdapter();
        }

        @Override
        public Adapter caseDocumentRoot( DocumentRoot object ) {
            return createDocumentRootAdapter();
        }

        @Override
        public Adapter caseServiceType( ServiceType object ) {
            return createServiceTypeAdapter();
        }

        @Override
        public Adapter caseTAbbreviation( TAbbreviation object ) {
            return createTAbbreviationAdapter();
        }

        @Override
        public Adapter caseTAbbreviations( TAbbreviations object ) {
            return createTAbbreviationsAdapter();
        }

        @Override
        public Adapter caseTAbstractLNClass( TAbstractLNClass object ) {
            return createTAbstractLNClassAdapter();
        }

        @Override
        public Adapter caseTAnyLNClass( TAnyLNClass object ) {
            return createTAnyLNClassAdapter();
        }

        @Override
        public Adapter caseTApplicableServiceNS( TApplicableServiceNS object ) {
            return createTApplicableServiceNSAdapter();
        }

        @Override
        public Adapter caseTApplicableServices( TApplicableServices object ) {
            return createTApplicableServicesAdapter();
        }

        @Override
        public Adapter caseTBasicType( TBasicType object ) {
            return createTBasicTypeAdapter();
        }

        @Override
        public Adapter caseTBasicTypes( TBasicTypes object ) {
            return createTBasicTypesAdapter();
        }

        @Override
        public Adapter caseTCDC( TCDC object ) {
            return createTCDCAdapter();
        }

        @Override
        public Adapter caseTCDCs( TCDCs object ) {
            return createTCDCsAdapter();
        }

        @Override
        public Adapter caseTChanges( TChanges object ) {
            return createTChangesAdapter();
        }

        @Override
        public Adapter caseTConstructedAttribute( TConstructedAttribute object ) {
            return createTConstructedAttributeAdapter();
        }

        @Override
        public Adapter caseTConstructedAttributes( TConstructedAttributes object ) {
            return createTConstructedAttributesAdapter();
        }

        @Override
        public Adapter caseTCopyrighted( TCopyrighted object ) {
            return createTCopyrightedAdapter();
        }

        @Override
        public Adapter caseTCopyrightNotice( TCopyrightNotice object ) {
            return createTCopyrightNoticeAdapter();
        }

        @Override
        public Adapter caseTDataAttribute( TDataAttribute object ) {
            return createTDataAttributeAdapter();
        }

        @Override
        public Adapter caseTDataObject( TDataObject object ) {
            return createTDataObjectAdapter();
        }

        @Override
        public Adapter caseTDataSetMemberOf( TDataSetMemberOf object ) {
            return createTDataSetMemberOfAdapter();
        }

        @Override
        public Adapter caseTDoc( TDoc object ) {
            return createTDocAdapter();
        }

        @Override
        public Adapter caseTDocumentedClass( TDocumentedClass object ) {
            return createTDocumentedClassAdapter();
        }

        @Override
        public Adapter caseTEnumeration( TEnumeration object ) {
            return createTEnumerationAdapter();
        }

        @Override
        public Adapter caseTEnumerations( TEnumerations object ) {
            return createTEnumerationsAdapter();
        }

        @Override
        public Adapter caseTFunctionalConstraint( TFunctionalConstraint object ) {
            return createTFunctionalConstraintAdapter();
        }

        @Override
        public Adapter caseTFunctionalConstraints( TFunctionalConstraints object ) {
            return createTFunctionalConstraintsAdapter();
        }

        @Override
        public Adapter caseTLicense( TLicense object ) {
            return createTLicenseAdapter();
        }

        @Override
        public Adapter caseTLiteral( TLiteral object ) {
            return createTLiteralAdapter();
        }

        @Override
        public Adapter caseTLNClass( TLNClass object ) {
            return createTLNClassAdapter();
        }

        @Override
        public Adapter caseTLNClasses( TLNClasses object ) {
            return createTLNClassesAdapter();
        }

        @Override
        public Adapter caseTNotice( TNotice object ) {
            return createTNoticeAdapter();
        }

        @Override
        public Adapter caseTNS( TNS object ) {
            return createTNSAdapter();
        }

        @Override
        public Adapter caseTNSDoc( TNSDoc object ) {
            return createTNSDocAdapter();
        }

        @Override
        public Adapter caseTPresenceCondition( TPresenceCondition object ) {
            return createTPresenceConditionAdapter();
        }

        @Override
        public Adapter caseTPresenceConditions( TPresenceConditions object ) {
            return createTPresenceConditionsAdapter();
        }

        @Override
        public Adapter caseTServiceCDC( TServiceCDC object ) {
            return createTServiceCDCAdapter();
        }

        @Override
        public Adapter caseTServiceCDCs( TServiceCDCs object ) {
            return createTServiceCDCsAdapter();
        }

        @Override
        public Adapter caseTServiceConstructedAttribute( TServiceConstructedAttribute object ) {
            return createTServiceConstructedAttributeAdapter();
        }

        @Override
        public Adapter caseTServiceConstructedAttributes( TServiceConstructedAttributes object ) {
            return createTServiceConstructedAttributesAdapter();
        }

        @Override
        public Adapter caseTServiceDataAttribute( TServiceDataAttribute object ) {
            return createTServiceDataAttributeAdapter();
        }

        @Override
        public Adapter caseTServiceNS( TServiceNS object ) {
            return createTServiceNSAdapter();
        }

        @Override
        public Adapter caseTServiceNsUsage( TServiceNsUsage object ) {
            return createTServiceNsUsageAdapter();
        }

        @Override
        public Adapter caseTServiceParameter( TServiceParameter object ) {
            return createTServiceParameterAdapter();
        }

        @Override
        public Adapter caseTServiceTypeRealization( TServiceTypeRealization object ) {
            return createTServiceTypeRealizationAdapter();
        }

        @Override
        public Adapter caseTServiceTypeRealizations( TServiceTypeRealizations object ) {
            return createTServiceTypeRealizationsAdapter();
        }

        @Override
        public Adapter caseTSubDataAttribute( TSubDataAttribute object ) {
            return createTSubDataAttributeAdapter();
        }

        @Override
        public Adapter caseTSubDataObject( TSubDataObject object ) {
            return createTSubDataObjectAdapter();
        }

        @Override
        public Adapter caseTTitledClass( TTitledClass object ) {
            return createTTitledClassAdapter();
        }

        @Override
        public Adapter defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter( Notifier target ) {
        return modelSwitch.doSwitch( ( EObject ) target );
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType <em>Applies To Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType
     * @generated
     */
    public Adapter createAppliesToTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType <em>Depends On Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType
     * @generated
     */
    public Adapter createDependsOnTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType <em>Service Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType
     * @generated
     */
    public Adapter createServiceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation <em>TAbbreviation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation
     * @generated
     */
    public Adapter createTAbbreviationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations <em>TAbbreviations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations
     * @generated
     */
    public Adapter createTAbbreviationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass <em>TAbstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass
     * @generated
     */
    public Adapter createTAbstractLNClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass <em>TAny LN Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass
     * @generated
     */
    public Adapter createTAnyLNClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS <em>TApplicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS
     * @generated
     */
    public Adapter createTApplicableServiceNSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices <em>TApplicable Services</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices
     * @generated
     */
    public Adapter createTApplicableServicesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType <em>TBasic Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType
     * @generated
     */
    public Adapter createTBasicTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes <em>TBasic Types</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes
     * @generated
     */
    public Adapter createTBasicTypesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC <em>TCDC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC
     * @generated
     */
    public Adapter createTCDCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs <em>TCD Cs</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs
     * @generated
     */
    public Adapter createTCDCsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges <em>TChanges</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges
     * @generated
     */
    public Adapter createTChangesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute <em>TConstructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute
     * @generated
     */
    public Adapter createTConstructedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes <em>TConstructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes
     * @generated
     */
    public Adapter createTConstructedAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted <em>TCopyrighted</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted
     * @generated
     */
    public Adapter createTCopyrightedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice <em>TCopyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice
     * @generated
     */
    public Adapter createTCopyrightNoticeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute <em>TData Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute
     * @generated
     */
    public Adapter createTDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject <em>TData Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject
     * @generated
     */
    public Adapter createTDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf <em>TData Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf
     * @generated
     */
    public Adapter createTDataSetMemberOfAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc <em>TDoc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc
     * @generated
     */
    public Adapter createTDocAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass <em>TDocumented Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass
     * @generated
     */
    public Adapter createTDocumentedClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration <em>TEnumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration
     * @generated
     */
    public Adapter createTEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations <em>TEnumerations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations
     * @generated
     */
    public Adapter createTEnumerationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint <em>TFunctional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint
     * @generated
     */
    public Adapter createTFunctionalConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints <em>TFunctional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints
     * @generated
     */
    public Adapter createTFunctionalConstraintsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense <em>TLicense</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense
     * @generated
     */
    public Adapter createTLicenseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral <em>TLiteral</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral
     * @generated
     */
    public Adapter createTLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass <em>TLN Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass
     * @generated
     */
    public Adapter createTLNClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses <em>TLN Classes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses
     * @generated
     */
    public Adapter createTLNClassesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice <em>TNotice</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice
     * @generated
     */
    public Adapter createTNoticeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS <em>TNS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS
     * @generated
     */
    public Adapter createTNSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc <em>TNS Doc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc
     * @generated
     */
    public Adapter createTNSDocAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition <em>TPresence Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition
     * @generated
     */
    public Adapter createTPresenceConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions <em>TPresence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions
     * @generated
     */
    public Adapter createTPresenceConditionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC <em>TService CDC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC
     * @generated
     */
    public Adapter createTServiceCDCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs <em>TService CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs
     * @generated
     */
    public Adapter createTServiceCDCsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute <em>TService Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute
     * @generated
     */
    public Adapter createTServiceConstructedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes <em>TService Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes
     * @generated
     */
    public Adapter createTServiceConstructedAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute <em>TService Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute
     * @generated
     */
    public Adapter createTServiceDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS <em>TService NS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS
     * @generated
     */
    public Adapter createTServiceNSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage <em>TService Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage
     * @generated
     */
    public Adapter createTServiceNsUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter <em>TService Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter
     * @generated
     */
    public Adapter createTServiceParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization <em>TService Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization
     * @generated
     */
    public Adapter createTServiceTypeRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations <em>TService Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations
     * @generated
     */
    public Adapter createTServiceTypeRealizationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute <em>TSub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute
     * @generated
     */
    public Adapter createTSubDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject <em>TSub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject
     * @generated
     */
    public Adapter createTSubDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass <em>TTitled Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass
     * @generated
     */
    public Adapter createTTitledClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //NsdAdapterFactory
