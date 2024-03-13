/*
*************************************************************************
**  Copyright (c) 2016-2024 CentraleSupélec & EDF.
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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getDsPresCond <em>Ds Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getDsPresCondArgs <em>Ds Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToDsPresCondArgsDoc <em>Refers To Ds Pres Cond Args Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getParentAnyLNClass <em>Parent Any LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToCDC <em>Refers To CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToPresenceCondition <em>Refers To Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getRefersToPresenceConditionDerivedStatistics <em>Refers To Presence Condition Derived Statistics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataObjectImpl extends DocumentedClassImpl implements DataObject {
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
     * This is true if the Ds Pres Cond Args attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dsPresCondArgsESet;

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
     * This is true if the Ds Pres Cond Args ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dsPresCondArgsIDESet;

    /**
     * The cached value of the '{@link #getRefersToDsPresCondArgsDoc() <em>Refers To Ds Pres Cond Args Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDsPresCondArgsDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDsPresCondArgsDoc;

    /**
     * This is true if the Refers To Ds Pres Cond Args Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDsPresCondArgsDocESet;

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
     * The cached value of the '{@link #getRefersToPresenceConditionDerivedStatistics() <em>Refers To Presence Condition Derived Statistics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToPresenceConditionDerivedStatistics()
     * @generated
     * @ordered
     */
    protected PresenceCondition refersToPresenceConditionDerivedStatistics;

    /**
     * This is true if the Refers To Presence Condition Derived Statistics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToPresenceConditionDerivedStatisticsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DATA_OBJECT;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__DS_PRES_COND, oldDsPresCond,
                    dsPresCond, !oldDsPresCondESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__DS_PRES_COND,
                    oldDsPresCond, DS_PRES_COND_EDEFAULT, oldDsPresCondESet ) );
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
        boolean oldDsPresCondArgsESet = dsPresCondArgsESet;
        dsPresCondArgsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS,
                    oldDsPresCondArgs, dsPresCondArgs, !oldDsPresCondArgsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDsPresCondArgs() {
        String oldDsPresCondArgs = dsPresCondArgs;
        boolean oldDsPresCondArgsESet = dsPresCondArgsESet;
        dsPresCondArgs = DS_PRES_COND_ARGS_EDEFAULT;
        dsPresCondArgsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS,
                    oldDsPresCondArgs, DS_PRES_COND_ARGS_EDEFAULT, oldDsPresCondArgsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDsPresCondArgs() {
        return dsPresCondArgsESet;
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
        boolean oldDsPresCondArgsIDESet = dsPresCondArgsIDESet;
        dsPresCondArgsIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID,
                    oldDsPresCondArgsID, dsPresCondArgsID, !oldDsPresCondArgsIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDsPresCondArgsID() {
        String oldDsPresCondArgsID = dsPresCondArgsID;
        boolean oldDsPresCondArgsIDESet = dsPresCondArgsIDESet;
        dsPresCondArgsID = DS_PRES_COND_ARGS_ID_EDEFAULT;
        dsPresCondArgsIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID,
                    oldDsPresCondArgsID, DS_PRES_COND_ARGS_ID_EDEFAULT, oldDsPresCondArgsIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDsPresCondArgsID() {
        return dsPresCondArgsIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDsPresCondArgsDoc() {
        return refersToDsPresCondArgsDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDsPresCondArgsDoc( Doc newRefersToDsPresCondArgsDoc,
            NotificationChain msgs ) {
        Doc oldRefersToDsPresCondArgsDoc = refersToDsPresCondArgsDoc;
        refersToDsPresCondArgsDoc = newRefersToDsPresCondArgsDoc;
        boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
        refersToDsPresCondArgsDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC, oldRefersToDsPresCondArgsDoc,
                    newRefersToDsPresCondArgsDoc, !oldRefersToDsPresCondArgsDocESet );
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
    public void setRefersToDsPresCondArgsDoc( Doc newRefersToDsPresCondArgsDoc ) {
        if( newRefersToDsPresCondArgsDoc != refersToDsPresCondArgsDoc ) {
            NotificationChain msgs = null;
            if( refersToDsPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToDsPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            if( newRefersToDsPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDsPresCondArgsDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            msgs = basicSetRefersToDsPresCondArgsDoc( newRefersToDsPresCondArgsDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
            refersToDsPresCondArgsDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC, newRefersToDsPresCondArgsDoc,
                        newRefersToDsPresCondArgsDoc, !oldRefersToDsPresCondArgsDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDsPresCondArgsDoc( NotificationChain msgs ) {
        Doc oldRefersToDsPresCondArgsDoc = refersToDsPresCondArgsDoc;
        refersToDsPresCondArgsDoc = null;
        boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
        refersToDsPresCondArgsDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC, oldRefersToDsPresCondArgsDoc, null,
                    oldRefersToDsPresCondArgsDocESet );
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
    public void unsetRefersToDsPresCondArgsDoc() {
        if( refersToDsPresCondArgsDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDsPresCondArgsDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            msgs = basicUnsetRefersToDsPresCondArgsDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDsPresCondArgsDocESet = refersToDsPresCondArgsDocESet;
            refersToDsPresCondArgsDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC, null, null,
                        oldRefersToDsPresCondArgsDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDsPresCondArgsDoc() {
        return refersToDsPresCondArgsDocESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__NAME, oldName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__PRES_COND, oldPresCond,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__PRES_COND, oldPresCond,
                    PRES_COND_EDEFAULT, oldPresCondESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__PRES_COND_ARGS,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__PRES_COND_ARGS,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, newRefersToPresCondArgsDoc,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc, null,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC, null, null,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__TRANSIENT, oldTransient,
                    transient_, !oldTransientESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__TRANSIENT, oldTransient,
                    TRANSIENT_EDEFAULT, oldTransientESet ) );
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
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__TYPE, oldType, type,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__TYPE, oldType,
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
    public AnyLNClass getParentAnyLNClass() {
        if( eContainerFeatureID() != NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS ) return null;
        return ( AnyLNClass ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLNClass( AnyLNClass newParentAnyLNClass, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAnyLNClass, NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAnyLNClass( AnyLNClass newParentAnyLNClass ) {
        if( newParentAnyLNClass != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS
                        && newParentAnyLNClass != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAnyLNClass ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAnyLNClass != null )
                msgs = ( ( InternalEObject ) newParentAnyLNClass ).eInverseAdd( this,
                        NsdPackage.ANY_LN_CLASS__DATA_OBJECT, AnyLNClass.class, msgs );
            msgs = basicSetParentAnyLNClass( newParentAnyLNClass, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS,
                    newParentAnyLNClass, newParentAnyLNClass ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__UNDERLYING_TYPE,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__UNDERLYING_TYPE,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, newRefersToUnderlyingBasicType,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType, null,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE, null, null,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE, null, null,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, oldRefersToUnderlyingEnumeration,
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, newRefersToUnderlyingEnumeration,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, oldRefersToUnderlyingEnumeration, null,
                    oldRefersToUnderlyingEnumerationESet );
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
                        NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION, null, null,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_CDC, oldRefersToCDC, newRefersToCDC, !oldRefersToCDCESet );
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
                        NsdPackage.CDC__REFERRED_BY_DATA_OBJECT, CDC.class, msgs );
            if( newRefersToCDC != null )
                msgs = ( ( InternalEObject ) newRefersToCDC ).eInverseAdd( this,
                        NsdPackage.CDC__REFERRED_BY_DATA_OBJECT, CDC.class, msgs );
            msgs = basicSetRefersToCDC( newRefersToCDC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToCDCESet = refersToCDCESet;
            refersToCDCESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__REFERS_TO_CDC,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_CDC, oldRefersToCDC, null, oldRefersToCDCESet );
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
            msgs = ( ( InternalEObject ) refersToCDC ).eInverseRemove( this, NsdPackage.CDC__REFERRED_BY_DATA_OBJECT,
                    CDC.class, msgs );
            msgs = basicUnsetRefersToCDC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToCDCESet = refersToCDCESet;
            refersToCDCESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_OBJECT__REFERS_TO_CDC, null,
                        null, oldRefersToCDCESet ) );
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition,
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
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT, PresenceCondition.class, msgs );
            if( newRefersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) newRefersToPresenceCondition ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT, PresenceCondition.class, msgs );
            msgs = basicSetRefersToPresenceCondition( newRefersToPresenceCondition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, newRefersToPresenceCondition,
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
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, oldRefersToPresenceCondition, null,
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
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT, PresenceCondition.class, msgs );
            msgs = basicUnsetRefersToPresenceCondition( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionESet = refersToPresenceConditionESet;
            refersToPresenceConditionESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION, null, null,
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
    public PresenceCondition getRefersToPresenceConditionDerivedStatistics() {
        return refersToPresenceConditionDerivedStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToPresenceConditionDerivedStatistics(
            PresenceCondition newRefersToPresenceConditionDerivedStatistics, NotificationChain msgs ) {
        PresenceCondition oldRefersToPresenceConditionDerivedStatistics = refersToPresenceConditionDerivedStatistics;
        refersToPresenceConditionDerivedStatistics = newRefersToPresenceConditionDerivedStatistics;
        boolean oldRefersToPresenceConditionDerivedStatisticsESet = refersToPresenceConditionDerivedStatisticsESet;
        refersToPresenceConditionDerivedStatisticsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS,
                    oldRefersToPresenceConditionDerivedStatistics, newRefersToPresenceConditionDerivedStatistics,
                    !oldRefersToPresenceConditionDerivedStatisticsESet );
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
    public void setRefersToPresenceConditionDerivedStatistics(
            PresenceCondition newRefersToPresenceConditionDerivedStatistics ) {
        if( newRefersToPresenceConditionDerivedStatistics != refersToPresenceConditionDerivedStatistics ) {
            NotificationChain msgs = null;
            if( refersToPresenceConditionDerivedStatistics != null )
                msgs = ( ( InternalEObject ) refersToPresenceConditionDerivedStatistics ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS,
                        PresenceCondition.class, msgs );
            if( newRefersToPresenceConditionDerivedStatistics != null )
                msgs = ( ( InternalEObject ) newRefersToPresenceConditionDerivedStatistics ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS,
                        PresenceCondition.class, msgs );
            msgs = basicSetRefersToPresenceConditionDerivedStatistics( newRefersToPresenceConditionDerivedStatistics,
                    msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionDerivedStatisticsESet = refersToPresenceConditionDerivedStatisticsESet;
            refersToPresenceConditionDerivedStatisticsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS,
                        newRefersToPresenceConditionDerivedStatistics, newRefersToPresenceConditionDerivedStatistics,
                        !oldRefersToPresenceConditionDerivedStatisticsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToPresenceConditionDerivedStatistics( NotificationChain msgs ) {
        PresenceCondition oldRefersToPresenceConditionDerivedStatistics = refersToPresenceConditionDerivedStatistics;
        refersToPresenceConditionDerivedStatistics = null;
        boolean oldRefersToPresenceConditionDerivedStatisticsESet = refersToPresenceConditionDerivedStatisticsESet;
        refersToPresenceConditionDerivedStatisticsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS,
                    oldRefersToPresenceConditionDerivedStatistics, null,
                    oldRefersToPresenceConditionDerivedStatisticsESet );
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
    public void unsetRefersToPresenceConditionDerivedStatistics() {
        if( refersToPresenceConditionDerivedStatistics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToPresenceConditionDerivedStatistics ).eInverseRemove( this,
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS,
                    PresenceCondition.class, msgs );
            msgs = basicUnsetRefersToPresenceConditionDerivedStatistics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToPresenceConditionDerivedStatisticsESet = refersToPresenceConditionDerivedStatisticsESet;
            refersToPresenceConditionDerivedStatisticsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS, null, null,
                        oldRefersToPresenceConditionDerivedStatisticsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToPresenceConditionDerivedStatistics() {
        return refersToPresenceConditionDerivedStatisticsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "DataObject::nameAttributeRequired";
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
                    NsdPackage.Literals.DATA_OBJECT___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
    public boolean typeAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "DataObject::typeAttributeRequired";
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
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.DATA_OBJECT___TYPE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String type = this.getType();
                final /*@NonInvalid*/ boolean status = type != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_type_32_attribute_32_is_32_required, status );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            if( refersToPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            return basicSetRefersToPresCondArgsDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            if( refersToDsPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToDsPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS, Doc.class, msgs );
            return basicSetRefersToDsPresCondArgsDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            if( refersToUnderlyingBasicType != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            return basicSetRefersToUnderlyingBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            if( refersToUnderlyingConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            return basicSetRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            if( refersToUnderlyingEnumeration != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            return basicSetRefersToUnderlyingEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAnyLNClass( ( AnyLNClass ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_CDC:
            if( refersToCDC != null )
                msgs = ( ( InternalEObject ) refersToCDC ).eInverseRemove( this,
                        NsdPackage.CDC__REFERRED_BY_DATA_OBJECT, CDC.class, msgs );
            return basicSetRefersToCDC( ( CDC ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            if( refersToPresenceCondition != null )
                msgs = ( ( InternalEObject ) refersToPresenceCondition ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT, PresenceCondition.class, msgs );
            return basicSetRefersToPresenceCondition( ( PresenceCondition ) otherEnd, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS:
            if( refersToPresenceConditionDerivedStatistics != null )
                msgs = ( ( InternalEObject ) refersToPresenceConditionDerivedStatistics ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS,
                        PresenceCondition.class, msgs );
            return basicSetRefersToPresenceConditionDerivedStatistics( ( PresenceCondition ) otherEnd, msgs );
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
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToPresCondArgsDoc( msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToDsPresCondArgsDoc( msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return basicUnsetRefersToUnderlyingBasicType( msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToUnderlyingConstructedAttribute( msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            return basicUnsetRefersToUnderlyingEnumeration( msgs );
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            return basicSetParentAnyLNClass( null, msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_CDC:
            return basicUnsetRefersToCDC( msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            return basicUnsetRefersToPresenceCondition( msgs );
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return basicUnsetRefersToPresenceConditionDerivedStatistics( msgs );
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
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.ANY_LN_CLASS__DATA_OBJECT, AnyLNClass.class,
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
        case NsdPackage.DATA_OBJECT__PRES_COND:
            return getPresCond();
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            return getRefersToPresCondArgsDoc();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            return getDsPresCond();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            return getDsPresCondArgs();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            return getDsPresCondArgsID();
        case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            return getRefersToDsPresCondArgsDoc();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return getRefersToUnderlyingBasicType();
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return getRefersToUnderlyingConstructedAttribute();
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            return getRefersToUnderlyingEnumeration();
        case NsdPackage.DATA_OBJECT__NAME:
            return getName();
        case NsdPackage.DATA_OBJECT__TRANSIENT:
            return isTransient();
        case NsdPackage.DATA_OBJECT__TYPE:
            return getType();
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            return getParentAnyLNClass();
        case NsdPackage.DATA_OBJECT__REFERS_TO_CDC:
            return getRefersToCDC();
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            return getRefersToPresenceCondition();
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return getRefersToPresenceConditionDerivedStatistics();
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
        case NsdPackage.DATA_OBJECT__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            setRefersToPresCondArgsDoc( ( Doc ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            setDsPresCond( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            setDsPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            setDsPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            setRefersToDsPresCondArgsDoc( ( Doc ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( DefinedAttributeTypeKind ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            setRefersToUnderlyingBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            setRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            setRefersToUnderlyingEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__TRANSIENT:
            setTransient( ( Boolean ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            setParentAnyLNClass( ( AnyLNClass ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_CDC:
            setRefersToCDC( ( CDC ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            setRefersToPresenceCondition( ( PresenceCondition ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS:
            setRefersToPresenceConditionDerivedStatistics( ( PresenceCondition ) newValue );
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
        case NsdPackage.DATA_OBJECT__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS:
            unsetPresCondArgs();
            return;
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID:
            unsetPresCondArgsID();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            unsetRefersToPresCondArgsDoc();
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            unsetDsPresCond();
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            unsetDsPresCondArgs();
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            unsetDsPresCondArgsID();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            unsetRefersToDsPresCondArgsDoc();
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            unsetUnderlyingType();
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            unsetRefersToUnderlyingBasicType();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToUnderlyingConstructedAttribute();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            unsetRefersToUnderlyingEnumeration();
            return;
        case NsdPackage.DATA_OBJECT__NAME:
            unsetName();
            return;
        case NsdPackage.DATA_OBJECT__TRANSIENT:
            unsetTransient();
            return;
        case NsdPackage.DATA_OBJECT__TYPE:
            unsetType();
            return;
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            setParentAnyLNClass( ( AnyLNClass ) null );
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_CDC:
            unsetRefersToCDC();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            unsetRefersToPresenceCondition();
            return;
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS:
            unsetRefersToPresenceConditionDerivedStatistics();
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
        case NsdPackage.DATA_OBJECT__PRES_COND:
            return isSetPresCond();
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS:
            return isSetPresCondArgs();
        case NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID:
            return isSetPresCondArgsID();
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
            return isSetRefersToPresCondArgsDoc();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            return isSetDsPresCond();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            return isSetDsPresCondArgs();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            return isSetDsPresCondArgsID();
        case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
            return isSetRefersToDsPresCondArgsDoc();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            return isSetUnderlyingType();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return isSetRefersToUnderlyingBasicType();
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToUnderlyingConstructedAttribute();
        case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
            return isSetRefersToUnderlyingEnumeration();
        case NsdPackage.DATA_OBJECT__NAME:
            return isSetName();
        case NsdPackage.DATA_OBJECT__TRANSIENT:
            return isSetTransient();
        case NsdPackage.DATA_OBJECT__TYPE:
            return isSetType();
        case NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS:
            return getParentAnyLNClass() != null;
        case NsdPackage.DATA_OBJECT__REFERS_TO_CDC:
            return isSetRefersToCDC();
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION:
            return isSetRefersToPresenceCondition();
        case NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return isSetRefersToPresenceConditionDerivedStatistics();
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
            case NsdPackage.DATA_OBJECT__PRES_COND:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND;
            case NsdPackage.DATA_OBJECT__PRES_COND_ARGS:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS;
            case NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID;
            case NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgPresenceConditionDerivedStatistics.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DATA_OBJECT__DS_PRES_COND:
                return NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND;
            case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
                return NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS;
            case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
                return NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID;
            case NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC:
                return NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgUnderlyingType.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
                return NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE;
            case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
                return NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND;
            case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE;
            case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION:
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
                return NsdPackage.DATA_OBJECT__PRES_COND;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS:
                return NsdPackage.DATA_OBJECT__PRES_COND_ARGS;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID:
                return NsdPackage.DATA_OBJECT__PRES_COND_ARGS_ID;
            case NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.DATA_OBJECT__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgPresenceConditionDerivedStatistics.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND:
                return NsdPackage.DATA_OBJECT__DS_PRES_COND;
            case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS:
                return NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS;
            case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__DS_PRES_COND_ARGS_ID:
                return NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID;
            case NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC:
                return NsdPackage.DATA_OBJECT__REFERS_TO_DS_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgUnderlyingType.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
                return NsdPackage.DATA_OBJECT__UNDERLYING_TYPE;
            case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
                return NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
                return NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_BASIC_TYPE;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
                return NsdPackage.DATA_OBJECT__REFERS_TO_UNDERLYING_ENUMERATION;
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
        case NsdPackage.DATA_OBJECT___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return nameAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.DATA_OBJECT___TYPE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
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
        result.append( ", dsPresCond: " );
        if( dsPresCondESet )
            result.append( dsPresCond );
        else
            result.append( "<unset>" );
        result.append( ", dsPresCondArgs: " );
        if( dsPresCondArgsESet )
            result.append( dsPresCondArgs );
        else
            result.append( "<unset>" );
        result.append( ", dsPresCondArgsID: " );
        if( dsPresCondArgsIDESet )
            result.append( dsPresCondArgsID );
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
        result.append( ", transient: " );
        if( transientESet )
            result.append( transient_ );
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

    //@formatter:off

    /* Implicit link
     *   DataObject.type                    -> CDC.name
     *   DataObject.presCond                -> PresenceCondition.name
     *   DataObject.dsPresCond              -> PresenceCondition.name
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "DataObjectImpl.buildExplicitLinks()" );

        if( super.buildExplicitLinks( console ) ) return true;

        NsdResourceSetImpl rs = getResourceSet();
        if( rs == null ) return false;

        String messagePrefix = "while resolving link from DataObject (name: " + getName() + "): ";

        if( isSetType() ) {
            CDC usedCDC = rs.findCDC( getType(), getNsIdentification(), true );
            if( usedCDC == null ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "CDC (name: ", getType(), ") not found" );
            }
            else {
                // Creation of parameterized CDC will be done after application of ServiceNS
                // This is because:
                // - we need to put the parameterized CDC in the namespace of the attribute used for parameterization
                //   so that we can find the validator for it
                // - but the ServiceNS may not be applied to this namespace
                // Example:
                // - CDC defined in 7-3
                // - parameterized by 8-1 using an enumeration of 7-4
                // - the parameterized CDC goes in 7-4
                // - the 8-1 ServiceNS is only applied to 7-3
                // See below createParameterizedComponents()

//                if( usedCDC.isTypeKindParameterized() ) {
//                    if( isSetUnderlyingType() && isSetUnderlyingTypeKind() ) {
//                        // Put this CDC in the same namespace/resource than this DataObject so that
//                        // the validator for the underlyingType is found
//                        NS ns = (( DocumentRoot ) eResource().getContents().get( 0 )).getNS();
//                        usedCDC = ( ( CDCImpl ) usedCDC ).getParameterizedCDC( getUnderlyingTypeKind(),
//                                getUnderlyingType(), ns, console );
//                    }
//                    else {
//                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                                messagePrefix, "CDC (name: ", getType(), ") is typeKindParameterized",
//                                ", but no underlyingType" );
//                    }
//                }
//                else if( usedCDC.isEnumParameterized() ) {
//                    if( isSetUnderlyingType() ) {
//                        // Put this CDC in the same namespace/resource than this DataObject so that
//                        // the validator for the underlyingType is found
//                        NS ns = (( DocumentRoot ) eResource().getContents().get( 0 )).getNS();
//                        usedCDC = ( ( CDCImpl ) usedCDC ).getParameterizedCDC( getUnderlyingType(), ns, console );
//                    }
//                    else {
//                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                                messagePrefix, "CDC (name: ", getType(), ") is enumParameterized",
//                                ", but no underlyingType" );
//                    }
//                }
//                else {
//                    // classic CDC
//                }
                setRefersToCDC( usedCDC );
                console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "CDC (name: ", getType(), ") found in NS \"",
                        NsIdentification.of( getRefersToCDC().getParentCDCs().getParentNS() ), "\"" );
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
                console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "PresenceCondition (name: ", getPresCond(), ") found in NS \"",
                        NsIdentification.of( getRefersToPresenceCondition().getParentPresenceConditions().getParentNS() ), "\"" );
            }
        }

        if( isSetDsPresCond() ) {
            PresenceCondition foundPC = rs.findPresenceCondition( getDsPresCond(), getNsIdentification(), true );
            if( foundPC == null ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "PresenceCondition (name: ", getDsPresCond(), ") not found" );
            }
            else {
                setRefersToPresenceConditionDerivedStatistics( foundPC );
                console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "PresenceCondition (name: ", getDsPresCond(), ") found in NS \"",
                        NsIdentification.of( getRefersToPresenceConditionDerivedStatistics().getParentPresenceConditions().getParentNS() ), "\"" );
            }
        }

        if( isSetPresCondArgsID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getPresCondArgsID() );
                if( doc != null ) setRefersToPresCondArgsDoc( doc );
            }
        }

        if( isSetDsPresCondArgsID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc( getNsIdentification(),
                        getDsPresCondArgsID() );
                if( doc != null ) setRefersToDsPresCondArgsDoc( doc );
            }
        }

        // underlyingTypeKind is not always set (see DomainLN/Beh), so we cannot rely on it
        /*
        if( isSetUnderlyingTypeKind() ) {
            if( isSetUnderlyingType() ) {
                switch( getUnderlyingTypeKind().getValue() ) {
                case DefinedAttributeTypeKind.BASIC_VALUE:
                    BasicType foundBT = rs.findBasicType( getUnderlyingType(), getNsIdentification(), true );

                    if( foundBT == null ) {
                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "BasicType (name: ", getUnderlyingType(), ") not found" );
                    }
                    else {
                        setRefersToUnderlyingBasicType( foundBT );
                        console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "BasicType (name: ", getUnderlyingType(), ") found in NS \"",
                                NsIdentification.of( getRefersToUnderlyingBasicType().getParentBasicTypes().getParentNS() ), "\"" );
                    }
                    break;
                case DefinedAttributeTypeKind.CONSTRUCTED_VALUE:
                    ConstructedAttribute foundCA = rs.findConstructedAttribute( getUnderlyingType(),
                            getNsIdentification(), true );

                    if( foundCA == null ) {
                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "ConstructedAttribute (name: ", getUnderlyingType(), ") not found" );
                    }
                    else {
                        setRefersToUnderlyingConstructedAttribute( foundCA );
                        String foundWhere = "???";
                        if( getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes() != null ) {
                            foundWhere = "NS \""
                                    + getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes()
                                            .getParentNS().getId();
                        }
                        else if( getRefersToUnderlyingConstructedAttribute()
                                .getParentServiceTypeRealizations() != null ) {
                            foundWhere = "ServiceNS \"" + getRefersToUnderlyingConstructedAttribute()
                                    .getParentServiceTypeRealizations().getParentServiceNS().getId();
                        }
                        console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "ConstructedAttribute (name: ", getUnderlyingType(), ") found in ",
                                foundWhere, "\"" );
                    }
                    break;
                case DefinedAttributeTypeKind.ENUMERATED_VALUE:
                    Enumeration foundEn = rs.findEnumeration( getUnderlyingType(), getNsIdentification(), true );

                    if( foundEn == null ) {
                        console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "Enumeration (name: ", getUnderlyingType(), ") not found" );
                    }
                    else {
                        setRefersToUnderlyingEnumeration( foundEn );
                        console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                                messagePrefix, "Enumeration (name: ", getUnderlyingType(), ") found in NS \"",
                                NsIdentification.of( getRefersToUnderlyingEnumeration().getParentEnumerations().getParentNS() ), "\"" );
                    }
                    break;
                }
            }
            else {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "UnderlyingTypeKind is set but underlying type is missing" );
            }
        }
        */
        
        if( isSetUnderlyingType() ) {
            boolean found = false;
            BasicType foundBT = rs.findBasicType( getUnderlyingType(), getNsIdentification(), true );
            if( foundBT != null ) {
                setRefersToUnderlyingBasicType( foundBT );
                found = true;
                console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "BasicType (name: ", getUnderlyingType(), ") found in NS \"",
                        NsIdentification.of( getRefersToUnderlyingBasicType().getParentBasicTypes().getParentNS() ), "\"" );
            }
            
            ConstructedAttribute foundCA = rs.findConstructedAttribute( getUnderlyingType(),
                    getNsIdentification(), true );
            if( foundCA != null ) {
                setRefersToUnderlyingConstructedAttribute( foundCA );
                found = true;
                String foundWhere = "???";
                if( getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes() != null ) {
                    foundWhere = "NS \""
                            + getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes()
                                    .getParentNS().getId();
                }
                else if( getRefersToUnderlyingConstructedAttribute()
                        .getParentServiceTypeRealizations() != null ) {
                    foundWhere = "ServiceNS \"" + getRefersToUnderlyingConstructedAttribute()
                            .getParentServiceTypeRealizations().getParentServiceNS().getId();
                }
                console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "ConstructedAttribute (name: ", getUnderlyingType(), ") found in ",
                        foundWhere, "\"" );
            }
            
            Enumeration foundEn = rs.findEnumeration( getUnderlyingType(), getNsIdentification(), true );
            if( foundEn != null ) {
                setRefersToUnderlyingEnumeration( foundEn );
                found = true;
                console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "Enumeration (name: ", getUnderlyingType(), ") found in NS \"",
                        NsIdentification.of( getRefersToUnderlyingEnumeration().getParentEnumerations().getParentNS() ), "\"" );
            }
            
            if( ! found ) {
                // IEC 61850-7-7
                // It exists also a specific case for parameterized enumeration where the enumeration will be
                // resolved at implementation and not in the NSD itself. To address this case, the specific
                // keyword “EnumDA”.
                if( ! "EnumDA".equals( getUnderlyingType() )) {
                    console.notice( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                            messagePrefix, "UnderlyingType is set but not found" );
                }
                else {
                    // TODO: is a message needed?
                }
            }
        }

        return false;
    }

    @Override
    public NsIdentification getNsIdentification() {
        return (( AnyLNClassImpl ) getParentAnyLNClass() ).getNsIdentification();
    }

    public void createParameterizedComponents( IRiseClipseConsole console, NsIdentification nsIdentification ) {
        String messagePrefix = "while building parameterized component for DataObject (name: " + getName() + "): ";
        CDC usedCDC = getRefersToCDC();
        if( usedCDC == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "The CDC (name: ", getType(), ") is unknown" );
            return;
        }
        if( usedCDC.isTypeKindParameterized() ) {
            if( isSetUnderlyingType() && isSetUnderlyingTypeKind() ) {
                // Put this CDC in the same namespace/resource than the underlyingType so that
                // the validator for the underlyingType is found
                NS ns = getResourceSet().getNS( nsIdentification );
                if( getRefersToUnderlyingBasicType() != null ) {
                    ns = getRefersToUnderlyingBasicType().getParentBasicTypes().getParentNS();
                }
                else if( getRefersToUnderlyingConstructedAttribute() != null ) {
                    ns = getRefersToUnderlyingConstructedAttribute().getParentConstructedAttributes().getParentNS();
                }
                usedCDC = ( ( CDCImpl ) usedCDC ).getParameterizedCDC( getUnderlyingTypeKind(),
                        getUnderlyingType(), ns, console );
            }
            else {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "CDC (name: ", getType(), ") is typeKindParameterized",
                        ", but no underlyingType" );
            }
        }
        else if( usedCDC.isEnumParameterized() ) {
            if( isSetUnderlyingType() ) {
                // Put this CDC in the same namespace/resource than the underlyingType so that
                // the validator for it is found
                NS ns = getResourceSet().getNS( nsIdentification );
                if( getRefersToUnderlyingEnumeration() != null ) {
                    ns = getRefersToUnderlyingEnumeration().getParentEnumerations().getParentNS();
                }
                usedCDC = (( CDCImpl ) usedCDC ).getParameterizedCDC( DefinedAttributeTypeKind.ENUMERATED, getUnderlyingType(), ns, console );
            }
            else {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "CDC (name: ", getType(), ") is enumParameterized",
                        ", but no underlyingType" );
            }
        }
        else {
            // classic CDC
        }
        setRefersToCDC( usedCDC );
    }

    //@formatter:on

} //DataObjectImpl
