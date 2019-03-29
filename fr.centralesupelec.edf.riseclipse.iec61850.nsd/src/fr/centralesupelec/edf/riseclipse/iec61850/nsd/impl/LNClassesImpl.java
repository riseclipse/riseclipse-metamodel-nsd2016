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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

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
 * An implementation of the model object '<em><b>LN Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl#getAbstractLNClass <em>Abstract LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl#getLNClass <em>LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl#getNS <em>NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNClassesImpl extends NsdObjectImpl implements LNClasses {
    /**
     * The cached value of the '{@link #getAbstractLNClass() <em>Abstract LN Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbstractLNClass()
     * @generated
     * @ordered
     */
    protected EList< AbstractLNClass > abstractLNClass;

    /**
     * The cached value of the '{@link #getLNClass() <em>LN Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNClass()
     * @generated
     * @ordered
     */
    protected EList< LNClass > lNClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNClassesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.LN_CLASSES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AbstractLNClass > getAbstractLNClass() {
        if( abstractLNClass == null ) {
            abstractLNClass = new EObjectContainmentWithInverseEList.Unsettable< AbstractLNClass >(
                    AbstractLNClass.class, this, NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS,
                    NsdPackage.ABSTRACT_LN_CLASS__LN_CLASSES );
        }
        return abstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAbstractLNClass() {
        if( abstractLNClass != null ) ( ( InternalEList.Unsettable< ? > ) abstractLNClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAbstractLNClass() {
        return abstractLNClass != null && ( ( InternalEList.Unsettable< ? > ) abstractLNClass ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNClass > getLNClass() {
        if( lNClass == null ) {
            lNClass = new EObjectContainmentWithInverseEList.Unsettable< LNClass >( LNClass.class, this,
                    NsdPackage.LN_CLASSES__LN_CLASS, NsdPackage.LN_CLASS__LN_CLASSES );
        }
        return lNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNClass() {
        if( lNClass != null ) ( ( InternalEList.Unsettable< ? > ) lNClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNClass() {
        return lNClass != null && ( ( InternalEList.Unsettable< ? > ) lNClass ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getNS() {
        if( eContainerFeatureID() != NsdPackage.LN_CLASSES__NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNS( NS newNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newNS, NsdPackage.LN_CLASSES__NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNS( NS newNS ) {
        if( newNS != eInternalContainer() || ( eContainerFeatureID() != NsdPackage.LN_CLASSES__NS && newNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newNS != null )
                msgs = ( ( InternalEObject ) newNS ).eInverseAdd( this, NsdPackage.NS__LN_CLASSES, NS.class, msgs );
            msgs = basicSetNS( newNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASSES__NS, newNS, newNS ) );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAbstractLNClass() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNClass() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.LN_CLASSES__NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetNS( ( NS ) otherEnd, msgs );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return ( ( InternalEList< ? > ) getAbstractLNClass() ).basicRemove( otherEnd, msgs );
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return ( ( InternalEList< ? > ) getLNClass() ).basicRemove( otherEnd, msgs );
        case NsdPackage.LN_CLASSES__NS:
            return basicSetNS( null, msgs );
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
        case NsdPackage.LN_CLASSES__NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__LN_CLASSES, NS.class, msgs );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return getAbstractLNClass();
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return getLNClass();
        case NsdPackage.LN_CLASSES__NS:
            return getNS();
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            getAbstractLNClass().clear();
            getAbstractLNClass().addAll( ( Collection< ? extends AbstractLNClass > ) newValue );
            return;
        case NsdPackage.LN_CLASSES__LN_CLASS:
            getLNClass().clear();
            getLNClass().addAll( ( Collection< ? extends LNClass > ) newValue );
            return;
        case NsdPackage.LN_CLASSES__NS:
            setNS( ( NS ) newValue );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            unsetAbstractLNClass();
            return;
        case NsdPackage.LN_CLASSES__LN_CLASS:
            unsetLNClass();
            return;
        case NsdPackage.LN_CLASSES__NS:
            setNS( ( NS ) null );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return isSetAbstractLNClass();
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return isSetLNClass();
        case NsdPackage.LN_CLASSES__NS:
            return getNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //LNClassesImpl
