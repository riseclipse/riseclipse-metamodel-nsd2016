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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 * </ul>
 *
 * @generated
 */
public class LNClassesImpl extends MinimalEObjectImpl.Container implements LNClasses {
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
            abstractLNClass = new EObjectContainmentEList< AbstractLNClass >( AbstractLNClass.class, this,
                    NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS );
        }
        return abstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNClass > getLNClass() {
        if( lNClass == null ) {
            lNClass = new EObjectContainmentEList< LNClass >( LNClass.class, this, NsdPackage.LN_CLASSES__LN_CLASS );
        }
        return lNClass;
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return getAbstractLNClass();
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return getLNClass();
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
            getAbstractLNClass().clear();
            return;
        case NsdPackage.LN_CLASSES__LN_CLASS:
            getLNClass().clear();
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
            return abstractLNClass != null && !abstractLNClass.isEmpty();
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return lNClass != null && !lNClass.isEmpty();
        }
        return super.eIsSet( featureID );
    }

} //LNClassesImpl
