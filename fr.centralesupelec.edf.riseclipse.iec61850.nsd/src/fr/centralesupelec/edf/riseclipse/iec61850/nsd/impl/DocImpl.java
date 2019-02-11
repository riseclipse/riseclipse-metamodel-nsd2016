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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getNSDoc <em>NS Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocImpl extends MinimalEObjectImpl.Container implements Doc {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * This is true if the Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DOC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getMixed() {
        if( mixed == null ) {
            mixed = new BasicFeatureMap( this, NsdPackage.DOC__MIXED );
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getGroup() {
        return ( FeatureMap ) getMixed().< FeatureMap.Entry > list( NsdPackage.Literals.DOC__GROUP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getAny() {
        return ( FeatureMap ) getGroup().< FeatureMap.Entry > list( NsdPackage.Literals.DOC__ANY );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId( String newId ) {
        String oldId = id;
        id = newId;
        boolean oldIdESet = idESet;
        idESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOC__ID, oldId, id, !oldIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetId() {
        String oldId = id;
        boolean oldIdESet = idESet;
        id = ID_EDEFAULT;
        idESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, NsdPackage.DOC__ID, oldId, ID_EDEFAULT, oldIdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetId() {
        return idESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NSDoc getNSDoc() {
        if( eContainerFeatureID() != NsdPackage.DOC__NS_DOC ) return null;
        return ( NSDoc ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNSDoc( NSDoc newNSDoc, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newNSDoc, NsdPackage.DOC__NS_DOC, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNSDoc( NSDoc newNSDoc ) {
        if( newNSDoc != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.DOC__NS_DOC && newNSDoc != null ) ) {
            if( EcoreUtil.isAncestor( this, newNSDoc ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newNSDoc != null )
                msgs = ( ( InternalEObject ) newNSDoc ).eInverseAdd( this, NsdPackage.NS_DOC__DOC, NSDoc.class, msgs );
            msgs = basicSetNSDoc( newNSDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOC__NS_DOC, newNSDoc, newNSDoc ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DOC__NS_DOC:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetNSDoc( ( NSDoc ) otherEnd, msgs );
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
        case NsdPackage.DOC__MIXED:
            return ( ( InternalEList< ? > ) getMixed() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__GROUP:
            return ( ( InternalEList< ? > ) getGroup() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__ANY:
            return ( ( InternalEList< ? > ) getAny() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__NS_DOC:
            return basicSetNSDoc( null, msgs );
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
        case NsdPackage.DOC__NS_DOC:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS_DOC__DOC, NSDoc.class, msgs );
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
        case NsdPackage.DOC__MIXED:
            if( coreType ) return getMixed();
            return ( ( FeatureMap.Internal ) getMixed() ).getWrapper();
        case NsdPackage.DOC__GROUP:
            if( coreType ) return getGroup();
            return ( ( FeatureMap.Internal ) getGroup() ).getWrapper();
        case NsdPackage.DOC__ANY:
            if( coreType ) return getAny();
            return ( ( FeatureMap.Internal ) getAny() ).getWrapper();
        case NsdPackage.DOC__ID:
            return getId();
        case NsdPackage.DOC__NS_DOC:
            return getNSDoc();
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
        case NsdPackage.DOC__MIXED:
            ( ( FeatureMap.Internal ) getMixed() ).set( newValue );
            return;
        case NsdPackage.DOC__GROUP:
            ( ( FeatureMap.Internal ) getGroup() ).set( newValue );
            return;
        case NsdPackage.DOC__ANY:
            ( ( FeatureMap.Internal ) getAny() ).set( newValue );
            return;
        case NsdPackage.DOC__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.DOC__NS_DOC:
            setNSDoc( ( NSDoc ) newValue );
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
        case NsdPackage.DOC__MIXED:
            getMixed().clear();
            return;
        case NsdPackage.DOC__GROUP:
            getGroup().clear();
            return;
        case NsdPackage.DOC__ANY:
            getAny().clear();
            return;
        case NsdPackage.DOC__ID:
            unsetId();
            return;
        case NsdPackage.DOC__NS_DOC:
            setNSDoc( ( NSDoc ) null );
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
        case NsdPackage.DOC__MIXED:
            return mixed != null && !mixed.isEmpty();
        case NsdPackage.DOC__GROUP:
            return !getGroup().isEmpty();
        case NsdPackage.DOC__ANY:
            return !getAny().isEmpty();
        case NsdPackage.DOC__ID:
            return isSetId();
        case NsdPackage.DOC__NS_DOC:
            return getNSDoc() != null;
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
        result.append( " (mixed: " );
        result.append( mixed );
        result.append( ", id: " );
        if( idESet )
            result.append( id );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DocImpl
