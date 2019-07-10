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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ag Trg Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl#isDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl#isDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AgTrgOpImpl#isQchg <em>Qchg</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AgTrgOpImpl extends MinimalEObjectImpl.Container implements AgTrgOp {
    /**
     * The default value of the '{@link #isDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDchg()
     * @generated
     * @ordered
     */
    protected static final boolean DCHG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDchg()
     * @generated
     * @ordered
     */
    protected boolean dchg = DCHG_EDEFAULT;

    /**
     * This is true if the Dchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dchgESet;

    /**
     * The default value of the '{@link #isDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDupd()
     * @generated
     * @ordered
     */
    protected static final boolean DUPD_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDupd()
     * @generated
     * @ordered
     */
    protected boolean dupd = DUPD_EDEFAULT;

    /**
     * This is true if the Dupd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dupdESet;

    /**
     * The default value of the '{@link #isQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isQchg()
     * @generated
     * @ordered
     */
    protected static final boolean QCHG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isQchg()
     * @generated
     * @ordered
     */
    protected boolean qchg = QCHG_EDEFAULT;

    /**
     * This is true if the Qchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qchgESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgTrgOpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.AG_TRG_OP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isDchg() {
        return dchg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDchg( boolean newDchg ) {
        boolean oldDchg = dchg;
        dchg = newDchg;
        boolean oldDchgESet = dchgESet;
        dchgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_TRG_OP__DCHG, oldDchg, dchg,
                    !oldDchgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDchg() {
        boolean oldDchg = dchg;
        boolean oldDchgESet = dchgESet;
        dchg = DCHG_EDEFAULT;
        dchgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_TRG_OP__DCHG, oldDchg,
                    DCHG_EDEFAULT, oldDchgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDchg() {
        return dchgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isDupd() {
        return dupd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDupd( boolean newDupd ) {
        boolean oldDupd = dupd;
        dupd = newDupd;
        boolean oldDupdESet = dupdESet;
        dupdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_TRG_OP__DUPD, oldDupd, dupd,
                    !oldDupdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDupd() {
        boolean oldDupd = dupd;
        boolean oldDupdESet = dupdESet;
        dupd = DUPD_EDEFAULT;
        dupdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_TRG_OP__DUPD, oldDupd,
                    DUPD_EDEFAULT, oldDupdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDupd() {
        return dupdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isQchg() {
        return qchg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQchg( boolean newQchg ) {
        boolean oldQchg = qchg;
        qchg = newQchg;
        boolean oldQchgESet = qchgESet;
        qchgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.AG_TRG_OP__QCHG, oldQchg, qchg,
                    !oldQchgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQchg() {
        boolean oldQchg = qchg;
        boolean oldQchgESet = qchgESet;
        qchg = QCHG_EDEFAULT;
        qchgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.AG_TRG_OP__QCHG, oldQchg,
                    QCHG_EDEFAULT, oldQchgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQchg() {
        return qchgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.AG_TRG_OP__DCHG:
            return isDchg();
        case NsdPackage.AG_TRG_OP__DUPD:
            return isDupd();
        case NsdPackage.AG_TRG_OP__QCHG:
            return isQchg();
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
        case NsdPackage.AG_TRG_OP__DCHG:
            setDchg( ( Boolean ) newValue );
            return;
        case NsdPackage.AG_TRG_OP__DUPD:
            setDupd( ( Boolean ) newValue );
            return;
        case NsdPackage.AG_TRG_OP__QCHG:
            setQchg( ( Boolean ) newValue );
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
        case NsdPackage.AG_TRG_OP__DCHG:
            unsetDchg();
            return;
        case NsdPackage.AG_TRG_OP__DUPD:
            unsetDupd();
            return;
        case NsdPackage.AG_TRG_OP__QCHG:
            unsetQchg();
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
        case NsdPackage.AG_TRG_OP__DCHG:
            return isSetDchg();
        case NsdPackage.AG_TRG_OP__DUPD:
            return isSetDupd();
        case NsdPackage.AG_TRG_OP__QCHG:
            return isSetQchg();
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
        result.append( " (dchg: " );
        if( dchgESet )
            result.append( dchg );
        else
            result.append( "<unset>" );
        result.append( ", dupd: " );
        if( dupdESet )
            result.append( dupd );
        else
            result.append( "<unset>" );
        result.append( ", qchg: " );
        if( qchgESet )
            result.append( qchg );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgTrgOpImpl
