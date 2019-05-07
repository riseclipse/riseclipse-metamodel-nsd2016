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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getParentBasicTypes <em>Parent Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getReferredByDataAttribute <em>Referred By Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getRefersToDoc <em>Refers To Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicTypeImpl extends NsdObjectImpl implements BasicType {
    /**
     * The default value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected static final String DESC_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected String descID = DESC_ID_EDEFAULT;

    /**
     * This is true if the Desc ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descIDESet;

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
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getReferredByDataAttribute() <em>Referred By Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< DataAttribute > referredByDataAttribute;

    /**
     * The cached value of the '{@link #getRefersToDoc() <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDoc;

    /**
     * This is true if the Refers To Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDocESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.BASIC_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescID() {
        return descID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescID( String newDescID ) {
        String oldDescID = descID;
        descID = newDescID;
        boolean oldDescIDESet = descIDESet;
        descIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__DESC_ID, oldDescID, descID,
                    !oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescID() {
        String oldDescID = descID;
        boolean oldDescIDESet = descIDESet;
        descID = DESC_ID_EDEFAULT;
        descIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.BASIC_TYPE__DESC_ID, oldDescID,
                    DESC_ID_EDEFAULT, oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescID() {
        return descIDESet;
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
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__NAME, oldName, name,
                    !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.BASIC_TYPE__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicTypes getParentBasicTypes() {
        if( eContainerFeatureID() != NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES ) return null;
        return ( BasicTypes ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBasicTypes( BasicTypes newParentBasicTypes, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBasicTypes, NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBasicTypes( BasicTypes newParentBasicTypes ) {
        if( newParentBasicTypes != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES
                        && newParentBasicTypes != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBasicTypes ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentBasicTypes != null )
                msgs = ( ( InternalEObject ) newParentBasicTypes ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPES__BASIC_TYPE, BasicTypes.class, msgs );
            msgs = basicSetParentBasicTypes( newParentBasicTypes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES,
                    newParentBasicTypes, newParentBasicTypes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataAttribute > getReferredByDataAttribute() {
        if( referredByDataAttribute == null ) {
            referredByDataAttribute = new EObjectWithInverseEList.Unsettable< DataAttribute >( DataAttribute.class,
                    this, NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE );
        }
        return referredByDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataAttribute() {
        if( referredByDataAttribute != null ) ( ( InternalEList.Unsettable< ? > ) referredByDataAttribute ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataAttribute() {
        return referredByDataAttribute != null && ( ( InternalEList.Unsettable< ? > ) referredByDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDoc() {
        return refersToDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDoc( Doc newRefersToDoc, NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = newRefersToDoc;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.BASIC_TYPE__REFERS_TO_DOC, oldRefersToDoc, newRefersToDoc, !oldRefersToDocESet );
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
    public void setRefersToDoc( Doc newRefersToDoc ) {
        if( newRefersToDoc != refersToDoc ) {
            NotificationChain msgs = null;
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                        Doc.class, msgs );
            if( newRefersToDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDoc ).eInverseAdd( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                        Doc.class, msgs );
            msgs = basicSetRefersToDoc( newRefersToDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__REFERS_TO_DOC,
                        newRefersToDoc, newRefersToDoc, !oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDoc( NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = null;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.BASIC_TYPE__REFERS_TO_DOC, oldRefersToDoc, null, oldRefersToDocESet );
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
    public void unsetRefersToDoc() {
        if( refersToDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                    Doc.class, msgs );
            msgs = basicUnsetRefersToDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.BASIC_TYPE__REFERS_TO_DOC, null,
                        null, oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDoc() {
        return refersToDocESet;
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
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentBasicTypes( ( BasicTypes ) otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                        Doc.class, msgs );
            return basicSetRefersToDoc( ( Doc ) otherEnd, msgs );
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
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return basicSetParentBasicTypes( null, msgs );
        case NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredByDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            return basicUnsetRefersToDoc( msgs );
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
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.BASIC_TYPES__BASIC_TYPE, BasicTypes.class,
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            return getDescID();
        case NsdPackage.BASIC_TYPE__NAME:
            return getName();
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return getParentBasicTypes();
        case NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE:
            return getReferredByDataAttribute();
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            return getRefersToDoc();
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            setParentBasicTypes( ( BasicTypes ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE:
            getReferredByDataAttribute().clear();
            getReferredByDataAttribute().addAll( ( Collection< ? extends DataAttribute > ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            setRefersToDoc( ( Doc ) newValue );
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.BASIC_TYPE__NAME:
            unsetName();
            return;
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            setParentBasicTypes( ( BasicTypes ) null );
            return;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE:
            unsetReferredByDataAttribute();
            return;
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            unsetRefersToDoc();
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            return isSetDescID();
        case NsdPackage.BASIC_TYPE__NAME:
            return isSetName();
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return getParentBasicTypes() != null;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_DATA_ATTRIBUTE:
            return isSetReferredByDataAttribute();
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            return isSetRefersToDoc();
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
        result.append( " (descID: " );
        if( descIDESet )
            result.append( descID );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;
        
        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = (( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getDescID() );
                if( doc != null ) setRefersToDoc( doc );
            }
        }

        return false;
    }

} //BasicTypeImpl
