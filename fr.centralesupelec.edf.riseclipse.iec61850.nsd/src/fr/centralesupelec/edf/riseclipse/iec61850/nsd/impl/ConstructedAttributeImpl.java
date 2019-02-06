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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute;

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
 * An implementation of the model object '<em><b>Constructed Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl#getSubDataAttribute <em>Sub Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl#getConstructedAttributes <em>Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ConstructedAttributeImpl#getServiceTypeRealizations <em>Service Type Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructedAttributeImpl extends TitledClassImpl implements ConstructedAttribute {
    /**
     * The cached value of the '{@link #getSubDataAttribute() <em>Sub Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< SubDataAttribute > subDataAttribute;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstructedAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.CONSTRUCTED_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubDataAttribute > getSubDataAttribute() {
        if( subDataAttribute == null ) {
            subDataAttribute = new EObjectContainmentWithInverseEList.Unsettable< SubDataAttribute >(
                    SubDataAttribute.class, this, NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE,
                    NsdPackage.SUB_DATA_ATTRIBUTE__CONSTRUCTED_ATTRIBUTE );
        }
        return subDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubDataAttribute() {
        if( subDataAttribute != null ) ( ( InternalEList.Unsettable< ? > ) subDataAttribute ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubDataAttribute() {
        return subDataAttribute != null && ( ( InternalEList.Unsettable< ? > ) subDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.CONSTRUCTED_ATTRIBUTE__NAME, oldName, name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.CONSTRUCTED_ATTRIBUTE__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttributes getConstructedAttributes() {
        if( eContainerFeatureID() != NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES ) return null;
        return ( ConstructedAttributes ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConstructedAttributes( ConstructedAttributes newConstructedAttributes,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newConstructedAttributes,
                NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstructedAttributes( ConstructedAttributes newConstructedAttributes ) {
        if( newConstructedAttributes != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES
                        && newConstructedAttributes != null ) ) {
            if( EcoreUtil.isAncestor( this, newConstructedAttributes ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newConstructedAttributes != null )
                msgs = ( ( InternalEObject ) newConstructedAttributes ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE, ConstructedAttributes.class, msgs );
            msgs = basicSetConstructedAttributes( newConstructedAttributes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES,
                        newConstructedAttributes, newConstructedAttributes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceTypeRealizations getServiceTypeRealizations() {
        if( eContainerFeatureID() != NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS ) return null;
        return ( ServiceTypeRealizations ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceTypeRealizations( ServiceTypeRealizations newServiceTypeRealizations,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newServiceTypeRealizations,
                NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceTypeRealizations( ServiceTypeRealizations newServiceTypeRealizations ) {
        if( newServiceTypeRealizations != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS
                        && newServiceTypeRealizations != null ) ) {
            if( EcoreUtil.isAncestor( this, newServiceTypeRealizations ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newServiceTypeRealizations != null )
                msgs = ( ( InternalEObject ) newServiceTypeRealizations ).eInverseAdd( this,
                        NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION, ServiceTypeRealizations.class,
                        msgs );
            msgs = basicSetServiceTypeRealizations( newServiceTypeRealizations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS, newServiceTypeRealizations,
                newServiceTypeRealizations ) );
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetConstructedAttributes( ( ConstructedAttributes ) otherEnd, msgs );
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetServiceTypeRealizations( ( ServiceTypeRealizations ) otherEnd, msgs );
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getSubDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            return basicSetConstructedAttributes( null, msgs );
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            return basicSetServiceTypeRealizations( null, msgs );
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.CONSTRUCTED_ATTRIBUTES__CONSTRUCTED_ATTRIBUTE,
                    ConstructedAttributes.class, msgs );
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            return eInternalContainer().eInverseRemove( this,
                    NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION, ServiceTypeRealizations.class,
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE:
            return getSubDataAttribute();
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__NAME:
            return getName();
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            return getConstructedAttributes();
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            return getServiceTypeRealizations();
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE:
            getSubDataAttribute().clear();
            getSubDataAttribute().addAll( ( Collection< ? extends SubDataAttribute > ) newValue );
            return;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            setConstructedAttributes( ( ConstructedAttributes ) newValue );
            return;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            setServiceTypeRealizations( ( ServiceTypeRealizations ) newValue );
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE:
            unsetSubDataAttribute();
            return;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__NAME:
            unsetName();
            return;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            setConstructedAttributes( ( ConstructedAttributes ) null );
            return;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            setServiceTypeRealizations( ( ServiceTypeRealizations ) null );
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
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE:
            return isSetSubDataAttribute();
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__NAME:
            return isSetName();
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__CONSTRUCTED_ATTRIBUTES:
            return getConstructedAttributes() != null;
        case NsdPackage.CONSTRUCTED_ATTRIBUTE__SERVICE_TYPE_REALIZATIONS:
            return getServiceTypeRealizations() != null;
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
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ConstructedAttributeImpl
