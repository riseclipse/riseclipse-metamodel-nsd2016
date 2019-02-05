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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.License;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copyright Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl#getNotice <em>Notice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyrightNoticeImpl extends MinimalEObjectImpl.Container implements CopyrightNotice {
    /**
     * The cached value of the '{@link #getNotice() <em>Notice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotice()
     * @generated
     * @ordered
     */
    protected Notice notice;

    /**
     * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLicense()
     * @generated
     * @ordered
     */
    protected License license;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CopyrightNoticeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.COPYRIGHT_NOTICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Notice getNotice() {
        return notice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNotice( Notice newNotice, NotificationChain msgs ) {
        Notice oldNotice = notice;
        notice = newNotice;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.COPYRIGHT_NOTICE__NOTICE, oldNotice, newNotice );
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
    public void setNotice( Notice newNotice ) {
        if( newNotice != notice ) {
            NotificationChain msgs = null;
            if( notice != null ) msgs = ( ( InternalEObject ) notice ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHT_NOTICE__NOTICE, null, msgs );
            if( newNotice != null ) msgs = ( ( InternalEObject ) newNotice ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHT_NOTICE__NOTICE, null, msgs );
            msgs = basicSetNotice( newNotice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.COPYRIGHT_NOTICE__NOTICE, newNotice, newNotice ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public License getLicense() {
        return license;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLicense( License newLicense, NotificationChain msgs ) {
        License oldLicense = license;
        license = newLicense;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.COPYRIGHT_NOTICE__LICENSE, oldLicense, newLicense );
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
    public void setLicense( License newLicense ) {
        if( newLicense != license ) {
            NotificationChain msgs = null;
            if( license != null ) msgs = ( ( InternalEObject ) license ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHT_NOTICE__LICENSE, null, msgs );
            if( newLicense != null ) msgs = ( ( InternalEObject ) newLicense ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHT_NOTICE__LICENSE, null, msgs );
            msgs = basicSetLicense( newLicense, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.COPYRIGHT_NOTICE__LICENSE, newLicense, newLicense ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.COPYRIGHT_NOTICE__NOTICE:
            return basicSetNotice( null, msgs );
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
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
        case NsdPackage.COPYRIGHT_NOTICE__NOTICE:
            return getNotice();
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
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
        case NsdPackage.COPYRIGHT_NOTICE__NOTICE:
            setNotice( ( Notice ) newValue );
            return;
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            setLicense( ( License ) newValue );
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
        case NsdPackage.COPYRIGHT_NOTICE__NOTICE:
            setNotice( ( Notice ) null );
            return;
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            setLicense( ( License ) null );
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
        case NsdPackage.COPYRIGHT_NOTICE__NOTICE:
            return notice != null;
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            return license != null;
        }
        return super.eIsSet( featureID );
    }

} //CopyrightNoticeImpl
