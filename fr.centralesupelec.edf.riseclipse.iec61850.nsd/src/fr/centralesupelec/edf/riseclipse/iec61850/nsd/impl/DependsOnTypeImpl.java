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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends On Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DependsOnTypeImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependsOnTypeImpl extends NSDObjectWithVersionAndReleaseImpl implements DependsOnType {
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
    protected DependsOnTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DEPENDS_ON_TYPE;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON_TYPE__ID, oldId, id ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DEPENDS_ON_TYPE__PUBLICATION_STAGE,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DEPENDS_ON_TYPE__PUBLICATION_STAGE,
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
                NsdPackage.DEPENDS_ON_TYPE__REVISION, oldRevision, revision, !oldRevisionESet ) );
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
                NsdPackage.DEPENDS_ON_TYPE__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.DEPENDS_ON_TYPE__ID:
            return getId();
        case NsdPackage.DEPENDS_ON_TYPE__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.DEPENDS_ON_TYPE__REVISION:
            return getRevision();
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
        case NsdPackage.DEPENDS_ON_TYPE__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.DEPENDS_ON_TYPE__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.DEPENDS_ON_TYPE__REVISION:
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
        case NsdPackage.DEPENDS_ON_TYPE__ID:
            setId( ID_EDEFAULT );
            return;
        case NsdPackage.DEPENDS_ON_TYPE__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.DEPENDS_ON_TYPE__REVISION:
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
        case NsdPackage.DEPENDS_ON_TYPE__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals( id );
        case NsdPackage.DEPENDS_ON_TYPE__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.DEPENDS_ON_TYPE__REVISION:
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
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (id: " );
        result.append( id );
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

} //DependsOnTypeImpl
