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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
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
 * An implementation of the model object '<em><b>Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl#getNS <em>NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl#getServiceNS <em>Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationsImpl extends NsdObjectImpl implements Abbreviations {
    /**
     * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected EList< Abbreviation > abbreviation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbbreviationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ABBREVIATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Abbreviation > getAbbreviation() {
        if( abbreviation == null ) {
            abbreviation = new EObjectContainmentWithInverseEList.Unsettable< Abbreviation >( Abbreviation.class, this,
                    NsdPackage.ABBREVIATIONS__ABBREVIATION, NsdPackage.ABBREVIATION__ABBREVIATIONS );
        }
        return abbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAbbreviation() {
        if( abbreviation != null ) ( ( InternalEList.Unsettable< ? > ) abbreviation ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAbbreviation() {
        return abbreviation != null && ( ( InternalEList.Unsettable< ? > ) abbreviation ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getNS() {
        if( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNS( NS newNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newNS, NsdPackage.ABBREVIATIONS__NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNS( NS newNS ) {
        if( newNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__NS && newNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newNS != null )
                msgs = ( ( InternalEObject ) newNS ).eInverseAdd( this, NsdPackage.NS__ABBREVIATIONS, NS.class, msgs );
            msgs = basicSetNS( newNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATIONS__NS, newNS, newNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getServiceNS() {
        if( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__SERVICE_NS ) return null;
        return ( ServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceNS( ServiceNS newServiceNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newServiceNS, NsdPackage.ABBREVIATIONS__SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceNS( ServiceNS newServiceNS ) {
        if( newServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__SERVICE_NS && newServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newServiceNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newServiceNS != null )
                msgs = ( ( InternalEObject ) newServiceNS ).eInverseAdd( this, NsdPackage.SERVICE_NS__ABBREVIATIONS,
                        ServiceNS.class, msgs );
            msgs = basicSetServiceNS( newServiceNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATIONS__SERVICE_NS, newServiceNS,
                    newServiceNS ) );
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAbbreviation() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ABBREVIATIONS__NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetNS( ( NS ) otherEnd, msgs );
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetServiceNS( ( ServiceNS ) otherEnd, msgs );
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return ( ( InternalEList< ? > ) getAbbreviation() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ABBREVIATIONS__NS:
            return basicSetNS( null, msgs );
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            return basicSetServiceNS( null, msgs );
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
        case NsdPackage.ABBREVIATIONS__NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__ABBREVIATIONS, NS.class, msgs );
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS__ABBREVIATIONS, ServiceNS.class,
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return getAbbreviation();
        case NsdPackage.ABBREVIATIONS__NS:
            return getNS();
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            return getServiceNS();
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            getAbbreviation().clear();
            getAbbreviation().addAll( ( Collection< ? extends Abbreviation > ) newValue );
            return;
        case NsdPackage.ABBREVIATIONS__NS:
            setNS( ( NS ) newValue );
            return;
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            setServiceNS( ( ServiceNS ) newValue );
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            unsetAbbreviation();
            return;
        case NsdPackage.ABBREVIATIONS__NS:
            setNS( ( NS ) null );
            return;
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            setServiceNS( ( ServiceNS ) null );
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return isSetAbbreviation();
        case NsdPackage.ABBREVIATIONS__NS:
            return getNS() != null;
        case NsdPackage.ABBREVIATIONS__SERVICE_NS:
            return getServiceNS() != null;
        }
        return super.eIsSet( featureID );
    }

} //AbbreviationsImpl
