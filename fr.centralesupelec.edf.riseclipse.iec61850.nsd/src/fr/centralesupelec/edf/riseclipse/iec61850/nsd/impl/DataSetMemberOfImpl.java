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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Member Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl#getCb <em>Cb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl#getApplicableServices <em>Applicable Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetMemberOfImpl extends MinimalEObjectImpl.Container implements DataSetMemberOf {
    /**
     * The default value of the '{@link #getCb() <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCb()
     * @generated
     * @ordered
     */
    protected static final CBKind CB_EDEFAULT = CBKind.RCB;

    /**
     * The cached value of the '{@link #getCb() <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCb()
     * @generated
     * @ordered
     */
    protected CBKind cb = CB_EDEFAULT;

    /**
     * This is true if the Cb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cbESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataSetMemberOfImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DATA_SET_MEMBER_OF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CBKind getCb() {
        return cb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCb( CBKind newCb ) {
        CBKind oldCb = cb;
        cb = newCb == null ? CB_EDEFAULT : newCb;
        boolean oldCbESet = cbESet;
        cbESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.DATA_SET_MEMBER_OF__CB, oldCb, cb, !oldCbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCb() {
        CBKind oldCb = cb;
        boolean oldCbESet = cbESet;
        cb = CB_EDEFAULT;
        cbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.DATA_SET_MEMBER_OF__CB, oldCb, CB_EDEFAULT, oldCbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCb() {
        return cbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServices getApplicableServices() {
        if( eContainerFeatureID() != NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES ) return null;
        return ( ApplicableServices ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicableServices( ApplicableServices newApplicableServices,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newApplicableServices,
                NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicableServices( ApplicableServices newApplicableServices ) {
        if( newApplicableServices != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES
                        && newApplicableServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newApplicableServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newApplicableServices != null ) msgs = ( ( InternalEObject ) newApplicableServices ).eInverseAdd( this,
                    NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF, ApplicableServices.class, msgs );
            msgs = basicSetApplicableServices( newApplicableServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES, newApplicableServices, newApplicableServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetApplicableServices( ( ApplicableServices ) otherEnd, msgs );
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
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            return basicSetApplicableServices( null, msgs );
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
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF,
                    ApplicableServices.class, msgs );
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            return getCb();
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            return getApplicableServices();
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            setCb( ( CBKind ) newValue );
            return;
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            setApplicableServices( ( ApplicableServices ) newValue );
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            unsetCb();
            return;
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            setApplicableServices( ( ApplicableServices ) null );
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            return isSetCb();
        case NsdPackage.DATA_SET_MEMBER_OF__APPLICABLE_SERVICES:
            return getApplicableServices() != null;
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
        result.append( " (cb: " );
        if( cbESet )
            result.append( cb );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DataSetMemberOfImpl
