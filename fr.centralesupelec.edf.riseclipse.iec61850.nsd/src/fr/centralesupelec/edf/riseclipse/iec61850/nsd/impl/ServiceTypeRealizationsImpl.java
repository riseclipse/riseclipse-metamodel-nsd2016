/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type Realizations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl#getServiceTypeRealization <em>Service Type Realization</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationsImpl#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeRealizationsImpl extends NsdObjectImpl implements ServiceTypeRealizations {
    /**
     * The cached value of the '{@link #getServiceTypeRealization() <em>Service Type Realization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceTypeRealization()
     * @generated
     * @ordered
     */
    protected EList< ServiceTypeRealization > serviceTypeRealization;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceTypeRealizationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_TYPE_REALIZATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceTypeRealization > getServiceTypeRealization() {
        if( serviceTypeRealization == null ) {
            serviceTypeRealization = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ServiceTypeRealization.class, this, NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION,
                    NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS );
        }
        return serviceTypeRealization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceTypeRealization() {
        if( serviceTypeRealization != null ) {
            ( ( InternalEList.Unsettable< ? > ) serviceTypeRealization ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceTypeRealization() {
        return serviceTypeRealization != null && ( ( InternalEList.Unsettable< ? > ) serviceTypeRealization ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getParentServiceNS() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS ) {
            return null;
        }
        return ( ServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceNS( ServiceNS newParentServiceNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceNS,
                NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceNS( ServiceNS newParentServiceNS ) {
        if( newParentServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS
                        && newParentServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceNS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceNS != null ) {
                msgs = ( ( InternalEObject ) newParentServiceNS ).eInverseAdd( this,
                        NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, ServiceNS.class, msgs );
            }
            msgs = basicSetParentServiceNS( newParentServiceNS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS, newParentServiceNS, newParentServiceNS ) );
        }
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getServiceTypeRealization() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceNS( ( ServiceNS ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION:
            return ( ( InternalEList< ? > ) getServiceTypeRealization() ).basicRemove( otherEnd, msgs );
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            return basicSetParentServiceNS( null, msgs );
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS,
                    ServiceNS.class, msgs );
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION:
            return getServiceTypeRealization();
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            return getParentServiceNS();
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION:
            getServiceTypeRealization().clear();
            getServiceTypeRealization().addAll( ( Collection< ? extends ServiceTypeRealization > ) newValue );
            return;
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            setParentServiceNS( ( ServiceNS ) newValue );
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION:
            unsetServiceTypeRealization();
            return;
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            setParentServiceNS( ( ServiceNS ) null );
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
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION:
            return isSetServiceTypeRealization();
        case NsdPackage.SERVICE_TYPE_REALIZATIONS__PARENT_SERVICE_NS:
            return getParentServiceNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //ServiceTypeRealizationsImpl
