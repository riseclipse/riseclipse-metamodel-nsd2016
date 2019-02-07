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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypesImpl#getNS <em>NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicTypesImpl extends NsdObjectImpl implements BasicTypes {
    /**
     * The cached value of the '{@link #getBasicType() <em>Basic Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasicType()
     * @generated
     * @ordered
     */
    protected EList< BasicType > basicType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicTypesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.BASIC_TYPES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BasicType > getBasicType() {
        if( basicType == null ) {
            basicType = new EObjectContainmentWithInverseEList.Unsettable< BasicType >( BasicType.class, this,
                    NsdPackage.BASIC_TYPES__BASIC_TYPE, NsdPackage.BASIC_TYPE__BASIC_TYPES );
        }
        return basicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBasicType() {
        if( basicType != null ) ( ( InternalEList.Unsettable< ? > ) basicType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBasicType() {
        return basicType != null && ( ( InternalEList.Unsettable< ? > ) basicType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getNS() {
        if( eContainerFeatureID() != NsdPackage.BASIC_TYPES__NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNS( NS newNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newNS, NsdPackage.BASIC_TYPES__NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNS( NS newNS ) {
        if( newNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.BASIC_TYPES__NS && newNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newNS != null )
                msgs = ( ( InternalEObject ) newNS ).eInverseAdd( this, NsdPackage.NS__BASIC_TYPES, NS.class, msgs );
            msgs = basicSetNS( newNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPES__NS, newNS, newNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.BASIC_TYPES__BASIC_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBasicType() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.BASIC_TYPES__NS:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetNS( ( NS ) otherEnd, msgs );
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
        case NsdPackage.BASIC_TYPES__BASIC_TYPE:
            return ( ( InternalEList< ? > ) getBasicType() ).basicRemove( otherEnd, msgs );
        case NsdPackage.BASIC_TYPES__NS:
            return basicSetNS( null, msgs );
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
        case NsdPackage.BASIC_TYPES__NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__BASIC_TYPES, NS.class, msgs );
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
        case NsdPackage.BASIC_TYPES__BASIC_TYPE:
            return getBasicType();
        case NsdPackage.BASIC_TYPES__NS:
            return getNS();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case NsdPackage.BASIC_TYPES__BASIC_TYPE:
            getBasicType().clear();
            getBasicType().addAll( ( Collection< ? extends BasicType > ) newValue );
            return;
        case NsdPackage.BASIC_TYPES__NS:
            setNS( ( NS ) newValue );
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
        case NsdPackage.BASIC_TYPES__BASIC_TYPE:
            unsetBasicType();
            return;
        case NsdPackage.BASIC_TYPES__NS:
            setNS( ( NS ) null );
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
        case NsdPackage.BASIC_TYPES__BASIC_TYPE:
            return isSetBasicType();
        case NsdPackage.BASIC_TYPES__NS:
            return getNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //BasicTypesImpl
