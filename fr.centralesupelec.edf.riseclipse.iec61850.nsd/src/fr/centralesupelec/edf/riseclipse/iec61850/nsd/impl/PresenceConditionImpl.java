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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.SubDataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presence Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getTitleID <em>Title ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getParentPresenceConditions <em>Parent Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getReferredByDataObject <em>Referred By Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getReferredByDataObjectForDerivedStatistics <em>Referred By Data Object For Derived Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getReferredBySubDataObject <em>Referred By Sub Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getReferredByDataAttribute <em>Referred By Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getReferredBySubDataAttribute <em>Referred By Sub Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getRefersToDescDoc <em>Refers To Desc Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionImpl#getRefersToTitleDoc <em>Refers To Title Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresenceConditionImpl extends NsdObjectImpl implements PresenceCondition {
    /**
     * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected static final String ARGUMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected String argument = ARGUMENT_EDEFAULT;

    /**
     * This is true if the Argument attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean argumentESet;

    /**
     * The default value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected static final String DESC_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected String descID = DESC_ID_EDEFAULT;

    /**
     * This is true if the Desc ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descIDESet;

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
     * The default value of the '{@link #getTitleID() <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitleID()
     * @generated
     * @ordered
     */
    protected static final String TITLE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitleID() <em>Title ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitleID()
     * @generated
     * @ordered
     */
    protected String titleID = TITLE_ID_EDEFAULT;

    /**
     * This is true if the Title ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean titleIDESet;

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
     * The cached value of the '{@link #getReferredByDataObjectForDerivedStatistics() <em>Referred By Data Object For Derived Statistics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataObjectForDerivedStatistics()
     * @generated
     * @ordered
     */
    protected EList< DataObject > referredByDataObjectForDerivedStatistics;

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
     * The cached value of the '{@link #getReferredByDataAttribute() <em>Referred By Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< DataAttribute > referredByDataAttribute;

    /**
     * The cached value of the '{@link #getReferredBySubDataAttribute() <em>Referred By Sub Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySubDataAttribute()
     * @generated
     * @ordered
     */
    protected EList< SubDataAttribute > referredBySubDataAttribute;

    /**
     * The cached value of the '{@link #getRefersToDescDoc() <em>Refers To Desc Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDescDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDescDoc;

    /**
     * This is true if the Refers To Desc Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDescDocESet;

    /**
     * The cached value of the '{@link #getRefersToTitleDoc() <em>Refers To Title Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToTitleDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToTitleDoc;

    /**
     * This is true if the Refers To Title Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToTitleDocESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresenceConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.PRESENCE_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getArgument() {
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setArgument( String newArgument ) {
        String oldArgument = argument;
        argument = newArgument;
        boolean oldArgumentESet = argumentESet;
        argumentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITION__ARGUMENT,
                    oldArgument, argument, !oldArgumentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetArgument() {
        String oldArgument = argument;
        boolean oldArgumentESet = argumentESet;
        argument = ARGUMENT_EDEFAULT;
        argumentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.PRESENCE_CONDITION__ARGUMENT,
                    oldArgument, ARGUMENT_EDEFAULT, oldArgumentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetArgument() {
        return argumentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescID() {
        return descID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescID( String newDescID ) {
        String oldDescID = descID;
        descID = newDescID;
        boolean oldDescIDESet = descIDESet;
        descIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITION__DESC_ID, oldDescID,
                    descID, !oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescID() {
        String oldDescID = descID;
        boolean oldDescIDESet = descIDESet;
        descID = DESC_ID_EDEFAULT;
        descIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.PRESENCE_CONDITION__DESC_ID, oldDescID,
                    DESC_ID_EDEFAULT, oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescID() {
        return descIDESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITION__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.PRESENCE_CONDITION__NAME, oldName,
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
    public String getTitleID() {
        return titleID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitleID( String newTitleID ) {
        String oldTitleID = titleID;
        titleID = newTitleID;
        boolean oldTitleIDESet = titleIDESet;
        titleIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITION__TITLE_ID, oldTitleID,
                    titleID, !oldTitleIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTitleID() {
        String oldTitleID = titleID;
        boolean oldTitleIDESet = titleIDESet;
        titleID = TITLE_ID_EDEFAULT;
        titleIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.PRESENCE_CONDITION__TITLE_ID,
                    oldTitleID, TITLE_ID_EDEFAULT, oldTitleIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTitleID() {
        return titleIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PresenceConditions getParentPresenceConditions() {
        if( eContainerFeatureID() != NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS ) return null;
        return ( PresenceConditions ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentPresenceConditions( PresenceConditions newParentPresenceConditions,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentPresenceConditions,
                NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentPresenceConditions( PresenceConditions newParentPresenceConditions ) {
        if( newParentPresenceConditions != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS
                        && newParentPresenceConditions != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentPresenceConditions ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentPresenceConditions != null )
                msgs = ( ( InternalEObject ) newParentPresenceConditions ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION, PresenceConditions.class, msgs );
            msgs = basicSetParentPresenceConditions( newParentPresenceConditions, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS, newParentPresenceConditions,
                    newParentPresenceConditions ) );
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
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT,
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION );
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
    public EList< DataObject > getReferredByDataObjectForDerivedStatistics() {
        if( referredByDataObjectForDerivedStatistics == null ) {
            referredByDataObjectForDerivedStatistics = new EObjectWithInverseEList.Unsettable< DataObject >(
                    DataObject.class, this,
                    NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS,
                    NsdPackage.DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION_DERIVED_STATISTICS );
        }
        return referredByDataObjectForDerivedStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataObjectForDerivedStatistics() {
        if( referredByDataObjectForDerivedStatistics != null )
            ( ( InternalEList.Unsettable< ? > ) referredByDataObjectForDerivedStatistics ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataObjectForDerivedStatistics() {
        return referredByDataObjectForDerivedStatistics != null
                && ( ( InternalEList.Unsettable< ? > ) referredByDataObjectForDerivedStatistics ).isSet();
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
                    this, NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT,
                    NsdPackage.SUB_DATA_OBJECT__REFERS_TO_PRESENCE_CONDITION );
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
    public EList< DataAttribute > getReferredByDataAttribute() {
        if( referredByDataAttribute == null ) {
            referredByDataAttribute = new EObjectWithInverseEList.Unsettable< DataAttribute >( DataAttribute.class,
                    this, NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE,
                    NsdPackage.DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION );
        }
        return referredByDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDataAttribute() {
        if( referredByDataAttribute != null ) ( ( InternalEList.Unsettable< ? > ) referredByDataAttribute ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDataAttribute() {
        return referredByDataAttribute != null && ( ( InternalEList.Unsettable< ? > ) referredByDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubDataAttribute > getReferredBySubDataAttribute() {
        if( referredBySubDataAttribute == null ) {
            referredBySubDataAttribute = new EObjectWithInverseEList.Unsettable< SubDataAttribute >(
                    SubDataAttribute.class, this, NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE,
                    NsdPackage.SUB_DATA_ATTRIBUTE__REFERS_TO_PRESENCE_CONDITION );
        }
        return referredBySubDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySubDataAttribute() {
        if( referredBySubDataAttribute != null )
            ( ( InternalEList.Unsettable< ? > ) referredBySubDataAttribute ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySubDataAttribute() {
        return referredBySubDataAttribute != null
                && ( ( InternalEList.Unsettable< ? > ) referredBySubDataAttribute ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDescDoc() {
        return refersToDescDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDescDoc( Doc newRefersToDescDoc, NotificationChain msgs ) {
        Doc oldRefersToDescDoc = refersToDescDoc;
        refersToDescDoc = newRefersToDescDoc;
        boolean oldRefersToDescDocESet = refersToDescDocESet;
        refersToDescDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC, oldRefersToDescDoc, newRefersToDescDoc,
                    !oldRefersToDescDocESet );
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
    public void setRefersToDescDoc( Doc newRefersToDescDoc ) {
        if( newRefersToDescDoc != refersToDescDoc ) {
            NotificationChain msgs = null;
            if( refersToDescDoc != null )
                msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC, Doc.class, msgs );
            if( newRefersToDescDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDescDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC, Doc.class, msgs );
            msgs = basicSetRefersToDescDoc( newRefersToDescDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDescDocESet = refersToDescDocESet;
            refersToDescDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC, newRefersToDescDoc, newRefersToDescDoc,
                        !oldRefersToDescDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDescDoc( NotificationChain msgs ) {
        Doc oldRefersToDescDoc = refersToDescDoc;
        refersToDescDoc = null;
        boolean oldRefersToDescDocESet = refersToDescDocESet;
        refersToDescDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC, oldRefersToDescDoc, null,
                    oldRefersToDescDocESet );
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
    public void unsetRefersToDescDoc() {
        if( refersToDescDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC, Doc.class, msgs );
            msgs = basicUnsetRefersToDescDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDescDocESet = refersToDescDocESet;
            refersToDescDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC, null, null, oldRefersToDescDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDescDoc() {
        return refersToDescDocESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToTitleDoc() {
        return refersToTitleDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToTitleDoc( Doc newRefersToTitleDoc, NotificationChain msgs ) {
        Doc oldRefersToTitleDoc = refersToTitleDoc;
        refersToTitleDoc = newRefersToTitleDoc;
        boolean oldRefersToTitleDocESet = refersToTitleDocESet;
        refersToTitleDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC, oldRefersToTitleDoc, newRefersToTitleDoc,
                    !oldRefersToTitleDocESet );
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
    public void setRefersToTitleDoc( Doc newRefersToTitleDoc ) {
        if( newRefersToTitleDoc != refersToTitleDoc ) {
            NotificationChain msgs = null;
            if( refersToTitleDoc != null )
                msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE, Doc.class, msgs );
            if( newRefersToTitleDoc != null )
                msgs = ( ( InternalEObject ) newRefersToTitleDoc ).eInverseAdd( this,
                        NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE, Doc.class, msgs );
            msgs = basicSetRefersToTitleDoc( newRefersToTitleDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToTitleDocESet = refersToTitleDocESet;
            refersToTitleDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC, newRefersToTitleDoc, newRefersToTitleDoc,
                        !oldRefersToTitleDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToTitleDoc( NotificationChain msgs ) {
        Doc oldRefersToTitleDoc = refersToTitleDoc;
        refersToTitleDoc = null;
        boolean oldRefersToTitleDocESet = refersToTitleDocESet;
        refersToTitleDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC, oldRefersToTitleDoc, null,
                    oldRefersToTitleDocESet );
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
    public void unsetRefersToTitleDoc() {
        if( refersToTitleDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                    NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE, Doc.class, msgs );
            msgs = basicUnsetRefersToTitleDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToTitleDocESet = refersToTitleDocESet;
            refersToTitleDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC, null, null, oldRefersToTitleDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToTitleDoc() {
        return refersToTitleDocESet;
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
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentPresenceConditions( ( PresenceConditions ) otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataObject() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataObjectForDerivedStatistics() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySubDataObject() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySubDataAttribute() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC:
            if( refersToDescDoc != null )
                msgs = ( ( InternalEObject ) refersToDescDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_DESC, Doc.class, msgs );
            return basicSetRefersToDescDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC:
            if( refersToTitleDoc != null )
                msgs = ( ( InternalEObject ) refersToTitleDoc ).eInverseRemove( this,
                        NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION_AS_TITLE, Doc.class, msgs );
            return basicSetRefersToTitleDoc( ( Doc ) otherEnd, msgs );
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
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            return basicSetParentPresenceConditions( null, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT:
            return ( ( InternalEList< ? > ) getReferredByDataObject() ).basicRemove( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS:
            return ( ( InternalEList< ? > ) getReferredByDataObjectForDerivedStatistics() ).basicRemove( otherEnd,
                    msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT:
            return ( ( InternalEList< ? > ) getReferredBySubDataObject() ).basicRemove( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredByDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE:
            return ( ( InternalEList< ? > ) getReferredBySubDataAttribute() ).basicRemove( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC:
            return basicUnsetRefersToDescDoc( msgs );
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC:
            return basicUnsetRefersToTitleDoc( msgs );
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
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION,
                    PresenceConditions.class, msgs );
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
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            return getArgument();
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            return getDescID();
        case NsdPackage.PRESENCE_CONDITION__NAME:
            return getName();
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            return getTitleID();
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            return getParentPresenceConditions();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT:
            return getReferredByDataObject();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS:
            return getReferredByDataObjectForDerivedStatistics();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT:
            return getReferredBySubDataObject();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE:
            return getReferredByDataAttribute();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE:
            return getReferredBySubDataAttribute();
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC:
            return getRefersToDescDoc();
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC:
            return getRefersToTitleDoc();
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
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            setArgument( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            setTitleID( ( String ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            setParentPresenceConditions( ( PresenceConditions ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT:
            getReferredByDataObject().clear();
            getReferredByDataObject().addAll( ( Collection< ? extends DataObject > ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS:
            getReferredByDataObjectForDerivedStatistics().clear();
            getReferredByDataObjectForDerivedStatistics().addAll( ( Collection< ? extends DataObject > ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT:
            getReferredBySubDataObject().clear();
            getReferredBySubDataObject().addAll( ( Collection< ? extends SubDataObject > ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE:
            getReferredByDataAttribute().clear();
            getReferredByDataAttribute().addAll( ( Collection< ? extends DataAttribute > ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE:
            getReferredBySubDataAttribute().clear();
            getReferredBySubDataAttribute().addAll( ( Collection< ? extends SubDataAttribute > ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC:
            setRefersToDescDoc( ( Doc ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC:
            setRefersToTitleDoc( ( Doc ) newValue );
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
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            unsetArgument();
            return;
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.PRESENCE_CONDITION__NAME:
            unsetName();
            return;
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            unsetTitleID();
            return;
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            setParentPresenceConditions( ( PresenceConditions ) null );
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT:
            unsetReferredByDataObject();
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS:
            unsetReferredByDataObjectForDerivedStatistics();
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT:
            unsetReferredBySubDataObject();
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE:
            unsetReferredByDataAttribute();
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE:
            unsetReferredBySubDataAttribute();
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC:
            unsetRefersToDescDoc();
            return;
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC:
            unsetRefersToTitleDoc();
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
        case NsdPackage.PRESENCE_CONDITION__ARGUMENT:
            return isSetArgument();
        case NsdPackage.PRESENCE_CONDITION__DESC_ID:
            return isSetDescID();
        case NsdPackage.PRESENCE_CONDITION__NAME:
            return isSetName();
        case NsdPackage.PRESENCE_CONDITION__TITLE_ID:
            return isSetTitleID();
        case NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS:
            return getParentPresenceConditions() != null;
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT:
            return isSetReferredByDataObject();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_OBJECT_FOR_DERIVED_STATISTICS:
            return isSetReferredByDataObjectForDerivedStatistics();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_OBJECT:
            return isSetReferredBySubDataObject();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_DATA_ATTRIBUTE:
            return isSetReferredByDataAttribute();
        case NsdPackage.PRESENCE_CONDITION__REFERRED_BY_SUB_DATA_ATTRIBUTE:
            return isSetReferredBySubDataAttribute();
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_DESC_DOC:
            return isSetRefersToDescDoc();
        case NsdPackage.PRESENCE_CONDITION__REFERS_TO_TITLE_DOC:
            return isSetRefersToTitleDoc();
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
        result.append( " (argument: " );
        if( argumentESet )
            result.append( argument );
        else
            result.append( "<unset>" );
        result.append( ", descID: " );
        if( descIDESet )
            result.append( descID );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", titleID: " );
        if( titleIDESet )
            result.append( titleID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console, boolean forceUpdate ) {
        if( super.buildExplicitLinks( console, forceUpdate ) ) return true;

        NsIdentification identification = null;
        if( getParentPresenceConditions().getParentNS() != null ) {
            identification = new NsIdentification( getParentPresenceConditions().getParentNS() );
        }
        else if( getParentPresenceConditions().getParentServiceNS() != null ) {
            identification = new NsIdentification( getParentPresenceConditions().getParentServiceNS() );
        }
        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() )
                        .findDoc( identification, getDescID() );
                if( doc != null ) setRefersToDescDoc( doc );
            }
        }

        if( isSetTitleID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() )
                        .findDoc( identification, getTitleID() );
                if( doc != null ) setRefersToTitleDoc( doc );
            }
        }

        return false;
    }

} //PresenceConditionImpl
