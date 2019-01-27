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
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TAbbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TBasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TCDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TChanges;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TEnumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TFunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TLNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TNS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.TPubStage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TNS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getBasicTypes <em>Basic Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getFunctionalConstraints <em>Functional Constraints</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getPresenceConditions <em>Presence Conditions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getConstructedAttributes <em>Constructed Attributes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getCDCs <em>CD Cs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getLNClasses <em>LN Classes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.TNSImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TNSImpl extends TCopyrightedImpl implements TNS {
    /**
     * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChanges()
     * @generated
     * @ordered
     */
    protected TChanges changes;

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
    protected TBasicTypes basicTypes;

    /**
     * The cached value of the '{@link #getFunctionalConstraints() <em>Functional Constraints</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalConstraints()
     * @generated
     * @ordered
     */
    protected TFunctionalConstraints functionalConstraints;

    /**
     * The cached value of the '{@link #getPresenceConditions() <em>Presence Conditions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresenceConditions()
     * @generated
     * @ordered
     */
    protected TPresenceConditions presenceConditions;

    /**
     * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviations()
     * @generated
     * @ordered
     */
    protected TAbbreviations abbreviations;

    /**
     * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumerations()
     * @generated
     * @ordered
     */
    protected TEnumerations enumerations;

    /**
     * The cached value of the '{@link #getConstructedAttributes() <em>Constructed Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstructedAttributes()
     * @generated
     * @ordered
     */
    protected TConstructedAttributes constructedAttributes;

    /**
     * The cached value of the '{@link #getCDCs() <em>CD Cs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCDCs()
     * @generated
     * @ordered
     */
    protected TCDCs cDCs;

    /**
     * The cached value of the '{@link #getLNClasses() <em>LN Classes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNClasses()
     * @generated
     * @ordered
     */
    protected TLNClasses lNClasses;

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
    protected static final TPubStage PUBLICATION_STAGE_EDEFAULT = TPubStage.IS;

    /**
     * The cached value of the '{@link #getPublicationStage() <em>Publication Stage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicationStage()
     * @generated
     * @ordered
     */
    protected TPubStage publicationStage = PUBLICATION_STAGE_EDEFAULT;

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
    protected TNSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NsdPackage.Literals.TNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TChanges getChanges() {
        return changes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChanges( TChanges newChanges, NotificationChain msgs ) {
        TChanges oldChanges = changes;
        changes = newChanges;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__CHANGES,
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
    public void setChanges( TChanges newChanges ) {
        if( newChanges != changes ) {
            NotificationChain msgs = null;
            if( changes != null ) msgs = ( ( InternalEObject ) changes ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__CHANGES, null, msgs );
            if( newChanges != null ) msgs = ( ( InternalEObject ) newChanges ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__CHANGES, null, msgs );
            msgs = basicSetChanges( newChanges, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__CHANGES, newChanges, newChanges ) );
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__DEPENDS_ON,
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
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__DEPENDS_ON, null, msgs );
            if( newDependsOn != null ) msgs = ( ( InternalEObject ) newDependsOn ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__DEPENDS_ON, null, msgs );
            msgs = basicSetDependsOn( newDependsOn, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__DEPENDS_ON, newDependsOn, newDependsOn ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TBasicTypes getBasicTypes() {
        return basicTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBasicTypes( TBasicTypes newBasicTypes, NotificationChain msgs ) {
        TBasicTypes oldBasicTypes = basicTypes;
        basicTypes = newBasicTypes;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__BASIC_TYPES,
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
    public void setBasicTypes( TBasicTypes newBasicTypes ) {
        if( newBasicTypes != basicTypes ) {
            NotificationChain msgs = null;
            if( basicTypes != null ) msgs = ( ( InternalEObject ) basicTypes ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__BASIC_TYPES, null, msgs );
            if( newBasicTypes != null ) msgs = ( ( InternalEObject ) newBasicTypes ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__BASIC_TYPES, null, msgs );
            msgs = basicSetBasicTypes( newBasicTypes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__BASIC_TYPES, newBasicTypes, newBasicTypes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TFunctionalConstraints getFunctionalConstraints() {
        return functionalConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunctionalConstraints( TFunctionalConstraints newFunctionalConstraints,
            NotificationChain msgs ) {
        TFunctionalConstraints oldFunctionalConstraints = functionalConstraints;
        functionalConstraints = newFunctionalConstraints;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, newFunctionalConstraints );
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
    public void setFunctionalConstraints( TFunctionalConstraints newFunctionalConstraints ) {
        if( newFunctionalConstraints != functionalConstraints ) {
            NotificationChain msgs = null;
            if( functionalConstraints != null )
                msgs = ( ( InternalEObject ) functionalConstraints ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            if( newFunctionalConstraints != null ) msgs = ( ( InternalEObject ) newFunctionalConstraints )
                    .eInverseAdd( this, EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            msgs = basicSetFunctionalConstraints( newFunctionalConstraints, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS, newFunctionalConstraints, newFunctionalConstraints ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TPresenceConditions getPresenceConditions() {
        return presenceConditions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPresenceConditions( TPresenceConditions newPresenceConditions,
            NotificationChain msgs ) {
        TPresenceConditions oldPresenceConditions = presenceConditions;
        presenceConditions = newPresenceConditions;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TNS__PRESENCE_CONDITIONS, oldPresenceConditions, newPresenceConditions );
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
    public void setPresenceConditions( TPresenceConditions newPresenceConditions ) {
        if( newPresenceConditions != presenceConditions ) {
            NotificationChain msgs = null;
            if( presenceConditions != null ) msgs = ( ( InternalEObject ) presenceConditions ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__PRESENCE_CONDITIONS, null, msgs );
            if( newPresenceConditions != null ) msgs = ( ( InternalEObject ) newPresenceConditions ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__PRESENCE_CONDITIONS, null, msgs );
            msgs = basicSetPresenceConditions( newPresenceConditions, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__PRESENCE_CONDITIONS, newPresenceConditions, newPresenceConditions ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TAbbreviations getAbbreviations() {
        return abbreviations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAbbreviations( TAbbreviations newAbbreviations, NotificationChain msgs ) {
        TAbbreviations oldAbbreviations = abbreviations;
        abbreviations = newAbbreviations;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TNS__ABBREVIATIONS, oldAbbreviations, newAbbreviations );
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
    public void setAbbreviations( TAbbreviations newAbbreviations ) {
        if( newAbbreviations != abbreviations ) {
            NotificationChain msgs = null;
            if( abbreviations != null ) msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__ABBREVIATIONS, null, msgs );
            if( newAbbreviations != null ) msgs = ( ( InternalEObject ) newAbbreviations ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__ABBREVIATIONS, null, msgs );
            msgs = basicSetAbbreviations( newAbbreviations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__ABBREVIATIONS, newAbbreviations, newAbbreviations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TEnumerations getEnumerations() {
        return enumerations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnumerations( TEnumerations newEnumerations, NotificationChain msgs ) {
        TEnumerations oldEnumerations = enumerations;
        enumerations = newEnumerations;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TNS__ENUMERATIONS, oldEnumerations, newEnumerations );
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
    public void setEnumerations( TEnumerations newEnumerations ) {
        if( newEnumerations != enumerations ) {
            NotificationChain msgs = null;
            if( enumerations != null ) msgs = ( ( InternalEObject ) enumerations ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__ENUMERATIONS, null, msgs );
            if( newEnumerations != null ) msgs = ( ( InternalEObject ) newEnumerations ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__ENUMERATIONS, null, msgs );
            msgs = basicSetEnumerations( newEnumerations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__ENUMERATIONS, newEnumerations, newEnumerations ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TConstructedAttributes getConstructedAttributes() {
        return constructedAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConstructedAttributes( TConstructedAttributes newConstructedAttributes,
            NotificationChain msgs ) {
        TConstructedAttributes oldConstructedAttributes = constructedAttributes;
        constructedAttributes = newConstructedAttributes;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES, oldConstructedAttributes, newConstructedAttributes );
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
    public void setConstructedAttributes( TConstructedAttributes newConstructedAttributes ) {
        if( newConstructedAttributes != constructedAttributes ) {
            NotificationChain msgs = null;
            if( constructedAttributes != null )
                msgs = ( ( InternalEObject ) constructedAttributes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES, null, msgs );
            if( newConstructedAttributes != null ) msgs = ( ( InternalEObject ) newConstructedAttributes )
                    .eInverseAdd( this, EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES, null, msgs );
            msgs = basicSetConstructedAttributes( newConstructedAttributes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES, newConstructedAttributes, newConstructedAttributes ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TCDCs getCDCs() {
        return cDCs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCDCs( TCDCs newCDCs, NotificationChain msgs ) {
        TCDCs oldCDCs = cDCs;
        cDCs = newCDCs;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__CD_CS,
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
    public void setCDCs( TCDCs newCDCs ) {
        if( newCDCs != cDCs ) {
            NotificationChain msgs = null;
            if( cDCs != null ) msgs = ( ( InternalEObject ) cDCs ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__CD_CS, null, msgs );
            if( newCDCs != null ) msgs = ( ( InternalEObject ) newCDCs ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__CD_CS, null, msgs );
            msgs = basicSetCDCs( newCDCs, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__CD_CS, newCDCs, newCDCs ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TLNClasses getLNClasses() {
        return lNClasses;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLNClasses( TLNClasses newLNClasses, NotificationChain msgs ) {
        TLNClasses oldLNClasses = lNClasses;
        lNClasses = newLNClasses;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__LN_CLASSES,
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
    public void setLNClasses( TLNClasses newLNClasses ) {
        if( newLNClasses != lNClasses ) {
            NotificationChain msgs = null;
            if( lNClasses != null ) msgs = ( ( InternalEObject ) lNClasses ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__LN_CLASSES, null, msgs );
            if( newLNClasses != null ) msgs = ( ( InternalEObject ) newLNClasses ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - NsdPackage.TNS__LN_CLASSES, null, msgs );
            msgs = basicSetLNClasses( newLNClasses, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__LN_CLASSES, newLNClasses, newLNClasses ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__DESC_ID, oldDescID, descID ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TPubStage getPublicationStage() {
        return publicationStage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPublicationStage( TPubStage newPublicationStage ) {
        TPubStage oldPublicationStage = publicationStage;
        publicationStage = newPublicationStage == null ? PUBLICATION_STAGE_EDEFAULT : newPublicationStage;
        boolean oldPublicationStageESet = publicationStageESet;
        publicationStageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                NsdPackage.TNS__PUBLICATION_STAGE, oldPublicationStage, publicationStage, !oldPublicationStageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPublicationStage() {
        TPubStage oldPublicationStage = publicationStage;
        boolean oldPublicationStageESet = publicationStageESet;
        publicationStage = PUBLICATION_STAGE_EDEFAULT;
        publicationStageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.TNS__PUBLICATION_STAGE,
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__RELEASE,
                oldRelease, release, !oldReleaseESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.TNS__RELEASE,
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__REVISION,
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                NsdPackage.TNS__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__UML_DATE, oldUmlDate, umlDate ) );
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
                NsdPackage.TNS__UML_VERSION, oldUmlVersion, umlVersion ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.TNS__VERSION,
                oldVersion, version, !oldVersionESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.TNS__VERSION,
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
        case NsdPackage.TNS__CHANGES:
            return basicSetChanges( null, msgs );
        case NsdPackage.TNS__DEPENDS_ON:
            return basicSetDependsOn( null, msgs );
        case NsdPackage.TNS__BASIC_TYPES:
            return basicSetBasicTypes( null, msgs );
        case NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS:
            return basicSetFunctionalConstraints( null, msgs );
        case NsdPackage.TNS__PRESENCE_CONDITIONS:
            return basicSetPresenceConditions( null, msgs );
        case NsdPackage.TNS__ABBREVIATIONS:
            return basicSetAbbreviations( null, msgs );
        case NsdPackage.TNS__ENUMERATIONS:
            return basicSetEnumerations( null, msgs );
        case NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES:
            return basicSetConstructedAttributes( null, msgs );
        case NsdPackage.TNS__CD_CS:
            return basicSetCDCs( null, msgs );
        case NsdPackage.TNS__LN_CLASSES:
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
        case NsdPackage.TNS__CHANGES:
            return getChanges();
        case NsdPackage.TNS__DEPENDS_ON:
            return getDependsOn();
        case NsdPackage.TNS__BASIC_TYPES:
            return getBasicTypes();
        case NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS:
            return getFunctionalConstraints();
        case NsdPackage.TNS__PRESENCE_CONDITIONS:
            return getPresenceConditions();
        case NsdPackage.TNS__ABBREVIATIONS:
            return getAbbreviations();
        case NsdPackage.TNS__ENUMERATIONS:
            return getEnumerations();
        case NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES:
            return getConstructedAttributes();
        case NsdPackage.TNS__CD_CS:
            return getCDCs();
        case NsdPackage.TNS__LN_CLASSES:
            return getLNClasses();
        case NsdPackage.TNS__DESC_ID:
            return getDescID();
        case NsdPackage.TNS__ID:
            return getId();
        case NsdPackage.TNS__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.TNS__RELEASE:
            return getRelease();
        case NsdPackage.TNS__REVISION:
            return getRevision();
        case NsdPackage.TNS__UML_DATE:
            return getUmlDate();
        case NsdPackage.TNS__UML_VERSION:
            return getUmlVersion();
        case NsdPackage.TNS__VERSION:
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
        case NsdPackage.TNS__CHANGES:
            setChanges( ( TChanges ) newValue );
            return;
        case NsdPackage.TNS__DEPENDS_ON:
            setDependsOn( ( DependsOnType ) newValue );
            return;
        case NsdPackage.TNS__BASIC_TYPES:
            setBasicTypes( ( TBasicTypes ) newValue );
            return;
        case NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( TFunctionalConstraints ) newValue );
            return;
        case NsdPackage.TNS__PRESENCE_CONDITIONS:
            setPresenceConditions( ( TPresenceConditions ) newValue );
            return;
        case NsdPackage.TNS__ABBREVIATIONS:
            setAbbreviations( ( TAbbreviations ) newValue );
            return;
        case NsdPackage.TNS__ENUMERATIONS:
            setEnumerations( ( TEnumerations ) newValue );
            return;
        case NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES:
            setConstructedAttributes( ( TConstructedAttributes ) newValue );
            return;
        case NsdPackage.TNS__CD_CS:
            setCDCs( ( TCDCs ) newValue );
            return;
        case NsdPackage.TNS__LN_CLASSES:
            setLNClasses( ( TLNClasses ) newValue );
            return;
        case NsdPackage.TNS__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.TNS__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.TNS__PUBLICATION_STAGE:
            setPublicationStage( ( TPubStage ) newValue );
            return;
        case NsdPackage.TNS__RELEASE:
            setRelease( ( Short ) newValue );
            return;
        case NsdPackage.TNS__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.TNS__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.TNS__UML_VERSION:
            setUmlVersion( ( String ) newValue );
            return;
        case NsdPackage.TNS__VERSION:
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
        case NsdPackage.TNS__CHANGES:
            setChanges( ( TChanges ) null );
            return;
        case NsdPackage.TNS__DEPENDS_ON:
            setDependsOn( ( DependsOnType ) null );
            return;
        case NsdPackage.TNS__BASIC_TYPES:
            setBasicTypes( ( TBasicTypes ) null );
            return;
        case NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS:
            setFunctionalConstraints( ( TFunctionalConstraints ) null );
            return;
        case NsdPackage.TNS__PRESENCE_CONDITIONS:
            setPresenceConditions( ( TPresenceConditions ) null );
            return;
        case NsdPackage.TNS__ABBREVIATIONS:
            setAbbreviations( ( TAbbreviations ) null );
            return;
        case NsdPackage.TNS__ENUMERATIONS:
            setEnumerations( ( TEnumerations ) null );
            return;
        case NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES:
            setConstructedAttributes( ( TConstructedAttributes ) null );
            return;
        case NsdPackage.TNS__CD_CS:
            setCDCs( ( TCDCs ) null );
            return;
        case NsdPackage.TNS__LN_CLASSES:
            setLNClasses( ( TLNClasses ) null );
            return;
        case NsdPackage.TNS__DESC_ID:
            setDescID( DESC_ID_EDEFAULT );
            return;
        case NsdPackage.TNS__ID:
            setId( ID_EDEFAULT );
            return;
        case NsdPackage.TNS__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.TNS__RELEASE:
            unsetRelease();
            return;
        case NsdPackage.TNS__REVISION:
            unsetRevision();
            return;
        case NsdPackage.TNS__UML_DATE:
            setUmlDate( UML_DATE_EDEFAULT );
            return;
        case NsdPackage.TNS__UML_VERSION:
            setUmlVersion( UML_VERSION_EDEFAULT );
            return;
        case NsdPackage.TNS__VERSION:
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
        case NsdPackage.TNS__CHANGES:
            return changes != null;
        case NsdPackage.TNS__DEPENDS_ON:
            return dependsOn != null;
        case NsdPackage.TNS__BASIC_TYPES:
            return basicTypes != null;
        case NsdPackage.TNS__FUNCTIONAL_CONSTRAINTS:
            return functionalConstraints != null;
        case NsdPackage.TNS__PRESENCE_CONDITIONS:
            return presenceConditions != null;
        case NsdPackage.TNS__ABBREVIATIONS:
            return abbreviations != null;
        case NsdPackage.TNS__ENUMERATIONS:
            return enumerations != null;
        case NsdPackage.TNS__CONSTRUCTED_ATTRIBUTES:
            return constructedAttributes != null;
        case NsdPackage.TNS__CD_CS:
            return cDCs != null;
        case NsdPackage.TNS__LN_CLASSES:
            return lNClasses != null;
        case NsdPackage.TNS__DESC_ID:
            return DESC_ID_EDEFAULT == null ? descID != null : !DESC_ID_EDEFAULT.equals( descID );
        case NsdPackage.TNS__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals( id );
        case NsdPackage.TNS__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.TNS__RELEASE:
            return isSetRelease();
        case NsdPackage.TNS__REVISION:
            return isSetRevision();
        case NsdPackage.TNS__UML_DATE:
            return UML_DATE_EDEFAULT == null ? umlDate != null : !UML_DATE_EDEFAULT.equals( umlDate );
        case NsdPackage.TNS__UML_VERSION:
            return UML_VERSION_EDEFAULT == null ? umlVersion != null : !UML_VERSION_EDEFAULT.equals( umlVersion );
        case NsdPackage.TNS__VERSION:
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

} //TNSImpl
