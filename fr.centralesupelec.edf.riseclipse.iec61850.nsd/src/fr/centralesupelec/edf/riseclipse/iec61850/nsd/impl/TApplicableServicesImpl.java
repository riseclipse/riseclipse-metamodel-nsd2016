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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataSetMemberOf;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TApplicable Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServicesImpl#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TApplicableServicesImpl#getDataSetMemberOf <em>Data Set Member Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TApplicableServicesImpl extends MinimalEObjectImpl.Container implements TApplicableServices {
    /**
     * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected EList< ServiceType > service;

    /**
     * The cached value of the '{@link #getDataSetMemberOf() <em>Data Set Member Of</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSetMemberOf()
     * @generated
     * @ordered
     */
    protected EList< TDataSetMemberOf > dataSetMemberOf;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TApplicableServicesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TAPPLICABLE_SERVICES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceType > getService() {
        if( service == null ) {
            service = new EObjectContainmentEList< ServiceType >( ServiceType.class, this,
                    NsdPackage.TAPPLICABLE_SERVICES__SERVICE );
        }
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TDataSetMemberOf > getDataSetMemberOf() {
        if( dataSetMemberOf == null ) {
            dataSetMemberOf = new EObjectContainmentEList< TDataSetMemberOf >( TDataSetMemberOf.class, this,
                    NsdPackage.TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF );
        }
        return dataSetMemberOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TAPPLICABLE_SERVICES__SERVICE:
            return ( ( InternalEList< ? > ) getService() ).basicRemove( otherEnd, msgs );
        case NsdPackage.TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return ( ( InternalEList< ? > ) getDataSetMemberOf() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.TAPPLICABLE_SERVICES__SERVICE:
            return getService();
        case NsdPackage.TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return getDataSetMemberOf();
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
        case NsdPackage.TAPPLICABLE_SERVICES__SERVICE:
            getService().clear();
            getService().addAll( ( Collection< ? extends ServiceType > ) newValue );
            return;
        case NsdPackage.TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            getDataSetMemberOf().clear();
            getDataSetMemberOf().addAll( ( Collection< ? extends TDataSetMemberOf > ) newValue );
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
        case NsdPackage.TAPPLICABLE_SERVICES__SERVICE:
            getService().clear();
            return;
        case NsdPackage.TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            getDataSetMemberOf().clear();
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
        case NsdPackage.TAPPLICABLE_SERVICES__SERVICE:
            return service != null && !service.isEmpty();
        case NsdPackage.TAPPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return dataSetMemberOf != null && !dataSetMemberOf.isEmpty();
        }
        return super.eIsSet( featureID );
    }

} //TApplicableServicesImpl
