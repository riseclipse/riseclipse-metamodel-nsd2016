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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDoc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDocImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDocImpl extends MinimalEObjectImpl.Container implements TDoc {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDocImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TDOC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getMixed() {
        if( mixed == null ) {
            mixed = new BasicFeatureMap( this, NsdPackage.TDOC__MIXED );
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getGroup() {
        return ( FeatureMap ) getMixed().< FeatureMap.Entry > list( NsdPackage.Literals.TDOC__GROUP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getAny() {
        return ( FeatureMap ) getGroup().< FeatureMap.Entry > list( NsdPackage.Literals.TDOC__ANY );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId( String newId ) {
        String oldId = id;
        id = newId;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TDOC__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TDOC__MIXED:
            return ( ( InternalEList< ? > ) getMixed() ).basicRemove( otherEnd, msgs );
        case NsdPackage.TDOC__GROUP:
            return ( ( InternalEList< ? > ) getGroup() ).basicRemove( otherEnd, msgs );
        case NsdPackage.TDOC__ANY:
            return ( ( InternalEList< ? > ) getAny() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.TDOC__MIXED:
            if( coreType ) return getMixed();
            return ( ( FeatureMap.Internal ) getMixed() ).getWrapper();
        case NsdPackage.TDOC__GROUP:
            if( coreType ) return getGroup();
            return ( ( FeatureMap.Internal ) getGroup() ).getWrapper();
        case NsdPackage.TDOC__ANY:
            if( coreType ) return getAny();
            return ( ( FeatureMap.Internal ) getAny() ).getWrapper();
        case NsdPackage.TDOC__ID:
            return getId();
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
        case NsdPackage.TDOC__MIXED:
            ( ( FeatureMap.Internal ) getMixed() ).set( newValue );
            return;
        case NsdPackage.TDOC__GROUP:
            ( ( FeatureMap.Internal ) getGroup() ).set( newValue );
            return;
        case NsdPackage.TDOC__ANY:
            ( ( FeatureMap.Internal ) getAny() ).set( newValue );
            return;
        case NsdPackage.TDOC__ID:
            setId( ( String ) newValue );
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
        case NsdPackage.TDOC__MIXED:
            getMixed().clear();
            return;
        case NsdPackage.TDOC__GROUP:
            getGroup().clear();
            return;
        case NsdPackage.TDOC__ANY:
            getAny().clear();
            return;
        case NsdPackage.TDOC__ID:
            setId( ID_EDEFAULT );
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
        case NsdPackage.TDOC__MIXED:
            return mixed != null && !mixed.isEmpty();
        case NsdPackage.TDOC__GROUP:
            return !getGroup().isEmpty();
        case NsdPackage.TDOC__ANY:
            return !getAny().isEmpty();
        case NsdPackage.TDOC__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals( id );
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
        result.append( " (mixed: " );
        result.append( mixed );
        result.append( ", id: " );
        result.append( id );
        result.append( ')' );
        return result.toString();
    }

} //TDocImpl
