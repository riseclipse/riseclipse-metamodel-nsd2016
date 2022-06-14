/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.BagValue.Accumulator;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getSubDataObject <em>Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getDataAttribute <em>Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getServiceParameter <em>Service Parameter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#isEnumParameterized <em>Enum Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#isStatistics <em>Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#isTypeKindParameterized <em>Type Kind Parameterized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getParentCDCs <em>Parent CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getReferredByDataObject <em>Referred By Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCImpl#getParameterizedDataAttribute <em>Parameterized Data Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDCImpl extends TitledClassImpl implements CDC {
    /**
     * The cached value of the '{@link #getSubDataObject() <em>Sub Data Object</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubDataObject()
     * @generated
     * @ordered
     */
    protected EList< SubDataObject > subDataObject;

    /**
     * The cached value of the '{@link #getDataAttribute() <em>Data Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< DataAttribute > dataAttribute;

    /**
     * The cached value of the '{@link #getServiceParameter() <em>Service Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceParameter()
     * @generated
     * @ordered
     */
    protected ServiceParameter serviceParameter;

    /**
     * This is true if the Service Parameter containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceParameterESet;

    /**
     * The default value of the '{@link #isEnumParameterized() <em>Enum Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnumParameterized()
     * @generated
     * @ordered
     */
    protected static final boolean ENUM_PARAMETERIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isEnumParameterized() <em>Enum Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnumParameterized()
     * @generated
     * @ordered
     */
    protected boolean enumParameterized = ENUM_PARAMETERIZED_EDEFAULT;

    /**
     * This is true if the Enum Parameterized attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enumParameterizedESet;

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
     * The default value of the '{@link #isStatistics() <em>Statistics</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatistics()
     * @generated
     * @ordered
     */
    protected static final boolean STATISTICS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStatistics() <em>Statistics</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatistics()
     * @generated
     * @ordered
     */
    protected boolean statistics = STATISTICS_EDEFAULT;

    /**
     * This is true if the Statistics attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statisticsESet;

    /**
     * The default value of the '{@link #isTypeKindParameterized() <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTypeKindParameterized()
     * @generated
     * @ordered
     */
    protected static final boolean TYPE_KIND_PARAMETERIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTypeKindParameterized() <em>Type Kind Parameterized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTypeKindParameterized()
     * @generated
     * @ordered
     */
    protected boolean typeKindParameterized = TYPE_KIND_PARAMETERIZED_EDEFAULT;

    /**
     * This is true if the Type Kind Parameterized attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeKindParameterizedESet;

    /**
     * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariant()
     * @generated
     * @ordered
     */
    protected static final String VARIANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariant()
     * @generated
     * @ordered
     */
    protected String variant = VARIANT_EDEFAULT;

    /**
     * This is true if the Variant attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean variantESet;

    /**
     * The cached value of the '{@link #getReferredByDataObject() <em>Referred By Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataObject()
     * @generated
     * @ordered
     */
    protected EList< DataObject > referredByDataObject;

    /**
     * The cached value of the '{@link #getReferredBySubDataObject() <em>Referred By Sub Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySubDataObject()
     * @generated
     * @ordered
     */
    protected EList< SubDataObject > referredBySubDataObject;

    /**
     * The cached value of the '{@link #getParameterizedDataAttribute() <em>Parameterized Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterizedDataAttribute()
     * @generated
     * @ordered
     */
    protected DataAttribute parameterizedDataAttribute;

    /**
     * This is true if the Parameterized Data Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean parameterizedDataAttributeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CDCImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.CDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubDataObject > getSubDataObject() {
        if( subDataObject == null ) {
            subDataObject = new EObjectContainmentWithInverseEList.Unsettable< >( SubDataObject.class,
                    this, NsdPackage.CDC__SUB_DATA_OBJECT, NsdPackage.SUB_DATA_OBJECT__PARENT_CDC );
        }
        return subDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubDataObject() {
        if( subDataObject != null ) ( ( InternalEList.Unsettable< ? > ) subDataObject ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubDataObject() {
        return subDataObject != null && ( ( InternalEList.Unsettable< ? > ) subDataObject ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataAttribute > getDataAttribute() {
        if( dataAttribute == null ) {
            dataAttribute = new EObjectContainmentWithInverseEList.Unsettable< >( DataAttribute.class,
                    this, NsdPackage.CDC__DATA_ATTRIBUTE, NsdPackage.DATA_ATTRIBUTE__PARENT_CDC );
        }
        return dataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataAttribute() {
        if( dataAttribute != null ) ( ( InternalEList.Unsettable< ? > ) dataAttribute ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataAttribute() {
        return dataAttribute != null && ( ( InternalEList.Unsettable< ? > ) dataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceParameter getServiceParameter() {
        return serviceParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceParameter( ServiceParameter newServiceParameter, NotificationChain msgs ) {
        ServiceParameter oldServiceParameter = serviceParameter;
        serviceParameter = newServiceParameter;
        boolean oldServiceParameterESet = serviceParameterESet;
        serviceParameterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.CDC__SERVICE_PARAMETER, oldServiceParameter, newServiceParameter,
                    !oldServiceParameterESet );
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
    public void setServiceParameter( ServiceParameter newServiceParameter ) {
        if( newServiceParameter != serviceParameter ) {
            NotificationChain msgs = null;
            if( serviceParameter != null )
                msgs = ( ( InternalEObject ) serviceParameter ).eInverseRemove( this,
                        NsdPackage.SERVICE_PARAMETER__PARENT_CDC, ServiceParameter.class, msgs );
            if( newServiceParameter != null )
                msgs = ( ( InternalEObject ) newServiceParameter ).eInverseAdd( this,
                        NsdPackage.SERVICE_PARAMETER__PARENT_CDC, ServiceParameter.class, msgs );
            msgs = basicSetServiceParameter( newServiceParameter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceParameterESet = serviceParameterESet;
            serviceParameterESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__SERVICE_PARAMETER,
                        newServiceParameter, newServiceParameter, !oldServiceParameterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceParameter( NotificationChain msgs ) {
        ServiceParameter oldServiceParameter = serviceParameter;
        serviceParameter = null;
        boolean oldServiceParameterESet = serviceParameterESet;
        serviceParameterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.CDC__SERVICE_PARAMETER, oldServiceParameter, null, oldServiceParameterESet );
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
    public void unsetServiceParameter() {
        if( serviceParameter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceParameter ).eInverseRemove( this,
                    NsdPackage.SERVICE_PARAMETER__PARENT_CDC, ServiceParameter.class, msgs );
            msgs = basicUnsetServiceParameter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceParameterESet = serviceParameterESet;
            serviceParameterESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__SERVICE_PARAMETER, null, null,
                        oldServiceParameterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceParameter() {
        return serviceParameterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isEnumParameterized() {
        return enumParameterized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnumParameterized( boolean newEnumParameterized ) {
        boolean oldEnumParameterized = enumParameterized;
        enumParameterized = newEnumParameterized;
        boolean oldEnumParameterizedESet = enumParameterizedESet;
        enumParameterizedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__ENUM_PARAMETERIZED,
                    oldEnumParameterized, enumParameterized, !oldEnumParameterizedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnumParameterized() {
        boolean oldEnumParameterized = enumParameterized;
        boolean oldEnumParameterizedESet = enumParameterizedESet;
        enumParameterized = ENUM_PARAMETERIZED_EDEFAULT;
        enumParameterizedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__ENUM_PARAMETERIZED,
                    oldEnumParameterized, ENUM_PARAMETERIZED_EDEFAULT, oldEnumParameterizedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnumParameterized() {
        return enumParameterizedESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
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
    public boolean isStatistics() {
        return statistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatistics( boolean newStatistics ) {
        boolean oldStatistics = statistics;
        statistics = newStatistics;
        boolean oldStatisticsESet = statisticsESet;
        statisticsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__STATISTICS, oldStatistics,
                    statistics, !oldStatisticsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatistics() {
        boolean oldStatistics = statistics;
        boolean oldStatisticsESet = statisticsESet;
        statistics = STATISTICS_EDEFAULT;
        statisticsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__STATISTICS, oldStatistics,
                    STATISTICS_EDEFAULT, oldStatisticsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatistics() {
        return statisticsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isTypeKindParameterized() {
        return typeKindParameterized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTypeKindParameterized( boolean newTypeKindParameterized ) {
        boolean oldTypeKindParameterized = typeKindParameterized;
        typeKindParameterized = newTypeKindParameterized;
        boolean oldTypeKindParameterizedESet = typeKindParameterizedESet;
        typeKindParameterizedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__TYPE_KIND_PARAMETERIZED,
                    oldTypeKindParameterized, typeKindParameterized, !oldTypeKindParameterizedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTypeKindParameterized() {
        boolean oldTypeKindParameterized = typeKindParameterized;
        boolean oldTypeKindParameterizedESet = typeKindParameterizedESet;
        typeKindParameterized = TYPE_KIND_PARAMETERIZED_EDEFAULT;
        typeKindParameterizedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__TYPE_KIND_PARAMETERIZED,
                    oldTypeKindParameterized, TYPE_KIND_PARAMETERIZED_EDEFAULT, oldTypeKindParameterizedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTypeKindParameterized() {
        return typeKindParameterizedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVariant() {
        return variant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariant( String newVariant ) {
        String oldVariant = variant;
        variant = newVariant;
        boolean oldVariantESet = variantESet;
        variantESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__VARIANT, oldVariant, variant,
                    !oldVariantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariant() {
        String oldVariant = variant;
        boolean oldVariantESet = variantESet;
        variant = VARIANT_EDEFAULT;
        variantESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__VARIANT, oldVariant,
                    VARIANT_EDEFAULT, oldVariantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariant() {
        return variantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CDCs getParentCDCs() {
        if( eContainerFeatureID() != NsdPackage.CDC__PARENT_CD_CS ) return null;
        return ( CDCs ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentCDCs( CDCs newParentCDCs, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentCDCs, NsdPackage.CDC__PARENT_CD_CS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentCDCs( CDCs newParentCDCs ) {
        if( newParentCDCs != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.CDC__PARENT_CD_CS && newParentCDCs != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentCDCs ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentCDCs != null )
                msgs = ( ( InternalEObject ) newParentCDCs ).eInverseAdd( this, NsdPackage.CD_CS__CDC, CDCs.class,
                        msgs );
            msgs = basicSetParentCDCs( newParentCDCs, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__PARENT_CD_CS, newParentCDCs,
                    newParentCDCs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataObject > getReferredByDataObject() {
        if( referredByDataObject == null ) {
            referredByDataObject = new EObjectWithInverseEList.Unsettable< >( DataObject.class, this,
                    NsdPackage.CDC__REFERRED_BY_DATA_OBJECT, NsdPackage.DATA_OBJECT__REFERS_TO_CDC );
        }
        return referredByDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataObject() {
        if( referredByDataObject != null ) ( ( InternalEList.Unsettable< ? > ) referredByDataObject ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataObject() {
        return referredByDataObject != null && ( ( InternalEList.Unsettable< ? > ) referredByDataObject ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubDataObject > getReferredBySubDataObject() {
        if( referredBySubDataObject == null ) {
            referredBySubDataObject = new EObjectWithInverseEList.Unsettable< >( SubDataObject.class,
                    this, NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT, NsdPackage.SUB_DATA_OBJECT__REFERS_TO_CDC );
        }
        return referredBySubDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySubDataObject() {
        if( referredBySubDataObject != null ) ( ( InternalEList.Unsettable< ? > ) referredBySubDataObject ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySubDataObject() {
        return referredBySubDataObject != null && ( ( InternalEList.Unsettable< ? > ) referredBySubDataObject ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataAttribute getParameterizedDataAttribute() {
        return parameterizedDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParameterizedDataAttribute( DataAttribute newParameterizedDataAttribute ) {
        DataAttribute oldParameterizedDataAttribute = parameterizedDataAttribute;
        parameterizedDataAttribute = newParameterizedDataAttribute;
        boolean oldParameterizedDataAttributeESet = parameterizedDataAttributeESet;
        parameterizedDataAttributeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CDC__PARAMETERIZED_DATA_ATTRIBUTE,
                    oldParameterizedDataAttribute, parameterizedDataAttribute, !oldParameterizedDataAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetParameterizedDataAttribute() {
        DataAttribute oldParameterizedDataAttribute = parameterizedDataAttribute;
        boolean oldParameterizedDataAttributeESet = parameterizedDataAttributeESet;
        parameterizedDataAttribute = null;
        parameterizedDataAttributeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.CDC__PARAMETERIZED_DATA_ATTRIBUTE,
                    oldParameterizedDataAttribute, null, oldParameterizedDataAttributeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetParameterizedDataAttribute() {
        return parameterizedDataAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniqueCDCChild( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "CDC::uniqueCDCChild";
        try {
            /**
             *
             * inv uniqueCDCChild:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = let
             *             names : Bag(String) = self.subDataObject.name->union(self.dataAttribute.name)
             *           in names->size() = names->asSet()->size()
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'For a CDC, there shall not be two sub-elements (SubDataObject or DataAttribute) with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.CDC___UNIQUE_CDC_CHILD__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean local_2;
            if( le ) {
                local_2 = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_local_1;
                try {
                    final /*@NonInvalid*/ List< SubDataObject > subDataObject = this.getSubDataObject();
                    final /*@NonInvalid*/ SetValue BOXED_subDataObject = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_SubDataObject, subDataObject );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createBagAccumulatorValue( NsdTables.BAG_PRIMid_String );
                    Iterator< Object > ITERATOR__1 = BOXED_subDataObject.iterator();
                    /*@Thrown*/ BagValue collect;
                    while( true ) {
                        if( !ITERATOR__1.hasNext() ) {
                            collect = accumulator;
                            break;
                        }
                        /*@NonInvalid*/ SubDataObject _1 = ( SubDataObject ) ITERATOR__1.next();
                        /**
                         * name
                         */
                        final /*@NonInvalid*/ String name = _1.getName();
                        //
                        accumulator.add( name );
                    }
                    final /*@NonInvalid*/ List< DataAttribute > dataAttribute = this.getDataAttribute();
                    final /*@NonInvalid*/ SetValue BOXED_dataAttribute = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_DataAttribute, dataAttribute );
                    /*@Thrown*/ Accumulator accumulator_0 = ValueUtil
                            .createBagAccumulatorValue( NsdTables.BAG_PRIMid_String );
                    Iterator< Object > ITERATOR__1_0 = BOXED_dataAttribute.iterator();
                    /*@Thrown*/ BagValue collect_0;
                    while( true ) {
                        if( !ITERATOR__1_0.hasNext() ) {
                            collect_0 = accumulator_0;
                            break;
                        }
                        /*@NonInvalid*/ DataAttribute _1_0 = ( DataAttribute ) ITERATOR__1_0.next();
                        /**
                         * name
                         */
                        final /*@NonInvalid*/ String name_0 = _1_0.getName();
                        //
                        accumulator_0.add( name_0 );
                    }
                    if( collect_0 instanceof InvalidValueException ) {
                        throw( InvalidValueException ) collect_0;
                    }
                    final /*@Thrown*/ BagValue names = ( BagValue ) CollectionUnionOperation.INSTANCE.evaluate( collect,
                            collect_0 );
                    final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate( names );
                    final /*@Thrown*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate( names );
                    final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate( asSet );
                    final /*@Thrown*/ boolean eq = size.equals( size_0 );
                    /*@Thrown*/ Object local_1;
                    if( eq ) {
                        local_1 = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                                NsdTables.STR_For_32_a_32_CDC_44_32_there_32_shall_32_not_32_be_32_two_32_sub_m_elements_32_o_SubDataObject_32_or,
                                eq );
                        local_1 = local_0;
                    }
                    CAUGHT_local_1 = local_1;
                }
                catch( Exception e ) {
                    CAUGHT_local_1 = ValueUtil.createInvalidValue( e );
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, CAUGHT_local_1, NsdTables.INT_0 )
                        .booleanValue();
                local_2 = logDiagnostic;
            }
            return local_2;
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
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "CDC::nameAttributeRequired";
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
                    NsdPackage.Literals.CDC___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean local_2;
            if( le ) {
                local_2 = true;
            }
            else {
                final /*@NonInvalid*/ String name = this.getName();
                final /*@NonInvalid*/ boolean status = name != null;
                /*@NonInvalid*/ Object local_1;
                if( status ) {
                    local_1 = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_name_32_attribute_32_is_32_required, status );
                    local_1 = local_0;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, local_1, NsdTables.INT_0 )
                        .booleanValue();
                local_2 = logDiagnostic;
            }
            return local_2;
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.CDC__SUB_DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubDataObject() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.CDC__DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.CDC__SERVICE_PARAMETER:
            if( serviceParameter != null )
                msgs = ( ( InternalEObject ) serviceParameter ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.CDC__SERVICE_PARAMETER, null, msgs );
            return basicSetServiceParameter( ( ServiceParameter ) otherEnd, msgs );
        case NsdPackage.CDC__PARENT_CD_CS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentCDCs( ( CDCs ) otherEnd, msgs );
        case NsdPackage.CDC__REFERRED_BY_DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataObject() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySubDataObject() )
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
        case NsdPackage.CDC__SUB_DATA_OBJECT:
            return ( ( InternalEList< ? > ) getSubDataObject() ).basicRemove( otherEnd, msgs );
        case NsdPackage.CDC__DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.CDC__SERVICE_PARAMETER:
            return basicUnsetServiceParameter( msgs );
        case NsdPackage.CDC__PARENT_CD_CS:
            return basicSetParentCDCs( null, msgs );
        case NsdPackage.CDC__REFERRED_BY_DATA_OBJECT:
            return ( ( InternalEList< ? > ) getReferredByDataObject() ).basicRemove( otherEnd, msgs );
        case NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT:
            return ( ( InternalEList< ? > ) getReferredBySubDataObject() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.CDC__PARENT_CD_CS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.CD_CS__CDC, CDCs.class, msgs );
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
        case NsdPackage.CDC__SUB_DATA_OBJECT:
            return getSubDataObject();
        case NsdPackage.CDC__DATA_ATTRIBUTE:
            return getDataAttribute();
        case NsdPackage.CDC__SERVICE_PARAMETER:
            return getServiceParameter();
        case NsdPackage.CDC__ENUM_PARAMETERIZED:
            return isEnumParameterized();
        case NsdPackage.CDC__NAME:
            return getName();
        case NsdPackage.CDC__STATISTICS:
            return isStatistics();
        case NsdPackage.CDC__TYPE_KIND_PARAMETERIZED:
            return isTypeKindParameterized();
        case NsdPackage.CDC__VARIANT:
            return getVariant();
        case NsdPackage.CDC__PARENT_CD_CS:
            return getParentCDCs();
        case NsdPackage.CDC__REFERRED_BY_DATA_OBJECT:
            return getReferredByDataObject();
        case NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT:
            return getReferredBySubDataObject();
        case NsdPackage.CDC__PARAMETERIZED_DATA_ATTRIBUTE:
            return getParameterizedDataAttribute();
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
        case NsdPackage.CDC__SUB_DATA_OBJECT:
            getSubDataObject().clear();
            getSubDataObject().addAll( ( Collection< ? extends SubDataObject > ) newValue );
            return;
        case NsdPackage.CDC__DATA_ATTRIBUTE:
            getDataAttribute().clear();
            getDataAttribute().addAll( ( Collection< ? extends DataAttribute > ) newValue );
            return;
        case NsdPackage.CDC__SERVICE_PARAMETER:
            setServiceParameter( ( ServiceParameter ) newValue );
            return;
        case NsdPackage.CDC__ENUM_PARAMETERIZED:
            setEnumParameterized( ( Boolean ) newValue );
            return;
        case NsdPackage.CDC__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.CDC__STATISTICS:
            setStatistics( ( Boolean ) newValue );
            return;
        case NsdPackage.CDC__TYPE_KIND_PARAMETERIZED:
            setTypeKindParameterized( ( Boolean ) newValue );
            return;
        case NsdPackage.CDC__VARIANT:
            setVariant( ( String ) newValue );
            return;
        case NsdPackage.CDC__PARENT_CD_CS:
            setParentCDCs( ( CDCs ) newValue );
            return;
        case NsdPackage.CDC__REFERRED_BY_DATA_OBJECT:
            getReferredByDataObject().clear();
            getReferredByDataObject().addAll( ( Collection< ? extends DataObject > ) newValue );
            return;
        case NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT:
            getReferredBySubDataObject().clear();
            getReferredBySubDataObject().addAll( ( Collection< ? extends SubDataObject > ) newValue );
            return;
        case NsdPackage.CDC__PARAMETERIZED_DATA_ATTRIBUTE:
            setParameterizedDataAttribute( ( DataAttribute ) newValue );
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
        case NsdPackage.CDC__SUB_DATA_OBJECT:
            unsetSubDataObject();
            return;
        case NsdPackage.CDC__DATA_ATTRIBUTE:
            unsetDataAttribute();
            return;
        case NsdPackage.CDC__SERVICE_PARAMETER:
            unsetServiceParameter();
            return;
        case NsdPackage.CDC__ENUM_PARAMETERIZED:
            unsetEnumParameterized();
            return;
        case NsdPackage.CDC__NAME:
            unsetName();
            return;
        case NsdPackage.CDC__STATISTICS:
            unsetStatistics();
            return;
        case NsdPackage.CDC__TYPE_KIND_PARAMETERIZED:
            unsetTypeKindParameterized();
            return;
        case NsdPackage.CDC__VARIANT:
            unsetVariant();
            return;
        case NsdPackage.CDC__PARENT_CD_CS:
            setParentCDCs( ( CDCs ) null );
            return;
        case NsdPackage.CDC__REFERRED_BY_DATA_OBJECT:
            unsetReferredByDataObject();
            return;
        case NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT:
            unsetReferredBySubDataObject();
            return;
        case NsdPackage.CDC__PARAMETERIZED_DATA_ATTRIBUTE:
            unsetParameterizedDataAttribute();
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
        case NsdPackage.CDC__SUB_DATA_OBJECT:
            return isSetSubDataObject();
        case NsdPackage.CDC__DATA_ATTRIBUTE:
            return isSetDataAttribute();
        case NsdPackage.CDC__SERVICE_PARAMETER:
            return isSetServiceParameter();
        case NsdPackage.CDC__ENUM_PARAMETERIZED:
            return isSetEnumParameterized();
        case NsdPackage.CDC__NAME:
            return isSetName();
        case NsdPackage.CDC__STATISTICS:
            return isSetStatistics();
        case NsdPackage.CDC__TYPE_KIND_PARAMETERIZED:
            return isSetTypeKindParameterized();
        case NsdPackage.CDC__VARIANT:
            return isSetVariant();
        case NsdPackage.CDC__PARENT_CD_CS:
            return getParentCDCs() != null;
        case NsdPackage.CDC__REFERRED_BY_DATA_OBJECT:
            return isSetReferredByDataObject();
        case NsdPackage.CDC__REFERRED_BY_SUB_DATA_OBJECT:
            return isSetReferredBySubDataObject();
        case NsdPackage.CDC__PARAMETERIZED_DATA_ATTRIBUTE:
            return isSetParameterizedDataAttribute();
        }
        return super.eIsSet( featureID );
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
        case NsdPackage.CDC___UNIQUE_CDC_CHILD__DIAGNOSTICCHAIN_MAP:
            return uniqueCDCChild( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.CDC___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return nameAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (enumParameterized: " );
        if( enumParameterizedESet )
            result.append( enumParameterized );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", statistics: " );
        if( statisticsESet )
            result.append( statistics );
        else
            result.append( "<unset>" );
        result.append( ", typeKindParameterized: " );
        if( typeKindParameterizedESet )
            result.append( typeKindParameterized );
        else
            result.append( "<unset>" );
        result.append( ", variant: " );
        if( variantESet )
            result.append( variant );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public NsIdentification getNsIdentification() {
        return new NsIdentification( getParentCDCs().getParentNS() );
    }

    // Use only type as key; not typeKind
    private HashMap< String, CDC > parameterizedCDCs = new HashMap<>();

    public CDC getParameterizedCDC( DefinedAttributeTypeKind underlyingTypeKind, String underlyingType,
            IRiseClipseConsole console ) {
        if( !isSetParameterizedDataAttribute() ) {
            return this;
        }
        if( !parameterizedCDCs.containsKey( underlyingType ) ) {
            // EcoreUtil.copy does a deep copy!
            CDC parameterizedCDC = EcoreUtil.copy( this );
            parameterizedCDC.setParentCDCs( getParentCDCs() );
            for( int i = 0; i < parameterizedCDC.getDataAttribute().size(); ++i ) {
                if( parameterizedCDC.getParameterizedDataAttribute().getName()
                        .equals( getDataAttribute().get( i ).getName() ) ) {
                    parameterizedCDC.getDataAttribute().get( i ).setType( underlyingType );
                    if( underlyingTypeKind != null ) {
                        parameterizedCDC.getDataAttribute().get( i ).setTypeKind( underlyingTypeKind );
                    }
                    for( DataAttribute da : parameterizedCDC.getDataAttribute() ) {
                        da.setExplicitLinksBuilt( false );
                        da.buildExplicitLinks( console );
                    }
                    for( SubDataObject sdo : parameterizedCDC.getSubDataObject() ) {
                        sdo.setExplicitLinksBuilt( false );
                        sdo.buildExplicitLinks( console );
                    }
                    if( parameterizedCDC.isSetServiceParameter() ) {
                        parameterizedCDC.getServiceParameter().setExplicitLinksBuilt( false );
                        parameterizedCDC.getServiceParameter().buildExplicitLinks( console );
                    }
                    parameterizedCDC.setExplicitLinksBuilt( false );
                    parameterizedCDC.buildExplicitLinks( console );
                    parameterizedCDCs.put( underlyingType, parameterizedCDC );
                    break;
                }
            }
        }
        return parameterizedCDCs.get( underlyingType );
    }

    public CDC getParameterizedCDC( String underlyingType, IRiseClipseConsole console ) {
        return getParameterizedCDC( null, underlyingType, console );
    }

} //CDCImpl
