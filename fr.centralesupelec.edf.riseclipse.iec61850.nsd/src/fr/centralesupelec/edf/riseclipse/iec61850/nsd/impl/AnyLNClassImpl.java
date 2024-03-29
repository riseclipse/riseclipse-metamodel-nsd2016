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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AbstractLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AnyLNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any LN Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AnyLNClassImpl#getRefersToAbstractLNClass <em>Refers To Abstract LN Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnyLNClassImpl extends TitledClassImpl implements AnyLNClass {
    /**
     * The cached value of the '{@link #getDataObject() <em>Data Object</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataObject()
     * @generated
     * @ordered
     */
    protected EList< DataObject > dataObject;

    /**
     * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected static final String BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected String base = BASE_EDEFAULT;

    /**
     * This is true if the Base attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseESet;

    /**
     * The cached value of the '{@link #getRefersToAbstractLNClass() <em>Refers To Abstract LN Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractLNClass()
     * @generated
     * @ordered
     */
    protected AbstractLNClass refersToAbstractLNClass;

    /**
     * This is true if the Refers To Abstract LN Class reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAbstractLNClassESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnyLNClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ANY_LN_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataObject > getDataObject() {
        if( dataObject == null ) {
            dataObject = new EObjectContainmentWithInverseEList.Unsettable< >( DataObject.class, this,
                    NsdPackage.ANY_LN_CLASS__DATA_OBJECT, NsdPackage.DATA_OBJECT__PARENT_ANY_LN_CLASS );
        }
        return dataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataObject() {
        if( dataObject != null ) {
            ( ( InternalEList.Unsettable< ? > ) dataObject ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataObject() {
        return dataObject != null && ( ( InternalEList.Unsettable< ? > ) dataObject ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBase( String newBase ) {
        String oldBase = base;
        base = newBase;
        boolean oldBaseESet = baseESet;
        baseESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ANY_LN_CLASS__BASE, oldBase, base,
                    !oldBaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBase() {
        String oldBase = base;
        boolean oldBaseESet = baseESet;
        base = BASE_EDEFAULT;
        baseESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.ANY_LN_CLASS__BASE, oldBase,
                    BASE_EDEFAULT, oldBaseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBase() {
        return baseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractLNClass getRefersToAbstractLNClass() {
        return refersToAbstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAbstractLNClass( AbstractLNClass newRefersToAbstractLNClass,
            NotificationChain msgs ) {
        AbstractLNClass oldRefersToAbstractLNClass = refersToAbstractLNClass;
        refersToAbstractLNClass = newRefersToAbstractLNClass;
        boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
        refersToAbstractLNClassESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, oldRefersToAbstractLNClass,
                    newRefersToAbstractLNClass, !oldRefersToAbstractLNClassESet );
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
    public void setRefersToAbstractLNClass( AbstractLNClass newRefersToAbstractLNClass ) {
        if( newRefersToAbstractLNClass != refersToAbstractLNClass ) {
            NotificationChain msgs = null;
            if( refersToAbstractLNClass != null ) {
                msgs = ( ( InternalEObject ) refersToAbstractLNClass ).eInverseRemove( this,
                        NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            }
            if( newRefersToAbstractLNClass != null ) {
                msgs = ( ( InternalEObject ) newRefersToAbstractLNClass ).eInverseAdd( this,
                        NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            }
            msgs = basicSetRefersToAbstractLNClass( newRefersToAbstractLNClass, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
            refersToAbstractLNClassESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, newRefersToAbstractLNClass,
                        newRefersToAbstractLNClass, !oldRefersToAbstractLNClassESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAbstractLNClass( NotificationChain msgs ) {
        AbstractLNClass oldRefersToAbstractLNClass = refersToAbstractLNClass;
        refersToAbstractLNClass = null;
        boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
        refersToAbstractLNClassESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, oldRefersToAbstractLNClass, null,
                    oldRefersToAbstractLNClassESet );
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
    public void unsetRefersToAbstractLNClass() {
        if( refersToAbstractLNClass != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAbstractLNClass ).eInverseRemove( this,
                    NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            msgs = basicUnsetRefersToAbstractLNClass( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAbstractLNClassESet = refersToAbstractLNClassESet;
            refersToAbstractLNClassESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS, null, null,
                        oldRefersToAbstractLNClassESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractLNClass() {
        return refersToAbstractLNClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getName() {
        // TODO: use a RiseClipseException ?
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public LNClasses getParentLNClasses() {
        AbstractRiseClipseConsole.getConsole().emergency( EXPLICIT_LINK_CATEGORY, 0,
                "AnyLNClass.getParentLNClasses() called" );
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniqueDataObject( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "AnyLNClass::uniqueDataObject";
        try {
            /**
             *
             * inv uniqueDataObject:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.dataObject->isUnique(d | d.name)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'For an AnyLNClass, there shall not be two DataObject sub-elements with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.ANY_LN_CLASS___UNIQUE_DATA_OBJECT__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_IF_status;
                try {
                    final /*@NonInvalid*/ List< DataObject > dataObject = this.getDataObject();
                    final /*@NonInvalid*/ SetValue BOXED_dataObject = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_DataObject, dataObject );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_DataObject );
                    Iterator< Object > ITERATOR_d = BOXED_dataObject.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_d.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ DataObject d = ( DataObject ) ITERATOR_d.next();
                        /**
                         * d.name
                         */
                        final /*@NonInvalid*/ String name = d.getName();
                        //
                        if( accumulator.includes( name ) == ValueUtil.TRUE_VALUE ) {
                            status = false;
                            break; // Abort after second find
                        }
                        else {
                            accumulator.add( name );
                        }
                    }
                    /*@Thrown*/ Object IF_status;
                    if( status ) {
                        IF_status = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                                NsdTables.STR_For_32_an_32_AnyLNClass_44_32_there_32_shall_32_not_32_be_32_two_32_DataObject_32_sub_m_element,
                                status );
                        IF_status = TUP_;
                    }
                    CAUGHT_IF_status = IF_status;
                }
                catch( Exception e ) {
                    CAUGHT_IF_status = ValueUtil.createInvalidValue( e );
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, CAUGHT_IF_status, NsdTables.INT_0 )
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDataObject() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            if( refersToAbstractLNClass != null ) {
                msgs = ( ( InternalEObject ) refersToAbstractLNClass ).eInverseRemove( this,
                        NsdPackage.ABSTRACT_LN_CLASS__REFERRED_BY_ANY_LN_CLASS, AbstractLNClass.class, msgs );
            }
            return basicSetRefersToAbstractLNClass( ( AbstractLNClass ) otherEnd, msgs );
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return ( ( InternalEList< ? > ) getDataObject() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            return basicUnsetRefersToAbstractLNClass( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return getDataObject();
        case NsdPackage.ANY_LN_CLASS__BASE:
            return getBase();
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            return getRefersToAbstractLNClass();
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            getDataObject().clear();
            getDataObject().addAll( ( Collection< ? extends DataObject > ) newValue );
            return;
        case NsdPackage.ANY_LN_CLASS__BASE:
            setBase( ( String ) newValue );
            return;
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            setRefersToAbstractLNClass( ( AbstractLNClass ) newValue );
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            unsetDataObject();
            return;
        case NsdPackage.ANY_LN_CLASS__BASE:
            unsetBase();
            return;
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            unsetRefersToAbstractLNClass();
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
        case NsdPackage.ANY_LN_CLASS__DATA_OBJECT:
            return isSetDataObject();
        case NsdPackage.ANY_LN_CLASS__BASE:
            return isSetBase();
        case NsdPackage.ANY_LN_CLASS__REFERS_TO_ABSTRACT_LN_CLASS:
            return isSetRefersToAbstractLNClass();
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
        case NsdPackage.ANY_LN_CLASS___GET_NAME:
            return getName();
        case NsdPackage.ANY_LN_CLASS___GET_PARENT_LN_CLASSES:
            return getParentLNClasses();
        case NsdPackage.ANY_LN_CLASS___UNIQUE_DATA_OBJECT__DIAGNOSTICCHAIN_MAP:
            return uniqueDataObject( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (base: " );
        if( baseESet ) {
            result.append( base );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    /* Implicit link
     *   AnyLNClass.base                    -> AbstractLNClass
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "AnyLNImpl.buildExplicitLinks()" );

        if( super.buildExplicitLinks( console ) ) {
            return true;
        }

        if( isSetBase() ) {

            // This code assumes that the referred AbstractLNClass is in the same NS
            // TODO: check that it is right
            // DONE: this is not right
            //            getParentLNClasses()
            //                    .getAbstractLNClass()
            //                    .stream()
            //                    .filter( abstractLNClass -> abstractLNClass.getName().equals( getBase() ) )
            //                    .findAny()
            //                    .ifPresent( abstractLNClass -> setRefersToAbstractLNClass( abstractLNClass ) );
            AbstractLNClass abstractLNClass = getResourceSet().findAbstractLNClass( getBase(), getNsIdentification(),
                    true );

            if( abstractLNClass != null ) {
                setRefersToAbstractLNClass( abstractLNClass );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "while resolving link from AnyLNClass (name: ", getName(),
                        "): AbstractLNClass (name: ", getBase(), ") found in NS \"",
                        NsIdentification.of( getRefersToAbstractLNClass().getParentLNClasses().getParentNS() ), "\"" );
            }
            else {
                // TODO: Some NSD file (e.g. eTr_IEC61850-90-6_2018A5.nsd) use a non-abstract LNClass as base.
                // Is it allowed ?
                // DONE: no, in 61850-7-7:
                // An AbstractLNClass shall not be used by a real data model, and an LNClass shall not be
                // inherited by another LNClass.
                console.error( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "while resolving link from AnyLNClass (name: ", getName(),
                        "): AbstractLNClass (name: ", getBase(), ") not found" );
            }
        }

        return false;
    }

    @Override
    public NsIdentification getNsIdentification() {
        return NsIdentification.of( getParentLNClasses().getParentNS() );
    }

    public void createParameterizedComponents( IRiseClipseConsole console ) {
        this
                .getDataObject()
                .stream()
                .forEach( do_ -> ( ( DataObjectImpl ) do_ ).createParameterizedComponents( console,
                        getNsIdentification() ) );
    }

} //AnyLNClassImpl
