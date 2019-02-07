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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract LN Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl#getLNClasses <em>LN Classes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbstractLNClassImpl#getReferredByAnyLNClass <em>Referred By Any LN Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractLNClassImpl extends AnyLNClassImpl implements AbstractLNClass {
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
     * The cached value of the '{@link #getReferredByAnyLNClass() <em>Referred By Any LN Class</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAnyLNClass()
     * @generated
     * @ordered
     */
    protected EList< AnyLNClass > referredByAnyLNClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractLNClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ABSTRACT_LN_CLASS;
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
                NsdPackage.ABSTRACT_LN_CLASS__NAME, oldName, name, !oldNameESet ) );
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
                NsdPackage.ABSTRACT_LN_CLASS__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
    public LNClasses getLNClasses() {
        if( eContainerFeatureID() != NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES ) return null;
        return ( LNClasses ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLNClasses( LNClasses newLNClasses, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newLNClasses, NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLNClasses( LNClasses newLNClasses ) {
        if( newLNClasses != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES && newLNClasses != null ) ) {
            if( EcoreUtil.isAncestor( this, newLNClasses ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newLNClasses != null ) msgs = ( ( InternalEObject ) newLNClasses ).eInverseAdd( this,
                    NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS, LNClasses.class, msgs );
            msgs = basicSetLNClasses( newLNClasses, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES, newLNClasses, newLNClasses ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnyLNClass > getReferredByAnyLNClass() {
        if( referredByAnyLNClass == null ) {
            referredByAnyLNClass = new EObjectWithInverseResolvingEList.Unsettable< AnyLNClass >( AnyLNClass.class,
                    this, NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS );
        }
        return referredByAnyLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAnyLNClass() {
        if( referredByAnyLNClass != null ) ( ( InternalEList.Unsettable< ? > ) referredByAnyLNClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAnyLNClass() {
        return referredByAnyLNClass != null && ( ( InternalEList.Unsettable< ? > ) referredByAnyLNClass ).isSet();
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
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetLNClasses( ( LNClasses ) otherEnd, msgs );
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAnyLNClass() )
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
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            return basicSetLNClasses( null, msgs );
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return ( ( InternalEList< ? > ) getReferredByAnyLNClass() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS, LNClasses.class,
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            return getName();
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            return getLNClasses();
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return getReferredByAnyLNClass();
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            setLNClasses( ( LNClasses ) newValue );
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            getReferredByAnyLNClass().clear();
            getReferredByAnyLNClass().addAll( ( Collection< ? extends AnyLNClass > ) newValue );
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            unsetName();
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            setLNClasses( ( LNClasses ) null );
            return;
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            unsetReferredByAnyLNClass();
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
        case NsdPackage.ABSTRACT_LN_CLASS__NAME:
            return isSetName();
        case NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES:
            return getLNClasses() != null;
        case NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS:
            return isSetReferredByAnyLNClass();
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

} //AbstractLNClassImpl
