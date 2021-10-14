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
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ACSIServicesKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicable Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl#getDataSetMemberOf <em>Data Set Member Of</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ApplicableServicesImpl#getParentFunctionalConstraint <em>Parent Functional Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicableServicesImpl extends NsdObjectImpl implements ApplicableServices {
    /**
     * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected EList< ServiceType > service;

    /**
     * The cached value of the '{@link #getDataSetMemberOf() <em>Data Set Member Of</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSetMemberOf()
     * @generated
     * @ordered
     */
    protected EList< DataSetMemberOf > dataSetMemberOf;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicableServicesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.APPLICABLE_SERVICES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceType > getService() {
        if( service == null ) {
            service = new EObjectContainmentWithInverseEList.Unsettable< >( ServiceType.class, this,
                    NsdPackage.APPLICABLE_SERVICES__SERVICE, NsdPackage.SERVICE_TYPE__PARENT_APPLICABLE_SERVICES );
        }
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetService() {
        if( service != null ) ( ( InternalEList.Unsettable< ? > ) service ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetService() {
        return service != null && ( ( InternalEList.Unsettable< ? > ) service ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataSetMemberOf > getDataSetMemberOf() {
        if( dataSetMemberOf == null ) {
            dataSetMemberOf = new EObjectContainmentWithInverseEList.Unsettable< >(
                    DataSetMemberOf.class, this, NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF,
                    NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES );
        }
        return dataSetMemberOf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataSetMemberOf() {
        if( dataSetMemberOf != null ) ( ( InternalEList.Unsettable< ? > ) dataSetMemberOf ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataSetMemberOf() {
        return dataSetMemberOf != null && ( ( InternalEList.Unsettable< ? > ) dataSetMemberOf ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraint getParentFunctionalConstraint() {
        if( eContainerFeatureID() != NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT ) return null;
        return ( FunctionalConstraint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionalConstraint( FunctionalConstraint newParentFunctionalConstraint,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionalConstraint,
                NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionalConstraint( FunctionalConstraint newParentFunctionalConstraint ) {
        if( newParentFunctionalConstraint != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT
                        && newParentFunctionalConstraint != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionalConstraint ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentFunctionalConstraint != null )
                msgs = ( ( InternalEObject ) newParentFunctionalConstraint ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES, FunctionalConstraint.class, msgs );
            msgs = basicSetParentFunctionalConstraint( newParentFunctionalConstraint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT, newParentFunctionalConstraint,
                    newParentFunctionalConstraint ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniqueDataSetMemberOf( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "ApplicableServices::uniqueDataSetMemberOf";
        try {
            /**
             *
             * inv uniqueDataSetMemberOf:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.dataSetMemberOf->isUnique(d | d.cb)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'For an ApplicableServices, there shall not be two DataSetMemberOf sub-elements with same cb.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.APPLICABLE_SERVICES___UNIQUE_DATA_SET_MEMBER_OF__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_symbol_1;
                try {
                    final /*@NonInvalid*/ List< DataSetMemberOf > dataSetMemberOf = this.getDataSetMemberOf();
                    final /*@NonInvalid*/ SetValue BOXED_dataSetMemberOf = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_DataSetMemberOf, dataSetMemberOf );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_DataSetMemberOf );
                    Iterator< Object > ITERATOR_d = BOXED_dataSetMemberOf.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_d.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ DataSetMemberOf d = ( DataSetMemberOf ) ITERATOR_d.next();
                        /**
                         * d.cb
                         */
                        final /*@NonInvalid*/ CBKind cb = d.getCb();
                        final /*@NonInvalid*/ EnumerationLiteralId BOXED_cb = cb == null ? null
                                : NsdTables.ENUMid_CBKind
                                        .getEnumerationLiteralId( ClassUtil.nonNullState( cb.getName() ) );
                        //
                        if( accumulator.includes( BOXED_cb ) == ValueUtil.TRUE_VALUE ) {
                            status = false;
                            break; // Abort after second find
                        }
                        else {
                            accumulator.add( BOXED_cb );
                        }
                    }
                    /*@Thrown*/ Object symbol_1;
                    if( status ) {
                        symbol_1 = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                                NsdTables.STR_For_32_an_32_ApplicableServices_44_32_there_32_shall_32_not_32_be_32_two_32_DataSetMemberO,
                                status );
                        symbol_1 = symbol_0;
                    }
                    CAUGHT_symbol_1 = symbol_1;
                }
                catch( Exception e ) {
                    CAUGHT_symbol_1 = ValueUtil.createInvalidValue( e );
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, CAUGHT_symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
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
    public boolean uniqueService( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "ApplicableServices::uniqueService";
        try {
            /**
             *
             * inv uniqueService:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.service->isUnique(s | s.name)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'For an ApplicableServices, there shall not be two ServiceType sub-elements with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.APPLICABLE_SERVICES___UNIQUE_SERVICE__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_symbol_1;
                try {
                    final /*@NonInvalid*/ List< ServiceType > service = this.getService();
                    final /*@NonInvalid*/ SetValue BOXED_service = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_ServiceType, service );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_ServiceType );
                    Iterator< Object > ITERATOR_s = BOXED_service.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_s.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ ServiceType s = ( ServiceType ) ITERATOR_s.next();
                        /**
                         * s.name
                         */
                        final /*@NonInvalid*/ ACSIServicesKind name = s.getName();
                        final /*@NonInvalid*/ EnumerationLiteralId BOXED_name = name == null ? null
                                : NsdTables.ENUMid_ACSIServicesKind
                                        .getEnumerationLiteralId( ClassUtil.nonNullState( name.getName() ) );
                        //
                        if( accumulator.includes( BOXED_name ) == ValueUtil.TRUE_VALUE ) {
                            status = false;
                            break; // Abort after second find
                        }
                        else {
                            accumulator.add( BOXED_name );
                        }
                    }
                    /*@Thrown*/ Object symbol_1;
                    if( status ) {
                        symbol_1 = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                                NsdTables.STR_For_32_an_32_ApplicableServices_44_32_there_32_shall_32_not_32_be_32_two_32_ServiceType_32_su,
                                status );
                        symbol_1 = symbol_0;
                    }
                    CAUGHT_symbol_1 = symbol_1;
                }
                catch( Exception e ) {
                    CAUGHT_symbol_1 = ValueUtil.createInvalidValue( e );
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, CAUGHT_symbol_1, NsdTables.INT_0 )
                        .booleanValue();
                symbol_2 = logDiagnostic;
            }
            return symbol_2;
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getService() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDataSetMemberOf() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentFunctionalConstraint( ( FunctionalConstraint ) otherEnd, msgs );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return ( ( InternalEList< ? > ) getService() ).basicRemove( otherEnd, msgs );
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return ( ( InternalEList< ? > ) getDataSetMemberOf() ).basicRemove( otherEnd, msgs );
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            return basicSetParentFunctionalConstraint( null, msgs );
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
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            return eInternalContainer().eInverseRemove( this, NsdPackage.FUNCTIONAL_CONSTRAINT__APPLICABLE_SERVICES,
                    FunctionalConstraint.class, msgs );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return getService();
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return getDataSetMemberOf();
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            return getParentFunctionalConstraint();
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            getService().clear();
            getService().addAll( ( Collection< ? extends ServiceType > ) newValue );
            return;
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            getDataSetMemberOf().clear();
            getDataSetMemberOf().addAll( ( Collection< ? extends DataSetMemberOf > ) newValue );
            return;
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            setParentFunctionalConstraint( ( FunctionalConstraint ) newValue );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            unsetService();
            return;
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            unsetDataSetMemberOf();
            return;
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            setParentFunctionalConstraint( ( FunctionalConstraint ) null );
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
        case NsdPackage.APPLICABLE_SERVICES__SERVICE:
            return isSetService();
        case NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF:
            return isSetDataSetMemberOf();
        case NsdPackage.APPLICABLE_SERVICES__PARENT_FUNCTIONAL_CONSTRAINT:
            return getParentFunctionalConstraint() != null;
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
        case NsdPackage.APPLICABLE_SERVICES___UNIQUE_DATA_SET_MEMBER_OF__DIAGNOSTICCHAIN_MAP:
            return uniqueDataSetMemberOf( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.APPLICABLE_SERVICES___UNIQUE_SERVICE__DIAGNOSTICCHAIN_MAP:
            return uniqueService( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

} //ApplicableServicesImpl
