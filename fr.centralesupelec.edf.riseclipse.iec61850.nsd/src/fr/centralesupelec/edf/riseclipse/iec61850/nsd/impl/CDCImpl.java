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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceParameter;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
            subDataObject = new EObjectContainmentWithInverseEList.Unsettable< SubDataObject >( SubDataObject.class,
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
            dataAttribute = new EObjectContainmentWithInverseEList.Unsettable< DataAttribute >( DataAttribute.class,
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
            referredByDataObject = new EObjectWithInverseEList.Unsettable< DataObject >( DataObject.class, this,
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
            referredBySubDataObject = new EObjectWithInverseEList.Unsettable< SubDataObject >( SubDataObject.class,
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

} //CDCImpl
