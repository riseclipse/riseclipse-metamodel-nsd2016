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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgDependsOn;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDependencyType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

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
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Service Type'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_TYPE__NAME_ATTRIBUTE_REQUIRED = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Abbreviation'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ABBREVIATION__NAME_ATTRIBUTE_REQUIRED = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Abbreviation' of 'Abbreviations'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ABBREVIATIONS__UNIQUE_ABBREVIATION = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Abstract LN Class'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ABSTRACT_LN_CLASS__NAME_ATTRIBUTE_REQUIRED = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Data Object' of 'Any LN Class'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ANY_LN_CLASS__UNIQUE_DATA_OBJECT = 5;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version Attribute Required' of 'Applicable Service NS'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int APPLICABLE_SERVICE_NS__VERSION_ATTRIBUTE_REQUIRED = 6;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Date Attribute Required' of 'Applicable Service NS'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int APPLICABLE_SERVICE_NS__DATE_ATTRIBUTE_REQUIRED = 7;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Data Set Member Of' of 'Applicable Services'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int APPLICABLE_SERVICES__UNIQUE_DATA_SET_MEMBER_OF = 8;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Service' of 'Applicable Services'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int APPLICABLE_SERVICES__UNIQUE_SERVICE = 9;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Basic Type'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int BASIC_TYPE__NAME_ATTRIBUTE_REQUIRED = 10;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique CDC Child' of 'CDC'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CDC__UNIQUE_CDC_CHILD = 11;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'CDC'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CDC__NAME_ATTRIBUTE_REQUIRED = 12;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique CDC' of 'CD Cs'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CD_CS__UNIQUE_CDC = 13;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version Attribute Required' of 'Changes'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CHANGES__VERSION_ATTRIBUTE_REQUIRED = 14;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Sub Data Attribute' of 'Constructed Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CONSTRUCTED_ATTRIBUTE__UNIQUE_SUB_DATA_ATTRIBUTE = 15;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Constructed Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CONSTRUCTED_ATTRIBUTE__NAME_ATTRIBUTE_REQUIRED = 16;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Constructed Attribute' of 'Constructed Attributes'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CONSTRUCTED_ATTRIBUTES__UNIQUE_CONSTRUCTED_ATTRIBUTE = 17;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Data Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int DATA_ATTRIBUTE__NAME_ATTRIBUTE_REQUIRED = 18;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fc Attribute Required' of 'Data Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int DATA_ATTRIBUTE__FC_ATTRIBUTE_REQUIRED = 19;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Data Object'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int DATA_OBJECT__NAME_ATTRIBUTE_REQUIRED = 20;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Attribute Required' of 'Data Object'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int DATA_OBJECT__TYPE_ATTRIBUTE_REQUIRED = 21;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cb Attribute Required' of 'Data Set Member Of'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int DATA_SET_MEMBER_OF__CB_ATTRIBUTE_REQUIRED = 22;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Attribute Required' of 'Doc'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int DOC__ID_ATTRIBUTE_REQUIRED = 23;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Literal Name' of 'Enumeration'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ENUMERATION__UNIQUE_LITERAL_NAME = 24;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Literal Val' of 'Enumeration'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ENUMERATION__UNIQUE_LITERAL_VAL = 25;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Enumeration'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ENUMERATION__NAME_ATTRIBUTE_REQUIRED = 26;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Enumeration' of 'Enumerations'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ENUMERATIONS__UNIQUE_ENUMERATION = 27;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Abbreviation Attribute Required' of 'Functional Constraint'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int FUNCTIONAL_CONSTRAINT__ABBREVIATION_ATTRIBUTE_REQUIRED = 28;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Functional Constraint' of 'Functional Constraints'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int FUNCTIONAL_CONSTRAINTS__UNIQUE_FUNCTIONAL_CONSTRAINT = 29;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Literal'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int LITERAL__NAME_ATTRIBUTE_REQUIRED = 30;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Literal Val Attribute Required' of 'Literal'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int LITERAL__LITERAL_VAL_ATTRIBUTE_REQUIRED = 31;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'LN Class'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int LN_CLASS__NAME_ATTRIBUTE_REQUIRED = 32;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique LN Class' of 'LN Classes'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int LN_CLASSES__UNIQUE_LN_CLASS = 33;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Abstract LN Class' of 'LN Classes'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int LN_CLASSES__UNIQUE_ABSTRACT_LN_CLASS = 34;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lang Attribute Required' of 'NS Doc'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int NS_DOC__LANG_ATTRIBUTE_REQUIRED = 35;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Presence Condition'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int PRESENCE_CONDITION__NAME_ATTRIBUTE_REQUIRED = 36;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Presence Condition' of 'Presence Conditions'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int PRESENCE_CONDITIONS__UNIQUE_PRESENCE_CONDITION = 37;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cdc Attribute Required' of 'Service CDC'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_CDC__CDC_ATTRIBUTE_REQUIRED = 38;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Service Data Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_DATA_ATTRIBUTE__NAME_ATTRIBUTE_REQUIRED = 39;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fc Attribute Required' of 'Service Data Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_DATA_ATTRIBUTE__FC_ATTRIBUTE_REQUIRED = 40;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Attribute Required' of 'Service Ns Usage'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_NS_USAGE__ID_ATTRIBUTE_REQUIRED = 41;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version Attribute Required' of 'Service Ns Usage'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_NS_USAGE__VERSION_ATTRIBUTE_REQUIRED = 42;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Service Parameter'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_PARAMETER__NAME_ATTRIBUTE_REQUIRED = 43;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Realize Attribute Required' of 'Service Type Realization'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SERVICE_TYPE_REALIZATION__REALIZE_ATTRIBUTE_REQUIRED = 44;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Sub Data Attribute'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SUB_DATA_ATTRIBUTE__NAME_ATTRIBUTE_REQUIRED = 45;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Attribute Required' of 'Sub Data Object'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SUB_DATA_OBJECT__NAME_ATTRIBUTE_REQUIRED = 46;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Attribute Required' of 'Sub Data Object'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SUB_DATA_OBJECT__TYPE_ATTRIBUTE_REQUIRED = 47;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Title ID Attribute Required' of 'Titled Class'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int TITLED_CLASS__TITLE_ID_ATTRIBUTE_REQUIRED = 48;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Attribute Required' of 'Ag NS Identification'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int AG_NS_IDENTIFICATION__ID_ATTRIBUTE_REQUIRED = 49;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version Attribute Required' of 'Ag NS Identification'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int AG_NS_IDENTIFICATION__VERSION_ATTRIBUTE_REQUIRED = 50;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Attribute Required' of 'Ag Depends On'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int AG_DEPENDS_ON__ID_ATTRIBUTE_REQUIRED = 51;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version Attribute Required' of 'Ag Depends On'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int AG_DEPENDS_ON__VERSION_ATTRIBUTE_REQUIRED = 52;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 52;

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
        case NsdPackage.SERVICE_TYPE_REALIZATION:
            return validateServiceTypeRealization( ( ServiceTypeRealization ) value, diagnostics, context );
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
        case NsdPackage.AG_NSD_IDENTIFICATION:
            return validateAgNSDIdentification( ( AgNSDIdentification ) value, diagnostics, context );
        case NsdPackage.AG_DEPENDS_ON:
            return validateAgDependsOn( ( AgDependsOn ) value, diagnostics, context );
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
        case NsdPackage.NS_TYPE:
            return validateNSType( ( NSType ) value, diagnostics, context );
        case NsdPackage.NS_DEPENDENCY_TYPE:
            return validateNSDependencyType( ( NSDependencyType ) value, diagnostics, context );
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
        if( !validate_NoCircularContainment( appliesToType, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( appliesToType, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_versionAttributeRequired( appliesToType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_idAttributeRequired( appliesToType, diagnostics, context );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDependsOn( DependsOn dependsOn, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( dependsOn, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( dependsOn, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgDependsOn_versionAttributeRequired( dependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgDependsOn_idAttributeRequired( dependsOn, diagnostics, context );
        }
        return result;
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
        if( !validate_NoCircularContainment( serviceType, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceType, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceType_nameAttributeRequired( serviceType, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Service Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceType_nameAttributeRequired( ServiceType serviceType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return serviceType.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviation( Abbreviation abbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( abbreviation, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( abbreviation, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( abbreviation, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAbbreviation_nameAttributeRequired( abbreviation, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Abbreviation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviation_nameAttributeRequired( Abbreviation abbreviation, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return abbreviation.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviations( Abbreviations abbreviations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( abbreviations, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( abbreviations, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( abbreviations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAbbreviations_uniqueAbbreviation( abbreviations, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueAbbreviation constraint of '<em>Abbreviations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbbreviations_uniqueAbbreviation( Abbreviations abbreviations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return abbreviations.uniqueAbbreviation( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbstractLNClass( AbstractLNClass abstractLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( abstractLNClass, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( abstractLNClass, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAnyLNClass_uniqueDataObject( abstractLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAbstractLNClass_nameAttributeRequired( abstractLNClass, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Abstract LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbstractLNClass_nameAttributeRequired( AbstractLNClass abstractLNClass,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return abstractLNClass.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAnyLNClass( AnyLNClass anyLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( anyLNClass, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( anyLNClass, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( anyLNClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAnyLNClass_uniqueDataObject( anyLNClass, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueDataObject constraint of '<em>Any LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAnyLNClass_uniqueDataObject( AnyLNClass anyLNClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return anyLNClass.uniqueDataObject( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServiceNS( ApplicableServiceNS applicableServiceNS, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( applicableServiceNS, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( applicableServiceNS, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateApplicableServiceNS_dateAttributeRequired( applicableServiceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateApplicableServiceNS_versionAttributeRequired( applicableServiceNS, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the versionAttributeRequired constraint of '<em>Applicable Service NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServiceNS_versionAttributeRequired( ApplicableServiceNS applicableServiceNS,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return applicableServiceNS.versionAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the dateAttributeRequired constraint of '<em>Applicable Service NS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServiceNS_dateAttributeRequired( ApplicableServiceNS applicableServiceNS,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return applicableServiceNS.dateAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServices( ApplicableServices applicableServices, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( applicableServices, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( applicableServices, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateApplicableServices_uniqueService( applicableServices, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateApplicableServices_uniqueDataSetMemberOf( applicableServices, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueDataSetMemberOf constraint of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServices_uniqueDataSetMemberOf( ApplicableServices applicableServices,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return applicableServices.uniqueDataSetMemberOf( diagnostics, context );
    }

    /**
     * Validates the uniqueService constraint of '<em>Applicable Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateApplicableServices_uniqueService( ApplicableServices applicableServices,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return applicableServices.uniqueService( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicType( BasicType basicType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( basicType, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( basicType, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( basicType, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateBasicType_nameAttributeRequired( basicType, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Basic Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicType_nameAttributeRequired( BasicType basicType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return basicType.nameAttributeRequired( diagnostics, context );
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
        if( !validate_NoCircularContainment( cdc, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( cdc, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateCDC_nameAttributeRequired( cdc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateCDC_uniqueCDCChild( cdc, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueCDCChild constraint of '<em>CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDC_uniqueCDCChild( CDC cdc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return cdc.uniqueCDCChild( diagnostics, context );
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDC_nameAttributeRequired( CDC cdc, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return cdc.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCs( CDCs cdCs, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( cdCs, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( cdCs, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( cdCs, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateCDCs_uniqueCDC( cdCs, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueCDC constraint of '<em>CD Cs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCDCs_uniqueCDC( CDCs cdCs, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return cdCs.uniqueCDC( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateChanges( Changes changes, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( changes, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( changes, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( changes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateChanges_versionAttributeRequired( changes, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the versionAttributeRequired constraint of '<em>Changes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateChanges_versionAttributeRequired( Changes changes, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return changes.versionAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttribute( ConstructedAttribute constructedAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( constructedAttribute, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( constructedAttribute, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttribute_nameAttributeRequired( constructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttribute_uniqueSubDataAttribute( constructedAttribute, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueSubDataAttribute constraint of '<em>Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttribute_uniqueSubDataAttribute( ConstructedAttribute constructedAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return constructedAttribute.uniqueSubDataAttribute( diagnostics, context );
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Constructed Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttribute_nameAttributeRequired( ConstructedAttribute constructedAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return constructedAttribute.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttributes( ConstructedAttributes constructedAttributes,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( constructedAttributes, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( constructedAttributes, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( constructedAttributes, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttributes_uniqueConstructedAttribute( constructedAttributes, diagnostics,
                    context );
        }
        return result;
    }

    /**
     * Validates the uniqueConstructedAttribute constraint of '<em>Constructed Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstructedAttributes_uniqueConstructedAttribute(
            ConstructedAttributes constructedAttributes, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return constructedAttributes.uniqueConstructedAttribute( diagnostics, context );
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
        if( !validate_NoCircularContainment( dataAttribute, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( dataAttribute, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateDataAttribute_fcAttributeRequired( dataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateDataAttribute_nameAttributeRequired( dataAttribute, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataAttribute_nameAttributeRequired( DataAttribute dataAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return dataAttribute.nameAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the fcAttributeRequired constraint of '<em>Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataAttribute_fcAttributeRequired( DataAttribute dataAttribute, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return dataAttribute.fcAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataObject( DataObject dataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( dataObject, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( dataObject, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateDataObject_typeAttributeRequired( dataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateDataObject_nameAttributeRequired( dataObject, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataObject_nameAttributeRequired( DataObject dataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return dataObject.nameAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the typeAttributeRequired constraint of '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataObject_typeAttributeRequired( DataObject dataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return dataObject.typeAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataSetMemberOf( DataSetMemberOf dataSetMemberOf, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( dataSetMemberOf, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( dataSetMemberOf, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( dataSetMemberOf, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateDataSetMemberOf_cbAttributeRequired( dataSetMemberOf, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the cbAttributeRequired constraint of '<em>Data Set Member Of</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataSetMemberOf_cbAttributeRequired( DataSetMemberOf dataSetMemberOf,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return dataSetMemberOf.cbAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDoc( Doc doc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( doc, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( doc, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( doc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateDoc_idAttributeRequired( doc, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the idAttributeRequired constraint of '<em>Doc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDoc_idAttributeRequired( Doc doc, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return doc.idAttributeRequired( diagnostics, context );
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
        if( !validate_NoCircularContainment( enumeration, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( enumeration, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateEnumeration_nameAttributeRequired( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateEnumeration_uniqueLiteralName( enumeration, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateEnumeration_uniqueLiteralVal( enumeration, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueLiteralName constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumeration_uniqueLiteralName( Enumeration enumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return enumeration.uniqueLiteralName( diagnostics, context );
    }

    /**
     * Validates the uniqueLiteralVal constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumeration_uniqueLiteralVal( Enumeration enumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return enumeration.uniqueLiteralVal( diagnostics, context );
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumeration_nameAttributeRequired( Enumeration enumeration, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return enumeration.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumerations( Enumerations enumerations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( enumerations, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( enumerations, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( enumerations, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateEnumerations_uniqueEnumeration( enumerations, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueEnumeration constraint of '<em>Enumerations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEnumerations_uniqueEnumeration( Enumerations enumerations, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return enumerations.uniqueEnumeration( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraint( FunctionalConstraint functionalConstraint, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( functionalConstraint, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( functionalConstraint, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( functionalConstraint, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateFunctionalConstraint_abbreviationAttributeRequired( functionalConstraint, diagnostics,
                    context );
        }
        return result;
    }

    /**
     * Validates the abbreviationAttributeRequired constraint of '<em>Functional Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraint_abbreviationAttributeRequired(
            FunctionalConstraint functionalConstraint, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return functionalConstraint.abbreviationAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraints( FunctionalConstraints functionalConstraints,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( functionalConstraints, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( functionalConstraints, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( functionalConstraints, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateFunctionalConstraints_uniqueFunctionalConstraint( functionalConstraints, diagnostics,
                    context );
        }
        return result;
    }

    /**
     * Validates the uniqueFunctionalConstraint constraint of '<em>Functional Constraints</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFunctionalConstraints_uniqueFunctionalConstraint(
            FunctionalConstraints functionalConstraints, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return functionalConstraints.uniqueFunctionalConstraint( diagnostics, context );
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
        if( !validate_NoCircularContainment( literal, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( literal, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateLiteral_literalValAttributeRequired( literal, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateLiteral_nameAttributeRequired( literal, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteral_nameAttributeRequired( Literal literal, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return literal.nameAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the literalValAttributeRequired constraint of '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteral_literalValAttributeRequired( Literal literal, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return literal.literalValAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClass( LNClass lnClass, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( lnClass, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( lnClass, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAnyLNClass_uniqueDataObject( lnClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateLNClass_nameAttributeRequired( lnClass, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>LN Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClass_nameAttributeRequired( LNClass lnClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return lnClass.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( lnClasses, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( lnClasses, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateLNClasses_uniqueAbstractLNClass( lnClasses, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateLNClasses_uniqueLNClass( lnClasses, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniqueAbstractLNClass constraint of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses_uniqueAbstractLNClass( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return lnClasses.uniqueAbstractLNClass( diagnostics, context );
    }

    /**
     * Validates the uniqueLNClass constraint of '<em>LN Classes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLNClasses_uniqueLNClass( LNClasses lnClasses, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return lnClasses.uniqueLNClass( diagnostics, context );
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
        if( !validate_NoCircularContainment( ns, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( ns, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_versionAttributeRequired( ns, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_idAttributeRequired( ns, diagnostics, context );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSDoc( NSDoc nsDoc, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( nsDoc, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( nsDoc, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_versionAttributeRequired( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_idAttributeRequired( nsDoc, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateNSDoc_langAttributeRequired( nsDoc, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the langAttributeRequired constraint of '<em>NS Doc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSDoc_langAttributeRequired( NSDoc nsDoc, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return nsDoc.langAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceCondition( PresenceCondition presenceCondition, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( presenceCondition, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( presenceCondition, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( presenceCondition, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validatePresenceCondition_nameAttributeRequired( presenceCondition, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Presence Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceCondition_nameAttributeRequired( PresenceCondition presenceCondition,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return presenceCondition.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceConditions( PresenceConditions presenceConditions, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( presenceConditions, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( presenceConditions, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( presenceConditions, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validatePresenceConditions_uniquePresenceCondition( presenceConditions, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the uniquePresenceCondition constraint of '<em>Presence Conditions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePresenceConditions_uniquePresenceCondition( PresenceConditions presenceConditions,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return presenceConditions.uniquePresenceCondition( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceCDC( ServiceCDC serviceCDC, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( serviceCDC, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceCDC, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceCDC, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceCDC_cdcAttributeRequired( serviceCDC, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the cdcAttributeRequired constraint of '<em>Service CDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceCDC_cdcAttributeRequired( ServiceCDC serviceCDC, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return serviceCDC.cdcAttributeRequired( diagnostics, context );
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
        if( !validate_NoCircularContainment( serviceConstructedAttribute, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceConstructedAttribute, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( serviceConstructedAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttribute_nameAttributeRequired( serviceConstructedAttribute, diagnostics,
                    context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttribute_uniqueSubDataAttribute( serviceConstructedAttribute, diagnostics,
                    context );
        }
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
        if( !validate_NoCircularContainment( serviceDataAttribute, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceDataAttribute, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceDataAttribute_fcAttributeRequired( serviceDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceDataAttribute_nameAttributeRequired( serviceDataAttribute, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Service Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceDataAttribute_nameAttributeRequired( ServiceDataAttribute serviceDataAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return serviceDataAttribute.nameAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the fcAttributeRequired constraint of '<em>Service Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceDataAttribute_fcAttributeRequired( ServiceDataAttribute serviceDataAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return serviceDataAttribute.fcAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceNS( ServiceNS serviceNS, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( serviceNS, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceNS, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_versionAttributeRequired( serviceNS, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_idAttributeRequired( serviceNS, diagnostics, context );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceNsUsage( ServiceNsUsage serviceNsUsage, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( serviceNsUsage, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceNsUsage, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceNsUsage_versionAttributeRequired( serviceNsUsage, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceNsUsage_idAttributeRequired( serviceNsUsage, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the versionAttributeRequired constraint of '<em>Service Ns Usage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceNsUsage_versionAttributeRequired( ServiceNsUsage serviceNsUsage,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return serviceNsUsage.versionAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the idAttributeRequired constraint of '<em>Service Ns Usage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceNsUsage_idAttributeRequired( ServiceNsUsage serviceNsUsage,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return serviceNsUsage.idAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceParameter( ServiceParameter serviceParameter, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( serviceParameter, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceParameter, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceParameter, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceParameter_nameAttributeRequired( serviceParameter, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Service Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceParameter_nameAttributeRequired( ServiceParameter serviceParameter,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return serviceParameter.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceTypeRealization( ServiceTypeRealization serviceTypeRealization,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( serviceTypeRealization, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( serviceTypeRealization, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( serviceTypeRealization, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttribute_nameAttributeRequired( serviceTypeRealization, diagnostics,
                    context );
        }
        if( result || diagnostics != null ) {
            result &= validateConstructedAttribute_uniqueSubDataAttribute( serviceTypeRealization, diagnostics,
                    context );
        }
        if( result || diagnostics != null ) {
            result &= validateServiceTypeRealization_realizeAttributeRequired( serviceTypeRealization, diagnostics,
                    context );
        }
        return result;
    }

    /**
     * Validates the realizeAttributeRequired constraint of '<em>Service Type Realization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateServiceTypeRealization_realizeAttributeRequired(
            ServiceTypeRealization serviceTypeRealization, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return serviceTypeRealization.realizeAttributeRequired( diagnostics, context );
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
        if( !validate_NoCircularContainment( subDataAttribute, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( subDataAttribute, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( subDataAttribute, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateSubDataAttribute_nameAttributeRequired( subDataAttribute, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Sub Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataAttribute_nameAttributeRequired( SubDataAttribute subDataAttribute,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return subDataAttribute.nameAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataObject( SubDataObject subDataObject, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( subDataObject, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( subDataObject, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateSubDataObject_typeAttributeRequired( subDataObject, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateSubDataObject_nameAttributeRequired( subDataObject, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the nameAttributeRequired constraint of '<em>Sub Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataObject_nameAttributeRequired( SubDataObject subDataObject,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return subDataObject.nameAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the typeAttributeRequired constraint of '<em>Sub Data Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSubDataObject_typeAttributeRequired( SubDataObject subDataObject,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return subDataObject.typeAttributeRequired( diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTitledClass( TitledClass titledClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( titledClass, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( titledClass, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( titledClass, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateTitledClass_titleIDAttributeRequired( titledClass, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the titleIDAttributeRequired constraint of '<em>Titled Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTitledClass_titleIDAttributeRequired( TitledClass titledClass, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return titledClass.titleIDAttributeRequired( diagnostics, context );
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
        if( !validate_NoCircularContainment( agNSIdentification, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( agNSIdentification, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_versionAttributeRequired( agNSIdentification, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgNSIdentification_idAttributeRequired( agNSIdentification, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the idAttributeRequired constraint of '<em>Ag NS Identification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgNSIdentification_idAttributeRequired( AgNSIdentification agNSIdentification,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return agNSIdentification.idAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the versionAttributeRequired constraint of '<em>Ag NS Identification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgNSIdentification_versionAttributeRequired( AgNSIdentification agNSIdentification,
            DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return agNSIdentification.versionAttributeRequired( diagnostics, context );
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
    public boolean validateAgNSDIdentification( AgNSDIdentification agNSDIdentification, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return validate_EveryDefaultConstraint( agNSDIdentification, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgDependsOn( AgDependsOn agDependsOn, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        if( !validate_NoCircularContainment( agDependsOn, diagnostics, context ) ) {
            return false;
        }
        boolean result = validate_EveryMultiplicityConforms( agDependsOn, diagnostics, context );
        if( result || diagnostics != null ) {
            result &= validate_EveryDataValueConforms( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryReferenceIsContained( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryBidirectionalReferenceIsPaired( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryProxyResolves( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_UniqueID( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryKeyUnique( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validate_EveryMapEntryUnique( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgDependsOn_versionAttributeRequired( agDependsOn, diagnostics, context );
        }
        if( result || diagnostics != null ) {
            result &= validateAgDependsOn_idAttributeRequired( agDependsOn, diagnostics, context );
        }
        return result;
    }

    /**
     * Validates the versionAttributeRequired constraint of '<em>Ag Depends On</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgDependsOn_versionAttributeRequired( AgDependsOn agDependsOn, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return agDependsOn.versionAttributeRequired( diagnostics, context );
    }

    /**
     * Validates the idAttributeRequired constraint of '<em>Ag Depends On</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAgDependsOn_idAttributeRequired( AgDependsOn agDependsOn, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
        return agDependsOn.idAttributeRequired( diagnostics, context );
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
    public boolean validateNSType( NSType nsType, DiagnosticChain diagnostics, Map< Object, Object > context ) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNSDependencyType( NSDependencyType nsDependencyType, DiagnosticChain diagnostics,
            Map< Object, Object > context ) {
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
                        context ) ) {
                    return true;
                }
            }
            if( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateUndefinedAttributeTypeKind( ( UndefinedAttributeTypeKind ) attributeTypeKind,
                        tempDiagnostics, context ) ) {
                    return true;
                }
            }
            for( Diagnostic diagnostic : tempDiagnostics.getChildren() ) {
                diagnostics.add( diagnostic );
            }
        }
        else {
            if( NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateDefinedAttributeTypeKind( ( DefinedAttributeTypeKind ) attributeTypeKind, null, context ) ) {
                    return true;
                }
            }
            if( NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND.isInstance( attributeTypeKind ) ) {
                if( validateUndefinedAttributeTypeKind( ( UndefinedAttributeTypeKind ) attributeTypeKind, null,
                        context ) ) {
                    return true;
                }
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
