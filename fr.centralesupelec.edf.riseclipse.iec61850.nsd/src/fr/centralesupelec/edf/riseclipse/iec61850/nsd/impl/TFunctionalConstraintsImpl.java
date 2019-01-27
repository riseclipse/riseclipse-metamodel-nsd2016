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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints;

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
 * An implementation of the model object '<em><b>TFunctional Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TFunctionalConstraintsImpl#getFunctionalConstraint <em>Functional Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionalConstraintsImpl extends MinimalEObjectImpl.Container implements TFunctionalConstraints {
    /**
     * The cached value of the '{@link #getFunctionalConstraint() <em>Functional Constraint</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalConstraint()
     * @generated
     * @ordered
     */
    protected EList< TFunctionalConstraint > functionalConstraint;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TFunctionalConstraintsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TFUNCTIONAL_CONSTRAINTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TFunctionalConstraint > getFunctionalConstraint() {
        if( functionalConstraint == null ) {
            functionalConstraint = new EObjectContainmentEList< TFunctionalConstraint >( TFunctionalConstraint.class,
                    this, NsdPackage.TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT );
        }
        return functionalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return ( ( InternalEList< ? > ) getFunctionalConstraint() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return getFunctionalConstraint();
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            getFunctionalConstraint().clear();
            getFunctionalConstraint().addAll( ( Collection< ? extends TFunctionalConstraint > ) newValue );
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            getFunctionalConstraint().clear();
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
        case NsdPackage.TFUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return functionalConstraint != null && !functionalConstraint.isEmpty();
        }
        return super.eIsSet( featureID );
    }

} //TFunctionalConstraintsImpl
