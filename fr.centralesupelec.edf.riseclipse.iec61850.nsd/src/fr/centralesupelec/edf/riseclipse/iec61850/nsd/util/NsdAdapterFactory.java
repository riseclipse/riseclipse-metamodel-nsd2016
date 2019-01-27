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
        public Adapter caseAbbreviation( Abbreviation object ) {
            return createAbbreviationAdapter();
        }

        @Override
        public Adapter caseAbbreviations( Abbreviations object ) {
            return createAbbreviationsAdapter();
        }

        @Override
        public Adapter caseAbstractLNClass( AbstractLNClass object ) {
            return createAbstractLNClassAdapter();
        }

        @Override
        public Adapter caseAnyLNClass( AnyLNClass object ) {
            return createAnyLNClassAdapter();
        }

        @Override
        public Adapter caseApplicableServiceNS( ApplicableServiceNS object ) {
            return createApplicableServiceNSAdapter();
        }

        @Override
        public Adapter caseApplicableServices( ApplicableServices object ) {
            return createApplicableServicesAdapter();
        }

        @Override
        public Adapter caseBasicType( BasicType object ) {
            return createBasicTypeAdapter();
        }

        @Override
        public Adapter caseBasicTypes( BasicTypes object ) {
            return createBasicTypesAdapter();
        }

        @Override
        public Adapter caseCDC( CDC object ) {
            return createCDCAdapter();
        }

        @Override
        public Adapter caseCDCs( CDCs object ) {
            return createCDCsAdapter();
        }

        @Override
        public Adapter caseChanges( Changes object ) {
            return createChangesAdapter();
        }

        @Override
        public Adapter caseConstructedAttribute( ConstructedAttribute object ) {
            return createConstructedAttributeAdapter();
        }

        @Override
        public Adapter caseConstructedAttributes( ConstructedAttributes object ) {
            return createConstructedAttributesAdapter();
        }

        @Override
        public Adapter caseCopyrighted( Copyrighted object ) {
            return createCopyrightedAdapter();
        }

        @Override
        public Adapter caseCopyrightNotice( CopyrightNotice object ) {
            return createCopyrightNoticeAdapter();
        }

        @Override
        public Adapter caseDataAttribute( DataAttribute object ) {
            return createDataAttributeAdapter();
        }

        @Override
        public Adapter caseDataObject( DataObject object ) {
            return createDataObjectAdapter();
        }

        @Override
        public Adapter caseDataSetMemberOf( DataSetMemberOf object ) {
            return createDataSetMemberOfAdapter();
        }

        @Override
        public Adapter caseDoc( Doc object ) {
            return createDocAdapter();
        }

        @Override
        public Adapter caseDocumentedClass( DocumentedClass object ) {
            return createDocumentedClassAdapter();
        }

        @Override
        public Adapter caseEnumeration( Enumeration object ) {
            return createEnumerationAdapter();
        }

        @Override
        public Adapter caseEnumerations( Enumerations object ) {
            return createEnumerationsAdapter();
        }

        @Override
        public Adapter caseFunctionalConstraint( FunctionalConstraint object ) {
            return createFunctionalConstraintAdapter();
        }

        @Override
        public Adapter caseFunctionalConstraints( FunctionalConstraints object ) {
            return createFunctionalConstraintsAdapter();
        }

        @Override
        public Adapter caseLicense( License object ) {
            return createLicenseAdapter();
        }

        @Override
        public Adapter caseLiteral( Literal object ) {
            return createLiteralAdapter();
        }

        @Override
        public Adapter caseLNClass( LNClass object ) {
            return createLNClassAdapter();
        }

        @Override
        public Adapter caseLNClasses( LNClasses object ) {
            return createLNClassesAdapter();
        }

        @Override
        public Adapter caseNotice( Notice object ) {
            return createNoticeAdapter();
        }

        @Override
        public Adapter caseNS( NS object ) {
            return createNSAdapter();
        }

        @Override
        public Adapter caseNSDoc( NSDoc object ) {
            return createNSDocAdapter();
        }

        @Override
        public Adapter casePresenceCondition( PresenceCondition object ) {
            return createPresenceConditionAdapter();
        }

        @Override
        public Adapter casePresenceConditions( PresenceConditions object ) {
            return createPresenceConditionsAdapter();
        }

        @Override
        public Adapter caseServiceCDC( ServiceCDC object ) {
            return createServiceCDCAdapter();
        }

        @Override
        public Adapter caseServiceCDCs( ServiceCDCs object ) {
            return createServiceCDCsAdapter();
        }

        @Override
        public Adapter caseServiceConstructedAttribute( ServiceConstructedAttribute object ) {
            return createServiceConstructedAttributeAdapter();
        }

        @Override
        public Adapter caseServiceConstructedAttributes( ServiceConstructedAttributes object ) {
            return createServiceConstructedAttributesAdapter();
        }

        @Override
        public Adapter caseServiceDataAttribute( ServiceDataAttribute object ) {
            return createServiceDataAttributeAdapter();
        }

        @Override
        public Adapter caseServiceNS( ServiceNS object ) {
            return createServiceNSAdapter();
        }

        @Override
        public Adapter caseServiceNsUsage( ServiceNsUsage object ) {
            return createServiceNsUsageAdapter();
        }

        @Override
        public Adapter caseServiceParameter( ServiceParameter object ) {
            return createServiceParameterAdapter();
        }

        @Override
        public Adapter caseServiceTypeRealization( ServiceTypeRealization object ) {
            return createServiceTypeRealizationAdapter();
        }

        @Override
        public Adapter caseServiceTypeRealizations( ServiceTypeRealizations object ) {
            return createServiceTypeRealizationsAdapter();
        }

        @Override
        public Adapter caseSubDataAttribute( SubDataAttribute object ) {
            return createSubDataAttributeAdapter();
        }

        @Override
        public Adapter caseSubDataObject( SubDataObject object ) {
            return createSubDataObjectAdapter();
        }

        @Override
        public Adapter caseTitledClass( TitledClass object ) {
            return createTitledClassAdapter();
        }

        @Override
        public Adapter caseNSDObjectWithVersionAndRelease( NSDObjectWithVersionAndRelease object ) {
            return createNSDObjectWithVersionAndReleaseAdapter();
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
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation
     * @generated
     */
    public Adapter createAbbreviationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations
     * @generated
     */
    public Adapter createAbbreviationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass <em>Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass
     * @generated
     */
    public Adapter createAbstractLNClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass <em>Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass
     * @generated
     */
    public Adapter createAnyLNClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS <em>Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS
     * @generated
     */
    public Adapter createApplicableServiceNSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices
     * @generated
     */
    public Adapter createApplicableServicesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType
     * @generated
     */
    public Adapter createBasicTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes
     * @generated
     */
    public Adapter createBasicTypesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC
     * @generated
     */
    public Adapter createCDCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs
     * @generated
     */
    public Adapter createCDCsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes
     * @generated
     */
    public Adapter createChangesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute
     * @generated
     */
    public Adapter createConstructedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes
     * @generated
     */
    public Adapter createConstructedAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted <em>Copyrighted</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted
     * @generated
     */
    public Adapter createCopyrightedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice <em>Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice
     * @generated
     */
    public Adapter createCopyrightNoticeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute
     * @generated
     */
    public Adapter createDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject
     * @generated
     */
    public Adapter createDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf
     * @generated
     */
    public Adapter createDataSetMemberOfAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc
     * @generated
     */
    public Adapter createDocAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass <em>Documented Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass
     * @generated
     */
    public Adapter createDocumentedClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration
     * @generated
     */
    public Adapter createEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations
     * @generated
     */
    public Adapter createEnumerationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint
     * @generated
     */
    public Adapter createFunctionalConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints
     * @generated
     */
    public Adapter createFunctionalConstraintsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License <em>License</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License
     * @generated
     */
    public Adapter createLicenseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal
     * @generated
     */
    public Adapter createLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass
     * @generated
     */
    public Adapter createLNClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses
     * @generated
     */
    public Adapter createLNClassesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice <em>Notice</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice
     * @generated
     */
    public Adapter createNoticeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS
     * @generated
     */
    public Adapter createNSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc
     * @generated
     */
    public Adapter createNSDocAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition
     * @generated
     */
    public Adapter createPresenceConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions
     * @generated
     */
    public Adapter createPresenceConditionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC
     * @generated
     */
    public Adapter createServiceCDCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs
     * @generated
     */
    public Adapter createServiceCDCsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute
     * @generated
     */
    public Adapter createServiceConstructedAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes <em>Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes
     * @generated
     */
    public Adapter createServiceConstructedAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute
     * @generated
     */
    public Adapter createServiceDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS
     * @generated
     */
    public Adapter createServiceNSAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage
     * @generated
     */
    public Adapter createServiceNsUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter <em>Service Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter
     * @generated
     */
    public Adapter createServiceParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization
     * @generated
     */
    public Adapter createServiceTypeRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations
     * @generated
     */
    public Adapter createServiceTypeRealizationsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute
     * @generated
     */
    public Adapter createSubDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject
     * @generated
     */
    public Adapter createSubDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass <em>Titled Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass
     * @generated
     */
    public Adapter createTitledClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDObjectWithVersionAndRelease <em>NSD Object With Version And Release</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDObjectWithVersionAndRelease
     * @generated
     */
    public Adapter createNSDObjectWithVersionAndReleaseAdapter() {
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
