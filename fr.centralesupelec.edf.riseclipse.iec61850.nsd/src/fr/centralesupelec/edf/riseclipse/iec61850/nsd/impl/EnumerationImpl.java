/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getInheritedFrom <em>Inherited From</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getParentEnumerations <em>Parent Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getReferredByAttributeType <em>Referred By Attribute Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends TitledClassImpl implements Enumeration {
    /**
     * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLiteral()
     * @generated
     * @ordered
     */
    protected EList< Literal > literal;

    /**
     * The default value of the '{@link #getInheritedFrom() <em>Inherited From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritedFrom()
     * @generated
     * @ordered
     */
    protected static final String INHERITED_FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInheritedFrom() <em>Inherited From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInheritedFrom()
     * @generated
     * @ordered
     */
    protected String inheritedFrom = INHERITED_FROM_EDEFAULT;

    /**
     * This is true if the Inherited From attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inheritedFromESet;

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
     * The cached value of the '{@link #getRefersToBaseEnumeration() <em>Refers To Base Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToBaseEnumeration()
     * @generated
     * @ordered
     */
    protected Enumeration refersToBaseEnumeration;

    /**
     * This is true if the Refers To Base Enumeration reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToBaseEnumerationESet;

    /**
     * The cached value of the '{@link #getReferredByEnumerationAsBase() <em>Referred By Enumeration As Base</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByEnumerationAsBase()
     * @generated
     * @ordered
     */
    protected EList< Enumeration > referredByEnumerationAsBase;

    /**
     * The cached value of the '{@link #getReferredByAttributeType() <em>Referred By Attribute Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAttributeType()
     * @generated
     * @ordered
     */
    protected EList< AgAttributeType > referredByAttributeType;

    /**
     * The cached value of the '{@link #getReferredByUnderlyingType() <em>Referred By Underlying Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByUnderlyingType()
     * @generated
     * @ordered
     */
    protected EList< AgUnderlyingType > referredByUnderlyingType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ENUMERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Literal > getLiteral() {
        if( literal == null ) {
            literal = new EObjectContainmentWithInverseEList.Unsettable< Literal >( Literal.class, this,
                    NsdPackage.ENUMERATION__LITERAL, NsdPackage.LITERAL__PARENT_ENUMERATION );
        }
        return literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLiteral() {
        if( literal != null ) ( ( InternalEList.Unsettable< ? > ) literal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLiteral() {
        return literal != null && ( ( InternalEList.Unsettable< ? > ) literal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInheritedFrom() {
        return inheritedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInheritedFrom( String newInheritedFrom ) {
        String oldInheritedFrom = inheritedFrom;
        inheritedFrom = newInheritedFrom;
        boolean oldInheritedFromESet = inheritedFromESet;
        inheritedFromESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ENUMERATION__INHERITED_FROM,
                    oldInheritedFrom, inheritedFrom, !oldInheritedFromESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInheritedFrom() {
        String oldInheritedFrom = inheritedFrom;
        boolean oldInheritedFromESet = inheritedFromESet;
        inheritedFrom = INHERITED_FROM_EDEFAULT;
        inheritedFromESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ENUMERATION__INHERITED_FROM,
                    oldInheritedFrom, INHERITED_FROM_EDEFAULT, oldInheritedFromESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInheritedFrom() {
        return inheritedFromESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ENUMERATION__NAME, oldName, name,
                    !oldNameESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ENUMERATION__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
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
    public Enumerations getParentEnumerations() {
        if( eContainerFeatureID() != NsdPackage.ENUMERATION__PARENT_ENUMERATIONS ) return null;
        return ( Enumerations ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentEnumerations( Enumerations newParentEnumerations, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentEnumerations,
                NsdPackage.ENUMERATION__PARENT_ENUMERATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentEnumerations( Enumerations newParentEnumerations ) {
        if( newParentEnumerations != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ENUMERATION__PARENT_ENUMERATIONS
                        && newParentEnumerations != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentEnumerations ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentEnumerations != null )
                msgs = ( ( InternalEObject ) newParentEnumerations ).eInverseAdd( this,
                        NsdPackage.ENUMERATIONS__ENUMERATION, Enumerations.class, msgs );
            msgs = basicSetParentEnumerations( newParentEnumerations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ENUMERATION__PARENT_ENUMERATIONS,
                    newParentEnumerations, newParentEnumerations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration getRefersToBaseEnumeration() {
        return refersToBaseEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToBaseEnumeration( Enumeration newRefersToBaseEnumeration,
            NotificationChain msgs ) {
        Enumeration oldRefersToBaseEnumeration = refersToBaseEnumeration;
        refersToBaseEnumeration = newRefersToBaseEnumeration;
        boolean oldRefersToBaseEnumerationESet = refersToBaseEnumerationESet;
        refersToBaseEnumerationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION, oldRefersToBaseEnumeration,
                    newRefersToBaseEnumeration, !oldRefersToBaseEnumerationESet );
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
    public void setRefersToBaseEnumeration( Enumeration newRefersToBaseEnumeration ) {
        if( newRefersToBaseEnumeration != refersToBaseEnumeration ) {
            NotificationChain msgs = null;
            if( refersToBaseEnumeration != null )
                msgs = ( ( InternalEObject ) refersToBaseEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE, Enumeration.class, msgs );
            if( newRefersToBaseEnumeration != null )
                msgs = ( ( InternalEObject ) newRefersToBaseEnumeration ).eInverseAdd( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE, Enumeration.class, msgs );
            msgs = basicSetRefersToBaseEnumeration( newRefersToBaseEnumeration, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToBaseEnumerationESet = refersToBaseEnumerationESet;
            refersToBaseEnumerationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION, newRefersToBaseEnumeration,
                        newRefersToBaseEnumeration, !oldRefersToBaseEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToBaseEnumeration( NotificationChain msgs ) {
        Enumeration oldRefersToBaseEnumeration = refersToBaseEnumeration;
        refersToBaseEnumeration = null;
        boolean oldRefersToBaseEnumerationESet = refersToBaseEnumerationESet;
        refersToBaseEnumerationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION, oldRefersToBaseEnumeration, null,
                    oldRefersToBaseEnumerationESet );
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
    public void unsetRefersToBaseEnumeration() {
        if( refersToBaseEnumeration != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToBaseEnumeration ).eInverseRemove( this,
                    NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE, Enumeration.class, msgs );
            msgs = basicUnsetRefersToBaseEnumeration( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToBaseEnumerationESet = refersToBaseEnumerationESet;
            refersToBaseEnumerationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION, null, null,
                        oldRefersToBaseEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToBaseEnumeration() {
        return refersToBaseEnumerationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Enumeration > getReferredByEnumerationAsBase() {
        if( referredByEnumerationAsBase == null ) {
            referredByEnumerationAsBase = new EObjectWithInverseEList.Unsettable< Enumeration >( Enumeration.class,
                    this, NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE,
                    NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION );
        }
        return referredByEnumerationAsBase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByEnumerationAsBase() {
        if( referredByEnumerationAsBase != null )
            ( ( InternalEList.Unsettable< ? > ) referredByEnumerationAsBase ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByEnumerationAsBase() {
        return referredByEnumerationAsBase != null
                && ( ( InternalEList.Unsettable< ? > ) referredByEnumerationAsBase ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgAttributeType > getReferredByAttributeType() {
        if( referredByAttributeType == null ) {
            referredByAttributeType = new EObjectWithInverseEList.Unsettable< AgAttributeType >( AgAttributeType.class,
                    this, NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION );
        }
        return referredByAttributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAttributeType() {
        if( referredByAttributeType != null ) ( ( InternalEList.Unsettable< ? > ) referredByAttributeType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAttributeType() {
        return referredByAttributeType != null && ( ( InternalEList.Unsettable< ? > ) referredByAttributeType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgUnderlyingType > getReferredByUnderlyingType() {
        if( referredByUnderlyingType == null ) {
            referredByUnderlyingType = new EObjectWithInverseEList.Unsettable< AgUnderlyingType >(
                    AgUnderlyingType.class, this, NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION );
        }
        return referredByUnderlyingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByUnderlyingType() {
        if( referredByUnderlyingType != null ) ( ( InternalEList.Unsettable< ? > ) referredByUnderlyingType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByUnderlyingType() {
        return referredByUnderlyingType != null
                && ( ( InternalEList.Unsettable< ? > ) referredByUnderlyingType ).isSet();
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
        case NsdPackage.ENUMERATION__LITERAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLiteral() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentEnumerations( ( Enumerations ) otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            if( refersToBaseEnumeration != null )
                msgs = ( ( InternalEObject ) refersToBaseEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE, Enumeration.class, msgs );
            return basicSetRefersToBaseEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByEnumerationAsBase() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAttributeType() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByUnderlyingType() )
                    .basicAdd( otherEnd, msgs );
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
        case NsdPackage.ENUMERATION__LITERAL:
            return ( ( InternalEList< ? > ) getLiteral() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            return basicSetParentEnumerations( null, msgs );
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            return basicUnsetRefersToBaseEnumeration( msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return ( ( InternalEList< ? > ) getReferredByEnumerationAsBase() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE:
            return ( ( InternalEList< ? > ) getReferredByAttributeType() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE:
            return ( ( InternalEList< ? > ) getReferredByUnderlyingType() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.ENUMERATIONS__ENUMERATION, Enumerations.class,
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
        case NsdPackage.ENUMERATION__LITERAL:
            return getLiteral();
        case NsdPackage.ENUMERATION__INHERITED_FROM:
            return getInheritedFrom();
        case NsdPackage.ENUMERATION__NAME:
            return getName();
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            return getParentEnumerations();
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            return getRefersToBaseEnumeration();
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return getReferredByEnumerationAsBase();
        case NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE:
            return getReferredByAttributeType();
        case NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE:
            return getReferredByUnderlyingType();
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
        case NsdPackage.ENUMERATION__LITERAL:
            getLiteral().clear();
            getLiteral().addAll( ( Collection< ? extends Literal > ) newValue );
            return;
        case NsdPackage.ENUMERATION__INHERITED_FROM:
            setInheritedFrom( ( String ) newValue );
            return;
        case NsdPackage.ENUMERATION__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            setParentEnumerations( ( Enumerations ) newValue );
            return;
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            setRefersToBaseEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            getReferredByEnumerationAsBase().clear();
            getReferredByEnumerationAsBase().addAll( ( Collection< ? extends Enumeration > ) newValue );
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE:
            getReferredByAttributeType().clear();
            getReferredByAttributeType().addAll( ( Collection< ? extends AgAttributeType > ) newValue );
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE:
            getReferredByUnderlyingType().clear();
            getReferredByUnderlyingType().addAll( ( Collection< ? extends AgUnderlyingType > ) newValue );
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
        case NsdPackage.ENUMERATION__LITERAL:
            unsetLiteral();
            return;
        case NsdPackage.ENUMERATION__INHERITED_FROM:
            unsetInheritedFrom();
            return;
        case NsdPackage.ENUMERATION__NAME:
            unsetName();
            return;
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            setParentEnumerations( ( Enumerations ) null );
            return;
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            unsetRefersToBaseEnumeration();
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            unsetReferredByEnumerationAsBase();
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE:
            unsetReferredByAttributeType();
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE:
            unsetReferredByUnderlyingType();
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
        case NsdPackage.ENUMERATION__LITERAL:
            return isSetLiteral();
        case NsdPackage.ENUMERATION__INHERITED_FROM:
            return isSetInheritedFrom();
        case NsdPackage.ENUMERATION__NAME:
            return isSetName();
        case NsdPackage.ENUMERATION__PARENT_ENUMERATIONS:
            return getParentEnumerations() != null;
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            return isSetRefersToBaseEnumeration();
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return isSetReferredByEnumerationAsBase();
        case NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE:
            return isSetReferredByAttributeType();
        case NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE:
            return isSetReferredByUnderlyingType();
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
        result.append( " (inheritedFrom: " );
        if( inheritedFromESet )
            result.append( inheritedFrom );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    /* Implicit link
     *   Enumeration.inheritedFrom          -> Enumeration.name
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        String id = getNsIdentification().getId();
        NsdResourceSetImpl rs = getResourceSet();
        if( rs == null ) return false;

        String messagePrefix = "[NSD links] while resolving link from Enumeration (name: " + getName()
                + ", NS id: " + id + ", line: " + getLineNumber() + "): ";

        if( isSetInheritedFrom() ) {
            Enumeration foundBase = rs.findEnumeration( getInheritedFrom(), getNsIdentification(), console );
            if( foundBase == null ) {
                console.warning( messagePrefix + "Enumeration (name: " + getInheritedFrom() + ") not found" );
            }
            else {
                setRefersToBaseEnumeration( foundBase );
                console.info( "[NSD links] Enumeration (name: " + getInheritedFrom() + ") refers by Enumeration (name: "
                        + getName() + ") in NS (id:" + id + ") found in NS (id:"
                        + getRefersToBaseEnumeration().getParentEnumerations().getParentNS().getId() + ")" );
            }
        }

        return false;
    }

    @Override
    public NsIdentification getNsIdentification() {
        return new NsIdentification( getParentEnumerations().getParentNS() );
    }

} //EnumerationImpl
