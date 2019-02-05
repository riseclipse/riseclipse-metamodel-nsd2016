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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDObjectWithVersionAndRelease;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NSD Object With Version And Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDObjectWithVersionAndReleaseImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSDObjectWithVersionAndReleaseImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NSDObjectWithVersionAndReleaseImpl extends MinimalEObjectImpl.Container
        implements NSDObjectWithVersionAndRelease {
    /**
     * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected static final Integer RELEASE_EDEFAULT = new Integer( 1 );

    /**
     * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected Integer release = RELEASE_EDEFAULT;

    /**
     * This is true if the Release attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releaseESet;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final Integer VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected Integer version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NSDObjectWithVersionAndReleaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.NSD_OBJECT_WITH_VERSION_AND_RELEASE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getRelease() {
        return release;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelease( Integer newRelease ) {
        Integer oldRelease = release;
        release = newRelease;
        boolean oldReleaseESet = releaseESet;
        releaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE, oldRelease, release, !oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelease() {
        Integer oldRelease = release;
        boolean oldReleaseESet = releaseESet;
        release = RELEASE_EDEFAULT;
        releaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE, oldRelease, RELEASE_EDEFAULT,
                oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelease() {
        return releaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( Integer newVersion ) {
        Integer oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION, oldVersion, version, !oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        Integer oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION, oldVersion, VERSION_EDEFAULT,
                oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE:
            return getRelease();
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION:
            return getVersion();
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
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION:
            setVersion( ( Integer ) newValue );
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
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION:
            unsetVersion();
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
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE:
            return isSetRelease();
        case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION:
            return isSetVersion();
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
        result.append( " (release: " );
        if( releaseESet )
            result.append( release );
        else
            result.append( "<unset>" );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NSDObjectWithVersionAndReleaseImpl
