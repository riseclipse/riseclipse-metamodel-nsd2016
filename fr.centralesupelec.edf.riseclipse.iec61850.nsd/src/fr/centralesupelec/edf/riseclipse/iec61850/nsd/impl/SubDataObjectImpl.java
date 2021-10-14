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

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgArray;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getSizeAttribute <em>Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getParentCDC <em>Parent CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToCDC <em>Refers To CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.SubDataObjectImpl#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}</li>
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
     * The cached value of the '{@link #getRefersToUnderlyingBasicType() <em>Refers To Underlying Basic Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToUnderlyingBasicType()
     * @generated
     * @ordered
     */
    protected BasicType refersToUnderlyingBasicType;

    /**
     * This is true if the Refers To Underlying Basic Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToUnderlyingBasicTypeESet;

    /**
     * The cached value of the '{@link #getRefersToUnderlyingConstructedAttribute() <em>Refers To Underlying Constructed Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToUnderlyingConstructedAttribute()
     * @generated
     * @ordered
     */
    protected ConstructedAttribute refersToUnderlyingConstructedAttribute;

    /**
     * This is true if the Refers To Underlying Constructed Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToUnderlyingConstructedAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToUnderlyingEnumeration() <em>Refers To Underlying Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToUnderlyingEnumeration()
     * @generated
     * @ordered
     */
    protected Enumeration refersToUnderlyingEnumeration;

    /**
     * This is true if the Refers To Underlying Enumeration reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToUnderlyingEnumerationESet;

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
     * The cached value of the '{@link #getRefersToCDC() <em>Refers To CDC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToCDC()
     * @generated
     * @ordered
     */
    protected CDC refersToCDC;

    /**
     * This is true if the Refers To CDC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToCDCESet;

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
     * The cached value of the '{@link #getRefersToSizeAttribute() <em>Refers To Size Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToSizeAttribute()
     * @generated
     * @ordered
     */
    protected DataAttribute refersToSizeAttribute;

    /**
     * This is true if the Refers To Size Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToSizeAttributeESet;

    /**
     * The cached value of the '{@link #getRefersToMaxIndexAttribute() <em>Refers To Max Index Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToMaxIndexAttribute()
     * @generated
     * @ordered
     */
    protected DataAttribute refersToMaxIndexAttribute;

    /**
     * This is true if the Refers To Max Index Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToMaxIndexAttributeESet;

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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__IS_ARRAY, oldIsArray,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__IS_ARRAY, oldIsArray,
                    IS_ARRAY_EDEFAULT, oldIsArrayESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__MIN_INDEX, oldMinIndex,
                    minIndex, !oldMinIndexESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__MIN_INDEX,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__NAME, oldName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__PRES_COND, oldPresCond,
                    presCond, !oldPresCondESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__PRES_COND,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__PRES_COND_ARGS,
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
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc,
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
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, newRefersToPresCondArgsDoc,
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
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc, null,
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
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, null, null,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__SIZE_ATTRIBUTE,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__TYPE, oldType, type,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__TYPE, oldType,
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
    public CDC getParentCDC() {
        if( eContainerFeatureID() != NsdPackage.SUB_DATA_OBJECT__PARENT_CDC ) return null;
        return ( CDC ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCDC( CDC newParentCDC, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentCDC, NsdPackage.SUB_DATA_OBJECT__PARENT_CDC, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentCDC( CDC newParentCDC ) {
        if( newParentCDC != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SUB_DATA_OBJECT__PARENT_CDC && newParentCDC != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentCDC ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentCDC != null )
                msgs = ( ( InternalEObject ) newParentCDC ).eInverseAdd( this, NsdPackage.CDC__SUB_DATA_OBJECT,
                        CDC.class, msgs );
            msgs = basicSetParentCDC( newParentCDC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__PARENT_CDC,
                    newParentCDC, newParentCDC ) );
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
    public BasicType getRefersToUnderlyingBasicType() {
        return refersToUnderlyingBasicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToUnderlyingBasicType( BasicType newRefersToUnderlyingBasicType,
            NotificationChain msgs ) {
        BasicType oldRefersToUnderlyingBasicType = refersToUnderlyingBasicType;
        refersToUnderlyingBasicType = newRefersToUnderlyingBasicType;
        boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
        refersToUnderlyingBasicTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType,
                    newRefersToUnderlyingBasicType, !oldRefersToUnderlyingBasicTypeESet );
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
    public void setRefersToUnderlyingBasicType( BasicType newRefersToUnderlyingBasicType ) {
        if( newRefersToUnderlyingBasicType != refersToUnderlyingBasicType ) {
            NotificationChain msgs = null;
            if( refersToUnderlyingBasicType != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            if( newRefersToUnderlyingBasicType != null )
                msgs = ( ( InternalEObject ) newRefersToUnderlyingBasicType ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            msgs = basicSetRefersToUnderlyingBasicType( newRefersToUnderlyingBasicType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
            refersToUnderlyingBasicTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, newRefersToUnderlyingBasicType,
                        newRefersToUnderlyingBasicType, !oldRefersToUnderlyingBasicTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToUnderlyingBasicType( NotificationChain msgs ) {
        BasicType oldRefersToUnderlyingBasicType = refersToUnderlyingBasicType;
        refersToUnderlyingBasicType = null;
        boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
        refersToUnderlyingBasicTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType, null,
                    oldRefersToUnderlyingBasicTypeESet );
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
    public void unsetRefersToUnderlyingBasicType() {
        if( refersToUnderlyingBasicType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                    NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            msgs = basicUnsetRefersToUnderlyingBasicType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToUnderlyingBasicTypeESet = refersToUnderlyingBasicTypeESet;
            refersToUnderlyingBasicTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, null, null,
                        oldRefersToUnderlyingBasicTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToUnderlyingBasicType() {
        return refersToUnderlyingBasicTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttribute getRefersToUnderlyingConstructedAttribute() {
        return refersToUnderlyingConstructedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToUnderlyingConstructedAttribute(
            ConstructedAttribute newRefersToUnderlyingConstructedAttribute, NotificationChain msgs ) {
        ConstructedAttribute oldRefersToUnderlyingConstructedAttribute = refersToUnderlyingConstructedAttribute;
        refersToUnderlyingConstructedAttribute = newRefersToUnderlyingConstructedAttribute;
        boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
        refersToUnderlyingConstructedAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                    oldRefersToUnderlyingConstructedAttribute, newRefersToUnderlyingConstructedAttribute,
                    !oldRefersToUnderlyingConstructedAttributeESet );
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
    public void setRefersToUnderlyingConstructedAttribute(
            ConstructedAttribute newRefersToUnderlyingConstructedAttribute ) {
        if( newRefersToUnderlyingConstructedAttribute != refersToUnderlyingConstructedAttribute ) {
            NotificationChain msgs = null;
            if( refersToUnderlyingConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            if( newRefersToUnderlyingConstructedAttribute != null )
                msgs = ( ( InternalEObject ) newRefersToUnderlyingConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            msgs = basicSetRefersToUnderlyingConstructedAttribute( newRefersToUnderlyingConstructedAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
            refersToUnderlyingConstructedAttributeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                        newRefersToUnderlyingConstructedAttribute, newRefersToUnderlyingConstructedAttribute,
                        !oldRefersToUnderlyingConstructedAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToUnderlyingConstructedAttribute( NotificationChain msgs ) {
        ConstructedAttribute oldRefersToUnderlyingConstructedAttribute = refersToUnderlyingConstructedAttribute;
        refersToUnderlyingConstructedAttribute = null;
        boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
        refersToUnderlyingConstructedAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
                    oldRefersToUnderlyingConstructedAttribute, null, oldRefersToUnderlyingConstructedAttributeESet );
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
    public void unsetRefersToUnderlyingConstructedAttribute() {
        if( refersToUnderlyingConstructedAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                    NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class, msgs );
            msgs = basicUnsetRefersToUnderlyingConstructedAttribute( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToUnderlyingConstructedAttributeESet = refersToUnderlyingConstructedAttributeESet;
            refersToUnderlyingConstructedAttributeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE, null, null,
                        oldRefersToUnderlyingConstructedAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToUnderlyingConstructedAttribute() {
        return refersToUnderlyingConstructedAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration getRefersToUnderlyingEnumeration() {
        return refersToUnderlyingEnumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToUnderlyingEnumeration( Enumeration newRefersToUnderlyingEnumeration,
            NotificationChain msgs ) {
        Enumeration oldRefersToUnderlyingEnumeration = refersToUnderlyingEnumeration;
        refersToUnderlyingEnumeration = newRefersToUnderlyingEnumeration;
        boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
        refersToUnderlyingEnumerationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, oldRefersToUnderlyingEnumeration,
                    newRefersToUnderlyingEnumeration, !oldRefersToUnderlyingEnumerationESet );
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
    public void setRefersToUnderlyingEnumeration( Enumeration newRefersToUnderlyingEnumeration ) {
        if( newRefersToUnderlyingEnumeration != refersToUnderlyingEnumeration ) {
            NotificationChain msgs = null;
            if( refersToUnderlyingEnumeration != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            if( newRefersToUnderlyingEnumeration != null )
                msgs = ( ( InternalEObject ) newRefersToUnderlyingEnumeration ).eInverseAdd( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            msgs = basicSetRefersToUnderlyingEnumeration( newRefersToUnderlyingEnumeration, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
            refersToUnderlyingEnumerationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, newRefersToUnderlyingEnumeration,
                        newRefersToUnderlyingEnumeration, !oldRefersToUnderlyingEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToUnderlyingEnumeration( NotificationChain msgs ) {
        Enumeration oldRefersToUnderlyingEnumeration = refersToUnderlyingEnumeration;
        refersToUnderlyingEnumeration = null;
        boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
        refersToUnderlyingEnumerationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, oldRefersToUnderlyingEnumeration,
                    null, oldRefersToUnderlyingEnumerationESet );
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
    public void unsetRefersToUnderlyingEnumeration() {
        if( refersToUnderlyingEnumeration != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                    NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            msgs = basicUnsetRefersToUnderlyingEnumeration( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToUnderlyingEnumerationESet = refersToUnderlyingEnumerationESet;
            refersToUnderlyingEnumerationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, null, null,
                        oldRefersToUnderlyingEnumerationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToUnderlyingEnumeration() {
        return refersToUnderlyingEnumerationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CDC getRefersToCDC() {
        return refersToCDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToCDC( CDC newRefersToCDC, NotificationChain msgs ) {
        CDC oldRefersToCDC = refersToCDC;
        refersToCDC = newRefersToCDC;
        boolean oldRefersToCDCESet = refersToCDCESet;
        refersToCDCESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC, oldRefersToCDC, newRefersToCDC, !oldRefersToCDCESet );
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
    public void setRefersToCDC( CDC newRefersToCDC ) {
        if( newRefersToCDC != refersToCDC ) {
            NotificationChain msgs = null;
            if( refersToCDC != null )
                msgs = ( ( InternalEObject ) refersToCDC ).eInverseRemove( this,
                        NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT, CDC.class, msgs );
            if( newRefersToCDC != null )
                msgs = ( ( InternalEObject ) newRefersToCDC ).eInverseAdd( this,
                        NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT, CDC.class, msgs );
            msgs = basicSetRefersToCDC( newRefersToCDC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToCDCESet = refersToCDCESet;
            refersToCDCESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC,
                        newRefersToCDC, newRefersToCDC, !oldRefersToCDCESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToCDC( NotificationChain msgs ) {
        CDC oldRefersToCDC = refersToCDC;
        refersToCDC = null;
        boolean oldRefersToCDCESet = refersToCDCESet;
        refersToCDCESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC, oldRefersToCDC, null, oldRefersToCDCESet );
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
    public void unsetRefersToCDC() {
        if( refersToCDC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToCDC ).eInverseRemove( this,
                    NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT, CDC.class, msgs );
            msgs = basicUnsetRefersToCDC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToCDCESet = refersToCDCESet;
            refersToCDCESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC,
                        null, null, oldRefersToCDCESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToCDC() {
        return refersToCDCESet;
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
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition,
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
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT, PresenceCondition.class, msgs );
            if( newRefersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) newRefersToPresenceCondition ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT, PresenceCondition.class, msgs );
            msgs = basicSetRefersToPresenceCondition( newRefersToPresenceCondition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, newRefersToPresenceCondition,
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
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition, null,
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
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT, PresenceCondition.class, msgs );
            msgs = basicUnsetRefersToPresenceCondition( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, null, null,
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
    public DataAttribute getRefersToSizeAttribute() {
        return refersToSizeAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToSizeAttribute( DataAttribute newRefersToSizeAttribute,
            NotificationChain msgs ) {
        DataAttribute oldRefersToSizeAttribute = refersToSizeAttribute;
        refersToSizeAttribute = newRefersToSizeAttribute;
        boolean oldRefersToSizeAttributeESet = refersToSizeAttributeESet;
        refersToSizeAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE, oldRefersToSizeAttribute,
                    newRefersToSizeAttribute, !oldRefersToSizeAttributeESet );
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
    public void setRefersToSizeAttribute( DataAttribute newRefersToSizeAttribute ) {
        if( newRefersToSizeAttribute != refersToSizeAttribute ) {
            NotificationChain msgs = null;
            if( refersToSizeAttribute != null )
                msgs = ( ( InternalEObject ) refersToSizeAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                        msgs );
            if( newRefersToSizeAttribute != null )
                msgs = ( ( InternalEObject ) newRefersToSizeAttribute ).eInverseAdd( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                        msgs );
            msgs = basicSetRefersToSizeAttribute( newRefersToSizeAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToSizeAttributeESet = refersToSizeAttributeESet;
            refersToSizeAttributeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE, newRefersToSizeAttribute,
                        newRefersToSizeAttribute, !oldRefersToSizeAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToSizeAttribute( NotificationChain msgs ) {
        DataAttribute oldRefersToSizeAttribute = refersToSizeAttribute;
        refersToSizeAttribute = null;
        boolean oldRefersToSizeAttributeESet = refersToSizeAttributeESet;
        refersToSizeAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE, oldRefersToSizeAttribute, null,
                    oldRefersToSizeAttributeESet );
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
    public void unsetRefersToSizeAttribute() {
        if( refersToSizeAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToSizeAttribute ).eInverseRemove( this,
                    NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                    msgs );
            msgs = basicUnsetRefersToSizeAttribute( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToSizeAttributeESet = refersToSizeAttributeESet;
            refersToSizeAttributeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE, null, null,
                        oldRefersToSizeAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToSizeAttribute() {
        return refersToSizeAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataAttribute getRefersToMaxIndexAttribute() {
        return refersToMaxIndexAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToMaxIndexAttribute( DataAttribute newRefersToMaxIndexAttribute,
            NotificationChain msgs ) {
        DataAttribute oldRefersToMaxIndexAttribute = refersToMaxIndexAttribute;
        refersToMaxIndexAttribute = newRefersToMaxIndexAttribute;
        boolean oldRefersToMaxIndexAttributeESet = refersToMaxIndexAttributeESet;
        refersToMaxIndexAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE, oldRefersToMaxIndexAttribute,
                    newRefersToMaxIndexAttribute, !oldRefersToMaxIndexAttributeESet );
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
    public void setRefersToMaxIndexAttribute( DataAttribute newRefersToMaxIndexAttribute ) {
        if( newRefersToMaxIndexAttribute != refersToMaxIndexAttribute ) {
            NotificationChain msgs = null;
            if( refersToMaxIndexAttribute != null )
                msgs = ( ( InternalEObject ) refersToMaxIndexAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE,
                        DataAttribute.class, msgs );
            if( newRefersToMaxIndexAttribute != null )
                msgs = ( ( InternalEObject ) newRefersToMaxIndexAttribute ).eInverseAdd( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE,
                        DataAttribute.class, msgs );
            msgs = basicSetRefersToMaxIndexAttribute( newRefersToMaxIndexAttribute, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToMaxIndexAttributeESet = refersToMaxIndexAttributeESet;
            refersToMaxIndexAttributeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE, newRefersToMaxIndexAttribute,
                        newRefersToMaxIndexAttribute, !oldRefersToMaxIndexAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToMaxIndexAttribute( NotificationChain msgs ) {
        DataAttribute oldRefersToMaxIndexAttribute = refersToMaxIndexAttribute;
        refersToMaxIndexAttribute = null;
        boolean oldRefersToMaxIndexAttributeESet = refersToMaxIndexAttributeESet;
        refersToMaxIndexAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE, oldRefersToMaxIndexAttribute, null,
                    oldRefersToMaxIndexAttributeESet );
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
    public void unsetRefersToMaxIndexAttribute() {
        if( refersToMaxIndexAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToMaxIndexAttribute ).eInverseRemove( this,
                    NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE, DataAttribute.class,
                    msgs );
            msgs = basicUnsetRefersToMaxIndexAttribute( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToMaxIndexAttributeESet = refersToMaxIndexAttributeESet;
            refersToMaxIndexAttributeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE, null, null,
                        oldRefersToMaxIndexAttributeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToMaxIndexAttribute() {
        return refersToMaxIndexAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "SubDataObject::nameAttributeRequired";
        try {
            /**
             *
             * inv nameAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.name <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The name attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.SUB_DATA_OBJECT___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                final /*@NonInvalid*/ String name = this.getName();
                final /*@NonInvalid*/ boolean status = name != null;
                /*@NonInvalid*/ Object symbol_1;
                if( status ) {
                    symbol_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_name_32_attribute_32_is_32_required, status );
                    symbol_1 = symbol_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
        }
        catch( Throwable e ) {
            return ValueUtil.validationFailedDiagnostic( constraintName, this, diagnostics, context, e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean typeAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "SubDataObject::typeAttributeRequired";
        try {
            /**
             *
             * inv typeAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.type <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The type attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.SUB_DATA_OBJECT___TYPE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                final /*@NonInvalid*/ String type = this.getType();
                final /*@NonInvalid*/ boolean status = type != null;
                /*@NonInvalid*/ Object symbol_1;
                if( status ) {
                    symbol_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_type_32_attribute_32_is_32_required, status );
                    symbol_1 = symbol_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
        }
        catch( Throwable e ) {
            return ValueUtil.validationFailedDiagnostic( constraintName, this, diagnostics, context, e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            if( refersToPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            return basicSetRefersToPresCondArgsDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            if( refersToUnderlyingBasicType != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            return basicSetRefersToUnderlyingBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            if( refersToUnderlyingConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            return basicSetRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            if( refersToUnderlyingEnumeration != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            return basicSetRefersToUnderlyingEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentCDC( ( CDC ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC:
            if( refersToCDC != null )
                msgs = ( ( InternalEObject ) refersToCDC ).eInverseRemove( this,
                        NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT, CDC.class, msgs );
            return basicSetRefersToCDC( ( CDC ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            if( refersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT, PresenceCondition.class, msgs );
            return basicSetRefersToPresenceCondition( ( PresenceCondition ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE:
            if( refersToSizeAttribute != null )
                msgs = ( ( InternalEObject ) refersToSizeAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                        msgs );
            return basicSetRefersToSizeAttribute( ( DataAttribute ) otherEnd, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            if( refersToMaxIndexAttribute != null )
                msgs = ( ( InternalEObject ) refersToMaxIndexAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE,
                        DataAttribute.class, msgs );
            return basicSetRefersToMaxIndexAttribute( ( DataAttribute ) otherEnd, msgs );
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToPresCondArgsDoc( msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return basicUnsetRefersToUnderlyingBasicType( msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToUnderlyingConstructedAttribute( msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            return basicUnsetRefersToUnderlyingEnumeration( msgs );
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
            return basicSetParentCDC( null, msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC:
            return basicUnsetRefersToCDC( msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            return basicUnsetRefersToPresenceCondition( msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE:
            return basicUnsetRefersToSizeAttribute( msgs );
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            return basicUnsetRefersToMaxIndexAttribute( msgs );
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
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            return getRefersToPresCondArgsDoc();
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return getRefersToUnderlyingBasicType();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return getRefersToUnderlyingConstructedAttribute();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            return getRefersToUnderlyingEnumeration();
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            return getName();
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            return getType();
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
            return getParentCDC();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC:
            return getRefersToCDC();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            return getRefersToPresenceCondition();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE:
            return getRefersToSizeAttribute();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            return getRefersToMaxIndexAttribute();
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            setRefersToPresCondArgsDoc( ( Doc ) newValue );
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            setRefersToUnderlyingBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            setRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            setRefersToUnderlyingEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
            setParentCDC( ( CDC ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC:
            setRefersToCDC( ( CDC ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            setRefersToPresenceCondition( ( PresenceCondition ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE:
            setRefersToSizeAttribute( ( DataAttribute ) newValue );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            setRefersToMaxIndexAttribute( ( DataAttribute ) newValue );
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            unsetRefersToPresCondArgsDoc();
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            unsetRefersToUnderlyingBasicType();
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToUnderlyingConstructedAttribute();
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            unsetRefersToUnderlyingEnumeration();
            return;
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            unsetName();
            return;
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            unsetType();
            return;
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
            setParentCDC( ( CDC ) null );
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC:
            unsetRefersToCDC();
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            unsetRefersToPresenceCondition();
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE:
            unsetRefersToSizeAttribute();
            return;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            unsetRefersToMaxIndexAttribute();
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            return isSetRefersToPresCondArgsDoc();
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
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return isSetRefersToUnderlyingBasicType();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToUnderlyingConstructedAttribute();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            return isSetRefersToUnderlyingEnumeration();
        case NsdPackage.SUB_DATA_OBJECT__NAME:
            return isSetName();
        case NsdPackage.SUB_DATA_OBJECT__TYPE:
            return isSetType();
        case NsdPackage.SUB_DATA_OBJECT__PARENT_CDC:
            return getParentCDC() != null;
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC:
            return isSetRefersToCDC();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            return isSetRefersToPresenceCondition();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE:
            return isSetRefersToSizeAttribute();
        case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            return isSetRefersToMaxIndexAttribute();
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
            case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC;
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
            case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE;
            case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION;
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
            case NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC;
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
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
                return NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
                return NsdPackage.SUB_DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION;
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
    @SuppressWarnings( "unchecked" )
    public Object eInvoke( int operationID, EList< ? > arguments ) throws InvocationTargetException {
        switch( operationID ) {
        case NsdPackage.SUB_DATA_OBJECT___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return nameAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.SUB_DATA_OBJECT___TYPE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return typeAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
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

    /* Implicit link
     *   SubDataObject.type                 -> CDC.name
     *   SubDataObject.presCond             -> PresenceCondition.name
     *   SubDataObject.sizeAttribute        -> DataAttribute.name
     *   SubDataObject.maxIndexAttribute    -> DataAttribute.name
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        String id = getNsIdentification().getId();
        NsdResourceSetImpl rs = getResourceSet();
        if( rs == null ) return false;

        String messagePrefix = "[NSD links] while resolving link from SubDataObject (name: " + getName()
                + ", NS id: " + id + ", line: " + getLineNumber() + "): ";

        if( isSetType() ) {
            CDC foundCDC = rs.findCDC( getType(), getNsIdentification(), console );

            if( foundCDC == null ) {
                console.warning( messagePrefix + "CDC (name: " + getType() + ") not found" );
            }
            else {
                setRefersToCDC( foundCDC );
                console.info( "[NSD links] CDC (name: " + getType() + ") refers by SubDataObject (name: " + getName()
                        + ") in NS (id:" + id + ") found in NS (id:"
                        + getRefersToCDC().getParentCDCs().getParentNS().getId() + ")" );
            }
        }

        if( isSetPresCond() ) {
            PresenceCondition foundPC = rs.findPresenceCondition( getPresCond(), getNsIdentification(), console );

            if( foundPC == null ) {
                console.warning( messagePrefix + "PresenceCondition (name: " + getPresCond() + ") not found" );
            }
            else {
                setRefersToPresenceCondition( foundPC );
                console.info( "[NSD links] PresenceCondition (name: " + getPresCond()
                        + ") refers by SubDataObject (name: "
                        + getName() + ") in NS (id:" + id + ") found in NS (id:"
                        + getRefersToPresenceCondition().getParentPresenceConditions().getParentNS().getId() + ")" );
            }
        }

        if( isSetSizeAttribute() ) {
            getParentCDC()
                    .getDataAttribute()
                    .stream()
                    .filter( att -> att.getName().equals( getSizeAttribute() ) )
                    .findAny()
                    .ifPresent( att -> setRefersToSizeAttribute( att ) );

            if( isSetRefersToSizeAttribute() ) {
                console.info( "[NSD links] DataAttribute (name: " + getSizeAttribute()
                        + ") refers as sizeAttribute by SubDataObject (name: " + getName() + ") in NS (id:"
                        + id + ") found" );
            }
            else {
                console.warning( messagePrefix + "DataAttribute (name: " + getSizeAttribute() + ") not found" );
            }
        }

        if( isSetMaxIndexAttribute() ) {
            getParentCDC()
                    .getDataAttribute()
                    .stream()
                    .filter( att -> att.getName().equals( getSizeAttribute() ) )
                    .findAny()
                    .ifPresent( att -> setRefersToMaxIndexAttribute( att ) );

            if( isSetRefersToMaxIndexAttribute() ) {
                console.info( "[NSD links] DataAttribute (name: " + getMaxIndexAttribute()
                        + ") refers as maxIndexAttribute by DataAttribute (name: " + getName() + ") in NS (id:"
                        + id + ") found" );
            }
            else {
                console.warning( messagePrefix + "DataAttribute (name: " + getMaxIndexAttribute() + ") not found" );
            }
        }

        if( isSetPresCondArgsID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getPresCondArgsID() );
                if( doc != null ) setRefersToPresCondArgsDoc( doc );
            }
        }

        if( isSetUnderlyingTypeKind() ) {
            if( isSetUnderlyingType() ) {
                switch( getUnderlyingTypeKind().getValue() ) {
                case DefinedAttributeTypeKind.BASIC_VALUE:
                    BasicType foundBT = rs.findBasicType( getUnderlyingType(), getNsIdentification(), console );

                    if( foundBT == null ) {
                        console.warning( messagePrefix + "BasicType (name: " + getUnderlyingType() + ") not found" );
                    }
                    else {
                        setRefersToUnderlyingBasicType( foundBT );
                        console.info( "[NSD links] BasicType (name: " + getUnderlyingType()
                                + ") refers as type by SubDataObject (name: "
                                + getName() + ") in NS (id:" + id + ") found in NS (id:"
                                + getRefersToUnderlyingBasicType().getParentBasicTypes().getParentNS().getId() + ")" );
                    }
                    break;
                case DefinedAttributeTypeKind.CONSTRUCTED_VALUE:
                    ConstructedAttribute foundCA = rs.findConstructedAttribute( getUnderlyingType(),
                            getNsIdentification(),
                            console );

                    if( foundCA == null ) {
                        console.warning(
                                messagePrefix + "ConstructedAttribute (name: " + getUnderlyingType() + ") not found" );
                    }
                    else {
                        setRefersToUnderlyingConstructedAttribute( foundCA );
                        String foundWhere = "(???";
                        if( getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes() != null ) {
                            foundWhere = "NS (id:"
                                    + getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes()
                                            .getParentNS().getId();
                        }
                        else if( getRefersToUnderlyingConstructedAttribute()
                                .getParentServiceTypeRealizations() != null ) {
                            foundWhere = "ServiceNS (id:" + getRefersToUnderlyingConstructedAttribute()
                                    .getParentServiceTypeRealizations().getParentServiceNS().getId();
                        }
                        console.info( "[NSD links] ConstructedAttribute (name: " + getUnderlyingType()
                                + ") refers as type by SubDataObject (name: "
                                + getName() + ") in NS (id:" + id + ") found in "
                                + foundWhere + ")" );
                    }
                    break;
                case DefinedAttributeTypeKind.ENUMERATED_VALUE:
                    Enumeration foundEn = rs.findEnumeration( getUnderlyingType(), getNsIdentification(), console );

                    if( foundEn == null ) {
                        console.warning( messagePrefix + "Enumeration (name: " + getUnderlyingType() + ") not found" );
                    }
                    else {
                        setRefersToUnderlyingEnumeration( foundEn );
                        console.info( "[NSD links] Enumeration (name: " + getUnderlyingType()
                                + ") refers as type by SubDataObject (name: "
                                + getName() + ") in NS (id:" + id + ") found in NS (id:"
                                + getRefersToUnderlyingEnumeration().getParentEnumerations().getParentNS().getId()
                                + ")" );
                    }
                    break;
                }
            }
            else {
                console.warning( messagePrefix + "UnderlyingTypeKind is set but underlying type is missing" );
            }
        }

        return false;
    }

    @Override
    public NsIdentification getNsIdentification() {
        return ( ( CDCImpl ) getParentCDC() ).getNsIdentification();
    }

} //SubDataObjectImpl
