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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOnType;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NSDObjectWithVersionAndRelease;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getBasicTypes <em>Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getConstructedAttributes <em>Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getCDCs <em>CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getLNClasses <em>LN Classes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getUmlVersion <em>Uml Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSImpl extends CopyrightedImpl implements NS {
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
     * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChanges()
     * @generated
     * @ordered
     */
    protected Changes changes;

    /**
     * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependsOn()
     * @generated
     * @ordered
     */
    protected DependsOnType dependsOn;

    /**
     * The cached value of the '{@link #getBasicTypes() <em>Basic Types</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasicTypes()
     * @generated
     * @ordered
     */
    protected BasicTypes basicTypes;

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
     * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerations()
     * @generated
     * @ordered
     */
    protected Enumerations enumerations;

    /**
     * The cached value of the '{@link #getConstructedAttributes() <em>Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstructedAttributes()
     * @generated
     * @ordered
     */
    protected ConstructedAttributes constructedAttributes;

    /**
     * The cached value of the '{@link #getCDCs() <em>CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCDCs()
     * @generated
     * @ordered
     */
    protected CDCs cDCs;

    /**
     * The cached value of the '{@link #getLNClasses() <em>LN Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNClasses()
     * @generated
     * @ordered
     */
    protected LNClasses lNClasses;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.NS;
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CHANGES,
                    oldChanges, newChanges );
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
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CHANGES, null, msgs );
            if( newChanges != null ) msgs = ( ( InternalEObject ) newChanges ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CHANGES, null, msgs );
            msgs = basicSetChanges( newChanges, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CHANGES, newChanges, newChanges ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DependsOnType getDependsOn() {
        return dependsOn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDependsOn( DependsOnType newDependsOn, NotificationChain msgs ) {
        DependsOnType oldDependsOn = dependsOn;
        dependsOn = newDependsOn;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__DEPENDS_ON,
                    oldDependsOn, newDependsOn );
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
    public void setDependsOn( DependsOnType newDependsOn ) {
        if( newDependsOn != dependsOn ) {
            NotificationChain msgs = null;
            if( dependsOn != null ) msgs = ( ( InternalEObject ) dependsOn ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__DEPENDS_ON, null, msgs );
            if( newDependsOn != null ) msgs = ( ( InternalEObject ) newDependsOn ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__DEPENDS_ON, null, msgs );
            msgs = basicSetDependsOn( newDependsOn, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__DEPENDS_ON, newDependsOn, newDependsOn ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicTypes getBasicTypes() {
        return basicTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBasicTypes( BasicTypes newBasicTypes, NotificationChain msgs ) {
        BasicTypes oldBasicTypes = basicTypes;
        basicTypes = newBasicTypes;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__BASIC_TYPES,
                    oldBasicTypes, newBasicTypes );
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
    public void setBasicTypes( BasicTypes newBasicTypes ) {
        if( newBasicTypes != basicTypes ) {
            NotificationChain msgs = null;
            if( basicTypes != null ) msgs = ( ( InternalEObject ) basicTypes ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__BASIC_TYPES, null, msgs );
            if( newBasicTypes != null ) msgs = ( ( InternalEObject ) newBasicTypes ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__BASIC_TYPES, null, msgs );
            msgs = basicSetBasicTypes( newBasicTypes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__BASIC_TYPES, newBasicTypes, newBasicTypes ) );
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
                    NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, newFunctionalConstraints );
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
            if( functionalConstraints != null ) msgs = ( ( InternalEObject ) functionalConstraints )
                    .eInverseRemove( this, EOPPOSITE_FEATURE_BASE - NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            if( newFunctionalConstraints != null ) msgs = ( ( InternalEObject ) newFunctionalConstraints )
                    .eInverseAdd( this, EOPPOSITE_FEATURE_BASE - NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            msgs = basicSetFunctionalConstraints( newFunctionalConstraints, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, newFunctionalConstraints, newFunctionalConstraints ) );
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
                    NsdPackage.NS__PRESENCE_CONDITIONS, oldPresenceConditions, newPresenceConditions );
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
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__PRESENCE_CONDITIONS, null, msgs );
            if( newPresenceConditions != null ) msgs = ( ( InternalEObject ) newPresenceConditions ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__PRESENCE_CONDITIONS, null, msgs );
            msgs = basicSetPresenceConditions( newPresenceConditions, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__PRESENCE_CONDITIONS, newPresenceConditions, newPresenceConditions ) );
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
                    NsdPackage.NS__ABBREVIATIONS, oldAbbreviations, newAbbreviations );
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
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__ABBREVIATIONS, null, msgs );
            if( newAbbreviations != null ) msgs = ( ( InternalEObject ) newAbbreviations ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__ABBREVIATIONS, null, msgs );
            msgs = basicSetAbbreviations( newAbbreviations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__ABBREVIATIONS, newAbbreviations, newAbbreviations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumerations getEnumerations() {
        return enumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnumerations( Enumerations newEnumerations, NotificationChain msgs ) {
        Enumerations oldEnumerations = enumerations;
        enumerations = newEnumerations;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__ENUMERATIONS,
                    oldEnumerations, newEnumerations );
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
    public void setEnumerations( Enumerations newEnumerations ) {
        if( newEnumerations != enumerations ) {
            NotificationChain msgs = null;
            if( enumerations != null ) msgs = ( ( InternalEObject ) enumerations ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__ENUMERATIONS, null, msgs );
            if( newEnumerations != null ) msgs = ( ( InternalEObject ) newEnumerations ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__ENUMERATIONS, null, msgs );
            msgs = basicSetEnumerations( newEnumerations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__ENUMERATIONS, newEnumerations, newEnumerations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConstructedAttributes getConstructedAttributes() {
        return constructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConstructedAttributes( ConstructedAttributes newConstructedAttributes,
            NotificationChain msgs ) {
        ConstructedAttributes oldConstructedAttributes = constructedAttributes;
        constructedAttributes = newConstructedAttributes;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, oldConstructedAttributes, newConstructedAttributes );
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
    public void setConstructedAttributes( ConstructedAttributes newConstructedAttributes ) {
        if( newConstructedAttributes != constructedAttributes ) {
            NotificationChain msgs = null;
            if( constructedAttributes != null ) msgs = ( ( InternalEObject ) constructedAttributes )
                    .eInverseRemove( this, EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, null, msgs );
            if( newConstructedAttributes != null ) msgs = ( ( InternalEObject ) newConstructedAttributes )
                    .eInverseAdd( this, EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, null, msgs );
            msgs = basicSetConstructedAttributes( newConstructedAttributes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, newConstructedAttributes, newConstructedAttributes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CDCs getCDCs() {
        return cDCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCDCs( CDCs newCDCs, NotificationChain msgs ) {
        CDCs oldCDCs = cDCs;
        cDCs = newCDCs;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CD_CS,
                    oldCDCs, newCDCs );
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
    public void setCDCs( CDCs newCDCs ) {
        if( newCDCs != cDCs ) {
            NotificationChain msgs = null;
            if( cDCs != null ) msgs = ( ( InternalEObject ) cDCs ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CD_CS, null, msgs );
            if( newCDCs != null ) msgs = ( ( InternalEObject ) newCDCs ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CD_CS, null, msgs );
            msgs = basicSetCDCs( newCDCs, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CD_CS, newCDCs, newCDCs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNClasses getLNClasses() {
        return lNClasses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLNClasses( LNClasses newLNClasses, NotificationChain msgs ) {
        LNClasses oldLNClasses = lNClasses;
        lNClasses = newLNClasses;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__LN_CLASSES,
                    oldLNClasses, newLNClasses );
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
    public void setLNClasses( LNClasses newLNClasses ) {
        if( newLNClasses != lNClasses ) {
            NotificationChain msgs = null;
            if( lNClasses != null ) msgs = ( ( InternalEObject ) lNClasses ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__LN_CLASSES, null, msgs );
            if( newLNClasses != null ) msgs = ( ( InternalEObject ) newLNClasses ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.NS__LN_CLASSES, null, msgs );
            msgs = basicSetLNClasses( newLNClasses, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__LN_CLASSES, newLNClasses, newLNClasses ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__DESC_ID, oldDescID, descID ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__ID, oldId, id ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.NS__PUBLICATION_STAGE, oldPublicationStage, publicationStage, !oldPublicationStageESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__PUBLICATION_STAGE,
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__RELEASE,
                oldRelease, release, !oldReleaseESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__RELEASE,
                oldRelease, RELEASE_EDEFAULT, oldReleaseESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__REVISION,
                oldRevision, revision, !oldRevisionESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__REVISION,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__UML_DATE, oldUmlDate, umlDate ) );
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
                NsdPackage.NS__UML_VERSION, oldUmlVersion, umlVersion ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__VERSION,
                oldVersion, version, !oldVersionESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__VERSION,
                oldVersion, VERSION_EDEFAULT, oldVersionESet ) );
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
        case NsdPackage.NS__CHANGES:
            return basicSetChanges( null, msgs );
        case NsdPackage.NS__DEPENDS_ON:
            return basicSetDependsOn( null, msgs );
        case NsdPackage.NS__BASIC_TYPES:
            return basicSetBasicTypes( null, msgs );
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            return basicSetFunctionalConstraints( null, msgs );
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            return basicSetPresenceConditions( null, msgs );
        case NsdPackage.NS__ABBREVIATIONS:
            return basicSetAbbreviations( null, msgs );
        case NsdPackage.NS__ENUMERATIONS:
            return basicSetEnumerations( null, msgs );
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            return basicSetConstructedAttributes( null, msgs );
        case NsdPackage.NS__CD_CS:
            return basicSetCDCs( null, msgs );
        case NsdPackage.NS__LN_CLASSES:
            return basicSetLNClasses( null, msgs );
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
        case NsdPackage.NS__RELEASE:
            return getRelease();
        case NsdPackage.NS__VERSION:
            return getVersion();
        case NsdPackage.NS__CHANGES:
            return getChanges();
        case NsdPackage.NS__DEPENDS_ON:
            return getDependsOn();
        case NsdPackage.NS__BASIC_TYPES:
            return getBasicTypes();
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            return getFunctionalConstraints();
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            return getPresenceConditions();
        case NsdPackage.NS__ABBREVIATIONS:
            return getAbbreviations();
        case NsdPackage.NS__ENUMERATIONS:
            return getEnumerations();
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            return getConstructedAttributes();
        case NsdPackage.NS__CD_CS:
            return getCDCs();
        case NsdPackage.NS__LN_CLASSES:
            return getLNClasses();
        case NsdPackage.NS__DESC_ID:
            return getDescID();
        case NsdPackage.NS__ID:
            return getId();
        case NsdPackage.NS__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.NS__REVISION:
            return getRevision();
        case NsdPackage.NS__UML_DATE:
            return getUmlDate();
        case NsdPackage.NS__UML_VERSION:
            return getUmlVersion();
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
        case NsdPackage.NS__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.NS__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.NS__CHANGES:
            setChanges( ( Changes ) newValue );
            return;
        case NsdPackage.NS__DEPENDS_ON:
            setDependsOn( ( DependsOnType ) newValue );
            return;
        case NsdPackage.NS__BASIC_TYPES:
            setBasicTypes( ( BasicTypes ) newValue );
            return;
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( FunctionalConstraints ) newValue );
            return;
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            setPresenceConditions( ( PresenceConditions ) newValue );
            return;
        case NsdPackage.NS__ABBREVIATIONS:
            setAbbreviations( ( Abbreviations ) newValue );
            return;
        case NsdPackage.NS__ENUMERATIONS:
            setEnumerations( ( Enumerations ) newValue );
            return;
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            setConstructedAttributes( ( ConstructedAttributes ) newValue );
            return;
        case NsdPackage.NS__CD_CS:
            setCDCs( ( CDCs ) newValue );
            return;
        case NsdPackage.NS__LN_CLASSES:
            setLNClasses( ( LNClasses ) newValue );
            return;
        case NsdPackage.NS__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.NS__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.NS__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.NS__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.NS__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.NS__UML_VERSION:
            setUmlVersion( ( String ) newValue );
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
        case NsdPackage.NS__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.NS__VERSION:
            unsetVersion();
            return;
        case NsdPackage.NS__CHANGES:
            setChanges( ( Changes ) null );
            return;
        case NsdPackage.NS__DEPENDS_ON:
            setDependsOn( ( DependsOnType ) null );
            return;
        case NsdPackage.NS__BASIC_TYPES:
            setBasicTypes( ( BasicTypes ) null );
            return;
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( FunctionalConstraints ) null );
            return;
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            setPresenceConditions( ( PresenceConditions ) null );
            return;
        case NsdPackage.NS__ABBREVIATIONS:
            setAbbreviations( ( Abbreviations ) null );
            return;
        case NsdPackage.NS__ENUMERATIONS:
            setEnumerations( ( Enumerations ) null );
            return;
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            setConstructedAttributes( ( ConstructedAttributes ) null );
            return;
        case NsdPackage.NS__CD_CS:
            setCDCs( ( CDCs ) null );
            return;
        case NsdPackage.NS__LN_CLASSES:
            setLNClasses( ( LNClasses ) null );
            return;
        case NsdPackage.NS__DESC_ID:
            setDescID( DESC_ID_EDEFAULT );
            return;
        case NsdPackage.NS__ID:
            setId( ID_EDEFAULT );
            return;
        case NsdPackage.NS__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.NS__REVISION:
            unsetRevision();
            return;
        case NsdPackage.NS__UML_DATE:
            setUmlDate( UML_DATE_EDEFAULT );
            return;
        case NsdPackage.NS__UML_VERSION:
            setUmlVersion( UML_VERSION_EDEFAULT );
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
        case NsdPackage.NS__RELEASE:
            return isSetRelease();
        case NsdPackage.NS__VERSION:
            return isSetVersion();
        case NsdPackage.NS__CHANGES:
            return changes != null;
        case NsdPackage.NS__DEPENDS_ON:
            return dependsOn != null;
        case NsdPackage.NS__BASIC_TYPES:
            return basicTypes != null;
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            return functionalConstraints != null;
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            return presenceConditions != null;
        case NsdPackage.NS__ABBREVIATIONS:
            return abbreviations != null;
        case NsdPackage.NS__ENUMERATIONS:
            return enumerations != null;
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            return constructedAttributes != null;
        case NsdPackage.NS__CD_CS:
            return cDCs != null;
        case NsdPackage.NS__LN_CLASSES:
            return lNClasses != null;
        case NsdPackage.NS__DESC_ID:
            return DESC_ID_EDEFAULT == null ? descID != null : !DESC_ID_EDEFAULT.equals( descID );
        case NsdPackage.NS__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals( id );
        case NsdPackage.NS__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.NS__REVISION:
            return isSetRevision();
        case NsdPackage.NS__UML_DATE:
            return UML_DATE_EDEFAULT == null ? umlDate != null : !UML_DATE_EDEFAULT.equals( umlDate );
        case NsdPackage.NS__UML_VERSION:
            return UML_VERSION_EDEFAULT == null ? umlVersion != null : !UML_VERSION_EDEFAULT.equals( umlVersion );
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
        if( baseClass == NSDObjectWithVersionAndRelease.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.NS__RELEASE:
                return NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE;
            case NsdPackage.NS__VERSION:
                return NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION;
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
        if( baseClass == NSDObjectWithVersionAndRelease.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__RELEASE:
                return NsdPackage.NS__RELEASE;
            case NsdPackage.NSD_OBJECT_WITH_VERSION_AND_RELEASE__VERSION:
                return NsdPackage.NS__VERSION;
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
        result.append( ", descID: " );
        result.append( descID );
        result.append( ", id: " );
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
        result.append( ", umlDate: " );
        result.append( umlDate );
        result.append( ", umlVersion: " );
        result.append( umlVersion );
        result.append( ')' );
        return result.toString();
    }

} //NSImpl
