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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Ns Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getParentApplicableServiceNS <em>Parent Applicable Service NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNsUsageImpl extends NsdObjectImpl implements ServiceNsUsage {
    /**
     * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppliesTo()
     * @generated
     * @ordered
     */
    protected EList< AppliesToType > appliesTo;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * This is true if the Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean idESet;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final Integer VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected Integer version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final String REVISION_EDEFAULT = "A";

    /**
     * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected String revision = REVISION_EDEFAULT;

    /**
     * This is true if the Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceNsUsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_NS_USAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( Integer newVersion ) {
        Integer oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__VERSION, oldVersion,
                    version, !oldVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        Integer oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__VERSION, oldVersion,
                    VERSION_EDEFAULT, oldVersionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AppliesToType > getAppliesTo() {
        if( appliesTo == null ) {
            appliesTo = new EObjectContainmentWithInverseEList.Unsettable< >( AppliesToType.class, this,
                    NsdPackage.SERVICE_NS_USAGE__APPLIES_TO, NsdPackage.APPLIES_TO_TYPE__PARENT_SERVICE_NS_USAGE );
        }
        return appliesTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAppliesTo() {
        if( appliesTo != null ) {
            ( ( InternalEList.Unsettable< ? > ) appliesTo ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppliesTo() {
        return appliesTo != null && ( ( InternalEList.Unsettable< ? > ) appliesTo ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ApplicableServiceNS getParentApplicableServiceNS() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS ) {
            return null;
        }
        return ( ApplicableServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentApplicableServiceNS( ApplicableServiceNS newParentApplicableServiceNS,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentApplicableServiceNS,
                NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentApplicableServiceNS( ApplicableServiceNS newParentApplicableServiceNS ) {
        if( newParentApplicableServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS
                        && newParentApplicableServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentApplicableServiceNS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentApplicableServiceNS != null ) {
                msgs = ( ( InternalEObject ) newParentApplicableServiceNS ).eInverseAdd( this,
                        NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE, ApplicableServiceNS.class, msgs );
            }
            msgs = basicSetParentApplicableServiceNS( newParentApplicableServiceNS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS, newParentApplicableServiceNS,
                    newParentApplicableServiceNS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean idAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "ServiceNsUsage::idAttributeRequired";
        try {
            /**
             *
             * inv idAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.id <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The id attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.SERVICE_NS_USAGE___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ String id = this.getId();
                final /*@NonInvalid*/ boolean status = id != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_id_32_attribute_32_is_32_required, status );
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
    public boolean versionAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "ServiceNsUsage::versionAttributeRequired";
        try {
            /**
             *
             * inv versionAttributeRequired:
             *   let severity : Integer[1] = constraintName.getSeverity()
             *   in
             *     if severity <= 0
             *     then true
             *     else
             *       let
             *         result : OclAny[1] = let status : Boolean[1] = self.version <> null
             *         in
             *           if status = true
             *           then true
             *           else
             *             Tuple{message = 'The version attribute is required', status = status
             *             }
             *           endif
             *       in
             *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
             *     endif
             */
            final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor( this );
            final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate( executor,
                    NsdPackage.Literals.SERVICE_NS_USAGE___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
            final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
                    .evaluate( executor, severity_0, NsdTables.INT_0 ).booleanValue();
            /*@NonInvalid*/ boolean IF_le;
            if( le ) {
                IF_le = true;
            }
            else {
                final /*@NonInvalid*/ Integer version = this.getVersion();
                final /*@NonInvalid*/ IntegerValue BOXED_version = version == null ? null
                        : ValueUtil.integerValueOf( version );
                final /*@NonInvalid*/ boolean status = BOXED_version != null;
                /*@NonInvalid*/ Object IF_status;
                if( status ) {
                    IF_status = ValueUtil.TRUE_VALUE;
                }
                else {
                    final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach( NsdTables.TUPLid_,
                            NsdTables.STR_The_32_version_32_attribute_32_is_32_required, status );
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
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId( String newId ) {
        String oldId = id;
        id = newId;
        boolean oldIdESet = idESet;
        idESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__ID, oldId, id,
                    !oldIdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetId() {
        String oldId = id;
        boolean oldIdESet = idESet;
        id = ID_EDEFAULT;
        idESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__ID, oldId,
                    ID_EDEFAULT, oldIdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetId() {
        return idESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRevision() {
        return revision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision( String newRevision ) {
        String oldRevision = revision;
        revision = newRevision;
        boolean oldRevisionESet = revisionESet;
        revisionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__REVISION, oldRevision,
                    revision, !oldRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        String oldRevision = revision;
        boolean oldRevisionESet = revisionESet;
        revision = REVISION_EDEFAULT;
        revisionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__REVISION,
                    oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return revisionESet;
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
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAppliesTo() ).basicAdd( otherEnd,
                    msgs );
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentApplicableServiceNS( ( ApplicableServiceNS ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            return ( ( InternalEList< ? > ) getAppliesTo() ).basicRemove( otherEnd, msgs );
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            return basicSetParentApplicableServiceNS( null, msgs );
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
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE,
                    ApplicableServiceNS.class, msgs );
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
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            return getAppliesTo();
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            return getParentApplicableServiceNS();
        case NsdPackage.SERVICE_NS_USAGE__ID:
            return getId();
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            return getVersion();
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            return getRevision();
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
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            getAppliesTo().clear();
            getAppliesTo().addAll( ( Collection< ? extends AppliesToType > ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            setParentApplicableServiceNS( ( ApplicableServiceNS ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            setRevision( ( String ) newValue );
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
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            unsetAppliesTo();
            return;
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            setParentApplicableServiceNS( ( ApplicableServiceNS ) null );
            return;
        case NsdPackage.SERVICE_NS_USAGE__ID:
            unsetId();
            return;
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            unsetVersion();
            return;
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            unsetRevision();
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
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            return isSetAppliesTo();
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            return getParentApplicableServiceNS() != null;
        case NsdPackage.SERVICE_NS_USAGE__ID:
            return isSetId();
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            return isSetVersion();
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            return isSetRevision();
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
        case NsdPackage.SERVICE_NS_USAGE___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return idAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.SERVICE_NS_USAGE___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return versionAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
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
        result.append( " (id: " );
        if( idESet ) {
            result.append( id );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", version: " );
        if( versionESet ) {
            result.append( version );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", revision: " );
        if( revisionESet ) {
            result.append( revision );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //ServiceNsUsageImpl
