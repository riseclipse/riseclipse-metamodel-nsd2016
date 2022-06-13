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
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgAttributeType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUnderlyingType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getParentBasicTypes <em>Parent Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getReferredByAttributeType <em>Referred By Attribute Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getRefersToDoc <em>Refers To Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.BasicTypeImpl#getReferredByUnderlyingType <em>Referred By Underlying Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicTypeImpl extends NsdObjectImpl implements BasicType {
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
     * The cached value of the '{@link #getReferredByAttributeType() <em>Referred By Attribute Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAttributeType()
     * @generated
     * @ordered
     */
    protected EList< AgAttributeType > referredByAttributeType;

    /**
     * The cached value of the '{@link #getRefersToDoc() <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDoc;

    /**
     * This is true if the Refers To Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDocESet;

    /**
     * The cached value of the '{@link #getReferredByUnderlyingType() <em>Referred By Underlying Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByUnderlyingType()
     * @generated
     * @ordered
     */
    protected EList< AgUnderlyingType > referredByUnderlyingType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.BASIC_TYPE;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__DESC_ID, oldDescID, descID,
                    !oldDescIDESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.BASIC_TYPE__DESC_ID, oldDescID,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.BASIC_TYPE__NAME, oldName,
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
    public BasicTypes getParentBasicTypes() {
        if( eContainerFeatureID() != NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES ) return null;
        return ( BasicTypes ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBasicTypes( BasicTypes newParentBasicTypes, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentBasicTypes, NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBasicTypes( BasicTypes newParentBasicTypes ) {
        if( newParentBasicTypes != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES
                        && newParentBasicTypes != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentBasicTypes ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentBasicTypes != null )
                msgs = ( ( InternalEObject ) newParentBasicTypes ).eInverseAdd( this,
                        NsdPackage.BASIC_TYPES__BASIC_TYPE, BasicTypes.class, msgs );
            msgs = basicSetParentBasicTypes( newParentBasicTypes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES,
                    newParentBasicTypes, newParentBasicTypes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgAttributeType > getReferredByAttributeType() {
        if( referredByAttributeType == null ) {
            referredByAttributeType = new EObjectWithInverseEList.Unsettable< >( AgAttributeType.class,
                    this, NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE,
                    NsdPackage.AG_ATTRIBUTE_TYPE__REFERS_TO_BASIC_TYPE );
        }
        return referredByAttributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAttributeType() {
        if( referredByAttributeType != null ) ( ( InternalEList.Unsettable< ? > ) referredByAttributeType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAttributeType() {
        return referredByAttributeType != null && ( ( InternalEList.Unsettable< ? > ) referredByAttributeType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDoc() {
        return refersToDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDoc( Doc newRefersToDoc, NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = newRefersToDoc;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.BASIC_TYPE__REFERS_TO_DOC, oldRefersToDoc, newRefersToDoc, !oldRefersToDocESet );
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
    public void setRefersToDoc( Doc newRefersToDoc ) {
        if( newRefersToDoc != refersToDoc ) {
            NotificationChain msgs = null;
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                        Doc.class, msgs );
            if( newRefersToDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDoc ).eInverseAdd( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                        Doc.class, msgs );
            msgs = basicSetRefersToDoc( newRefersToDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.BASIC_TYPE__REFERS_TO_DOC,
                        newRefersToDoc, newRefersToDoc, !oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDoc( NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = null;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.BASIC_TYPE__REFERS_TO_DOC, oldRefersToDoc, null, oldRefersToDocESet );
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
    public void unsetRefersToDoc() {
        if( refersToDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                    Doc.class, msgs );
            msgs = basicUnsetRefersToDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.BASIC_TYPE__REFERS_TO_DOC, null,
                        null, oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDoc() {
        return refersToDocESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgUnderlyingType > getReferredByUnderlyingType() {
        if( referredByUnderlyingType == null ) {
            referredByUnderlyingType = new EObjectWithInverseEList.Unsettable< >(
                    AgUnderlyingType.class, this, NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE,
                    NsdPackage.AG_UNDERLYING_TYPE__REFERS_TO_UNDERLYING_BASIC_TYPE );
        }
        return referredByUnderlyingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByUnderlyingType() {
        if( referredByUnderlyingType != null ) ( ( InternalEList.Unsettable< ? > ) referredByUnderlyingType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByUnderlyingType() {
        return referredByUnderlyingType != null
                && ( ( InternalEList.Unsettable< ? > ) referredByUnderlyingType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean nameAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "BasicType::nameAttributeRequired";
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
                    NsdPackage.Literals.BASIC_TYPE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentBasicTypes( ( BasicTypes ) otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAttributeType() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_BASIC_TYPE,
                        Doc.class, msgs );
            return basicSetRefersToDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByUnderlyingType() )
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
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return basicSetParentBasicTypes( null, msgs );
        case NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE:
            return ( ( InternalEList< ? > ) getReferredByAttributeType() ).basicRemove( otherEnd, msgs );
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            return basicUnsetRefersToDoc( msgs );
        case NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE:
            return ( ( InternalEList< ? > ) getReferredByUnderlyingType() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.BASIC_TYPES__BASIC_TYPE, BasicTypes.class,
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            return getDescID();
        case NsdPackage.BASIC_TYPE__NAME:
            return getName();
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return getParentBasicTypes();
        case NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE:
            return getReferredByAttributeType();
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            return getRefersToDoc();
        case NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE:
            return getReferredByUnderlyingType();
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__NAME:
            setName( ( String ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            setParentBasicTypes( ( BasicTypes ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE:
            getReferredByAttributeType().clear();
            getReferredByAttributeType().addAll( ( Collection< ? extends AgAttributeType > ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            setRefersToDoc( ( Doc ) newValue );
            return;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE:
            getReferredByUnderlyingType().clear();
            getReferredByUnderlyingType().addAll( ( Collection< ? extends AgUnderlyingType > ) newValue );
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.BASIC_TYPE__NAME:
            unsetName();
            return;
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            setParentBasicTypes( ( BasicTypes ) null );
            return;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE:
            unsetReferredByAttributeType();
            return;
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            unsetRefersToDoc();
            return;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE:
            unsetReferredByUnderlyingType();
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
        case NsdPackage.BASIC_TYPE__DESC_ID:
            return isSetDescID();
        case NsdPackage.BASIC_TYPE__NAME:
            return isSetName();
        case NsdPackage.BASIC_TYPE__PARENT_BASIC_TYPES:
            return getParentBasicTypes() != null;
        case NsdPackage.BASIC_TYPE__REFERRED_BY_ATTRIBUTE_TYPE:
            return isSetReferredByAttributeType();
        case NsdPackage.BASIC_TYPE__REFERS_TO_DOC:
            return isSetRefersToDoc();
        case NsdPackage.BASIC_TYPE__REFERRED_BY_UNDERLYING_TYPE:
            return isSetReferredByUnderlyingType();
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
        case NsdPackage.BASIC_TYPE___NAME_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
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
        result.append( " (descID: " );
        if( descIDESet )
            result.append( descID );
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
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "BasicTypeImpl.buildExplicitLinks()" );

        if( super.buildExplicitLinks( console ) ) return true;

        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() )
                        .findDoc( new NsIdentification( getParentBasicTypes().getParentNS() ), getDescID() );
                if( doc != null ) setRefersToDoc( doc );
            }
        }

        return false;
    }

} //BasicTypeImpl
