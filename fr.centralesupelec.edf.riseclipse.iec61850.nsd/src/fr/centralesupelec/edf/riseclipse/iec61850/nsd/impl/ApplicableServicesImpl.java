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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType;

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
 * An implementation of the model object '<em><b>Applicable Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl#getDataSetMemberOf <em>Data Set Member Of</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl#getFunctionalConstraint <em>Functional Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicableServicesImpl extends MinimalEObjectImpl.Container implements ApplicableServices {
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
    protected EList< DataSetMemberOf > dataSetMemberOf;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicableServicesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.APPLICABLE_SERVICES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceType > getService() {
        if( service == null ) {
            service = new EObjectContainmentWithInverseEList.Unsettable< ServiceType >( ServiceType.class, this,
                    NsdPackage.APPLICABLE_SERVICES__SERVICE, NsdPackage.SERVICE_TYPE__APPLICABLE_SERVICES );
        }
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetService() {
        if( service != null ) ( ( InternalEList.Unsettable< ? > ) service ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetService() {
        return service != null && ( ( InternalEList.Unsettable< ? > ) service ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataSetMemberOf > getDataSetMemberOf() {
        if( dataSetMemberOf == null ) {
            dataSetMemberOf = new EObjectContainmentWithInverseEList.Unsettable< DataSetMemberOf >(
                    DataSetMemberOf.class, this, NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF,
                    NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES );
        }
        return dataSetMemberOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataSetMemberOf() {
        if( dataSetMemberOf != null ) ( ( InternalEList.Unsettable< ? > ) dataSetMemberOf ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataSetMemberOf() {
        return dataSetMemberOf != null && ( ( InternalEList.Unsettable< ? > ) dataSetMemberOf ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraint getFunctionalConstraint() {
        if( eContainerFeatureID() != NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT ) return null;
        return ( FunctionalConstraint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunctionalConstraint( FunctionalConstraint newFunctionalConstraint,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newFunctionalConstraint,
                NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionalConstraint( FunctionalConstraint newFunctionalConstraint ) {
        if( newFunctionalConstraint != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT
                        && newFunctionalConstraint != null ) ) {
            if( EcoreUtil.isAncestor( this, newFunctionalConstraint ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newFunctionalConstraint != null )
                msgs = ( ( InternalEObject ) newFunctionalConstraint ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, FunctionalConstraint.class, msgs );
            msgs = basicSetFunctionalConstraint( newFunctionalConstraint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT,
                        newFunctionalConstraint, newFunctionalConstraint ) );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getService() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDataSetMemberOf() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetFunctionalConstraint( ( FunctionalConstraint ) otherEnd, msgs );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return ( ( InternalEList< ? > ) getService() ).basicRemove( otherEnd, msgs );
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return ( ( InternalEList< ? > ) getDataSetMemberOf() ).basicRemove( otherEnd, msgs );
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            return basicSetFunctionalConstraint( null, msgs );
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
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            return eInternalContainer().eInverseRemove( this, NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES,
                    FunctionalConstraint.class, msgs );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return getService();
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return getDataSetMemberOf();
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            return getFunctionalConstraint();
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            getService().clear();
            getService().addAll( ( Collection< ? extends ServiceType > ) newValue );
            return;
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            getDataSetMemberOf().clear();
            getDataSetMemberOf().addAll( ( Collection< ? extends DataSetMemberOf > ) newValue );
            return;
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            setFunctionalConstraint( ( FunctionalConstraint ) newValue );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            unsetService();
            return;
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            unsetDataSetMemberOf();
            return;
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            setFunctionalConstraint( ( FunctionalConstraint ) null );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return isSetService();
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return isSetDataSetMemberOf();
        case NsdPackage.APPLICABLE_SERVICES__FUNCTIONAL_CONSTRAINT:
            return getFunctionalConstraint() != null;
        }
        return super.eIsSet( featureID );
    }

} //ApplicableServicesImpl
