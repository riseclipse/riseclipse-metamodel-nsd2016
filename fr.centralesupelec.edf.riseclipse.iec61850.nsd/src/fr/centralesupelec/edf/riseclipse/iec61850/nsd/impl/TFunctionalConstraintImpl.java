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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunctional Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl#getApplicableServices <em>Applicable Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintImpl#getTitleID <em>Title ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionalConstraintImpl extends MinimalEObjectImpl.Container implements TFunctionalConstraint {
    /**
     * The cached value of the '{@link #getApplicableServices() <em>Applicable Services</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicableServices()
     * @generated
     * @ordered
     */
    protected TApplicableServices applicableServices;

    /**
     * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected static final String ABBREVIATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected String abbreviation = ABBREVIATION_EDEFAULT;

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
    protected TFunctionalConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TFUNCTIONAL_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TApplicableServices getApplicableServices() {
        return applicableServices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicableServices( TApplicableServices newApplicableServices,
            NotificationChain msgs ) {
        TApplicableServices oldApplicableServices = applicableServices;
        applicableServices = newApplicableServices;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, oldApplicableServices,
                    newApplicableServices );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicableServices( TApplicableServices newApplicableServices ) {
        if( newApplicableServices != applicableServices ) {
            NotificationChain msgs = null;
            if( applicableServices != null ) msgs = ( ( InternalEObject ) applicableServices ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, null, msgs );
            if( newApplicableServices != null ) msgs = ( ( InternalEObject ) newApplicableServices ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, null, msgs );
            msgs = basicSetApplicableServices( newApplicableServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES,
                        newApplicableServices, newApplicableServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAbbreviation( String newAbbreviation ) {
        String oldAbbreviation = abbreviation;
        abbreviation = newAbbreviation;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TFUNCTIONAL_CONSTRAINT__ABBREVIATION, oldAbbreviation, abbreviation ) );
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
                NsdPackage.TFUNCTIONAL_CONSTRAINT__DESC_ID, oldDescID, descID ) );
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
                NsdPackage.TFUNCTIONAL_CONSTRAINT__TITLE_ID, oldTitleID, titleID ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            return basicSetApplicableServices( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            return getApplicableServices();
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__ABBREVIATION:
            return getAbbreviation();
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__DESC_ID:
            return getDescID();
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__TITLE_ID:
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            setApplicableServices( ( TApplicableServices ) newValue );
            return;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__ABBREVIATION:
            setAbbreviation( ( String ) newValue );
            return;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__TITLE_ID:
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            setApplicableServices( ( TApplicableServices ) null );
            return;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__ABBREVIATION:
            setAbbreviation( ABBREVIATION_EDEFAULT );
            return;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__DESC_ID:
            setDescID( DESC_ID_EDEFAULT );
            return;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__TITLE_ID:
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES:
            return applicableServices != null;
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__ABBREVIATION:
            return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals( abbreviation );
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__DESC_ID:
            return DESC_ID_EDEFAULT == null ? descID != null : !DESC_ID_EDEFAULT.equals( descID );
        case NsdPackage.TFUNCTIONAL_CONSTRAINT__TITLE_ID:
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
        result.append( " (abbreviation: " );
        result.append( abbreviation );
        result.append( ", descID: " );
        result.append( descID );
        result.append( ", titleID: " );
        result.append( titleID );
        result.append( ')' );
        return result.toString();
    }

} //TFunctionalConstraintImpl
