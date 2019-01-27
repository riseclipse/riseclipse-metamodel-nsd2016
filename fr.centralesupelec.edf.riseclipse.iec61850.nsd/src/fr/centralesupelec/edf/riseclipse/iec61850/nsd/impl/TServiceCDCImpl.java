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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TServiceDataAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TService CDC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl#getServiceDataAttribute <em>Service Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TServiceCDCImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TServiceCDCImpl extends MinimalEObjectImpl.Container implements TServiceCDC {
    /**
     * The cached value of the '{@link #getServiceDataAttribute() <em>Service Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< TServiceDataAttribute > serviceDataAttribute;

    /**
     * The default value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdc()
     * @generated
     * @ordered
     */
    protected static final String CDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdc()
     * @generated
     * @ordered
     */
    protected String cdc = CDC_EDEFAULT;

    /**
     * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariant()
     * @generated
     * @ordered
     */
    protected static final String VARIANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariant()
     * @generated
     * @ordered
     */
    protected String variant = VARIANT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TServiceCDCImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TSERVICE_CDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TServiceDataAttribute > getServiceDataAttribute() {
        if( serviceDataAttribute == null ) {
            serviceDataAttribute = new EObjectContainmentEList< TServiceDataAttribute >( TServiceDataAttribute.class,
                    this, NsdPackage.TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE );
        }
        return serviceDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCdc() {
        return cdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCdc( String newCdc ) {
        String oldCdc = cdc;
        cdc = newCdc;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TSERVICE_CDC__CDC, oldCdc, cdc ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVariant() {
        return variant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariant( String newVariant ) {
        String oldVariant = variant;
        variant = newVariant;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TSERVICE_CDC__VARIANT, oldVariant, variant ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getServiceDataAttribute() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return getServiceDataAttribute();
        case NsdPackage.TSERVICE_CDC__CDC:
            return getCdc();
        case NsdPackage.TSERVICE_CDC__VARIANT:
            return getVariant();
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
        case NsdPackage.TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            getServiceDataAttribute().clear();
            getServiceDataAttribute().addAll( ( Collection< ? extends TServiceDataAttribute > ) newValue );
            return;
        case NsdPackage.TSERVICE_CDC__CDC:
            setCdc( ( String ) newValue );
            return;
        case NsdPackage.TSERVICE_CDC__VARIANT:
            setVariant( ( String ) newValue );
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
        case NsdPackage.TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            getServiceDataAttribute().clear();
            return;
        case NsdPackage.TSERVICE_CDC__CDC:
            setCdc( CDC_EDEFAULT );
            return;
        case NsdPackage.TSERVICE_CDC__VARIANT:
            setVariant( VARIANT_EDEFAULT );
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
        case NsdPackage.TSERVICE_CDC__SERVICE_DATA_ATTRIBUTE:
            return serviceDataAttribute != null && !serviceDataAttribute.isEmpty();
        case NsdPackage.TSERVICE_CDC__CDC:
            return CDC_EDEFAULT == null ? cdc != null : !CDC_EDEFAULT.equals( cdc );
        case NsdPackage.TSERVICE_CDC__VARIANT:
            return VARIANT_EDEFAULT == null ? variant != null : !VARIANT_EDEFAULT.equals( variant );
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
        result.append( " (cdc: " );
        result.append( cdc );
        result.append( ", variant: " );
        result.append( variant );
        result.append( ')' );
        return result.toString();
    }

} //TServiceCDCImpl
