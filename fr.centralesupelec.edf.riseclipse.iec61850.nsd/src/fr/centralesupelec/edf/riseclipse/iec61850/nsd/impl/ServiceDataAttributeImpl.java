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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DefinedAttributeTypeKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumeration;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getPresCond <em>Pres Cond</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getPresCondArgs <em>Pres Cond Args</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getPresCondArgsID <em>Pres Cond Args ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToPresCondArgsDoc <em>Refers To Pres Cond Args Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToBasicType <em>Refers To Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToConstructedAttribute <em>Refers To Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToEnumeration <em>Refers To Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getUnderlyingTypeKind <em>Underlying Type Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToUnderlyingBasicType <em>Refers To Underlying Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToUnderlyingConstructedAttribute <em>Refers To Underlying Constructed Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getRefersToUnderlyingEnumeration <em>Refers To Underlying Enumeration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceDataAttributeImpl#getParentServiceCDC <em>Parent Service CDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDataAttributeImpl extends DocumentedClassImpl implements ServiceDataAttribute {
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__FC, oldFc, fc,
                    !oldFcESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__FC, oldFc,
                    FC_EDEFAULT, oldFcESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME, oldName,
                    name, !oldNameESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME, oldName,
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
    public ServiceCDC getParentServiceCDC() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC ) return null;
        return ( ServiceCDC ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceCDC( ServiceCDC newParentServiceCDC, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceCDC,
                NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceCDC( ServiceCDC newParentServiceCDC ) {
        if( newParentServiceCDC != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC
                        && newParentServiceCDC != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceCDC ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServiceCDC != null )
                msgs = ( ( InternalEObject ) newParentServiceCDC ).eInverseAdd( this,
                        NsdPackage.SERVICE_CDC__SERVICE_DATA_ATTRIBUTE, ServiceCDC.class, msgs );
            msgs = basicSetParentServiceCDC( newParentServiceCDC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC, newParentServiceCDC, newParentServiceCDC ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID, oldPresCondArgsID, presCondArgsID,
                    !oldPresCondArgsIDESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID, oldPresCondArgsID, PRES_COND_ARGS_ID_EDEFAULT,
                    oldPresCondArgsIDESet ) );
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, newRefersToPresCondArgsDoc,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, oldRefersToPresCondArgsDoc, null,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC, null, null,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE, oldType,
                    type, !oldTypeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE, oldType,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, newRefersToBasicType,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, newRefersToBasicType,
                        newRefersToBasicType, !oldRefersToBasicTypeESet ) );
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, oldRefersToBasicType, null,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE, null, null,
                        oldRefersToBasicTypeESet ) );
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE,
                        newRefersToConstructedAttribute, newRefersToConstructedAttribute,
                        !oldRefersToConstructedAttributeESet ) );
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, oldRefersToConstructedAttribute,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE, null, null,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, oldRefersToEnumeration,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, newRefersToEnumeration,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, oldRefersToEnumeration, null,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION, null, null,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE, oldUnderlyingType, UNDERLYING_TYPE_EDEFAULT,
                    oldUnderlyingTypeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND, oldUnderlyingTypeKind, underlyingTypeKind,
                    !oldUnderlyingTypeKindESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE,
                        newRefersToUnderlyingBasicType, newRefersToUnderlyingBasicType,
                        !oldRefersToUnderlyingBasicTypeESet ) );
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE, oldRefersToUnderlyingBasicType,
                    null, oldRefersToUnderlyingBasicTypeESet );
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE, null, null,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE,
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE, null, null,
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION,
                    oldRefersToUnderlyingEnumeration, newRefersToUnderlyingEnumeration,
                    !oldRefersToUnderlyingEnumerationESet );
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION,
                        newRefersToUnderlyingEnumeration, newRefersToUnderlyingEnumeration,
                        !oldRefersToUnderlyingEnumerationESet ) );
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
                    NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION,
                    oldRefersToUnderlyingEnumeration, null, oldRefersToUnderlyingEnumerationESet );
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
                        NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION, null, null,
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            if( refersToPresCondArgsDoc != null )
                msgs = ( ( InternalEObject ) refersToPresCondArgsDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION, Doc.class, msgs );
            return basicSetRefersToPresCondArgsDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            if( refersToBasicType != null )
                msgs = ( ( InternalEObject ) refersToBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE, BasicType.class, msgs );
            return basicSetRefersToBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            if( refersToConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_ATTRIBUTE_TYPE, ConstructedAttribute.class,
                        msgs );
            return basicSetRefersToConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            if( refersToEnumeration != null )
                msgs = ( ( InternalEObject ) refersToEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_ATTRIBUTE_TYPE, Enumeration.class, msgs );
            return basicSetRefersToEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            if( refersToUnderlyingBasicType != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingBasicType ).eInverseRemove( this,
                        NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE, BasicType.class, msgs );
            return basicSetRefersToUnderlyingBasicType( ( BasicType ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            if( refersToUnderlyingConstructedAttribute != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingConstructedAttribute ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTE__REFERRED_BY_UNDERLYING_TYPE, ConstructedAttribute.class,
                        msgs );
            return basicSetRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
            if( refersToUnderlyingEnumeration != null )
                msgs = ( ( InternalEObject ) refersToUnderlyingEnumeration ).eInverseRemove( this,
                        NsdPackage.ENUMERATION__REFERRED_BY_UNDERLYING_TYPE, Enumeration.class, msgs );
            return basicSetRefersToUnderlyingEnumeration( ( Enumeration ) otherEnd, msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServiceCDC( ( ServiceCDC ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return basicUnsetRefersToPresCondArgsDoc( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return basicUnsetRefersToBasicType( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToConstructedAttribute( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return basicUnsetRefersToEnumeration( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return basicUnsetRefersToUnderlyingBasicType( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return basicUnsetRefersToUnderlyingConstructedAttribute( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
            return basicUnsetRefersToUnderlyingEnumeration( msgs );
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
            return basicSetParentServiceCDC( null, msgs );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            return getPresCond();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            return getPresCondArgs();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return getPresCondArgsID();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return getRefersToPresCondArgsDoc();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            return getType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            return getTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return getRefersToBasicType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return getRefersToConstructedAttribute();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return getRefersToEnumeration();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            return getUnderlyingType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            return getUnderlyingTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return getRefersToUnderlyingBasicType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return getRefersToUnderlyingConstructedAttribute();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
            return getRefersToUnderlyingEnumeration();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            return getFc();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            return getName();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
            return getParentServiceCDC();
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            setPresCond( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            setPresCondArgs( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            setPresCondArgsID( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            setRefersToPresCondArgsDoc( ( Doc ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            setType( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            setTypeKind( ( Enumerator ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            setRefersToBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            setRefersToConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            setRefersToEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            setUnderlyingType( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            setUnderlyingTypeKind( ( DefinedAttributeTypeKind ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            setRefersToUnderlyingBasicType( ( BasicType ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            setRefersToUnderlyingConstructedAttribute( ( ConstructedAttribute ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
            setRefersToUnderlyingEnumeration( ( Enumeration ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            setFc( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
            setParentServiceCDC( ( ServiceCDC ) newValue );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            unsetPresCond();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            unsetPresCondArgs();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            unsetPresCondArgsID();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            unsetRefersToPresCondArgsDoc();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            unsetType();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            unsetTypeKind();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            unsetRefersToBasicType();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToConstructedAttribute();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            unsetRefersToEnumeration();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            unsetUnderlyingType();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            unsetUnderlyingTypeKind();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            unsetRefersToUnderlyingBasicType();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            unsetRefersToUnderlyingConstructedAttribute();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
            unsetRefersToUnderlyingEnumeration();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            unsetFc();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            unsetName();
            return;
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
            setParentServiceCDC( ( ServiceCDC ) null );
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
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
            return isSetPresCond();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
            return isSetPresCondArgs();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
            return isSetPresCondArgsID();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
            return isSetRefersToPresCondArgsDoc();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
            return isSetType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
            return isSetTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
            return isSetRefersToBasicType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToConstructedAttribute();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
            return isSetRefersToEnumeration();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
            return isSetUnderlyingType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
            return isSetUnderlyingTypeKind();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
            return isSetRefersToUnderlyingBasicType();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
            return isSetRefersToUnderlyingConstructedAttribute();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
            return isSetRefersToUnderlyingEnumeration();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__FC:
            return isSetFc();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__NAME:
            return isSetName();
        case NsdPackage.SERVICE_DATA_ATTRIBUTE__PARENT_SERVICE_CDC:
            return getParentServiceCDC() != null;
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
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID:
                return NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeType.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__TYPE;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND:
                return NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION:
                return NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION;
            default:
                return -1;
            }
        }
        if( baseClass == AgUnderlyingType.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE:
                return NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND:
                return NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION:
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
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS;
            case NsdPackage.AG_PRESENCE_CONDITION__PRES_COND_ARGS_ID:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__PRES_COND_ARGS_ID;
            case NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_PRES_COND_ARGS_DOC;
            default:
                return -1;
            }
        }
        if( baseClass == AgAttributeType.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__TYPE_KIND:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__TYPE_KIND;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_BASIC_TYPE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_ENUMERATION:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_ENUMERATION;
            default:
                return -1;
            }
        }
        if( baseClass == AgUnderlyingType.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE;
            case NsdPackage.AG_UNDERLYING_TYPE__UNDERLYING_TYPE_KIND:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__UNDERLYING_TYPE_KIND;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_BASIC_TYPE;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_CONSTRUCTED_ATTRIBUTE;
            case NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_ENUMERATION:
                return NsdPackage.SERVICE_DATA_ATTRIBUTE__REFERS_TO_UNDERLYING_ENUMERATION;
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
        result.append( ", fc: " );
        if( fcESet )
            result.append( fc );
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

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        if( isSetPresCondArgsID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() ).findDoc(
                        new NsIdentification( getParentServiceCDC().getParentServiceCDCs().getParentServiceNS() ),
                        getPresCondArgsID() );
                if( doc != null ) setRefersToPresCondArgsDoc( doc );
            }
        }

        return false;
    }

    @Override
    protected NsIdentification getNsIdentification() {
        return new NsIdentification( getParentServiceCDC().getParentServiceCDCs().getParentServiceNS() );
    }

    @Override
    public DataAttribute toDataAttribute() {
        DataAttribute dataAttribute = new DataAttributeImpl();
        dataAttribute.setPresCond( getPresCond() );
        dataAttribute.setPresCondArgs( getPresCondArgs() );
        dataAttribute.setPresCondArgsID( getPresCondArgsID() );
        dataAttribute.setType( getType() );
        dataAttribute.setTypeKind( getTypeKind() );
        dataAttribute.setFc( getFc() );
        dataAttribute.setName( getName() );

        dataAttribute.setLineNumber( getLineNumber() );
        dataAttribute.setFilename( getFilename() );

        return dataAttribute;
    }

} //ServiceDataAttributeImpl
