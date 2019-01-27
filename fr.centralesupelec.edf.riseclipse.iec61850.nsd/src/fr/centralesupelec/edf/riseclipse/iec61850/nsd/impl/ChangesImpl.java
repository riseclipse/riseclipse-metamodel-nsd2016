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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getChangesID <em>Changes ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getTissues <em>Tissues</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangesImpl extends MinimalEObjectImpl.Container implements Changes {
    /**
     * The default value of the '{@link #getChangesID() <em>Changes ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangesID()
     * @generated
     * @ordered
     */
    protected static final String CHANGES_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChangesID() <em>Changes ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangesID()
     * @generated
     * @ordered
     */
    protected String changesID = CHANGES_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar date = DATE_EDEFAULT;

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
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final String REVISION_EDEFAULT = "A";

    /**
     * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected String revision = REVISION_EDEFAULT;

    /**
     * This is true if the Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionESet;

    /**
     * The default value of the '{@link #getTissues() <em>Tissues</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTissues()
     * @generated
     * @ordered
     */
    protected static final String TISSUES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTissues() <em>Tissues</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTissues()
     * @generated
     * @ordered
     */
    protected String tissues = TISSUES_EDEFAULT;

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
    protected ChangesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.CHANGES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getChangesID() {
        return changesID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChangesID( String newChangesID ) {
        String oldChangesID = changesID;
        changesID = newChangesID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.CHANGES__CHANGES_ID, oldChangesID, changesID ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDate( XMLGregorianCalendar newDate ) {
        XMLGregorianCalendar oldDate = date;
        date = newDate;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CHANGES__DATE, oldDate, date ) );
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
                NsdPackage.CHANGES__RELEASE, oldRelease, release, !oldReleaseESet ) );
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
                NsdPackage.CHANGES__RELEASE, oldRelease, RELEASE_EDEFAULT, oldReleaseESet ) );
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
    public String getRevision() {
        return revision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision( String newRevision ) {
        String oldRevision = revision;
        revision = newRevision;
        boolean oldRevisionESet = revisionESet;
        revisionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.CHANGES__REVISION, oldRevision, revision, !oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        String oldRevision = revision;
        boolean oldRevisionESet = revisionESet;
        revision = REVISION_EDEFAULT;
        revisionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.CHANGES__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return revisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTissues() {
        return tissues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTissues( String newTissues ) {
        String oldTissues = tissues;
        tissues = newTissues;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.CHANGES__TISSUES, oldTissues, tissues ) );
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
                NsdPackage.CHANGES__VERSION, oldVersion, version, !oldVersionESet ) );
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
                NsdPackage.CHANGES__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet ) );
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
        case NsdPackage.CHANGES__CHANGES_ID:
            return getChangesID();
        case NsdPackage.CHANGES__DATE:
            return getDate();
        case NsdPackage.CHANGES__RELEASE:
            return getRelease();
        case NsdPackage.CHANGES__REVISION:
            return getRevision();
        case NsdPackage.CHANGES__TISSUES:
            return getTissues();
        case NsdPackage.CHANGES__VERSION:
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
        case NsdPackage.CHANGES__CHANGES_ID:
            setChangesID( ( String ) newValue );
            return;
        case NsdPackage.CHANGES__DATE:
            setDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.CHANGES__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.CHANGES__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.CHANGES__TISSUES:
            setTissues( ( String ) newValue );
            return;
        case NsdPackage.CHANGES__VERSION:
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
        case NsdPackage.CHANGES__CHANGES_ID:
            setChangesID( CHANGES_ID_EDEFAULT );
            return;
        case NsdPackage.CHANGES__DATE:
            setDate( DATE_EDEFAULT );
            return;
        case NsdPackage.CHANGES__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.CHANGES__REVISION:
            unsetRevision();
            return;
        case NsdPackage.CHANGES__TISSUES:
            setTissues( TISSUES_EDEFAULT );
            return;
        case NsdPackage.CHANGES__VERSION:
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
        case NsdPackage.CHANGES__CHANGES_ID:
            return CHANGES_ID_EDEFAULT == null ? changesID != null : !CHANGES_ID_EDEFAULT.equals( changesID );
        case NsdPackage.CHANGES__DATE:
            return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals( date );
        case NsdPackage.CHANGES__RELEASE:
            return isSetRelease();
        case NsdPackage.CHANGES__REVISION:
            return isSetRevision();
        case NsdPackage.CHANGES__TISSUES:
            return TISSUES_EDEFAULT == null ? tissues != null : !TISSUES_EDEFAULT.equals( tissues );
        case NsdPackage.CHANGES__VERSION:
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
        result.append( " (changesID: " );
        result.append( changesID );
        result.append( ", date: " );
        result.append( date );
        result.append( ", release: " );
        if( releaseESet )
            result.append( release );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", tissues: " );
        result.append( tissues );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ChangesImpl
