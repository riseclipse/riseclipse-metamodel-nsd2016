/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgDependsOn;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDependencyType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdTables;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl#getDependencyType <em>Dependency Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl#getParentNS <em>Parent NS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnImpl#getRefersToNS <em>Refers To NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependsOnImpl extends NsdObjectImpl implements DependsOn {
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
     * The default value of the '{@link #getDependencyType() <em>Dependency Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependencyType()
     * @generated
     * @ordered
     */
    protected static final NSDependencyType DEPENDENCY_TYPE_EDEFAULT = NSDependencyType.DEPENDS_ON;
    /**
     * The cached value of the '{@link #getDependencyType() <em>Dependency Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependencyType()
     * @generated
     * @ordered
     */
    protected NSDependencyType dependencyType = DEPENDENCY_TYPE_EDEFAULT;
    /**
     * This is true if the Dependency Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dependencyTypeESet;
    /**
     * The cached value of the '{@link #getRefersToNS() <em>Refers To NS</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToNS()
     * @generated
     * @ordered
     */
    protected NS refersToNS;
    /**
     * This is true if the Refers To NS reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToNSESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DependsOnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DEPENDS_ON;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON__VERSION, oldVersion, version,
                    !oldVersionESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DEPENDS_ON__VERSION, oldVersion,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON__ID, oldId, id,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DEPENDS_ON__ID, oldId, ID_EDEFAULT,
                    oldIdESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON__REVISION, oldRevision,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DEPENDS_ON__REVISION, oldRevision,
                    REVISION_EDEFAULT, oldRevisionESet ) );
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
    @Override
    public NSDependencyType getDependencyType() {
        return dependencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDependencyType( NSDependencyType newDependencyType ) {
        NSDependencyType oldDependencyType = dependencyType;
        dependencyType = newDependencyType == null ? DEPENDENCY_TYPE_EDEFAULT : newDependencyType;
        boolean oldDependencyTypeESet = dependencyTypeESet;
        dependencyTypeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE,
                    oldDependencyType, dependencyType, !oldDependencyTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDependencyType() {
        NSDependencyType oldDependencyType = dependencyType;
        boolean oldDependencyTypeESet = dependencyTypeESet;
        dependencyType = DEPENDENCY_TYPE_EDEFAULT;
        dependencyTypeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE,
                    oldDependencyType, DEPENDENCY_TYPE_EDEFAULT, oldDependencyTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDependencyType() {
        return dependencyTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getParentNS() {
        if( eContainerFeatureID() != NsdPackage.DEPENDS_ON__PARENT_NS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNS, NsdPackage.DEPENDS_ON__PARENT_NS, msgs );
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
                || ( eContainerFeatureID() != NsdPackage.DEPENDS_ON__PARENT_NS && newParentNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentNS != null ) {
                msgs = ( ( InternalEObject ) newParentNS ).eInverseAdd( this, NsdPackage.NS__DEPENDS_ON, NS.class,
                        msgs );
            }
            msgs = basicSetParentNS( newParentNS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON__PARENT_NS, newParentNS,
                    newParentNS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NS getRefersToNS() {
        return refersToNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToNS( NS newRefersToNS, NotificationChain msgs ) {
        NS oldRefersToNS = refersToNS;
        refersToNS = newRefersToNS;
        boolean oldRefersToNSESet = refersToNSESet;
        refersToNSESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.DEPENDS_ON__REFERS_TO_NS, oldRefersToNS, newRefersToNS, !oldRefersToNSESet );
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
    public void setRefersToNS( NS newRefersToNS ) {
        if( newRefersToNS != refersToNS ) {
            NotificationChain msgs = null;
            if( refersToNS != null ) {
                msgs = ( ( InternalEObject ) refersToNS ).eInverseRemove( this, NsdPackage.NS__REFERRED_BY_DEPENDS_ON,
                        NS.class, msgs );
            }
            if( newRefersToNS != null ) {
                msgs = ( ( InternalEObject ) newRefersToNS ).eInverseAdd( this, NsdPackage.NS__REFERRED_BY_DEPENDS_ON,
                        NS.class, msgs );
            }
            msgs = basicSetRefersToNS( newRefersToNS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToNSESet = refersToNSESet;
            refersToNSESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON__REFERS_TO_NS,
                        newRefersToNS, newRefersToNS, !oldRefersToNSESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToNS( NotificationChain msgs ) {
        NS oldRefersToNS = refersToNS;
        refersToNS = null;
        boolean oldRefersToNSESet = refersToNSESet;
        refersToNSESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.DEPENDS_ON__REFERS_TO_NS, oldRefersToNS, null, oldRefersToNSESet );
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
    public void unsetRefersToNS() {
        if( refersToNS != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToNS ).eInverseRemove( this, NsdPackage.NS__REFERRED_BY_DEPENDS_ON,
                    NS.class, msgs );
            msgs = basicUnsetRefersToNS( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToNSESet = refersToNSESet;
            refersToNSESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DEPENDS_ON__REFERS_TO_NS, null,
                        null, oldRefersToNSESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToNS() {
        return refersToNSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean idAttributeRequired( final DiagnosticChain diagnostics, final Map< Object, Object > context ) {
        final String constraintName = "AgDependsOn::idAttributeRequired";
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
                    NsdPackage.Literals.AG_DEPENDS_ON___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
        final String constraintName = "AgDependsOn::versionAttributeRequired";
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
                    NsdPackage.Literals.AG_DEPENDS_ON___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentNS( ( NS ) otherEnd, msgs );
        case NsdPackage.DEPENDS_ON__REFERS_TO_NS:
            if( refersToNS != null ) {
                msgs = ( ( InternalEObject ) refersToNS ).eInverseRemove( this, NsdPackage.NS__REFERRED_BY_DEPENDS_ON,
                        NS.class, msgs );
            }
            return basicSetRefersToNS( ( NS ) otherEnd, msgs );
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
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            return basicSetParentNS( null, msgs );
        case NsdPackage.DEPENDS_ON__REFERS_TO_NS:
            return basicUnsetRefersToNS( msgs );
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
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS__DEPENDS_ON, NS.class, msgs );
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
        case NsdPackage.DEPENDS_ON__ID:
            return getId();
        case NsdPackage.DEPENDS_ON__VERSION:
            return getVersion();
        case NsdPackage.DEPENDS_ON__REVISION:
            return getRevision();
        case NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE:
            return getDependencyType();
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            return getParentNS();
        case NsdPackage.DEPENDS_ON__REFERS_TO_NS:
            return getRefersToNS();
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
        case NsdPackage.DEPENDS_ON__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.DEPENDS_ON__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.DEPENDS_ON__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE:
            setDependencyType( ( NSDependencyType ) newValue );
            return;
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            setParentNS( ( NS ) newValue );
            return;
        case NsdPackage.DEPENDS_ON__REFERS_TO_NS:
            setRefersToNS( ( NS ) newValue );
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
        case NsdPackage.DEPENDS_ON__ID:
            unsetId();
            return;
        case NsdPackage.DEPENDS_ON__VERSION:
            unsetVersion();
            return;
        case NsdPackage.DEPENDS_ON__REVISION:
            unsetRevision();
            return;
        case NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE:
            unsetDependencyType();
            return;
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            setParentNS( ( NS ) null );
            return;
        case NsdPackage.DEPENDS_ON__REFERS_TO_NS:
            unsetRefersToNS();
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
        case NsdPackage.DEPENDS_ON__ID:
            return isSetId();
        case NsdPackage.DEPENDS_ON__VERSION:
            return isSetVersion();
        case NsdPackage.DEPENDS_ON__REVISION:
            return isSetRevision();
        case NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE:
            return isSetDependencyType();
        case NsdPackage.DEPENDS_ON__PARENT_NS:
            return getParentNS() != null;
        case NsdPackage.DEPENDS_ON__REFERS_TO_NS:
            return isSetRefersToNS();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgDependsOn.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.DEPENDS_ON__ID:
                return NsdPackage.AG_DEPENDS_ON__ID;
            case NsdPackage.DEPENDS_ON__VERSION:
                return NsdPackage.AG_DEPENDS_ON__VERSION;
            case NsdPackage.DEPENDS_ON__REVISION:
                return NsdPackage.AG_DEPENDS_ON__REVISION;
            case NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE:
                return NsdPackage.AG_DEPENDS_ON__DEPENDENCY_TYPE;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgDependsOn.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_DEPENDS_ON__ID:
                return NsdPackage.DEPENDS_ON__ID;
            case NsdPackage.AG_DEPENDS_ON__VERSION:
                return NsdPackage.DEPENDS_ON__VERSION;
            case NsdPackage.AG_DEPENDS_ON__REVISION:
                return NsdPackage.DEPENDS_ON__REVISION;
            case NsdPackage.AG_DEPENDS_ON__DEPENDENCY_TYPE:
                return NsdPackage.DEPENDS_ON__DEPENDENCY_TYPE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID( int baseOperationID, Class< ? > baseClass ) {
        if( baseClass == AgDependsOn.class ) {
            switch( baseOperationID ) {
            case NsdPackage.AG_DEPENDS_ON___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
                return NsdPackage.DEPENDS_ON___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP;
            case NsdPackage.AG_DEPENDS_ON___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
                return NsdPackage.DEPENDS_ON___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP;
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID( baseOperationID, baseClass );
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
        case NsdPackage.DEPENDS_ON___ID_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
            return idAttributeRequired( ( DiagnosticChain ) arguments.get( 0 ),
                    ( Map< Object, Object > ) arguments.get( 1 ) );
        case NsdPackage.DEPENDS_ON___VERSION_ATTRIBUTE_REQUIRED__DIAGNOSTICCHAIN_MAP:
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
        result.append( ", dependencyType: " );
        if( dependencyTypeESet ) {
            result.append( dependencyType );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    /* Implicit link
     *   DependsOn.id                       -> NS.id
     */
    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "DependsOnImpl.buildExplicitLinks()" );

        if( super.buildExplicitLinks( console ) ) {
            return true;
        }

        String messagePrefix = "while resolving link from DependsOn: ";

        NsIdentification identification = NsIdentification.of( getId(), getVersion(), getRevision() );
        NsdResourceSetImpl rs = getResourceSet();
        NS ns = rs.getNS( identification );
        if( ns == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "NS \"", identification, "\" not found" );
        }
        else {
            setRefersToNS( ns );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "NS \"", identification, "\" found" );
            if( !ns.isExplicitLinksBuilt() ) {
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "Resolving links for file ", ns.getFilename() );
                ns.buildExplicitLinks( console );
            }
        }
        return false;
    }

} //DependsOnImpl
