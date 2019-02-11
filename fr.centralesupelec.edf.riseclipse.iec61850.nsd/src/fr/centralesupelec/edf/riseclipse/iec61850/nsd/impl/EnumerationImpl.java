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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Literal;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getRefersToBaseEnumeration <em>Refers To Base Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.EnumerationImpl#getReferredByEnumerationAsBase <em>Referred By Enumeration As Base</em>}</li>
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
                    NsdPackage.ENUMERATION__LITERAL, NsdPackage.LITERAL__ENUMERATION );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.ENUMERATION__INHERITED_FROM, oldInheritedFrom, inheritedFrom, !oldInheritedFromESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.ENUMERATION__NAME, oldName, name, !oldNameESet ) );
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
                NsdPackage.ENUMERATION__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
    public Enumerations getEnumerations() {
        if( eContainerFeatureID() != NsdPackage.ENUMERATION__ENUMERATIONS ) return null;
        return ( Enumerations ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnumerations( Enumerations newEnumerations, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newEnumerations, NsdPackage.ENUMERATION__ENUMERATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnumerations( Enumerations newEnumerations ) {
        if( newEnumerations != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ENUMERATION__ENUMERATIONS && newEnumerations != null ) ) {
            if( EcoreUtil.isAncestor( this, newEnumerations ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newEnumerations != null ) msgs = ( ( InternalEObject ) newEnumerations ).eInverseAdd( this,
                    NsdPackage.ENUMERATIONS__ENUMERATION, Enumerations.class, msgs );
            msgs = basicSetEnumerations( newEnumerations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.ENUMERATION__ENUMERATIONS, newEnumerations, newEnumerations ) );
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
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION,
                            newRefersToBaseEnumeration, newRefersToBaseEnumeration, !oldRefersToBaseEnumerationESet ) );
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
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION, null, null, oldRefersToBaseEnumerationESet ) );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.ENUMERATION__LITERAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLiteral() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ENUMERATION__ENUMERATIONS:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetEnumerations( ( Enumerations ) otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            if( refersToBaseEnumeration != null )
                msgs = ( ( InternalEObject ) refersToBaseEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE, Enumeration.class, msgs );
            return basicSetRefersToBaseEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByEnumerationAsBase() )
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
        case NsdPackage.ENUMERATION__ENUMERATIONS:
            return basicSetEnumerations( null, msgs );
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            return basicUnsetRefersToBaseEnumeration( msgs );
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return ( ( InternalEList< ? > ) getReferredByEnumerationAsBase() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.ENUMERATION__ENUMERATIONS:
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
        case NsdPackage.ENUMERATION__ENUMERATIONS:
            return getEnumerations();
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            return getRefersToBaseEnumeration();
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return getReferredByEnumerationAsBase();
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
        case NsdPackage.ENUMERATION__ENUMERATIONS:
            setEnumerations( ( Enumerations ) newValue );
            return;
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            setRefersToBaseEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            getReferredByEnumerationAsBase().clear();
            getReferredByEnumerationAsBase().addAll( ( Collection< ? extends Enumeration > ) newValue );
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
        case NsdPackage.ENUMERATION__ENUMERATIONS:
            setEnumerations( ( Enumerations ) null );
            return;
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            unsetRefersToBaseEnumeration();
            return;
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            unsetReferredByEnumerationAsBase();
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
        case NsdPackage.ENUMERATION__ENUMERATIONS:
            return getEnumerations() != null;
        case NsdPackage.ENUMERATION__REFERS_TO_BASE_ENUMERATION:
            return isSetRefersToBaseEnumeration();
        case NsdPackage.ENUMERATION__REFERRED_BY_ENUMERATION_AS_BASE:
            return isSetReferredByEnumerationAsBase();
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
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        if( super.buildExplicitLinks( console ) ) return true;

        if( isSetInheritedFrom() ) {
            setRefersToBaseEnumeration( getEnumerations().getNS().findEnumeration( getInheritedFrom(), console ) );
            if( getRefersToBaseEnumeration() == null ) {
                console.error( "Enumeration (name: " + getInheritedFrom() + ") refers by Enumeration (name: "
                        + getName() + ") in NS (id:" + getEnumerations().getNS().getId() + ") is unknown" );
            }
            else {
                console.verbose( "Enumeration (name: " + getInheritedFrom() + ") refers by Enumeration (name: " + getName()
                        + ") in NS (id:" + getEnumerations().getNS().getId() + ") found in NS (id:"
                        + getRefersToBaseEnumeration().getEnumerations().getNS().getId() + ")" );
            }
        }

        return false;
    }

} //EnumerationImpl
