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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getSizeAttribute <em>Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getCDC <em>CDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubDataObjectImpl extends DocumentedClassImpl implements SubDataObject {
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
     * The default value of the '{@link #isIsArray() <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsArray()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ARRAY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsArray() <em>Is Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsArray()
     * @generated
     * @ordered
     */
    protected boolean isArray = IS_ARRAY_EDEFAULT;

    /**
     * This is true if the Is Array attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isArrayESet;

    /**
     * The default value of the '{@link #getMaxIndexAttribute() <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxIndexAttribute()
     * @generated
     * @ordered
     */
    protected static final String MAX_INDEX_ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxIndexAttribute() <em>Max Index Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxIndexAttribute()
     * @generated
     * @ordered
     */
    protected String maxIndexAttribute = MAX_INDEX_ATTRIBUTE_EDEFAULT;

    /**
     * This is true if the Max Index Attribute attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxIndexAttributeESet;

    /**
     * The default value of the '{@link #getMinIndex() <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinIndex()
     * @generated
     * @ordered
     */
    protected static final long MIN_INDEX_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMinIndex() <em>Min Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinIndex()
     * @generated
     * @ordered
     */
    protected long minIndex = MIN_INDEX_EDEFAULT;

    /**
     * This is true if the Min Index attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minIndexESet;

    /**
     * The default value of the '{@link #getSizeAttribute() <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeAttribute()
     * @generated
     * @ordered
     */
    protected static final String SIZE_ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSizeAttribute() <em>Size Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeAttribute()
     * @generated
     * @ordered
     */
    protected String sizeAttribute = SIZE_ATTRIBUTE_EDEFAULT;

    /**
     * This is true if the Size Attribute attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeAttributeESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubDataObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SUB_DATA_OBJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIsArray() {
        return isArray;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsArray( boolean newIsArray ) {
        boolean oldIsArray = isArray;
        isArray = newIsArray;
        boolean oldIsArrayESet = isArrayESet;
        isArrayESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SUB_DATA_OBJECT__IS_ARRAY, oldIsArray, isArray, !oldIsArrayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsArray() {
        boolean oldIsArray = isArray;
        boolean oldIsArrayESet = isArrayESet;
        isArray = IS_ARRAY_EDEFAULT;
        isArrayESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SUB_DATA_OBJECT__IS_ARRAY, oldIsArray, IS_ARRAY_EDEFAULT, oldIsArrayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsArray() {
        return isArrayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMaxIndexAttribute() {
        return maxIndexAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxIndexAttribute( String newMaxIndexAttribute ) {
        String oldMaxIndexAttribute = maxIndexAttribute;
        maxIndexAttribute = newMaxIndexAttribute;
        boolean oldMaxIndexAttributeESet = maxIndexAttributeESet;
        maxIndexAttributeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE,
                    oldMaxIndexAttribute, maxIndexAttribute, !oldMaxIndexAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxIndexAttribute() {
        String oldMaxIndexAttribute = maxIndexAttribute;
        boolean oldMaxIndexAttributeESet = maxIndexAttributeESet;
        maxIndexAttribute = MAX_INDEX_ATTRIBUTE_EDEFAULT;
        maxIndexAttributeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE,
                    oldMaxIndexAttribute, MAX_INDEX_ATTRIBUTE_EDEFAULT, oldMaxIndexAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxIndexAttribute() {
        return maxIndexAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getMinIndex() {
        return minIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinIndex( long newMinIndex ) {
        long oldMinIndex = minIndex;
        minIndex = newMinIndex;
        boolean oldMinIndexESet = minIndexESet;
        minIndexESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SUB_DATA_OBJECT__MIN_INDEX, oldMinIndex, minIndex, !oldMinIndexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinIndex() {
        long oldMinIndex = minIndex;
        boolean oldMinIndexESet = minIndexESet;
        minIndex = MIN_INDEX_EDEFAULT;
        minIndexESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SUB_DATA_OBJECT__MIN_INDEX, oldMinIndex, MIN_INDEX_EDEFAULT, oldMinIndexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinIndex() {
        return minIndexESet;
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
                NsdPackage.SUB_DATA_OBJECT__NAME, oldName, name, !oldNameESet ) );
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
                NsdPackage.SUB_DATA_OBJECT__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
                NsdPackage.SUB_DATA_OBJECT__PRES_COND, oldPresCond, presCond, !oldPresCondESet ) );
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
                NsdPackage.SUB_DATA_OBJECT__PRES_COND, oldPresCond, PRES_COND_EDEFAULT, oldPresCondESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS, oldPresCondArgs, presCondArgs, !oldPresCondArgsESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID,
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
    public String getSizeAttribute() {
        return sizeAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSizeAttribute( String newSizeAttribute ) {
        String oldSizeAttribute = sizeAttribute;
        sizeAttribute = newSizeAttribute;
        boolean oldSizeAttributeESet = sizeAttributeESet;
        sizeAttributeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE, oldSizeAttribute, sizeAttribute, !oldSizeAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSizeAttribute() {
        String oldSizeAttribute = sizeAttribute;
        boolean oldSizeAttributeESet = sizeAttributeESet;
        sizeAttribute = SIZE_ATTRIBUTE_EDEFAULT;
        sizeAttributeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE,
                    oldSizeAttribute, SIZE_ATTRIBUTE_EDEFAULT, oldSizeAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSizeAttribute() {
        return sizeAttributeESet;
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
                NsdPackage.SUB_DATA_OBJECT__TYPE, oldType, type, !oldTypeESet ) );
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
                NsdPackage.SUB_DATA_OBJECT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND,
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
    public CDC getCDC() {
        if( eContainerFeatureID() != NsdPackage.SUB_DATA_OBJECT__CDC ) return null;
        return ( CDC ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCDC( CDC newCDC, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newCDC, NsdPackage.SUB_DATA_OBJECT__CDC, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCDC( CDC newCDC ) {
        if( newCDC != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SUB_DATA_OBJECT__CDC && newCDC != null ) ) {
            if( EcoreUtil.isAncestor( this, newCDC ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newCDC != null ) msgs = ( ( InternalEObject ) newCDC ).eInverseAdd( this,
                    NsdPackage.CDC__SUB_DATA_OBJECT, CDC.class, msgs );
            msgs = basicSetCDC( newCDC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__CDC, newCDC, newCDC ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetCDC( ( CDC ) otherEnd, msgs );
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
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            return basicSetCDC( null, msgs );
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
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            return eInternalContainer().eInverseRemove( this, NsdPackage.CDC__SUB_DATA_OBJECT, CDC.class, msgs );
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
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND:
            return getPresCond();
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.SUB_DATA_OBJECT__IS_ARRAY:
            return isIsArray();
        case NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE:
            return getMaxIndexAttribute();
        case NsdPackage.SUB_DATA_OBJECT__MIN_INDEX:
            return getMinIndex();
        case NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE:
            return getSizeAttribute();
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            return getName();
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            return getType();
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            return getCDC();
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
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__IS_ARRAY:
            setIsArray( ( Boolean ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE:
            setMaxIndexAttribute( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__MIN_INDEX:
            setMinIndex( ( Long ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE:
            setSizeAttribute( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( DefinedAttributeTypeKind ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            setCDC( ( CDC ) newValue );
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
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS:
            unsetPresCondArgs();
            return;
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID:
            unsetPresCondArgsID();
            return;
        case NsdPackage.SUB_DATA_OBJECT__IS_ARRAY:
            unsetIsArray();
            return;
        case NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE:
            unsetMaxIndexAttribute();
            return;
        case NsdPackage.SUB_DATA_OBJECT__MIN_INDEX:
            unsetMinIndex();
            return;
        case NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE:
            unsetSizeAttribute();
            return;
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE:
            unsetUnderlyingType();
            return;
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
            return;
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            unsetName();
            return;
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            unsetType();
            return;
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            setCDC( ( CDC ) null );
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
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND:
            return isSetPresCond();
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS:
            return isSetPresCondArgs();
        case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID:
            return isSetPresCondArgsID();
        case NsdPackage.SUB_DATA_OBJECT__IS_ARRAY:
            return isSetIsArray();
        case NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE:
            return isSetMaxIndexAttribute();
        case NsdPackage.SUB_DATA_OBJECT__MIN_INDEX:
            return isSetMinIndex();
        case NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE:
            return isSetSizeAttribute();
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE:
            return isSetUnderlyingType();
        case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            return isSetName();
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            return isSetType();
        case NsdPackage.SUB_DATA_OBJECT__CDC:
            return getCDC() != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgPresenceCondition.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SUB_DATA_OBJECT__PRES_COND:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND;
            case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS;
            case NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID;
            default:
                return -1;
            }
        }
        if( baseClass == AgArray.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SUB_DATA_OBJECT__IS_ARRAY:
                return NsdPackage.AG_ARRAY__IS_ARRAY;
            case NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE:
                return NsdPackage.AG_ARRAY__MAX_INDEX_ATTRIBUTE;
            case NsdPackage.SUB_DATA_OBJECT__MIN_INDEX:
                return NsdPackage.AG_ARRAY__MIN_INDEX;
            case NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE:
                return NsdPackage.AG_ARRAY__SIZE_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUnderlyingType.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE:
                return NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE;
            case NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND:
                return NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgPresenceCondition.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND:
                return NsdPackage.SUB_DATA_OBJECT__PRES_COND;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS:
                return NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID:
                return NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS_ID;
            default:
                return -1;
            }
        }
        if( baseClass == AgArray.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ARRAY__IS_ARRAY:
                return NsdPackage.SUB_DATA_OBJECT__IS_ARRAY;
            case NsdPackage.AG_ARRAY__MAX_INDEX_ATTRIBUTE:
                return NsdPackage.SUB_DATA_OBJECT__MAX_INDEX_ATTRIBUTE;
            case NsdPackage.AG_ARRAY__MIN_INDEX:
                return NsdPackage.SUB_DATA_OBJECT__MIN_INDEX;
            case NsdPackage.AG_ARRAY__SIZE_ATTRIBUTE:
                return NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUnderlyingType.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
                return NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE;
            case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
                return NsdPackage.SUB_DATA_OBJECT__UNDERLYING_TYPE_KIND;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
        result.append( " (presCond: " );
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
        result.append( ", isArray: " );
        if( isArrayESet )
            result.append( isArray );
        else
            result.append( "<unset>" );
        result.append( ", maxIndexAttribute: " );
        if( maxIndexAttributeESet )
            result.append( maxIndexAttribute );
        else
            result.append( "<unset>" );
        result.append( ", minIndex: " );
        if( minIndexESet )
            result.append( minIndex );
        else
            result.append( "<unset>" );
        result.append( ", sizeAttribute: " );
        if( sizeAttributeESet )
            result.append( sizeAttribute );
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
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SubDataObjectImpl
