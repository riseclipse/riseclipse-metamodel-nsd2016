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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presence Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getTitleID <em>Title ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresenceConditionImpl extends MinimalEObjectImpl.Container implements PresenceCondition {
    /**
     * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected static final String ARGUMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected String argument = ARGUMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected static final String DESC_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected String descID = DESC_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTitleID() <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitleID()
     * @generated
     * @ordered
     */
    protected static final String TITLE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitleID() <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitleID()
     * @generated
     * @ordered
     */
    protected String titleID = TITLE_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresenceConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.PRESENCE_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getArgument() {
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setArgument( String newArgument ) {
        String oldArgument = argument;
        argument = newArgument;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.PRESENCE_CONDITION__ARGUMENT, oldArgument, argument ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescID() {
        return descID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescID( String newDescID ) {
        String oldDescID = descID;
        descID = newDescID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.PRESENCE_CONDITION__DESC_ID, oldDescID, descID ) );
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
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITION__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTitleID() {
        return titleID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitleID( String newTitleID ) {
        String oldTitleID = titleID;
        titleID = newTitleID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.PRESENCE_CONDITION__TITLE_ID, oldTitleID, titleID ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            return getArgument();
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            return getDescID();
        case NsdPackage.PRESENCE_CONDITION__NAME:
            return getName();
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            return getTitleID();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            setArgument( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            setTitleID( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            setArgument( ARGUMENT_EDEFAULT );
            return;
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            setDescID( DESC_ID_EDEFAULT );
            return;
        case NsdPackage.PRESENCE_CONDITION__NAME:
            setName( NAME_EDEFAULT );
            return;
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            setTitleID( TITLE_ID_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            return ARGUMENT_EDEFAULT == null ? argument != null : !ARGUMENT_EDEFAULT.equals( argument );
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            return DESC_ID_EDEFAULT == null ? descID != null : !DESC_ID_EDEFAULT.equals( descID );
        case NsdPackage.PRESENCE_CONDITION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            return TITLE_ID_EDEFAULT == null ? titleID != null : !TITLE_ID_EDEFAULT.equals( titleID );
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (argument: " );
        result.append( argument );
        result.append( ", descID: " );
        result.append( descID );
        result.append( ", name: " );
        result.append( name );
        result.append( ", titleID: " );
        result.append( titleID );
        result.append( ')' );
        return result.toString();
    }

} //PresenceConditionImpl
