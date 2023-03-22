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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl#getAbstractLNClass <em>Abstract LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl#getLNClass <em>LN Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.LNClassesImpl#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNClassesImpl extends NsdObjectImpl implements LNClasses {
    /**
     * The cached value of the '{@link #getAbstractLNClass() <em>Abstract LN Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbstractLNClass()
     * @generated
     * @ordered
     */
    protected EList< AbstractLNClass > abstractLNClass;

    /**
     * The cached value of the '{@link #getLNClass() <em>LN Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNClass()
     * @generated
     * @ordered
     */
    protected EList< LNClass > lNClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNClassesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.LN_CLASSES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AbstractLNClass > getAbstractLNClass() {
        if( abstractLNClass == null ) {
            abstractLNClass = new EObjectContainmentWithInverseEList.Unsettable< >(
                    AbstractLNClass.class, this, NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS,
                    NsdPackage.ABSTRACT_LN_CLASS__PARENT_LN_CLASSES );
        }
        return abstractLNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAbstractLNClass() {
        if( abstractLNClass != null ) ( ( InternalEList.Unsettable< ? > ) abstractLNClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAbstractLNClass() {
        return abstractLNClass != null && ( ( InternalEList.Unsettable< ? > ) abstractLNClass ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNClass > getLNClass() {
        if( lNClass == null ) {
            lNClass = new EObjectContainmentWithInverseEList.Unsettable< >( LNClass.class, this,
                    NsdPackage.LN_CLASSES__LN_CLASS, NsdPackage.LN_CLASS__PARENT_LN_CLASSES );
        }
        return lNClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNClass() {
        if( lNClass != null ) ( ( InternalEList.Unsettable< ? > ) lNClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNClass() {
        return lNClass != null && ( ( InternalEList.Unsettable< ? > ) lNClass ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getParentNS() {
        if( eContainerFeatureID() != NsdPackage.LN_CLASSES__PARENT_NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNS( NS newParentNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNS, NsdPackage.LN_CLASSES__PARENT_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentNS( NS newParentNS ) {
        if( newParentNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.LN_CLASSES__PARENT_NS && newParentNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentNS != null )
                msgs = ( ( InternalEObject ) newParentNS ).eInverseAdd( this, NsdPackage.NS__LN_CLASSES, NS.class,
                        msgs );
            msgs = basicSetParentNS( newParentNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.LN_CLASSES__PARENT_NS, newParentNS,
                    newParentNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniqueLNClass( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "LNClasses::uniqueLNClass";
        try {
            /**
             *
             * inv uniqueLNClass:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.lNClass->isUnique(c | c.name)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'Within an NS, there shall not be two LNClass sub-elements with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.LN_CLASSES___UNIQUE_LN_CLASS__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_IF_status;
                try {
                    final /*@NonInvalid*/ List< LNClass > lNClass = this.getLNClass();
                    final /*@NonInvalid*/ SetValue BOXED_lNClass = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_LNClass, lNClass );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_LNClass );
                    Iterator< Object > ITERATOR_c = BOXED_lNClass.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_c.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ LNClass c = ( LNClass ) ITERATOR_c.next();
                        /**
                         * c.name
                         */
                        final /*@NonInvalid*/ String name = c.getName();
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
                                NsdTables.STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_LNClass_32_sub_m_elements_32_with_32_s,
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
    @Override
    public boolean uniqueAbstractLNClass( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "LNClasses::uniqueAbstractLNClass";
        try {
            /**
             *
             * inv uniqueAbstractLNClass:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.abstractLNClass->isUnique(c | c.name)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'Within an NS, there shall not be two AbstractLNClass sub-elements with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.LN_CLASSES___UNIQUE_ABSTRACT_LN_CLASS__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_IF_status;
                try {
                    final /*@NonInvalid*/ List< AbstractLNClass > abstractLNClass = this.getAbstractLNClass();
                    final /*@NonInvalid*/ SetValue BOXED_abstractLNClass = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_AbstractLNClass, abstractLNClass );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_AbstractLNClass );
                    Iterator< Object > ITERATOR_c = BOXED_abstractLNClass.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_c.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ AbstractLNClass c = ( AbstractLNClass ) ITERATOR_c.next();
                        /**
                         * c.name
                         */
                        final /*@NonInvalid*/ String name = c.getName();
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
                                NsdTables.STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_AbstractLNClass_32_sub_m_element,
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAbstractLNClass() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNClass() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.LN_CLASSES__PARENT_NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentNS( ( NS ) otherEnd, msgs );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return ( ( InternalEList< ? > ) getAbstractLNClass() ).basicRemove( otherEnd, msgs );
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return ( ( InternalEList< ? > ) getLNClass() ).basicRemove( otherEnd, msgs );
        case NsdPackage.LN_CLASSES__PARENT_NS:
            return basicSetParentNS( null, msgs );
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
        case NsdPackage.LN_CLASSES__PARENT_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__LN_CLASSES, NS.class, msgs );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return getAbstractLNClass();
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return getLNClass();
        case NsdPackage.LN_CLASSES__PARENT_NS:
            return getParentNS();
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            getAbstractLNClass().clear();
            getAbstractLNClass().addAll( ( Collection< ? extends AbstractLNClass > ) newValue );
            return;
        case NsdPackage.LN_CLASSES__LN_CLASS:
            getLNClass().clear();
            getLNClass().addAll( ( Collection< ? extends LNClass > ) newValue );
            return;
        case NsdPackage.LN_CLASSES__PARENT_NS:
            setParentNS( ( NS ) newValue );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            unsetAbstractLNClass();
            return;
        case NsdPackage.LN_CLASSES__LN_CLASS:
            unsetLNClass();
            return;
        case NsdPackage.LN_CLASSES__PARENT_NS:
            setParentNS( ( NS ) null );
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
        case NsdPackage.LN_CLASSES__ABSTRACT_LN_CLASS:
            return isSetAbstractLNClass();
        case NsdPackage.LN_CLASSES__LN_CLASS:
            return isSetLNClass();
        case NsdPackage.LN_CLASSES__PARENT_NS:
            return getParentNS() != null;
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
        case NsdPackage.LN_CLASSES___UNIQUE_LN_CLASS__DIAGNOSTICCHAIN_MAP:
            return uniqueLNClass( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.LN_CLASSES___UNIQUE_ABSTRACT_LN_CLASS__DIAGNOSTICCHAIN_MAP:
            return uniqueAbstractLNClass( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

} //LNClassesImpl
