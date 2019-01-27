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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind;

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
    private EClass tAbbreviationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tAbbreviationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tAbstractLNClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tAnyLNClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tApplicableServiceNSEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tApplicableServicesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tBasicTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tBasicTypesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tcdcEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tcdCsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tChangesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tConstructedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tConstructedAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tCopyrightedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tCopyrightNoticeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tDataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tDataObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tDataSetMemberOfEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tDocEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tDocumentedClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tEnumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tEnumerationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tFunctionalConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tFunctionalConstraintsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tLicenseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tlnClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tlnClassesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tNoticeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tnsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tnsDocEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tPresenceConditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tPresenceConditionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceCDCEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceCDCsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceConstructedAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceConstructedAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceDataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceNSEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceNsUsageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceTypeRealizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tServiceTypeRealizationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tSubDataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tSubDataObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tTitledClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tacsiServicesKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tcbKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tDefinedAttributeTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tLicenseKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tPubStageEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tUndefinedAttributeTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tAbbreviationNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tAbstractLNClassNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tacsiServicesKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tAttributeNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tAttributeTypeKindEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tBasicTypeNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tcbKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tcdcNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tDataObjectNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tDefinedAttributeTypeKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tDocIDEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tEmptyStringEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tfcAbbreviationEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tIec61850NameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tIec61850NameStringEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tissuesTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tLicenseKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tLiteralNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tlnClassNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tnsIdentifierEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tnsReleaseEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tnsReleaseObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tnsRevisionEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tnsVersionEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tnsVersionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tPresenceConditionArgumentEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tPresenceConditionNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tPubStageObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tSubDataObjectNameEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tumlVersionEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tUndefinedAttributeTypeKindObjectEDataType = null;

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
    public EClass getTAbbreviation() {
        return tAbbreviationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTAbbreviation_DescID() {
        return ( EAttribute ) tAbbreviationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTAbbreviation_Name() {
        return ( EAttribute ) tAbbreviationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTAbbreviations() {
        return tAbbreviationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTAbbreviations_Abbreviation() {
        return ( EReference ) tAbbreviationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTAbstractLNClass() {
        return tAbstractLNClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTAbstractLNClass_Name() {
        return ( EAttribute ) tAbstractLNClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTAnyLNClass() {
        return tAnyLNClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTAnyLNClass_DataObject() {
        return ( EReference ) tAnyLNClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTAnyLNClass_Base() {
        return ( EAttribute ) tAnyLNClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTApplicableServiceNS() {
        return tApplicableServiceNSEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTApplicableServiceNS_ServiceNsUsage() {
        return ( EReference ) tApplicableServiceNSEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTApplicableServiceNS_Date() {
        return ( EAttribute ) tApplicableServiceNSEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTApplicableServiceNS_Version() {
        return ( EAttribute ) tApplicableServiceNSEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTApplicableServices() {
        return tApplicableServicesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTApplicableServices_Service() {
        return ( EReference ) tApplicableServicesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTApplicableServices_DataSetMemberOf() {
        return ( EReference ) tApplicableServicesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTBasicType() {
        return tBasicTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTBasicType_DescID() {
        return ( EAttribute ) tBasicTypeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTBasicType_Name() {
        return ( EAttribute ) tBasicTypeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTBasicTypes() {
        return tBasicTypesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTBasicTypes_BasicType() {
        return ( EReference ) tBasicTypesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTCDC() {
        return tcdcEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCDC_SubDataObject() {
        return ( EReference ) tcdcEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCDC_DataAttribute() {
        return ( EReference ) tcdcEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCDC_ServiceParameter() {
        return ( EReference ) tcdcEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTCDC_EnumParameterized() {
        return ( EAttribute ) tcdcEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTCDC_Name() {
        return ( EAttribute ) tcdcEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTCDC_Statistics() {
        return ( EAttribute ) tcdcEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTCDC_TypeKindParameterized() {
        return ( EAttribute ) tcdcEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTCDC_Variant() {
        return ( EAttribute ) tcdcEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTCDCs() {
        return tcdCsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCDCs_CDC() {
        return ( EReference ) tcdCsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTChanges() {
        return tChangesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTChanges_ChangesID() {
        return ( EAttribute ) tChangesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTChanges_Date() {
        return ( EAttribute ) tChangesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTChanges_Release() {
        return ( EAttribute ) tChangesEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTChanges_Revision() {
        return ( EAttribute ) tChangesEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTChanges_Tissues() {
        return ( EAttribute ) tChangesEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTChanges_Version() {
        return ( EAttribute ) tChangesEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTConstructedAttribute() {
        return tConstructedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTConstructedAttribute_SubDataAttribute() {
        return ( EReference ) tConstructedAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTConstructedAttribute_Name() {
        return ( EAttribute ) tConstructedAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTConstructedAttributes() {
        return tConstructedAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTConstructedAttributes_ConstructedAttribute() {
        return ( EReference ) tConstructedAttributesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTCopyrighted() {
        return tCopyrightedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCopyrighted_Copyright() {
        return ( EReference ) tCopyrightedEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTCopyrightNotice() {
        return tCopyrightNoticeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCopyrightNotice_Notice() {
        return ( EReference ) tCopyrightNoticeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTCopyrightNotice_License() {
        return ( EReference ) tCopyrightNoticeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTDataAttribute() {
        return tDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_Dchg() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_DefaultValue() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_Dupd() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_Fc() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_IsArray() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_MaxIndexAttribute() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_MaxValue() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_MinIndex() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_MinValue() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_Name() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_PresCond() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_PresCondArgs() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_PresCondArgsID() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_Qchg() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_SizeAttribute() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_Type() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataAttribute_TypeKind() {
        return ( EAttribute ) tDataAttributeEClass.getEStructuralFeatures().get( 16 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTDataObject() {
        return tDataObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_DsPresCond() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_DsPresCondArgs() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_DsPresCondArgsID() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_Name() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_PresCond() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_PresCondArgs() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_PresCondArgsID() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_Transient() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_Type() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_UnderlyingType() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataObject_UnderlyingTypeKind() {
        return ( EAttribute ) tDataObjectEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTDataSetMemberOf() {
        return tDataSetMemberOfEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDataSetMemberOf_Cb() {
        return ( EAttribute ) tDataSetMemberOfEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTDoc() {
        return tDocEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDoc_Mixed() {
        return ( EAttribute ) tDocEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDoc_Group() {
        return ( EAttribute ) tDocEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDoc_Any() {
        return ( EAttribute ) tDocEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDoc_Id() {
        return ( EAttribute ) tDocEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTDocumentedClass() {
        return tDocumentedClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDocumentedClass_Deprecated() {
        return ( EAttribute ) tDocumentedClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDocumentedClass_DescID() {
        return ( EAttribute ) tDocumentedClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTDocumentedClass_Informative() {
        return ( EAttribute ) tDocumentedClassEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTEnumeration() {
        return tEnumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTEnumeration_Literal() {
        return ( EReference ) tEnumerationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTEnumeration_InheritedFrom() {
        return ( EAttribute ) tEnumerationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTEnumeration_Name() {
        return ( EAttribute ) tEnumerationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTEnumerations() {
        return tEnumerationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTEnumerations_Enumeration() {
        return ( EReference ) tEnumerationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTFunctionalConstraint() {
        return tFunctionalConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTFunctionalConstraint_ApplicableServices() {
        return ( EReference ) tFunctionalConstraintEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTFunctionalConstraint_Abbreviation() {
        return ( EAttribute ) tFunctionalConstraintEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTFunctionalConstraint_DescID() {
        return ( EAttribute ) tFunctionalConstraintEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTFunctionalConstraint_TitleID() {
        return ( EAttribute ) tFunctionalConstraintEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTFunctionalConstraints() {
        return tFunctionalConstraintsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTFunctionalConstraints_FunctionalConstraint() {
        return ( EReference ) tFunctionalConstraintsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTLicense() {
        return tLicenseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLicense_Mixed() {
        return ( EAttribute ) tLicenseEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLicense_Kind() {
        return ( EAttribute ) tLicenseEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLicense_Uri() {
        return ( EAttribute ) tLicenseEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTLiteral() {
        return tLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLiteral_LiteralVal() {
        return ( EAttribute ) tLiteralEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLiteral_Name() {
        return ( EAttribute ) tLiteralEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTLNClass() {
        return tlnClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLNClass_CanHaveLOG() {
        return ( EAttribute ) tlnClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLNClass_IsExtension() {
        return ( EAttribute ) tlnClassEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTLNClass_Name() {
        return ( EAttribute ) tlnClassEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTLNClasses() {
        return tlnClassesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTLNClasses_AbstractLNClass() {
        return ( EReference ) tlnClassesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTLNClasses_LNClass() {
        return ( EReference ) tlnClassesEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTNotice() {
        return tNoticeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNotice_Mixed() {
        return ( EAttribute ) tNoticeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTNS() {
        return tnsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_Changes() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_DependsOn() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_BasicTypes() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_FunctionalConstraints() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_PresenceConditions() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_Abbreviations() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_Enumerations() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_ConstructedAttributes() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_CDCs() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNS_LNClasses() {
        return ( EReference ) tnsEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_DescID() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_Id() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_PublicationStage() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_Release() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_Revision() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_UmlDate() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 15 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_UmlVersion() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 16 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNS_Version() {
        return ( EAttribute ) tnsEClass.getEStructuralFeatures().get( 17 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTNSDoc() {
        return tnsDocEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTNSDoc_Doc() {
        return ( EReference ) tnsDocEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_Id() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_Lang() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_PublicationStage() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_Release() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_Revision() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_UmlDate() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_UmlVersion() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTNSDoc_Version() {
        return ( EAttribute ) tnsDocEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTPresenceCondition() {
        return tPresenceConditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTPresenceCondition_Argument() {
        return ( EAttribute ) tPresenceConditionEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTPresenceCondition_DescID() {
        return ( EAttribute ) tPresenceConditionEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTPresenceCondition_Name() {
        return ( EAttribute ) tPresenceConditionEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTPresenceCondition_TitleID() {
        return ( EAttribute ) tPresenceConditionEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTPresenceConditions() {
        return tPresenceConditionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTPresenceConditions_PresenceCondition() {
        return ( EReference ) tPresenceConditionsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceCDC() {
        return tServiceCDCEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceCDC_ServiceDataAttribute() {
        return ( EReference ) tServiceCDCEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceCDC_Cdc() {
        return ( EAttribute ) tServiceCDCEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceCDC_Variant() {
        return ( EAttribute ) tServiceCDCEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceCDCs() {
        return tServiceCDCsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceCDCs_ServiceCDC() {
        return ( EReference ) tServiceCDCsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceConstructedAttribute() {
        return tServiceConstructedAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceConstructedAttribute_TypeKindParameterized() {
        return ( EAttribute ) tServiceConstructedAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceConstructedAttributes() {
        return tServiceConstructedAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceConstructedAttributes_ServiceConstructedAttribute() {
        return ( EReference ) tServiceConstructedAttributesEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceDataAttribute() {
        return tServiceDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_Fc() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_Name() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_PresCond() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_PresCondArgs() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_PresCondArgsID() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_Type() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_TypeKind() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_UnderlyingType() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceDataAttribute_UnderlyingTypeKind() {
        return ( EAttribute ) tServiceDataAttributeEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceNS() {
        return tServiceNSEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_Changes() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_FunctionalConstraints() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_PresenceConditions() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_Abbreviations() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_ServiceTypeRealizations() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_ServiceConstructedAttributes() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNS_ServiceCDCs() {
        return ( EReference ) tServiceNSEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_DescID() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_Id() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_PublicationStage() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_Release() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_Revision() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_UmlDate() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_UmlVersion() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 13 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNS_Version() {
        return ( EAttribute ) tServiceNSEClass.getEStructuralFeatures().get( 14 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceNsUsage() {
        return tServiceNsUsageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceNsUsage_AppliesTo() {
        return ( EReference ) tServiceNsUsageEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNsUsage_Id() {
        return ( EAttribute ) tServiceNsUsageEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNsUsage_PublicationStage() {
        return ( EAttribute ) tServiceNsUsageEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNsUsage_Release() {
        return ( EAttribute ) tServiceNsUsageEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNsUsage_Revision() {
        return ( EAttribute ) tServiceNsUsageEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceNsUsage_Version() {
        return ( EAttribute ) tServiceNsUsageEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceParameter() {
        return tServiceParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceParameter_DefaultValue() {
        return ( EAttribute ) tServiceParameterEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceParameter_MaxValue() {
        return ( EAttribute ) tServiceParameterEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceParameter_MinValue() {
        return ( EAttribute ) tServiceParameterEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceParameter_Name() {
        return ( EAttribute ) tServiceParameterEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceParameter_Type() {
        return ( EAttribute ) tServiceParameterEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceParameter_TypeKind() {
        return ( EAttribute ) tServiceParameterEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceTypeRealization() {
        return tServiceTypeRealizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_Fc() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_Name() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_PresCond() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_PresCondArgs() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_PresCondArgsID() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_Type() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTServiceTypeRealization_TypeKind() {
        return ( EAttribute ) tServiceTypeRealizationEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTServiceTypeRealizations() {
        return tServiceTypeRealizationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTServiceTypeRealizations_ServiceTypeRealization() {
        return ( EReference ) tServiceTypeRealizationsEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTSubDataAttribute() {
        return tSubDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_DefaultValue() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_IsArray() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_MaxIndexAttribute() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_MaxValue() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_MinIndex() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_MinValue() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_Name() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_PresCond() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_PresCondArgs() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_PresCondArgsID() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_SizeAttribute() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_Type() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataAttribute_TypeKind() {
        return ( EAttribute ) tSubDataAttributeEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTSubDataObject() {
        return tSubDataObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_IsArray() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_MaxIndexAttribute() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_MinIndex() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_Name() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_PresCond() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_PresCondArgs() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_PresCondArgsID() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_SizeAttribute() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_Type() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_UnderlyingType() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTSubDataObject_UnderlyingTypeKind() {
        return ( EAttribute ) tSubDataObjectEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTTitledClass() {
        return tTitledClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTTitledClass_TitleID() {
        return ( EAttribute ) tTitledClassEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTACSIServicesKind() {
        return tacsiServicesKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTCBKind() {
        return tcbKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTDefinedAttributeTypeKind() {
        return tDefinedAttributeTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTLicenseKind() {
        return tLicenseKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTPubStage() {
        return tPubStageEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTUndefinedAttributeTypeKind() {
        return tUndefinedAttributeTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTAbbreviationName() {
        return tAbbreviationNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTAbstractLNClassName() {
        return tAbstractLNClassNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTACSIServicesKindObject() {
        return tacsiServicesKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTAttributeName() {
        return tAttributeNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTAttributeTypeKind() {
        return tAttributeTypeKindEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTBasicTypeName() {
        return tBasicTypeNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTCBKindObject() {
        return tcbKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTCDCName() {
        return tcdcNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTDataObjectName() {
        return tDataObjectNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTDefinedAttributeTypeKindObject() {
        return tDefinedAttributeTypeKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTDocID() {
        return tDocIDEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTEmptyString() {
        return tEmptyStringEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTFCAbbreviation() {
        return tfcAbbreviationEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTIec61850Name() {
        return tIec61850NameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTIec61850NameString() {
        return tIec61850NameStringEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTissuesType() {
        return tissuesTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTLicenseKindObject() {
        return tLicenseKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTLiteralName() {
        return tLiteralNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTLNClassName() {
        return tlnClassNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTNSIdentifier() {
        return tnsIdentifierEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTNSRelease() {
        return tnsReleaseEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTNSReleaseObject() {
        return tnsReleaseObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTNSRevision() {
        return tnsRevisionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTNSVersion() {
        return tnsVersionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTNSVersionObject() {
        return tnsVersionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTPresenceConditionArgument() {
        return tPresenceConditionArgumentEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTPresenceConditionName() {
        return tPresenceConditionNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTPubStageObject() {
        return tPubStageObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTSubDataObjectName() {
        return tSubDataObjectNameEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTUMLVersion() {
        return tumlVersionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getTUndefinedAttributeTypeKindObject() {
        return tUndefinedAttributeTypeKindObjectEDataType;
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

        tAbbreviationEClass = createEClass( TABBREVIATION );
        createEAttribute( tAbbreviationEClass, TABBREVIATION__DESC_ID );
        createEAttribute( tAbbreviationEClass, TABBREVIATION__NAME );

        tAbbreviationsEClass = createEClass( TABBREVIATIONS );
        createEReference( tAbbreviationsEClass, TABBREVIATIONS__ABBREVIATION );

        tAbstractLNClassEClass = createEClass( TABSTRACT_LN_CLASS );
        createEAttribute( tAbstractLNClassEClass, TABSTRACT_LN_CLASS__NAME );

        tAnyLNClassEClass = createEClass( TANY_LN_CLASS );
        createEReference( tAnyLNClassEClass, TANY_LN_CLASS__DATA_OBJECT );
        createEAttribute( tAnyLNClassEClass, TANY_LN_CLASS__BASE );

        tApplicableServiceNSEClass = createEClass( TAPPLICABLE_SERVICE_NS );
        createEReference( tApplicableServiceNSEClass, TAPPLICABLE_SERVICE_NS__SERVICE_NS_USAGE );
        createEAttribute( tApplicableServiceNSEClass, TAPPLICABLE_SERVICE_NS__DATE );
        createEAttribute( tApplicableServiceNSEClass, TAPPLICABLE_SERVICE_NS__VERSION );

        tApplicableServicesEClass = createEClass( TAPPLICABLE_SERVICES );
        createEReference( tApplicableServicesEClass, TAPPLICABLE_SERVICES__SERVICE );
        createEReference( tApplicableServicesEClass, TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF );

        tBasicTypeEClass = createEClass( TBASIC_TYPE );
        createEAttribute( tBasicTypeEClass, TBASIC_TYPE__DESC_ID );
        createEAttribute( tBasicTypeEClass, TBASIC_TYPE__NAME );

        tBasicTypesEClass = createEClass( TBASIC_TYPES );
        createEReference( tBasicTypesEClass, TBASIC_TYPES__BASIC_TYPE );

        tcdcEClass = createEClass( TCDC );
        createEReference( tcdcEClass, TCDC__SUB_DATA_OBJECT );
        createEReference( tcdcEClass, TCDC__DATA_ATTRIBUTE );
        createEReference( tcdcEClass, TCDC__SERVICE_PARAMETER );
        createEAttribute( tcdcEClass, TCDC__ENUM_PARAMETERIZED );
        createEAttribute( tcdcEClass, TCDC__NAME );
        createEAttribute( tcdcEClass, TCDC__STATISTICS );
        createEAttribute( tcdcEClass, TCDC__TYPE_KIND_PARAMETERIZED );
        createEAttribute( tcdcEClass, TCDC__VARIANT );

        tcdCsEClass = createEClass( TCD_CS );
        createEReference( tcdCsEClass, TCD_CS__CDC );

        tChangesEClass = createEClass( TCHANGES );
        createEAttribute( tChangesEClass, TCHANGES__CHANGES_ID );
        createEAttribute( tChangesEClass, TCHANGES__DATE );
        createEAttribute( tChangesEClass, TCHANGES__RELEASE );
        createEAttribute( tChangesEClass, TCHANGES__REVISION );
        createEAttribute( tChangesEClass, TCHANGES__TISSUES );
        createEAttribute( tChangesEClass, TCHANGES__VERSION );

        tConstructedAttributeEClass = createEClass( TCONSTRUCTED_ATTRIBUTE );
        createEReference( tConstructedAttributeEClass, TCONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE );
        createEAttribute( tConstructedAttributeEClass, TCONSTRUCTED_ATTRIBUTE__NAME );

        tConstructedAttributesEClass = createEClass( TCONSTRUCTED_ATTRIBUTES );
        createEReference( tConstructedAttributesEClass, TCONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE );

        tCopyrightedEClass = createEClass( TCOPYRIGHTED );
        createEReference( tCopyrightedEClass, TCOPYRIGHTED__COPYRIGHT );

        tCopyrightNoticeEClass = createEClass( TCOPYRIGHT_NOTICE );
        createEReference( tCopyrightNoticeEClass, TCOPYRIGHT_NOTICE__NOTICE );
        createEReference( tCopyrightNoticeEClass, TCOPYRIGHT_NOTICE__LICENSE );

        tDataAttributeEClass = createEClass( TDATA_ATTRIBUTE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__DCHG );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__DEFAULT_VALUE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__DUPD );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__FC );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__IS_ARRAY );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__MAX_VALUE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__MIN_INDEX );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__MIN_VALUE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__NAME );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__PRES_COND );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__PRES_COND_ARGS );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__PRES_COND_ARGS_ID );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__QCHG );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__SIZE_ATTRIBUTE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__TYPE );
        createEAttribute( tDataAttributeEClass, TDATA_ATTRIBUTE__TYPE_KIND );

        tDataObjectEClass = createEClass( TDATA_OBJECT );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__DS_PRES_COND );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__DS_PRES_COND_ARGS );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__DS_PRES_COND_ARGS_ID );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__NAME );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__PRES_COND );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__PRES_COND_ARGS );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__PRES_COND_ARGS_ID );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__TRANSIENT );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__TYPE );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__UNDERLYING_TYPE );
        createEAttribute( tDataObjectEClass, TDATA_OBJECT__UNDERLYING_TYPE_KIND );

        tDataSetMemberOfEClass = createEClass( TDATA_SET_MEMBER_OF );
        createEAttribute( tDataSetMemberOfEClass, TDATA_SET_MEMBER_OF__CB );

        tDocEClass = createEClass( TDOC );
        createEAttribute( tDocEClass, TDOC__MIXED );
        createEAttribute( tDocEClass, TDOC__GROUP );
        createEAttribute( tDocEClass, TDOC__ANY );
        createEAttribute( tDocEClass, TDOC__ID );

        tDocumentedClassEClass = createEClass( TDOCUMENTED_CLASS );
        createEAttribute( tDocumentedClassEClass, TDOCUMENTED_CLASS__DEPRECATED );
        createEAttribute( tDocumentedClassEClass, TDOCUMENTED_CLASS__DESC_ID );
        createEAttribute( tDocumentedClassEClass, TDOCUMENTED_CLASS__INFORMATIVE );

        tEnumerationEClass = createEClass( TENUMERATION );
        createEReference( tEnumerationEClass, TENUMERATION__LITERAL );
        createEAttribute( tEnumerationEClass, TENUMERATION__INHERITED_FROM );
        createEAttribute( tEnumerationEClass, TENUMERATION__NAME );

        tEnumerationsEClass = createEClass( TENUMERATIONS );
        createEReference( tEnumerationsEClass, TENUMERATIONS__ENUMERATION );

        tFunctionalConstraintEClass = createEClass( TFUNCTIONAL_CONSTRAINT );
        createEReference( tFunctionalConstraintEClass, TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES );
        createEAttribute( tFunctionalConstraintEClass, TFUNCTIONAL_CONSTRAINT__ABBREVIATION );
        createEAttribute( tFunctionalConstraintEClass, TFUNCTIONAL_CONSTRAINT__DESC_ID );
        createEAttribute( tFunctionalConstraintEClass, TFUNCTIONAL_CONSTRAINT__TITLE_ID );

        tFunctionalConstraintsEClass = createEClass( TFUNCTIONAL_CONSTRAINTS );
        createEReference( tFunctionalConstraintsEClass, TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT );

        tLicenseEClass = createEClass( TLICENSE );
        createEAttribute( tLicenseEClass, TLICENSE__MIXED );
        createEAttribute( tLicenseEClass, TLICENSE__KIND );
        createEAttribute( tLicenseEClass, TLICENSE__URI );

        tLiteralEClass = createEClass( TLITERAL );
        createEAttribute( tLiteralEClass, TLITERAL__LITERAL_VAL );
        createEAttribute( tLiteralEClass, TLITERAL__NAME );

        tlnClassEClass = createEClass( TLN_CLASS );
        createEAttribute( tlnClassEClass, TLN_CLASS__CAN_HAVE_LOG );
        createEAttribute( tlnClassEClass, TLN_CLASS__IS_EXTENSION );
        createEAttribute( tlnClassEClass, TLN_CLASS__NAME );

        tlnClassesEClass = createEClass( TLN_CLASSES );
        createEReference( tlnClassesEClass, TLN_CLASSES__ABSTRACT_LN_CLASS );
        createEReference( tlnClassesEClass, TLN_CLASSES__LN_CLASS );

        tNoticeEClass = createEClass( TNOTICE );
        createEAttribute( tNoticeEClass, TNOTICE__MIXED );

        tnsEClass = createEClass( TNS );
        createEReference( tnsEClass, TNS__CHANGES );
        createEReference( tnsEClass, TNS__DEPENDS_ON );
        createEReference( tnsEClass, TNS__BASIC_TYPES );
        createEReference( tnsEClass, TNS__FUNCTIONAL_CONSTRAINTS );
        createEReference( tnsEClass, TNS__PRESENCE_CONDITIONS );
        createEReference( tnsEClass, TNS__ABBREVIATIONS );
        createEReference( tnsEClass, TNS__ENUMERATIONS );
        createEReference( tnsEClass, TNS__CONSTRUCTED_ATTRIBUTES );
        createEReference( tnsEClass, TNS__CD_CS );
        createEReference( tnsEClass, TNS__LN_CLASSES );
        createEAttribute( tnsEClass, TNS__DESC_ID );
        createEAttribute( tnsEClass, TNS__ID );
        createEAttribute( tnsEClass, TNS__PUBLICATION_STAGE );
        createEAttribute( tnsEClass, TNS__RELEASE );
        createEAttribute( tnsEClass, TNS__REVISION );
        createEAttribute( tnsEClass, TNS__UML_DATE );
        createEAttribute( tnsEClass, TNS__UML_VERSION );
        createEAttribute( tnsEClass, TNS__VERSION );

        tnsDocEClass = createEClass( TNS_DOC );
        createEReference( tnsDocEClass, TNS_DOC__DOC );
        createEAttribute( tnsDocEClass, TNS_DOC__ID );
        createEAttribute( tnsDocEClass, TNS_DOC__LANG );
        createEAttribute( tnsDocEClass, TNS_DOC__PUBLICATION_STAGE );
        createEAttribute( tnsDocEClass, TNS_DOC__RELEASE );
        createEAttribute( tnsDocEClass, TNS_DOC__REVISION );
        createEAttribute( tnsDocEClass, TNS_DOC__UML_DATE );
        createEAttribute( tnsDocEClass, TNS_DOC__UML_VERSION );
        createEAttribute( tnsDocEClass, TNS_DOC__VERSION );

        tPresenceConditionEClass = createEClass( TPRESENCE_CONDITION );
        createEAttribute( tPresenceConditionEClass, TPRESENCE_CONDITION__ARGUMENT );
        createEAttribute( tPresenceConditionEClass, TPRESENCE_CONDITION__DESC_ID );
        createEAttribute( tPresenceConditionEClass, TPRESENCE_CONDITION__NAME );
        createEAttribute( tPresenceConditionEClass, TPRESENCE_CONDITION__TITLE_ID );

        tPresenceConditionsEClass = createEClass( TPRESENCE_CONDITIONS );
        createEReference( tPresenceConditionsEClass, TPRESENCE_CONDITIONS__PRESENCE_CONDITION );

        tServiceCDCEClass = createEClass( TSERVICE_CDC );
        createEReference( tServiceCDCEClass, TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE );
        createEAttribute( tServiceCDCEClass, TSERVICE_CDC__CDC );
        createEAttribute( tServiceCDCEClass, TSERVICE_CDC__VARIANT );

        tServiceCDCsEClass = createEClass( TSERVICE_CD_CS );
        createEReference( tServiceCDCsEClass, TSERVICE_CD_CS__SERVICE_CDC );

        tServiceConstructedAttributeEClass = createEClass( TSERVICE_CONSTRUCTED_ATTRIBUTE );
        createEAttribute( tServiceConstructedAttributeEClass, TSERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED );

        tServiceConstructedAttributesEClass = createEClass( TSERVICE_CONSTRUCTED_ATTRIBUTES );
        createEReference( tServiceConstructedAttributesEClass,
                TSERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE );

        tServiceDataAttributeEClass = createEClass( TSERVICE_DATA_ATTRIBUTE );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__FC );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__NAME );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__PRES_COND );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__TYPE );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__TYPE_KIND );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE );
        createEAttribute( tServiceDataAttributeEClass, TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND );

        tServiceNSEClass = createEClass( TSERVICE_NS );
        createEReference( tServiceNSEClass, TSERVICE_NS__CHANGES );
        createEReference( tServiceNSEClass, TSERVICE_NS__FUNCTIONAL_CONSTRAINTS );
        createEReference( tServiceNSEClass, TSERVICE_NS__PRESENCE_CONDITIONS );
        createEReference( tServiceNSEClass, TSERVICE_NS__ABBREVIATIONS );
        createEReference( tServiceNSEClass, TSERVICE_NS__SERVICE_TYPE_REALIZATIONS );
        createEReference( tServiceNSEClass, TSERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES );
        createEReference( tServiceNSEClass, TSERVICE_NS__SERVICE_CD_CS );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__DESC_ID );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__ID );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__PUBLICATION_STAGE );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__RELEASE );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__REVISION );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__UML_DATE );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__UML_VERSION );
        createEAttribute( tServiceNSEClass, TSERVICE_NS__VERSION );

        tServiceNsUsageEClass = createEClass( TSERVICE_NS_USAGE );
        createEReference( tServiceNsUsageEClass, TSERVICE_NS_USAGE__APPLIES_TO );
        createEAttribute( tServiceNsUsageEClass, TSERVICE_NS_USAGE__ID );
        createEAttribute( tServiceNsUsageEClass, TSERVICE_NS_USAGE__PUBLICATION_STAGE );
        createEAttribute( tServiceNsUsageEClass, TSERVICE_NS_USAGE__RELEASE );
        createEAttribute( tServiceNsUsageEClass, TSERVICE_NS_USAGE__REVISION );
        createEAttribute( tServiceNsUsageEClass, TSERVICE_NS_USAGE__VERSION );

        tServiceParameterEClass = createEClass( TSERVICE_PARAMETER );
        createEAttribute( tServiceParameterEClass, TSERVICE_PARAMETER__DEFAULT_VALUE );
        createEAttribute( tServiceParameterEClass, TSERVICE_PARAMETER__MAX_VALUE );
        createEAttribute( tServiceParameterEClass, TSERVICE_PARAMETER__MIN_VALUE );
        createEAttribute( tServiceParameterEClass, TSERVICE_PARAMETER__NAME );
        createEAttribute( tServiceParameterEClass, TSERVICE_PARAMETER__TYPE );
        createEAttribute( tServiceParameterEClass, TSERVICE_PARAMETER__TYPE_KIND );

        tServiceTypeRealizationEClass = createEClass( TSERVICE_TYPE_REALIZATION );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__FC );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__NAME );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__PRES_COND );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__PRES_COND_ARGS );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__PRES_COND_ARGS_ID );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__TYPE );
        createEAttribute( tServiceTypeRealizationEClass, TSERVICE_TYPE_REALIZATION__TYPE_KIND );

        tServiceTypeRealizationsEClass = createEClass( TSERVICE_TYPE_REALIZATIONS );
        createEReference( tServiceTypeRealizationsEClass, TSERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION );

        tSubDataAttributeEClass = createEClass( TSUB_DATA_ATTRIBUTE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__DEFAULT_VALUE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__IS_ARRAY );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__MAX_VALUE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__MIN_INDEX );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__MIN_VALUE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__NAME );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__PRES_COND );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__PRES_COND_ARGS );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__TYPE );
        createEAttribute( tSubDataAttributeEClass, TSUB_DATA_ATTRIBUTE__TYPE_KIND );

        tSubDataObjectEClass = createEClass( TSUB_DATA_OBJECT );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__IS_ARRAY );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__MIN_INDEX );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__NAME );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__PRES_COND );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__PRES_COND_ARGS );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__PRES_COND_ARGS_ID );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__SIZE_ATTRIBUTE );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__TYPE );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__UNDERLYING_TYPE );
        createEAttribute( tSubDataObjectEClass, TSUB_DATA_OBJECT__UNDERLYING_TYPE_KIND );

        tTitledClassEClass = createEClass( TTITLED_CLASS );
        createEAttribute( tTitledClassEClass, TTITLED_CLASS__TITLE_ID );

        // Create enums
        tacsiServicesKindEEnum = createEEnum( TACSI_SERVICES_KIND );
        tcbKindEEnum = createEEnum( TCB_KIND );
        tDefinedAttributeTypeKindEEnum = createEEnum( TDEFINED_ATTRIBUTE_TYPE_KIND );
        tLicenseKindEEnum = createEEnum( TLICENSE_KIND );
        tPubStageEEnum = createEEnum( TPUB_STAGE );
        tUndefinedAttributeTypeKindEEnum = createEEnum( TUNDEFINED_ATTRIBUTE_TYPE_KIND );

        // Create data types
        tAbbreviationNameEDataType = createEDataType( TABBREVIATION_NAME );
        tAbstractLNClassNameEDataType = createEDataType( TABSTRACT_LN_CLASS_NAME );
        tacsiServicesKindObjectEDataType = createEDataType( TACSI_SERVICES_KIND_OBJECT );
        tAttributeNameEDataType = createEDataType( TATTRIBUTE_NAME );
        tAttributeTypeKindEDataType = createEDataType( TATTRIBUTE_TYPE_KIND );
        tBasicTypeNameEDataType = createEDataType( TBASIC_TYPE_NAME );
        tcbKindObjectEDataType = createEDataType( TCB_KIND_OBJECT );
        tcdcNameEDataType = createEDataType( TCDC_NAME );
        tDataObjectNameEDataType = createEDataType( TDATA_OBJECT_NAME );
        tDefinedAttributeTypeKindObjectEDataType = createEDataType( TDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT );
        tDocIDEDataType = createEDataType( TDOC_ID );
        tEmptyStringEDataType = createEDataType( TEMPTY_STRING );
        tfcAbbreviationEDataType = createEDataType( TFC_ABBREVIATION );
        tIec61850NameEDataType = createEDataType( TIEC61850_NAME );
        tIec61850NameStringEDataType = createEDataType( TIEC61850_NAME_STRING );
        tissuesTypeEDataType = createEDataType( TISSUES_TYPE );
        tLicenseKindObjectEDataType = createEDataType( TLICENSE_KIND_OBJECT );
        tLiteralNameEDataType = createEDataType( TLITERAL_NAME );
        tlnClassNameEDataType = createEDataType( TLN_CLASS_NAME );
        tnsIdentifierEDataType = createEDataType( TNS_IDENTIFIER );
        tnsReleaseEDataType = createEDataType( TNS_RELEASE );
        tnsReleaseObjectEDataType = createEDataType( TNS_RELEASE_OBJECT );
        tnsRevisionEDataType = createEDataType( TNS_REVISION );
        tnsVersionEDataType = createEDataType( TNS_VERSION );
        tnsVersionObjectEDataType = createEDataType( TNS_VERSION_OBJECT );
        tPresenceConditionArgumentEDataType = createEDataType( TPRESENCE_CONDITION_ARGUMENT );
        tPresenceConditionNameEDataType = createEDataType( TPRESENCE_CONDITION_NAME );
        tPubStageObjectEDataType = createEDataType( TPUB_STAGE_OBJECT );
        tSubDataObjectNameEDataType = createEDataType( TSUB_DATA_OBJECT_NAME );
        tumlVersionEDataType = createEDataType( TUML_VERSION );
        tUndefinedAttributeTypeKindObjectEDataType = createEDataType( TUNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT );
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
        tAbstractLNClassEClass.getESuperTypes().add( this.getTAnyLNClass() );
        tAnyLNClassEClass.getESuperTypes().add( this.getTTitledClass() );
        tApplicableServiceNSEClass.getESuperTypes().add( this.getTCopyrighted() );
        tcdcEClass.getESuperTypes().add( this.getTTitledClass() );
        tConstructedAttributeEClass.getESuperTypes().add( this.getTTitledClass() );
        tDataAttributeEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tDataObjectEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tEnumerationEClass.getESuperTypes().add( this.getTTitledClass() );
        tLiteralEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tlnClassEClass.getESuperTypes().add( this.getTAnyLNClass() );
        tnsEClass.getESuperTypes().add( this.getTCopyrighted() );
        tnsDocEClass.getESuperTypes().add( this.getTCopyrighted() );
        tServiceConstructedAttributeEClass.getESuperTypes().add( this.getTConstructedAttribute() );
        tServiceDataAttributeEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tServiceNSEClass.getESuperTypes().add( this.getTCopyrighted() );
        tServiceParameterEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tSubDataAttributeEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tSubDataObjectEClass.getESuperTypes().add( this.getTDocumentedClass() );
        tTitledClassEClass.getESuperTypes().add( this.getTDocumentedClass() );

        // Initialize classes, features, and operations; add parameters
        initEClass( appliesToTypeEClass, AppliesToType.class, "AppliesToType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getAppliesToType_Id(), this.getTNSIdentifier(), "id", null, 1, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getAppliesToType_PublicationStage(), this.getTPubStage(), "publicationStage", "IS", 0, 1,
                AppliesToType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAppliesToType_Release(), this.getTNSRelease(), "release", "1", 0, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAppliesToType_Revision(), this.getTNSRevision(), "revision", "A", 0, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getAppliesToType_Version(), this.getTNSVersion(), "version", null, 1, 1, AppliesToType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( dependsOnTypeEClass, DependsOnType.class, "DependsOnType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getDependsOnType_Id(), this.getTNSIdentifier(), "id", null, 1, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getDependsOnType_PublicationStage(), this.getTPubStage(), "publicationStage", "IS", 0, 1,
                DependsOnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDependsOnType_Release(), this.getTNSRelease(), "release", "1", 0, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDependsOnType_Revision(), this.getTNSRevision(), "revision", "A", 0, 1, DependsOnType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getDependsOnType_Version(), this.getTNSVersion(), "version", null, 1, 1, DependsOnType.class,
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
        initEReference( getDocumentRoot_ApplicableServiceNS(), this.getTApplicableServiceNS(), null,
                "applicableServiceNS", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_Copyright(), this.getTCopyrightNotice(), null, "copyright", null, 0, -2, null,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_NS(), this.getTNS(), null, "nS", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEReference( getDocumentRoot_NSDoc(), this.getTNSDoc(), null, "nSDoc", null, 0, -2, null, IS_TRANSIENT,
                IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
                IS_ORDERED );
        initEReference( getDocumentRoot_ServiceNS(), this.getTServiceNS(), null, "serviceNS", null, 0, -2, null,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                IS_DERIVED, IS_ORDERED );

        initEClass( serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getServiceType_Name(), this.getTACSIServicesKind(), "name", null, 1, 1, ServiceType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tAbbreviationEClass, TAbbreviation.class, "TAbbreviation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTAbbreviation_DescID(), this.getTDocID(), "descID", null, 0, 1, TAbbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTAbbreviation_Name(), this.getTAbbreviationName(), "name", null, 1, 1, TAbbreviation.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tAbbreviationsEClass, TAbbreviations.class, "TAbbreviations", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTAbbreviations_Abbreviation(), this.getTAbbreviation(), null, "abbreviation", null, 1, -1,
                TAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tAbstractLNClassEClass, TAbstractLNClass.class, "TAbstractLNClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTAbstractLNClass_Name(), this.getTAbstractLNClassName(), "name", null, 1, 1,
                TAbstractLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tAnyLNClassEClass, TAnyLNClass.class, "TAnyLNClass", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTAnyLNClass_DataObject(), this.getTDataObject(), null, "dataObject", null, 0, -1,
                TAnyLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTAnyLNClass_Base(), this.getTAbstractLNClassName(), "base", null, 0, 1, TAnyLNClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tApplicableServiceNSEClass, TApplicableServiceNS.class, "TApplicableServiceNS", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTApplicableServiceNS_ServiceNsUsage(), this.getTServiceNsUsage(), null, "serviceNsUsage",
                null, 1, -1, TApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTApplicableServiceNS_Date(), theXMLTypePackage.getDateTime(), "date", null, 1, 1,
                TApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTApplicableServiceNS_Version(), theXMLTypePackage.getUnsignedInt(), "version", null, 1, 1,
                TApplicableServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tApplicableServicesEClass, TApplicableServices.class, "TApplicableServices", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTApplicableServices_Service(), this.getServiceType(), null, "service", null, 0, -1,
                TApplicableServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTApplicableServices_DataSetMemberOf(), this.getTDataSetMemberOf(), null, "dataSetMemberOf",
                null, 0, -1, TApplicableServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tBasicTypeEClass, TBasicType.class, "TBasicType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTBasicType_DescID(), this.getTDocID(), "descID", null, 0, 1, TBasicType.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTBasicType_Name(), this.getTBasicTypeName(), "name", null, 1, 1, TBasicType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tBasicTypesEClass, TBasicTypes.class, "TBasicTypes", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTBasicTypes_BasicType(), this.getTBasicType(), null, "basicType", null, 1, -1,
                TBasicTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tcdcEClass, fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, "TCDC", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTCDC_SubDataObject(), this.getTSubDataObject(), null, "subDataObject", null, 0, -1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTCDC_DataAttribute(), this.getTDataAttribute(), null, "dataAttribute", null, 1, -1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTCDC_ServiceParameter(), this.getTServiceParameter(), null, "serviceParameter", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTCDC_EnumParameterized(), theXMLTypePackage.getBoolean(), "enumParameterized", "false", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTCDC_Name(), this.getTCDCName(), "name", null, 1, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTCDC_Statistics(), theXMLTypePackage.getBoolean(), "statistics", "false", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTCDC_TypeKindParameterized(), theXMLTypePackage.getBoolean(), "typeKindParameterized",
                "false", 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTCDC_Variant(), theXMLTypePackage.getToken(), "variant", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tcdCsEClass, TCDCs.class, "TCDCs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTCDCs_CDC(), this.getTCDC(), null, "cDC", null, 0, -1, TCDCs.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tChangesEClass, TChanges.class, "TChanges", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTChanges_ChangesID(), this.getTDocID(), "changesID", null, 0, 1, TChanges.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTChanges_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, TChanges.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTChanges_Release(), this.getTNSRelease(), "release", "1", 0, 1, TChanges.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTChanges_Revision(), this.getTNSRevision(), "revision", "A", 0, 1, TChanges.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTChanges_Tissues(), this.getTissuesType(), "tissues", null, 0, 1, TChanges.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTChanges_Version(), this.getTNSVersion(), "version", null, 1, 1, TChanges.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tConstructedAttributeEClass, TConstructedAttribute.class, "TConstructedAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTConstructedAttribute_SubDataAttribute(), this.getTSubDataAttribute(), null,
                "subDataAttribute", null, 1, -1, TConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTConstructedAttribute_Name(), this.getTIec61850Name(), "name", null, 1, 1,
                TConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tConstructedAttributesEClass, TConstructedAttributes.class, "TConstructedAttributes", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTConstructedAttributes_ConstructedAttribute(), this.getTConstructedAttribute(), null,
                "constructedAttribute", null, 0, -1, TConstructedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tCopyrightedEClass, TCopyrighted.class, "TCopyrighted", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTCopyrighted_Copyright(), this.getTCopyrightNotice(), null, "copyright", null, 0, 1,
                TCopyrighted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tCopyrightNoticeEClass, TCopyrightNotice.class, "TCopyrightNotice", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTCopyrightNotice_Notice(), this.getTNotice(), null, "notice", null, 1, 1,
                TCopyrightNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTCopyrightNotice_License(), this.getTLicense(), null, "license", null, 1, 1,
                TCopyrightNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tDataAttributeEClass, TDataAttribute.class, "TDataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTDataAttribute_Dchg(), theXMLTypePackage.getBoolean(), "dchg", "false", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_DefaultValue(), theXMLTypePackage.getNormalizedString(), "defaultValue", null,
                0, 1, TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_Dupd(), theXMLTypePackage.getBoolean(), "dupd", "false", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_Fc(), this.getTFCAbbreviation(), "fc", null, 1, 1, TDataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTDataAttribute_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_MaxIndexAttribute(), this.getTAttributeName(), "maxIndexAttribute", null, 0,
                1, TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_Name(), this.getTAttributeName(), "name", null, 1, 1, TDataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTDataAttribute_PresCond(), this.getTPresenceConditionName(), "presCond", "M", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_PresCondArgs(), this.getTPresenceConditionArgument(), "presCondArgs", null, 0,
                1, TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_PresCondArgsID(), this.getTDocID(), "presCondArgsID", null, 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_Qchg(), theXMLTypePackage.getBoolean(), "qchg", "false", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_SizeAttribute(), this.getTAttributeName(), "sizeAttribute", null, 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataAttribute_Type(), this.getTIec61850Name(), "type", null, 0, 1, TDataAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTDataAttribute_TypeKind(), this.getTAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                TDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tDataObjectEClass, TDataObject.class, "TDataObject", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTDataObject_DsPresCond(), this.getTPresenceConditionName(), "dsPresCond", "M", 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_DsPresCondArgs(), this.getTPresenceConditionArgument(), "dsPresCondArgs", null,
                0, 1, TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_DsPresCondArgsID(), this.getTDocID(), "dsPresCondArgsID", null, 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_Name(), this.getTDataObjectName(), "name", null, 1, 1, TDataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTDataObject_PresCond(), this.getTPresenceConditionName(), "presCond", "M", 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_PresCondArgs(), this.getTPresenceConditionArgument(), "presCondArgs", null, 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_PresCondArgsID(), this.getTDocID(), "presCondArgsID", null, 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_Transient(), theXMLTypePackage.getBoolean(), "transient", "false", 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_Type(), this.getTCDCName(), "type", null, 1, 1, TDataObject.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_UnderlyingType(), this.getTIec61850Name(), "underlyingType", null, 0, 1,
                TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDataObject_UnderlyingTypeKind(), this.getTDefinedAttributeTypeKind(), "underlyingTypeKind",
                null, 0, 1, TDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tDataSetMemberOfEClass, TDataSetMemberOf.class, "TDataSetMemberOf", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTDataSetMemberOf_Cb(), this.getTCBKind(), "cb", null, 1, 1, TDataSetMemberOf.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tDocEClass, TDoc.class, "TDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTDoc_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTDoc_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TDoc.class,
                IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDoc_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TDoc.class, IS_TRANSIENT,
                IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDoc_Id(), this.getTDocID(), "id", null, 1, 1, TDoc.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tDocumentedClassEClass, TDocumentedClass.class, "TDocumentedClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTDocumentedClass_Deprecated(), theXMLTypePackage.getBoolean(), "deprecated", "false", 0, 1,
                TDocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTDocumentedClass_DescID(), this.getTDocID(), "descID", null, 0, 1, TDocumentedClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTDocumentedClass_Informative(), theXMLTypePackage.getBoolean(), "informative", "false", 0, 1,
                TDocumentedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tEnumerationEClass, TEnumeration.class, "TEnumeration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTEnumeration_Literal(), this.getTLiteral(), null, "literal", null, 1, -1, TEnumeration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTEnumeration_InheritedFrom(), this.getTIec61850Name(), "inheritedFrom", null, 0, 1,
                TEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTEnumeration_Name(), this.getTIec61850Name(), "name", null, 1, 1, TEnumeration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tEnumerationsEClass, TEnumerations.class, "TEnumerations", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTEnumerations_Enumeration(), this.getTEnumeration(), null, "enumeration", null, 0, -1,
                TEnumerations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tFunctionalConstraintEClass, TFunctionalConstraint.class, "TFunctionalConstraint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTFunctionalConstraint_ApplicableServices(), this.getTApplicableServices(), null,
                "applicableServices", null, 0, 1, TFunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTFunctionalConstraint_Abbreviation(), this.getTFCAbbreviation(), "abbreviation", null, 1, 1,
                TFunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTFunctionalConstraint_DescID(), this.getTDocID(), "descID", null, 0, 1,
                TFunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTFunctionalConstraint_TitleID(), this.getTDocID(), "titleID", null, 0, 1,
                TFunctionalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tFunctionalConstraintsEClass, TFunctionalConstraints.class, "TFunctionalConstraints", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTFunctionalConstraints_FunctionalConstraint(), this.getTFunctionalConstraint(), null,
                "functionalConstraint", null, 1, -1, TFunctionalConstraints.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tLicenseEClass, TLicense.class, "TLicense", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTLicense_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TLicense.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTLicense_Kind(), this.getTLicenseKind(), "kind", null, 0, 1, TLicense.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTLicense_Uri(), theXMLTypePackage.getNormalizedString(), "uri", null, 0, 1, TLicense.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tLiteralEClass, TLiteral.class, "TLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTLiteral_LiteralVal(), theXMLTypePackage.getInt(), "literalVal", null, 1, 1, TLiteral.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTLiteral_Name(), this.getTLiteralName(), "name", null, 1, 1, TLiteral.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tlnClassEClass, TLNClass.class, "TLNClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTLNClass_CanHaveLOG(), theXMLTypePackage.getBoolean(), "canHaveLOG", "false", 0, 1,
                TLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTLNClass_IsExtension(), theXMLTypePackage.getBoolean(), "isExtension", "false", 0, 1,
                TLNClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTLNClass_Name(), this.getTLNClassName(), "name", null, 1, 1, TLNClass.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tlnClassesEClass, TLNClasses.class, "TLNClasses", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTLNClasses_AbstractLNClass(), this.getTAbstractLNClass(), null, "abstractLNClass", null, 0,
                -1, TLNClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTLNClasses_LNClass(), this.getTLNClass(), null, "lNClass", null, 0, -1, TLNClasses.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tNoticeEClass, TNotice.class, "TNotice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTNotice_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TNotice.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        initEClass( tnsEClass, fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, "TNS", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTNS_Changes(), this.getTChanges(), null, "changes", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_DependsOn(), this.getDependsOnType(), null, "dependsOn", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_BasicTypes(), this.getTBasicTypes(), null, "basicTypes", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_FunctionalConstraints(), this.getTFunctionalConstraints(), null, "functionalConstraints",
                null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_PresenceConditions(), this.getTPresenceConditions(), null, "presenceConditions", null, 0,
                1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_Abbreviations(), this.getTAbbreviations(), null, "abbreviations", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_Enumerations(), this.getTEnumerations(), null, "enumerations", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_ConstructedAttributes(), this.getTConstructedAttributes(), null, "constructedAttributes",
                null, 0, 1, fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_CDCs(), this.getTCDCs(), null, "cDCs", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTNS_LNClasses(), this.getTLNClasses(), null, "lNClasses", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_DescID(), this.getTDocID(), "descID", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_Id(), this.getTNSIdentifier(), "id", null, 1, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_PublicationStage(), this.getTPubStage(), "publicationStage", "IS", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_Release(), this.getTNSRelease(), "release", "1", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_Revision(), this.getTNSRevision(), "revision", "A", 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_UmlVersion(), this.getTUMLVersion(), "umlVersion", null, 0, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNS_Version(), this.getTNSVersion(), "version", null, 1, 1,
                fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tnsDocEClass, TNSDoc.class, "TNSDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTNSDoc_Doc(), this.getTDoc(), null, "doc", null, 1, -1, TNSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTNSDoc_Id(), this.getTNSIdentifier(), "id", null, 1, 1, TNSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNSDoc_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 1, 1, TNSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTNSDoc_PublicationStage(), this.getTPubStage(), "publicationStage", "IS", 0, 1, TNSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNSDoc_Release(), this.getTNSRelease(), "release", "1", 0, 1, TNSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNSDoc_Revision(), this.getTNSRevision(), "revision", "A", 0, 1, TNSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTNSDoc_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1, TNSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTNSDoc_UmlVersion(), this.getTUMLVersion(), "umlVersion", null, 0, 1, TNSDoc.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTNSDoc_Version(), this.getTNSVersion(), "version", null, 1, 1, TNSDoc.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tPresenceConditionEClass, TPresenceCondition.class, "TPresenceCondition", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTPresenceCondition_Argument(), this.getTPresenceConditionArgument(), "argument", null, 0, 1,
                TPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTPresenceCondition_DescID(), this.getTDocID(), "descID", null, 0, 1,
                TPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTPresenceCondition_Name(), this.getTPresenceConditionName(), "name", null, 1, 1,
                TPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTPresenceCondition_TitleID(), this.getTDocID(), "titleID", null, 0, 1,
                TPresenceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tPresenceConditionsEClass, TPresenceConditions.class, "TPresenceConditions", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTPresenceConditions_PresenceCondition(), this.getTPresenceCondition(), null,
                "presenceCondition", null, 1, -1, TPresenceConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceCDCEClass, TServiceCDC.class, "TServiceCDC", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTServiceCDC_ServiceDataAttribute(), this.getTServiceDataAttribute(), null,
                "serviceDataAttribute", null, 1, -1, TServiceCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceCDC_Cdc(), this.getTCDCName(), "cdc", null, 1, 1, TServiceCDC.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceCDC_Variant(), theXMLTypePackage.getToken(), "variant", null, 0, 1,
                TServiceCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceCDCsEClass, TServiceCDCs.class, "TServiceCDCs", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTServiceCDCs_ServiceCDC(), this.getTServiceCDC(), null, "serviceCDC", null, 0, -1,
                TServiceCDCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceConstructedAttributeEClass, TServiceConstructedAttribute.class,
                "TServiceConstructedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTServiceConstructedAttribute_TypeKindParameterized(), theXMLTypePackage.getBoolean(),
                "typeKindParameterized", "false", 0, 1, TServiceConstructedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceConstructedAttributesEClass, TServiceConstructedAttributes.class,
                "TServiceConstructedAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTServiceConstructedAttributes_ServiceConstructedAttribute(),
                this.getTServiceConstructedAttribute(), null, "serviceConstructedAttribute", null, 0, -1,
                TServiceConstructedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceDataAttributeEClass, TServiceDataAttribute.class, "TServiceDataAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTServiceDataAttribute_Fc(), this.getTFCAbbreviation(), "fc", null, 1, 1,
                TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_Name(), this.getTAttributeName(), "name", null, 1, 1,
                TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_PresCond(), this.getTPresenceConditionName(), "presCond", "M", 0, 1,
                TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_PresCondArgs(), this.getTPresenceConditionArgument(), "presCondArgs",
                null, 0, 1, TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_PresCondArgsID(), this.getTDocID(), "presCondArgsID", null, 0, 1,
                TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_Type(), this.getTIec61850Name(), "type", null, 0, 1,
                TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_TypeKind(), this.getTAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_UnderlyingType(), this.getTIec61850Name(), "underlyingType", null, 0,
                1, TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceDataAttribute_UnderlyingTypeKind(), this.getTDefinedAttributeTypeKind(),
                "underlyingTypeKind", null, 0, 1, TServiceDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceNSEClass, TServiceNS.class, "TServiceNS", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTServiceNS_Changes(), this.getTChanges(), null, "changes", null, 0, 1, TServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTServiceNS_FunctionalConstraints(), this.getTFunctionalConstraints(), null,
                "functionalConstraints", null, 0, 1, TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTServiceNS_PresenceConditions(), this.getTPresenceConditions(), null, "presenceConditions",
                null, 0, 1, TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTServiceNS_Abbreviations(), this.getTAbbreviations(), null, "abbreviations", null, 0, 1,
                TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTServiceNS_ServiceTypeRealizations(), this.getTServiceTypeRealizations(), null,
                "serviceTypeRealizations", null, 0, 1, TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTServiceNS_ServiceConstructedAttributes(), this.getTServiceConstructedAttributes(), null,
                "serviceConstructedAttributes", null, 0, 1, TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getTServiceNS_ServiceCDCs(), this.getTServiceCDCs(), null, "serviceCDCs", null, 0, 1,
                TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_DescID(), this.getTDocID(), "descID", null, 0, 1, TServiceNS.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_Id(), this.getTNSIdentifier(), "id", null, 1, 1, TServiceNS.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_PublicationStage(), this.getTPubStage(), "publicationStage", "IS", 0, 1,
                TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_Release(), this.getTNSRelease(), "release", "1", 0, 1, TServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_Revision(), this.getTNSRevision(), "revision", "A", 0, 1, TServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_UmlDate(), theXMLTypePackage.getDateTime(), "umlDate", null, 0, 1,
                TServiceNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNS_UmlVersion(), this.getTUMLVersion(), "umlVersion", null, 0, 1, TServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTServiceNS_Version(), this.getTNSVersion(), "version", null, 1, 1, TServiceNS.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceNsUsageEClass, TServiceNsUsage.class, "TServiceNsUsage", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTServiceNsUsage_AppliesTo(), this.getAppliesToType(), null, "appliesTo", null, 1, -1,
                TServiceNsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNsUsage_Id(), this.getTNSIdentifier(), "id", null, 1, 1, TServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTServiceNsUsage_PublicationStage(), this.getTPubStage(), "publicationStage", "IS", 0, 1,
                TServiceNsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNsUsage_Release(), this.getTNSRelease(), "release", "1", 0, 1, TServiceNsUsage.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNsUsage_Revision(), this.getTNSRevision(), "revision", "A", 0, 1,
                TServiceNsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceNsUsage_Version(), this.getTNSVersion(), "version", null, 1, 1,
                TServiceNsUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceParameterEClass, TServiceParameter.class, "TServiceParameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTServiceParameter_DefaultValue(), theXMLTypePackage.getNormalizedString(), "defaultValue",
                null, 0, 1, TServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceParameter_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                TServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceParameter_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                TServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceParameter_Name(), this.getTAttributeName(), "name", null, 1, 1,
                TServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceParameter_Type(), this.getTIec61850Name(), "type", null, 0, 1,
                TServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceParameter_TypeKind(), this.getTAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                TServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceTypeRealizationEClass, TServiceTypeRealization.class, "TServiceTypeRealization",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTServiceTypeRealization_Fc(), this.getTFCAbbreviation(), "fc", null, 1, 1,
                TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceTypeRealization_Name(), this.getTAttributeName(), "name", null, 1, 1,
                TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceTypeRealization_PresCond(), this.getTPresenceConditionName(), "presCond", "M", 0, 1,
                TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceTypeRealization_PresCondArgs(), this.getTPresenceConditionArgument(), "presCondArgs",
                null, 0, 1, TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceTypeRealization_PresCondArgsID(), this.getTDocID(), "presCondArgsID", null, 0, 1,
                TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceTypeRealization_Type(), this.getTIec61850Name(), "type", null, 0, 1,
                TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTServiceTypeRealization_TypeKind(), this.getTAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                TServiceTypeRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tServiceTypeRealizationsEClass, TServiceTypeRealizations.class, "TServiceTypeRealizations",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference( getTServiceTypeRealizations_ServiceTypeRealization(), this.getTConstructedAttribute(), null,
                "serviceTypeRealization", null, 0, -1, TServiceTypeRealizations.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tSubDataAttributeEClass, TSubDataAttribute.class, "TSubDataAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTSubDataAttribute_DefaultValue(), theXMLTypePackage.getNormalizedString(), "defaultValue",
                null, 0, 1, TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_MaxIndexAttribute(), this.getTAttributeName(), "maxIndexAttribute", null,
                0, 1, TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_MaxValue(), theXMLTypePackage.getDecimal(), "maxValue", null, 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_MinValue(), theXMLTypePackage.getDecimal(), "minValue", null, 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_Name(), this.getTAttributeName(), "name", null, 1, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_PresCond(), this.getTPresenceConditionName(), "presCond", "M", 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_PresCondArgs(), this.getTPresenceConditionArgument(), "presCondArgs", null,
                0, 1, TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_PresCondArgsID(), this.getTDocID(), "presCondArgsID", null, 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_SizeAttribute(), this.getTAttributeName(), "sizeAttribute", null, 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_Type(), this.getTIec61850Name(), "type", null, 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataAttribute_TypeKind(), this.getTAttributeTypeKind(), "typeKind", "BASIC", 0, 1,
                TSubDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );

        initEClass( tSubDataObjectEClass, TSubDataObject.class, "TSubDataObject", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTSubDataObject_IsArray(), theXMLTypePackage.getBoolean(), "isArray", "false", 0, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_MaxIndexAttribute(), this.getTAttributeName(), "maxIndexAttribute", null, 0,
                1, TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_MinIndex(), theXMLTypePackage.getUnsignedInt(), "minIndex", "0", 0, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_Name(), this.getTSubDataObjectName(), "name", null, 1, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_PresCond(), this.getTPresenceConditionName(), "presCond", "M", 0, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_PresCondArgs(), this.getTPresenceConditionArgument(), "presCondArgs", null, 0,
                1, TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_PresCondArgsID(), this.getTDocID(), "presCondArgsID", null, 0, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_SizeAttribute(), this.getTAttributeName(), "sizeAttribute", null, 0, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_Type(), this.getTCDCName(), "type", null, 1, 1, TSubDataObject.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getTSubDataObject_UnderlyingType(), this.getTIec61850Name(), "underlyingType", null, 0, 1,
                TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED );
        initEAttribute( getTSubDataObject_UnderlyingTypeKind(), this.getTDefinedAttributeTypeKind(),
                "underlyingTypeKind", null, 0, 1, TSubDataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( tTitledClassEClass, TTitledClass.class, "TTitledClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getTTitledClass_TitleID(), this.getTDocID(), "titleID", null, 1, 1, TTitledClass.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );

        // Initialize enums and add enum literals
        initEEnum( tacsiServicesKindEEnum, TACSIServicesKind.class, "TACSIServicesKind" );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.ASSOCIATE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.ABORT );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.RELEASE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_SERVER_DIRECTORY );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_LOGICAL_DEVICE_DIRECTORY );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_ALL_DATA_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_DATA_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_DATA_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_DATA_DIRECTORY );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_DATA_DEFINITION );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_DATA_SET_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_DATA_SET_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.CREATE_DATA_SET );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.DELETE_DATA_SET );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_DATA_SET_DIRECTORY );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SELECT_ACTIVE_SG );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SELECT_EDIT_SG );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_EDIT_SG_VALUE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.CONFIRM_EDIT_SG_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_EDIT_SG_VALUE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_SGCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.REPORT );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_BRCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_BRCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_URCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_URCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_LCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_LCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.QUERY_LOG_BY_TIME );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.QUERY_LOG_AFTER );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_LOG_STATUS_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SEND_GOOSE_MESSAGE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_GO_CB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_GO_CB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_GO_REFERENCE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_GOOSE_ELEMENT_NUMBER );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SEND_MSV_MESSAGE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_MSVCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_MSVCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SEND_USV_MESSAGE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_USVCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_USVCB_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SELECT );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SELECT_WITH_VALUE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.CANCEL );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.OPERATE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.COMMAND_TERMINATION );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.TIME_ACTIVATED_OPERATE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_FILE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.SET_FILE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.DELETE_FILE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_FILE_ATTRIBUTE_VALUES );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.TIME_SYNCHRONIZATION );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.INTERNAL_CHANGE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_LOGICAL_NODE_DIRECTORY );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_MSV_REFERENCE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_MSV_ELEMENT_NUMBER );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_USV_REFERENCE );
        addEEnumLiteral( tacsiServicesKindEEnum, TACSIServicesKind.GET_USV_ELEMENT_NUMBER );

        initEEnum( tcbKindEEnum, TCBKind.class, "TCBKind" );
        addEEnumLiteral( tcbKindEEnum, TCBKind.RCB );
        addEEnumLiteral( tcbKindEEnum, TCBKind.LCB );
        addEEnumLiteral( tcbKindEEnum, TCBKind.GO_CB );
        addEEnumLiteral( tcbKindEEnum, TCBKind.SVCB );

        initEEnum( tDefinedAttributeTypeKindEEnum, TDefinedAttributeTypeKind.class, "TDefinedAttributeTypeKind" );
        addEEnumLiteral( tDefinedAttributeTypeKindEEnum, TDefinedAttributeTypeKind.BASIC );
        addEEnumLiteral( tDefinedAttributeTypeKindEEnum, TDefinedAttributeTypeKind.ENUMERATED );
        addEEnumLiteral( tDefinedAttributeTypeKindEEnum, TDefinedAttributeTypeKind.CONSTRUCTED );

        initEEnum( tLicenseKindEEnum, TLicenseKind.class, "TLicenseKind" );
        addEEnumLiteral( tLicenseKindEEnum, TLicenseKind.STANDARD );
        addEEnumLiteral( tLicenseKindEEnum, TLicenseKind.PRIVATE );
        addEEnumLiteral( tLicenseKindEEnum, TLicenseKind.NONE );

        initEEnum( tPubStageEEnum, TPubStage.class, "TPubStage" );
        addEEnumLiteral( tPubStageEEnum, TPubStage.WD );
        addEEnumLiteral( tPubStageEEnum, TPubStage.CD );
        addEEnumLiteral( tPubStageEEnum, TPubStage.CDV );
        addEEnumLiteral( tPubStageEEnum, TPubStage.DTS );
        addEEnumLiteral( tPubStageEEnum, TPubStage.DTR );
        addEEnumLiteral( tPubStageEEnum, TPubStage.FDIS );
        addEEnumLiteral( tPubStageEEnum, TPubStage.TS );
        addEEnumLiteral( tPubStageEEnum, TPubStage.TR );
        addEEnumLiteral( tPubStageEEnum, TPubStage.IS );

        initEEnum( tUndefinedAttributeTypeKindEEnum, TUndefinedAttributeTypeKind.class, "TUndefinedAttributeTypeKind" );
        addEEnumLiteral( tUndefinedAttributeTypeKindEEnum, TUndefinedAttributeTypeKind.UNDEFINED );

        // Initialize data types
        initEDataType( tAbbreviationNameEDataType, String.class, "TAbbreviationName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tAbstractLNClassNameEDataType, String.class, "TAbstractLNClassName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tacsiServicesKindObjectEDataType, TACSIServicesKind.class, "TACSIServicesKindObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tAttributeNameEDataType, String.class, "TAttributeName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tAttributeTypeKindEDataType, Enumerator.class, "TAttributeTypeKind", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tBasicTypeNameEDataType, String.class, "TBasicTypeName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tcbKindObjectEDataType, TCBKind.class, "TCBKindObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tcdcNameEDataType, String.class, "TCDCName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tDataObjectNameEDataType, String.class, "TDataObjectName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tDefinedAttributeTypeKindObjectEDataType, TDefinedAttributeTypeKind.class,
                "TDefinedAttributeTypeKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tDocIDEDataType, String.class, "TDocID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tEmptyStringEDataType, String.class, "TEmptyString", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tfcAbbreviationEDataType, String.class, "TFCAbbreviation", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tIec61850NameEDataType, String.class, "TIec61850Name", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tIec61850NameStringEDataType, String.class, "TIec61850NameString", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tissuesTypeEDataType, String.class, "TissuesType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tLicenseKindObjectEDataType, TLicenseKind.class, "TLicenseKindObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tLiteralNameEDataType, String.class, "TLiteralName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tlnClassNameEDataType, String.class, "TLNClassName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tnsIdentifierEDataType, String.class, "TNSIdentifier", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tnsReleaseEDataType, short.class, "TNSRelease", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tnsReleaseObjectEDataType, Short.class, "TNSReleaseObject", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tnsRevisionEDataType, String.class, "TNSRevision", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tnsVersionEDataType, int.class, "TNSVersion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tnsVersionObjectEDataType, Integer.class, "TNSVersionObject", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tPresenceConditionArgumentEDataType, String.class, "TPresenceConditionArgument", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tPresenceConditionNameEDataType, String.class, "TPresenceConditionName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tPubStageObjectEDataType, TPubStage.class, "TPubStageObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tSubDataObjectNameEDataType, String.class, "TSubDataObjectName", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tumlVersionEDataType, String.class, "TUMLVersion", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS );
        initEDataType( tUndefinedAttributeTypeKindObjectEDataType, TUndefinedAttributeTypeKind.class,
                "TUndefinedAttributeTypeKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS );

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
        addAnnotation( tAbbreviationEClass, source, new String[] { "name", "tAbbreviation", "kind", "empty" } );
        addAnnotation( getTAbbreviation_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTAbbreviation_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tAbbreviationNameEDataType, source, new String[] { "name", "tAbbreviationName", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString" } );
        addAnnotation( tAbbreviationsEClass, source, new String[] { "name", "tAbbreviations", "kind", "elementOnly" } );
        addAnnotation( getTAbbreviations_Abbreviation(), source,
                new String[] { "kind", "element", "name", "Abbreviation", "namespace", "##targetNamespace" } );
        addAnnotation( tAbstractLNClassEClass, source,
                new String[] { "name", "tAbstractLNClass", "kind", "elementOnly" } );
        addAnnotation( getTAbstractLNClass_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tAbstractLNClassNameEDataType, source,
                new String[] { "name", "tAbstractLNClassName", "baseType", "tIec61850Name" } );
        addAnnotation( tacsiServicesKindEEnum, source, new String[] { "name", "tACSIServicesKind" } );
        addAnnotation( tacsiServicesKindObjectEDataType, source,
                new String[] { "name", "tACSIServicesKind:Object", "baseType", "tACSIServicesKind" } );
        addAnnotation( tAnyLNClassEClass, source, new String[] { "name", "tAnyLNClass", "kind", "elementOnly" } );
        addAnnotation( getTAnyLNClass_DataObject(), source,
                new String[] { "kind", "element", "name", "DataObject", "namespace", "##targetNamespace" } );
        addAnnotation( getTAnyLNClass_Base(), source, new String[] { "kind", "attribute", "name", "base" } );
        addAnnotation( tApplicableServiceNSEClass, source,
                new String[] { "name", "tApplicableServiceNS", "kind", "elementOnly" } );
        addAnnotation( getTApplicableServiceNS_ServiceNsUsage(), source,
                new String[] { "kind", "element", "name", "ServiceNsUsage", "namespace", "##targetNamespace" } );
        addAnnotation( getTApplicableServiceNS_Date(), source, new String[] { "kind", "attribute", "name", "date" } );
        addAnnotation( getTApplicableServiceNS_Version(), source,
                new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( tApplicableServicesEClass, source,
                new String[] { "name", "tApplicableServices", "kind", "elementOnly" } );
        addAnnotation( getTApplicableServices_Service(), source,
                new String[] { "kind", "element", "name", "Service", "namespace", "##targetNamespace" } );
        addAnnotation( getTApplicableServices_DataSetMemberOf(), source,
                new String[] { "kind", "element", "name", "DataSetMemberOf", "namespace", "##targetNamespace" } );
        addAnnotation( tAttributeNameEDataType, source,
                new String[] { "name", "tAttributeName", "baseType", "tIec61850Name" } );
        addAnnotation( tAttributeTypeKindEDataType, source, new String[] { "name", "tAttributeTypeKind", "memberTypes",
                "tDefinedAttributeTypeKind tUndefinedAttributeTypeKind" } );
        addAnnotation( tBasicTypeEClass, source, new String[] { "name", "tBasicType", "kind", "empty" } );
        addAnnotation( getTBasicType_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTBasicType_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tBasicTypeNameEDataType, source, new String[] { "name", "tBasicTypeName", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#token", "minLength", "1" } );
        addAnnotation( tBasicTypesEClass, source, new String[] { "name", "tBasicTypes", "kind", "elementOnly" } );
        addAnnotation( getTBasicTypes_BasicType(), source,
                new String[] { "kind", "element", "name", "BasicType", "namespace", "##targetNamespace" } );
        addAnnotation( tcbKindEEnum, source, new String[] { "name", "tCBKind" } );
        addAnnotation( tcbKindObjectEDataType, source,
                new String[] { "name", "tCBKind:Object", "baseType", "tCBKind" } );
        addAnnotation( tcdcEClass, source, new String[] { "name", "tCDC", "kind", "elementOnly" } );
        addAnnotation( getTCDC_SubDataObject(), source,
                new String[] { "kind", "element", "name", "SubDataObject", "namespace", "##targetNamespace" } );
        addAnnotation( getTCDC_DataAttribute(), source,
                new String[] { "kind", "element", "name", "DataAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( getTCDC_ServiceParameter(), source,
                new String[] { "kind", "element", "name", "ServiceParameter", "namespace", "##targetNamespace" } );
        addAnnotation( getTCDC_EnumParameterized(), source,
                new String[] { "kind", "attribute", "name", "enumParameterized" } );
        addAnnotation( getTCDC_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTCDC_Statistics(), source, new String[] { "kind", "attribute", "name", "statistics" } );
        addAnnotation( getTCDC_TypeKindParameterized(), source,
                new String[] { "kind", "attribute", "name", "typeKindParameterized" } );
        addAnnotation( getTCDC_Variant(), source, new String[] { "kind", "attribute", "name", "variant" } );
        addAnnotation( tcdcNameEDataType, source,
                new String[] { "name", "tCDCName", "baseType", "tIec61850Name", "minLength", "1" } );
        addAnnotation( tcdCsEClass, source, new String[] { "name", "tCDCs", "kind", "elementOnly" } );
        addAnnotation( getTCDCs_CDC(), source,
                new String[] { "kind", "element", "name", "CDC", "namespace", "##targetNamespace" } );
        addAnnotation( tChangesEClass, source, new String[] { "name", "tChanges", "kind", "empty" } );
        addAnnotation( getTChanges_ChangesID(), source, new String[] { "kind", "attribute", "name", "changesID" } );
        addAnnotation( getTChanges_Date(), source, new String[] { "kind", "attribute", "name", "date" } );
        addAnnotation( getTChanges_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getTChanges_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getTChanges_Tissues(), source, new String[] { "kind", "attribute", "name", "tissues" } );
        addAnnotation( getTChanges_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( tConstructedAttributeEClass, source,
                new String[] { "name", "tConstructedAttribute", "kind", "elementOnly" } );
        addAnnotation( getTConstructedAttribute_SubDataAttribute(), source,
                new String[] { "kind", "element", "name", "SubDataAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( getTConstructedAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tConstructedAttributesEClass, source,
                new String[] { "name", "tConstructedAttributes", "kind", "elementOnly" } );
        addAnnotation( getTConstructedAttributes_ConstructedAttribute(), source,
                new String[] { "kind", "element", "name", "ConstructedAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( tCopyrightedEClass, source, new String[] { "name", "tCopyrighted", "kind", "elementOnly" } );
        addAnnotation( getTCopyrighted_Copyright(), source,
                new String[] { "kind", "element", "name", "Copyright", "namespace", "##targetNamespace" } );
        addAnnotation( tCopyrightNoticeEClass, source,
                new String[] { "name", "tCopyrightNotice", "kind", "elementOnly" } );
        addAnnotation( getTCopyrightNotice_Notice(), source,
                new String[] { "kind", "element", "name", "Notice", "namespace", "##targetNamespace" } );
        addAnnotation( getTCopyrightNotice_License(), source,
                new String[] { "kind", "element", "name", "License", "namespace", "##targetNamespace" } );
        addAnnotation( tDataAttributeEClass, source, new String[] { "name", "tDataAttribute", "kind", "empty" } );
        addAnnotation( getTDataAttribute_Dchg(), source, new String[] { "kind", "attribute", "name", "dchg" } );
        addAnnotation( getTDataAttribute_DefaultValue(), source,
                new String[] { "kind", "attribute", "name", "defaultValue" } );
        addAnnotation( getTDataAttribute_Dupd(), source, new String[] { "kind", "attribute", "name", "dupd" } );
        addAnnotation( getTDataAttribute_Fc(), source, new String[] { "kind", "attribute", "name", "fc" } );
        addAnnotation( getTDataAttribute_IsArray(), source, new String[] { "kind", "attribute", "name", "isArray" } );
        addAnnotation( getTDataAttribute_MaxIndexAttribute(), source,
                new String[] { "kind", "attribute", "name", "maxIndexAttribute" } );
        addAnnotation( getTDataAttribute_MaxValue(), source, new String[] { "kind", "attribute", "name", "maxValue" } );
        addAnnotation( getTDataAttribute_MinIndex(), source, new String[] { "kind", "attribute", "name", "minIndex" } );
        addAnnotation( getTDataAttribute_MinValue(), source, new String[] { "kind", "attribute", "name", "minValue" } );
        addAnnotation( getTDataAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTDataAttribute_PresCond(), source, new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getTDataAttribute_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getTDataAttribute_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getTDataAttribute_Qchg(), source, new String[] { "kind", "attribute", "name", "qchg" } );
        addAnnotation( getTDataAttribute_SizeAttribute(), source,
                new String[] { "kind", "attribute", "name", "sizeAttribute" } );
        addAnnotation( getTDataAttribute_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTDataAttribute_TypeKind(), source, new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( tDataObjectEClass, source, new String[] { "name", "tDataObject", "kind", "empty" } );
        addAnnotation( getTDataObject_DsPresCond(), source,
                new String[] { "kind", "attribute", "name", "dsPresCond" } );
        addAnnotation( getTDataObject_DsPresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "dsPresCondArgs" } );
        addAnnotation( getTDataObject_DsPresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "dsPresCondArgsID" } );
        addAnnotation( getTDataObject_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTDataObject_PresCond(), source, new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getTDataObject_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getTDataObject_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getTDataObject_Transient(), source, new String[] { "kind", "attribute", "name", "transient" } );
        addAnnotation( getTDataObject_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTDataObject_UnderlyingType(), source,
                new String[] { "kind", "attribute", "name", "underlyingType" } );
        addAnnotation( getTDataObject_UnderlyingTypeKind(), source,
                new String[] { "kind", "attribute", "name", "underlyingTypeKind" } );
        addAnnotation( tDataObjectNameEDataType, source,
                new String[] { "name", "tDataObjectName", "baseType", "tIec61850Name", "maxLength", "12" } );
        addAnnotation( tDataSetMemberOfEClass, source, new String[] { "name", "tDataSetMemberOf", "kind", "empty" } );
        addAnnotation( getTDataSetMemberOf_Cb(), source, new String[] { "kind", "attribute", "name", "cb" } );
        addAnnotation( tDefinedAttributeTypeKindEEnum, source, new String[] { "name", "tDefinedAttributeTypeKind" } );
        addAnnotation( tDefinedAttributeTypeKindObjectEDataType, source,
                new String[] { "name", "tDefinedAttributeTypeKind:Object", "baseType", "tDefinedAttributeTypeKind" } );
        addAnnotation( tDocEClass, source, new String[] { "name", "tDoc", "kind", "mixed" } );
        addAnnotation( getTDoc_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( getTDoc_Group(), source, new String[] { "kind", "group", "name", "group:1" } );
        addAnnotation( getTDoc_Any(), source, new String[] { "kind", "elementWildcard", "wildcards", "##any", "name",
                ":2", "processing", "lax", "group", "#group:1" } );
        addAnnotation( getTDoc_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( tDocIDEDataType, source, new String[] { "name", "tDocID", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "minLength", "1" } );
        addAnnotation( tDocumentedClassEClass, source, new String[] { "name", "tDocumentedClass", "kind", "empty" } );
        addAnnotation( getTDocumentedClass_Deprecated(), source,
                new String[] { "kind", "attribute", "name", "deprecated" } );
        addAnnotation( getTDocumentedClass_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTDocumentedClass_Informative(), source,
                new String[] { "kind", "attribute", "name", "informative" } );
        addAnnotation( tEmptyStringEDataType, source, new String[] { "name", "tEmptyString", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "maxLength", "0" } );
        addAnnotation( tEnumerationEClass, source, new String[] { "name", "tEnumeration", "kind", "elementOnly" } );
        addAnnotation( getTEnumeration_Literal(), source,
                new String[] { "kind", "element", "name", "Literal", "namespace", "##targetNamespace" } );
        addAnnotation( getTEnumeration_InheritedFrom(), source,
                new String[] { "kind", "attribute", "name", "inheritedFrom" } );
        addAnnotation( getTEnumeration_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tEnumerationsEClass, source, new String[] { "name", "tEnumerations", "kind", "elementOnly" } );
        addAnnotation( getTEnumerations_Enumeration(), source,
                new String[] { "kind", "element", "name", "Enumeration", "namespace", "##targetNamespace" } );
        addAnnotation( tfcAbbreviationEDataType, source,
                new String[] { "name", "tFCAbbreviation", "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
                        "minLength", "1", "pattern", "[\\p{IsBasicLatin}]+" } );
        addAnnotation( tFunctionalConstraintEClass, source,
                new String[] { "name", "tFunctionalConstraint", "kind", "elementOnly" } );
        addAnnotation( getTFunctionalConstraint_ApplicableServices(), source,
                new String[] { "kind", "element", "name", "ApplicableServices", "namespace", "##targetNamespace" } );
        addAnnotation( getTFunctionalConstraint_Abbreviation(), source,
                new String[] { "kind", "attribute", "name", "abbreviation" } );
        addAnnotation( getTFunctionalConstraint_DescID(), source,
                new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTFunctionalConstraint_TitleID(), source,
                new String[] { "kind", "attribute", "name", "titleID" } );
        addAnnotation( tFunctionalConstraintsEClass, source,
                new String[] { "name", "tFunctionalConstraints", "kind", "elementOnly" } );
        addAnnotation( getTFunctionalConstraints_FunctionalConstraint(), source,
                new String[] { "kind", "element", "name", "FunctionalConstraint", "namespace", "##targetNamespace" } );
        addAnnotation( tIec61850NameEDataType, source,
                new String[] { "name", "tIec61850Name", "baseType", "http://www.eclipse.org/emf/2003/XMLType#Name",
                        "minLength", "1", "pattern", "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" } );
        addAnnotation( tIec61850NameStringEDataType, source,
                new String[] { "name", "tIec61850NameString", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "pattern",
                        "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+" } );
        addAnnotation( tissuesTypeEDataType, source, new String[] { "name", "tissues_._type", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "minLength", "1" } );
        addAnnotation( tLicenseEClass, source, new String[] { "name", "tLicense", "kind", "mixed" } );
        addAnnotation( getTLicense_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( getTLicense_Kind(), source, new String[] { "kind", "attribute", "name", "kind" } );
        addAnnotation( getTLicense_Uri(), source, new String[] { "kind", "attribute", "name", "uri" } );
        addAnnotation( tLicenseKindEEnum, source, new String[] { "name", "tLicenseKind" } );
        addAnnotation( tLicenseKindObjectEDataType, source,
                new String[] { "name", "tLicenseKind:Object", "baseType", "tLicenseKind" } );
        addAnnotation( tLiteralEClass, source, new String[] { "name", "tLiteral", "kind", "empty" } );
        addAnnotation( getTLiteral_LiteralVal(), source, new String[] { "kind", "attribute", "name", "literalVal" } );
        addAnnotation( getTLiteral_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tLiteralNameEDataType, source,
                new String[] { "name", "tLiteralName", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "maxLength", "127", "pattern",
                        "[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]*" } );
        addAnnotation( tlnClassEClass, source, new String[] { "name", "tLNClass", "kind", "elementOnly" } );
        addAnnotation( getTLNClass_CanHaveLOG(), source, new String[] { "kind", "attribute", "name", "canHaveLOG" } );
        addAnnotation( getTLNClass_IsExtension(), source, new String[] { "kind", "attribute", "name", "isExtension" } );
        addAnnotation( getTLNClass_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( tlnClassesEClass, source, new String[] { "name", "tLNClasses", "kind", "elementOnly" } );
        addAnnotation( getTLNClasses_AbstractLNClass(), source,
                new String[] { "kind", "element", "name", "AbstractLNClass", "namespace", "##targetNamespace" } );
        addAnnotation( getTLNClasses_LNClass(), source,
                new String[] { "kind", "element", "name", "LNClass", "namespace", "##targetNamespace" } );
        addAnnotation( tlnClassNameEDataType, source, new String[] { "name", "tLNClassName", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#Name", "pattern", "LLN0 [A-Z]{4}" } );
        addAnnotation( tNoticeEClass, source, new String[] { "name", "tNotice", "kind", "mixed" } );
        addAnnotation( getTNotice_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" } );
        addAnnotation( tnsEClass, source, new String[] { "name", "tNS", "kind", "elementOnly" } );
        addAnnotation( getTNS_Changes(), source,
                new String[] { "kind", "element", "name", "Changes", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_DependsOn(), source,
                new String[] { "kind", "element", "name", "DependsOn", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_BasicTypes(), source,
                new String[] { "kind", "element", "name", "BasicTypes", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_FunctionalConstraints(), source,
                new String[] { "kind", "element", "name", "FunctionalConstraints", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_PresenceConditions(), source,
                new String[] { "kind", "element", "name", "PresenceConditions", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_Abbreviations(), source,
                new String[] { "kind", "element", "name", "Abbreviations", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_Enumerations(), source,
                new String[] { "kind", "element", "name", "Enumerations", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_ConstructedAttributes(), source,
                new String[] { "kind", "element", "name", "ConstructedAttributes", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_CDCs(), source,
                new String[] { "kind", "element", "name", "CDCs", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_LNClasses(), source,
                new String[] { "kind", "element", "name", "LNClasses", "namespace", "##targetNamespace" } );
        addAnnotation( getTNS_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTNS_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getTNS_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getTNS_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getTNS_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getTNS_UmlDate(), source, new String[] { "kind", "attribute", "name", "umlDate" } );
        addAnnotation( getTNS_UmlVersion(), source, new String[] { "kind", "attribute", "name", "umlVersion" } );
        addAnnotation( getTNS_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( tnsDocEClass, source, new String[] { "name", "tNSDoc", "kind", "elementOnly" } );
        addAnnotation( getTNSDoc_Doc(), source,
                new String[] { "kind", "element", "name", "Doc", "namespace", "##targetNamespace" } );
        addAnnotation( getTNSDoc_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getTNSDoc_Lang(), source, new String[] { "kind", "attribute", "name", "lang" } );
        addAnnotation( getTNSDoc_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getTNSDoc_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getTNSDoc_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getTNSDoc_UmlDate(), source, new String[] { "kind", "attribute", "name", "umlDate" } );
        addAnnotation( getTNSDoc_UmlVersion(), source, new String[] { "kind", "attribute", "name", "umlVersion" } );
        addAnnotation( getTNSDoc_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( tnsIdentifierEDataType, source, new String[] { "name", "tNSIdentifier", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#normalizedString", "pattern", "\\p{IsBasicLatin}+" } );
        addAnnotation( tnsReleaseEDataType, source, new String[] { "name", "tNSRelease", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#unsignedByte", "minExclusive", "0" } );
        addAnnotation( tnsReleaseObjectEDataType, source,
                new String[] { "name", "tNSRelease:Object", "baseType", "tNSRelease" } );
        addAnnotation( tnsRevisionEDataType, source, new String[] { "name", "tNSRevision", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#token", "pattern", "[A-Z]" } );
        addAnnotation( tnsVersionEDataType, source,
                new String[] { "name", "tNSVersion", "baseType",
                        "http://www.eclipse.org/emf/2003/XMLType#unsignedShort", "minInclusive", "2002", "maxInclusive",
                        "2099" } );
        addAnnotation( tnsVersionObjectEDataType, source,
                new String[] { "name", "tNSVersion:Object", "baseType", "tNSVersion" } );
        addAnnotation( tPresenceConditionEClass, source,
                new String[] { "name", "tPresenceCondition", "kind", "empty" } );
        addAnnotation( getTPresenceCondition_Argument(), source,
                new String[] { "kind", "attribute", "name", "argument" } );
        addAnnotation( getTPresenceCondition_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTPresenceCondition_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTPresenceCondition_TitleID(), source,
                new String[] { "kind", "attribute", "name", "titleID" } );
        addAnnotation( tPresenceConditionArgumentEDataType, source, new String[] { "name", "tPresenceConditionArgument",
                "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString" } );
        addAnnotation( tPresenceConditionNameEDataType, source, new String[] { "name", "tPresenceConditionName",
                "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString" } );
        addAnnotation( tPresenceConditionsEClass, source,
                new String[] { "name", "tPresenceConditions", "kind", "elementOnly" } );
        addAnnotation( getTPresenceConditions_PresenceCondition(), source,
                new String[] { "kind", "element", "name", "PresenceCondition", "namespace", "##targetNamespace" } );
        addAnnotation( tPubStageEEnum, source, new String[] { "name", "tPubStage" } );
        addAnnotation( tPubStageObjectEDataType, source,
                new String[] { "name", "tPubStage:Object", "baseType", "tPubStage" } );
        addAnnotation( tServiceCDCEClass, source, new String[] { "name", "tServiceCDC", "kind", "elementOnly" } );
        addAnnotation( getTServiceCDC_ServiceDataAttribute(), source,
                new String[] { "kind", "element", "name", "ServiceDataAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceCDC_Cdc(), source, new String[] { "kind", "attribute", "name", "cdc" } );
        addAnnotation( getTServiceCDC_Variant(), source, new String[] { "kind", "attribute", "name", "variant" } );
        addAnnotation( tServiceCDCsEClass, source, new String[] { "name", "tServiceCDCs", "kind", "elementOnly" } );
        addAnnotation( getTServiceCDCs_ServiceCDC(), source,
                new String[] { "kind", "element", "name", "ServiceCDC", "namespace", "##targetNamespace" } );
        addAnnotation( tServiceConstructedAttributeEClass, source,
                new String[] { "name", "tServiceConstructedAttribute", "kind", "elementOnly" } );
        addAnnotation( getTServiceConstructedAttribute_TypeKindParameterized(), source,
                new String[] { "kind", "attribute", "name", "typeKindParameterized" } );
        addAnnotation( tServiceConstructedAttributesEClass, source,
                new String[] { "name", "tServiceConstructedAttributes", "kind", "elementOnly" } );
        addAnnotation( getTServiceConstructedAttributes_ServiceConstructedAttribute(), source, new String[] { "kind",
                "element", "name", "ServiceConstructedAttribute", "namespace", "##targetNamespace" } );
        addAnnotation( tServiceDataAttributeEClass, source,
                new String[] { "name", "tServiceDataAttribute", "kind", "empty" } );
        addAnnotation( getTServiceDataAttribute_Fc(), source, new String[] { "kind", "attribute", "name", "fc" } );
        addAnnotation( getTServiceDataAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTServiceDataAttribute_PresCond(), source,
                new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getTServiceDataAttribute_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getTServiceDataAttribute_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getTServiceDataAttribute_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTServiceDataAttribute_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( getTServiceDataAttribute_UnderlyingType(), source,
                new String[] { "kind", "attribute", "name", "underlyingType" } );
        addAnnotation( getTServiceDataAttribute_UnderlyingTypeKind(), source,
                new String[] { "kind", "attribute", "name", "underlyingTypeKind" } );
        addAnnotation( tServiceNSEClass, source, new String[] { "name", "tServiceNS", "kind", "elementOnly" } );
        addAnnotation( getTServiceNS_Changes(), source,
                new String[] { "kind", "element", "name", "Changes", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_FunctionalConstraints(), source,
                new String[] { "kind", "element", "name", "FunctionalConstraints", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_PresenceConditions(), source,
                new String[] { "kind", "element", "name", "PresenceConditions", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_Abbreviations(), source,
                new String[] { "kind", "element", "name", "Abbreviations", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_ServiceTypeRealizations(), source, new String[] { "kind", "element", "name",
                "ServiceTypeRealizations", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_ServiceConstructedAttributes(), source, new String[] { "kind", "element", "name",
                "ServiceConstructedAttributes", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_ServiceCDCs(), source,
                new String[] { "kind", "element", "name", "ServiceCDCs", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNS_DescID(), source, new String[] { "kind", "attribute", "name", "descID" } );
        addAnnotation( getTServiceNS_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getTServiceNS_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getTServiceNS_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getTServiceNS_Revision(), source, new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getTServiceNS_UmlDate(), source, new String[] { "kind", "attribute", "name", "umlDate" } );
        addAnnotation( getTServiceNS_UmlVersion(), source, new String[] { "kind", "attribute", "name", "umlVersion" } );
        addAnnotation( getTServiceNS_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( tServiceNsUsageEClass, source,
                new String[] { "name", "tServiceNsUsage", "kind", "elementOnly" } );
        addAnnotation( getTServiceNsUsage_AppliesTo(), source,
                new String[] { "kind", "element", "name", "AppliesTo", "namespace", "##targetNamespace" } );
        addAnnotation( getTServiceNsUsage_Id(), source, new String[] { "kind", "attribute", "name", "id" } );
        addAnnotation( getTServiceNsUsage_PublicationStage(), source,
                new String[] { "kind", "attribute", "name", "publicationStage" } );
        addAnnotation( getTServiceNsUsage_Release(), source, new String[] { "kind", "attribute", "name", "release" } );
        addAnnotation( getTServiceNsUsage_Revision(), source,
                new String[] { "kind", "attribute", "name", "revision" } );
        addAnnotation( getTServiceNsUsage_Version(), source, new String[] { "kind", "attribute", "name", "version" } );
        addAnnotation( tServiceParameterEClass, source, new String[] { "name", "tServiceParameter", "kind", "empty" } );
        addAnnotation( getTServiceParameter_DefaultValue(), source,
                new String[] { "kind", "attribute", "name", "defaultValue" } );
        addAnnotation( getTServiceParameter_MaxValue(), source,
                new String[] { "kind", "attribute", "name", "maxValue" } );
        addAnnotation( getTServiceParameter_MinValue(), source,
                new String[] { "kind", "attribute", "name", "minValue" } );
        addAnnotation( getTServiceParameter_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTServiceParameter_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTServiceParameter_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( tServiceTypeRealizationEClass, source,
                new String[] { "name", "tServiceTypeRealization", "kind", "empty" } );
        addAnnotation( getTServiceTypeRealization_Fc(), source, new String[] { "kind", "attribute", "name", "fc" } );
        addAnnotation( getTServiceTypeRealization_Name(), source,
                new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTServiceTypeRealization_PresCond(), source,
                new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getTServiceTypeRealization_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getTServiceTypeRealization_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getTServiceTypeRealization_Type(), source,
                new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTServiceTypeRealization_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( tServiceTypeRealizationsEClass, source,
                new String[] { "name", "tServiceTypeRealizations", "kind", "elementOnly" } );
        addAnnotation( getTServiceTypeRealizations_ServiceTypeRealization(), source, new String[] { "kind", "element",
                "name", "ServiceTypeRealization", "namespace", "##targetNamespace" } );
        addAnnotation( tSubDataAttributeEClass, source, new String[] { "name", "tSubDataAttribute", "kind", "empty" } );
        addAnnotation( getTSubDataAttribute_DefaultValue(), source,
                new String[] { "kind", "attribute", "name", "defaultValue" } );
        addAnnotation( getTSubDataAttribute_IsArray(), source,
                new String[] { "kind", "attribute", "name", "isArray" } );
        addAnnotation( getTSubDataAttribute_MaxIndexAttribute(), source,
                new String[] { "kind", "attribute", "name", "maxIndexAttribute" } );
        addAnnotation( getTSubDataAttribute_MaxValue(), source,
                new String[] { "kind", "attribute", "name", "maxValue" } );
        addAnnotation( getTSubDataAttribute_MinIndex(), source,
                new String[] { "kind", "attribute", "name", "minIndex" } );
        addAnnotation( getTSubDataAttribute_MinValue(), source,
                new String[] { "kind", "attribute", "name", "minValue" } );
        addAnnotation( getTSubDataAttribute_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTSubDataAttribute_PresCond(), source,
                new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getTSubDataAttribute_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getTSubDataAttribute_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getTSubDataAttribute_SizeAttribute(), source,
                new String[] { "kind", "attribute", "name", "sizeAttribute" } );
        addAnnotation( getTSubDataAttribute_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTSubDataAttribute_TypeKind(), source,
                new String[] { "kind", "attribute", "name", "typeKind" } );
        addAnnotation( tSubDataObjectEClass, source, new String[] { "name", "tSubDataObject", "kind", "empty" } );
        addAnnotation( getTSubDataObject_IsArray(), source, new String[] { "kind", "attribute", "name", "isArray" } );
        addAnnotation( getTSubDataObject_MaxIndexAttribute(), source,
                new String[] { "kind", "attribute", "name", "maxIndexAttribute" } );
        addAnnotation( getTSubDataObject_MinIndex(), source, new String[] { "kind", "attribute", "name", "minIndex" } );
        addAnnotation( getTSubDataObject_Name(), source, new String[] { "kind", "attribute", "name", "name" } );
        addAnnotation( getTSubDataObject_PresCond(), source, new String[] { "kind", "attribute", "name", "presCond" } );
        addAnnotation( getTSubDataObject_PresCondArgs(), source,
                new String[] { "kind", "attribute", "name", "presCondArgs" } );
        addAnnotation( getTSubDataObject_PresCondArgsID(), source,
                new String[] { "kind", "attribute", "name", "presCondArgsID" } );
        addAnnotation( getTSubDataObject_SizeAttribute(), source,
                new String[] { "kind", "attribute", "name", "sizeAttribute" } );
        addAnnotation( getTSubDataObject_Type(), source, new String[] { "kind", "attribute", "name", "type" } );
        addAnnotation( getTSubDataObject_UnderlyingType(), source,
                new String[] { "kind", "attribute", "name", "underlyingType" } );
        addAnnotation( getTSubDataObject_UnderlyingTypeKind(), source,
                new String[] { "kind", "attribute", "name", "underlyingTypeKind" } );
        addAnnotation( tSubDataObjectNameEDataType, source,
                new String[] { "name", "tSubDataObjectName", "baseType", "tIec61850Name" } );
        addAnnotation( tTitledClassEClass, source, new String[] { "name", "tTitledClass", "kind", "empty" } );
        addAnnotation( getTTitledClass_TitleID(), source, new String[] { "kind", "attribute", "name", "titleID" } );
        addAnnotation( tumlVersionEDataType, source, new String[] { "name", "tUMLVersion", "baseType",
                "http://www.eclipse.org/emf/2003/XMLType#Name", "minLength", "1" } );
        addAnnotation( tUndefinedAttributeTypeKindEEnum, source,
                new String[] { "name", "tUndefinedAttributeTypeKind" } );
        addAnnotation( tUndefinedAttributeTypeKindObjectEDataType, source, new String[] { "name",
                "tUndefinedAttributeTypeKind:Object", "baseType", "tUndefinedAttributeTypeKind" } );
    }

} //NsdPackageImpl
