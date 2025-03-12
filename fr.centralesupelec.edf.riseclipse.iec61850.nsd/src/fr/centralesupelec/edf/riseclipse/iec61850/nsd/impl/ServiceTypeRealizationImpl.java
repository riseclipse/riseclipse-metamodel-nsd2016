/**
 *  Copyright (c) 2016-2025 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealization;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationImpl#getRealize <em>Realize</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceTypeRealizationImpl#getParentServiceTypeRealizations <em>Parent Service Type Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTypeRealizationImpl extends ConstructedAttributeImpl implements ServiceTypeRealization {
    /**
     * The default value of the '{@link #getRealize() <em>Realize</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealize()
     * @generated
     * @ordered
     */
    protected static final String REALIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRealize() <em>Realize</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealize()
     * @generated
     * @ordered
     */
    protected String realize = REALIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceTypeRealizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_TYPE_REALIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRealize() {
        return realize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRealize( String newRealize ) {
        String oldRealize = realize;
        realize = newRealize;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_TYPE_REALIZATION__REALIZE,
                    oldRealize, realize ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceTypeRealizations getParentServiceTypeRealizations() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS ) {
            return null;
        }
        return ( ServiceTypeRealizations ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServiceTypeRealizations(
            ServiceTypeRealizations newParentServiceTypeRealizations, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServiceTypeRealizations,
                NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServiceTypeRealizations( ServiceTypeRealizations newParentServiceTypeRealizations ) {
        if( newParentServiceTypeRealizations != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS
                        && newParentServiceTypeRealizations != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServiceTypeRealizations ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServiceTypeRealizations != null ) {
                msgs = ( ( InternalEObject ) newParentServiceTypeRealizations ).eInverseAdd( this,
                        NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION, ServiceTypeRealizations.class,
                        msgs );
            }
            msgs = basicSetParentServiceTypeRealizations( newParentServiceTypeRealizations, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS,
                    newParentServiceTypeRealizations, newParentServiceTypeRealizations ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean realizeAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "ServiceTypeRealization::realizeAttributeRequired";
        try {
            /**
             *
             * inv realizeAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.realize <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The realize attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.SERVICE_TYPE_REALIZATION___REALIZE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String realize = this.getRealize();
                final /*@NonInvalid*/ boolean status = realize != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_realize_32_attribute_32_is_32_required, status );
                    IF_status = TUP_;
                }
                final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
                        .evaluate( executor, TypeId.BOOLEAN, constraintName, this, ( Object ) null, diagnostics,
                                context, ( Object ) null, severity_0, IF_status, NsdTables.INT_0 )
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentServiceTypeRealizations( ( ServiceTypeRealizations ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            return basicSetParentServiceTypeRealizations( null, msgs );
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
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            return eInternalContainer().eInverseRemove( this,
                    NsdPackage.SERVICE_TYPE_REALIZATIONS__SERVICE_TYPE_REALIZATION, ServiceTypeRealizations.class,
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
        case NsdPackage.SERVICE_TYPE_REALIZATION__REALIZE:
            return getRealize();
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            return getParentServiceTypeRealizations();
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
        case NsdPackage.SERVICE_TYPE_REALIZATION__REALIZE:
            setRealize( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            setParentServiceTypeRealizations( ( ServiceTypeRealizations ) newValue );
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
        case NsdPackage.SERVICE_TYPE_REALIZATION__REALIZE:
            setRealize( REALIZE_EDEFAULT );
            return;
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            setParentServiceTypeRealizations( ( ServiceTypeRealizations ) null );
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
        case NsdPackage.SERVICE_TYPE_REALIZATION__REALIZE:
            return REALIZE_EDEFAULT == null ? realize != null : !REALIZE_EDEFAULT.equals( realize );
        case NsdPackage.SERVICE_TYPE_REALIZATION__PARENT_SERVICE_TYPE_REALIZATIONS:
            return getParentServiceTypeRealizations() != null;
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
        case NsdPackage.SERVICE_TYPE_REALIZATION___REALIZE_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return realizeAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (realize: " );
        result.append( realize );
        result.append( ')' );
        return result.toString();
    }

} //ServiceTypeRealizationImpl
