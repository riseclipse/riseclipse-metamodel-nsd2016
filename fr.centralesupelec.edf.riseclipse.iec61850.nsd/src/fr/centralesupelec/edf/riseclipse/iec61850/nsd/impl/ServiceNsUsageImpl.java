/**
 *  Copyright (c) 2019 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ApplicableServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AppliesToType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNsUsage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Ns Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getParentApplicableServiceNS <em>Parent Applicable Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNsUsageImpl extends NsdObjectImpl implements ServiceNsUsage {
    /**
     * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected static final Integer RELEASE_EDEFAULT = new Integer( 1 );

    /**
     * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected Integer release = RELEASE_EDEFAULT;

    /**
     * This is true if the Release attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releaseESet;

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
     * The default value of the '{@link #getPublicationStage() <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicationStage()
     * @generated
     * @ordered
     */
    protected static final PubStage PUBLICATION_STAGE_EDEFAULT = PubStage.IS;

    /**
     * The cached value of the '{@link #getPublicationStage() <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicationStage()
     * @generated
     * @ordered
     */
    protected PubStage publicationStage = PUBLICATION_STAGE_EDEFAULT;

    /**
     * This is true if the Publication Stage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean publicationStageESet;

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
    public Integer getRelease() {
        return release;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelease( Integer newRelease ) {
        Integer oldRelease = release;
        release = newRelease;
        boolean oldReleaseESet = releaseESet;
        releaseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__RELEASE, oldRelease,
                    release, !oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelease() {
        Integer oldRelease = release;
        boolean oldReleaseESet = releaseESet;
        release = RELEASE_EDEFAULT;
        releaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__RELEASE, oldRelease,
                    RELEASE_EDEFAULT, oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelease() {
        return releaseESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__VERSION, oldVersion,
                    version, !oldVersionESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__VERSION, oldVersion,
                    VERSION_EDEFAULT, oldVersionESet ) );
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
            appliesTo = new EObjectContainmentWithInverseEList.Unsettable< AppliesToType >( AppliesToType.class, this,
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
        if( appliesTo != null ) ( ( InternalEList.Unsettable< ? > ) appliesTo ).unset();
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
        if( eContainerFeatureID() != NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS ) return null;
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
            if( EcoreUtil.isAncestor( this, newParentApplicableServiceNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentApplicableServiceNS != null )
                msgs = ( ( InternalEObject ) newParentApplicableServiceNS ).eInverseAdd( this,
                        NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE, ApplicableServiceNS.class, msgs );
            msgs = basicSetParentApplicableServiceNS( newParentApplicableServiceNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS, newParentApplicableServiceNS,
                    newParentApplicableServiceNS ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__ID, oldId, id,
                    !oldIdESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__ID, oldId,
                    ID_EDEFAULT, oldIdESet ) );
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
    public PubStage getPublicationStage() {
        return publicationStage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPublicationStage( PubStage newPublicationStage ) {
        PubStage oldPublicationStage = publicationStage;
        publicationStage = newPublicationStage == null ? PUBLICATION_STAGE_EDEFAULT : newPublicationStage;
        boolean oldPublicationStageESet = publicationStageESet;
        publicationStageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE,
                    oldPublicationStage, publicationStage, !oldPublicationStageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPublicationStage() {
        PubStage oldPublicationStage = publicationStage;
        boolean oldPublicationStageESet = publicationStageESet;
        publicationStage = PUBLICATION_STAGE_EDEFAULT;
        publicationStageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE,
                    oldPublicationStage, PUBLICATION_STAGE_EDEFAULT, oldPublicationStageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPublicationStage() {
        return publicationStageESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS_USAGE__REVISION, oldRevision,
                    revision, !oldRevisionESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS_USAGE__REVISION,
                    oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
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
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
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
        case NsdPackage.SERVICE_NS_USAGE__RELEASE:
            return getRelease();
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            return getVersion();
        case NsdPackage.SERVICE_NS_USAGE__ID:
            return getId();
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            return getRevision();
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            return getAppliesTo();
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            return getParentApplicableServiceNS();
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
        case NsdPackage.SERVICE_NS_USAGE__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            getAppliesTo().clear();
            getAppliesTo().addAll( ( Collection< ? extends AppliesToType > ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            setParentApplicableServiceNS( ( ApplicableServiceNS ) newValue );
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
        case NsdPackage.SERVICE_NS_USAGE__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            unsetVersion();
            return;
        case NsdPackage.SERVICE_NS_USAGE__ID:
            unsetId();
            return;
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            unsetRevision();
            return;
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            unsetAppliesTo();
            return;
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            setParentApplicableServiceNS( ( ApplicableServiceNS ) null );
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
        case NsdPackage.SERVICE_NS_USAGE__RELEASE:
            return isSetRelease();
        case NsdPackage.SERVICE_NS_USAGE__VERSION:
            return isSetVersion();
        case NsdPackage.SERVICE_NS_USAGE__ID:
            return isSetId();
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            return isSetRevision();
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.SERVICE_NS_USAGE__APPLIES_TO:
            return isSetAppliesTo();
        case NsdPackage.SERVICE_NS_USAGE__PARENT_APPLICABLE_SERVICE_NS:
            return getParentApplicableServiceNS() != null;
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
        if( baseClass == AgNSIdentification.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.SERVICE_NS_USAGE__RELEASE:
                return NsdPackage.AG_NS_IDENTIFICATION__RELEASE;
            case NsdPackage.SERVICE_NS_USAGE__VERSION:
                return NsdPackage.AG_NS_IDENTIFICATION__VERSION;
            case NsdPackage.SERVICE_NS_USAGE__ID:
                return NsdPackage.AG_NS_IDENTIFICATION__ID;
            case NsdPackage.SERVICE_NS_USAGE__REVISION:
                return NsdPackage.AG_NS_IDENTIFICATION__REVISION;
            case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
                return NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE;
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
        if( baseClass == AgNSIdentification.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_NS_IDENTIFICATION__RELEASE:
                return NsdPackage.SERVICE_NS_USAGE__RELEASE;
            case NsdPackage.AG_NS_IDENTIFICATION__VERSION:
                return NsdPackage.SERVICE_NS_USAGE__VERSION;
            case NsdPackage.AG_NS_IDENTIFICATION__ID:
                return NsdPackage.SERVICE_NS_USAGE__ID;
            case NsdPackage.AG_NS_IDENTIFICATION__REVISION:
                return NsdPackage.SERVICE_NS_USAGE__REVISION;
            case NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE:
                return NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE;
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
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (release: " );
        if( releaseESet )
            result.append( release );
        else
            result.append( "<unset>" );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ", id: " );
        if( idESet )
            result.append( id );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", publicationStage: " );
        if( publicationStageESet )
            result.append( publicationStage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceNsUsageImpl
