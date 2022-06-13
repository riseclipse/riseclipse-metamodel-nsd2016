/*******************************************************************************
 *  Copyright (c) 2016-2021 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /fr.centralesupelec.edf.riseclipse.iec61850.nsd/model/nsd.ecore
 * using:
 *   /fr.centralesupelec.edf.riseclipse.iec61850.nsd/model/nsd.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd;

// import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
// import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.MapTypeId;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * NsdTables provides the dispatch tables for the nsd for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class NsdTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(NsdPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2003/XMLType", null, XMLTypePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD = IdManager.getNsURIPackageId("http://www.iec.ch/61850/2016/NSD", null, NsdPackage.eINSTANCE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_PRIMid_String = TypeId.BAG.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ ClassId CLSSid_Abbreviation = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Abbreviation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Abbreviations = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Abbreviations", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AbstractLNClass = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AbstractLNClass", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AgAttributeType = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AgAttributeType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AgNSIdentification = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AgNSIdentification", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AgNSdesc = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AgNSdesc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AgPresenceCondition = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AgPresenceCondition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AgPresenceConditionDerivedStatistics = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AgPresenceConditionDerivedStatistics", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AgUnderlyingType = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AgUnderlyingType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AnyLNClass = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AnyLNClass", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ApplicableServiceNS = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ApplicableServiceNS", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ApplicableServices = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ApplicableServices", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AppliesToType = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("AppliesToType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BasicType = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("BasicType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BasicTypes = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("BasicTypes", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CDC = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("CDC", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CDCs = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("CDCs", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Changes = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Changes", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConstructedAttribute = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ConstructedAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConstructedAttributes = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ConstructedAttributes", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CopyrightNotice = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("CopyrightNotice", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Copyrighted = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Copyrighted", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DataAttribute = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("DataAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DataObject = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("DataObject", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DataSetMemberOf = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("DataSetMemberOf", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DependsOn = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("DependsOn", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Doc = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Doc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DocumentRoot = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("DocumentRoot", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DocumentedClass = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("DocumentedClass", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enumeration = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Enumeration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enumerations = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Enumerations", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FunctionalConstraint = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("FunctionalConstraint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FunctionalConstraints = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("FunctionalConstraints", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LNClass = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("LNClass", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LNClasses = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("LNClasses", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_License = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("License", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Literal = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Literal", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NS = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("NS", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NSDoc = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("NSDoc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Notice = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("Notice", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PresenceCondition = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("PresenceCondition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PresenceConditions = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("PresenceConditions", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceCDC = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceCDC", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceCDCs = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceCDCs", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceConstructedAttribute = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceConstructedAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceConstructedAttributes = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceConstructedAttributes", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceDataAttribute = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceDataAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceNS = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceNS", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceNsUsage = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceNsUsage", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceParameter = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceParameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceType = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ServiceTypeRealizations = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("ServiceTypeRealizations", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SubDataAttribute = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("SubDataAttribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SubDataObject = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("SubDataObject", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TitledClass = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getClassId("TitledClass", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_AttributeTypeKind = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getDataTypeId("AttributeTypeKind", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Date = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Date", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_DateTime = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("DateTime", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Decimal = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Decimal", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFeatureMapEntry = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFeatureMapEntry", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EIntegerObject = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EIntegerObject", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Int = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Int", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Language = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Language", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_NormalizedString = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("NormalizedString", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Token = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Token", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_UnsignedInt = NsdTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("UnsignedInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ACSIServicesKind = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getEnumerationId("ACSIServicesKind");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CBKind = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getEnumerationId("CBKind");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DefinedAttributeTypeKind = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getEnumerationId("DefinedAttributeTypeKind");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LicenseKind = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getEnumerationId("LicenseKind");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PubStage = NsdTables.PACKid_http_c_s_s_www_iec_ch_s_61850_s_2016_s_NSD.getEnumerationId("PubStage");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ MapTypeId MAP_PRIMid_StringPRIMid_String = TypeId.MAP.getSpecializedId(TypeId.STRING, TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ String STR_For_32_a_32_CDC_44_32_there_32_shall_32_not_32_be_32_two_32_sub_m_elements_32_o_SubDataObject_32_or = "For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.";
	public static final /*@NonInvalid*/ String STR_For_32_a_32_ConstructedAttribute_44_32_there_32_shall_32_not_32_be_32_two_32_SubDataAttrib = "For a ConstructedAttribute, there shall not be two SubDataAttribute sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_For_32_an_32_AnyLNClass_44_32_there_32_shall_32_not_32_be_32_two_32_DataObject_32_sub_m_element = "For an AnyLNClass, there shall not be two DataObject sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_For_32_an_32_ApplicableServices_44_32_there_32_shall_32_not_32_be_32_two_32_DataSetMemberO = "For an ApplicableServices, there shall not be two DataSetMemberOf sub-elements with same cb.";
	public static final /*@NonInvalid*/ String STR_For_32_an_32_ApplicableServices_44_32_there_32_shall_32_not_32_be_32_two_32_ServiceType_32_su = "For an ApplicableServices, there shall not be two ServiceType sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_For_32_an_32_Enumeration_44_32_there_32_shall_32_not_32_be_32_two_32_Literal_32_sub_m_elements_32 = "For an Enumeration, there shall not be two Literal sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_For_32_an_32_Enumeration_44_32_there_32_shall_32_not_32_be_32_two_32_Literal_32_sub_m_elements_32_0 = "For an Enumeration, there shall not be two Literal sub-elements with same literalVal.";
	public static final /*@NonInvalid*/ String STR_The_32_abbreviation_32_attribute_32_is_32_required = "The abbreviation attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_cb_32_attribute_32_is_32_required = "The cb attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_date_32_attribute_32_is_32_required = "The date attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_fc_32_attribute_32_is_32_required = "The fc attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_id_32_attribute_32_is_32_required = "The id attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_lang_32_attribute_32_is_32_required = "The lang attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_name_32_attribute_32_is_32_required = "The name attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_titleID_32_attribute_32_is_32_required = "The titleID attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_type_32_attribute_32_is_32_required = "The type attribute is required";
	public static final /*@NonInvalid*/ String STR_The_32_version_32_attribute_32_is_32_required = "The version attribute is required";
	public static final /*@NonInvalid*/ String STR_There_32_shall_32_not_32_be_32_two_32_Abbreviations_32_elements_32_with_32_same_32_name = "There shall not be two Abbreviations elements with same name.";
	public static final /*@NonInvalid*/ String STR_There_32_shall_32_not_32_be_32_two_32_FunctionalConstraint_32_elements_32_with_32_same_32_a = "There shall not be two FunctionalConstraint elements with same abbreviation.";
	public static final /*@NonInvalid*/ String STR_There_32_shall_32_not_32_be_32_two_32_PresenceCondition_32_elements_32_with_32_same_32_name = "There shall not be two PresenceCondition elements with same name.";
	public static final /*@NonInvalid*/ String STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_AbstractLNClass_32_sub_m_element = "Within an NS, there shall not be two AbstractLNClass sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_CDC_32_sub_m_elements_32_with_32_same_32 = "Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.";
	public static final /*@NonInvalid*/ String STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_ConstructedAttribute_32_sub_m_el = "Within an NS, there shall not be two ConstructedAttribute sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_Enumeration_32_sub_m_elements_32_wi = "Within an NS, there shall not be two Enumeration sub-elements with same name.";
	public static final /*@NonInvalid*/ String STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_LNClass_32_sub_m_elements_32_with_32_s = "Within an NS, there shall not be two LNClass sub-elements with same name.";
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enumeration = TypeId.ORDERED_SET.getSpecializedId(NsdTables.CLSSid_Enumeration);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EFeatureMapEntry = TypeId.SEQUENCE.getSpecializedId(NsdTables.DATAid_EFeatureMapEntry);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Abbreviation = TypeId.SET.getSpecializedId(NsdTables.CLSSid_Abbreviation);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AbstractLNClass = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AbstractLNClass);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AgAttributeType = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AgAttributeType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AgNSdesc = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AgNSdesc);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AgPresenceCondition = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AgPresenceCondition);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AgPresenceConditionDerivedStatistics = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AgPresenceConditionDerivedStatistics);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AgUnderlyingType = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AgUnderlyingType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AnyLNClass = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AnyLNClass);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AppliesToType = TypeId.SET.getSpecializedId(NsdTables.CLSSid_AppliesToType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_BasicType = TypeId.SET.getSpecializedId(NsdTables.CLSSid_BasicType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_CDC = TypeId.SET.getSpecializedId(NsdTables.CLSSid_CDC);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ConstructedAttribute = TypeId.SET.getSpecializedId(NsdTables.CLSSid_ConstructedAttribute);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DataAttribute = TypeId.SET.getSpecializedId(NsdTables.CLSSid_DataAttribute);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DataObject = TypeId.SET.getSpecializedId(NsdTables.CLSSid_DataObject);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DataSetMemberOf = TypeId.SET.getSpecializedId(NsdTables.CLSSid_DataSetMemberOf);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DependsOn = TypeId.SET.getSpecializedId(NsdTables.CLSSid_DependsOn);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Doc = TypeId.SET.getSpecializedId(NsdTables.CLSSid_Doc);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DocumentedClass = TypeId.SET.getSpecializedId(NsdTables.CLSSid_DocumentedClass);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Enumeration = TypeId.SET.getSpecializedId(NsdTables.CLSSid_Enumeration);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_FunctionalConstraint = TypeId.SET.getSpecializedId(NsdTables.CLSSid_FunctionalConstraint);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_LNClass = TypeId.SET.getSpecializedId(NsdTables.CLSSid_LNClass);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Literal = TypeId.SET.getSpecializedId(NsdTables.CLSSid_Literal);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PresenceCondition = TypeId.SET.getSpecializedId(NsdTables.CLSSid_PresenceCondition);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ServiceCDC = TypeId.SET.getSpecializedId(NsdTables.CLSSid_ServiceCDC);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ServiceConstructedAttribute = TypeId.SET.getSpecializedId(NsdTables.CLSSid_ServiceConstructedAttribute);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ServiceDataAttribute = TypeId.SET.getSpecializedId(NsdTables.CLSSid_ServiceDataAttribute);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ServiceNsUsage = TypeId.SET.getSpecializedId(NsdTables.CLSSid_ServiceNsUsage);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ServiceType = TypeId.SET.getSpecializedId(NsdTables.CLSSid_ServiceType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_SubDataAttribute = TypeId.SET.getSpecializedId(NsdTables.CLSSid_SubDataAttribute);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_SubDataObject = TypeId.SET.getSpecializedId(NsdTables.CLSSid_SubDataObject);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_TitledClass = TypeId.SET.getSpecializedId(NsdTables.CLSSid_TitledClass);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", NsdTables.PARTid_, NsdTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			NsdTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorEnumeration _ACSIServicesKind = new EcoreExecutorEnumeration(NsdPackage.Literals.ACSI_SERVICES_KIND, PACKAGE, 0);
		public static final EcoreExecutorType _ACSIServicesKindObject = new EcoreExecutorType("ACSIServicesKindObject", PACKAGE, 0);
		public static final EcoreExecutorType _Abbreviation = new EcoreExecutorType(NsdPackage.Literals.ABBREVIATION, PACKAGE, 0);
		public static final EcoreExecutorType _Abbreviations = new EcoreExecutorType(NsdPackage.Literals.ABBREVIATIONS, PACKAGE, 0);
		public static final EcoreExecutorType _AbstractLNClass = new EcoreExecutorType(NsdPackage.Literals.ABSTRACT_LN_CLASS, PACKAGE, 0);
		public static final EcoreExecutorType _AgArray = new EcoreExecutorType(NsdPackage.Literals.AG_ARRAY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgAttributeType = new EcoreExecutorType(NsdPackage.Literals.AG_ATTRIBUTE_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgAttributeTypeAndValues = new EcoreExecutorType(NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgNSIdentification = new EcoreExecutorType(NsdPackage.Literals.AG_NS_IDENTIFICATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgNSdesc = new EcoreExecutorType(NsdPackage.Literals.AG_NSDESC, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgPresenceCondition = new EcoreExecutorType(NsdPackage.Literals.AG_PRESENCE_CONDITION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgPresenceConditionDerivedStatistics = new EcoreExecutorType(NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgTrgOp = new EcoreExecutorType(NsdPackage.Literals.AG_TRG_OP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgUML = new EcoreExecutorType(NsdPackage.Literals.AG_UML, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AgUnderlyingType = new EcoreExecutorType(NsdPackage.Literals.AG_UNDERLYING_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AnyLNClass = new EcoreExecutorType(NsdPackage.Literals.ANY_LN_CLASS, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ApplicableServiceNS = new EcoreExecutorType(NsdPackage.Literals.APPLICABLE_SERVICE_NS, PACKAGE, 0);
		public static final EcoreExecutorType _ApplicableServices = new EcoreExecutorType(NsdPackage.Literals.APPLICABLE_SERVICES, PACKAGE, 0);
		public static final EcoreExecutorType _AppliesToType = new EcoreExecutorType(NsdPackage.Literals.APPLIES_TO_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _AttributeTypeKind = new EcoreExecutorType("AttributeTypeKind", PACKAGE, 0);
		public static final EcoreExecutorType _BasicType = new EcoreExecutorType(NsdPackage.Literals.BASIC_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _BasicTypes = new EcoreExecutorType(NsdPackage.Literals.BASIC_TYPES, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CBKind = new EcoreExecutorEnumeration(NsdPackage.Literals.CB_KIND, PACKAGE, 0);
		public static final EcoreExecutorType _CBKindObject = new EcoreExecutorType("CBKindObject", PACKAGE, 0);
		public static final EcoreExecutorType _CDC = new EcoreExecutorType(NsdPackage.Literals.CDC, PACKAGE, 0);
		public static final EcoreExecutorType _CDCs = new EcoreExecutorType(NsdPackage.Literals.CD_CS, PACKAGE, 0);
		public static final EcoreExecutorType _Changes = new EcoreExecutorType(NsdPackage.Literals.CHANGES, PACKAGE, 0);
		public static final EcoreExecutorType _ConstructedAttribute = new EcoreExecutorType(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _ConstructedAttributes = new EcoreExecutorType(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTES, PACKAGE, 0);
		public static final EcoreExecutorType _CopyrightNotice = new EcoreExecutorType(NsdPackage.Literals.COPYRIGHT_NOTICE, PACKAGE, 0);
		public static final EcoreExecutorType _Copyrighted = new EcoreExecutorType(NsdPackage.Literals.COPYRIGHTED, PACKAGE, 0);
		public static final EcoreExecutorType _DataAttribute = new EcoreExecutorType(NsdPackage.Literals.DATA_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _DataObject = new EcoreExecutorType(NsdPackage.Literals.DATA_OBJECT, PACKAGE, 0);
		public static final EcoreExecutorType _DataSetMemberOf = new EcoreExecutorType(NsdPackage.Literals.DATA_SET_MEMBER_OF, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DefinedAttributeTypeKind = new EcoreExecutorEnumeration(NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND, PACKAGE, 0);
		public static final EcoreExecutorType _DefinedAttributeTypeKindObject = new EcoreExecutorType("DefinedAttributeTypeKindObject", PACKAGE, 0);
		public static final EcoreExecutorType _DependsOn = new EcoreExecutorType(NsdPackage.Literals.DEPENDS_ON, PACKAGE, 0);
		public static final EcoreExecutorType _Doc = new EcoreExecutorType(NsdPackage.Literals.DOC, PACKAGE, 0);
		public static final EcoreExecutorType _DocumentRoot = new EcoreExecutorType(NsdPackage.Literals.DOCUMENT_ROOT, PACKAGE, 0);
		public static final EcoreExecutorType _DocumentedClass = new EcoreExecutorType(NsdPackage.Literals.DOCUMENTED_CLASS, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Enumeration = new EcoreExecutorType(NsdPackage.Literals.ENUMERATION, PACKAGE, 0);
		public static final EcoreExecutorType _Enumerations = new EcoreExecutorType(NsdPackage.Literals.ENUMERATIONS, PACKAGE, 0);
		public static final EcoreExecutorType _FunctionalConstraint = new EcoreExecutorType(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT, PACKAGE, 0);
		public static final EcoreExecutorType _FunctionalConstraints = new EcoreExecutorType(NsdPackage.Literals.FUNCTIONAL_CONSTRAINTS, PACKAGE, 0);
		public static final EcoreExecutorType _IRiseClipseConsole = new EcoreExecutorType(NsdPackage.Literals.IRISE_CLIPSE_CONSOLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _LNClass = new EcoreExecutorType(NsdPackage.Literals.LN_CLASS, PACKAGE, 0);
		public static final EcoreExecutorType _LNClasses = new EcoreExecutorType(NsdPackage.Literals.LN_CLASSES, PACKAGE, 0);
		public static final EcoreExecutorType _License = new EcoreExecutorType(NsdPackage.Literals.LICENSE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LicenseKind = new EcoreExecutorEnumeration(NsdPackage.Literals.LICENSE_KIND, PACKAGE, 0);
		public static final EcoreExecutorType _LicenseKindObject = new EcoreExecutorType("LicenseKindObject", PACKAGE, 0);
		public static final EcoreExecutorType _Literal = new EcoreExecutorType(NsdPackage.Literals.LITERAL, PACKAGE, 0);
		public static final EcoreExecutorType _NS = new EcoreExecutorType(NsdPackage.Literals.NS, PACKAGE, 0);
		public static final EcoreExecutorType _NSDoc = new EcoreExecutorType(NsdPackage.Literals.NS_DOC, PACKAGE, 0);
		public static final EcoreExecutorType _Notice = new EcoreExecutorType(NsdPackage.Literals.NOTICE, PACKAGE, 0);
		public static final EcoreExecutorType _NsdObject = new EcoreExecutorType(NsdPackage.Literals.NSD_OBJECT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PresenceCondition = new EcoreExecutorType(NsdPackage.Literals.PRESENCE_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _PresenceConditions = new EcoreExecutorType(NsdPackage.Literals.PRESENCE_CONDITIONS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PubStage = new EcoreExecutorEnumeration(NsdPackage.Literals.PUB_STAGE, PACKAGE, 0);
		public static final EcoreExecutorType _PubStageObject = new EcoreExecutorType("PubStageObject", PACKAGE, 0);
		public static final EcoreExecutorType _ServiceCDC = new EcoreExecutorType(NsdPackage.Literals.SERVICE_CDC, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceCDCs = new EcoreExecutorType(NsdPackage.Literals.SERVICE_CD_CS, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceConstructedAttribute = new EcoreExecutorType(NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceConstructedAttributes = new EcoreExecutorType(NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTES, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceDataAttribute = new EcoreExecutorType(NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceNS = new EcoreExecutorType(NsdPackage.Literals.SERVICE_NS, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceNsUsage = new EcoreExecutorType(NsdPackage.Literals.SERVICE_NS_USAGE, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceParameter = new EcoreExecutorType(NsdPackage.Literals.SERVICE_PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceType = new EcoreExecutorType(NsdPackage.Literals.SERVICE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ServiceTypeRealizations = new EcoreExecutorType(NsdPackage.Literals.SERVICE_TYPE_REALIZATIONS, PACKAGE, 0);
		public static final EcoreExecutorType _SubDataAttribute = new EcoreExecutorType(NsdPackage.Literals.SUB_DATA_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _SubDataObject = new EcoreExecutorType(NsdPackage.Literals.SUB_DATA_OBJECT, PACKAGE, 0);
		public static final EcoreExecutorType _TitledClass = new EcoreExecutorType(NsdPackage.Literals.TITLED_CLASS, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _UndefinedAttributeTypeKind = new EcoreExecutorEnumeration(NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND, PACKAGE, 0);
		public static final EcoreExecutorType _UndefinedAttributeTypeKindObject = new EcoreExecutorType("UndefinedAttributeTypeKindObject", PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_ACSIServicesKind,
			_ACSIServicesKindObject,
			_Abbreviation,
			_Abbreviations,
			_AbstractLNClass,
			_AgArray,
			_AgAttributeType,
			_AgAttributeTypeAndValues,
			_AgNSIdentification,
			_AgNSdesc,
			_AgPresenceCondition,
			_AgPresenceConditionDerivedStatistics,
			_AgTrgOp,
			_AgUML,
			_AgUnderlyingType,
			_AnyLNClass,
			_ApplicableServiceNS,
			_ApplicableServices,
			_AppliesToType,
			_AttributeTypeKind,
			_BasicType,
			_BasicTypes,
			_CBKind,
			_CBKindObject,
			_CDC,
			_CDCs,
			_Changes,
			_ConstructedAttribute,
			_ConstructedAttributes,
			_CopyrightNotice,
			_Copyrighted,
			_DataAttribute,
			_DataObject,
			_DataSetMemberOf,
			_DefinedAttributeTypeKind,
			_DefinedAttributeTypeKindObject,
			_DependsOn,
			_Doc,
			_DocumentRoot,
			_DocumentedClass,
			_Enumeration,
			_Enumerations,
			_FunctionalConstraint,
			_FunctionalConstraints,
			_IRiseClipseConsole,
			_LNClass,
			_LNClasses,
			_License,
			_LicenseKind,
			_LicenseKindObject,
			_Literal,
			_NS,
			_NSDoc,
			_Notice,
			_NsdObject,
			_PresenceCondition,
			_PresenceConditions,
			_PubStage,
			_PubStageObject,
			_ServiceCDC,
			_ServiceCDCs,
			_ServiceConstructedAttribute,
			_ServiceConstructedAttributes,
			_ServiceDataAttribute,
			_ServiceNS,
			_ServiceNsUsage,
			_ServiceParameter,
			_ServiceType,
			_ServiceTypeRealizations,
			_SubDataAttribute,
			_SubDataObject,
			_TitledClass,
			_UndefinedAttributeTypeKind,
			_UndefinedAttributeTypeKindObject
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _ACSIServicesKind__ACSIServicesKind = new ExecutorFragment(Types._ACSIServicesKind, NsdTables.Types._ACSIServicesKind);
		private static final ExecutorFragment _ACSIServicesKind__OclAny = new ExecutorFragment(Types._ACSIServicesKind, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ACSIServicesKind__OclElement = new ExecutorFragment(Types._ACSIServicesKind, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ACSIServicesKind__OclEnumeration = new ExecutorFragment(Types._ACSIServicesKind, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ACSIServicesKind__OclType = new ExecutorFragment(Types._ACSIServicesKind, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ACSIServicesKindObject__ACSIServicesKindObject = new ExecutorFragment(Types._ACSIServicesKindObject, NsdTables.Types._ACSIServicesKindObject);
		private static final ExecutorFragment _ACSIServicesKindObject__OclAny = new ExecutorFragment(Types._ACSIServicesKindObject, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _Abbreviation__Abbreviation = new ExecutorFragment(Types._Abbreviation, NsdTables.Types._Abbreviation);
		private static final ExecutorFragment _Abbreviation__NsdObject = new ExecutorFragment(Types._Abbreviation, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Abbreviation__OclAny = new ExecutorFragment(Types._Abbreviation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Abbreviation__OclElement = new ExecutorFragment(Types._Abbreviation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Abbreviations__Abbreviations = new ExecutorFragment(Types._Abbreviations, NsdTables.Types._Abbreviations);
		private static final ExecutorFragment _Abbreviations__NsdObject = new ExecutorFragment(Types._Abbreviations, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Abbreviations__OclAny = new ExecutorFragment(Types._Abbreviations, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Abbreviations__OclElement = new ExecutorFragment(Types._Abbreviations, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AbstractLNClass__AbstractLNClass = new ExecutorFragment(Types._AbstractLNClass, NsdTables.Types._AbstractLNClass);
		private static final ExecutorFragment _AbstractLNClass__AnyLNClass = new ExecutorFragment(Types._AbstractLNClass, NsdTables.Types._AnyLNClass);
		private static final ExecutorFragment _AbstractLNClass__DocumentedClass = new ExecutorFragment(Types._AbstractLNClass, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _AbstractLNClass__NsdObject = new ExecutorFragment(Types._AbstractLNClass, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _AbstractLNClass__OclAny = new ExecutorFragment(Types._AbstractLNClass, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AbstractLNClass__OclElement = new ExecutorFragment(Types._AbstractLNClass, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AbstractLNClass__TitledClass = new ExecutorFragment(Types._AbstractLNClass, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _AgArray__AgArray = new ExecutorFragment(Types._AgArray, NsdTables.Types._AgArray);
		private static final ExecutorFragment _AgArray__OclAny = new ExecutorFragment(Types._AgArray, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgArray__OclElement = new ExecutorFragment(Types._AgArray, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgAttributeType__AgAttributeType = new ExecutorFragment(Types._AgAttributeType, NsdTables.Types._AgAttributeType);
		private static final ExecutorFragment _AgAttributeType__OclAny = new ExecutorFragment(Types._AgAttributeType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgAttributeType__OclElement = new ExecutorFragment(Types._AgAttributeType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgAttributeTypeAndValues__AgAttributeType = new ExecutorFragment(Types._AgAttributeTypeAndValues, NsdTables.Types._AgAttributeType);
		private static final ExecutorFragment _AgAttributeTypeAndValues__AgAttributeTypeAndValues = new ExecutorFragment(Types._AgAttributeTypeAndValues, NsdTables.Types._AgAttributeTypeAndValues);
		private static final ExecutorFragment _AgAttributeTypeAndValues__OclAny = new ExecutorFragment(Types._AgAttributeTypeAndValues, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgAttributeTypeAndValues__OclElement = new ExecutorFragment(Types._AgAttributeTypeAndValues, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgNSIdentification__AgNSIdentification = new ExecutorFragment(Types._AgNSIdentification, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _AgNSIdentification__OclAny = new ExecutorFragment(Types._AgNSIdentification, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgNSIdentification__OclElement = new ExecutorFragment(Types._AgNSIdentification, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgNSdesc__AgNSdesc = new ExecutorFragment(Types._AgNSdesc, NsdTables.Types._AgNSdesc);
		private static final ExecutorFragment _AgNSdesc__OclAny = new ExecutorFragment(Types._AgNSdesc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgNSdesc__OclElement = new ExecutorFragment(Types._AgNSdesc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgPresenceCondition__AgPresenceCondition = new ExecutorFragment(Types._AgPresenceCondition, NsdTables.Types._AgPresenceCondition);
		private static final ExecutorFragment _AgPresenceCondition__OclAny = new ExecutorFragment(Types._AgPresenceCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgPresenceCondition__OclElement = new ExecutorFragment(Types._AgPresenceCondition, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgPresenceConditionDerivedStatistics__AgPresenceConditionDerivedStatistics = new ExecutorFragment(Types._AgPresenceConditionDerivedStatistics, NsdTables.Types._AgPresenceConditionDerivedStatistics);
		private static final ExecutorFragment _AgPresenceConditionDerivedStatistics__OclAny = new ExecutorFragment(Types._AgPresenceConditionDerivedStatistics, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgPresenceConditionDerivedStatistics__OclElement = new ExecutorFragment(Types._AgPresenceConditionDerivedStatistics, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgTrgOp__AgTrgOp = new ExecutorFragment(Types._AgTrgOp, NsdTables.Types._AgTrgOp);
		private static final ExecutorFragment _AgTrgOp__OclAny = new ExecutorFragment(Types._AgTrgOp, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgTrgOp__OclElement = new ExecutorFragment(Types._AgTrgOp, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgUML__AgUML = new ExecutorFragment(Types._AgUML, NsdTables.Types._AgUML);
		private static final ExecutorFragment _AgUML__OclAny = new ExecutorFragment(Types._AgUML, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgUML__OclElement = new ExecutorFragment(Types._AgUML, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AgUnderlyingType__AgUnderlyingType = new ExecutorFragment(Types._AgUnderlyingType, NsdTables.Types._AgUnderlyingType);
		private static final ExecutorFragment _AgUnderlyingType__OclAny = new ExecutorFragment(Types._AgUnderlyingType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AgUnderlyingType__OclElement = new ExecutorFragment(Types._AgUnderlyingType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AnyLNClass__AnyLNClass = new ExecutorFragment(Types._AnyLNClass, NsdTables.Types._AnyLNClass);
		private static final ExecutorFragment _AnyLNClass__DocumentedClass = new ExecutorFragment(Types._AnyLNClass, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _AnyLNClass__NsdObject = new ExecutorFragment(Types._AnyLNClass, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _AnyLNClass__OclAny = new ExecutorFragment(Types._AnyLNClass, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AnyLNClass__OclElement = new ExecutorFragment(Types._AnyLNClass, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AnyLNClass__TitledClass = new ExecutorFragment(Types._AnyLNClass, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _ApplicableServiceNS__ApplicableServiceNS = new ExecutorFragment(Types._ApplicableServiceNS, NsdTables.Types._ApplicableServiceNS);
		private static final ExecutorFragment _ApplicableServiceNS__Copyrighted = new ExecutorFragment(Types._ApplicableServiceNS, NsdTables.Types._Copyrighted);
		private static final ExecutorFragment _ApplicableServiceNS__NsdObject = new ExecutorFragment(Types._ApplicableServiceNS, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ApplicableServiceNS__OclAny = new ExecutorFragment(Types._ApplicableServiceNS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ApplicableServiceNS__OclElement = new ExecutorFragment(Types._ApplicableServiceNS, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ApplicableServices__ApplicableServices = new ExecutorFragment(Types._ApplicableServices, NsdTables.Types._ApplicableServices);
		private static final ExecutorFragment _ApplicableServices__NsdObject = new ExecutorFragment(Types._ApplicableServices, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ApplicableServices__OclAny = new ExecutorFragment(Types._ApplicableServices, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ApplicableServices__OclElement = new ExecutorFragment(Types._ApplicableServices, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AppliesToType__AgNSIdentification = new ExecutorFragment(Types._AppliesToType, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _AppliesToType__AppliesToType = new ExecutorFragment(Types._AppliesToType, NsdTables.Types._AppliesToType);
		private static final ExecutorFragment _AppliesToType__NsdObject = new ExecutorFragment(Types._AppliesToType, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _AppliesToType__OclAny = new ExecutorFragment(Types._AppliesToType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AppliesToType__OclElement = new ExecutorFragment(Types._AppliesToType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AttributeTypeKind__AttributeTypeKind = new ExecutorFragment(Types._AttributeTypeKind, NsdTables.Types._AttributeTypeKind);
		private static final ExecutorFragment _AttributeTypeKind__OclAny = new ExecutorFragment(Types._AttributeTypeKind, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _BasicType__BasicType = new ExecutorFragment(Types._BasicType, NsdTables.Types._BasicType);
		private static final ExecutorFragment _BasicType__NsdObject = new ExecutorFragment(Types._BasicType, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _BasicType__OclAny = new ExecutorFragment(Types._BasicType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BasicType__OclElement = new ExecutorFragment(Types._BasicType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BasicTypes__BasicTypes = new ExecutorFragment(Types._BasicTypes, NsdTables.Types._BasicTypes);
		private static final ExecutorFragment _BasicTypes__NsdObject = new ExecutorFragment(Types._BasicTypes, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _BasicTypes__OclAny = new ExecutorFragment(Types._BasicTypes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BasicTypes__OclElement = new ExecutorFragment(Types._BasicTypes, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CBKind__CBKind = new ExecutorFragment(Types._CBKind, NsdTables.Types._CBKind);
		private static final ExecutorFragment _CBKind__OclAny = new ExecutorFragment(Types._CBKind, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CBKind__OclElement = new ExecutorFragment(Types._CBKind, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CBKind__OclEnumeration = new ExecutorFragment(Types._CBKind, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CBKind__OclType = new ExecutorFragment(Types._CBKind, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _CBKindObject__CBKindObject = new ExecutorFragment(Types._CBKindObject, NsdTables.Types._CBKindObject);
		private static final ExecutorFragment _CBKindObject__OclAny = new ExecutorFragment(Types._CBKindObject, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _CDC__CDC = new ExecutorFragment(Types._CDC, NsdTables.Types._CDC);
		private static final ExecutorFragment _CDC__DocumentedClass = new ExecutorFragment(Types._CDC, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _CDC__NsdObject = new ExecutorFragment(Types._CDC, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _CDC__OclAny = new ExecutorFragment(Types._CDC, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CDC__OclElement = new ExecutorFragment(Types._CDC, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CDC__TitledClass = new ExecutorFragment(Types._CDC, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _CDCs__CDCs = new ExecutorFragment(Types._CDCs, NsdTables.Types._CDCs);
		private static final ExecutorFragment _CDCs__NsdObject = new ExecutorFragment(Types._CDCs, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _CDCs__OclAny = new ExecutorFragment(Types._CDCs, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CDCs__OclElement = new ExecutorFragment(Types._CDCs, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Changes__Changes = new ExecutorFragment(Types._Changes, NsdTables.Types._Changes);
		private static final ExecutorFragment _Changes__NsdObject = new ExecutorFragment(Types._Changes, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Changes__OclAny = new ExecutorFragment(Types._Changes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Changes__OclElement = new ExecutorFragment(Types._Changes, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ConstructedAttribute__ConstructedAttribute = new ExecutorFragment(Types._ConstructedAttribute, NsdTables.Types._ConstructedAttribute);
		private static final ExecutorFragment _ConstructedAttribute__DocumentedClass = new ExecutorFragment(Types._ConstructedAttribute, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _ConstructedAttribute__NsdObject = new ExecutorFragment(Types._ConstructedAttribute, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ConstructedAttribute__OclAny = new ExecutorFragment(Types._ConstructedAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConstructedAttribute__OclElement = new ExecutorFragment(Types._ConstructedAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ConstructedAttribute__TitledClass = new ExecutorFragment(Types._ConstructedAttribute, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _ConstructedAttributes__ConstructedAttributes = new ExecutorFragment(Types._ConstructedAttributes, NsdTables.Types._ConstructedAttributes);
		private static final ExecutorFragment _ConstructedAttributes__NsdObject = new ExecutorFragment(Types._ConstructedAttributes, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ConstructedAttributes__OclAny = new ExecutorFragment(Types._ConstructedAttributes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConstructedAttributes__OclElement = new ExecutorFragment(Types._ConstructedAttributes, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CopyrightNotice__CopyrightNotice = new ExecutorFragment(Types._CopyrightNotice, NsdTables.Types._CopyrightNotice);
		private static final ExecutorFragment _CopyrightNotice__NsdObject = new ExecutorFragment(Types._CopyrightNotice, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _CopyrightNotice__OclAny = new ExecutorFragment(Types._CopyrightNotice, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CopyrightNotice__OclElement = new ExecutorFragment(Types._CopyrightNotice, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Copyrighted__Copyrighted = new ExecutorFragment(Types._Copyrighted, NsdTables.Types._Copyrighted);
		private static final ExecutorFragment _Copyrighted__NsdObject = new ExecutorFragment(Types._Copyrighted, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Copyrighted__OclAny = new ExecutorFragment(Types._Copyrighted, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Copyrighted__OclElement = new ExecutorFragment(Types._Copyrighted, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataAttribute__AgArray = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._AgArray);
		private static final ExecutorFragment _DataAttribute__AgAttributeType = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._AgAttributeType);
		private static final ExecutorFragment _DataAttribute__AgAttributeTypeAndValues = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._AgAttributeTypeAndValues);
		private static final ExecutorFragment _DataAttribute__AgPresenceCondition = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._AgPresenceCondition);
		private static final ExecutorFragment _DataAttribute__AgTrgOp = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._AgTrgOp);
		private static final ExecutorFragment _DataAttribute__DataAttribute = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._DataAttribute);
		private static final ExecutorFragment _DataAttribute__DocumentedClass = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _DataAttribute__NsdObject = new ExecutorFragment(Types._DataAttribute, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _DataAttribute__OclAny = new ExecutorFragment(Types._DataAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataAttribute__OclElement = new ExecutorFragment(Types._DataAttribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataObject__AgPresenceCondition = new ExecutorFragment(Types._DataObject, NsdTables.Types._AgPresenceCondition);
		private static final ExecutorFragment _DataObject__AgPresenceConditionDerivedStatistics = new ExecutorFragment(Types._DataObject, NsdTables.Types._AgPresenceConditionDerivedStatistics);
		private static final ExecutorFragment _DataObject__AgUnderlyingType = new ExecutorFragment(Types._DataObject, NsdTables.Types._AgUnderlyingType);
		private static final ExecutorFragment _DataObject__DataObject = new ExecutorFragment(Types._DataObject, NsdTables.Types._DataObject);
		private static final ExecutorFragment _DataObject__DocumentedClass = new ExecutorFragment(Types._DataObject, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _DataObject__NsdObject = new ExecutorFragment(Types._DataObject, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _DataObject__OclAny = new ExecutorFragment(Types._DataObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataObject__OclElement = new ExecutorFragment(Types._DataObject, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataSetMemberOf__DataSetMemberOf = new ExecutorFragment(Types._DataSetMemberOf, NsdTables.Types._DataSetMemberOf);
		private static final ExecutorFragment _DataSetMemberOf__NsdObject = new ExecutorFragment(Types._DataSetMemberOf, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _DataSetMemberOf__OclAny = new ExecutorFragment(Types._DataSetMemberOf, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataSetMemberOf__OclElement = new ExecutorFragment(Types._DataSetMemberOf, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DefinedAttributeTypeKind__DefinedAttributeTypeKind = new ExecutorFragment(Types._DefinedAttributeTypeKind, NsdTables.Types._DefinedAttributeTypeKind);
		private static final ExecutorFragment _DefinedAttributeTypeKind__OclAny = new ExecutorFragment(Types._DefinedAttributeTypeKind, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DefinedAttributeTypeKind__OclElement = new ExecutorFragment(Types._DefinedAttributeTypeKind, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DefinedAttributeTypeKind__OclEnumeration = new ExecutorFragment(Types._DefinedAttributeTypeKind, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DefinedAttributeTypeKind__OclType = new ExecutorFragment(Types._DefinedAttributeTypeKind, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _DefinedAttributeTypeKindObject__DefinedAttributeTypeKindObject = new ExecutorFragment(Types._DefinedAttributeTypeKindObject, NsdTables.Types._DefinedAttributeTypeKindObject);
		private static final ExecutorFragment _DefinedAttributeTypeKindObject__OclAny = new ExecutorFragment(Types._DefinedAttributeTypeKindObject, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _DependsOn__AgNSIdentification = new ExecutorFragment(Types._DependsOn, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _DependsOn__DependsOn = new ExecutorFragment(Types._DependsOn, NsdTables.Types._DependsOn);
		private static final ExecutorFragment _DependsOn__NsdObject = new ExecutorFragment(Types._DependsOn, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _DependsOn__OclAny = new ExecutorFragment(Types._DependsOn, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DependsOn__OclElement = new ExecutorFragment(Types._DependsOn, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Doc__Doc = new ExecutorFragment(Types._Doc, NsdTables.Types._Doc);
		private static final ExecutorFragment _Doc__NsdObject = new ExecutorFragment(Types._Doc, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Doc__OclAny = new ExecutorFragment(Types._Doc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Doc__OclElement = new ExecutorFragment(Types._Doc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DocumentRoot__DocumentRoot = new ExecutorFragment(Types._DocumentRoot, NsdTables.Types._DocumentRoot);
		private static final ExecutorFragment _DocumentRoot__OclAny = new ExecutorFragment(Types._DocumentRoot, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DocumentRoot__OclElement = new ExecutorFragment(Types._DocumentRoot, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DocumentedClass__DocumentedClass = new ExecutorFragment(Types._DocumentedClass, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _DocumentedClass__NsdObject = new ExecutorFragment(Types._DocumentedClass, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _DocumentedClass__OclAny = new ExecutorFragment(Types._DocumentedClass, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DocumentedClass__OclElement = new ExecutorFragment(Types._DocumentedClass, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enumeration__DocumentedClass = new ExecutorFragment(Types._Enumeration, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Types._Enumeration, NsdTables.Types._Enumeration);
		private static final ExecutorFragment _Enumeration__NsdObject = new ExecutorFragment(Types._Enumeration, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enumeration__OclElement = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Enumeration__TitledClass = new ExecutorFragment(Types._Enumeration, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _Enumerations__Enumerations = new ExecutorFragment(Types._Enumerations, NsdTables.Types._Enumerations);
		private static final ExecutorFragment _Enumerations__NsdObject = new ExecutorFragment(Types._Enumerations, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Enumerations__OclAny = new ExecutorFragment(Types._Enumerations, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enumerations__OclElement = new ExecutorFragment(Types._Enumerations, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FunctionalConstraint__FunctionalConstraint = new ExecutorFragment(Types._FunctionalConstraint, NsdTables.Types._FunctionalConstraint);
		private static final ExecutorFragment _FunctionalConstraint__NsdObject = new ExecutorFragment(Types._FunctionalConstraint, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _FunctionalConstraint__OclAny = new ExecutorFragment(Types._FunctionalConstraint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FunctionalConstraint__OclElement = new ExecutorFragment(Types._FunctionalConstraint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FunctionalConstraints__FunctionalConstraints = new ExecutorFragment(Types._FunctionalConstraints, NsdTables.Types._FunctionalConstraints);
		private static final ExecutorFragment _FunctionalConstraints__NsdObject = new ExecutorFragment(Types._FunctionalConstraints, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _FunctionalConstraints__OclAny = new ExecutorFragment(Types._FunctionalConstraints, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FunctionalConstraints__OclElement = new ExecutorFragment(Types._FunctionalConstraints, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IRiseClipseConsole__IRiseClipseConsole = new ExecutorFragment(Types._IRiseClipseConsole, NsdTables.Types._IRiseClipseConsole);
		private static final ExecutorFragment _IRiseClipseConsole__OclAny = new ExecutorFragment(Types._IRiseClipseConsole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IRiseClipseConsole__OclElement = new ExecutorFragment(Types._IRiseClipseConsole, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LNClass__AnyLNClass = new ExecutorFragment(Types._LNClass, NsdTables.Types._AnyLNClass);
		private static final ExecutorFragment _LNClass__DocumentedClass = new ExecutorFragment(Types._LNClass, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _LNClass__LNClass = new ExecutorFragment(Types._LNClass, NsdTables.Types._LNClass);
		private static final ExecutorFragment _LNClass__NsdObject = new ExecutorFragment(Types._LNClass, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _LNClass__OclAny = new ExecutorFragment(Types._LNClass, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LNClass__OclElement = new ExecutorFragment(Types._LNClass, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LNClass__TitledClass = new ExecutorFragment(Types._LNClass, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _LNClasses__LNClasses = new ExecutorFragment(Types._LNClasses, NsdTables.Types._LNClasses);
		private static final ExecutorFragment _LNClasses__NsdObject = new ExecutorFragment(Types._LNClasses, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _LNClasses__OclAny = new ExecutorFragment(Types._LNClasses, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LNClasses__OclElement = new ExecutorFragment(Types._LNClasses, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _License__License = new ExecutorFragment(Types._License, NsdTables.Types._License);
		private static final ExecutorFragment _License__NsdObject = new ExecutorFragment(Types._License, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _License__OclAny = new ExecutorFragment(Types._License, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _License__OclElement = new ExecutorFragment(Types._License, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LicenseKind__LicenseKind = new ExecutorFragment(Types._LicenseKind, NsdTables.Types._LicenseKind);
		private static final ExecutorFragment _LicenseKind__OclAny = new ExecutorFragment(Types._LicenseKind, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LicenseKind__OclElement = new ExecutorFragment(Types._LicenseKind, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LicenseKind__OclEnumeration = new ExecutorFragment(Types._LicenseKind, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LicenseKind__OclType = new ExecutorFragment(Types._LicenseKind, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _LicenseKindObject__LicenseKindObject = new ExecutorFragment(Types._LicenseKindObject, NsdTables.Types._LicenseKindObject);
		private static final ExecutorFragment _LicenseKindObject__OclAny = new ExecutorFragment(Types._LicenseKindObject, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _Literal__DocumentedClass = new ExecutorFragment(Types._Literal, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _Literal__Literal = new ExecutorFragment(Types._Literal, NsdTables.Types._Literal);
		private static final ExecutorFragment _Literal__NsdObject = new ExecutorFragment(Types._Literal, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Literal__OclAny = new ExecutorFragment(Types._Literal, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Literal__OclElement = new ExecutorFragment(Types._Literal, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NS__AgNSIdentification = new ExecutorFragment(Types._NS, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _NS__AgNSdesc = new ExecutorFragment(Types._NS, NsdTables.Types._AgNSdesc);
		private static final ExecutorFragment _NS__AgUML = new ExecutorFragment(Types._NS, NsdTables.Types._AgUML);
		private static final ExecutorFragment _NS__Copyrighted = new ExecutorFragment(Types._NS, NsdTables.Types._Copyrighted);
		private static final ExecutorFragment _NS__NS = new ExecutorFragment(Types._NS, NsdTables.Types._NS);
		private static final ExecutorFragment _NS__NsdObject = new ExecutorFragment(Types._NS, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _NS__OclAny = new ExecutorFragment(Types._NS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NS__OclElement = new ExecutorFragment(Types._NS, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NSDoc__AgNSIdentification = new ExecutorFragment(Types._NSDoc, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _NSDoc__AgUML = new ExecutorFragment(Types._NSDoc, NsdTables.Types._AgUML);
		private static final ExecutorFragment _NSDoc__Copyrighted = new ExecutorFragment(Types._NSDoc, NsdTables.Types._Copyrighted);
		private static final ExecutorFragment _NSDoc__NSDoc = new ExecutorFragment(Types._NSDoc, NsdTables.Types._NSDoc);
		private static final ExecutorFragment _NSDoc__NsdObject = new ExecutorFragment(Types._NSDoc, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _NSDoc__OclAny = new ExecutorFragment(Types._NSDoc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NSDoc__OclElement = new ExecutorFragment(Types._NSDoc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Notice__Notice = new ExecutorFragment(Types._Notice, NsdTables.Types._Notice);
		private static final ExecutorFragment _Notice__NsdObject = new ExecutorFragment(Types._Notice, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _Notice__OclAny = new ExecutorFragment(Types._Notice, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Notice__OclElement = new ExecutorFragment(Types._Notice, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NsdObject__NsdObject = new ExecutorFragment(Types._NsdObject, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _NsdObject__OclAny = new ExecutorFragment(Types._NsdObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NsdObject__OclElement = new ExecutorFragment(Types._NsdObject, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PresenceCondition__NsdObject = new ExecutorFragment(Types._PresenceCondition, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _PresenceCondition__OclAny = new ExecutorFragment(Types._PresenceCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PresenceCondition__OclElement = new ExecutorFragment(Types._PresenceCondition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PresenceCondition__PresenceCondition = new ExecutorFragment(Types._PresenceCondition, NsdTables.Types._PresenceCondition);

		private static final ExecutorFragment _PresenceConditions__NsdObject = new ExecutorFragment(Types._PresenceConditions, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _PresenceConditions__OclAny = new ExecutorFragment(Types._PresenceConditions, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PresenceConditions__OclElement = new ExecutorFragment(Types._PresenceConditions, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PresenceConditions__PresenceConditions = new ExecutorFragment(Types._PresenceConditions, NsdTables.Types._PresenceConditions);

		private static final ExecutorFragment _PubStage__OclAny = new ExecutorFragment(Types._PubStage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PubStage__OclElement = new ExecutorFragment(Types._PubStage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PubStage__OclEnumeration = new ExecutorFragment(Types._PubStage, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PubStage__OclType = new ExecutorFragment(Types._PubStage, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PubStage__PubStage = new ExecutorFragment(Types._PubStage, NsdTables.Types._PubStage);

		private static final ExecutorFragment _PubStageObject__OclAny = new ExecutorFragment(Types._PubStageObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PubStageObject__PubStageObject = new ExecutorFragment(Types._PubStageObject, NsdTables.Types._PubStageObject);

		private static final ExecutorFragment _ServiceCDC__NsdObject = new ExecutorFragment(Types._ServiceCDC, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceCDC__OclAny = new ExecutorFragment(Types._ServiceCDC, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceCDC__OclElement = new ExecutorFragment(Types._ServiceCDC, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceCDC__ServiceCDC = new ExecutorFragment(Types._ServiceCDC, NsdTables.Types._ServiceCDC);

		private static final ExecutorFragment _ServiceCDCs__NsdObject = new ExecutorFragment(Types._ServiceCDCs, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceCDCs__OclAny = new ExecutorFragment(Types._ServiceCDCs, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceCDCs__OclElement = new ExecutorFragment(Types._ServiceCDCs, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceCDCs__ServiceCDCs = new ExecutorFragment(Types._ServiceCDCs, NsdTables.Types._ServiceCDCs);

		private static final ExecutorFragment _ServiceConstructedAttribute__ConstructedAttribute = new ExecutorFragment(Types._ServiceConstructedAttribute, NsdTables.Types._ConstructedAttribute);
		private static final ExecutorFragment _ServiceConstructedAttribute__DocumentedClass = new ExecutorFragment(Types._ServiceConstructedAttribute, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _ServiceConstructedAttribute__NsdObject = new ExecutorFragment(Types._ServiceConstructedAttribute, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceConstructedAttribute__OclAny = new ExecutorFragment(Types._ServiceConstructedAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceConstructedAttribute__OclElement = new ExecutorFragment(Types._ServiceConstructedAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceConstructedAttribute__ServiceConstructedAttribute = new ExecutorFragment(Types._ServiceConstructedAttribute, NsdTables.Types._ServiceConstructedAttribute);
		private static final ExecutorFragment _ServiceConstructedAttribute__TitledClass = new ExecutorFragment(Types._ServiceConstructedAttribute, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _ServiceConstructedAttributes__NsdObject = new ExecutorFragment(Types._ServiceConstructedAttributes, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceConstructedAttributes__OclAny = new ExecutorFragment(Types._ServiceConstructedAttributes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceConstructedAttributes__OclElement = new ExecutorFragment(Types._ServiceConstructedAttributes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceConstructedAttributes__ServiceConstructedAttributes = new ExecutorFragment(Types._ServiceConstructedAttributes, NsdTables.Types._ServiceConstructedAttributes);

		private static final ExecutorFragment _ServiceDataAttribute__AgAttributeType = new ExecutorFragment(Types._ServiceDataAttribute, NsdTables.Types._AgAttributeType);
		private static final ExecutorFragment _ServiceDataAttribute__AgPresenceCondition = new ExecutorFragment(Types._ServiceDataAttribute, NsdTables.Types._AgPresenceCondition);
		private static final ExecutorFragment _ServiceDataAttribute__AgUnderlyingType = new ExecutorFragment(Types._ServiceDataAttribute, NsdTables.Types._AgUnderlyingType);
		private static final ExecutorFragment _ServiceDataAttribute__DocumentedClass = new ExecutorFragment(Types._ServiceDataAttribute, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _ServiceDataAttribute__NsdObject = new ExecutorFragment(Types._ServiceDataAttribute, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceDataAttribute__OclAny = new ExecutorFragment(Types._ServiceDataAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceDataAttribute__OclElement = new ExecutorFragment(Types._ServiceDataAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceDataAttribute__ServiceDataAttribute = new ExecutorFragment(Types._ServiceDataAttribute, NsdTables.Types._ServiceDataAttribute);

		private static final ExecutorFragment _ServiceNS__AgNSIdentification = new ExecutorFragment(Types._ServiceNS, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _ServiceNS__AgNSdesc = new ExecutorFragment(Types._ServiceNS, NsdTables.Types._AgNSdesc);
		private static final ExecutorFragment _ServiceNS__AgUML = new ExecutorFragment(Types._ServiceNS, NsdTables.Types._AgUML);
		private static final ExecutorFragment _ServiceNS__Copyrighted = new ExecutorFragment(Types._ServiceNS, NsdTables.Types._Copyrighted);
		private static final ExecutorFragment _ServiceNS__NsdObject = new ExecutorFragment(Types._ServiceNS, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceNS__OclAny = new ExecutorFragment(Types._ServiceNS, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceNS__OclElement = new ExecutorFragment(Types._ServiceNS, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceNS__ServiceNS = new ExecutorFragment(Types._ServiceNS, NsdTables.Types._ServiceNS);

		private static final ExecutorFragment _ServiceNsUsage__AgNSIdentification = new ExecutorFragment(Types._ServiceNsUsage, NsdTables.Types._AgNSIdentification);
		private static final ExecutorFragment _ServiceNsUsage__NsdObject = new ExecutorFragment(Types._ServiceNsUsage, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceNsUsage__OclAny = new ExecutorFragment(Types._ServiceNsUsage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceNsUsage__OclElement = new ExecutorFragment(Types._ServiceNsUsage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceNsUsage__ServiceNsUsage = new ExecutorFragment(Types._ServiceNsUsage, NsdTables.Types._ServiceNsUsage);

		private static final ExecutorFragment _ServiceParameter__AgAttributeType = new ExecutorFragment(Types._ServiceParameter, NsdTables.Types._AgAttributeType);
		private static final ExecutorFragment _ServiceParameter__AgAttributeTypeAndValues = new ExecutorFragment(Types._ServiceParameter, NsdTables.Types._AgAttributeTypeAndValues);
		private static final ExecutorFragment _ServiceParameter__DocumentedClass = new ExecutorFragment(Types._ServiceParameter, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _ServiceParameter__NsdObject = new ExecutorFragment(Types._ServiceParameter, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceParameter__OclAny = new ExecutorFragment(Types._ServiceParameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceParameter__OclElement = new ExecutorFragment(Types._ServiceParameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceParameter__ServiceParameter = new ExecutorFragment(Types._ServiceParameter, NsdTables.Types._ServiceParameter);

		private static final ExecutorFragment _ServiceType__NsdObject = new ExecutorFragment(Types._ServiceType, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceType__OclAny = new ExecutorFragment(Types._ServiceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceType__OclElement = new ExecutorFragment(Types._ServiceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceType__ServiceType = new ExecutorFragment(Types._ServiceType, NsdTables.Types._ServiceType);

		private static final ExecutorFragment _ServiceTypeRealizations__NsdObject = new ExecutorFragment(Types._ServiceTypeRealizations, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _ServiceTypeRealizations__OclAny = new ExecutorFragment(Types._ServiceTypeRealizations, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ServiceTypeRealizations__OclElement = new ExecutorFragment(Types._ServiceTypeRealizations, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ServiceTypeRealizations__ServiceTypeRealizations = new ExecutorFragment(Types._ServiceTypeRealizations, NsdTables.Types._ServiceTypeRealizations);

		private static final ExecutorFragment _SubDataAttribute__AgArray = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._AgArray);
		private static final ExecutorFragment _SubDataAttribute__AgAttributeType = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._AgAttributeType);
		private static final ExecutorFragment _SubDataAttribute__AgAttributeTypeAndValues = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._AgAttributeTypeAndValues);
		private static final ExecutorFragment _SubDataAttribute__AgPresenceCondition = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._AgPresenceCondition);
		private static final ExecutorFragment _SubDataAttribute__DocumentedClass = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _SubDataAttribute__NsdObject = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _SubDataAttribute__OclAny = new ExecutorFragment(Types._SubDataAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubDataAttribute__OclElement = new ExecutorFragment(Types._SubDataAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubDataAttribute__SubDataAttribute = new ExecutorFragment(Types._SubDataAttribute, NsdTables.Types._SubDataAttribute);

		private static final ExecutorFragment _SubDataObject__AgArray = new ExecutorFragment(Types._SubDataObject, NsdTables.Types._AgArray);
		private static final ExecutorFragment _SubDataObject__AgPresenceCondition = new ExecutorFragment(Types._SubDataObject, NsdTables.Types._AgPresenceCondition);
		private static final ExecutorFragment _SubDataObject__AgUnderlyingType = new ExecutorFragment(Types._SubDataObject, NsdTables.Types._AgUnderlyingType);
		private static final ExecutorFragment _SubDataObject__DocumentedClass = new ExecutorFragment(Types._SubDataObject, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _SubDataObject__NsdObject = new ExecutorFragment(Types._SubDataObject, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _SubDataObject__OclAny = new ExecutorFragment(Types._SubDataObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SubDataObject__OclElement = new ExecutorFragment(Types._SubDataObject, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SubDataObject__SubDataObject = new ExecutorFragment(Types._SubDataObject, NsdTables.Types._SubDataObject);

		private static final ExecutorFragment _TitledClass__DocumentedClass = new ExecutorFragment(Types._TitledClass, NsdTables.Types._DocumentedClass);
		private static final ExecutorFragment _TitledClass__NsdObject = new ExecutorFragment(Types._TitledClass, NsdTables.Types._NsdObject);
		private static final ExecutorFragment _TitledClass__OclAny = new ExecutorFragment(Types._TitledClass, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TitledClass__OclElement = new ExecutorFragment(Types._TitledClass, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TitledClass__TitledClass = new ExecutorFragment(Types._TitledClass, NsdTables.Types._TitledClass);

		private static final ExecutorFragment _UndefinedAttributeTypeKind__OclAny = new ExecutorFragment(Types._UndefinedAttributeTypeKind, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UndefinedAttributeTypeKind__OclElement = new ExecutorFragment(Types._UndefinedAttributeTypeKind, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UndefinedAttributeTypeKind__OclEnumeration = new ExecutorFragment(Types._UndefinedAttributeTypeKind, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _UndefinedAttributeTypeKind__OclType = new ExecutorFragment(Types._UndefinedAttributeTypeKind, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _UndefinedAttributeTypeKind__UndefinedAttributeTypeKind = new ExecutorFragment(Types._UndefinedAttributeTypeKind, NsdTables.Types._UndefinedAttributeTypeKind);

		private static final ExecutorFragment _UndefinedAttributeTypeKindObject__OclAny = new ExecutorFragment(Types._UndefinedAttributeTypeKindObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UndefinedAttributeTypeKindObject__UndefinedAttributeTypeKindObject = new ExecutorFragment(Types._UndefinedAttributeTypeKindObject, NsdTables.Types._UndefinedAttributeTypeKindObject);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _IRiseClipseConsole = TypeUtil.createParameterTypes(NsdTables.Types._IRiseClipseConsole);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _AnyLNClass__getName = new ExecutorOperation("getName", TypeUtil.EMPTY_PARAMETER_TYPES, Types._AnyLNClass,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _AnyLNClass__getParentLNClasses = new ExecutorOperation("getParentLNClasses", TypeUtil.EMPTY_PARAMETER_TYPES, Types._AnyLNClass,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _NsdObject__buildExplicitLinks = new ExecutorOperation("buildExplicitLinks", Parameters._IRiseClipseConsole, Types._NsdObject,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Abbreviation__descID = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATION__DESC_ID, Types._Abbreviation, 0);
		public static final ExecutorProperty _Abbreviation__name = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATION__NAME, Types._Abbreviation, 1);
		public static final ExecutorProperty _Abbreviation__parentAbbreviations = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATION__PARENT_ABBREVIATIONS, Types._Abbreviation, 2);
		public static final ExecutorProperty _Abbreviation__refersToDoc = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATION__REFERS_TO_DOC, Types._Abbreviation, 3);

		public static final ExecutorProperty _Abbreviations__abbreviation = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATIONS__ABBREVIATION, Types._Abbreviations, 0);
		public static final ExecutorProperty _Abbreviations__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATIONS__PARENT_NS, Types._Abbreviations, 1);
		public static final ExecutorProperty _Abbreviations__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.ABBREVIATIONS__PARENT_SERVICE_NS, Types._Abbreviations, 2);

		public static final ExecutorProperty _AbstractLNClass__name = new EcoreExecutorProperty(NsdPackage.Literals.ABSTRACT_LN_CLASS__NAME, Types._AbstractLNClass, 0);
		public static final ExecutorProperty _AbstractLNClass__parentLNClasses = new EcoreExecutorProperty(NsdPackage.Literals.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES, Types._AbstractLNClass, 1);
		public static final ExecutorProperty _AbstractLNClass__referredByAnyLNClass = new EcoreExecutorProperty(NsdPackage.Literals.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, Types._AbstractLNClass, 2);

		public static final ExecutorProperty _AgArray__isArray = new EcoreExecutorProperty(NsdPackage.Literals.AG_ARRAY__IS_ARRAY, Types._AgArray, 0);
		public static final ExecutorProperty _AgArray__maxIndexAttribute = new EcoreExecutorProperty(NsdPackage.Literals.AG_ARRAY__MAX_INDEX_ATTRIBUTE, Types._AgArray, 1);
		public static final ExecutorProperty _AgArray__minIndex = new EcoreExecutorProperty(NsdPackage.Literals.AG_ARRAY__MIN_INDEX, Types._AgArray, 2);
		public static final ExecutorProperty _AgArray__sizeAttribute = new EcoreExecutorProperty(NsdPackage.Literals.AG_ARRAY__SIZE_ATTRIBUTE, Types._AgArray, 3);

		public static final ExecutorProperty _AgAttributeType__refersToBasicType = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE, Types._AgAttributeType, 0);
		public static final ExecutorProperty _AgAttributeType__refersToConstructedAttribute = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, Types._AgAttributeType, 1);
		public static final ExecutorProperty _AgAttributeType__refersToEnumeration = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION, Types._AgAttributeType, 2);
		public static final ExecutorProperty _AgAttributeType__type = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE__TYPE, Types._AgAttributeType, 3);
		public static final ExecutorProperty _AgAttributeType__typeKind = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE__TYPE_KIND, Types._AgAttributeType, 4);

		public static final ExecutorProperty _AgAttributeTypeAndValues__defaultValue = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE, Types._AgAttributeTypeAndValues, 0);
		public static final ExecutorProperty _AgAttributeTypeAndValues__maxValue = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE, Types._AgAttributeTypeAndValues, 1);
		public static final ExecutorProperty _AgAttributeTypeAndValues__minValue = new EcoreExecutorProperty(NsdPackage.Literals.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE, Types._AgAttributeTypeAndValues, 2);

		public static final ExecutorProperty _AgNSIdentification__id = new EcoreExecutorProperty(NsdPackage.Literals.AG_NS_IDENTIFICATION__ID, Types._AgNSIdentification, 0);
		public static final ExecutorProperty _AgNSIdentification__publicationStage = new EcoreExecutorProperty(NsdPackage.Literals.AG_NS_IDENTIFICATION__PUBLICATION_STAGE, Types._AgNSIdentification, 1);
		public static final ExecutorProperty _AgNSIdentification__release = new EcoreExecutorProperty(NsdPackage.Literals.AG_NS_IDENTIFICATION__RELEASE, Types._AgNSIdentification, 2);
		public static final ExecutorProperty _AgNSIdentification__revision = new EcoreExecutorProperty(NsdPackage.Literals.AG_NS_IDENTIFICATION__REVISION, Types._AgNSIdentification, 3);
		public static final ExecutorProperty _AgNSIdentification__version = new EcoreExecutorProperty(NsdPackage.Literals.AG_NS_IDENTIFICATION__VERSION, Types._AgNSIdentification, 4);

		public static final ExecutorProperty _AgNSdesc__descID = new EcoreExecutorProperty(NsdPackage.Literals.AG_NSDESC__DESC_ID, Types._AgNSdesc, 0);
		public static final ExecutorProperty _AgNSdesc__refersToDoc = new EcoreExecutorProperty(NsdPackage.Literals.AG_NSDESC__REFERS_TO_DOC, Types._AgNSdesc, 1);

		public static final ExecutorProperty _AgPresenceCondition__presCond = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION__PRES_COND, Types._AgPresenceCondition, 0);
		public static final ExecutorProperty _AgPresenceCondition__presCondArgs = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION__PRES_COND_ARGS, Types._AgPresenceCondition, 1);
		public static final ExecutorProperty _AgPresenceCondition__presCondArgsID = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID, Types._AgPresenceCondition, 2);
		public static final ExecutorProperty _AgPresenceCondition__refersToPresCondArgsDoc = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC, Types._AgPresenceCondition, 3);

		public static final ExecutorProperty _AgPresenceConditionDerivedStatistics__dsPresCond = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND, Types._AgPresenceConditionDerivedStatistics, 0);
		public static final ExecutorProperty _AgPresenceConditionDerivedStatistics__dsPresCondArgs = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS, Types._AgPresenceConditionDerivedStatistics, 1);
		public static final ExecutorProperty _AgPresenceConditionDerivedStatistics__dsPresCondArgsID = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID, Types._AgPresenceConditionDerivedStatistics, 2);
		public static final ExecutorProperty _AgPresenceConditionDerivedStatistics__refersToDsPresCondArgsDoc = new EcoreExecutorProperty(NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC, Types._AgPresenceConditionDerivedStatistics, 3);

		public static final ExecutorProperty _AgTrgOp__dchg = new EcoreExecutorProperty(NsdPackage.Literals.AG_TRG_OP__DCHG, Types._AgTrgOp, 0);
		public static final ExecutorProperty _AgTrgOp__dupd = new EcoreExecutorProperty(NsdPackage.Literals.AG_TRG_OP__DUPD, Types._AgTrgOp, 1);
		public static final ExecutorProperty _AgTrgOp__qchg = new EcoreExecutorProperty(NsdPackage.Literals.AG_TRG_OP__QCHG, Types._AgTrgOp, 2);

		public static final ExecutorProperty _AgUML__umlDate = new EcoreExecutorProperty(NsdPackage.Literals.AG_UML__UML_DATE, Types._AgUML, 0);
		public static final ExecutorProperty _AgUML__umlVersion = new EcoreExecutorProperty(NsdPackage.Literals.AG_UML__UML_VERSION, Types._AgUML, 1);

		public static final ExecutorProperty _AgUnderlyingType__refersToUnderlyingBasicType = new EcoreExecutorProperty(NsdPackage.Literals.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE, Types._AgUnderlyingType, 0);
		public static final ExecutorProperty _AgUnderlyingType__refersToUnderlyingConstructedAttribute = new EcoreExecutorProperty(NsdPackage.Literals.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE, Types._AgUnderlyingType, 1);
		public static final ExecutorProperty _AgUnderlyingType__refersToUnderlyingEnumeration = new EcoreExecutorProperty(NsdPackage.Literals.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION, Types._AgUnderlyingType, 2);
		public static final ExecutorProperty _AgUnderlyingType__underlyingType = new EcoreExecutorProperty(NsdPackage.Literals.AG_UNDERLYING_TYPE__UNDERLYING_TYPE, Types._AgUnderlyingType, 3);
		public static final ExecutorProperty _AgUnderlyingType__underlyingTypeKind = new EcoreExecutorProperty(NsdPackage.Literals.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND, Types._AgUnderlyingType, 4);

		public static final ExecutorProperty _AnyLNClass__base = new EcoreExecutorProperty(NsdPackage.Literals.ANY_LN_CLASS__BASE, Types._AnyLNClass, 0);
		public static final ExecutorProperty _AnyLNClass__dataObject = new EcoreExecutorProperty(NsdPackage.Literals.ANY_LN_CLASS__DATA_OBJECT, Types._AnyLNClass, 1);
		public static final ExecutorProperty _AnyLNClass__refersToAbstractLNClass = new EcoreExecutorProperty(NsdPackage.Literals.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, Types._AnyLNClass, 2);

		public static final ExecutorProperty _ApplicableServiceNS__date = new EcoreExecutorProperty(NsdPackage.Literals.APPLICABLE_SERVICE_NS__DATE, Types._ApplicableServiceNS, 0);
		public static final ExecutorProperty _ApplicableServiceNS__serviceNsUsage = new EcoreExecutorProperty(NsdPackage.Literals.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE, Types._ApplicableServiceNS, 1);
		public static final ExecutorProperty _ApplicableServiceNS__version = new EcoreExecutorProperty(NsdPackage.Literals.APPLICABLE_SERVICE_NS__VERSION, Types._ApplicableServiceNS, 2);
		public static final ExecutorProperty _ApplicableServiceNS__DocumentRoot__applicableServiceNS = new ExecutorPropertyWithImplementation("DocumentRoot", Types._ApplicableServiceNS, 3, new EcoreLibraryOppositeProperty(NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS));

		public static final ExecutorProperty _ApplicableServices__dataSetMemberOf = new EcoreExecutorProperty(NsdPackage.Literals.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF, Types._ApplicableServices, 0);
		public static final ExecutorProperty _ApplicableServices__parentFunctionalConstraint = new EcoreExecutorProperty(NsdPackage.Literals.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT, Types._ApplicableServices, 1);
		public static final ExecutorProperty _ApplicableServices__service = new EcoreExecutorProperty(NsdPackage.Literals.APPLICABLE_SERVICES__SERVICE, Types._ApplicableServices, 2);

		public static final ExecutorProperty _AppliesToType__parentServiceNsUsage = new EcoreExecutorProperty(NsdPackage.Literals.APPLIES_TO_TYPE__PARENT_SERVICE_NS_USAGE, Types._AppliesToType, 0);

		public static final ExecutorProperty _BasicType__descID = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPE__DESC_ID, Types._BasicType, 0);
		public static final ExecutorProperty _BasicType__name = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPE__NAME, Types._BasicType, 1);
		public static final ExecutorProperty _BasicType__parentBasicTypes = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPE__PARENT_BASIC_TYPES, Types._BasicType, 2);
		public static final ExecutorProperty _BasicType__referredByAttributeType = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, Types._BasicType, 3);
		public static final ExecutorProperty _BasicType__referredByUnderlyingType = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, Types._BasicType, 4);
		public static final ExecutorProperty _BasicType__refersToDoc = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPE__REFERS_TO_DOC, Types._BasicType, 5);

		public static final ExecutorProperty _BasicTypes__basicType = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPES__BASIC_TYPE, Types._BasicTypes, 0);
		public static final ExecutorProperty _BasicTypes__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.BASIC_TYPES__PARENT_NS, Types._BasicTypes, 1);

		public static final ExecutorProperty _CDC__dataAttribute = new EcoreExecutorProperty(NsdPackage.Literals.CDC__DATA_ATTRIBUTE, Types._CDC, 0);
		public static final ExecutorProperty _CDC__enumParameterized = new EcoreExecutorProperty(NsdPackage.Literals.CDC__ENUM_PARAMETERIZED, Types._CDC, 1);
		public static final ExecutorProperty _CDC__name = new EcoreExecutorProperty(NsdPackage.Literals.CDC__NAME, Types._CDC, 2);
		public static final ExecutorProperty _CDC__parentCDCs = new EcoreExecutorProperty(NsdPackage.Literals.CDC__PARENT_CD_CS, Types._CDC, 3);
		public static final ExecutorProperty _CDC__referredByDataObject = new EcoreExecutorProperty(NsdPackage.Literals.CDC__REFERRED_BY_DATA_OBJECT, Types._CDC, 4);
		public static final ExecutorProperty _CDC__referredBySubDataObject = new EcoreExecutorProperty(NsdPackage.Literals.CDC__REFERRED_BY_SUB_DATA_OBJECT, Types._CDC, 5);
		public static final ExecutorProperty _CDC__serviceParameter = new EcoreExecutorProperty(NsdPackage.Literals.CDC__SERVICE_PARAMETER, Types._CDC, 6);
		public static final ExecutorProperty _CDC__statistics = new EcoreExecutorProperty(NsdPackage.Literals.CDC__STATISTICS, Types._CDC, 7);
		public static final ExecutorProperty _CDC__subDataObject = new EcoreExecutorProperty(NsdPackage.Literals.CDC__SUB_DATA_OBJECT, Types._CDC, 8);
		public static final ExecutorProperty _CDC__typeKindParameterized = new EcoreExecutorProperty(NsdPackage.Literals.CDC__TYPE_KIND_PARAMETERIZED, Types._CDC, 9);
		public static final ExecutorProperty _CDC__variant = new EcoreExecutorProperty(NsdPackage.Literals.CDC__VARIANT, Types._CDC, 10);

		public static final ExecutorProperty _CDCs__cDC = new EcoreExecutorProperty(NsdPackage.Literals.CD_CS__CDC, Types._CDCs, 0);
		public static final ExecutorProperty _CDCs__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.CD_CS__PARENT_NS, Types._CDCs, 1);

		public static final ExecutorProperty _Changes__changesID = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__CHANGES_ID, Types._Changes, 0);
		public static final ExecutorProperty _Changes__date = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__DATE, Types._Changes, 1);
		public static final ExecutorProperty _Changes__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__PARENT_NS, Types._Changes, 2);
		public static final ExecutorProperty _Changes__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__PARENT_SERVICE_NS, Types._Changes, 3);
		public static final ExecutorProperty _Changes__release = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__RELEASE, Types._Changes, 4);
		public static final ExecutorProperty _Changes__revision = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__REVISION, Types._Changes, 5);
		public static final ExecutorProperty _Changes__tissues = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__TISSUES, Types._Changes, 6);
		public static final ExecutorProperty _Changes__version = new EcoreExecutorProperty(NsdPackage.Literals.CHANGES__VERSION, Types._Changes, 7);

		public static final ExecutorProperty _ConstructedAttribute__name = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE__NAME, Types._ConstructedAttribute, 0);
		public static final ExecutorProperty _ConstructedAttribute__parentConstructedAttributes = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTES, Types._ConstructedAttribute, 1);
		public static final ExecutorProperty _ConstructedAttribute__parentServiceTypeRealizations = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_TYPE_REALIZATIONS, Types._ConstructedAttribute, 2);
		public static final ExecutorProperty _ConstructedAttribute__referredByAttributeType = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, Types._ConstructedAttribute, 3);
		public static final ExecutorProperty _ConstructedAttribute__referredByUnderlyingType = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, Types._ConstructedAttribute, 4);
		public static final ExecutorProperty _ConstructedAttribute__subDataAttribute = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE, Types._ConstructedAttribute, 5);

		public static final ExecutorProperty _ConstructedAttributes__constructedAttribute = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE, Types._ConstructedAttributes, 0);
		public static final ExecutorProperty _ConstructedAttributes__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.CONSTRUCTED_ATTRIBUTES__PARENT_NS, Types._ConstructedAttributes, 1);

		public static final ExecutorProperty _CopyrightNotice__license = new EcoreExecutorProperty(NsdPackage.Literals.COPYRIGHT_NOTICE__LICENSE, Types._CopyrightNotice, 0);
		public static final ExecutorProperty _CopyrightNotice__notice = new EcoreExecutorProperty(NsdPackage.Literals.COPYRIGHT_NOTICE__NOTICE, Types._CopyrightNotice, 1);
		public static final ExecutorProperty _CopyrightNotice__parentCopyrighted = new EcoreExecutorProperty(NsdPackage.Literals.COPYRIGHT_NOTICE__PARENT_COPYRIGHTED, Types._CopyrightNotice, 2);

		public static final ExecutorProperty _Copyrighted__copyright = new EcoreExecutorProperty(NsdPackage.Literals.COPYRIGHTED__COPYRIGHT, Types._Copyrighted, 0);

		public static final ExecutorProperty _DataAttribute__fc = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__FC, Types._DataAttribute, 0);
		public static final ExecutorProperty _DataAttribute__name = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__NAME, Types._DataAttribute, 1);
		public static final ExecutorProperty _DataAttribute__parentCDC = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__PARENT_CDC, Types._DataAttribute, 2);
		public static final ExecutorProperty _DataAttribute__referredByDataAttributeAsMaxIndexAttribute = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE, Types._DataAttribute, 3);
		public static final ExecutorProperty _DataAttribute__referredByDataAttributeAsSizeAttribute = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE, Types._DataAttribute, 4);
		public static final ExecutorProperty _DataAttribute__referredBySubDataObjectAsMaxIndexAttribute = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE, Types._DataAttribute, 5);
		public static final ExecutorProperty _DataAttribute__referredBySubDataObjectAsSizeAttribute = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE, Types._DataAttribute, 6);
		public static final ExecutorProperty _DataAttribute__refersToFunctionalConstraint = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT, Types._DataAttribute, 7);
		public static final ExecutorProperty _DataAttribute__refersToMaxIndexAttribute = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE, Types._DataAttribute, 8);
		public static final ExecutorProperty _DataAttribute__refersToPresenceCondition = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, Types._DataAttribute, 9);
		public static final ExecutorProperty _DataAttribute__refersToSizeAttribute = new EcoreExecutorProperty(NsdPackage.Literals.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE, Types._DataAttribute, 10);

		public static final ExecutorProperty _DataObject__name = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__NAME, Types._DataObject, 0);
		public static final ExecutorProperty _DataObject__parentAnyLNClass = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__PARENT_ANY_LN_CLASS, Types._DataObject, 1);
		public static final ExecutorProperty _DataObject__refersToCDC = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__REFERS_TO_CDC, Types._DataObject, 2);
		public static final ExecutorProperty _DataObject__refersToPresenceCondition = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, Types._DataObject, 3);
		public static final ExecutorProperty _DataObject__refersToPresenceConditionDerivedStatistics = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS, Types._DataObject, 4);
		public static final ExecutorProperty _DataObject__transient = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__TRANSIENT, Types._DataObject, 5);
		public static final ExecutorProperty _DataObject__type = new EcoreExecutorProperty(NsdPackage.Literals.DATA_OBJECT__TYPE, Types._DataObject, 6);

		public static final ExecutorProperty _DataSetMemberOf__cb = new EcoreExecutorProperty(NsdPackage.Literals.DATA_SET_MEMBER_OF__CB, Types._DataSetMemberOf, 0);
		public static final ExecutorProperty _DataSetMemberOf__parentApplicableServices = new EcoreExecutorProperty(NsdPackage.Literals.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES, Types._DataSetMemberOf, 1);

		public static final ExecutorProperty _DependsOn__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.DEPENDS_ON__PARENT_NS, Types._DependsOn, 0);
		public static final ExecutorProperty _DependsOn__refersToNS = new EcoreExecutorProperty(NsdPackage.Literals.DEPENDS_ON__REFERS_TO_NS, Types._DependsOn, 1);

		public static final ExecutorProperty _Doc__ReferredByAgNSDesc = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_AG_NS_DESC, Types._Doc, 0);
		public static final ExecutorProperty _Doc__any = new EcoreExecutorProperty(NsdPackage.Literals.DOC__ANY, Types._Doc, 1);
		public static final ExecutorProperty _Doc__group = new EcoreExecutorProperty(NsdPackage.Literals.DOC__GROUP, Types._Doc, 2);
		public static final ExecutorProperty _Doc__id = new EcoreExecutorProperty(NsdPackage.Literals.DOC__ID, Types._Doc, 3);
		public static final ExecutorProperty _Doc__mixed = new EcoreExecutorProperty(NsdPackage.Literals.DOC__MIXED, Types._Doc, 4);
		public static final ExecutorProperty _Doc__parentNSDoc = new EcoreExecutorProperty(NsdPackage.Literals.DOC__PARENT_NS_DOC, Types._Doc, 5);
		public static final ExecutorProperty _Doc__referredByAbbreviation = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_ABBREVIATION, Types._Doc, 6);
		public static final ExecutorProperty _Doc__referredByAgPresenceCondition = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Types._Doc, 7);
		public static final ExecutorProperty _Doc__referredByAgPresenceConditionDerivedStatistics = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Types._Doc, 8);
		public static final ExecutorProperty _Doc__referredByBasicType = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_BASIC_TYPE, Types._Doc, 9);
		public static final ExecutorProperty _Doc__referredByDocumentedClass = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_DOCUMENTED_CLASS, Types._Doc, 10);
		public static final ExecutorProperty _Doc__referredByFunctionalConstraintAsDesc = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_DESC, Types._Doc, 11);
		public static final ExecutorProperty _Doc__referredByFunctionalConstraintAsTitle = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT_AS_TITLE, Types._Doc, 12);
		public static final ExecutorProperty _Doc__referredByPresenceConditionAsDesc = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC, Types._Doc, 13);
		public static final ExecutorProperty _Doc__referredByPresenceConditionAsTitle = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE, Types._Doc, 14);
		public static final ExecutorProperty _Doc__referredByTitledClass = new EcoreExecutorProperty(NsdPackage.Literals.DOC__REFERRED_BY_TITLED_CLASS, Types._Doc, 15);

		public static final ExecutorProperty _DocumentRoot__applicableServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__APPLICABLE_SERVICE_NS, Types._DocumentRoot, 0);
		public static final ExecutorProperty _DocumentRoot__mixed = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__MIXED, Types._DocumentRoot, 1);
		public static final ExecutorProperty _DocumentRoot__nS = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__NS, Types._DocumentRoot, 2);
		public static final ExecutorProperty _DocumentRoot__nSDoc = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC, Types._DocumentRoot, 3);
		public static final ExecutorProperty _DocumentRoot__serviceNS = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS, Types._DocumentRoot, 4);
		public static final ExecutorProperty _DocumentRoot__xMLNSPrefixMap = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__XMLNS_PREFIX_MAP, Types._DocumentRoot, 5);
		public static final ExecutorProperty _DocumentRoot__xSISchemaLocation = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION, Types._DocumentRoot, 6);

		public static final ExecutorProperty _DocumentedClass__deprecated = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENTED_CLASS__DEPRECATED, Types._DocumentedClass, 0);
		public static final ExecutorProperty _DocumentedClass__descID = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENTED_CLASS__DESC_ID, Types._DocumentedClass, 1);
		public static final ExecutorProperty _DocumentedClass__informative = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENTED_CLASS__INFORMATIVE, Types._DocumentedClass, 2);
		public static final ExecutorProperty _DocumentedClass__refersToDescDoc = new EcoreExecutorProperty(NsdPackage.Literals.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC, Types._DocumentedClass, 3);

		public static final ExecutorProperty _Enumeration__inheritedFrom = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__INHERITED_FROM, Types._Enumeration, 0);
		public static final ExecutorProperty _Enumeration__literal = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__LITERAL, Types._Enumeration, 1);
		public static final ExecutorProperty _Enumeration__name = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__NAME, Types._Enumeration, 2);
		public static final ExecutorProperty _Enumeration__parentEnumerations = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__PARENT_ENUMERATIONS, Types._Enumeration, 3);
		public static final ExecutorProperty _Enumeration__referredByAttributeType = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Types._Enumeration, 4);
		public static final ExecutorProperty _Enumeration__referredByEnumerationAsBase = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE, Types._Enumeration, 5);
		public static final ExecutorProperty _Enumeration__referredByUnderlyingType = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Types._Enumeration, 6);
		public static final ExecutorProperty _Enumeration__refersToBaseEnumeration = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATION__REFERS_TO_BASE_ENUMERATION, Types._Enumeration, 7);

		public static final ExecutorProperty _Enumerations__enumeration = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATIONS__ENUMERATION, Types._Enumerations, 0);
		public static final ExecutorProperty _Enumerations__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.ENUMERATIONS__PARENT_NS, Types._Enumerations, 1);

		public static final ExecutorProperty _FunctionalConstraint__abbreviation = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__ABBREVIATION, Types._FunctionalConstraint, 0);
		public static final ExecutorProperty _FunctionalConstraint__applicableServices = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, Types._FunctionalConstraint, 1);
		public static final ExecutorProperty _FunctionalConstraint__descID = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__DESC_ID, Types._FunctionalConstraint, 2);
		public static final ExecutorProperty _FunctionalConstraint__parentFunctionalConstraints = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS, Types._FunctionalConstraint, 3);
		public static final ExecutorProperty _FunctionalConstraint__referredByDataAttribute = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE, Types._FunctionalConstraint, 4);
		public static final ExecutorProperty _FunctionalConstraint__refersToDescDoc = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__REFERS_TO_DESC_DOC, Types._FunctionalConstraint, 5);
		public static final ExecutorProperty _FunctionalConstraint__refersToTitleDoc = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__REFERS_TO_TITLE_DOC, Types._FunctionalConstraint, 6);
		public static final ExecutorProperty _FunctionalConstraint__titleID = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINT__TITLE_ID, Types._FunctionalConstraint, 7);

		public static final ExecutorProperty _FunctionalConstraints__functionalConstraint = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT, Types._FunctionalConstraints, 0);
		public static final ExecutorProperty _FunctionalConstraints__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINTS__PARENT_NS, Types._FunctionalConstraints, 1);
		public static final ExecutorProperty _FunctionalConstraints__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS, Types._FunctionalConstraints, 2);

		public static final ExecutorProperty _LNClass__canHaveLOG = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASS__CAN_HAVE_LOG, Types._LNClass, 0);
		public static final ExecutorProperty _LNClass__isExtension = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASS__IS_EXTENSION, Types._LNClass, 1);
		public static final ExecutorProperty _LNClass__name = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASS__NAME, Types._LNClass, 2);
		public static final ExecutorProperty _LNClass__parentLNClasses = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASS__PARENT_LN_CLASSES, Types._LNClass, 3);

		public static final ExecutorProperty _LNClasses__abstractLNClass = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASSES__ABSTRACT_LN_CLASS, Types._LNClasses, 0);
		public static final ExecutorProperty _LNClasses__lNClass = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASSES__LN_CLASS, Types._LNClasses, 1);
		public static final ExecutorProperty _LNClasses__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.LN_CLASSES__PARENT_NS, Types._LNClasses, 2);

		public static final ExecutorProperty _License__kind = new EcoreExecutorProperty(NsdPackage.Literals.LICENSE__KIND, Types._License, 0);
		public static final ExecutorProperty _License__mixed = new EcoreExecutorProperty(NsdPackage.Literals.LICENSE__MIXED, Types._License, 1);
		public static final ExecutorProperty _License__parentCopyrightNotice = new EcoreExecutorProperty(NsdPackage.Literals.LICENSE__PARENT_COPYRIGHT_NOTICE, Types._License, 2);
		public static final ExecutorProperty _License__uri = new EcoreExecutorProperty(NsdPackage.Literals.LICENSE__URI, Types._License, 3);

		public static final ExecutorProperty _Literal__literalVal = new EcoreExecutorProperty(NsdPackage.Literals.LITERAL__LITERAL_VAL, Types._Literal, 0);
		public static final ExecutorProperty _Literal__name = new EcoreExecutorProperty(NsdPackage.Literals.LITERAL__NAME, Types._Literal, 1);
		public static final ExecutorProperty _Literal__parentEnumeration = new EcoreExecutorProperty(NsdPackage.Literals.LITERAL__PARENT_ENUMERATION, Types._Literal, 2);

		public static final ExecutorProperty _NS__abbreviations = new EcoreExecutorProperty(NsdPackage.Literals.NS__ABBREVIATIONS, Types._NS, 0);
		public static final ExecutorProperty _NS__basicTypes = new EcoreExecutorProperty(NsdPackage.Literals.NS__BASIC_TYPES, Types._NS, 1);
		public static final ExecutorProperty _NS__cDCs = new EcoreExecutorProperty(NsdPackage.Literals.NS__CD_CS, Types._NS, 2);
		public static final ExecutorProperty _NS__changes = new EcoreExecutorProperty(NsdPackage.Literals.NS__CHANGES, Types._NS, 3);
		public static final ExecutorProperty _NS__constructedAttributes = new EcoreExecutorProperty(NsdPackage.Literals.NS__CONSTRUCTED_ATTRIBUTES, Types._NS, 4);
		public static final ExecutorProperty _NS__dependsOn = new EcoreExecutorProperty(NsdPackage.Literals.NS__DEPENDS_ON, Types._NS, 5);
		public static final ExecutorProperty _NS__enumerations = new EcoreExecutorProperty(NsdPackage.Literals.NS__ENUMERATIONS, Types._NS, 6);
		public static final ExecutorProperty _NS__functionalConstraints = new EcoreExecutorProperty(NsdPackage.Literals.NS__FUNCTIONAL_CONSTRAINTS, Types._NS, 7);
		public static final ExecutorProperty _NS__lNClasses = new EcoreExecutorProperty(NsdPackage.Literals.NS__LN_CLASSES, Types._NS, 8);
		public static final ExecutorProperty _NS__presenceConditions = new EcoreExecutorProperty(NsdPackage.Literals.NS__PRESENCE_CONDITIONS, Types._NS, 9);
		public static final ExecutorProperty _NS__referredByDependsOn = new EcoreExecutorProperty(NsdPackage.Literals.NS__REFERRED_BY_DEPENDS_ON, Types._NS, 10);
		public static final ExecutorProperty _NS__DocumentRoot__nS = new ExecutorPropertyWithImplementation("DocumentRoot", Types._NS, 11, new EcoreLibraryOppositeProperty(NsdPackage.Literals.DOCUMENT_ROOT__NS));

		public static final ExecutorProperty _NSDoc__doc = new EcoreExecutorProperty(NsdPackage.Literals.NS_DOC__DOC, Types._NSDoc, 0);
		public static final ExecutorProperty _NSDoc__lang = new EcoreExecutorProperty(NsdPackage.Literals.NS_DOC__LANG, Types._NSDoc, 1);
		public static final ExecutorProperty _NSDoc__DocumentRoot__nSDoc = new ExecutorPropertyWithImplementation("DocumentRoot", Types._NSDoc, 2, new EcoreLibraryOppositeProperty(NsdPackage.Literals.DOCUMENT_ROOT__NS_DOC));

		public static final ExecutorProperty _Notice__mixed = new EcoreExecutorProperty(NsdPackage.Literals.NOTICE__MIXED, Types._Notice, 0);
		public static final ExecutorProperty _Notice__parentCopyrightNotice = new EcoreExecutorProperty(NsdPackage.Literals.NOTICE__PARENT_COPYRIGHT_NOTICE, Types._Notice, 1);

		public static final ExecutorProperty _NsdObject__explicitLinksBuilt = new EcoreExecutorProperty(NsdPackage.Literals.NSD_OBJECT__EXPLICIT_LINKS_BUILT, Types._NsdObject, 0);
		public static final ExecutorProperty _NsdObject__lineNumber = new EcoreExecutorProperty(NsdPackage.Literals.NSD_OBJECT__LINE_NUMBER, Types._NsdObject, 1);

		public static final ExecutorProperty _PresenceCondition__argument = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__ARGUMENT, Types._PresenceCondition, 0);
		public static final ExecutorProperty _PresenceCondition__descID = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__DESC_ID, Types._PresenceCondition, 1);
		public static final ExecutorProperty _PresenceCondition__name = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__NAME, Types._PresenceCondition, 2);
		public static final ExecutorProperty _PresenceCondition__parentPresenceConditions = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS, Types._PresenceCondition, 3);
		public static final ExecutorProperty _PresenceCondition__referredByDataAttribute = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE, Types._PresenceCondition, 4);
		public static final ExecutorProperty _PresenceCondition__referredByDataObject = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT, Types._PresenceCondition, 5);
		public static final ExecutorProperty _PresenceCondition__referredByDataObjectForDerivedStatistics = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS, Types._PresenceCondition, 6);
		public static final ExecutorProperty _PresenceCondition__referredBySubDataAttribute = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE, Types._PresenceCondition, 7);
		public static final ExecutorProperty _PresenceCondition__referredBySubDataObject = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT, Types._PresenceCondition, 8);
		public static final ExecutorProperty _PresenceCondition__refersToDescDoc = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERS_TO_DESC_DOC, Types._PresenceCondition, 9);
		public static final ExecutorProperty _PresenceCondition__refersToTitleDoc = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC, Types._PresenceCondition, 10);
		public static final ExecutorProperty _PresenceCondition__titleID = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITION__TITLE_ID, Types._PresenceCondition, 11);

		public static final ExecutorProperty _PresenceConditions__parentNS = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITIONS__PARENT_NS, Types._PresenceConditions, 0);
		public static final ExecutorProperty _PresenceConditions__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITIONS__PARENT_SERVICE_NS, Types._PresenceConditions, 1);
		public static final ExecutorProperty _PresenceConditions__presenceCondition = new EcoreExecutorProperty(NsdPackage.Literals.PRESENCE_CONDITIONS__PRESENCE_CONDITION, Types._PresenceConditions, 2);

		public static final ExecutorProperty _ServiceCDC__cdc = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CDC__CDC, Types._ServiceCDC, 0);
		public static final ExecutorProperty _ServiceCDC__parentServiceCDCs = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CDC__PARENT_SERVICE_CD_CS, Types._ServiceCDC, 1);
		public static final ExecutorProperty _ServiceCDC__serviceDataAttribute = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE, Types._ServiceCDC, 2);
		public static final ExecutorProperty _ServiceCDC__variant = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CDC__VARIANT, Types._ServiceCDC, 3);

		public static final ExecutorProperty _ServiceCDCs__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CD_CS__PARENT_SERVICE_NS, Types._ServiceCDCs, 0);
		public static final ExecutorProperty _ServiceCDCs__serviceCDC = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CD_CS__SERVICE_CDC, Types._ServiceCDCs, 1);

		public static final ExecutorProperty _ServiceConstructedAttribute__parentServiceConstructedAttributes = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTE__PARENT_SERVICE_CONSTRUCTED_ATTRIBUTES, Types._ServiceConstructedAttribute, 0);
		public static final ExecutorProperty _ServiceConstructedAttribute__typeKindParameterized = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED, Types._ServiceConstructedAttribute, 1);

		public static final ExecutorProperty _ServiceConstructedAttributes__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTES__PARENT_SERVICE_NS, Types._ServiceConstructedAttributes, 0);
		public static final ExecutorProperty _ServiceConstructedAttributes__serviceConstructedAttribute = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE, Types._ServiceConstructedAttributes, 1);

		public static final ExecutorProperty _ServiceDataAttribute__fc = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE__FC, Types._ServiceDataAttribute, 0);
		public static final ExecutorProperty _ServiceDataAttribute__name = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE__NAME, Types._ServiceDataAttribute, 1);
		public static final ExecutorProperty _ServiceDataAttribute__parentServiceCDC = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC, Types._ServiceDataAttribute, 2);

		public static final ExecutorProperty _ServiceNS__abbreviations = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__ABBREVIATIONS, Types._ServiceNS, 0);
		public static final ExecutorProperty _ServiceNS__changes = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__CHANGES, Types._ServiceNS, 1);
		public static final ExecutorProperty _ServiceNS__functionalConstraints = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, Types._ServiceNS, 2);
		public static final ExecutorProperty _ServiceNS__presenceConditions = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__PRESENCE_CONDITIONS, Types._ServiceNS, 3);
		public static final ExecutorProperty _ServiceNS__serviceCDCs = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__SERVICE_CD_CS, Types._ServiceNS, 4);
		public static final ExecutorProperty _ServiceNS__serviceConstructedAttributes = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, Types._ServiceNS, 5);
		public static final ExecutorProperty _ServiceNS__serviceTypeRealizations = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, Types._ServiceNS, 6);
		public static final ExecutorProperty _ServiceNS__DocumentRoot__serviceNS = new ExecutorPropertyWithImplementation("DocumentRoot", Types._ServiceNS, 7, new EcoreLibraryOppositeProperty(NsdPackage.Literals.DOCUMENT_ROOT__SERVICE_NS));

		public static final ExecutorProperty _ServiceNsUsage__appliesTo = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS_USAGE__APPLIES_TO, Types._ServiceNsUsage, 0);
		public static final ExecutorProperty _ServiceNsUsage__parentApplicableServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS, Types._ServiceNsUsage, 1);

		public static final ExecutorProperty _ServiceParameter__name = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_PARAMETER__NAME, Types._ServiceParameter, 0);
		public static final ExecutorProperty _ServiceParameter__parentCDC = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_PARAMETER__PARENT_CDC, Types._ServiceParameter, 1);

		public static final ExecutorProperty _ServiceType__name = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_TYPE__NAME, Types._ServiceType, 0);
		public static final ExecutorProperty _ServiceType__parentApplicableServices = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_TYPE__PARENT_APPLICABLE_SERVICES, Types._ServiceType, 1);

		public static final ExecutorProperty _ServiceTypeRealizations__parentServiceNS = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS, Types._ServiceTypeRealizations, 0);
		public static final ExecutorProperty _ServiceTypeRealizations__serviceTypeRealization = new EcoreExecutorProperty(NsdPackage.Literals.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION, Types._ServiceTypeRealizations, 1);

		public static final ExecutorProperty _SubDataAttribute__name = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_ATTRIBUTE__NAME, Types._SubDataAttribute, 0);
		public static final ExecutorProperty _SubDataAttribute__parentConstructedAttribute = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE, Types._SubDataAttribute, 1);
		public static final ExecutorProperty _SubDataAttribute__refersToPresenceCondition = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, Types._SubDataAttribute, 2);

		public static final ExecutorProperty _SubDataObject__name = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__NAME, Types._SubDataObject, 0);
		public static final ExecutorProperty _SubDataObject__parentCDC = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__PARENT_CDC, Types._SubDataObject, 1);
		public static final ExecutorProperty _SubDataObject__refersToCDC = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_CDC, Types._SubDataObject, 2);
		public static final ExecutorProperty _SubDataObject__refersToMaxIndexAttribute = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE, Types._SubDataObject, 3);
		public static final ExecutorProperty _SubDataObject__refersToPresenceCondition = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, Types._SubDataObject, 4);
		public static final ExecutorProperty _SubDataObject__refersToSizeAttribute = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE, Types._SubDataObject, 5);
		public static final ExecutorProperty _SubDataObject__type = new EcoreExecutorProperty(NsdPackage.Literals.SUB_DATA_OBJECT__TYPE, Types._SubDataObject, 6);

		public static final ExecutorProperty _TitledClass__refersToTitleDoc = new EcoreExecutorProperty(NsdPackage.Literals.TITLED_CLASS__REFERS_TO_TITLE_DOC, Types._TitledClass, 0);
		public static final ExecutorProperty _TitledClass__titleID = new EcoreExecutorProperty(NsdPackage.Literals.TITLED_CLASS__TITLE_ID, Types._TitledClass, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _ACSIServicesKind =
			{
				Fragments._ACSIServicesKind__OclAny /* 0 */,
				Fragments._ACSIServicesKind__OclElement /* 1 */,
				Fragments._ACSIServicesKind__OclType /* 2 */,
				Fragments._ACSIServicesKind__OclEnumeration /* 3 */,
				Fragments._ACSIServicesKind__ACSIServicesKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __ACSIServicesKind = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ACSIServicesKindObject =
			{
				Fragments._ACSIServicesKindObject__OclAny /* 0 */,
				Fragments._ACSIServicesKindObject__ACSIServicesKindObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __ACSIServicesKindObject = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Abbreviation =
			{
				Fragments._Abbreviation__OclAny /* 0 */,
				Fragments._Abbreviation__OclElement /* 1 */,
				Fragments._Abbreviation__NsdObject /* 2 */,
				Fragments._Abbreviation__Abbreviation /* 3 */
			};
		private static final int /*@NonNull*/ [] __Abbreviation = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Abbreviations =
			{
				Fragments._Abbreviations__OclAny /* 0 */,
				Fragments._Abbreviations__OclElement /* 1 */,
				Fragments._Abbreviations__NsdObject /* 2 */,
				Fragments._Abbreviations__Abbreviations /* 3 */
			};
		private static final int /*@NonNull*/ [] __Abbreviations = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AbstractLNClass =
			{
				Fragments._AbstractLNClass__OclAny /* 0 */,
				Fragments._AbstractLNClass__OclElement /* 1 */,
				Fragments._AbstractLNClass__NsdObject /* 2 */,
				Fragments._AbstractLNClass__DocumentedClass /* 3 */,
				Fragments._AbstractLNClass__TitledClass /* 4 */,
				Fragments._AbstractLNClass__AnyLNClass /* 5 */,
				Fragments._AbstractLNClass__AbstractLNClass /* 6 */
			};
		private static final int /*@NonNull*/ [] __AbstractLNClass = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgArray =
			{
				Fragments._AgArray__OclAny /* 0 */,
				Fragments._AgArray__OclElement /* 1 */,
				Fragments._AgArray__AgArray /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgArray = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgAttributeType =
			{
				Fragments._AgAttributeType__OclAny /* 0 */,
				Fragments._AgAttributeType__OclElement /* 1 */,
				Fragments._AgAttributeType__AgAttributeType /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgAttributeType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgAttributeTypeAndValues =
			{
				Fragments._AgAttributeTypeAndValues__OclAny /* 0 */,
				Fragments._AgAttributeTypeAndValues__OclElement /* 1 */,
				Fragments._AgAttributeTypeAndValues__AgAttributeType /* 2 */,
				Fragments._AgAttributeTypeAndValues__AgAttributeTypeAndValues /* 3 */
			};
		private static final int /*@NonNull*/ [] __AgAttributeTypeAndValues = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgNSIdentification =
			{
				Fragments._AgNSIdentification__OclAny /* 0 */,
				Fragments._AgNSIdentification__OclElement /* 1 */,
				Fragments._AgNSIdentification__AgNSIdentification /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgNSIdentification = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgNSdesc =
			{
				Fragments._AgNSdesc__OclAny /* 0 */,
				Fragments._AgNSdesc__OclElement /* 1 */,
				Fragments._AgNSdesc__AgNSdesc /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgNSdesc = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgPresenceCondition =
			{
				Fragments._AgPresenceCondition__OclAny /* 0 */,
				Fragments._AgPresenceCondition__OclElement /* 1 */,
				Fragments._AgPresenceCondition__AgPresenceCondition /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgPresenceCondition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgPresenceConditionDerivedStatistics =
			{
				Fragments._AgPresenceConditionDerivedStatistics__OclAny /* 0 */,
				Fragments._AgPresenceConditionDerivedStatistics__OclElement /* 1 */,
				Fragments._AgPresenceConditionDerivedStatistics__AgPresenceConditionDerivedStatistics /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgPresenceConditionDerivedStatistics = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgTrgOp =
			{
				Fragments._AgTrgOp__OclAny /* 0 */,
				Fragments._AgTrgOp__OclElement /* 1 */,
				Fragments._AgTrgOp__AgTrgOp /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgTrgOp = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgUML =
			{
				Fragments._AgUML__OclAny /* 0 */,
				Fragments._AgUML__OclElement /* 1 */,
				Fragments._AgUML__AgUML /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgUML = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AgUnderlyingType =
			{
				Fragments._AgUnderlyingType__OclAny /* 0 */,
				Fragments._AgUnderlyingType__OclElement /* 1 */,
				Fragments._AgUnderlyingType__AgUnderlyingType /* 2 */
			};
		private static final int /*@NonNull*/ [] __AgUnderlyingType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AnyLNClass =
			{
				Fragments._AnyLNClass__OclAny /* 0 */,
				Fragments._AnyLNClass__OclElement /* 1 */,
				Fragments._AnyLNClass__NsdObject /* 2 */,
				Fragments._AnyLNClass__DocumentedClass /* 3 */,
				Fragments._AnyLNClass__TitledClass /* 4 */,
				Fragments._AnyLNClass__AnyLNClass /* 5 */
			};
		private static final int /*@NonNull*/ [] __AnyLNClass = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ApplicableServiceNS =
			{
				Fragments._ApplicableServiceNS__OclAny /* 0 */,
				Fragments._ApplicableServiceNS__OclElement /* 1 */,
				Fragments._ApplicableServiceNS__NsdObject /* 2 */,
				Fragments._ApplicableServiceNS__Copyrighted /* 3 */,
				Fragments._ApplicableServiceNS__ApplicableServiceNS /* 4 */
			};
		private static final int /*@NonNull*/ [] __ApplicableServiceNS = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ApplicableServices =
			{
				Fragments._ApplicableServices__OclAny /* 0 */,
				Fragments._ApplicableServices__OclElement /* 1 */,
				Fragments._ApplicableServices__NsdObject /* 2 */,
				Fragments._ApplicableServices__ApplicableServices /* 3 */
			};
		private static final int /*@NonNull*/ [] __ApplicableServices = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AppliesToType =
			{
				Fragments._AppliesToType__OclAny /* 0 */,
				Fragments._AppliesToType__OclElement /* 1 */,
				Fragments._AppliesToType__AgNSIdentification /* 2 */,
				Fragments._AppliesToType__NsdObject /* 2 */,
				Fragments._AppliesToType__AppliesToType /* 3 */
			};
		private static final int /*@NonNull*/ [] __AppliesToType = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttributeTypeKind =
			{
				Fragments._AttributeTypeKind__OclAny /* 0 */,
				Fragments._AttributeTypeKind__AttributeTypeKind /* 1 */
			};
		private static final int /*@NonNull*/ [] __AttributeTypeKind = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BasicType =
			{
				Fragments._BasicType__OclAny /* 0 */,
				Fragments._BasicType__OclElement /* 1 */,
				Fragments._BasicType__NsdObject /* 2 */,
				Fragments._BasicType__BasicType /* 3 */
			};
		private static final int /*@NonNull*/ [] __BasicType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BasicTypes =
			{
				Fragments._BasicTypes__OclAny /* 0 */,
				Fragments._BasicTypes__OclElement /* 1 */,
				Fragments._BasicTypes__NsdObject /* 2 */,
				Fragments._BasicTypes__BasicTypes /* 3 */
			};
		private static final int /*@NonNull*/ [] __BasicTypes = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CBKind =
			{
				Fragments._CBKind__OclAny /* 0 */,
				Fragments._CBKind__OclElement /* 1 */,
				Fragments._CBKind__OclType /* 2 */,
				Fragments._CBKind__OclEnumeration /* 3 */,
				Fragments._CBKind__CBKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __CBKind = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CBKindObject =
			{
				Fragments._CBKindObject__OclAny /* 0 */,
				Fragments._CBKindObject__CBKindObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __CBKindObject = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CDC =
			{
				Fragments._CDC__OclAny /* 0 */,
				Fragments._CDC__OclElement /* 1 */,
				Fragments._CDC__NsdObject /* 2 */,
				Fragments._CDC__DocumentedClass /* 3 */,
				Fragments._CDC__TitledClass /* 4 */,
				Fragments._CDC__CDC /* 5 */
			};
		private static final int /*@NonNull*/ [] __CDC = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CDCs =
			{
				Fragments._CDCs__OclAny /* 0 */,
				Fragments._CDCs__OclElement /* 1 */,
				Fragments._CDCs__NsdObject /* 2 */,
				Fragments._CDCs__CDCs /* 3 */
			};
		private static final int /*@NonNull*/ [] __CDCs = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Changes =
			{
				Fragments._Changes__OclAny /* 0 */,
				Fragments._Changes__OclElement /* 1 */,
				Fragments._Changes__NsdObject /* 2 */,
				Fragments._Changes__Changes /* 3 */
			};
		private static final int /*@NonNull*/ [] __Changes = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConstructedAttribute =
			{
				Fragments._ConstructedAttribute__OclAny /* 0 */,
				Fragments._ConstructedAttribute__OclElement /* 1 */,
				Fragments._ConstructedAttribute__NsdObject /* 2 */,
				Fragments._ConstructedAttribute__DocumentedClass /* 3 */,
				Fragments._ConstructedAttribute__TitledClass /* 4 */,
				Fragments._ConstructedAttribute__ConstructedAttribute /* 5 */
			};
		private static final int /*@NonNull*/ [] __ConstructedAttribute = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConstructedAttributes =
			{
				Fragments._ConstructedAttributes__OclAny /* 0 */,
				Fragments._ConstructedAttributes__OclElement /* 1 */,
				Fragments._ConstructedAttributes__NsdObject /* 2 */,
				Fragments._ConstructedAttributes__ConstructedAttributes /* 3 */
			};
		private static final int /*@NonNull*/ [] __ConstructedAttributes = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CopyrightNotice =
			{
				Fragments._CopyrightNotice__OclAny /* 0 */,
				Fragments._CopyrightNotice__OclElement /* 1 */,
				Fragments._CopyrightNotice__NsdObject /* 2 */,
				Fragments._CopyrightNotice__CopyrightNotice /* 3 */
			};
		private static final int /*@NonNull*/ [] __CopyrightNotice = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Copyrighted =
			{
				Fragments._Copyrighted__OclAny /* 0 */,
				Fragments._Copyrighted__OclElement /* 1 */,
				Fragments._Copyrighted__NsdObject /* 2 */,
				Fragments._Copyrighted__Copyrighted /* 3 */
			};
		private static final int /*@NonNull*/ [] __Copyrighted = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataAttribute =
			{
				Fragments._DataAttribute__OclAny /* 0 */,
				Fragments._DataAttribute__OclElement /* 1 */,
				Fragments._DataAttribute__AgArray /* 2 */,
				Fragments._DataAttribute__AgAttributeType /* 2 */,
				Fragments._DataAttribute__AgPresenceCondition /* 2 */,
				Fragments._DataAttribute__AgTrgOp /* 2 */,
				Fragments._DataAttribute__NsdObject /* 2 */,
				Fragments._DataAttribute__AgAttributeTypeAndValues /* 3 */,
				Fragments._DataAttribute__DocumentedClass /* 3 */,
				Fragments._DataAttribute__DataAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataAttribute = { 1,1,5,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataObject =
			{
				Fragments._DataObject__OclAny /* 0 */,
				Fragments._DataObject__OclElement /* 1 */,
				Fragments._DataObject__AgPresenceCondition /* 2 */,
				Fragments._DataObject__AgPresenceConditionDerivedStatistics /* 2 */,
				Fragments._DataObject__AgUnderlyingType /* 2 */,
				Fragments._DataObject__NsdObject /* 2 */,
				Fragments._DataObject__DocumentedClass /* 3 */,
				Fragments._DataObject__DataObject /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataObject = { 1,1,4,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataSetMemberOf =
			{
				Fragments._DataSetMemberOf__OclAny /* 0 */,
				Fragments._DataSetMemberOf__OclElement /* 1 */,
				Fragments._DataSetMemberOf__NsdObject /* 2 */,
				Fragments._DataSetMemberOf__DataSetMemberOf /* 3 */
			};
		private static final int /*@NonNull*/ [] __DataSetMemberOf = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DefinedAttributeTypeKind =
			{
				Fragments._DefinedAttributeTypeKind__OclAny /* 0 */,
				Fragments._DefinedAttributeTypeKind__OclElement /* 1 */,
				Fragments._DefinedAttributeTypeKind__OclType /* 2 */,
				Fragments._DefinedAttributeTypeKind__OclEnumeration /* 3 */,
				Fragments._DefinedAttributeTypeKind__DefinedAttributeTypeKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __DefinedAttributeTypeKind = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DefinedAttributeTypeKindObject =
			{
				Fragments._DefinedAttributeTypeKindObject__OclAny /* 0 */,
				Fragments._DefinedAttributeTypeKindObject__DefinedAttributeTypeKindObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __DefinedAttributeTypeKindObject = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DependsOn =
			{
				Fragments._DependsOn__OclAny /* 0 */,
				Fragments._DependsOn__OclElement /* 1 */,
				Fragments._DependsOn__AgNSIdentification /* 2 */,
				Fragments._DependsOn__NsdObject /* 2 */,
				Fragments._DependsOn__DependsOn /* 3 */
			};
		private static final int /*@NonNull*/ [] __DependsOn = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Doc =
			{
				Fragments._Doc__OclAny /* 0 */,
				Fragments._Doc__OclElement /* 1 */,
				Fragments._Doc__NsdObject /* 2 */,
				Fragments._Doc__Doc /* 3 */
			};
		private static final int /*@NonNull*/ [] __Doc = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DocumentRoot =
			{
				Fragments._DocumentRoot__OclAny /* 0 */,
				Fragments._DocumentRoot__OclElement /* 1 */,
				Fragments._DocumentRoot__DocumentRoot /* 2 */
			};
		private static final int /*@NonNull*/ [] __DocumentRoot = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DocumentedClass =
			{
				Fragments._DocumentedClass__OclAny /* 0 */,
				Fragments._DocumentedClass__OclElement /* 1 */,
				Fragments._DocumentedClass__NsdObject /* 2 */,
				Fragments._DocumentedClass__DocumentedClass /* 3 */
			};
		private static final int /*@NonNull*/ [] __DocumentedClass = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enumeration =
			{
				Fragments._Enumeration__OclAny /* 0 */,
				Fragments._Enumeration__OclElement /* 1 */,
				Fragments._Enumeration__NsdObject /* 2 */,
				Fragments._Enumeration__DocumentedClass /* 3 */,
				Fragments._Enumeration__TitledClass /* 4 */,
				Fragments._Enumeration__Enumeration /* 5 */
			};
		private static final int /*@NonNull*/ [] __Enumeration = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enumerations =
			{
				Fragments._Enumerations__OclAny /* 0 */,
				Fragments._Enumerations__OclElement /* 1 */,
				Fragments._Enumerations__NsdObject /* 2 */,
				Fragments._Enumerations__Enumerations /* 3 */
			};
		private static final int /*@NonNull*/ [] __Enumerations = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FunctionalConstraint =
			{
				Fragments._FunctionalConstraint__OclAny /* 0 */,
				Fragments._FunctionalConstraint__OclElement /* 1 */,
				Fragments._FunctionalConstraint__NsdObject /* 2 */,
				Fragments._FunctionalConstraint__FunctionalConstraint /* 3 */
			};
		private static final int /*@NonNull*/ [] __FunctionalConstraint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FunctionalConstraints =
			{
				Fragments._FunctionalConstraints__OclAny /* 0 */,
				Fragments._FunctionalConstraints__OclElement /* 1 */,
				Fragments._FunctionalConstraints__NsdObject /* 2 */,
				Fragments._FunctionalConstraints__FunctionalConstraints /* 3 */
			};
		private static final int /*@NonNull*/ [] __FunctionalConstraints = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IRiseClipseConsole =
			{
				Fragments._IRiseClipseConsole__OclAny /* 0 */,
				Fragments._IRiseClipseConsole__OclElement /* 1 */,
				Fragments._IRiseClipseConsole__IRiseClipseConsole /* 2 */
			};
		private static final int /*@NonNull*/ [] __IRiseClipseConsole = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LNClass =
			{
				Fragments._LNClass__OclAny /* 0 */,
				Fragments._LNClass__OclElement /* 1 */,
				Fragments._LNClass__NsdObject /* 2 */,
				Fragments._LNClass__DocumentedClass /* 3 */,
				Fragments._LNClass__TitledClass /* 4 */,
				Fragments._LNClass__AnyLNClass /* 5 */,
				Fragments._LNClass__LNClass /* 6 */
			};
		private static final int /*@NonNull*/ [] __LNClass = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LNClasses =
			{
				Fragments._LNClasses__OclAny /* 0 */,
				Fragments._LNClasses__OclElement /* 1 */,
				Fragments._LNClasses__NsdObject /* 2 */,
				Fragments._LNClasses__LNClasses /* 3 */
			};
		private static final int /*@NonNull*/ [] __LNClasses = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _License =
			{
				Fragments._License__OclAny /* 0 */,
				Fragments._License__OclElement /* 1 */,
				Fragments._License__NsdObject /* 2 */,
				Fragments._License__License /* 3 */
			};
		private static final int /*@NonNull*/ [] __License = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LicenseKind =
			{
				Fragments._LicenseKind__OclAny /* 0 */,
				Fragments._LicenseKind__OclElement /* 1 */,
				Fragments._LicenseKind__OclType /* 2 */,
				Fragments._LicenseKind__OclEnumeration /* 3 */,
				Fragments._LicenseKind__LicenseKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __LicenseKind = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LicenseKindObject =
			{
				Fragments._LicenseKindObject__OclAny /* 0 */,
				Fragments._LicenseKindObject__LicenseKindObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __LicenseKindObject = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Literal =
			{
				Fragments._Literal__OclAny /* 0 */,
				Fragments._Literal__OclElement /* 1 */,
				Fragments._Literal__NsdObject /* 2 */,
				Fragments._Literal__DocumentedClass /* 3 */,
				Fragments._Literal__Literal /* 4 */
			};
		private static final int /*@NonNull*/ [] __Literal = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NS =
			{
				Fragments._NS__OclAny /* 0 */,
				Fragments._NS__OclElement /* 1 */,
				Fragments._NS__AgNSIdentification /* 2 */,
				Fragments._NS__AgNSdesc /* 2 */,
				Fragments._NS__AgUML /* 2 */,
				Fragments._NS__NsdObject /* 2 */,
				Fragments._NS__Copyrighted /* 3 */,
				Fragments._NS__NS /* 4 */
			};
		private static final int /*@NonNull*/ [] __NS = { 1,1,4,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NSDoc =
			{
				Fragments._NSDoc__OclAny /* 0 */,
				Fragments._NSDoc__OclElement /* 1 */,
				Fragments._NSDoc__AgNSIdentification /* 2 */,
				Fragments._NSDoc__AgUML /* 2 */,
				Fragments._NSDoc__NsdObject /* 2 */,
				Fragments._NSDoc__Copyrighted /* 3 */,
				Fragments._NSDoc__NSDoc /* 4 */
			};
		private static final int /*@NonNull*/ [] __NSDoc = { 1,1,3,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Notice =
			{
				Fragments._Notice__OclAny /* 0 */,
				Fragments._Notice__OclElement /* 1 */,
				Fragments._Notice__NsdObject /* 2 */,
				Fragments._Notice__Notice /* 3 */
			};
		private static final int /*@NonNull*/ [] __Notice = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NsdObject =
			{
				Fragments._NsdObject__OclAny /* 0 */,
				Fragments._NsdObject__OclElement /* 1 */,
				Fragments._NsdObject__NsdObject /* 2 */
			};
		private static final int /*@NonNull*/ [] __NsdObject = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PresenceCondition =
			{
				Fragments._PresenceCondition__OclAny /* 0 */,
				Fragments._PresenceCondition__OclElement /* 1 */,
				Fragments._PresenceCondition__NsdObject /* 2 */,
				Fragments._PresenceCondition__PresenceCondition /* 3 */
			};
		private static final int /*@NonNull*/ [] __PresenceCondition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PresenceConditions =
			{
				Fragments._PresenceConditions__OclAny /* 0 */,
				Fragments._PresenceConditions__OclElement /* 1 */,
				Fragments._PresenceConditions__NsdObject /* 2 */,
				Fragments._PresenceConditions__PresenceConditions /* 3 */
			};
		private static final int /*@NonNull*/ [] __PresenceConditions = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PubStage =
			{
				Fragments._PubStage__OclAny /* 0 */,
				Fragments._PubStage__OclElement /* 1 */,
				Fragments._PubStage__OclType /* 2 */,
				Fragments._PubStage__OclEnumeration /* 3 */,
				Fragments._PubStage__PubStage /* 4 */
			};
		private static final int /*@NonNull*/ [] __PubStage = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PubStageObject =
			{
				Fragments._PubStageObject__OclAny /* 0 */,
				Fragments._PubStageObject__PubStageObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __PubStageObject = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceCDC =
			{
				Fragments._ServiceCDC__OclAny /* 0 */,
				Fragments._ServiceCDC__OclElement /* 1 */,
				Fragments._ServiceCDC__NsdObject /* 2 */,
				Fragments._ServiceCDC__ServiceCDC /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceCDC = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceCDCs =
			{
				Fragments._ServiceCDCs__OclAny /* 0 */,
				Fragments._ServiceCDCs__OclElement /* 1 */,
				Fragments._ServiceCDCs__NsdObject /* 2 */,
				Fragments._ServiceCDCs__ServiceCDCs /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceCDCs = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceConstructedAttribute =
			{
				Fragments._ServiceConstructedAttribute__OclAny /* 0 */,
				Fragments._ServiceConstructedAttribute__OclElement /* 1 */,
				Fragments._ServiceConstructedAttribute__NsdObject /* 2 */,
				Fragments._ServiceConstructedAttribute__DocumentedClass /* 3 */,
				Fragments._ServiceConstructedAttribute__TitledClass /* 4 */,
				Fragments._ServiceConstructedAttribute__ConstructedAttribute /* 5 */,
				Fragments._ServiceConstructedAttribute__ServiceConstructedAttribute /* 6 */
			};
		private static final int /*@NonNull*/ [] __ServiceConstructedAttribute = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceConstructedAttributes =
			{
				Fragments._ServiceConstructedAttributes__OclAny /* 0 */,
				Fragments._ServiceConstructedAttributes__OclElement /* 1 */,
				Fragments._ServiceConstructedAttributes__NsdObject /* 2 */,
				Fragments._ServiceConstructedAttributes__ServiceConstructedAttributes /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceConstructedAttributes = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceDataAttribute =
			{
				Fragments._ServiceDataAttribute__OclAny /* 0 */,
				Fragments._ServiceDataAttribute__OclElement /* 1 */,
				Fragments._ServiceDataAttribute__AgAttributeType /* 2 */,
				Fragments._ServiceDataAttribute__AgPresenceCondition /* 2 */,
				Fragments._ServiceDataAttribute__AgUnderlyingType /* 2 */,
				Fragments._ServiceDataAttribute__NsdObject /* 2 */,
				Fragments._ServiceDataAttribute__DocumentedClass /* 3 */,
				Fragments._ServiceDataAttribute__ServiceDataAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __ServiceDataAttribute = { 1,1,4,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceNS =
			{
				Fragments._ServiceNS__OclAny /* 0 */,
				Fragments._ServiceNS__OclElement /* 1 */,
				Fragments._ServiceNS__AgNSIdentification /* 2 */,
				Fragments._ServiceNS__AgNSdesc /* 2 */,
				Fragments._ServiceNS__AgUML /* 2 */,
				Fragments._ServiceNS__NsdObject /* 2 */,
				Fragments._ServiceNS__Copyrighted /* 3 */,
				Fragments._ServiceNS__ServiceNS /* 4 */
			};
		private static final int /*@NonNull*/ [] __ServiceNS = { 1,1,4,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceNsUsage =
			{
				Fragments._ServiceNsUsage__OclAny /* 0 */,
				Fragments._ServiceNsUsage__OclElement /* 1 */,
				Fragments._ServiceNsUsage__AgNSIdentification /* 2 */,
				Fragments._ServiceNsUsage__NsdObject /* 2 */,
				Fragments._ServiceNsUsage__ServiceNsUsage /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceNsUsage = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceParameter =
			{
				Fragments._ServiceParameter__OclAny /* 0 */,
				Fragments._ServiceParameter__OclElement /* 1 */,
				Fragments._ServiceParameter__AgAttributeType /* 2 */,
				Fragments._ServiceParameter__NsdObject /* 2 */,
				Fragments._ServiceParameter__AgAttributeTypeAndValues /* 3 */,
				Fragments._ServiceParameter__DocumentedClass /* 3 */,
				Fragments._ServiceParameter__ServiceParameter /* 4 */
			};
		private static final int /*@NonNull*/ [] __ServiceParameter = { 1,1,2,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceType =
			{
				Fragments._ServiceType__OclAny /* 0 */,
				Fragments._ServiceType__OclElement /* 1 */,
				Fragments._ServiceType__NsdObject /* 2 */,
				Fragments._ServiceType__ServiceType /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ServiceTypeRealizations =
			{
				Fragments._ServiceTypeRealizations__OclAny /* 0 */,
				Fragments._ServiceTypeRealizations__OclElement /* 1 */,
				Fragments._ServiceTypeRealizations__NsdObject /* 2 */,
				Fragments._ServiceTypeRealizations__ServiceTypeRealizations /* 3 */
			};
		private static final int /*@NonNull*/ [] __ServiceTypeRealizations = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubDataAttribute =
			{
				Fragments._SubDataAttribute__OclAny /* 0 */,
				Fragments._SubDataAttribute__OclElement /* 1 */,
				Fragments._SubDataAttribute__AgArray /* 2 */,
				Fragments._SubDataAttribute__AgAttributeType /* 2 */,
				Fragments._SubDataAttribute__AgPresenceCondition /* 2 */,
				Fragments._SubDataAttribute__NsdObject /* 2 */,
				Fragments._SubDataAttribute__AgAttributeTypeAndValues /* 3 */,
				Fragments._SubDataAttribute__DocumentedClass /* 3 */,
				Fragments._SubDataAttribute__SubDataAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __SubDataAttribute = { 1,1,4,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SubDataObject =
			{
				Fragments._SubDataObject__OclAny /* 0 */,
				Fragments._SubDataObject__OclElement /* 1 */,
				Fragments._SubDataObject__AgArray /* 2 */,
				Fragments._SubDataObject__AgPresenceCondition /* 2 */,
				Fragments._SubDataObject__AgUnderlyingType /* 2 */,
				Fragments._SubDataObject__NsdObject /* 2 */,
				Fragments._SubDataObject__DocumentedClass /* 3 */,
				Fragments._SubDataObject__SubDataObject /* 4 */
			};
		private static final int /*@NonNull*/ [] __SubDataObject = { 1,1,4,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TitledClass =
			{
				Fragments._TitledClass__OclAny /* 0 */,
				Fragments._TitledClass__OclElement /* 1 */,
				Fragments._TitledClass__NsdObject /* 2 */,
				Fragments._TitledClass__DocumentedClass /* 3 */,
				Fragments._TitledClass__TitledClass /* 4 */
			};
		private static final int /*@NonNull*/ [] __TitledClass = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UndefinedAttributeTypeKind =
			{
				Fragments._UndefinedAttributeTypeKind__OclAny /* 0 */,
				Fragments._UndefinedAttributeTypeKind__OclElement /* 1 */,
				Fragments._UndefinedAttributeTypeKind__OclType /* 2 */,
				Fragments._UndefinedAttributeTypeKind__OclEnumeration /* 3 */,
				Fragments._UndefinedAttributeTypeKind__UndefinedAttributeTypeKind /* 4 */
			};
		private static final int /*@NonNull*/ [] __UndefinedAttributeTypeKind = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UndefinedAttributeTypeKindObject =
			{
				Fragments._UndefinedAttributeTypeKindObject__OclAny /* 0 */,
				Fragments._UndefinedAttributeTypeKindObject__UndefinedAttributeTypeKindObject /* 1 */
			};
		private static final int /*@NonNull*/ [] __UndefinedAttributeTypeKindObject = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ACSIServicesKind.initFragments(_ACSIServicesKind, __ACSIServicesKind);
			Types._ACSIServicesKindObject.initFragments(_ACSIServicesKindObject, __ACSIServicesKindObject);
			Types._Abbreviation.initFragments(_Abbreviation, __Abbreviation);
			Types._Abbreviations.initFragments(_Abbreviations, __Abbreviations);
			Types._AbstractLNClass.initFragments(_AbstractLNClass, __AbstractLNClass);
			Types._AgArray.initFragments(_AgArray, __AgArray);
			Types._AgAttributeType.initFragments(_AgAttributeType, __AgAttributeType);
			Types._AgAttributeTypeAndValues.initFragments(_AgAttributeTypeAndValues, __AgAttributeTypeAndValues);
			Types._AgNSIdentification.initFragments(_AgNSIdentification, __AgNSIdentification);
			Types._AgNSdesc.initFragments(_AgNSdesc, __AgNSdesc);
			Types._AgPresenceCondition.initFragments(_AgPresenceCondition, __AgPresenceCondition);
			Types._AgPresenceConditionDerivedStatistics.initFragments(_AgPresenceConditionDerivedStatistics, __AgPresenceConditionDerivedStatistics);
			Types._AgTrgOp.initFragments(_AgTrgOp, __AgTrgOp);
			Types._AgUML.initFragments(_AgUML, __AgUML);
			Types._AgUnderlyingType.initFragments(_AgUnderlyingType, __AgUnderlyingType);
			Types._AnyLNClass.initFragments(_AnyLNClass, __AnyLNClass);
			Types._ApplicableServiceNS.initFragments(_ApplicableServiceNS, __ApplicableServiceNS);
			Types._ApplicableServices.initFragments(_ApplicableServices, __ApplicableServices);
			Types._AppliesToType.initFragments(_AppliesToType, __AppliesToType);
			Types._AttributeTypeKind.initFragments(_AttributeTypeKind, __AttributeTypeKind);
			Types._BasicType.initFragments(_BasicType, __BasicType);
			Types._BasicTypes.initFragments(_BasicTypes, __BasicTypes);
			Types._CBKind.initFragments(_CBKind, __CBKind);
			Types._CBKindObject.initFragments(_CBKindObject, __CBKindObject);
			Types._CDC.initFragments(_CDC, __CDC);
			Types._CDCs.initFragments(_CDCs, __CDCs);
			Types._Changes.initFragments(_Changes, __Changes);
			Types._ConstructedAttribute.initFragments(_ConstructedAttribute, __ConstructedAttribute);
			Types._ConstructedAttributes.initFragments(_ConstructedAttributes, __ConstructedAttributes);
			Types._CopyrightNotice.initFragments(_CopyrightNotice, __CopyrightNotice);
			Types._Copyrighted.initFragments(_Copyrighted, __Copyrighted);
			Types._DataAttribute.initFragments(_DataAttribute, __DataAttribute);
			Types._DataObject.initFragments(_DataObject, __DataObject);
			Types._DataSetMemberOf.initFragments(_DataSetMemberOf, __DataSetMemberOf);
			Types._DefinedAttributeTypeKind.initFragments(_DefinedAttributeTypeKind, __DefinedAttributeTypeKind);
			Types._DefinedAttributeTypeKindObject.initFragments(_DefinedAttributeTypeKindObject, __DefinedAttributeTypeKindObject);
			Types._DependsOn.initFragments(_DependsOn, __DependsOn);
			Types._Doc.initFragments(_Doc, __Doc);
			Types._DocumentRoot.initFragments(_DocumentRoot, __DocumentRoot);
			Types._DocumentedClass.initFragments(_DocumentedClass, __DocumentedClass);
			Types._Enumeration.initFragments(_Enumeration, __Enumeration);
			Types._Enumerations.initFragments(_Enumerations, __Enumerations);
			Types._FunctionalConstraint.initFragments(_FunctionalConstraint, __FunctionalConstraint);
			Types._FunctionalConstraints.initFragments(_FunctionalConstraints, __FunctionalConstraints);
			Types._IRiseClipseConsole.initFragments(_IRiseClipseConsole, __IRiseClipseConsole);
			Types._LNClass.initFragments(_LNClass, __LNClass);
			Types._LNClasses.initFragments(_LNClasses, __LNClasses);
			Types._License.initFragments(_License, __License);
			Types._LicenseKind.initFragments(_LicenseKind, __LicenseKind);
			Types._LicenseKindObject.initFragments(_LicenseKindObject, __LicenseKindObject);
			Types._Literal.initFragments(_Literal, __Literal);
			Types._NS.initFragments(_NS, __NS);
			Types._NSDoc.initFragments(_NSDoc, __NSDoc);
			Types._Notice.initFragments(_Notice, __Notice);
			Types._NsdObject.initFragments(_NsdObject, __NsdObject);
			Types._PresenceCondition.initFragments(_PresenceCondition, __PresenceCondition);
			Types._PresenceConditions.initFragments(_PresenceConditions, __PresenceConditions);
			Types._PubStage.initFragments(_PubStage, __PubStage);
			Types._PubStageObject.initFragments(_PubStageObject, __PubStageObject);
			Types._ServiceCDC.initFragments(_ServiceCDC, __ServiceCDC);
			Types._ServiceCDCs.initFragments(_ServiceCDCs, __ServiceCDCs);
			Types._ServiceConstructedAttribute.initFragments(_ServiceConstructedAttribute, __ServiceConstructedAttribute);
			Types._ServiceConstructedAttributes.initFragments(_ServiceConstructedAttributes, __ServiceConstructedAttributes);
			Types._ServiceDataAttribute.initFragments(_ServiceDataAttribute, __ServiceDataAttribute);
			Types._ServiceNS.initFragments(_ServiceNS, __ServiceNS);
			Types._ServiceNsUsage.initFragments(_ServiceNsUsage, __ServiceNsUsage);
			Types._ServiceParameter.initFragments(_ServiceParameter, __ServiceParameter);
			Types._ServiceType.initFragments(_ServiceType, __ServiceType);
			Types._ServiceTypeRealizations.initFragments(_ServiceTypeRealizations, __ServiceTypeRealizations);
			Types._SubDataAttribute.initFragments(_SubDataAttribute, __SubDataAttribute);
			Types._SubDataObject.initFragments(_SubDataObject, __SubDataObject);
			Types._TitledClass.initFragments(_TitledClass, __TitledClass);
			Types._UndefinedAttributeTypeKind.initFragments(_UndefinedAttributeTypeKind, __UndefinedAttributeTypeKind);
			Types._UndefinedAttributeTypeKindObject.initFragments(_UndefinedAttributeTypeKindObject, __UndefinedAttributeTypeKindObject);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKind__ACSIServicesKind = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKindObject__ACSIServicesKindObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ACSIServicesKindObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviation__Abbreviation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviation__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviations__Abbreviations = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviations__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviations__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Abbreviations__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__AbstractLNClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__AnyLNClass = {
			NsdTables.Operations._AnyLNClass__getName /* getName() */,
			NsdTables.Operations._AnyLNClass__getParentLNClasses /* getParentLNClasses() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractLNClass__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AgArray__AgArray = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgArray__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgArray__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeType__AgAttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeTypeAndValues__AgAttributeTypeAndValues = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeTypeAndValues__AgAttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeTypeAndValues__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgAttributeTypeAndValues__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgNSIdentification__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgNSIdentification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgNSIdentification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgNSdesc__AgNSdesc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgNSdesc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgNSdesc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgPresenceCondition__AgPresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgPresenceCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgPresenceCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgPresenceConditionDerivedStatistics__AgPresenceConditionDerivedStatistics = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgPresenceConditionDerivedStatistics__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgPresenceConditionDerivedStatistics__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgTrgOp__AgTrgOp = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgTrgOp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgTrgOp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgUML__AgUML = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgUML__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgUML__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AgUnderlyingType__AgUnderlyingType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AgUnderlyingType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AgUnderlyingType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AnyLNClass__AnyLNClass = {
			NsdTables.Operations._AnyLNClass__getName /* getName() */,
			NsdTables.Operations._AnyLNClass__getParentLNClasses /* getParentLNClasses() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnyLNClass__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnyLNClass__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnyLNClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnyLNClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnyLNClass__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServiceNS__ApplicableServiceNS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServiceNS__Copyrighted = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServiceNS__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServiceNS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServiceNS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServices__ApplicableServices = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServices__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServices__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicableServices__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AppliesToType__AppliesToType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AppliesToType__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AppliesToType__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AppliesToType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AppliesToType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AttributeTypeKind__AttributeTypeKind = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeTypeKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BasicType__BasicType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicType__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BasicTypes__BasicTypes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicTypes__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicTypes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicTypes__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CBKind__CBKind = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CBKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CBKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CBKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CBKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CBKindObject__CBKindObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CBKindObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CDC__CDC = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CDC__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CDC__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CDC__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CDC__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CDC__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CDCs__CDCs = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CDCs__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CDCs__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CDCs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Changes__Changes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Changes__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Changes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Changes__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttribute__ConstructedAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttribute__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttribute__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttribute__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttributes__ConstructedAttributes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttributes__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttributes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConstructedAttributes__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CopyrightNotice__CopyrightNotice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CopyrightNotice__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CopyrightNotice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CopyrightNotice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Copyrighted__Copyrighted = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Copyrighted__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Copyrighted__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Copyrighted__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__DataAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__AgArray = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__AgAttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__AgAttributeTypeAndValues = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__AgPresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__AgTrgOp = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__DataObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__AgPresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__AgPresenceConditionDerivedStatistics = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__AgUnderlyingType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataObject__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataSetMemberOf__DataSetMemberOf = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataSetMemberOf__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataSetMemberOf__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataSetMemberOf__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKind__DefinedAttributeTypeKind = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKindObject__DefinedAttributeTypeKindObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DefinedAttributeTypeKindObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DependsOn__DependsOn = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DependsOn__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DependsOn__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DependsOn__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DependsOn__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Doc__Doc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Doc__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Doc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Doc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRoot__DocumentRoot = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRoot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRoot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DocumentedClass__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentedClass__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentedClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentedClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enumeration__Enumeration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumeration__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumeration__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumeration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumeration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumeration__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Enumerations__Enumerations = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumerations__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumerations__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enumerations__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraint__FunctionalConstraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraint__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraints__FunctionalConstraints = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraints__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraints__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FunctionalConstraints__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IRiseClipseConsole__IRiseClipseConsole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IRiseClipseConsole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IRiseClipseConsole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__LNClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__AnyLNClass = {
			NsdTables.Operations._AnyLNClass__getName /* getName() */,
			NsdTables.Operations._AnyLNClass__getParentLNClasses /* getParentLNClasses() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClass__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _LNClasses__LNClasses = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClasses__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClasses__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LNClasses__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _License__License = {};
		private static final ExecutorOperation /*@NonNull*/ [] _License__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _License__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _License__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKind__LicenseKind = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKindObject__LicenseKindObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LicenseKindObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Literal__Literal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Literal__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Literal__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Literal__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Literal__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NS__NS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__AgNSdesc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__AgUML = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__Copyrighted = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__NSDoc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__AgUML = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__Copyrighted = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NSDoc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Notice__Notice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Notice__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Notice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Notice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NsdObject__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NsdObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NsdObject__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__PresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PresenceConditions__PresenceConditions = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceConditions__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceConditions__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PresenceConditions__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PubStage__PubStage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PubStage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PubStage__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PubStage__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PubStage__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PubStageObject__PubStageObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PubStageObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDC__ServiceCDC = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDC__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDC__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDC__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDCs__ServiceCDCs = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDCs__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDCs__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceCDCs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__ServiceConstructedAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__ConstructedAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttribute__TitledClass = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttributes__ServiceConstructedAttributes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttributes__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttributes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceConstructedAttributes__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__ServiceDataAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__AgAttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__AgPresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__AgUnderlyingType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceDataAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__ServiceNS = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__AgNSdesc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__AgUML = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__Copyrighted = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNsUsage__ServiceNsUsage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNsUsage__AgNSIdentification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNsUsage__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNsUsage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceNsUsage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__ServiceParameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__AgAttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__AgAttributeTypeAndValues = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceType__ServiceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceType__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ServiceTypeRealizations__ServiceTypeRealizations = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceTypeRealizations__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceTypeRealizations__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ServiceTypeRealizations__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__SubDataAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__AgArray = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__AgAttributeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__AgAttributeTypeAndValues = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__AgPresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataAttribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__SubDataObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__AgArray = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__AgPresenceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__AgUnderlyingType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SubDataObject__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TitledClass__TitledClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TitledClass__DocumentedClass = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TitledClass__NsdObject = {
			NsdTables.Operations._NsdObject__buildExplicitLinks /* buildExplicitLinks(IRiseClipseConsole[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TitledClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TitledClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKind__UndefinedAttributeTypeKind = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKindObject__UndefinedAttributeTypeKindObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UndefinedAttributeTypeKindObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ACSIServicesKind__ACSIServicesKind.initOperations(_ACSIServicesKind__ACSIServicesKind);
			Fragments._ACSIServicesKind__OclAny.initOperations(_ACSIServicesKind__OclAny);
			Fragments._ACSIServicesKind__OclElement.initOperations(_ACSIServicesKind__OclElement);
			Fragments._ACSIServicesKind__OclEnumeration.initOperations(_ACSIServicesKind__OclEnumeration);
			Fragments._ACSIServicesKind__OclType.initOperations(_ACSIServicesKind__OclType);

			Fragments._ACSIServicesKindObject__ACSIServicesKindObject.initOperations(_ACSIServicesKindObject__ACSIServicesKindObject);
			Fragments._ACSIServicesKindObject__OclAny.initOperations(_ACSIServicesKindObject__OclAny);

			Fragments._Abbreviation__Abbreviation.initOperations(_Abbreviation__Abbreviation);
			Fragments._Abbreviation__NsdObject.initOperations(_Abbreviation__NsdObject);
			Fragments._Abbreviation__OclAny.initOperations(_Abbreviation__OclAny);
			Fragments._Abbreviation__OclElement.initOperations(_Abbreviation__OclElement);

			Fragments._Abbreviations__Abbreviations.initOperations(_Abbreviations__Abbreviations);
			Fragments._Abbreviations__NsdObject.initOperations(_Abbreviations__NsdObject);
			Fragments._Abbreviations__OclAny.initOperations(_Abbreviations__OclAny);
			Fragments._Abbreviations__OclElement.initOperations(_Abbreviations__OclElement);

			Fragments._AbstractLNClass__AbstractLNClass.initOperations(_AbstractLNClass__AbstractLNClass);
			Fragments._AbstractLNClass__AnyLNClass.initOperations(_AbstractLNClass__AnyLNClass);
			Fragments._AbstractLNClass__DocumentedClass.initOperations(_AbstractLNClass__DocumentedClass);
			Fragments._AbstractLNClass__NsdObject.initOperations(_AbstractLNClass__NsdObject);
			Fragments._AbstractLNClass__OclAny.initOperations(_AbstractLNClass__OclAny);
			Fragments._AbstractLNClass__OclElement.initOperations(_AbstractLNClass__OclElement);
			Fragments._AbstractLNClass__TitledClass.initOperations(_AbstractLNClass__TitledClass);

			Fragments._AgArray__AgArray.initOperations(_AgArray__AgArray);
			Fragments._AgArray__OclAny.initOperations(_AgArray__OclAny);
			Fragments._AgArray__OclElement.initOperations(_AgArray__OclElement);

			Fragments._AgAttributeType__AgAttributeType.initOperations(_AgAttributeType__AgAttributeType);
			Fragments._AgAttributeType__OclAny.initOperations(_AgAttributeType__OclAny);
			Fragments._AgAttributeType__OclElement.initOperations(_AgAttributeType__OclElement);

			Fragments._AgAttributeTypeAndValues__AgAttributeType.initOperations(_AgAttributeTypeAndValues__AgAttributeType);
			Fragments._AgAttributeTypeAndValues__AgAttributeTypeAndValues.initOperations(_AgAttributeTypeAndValues__AgAttributeTypeAndValues);
			Fragments._AgAttributeTypeAndValues__OclAny.initOperations(_AgAttributeTypeAndValues__OclAny);
			Fragments._AgAttributeTypeAndValues__OclElement.initOperations(_AgAttributeTypeAndValues__OclElement);

			Fragments._AgNSIdentification__AgNSIdentification.initOperations(_AgNSIdentification__AgNSIdentification);
			Fragments._AgNSIdentification__OclAny.initOperations(_AgNSIdentification__OclAny);
			Fragments._AgNSIdentification__OclElement.initOperations(_AgNSIdentification__OclElement);

			Fragments._AgNSdesc__AgNSdesc.initOperations(_AgNSdesc__AgNSdesc);
			Fragments._AgNSdesc__OclAny.initOperations(_AgNSdesc__OclAny);
			Fragments._AgNSdesc__OclElement.initOperations(_AgNSdesc__OclElement);

			Fragments._AgPresenceCondition__AgPresenceCondition.initOperations(_AgPresenceCondition__AgPresenceCondition);
			Fragments._AgPresenceCondition__OclAny.initOperations(_AgPresenceCondition__OclAny);
			Fragments._AgPresenceCondition__OclElement.initOperations(_AgPresenceCondition__OclElement);

			Fragments._AgPresenceConditionDerivedStatistics__AgPresenceConditionDerivedStatistics.initOperations(_AgPresenceConditionDerivedStatistics__AgPresenceConditionDerivedStatistics);
			Fragments._AgPresenceConditionDerivedStatistics__OclAny.initOperations(_AgPresenceConditionDerivedStatistics__OclAny);
			Fragments._AgPresenceConditionDerivedStatistics__OclElement.initOperations(_AgPresenceConditionDerivedStatistics__OclElement);

			Fragments._AgTrgOp__AgTrgOp.initOperations(_AgTrgOp__AgTrgOp);
			Fragments._AgTrgOp__OclAny.initOperations(_AgTrgOp__OclAny);
			Fragments._AgTrgOp__OclElement.initOperations(_AgTrgOp__OclElement);

			Fragments._AgUML__AgUML.initOperations(_AgUML__AgUML);
			Fragments._AgUML__OclAny.initOperations(_AgUML__OclAny);
			Fragments._AgUML__OclElement.initOperations(_AgUML__OclElement);

			Fragments._AgUnderlyingType__AgUnderlyingType.initOperations(_AgUnderlyingType__AgUnderlyingType);
			Fragments._AgUnderlyingType__OclAny.initOperations(_AgUnderlyingType__OclAny);
			Fragments._AgUnderlyingType__OclElement.initOperations(_AgUnderlyingType__OclElement);

			Fragments._AnyLNClass__AnyLNClass.initOperations(_AnyLNClass__AnyLNClass);
			Fragments._AnyLNClass__DocumentedClass.initOperations(_AnyLNClass__DocumentedClass);
			Fragments._AnyLNClass__NsdObject.initOperations(_AnyLNClass__NsdObject);
			Fragments._AnyLNClass__OclAny.initOperations(_AnyLNClass__OclAny);
			Fragments._AnyLNClass__OclElement.initOperations(_AnyLNClass__OclElement);
			Fragments._AnyLNClass__TitledClass.initOperations(_AnyLNClass__TitledClass);

			Fragments._ApplicableServiceNS__ApplicableServiceNS.initOperations(_ApplicableServiceNS__ApplicableServiceNS);
			Fragments._ApplicableServiceNS__Copyrighted.initOperations(_ApplicableServiceNS__Copyrighted);
			Fragments._ApplicableServiceNS__NsdObject.initOperations(_ApplicableServiceNS__NsdObject);
			Fragments._ApplicableServiceNS__OclAny.initOperations(_ApplicableServiceNS__OclAny);
			Fragments._ApplicableServiceNS__OclElement.initOperations(_ApplicableServiceNS__OclElement);

			Fragments._ApplicableServices__ApplicableServices.initOperations(_ApplicableServices__ApplicableServices);
			Fragments._ApplicableServices__NsdObject.initOperations(_ApplicableServices__NsdObject);
			Fragments._ApplicableServices__OclAny.initOperations(_ApplicableServices__OclAny);
			Fragments._ApplicableServices__OclElement.initOperations(_ApplicableServices__OclElement);

			Fragments._AppliesToType__AgNSIdentification.initOperations(_AppliesToType__AgNSIdentification);
			Fragments._AppliesToType__AppliesToType.initOperations(_AppliesToType__AppliesToType);
			Fragments._AppliesToType__NsdObject.initOperations(_AppliesToType__NsdObject);
			Fragments._AppliesToType__OclAny.initOperations(_AppliesToType__OclAny);
			Fragments._AppliesToType__OclElement.initOperations(_AppliesToType__OclElement);

			Fragments._AttributeTypeKind__AttributeTypeKind.initOperations(_AttributeTypeKind__AttributeTypeKind);
			Fragments._AttributeTypeKind__OclAny.initOperations(_AttributeTypeKind__OclAny);

			Fragments._BasicType__BasicType.initOperations(_BasicType__BasicType);
			Fragments._BasicType__NsdObject.initOperations(_BasicType__NsdObject);
			Fragments._BasicType__OclAny.initOperations(_BasicType__OclAny);
			Fragments._BasicType__OclElement.initOperations(_BasicType__OclElement);

			Fragments._BasicTypes__BasicTypes.initOperations(_BasicTypes__BasicTypes);
			Fragments._BasicTypes__NsdObject.initOperations(_BasicTypes__NsdObject);
			Fragments._BasicTypes__OclAny.initOperations(_BasicTypes__OclAny);
			Fragments._BasicTypes__OclElement.initOperations(_BasicTypes__OclElement);

			Fragments._CBKind__CBKind.initOperations(_CBKind__CBKind);
			Fragments._CBKind__OclAny.initOperations(_CBKind__OclAny);
			Fragments._CBKind__OclElement.initOperations(_CBKind__OclElement);
			Fragments._CBKind__OclEnumeration.initOperations(_CBKind__OclEnumeration);
			Fragments._CBKind__OclType.initOperations(_CBKind__OclType);

			Fragments._CBKindObject__CBKindObject.initOperations(_CBKindObject__CBKindObject);
			Fragments._CBKindObject__OclAny.initOperations(_CBKindObject__OclAny);

			Fragments._CDC__CDC.initOperations(_CDC__CDC);
			Fragments._CDC__DocumentedClass.initOperations(_CDC__DocumentedClass);
			Fragments._CDC__NsdObject.initOperations(_CDC__NsdObject);
			Fragments._CDC__OclAny.initOperations(_CDC__OclAny);
			Fragments._CDC__OclElement.initOperations(_CDC__OclElement);
			Fragments._CDC__TitledClass.initOperations(_CDC__TitledClass);

			Fragments._CDCs__CDCs.initOperations(_CDCs__CDCs);
			Fragments._CDCs__NsdObject.initOperations(_CDCs__NsdObject);
			Fragments._CDCs__OclAny.initOperations(_CDCs__OclAny);
			Fragments._CDCs__OclElement.initOperations(_CDCs__OclElement);

			Fragments._Changes__Changes.initOperations(_Changes__Changes);
			Fragments._Changes__NsdObject.initOperations(_Changes__NsdObject);
			Fragments._Changes__OclAny.initOperations(_Changes__OclAny);
			Fragments._Changes__OclElement.initOperations(_Changes__OclElement);

			Fragments._ConstructedAttribute__ConstructedAttribute.initOperations(_ConstructedAttribute__ConstructedAttribute);
			Fragments._ConstructedAttribute__DocumentedClass.initOperations(_ConstructedAttribute__DocumentedClass);
			Fragments._ConstructedAttribute__NsdObject.initOperations(_ConstructedAttribute__NsdObject);
			Fragments._ConstructedAttribute__OclAny.initOperations(_ConstructedAttribute__OclAny);
			Fragments._ConstructedAttribute__OclElement.initOperations(_ConstructedAttribute__OclElement);
			Fragments._ConstructedAttribute__TitledClass.initOperations(_ConstructedAttribute__TitledClass);

			Fragments._ConstructedAttributes__ConstructedAttributes.initOperations(_ConstructedAttributes__ConstructedAttributes);
			Fragments._ConstructedAttributes__NsdObject.initOperations(_ConstructedAttributes__NsdObject);
			Fragments._ConstructedAttributes__OclAny.initOperations(_ConstructedAttributes__OclAny);
			Fragments._ConstructedAttributes__OclElement.initOperations(_ConstructedAttributes__OclElement);

			Fragments._CopyrightNotice__CopyrightNotice.initOperations(_CopyrightNotice__CopyrightNotice);
			Fragments._CopyrightNotice__NsdObject.initOperations(_CopyrightNotice__NsdObject);
			Fragments._CopyrightNotice__OclAny.initOperations(_CopyrightNotice__OclAny);
			Fragments._CopyrightNotice__OclElement.initOperations(_CopyrightNotice__OclElement);

			Fragments._Copyrighted__Copyrighted.initOperations(_Copyrighted__Copyrighted);
			Fragments._Copyrighted__NsdObject.initOperations(_Copyrighted__NsdObject);
			Fragments._Copyrighted__OclAny.initOperations(_Copyrighted__OclAny);
			Fragments._Copyrighted__OclElement.initOperations(_Copyrighted__OclElement);

			Fragments._DataAttribute__AgArray.initOperations(_DataAttribute__AgArray);
			Fragments._DataAttribute__AgAttributeType.initOperations(_DataAttribute__AgAttributeType);
			Fragments._DataAttribute__AgAttributeTypeAndValues.initOperations(_DataAttribute__AgAttributeTypeAndValues);
			Fragments._DataAttribute__AgPresenceCondition.initOperations(_DataAttribute__AgPresenceCondition);
			Fragments._DataAttribute__AgTrgOp.initOperations(_DataAttribute__AgTrgOp);
			Fragments._DataAttribute__DataAttribute.initOperations(_DataAttribute__DataAttribute);
			Fragments._DataAttribute__DocumentedClass.initOperations(_DataAttribute__DocumentedClass);
			Fragments._DataAttribute__NsdObject.initOperations(_DataAttribute__NsdObject);
			Fragments._DataAttribute__OclAny.initOperations(_DataAttribute__OclAny);
			Fragments._DataAttribute__OclElement.initOperations(_DataAttribute__OclElement);

			Fragments._DataObject__AgPresenceCondition.initOperations(_DataObject__AgPresenceCondition);
			Fragments._DataObject__AgPresenceConditionDerivedStatistics.initOperations(_DataObject__AgPresenceConditionDerivedStatistics);
			Fragments._DataObject__AgUnderlyingType.initOperations(_DataObject__AgUnderlyingType);
			Fragments._DataObject__DataObject.initOperations(_DataObject__DataObject);
			Fragments._DataObject__DocumentedClass.initOperations(_DataObject__DocumentedClass);
			Fragments._DataObject__NsdObject.initOperations(_DataObject__NsdObject);
			Fragments._DataObject__OclAny.initOperations(_DataObject__OclAny);
			Fragments._DataObject__OclElement.initOperations(_DataObject__OclElement);

			Fragments._DataSetMemberOf__DataSetMemberOf.initOperations(_DataSetMemberOf__DataSetMemberOf);
			Fragments._DataSetMemberOf__NsdObject.initOperations(_DataSetMemberOf__NsdObject);
			Fragments._DataSetMemberOf__OclAny.initOperations(_DataSetMemberOf__OclAny);
			Fragments._DataSetMemberOf__OclElement.initOperations(_DataSetMemberOf__OclElement);

			Fragments._DefinedAttributeTypeKind__DefinedAttributeTypeKind.initOperations(_DefinedAttributeTypeKind__DefinedAttributeTypeKind);
			Fragments._DefinedAttributeTypeKind__OclAny.initOperations(_DefinedAttributeTypeKind__OclAny);
			Fragments._DefinedAttributeTypeKind__OclElement.initOperations(_DefinedAttributeTypeKind__OclElement);
			Fragments._DefinedAttributeTypeKind__OclEnumeration.initOperations(_DefinedAttributeTypeKind__OclEnumeration);
			Fragments._DefinedAttributeTypeKind__OclType.initOperations(_DefinedAttributeTypeKind__OclType);

			Fragments._DefinedAttributeTypeKindObject__DefinedAttributeTypeKindObject.initOperations(_DefinedAttributeTypeKindObject__DefinedAttributeTypeKindObject);
			Fragments._DefinedAttributeTypeKindObject__OclAny.initOperations(_DefinedAttributeTypeKindObject__OclAny);

			Fragments._DependsOn__AgNSIdentification.initOperations(_DependsOn__AgNSIdentification);
			Fragments._DependsOn__DependsOn.initOperations(_DependsOn__DependsOn);
			Fragments._DependsOn__NsdObject.initOperations(_DependsOn__NsdObject);
			Fragments._DependsOn__OclAny.initOperations(_DependsOn__OclAny);
			Fragments._DependsOn__OclElement.initOperations(_DependsOn__OclElement);

			Fragments._Doc__Doc.initOperations(_Doc__Doc);
			Fragments._Doc__NsdObject.initOperations(_Doc__NsdObject);
			Fragments._Doc__OclAny.initOperations(_Doc__OclAny);
			Fragments._Doc__OclElement.initOperations(_Doc__OclElement);

			Fragments._DocumentRoot__DocumentRoot.initOperations(_DocumentRoot__DocumentRoot);
			Fragments._DocumentRoot__OclAny.initOperations(_DocumentRoot__OclAny);
			Fragments._DocumentRoot__OclElement.initOperations(_DocumentRoot__OclElement);

			Fragments._DocumentedClass__DocumentedClass.initOperations(_DocumentedClass__DocumentedClass);
			Fragments._DocumentedClass__NsdObject.initOperations(_DocumentedClass__NsdObject);
			Fragments._DocumentedClass__OclAny.initOperations(_DocumentedClass__OclAny);
			Fragments._DocumentedClass__OclElement.initOperations(_DocumentedClass__OclElement);

			Fragments._Enumeration__DocumentedClass.initOperations(_Enumeration__DocumentedClass);
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__NsdObject.initOperations(_Enumeration__NsdObject);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
			Fragments._Enumeration__OclElement.initOperations(_Enumeration__OclElement);
			Fragments._Enumeration__TitledClass.initOperations(_Enumeration__TitledClass);

			Fragments._Enumerations__Enumerations.initOperations(_Enumerations__Enumerations);
			Fragments._Enumerations__NsdObject.initOperations(_Enumerations__NsdObject);
			Fragments._Enumerations__OclAny.initOperations(_Enumerations__OclAny);
			Fragments._Enumerations__OclElement.initOperations(_Enumerations__OclElement);

			Fragments._FunctionalConstraint__FunctionalConstraint.initOperations(_FunctionalConstraint__FunctionalConstraint);
			Fragments._FunctionalConstraint__NsdObject.initOperations(_FunctionalConstraint__NsdObject);
			Fragments._FunctionalConstraint__OclAny.initOperations(_FunctionalConstraint__OclAny);
			Fragments._FunctionalConstraint__OclElement.initOperations(_FunctionalConstraint__OclElement);

			Fragments._FunctionalConstraints__FunctionalConstraints.initOperations(_FunctionalConstraints__FunctionalConstraints);
			Fragments._FunctionalConstraints__NsdObject.initOperations(_FunctionalConstraints__NsdObject);
			Fragments._FunctionalConstraints__OclAny.initOperations(_FunctionalConstraints__OclAny);
			Fragments._FunctionalConstraints__OclElement.initOperations(_FunctionalConstraints__OclElement);

			Fragments._IRiseClipseConsole__IRiseClipseConsole.initOperations(_IRiseClipseConsole__IRiseClipseConsole);
			Fragments._IRiseClipseConsole__OclAny.initOperations(_IRiseClipseConsole__OclAny);
			Fragments._IRiseClipseConsole__OclElement.initOperations(_IRiseClipseConsole__OclElement);

			Fragments._LNClass__AnyLNClass.initOperations(_LNClass__AnyLNClass);
			Fragments._LNClass__DocumentedClass.initOperations(_LNClass__DocumentedClass);
			Fragments._LNClass__LNClass.initOperations(_LNClass__LNClass);
			Fragments._LNClass__NsdObject.initOperations(_LNClass__NsdObject);
			Fragments._LNClass__OclAny.initOperations(_LNClass__OclAny);
			Fragments._LNClass__OclElement.initOperations(_LNClass__OclElement);
			Fragments._LNClass__TitledClass.initOperations(_LNClass__TitledClass);

			Fragments._LNClasses__LNClasses.initOperations(_LNClasses__LNClasses);
			Fragments._LNClasses__NsdObject.initOperations(_LNClasses__NsdObject);
			Fragments._LNClasses__OclAny.initOperations(_LNClasses__OclAny);
			Fragments._LNClasses__OclElement.initOperations(_LNClasses__OclElement);

			Fragments._License__License.initOperations(_License__License);
			Fragments._License__NsdObject.initOperations(_License__NsdObject);
			Fragments._License__OclAny.initOperations(_License__OclAny);
			Fragments._License__OclElement.initOperations(_License__OclElement);

			Fragments._LicenseKind__LicenseKind.initOperations(_LicenseKind__LicenseKind);
			Fragments._LicenseKind__OclAny.initOperations(_LicenseKind__OclAny);
			Fragments._LicenseKind__OclElement.initOperations(_LicenseKind__OclElement);
			Fragments._LicenseKind__OclEnumeration.initOperations(_LicenseKind__OclEnumeration);
			Fragments._LicenseKind__OclType.initOperations(_LicenseKind__OclType);

			Fragments._LicenseKindObject__LicenseKindObject.initOperations(_LicenseKindObject__LicenseKindObject);
			Fragments._LicenseKindObject__OclAny.initOperations(_LicenseKindObject__OclAny);

			Fragments._Literal__DocumentedClass.initOperations(_Literal__DocumentedClass);
			Fragments._Literal__Literal.initOperations(_Literal__Literal);
			Fragments._Literal__NsdObject.initOperations(_Literal__NsdObject);
			Fragments._Literal__OclAny.initOperations(_Literal__OclAny);
			Fragments._Literal__OclElement.initOperations(_Literal__OclElement);

			Fragments._NS__AgNSIdentification.initOperations(_NS__AgNSIdentification);
			Fragments._NS__AgNSdesc.initOperations(_NS__AgNSdesc);
			Fragments._NS__AgUML.initOperations(_NS__AgUML);
			Fragments._NS__Copyrighted.initOperations(_NS__Copyrighted);
			Fragments._NS__NS.initOperations(_NS__NS);
			Fragments._NS__NsdObject.initOperations(_NS__NsdObject);
			Fragments._NS__OclAny.initOperations(_NS__OclAny);
			Fragments._NS__OclElement.initOperations(_NS__OclElement);

			Fragments._NSDoc__AgNSIdentification.initOperations(_NSDoc__AgNSIdentification);
			Fragments._NSDoc__AgUML.initOperations(_NSDoc__AgUML);
			Fragments._NSDoc__Copyrighted.initOperations(_NSDoc__Copyrighted);
			Fragments._NSDoc__NSDoc.initOperations(_NSDoc__NSDoc);
			Fragments._NSDoc__NsdObject.initOperations(_NSDoc__NsdObject);
			Fragments._NSDoc__OclAny.initOperations(_NSDoc__OclAny);
			Fragments._NSDoc__OclElement.initOperations(_NSDoc__OclElement);

			Fragments._Notice__Notice.initOperations(_Notice__Notice);
			Fragments._Notice__NsdObject.initOperations(_Notice__NsdObject);
			Fragments._Notice__OclAny.initOperations(_Notice__OclAny);
			Fragments._Notice__OclElement.initOperations(_Notice__OclElement);

			Fragments._NsdObject__NsdObject.initOperations(_NsdObject__NsdObject);
			Fragments._NsdObject__OclAny.initOperations(_NsdObject__OclAny);
			Fragments._NsdObject__OclElement.initOperations(_NsdObject__OclElement);

			Fragments._PresenceCondition__NsdObject.initOperations(_PresenceCondition__NsdObject);
			Fragments._PresenceCondition__OclAny.initOperations(_PresenceCondition__OclAny);
			Fragments._PresenceCondition__OclElement.initOperations(_PresenceCondition__OclElement);
			Fragments._PresenceCondition__PresenceCondition.initOperations(_PresenceCondition__PresenceCondition);

			Fragments._PresenceConditions__NsdObject.initOperations(_PresenceConditions__NsdObject);
			Fragments._PresenceConditions__OclAny.initOperations(_PresenceConditions__OclAny);
			Fragments._PresenceConditions__OclElement.initOperations(_PresenceConditions__OclElement);
			Fragments._PresenceConditions__PresenceConditions.initOperations(_PresenceConditions__PresenceConditions);

			Fragments._PubStage__OclAny.initOperations(_PubStage__OclAny);
			Fragments._PubStage__OclElement.initOperations(_PubStage__OclElement);
			Fragments._PubStage__OclEnumeration.initOperations(_PubStage__OclEnumeration);
			Fragments._PubStage__OclType.initOperations(_PubStage__OclType);
			Fragments._PubStage__PubStage.initOperations(_PubStage__PubStage);

			Fragments._PubStageObject__OclAny.initOperations(_PubStageObject__OclAny);
			Fragments._PubStageObject__PubStageObject.initOperations(_PubStageObject__PubStageObject);

			Fragments._ServiceCDC__NsdObject.initOperations(_ServiceCDC__NsdObject);
			Fragments._ServiceCDC__OclAny.initOperations(_ServiceCDC__OclAny);
			Fragments._ServiceCDC__OclElement.initOperations(_ServiceCDC__OclElement);
			Fragments._ServiceCDC__ServiceCDC.initOperations(_ServiceCDC__ServiceCDC);

			Fragments._ServiceCDCs__NsdObject.initOperations(_ServiceCDCs__NsdObject);
			Fragments._ServiceCDCs__OclAny.initOperations(_ServiceCDCs__OclAny);
			Fragments._ServiceCDCs__OclElement.initOperations(_ServiceCDCs__OclElement);
			Fragments._ServiceCDCs__ServiceCDCs.initOperations(_ServiceCDCs__ServiceCDCs);

			Fragments._ServiceConstructedAttribute__ConstructedAttribute.initOperations(_ServiceConstructedAttribute__ConstructedAttribute);
			Fragments._ServiceConstructedAttribute__DocumentedClass.initOperations(_ServiceConstructedAttribute__DocumentedClass);
			Fragments._ServiceConstructedAttribute__NsdObject.initOperations(_ServiceConstructedAttribute__NsdObject);
			Fragments._ServiceConstructedAttribute__OclAny.initOperations(_ServiceConstructedAttribute__OclAny);
			Fragments._ServiceConstructedAttribute__OclElement.initOperations(_ServiceConstructedAttribute__OclElement);
			Fragments._ServiceConstructedAttribute__ServiceConstructedAttribute.initOperations(_ServiceConstructedAttribute__ServiceConstructedAttribute);
			Fragments._ServiceConstructedAttribute__TitledClass.initOperations(_ServiceConstructedAttribute__TitledClass);

			Fragments._ServiceConstructedAttributes__NsdObject.initOperations(_ServiceConstructedAttributes__NsdObject);
			Fragments._ServiceConstructedAttributes__OclAny.initOperations(_ServiceConstructedAttributes__OclAny);
			Fragments._ServiceConstructedAttributes__OclElement.initOperations(_ServiceConstructedAttributes__OclElement);
			Fragments._ServiceConstructedAttributes__ServiceConstructedAttributes.initOperations(_ServiceConstructedAttributes__ServiceConstructedAttributes);

			Fragments._ServiceDataAttribute__AgAttributeType.initOperations(_ServiceDataAttribute__AgAttributeType);
			Fragments._ServiceDataAttribute__AgPresenceCondition.initOperations(_ServiceDataAttribute__AgPresenceCondition);
			Fragments._ServiceDataAttribute__AgUnderlyingType.initOperations(_ServiceDataAttribute__AgUnderlyingType);
			Fragments._ServiceDataAttribute__DocumentedClass.initOperations(_ServiceDataAttribute__DocumentedClass);
			Fragments._ServiceDataAttribute__NsdObject.initOperations(_ServiceDataAttribute__NsdObject);
			Fragments._ServiceDataAttribute__OclAny.initOperations(_ServiceDataAttribute__OclAny);
			Fragments._ServiceDataAttribute__OclElement.initOperations(_ServiceDataAttribute__OclElement);
			Fragments._ServiceDataAttribute__ServiceDataAttribute.initOperations(_ServiceDataAttribute__ServiceDataAttribute);

			Fragments._ServiceNS__AgNSIdentification.initOperations(_ServiceNS__AgNSIdentification);
			Fragments._ServiceNS__AgNSdesc.initOperations(_ServiceNS__AgNSdesc);
			Fragments._ServiceNS__AgUML.initOperations(_ServiceNS__AgUML);
			Fragments._ServiceNS__Copyrighted.initOperations(_ServiceNS__Copyrighted);
			Fragments._ServiceNS__NsdObject.initOperations(_ServiceNS__NsdObject);
			Fragments._ServiceNS__OclAny.initOperations(_ServiceNS__OclAny);
			Fragments._ServiceNS__OclElement.initOperations(_ServiceNS__OclElement);
			Fragments._ServiceNS__ServiceNS.initOperations(_ServiceNS__ServiceNS);

			Fragments._ServiceNsUsage__AgNSIdentification.initOperations(_ServiceNsUsage__AgNSIdentification);
			Fragments._ServiceNsUsage__NsdObject.initOperations(_ServiceNsUsage__NsdObject);
			Fragments._ServiceNsUsage__OclAny.initOperations(_ServiceNsUsage__OclAny);
			Fragments._ServiceNsUsage__OclElement.initOperations(_ServiceNsUsage__OclElement);
			Fragments._ServiceNsUsage__ServiceNsUsage.initOperations(_ServiceNsUsage__ServiceNsUsage);

			Fragments._ServiceParameter__AgAttributeType.initOperations(_ServiceParameter__AgAttributeType);
			Fragments._ServiceParameter__AgAttributeTypeAndValues.initOperations(_ServiceParameter__AgAttributeTypeAndValues);
			Fragments._ServiceParameter__DocumentedClass.initOperations(_ServiceParameter__DocumentedClass);
			Fragments._ServiceParameter__NsdObject.initOperations(_ServiceParameter__NsdObject);
			Fragments._ServiceParameter__OclAny.initOperations(_ServiceParameter__OclAny);
			Fragments._ServiceParameter__OclElement.initOperations(_ServiceParameter__OclElement);
			Fragments._ServiceParameter__ServiceParameter.initOperations(_ServiceParameter__ServiceParameter);

			Fragments._ServiceType__NsdObject.initOperations(_ServiceType__NsdObject);
			Fragments._ServiceType__OclAny.initOperations(_ServiceType__OclAny);
			Fragments._ServiceType__OclElement.initOperations(_ServiceType__OclElement);
			Fragments._ServiceType__ServiceType.initOperations(_ServiceType__ServiceType);

			Fragments._ServiceTypeRealizations__NsdObject.initOperations(_ServiceTypeRealizations__NsdObject);
			Fragments._ServiceTypeRealizations__OclAny.initOperations(_ServiceTypeRealizations__OclAny);
			Fragments._ServiceTypeRealizations__OclElement.initOperations(_ServiceTypeRealizations__OclElement);
			Fragments._ServiceTypeRealizations__ServiceTypeRealizations.initOperations(_ServiceTypeRealizations__ServiceTypeRealizations);

			Fragments._SubDataAttribute__AgArray.initOperations(_SubDataAttribute__AgArray);
			Fragments._SubDataAttribute__AgAttributeType.initOperations(_SubDataAttribute__AgAttributeType);
			Fragments._SubDataAttribute__AgAttributeTypeAndValues.initOperations(_SubDataAttribute__AgAttributeTypeAndValues);
			Fragments._SubDataAttribute__AgPresenceCondition.initOperations(_SubDataAttribute__AgPresenceCondition);
			Fragments._SubDataAttribute__DocumentedClass.initOperations(_SubDataAttribute__DocumentedClass);
			Fragments._SubDataAttribute__NsdObject.initOperations(_SubDataAttribute__NsdObject);
			Fragments._SubDataAttribute__OclAny.initOperations(_SubDataAttribute__OclAny);
			Fragments._SubDataAttribute__OclElement.initOperations(_SubDataAttribute__OclElement);
			Fragments._SubDataAttribute__SubDataAttribute.initOperations(_SubDataAttribute__SubDataAttribute);

			Fragments._SubDataObject__AgArray.initOperations(_SubDataObject__AgArray);
			Fragments._SubDataObject__AgPresenceCondition.initOperations(_SubDataObject__AgPresenceCondition);
			Fragments._SubDataObject__AgUnderlyingType.initOperations(_SubDataObject__AgUnderlyingType);
			Fragments._SubDataObject__DocumentedClass.initOperations(_SubDataObject__DocumentedClass);
			Fragments._SubDataObject__NsdObject.initOperations(_SubDataObject__NsdObject);
			Fragments._SubDataObject__OclAny.initOperations(_SubDataObject__OclAny);
			Fragments._SubDataObject__OclElement.initOperations(_SubDataObject__OclElement);
			Fragments._SubDataObject__SubDataObject.initOperations(_SubDataObject__SubDataObject);

			Fragments._TitledClass__DocumentedClass.initOperations(_TitledClass__DocumentedClass);
			Fragments._TitledClass__NsdObject.initOperations(_TitledClass__NsdObject);
			Fragments._TitledClass__OclAny.initOperations(_TitledClass__OclAny);
			Fragments._TitledClass__OclElement.initOperations(_TitledClass__OclElement);
			Fragments._TitledClass__TitledClass.initOperations(_TitledClass__TitledClass);

			Fragments._UndefinedAttributeTypeKind__OclAny.initOperations(_UndefinedAttributeTypeKind__OclAny);
			Fragments._UndefinedAttributeTypeKind__OclElement.initOperations(_UndefinedAttributeTypeKind__OclElement);
			Fragments._UndefinedAttributeTypeKind__OclEnumeration.initOperations(_UndefinedAttributeTypeKind__OclEnumeration);
			Fragments._UndefinedAttributeTypeKind__OclType.initOperations(_UndefinedAttributeTypeKind__OclType);
			Fragments._UndefinedAttributeTypeKind__UndefinedAttributeTypeKind.initOperations(_UndefinedAttributeTypeKind__UndefinedAttributeTypeKind);

			Fragments._UndefinedAttributeTypeKindObject__OclAny.initOperations(_UndefinedAttributeTypeKindObject__OclAny);
			Fragments._UndefinedAttributeTypeKindObject__UndefinedAttributeTypeKindObject.initOperations(_UndefinedAttributeTypeKindObject__UndefinedAttributeTypeKindObject);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _ACSIServicesKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ACSIServicesKindObject = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Abbreviation = {
			NsdTables.Properties._Abbreviation__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._Abbreviation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Abbreviation__parentAbbreviations,
			NsdTables.Properties._Abbreviation__refersToDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Abbreviations = {
			NsdTables.Properties._Abbreviations__abbreviation,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Abbreviations__parentNS,
			NsdTables.Properties._Abbreviations__parentServiceNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AbstractLNClass = {
			NsdTables.Properties._AnyLNClass__base,
			NsdTables.Properties._AnyLNClass__dataObject,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._AbstractLNClass__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AbstractLNClass__parentLNClasses,
			NsdTables.Properties._AbstractLNClass__referredByAnyLNClass,
			NsdTables.Properties._AnyLNClass__refersToAbstractLNClass,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._TitledClass__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgArray = {
			NsdTables.Properties._AgArray__isArray,
			NsdTables.Properties._AgArray__maxIndexAttribute,
			NsdTables.Properties._AgArray__minIndex,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgArray__sizeAttribute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgAttributeType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgAttributeType__refersToBasicType,
			NsdTables.Properties._AgAttributeType__refersToConstructedAttribute,
			NsdTables.Properties._AgAttributeType__refersToEnumeration,
			NsdTables.Properties._AgAttributeType__type,
			NsdTables.Properties._AgAttributeType__typeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgAttributeTypeAndValues = {
			NsdTables.Properties._AgAttributeTypeAndValues__defaultValue,
			NsdTables.Properties._AgAttributeTypeAndValues__maxValue,
			NsdTables.Properties._AgAttributeTypeAndValues__minValue,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgAttributeType__refersToBasicType,
			NsdTables.Properties._AgAttributeType__refersToConstructedAttribute,
			NsdTables.Properties._AgAttributeType__refersToEnumeration,
			NsdTables.Properties._AgAttributeType__type,
			NsdTables.Properties._AgAttributeType__typeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgNSIdentification = {
			NsdTables.Properties._AgNSIdentification__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgNSdesc = {
			NsdTables.Properties._AgNSdesc__descID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgNSdesc__refersToDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgPresenceCondition = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgPresenceCondition__presCond,
			NsdTables.Properties._AgPresenceCondition__presCondArgs,
			NsdTables.Properties._AgPresenceCondition__presCondArgsID,
			NsdTables.Properties._AgPresenceCondition__refersToPresCondArgsDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgPresenceConditionDerivedStatistics = {
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__dsPresCond,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__dsPresCondArgs,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__dsPresCondArgsID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__refersToDsPresCondArgsDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgTrgOp = {
			NsdTables.Properties._AgTrgOp__dchg,
			NsdTables.Properties._AgTrgOp__dupd,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgTrgOp__qchg
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgUML = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgUML__umlDate,
			NsdTables.Properties._AgUML__umlVersion
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AgUnderlyingType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingBasicType,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingConstructedAttribute,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingEnumeration,
			NsdTables.Properties._AgUnderlyingType__underlyingType,
			NsdTables.Properties._AgUnderlyingType__underlyingTypeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AnyLNClass = {
			NsdTables.Properties._AnyLNClass__base,
			NsdTables.Properties._AnyLNClass__dataObject,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AnyLNClass__refersToAbstractLNClass,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._TitledClass__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ApplicableServiceNS = {
			NsdTables.Properties._Copyrighted__copyright,
			NsdTables.Properties._ApplicableServiceNS__date,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ApplicableServiceNS__serviceNsUsage,
			NsdTables.Properties._ApplicableServiceNS__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ApplicableServices = {
			NsdTables.Properties._ApplicableServices__dataSetMemberOf,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ApplicableServices__parentFunctionalConstraint,
			NsdTables.Properties._ApplicableServices__service
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AppliesToType = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._AgNSIdentification__id,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AppliesToType__parentServiceNsUsage,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttributeTypeKind = {};

		private static final ExecutorProperty /*@NonNull*/ [] _BasicType = {
			NsdTables.Properties._BasicType__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._BasicType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._BasicType__parentBasicTypes,
			NsdTables.Properties._BasicType__referredByAttributeType,
			NsdTables.Properties._BasicType__referredByUnderlyingType,
			NsdTables.Properties._BasicType__refersToDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BasicTypes = {
			NsdTables.Properties._BasicTypes__basicType,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._BasicTypes__parentNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CBKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CBKindObject = {};

		private static final ExecutorProperty /*@NonNull*/ [] _CDC = {
			NsdTables.Properties._CDC__dataAttribute,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._CDC__enumParameterized,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._CDC__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._CDC__parentCDCs,
			NsdTables.Properties._CDC__referredByDataObject,
			NsdTables.Properties._CDC__referredBySubDataObject,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._CDC__serviceParameter,
			NsdTables.Properties._CDC__statistics,
			NsdTables.Properties._CDC__subDataObject,
			NsdTables.Properties._TitledClass__titleID,
			NsdTables.Properties._CDC__typeKindParameterized,
			NsdTables.Properties._CDC__variant
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CDCs = {
			NsdTables.Properties._CDCs__cDC,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._CDCs__parentNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Changes = {
			NsdTables.Properties._Changes__changesID,
			NsdTables.Properties._Changes__date,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Changes__parentNS,
			NsdTables.Properties._Changes__parentServiceNS,
			NsdTables.Properties._Changes__release,
			NsdTables.Properties._Changes__revision,
			NsdTables.Properties._Changes__tissues,
			NsdTables.Properties._Changes__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConstructedAttribute = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._ConstructedAttribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ConstructedAttribute__parentConstructedAttributes,
			NsdTables.Properties._ConstructedAttribute__parentServiceTypeRealizations,
			NsdTables.Properties._ConstructedAttribute__referredByAttributeType,
			NsdTables.Properties._ConstructedAttribute__referredByUnderlyingType,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._ConstructedAttribute__subDataAttribute,
			NsdTables.Properties._TitledClass__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConstructedAttributes = {
			NsdTables.Properties._ConstructedAttributes__constructedAttribute,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ConstructedAttributes__parentNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CopyrightNotice = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._CopyrightNotice__license,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._CopyrightNotice__notice,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._CopyrightNotice__parentCopyrighted
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Copyrighted = {
			NsdTables.Properties._Copyrighted__copyright,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataAttribute = {
			NsdTables.Properties._AgTrgOp__dchg,
			NsdTables.Properties._AgAttributeTypeAndValues__defaultValue,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._AgTrgOp__dupd,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DataAttribute__fc,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._AgArray__isArray,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._AgArray__maxIndexAttribute,
			NsdTables.Properties._AgAttributeTypeAndValues__maxValue,
			NsdTables.Properties._AgArray__minIndex,
			NsdTables.Properties._AgAttributeTypeAndValues__minValue,
			NsdTables.Properties._DataAttribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DataAttribute__parentCDC,
			NsdTables.Properties._AgPresenceCondition__presCond,
			NsdTables.Properties._AgPresenceCondition__presCondArgs,
			NsdTables.Properties._AgPresenceCondition__presCondArgsID,
			NsdTables.Properties._AgTrgOp__qchg,
			NsdTables.Properties._DataAttribute__referredByDataAttributeAsMaxIndexAttribute,
			NsdTables.Properties._DataAttribute__referredByDataAttributeAsSizeAttribute,
			NsdTables.Properties._DataAttribute__referredBySubDataObjectAsMaxIndexAttribute,
			NsdTables.Properties._DataAttribute__referredBySubDataObjectAsSizeAttribute,
			NsdTables.Properties._AgAttributeType__refersToBasicType,
			NsdTables.Properties._AgAttributeType__refersToConstructedAttribute,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._AgAttributeType__refersToEnumeration,
			NsdTables.Properties._DataAttribute__refersToFunctionalConstraint,
			NsdTables.Properties._DataAttribute__refersToMaxIndexAttribute,
			NsdTables.Properties._AgPresenceCondition__refersToPresCondArgsDoc,
			NsdTables.Properties._DataAttribute__refersToPresenceCondition,
			NsdTables.Properties._DataAttribute__refersToSizeAttribute,
			NsdTables.Properties._AgArray__sizeAttribute,
			NsdTables.Properties._AgAttributeType__type,
			NsdTables.Properties._AgAttributeType__typeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataObject = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__dsPresCond,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__dsPresCondArgs,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__dsPresCondArgsID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._DataObject__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DataObject__parentAnyLNClass,
			NsdTables.Properties._AgPresenceCondition__presCond,
			NsdTables.Properties._AgPresenceCondition__presCondArgs,
			NsdTables.Properties._AgPresenceCondition__presCondArgsID,
			NsdTables.Properties._DataObject__refersToCDC,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._AgPresenceConditionDerivedStatistics__refersToDsPresCondArgsDoc,
			NsdTables.Properties._AgPresenceCondition__refersToPresCondArgsDoc,
			NsdTables.Properties._DataObject__refersToPresenceCondition,
			NsdTables.Properties._DataObject__refersToPresenceConditionDerivedStatistics,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingBasicType,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingConstructedAttribute,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingEnumeration,
			NsdTables.Properties._DataObject__transient,
			NsdTables.Properties._DataObject__type,
			NsdTables.Properties._AgUnderlyingType__underlyingType,
			NsdTables.Properties._AgUnderlyingType__underlyingTypeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataSetMemberOf = {
			NsdTables.Properties._DataSetMemberOf__cb,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DataSetMemberOf__parentApplicableServices
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DefinedAttributeTypeKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DefinedAttributeTypeKindObject = {};

		private static final ExecutorProperty /*@NonNull*/ [] _DependsOn = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._AgNSIdentification__id,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DependsOn__parentNS,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._DependsOn__refersToNS,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Doc = {
			NsdTables.Properties._Doc__ReferredByAgNSDesc,
			NsdTables.Properties._Doc__any,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._Doc__group,
			NsdTables.Properties._Doc__id,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._Doc__mixed,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Doc__parentNSDoc,
			NsdTables.Properties._Doc__referredByAbbreviation,
			NsdTables.Properties._Doc__referredByAgPresenceCondition,
			NsdTables.Properties._Doc__referredByAgPresenceConditionDerivedStatistics,
			NsdTables.Properties._Doc__referredByBasicType,
			NsdTables.Properties._Doc__referredByDocumentedClass,
			NsdTables.Properties._Doc__referredByFunctionalConstraintAsDesc,
			NsdTables.Properties._Doc__referredByFunctionalConstraintAsTitle,
			NsdTables.Properties._Doc__referredByPresenceConditionAsDesc,
			NsdTables.Properties._Doc__referredByPresenceConditionAsTitle,
			NsdTables.Properties._Doc__referredByTitledClass
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DocumentRoot = {
			NsdTables.Properties._DocumentRoot__applicableServiceNS,
			NsdTables.Properties._DocumentRoot__mixed,
			NsdTables.Properties._DocumentRoot__nS,
			NsdTables.Properties._DocumentRoot__nSDoc,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DocumentRoot__serviceNS,
			NsdTables.Properties._DocumentRoot__xMLNSPrefixMap,
			NsdTables.Properties._DocumentRoot__xSISchemaLocation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DocumentedClass = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DocumentedClass__refersToDescDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enumeration = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._Enumeration__inheritedFrom,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._Enumeration__literal,
			NsdTables.Properties._Enumeration__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Enumeration__parentEnumerations,
			NsdTables.Properties._Enumeration__referredByAttributeType,
			NsdTables.Properties._Enumeration__referredByEnumerationAsBase,
			NsdTables.Properties._Enumeration__referredByUnderlyingType,
			NsdTables.Properties._Enumeration__refersToBaseEnumeration,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._TitledClass__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enumerations = {
			NsdTables.Properties._Enumerations__enumeration,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Enumerations__parentNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FunctionalConstraint = {
			NsdTables.Properties._FunctionalConstraint__abbreviation,
			NsdTables.Properties._FunctionalConstraint__applicableServices,
			NsdTables.Properties._FunctionalConstraint__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._FunctionalConstraint__parentFunctionalConstraints,
			NsdTables.Properties._FunctionalConstraint__referredByDataAttribute,
			NsdTables.Properties._FunctionalConstraint__refersToDescDoc,
			NsdTables.Properties._FunctionalConstraint__refersToTitleDoc,
			NsdTables.Properties._FunctionalConstraint__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FunctionalConstraints = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._FunctionalConstraints__functionalConstraint,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._FunctionalConstraints__parentNS,
			NsdTables.Properties._FunctionalConstraints__parentServiceNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IRiseClipseConsole = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LNClass = {
			NsdTables.Properties._AnyLNClass__base,
			NsdTables.Properties._LNClass__canHaveLOG,
			NsdTables.Properties._AnyLNClass__dataObject,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._LNClass__isExtension,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._LNClass__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._LNClass__parentLNClasses,
			NsdTables.Properties._AnyLNClass__refersToAbstractLNClass,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._TitledClass__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LNClasses = {
			NsdTables.Properties._LNClasses__abstractLNClass,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._LNClasses__lNClass,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._LNClasses__parentNS
		};

		private static final ExecutorProperty /*@NonNull*/ [] _License = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._License__kind,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._License__mixed,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._License__parentCopyrightNotice,
			NsdTables.Properties._License__uri
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LicenseKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LicenseKindObject = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Literal = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._Literal__literalVal,
			NsdTables.Properties._Literal__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Literal__parentEnumeration,
			NsdTables.Properties._DocumentedClass__refersToDescDoc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NS = {
			NsdTables.Properties._NS__abbreviations,
			NsdTables.Properties._NS__basicTypes,
			NsdTables.Properties._NS__cDCs,
			NsdTables.Properties._NS__changes,
			NsdTables.Properties._NS__constructedAttributes,
			NsdTables.Properties._Copyrighted__copyright,
			NsdTables.Properties._NS__dependsOn,
			NsdTables.Properties._AgNSdesc__descID,
			NsdTables.Properties._NS__enumerations,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NS__functionalConstraints,
			NsdTables.Properties._AgNSIdentification__id,
			NsdTables.Properties._NS__lNClasses,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._NS__presenceConditions,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._NS__referredByDependsOn,
			NsdTables.Properties._AgNSdesc__refersToDoc,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._AgUML__umlDate,
			NsdTables.Properties._AgUML__umlVersion,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NSDoc = {
			NsdTables.Properties._Copyrighted__copyright,
			NsdTables.Properties._NSDoc__doc,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._AgNSIdentification__id,
			NsdTables.Properties._NSDoc__lang,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._AgUML__umlDate,
			NsdTables.Properties._AgUML__umlVersion,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Notice = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._Notice__mixed,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._Notice__parentCopyrightNotice
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NsdObject = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PresenceCondition = {
			NsdTables.Properties._PresenceCondition__argument,
			NsdTables.Properties._PresenceCondition__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._PresenceCondition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._PresenceCondition__parentPresenceConditions,
			NsdTables.Properties._PresenceCondition__referredByDataAttribute,
			NsdTables.Properties._PresenceCondition__referredByDataObject,
			NsdTables.Properties._PresenceCondition__referredByDataObjectForDerivedStatistics,
			NsdTables.Properties._PresenceCondition__referredBySubDataAttribute,
			NsdTables.Properties._PresenceCondition__referredBySubDataObject,
			NsdTables.Properties._PresenceCondition__refersToDescDoc,
			NsdTables.Properties._PresenceCondition__refersToTitleDoc,
			NsdTables.Properties._PresenceCondition__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PresenceConditions = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._PresenceConditions__parentNS,
			NsdTables.Properties._PresenceConditions__parentServiceNS,
			NsdTables.Properties._PresenceConditions__presenceCondition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PubStage = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PubStageObject = {};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceCDC = {
			NsdTables.Properties._ServiceCDC__cdc,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceCDC__parentServiceCDCs,
			NsdTables.Properties._ServiceCDC__serviceDataAttribute,
			NsdTables.Properties._ServiceCDC__variant
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceCDCs = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceCDCs__parentServiceNS,
			NsdTables.Properties._ServiceCDCs__serviceCDC
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceConstructedAttribute = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._ConstructedAttribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ConstructedAttribute__parentConstructedAttributes,
			NsdTables.Properties._ServiceConstructedAttribute__parentServiceConstructedAttributes,
			NsdTables.Properties._ConstructedAttribute__parentServiceTypeRealizations,
			NsdTables.Properties._ConstructedAttribute__referredByAttributeType,
			NsdTables.Properties._ConstructedAttribute__referredByUnderlyingType,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._ConstructedAttribute__subDataAttribute,
			NsdTables.Properties._TitledClass__titleID,
			NsdTables.Properties._ServiceConstructedAttribute__typeKindParameterized
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceConstructedAttributes = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceConstructedAttributes__parentServiceNS,
			NsdTables.Properties._ServiceConstructedAttributes__serviceConstructedAttribute
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceDataAttribute = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._ServiceDataAttribute__fc,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._ServiceDataAttribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceDataAttribute__parentServiceCDC,
			NsdTables.Properties._AgPresenceCondition__presCond,
			NsdTables.Properties._AgPresenceCondition__presCondArgs,
			NsdTables.Properties._AgPresenceCondition__presCondArgsID,
			NsdTables.Properties._AgAttributeType__refersToBasicType,
			NsdTables.Properties._AgAttributeType__refersToConstructedAttribute,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._AgAttributeType__refersToEnumeration,
			NsdTables.Properties._AgPresenceCondition__refersToPresCondArgsDoc,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingBasicType,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingConstructedAttribute,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingEnumeration,
			NsdTables.Properties._AgAttributeType__type,
			NsdTables.Properties._AgAttributeType__typeKind,
			NsdTables.Properties._AgUnderlyingType__underlyingType,
			NsdTables.Properties._AgUnderlyingType__underlyingTypeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceNS = {
			NsdTables.Properties._ServiceNS__abbreviations,
			NsdTables.Properties._ServiceNS__changes,
			NsdTables.Properties._Copyrighted__copyright,
			NsdTables.Properties._AgNSdesc__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._ServiceNS__functionalConstraints,
			NsdTables.Properties._AgNSIdentification__id,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceNS__presenceConditions,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._AgNSdesc__refersToDoc,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._ServiceNS__serviceCDCs,
			NsdTables.Properties._ServiceNS__serviceConstructedAttributes,
			NsdTables.Properties._ServiceNS__serviceTypeRealizations,
			NsdTables.Properties._AgUML__umlDate,
			NsdTables.Properties._AgUML__umlVersion,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceNsUsage = {
			NsdTables.Properties._ServiceNsUsage__appliesTo,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._AgNSIdentification__id,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceNsUsage__parentApplicableServiceNS,
			NsdTables.Properties._AgNSIdentification__publicationStage,
			NsdTables.Properties._AgNSIdentification__release,
			NsdTables.Properties._AgNSIdentification__revision,
			NsdTables.Properties._AgNSIdentification__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceParameter = {
			NsdTables.Properties._AgAttributeTypeAndValues__defaultValue,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._AgAttributeTypeAndValues__maxValue,
			NsdTables.Properties._AgAttributeTypeAndValues__minValue,
			NsdTables.Properties._ServiceParameter__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceParameter__parentCDC,
			NsdTables.Properties._AgAttributeType__refersToBasicType,
			NsdTables.Properties._AgAttributeType__refersToConstructedAttribute,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._AgAttributeType__refersToEnumeration,
			NsdTables.Properties._AgAttributeType__type,
			NsdTables.Properties._AgAttributeType__typeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceType = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._ServiceType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceType__parentApplicableServices
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ServiceTypeRealizations = {
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._ServiceTypeRealizations__parentServiceNS,
			NsdTables.Properties._ServiceTypeRealizations__serviceTypeRealization
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubDataAttribute = {
			NsdTables.Properties._AgAttributeTypeAndValues__defaultValue,
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._AgArray__isArray,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._AgArray__maxIndexAttribute,
			NsdTables.Properties._AgAttributeTypeAndValues__maxValue,
			NsdTables.Properties._AgArray__minIndex,
			NsdTables.Properties._AgAttributeTypeAndValues__minValue,
			NsdTables.Properties._SubDataAttribute__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._SubDataAttribute__parentConstructedAttribute,
			NsdTables.Properties._AgPresenceCondition__presCond,
			NsdTables.Properties._AgPresenceCondition__presCondArgs,
			NsdTables.Properties._AgPresenceCondition__presCondArgsID,
			NsdTables.Properties._AgAttributeType__refersToBasicType,
			NsdTables.Properties._AgAttributeType__refersToConstructedAttribute,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._AgAttributeType__refersToEnumeration,
			NsdTables.Properties._AgPresenceCondition__refersToPresCondArgsDoc,
			NsdTables.Properties._SubDataAttribute__refersToPresenceCondition,
			NsdTables.Properties._AgArray__sizeAttribute,
			NsdTables.Properties._AgAttributeType__type,
			NsdTables.Properties._AgAttributeType__typeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SubDataObject = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._AgArray__isArray,
			NsdTables.Properties._NsdObject__lineNumber,
			NsdTables.Properties._AgArray__maxIndexAttribute,
			NsdTables.Properties._AgArray__minIndex,
			NsdTables.Properties._SubDataObject__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._SubDataObject__parentCDC,
			NsdTables.Properties._AgPresenceCondition__presCond,
			NsdTables.Properties._AgPresenceCondition__presCondArgs,
			NsdTables.Properties._AgPresenceCondition__presCondArgsID,
			NsdTables.Properties._SubDataObject__refersToCDC,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._SubDataObject__refersToMaxIndexAttribute,
			NsdTables.Properties._AgPresenceCondition__refersToPresCondArgsDoc,
			NsdTables.Properties._SubDataObject__refersToPresenceCondition,
			NsdTables.Properties._SubDataObject__refersToSizeAttribute,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingBasicType,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingConstructedAttribute,
			NsdTables.Properties._AgUnderlyingType__refersToUnderlyingEnumeration,
			NsdTables.Properties._AgArray__sizeAttribute,
			NsdTables.Properties._SubDataObject__type,
			NsdTables.Properties._AgUnderlyingType__underlyingType,
			NsdTables.Properties._AgUnderlyingType__underlyingTypeKind
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TitledClass = {
			NsdTables.Properties._DocumentedClass__deprecated,
			NsdTables.Properties._DocumentedClass__descID,
			NsdTables.Properties._NsdObject__explicitLinksBuilt,
			NsdTables.Properties._DocumentedClass__informative,
			NsdTables.Properties._NsdObject__lineNumber,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NsdTables.Properties._DocumentedClass__refersToDescDoc,
			NsdTables.Properties._TitledClass__refersToTitleDoc,
			NsdTables.Properties._TitledClass__titleID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UndefinedAttributeTypeKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UndefinedAttributeTypeKindObject = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ACSIServicesKind__ACSIServicesKind.initProperties(_ACSIServicesKind);
			Fragments._ACSIServicesKindObject__ACSIServicesKindObject.initProperties(_ACSIServicesKindObject);
			Fragments._Abbreviation__Abbreviation.initProperties(_Abbreviation);
			Fragments._Abbreviations__Abbreviations.initProperties(_Abbreviations);
			Fragments._AbstractLNClass__AbstractLNClass.initProperties(_AbstractLNClass);
			Fragments._AgArray__AgArray.initProperties(_AgArray);
			Fragments._AgAttributeType__AgAttributeType.initProperties(_AgAttributeType);
			Fragments._AgAttributeTypeAndValues__AgAttributeTypeAndValues.initProperties(_AgAttributeTypeAndValues);
			Fragments._AgNSIdentification__AgNSIdentification.initProperties(_AgNSIdentification);
			Fragments._AgNSdesc__AgNSdesc.initProperties(_AgNSdesc);
			Fragments._AgPresenceCondition__AgPresenceCondition.initProperties(_AgPresenceCondition);
			Fragments._AgPresenceConditionDerivedStatistics__AgPresenceConditionDerivedStatistics.initProperties(_AgPresenceConditionDerivedStatistics);
			Fragments._AgTrgOp__AgTrgOp.initProperties(_AgTrgOp);
			Fragments._AgUML__AgUML.initProperties(_AgUML);
			Fragments._AgUnderlyingType__AgUnderlyingType.initProperties(_AgUnderlyingType);
			Fragments._AnyLNClass__AnyLNClass.initProperties(_AnyLNClass);
			Fragments._ApplicableServiceNS__ApplicableServiceNS.initProperties(_ApplicableServiceNS);
			Fragments._ApplicableServices__ApplicableServices.initProperties(_ApplicableServices);
			Fragments._AppliesToType__AppliesToType.initProperties(_AppliesToType);
			Fragments._AttributeTypeKind__AttributeTypeKind.initProperties(_AttributeTypeKind);
			Fragments._BasicType__BasicType.initProperties(_BasicType);
			Fragments._BasicTypes__BasicTypes.initProperties(_BasicTypes);
			Fragments._CBKind__CBKind.initProperties(_CBKind);
			Fragments._CBKindObject__CBKindObject.initProperties(_CBKindObject);
			Fragments._CDC__CDC.initProperties(_CDC);
			Fragments._CDCs__CDCs.initProperties(_CDCs);
			Fragments._Changes__Changes.initProperties(_Changes);
			Fragments._ConstructedAttribute__ConstructedAttribute.initProperties(_ConstructedAttribute);
			Fragments._ConstructedAttributes__ConstructedAttributes.initProperties(_ConstructedAttributes);
			Fragments._CopyrightNotice__CopyrightNotice.initProperties(_CopyrightNotice);
			Fragments._Copyrighted__Copyrighted.initProperties(_Copyrighted);
			Fragments._DataAttribute__DataAttribute.initProperties(_DataAttribute);
			Fragments._DataObject__DataObject.initProperties(_DataObject);
			Fragments._DataSetMemberOf__DataSetMemberOf.initProperties(_DataSetMemberOf);
			Fragments._DefinedAttributeTypeKind__DefinedAttributeTypeKind.initProperties(_DefinedAttributeTypeKind);
			Fragments._DefinedAttributeTypeKindObject__DefinedAttributeTypeKindObject.initProperties(_DefinedAttributeTypeKindObject);
			Fragments._DependsOn__DependsOn.initProperties(_DependsOn);
			Fragments._Doc__Doc.initProperties(_Doc);
			Fragments._DocumentRoot__DocumentRoot.initProperties(_DocumentRoot);
			Fragments._DocumentedClass__DocumentedClass.initProperties(_DocumentedClass);
			Fragments._Enumeration__Enumeration.initProperties(_Enumeration);
			Fragments._Enumerations__Enumerations.initProperties(_Enumerations);
			Fragments._FunctionalConstraint__FunctionalConstraint.initProperties(_FunctionalConstraint);
			Fragments._FunctionalConstraints__FunctionalConstraints.initProperties(_FunctionalConstraints);
			Fragments._IRiseClipseConsole__IRiseClipseConsole.initProperties(_IRiseClipseConsole);
			Fragments._LNClass__LNClass.initProperties(_LNClass);
			Fragments._LNClasses__LNClasses.initProperties(_LNClasses);
			Fragments._License__License.initProperties(_License);
			Fragments._LicenseKind__LicenseKind.initProperties(_LicenseKind);
			Fragments._LicenseKindObject__LicenseKindObject.initProperties(_LicenseKindObject);
			Fragments._Literal__Literal.initProperties(_Literal);
			Fragments._NS__NS.initProperties(_NS);
			Fragments._NSDoc__NSDoc.initProperties(_NSDoc);
			Fragments._Notice__Notice.initProperties(_Notice);
			Fragments._NsdObject__NsdObject.initProperties(_NsdObject);
			Fragments._PresenceCondition__PresenceCondition.initProperties(_PresenceCondition);
			Fragments._PresenceConditions__PresenceConditions.initProperties(_PresenceConditions);
			Fragments._PubStage__PubStage.initProperties(_PubStage);
			Fragments._PubStageObject__PubStageObject.initProperties(_PubStageObject);
			Fragments._ServiceCDC__ServiceCDC.initProperties(_ServiceCDC);
			Fragments._ServiceCDCs__ServiceCDCs.initProperties(_ServiceCDCs);
			Fragments._ServiceConstructedAttribute__ServiceConstructedAttribute.initProperties(_ServiceConstructedAttribute);
			Fragments._ServiceConstructedAttributes__ServiceConstructedAttributes.initProperties(_ServiceConstructedAttributes);
			Fragments._ServiceDataAttribute__ServiceDataAttribute.initProperties(_ServiceDataAttribute);
			Fragments._ServiceNS__ServiceNS.initProperties(_ServiceNS);
			Fragments._ServiceNsUsage__ServiceNsUsage.initProperties(_ServiceNsUsage);
			Fragments._ServiceParameter__ServiceParameter.initProperties(_ServiceParameter);
			Fragments._ServiceType__ServiceType.initProperties(_ServiceType);
			Fragments._ServiceTypeRealizations__ServiceTypeRealizations.initProperties(_ServiceTypeRealizations);
			Fragments._SubDataAttribute__SubDataAttribute.initProperties(_SubDataAttribute);
			Fragments._SubDataObject__SubDataObject.initProperties(_SubDataObject);
			Fragments._TitledClass__TitledClass.initProperties(_TitledClass);
			Fragments._UndefinedAttributeTypeKind__UndefinedAttributeTypeKind.initProperties(_UndefinedAttributeTypeKind);
			Fragments._UndefinedAttributeTypeKindObject__UndefinedAttributeTypeKindObject.initProperties(_UndefinedAttributeTypeKindObject);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Associate = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Associate"), Types._ACSIServicesKind, 0);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Abort = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Abort"), Types._ACSIServicesKind, 1);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Release = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Release"), Types._ACSIServicesKind, 2);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetServerDirectory = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetServerDirectory"), Types._ACSIServicesKind, 3);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetLogicalDeviceDirectory = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetLogicalDeviceDirectory"), Types._ACSIServicesKind, 4);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetAllDataValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetAllDataValues"), Types._ACSIServicesKind, 5);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetDataValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetDataValues"), Types._ACSIServicesKind, 6);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetDataValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetDataValues"), Types._ACSIServicesKind, 7);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetDataDirectory = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetDataDirectory"), Types._ACSIServicesKind, 8);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetDataDefinition = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetDataDefinition"), Types._ACSIServicesKind, 9);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetDataSetValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetDataSetValues"), Types._ACSIServicesKind, 10);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetDataSetValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetDataSetValues"), Types._ACSIServicesKind, 11);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__CreateDataSet = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("CreateDataSet"), Types._ACSIServicesKind, 12);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__DeleteDataSet = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("DeleteDataSet"), Types._ACSIServicesKind, 13);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetDataSetDirectory = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetDataSetDirectory"), Types._ACSIServicesKind, 14);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SelectActiveSG = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SelectActiveSG"), Types._ACSIServicesKind, 15);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SelectEditSG = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SelectEditSG"), Types._ACSIServicesKind, 16);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetEditSGValue = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetEditSGValue"), Types._ACSIServicesKind, 17);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__ConfirmEditSGValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("ConfirmEditSGValues"), Types._ACSIServicesKind, 18);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetEditSGValue = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetEditSGValue"), Types._ACSIServicesKind, 19);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetSGCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetSGCBValues"), Types._ACSIServicesKind, 20);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Report = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Report"), Types._ACSIServicesKind, 21);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetBRCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetBRCBValues"), Types._ACSIServicesKind, 22);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetBRCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetBRCBValues"), Types._ACSIServicesKind, 23);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetURCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetURCBValues"), Types._ACSIServicesKind, 24);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetURCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetURCBValues"), Types._ACSIServicesKind, 25);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetLCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetLCBValues"), Types._ACSIServicesKind, 26);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetLCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetLCBValues"), Types._ACSIServicesKind, 27);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__QueryLogByTime = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("QueryLogByTime"), Types._ACSIServicesKind, 28);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__QueryLogAfter = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("QueryLogAfter"), Types._ACSIServicesKind, 29);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetLogStatusValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetLogStatusValues"), Types._ACSIServicesKind, 30);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SendGOOSEMessage = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SendGOOSEMessage"), Types._ACSIServicesKind, 31);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetGoCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetGoCBValues"), Types._ACSIServicesKind, 32);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetGoCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetGoCBValues"), Types._ACSIServicesKind, 33);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetGoReference = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetGoReference"), Types._ACSIServicesKind, 34);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetGOOSEElementNumber = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetGOOSEElementNumber"), Types._ACSIServicesKind, 35);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SendMSVMessage = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SendMSVMessage"), Types._ACSIServicesKind, 36);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetMSVCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetMSVCBValues"), Types._ACSIServicesKind, 37);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetMSVCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetMSVCBValues"), Types._ACSIServicesKind, 38);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SendUSVMessage = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SendUSVMessage"), Types._ACSIServicesKind, 39);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetUSVCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetUSVCBValues"), Types._ACSIServicesKind, 40);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetUSVCBValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetUSVCBValues"), Types._ACSIServicesKind, 41);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Select = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Select"), Types._ACSIServicesKind, 42);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SelectWithValue = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SelectWithValue"), Types._ACSIServicesKind, 43);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Cancel = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Cancel"), Types._ACSIServicesKind, 44);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__Operate = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("Operate"), Types._ACSIServicesKind, 45);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__CommandTermination = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("CommandTermination"), Types._ACSIServicesKind, 46);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__TimeActivatedOperate = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("TimeActivatedOperate"), Types._ACSIServicesKind, 47);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetFile = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetFile"), Types._ACSIServicesKind, 48);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__SetFile = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("SetFile"), Types._ACSIServicesKind, 49);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__DeleteFile = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("DeleteFile"), Types._ACSIServicesKind, 50);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetFileAttributeValues = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetFileAttributeValues"), Types._ACSIServicesKind, 51);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__TimeSynchronization = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("TimeSynchronization"), Types._ACSIServicesKind, 52);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__InternalChange = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("InternalChange"), Types._ACSIServicesKind, 53);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetLogicalNodeDirectory = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetLogicalNodeDirectory"), Types._ACSIServicesKind, 54);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetMsvReference = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetMsvReference"), Types._ACSIServicesKind, 55);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetMSVElementNumber = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetMSVElementNumber"), Types._ACSIServicesKind, 56);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetUsvReference = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetUsvReference"), Types._ACSIServicesKind, 57);
		public static final EcoreExecutorEnumerationLiteral _ACSIServicesKind__GetUSVElementNumber = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.ACSI_SERVICES_KIND.getEEnumLiteral("GetUSVElementNumber"), Types._ACSIServicesKind, 58);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ACSIServicesKind = {
			_ACSIServicesKind__Associate,
			_ACSIServicesKind__Abort,
			_ACSIServicesKind__Release,
			_ACSIServicesKind__GetServerDirectory,
			_ACSIServicesKind__GetLogicalDeviceDirectory,
			_ACSIServicesKind__GetAllDataValues,
			_ACSIServicesKind__GetDataValues,
			_ACSIServicesKind__SetDataValues,
			_ACSIServicesKind__GetDataDirectory,
			_ACSIServicesKind__GetDataDefinition,
			_ACSIServicesKind__GetDataSetValues,
			_ACSIServicesKind__SetDataSetValues,
			_ACSIServicesKind__CreateDataSet,
			_ACSIServicesKind__DeleteDataSet,
			_ACSIServicesKind__GetDataSetDirectory,
			_ACSIServicesKind__SelectActiveSG,
			_ACSIServicesKind__SelectEditSG,
			_ACSIServicesKind__SetEditSGValue,
			_ACSIServicesKind__ConfirmEditSGValues,
			_ACSIServicesKind__GetEditSGValue,
			_ACSIServicesKind__GetSGCBValues,
			_ACSIServicesKind__Report,
			_ACSIServicesKind__GetBRCBValues,
			_ACSIServicesKind__SetBRCBValues,
			_ACSIServicesKind__GetURCBValues,
			_ACSIServicesKind__SetURCBValues,
			_ACSIServicesKind__GetLCBValues,
			_ACSIServicesKind__SetLCBValues,
			_ACSIServicesKind__QueryLogByTime,
			_ACSIServicesKind__QueryLogAfter,
			_ACSIServicesKind__GetLogStatusValues,
			_ACSIServicesKind__SendGOOSEMessage,
			_ACSIServicesKind__GetGoCBValues,
			_ACSIServicesKind__SetGoCBValues,
			_ACSIServicesKind__GetGoReference,
			_ACSIServicesKind__GetGOOSEElementNumber,
			_ACSIServicesKind__SendMSVMessage,
			_ACSIServicesKind__GetMSVCBValues,
			_ACSIServicesKind__SetMSVCBValues,
			_ACSIServicesKind__SendUSVMessage,
			_ACSIServicesKind__GetUSVCBValues,
			_ACSIServicesKind__SetUSVCBValues,
			_ACSIServicesKind__Select,
			_ACSIServicesKind__SelectWithValue,
			_ACSIServicesKind__Cancel,
			_ACSIServicesKind__Operate,
			_ACSIServicesKind__CommandTermination,
			_ACSIServicesKind__TimeActivatedOperate,
			_ACSIServicesKind__GetFile,
			_ACSIServicesKind__SetFile,
			_ACSIServicesKind__DeleteFile,
			_ACSIServicesKind__GetFileAttributeValues,
			_ACSIServicesKind__TimeSynchronization,
			_ACSIServicesKind__InternalChange,
			_ACSIServicesKind__GetLogicalNodeDirectory,
			_ACSIServicesKind__GetMsvReference,
			_ACSIServicesKind__GetMSVElementNumber,
			_ACSIServicesKind__GetUsvReference,
			_ACSIServicesKind__GetUSVElementNumber
		};

		public static final EcoreExecutorEnumerationLiteral _CBKind__RCB = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.CB_KIND.getEEnumLiteral("RCB"), Types._CBKind, 0);
		public static final EcoreExecutorEnumerationLiteral _CBKind__LCB = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.CB_KIND.getEEnumLiteral("LCB"), Types._CBKind, 1);
		public static final EcoreExecutorEnumerationLiteral _CBKind__GoCB = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.CB_KIND.getEEnumLiteral("GoCB"), Types._CBKind, 2);
		public static final EcoreExecutorEnumerationLiteral _CBKind__SVCB = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.CB_KIND.getEEnumLiteral("SVCB"), Types._CBKind, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CBKind = {
			_CBKind__RCB,
			_CBKind__LCB,
			_CBKind__GoCB,
			_CBKind__SVCB
		};

		public static final EcoreExecutorEnumerationLiteral _DefinedAttributeTypeKind__BASIC = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.getEEnumLiteral("BASIC"), Types._DefinedAttributeTypeKind, 0);
		public static final EcoreExecutorEnumerationLiteral _DefinedAttributeTypeKind__ENUMERATED = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.getEEnumLiteral("ENUMERATED"), Types._DefinedAttributeTypeKind, 1);
		public static final EcoreExecutorEnumerationLiteral _DefinedAttributeTypeKind__CONSTRUCTED = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.DEFINED_ATTRIBUTE_TYPE_KIND.getEEnumLiteral("CONSTRUCTED"), Types._DefinedAttributeTypeKind, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DefinedAttributeTypeKind = {
			_DefinedAttributeTypeKind__BASIC,
			_DefinedAttributeTypeKind__ENUMERATED,
			_DefinedAttributeTypeKind__CONSTRUCTED
		};

		public static final EcoreExecutorEnumerationLiteral _LicenseKind__Standard = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.LICENSE_KIND.getEEnumLiteral("Standard"), Types._LicenseKind, 0);
		public static final EcoreExecutorEnumerationLiteral _LicenseKind__Private = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.LICENSE_KIND.getEEnumLiteral("Private"), Types._LicenseKind, 1);
		public static final EcoreExecutorEnumerationLiteral _LicenseKind__None = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.LICENSE_KIND.getEEnumLiteral("None"), Types._LicenseKind, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LicenseKind = {
			_LicenseKind__Standard,
			_LicenseKind__Private,
			_LicenseKind__None
		};

		public static final EcoreExecutorEnumerationLiteral _PubStage__WD = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("WD"), Types._PubStage, 0);
		public static final EcoreExecutorEnumerationLiteral _PubStage__CD = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("CD"), Types._PubStage, 1);
		public static final EcoreExecutorEnumerationLiteral _PubStage__CDV = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("CDV"), Types._PubStage, 2);
		public static final EcoreExecutorEnumerationLiteral _PubStage__DTS = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("DTS"), Types._PubStage, 3);
		public static final EcoreExecutorEnumerationLiteral _PubStage__DTR = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("DTR"), Types._PubStage, 4);
		public static final EcoreExecutorEnumerationLiteral _PubStage__FDIS = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("FDIS"), Types._PubStage, 5);
		public static final EcoreExecutorEnumerationLiteral _PubStage__TS = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("TS"), Types._PubStage, 6);
		public static final EcoreExecutorEnumerationLiteral _PubStage__TR = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("TR"), Types._PubStage, 7);
		public static final EcoreExecutorEnumerationLiteral _PubStage__IS = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.PUB_STAGE.getEEnumLiteral("IS"), Types._PubStage, 8);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PubStage = {
			_PubStage__WD,
			_PubStage__CD,
			_PubStage__CDV,
			_PubStage__DTS,
			_PubStage__DTR,
			_PubStage__FDIS,
			_PubStage__TS,
			_PubStage__TR,
			_PubStage__IS
		};

		public static final EcoreExecutorEnumerationLiteral _UndefinedAttributeTypeKind__undefined = new EcoreExecutorEnumerationLiteral(NsdPackage.Literals.UNDEFINED_ATTRIBUTE_TYPE_KIND.getEEnumLiteral("undefined"), Types._UndefinedAttributeTypeKind, 0);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _UndefinedAttributeTypeKind = {
			_UndefinedAttributeTypeKind__undefined
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ACSIServicesKind.initLiterals(_ACSIServicesKind);
			Types._CBKind.initLiterals(_CBKind);
			Types._DefinedAttributeTypeKind.initLiterals(_DefinedAttributeTypeKind);
			Types._LicenseKind.initLiterals(_LicenseKind);
			Types._PubStage.initLiterals(_PubStage);
			Types._UndefinedAttributeTypeKind.initLiterals(_UndefinedAttributeTypeKind);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NsdTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new NsdTables();
	}

	private NsdTables() {
		super(NsdPackage.eNS_URI);
	}
}
