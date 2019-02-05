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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#isCanHaveLOG <em>Can Have LOG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#isIsExtension <em>Is Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNClassImpl extends AnyLNClassImpl implements LNClass {
    /**
     * The default value of the '{@link #isCanHaveLOG() <em>Can Have LOG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCanHaveLOG()
     * @generated
     * @ordered
     */
    protected static final boolean CAN_HAVE_LOG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCanHaveLOG() <em>Can Have LOG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCanHaveLOG()
     * @generated
     * @ordered
     */
    protected boolean canHaveLOG = CAN_HAVE_LOG_EDEFAULT;

    /**
     * This is true if the Can Have LOG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean canHaveLOGESet;

    /**
     * The default value of the '{@link #isIsExtension() <em>Is Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExtension()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXTENSION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExtension() <em>Is Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExtension()
     * @generated
     * @ordered
     */
    protected boolean isExtension = IS_EXTENSION_EDEFAULT;

    /**
     * This is true if the Is Extension attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExtensionESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.LN_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCanHaveLOG() {
        return canHaveLOG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCanHaveLOG( boolean newCanHaveLOG ) {
        boolean oldCanHaveLOG = canHaveLOG;
        canHaveLOG = newCanHaveLOG;
        boolean oldCanHaveLOGESet = canHaveLOGESet;
        canHaveLOGESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.LN_CLASS__CAN_HAVE_LOG, oldCanHaveLOG, canHaveLOG, !oldCanHaveLOGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCanHaveLOG() {
        boolean oldCanHaveLOG = canHaveLOG;
        boolean oldCanHaveLOGESet = canHaveLOGESet;
        canHaveLOG = CAN_HAVE_LOG_EDEFAULT;
        canHaveLOGESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.LN_CLASS__CAN_HAVE_LOG, oldCanHaveLOG, CAN_HAVE_LOG_EDEFAULT, oldCanHaveLOGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCanHaveLOG() {
        return canHaveLOGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsExtension() {
        return isExtension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsExtension( boolean newIsExtension ) {
        boolean oldIsExtension = isExtension;
        isExtension = newIsExtension;
        boolean oldIsExtensionESet = isExtensionESet;
        isExtensionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.LN_CLASS__IS_EXTENSION, oldIsExtension, isExtension, !oldIsExtensionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsExtension() {
        boolean oldIsExtension = isExtension;
        boolean oldIsExtensionESet = isExtensionESet;
        isExtension = IS_EXTENSION_EDEFAULT;
        isExtensionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.LN_CLASS__IS_EXTENSION, oldIsExtension, IS_EXTENSION_EDEFAULT, oldIsExtensionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsExtension() {
        return isExtensionESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASS__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            return isCanHaveLOG();
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            return isIsExtension();
        case NsdPackage.LN_CLASS__NAME:
            return getName();
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            setCanHaveLOG( ( Boolean ) newValue );
            return;
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            setIsExtension( ( Boolean ) newValue );
            return;
        case NsdPackage.LN_CLASS__NAME:
            setName( ( String ) newValue );
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            unsetCanHaveLOG();
            return;
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            unsetIsExtension();
            return;
        case NsdPackage.LN_CLASS__NAME:
            setName( NAME_EDEFAULT );
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
        case NsdPackage.LN_CLASS__CAN_HAVE_LOG:
            return isSetCanHaveLOG();
        case NsdPackage.LN_CLASS__IS_EXTENSION:
            return isSetIsExtension();
        case NsdPackage.LN_CLASS__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
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
        result.append( " (canHaveLOG: " );
        if( canHaveLOGESet )
            result.append( canHaveLOG );
        else
            result.append( "<unset>" );
        result.append( ", isExtension: " );
        if( isExtensionESet )
            result.append( isExtension );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        result.append( name );
        result.append( ')' );
        return result.toString();
    }

} //LNClassImpl
