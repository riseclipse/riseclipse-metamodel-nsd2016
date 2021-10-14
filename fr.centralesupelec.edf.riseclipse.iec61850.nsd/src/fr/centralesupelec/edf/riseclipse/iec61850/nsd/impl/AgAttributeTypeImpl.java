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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl#getRefersToBasicType <em>Refers To Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgAttributeTypeImpl#getRefersToEnumeration <em>Refers To Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgAttributeTypeImpl extends MinimalEObjectImpl.Container implements AgAttributeType {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getTypeKind() <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeKind()
     * @generated
     * @ordered
     */
    protected static final Enumerator TYPE_KIND_EDEFAULT = ( Enumerator ) NsdFactory.eINSTANCE
            .createFromString( NsdPackage.eINSTANCE.getAttributeTypeKind(), "BASIC" );

    /**
     * The cached value of the '{@link #getTypeKind() <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeKind()
     * @generated
     * @ordered
     */
    protected Enumerator typeKind = TYPE_KIND_EDEFAULT;

    /**
     * This is true if the Type Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeKindESet;

    /**
     * The cached value of the '{@link #getRefersToBasicType() <em>Refers To Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToBasicType()
     * @generated
     * @ordered
     */
    protected BasicType refersToBasicType;

    /**
     * This is true if the Refers To Basic Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToBasicTypeESet;

    /**
     * The cached value of the '{@link #getRefersToConstructedAttribute() <em>Refers To Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToConstructedAttribute()
     * @generated
     * @ordered
     */
    protected ConstructedAttribute refersToConstructedAttribute;

    /**
     * This is true if the Refers To Constructed Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToConstructedAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToEnumeration() <em>Refers To Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToEnumeration()
     * @generated
     * @ordered
     */
    protected Enumeration refersToEnumeration;

    /**
     * This is true if the Refers To Enumeration reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToEnumerationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgAttributeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_ATTRIBUTE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_ATTRIBUTE_TYPE__TYPE, oldType, type,
                    !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_ATTRIBUTE_TYPE__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumerator getTypeKind() {
        return typeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTypeKind( Enumerator newTypeKind ) {
        Enumerator oldTypeKind = typeKind;
        typeKind = newTypeKind;
        boolean oldTypeKindESet = typeKindESet;
        typeKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND,
                    oldTypeKind, typeKind, !oldTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTypeKind() {
        Enumerator oldTypeKind = typeKind;
        boolean oldTypeKindESet = typeKindESet;
        typeKind = TYPE_KIND_EDEFAULT;
        typeKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND,
                    oldTypeKind, TYPE_KIND_EDEFAULT, oldTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTypeKind() {
        return typeKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicType getRefersToBasicType() {
        return refersToBasicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToBasicType( BasicType newRefersToBasicType, NotificationChain msgs ) {
        BasicType oldRefersToBasicType = refersToBasicType;
        refersToBasicType = newRefersToBasicType;
        boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
        refersToBasicTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, newRefersToBasicType,
                    !oldRefersToBasicTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToBasicType( BasicType newRefersToBasicType ) {
        if( newRefersToBasicType != refersToBasicType ) {
            NotificationChain msgs = null;
            if( refersToBasicType != null )
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            if( newRefersToBasicType != null )
                msgs = ( ( InternalEObject ) newRefersToBasicType ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            msgs = basicSetRefersToBasicType( newRefersToBasicType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
            refersToBasicTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE, newRefersToBasicType, newRefersToBasicType,
                        !oldRefersToBasicTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToBasicType( NotificationChain msgs ) {
        BasicType oldRefersToBasicType = refersToBasicType;
        refersToBasicType = null;
        boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
        refersToBasicTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, null,
                    oldRefersToBasicTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToBasicType() {
        if( refersToBasicType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                    NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            msgs = basicUnsetRefersToBasicType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
            refersToBasicTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE, null, null, oldRefersToBasicTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToBasicType() {
        return refersToBasicTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttribute getRefersToConstructedAttribute() {
        return refersToConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToConstructedAttribute( ConstructedAttribute newRefersToConstructedAttribute,
            NotificationChain msgs ) {
        ConstructedAttribute oldRefersToConstructedAttribute = refersToConstructedAttribute;
        refersToConstructedAttribute = newRefersToConstructedAttribute;
        boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
        refersToConstructedAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
                    newRefersToConstructedAttribute, !oldRefersToConstructedAttributeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToConstructedAttribute( ConstructedAttribute newRefersToConstructedAttribute ) {
        if( newRefersToConstructedAttribute != refersToConstructedAttribute ) {
            NotificationChain msgs = null;
            if( refersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            if( newRefersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) newRefersToConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            msgs = basicSetRefersToConstructedAttribute( newRefersToConstructedAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
            refersToConstructedAttributeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, newRefersToConstructedAttribute,
                        newRefersToConstructedAttribute, !oldRefersToConstructedAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToConstructedAttribute( NotificationChain msgs ) {
        ConstructedAttribute oldRefersToConstructedAttribute = refersToConstructedAttribute;
        refersToConstructedAttribute = null;
        boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
        refersToConstructedAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
                    null, oldRefersToConstructedAttributeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToConstructedAttribute() {
        if( refersToConstructedAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                    NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class, msgs );
            msgs = basicUnsetRefersToConstructedAttribute( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
            refersToConstructedAttributeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, null, null,
                        oldRefersToConstructedAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToConstructedAttribute() {
        return refersToConstructedAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration getRefersToEnumeration() {
        return refersToEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToEnumeration( Enumeration newRefersToEnumeration, NotificationChain msgs ) {
        Enumeration oldRefersToEnumeration = refersToEnumeration;
        refersToEnumeration = newRefersToEnumeration;
        boolean oldRefersToEnumerationESet = refersToEnumerationESet;
        refersToEnumerationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION, oldRefersToEnumeration, newRefersToEnumeration,
                    !oldRefersToEnumerationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToEnumeration( Enumeration newRefersToEnumeration ) {
        if( newRefersToEnumeration != refersToEnumeration ) {
            NotificationChain msgs = null;
            if( refersToEnumeration != null )
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            if( newRefersToEnumeration != null )
                msgs = ( ( InternalEObject ) newRefersToEnumeration ).eInverseAdd( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            msgs = basicSetRefersToEnumeration( newRefersToEnumeration, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToEnumerationESet = refersToEnumerationESet;
            refersToEnumerationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION, newRefersToEnumeration,
                        newRefersToEnumeration, !oldRefersToEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToEnumeration( NotificationChain msgs ) {
        Enumeration oldRefersToEnumeration = refersToEnumeration;
        refersToEnumeration = null;
        boolean oldRefersToEnumerationESet = refersToEnumerationESet;
        refersToEnumerationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION, oldRefersToEnumeration, null,
                    oldRefersToEnumerationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToEnumeration() {
        if( refersToEnumeration != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                    NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            msgs = basicUnsetRefersToEnumeration( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToEnumerationESet = refersToEnumerationESet;
            refersToEnumerationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION, null, null, oldRefersToEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToEnumeration() {
        return refersToEnumerationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
            if( refersToBasicType != null )
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            return basicSetRefersToBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            if( refersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            return basicSetRefersToConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
            if( refersToEnumeration != null )
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            return basicSetRefersToEnumeration( ( Enumeration ) otherEnd, msgs );
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
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
            return basicUnsetRefersToBasicType( msgs );
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToConstructedAttribute( msgs );
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
            return basicUnsetRefersToEnumeration( msgs );
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
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
            return getType();
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
            return getTypeKind();
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
            return getRefersToBasicType();
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return getRefersToConstructedAttribute();
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
            return getRefersToEnumeration();
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
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
            setTypeKind( ( Enumerator ) newValue );
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
            setRefersToBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            setRefersToConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
            setRefersToEnumeration( ( Enumeration ) newValue );
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
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
            unsetType();
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
            unsetTypeKind();
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
            unsetRefersToBasicType();
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToConstructedAttribute();
            return;
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
            unsetRefersToEnumeration();
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
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
            return isSetType();
        case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
            return isSetTypeKind();
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
            return isSetRefersToBasicType();
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToConstructedAttribute();
        case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
            return isSetRefersToEnumeration();
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
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", typeKind: " );
        if( typeKindESet )
            result.append( typeKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgAttributeTypeImpl
