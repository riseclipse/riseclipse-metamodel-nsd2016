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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ACSI Services Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage#getACSIServicesKind()
 * @model extendedMetaData="name='tACSIServicesKind'"
 * @generated
 */
public enum ACSIServicesKind implements Enumerator {
    /**
     * The '<em><b>Associate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSOCIATE_VALUE
     * @generated
     * @ordered
     */
    ASSOCIATE( 0, "Associate", "Associate" ),

    /**
     * The '<em><b>Abort</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ABORT_VALUE
     * @generated
     * @ordered
     */
    ABORT( 1, "Abort", "Abort" ),

    /**
     * The '<em><b>Release</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RELEASE_VALUE
     * @generated
     * @ordered
     */
    RELEASE( 2, "Release", "Release" ),

    /**
     * The '<em><b>Get Server Directory</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_SERVER_DIRECTORY_VALUE
     * @generated
     * @ordered
     */
    GET_SERVER_DIRECTORY( 3, "GetServerDirectory", "GetServerDirectory" ),

    /**
     * The '<em><b>Get Logical Device Directory</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_LOGICAL_DEVICE_DIRECTORY_VALUE
     * @generated
     * @ordered
     */
    GET_LOGICAL_DEVICE_DIRECTORY( 4, "GetLogicalDeviceDirectory", "GetLogicalDeviceDirectory" ),

    /**
     * The '<em><b>Get All Data Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_ALL_DATA_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_ALL_DATA_VALUES( 5, "GetAllDataValues", "GetAllDataValues" ),

    /**
     * The '<em><b>Get Data Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_DATA_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_DATA_VALUES( 6, "GetDataValues", "GetDataValues" ),

    /**
     * The '<em><b>Set Data Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_DATA_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_DATA_VALUES( 7, "SetDataValues", "SetDataValues" ),

    /**
     * The '<em><b>Get Data Directory</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_DATA_DIRECTORY_VALUE
     * @generated
     * @ordered
     */
    GET_DATA_DIRECTORY( 8, "GetDataDirectory", "GetDataDirectory" ),

    /**
     * The '<em><b>Get Data Definition</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_DATA_DEFINITION_VALUE
     * @generated
     * @ordered
     */
    GET_DATA_DEFINITION( 9, "GetDataDefinition", "GetDataDefinition" ),

    /**
     * The '<em><b>Get Data Set Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_DATA_SET_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_DATA_SET_VALUES( 10, "GetDataSetValues", "GetDataSetValues" ),

    /**
     * The '<em><b>Set Data Set Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_DATA_SET_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_DATA_SET_VALUES( 11, "SetDataSetValues", "SetDataSetValues" ),

    /**
     * The '<em><b>Create Data Set</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CREATE_DATA_SET_VALUE
     * @generated
     * @ordered
     */
    CREATE_DATA_SET( 12, "CreateDataSet", "CreateDataSet" ),

    /**
     * The '<em><b>Delete Data Set</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE_DATA_SET_VALUE
     * @generated
     * @ordered
     */
    DELETE_DATA_SET( 13, "DeleteDataSet", "DeleteDataSet" ),

    /**
     * The '<em><b>Get Data Set Directory</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_DATA_SET_DIRECTORY_VALUE
     * @generated
     * @ordered
     */
    GET_DATA_SET_DIRECTORY( 14, "GetDataSetDirectory", "GetDataSetDirectory" ),

    /**
     * The '<em><b>Select Active SG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SELECT_ACTIVE_SG_VALUE
     * @generated
     * @ordered
     */
    SELECT_ACTIVE_SG( 15, "SelectActiveSG", "SelectActiveSG" ),

    /**
     * The '<em><b>Select Edit SG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SELECT_EDIT_SG_VALUE
     * @generated
     * @ordered
     */
    SELECT_EDIT_SG( 16, "SelectEditSG", "SelectEditSG" ),

    /**
     * The '<em><b>Set Edit SG Value</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_EDIT_SG_VALUE_VALUE
     * @generated
     * @ordered
     */
    SET_EDIT_SG_VALUE( 17, "SetEditSGValue", "SetEditSGValue" ),

    /**
     * The '<em><b>Confirm Edit SG Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONFIRM_EDIT_SG_VALUES_VALUE
     * @generated
     * @ordered
     */
    CONFIRM_EDIT_SG_VALUES( 18, "ConfirmEditSGValues", "ConfirmEditSGValues" ),

    /**
     * The '<em><b>Get Edit SG Value</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_EDIT_SG_VALUE_VALUE
     * @generated
     * @ordered
     */
    GET_EDIT_SG_VALUE( 19, "GetEditSGValue", "GetEditSGValue" ),

    /**
     * The '<em><b>Get SGCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_SGCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_SGCB_VALUES( 20, "GetSGCBValues", "GetSGCBValues" ),

    /**
     * The '<em><b>Report</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REPORT_VALUE
     * @generated
     * @ordered
     */
    REPORT( 21, "Report", "Report" ),

    /**
     * The '<em><b>Get BRCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_BRCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_BRCB_VALUES( 22, "GetBRCBValues", "GetBRCBValues" ),

    /**
     * The '<em><b>Set BRCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_BRCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_BRCB_VALUES( 23, "SetBRCBValues", "SetBRCBValues" ),

    /**
     * The '<em><b>Get URCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_URCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_URCB_VALUES( 24, "GetURCBValues", "GetURCBValues" ),

    /**
     * The '<em><b>Set URCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_URCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_URCB_VALUES( 25, "SetURCBValues", "SetURCBValues" ),

    /**
     * The '<em><b>Get LCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_LCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_LCB_VALUES( 26, "GetLCBValues", "GetLCBValues" ),

    /**
     * The '<em><b>Set LCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_LCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_LCB_VALUES( 27, "SetLCBValues", "SetLCBValues" ),

    /**
     * The '<em><b>Query Log By Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUERY_LOG_BY_TIME_VALUE
     * @generated
     * @ordered
     */
    QUERY_LOG_BY_TIME( 28, "QueryLogByTime", "QueryLogByTime" ),

    /**
     * The '<em><b>Query Log After</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUERY_LOG_AFTER_VALUE
     * @generated
     * @ordered
     */
    QUERY_LOG_AFTER( 29, "QueryLogAfter", "QueryLogAfter" ),

    /**
     * The '<em><b>Get Log Status Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_LOG_STATUS_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_LOG_STATUS_VALUES( 30, "GetLogStatusValues", "GetLogStatusValues" ),

    /**
     * The '<em><b>Send GOOSE Message</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEND_GOOSE_MESSAGE_VALUE
     * @generated
     * @ordered
     */
    SEND_GOOSE_MESSAGE( 31, "SendGOOSEMessage", "SendGOOSEMessage" ),

    /**
     * The '<em><b>Get Go CB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_GO_CB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_GO_CB_VALUES( 32, "GetGoCBValues", "GetGoCBValues" ),

    /**
     * The '<em><b>Set Go CB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_GO_CB_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_GO_CB_VALUES( 33, "SetGoCBValues", "SetGoCBValues" ),

    /**
     * The '<em><b>Get Go Reference</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_GO_REFERENCE_VALUE
     * @generated
     * @ordered
     */
    GET_GO_REFERENCE( 34, "GetGoReference", "GetGoReference" ),

    /**
     * The '<em><b>Get GOOSE Element Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_GOOSE_ELEMENT_NUMBER_VALUE
     * @generated
     * @ordered
     */
    GET_GOOSE_ELEMENT_NUMBER( 35, "GetGOOSEElementNumber", "GetGOOSEElementNumber" ),

    /**
     * The '<em><b>Send MSV Message</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEND_MSV_MESSAGE_VALUE
     * @generated
     * @ordered
     */
    SEND_MSV_MESSAGE( 36, "SendMSVMessage", "SendMSVMessage" ),

    /**
     * The '<em><b>Get MSVCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_MSVCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_MSVCB_VALUES( 37, "GetMSVCBValues", "GetMSVCBValues" ),

    /**
     * The '<em><b>Set MSVCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_MSVCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_MSVCB_VALUES( 38, "SetMSVCBValues", "SetMSVCBValues" ),

    /**
     * The '<em><b>Send USV Message</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEND_USV_MESSAGE_VALUE
     * @generated
     * @ordered
     */
    SEND_USV_MESSAGE( 39, "SendUSVMessage", "SendUSVMessage" ),

    /**
     * The '<em><b>Get USVCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_USVCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_USVCB_VALUES( 40, "GetUSVCBValues", "GetUSVCBValues" ),

    /**
     * The '<em><b>Set USVCB Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_USVCB_VALUES_VALUE
     * @generated
     * @ordered
     */
    SET_USVCB_VALUES( 41, "SetUSVCBValues", "SetUSVCBValues" ),

    /**
     * The '<em><b>Select</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SELECT_VALUE
     * @generated
     * @ordered
     */
    SELECT( 42, "Select", "Select" ),

    /**
     * The '<em><b>Select With Value</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SELECT_WITH_VALUE_VALUE
     * @generated
     * @ordered
     */
    SELECT_WITH_VALUE( 43, "SelectWithValue", "SelectWithValue" ),

    /**
     * The '<em><b>Cancel</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CANCEL_VALUE
     * @generated
     * @ordered
     */
    CANCEL( 44, "Cancel", "Cancel" ),

    /**
     * The '<em><b>Operate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPERATE_VALUE
     * @generated
     * @ordered
     */
    OPERATE( 45, "Operate", "Operate" ),

    /**
     * The '<em><b>Command Termination</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMMAND_TERMINATION_VALUE
     * @generated
     * @ordered
     */
    COMMAND_TERMINATION( 46, "CommandTermination", "CommandTermination" ),

    /**
     * The '<em><b>Time Activated Operate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_ACTIVATED_OPERATE_VALUE
     * @generated
     * @ordered
     */
    TIME_ACTIVATED_OPERATE( 47, "TimeActivatedOperate", "TimeActivatedOperate" ),

    /**
     * The '<em><b>Get File</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_FILE_VALUE
     * @generated
     * @ordered
     */
    GET_FILE( 48, "GetFile", "GetFile" ),

    /**
     * The '<em><b>Set File</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_FILE_VALUE
     * @generated
     * @ordered
     */
    SET_FILE( 49, "SetFile", "SetFile" ),

    /**
     * The '<em><b>Delete File</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE_FILE_VALUE
     * @generated
     * @ordered
     */
    DELETE_FILE( 50, "DeleteFile", "DeleteFile" ),

    /**
     * The '<em><b>Get File Attribute Values</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_FILE_ATTRIBUTE_VALUES_VALUE
     * @generated
     * @ordered
     */
    GET_FILE_ATTRIBUTE_VALUES( 51, "GetFileAttributeValues", "GetFileAttributeValues" ),

    /**
     * The '<em><b>Time Synchronization</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_SYNCHRONIZATION_VALUE
     * @generated
     * @ordered
     */
    TIME_SYNCHRONIZATION( 52, "TimeSynchronization", "TimeSynchronization" ),

    /**
     * The '<em><b>Internal Change</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNAL_CHANGE_VALUE
     * @generated
     * @ordered
     */
    INTERNAL_CHANGE( 53, "InternalChange", "InternalChange" ),

    /**
     * The '<em><b>Get Logical Node Directory</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_LOGICAL_NODE_DIRECTORY_VALUE
     * @generated
     * @ordered
     */
    GET_LOGICAL_NODE_DIRECTORY( 54, "GetLogicalNodeDirectory", "GetLogicalNodeDirectory" ),

    /**
     * The '<em><b>Get Msv Reference</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_MSV_REFERENCE_VALUE
     * @generated
     * @ordered
     */
    GET_MSV_REFERENCE( 55, "GetMsvReference", "GetMsvReference" ),

    /**
     * The '<em><b>Get MSV Element Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_MSV_ELEMENT_NUMBER_VALUE
     * @generated
     * @ordered
     */
    GET_MSV_ELEMENT_NUMBER( 56, "GetMSVElementNumber", "GetMSVElementNumber" ),

    /**
     * The '<em><b>Get Usv Reference</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_USV_REFERENCE_VALUE
     * @generated
     * @ordered
     */
    GET_USV_REFERENCE( 57, "GetUsvReference", "GetUsvReference" ),

    /**
     * The '<em><b>Get USV Element Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GET_USV_ELEMENT_NUMBER_VALUE
     * @generated
     * @ordered
     */
    GET_USV_ELEMENT_NUMBER( 58, "GetUSVElementNumber", "GetUSVElementNumber" );

    /**
     * The '<em><b>Associate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Associate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSOCIATE
     * @model name="Associate"
     * @generated
     * @ordered
     */
    public static final int ASSOCIATE_VALUE = 0;

    /**
     * The '<em><b>Abort</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Abort</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ABORT
     * @model name="Abort"
     * @generated
     * @ordered
     */
    public static final int ABORT_VALUE = 1;

    /**
     * The '<em><b>Release</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Release</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RELEASE
     * @model name="Release"
     * @generated
     * @ordered
     */
    public static final int RELEASE_VALUE = 2;

    /**
     * The '<em><b>Get Server Directory</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Server Directory</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_SERVER_DIRECTORY
     * @model name="GetServerDirectory"
     * @generated
     * @ordered
     */
    public static final int GET_SERVER_DIRECTORY_VALUE = 3;

    /**
     * The '<em><b>Get Logical Device Directory</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Logical Device Directory</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_LOGICAL_DEVICE_DIRECTORY
     * @model name="GetLogicalDeviceDirectory"
     * @generated
     * @ordered
     */
    public static final int GET_LOGICAL_DEVICE_DIRECTORY_VALUE = 4;

    /**
     * The '<em><b>Get All Data Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get All Data Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_ALL_DATA_VALUES
     * @model name="GetAllDataValues"
     * @generated
     * @ordered
     */
    public static final int GET_ALL_DATA_VALUES_VALUE = 5;

    /**
     * The '<em><b>Get Data Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Data Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_DATA_VALUES
     * @model name="GetDataValues"
     * @generated
     * @ordered
     */
    public static final int GET_DATA_VALUES_VALUE = 6;

    /**
     * The '<em><b>Set Data Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set Data Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_DATA_VALUES
     * @model name="SetDataValues"
     * @generated
     * @ordered
     */
    public static final int SET_DATA_VALUES_VALUE = 7;

    /**
     * The '<em><b>Get Data Directory</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Data Directory</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_DATA_DIRECTORY
     * @model name="GetDataDirectory"
     * @generated
     * @ordered
     */
    public static final int GET_DATA_DIRECTORY_VALUE = 8;

    /**
     * The '<em><b>Get Data Definition</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Data Definition</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_DATA_DEFINITION
     * @model name="GetDataDefinition"
     * @generated
     * @ordered
     */
    public static final int GET_DATA_DEFINITION_VALUE = 9;

    /**
     * The '<em><b>Get Data Set Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Data Set Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_DATA_SET_VALUES
     * @model name="GetDataSetValues"
     * @generated
     * @ordered
     */
    public static final int GET_DATA_SET_VALUES_VALUE = 10;

    /**
     * The '<em><b>Set Data Set Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set Data Set Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_DATA_SET_VALUES
     * @model name="SetDataSetValues"
     * @generated
     * @ordered
     */
    public static final int SET_DATA_SET_VALUES_VALUE = 11;

    /**
     * The '<em><b>Create Data Set</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Create Data Set</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CREATE_DATA_SET
     * @model name="CreateDataSet"
     * @generated
     * @ordered
     */
    public static final int CREATE_DATA_SET_VALUE = 12;

    /**
     * The '<em><b>Delete Data Set</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Delete Data Set</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETE_DATA_SET
     * @model name="DeleteDataSet"
     * @generated
     * @ordered
     */
    public static final int DELETE_DATA_SET_VALUE = 13;

    /**
     * The '<em><b>Get Data Set Directory</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Data Set Directory</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_DATA_SET_DIRECTORY
     * @model name="GetDataSetDirectory"
     * @generated
     * @ordered
     */
    public static final int GET_DATA_SET_DIRECTORY_VALUE = 14;

    /**
     * The '<em><b>Select Active SG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Select Active SG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SELECT_ACTIVE_SG
     * @model name="SelectActiveSG"
     * @generated
     * @ordered
     */
    public static final int SELECT_ACTIVE_SG_VALUE = 15;

    /**
     * The '<em><b>Select Edit SG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Select Edit SG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SELECT_EDIT_SG
     * @model name="SelectEditSG"
     * @generated
     * @ordered
     */
    public static final int SELECT_EDIT_SG_VALUE = 16;

    /**
     * The '<em><b>Set Edit SG Value</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set Edit SG Value</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_EDIT_SG_VALUE
     * @model name="SetEditSGValue"
     * @generated
     * @ordered
     */
    public static final int SET_EDIT_SG_VALUE_VALUE = 17;

    /**
     * The '<em><b>Confirm Edit SG Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Confirm Edit SG Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONFIRM_EDIT_SG_VALUES
     * @model name="ConfirmEditSGValues"
     * @generated
     * @ordered
     */
    public static final int CONFIRM_EDIT_SG_VALUES_VALUE = 18;

    /**
     * The '<em><b>Get Edit SG Value</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Edit SG Value</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_EDIT_SG_VALUE
     * @model name="GetEditSGValue"
     * @generated
     * @ordered
     */
    public static final int GET_EDIT_SG_VALUE_VALUE = 19;

    /**
     * The '<em><b>Get SGCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get SGCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_SGCB_VALUES
     * @model name="GetSGCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_SGCB_VALUES_VALUE = 20;

    /**
     * The '<em><b>Report</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Report</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REPORT
     * @model name="Report"
     * @generated
     * @ordered
     */
    public static final int REPORT_VALUE = 21;

    /**
     * The '<em><b>Get BRCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get BRCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_BRCB_VALUES
     * @model name="GetBRCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_BRCB_VALUES_VALUE = 22;

    /**
     * The '<em><b>Set BRCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set BRCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_BRCB_VALUES
     * @model name="SetBRCBValues"
     * @generated
     * @ordered
     */
    public static final int SET_BRCB_VALUES_VALUE = 23;

    /**
     * The '<em><b>Get URCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get URCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_URCB_VALUES
     * @model name="GetURCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_URCB_VALUES_VALUE = 24;

    /**
     * The '<em><b>Set URCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set URCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_URCB_VALUES
     * @model name="SetURCBValues"
     * @generated
     * @ordered
     */
    public static final int SET_URCB_VALUES_VALUE = 25;

    /**
     * The '<em><b>Get LCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get LCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_LCB_VALUES
     * @model name="GetLCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_LCB_VALUES_VALUE = 26;

    /**
     * The '<em><b>Set LCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set LCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_LCB_VALUES
     * @model name="SetLCBValues"
     * @generated
     * @ordered
     */
    public static final int SET_LCB_VALUES_VALUE = 27;

    /**
     * The '<em><b>Query Log By Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Query Log By Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUERY_LOG_BY_TIME
     * @model name="QueryLogByTime"
     * @generated
     * @ordered
     */
    public static final int QUERY_LOG_BY_TIME_VALUE = 28;

    /**
     * The '<em><b>Query Log After</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Query Log After</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUERY_LOG_AFTER
     * @model name="QueryLogAfter"
     * @generated
     * @ordered
     */
    public static final int QUERY_LOG_AFTER_VALUE = 29;

    /**
     * The '<em><b>Get Log Status Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Log Status Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_LOG_STATUS_VALUES
     * @model name="GetLogStatusValues"
     * @generated
     * @ordered
     */
    public static final int GET_LOG_STATUS_VALUES_VALUE = 30;

    /**
     * The '<em><b>Send GOOSE Message</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Send GOOSE Message</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEND_GOOSE_MESSAGE
     * @model name="SendGOOSEMessage"
     * @generated
     * @ordered
     */
    public static final int SEND_GOOSE_MESSAGE_VALUE = 31;

    /**
     * The '<em><b>Get Go CB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Go CB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_GO_CB_VALUES
     * @model name="GetGoCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_GO_CB_VALUES_VALUE = 32;

    /**
     * The '<em><b>Set Go CB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set Go CB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_GO_CB_VALUES
     * @model name="SetGoCBValues"
     * @generated
     * @ordered
     */
    public static final int SET_GO_CB_VALUES_VALUE = 33;

    /**
     * The '<em><b>Get Go Reference</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Go Reference</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_GO_REFERENCE
     * @model name="GetGoReference"
     * @generated
     * @ordered
     */
    public static final int GET_GO_REFERENCE_VALUE = 34;

    /**
     * The '<em><b>Get GOOSE Element Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get GOOSE Element Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_GOOSE_ELEMENT_NUMBER
     * @model name="GetGOOSEElementNumber"
     * @generated
     * @ordered
     */
    public static final int GET_GOOSE_ELEMENT_NUMBER_VALUE = 35;

    /**
     * The '<em><b>Send MSV Message</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Send MSV Message</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEND_MSV_MESSAGE
     * @model name="SendMSVMessage"
     * @generated
     * @ordered
     */
    public static final int SEND_MSV_MESSAGE_VALUE = 36;

    /**
     * The '<em><b>Get MSVCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get MSVCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_MSVCB_VALUES
     * @model name="GetMSVCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_MSVCB_VALUES_VALUE = 37;

    /**
     * The '<em><b>Set MSVCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set MSVCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_MSVCB_VALUES
     * @model name="SetMSVCBValues"
     * @generated
     * @ordered
     */
    public static final int SET_MSVCB_VALUES_VALUE = 38;

    /**
     * The '<em><b>Send USV Message</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Send USV Message</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEND_USV_MESSAGE
     * @model name="SendUSVMessage"
     * @generated
     * @ordered
     */
    public static final int SEND_USV_MESSAGE_VALUE = 39;

    /**
     * The '<em><b>Get USVCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get USVCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_USVCB_VALUES
     * @model name="GetUSVCBValues"
     * @generated
     * @ordered
     */
    public static final int GET_USVCB_VALUES_VALUE = 40;

    /**
     * The '<em><b>Set USVCB Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set USVCB Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_USVCB_VALUES
     * @model name="SetUSVCBValues"
     * @generated
     * @ordered
     */
    public static final int SET_USVCB_VALUES_VALUE = 41;

    /**
     * The '<em><b>Select</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Select</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SELECT
     * @model name="Select"
     * @generated
     * @ordered
     */
    public static final int SELECT_VALUE = 42;

    /**
     * The '<em><b>Select With Value</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Select With Value</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SELECT_WITH_VALUE
     * @model name="SelectWithValue"
     * @generated
     * @ordered
     */
    public static final int SELECT_WITH_VALUE_VALUE = 43;

    /**
     * The '<em><b>Cancel</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cancel</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CANCEL
     * @model name="Cancel"
     * @generated
     * @ordered
     */
    public static final int CANCEL_VALUE = 44;

    /**
     * The '<em><b>Operate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Operate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPERATE
     * @model name="Operate"
     * @generated
     * @ordered
     */
    public static final int OPERATE_VALUE = 45;

    /**
     * The '<em><b>Command Termination</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Command Termination</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMMAND_TERMINATION
     * @model name="CommandTermination"
     * @generated
     * @ordered
     */
    public static final int COMMAND_TERMINATION_VALUE = 46;

    /**
     * The '<em><b>Time Activated Operate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time Activated Operate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME_ACTIVATED_OPERATE
     * @model name="TimeActivatedOperate"
     * @generated
     * @ordered
     */
    public static final int TIME_ACTIVATED_OPERATE_VALUE = 47;

    /**
     * The '<em><b>Get File</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get File</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_FILE
     * @model name="GetFile"
     * @generated
     * @ordered
     */
    public static final int GET_FILE_VALUE = 48;

    /**
     * The '<em><b>Set File</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Set File</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SET_FILE
     * @model name="SetFile"
     * @generated
     * @ordered
     */
    public static final int SET_FILE_VALUE = 49;

    /**
     * The '<em><b>Delete File</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Delete File</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETE_FILE
     * @model name="DeleteFile"
     * @generated
     * @ordered
     */
    public static final int DELETE_FILE_VALUE = 50;

    /**
     * The '<em><b>Get File Attribute Values</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get File Attribute Values</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_FILE_ATTRIBUTE_VALUES
     * @model name="GetFileAttributeValues"
     * @generated
     * @ordered
     */
    public static final int GET_FILE_ATTRIBUTE_VALUES_VALUE = 51;

    /**
     * The '<em><b>Time Synchronization</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time Synchronization</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME_SYNCHRONIZATION
     * @model name="TimeSynchronization"
     * @generated
     * @ordered
     */
    public static final int TIME_SYNCHRONIZATION_VALUE = 52;

    /**
     * The '<em><b>Internal Change</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Internal Change</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERNAL_CHANGE
     * @model name="InternalChange"
     * @generated
     * @ordered
     */
    public static final int INTERNAL_CHANGE_VALUE = 53;

    /**
     * The '<em><b>Get Logical Node Directory</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Logical Node Directory</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_LOGICAL_NODE_DIRECTORY
     * @model name="GetLogicalNodeDirectory"
     * @generated
     * @ordered
     */
    public static final int GET_LOGICAL_NODE_DIRECTORY_VALUE = 54;

    /**
     * The '<em><b>Get Msv Reference</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Msv Reference</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_MSV_REFERENCE
     * @model name="GetMsvReference"
     * @generated
     * @ordered
     */
    public static final int GET_MSV_REFERENCE_VALUE = 55;

    /**
     * The '<em><b>Get MSV Element Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get MSV Element Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_MSV_ELEMENT_NUMBER
     * @model name="GetMSVElementNumber"
     * @generated
     * @ordered
     */
    public static final int GET_MSV_ELEMENT_NUMBER_VALUE = 56;

    /**
     * The '<em><b>Get Usv Reference</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get Usv Reference</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_USV_REFERENCE
     * @model name="GetUsvReference"
     * @generated
     * @ordered
     */
    public static final int GET_USV_REFERENCE_VALUE = 57;

    /**
     * The '<em><b>Get USV Element Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Get USV Element Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GET_USV_ELEMENT_NUMBER
     * @model name="GetUSVElementNumber"
     * @generated
     * @ordered
     */
    public static final int GET_USV_ELEMENT_NUMBER_VALUE = 58;

    /**
     * An array of all the '<em><b>ACSI Services Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ACSIServicesKind[] VALUES_ARRAY = new ACSIServicesKind[] {
            ASSOCIATE,
            ABORT,
            RELEASE,
            GET_SERVER_DIRECTORY,
            GET_LOGICAL_DEVICE_DIRECTORY,
            GET_ALL_DATA_VALUES,
            GET_DATA_VALUES,
            SET_DATA_VALUES,
            GET_DATA_DIRECTORY,
            GET_DATA_DEFINITION,
            GET_DATA_SET_VALUES,
            SET_DATA_SET_VALUES,
            CREATE_DATA_SET,
            DELETE_DATA_SET,
            GET_DATA_SET_DIRECTORY,
            SELECT_ACTIVE_SG,
            SELECT_EDIT_SG,
            SET_EDIT_SG_VALUE,
            CONFIRM_EDIT_SG_VALUES,
            GET_EDIT_SG_VALUE,
            GET_SGCB_VALUES,
            REPORT,
            GET_BRCB_VALUES,
            SET_BRCB_VALUES,
            GET_URCB_VALUES,
            SET_URCB_VALUES,
            GET_LCB_VALUES,
            SET_LCB_VALUES,
            QUERY_LOG_BY_TIME,
            QUERY_LOG_AFTER,
            GET_LOG_STATUS_VALUES,
            SEND_GOOSE_MESSAGE,
            GET_GO_CB_VALUES,
            SET_GO_CB_VALUES,
            GET_GO_REFERENCE,
            GET_GOOSE_ELEMENT_NUMBER,
            SEND_MSV_MESSAGE,
            GET_MSVCB_VALUES,
            SET_MSVCB_VALUES,
            SEND_USV_MESSAGE,
            GET_USVCB_VALUES,
            SET_USVCB_VALUES,
            SELECT,
            SELECT_WITH_VALUE,
            CANCEL,
            OPERATE,
            COMMAND_TERMINATION,
            TIME_ACTIVATED_OPERATE,
            GET_FILE,
            SET_FILE,
            DELETE_FILE,
            GET_FILE_ATTRIBUTE_VALUES,
            TIME_SYNCHRONIZATION,
            INTERNAL_CHANGE,
            GET_LOGICAL_NODE_DIRECTORY,
            GET_MSV_REFERENCE,
            GET_MSV_ELEMENT_NUMBER,
            GET_USV_REFERENCE,
            GET_USV_ELEMENT_NUMBER,
    };

    /**
     * A public read-only list of all the '<em><b>ACSI Services Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ACSIServicesKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>ACSI Services Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ACSIServicesKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ACSIServicesKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ACSI Services Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ACSIServicesKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ACSIServicesKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ACSI Services Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ACSIServicesKind get( int value ) {
        switch( value ) {
        case ASSOCIATE_VALUE:
            return ASSOCIATE;
        case ABORT_VALUE:
            return ABORT;
        case RELEASE_VALUE:
            return RELEASE;
        case GET_SERVER_DIRECTORY_VALUE:
            return GET_SERVER_DIRECTORY;
        case GET_LOGICAL_DEVICE_DIRECTORY_VALUE:
            return GET_LOGICAL_DEVICE_DIRECTORY;
        case GET_ALL_DATA_VALUES_VALUE:
            return GET_ALL_DATA_VALUES;
        case GET_DATA_VALUES_VALUE:
            return GET_DATA_VALUES;
        case SET_DATA_VALUES_VALUE:
            return SET_DATA_VALUES;
        case GET_DATA_DIRECTORY_VALUE:
            return GET_DATA_DIRECTORY;
        case GET_DATA_DEFINITION_VALUE:
            return GET_DATA_DEFINITION;
        case GET_DATA_SET_VALUES_VALUE:
            return GET_DATA_SET_VALUES;
        case SET_DATA_SET_VALUES_VALUE:
            return SET_DATA_SET_VALUES;
        case CREATE_DATA_SET_VALUE:
            return CREATE_DATA_SET;
        case DELETE_DATA_SET_VALUE:
            return DELETE_DATA_SET;
        case GET_DATA_SET_DIRECTORY_VALUE:
            return GET_DATA_SET_DIRECTORY;
        case SELECT_ACTIVE_SG_VALUE:
            return SELECT_ACTIVE_SG;
        case SELECT_EDIT_SG_VALUE:
            return SELECT_EDIT_SG;
        case SET_EDIT_SG_VALUE_VALUE:
            return SET_EDIT_SG_VALUE;
        case CONFIRM_EDIT_SG_VALUES_VALUE:
            return CONFIRM_EDIT_SG_VALUES;
        case GET_EDIT_SG_VALUE_VALUE:
            return GET_EDIT_SG_VALUE;
        case GET_SGCB_VALUES_VALUE:
            return GET_SGCB_VALUES;
        case REPORT_VALUE:
            return REPORT;
        case GET_BRCB_VALUES_VALUE:
            return GET_BRCB_VALUES;
        case SET_BRCB_VALUES_VALUE:
            return SET_BRCB_VALUES;
        case GET_URCB_VALUES_VALUE:
            return GET_URCB_VALUES;
        case SET_URCB_VALUES_VALUE:
            return SET_URCB_VALUES;
        case GET_LCB_VALUES_VALUE:
            return GET_LCB_VALUES;
        case SET_LCB_VALUES_VALUE:
            return SET_LCB_VALUES;
        case QUERY_LOG_BY_TIME_VALUE:
            return QUERY_LOG_BY_TIME;
        case QUERY_LOG_AFTER_VALUE:
            return QUERY_LOG_AFTER;
        case GET_LOG_STATUS_VALUES_VALUE:
            return GET_LOG_STATUS_VALUES;
        case SEND_GOOSE_MESSAGE_VALUE:
            return SEND_GOOSE_MESSAGE;
        case GET_GO_CB_VALUES_VALUE:
            return GET_GO_CB_VALUES;
        case SET_GO_CB_VALUES_VALUE:
            return SET_GO_CB_VALUES;
        case GET_GO_REFERENCE_VALUE:
            return GET_GO_REFERENCE;
        case GET_GOOSE_ELEMENT_NUMBER_VALUE:
            return GET_GOOSE_ELEMENT_NUMBER;
        case SEND_MSV_MESSAGE_VALUE:
            return SEND_MSV_MESSAGE;
        case GET_MSVCB_VALUES_VALUE:
            return GET_MSVCB_VALUES;
        case SET_MSVCB_VALUES_VALUE:
            return SET_MSVCB_VALUES;
        case SEND_USV_MESSAGE_VALUE:
            return SEND_USV_MESSAGE;
        case GET_USVCB_VALUES_VALUE:
            return GET_USVCB_VALUES;
        case SET_USVCB_VALUES_VALUE:
            return SET_USVCB_VALUES;
        case SELECT_VALUE:
            return SELECT;
        case SELECT_WITH_VALUE_VALUE:
            return SELECT_WITH_VALUE;
        case CANCEL_VALUE:
            return CANCEL;
        case OPERATE_VALUE:
            return OPERATE;
        case COMMAND_TERMINATION_VALUE:
            return COMMAND_TERMINATION;
        case TIME_ACTIVATED_OPERATE_VALUE:
            return TIME_ACTIVATED_OPERATE;
        case GET_FILE_VALUE:
            return GET_FILE;
        case SET_FILE_VALUE:
            return SET_FILE;
        case DELETE_FILE_VALUE:
            return DELETE_FILE;
        case GET_FILE_ATTRIBUTE_VALUES_VALUE:
            return GET_FILE_ATTRIBUTE_VALUES;
        case TIME_SYNCHRONIZATION_VALUE:
            return TIME_SYNCHRONIZATION;
        case INTERNAL_CHANGE_VALUE:
            return INTERNAL_CHANGE;
        case GET_LOGICAL_NODE_DIRECTORY_VALUE:
            return GET_LOGICAL_NODE_DIRECTORY;
        case GET_MSV_REFERENCE_VALUE:
            return GET_MSV_REFERENCE;
        case GET_MSV_ELEMENT_NUMBER_VALUE:
            return GET_MSV_ELEMENT_NUMBER;
        case GET_USV_REFERENCE_VALUE:
            return GET_USV_REFERENCE;
        case GET_USV_ELEMENT_NUMBER_VALUE:
            return GET_USV_ELEMENT_NUMBER;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private ACSIServicesKind( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //ACSIServicesKind
