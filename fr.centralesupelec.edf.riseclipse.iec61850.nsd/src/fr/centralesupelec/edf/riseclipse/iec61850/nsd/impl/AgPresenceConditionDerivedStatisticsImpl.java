/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Presence Condition Derived Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl#getDsPresCond <em>Ds Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl#getDsPresCondArgs <em>Ds Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgPresenceConditionDerivedStatisticsImpl#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgPresenceConditionDerivedStatisticsImpl extends MinimalEObjectImpl.Container
        implements AgPresenceConditionDerivedStatistics {
    /**
     * The default value of the '{@link #getDsPresCond() <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCond()
     * @generated
     * @ordered
     */
    protected static final String DS_PRES_COND_EDEFAULT = "M";

    /**
     * The cached value of the '{@link #getDsPresCond() <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCond()
     * @generated
     * @ordered
     */
    protected String dsPresCond = DS_PRES_COND_EDEFAULT;

    /**
     * This is true if the Ds Pres Cond attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dsPresCondESet;

    /**
     * The default value of the '{@link #getDsPresCondArgs() <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgs()
     * @generated
     * @ordered
     */
    protected static final String DS_PRES_COND_ARGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDsPresCondArgs() <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgs()
     * @generated
     * @ordered
     */
    protected String dsPresCondArgs = DS_PRES_COND_ARGS_EDEFAULT;

    /**
     * This is true if the Ds Pres Cond Args attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dsPresCondArgsESet;

    /**
     * The default value of the '{@link #getDsPresCondArgsID() <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgsID()
     * @generated
     * @ordered
     */
    protected static final String DS_PRES_COND_ARGS_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDsPresCondArgsID() <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgsID()
     * @generated
     * @ordered
     */
    protected String dsPresCondArgsID = DS_PRES_COND_ARGS_ID_EDEFAULT;

    /**
     * This is true if the Ds Pres Cond Args ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dsPresCondArgsIDESet;

    /**
     * The cached value of the '{@link #getRefersToDsPresCondArgsDoc() <em>Refers To Ds Pres Cond Args Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDsPresCondArgsDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDsPresCondArgsDoc;

    /**
     * This is true if the Refers To Ds Pres Cond Args Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDsPresCondArgsDocESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgPresenceConditionDerivedStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_PRESENCE_CONDITION_DERIVED_STATISTICS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsPresCond() {
        return dsPresCond;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsPresCond( String newDsPresCond ) {
        String oldDsPresCond = dsPresCond;
        dsPresCond = newDsPresCond;
        boolean oldDsPresCondESet = dsPresCondESet;
        dsPresCondESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND, oldDsPresCond, dsPresCond,
                    !oldDsPresCondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDsPresCond() {
        String oldDsPresCond = dsPresCond;
        boolean oldDsPresCondESet = dsPresCondESet;
        dsPresCond = DS_PRES_COND_EDEFAULT;
        dsPresCondESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND, oldDsPresCond,
                    DS_PRES_COND_EDEFAULT, oldDsPresCondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDsPresCond() {
        return dsPresCondESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsPresCondArgs() {
        return dsPresCondArgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsPresCondArgs( String newDsPresCondArgs ) {
        String oldDsPresCondArgs = dsPresCondArgs;
        dsPresCondArgs = newDsPresCondArgs;
        boolean oldDsPresCondArgsESet = dsPresCondArgsESet;
        dsPresCondArgsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS, oldDsPresCondArgs,
                    dsPresCondArgs, !oldDsPresCondArgsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDsPresCondArgs() {
        String oldDsPresCondArgs = dsPresCondArgs;
        boolean oldDsPresCondArgsESet = dsPresCondArgsESet;
        dsPresCondArgs = DS_PRES_COND_ARGS_EDEFAULT;
        dsPresCondArgsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS, oldDsPresCondArgs,
                    DS_PRES_COND_ARGS_EDEFAULT, oldDsPresCondArgsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDsPresCondArgs() {
        return dsPresCondArgsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsPresCondArgsID() {
        return dsPresCondArgsID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsPresCondArgsID( String newDsPresCondArgsID ) {
        String oldDsPresCondArgsID = dsPresCondArgsID;
        dsPresCondArgsID = newDsPresCondArgsID;
        boolean oldDsPresCondArgsIDESet = dsPresCondArgsIDESet;
        dsPresCondArgsIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID, oldDsPresCondArgsID,
                    dsPresCondArgsID, !oldDsPresCondArgsIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDsPresCondArgsID() {
        String oldDsPresCondArgsID = dsPresCondArgsID;
        boolean oldDsPresCondArgsIDESet = dsPresCondArgsIDESet;
        dsPresCondArgsID = DS_PRES_COND_ARGS_ID_EDEFAULT;
        dsPresCondArgsIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID, oldDsPresCondArgsID,
                    DS_PRES_COND_ARGS_ID_EDEFAULT, oldDsPresCondArgsIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDsPresCondArgsID() {
        return dsPresCondArgsIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDsPresCondArgsDoc() {
        return refersToDsPresCondArgsDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDsPresCondArgsDoc( Doc newRefersToDsPresCondArgsDoc,
            NotificationChain msgs ) {
        Doc oldRefersToDsPresCondArgsDoc = refersToDsPresCondArgsDoc;
        refersToDsPresCondArgsDoc = newRefersToDsPresCondArgsDoc;
        boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
        refersToDsPresCondArgsDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC,
                    oldRefersToDsPresCondArgsDoc, newRefersToDsPresCondArgsDoc, !oldRefersToDsPresCondArgsDocESet );
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
    public void setRefersToDsPresCondArgsDoc( Doc newRefersToDsPresCondArgsDoc ) {
        if( newRefersToDsPresCondArgsDoc != refersToDsPresCondArgsDoc ) {
            NotificationChain msgs = null;
            if( refersToDsPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToDsPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            if( newRefersToDsPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDsPresCondArgsDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            msgs = basicSetRefersToDsPresCondArgsDoc( newRefersToDsPresCondArgsDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
            refersToDsPresCondArgsDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC,
                        newRefersToDsPresCondArgsDoc, newRefersToDsPresCondArgsDoc,
                        !oldRefersToDsPresCondArgsDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDsPresCondArgsDoc( NotificationChain msgs ) {
        Doc oldRefersToDsPresCondArgsDoc = refersToDsPresCondArgsDoc;
        refersToDsPresCondArgsDoc = null;
        boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
        refersToDsPresCondArgsDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC,
                    oldRefersToDsPresCondArgsDoc, null, oldRefersToDsPresCondArgsDocESet );
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
    public void unsetRefersToDsPresCondArgsDoc() {
        if( refersToDsPresCondArgsDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDsPresCondArgsDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            msgs = basicUnsetRefersToDsPresCondArgsDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
            refersToDsPresCondArgsDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC, null,
                        null, oldRefersToDsPresCondArgsDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDsPresCondArgsDoc() {
        return refersToDsPresCondArgsDocESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            if( refersToDsPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToDsPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            return basicSetRefersToDsPresCondArgsDoc( ( Doc ) otherEnd, msgs );
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
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToDsPresCondArgsDoc( msgs );
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
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND:
            return getDsPresCond();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS:
            return getDsPresCondArgs();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID:
            return getDsPresCondArgsID();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            return getRefersToDsPresCondArgsDoc();
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
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND:
            setDsPresCond( ( String ) newValue );
            return;
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS:
            setDsPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID:
            setDsPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            setRefersToDsPresCondArgsDoc( ( Doc ) newValue );
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
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND:
            unsetDsPresCond();
            return;
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS:
            unsetDsPresCondArgs();
            return;
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID:
            unsetDsPresCondArgsID();
            return;
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            unsetRefersToDsPresCondArgsDoc();
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
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND:
            return isSetDsPresCond();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS:
            return isSetDsPresCondArgs();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID:
            return isSetDsPresCondArgsID();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            return isSetRefersToDsPresCondArgsDoc();
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
        result.append( " (dsPresCond: " );
        if( dsPresCondESet )
            result.append( dsPresCond );
        else
            result.append( "<unset>" );
        result.append( ", dsPresCondArgs: " );
        if( dsPresCondArgsESet )
            result.append( dsPresCondArgs );
        else
            result.append( "<unset>" );
        result.append( ", dsPresCondArgsID: " );
        if( dsPresCondArgsIDESet )
            result.append( dsPresCondArgsID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgPresenceConditionDerivedStatisticsImpl
