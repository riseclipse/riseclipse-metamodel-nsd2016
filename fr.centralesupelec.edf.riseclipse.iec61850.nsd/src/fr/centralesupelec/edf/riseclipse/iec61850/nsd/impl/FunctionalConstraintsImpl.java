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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
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
 * An implementation of the model object '<em><b>Functional Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl#getFunctionalConstraint <em>Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.FunctionalConstraintsImpl#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalConstraintsImpl extends NsdObjectImpl implements FunctionalConstraints {
    /**
     * The cached value of the '{@link #getFunctionalConstraint() <em>Functional Constraint</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalConstraint()
     * @generated
     * @ordered
     */
    protected EList< FunctionalConstraint > functionalConstraint;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionalConstraintsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.FUNCTIONAL_CONSTRAINTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalConstraint > getFunctionalConstraint() {
        if( functionalConstraint == null ) {
            functionalConstraint = new EObjectContainmentWithInverseEList.Unsettable< FunctionalConstraint >(
                    FunctionalConstraint.class, this, NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__PARENT_FUNCTIONAL_CONSTRAINTS );
        }
        return functionalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionalConstraint() {
        if( functionalConstraint != null ) ( ( InternalEList.Unsettable< ? > ) functionalConstraint ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionalConstraint() {
        return functionalConstraint != null && ( ( InternalEList.Unsettable< ? > ) functionalConstraint ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getParentNS() {
        if( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNS( NS newParentNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNS, NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentNS( NS newParentNS ) {
        if( newParentNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS && newParentNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentNS != null )
                msgs = ( ( InternalEObject ) newParentNS ).eInverseAdd( this, NsdPackage.NS__FUNCTIONAL_CONSTRAINTS,
                        NS.class, msgs );
            msgs = basicSetParentNS( newParentNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS,
                    newParentNS, newParentNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getParentServiceNS() {
        if( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS ) return null;
        return ( ServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceNS( ServiceNS newParentServiceNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceNS,
                NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceNS( ServiceNS newParentServiceNS ) {
        if( newParentServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS
                        && newParentServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServiceNS != null )
                msgs = ( ( InternalEObject ) newParentServiceNS ).eInverseAdd( this,
                        NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, ServiceNS.class, msgs );
            msgs = basicSetParentServiceNS( newParentServiceNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS, newParentServiceNS, newParentServiceNS ) );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionalConstraint() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentNS( ( NS ) otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServiceNS( ( ServiceNS ) otherEnd, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return ( ( InternalEList< ? > ) getFunctionalConstraint() ).basicRemove( otherEnd, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            return basicSetParentNS( null, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            return basicSetParentServiceNS( null, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, NS.class, msgs );
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS,
                    ServiceNS.class, msgs );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return getFunctionalConstraint();
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            return getParentNS();
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            return getParentServiceNS();
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            getFunctionalConstraint().clear();
            getFunctionalConstraint().addAll( ( Collection< ? extends FunctionalConstraint > ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            setParentNS( ( NS ) newValue );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            setParentServiceNS( ( ServiceNS ) newValue );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            unsetFunctionalConstraint();
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            setParentNS( ( NS ) null );
            return;
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            setParentServiceNS( ( ServiceNS ) null );
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
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__FUNCTIONAL_CONSTRAINT:
            return isSetFunctionalConstraint();
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS:
            return getParentNS() != null;
        case NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_SERVICE_NS:
            return getParentServiceNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //FunctionalConstraintsImpl
