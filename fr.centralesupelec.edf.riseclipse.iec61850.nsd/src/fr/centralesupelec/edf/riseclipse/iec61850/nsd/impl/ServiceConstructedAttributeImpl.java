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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Constructed Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl#isTypeKindParameterized <em>Type Kind Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceConstructedAttributeImpl#getServiceConstructedAttribute <em>Service Constructed Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConstructedAttributeImpl extends ConstructedAttributeImpl implements ServiceConstructedAttribute {
    /**
     * The default value of the '{@link #isTypeKindParameterized() <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTypeKindParameterized()
     * @generated
     * @ordered
     */
    protected static final boolean TYPE_KIND_PARAMETERIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTypeKindParameterized() <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTypeKindParameterized()
     * @generated
     * @ordered
     */
    protected boolean typeKindParameterized = TYPE_KIND_PARAMETERIZED_EDEFAULT;

    /**
     * This is true if the Type Kind Parameterized attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeKindParameterizedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceConstructedAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_CONSTRUCTED_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isTypeKindParameterized() {
        return typeKindParameterized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTypeKindParameterized( boolean newTypeKindParameterized ) {
        boolean oldTypeKindParameterized = typeKindParameterized;
        typeKindParameterized = newTypeKindParameterized;
        boolean oldTypeKindParameterizedESet = typeKindParameterizedESet;
        typeKindParameterizedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED, oldTypeKindParameterized,
                    typeKindParameterized, !oldTypeKindParameterizedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTypeKindParameterized() {
        boolean oldTypeKindParameterized = typeKindParameterized;
        boolean oldTypeKindParameterizedESet = typeKindParameterizedESet;
        typeKindParameterized = TYPE_KIND_PARAMETERIZED_EDEFAULT;
        typeKindParameterizedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED, oldTypeKindParameterized,
                    TYPE_KIND_PARAMETERIZED_EDEFAULT, oldTypeKindParameterizedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTypeKindParameterized() {
        return typeKindParameterizedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceConstructedAttributes getServiceConstructedAttribute() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE )
            return null;
        return ( ServiceConstructedAttributes ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceConstructedAttribute(
            ServiceConstructedAttributes newServiceConstructedAttribute, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newServiceConstructedAttribute,
                NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceConstructedAttribute( ServiceConstructedAttributes newServiceConstructedAttribute ) {
        if( newServiceConstructedAttribute != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE
                        && newServiceConstructedAttribute != null ) ) {
            if( EcoreUtil.isAncestor( this, newServiceConstructedAttribute ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newServiceConstructedAttribute != null )
                msgs = ( ( InternalEObject ) newServiceConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE,
                        ServiceConstructedAttributes.class, msgs );
            msgs = basicSetServiceConstructedAttribute( newServiceConstructedAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE,
                    newServiceConstructedAttribute, newServiceConstructedAttribute ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetServiceConstructedAttribute( ( ServiceConstructedAttributes ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return basicSetServiceConstructedAttribute( null, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return eInternalContainer().eInverseRemove( this,
                    NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTES__SERVICE_CONSTRUCTED_ATTRIBUTE,
                    ServiceConstructedAttributes.class, msgs );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            return isTypeKindParameterized();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return getServiceConstructedAttribute();
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            setTypeKindParameterized( ( Boolean ) newValue );
            return;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            setServiceConstructedAttribute( ( ServiceConstructedAttributes ) newValue );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            unsetTypeKindParameterized();
            return;
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            setServiceConstructedAttribute( ( ServiceConstructedAttributes ) null );
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
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__TYPE_KIND_PARAMETERIZED:
            return isSetTypeKindParameterized();
        case NsdPackage.SERVICE_CONSTRUCTED_ATTRIBUTE__SERVICE_CONSTRUCTED_ATTRIBUTE:
            return getServiceConstructedAttribute() != null;
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
        result.append( " (typeKindParameterized: " );
        if( typeKindParameterizedESet )
            result.append( typeKindParameterized );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceConstructedAttributeImpl
