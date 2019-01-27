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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdValidator;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
    private EClass dependsOnTypeEClass = null;

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
    private EClass serviceTypeRealizationEClass = null;

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
    private EDataType abbreviationNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType abstractLNClassNameEDataType = null;

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
    private EDataType attributeNameEDataType = null;

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
    private EDataType basicTypeNameEDataType = null;

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
    private EDataType cdcNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType dataObjectNameEDataType = null;

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
    private EDataType docIDEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType emptyStringEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType fcAbbreviationEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iec61850NameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iec61850NameStringEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType issuesTypeEDataType = null;

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
    private EDataType literalNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType lnClassNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nsIdentifierEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nsReleaseEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nsReleaseObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nsRevisionEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nsVersionEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nsVersionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType presenceConditionArgumentEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType presenceConditionNameEDataType = null;

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
    private EDataType subDataObjectNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType umlVersionEDataType = null;

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
        EValidator.Registry.INSTANCE.put( theNsdPackage, new EValidator.Descriptor() {
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
    public EAttribute getAppliesToType_Id() {
        return ( EAttribute ) appliesToTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAppliesToType_PublicationStage() {
        return ( EAttribute ) appliesToTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAppliesToType_Release() {
        return ( EAttribute ) appliesToTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAppliesToType_Revision() {
        return ( EAttribute ) appliesToTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAppliesToType_Version() {
        return ( EAttribute ) appliesToTypeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDependsOnType() {
        return dependsOnTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDependsOnType_Id() {
        return ( EAttribute ) dependsOnTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDependsOnType_PublicationStage() {
        return ( EAttribute ) dependsOnTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDependsOnType_Release() {
        return ( EAttribute ) dependsOnTypeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDependsOnType_Revision() {
        return ( EAttribute ) dependsOnTypeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDependsOnType_Version() {
        return ( EAttribute ) dependsOnTypeEClass.getEStructuralFeatures().get( 4 );
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
    public EReference getDocumentRoot_Copyright() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_NS() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_NSDoc() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDocumentRoot_ServiceNS() {
        return ( EReference ) documentRootEClass.getEStructuralFeatures().get( 7 );
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
    public EAttribute getChanges_Release() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Revision() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Tissues() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_Version() {
        return ( EAttribute ) changesEClass.getEStructuralFeatures().get( 5 );
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
    public EClass getDataAttribute() {
        return dataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Dchg() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_DefaultValue() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Dupd() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Fc() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_IsArray() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_MaxIndexAttribute() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_MaxValue() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_MinIndex() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_MinValue() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Name() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_PresCond() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_PresCondArgs() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_PresCondArgsID() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Qchg() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_SizeAttribute() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Type() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_TypeKind() {
        return ( EAttribute ) dataAttributeEClass.getEStructuralFeatures().get( 16 );
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
    public EAttribute getDataObject_DsPresCond() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_DsPresCondArgs() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_DsPresCondArgsID() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Name() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_PresCond() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_PresCondArgs() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_PresCondArgsID() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Transient() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Type() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_UnderlyingType() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_UnderlyingTypeKind() {
        return ( EAttribute ) dataObjectEClass.getEStructuralFeatures().get( 10 );
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
    public EAttribute getNS_DescID() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_Id() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_PublicationStage() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_Release() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_Revision() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_UmlDate() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_UmlVersion() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 16 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNS_Version() {
        return ( EAttribute ) nsEClass.getEStructuralFeatures().get( 17 );
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
    public EAttribute getNSDoc_Id() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_Lang() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_PublicationStage() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_Release() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_Revision() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_UmlDate() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_UmlVersion() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNSDoc_Version() {
        return ( EAttribute ) nsDocEClass.getEStructuralFeatures().get( 8 );
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
    public EAttribute getServiceDataAttribute_PresCond() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_PresCondArgs() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_PresCondArgsID() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_Type() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_TypeKind() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_UnderlyingType() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceDataAttribute_UnderlyingTypeKind() {
        return ( EAttribute ) serviceDataAttributeEClass.getEStructuralFeatures().get( 8 );
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
    public EAttribute getServiceNS_DescID() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_Id() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_PublicationStage() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_Release() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_Revision() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_UmlDate() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_UmlVersion() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNS_Version() {
        return ( EAttribute ) serviceNSEClass.getEStructuralFeatures().get( 14 );
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
    public EAttribute getServiceNsUsage_Id() {
        return ( EAttribute ) serviceNsUsageEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNsUsage_PublicationStage() {
        return ( EAttribute ) serviceNsUsageEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNsUsage_Release() {
        return ( EAttribute ) serviceNsUsageEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNsUsage_Revision() {
        return ( EAttribute ) serviceNsUsageEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceNsUsage_Version() {
        return ( EAttribute ) serviceNsUsageEClass.getEStructuralFeatures().get( 5 );
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
    public EAttribute getServiceParameter_DefaultValue() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameter_MaxValue() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameter_MinValue() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameter_Name() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameter_Type() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceParameter_TypeKind() {
        return ( EAttribute ) serviceParameterEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceTypeRealization() {
        return serviceTypeRealizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_Fc() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_Name() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_PresCond() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_PresCondArgs() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_PresCondArgsID() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_Type() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceTypeRealization_TypeKind() {
        return ( EAttribute ) serviceTypeRealizationEClass.getEStructuralFeatures().get( 6 );
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
    public EClass getSubDataAttribute() {
        return subDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_DefaultValue() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_IsArray() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_MaxIndexAttribute() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_MaxValue() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_MinIndex() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_MinValue() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_Name() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_PresCond() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_PresCondArgs() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_PresCondArgsID() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_SizeAttribute() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_Type() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataAttribute_TypeKind() {
        return ( EAttribute ) subDataAttributeEClass.getEStructuralFeatures().get( 12 );
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
    public EAttribute getSubDataObject_IsArray() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_MaxIndexAttribute() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_MinIndex() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_Name() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_PresCond() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_PresCondArgs() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_PresCondArgsID() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_SizeAttribute() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_Type() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_UnderlyingType() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubDataObject_UnderlyingTypeKind() {
        return ( EAttribute ) subDataObjectEClass.getEStructuralFeatures().get( 10 );
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
    public EDataType getAbbreviationName() {
        return abbreviationNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getAbstractLNClassName() {
        return abstractLNClassNameEDataType;
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
    public EDataType getAttributeName() {
        return attributeNameEDataType;
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
    public EDataType getBasicTypeName() {
        return basicTypeNameEDataType;
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
    public EDataType getCDCName() {
        return cdcNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getDataObjectName() {
        return dataObjectNameEDataType;
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
    public EDataType getDocID() {
        return docIDEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getEmptyString() {
        return emptyStringEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getFCAbbreviation() {
        return fcAbbreviationEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getIec61850Name() {
        return iec61850NameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getIec61850NameString() {
        return iec61850NameStringEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getissuesType() {
        return issuesTypeEDataType;
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
    public EDataType getLiteralName() {
        return literalNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getLNClassName() {
        return lnClassNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNSIdentifier() {
        return nsIdentifierEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNSRelease() {
        return nsReleaseEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNSReleaseObject() {
        return nsReleaseObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNSRevision() {
        return nsRevisionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNSVersion() {
        return nsVersionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNSVersionObject() {
        return nsVersionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getPresenceConditionArgument() {
        return presenceConditionArgumentEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getPresenceConditionName() {
        return presenceConditionNameEDataType;
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
    public EDataType getSubDataObjectName() {
        return subDataObjectNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getUMLVersion() {
        return umlVersionEDataType;
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
        createEAttribute( appliesToTypeEClass, APPLIES_TO_TYPE__ID );
        createEAttribute( appliesToTypeEClass, APPLIES_TO_TYPE__PUBLICATION_STAGE );
        createEAttribute( appliesToTypeEClass, APPLIES_TO_TYPE__RELEASE );
        createEAttribute( appliesToTypeEClass, APPLIES_TO_TYPE__REVISION );
        createEAttribute( appliesToTypeEClass, APPLIES_TO_TYPE__VERSION );

        dependsOnTypeEClass = createEClass( DEPENDS_ON_TYPE );
        createEAttribute( dependsOnTypeEClass, DEPENDS_ON_TYPE__ID );
        createEAttribute( dependsOnTypeEClass, DEPENDS_ON_TYPE__PUBLICATION_STAGE );
        createEAttribute( dependsOnTypeEClass, DEPENDS_ON_TYPE__RELEASE );
        createEAttribute( dependsOnTypeEClass, DEPENDS_ON_TYPE__REVISION );
        createEAttribute( dependsOnTypeEClass, DEPENDS_ON_TYPE__VERSION );

        documentRootEClass = createEClass( DOCUMENT_ROOT );
        createEAttribute( documentRootEClass, DOCUMENT_ROOT__MIXED );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
        createEReference( documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
        createEReference( documentRootEClass, DOCUMENT_ROOT__APPLICABLE_SERVICE_NS );
        createEReference( documentRootEClass, DOCUMENT_ROOT__COPYRIGHT );
        createEReference( documentRootEClass, DOCUMENT_ROOT__NS );
        createEReference( documentRootEClass, DOCUMENT_ROOT__NS_DOC );
        createEReference( documentRootEClass, DOCUMENT_ROOT__SERVICE_NS );

        serviceTypeEClass = createEClass( SERVICE_TYPE );
        createEAttribute( serviceTypeEClass, SERVICE_TYPE__NAME );

        abbreviationEClass = createEClass( ABBREVIATION );
        createEAttribute( abbreviationEClass, ABBREVIATION__DESC_ID );
        createEAttribute( abbreviationEClass, ABBREVIATION__NAME );

        abbreviationsEClass = createEClass( ABBREVIATIONS );
        createEReference( abbreviationsEClass, ABBREVIATIONS__ABBREVIATION );

        abstractLNClassEClass = createEClass( ABSTRACT_LN_CLASS );
        createEAttribute( abstractLNClassEClass, ABSTRACT_LN_CLASS__NAME );

        anyLNClassEClass = createEClass( ANY_LN_CLASS );
        createEReference( anyLNClassEClass, ANY_LN_CLASS__DATA_OBJECT );
        createEAttribute( anyLNClassEClass, ANY_LN_CLASS__BASE );

        applicableServiceNSEClass = createEClass( APPLICABLE_SERVICE_NS );
        createEReference( applicableServiceNSEClass, APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE );
        createEAttribute( applicableServiceNSEClass, APPLICABLE_SERVICE_NS__DATE );
        createEAttribute( applicableServiceNSEClass, APPLICABLE_SERVICE_NS__VERSION );

        applicableServicesEClass = createEClass( APPLICABLE_SERVICES );
        createEReference( applicableServicesEClass, APPLICABLE_SERVICES__SERVICE );
        createEReference( applicableServicesEClass, APPLICABLE_SERVICES__DATA_SET_MEMBER_OF );

        basicTypeEClass = createEClass( BASIC_TYPE );
        createEAttribute( basicTypeEClass, BASIC_TYPE__DESC_ID );
        createEAttribute( basicTypeEClass, BASIC_TYPE__NAME );

        basicTypesEClass = createEClass( BASIC_TYPES );
        createEReference( basicTypesEClass, BASIC_TYPES__BASIC_TYPE );

        cdcEClass = createEClass( CDC );
        createEReference( cdcEClass, CDC__SUB_DATA_OBJECT );
        createEReference( cdcEClass, CDC__DATA_ATTRIBUTE );
        createEReference( cdcEClass, CDC__SERVICE_PARAMETER );
        createEAttribute( cdcEClass, CDC__ENUM_PARAMETERIZED );
        createEAttribute( cdcEClass, CDC__NAME );
        createEAttribute( cdcEClass, CDC__STATISTICS );
        createEAttribute( cdcEClass, CDC__TYPE_KIND_PARAMETERIZED );
        createEAttribute( cdcEClass, CDC__VARIANT );

        cdCsEClass = createEClass( CD_CS );
        createEReference( cdCsEClass, CD_CS__CDC );

        changesEClass = createEClass( CHANGES );
        createEAttribute( changesEClass, CHANGES__CHANGES_ID );
        createEAttribute( changesEClass, CHANGES__DATE );
        createEAttribute( changesEClass, CHANGES__RELEASE );
        createEAttribute( changesEClass, CHANGES__REVISION );
        createEAttribute( changesEClass, CHANGES__TISSUES );
        createEAttribute( changesEClass, CHANGES__VERSION );

        constructedAttributeEClass = createEClass( CONSTRUCTED_ATTRIBUTE );
        createEReference( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE );
        createEAttribute( constructedAttributeEClass, CONSTRUCTED_ATTRIBUTE__NAME );

        constructedAttributesEClass = createEClass( CONSTRUCTED_ATTRIBUTES );
        createEReference( constructedAttributesEClass, CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE );

        copyrightedEClass = createEClass( COPYRIGHTED );
        createEReference( copyrightedEClass, COPYRIGHTED__COPYRIGHT );

        copyrightNoticeEClass = createEClass( COPYRIGHT_NOTICE );
        createEReference( copyrightNoticeEClass, COPYRIGHT_NOTICE__NOTICE );
        createEReference( copyrightNoticeEClass, COPYRIGHT_NOTICE__LICENSE );

        dataAttributeEClass = createEClass( DATA_ATTRIBUTE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__DCHG );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__DEFAULT_VALUE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__DUPD );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__FC );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__IS_ARRAY );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__MAX_VALUE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__MIN_INDEX );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__MIN_VALUE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__NAME );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__PRES_COND );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__PRES_COND_ARGS );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__PRES_COND_ARGS_ID );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__QCHG );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__SIZE_ATTRIBUTE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__TYPE );
        createEAttribute( dataAttributeEClass, DATA_ATTRIBUTE__TYPE_KIND );

        dataObjectEClass = createEClass( DATA_OBJECT );
        createEAttribute( dataObjectEClass, DATA_OBJECT__DS_PRES_COND );
        createEAttribute( dataObjectEClass, DATA_OBJECT__DS_PRES_COND_ARGS );
        createEAttribute( dataObjectEClass, DATA_OBJECT__DS_PRES_COND_ARGS_ID );
        createEAttribute( dataObjectEClass, DATA_OBJECT__NAME );
        createEAttribute( dataObjectEClass, DATA_OBJECT__PRES_COND );
        createEAttribute( dataObjectEClass, DATA_OBJECT__PRES_COND_ARGS );
        createEAttribute( dataObjectEClass, DATA_OBJECT__PRES_COND_ARGS_ID );
        createEAttribute( dataObjectEClass, DATA_OBJECT__TRANSIENT );
        createEAttribute( dataObjectEClass, DATA_OBJECT__TYPE );
        createEAttribute( dataObjectEClass, DATA_OBJECT__UNDERLYING_TYPE );
        createEAttribute( dataObjectEClass, DATA_OBJECT__UNDERLYING_TYPE_KIND );

        dataSetMemberOfEClass = createEClass( DATA_SET_MEMBER_OF );
        createEAttribute( dataSetMemberOfEClass, DATA_SET_MEMBER_OF__CB );

        docEClass = createEClass( DOC );
        createEAttribute( docEClass, DOC__MIXED );
        createEAttribute( docEClass, DOC__GROUP );
        createEAttribute( docEClass, DOC__ANY );
        createEAttribute( docEClass, DOC__ID );

        documentedClassEClass = createEClass( DOCUMENTED_CLASS );
        createEAttribute( documentedClassEClass, DOCUMENTED_CLASS__DEPRECATED );
        createEAttribute( documentedClassEClass, DOCUMENTED_CLASS__DESC_ID );
        createEAttribute( documentedClassEClass, DOCUMENTED_CLASS__INFORMATIVE );

        enumerationEClass = createEClass( ENUMERATION );
        createEReference( enumerationEClass, ENUMERATION__LITERAL );
        createEAttribute( enumerationEClass, ENUMERATION__INHERITED_FROM );
        createEAttribute( enumerationEClass, ENUMERATION__NAME );

        enumerationsEClass = createEClass( ENUMERATIONS );
        createEReference( enumerationsEClass, ENUMERATIONS__ENUMERATION );

        functionalConstraintEClass = createEClass( FUNCTIONAL_CONSTRAINT );
        createEReference( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES );
        createEAttribute( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__ABBREVIATION );
        createEAttribute( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__DESC_ID );
        createEAttribute( functionalConstraintEClass, FUNCTIONAL_CONSTRAINT__TITLE_ID );

        functionalConstraintsEClass = createEClass( FUNCTIONAL_CONSTRAINTS );
        createEReference( functionalConstraintsEClass, FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT );

        licenseEClass = createEClass( LICENSE );
        createEAttribute( licenseEClass, LICENSE__MIXED );
        createEAttribute( licenseEClass, LICENSE__KIND );
        createEAttribute( licenseEClass, LICENSE__URI );

        literalEClass = createEClass( LITERAL );
        createEAttribute( literalEClass, LITERAL__LITERAL_VAL );
        createEAttribute( literalEClass, LITERAL__NAME );

        lnClassEClass = createEClass( LN_CLASS );
        createEAttribute( lnClassEClass, LN_CLASS__CAN_HAVE_LOG );
        createEAttribute( lnClassEClass, LN_CLASS__IS_EXTENSION );
        createEAttribute( lnClassEClass, LN_CLASS__NAME );

        lnClassesEClass = createEClass( LN_CLASSES );
        createEReference( lnClassesEClass, LN_CLASSES__ABSTRACT_LN_CLASS );
        createEReference( lnClassesEClass, LN_CLASSES__LN_CLASS );

        noticeEClass = createEClass( NOTICE );
        createEAttribute( noticeEClass, NOTICE__MIXED );

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
        createEAttribute( nsEClass, NS__DESC_ID );
        createEAttribute( nsEClass, NS__ID );
        createEAttribute( nsEClass, NS__PUBLICATION_STAGE );
        createEAttribute( nsEClass, NS__RELEASE );
        createEAttribute( nsEClass, NS__REVISION );
        createEAttribute( nsEClass, NS__UML_DATE );
        createEAttribute( nsEClass, NS__UML_VERSION );
        createEAttribute( nsEClass, NS__VERSION );

        nsDocEClass = createEClass( NS_DOC );
        createEReference( nsDocEClass, NS_DOC__DOC );
        createEAttribute( nsDocEClass, NS_DOC__ID );
        createEAttribute( nsDocEClass, NS_DOC__LANG );
        createEAttribute( nsDocEClass, NS_DOC__PUBLICATION_STAGE );
        createEAttribute( nsDocEClass, NS_DOC__RELEASE );
        createEAttribute( nsDocEClass, NS_DOC__REVISION );
        createEAttribute( nsDocEClass, NS_DOC__UML_DATE );
        createEAttribute( nsDocEClass, NS_DOC__UML_VERSION );
        createEAttribute( nsDocEClass, NS_DOC__VERSION );

        presenceConditionEClass = createEClass( PRESENCE_CONDITION );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__ARGUMENT );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__DESC_ID );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__NAME );
        createEAttribute( presenceConditionEClass, PRESENCE_CONDITION__TITLE_ID );

        presenceConditionsEClass = createEClass( PRESENCE_CONDITIONS );
        createEReference( presenceConditionsEClass, PRESENCE_CONDITIONS__PRESENCE_CONDITION );

        serviceCDCEClass = createEClass( SERVICE_CDC );
        createEReference( serviceCDCEClass, SERVICE_CDC__SERVICE_DATA_ATTRIBUTE );
        createEAttribute( serviceCDCEClass, SERVICE_CDC__CDC );
        createEAttribute( serviceCDCEClass, SERVICE_CDC__VARIANT );

        serviceCDCsEClass = createEClass( SERVICE_CD_CS );
        createEReference( serviceCDCsEClass, SERVICE_CD_CS__SERVICE_CDC );

        serviceConstructedAttributeEClass = createEClass( SERVICE_CONSTRUCTED_ATTRIBUTE );
        createEAttribute( serviceConstructedAttributeEClass, SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED );

        serviceConstructedAttributesEClass = createEClass( SERVICE_CONSTRUCTED_ATTRIBUTES );
        createEReference( serviceConstructedAttributesEClass,
                SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE );

        serviceDataAttributeEClass = createEClass( SERVICE_DATA_ATTRIBUTE );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__FC );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__NAME );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__PRES_COND );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__TYPE );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__TYPE_KIND );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE );
        createEAttribute( serviceDataAttributeEClass, SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND );

        serviceNSEClass = createEClass( SERVICE_NS );
        createEReference( serviceNSEClass, SERVICE_NS__CHANGES );
        createEReference( serviceNSEClass, SERVICE_NS__FUNCTIONAL_CONSTRAINTS );
        createEReference( serviceNSEClass, SERVICE_NS__PRESENCE_CONDITIONS );
        createEReference( serviceNSEClass, SERVICE_NS__ABBREVIATIONS );
        createEReference( serviceNSEClass, SERVICE_NS__SERVICE_TYPE_REALIZATIONS );
        createEReference( serviceNSEClass, SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES );
        createEReference( serviceNSEClass, SERVICE_NS__SERVICE_CD_CS );
        createEAttribute( serviceNSEClass, SERVICE_NS__DESC_ID );
        createEAttribute( serviceNSEClass, SERVICE_NS__ID );
        createEAttribute( serviceNSEClass, SERVICE_NS__PUBLICATION_STAGE );
        createEAttribute( serviceNSEClass, SERVICE_NS__RELEASE );
        createEAttribute( serviceNSEClass, SERVICE_NS__REVISION );
        createEAttribute( serviceNSEClass, SERVICE_NS__UML_DATE );
        createEAttribute( serviceNSEClass, SERVICE_NS__UML_VERSION );
        createEAttribute( serviceNSEClass, SERVICE_NS__VERSION );

        serviceNsUsageEClass = createEClass( SERVICE_NS_USAGE );
        createEReference( serviceNsUsageEClass, SERVICE_NS_USAGE__APPLIES_TO );
        createEAttribute( serviceNsUsageEClass, SERVICE_NS_USAGE__ID );
        createEAttribute( serviceNsUsageEClass, SERVICE_NS_USAGE__PUBLICATION_STAGE );
        createEAttribute( serviceNsUsageEClass, SERVICE_NS_USAGE__RELEASE );
        createEAttribute( serviceNsUsageEClass, SERVICE_NS_USAGE__REVISION );
        createEAttribute( serviceNsUsageEClass, SERVICE_NS_USAGE__VERSION );

        serviceParameterEClass = createEClass( SERVICE_PARAMETER );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__DEFAULT_VALUE );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__MAX_VALUE );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__MIN_VALUE );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__NAME );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__TYPE );
        createEAttribute( serviceParameterEClass, SERVICE_PARAMETER__TYPE_KIND );

        serviceTypeRealizationEClass = createEClass( SERVICE_TYPE_REALIZATION );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__FC );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__NAME );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__PRES_COND );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__PRES_COND_ARGS );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__PRES_COND_ARGS_ID );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__TYPE );
        createEAttribute( serviceTypeRealizationEClass, SERVICE_TYPE_REALIZATION__TYPE_KIND );

        serviceTypeRealizationsEClass = createEClass( SERVICE_TYPE_REALIZATIONS );
        createEReference( serviceTypeRealizationsEClass, SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION );

        subDataAttributeEClass = createEClass( SUB_DATA_ATTRIBUTE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__DEFAULT_VALUE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__IS_ARRAY );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__MAX_VALUE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__MIN_INDEX );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__MIN_VALUE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__NAME );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__PRES_COND );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__PRES_COND_ARGS );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__TYPE );
        createEAttribute( subDataAttributeEClass, SUB_DATA_ATTRIBUTE__TYPE_KIND );

        subDataObjectEClass = createEClass( SUB_DATA_OBJECT );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__IS_ARRAY );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__MIN_INDEX );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__NAME );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__PRES_COND );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__PRES_COND_ARGS );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__PRES_COND_ARGS_ID );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__SIZE_ATTRIBUTE );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__TYPE );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__UNDERLYING_TYPE );
        createEAttribute( subDataObjectEClass, SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND );

        titledClassEClass = createEClass( TITLED_CLASS );
        createEAttribute( titledClassEClass, TITLED_CLASS__TITLE_ID );

        // Create enums
        acsiServicesKindEEnum = createEEnum( ACSI_SERVICES_KIND );
        cbKindEEnum = createEEnum( CB_KIND );
        definedAttributeTypeKindEEnum = createEEnum( DEFINED_ATTRIBUTE_TYPE_KIND );
        licenseKindEEnum = createEEnum( LICENSE_KIND );
        pubStageEEnum = createEEnum( PUB_STAGE );
        undefinedAttributeTypeKindEEnum = createEEnum( UNDEFINED_ATTRIBUTE_TYPE_KIND );

        // Create data types
        abbreviationNameEDataType = createEDataType( ABBREVIATION_NAME );
        abstractLNClassNameEDataType = createEDataType( ABSTRACT_LN_CLASS_NAME );
        acsiServicesKindObjectEDataType = createEDataType( ACSI_SERVICES_KIND_OBJECT );
        attributeNameEDataType = createEDataType( ATTRIBUTE_NAME );
        attributeTypeKindEDataType = createEDataType( ATTRIBUTE_TYPE_KIND );
        basicTypeNameEDataType = createEDataType( BASIC_TYPE_NAME );
        cbKindObjectEDataType = createEDataType( CB_KIND_OBJECT );
        cdcNameEDataType = createEDataType( CDC_NAME );
        dataObjectNameEDataType = createEDataType( DATA_OBJECT_NAME );
        definedAttributeTypeKindObjectEDataType = createEDataType( DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT );
        docIDEDataType = createEDataType( DOC_ID );
        emptyStringEDataType = createEDataType( EMPTY_STRING );
        fcAbbreviationEDataType = createEDataType( FC_ABBREVIATION );
        iec61850NameEDataType = createEDataType( IEC61850_NAME );
        iec61850NameStringEDataType = createEDataType( IEC61850_NAME_STRING );
        issuesTypeEDataType = createEDataType( ISSUES_TYPE );
        licenseKindObjectEDataType = createEDataType( LICENSE_KIND_OBJECT );
        literalNameEDataType = createEDataType( LITERAL_NAME );
        lnClassNameEDataType = createEDataType( LN_CLASS_NAME );
        nsIdentifierEDataType = createEDataType( NS_IDENTIFIER );
        nsReleaseEDataType = createEDataType( NS_RELEASE );
        nsReleaseObjectEDataType = createEDataType( NS_RELEASE_OBJECT );
        nsRevisionEDataType = createEDataType( NS_REVISION );
        nsVersionEDataType = createEDataType( NS_VERSION );
        nsVersionObjectEDataType = createEDataType( NS_VERSION_OBJECT );
        presenceConditionArgumentEDataType = createEDataType( PRESENCE_CONDITION_ARGUMENT );
        presenceConditionNameEDataType = createEDataType( PRESENCE_CONDITION_NAME );
        pubStageObjectEDataType = createEDataType( PUB_STAGE_OBJECT );
        subDataObjectNameEDataType = createEDataType( SUB_DATA_OBJECT_NAME );
        umlVersionEDataType = createEDataType( UML_VERSION );
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
        abstractLNClassEClass.getESuperTypes().add( this.getAnyLNClass() );
        anyLNClassEClass.getESuperTypes().add( this.getTitledClass() );
        applicableServiceNSEClass.getESuperTypes().add( this.getCopyrighted() );
        cdcEClass.getESuperTypes().add( this.getTitledClass() );
        constructedAttributeEClass.getESuperTypes().add( this.getTitledClass() );
        dataAttributeEClass.getESuperTypes().add( this.getDocumentedClass() );
        dataObjectEClass.getESuperTypes().add( this.getDocumentedClass() );
        enumerationEClass.getESuperTypes().add( this.getTitledClass() );
        literalEClass.getESuperTypes().add( this.getDocumentedClass() );
        lnClassEClass.getESuperTypes().add( this.getAnyLNClass() );
        nsEClass.getESuperTypes().add( this.getCopyrighted() );
        nsDocEClass.getESuperTypes().add( this.getCopyrighted() );
        serviceConstructedAttributeEClass.getESuperTypes().add( this.getConstructedAttribute() );
        serviceDataAttributeEClass.getESuperTypes().add( this.getDocumentedClass() );
        serviceNSEClass.getESuperTypes().add( this.getCopyrighted() );
        serviceParameterEClass.getESuperTypes().add( this.getDocumentedClass() );
        subDataAttributeEClass.getESuperTypes().add( this.getDocumentedClass() );
        subDataObjectEClass.getESuperTypes().add( this.getDocumentedClass() );
        titledClassEClass.getESuperTypes().add( this.getDocumentedClass() );

        // Initialize classes, features, and operations; add parameters
        initEClass( appliesToTypeEClass, AppliesToType.class, "AppliesToType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAppliesToType_Id(), this.getNSIdentifier(), "id", null, 1, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getAppliesToType_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1,
                AppliesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAppliesToType_Release(), this.getNSRelease(), "release", "1", 0, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAppliesToType_Revision(), this.getNSRevision(), "revision", "A", 0, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAppliesToType_Version(), this.getNSVersion(), "version", null, 1, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( dependsOnTypeEClass, DependsOnType.class, "DependsOnType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDependsOnType_Id(), this.getNSIdentifier(), "id", null, 1, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDependsOnType_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1,
                DependsOnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDependsOnType_Release(), this.getNSRelease(), "release", "1", 0, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDependsOnType_Revision(), this.getNSRevision(), "revision", "A", 0, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDependsOnType_Version(), this.getNSVersion(), "version", null, 1, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

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
                "applicableServiceNS", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_Copyright(), this.getCopyrightNotice(), null, "copyright", null, 0, -2, null,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_NS(), this.getNS(), null, "nS", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_NSDoc(), this.getNSDoc(), null, "nSDoc", null, 0, -2, null, IS_TRANSIENT,
                IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
                IS_ORDERED );
        initEReference( getDocumentRoot_ServiceNS(), this.getServiceNS(), null, "serviceNS", null, 0, -2, null,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                IS_DERIVED, IS_ORDERED );

        initEClass( serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceType_Name(), this.getACSIServicesKind(), "name", null, 1, 1, ServiceType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( abbreviationEClass, Abbreviation.class, "Abbreviation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAbbreviation_DescID(), this.getDocID(), "descID", null, 0, 1, Abbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getAbbreviation_Name(), this.getAbbreviationName(), "name", null, 1, 1, Abbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( abbreviationsEClass, Abbreviations.class, "Abbreviations", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAbbreviations_Abbreviation(), this.getAbbreviation(), null, "abbreviation", null, 1, -1,
                Abbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( abstractLNClassEClass, AbstractLNClass.class, "AbstractLNClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAbstractLNClass_Name(), this.getAbstractLNClassName(), "name", null, 1, 1,
                AbstractLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( anyLNClassEClass, AnyLNClass.class, "AnyLNClass", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getAnyLNClass_DataObject(), this.getDataObject(), null, "dataObject", null, 0, -1,
                AnyLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAnyLNClass_Base(), this.getAbstractLNClassName(), "base", null, 0, 1, AnyLNClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( applicableServiceNSEClass, ApplicableServiceNS.class, "ApplicableServiceNS", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getApplicableServiceNS_ServiceNsUsage(), this.getServiceNsUsage(), null, "serviceNsUsage", null,
                1, -1, ApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getApplicableServiceNS_Date(), theXMLTypePackage.getDateTime(), "date", null, 1, 1,
                ApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getApplicableServiceNS_Version(), theXMLTypePackage.getUnsignedInt(), "version", null, 1, 1,
                ApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( applicableServicesEClass, ApplicableServices.class, "ApplicableServices", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getApplicableServices_Service(), this.getServiceType(), null, "service", null, 0, -1,
                ApplicableServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getApplicableServices_DataSetMemberOf(), this.getDataSetMemberOf(), null, "dataSetMemberOf",
                null, 0, -1, ApplicableServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getBasicType_DescID(), this.getDocID(), "descID", null, 0, 1, BasicType.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getBasicType_Name(), this.getBasicTypeName(), "name", null, 1, 1, BasicType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( basicTypesEClass, BasicTypes.class, "BasicTypes", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getBasicTypes_BasicType(), this.getBasicType(), null, "basicType", null, 1, -1,
                BasicTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( cdcEClass, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, "CDC", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCDC_SubDataObject(), this.getSubDataObject(), null, "subDataObject", null, 0, -1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCDC_DataAttribute(), this.getDataAttribute(), null, "dataAttribute", null, 1, -1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCDC_ServiceParameter(), this.getServiceParameter(), null, "serviceParameter", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_EnumParameterized(), theXMLTypePackage.getBoolean(), "enumParameterized", "false", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_Name(), this.getCDCName(), "name", null, 1, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_Statistics(), theXMLTypePackage.getBoolean(), "statistics", "false", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_TypeKindParameterized(), theXMLTypePackage.getBoolean(), "typeKindParameterized",
                "false", 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getCDC_Variant(), theXMLTypePackage.getToken(), "variant", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( cdCsEClass, CDCs.class, "CDCs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCDCs_CDC(), this.getCDC(), null, "cDC", null, 0, -1, CDCs.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( changesEClass, Changes.class, "Changes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getChanges_ChangesID(), this.getDocID(), "changesID", null, 0, 1, Changes.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getChanges_Release(), this.getNSRelease(), "release", "1", 0, 1, Changes.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Revision(), this.getNSRevision(), "revision", "A", 0, 1, Changes.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Tissues(), this.getissuesType(), "tissues", null, 0, 1, Changes.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getChanges_Version(), this.getNSVersion(), "version", null, 1, 1, Changes.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( constructedAttributeEClass, ConstructedAttribute.class, "ConstructedAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getConstructedAttribute_SubDataAttribute(), this.getSubDataAttribute(), null,
                "subDataAttribute", null, 1, -1, ConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getConstructedAttribute_Name(), this.getIec61850Name(), "name", null, 1, 1,
                ConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( constructedAttributesEClass, ConstructedAttributes.class, "ConstructedAttributes", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getConstructedAttributes_ConstructedAttribute(), this.getConstructedAttribute(), null,
                "constructedAttribute", null, 0, -1, ConstructedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( copyrightedEClass, Copyrighted.class, "Copyrighted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCopyrighted_Copyright(), this.getCopyrightNotice(), null, "copyright", null, 0, 1,
                Copyrighted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( copyrightNoticeEClass, CopyrightNotice.class, "CopyrightNotice", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getCopyrightNotice_Notice(), this.getNotice(), null, "notice", null, 1, 1,
                CopyrightNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getCopyrightNotice_License(), this.getLicense(), null, "license", null, 1, 1,
                CopyrightNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( dataAttributeEClass, DataAttribute.class, "DataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDataAttribute_Dchg(), theXMLTypePackage.getBoolean(), "dchg", "false", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_DefaultValue(), theXMLTypePackage.getNormalizedString(), "defaultValue", null,
                0, 1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_Dupd(), theXMLTypePackage.getBoolean(), "dupd", "false", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_Fc(), this.getFCAbbreviation(), "fc", null, 1, 1, DataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDataAttribute_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_MaxIndexAttribute(), this.getAttributeName(), "maxIndexAttribute", null, 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_Name(), this.getAttributeName(), "name", null, 1, 1, DataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDataAttribute_PresCond(), this.getPresenceConditionName(), "presCond", "M", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_PresCondArgs(), this.getPresenceConditionArgument(), "presCondArgs", null, 0,
                1, DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_PresCondArgsID(), this.getDocID(), "presCondArgsID", null, 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_Qchg(), theXMLTypePackage.getBoolean(), "qchg", "false", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_SizeAttribute(), this.getAttributeName(), "sizeAttribute", null, 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataAttribute_Type(), this.getIec61850Name(), "type", null, 0, 1, DataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDataAttribute_TypeKind(), this.getAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                DataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDataObject_DsPresCond(), this.getPresenceConditionName(), "dsPresCond", "M", 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_DsPresCondArgs(), this.getPresenceConditionArgument(), "dsPresCondArgs", null, 0,
                1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_DsPresCondArgsID(), this.getDocID(), "dsPresCondArgsID", null, 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_Name(), this.getDataObjectName(), "name", null, 1, 1, DataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDataObject_PresCond(), this.getPresenceConditionName(), "presCond", "M", 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_PresCondArgs(), this.getPresenceConditionArgument(), "presCondArgs", null, 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_PresCondArgsID(), this.getDocID(), "presCondArgsID", null, 0, 1, DataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDataObject_Transient(), theXMLTypePackage.getBoolean(), "transient", "false", 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_Type(), this.getCDCName(), "type", null, 1, 1, DataObject.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_UnderlyingType(), this.getIec61850Name(), "underlyingType", null, 0, 1,
                DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDataObject_UnderlyingTypeKind(), this.getDefinedAttributeTypeKind(), "underlyingTypeKind",
                null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( dataSetMemberOfEClass, DataSetMemberOf.class, "DataSetMemberOf", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDataSetMemberOf_Cb(), this.getCBKind(), "cb", null, 1, 1, DataSetMemberOf.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( docEClass, Doc.class, "Doc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDoc_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Doc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDoc_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Doc.class,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEAttribute( getDoc_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Doc.class, IS_TRANSIENT,
                IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEAttribute( getDoc_Id(), this.getDocID(), "id", null, 1, 1, Doc.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( documentedClassEClass, DocumentedClass.class, "DocumentedClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDocumentedClass_Deprecated(), theXMLTypePackage.getBoolean(), "deprecated", "false", 0, 1,
                DocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDocumentedClass_DescID(), this.getDocID(), "descID", null, 0, 1, DocumentedClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDocumentedClass_Informative(), theXMLTypePackage.getBoolean(), "informative", "false", 0, 1,
                DocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnumeration_Literal(), this.getLiteral(), null, "literal", null, 1, -1, Enumeration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getEnumeration_InheritedFrom(), this.getIec61850Name(), "inheritedFrom", null, 0, 1,
                Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getEnumeration_Name(), this.getIec61850Name(), "name", null, 1, 1, Enumeration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( enumerationsEClass, Enumerations.class, "Enumerations", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getEnumerations_Enumeration(), this.getEnumeration(), null, "enumeration", null, 0, -1,
                Enumerations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( functionalConstraintEClass, FunctionalConstraint.class, "FunctionalConstraint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getFunctionalConstraint_ApplicableServices(), this.getApplicableServices(), null,
                "applicableServices", null, 0, 1, FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getFunctionalConstraint_Abbreviation(), this.getFCAbbreviation(), "abbreviation", null, 1, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getFunctionalConstraint_DescID(), this.getDocID(), "descID", null, 0, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getFunctionalConstraint_TitleID(), this.getDocID(), "titleID", null, 0, 1,
                FunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( functionalConstraintsEClass, FunctionalConstraints.class, "FunctionalConstraints", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getFunctionalConstraints_FunctionalConstraint(), this.getFunctionalConstraint(), null,
                "functionalConstraint", null, 1, -1, FunctionalConstraints.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLicense_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, License.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getLicense_Kind(), this.getLicenseKind(), "kind", null, 0, 1, License.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLicense_Uri(), theXMLTypePackage.getNormalizedString(), "uri", null, 0, 1, License.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLiteral_LiteralVal(), theXMLTypePackage.getInt(), "literalVal", null, 1, 1, Literal.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLiteral_Name(), this.getLiteralName(), "name", null, 1, 1, Literal.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( lnClassEClass, LNClass.class, "LNClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getLNClass_CanHaveLOG(), theXMLTypePackage.getBoolean(), "canHaveLOG", "false", 0, 1,
                LNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLNClass_IsExtension(), theXMLTypePackage.getBoolean(), "isExtension", "false", 0, 1,
                LNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getLNClass_Name(), this.getLNClassName(), "name", null, 1, 1, LNClass.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( lnClassesEClass, LNClasses.class, "LNClasses", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getLNClasses_AbstractLNClass(), this.getAbstractLNClass(), null, "abstractLNClass", null, 0, -1,
                LNClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getLNClasses_LNClass(), this.getLNClass(), null, "lNClass", null, 0, -1, LNClasses.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( noticeEClass, Notice.class, "Notice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getNotice_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Notice.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( nsEClass, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, "NS", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNS_Changes(), this.getChanges(), null, "changes", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_DependsOn(), this.getDependsOnType(), null, "dependsOn", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_BasicTypes(), this.getBasicTypes(), null, "basicTypes", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_FunctionalConstraints(), this.getFunctionalConstraints(), null, "functionalConstraints",
                null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_PresenceConditions(), this.getPresenceConditions(), null, "presenceConditions", null, 0,
                1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_Abbreviations(), this.getAbbreviations(), null, "abbreviations", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_Enumerations(), this.getEnumerations(), null, "enumerations", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_ConstructedAttributes(), this.getConstructedAttributes(), null, "constructedAttributes",
                null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_CDCs(), this.getCDCs(), null, "cDCs", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getNS_LNClasses(), this.getLNClasses(), null, "lNClasses", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_DescID(), this.getDocID(), "descID", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_Id(), this.getNSIdentifier(), "id", null, 1, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_Release(), this.getNSRelease(), "release", "1", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_Revision(), this.getNSRevision(), "revision", "A", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_UmlVersion(), this.getUMLVersion(), "umlVersion", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNS_Version(), this.getNSVersion(), "version", null, 1, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( nsDocEClass, NSDoc.class, "NSDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getNSDoc_Doc(), this.getDoc(), null, "doc", null, 1, -1, NSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getNSDoc_Id(), this.getNSIdentifier(), "id", null, 1, 1, NSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNSDoc_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 1, 1, NSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getNSDoc_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1, NSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNSDoc_Release(), this.getNSRelease(), "release", "1", 0, 1, NSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNSDoc_Revision(), this.getNSRevision(), "revision", "A", 0, 1, NSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getNSDoc_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1, NSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getNSDoc_UmlVersion(), this.getUMLVersion(), "umlVersion", null, 0, 1, NSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getNSDoc_Version(), this.getNSVersion(), "version", null, 1, 1, NSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( presenceConditionEClass, PresenceCondition.class, "PresenceCondition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getPresenceCondition_Argument(), this.getPresenceConditionArgument(), "argument", null, 0, 1,
                PresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getPresenceCondition_DescID(), this.getDocID(), "descID", null, 0, 1, PresenceCondition.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getPresenceCondition_Name(), this.getPresenceConditionName(), "name", null, 1, 1,
                PresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getPresenceCondition_TitleID(), this.getDocID(), "titleID", null, 0, 1, PresenceCondition.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( presenceConditionsEClass, PresenceConditions.class, "PresenceConditions", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getPresenceConditions_PresenceCondition(), this.getPresenceCondition(), null,
                "presenceCondition", null, 1, -1, PresenceConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceCDCEClass, ServiceCDC.class, "ServiceCDC", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceCDC_ServiceDataAttribute(), this.getServiceDataAttribute(), null,
                "serviceDataAttribute", null, 1, -1, ServiceCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceCDC_Cdc(), this.getCDCName(), "cdc", null, 1, 1, ServiceCDC.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceCDC_Variant(), theXMLTypePackage.getToken(), "variant", null, 0, 1, ServiceCDC.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( serviceCDCsEClass, ServiceCDCs.class, "ServiceCDCs", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceCDCs_ServiceCDC(), this.getServiceCDC(), null, "serviceCDC", null, 0, -1,
                ServiceCDCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceConstructedAttributeEClass, ServiceConstructedAttribute.class, "ServiceConstructedAttribute",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceConstructedAttribute_TypeKindParameterized(), theXMLTypePackage.getBoolean(),
                "typeKindParameterized", "false", 0, 1, ServiceConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceConstructedAttributesEClass, ServiceConstructedAttributes.class,
                "ServiceConstructedAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceConstructedAttributes_ServiceConstructedAttribute(),
                this.getServiceConstructedAttribute(), null, "serviceConstructedAttribute", null, 0, -1,
                ServiceConstructedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceDataAttributeEClass, ServiceDataAttribute.class, "ServiceDataAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceDataAttribute_Fc(), this.getFCAbbreviation(), "fc", null, 1, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_Name(), this.getAttributeName(), "name", null, 1, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_PresCond(), this.getPresenceConditionName(), "presCond", "M", 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_PresCondArgs(), this.getPresenceConditionArgument(), "presCondArgs",
                null, 0, 1, ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_PresCondArgsID(), this.getDocID(), "presCondArgsID", null, 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_Type(), this.getIec61850Name(), "type", null, 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_TypeKind(), this.getAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_UnderlyingType(), this.getIec61850Name(), "underlyingType", null, 0, 1,
                ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceDataAttribute_UnderlyingTypeKind(), this.getDefinedAttributeTypeKind(),
                "underlyingTypeKind", null, 0, 1, ServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceNSEClass, ServiceNS.class, "ServiceNS", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceNS_Changes(), this.getChanges(), null, "changes", null, 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceNS_FunctionalConstraints(), this.getFunctionalConstraints(), null,
                "functionalConstraints", null, 0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceNS_PresenceConditions(), this.getPresenceConditions(), null, "presenceConditions",
                null, 0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceNS_Abbreviations(), this.getAbbreviations(), null, "abbreviations", null, 0, 1,
                ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceNS_ServiceTypeRealizations(), this.getServiceTypeRealizations(), null,
                "serviceTypeRealizations", null, 0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceNS_ServiceConstructedAttributes(), this.getServiceConstructedAttributes(), null,
                "serviceConstructedAttributes", null, 0, 1, ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getServiceNS_ServiceCDCs(), this.getServiceCDCs(), null, "serviceCDCs", null, 0, 1,
                ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNS_DescID(), this.getDocID(), "descID", null, 0, 1, ServiceNS.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNS_Id(), this.getNSIdentifier(), "id", null, 1, 1, ServiceNS.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNS_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1,
                ServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNS_Release(), this.getNSRelease(), "release", "1", 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNS_Revision(), this.getNSRevision(), "revision", "A", 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNS_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getServiceNS_UmlVersion(), this.getUMLVersion(), "umlVersion", null, 0, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getServiceNS_Version(), this.getNSVersion(), "version", null, 1, 1, ServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceNsUsageEClass, ServiceNsUsage.class, "ServiceNsUsage", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceNsUsage_AppliesTo(), this.getAppliesToType(), null, "appliesTo", null, 1, -1,
                ServiceNsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNsUsage_Id(), this.getNSIdentifier(), "id", null, 1, 1, ServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getServiceNsUsage_PublicationStage(), this.getPubStage(), "publicationStage", "IS", 0, 1,
                ServiceNsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNsUsage_Release(), this.getNSRelease(), "release", "1", 0, 1, ServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNsUsage_Revision(), this.getNSRevision(), "revision", "A", 0, 1, ServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceNsUsage_Version(), this.getNSVersion(), "version", null, 1, 1, ServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceParameterEClass, ServiceParameter.class, "ServiceParameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceParameter_DefaultValue(), theXMLTypePackage.getNormalizedString(), "defaultValue",
                null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceParameter_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceParameter_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceParameter_Name(), this.getAttributeName(), "name", null, 1, 1, ServiceParameter.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getServiceParameter_Type(), this.getIec61850Name(), "type", null, 0, 1, ServiceParameter.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getServiceParameter_TypeKind(), this.getAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( serviceTypeRealizationEClass, ServiceTypeRealization.class, "ServiceTypeRealization", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceTypeRealization_Fc(), this.getFCAbbreviation(), "fc", null, 1, 1,
                ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceTypeRealization_Name(), this.getAttributeName(), "name", null, 1, 1,
                ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceTypeRealization_PresCond(), this.getPresenceConditionName(), "presCond", "M", 0, 1,
                ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceTypeRealization_PresCondArgs(), this.getPresenceConditionArgument(), "presCondArgs",
                null, 0, 1, ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceTypeRealization_PresCondArgsID(), this.getDocID(), "presCondArgsID", null, 0, 1,
                ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceTypeRealization_Type(), this.getIec61850Name(), "type", null, 0, 1,
                ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getServiceTypeRealization_TypeKind(), this.getAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                ServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( serviceTypeRealizationsEClass, ServiceTypeRealizations.class, "ServiceTypeRealizations",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getServiceTypeRealizations_ServiceTypeRealization(), this.getConstructedAttribute(), null,
                "serviceTypeRealization", null, 0, -1, ServiceTypeRealizations.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( subDataAttributeEClass, SubDataAttribute.class, "SubDataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSubDataAttribute_DefaultValue(), theXMLTypePackage.getNormalizedString(), "defaultValue",
                null, 0, 1, SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_MaxIndexAttribute(), this.getAttributeName(), "maxIndexAttribute", null, 0,
                1, SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_Name(), this.getAttributeName(), "name", null, 1, 1, SubDataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getSubDataAttribute_PresCond(), this.getPresenceConditionName(), "presCond", "M", 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_PresCondArgs(), this.getPresenceConditionArgument(), "presCondArgs", null,
                0, 1, SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_PresCondArgsID(), this.getDocID(), "presCondArgsID", null, 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_SizeAttribute(), this.getAttributeName(), "sizeAttribute", null, 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataAttribute_Type(), this.getIec61850Name(), "type", null, 0, 1, SubDataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getSubDataAttribute_TypeKind(), this.getAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                SubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( subDataObjectEClass, SubDataObject.class, "SubDataObject", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getSubDataObject_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_MaxIndexAttribute(), this.getAttributeName(), "maxIndexAttribute", null, 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_Name(), this.getSubDataObjectName(), "name", null, 1, 1, SubDataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getSubDataObject_PresCond(), this.getPresenceConditionName(), "presCond", "M", 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_PresCondArgs(), this.getPresenceConditionArgument(), "presCondArgs", null, 0,
                1, SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_PresCondArgsID(), this.getDocID(), "presCondArgsID", null, 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_SizeAttribute(), this.getAttributeName(), "sizeAttribute", null, 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_Type(), this.getCDCName(), "type", null, 1, 1, SubDataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getSubDataObject_UnderlyingType(), this.getIec61850Name(), "underlyingType", null, 0, 1,
                SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getSubDataObject_UnderlyingTypeKind(), this.getDefinedAttributeTypeKind(), "underlyingTypeKind",
                null, 0, 1, SubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( titledClassEClass, TitledClass.class, "TitledClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTitledClass_TitleID(), this.getDocID(), "titleID", null, 1, 1, TitledClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

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
        initEDataType( abbreviationNameEDataType, String.class, "AbbreviationName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( abstractLNClassNameEDataType, String.class, "AbstractLNClassName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( acsiServicesKindObjectEDataType, ACSIServicesKind.class, "ACSIServicesKindObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );
        initEDataType( attributeNameEDataType, String.class, "AttributeName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( attributeTypeKindEDataType, Enumerator.class, "AttributeTypeKind", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( basicTypeNameEDataType, String.class, "BasicTypeName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( cbKindObjectEDataType, CBKind.class, "CBKindObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( cdcNameEDataType, String.class, "CDCName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( dataObjectNameEDataType, String.class, "DataObjectName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( definedAttributeTypeKindObjectEDataType, DefinedAttributeTypeKind.class,
                "DefinedAttributeTypeKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );
        initEDataType( docIDEDataType, String.class, "DocID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( emptyStringEDataType, String.class, "EmptyString", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( fcAbbreviationEDataType, String.class, "FCAbbreviation", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( iec61850NameEDataType, String.class, "Iec61850Name", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( iec61850NameStringEDataType, String.class, "Iec61850NameString", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( issuesTypeEDataType, String.class, "issuesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( licenseKindObjectEDataType, LicenseKind.class, "LicenseKindObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( literalNameEDataType, String.class, "LiteralName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( lnClassNameEDataType, String.class, "LNClassName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( nsIdentifierEDataType, String.class, "NSIdentifier", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( nsReleaseEDataType, short.class, "NSRelease", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( nsReleaseObjectEDataType, Short.class, "NSReleaseObject", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( nsRevisionEDataType, String.class, "NSRevision", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( nsVersionEDataType, int.class, "NSVersion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( nsVersionObjectEDataType, Integer.class, "NSVersionObject", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( presenceConditionArgumentEDataType, String.class, "PresenceConditionArgument", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( presenceConditionNameEDataType, String.class, "PresenceConditionName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( pubStageObjectEDataType, PubStage.class, "PubStageObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( subDataObjectNameEDataType, String.class, "SubDataObjectName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( umlVersionEDataType, String.class, "UMLVersion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( undefinedAttributeTypeKindObjectEDataType, UndefinedAttributeTypeKind.class,
                "UndefinedAttributeTypeKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource( eNS_URI );

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation( appliesToTypeEClass, source, new String[] { "name", "AppliesTo_._type", "kind", "empty" } );
        addAnnotation( getAppliesToType_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getAppliesToType_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getAppliesToType_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getAppliesToType_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getAppliesToType_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( dependsOnTypeEClass, source, new String[] { "name", "DependsOn_._type", "kind", "empty" } );
        addAnnotation( getDependsOnType_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getDependsOnType_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getDependsOnType_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getDependsOnType_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getDependsOnType_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( documentRootEClass, source, new String[] { "name", "", "kind", "mixed" } );
        addAnnotation( getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( getDocumentRoot_XMLNSPrefixMap(), source,
                new String[] { "kind", "attribute", "name", "xmlns:prefix" } );
        addAnnotation( getDocumentRoot_XSISchemaLocation(), source,
                new String[] { "kind", "attribute", "name", "xsi:schemaLocation" } );
        addAnnotation( getDocumentRoot_ApplicableServiceNS(), source,
                new String[] { "kind", "element", "name", "ApplicableServiceNS", "namespace", "##targetNamespace" } );
        addAnnotation( getDocumentRoot_Copyright(), source,
                new String[] { "kind", "element", "name", "Copyright", "namespace", "##targetNamespace" } );
        addAnnotation( getDocumentRoot_NS(), source,
                new String[] { "kind", "element", "name", "NS", "namespace", "##targetNamespace" } );
        addAnnotation( getDocumentRoot_NSDoc(), source,
                new String[] { "kind", "element", "name", "NSDoc", "namespace", "##targetNamespace" } );
        addAnnotation( getDocumentRoot_ServiceNS(), source,
                new String[] { "kind", "element", "name", "ServiceNS", "namespace", "##targetNamespace" } );
        addAnnotation( serviceTypeEClass, source, new String[] { "name", "Service_._type", "kind", "empty" } );
        addAnnotation( getServiceType_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( abbreviationEClass, source, new String[] { "name", "tAbbreviation", "kind", "empty" } );
        addAnnotation( getAbbreviation_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getAbbreviation_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( abbreviationNameEDataType, source, new String[] { "name", "tAbbreviationName", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString" } );
        addAnnotation( abbreviationsEClass, source, new String[] { "name", "tAbbreviations", "kind", "elementOnly" } );
        addAnnotation( getAbbreviations_Abbreviation(), source,
                new String[] { "kind", "element", "name", "Abbreviation", "namespace", "##targetNamespace" } );
        addAnnotation( abstractLNClassEClass, source,
                new String[] { "name", "tAbstractLNClass", "kind", "elementOnly" } );
        addAnnotation( getAbstractLNClass_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( abstractLNClassNameEDataType, source,
                new String[] { "name", "tAbstractLNClassName", "baseType", "tIec61850Name" } );
        addAnnotation( acsiServicesKindEEnum, source, new String[] { "name", "tACSIServicesKind" } );
        addAnnotation( acsiServicesKindObjectEDataType, source,
                new String[] { "name", "tACSIServicesKind:Object", "baseType", "tACSIServicesKind" } );
        addAnnotation( anyLNClassEClass, source, new String[] { "name", "tAnyLNClass", "kind", "elementOnly" } );
        addAnnotation( getAnyLNClass_DataObject(), source,
                new String[] { "kind", "element", "name", "DataObject", "namespace", "##targetNamespace" } );
        addAnnotation( getAnyLNClass_Base(), source, new String[] { "kind", "attribute", "name", "base" } );
        addAnnotation( applicableServiceNSEClass, source,
                new String[] { "name", "tApplicableServiceNS", "kind", "elementOnly" } );
        addAnnotation( getApplicableServiceNS_ServiceNsUsage(), source,
                new String[] { "kind", "element", "name", "ServiceNsUsage", "namespace", "##targetNamespace" } );
        addAnnotation( getApplicableServiceNS_Date(), source, new String[] { "kind", "attribute", "name", "date" } );
        addAnnotation( getApplicableServiceNS_Version(), source,
                new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( applicableServicesEClass, source,
                new String[] { "name", "tApplicableServices", "kind", "elementOnly" } );
        addAnnotation( getApplicableServices_Service(), source,
                new String[] { "kind", "element", "name", "Service", "namespace", "##targetNamespace" } );
        addAnnotation( getApplicableServices_DataSetMemberOf(), source,
                new String[] { "kind", "element", "name", "DataSetMemberOf", "namespace", "##targetNamespace" } );
        addAnnotation( attributeNameEDataType, source,
                new String[] { "name", "tAttributeName", "baseType", "tIec61850Name" } );
        addAnnotation( attributeTypeKindEDataType, source, new String[] { "name", "tAttributeTypeKind", "memberTypes",
                "tDefinedAttributeTypeKind tUndefinedAttributeTypeKind" } );
        addAnnotation( basicTypeEClass, source, new String[] { "name", "tBasicType", "kind", "empty" } );
        addAnnotation( getBasicType_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getBasicType_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( basicTypeNameEDataType, source, new String[] { "name", "tBasicTypeName", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#token", "minLength", "1" } );
        addAnnotation( basicTypesEClass, source, new String[] { "name", "tBasicTypes", "kind", "elementOnly" } );
        addAnnotation( getBasicTypes_BasicType(), source,
                new String[] { "kind", "element", "name", "BasicType", "namespace", "##targetNamespace" } );
        addAnnotation( cbKindEEnum, source, new String[] { "name", "tCBKind" } );
        addAnnotation( cbKindObjectEDataType, source,
                new String[] { "name", "tCBKind:Object", "baseType", "tCBKind" } );
        addAnnotation( cdcEClass, source, new String[] { "name", "tCDC", "kind", "elementOnly" } );
        addAnnotation( getCDC_SubDataObject(), source,
                new String[] { "kind", "element", "name", "SubDataObject", "namespace", "##targetNamespace" } );
        addAnnotation( getCDC_DataAttribute(), source,
                new String[] { "kind", "element", "name", "DataAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( getCDC_ServiceParameter(), source,
                new String[] { "kind", "element", "name", "ServiceParameter", "namespace", "##targetNamespace" } );
        addAnnotation( getCDC_EnumParameterized(), source,
                new String[] { "kind", "attribute", "name", "enumParameterized" } );
        addAnnotation( getCDC_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getCDC_Statistics(), source, new String[] { "kind", "attribute", "name", "statistics" } );
        addAnnotation( getCDC_TypeKindParameterized(), source,
                new String[] { "kind", "attribute", "name", "typeKindParameterized" } );
        addAnnotation( getCDC_Variant(), source, new String[] { "kind", "attribute", "name", "variant" } );
        addAnnotation( cdcNameEDataType, source,
                new String[] { "name", "tCDCName", "baseType", "tIec61850Name", "minLength", "1" } );
        addAnnotation( cdCsEClass, source, new String[] { "name", "tCDCs", "kind", "elementOnly" } );
        addAnnotation( getCDCs_CDC(), source,
                new String[] { "kind", "element", "name", "CDC", "namespace", "##targetNamespace" } );
        addAnnotation( changesEClass, source, new String[] { "name", "tChanges", "kind", "empty" } );
        addAnnotation( getChanges_ChangesID(), source, new String[] { "kind", "attribute", "name", "changesID" } );
        addAnnotation( getChanges_Date(), source, new String[] { "kind", "attribute", "name", "date" } );
        addAnnotation( getChanges_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getChanges_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getChanges_Tissues(), source, new String[] { "kind", "attribute", "name", "tissues" } );
        addAnnotation( getChanges_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( constructedAttributeEClass, source,
                new String[] { "name", "tConstructedAttribute", "kind", "elementOnly" } );
        addAnnotation( getConstructedAttribute_SubDataAttribute(), source,
                new String[] { "kind", "element", "name", "SubDataAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( getConstructedAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( constructedAttributesEClass, source,
                new String[] { "name", "tConstructedAttributes", "kind", "elementOnly" } );
        addAnnotation( getConstructedAttributes_ConstructedAttribute(), source,
                new String[] { "kind", "element", "name", "ConstructedAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( copyrightedEClass, source, new String[] { "name", "tCopyrighted", "kind", "elementOnly" } );
        addAnnotation( getCopyrighted_Copyright(), source,
                new String[] { "kind", "element", "name", "Copyright", "namespace", "##targetNamespace" } );
        addAnnotation( copyrightNoticeEClass, source,
                new String[] { "name", "tCopyrightNotice", "kind", "elementOnly" } );
        addAnnotation( getCopyrightNotice_Notice(), source,
                new String[] { "kind", "element", "name", "Notice", "namespace", "##targetNamespace" } );
        addAnnotation( getCopyrightNotice_License(), source,
                new String[] { "kind", "element", "name", "License", "namespace", "##targetNamespace" } );
        addAnnotation( dataAttributeEClass, source, new String[] { "name", "tDataAttribute", "kind", "empty" } );
        addAnnotation( getDataAttribute_Dchg(), source, new String[] { "kind", "attribute", "name", "dchg" } );
        addAnnotation( getDataAttribute_DefaultValue(), source,
                new String[] { "kind", "attribute", "name", "defaultValue" } );
        addAnnotation( getDataAttribute_Dupd(), source, new String[] { "kind", "attribute", "name", "dupd" } );
        addAnnotation( getDataAttribute_Fc(), source, new String[] { "kind", "attribute", "name", "fc" } );
        addAnnotation( getDataAttribute_IsArray(), source, new String[] { "kind", "attribute", "name", "isArray" } );
        addAnnotation( getDataAttribute_MaxIndexAttribute(), source,
                new String[] { "kind", "attribute", "name", "maxIndexAttribute" } );
        addAnnotation( getDataAttribute_MaxValue(), source, new String[] { "kind", "attribute", "name", "maxValue" } );
        addAnnotation( getDataAttribute_MinIndex(), source, new String[] { "kind", "attribute", "name", "minIndex" } );
        addAnnotation( getDataAttribute_MinValue(), source, new String[] { "kind", "attribute", "name", "minValue" } );
        addAnnotation( getDataAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getDataAttribute_PresCond(), source, new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getDataAttribute_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getDataAttribute_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getDataAttribute_Qchg(), source, new String[] { "kind", "attribute", "name", "qchg" } );
        addAnnotation( getDataAttribute_SizeAttribute(), source,
                new String[] { "kind", "attribute", "name", "sizeAttribute" } );
        addAnnotation( getDataAttribute_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getDataAttribute_TypeKind(), source, new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( dataObjectEClass, source, new String[] { "name", "tDataObject", "kind", "empty" } );
        addAnnotation( getDataObject_DsPresCond(), source, new String[] { "kind", "attribute", "name", "dsPresCond" } );
        addAnnotation( getDataObject_DsPresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "dsPresCondArgs" } );
        addAnnotation( getDataObject_DsPresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "dsPresCondArgsID" } );
        addAnnotation( getDataObject_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getDataObject_PresCond(), source, new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getDataObject_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getDataObject_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getDataObject_Transient(), source, new String[] { "kind", "attribute", "name", "transient" } );
        addAnnotation( getDataObject_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getDataObject_UnderlyingType(), source,
                new String[] { "kind", "attribute", "name", "underlyingType" } );
        addAnnotation( getDataObject_UnderlyingTypeKind(), source,
                new String[] { "kind", "attribute", "name", "underlyingTypeKind" } );
        addAnnotation( dataObjectNameEDataType, source,
                new String[] { "name", "tDataObjectName", "baseType", "tIec61850Name", "maxLength", "12" } );
        addAnnotation( dataSetMemberOfEClass, source, new String[] { "name", "tDataSetMemberOf", "kind", "empty" } );
        addAnnotation( getDataSetMemberOf_Cb(), source, new String[] { "kind", "attribute", "name", "cb" } );
        addAnnotation( definedAttributeTypeKindEEnum, source, new String[] { "name", "tDefinedAttributeTypeKind" } );
        addAnnotation( definedAttributeTypeKindObjectEDataType, source,
                new String[] { "name", "tDefinedAttributeTypeKind:Object", "baseType", "tDefinedAttributeTypeKind" } );
        addAnnotation( docEClass, source, new String[] { "name", "tDoc", "kind", "mixed" } );
        addAnnotation( getDoc_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( getDoc_Group(), source, new String[] { "kind", "group", "name", "group:1" } );
        addAnnotation( getDoc_Any(), source, new String[] { "kind", "elementWildcard", "wildcards", "##any", "name",
                ":2", "processing", "lax", "group", "#group:1" } );
        addAnnotation( getDoc_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( docIDEDataType, source, new String[] { "name", "tDocID", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "minLength", "1" } );
        addAnnotation( documentedClassEClass, source, new String[] { "name", "tDocumentedClass", "kind", "empty" } );
        addAnnotation( getDocumentedClass_Deprecated(), source,
                new String[] { "kind", "attribute", "name", "deprecated" } );
        addAnnotation( getDocumentedClass_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getDocumentedClass_Informative(), source,
                new String[] { "kind", "attribute", "name", "informative" } );
        addAnnotation( emptyStringEDataType, source, new String[] { "name", "tEmptyString", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "maxLength", "0" } );
        addAnnotation( enumerationEClass, source, new String[] { "name", "tEnumeration", "kind", "elementOnly" } );
        addAnnotation( getEnumeration_Literal(), source,
                new String[] { "kind", "element", "name", "Literal", "namespace", "##targetNamespace" } );
        addAnnotation( getEnumeration_InheritedFrom(), source,
                new String[] { "kind", "attribute", "name", "inheritedFrom" } );
        addAnnotation( getEnumeration_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( enumerationsEClass, source, new String[] { "name", "tEnumerations", "kind", "elementOnly" } );
        addAnnotation( getEnumerations_Enumeration(), source,
                new String[] { "kind", "element", "name", "Enumeration", "namespace", "##targetNamespace" } );
        addAnnotation( fcAbbreviationEDataType, source,
                new String[] { "name", "tFCAbbreviation", "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
                        "minLength", "1", "pattern", "[\\p{IsBasicLatin}]+" } );
        addAnnotation( functionalConstraintEClass, source,
                new String[] { "name", "tFunctionalConstraint", "kind", "elementOnly" } );
        addAnnotation( getFunctionalConstraint_ApplicableServices(), source,
                new String[] { "kind", "element", "name", "ApplicableServices", "namespace", "##targetNamespace" } );
        addAnnotation( getFunctionalConstraint_Abbreviation(), source,
                new String[] { "kind", "attribute", "name", "abbreviation" } );
        addAnnotation( getFunctionalConstraint_DescID(), source,
                new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getFunctionalConstraint_TitleID(), source,
                new String[] { "kind", "attribute", "name", "titleID" } );
        addAnnotation( functionalConstraintsEClass, source,
                new String[] { "name", "tFunctionalConstraints", "kind", "elementOnly" } );
        addAnnotation( getFunctionalConstraints_FunctionalConstraint(), source,
                new String[] { "kind", "element", "name", "FunctionalConstraint", "namespace", "##targetNamespace" } );
        addAnnotation( iec61850NameEDataType, source,
                new String[] { "name", "tIec61850Name", "baseType", "http://www.eclipse.org/emf/2003/XMLType#Name",
                        "minLength", "1", "pattern", "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" } );
        addAnnotation( iec61850NameStringEDataType, source,
                new String[] { "name", "tIec61850NameString", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "pattern",
                        "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" } );
        addAnnotation( issuesTypeEDataType, source, new String[] { "name", "tissues_._type", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "minLength", "1" } );
        addAnnotation( licenseEClass, source, new String[] { "name", "tLicense", "kind", "mixed" } );
        addAnnotation( getLicense_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( getLicense_Kind(), source, new String[] { "kind", "attribute", "name", "kind" } );
        addAnnotation( getLicense_Uri(), source, new String[] { "kind", "attribute", "name", "uri" } );
        addAnnotation( licenseKindEEnum, source, new String[] { "name", "tLicenseKind" } );
        addAnnotation( licenseKindObjectEDataType, source,
                new String[] { "name", "tLicenseKind:Object", "baseType", "tLicenseKind" } );
        addAnnotation( literalEClass, source, new String[] { "name", "tLiteral", "kind", "empty" } );
        addAnnotation( getLiteral_LiteralVal(), source, new String[] { "kind", "attribute", "name", "literalVal" } );
        addAnnotation( getLiteral_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( literalNameEDataType, source,
                new String[] { "name", "tLiteralName", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "maxLength", "127", "pattern",
                        "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]*" } );
        addAnnotation( lnClassEClass, source, new String[] { "name", "tLNClass", "kind", "elementOnly" } );
        addAnnotation( getLNClass_CanHaveLOG(), source, new String[] { "kind", "attribute", "name", "canHaveLOG" } );
        addAnnotation( getLNClass_IsExtension(), source, new String[] { "kind", "attribute", "name", "isExtension" } );
        addAnnotation( getLNClass_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( lnClassesEClass, source, new String[] { "name", "tLNClasses", "kind", "elementOnly" } );
        addAnnotation( getLNClasses_AbstractLNClass(), source,
                new String[] { "kind", "element", "name", "AbstractLNClass", "namespace", "##targetNamespace" } );
        addAnnotation( getLNClasses_LNClass(), source,
                new String[] { "kind", "element", "name", "LNClass", "namespace", "##targetNamespace" } );
        addAnnotation( lnClassNameEDataType, source, new String[] { "name", "tLNClassName", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#Name", "pattern", "LLN0 [A-Z]{4}" } );
        addAnnotation( noticeEClass, source, new String[] { "name", "tNotice", "kind", "mixed" } );
        addAnnotation( getNotice_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( nsEClass, source, new String[] { "name", "tNS", "kind", "elementOnly" } );
        addAnnotation( getNS_Changes(), source,
                new String[] { "kind", "element", "name", "Changes", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_DependsOn(), source,
                new String[] { "kind", "element", "name", "DependsOn", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_BasicTypes(), source,
                new String[] { "kind", "element", "name", "BasicTypes", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_FunctionalConstraints(), source,
                new String[] { "kind", "element", "name", "FunctionalConstraints", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_PresenceConditions(), source,
                new String[] { "kind", "element", "name", "PresenceConditions", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_Abbreviations(), source,
                new String[] { "kind", "element", "name", "Abbreviations", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_Enumerations(), source,
                new String[] { "kind", "element", "name", "Enumerations", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_ConstructedAttributes(), source,
                new String[] { "kind", "element", "name", "ConstructedAttributes", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_CDCs(), source,
                new String[] { "kind", "element", "name", "CDCs", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_LNClasses(), source,
                new String[] { "kind", "element", "name", "LNClasses", "namespace", "##targetNamespace" } );
        addAnnotation( getNS_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getNS_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getNS_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getNS_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getNS_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getNS_UmlDate(), source, new String[] { "kind", "attribute", "name", "umlDate" } );
        addAnnotation( getNS_UmlVersion(), source, new String[] { "kind", "attribute", "name", "umlVersion" } );
        addAnnotation( getNS_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( nsDocEClass, source, new String[] { "name", "tNSDoc", "kind", "elementOnly" } );
        addAnnotation( getNSDoc_Doc(), source,
                new String[] { "kind", "element", "name", "Doc", "namespace", "##targetNamespace" } );
        addAnnotation( getNSDoc_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getNSDoc_Lang(), source, new String[] { "kind", "attribute", "name", "lang" } );
        addAnnotation( getNSDoc_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getNSDoc_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getNSDoc_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getNSDoc_UmlDate(), source, new String[] { "kind", "attribute", "name", "umlDate" } );
        addAnnotation( getNSDoc_UmlVersion(), source, new String[] { "kind", "attribute", "name", "umlVersion" } );
        addAnnotation( getNSDoc_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( nsIdentifierEDataType, source, new String[] { "name", "tNSIdentifier", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "pattern", "\\p{IsBasicLatin}+" } );
        addAnnotation( nsReleaseEDataType, source, new String[] { "name", "tNSRelease", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#unsignedByte", "minExclusive", "0" } );
        addAnnotation( nsReleaseObjectEDataType, source,
                new String[] { "name", "tNSRelease:Object", "baseType", "tNSRelease" } );
        addAnnotation( nsRevisionEDataType, source, new String[] { "name", "tNSRevision", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#token", "pattern", "[A-Z]" } );
        addAnnotation( nsVersionEDataType, source,
                new String[] { "name", "tNSVersion", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#unsignedShort", "minInclusive", "2002", "maxInclusive",
                        "2099" } );
        addAnnotation( nsVersionObjectEDataType, source,
                new String[] { "name", "tNSVersion:Object", "baseType", "tNSVersion" } );
        addAnnotation( presenceConditionEClass, source,
                new String[] { "name", "tPresenceCondition", "kind", "empty" } );
        addAnnotation( getPresenceCondition_Argument(), source,
                new String[] { "kind", "attribute", "name", "argument" } );
        addAnnotation( getPresenceCondition_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getPresenceCondition_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getPresenceCondition_TitleID(), source,
                new String[] { "kind", "attribute", "name", "titleID" } );
        addAnnotation( presenceConditionArgumentEDataType, source, new String[] { "name", "tPresenceConditionArgument",
                "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString" } );
        addAnnotation( presenceConditionNameEDataType, source, new String[] { "name", "tPresenceConditionName",
                "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString" } );
        addAnnotation( presenceConditionsEClass, source,
                new String[] { "name", "tPresenceConditions", "kind", "elementOnly" } );
        addAnnotation( getPresenceConditions_PresenceCondition(), source,
                new String[] { "kind", "element", "name", "PresenceCondition", "namespace", "##targetNamespace" } );
        addAnnotation( pubStageEEnum, source, new String[] { "name", "tPubStage" } );
        addAnnotation( pubStageObjectEDataType, source,
                new String[] { "name", "tPubStage:Object", "baseType", "tPubStage" } );
        addAnnotation( serviceCDCEClass, source, new String[] { "name", "tServiceCDC", "kind", "elementOnly" } );
        addAnnotation( getServiceCDC_ServiceDataAttribute(), source,
                new String[] { "kind", "element", "name", "ServiceDataAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceCDC_Cdc(), source, new String[] { "kind", "attribute", "name", "cdc" } );
        addAnnotation( getServiceCDC_Variant(), source, new String[] { "kind", "attribute", "name", "variant" } );
        addAnnotation( serviceCDCsEClass, source, new String[] { "name", "tServiceCDCs", "kind", "elementOnly" } );
        addAnnotation( getServiceCDCs_ServiceCDC(), source,
                new String[] { "kind", "element", "name", "ServiceCDC", "namespace", "##targetNamespace" } );
        addAnnotation( serviceConstructedAttributeEClass, source,
                new String[] { "name", "tServiceConstructedAttribute", "kind", "elementOnly" } );
        addAnnotation( getServiceConstructedAttribute_TypeKindParameterized(), source,
                new String[] { "kind", "attribute", "name", "typeKindParameterized" } );
        addAnnotation( serviceConstructedAttributesEClass, source,
                new String[] { "name", "tServiceConstructedAttributes", "kind", "elementOnly" } );
        addAnnotation( getServiceConstructedAttributes_ServiceConstructedAttribute(), source, new String[] { "kind",
                "element", "name", "ServiceConstructedAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( serviceDataAttributeEClass, source,
                new String[] { "name", "tServiceDataAttribute", "kind", "empty" } );
        addAnnotation( getServiceDataAttribute_Fc(), source, new String[] { "kind", "attribute", "name", "fc" } );
        addAnnotation( getServiceDataAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getServiceDataAttribute_PresCond(), source,
                new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getServiceDataAttribute_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getServiceDataAttribute_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getServiceDataAttribute_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getServiceDataAttribute_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( getServiceDataAttribute_UnderlyingType(), source,
                new String[] { "kind", "attribute", "name", "underlyingType" } );
        addAnnotation( getServiceDataAttribute_UnderlyingTypeKind(), source,
                new String[] { "kind", "attribute", "name", "underlyingTypeKind" } );
        addAnnotation( serviceNSEClass, source, new String[] { "name", "tServiceNS", "kind", "elementOnly" } );
        addAnnotation( getServiceNS_Changes(), source,
                new String[] { "kind", "element", "name", "Changes", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_FunctionalConstraints(), source,
                new String[] { "kind", "element", "name", "FunctionalConstraints", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_PresenceConditions(), source,
                new String[] { "kind", "element", "name", "PresenceConditions", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_Abbreviations(), source,
                new String[] { "kind", "element", "name", "Abbreviations", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_ServiceTypeRealizations(), source, new String[] { "kind", "element", "name",
                "ServiceTypeRealizations", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_ServiceConstructedAttributes(), source, new String[] { "kind", "element", "name",
                "ServiceConstructedAttributes", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_ServiceCDCs(), source,
                new String[] { "kind", "element", "name", "ServiceCDCs", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNS_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getServiceNS_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getServiceNS_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getServiceNS_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getServiceNS_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getServiceNS_UmlDate(), source, new String[] { "kind", "attribute", "name", "umlDate" } );
        addAnnotation( getServiceNS_UmlVersion(), source, new String[] { "kind", "attribute", "name", "umlVersion" } );
        addAnnotation( getServiceNS_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( serviceNsUsageEClass, source,
                new String[] { "name", "tServiceNsUsage", "kind", "elementOnly" } );
        addAnnotation( getServiceNsUsage_AppliesTo(), source,
                new String[] { "kind", "element", "name", "AppliesTo", "namespace", "##targetNamespace" } );
        addAnnotation( getServiceNsUsage_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getServiceNsUsage_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getServiceNsUsage_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getServiceNsUsage_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getServiceNsUsage_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( serviceParameterEClass, source, new String[] { "name", "tServiceParameter", "kind", "empty" } );
        addAnnotation( getServiceParameter_DefaultValue(), source,
                new String[] { "kind", "attribute", "name", "defaultValue" } );
        addAnnotation( getServiceParameter_MaxValue(), source,
                new String[] { "kind", "attribute", "name", "maxValue" } );
        addAnnotation( getServiceParameter_MinValue(), source,
                new String[] { "kind", "attribute", "name", "minValue" } );
        addAnnotation( getServiceParameter_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getServiceParameter_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getServiceParameter_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( serviceTypeRealizationEClass, source,
                new String[] { "name", "tServiceTypeRealization", "kind", "empty" } );
        addAnnotation( getServiceTypeRealization_Fc(), source, new String[] { "kind", "attribute", "name", "fc" } );
        addAnnotation( getServiceTypeRealization_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getServiceTypeRealization_PresCond(), source,
                new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getServiceTypeRealization_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getServiceTypeRealization_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getServiceTypeRealization_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getServiceTypeRealization_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( serviceTypeRealizationsEClass, source,
                new String[] { "name", "tServiceTypeRealizations", "kind", "elementOnly" } );
        addAnnotation( getServiceTypeRealizations_ServiceTypeRealization(), source, new String[] { "kind", "element",
                "name", "ServiceTypeRealization", "namespace", "##targetNamespace" } );
        addAnnotation( subDataAttributeEClass, source, new String[] { "name", "tSubDataAttribute", "kind", "empty" } );
        addAnnotation( getSubDataAttribute_DefaultValue(), source,
                new String[] { "kind", "attribute", "name", "defaultValue" } );
        addAnnotation( getSubDataAttribute_IsArray(), source, new String[] { "kind", "attribute", "name", "isArray" } );
        addAnnotation( getSubDataAttribute_MaxIndexAttribute(), source,
                new String[] { "kind", "attribute", "name", "maxIndexAttribute" } );
        addAnnotation( getSubDataAttribute_MaxValue(), source,
                new String[] { "kind", "attribute", "name", "maxValue" } );
        addAnnotation( getSubDataAttribute_MinIndex(), source,
                new String[] { "kind", "attribute", "name", "minIndex" } );
        addAnnotation( getSubDataAttribute_MinValue(), source,
                new String[] { "kind", "attribute", "name", "minValue" } );
        addAnnotation( getSubDataAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getSubDataAttribute_PresCond(), source,
                new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getSubDataAttribute_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getSubDataAttribute_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getSubDataAttribute_SizeAttribute(), source,
                new String[] { "kind", "attribute", "name", "sizeAttribute" } );
        addAnnotation( getSubDataAttribute_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getSubDataAttribute_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( subDataObjectEClass, source, new String[] { "name", "tSubDataObject", "kind", "empty" } );
        addAnnotation( getSubDataObject_IsArray(), source, new String[] { "kind", "attribute", "name", "isArray" } );
        addAnnotation( getSubDataObject_MaxIndexAttribute(), source,
                new String[] { "kind", "attribute", "name", "maxIndexAttribute" } );
        addAnnotation( getSubDataObject_MinIndex(), source, new String[] { "kind", "attribute", "name", "minIndex" } );
        addAnnotation( getSubDataObject_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getSubDataObject_PresCond(), source, new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getSubDataObject_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getSubDataObject_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getSubDataObject_SizeAttribute(), source,
                new String[] { "kind", "attribute", "name", "sizeAttribute" } );
        addAnnotation( getSubDataObject_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getSubDataObject_UnderlyingType(), source,
                new String[] { "kind", "attribute", "name", "underlyingType" } );
        addAnnotation( getSubDataObject_UnderlyingTypeKind(), source,
                new String[] { "kind", "attribute", "name", "underlyingTypeKind" } );
        addAnnotation( subDataObjectNameEDataType, source,
                new String[] { "name", "tSubDataObjectName", "baseType", "tIec61850Name" } );
        addAnnotation( titledClassEClass, source, new String[] { "name", "tTitledClass", "kind", "empty" } );
        addAnnotation( getTitledClass_TitleID(), source, new String[] { "kind", "attribute", "name", "titleID" } );
        addAnnotation( umlVersionEDataType, source, new String[] { "name", "tUMLVersion", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#Name", "minLength", "1" } );
        addAnnotation( undefinedAttributeTypeKindEEnum, source,
                new String[] { "name", "tUndefinedAttributeTypeKind" } );
        addAnnotation( undefinedAttributeTypeKindObjectEDataType, source, new String[] { "name",
                "tUndefinedAttributeTypeKind:Object", "baseType", "tUndefinedAttributeTypeKind" } );
    }

} //NsdPackageImpl
