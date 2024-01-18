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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.AbbreviationsImpl#getParentServiceNS <em>Parent Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationsImpl extends NsdObjectImpl implements Abbreviations {
    /**
     * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected EList< Abbreviation > abbreviation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbbreviationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.ABBREVIATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Abbreviation > getAbbreviation() {
        if( abbreviation == null ) {
            abbreviation = new EObjectContainmentWithInverseEList.Unsettable< >( Abbreviation.class, this,
                    NsdPackage.ABBREVIATIONS__ABBREVIATION, NsdPackage.ABBREVIATION__PARENT_ABBREVIATIONS );
        }
        return abbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAbbreviation() {
        if( abbreviation != null ) {
            ( ( InternalEList.Unsettable< ? > ) abbreviation ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAbbreviation() {
        return abbreviation != null && ( ( InternalEList.Unsettable< ? > ) abbreviation ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getParentNS() {
        if( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__PARENT_NS ) {
            return null;
        }
        return ( NS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNS( NS newParentNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNS, NsdPackage.ABBREVIATIONS__PARENT_NS, msgs );
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
                || ( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__PARENT_NS && newParentNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentNS != null ) {
                msgs = ( ( InternalEObject ) newParentNS ).eInverseAdd( this, NsdPackage.NS__ABBREVIATIONS, NS.class,
                        msgs );
            }
            msgs = basicSetParentNS( newParentNS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATIONS__PARENT_NS, newParentNS,
                    newParentNS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceNS getParentServiceNS() {
        if( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS ) {
            return null;
        }
        return ( ServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceNS( ServiceNS newParentServiceNS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceNS, NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS,
                msgs );
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
                || ( eContainerFeatureID() != NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS
                        && newParentServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceNS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceNS != null ) {
                msgs = ( ( InternalEObject ) newParentServiceNS ).eInverseAdd( this,
                        NsdPackage.SERVICE_NS__ABBREVIATIONS, ServiceNS.class, msgs );
            }
            msgs = basicSetParentServiceNS( newParentServiceNS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS,
                    newParentServiceNS, newParentServiceNS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean uniqueAbbreviation( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "Abbreviations::uniqueAbbreviation";
        try {
            /**
             *
             * inv uniqueAbbreviation:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let
             *           status : Boolean[1] = self.abbreviation->isUnique(a | a.name)
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'There shall not be two Abbreviations elements with same name.', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.ABBREVIATIONS___UNIQUE_ABBREVIATION__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                /*@Caught*/ Object CAUGHT_IF_status;
                try {
                    final /*@NonInvalid*/ List< Abbreviation > abbreviation = this.getAbbreviation();
                    final /*@NonInvalid*/ SetValue BOXED_abbreviation = idResolver
                            .createSetOfAll( NsdTables.SET_CLSSid_Abbreviation, abbreviation );
                    /*@Thrown*/ Accumulator accumulator = ValueUtil
                            .createSetAccumulatorValue( NsdTables.SET_CLSSid_Abbreviation );
                    Iterator< Object > ITERATOR_a = BOXED_abbreviation.iterator();
                    /*@Thrown*/ boolean status;
                    while( true ) {
                        if( !ITERATOR_a.hasNext() ) {
                            status = true;
                            break;
                        }
                        /*@NonInvalid*/ Abbreviation a = ( Abbreviation ) ITERATOR_a.next();
                        /**
                         * a.name
                         */
                        final /*@NonInvalid*/ String name = a.getName();
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
                                NsdTables.STR_There_32_shall_32_not_32_be_32_two_32_Abbreviations_32_elements_32_with_32_same_32_name,
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAbbreviation() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentNS( ( NS ) otherEnd, msgs );
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return ( ( InternalEList< ? > ) getAbbreviation() ).basicRemove( otherEnd, msgs );
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            return basicSetParentNS( null, msgs );
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
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
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__ABBREVIATIONS, NS.class, msgs );
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.SERVICE_NS__ABBREVIATIONS, ServiceNS.class,
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return getAbbreviation();
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            return getParentNS();
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            getAbbreviation().clear();
            getAbbreviation().addAll( ( Collection< ? extends Abbreviation > ) newValue );
            return;
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            setParentNS( ( NS ) newValue );
            return;
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            unsetAbbreviation();
            return;
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            setParentNS( ( NS ) null );
            return;
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
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
        case NsdPackage.ABBREVIATIONS__ABBREVIATION:
            return isSetAbbreviation();
        case NsdPackage.ABBREVIATIONS__PARENT_NS:
            return getParentNS() != null;
        case NsdPackage.ABBREVIATIONS__PARENT_SERVICE_NS:
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
        case NsdPackage.ABBREVIATIONS___UNIQUE_ABBREVIATION__DIAGNOSTICCHAIN_MAP:
            return uniqueAbbreviation( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        }
        return super.eInvoke( operationID, arguments );
    }

} //AbbreviationsImpl
