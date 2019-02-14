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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.License;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Notice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightNoticeImpl#getCopyrighted <em>Copyrighted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyrightNoticeImpl extends NsdObjectImpl implements CopyrightNotice {
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
     * This is true if the Notice containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean noticeESet;

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
     * This is true if the License containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean licenseESet;

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
        boolean oldNoticeESet = noticeESet;
        noticeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.COPYRIGHT_NOTICE__NOTICE, oldNotice, newNotice, !oldNoticeESet );
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
            if( notice != null )
                msgs = ( ( InternalEObject ) notice ).eInverseRemove( this, NsdPackage.NOTICE__COPYRIGHT_NOTICE,
                        Notice.class, msgs );
            if( newNotice != null )
                msgs = ( ( InternalEObject ) newNotice ).eInverseAdd( this, NsdPackage.NOTICE__COPYRIGHT_NOTICE,
                        Notice.class, msgs );
            msgs = basicSetNotice( newNotice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNoticeESet = noticeESet;
            noticeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.COPYRIGHT_NOTICE__NOTICE, newNotice,
                        newNotice, !oldNoticeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNotice( NotificationChain msgs ) {
        Notice oldNotice = notice;
        notice = null;
        boolean oldNoticeESet = noticeESet;
        noticeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.COPYRIGHT_NOTICE__NOTICE, oldNotice, null, oldNoticeESet );
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
    public void unsetNotice() {
        if( notice != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) notice ).eInverseRemove( this, NsdPackage.NOTICE__COPYRIGHT_NOTICE,
                    Notice.class, msgs );
            msgs = basicUnsetNotice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNoticeESet = noticeESet;
            noticeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.COPYRIGHT_NOTICE__NOTICE, null,
                        null, oldNoticeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNotice() {
        return noticeESet;
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
        boolean oldLicenseESet = licenseESet;
        licenseESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.COPYRIGHT_NOTICE__LICENSE, oldLicense, newLicense, !oldLicenseESet );
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
            if( license != null )
                msgs = ( ( InternalEObject ) license ).eInverseRemove( this, NsdPackage.LICENSE__COPYRIGHT_NOTICE,
                        License.class, msgs );
            if( newLicense != null )
                msgs = ( ( InternalEObject ) newLicense ).eInverseAdd( this, NsdPackage.LICENSE__COPYRIGHT_NOTICE,
                        License.class, msgs );
            msgs = basicSetLicense( newLicense, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLicenseESet = licenseESet;
            licenseESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.COPYRIGHT_NOTICE__LICENSE,
                        newLicense, newLicense, !oldLicenseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLicense( NotificationChain msgs ) {
        License oldLicense = license;
        license = null;
        boolean oldLicenseESet = licenseESet;
        licenseESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.COPYRIGHT_NOTICE__LICENSE, oldLicense, null, oldLicenseESet );
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
    public void unsetLicense() {
        if( license != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) license ).eInverseRemove( this, NsdPackage.LICENSE__COPYRIGHT_NOTICE,
                    License.class, msgs );
            msgs = basicUnsetLicense( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLicenseESet = licenseESet;
            licenseESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.COPYRIGHT_NOTICE__LICENSE, null,
                        null, oldLicenseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLicense() {
        return licenseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Copyrighted getCopyrighted() {
        if( eContainerFeatureID() != NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED ) return null;
        return ( Copyrighted ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCopyrighted( Copyrighted newCopyrighted, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newCopyrighted, NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCopyrighted( Copyrighted newCopyrighted ) {
        if( newCopyrighted != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED && newCopyrighted != null ) ) {
            if( EcoreUtil.isAncestor( this, newCopyrighted ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newCopyrighted != null )
                msgs = ( ( InternalEObject ) newCopyrighted ).eInverseAdd( this, NsdPackage.COPYRIGHTED__COPYRIGHT,
                        Copyrighted.class, msgs );
            msgs = basicSetCopyrighted( newCopyrighted, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED,
                    newCopyrighted, newCopyrighted ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.COPYRIGHT_NOTICE__NOTICE:
            if( notice != null )
                msgs = ( ( InternalEObject ) notice ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHT_NOTICE__NOTICE, null, msgs );
            return basicSetNotice( ( Notice ) otherEnd, msgs );
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            if( license != null )
                msgs = ( ( InternalEObject ) license ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHT_NOTICE__LICENSE, null, msgs );
            return basicSetLicense( ( License ) otherEnd, msgs );
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetCopyrighted( ( Copyrighted ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
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
            return basicUnsetNotice( msgs );
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            return basicUnsetLicense( msgs );
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            return basicSetCopyrighted( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            return eInternalContainer().eInverseRemove( this, NsdPackage.COPYRIGHTED__COPYRIGHT, Copyrighted.class,
                    msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
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
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            return getCopyrighted();
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
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            setCopyrighted( ( Copyrighted ) newValue );
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
            unsetNotice();
            return;
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            unsetLicense();
            return;
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            setCopyrighted( ( Copyrighted ) null );
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
            return isSetNotice();
        case NsdPackage.COPYRIGHT_NOTICE__LICENSE:
            return isSetLicense();
        case NsdPackage.COPYRIGHT_NOTICE__COPYRIGHTED:
            return getCopyrighted() != null;
        }
        return super.eIsSet( featureID );
    }

} //CopyrightNoticeImpl
