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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getSizeAttribute <em>Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getRefersToBasicType <em>Refers To Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getRefersToEnumeration <em>Refers To Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getParentConstructedAttribute <em>Parent Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataAttributeImpl#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubDataAttributeImpl extends DocumentedClassImpl implements SubDataAttribute {
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
     * The cached value of the '{@link #getRefersToPresCondArgsDoc() <em>Refers To Pres Cond Args Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToPresCondArgsDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToPresCondArgsDoc;

    /**
     * This is true if the Refers To Pres Cond Args Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToPresCondArgsDocESet;

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
     * The cached value of the '{@link #getRefersToBasicType() <em>Refers To Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToBasicType()
     * @generated
     * @ordered
     */
    protected BasicType refersToBasicType;

    /**
     * This is true if the Refers To Basic Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToBasicTypeESet;

    /**
     * The cached value of the '{@link #getRefersToConstructedAttribute() <em>Refers To Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToConstructedAttribute()
     * @generated
     * @ordered
     */
    protected ConstructedAttribute refersToConstructedAttribute;

    /**
     * This is true if the Refers To Constructed Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToConstructedAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToEnumeration() <em>Refers To Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToEnumeration()
     * @generated
     * @ordered
     */
    protected Enumeration refersToEnumeration;

    /**
     * This is true if the Refers To Enumeration reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToEnumerationESet;

    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * This is true if the Default Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean defaultValueESet;

    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MAX_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected BigDecimal maxValue = MAX_VALUE_EDEFAULT;

    /**
     * This is true if the Max Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxValueESet;

    /**
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MIN_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected BigDecimal minValue = MIN_VALUE_EDEFAULT;

    /**
     * This is true if the Min Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minValueESet;

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
     * The cached value of the '{@link #getRefersToPresenceCondition() <em>Refers To Presence Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToPresenceCondition()
     * @generated
     * @ordered
     */
    protected PresenceCondition refersToPresenceCondition;

    /**
     * This is true if the Refers To Presence Condition reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToPresenceConditionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubDataAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SUB_DATA_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefaultValue( String newDefaultValue ) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        boolean oldDefaultValueESet = defaultValueESet;
        defaultValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE,
                    oldDefaultValue, defaultValue, !oldDefaultValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDefaultValue() {
        String oldDefaultValue = defaultValue;
        boolean oldDefaultValueESet = defaultValueESet;
        defaultValue = DEFAULT_VALUE_EDEFAULT;
        defaultValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE,
                    oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDefaultValue() {
        return defaultValueESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY, oldIsArray,
                    isArray, !oldIsArrayESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY,
                    oldIsArray, IS_ARRAY_EDEFAULT, oldIsArrayESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE, oldMaxIndexAttribute,
                    MAX_INDEX_ATTRIBUTE_EDEFAULT, oldMaxIndexAttributeESet ) );
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
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxValue( BigDecimal newMaxValue ) {
        BigDecimal oldMaxValue = maxValue;
        maxValue = newMaxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE,
                    oldMaxValue, maxValue, !oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxValue() {
        BigDecimal oldMaxValue = maxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValue = MAX_VALUE_EDEFAULT;
        maxValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE,
                    oldMaxValue, MAX_VALUE_EDEFAULT, oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxValue() {
        return maxValueESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX,
                    oldMinIndex, minIndex, !oldMinIndexESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX,
                    oldMinIndex, MIN_INDEX_EDEFAULT, oldMinIndexESet ) );
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
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinValue( BigDecimal newMinValue ) {
        BigDecimal oldMinValue = minValue;
        minValue = newMinValue;
        boolean oldMinValueESet = minValueESet;
        minValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE,
                    oldMinValue, minValue, !oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinValue() {
        BigDecimal oldMinValue = minValue;
        boolean oldMinValueESet = minValueESet;
        minValue = MIN_VALUE_EDEFAULT;
        minValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE,
                    oldMinValue, MIN_VALUE_EDEFAULT, oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinValue() {
        return minValueESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__NAME, oldName,
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
    public ConstructedAttribute getParentConstructedAttribute() {
        if( eContainerFeatureID() != NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE ) return null;
        return ( ConstructedAttribute ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentConstructedAttribute( ConstructedAttribute newParentConstructedAttribute,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentConstructedAttribute,
                NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentConstructedAttribute( ConstructedAttribute newParentConstructedAttribute ) {
        if( newParentConstructedAttribute != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE
                        && newParentConstructedAttribute != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentConstructedAttribute ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentConstructedAttribute != null )
                msgs = ( ( InternalEObject ) newParentConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE, ConstructedAttribute.class, msgs );
            msgs = basicSetParentConstructedAttribute( newParentConstructedAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE, newParentConstructedAttribute,
                    newParentConstructedAttribute ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND,
                    oldPresCond, presCond, !oldPresCondESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND,
                    oldPresCond, PRES_COND_EDEFAULT, oldPresCondESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID,
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
    public Doc getRefersToPresCondArgsDoc() {
        return refersToPresCondArgsDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToPresCondArgsDoc( Doc newRefersToPresCondArgsDoc, NotificationChain msgs ) {
        Doc oldRefersToPresCondArgsDoc = refersToPresCondArgsDoc;
        refersToPresCondArgsDoc = newRefersToPresCondArgsDoc;
        boolean oldRefersToPresCondArgsDocESet = refersToPresCondArgsDocESet;
        refersToPresCondArgsDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc,
                    newRefersToPresCondArgsDoc, !oldRefersToPresCondArgsDocESet );
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
    public void setRefersToPresCondArgsDoc( Doc newRefersToPresCondArgsDoc ) {
        if( newRefersToPresCondArgsDoc != refersToPresCondArgsDoc ) {
            NotificationChain msgs = null;
            if( refersToPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            if( newRefersToPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) newRefersToPresCondArgsDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            msgs = basicSetRefersToPresCondArgsDoc( newRefersToPresCondArgsDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresCondArgsDocESet = refersToPresCondArgsDocESet;
            refersToPresCondArgsDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, newRefersToPresCondArgsDoc,
                        newRefersToPresCondArgsDoc, !oldRefersToPresCondArgsDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToPresCondArgsDoc( NotificationChain msgs ) {
        Doc oldRefersToPresCondArgsDoc = refersToPresCondArgsDoc;
        refersToPresCondArgsDoc = null;
        boolean oldRefersToPresCondArgsDocESet = refersToPresCondArgsDocESet;
        refersToPresCondArgsDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc, null,
                    oldRefersToPresCondArgsDocESet );
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
    public void unsetRefersToPresCondArgsDoc() {
        if( refersToPresCondArgsDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            msgs = basicUnsetRefersToPresCondArgsDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresCondArgsDocESet = refersToPresCondArgsDocESet;
            refersToPresCondArgsDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, null, null,
                        oldRefersToPresCondArgsDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToPresCondArgsDoc() {
        return refersToPresCondArgsDocESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE,
                    oldSizeAttribute, sizeAttribute, !oldSizeAttributeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__TYPE, oldType, type,
                    !oldTypeESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND,
                    oldTypeKind, typeKind, !oldTypeKindESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND,
                    oldTypeKind, TYPE_KIND_EDEFAULT, oldTypeKindESet ) );
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
    public BasicType getRefersToBasicType() {
        return refersToBasicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToBasicType( BasicType newRefersToBasicType, NotificationChain msgs ) {
        BasicType oldRefersToBasicType = refersToBasicType;
        refersToBasicType = newRefersToBasicType;
        boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
        refersToBasicTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, newRefersToBasicType,
                    !oldRefersToBasicTypeESet );
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
    public void setRefersToBasicType( BasicType newRefersToBasicType ) {
        if( newRefersToBasicType != refersToBasicType ) {
            NotificationChain msgs = null;
            if( refersToBasicType != null )
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            if( newRefersToBasicType != null )
                msgs = ( ( InternalEObject ) newRefersToBasicType ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            msgs = basicSetRefersToBasicType( newRefersToBasicType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
            refersToBasicTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, newRefersToBasicType, newRefersToBasicType,
                        !oldRefersToBasicTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToBasicType( NotificationChain msgs ) {
        BasicType oldRefersToBasicType = refersToBasicType;
        refersToBasicType = null;
        boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
        refersToBasicTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, null,
                    oldRefersToBasicTypeESet );
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
    public void unsetRefersToBasicType() {
        if( refersToBasicType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                    NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            msgs = basicUnsetRefersToBasicType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
            refersToBasicTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, null, null, oldRefersToBasicTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToBasicType() {
        return refersToBasicTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttribute getRefersToConstructedAttribute() {
        return refersToConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToConstructedAttribute( ConstructedAttribute newRefersToConstructedAttribute,
            NotificationChain msgs ) {
        ConstructedAttribute oldRefersToConstructedAttribute = refersToConstructedAttribute;
        refersToConstructedAttribute = newRefersToConstructedAttribute;
        boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
        refersToConstructedAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
                    newRefersToConstructedAttribute, !oldRefersToConstructedAttributeESet );
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
    public void setRefersToConstructedAttribute( ConstructedAttribute newRefersToConstructedAttribute ) {
        if( newRefersToConstructedAttribute != refersToConstructedAttribute ) {
            NotificationChain msgs = null;
            if( refersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            if( newRefersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) newRefersToConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            msgs = basicSetRefersToConstructedAttribute( newRefersToConstructedAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
            refersToConstructedAttributeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, newRefersToConstructedAttribute,
                        newRefersToConstructedAttribute, !oldRefersToConstructedAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToConstructedAttribute( NotificationChain msgs ) {
        ConstructedAttribute oldRefersToConstructedAttribute = refersToConstructedAttribute;
        refersToConstructedAttribute = null;
        boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
        refersToConstructedAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
                    null, oldRefersToConstructedAttributeESet );
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
    public void unsetRefersToConstructedAttribute() {
        if( refersToConstructedAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                    NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class, msgs );
            msgs = basicUnsetRefersToConstructedAttribute( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
            refersToConstructedAttributeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, null, null,
                        oldRefersToConstructedAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToConstructedAttribute() {
        return refersToConstructedAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration getRefersToEnumeration() {
        return refersToEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToEnumeration( Enumeration newRefersToEnumeration, NotificationChain msgs ) {
        Enumeration oldRefersToEnumeration = refersToEnumeration;
        refersToEnumeration = newRefersToEnumeration;
        boolean oldRefersToEnumerationESet = refersToEnumerationESet;
        refersToEnumerationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, oldRefersToEnumeration,
                    newRefersToEnumeration, !oldRefersToEnumerationESet );
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
    public void setRefersToEnumeration( Enumeration newRefersToEnumeration ) {
        if( newRefersToEnumeration != refersToEnumeration ) {
            NotificationChain msgs = null;
            if( refersToEnumeration != null )
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            if( newRefersToEnumeration != null )
                msgs = ( ( InternalEObject ) newRefersToEnumeration ).eInverseAdd( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            msgs = basicSetRefersToEnumeration( newRefersToEnumeration, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToEnumerationESet = refersToEnumerationESet;
            refersToEnumerationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, newRefersToEnumeration,
                        newRefersToEnumeration, !oldRefersToEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToEnumeration( NotificationChain msgs ) {
        Enumeration oldRefersToEnumeration = refersToEnumeration;
        refersToEnumeration = null;
        boolean oldRefersToEnumerationESet = refersToEnumerationESet;
        refersToEnumerationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, oldRefersToEnumeration, null,
                    oldRefersToEnumerationESet );
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
    public void unsetRefersToEnumeration() {
        if( refersToEnumeration != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                    NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            msgs = basicUnsetRefersToEnumeration( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToEnumerationESet = refersToEnumerationESet;
            refersToEnumerationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, null, null,
                        oldRefersToEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToEnumeration() {
        return refersToEnumerationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PresenceCondition getRefersToPresenceCondition() {
        return refersToPresenceCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToPresenceCondition( PresenceCondition newRefersToPresenceCondition,
            NotificationChain msgs ) {
        PresenceCondition oldRefersToPresenceCondition = refersToPresenceCondition;
        refersToPresenceCondition = newRefersToPresenceCondition;
        boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
        refersToPresenceConditionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition,
                    newRefersToPresenceCondition, !oldRefersToPresenceConditionESet );
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
    public void setRefersToPresenceCondition( PresenceCondition newRefersToPresenceCondition ) {
        if( newRefersToPresenceCondition != refersToPresenceCondition ) {
            NotificationChain msgs = null;
            if( refersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            if( newRefersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) newRefersToPresenceCondition ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            msgs = basicSetRefersToPresenceCondition( newRefersToPresenceCondition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, newRefersToPresenceCondition,
                        newRefersToPresenceCondition, !oldRefersToPresenceConditionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToPresenceCondition( NotificationChain msgs ) {
        PresenceCondition oldRefersToPresenceCondition = refersToPresenceCondition;
        refersToPresenceCondition = null;
        boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
        refersToPresenceConditionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition, null,
                    oldRefersToPresenceConditionESet );
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
    public void unsetRefersToPresenceCondition() {
        if( refersToPresenceCondition != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            msgs = basicUnsetRefersToPresenceCondition( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, null, null,
                        oldRefersToPresenceConditionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToPresenceCondition() {
        return refersToPresenceConditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            if( refersToPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            return basicSetRefersToPresCondArgsDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            if( refersToBasicType != null )
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            return basicSetRefersToBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            if( refersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            return basicSetRefersToConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            if( refersToEnumeration != null )
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            return basicSetRefersToEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            if( refersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            return basicSetRefersToPresenceCondition( ( PresenceCondition ) otherEnd, msgs );
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
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToPresCondArgsDoc( msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return basicUnsetRefersToBasicType( msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToConstructedAttribute( msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return basicUnsetRefersToEnumeration( msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            return basicSetParentConstructedAttribute( null, msgs );
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            return basicUnsetRefersToPresenceCondition( msgs );
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
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            return eInternalContainer().eInverseRemove( this, NsdPackage.CONSTRUCTED_ATTRIBUTE__SUB_DATA_ATTRIBUTE,
                    ConstructedAttribute.class, msgs );
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
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND:
            return getPresCond();
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return getRefersToPresCondArgsDoc();
        case NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY:
            return isIsArray();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            return getMaxIndexAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX:
            return getMinIndex();
        case NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            return getSizeAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE:
            return getType();
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND:
            return getTypeKind();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return getRefersToBasicType();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return getRefersToConstructedAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return getRefersToEnumeration();
        case NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE:
            return getDefaultValue();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE:
            return getMaxValue();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE:
            return getMinValue();
        case NsdPackage.SUB_DATA_ATTRIBUTE__NAME:
            return getName();
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            return getParentConstructedAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            return getRefersToPresenceCondition();
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
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            setRefersToPresCondArgsDoc( ( Doc ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY:
            setIsArray( ( Boolean ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            setMaxIndexAttribute( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX:
            setMinIndex( ( Long ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            setSizeAttribute( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND:
            setTypeKind( ( Enumerator ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            setRefersToBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            setRefersToConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            setRefersToEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE:
            setMaxValue( ( BigDecimal ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE:
            setMinValue( ( BigDecimal ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            setParentConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            setRefersToPresenceCondition( ( PresenceCondition ) newValue );
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
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS:
            unsetPresCondArgs();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            unsetPresCondArgsID();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            unsetRefersToPresCondArgsDoc();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY:
            unsetIsArray();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            unsetMaxIndexAttribute();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX:
            unsetMinIndex();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            unsetSizeAttribute();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE:
            unsetType();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND:
            unsetTypeKind();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            unsetRefersToBasicType();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToConstructedAttribute();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            unsetRefersToEnumeration();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE:
            unsetDefaultValue();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE:
            unsetMaxValue();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE:
            unsetMinValue();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__NAME:
            unsetName();
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            setParentConstructedAttribute( ( ConstructedAttribute ) null );
            return;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            unsetRefersToPresenceCondition();
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
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND:
            return isSetPresCond();
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS:
            return isSetPresCondArgs();
        case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return isSetPresCondArgsID();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return isSetRefersToPresCondArgsDoc();
        case NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY:
            return isSetIsArray();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            return isSetMaxIndexAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX:
            return isSetMinIndex();
        case NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            return isSetSizeAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE:
            return isSetType();
        case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND:
            return isSetTypeKind();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return isSetRefersToBasicType();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToConstructedAttribute();
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return isSetRefersToEnumeration();
        case NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE:
            return isSetDefaultValue();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE:
            return isSetMaxValue();
        case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE:
            return isSetMinValue();
        case NsdPackage.SUB_DATA_ATTRIBUTE__NAME:
            return isSetName();
        case NsdPackage.SUB_DATA_ATTRIBUTE__PARENT_CONSTRUCTED_ATTRIBUTE:
            return getParentConstructedAttribute() != null;
        case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            return isSetRefersToPresenceCondition();
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
            case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND;
            case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS;
            case NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID;
            case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgArray.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY:
                return NsdPackage.AG_ARRAY__IS_ARRAY;
            case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
                return NsdPackage.AG_ARRAY__MAX_INDEX_ATTRIBUTE;
            case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX:
                return NsdPackage.AG_ARRAY__MIN_INDEX;
            case NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
                return NsdPackage.AG_ARRAY__SIZE_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeType.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__TYPE;
            case NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND:
                return NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND;
            case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE;
            case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeTypeAndValues.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE:
                return NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE;
            case NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE:
                return NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE;
            case NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE:
                return NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE;
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
                return NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS:
                return NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID:
                return NsdPackage.SUB_DATA_ATTRIBUTE__PRES_COND_ARGS_ID;
            case NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgArray.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ARRAY__IS_ARRAY:
                return NsdPackage.SUB_DATA_ATTRIBUTE__IS_ARRAY;
            case NsdPackage.AG_ARRAY__MAX_INDEX_ATTRIBUTE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE;
            case NsdPackage.AG_ARRAY__MIN_INDEX:
                return NsdPackage.SUB_DATA_ATTRIBUTE__MIN_INDEX;
            case NsdPackage.AG_ARRAY__SIZE_ATTRIBUTE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__SIZE_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeType.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__TYPE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
                return NsdPackage.SUB_DATA_ATTRIBUTE__TYPE_KIND;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
                return NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeTypeAndValues.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__DEFAULT_VALUE;
            case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__MAX_VALUE;
            case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE:
                return NsdPackage.SUB_DATA_ATTRIBUTE__MIN_VALUE;
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
        result.append( ", defaultValue: " );
        if( defaultValueESet )
            result.append( defaultValue );
        else
            result.append( "<unset>" );
        result.append( ", maxValue: " );
        if( maxValueESet )
            result.append( maxValue );
        else
            result.append( "<unset>" );
        result.append( ", minValue: " );
        if( minValueESet )
            result.append( minValue );
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

    /* Implicit link
     *   SubDataAttribute.presCond          -> PresenceCondition.name
     *   SubDataAttribute.sizeAttribute     -> DataAttribute.name                   ? Which DataAttribute ?
     *   SubDataAttribute.maxIndexAttribute -> DataAttribute.name                   ? Which DataAttribute ?
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        String id = getNsIdentification().getId();
        NsdResourceSetImpl rs = getResourceSet();
        if( rs == null ) return false;

        String messagePrefix = "[NSD links] while resolving link from SubDataAttribute (name: " + getName()
                + ", NS id: " + id + ", line: " + getLineNumber() + "): ";

        if( isSetPresCond() ) {
            PresenceCondition foundPC = rs.findPresenceCondition( getPresCond(), getNsIdentification(), console );
            if( foundPC == null ) {
                console.warning( messagePrefix + "PresenceCondition (name: " + getPresCond() + ") not found" );
            }
            else {
                setRefersToPresenceCondition( foundPC );
                console.info( "[NSD links] PresenceCondition (name: " + getPresCond()
                        + ") refers by SubDataAttribute (name: "
                        + getName() + ") in NS (id:" + id + ") found in NS (id:"
                        + getRefersToPresenceCondition().getParentPresenceConditions().getParentNS().getId() + ")" );
            }
        }

        if( getTypeKind() instanceof DefinedAttributeTypeKind ) {
            if( isSetType() ) {
                switch( getTypeKind().getValue() ) {
                case DefinedAttributeTypeKind.BASIC_VALUE:
                    BasicType foundBT = rs.findBasicType( getType(), getNsIdentification(), console );

                    if( foundBT == null ) {
                        console.warning( messagePrefix + "BasicType (name: " + getType() + ") not found" );
                    }
                    else {
                        setRefersToBasicType( foundBT );
                        console.info( "[NSD links] BasicType (name: " + getType()
                                + ") refers as type by SubDataAttribute (name: "
                                + getName() + ") in NS (id:" + id + ") found in NS (id:"
                                + getRefersToBasicType().getParentBasicTypes().getParentNS().getId() + ")" );
                    }
                    break;
                case DefinedAttributeTypeKind.CONSTRUCTED_VALUE:
                    ConstructedAttribute foundCA = rs.findConstructedAttribute( getType(), getNsIdentification(),
                            console );

                    if( foundCA == null ) {
                        console.warning( messagePrefix + "ConstructedAttribute (name: " + getType() + ") not found" );
                    }
                    else {
                        setRefersToConstructedAttribute( foundCA );
                        console.info( "[NSD links] ConstructedAttribute (name: " + getType()
                                + ") refers as type by SubDataAttribute (name: "
                                + getName() + ") in NS (id:" + id + ") found in NS (id:"
                                + getRefersToConstructedAttribute().getParentConstructedAttributes().getParentNS()
                                        .getId()
                                + ")" );
                    }
                    break;
                case DefinedAttributeTypeKind.ENUMERATED_VALUE:
                    Enumeration foundEn = rs.findEnumeration( getType(), getNsIdentification(), console );

                    if( foundEn == null ) {
                        console.warning( messagePrefix + "Enumeration (name: " + getType() + ") not found" );
                    }
                    else {
                        setRefersToEnumeration( foundEn );
                        console.info( "[NSD links] Enumeration (name: " + getType()
                                + ") refers as type by SubDataAttribute (name: "
                                + getName() + ") in NS (id:" + id + ") found in NS (id:"
                                + getRefersToEnumeration().getParentEnumerations().getParentNS().getId() + ")" );
                    }
                    break;
                }
            }
            else {
                console.warning( messagePrefix + "type is missing for " + getTypeKind() );
            }
        }

        if( isSetPresCondArgsID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getPresCondArgsID() );
                if( doc != null ) setRefersToPresCondArgsDoc( doc );
            }
        }

        return false;
    }

    @Override
    public NsIdentification getNsIdentification() {
        return (( ConstructedAttributeImpl ) getParentConstructedAttribute() ).getNsIdentification();
    }

} //SubDataAttributeImpl
