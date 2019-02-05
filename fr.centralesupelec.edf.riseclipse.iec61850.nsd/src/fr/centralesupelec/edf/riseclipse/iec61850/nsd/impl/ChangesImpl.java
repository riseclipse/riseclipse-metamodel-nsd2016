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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ChangesImpl#getTissues <em>Tissues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangesImpl extends NSDObjectWithVersionAndReleaseImpl implements Changes {
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.CHANGES__CHANGES_ID:
            return getChangesID();
        case NsdPackage.CHANGES__DATE:
            return getDate();
        case NsdPackage.CHANGES__REVISION:
            return getRevision();
        case NsdPackage.CHANGES__TISSUES:
            return getTissues();
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
        case NsdPackage.CHANGES__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.CHANGES__TISSUES:
            setTissues( ( String ) newValue );
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
        case NsdPackage.CHANGES__REVISION:
            unsetRevision();
            return;
        case NsdPackage.CHANGES__TISSUES:
            setTissues( TISSUES_EDEFAULT );
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
        case NsdPackage.CHANGES__REVISION:
            return isSetRevision();
        case NsdPackage.CHANGES__TISSUES:
            return TISSUES_EDEFAULT == null ? tissues != null : !TISSUES_EDEFAULT.equals( tissues );
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
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", tissues: " );
        result.append( tissues );
        result.append( ')' );
        return result.toString();
    }

} //ChangesImpl
