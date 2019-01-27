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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TDefinedAttributeTypeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TData Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getDsPresCond <em>Ds Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getDsPresCondArgs <em>Ds Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TDataObjectImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDataObjectImpl extends TDocumentedClassImpl implements TDataObject {
    /**
     * The default value of the '{@link #getDsPresCond() <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCond()
     * @generated
     * @ordered
     */
    protected static final String DS_PRES_COND_EDEFAULT = "M";

    /**
     * The cached value of the '{@link #getDsPresCond() <em>Ds Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCond()
     * @generated
     * @ordered
     */
    protected String dsPresCond = DS_PRES_COND_EDEFAULT;

    /**
     * This is true if the Ds Pres Cond attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dsPresCondESet;

    /**
     * The default value of the '{@link #getDsPresCondArgs() <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgs()
     * @generated
     * @ordered
     */
    protected static final String DS_PRES_COND_ARGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDsPresCondArgs() <em>Ds Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgs()
     * @generated
     * @ordered
     */
    protected String dsPresCondArgs = DS_PRES_COND_ARGS_EDEFAULT;

    /**
     * The default value of the '{@link #getDsPresCondArgsID() <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgsID()
     * @generated
     * @ordered
     */
    protected static final String DS_PRES_COND_ARGS_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDsPresCondArgsID() <em>Ds Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDsPresCondArgsID()
     * @generated
     * @ordered
     */
    protected String dsPresCondArgsID = DS_PRES_COND_ARGS_ID_EDEFAULT;

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
     * The default value of the '{@link #getPresCond() <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresCond()
     * @generated
     * @ordered
     */
    protected static final String PRES_COND_EDEFAULT = "M";

    /**
     * The cached value of the '{@link #getPresCond() <em>Pres Cond</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresCond()
     * @generated
     * @ordered
     */
    protected String presCond = PRES_COND_EDEFAULT;

    /**
     * This is true if the Pres Cond attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean presCondESet;

    /**
     * The default value of the '{@link #getPresCondArgs() <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresCondArgs()
     * @generated
     * @ordered
     */
    protected static final String PRES_COND_ARGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPresCondArgs() <em>Pres Cond Args</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresCondArgs()
     * @generated
     * @ordered
     */
    protected String presCondArgs = PRES_COND_ARGS_EDEFAULT;

    /**
     * The default value of the '{@link #getPresCondArgsID() <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresCondArgsID()
     * @generated
     * @ordered
     */
    protected static final String PRES_COND_ARGS_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPresCondArgsID() <em>Pres Cond Args ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresCondArgsID()
     * @generated
     * @ordered
     */
    protected String presCondArgsID = PRES_COND_ARGS_ID_EDEFAULT;

    /**
     * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransient()
     * @generated
     * @ordered
     */
    protected static final boolean TRANSIENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTransient()
     * @generated
     * @ordered
     */
    protected boolean transient_ = TRANSIENT_EDEFAULT;

    /**
     * This is true if the Transient attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transientESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingType()
     * @generated
     * @ordered
     */
    protected static final String UNDERLYING_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingType()
     * @generated
     * @ordered
     */
    protected String underlyingType = UNDERLYING_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getUnderlyingTypeKind() <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingTypeKind()
     * @generated
     * @ordered
     */
    protected static final TDefinedAttributeTypeKind UNDERLYING_TYPE_KIND_EDEFAULT = TDefinedAttributeTypeKind.BASIC;

    /**
     * The cached value of the '{@link #getUnderlyingTypeKind() <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingTypeKind()
     * @generated
     * @ordered
     */
    protected TDefinedAttributeTypeKind underlyingTypeKind = UNDERLYING_TYPE_KIND_EDEFAULT;

    /**
     * This is true if the Underlying Type Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underlyingTypeKindESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDataObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TDATA_OBJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsPresCond() {
        return dsPresCond;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsPresCond( String newDsPresCond ) {
        String oldDsPresCond = dsPresCond;
        dsPresCond = newDsPresCond;
        boolean oldDsPresCondESet = dsPresCondESet;
        dsPresCondESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__DS_PRES_COND, oldDsPresCond, dsPresCond, !oldDsPresCondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDsPresCond() {
        String oldDsPresCond = dsPresCond;
        boolean oldDsPresCondESet = dsPresCondESet;
        dsPresCond = DS_PRES_COND_EDEFAULT;
        dsPresCondESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.TDATA_OBJECT__DS_PRES_COND, oldDsPresCond, DS_PRES_COND_EDEFAULT, oldDsPresCondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDsPresCond() {
        return dsPresCondESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsPresCondArgs() {
        return dsPresCondArgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsPresCondArgs( String newDsPresCondArgs ) {
        String oldDsPresCondArgs = dsPresCondArgs;
        dsPresCondArgs = newDsPresCondArgs;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS, oldDsPresCondArgs, dsPresCondArgs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDsPresCondArgsID() {
        return dsPresCondArgsID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDsPresCondArgsID( String newDsPresCondArgsID ) {
        String oldDsPresCondArgsID = dsPresCondArgsID;
        dsPresCondArgsID = newDsPresCondArgsID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS_ID, oldDsPresCondArgsID, dsPresCondArgsID ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TDATA_OBJECT__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPresCond() {
        return presCond;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPresCond( String newPresCond ) {
        String oldPresCond = presCond;
        presCond = newPresCond;
        boolean oldPresCondESet = presCondESet;
        presCondESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__PRES_COND, oldPresCond, presCond, !oldPresCondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPresCond() {
        String oldPresCond = presCond;
        boolean oldPresCondESet = presCondESet;
        presCond = PRES_COND_EDEFAULT;
        presCondESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.TDATA_OBJECT__PRES_COND, oldPresCond, PRES_COND_EDEFAULT, oldPresCondESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPresCond() {
        return presCondESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPresCondArgs() {
        return presCondArgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPresCondArgs( String newPresCondArgs ) {
        String oldPresCondArgs = presCondArgs;
        presCondArgs = newPresCondArgs;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__PRES_COND_ARGS, oldPresCondArgs, presCondArgs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPresCondArgsID() {
        return presCondArgsID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPresCondArgsID( String newPresCondArgsID ) {
        String oldPresCondArgsID = presCondArgsID;
        presCondArgsID = newPresCondArgsID;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__PRES_COND_ARGS_ID, oldPresCondArgsID, presCondArgsID ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isTransient() {
        return transient_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransient( boolean newTransient ) {
        boolean oldTransient = transient_;
        transient_ = newTransient;
        boolean oldTransientESet = transientESet;
        transientESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__TRANSIENT, oldTransient, transient_, !oldTransientESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransient() {
        boolean oldTransient = transient_;
        boolean oldTransientESet = transientESet;
        transient_ = TRANSIENT_EDEFAULT;
        transientESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.TDATA_OBJECT__TRANSIENT, oldTransient, TRANSIENT_EDEFAULT, oldTransientESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransient() {
        return transientESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TDATA_OBJECT__TYPE, oldType, type ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUnderlyingType() {
        return underlyingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnderlyingType( String newUnderlyingType ) {
        String oldUnderlyingType = underlyingType;
        underlyingType = newUnderlyingType;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE, oldUnderlyingType, underlyingType ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TDefinedAttributeTypeKind getUnderlyingTypeKind() {
        return underlyingTypeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnderlyingTypeKind( TDefinedAttributeTypeKind newUnderlyingTypeKind ) {
        TDefinedAttributeTypeKind oldUnderlyingTypeKind = underlyingTypeKind;
        underlyingTypeKind = newUnderlyingTypeKind == null ? UNDERLYING_TYPE_KIND_EDEFAULT : newUnderlyingTypeKind;
        boolean oldUnderlyingTypeKindESet = underlyingTypeKindESet;
        underlyingTypeKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE_KIND,
                    oldUnderlyingTypeKind, underlyingTypeKind, !oldUnderlyingTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnderlyingTypeKind() {
        TDefinedAttributeTypeKind oldUnderlyingTypeKind = underlyingTypeKind;
        boolean oldUnderlyingTypeKindESet = underlyingTypeKindESet;
        underlyingTypeKind = UNDERLYING_TYPE_KIND_EDEFAULT;
        underlyingTypeKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE_KIND,
                    oldUnderlyingTypeKind, UNDERLYING_TYPE_KIND_EDEFAULT, oldUnderlyingTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderlyingTypeKind() {
        return underlyingTypeKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND:
            return getDsPresCond();
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS:
            return getDsPresCondArgs();
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS_ID:
            return getDsPresCondArgsID();
        case NsdPackage.TDATA_OBJECT__NAME:
            return getName();
        case NsdPackage.TDATA_OBJECT__PRES_COND:
            return getPresCond();
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.TDATA_OBJECT__TRANSIENT:
            return isTransient();
        case NsdPackage.TDATA_OBJECT__TYPE:
            return getType();
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
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
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND:
            setDsPresCond( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS:
            setDsPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS_ID:
            setDsPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__TRANSIENT:
            setTransient( ( Boolean ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( TDefinedAttributeTypeKind ) newValue );
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
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND:
            unsetDsPresCond();
            return;
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS:
            setDsPresCondArgs( DS_PRES_COND_ARGS_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS_ID:
            setDsPresCondArgsID( DS_PRES_COND_ARGS_ID_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__NAME:
            setName( NAME_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS:
            setPresCondArgs( PRES_COND_ARGS_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS_ID:
            setPresCondArgsID( PRES_COND_ARGS_ID_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__TRANSIENT:
            unsetTransient();
            return;
        case NsdPackage.TDATA_OBJECT__TYPE:
            setType( TYPE_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE:
            setUnderlyingType( UNDERLYING_TYPE_EDEFAULT );
            return;
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
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
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND:
            return isSetDsPresCond();
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS:
            return DS_PRES_COND_ARGS_EDEFAULT == null ? dsPresCondArgs != null
                    : !DS_PRES_COND_ARGS_EDEFAULT.equals( dsPresCondArgs );
        case NsdPackage.TDATA_OBJECT__DS_PRES_COND_ARGS_ID:
            return DS_PRES_COND_ARGS_ID_EDEFAULT == null ? dsPresCondArgsID != null
                    : !DS_PRES_COND_ARGS_ID_EDEFAULT.equals( dsPresCondArgsID );
        case NsdPackage.TDATA_OBJECT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case NsdPackage.TDATA_OBJECT__PRES_COND:
            return isSetPresCond();
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS:
            return PRES_COND_ARGS_EDEFAULT == null ? presCondArgs != null
                    : !PRES_COND_ARGS_EDEFAULT.equals( presCondArgs );
        case NsdPackage.TDATA_OBJECT__PRES_COND_ARGS_ID:
            return PRES_COND_ARGS_ID_EDEFAULT == null ? presCondArgsID != null
                    : !PRES_COND_ARGS_ID_EDEFAULT.equals( presCondArgsID );
        case NsdPackage.TDATA_OBJECT__TRANSIENT:
            return isSetTransient();
        case NsdPackage.TDATA_OBJECT__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals( type );
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE:
            return UNDERLYING_TYPE_EDEFAULT == null ? underlyingType != null
                    : !UNDERLYING_TYPE_EDEFAULT.equals( underlyingType );
        case NsdPackage.TDATA_OBJECT__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
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
        result.append( " (dsPresCond: " );
        if( dsPresCondESet )
            result.append( dsPresCond );
        else
            result.append( "<unset>" );
        result.append( ", dsPresCondArgs: " );
        result.append( dsPresCondArgs );
        result.append( ", dsPresCondArgsID: " );
        result.append( dsPresCondArgsID );
        result.append( ", name: " );
        result.append( name );
        result.append( ", presCond: " );
        if( presCondESet )
            result.append( presCond );
        else
            result.append( "<unset>" );
        result.append( ", presCondArgs: " );
        result.append( presCondArgs );
        result.append( ", presCondArgsID: " );
        result.append( presCondArgsID );
        result.append( ", transient: " );
        if( transientESet )
            result.append( transient_ );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        result.append( type );
        result.append( ", underlyingType: " );
        result.append( underlyingType );
        result.append( ", underlyingTypeKind: " );
        if( underlyingTypeKindESet )
            result.append( underlyingTypeKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TDataObjectImpl
