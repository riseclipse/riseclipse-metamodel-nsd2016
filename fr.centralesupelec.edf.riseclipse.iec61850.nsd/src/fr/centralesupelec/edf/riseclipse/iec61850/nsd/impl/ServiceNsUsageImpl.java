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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNsUsageImpl#getApplicableServiceNS <em>Applicable Service NS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNsUsageImpl extends NSDObjectWithVersionAndReleaseImpl implements ServiceNsUsage {
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
    public EList< AppliesToType > getAppliesTo() {
        if( appliesTo == null ) {
            appliesTo = new EObjectContainmentWithInverseEList.Unsettable< AppliesToType >( AppliesToType.class, this,
                    NsdPackage.SERVICE_NS_USAGE__APPLIES_TO, NsdPackage.APPLIES_TO_TYPE__SERVICE_NS_USAGE );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS_USAGE__ID, oldId, id, !oldIdESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_NS_USAGE__ID, oldId, ID_EDEFAULT, oldIdESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS_USAGE__REVISION, oldRevision, revision, !oldRevisionESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_NS_USAGE__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
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
    public ApplicableServiceNS getApplicableServiceNS() {
        if( eContainerFeatureID() != NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS ) return null;
        return ( ApplicableServiceNS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApplicableServiceNS( ApplicableServiceNS newApplicableServiceNS,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newApplicableServiceNS,
                NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApplicableServiceNS( ApplicableServiceNS newApplicableServiceNS ) {
        if( newApplicableServiceNS != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS
                        && newApplicableServiceNS != null ) ) {
            if( EcoreUtil.isAncestor( this, newApplicableServiceNS ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            if( newApplicableServiceNS != null )
                msgs = ( ( InternalEObject ) newApplicableServiceNS ).eInverseAdd( this,
                        NsdPackage.APPLICABLE_SERVICE_NS__SERVICE_NS_USAGE, ApplicableServiceNS.class, msgs );
            msgs = basicSetApplicableServiceNS( newApplicableServiceNS, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS, newApplicableServiceNS, newApplicableServiceNS ) );
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
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
            if( eInternalContainer() != null ) msgs = eBasicRemoveFromContainer( msgs );
            return basicSetApplicableServiceNS( ( ApplicableServiceNS ) otherEnd, msgs );
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
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
            return basicSetApplicableServiceNS( null, msgs );
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
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
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
        case NsdPackage.SERVICE_NS_USAGE__ID:
            return getId();
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            return getRevision();
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
            return getApplicableServiceNS();
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
        case NsdPackage.SERVICE_NS_USAGE__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
            setApplicableServiceNS( ( ApplicableServiceNS ) newValue );
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
        case NsdPackage.SERVICE_NS_USAGE__ID:
            unsetId();
            return;
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            unsetRevision();
            return;
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
            setApplicableServiceNS( ( ApplicableServiceNS ) null );
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
        case NsdPackage.SERVICE_NS_USAGE__ID:
            return isSetId();
        case NsdPackage.SERVICE_NS_USAGE__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.SERVICE_NS_USAGE__REVISION:
            return isSetRevision();
        case NsdPackage.SERVICE_NS_USAGE__APPLICABLE_SERVICE_NS:
            return getApplicableServiceNS() != null;
        }
        return super.eIsSet( featureID );
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
        result.append( " (id: " );
        if( idESet )
            result.append( id );
        else
            result.append( "<unset>" );
        result.append( ", publicationStage: " );
        if( publicationStageESet )
            result.append( publicationStage );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceNsUsageImpl
