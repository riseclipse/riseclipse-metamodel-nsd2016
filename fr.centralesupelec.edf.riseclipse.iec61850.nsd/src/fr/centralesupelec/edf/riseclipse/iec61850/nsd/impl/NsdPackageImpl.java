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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdValidator;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NsdPackageImpl extends EPackageImpl implements NsdPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass appliesToTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dependsOnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abbreviationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abbreviationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractLNClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anyLNClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicableServiceNSEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicableServicesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass basicTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass basicTypesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cdcEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cdCsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass changesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constructedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constructedAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass copyrightedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass copyrightNoticeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataSetMemberOfEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass docEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentedClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionalConstraintsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass licenseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lnClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lnClassesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass noticeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nsDocEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass presenceConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass presenceConditionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceCDCEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceCDCsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceConstructedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceConstructedAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceDataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceNSEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceNsUsageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceTypeRealizationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subDataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subDataObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass titledClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nsdObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agNSIdentificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agPresenceConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agPresenceConditionDerivedStatisticsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agTrgOpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agAttributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agAttributeTypeAndValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agUnderlyingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agUMLEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass agNSdescEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iRiseClipseConsoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum acsiServicesKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum cbKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum definedAttributeTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum licenseKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum pubStageEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum undefinedAttributeTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType acsiServicesKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType attributeTypeKindEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType cbKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType definedAttributeTypeKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType licenseKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType pubStageObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType undefinedAttributeTypeKindObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private NsdPackageImpl() {
        super( eNS_URI, NsdFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link NsdPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static NsdPackage init() {
        if( isInited ) return ( NsdPackage ) EPackage.Registry.INSTANCE.getEPackage( NsdPackage.eNS_URI );

        // Obtain or create and register package
        Object registeredNsdPackage = EPackage.Registry.INSTANCE.get( eNS_URI );
        NsdPackageImpl theNsdPackage = registeredNsdPackage instanceof NsdPackageImpl
                ? ( NsdPackageImpl ) registeredNsdPackage
                : new NsdPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theNsdPackage.createPackageContents();

        // Initialize created meta-data
        theNsdPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put( theNsdPackage,
                new EValidator.Descriptor() {
                    @Override
                    public EValidator getEValidator() {
                        return NsdValidator.INSTANCE;
                    }
                } );

        // Mark meta-data to indicate it can't be changed
        theNsdPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put( NsdPackage.eNS_URI, theNsdPackage );
        return theNsdPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAppliesToType() {
        return appliesToTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAppliesToType_ParentServiceNsUsage() {
        return ( EReference ) appliesToTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDependsOn() {
        return dependsOnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDependsOn_ParentNS() {
        return ( EReference ) dependsOnEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDependsOn_RefersToNS() {
        return ( EReference ) dependsOnEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDocumentRoot_Mixed() {
        return ( EAttribute ) documentRootEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_XSISchemaLocation() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_ApplicableServiceNS() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_NS() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_NSDoc() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_ServiceNS() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceType() {
        return serviceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceType_Name() {
        return ( EAttribute ) serviceTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceType_ParentApplicableServices() {
        return ( EReference ) serviceTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getServiceType__NameAttributeRequired__DiagnosticChain_Map() {
        return serviceTypeEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbbreviation() {
        return abbreviationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbbreviation_DescID() {
        return ( EAttribute ) abbreviationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbbreviation_Name() {
        return ( EAttribute ) abbreviationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbbreviation_ParentAbbreviations() {
        return ( EReference ) abbreviationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbbreviation_RefersToDoc() {
        return ( EReference ) abbreviationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAbbreviation__NameAttributeRequired__DiagnosticChain_Map() {
        return abbreviationEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbbreviations() {
        return abbreviationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbbreviations_Abbreviation() {
        return ( EReference ) abbreviationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbbreviations_ParentNS() {
        return ( EReference ) abbreviationsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbbreviations_ParentServiceNS() {
        return ( EReference ) abbreviationsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAbbreviations__UniqueAbbreviation__DiagnosticChain_Map() {
        return abbreviationsEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractLNClass() {
        return abstractLNClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractLNClass_Name() {
        return ( EAttribute ) abstractLNClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractLNClass_ParentLNClasses() {
        return ( EReference ) abstractLNClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractLNClass_ReferredByAnyLNClass() {
        return ( EReference ) abstractLNClassEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAbstractLNClass__NameAttributeRequired__DiagnosticChain_Map() {
        return abstractLNClassEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnyLNClass() {
        return anyLNClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLNClass_DataObject() {
        return ( EReference ) anyLNClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyLNClass_Base() {
        return ( EAttribute ) anyLNClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLNClass_RefersToAbstractLNClass() {
        return ( EReference ) anyLNClassEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnyLNClass__GetName() {
        return anyLNClassEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnyLNClass__GetParentLNClasses() {
        return anyLNClassEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnyLNClass__UniqueDataObject__DiagnosticChain_Map() {
        return anyLNClassEClass.getEOperations().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicableServiceNS() {
        return applicableServiceNSEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicableServiceNS_ServiceNsUsage() {
        return ( EReference ) applicableServiceNSEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplicableServiceNS_Date() {
        return ( EAttribute ) applicableServiceNSEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplicableServiceNS_Version() {
        return ( EAttribute ) applicableServiceNSEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplicableServiceNS__VersionAttributeRequired__DiagnosticChain_Map() {
        return applicableServiceNSEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplicableServiceNS__DateAttributeRequired__DiagnosticChain_Map() {
        return applicableServiceNSEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicableServices() {
        return applicableServicesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicableServices_Service() {
        return ( EReference ) applicableServicesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicableServices_DataSetMemberOf() {
        return ( EReference ) applicableServicesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicableServices_ParentFunctionalConstraint() {
        return ( EReference ) applicableServicesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplicableServices__UniqueDataSetMemberOf__DiagnosticChain_Map() {
        return applicableServicesEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getApplicableServices__UniqueService__DiagnosticChain_Map() {
        return applicableServicesEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBasicType() {
        return basicTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBasicType_DescID() {
        return ( EAttribute ) basicTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBasicType_Name() {
        return ( EAttribute ) basicTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBasicType_ParentBasicTypes() {
        return ( EReference ) basicTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBasicType_ReferredByAttributeType() {
        return ( EReference ) basicTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBasicType_RefersToDoc() {
        return ( EReference ) basicTypeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBasicType_ReferredByUnderlyingType() {
        return ( EReference ) basicTypeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getBasicType__NameAttributeRequired__DiagnosticChain_Map() {
        return basicTypeEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBasicTypes() {
        return basicTypesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBasicTypes_BasicType() {
        return ( EReference ) basicTypesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBasicTypes_ParentNS() {
        return ( EReference ) basicTypesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCDC() {
        return cdcEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDC_SubDataObject() {
        return ( EReference ) cdcEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDC_DataAttribute() {
        return ( EReference ) cdcEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDC_ServiceParameter() {
        return ( EReference ) cdcEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCDC_EnumParameterized() {
        return ( EAttribute ) cdcEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCDC_Name() {
        return ( EAttribute ) cdcEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCDC_Statistics() {
        return ( EAttribute ) cdcEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCDC_TypeKindParameterized() {
        return ( EAttribute ) cdcEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCDC_Variant() {
        return ( EAttribute ) cdcEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDC_ParentCDCs() {
        return ( EReference ) cdcEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDC_ReferredByDataObject() {
        return ( EReference ) cdcEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDC_ReferredBySubDataObject() {
        return ( EReference ) cdcEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCDC__UniqueCDCChild__DiagnosticChain_Map() {
        return cdcEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCDC__NameAttributeRequired__DiagnosticChain_Map() {
        return cdcEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCDCs() {
        return cdCsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDCs_CDC() {
        return ( EReference ) cdCsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCDCs_ParentNS() {
        return ( EReference ) cdCsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCDCs__UniqueCDC__DiagnosticChain_Map() {
        return cdCsEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getChanges() {
        return changesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_ChangesID() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Date() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Revision() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Tissues() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getChanges_ParentNS() {
        return ( EReference ) changesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getChanges_ParentServiceNS() {
        return ( EReference ) changesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Release() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Version() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getChanges__VersionAttributeRequired__DiagnosticChain_Map() {
        return changesEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConstructedAttribute() {
        return constructedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttribute_SubDataAttribute() {
        return ( EReference ) constructedAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConstructedAttribute_Name() {
        return ( EAttribute ) constructedAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttribute_ParentConstructedAttributes() {
        return ( EReference ) constructedAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttribute_ParentServiceTypeRealizations() {
        return ( EReference ) constructedAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttribute_ReferredByAttributeType() {
        return ( EReference ) constructedAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttribute_ReferredByUnderlyingType() {
        return ( EReference ) constructedAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConstructedAttribute__UniqueSubDataAttribute__DiagnosticChain_Map() {
        return constructedAttributeEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConstructedAttribute__NameAttributeRequired__DiagnosticChain_Map() {
        return constructedAttributeEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConstructedAttributes() {
        return constructedAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttributes_ConstructedAttribute() {
        return ( EReference ) constructedAttributesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstructedAttributes_ParentNS() {
        return ( EReference ) constructedAttributesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConstructedAttributes__UniqueConstructedAttribute__DiagnosticChain_Map() {
        return constructedAttributesEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCopyrighted() {
        return copyrightedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCopyrighted_Copyright() {
        return ( EReference ) copyrightedEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCopyrightNotice() {
        return copyrightNoticeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCopyrightNotice_Notice() {
        return ( EReference ) copyrightNoticeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCopyrightNotice_License() {
        return ( EReference ) copyrightNoticeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCopyrightNotice_ParentCopyrighted() {
        return ( EReference ) copyrightNoticeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataAttribute() {
        return dataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Fc() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Name() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ParentCDC() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ReferredBySubDataObjectAsSizeAttribute() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_RefersToFunctionalConstraint() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_RefersToPresenceCondition() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_RefersToSizeAttribute() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_RefersToMaxIndexAttribute() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ReferredByDataAttributeAsSizeAttribute() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ReferredByDataAttributeAsMaxIndexAttribute() {
        return ( EReference ) dataAttributeEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDataAttribute__NameAttributeRequired__DiagnosticChain_Map() {
        return dataAttributeEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDataAttribute__FcAttributeRequired__DiagnosticChain_Map() {
        return dataAttributeEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataObject() {
        return dataObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Name() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Transient() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Type() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObject_ParentAnyLNClass() {
        return ( EReference ) dataObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObject_RefersToCDC() {
        return ( EReference ) dataObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObject_RefersToPresenceCondition() {
        return ( EReference ) dataObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObject_RefersToPresenceConditionDerivedStatistics() {
        return ( EReference ) dataObjectEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDataObject__NameAttributeRequired__DiagnosticChain_Map() {
        return dataObjectEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDataObject__TypeAttributeRequired__DiagnosticChain_Map() {
        return dataObjectEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataSetMemberOf() {
        return dataSetMemberOfEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataSetMemberOf_Cb() {
        return ( EAttribute ) dataSetMemberOfEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataSetMemberOf_ParentApplicableServices() {
        return ( EReference ) dataSetMemberOfEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDataSetMemberOf__CbAttributeRequired__DiagnosticChain_Map() {
        return dataSetMemberOfEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDoc() {
        return docEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDoc_Mixed() {
        return ( EAttribute ) docEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDoc_Group() {
        return ( EAttribute ) docEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDoc_Any() {
        return ( EAttribute ) docEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDoc_Id() {
        return ( EAttribute ) docEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ParentNSDoc() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByAgNSDesc() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByPresenceConditionAsDesc() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByAgPresenceCondition() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByAbbreviation() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByBasicType() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByDocumentedClass() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByFunctionalConstraintAsDesc() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByAgPresenceConditionDerivedStatistics() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByTitledClass() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByFunctionalConstraintAsTitle() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDoc_ReferredByPresenceConditionAsTitle() {
        return ( EReference ) docEClass.getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getDoc__IdAttributeRequired__DiagnosticChain_Map() {
        return docEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDocumentedClass() {
        return documentedClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDocumentedClass_Deprecated() {
        return ( EAttribute ) documentedClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDocumentedClass_DescID() {
        return ( EAttribute ) documentedClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDocumentedClass_Informative() {
        return ( EAttribute ) documentedClassEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentedClass_RefersToDescDoc() {
        return ( EReference ) documentedClassEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumeration() {
        return enumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_Literal() {
        return ( EReference ) enumerationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEnumeration_InheritedFrom() {
        return ( EAttribute ) enumerationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEnumeration_Name() {
        return ( EAttribute ) enumerationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_ParentEnumerations() {
        return ( EReference ) enumerationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_RefersToBaseEnumeration() {
        return ( EReference ) enumerationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_ReferredByEnumerationAsBase() {
        return ( EReference ) enumerationEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_ReferredByAttributeType() {
        return ( EReference ) enumerationEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_ReferredByUnderlyingType() {
        return ( EReference ) enumerationEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getEnumeration__UniqueLiteralName__DiagnosticChain_Map() {
        return enumerationEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getEnumeration__UniqueLiteralVal__DiagnosticChain_Map() {
        return enumerationEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getEnumeration__NameAttributeRequired__DiagnosticChain_Map() {
        return enumerationEClass.getEOperations().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumerations() {
        return enumerationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumerations_Enumeration() {
        return ( EReference ) enumerationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumerations_ParentNS() {
        return ( EReference ) enumerationsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getEnumerations__UniqueEnumeration__DiagnosticChain_Map() {
        return enumerationsEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalConstraint() {
        return functionalConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraint_ApplicableServices() {
        return ( EReference ) functionalConstraintEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalConstraint_Abbreviation() {
        return ( EAttribute ) functionalConstraintEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalConstraint_DescID() {
        return ( EAttribute ) functionalConstraintEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunctionalConstraint_TitleID() {
        return ( EAttribute ) functionalConstraintEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraint_ParentFunctionalConstraints() {
        return ( EReference ) functionalConstraintEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraint_ReferredByDataAttribute() {
        return ( EReference ) functionalConstraintEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraint_RefersToDescDoc() {
        return ( EReference ) functionalConstraintEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraint_RefersToTitleDoc() {
        return ( EReference ) functionalConstraintEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getFunctionalConstraint__AbbreviationAttributeRequired__DiagnosticChain_Map() {
        return functionalConstraintEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunctionalConstraints() {
        return functionalConstraintsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraints_FunctionalConstraint() {
        return ( EReference ) functionalConstraintsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraints_ParentNS() {
        return ( EReference ) functionalConstraintsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunctionalConstraints_ParentServiceNS() {
        return ( EReference ) functionalConstraintsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getFunctionalConstraints__UniqueFunctionalConstraint__DiagnosticChain_Map() {
        return functionalConstraintsEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLicense() {
        return licenseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLicense_Mixed() {
        return ( EAttribute ) licenseEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLicense_Kind() {
        return ( EAttribute ) licenseEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLicense_Uri() {
        return ( EAttribute ) licenseEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLicense_ParentCopyrightNotice() {
        return ( EReference ) licenseEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLiteral() {
        return literalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLiteral_LiteralVal() {
        return ( EAttribute ) literalEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLiteral_Name() {
        return ( EAttribute ) literalEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLiteral_ParentEnumeration() {
        return ( EReference ) literalEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getLiteral__NameAttributeRequired__DiagnosticChain_Map() {
        return literalEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getLiteral__LiteralValAttributeRequired__DiagnosticChain_Map() {
        return literalEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNClass() {
        return lnClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNClass_CanHaveLOG() {
        return ( EAttribute ) lnClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNClass_IsExtension() {
        return ( EAttribute ) lnClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNClass_Name() {
        return ( EAttribute ) lnClassEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNClass_ParentLNClasses() {
        return ( EReference ) lnClassEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getLNClass__NameAttributeRequired__DiagnosticChain_Map() {
        return lnClassEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNClasses() {
        return lnClassesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNClasses_AbstractLNClass() {
        return ( EReference ) lnClassesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNClasses_LNClass() {
        return ( EReference ) lnClassesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNClasses_ParentNS() {
        return ( EReference ) lnClassesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getLNClasses__UniqueLNClass__DiagnosticChain_Map() {
        return lnClassesEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getLNClasses__UniqueAbstractLNClass__DiagnosticChain_Map() {
        return lnClassesEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNotice() {
        return noticeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNotice_Mixed() {
        return ( EAttribute ) noticeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNotice_ParentCopyrightNotice() {
        return ( EReference ) noticeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNS() {
        return nsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_Changes() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_DependsOn() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_BasicTypes() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_FunctionalConstraints() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_PresenceConditions() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_Abbreviations() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_Enumerations() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_ConstructedAttributes() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_CDCs() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_LNClasses() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNS_ReferredByDependsOn() {
        return ( EReference ) nsEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNSDoc() {
        return nsDocEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNSDoc_Doc() {
        return ( EReference ) nsDocEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_Lang() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getNSDoc__LangAttributeRequired__DiagnosticChain_Map() {
        return nsDocEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPresenceCondition() {
        return presenceConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPresenceCondition_Argument() {
        return ( EAttribute ) presenceConditionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPresenceCondition_DescID() {
        return ( EAttribute ) presenceConditionEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPresenceCondition_Name() {
        return ( EAttribute ) presenceConditionEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPresenceCondition_TitleID() {
        return ( EAttribute ) presenceConditionEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_ParentPresenceConditions() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_ReferredByDataObject() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_ReferredByDataObjectForDerivedStatistics() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_ReferredBySubDataObject() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_ReferredByDataAttribute() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_ReferredBySubDataAttribute() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_RefersToDescDoc() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceCondition_RefersToTitleDoc() {
        return ( EReference ) presenceConditionEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getPresenceCondition__NameAttributeRequired__DiagnosticChain_Map() {
        return presenceConditionEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPresenceConditions() {
        return presenceConditionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceConditions_PresenceCondition() {
        return ( EReference ) presenceConditionsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceConditions_ParentNS() {
        return ( EReference ) presenceConditionsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenceConditions_ParentServiceNS() {
        return ( EReference ) presenceConditionsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getPresenceConditions__UniquePresenceCondition__DiagnosticChain_Map() {
        return presenceConditionsEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceCDC() {
        return serviceCDCEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceCDC_ServiceDataAttribute() {
        return ( EReference ) serviceCDCEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceCDC_Cdc() {
        return ( EAttribute ) serviceCDCEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceCDC_Variant() {
        return ( EAttribute ) serviceCDCEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceCDC_ParentServiceCDCs() {
        return ( EReference ) serviceCDCEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getServiceCDC__CdcAttributeRequired__DiagnosticChain_Map() {
        return serviceCDCEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceCDCs() {
        return serviceCDCsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceCDCs_ServiceCDC() {
        return ( EReference ) serviceCDCsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceCDCs_ParentServiceNS() {
        return ( EReference ) serviceCDCsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceConstructedAttribute() {
        return serviceConstructedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceConstructedAttribute_TypeKindParameterized() {
        return ( EAttribute ) serviceConstructedAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceConstructedAttribute_ParentServiceConstructedAttributes() {
        return ( EReference ) serviceConstructedAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceConstructedAttributes() {
        return serviceConstructedAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceConstructedAttributes_ServiceConstructedAttribute() {
        return ( EReference ) serviceConstructedAttributesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceConstructedAttributes_ParentServiceNS() {
        return ( EReference ) serviceConstructedAttributesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceDataAttribute() {
        return serviceDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_Fc() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_Name() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceDataAttribute_ParentServiceCDC() {
        return ( EReference ) serviceDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getServiceDataAttribute__NameAttributeRequired__DiagnosticChain_Map() {
        return serviceDataAttributeEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getServiceDataAttribute__FcAttributeRequired__DiagnosticChain_Map() {
        return serviceDataAttributeEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceNS() {
        return serviceNSEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_Changes() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_FunctionalConstraints() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_PresenceConditions() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_Abbreviations() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_ServiceTypeRealizations() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_ServiceConstructedAttributes() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNS_ServiceCDCs() {
        return ( EReference ) serviceNSEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceNsUsage() {
        return serviceNsUsageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNsUsage_AppliesTo() {
        return ( EReference ) serviceNsUsageEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceNsUsage_ParentApplicableServiceNS() {
        return ( EReference ) serviceNsUsageEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceParameter() {
        return serviceParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameter_Name() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceParameter_ParentCDC() {
        return ( EReference ) serviceParameterEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getServiceParameter__NameAttributeRequired__DiagnosticChain_Map() {
        return serviceParameterEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceTypeRealizations() {
        return serviceTypeRealizationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceTypeRealizations_ServiceTypeRealization() {
        return ( EReference ) serviceTypeRealizationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceTypeRealizations_ParentServiceNS() {
        return ( EReference ) serviceTypeRealizationsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubDataAttribute() {
        return subDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_Name() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataAttribute_ParentConstructedAttribute() {
        return ( EReference ) subDataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataAttribute_RefersToPresenceCondition() {
        return ( EReference ) subDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSubDataAttribute__NameAttributeRequired__DiagnosticChain_Map() {
        return subDataAttributeEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubDataObject() {
        return subDataObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_Name() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_Type() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataObject_ParentCDC() {
        return ( EReference ) subDataObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataObject_RefersToCDC() {
        return ( EReference ) subDataObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataObject_RefersToPresenceCondition() {
        return ( EReference ) subDataObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataObject_RefersToSizeAttribute() {
        return ( EReference ) subDataObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubDataObject_RefersToMaxIndexAttribute() {
        return ( EReference ) subDataObjectEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSubDataObject__NameAttributeRequired__DiagnosticChain_Map() {
        return subDataObjectEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSubDataObject__TypeAttributeRequired__DiagnosticChain_Map() {
        return subDataObjectEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTitledClass() {
        return titledClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTitledClass_TitleID() {
        return ( EAttribute ) titledClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTitledClass_RefersToTitleDoc() {
        return ( EReference ) titledClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTitledClass__TitleIDAttributeRequired__DiagnosticChain_Map() {
        return titledClassEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNsdObject() {
        return nsdObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNsdObject_LineNumber() {
        return ( EAttribute ) nsdObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNsdObject_ExplicitLinksBuilt() {
        return ( EAttribute ) nsdObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getNsdObject__BuildExplicitLinks__IRiseClipseConsole() {
        return nsdObjectEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgNSIdentification() {
        return agNSIdentificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgNSIdentification_Release() {
        return ( EAttribute ) agNSIdentificationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgNSIdentification_Version() {
        return ( EAttribute ) agNSIdentificationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgNSIdentification_Id() {
        return ( EAttribute ) agNSIdentificationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgNSIdentification_Revision() {
        return ( EAttribute ) agNSIdentificationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgNSIdentification_PublicationStage() {
        return ( EAttribute ) agNSIdentificationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAgNSIdentification__IdAttributeRequired__DiagnosticChain_Map() {
        return agNSIdentificationEClass.getEOperations().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAgNSIdentification__VersionAttributeRequired__DiagnosticChain_Map() {
        return agNSIdentificationEClass.getEOperations().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgPresenceCondition() {
        return agPresenceConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgPresenceCondition_PresCond() {
        return ( EAttribute ) agPresenceConditionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgPresenceCondition_PresCondArgs() {
        return ( EAttribute ) agPresenceConditionEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgPresenceCondition_PresCondArgsID() {
        return ( EAttribute ) agPresenceConditionEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgPresenceCondition_RefersToPresCondArgsDoc() {
        return ( EReference ) agPresenceConditionEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgPresenceConditionDerivedStatistics() {
        return agPresenceConditionDerivedStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgPresenceConditionDerivedStatistics_DsPresCond() {
        return ( EAttribute ) agPresenceConditionDerivedStatisticsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgPresenceConditionDerivedStatistics_DsPresCondArgs() {
        return ( EAttribute ) agPresenceConditionDerivedStatisticsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgPresenceConditionDerivedStatistics_DsPresCondArgsID() {
        return ( EAttribute ) agPresenceConditionDerivedStatisticsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgPresenceConditionDerivedStatistics_RefersToDsPresCondArgsDoc() {
        return ( EReference ) agPresenceConditionDerivedStatisticsEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgArray() {
        return agArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgArray_IsArray() {
        return ( EAttribute ) agArrayEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgArray_MaxIndexAttribute() {
        return ( EAttribute ) agArrayEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgArray_MinIndex() {
        return ( EAttribute ) agArrayEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgArray_SizeAttribute() {
        return ( EAttribute ) agArrayEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgTrgOp() {
        return agTrgOpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgTrgOp_Dchg() {
        return ( EAttribute ) agTrgOpEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgTrgOp_Dupd() {
        return ( EAttribute ) agTrgOpEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgTrgOp_Qchg() {
        return ( EAttribute ) agTrgOpEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgAttributeType() {
        return agAttributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgAttributeType_Type() {
        return ( EAttribute ) agAttributeTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgAttributeType_TypeKind() {
        return ( EAttribute ) agAttributeTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgAttributeType_RefersToBasicType() {
        return ( EReference ) agAttributeTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgAttributeType_RefersToConstructedAttribute() {
        return ( EReference ) agAttributeTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgAttributeType_RefersToEnumeration() {
        return ( EReference ) agAttributeTypeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgAttributeTypeAndValues() {
        return agAttributeTypeAndValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgAttributeTypeAndValues_DefaultValue() {
        return ( EAttribute ) agAttributeTypeAndValuesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgAttributeTypeAndValues_MaxValue() {
        return ( EAttribute ) agAttributeTypeAndValuesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgAttributeTypeAndValues_MinValue() {
        return ( EAttribute ) agAttributeTypeAndValuesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgUnderlyingType() {
        return agUnderlyingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgUnderlyingType_UnderlyingType() {
        return ( EAttribute ) agUnderlyingTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgUnderlyingType_UnderlyingTypeKind() {
        return ( EAttribute ) agUnderlyingTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgUnderlyingType_RefersToUnderlyingBasicType() {
        return ( EReference ) agUnderlyingTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgUnderlyingType_RefersToUnderlyingConstructedAttribute() {
        return ( EReference ) agUnderlyingTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgUnderlyingType_RefersToUnderlyingEnumeration() {
        return ( EReference ) agUnderlyingTypeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgUML() {
        return agUMLEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgUML_UmlDate() {
        return ( EAttribute ) agUMLEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgUML_UmlVersion() {
        return ( EAttribute ) agUMLEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAgNSdesc() {
        return agNSdescEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAgNSdesc_DescID() {
        return ( EAttribute ) agNSdescEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAgNSdesc_RefersToDoc() {
        return ( EReference ) agNSdescEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIRiseClipseConsole() {
        return iRiseClipseConsoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getACSIServicesKind() {
        return acsiServicesKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getCBKind() {
        return cbKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDefinedAttributeTypeKind() {
        return definedAttributeTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getLicenseKind() {
        return licenseKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPubStage() {
        return pubStageEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getUndefinedAttributeTypeKind() {
        return undefinedAttributeTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getACSIServicesKindObject() {
        return acsiServicesKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getAttributeTypeKind() {
        return attributeTypeKindEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getCBKindObject() {
        return cbKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getDefinedAttributeTypeKindObject() {
        return definedAttributeTypeKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getLicenseKindObject() {
        return licenseKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getPubStageObject() {
        return pubStageObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getUndefinedAttributeTypeKindObject() {
        return undefinedAttributeTypeKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NsdFactory getNsdFactory() {
        return ( NsdFactory ) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if( isCreated ) return;
        isCreated = true;

        // Create classes and their features
        appliesToTypeEClass = createEClass( APPLIES_TO_TYPE );
        createEReference( appliesToTypeEClass, APPLIES_TO_TYPE__PARENT_SERVICE_NS_USAGE );

        dependsOnEClass = createEClass( DEPENDS_ON );
        createEReference( dependsOnEClass, DEPENDS_ON__PARENT_NS );
        createEReference( dependsOnEClass, DEPENDS_ON__REFERS_TO_NS );

        documentRootEClass = createEClass( DOCUMENT_ROOT );
        createEAttribute( documentRootEClass, DOCUMENT_ROOT__MIXED );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__APPLICABLE_SERVICE_NS );
        createEReference( documentRootEClass, DOCUMENT_ROOT__NS );
        createEReference( documentRootEClass, DOCUMENT_ROOT__NS_DOC );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SERVICE_NS );

        serviceTypeEClass = createEClass( SERVICE_TYPE );
        createEAttribute( serviceTypeEClass, SERVICE_TYPE__NAME );
        createEReference( serviceTypeEClass, SERVICE_TYPE__PARENT_APPLICABLE_SERVICES );
        createEOperation( serviceTypeEClass, SERVICE_TYPE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        abbreviationEClass = createEClass( ABBREVIATION );
        createEAttribute( abbreviationEClass, ABBREVIATION__DESC_ID );
        createEAttribute( abbreviationEClass, ABBREVIATION__NAME );
        createEReference( abbreviationEClass, ABBREVIATION__PARENT_ABBREVIATIONS );
        createEReference( abbreviationEClass, ABBREVIATION__REFERS_TO_DOC );
        createEOperation( abbreviationEClass, ABBREVIATION___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        abbreviationsEClass = createEClass( ABBREVIATIONS );
        createEReference( abbreviationsEClass, ABBREVIATIONS__ABBREVIATION );
        createEReference( abbreviationsEClass, ABBREVIATIONS__PARENT_NS );
        createEReference( abbreviationsEClass, ABBREVIATIONS__PARENT_SERVICE_NS );
        createEOperation( abbreviationsEClass, ABBREVIATIONS___UNIQUE_ABBREVIATION__DIAGNOSTICCHAIN_MAP );

        abstractLNClassEClass = createEClass( ABSTRACT_LN_CLASS );
        createEAttribute( abstractLNClassEClass, ABSTRACT_LN_CLASS__NAME );
        createEReference( abstractLNClassEClass, ABSTRACT_LN_CLASS__PARENT_LN_CLASSES );
        createEReference( abstractLNClassEClass, ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS );
        createEOperation( abstractLNClassEClass, ABSTRACT_LN_CLASS___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        anyLNClassEClass = createEClass( ANY_LN_CLASS );
        createEReference( anyLNClassEClass, ANY_LN_CLASS__DATA_OBJECT );
        createEAttribute( anyLNClassEClass, ANY_LN_CLASS__BASE );
        createEReference( anyLNClassEClass, ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS );
        createEOperation( anyLNClassEClass, ANY_LN_CLASS___GET_NAME );
        createEOperation( anyLNClassEClass, ANY_LN_CLASS___GET_PARENT_LN_CLASSES );
        createEOperation( anyLNClassEClass, ANY_LN_CLASS___UNIQUE_DATA_OBJECT__DIAGNOSTICCHAIN_MAP );

        applicableServiceNSEClass = createEClass( APPLICABLE_SERVICE_NS );
        createEReference( applicableServiceNSEClass, APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE );
        createEAttribute( applicableServiceNSEClass, APPLICABLE_SERVICE_NS__DATE );
        createEAttribute( applicableServiceNSEClass, APPLICABLE_SERVICE_NS__VERSION );
        createEOperation( applicableServiceNSEClass,
                APPLICABLE_SERVICE_NS___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( applicableServiceNSEClass,
                APPLICABLE_SERVICE_NS___DATE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        applicableServicesEClass = createEClass( APPLICABLE_SERVICES );
        createEReference( applicableServicesEClass, APPLICABLE_SERVICES__SERVICE );
        createEReference( applicableServicesEClass, APPLICABLE_SERVICES__DATA_SET_MEMBER_OF );
        createEReference( applicableServicesEClass, APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT );
        createEOperation( applicableServicesEClass,
                APPLICABLE_SERVICES___UNIQUE_DATA_SET_MEMBER_OF__DIAGNOSTICCHAIN_MAP );
        createEOperation( applicableServicesEClass, APPLICABLE_SERVICES___UNIQUE_SERVICE__DIAGNOSTICCHAIN_MAP );

        basicTypeEClass = createEClass( BASIC_TYPE );
        createEAttribute( basicTypeEClass, BASIC_TYPE__DESC_ID );
        createEAttribute( basicTypeEClass, BASIC_TYPE__NAME );
        createEReference( basicTypeEClass, BASIC_TYPE__PARENT_BASIC_TYPES );
        createEReference( basicTypeEClass, BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE );
        createEReference( basicTypeEClass, BASIC_TYPE__REFERS_TO_DOC );
        createEReference( basicTypeEClass, BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE );
        createEOperation( basicTypeEClass, BASIC_TYPE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        basicTypesEClass = createEClass( BASIC_TYPES );
        createEReference( basicTypesEClass, BASIC_TYPES__BASIC_TYPE );
        createEReference( basicTypesEClass, BASIC_TYPES__PARENT_NS );

        cdcEClass = createEClass( CDC );
        createEReference( cdcEClass, CDC__SUB_DATA_OBJECT );
        createEReference( cdcEClass, CDC__DATA_ATTRIBUTE );
        createEReference( cdcEClass, CDC__SERVICE_PARAMETER );
        createEAttribute( cdcEClass, CDC__ENUM_PARAMETERIZED );
        createEAttribute( cdcEClass, CDC__NAME );
        createEAttribute( cdcEClass, CDC__STATISTICS );
        createEAttribute( cdcEClass, CDC__TYPE_KIND_PARAMETERIZED );
        createEAttribute( cdcEClass, CDC__VARIANT );
        createEReference( cdcEClass, CDC__PARENT_CD_CS );
        createEReference( cdcEClass, CDC__REFERRED_BY_DATA_OBJECT );
        createEReference( cdcEClass, CDC__REFERRED_BY_SUB_DATA_OBJECT );
        createEOperation( cdcEClass, CDC___UNIQUE_CDC_CHILD__DIAGNOSTICCHAIN_MAP );
        createEOperation( cdcEClass, CDC___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        cdCsEClass = createEClass( CD_CS );
        createEReference( cdCsEClass, CD_CS__CDC );
        createEReference( cdCsEClass, CD_CS__PARENT_NS );
        createEOperation( cdCsEClass, CD_CS___UNIQUE_CDC__DIAGNOSTICCHAIN_MAP );

        changesEClass = createEClass( CHANGES );
        createEAttribute( changesEClass, CHANGES__CHANGES_ID );
        createEAttribute( changesEClass, CHANGES__DATE );
        createEAttribute( changesEClass, CHANGES__REVISION );
        createEAttribute( changesEClass, CHANGES__TISSUES );
        createEReference( changesEClass, CHANGES__PARENT_NS );
        createEReference( changesEClass, CHANGES__PARENT_SERVICE_NS );
        createEAttribute( changesEClass, CHANGES__RELEASE );
        createEAttribute( changesEClass, CHANGES__VERSION );
        createEOperation( changesEClass, CHANGES___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        constructedAttributeEClass = createEClass( CONSTRUCTED_ATTRIBUTE );
        createEReference( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE );
        createEAttribute( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__NAME );
        createEReference( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTES );
        createEReference( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_TYPE_REALIZATIONS );
        createEReference( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE );
        createEReference( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE );
        createEOperation( constructedAttributeEClass,
                CONSTRUCTED_ATTRIBUTE___UNIQUE_SUB_DATA_ATTRIBUTE__DIAGNOSTICCHAIN_MAP );
        createEOperation( constructedAttributeEClass,
                CONSTRUCTED_ATTRIBUTE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        constructedAttributesEClass = createEClass( CONSTRUCTED_ATTRIBUTES );
        createEReference( constructedAttributesEClass, CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE );
        createEReference( constructedAttributesEClass, CONSTRUCTED_ATTRIBUTES__PARENT_NS );
        createEOperation( constructedAttributesEClass,
                CONSTRUCTED_ATTRIBUTES___UNIQUE_CONSTRUCTED_ATTRIBUTE__DIAGNOSTICCHAIN_MAP );

        copyrightedEClass = createEClass( COPYRIGHTED );
        createEReference( copyrightedEClass, COPYRIGHTED__COPYRIGHT );

        copyrightNoticeEClass = createEClass( COPYRIGHT_NOTICE );
        createEReference( copyrightNoticeEClass, COPYRIGHT_NOTICE__NOTICE );
        createEReference( copyrightNoticeEClass, COPYRIGHT_NOTICE__LICENSE );
        createEReference( copyrightNoticeEClass, COPYRIGHT_NOTICE__PARENT_COPYRIGHTED );

        dataAttributeEClass = createEClass( DATA_ATTRIBUTE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__FC );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__NAME );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__PARENT_CDC );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE );
        createEReference( dataAttributeEClass, DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE );
        createEOperation( dataAttributeEClass, DATA_ATTRIBUTE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( dataAttributeEClass, DATA_ATTRIBUTE___FC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        dataObjectEClass = createEClass( DATA_OBJECT );
        createEAttribute( dataObjectEClass, DATA_OBJECT__NAME );
        createEAttribute( dataObjectEClass, DATA_OBJECT__TRANSIENT );
        createEAttribute( dataObjectEClass, DATA_OBJECT__TYPE );
        createEReference( dataObjectEClass, DATA_OBJECT__PARENT_ANY_LN_CLASS );
        createEReference( dataObjectEClass, DATA_OBJECT__REFERS_TO_CDC );
        createEReference( dataObjectEClass, DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION );
        createEReference( dataObjectEClass, DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS );
        createEOperation( dataObjectEClass, DATA_OBJECT___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( dataObjectEClass, DATA_OBJECT___TYPE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        dataSetMemberOfEClass = createEClass( DATA_SET_MEMBER_OF );
        createEAttribute( dataSetMemberOfEClass, DATA_SET_MEMBER_OF__CB );
        createEReference( dataSetMemberOfEClass, DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES );
        createEOperation( dataSetMemberOfEClass, DATA_SET_MEMBER_OF___CB_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        docEClass = createEClass( DOC );
        createEAttribute( docEClass, DOC__MIXED );
        createEAttribute( docEClass, DOC__GROUP );
        createEAttribute( docEClass, DOC__ANY );
        createEAttribute( docEClass, DOC__ID );
        createEReference( docEClass, DOC__PARENT_NS_DOC );
        createEReference( docEClass, DOC__REFERRED_BY_AG_NS_DESC );
        createEReference( docEClass, DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC );
        createEReference( docEClass, DOC__REFERRED_BY_AG_PRESENCE_CONDITION );
        createEReference( docEClass, DOC__REFERRED_BY_ABBREVIATION );
        createEReference( docEClass, DOC__REFERRED_BY_BASIC_TYPE );
        createEReference( docEClass, DOC__REFERRED_BY_DOCUMENTED_CLASS );
        createEReference( docEClass, DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC );
        createEReference( docEClass, DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS );
        createEReference( docEClass, DOC__REFERRED_BY_TITLED_CLASS );
        createEReference( docEClass, DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE );
        createEReference( docEClass, DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE );
        createEOperation( docEClass, DOC___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        documentedClassEClass = createEClass( DOCUMENTED_CLASS );
        createEAttribute( documentedClassEClass, DOCUMENTED_CLASS__DEPRECATED );
        createEAttribute( documentedClassEClass, DOCUMENTED_CLASS__DESC_ID );
        createEAttribute( documentedClassEClass, DOCUMENTED_CLASS__INFORMATIVE );
        createEReference( documentedClassEClass, DOCUMENTED_CLASS__REFERS_TO_DESC_DOC );

        enumerationEClass = createEClass( ENUMERATION );
        createEReference( enumerationEClass, ENUMERATION__LITERAL );
        createEAttribute( enumerationEClass, ENUMERATION__INHERITED_FROM );
        createEAttribute( enumerationEClass, ENUMERATION__NAME );
        createEReference( enumerationEClass, ENUMERATION__PARENT_ENUMERATIONS );
        createEReference( enumerationEClass, ENUMERATION__REFERS_TO_BASE_ENUMERATION );
        createEReference( enumerationEClass, ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE );
        createEReference( enumerationEClass, ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE );
        createEReference( enumerationEClass, ENUMERATION__REFERRED_BY_UNDERLYING_TYPE );
        createEOperation( enumerationEClass, ENUMERATION___UNIQUE_LITERAL_NAME__DIAGNOSTICCHAIN_MAP );
        createEOperation( enumerationEClass, ENUMERATION___UNIQUE_LITERAL_VAL__DIAGNOSTICCHAIN_MAP );
        createEOperation( enumerationEClass, ENUMERATION___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        enumerationsEClass = createEClass( ENUMERATIONS );
        createEReference( enumerationsEClass, ENUMERATIONS__ENUMERATION );
        createEReference( enumerationsEClass, ENUMERATIONS__PARENT_NS );
        createEOperation( enumerationsEClass, ENUMERATIONS___UNIQUE_ENUMERATION__DIAGNOSTICCHAIN_MAP );

        functionalConstraintEClass = createEClass( FUNCTIONAL_CONSTRAINT );
        createEReference( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES );
        createEAttribute( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__ABBREVIATION );
        createEAttribute( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__DESC_ID );
        createEAttribute( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__TITLE_ID );
        createEReference( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS );
        createEReference( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE );
        createEReference( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC );
        createEReference( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC );
        createEOperation( functionalConstraintEClass,
                FUNCTIONAL_CONSTRAINT___ABBREVIATION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        functionalConstraintsEClass = createEClass( FUNCTIONAL_CONSTRAINTS );
        createEReference( functionalConstraintsEClass, FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT );
        createEReference( functionalConstraintsEClass, FUNCTIONAL_CONSTRAINTS__PARENT_NS );
        createEReference( functionalConstraintsEClass, FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS );
        createEOperation( functionalConstraintsEClass,
                FUNCTIONAL_CONSTRAINTS___UNIQUE_FUNCTIONAL_CONSTRAINT__DIAGNOSTICCHAIN_MAP );

        licenseEClass = createEClass( LICENSE );
        createEAttribute( licenseEClass, LICENSE__MIXED );
        createEAttribute( licenseEClass, LICENSE__KIND );
        createEAttribute( licenseEClass, LICENSE__URI );
        createEReference( licenseEClass, LICENSE__PARENT_COPYRIGHT_NOTICE );

        literalEClass = createEClass( LITERAL );
        createEAttribute( literalEClass, LITERAL__LITERAL_VAL );
        createEAttribute( literalEClass, LITERAL__NAME );
        createEReference( literalEClass, LITERAL__PARENT_ENUMERATION );
        createEOperation( literalEClass, LITERAL___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( literalEClass, LITERAL___LITERAL_VAL_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        lnClassEClass = createEClass( LN_CLASS );
        createEAttribute( lnClassEClass, LN_CLASS__CAN_HAVE_LOG );
        createEAttribute( lnClassEClass, LN_CLASS__IS_EXTENSION );
        createEAttribute( lnClassEClass, LN_CLASS__NAME );
        createEReference( lnClassEClass, LN_CLASS__PARENT_LN_CLASSES );
        createEOperation( lnClassEClass, LN_CLASS___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        lnClassesEClass = createEClass( LN_CLASSES );
        createEReference( lnClassesEClass, LN_CLASSES__ABSTRACT_LN_CLASS );
        createEReference( lnClassesEClass, LN_CLASSES__LN_CLASS );
        createEReference( lnClassesEClass, LN_CLASSES__PARENT_NS );
        createEOperation( lnClassesEClass, LN_CLASSES___UNIQUE_LN_CLASS__DIAGNOSTICCHAIN_MAP );
        createEOperation( lnClassesEClass, LN_CLASSES___UNIQUE_ABSTRACT_LN_CLASS__DIAGNOSTICCHAIN_MAP );

        noticeEClass = createEClass( NOTICE );
        createEAttribute( noticeEClass, NOTICE__MIXED );
        createEReference( noticeEClass, NOTICE__PARENT_COPYRIGHT_NOTICE );

        nsEClass = createEClass( NS );
        createEReference( nsEClass, NS__CHANGES );
        createEReference( nsEClass, NS__DEPENDS_ON );
        createEReference( nsEClass, NS__BASIC_TYPES );
        createEReference( nsEClass, NS__FUNCTIONAL_CONSTRAINTS );
        createEReference( nsEClass, NS__PRESENCE_CONDITIONS );
        createEReference( nsEClass, NS__ABBREVIATIONS );
        createEReference( nsEClass, NS__ENUMERATIONS );
        createEReference( nsEClass, NS__CONSTRUCTED_ATTRIBUTES );
        createEReference( nsEClass, NS__CD_CS );
        createEReference( nsEClass, NS__LN_CLASSES );
        createEReference( nsEClass, NS__REFERRED_BY_DEPENDS_ON );

        nsDocEClass = createEClass( NS_DOC );
        createEReference( nsDocEClass, NS_DOC__DOC );
        createEAttribute( nsDocEClass, NS_DOC__LANG );
        createEOperation( nsDocEClass, NS_DOC___LANG_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        presenceConditionEClass = createEClass( PRESENCE_CONDITION );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__ARGUMENT );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__DESC_ID );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__NAME );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__TITLE_ID );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERS_TO_DESC_DOC );
        createEReference( presenceConditionEClass, PRESENCE_CONDITION__REFERS_TO_TITLE_DOC );
        createEOperation( presenceConditionEClass, PRESENCE_CONDITION___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        presenceConditionsEClass = createEClass( PRESENCE_CONDITIONS );
        createEReference( presenceConditionsEClass, PRESENCE_CONDITIONS__PRESENCE_CONDITION );
        createEReference( presenceConditionsEClass, PRESENCE_CONDITIONS__PARENT_NS );
        createEReference( presenceConditionsEClass, PRESENCE_CONDITIONS__PARENT_SERVICE_NS );
        createEOperation( presenceConditionsEClass,
                PRESENCE_CONDITIONS___UNIQUE_PRESENCE_CONDITION__DIAGNOSTICCHAIN_MAP );

        serviceCDCEClass = createEClass( SERVICE_CDC );
        createEReference( serviceCDCEClass, SERVICE_CDC__SERVICE_DATA_ATTRIBUTE );
        createEAttribute( serviceCDCEClass, SERVICE_CDC__CDC );
        createEAttribute( serviceCDCEClass, SERVICE_CDC__VARIANT );
        createEReference( serviceCDCEClass, SERVICE_CDC__PARENT_SERVICE_CD_CS );
        createEOperation( serviceCDCEClass, SERVICE_CDC___CDC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        serviceCDCsEClass = createEClass( SERVICE_CD_CS );
        createEReference( serviceCDCsEClass, SERVICE_CD_CS__SERVICE_CDC );
        createEReference( serviceCDCsEClass, SERVICE_CD_CS__PARENT_SERVICE_NS );

        serviceConstructedAttributeEClass = createEClass( SERVICE_CONSTRUCTED_ATTRIBUTE );
        createEAttribute( serviceConstructedAttributeEClass, SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED );
        createEReference( serviceConstructedAttributeEClass,
                SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES );

        serviceConstructedAttributesEClass = createEClass( SERVICE_CONSTRUCTED_ATTRIBUTES );
        createEReference( serviceConstructedAttributesEClass,
                SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE );
        createEReference( serviceConstructedAttributesEClass, SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS );

        serviceDataAttributeEClass = createEClass( SERVICE_DATA_ATTRIBUTE );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__FC );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__NAME );
        createEReference( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC );
        createEOperation( serviceDataAttributeEClass,
                SERVICE_DATA_ATTRIBUTE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( serviceDataAttributeEClass,
                SERVICE_DATA_ATTRIBUTE___FC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        serviceNSEClass = createEClass( SERVICE_NS );
        createEReference( serviceNSEClass, SERVICE_NS__CHANGES );
        createEReference( serviceNSEClass, SERVICE_NS__FUNCTIONAL_CONSTRAINTS );
        createEReference( serviceNSEClass, SERVICE_NS__PRESENCE_CONDITIONS );
        createEReference( serviceNSEClass, SERVICE_NS__ABBREVIATIONS );
        createEReference( serviceNSEClass, SERVICE_NS__SERVICE_TYPE_REALIZATIONS );
        createEReference( serviceNSEClass, SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES );
        createEReference( serviceNSEClass, SERVICE_NS__SERVICE_CD_CS );

        serviceNsUsageEClass = createEClass( SERVICE_NS_USAGE );
        createEReference( serviceNsUsageEClass, SERVICE_NS_USAGE__APPLIES_TO );
        createEReference( serviceNsUsageEClass, SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS );

        serviceParameterEClass = createEClass( SERVICE_PARAMETER );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__NAME );
        createEReference( serviceParameterEClass, SERVICE_PARAMETER__PARENT_CDC );
        createEOperation( serviceParameterEClass, SERVICE_PARAMETER___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        serviceTypeRealizationsEClass = createEClass( SERVICE_TYPE_REALIZATIONS );
        createEReference( serviceTypeRealizationsEClass, SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION );
        createEReference( serviceTypeRealizationsEClass, SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS );

        subDataAttributeEClass = createEClass( SUB_DATA_ATTRIBUTE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__NAME );
        createEReference( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE );
        createEReference( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION );
        createEOperation( subDataAttributeEClass, SUB_DATA_ATTRIBUTE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        subDataObjectEClass = createEClass( SUB_DATA_OBJECT );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__NAME );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__TYPE );
        createEReference( subDataObjectEClass, SUB_DATA_OBJECT__PARENT_CDC );
        createEReference( subDataObjectEClass, SUB_DATA_OBJECT__REFERS_TO_CDC );
        createEReference( subDataObjectEClass, SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION );
        createEReference( subDataObjectEClass, SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE );
        createEReference( subDataObjectEClass, SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE );
        createEOperation( subDataObjectEClass, SUB_DATA_OBJECT___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( subDataObjectEClass, SUB_DATA_OBJECT___TYPE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        titledClassEClass = createEClass( TITLED_CLASS );
        createEAttribute( titledClassEClass, TITLED_CLASS__TITLE_ID );
        createEReference( titledClassEClass, TITLED_CLASS__REFERS_TO_TITLE_DOC );
        createEOperation( titledClassEClass, TITLED_CLASS___TITLE_ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        nsdObjectEClass = createEClass( NSD_OBJECT );
        createEAttribute( nsdObjectEClass, NSD_OBJECT__LINE_NUMBER );
        createEAttribute( nsdObjectEClass, NSD_OBJECT__EXPLICIT_LINKS_BUILT );
        createEOperation( nsdObjectEClass, NSD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE );

        agNSIdentificationEClass = createEClass( AG_NS_IDENTIFICATION );
        createEAttribute( agNSIdentificationEClass, AG_NS_IDENTIFICATION__RELEASE );
        createEAttribute( agNSIdentificationEClass, AG_NS_IDENTIFICATION__VERSION );
        createEAttribute( agNSIdentificationEClass, AG_NS_IDENTIFICATION__ID );
        createEAttribute( agNSIdentificationEClass, AG_NS_IDENTIFICATION__REVISION );
        createEAttribute( agNSIdentificationEClass, AG_NS_IDENTIFICATION__PUBLICATION_STAGE );
        createEOperation( agNSIdentificationEClass, AG_NS_IDENTIFICATION___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
        createEOperation( agNSIdentificationEClass,
                AG_NS_IDENTIFICATION___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );

        agPresenceConditionEClass = createEClass( AG_PRESENCE_CONDITION );
        createEAttribute( agPresenceConditionEClass, AG_PRESENCE_CONDITION__PRES_COND );
        createEAttribute( agPresenceConditionEClass, AG_PRESENCE_CONDITION__PRES_COND_ARGS );
        createEAttribute( agPresenceConditionEClass, AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID );
        createEReference( agPresenceConditionEClass, AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC );

        agPresenceConditionDerivedStatisticsEClass = createEClass( AG_PRESENCE_CONDITION_DERIVED_STATISTICS );
        createEAttribute( agPresenceConditionDerivedStatisticsEClass,
                AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND );
        createEAttribute( agPresenceConditionDerivedStatisticsEClass,
                AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS );
        createEAttribute( agPresenceConditionDerivedStatisticsEClass,
                AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID );
        createEReference( agPresenceConditionDerivedStatisticsEClass,
                AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC );

        agArrayEClass = createEClass( AG_ARRAY );
        createEAttribute( agArrayEClass, AG_ARRAY__IS_ARRAY );
        createEAttribute( agArrayEClass, AG_ARRAY__MAX_INDEX_ATTRIBUTE );
        createEAttribute( agArrayEClass, AG_ARRAY__MIN_INDEX );
        createEAttribute( agArrayEClass, AG_ARRAY__SIZE_ATTRIBUTE );

        agTrgOpEClass = createEClass( AG_TRG_OP );
        createEAttribute( agTrgOpEClass, AG_TRG_OP__DCHG );
        createEAttribute( agTrgOpEClass, AG_TRG_OP__DUPD );
        createEAttribute( agTrgOpEClass, AG_TRG_OP__QCHG );

        agAttributeTypeEClass = createEClass( AG_ATTRIBUTE_TYPE );
        createEAttribute( agAttributeTypeEClass, AG_ATTRIBUTE_TYPE__TYPE );
        createEAttribute( agAttributeTypeEClass, AG_ATTRIBUTE_TYPE__TYPE_KIND );
        createEReference( agAttributeTypeEClass, AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE );
        createEReference( agAttributeTypeEClass, AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE );
        createEReference( agAttributeTypeEClass, AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION );

        agAttributeTypeAndValuesEClass = createEClass( AG_ATTRIBUTE_TYPE_AND_VALUES );
        createEAttribute( agAttributeTypeAndValuesEClass, AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE );
        createEAttribute( agAttributeTypeAndValuesEClass, AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE );
        createEAttribute( agAttributeTypeAndValuesEClass, AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE );

        agUnderlyingTypeEClass = createEClass( AG_UNDERLYING_TYPE );
        createEAttribute( agUnderlyingTypeEClass, AG_UNDERLYING_TYPE__UNDERLYING_TYPE );
        createEAttribute( agUnderlyingTypeEClass, AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND );
        createEReference( agUnderlyingTypeEClass, AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE );
        createEReference( agUnderlyingTypeEClass, AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE );
        createEReference( agUnderlyingTypeEClass, AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION );

        agUMLEClass = createEClass( AG_UML );
        createEAttribute( agUMLEClass, AG_UML__UML_DATE );
        createEAttribute( agUMLEClass, AG_UML__UML_VERSION );

        agNSdescEClass = createEClass( AG_NSDESC );
        createEAttribute( agNSdescEClass, AG_NSDESC__DESC_ID );
        createEReference( agNSdescEClass, AG_NSDESC__REFERS_TO_DOC );

        iRiseClipseConsoleEClass = createEClass( IRISE_CLIPSE_CONSOLE );

        // Create enums
        acsiServicesKindEEnum = createEEnum( ACSI_SERVICES_KIND );
        cbKindEEnum = createEEnum( CB_KIND );
        definedAttributeTypeKindEEnum = createEEnum( DEFINED_ATTRIBUTE_TYPE_KIND );
        licenseKindEEnum = createEEnum( LICENSE_KIND );
        pubStageEEnum = createEEnum( PUB_STAGE );
        undefinedAttributeTypeKindEEnum = createEEnum( UNDEFINED_ATTRIBUTE_TYPE_KIND );

        // Create data types
        acsiServicesKindObjectEDataType = createEDataType( ACSI_SERVICES_KIND_OBJECT );
        attributeTypeKindEDataType = createEDataType( ATTRIBUTE_TYPE_KIND );
        cbKindObjectEDataType = createEDataType( CB_KIND_OBJECT );
        definedAttributeTypeKindObjectEDataType = createEDataType( DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT );
        licenseKindObjectEDataType = createEDataType( LICENSE_KIND_OBJECT );
        pubStageObjectEDataType = createEDataType( PUB_STAGE_OBJECT );
        undefinedAttributeTypeKindObjectEDataType = createEDataType( UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if( isInitialized ) return;
        isInitialized = true;

        // Initialize package
        setName( eNAME );
        setNsPrefix( eNS_PREFIX );
        setNsURI( eNS_URI );

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = ( XMLTypePackage ) EPackage.Registry.INSTANCE
                .getEPackage( XMLTypePackage.eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        appliesToTypeEClass.getESuperTypes().add( this.getNsdObject() );
        appliesToTypeEClass.getESuperTypes().add( this.getAgNSIdentification() );
        dependsOnEClass.getESuperTypes().add( this.getNsdObject() );
        dependsOnEClass.getESuperTypes().add( this.getAgNSIdentification() );
        serviceTypeEClass.getESuperTypes().add( this.getNsdObject() );
        abbreviationEClass.getESuperTypes().add( this.getNsdObject() );
        abbreviationsEClass.getESuperTypes().add( this.getNsdObject() );
        abstractLNClassEClass.getESuperTypes().add( this.getAnyLNClass() );
        anyLNClassEClass.getESuperTypes().add( this.getTitledClass() );
        applicableServiceNSEClass.getESuperTypes().add( this.getCopyrighted() );
        applicableServicesEClass.getESuperTypes().add( this.getNsdObject() );
        basicTypeEClass.getESuperTypes().add( this.getNsdObject() );
        basicTypesEClass.getESuperTypes().add( this.getNsdObject() );
        cdcEClass.getESuperTypes().add( this.getTitledClass() );
        cdCsEClass.getESuperTypes().add( this.getNsdObject() );
        changesEClass.getESuperTypes().add( this.getNsdObject() );
        constructedAttributeEClass.getESuperTypes().add( this.getTitledClass() );
        constructedAttributesEClass.getESuperTypes().add( this.getNsdObject() );
        copyrightedEClass.getESuperTypes().add( this.getNsdObject() );
        copyrightNoticeEClass.getESuperTypes().add( this.getNsdObject() );
        dataAttributeEClass.getESuperTypes().add( this.getDocumentedClass() );
        dataAttributeEClass.getESuperTypes().add( this.getAgPresenceCondition() );
        dataAttributeEClass.getESuperTypes().add( this.getAgArray() );
        dataAttributeEClass.getESuperTypes().add( this.getAgTrgOp() );
        dataAttributeEClass.getESuperTypes().add( this.getAgAttributeTypeAndValues() );
        dataObjectEClass.getESuperTypes().add( this.getDocumentedClass() );
        dataObjectEClass.getESuperTypes().add( this.getAgPresenceCondition() );
        dataObjectEClass.getESuperTypes().add( this.getAgPresenceConditionDerivedStatistics() );
        dataObjectEClass.getESuperTypes().add( this.getAgUnderlyingType() );
        dataSetMemberOfEClass.getESuperTypes().add( this.getNsdObject() );
        docEClass.getESuperTypes().add( this.getNsdObject() );
        documentedClassEClass.getESuperTypes().add( this.getNsdObject() );
        enumerationEClass.getESuperTypes().add( this.getTitledClass() );
        enumerationsEClass.getESuperTypes().add( this.getNsdObject() );
        functionalConstraintEClass.getESuperTypes().add( this.getNsdObject() );
        functionalConstraintsEClass.getESuperTypes().add( this.getNsdObject() );
        licenseEClass.getESuperTypes().add( this.getNsdObject() );
        literalEClass.getESuperTypes().add( this.getDocumentedClass() );
        lnClassEClass.getESuperTypes().add( this.getAnyLNClass() );
        lnClassesEClass.getESuperTypes().add( this.getNsdObject() );
        noticeEClass.getESuperTypes().add( this.getNsdObject() );
        nsEClass.getESuperTypes().add( this.getCopyrighted() );
        nsEClass.getESuperTypes().add( this.getAgNSIdentification() );
        nsEClass.getESuperTypes().add( this.getAgUML() );
        nsEClass.getESuperTypes().add( this.getAgNSdesc() );
        nsDocEClass.getESuperTypes().add( this.getCopyrighted() );
        nsDocEClass.getESuperTypes().add( this.getAgNSIdentification() );
        nsDocEClass.getESuperTypes().add( this.getAgUML() );
        presenceConditionEClass.getESuperTypes().add( this.getNsdObject() );
        presenceConditionsEClass.getESuperTypes().add( this.getNsdObject() );
        serviceCDCEClass.getESuperTypes().add( this.getNsdObject() );
        serviceCDCsEClass.getESuperTypes().add( this.getNsdObject() );
        serviceConstructedAttributeEClass.getESuperTypes().add( this.getConstructedAttribute() );
        serviceConstructedAttributesEClass.getESuperTypes().add( this.getNsdObject() );
        serviceDataAttributeEClass.getESuperTypes().add( this.getDocumentedClass() );
        serviceDataAttributeEClass.getESuperTypes().add( this.getAgPresenceCondition() );
        serviceDataAttributeEClass.getESuperTypes().add( this.getAgAttributeType() );
        serviceDataAttributeEClass.getESuperTypes().add( this.getAgUnderlyingType() );
        serviceNSEClass.getESuperTypes().add( this.getCopyrighted() );
        serviceNSEClass.getESuperTypes().add( this.getAgNSIdentification() );
        serviceNSEClass.getESuperTypes().add( this.getAgUML() );
        serviceNSEClass.getESuperTypes().add( this.getAgNSdesc() );
        serviceNsUsageEClass.getESuperTypes().add( this.getNsdObject() );
        serviceNsUsageEClass.getESuperTypes().add( this.getAgNSIdentification() );
        serviceParameterEClass.getESuperTypes().add( this.getDocumentedClass() );
        serviceParameterEClass.getESuperTypes().add( this.getAgAttributeTypeAndValues() );
        serviceTypeRealizationsEClass.getESuperTypes().add( this.getNsdObject() );
        subDataAttributeEClass.getESuperTypes().add( this.getDocumentedClass() );
        subDataAttributeEClass.getESuperTypes().add( this.getAgPresenceCondition() );
        subDataAttributeEClass.getESuperTypes().add( this.getAgArray() );
        subDataAttributeEClass.getESuperTypes().add( this.getAgAttributeTypeAndValues() );
        subDataObjectEClass.getESuperTypes().add( this.getDocumentedClass() );
        subDataObjectEClass.getESuperTypes().add( this.getAgPresenceCondition() );
        subDataObjectEClass.getESuperTypes().add( this.getAgArray() );
        subDataObjectEClass.getESuperTypes().add( this.getAgUnderlyingType() );
        titledClassEClass.getESuperTypes().add( this.getDocumentedClass() );
        agAttributeTypeAndValuesEClass.getESuperTypes().add( this.getAgAttributeType() );

        // Initialize classes, features, and operations; add parameters
        initEClass( appliesToTypeEClass, AppliesToType.class, "AppliesToType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAppliesToType_ParentServiceNsUsage(), this.getServiceNsUsage(),
                this.getServiceNsUsage_AppliesTo(), "parentServiceNsUsage", null, 0, 1, AppliesToType.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( dependsOnEClass, DependsOn.class, "DependsOn", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getDependsOn_ParentNS(), this.getNS(), this.getNS_DependsOn(), "parentNS", null, 0, 1,
                DependsOn.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDependsOn_RefersToNS(), this.getNS(), this.getNS_ReferredByDependsOn(), "refersToNS", null,
                0, 1, DependsOn.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEReference( getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
                "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
                "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_ApplicableServiceNS(), this.getApplicableServiceNS(), null,
                "applicableServiceNS", null, 0, 1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_NS(), this.getNS(), null, "nS", null, 0, 1, null, IS_TRANSIENT, IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_NSDoc(), this.getNSDoc(), null, "nSDoc", null, 0, 1, null, IS_TRANSIENT,
                IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
                IS_ORDERED );
        initEReference( getDocumentRoot_ServiceNS(), this.getServiceNS(), null, "serviceNS", null, 0, 1, null,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                IS_DERIVED, IS_ORDERED );

        initEClass( serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceType_Name(), this.getACSIServicesKind(), "name", null, 0, 1, ServiceType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceType_ParentApplicableServices(), this.getApplicableServices(),
                this.getApplicableServices_Service(), "parentApplicableServices", null, 0, 1, ServiceType.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        EOperation op = initEOperation( getServiceType__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        EGenericType g1 = createEGenericType( ecorePackage.getEMap() );
        EGenericType g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( abbreviationEClass, Abbreviation.class, "Abbreviation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAbbreviation_DescID(), ecorePackage.getEString(), "descID", null, 0, 1, Abbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAbbreviation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Abbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAbbreviation_ParentAbbreviations(), this.getAbbreviations(),
                this.getAbbreviations_Abbreviation(), "parentAbbreviations", null, 0, 1, Abbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getAbbreviation_RefersToDoc(), this.getDoc(), this.getDoc_ReferredByAbbreviation(),
                "refersToDoc", null, 0, 1, Abbreviation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getAbbreviation__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( abbreviationsEClass, Abbreviations.class, "Abbreviations", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAbbreviations_Abbreviation(), this.getAbbreviation(),
                this.getAbbreviation_ParentAbbreviations(), "abbreviation", null, 0, -1, Abbreviations.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getAbbreviations_ParentNS(), this.getNS(), this.getNS_Abbreviations(), "parentNS", null, 0, 1,
                Abbreviations.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getAbbreviations_ParentServiceNS(), this.getServiceNS(), this.getServiceNS_Abbreviations(),
                "parentServiceNS", null, 0, 1, Abbreviations.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getAbbreviations__UniqueAbbreviation__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueAbbreviation", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( abstractLNClassEClass, AbstractLNClass.class, "AbstractLNClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAbstractLNClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractLNClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAbstractLNClass_ParentLNClasses(), this.getLNClasses(), this.getLNClasses_AbstractLNClass(),
                "parentLNClasses", null, 0, 1, AbstractLNClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getAbstractLNClass_ReferredByAnyLNClass(), this.getAnyLNClass(),
                this.getAnyLNClass_RefersToAbstractLNClass(), "referredByAnyLNClass", null, 0, -1,
                AbstractLNClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getAbstractLNClass__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( anyLNClassEClass, AnyLNClass.class, "AnyLNClass", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAnyLNClass_DataObject(), this.getDataObject(), this.getDataObject_ParentAnyLNClass(),
                "dataObject", null, 0, -1, AnyLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getAnyLNClass_Base(), ecorePackage.getEString(), "base", null, 0, 1, AnyLNClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAnyLNClass_RefersToAbstractLNClass(), this.getAbstractLNClass(),
                this.getAbstractLNClass_ReferredByAnyLNClass(), "refersToAbstractLNClass", null, 0, 1, AnyLNClass.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );

        initEOperation( getAnyLNClass__GetName(), theXMLTypePackage.getString(), "getName", 0, 1, IS_UNIQUE,
                IS_ORDERED );

        initEOperation( getAnyLNClass__GetParentLNClasses(), this.getLNClasses(), "getParentLNClasses", 0, 1, IS_UNIQUE,
                IS_ORDERED );

        op = initEOperation( getAnyLNClass__UniqueDataObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueDataObject", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( applicableServiceNSEClass, ApplicableServiceNS.class, "ApplicableServiceNS", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getApplicableServiceNS_ServiceNsUsage(), this.getServiceNsUsage(),
                this.getServiceNsUsage_ParentApplicableServiceNS(), "serviceNsUsage", null, 0, -1,
                ApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getApplicableServiceNS_Date(), theXMLTypePackage.getDateTime(), "date", null, 0, 1,
                ApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getApplicableServiceNS_Version(), theXMLTypePackage.getUnsignedInt(), "version", null, 0, 1,
                ApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        op = initEOperation( getApplicableServiceNS__VersionAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "versionAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getApplicableServiceNS__DateAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "dateAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( applicableServicesEClass, ApplicableServices.class, "ApplicableServices", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getApplicableServices_Service(), this.getServiceType(),
                this.getServiceType_ParentApplicableServices(), "service", null, 0, -1, ApplicableServices.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getApplicableServices_DataSetMemberOf(), this.getDataSetMemberOf(),
                this.getDataSetMemberOf_ParentApplicableServices(), "dataSetMemberOf", null, 0, -1,
                ApplicableServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getApplicableServices_ParentFunctionalConstraint(), this.getFunctionalConstraint(),
                this.getFunctionalConstraint_ApplicableServices(), "parentFunctionalConstraint", null, 0, 1,
                ApplicableServices.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getApplicableServices__UniqueDataSetMemberOf__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "uniqueDataSetMemberOf", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getApplicableServices__UniqueService__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueService", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getBasicType_DescID(), ecorePackage.getEString(), "descID", null, 0, 1, BasicType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getBasicType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BasicType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getBasicType_ParentBasicTypes(), this.getBasicTypes(), this.getBasicTypes_BasicType(),
                "parentBasicTypes", null, 0, 1, BasicType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getBasicType_ReferredByAttributeType(), this.getAgAttributeType(),
                this.getAgAttributeType_RefersToBasicType(), "referredByAttributeType", null, 0, -1, BasicType.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getBasicType_RefersToDoc(), this.getDoc(), this.getDoc_ReferredByBasicType(), "refersToDoc",
                null, 0, 1, BasicType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getBasicType_ReferredByUnderlyingType(), this.getAgUnderlyingType(),
                this.getAgUnderlyingType_RefersToUnderlyingBasicType(), "referredByUnderlyingType", null, 0, -1,
                BasicType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getBasicType__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( basicTypesEClass, BasicTypes.class, "BasicTypes", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getBasicTypes_BasicType(), this.getBasicType(), this.getBasicType_ParentBasicTypes(),
                "basicType", null, 0, -1, BasicTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getBasicTypes_ParentNS(), this.getNS(), this.getNS_BasicTypes(), "parentNS", null, 0, 1,
                BasicTypes.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( cdcEClass, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, "CDC", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCDC_SubDataObject(), this.getSubDataObject(), this.getSubDataObject_ParentCDC(),
                "subDataObject", null, 0, -1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );
        initEReference( getCDC_DataAttribute(), this.getDataAttribute(), this.getDataAttribute_ParentCDC(),
                "dataAttribute", null, 0, -1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );
        initEReference( getCDC_ServiceParameter(), this.getServiceParameter(), this.getServiceParameter_ParentCDC(),
                "serviceParameter", null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );
        initEAttribute( getCDC_EnumParameterized(), theXMLTypePackage.getBoolean(), "enumParameterized", "false", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_Statistics(), theXMLTypePackage.getBoolean(), "statistics", "false", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_TypeKindParameterized(), theXMLTypePackage.getBoolean(), "typeKindParameterized",
                "false", 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_Variant(), theXMLTypePackage.getToken(), "variant", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCDC_ParentCDCs(), this.getCDCs(), this.getCDCs_CDC(), "parentCDCs", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getCDC_ReferredByDataObject(), this.getDataObject(), this.getDataObject_RefersToCDC(),
                "referredByDataObject", null, 0, -1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getCDC_ReferredBySubDataObject(), this.getSubDataObject(), this.getSubDataObject_RefersToCDC(),
                "referredBySubDataObject", null, 0, -1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getCDC__UniqueCDCChild__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueCDCChild", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getCDC__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( cdCsEClass, CDCs.class, "CDCs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCDCs_CDC(), this.getCDC(), this.getCDC_ParentCDCs(), "cDC", null, 0, -1, CDCs.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getCDCs_ParentNS(), this.getNS(), this.getNS_CDCs(), "parentNS", null, 0, 1, CDCs.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getCDCs__UniqueCDC__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueCDC", 0, 1,
                IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( changesEClass, Changes.class, "Changes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getChanges_ChangesID(), ecorePackage.getEString(), "changesID", null, 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Revision(), ecorePackage.getEString(), "revision", "A", 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Tissues(), ecorePackage.getEString(), "tissues", null, 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getChanges_ParentNS(), this.getNS(), this.getNS_Changes(), "parentNS", null, 0, 1,
                Changes.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getChanges_ParentServiceNS(), this.getServiceNS(), this.getServiceNS_Changes(),
                "parentServiceNS", null, 0, 1, Changes.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getChanges_Release(), ecorePackage.getEIntegerObject(), "release", "1", 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Version(), ecorePackage.getEIntegerObject(), "version", null, 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        op = initEOperation( getChanges__VersionAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "versionAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( constructedAttributeEClass, ConstructedAttribute.class, "ConstructedAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getConstructedAttribute_SubDataAttribute(), this.getSubDataAttribute(),
                this.getSubDataAttribute_ParentConstructedAttribute(), "subDataAttribute", null, 0, -1,
                ConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getConstructedAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                ConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getConstructedAttribute_ParentConstructedAttributes(), this.getConstructedAttributes(),
                this.getConstructedAttributes_ConstructedAttribute(), "parentConstructedAttributes", null, 0, 1,
                ConstructedAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getConstructedAttribute_ParentServiceTypeRealizations(), this.getServiceTypeRealizations(),
                this.getServiceTypeRealizations_ServiceTypeRealization(), "parentServiceTypeRealizations", null, 0, 1,
                ConstructedAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getConstructedAttribute_ReferredByAttributeType(), this.getAgAttributeType(),
                this.getAgAttributeType_RefersToConstructedAttribute(), "referredByAttributeType", null, 0, -1,
                ConstructedAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getConstructedAttribute_ReferredByUnderlyingType(), this.getAgUnderlyingType(),
                this.getAgUnderlyingType_RefersToUnderlyingConstructedAttribute(), "referredByUnderlyingType", null, 0,
                -1, ConstructedAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getConstructedAttribute__UniqueSubDataAttribute__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "uniqueSubDataAttribute", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getConstructedAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( constructedAttributesEClass, ConstructedAttributes.class, "ConstructedAttributes", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getConstructedAttributes_ConstructedAttribute(), this.getConstructedAttribute(),
                this.getConstructedAttribute_ParentConstructedAttributes(), "constructedAttribute", null, 0, -1,
                ConstructedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getConstructedAttributes_ParentNS(), this.getNS(), this.getNS_ConstructedAttributes(),
                "parentNS", null, 0, 1, ConstructedAttributes.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getConstructedAttributes__UniqueConstructedAttribute__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "uniqueConstructedAttribute", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( copyrightedEClass, Copyrighted.class, "Copyrighted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCopyrighted_Copyright(), this.getCopyrightNotice(),
                this.getCopyrightNotice_ParentCopyrighted(), "copyright", null, 0, 1, Copyrighted.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );

        initEClass( copyrightNoticeEClass, CopyrightNotice.class, "CopyrightNotice", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCopyrightNotice_Notice(), this.getNotice(), this.getNotice_ParentCopyrightNotice(), "notice",
                null, 0, 1, CopyrightNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getCopyrightNotice_License(), this.getLicense(), this.getLicense_ParentCopyrightNotice(),
                "license", null, 0, 1, CopyrightNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getCopyrightNotice_ParentCopyrighted(), this.getCopyrighted(), this.getCopyrighted_Copyright(),
                "parentCopyrighted", null, 0, 1, CopyrightNotice.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( dataAttributeEClass, DataAttribute.class, "DataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDataAttribute_Fc(), ecorePackage.getEString(), "fc", null, 0, 1, DataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getDataAttribute_ParentCDC(), this.getCDC(), this.getCDC_DataAttribute(), "parentCDC", null, 0,
                1, DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_ReferredBySubDataObjectAsSizeAttribute(), this.getSubDataObject(),
                this.getSubDataObject_RefersToSizeAttribute(), "referredBySubDataObjectAsSizeAttribute", null, 0, -1,
                DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute(), this.getSubDataObject(),
                this.getSubDataObject_RefersToMaxIndexAttribute(), "referredBySubDataObjectAsMaxIndexAttribute", null,
                0, -1, DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_RefersToFunctionalConstraint(), this.getFunctionalConstraint(),
                this.getFunctionalConstraint_ReferredByDataAttribute(), "refersToFunctionalConstraint", null, 0, 1,
                DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_RefersToPresenceCondition(), this.getPresenceCondition(),
                this.getPresenceCondition_ReferredByDataAttribute(), "refersToPresenceCondition", null, 0, 1,
                DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_RefersToSizeAttribute(), this.getDataAttribute(),
                this.getDataAttribute_ReferredByDataAttributeAsSizeAttribute(), "refersToSizeAttribute", null, 0, 1,
                DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_RefersToMaxIndexAttribute(), this.getDataAttribute(),
                this.getDataAttribute_ReferredByDataAttributeAsMaxIndexAttribute(), "refersToMaxIndexAttribute", null,
                0, 1, DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_ReferredByDataAttributeAsSizeAttribute(), this.getDataAttribute(),
                this.getDataAttribute_RefersToSizeAttribute(), "referredByDataAttributeAsSizeAttribute", null, 0, -1,
                DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataAttribute_ReferredByDataAttributeAsMaxIndexAttribute(), this.getDataAttribute(),
                this.getDataAttribute_RefersToMaxIndexAttribute(), "referredByDataAttributeAsMaxIndexAttribute", null,
                0, -1, DataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getDataAttribute__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getDataAttribute__FcAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "fcAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDataObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_Transient(), theXMLTypePackage.getBoolean(), "transient", "false", 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getDataObject_ParentAnyLNClass(), this.getAnyLNClass(), this.getAnyLNClass_DataObject(),
                "parentAnyLNClass", null, 0, 1, DataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataObject_RefersToCDC(), this.getCDC(), this.getCDC_ReferredByDataObject(), "refersToCDC",
                null, 0, 1, DataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataObject_RefersToPresenceCondition(), this.getPresenceCondition(),
                this.getPresenceCondition_ReferredByDataObject(), "refersToPresenceCondition", null, 0, 1,
                DataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDataObject_RefersToPresenceConditionDerivedStatistics(), this.getPresenceCondition(),
                this.getPresenceCondition_ReferredByDataObjectForDerivedStatistics(),
                "refersToPresenceConditionDerivedStatistics", null, 0, 1, DataObject.class, IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getDataObject__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getDataObject__TypeAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "typeAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( dataSetMemberOfEClass, DataSetMemberOf.class, "DataSetMemberOf", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDataSetMemberOf_Cb(), this.getCBKind(), "cb", null, 0, 1, DataSetMemberOf.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getDataSetMemberOf_ParentApplicableServices(), this.getApplicableServices(),
                this.getApplicableServices_DataSetMemberOf(), "parentApplicableServices", null, 0, 1,
                DataSetMemberOf.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getDataSetMemberOf__CbAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "cbAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( docEClass, Doc.class, "Doc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDoc_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Doc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDoc_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Doc.class,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEAttribute( getDoc_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Doc.class, IS_TRANSIENT,
                IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEAttribute( getDoc_Id(), ecorePackage.getEString(), "id", null, 0, 1, Doc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getDoc_ParentNSDoc(), this.getNSDoc(), this.getNSDoc_Doc(), "parentNSDoc", null, 0, 1,
                Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByAgNSDesc(), this.getAgNSdesc(), this.getAgNSdesc_RefersToDoc(),
                "ReferredByAgNSDesc", null, 0, -1, Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByPresenceConditionAsDesc(), this.getPresenceCondition(),
                this.getPresenceCondition_RefersToDescDoc(), "referredByPresenceConditionAsDesc", null, 0, -1,
                Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByAgPresenceCondition(), this.getAgPresenceCondition(),
                this.getAgPresenceCondition_RefersToPresCondArgsDoc(), "referredByAgPresenceCondition", null, 0, -1,
                Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByAbbreviation(), this.getAbbreviation(), this.getAbbreviation_RefersToDoc(),
                "referredByAbbreviation", null, 0, -1, Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByBasicType(), this.getBasicType(), this.getBasicType_RefersToDoc(),
                "referredByBasicType", null, 0, -1, Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByDocumentedClass(), this.getDocumentedClass(),
                this.getDocumentedClass_RefersToDescDoc(), "referredByDocumentedClass", null, 0, -1, Doc.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByFunctionalConstraintAsDesc(), this.getFunctionalConstraint(),
                this.getFunctionalConstraint_RefersToDescDoc(), "referredByFunctionalConstraintAsDesc", null, 0, -1,
                Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByAgPresenceConditionDerivedStatistics(),
                this.getAgPresenceConditionDerivedStatistics(),
                this.getAgPresenceConditionDerivedStatistics_RefersToDsPresCondArgsDoc(),
                "referredByAgPresenceConditionDerivedStatistics", null, 0, -1, Doc.class, IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByTitledClass(), this.getTitledClass(), this.getTitledClass_RefersToTitleDoc(),
                "referredByTitledClass", null, 0, -1, Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByFunctionalConstraintAsTitle(), this.getFunctionalConstraint(),
                this.getFunctionalConstraint_RefersToTitleDoc(), "referredByFunctionalConstraintAsTitle", null, 0, -1,
                Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getDoc_ReferredByPresenceConditionAsTitle(), this.getPresenceCondition(),
                this.getPresenceCondition_RefersToTitleDoc(), "referredByPresenceConditionAsTitle", null, 0, -1,
                Doc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getDoc__IdAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "idAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( documentedClassEClass, DocumentedClass.class, "DocumentedClass", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDocumentedClass_Deprecated(), theXMLTypePackage.getBoolean(), "deprecated", "false", 0, 1,
                DocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDocumentedClass_DescID(), ecorePackage.getEString(), "descID", null, 0, 1,
                DocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDocumentedClass_Informative(), theXMLTypePackage.getBoolean(), "informative", "false", 0, 1,
                DocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentedClass_RefersToDescDoc(), this.getDoc(), this.getDoc_ReferredByDocumentedClass(),
                "refersToDescDoc", null, 0, 1, DocumentedClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnumeration_Literal(), this.getLiteral(), this.getLiteral_ParentEnumeration(), "literal",
                null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getEnumeration_InheritedFrom(), ecorePackage.getEString(), "inheritedFrom", null, 0, 1,
                Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getEnumeration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Enumeration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getEnumeration_ParentEnumerations(), this.getEnumerations(), this.getEnumerations_Enumeration(),
                "parentEnumerations", null, 0, 1, Enumeration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getEnumeration_RefersToBaseEnumeration(), this.getEnumeration(),
                this.getEnumeration_ReferredByEnumerationAsBase(), "refersToBaseEnumeration", null, 0, 1,
                Enumeration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getEnumeration_ReferredByEnumerationAsBase(), this.getEnumeration(),
                this.getEnumeration_RefersToBaseEnumeration(), "referredByEnumerationAsBase", null, 0, -1,
                Enumeration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getEnumeration_ReferredByAttributeType(), this.getAgAttributeType(),
                this.getAgAttributeType_RefersToEnumeration(), "referredByAttributeType", null, 0, -1,
                Enumeration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getEnumeration_ReferredByUnderlyingType(), this.getAgUnderlyingType(),
                this.getAgUnderlyingType_RefersToUnderlyingEnumeration(), "referredByUnderlyingType", null, 0, -1,
                Enumeration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getEnumeration__UniqueLiteralName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueLiteralName", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getEnumeration__UniqueLiteralVal__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueLiteralVal", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getEnumeration__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( enumerationsEClass, Enumerations.class, "Enumerations", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnumerations_Enumeration(), this.getEnumeration(), this.getEnumeration_ParentEnumerations(),
                "enumeration", null, 0, -1, Enumerations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getEnumerations_ParentNS(), this.getNS(), this.getNS_Enumerations(), "parentNS", null, 0, 1,
                Enumerations.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getEnumerations__UniqueEnumeration__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueEnumeration", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( functionalConstraintEClass, FunctionalConstraint.class, "FunctionalConstraint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getFunctionalConstraint_ApplicableServices(), this.getApplicableServices(),
                this.getApplicableServices_ParentFunctionalConstraint(), "applicableServices", null, 0, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getFunctionalConstraint_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getFunctionalConstraint_DescID(), ecorePackage.getEString(), "descID", null, 0, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getFunctionalConstraint_TitleID(), ecorePackage.getEString(), "titleID", null, 0, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getFunctionalConstraint_ParentFunctionalConstraints(), this.getFunctionalConstraints(),
                this.getFunctionalConstraints_FunctionalConstraint(), "parentFunctionalConstraints", null, 0, 1,
                FunctionalConstraint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getFunctionalConstraint_ReferredByDataAttribute(), this.getDataAttribute(),
                this.getDataAttribute_RefersToFunctionalConstraint(), "referredByDataAttribute", null, 0, -1,
                FunctionalConstraint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getFunctionalConstraint_RefersToDescDoc(), this.getDoc(),
                this.getDoc_ReferredByFunctionalConstraintAsDesc(), "refersToDescDoc", null, 0, 1,
                FunctionalConstraint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getFunctionalConstraint_RefersToTitleDoc(), this.getDoc(),
                this.getDoc_ReferredByFunctionalConstraintAsTitle(), "refersToTitleDoc", null, 0, 1,
                FunctionalConstraint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getFunctionalConstraint__AbbreviationAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "abbreviationAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( functionalConstraintsEClass, FunctionalConstraints.class, "FunctionalConstraints", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getFunctionalConstraints_FunctionalConstraint(), this.getFunctionalConstraint(),
                this.getFunctionalConstraint_ParentFunctionalConstraints(), "functionalConstraint", null, 0, -1,
                FunctionalConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getFunctionalConstraints_ParentNS(), this.getNS(), this.getNS_FunctionalConstraints(),
                "parentNS", null, 0, 1, FunctionalConstraints.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getFunctionalConstraints_ParentServiceNS(), this.getServiceNS(),
                this.getServiceNS_FunctionalConstraints(), "parentServiceNS", null, 0, 1, FunctionalConstraints.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getFunctionalConstraints__UniqueFunctionalConstraint__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "uniqueFunctionalConstraint", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLicense_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, License.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getLicense_Kind(), this.getLicenseKind(), "kind", null, 0, 1, License.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLicense_Uri(), theXMLTypePackage.getNormalizedString(), "uri", null, 0, 1, License.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getLicense_ParentCopyrightNotice(), this.getCopyrightNotice(),
                this.getCopyrightNotice_License(), "parentCopyrightNotice", null, 0, 1, License.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );

        initEClass( literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLiteral_LiteralVal(), theXMLTypePackage.getInt(), "literalVal", null, 0, 1, Literal.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, Literal.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getLiteral_ParentEnumeration(), this.getEnumeration(), this.getEnumeration_Literal(),
                "parentEnumeration", null, 0, 1, Literal.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getLiteral__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getLiteral__LiteralValAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "literalValAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( lnClassEClass, LNClass.class, "LNClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLNClass_CanHaveLOG(), theXMLTypePackage.getBoolean(), "canHaveLOG", "false", 0, 1,
                LNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLNClass_IsExtension(), theXMLTypePackage.getBoolean(), "isExtension", "false", 0, 1,
                LNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLNClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, LNClass.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getLNClass_ParentLNClasses(), this.getLNClasses(), this.getLNClasses_LNClass(),
                "parentLNClasses", null, 0, 1, LNClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getLNClass__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( lnClassesEClass, LNClasses.class, "LNClasses", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getLNClasses_AbstractLNClass(), this.getAbstractLNClass(),
                this.getAbstractLNClass_ParentLNClasses(), "abstractLNClass", null, 0, -1, LNClasses.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getLNClasses_LNClass(), this.getLNClass(), this.getLNClass_ParentLNClasses(), "lNClass", null,
                0, -1, LNClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getLNClasses_ParentNS(), this.getNS(), this.getNS_LNClasses(), "parentNS", null, 0, 1,
                LNClasses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getLNClasses__UniqueLNClass__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueLNClass", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getLNClasses__UniqueAbstractLNClass__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "uniqueAbstractLNClass", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( noticeEClass, Notice.class, "Notice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNotice_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Notice.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEReference( getNotice_ParentCopyrightNotice(), this.getCopyrightNotice(), this.getCopyrightNotice_Notice(),
                "parentCopyrightNotice", null, 0, 1, Notice.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( nsEClass, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, "NS", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNS_Changes(), this.getChanges(), this.getChanges_ParentNS(), "changes", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_DependsOn(), this.getDependsOn(), this.getDependsOn_ParentNS(), "dependsOn", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_BasicTypes(), this.getBasicTypes(), this.getBasicTypes_ParentNS(), "basicTypes", null, 0,
                1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_FunctionalConstraints(), this.getFunctionalConstraints(),
                this.getFunctionalConstraints_ParentNS(), "functionalConstraints", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_PresenceConditions(), this.getPresenceConditions(), this.getPresenceConditions_ParentNS(),
                "presenceConditions", null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_Abbreviations(), this.getAbbreviations(), this.getAbbreviations_ParentNS(),
                "abbreviations", null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );
        initEReference( getNS_Enumerations(), this.getEnumerations(), this.getEnumerations_ParentNS(), "enumerations",
                null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_ConstructedAttributes(), this.getConstructedAttributes(),
                this.getConstructedAttributes_ParentNS(), "constructedAttributes", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_CDCs(), this.getCDCs(), this.getCDCs_ParentNS(), "cDCs", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_LNClasses(), this.getLNClasses(), this.getLNClasses_ParentNS(), "lNClasses", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getNS_ReferredByDependsOn(), this.getDependsOn(), this.getDependsOn_RefersToNS(),
                "referredByDependsOn", null, 0, -1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );

        initEClass( nsDocEClass, NSDoc.class, "NSDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNSDoc_Doc(), this.getDoc(), this.getDoc_ParentNSDoc(), "doc", null, 0, -1, NSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getNSDoc_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 0, 1, NSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        op = initEOperation( getNSDoc__LangAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "langAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( presenceConditionEClass, PresenceCondition.class, "PresenceCondition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getPresenceCondition_Argument(), ecorePackage.getEString(), "argument", null, 0, 1,
                PresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getPresenceCondition_DescID(), ecorePackage.getEString(), "descID", null, 0, 1,
                PresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getPresenceCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                PresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getPresenceCondition_TitleID(), ecorePackage.getEString(), "titleID", null, 0, 1,
                PresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getPresenceCondition_ParentPresenceConditions(), this.getPresenceConditions(),
                this.getPresenceConditions_PresenceCondition(), "parentPresenceConditions", null, 0, 1,
                PresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceCondition_ReferredByDataObject(), this.getDataObject(),
                this.getDataObject_RefersToPresenceCondition(), "referredByDataObject", null, 0, -1,
                PresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceCondition_ReferredByDataObjectForDerivedStatistics(), this.getDataObject(),
                this.getDataObject_RefersToPresenceConditionDerivedStatistics(),
                "referredByDataObjectForDerivedStatistics", null, 0, -1, PresenceCondition.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );
        initEReference( getPresenceCondition_ReferredBySubDataObject(), this.getSubDataObject(),
                this.getSubDataObject_RefersToPresenceCondition(), "referredBySubDataObject", null, 0, -1,
                PresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceCondition_ReferredByDataAttribute(), this.getDataAttribute(),
                this.getDataAttribute_RefersToPresenceCondition(), "referredByDataAttribute", null, 0, -1,
                PresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceCondition_ReferredBySubDataAttribute(), this.getSubDataAttribute(),
                this.getSubDataAttribute_RefersToPresenceCondition(), "referredBySubDataAttribute", null, 0, -1,
                PresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceCondition_RefersToDescDoc(), this.getDoc(),
                this.getDoc_ReferredByPresenceConditionAsDesc(), "refersToDescDoc", null, 0, 1, PresenceCondition.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceCondition_RefersToTitleDoc(), this.getDoc(),
                this.getDoc_ReferredByPresenceConditionAsTitle(), "refersToTitleDoc", null, 0, 1,
                PresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getPresenceCondition__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( presenceConditionsEClass, PresenceConditions.class, "PresenceConditions", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getPresenceConditions_PresenceCondition(), this.getPresenceCondition(),
                this.getPresenceCondition_ParentPresenceConditions(), "presenceCondition", null, 0, -1,
                PresenceConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceConditions_ParentNS(), this.getNS(), this.getNS_PresenceConditions(), "parentNS",
                null, 0, 1, PresenceConditions.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getPresenceConditions_ParentServiceNS(), this.getServiceNS(),
                this.getServiceNS_PresenceConditions(), "parentServiceNS", null, 0, 1, PresenceConditions.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getPresenceConditions__UniquePresenceCondition__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "uniquePresenceCondition", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( serviceCDCEClass, ServiceCDC.class, "ServiceCDC", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceCDC_ServiceDataAttribute(), this.getServiceDataAttribute(),
                this.getServiceDataAttribute_ParentServiceCDC(), "serviceDataAttribute", null, 0, -1, ServiceCDC.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEAttribute( getServiceCDC_Cdc(), ecorePackage.getEString(), "cdc", null, 1, 1, ServiceCDC.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceCDC_Variant(), theXMLTypePackage.getToken(), "variant", null, 0, 1, ServiceCDC.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceCDC_ParentServiceCDCs(), this.getServiceCDCs(), this.getServiceCDCs_ServiceCDC(),
                "parentServiceCDCs", null, 0, 1, ServiceCDC.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getServiceCDC__CdcAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "cdcAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( serviceCDCsEClass, ServiceCDCs.class, "ServiceCDCs", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceCDCs_ServiceCDC(), this.getServiceCDC(), this.getServiceCDC_ParentServiceCDCs(),
                "serviceCDC", null, 0, -1, ServiceCDCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceCDCs_ParentServiceNS(), this.getServiceNS(), this.getServiceNS_ServiceCDCs(),
                "parentServiceNS", null, 0, 1, ServiceCDCs.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( serviceConstructedAttributeEClass, ServiceConstructedAttribute.class, "ServiceConstructedAttribute",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceConstructedAttribute_TypeKindParameterized(), theXMLTypePackage.getBoolean(),
                "typeKindParameterized", "false", 0, 1, ServiceConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceConstructedAttribute_ParentServiceConstructedAttributes(),
                this.getServiceConstructedAttributes(),
                this.getServiceConstructedAttributes_ServiceConstructedAttribute(),
                "parentServiceConstructedAttributes", null, 0, 1, ServiceConstructedAttribute.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED );

        initEClass( serviceConstructedAttributesEClass, ServiceConstructedAttributes.class,
                "ServiceConstructedAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceConstructedAttributes_ServiceConstructedAttribute(),
                this.getServiceConstructedAttribute(),
                this.getServiceConstructedAttribute_ParentServiceConstructedAttributes(), "serviceConstructedAttribute",
                null, 0, -1, ServiceConstructedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceConstructedAttributes_ParentServiceNS(), this.getServiceNS(),
                this.getServiceNS_ServiceConstructedAttributes(), "parentServiceNS", null, 0, 1,
                ServiceConstructedAttributes.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( serviceDataAttributeEClass, ServiceDataAttribute.class, "ServiceDataAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceDataAttribute_Fc(), ecorePackage.getEString(), "fc", null, 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceDataAttribute_ParentServiceCDC(), this.getServiceCDC(),
                this.getServiceCDC_ServiceDataAttribute(), "parentServiceCDC", null, 0, 1, ServiceDataAttribute.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getServiceDataAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getServiceDataAttribute__FcAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "fcAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( serviceNSEClass, ServiceNS.class, "ServiceNS", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceNS_Changes(), this.getChanges(), this.getChanges_ParentServiceNS(), "changes", null,
                0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNS_FunctionalConstraints(), this.getFunctionalConstraints(),
                this.getFunctionalConstraints_ParentServiceNS(), "functionalConstraints", null, 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNS_PresenceConditions(), this.getPresenceConditions(),
                this.getPresenceConditions_ParentServiceNS(), "presenceConditions", null, 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNS_Abbreviations(), this.getAbbreviations(), this.getAbbreviations_ParentServiceNS(),
                "abbreviations", null, 0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNS_ServiceTypeRealizations(), this.getServiceTypeRealizations(),
                this.getServiceTypeRealizations_ParentServiceNS(), "serviceTypeRealizations", null, 0, 1,
                ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNS_ServiceConstructedAttributes(), this.getServiceConstructedAttributes(),
                this.getServiceConstructedAttributes_ParentServiceNS(), "serviceConstructedAttributes", null, 0, 1,
                ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNS_ServiceCDCs(), this.getServiceCDCs(), this.getServiceCDCs_ParentServiceNS(),
                "serviceCDCs", null, 0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( serviceNsUsageEClass, ServiceNsUsage.class, "ServiceNsUsage", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceNsUsage_AppliesTo(), this.getAppliesToType(),
                this.getAppliesToType_ParentServiceNsUsage(), "appliesTo", null, 0, -1, ServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceNsUsage_ParentApplicableServiceNS(), this.getApplicableServiceNS(),
                this.getApplicableServiceNS_ServiceNsUsage(), "parentApplicableServiceNS", null, 0, 1,
                ServiceNsUsage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( serviceParameterEClass, ServiceParameter.class, "ServiceParameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceParameter_ParentCDC(), this.getCDC(), this.getCDC_ServiceParameter(), "parentCDC",
                null, 0, 1, ServiceParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getServiceParameter__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( serviceTypeRealizationsEClass, ServiceTypeRealizations.class, "ServiceTypeRealizations",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceTypeRealizations_ServiceTypeRealization(), this.getConstructedAttribute(),
                this.getConstructedAttribute_ParentServiceTypeRealizations(), "serviceTypeRealization", null, 0, -1,
                ServiceTypeRealizations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getServiceTypeRealizations_ParentServiceNS(), this.getServiceNS(),
                this.getServiceNS_ServiceTypeRealizations(), "parentServiceNS", null, 0, 1,
                ServiceTypeRealizations.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( subDataAttributeEClass, SubDataAttribute.class, "SubDataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSubDataAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getSubDataAttribute_ParentConstructedAttribute(), this.getConstructedAttribute(),
                this.getConstructedAttribute_SubDataAttribute(), "parentConstructedAttribute", null, 0, 1,
                SubDataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getSubDataAttribute_RefersToPresenceCondition(), this.getPresenceCondition(),
                this.getPresenceCondition_ReferredBySubDataAttribute(), "refersToPresenceCondition", null, 0, 1,
                SubDataAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getSubDataAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( subDataObjectEClass, SubDataObject.class, "SubDataObject", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSubDataObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubDataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, SubDataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getSubDataObject_ParentCDC(), this.getCDC(), this.getCDC_SubDataObject(), "parentCDC", null, 0,
                1, SubDataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getSubDataObject_RefersToCDC(), this.getCDC(), this.getCDC_ReferredBySubDataObject(),
                "refersToCDC", null, 0, 1, SubDataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getSubDataObject_RefersToPresenceCondition(), this.getPresenceCondition(),
                this.getPresenceCondition_ReferredBySubDataObject(), "refersToPresenceCondition", null, 0, 1,
                SubDataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getSubDataObject_RefersToSizeAttribute(), this.getDataAttribute(),
                this.getDataAttribute_ReferredBySubDataObjectAsSizeAttribute(), "refersToSizeAttribute", null, 0, 1,
                SubDataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getSubDataObject_RefersToMaxIndexAttribute(), this.getDataAttribute(),
                this.getDataAttribute_ReferredBySubDataObjectAsMaxIndexAttribute(), "refersToMaxIndexAttribute", null,
                0, 1, SubDataObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getSubDataObject__NameAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "nameAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getSubDataObject__TypeAttributeRequired__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
                "typeAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( titledClassEClass, TitledClass.class, "TitledClass", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTitledClass_TitleID(), ecorePackage.getEString(), "titleID", null, 0, 1, TitledClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTitledClass_RefersToTitleDoc(), this.getDoc(), this.getDoc_ReferredByTitledClass(),
                "refersToTitleDoc", null, 0, 1, TitledClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        op = initEOperation( getTitledClass__TitleIDAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "titleIDAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( nsdObjectEClass, NsdObject.class, "NsdObject", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNsdObject_LineNumber(), ecorePackage.getEInt(), "lineNumber", "-1", 1, 1, NsdObject.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNsdObject_ExplicitLinksBuilt(), ecorePackage.getEBoolean(), "explicitLinksBuilt", "false", 1,
                1, NsdObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        op = initEOperation( getNsdObject__BuildExplicitLinks__IRiseClipseConsole(), ecorePackage.getEBoolean(),
                "buildExplicitLinks", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, this.getIRiseClipseConsole(), "console", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( agNSIdentificationEClass, AgNSIdentification.class, "AgNSIdentification", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgNSIdentification_Release(), ecorePackage.getEIntegerObject(), "release", "1", 0, 1,
                AgNSIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgNSIdentification_Version(), ecorePackage.getEIntegerObject(), "version", null, 0, 1,
                AgNSIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgNSIdentification_Id(), ecorePackage.getEString(), "id", null, 0, 1,
                AgNSIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgNSIdentification_Revision(), ecorePackage.getEString(), "revision", "A", 0, 1,
                AgNSIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgNSIdentification_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1,
                AgNSIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        op = initEOperation( getAgNSIdentification__IdAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "idAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        op = initEOperation( getAgNSIdentification__VersionAttributeRequired__DiagnosticChain_Map(),
                ecorePackage.getEBoolean(), "versionAttributeRequired", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );
        g1 = createEGenericType( ecorePackage.getEMap() );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        g2 = createEGenericType( ecorePackage.getEJavaObject() );
        g1.getETypeArguments().add( g2 );
        addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass( agPresenceConditionEClass, AgPresenceCondition.class, "AgPresenceCondition", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgPresenceCondition_PresCond(), ecorePackage.getEString(), "presCond", "M", 0, 1,
                AgPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgPresenceCondition_PresCondArgs(), ecorePackage.getEString(), "presCondArgs", null, 0, 1,
                AgPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgPresenceCondition_PresCondArgsID(), ecorePackage.getEString(), "presCondArgsID", null, 0,
                1, AgPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAgPresenceCondition_RefersToPresCondArgsDoc(), this.getDoc(),
                this.getDoc_ReferredByAgPresenceCondition(), "refersToPresCondArgsDoc", null, 0, 1,
                AgPresenceCondition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( agPresenceConditionDerivedStatisticsEClass, AgPresenceConditionDerivedStatistics.class,
                "AgPresenceConditionDerivedStatistics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgPresenceConditionDerivedStatistics_DsPresCond(), ecorePackage.getEString(), "dsPresCond",
                "M", 0, 1, AgPresenceConditionDerivedStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgPresenceConditionDerivedStatistics_DsPresCondArgs(), ecorePackage.getEString(),
                "dsPresCondArgs", null, 0, 1, AgPresenceConditionDerivedStatistics.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgPresenceConditionDerivedStatistics_DsPresCondArgsID(), ecorePackage.getEString(),
                "dsPresCondArgsID", null, 0, 1, AgPresenceConditionDerivedStatistics.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAgPresenceConditionDerivedStatistics_RefersToDsPresCondArgsDoc(), this.getDoc(),
                this.getDoc_ReferredByAgPresenceConditionDerivedStatistics(), "refersToDsPresCondArgsDoc", null, 0, 1,
                AgPresenceConditionDerivedStatistics.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( agArrayEClass, AgArray.class, "AgArray", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgArray_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1, AgArray.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgArray_MaxIndexAttribute(), ecorePackage.getEString(), "maxIndexAttribute", null, 0, 1,
                AgArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgArray_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1, AgArray.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgArray_SizeAttribute(), ecorePackage.getEString(), "sizeAttribute", null, 0, 1,
                AgArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( agTrgOpEClass, AgTrgOp.class, "AgTrgOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgTrgOp_Dchg(), theXMLTypePackage.getBoolean(), "dchg", "false", 0, 1, AgTrgOp.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgTrgOp_Dupd(), theXMLTypePackage.getBoolean(), "dupd", "false", 0, 1, AgTrgOp.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgTrgOp_Qchg(), theXMLTypePackage.getBoolean(), "qchg", "false", 0, 1, AgTrgOp.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( agAttributeTypeEClass, AgAttributeType.class, "AgAttributeType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgAttributeType_Type(), ecorePackage.getEString(), "type", null, 0, 1, AgAttributeType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgAttributeType_TypeKind(), this.getAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                AgAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEReference( getAgAttributeType_RefersToBasicType(), this.getBasicType(),
                this.getBasicType_ReferredByAttributeType(), "refersToBasicType", null, 0, 1, AgAttributeType.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );
        initEReference( getAgAttributeType_RefersToConstructedAttribute(), this.getConstructedAttribute(),
                this.getConstructedAttribute_ReferredByAttributeType(), "refersToConstructedAttribute", null, 0, 1,
                AgAttributeType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getAgAttributeType_RefersToEnumeration(), this.getEnumeration(),
                this.getEnumeration_ReferredByAttributeType(), "refersToEnumeration", null, 0, 1, AgAttributeType.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED );

        initEClass( agAttributeTypeAndValuesEClass, AgAttributeTypeAndValues.class, "AgAttributeTypeAndValues",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgAttributeTypeAndValues_DefaultValue(), theXMLTypePackage.getNormalizedString(),
                "defaultValue", null, 0, 1, AgAttributeTypeAndValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgAttributeTypeAndValues_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                AgAttributeTypeAndValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgAttributeTypeAndValues_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                AgAttributeTypeAndValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( agUnderlyingTypeEClass, AgUnderlyingType.class, "AgUnderlyingType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgUnderlyingType_UnderlyingType(), ecorePackage.getEString(), "underlyingType", null, 0, 1,
                AgUnderlyingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgUnderlyingType_UnderlyingTypeKind(), this.getDefinedAttributeTypeKind(),
                "underlyingTypeKind", null, 0, 1, AgUnderlyingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAgUnderlyingType_RefersToUnderlyingBasicType(), this.getBasicType(),
                this.getBasicType_ReferredByUnderlyingType(), "refersToUnderlyingBasicType", null, 0, 1,
                AgUnderlyingType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getAgUnderlyingType_RefersToUnderlyingConstructedAttribute(), this.getConstructedAttribute(),
                this.getConstructedAttribute_ReferredByUnderlyingType(), "refersToUnderlyingConstructedAttribute", null,
                0, 1, AgUnderlyingType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );
        initEReference( getAgUnderlyingType_RefersToUnderlyingEnumeration(), this.getEnumeration(),
                this.getEnumeration_ReferredByUnderlyingType(), "refersToUnderlyingEnumeration", null, 0, 1,
                AgUnderlyingType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( agUMLEClass, AgUML.class, "AgUML", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgUML_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1, AgUML.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAgUML_UmlVersion(), ecorePackage.getEString(), "umlVersion", null, 0, 1, AgUML.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( agNSdescEClass, AgNSdesc.class, "AgNSdesc", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAgNSdesc_DescID(), ecorePackage.getEString(), "descID", null, 0, 1, AgNSdesc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getAgNSdesc_RefersToDoc(), this.getDoc(), this.getDoc_ReferredByAgNSDesc(), "refersToDoc", null,
                0, 1, AgNSdesc.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED );

        initEClass( iRiseClipseConsoleEClass, IRiseClipseConsole.class, "IRiseClipseConsole", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS );

        // Initialize enums and add enum literals
        initEEnum( acsiServicesKindEEnum, ACSIServicesKind.class, "ACSIServicesKind" );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.ASSOCIATE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.ABORT );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.RELEASE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_SERVER_DIRECTORY );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_LOGICAL_DEVICE_DIRECTORY );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_ALL_DATA_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_DATA_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_DATA_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_DATA_DIRECTORY );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_DATA_DEFINITION );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_DATA_SET_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_DATA_SET_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.CREATE_DATA_SET );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.DELETE_DATA_SET );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_DATA_SET_DIRECTORY );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SELECT_ACTIVE_SG );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SELECT_EDIT_SG );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_EDIT_SG_VALUE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.CONFIRM_EDIT_SG_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_EDIT_SG_VALUE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_SGCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.REPORT );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_BRCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_BRCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_URCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_URCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_LCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_LCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.QUERY_LOG_BY_TIME );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.QUERY_LOG_AFTER );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_LOG_STATUS_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SEND_GOOSE_MESSAGE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_GO_CB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_GO_CB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_GO_REFERENCE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_GOOSE_ELEMENT_NUMBER );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SEND_MSV_MESSAGE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_MSVCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_MSVCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SEND_USV_MESSAGE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_USVCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_USVCB_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SELECT );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SELECT_WITH_VALUE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.CANCEL );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.OPERATE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.COMMAND_TERMINATION );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.TIME_ACTIVATED_OPERATE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_FILE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.SET_FILE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.DELETE_FILE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_FILE_ATTRIBUTE_VALUES );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.TIME_SYNCHRONIZATION );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.INTERNAL_CHANGE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_LOGICAL_NODE_DIRECTORY );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_MSV_REFERENCE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_MSV_ELEMENT_NUMBER );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_USV_REFERENCE );
        addEEnumLiteral( acsiServicesKindEEnum, ACSIServicesKind.GET_USV_ELEMENT_NUMBER );

        initEEnum( cbKindEEnum, CBKind.class, "CBKind" );
        addEEnumLiteral( cbKindEEnum, CBKind.RCB );
        addEEnumLiteral( cbKindEEnum, CBKind.LCB );
        addEEnumLiteral( cbKindEEnum, CBKind.GO_CB );
        addEEnumLiteral( cbKindEEnum, CBKind.SVCB );

        initEEnum( definedAttributeTypeKindEEnum, DefinedAttributeTypeKind.class, "DefinedAttributeTypeKind" );
        addEEnumLiteral( definedAttributeTypeKindEEnum, DefinedAttributeTypeKind.BASIC );
        addEEnumLiteral( definedAttributeTypeKindEEnum, DefinedAttributeTypeKind.ENUMERATED );
        addEEnumLiteral( definedAttributeTypeKindEEnum, DefinedAttributeTypeKind.CONSTRUCTED );

        initEEnum( licenseKindEEnum, LicenseKind.class, "LicenseKind" );
        addEEnumLiteral( licenseKindEEnum, LicenseKind.STANDARD );
        addEEnumLiteral( licenseKindEEnum, LicenseKind.PRIVATE );
        addEEnumLiteral( licenseKindEEnum, LicenseKind.NONE );

        initEEnum( pubStageEEnum, PubStage.class, "PubStage" );
        addEEnumLiteral( pubStageEEnum, PubStage.WD );
        addEEnumLiteral( pubStageEEnum, PubStage.CD );
        addEEnumLiteral( pubStageEEnum, PubStage.CDV );
        addEEnumLiteral( pubStageEEnum, PubStage.DTS );
        addEEnumLiteral( pubStageEEnum, PubStage.DTR );
        addEEnumLiteral( pubStageEEnum, PubStage.FDIS );
        addEEnumLiteral( pubStageEEnum, PubStage.TS );
        addEEnumLiteral( pubStageEEnum, PubStage.TR );
        addEEnumLiteral( pubStageEEnum, PubStage.IS );

        initEEnum( undefinedAttributeTypeKindEEnum, UndefinedAttributeTypeKind.class, "UndefinedAttributeTypeKind" );
        addEEnumLiteral( undefinedAttributeTypeKindEEnum, UndefinedAttributeTypeKind.UNDEFINED );

        // Initialize data types
        initEDataType( acsiServicesKindObjectEDataType, ACSIServicesKind.class, "ACSIServicesKindObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );
        initEDataType( attributeTypeKindEDataType, Enumerator.class, "AttributeTypeKind", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( cbKindObjectEDataType, CBKind.class, "CBKindObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( definedAttributeTypeKindObjectEDataType, DefinedAttributeTypeKind.class,
                "DefinedAttributeTypeKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );
        initEDataType( licenseKindObjectEDataType, LicenseKind.class, "LicenseKindObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( pubStageObjectEDataType, PubStage.class, "PubStageObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( undefinedAttributeTypeKindObjectEDataType, UndefinedAttributeTypeKind.class,
                "UndefinedAttributeTypeKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource( eNS_URI );

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
        createPivotAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";
        addAnnotation( this,
                source,
                new String[] {
                } );
        addAnnotation( serviceTypeEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( abbreviationEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( abbreviationsEClass,
                source,
                new String[] {
                        "constraints", "uniqueAbbreviation"
                } );
        addAnnotation( abstractLNClassEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( anyLNClassEClass,
                source,
                new String[] {
                        "constraints", "uniqueDataObject"
                } );
        addAnnotation( applicableServiceNSEClass,
                source,
                new String[] {
                        "constraints", "dateAttributeRequired"
                } );
        addAnnotation( applicableServicesEClass,
                source,
                new String[] {
                        "constraints", "uniqueService"
                } );
        addAnnotation( basicTypeEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( cdcEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( cdCsEClass,
                source,
                new String[] {
                        "constraints", "uniqueCDC"
                } );
        addAnnotation( changesEClass,
                source,
                new String[] {
                        "constraints", "versionAttributeRequired"
                } );
        addAnnotation( constructedAttributeEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( constructedAttributesEClass,
                source,
                new String[] {
                        "constraints", "uniqueConstructedAttribute"
                } );
        addAnnotation( dataAttributeEClass,
                source,
                new String[] {
                        "constraints", "fcAttributeRequired"
                } );
        addAnnotation( dataObjectEClass,
                source,
                new String[] {
                        "constraints", "typeAttributeRequired"
                } );
        addAnnotation( dataSetMemberOfEClass,
                source,
                new String[] {
                        "constraints", "cbAttributeRequired"
                } );
        addAnnotation( docEClass,
                source,
                new String[] {
                        "constraints", "idAttributeRequired"
                } );
        addAnnotation( enumerationEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( enumerationsEClass,
                source,
                new String[] {
                        "constraints", "uniqueEnumeration"
                } );
        addAnnotation( functionalConstraintEClass,
                source,
                new String[] {
                        "constraints", "abbreviationAttributeRequired"
                } );
        addAnnotation( functionalConstraintsEClass,
                source,
                new String[] {
                        "constraints", "uniqueFunctionalConstraint"
                } );
        addAnnotation( literalEClass,
                source,
                new String[] {
                        "constraints", "literalValAttributeRequired"
                } );
        addAnnotation( lnClassEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( lnClassesEClass,
                source,
                new String[] {
                        "constraints", "uniqueAbstractLNClass"
                } );
        addAnnotation( nsDocEClass,
                source,
                new String[] {
                        "constraints", "langAttributeRequired"
                } );
        addAnnotation( presenceConditionEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( presenceConditionsEClass,
                source,
                new String[] {
                        "constraints", "uniquePresenceCondition"
                } );
        addAnnotation( serviceCDCEClass,
                source,
                new String[] {
                        "constraints", "cdcAttributeRequired"
                } );
        addAnnotation( serviceDataAttributeEClass,
                source,
                new String[] {
                        "constraints", "fcAttributeRequired"
                } );
        addAnnotation( serviceParameterEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( subDataAttributeEClass,
                source,
                new String[] {
                        "constraints", "nameAttributeRequired"
                } );
        addAnnotation( subDataObjectEClass,
                source,
                new String[] {
                        "constraints", "typeAttributeRequired"
                } );
        addAnnotation( titledClassEClass,
                source,
                new String[] {
                        "constraints", "titleIDAttributeRequired"
                } );
        addAnnotation( agNSIdentificationEClass,
                source,
                new String[] {
                        "constraints", "versionAttributeRequired"
                } );
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation( appliesToTypeEClass,
                source,
                new String[] {
                        "name", "AppliesTo_._type",
                        "kind", "empty"
                } );
        addAnnotation( dependsOnEClass,
                source,
                new String[] {
                        "name", "DependsOn_._type",
                        "kind", "empty"
                } );
        addAnnotation( documentRootEClass,
                source,
                new String[] {
                        "name", "",
                        "kind", "mixed"
                } );
        addAnnotation( getDocumentRoot_Mixed(),
                source,
                new String[] {
                        "kind", "elementWildcard",
                        "name", ":mixed"
                } );
        addAnnotation( getDocumentRoot_XMLNSPrefixMap(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "xmlns:prefix"
                } );
        addAnnotation( getDocumentRoot_XSISchemaLocation(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "xsi:schemaLocation"
                } );
        addAnnotation( getDocumentRoot_ApplicableServiceNS(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ApplicableServiceNS",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getDocumentRoot_NS(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "NS",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getDocumentRoot_NSDoc(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "NSDoc",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getDocumentRoot_ServiceNS(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceNS",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( serviceTypeEClass,
                source,
                new String[] {
                        "name", "Service_._type",
                        "kind", "empty"
                } );
        addAnnotation( getServiceType_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( abbreviationEClass,
                source,
                new String[] {
                        "name", "tAbbreviation",
                        "kind", "empty"
                } );
        addAnnotation( getAbbreviation_DescID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "descID"
                } );
        addAnnotation( getAbbreviation_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( abbreviationsEClass,
                source,
                new String[] {
                        "name", "tAbbreviations",
                        "kind", "elementOnly"
                } );
        addAnnotation( getAbbreviations_Abbreviation(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Abbreviation",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( abstractLNClassEClass,
                source,
                new String[] {
                        "name", "tAbstractLNClass",
                        "kind", "elementOnly"
                } );
        addAnnotation( getAbstractLNClass_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( acsiServicesKindEEnum,
                source,
                new String[] {
                        "name", "tACSIServicesKind"
                } );
        addAnnotation( acsiServicesKindObjectEDataType,
                source,
                new String[] {
                        "name", "tACSIServicesKind:Object",
                        "baseType", "tACSIServicesKind"
                } );
        addAnnotation( anyLNClassEClass,
                source,
                new String[] {
                        "name", "tAnyLNClass",
                        "kind", "elementOnly"
                } );
        addAnnotation( getAnyLNClass_DataObject(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "DataObject",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getAnyLNClass_Base(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "base"
                } );
        addAnnotation( applicableServiceNSEClass,
                source,
                new String[] {
                        "name", "tApplicableServiceNS",
                        "kind", "elementOnly"
                } );
        addAnnotation( getApplicableServiceNS_ServiceNsUsage(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceNsUsage",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getApplicableServiceNS_Date(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "date"
                } );
        addAnnotation( getApplicableServiceNS_Version(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "version"
                } );
        addAnnotation( applicableServicesEClass,
                source,
                new String[] {
                        "name", "tApplicableServices",
                        "kind", "elementOnly"
                } );
        addAnnotation( getApplicableServices_Service(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Service",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getApplicableServices_DataSetMemberOf(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "DataSetMemberOf",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( attributeTypeKindEDataType,
                source,
                new String[] {
                        "name", "tAttributeTypeKind",
                        "memberTypes", "tDefinedAttributeTypeKind tUndefinedAttributeTypeKind"
                } );
        addAnnotation( basicTypeEClass,
                source,
                new String[] {
                        "name", "tBasicType",
                        "kind", "empty"
                } );
        addAnnotation( getBasicType_DescID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "descID"
                } );
        addAnnotation( getBasicType_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( basicTypesEClass,
                source,
                new String[] {
                        "name", "tBasicTypes",
                        "kind", "elementOnly"
                } );
        addAnnotation( getBasicTypes_BasicType(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "BasicType",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( cbKindEEnum,
                source,
                new String[] {
                        "name", "tCBKind"
                } );
        addAnnotation( cbKindObjectEDataType,
                source,
                new String[] {
                        "name", "tCBKind:Object",
                        "baseType", "tCBKind"
                } );
        addAnnotation( cdcEClass,
                source,
                new String[] {
                        "name", "tCDC",
                        "kind", "elementOnly"
                } );
        addAnnotation( getCDC_SubDataObject(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "SubDataObject",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getCDC_DataAttribute(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "DataAttribute",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getCDC_ServiceParameter(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceParameter",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getCDC_EnumParameterized(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "enumParameterized"
                } );
        addAnnotation( getCDC_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( getCDC_Statistics(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "statistics"
                } );
        addAnnotation( getCDC_TypeKindParameterized(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "typeKindParameterized"
                } );
        addAnnotation( getCDC_Variant(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "variant"
                } );
        addAnnotation( cdCsEClass,
                source,
                new String[] {
                        "name", "tCDCs",
                        "kind", "elementOnly"
                } );
        addAnnotation( getCDCs_CDC(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "CDC",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( changesEClass,
                source,
                new String[] {
                        "name", "tChanges",
                        "kind", "empty"
                } );
        addAnnotation( getChanges_ChangesID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "changesID"
                } );
        addAnnotation( getChanges_Date(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "date"
                } );
        addAnnotation( getChanges_Revision(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "revision"
                } );
        addAnnotation( getChanges_Tissues(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "tissues"
                } );
        addAnnotation( getChanges_Release(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "release"
                } );
        addAnnotation( getChanges_Version(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "version"
                } );
        addAnnotation( constructedAttributeEClass,
                source,
                new String[] {
                        "name", "tConstructedAttribute",
                        "kind", "elementOnly"
                } );
        addAnnotation( getConstructedAttribute_SubDataAttribute(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "SubDataAttribute",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getConstructedAttribute_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( constructedAttributesEClass,
                source,
                new String[] {
                        "name", "tConstructedAttributes",
                        "kind", "elementOnly"
                } );
        addAnnotation( getConstructedAttributes_ConstructedAttribute(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ConstructedAttribute",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( copyrightedEClass,
                source,
                new String[] {
                        "name", "tCopyrighted",
                        "kind", "elementOnly"
                } );
        addAnnotation( getCopyrighted_Copyright(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Copyright",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( copyrightNoticeEClass,
                source,
                new String[] {
                        "name", "tCopyrightNotice",
                        "kind", "elementOnly"
                } );
        addAnnotation( getCopyrightNotice_Notice(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Notice",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getCopyrightNotice_License(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "License",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( dataAttributeEClass,
                source,
                new String[] {
                        "name", "tDataAttribute",
                        "kind", "empty"
                } );
        addAnnotation( getDataAttribute_Fc(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "fc"
                } );
        addAnnotation( getDataAttribute_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( dataObjectEClass,
                source,
                new String[] {
                        "name", "tDataObject",
                        "kind", "empty"
                } );
        addAnnotation( getDataObject_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( getDataObject_Transient(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "transient"
                } );
        addAnnotation( getDataObject_Type(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "type"
                } );
        addAnnotation( dataSetMemberOfEClass,
                source,
                new String[] {
                        "name", "tDataSetMemberOf",
                        "kind", "empty"
                } );
        addAnnotation( getDataSetMemberOf_Cb(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "cb"
                } );
        addAnnotation( definedAttributeTypeKindEEnum,
                source,
                new String[] {
                        "name", "tDefinedAttributeTypeKind"
                } );
        addAnnotation( definedAttributeTypeKindObjectEDataType,
                source,
                new String[] {
                        "name", "tDefinedAttributeTypeKind:Object",
                        "baseType", "tDefinedAttributeTypeKind"
                } );
        addAnnotation( docEClass,
                source,
                new String[] {
                        "name", "tDoc",
                        "kind", "mixed"
                } );
        addAnnotation( getDoc_Mixed(),
                source,
                new String[] {
                        "kind", "elementWildcard",
                        "name", ":mixed"
                } );
        addAnnotation( getDoc_Group(),
                source,
                new String[] {
                        "kind", "group",
                        "name", "group:1"
                } );
        addAnnotation( getDoc_Any(),
                source,
                new String[] {
                        "kind", "elementWildcard",
                        "wildcards", "##any",
                        "name", ":2",
                        "processing", "lax",
                        "group", "#group:1"
                } );
        addAnnotation( getDoc_Id(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "id"
                } );
        addAnnotation( documentedClassEClass,
                source,
                new String[] {
                        "name", "tDocumentedClass",
                        "kind", "empty"
                } );
        addAnnotation( getDocumentedClass_Deprecated(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "deprecated"
                } );
        addAnnotation( getDocumentedClass_DescID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "descID"
                } );
        addAnnotation( getDocumentedClass_Informative(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "informative"
                } );
        addAnnotation( enumerationEClass,
                source,
                new String[] {
                        "name", "tEnumeration",
                        "kind", "elementOnly"
                } );
        addAnnotation( getEnumeration_Literal(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Literal",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getEnumeration_InheritedFrom(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "inheritedFrom"
                } );
        addAnnotation( getEnumeration_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( enumerationsEClass,
                source,
                new String[] {
                        "name", "tEnumerations",
                        "kind", "elementOnly"
                } );
        addAnnotation( getEnumerations_Enumeration(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Enumeration",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( functionalConstraintEClass,
                source,
                new String[] {
                        "name", "tFunctionalConstraint",
                        "kind", "elementOnly"
                } );
        addAnnotation( getFunctionalConstraint_ApplicableServices(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ApplicableServices",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getFunctionalConstraint_Abbreviation(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "abbreviation"
                } );
        addAnnotation( getFunctionalConstraint_DescID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "descID"
                } );
        addAnnotation( getFunctionalConstraint_TitleID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "titleID"
                } );
        addAnnotation( functionalConstraintsEClass,
                source,
                new String[] {
                        "name", "tFunctionalConstraints",
                        "kind", "elementOnly"
                } );
        addAnnotation( getFunctionalConstraints_FunctionalConstraint(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "FunctionalConstraint",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( licenseEClass,
                source,
                new String[] {
                        "name", "tLicense",
                        "kind", "mixed"
                } );
        addAnnotation( getLicense_Mixed(),
                source,
                new String[] {
                        "kind", "elementWildcard",
                        "name", ":mixed"
                } );
        addAnnotation( getLicense_Kind(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "kind"
                } );
        addAnnotation( getLicense_Uri(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "uri"
                } );
        addAnnotation( licenseKindEEnum,
                source,
                new String[] {
                        "name", "tLicenseKind"
                } );
        addAnnotation( licenseKindObjectEDataType,
                source,
                new String[] {
                        "name", "tLicenseKind:Object",
                        "baseType", "tLicenseKind"
                } );
        addAnnotation( literalEClass,
                source,
                new String[] {
                        "name", "tLiteral",
                        "kind", "empty"
                } );
        addAnnotation( getLiteral_LiteralVal(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "literalVal"
                } );
        addAnnotation( getLiteral_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( lnClassEClass,
                source,
                new String[] {
                        "name", "tLNClass",
                        "kind", "elementOnly"
                } );
        addAnnotation( getLNClass_CanHaveLOG(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "canHaveLOG"
                } );
        addAnnotation( getLNClass_IsExtension(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "isExtension"
                } );
        addAnnotation( getLNClass_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( lnClassesEClass,
                source,
                new String[] {
                        "name", "tLNClasses",
                        "kind", "elementOnly"
                } );
        addAnnotation( getLNClasses_AbstractLNClass(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "AbstractLNClass",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getLNClasses_LNClass(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "LNClass",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( noticeEClass,
                source,
                new String[] {
                        "name", "tNotice",
                        "kind", "mixed"
                } );
        addAnnotation( getNotice_Mixed(),
                source,
                new String[] {
                        "kind", "elementWildcard",
                        "name", ":mixed"
                } );
        addAnnotation( nsEClass,
                source,
                new String[] {
                        "name", "tNS",
                        "kind", "elementOnly"
                } );
        addAnnotation( getNS_Changes(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Changes",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_DependsOn(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "DependsOn",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_BasicTypes(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "BasicTypes",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_FunctionalConstraints(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "FunctionalConstraints",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_PresenceConditions(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "PresenceConditions",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_Abbreviations(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Abbreviations",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_Enumerations(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Enumerations",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_ConstructedAttributes(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ConstructedAttributes",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_CDCs(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "CDCs",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNS_LNClasses(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "LNClasses",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( nsDocEClass,
                source,
                new String[] {
                        "name", "tNSDoc",
                        "kind", "elementOnly"
                } );
        addAnnotation( getNSDoc_Doc(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Doc",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getNSDoc_Lang(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "lang"
                } );
        addAnnotation( presenceConditionEClass,
                source,
                new String[] {
                        "name", "tPresenceCondition",
                        "kind", "empty"
                } );
        addAnnotation( getPresenceCondition_Argument(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "argument"
                } );
        addAnnotation( getPresenceCondition_DescID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "descID"
                } );
        addAnnotation( getPresenceCondition_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( getPresenceCondition_TitleID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "titleID"
                } );
        addAnnotation( presenceConditionsEClass,
                source,
                new String[] {
                        "name", "tPresenceConditions",
                        "kind", "elementOnly"
                } );
        addAnnotation( getPresenceConditions_PresenceCondition(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "PresenceCondition",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( pubStageEEnum,
                source,
                new String[] {
                        "name", "tPubStage"
                } );
        addAnnotation( pubStageObjectEDataType,
                source,
                new String[] {
                        "name", "tPubStage:Object",
                        "baseType", "tPubStage"
                } );
        addAnnotation( serviceCDCEClass,
                source,
                new String[] {
                        "name", "tServiceCDC",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceCDC_ServiceDataAttribute(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceDataAttribute",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceCDC_Cdc(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "cdc"
                } );
        addAnnotation( getServiceCDC_Variant(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "variant"
                } );
        addAnnotation( serviceCDCsEClass,
                source,
                new String[] {
                        "name", "tServiceCDCs",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceCDCs_ServiceCDC(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceCDC",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( serviceConstructedAttributeEClass,
                source,
                new String[] {
                        "name", "tServiceConstructedAttribute",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceConstructedAttribute_TypeKindParameterized(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "typeKindParameterized"
                } );
        addAnnotation( serviceConstructedAttributesEClass,
                source,
                new String[] {
                        "name", "tServiceConstructedAttributes",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceConstructedAttributes_ServiceConstructedAttribute(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceConstructedAttribute",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( serviceDataAttributeEClass,
                source,
                new String[] {
                        "name", "tServiceDataAttribute",
                        "kind", "empty"
                } );
        addAnnotation( getServiceDataAttribute_Fc(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "fc"
                } );
        addAnnotation( getServiceDataAttribute_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( serviceNSEClass,
                source,
                new String[] {
                        "name", "tServiceNS",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceNS_Changes(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Changes",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceNS_FunctionalConstraints(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "FunctionalConstraints",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceNS_PresenceConditions(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "PresenceConditions",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceNS_Abbreviations(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "Abbreviations",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceNS_ServiceTypeRealizations(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceTypeRealizations",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceNS_ServiceConstructedAttributes(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceConstructedAttributes",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( getServiceNS_ServiceCDCs(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceCDCs",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( serviceNsUsageEClass,
                source,
                new String[] {
                        "name", "tServiceNsUsage",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceNsUsage_AppliesTo(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "AppliesTo",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( serviceParameterEClass,
                source,
                new String[] {
                        "name", "tServiceParameter",
                        "kind", "empty"
                } );
        addAnnotation( getServiceParameter_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( serviceTypeRealizationsEClass,
                source,
                new String[] {
                        "name", "tServiceTypeRealizations",
                        "kind", "elementOnly"
                } );
        addAnnotation( getServiceTypeRealizations_ServiceTypeRealization(),
                source,
                new String[] {
                        "kind", "element",
                        "name", "ServiceTypeRealization",
                        "namespace", "##targetNamespace"
                } );
        addAnnotation( subDataAttributeEClass,
                source,
                new String[] {
                        "name", "tSubDataAttribute",
                        "kind", "empty"
                } );
        addAnnotation( getSubDataAttribute_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( subDataObjectEClass,
                source,
                new String[] {
                        "name", "tSubDataObject",
                        "kind", "empty"
                } );
        addAnnotation( getSubDataObject_Name(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "name"
                } );
        addAnnotation( getSubDataObject_Type(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "type"
                } );
        addAnnotation( titledClassEClass,
                source,
                new String[] {
                        "name", "tTitledClass",
                        "kind", "empty"
                } );
        addAnnotation( getTitledClass_TitleID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "titleID"
                } );
        addAnnotation( undefinedAttributeTypeKindEEnum,
                source,
                new String[] {
                        "name", "tUndefinedAttributeTypeKind"
                } );
        addAnnotation( undefinedAttributeTypeKindObjectEDataType,
                source,
                new String[] {
                        "name", "tUndefinedAttributeTypeKind:Object",
                        "baseType", "tUndefinedAttributeTypeKind"
                } );
        addAnnotation( getAgNSIdentification_Release(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "release"
                } );
        addAnnotation( getAgNSIdentification_Version(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "version"
                } );
        addAnnotation( getAgNSIdentification_Id(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "id"
                } );
        addAnnotation( getAgNSIdentification_Revision(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "revision"
                } );
        addAnnotation( getAgNSIdentification_PublicationStage(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "publicationStage"
                } );
        addAnnotation( getAgPresenceCondition_PresCond(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "presCond"
                } );
        addAnnotation( getAgPresenceCondition_PresCondArgs(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "presCondArgs"
                } );
        addAnnotation( getAgPresenceCondition_PresCondArgsID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "presCondArgsID"
                } );
        addAnnotation( getAgPresenceConditionDerivedStatistics_DsPresCond(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "dsPresCond"
                } );
        addAnnotation( getAgPresenceConditionDerivedStatistics_DsPresCondArgs(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "dsPresCondArgs"
                } );
        addAnnotation( getAgPresenceConditionDerivedStatistics_DsPresCondArgsID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "dsPresCondArgsID"
                } );
        addAnnotation( getAgArray_IsArray(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "isArray"
                } );
        addAnnotation( getAgArray_MaxIndexAttribute(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "maxIndexAttribute"
                } );
        addAnnotation( getAgArray_MinIndex(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "minIndex"
                } );
        addAnnotation( getAgArray_SizeAttribute(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "sizeAttribute"
                } );
        addAnnotation( getAgTrgOp_Dchg(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "dchg"
                } );
        addAnnotation( getAgTrgOp_Dupd(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "dupd"
                } );
        addAnnotation( getAgTrgOp_Qchg(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "qchg"
                } );
        addAnnotation( getAgAttributeType_Type(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "type"
                } );
        addAnnotation( getAgAttributeType_TypeKind(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "typeKind"
                } );
        addAnnotation( getAgAttributeTypeAndValues_DefaultValue(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "defaultValue"
                } );
        addAnnotation( getAgAttributeTypeAndValues_MaxValue(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "maxValue"
                } );
        addAnnotation( getAgAttributeTypeAndValues_MinValue(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "minValue"
                } );
        addAnnotation( getAgUnderlyingType_UnderlyingType(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "underlyingType"
                } );
        addAnnotation( getAgUnderlyingType_UnderlyingTypeKind(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "underlyingTypeKind"
                } );
        addAnnotation( getAgUML_UmlDate(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "umlDate"
                } );
        addAnnotation( getAgUML_UmlVersion(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "umlVersion"
                } );
        addAnnotation( getAgNSdesc_DescID(),
                source,
                new String[] {
                        "kind", "attribute",
                        "name", "descID"
                } );
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createPivotAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
        addAnnotation( getServiceType__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getAbbreviation__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getAbbreviations__UniqueAbbreviation__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'There shall not be two Abbreviations elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.abbreviation->isUnique( a : Abbreviation | a.name )\n}.status"
                } );
        addAnnotation( getAbstractLNClass__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getAnyLNClass__UniqueDataObject__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For an AnyLNClass, there shall not be two DataObject sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: base AbstractLNClass should be taken into account\n\t\t\t-- For this, explicit links have to be created first\n\t\t\tself.dataObject->isUnique( d : DataObject | d.name )\n}.status"
                } );
        addAnnotation( getApplicableServiceNS__VersionAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The version attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.version <> null\n}.status"
                } );
        addAnnotation( getApplicableServiceNS__DateAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The date attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.date <> null\n}.status"
                } );
        addAnnotation( getApplicableServices__UniqueDataSetMemberOf__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For an ApplicableServices, there shall not be two DataSetMemberOf sub-elements with same cb.\',\n\tstatus : Boolean = \n\t\t\tself.dataSetMemberOf->isUnique( d : DataSetMemberOf | d.cb )\n}.status"
                } );
        addAnnotation( getApplicableServices__UniqueService__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For an ApplicableServices, there shall not be two ServiceType sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.service->isUnique( s : ServiceType | s.name )\n}.status"
                } );
        addAnnotation( getBasicType__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getCDC__UniqueCDCChild__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.\',\n\tstatus : Boolean = \n\t\t\tlet names : Bag(String) = self.subDataObject.name->union(self.dataAttribute.name) in names->size() = names->asSet()->size()\n}.status"
                } );
        addAnnotation( getCDC__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getCDCs__UniqueCDC__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: DependsOn NS should be taken into account ?\n\t\t\t-- For this, explicit links have to be created first\n\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n\t\t\tself.cDC->select( c : CDC | c.variant = null )->isUnique( c : CDC | c.name )\n\t     or self.cDC->select( c : CDC | c.variant <> null )->forAll( c1, c2 : CDC | c1 <> c2 implies c1.name <> c2.name or c1.variant <> c2.variant )\n}.status"
                } );
        addAnnotation( getChanges__VersionAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The version attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.version <> null\n}.status"
                } );
        addAnnotation( getConstructedAttribute__UniqueSubDataAttribute__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.subDataAttribute->isUnique( s : SubDataAttribute | s.name )\n}.status"
                } );
        addAnnotation( getConstructedAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getConstructedAttributes__UniqueConstructedAttribute__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'Within an NS, there shall not be two ConstructedAttribute sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: DependsOn NS should be taken into account ?\n\t\t\t-- For this, explicit links have to be created first\n\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n\t\t\tself.constructedAttribute->isUnique( c : ConstructedAttribute | c.name )\n}.status"
                } );
        addAnnotation( getDataAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getDataAttribute__FcAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The fc attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.fc <> null\n}.status"
                } );
        addAnnotation( getDataObject__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getDataObject__TypeAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The type attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.type <> null\n}.status"
                } );
        addAnnotation( getDataSetMemberOf__CbAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The cb attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.cb <> null\n}.status"
                } );
        addAnnotation( getDoc__IdAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The id attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.id <> null\n}.status"
                } );
        addAnnotation( getEnumeration__UniqueLiteralName__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For an Enumeration, there shall not be two Literal sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: inherited literals should be taken into account\n\t\t\t-- For this, explicit links have to be created first\n\t\t\tself.literal->isUnique( l : Literal | l.name )\n}.status"
                } );
        addAnnotation( getEnumeration__UniqueLiteralVal__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'For an Enumeration, there shall not be two Literal sub-elements with same literalVal.\',\n\tstatus : Boolean = \n\t\t\tself.literal->isUnique( l : Literal | l.literalVal )\n}.status"
                } );
        addAnnotation( getEnumeration__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getEnumerations__UniqueEnumeration__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'Within an NS, there shall not be two Enumeration sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\t-- TODO: DependsOn NS should be taken into account ?\n\t\t\t-- For this, explicit links have to be created first\n\t\t\t-- Then, may be this constraint should be in NS and not in Enumerations ?\n\t\t\tself.enumeration->isUnique( e : Enumeration | e.name )\n}.status"
                } );
        addAnnotation( getFunctionalConstraint__AbbreviationAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The abbreviation attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.abbreviation <> null\n}.status"
                } );
        addAnnotation( getFunctionalConstraints__UniqueFunctionalConstraint__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'There shall not be two FunctionalConstraint elements with same abbreviation.\',\n\tstatus : Boolean = \n\t\t\tself.functionalConstraint->isUnique( f : FunctionalConstraint | f.abbreviation )\n}.status"
                } );
        addAnnotation( getLiteral__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getLiteral__LiteralValAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The literalVal attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.literalVal <> null\n}.status"
                } );
        addAnnotation( getLNClass__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getLNClasses__UniqueLNClass__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'Within an NS, there shall not be two LNClass sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.lNClass->isUnique( c : LNClass | c.name )\n}.status"
                } );
        addAnnotation( getLNClasses__UniqueAbstractLNClass__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'Within an NS, there shall not be two AbstractLNClass sub-elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.abstractLNClass->isUnique( c : AbstractLNClass | c.name )\n}.status"
                } );
        addAnnotation( getNSDoc__LangAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The lang attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.lang <> null\n}.status"
                } );
        addAnnotation( getPresenceCondition__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getPresenceConditions__UniquePresenceCondition__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'There shall not be two PresenceCondition elements with same name.\',\n\tstatus : Boolean = \n\t\t\tself.presenceCondition->isUnique( p : PresenceCondition | p.name )\n}.status"
                } );
        addAnnotation( getServiceCDC__CdcAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The cdc attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.cdc <> null\n}.status"
                } );
        addAnnotation( getServiceDataAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getServiceDataAttribute__FcAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The fc attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.fc <> null\n}.status"
                } );
        addAnnotation( getServiceParameter__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getSubDataAttribute__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getSubDataObject__NameAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The name attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.name <> null\n}.status"
                } );
        addAnnotation( getSubDataObject__TypeAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The type attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.type <> null\n}.status"
                } );
        addAnnotation( getTitledClass__TitleIDAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The titleID attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.titleID <> null\n}.status"
                } );
        addAnnotation( getAgNSIdentification__IdAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The id attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.id <> null\n}.status"
                } );
        addAnnotation( getAgNSIdentification__VersionAttributeRequired__DiagnosticChain_Map(),
                source,
                new String[] {
                        "body",
                        "Tuple {\n\tmessage : String = \'The version attribute is required\',\n\tstatus : Boolean = \n\t\t\tself.version <> null\n}.status"
                } );
    }

} //NsdPackageImpl
