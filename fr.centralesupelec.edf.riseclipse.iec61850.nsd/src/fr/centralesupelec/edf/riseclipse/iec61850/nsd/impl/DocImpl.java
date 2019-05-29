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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviation;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgPresenceConditionDerivedStatistics;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DocumentedClass;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraint;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDoc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceCondition;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TitledClass;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getAny <em>Any</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getParentNSDoc <em>Parent NS Doc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByAgNSDesc <em>Referred By Ag NS Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByPresenceCondition <em>Referred By Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByAgPresenceCondition <em>Referred By Ag Presence Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByAbbreviation <em>Referred By Abbreviation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByBasicType <em>Referred By Basic Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByDocumentedClass <em>Referred By Documented Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByFunctionalConstraint <em>Referred By Functional Constraint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByAgPresenceConditionDerivedStatistics <em>Referred By Ag Presence Condition Derived Statistics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.DocImpl#getReferredByTitledClass <em>Referred By Titled Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocImpl extends NsdObjectImpl implements Doc {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

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
     * The cached value of the '{@link #getReferredByAgNSDesc() <em>Referred By Ag NS Desc</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAgNSDesc()
     * @generated
     * @ordered
     */
    protected EList< AgNSdesc > referredByAgNSDesc;

    /**
     * The cached value of the '{@link #getReferredByPresenceCondition() <em>Referred By Presence Condition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByPresenceCondition()
     * @generated
     * @ordered
     */
    protected EList< PresenceCondition > referredByPresenceCondition;

    /**
     * The cached value of the '{@link #getReferredByAgPresenceCondition() <em>Referred By Ag Presence Condition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAgPresenceCondition()
     * @generated
     * @ordered
     */
    protected EList< AgPresenceCondition > referredByAgPresenceCondition;

    /**
     * The cached value of the '{@link #getReferredByAbbreviation() <em>Referred By Abbreviation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAbbreviation()
     * @generated
     * @ordered
     */
    protected EList< Abbreviation > referredByAbbreviation;

    /**
     * The cached value of the '{@link #getReferredByBasicType() <em>Referred By Basic Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByBasicType()
     * @generated
     * @ordered
     */
    protected EList< BasicType > referredByBasicType;

    /**
     * The cached value of the '{@link #getReferredByDocumentedClass() <em>Referred By Documented Class</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDocumentedClass()
     * @generated
     * @ordered
     */
    protected EList< DocumentedClass > referredByDocumentedClass;

    /**
     * The cached value of the '{@link #getReferredByFunctionalConstraint() <em>Referred By Functional Constraint</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByFunctionalConstraint()
     * @generated
     * @ordered
     */
    protected EList< FunctionalConstraint > referredByFunctionalConstraint;

    /**
     * The cached value of the '{@link #getReferredByAgPresenceConditionDerivedStatistics() <em>Referred By Ag Presence Condition Derived Statistics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAgPresenceConditionDerivedStatistics()
     * @generated
     * @ordered
     */
    protected EList< AgPresenceConditionDerivedStatistics > referredByAgPresenceConditionDerivedStatistics;

    /**
     * The cached value of the '{@link #getReferredByTitledClass() <em>Referred By Titled Class</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByTitledClass()
     * @generated
     * @ordered
     */
    protected EList< TitledClass > referredByTitledClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.DOC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getMixed() {
        if( mixed == null ) {
            mixed = new BasicFeatureMap( this, NsdPackage.DOC__MIXED );
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getGroup() {
        return ( FeatureMap ) getMixed().< FeatureMap.Entry > list( NsdPackage.Literals.DOC__GROUP );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FeatureMap getAny() {
        return ( FeatureMap ) getGroup().< FeatureMap.Entry > list( NsdPackage.Literals.DOC__ANY );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOC__ID, oldId, id, !oldIdESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.DOC__ID, oldId, ID_EDEFAULT,
                    oldIdESet ) );
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
    public NSDoc getParentNSDoc() {
        if( eContainerFeatureID() != NsdPackage.DOC__PARENT_NS_DOC ) return null;
        return ( NSDoc ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNSDoc( NSDoc newParentNSDoc, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNSDoc, NsdPackage.DOC__PARENT_NS_DOC, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentNSDoc( NSDoc newParentNSDoc ) {
        if( newParentNSDoc != eInternalContainer()
                || ( eContainerFeatureID() != NsdPackage.DOC__PARENT_NS_DOC && newParentNSDoc != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNSDoc ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentNSDoc != null )
                msgs = ( ( InternalEObject ) newParentNSDoc ).eInverseAdd( this, NsdPackage.NS_DOC__DOC, NSDoc.class,
                        msgs );
            msgs = basicSetParentNSDoc( newParentNSDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.DOC__PARENT_NS_DOC, newParentNSDoc,
                    newParentNSDoc ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgNSdesc > getReferredByAgNSDesc() {
        if( referredByAgNSDesc == null ) {
            referredByAgNSDesc = new EObjectWithInverseEList.Unsettable< AgNSdesc >( AgNSdesc.class, this,
                    NsdPackage.DOC__REFERRED_BY_AG_NS_DESC, NsdPackage.AG_NSDESC__REFERS_TO_DOC );
        }
        return referredByAgNSDesc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAgNSDesc() {
        if( referredByAgNSDesc != null ) ( ( InternalEList.Unsettable< ? > ) referredByAgNSDesc ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAgNSDesc() {
        return referredByAgNSDesc != null && ( ( InternalEList.Unsettable< ? > ) referredByAgNSDesc ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PresenceCondition > getReferredByPresenceCondition() {
        if( referredByPresenceCondition == null ) {
            referredByPresenceCondition = new EObjectWithInverseEList.Unsettable< PresenceCondition >(
                    PresenceCondition.class, this, NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION,
                    NsdPackage.PRESENCE_CONDITION__REFERS_TO_DOC );
        }
        return referredByPresenceCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByPresenceCondition() {
        if( referredByPresenceCondition != null )
            ( ( InternalEList.Unsettable< ? > ) referredByPresenceCondition ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByPresenceCondition() {
        return referredByPresenceCondition != null
                && ( ( InternalEList.Unsettable< ? > ) referredByPresenceCondition ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgPresenceCondition > getReferredByAgPresenceCondition() {
        if( referredByAgPresenceCondition == null ) {
            referredByAgPresenceCondition = new EObjectWithInverseEList.Unsettable< AgPresenceCondition >(
                    AgPresenceCondition.class, this, NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION,
                    NsdPackage.AG_PRESENCE_CONDITION__REFERS_TO_PRES_COND_ARGS_DOC );
        }
        return referredByAgPresenceCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAgPresenceCondition() {
        if( referredByAgPresenceCondition != null )
            ( ( InternalEList.Unsettable< ? > ) referredByAgPresenceCondition ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAgPresenceCondition() {
        return referredByAgPresenceCondition != null
                && ( ( InternalEList.Unsettable< ? > ) referredByAgPresenceCondition ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Abbreviation > getReferredByAbbreviation() {
        if( referredByAbbreviation == null ) {
            referredByAbbreviation = new EObjectWithInverseEList.Unsettable< Abbreviation >( Abbreviation.class, this,
                    NsdPackage.DOC__REFERRED_BY_ABBREVIATION, NsdPackage.ABBREVIATION__REFERS_TO_DOC );
        }
        return referredByAbbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAbbreviation() {
        if( referredByAbbreviation != null ) ( ( InternalEList.Unsettable< ? > ) referredByAbbreviation ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAbbreviation() {
        return referredByAbbreviation != null && ( ( InternalEList.Unsettable< ? > ) referredByAbbreviation ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BasicType > getReferredByBasicType() {
        if( referredByBasicType == null ) {
            referredByBasicType = new EObjectWithInverseEList.Unsettable< BasicType >( BasicType.class, this,
                    NsdPackage.DOC__REFERRED_BY_BASIC_TYPE, NsdPackage.BASIC_TYPE__REFERS_TO_DOC );
        }
        return referredByBasicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByBasicType() {
        if( referredByBasicType != null ) ( ( InternalEList.Unsettable< ? > ) referredByBasicType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByBasicType() {
        return referredByBasicType != null && ( ( InternalEList.Unsettable< ? > ) referredByBasicType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DocumentedClass > getReferredByDocumentedClass() {
        if( referredByDocumentedClass == null ) {
            referredByDocumentedClass = new EObjectWithInverseEList.Unsettable< DocumentedClass >(
                    DocumentedClass.class, this, NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS,
                    NsdPackage.DOCUMENTED_CLASS__REFERS_TO_DESC_DOC );
        }
        return referredByDocumentedClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDocumentedClass() {
        if( referredByDocumentedClass != null ) ( ( InternalEList.Unsettable< ? > ) referredByDocumentedClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDocumentedClass() {
        return referredByDocumentedClass != null
                && ( ( InternalEList.Unsettable< ? > ) referredByDocumentedClass ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalConstraint > getReferredByFunctionalConstraint() {
        if( referredByFunctionalConstraint == null ) {
            referredByFunctionalConstraint = new EObjectWithInverseEList.Unsettable< FunctionalConstraint >(
                    FunctionalConstraint.class, this, NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT,
                    NsdPackage.FUNCTIONAL_CONSTRAINT__REFERS_TO_DOC );
        }
        return referredByFunctionalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByFunctionalConstraint() {
        if( referredByFunctionalConstraint != null )
            ( ( InternalEList.Unsettable< ? > ) referredByFunctionalConstraint ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByFunctionalConstraint() {
        return referredByFunctionalConstraint != null
                && ( ( InternalEList.Unsettable< ? > ) referredByFunctionalConstraint ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AgPresenceConditionDerivedStatistics > getReferredByAgPresenceConditionDerivedStatistics() {
        if( referredByAgPresenceConditionDerivedStatistics == null ) {
            referredByAgPresenceConditionDerivedStatistics = new EObjectWithInverseEList.Unsettable< AgPresenceConditionDerivedStatistics >(
                    AgPresenceConditionDerivedStatistics.class, this,
                    NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS,
                    NsdPackage.AG_PRESENCE_CONDITION_DERIVED_STATISTICS__REFERS_TO_DS_PRES_COND_ARGS_DOC );
        }
        return referredByAgPresenceConditionDerivedStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAgPresenceConditionDerivedStatistics() {
        if( referredByAgPresenceConditionDerivedStatistics != null )
            ( ( InternalEList.Unsettable< ? > ) referredByAgPresenceConditionDerivedStatistics ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAgPresenceConditionDerivedStatistics() {
        return referredByAgPresenceConditionDerivedStatistics != null
                && ( ( InternalEList.Unsettable< ? > ) referredByAgPresenceConditionDerivedStatistics ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TitledClass > getReferredByTitledClass() {
        if( referredByTitledClass == null ) {
            referredByTitledClass = new EObjectWithInverseEList.Unsettable< TitledClass >( TitledClass.class, this,
                    NsdPackage.DOC__REFERRED_BY_TITLED_CLASS, NsdPackage.TITLED_CLASS__REFERS_TO_TITLE_DOC );
        }
        return referredByTitledClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByTitledClass() {
        if( referredByTitledClass != null ) ( ( InternalEList.Unsettable< ? > ) referredByTitledClass ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByTitledClass() {
        return referredByTitledClass != null && ( ( InternalEList.Unsettable< ? > ) referredByTitledClass ).isSet();
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
        case NsdPackage.DOC__PARENT_NS_DOC:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentNSDoc( ( NSDoc ) otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_AG_NS_DESC:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAgNSDesc() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByPresenceCondition() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAgPresenceCondition() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_ABBREVIATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAbbreviation() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_BASIC_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByBasicType() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDocumentedClass() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByFunctionalConstraint() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByAgPresenceConditionDerivedStatistics() )
                    .basicAdd( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_TITLED_CLASS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByTitledClass() )
                    .basicAdd( otherEnd, msgs );
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
        case NsdPackage.DOC__MIXED:
            return ( ( InternalEList< ? > ) getMixed() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__GROUP:
            return ( ( InternalEList< ? > ) getGroup() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__ANY:
            return ( ( InternalEList< ? > ) getAny() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__PARENT_NS_DOC:
            return basicSetParentNSDoc( null, msgs );
        case NsdPackage.DOC__REFERRED_BY_AG_NS_DESC:
            return ( ( InternalEList< ? > ) getReferredByAgNSDesc() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION:
            return ( ( InternalEList< ? > ) getReferredByPresenceCondition() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION:
            return ( ( InternalEList< ? > ) getReferredByAgPresenceCondition() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_ABBREVIATION:
            return ( ( InternalEList< ? > ) getReferredByAbbreviation() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_BASIC_TYPE:
            return ( ( InternalEList< ? > ) getReferredByBasicType() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS:
            return ( ( InternalEList< ? > ) getReferredByDocumentedClass() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT:
            return ( ( InternalEList< ? > ) getReferredByFunctionalConstraint() ).basicRemove( otherEnd, msgs );
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return ( ( InternalEList< ? > ) getReferredByAgPresenceConditionDerivedStatistics() ).basicRemove( otherEnd,
                    msgs );
        case NsdPackage.DOC__REFERRED_BY_TITLED_CLASS:
            return ( ( InternalEList< ? > ) getReferredByTitledClass() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.DOC__PARENT_NS_DOC:
            return eInternalContainer().eInverseRemove( this, NsdPackage.NS_DOC__DOC, NSDoc.class, msgs );
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
        case NsdPackage.DOC__MIXED:
            if( coreType ) return getMixed();
            return ( ( FeatureMap.Internal ) getMixed() ).getWrapper();
        case NsdPackage.DOC__GROUP:
            if( coreType ) return getGroup();
            return ( ( FeatureMap.Internal ) getGroup() ).getWrapper();
        case NsdPackage.DOC__ANY:
            if( coreType ) return getAny();
            return ( ( FeatureMap.Internal ) getAny() ).getWrapper();
        case NsdPackage.DOC__ID:
            return getId();
        case NsdPackage.DOC__PARENT_NS_DOC:
            return getParentNSDoc();
        case NsdPackage.DOC__REFERRED_BY_AG_NS_DESC:
            return getReferredByAgNSDesc();
        case NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION:
            return getReferredByPresenceCondition();
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION:
            return getReferredByAgPresenceCondition();
        case NsdPackage.DOC__REFERRED_BY_ABBREVIATION:
            return getReferredByAbbreviation();
        case NsdPackage.DOC__REFERRED_BY_BASIC_TYPE:
            return getReferredByBasicType();
        case NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS:
            return getReferredByDocumentedClass();
        case NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT:
            return getReferredByFunctionalConstraint();
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return getReferredByAgPresenceConditionDerivedStatistics();
        case NsdPackage.DOC__REFERRED_BY_TITLED_CLASS:
            return getReferredByTitledClass();
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
        case NsdPackage.DOC__MIXED:
            ( ( FeatureMap.Internal ) getMixed() ).set( newValue );
            return;
        case NsdPackage.DOC__GROUP:
            ( ( FeatureMap.Internal ) getGroup() ).set( newValue );
            return;
        case NsdPackage.DOC__ANY:
            ( ( FeatureMap.Internal ) getAny() ).set( newValue );
            return;
        case NsdPackage.DOC__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.DOC__PARENT_NS_DOC:
            setParentNSDoc( ( NSDoc ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_AG_NS_DESC:
            getReferredByAgNSDesc().clear();
            getReferredByAgNSDesc().addAll( ( Collection< ? extends AgNSdesc > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION:
            getReferredByPresenceCondition().clear();
            getReferredByPresenceCondition().addAll( ( Collection< ? extends PresenceCondition > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION:
            getReferredByAgPresenceCondition().clear();
            getReferredByAgPresenceCondition().addAll( ( Collection< ? extends AgPresenceCondition > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_ABBREVIATION:
            getReferredByAbbreviation().clear();
            getReferredByAbbreviation().addAll( ( Collection< ? extends Abbreviation > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_BASIC_TYPE:
            getReferredByBasicType().clear();
            getReferredByBasicType().addAll( ( Collection< ? extends BasicType > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS:
            getReferredByDocumentedClass().clear();
            getReferredByDocumentedClass().addAll( ( Collection< ? extends DocumentedClass > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT:
            getReferredByFunctionalConstraint().clear();
            getReferredByFunctionalConstraint().addAll( ( Collection< ? extends FunctionalConstraint > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            getReferredByAgPresenceConditionDerivedStatistics().clear();
            getReferredByAgPresenceConditionDerivedStatistics()
                    .addAll( ( Collection< ? extends AgPresenceConditionDerivedStatistics > ) newValue );
            return;
        case NsdPackage.DOC__REFERRED_BY_TITLED_CLASS:
            getReferredByTitledClass().clear();
            getReferredByTitledClass().addAll( ( Collection< ? extends TitledClass > ) newValue );
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
        case NsdPackage.DOC__MIXED:
            getMixed().clear();
            return;
        case NsdPackage.DOC__GROUP:
            getGroup().clear();
            return;
        case NsdPackage.DOC__ANY:
            getAny().clear();
            return;
        case NsdPackage.DOC__ID:
            unsetId();
            return;
        case NsdPackage.DOC__PARENT_NS_DOC:
            setParentNSDoc( ( NSDoc ) null );
            return;
        case NsdPackage.DOC__REFERRED_BY_AG_NS_DESC:
            unsetReferredByAgNSDesc();
            return;
        case NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION:
            unsetReferredByPresenceCondition();
            return;
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION:
            unsetReferredByAgPresenceCondition();
            return;
        case NsdPackage.DOC__REFERRED_BY_ABBREVIATION:
            unsetReferredByAbbreviation();
            return;
        case NsdPackage.DOC__REFERRED_BY_BASIC_TYPE:
            unsetReferredByBasicType();
            return;
        case NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS:
            unsetReferredByDocumentedClass();
            return;
        case NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT:
            unsetReferredByFunctionalConstraint();
            return;
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            unsetReferredByAgPresenceConditionDerivedStatistics();
            return;
        case NsdPackage.DOC__REFERRED_BY_TITLED_CLASS:
            unsetReferredByTitledClass();
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
        case NsdPackage.DOC__MIXED:
            return mixed != null && !mixed.isEmpty();
        case NsdPackage.DOC__GROUP:
            return !getGroup().isEmpty();
        case NsdPackage.DOC__ANY:
            return !getAny().isEmpty();
        case NsdPackage.DOC__ID:
            return isSetId();
        case NsdPackage.DOC__PARENT_NS_DOC:
            return getParentNSDoc() != null;
        case NsdPackage.DOC__REFERRED_BY_AG_NS_DESC:
            return isSetReferredByAgNSDesc();
        case NsdPackage.DOC__REFERRED_BY_PRESENCE_CONDITION:
            return isSetReferredByPresenceCondition();
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION:
            return isSetReferredByAgPresenceCondition();
        case NsdPackage.DOC__REFERRED_BY_ABBREVIATION:
            return isSetReferredByAbbreviation();
        case NsdPackage.DOC__REFERRED_BY_BASIC_TYPE:
            return isSetReferredByBasicType();
        case NsdPackage.DOC__REFERRED_BY_DOCUMENTED_CLASS:
            return isSetReferredByDocumentedClass();
        case NsdPackage.DOC__REFERRED_BY_FUNCTIONAL_CONSTRAINT:
            return isSetReferredByFunctionalConstraint();
        case NsdPackage.DOC__REFERRED_BY_AG_PRESENCE_CONDITION_DERIVED_STATISTICS:
            return isSetReferredByAgPresenceConditionDerivedStatistics();
        case NsdPackage.DOC__REFERRED_BY_TITLED_CLASS:
            return isSetReferredByTitledClass();
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
        result.append( " (mixed: " );
        result.append( mixed );
        result.append( ", id: " );
        if( idESet )
            result.append( id );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DocImpl
