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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CopyrightNotice;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Copyrighted;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copyrighted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CopyrightedImpl#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyrightedImpl extends MinimalEObjectImpl.Container implements Copyrighted {
    /**
     * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCopyright()
     * @generated
     * @ordered
     */
    protected CopyrightNotice copyright;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CopyrightedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.COPYRIGHTED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CopyrightNotice getCopyright() {
        return copyright;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCopyright( CopyrightNotice newCopyright, NotificationChain msgs ) {
        CopyrightNotice oldCopyright = copyright;
        copyright = newCopyright;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.COPYRIGHTED__COPYRIGHT, oldCopyright, newCopyright );
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
    public void setCopyright( CopyrightNotice newCopyright ) {
        if( newCopyright != copyright ) {
            NotificationChain msgs = null;
            if( copyright != null ) msgs = ( ( InternalEObject ) copyright ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHTED__COPYRIGHT, null, msgs );
            if( newCopyright != null ) msgs = ( ( InternalEObject ) newCopyright ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.COPYRIGHTED__COPYRIGHT, null, msgs );
            msgs = basicSetCopyright( newCopyright, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.COPYRIGHTED__COPYRIGHT, newCopyright, newCopyright ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.COPYRIGHTED__COPYRIGHT:
            return basicSetCopyright( null, msgs );
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
        case NsdPackage.COPYRIGHTED__COPYRIGHT:
            return getCopyright();
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
        case NsdPackage.COPYRIGHTED__COPYRIGHT:
            setCopyright( ( CopyrightNotice ) newValue );
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
        case NsdPackage.COPYRIGHTED__COPYRIGHT:
            setCopyright( ( CopyrightNotice ) null );
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
        case NsdPackage.COPYRIGHTED__COPYRIGHT:
            return copyright != null;
        }
        return super.eIsSet( featureID );
    }

} //CopyrightedImpl
