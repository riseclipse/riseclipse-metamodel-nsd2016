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
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServices;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CBKind;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DataSetMemberOf;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Member Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl#getCb <em>Cb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DataSetMemberOfImpl#getParentApplicableServices <em>Parent Applicable Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetMemberOfImpl extends NsdObjectImpl implements DataSetMemberOf {
    /**
     * The default value of the '{@link #getCb() <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCb()
     * @generated
     * @ordered
     */
    protected static final CBKind CB_EDEFAULT = CBKind.RCB;

    /**
     * The cached value of the '{@link #getCb() <em>Cb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCb()
     * @generated
     * @ordered
     */
    protected CBKind cb = CB_EDEFAULT;

    /**
     * This is true if the Cb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cbESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataSetMemberOfImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DATA_SET_MEMBER_OF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CBKind getCb() {
        return cb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCb( CBKind newCb ) {
        CBKind oldCb = cb;
        cb = newCb == null ? CB_EDEFAULT : newCb;
        boolean oldCbESet = cbESet;
        cbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DATA_SET_MEMBER_OF__CB, oldCb, cb,
                    !oldCbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCb() {
        CBKind oldCb = cb;
        boolean oldCbESet = cbESet;
        cb = CB_EDEFAULT;
        cbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DATA_SET_MEMBER_OF__CB, oldCb,
                    CB_EDEFAULT, oldCbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCb() {
        return cbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServices getParentApplicableServices() {
        if( eContainerFeatureID() != NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES ) return null;
        return ( ApplicableServices ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentApplicableServices( ApplicableServices newParentApplicableServices,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentApplicableServices,
                NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentApplicableServices( ApplicableServices newParentApplicableServices ) {
        if( newParentApplicableServices != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES
                        && newParentApplicableServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentApplicableServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentApplicableServices != null )
                msgs = ( ( InternalEObject ) newParentApplicableServices ).eInverseAdd( this,
                        NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF, ApplicableServices.class, msgs );
            msgs = basicSetParentApplicableServices( newParentApplicableServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES, newParentApplicableServices,
                    newParentApplicableServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean cbAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "DataSetMemberOf::cbAttributeRequired";
        try {
            /**
             *
             * inv cbAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.cb <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The cb attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.DATA_SET_MEMBER_OF___CB_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ CBKind cb = this.getCb();
                final /*@NonInvalid*/ EnumerationLiteralId BOXED_cb = cb == null ? null
                        : NsdTables.ENUMid_CBKind.getEnumerationLiteralId( ClassUtil.nonNullState( cb.getName() ) );
                final /*@NonInvalid*/ boolean status = BOXED_cb != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_cb_32_attribute_32_is_32_required, status );
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
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentApplicableServices( ( ApplicableServices ) otherEnd, msgs );
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
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            return basicSetParentApplicableServices( null, msgs );
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
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            return eInternalContainer().eInverseRemove( this, NsdPackage.APPLICABLE_SERVICES__DATA_SET_MEMBER_OF,
                    ApplicableServices.class, msgs );
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            return getCb();
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            return getParentApplicableServices();
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            setCb( ( CBKind ) newValue );
            return;
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            setParentApplicableServices( ( ApplicableServices ) newValue );
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            unsetCb();
            return;
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            setParentApplicableServices( ( ApplicableServices ) null );
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
        case NsdPackage.DATA_SET_MEMBER_OF__CB:
            return isSetCb();
        case NsdPackage.DATA_SET_MEMBER_OF__PARENT_APPLICABLE_SERVICES:
            return getParentApplicableServices() != null;
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
        case NsdPackage.DATA_SET_MEMBER_OF___CB_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return cbAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (cb: " );
        if( cbESet )
            result.append( cb );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DataSetMemberOfImpl
