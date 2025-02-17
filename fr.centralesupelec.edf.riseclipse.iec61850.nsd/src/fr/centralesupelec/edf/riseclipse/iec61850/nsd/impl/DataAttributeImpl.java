/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeTypeAndValues;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgTrgOp;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.UndefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getMaxIndexAttribute <em>Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getSizeAttribute <em>Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#isDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#isDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#isQchg <em>Qchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToBasicType <em>Refers To Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToEnumeration <em>Refers To Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getParentCDC <em>Parent CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getReferredBySubDataObjectAsSizeAttribute <em>Referred By Sub Data Object As Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getReferredBySubDataObjectAsMaxIndexAttribute <em>Referred By Sub Data Object As Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToFunctionalConstraint <em>Refers To Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToSizeAttribute <em>Refers To Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getRefersToMaxIndexAttribute <em>Refers To Max Index Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getReferredByDataAttributeAsSizeAttribute <em>Referred By Data Attribute As Size Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataAttributeImpl#getReferredByDataAttributeAsMaxIndexAttribute <em>Referred By Data Attribute As Max Index Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAttributeImpl extends DocumentedClassImpl implements DataAttribute {
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
     * The default value of the '{@link #isDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDchg()
     * @generated
     * @ordered
     */
    protected static final boolean DCHG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDchg()
     * @generated
     * @ordered
     */
    protected boolean dchg = DCHG_EDEFAULT;

    /**
     * This is true if the Dchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dchgESet;

    /**
     * The default value of the '{@link #isDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDupd()
     * @generated
     * @ordered
     */
    protected static final boolean DUPD_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDupd()
     * @generated
     * @ordered
     */
    protected boolean dupd = DUPD_EDEFAULT;

    /**
     * This is true if the Dupd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dupdESet;

    /**
     * The default value of the '{@link #isQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isQchg()
     * @generated
     * @ordered
     */
    protected static final boolean QCHG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isQchg()
     * @generated
     * @ordered
     */
    protected boolean qchg = QCHG_EDEFAULT;

    /**
     * This is true if the Qchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qchgESet;

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
     * The cached value of the '{@link #getReferredBySubDataObjectAsSizeAttribute() <em>Referred By Sub Data Object As Size Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySubDataObjectAsSizeAttribute()
     * @generated
     * @ordered
     */
    protected EList< SubDataObject > referredBySubDataObjectAsSizeAttribute;

    /**
     * The cached value of the '{@link #getReferredBySubDataObjectAsMaxIndexAttribute() <em>Referred By Sub Data Object As Max Index Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySubDataObjectAsMaxIndexAttribute()
     * @generated
     * @ordered
     */
    protected EList< SubDataObject > referredBySubDataObjectAsMaxIndexAttribute;

    /**
     * The cached value of the '{@link #getRefersToFunctionalConstraint() <em>Refers To Functional Constraint</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToFunctionalConstraint()
     * @generated
     * @ordered
     */
    protected FunctionalConstraint refersToFunctionalConstraint;

    /**
     * This is true if the Refers To Functional Constraint reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToFunctionalConstraintESet;

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
     * The cached value of the '{@link #getReferredByDataAttributeAsSizeAttribute() <em>Referred By Data Attribute As Size Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataAttributeAsSizeAttribute()
     * @generated
     * @ordered
     */
    protected EList< DataAttribute > referredByDataAttributeAsSizeAttribute;

    /**
     * The cached value of the '{@link #getReferredByDataAttributeAsMaxIndexAttribute() <em>Referred By Data Attribute As Max Index Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataAttributeAsMaxIndexAttribute()
     * @generated
     * @ordered
     */
    protected EList< DataAttribute > referredByDataAttributeAsMaxIndexAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DATA_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isDchg() {
        return dchg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDchg( boolean newDchg ) {
        boolean oldDchg = dchg;
        dchg = newDchg;
        boolean oldDchgESet = dchgESet;
        dchgESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__DCHG, oldDchg, dchg,
                    !oldDchgESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDchg() {
        boolean oldDchg = dchg;
        boolean oldDchgESet = dchgESet;
        dchg = DCHG_EDEFAULT;
        dchgESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__DCHG, oldDchg,
                    DCHG_EDEFAULT, oldDchgESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDchg() {
        return dchgESet;
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE,
                    oldDefaultValue, defaultValue, !oldDefaultValueESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE,
                    oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet ) );
        }
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
    public boolean isDupd() {
        return dupd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDupd( boolean newDupd ) {
        boolean oldDupd = dupd;
        dupd = newDupd;
        boolean oldDupdESet = dupdESet;
        dupdESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__DUPD, oldDupd, dupd,
                    !oldDupdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDupd() {
        boolean oldDupd = dupd;
        boolean oldDupdESet = dupdESet;
        dupd = DUPD_EDEFAULT;
        dupdESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__DUPD, oldDupd,
                    DUPD_EDEFAULT, oldDupdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDupd() {
        return dupdESet;
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__FC, oldFc, fc,
                    !oldFcESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__FC, oldFc, FC_EDEFAULT,
                    oldFcESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__IS_ARRAY, oldIsArray,
                    isArray, !oldIsArrayESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__IS_ARRAY, oldIsArray,
                    IS_ARRAY_EDEFAULT, oldIsArrayESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE,
                    oldMaxIndexAttribute, maxIndexAttribute, !oldMaxIndexAttributeESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE,
                    oldMaxIndexAttribute, MAX_INDEX_ATTRIBUTE_EDEFAULT, oldMaxIndexAttributeESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__MAX_VALUE, oldMaxValue,
                    maxValue, !oldMaxValueESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__MAX_VALUE, oldMaxValue,
                    MAX_VALUE_EDEFAULT, oldMaxValueESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__MIN_INDEX, oldMinIndex,
                    minIndex, !oldMinIndexESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__MIN_INDEX, oldMinIndex,
                    MIN_INDEX_EDEFAULT, oldMinIndexESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__MIN_VALUE, oldMinValue,
                    minValue, !oldMinValueESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__MIN_VALUE, oldMinValue,
                    MIN_VALUE_EDEFAULT, oldMinValueESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__NAME, oldName, name,
                    !oldNameESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
        }
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
    public CDC getParentCDC() {
        if( eContainerFeatureID() != NsdPackage.DATA_ATTRIBUTE__PARENT_CDC ) {
            return null;
        }
        return ( CDC ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCDC( CDC newParentCDC, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentCDC, NsdPackage.DATA_ATTRIBUTE__PARENT_CDC, msgs );
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
                || ( eContainerFeatureID() != NsdPackage.DATA_ATTRIBUTE__PARENT_CDC && newParentCDC != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentCDC ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentCDC != null ) {
                msgs = ( ( InternalEObject ) newParentCDC ).eInverseAdd( this, NsdPackage.CDC__DATA_ATTRIBUTE,
                        CDC.class, msgs );
            }
            msgs = basicSetParentCDC( newParentCDC, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__PARENT_CDC, newParentCDC,
                    newParentCDC ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__PRES_COND, oldPresCond,
                    presCond, !oldPresCondESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__PRES_COND, oldPresCond,
                    PRES_COND_EDEFAULT, oldPresCondESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS,
                    oldPresCondArgs, presCondArgs, !oldPresCondArgsESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS,
                    oldPresCondArgs, PRES_COND_ARGS_EDEFAULT, oldPresCondArgsESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID,
                    oldPresCondArgsID, presCondArgsID, !oldPresCondArgsIDESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID,
                    oldPresCondArgsID, PRES_COND_ARGS_ID_EDEFAULT, oldPresCondArgsIDESet ) );
        }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc,
                    newRefersToPresCondArgsDoc, !oldRefersToPresCondArgsDocESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToPresCondArgsDoc != null ) {
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            }
            if( newRefersToPresCondArgsDoc != null ) {
                msgs = ( ( InternalEObject ) newRefersToPresCondArgsDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            }
            msgs = basicSetRefersToPresCondArgsDoc( newRefersToPresCondArgsDoc, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToPresCondArgsDocESet = refersToPresCondArgsDocESet;
            refersToPresCondArgsDocESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, newRefersToPresCondArgsDoc,
                        newRefersToPresCondArgsDoc, !oldRefersToPresCondArgsDocESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc, null,
                    oldRefersToPresCondArgsDocESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToPresCondArgsDocESet = refersToPresCondArgsDocESet;
            refersToPresCondArgsDocESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, null, null,
                        oldRefersToPresCondArgsDocESet ) );
            }
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
    public boolean isQchg() {
        return qchg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQchg( boolean newQchg ) {
        boolean oldQchg = qchg;
        qchg = newQchg;
        boolean oldQchgESet = qchgESet;
        qchgESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__QCHG, oldQchg, qchg,
                    !oldQchgESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQchg() {
        boolean oldQchg = qchg;
        boolean oldQchgESet = qchgESet;
        qchg = QCHG_EDEFAULT;
        qchgESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__QCHG, oldQchg,
                    QCHG_EDEFAULT, oldQchgESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQchg() {
        return qchgESet;
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE,
                    oldSizeAttribute, sizeAttribute, !oldSizeAttributeESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE,
                    oldSizeAttribute, SIZE_ATTRIBUTE_EDEFAULT, oldSizeAttributeESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__TYPE, oldType, type,
                    !oldTypeESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__TYPE_KIND, oldTypeKind,
                    typeKind, !oldTypeKindESet ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_ATTRIBUTE__TYPE_KIND, oldTypeKind,
                    TYPE_KIND_EDEFAULT, oldTypeKindESet ) );
        }
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
    public EList< SubDataObject > getReferredBySubDataObjectAsSizeAttribute() {
        if( referredBySubDataObjectAsSizeAttribute == null ) {
            referredBySubDataObjectAsSizeAttribute = new EObjectWithInverseEList.Unsettable< >(
                    SubDataObject.class, this, NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_SIZE_ATTRIBUTE );
        }
        return referredBySubDataObjectAsSizeAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySubDataObjectAsSizeAttribute() {
        if( referredBySubDataObjectAsSizeAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredBySubDataObjectAsSizeAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySubDataObjectAsSizeAttribute() {
        return referredBySubDataObjectAsSizeAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) referredBySubDataObjectAsSizeAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubDataObject > getReferredBySubDataObjectAsMaxIndexAttribute() {
        if( referredBySubDataObjectAsMaxIndexAttribute == null ) {
            referredBySubDataObjectAsMaxIndexAttribute = new EObjectWithInverseEList.Unsettable< >(
                    SubDataObject.class, this,
                    NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_MAX_INDEX_ATTRIBUTE );
        }
        return referredBySubDataObjectAsMaxIndexAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySubDataObjectAsMaxIndexAttribute() {
        if( referredBySubDataObjectAsMaxIndexAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredBySubDataObjectAsMaxIndexAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySubDataObjectAsMaxIndexAttribute() {
        return referredBySubDataObjectAsMaxIndexAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) referredBySubDataObjectAsMaxIndexAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraint getRefersToFunctionalConstraint() {
        return refersToFunctionalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToFunctionalConstraint( FunctionalConstraint newRefersToFunctionalConstraint,
            NotificationChain msgs ) {
        FunctionalConstraint oldRefersToFunctionalConstraint = refersToFunctionalConstraint;
        refersToFunctionalConstraint = newRefersToFunctionalConstraint;
        boolean oldRefersToFunctionalConstraintESet = refersToFunctionalConstraintESet;
        refersToFunctionalConstraintESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT, oldRefersToFunctionalConstraint,
                    newRefersToFunctionalConstraint, !oldRefersToFunctionalConstraintESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToFunctionalConstraint( FunctionalConstraint newRefersToFunctionalConstraint ) {
        if( newRefersToFunctionalConstraint != refersToFunctionalConstraint ) {
            NotificationChain msgs = null;
            if( refersToFunctionalConstraint != null ) {
                msgs = ( ( InternalEObject ) refersToFunctionalConstraint ).eInverseRemove( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE, FunctionalConstraint.class,
                        msgs );
            }
            if( newRefersToFunctionalConstraint != null ) {
                msgs = ( ( InternalEObject ) newRefersToFunctionalConstraint ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE, FunctionalConstraint.class,
                        msgs );
            }
            msgs = basicSetRefersToFunctionalConstraint( newRefersToFunctionalConstraint, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionalConstraintESet = refersToFunctionalConstraintESet;
            refersToFunctionalConstraintESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT, newRefersToFunctionalConstraint,
                        newRefersToFunctionalConstraint, !oldRefersToFunctionalConstraintESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToFunctionalConstraint( NotificationChain msgs ) {
        FunctionalConstraint oldRefersToFunctionalConstraint = refersToFunctionalConstraint;
        refersToFunctionalConstraint = null;
        boolean oldRefersToFunctionalConstraintESet = refersToFunctionalConstraintESet;
        refersToFunctionalConstraintESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT, oldRefersToFunctionalConstraint, null,
                    oldRefersToFunctionalConstraintESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToFunctionalConstraint() {
        if( refersToFunctionalConstraint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToFunctionalConstraint ).eInverseRemove( this,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE, FunctionalConstraint.class, msgs );
            msgs = basicUnsetRefersToFunctionalConstraint( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionalConstraintESet = refersToFunctionalConstraintESet;
            refersToFunctionalConstraintESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT, null, null,
                        oldRefersToFunctionalConstraintESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToFunctionalConstraint() {
        return refersToFunctionalConstraintESet;
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition,
                    newRefersToPresenceCondition, !oldRefersToPresenceConditionESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToPresenceCondition != null ) {
                msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            }
            if( newRefersToPresenceCondition != null ) {
                msgs = ( ( InternalEObject ) newRefersToPresenceCondition ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            }
            msgs = basicSetRefersToPresenceCondition( newRefersToPresenceCondition, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, newRefersToPresenceCondition,
                        newRefersToPresenceCondition, !oldRefersToPresenceConditionESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition, null,
                    oldRefersToPresenceConditionESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            msgs = basicUnsetRefersToPresenceCondition( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION, null, null,
                        oldRefersToPresenceConditionESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE, oldRefersToSizeAttribute,
                    newRefersToSizeAttribute, !oldRefersToSizeAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToSizeAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToSizeAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                        msgs );
            }
            if( newRefersToSizeAttribute != null ) {
                msgs = ( ( InternalEObject ) newRefersToSizeAttribute ).eInverseAdd( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                        msgs );
            }
            msgs = basicSetRefersToSizeAttribute( newRefersToSizeAttribute, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSizeAttributeESet = refersToSizeAttributeESet;
            refersToSizeAttributeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE, newRefersToSizeAttribute,
                        newRefersToSizeAttribute, !oldRefersToSizeAttributeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE, oldRefersToSizeAttribute, null,
                    oldRefersToSizeAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                    msgs );
            msgs = basicUnsetRefersToSizeAttribute( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSizeAttributeESet = refersToSizeAttributeESet;
            refersToSizeAttributeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE, null, null,
                        oldRefersToSizeAttributeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE, oldRefersToMaxIndexAttribute,
                    newRefersToMaxIndexAttribute, !oldRefersToMaxIndexAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToMaxIndexAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToMaxIndexAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE,
                        DataAttribute.class, msgs );
            }
            if( newRefersToMaxIndexAttribute != null ) {
                msgs = ( ( InternalEObject ) newRefersToMaxIndexAttribute ).eInverseAdd( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE,
                        DataAttribute.class, msgs );
            }
            msgs = basicSetRefersToMaxIndexAttribute( newRefersToMaxIndexAttribute, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToMaxIndexAttributeESet = refersToMaxIndexAttributeESet;
            refersToMaxIndexAttributeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE, newRefersToMaxIndexAttribute,
                        newRefersToMaxIndexAttribute, !oldRefersToMaxIndexAttributeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE, oldRefersToMaxIndexAttribute, null,
                    oldRefersToMaxIndexAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE, DataAttribute.class,
                    msgs );
            msgs = basicUnsetRefersToMaxIndexAttribute( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToMaxIndexAttributeESet = refersToMaxIndexAttributeESet;
            refersToMaxIndexAttributeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE, null, null,
                        oldRefersToMaxIndexAttributeESet ) );
            }
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
    public EList< DataAttribute > getReferredByDataAttributeAsSizeAttribute() {
        if( referredByDataAttributeAsSizeAttribute == null ) {
            referredByDataAttributeAsSizeAttribute = new EObjectWithInverseEList.Unsettable< >(
                    DataAttribute.class, this, NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE );
        }
        return referredByDataAttributeAsSizeAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataAttributeAsSizeAttribute() {
        if( referredByDataAttributeAsSizeAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByDataAttributeAsSizeAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataAttributeAsSizeAttribute() {
        return referredByDataAttributeAsSizeAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) referredByDataAttributeAsSizeAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataAttribute > getReferredByDataAttributeAsMaxIndexAttribute() {
        if( referredByDataAttributeAsMaxIndexAttribute == null ) {
            referredByDataAttributeAsMaxIndexAttribute = new EObjectWithInverseEList.Unsettable< >(
                    DataAttribute.class, this,
                    NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE );
        }
        return referredByDataAttributeAsMaxIndexAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataAttributeAsMaxIndexAttribute() {
        if( referredByDataAttributeAsMaxIndexAttribute != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByDataAttributeAsMaxIndexAttribute ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataAttributeAsMaxIndexAttribute() {
        return referredByDataAttributeAsMaxIndexAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) referredByDataAttributeAsMaxIndexAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "DataAttribute::nameAttributeRequired";
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
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.DATA_ATTRIBUTE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String name = this.getName();
                final /*@NonInvalid*/ boolean status = name != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_name_32_attribute_32_is_32_required, status );
                    IF_status = TUP_;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, IF_status, NsdTables.INT_0 )
                        .booleanValue();
                IF_le = logDiagnostic;
            }
            return IF_le;
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
    public boolean fcAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "DataAttribute::fcAttributeRequired";
        try {
            /**
             *
             * inv fcAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.fc <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The fc attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.DATA_ATTRIBUTE___FC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String fc = this.getFc();
                final /*@NonInvalid*/ boolean status = fc != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_fc_32_attribute_32_is_32_required, status );
                    IF_status = TUP_;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, IF_status, NsdTables.INT_0 )
                        .booleanValue();
                IF_le = logDiagnostic;
            }
            return IF_le;
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, newRefersToBasicType,
                    !oldRefersToBasicTypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToBasicType != null ) {
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            }
            if( newRefersToBasicType != null ) {
                msgs = ( ( InternalEObject ) newRefersToBasicType ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            }
            msgs = basicSetRefersToBasicType( newRefersToBasicType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
            refersToBasicTypeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE,
                        newRefersToBasicType, newRefersToBasicType, !oldRefersToBasicTypeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, null,
                    oldRefersToBasicTypeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToBasicTypeESet = refersToBasicTypeESet;
            refersToBasicTypeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, null, null, oldRefersToBasicTypeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
                    newRefersToConstructedAttribute, !oldRefersToConstructedAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToConstructedAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            }
            if( newRefersToConstructedAttribute != null ) {
                msgs = ( ( InternalEObject ) newRefersToConstructedAttribute ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            }
            msgs = basicSetRefersToConstructedAttribute( newRefersToConstructedAttribute, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
            refersToConstructedAttributeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, newRefersToConstructedAttribute,
                        newRefersToConstructedAttribute, !oldRefersToConstructedAttributeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute, null,
                    oldRefersToConstructedAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToConstructedAttributeESet = refersToConstructedAttributeESet;
            refersToConstructedAttributeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, null, null,
                        oldRefersToConstructedAttributeESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, oldRefersToEnumeration, newRefersToEnumeration,
                    !oldRefersToEnumerationESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( refersToEnumeration != null ) {
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            }
            if( newRefersToEnumeration != null ) {
                msgs = ( ( InternalEObject ) newRefersToEnumeration ).eInverseAdd( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            }
            msgs = basicSetRefersToEnumeration( newRefersToEnumeration, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToEnumerationESet = refersToEnumerationESet;
            refersToEnumerationESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, newRefersToEnumeration,
                        newRefersToEnumeration, !oldRefersToEnumerationESet ) );
            }
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
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, oldRefersToEnumeration, null,
                    oldRefersToEnumerationESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
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
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToEnumerationESet = refersToEnumerationESet;
            refersToEnumerationESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, null, null, oldRefersToEnumerationESet ) );
            }
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            if( refersToPresCondArgsDoc != null ) {
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            }
            return basicSetRefersToPresCondArgsDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            if( refersToBasicType != null ) {
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            }
            return basicSetRefersToBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            if( refersToConstructedAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            }
            return basicSetRefersToConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            if( refersToEnumeration != null ) {
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            }
            return basicSetRefersToEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentCDC( ( CDC ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySubDataObjectAsSizeAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySubDataObjectAsMaxIndexAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT:
            if( refersToFunctionalConstraint != null ) {
                msgs = ( ( InternalEObject ) refersToFunctionalConstraint ).eInverseRemove( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__REFERRED_BY_DATA_ATTRIBUTE, FunctionalConstraint.class,
                        msgs );
            }
            return basicSetRefersToFunctionalConstraint( ( FunctionalConstraint ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            if( refersToPresenceCondition != null ) {
                msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE, PresenceCondition.class, msgs );
            }
            return basicSetRefersToPresenceCondition( ( PresenceCondition ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE:
            if( refersToSizeAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToSizeAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE, DataAttribute.class,
                        msgs );
            }
            return basicSetRefersToSizeAttribute( ( DataAttribute ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            if( refersToMaxIndexAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToMaxIndexAttribute ).eInverseRemove( this,
                        NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE,
                        DataAttribute.class, msgs );
            }
            return basicSetRefersToMaxIndexAttribute( ( DataAttribute ) otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataAttributeAsSizeAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataAttributeAsMaxIndexAttribute() )
                    .basicAdd( otherEnd, msgs );
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
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToPresCondArgsDoc( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return basicUnsetRefersToBasicType( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToConstructedAttribute( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return basicUnsetRefersToEnumeration( msgs );
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            return basicSetParentCDC( null, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredBySubDataObjectAsSizeAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredBySubDataObjectAsMaxIndexAttribute() ).basicRemove( otherEnd,
                    msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT:
            return basicUnsetRefersToFunctionalConstraint( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            return basicUnsetRefersToPresenceCondition( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE:
            return basicUnsetRefersToSizeAttribute( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            return basicUnsetRefersToMaxIndexAttribute( msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredByDataAttributeAsSizeAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredByDataAttributeAsMaxIndexAttribute() ).basicRemove( otherEnd,
                    msgs );
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
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            return eInternalContainer().eInverseRemove( this, NsdPackage.CDC__DATA_ATTRIBUTE, CDC.class, msgs );
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
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND:
            return getPresCond();
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return getRefersToPresCondArgsDoc();
        case NsdPackage.DATA_ATTRIBUTE__IS_ARRAY:
            return isIsArray();
        case NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            return getMaxIndexAttribute();
        case NsdPackage.DATA_ATTRIBUTE__MIN_INDEX:
            return getMinIndex();
        case NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            return getSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__DCHG:
            return isDchg();
        case NsdPackage.DATA_ATTRIBUTE__DUPD:
            return isDupd();
        case NsdPackage.DATA_ATTRIBUTE__QCHG:
            return isQchg();
        case NsdPackage.DATA_ATTRIBUTE__TYPE:
            return getType();
        case NsdPackage.DATA_ATTRIBUTE__TYPE_KIND:
            return getTypeKind();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return getRefersToBasicType();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return getRefersToConstructedAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return getRefersToEnumeration();
        case NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE:
            return getDefaultValue();
        case NsdPackage.DATA_ATTRIBUTE__MAX_VALUE:
            return getMaxValue();
        case NsdPackage.DATA_ATTRIBUTE__MIN_VALUE:
            return getMinValue();
        case NsdPackage.DATA_ATTRIBUTE__FC:
            return getFc();
        case NsdPackage.DATA_ATTRIBUTE__NAME:
            return getName();
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            return getParentCDC();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE:
            return getReferredBySubDataObjectAsSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE:
            return getReferredBySubDataObjectAsMaxIndexAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT:
            return getRefersToFunctionalConstraint();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            return getRefersToPresenceCondition();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE:
            return getRefersToSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            return getRefersToMaxIndexAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE:
            return getReferredByDataAttributeAsSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE:
            return getReferredByDataAttributeAsMaxIndexAttribute();
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
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            setRefersToPresCondArgsDoc( ( Doc ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__IS_ARRAY:
            setIsArray( ( Boolean ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            setMaxIndexAttribute( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__MIN_INDEX:
            setMinIndex( ( Long ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            setSizeAttribute( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__DCHG:
            setDchg( ( Boolean ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__DUPD:
            setDupd( ( Boolean ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__QCHG:
            setQchg( ( Boolean ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__TYPE_KIND:
            setTypeKind( ( Enumerator ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            setRefersToBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            setRefersToConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            setRefersToEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__MAX_VALUE:
            setMaxValue( ( BigDecimal ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__MIN_VALUE:
            setMinValue( ( BigDecimal ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__FC:
            setFc( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            setParentCDC( ( CDC ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE:
            getReferredBySubDataObjectAsSizeAttribute().clear();
            getReferredBySubDataObjectAsSizeAttribute().addAll( ( Collection< ? extends SubDataObject > ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE:
            getReferredBySubDataObjectAsMaxIndexAttribute().clear();
            getReferredBySubDataObjectAsMaxIndexAttribute()
                    .addAll( ( Collection< ? extends SubDataObject > ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT:
            setRefersToFunctionalConstraint( ( FunctionalConstraint ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            setRefersToPresenceCondition( ( PresenceCondition ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE:
            setRefersToSizeAttribute( ( DataAttribute ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            setRefersToMaxIndexAttribute( ( DataAttribute ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE:
            getReferredByDataAttributeAsSizeAttribute().clear();
            getReferredByDataAttributeAsSizeAttribute().addAll( ( Collection< ? extends DataAttribute > ) newValue );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE:
            getReferredByDataAttributeAsMaxIndexAttribute().clear();
            getReferredByDataAttributeAsMaxIndexAttribute()
                    .addAll( ( Collection< ? extends DataAttribute > ) newValue );
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
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS:
            unsetPresCondArgs();
            return;
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            unsetPresCondArgsID();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            unsetRefersToPresCondArgsDoc();
            return;
        case NsdPackage.DATA_ATTRIBUTE__IS_ARRAY:
            unsetIsArray();
            return;
        case NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            unsetMaxIndexAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__MIN_INDEX:
            unsetMinIndex();
            return;
        case NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            unsetSizeAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__DCHG:
            unsetDchg();
            return;
        case NsdPackage.DATA_ATTRIBUTE__DUPD:
            unsetDupd();
            return;
        case NsdPackage.DATA_ATTRIBUTE__QCHG:
            unsetQchg();
            return;
        case NsdPackage.DATA_ATTRIBUTE__TYPE:
            unsetType();
            return;
        case NsdPackage.DATA_ATTRIBUTE__TYPE_KIND:
            unsetTypeKind();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            unsetRefersToBasicType();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToConstructedAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            unsetRefersToEnumeration();
            return;
        case NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE:
            unsetDefaultValue();
            return;
        case NsdPackage.DATA_ATTRIBUTE__MAX_VALUE:
            unsetMaxValue();
            return;
        case NsdPackage.DATA_ATTRIBUTE__MIN_VALUE:
            unsetMinValue();
            return;
        case NsdPackage.DATA_ATTRIBUTE__FC:
            unsetFc();
            return;
        case NsdPackage.DATA_ATTRIBUTE__NAME:
            unsetName();
            return;
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            setParentCDC( ( CDC ) null );
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE:
            unsetReferredBySubDataObjectAsSizeAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE:
            unsetReferredBySubDataObjectAsMaxIndexAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT:
            unsetRefersToFunctionalConstraint();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            unsetRefersToPresenceCondition();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE:
            unsetRefersToSizeAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            unsetRefersToMaxIndexAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE:
            unsetReferredByDataAttributeAsSizeAttribute();
            return;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE:
            unsetReferredByDataAttributeAsMaxIndexAttribute();
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
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND:
            return isSetPresCond();
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS:
            return isSetPresCondArgs();
        case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return isSetPresCondArgsID();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return isSetRefersToPresCondArgsDoc();
        case NsdPackage.DATA_ATTRIBUTE__IS_ARRAY:
            return isSetIsArray();
        case NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
            return isSetMaxIndexAttribute();
        case NsdPackage.DATA_ATTRIBUTE__MIN_INDEX:
            return isSetMinIndex();
        case NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
            return isSetSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__DCHG:
            return isSetDchg();
        case NsdPackage.DATA_ATTRIBUTE__DUPD:
            return isSetDupd();
        case NsdPackage.DATA_ATTRIBUTE__QCHG:
            return isSetQchg();
        case NsdPackage.DATA_ATTRIBUTE__TYPE:
            return isSetType();
        case NsdPackage.DATA_ATTRIBUTE__TYPE_KIND:
            return isSetTypeKind();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return isSetRefersToBasicType();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToConstructedAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return isSetRefersToEnumeration();
        case NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE:
            return isSetDefaultValue();
        case NsdPackage.DATA_ATTRIBUTE__MAX_VALUE:
            return isSetMaxValue();
        case NsdPackage.DATA_ATTRIBUTE__MIN_VALUE:
            return isSetMinValue();
        case NsdPackage.DATA_ATTRIBUTE__FC:
            return isSetFc();
        case NsdPackage.DATA_ATTRIBUTE__NAME:
            return isSetName();
        case NsdPackage.DATA_ATTRIBUTE__PARENT_CDC:
            return getParentCDC() != null;
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_SIZE_ATTRIBUTE:
            return isSetReferredBySubDataObjectAsSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_SUB_DATA_OBJECT_AS_MAX_INDEX_ATTRIBUTE:
            return isSetReferredBySubDataObjectAsMaxIndexAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_FUNCTIONAL_CONSTRAINT:
            return isSetRefersToFunctionalConstraint();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION:
            return isSetRefersToPresenceCondition();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_SIZE_ATTRIBUTE:
            return isSetRefersToSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_MAX_INDEX_ATTRIBUTE:
            return isSetRefersToMaxIndexAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_SIZE_ATTRIBUTE:
            return isSetReferredByDataAttributeAsSizeAttribute();
        case NsdPackage.DATA_ATTRIBUTE__REFERRED_BY_DATA_ATTRIBUTE_AS_MAX_INDEX_ATTRIBUTE:
            return isSetReferredByDataAttributeAsMaxIndexAttribute();
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
            case NsdPackage.DATA_ATTRIBUTE__PRES_COND:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND;
            case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS;
            case NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID;
            case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgArray.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DATA_ATTRIBUTE__IS_ARRAY:
                return NsdPackage.AG_ARRAY__IS_ARRAY;
            case NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE:
                return NsdPackage.AG_ARRAY__MAX_INDEX_ATTRIBUTE;
            case NsdPackage.DATA_ATTRIBUTE__MIN_INDEX:
                return NsdPackage.AG_ARRAY__MIN_INDEX;
            case NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE:
                return NsdPackage.AG_ARRAY__SIZE_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgTrgOp.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DATA_ATTRIBUTE__DCHG:
                return NsdPackage.AG_TRG_OP__DCHG;
            case NsdPackage.DATA_ATTRIBUTE__DUPD:
                return NsdPackage.AG_TRG_OP__DUPD;
            case NsdPackage.DATA_ATTRIBUTE__QCHG:
                return NsdPackage.AG_TRG_OP__QCHG;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeType.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DATA_ATTRIBUTE__TYPE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__TYPE;
            case NsdPackage.DATA_ATTRIBUTE__TYPE_KIND:
                return NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND;
            case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE;
            case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeTypeAndValues.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE:
                return NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE;
            case NsdPackage.DATA_ATTRIBUTE__MAX_VALUE:
                return NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE;
            case NsdPackage.DATA_ATTRIBUTE__MIN_VALUE:
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
                return NsdPackage.DATA_ATTRIBUTE__PRES_COND;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS:
                return NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID:
                return NsdPackage.DATA_ATTRIBUTE__PRES_COND_ARGS_ID;
            case NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgArray.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ARRAY__IS_ARRAY:
                return NsdPackage.DATA_ATTRIBUTE__IS_ARRAY;
            case NsdPackage.AG_ARRAY__MAX_INDEX_ATTRIBUTE:
                return NsdPackage.DATA_ATTRIBUTE__MAX_INDEX_ATTRIBUTE;
            case NsdPackage.AG_ARRAY__MIN_INDEX:
                return NsdPackage.DATA_ATTRIBUTE__MIN_INDEX;
            case NsdPackage.AG_ARRAY__SIZE_ATTRIBUTE:
                return NsdPackage.DATA_ATTRIBUTE__SIZE_ATTRIBUTE;
            default:
                return -1;
            }
        }
        if( baseClass == AgTrgOp.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_TRG_OP__DCHG:
                return NsdPackage.DATA_ATTRIBUTE__DCHG;
            case NsdPackage.AG_TRG_OP__DUPD:
                return NsdPackage.DATA_ATTRIBUTE__DUPD;
            case NsdPackage.AG_TRG_OP__QCHG:
                return NsdPackage.DATA_ATTRIBUTE__QCHG;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeType.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
                return NsdPackage.DATA_ATTRIBUTE__TYPE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
                return NsdPackage.DATA_ATTRIBUTE__TYPE_KIND;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
                return NsdPackage.DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
                return NsdPackage.DATA_ATTRIBUTE__REFERS_TO_ENUMERATION;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeTypeAndValues.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__DEFAULT_VALUE:
                return NsdPackage.DATA_ATTRIBUTE__DEFAULT_VALUE;
            case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MAX_VALUE:
                return NsdPackage.DATA_ATTRIBUTE__MAX_VALUE;
            case NsdPackage.AG_ATTRIBUTE_TYPE_AND_VALUES__MIN_VALUE:
                return NsdPackage.DATA_ATTRIBUTE__MIN_VALUE;
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
        case NsdPackage.DATA_ATTRIBUTE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return nameAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.DATA_ATTRIBUTE___FC_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return fcAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (presCond: " );
        if( presCondESet ) {
            result.append( presCond );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", presCondArgs: " );
        if( presCondArgsESet ) {
            result.append( presCondArgs );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", presCondArgsID: " );
        if( presCondArgsIDESet ) {
            result.append( presCondArgsID );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", isArray: " );
        if( isArrayESet ) {
            result.append( isArray );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxIndexAttribute: " );
        if( maxIndexAttributeESet ) {
            result.append( maxIndexAttribute );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", minIndex: " );
        if( minIndexESet ) {
            result.append( minIndex );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", sizeAttribute: " );
        if( sizeAttributeESet ) {
            result.append( sizeAttribute );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dchg: " );
        if( dchgESet ) {
            result.append( dchg );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dupd: " );
        if( dupdESet ) {
            result.append( dupd );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", qchg: " );
        if( qchgESet ) {
            result.append( qchg );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", type: " );
        if( typeESet ) {
            result.append( type );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", typeKind: " );
        if( typeKindESet ) {
            result.append( typeKind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", defaultValue: " );
        if( defaultValueESet ) {
            result.append( defaultValue );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxValue: " );
        if( maxValueESet ) {
            result.append( maxValue );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", minValue: " );
        if( minValueESet ) {
            result.append( minValue );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", fc: " );
        if( fcESet ) {
            result.append( fc );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        if( nameESet ) {
            result.append( name );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    //@formatter:off

    /* Implicit link
     *   DataAttribute.fc                   -> FunctionalConstraint.abbreviation
     *   DataAttribute.presCond             -> PresenceCondition.name
     *   DataAttribute.sizeAttribute        -> DataAttribute.name
     *   DataAttribute.maxIndexAttribute    -> DataAttribute.name
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        return buildExplicitLinks( null, null, console );
    }

    public boolean buildExplicitLinks( DefinedAttributeTypeKind underlyingTypeKind, String underlyingType,
            IRiseClipseConsole console ) {

        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "DataAttributeImpl.buildExplicitLinks(): ",
                       getName(), " in CDC ", getParentCDC().getName() );

        if( super.buildExplicitLinks( console ) ) {
            return true;
        }

        NsdResourceSetImpl rs = getResourceSet();
        if( rs == null ) {
            return false;
        }

        String messagePrefix = "while resolving link from DataAttribute (name: " + getName() + "): ";

        if( isSetFc() ) {
            FunctionalConstraint foundFC = rs.findFunctionalConstraint( getFc(), getNsIdentification(), true );

            if( foundFC == null ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "FunctionalConstraint (abbreviation: ", getFc(), ") not found" );
            }
            else {
                setRefersToFunctionalConstraint( foundFC );
                String foundWhere = "(???";
                if( getRefersToFunctionalConstraint().getParentFunctionalConstraints().getParentNS() != null ) {
                    foundWhere = "NS \""
                            + NsIdentification.of(
                                    getRefersToFunctionalConstraint().getParentFunctionalConstraints().getParentNS() )
                            + "\"";
                }
                else if( getRefersToFunctionalConstraint().getParentFunctionalConstraints()
                        .getParentServiceNS() != null ) {
                    foundWhere = "ServiceNS \""
                            + NsIdentification.of( getRefersToFunctionalConstraint().getParentFunctionalConstraints()
                                    .getParentServiceNS() )
                            + "\"";
                }
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "FunctionalConstraint (abbreviation: ", getFc(), ") found in ",
                        foundWhere, ")" );
            }
        }

        if( isSetPresCond() ) {
            PresenceCondition foundPC = rs.findPresenceCondition( getPresCond(), getNsIdentification(), true );

            if( foundPC == null ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "PresenceCondition (name: ", getPresCond(), ") not found" );
            }
            else {
                setRefersToPresenceCondition( foundPC );
                String foundWhere = "(???";
                if( getRefersToPresenceCondition().getParentPresenceConditions().getParentNS() != null ) {
                    foundWhere = "NS \""
                            + NsIdentification.of(
                                    getRefersToPresenceCondition().getParentPresenceConditions().getParentNS() )
                            + "\"";
                }
                else if( getRefersToPresenceCondition().getParentPresenceConditions().getParentServiceNS() != null ) {
                    foundWhere = "ServiceNS \""
                            + NsIdentification.of(
                                    getRefersToPresenceCondition().getParentPresenceConditions().getParentServiceNS() )
                            + "\"";
                }
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "PresenceCondition (name: ", getPresCond(), ") found in ",
                        foundWhere, ")" );
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
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "DataAttribute (name: ", getSizeAttribute(), ") found" );
            }
            else {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "DataAttribute (name: ", getSizeAttribute(), ") not found" );
            }
        }

        if( isSetMaxIndexAttribute() ) {
            getParentCDC()
                    .getDataAttribute()
                    .stream()
                    .filter( att -> att.getName().equals( getMaxIndexAttribute() ) )
                    .findAny()
                    .ifPresent( att -> setRefersToMaxIndexAttribute( att ) );

            if( isSetRefersToMaxIndexAttribute() ) {
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "DataAttribute (name: ",
                        getMaxIndexAttribute(), ") found" );
            }
            else {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "DataAttribute (name: ",
                        getMaxIndexAttribute(), ") not found" );
            }
        }

        if(( ! isSetType() ) && ( underlyingType != null )) {
            setType( underlyingType );
            if( underlyingTypeKind != null ) {
                setTypeKind( underlyingTypeKind );
            }
        }
        if( getTypeKind() instanceof DefinedAttributeTypeKind ) {
            if( isSetType() ) {
                switch( getTypeKind().getValue() ) {
                case DefinedAttributeTypeKind.BASIC_VALUE:
                    BasicType foundBT = rs.findBasicType( getType(), getNsIdentification(), true );

                    if( foundBT == null ) {
                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "BasicType (name: ", getType(), ") not found" );
                    }
                    else {
                        setRefersToBasicType( foundBT );
                        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "BasicType (name: ", getType(), ") found in NS \"",
                                NsIdentification.of( getRefersToBasicType().getParentBasicTypes().getParentNS() ), "\"" );
                    }
                    break;
                case DefinedAttributeTypeKind.CONSTRUCTED_VALUE:
                    ConstructedAttribute foundCA = rs.findConstructedAttribute( getType(), getNsIdentification(),
                            true );

                    if( foundCA == null ) {
                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "ConstructedAttribute (name: ", getType(), ") not found" );
                    }
                    else {
                        if( foundCA instanceof ServiceConstructedAttribute ) {
                            ServiceConstructedAttribute sca = ( ServiceConstructedAttribute ) foundCA;
                            if( sca.isSetTypeKindParameterized() ) {
                                if( underlyingType != null ) {
                                    // The parameterized SCA must be put in the same namespace than
                                    // this DataAttribute so that underlyingType is found
                                    sca = ( ( ServiceConstructedAttributeImpl ) sca )
                                            .getParameterizedServiceConstructedAttribute( underlyingTypeKind,
                                                    underlyingType, getNsIdentification(), console );
                                }
                                else if(( DefinedAttributeTypeKind.ENUMERATED.equals( underlyingTypeKind ) && getParentCDC().isEnumParameterized() )) {
                                    if((( CDCImpl ) getParentCDC() ).getUnderlyingType() != null ) {
                                        sca = ( ( ServiceConstructedAttributeImpl ) sca )
                                                .getParameterizedServiceConstructedAttribute( underlyingTypeKind,
                                                        (( CDCImpl ) getParentCDC() ).getUnderlyingType(), getNsIdentification(), console );
                                    }
                                    else {
                                        // This is not a problem if is is added to a CDC which is parameterized
                                        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                                messagePrefix, "ServiceConstructedAttribute (name: ", getType(),
                                                ") is typeKindParameterized but no underlyingType" );
                                    }
                                }
                                else {
                                    // This is not a problem if is is added to a CDC which is parameterized
                                    console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                            messagePrefix, "ServiceConstructedAttribute (name: ", getType(),
                                            ") is typeKindParameterized but no underlyingTypeKind" );
                                }
                            }
                            foundCA = sca;
                        }
                        setRefersToConstructedAttribute( foundCA );
                        String foundWhere = "(???";
                        if( getRefersToConstructedAttribute().getParentConstructedAttributes() != null ) {
                            foundWhere = "NS \""
                                    + NsIdentification.of( getRefersToConstructedAttribute()
                                            .getParentConstructedAttributes().getParentNS() )
                                    + "\"";
                        }
                        else if( getRefersToConstructedAttribute().getParentServiceTypeRealizations() != null ) {
                            foundWhere = "ServiceNS \""
                                    + NsIdentification.of( getRefersToConstructedAttribute()
                                            .getParentServiceTypeRealizations().getParentServiceNS() )
                                    + "\"";
                        }
                        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "ConstructedAttribute (name: ", getType(), ") found in ",
                                foundWhere, ")" );
                    }
                    break;
                case DefinedAttributeTypeKind.ENUMERATED_VALUE:
                    // IEC 61850-7-7
                    // It exists also a specific case for parameterized enumeration where the enumeration will be
                    // resolved at implementation and not in the NSD itself. To address this case, the specific
                    // keyword “EnumDA”.
                    if( ! "EnumDA".equals( getType() )) {
                        Enumeration foundEn = rs.findEnumeration( getType(), getNsIdentification(), true );

                        if( foundEn == null ) {
                            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                    messagePrefix, "Enumeration (name: ", getType(), ") not found" );
                        }
                        else {
                            setRefersToEnumeration( foundEn );
                            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                    messagePrefix, "Enumeration (name: ", getType(), ") found in NS \"",
                                    NsIdentification.of( getRefersToEnumeration().getParentEnumerations().getParentNS() ), "\"" );
                        }
                    }
                    else {
                        // TODO: is a message needed?
                    }
                    break;
                }
            }
            else {
                // type for ENUMERATED may be missing if CDC has enumParameterized="true"
                if( ( getTypeKind().getValue() == DefinedAttributeTypeKind.ENUMERATED_VALUE ) ) {
                    if( getParentCDC().isEnumParameterized() ) {
                        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "type is missing for ", getTypeKind(),
                                " but enumParameterized in parent CDC is true" );
                        getParentCDC().getParameterizedDataAttributeNames().add( getName() );
                    }
                    else {
                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "type is missing for ", getTypeKind(),
                                " and enumParameterized in parent CDC is false" );
                    }
                }
                else {
                    console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                            messagePrefix, "type is missing for ", getTypeKind() );
                }
            }
        }
        else if( getTypeKind() instanceof UndefinedAttributeTypeKind ) {
            // type may be missing if CDC has typeKindParameterized="true"
            if( getParentCDC().isTypeKindParameterized() ) {
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "type is missing for ", getTypeKind(),
                        " but typeKindParameterized in parent CDC is true" );
                getParentCDC().getParameterizedDataAttributeNames().add( getName() );
            }
            else {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "typeKind is ", getTypeKind(),
                        " and typeKindParameterized in parent CDC is false" );
            }
        }
        else {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "typeKind is missing" );
        }

        if( isSetPresCondArgsID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getPresCondArgsID() );
                if( doc != null ) {
                    setRefersToPresCondArgsDoc( doc );
                }
            }
        }

        return false;
}

    @Override
    public NsIdentification getNsIdentification() {
        return (( CDCImpl ) getParentCDC() ).getNsIdentification();
    }

    //@formatter:on

} //DataAttributeImpl
