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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any LN Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnyLNClassImpl extends TitledClassImpl implements AnyLNClass {
    /**
     * The cached value of the '{@link #getDataObject() <em>Data Object</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataObject()
     * @generated
     * @ordered
     */
    protected EList< DataObject > dataObject;

    /**
     * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected static final String BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected String base = BASE_EDEFAULT;

    /**
     * This is true if the Base attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseESet;

    /**
     * The cached value of the '{@link #getRefersToAbstractLNClass() <em>Refers To Abstract LN Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractLNClass()
     * @generated
     * @ordered
     */
    protected AbstractLNClass refersToAbstractLNClass;

    /**
     * This is true if the Refers To Abstract LN Class reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAbstractLNClassESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnyLNClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ANY_LN_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataObject > getDataObject() {
        if( dataObject == null ) {
            dataObject = new EObjectContainmentWithInverseEList.Unsettable< DataObject >( DataObject.class, this,
                    NsdPackage.ANY_LN_CLASS__DATA_OBJECT, NsdPackage.DATA_OBJECT__ANY_LN_CLASS );
        }
        return dataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataObject() {
        if( dataObject != null ) ( ( InternalEList.Unsettable< ? > ) dataObject ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataObject() {
        return dataObject != null && ( ( InternalEList.Unsettable< ? > ) dataObject ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBase( String newBase ) {
        String oldBase = base;
        base = newBase;
        boolean oldBaseESet = baseESet;
        baseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.ANY_LN_CLASS__BASE, oldBase, base, !oldBaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBase() {
        String oldBase = base;
        boolean oldBaseESet = baseESet;
        base = BASE_EDEFAULT;
        baseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.ANY_LN_CLASS__BASE, oldBase, BASE_EDEFAULT, oldBaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBase() {
        return baseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractLNClass getRefersToAbstractLNClass() {
        return refersToAbstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAbstractLNClass( AbstractLNClass newRefersToAbstractLNClass,
            NotificationChain msgs ) {
        AbstractLNClass oldRefersToAbstractLNClass = refersToAbstractLNClass;
        refersToAbstractLNClass = newRefersToAbstractLNClass;
        boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
        refersToAbstractLNClassESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, oldRefersToAbstractLNClass,
                    newRefersToAbstractLNClass, !oldRefersToAbstractLNClassESet );
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
    public void setRefersToAbstractLNClass( AbstractLNClass newRefersToAbstractLNClass ) {
        if( newRefersToAbstractLNClass != refersToAbstractLNClass ) {
            NotificationChain msgs = null;
            if( refersToAbstractLNClass != null )
                msgs = ( ( InternalEObject ) refersToAbstractLNClass ).eInverseRemove( this,
                        NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            if( newRefersToAbstractLNClass != null )
                msgs = ( ( InternalEObject ) newRefersToAbstractLNClass ).eInverseAdd( this,
                        NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            msgs = basicSetRefersToAbstractLNClass( newRefersToAbstractLNClass, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
            refersToAbstractLNClassESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS,
                            newRefersToAbstractLNClass, newRefersToAbstractLNClass, !oldRefersToAbstractLNClassESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAbstractLNClass( NotificationChain msgs ) {
        AbstractLNClass oldRefersToAbstractLNClass = refersToAbstractLNClass;
        refersToAbstractLNClass = null;
        boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
        refersToAbstractLNClassESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, oldRefersToAbstractLNClass, null,
                    oldRefersToAbstractLNClassESet );
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
    public void unsetRefersToAbstractLNClass() {
        if( refersToAbstractLNClass != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAbstractLNClass ).eInverseRemove( this,
                    NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            msgs = basicUnsetRefersToAbstractLNClass( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
            refersToAbstractLNClassESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, null, null,
                    oldRefersToAbstractLNClassESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractLNClass() {
        return refersToAbstractLNClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getName() {
        // TODO: use a RiseClipseException ?
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public LNClasses getLNClasses() {
        // TODO: use a RiseClipseException ?
        throw new UnsupportedOperationException();
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDataObject() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            if( refersToAbstractLNClass != null )
                msgs = ( ( InternalEObject ) refersToAbstractLNClass ).eInverseRemove( this,
                        NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            return basicSetRefersToAbstractLNClass( ( AbstractLNClass ) otherEnd, msgs );
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return ( ( InternalEList< ? > ) getDataObject() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            return basicUnsetRefersToAbstractLNClass( msgs );
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return getDataObject();
        case NsdPackage.ANY_LN_CLASS__BASE:
            return getBase();
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            return getRefersToAbstractLNClass();
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            getDataObject().clear();
            getDataObject().addAll( ( Collection< ? extends DataObject > ) newValue );
            return;
        case NsdPackage.ANY_LN_CLASS__BASE:
            setBase( ( String ) newValue );
            return;
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            setRefersToAbstractLNClass( ( AbstractLNClass ) newValue );
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            unsetDataObject();
            return;
        case NsdPackage.ANY_LN_CLASS__BASE:
            unsetBase();
            return;
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            unsetRefersToAbstractLNClass();
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return isSetDataObject();
        case NsdPackage.ANY_LN_CLASS__BASE:
            return isSetBase();
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            return isSetRefersToAbstractLNClass();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case NsdPackage.ANY_LN_CLASS___GET_NAME:
            return getName();
        case NsdPackage.ANY_LN_CLASS___GET_LN_CLASSES:
            return getLNClasses();
        }
        return super.eInvoke( operationID, arguments );
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
        result.append( " (base: " );
        if( baseESet )
            result.append( base );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    /* Implicit link
     *   AnyLNClass.base                    -> AbstractLNClass  
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        if( super.buildExplicitLinks( console ) ) return true;
        if( !isSetBase() ) return false;

        // This code assumes that the referred AbstractLNClass is in the same NS
        // TODO: check that it is right
        LNClasses lNClasses = ( LNClasses ) eContainer();
        EList< AbstractLNClass > l = lNClasses.getAbstractLNClass();
        setRefersToAbstractLNClass( l.stream()
                .filter( abstractLNClass -> abstractLNClass.getName().equals( getBase() ) ).findAny().orElse( null ) );
        if( getRefersToAbstractLNClass() == null ) {
            console.error( "AbstractLNClass (name: " + getBase() + ") refers by AnyLNClass (name: " + getName()
                    + ") in NS (id:" + lNClasses.getNS().getId() + ") is unknown" );
        }
        else {
            console.info( "AbstractLNClass (name: " + getBase() + ") refers by AnyLNClass (name: " + getName()
                    + ") in NS (id:" + lNClasses.getNS().getId() + ") found in NS (id:"
                    + getRefersToAbstractLNClass().getLNClasses().getNS().getId() + ")" );
        }
        return false;
    }

} //AnyLNClassImpl
