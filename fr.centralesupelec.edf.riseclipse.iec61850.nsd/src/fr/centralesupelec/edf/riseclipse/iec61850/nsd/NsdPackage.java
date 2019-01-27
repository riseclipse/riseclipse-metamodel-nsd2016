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
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory
 * @model kind="package"
 * @generated
 */
public interface NsdPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "nsd";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.iec.ch/61850/2016/NSD";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "nsd";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NsdPackage eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl.init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAppliesToType()
     * @generated
     */
    int APPLIES_TO_TYPE = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__PUBLICATION_STAGE = 1;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__RELEASE = 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__REVISION = 3;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE__VERSION = 4;

    /**
     * The number of structural features of the '<em>Applies To Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Applies To Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLIES_TO_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl <em>Depends On Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDependsOnType()
     * @generated
     */
    int DEPENDS_ON_TYPE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE__PUBLICATION_STAGE = 1;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE__RELEASE = 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE__REVISION = 3;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE__VERSION = 4;

    /**
     * The number of structural features of the '<em>Depends On Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Depends On Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDS_ON_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 2;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Applicable Service NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__APPLICABLE_SERVICE_NS = 3;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COPYRIGHT = 4;

    /**
     * The feature id for the '<em><b>NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NS = 5;

    /**
     * The feature id for the '<em><b>NS Doc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NS_DOC = 6;

    /**
     * The feature id for the '<em><b>Service NS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SERVICE_NS = 7;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl <em>Service Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceType()
     * @generated
     */
    int SERVICE_TYPE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>Service Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Service Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationImpl <em>TAbbreviation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbbreviation()
     * @generated
     */
    int TABBREVIATION = 4;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATION__DESC_ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATION__NAME = 1;

    /**
     * The number of structural features of the '<em>TAbbreviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>TAbbreviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationsImpl <em>TAbbreviations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbbreviations()
     * @generated
     */
    int TABBREVIATIONS = 5;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATIONS__ABBREVIATION = 0;

    /**
     * The number of structural features of the '<em>TAbbreviations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TAbbreviations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABBREVIATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocumentedClassImpl <em>TDocumented Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocumentedClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDocumentedClass()
     * @generated
     */
    int TDOCUMENTED_CLASS = 23;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOCUMENTED_CLASS__DEPRECATED = 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOCUMENTED_CLASS__DESC_ID = 1;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOCUMENTED_CLASS__INFORMATIVE = 2;

    /**
     * The number of structural features of the '<em>TDocumented Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOCUMENTED_CLASS_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>TDocumented Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOCUMENTED_CLASS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TTitledClassImpl <em>TTitled Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TTitledClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTTitledClass()
     * @generated
     */
    int TTITLED_CLASS = 49;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTITLED_CLASS__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTITLED_CLASS__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTITLED_CLASS__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTITLED_CLASS__TITLE_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TTitled Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTITLED_CLASS_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TTitled Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTITLED_CLASS_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAnyLNClassImpl <em>TAny LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAnyLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAnyLNClass()
     * @generated
     */
    int TANY_LN_CLASS = 7;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS__DEPRECATED = TTITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS__DESC_ID = TTITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS__INFORMATIVE = TTITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS__TITLE_ID = TTITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS__DATA_OBJECT = TTITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS__BASE = TTITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TAny LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS_FEATURE_COUNT = TTITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TAny LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANY_LN_CLASS_OPERATION_COUNT = TTITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbstractLNClassImpl <em>TAbstract LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbstractLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbstractLNClass()
     * @generated
     */
    int TABSTRACT_LN_CLASS = 6;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__DEPRECATED = TANY_LN_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__DESC_ID = TANY_LN_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__INFORMATIVE = TANY_LN_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__TITLE_ID = TANY_LN_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__DATA_OBJECT = TANY_LN_CLASS__DATA_OBJECT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__BASE = TANY_LN_CLASS__BASE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS__NAME = TANY_LN_CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TAbstract LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS_FEATURE_COUNT = TANY_LN_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TAbstract LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABSTRACT_LN_CLASS_OPERATION_COUNT = TANY_LN_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightedImpl <em>TCopyrighted</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightedImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCopyrighted()
     * @generated
     */
    int TCOPYRIGHTED = 17;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHTED__COPYRIGHT = 0;

    /**
     * The number of structural features of the '<em>TCopyrighted</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHTED_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TCopyrighted</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHTED_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServiceNSImpl <em>TApplicable Service NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServiceNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTApplicableServiceNS()
     * @generated
     */
    int TAPPLICABLE_SERVICE_NS = 8;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICE_NS__COPYRIGHT = TCOPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Service Ns Usage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICE_NS__SERVICE_NS_USAGE = TCOPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICE_NS__DATE = TCOPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICE_NS__VERSION = TCOPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TApplicable Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICE_NS_FEATURE_COUNT = TCOPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TApplicable Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICE_NS_OPERATION_COUNT = TCOPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServicesImpl <em>TApplicable Services</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServicesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTApplicableServices()
     * @generated
     */
    int TAPPLICABLE_SERVICES = 9;

    /**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICES__SERVICE = 0;

    /**
     * The feature id for the '<em><b>Data Set Member Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF = 1;

    /**
     * The number of structural features of the '<em>TApplicable Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICES_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>TApplicable Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABLE_SERVICES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypeImpl <em>TBasic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTBasicType()
     * @generated
     */
    int TBASIC_TYPE = 10;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPE__DESC_ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>TBasic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>TBasic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypesImpl <em>TBasic Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTBasicTypes()
     * @generated
     */
    int TBASIC_TYPES = 11;

    /**
     * The feature id for the '<em><b>Basic Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPES__BASIC_TYPE = 0;

    /**
     * The number of structural features of the '<em>TBasic Types</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TBasic Types</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TBASIC_TYPES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCImpl <em>TCDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCDC()
     * @generated
     */
    int TCDC = 12;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__DEPRECATED = TTITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__DESC_ID = TTITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__INFORMATIVE = TTITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__TITLE_ID = TTITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Sub Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__SUB_DATA_OBJECT = TTITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__DATA_ATTRIBUTE = TTITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Service Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__SERVICE_PARAMETER = TTITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Enum Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__ENUM_PARAMETERIZED = TTITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__NAME = TTITLED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Statistics</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__STATISTICS = TTITLED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__TYPE_KIND_PARAMETERIZED = TTITLED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC__VARIANT = TTITLED_CLASS_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>TCDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC_FEATURE_COUNT = TTITLED_CLASS_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>TCDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCDC_OPERATION_COUNT = TTITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCsImpl <em>TCD Cs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCDCs()
     * @generated
     */
    int TCD_CS = 13;

    /**
     * The feature id for the '<em><b>CDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCD_CS__CDC = 0;

    /**
     * The number of structural features of the '<em>TCD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCD_CS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TCD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCD_CS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TChangesImpl <em>TChanges</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TChangesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTChanges()
     * @generated
     */
    int TCHANGES = 14;

    /**
     * The feature id for the '<em><b>Changes ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES__CHANGES_ID = 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES__DATE = 1;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES__RELEASE = 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES__REVISION = 3;

    /**
     * The feature id for the '<em><b>Tissues</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES__TISSUES = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES__VERSION = 5;

    /**
     * The number of structural features of the '<em>TChanges</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>TChanges</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHANGES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributeImpl <em>TConstructed Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTConstructedAttribute()
     * @generated
     */
    int TCONSTRUCTED_ATTRIBUTE = 15;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE__DEPRECATED = TTITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE__DESC_ID = TTITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE__INFORMATIVE = TTITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE__TITLE_ID = TTITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = TTITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE__NAME = TTITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TConstructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE_FEATURE_COUNT = TTITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TConstructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTE_OPERATION_COUNT = TTITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributesImpl <em>TConstructed Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTConstructedAttributes()
     * @generated
     */
    int TCONSTRUCTED_ATTRIBUTES = 16;

    /**
     * The feature id for the '<em><b>Constructed Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE = 0;

    /**
     * The number of structural features of the '<em>TConstructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TConstructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCONSTRUCTED_ATTRIBUTES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightNoticeImpl <em>TCopyright Notice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightNoticeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCopyrightNotice()
     * @generated
     */
    int TCOPYRIGHT_NOTICE = 18;

    /**
     * The feature id for the '<em><b>Notice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHT_NOTICE__NOTICE = 0;

    /**
     * The feature id for the '<em><b>License</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHT_NOTICE__LICENSE = 1;

    /**
     * The number of structural features of the '<em>TCopyright Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHT_NOTICE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>TCopyright Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCOPYRIGHT_NOTICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataAttributeImpl <em>TData Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataAttribute()
     * @generated
     */
    int TDATA_ATTRIBUTE = 19;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__DCHG = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__DEFAULT_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__DUPD = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__FC = TDOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__IS_ARRAY = TDOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = TDOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__MAX_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__MIN_INDEX = TDOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__MIN_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__PRES_COND = TDOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__PRES_COND_ARGS = TDOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__PRES_COND_ARGS_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__QCHG = TDOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__SIZE_ATTRIBUTE = TDOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE__TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>TData Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 17;

    /**
     * The number of operations of the '<em>TData Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_ATTRIBUTE_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl <em>TData Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataObject()
     * @generated
     */
    int TDATA_OBJECT = 20;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Ds Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__DS_PRES_COND = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__DS_PRES_COND_ARGS = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__DS_PRES_COND_ARGS_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__PRES_COND = TDOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__PRES_COND_ARGS = TDOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__PRES_COND_ARGS_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__TRANSIENT = TDOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__UNDERLYING_TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT__UNDERLYING_TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>TData Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>TData Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_OBJECT_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataSetMemberOfImpl <em>TData Set Member Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataSetMemberOfImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataSetMemberOf()
     * @generated
     */
    int TDATA_SET_MEMBER_OF = 21;

    /**
     * The feature id for the '<em><b>Cb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_SET_MEMBER_OF__CB = 0;

    /**
     * The number of structural features of the '<em>TData Set Member Of</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_SET_MEMBER_OF_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TData Set Member Of</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDATA_SET_MEMBER_OF_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl <em>TDoc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDoc()
     * @generated
     */
    int TDOC = 22;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOC__MIXED = 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOC__GROUP = 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOC__ANY = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOC__ID = 3;

    /**
     * The number of structural features of the '<em>TDoc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOC_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>TDoc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDOC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationImpl <em>TEnumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTEnumeration()
     * @generated
     */
    int TENUMERATION = 24;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__DEPRECATED = TTITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__DESC_ID = TTITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__INFORMATIVE = TTITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__TITLE_ID = TTITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Literal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__LITERAL = TTITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inherited From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__INHERITED_FROM = TTITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION__NAME = TTITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TEnumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION_FEATURE_COUNT = TTITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TEnumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATION_OPERATION_COUNT = TTITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationsImpl <em>TEnumerations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTEnumerations()
     * @generated
     */
    int TENUMERATIONS = 25;

    /**
     * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATIONS__ENUMERATION = 0;

    /**
     * The number of structural features of the '<em>TEnumerations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TEnumerations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TENUMERATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl <em>TFunctional Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTFunctionalConstraint()
     * @generated
     */
    int TFUNCTIONAL_CONSTRAINT = 26;

    /**
     * The feature id for the '<em><b>Applicable Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES = 0;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINT__ABBREVIATION = 1;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINT__DESC_ID = 2;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINT__TITLE_ID = 3;

    /**
     * The number of structural features of the '<em>TFunctional Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>TFunctional Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintsImpl <em>TFunctional Constraints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTFunctionalConstraints()
     * @generated
     */
    int TFUNCTIONAL_CONSTRAINTS = 27;

    /**
     * The feature id for the '<em><b>Functional Constraint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT = 0;

    /**
     * The number of structural features of the '<em>TFunctional Constraints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINTS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TFunctional Constraints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TFUNCTIONAL_CONSTRAINTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLicenseImpl <em>TLicense</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLicenseImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLicense()
     * @generated
     */
    int TLICENSE = 28;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLICENSE__MIXED = 0;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLICENSE__KIND = 1;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLICENSE__URI = 2;

    /**
     * The number of structural features of the '<em>TLicense</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLICENSE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>TLicense</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLICENSE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLiteralImpl <em>TLiteral</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLiteralImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLiteral()
     * @generated
     */
    int TLITERAL = 29;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Literal Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL__LITERAL_VAL = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TLiteral</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TLiteral</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLITERAL_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassImpl <em>TLN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLNClass()
     * @generated
     */
    int TLN_CLASS = 30;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__DEPRECATED = TANY_LN_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__DESC_ID = TANY_LN_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__INFORMATIVE = TANY_LN_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__TITLE_ID = TANY_LN_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__DATA_OBJECT = TANY_LN_CLASS__DATA_OBJECT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__BASE = TANY_LN_CLASS__BASE;

    /**
     * The feature id for the '<em><b>Can Have LOG</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__CAN_HAVE_LOG = TANY_LN_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__IS_EXTENSION = TANY_LN_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS__NAME = TANY_LN_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TLN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS_FEATURE_COUNT = TANY_LN_CLASS_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TLN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASS_OPERATION_COUNT = TANY_LN_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassesImpl <em>TLN Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLNClasses()
     * @generated
     */
    int TLN_CLASSES = 31;

    /**
     * The feature id for the '<em><b>Abstract LN Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASSES__ABSTRACT_LN_CLASS = 0;

    /**
     * The feature id for the '<em><b>LN Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASSES__LN_CLASS = 1;

    /**
     * The number of structural features of the '<em>TLN Classes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASSES_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>TLN Classes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TLN_CLASSES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNoticeImpl <em>TNotice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNoticeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNotice()
     * @generated
     */
    int TNOTICE = 32;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNOTICE__MIXED = 0;

    /**
     * The number of structural features of the '<em>TNotice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNOTICE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TNotice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNOTICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl <em>TNS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNS()
     * @generated
     */
    int TNS = 33;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__COPYRIGHT = TCOPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__CHANGES = TCOPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Depends On</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__DEPENDS_ON = TCOPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Basic Types</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__BASIC_TYPES = TCOPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__FUNCTIONAL_CONSTRAINTS = TCOPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__PRESENCE_CONDITIONS = TCOPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__ABBREVIATIONS = TCOPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Enumerations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__ENUMERATIONS = TCOPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__CONSTRUCTED_ATTRIBUTES = TCOPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__CD_CS = TCOPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>LN Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__LN_CLASSES = TCOPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__DESC_ID = TCOPYRIGHTED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__ID = TCOPYRIGHTED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__PUBLICATION_STAGE = TCOPYRIGHTED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__RELEASE = TCOPYRIGHTED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__REVISION = TCOPYRIGHTED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__UML_DATE = TCOPYRIGHTED_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__UML_VERSION = TCOPYRIGHTED_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS__VERSION = TCOPYRIGHTED_FEATURE_COUNT + 17;

    /**
     * The number of structural features of the '<em>TNS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_FEATURE_COUNT = TCOPYRIGHTED_FEATURE_COUNT + 18;

    /**
     * The number of operations of the '<em>TNS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_OPERATION_COUNT = TCOPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSDocImpl <em>TNS Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSDocImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSDoc()
     * @generated
     */
    int TNS_DOC = 34;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__COPYRIGHT = TCOPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Doc</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__DOC = TCOPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__ID = TCOPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__LANG = TCOPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__PUBLICATION_STAGE = TCOPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__RELEASE = TCOPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__REVISION = TCOPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__UML_DATE = TCOPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__UML_VERSION = TCOPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC__VERSION = TCOPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>TNS Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC_FEATURE_COUNT = TCOPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>TNS Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TNS_DOC_OPERATION_COUNT = TCOPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionImpl <em>TPresence Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceCondition()
     * @generated
     */
    int TPRESENCE_CONDITION = 35;

    /**
     * The feature id for the '<em><b>Argument</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITION__ARGUMENT = 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITION__DESC_ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITION__NAME = 2;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITION__TITLE_ID = 3;

    /**
     * The number of structural features of the '<em>TPresence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITION_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>TPresence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionsImpl <em>TPresence Conditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceConditions()
     * @generated
     */
    int TPRESENCE_CONDITIONS = 36;

    /**
     * The feature id for the '<em><b>Presence Condition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITIONS__PRESENCE_CONDITION = 0;

    /**
     * The number of structural features of the '<em>TPresence Conditions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TPresence Conditions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPRESENCE_CONDITIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl <em>TService CDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceCDC()
     * @generated
     */
    int TSERVICE_CDC = 37;

    /**
     * The feature id for the '<em><b>Service Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CDC__CDC = 1;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CDC__VARIANT = 2;

    /**
     * The number of structural features of the '<em>TService CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CDC_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>TService CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CDC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCsImpl <em>TService CD Cs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceCDCs()
     * @generated
     */
    int TSERVICE_CD_CS = 38;

    /**
     * The feature id for the '<em><b>Service CDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CD_CS__SERVICE_CDC = 0;

    /**
     * The number of structural features of the '<em>TService CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CD_CS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TService CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CD_CS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributeImpl <em>TService Constructed Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceConstructedAttribute()
     * @generated
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE = 39;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__DEPRECATED = TCONSTRUCTED_ATTRIBUTE__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__DESC_ID = TCONSTRUCTED_ATTRIBUTE__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__INFORMATIVE = TCONSTRUCTED_ATTRIBUTE__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__TITLE_ID = TCONSTRUCTED_ATTRIBUTE__TITLE_ID;

    /**
     * The feature id for the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = TCONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__NAME = TCONSTRUCTED_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED = TCONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TService Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT = TCONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TService Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT = TCONSTRUCTED_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributesImpl <em>TService Constructed Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceConstructedAttributes()
     * @generated
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTES = 40;

    /**
     * The feature id for the '<em><b>Service Constructed Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE = 0;

    /**
     * The number of structural features of the '<em>TService Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TService Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_CONSTRUCTED_ATTRIBUTES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceDataAttributeImpl <em>TService Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceDataAttribute()
     * @generated
     */
    int TSERVICE_DATA_ATTRIBUTE = 41;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__FC = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__PRES_COND = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS = TDOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>TService Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>TService Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_DATA_ATTRIBUTE_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNSImpl <em>TService NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceNS()
     * @generated
     */
    int TSERVICE_NS = 42;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__COPYRIGHT = TCOPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__CHANGES = TCOPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__FUNCTIONAL_CONSTRAINTS = TCOPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__PRESENCE_CONDITIONS = TCOPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__ABBREVIATIONS = TCOPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Service Type Realizations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__SERVICE_TYPE_REALIZATIONS = TCOPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Service Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES = TCOPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Service CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__SERVICE_CD_CS = TCOPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__DESC_ID = TCOPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__ID = TCOPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__PUBLICATION_STAGE = TCOPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__RELEASE = TCOPYRIGHTED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__REVISION = TCOPYRIGHTED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__UML_DATE = TCOPYRIGHTED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__UML_VERSION = TCOPYRIGHTED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS__VERSION = TCOPYRIGHTED_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>TService NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_FEATURE_COUNT = TCOPYRIGHTED_FEATURE_COUNT + 15;

    /**
     * The number of operations of the '<em>TService NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_OPERATION_COUNT = TCOPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNsUsageImpl <em>TService Ns Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNsUsageImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceNsUsage()
     * @generated
     */
    int TSERVICE_NS_USAGE = 43;

    /**
     * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE__APPLIES_TO = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE__ID = 1;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE__PUBLICATION_STAGE = 2;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE__RELEASE = 3;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE__REVISION = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE__VERSION = 5;

    /**
     * The number of structural features of the '<em>TService Ns Usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>TService Ns Usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_NS_USAGE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceParameterImpl <em>TService Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceParameterImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceParameter()
     * @generated
     */
    int TSERVICE_PARAMETER = 44;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__DEFAULT_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__MAX_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__MIN_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER__TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>TService Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>TService Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_PARAMETER_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationImpl <em>TService Type Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceTypeRealization()
     * @generated
     */
    int TSERVICE_TYPE_REALIZATION = 45;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__FC = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__NAME = 1;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__PRES_COND = 2;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__PRES_COND_ARGS = 3;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__PRES_COND_ARGS_ID = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__TYPE = 5;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION__TYPE_KIND = 6;

    /**
     * The number of structural features of the '<em>TService Type Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>TService Type Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationsImpl <em>TService Type Realizations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceTypeRealizations()
     * @generated
     */
    int TSERVICE_TYPE_REALIZATIONS = 46;

    /**
     * The feature id for the '<em><b>Service Type Realization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION = 0;

    /**
     * The number of structural features of the '<em>TService Type Realizations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>TService Type Realizations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSERVICE_TYPE_REALIZATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataAttributeImpl <em>TSub Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTSubDataAttribute()
     * @generated
     */
    int TSUB_DATA_ATTRIBUTE = 47;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__DEFAULT_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__IS_ARRAY = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__MAX_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__MIN_INDEX = TDOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__MIN_VALUE = TDOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__PRES_COND = TDOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__PRES_COND_ARGS = TDOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE = TDOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE__TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>TSub Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The number of operations of the '<em>TSub Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_ATTRIBUTE_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataObjectImpl <em>TSub Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTSubDataObject()
     * @generated
     */
    int TSUB_DATA_OBJECT = 48;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__DEPRECATED = TDOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__DESC_ID = TDOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__INFORMATIVE = TDOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__IS_ARRAY = TDOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE = TDOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__MIN_INDEX = TDOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__NAME = TDOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__PRES_COND = TDOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__PRES_COND_ARGS = TDOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__PRES_COND_ARGS_ID = TDOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__SIZE_ATTRIBUTE = TDOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__UNDERLYING_TYPE = TDOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT__UNDERLYING_TYPE_KIND = TDOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>TSub Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT_FEATURE_COUNT = TDOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>TSub Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSUB_DATA_OBJECT_OPERATION_COUNT = TDOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind <em>TACSI Services Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTACSIServicesKind()
     * @generated
     */
    int TACSI_SERVICES_KIND = 50;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind <em>TCB Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCBKind()
     * @generated
     */
    int TCB_KIND = 51;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind <em>TDefined Attribute Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDefinedAttributeTypeKind()
     * @generated
     */
    int TDEFINED_ATTRIBUTE_TYPE_KIND = 52;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind <em>TLicense Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLicenseKind()
     * @generated
     */
    int TLICENSE_KIND = 53;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage <em>TPub Stage</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPubStage()
     * @generated
     */
    int TPUB_STAGE = 54;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind <em>TUndefined Attribute Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTUndefinedAttributeTypeKind()
     * @generated
     */
    int TUNDEFINED_ATTRIBUTE_TYPE_KIND = 55;

    /**
     * The meta object id for the '<em>TAbbreviation Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbbreviationName()
     * @generated
     */
    int TABBREVIATION_NAME = 56;

    /**
     * The meta object id for the '<em>TAbstract LN Class Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbstractLNClassName()
     * @generated
     */
    int TABSTRACT_LN_CLASS_NAME = 57;

    /**
     * The meta object id for the '<em>TACSI Services Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTACSIServicesKindObject()
     * @generated
     */
    int TACSI_SERVICES_KIND_OBJECT = 58;

    /**
     * The meta object id for the '<em>TAttribute Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAttributeName()
     * @generated
     */
    int TATTRIBUTE_NAME = 59;

    /**
     * The meta object id for the '<em>TAttribute Type Kind</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Enumerator
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAttributeTypeKind()
     * @generated
     */
    int TATTRIBUTE_TYPE_KIND = 60;

    /**
     * The meta object id for the '<em>TBasic Type Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTBasicTypeName()
     * @generated
     */
    int TBASIC_TYPE_NAME = 61;

    /**
     * The meta object id for the '<em>TCB Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCBKindObject()
     * @generated
     */
    int TCB_KIND_OBJECT = 62;

    /**
     * The meta object id for the '<em>TCDC Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCDCName()
     * @generated
     */
    int TCDC_NAME = 63;

    /**
     * The meta object id for the '<em>TData Object Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataObjectName()
     * @generated
     */
    int TDATA_OBJECT_NAME = 64;

    /**
     * The meta object id for the '<em>TDefined Attribute Type Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDefinedAttributeTypeKindObject()
     * @generated
     */
    int TDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = 65;

    /**
     * The meta object id for the '<em>TDoc ID</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDocID()
     * @generated
     */
    int TDOC_ID = 66;

    /**
     * The meta object id for the '<em>TEmpty String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTEmptyString()
     * @generated
     */
    int TEMPTY_STRING = 67;

    /**
     * The meta object id for the '<em>TFC Abbreviation</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTFCAbbreviation()
     * @generated
     */
    int TFC_ABBREVIATION = 68;

    /**
     * The meta object id for the '<em>TIec61850 Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTIec61850Name()
     * @generated
     */
    int TIEC61850_NAME = 69;

    /**
     * The meta object id for the '<em>TIec61850 Name String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTIec61850NameString()
     * @generated
     */
    int TIEC61850_NAME_STRING = 70;

    /**
     * The meta object id for the '<em>Tissues Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTissuesType()
     * @generated
     */
    int TISSUES_TYPE = 71;

    /**
     * The meta object id for the '<em>TLicense Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLicenseKindObject()
     * @generated
     */
    int TLICENSE_KIND_OBJECT = 72;

    /**
     * The meta object id for the '<em>TLiteral Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLiteralName()
     * @generated
     */
    int TLITERAL_NAME = 73;

    /**
     * The meta object id for the '<em>TLN Class Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLNClassName()
     * @generated
     */
    int TLN_CLASS_NAME = 74;

    /**
     * The meta object id for the '<em>TNS Identifier</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSIdentifier()
     * @generated
     */
    int TNS_IDENTIFIER = 75;

    /**
     * The meta object id for the '<em>TNS Release</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSRelease()
     * @generated
     */
    int TNS_RELEASE = 76;

    /**
     * The meta object id for the '<em>TNS Release Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Short
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSReleaseObject()
     * @generated
     */
    int TNS_RELEASE_OBJECT = 77;

    /**
     * The meta object id for the '<em>TNS Revision</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSRevision()
     * @generated
     */
    int TNS_REVISION = 78;

    /**
     * The meta object id for the '<em>TNS Version</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSVersion()
     * @generated
     */
    int TNS_VERSION = 79;

    /**
     * The meta object id for the '<em>TNS Version Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Integer
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSVersionObject()
     * @generated
     */
    int TNS_VERSION_OBJECT = 80;

    /**
     * The meta object id for the '<em>TPresence Condition Argument</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceConditionArgument()
     * @generated
     */
    int TPRESENCE_CONDITION_ARGUMENT = 81;

    /**
     * The meta object id for the '<em>TPresence Condition Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceConditionName()
     * @generated
     */
    int TPRESENCE_CONDITION_NAME = 82;

    /**
     * The meta object id for the '<em>TPub Stage Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPubStageObject()
     * @generated
     */
    int TPUB_STAGE_OBJECT = 83;

    /**
     * The meta object id for the '<em>TSub Data Object Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTSubDataObjectName()
     * @generated
     */
    int TSUB_DATA_OBJECT_NAME = 84;

    /**
     * The meta object id for the '<em>TUML Version</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTUMLVersion()
     * @generated
     */
    int TUML_VERSION = 85;

    /**
     * The meta object id for the '<em>TUndefined Attribute Type Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTUndefinedAttributeTypeKindObject()
     * @generated
     */
    int TUNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = 86;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType <em>Applies To Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applies To Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType
     * @generated
     */
    EClass getAppliesToType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getId()
     * @see #getAppliesToType()
     * @generated
     */
    EAttribute getAppliesToType_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getPublicationStage()
     * @see #getAppliesToType()
     * @generated
     */
    EAttribute getAppliesToType_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getRelease()
     * @see #getAppliesToType()
     * @generated
     */
    EAttribute getAppliesToType_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getRevision()
     * @see #getAppliesToType()
     * @generated
     */
    EAttribute getAppliesToType_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType#getVersion()
     * @see #getAppliesToType()
     * @generated
     */
    EAttribute getAppliesToType_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType <em>Depends On Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Depends On Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType
     * @generated
     */
    EClass getDependsOnType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getId()
     * @see #getDependsOnType()
     * @generated
     */
    EAttribute getDependsOnType_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getPublicationStage()
     * @see #getDependsOnType()
     * @generated
     */
    EAttribute getDependsOnType_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getRelease()
     * @see #getDependsOnType()
     * @generated
     */
    EAttribute getDependsOnType_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getRevision()
     * @see #getDependsOnType()
     * @generated
     */
    EAttribute getDependsOnType_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType#getVersion()
     * @see #getDependsOnType()
     * @generated
     */
    EAttribute getDependsOnType_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS <em>Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applicable Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getApplicableServiceNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ApplicableServiceNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getCopyright <em>Copyright</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Copyright</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getCopyright()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Copyright();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>NS Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getNSDoc()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_NSDoc();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentRoot#getServiceNS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ServiceNS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType <em>Service Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType
     * @generated
     */
    EClass getServiceType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType#getName()
     * @see #getServiceType()
     * @generated
     */
    EAttribute getServiceType_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation <em>TAbbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TAbbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation
     * @generated
     */
    EClass getTAbbreviation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation#getDescID()
     * @see #getTAbbreviation()
     * @generated
     */
    EAttribute getTAbbreviation_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviation#getName()
     * @see #getTAbbreviation()
     * @generated
     */
    EAttribute getTAbbreviation_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations <em>TAbbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TAbbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations
     * @generated
     */
    EClass getTAbbreviations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations#getAbbreviation()
     * @see #getTAbbreviations()
     * @generated
     */
    EReference getTAbbreviations_Abbreviation();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass <em>TAbstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TAbstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass
     * @generated
     */
    EClass getTAbstractLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbstractLNClass#getName()
     * @see #getTAbstractLNClass()
     * @generated
     */
    EAttribute getTAbstractLNClass_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass <em>TAny LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TAny LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass
     * @generated
     */
    EClass getTAnyLNClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass#getDataObject()
     * @see #getTAnyLNClass()
     * @generated
     */
    EReference getTAnyLNClass_DataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAnyLNClass#getBase()
     * @see #getTAnyLNClass()
     * @generated
     */
    EAttribute getTAnyLNClass_Base();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS <em>TApplicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TApplicable Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS
     * @generated
     */
    EClass getTApplicableServiceNS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS#getServiceNsUsage()
     * @see #getTApplicableServiceNS()
     * @generated
     */
    EReference getTApplicableServiceNS_ServiceNsUsage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS#getDate()
     * @see #getTApplicableServiceNS()
     * @generated
     */
    EAttribute getTApplicableServiceNS_Date();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServiceNS#getVersion()
     * @see #getTApplicableServiceNS()
     * @generated
     */
    EAttribute getTApplicableServiceNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices <em>TApplicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TApplicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices
     * @generated
     */
    EClass getTApplicableServices();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices#getService()
     * @see #getTApplicableServices()
     * @generated
     */
    EReference getTApplicableServices_Service();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Set Member Of</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices#getDataSetMemberOf()
     * @see #getTApplicableServices()
     * @generated
     */
    EReference getTApplicableServices_DataSetMemberOf();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType <em>TBasic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TBasic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType
     * @generated
     */
    EClass getTBasicType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType#getDescID()
     * @see #getTBasicType()
     * @generated
     */
    EAttribute getTBasicType_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicType#getName()
     * @see #getTBasicType()
     * @generated
     */
    EAttribute getTBasicType_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes <em>TBasic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TBasic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes
     * @generated
     */
    EClass getTBasicTypes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes#getBasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes#getBasicType()
     * @see #getTBasicTypes()
     * @generated
     */
    EReference getTBasicTypes_BasicType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC <em>TCDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC
     * @generated
     */
    EClass getTCDC();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getSubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getSubDataObject()
     * @see #getTCDC()
     * @generated
     */
    EReference getTCDC_SubDataObject();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getDataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getDataAttribute()
     * @see #getTCDC()
     * @generated
     */
    EReference getTCDC_DataAttribute();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getServiceParameter <em>Service Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Parameter</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getServiceParameter()
     * @see #getTCDC()
     * @generated
     */
    EReference getTCDC_ServiceParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isEnumParameterized <em>Enum Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enum Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isEnumParameterized()
     * @see #getTCDC()
     * @generated
     */
    EAttribute getTCDC_EnumParameterized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getName()
     * @see #getTCDC()
     * @generated
     */
    EAttribute getTCDC_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isStatistics <em>Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isStatistics()
     * @see #getTCDC()
     * @generated
     */
    EAttribute getTCDC_Statistics();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#isTypeKindParameterized()
     * @see #getTCDC()
     * @generated
     */
    EAttribute getTCDC_TypeKindParameterized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDC#getVariant()
     * @see #getTCDC()
     * @generated
     */
    EAttribute getTCDC_Variant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs <em>TCD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs
     * @generated
     */
    EClass getTCDCs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs#getCDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs#getCDC()
     * @see #getTCDCs()
     * @generated
     */
    EReference getTCDCs_CDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges <em>TChanges</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TChanges</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges
     * @generated
     */
    EClass getTChanges();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getChangesID <em>Changes ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changes ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getChangesID()
     * @see #getTChanges()
     * @generated
     */
    EAttribute getTChanges_ChangesID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getDate()
     * @see #getTChanges()
     * @generated
     */
    EAttribute getTChanges_Date();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getRelease()
     * @see #getTChanges()
     * @generated
     */
    EAttribute getTChanges_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getRevision()
     * @see #getTChanges()
     * @generated
     */
    EAttribute getTChanges_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getTissues <em>Tissues</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tissues</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getTissues()
     * @see #getTChanges()
     * @generated
     */
    EAttribute getTChanges_Tissues();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges#getVersion()
     * @see #getTChanges()
     * @generated
     */
    EAttribute getTChanges_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute <em>TConstructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TConstructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute
     * @generated
     */
    EClass getTConstructedAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute#getSubDataAttribute()
     * @see #getTConstructedAttribute()
     * @generated
     */
    EReference getTConstructedAttribute_SubDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttribute#getName()
     * @see #getTConstructedAttribute()
     * @generated
     */
    EAttribute getTConstructedAttribute_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes <em>TConstructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TConstructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes
     * @generated
     */
    EClass getTConstructedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes#getConstructedAttribute()
     * @see #getTConstructedAttributes()
     * @generated
     */
    EReference getTConstructedAttributes_ConstructedAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted <em>TCopyrighted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCopyrighted</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted
     * @generated
     */
    EClass getTCopyrighted();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted#getCopyright <em>Copyright</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Copyright</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrighted#getCopyright()
     * @see #getTCopyrighted()
     * @generated
     */
    EReference getTCopyrighted_Copyright();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice <em>TCopyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCopyright Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice
     * @generated
     */
    EClass getTCopyrightNotice();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getNotice <em>Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getNotice()
     * @see #getTCopyrightNotice()
     * @generated
     */
    EReference getTCopyrightNotice_Notice();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getLicense <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>License</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice#getLicense()
     * @see #getTCopyrightNotice()
     * @generated
     */
    EReference getTCopyrightNotice_License();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute <em>TData Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TData Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute
     * @generated
     */
    EClass getTDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isDchg <em>Dchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isDchg()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_Dchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getDefaultValue()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isDupd <em>Dupd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dupd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isDupd()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_Dupd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getFc()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isIsArray()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMaxIndexAttribute()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMaxValue()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMinIndex()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getMinValue()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_MinValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getName()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getPresCond()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getPresCondArgs()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getPresCondArgsID()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isQchg <em>Qchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#isQchg()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_Qchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getSizeAttribute()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_SizeAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getType()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataAttribute#getTypeKind()
     * @see #getTDataAttribute()
     * @generated
     */
    EAttribute getTDataAttribute_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject <em>TData Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TData Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject
     * @generated
     */
    EClass getTDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getDsPresCond <em>Ds Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getDsPresCond()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_DsPresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getDsPresCondArgs()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_DsPresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getDsPresCondArgsID()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_DsPresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getName()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getPresCond()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getPresCondArgs()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getPresCondArgsID()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#isTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#isTransient()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_Transient();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getType()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getUnderlyingType()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject#getUnderlyingTypeKind()
     * @see #getTDataObject()
     * @generated
     */
    EAttribute getTDataObject_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf <em>TData Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TData Set Member Of</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf
     * @generated
     */
    EClass getTDataSetMemberOf();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf#getCb <em>Cb</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cb</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf#getCb()
     * @see #getTDataSetMemberOf()
     * @generated
     */
    EAttribute getTDataSetMemberOf_Cb();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc <em>TDoc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TDoc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc
     * @generated
     */
    EClass getTDoc();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getMixed()
     * @see #getTDoc()
     * @generated
     */
    EAttribute getTDoc_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getGroup()
     * @see #getTDoc()
     * @generated
     */
    EAttribute getTDoc_Group();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getAny()
     * @see #getTDoc()
     * @generated
     */
    EAttribute getTDoc_Any();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc#getId()
     * @see #getTDoc()
     * @generated
     */
    EAttribute getTDoc_Id();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass <em>TDocumented Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TDocumented Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass
     * @generated
     */
    EClass getTDocumentedClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass#isDeprecated <em>Deprecated</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deprecated</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass#isDeprecated()
     * @see #getTDocumentedClass()
     * @generated
     */
    EAttribute getTDocumentedClass_Deprecated();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass#getDescID()
     * @see #getTDocumentedClass()
     * @generated
     */
    EAttribute getTDocumentedClass_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass#isInformative <em>Informative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Informative</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDocumentedClass#isInformative()
     * @see #getTDocumentedClass()
     * @generated
     */
    EAttribute getTDocumentedClass_Informative();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration <em>TEnumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TEnumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration
     * @generated
     */
    EClass getTEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration#getLiteral <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration#getLiteral()
     * @see #getTEnumeration()
     * @generated
     */
    EReference getTEnumeration_Literal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration#getInheritedFrom <em>Inherited From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inherited From</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration#getInheritedFrom()
     * @see #getTEnumeration()
     * @generated
     */
    EAttribute getTEnumeration_InheritedFrom();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumeration#getName()
     * @see #getTEnumeration()
     * @generated
     */
    EAttribute getTEnumeration_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations <em>TEnumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TEnumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations
     * @generated
     */
    EClass getTEnumerations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations#getEnumeration()
     * @see #getTEnumerations()
     * @generated
     */
    EReference getTEnumerations_Enumeration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint <em>TFunctional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TFunctional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint
     * @generated
     */
    EClass getTFunctionalConstraint();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getApplicableServices()
     * @see #getTFunctionalConstraint()
     * @generated
     */
    EReference getTFunctionalConstraint_ApplicableServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getAbbreviation()
     * @see #getTFunctionalConstraint()
     * @generated
     */
    EAttribute getTFunctionalConstraint_Abbreviation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getDescID()
     * @see #getTFunctionalConstraint()
     * @generated
     */
    EAttribute getTFunctionalConstraint_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint#getTitleID()
     * @see #getTFunctionalConstraint()
     * @generated
     */
    EAttribute getTFunctionalConstraint_TitleID();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints <em>TFunctional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TFunctional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints
     * @generated
     */
    EClass getTFunctionalConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints#getFunctionalConstraint()
     * @see #getTFunctionalConstraints()
     * @generated
     */
    EReference getTFunctionalConstraints_FunctionalConstraint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense <em>TLicense</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TLicense</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense
     * @generated
     */
    EClass getTLicense();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense#getMixed()
     * @see #getTLicense()
     * @generated
     */
    EAttribute getTLicense_Mixed();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense#getKind()
     * @see #getTLicense()
     * @generated
     */
    EAttribute getTLicense_Kind();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense#getUri <em>Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense#getUri()
     * @see #getTLicense()
     * @generated
     */
    EAttribute getTLicense_Uri();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral <em>TLiteral</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TLiteral</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral
     * @generated
     */
    EClass getTLiteral();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getLiteralVal <em>Literal Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Literal Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getLiteralVal()
     * @see #getTLiteral()
     * @generated
     */
    EAttribute getTLiteral_LiteralVal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLiteral#getName()
     * @see #getTLiteral()
     * @generated
     */
    EAttribute getTLiteral_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass <em>TLN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TLN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass
     * @generated
     */
    EClass getTLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass#isCanHaveLOG <em>Can Have LOG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Can Have LOG</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass#isCanHaveLOG()
     * @see #getTLNClass()
     * @generated
     */
    EAttribute getTLNClass_CanHaveLOG();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass#isIsExtension <em>Is Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Extension</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass#isIsExtension()
     * @see #getTLNClass()
     * @generated
     */
    EAttribute getTLNClass_IsExtension();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClass#getName()
     * @see #getTLNClass()
     * @generated
     */
    EAttribute getTLNClass_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses <em>TLN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TLN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses
     * @generated
     */
    EClass getTLNClasses();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses#getAbstractLNClass <em>Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Abstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses#getAbstractLNClass()
     * @see #getTLNClasses()
     * @generated
     */
    EReference getTLNClasses_AbstractLNClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses#getLNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses#getLNClass()
     * @see #getTLNClasses()
     * @generated
     */
    EReference getTLNClasses_LNClass();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice <em>TNotice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TNotice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice
     * @generated
     */
    EClass getTNotice();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice#getMixed()
     * @see #getTNotice()
     * @generated
     */
    EAttribute getTNotice_Mixed();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS <em>TNS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TNS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS
     * @generated
     */
    EClass getTNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getChanges()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_Changes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDependsOn <em>Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Depends On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDependsOn()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_DependsOn();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getBasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Basic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getBasicTypes()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_BasicTypes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getFunctionalConstraints()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_FunctionalConstraints();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPresenceConditions()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_PresenceConditions();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getAbbreviations()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_Abbreviations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Enumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getEnumerations()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_Enumerations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getConstructedAttributes()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_ConstructedAttributes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getCDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getCDCs()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_CDCs();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getLNClasses()
     * @see #getTNS()
     * @generated
     */
    EReference getTNS_LNClasses();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getDescID()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getId()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getPublicationStage()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRelease()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getRevision()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlDate()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getUmlVersion()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_UmlVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS#getVersion()
     * @see #getTNS()
     * @generated
     */
    EAttribute getTNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc <em>TNS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TNS Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc
     * @generated
     */
    EClass getTNSDoc();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getDoc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getDoc()
     * @see #getTNSDoc()
     * @generated
     */
    EReference getTNSDoc_Doc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getId()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getLang()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_Lang();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getPublicationStage()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getRelease()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getRevision()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getUmlDate()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getUmlVersion()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_UmlVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNSDoc#getVersion()
     * @see #getTNSDoc()
     * @generated
     */
    EAttribute getTNSDoc_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition <em>TPresence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPresence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition
     * @generated
     */
    EClass getTPresenceCondition();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getArgument <em>Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Argument</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getArgument()
     * @see #getTPresenceCondition()
     * @generated
     */
    EAttribute getTPresenceCondition_Argument();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getDescID()
     * @see #getTPresenceCondition()
     * @generated
     */
    EAttribute getTPresenceCondition_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getName()
     * @see #getTPresenceCondition()
     * @generated
     */
    EAttribute getTPresenceCondition_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceCondition#getTitleID()
     * @see #getTPresenceCondition()
     * @generated
     */
    EAttribute getTPresenceCondition_TitleID();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions <em>TPresence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPresence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions
     * @generated
     */
    EClass getTPresenceConditions();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions#getPresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions#getPresenceCondition()
     * @see #getTPresenceConditions()
     * @generated
     */
    EReference getTPresenceConditions_PresenceCondition();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC <em>TService CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC
     * @generated
     */
    EClass getTServiceCDC();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getServiceDataAttribute()
     * @see #getTServiceCDC()
     * @generated
     */
    EReference getTServiceCDC_ServiceDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getCdc <em>Cdc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getCdc()
     * @see #getTServiceCDC()
     * @generated
     */
    EAttribute getTServiceCDC_Cdc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC#getVariant()
     * @see #getTServiceCDC()
     * @generated
     */
    EAttribute getTServiceCDC_Variant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs <em>TService CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs
     * @generated
     */
    EClass getTServiceCDCs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs#getServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDCs#getServiceCDC()
     * @see #getTServiceCDCs()
     * @generated
     */
    EReference getTServiceCDCs_ServiceCDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute <em>TService Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute
     * @generated
     */
    EClass getTServiceConstructedAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttribute#isTypeKindParameterized()
     * @see #getTServiceConstructedAttribute()
     * @generated
     */
    EAttribute getTServiceConstructedAttribute_TypeKindParameterized();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes <em>TService Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes
     * @generated
     */
    EClass getTServiceConstructedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes#getServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceConstructedAttributes#getServiceConstructedAttribute()
     * @see #getTServiceConstructedAttributes()
     * @generated
     */
    EReference getTServiceConstructedAttributes_ServiceConstructedAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute <em>TService Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute
     * @generated
     */
    EClass getTServiceDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getFc()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getName()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getPresCond()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getPresCondArgs()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getPresCondArgsID()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getType()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getTypeKind()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_TypeKind();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getUnderlyingType()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute#getUnderlyingTypeKind()
     * @see #getTServiceDataAttribute()
     * @generated
     */
    EAttribute getTServiceDataAttribute_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS <em>TService NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS
     * @generated
     */
    EClass getTServiceNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getChanges()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_Changes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getFunctionalConstraints()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_FunctionalConstraints();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPresenceConditions()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_PresenceConditions();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getAbbreviations()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_Abbreviations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceTypeRealizations()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_ServiceTypeRealizations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceConstructedAttributes()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_ServiceConstructedAttributes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getServiceCDCs()
     * @see #getTServiceNS()
     * @generated
     */
    EReference getTServiceNS_ServiceCDCs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getDescID()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getId()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getPublicationStage()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRelease()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getRevision()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlDate()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getUmlVersion()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_UmlVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNS#getVersion()
     * @see #getTServiceNS()
     * @generated
     */
    EAttribute getTServiceNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage <em>TService Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage
     * @generated
     */
    EClass getTServiceNsUsage();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applies To</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getAppliesTo()
     * @see #getTServiceNsUsage()
     * @generated
     */
    EReference getTServiceNsUsage_AppliesTo();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getId()
     * @see #getTServiceNsUsage()
     * @generated
     */
    EAttribute getTServiceNsUsage_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getPublicationStage()
     * @see #getTServiceNsUsage()
     * @generated
     */
    EAttribute getTServiceNsUsage_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getRelease()
     * @see #getTServiceNsUsage()
     * @generated
     */
    EAttribute getTServiceNsUsage_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getRevision()
     * @see #getTServiceNsUsage()
     * @generated
     */
    EAttribute getTServiceNsUsage_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceNsUsage#getVersion()
     * @see #getTServiceNsUsage()
     * @generated
     */
    EAttribute getTServiceNsUsage_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter <em>TService Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Parameter</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter
     * @generated
     */
    EClass getTServiceParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getDefaultValue()
     * @see #getTServiceParameter()
     * @generated
     */
    EAttribute getTServiceParameter_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getMaxValue()
     * @see #getTServiceParameter()
     * @generated
     */
    EAttribute getTServiceParameter_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getMinValue()
     * @see #getTServiceParameter()
     * @generated
     */
    EAttribute getTServiceParameter_MinValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getName()
     * @see #getTServiceParameter()
     * @generated
     */
    EAttribute getTServiceParameter_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getType()
     * @see #getTServiceParameter()
     * @generated
     */
    EAttribute getTServiceParameter_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceParameter#getTypeKind()
     * @see #getTServiceParameter()
     * @generated
     */
    EAttribute getTServiceParameter_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization <em>TService Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Type Realization</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization
     * @generated
     */
    EClass getTServiceTypeRealization();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getFc()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getName()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getPresCond()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getPresCondArgs()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getPresCondArgsID()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getType()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealization#getTypeKind()
     * @see #getTServiceTypeRealization()
     * @generated
     */
    EAttribute getTServiceTypeRealization_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations <em>TService Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TService Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations
     * @generated
     */
    EClass getTServiceTypeRealizations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Type Realization</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceTypeRealizations#getServiceTypeRealization()
     * @see #getTServiceTypeRealizations()
     * @generated
     */
    EReference getTServiceTypeRealizations_ServiceTypeRealization();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute <em>TSub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TSub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute
     * @generated
     */
    EClass getTSubDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getDefaultValue()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#isIsArray()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMaxIndexAttribute()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMaxValue()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMinIndex()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getMinValue()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_MinValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getName()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getPresCond()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getPresCondArgs()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getPresCondArgsID()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getSizeAttribute()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_SizeAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getType()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataAttribute#getTypeKind()
     * @see #getTSubDataAttribute()
     * @generated
     */
    EAttribute getTSubDataAttribute_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject <em>TSub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TSub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject
     * @generated
     */
    EClass getTSubDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#isIsArray()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getMaxIndexAttribute()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getMinIndex()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getName()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getPresCond()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getPresCondArgs()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getPresCondArgsID()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getSizeAttribute()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_SizeAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getType()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getUnderlyingType()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TSubDataObject#getUnderlyingTypeKind()
     * @see #getTSubDataObject()
     * @generated
     */
    EAttribute getTSubDataObject_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass <em>TTitled Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TTitled Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass
     * @generated
     */
    EClass getTTitledClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TTitledClass#getTitleID()
     * @see #getTTitledClass()
     * @generated
     */
    EAttribute getTTitledClass_TitleID();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind <em>TACSI Services Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TACSI Services Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind
     * @generated
     */
    EEnum getTACSIServicesKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind <em>TCB Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TCB Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
     * @generated
     */
    EEnum getTCBKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind <em>TDefined Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TDefined Attribute Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind
     * @generated
     */
    EEnum getTDefinedAttributeTypeKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind <em>TLicense Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TLicense Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind
     * @generated
     */
    EEnum getTLicenseKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage <em>TPub Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TPub Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
     * @generated
     */
    EEnum getTPubStage();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind <em>TUndefined Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TUndefined Attribute Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind
     * @generated
     */
    EEnum getTUndefinedAttributeTypeKind();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TAbbreviation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of an abbreviation.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TAbbreviation Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tAbbreviationName' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString'"
     * @generated
     */
    EDataType getTAbbreviationName();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TAbstract LN Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of an abstract logical node.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TAbstract LN Class Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tAbstractLNClassName' baseType='tIec61850Name'"
     * @generated
     */
    EDataType getTAbstractLNClassName();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind <em>TACSI Services Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TACSI Services Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind"
     *        extendedMetaData="name='tACSIServicesKind:Object' baseType='tACSIServicesKind'"
     * @generated
     */
    EDataType getTACSIServicesKindObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TAttribute Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of a Data Attribute.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TAttribute Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tAttributeName' baseType='tIec61850Name'"
     * @generated
     */
    EDataType getTAttributeName();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>TAttribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type kind of a data attribute, which may be "undefined".
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TAttribute Type Kind</em>'.
     * @see org.eclipse.emf.common.util.Enumerator
     * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
     *        extendedMetaData="name='tAttributeTypeKind' memberTypes='tDefinedAttributeTypeKind tUndefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getTAttributeTypeKind();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TBasic Type Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type describing the name of a basic type of a data attribute.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TBasic Type Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tBasicTypeName' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1'"
     * @generated
     */
    EDataType getTBasicTypeName();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind <em>TCB Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TCB Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind"
     *        extendedMetaData="name='tCBKind:Object' baseType='tCBKind'"
     * @generated
     */
    EDataType getTCBKindObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TCDC Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of a Common Data Class (CDC).
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TCDC Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tCDCName' baseType='tIec61850Name' minLength='1'"
     * @generated
     */
    EDataType getTCDCName();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TData Object Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of a Data Object.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TData Object Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tDataObjectName' baseType='tIec61850Name' maxLength='12'"
     * @generated
     */
    EDataType getTDataObjectName();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind <em>TDefined Attribute Type Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TDefined Attribute Type Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind"
     *        extendedMetaData="name='tDefinedAttributeTypeKind:Object' baseType='tDefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getTDefinedAttributeTypeKindObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TDoc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier referring to a documentation string, available in a sibling file.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TDoc ID</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tDocID' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' minLength='1'"
     * @generated
     */
    EDataType getTDocID();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TEmpty String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The empty string.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TEmpty String</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tEmptyString' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' maxLength='0'"
     * @generated
     */
    EDataType getTEmptyString();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TFC Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Functional Constraint abbreviation.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TFC Abbreviation</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tFCAbbreviation' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1' pattern='[\\p{IsBasicLatin}]+'"
     * @generated
     */
    EDataType getTFCAbbreviation();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TIec61850 Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TIec61850 Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tIec61850Name' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' minLength='1' pattern='[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+'"
     * @generated
     */
    EDataType getTIec61850Name();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TIec61850 Name String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TIec61850 Name String</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tIec61850NameString' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' pattern='[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]+'"
     * @generated
     */
    EDataType getTIec61850NameString();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Tissues Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Tissues Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tissues_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' minLength='1'"
     * @generated
     */
    EDataType getTissuesType();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind <em>TLicense Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TLicense Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind"
     *        extendedMetaData="name='tLicenseKind:Object' baseType='tLicenseKind'"
     * @generated
     */
    EDataType getTLicenseKindObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TLiteral Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of an enumeration literal. Maybe the empty string.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TLiteral Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tLiteralName' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' maxLength='127' pattern='[\\p{IsBasicLatin}\\p{IsLatin-1Supplement}]*'"
     * @generated
     */
    EDataType getTLiteralName();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TLN Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of a (non-abstract) logical node class.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TLN Class Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tLNClassName' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='LLN0 [A-Z]{4}'"
     * @generated
     */
    EDataType getTLNClassName();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TNS Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifier of a namespace.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TNS Identifier</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tNSIdentifier' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' pattern='\\p{IsBasicLatin}+'"
     * @generated
     */
    EDataType getTNSIdentifier();

    /**
     * Returns the meta object for data type '<em>TNS Release</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Release of a namespace (number between 1 and 255), distinguishing between releases of a same namespace version and revision.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TNS Release</em>'.
     * @model instanceClass="short"
     *        extendedMetaData="name='tNSRelease' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedByte' minExclusive='0'"
     * @generated
     */
    EDataType getTNSRelease();

    /**
     * Returns the meta object for data type '{@link java.lang.Short <em>TNS Release Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TNS Release Object</em>'.
     * @see java.lang.Short
     * @model instanceClass="java.lang.Short"
     *        extendedMetaData="name='tNSRelease:Object' baseType='tNSRelease'"
     * @generated
     */
    EDataType getTNSReleaseObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TNS Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Revision of a namespace (a basic latin upper-case letter), distinguishing between revisions of a same namespace version.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TNS Revision</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tNSRevision' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[A-Z]'"
     * @generated
     */
    EDataType getTNSRevision();

    /**
     * Returns the meta object for data type '<em>TNS Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Version of a namespace (a year between 2002 and 2099).
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TNS Version</em>'.
     * @model instanceClass="int"
     *        extendedMetaData="name='tNSVersion' baseType='http://www.eclipse.org/emf/2003/XMLType#unsignedShort' minInclusive='2002' maxInclusive='2099'"
     * @generated
     */
    EDataType getTNSVersion();

    /**
     * Returns the meta object for data type '{@link java.lang.Integer <em>TNS Version Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TNS Version Object</em>'.
     * @see java.lang.Integer
     * @model instanceClass="java.lang.Integer"
     *        extendedMetaData="name='tNSVersion:Object' baseType='tNSVersion'"
     * @generated
     */
    EDataType getTNSVersionObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TPresence Condition Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Argument to (some) presence conditions.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TPresence Condition Argument</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tPresenceConditionArgument' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString'"
     * @generated
     */
    EDataType getTPresenceConditionArgument();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TPresence Condition Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of a presence condition of a child.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TPresence Condition Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tPresenceConditionName' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString'"
     * @generated
     */
    EDataType getTPresenceConditionName();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage <em>TPub Stage Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TPub Stage Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage"
     *        extendedMetaData="name='tPubStage:Object' baseType='tPubStage'"
     * @generated
     */
    EDataType getTPubStageObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TSub Data Object Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of a Sub-Data Object.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TSub Data Object Name</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tSubDataObjectName' baseType='tIec61850Name'"
     * @generated
     */
    EDataType getTSubDataObjectName();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>TUML Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Version of the UML model used to generate this NSD.
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>TUML Version</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='tUMLVersion' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' minLength='1'"
     * @generated
     */
    EDataType getTUMLVersion();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind <em>TUndefined Attribute Type Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TUndefined Attribute Type Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind"
     *        extendedMetaData="name='tUndefinedAttributeTypeKind:Object' baseType='tUndefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getTUndefinedAttributeTypeKindObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NsdFactory getNsdFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl <em>Applies To Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AppliesToTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAppliesToType()
         * @generated
         */
        EClass APPLIES_TO_TYPE = eINSTANCE.getAppliesToType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLIES_TO_TYPE__ID = eINSTANCE.getAppliesToType_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLIES_TO_TYPE__PUBLICATION_STAGE = eINSTANCE.getAppliesToType_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLIES_TO_TYPE__RELEASE = eINSTANCE.getAppliesToType_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLIES_TO_TYPE__REVISION = eINSTANCE.getAppliesToType_Revision();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLIES_TO_TYPE__VERSION = eINSTANCE.getAppliesToType_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl <em>Depends On Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDependsOnType()
         * @generated
         */
        EClass DEPENDS_ON_TYPE = eINSTANCE.getDependsOnType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDS_ON_TYPE__ID = eINSTANCE.getDependsOnType_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDS_ON_TYPE__PUBLICATION_STAGE = eINSTANCE.getDependsOnType_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDS_ON_TYPE__RELEASE = eINSTANCE.getDependsOnType_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDS_ON_TYPE__REVISION = eINSTANCE.getDependsOnType_Revision();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPENDS_ON_TYPE__VERSION = eINSTANCE.getDependsOnType_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentRootImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Applicable Service NS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__APPLICABLE_SERVICE_NS = eINSTANCE.getDocumentRoot_ApplicableServiceNS();

        /**
         * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__COPYRIGHT = eINSTANCE.getDocumentRoot_Copyright();

        /**
         * The meta object literal for the '<em><b>NS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NS = eINSTANCE.getDocumentRoot_NS();

        /**
         * The meta object literal for the '<em><b>NS Doc</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NS_DOC = eINSTANCE.getDocumentRoot_NSDoc();

        /**
         * The meta object literal for the '<em><b>Service NS</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SERVICE_NS = eINSTANCE.getDocumentRoot_ServiceNS();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl <em>Service Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceType()
         * @generated
         */
        EClass SERVICE_TYPE = eINSTANCE.getServiceType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE__NAME = eINSTANCE.getServiceType_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationImpl <em>TAbbreviation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbbreviation()
         * @generated
         */
        EClass TABBREVIATION = eINSTANCE.getTAbbreviation();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TABBREVIATION__DESC_ID = eINSTANCE.getTAbbreviation_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TABBREVIATION__NAME = eINSTANCE.getTAbbreviation_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationsImpl <em>TAbbreviations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbbreviationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbbreviations()
         * @generated
         */
        EClass TABBREVIATIONS = eINSTANCE.getTAbbreviations();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABBREVIATIONS__ABBREVIATION = eINSTANCE.getTAbbreviations_Abbreviation();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbstractLNClassImpl <em>TAbstract LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAbstractLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbstractLNClass()
         * @generated
         */
        EClass TABSTRACT_LN_CLASS = eINSTANCE.getTAbstractLNClass();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TABSTRACT_LN_CLASS__NAME = eINSTANCE.getTAbstractLNClass_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAnyLNClassImpl <em>TAny LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TAnyLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAnyLNClass()
         * @generated
         */
        EClass TANY_LN_CLASS = eINSTANCE.getTAnyLNClass();

        /**
         * The meta object literal for the '<em><b>Data Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TANY_LN_CLASS__DATA_OBJECT = eINSTANCE.getTAnyLNClass_DataObject();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TANY_LN_CLASS__BASE = eINSTANCE.getTAnyLNClass_Base();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServiceNSImpl <em>TApplicable Service NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServiceNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTApplicableServiceNS()
         * @generated
         */
        EClass TAPPLICABLE_SERVICE_NS = eINSTANCE.getTApplicableServiceNS();

        /**
         * The meta object literal for the '<em><b>Service Ns Usage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TAPPLICABLE_SERVICE_NS__SERVICE_NS_USAGE = eINSTANCE.getTApplicableServiceNS_ServiceNsUsage();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TAPPLICABLE_SERVICE_NS__DATE = eINSTANCE.getTApplicableServiceNS_Date();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TAPPLICABLE_SERVICE_NS__VERSION = eINSTANCE.getTApplicableServiceNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServicesImpl <em>TApplicable Services</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServicesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTApplicableServices()
         * @generated
         */
        EClass TAPPLICABLE_SERVICES = eINSTANCE.getTApplicableServices();

        /**
         * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TAPPLICABLE_SERVICES__SERVICE = eINSTANCE.getTApplicableServices_Service();

        /**
         * The meta object literal for the '<em><b>Data Set Member Of</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF = eINSTANCE.getTApplicableServices_DataSetMemberOf();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypeImpl <em>TBasic Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTBasicType()
         * @generated
         */
        EClass TBASIC_TYPE = eINSTANCE.getTBasicType();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TBASIC_TYPE__DESC_ID = eINSTANCE.getTBasicType_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TBASIC_TYPE__NAME = eINSTANCE.getTBasicType_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypesImpl <em>TBasic Types</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TBasicTypesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTBasicTypes()
         * @generated
         */
        EClass TBASIC_TYPES = eINSTANCE.getTBasicTypes();

        /**
         * The meta object literal for the '<em><b>Basic Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TBASIC_TYPES__BASIC_TYPE = eINSTANCE.getTBasicTypes_BasicType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCImpl <em>TCDC</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCDC()
         * @generated
         */
        EClass TCDC = eINSTANCE.getTCDC();

        /**
         * The meta object literal for the '<em><b>Sub Data Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCDC__SUB_DATA_OBJECT = eINSTANCE.getTCDC_SubDataObject();

        /**
         * The meta object literal for the '<em><b>Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCDC__DATA_ATTRIBUTE = eINSTANCE.getTCDC_DataAttribute();

        /**
         * The meta object literal for the '<em><b>Service Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCDC__SERVICE_PARAMETER = eINSTANCE.getTCDC_ServiceParameter();

        /**
         * The meta object literal for the '<em><b>Enum Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCDC__ENUM_PARAMETERIZED = eINSTANCE.getTCDC_EnumParameterized();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCDC__NAME = eINSTANCE.getTCDC_Name();

        /**
         * The meta object literal for the '<em><b>Statistics</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCDC__STATISTICS = eINSTANCE.getTCDC_Statistics();

        /**
         * The meta object literal for the '<em><b>Type Kind Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCDC__TYPE_KIND_PARAMETERIZED = eINSTANCE.getTCDC_TypeKindParameterized();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCDC__VARIANT = eINSTANCE.getTCDC_Variant();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCsImpl <em>TCD Cs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCDCsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCDCs()
         * @generated
         */
        EClass TCD_CS = eINSTANCE.getTCDCs();

        /**
         * The meta object literal for the '<em><b>CDC</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCD_CS__CDC = eINSTANCE.getTCDCs_CDC();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TChangesImpl <em>TChanges</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TChangesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTChanges()
         * @generated
         */
        EClass TCHANGES = eINSTANCE.getTChanges();

        /**
         * The meta object literal for the '<em><b>Changes ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCHANGES__CHANGES_ID = eINSTANCE.getTChanges_ChangesID();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCHANGES__DATE = eINSTANCE.getTChanges_Date();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCHANGES__RELEASE = eINSTANCE.getTChanges_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCHANGES__REVISION = eINSTANCE.getTChanges_Revision();

        /**
         * The meta object literal for the '<em><b>Tissues</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCHANGES__TISSUES = eINSTANCE.getTChanges_Tissues();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCHANGES__VERSION = eINSTANCE.getTChanges_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributeImpl <em>TConstructed Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTConstructedAttribute()
         * @generated
         */
        EClass TCONSTRUCTED_ATTRIBUTE = eINSTANCE.getTConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Sub Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = eINSTANCE.getTConstructedAttribute_SubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCONSTRUCTED_ATTRIBUTE__NAME = eINSTANCE.getTConstructedAttribute_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributesImpl <em>TConstructed Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TConstructedAttributesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTConstructedAttributes()
         * @generated
         */
        EClass TCONSTRUCTED_ATTRIBUTES = eINSTANCE.getTConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Constructed Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getTConstructedAttributes_ConstructedAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightedImpl <em>TCopyrighted</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightedImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCopyrighted()
         * @generated
         */
        EClass TCOPYRIGHTED = eINSTANCE.getTCopyrighted();

        /**
         * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCOPYRIGHTED__COPYRIGHT = eINSTANCE.getTCopyrighted_Copyright();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightNoticeImpl <em>TCopyright Notice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightNoticeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCopyrightNotice()
         * @generated
         */
        EClass TCOPYRIGHT_NOTICE = eINSTANCE.getTCopyrightNotice();

        /**
         * The meta object literal for the '<em><b>Notice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCOPYRIGHT_NOTICE__NOTICE = eINSTANCE.getTCopyrightNotice_Notice();

        /**
         * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCOPYRIGHT_NOTICE__LICENSE = eINSTANCE.getTCopyrightNotice_License();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataAttributeImpl <em>TData Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataAttribute()
         * @generated
         */
        EClass TDATA_ATTRIBUTE = eINSTANCE.getTDataAttribute();

        /**
         * The meta object literal for the '<em><b>Dchg</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__DCHG = eINSTANCE.getTDataAttribute_Dchg();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getTDataAttribute_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Dupd</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__DUPD = eINSTANCE.getTDataAttribute_Dupd();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__FC = eINSTANCE.getTDataAttribute_Fc();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__IS_ARRAY = eINSTANCE.getTDataAttribute_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = eINSTANCE.getTDataAttribute_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__MAX_VALUE = eINSTANCE.getTDataAttribute_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__MIN_INDEX = eINSTANCE.getTDataAttribute_MinIndex();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__MIN_VALUE = eINSTANCE.getTDataAttribute_MinValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__NAME = eINSTANCE.getTDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__PRES_COND = eINSTANCE.getTDataAttribute_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__PRES_COND_ARGS = eINSTANCE.getTDataAttribute_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__PRES_COND_ARGS_ID = eINSTANCE.getTDataAttribute_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Qchg</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__QCHG = eINSTANCE.getTDataAttribute_Qchg();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__SIZE_ATTRIBUTE = eINSTANCE.getTDataAttribute_SizeAttribute();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__TYPE = eINSTANCE.getTDataAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_ATTRIBUTE__TYPE_KIND = eINSTANCE.getTDataAttribute_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl <em>TData Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataObject()
         * @generated
         */
        EClass TDATA_OBJECT = eINSTANCE.getTDataObject();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__DS_PRES_COND = eINSTANCE.getTDataObject_DsPresCond();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__DS_PRES_COND_ARGS = eINSTANCE.getTDataObject_DsPresCondArgs();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__DS_PRES_COND_ARGS_ID = eINSTANCE.getTDataObject_DsPresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__NAME = eINSTANCE.getTDataObject_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__PRES_COND = eINSTANCE.getTDataObject_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__PRES_COND_ARGS = eINSTANCE.getTDataObject_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__PRES_COND_ARGS_ID = eINSTANCE.getTDataObject_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__TRANSIENT = eINSTANCE.getTDataObject_Transient();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__TYPE = eINSTANCE.getTDataObject_Type();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__UNDERLYING_TYPE = eINSTANCE.getTDataObject_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_OBJECT__UNDERLYING_TYPE_KIND = eINSTANCE.getTDataObject_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataSetMemberOfImpl <em>TData Set Member Of</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataSetMemberOfImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataSetMemberOf()
         * @generated
         */
        EClass TDATA_SET_MEMBER_OF = eINSTANCE.getTDataSetMemberOf();

        /**
         * The meta object literal for the '<em><b>Cb</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDATA_SET_MEMBER_OF__CB = eINSTANCE.getTDataSetMemberOf_Cb();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl <em>TDoc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDoc()
         * @generated
         */
        EClass TDOC = eINSTANCE.getTDoc();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOC__MIXED = eINSTANCE.getTDoc_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOC__GROUP = eINSTANCE.getTDoc_Group();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOC__ANY = eINSTANCE.getTDoc_Any();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOC__ID = eINSTANCE.getTDoc_Id();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocumentedClassImpl <em>TDocumented Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocumentedClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDocumentedClass()
         * @generated
         */
        EClass TDOCUMENTED_CLASS = eINSTANCE.getTDocumentedClass();

        /**
         * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOCUMENTED_CLASS__DEPRECATED = eINSTANCE.getTDocumentedClass_Deprecated();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOCUMENTED_CLASS__DESC_ID = eINSTANCE.getTDocumentedClass_DescID();

        /**
         * The meta object literal for the '<em><b>Informative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDOCUMENTED_CLASS__INFORMATIVE = eINSTANCE.getTDocumentedClass_Informative();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationImpl <em>TEnumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTEnumeration()
         * @generated
         */
        EClass TENUMERATION = eINSTANCE.getTEnumeration();

        /**
         * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TENUMERATION__LITERAL = eINSTANCE.getTEnumeration_Literal();

        /**
         * The meta object literal for the '<em><b>Inherited From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TENUMERATION__INHERITED_FROM = eINSTANCE.getTEnumeration_InheritedFrom();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TENUMERATION__NAME = eINSTANCE.getTEnumeration_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationsImpl <em>TEnumerations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TEnumerationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTEnumerations()
         * @generated
         */
        EClass TENUMERATIONS = eINSTANCE.getTEnumerations();

        /**
         * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TENUMERATIONS__ENUMERATION = eINSTANCE.getTEnumerations_Enumeration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl <em>TFunctional Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTFunctionalConstraint()
         * @generated
         */
        EClass TFUNCTIONAL_CONSTRAINT = eINSTANCE.getTFunctionalConstraint();

        /**
         * The meta object literal for the '<em><b>Applicable Services</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES = eINSTANCE
                .getTFunctionalConstraint_ApplicableServices();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TFUNCTIONAL_CONSTRAINT__ABBREVIATION = eINSTANCE.getTFunctionalConstraint_Abbreviation();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TFUNCTIONAL_CONSTRAINT__DESC_ID = eINSTANCE.getTFunctionalConstraint_DescID();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TFUNCTIONAL_CONSTRAINT__TITLE_ID = eINSTANCE.getTFunctionalConstraint_TitleID();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintsImpl <em>TFunctional Constraints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTFunctionalConstraints()
         * @generated
         */
        EClass TFUNCTIONAL_CONSTRAINTS = eINSTANCE.getTFunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Functional Constraint</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT = eINSTANCE
                .getTFunctionalConstraints_FunctionalConstraint();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLicenseImpl <em>TLicense</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLicenseImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLicense()
         * @generated
         */
        EClass TLICENSE = eINSTANCE.getTLicense();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLICENSE__MIXED = eINSTANCE.getTLicense_Mixed();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLICENSE__KIND = eINSTANCE.getTLicense_Kind();

        /**
         * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLICENSE__URI = eINSTANCE.getTLicense_Uri();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLiteralImpl <em>TLiteral</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLiteralImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLiteral()
         * @generated
         */
        EClass TLITERAL = eINSTANCE.getTLiteral();

        /**
         * The meta object literal for the '<em><b>Literal Val</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLITERAL__LITERAL_VAL = eINSTANCE.getTLiteral_LiteralVal();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLITERAL__NAME = eINSTANCE.getTLiteral_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassImpl <em>TLN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLNClass()
         * @generated
         */
        EClass TLN_CLASS = eINSTANCE.getTLNClass();

        /**
         * The meta object literal for the '<em><b>Can Have LOG</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLN_CLASS__CAN_HAVE_LOG = eINSTANCE.getTLNClass_CanHaveLOG();

        /**
         * The meta object literal for the '<em><b>Is Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLN_CLASS__IS_EXTENSION = eINSTANCE.getTLNClass_IsExtension();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TLN_CLASS__NAME = eINSTANCE.getTLNClass_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassesImpl <em>TLN Classes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TLNClassesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLNClasses()
         * @generated
         */
        EClass TLN_CLASSES = eINSTANCE.getTLNClasses();

        /**
         * The meta object literal for the '<em><b>Abstract LN Class</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TLN_CLASSES__ABSTRACT_LN_CLASS = eINSTANCE.getTLNClasses_AbstractLNClass();

        /**
         * The meta object literal for the '<em><b>LN Class</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TLN_CLASSES__LN_CLASS = eINSTANCE.getTLNClasses_LNClass();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNoticeImpl <em>TNotice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNoticeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNotice()
         * @generated
         */
        EClass TNOTICE = eINSTANCE.getTNotice();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNOTICE__MIXED = eINSTANCE.getTNotice_Mixed();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl <em>TNS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNS()
         * @generated
         */
        EClass TNS = eINSTANCE.getTNS();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__CHANGES = eINSTANCE.getTNS_Changes();

        /**
         * The meta object literal for the '<em><b>Depends On</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__DEPENDS_ON = eINSTANCE.getTNS_DependsOn();

        /**
         * The meta object literal for the '<em><b>Basic Types</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__BASIC_TYPES = eINSTANCE.getTNS_BasicTypes();

        /**
         * The meta object literal for the '<em><b>Functional Constraints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__FUNCTIONAL_CONSTRAINTS = eINSTANCE.getTNS_FunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Presence Conditions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__PRESENCE_CONDITIONS = eINSTANCE.getTNS_PresenceConditions();

        /**
         * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__ABBREVIATIONS = eINSTANCE.getTNS_Abbreviations();

        /**
         * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__ENUMERATIONS = eINSTANCE.getTNS_Enumerations();

        /**
         * The meta object literal for the '<em><b>Constructed Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__CONSTRUCTED_ATTRIBUTES = eINSTANCE.getTNS_ConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>CD Cs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__CD_CS = eINSTANCE.getTNS_CDCs();

        /**
         * The meta object literal for the '<em><b>LN Classes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS__LN_CLASSES = eINSTANCE.getTNS_LNClasses();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__DESC_ID = eINSTANCE.getTNS_DescID();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__ID = eINSTANCE.getTNS_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__PUBLICATION_STAGE = eINSTANCE.getTNS_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__RELEASE = eINSTANCE.getTNS_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__REVISION = eINSTANCE.getTNS_Revision();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__UML_DATE = eINSTANCE.getTNS_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__UML_VERSION = eINSTANCE.getTNS_UmlVersion();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS__VERSION = eINSTANCE.getTNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSDocImpl <em>TNS Doc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSDocImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSDoc()
         * @generated
         */
        EClass TNS_DOC = eINSTANCE.getTNSDoc();

        /**
         * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TNS_DOC__DOC = eINSTANCE.getTNSDoc_Doc();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__ID = eINSTANCE.getTNSDoc_Id();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__LANG = eINSTANCE.getTNSDoc_Lang();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__PUBLICATION_STAGE = eINSTANCE.getTNSDoc_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__RELEASE = eINSTANCE.getTNSDoc_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__REVISION = eINSTANCE.getTNSDoc_Revision();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__UML_DATE = eINSTANCE.getTNSDoc_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__UML_VERSION = eINSTANCE.getTNSDoc_UmlVersion();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TNS_DOC__VERSION = eINSTANCE.getTNSDoc_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionImpl <em>TPresence Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceCondition()
         * @generated
         */
        EClass TPRESENCE_CONDITION = eINSTANCE.getTPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPRESENCE_CONDITION__ARGUMENT = eINSTANCE.getTPresenceCondition_Argument();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPRESENCE_CONDITION__DESC_ID = eINSTANCE.getTPresenceCondition_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPRESENCE_CONDITION__NAME = eINSTANCE.getTPresenceCondition_Name();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPRESENCE_CONDITION__TITLE_ID = eINSTANCE.getTPresenceCondition_TitleID();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionsImpl <em>TPresence Conditions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TPresenceConditionsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceConditions()
         * @generated
         */
        EClass TPRESENCE_CONDITIONS = eINSTANCE.getTPresenceConditions();

        /**
         * The meta object literal for the '<em><b>Presence Condition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPRESENCE_CONDITIONS__PRESENCE_CONDITION = eINSTANCE.getTPresenceConditions_PresenceCondition();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl <em>TService CDC</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceCDC()
         * @generated
         */
        EClass TSERVICE_CDC = eINSTANCE.getTServiceCDC();

        /**
         * The meta object literal for the '<em><b>Service Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE = eINSTANCE.getTServiceCDC_ServiceDataAttribute();

        /**
         * The meta object literal for the '<em><b>Cdc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_CDC__CDC = eINSTANCE.getTServiceCDC_Cdc();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_CDC__VARIANT = eINSTANCE.getTServiceCDC_Variant();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCsImpl <em>TService CD Cs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceCDCs()
         * @generated
         */
        EClass TSERVICE_CD_CS = eINSTANCE.getTServiceCDCs();

        /**
         * The meta object literal for the '<em><b>Service CDC</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_CD_CS__SERVICE_CDC = eINSTANCE.getTServiceCDCs_ServiceCDC();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributeImpl <em>TService Constructed Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceConstructedAttribute()
         * @generated
         */
        EClass TSERVICE_CONSTRUCTED_ATTRIBUTE = eINSTANCE.getTServiceConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Type Kind Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED = eINSTANCE
                .getTServiceConstructedAttribute_TypeKindParameterized();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributesImpl <em>TService Constructed Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceConstructedAttributesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceConstructedAttributes()
         * @generated
         */
        EClass TSERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE.getTServiceConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Service Constructed Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getTServiceConstructedAttributes_ServiceConstructedAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceDataAttributeImpl <em>TService Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceDataAttribute()
         * @generated
         */
        EClass TSERVICE_DATA_ATTRIBUTE = eINSTANCE.getTServiceDataAttribute();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__FC = eINSTANCE.getTServiceDataAttribute_Fc();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__NAME = eINSTANCE.getTServiceDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__PRES_COND = eINSTANCE.getTServiceDataAttribute_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS = eINSTANCE.getTServiceDataAttribute_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = eINSTANCE.getTServiceDataAttribute_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__TYPE = eINSTANCE.getTServiceDataAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__TYPE_KIND = eINSTANCE.getTServiceDataAttribute_TypeKind();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE = eINSTANCE.getTServiceDataAttribute_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND = eINSTANCE
                .getTServiceDataAttribute_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNSImpl <em>TService NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceNS()
         * @generated
         */
        EClass TSERVICE_NS = eINSTANCE.getTServiceNS();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__CHANGES = eINSTANCE.getTServiceNS_Changes();

        /**
         * The meta object literal for the '<em><b>Functional Constraints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__FUNCTIONAL_CONSTRAINTS = eINSTANCE.getTServiceNS_FunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Presence Conditions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__PRESENCE_CONDITIONS = eINSTANCE.getTServiceNS_PresenceConditions();

        /**
         * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__ABBREVIATIONS = eINSTANCE.getTServiceNS_Abbreviations();

        /**
         * The meta object literal for the '<em><b>Service Type Realizations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__SERVICE_TYPE_REALIZATIONS = eINSTANCE.getTServiceNS_ServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Service Constructed Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE.getTServiceNS_ServiceConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Service CD Cs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS__SERVICE_CD_CS = eINSTANCE.getTServiceNS_ServiceCDCs();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__DESC_ID = eINSTANCE.getTServiceNS_DescID();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__ID = eINSTANCE.getTServiceNS_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__PUBLICATION_STAGE = eINSTANCE.getTServiceNS_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__RELEASE = eINSTANCE.getTServiceNS_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__REVISION = eINSTANCE.getTServiceNS_Revision();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__UML_DATE = eINSTANCE.getTServiceNS_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__UML_VERSION = eINSTANCE.getTServiceNS_UmlVersion();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS__VERSION = eINSTANCE.getTServiceNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNsUsageImpl <em>TService Ns Usage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceNsUsageImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceNsUsage()
         * @generated
         */
        EClass TSERVICE_NS_USAGE = eINSTANCE.getTServiceNsUsage();

        /**
         * The meta object literal for the '<em><b>Applies To</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_NS_USAGE__APPLIES_TO = eINSTANCE.getTServiceNsUsage_AppliesTo();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS_USAGE__ID = eINSTANCE.getTServiceNsUsage_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS_USAGE__PUBLICATION_STAGE = eINSTANCE.getTServiceNsUsage_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS_USAGE__RELEASE = eINSTANCE.getTServiceNsUsage_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS_USAGE__REVISION = eINSTANCE.getTServiceNsUsage_Revision();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_NS_USAGE__VERSION = eINSTANCE.getTServiceNsUsage_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceParameterImpl <em>TService Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceParameterImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceParameter()
         * @generated
         */
        EClass TSERVICE_PARAMETER = eINSTANCE.getTServiceParameter();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_PARAMETER__DEFAULT_VALUE = eINSTANCE.getTServiceParameter_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_PARAMETER__MAX_VALUE = eINSTANCE.getTServiceParameter_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_PARAMETER__MIN_VALUE = eINSTANCE.getTServiceParameter_MinValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_PARAMETER__NAME = eINSTANCE.getTServiceParameter_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_PARAMETER__TYPE = eINSTANCE.getTServiceParameter_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_PARAMETER__TYPE_KIND = eINSTANCE.getTServiceParameter_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationImpl <em>TService Type Realization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceTypeRealization()
         * @generated
         */
        EClass TSERVICE_TYPE_REALIZATION = eINSTANCE.getTServiceTypeRealization();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__FC = eINSTANCE.getTServiceTypeRealization_Fc();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__NAME = eINSTANCE.getTServiceTypeRealization_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__PRES_COND = eINSTANCE.getTServiceTypeRealization_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__PRES_COND_ARGS = eINSTANCE.getTServiceTypeRealization_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__PRES_COND_ARGS_ID = eINSTANCE.getTServiceTypeRealization_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__TYPE = eINSTANCE.getTServiceTypeRealization_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSERVICE_TYPE_REALIZATION__TYPE_KIND = eINSTANCE.getTServiceTypeRealization_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationsImpl <em>TService Type Realizations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceTypeRealizationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTServiceTypeRealizations()
         * @generated
         */
        EClass TSERVICE_TYPE_REALIZATIONS = eINSTANCE.getTServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Service Type Realization</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION = eINSTANCE
                .getTServiceTypeRealizations_ServiceTypeRealization();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataAttributeImpl <em>TSub Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTSubDataAttribute()
         * @generated
         */
        EClass TSUB_DATA_ATTRIBUTE = eINSTANCE.getTSubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getTSubDataAttribute_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__IS_ARRAY = eINSTANCE.getTSubDataAttribute_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = eINSTANCE.getTSubDataAttribute_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__MAX_VALUE = eINSTANCE.getTSubDataAttribute_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__MIN_INDEX = eINSTANCE.getTSubDataAttribute_MinIndex();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__MIN_VALUE = eINSTANCE.getTSubDataAttribute_MinValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__NAME = eINSTANCE.getTSubDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__PRES_COND = eINSTANCE.getTSubDataAttribute_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__PRES_COND_ARGS = eINSTANCE.getTSubDataAttribute_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = eINSTANCE.getTSubDataAttribute_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE = eINSTANCE.getTSubDataAttribute_SizeAttribute();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__TYPE = eINSTANCE.getTSubDataAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_ATTRIBUTE__TYPE_KIND = eINSTANCE.getTSubDataAttribute_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataObjectImpl <em>TSub Data Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TSubDataObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTSubDataObject()
         * @generated
         */
        EClass TSUB_DATA_OBJECT = eINSTANCE.getTSubDataObject();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__IS_ARRAY = eINSTANCE.getTSubDataObject_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE = eINSTANCE.getTSubDataObject_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__MIN_INDEX = eINSTANCE.getTSubDataObject_MinIndex();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__NAME = eINSTANCE.getTSubDataObject_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__PRES_COND = eINSTANCE.getTSubDataObject_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__PRES_COND_ARGS = eINSTANCE.getTSubDataObject_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__PRES_COND_ARGS_ID = eINSTANCE.getTSubDataObject_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__SIZE_ATTRIBUTE = eINSTANCE.getTSubDataObject_SizeAttribute();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__TYPE = eINSTANCE.getTSubDataObject_Type();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__UNDERLYING_TYPE = eINSTANCE.getTSubDataObject_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSUB_DATA_OBJECT__UNDERLYING_TYPE_KIND = eINSTANCE.getTSubDataObject_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TTitledClassImpl <em>TTitled Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TTitledClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTTitledClass()
         * @generated
         */
        EClass TTITLED_CLASS = eINSTANCE.getTTitledClass();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TTITLED_CLASS__TITLE_ID = eINSTANCE.getTTitledClass_TitleID();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind <em>TACSI Services Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTACSIServicesKind()
         * @generated
         */
        EEnum TACSI_SERVICES_KIND = eINSTANCE.getTACSIServicesKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind <em>TCB Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCBKind()
         * @generated
         */
        EEnum TCB_KIND = eINSTANCE.getTCBKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind <em>TDefined Attribute Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDefinedAttributeTypeKind()
         * @generated
         */
        EEnum TDEFINED_ATTRIBUTE_TYPE_KIND = eINSTANCE.getTDefinedAttributeTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind <em>TLicense Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLicenseKind()
         * @generated
         */
        EEnum TLICENSE_KIND = eINSTANCE.getTLicenseKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage <em>TPub Stage</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPubStage()
         * @generated
         */
        EEnum TPUB_STAGE = eINSTANCE.getTPubStage();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind <em>TUndefined Attribute Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTUndefinedAttributeTypeKind()
         * @generated
         */
        EEnum TUNDEFINED_ATTRIBUTE_TYPE_KIND = eINSTANCE.getTUndefinedAttributeTypeKind();

        /**
         * The meta object literal for the '<em>TAbbreviation Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbbreviationName()
         * @generated
         */
        EDataType TABBREVIATION_NAME = eINSTANCE.getTAbbreviationName();

        /**
         * The meta object literal for the '<em>TAbstract LN Class Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAbstractLNClassName()
         * @generated
         */
        EDataType TABSTRACT_LN_CLASS_NAME = eINSTANCE.getTAbstractLNClassName();

        /**
         * The meta object literal for the '<em>TACSI Services Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TACSIServicesKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTACSIServicesKindObject()
         * @generated
         */
        EDataType TACSI_SERVICES_KIND_OBJECT = eINSTANCE.getTACSIServicesKindObject();

        /**
         * The meta object literal for the '<em>TAttribute Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAttributeName()
         * @generated
         */
        EDataType TATTRIBUTE_NAME = eINSTANCE.getTAttributeName();

        /**
         * The meta object literal for the '<em>TAttribute Type Kind</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.Enumerator
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTAttributeTypeKind()
         * @generated
         */
        EDataType TATTRIBUTE_TYPE_KIND = eINSTANCE.getTAttributeTypeKind();

        /**
         * The meta object literal for the '<em>TBasic Type Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTBasicTypeName()
         * @generated
         */
        EDataType TBASIC_TYPE_NAME = eINSTANCE.getTBasicTypeName();

        /**
         * The meta object literal for the '<em>TCB Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCBKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCBKindObject()
         * @generated
         */
        EDataType TCB_KIND_OBJECT = eINSTANCE.getTCBKindObject();

        /**
         * The meta object literal for the '<em>TCDC Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTCDCName()
         * @generated
         */
        EDataType TCDC_NAME = eINSTANCE.getTCDCName();

        /**
         * The meta object literal for the '<em>TData Object Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDataObjectName()
         * @generated
         */
        EDataType TDATA_OBJECT_NAME = eINSTANCE.getTDataObjectName();

        /**
         * The meta object literal for the '<em>TDefined Attribute Type Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDefinedAttributeTypeKindObject()
         * @generated
         */
        EDataType TDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = eINSTANCE.getTDefinedAttributeTypeKindObject();

        /**
         * The meta object literal for the '<em>TDoc ID</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTDocID()
         * @generated
         */
        EDataType TDOC_ID = eINSTANCE.getTDocID();

        /**
         * The meta object literal for the '<em>TEmpty String</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTEmptyString()
         * @generated
         */
        EDataType TEMPTY_STRING = eINSTANCE.getTEmptyString();

        /**
         * The meta object literal for the '<em>TFC Abbreviation</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTFCAbbreviation()
         * @generated
         */
        EDataType TFC_ABBREVIATION = eINSTANCE.getTFCAbbreviation();

        /**
         * The meta object literal for the '<em>TIec61850 Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTIec61850Name()
         * @generated
         */
        EDataType TIEC61850_NAME = eINSTANCE.getTIec61850Name();

        /**
         * The meta object literal for the '<em>TIec61850 Name String</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTIec61850NameString()
         * @generated
         */
        EDataType TIEC61850_NAME_STRING = eINSTANCE.getTIec61850NameString();

        /**
         * The meta object literal for the '<em>Tissues Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTissuesType()
         * @generated
         */
        EDataType TISSUES_TYPE = eINSTANCE.getTissuesType();

        /**
         * The meta object literal for the '<em>TLicense Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicenseKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLicenseKindObject()
         * @generated
         */
        EDataType TLICENSE_KIND_OBJECT = eINSTANCE.getTLicenseKindObject();

        /**
         * The meta object literal for the '<em>TLiteral Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLiteralName()
         * @generated
         */
        EDataType TLITERAL_NAME = eINSTANCE.getTLiteralName();

        /**
         * The meta object literal for the '<em>TLN Class Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTLNClassName()
         * @generated
         */
        EDataType TLN_CLASS_NAME = eINSTANCE.getTLNClassName();

        /**
         * The meta object literal for the '<em>TNS Identifier</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSIdentifier()
         * @generated
         */
        EDataType TNS_IDENTIFIER = eINSTANCE.getTNSIdentifier();

        /**
         * The meta object literal for the '<em>TNS Release</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSRelease()
         * @generated
         */
        EDataType TNS_RELEASE = eINSTANCE.getTNSRelease();

        /**
         * The meta object literal for the '<em>TNS Release Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Short
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSReleaseObject()
         * @generated
         */
        EDataType TNS_RELEASE_OBJECT = eINSTANCE.getTNSReleaseObject();

        /**
         * The meta object literal for the '<em>TNS Revision</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSRevision()
         * @generated
         */
        EDataType TNS_REVISION = eINSTANCE.getTNSRevision();

        /**
         * The meta object literal for the '<em>TNS Version</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSVersion()
         * @generated
         */
        EDataType TNS_VERSION = eINSTANCE.getTNSVersion();

        /**
         * The meta object literal for the '<em>TNS Version Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Integer
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTNSVersionObject()
         * @generated
         */
        EDataType TNS_VERSION_OBJECT = eINSTANCE.getTNSVersionObject();

        /**
         * The meta object literal for the '<em>TPresence Condition Argument</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceConditionArgument()
         * @generated
         */
        EDataType TPRESENCE_CONDITION_ARGUMENT = eINSTANCE.getTPresenceConditionArgument();

        /**
         * The meta object literal for the '<em>TPresence Condition Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPresenceConditionName()
         * @generated
         */
        EDataType TPRESENCE_CONDITION_NAME = eINSTANCE.getTPresenceConditionName();

        /**
         * The meta object literal for the '<em>TPub Stage Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTPubStageObject()
         * @generated
         */
        EDataType TPUB_STAGE_OBJECT = eINSTANCE.getTPubStageObject();

        /**
         * The meta object literal for the '<em>TSub Data Object Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTSubDataObjectName()
         * @generated
         */
        EDataType TSUB_DATA_OBJECT_NAME = eINSTANCE.getTSubDataObjectName();

        /**
         * The meta object literal for the '<em>TUML Version</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTUMLVersion()
         * @generated
         */
        EDataType TUML_VERSION = eINSTANCE.getTUMLVersion();

        /**
         * The meta object literal for the '<em>TUndefined Attribute Type Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TUndefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTUndefinedAttributeTypeKindObject()
         * @generated
         */
        EDataType TUNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = eINSTANCE.getTUndefinedAttributeTypeKindObject();

    }

} //NsdPackage
