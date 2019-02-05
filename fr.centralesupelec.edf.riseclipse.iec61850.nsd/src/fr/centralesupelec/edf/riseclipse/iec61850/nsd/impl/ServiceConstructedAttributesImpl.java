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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes;

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
 * An implementation of the model object '<em><b>Service Constructed Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributesImpl#getServiceConstructedAttribute <em>Service Constructed Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConstructedAttributesImpl extends MinimalEObjectImpl.Container
        implements ServiceConstructedAttributes {
    /**
     * The cached value of the '{@link #getServiceConstructedAttribute() <em>Service Constructed Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceConstructedAttribute()
     * @generated
     * @ordered
     */
    protected EList< ServiceConstructedAttribute > serviceConstructedAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceConstructedAttributesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceConstructedAttribute > getServiceConstructedAttribute() {
        if( serviceConstructedAttribute == null ) {
            serviceConstructedAttribute = new EObjectContainmentEList< ServiceConstructedAttribute >(
                    ServiceConstructedAttribute.class, this,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE );
        }
        return serviceConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getServiceConstructedAttribute() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return getServiceConstructedAttribute();
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE:
            getServiceConstructedAttribute().clear();
            getServiceConstructedAttribute().addAll( ( Collection< ? extends ServiceConstructedAttribute > ) newValue );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE:
            getServiceConstructedAttribute().clear();
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return serviceConstructedAttribute != null && !serviceConstructedAttribute.isEmpty();
        }
        return super.eIsSet( featureID );
    }

} //ServiceConstructedAttributesImpl
