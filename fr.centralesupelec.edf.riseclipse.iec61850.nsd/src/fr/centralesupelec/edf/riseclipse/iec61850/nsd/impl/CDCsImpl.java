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
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDC;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD Cs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl#getCDC <em>CDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.CDCsImpl#getParentNS <em>Parent NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDCsImpl extends NsdObjectImpl implements CDCs {
    /**
     * The cached value of the '{@link #getCDC() <em>CDC</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCDC()
     * @generated
     * @ordered
     */
    protected EList< CDC > cDC;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CDCsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.CD_CS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CDC > getCDC() {
        if( cDC == null ) {
            cDC = new EObjectContainmentWithInverseEList.Unsettable< >( CDC.class, this, NsdPackage.CD_CS__CDC,
                    NsdPackage.CDC__PARENT_CD_CS );
        }
        return cDC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCDC() {
        if( cDC != null ) ( ( InternalEList.Unsettable< ? > ) cDC ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCDC() {
        return cDC != null && ( ( InternalEList.Unsettable< ? > ) cDC ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getParentNS() {
        if( eContainerFeatureID() != NsdPackage.CD_CS__PARENT_NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNS( NS newParentNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNS, NsdPackage.CD_CS__PARENT_NS, msgs );
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
                || ( eContainerFeatureID() != NsdPackage.CD_CS__PARENT_NS && newParentNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentNS != null )
                msgs = ( ( InternalEObject ) newParentNS ).eInverseAdd( this, NsdPackage.NS__CD_CS, NS.class, msgs );
            msgs = basicSetParentNS( newParentNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.CD_CS__PARENT_NS, newParentNS,
                    newParentNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniqueCDC( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "CDCs::uniqueCDC";
        try {
            /**
             *
             * inv uniqueCDC:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[?] = self.cDC->select(c | c.variant = null)
             *           ->isUnique(c | c.name) or
             *           self.cDC->select(c | c.variant <> null)
             *           ->forAll(c1, c2 |
             *             (c1 <> c2 implies c1.name <> c2.name or c1.variant <> c2.variant
             *             ))
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'Within an NS, there shall not be two CDC sub-elements with same name and (if defined) variant.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.CD_CS___UNIQUE_CDC__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean local_8;
            if( le ) {
                local_8 = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_local_7;
                try {
                    /*@Caught*/ Object CAUGHT_isUnique;
                    try {
                        final /*@NonInvalid*/ List< CDC > cDC = this.getCDC();
                        final /*@NonInvalid*/ SetValue BOXED_cDC = idResolver.createSetOfAll( NsdTables.SET_CLSSid_CDC,
                                cDC );
                        /*@Thrown*/ Accumulator accumulator = ValueUtil
                                .createSetAccumulatorValue( NsdTables.SET_CLSSid_CDC );
                        Iterator< Object > ITERATOR_c = BOXED_cDC.iterator();
                        /*@NonInvalid*/ SetValue select;
                        while( true ) {
                            if( !ITERATOR_c.hasNext() ) {
                                select = accumulator;
                                break;
                            }
                            /*@NonInvalid*/ CDC c = ( CDC ) ITERATOR_c.next();
                            /**
                             * c.variant = null
                             */
                            final /*@NonInvalid*/ String variant = c.getVariant();
                            final /*@NonInvalid*/ boolean eq = variant == null;
                            //
                            if( eq ) {
                                accumulator.add( c );
                            }
                        }
                        /*@Thrown*/ Accumulator accumulator_0 = ValueUtil
                                .createSetAccumulatorValue( NsdTables.SET_CLSSid_CDC );
                        Iterator< Object > ITERATOR_c_0 = select.iterator();
                        /*@Thrown*/ boolean isUnique;
                        while( true ) {
                            if( !ITERATOR_c_0.hasNext() ) {
                                isUnique = true;
                                break;
                            }
                            /*@NonInvalid*/ CDC c_0 = ( CDC ) ITERATOR_c_0.next();
                            /**
                             * c.name
                             */
                            final /*@NonInvalid*/ String name = c_0.getName();
                            //
                            if( accumulator_0.includes( name ) == ValueUtil.TRUE_VALUE ) {
                                isUnique = false;
                                break; // Abort after second find
                            }
                            else {
                                accumulator_0.add( name );
                            }
                        }
                        CAUGHT_isUnique = isUnique;
                    }
                    catch( Exception e ) {
                        CAUGHT_isUnique = ValueUtil.createInvalidValue( e );
                    }
                    final /*@Thrown*/ Boolean status;
                    if( CAUGHT_isUnique == ValueUtil.TRUE_VALUE ) {
                        status = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        /*@Caught*/ Object CAUGHT_forAll;
                        try {
                            final /*@NonInvalid*/ List< CDC > cDC_0 = this.getCDC();
                            final /*@NonInvalid*/ SetValue BOXED_cDC_0 = idResolver
                                    .createSetOfAll( NsdTables.SET_CLSSid_CDC, cDC_0 );
                            /*@Thrown*/ Accumulator accumulator_1 = ValueUtil
                                    .createSetAccumulatorValue( NsdTables.SET_CLSSid_CDC );
                            Iterator< Object > ITERATOR_c_1 = BOXED_cDC_0.iterator();
                            /*@NonInvalid*/ SetValue select_0;
                            while( true ) {
                                if( !ITERATOR_c_1.hasNext() ) {
                                    select_0 = accumulator_1;
                                    break;
                                }
                                /*@NonInvalid*/ CDC c_1 = ( CDC ) ITERATOR_c_1.next();
                                /**
                                 * c.variant <> null
                                 */
                                final /*@NonInvalid*/ String variant_0 = c_1.getVariant();
                                final /*@NonInvalid*/ boolean ne = variant_0 != null;
                                //
                                if( ne ) {
                                    accumulator_1.add( c_1 );
                                }
                            }
                            final org.eclipse.ocl.pivot.Class TYPE_forAll_0 = executor.getStaticTypeOfValue( null,
                                    select_0 );
                            final LibraryIterationExtension IMPL_forAll_0 = ( LibraryIterationExtension ) TYPE_forAll_0
                                    .lookupImplementation( standardLibrary,
                                            OCLstdlibTables.Operations._Collection__1_forAll );
                            final /*@NonNull*/ Object ACC_forAll_0 = IMPL_forAll_0.createAccumulatorValue( executor,
                                    TypeId.BOOLEAN, TypeId.BOOLEAN );
                            /**
                             * Implementation of the iterator body.
                             */
                            final AbstractSimpleOperation BODY_forAll_0 = new AbstractSimpleOperation() {
                                /**
                                 * c1 <> c2 implies c1.name <> c2.name or c1.variant <> c2.variant
                                 */
                                @Override
                                public /*@Nullable*/ Object evaluate( final Executor executor, final TypeId typeId,
                                        final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues ) {
                                    final /*@NonInvalid*/ SetValue select_0 = ( SetValue ) sourceAndArgumentValues[0];
                                    final /*@NonInvalid*/ Object c1 = sourceAndArgumentValues[1];
                                    final /*@NonInvalid*/ Object c2 = sourceAndArgumentValues[2];
                                    /*@Caught*/ Object CAUGHT_implies;
                                    try {
                                        final /*@NonInvalid*/ CDC local_0 = ( CDC ) c1;
                                        final /*@NonInvalid*/ CDC local_1 = ( CDC ) c2;
                                        final /*@NonInvalid*/ boolean ne_0 = ( local_0 != null )
                                                ? !local_0.equals( local_1 )
                                                : ( local_1 != null );
                                        final /*@Thrown*/ Boolean implies;
                                        if( !ne_0 ) {
                                            implies = ValueUtil.TRUE_VALUE;
                                        }
                                        else {
                                            /*@Caught*/ Object CAUGHT_or;
                                            try {
                                                /*@Caught*/ Object CAUGHT_ne_1;
                                                try {
                                                    if( local_0 == null ) {
                                                        throw new InvalidValueException(
                                                                "Null source for \'\'http://www.iec.ch/61850/2016/NSD\'::CDC::name\'" );
                                                    }
                                                    final /*@Thrown*/ String name_0 = local_0.getName();
                                                    if( local_1 == null ) {
                                                        throw new InvalidValueException(
                                                                "Null source for \'\'http://www.iec.ch/61850/2016/NSD\'::CDC::name\'" );
                                                    }
                                                    final /*@Thrown*/ String name_1 = local_1.getName();
                                                    final /*@Thrown*/ boolean ne_1 = ( name_0 != null )
                                                            ? !name_0.equals( name_1 )
                                                            : ( name_1 != null );
                                                    CAUGHT_ne_1 = ne_1;
                                                }
                                                catch( Exception e ) {
                                                    CAUGHT_ne_1 = ValueUtil.createInvalidValue( e );
                                                }
                                                final /*@Thrown*/ Boolean or;
                                                if( CAUGHT_ne_1 == ValueUtil.TRUE_VALUE ) {
                                                    or = ValueUtil.TRUE_VALUE;
                                                }
                                                else {
                                                    /*@Caught*/ Object CAUGHT_ne_2;
                                                    try {
                                                        if( local_0 == null ) {
                                                            throw new InvalidValueException(
                                                                    "Null source for \'\'http://www.iec.ch/61850/2016/NSD\'::CDC::variant\'" );
                                                        }
                                                        final /*@Thrown*/ String variant_1 = local_0.getVariant();
                                                        if( local_1 == null ) {
                                                            throw new InvalidValueException(
                                                                    "Null source for \'\'http://www.iec.ch/61850/2016/NSD\'::CDC::variant\'" );
                                                        }
                                                        final /*@Thrown*/ String variant_2 = local_1.getVariant();
                                                        final /*@Thrown*/ boolean ne_2 = ( variant_1 != null )
                                                                ? !variant_1.equals( variant_2 )
                                                                : ( variant_2 != null );
                                                        CAUGHT_ne_2 = ne_2;
                                                    }
                                                    catch( Exception e ) {
                                                        CAUGHT_ne_2 = ValueUtil.createInvalidValue( e );
                                                    }
                                                    if( CAUGHT_ne_2 == ValueUtil.TRUE_VALUE ) {
                                                        or = ValueUtil.TRUE_VALUE;
                                                    }
                                                    else {
                                                        if( CAUGHT_ne_1 instanceof InvalidValueException ) {
                                                            throw( InvalidValueException ) CAUGHT_ne_1;
                                                        }
                                                        if( CAUGHT_ne_2 instanceof InvalidValueException ) {
                                                            throw( InvalidValueException ) CAUGHT_ne_2;
                                                        }
                                                        or = ValueUtil.FALSE_VALUE;
                                                    }
                                                }
                                                CAUGHT_or = or;
                                            }
                                            catch( Exception e ) {
                                                CAUGHT_or = ValueUtil.createInvalidValue( e );
                                            }
                                            if( CAUGHT_or == ValueUtil.TRUE_VALUE ) {
                                                implies = ValueUtil.TRUE_VALUE;
                                            }
                                            else {
                                                if( CAUGHT_or instanceof InvalidValueException ) {
                                                    throw( InvalidValueException ) CAUGHT_or;
                                                }
                                                if( CAUGHT_or == null ) {
                                                    implies = null;
                                                }
                                                else {
                                                    implies = ValueUtil.FALSE_VALUE;
                                                }
                                            }
                                        }
                                        CAUGHT_implies = implies;
                                    }
                                    catch( Exception e ) {
                                        CAUGHT_implies = ValueUtil.createInvalidValue( e );
                                    }
                                    return CAUGHT_implies;
                                }
                            };
                            final ExecutorMultipleIterationManager MGR_forAll_0 = new ExecutorMultipleIterationManager(
                                    executor, 2, TypeId.BOOLEAN, BODY_forAll_0, select_0, ACC_forAll_0 );
                            final /*@Thrown*/ Boolean forAll = ( Boolean ) IMPL_forAll_0
                                    .evaluateIteration( MGR_forAll_0 );
                            CAUGHT_forAll = forAll;
                        }
                        catch( Exception e ) {
                            CAUGHT_forAll = ValueUtil.createInvalidValue( e );
                        }
                        if( CAUGHT_forAll == ValueUtil.TRUE_VALUE ) {
                            status = ValueUtil.TRUE_VALUE;
                        }
                        else {
                            if( CAUGHT_isUnique instanceof InvalidValueException ) {
                                throw( InvalidValueException ) CAUGHT_isUnique;
                            }
                            if( CAUGHT_forAll instanceof InvalidValueException ) {
                                throw( InvalidValueException ) CAUGHT_forAll;
                            }
                            if( CAUGHT_forAll == null ) {
                                status = null;
                            }
                            else {
                                status = ValueUtil.FALSE_VALUE;
                            }
                        }
                    }
                    final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
                    /*@Thrown*/ Object local_7;
                    if( eq_0 ) {
                        local_7 = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        final /*@Thrown*/ TupleValue local_6 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                                NsdTables.STR_Within_32_an_32_NS_44_32_there_32_shall_32_not_32_be_32_two_32_CDC_32_sub_m_elements_32_with_32_same_32,
                                status );
                        local_7 = local_6;
                    }
                    CAUGHT_local_7 = local_7;
                }
                catch( Exception e ) {
                    CAUGHT_local_7 = ValueUtil.createInvalidValue( e );
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, CAUGHT_local_7, NsdTables.INT_0 )
                        .booleanValue();
                local_8 = logDiagnostic;
            }
            return local_8;
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
        case NsdPackage.CD_CS__CDC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCDC() ).basicAdd( otherEnd, msgs );
        case NsdPackage.CD_CS__PARENT_NS:
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
        case NsdPackage.CD_CS__CDC:
            return ( ( InternalEList< ? > ) getCDC() ).basicRemove( otherEnd, msgs );
        case NsdPackage.CD_CS__PARENT_NS:
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
        case NsdPackage.CD_CS__PARENT_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__CD_CS, NS.class, msgs );
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
        case NsdPackage.CD_CS__CDC:
            return getCDC();
        case NsdPackage.CD_CS__PARENT_NS:
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
        case NsdPackage.CD_CS__CDC:
            getCDC().clear();
            getCDC().addAll( ( Collection< ? extends CDC > ) newValue );
            return;
        case NsdPackage.CD_CS__PARENT_NS:
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
        case NsdPackage.CD_CS__CDC:
            unsetCDC();
            return;
        case NsdPackage.CD_CS__PARENT_NS:
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
        case NsdPackage.CD_CS__CDC:
            return isSetCDC();
        case NsdPackage.CD_CS__PARENT_NS:
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
        case NsdPackage.CD_CS___UNIQUE_CDC__DIAGNOSTICCHAIN_MAP:
            return uniqueCDC( ( DiagnosticChain ) arguments.get( 0 ), ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

} //CDCsImpl
