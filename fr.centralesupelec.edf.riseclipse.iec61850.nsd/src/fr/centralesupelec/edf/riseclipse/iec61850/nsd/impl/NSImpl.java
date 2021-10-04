/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Abbreviations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgNSdesc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.AgUML;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.BasicTypes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.CDCs;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Changes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.ConstructedAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.DependsOn;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Doc;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.Enumerations;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.FunctionalConstraints;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.LNClasses;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NS;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.NsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PresenceConditions;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.PubStage;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsIdentification;
import fr.centralesupelec.edf.riseclipse.iec61850.nsd.util.NsdResourceSetImpl;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getPublicationStage <em>Publication Stage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getUmlDate <em>Uml Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getUmlVersion <em>Uml Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getDescID <em>Desc ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getRefersToDoc <em>Refers To Doc</em>}</li>
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.nsd.impl.NSImpl#getReferredByDependsOn <em>Referred By Depends On</em>}</li>
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
     * This is true if the Uml Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean umlDateESet;

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
     * This is true if the Uml Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean umlVersionESet;

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
     * This is true if the Desc ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descIDESet;

    /**
     * The cached value of the '{@link #getRefersToDoc() <em>Refers To Doc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDoc()
     * @generated
     * @ordered
     */
    protected Doc refersToDoc;

    /**
     * This is true if the Refers To Doc reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDocESet;

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
     * This is true if the Changes containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changesESet;

    /**
     * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependsOn()
     * @generated
     * @ordered
     */
    protected DependsOn dependsOn;

    /**
     * This is true if the Depends On containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dependsOnESet;

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
     * This is true if the Basic Types containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean basicTypesESet;

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
     * This is true if the Functional Constraints containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean functionalConstraintsESet;

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
     * This is true if the Presence Conditions containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean presenceConditionsESet;

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
     * This is true if the Abbreviations containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean abbreviationsESet;

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
     * This is true if the Enumerations containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enumerationsESet;

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
     * This is true if the Constructed Attributes containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean constructedAttributesESet;

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
     * This is true if the CD Cs containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cDCsESet;

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
     * This is true if the LN Classes containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lNClassesESet;

    /**
     * The cached value of the '{@link #getReferredByDependsOn() <em>Referred By Depends On</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByDependsOn()
     * @generated
     * @ordered
     */
    protected EList< DependsOn > referredByDependsOn;

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
        boolean oldChangesESet = changesESet;
        changesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CHANGES,
                    oldChanges, newChanges, !oldChangesESet );
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
            if( changes != null )
                msgs = ( ( InternalEObject ) changes ).eInverseRemove( this, NsdPackage.CHANGES__PARENT_NS,
                        Changes.class, msgs );
            if( newChanges != null )
                msgs = ( ( InternalEObject ) newChanges ).eInverseAdd( this, NsdPackage.CHANGES__PARENT_NS,
                        Changes.class, msgs );
            msgs = basicSetChanges( newChanges, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangesESet = changesESet;
            changesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CHANGES, newChanges, newChanges,
                        !oldChangesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChanges( NotificationChain msgs ) {
        Changes oldChanges = changes;
        changes = null;
        boolean oldChangesESet = changesESet;
        changesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__CHANGES,
                    oldChanges, null, oldChangesESet );
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
    public void unsetChanges() {
        if( changes != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changes ).eInverseRemove( this, NsdPackage.CHANGES__PARENT_NS, Changes.class,
                    msgs );
            msgs = basicUnsetChanges( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangesESet = changesESet;
            changesESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__CHANGES, null, null,
                        oldChangesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChanges() {
        return changesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DependsOn getDependsOn() {
        return dependsOn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDependsOn( DependsOn newDependsOn, NotificationChain msgs ) {
        DependsOn oldDependsOn = dependsOn;
        dependsOn = newDependsOn;
        boolean oldDependsOnESet = dependsOnESet;
        dependsOnESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__DEPENDS_ON,
                    oldDependsOn, newDependsOn, !oldDependsOnESet );
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
    public void setDependsOn( DependsOn newDependsOn ) {
        if( newDependsOn != dependsOn ) {
            NotificationChain msgs = null;
            if( dependsOn != null )
                msgs = ( ( InternalEObject ) dependsOn ).eInverseRemove( this, NsdPackage.DEPENDS_ON__PARENT_NS,
                        DependsOn.class, msgs );
            if( newDependsOn != null )
                msgs = ( ( InternalEObject ) newDependsOn ).eInverseAdd( this, NsdPackage.DEPENDS_ON__PARENT_NS,
                        DependsOn.class, msgs );
            msgs = basicSetDependsOn( newDependsOn, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDependsOnESet = dependsOnESet;
            dependsOnESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__DEPENDS_ON, newDependsOn,
                        newDependsOn, !oldDependsOnESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDependsOn( NotificationChain msgs ) {
        DependsOn oldDependsOn = dependsOn;
        dependsOn = null;
        boolean oldDependsOnESet = dependsOnESet;
        dependsOnESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__DEPENDS_ON,
                    oldDependsOn, null, oldDependsOnESet );
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
    public void unsetDependsOn() {
        if( dependsOn != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dependsOn ).eInverseRemove( this, NsdPackage.DEPENDS_ON__PARENT_NS,
                    DependsOn.class, msgs );
            msgs = basicUnsetDependsOn( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDependsOnESet = dependsOnESet;
            dependsOnESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__DEPENDS_ON, null, null,
                        oldDependsOnESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDependsOn() {
        return dependsOnESet;
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
        boolean oldBasicTypesESet = basicTypesESet;
        basicTypesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__BASIC_TYPES,
                    oldBasicTypes, newBasicTypes, !oldBasicTypesESet );
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
            if( basicTypes != null )
                msgs = ( ( InternalEObject ) basicTypes ).eInverseRemove( this, NsdPackage.BASIC_TYPES__PARENT_NS,
                        BasicTypes.class, msgs );
            if( newBasicTypes != null )
                msgs = ( ( InternalEObject ) newBasicTypes ).eInverseAdd( this, NsdPackage.BASIC_TYPES__PARENT_NS,
                        BasicTypes.class, msgs );
            msgs = basicSetBasicTypes( newBasicTypes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBasicTypesESet = basicTypesESet;
            basicTypesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__BASIC_TYPES, newBasicTypes,
                        newBasicTypes, !oldBasicTypesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBasicTypes( NotificationChain msgs ) {
        BasicTypes oldBasicTypes = basicTypes;
        basicTypes = null;
        boolean oldBasicTypesESet = basicTypesESet;
        basicTypesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__BASIC_TYPES, oldBasicTypes, null, oldBasicTypesESet );
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
    public void unsetBasicTypes() {
        if( basicTypes != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) basicTypes ).eInverseRemove( this, NsdPackage.BASIC_TYPES__PARENT_NS,
                    BasicTypes.class, msgs );
            msgs = basicUnsetBasicTypes( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBasicTypesESet = basicTypesESet;
            basicTypesESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__BASIC_TYPES, null, null,
                        oldBasicTypesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBasicTypes() {
        return basicTypesESet;
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
        boolean oldFunctionalConstraintsESet = functionalConstraintsESet;
        functionalConstraintsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, newFunctionalConstraints,
                    !oldFunctionalConstraintsESet );
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
                        NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS, FunctionalConstraints.class, msgs );
            if( newFunctionalConstraints != null )
                msgs = ( ( InternalEObject ) newFunctionalConstraints ).eInverseAdd( this,
                        NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS, FunctionalConstraints.class, msgs );
            msgs = basicSetFunctionalConstraints( newFunctionalConstraints, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFunctionalConstraintsESet = functionalConstraintsESet;
            functionalConstraintsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__FUNCTIONAL_CONSTRAINTS,
                        newFunctionalConstraints, newFunctionalConstraints, !oldFunctionalConstraintsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFunctionalConstraints( NotificationChain msgs ) {
        FunctionalConstraints oldFunctionalConstraints = functionalConstraints;
        functionalConstraints = null;
        boolean oldFunctionalConstraintsESet = functionalConstraintsESet;
        functionalConstraintsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, oldFunctionalConstraints, null,
                    oldFunctionalConstraintsESet );
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
    public void unsetFunctionalConstraints() {
        if( functionalConstraints != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) functionalConstraints ).eInverseRemove( this,
                    NsdPackage.FUNCTIONAL_CONSTRAINTS__PARENT_NS, FunctionalConstraints.class, msgs );
            msgs = basicUnsetFunctionalConstraints( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFunctionalConstraintsESet = functionalConstraintsESet;
            functionalConstraintsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, null,
                        null, oldFunctionalConstraintsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionalConstraints() {
        return functionalConstraintsESet;
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
        boolean oldPresenceConditionsESet = presenceConditionsESet;
        presenceConditionsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.NS__PRESENCE_CONDITIONS, oldPresenceConditions, newPresenceConditions,
                    !oldPresenceConditionsESet );
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
            if( presenceConditions != null )
                msgs = ( ( InternalEObject ) presenceConditions ).eInverseRemove( this,
                        NsdPackage.PRESENCE_CONDITIONS__PARENT_NS, PresenceConditions.class, msgs );
            if( newPresenceConditions != null )
                msgs = ( ( InternalEObject ) newPresenceConditions ).eInverseAdd( this,
                        NsdPackage.PRESENCE_CONDITIONS__PARENT_NS, PresenceConditions.class, msgs );
            msgs = basicSetPresenceConditions( newPresenceConditions, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPresenceConditionsESet = presenceConditionsESet;
            presenceConditionsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__PRESENCE_CONDITIONS,
                        newPresenceConditions, newPresenceConditions, !oldPresenceConditionsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPresenceConditions( NotificationChain msgs ) {
        PresenceConditions oldPresenceConditions = presenceConditions;
        presenceConditions = null;
        boolean oldPresenceConditionsESet = presenceConditionsESet;
        presenceConditionsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__PRESENCE_CONDITIONS, oldPresenceConditions, null, oldPresenceConditionsESet );
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
    public void unsetPresenceConditions() {
        if( presenceConditions != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) presenceConditions ).eInverseRemove( this,
                    NsdPackage.PRESENCE_CONDITIONS__PARENT_NS, PresenceConditions.class, msgs );
            msgs = basicUnsetPresenceConditions( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPresenceConditionsESet = presenceConditionsESet;
            presenceConditionsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__PRESENCE_CONDITIONS, null,
                        null, oldPresenceConditionsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPresenceConditions() {
        return presenceConditionsESet;
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
        boolean oldAbbreviationsESet = abbreviationsESet;
        abbreviationsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.NS__ABBREVIATIONS, oldAbbreviations, newAbbreviations, !oldAbbreviationsESet );
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
            if( abbreviations != null )
                msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this, NsdPackage.ABBREVIATIONS__PARENT_NS,
                        Abbreviations.class, msgs );
            if( newAbbreviations != null )
                msgs = ( ( InternalEObject ) newAbbreviations ).eInverseAdd( this, NsdPackage.ABBREVIATIONS__PARENT_NS,
                        Abbreviations.class, msgs );
            msgs = basicSetAbbreviations( newAbbreviations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAbbreviationsESet = abbreviationsESet;
            abbreviationsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__ABBREVIATIONS, newAbbreviations,
                        newAbbreviations, !oldAbbreviationsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAbbreviations( NotificationChain msgs ) {
        Abbreviations oldAbbreviations = abbreviations;
        abbreviations = null;
        boolean oldAbbreviationsESet = abbreviationsESet;
        abbreviationsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__ABBREVIATIONS, oldAbbreviations, null, oldAbbreviationsESet );
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
    public void unsetAbbreviations() {
        if( abbreviations != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this, NsdPackage.ABBREVIATIONS__PARENT_NS,
                    Abbreviations.class, msgs );
            msgs = basicUnsetAbbreviations( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAbbreviationsESet = abbreviationsESet;
            abbreviationsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__ABBREVIATIONS, null, null,
                        oldAbbreviationsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAbbreviations() {
        return abbreviationsESet;
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
        boolean oldEnumerationsESet = enumerationsESet;
        enumerationsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__ENUMERATIONS,
                    oldEnumerations, newEnumerations, !oldEnumerationsESet );
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
            if( enumerations != null )
                msgs = ( ( InternalEObject ) enumerations ).eInverseRemove( this, NsdPackage.ENUMERATIONS__PARENT_NS,
                        Enumerations.class, msgs );
            if( newEnumerations != null )
                msgs = ( ( InternalEObject ) newEnumerations ).eInverseAdd( this, NsdPackage.ENUMERATIONS__PARENT_NS,
                        Enumerations.class, msgs );
            msgs = basicSetEnumerations( newEnumerations, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnumerationsESet = enumerationsESet;
            enumerationsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__ENUMERATIONS, newEnumerations,
                        newEnumerations, !oldEnumerationsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnumerations( NotificationChain msgs ) {
        Enumerations oldEnumerations = enumerations;
        enumerations = null;
        boolean oldEnumerationsESet = enumerationsESet;
        enumerationsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__ENUMERATIONS, oldEnumerations, null, oldEnumerationsESet );
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
    public void unsetEnumerations() {
        if( enumerations != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) enumerations ).eInverseRemove( this, NsdPackage.ENUMERATIONS__PARENT_NS,
                    Enumerations.class, msgs );
            msgs = basicUnsetEnumerations( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnumerationsESet = enumerationsESet;
            enumerationsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__ENUMERATIONS, null, null,
                        oldEnumerationsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnumerations() {
        return enumerationsESet;
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
        boolean oldConstructedAttributesESet = constructedAttributesESet;
        constructedAttributesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, oldConstructedAttributes, newConstructedAttributes,
                    !oldConstructedAttributesESet );
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
            if( constructedAttributes != null )
                msgs = ( ( InternalEObject ) constructedAttributes ).eInverseRemove( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTES__PARENT_NS, ConstructedAttributes.class, msgs );
            if( newConstructedAttributes != null )
                msgs = ( ( InternalEObject ) newConstructedAttributes ).eInverseAdd( this,
                        NsdPackage.CONSTRUCTED_ATTRIBUTES__PARENT_NS, ConstructedAttributes.class, msgs );
            msgs = basicSetConstructedAttributes( newConstructedAttributes, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConstructedAttributesESet = constructedAttributesESet;
            constructedAttributesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CONSTRUCTED_ATTRIBUTES,
                        newConstructedAttributes, newConstructedAttributes, !oldConstructedAttributesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConstructedAttributes( NotificationChain msgs ) {
        ConstructedAttributes oldConstructedAttributes = constructedAttributes;
        constructedAttributes = null;
        boolean oldConstructedAttributesESet = constructedAttributesESet;
        constructedAttributesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, oldConstructedAttributes, null,
                    oldConstructedAttributesESet );
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
    public void unsetConstructedAttributes() {
        if( constructedAttributes != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) constructedAttributes ).eInverseRemove( this,
                    NsdPackage.CONSTRUCTED_ATTRIBUTES__PARENT_NS, ConstructedAttributes.class, msgs );
            msgs = basicUnsetConstructedAttributes( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConstructedAttributesESet = constructedAttributesESet;
            constructedAttributesESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, null,
                        null, oldConstructedAttributesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConstructedAttributes() {
        return constructedAttributesESet;
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
        boolean oldCDCsESet = cDCsESet;
        cDCsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CD_CS,
                    oldCDCs, newCDCs, !oldCDCsESet );
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
            if( cDCs != null )
                msgs = ( ( InternalEObject ) cDCs ).eInverseRemove( this, NsdPackage.CD_CS__PARENT_NS, CDCs.class,
                        msgs );
            if( newCDCs != null )
                msgs = ( ( InternalEObject ) newCDCs ).eInverseAdd( this, NsdPackage.CD_CS__PARENT_NS, CDCs.class,
                        msgs );
            msgs = basicSetCDCs( newCDCs, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCDCsESet = cDCsESet;
            cDCsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__CD_CS, newCDCs, newCDCs,
                        !oldCDCsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCDCs( NotificationChain msgs ) {
        CDCs oldCDCs = cDCs;
        cDCs = null;
        boolean oldCDCsESet = cDCsESet;
        cDCsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__CD_CS,
                    oldCDCs, null, oldCDCsESet );
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
    public void unsetCDCs() {
        if( cDCs != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cDCs ).eInverseRemove( this, NsdPackage.CD_CS__PARENT_NS, CDCs.class, msgs );
            msgs = basicUnsetCDCs( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCDCsESet = cDCsESet;
            cDCsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__CD_CS, null, null,
                        oldCDCsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCDCs() {
        return cDCsESet;
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
        boolean oldLNClassesESet = lNClassesESet;
        lNClassesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, NsdPackage.NS__LN_CLASSES,
                    oldLNClasses, newLNClasses, !oldLNClassesESet );
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
            if( lNClasses != null )
                msgs = ( ( InternalEObject ) lNClasses ).eInverseRemove( this, NsdPackage.LN_CLASSES__PARENT_NS,
                        LNClasses.class, msgs );
            if( newLNClasses != null )
                msgs = ( ( InternalEObject ) newLNClasses ).eInverseAdd( this, NsdPackage.LN_CLASSES__PARENT_NS,
                        LNClasses.class, msgs );
            msgs = basicSetLNClasses( newLNClasses, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLNClassesESet = lNClassesESet;
            lNClassesESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__LN_CLASSES, newLNClasses,
                        newLNClasses, !oldLNClassesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLNClasses( NotificationChain msgs ) {
        LNClasses oldLNClasses = lNClasses;
        lNClasses = null;
        boolean oldLNClassesESet = lNClassesESet;
        lNClassesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__LN_CLASSES,
                    oldLNClasses, null, oldLNClassesESet );
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
    public void unsetLNClasses() {
        if( lNClasses != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lNClasses ).eInverseRemove( this, NsdPackage.LN_CLASSES__PARENT_NS,
                    LNClasses.class, msgs );
            msgs = basicUnsetLNClasses( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLNClassesESet = lNClassesESet;
            lNClassesESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__LN_CLASSES, null, null,
                        oldLNClassesESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNClasses() {
        return lNClassesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DependsOn > getReferredByDependsOn() {
        if( referredByDependsOn == null ) {
            referredByDependsOn = new EObjectWithInverseEList.Unsettable< DependsOn >( DependsOn.class, this,
                    NsdPackage.NS__REFERRED_BY_DEPENDS_ON, NsdPackage.DEPENDS_ON__REFERS_TO_NS );
        }
        return referredByDependsOn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByDependsOn() {
        if( referredByDependsOn != null ) ( ( InternalEList.Unsettable< ? > ) referredByDependsOn ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByDependsOn() {
        return referredByDependsOn != null && ( ( InternalEList.Unsettable< ? > ) referredByDependsOn ).isSet();
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
        boolean oldDescIDESet = descIDESet;
        descIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__DESC_ID, oldDescID, descID,
                    !oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescID() {
        String oldDescID = descID;
        boolean oldDescIDESet = descIDESet;
        descID = DESC_ID_EDEFAULT;
        descIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__DESC_ID, oldDescID,
                    DESC_ID_EDEFAULT, oldDescIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescID() {
        return descIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Doc getRefersToDoc() {
        return refersToDoc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDoc( Doc newRefersToDoc, NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = newRefersToDoc;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    NsdPackage.NS__REFERS_TO_DOC, oldRefersToDoc, newRefersToDoc, !oldRefersToDocESet );
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
    public void setRefersToDoc( Doc newRefersToDoc ) {
        if( newRefersToDoc != refersToDoc ) {
            NotificationChain msgs = null;
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_AG_NS_DESC,
                        Doc.class, msgs );
            if( newRefersToDoc != null )
                msgs = ( ( InternalEObject ) newRefersToDoc ).eInverseAdd( this, NsdPackage.DOC__REFERRED_BY_AG_NS_DESC,
                        Doc.class, msgs );
            msgs = basicSetRefersToDoc( newRefersToDoc, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__REFERS_TO_DOC, newRefersToDoc,
                        newRefersToDoc, !oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDoc( NotificationChain msgs ) {
        Doc oldRefersToDoc = refersToDoc;
        refersToDoc = null;
        boolean oldRefersToDocESet = refersToDocESet;
        refersToDocESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    NsdPackage.NS__REFERS_TO_DOC, oldRefersToDoc, null, oldRefersToDocESet );
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
    public void unsetRefersToDoc() {
        if( refersToDoc != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_AG_NS_DESC,
                    Doc.class, msgs );
            msgs = basicUnsetRefersToDoc( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToDocESet = refersToDocESet;
            refersToDocESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__REFERS_TO_DOC, null, null,
                        oldRefersToDocESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDoc() {
        return refersToDocESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__ID, oldId, id, !oldIdESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__ID, oldId, ID_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__PUBLICATION_STAGE,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__RELEASE, oldRelease, release,
                    !oldReleaseESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__RELEASE, oldRelease,
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__REVISION, oldRevision, revision,
                    !oldRevisionESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__REVISION, oldRevision,
                    REVISION_EDEFAULT, oldRevisionESet ) );
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
        boolean oldUmlDateESet = umlDateESet;
        umlDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__UML_DATE, oldUmlDate, umlDate,
                    !oldUmlDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUmlDate() {
        XMLGregorianCalendar oldUmlDate = umlDate;
        boolean oldUmlDateESet = umlDateESet;
        umlDate = UML_DATE_EDEFAULT;
        umlDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__UML_DATE, oldUmlDate,
                    UML_DATE_EDEFAULT, oldUmlDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUmlDate() {
        return umlDateESet;
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
        boolean oldUmlVersionESet = umlVersionESet;
        umlVersionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__UML_VERSION, oldUmlVersion,
                    umlVersion, !oldUmlVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUmlVersion() {
        String oldUmlVersion = umlVersion;
        boolean oldUmlVersionESet = umlVersionESet;
        umlVersion = UML_VERSION_EDEFAULT;
        umlVersionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__UML_VERSION, oldUmlVersion,
                    UML_VERSION_EDEFAULT, oldUmlVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUmlVersion() {
        return umlVersionESet;
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
        case NsdPackage.NS__REFERS_TO_DOC:
            if( refersToDoc != null )
                msgs = ( ( InternalEObject ) refersToDoc ).eInverseRemove( this, NsdPackage.DOC__REFERRED_BY_AG_NS_DESC,
                        Doc.class, msgs );
            return basicSetRefersToDoc( ( Doc ) otherEnd, msgs );
        case NsdPackage.NS__CHANGES:
            if( changes != null )
                msgs = ( ( InternalEObject ) changes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CHANGES, null, msgs );
            return basicSetChanges( ( Changes ) otherEnd, msgs );
        case NsdPackage.NS__DEPENDS_ON:
            if( dependsOn != null )
                msgs = ( ( InternalEObject ) dependsOn ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__DEPENDS_ON, null, msgs );
            return basicSetDependsOn( ( DependsOn ) otherEnd, msgs );
        case NsdPackage.NS__BASIC_TYPES:
            if( basicTypes != null )
                msgs = ( ( InternalEObject ) basicTypes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__BASIC_TYPES, null, msgs );
            return basicSetBasicTypes( ( BasicTypes ) otherEnd, msgs );
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            if( functionalConstraints != null )
                msgs = ( ( InternalEObject ) functionalConstraints ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__FUNCTIONAL_CONSTRAINTS, null, msgs );
            return basicSetFunctionalConstraints( ( FunctionalConstraints ) otherEnd, msgs );
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            if( presenceConditions != null )
                msgs = ( ( InternalEObject ) presenceConditions ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__PRESENCE_CONDITIONS, null, msgs );
            return basicSetPresenceConditions( ( PresenceConditions ) otherEnd, msgs );
        case NsdPackage.NS__ABBREVIATIONS:
            if( abbreviations != null )
                msgs = ( ( InternalEObject ) abbreviations ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__ABBREVIATIONS, null, msgs );
            return basicSetAbbreviations( ( Abbreviations ) otherEnd, msgs );
        case NsdPackage.NS__ENUMERATIONS:
            if( enumerations != null )
                msgs = ( ( InternalEObject ) enumerations ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__ENUMERATIONS, null, msgs );
            return basicSetEnumerations( ( Enumerations ) otherEnd, msgs );
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            if( constructedAttributes != null )
                msgs = ( ( InternalEObject ) constructedAttributes ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CONSTRUCTED_ATTRIBUTES, null, msgs );
            return basicSetConstructedAttributes( ( ConstructedAttributes ) otherEnd, msgs );
        case NsdPackage.NS__CD_CS:
            if( cDCs != null )
                msgs = ( ( InternalEObject ) cDCs ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - NsdPackage.NS__CD_CS,
                        null, msgs );
            return basicSetCDCs( ( CDCs ) otherEnd, msgs );
        case NsdPackage.NS__LN_CLASSES:
            if( lNClasses != null )
                msgs = ( ( InternalEObject ) lNClasses ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - NsdPackage.NS__LN_CLASSES, null, msgs );
            return basicSetLNClasses( ( LNClasses ) otherEnd, msgs );
        case NsdPackage.NS__REFERRED_BY_DEPENDS_ON:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByDependsOn() )
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
            eNotify( new ENotificationImpl( this, Notification.SET, NsdPackage.NS__VERSION, oldVersion, version,
                    !oldVersionESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, NsdPackage.NS__VERSION, oldVersion,
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
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case NsdPackage.NS__REFERS_TO_DOC:
            return basicUnsetRefersToDoc( msgs );
        case NsdPackage.NS__CHANGES:
            return basicUnsetChanges( msgs );
        case NsdPackage.NS__DEPENDS_ON:
            return basicUnsetDependsOn( msgs );
        case NsdPackage.NS__BASIC_TYPES:
            return basicUnsetBasicTypes( msgs );
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            return basicUnsetFunctionalConstraints( msgs );
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            return basicUnsetPresenceConditions( msgs );
        case NsdPackage.NS__ABBREVIATIONS:
            return basicUnsetAbbreviations( msgs );
        case NsdPackage.NS__ENUMERATIONS:
            return basicUnsetEnumerations( msgs );
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            return basicUnsetConstructedAttributes( msgs );
        case NsdPackage.NS__CD_CS:
            return basicUnsetCDCs( msgs );
        case NsdPackage.NS__LN_CLASSES:
            return basicUnsetLNClasses( msgs );
        case NsdPackage.NS__REFERRED_BY_DEPENDS_ON:
            return ( ( InternalEList< ? > ) getReferredByDependsOn() ).basicRemove( otherEnd, msgs );
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
        case NsdPackage.NS__ID:
            return getId();
        case NsdPackage.NS__REVISION:
            return getRevision();
        case NsdPackage.NS__PUBLICATION_STAGE:
            return getPublicationStage();
        case NsdPackage.NS__UML_DATE:
            return getUmlDate();
        case NsdPackage.NS__UML_VERSION:
            return getUmlVersion();
        case NsdPackage.NS__DESC_ID:
            return getDescID();
        case NsdPackage.NS__REFERS_TO_DOC:
            return getRefersToDoc();
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
        case NsdPackage.NS__REFERRED_BY_DEPENDS_ON:
            return getReferredByDependsOn();
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
        case NsdPackage.NS__RELEASE:
            setRelease( ( Integer ) newValue );
            return;
        case NsdPackage.NS__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case NsdPackage.NS__ID:
            setId( ( String ) newValue );
            return;
        case NsdPackage.NS__REVISION:
            setRevision( ( String ) newValue );
            return;
        case NsdPackage.NS__PUBLICATION_STAGE:
            setPublicationStage( ( PubStage ) newValue );
            return;
        case NsdPackage.NS__UML_DATE:
            setUmlDate( ( XMLGregorianCalendar ) newValue );
            return;
        case NsdPackage.NS__UML_VERSION:
            setUmlVersion( ( String ) newValue );
            return;
        case NsdPackage.NS__DESC_ID:
            setDescID( ( String ) newValue );
            return;
        case NsdPackage.NS__REFERS_TO_DOC:
            setRefersToDoc( ( Doc ) newValue );
            return;
        case NsdPackage.NS__CHANGES:
            setChanges( ( Changes ) newValue );
            return;
        case NsdPackage.NS__DEPENDS_ON:
            setDependsOn( ( DependsOn ) newValue );
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
        case NsdPackage.NS__REFERRED_BY_DEPENDS_ON:
            getReferredByDependsOn().clear();
            getReferredByDependsOn().addAll( ( Collection< ? extends DependsOn > ) newValue );
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
        case NsdPackage.NS__ID:
            unsetId();
            return;
        case NsdPackage.NS__REVISION:
            unsetRevision();
            return;
        case NsdPackage.NS__PUBLICATION_STAGE:
            unsetPublicationStage();
            return;
        case NsdPackage.NS__UML_DATE:
            unsetUmlDate();
            return;
        case NsdPackage.NS__UML_VERSION:
            unsetUmlVersion();
            return;
        case NsdPackage.NS__DESC_ID:
            unsetDescID();
            return;
        case NsdPackage.NS__REFERS_TO_DOC:
            unsetRefersToDoc();
            return;
        case NsdPackage.NS__CHANGES:
            unsetChanges();
            return;
        case NsdPackage.NS__DEPENDS_ON:
            unsetDependsOn();
            return;
        case NsdPackage.NS__BASIC_TYPES:
            unsetBasicTypes();
            return;
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            unsetFunctionalConstraints();
            return;
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            unsetPresenceConditions();
            return;
        case NsdPackage.NS__ABBREVIATIONS:
            unsetAbbreviations();
            return;
        case NsdPackage.NS__ENUMERATIONS:
            unsetEnumerations();
            return;
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            unsetConstructedAttributes();
            return;
        case NsdPackage.NS__CD_CS:
            unsetCDCs();
            return;
        case NsdPackage.NS__LN_CLASSES:
            unsetLNClasses();
            return;
        case NsdPackage.NS__REFERRED_BY_DEPENDS_ON:
            unsetReferredByDependsOn();
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
        case NsdPackage.NS__ID:
            return isSetId();
        case NsdPackage.NS__REVISION:
            return isSetRevision();
        case NsdPackage.NS__PUBLICATION_STAGE:
            return isSetPublicationStage();
        case NsdPackage.NS__UML_DATE:
            return isSetUmlDate();
        case NsdPackage.NS__UML_VERSION:
            return isSetUmlVersion();
        case NsdPackage.NS__DESC_ID:
            return isSetDescID();
        case NsdPackage.NS__REFERS_TO_DOC:
            return isSetRefersToDoc();
        case NsdPackage.NS__CHANGES:
            return isSetChanges();
        case NsdPackage.NS__DEPENDS_ON:
            return isSetDependsOn();
        case NsdPackage.NS__BASIC_TYPES:
            return isSetBasicTypes();
        case NsdPackage.NS__FUNCTIONAL_CONSTRAINTS:
            return isSetFunctionalConstraints();
        case NsdPackage.NS__PRESENCE_CONDITIONS:
            return isSetPresenceConditions();
        case NsdPackage.NS__ABBREVIATIONS:
            return isSetAbbreviations();
        case NsdPackage.NS__ENUMERATIONS:
            return isSetEnumerations();
        case NsdPackage.NS__CONSTRUCTED_ATTRIBUTES:
            return isSetConstructedAttributes();
        case NsdPackage.NS__CD_CS:
            return isSetCDCs();
        case NsdPackage.NS__LN_CLASSES:
            return isSetLNClasses();
        case NsdPackage.NS__REFERRED_BY_DEPENDS_ON:
            return isSetReferredByDependsOn();
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
            case NsdPackage.NS__RELEASE:
                return NsdPackage.AG_NS_IDENTIFICATION__RELEASE;
            case NsdPackage.NS__VERSION:
                return NsdPackage.AG_NS_IDENTIFICATION__VERSION;
            case NsdPackage.NS__ID:
                return NsdPackage.AG_NS_IDENTIFICATION__ID;
            case NsdPackage.NS__REVISION:
                return NsdPackage.AG_NS_IDENTIFICATION__REVISION;
            case NsdPackage.NS__PUBLICATION_STAGE:
                return NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.NS__UML_DATE:
                return NsdPackage.AG_UML__UML_DATE;
            case NsdPackage.NS__UML_VERSION:
                return NsdPackage.AG_UML__UML_VERSION;
            default:
                return -1;
            }
        }
        if( baseClass == AgNSdesc.class ) {
            switch( derivedFeatureID ) {
            case NsdPackage.NS__DESC_ID:
                return NsdPackage.AG_NSDESC__DESC_ID;
            case NsdPackage.NS__REFERS_TO_DOC:
                return NsdPackage.AG_NSDESC__REFERS_TO_DOC;
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
                return NsdPackage.NS__RELEASE;
            case NsdPackage.AG_NS_IDENTIFICATION__VERSION:
                return NsdPackage.NS__VERSION;
            case NsdPackage.AG_NS_IDENTIFICATION__ID:
                return NsdPackage.NS__ID;
            case NsdPackage.AG_NS_IDENTIFICATION__REVISION:
                return NsdPackage.NS__REVISION;
            case NsdPackage.AG_NS_IDENTIFICATION__PUBLICATION_STAGE:
                return NsdPackage.NS__PUBLICATION_STAGE;
            default:
                return -1;
            }
        }
        if( baseClass == AgUML.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_UML__UML_DATE:
                return NsdPackage.NS__UML_DATE;
            case NsdPackage.AG_UML__UML_VERSION:
                return NsdPackage.NS__UML_VERSION;
            default:
                return -1;
            }
        }
        if( baseClass == AgNSdesc.class ) {
            switch( baseFeatureID ) {
            case NsdPackage.AG_NSDESC__DESC_ID:
                return NsdPackage.NS__DESC_ID;
            case NsdPackage.AG_NSDESC__REFERS_TO_DOC:
                return NsdPackage.NS__REFERS_TO_DOC;
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
        result.append( ", umlDate: " );
        if( umlDateESet )
            result.append( umlDate );
        else
            result.append( "<unset>" );
        result.append( ", umlVersion: " );
        if( umlVersionESet )
            result.append( umlVersion );
        else
            result.append( "<unset>" );
        result.append( ", descID: " );
        if( descIDESet )
            result.append( descID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public boolean buildExplicitLinks( IRiseClipseConsole console ) {
        if( super.buildExplicitLinks( console )) return true;

        if( isSetDescID() ) {
            if( this.eResource().getResourceSet() instanceof NsdResourceSetImpl ) {
                Doc doc = ( ( NsdResourceSetImpl ) this.eResource().getResourceSet() )
                        .findDoc( new NsIdentification( this ), getDescID() );
                if( doc != null ) setRefersToDoc( doc );
            }
        }

        return false;
    }

    public NsIdentification getNsIdentification() {
        return new NsIdentification( getId(), getVersion(), getRevision(), getRelease() );
    }

} //NSImpl
