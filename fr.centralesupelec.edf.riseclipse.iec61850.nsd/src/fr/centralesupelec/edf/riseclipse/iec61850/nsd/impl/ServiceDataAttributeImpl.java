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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getServiceCDC <em>Service CDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDataAttributeImpl extends DocumentedClassImpl implements ServiceDataAttribute {
    /**
     * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated
     * @ordered
     */
    protected static final String FC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated
     * @ordered
     */
    protected String fc = FC_EDEFAULT;

    /**
     * This is true if the Fc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fcESet;

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
     * This is true if the Pres Cond Args attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean presCondArgsESet;

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
     * This is true if the Pres Cond Args ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean presCondArgsIDESet;

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
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getTypeKind() <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeKind()
     * @generated
     * @ordered
     */
    protected static final Enumerator TYPE_KIND_EDEFAULT = ( Enumerator ) NsdFactory.eINSTANCE
            .createFromString( NsdPackage.eINSTANCE.getAttributeTypeKind(), "BASIC" );

    /**
     * The cached value of the '{@link #getTypeKind() <em>Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeKind()
     * @generated
     * @ordered
     */
    protected Enumerator typeKind = TYPE_KIND_EDEFAULT;

    /**
     * This is true if the Type Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeKindESet;

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
     * This is true if the Underlying Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underlyingTypeESet;

    /**
     * The default value of the '{@link #getUnderlyingTypeKind() <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingTypeKind()
     * @generated
     * @ordered
     */
    protected static final DefinedAttributeTypeKind UNDERLYING_TYPE_KIND_EDEFAULT = DefinedAttributeTypeKind.BASIC;

    /**
     * The cached value of the '{@link #getUnderlyingTypeKind() <em>Underlying Type Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderlyingTypeKind()
     * @generated
     * @ordered
     */
    protected DefinedAttributeTypeKind underlyingTypeKind = UNDERLYING_TYPE_KIND_EDEFAULT;

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
    protected ServiceDataAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_DATA_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFc() {
        return fc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFc( String newFc ) {
        String oldFc = fc;
        fc = newFc;
        boolean oldFcESet = fcESet;
        fcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__FC, oldFc, fc, !oldFcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFc() {
        String oldFc = fc;
        boolean oldFcESet = fcESet;
        fc = FC_EDEFAULT;
        fcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__FC, oldFc, FC_EDEFAULT, oldFcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFc() {
        return fcESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME, oldName, name, !oldNameESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
                NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND, oldPresCond, presCond, !oldPresCondESet ) );
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
                NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND, oldPresCond, PRES_COND_EDEFAULT, oldPresCondESet ) );
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
        boolean oldPresCondArgsESet = presCondArgsESet;
        presCondArgsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS,
                    oldPresCondArgs, presCondArgs, !oldPresCondArgsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPresCondArgs() {
        String oldPresCondArgs = presCondArgs;
        boolean oldPresCondArgsESet = presCondArgsESet;
        presCondArgs = PRES_COND_ARGS_EDEFAULT;
        presCondArgsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS,
                    oldPresCondArgs, PRES_COND_ARGS_EDEFAULT, oldPresCondArgsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPresCondArgs() {
        return presCondArgsESet;
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
        boolean oldPresCondArgsIDESet = presCondArgsIDESet;
        presCondArgsIDESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID,
                        oldPresCondArgsID, presCondArgsID, !oldPresCondArgsIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPresCondArgsID() {
        String oldPresCondArgsID = presCondArgsID;
        boolean oldPresCondArgsIDESet = presCondArgsIDESet;
        presCondArgsID = PRES_COND_ARGS_ID_EDEFAULT;
        presCondArgsIDESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID,
                        oldPresCondArgsID, PRES_COND_ARGS_ID_EDEFAULT, oldPresCondArgsIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPresCondArgsID() {
        return presCondArgsIDESet;
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
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumerator getTypeKind() {
        return typeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTypeKind( Enumerator newTypeKind ) {
        Enumerator oldTypeKind = typeKind;
        typeKind = newTypeKind;
        boolean oldTypeKindESet = typeKindESet;
        typeKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND, oldTypeKind, typeKind, !oldTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTypeKind() {
        Enumerator oldTypeKind = typeKind;
        boolean oldTypeKindESet = typeKindESet;
        typeKind = TYPE_KIND_EDEFAULT;
        typeKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND, oldTypeKind, TYPE_KIND_EDEFAULT, oldTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTypeKind() {
        return typeKindESet;
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
        boolean oldUnderlyingTypeESet = underlyingTypeESet;
        underlyingTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE,
                    oldUnderlyingType, underlyingType, !oldUnderlyingTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnderlyingType() {
        String oldUnderlyingType = underlyingType;
        boolean oldUnderlyingTypeESet = underlyingTypeESet;
        underlyingType = UNDERLYING_TYPE_EDEFAULT;
        underlyingTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE,
                        oldUnderlyingType, UNDERLYING_TYPE_EDEFAULT, oldUnderlyingTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderlyingType() {
        return underlyingTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DefinedAttributeTypeKind getUnderlyingTypeKind() {
        return underlyingTypeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnderlyingTypeKind( DefinedAttributeTypeKind newUnderlyingTypeKind ) {
        DefinedAttributeTypeKind oldUnderlyingTypeKind = underlyingTypeKind;
        underlyingTypeKind = newUnderlyingTypeKind == null ? UNDERLYING_TYPE_KIND_EDEFAULT : newUnderlyingTypeKind;
        boolean oldUnderlyingTypeKindESet = underlyingTypeKindESet;
        underlyingTypeKindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND,
                        oldUnderlyingTypeKind, underlyingTypeKind, !oldUnderlyingTypeKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnderlyingTypeKind() {
        DefinedAttributeTypeKind oldUnderlyingTypeKind = underlyingTypeKind;
        boolean oldUnderlyingTypeKindESet = underlyingTypeKindESet;
        underlyingTypeKind = UNDERLYING_TYPE_KIND_EDEFAULT;
        underlyingTypeKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND, oldUnderlyingTypeKind,
                UNDERLYING_TYPE_KIND_EDEFAULT, oldUnderlyingTypeKindESet ) );
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
    public ServiceCDC getServiceCDC() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC ) return null;
        return ( ServiceCDC ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceCDC( ServiceCDC newServiceCDC, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newServiceCDC, NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceCDC( ServiceCDC newServiceCDC ) {
        if( newServiceCDC != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC
                        && newServiceCDC != null ) ) {
            if( EcoreUtil.isAncestor( this, newServiceCDC ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newServiceCDC != null ) msgs = ( ( InternalEObject ) newServiceCDC ).eInverseAdd( this,
                    NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE, ServiceCDC.class, msgs );
            msgs = basicSetServiceCDC( newServiceCDC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC, newServiceCDC, newServiceCDC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetServiceCDC( ( ServiceCDC ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            return basicSetServiceCDC( null, msgs );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE,
                    ServiceCDC.class, msgs );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            return getFc();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            return getName();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            return getPresCond();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            return getType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            return getTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            return getServiceCDC();
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            setFc( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            setTypeKind( ( Enumerator ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( DefinedAttributeTypeKind ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            setServiceCDC( ( ServiceCDC ) newValue );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            unsetFc();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            unsetName();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            unsetPresCondArgs();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            unsetPresCondArgsID();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            unsetType();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            unsetTypeKind();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            unsetUnderlyingType();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            setServiceCDC( ( ServiceCDC ) null );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            return isSetFc();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            return isSetName();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            return isSetPresCond();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            return isSetPresCondArgs();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return isSetPresCondArgsID();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            return isSetType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            return isSetTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            return isSetUnderlyingType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__SERVICE_CDC:
            return getServiceCDC() != null;
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
        result.append( " (fc: " );
        if( fcESet )
            result.append( fc );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", presCond: " );
        if( presCondESet )
            result.append( presCond );
        else
            result.append( "<unset>" );
        result.append( ", presCondArgs: " );
        if( presCondArgsESet )
            result.append( presCondArgs );
        else
            result.append( "<unset>" );
        result.append( ", presCondArgsID: " );
        if( presCondArgsIDESet )
            result.append( presCondArgsID );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", typeKind: " );
        if( typeKindESet )
            result.append( typeKind );
        else
            result.append( "<unset>" );
        result.append( ", underlyingType: " );
        if( underlyingTypeESet )
            result.append( underlyingType );
        else
            result.append( "<unset>" );
        result.append( ", underlyingTypeKind: " );
        if( underlyingTypeKindESet )
            result.append( underlyingTypeKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceDataAttributeImpl
