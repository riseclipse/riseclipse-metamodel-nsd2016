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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getDsPresCond <em>Ds Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getDsPresCondArgs <em>Ds Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getDsPresCondArgsID <em>Ds Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataObjectImpl#getAnyLNClass <em>Any LN Class</em>}</li>
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
    public AnyLNClass getAnyLNClass() {
        if( eContainerFeatureID() != NsdPackage.DATA_OBJECT__ANY_LN_CLASS ) return null;
        return ( AnyLNClass ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnyLNClass( AnyLNClass newAnyLNClass, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newAnyLNClass, NsdPackage.DATA_OBJECT__ANY_LN_CLASS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAnyLNClass( AnyLNClass newAnyLNClass ) {
        if( newAnyLNClass != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.DATA_OBJECT__ANY_LN_CLASS && newAnyLNClass != null ) ) {
            if( EcoreUtil.isAncestor( this, newAnyLNClass ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newAnyLNClass != null )
                msgs = ( ( InternalEObject ) newAnyLNClass ).eInverseAdd( this, NsdPackage.ANY_LN_CLASS__DATA_OBJECT,
                        AnyLNClass.class, msgs );
            msgs = basicSetAnyLNClass( newAnyLNClass, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_OBJECT__ANY_LN_CLASS, newAnyLNClass,
                    newAnyLNClass ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetAnyLNClass( ( AnyLNClass ) otherEnd, msgs );
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
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
            return basicSetAnyLNClass( null, msgs );
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
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
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
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            return getDsPresCond();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            return getDsPresCondArgs();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            return getDsPresCondArgsID();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
        case NsdPackage.DATA_OBJECT__NAME:
            return getName();
        case NsdPackage.DATA_OBJECT__TRANSIENT:
            return isTransient();
        case NsdPackage.DATA_OBJECT__TYPE:
            return getType();
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
            return getAnyLNClass();
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
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            setDsPresCond( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            setDsPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            setDsPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( DefinedAttributeTypeKind ) newValue );
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
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
            setAnyLNClass( ( AnyLNClass ) newValue );
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
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            unsetDsPresCond();
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            unsetDsPresCondArgs();
            return;
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            unsetDsPresCondArgsID();
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            unsetUnderlyingType();
            return;
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
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
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
            setAnyLNClass( ( AnyLNClass ) null );
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
        case NsdPackage.DATA_OBJECT__DS_PRES_COND:
            return isSetDsPresCond();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS:
            return isSetDsPresCondArgs();
        case NsdPackage.DATA_OBJECT__DS_PRES_COND_ARGS_ID:
            return isSetDsPresCondArgsID();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE:
            return isSetUnderlyingType();
        case NsdPackage.DATA_OBJECT__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
        case NsdPackage.DATA_OBJECT__NAME:
            return isSetName();
        case NsdPackage.DATA_OBJECT__TRANSIENT:
            return isSetTransient();
        case NsdPackage.DATA_OBJECT__TYPE:
            return isSetType();
        case NsdPackage.DATA_OBJECT__ANY_LN_CLASS:
            return getAnyLNClass() != null;
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

    /* Implicit link
     *   DataObject.type                    -> CDC.name
     *   DataObject.presCond                -> PresenceCondition.name
     *   DataObject.dsPresCond              -> PresenceCondition.name
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        NS ns = getAnyLNClass().getLNClasses().getNS();
        if( isSetType() ) {
            CDC foundCDC = ns.findCDC( getType(), console );

            if( foundCDC == null ) {
                console.error( "CDC (name: " + getType() + ") refers by DataObject (name: " + getName() + ") in NS (id:"
                        + ns.getId() + ") is unknown" );
            }
            else {
                setRefersToCDC( foundCDC );
                console.verbose( "CDC (name: " + getType() + ") refers by DataObject (name: " + getName()
                        + ") in NS (id:" + ns.getId() + ") found in NS (id:"
                        + getRefersToCDC().getCDCs().getNS().getId() + ")" );
            }
        }

        if( isSetPresCond() ) {
            PresenceCondition foundPC = ns.findPresenceCondition( getPresCond(), console );

            if( foundPC == null ) {
                console.error( "PresenceCondition (name: " + getPresCond() + ") refers by DataObject (name: "
                        + getName() + ") in NS (id:" + ns.getId() + ") is unknown" );
            }
            else {
                setRefersToPresenceCondition( foundPC );
                console.verbose( "PresenceCondition (name: " + getPresCond() + ") refers by DataObject (name: "
                        + getName() + ") in NS (id:" + ns.getId() + ") found in NS (id:"
                        + getRefersToPresenceCondition().getPresenceConditions().getNS().getId() + ")" );
            }
        }

        if( isSetDsPresCond() ) {
            PresenceCondition foundPC = ns.findPresenceCondition( getDsPresCond(), console );
            if( foundPC == null ) {
                console.error(
                        "PresenceCondition (name: " + getDsPresCond() + ") refers by DataObject (name: " + getName()
                                + ") in NS (id:" + getAnyLNClass().getLNClasses().getNS().getId() + ") is unknown" );
            }
            else {
                setRefersToPresenceConditionDerivedStatistics( foundPC );
                console.verbose( "PresenceCondition (name: " + getDsPresCond() + ") refers by DataObject (name: "
                        + getName() + ") in NS (id:" + getAnyLNClass().getLNClasses().getNS().getId()
                        + ") found in NS (id:"
                        + getRefersToPresenceConditionDerivedStatistics().getPresenceConditions().getNS().getId()
                        + ")" );
            }
        }
        return false;
    }

} //DataObjectImpl
