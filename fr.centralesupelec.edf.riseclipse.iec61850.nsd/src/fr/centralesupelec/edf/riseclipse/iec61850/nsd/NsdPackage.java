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
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviation()
     * @generated
     */
    int ABBREVIATION = 4;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__DESC_ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION__NAME = 1;

    /**
     * The number of structural features of the '<em>Abbreviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Abbreviation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl <em>Abbreviations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviations()
     * @generated
     */
    int ABBREVIATIONS = 5;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS__ABBREVIATION = 0;

    /**
     * The number of structural features of the '<em>Abbreviations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Abbreviations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABBREVIATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl <em>Documented Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentedClass()
     * @generated
     */
    int DOCUMENTED_CLASS = 23;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__DEPRECATED = 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__DESC_ID = 1;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS__INFORMATIVE = 2;

    /**
     * The number of structural features of the '<em>Documented Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Documented Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTED_CLASS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl <em>Titled Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTitledClass()
     * @generated
     */
    int TITLED_CLASS = 49;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS__TITLE_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Titled Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Titled Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TITLED_CLASS_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl <em>Any LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAnyLNClass()
     * @generated
     */
    int ANY_LN_CLASS = 7;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__DATA_OBJECT = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS__BASE = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Any LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Any LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_CLASS_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl <em>Abstract LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbstractLNClass()
     * @generated
     */
    int ABSTRACT_LN_CLASS = 6;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__DEPRECATED = ANY_LN_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__DESC_ID = ANY_LN_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__INFORMATIVE = ANY_LN_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__TITLE_ID = ANY_LN_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__DATA_OBJECT = ANY_LN_CLASS__DATA_OBJECT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__BASE = ANY_LN_CLASS__BASE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS__NAME = ANY_LN_CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS_FEATURE_COUNT = ANY_LN_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Abstract LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_LN_CLASS_OPERATION_COUNT = ANY_LN_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl <em>Copyrighted</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrighted()
     * @generated
     */
    int COPYRIGHTED = 17;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED__COPYRIGHT = 0;

    /**
     * The number of structural features of the '<em>Copyrighted</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Copyrighted</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHTED_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl <em>Applicable Service NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServiceNS()
     * @generated
     */
    int APPLICABLE_SERVICE_NS = 8;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Service Ns Usage</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__DATE = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS__VERSION = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Applicable Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Applicable Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICE_NS_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl <em>Applicable Services</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServices()
     * @generated
     */
    int APPLICABLE_SERVICES = 9;

    /**
     * The feature id for the '<em><b>Service</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__SERVICE = 0;

    /**
     * The feature id for the '<em><b>Data Set Member Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES__DATA_SET_MEMBER_OF = 1;

    /**
     * The number of structural features of the '<em>Applicable Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Applicable Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICABLE_SERVICES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicType()
     * @generated
     */
    int BASIC_TYPE = 10;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__DESC_ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>Basic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Basic Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl <em>Basic Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicTypes()
     * @generated
     */
    int BASIC_TYPES = 11;

    /**
     * The feature id for the '<em><b>Basic Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES__BASIC_TYPE = 0;

    /**
     * The number of structural features of the '<em>Basic Types</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Basic Types</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASIC_TYPES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl <em>CDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDC()
     * @generated
     */
    int CDC = 12;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Sub Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__SUB_DATA_OBJECT = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__DATA_ATTRIBUTE = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Service Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__SERVICE_PARAMETER = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Enum Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__ENUM_PARAMETERIZED = TITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__NAME = TITLED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Statistics</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__STATISTICS = TITLED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__TYPE_KIND_PARAMETERIZED = TITLED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC__VARIANT = TITLED_CLASS_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl <em>CD Cs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDCs()
     * @generated
     */
    int CD_CS = 13;

    /**
     * The feature id for the '<em><b>CDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS__CDC = 0;

    /**
     * The number of structural features of the '<em>CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CD_CS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl <em>Changes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getChanges()
     * @generated
     */
    int CHANGES = 14;

    /**
     * The feature id for the '<em><b>Changes ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__CHANGES_ID = 0;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__DATE = 1;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__RELEASE = 2;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__REVISION = 3;

    /**
     * The feature id for the '<em><b>Tissues</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__TISSUES = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__VERSION = 5;

    /**
     * The number of structural features of the '<em>Changes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Changes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl <em>Constructed Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttribute()
     * @generated
     */
    int CONSTRUCTED_ATTRIBUTE = 15;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE__NAME = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl <em>Constructed Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttributes()
     * @generated
     */
    int CONSTRUCTED_ATTRIBUTES = 16;

    /**
     * The feature id for the '<em><b>Constructed Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE = 0;

    /**
     * The number of structural features of the '<em>Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTED_ATTRIBUTES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl <em>Copyright Notice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrightNotice()
     * @generated
     */
    int COPYRIGHT_NOTICE = 18;

    /**
     * The feature id for the '<em><b>Notice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__NOTICE = 0;

    /**
     * The feature id for the '<em><b>License</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE__LICENSE = 1;

    /**
     * The number of structural features of the '<em>Copyright Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Copyright Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYRIGHT_NOTICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataAttribute()
     * @generated
     */
    int DATA_ATTRIBUTE = 19;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DCHG = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DEFAULT_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__DUPD = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__FC = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__IS_ARRAY = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MAX_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MIN_INDEX = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__MIN_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__QCHG = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 17;

    /**
     * The number of operations of the '<em>Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ATTRIBUTE_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl <em>Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataObject()
     * @generated
     */
    int DATA_OBJECT = 20;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Ds Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DS_PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DS_PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DS_PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__TRANSIENT = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__UNDERLYING_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__UNDERLYING_TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl <em>Data Set Member Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataSetMemberOf()
     * @generated
     */
    int DATA_SET_MEMBER_OF = 21;

    /**
     * The feature id for the '<em><b>Cb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF__CB = 0;

    /**
     * The number of structural features of the '<em>Data Set Member Of</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Data Set Member Of</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_MEMBER_OF_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl <em>Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDoc()
     * @generated
     */
    int DOC = 22;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__MIXED = 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__GROUP = 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__ANY = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC__ID = 3;

    /**
     * The number of structural features of the '<em>Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 24;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DEPRECATED = TITLED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DESC_ID = TITLED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__INFORMATIVE = TITLED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__TITLE_ID = TITLED_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Literal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__LITERAL = TITLED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inherited From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__INHERITED_FROM = TITLED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__NAME = TITLED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_FEATURE_COUNT = TITLED_CLASS_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_OPERATION_COUNT = TITLED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl <em>Enumerations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumerations()
     * @generated
     */
    int ENUMERATIONS = 25;

    /**
     * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS__ENUMERATION = 0;

    /**
     * The number of structural features of the '<em>Enumerations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Enumerations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl <em>Functional Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraint()
     * @generated
     */
    int FUNCTIONAL_CONSTRAINT = 26;

    /**
     * The feature id for the '<em><b>Applicable Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES = 0;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__ABBREVIATION = 1;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__DESC_ID = 2;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT__TITLE_ID = 3;

    /**
     * The number of structural features of the '<em>Functional Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Functional Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl <em>Functional Constraints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraints()
     * @generated
     */
    int FUNCTIONAL_CONSTRAINTS = 27;

    /**
     * The feature id for the '<em><b>Functional Constraint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT = 0;

    /**
     * The number of structural features of the '<em>Functional Constraints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Functional Constraints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_CONSTRAINTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl <em>License</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicense()
     * @generated
     */
    int LICENSE = 28;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__MIXED = 0;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__KIND = 1;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE__URI = 2;

    /**
     * The number of structural features of the '<em>License</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>License</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LICENSE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLiteral()
     * @generated
     */
    int LITERAL = 29;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Literal Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__LITERAL_VAL = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl <em>LN Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClass()
     * @generated
     */
    int LN_CLASS = 30;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__DEPRECATED = ANY_LN_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__DESC_ID = ANY_LN_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__INFORMATIVE = ANY_LN_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__TITLE_ID = ANY_LN_CLASS__TITLE_ID;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__DATA_OBJECT = ANY_LN_CLASS__DATA_OBJECT;

    /**
     * The feature id for the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__BASE = ANY_LN_CLASS__BASE;

    /**
     * The feature id for the '<em><b>Can Have LOG</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__CAN_HAVE_LOG = ANY_LN_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__IS_EXTENSION = ANY_LN_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS__NAME = ANY_LN_CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS_FEATURE_COUNT = ANY_LN_CLASS_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>LN Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASS_OPERATION_COUNT = ANY_LN_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl <em>LN Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClasses()
     * @generated
     */
    int LN_CLASSES = 31;

    /**
     * The feature id for the '<em><b>Abstract LN Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__ABSTRACT_LN_CLASS = 0;

    /**
     * The feature id for the '<em><b>LN Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES__LN_CLASS = 1;

    /**
     * The number of structural features of the '<em>LN Classes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>LN Classes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_CLASSES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl <em>Notice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNotice()
     * @generated
     */
    int NOTICE = 32;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE__MIXED = 0;

    /**
     * The number of structural features of the '<em>Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Notice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl <em>NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNS()
     * @generated
     */
    int NS = 33;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__CHANGES = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Depends On</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__DEPENDS_ON = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Basic Types</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__BASIC_TYPES = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__FUNCTIONAL_CONSTRAINTS = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__PRESENCE_CONDITIONS = COPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__ABBREVIATIONS = COPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Enumerations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__ENUMERATIONS = COPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__CONSTRUCTED_ATTRIBUTES = COPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__CD_CS = COPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>LN Classes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__LN_CLASSES = COPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__DESC_ID = COPYRIGHTED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__ID = COPYRIGHTED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__PUBLICATION_STAGE = COPYRIGHTED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__RELEASE = COPYRIGHTED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__REVISION = COPYRIGHTED_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__UML_DATE = COPYRIGHTED_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__UML_VERSION = COPYRIGHTED_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS__VERSION = COPYRIGHTED_FEATURE_COUNT + 17;

    /**
     * The number of structural features of the '<em>NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 18;

    /**
     * The number of operations of the '<em>NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl <em>NS Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNSDoc()
     * @generated
     */
    int NS_DOC = 34;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Doc</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__DOC = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__ID = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lang</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__LANG = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__PUBLICATION_STAGE = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__RELEASE = COPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__REVISION = COPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__UML_DATE = COPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__UML_VERSION = COPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC__VERSION = COPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>NS Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>NS Doc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NS_DOC_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl <em>Presence Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceCondition()
     * @generated
     */
    int PRESENCE_CONDITION = 35;

    /**
     * The feature id for the '<em><b>Argument</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__ARGUMENT = 0;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__DESC_ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__NAME = 2;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION__TITLE_ID = 3;

    /**
     * The number of structural features of the '<em>Presence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Presence Condition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl <em>Presence Conditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceConditions()
     * @generated
     */
    int PRESENCE_CONDITIONS = 36;

    /**
     * The feature id for the '<em><b>Presence Condition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS__PRESENCE_CONDITION = 0;

    /**
     * The number of structural features of the '<em>Presence Conditions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Presence Conditions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENCE_CONDITIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl <em>Service CDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDC()
     * @generated
     */
    int SERVICE_CDC = 37;

    /**
     * The feature id for the '<em><b>Service Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__SERVICE_DATA_ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__CDC = 1;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC__VARIANT = 2;

    /**
     * The number of structural features of the '<em>Service CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Service CDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CDC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl <em>Service CD Cs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDCs()
     * @generated
     */
    int SERVICE_CD_CS = 38;

    /**
     * The feature id for the '<em><b>Service CDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS__SERVICE_CDC = 0;

    /**
     * The number of structural features of the '<em>Service CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Service CD Cs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CD_CS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl <em>Service Constructed Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttribute()
     * @generated
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE = 39;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__DEPRECATED = CONSTRUCTED_ATTRIBUTE__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__DESC_ID = CONSTRUCTED_ATTRIBUTE__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__INFORMATIVE = CONSTRUCTED_ATTRIBUTE__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Title ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__TITLE_ID = CONSTRUCTED_ATTRIBUTE__TITLE_ID;

    /**
     * The feature id for the '<em><b>Sub Data Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__NAME = CONSTRUCTED_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Type Kind Parameterized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED = CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT = CONSTRUCTED_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service Constructed Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT = CONSTRUCTED_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl <em>Service Constructed Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttributes()
     * @generated
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES = 40;

    /**
     * The feature id for the '<em><b>Service Constructed Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE = 0;

    /**
     * The number of structural features of the '<em>Service Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Service Constructed Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONSTRUCTED_ATTRIBUTES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl <em>Service Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceDataAttribute()
     * @generated
     */
    int SERVICE_DATA_ATTRIBUTE = 41;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__FC = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Service Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Service Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_DATA_ATTRIBUTE_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl <em>Service NS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNS()
     * @generated
     */
    int SERVICE_NS = 42;

    /**
     * The feature id for the '<em><b>Copyright</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__COPYRIGHT = COPYRIGHTED__COPYRIGHT;

    /**
     * The feature id for the '<em><b>Changes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__CHANGES = COPYRIGHTED_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Functional Constraints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__FUNCTIONAL_CONSTRAINTS = COPYRIGHTED_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Presence Conditions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__PRESENCE_CONDITIONS = COPYRIGHTED_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Abbreviations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__ABBREVIATIONS = COPYRIGHTED_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Service Type Realizations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__SERVICE_TYPE_REALIZATIONS = COPYRIGHTED_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Service Constructed Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES = COPYRIGHTED_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Service CD Cs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__SERVICE_CD_CS = COPYRIGHTED_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__DESC_ID = COPYRIGHTED_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__ID = COPYRIGHTED_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__PUBLICATION_STAGE = COPYRIGHTED_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__RELEASE = COPYRIGHTED_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__REVISION = COPYRIGHTED_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Uml Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__UML_DATE = COPYRIGHTED_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Uml Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__UML_VERSION = COPYRIGHTED_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS__VERSION = COPYRIGHTED_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_FEATURE_COUNT = COPYRIGHTED_FEATURE_COUNT + 15;

    /**
     * The number of operations of the '<em>Service NS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_OPERATION_COUNT = COPYRIGHTED_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl <em>Service Ns Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNsUsage()
     * @generated
     */
    int SERVICE_NS_USAGE = 43;

    /**
     * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__APPLIES_TO = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__ID = 1;

    /**
     * The feature id for the '<em><b>Publication Stage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__PUBLICATION_STAGE = 2;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__RELEASE = 3;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__REVISION = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE__VERSION = 5;

    /**
     * The number of structural features of the '<em>Service Ns Usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Service Ns Usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_NS_USAGE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceParameter()
     * @generated
     */
    int SERVICE_PARAMETER = 44;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__DEFAULT_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__MAX_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__MIN_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Service Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Service Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETER_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationImpl <em>Service Type Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceTypeRealization()
     * @generated
     */
    int SERVICE_TYPE_REALIZATION = 45;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__FC = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__NAME = 1;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__PRES_COND = 2;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__PRES_COND_ARGS = 3;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__PRES_COND_ARGS_ID = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__TYPE = 5;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION__TYPE_KIND = 6;

    /**
     * The number of structural features of the '<em>Service Type Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Service Type Realization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl <em>Service Type Realizations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceTypeRealizations()
     * @generated
     */
    int SERVICE_TYPE_REALIZATIONS = 46;

    /**
     * The feature id for the '<em><b>Service Type Realization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION = 0;

    /**
     * The number of structural features of the '<em>Service Type Realizations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Service Type Realizations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TYPE_REALIZATIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl <em>Sub Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataAttribute()
     * @generated
     */
    int SUB_DATA_ATTRIBUTE = 47;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__DEFAULT_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__IS_ARRAY = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MAX_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MIN_INDEX = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__MIN_VALUE = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE__TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>Sub Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 13;

    /**
     * The number of operations of the '<em>Sub Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_ATTRIBUTE_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl <em>Sub Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataObject()
     * @generated
     */
    int SUB_DATA_OBJECT = 48;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__DEPRECATED = DOCUMENTED_CLASS__DEPRECATED;

    /**
     * The feature id for the '<em><b>Desc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__DESC_ID = DOCUMENTED_CLASS__DESC_ID;

    /**
     * The feature id for the '<em><b>Informative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__INFORMATIVE = DOCUMENTED_CLASS__INFORMATIVE;

    /**
     * The feature id for the '<em><b>Is Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__IS_ARRAY = DOCUMENTED_CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Index Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Min Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__MIN_INDEX = DOCUMENTED_CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__NAME = DOCUMENTED_CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pres Cond</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PRES_COND = DOCUMENTED_CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Pres Cond Args</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PRES_COND_ARGS = DOCUMENTED_CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Pres Cond Args ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__PRES_COND_ARGS_ID = DOCUMENTED_CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Size Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__SIZE_ATTRIBUTE = DOCUMENTED_CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__UNDERLYING_TYPE = DOCUMENTED_CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Underlying Type Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND = DOCUMENTED_CLASS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Sub Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT_FEATURE_COUNT = DOCUMENTED_CLASS_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Sub Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_DATA_OBJECT_OPERATION_COUNT = DOCUMENTED_CLASS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKind()
     * @generated
     */
    int ACSI_SERVICES_KIND = 50;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKind()
     * @generated
     */
    int CB_KIND = 51;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKind()
     * @generated
     */
    int DEFINED_ATTRIBUTE_TYPE_KIND = 52;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKind()
     * @generated
     */
    int LICENSE_KIND = 53;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStage()
     * @generated
     */
    int PUB_STAGE = 54;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKind()
     * @generated
     */
    int UNDEFINED_ATTRIBUTE_TYPE_KIND = 55;

    /**
     * The meta object id for the '<em>ACSI Services Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKindObject()
     * @generated
     */
    int ACSI_SERVICES_KIND_OBJECT = 56;

    /**
     * The meta object id for the '<em>Attribute Type Kind</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Enumerator
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAttributeTypeKind()
     * @generated
     */
    int ATTRIBUTE_TYPE_KIND = 57;

    /**
     * The meta object id for the '<em>CB Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKindObject()
     * @generated
     */
    int CB_KIND_OBJECT = 58;

    /**
     * The meta object id for the '<em>Defined Attribute Type Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKindObject()
     * @generated
     */
    int DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = 59;

    /**
     * The meta object id for the '<em>License Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKindObject()
     * @generated
     */
    int LICENSE_KIND_OBJECT = 60;

    /**
     * The meta object id for the '<em>Pub Stage Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStageObject()
     * @generated
     */
    int PUB_STAGE_OBJECT = 61;

    /**
     * The meta object id for the '<em>Undefined Attribute Type Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKindObject()
     * @generated
     */
    int UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = 62;

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
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation
     * @generated
     */
    EClass getAbbreviation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getDescID()
     * @see #getAbbreviation()
     * @generated
     */
    EAttribute getAbbreviation_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation#getName()
     * @see #getAbbreviation()
     * @generated
     */
    EAttribute getAbbreviation_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations
     * @generated
     */
    EClass getAbbreviations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations#getAbbreviation()
     * @see #getAbbreviations()
     * @generated
     */
    EReference getAbbreviations_Abbreviation();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass <em>Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass
     * @generated
     */
    EClass getAbstractLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass#getName()
     * @see #getAbstractLNClass()
     * @generated
     */
    EAttribute getAbstractLNClass_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass <em>Any LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass
     * @generated
     */
    EClass getAnyLNClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getDataObject()
     * @see #getAnyLNClass()
     * @generated
     */
    EReference getAnyLNClass_DataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass#getBase()
     * @see #getAnyLNClass()
     * @generated
     */
    EAttribute getAnyLNClass_Base();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS <em>Applicable Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applicable Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS
     * @generated
     */
    EClass getApplicableServiceNS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getServiceNsUsage()
     * @see #getApplicableServiceNS()
     * @generated
     */
    EReference getApplicableServiceNS_ServiceNsUsage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getDate()
     * @see #getApplicableServiceNS()
     * @generated
     */
    EAttribute getApplicableServiceNS_Date();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS#getVersion()
     * @see #getApplicableServiceNS()
     * @generated
     */
    EAttribute getApplicableServiceNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices
     * @generated
     */
    EClass getApplicableServices();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getService()
     * @see #getApplicableServices()
     * @generated
     */
    EReference getApplicableServices_Service();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Set Member Of</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices#getDataSetMemberOf()
     * @see #getApplicableServices()
     * @generated
     */
    EReference getApplicableServices_DataSetMemberOf();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType
     * @generated
     */
    EClass getBasicType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getDescID()
     * @see #getBasicType()
     * @generated
     */
    EAttribute getBasicType_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType#getName()
     * @see #getBasicType()
     * @generated
     */
    EAttribute getBasicType_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes
     * @generated
     */
    EClass getBasicTypes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType <em>Basic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Basic Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes#getBasicType()
     * @see #getBasicTypes()
     * @generated
     */
    EReference getBasicTypes_BasicType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC
     * @generated
     */
    EClass getCDC();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getSubDataObject()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_SubDataObject();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getDataAttribute()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_DataAttribute();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter <em>Service Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Parameter</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getServiceParameter()
     * @see #getCDC()
     * @generated
     */
    EReference getCDC_ServiceParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized <em>Enum Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enum Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isEnumParameterized()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_EnumParameterized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getName()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics <em>Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Statistics</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isStatistics()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_Statistics();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized <em>Type Kind Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#isTypeKindParameterized()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_TypeKindParameterized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC#getVariant()
     * @see #getCDC()
     * @generated
     */
    EAttribute getCDC_Variant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs
     * @generated
     */
    EClass getCDCs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC <em>CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs#getCDC()
     * @see #getCDCs()
     * @generated
     */
    EReference getCDCs_CDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes
     * @generated
     */
    EClass getChanges();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID <em>Changes ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changes ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getChangesID()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_ChangesID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getDate()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Date();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRelease()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getRevision()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues <em>Tissues</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tissues</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getTissues()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Tissues();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes#getVersion()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute
     * @generated
     */
    EClass getConstructedAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getSubDataAttribute()
     * @see #getConstructedAttribute()
     * @generated
     */
    EReference getConstructedAttribute_SubDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute#getName()
     * @see #getConstructedAttribute()
     * @generated
     */
    EAttribute getConstructedAttribute_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes
     * @generated
     */
    EClass getConstructedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute <em>Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes#getConstructedAttribute()
     * @see #getConstructedAttributes()
     * @generated
     */
    EReference getConstructedAttributes_ConstructedAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted <em>Copyrighted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copyrighted</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted
     * @generated
     */
    EClass getCopyrighted();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright <em>Copyright</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Copyright</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted#getCopyright()
     * @see #getCopyrighted()
     * @generated
     */
    EReference getCopyrighted_Copyright();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice <em>Copyright Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copyright Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice
     * @generated
     */
    EClass getCopyrightNotice();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice <em>Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getNotice()
     * @see #getCopyrightNotice()
     * @generated
     */
    EReference getCopyrightNotice_Notice();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>License</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice#getLicense()
     * @see #getCopyrightNotice()
     * @generated
     */
    EReference getCopyrightNotice_License();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute <em>Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute
     * @generated
     */
    EClass getDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isDchg <em>Dchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isDchg()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Dchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getDefaultValue()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isDupd <em>Dupd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dupd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isDupd()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Dupd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getFc()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isIsArray()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMaxIndexAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMaxValue()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMinIndex()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getMinValue()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_MinValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getName()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getPresCond()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getPresCondArgs()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getPresCondArgsID()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isQchg <em>Qchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#isQchg()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Qchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getSizeAttribute()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_SizeAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getType()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute#getTypeKind()
     * @see #getDataAttribute()
     * @generated
     */
    EAttribute getDataAttribute_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject
     * @generated
     */
    EClass getDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCond <em>Ds Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCond()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_DsPresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs <em>Ds Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgs()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_DsPresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getDsPresCondArgsID()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_DsPresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getName()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCond()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgs()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getPresCondArgsID()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#isTransient()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_Transient();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getType()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingType()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject#getUnderlyingTypeKind()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf <em>Data Set Member Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set Member Of</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf
     * @generated
     */
    EClass getDataSetMemberOf();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb <em>Cb</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cb</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf#getCb()
     * @see #getDataSetMemberOf()
     * @generated
     */
    EAttribute getDataSetMemberOf_Cb();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc
     * @generated
     */
    EClass getDoc();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getMixed()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getGroup()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Group();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getAny()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Any();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc#getId()
     * @see #getDoc()
     * @generated
     */
    EAttribute getDoc_Id();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass <em>Documented Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documented Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass
     * @generated
     */
    EClass getDocumentedClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated <em>Deprecated</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deprecated</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isDeprecated()
     * @see #getDocumentedClass()
     * @generated
     */
    EAttribute getDocumentedClass_Deprecated();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#getDescID()
     * @see #getDocumentedClass()
     * @generated
     */
    EAttribute getDocumentedClass_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative <em>Informative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Informative</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass#isInformative()
     * @see #getDocumentedClass()
     * @generated
     */
    EAttribute getDocumentedClass_Informative();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration
     * @generated
     */
    EClass getEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getLiteral()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_Literal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom <em>Inherited From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inherited From</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getInheritedFrom()
     * @see #getEnumeration()
     * @generated
     */
    EAttribute getEnumeration_InheritedFrom();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration#getName()
     * @see #getEnumeration()
     * @generated
     */
    EAttribute getEnumeration_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations
     * @generated
     */
    EClass getEnumerations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumeration</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations#getEnumeration()
     * @see #getEnumerations()
     * @generated
     */
    EReference getEnumerations_Enumeration();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint
     * @generated
     */
    EClass getFunctionalConstraint();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices <em>Applicable Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applicable Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getApplicableServices()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EReference getFunctionalConstraint_ApplicableServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abbreviation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getAbbreviation()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EAttribute getFunctionalConstraint_Abbreviation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getDescID()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EAttribute getFunctionalConstraint_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint#getTitleID()
     * @see #getFunctionalConstraint()
     * @generated
     */
    EAttribute getFunctionalConstraint_TitleID();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints
     * @generated
     */
    EClass getFunctionalConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint <em>Functional Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Constraint</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints#getFunctionalConstraint()
     * @see #getFunctionalConstraints()
     * @generated
     */
    EReference getFunctionalConstraints_FunctionalConstraint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>License</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License
     * @generated
     */
    EClass getLicense();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getMixed()
     * @see #getLicense()
     * @generated
     */
    EAttribute getLicense_Mixed();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getKind()
     * @see #getLicense()
     * @generated
     */
    EAttribute getLicense_Kind();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getUri <em>Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.License#getUri()
     * @see #getLicense()
     * @generated
     */
    EAttribute getLicense_Uri();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal
     * @generated
     */
    EClass getLiteral();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getLiteralVal <em>Literal Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Literal Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getLiteralVal()
     * @see #getLiteral()
     * @generated
     */
    EAttribute getLiteral_LiteralVal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal#getName()
     * @see #getLiteral()
     * @generated
     */
    EAttribute getLiteral_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass
     * @generated
     */
    EClass getLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG <em>Can Have LOG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Can Have LOG</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isCanHaveLOG()
     * @see #getLNClass()
     * @generated
     */
    EAttribute getLNClass_CanHaveLOG();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension <em>Is Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Extension</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#isIsExtension()
     * @see #getLNClass()
     * @generated
     */
    EAttribute getLNClass_IsExtension();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass#getName()
     * @see #getLNClass()
     * @generated
     */
    EAttribute getLNClass_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses
     * @generated
     */
    EClass getLNClasses();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass <em>Abstract LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Abstract LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getAbstractLNClass()
     * @see #getLNClasses()
     * @generated
     */
    EReference getLNClasses_AbstractLNClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass <em>LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses#getLNClass()
     * @see #getLNClasses()
     * @generated
     */
    EReference getLNClasses_LNClass();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice <em>Notice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Notice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice
     * @generated
     */
    EClass getNotice();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice#getMixed()
     * @see #getNotice()
     * @generated
     */
    EAttribute getNotice_Mixed();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS <em>NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS
     * @generated
     */
    EClass getNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getChanges()
     * @see #getNS()
     * @generated
     */
    EReference getNS_Changes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn <em>Depends On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Depends On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDependsOn()
     * @see #getNS()
     * @generated
     */
    EReference getNS_DependsOn();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes <em>Basic Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Basic Types</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getBasicTypes()
     * @see #getNS()
     * @generated
     */
    EReference getNS_BasicTypes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getFunctionalConstraints()
     * @see #getNS()
     * @generated
     */
    EReference getNS_FunctionalConstraints();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPresenceConditions()
     * @see #getNS()
     * @generated
     */
    EReference getNS_PresenceConditions();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getAbbreviations()
     * @see #getNS()
     * @generated
     */
    EReference getNS_Abbreviations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Enumerations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getEnumerations()
     * @see #getNS()
     * @generated
     */
    EReference getNS_Enumerations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes <em>Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getConstructedAttributes()
     * @see #getNS()
     * @generated
     */
    EReference getNS_ConstructedAttributes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs <em>CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getCDCs()
     * @see #getNS()
     * @generated
     */
    EReference getNS_CDCs();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses <em>LN Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>LN Classes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getLNClasses()
     * @see #getNS()
     * @generated
     */
    EReference getNS_LNClasses();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getDescID()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getId()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getPublicationStage()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRelease()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getRevision()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlDate()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getUmlVersion()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_UmlVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS#getVersion()
     * @see #getNS()
     * @generated
     */
    EAttribute getNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc <em>NS Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>NS Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc
     * @generated
     */
    EClass getNSDoc();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc <em>Doc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Doc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getDoc()
     * @see #getNSDoc()
     * @generated
     */
    EReference getNSDoc_Doc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getId()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang <em>Lang</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lang</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getLang()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_Lang();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getPublicationStage()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRelease()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getRevision()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlDate()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getUmlVersion()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_UmlVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc#getVersion()
     * @see #getNSDoc()
     * @generated
     */
    EAttribute getNSDoc_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition
     * @generated
     */
    EClass getPresenceCondition();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument <em>Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Argument</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getArgument()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_Argument();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getDescID()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getName()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition#getTitleID()
     * @see #getPresenceCondition()
     * @generated
     */
    EAttribute getPresenceCondition_TitleID();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions
     * @generated
     */
    EClass getPresenceConditions();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition <em>Presence Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Presence Condition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions#getPresenceCondition()
     * @see #getPresenceConditions()
     * @generated
     */
    EReference getPresenceConditions_PresenceCondition();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC
     * @generated
     */
    EClass getServiceCDC();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getServiceDataAttribute()
     * @see #getServiceCDC()
     * @generated
     */
    EReference getServiceCDC_ServiceDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc <em>Cdc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getCdc()
     * @see #getServiceCDC()
     * @generated
     */
    EAttribute getServiceCDC_Cdc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC#getVariant()
     * @see #getServiceCDC()
     * @generated
     */
    EAttribute getServiceCDC_Variant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs
     * @generated
     */
    EClass getServiceCDCs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC <em>Service CDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service CDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs#getServiceCDC()
     * @see #getServiceCDCs()
     * @generated
     */
    EReference getServiceCDCs_ServiceCDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute
     * @generated
     */
    EClass getServiceConstructedAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized <em>Type Kind Parameterized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind Parameterized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute#isTypeKindParameterized()
     * @see #getServiceConstructedAttribute()
     * @generated
     */
    EAttribute getServiceConstructedAttribute_TypeKindParameterized();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes <em>Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes
     * @generated
     */
    EClass getServiceConstructedAttributes();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceConstructedAttribute <em>Service Constructed Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Constructed Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes#getServiceConstructedAttribute()
     * @see #getServiceConstructedAttributes()
     * @generated
     */
    EReference getServiceConstructedAttributes_ServiceConstructedAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute <em>Service Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute
     * @generated
     */
    EClass getServiceDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getFc()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getName()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCond()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgs()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getPresCondArgsID()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getType()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getTypeKind()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_TypeKind();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingType()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute#getUnderlyingTypeKind()
     * @see #getServiceDataAttribute()
     * @generated
     */
    EAttribute getServiceDataAttribute_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS <em>Service NS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service NS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS
     * @generated
     */
    EClass getServiceNS();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Changes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getChanges()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_Changes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints <em>Functional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Functional Constraints</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getFunctionalConstraints()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_FunctionalConstraints();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions <em>Presence Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presence Conditions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPresenceConditions()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_PresenceConditions();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations <em>Abbreviations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Abbreviations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getAbbreviations()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_Abbreviations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceTypeRealizations()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_ServiceTypeRealizations();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Constructed Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceConstructedAttributes()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_ServiceConstructedAttributes();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs <em>Service CD Cs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service CD Cs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getServiceCDCs()
     * @see #getServiceNS()
     * @generated
     */
    EReference getServiceNS_ServiceCDCs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getDescID <em>Desc ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getDescID()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_DescID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getId()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getPublicationStage()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRelease()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getRevision()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlDate <em>Uml Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Date</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlDate()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_UmlDate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlVersion <em>Uml Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uml Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getUmlVersion()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_UmlVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS#getVersion()
     * @see #getServiceNS()
     * @generated
     */
    EAttribute getServiceNS_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage <em>Service Ns Usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Ns Usage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage
     * @generated
     */
    EClass getServiceNsUsage();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo <em>Applies To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applies To</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getAppliesTo()
     * @see #getServiceNsUsage()
     * @generated
     */
    EReference getServiceNsUsage_AppliesTo();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getId()
     * @see #getServiceNsUsage()
     * @generated
     */
    EAttribute getServiceNsUsage_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getPublicationStage <em>Publication Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publication Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getPublicationStage()
     * @see #getServiceNsUsage()
     * @generated
     */
    EAttribute getServiceNsUsage_PublicationStage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRelease()
     * @see #getServiceNsUsage()
     * @generated
     */
    EAttribute getServiceNsUsage_Release();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getRevision()
     * @see #getServiceNsUsage()
     * @generated
     */
    EAttribute getServiceNsUsage_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage#getVersion()
     * @see #getServiceNsUsage()
     * @generated
     */
    EAttribute getServiceNsUsage_Version();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter <em>Service Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Parameter</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter
     * @generated
     */
    EClass getServiceParameter();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getDefaultValue()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getMaxValue()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getMinValue()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_MinValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getName()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getType()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter#getTypeKind()
     * @see #getServiceParameter()
     * @generated
     */
    EAttribute getServiceParameter_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Type Realization</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization
     * @generated
     */
    EClass getServiceTypeRealization();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getFc()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getName()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getPresCond()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getPresCondArgs()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getPresCondArgsID()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getType()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization#getTypeKind()
     * @see #getServiceTypeRealization()
     * @generated
     */
    EAttribute getServiceTypeRealization_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations <em>Service Type Realizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Type Realizations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations
     * @generated
     */
    EClass getServiceTypeRealizations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization <em>Service Type Realization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Type Realization</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations#getServiceTypeRealization()
     * @see #getServiceTypeRealizations()
     * @generated
     */
    EReference getServiceTypeRealizations_ServiceTypeRealization();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute <em>Sub Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute
     * @generated
     */
    EClass getSubDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getDefaultValue()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#isIsArray()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxIndexAttribute()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue <em>Max Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMaxValue()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_MaxValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinIndex()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue <em>Min Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getMinValue()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_MinValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getName()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCond()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgs()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getPresCondArgsID()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getSizeAttribute()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_SizeAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getType()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getTypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute#getTypeKind()
     * @see #getSubDataAttribute()
     * @generated
     */
    EAttribute getSubDataAttribute_TypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject <em>Sub Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject
     * @generated
     */
    EClass getSubDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#isIsArray <em>Is Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Array</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#isIsArray()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_IsArray();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMaxIndexAttribute <em>Max Index Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Index Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMaxIndexAttribute()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_MaxIndexAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMinIndex <em>Min Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Index</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getMinIndex()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_MinIndex();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getName()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCond <em>Pres Cond</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCond()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_PresCond();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgs <em>Pres Cond Args</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgs()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_PresCondArgs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgsID <em>Pres Cond Args ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pres Cond Args ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getPresCondArgsID()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_PresCondArgsID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getSizeAttribute <em>Size Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getSizeAttribute()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_SizeAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getType()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingType <em>Underlying Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingType()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_UnderlyingType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingTypeKind <em>Underlying Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Underlying Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject#getUnderlyingTypeKind()
     * @see #getSubDataObject()
     * @generated
     */
    EAttribute getSubDataObject_UnderlyingTypeKind();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass <em>Titled Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Titled Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass
     * @generated
     */
    EClass getTitledClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID <em>Title ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass#getTitleID()
     * @see #getTitledClass()
     * @generated
     */
    EAttribute getTitledClass_TitleID();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ACSI Services Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @generated
     */
    EEnum getACSIServicesKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>CB Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @generated
     */
    EEnum getCBKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Defined Attribute Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @generated
     */
    EEnum getDefinedAttributeTypeKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>License Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @generated
     */
    EEnum getLicenseKind();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Pub Stage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @generated
     */
    EEnum getPubStage();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Undefined Attribute Type Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @generated
     */
    EEnum getUndefinedAttributeTypeKind();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ACSI Services Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind"
     *        extendedMetaData="name='tACSIServicesKind:Object' baseType='tACSIServicesKind'"
     * @generated
     */
    EDataType getACSIServicesKindObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Attribute Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type kind of a data attribute, which may be "undefined".
     * <!-- end-model-doc -->
     * @return the meta object for data type '<em>Attribute Type Kind</em>'.
     * @see org.eclipse.emf.common.util.Enumerator
     * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
     *        extendedMetaData="name='tAttributeTypeKind' memberTypes='tDefinedAttributeTypeKind tUndefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getAttributeTypeKind();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>CB Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind"
     *        extendedMetaData="name='tCBKind:Object' baseType='tCBKind'"
     * @generated
     */
    EDataType getCBKindObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Defined Attribute Type Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind"
     *        extendedMetaData="name='tDefinedAttributeTypeKind:Object' baseType='tDefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getDefinedAttributeTypeKindObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>License Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind"
     *        extendedMetaData="name='tLicenseKind:Object' baseType='tLicenseKind'"
     * @generated
     */
    EDataType getLicenseKindObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pub Stage Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage"
     *        extendedMetaData="name='tPubStage:Object' baseType='tPubStage'"
     * @generated
     */
    EDataType getPubStageObject();

    /**
     * Returns the meta object for data type '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Undefined Attribute Type Kind Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
     * @model instanceClass="fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind"
     *        extendedMetaData="name='tUndefinedAttributeTypeKind:Object' baseType='tUndefinedAttributeTypeKind'"
     * @generated
     */
    EDataType getUndefinedAttributeTypeKindObject();

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
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviation()
         * @generated
         */
        EClass ABBREVIATION = eINSTANCE.getAbbreviation();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABBREVIATION__DESC_ID = eINSTANCE.getAbbreviation_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABBREVIATION__NAME = eINSTANCE.getAbbreviation_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl <em>Abbreviations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbbreviations()
         * @generated
         */
        EClass ABBREVIATIONS = eINSTANCE.getAbbreviations();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABBREVIATIONS__ABBREVIATION = eINSTANCE.getAbbreviations_Abbreviation();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl <em>Abstract LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAbstractLNClass()
         * @generated
         */
        EClass ABSTRACT_LN_CLASS = eINSTANCE.getAbstractLNClass();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_LN_CLASS__NAME = eINSTANCE.getAbstractLNClass_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl <em>Any LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAnyLNClass()
         * @generated
         */
        EClass ANY_LN_CLASS = eINSTANCE.getAnyLNClass();

        /**
         * The meta object literal for the '<em><b>Data Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANY_LN_CLASS__DATA_OBJECT = eINSTANCE.getAnyLNClass_DataObject();

        /**
         * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_LN_CLASS__BASE = eINSTANCE.getAnyLNClass_Base();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl <em>Applicable Service NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServiceNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServiceNS()
         * @generated
         */
        EClass APPLICABLE_SERVICE_NS = eINSTANCE.getApplicableServiceNS();

        /**
         * The meta object literal for the '<em><b>Service Ns Usage</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE = eINSTANCE.getApplicableServiceNS_ServiceNsUsage();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICABLE_SERVICE_NS__DATE = eINSTANCE.getApplicableServiceNS_Date();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICABLE_SERVICE_NS__VERSION = eINSTANCE.getApplicableServiceNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl <em>Applicable Services</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getApplicableServices()
         * @generated
         */
        EClass APPLICABLE_SERVICES = eINSTANCE.getApplicableServices();

        /**
         * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICES__SERVICE = eINSTANCE.getApplicableServices_Service();

        /**
         * The meta object literal for the '<em><b>Data Set Member Of</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICABLE_SERVICES__DATA_SET_MEMBER_OF = eINSTANCE.getApplicableServices_DataSetMemberOf();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl <em>Basic Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicType()
         * @generated
         */
        EClass BASIC_TYPE = eINSTANCE.getBasicType();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_TYPE__DESC_ID = eINSTANCE.getBasicType_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASIC_TYPE__NAME = eINSTANCE.getBasicType_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl <em>Basic Types</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getBasicTypes()
         * @generated
         */
        EClass BASIC_TYPES = eINSTANCE.getBasicTypes();

        /**
         * The meta object literal for the '<em><b>Basic Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASIC_TYPES__BASIC_TYPE = eINSTANCE.getBasicTypes_BasicType();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl <em>CDC</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDC()
         * @generated
         */
        EClass CDC = eINSTANCE.getCDC();

        /**
         * The meta object literal for the '<em><b>Sub Data Object</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__SUB_DATA_OBJECT = eINSTANCE.getCDC_SubDataObject();

        /**
         * The meta object literal for the '<em><b>Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__DATA_ATTRIBUTE = eINSTANCE.getCDC_DataAttribute();

        /**
         * The meta object literal for the '<em><b>Service Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC__SERVICE_PARAMETER = eINSTANCE.getCDC_ServiceParameter();

        /**
         * The meta object literal for the '<em><b>Enum Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__ENUM_PARAMETERIZED = eINSTANCE.getCDC_EnumParameterized();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__NAME = eINSTANCE.getCDC_Name();

        /**
         * The meta object literal for the '<em><b>Statistics</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__STATISTICS = eINSTANCE.getCDC_Statistics();

        /**
         * The meta object literal for the '<em><b>Type Kind Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__TYPE_KIND_PARAMETERIZED = eINSTANCE.getCDC_TypeKindParameterized();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC__VARIANT = eINSTANCE.getCDC_Variant();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl <em>CD Cs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCDCs()
         * @generated
         */
        EClass CD_CS = eINSTANCE.getCDCs();

        /**
         * The meta object literal for the '<em><b>CDC</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CD_CS__CDC = eINSTANCE.getCDCs_CDC();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl <em>Changes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getChanges()
         * @generated
         */
        EClass CHANGES = eINSTANCE.getChanges();

        /**
         * The meta object literal for the '<em><b>Changes ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__CHANGES_ID = eINSTANCE.getChanges_ChangesID();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__DATE = eINSTANCE.getChanges_Date();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__RELEASE = eINSTANCE.getChanges_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__REVISION = eINSTANCE.getChanges_Revision();

        /**
         * The meta object literal for the '<em><b>Tissues</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__TISSUES = eINSTANCE.getChanges_Tissues();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__VERSION = eINSTANCE.getChanges_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl <em>Constructed Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttribute()
         * @generated
         */
        EClass CONSTRUCTED_ATTRIBUTE = eINSTANCE.getConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Sub Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE = eINSTANCE.getConstructedAttribute_SubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTRUCTED_ATTRIBUTE__NAME = eINSTANCE.getConstructedAttribute_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl <em>Constructed Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getConstructedAttributes()
         * @generated
         */
        EClass CONSTRUCTED_ATTRIBUTES = eINSTANCE.getConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Constructed Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getConstructedAttributes_ConstructedAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl <em>Copyrighted</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrighted()
         * @generated
         */
        EClass COPYRIGHTED = eINSTANCE.getCopyrighted();

        /**
         * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHTED__COPYRIGHT = eINSTANCE.getCopyrighted_Copyright();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl <em>Copyright Notice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCopyrightNotice()
         * @generated
         */
        EClass COPYRIGHT_NOTICE = eINSTANCE.getCopyrightNotice();

        /**
         * The meta object literal for the '<em><b>Notice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHT_NOTICE__NOTICE = eINSTANCE.getCopyrightNotice_Notice();

        /**
         * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COPYRIGHT_NOTICE__LICENSE = eINSTANCE.getCopyrightNotice_License();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl <em>Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataAttribute()
         * @generated
         */
        EClass DATA_ATTRIBUTE = eINSTANCE.getDataAttribute();

        /**
         * The meta object literal for the '<em><b>Dchg</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__DCHG = eINSTANCE.getDataAttribute_Dchg();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getDataAttribute_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Dupd</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__DUPD = eINSTANCE.getDataAttribute_Dupd();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__FC = eINSTANCE.getDataAttribute_Fc();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__IS_ARRAY = eINSTANCE.getDataAttribute_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = eINSTANCE.getDataAttribute_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__MAX_VALUE = eINSTANCE.getDataAttribute_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__MIN_INDEX = eINSTANCE.getDataAttribute_MinIndex();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__MIN_VALUE = eINSTANCE.getDataAttribute_MinValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__NAME = eINSTANCE.getDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__PRES_COND = eINSTANCE.getDataAttribute_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__PRES_COND_ARGS = eINSTANCE.getDataAttribute_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__PRES_COND_ARGS_ID = eINSTANCE.getDataAttribute_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Qchg</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__QCHG = eINSTANCE.getDataAttribute_Qchg();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__SIZE_ATTRIBUTE = eINSTANCE.getDataAttribute_SizeAttribute();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__TYPE = eINSTANCE.getDataAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ATTRIBUTE__TYPE_KIND = eINSTANCE.getDataAttribute_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl <em>Data Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataObject()
         * @generated
         */
        EClass DATA_OBJECT = eINSTANCE.getDataObject();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__DS_PRES_COND = eINSTANCE.getDataObject_DsPresCond();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__DS_PRES_COND_ARGS = eINSTANCE.getDataObject_DsPresCondArgs();

        /**
         * The meta object literal for the '<em><b>Ds Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__DS_PRES_COND_ARGS_ID = eINSTANCE.getDataObject_DsPresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__NAME = eINSTANCE.getDataObject_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__PRES_COND = eINSTANCE.getDataObject_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__PRES_COND_ARGS = eINSTANCE.getDataObject_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__PRES_COND_ARGS_ID = eINSTANCE.getDataObject_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__TRANSIENT = eINSTANCE.getDataObject_Transient();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__TYPE = eINSTANCE.getDataObject_Type();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__UNDERLYING_TYPE = eINSTANCE.getDataObject_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_OBJECT__UNDERLYING_TYPE_KIND = eINSTANCE.getDataObject_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl <em>Data Set Member Of</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDataSetMemberOf()
         * @generated
         */
        EClass DATA_SET_MEMBER_OF = eINSTANCE.getDataSetMemberOf();

        /**
         * The meta object literal for the '<em><b>Cb</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_MEMBER_OF__CB = eINSTANCE.getDataSetMemberOf_Cb();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl <em>Doc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDoc()
         * @generated
         */
        EClass DOC = eINSTANCE.getDoc();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__MIXED = eINSTANCE.getDoc_Mixed();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__GROUP = eINSTANCE.getDoc_Group();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__ANY = eINSTANCE.getDoc_Any();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOC__ID = eINSTANCE.getDoc_Id();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl <em>Documented Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocumentedClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDocumentedClass()
         * @generated
         */
        EClass DOCUMENTED_CLASS = eINSTANCE.getDocumentedClass();

        /**
         * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTED_CLASS__DEPRECATED = eINSTANCE.getDocumentedClass_Deprecated();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTED_CLASS__DESC_ID = eINSTANCE.getDocumentedClass_DescID();

        /**
         * The meta object literal for the '<em><b>Informative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTED_CLASS__INFORMATIVE = eINSTANCE.getDocumentedClass_Informative();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl <em>Enumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumeration()
         * @generated
         */
        EClass ENUMERATION = eINSTANCE.getEnumeration();

        /**
         * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

        /**
         * The meta object literal for the '<em><b>Inherited From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION__INHERITED_FROM = eINSTANCE.getEnumeration_InheritedFrom();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl <em>Enumerations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getEnumerations()
         * @generated
         */
        EClass ENUMERATIONS = eINSTANCE.getEnumerations();

        /**
         * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATIONS__ENUMERATION = eINSTANCE.getEnumerations_Enumeration();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl <em>Functional Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraint()
         * @generated
         */
        EClass FUNCTIONAL_CONSTRAINT = eINSTANCE.getFunctionalConstraint();

        /**
         * The meta object literal for the '<em><b>Applicable Services</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES = eINSTANCE.getFunctionalConstraint_ApplicableServices();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTIONAL_CONSTRAINT__ABBREVIATION = eINSTANCE.getFunctionalConstraint_Abbreviation();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTIONAL_CONSTRAINT__DESC_ID = eINSTANCE.getFunctionalConstraint_DescID();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTIONAL_CONSTRAINT__TITLE_ID = eINSTANCE.getFunctionalConstraint_TitleID();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl <em>Functional Constraints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getFunctionalConstraints()
         * @generated
         */
        EClass FUNCTIONAL_CONSTRAINTS = eINSTANCE.getFunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Functional Constraint</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT = eINSTANCE
                .getFunctionalConstraints_FunctionalConstraint();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl <em>License</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LicenseImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicense()
         * @generated
         */
        EClass LICENSE = eINSTANCE.getLicense();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LICENSE__MIXED = eINSTANCE.getLicense_Mixed();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LICENSE__KIND = eINSTANCE.getLicense_Kind();

        /**
         * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LICENSE__URI = eINSTANCE.getLicense_Uri();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl <em>Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LiteralImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLiteral()
         * @generated
         */
        EClass LITERAL = eINSTANCE.getLiteral();

        /**
         * The meta object literal for the '<em><b>Literal Val</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL__LITERAL_VAL = eINSTANCE.getLiteral_LiteralVal();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl <em>LN Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClass()
         * @generated
         */
        EClass LN_CLASS = eINSTANCE.getLNClass();

        /**
         * The meta object literal for the '<em><b>Can Have LOG</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LN_CLASS__CAN_HAVE_LOG = eINSTANCE.getLNClass_CanHaveLOG();

        /**
         * The meta object literal for the '<em><b>Is Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LN_CLASS__IS_EXTENSION = eINSTANCE.getLNClass_IsExtension();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LN_CLASS__NAME = eINSTANCE.getLNClass_Name();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl <em>LN Classes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLNClasses()
         * @generated
         */
        EClass LN_CLASSES = eINSTANCE.getLNClasses();

        /**
         * The meta object literal for the '<em><b>Abstract LN Class</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LN_CLASSES__ABSTRACT_LN_CLASS = eINSTANCE.getLNClasses_AbstractLNClass();

        /**
         * The meta object literal for the '<em><b>LN Class</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LN_CLASSES__LN_CLASS = eINSTANCE.getLNClasses_LNClass();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl <em>Notice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NoticeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNotice()
         * @generated
         */
        EClass NOTICE = eINSTANCE.getNotice();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTICE__MIXED = eINSTANCE.getNotice_Mixed();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl <em>NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNS()
         * @generated
         */
        EClass NS = eINSTANCE.getNS();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__CHANGES = eINSTANCE.getNS_Changes();

        /**
         * The meta object literal for the '<em><b>Depends On</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__DEPENDS_ON = eINSTANCE.getNS_DependsOn();

        /**
         * The meta object literal for the '<em><b>Basic Types</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__BASIC_TYPES = eINSTANCE.getNS_BasicTypes();

        /**
         * The meta object literal for the '<em><b>Functional Constraints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__FUNCTIONAL_CONSTRAINTS = eINSTANCE.getNS_FunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Presence Conditions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__PRESENCE_CONDITIONS = eINSTANCE.getNS_PresenceConditions();

        /**
         * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__ABBREVIATIONS = eINSTANCE.getNS_Abbreviations();

        /**
         * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__ENUMERATIONS = eINSTANCE.getNS_Enumerations();

        /**
         * The meta object literal for the '<em><b>Constructed Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__CONSTRUCTED_ATTRIBUTES = eINSTANCE.getNS_ConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>CD Cs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__CD_CS = eINSTANCE.getNS_CDCs();

        /**
         * The meta object literal for the '<em><b>LN Classes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS__LN_CLASSES = eINSTANCE.getNS_LNClasses();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__DESC_ID = eINSTANCE.getNS_DescID();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__ID = eINSTANCE.getNS_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__PUBLICATION_STAGE = eINSTANCE.getNS_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__RELEASE = eINSTANCE.getNS_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__REVISION = eINSTANCE.getNS_Revision();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__UML_DATE = eINSTANCE.getNS_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__UML_VERSION = eINSTANCE.getNS_UmlVersion();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS__VERSION = eINSTANCE.getNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl <em>NS Doc</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDocImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getNSDoc()
         * @generated
         */
        EClass NS_DOC = eINSTANCE.getNSDoc();

        /**
         * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NS_DOC__DOC = eINSTANCE.getNSDoc_Doc();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__ID = eINSTANCE.getNSDoc_Id();

        /**
         * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__LANG = eINSTANCE.getNSDoc_Lang();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__PUBLICATION_STAGE = eINSTANCE.getNSDoc_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__RELEASE = eINSTANCE.getNSDoc_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__REVISION = eINSTANCE.getNSDoc_Revision();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__UML_DATE = eINSTANCE.getNSDoc_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__UML_VERSION = eINSTANCE.getNSDoc_UmlVersion();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NS_DOC__VERSION = eINSTANCE.getNSDoc_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl <em>Presence Condition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceCondition()
         * @generated
         */
        EClass PRESENCE_CONDITION = eINSTANCE.getPresenceCondition();

        /**
         * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__ARGUMENT = eINSTANCE.getPresenceCondition_Argument();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__DESC_ID = eINSTANCE.getPresenceCondition_DescID();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__NAME = eINSTANCE.getPresenceCondition_Name();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENCE_CONDITION__TITLE_ID = eINSTANCE.getPresenceCondition_TitleID();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl <em>Presence Conditions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPresenceConditions()
         * @generated
         */
        EClass PRESENCE_CONDITIONS = eINSTANCE.getPresenceConditions();

        /**
         * The meta object literal for the '<em><b>Presence Condition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENCE_CONDITIONS__PRESENCE_CONDITION = eINSTANCE.getPresenceConditions_PresenceCondition();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl <em>Service CDC</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDC()
         * @generated
         */
        EClass SERVICE_CDC = eINSTANCE.getServiceCDC();

        /**
         * The meta object literal for the '<em><b>Service Data Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CDC__SERVICE_DATA_ATTRIBUTE = eINSTANCE.getServiceCDC_ServiceDataAttribute();

        /**
         * The meta object literal for the '<em><b>Cdc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_CDC__CDC = eINSTANCE.getServiceCDC_Cdc();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_CDC__VARIANT = eINSTANCE.getServiceCDC_Variant();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl <em>Service CD Cs</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceCDCs()
         * @generated
         */
        EClass SERVICE_CD_CS = eINSTANCE.getServiceCDCs();

        /**
         * The meta object literal for the '<em><b>Service CDC</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CD_CS__SERVICE_CDC = eINSTANCE.getServiceCDCs_ServiceCDC();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl <em>Service Constructed Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttribute()
         * @generated
         */
        EClass SERVICE_CONSTRUCTED_ATTRIBUTE = eINSTANCE.getServiceConstructedAttribute();

        /**
         * The meta object literal for the '<em><b>Type Kind Parameterized</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED = eINSTANCE
                .getServiceConstructedAttribute_TypeKindParameterized();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl <em>Service Constructed Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceConstructedAttributes()
         * @generated
         */
        EClass SERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE.getServiceConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Service Constructed Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE = eINSTANCE
                .getServiceConstructedAttributes_ServiceConstructedAttribute();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl <em>Service Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceDataAttribute()
         * @generated
         */
        EClass SERVICE_DATA_ATTRIBUTE = eINSTANCE.getServiceDataAttribute();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__FC = eINSTANCE.getServiceDataAttribute_Fc();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__NAME = eINSTANCE.getServiceDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__PRES_COND = eINSTANCE.getServiceDataAttribute_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS = eINSTANCE.getServiceDataAttribute_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = eINSTANCE.getServiceDataAttribute_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__TYPE = eINSTANCE.getServiceDataAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__TYPE_KIND = eINSTANCE.getServiceDataAttribute_TypeKind();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE = eINSTANCE.getServiceDataAttribute_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND = eINSTANCE
                .getServiceDataAttribute_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl <em>Service NS</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNS()
         * @generated
         */
        EClass SERVICE_NS = eINSTANCE.getServiceNS();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__CHANGES = eINSTANCE.getServiceNS_Changes();

        /**
         * The meta object literal for the '<em><b>Functional Constraints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__FUNCTIONAL_CONSTRAINTS = eINSTANCE.getServiceNS_FunctionalConstraints();

        /**
         * The meta object literal for the '<em><b>Presence Conditions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__PRESENCE_CONDITIONS = eINSTANCE.getServiceNS_PresenceConditions();

        /**
         * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__ABBREVIATIONS = eINSTANCE.getServiceNS_Abbreviations();

        /**
         * The meta object literal for the '<em><b>Service Type Realizations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__SERVICE_TYPE_REALIZATIONS = eINSTANCE.getServiceNS_ServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Service Constructed Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES = eINSTANCE.getServiceNS_ServiceConstructedAttributes();

        /**
         * The meta object literal for the '<em><b>Service CD Cs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS__SERVICE_CD_CS = eINSTANCE.getServiceNS_ServiceCDCs();

        /**
         * The meta object literal for the '<em><b>Desc ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__DESC_ID = eINSTANCE.getServiceNS_DescID();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__ID = eINSTANCE.getServiceNS_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__PUBLICATION_STAGE = eINSTANCE.getServiceNS_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__RELEASE = eINSTANCE.getServiceNS_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__REVISION = eINSTANCE.getServiceNS_Revision();

        /**
         * The meta object literal for the '<em><b>Uml Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__UML_DATE = eINSTANCE.getServiceNS_UmlDate();

        /**
         * The meta object literal for the '<em><b>Uml Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__UML_VERSION = eINSTANCE.getServiceNS_UmlVersion();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS__VERSION = eINSTANCE.getServiceNS_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl <em>Service Ns Usage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceNsUsage()
         * @generated
         */
        EClass SERVICE_NS_USAGE = eINSTANCE.getServiceNsUsage();

        /**
         * The meta object literal for the '<em><b>Applies To</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_NS_USAGE__APPLIES_TO = eINSTANCE.getServiceNsUsage_AppliesTo();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS_USAGE__ID = eINSTANCE.getServiceNsUsage_Id();

        /**
         * The meta object literal for the '<em><b>Publication Stage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS_USAGE__PUBLICATION_STAGE = eINSTANCE.getServiceNsUsage_PublicationStage();

        /**
         * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS_USAGE__RELEASE = eINSTANCE.getServiceNsUsage_Release();

        /**
         * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS_USAGE__REVISION = eINSTANCE.getServiceNsUsage_Revision();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_NS_USAGE__VERSION = eINSTANCE.getServiceNsUsage_Version();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceParameterImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceParameter()
         * @generated
         */
        EClass SERVICE_PARAMETER = eINSTANCE.getServiceParameter();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__DEFAULT_VALUE = eINSTANCE.getServiceParameter_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__MAX_VALUE = eINSTANCE.getServiceParameter_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__MIN_VALUE = eINSTANCE.getServiceParameter_MinValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__NAME = eINSTANCE.getServiceParameter_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__TYPE = eINSTANCE.getServiceParameter_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_PARAMETER__TYPE_KIND = eINSTANCE.getServiceParameter_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationImpl <em>Service Type Realization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceTypeRealization()
         * @generated
         */
        EClass SERVICE_TYPE_REALIZATION = eINSTANCE.getServiceTypeRealization();

        /**
         * The meta object literal for the '<em><b>Fc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__FC = eINSTANCE.getServiceTypeRealization_Fc();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__NAME = eINSTANCE.getServiceTypeRealization_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__PRES_COND = eINSTANCE.getServiceTypeRealization_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__PRES_COND_ARGS = eINSTANCE.getServiceTypeRealization_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__PRES_COND_ARGS_ID = eINSTANCE.getServiceTypeRealization_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__TYPE = eINSTANCE.getServiceTypeRealization_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_TYPE_REALIZATION__TYPE_KIND = eINSTANCE.getServiceTypeRealization_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl <em>Service Type Realizations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getServiceTypeRealizations()
         * @generated
         */
        EClass SERVICE_TYPE_REALIZATIONS = eINSTANCE.getServiceTypeRealizations();

        /**
         * The meta object literal for the '<em><b>Service Type Realization</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION = eINSTANCE
                .getServiceTypeRealizations_ServiceTypeRealization();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl <em>Sub Data Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataAttribute()
         * @generated
         */
        EClass SUB_DATA_ATTRIBUTE = eINSTANCE.getSubDataAttribute();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getSubDataAttribute_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__IS_ARRAY = eINSTANCE.getSubDataAttribute_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE = eINSTANCE.getSubDataAttribute_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__MAX_VALUE = eINSTANCE.getSubDataAttribute_MaxValue();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__MIN_INDEX = eINSTANCE.getSubDataAttribute_MinIndex();

        /**
         * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__MIN_VALUE = eINSTANCE.getSubDataAttribute_MinValue();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__NAME = eINSTANCE.getSubDataAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__PRES_COND = eINSTANCE.getSubDataAttribute_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__PRES_COND_ARGS = eINSTANCE.getSubDataAttribute_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID = eINSTANCE.getSubDataAttribute_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE = eINSTANCE.getSubDataAttribute_SizeAttribute();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__TYPE = eINSTANCE.getSubDataAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_ATTRIBUTE__TYPE_KIND = eINSTANCE.getSubDataAttribute_TypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl <em>Sub Data Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getSubDataObject()
         * @generated
         */
        EClass SUB_DATA_OBJECT = eINSTANCE.getSubDataObject();

        /**
         * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__IS_ARRAY = eINSTANCE.getSubDataObject_IsArray();

        /**
         * The meta object literal for the '<em><b>Max Index Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE = eINSTANCE.getSubDataObject_MaxIndexAttribute();

        /**
         * The meta object literal for the '<em><b>Min Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__MIN_INDEX = eINSTANCE.getSubDataObject_MinIndex();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__NAME = eINSTANCE.getSubDataObject_Name();

        /**
         * The meta object literal for the '<em><b>Pres Cond</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__PRES_COND = eINSTANCE.getSubDataObject_PresCond();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__PRES_COND_ARGS = eINSTANCE.getSubDataObject_PresCondArgs();

        /**
         * The meta object literal for the '<em><b>Pres Cond Args ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__PRES_COND_ARGS_ID = eINSTANCE.getSubDataObject_PresCondArgsID();

        /**
         * The meta object literal for the '<em><b>Size Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__SIZE_ATTRIBUTE = eINSTANCE.getSubDataObject_SizeAttribute();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__TYPE = eINSTANCE.getSubDataObject_Type();

        /**
         * The meta object literal for the '<em><b>Underlying Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__UNDERLYING_TYPE = eINSTANCE.getSubDataObject_UnderlyingType();

        /**
         * The meta object literal for the '<em><b>Underlying Type Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND = eINSTANCE.getSubDataObject_UnderlyingTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl <em>Titled Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TitledClassImpl
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getTitledClass()
         * @generated
         */
        EClass TITLED_CLASS = eINSTANCE.getTitledClass();

        /**
         * The meta object literal for the '<em><b>Title ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TITLED_CLASS__TITLE_ID = eINSTANCE.getTitledClass_TitleID();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind <em>ACSI Services Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKind()
         * @generated
         */
        EEnum ACSI_SERVICES_KIND = eINSTANCE.getACSIServicesKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind <em>CB Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKind()
         * @generated
         */
        EEnum CB_KIND = eINSTANCE.getCBKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind <em>Defined Attribute Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKind()
         * @generated
         */
        EEnum DEFINED_ATTRIBUTE_TYPE_KIND = eINSTANCE.getDefinedAttributeTypeKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind <em>License Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKind()
         * @generated
         */
        EEnum LICENSE_KIND = eINSTANCE.getLicenseKind();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage <em>Pub Stage</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStage()
         * @generated
         */
        EEnum PUB_STAGE = eINSTANCE.getPubStage();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind <em>Undefined Attribute Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKind()
         * @generated
         */
        EEnum UNDEFINED_ATTRIBUTE_TYPE_KIND = eINSTANCE.getUndefinedAttributeTypeKind();

        /**
         * The meta object literal for the '<em>ACSI Services Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getACSIServicesKindObject()
         * @generated
         */
        EDataType ACSI_SERVICES_KIND_OBJECT = eINSTANCE.getACSIServicesKindObject();

        /**
         * The meta object literal for the '<em>Attribute Type Kind</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.Enumerator
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getAttributeTypeKind()
         * @generated
         */
        EDataType ATTRIBUTE_TYPE_KIND = eINSTANCE.getAttributeTypeKind();

        /**
         * The meta object literal for the '<em>CB Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getCBKindObject()
         * @generated
         */
        EDataType CB_KIND_OBJECT = eINSTANCE.getCBKindObject();

        /**
         * The meta object literal for the '<em>Defined Attribute Type Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getDefinedAttributeTypeKindObject()
         * @generated
         */
        EDataType DEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = eINSTANCE.getDefinedAttributeTypeKindObject();

        /**
         * The meta object literal for the '<em>License Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.LicenseKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getLicenseKindObject()
         * @generated
         */
        EDataType LICENSE_KIND_OBJECT = eINSTANCE.getLicenseKindObject();

        /**
         * The meta object literal for the '<em>Pub Stage Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getPubStageObject()
         * @generated
         */
        EDataType PUB_STAGE_OBJECT = eINSTANCE.getPubStageObject();

        /**
         * The meta object literal for the '<em>Undefined Attribute Type Kind Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind
         * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NsdPackageImpl#getUndefinedAttributeTypeKindObject()
         * @generated
         */
        EDataType UNDEFINED_ATTRIBUTE_TYPE_KIND_OBJECT = eINSTANCE.getUndefinedAttributeTypeKindObject();

    }

} //NsdPackage
