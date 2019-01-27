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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLicense;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNotice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCopyright Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightNoticeImpl#getNotice <em>Notice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TCopyrightNoticeImpl#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCopyrightNoticeImpl extends MinimalEObjectImpl.Container implements TCopyrightNotice {
    /**
     * The cached value of the '{@link #getNotice() <em>Notice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotice()
     * @generated
     * @ordered
     */
    protected TNotice notice;

    /**
     * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLicense()
     * @generated
     * @ordered
     */
    protected TLicense license;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TCopyrightNoticeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TCOPYRIGHT_NOTICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TNotice getNotice() {
        return notice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNotice( TNotice newNotice, NotificationChain msgs ) {
        TNotice oldNotice = notice;
        notice = newNotice;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TCOPYRIGHT_NOTICE__NOTICE, oldNotice, newNotice );
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
    public void setNotice( TNotice newNotice ) {
        if( newNotice != notice ) {
            NotificationChain msgs = null;
            if( notice != null ) msgs = ( ( InternalEObject ) notice ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TCOPYRIGHT_NOTICE__NOTICE, null, msgs );
            if( newNotice != null ) msgs = ( ( InternalEObject ) newNotice ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TCOPYRIGHT_NOTICE__NOTICE, null, msgs );
            msgs = basicSetNotice( newNotice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TCOPYRIGHT_NOTICE__NOTICE, newNotice, newNotice ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TLicense getLicense() {
        return license;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLicense( TLicense newLicense, NotificationChain msgs ) {
        TLicense oldLicense = license;
        license = newLicense;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TCOPYRIGHT_NOTICE__LICENSE, oldLicense, newLicense );
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
    public void setLicense( TLicense newLicense ) {
        if( newLicense != license ) {
            NotificationChain msgs = null;
            if( license != null ) msgs = ( ( InternalEObject ) license ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TCOPYRIGHT_NOTICE__LICENSE, null, msgs );
            if( newLicense != null ) msgs = ( ( InternalEObject ) newLicense ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TCOPYRIGHT_NOTICE__LICENSE, null, msgs );
            msgs = basicSetLicense( newLicense, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TCOPYRIGHT_NOTICE__LICENSE, newLicense, newLicense ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TCOPYRIGHT_NOTICE__NOTICE:
            return basicSetNotice( null, msgs );
        case NsdPackage.TCOPYRIGHT_NOTICE__LICENSE:
            return basicSetLicense( null, msgs );
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
        case NsdPackage.TCOPYRIGHT_NOTICE__NOTICE:
            return getNotice();
        case NsdPackage.TCOPYRIGHT_NOTICE__LICENSE:
            return getLicense();
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
        case NsdPackage.TCOPYRIGHT_NOTICE__NOTICE:
            setNotice( ( TNotice ) newValue );
            return;
        case NsdPackage.TCOPYRIGHT_NOTICE__LICENSE:
            setLicense( ( TLicense ) newValue );
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
        case NsdPackage.TCOPYRIGHT_NOTICE__NOTICE:
            setNotice( ( TNotice ) null );
            return;
        case NsdPackage.TCOPYRIGHT_NOTICE__LICENSE:
            setLicense( ( TLicense ) null );
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
        case NsdPackage.TCOPYRIGHT_NOTICE__NOTICE:
            return notice != null;
        case NsdPackage.TCOPYRIGHT_NOTICE__LICENSE:
            return license != null;
        }
        return super.eIsSet( featureID );
    }

} //TCopyrightNoticeImpl
