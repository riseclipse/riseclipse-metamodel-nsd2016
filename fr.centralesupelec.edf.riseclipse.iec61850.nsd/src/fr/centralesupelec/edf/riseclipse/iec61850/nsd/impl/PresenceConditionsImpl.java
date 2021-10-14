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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presence Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl#getPresenceCondition <em>Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.PresenceConditionsImpl#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresenceConditionsImpl extends NsdObjectImpl implements PresenceConditions {
    /**
     * The cached value of the '{@link #getPresenceCondition() <em>Presence Condition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresenceCondition()
     * @generated
     * @ordered
     */
    protected EList< PresenceCondition > presenceCondition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresenceConditionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.PRESENCE_CONDITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PresenceCondition > getPresenceCondition() {
        if( presenceCondition == null ) {
            presenceCondition = new EObjectContainmentWithInverseEList.Unsettable< >(
                    PresenceCondition.class, this, NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION,
                    NsdPackage.PRESENCE_CONDITION__PARENT_PRESENCE_CONDITIONS );
        }
        return presenceCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPresenceCondition() {
        if( presenceCondition != null ) ( ( InternalEList.Unsettable< ? > ) presenceCondition ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPresenceCondition() {
        return presenceCondition != null && ( ( InternalEList.Unsettable< ? > ) presenceCondition ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getParentNS() {
        if( eContainerFeatureID() != NsdPackage.PRESENCE_CONDITIONS__PARENT_NS ) return null;
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNS( NS newParentNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNS, NsdPackage.PRESENCE_CONDITIONS__PARENT_NS, msgs );
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
                || ( eContainerFeatureID() != NsdPackage.PRESENCE_CONDITIONS__PARENT_NS && newParentNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentNS != null )
                msgs = ( ( InternalEObject ) newParentNS ).eInverseAdd( this, NsdPackage.NS__PRESENCE_CONDITIONS,
                        NS.class, msgs );
            msgs = basicSetParentNS( newParentNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITIONS__PARENT_NS,
                    newParentNS, newParentNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getParentServiceNS() {
        if( eContainerFeatureID() != NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS ) return null;
        return ( ServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceNS( ServiceNS newParentServiceNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceNS,
                NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceNS( ServiceNS newParentServiceNS ) {
        if( newParentServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS
                        && newParentServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServiceNS != null )
                msgs = ( ( InternalEObject ) newParentServiceNS ).eInverseAdd( this,
                        NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, ServiceNS.class, msgs );
            msgs = basicSetParentServiceNS( newParentServiceNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS,
                    newParentServiceNS, newParentServiceNS ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniquePresenceCondition( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "PresenceConditions::uniquePresenceCondition";
        try {
            /**
             *
             * inv uniquePresenceCondition:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.presenceCondition->isUnique(p | p.name)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'There shall not be two PresenceCondition elements with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this, context );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.PRESENCE_CONDITIONS___UNIQUE_PRESENCE_CONDITION__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean symbol_2;
            if( le ) {
                symbol_2 = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_symbol_1;
                try {
                    final /*@NonInvalid*/ List< PresenceCondition > presenceCondition = this.getPresenceCondition();
                    final /*@NonInvalid*/ SetValue BOXED_presenceCondition = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_PresenceCondition, presenceCondition );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_PresenceCondition );
                    Iterator< Object > ITERATOR_p = BOXED_presenceCondition.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_p.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ PresenceCondition p = ( PresenceCondition ) ITERATOR_p.next();
                        /**
                         * p.name
                         */
                        final /*@NonInvalid*/ String name = p.getName();
                        //
                        if( accumulator.includes( name ) == ValueUtil.TRUE_VALUE ) {
                            status = false;
                            break; // Abort after second find
                        }
                        else {
                            accumulator.add( name );
                        }
                    }
                    /*@Thrown*/ Object symbol_1;
                    if( status ) {
                        symbol_1 = ValueUtil.TRUE_VALUE;
                    }
                    else {
                        final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                                NsdTables.STR_There_32_shall_32_not_32_be_32_two_32_PresenceCondition_32_elements_32_with_32_same_32_name,
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
        case NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPresenceCondition() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentNS( ( NS ) otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServiceNS( ( ServiceNS ) otherEnd, msgs );
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
        case NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION:
            return ( ( InternalEList< ? > ) getPresenceCondition() ).basicRemove( otherEnd, msgs );
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            return basicSetParentNS( null, msgs );
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            return basicSetParentServiceNS( null, msgs );
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
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__PRESENCE_CONDITIONS, NS.class, msgs );
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS,
                    ServiceNS.class, msgs );
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
        case NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION:
            return getPresenceCondition();
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            return getParentNS();
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            return getParentServiceNS();
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
        case NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION:
            getPresenceCondition().clear();
            getPresenceCondition().addAll( ( Collection< ? extends PresenceCondition > ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            setParentNS( ( NS ) newValue );
            return;
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            setParentServiceNS( ( ServiceNS ) newValue );
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
        case NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION:
            unsetPresenceCondition();
            return;
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            setParentNS( ( NS ) null );
            return;
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            setParentServiceNS( ( ServiceNS ) null );
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
        case NsdPackage.PRESENCE_CONDITIONS__PRESENCE_CONDITION:
            return isSetPresenceCondition();
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_NS:
            return getParentNS() != null;
        case NsdPackage.PRESENCE_CONDITIONS__PARENT_SERVICE_NS:
            return getParentServiceNS() != null;
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
        case NsdPackage.PRESENCE_CONDITIONS___UNIQUE_PRESENCE_CONDITION__DIAGNOSTICCHAIN_MAP:
            return uniquePresenceCondition( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

} //PresenceConditionsImpl
