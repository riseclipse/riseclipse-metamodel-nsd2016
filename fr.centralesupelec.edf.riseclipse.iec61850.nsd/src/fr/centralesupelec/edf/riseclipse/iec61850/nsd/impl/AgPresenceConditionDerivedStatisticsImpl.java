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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND:
            return getDsPresCond();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS:
            return getDsPresCondArgs();
        case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID:
            return getDsPresCondArgsID();
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
