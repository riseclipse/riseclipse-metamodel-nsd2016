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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service CD Cs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl#getServiceCDC <em>Service CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceCDCsImpl#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCDCsImpl extends MinimalEObjectImpl.Container implements ServiceCDCs {
    /**
     * The cached value of the '{@link #getServiceCDC() <em>Service CDC</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceCDC()
     * @generated
     * @ordered
     */
    protected EList< ServiceCDC > serviceCDC;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceCDCsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_CD_CS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceCDC > getServiceCDC() {
        if( serviceCDC == null ) {
            serviceCDC = new EObjectContainmentWithInverseEList.Unsettable< ServiceCDC >( ServiceCDC.class, this,
                    NsdPackage.SERVICE_CD_CS__SERVICE_CDC, NsdPackage.SERVICE_CDC__SERVICE_CD_CS );
        }
        return serviceCDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceCDC() {
        if( serviceCDC != null ) ( ( InternalEList.Unsettable< ? > ) serviceCDC ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceCDC() {
        return serviceCDC != null && ( ( InternalEList.Unsettable< ? > ) serviceCDC ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getServiceNS() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_CD_CS__SERVICE_NS ) return null;
        return ( ServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceNS( ServiceNS newServiceNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newServiceNS, NsdPackage.SERVICE_CD_CS__SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceNS( ServiceNS newServiceNS ) {
        if( newServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_CD_CS__SERVICE_NS && newServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newServiceNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newServiceNS != null ) msgs = ( ( InternalEObject ) newServiceNS ).eInverseAdd( this,
                    NsdPackage.SERVICE_NS__SERVICE_CD_CS, ServiceNS.class, msgs );
            msgs = basicSetServiceNS( newServiceNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_CD_CS__SERVICE_NS, newServiceNS, newServiceNS ) );
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_CDC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getServiceCDC() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetServiceNS( ( ServiceNS ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_CDC:
            return ( ( InternalEList< ? > ) getServiceCDC() ).basicRemove( otherEnd, msgs );
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            return basicSetServiceNS( null, msgs );
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS__SERVICE_CD_CS, ServiceNS.class,
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_CDC:
            return getServiceCDC();
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            return getServiceNS();
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_CDC:
            getServiceCDC().clear();
            getServiceCDC().addAll( ( Collection< ? extends ServiceCDC > ) newValue );
            return;
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            setServiceNS( ( ServiceNS ) newValue );
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_CDC:
            unsetServiceCDC();
            return;
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            setServiceNS( ( ServiceNS ) null );
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
        case NsdPackage.SERVICE_CD_CS__SERVICE_CDC:
            return isSetServiceCDC();
        case NsdPackage.SERVICE_CD_CS__SERVICE_NS:
            return getServiceNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //ServiceCDCsImpl
