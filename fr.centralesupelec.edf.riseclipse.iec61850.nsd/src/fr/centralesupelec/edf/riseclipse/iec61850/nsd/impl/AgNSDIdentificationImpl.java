/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
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
 */
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSDIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag NSD Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSDIdentificationImpl#getNsdVersion <em>Nsd Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSDIdentificationImpl#getNsdRevision <em>Nsd Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgNSDIdentificationImpl#getNsdRelease <em>Nsd Release</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgNSDIdentificationImpl extends MinimalEObjectImpl.Container implements AgNSDIdentification {
    /**
     * The default value of the '{@link #getNsdVersion() <em>Nsd Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsdVersion()
     * @generated
     * @ordered
     */
    protected static final Integer NSD_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNsdVersion() <em>Nsd Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsdVersion()
     * @generated
     * @ordered
     */
    protected Integer nsdVersion = NSD_VERSION_EDEFAULT;

    /**
     * This is true if the Nsd Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nsdVersionESet;

    /**
     * The default value of the '{@link #getNsdRevision() <em>Nsd Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsdRevision()
     * @generated
     * @ordered
     */
    protected static final String NSD_REVISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNsdRevision() <em>Nsd Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsdRevision()
     * @generated
     * @ordered
     */
    protected String nsdRevision = NSD_REVISION_EDEFAULT;

    /**
     * This is true if the Nsd Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nsdRevisionESet;

    /**
     * The default value of the '{@link #getNsdRelease() <em>Nsd Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsdRelease()
     * @generated
     * @ordered
     */
    protected static final Integer NSD_RELEASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNsdRelease() <em>Nsd Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNsdRelease()
     * @generated
     * @ordered
     */
    protected Integer nsdRelease = NSD_RELEASE_EDEFAULT;

    /**
     * This is true if the Nsd Release attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nsdReleaseESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgNSDIdentificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_NSD_IDENTIFICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNsdVersion() {
        return nsdVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNsdVersion( Integer newNsdVersion ) {
        Integer oldNsdVersion = nsdVersion;
        nsdVersion = newNsdVersion;
        boolean oldNsdVersionESet = nsdVersionESet;
        nsdVersionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_NSD_IDENTIFICATION__NSD_VERSION,
                    oldNsdVersion, nsdVersion, !oldNsdVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNsdVersion() {
        Integer oldNsdVersion = nsdVersion;
        boolean oldNsdVersionESet = nsdVersionESet;
        nsdVersion = NSD_VERSION_EDEFAULT;
        nsdVersionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_NSD_IDENTIFICATION__NSD_VERSION,
                    oldNsdVersion, NSD_VERSION_EDEFAULT, oldNsdVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNsdVersion() {
        return nsdVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNsdRevision() {
        return nsdRevision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNsdRevision( String newNsdRevision ) {
        String oldNsdRevision = nsdRevision;
        nsdRevision = newNsdRevision;
        boolean oldNsdRevisionESet = nsdRevisionESet;
        nsdRevisionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_NSD_IDENTIFICATION__NSD_REVISION,
                    oldNsdRevision, nsdRevision, !oldNsdRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNsdRevision() {
        String oldNsdRevision = nsdRevision;
        boolean oldNsdRevisionESet = nsdRevisionESet;
        nsdRevision = NSD_REVISION_EDEFAULT;
        nsdRevisionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_NSD_IDENTIFICATION__NSD_REVISION,
                    oldNsdRevision, NSD_REVISION_EDEFAULT, oldNsdRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNsdRevision() {
        return nsdRevisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNsdRelease() {
        return nsdRelease;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNsdRelease( Integer newNsdRelease ) {
        Integer oldNsdRelease = nsdRelease;
        nsdRelease = newNsdRelease;
        boolean oldNsdReleaseESet = nsdReleaseESet;
        nsdReleaseESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_NSD_IDENTIFICATION__NSD_RELEASE,
                    oldNsdRelease, nsdRelease, !oldNsdReleaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNsdRelease() {
        Integer oldNsdRelease = nsdRelease;
        boolean oldNsdReleaseESet = nsdReleaseESet;
        nsdRelease = NSD_RELEASE_EDEFAULT;
        nsdReleaseESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_NSD_IDENTIFICATION__NSD_RELEASE,
                    oldNsdRelease, NSD_RELEASE_EDEFAULT, oldNsdReleaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNsdRelease() {
        return nsdReleaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_VERSION:
            return getNsdVersion();
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_REVISION:
            return getNsdRevision();
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_RELEASE:
            return getNsdRelease();
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
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_VERSION:
            setNsdVersion( ( Integer ) newValue );
            return;
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_REVISION:
            setNsdRevision( ( String ) newValue );
            return;
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_RELEASE:
            setNsdRelease( ( Integer ) newValue );
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
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_VERSION:
            unsetNsdVersion();
            return;
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_REVISION:
            unsetNsdRevision();
            return;
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_RELEASE:
            unsetNsdRelease();
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
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_VERSION:
            return isSetNsdVersion();
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_REVISION:
            return isSetNsdRevision();
        case NsdPackage.AG_NSD_IDENTIFICATION__NSD_RELEASE:
            return isSetNsdRelease();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (nsdVersion: " );
        if( nsdVersionESet ) {
            result.append( nsdVersion );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", nsdRevision: " );
        if( nsdRevisionESet ) {
            result.append( nsdRevision );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", nsdRelease: " );
        if( nsdReleaseESet ) {
            result.append( nsdRelease );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //AgNSDIdentificationImpl
