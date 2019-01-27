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

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ServiceTypeRealizations;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service NS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getServiceTypeRealizations <em>Service Type Realizations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getServiceConstructedAttributes <em>Service Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getServiceCDCs <em>Service CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.ServiceNSImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNSImpl extends CopyrightedImpl implements ServiceNS {
    /**
     * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChanges()
     * @generated
     * @ordered
     */
    protected Changes changes;

    /**
     * The cached value of the '{@link #getFunctionalConstraints() <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalConstraints()
     * @generated
     * @ordered
     */
    protected FunctionalConstraints functionalConstraints;

    /**
     * The cached value of the '{@link #getPresenceConditions() <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresenceConditions()
     * @generated
     * @ordered
     */
    protected PresenceConditions presenceConditions;

    /**
     * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviations()
     * @generated
     * @ordered
     */
    protected Abbreviations abbreviations;

    /**
     * The cached value of the '{@link #getServiceTypeRealizations() <em>Service Type Realizations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceTypeRealizations()
     * @generated
     * @ordered
     */
    protected ServiceTypeRealizations serviceTypeRealizations;

    /**
     * The cached value of the '{@link #getServiceConstructedAttributes() <em>Service Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceConstructedAttributes()
     * @generated
     * @ordered
     */
    protected ServiceConstructedAttributes serviceConstructedAttributes;

    /**
     * The cached value of the '{@link #getServiceCDCs() <em>Service CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceCDCs()
     * @generated
     * @ordered
     */
    protected ServiceCDCs serviceCDCs;

    /**
     * The default value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected static final String DESC_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescID() <em>Desc ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescID()
     * @generated
     * @ordered
     */
    protected String descID = DESC_ID_EDEFAULT;

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
     * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected static final short RELEASE_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelease()
     * @generated
     * @ordered
     */
    protected short release = RELEASE_EDEFAULT;

    /**
     * This is true if the Release attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releaseESet;

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
     * The default value of the '{@link #getUmlDate() <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlDate()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar UML_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUmlDate() <em>Uml Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlDate()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar umlDate = UML_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getUmlVersion() <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlVersion()
     * @generated
     * @ordered
     */
    protected static final String UML_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUmlVersion() <em>Uml Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlVersion()
     * @generated
     * @ordered
     */
    protected String umlVersion = UML_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final int VERSION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected int version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceNSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.SERVICE_NS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Changes getChanges() {
        return changes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChanges( Changes newChanges, NotificationChain msgs ) {
        Changes oldChanges = changes;
        changes = newChanges;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__CHANGES, oldChanges, newChanges );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChanges( Changes newChanges ) {
        if( newChanges != changes ) {
            NotificationChain msgs = null;
            if( changes != null ) msgs = ( ( InternalEObject ) changes ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__CHANGES, null, msgs );
            if( newChanges != null ) msgs = ( ( InternalEObject ) newChanges ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__CHANGES, null, msgs );
            msgs = basicSetChanges( newChanges, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__CHANGES, newChanges, newChanges ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalConstraints getFunctionalConstraints() {
        return functionalConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunctionalConstraints( FunctionalConstraints newFunctionalConstraints,
            NotificationChain msgs ) {
        FunctionalConstraints oldFunctionalConstraints = functionalConstraints;
        functionalConstraints = newFunctionalConstraints;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, newFunctionalConstraints );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionalConstraints( FunctionalConstraints newFunctionalConstraints ) {
        if( newFunctionalConstraints != functionalConstraints ) {
            NotificationChain msgs = null;
            if( functionalConstraints != null )
                msgs = ( ( InternalEObject ) functionalConstraints ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            if( newFunctionalConstraints != null )
                msgs = ( ( InternalEObject ) newFunctionalConstraints ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            msgs = basicSetFunctionalConstraints( newFunctionalConstraints, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS, newFunctionalConstraints, newFunctionalConstraints ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PresenceConditions getPresenceConditions() {
        return presenceConditions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPresenceConditions( PresenceConditions newPresenceConditions,
            NotificationChain msgs ) {
        PresenceConditions oldPresenceConditions = presenceConditions;
        presenceConditions = newPresenceConditions;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, oldPresenceConditions, newPresenceConditions );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPresenceConditions( PresenceConditions newPresenceConditions ) {
        if( newPresenceConditions != presenceConditions ) {
            NotificationChain msgs = null;
            if( presenceConditions != null ) msgs = ( ( InternalEObject ) presenceConditions ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, null, msgs );
            if( newPresenceConditions != null ) msgs = ( ( InternalEObject ) newPresenceConditions ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, null, msgs );
            msgs = basicSetPresenceConditions( newPresenceConditions, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS, newPresenceConditions, newPresenceConditions ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Abbreviations getAbbreviations() {
        return abbreviations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAbbreviations( Abbreviations newAbbreviations, NotificationChain msgs ) {
        Abbreviations oldAbbreviations = abbreviations;
        abbreviations = newAbbreviations;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__ABBREVIATIONS, oldAbbreviations, newAbbreviations );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAbbreviations( Abbreviations newAbbreviations ) {
        if( newAbbreviations != abbreviations ) {
            NotificationChain msgs = null;
            if( abbreviations != null ) msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__ABBREVIATIONS, null, msgs );
            if( newAbbreviations != null ) msgs = ( ( InternalEObject ) newAbbreviations ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__ABBREVIATIONS, null, msgs );
            msgs = basicSetAbbreviations( newAbbreviations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__ABBREVIATIONS, newAbbreviations, newAbbreviations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceTypeRealizations getServiceTypeRealizations() {
        return serviceTypeRealizations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceTypeRealizations( ServiceTypeRealizations newServiceTypeRealizations,
            NotificationChain msgs ) {
        ServiceTypeRealizations oldServiceTypeRealizations = serviceTypeRealizations;
        serviceTypeRealizations = newServiceTypeRealizations;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, oldServiceTypeRealizations,
                    newServiceTypeRealizations );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceTypeRealizations( ServiceTypeRealizations newServiceTypeRealizations ) {
        if( newServiceTypeRealizations != serviceTypeRealizations ) {
            NotificationChain msgs = null;
            if( serviceTypeRealizations != null )
                msgs = ( ( InternalEObject ) serviceTypeRealizations ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, null, msgs );
            if( newServiceTypeRealizations != null )
                msgs = ( ( InternalEObject ) newServiceTypeRealizations ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS, null, msgs );
            msgs = basicSetServiceTypeRealizations( newServiceTypeRealizations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS,
                    newServiceTypeRealizations, newServiceTypeRealizations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceConstructedAttributes getServiceConstructedAttributes() {
        return serviceConstructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceConstructedAttributes(
            ServiceConstructedAttributes newServiceConstructedAttributes, NotificationChain msgs ) {
        ServiceConstructedAttributes oldServiceConstructedAttributes = serviceConstructedAttributes;
        serviceConstructedAttributes = newServiceConstructedAttributes;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, oldServiceConstructedAttributes,
                    newServiceConstructedAttributes );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceConstructedAttributes( ServiceConstructedAttributes newServiceConstructedAttributes ) {
        if( newServiceConstructedAttributes != serviceConstructedAttributes ) {
            NotificationChain msgs = null;
            if( serviceConstructedAttributes != null )
                msgs = ( ( InternalEObject ) serviceConstructedAttributes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, null, msgs );
            if( newServiceConstructedAttributes != null )
                msgs = ( ( InternalEObject ) newServiceConstructedAttributes ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES, null, msgs );
            msgs = basicSetServiceConstructedAttributes( newServiceConstructedAttributes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES,
                        newServiceConstructedAttributes, newServiceConstructedAttributes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCDCs getServiceCDCs() {
        return serviceCDCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceCDCs( ServiceCDCs newServiceCDCs, NotificationChain msgs ) {
        ServiceCDCs oldServiceCDCs = serviceCDCs;
        serviceCDCs = newServiceCDCs;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.SERVICE_NS__SERVICE_CD_CS, oldServiceCDCs, newServiceCDCs );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceCDCs( ServiceCDCs newServiceCDCs ) {
        if( newServiceCDCs != serviceCDCs ) {
            NotificationChain msgs = null;
            if( serviceCDCs != null ) msgs = ( ( InternalEObject ) serviceCDCs ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_CD_CS, null, msgs );
            if( newServiceCDCs != null ) msgs = ( ( InternalEObject ) newServiceCDCs ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.SERVICE_NS__SERVICE_CD_CS, null, msgs );
            msgs = basicSetServiceCDCs( newServiceCDCs, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__SERVICE_CD_CS, newServiceCDCs, newServiceCDCs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescID() {
        return descID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescID( String newDescID ) {
        String oldDescID = descID;
        descID = newDescID;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__DESC_ID, oldDescID, descID ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__ID, oldId, id ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__PUBLICATION_STAGE,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.SERVICE_NS__PUBLICATION_STAGE,
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
    public short getRelease() {
        return release;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelease( short newRelease ) {
        short oldRelease = release;
        release = newRelease;
        boolean oldReleaseESet = releaseESet;
        releaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__RELEASE, oldRelease, release, !oldReleaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelease() {
        short oldRelease = release;
        boolean oldReleaseESet = releaseESet;
        release = RELEASE_EDEFAULT;
        releaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_NS__RELEASE, oldRelease, RELEASE_EDEFAULT, oldReleaseESet ) );
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
                NsdPackage.SERVICE_NS__REVISION, oldRevision, revision, !oldRevisionESet ) );
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
                NsdPackage.SERVICE_NS__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
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
    public XMLGregorianCalendar getUmlDate() {
        return umlDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUmlDate( XMLGregorianCalendar newUmlDate ) {
        XMLGregorianCalendar oldUmlDate = umlDate;
        umlDate = newUmlDate;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, NsdPackage.SERVICE_NS__UML_DATE, oldUmlDate, umlDate ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUmlVersion() {
        return umlVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUmlVersion( String newUmlVersion ) {
        String oldUmlVersion = umlVersion;
        umlVersion = newUmlVersion;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__UML_VERSION, oldUmlVersion, umlVersion ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( int newVersion ) {
        int oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.SERVICE_NS__VERSION, oldVersion, version, !oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        int oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.SERVICE_NS__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet ) );
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
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_NS__CHANGES:
            return basicSetChanges( null, msgs );
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            return basicSetFunctionalConstraints( null, msgs );
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            return basicSetPresenceConditions( null, msgs );
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            return basicSetAbbreviations( null, msgs );
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            return basicSetServiceTypeRealizations( null, msgs );
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            return basicSetServiceConstructedAttributes( null, msgs );
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            return basicSetServiceCDCs( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case NsdPackage.SERVICE_NS__CHANGES:
            return getChanges();
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            return getFunctionalConstraints();
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            return getPresenceConditions();
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            return getAbbreviations();
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            return getServiceTypeRealizations();
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            return getServiceConstructedAttributes();
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            return getServiceCDCs();
        case NsdPackage.SERVICE_NS__DESC_ID:
            return getDescID();
        case NsdPackage.SERVICE_NS__ID:
            return getId();
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.SERVICE_NS__RELEASE:
            return getRelease();
        case NsdPackage.SERVICE_NS__REVISION:
            return getRevision();
        case NsdPackage.SERVICE_NS__UML_DATE:
            return getUmlDate();
        case NsdPackage.SERVICE_NS__UML_VERSION:
            return getUmlVersion();
        case NsdPackage.SERVICE_NS__VERSION:
            return getVersion();
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
        case NsdPackage.SERVICE_NS__CHANGES:
            setChanges( ( Changes ) newValue );
            return;
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( FunctionalConstraints ) newValue );
            return;
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            setPresenceConditions( ( PresenceConditions ) newValue );
            return;
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            setAbbreviations( ( Abbreviations ) newValue );
            return;
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            setServiceTypeRealizations( ( ServiceTypeRealizations ) newValue );
            return;
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            setServiceConstructedAttributes( ( ServiceConstructedAttributes ) newValue );
            return;
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            setServiceCDCs( ( ServiceCDCs ) newValue );
            return;
        case NsdPackage.SERVICE_NS__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.SERVICE_NS__RELEASE:
            setRelease( ( Short ) newValue );
            return;
        case NsdPackage.SERVICE_NS__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.SERVICE_NS__UML_VERSION:
            setUmlVersion( ( String ) newValue );
            return;
        case NsdPackage.SERVICE_NS__VERSION:
            setVersion( ( Integer ) newValue );
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
        case NsdPackage.SERVICE_NS__CHANGES:
            setChanges( ( Changes ) null );
            return;
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( FunctionalConstraints ) null );
            return;
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            setPresenceConditions( ( PresenceConditions ) null );
            return;
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            setAbbreviations( ( Abbreviations ) null );
            return;
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            setServiceTypeRealizations( ( ServiceTypeRealizations ) null );
            return;
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            setServiceConstructedAttributes( ( ServiceConstructedAttributes ) null );
            return;
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            setServiceCDCs( ( ServiceCDCs ) null );
            return;
        case NsdPackage.SERVICE_NS__DESC_ID:
            setDescID( DESC_ID_EDEFAULT );
            return;
        case NsdPackage.SERVICE_NS__ID:
            setId( ID_EDEFAULT );
            return;
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.SERVICE_NS__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.SERVICE_NS__REVISION:
            unsetRevision();
            return;
        case NsdPackage.SERVICE_NS__UML_DATE:
            setUmlDate( UML_DATE_EDEFAULT );
            return;
        case NsdPackage.SERVICE_NS__UML_VERSION:
            setUmlVersion( UML_VERSION_EDEFAULT );
            return;
        case NsdPackage.SERVICE_NS__VERSION:
            unsetVersion();
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
        case NsdPackage.SERVICE_NS__CHANGES:
            return changes != null;
        case NsdPackage.SERVICE_NS__FUNCTIONAL_CONSTRAINTS:
            return functionalConstraints != null;
        case NsdPackage.SERVICE_NS__PRESENCE_CONDITIONS:
            return presenceConditions != null;
        case NsdPackage.SERVICE_NS__ABBREVIATIONS:
            return abbreviations != null;
        case NsdPackage.SERVICE_NS__SERVICE_TYPE_REALIZATIONS:
            return serviceTypeRealizations != null;
        case NsdPackage.SERVICE_NS__SERVICE_CONSTRUCTED_ATTRIBUTES:
            return serviceConstructedAttributes != null;
        case NsdPackage.SERVICE_NS__SERVICE_CD_CS:
            return serviceCDCs != null;
        case NsdPackage.SERVICE_NS__DESC_ID:
            return DESC_ID_EDEFAULT == null ? descID != null : !DESC_ID_EDEFAULT.equals( descID );
        case NsdPackage.SERVICE_NS__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals( id );
        case NsdPackage.SERVICE_NS__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.SERVICE_NS__RELEASE:
            return isSetRelease();
        case NsdPackage.SERVICE_NS__REVISION:
            return isSetRevision();
        case NsdPackage.SERVICE_NS__UML_DATE:
            return UML_DATE_EDEFAULT == null ? umlDate != null : !UML_DATE_EDEFAULT.equals( umlDate );
        case NsdPackage.SERVICE_NS__UML_VERSION:
            return UML_VERSION_EDEFAULT == null ? umlVersion != null : !UML_VERSION_EDEFAULT.equals( umlVersion );
        case NsdPackage.SERVICE_NS__VERSION:
            return isSetVersion();
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
        result.append( " (descID: " );
        result.append( descID );
        result.append( ", id: " );
        result.append( id );
        result.append( ", publicationStage: " );
        if( publicationStageESet )
            result.append( publicationStage );
        else
            result.append( "<unset>" );
        result.append( ", release: " );
        if( releaseESet )
            result.append( release );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ", umlDate: " );
        result.append( umlDate );
        result.append( ", umlVersion: " );
        result.append( umlVersion );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ServiceNSImpl
