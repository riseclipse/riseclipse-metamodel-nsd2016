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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
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
 * An implementation of the model object '<em><b>Enumerations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationsImpl#getNS <em>NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationsImpl extends NsdObjectImpl implements Enumerations {
    /**
     * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumeration()
     * @generated
     * @ordered
     */
    protected EList< Enumeration > enumeration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ENUMERATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Enumeration > getEnumeration() {
        if( enumeration == null ) {
            enumeration = new EObjectContainmentWithInverseEList.Unsettable< Enumeration >( Enumeration.class, this,
                    NsdPackage.ENUMERATIONS__ENUMERATION, NsdPackage.ENUMERATION__ENUMERATIONS );
        }
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnumeration() {
        if( enumeration != null ) ( ( InternalEList.Unsettable< ? > ) enumeration ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnumeration() {
        return enumeration != null && ( ( InternalEList.Unsettable< ? > ) enumeration ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getNS() {
        if( eContainerFeatureID() != NsdPackage.ENUMERATIONS__NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNS( NS newNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newNS, NsdPackage.ENUMERATIONS__NS, msgs );
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
                || ( eContainerFeatureID() != NsdPackage.ENUMERATIONS__NS && newNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newNS != null )
                msgs = ( ( InternalEObject ) newNS ).eInverseAdd( this, NsdPackage.NS__ENUMERATIONS, NS.class, msgs );
            msgs = basicSetNS( newNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ENUMERATIONS__NS, newNS, newNS ) );
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
        case NsdPackage.ENUMERATIONS__ENUMERATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnumeration() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ENUMERATIONS__NS:
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
        case NsdPackage.ENUMERATIONS__ENUMERATION:
            return ( ( InternalEList< ? > ) getEnumeration() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ENUMERATIONS__NS:
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
        case NsdPackage.ENUMERATIONS__NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__ENUMERATIONS, NS.class, msgs );
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
        case NsdPackage.ENUMERATIONS__ENUMERATION:
            return getEnumeration();
        case NsdPackage.ENUMERATIONS__NS:
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
        case NsdPackage.ENUMERATIONS__ENUMERATION:
            getEnumeration().clear();
            getEnumeration().addAll( ( Collection< ? extends Enumeration > ) newValue );
            return;
        case NsdPackage.ENUMERATIONS__NS:
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
        case NsdPackage.ENUMERATIONS__ENUMERATION:
            unsetEnumeration();
            return;
        case NsdPackage.ENUMERATIONS__NS:
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
        case NsdPackage.ENUMERATIONS__ENUMERATION:
            return isSetEnumeration();
        case NsdPackage.ENUMERATIONS__NS:
            return getNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //EnumerationsImpl
